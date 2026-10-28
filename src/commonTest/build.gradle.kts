import org.gradle.api.GradleException
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

val versionCatalog =
    rootProject.extensions
        .getByType(VersionCatalogsExtension::class.java)
        .named("libs")

val publishProjectName = providers.gradleProperty("project.name").getOrElse("unnamed-project")

val commonTestDependencyBundle =
    providers
        .gradleProperty("project.dependencies.commonTestBundle")
        .map { it.trim() }
        .orNull
        ?.takeIf { it.isNotEmpty() }
        ?.let { bundleName ->
            versionCatalog
                .findBundle(bundleName)
                .orElseThrow { GradleException("Missing libs bundle '$bundleName'") }
        }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("commonTest").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
        dependencies {
            implementation(kotlin("test"))
            commonTestDependencyBundle?.let { bundle ->
                bundle.get().forEach { dep ->
                    implementation(dep) {
                        exclude(group = rootProject.group.toString(), module = publishProjectName)
                    }
                }
            }
        }
    }
}
