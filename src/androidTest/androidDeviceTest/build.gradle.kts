import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

rootProject.configurations.configureEach {
    if (name.contains("androidDeviceTest", ignoreCase = true)) {
        exclude(mapOf("group" to "org.jetbrains", "module" to "annotations"))
    }
}

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("androidDeviceTest").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}
