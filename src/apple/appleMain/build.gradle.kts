import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

val frameworkName = providers.gradleProperty("project.frameworkName").getOrElse("Unnamed")
val frameworkBundleId = providers.gradleProperty("project.namespace").getOrElse("io.github.kotlinmania")
val appleFrameworkStatic =
    providers
        .gradleProperty("project.apple.framework.static")
        .map { it.trim().lowercase() == "true" }
        .getOrElse(false)

childProjects.values.forEach { evaluationDependsOn(it.path) }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    val xcf = rootProject.XCFramework(frameworkName)
    sourceSets.maybeCreate("appleMain").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
    targets
        .withType(KotlinNativeTarget::class.java)
        .matching { it.konanTarget.family.isAppleFamily }
        .configureEach {
            binaries.framework {
                baseName = frameworkName
                if (appleFrameworkStatic) isStatic = true
                xcf.add(this)
                binaryOption("bundleId", frameworkBundleId)
            }
        }
}
