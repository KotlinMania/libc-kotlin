@file:OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)

import io.github.kotlinmania.build.VerificationSupport
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.Exec
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinJsBinaryMode
import org.jetbrains.kotlin.gradle.targets.js.ir.ExecutableWasm
import org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest
import org.jetbrains.kotlin.gradle.targets.wasm.nodejs.WasmNodeJsEnvSpec

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("wasmWasiTest").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}

val macroLayoutCSource = rootProject.file("verification/macro-layout-wasm.c")
if (macroLayoutCSource.isFile) {
    val macroLayoutWasm =
        rootProject.layout.buildDirectory
            .dir("macro-layout-wasm")
            .map { it.file("macro-layout.wasm") }
    val compileMacroLayoutWasm = rootProject.tasks.named("compileMacroLayoutWasm")
    val macroWasiWasm = rootProject.objects.fileProperty()
    val prepareMacroWasiTestLoader =
        rootProject.tasks.register("prepareMacroWasiTestLoader", Copy::class.java) {
            from(rootProject.file("verification/macro-wasi-test-loader.mjs"))
            into(rootProject.layout.buildDirectory.dir("macro-layout-wasi"))
        }
    rootProject.tasks.named("wasmWasiNodeTest", KotlinJsTest::class.java) {
        val binary =
            compilation.binaries
                .filterIsInstance<ExecutableWasm>()
                .single { it.mode == KotlinJsBinaryMode.DEVELOPMENT }
        val kotlinWasmFile = binary.mainWasmFile
        val kotlinWasmLinkTask = binary.linkTask
        macroWasiWasm.set(kotlinWasmFile)
        dependsOn(compileMacroLayoutWasm, prepareMacroWasiTestLoader, kotlinWasmLinkTask)
        inputs.file(macroLayoutWasm)
        inputs.file(kotlinWasmFile)
        inputFileProperty.set(rootProject.layout.buildDirectory.file("macro-layout-wasi/macro-wasi-test-loader.mjs"))
        doFirst {
            environment("LIBC_WASI_TEST_MODULE", kotlinWasmFile.get().asFile.absolutePath)
        }
        environment("LIBC_MACRO_WASM", macroLayoutWasm.get().asFile.absolutePath)
    }

    val wasmWasiPreopenTest =
        rootProject.tasks.register("wasmWasiPreopenTest", Exec::class.java) {
            group = "verification"
            description = "Executes public WASI FILE IO against a real preopened host directory."
            dependsOn("wasmWasiNodeTest")
            inputs.file(macroWasiWasm)
            inputs.file(macroLayoutWasm)
            doFirst {
                commandLine(
                    rootProject.extensions
                        .getByType(WasmNodeJsEnvSpec::class.java)
                        .executable
                        .get(),
                    rootProject.file("verification/wasi-preopen-test.mjs").absolutePath,
                    macroWasiWasm.get().asFile,
                    rootProject.layout.buildDirectory
                        .dir("test-results/wasmWasiPreopenTest")
                        .get()
                        .asFile,
                    macroLayoutWasm.get().asFile,
                )
            }
        }
    rootProject.tasks.matching { it.name == "test" || it.name == "check" }.configureEach {
        dependsOn(wasmWasiPreopenTest)
    }
}

val wasmWasiTestPreopens =
    providers
        .gradleProperty("project.wasmWasi.testPreopens")
        .getOrElse("")
        .split(',')
        .map { it.trim() }
        .filter { it.isNotEmpty() }

if (wasmWasiTestPreopens.isNotEmpty()) {
    rootProject.tasks.named("wasmWasiNodeTest") {
        val driverDir = rootProject.layout.buildDirectory.dir("compileSync/wasmWasi/test/testDevelopmentExecutable/kotlin")
        val hostRoot = rootProject.layout.buildDirectory.dir("tmp/wasmWasiTestPreopens")
        doFirst {
            VerificationSupport.patchWasmWasiTestPreopens(
                driverDir.get().asFile,
                hostRoot.get().asFile,
                wasmWasiTestPreopens,
            )
        }
    }
}
