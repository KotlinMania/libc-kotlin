import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("watchosDeviceArm64Test").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}
