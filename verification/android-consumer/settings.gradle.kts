pluginManagement {
    repositories { google(); mavenCentral(); gradlePluginPortal() }
}
dependencyResolutionManagement {
    repositories {
        exclusiveContent {
            forRepository { maven { url = uri("../../build/staging-deploy") } }
            filter {
                includeModule("io.github.kotlinmania", "libc-kotlin")
                includeModule("io.github.kotlinmania", "libc-kotlin-android")
            }
        }
        google()
        mavenCentral()
    }
    versionCatalogs { create("libs") { from(files("../../gradle/libs.versions.toml")) } }
}
rootProject.name = "libc-android-artifact-consumer"
