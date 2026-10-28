@file:OptIn(
    org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class,
    org.jetbrains.kotlin.gradle.swiftexport.ExperimentalSwiftExportDsl::class,
)

import io.github.kotlinmania.build.FfiBuildSupport
import io.github.kotlinmania.build.SwiftExportSupport
import org.gradle.api.GradleException
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.swiftexport.SwiftExportExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.swiftexport.SwiftExportedModuleMetadata
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile

val versionCatalog =
    rootProject.extensions
        .getByType(VersionCatalogsExtension::class.java)
        .named("libs")

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
val nativeFfiEnabled = boolProperty("project.ffi.native")
val nativeFfiTargetNames = csvProperty("project.ffi.native.targets")
val nativeFfiCompileWrapper = boolProperty("project.ffi.native.compileWrapper", true)
val ffiNameRaw = providers.gradleProperty("project.ffi.name").getOrElse("Ffi").trim()
val ffiName = ffiNameRaw.replaceFirstChar { it.uppercase() }
val ffiNameLower = ffiNameRaw.lowercase()
val ffiDefFile = "src/nativeInterop/cinterop/$ffiName.def"
val ffiWrapperBase = "${ffiNameLower}_wrapper"

val projectKonanDataDirectory =
    providers
        .environmentVariable("KONAN_DATA_DIR")
        .map {
            require(it.isNotBlank()) { "KONAN_DATA_DIR must not be blank" }
            File(it).absoluteFile
        }.orElse(providers.systemProperty("user.home").map { File(it, ".konan") })

val commonMainApiDependencyBundle =
    optionalTrimmedProperty("project.dependencies.commonMainApiBundle")?.let { bundleName ->
        versionCatalog
            .findBundle(bundleName)
            .orElseThrow { GradleException("Missing public API bundle '$bundleName'") }
    }

val swiftExportModuleName = optionalTrimmedProperty("project.swiftExport.moduleName") ?: frameworkName
val swiftExportRootPackage =
    optionalTrimmedProperty("project.swiftExport.rootPackage")
        ?: optionalTrimmedProperty("project.swiftExport.flattenPackage")
        ?: projectNamespace

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
            rawDep.startsWith(":") -> {
                rootProject.project(rawDep)
            }

            ":" in rawDep -> {
                rawDep
            }

            else -> {
                versionCatalog
                    .findLibrary(rawDep)
                    .orElseThrow {
                        GradleException(
                            "Unknown Swift Export library alias '$rawDep' in libs.versions.toml " +
                                "(use a catalog alias, 'group:artifact:version', or ':subproject')",
                        )
                    }.get()
            }
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

childProjects.values.forEach { evaluationDependsOn(it.path) }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("nativeMain").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }

    extensions.configure<SwiftExportExtension>("swiftExport") {
        moduleName.set(swiftExportModuleName)
        rootPackage.set(swiftExportRootPackage)
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
                        moduleName.set(exported.moduleName)
                    }
                    if (exported.rootPackage.isNotEmpty()) {
                        rootPackage.set(exported.rootPackage)
                    }
                }
            }
    }

    if (nativeFfiEnabled) {
        val configuredNativeTargets = targets.withType(KotlinNativeTarget::class.java).map { it.name }.toSet()
        check(nativeFfiTargetNames.all { it in configuredNativeTargets }) {
            "Unknown project.ffi.native.targets: ${nativeFfiTargetNames - configuredNativeTargets}"
        }
        targets
            .withType(KotlinNativeTarget::class.java)
            .matching {
                nativeFfiTargetNames.isEmpty() || it.name in nativeFfiTargetNames
            }.configureEach {
                val konanTargetName = konanTarget.name
                val targetCapitalized = name.replaceFirstChar { it.uppercase() }
                val wrapperTask =
                    if (nativeFfiCompileWrapper) {
                        FfiBuildSupport.registerNativeWrapperTask(
                            rootProject,
                            ffiName,
                            ffiWrapperBase,
                            konanTargetName,
                            targetCapitalized,
                            projectKonanDataDirectory.get(),
                        )
                    } else {
                        null
                    }

                compilations.getByName("main") {
                    cinterops {
                        create(ffiNameLower) {
                            defFile(rootProject.file(ffiDefFile))
                            packageName("$ffiNameLower.cinterop")
                            if (wrapperTask != null) {
                                extraOpts(
                                    "-libraryPath",
                                    rootProject.layout.buildDirectory
                                        .dir("cinterop-targets/$konanTargetName")
                                        .get()
                                        .asFile.absolutePath,
                                )
                            }
                        }
                    }
                }
                if (wrapperTask != null) {
                    rootProject.tasks.matching { it.name == "cinterop${ffiName}$targetCapitalized" }.configureEach {
                        dependsOn(wrapperTask)
                        inputs.files(wrapperTask)
                    }
                }
            }
    }
}

rootProject.tasks
    .withType(KotlinNativeCompile::class.java)
    .matching { it.name.startsWith("compileSwiftExportMain") }
    .configureEach {
        compilerOptions.freeCompilerArgs.add("-Xwarning-level=UNCHECKED_CAST:disabled")
    }

SwiftExportSupport.configure(rootProject, swiftExportModuleName)
