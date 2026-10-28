import io.github.kotlinmania.build.FfiBuildSupport
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec

val projectNamespace = providers.gradleProperty("project.namespace").getOrElse("io.github.kotlinmania")
val nodeVersion = providers.gradleProperty("node.version").getOrElse("24.22.0")
val napiFfiEnabled =
    providers
        .gradleProperty("project.ffi.napi")
        .map { it.trim().lowercase() == "true" }
        .getOrElse(false)
val ffiNameRaw = providers.gradleProperty("project.ffi.name").getOrElse("Ffi").trim()
val ffiName = ffiNameRaw.replaceFirstChar { it.uppercase() }
val ffiNameLower = ffiNameRaw.lowercase()
val ffiNapiDir = "native/node-$ffiNameLower"
val ffiNpmPackage = "@kotlinmania/$ffiNameLower-native-bindings"

val browserTestExcludes =
    providers
        .gradleProperty("project.js.browserTestExcludes")
        .getOrElse("")
        .split(',')
        .map { it.trim() }
        .filter { it.isNotEmpty() }

val napiKotlinExcludes =
    providers
        .gradleProperty("project.ffi.napi.kotlinExcludes")
        .getOrElse("")
        .split(',')
        .map { it.trim() }
        .filter { it.isNotEmpty() }

val napiKotlinSources =
    providers
        .gradleProperty("project.ffi.napi.kotlinSources")
        .getOrElse("")
        .split(',')
        .map { it.trim() }
        .filter { it.isNotEmpty() }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    js {
        binaries.library()
        browser {
            testTask {
                browserTestExcludes.forEach { filter.excludeTestsMatching(it) }
            }
        }
        nodejs {
            testTask {
                useMocha {
                    timeout = "120s"
                }
            }
        }
    }
    val projectNsPath = projectNamespace.replace(".", "/")
    sourceSets.maybeCreate("jsMain").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
        if (!napiFfiEnabled) {
            napiKotlinExcludes.forEach { kotlin.exclude(it) }
            if (napiKotlinSources.isEmpty()) {
                kotlin.exclude("$projectNsPath/${ffiName}NativeBindings.kt")
            } else {
                napiKotlinSources.forEach { kotlin.exclude(it) }
            }
        }
    }
}

val jsTasksNeedingYarnLock =
    setOf(
        "compileKotlinJs",
        "compileTestKotlinJs",
        "compileDevelopmentLibraryKotlinJs",
        "compileProductionLibraryKotlinJs",
        "jsProcessResources",
        "jsTestProcessResources",
        "jsNodeTest",
        "jsBrowserTest",
        "kotlinStoreYarnLock",
    )

rootProject.tasks.matching { it.name in jsTasksNeedingYarnLock }.configureEach {
    dependsOn(rootProject.tasks.named("kotlinUpgradeYarnLock"))
}

if (napiFfiEnabled) {
    val nodeExecutable = rootProject.extensions.getByType(NodeJsEnvSpec::class.java).executable
    FfiBuildSupport.registerNapiTasks(
        rootProject,
        ffiName,
        ffiNameLower,
        ffiNapiDir,
        ffiNpmPackage,
        nodeVersion,
        nodeExecutable,
    )
}
