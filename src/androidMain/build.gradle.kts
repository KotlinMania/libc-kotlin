import com.android.build.api.dsl.KotlinMultiplatformAndroidLibraryTarget
import com.android.build.api.variant.KotlinMultiplatformAndroidComponentsExtension
import io.github.kotlinmania.build.AndroidSdkSupport
import io.github.kotlinmania.build.FfiBuildSupport
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

val projectNamespace = providers.gradleProperty("project.namespace").getOrElse("io.github.kotlinmania")
val projectCompileSdk = providers.gradleProperty("android.compileSdk").getOrElse("34").toInt()
val projectMinSdk = providers.gradleProperty("android.minSdk").getOrElse("24").toInt()
val nativeFfiEnabled =
    providers
        .gradleProperty("project.ffi.native")
        .map { it.trim().lowercase() == "true" }
        .getOrElse(false)
val nativeFfiCompileWrapper =
    providers
        .gradleProperty("project.ffi.native.compileWrapper")
        .map { it.trim().lowercase() == "true" }
        .getOrElse(true)
val jvmFfiEnabled =
    providers
        .gradleProperty("project.ffi.jvm")
        .map { it.trim().lowercase() == "true" }
        .getOrElse(false)
val ffiNameRaw = providers.gradleProperty("project.ffi.name").getOrElse("Ffi").trim()
val ffiName = ffiNameRaw.replaceFirstChar { it.uppercase() }
val ffiNameLower = ffiNameRaw.lowercase()
val projectKonanDataDirectory =
    providers
        .environmentVariable("KONAN_DATA_DIR")
        .map { File(it).absoluteFile }
        .orElse(providers.systemProperty("user.home").map { File(it, ".konan") })

AndroidSdkSupport.configure(rootProject)

childProjects.values.forEach { evaluationDependsOn(it.path) }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    extensions.configure<KotlinMultiplatformAndroidLibraryTarget>("android") {
        namespace = projectNamespace
        compileSdk = projectCompileSdk
        minSdk = projectMinSdk
        withHostTestBuilder {}.configure {}
        withDeviceTestBuilder { sourceSetTreeName = "test" }
    }
    sourceSets.maybeCreate("androidMain").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}

if (jvmFfiEnabled) {
    val compileAndroidJni =
        FfiBuildSupport.registerAndroidJniTask(
            rootProject,
            ffiName,
            ffiNameLower,
            nativeFfiEnabled,
            nativeFfiCompileWrapper,
            projectKonanDataDirectory.get(),
        )
    rootProject.extensions
        .getByType(KotlinMultiplatformAndroidComponentsExtension::class.java)
        .onVariants { variant ->
            requireNotNull(variant.sources.jniLibs).addGeneratedSourceDirectory(compileAndroidJni) { it.nativeDirectory }
        }
}
