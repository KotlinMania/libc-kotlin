import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

childProjects.values.forEach { evaluationDependsOn(it.path) }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("mingwTest").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}
