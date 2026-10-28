@file:OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)

import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    wasmWasi {
        binaries.library()
        nodejs()
    }
    sourceSets.maybeCreate("wasmWasiMain").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}

val wasmWasiTasksNeedingYarnLock =
    setOf(
        "compileKotlinWasmWasi",
        "compileTestKotlinWasmWasi",
        "compileDevelopmentLibraryKotlinWasmWasi",
        "compileProductionLibraryKotlinWasmWasi",
        "wasmWasiProcessResources",
        "wasmWasiTestProcessResources",
        "wasmWasiNodeTest",
    )

rootProject.tasks.matching { it.name in wasmWasiTasksNeedingYarnLock }.configureEach {
    dependsOn(rootProject.tasks.named("kotlinWasmUpgradeYarnLock"))
}
