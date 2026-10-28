import groovy.json.JsonSlurper
import org.gradle.api.GradleException
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.Exec
import org.gradle.kotlin.dsl.support.serviceOf
import org.gradle.process.ExecOperations
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootEnvSpec
import org.jetbrains.kotlin.gradle.targets.wasm.nodejs.WasmNodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.wasm.yarn.WasmYarnRootEnvSpec
import org.jetbrains.kotlin.gradle.targets.web.nodejs.BaseNodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.web.yarn.BaseYarnRootExtension
import java.util.Base64

// ============================================================================
// JS / Wasm / WASI Toolchain Pins & Test Runners (gradle/js-wasm.gradle.kts)
// ============================================================================

val nodeMaxOldSpaceSizeMb = providers.gradleProperty("node.maxOldSpaceSizeMb").getOrElse("4096")
val nodeHeapArg = "--max-old-space-size=$nodeMaxOldSpaceSizeMb"
tasks.withType<org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest>().configureEach {
    nodeJsArgs += nodeHeapArg
}
tasks.withType<org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack>().configureEach {
    nodeArgs += nodeHeapArg
}

val nodeVersion = providers.gradleProperty("node.version").getOrElse("24.22.0")
val wasmNodeVersion = providers.gradleProperty("wasm.node.version").getOrElse(nodeVersion)
val yarnVersion = providers.gradleProperty("yarn.version").getOrElse("1.22.22")
val wasmYarnVersion = providers.gradleProperty("wasm.yarn.version").getOrElse(yarnVersion)

@Suppress("UNCHECKED_CAST")
val webpackVersion: String =
    (JsonSlurper().parse(rootProject.file("kotlin-js-store/package.json")) as Map<String, Any>)
        .let { it["dependencies"] as Map<String, Any> }["webpack"] as String

rootProject.extensions.configure<NodeJsEnvSpec>("kotlinNodeJsSpec") { version.set(nodeVersion) }
rootProject.extensions.configure<WasmNodeJsEnvSpec>("kotlinWasmNodeJsSpec") { version.set(wasmNodeVersion) }
rootProject.extensions.configure<YarnRootEnvSpec>("kotlinYarnSpec") {
    version.set(yarnVersion)
    yarnLockMismatchReport.set(org.jetbrains.kotlin.gradle.targets.js.yarn.YarnLockMismatchReport.WARNING)
    yarnLockAutoReplace.set(true)
}
rootProject.extensions.configure<WasmYarnRootEnvSpec>("kotlinWasmYarnSpec") {
    version.set(wasmYarnVersion)
    yarnLockMismatchReport.set(org.jetbrains.kotlin.gradle.targets.js.yarn.YarnLockMismatchReport.WARNING)
    yarnLockAutoReplace.set(true)
}

val wasmNpmVersionPins =
    (JsonSlurper().parse(rootProject.file("kotlin-js-store/wasm/package.json")) as Map<*, *>)
        .let { it["dependencies"] as Map<*, *> }

listOf("kotlinYarn", "kotlinWasmYarn").forEach { extensionName ->
    rootProject.extensions.configure<BaseYarnRootExtension>(extensionName) {
        yarnLockMismatchReportProperty.set(org.jetbrains.kotlin.gradle.targets.js.yarn.YarnLockMismatchReport.WARNING)
        yarnLockAutoReplaceProperty.set(true)
        providers
            .gradlePropertiesPrefixedBy("yarn.resolution.")
            .getOrElse(emptyMap())
            .forEach { (key, ver) ->
                val pkg = key.removePrefix("yarn.resolution.")
                resolution(pkg, ver)
                resolution("**/$pkg", ver)
            }
        resolution("webpack", webpackVersion)
        resolution("**/webpack", webpackVersion)
        if (extensionName == "kotlinWasmYarn") {
            wasmNpmVersionPins.forEach { (pkg, version) ->
                resolution(pkg as String, version as String)
                resolution("**/$pkg", version)
            }
        }
    }
}

listOf("rootPackageJson", "wasmRootPackageJson").forEach { taskName ->
    rootProject.tasks.named(taskName) {
        inputs.property("yarnResolutions", providers.gradlePropertiesPrefixedBy("yarn.resolution."))
        inputs.property("webpackVersion", webpackVersion)
    }
}
rootProject.tasks.named("wasmRootPackageJson") {
    inputs.file(rootProject.file("kotlin-js-store/wasm/package.json"))
}

val patchedKarmaWebpackPackage =
    rootProject.layout.projectDirectory
        .dir("gradle/npm/karma-webpack")
        .asFile.absolutePath
        .replace("\\", "/")

listOf("kotlinNodeJs", "kotlinWasmNodeJs").forEach { extensionName ->
    rootProject.extensions.configure<BaseNodeJsRootExtension>(extensionName) {
        versions.webpack.version = webpackVersion
        versions.webpackCli.version = providers.gradleProperty("node.webpackCli.version").getOrElse("7.2.3")
        versions.karma.version = providers.gradleProperty("node.karma.version").getOrElse("npm:karma-maintained@6.4.8")
        versions.karmaWebpack.version = "file:$patchedKarmaWebpackPackage"
        versions.mocha.version = providers.gradleProperty("node.mocha.version").getOrElse("12.0.0-beta-10")
        versions.kotlinWebHelpers.version = providers.gradleProperty("node.kotlinWebHelpers.version").getOrElse("3.1.0")
    }
}

// Make kotlinUpgradeYarnLock and kotlinWasmUpgradeYarnLock dependencies in the build process
// for KotlinJS and other JavaScript/WASM targets so that yarn.lock is always upgraded automatically.
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
    )

tasks
    .matching { it.name in jsTasksNeedingYarnLock }
    .configureEach {
        dependsOn(rootProject.tasks.named("kotlinUpgradeYarnLock"))
    }

rootProject.tasks
    .matching { it.name == "kotlinStoreYarnLock" }
    .configureEach {
        dependsOn(rootProject.tasks.named("kotlinUpgradeYarnLock"))
    }

val wasmTasksNeedingYarnLock =
    setOf(
        "compileKotlinWasmJs",
        "compileTestKotlinWasmJs",
        "compileDevelopmentLibraryKotlinWasmJs",
        "compileProductionLibraryKotlinWasmJs",
        "wasmJsProcessResources",
        "wasmJsTestProcessResources",
        "wasmJsNodeTest",
        "wasmJsBrowserTest",
        "compileKotlinWasmWasi",
        "compileTestKotlinWasmWasi",
        "compileDevelopmentLibraryKotlinWasmWasi",
        "compileProductionLibraryKotlinWasmWasi",
        "wasmWasiProcessResources",
        "wasmWasiTestProcessResources",
        "wasmWasiNodeTest",
    )

tasks
    .matching { it.name in wasmTasksNeedingYarnLock }
    .configureEach {
        dependsOn(rootProject.tasks.named("kotlinWasmUpgradeYarnLock"))
    }

rootProject.tasks
    .matching { it.name == "kotlinWasmStoreYarnLock" }
    .configureEach {
        dependsOn(rootProject.tasks.named("kotlinWasmUpgradeYarnLock"))
    }

val projectKonanDataDirectory =
    providers
        .environmentVariable("KONAN_DATA_DIR")
        .map {
            require(it.isNotBlank()) { "KONAN_DATA_DIR must not be blank" }
            File(it).absoluteFile
        }.orElse(providers.systemProperty("user.home").map { File(it, ".konan") })

val macroLayoutCSource = rootProject.file("verification/macro-layout-wasm.c")
if (macroLayoutCSource.isFile) {
    val macroLayoutDirectory = layout.buildDirectory.dir("macro-layout-wasm")
    val macroLayoutWasm = macroLayoutDirectory.map { it.file("macro-layout.wasm") }
    val macroLayoutScript = macroLayoutDirectory.map { it.file("macro-layout.js") }
    val macroFixtureLlvmBin =
        providers.gradleProperty("project.macroFixture.llvmBin").orElse(
            projectKonanDataDirectory.map { dataDirectory ->
                val dependencies = File(dataDirectory, "dependencies")
                val receipt = File(dependencies, ".extracted")
                val candidates =
                    if (receipt.isFile) {
                        receipt
                            .readLines()
                            .filter { it.startsWith("llvm-") }
                            .distinct()
                            .sortedByDescending { name ->
                                name
                                    .removePrefix("llvm-")
                                    .substringBefore('-')
                                    .toIntOrNull() ?: 0
                            }.map { File(dependencies, "$it/bin") }
                            .filter { File(it, "clang").canExecute() && File(it, "lld").canExecute() }
                    } else {
                        emptyList()
                    }
                candidates.firstOrNull()?.absolutePath ?: ""
            },
        )
    val cinteropIncludeDir = file("src/nativeInterop/cinterop")
    val compileMacroLayoutWasm =
        tasks.register("compileMacroLayoutWasm") {
            inputs.files(macroLayoutCSource, cinteropIncludeDir.resolve("macro_parity_fixture.h"))
            inputs.property("llvmBin", macroFixtureLlvmBin)
            outputs.dir(macroLayoutDirectory)
            doLast {
                val directory = macroLayoutDirectory.get().asFile.apply { mkdirs() }
                val llvmBin = macroFixtureLlvmBin.get()

                fun tool(name: String) = if (llvmBin.isEmpty()) name else File(llvmBin, name).absolutePath
                val objectFile = directory.resolve("macro-layout.o")
                val wasmFile = macroLayoutWasm.get().asFile
                val execOps = project.serviceOf<ExecOperations>()
                execOps
                    .exec {
                        commandLine(
                            tool("clang"),
                            "--target=wasm32",
                            "-ffreestanding",
                            "-nostdlib",
                            "-Wall",
                            "-Wextra",
                            "-Werror",
                            "-I${cinteropIncludeDir.absolutePath}",
                            "-c",
                            macroLayoutCSource.absolutePath,
                            "-o",
                            objectFile.absolutePath,
                        )
                    }.assertNormalExitValue()
                execOps
                    .exec {
                        commandLine(
                            tool("lld"),
                            "-flavor",
                            "wasm",
                            "--no-entry",
                            "--export=kotlinmania_macro_layout_value",
                            objectFile.absolutePath,
                            "-o",
                            wasmFile.absolutePath,
                        )
                    }.assertNormalExitValue()
                val encoded = Base64.getEncoder().encodeToString(wasmFile.readBytes())
                macroLayoutScript.get().asFile.writeText(
                    """
                    // Actual compiler output from macro_parity_fixture.h; keep one instance for all address comparisons.
                    (() => {
                        const bytes = Uint8Array.from(atob('$encoded'), c => c.charCodeAt(0));
                        const instance = new WebAssembly.Instance(new WebAssembly.Module(bytes), {});
                        globalThis.__kotlinmaniaMacroLayoutValue = index => instance.exports.kotlinmania_macro_layout_value(index).toString();
                    })();
                    """.trimIndent() + "\n",
                )
            }
        }
    tasks
        .withType<org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest>()
        .matching {
            it.name == "jsBrowserTest" || it.name == "wasmJsBrowserTest"
        }.configureEach {
            dependsOn(compileMacroLayoutWasm)
            inputs.file(macroLayoutScript)
            environment("LIBC_MACRO_LAYOUT_SCRIPT", macroLayoutScript.get().asFile.absolutePath)
        }
    val macroWasiWasm = objects.fileProperty()
    val prepareMacroWasiTestLoader =
        tasks.register<Copy>("prepareMacroWasiTestLoader") {
            from(rootProject.file("verification/macro-wasi-test-loader.mjs"))
            into(layout.buildDirectory.dir("macro-layout-wasi"))
        }
    tasks.named<org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest>("wasmWasiNodeTest") {
        @OptIn(ExperimentalWasmDsl::class)
        val binary =
            compilation.binaries
                .filterIsInstance<org.jetbrains.kotlin.gradle.targets.js.ir.ExecutableWasm>()
                .single { it.mode == org.jetbrains.kotlin.gradle.targets.js.dsl.KotlinJsBinaryMode.DEVELOPMENT }

        @OptIn(ExperimentalWasmDsl::class)
        val kotlinWasmFile = binary.mainWasmFile

        @OptIn(ExperimentalWasmDsl::class)
        val kotlinWasmLinkTask = binary.linkTask
        macroWasiWasm.set(kotlinWasmFile)
        dependsOn(compileMacroLayoutWasm, prepareMacroWasiTestLoader, kotlinWasmLinkTask)
        inputs.file(macroLayoutWasm)
        inputs.file(kotlinWasmFile)
        inputFileProperty.set(layout.buildDirectory.file("macro-layout-wasi/macro-wasi-test-loader.mjs"))
        doFirst {
            environment("LIBC_WASI_TEST_MODULE", kotlinWasmFile.get().asFile.absolutePath)
        }
        environment("LIBC_MACRO_WASM", macroLayoutWasm.get().asFile.absolutePath)
    }

    val wasmWasiPreopenTest =
        tasks.register<Exec>("wasmWasiPreopenTest") {
            group = "verification"
            description = "Executes public WASI FILE IO against a real preopened host directory."
            dependsOn("wasmWasiNodeTest")
            inputs.file(macroWasiWasm)
            inputs.file(macroLayoutWasm)
            doFirst {
                commandLine(
                    rootProject.extensions
                        .getByType<WasmNodeJsEnvSpec>()
                        .executable
                        .get(),
                    rootProject.file("verification/wasi-preopen-test.mjs").absolutePath,
                    macroWasiWasm.get().asFile,
                    layout.buildDirectory
                        .dir("test-results/wasmWasiPreopenTest")
                        .get()
                        .asFile,
                    macroLayoutWasm.get().asFile,
                )
            }
        }
    tasks.matching { it.name == "test" || it.name == "check" }.configureEach {
        dependsOn(wasmWasiPreopenTest)
    }
}

// Kotlin/Wasm's generated WASI test driver preopens no directories (KT-65179), so
// filesystem tests cannot reach any path. project.wasmWasi.testPreopens lists guest
// directories to map onto fresh host temporary directories for wasmWasiNodeTest.
val wasmWasiTestPreopens =
    providers
        .gradleProperty("project.wasmWasi.testPreopens")
        .getOrElse("")
        .split(',')
        .map { it.trim() }
        .filter { it.isNotEmpty() }

if (wasmWasiTestPreopens.isNotEmpty()) {
    tasks.named("wasmWasiNodeTest") {
        val driverDir = layout.buildDirectory.dir("compileSync/wasmWasi/test/testDevelopmentExecutable/kotlin")
        val hostRoot = layout.buildDirectory.dir("tmp/wasmWasiTestPreopens")
        doFirst {
            val driver =
                driverDir
                    .get()
                    .asFile
                    .listFiles { file -> file.name.endsWith("-test.mjs") }
                    ?.singleOrNull()
                    ?: throw GradleException("wasmWasi test driver not found in ${driverDir.get().asFile}")
            val root = hostRoot.get().asFile
            root.deleteRecursively()
            val mappings =
                wasmWasiTestPreopens.mapIndexed { index, guest ->
                    val host = root.resolve("preopen-$index").apply { mkdirs() }
                    val hostPath = host.absolutePath.replace("\\", "\\\\")
                    "'$guest': '$hostPath'"
                }
            val text = driver.readText()
            if (!text.contains("preopens:")) {
                val patched =
                    text.replaceFirst(
                        Regex("""new WASI\(\{"""),
                        "new WASI({ preopens: { ${mappings.joinToString(", ")} },",
                    )
                if (patched == text) throw GradleException("Could not add preopens to ${driver.name}")
                driver.writeText(patched)
            }
        }
    }
}
