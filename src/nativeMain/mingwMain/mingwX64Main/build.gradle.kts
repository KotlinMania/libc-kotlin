import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

val frameworkName = providers.gradleProperty("project.frameworkName").getOrElse("Unnamed")
val nativeSharedLibEnabled =
    providers
        .gradleProperty("project.native.sharedLib")
        .map { it.trim().lowercase() == "true" }
        .getOrElse(true)

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    mingwX64 {
        if (nativeSharedLibEnabled) {
            binaries.sharedLib {
                baseName = frameworkName
            }
        }
    }
    sourceSets.maybeCreate("mingwX64Main").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}
