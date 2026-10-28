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

fun module(path: String) {
    include(":src:${path.replace("/", ":")}")
}

// Main source-set hierarchy
module("commonMain")
module("hostSystemMain")
module("jvmMain")
module("androidMain")
module("androidMain/androidNativeMain")
module("androidMain/androidNativeMain/androidNativeArm64Main")
module("androidMain/androidNativeMain/androidNativeX64Main")
module("webMain")
module("webMain/jsMain")
module("webMain/wasmJsMain")
module("wasmWasiMain")
module("nativeMain")
module("nativeMain/posixMain")
module("nativeMain/appleMain")
module("nativeMain/appleMain/macosMain")
module("nativeMain/appleMain/macosMain/macosArm64Main")
module("nativeMain/appleMain/iosMain")
module("nativeMain/appleMain/iosMain/iosArm64Main")
module("nativeMain/appleMain/iosMain/iosSimulatorArm64Main")
module("nativeMain/appleMain/tvosMain")
module("nativeMain/appleMain/tvosMain/tvosArm64Main")
module("nativeMain/appleMain/tvosMain/tvosSimulatorArm64Main")
module("nativeMain/appleMain/watchosMain")
module("nativeMain/appleMain/watchosMain/watchosDeviceArm64Main")
module("nativeMain/appleMain/watchosMain/watchosSimulatorArm64Main")
module("nativeMain/linuxMain")
module("nativeMain/linuxMain/linuxArm64Main")
module("nativeMain/linuxMain/linuxX64Main")
module("nativeMain/mingwMain")
module("nativeMain/mingwMain/mingwX64Main")

// Test source-set hierarchy
module("commonTest")
module("hostSystemTest")
module("jvmTest")
module("androidTest")
module("androidTest/androidHostTest")
module("androidTest/androidDeviceTest")
module("androidTest/androidNativeTest")
module("androidTest/androidNativeTest/androidNativeArm64Test")
module("androidTest/androidNativeTest/androidNativeX64Test")
module("webTest")
module("webTest/jsTest")
module("webTest/wasmJsTest")
module("wasmWasiTest")
module("nativeTest")
module("nativeTest/posixTest")
module("nativeTest/appleTest")
module("nativeTest/appleTest/macosTest")
module("nativeTest/appleTest/macosTest/macosArm64Test")
module("nativeTest/appleTest/iosTest")
module("nativeTest/appleTest/iosTest/iosArm64Test")
module("nativeTest/appleTest/iosTest/iosSimulatorArm64Test")
module("nativeTest/appleTest/tvosTest")
module("nativeTest/appleTest/tvosTest/tvosArm64Test")
module("nativeTest/appleTest/tvosTest/tvosSimulatorArm64Test")
module("nativeTest/appleTest/watchosTest")
module("nativeTest/appleTest/watchosTest/watchosDeviceArm64Test")
module("nativeTest/appleTest/watchosTest/watchosSimulatorArm64Test")
module("nativeTest/linuxTest")
module("nativeTest/linuxTest/linuxArm64Test")
module("nativeTest/linuxTest/linuxX64Test")
module("nativeTest/mingwTest")
module("nativeTest/mingwTest/mingwX64Test")
