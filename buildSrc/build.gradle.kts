plugins {
    java
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

// Only product-building helpers and plugin classpaths shared with modular
// `gradle/*.gradle.kts` script plugins belong here. Standalone verification and
// workspace automation are compiled by tools/java-build-tool.sh.
dependencies {
    implementation(gradleApi())
    implementation(localGroovy())
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${libs.versions.kotlin.get()}")
    implementation("org.jetbrains.kotlin:kotlin-serialization:${libs.versions.kotlin.get()}")
    implementation("org.jetbrains.kotlin:kotlin-allopen:${libs.versions.kotlin.get()}")
    implementation("com.android.kotlin.multiplatform.library:com.android.kotlin.multiplatform.library.gradle.plugin:${libs.versions.androidKmp.get()}")
    implementation("dev.detekt:detekt-gradle-plugin:${libs.versions.detekt.get()}")
    implementation("org.jlleitschuh.gradle:ktlint-gradle:${libs.versions.ktlint.get()}")
    implementation("org.jetbrains.kotlinx:kotlinx-benchmark-plugin:${libs.versions.kotlinxBenchmark.get()}")
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.compilerArgs.addAll(listOf("-Xlint:all", "-Werror"))
}
