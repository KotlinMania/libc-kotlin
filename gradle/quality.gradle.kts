import dev.detekt.gradle.Detekt
import dev.detekt.gradle.extensions.DetektExtension
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.attributes.Attribute
import org.gradle.api.attributes.AttributeContainer
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.plugins.internal.DefaultJavaPluginExtension
import org.gradle.api.tasks.SourceSet
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.api.tasks.testing.AbstractTestTask
import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType
import java.lang.reflect.Proxy

// ============================================================================
// Compiler Diagnostics, Test Logging, Detekt, Ktlint & IDE Model
// (gradle/quality.gradle.kts)
// ============================================================================

fun csvProperty(name: String): Set<String> =
    providers
        .gradleProperty(name)
        .map { value ->
            value
                .split(",")
                .map { it.trim() }
                .filter { it.isNotEmpty() }
                .toSet()
        }.getOrElse(emptySet())

val benchmarkEnabled = "benchmark" in csvProperty("project.features")
val versionCatalog =
    extensions
        .getByType(VersionCatalogsExtension::class.java)
        .named("libs")
val kotlin = extensions.getByType<KotlinMultiplatformExtension>()

// Generated bridge/runtime Kotlin is held to the same diagnostics as project code.
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask<*>>().configureEach {
    compilerOptions.allWarningsAsErrors.set(true)
    doFirst {
        check(compilerOptions.allWarningsAsErrors.get()) { "Warnings-as-errors disabled for $path" }
    }
}

// ============================================================================
// Test logging
// ============================================================================
tasks.withType<AbstractTestTask>().configureEach {
    ignoreFailures = false
    testLogging {
        events(
            TestLogEvent.STARTED,
            TestLogEvent.PASSED,
            TestLogEvent.SKIPPED,
            TestLogEvent.FAILED,
            TestLogEvent.STANDARD_OUT,
            TestLogEvent.STANDARD_ERROR,
        )
        exceptionFormat = TestExceptionFormat.FULL
        showCauses = true
        showExceptions = true
        showStackTraces = true
        showStandardStreams = true
    }
}

// ============================================================================
// Static analysis: Detekt + Ktlint
// ============================================================================
extensions.configure<DetektExtension> {
    buildUponDefaultConfig.set(true)
    allRules.set(false)
    autoCorrect.set(false)
    source.setFrom(files("src"))
    config.setFrom(rootProject.files("detekt.yml"))
    parallel.set(true)
}

tasks.withType<Detekt>().configureEach {
    reports {
        html.required.set(true)
        sarif.required.set(true)
        checkstyle.required.set(false)
    }
}

extensions.configure<KtlintExtension> {
    version.set(versionCatalog.findVersion("ktlintEngine").get().requiredVersion)
    debug.set(false)
    verbose.set(false)
    android.set(false)
    outputToConsole.set(true)
    ignoreFailures.set(false)
    reporters {
        reporter(ReporterType.CHECKSTYLE)
        reporter(ReporterType.SARIF)
    }
    filter {
        exclude("**/build/**")
        include("**/src/**/kotlin/**")
    }
}

if (benchmarkEnabled) {
    tasks
        .withType<Detekt>()
        .matching {
            it.name.contains("BenchmarkBenchmark")
        }.configureEach {
            enabled = false
        }

    tasks
        .matching {
            it.name.startsWith("runKtlintCheckOver") && it.name.endsWith("BenchmarkBenchmarkSourceSet")
        }.configureEach {
            enabled = false
        }
}

// Expose all KMP source sets to IntelliJ IDEA's GradleDependencyGraphModelBuilder (`library -> Dependencies`
// in the Gradle Tool Window) without altering `javaExt.sourceSets` for Gradle tasks or `GradleSourceSetModelBuilder`.
afterEvaluate {
    val javaExt = extensions.findByType(JavaPluginExtension::class.java) ?: return@afterEvaluate
    val delegateSourceSets = javaExt.sourceSets
    val syntheticSourceSets = mutableListOf<Any>()
    val attributeMethod =
        AttributeContainer::class.java.getMethod(
            "attribute",
            Attribute::class.java,
            Any::class.java,
        )

    fun copyAttributes(from: AttributeContainer, to: AttributeContainer) {
        from.keySet().forEach { key ->
            val value = from.getAttribute(key) ?: return@forEach
            attributeMethod.invoke(to, key, value)
        }
    }

    for (kss in kotlin.sourceSets) {
        val name = kss.name
        val existing = delegateSourceSets.findByName(name)
        if (existing != null) {
            syntheticSourceSets.add(existing)
            continue
        }
        val targetPrefix =
            when {
                name.endsWith("Main") -> name.removeSuffix("Main")
                name.endsWith("Test") -> name
                else -> name
            }
        val compileBacking =
            configurations.findByName("${name}CompileClasspath")
                ?: configurations.findByName("${targetPrefix}CompileClasspath")
                ?: configurations.findByName("${targetPrefix}CompileKlibraries")
                ?: configurations.findByName("${name}ResolvableDependenciesMetadata")
        val runtimeBacking =
            configurations.findByName("${name}RuntimeClasspath")
                ?: configurations.findByName("${targetPrefix}RuntimeClasspath")
                ?: compileBacking

        if (compileBacking != null) {
            val compileCfgName = "${name}CompileClasspath"
            val runtimeCfgName = "${name}RuntimeClasspath"
            val compileCfg = configurations.findByName(compileCfgName) ?: configurations.create(compileCfgName)
            if (compileCfg != compileBacking) {
                compileCfg.isCanBeResolved = true
                compileCfg.isCanBeConsumed = false
                compileCfg.extendsFrom(compileBacking)
                copyAttributes(compileBacking.attributes, compileCfg.attributes)
            }
            val runtimeCfg = configurations.findByName(runtimeCfgName) ?: configurations.create(runtimeCfgName)
            if (runtimeBacking != null && runtimeCfg != runtimeBacking) {
                runtimeCfg.isCanBeResolved = true
                runtimeCfg.isCanBeConsumed = false
                runtimeCfg.extendsFrom(runtimeBacking)
                copyAttributes(runtimeBacking.attributes, runtimeCfg.attributes)
            }
            val proxySourceSet =
                Proxy.newProxyInstance(
                    SourceSet::class.java.classLoader,
                    arrayOf(SourceSet::class.java),
                ) { _, method, _ ->
                    when (method.name) {
                        "getName" -> name
                        "getCompileClasspathConfigurationName" -> compileCfgName
                        "getRuntimeClasspathConfigurationName" -> runtimeCfgName
                        "toString" -> "source set '$name'"
                        "hashCode" -> name.hashCode()
                        "equals" -> false
                        else -> null
                    }
                }
            syntheticSourceSets.add(proxySourceSet)
        }
    }

    val proxyContainer =
        Proxy.newProxyInstance(
            SourceSetContainer::class.java.classLoader,
            arrayOf(SourceSetContainer::class.java),
        ) { _, method, args ->
            val isDependencyGraphBuilder =
                method.name == "iterator" &&
                    Thread.currentThread().stackTrace.any {
                        it.className.contains("GradleDependencyGraphModelBuilder")
                    }
            if (isDependencyGraphBuilder) {
                syntheticSourceSets.iterator()
            } else if (args == null) {
                method.invoke(delegateSourceSets)
            } else {
                method.invoke(delegateSourceSets, *args)
            }
        }

    val sourceSetsField = DefaultJavaPluginExtension::class.java.getDeclaredField("sourceSets")
    sourceSetsField.isAccessible = true
    sourceSetsField.set(javaExt, proxyContainer)
}
