import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    watchosDeviceArm64()
    sourceSets.maybeCreate("watchosDeviceArm64Main").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}
