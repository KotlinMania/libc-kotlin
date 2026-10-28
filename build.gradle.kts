@file:OptIn(ExperimentalKotlinGradlePluginApi::class)

import dev.detekt.gradle.Detekt
import io.github.kotlinmania.build.CentralPortalSupport
import io.github.kotlinmania.build.FfiBuildSupport
import io.github.kotlinmania.build.IdeSourceSetSupport
import io.github.kotlinmania.build.VerificationSupport
import org.gradle.api.GradleException
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.AbstractPublishToMaven
import org.gradle.api.tasks.testing.AbstractTestTask
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.kotlin.multiplatform.library)
    alias(libs.plugins.detekt)
    alias(libs.plugins.ktlint)
    alias(libs.plugins.kotlinx.benchmark)
    alias(libs.plugins.kotlin.allopen)
    `maven-publish`
    signing
}

group = providers.gradleProperty("project.group").getOrElse("io.github.kotlinmania")
version = providers.gradleProperty("project.version").getOrElse("0.1.0-SNAPSHOT")
val publishProjectName = providers.gradleProperty("project.name").getOrElse("unnamed-project")
val frameworkName = providers.gradleProperty("project.frameworkName").getOrElse("Unnamed")
val jvmToolchainVersion = providers.gradleProperty("jvm.toolchain").getOrElse("21").toInt()

val versionCatalog =
    extensions
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

val commonBenchmarkDependencyBundle =
    optionalTrimmedProperty("project.dependencies.commonBenchmarkBundle")?.let { bundleName ->
        versionCatalog
            .findBundle(bundleName)
            .orElseThrow { GradleException("Missing libs bundle '$bundleName'") }
    }

val enabledFeatureNames = csvProperty("project.features")
val benchmarkEnabled = "benchmark" in enabledFeatureNames
val benchmarkTargetNames = csvProperty("project.benchmark.targets")
if (benchmarkEnabled && commonBenchmarkDependencyBundle == null) {
    throw GradleException("Feature 'benchmark' requires project.dependencies.commonBenchmarkBundle")
}
val benchmarkWarmups = providers.gradleProperty("project.benchmark.warmups").map { it.toInt() }.getOrElse(3)
val benchmarkIterations = providers.gradleProperty("project.benchmark.iterations").map { it.toInt() }.getOrElse(5)
val benchmarkIterationTime = providers.gradleProperty("project.benchmark.iterationTime").map { it.toLong() }.getOrElse(1L)
val benchmarkIterationTimeUnit = providers.gradleProperty("project.benchmark.iterationTimeUnit").getOrElse("s")

val nativeFfiEnabled = boolProperty("project.ffi.native")
val jvmFfiEnabled = boolProperty("project.ffi.jvm")
val napiFfiEnabled = boolProperty("project.ffi.napi")
val ffiNameRaw = providers.gradleProperty("project.ffi.name").getOrElse("Ffi").trim()
val ffiName = ffiNameRaw.replaceFirstChar { it.uppercase() }

if (nativeFfiEnabled || jvmFfiEnabled || napiFfiEnabled) {
    println("FFI channels enabled: native=$nativeFfiEnabled jvm=$jvmFfiEnabled napi=$napiFfiEnabled name=$ffiName")
}

val projectDependencyHandler = project.dependencies
configurations.configureEach {
    if (name == "swiftExportClasspath") {
        dependencies.add(projectDependencyHandler.create("io.github.kotlinmania:swift-export-embeddable:2.4.20-km.4"))
    }
}

val extraKotlinCompilerArgs =
    providers
        .gradleProperty("project.kotlin.freeCompilerArgs")
        .getOrElse("")
        .split(',')
        .map { it.trim() }
        .filter { it.isNotEmpty() }

val commonOptIns =
    listOf(
        "kotlin.time.ExperimentalTime",
        "kotlin.concurrent.atomics.ExperimentalAtomicApi",
        "kotlin.ExperimentalUnsignedTypes",
    )

tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions.allWarningsAsErrors.set(true)
    doFirst {
        check(compilerOptions.allWarningsAsErrors.get()) { "Warnings-as-errors disabled for $path" }
    }
}

kotlin {
    jvmToolchain(jvmToolchainVersion)

    applyDefaultHierarchyTemplate {
        common {
            group("hostSystem") {
                withJvm()
                withAndroidTarget()
                group("web") {
                    withJs()
                    withWasmJs()
                }
                group("native") {
                    group("posix") {
                        group("apple")
                        group("linux")
                        group("androidNative")
                    }
                }
            }
        }
    }

    compilerOptions {
        languageVersion.set(KotlinVersion.KOTLIN_2_4)
        apiVersion.set(KotlinVersion.KOTLIN_2_4)
        allWarningsAsErrors.set(true)
        optIn.addAll(commonOptIns)
        freeCompilerArgs.addAll("-Xexpect-actual-classes", "-Xsuppress-version-warnings")
        freeCompilerArgs.addAll(extraKotlinCompilerArgs)
    }
}

// Evaluate the hierarchical source-set modules under src/
evaluationDependsOn(":src")

if (benchmarkEnabled) {
    kotlin {
        targets.matching { it.name in benchmarkTargetNames }.configureEach {
            val mainCompilation = compilations.getByName("main")
            compilations.create("benchmark") {
                associateWith(mainCompilation)
                defaultSourceSet.dependencies {
                    implementation(commonBenchmarkDependencyBundle!!)
                }
            }
        }
        sourceSets {
            val commonBenchmark = maybeCreate("commonBenchmark")
            commonBenchmark.dependencies {
                implementation(commonBenchmarkDependencyBundle!!)
            }
            benchmarkTargetNames.forEach { targetName ->
                findByName("${targetName}Benchmark")?.dependsOn(commonBenchmark)
            }
        }
    }
    benchmark {
        targets {
            benchmarkTargetNames.forEach { targetName ->
                register("${targetName}Benchmark")
            }
        }
        configurations {
            named("main") {
                warmups = benchmarkWarmups
                iterations = benchmarkIterations
                iterationTime = benchmarkIterationTime
                iterationTimeUnit = benchmarkIterationTimeUnit
            }
        }
    }
}

IdeSourceSetSupport.configure(project)
FfiBuildSupport.configureIncludedBuildsFfi(project, jvmFfiEnabled)

allOpen {
    annotation("org.openjdk.jmh.annotations.State")
    annotation("kotlinx.benchmark.State")
}

listOf("js", "wasmJs", "wasmWasi").forEach { targetPrefix ->
    val devSyncTasks =
        tasks.matching {
            it.name == "${targetPrefix}DevelopmentLibraryCompileSync" ||
                it.name.startsWith("${targetPrefix}NodeDevelopmentLibrary") ||
                it.name.startsWith("${targetPrefix}BrowserDevelopmentLibrary")
        }
    tasks
        .matching {
            it.name == "${targetPrefix}ProductionLibraryCompileSync" ||
                it.name.startsWith("${targetPrefix}NodeProductionLibrary") ||
                it.name.startsWith("${targetPrefix}BrowserProductionLibrary")
        }.configureEach {
            mustRunAfter(devSyncTasks)
        }
}

tasks.withType<AbstractTestTask>().configureEach {
    ignoreFailures = false
    testLogging {
        events(
            TestLogEvent.STARTED,
            TestLogEvent.PASSED,
            TestLogEvent.SKIPPED,
            TestLogEvent.FAILED,
            TestLogEvent.STANDARD_OUT,
            TestLogEvent.STANDARD_ERROR,
        )
        exceptionFormat = TestExceptionFormat.FULL
        showCauses = true
        showExceptions = true
        showStackTraces = true
        showStandardStreams = true
    }
}

detekt {
    buildUponDefaultConfig.set(true)
    allRules.set(false)
    autoCorrect.set(false)
    source.setFrom(files("src"))
    config.setFrom(files("detekt.yml"))
    parallel.set(true)
}

tasks.withType<Detekt>().configureEach {
    mustRunAfter(tasks.withType<KotlinCompilationTask<*>>())
    reports {
        html.required.set(true)
        sarif.required.set(true)
        checkstyle.required.set(false)
    }
}

tasks
    .matching { it.name.startsWith("runKtlint") || it.name.startsWith("ktlint") }
    .configureEach {
        mustRunAfter(tasks.withType<KotlinCompilationTask<*>>())
    }

ktlint {
    version.set(libs.versions.ktlintEngine.get())
    debug.set(false)
    verbose.set(false)
    android.set(false)
    outputToConsole.set(true)
    ignoreFailures.set(false)
    reporters {
        reporter(ReporterType.CHECKSTYLE)
        reporter(ReporterType.SARIF)
    }
    filter {
        exclude("**/build/**")
        include("**/src/**/kotlin/**")
    }
}

if (benchmarkEnabled) {
    tasks
        .withType<Detekt>()
        .matching { it.name.contains("BenchmarkBenchmark") }
        .configureEach { enabled = false }

    tasks
        .matching {
            it.name.startsWith("runKtlintCheckOver") && it.name.endsWith("BenchmarkBenchmarkSourceSet")
        }.configureEach { enabled = false }
}

val hasAppleTargets =
    kotlin.targets
        .withType<KotlinNativeTarget>()
        .any { it.konanTarget.family.isAppleFamily }
CentralPortalSupport.configure(project, publishProjectName, jvmFfiEnabled, hasAppleTargets)

val rootYarnLockTasks =
    listOf(
        tasks.named("kotlinUpgradeYarnLock"),
        tasks.named("kotlinStoreYarnLock"),
        tasks.named("kotlinWasmUpgradeYarnLock"),
        tasks.named("kotlinWasmStoreYarnLock"),
    )

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
        tasks.named("validate${target.replaceFirstChar { it.uppercase() }}Runtime")
    }

tasks.register("hostTests") {
    group = "verification"
    description = "Runs every enabled target's tests that this host can execute, plus Android host tests."
    dependsOn(
        tasks.named("kotlinUpgradeYarnLock"),
        tasks.named("kotlinWasmUpgradeYarnLock"),
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
                VerificationSupport.verifyJunitXmlReports(task.path, reports)
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
