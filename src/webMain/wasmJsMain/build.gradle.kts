@file:OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

val browserTestExcludes =
    providers
        .gradleProperty("project.js.browserTestExcludes")
        .getOrElse("")
        .split(',')
        .map { it.trim() }
        .filter { it.isNotEmpty() }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    wasmJs {
        binaries.library()
        browser {
            testTask {
                browserTestExcludes.forEach { filter.excludeTestsMatching(it) }
            }
        }
        nodejs()
    }
    sourceSets.maybeCreate("wasmJsMain").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}

val wasmJsTasksNeedingYarnLock =
    setOf(
        "compileKotlinWasmJs",
        "compileTestKotlinWasmJs",
        "compileDevelopmentLibraryKotlinWasmJs",
        "compileProductionLibraryKotlinWasmJs",
        "wasmJsProcessResources",
        "wasmJsTestProcessResources",
        "wasmJsNodeTest",
        "wasmJsBrowserTest",
        "kotlinWasmStoreYarnLock",
    )

rootProject.tasks.matching { it.name in wasmJsTasksNeedingYarnLock }.configureEach {
    dependsOn(rootProject.tasks.named("kotlinWasmUpgradeYarnLock"))
}
