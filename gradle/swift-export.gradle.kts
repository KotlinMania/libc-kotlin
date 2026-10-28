@file:OptIn(
    org.jetbrains.kotlin.gradle.swiftexport.ExperimentalSwiftExportDsl::class,
)

import io.github.kotlinmania.build.BuildToolTask
import io.github.kotlinmania.build.SwiftManifestEnforcer
import org.gradle.api.Action
import org.gradle.api.GradleException
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.support.serviceOf
import org.gradle.process.ExecOperations
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.swiftexport.SwiftExportExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.swiftexport.SwiftExportedModuleMetadata
import java.io.ByteArrayOutputStream

// ============================================================================
// Swift Export Configuration & Smoke Testing (gradle/swift-export.gradle.kts)
// ----------------------------------------------------------------------------
// Drives `swiftExport {}` from gradle.properties and verifies both Debug and
// Release Swift Export SPM packages + static libraries (`swift test -c debug`
// and `swift test -c release`).
//
// Kotlin 2.4.x (2.4.21) vs. Kotlin 2.5.0 (`Kotlin/swift-export-sample`) Findings:
//
// 1. DSL Entry Point & Integrations:
//    - In KGP 2.4.21, Swift Export is configured via `kotlin { swiftExport {} }`
//      (`org.jetbrains.kotlin.gradle.plugin.mpp.apple.swiftexport.SwiftExportExtension`,
//      which implements `SwiftExportedModuleMetadata`) and automatically registers
//      `:embedSwiftExportForXcode` (plus `:generateSPMPackage` / `:buildSPMPackage`).
//    - In KGP 2.5.0+, `swiftExport {}` is deprecated in favor of:
//        kotlin {
//            export {
//                swift {
//                    moduleName = "..."
//                    rootPackage = "..."
//                    xcodeIntegration { reconfigureDependencies() }
//                    swiftPackageIntegration {
//                        reconfigureDependencies()
//                        outputDirectory = layout.projectDirectory.dir("SwiftPackage")
//                    }
//                }
//            }
//        }
//      where `xcodeIntegration {}` registers `:embedSwiftExportForXcode` and
//      `swiftPackageIntegration {}` registers `:exportDebugSwiftPackage` /
//      `:exportReleaseSwiftPackage`.
//
// 2. Package Collapsing (`rootPackage` vs. `flattenPackage` vs. `"packageRoot"`):
//    - Inside `swift-export-embeddable` (`SwiftModuleConfig.kt`), the internal
//      constant is `SwiftModuleConfig.ROOT_PACKAGE = "packageRoot"` and the
//      constructor parameter is `rootPackage: String?` (parsed into
//      `targetPackageFqName: FqName?` via `rootPackageToFqn`).
//    - In KGP 2.4.21, `SwiftExportedModuleMetadata` names this Gradle property
//      `flattenPackage: Property<String>`, and `SwiftExportAction.kt` forwards it
//      as `SwiftModuleConfig(rootPackage = flattenPackage, ...)`.
//    - In KGP 2.5.0, the Gradle DSL property was renamed from `flattenPackage`
//      to `rootPackage`.
//    - We alias `SwiftExportedModuleMetadata.rootPackage` to `flattenPackage`
//      below and read `project.swiftExport.rootPackage` (falling back to
//      `project.swiftExport.flattenPackage`, then `project.namespace`) so both
//      `build.gradle.kts` and `gradle.properties` use the 2.5.0 `rootPackage`
//      terminology today.
//
// 3. Why `:macosArm64DebugSwiftExport` Logs `No name for 'packageRoot' and will be ignored`:
//    - In KGP 2.4.21's `SetupSwiftExportDSL.kt` (`collectModules`), every klib on
//      the Swift Export classpath is classified into one of two buckets:
//      (a) Explicitly exported dependencies (`swiftExport { export(dep) { ... } }`)
//          -> `createFullyExportedSwiftExportedModule(moduleName, flattenPackage, file)`
//          (`shouldBeFullyExported = true`).
//      (b) Remaining transitive/implementation dependencies
//          -> `createTransitiveSwiftExportedModule(moduleName, file)` with
//          `flattenPackage = null` and `shouldBeFullyExported = false` (exporting
//          only declarations referenced by the root module's public signatures).
//    - In `swift-export-embeddable` (`PatchConfigAndLogIssuesKt.patchConfigAndLogIssues`),
//      the standalone exporter loops over all `KlibInputModule`s and logs
//      `Warning: No name for 'packageRoot' and will be ignored` whenever
//      `module.config.targetPackageFqName == null` (`flattenPackage == null`),
//      even when `shouldBeFullyExported == false`.
//    - Therefore, any `commonMain` dependency not listed in `project.swiftExport.exports`
//      (including an unused placeholder bundle in `libs.versions.toml`) causes KGP
//      to pass a transitive module with `flattenPackage = null` and emit that warning.
//      Keeping `project.dependencies.commonMainBundle` empty on zero-dependency
//      crates (like `libc-kotlin`) avoids registering phantom transitive modules.
//
// 4. Dependency Visibility (`EXPOSED` vs. `HIDDEN`):
//    - KGP 2.5.0 introduces `SwiftExportVisibility.EXPOSED` (export whole dependency
//      module) and `SwiftExportVisibility.HIDDEN` (suppress dependency module; types
//      referenced in public signatures become empty Swift stubs).
//    - Our `project.swiftExport.exports` (`<dep>|<ModuleName>|<rootPackage>[|<EXPOSED|HIDDEN>]`),
//      `project.swiftExport.exportApiBundle`, and `project.swiftExport.hidden`
//      properties capture these exact semantics in `gradle.properties` now so that
//      migrating to KGP 2.5.0 requires updating only this script.
// ============================================================================

fun csvProperty(name: String): Set<String> =
    providers
        .gradleProperty(name)
        .map { value ->
            value
                .split(",")
                .map { it.trim() }
                .filter { it.isNotEmpty() }
                .toSet()
        }.getOrElse(emptySet())

fun optionalTrimmedProperty(name: String): String? =
    providers
        .gradleProperty(name)
        .map { it.trim() }
        .orNull
        ?.takeIf { it.isNotEmpty() }

fun boolProperty(name: String, default: Boolean = false): Boolean =
    providers.gradleProperty(name).map { it.trim().lowercase() == "true" }.getOrElse(default)

val frameworkName = providers.gradleProperty("project.frameworkName").getOrElse("Unnamed")
val projectNamespace = providers.gradleProperty("project.namespace").getOrElse("io.github.kotlinmania")
val versionCatalog =
    extensions
        .getByType(VersionCatalogsExtension::class.java)
        .named("libs")
val commonMainApiDependencyBundle =
    optionalTrimmedProperty("project.dependencies.commonMainApiBundle")
        ?.let { bundleName ->
            versionCatalog
                .findBundle(bundleName)
                .orElseThrow { GradleException("Missing public API bundle '$bundleName'") }
        }

val swiftExportModuleName = optionalTrimmedProperty("project.swiftExport.moduleName") ?: frameworkName
val swiftExportRootPackage =
    optionalTrimmedProperty("project.swiftExport.rootPackage")
        ?: optionalTrimmedProperty("project.swiftExport.flattenPackage")
        ?: projectNamespace

// Alias 2.5.0's `rootPackage` property onto 2.4.21's `SwiftExportedModuleMetadata.flattenPackage`.
val SwiftExportedModuleMetadata.rootPackage: org.gradle.api.provider.Property<String>
    get() = flattenPackage

val swiftExportEnableCoroutinesSupport =
    providers
        .gradleProperty("project.swiftExport.enableCoroutinesSupport")
        .getOrElse("true")
        .trim()
val swiftExportSettings =
    providers
        .gradlePropertiesPrefixedBy("project.swiftExport.settings.")
        .getOrElse(emptyMap())
val swiftExportFreeCompilerArgs = csvProperty("project.swiftExport.freeCompilerArgs")
val swiftExportLinkFreeCompilerArgs = csvProperty("project.swiftExport.linkTask.freeCompilerArgs")
val swiftExportExportApiBundle = boolProperty("project.swiftExport.exportApiBundle", false)
val swiftExportHiddenDependencies = csvProperty("project.swiftExport.hidden")

enum class SwiftExportModuleVisibility {
    EXPOSED,
    HIDDEN,
}

data class SwiftExportModuleSpec(
    val key: String,
    val dependency: Any,
    val moduleName: String,
    val rootPackage: String,
    val visibility: SwiftExportModuleVisibility,
)

fun deriveSwiftModuleName(rawName: String): String =
    rawName
        .removePrefix(":")
        .substringAfterLast(":")
        .removeSuffix("-kotlin")
        .split('-', '_', '.')
        .filter { it.isNotEmpty() }
        .joinToString("") { part -> part.replaceFirstChar { it.uppercase() } }

fun parseSwiftExportModuleSpec(rawEntry: String): SwiftExportModuleSpec {
    val parts = rawEntry.split("|").map { it.trim() }
    val rawDep = parts.firstOrNull().orEmpty()
    if (rawDep.isEmpty()) {
        throw GradleException("Malformed project.swiftExport.exports entry: '$rawEntry'")
    }
    val resolvedDep: Any =
        when {
            rawDep.startsWith(":") -> project(rawDep)
            ":" in rawDep -> rawDep
            else ->
                versionCatalog
                    .findLibrary(rawDep)
                    .orElseThrow {
                        GradleException(
                            "Unknown Swift Export library alias '$rawDep' in libs.versions.toml " +
                                "(use a catalog alias, 'group:artifact:version', or ':subproject')",
                        )
                    }.get()
        }
    val explicitVisibility =
        when (val rawVis = parts.getOrNull(3)?.uppercase().orEmpty()) {
            "", "EXPOSED" -> SwiftExportModuleVisibility.EXPOSED
            "HIDDEN" -> SwiftExportModuleVisibility.HIDDEN
            else -> throw GradleException("Unknown Swift Export visibility '$rawVis' in '$rawEntry' (expected EXPOSED or HIDDEN)")
        }
    val visibility =
        if (rawDep in swiftExportHiddenDependencies) {
            SwiftExportModuleVisibility.HIDDEN
        } else {
            explicitVisibility
        }
    val moduleName = parts.getOrNull(1)?.takeIf { it.isNotEmpty() } ?: deriveSwiftModuleName(rawDep)
    return SwiftExportModuleSpec(
        key = rawDep,
        dependency = resolvedDep,
        moduleName = moduleName,
        rootPackage = parts.getOrNull(2).orEmpty(),
        visibility = visibility,
    )
}

val swiftExportModuleExports: List<SwiftExportModuleSpec> =
    buildList {
        val explicitSpecs = LinkedHashMap<String, SwiftExportModuleSpec>()
        csvProperty("project.swiftExport.exports").forEach { entry ->
            val spec = parseSwiftExportModuleSpec(entry)
            explicitSpecs[spec.key] = spec
        }
        providers
            .gradlePropertiesPrefixedBy("project.swiftExport.export.")
            .getOrElse(emptyMap())
            .toSortedMap()
            .forEach { (_, entry) ->
                val trimmed = entry.trim()
                if (trimmed.isNotEmpty()) {
                    val spec = parseSwiftExportModuleSpec(trimmed)
                    explicitSpecs[spec.key] = spec
                }
            }
        if (swiftExportExportApiBundle && commonMainApiDependencyBundle != null) {
            commonMainApiDependencyBundle.get().forEach { dep ->
                val coordKey = "${dep.module.group}:${dep.module.name}"
                val artifactKey = dep.module.name
                if (coordKey !in explicitSpecs && artifactKey !in explicitSpecs) {
                    val isHidden = coordKey in swiftExportHiddenDependencies || artifactKey in swiftExportHiddenDependencies
                    val derivedModule = deriveSwiftModuleName(artifactKey)
                    val derivedPackage = "${dep.module.group}.${artifactKey.removeSuffix("-kotlin").replace("-", "").replace("_", "")}"
                    explicitSpecs[coordKey] =
                        SwiftExportModuleSpec(
                            key = coordKey,
                            dependency = dep,
                            moduleName = derivedModule,
                            rootPackage = derivedPackage,
                            visibility = if (isHidden) SwiftExportModuleVisibility.HIDDEN else SwiftExportModuleVisibility.EXPOSED,
                        )
                }
            }
        }
        addAll(explicitSpecs.values)
    }

val projectDependencyHandler = project.dependencies
configurations.configureEach {
    if (name == "swiftExportClasspath") {
        // KotlinMania patched exporter: emits `internal import` instead of
        // `@_implementationOnly import` (Xcode 26.5 flags the latter as
        // [#ImplementationOnlyDeprecated] under the strict-warning gate) and
        // repairs the bundled KotlinRuntimeSupport/CoroutineSupport sources.
        dependencies.add(projectDependencyHandler.create("io.github.kotlinmania:swift-export-embeddable:2.4.20-km.4"))
    }
}

val kotlin = extensions.getByType<KotlinMultiplatformExtension>()
kotlin.extensions.configure<SwiftExportExtension>("swiftExport") {
    moduleName = swiftExportModuleName
    rootPackage = swiftExportRootPackage
    configure {
        settings.put("enableCoroutinesSupport", swiftExportEnableCoroutinesSupport)
        swiftExportSettings.forEach { (key, value) ->
            settings.put(key, value)
        }
        if (swiftExportFreeCompilerArgs.isNotEmpty()) {
            freeCompilerArgs.addAll(swiftExportFreeCompilerArgs)
        }
    }
    linkTask {
        if (swiftExportLinkFreeCompilerArgs.isNotEmpty()) {
            toolOptions.freeCompilerArgs.addAll(swiftExportLinkFreeCompilerArgs)
        }
    }
    swiftExportModuleExports
        .filter { it.visibility == SwiftExportModuleVisibility.EXPOSED }
        .forEach { exported ->
            export(exported.dependency) {
                if (exported.moduleName.isNotEmpty()) {
                    moduleName = exported.moduleName
                }
                if (exported.rootPackage.isNotEmpty()) {
                    rootPackage = exported.rootPackage
                }
            }
        }
}

tasks
    .withType<org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile>()
    .matching { it.name.startsWith("compileSwiftExportMain") }
    .configureEach {
        // KGP's generated SPBridge files (KotlinStdlib.kt, <Module>.kt) emit
        // type-erased generic casts without @Suppress("UNCHECKED_CAST").
        // Disable UNCHECKED_CAST on KGP's generated bridge while keeping
        // allWarningsAsErrors = true for all other diagnostics.
        compilerOptions.freeCompilerArgs.add("-Xwarning-level=UNCHECKED_CAST:disabled")
    }

// KGP 2.4.21's SwiftExportTask calls `workerExecutor.processIsolation { workerSpec -> ... }`
// without setting `workerSpec.forkOptions.maxHeapSize`, so Gradle spawns the isolated
// `Gradle Worker Daemon` with its 512 MB default (`-Xmx512m`). Exporting large crates
// (such as `libc-kotlin`, whose generated `Libc.swift` is ~24 MB) exhausts the 512 MB
// worker heap inside the Kotlin Analysis API / IntelliJ standalone platform, causing
// `SocketConnection.dispatch` to throw `OutOfMemoryError: Java heap space` when sending
// `ResponseProtocol.completed(DefaultWorkResult)` back to the parent Gradle daemon and
// deadlocking both processes indefinitely. Wrapping `SwiftExportTask.workerExecutor` to
// set `forkOptions.maxHeapSize` (configurable via `project.swiftExport.workerMaxHeapSize`,
// default `4g`) prevents the worker OOM and hang.
val swiftExportWorkerMaxHeapSize =
    providers.gradleProperty("project.swiftExport.workerMaxHeapSize").getOrElse("4g")
tasks
    .matching {
        it.javaClass.name.startsWith(
            "org.jetbrains.kotlin.gradle.plugin.mpp.apple.swiftexport.tasks.SwiftExportTask",
        )
    }.configureEach {
        doFirst {
            val field =
                generateSequence<Class<*>>(javaClass) { it.superclass }
                    .firstNotNullOfOrNull { cls ->
                        cls.declaredFields.firstOrNull { it.name == "workerExecutor" }
                    }
            if (field != null) {
                field.isAccessible = true
                val delegate = field.get(this) as? org.gradle.workers.WorkerExecutor
                if (delegate != null) {
                    field.set(
                        this,
                        object : org.gradle.workers.WorkerExecutor by delegate {
                            override fun processIsolation(): org.gradle.workers.WorkQueue =
                                delegate.processIsolation {
                                    if (forkOptions.maxHeapSize.isNullOrBlank()) {
                                        forkOptions.maxHeapSize = swiftExportWorkerMaxHeapSize
                                    }
                                }

                            override fun processIsolation(
                                action: Action<in org.gradle.workers.ProcessWorkerSpec>,
                            ): org.gradle.workers.WorkQueue =
                                delegate.processIsolation {
                                    if (forkOptions.maxHeapSize.isNullOrBlank()) {
                                        forkOptions.maxHeapSize = swiftExportWorkerMaxHeapSize
                                    }
                                    action.execute(this)
                                }
                        },
                    )
                }
            }
        }
    }

val strictSwiftConfiguration = rootProject.layout.projectDirectory.file("verification/strict-swift.xcconfig")
tasks.matching { it.name.endsWith("generateSPMPackage", ignoreCase = true) }.configureEach {
    doLast {
        val manifests =
            layout.buildDirectory
                .dir("SPMPackage")
                .get()
                .asFile
                .walkTopDown()
                .filter { it.isFile && it.name == "Package.swift" }
                .toList()
        check(manifests.isNotEmpty()) { "No generated Swift package manifests" }
        manifests.forEach { manifest ->
            BuildToolTask.invoke(
                SwiftManifestEnforcer::class.java.name,
                manifest.absolutePath,
                "--receipt",
                manifest.parentFile.resolve("swift5-manifest-receipt.json").absolutePath,
            )
        }
    }
}
tasks.matching { it.name.endsWith("buildSPMPackage", ignoreCase = true) }.configureEach {
    inputs.file(strictSwiftConfiguration)
    doFirst {
        val actual = providers.environmentVariable("XCODE_XCCONFIG_FILE").orNull
        check(actual != null && file(actual).canonicalFile == strictSwiftConfiguration.asFile.canonicalFile) {
            "Set XCODE_XCCONFIG_FILE=${strictSwiftConfiguration.asFile} for strict Swift 5 dependency compilation"
        }
    }
}

// Swift Export smoke test — produces both Debug and Release SPM packages and
// static libraries via `:library:embedSwiftExportForXcode` and runs `swift test`
// in both `debug` (`-c debug`) and `release` (`-c release`) configurations.
tasks.register("swiftExportSmokeTest") {
    group = "verification"
    description = "Builds Debug and Release Swift Export SPM packages and runs swift test in both configurations."
    outputs.upToDateWhen { false }

    doLast {
        val execOperations = serviceOf<ExecOperations>()
        val swiftBuildRoot =
            layout.buildDirectory
                .dir("swift-test")
                .get()
                .asFile
        if (swiftBuildRoot.exists()) {
            swiftBuildRoot.deleteRecursively()
        }
        swiftBuildRoot.mkdirs()
        val spmPackageDir =
            layout.buildDirectory
                .dir("SPMPackage")
                .get()
                .asFile
        if (spmPackageDir.exists()) {
            spmPackageDir.deleteRecursively()
        }

        val configurations = listOf("Debug" to "debug", "Release" to "release")

        for ((xcodeConfig, _) in configurations) {
            val configBuildDir = swiftBuildRoot.resolve(xcodeConfig).apply { mkdirs() }
            execOperations
                .exec {
                    workingDir = rootProject.projectDir
                    val exportCommand =
                        mutableListOf(
                            rootProject.file("gradlew").absolutePath,
                            "${project.path}:embedSwiftExportForXcode",
                            "--no-configuration-cache",
                            "--no-daemon",
                            "--console=plain",
                            "--max-workers=${gradle.startParameter.maxWorkerCount}",
                        )
                    if (gradle.startParameter.isOffline) exportCommand += "--offline"
                    gradle.startParameter.projectProperties.forEach { (key, value) -> exportCommand += "-P$key=$value" }
                    gradle.startParameter.systemPropertiesArgs["maven.repo.local"]?.let { exportCommand += "-Dmaven.repo.local=$it" }
                    commandLine(exportCommand)
                    environment(
                        mapOf(
                            "BUILT_PRODUCTS_DIR" to configBuildDir.absolutePath,
                            "TARGET_BUILD_DIR" to configBuildDir.absolutePath,
                            "SDK_NAME" to "macosx",
                            "CONFIGURATION" to xcodeConfig,
                            "ARCHS" to "arm64",
                            "FRAMEWORKS_FOLDER_PATH" to "Frameworks",
                            "MACOSX_DEPLOYMENT_TARGET" to "15.0",
                            "DEPLOYMENT_TARGET_SETTING_NAME" to "MACOSX_DEPLOYMENT_TARGET",
                            "XCODE_XCCONFIG_FILE" to strictSwiftConfiguration.asFile.absolutePath,
                        ),
                    )
                }.assertNormalExitValue()

            val expectedManifest = spmPackageDir.resolve("macosArm64/$xcodeConfig/Package.swift")
            check(expectedManifest.isFile) {
                "Missing generated $xcodeConfig Swift Export Package.swift at $expectedManifest"
            }
            val expectedStaticLib = configBuildDir.resolve("lib$swiftExportModuleName.a")
            check(expectedStaticLib.isFile && expectedStaticLib.length() > 0L) {
                "Missing generated $xcodeConfig Swift Export static library at $expectedStaticLib"
            }
        }

        val developerDir =
            ByteArrayOutputStream().use { out ->
                execOperations
                    .exec {
                        commandLine("xcode-select", "-p")
                        standardOutput = out
                    }.assertNormalExitValue()
                out.toString().trim()
            }

        val harnessDir = layout.projectDirectory.dir("swift-test-harness").asFile

        for ((xcodeConfig, swiftConfig) in configurations) {
            execOperations
                .exec {
                    workingDir = harnessDir
                    commandLine("swift", "package", "reset")
                    environment("SWIFT_EXPORT_CONFIGURATION", xcodeConfig)
                    environment("CONFIGURATION", xcodeConfig)
                }.assertNormalExitValue()

            val swiftTestCommand =
                mutableListOf(
                    "swift",
                    "test",
                    "-c",
                    swiftConfig,
                    "-v",
                    "-Xswiftc",
                    "-warnings-as-errors",
                    "-Xswiftc",
                    "-target",
                    "-Xswiftc",
                    "arm64-apple-macosx15.0",
                )
            if (developerDir.endsWith("CommandLineTools")) {
                val frameworks = "$developerDir/Library/Developer/Frameworks"
                swiftTestCommand +=
                    listOf(
                        "-Xswiftc",
                        "-F",
                        "-Xswiftc",
                        frameworks,
                        "-Xlinker",
                        "-F",
                        "-Xlinker",
                        frameworks,
                        "-Xlinker",
                        "-rpath",
                        "-Xlinker",
                        frameworks,
                        "-Xlinker",
                        "-rpath",
                        "-Xlinker",
                        "$developerDir/Library/Developer/usr/lib",
                    )
            }
            val swiftTestOutput = ByteArrayOutputStream()
            val swiftTestResult =
                execOperations.exec {
                    workingDir = harnessDir
                    commandLine(swiftTestCommand)
                    environment("SWIFT_EXPORT_CONFIGURATION", xcodeConfig)
                    environment("CONFIGURATION", xcodeConfig)
                    standardOutput = swiftTestOutput
                    errorOutput = swiftTestOutput
                    isIgnoreExitValue = true
                }
            val swiftTestLog = swiftTestOutput.toString()
            println(swiftTestLog)
            swiftTestResult.assertNormalExitValue()
            if (!swiftTestLog.contains(Regex("""Test run with [1-9]\d* tests?"""))) {
                throw GradleException("swift test (-c $swiftConfig) ran no Swift Testing tests (toolchain: $developerDir)")
            }
        }
    }
}
