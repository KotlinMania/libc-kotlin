import io.github.kotlinmania.build.VerificationSupport
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest

childProjects.values.forEach { evaluationDependsOn(it.path) }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("webTest").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}

val projectKonanDataDirectory =
    providers
        .environmentVariable("KONAN_DATA_DIR")
        .map { File(it).absoluteFile }
        .orElse(providers.systemProperty("user.home").map { File(it, ".konan") })

val macroLayoutCSource = rootProject.file("verification/macro-layout-wasm.c")
if (macroLayoutCSource.isFile) {
    val macroLayoutDirectory = rootProject.layout.buildDirectory.dir("macro-layout-wasm")
    val macroLayoutWasm = macroLayoutDirectory.map { it.file("macro-layout.wasm") }
    val macroLayoutScript = macroLayoutDirectory.map { it.file("macro-layout.js") }
    val macroFixtureLlvmBin =
        providers.gradleProperty("project.macroFixture.llvmBin").orElse(
            projectKonanDataDirectory.map { VerificationSupport.resolveKonanLlvmBin(it) },
        )
    val cinteropIncludeDir = rootProject.file("src/nativeInterop/cinterop")
    val compileMacroLayoutWasm =
        rootProject.tasks.register("compileMacroLayoutWasm") {
            inputs.files(macroLayoutCSource, cinteropIncludeDir.resolve("macro_parity_fixture.h"))
            inputs.property("llvmBin", macroFixtureLlvmBin)
            outputs.dir(macroLayoutDirectory)
            doLast {
                VerificationSupport.compileMacroLayoutWasm(
                    rootProject,
                    macroLayoutCSource,
                    cinteropIncludeDir,
                    macroLayoutDirectory.get().asFile,
                    macroLayoutWasm.get().asFile,
                    macroLayoutScript.get().asFile,
                    macroFixtureLlvmBin.get(),
                )
            }
        }
    rootProject.tasks
        .withType(KotlinJsTest::class.java)
        .matching { it.name == "jsBrowserTest" || it.name == "wasmJsBrowserTest" }
        .configureEach {
            dependsOn(compileMacroLayoutWasm)
            inputs.file(macroLayoutScript)
            environment("LIBC_MACRO_LAYOUT_SCRIPT", macroLayoutScript.get().asFile.absolutePath)
        }
}
