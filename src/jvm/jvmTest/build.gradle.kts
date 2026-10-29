import org.gradle.api.tasks.bundling.Jar
import org.gradle.api.tasks.testing.Test
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

val jvmFfiEnabled =
    providers
        .gradleProperty("project.ffi.jvm")
        .map { it.trim().lowercase() == "true" }
        .getOrElse(false)
val ffiNameRaw = providers.gradleProperty("project.ffi.name").getOrElse("Ffi").trim()
val ffiName = ffiNameRaw.replaceFirstChar { it.uppercase() }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("jvmTest").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}

if (jvmFfiEnabled) {
    val kmp = rootProject.extensions.getByType(KotlinMultiplatformExtension::class.java)
    rootProject.tasks
        .withType(Test::class.java)
        .matching { it.name == "jvmTest" || it.name == "testAndroidHostTest" }
        .configureEach {
            dependsOn("compile${ffiName}Jni")
            systemProperty(
                "java.library.path",
                rootProject.layout.buildDirectory
                    .dir("natives")
                    .get()
                    .asFile.absolutePath,
            )
        }

    val packagedJniTest =
        rootProject.tasks.register("packagedJniTest", Test::class.java) {
            dependsOn("jvmJar", "jvmTestClasses")
            val jvmTest = rootProject.tasks.named("jvmTest", Test::class.java)
            testClassesDirs = jvmTest.get().testClassesDirs
            val mainOutput =
                kmp.targets
                    .getByName("jvm")
                    .compilations
                    .getByName("main")
                    .output.allOutputs
            classpath =
                rootProject.files(rootProject.tasks.named("jvmJar", Jar::class.java).flatMap { it.archiveFile }) +
                jvmTest.get().classpath.minus(mainOutput)
            systemProperty(
                "java.library.path",
                rootProject.layout.buildDirectory
                    .dir("empty-native-search-path")
                    .get()
                    .asFile.absolutePath,
            )
            filter.isFailOnNoMatchingTests = false
            filter.includeTestsMatching("*.HostIoTest")
        }
    rootProject.tasks.named("check") { dependsOn(packagedJniTest) }
}
