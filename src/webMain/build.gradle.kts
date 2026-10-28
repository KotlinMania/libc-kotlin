import groovy.json.JsonSlurper
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnLockMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.yarn.YarnRootEnvSpec
import org.jetbrains.kotlin.gradle.targets.wasm.nodejs.WasmNodeJsEnvSpec
import org.jetbrains.kotlin.gradle.targets.wasm.yarn.WasmYarnRootEnvSpec
import org.jetbrains.kotlin.gradle.targets.web.nodejs.BaseNodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.web.yarn.BaseYarnRootExtension

childProjects.values.forEach { evaluationDependsOn(it.path) }

rootProject.extensions.configure<KotlinMultiplatformExtension> {
    sourceSets.maybeCreate("webMain").apply {
        kotlin.setSrcDirs(listOf(projectDir.resolve("kotlin")))
        resources.setSrcDirs(listOf(projectDir.resolve("kotlin/resources")))
    }
}

val nodeMaxOldSpaceSizeMb = providers.gradleProperty("node.maxOldSpaceSizeMb").getOrElse("4096")
val nodeHeapArg = "--max-old-space-size=$nodeMaxOldSpaceSizeMb"
rootProject.tasks.withType(KotlinJsTest::class.java).configureEach {
    nodeJsArgs += nodeHeapArg
}
rootProject.tasks.withType(KotlinWebpack::class.java).configureEach {
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
    yarnLockMismatchReport.set(YarnLockMismatchReport.WARNING)
    yarnLockAutoReplace.set(true)
}
rootProject.extensions.configure<WasmYarnRootEnvSpec>("kotlinWasmYarnSpec") {
    version.set(wasmYarnVersion)
    yarnLockMismatchReport.set(YarnLockMismatchReport.WARNING)
    yarnLockAutoReplace.set(true)
}

val wasmNpmVersionPins =
    (JsonSlurper().parse(rootProject.file("kotlin-js-store/wasm/package.json")) as Map<*, *>)
        .let { it["dependencies"] as Map<*, *> }

listOf("kotlinYarn", "kotlinWasmYarn").forEach { extensionName ->
    rootProject.extensions.configure<BaseYarnRootExtension>(extensionName) {
        yarnLockMismatchReportProperty.set(YarnLockMismatchReport.WARNING)
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
