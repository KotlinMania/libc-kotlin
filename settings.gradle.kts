pluginManagement {
    val mavenProperties =
        java.util.Properties().apply {
            val source = settingsDir.resolve("maven.properties")
            require(source.isFile) { "Missing Maven mode configuration: $source" }
            source.inputStream().use { load(it) }
        }
    val localMaven = mavenProperties.getProperty("maven.local")?.trim()?.toBooleanStrictOrNull()
    require(localMaven != null) { "maven.properties must set maven.local=true or false" }
    val localMavenValidation =
        providers
            .gradleProperty("project.repositories.mavenLocal")
            .map { it.trim().toBooleanStrict() }
            .getOrElse(false)
    val localRepository =
        if (localMavenValidation) {
            val localMavenPath = providers.systemProperty("maven.repo.local").orNull
            require(localMavenPath != null && File(localMavenPath).isAbsolute) {
                "Local Maven validation requires -Dmaven.repo.local=/absolute/path/to/isolated-repository"
            }
            File(localMavenPath)
        } else {
            val configured =
                mavenProperties
                    .getProperty("maven.localRepository")
                    ?.trim()
                    ?.takeIf { it.isNotEmpty() }
                    ?.let { File(it) }
                    ?: File(System.getProperty("user.home"), ".m2/repository")
            require(configured.isAbsolute) { "maven.localRepository must be an absolute path" }
            configured
        }

    System.setProperty("maven.repo.local", localRepository.absolutePath)
    settings.extra["mavenLocalEnabled"] = localMaven
    settings.extra["mavenLocalValidation"] = localMavenValidation

    repositories {
        if (localMaven) mavenLocal()
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins { id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0" }

val localMavenEnabled = extra["mavenLocalEnabled"] as Boolean
val localMavenValidation = extra["mavenLocalValidation"] as Boolean

dependencyResolutionManagement {
    if (localMavenValidation) {
        val localMavenPath = providers.systemProperty("maven.repo.local").orNull
        require(localMavenPath != null && File(localMavenPath).isAbsolute) {
            "Local Maven validation requires -Dmaven.repo.local=/absolute/path/to/isolated-repository"
        }
        repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    } else {
        repositoriesMode.set(RepositoriesMode.PREFER_PROJECT)
    }
    repositories {
        if (localMavenValidation) {
            exclusiveContent {
                forRepository {
                    mavenLocal { name = "kotlinManiaLocalValidation" }
                }
                filter { includeGroup("io.github.kotlinmania") }
            }
        } else if (localMavenEnabled) {
            mavenLocal()
        }
        google()
        mavenCentral()
        if (localMavenValidation) {
            ivy("https://nodejs.org/dist") {
                name = "Node Distributions"
                patternLayout { artifact("v[revision]/[artifact](-v[revision]-[classifier]).[ext]") }
                metadataSources { artifact() }
                content { includeModule("org.nodejs", "node") }
            }
            ivy("https://github.com/yarnpkg/yarn/releases/download") {
                name = "Yarn Distributions"
                patternLayout { artifact("v[revision]/[artifact]-v[revision].[ext]") }
                metadataSources { artifact() }
                content { includeModule("com.yarnpkg", "yarn") }
            }
        }
    }
}

gradle.beforeProject {
    if (!localMavenValidation) {
        repositories {
            if (localMavenEnabled) mavenLocal()
            google()
            mavenCentral()
        }
    }
    buildscript.repositories {
        if (localMavenEnabled) mavenLocal()
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = providers.gradleProperty("project.name").get()

fun module(path: String, physicalPath: String) {
    val projectPath = ":src:${path.replace("/", ":")}"
    include(projectPath)
    project(projectPath).projectDir = file(physicalPath)
}

// Main source-set hierarchy
module("commonMain", "src/common/commonMain")
module("hostSystemMain", "src/common/hostSystemMain")
module("jvmMain", "src/jvm/jvmMain")
module("androidMain", "src/android/jvm")
module("androidMain/androidNativeMain", "src/android/native/androidNativeMain")
module("androidMain/androidNativeMain/androidNativeArm64Main", "src/android/native/androidNativeArm64Main")
module("androidMain/androidNativeMain/androidNativeX64Main", "src/android/native/androidNativeX64Main")
module("webMain", "src/js/webMain")
module("webMain/jsMain", "src/js/jsMain")
module("webMain/wasmJsMain", "src/js/wasm/wasmJsMain")
module("wasmWasiMain", "src/js/wasm/wasmWasiMain")
module("nativeMain", "src/native/nativeMain")
module("nativeMain/posixMain", "src/native/nativeMain/posixMain")
module("nativeMain/appleMain", "src/apple/appleMain")
module("nativeMain/appleMain/macosMain", "src/apple/macos/macosMain")
module("nativeMain/appleMain/macosMain/macosArm64Main", "src/apple/macos/macosArm64Main")
module("nativeMain/appleMain/iosMain", "src/apple/ios/iosMain")
module("nativeMain/appleMain/iosMain/iosArm64Main", "src/apple/ios/iosArm64Main")
module("nativeMain/appleMain/iosMain/iosSimulatorArm64Main", "src/apple/ios/iosSimulatorArm64Main")
module("nativeMain/appleMain/tvosMain", "src/apple/tvos/tvosMain")
module("nativeMain/appleMain/tvosMain/tvosArm64Main", "src/apple/tvos/tvosArm64Main")
module("nativeMain/appleMain/tvosMain/tvosSimulatorArm64Main", "src/apple/tvos/tvosSimulatorArm64Main")
module("nativeMain/appleMain/watchosMain", "src/apple/watchos/watchosMain")
module("nativeMain/appleMain/watchosMain/watchosDeviceArm64Main", "src/apple/watchos/watchosDeviceArm64Main")
module("nativeMain/appleMain/watchosMain/watchosSimulatorArm64Main", "src/apple/watchos/watchosSimulatorArm64Main")
module("nativeMain/linuxMain", "src/native/nativeMain/linuxMain")
module("nativeMain/linuxMain/linuxArm64Main", "src/native/nativeMain/linuxMain/linuxArm64Main")
module("nativeMain/linuxMain/linuxX64Main", "src/native/nativeMain/linuxMain/linuxX64Main")
module("nativeMain/mingwMain", "src/native/nativeMain/mingwMain")
module("nativeMain/mingwMain/mingwX64Main", "src/native/nativeMain/mingwMain/mingwX64Main")

// Test source-set hierarchy
module("commonTest", "src/common/commonTest")
module("hostSystemTest", "src/common/hostSystemTest")
module("jvmTest", "src/jvm/jvmTest")
module("androidTest", "src/android/jvm/androidTest")
module("androidTest/androidHostTest", "src/android/jvm/androidHostTest")
module("androidTest/androidDeviceTest", "src/android/jvm/androidDeviceTest")
module("androidTest/androidNativeTest", "src/android/native/androidNativeTest")
module("androidTest/androidNativeTest/androidNativeArm64Test", "src/android/native/androidNativeTest/androidNativeArm64Test")
module("androidTest/androidNativeTest/androidNativeX64Test", "src/android/native/androidNativeTest/androidNativeX64Test")
module("webTest", "src/js/webTest")
module("webTest/jsTest", "src/js/jsTest")
module("webTest/wasmJsTest", "src/js/wasm/wasmJsTest")
module("wasmWasiTest", "src/js/wasm/wasmWasiTest")
module("nativeTest", "src/native/nativeTest")
module("nativeTest/posixTest", "src/native/nativeTest/posixTest")
module("nativeTest/appleTest", "src/native/nativeTest/appleTest")
module("nativeTest/appleTest/macosTest", "src/native/nativeTest/appleTest/macosTest")
module("nativeTest/appleTest/macosTest/macosArm64Test", "src/native/nativeTest/appleTest/macosTest/macosArm64Test")
module("nativeTest/appleTest/iosTest", "src/native/nativeTest/appleTest/iosTest")
module("nativeTest/appleTest/iosTest/iosArm64Test", "src/native/nativeTest/appleTest/iosTest/iosArm64Test")
module("nativeTest/appleTest/iosTest/iosSimulatorArm64Test", "src/native/nativeTest/appleTest/iosTest/iosSimulatorArm64Test")
module("nativeTest/appleTest/tvosTest", "src/native/nativeTest/appleTest/tvosTest")
module("nativeTest/appleTest/tvosTest/tvosArm64Test", "src/native/nativeTest/appleTest/tvosTest/tvosArm64Test")
module("nativeTest/appleTest/tvosTest/tvosSimulatorArm64Test", "src/native/nativeTest/appleTest/tvosTest/tvosSimulatorArm64Test")
module("nativeTest/appleTest/watchosTest", "src/native/nativeTest/appleTest/watchosTest")
module("nativeTest/appleTest/watchosTest/watchosDeviceArm64Test", "src/native/nativeTest/appleTest/watchosTest/watchosDeviceArm64Test")
module("nativeTest/appleTest/watchosTest/watchosSimulatorArm64Test", "src/native/nativeTest/appleTest/watchosTest/watchosSimulatorArm64Test")
module("nativeTest/linuxTest", "src/native/nativeTest/linuxTest")
module("nativeTest/linuxTest/linuxArm64Test", "src/native/nativeTest/linuxTest/linuxArm64Test")
module("nativeTest/linuxTest/linuxX64Test", "src/native/nativeTest/linuxTest/linuxX64Test")
module("nativeTest/mingwTest", "src/native/nativeTest/mingwTest")
module("nativeTest/mingwTest/mingwX64Test", "src/native/nativeTest/mingwTest/mingwX64Test")
