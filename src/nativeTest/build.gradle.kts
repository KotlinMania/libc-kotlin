import io.github.kotlinmania.build.BuildToolTask
import io.github.kotlinmania.build.NativeTestRunner
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

childProjects.values.forEach { evaluationDependsOn(it.path) }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("nativeTest").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}

listOf("linuxArm64", "linuxX64", "mingwX64").forEach { target ->
    rootProject.tasks.register(
        "validate${target.replaceFirstChar { it.uppercase() }}Runtime",
        BuildToolTask::class.java,
    ) {
        group = "verification"
        description = "Runs linked tests on a local native host or existing Parallels guest; records unavailable hosts."
        dependsOn("linkDebugTest${target.replaceFirstChar { it.uppercase() }}")
        toolClass.set(NativeTestRunner::class.java.name)
        val executable = if (target == "mingwX64") "test.exe" else "test.kexe"
        val binaryFile = rootProject.layout.buildDirectory.file("bin/$target/debugTest/$executable")
        onlyIf { binaryFile.get().asFile.exists() }
        val platform = if (target == "mingwX64") "windows" else "linux"
        arguments.addAll(
            "--target",
            target,
            "--binary",
            binaryFile.get().asFile.absolutePath,
            "--report-dir",
            rootProject.layout.buildDirectory
                .dir("reports/local-native-tests")
                .get()
                .asFile.absolutePath,
            "--allow-unavailable",
        )
        providers
            .gradleProperty("project.validation.$platform.vm")
            .orNull
            ?.trim()
            ?.takeIf { it.isNotEmpty() }
            ?.let { arguments.addAll("--vm", it) }
    }
}

rootProject.tasks.named("validateLinuxX64Runtime") {
    mustRunAfter("validateLinuxArm64Runtime")
}
rootProject.tasks.named("validateMingwX64Runtime") {
    mustRunAfter("validateLinuxX64Runtime")
}
