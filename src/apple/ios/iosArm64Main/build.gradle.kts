import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    iosArm64()
    sourceSets.maybeCreate("iosArm64Main").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}
