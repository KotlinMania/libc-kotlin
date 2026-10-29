import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    tvosSimulatorArm64()
    sourceSets.maybeCreate("tvosSimulatorArm64Main").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}
