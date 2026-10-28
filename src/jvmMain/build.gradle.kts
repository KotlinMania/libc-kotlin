import io.github.kotlinmania.build.FfiBuildSupport
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

val jvmToolchainVersion = providers.gradleProperty("jvm.toolchain").getOrElse("21").toInt()
val projectNamespace = providers.gradleProperty("project.namespace").getOrElse("io.github.kotlinmania")
val jvmFfiEnabled =
    providers
        .gradleProperty("project.ffi.jvm")
        .map { it.trim().lowercase() == "true" }
        .getOrElse(false)
val ffiNameRaw = providers.gradleProperty("project.ffi.name").getOrElse("Ffi").trim()
val ffiName = ffiNameRaw.replaceFirstChar { it.uppercase() }
val ffiNameLower = ffiNameRaw.lowercase()
val jvmKotlinExcludes =
    providers
        .gradleProperty("project.ffi.jvm.kotlinExcludes")
        .map { value ->
            value
                .split(",")
                .map { it.trim() }
                .filter { it.isNotEmpty() }
        }.getOrElse(emptyList())

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    jvm {
        compilerOptions {
            jvmTarget.set(JvmTarget.fromTarget(jvmToolchainVersion.toString()))
        }
    }
    val projectNsPath = projectNamespace.replace(".", "/")
    sourceSets.maybeCreate("jvmMain").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
        if (!jvmFfiEnabled) {
            jvmKotlinExcludes.forEach { kotlin.exclude(it) }
            kotlin.exclude("$projectNsPath/internal/FfiJni.kt")
        }
    }
}

if (jvmFfiEnabled) {
    val packageFfiJni = FfiBuildSupport.registerJniTasks(rootProject, ffiName, ffiNameLower, projectNamespace)
    rootProject.extensions.configure<KotlinMultiplatformExtension> {
        sourceSets.named("jvmMain") {
            resources.srcDir(packageFfiJni)
        }
    }
}
