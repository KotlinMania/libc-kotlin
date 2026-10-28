import dev.detekt.gradle.Detekt
import io.github.kotlinmania.build.BuildToolTask
import io.github.kotlinmania.build.NativeTestRunner
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.AbstractPublishToMaven
import org.gradle.api.tasks.testing.AbstractTestTask
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

// ============================================================================
// Verification, Build Aggregates & Runtime Validation
// (gradle/verification.gradle.kts)
// ============================================================================

fun boolProperty(name: String, default: Boolean = false): Boolean =
    providers.gradleProperty(name).map { it.trim().lowercase() == "true" }.getOrElse(default)

val frameworkName = providers.gradleProperty("project.frameworkName").getOrElse("Unnamed")
val jvmFfiEnabled = boolProperty("project.ffi.jvm")
val napiFfiEnabled = boolProperty("project.ffi.napi")
val ffiNameRaw = providers.gradleProperty("project.ffi.name").getOrElse("Ffi").trim()
val ffiName = ffiNameRaw.replaceFirstChar { it.uppercase() }

val kotlin = extensions.getByType<KotlinMultiplatformExtension>()
val publishing = extensions.getByType<PublishingExtension>()

val rootYarnLockTasks =
    listOf(
        rootProject.tasks.named("kotlinUpgradeYarnLock"),
        rootProject.tasks.named("kotlinStoreYarnLock"),
        rootProject.tasks.named("kotlinWasmUpgradeYarnLock"),
        rootProject.tasks.named("kotlinWasmStoreYarnLock"),
    )

// ============================================================================
// `build` aggregate — Debug and Release binaries across all targets
// ============================================================================
val nativeTargetNames =
    listOf(
        "androidNativeArm64",
        "androidNativeX64",
        "iosArm64",
        "iosSimulatorArm64",
        "linuxArm64",
        "linuxX64",
        "macosArm64",
        "mingwX64",
        "tvosArm64",
        "tvosSimulatorArm64",
        "watchosDeviceArm64",
        "watchosSimulatorArm64",
    )

val fullTargetBuildTaskNames =
    buildSet {
        addAll(
            listOf(
                "compileAndroidMain",
                "compileAndroidHostTest",
                "compileAndroidDeviceTest",
                "assembleAndroidMain",
                "assembleUnitTest",
                "assembleAndroidTest",
                "assembleAndroidDeviceTest",
                "jvmMainClasses",
                "jvmTestClasses",
                "jvmJar",
                "compileDevelopmentLibraryKotlinJs",
                "compileProductionLibraryKotlinJs",
                "jsMainClasses",
                "jsTestClasses",
                "compileDevelopmentLibraryKotlinWasmJs",
                "compileProductionLibraryKotlinWasmJs",
                "wasmJsMainClasses",
                "wasmJsTestClasses",
                "compileDevelopmentLibraryKotlinWasmWasi",
                "compileProductionLibraryKotlinWasmWasi",
                "wasmWasiMainClasses",
                "wasmWasiTestClasses",
                "swiftExportSmokeTest",
                "assemble${frameworkName}XCFramework",
            ),
        )
        for (target in nativeTargetNames) {
            add("${target}Binaries")
            add("${target}TestBinaries")
        }
        if (jvmFfiEnabled) add("compile${ffiName}Jni")
        if (napiFfiEnabled) add("buildNode$ffiName")
    }

val foreignNativeRuntimeTasks =
    listOf("linuxArm64", "linuxX64", "mingwX64").map { target ->
        tasks.register<BuildToolTask>("validate${target.replaceFirstChar { it.uppercase() }}Runtime") {
            group = "verification"
            description = "Runs linked tests on a local native host or existing Parallels guest; records unavailable hosts."
            dependsOn("linkDebugTest${target.replaceFirstChar { it.uppercase() }}")
            toolClass.set(NativeTestRunner::class.java.name)
            val executable = if (target == "mingwX64") "test.exe" else "test.kexe"
            val platform = if (target == "mingwX64") "windows" else "linux"
            arguments.addAll(
                "--target",
                target,
                "--binary",
                layout.buildDirectory
                    .file("bin/$target/debugTest/$executable")
                    .get()
                    .asFile.absolutePath,
                "--report-dir",
                layout.buildDirectory
                    .dir("reports/local-native-tests")
                    .get()
                    .asFile.absolutePath,
                "--allow-unavailable",
            )
            providers
                .gradleProperty("project.validation.$platform.vm")
                .orNull
                ?.trim()
                ?.takeIf { it.isNotEmpty() }
                ?.let { arguments.addAll("--vm", it) }
        }
    }

tasks.register("hostTests") {
    group = "verification"
    description = "Runs every enabled target's tests that this host can execute, plus Android host tests."
    dependsOn(
        rootProject.tasks.named("kotlinUpgradeYarnLock"),
        rootProject.tasks.named("kotlinWasmUpgradeYarnLock"),
        "allTests",
        "testAndroidHostTest",
        foreignNativeRuntimeTasks,
    )
}

tasks.register("test") {
    group = "verification"
    description = "Runs tests for every enabled target this host can run, Android host tests, and the Swift Export smoke test."
    dependsOn("hostTests")
    dependsOn("swiftExportSmokeTest")
}

tasks.named("check") {
    dependsOn(tasks.withType<Detekt>())
    dependsOn(tasks.named("ktlintCheck"))
    dependsOn("test")
}

tasks.named("build") {
    dependsOn(rootYarnLockTasks)
    dependsOn(fullTargetBuildTaskNames)
}

val publicationCompilationTasks =
    kotlin.targets
        .filter { it.name != "metadata" }
        .flatMap { target -> target.compilations.map { it.compileTaskProvider } }

val compileAllTargets =
    tasks.register("compileAllTargets") {
        group = "verification"
        description = "Compiles main and test sources for every declared target."
        dependsOn(publicationCompilationTasks)
        doLast {
            val skippedCompilations =
                publicationCompilationTasks.map { it.get() }.filter { task ->
                    !task.state.executed ||
                        (task.state.skipped && !task.state.upToDate && task.state.skipMessage != "FROM-CACHE")
                }
            check(skippedCompilations.isEmpty()) {
                "Required target compilations did not complete: " +
                    skippedCompilations.joinToString { "${it.path} (${it.state.skipMessage ?: "not executed"})" }
            }
        }
    }

val buildAllTargets =
    tasks.register("buildAllTargets") {
        group = "verification"
        description = "Compiles and links every declared target before runtime validation."
        dependsOn(
            rootYarnLockTasks,
            compileAllTargets,
            fullTargetBuildTaskNames.filter { it != "swiftExportSmokeTest" },
        )
    }

foreignNativeRuntimeTasks.forEach { taskProvider ->
    taskProvider.configure { mustRunAfter(buildAllTargets) }
}
tasks.withType<AbstractTestTask>().configureEach {
    mustRunAfter(buildAllTargets)
}
tasks.named("swiftExportSmokeTest") { mustRunAfter(buildAllTargets) }

val publicationPomChecks =
    publishing.publications.withType<MavenPublication>().map { publication ->
        tasks.named("checkPomFileFor${publication.name.replaceFirstChar { it.uppercase() }}Publication")
    }

val checkPublicationPoms =
    tasks.register("checkPublicationPoms") {
        group = "verification"
        description = "Checks the generated POM for every Maven publication."
        dependsOn(publicationPomChecks)
        doLast {
            for (provider in publicationPomChecks) {
                val task = provider.get()
                task.state.rethrowFailure()
                check(
                    task.state.executed &&
                        (!task.state.skipped || task.state.upToDate || task.state.skipMessage == "FROM-CACHE"),
                ) {
                    "Required POM check did not execute: ${task.path} (${task.state.skipMessage})"
                }
            }
        }
    }

val publicationRuntimeTaskNames =
    listOf(
        "jvmTest",
        "testAndroidHostTest",
        "jsBrowserTest",
        "jsNodeTest",
        "wasmJsBrowserTest",
        "wasmJsNodeTest",
        "wasmWasiNodeTest",
        "macosArm64Test",
        "iosSimulatorArm64Test",
        "tvosSimulatorArm64Test",
        "watchosSimulatorArm64Test",
    )

tasks.matching { it.name in publicationRuntimeTaskNames }.configureEach {
    outputs.upToDateWhen { false }
    outputs.doNotCacheIf("Publication requires actual runtime execution") { true }
}

val verifyPublicationRuntimes =
    tasks.register("verifyPublicationRuntimes") {
        group = "verification"
        description = "Rejects skipped required test tasks and missing, empty or failing runtime reports."
        dependsOn(buildAllTargets, publicationRuntimeTaskNames, foreignNativeRuntimeTasks)
        doLast {
            for (provider in foreignNativeRuntimeTasks) {
                val task = provider.get()
                task.state.rethrowFailure()
                check(task.state.executed && !task.state.skipped) {
                    "Required native runtime did not execute: ${task.path} (${task.state.skipMessage})"
                }
            }
            for (name in publicationRuntimeTaskNames) {
                val task = tasks.named<AbstractTestTask>(name).get()
                task.state.rethrowFailure()
                check(task.state.executed && !task.state.skipped) {
                    "Required runtime did not execute: ${task.path} (${task.state.skipMessage})"
                }
                val reports =
                    fileTree(
                        task.reports.junitXml.outputLocation
                            .get()
                            .asFile,
                    ) { include("*.xml") }.files
                check(reports.isNotEmpty()) { "Missing runtime reports for ${task.path}" }
                var tests = 0
                val parser =
                    javax.xml.parsers.DocumentBuilderFactory
                        .newInstance()
                        .newDocumentBuilder()
                for (report in reports) {
                    val suite = parser.parse(report).documentElement
                    val count = suite.getAttribute("tests").toInt()
                    check(suite.getElementsByTagName("testcase").length == count) {
                        "${task.path}: test count does not match the recorded cases in ${report.name}"
                    }
                    tests += count
                    for (attribute in listOf("failures", "errors", "skipped")) {
                        check(suite.getAttribute(attribute).ifEmpty { "0" }.toInt() == 0) {
                            "${task.path}: $attribute in ${report.name}"
                        }
                    }
                    for (element in listOf("failure", "error", "skipped")) {
                        check(suite.getElementsByTagName(element).length == 0) {
                            "${task.path}: $element result in ${report.name}"
                        }
                    }
                }
                check(tests > 0) { "Required runtime ran no tests: ${task.path}" }
            }
        }
    }

val publicationCheck =
    tasks.register("publicationCheck") {
        group = "verification"
        description = "Builds every target, runs tests and checks every POM before Maven publication."
        dependsOn("build", compileAllTargets, checkPublicationPoms, verifyPublicationRuntimes)
        doLast {
            for (name in fullTargetBuildTaskNames + "build") {
                val task = tasks.named(name).get()
                task.state.rethrowFailure()
                check(
                    task.state.executed &&
                        (!task.state.skipped || task.state.upToDate || task.state.skipMessage == "FROM-CACHE"),
                ) {
                    "Required build task did not execute: ${task.path} (${task.state.skipMessage})"
                }
            }
        }
    }

tasks.withType<AbstractPublishToMaven>().configureEach {
    dependsOn(publicationCheck)
}

tasks.register("classes") {
    dependsOn(
        "compileAndroidMain",
        "jvmMainClasses",
        "jsMainClasses",
        "wasmJsMainClasses",
        "wasmWasiMainClasses",
    )
}

tasks.register("testClasses") {
    dependsOn(
        "compileAndroidHostTest",
        "jvmTestClasses",
        "jsTestClasses",
        "wasmJsTestClasses",
        "wasmWasiTestClasses",
    )
}
