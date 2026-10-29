import org.gradle.api.GradleException
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

val versionCatalog =
    rootProject.extensions
        .getByType(VersionCatalogsExtension::class.java)
        .named("libs")

fun optionalProperty(name: String): String? =
    providers
        .gradleProperty(name)
        .map { it.trim() }
        .orNull
        ?.takeIf { it.isNotEmpty() }

val commonMainApiDependencyBundle =
    optionalProperty("project.dependencies.commonMainApiBundle")?.let { bundleName ->
        versionCatalog
            .findBundle(bundleName)
            .orElseThrow { GradleException("Missing public API bundle '$bundleName'") }
    }

val commonMainDependencyBundle =
    optionalProperty("project.dependencies.commonMainBundle")?.let { bundleName ->
        versionCatalog
            .findBundle(bundleName)
            .orElseThrow { GradleException("Missing libs bundle '$bundleName'") }
    }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("commonMain").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
        dependencies {
            commonMainDependencyBundle?.let { implementation(it) }
            commonMainApiDependencyBundle?.let { api(it) }
        }
    }
}
