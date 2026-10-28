@file:OptIn(
    ExperimentalKotlinGradlePluginApi::class,
)

import org.gradle.api.GradleException
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.plugin.KotlinTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

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
val projectNamespace = providers.gradleProperty("project.namespace").getOrElse("io.github.kotlinmania")
val projectCompileSdk = providers.gradleProperty("android.compileSdk").getOrElse("34")
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

// kotlinmania:common-api-bundle:v1 begin
val commonMainApiDependencyBundle =
    optionalTrimmedProperty("project.dependencies.commonMainApiBundle")
        ?.let { bundleName ->
            versionCatalog
                .findBundle(bundleName)
                .orElseThrow { GradleException("Missing public API bundle '$bundleName'") }
        }
// kotlinmania:common-api-bundle:v1 end

val commonMainDependencyBundle =
    optionalTrimmedProperty("project.dependencies.commonMainBundle")
        ?.let { bundleName ->
            versionCatalog
                .findBundle(bundleName)
                .orElseThrow { GradleException("Missing libs bundle '$bundleName'") }
        }
val commonBenchmarkDependencyBundle =
    optionalTrimmedProperty("project.dependencies.commonBenchmarkBundle")
        ?.let { bundleName ->
            versionCatalog
                .findBundle(bundleName)
                .orElseThrow { GradleException("Missing libs bundle '$bundleName'") }
        }
val commonTestDependencyBundle =
    optionalTrimmedProperty("project.dependencies.commonTestBundle")
        ?.let { bundleName ->
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

val appleFrameworkStatic = boolProperty("project.apple.framework.static", false)
val nativeSharedLibEnabled = boolProperty("project.native.sharedLib", true)

val browserTestExcludes =
    providers
        .gradleProperty("project.js.browserTestExcludes")
        .getOrElse("")
        .split(',')
        .map { it.trim() }
        .filter { it.isNotEmpty() }

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

configurations.configureEach {
    if (name.contains("androidDeviceTest", ignoreCase = true)) {
        exclude(group = "org.jetbrains", module = "annotations")
    }
}

// Install and configure project-local Android SDK before evaluating `kotlin { android {} }`.
apply(from = rootProject.file("gradle/android-sdk.gradle.kts"))

// ============================================================================
// kotlin { … }
// ============================================================================
kotlin {
    jvmToolchain(jvmToolchainVersion)

    applyDefaultHierarchyTemplate {
        common {
            group("native") {
                group("posix") {
                    group("apple")
                    group("linux")
                    group("androidNative")
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

    val xcf = XCFramework(frameworkName)
    val frameworkBundleId = projectNamespace

    fun KotlinNativeTarget.addToXcf(static: Boolean = appleFrameworkStatic) {
        binaries.framework {
            baseName = frameworkName
            if (static) isStatic = true
            xcf.add(this)
            binaryOption("bundleId", frameworkBundleId)
        }
    }

    fun KotlinNativeTarget.addSharedLib() {
        if (!nativeSharedLibEnabled) return
        binaries.sharedLib {
            baseName = frameworkName
        }
    }

    fun KotlinTarget.configureBenchmarkCompilation() {
        if (!benchmarkEnabled || name !in benchmarkTargetNames) return
        val mainCompilation = compilations.getByName("main")
        compilations.create("benchmark") {
            associateWith(mainCompilation)
            defaultSourceSet.dependencies {
                implementation(commonBenchmarkDependencyBundle!!)
            }
        }
    }

    // Apple — Tier 1/2 targets
    macosArm64 {
        configureBenchmarkCompilation()
        addToXcf()
        addSharedLib()
    }
    iosArm64 {
        configureBenchmarkCompilation()
        addToXcf()
    }
    iosSimulatorArm64 {
        configureBenchmarkCompilation()
        addToXcf()
    }
    tvosArm64 {
        configureBenchmarkCompilation()
        addToXcf()
    }
    tvosSimulatorArm64 {
        configureBenchmarkCompilation()
        addToXcf()
    }
    watchosDeviceArm64 {
        configureBenchmarkCompilation()
        addToXcf()
    }
    watchosSimulatorArm64 {
        configureBenchmarkCompilation()
        addToXcf()
    }

    // Other native — Tier 1/2
    linuxX64 {
        configureBenchmarkCompilation()
        addSharedLib()
    }
    linuxArm64 {
        configureBenchmarkCompilation()
        addSharedLib()
    }
    mingwX64 {
        configureBenchmarkCompilation()
        addSharedLib()
    }

    // Android NDK — 64-bit only
    androidNativeArm64 {
        configureBenchmarkCompilation()
        addSharedLib()
    }
    androidNativeX64 {
        configureBenchmarkCompilation()
        addSharedLib()
    }

    // Web (Development + Production library distributions)
    js {
        configureBenchmarkCompilation()
        binaries.library()
        browser {
            testTask {
                browserTestExcludes.forEach { filter.excludeTestsMatching(it) }
            }
        }
        nodejs {
            testTask {
                useMocha {
                    timeout = "120s"
                }
            }
        }
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        configureBenchmarkCompilation()
        binaries.library()
        browser {
            testTask {
                browserTestExcludes.forEach { filter.excludeTestsMatching(it) }
            }
        }
        nodejs {
            testTask {
                useMocha {
                    timeout = "120s"
                }
            }
        }
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmWasi {
        configureBenchmarkCompilation()
        binaries.library()
        nodejs()
    }

    // Android KMP library
    android {
        namespace = projectNamespace
        compileSdk = projectCompileSdk.toInt()
        minSdk = providers.gradleProperty("android.minSdk").getOrElse("24").toInt()
        withHostTestBuilder {}.configure {}
        withDeviceTestBuilder { sourceSetTreeName = "test" }
    }

    // JVM
    jvm {
        configureBenchmarkCompilation()
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(jvmToolchainVersion.toString()))
        }
    }

    sourceSets {
        val projectNsPath = projectNamespace.replace(".", "/")
        if (!napiFfiEnabled) {
            jsMain {
                csvProperty("project.ffi.napi.kotlinExcludes").forEach { kotlin.exclude(it) }
                val bindingSources = csvProperty("project.ffi.napi.kotlinSources")
                if (bindingSources.isEmpty()) {
                    kotlin.exclude("$projectNsPath/${ffiName}NativeBindings.kt")
                } else {
                    bindingSources.forEach { kotlin.exclude(it) }
                }
            }
        }
        if (!jvmFfiEnabled) {
            jvmMain {
                csvProperty("project.ffi.jvm.kotlinExcludes").forEach { kotlin.exclude(it) }
                kotlin.exclude("$projectNsPath/internal/FfiJni.kt")
            }
        }
        commonMain.dependencies {
            commonMainDependencyBundle?.let { implementation(it) }
            commonMainApiDependencyBundle?.let { api(it) }
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
            commonTestDependencyBundle?.let { bundle ->
                bundle.get().forEach { dep ->
                    implementation(dep) {
                        exclude(group = project.group.toString(), module = publishProjectName)
                    }
                }
            }
        }
        if (benchmarkEnabled) {
            val commonBenchmark = maybeCreate("commonBenchmark")
            commonBenchmark.dependencies {
                implementation(commonBenchmarkDependencyBundle!!)
            }
            benchmarkTargetNames.forEach { targetName ->
                findByName("${targetName}Benchmark")?.dependsOn(commonBenchmark)
            }
        }
    }
}

allOpen {
    annotation("org.openjdk.jmh.annotations.State")
    annotation("kotlinx.benchmark.State")
}

if (benchmarkEnabled) {
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

// Domain-specific build modules
apply(from = rootProject.file("gradle/swift-export.gradle.kts"))
apply(from = rootProject.file("gradle/ffi.gradle.kts"))
apply(from = rootProject.file("gradle/js-wasm.gradle.kts"))
apply(from = rootProject.file("gradle/quality.gradle.kts"))
apply(from = rootProject.file("gradle/publishing.gradle.kts"))
apply(from = rootProject.file("gradle/verification.gradle.kts"))
