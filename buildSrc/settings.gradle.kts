pluginManagement {
    val mavenProperties =
        java.util.Properties().apply {
            val source = settingsDir.parentFile.resolve("maven.properties")
            require(source.isFile) { "Missing Maven mode configuration: $source" }
            source.inputStream().use { load(it) }
        }
    val localMaven = mavenProperties.getProperty("maven.local")?.trim()?.toBooleanStrictOrNull()
    require(localMaven != null) { "maven.properties must set maven.local=true or false" }
    val localRepository =
        mavenProperties
            .getProperty("maven.localRepository")
            ?.trim()
            ?.takeIf { it.isNotEmpty() }
            ?.let { File(it) }
            ?: File(System.getProperty("user.home"), ".m2/repository")
    require(localRepository.isAbsolute) { "maven.localRepository must be an absolute path" }

    System.setProperty("maven.repo.local", localRepository.absolutePath)
    settings.extra["mavenLocalEnabled"] = localMaven

    repositories {
        if (localMaven) mavenLocal()
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

val localMavenEnabled = extra["mavenLocalEnabled"] as Boolean

dependencyResolutionManagement {
    repositories {
        if (localMavenEnabled) mavenLocal()
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "kotlinmania-build-tools"
