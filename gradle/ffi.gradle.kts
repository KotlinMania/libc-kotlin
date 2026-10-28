import com.android.build.api.variant.KotlinMultiplatformAndroidComponentsExtension
import io.github.kotlinmania.build.BuildToolTask
import io.github.kotlinmania.build.NodeFfiBuilder
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.Exec
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.Sync
import org.gradle.api.tasks.bundling.Jar
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.support.serviceOf
import org.gradle.process.ExecOperations
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsEnvSpec

// ============================================================================
// Native, JNI, and N-API FFI Bindings (gradle/ffi.gradle.kts)
// ============================================================================

fun boolProperty(name: String, default: Boolean = false): Boolean =
    providers.gradleProperty(name).map { it.trim().lowercase() == "true" }.getOrElse(default)

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

val projectNamespace = providers.gradleProperty("project.namespace").getOrElse("io.github.kotlinmania")
val nodeVersion = providers.gradleProperty("node.version").getOrElse("24.22.0")
val osName = providers.systemProperty("os.name").get().lowercase()
val isWindowsHost = "windows" in osName
val isMacHost = "mac" in osName

val nativeFfiEnabled = boolProperty("project.ffi.native")
val nativeFfiTargetNames = csvProperty("project.ffi.native.targets")
val nativeFfiCompileWrapper = boolProperty("project.ffi.native.compileWrapper", true)
val jvmFfiEnabled = boolProperty("project.ffi.jvm")
val napiFfiEnabled = boolProperty("project.ffi.napi")

val ffiNameRaw = providers.gradleProperty("project.ffi.name").getOrElse("Ffi").trim()
val ffiName = ffiNameRaw.replaceFirstChar { it.uppercase() }
val ffiNameLower = ffiNameRaw.lowercase()
val ffiDefFile = "src/nativeInterop/cinterop/$ffiName.def"
val ffiWrapperBase = "${ffiNameLower}_wrapper"
val ffiNapiDir = "native/node-$ffiNameLower"
val ffiNpmPackage = "@kotlinmania/$ffiNameLower-native-bindings"

val projectKonanDataDirectory =
    providers
        .environmentVariable("KONAN_DATA_DIR")
        .map {
            require(it.isNotBlank()) { "KONAN_DATA_DIR must not be blank" }
            File(it).absoluteFile
        }.orElse(providers.systemProperty("user.home").map { File(it, ".konan") })

val kotlin = extensions.getByType<KotlinMultiplatformExtension>()

// ============================================================================
// Native FFI — Kotlin/Native cinterop + per-target static wrapper library.
// ============================================================================
if (nativeFfiEnabled) {
    fun ensureKonanDependency(name: String, konanDeps: File, execOps: ExecOperations): File {
        val compilerDependencies = File(projectKonanDataDirectory.get(), "dependencies")
        val compilerDirectory = File(compilerDependencies, name)
        val compilerReceipt = File(compilerDependencies, ".extracted")
        if (
            compilerReceipt.isFile &&
            name in compilerReceipt.readLines() &&
            compilerDirectory.isDirectory &&
            compilerDirectory.list()?.isNotEmpty() == true
        ) {
            return compilerDirectory
        }
        val targetDir = File(konanDeps, name)
        if (targetDir.isDirectory && targetDir.list()?.isNotEmpty() == true) return targetDir
        konanDeps.mkdirs()
        val cacheDir = File(konanDeps, "cache").apply { mkdirs() }
        val archive = File(cacheDir, "$name.tar.gz")
        val url = "https://download.jetbrains.com/kotlin/native/$name.tar.gz"
        if (!archive.exists() || archive.length() == 0L) {
            if (gradle.startParameter.isOffline) {
                throw GradleException(
                    "Missing Kotlin/Native dependency $name in $konanDeps; offline mode forbids downloading $url",
                )
            }
            println("Downloading Kotlin/Native dependency $name from $url ...")
            execOps
                .exec {
                    commandLine("curl", "-sSL", url, "-o", archive.absolutePath)
                }.assertNormalExitValue()
        }
        println("Extracting $archive into $konanDeps ...")
        execOps
            .exec {
                commandLine("tar", "-xzf", archive.absolutePath, "-C", konanDeps.absolutePath)
            }.assertNormalExitValue()
        check(targetDir.isDirectory && targetDir.list()?.isNotEmpty() == true) {
            "Native wrapper dependency extraction produced no directory: $targetDir"
        }
        return targetDir
    }

    val configuredNativeTargets = kotlin.targets.withType<KotlinNativeTarget>().map { it.name }.toSet()
    check(nativeFfiTargetNames.all { it in configuredNativeTargets }) {
        "Unknown project.ffi.native.targets: ${nativeFfiTargetNames - configuredNativeTargets}"
    }
    kotlin.targets
        .withType<KotlinNativeTarget>()
        .matching {
            nativeFfiTargetNames.isEmpty() || it.name in nativeFfiTargetNames
        }.configureEach {
            val konanTargetName = konanTarget.name
            val targetCapitalized = name.replaceFirstChar { it.uppercase() }
            val wrapperTaskName = "compile${ffiName}WrapperFor$targetCapitalized"
            val wrapperTask =
                if (nativeFfiCompileWrapper) {
                    tasks.register(wrapperTaskName) {
                        group = "build"
                        description = "Compiles $ffiWrapperBase.c into a static library for $konanTargetName"
                        val cSource = file("src/nativeInterop/cinterop/$ffiWrapperBase.c")
                        val hSource = file("src/nativeInterop/cinterop/$ffiWrapperBase.h")
                        val outDir =
                            layout.buildDirectory
                                .dir("cinterop-targets/$konanTargetName")
                                .get()
                                .asFile
                        val outFile = File(outDir, "$ffiWrapperBase.a")
                        inputs.file(cSource)
                        inputs.file(hSource)
                        if (konanTargetName.startsWith("linux")) {
                            inputs.dir(rootProject.file("buildSrc/src/main/java"))
                            outputs.file(File(outDir, "native-archive-verification.json"))
                        }
                        outputs.file(outFile)

                        doLast {
                            outDir.mkdirs()
                            if (outFile.exists()) outFile.delete()
                            if (konanTargetName.startsWith("linux")) File(outDir, "native-archive-verification.json").delete()
                            val tempObj = File(outDir, "$ffiWrapperBase.o")
                            val konanDeps =
                                layout.buildDirectory
                                    .dir("native-wrapper-dependencies")
                                    .get()
                                    .asFile
                            val isMac =
                                org.gradle.internal.os.OperatingSystem
                                    .current()
                                    .isMacOsX
                            val isLinux =
                                org.gradle.internal.os.OperatingSystem
                                    .current()
                                    .isLinux
                            val isWindows =
                                org.gradle.internal.os.OperatingSystem
                                    .current()
                                    .isWindows
                            val execOps = project.serviceOf<ExecOperations>()

                            when {
                                isMac &&
                                    (
                                        konanTargetName.startsWith("macos") ||
                                            konanTargetName.startsWith("ios") ||
                                            konanTargetName.startsWith("tvos") ||
                                            konanTargetName.startsWith("watchos")
                                    ) -> {
                                    val (appleTriple, sdkName) =
                                        when (konanTargetName) {
                                            "macos_arm64" -> "arm64-apple-macos14.0" to "macosx"
                                            "macos_x64" -> "x86_64-apple-macos14.0" to "macosx"
                                            "ios_arm64" -> "arm64-apple-ios14.0" to "iphoneos"
                                            "ios_simulator_arm64" -> "arm64-apple-ios14.0-simulator" to "iphonesimulator"
                                            "ios_x64" -> "x86_64-apple-ios14.0-simulator" to "iphonesimulator"
                                            "watchos_device_arm64" -> "arm64-apple-watchos7.0" to "watchos"
                                            "watchos_simulator_arm64" -> "arm64-apple-watchos7.0-simulator" to "watchsimulator"
                                            "tvos_arm64" -> "arm64-apple-tvos14.0" to "appletvos"
                                            "tvos_simulator_arm64" -> "arm64-apple-tvos14.0-simulator" to "appletvsimulator"
                                            else -> "arm64-apple-macos14.0" to "macosx"
                                        }
                                    execOps
                                        .exec {
                                            commandLine("xcrun", "-sdk", sdkName, "clang", "-target", appleTriple, "-Wall", "-Wextra", "-Werror", "-c", "-I${cSource.parent}", cSource.absolutePath, "-o", tempObj.absolutePath)
                                        }.assertNormalExitValue()
                                    execOps
                                        .exec {
                                            commandLine("xcrun", "-sdk", sdkName, "ar", "rcs", outFile.absolutePath, tempObj.absolutePath)
                                        }.assertNormalExitValue()
                                }

                                konanTargetName.startsWith("android") -> {
                                    val hostToolchain = if (isMac) "osx" else "linux"
                                    val ndkDir = ensureKonanDependency("target-toolchain-2-$hostToolchain-android_ndk", konanDeps, execOps)
                                    ensureKonanDependency("target-sysroot-1-android_ndk", konanDeps, execOps)
                                    val sysroot = File(ndkDir, "sysroot")
                                    val clangBin =
                                        if (konanTargetName.contains("arm64")) {
                                            File(ndkDir, "bin/aarch64-linux-android21-clang")
                                        } else {
                                            File(ndkDir, "bin/x86_64-linux-android21-clang")
                                        }
                                    val arBin =
                                        if (konanTargetName.contains("arm64")) {
                                            File(ndkDir, "bin/aarch64-linux-android-ar")
                                        } else {
                                            File(ndkDir, "bin/x86_64-linux-android-ar")
                                        }
                                    if (clangBin.exists() && sysroot.exists()) {
                                        execOps
                                            .exec {
                                                commandLine(clangBin.absolutePath, "--sysroot=${sysroot.absolutePath}", "-fPIC", "-Wall", "-Wextra", "-Werror", "-c", "-I${cSource.parent}", cSource.absolutePath, "-o", tempObj.absolutePath)
                                            }.assertNormalExitValue()
                                        execOps
                                            .exec {
                                                commandLine(arBin.absolutePath, "rcs", outFile.absolutePath, tempObj.absolutePath)
                                            }.assertNormalExitValue()
                                    } else {
                                        val prebuilt = file("src/nativeInterop/cinterop/targets/$konanTargetName/$ffiWrapperBase.a")
                                        val fallbackPrebuilt = file("src/nativeInterop/cinterop/$ffiWrapperBase.a")
                                        if (prebuilt.exists()) {
                                            prebuilt.copyTo(outFile, overwrite = true)
                                        } else if (fallbackPrebuilt.exists()) {
                                            fallbackPrebuilt.copyTo(outFile, overwrite = true)
                                        }
                                    }
                                }

                                konanTargetName.startsWith("linux") -> {
                                    val (targetTriple, gccDirName) =
                                        if (konanTargetName.contains("arm64")) {
                                            "aarch64-unknown-linux-gnu" to "aarch64-unknown-linux-gnu-gcc-8.3.0-glibc-2.25-kernel-4.9-2"
                                        } else {
                                            "x86_64-unknown-linux-gnu" to "x86_64-unknown-linux-gnu-gcc-8.3.0-glibc-2.19-kernel-4.9-2"
                                        }
                                    if (isLinux) {
                                        val gccDirectory = ensureKonanDependency(gccDirName, konanDeps, execOps)
                                        val sysroot = File(gccDirectory, "$targetTriple/sysroot")
                                        require(sysroot.isDirectory) { "Missing target sysroot for $konanTargetName: $sysroot" }
                                        execOps
                                            .exec {
                                                commandLine("clang", "--target=$targetTriple", "--sysroot=${sysroot.absolutePath}", "-fPIC", "-Wall", "-Wextra", "-Werror", "-c", "-I${cSource.parent}", cSource.absolutePath, "-o", tempObj.absolutePath)
                                            }.assertNormalExitValue()
                                        execOps
                                            .exec {
                                                commandLine("ar", "rcs", outFile.absolutePath, tempObj.absolutePath)
                                            }.assertNormalExitValue()
                                    } else if (isMac) {
                                        val gccDirectory = ensureKonanDependency(gccDirName, konanDeps, execOps)
                                        val ndkDirectory = ensureKonanDependency("target-toolchain-2-osx-android_ndk", konanDeps, execOps)
                                        val sysroot = File(gccDirectory, "$targetTriple/sysroot")
                                        val llvmAr = File(ndkDirectory, "bin/llvm-ar")
                                        if (sysroot.exists() && llvmAr.exists()) {
                                            execOps
                                                .exec {
                                                    commandLine("clang", "--target=$targetTriple", "--sysroot=${sysroot.absolutePath}", "-fPIC", "-Wall", "-Wextra", "-Werror", "-c", "-I${cSource.parent}", cSource.absolutePath, "-o", tempObj.absolutePath)
                                                }.assertNormalExitValue()
                                            execOps
                                                .exec {
                                                    commandLine(llvmAr.absolutePath, "rcs", outFile.absolutePath, tempObj.absolutePath)
                                                }.assertNormalExitValue()
                                        } else {
                                            val prebuilt = file("src/nativeInterop/cinterop/targets/$konanTargetName/$ffiWrapperBase.a")
                                            if (prebuilt.exists()) prebuilt.copyTo(outFile, overwrite = true)
                                        }
                                    } else {
                                        val prebuilt = file("src/nativeInterop/cinterop/targets/$konanTargetName/$ffiWrapperBase.a")
                                        if (prebuilt.exists()) prebuilt.copyTo(outFile, overwrite = true)
                                    }
                                }

                                konanTargetName.startsWith("mingw") -> {
                                    val mingwSysroot = ensureKonanDependency("msys2-mingw-w64-x86_64-2", konanDeps, execOps)
                                    val arExe = File(mingwSysroot, "bin/ar.exe")
                                    if (isWindows && mingwSysroot.exists()) {
                                        execOps
                                            .exec {
                                                commandLine("clang", "--target=x86_64-w64-mingw32", "--sysroot=${mingwSysroot.absolutePath}", "-Wall", "-Wextra", "-Werror", "-c", "-I${cSource.parent}", cSource.absolutePath, "-o", tempObj.absolutePath)
                                            }.assertNormalExitValue()
                                        execOps
                                            .exec {
                                                commandLine(if (arExe.exists()) arExe.absolutePath else "ar", "rcs", outFile.absolutePath, tempObj.absolutePath)
                                            }.assertNormalExitValue()
                                    } else if (isMac) {
                                        val ndkDirectory = ensureKonanDependency("target-toolchain-2-osx-android_ndk", konanDeps, execOps)
                                        val llvmAr = File(ndkDirectory, "bin/llvm-ar")
                                        if (mingwSysroot.exists() && llvmAr.exists()) {
                                            execOps
                                                .exec {
                                                    commandLine("clang", "--target=x86_64-w64-mingw32", "--sysroot=${mingwSysroot.absolutePath}", "-Wall", "-Wextra", "-Werror", "-c", "-I${cSource.parent}", cSource.absolutePath, "-o", tempObj.absolutePath)
                                                }.assertNormalExitValue()
                                            execOps
                                                .exec {
                                                    commandLine(llvmAr.absolutePath, "rcs", outFile.absolutePath, tempObj.absolutePath)
                                                }.assertNormalExitValue()
                                        } else {
                                            val prebuilt = file("src/nativeInterop/cinterop/targets/mingw_x64/$ffiWrapperBase.a")
                                            if (prebuilt.exists()) prebuilt.copyTo(outFile, overwrite = true)
                                        }
                                    } else {
                                        val prebuilt = file("src/nativeInterop/cinterop/targets/mingw_x64/$ffiWrapperBase.a")
                                        if (prebuilt.exists()) prebuilt.copyTo(outFile, overwrite = true)
                                    }
                                }

                                else -> {
                                    val prebuilt = file("src/nativeInterop/cinterop/targets/$konanTargetName/$ffiWrapperBase.a")
                                    if (prebuilt.exists()) prebuilt.copyTo(outFile, overwrite = true)
                                }
                            }
                            if (!outFile.exists() || outFile.length() == 0L) {
                                throw GradleException("compile${ffiName}Wrapper failed: output library does not exist for $konanTargetName at ${outFile.absolutePath}")
                            }
                            tempObj.delete()
                        }
                    }
                } else {
                    null
                }

            compilations.getByName("main") {
                cinterops {
                    create(ffiNameLower) {
                        defFile(project.file(ffiDefFile))
                        packageName("$ffiNameLower.cinterop")
                        if (wrapperTask != null) {
                            extraOpts(
                                "-libraryPath",
                                layout.buildDirectory
                                    .dir("cinterop-targets/$konanTargetName")
                                    .get()
                                    .asFile.absolutePath,
                            )
                        }
                    }
                }
            }
            if (wrapperTask != null) {
                tasks.matching { it.name == "cinterop${ffiName}$targetCapitalized" }.configureEach {
                    dependsOn(wrapperTask)
                    inputs.files(wrapperTask)
                }
            }
        }
}

// ============================================================================
// JNI — JVM & Android C bindings. Gated by project.ffi.jvm=true.
// ============================================================================
abstract class AndroidJniCompileTask : DefaultTask() {
    @get:OutputDirectory
    abstract val nativeDirectory: DirectoryProperty
}

if (jvmFfiEnabled) {
    val projectNsPath = projectNamespace.replace(".", "/")
    val compileFfiJni =
        tasks.register("compile${ffiName}Jni") {
            group = "build"
            description = "Compiles ${ffiNameLower}_jni.c into a shared library for JVM JNI binding"
            val cSource = file("src/jvmMain/c/${ffiNameLower}_jni.c")
            val outDir =
                layout.buildDirectory
                    .dir("natives")
                    .get()
                    .asFile
            inputs.file(cSource)
            inputs.files(fileTree("src/nativeInterop/cinterop") { include("*.h") })
            outputs.dir(outDir)

            doLast {
                outDir.mkdirs()
                val javaHome = System.getProperty("java.home") ?: System.getenv("JAVA_HOME") ?: ""
                val isWindows =
                    org.gradle.internal.os.OperatingSystem
                        .current()
                        .isWindows
                val isMac =
                    org.gradle.internal.os.OperatingSystem
                        .current()
                        .isMacOsX

                val (libName, osInclude) =
                    when {
                        isWindows -> "${ffiNameLower}_jni.dll" to "win32"
                        isMac -> "lib${ffiNameLower}_jni.dylib" to "darwin"
                        else -> "lib${ffiNameLower}_jni.so" to "linux"
                    }
                val outFile = File(outDir, libName)
                val javaInclude = File(javaHome, "include")
                val javaOsInclude = File(javaInclude, osInclude)

                check(!outFile.exists() || outFile.delete()) { "Cannot remove old JNI artifact: $outFile" }
                if (javaInclude.resolve("jni.h").isFile && javaOsInclude.resolve("jni_md.h").isFile) {
                    val execOps = project.serviceOf<ExecOperations>()
                    try {
                        val cmd =
                            mutableListOf(
                                "clang",
                                "-shared",
                                "-O2",
                                "-I${javaInclude.absolutePath}",
                                "-I${javaOsInclude.absolutePath}",
                                cSource.absolutePath,
                                "-o",
                                outFile.absolutePath,
                            )
                        if (!isWindows) {
                            cmd.add(2, "-fPIC")
                        } else {
                            cmd.addAll(listOf("-lws2_32"))
                        }
                        execOps
                            .exec {
                                commandLine(cmd)
                            }.assertNormalExitValue()
                    } catch (e: Exception) {
                        throw GradleException("Could not compile ${ffiNameLower}_jni with host clang", e)
                    }
                    check(outFile.isFile && outFile.length() > 0L) { "JNI compiler produced no artifact: $outFile" }
                } else {
                    throw GradleException("JNI headers are required at $javaInclude and $javaOsInclude")
                }
            }
        }

    val packageFfiJni =
        tasks.register<Sync>("package${ffiName}Jni") {
            dependsOn(compileFfiJni)
            val hostPlatform =
                if (isWindowsHost) {
                    "windows"
                } else if (isMacHost) {
                    "macos"
                } else {
                    "linux"
                }
            val hostArchitecture =
                when (providers.systemProperty("os.arch").get().lowercase()) {
                    "aarch64", "arm64" -> "aarch64"
                    "amd64", "x86_64" -> "x86_64"
                    else -> throw GradleException("Unsupported JNI host architecture")
                }
            from(layout.buildDirectory.dir("natives")) {
                include("*.so", "*.dll", "*.dylib")
                into("$projectNsPath/native/$hostPlatform-$hostArchitecture")
            }
            from(layout.buildDirectory.dir("jni-distribution")) {
                exclude("$hostPlatform-$hostArchitecture/**")
                into("$projectNsPath/native")
            }
            into(layout.buildDirectory.dir("generated/jniResources"))
        }
    kotlin.sourceSets.named("jvmMain") { resources.srcDir(packageFfiJni) }

    tasks.withType<Test>().matching { it.name == "jvmTest" || it.name == "testAndroidHostTest" }.configureEach {
        dependsOn(compileFfiJni)
        systemProperty(
            "java.library.path",
            layout.buildDirectory
                .dir("natives")
                .get()
                .asFile.absolutePath,
        )
    }

    val packagedJniTest =
        tasks.register<Test>("packagedJniTest") {
            dependsOn("jvmJar", "jvmTestClasses")
            val jvmTest = tasks.named<Test>("jvmTest")
            testClassesDirs = jvmTest.get().testClassesDirs
            val mainOutput =
                kotlin.targets
                    .getByName("jvm")
                    .compilations
                    .getByName("main")
                    .output.allOutputs
            classpath = files(tasks.named<Jar>("jvmJar").flatMap { it.archiveFile }) + jvmTest.get().classpath.minus(mainOutput)
            systemProperty(
                "java.library.path",
                layout.buildDirectory
                    .dir("empty-native-search-path")
                    .get()
                    .asFile.absolutePath,
            )
            filter.isFailOnNoMatchingTests = false
            filter.includeTestsMatching("*.HostIoTest")
        }
    tasks.named("check") { dependsOn(packagedJniTest) }

    val compileAndroidJni =
        tasks.register<AndroidJniCompileTask>("compileAndroidJni") {
            if (nativeFfiEnabled && nativeFfiCompileWrapper) {
                dependsOn("compile${ffiName}WrapperForAndroidNativeArm64", "compile${ffiName}WrapperForAndroidNativeX64")
            }
            inputs.file("src/jvmMain/c/${ffiNameLower}_jni.c")
            inputs.files(fileTree("src/nativeInterop/cinterop") { include("*.h") })
            nativeDirectory.set(layout.buildDirectory.dir("android-jni"))
            doLast {
                if (isWindowsHost) throw GradleException("Build Android JNI payloads on the coordinated macOS or Linux host")
                val host = if (isMacHost) "osx" else "linux"
                val dependencyName = "target-toolchain-2-$host-android_ndk"
                val compilerDependencies = File(projectKonanDataDirectory.get(), "dependencies")
                val compilerReceipt = File(compilerDependencies, ".extracted")
                val compilerDirectory = File(compilerDependencies, dependencyName)
                val ndk =
                    if (
                        compilerReceipt.isFile && dependencyName in compilerReceipt.readLines() &&
                        compilerDirectory.isDirectory && compilerDirectory.list()?.isNotEmpty() == true
                    ) {
                        compilerDirectory
                    } else {
                        layout.buildDirectory
                            .dir("native-wrapper-dependencies/$dependencyName")
                            .get()
                            .asFile
                    }
                val source = file("src/jvmMain/c/${ffiNameLower}_jni.c")
                val api = providers.gradleProperty("android.minSdk").getOrElse("24")
                val execOps = project.serviceOf<ExecOperations>()
                for ((abi, triple) in listOf("arm64-v8a" to "aarch64-linux-android", "x86_64" to "x86_64-linux-android")) {
                    val compiler = File(ndk, "bin/$triple$api-clang")
                    if (!compiler.exists()) throw GradleException("Missing Android JNI compiler $compiler")
                    val output = nativeDirectory.get().asFile.resolve("$abi/lib${ffiNameLower}_jni.so")
                    output.parentFile.mkdirs()
                    execOps
                        .exec {
                            commandLine(compiler.absolutePath, "--sysroot=${ndk.resolve("sysroot")}", "-shared", "-fPIC", "-O2", "-Wall", "-Wextra", "-Werror", "-Wl,-z,max-page-size=16384", source.absolutePath, "-o", output.absolutePath)
                        }.assertNormalExitValue()
                }
            }
        }
    extensions.getByType<KotlinMultiplatformAndroidComponentsExtension>().onVariants { variant ->
        requireNotNull(variant.sources.jniLibs).addGeneratedSourceDirectory(compileAndroidJni) { it.nativeDirectory }
    }

    tasks.register("verifyJniDistribution") {
        dependsOn(packageFfiJni)
        doLast {
            val root =
                layout.buildDirectory
                    .dir("generated/jniResources/$projectNsPath/native")
                    .get()
                    .asFile
            val required = listOf("macos-aarch64/lib${ffiNameLower}_jni.dylib", "linux-x86_64/lib${ffiNameLower}_jni.so", "linux-aarch64/lib${ffiNameLower}_jni.so", "windows-x86_64/${ffiNameLower}_jni.dll")
            required.forEach { relative ->
                if (!root.resolve(relative).isFile) throw GradleException("Missing release JNI payload: $relative")
            }
        }
    }
}

// ============================================================================
// N-API — JS/WASM C bindings. Gated by project.ffi.napi=true.
// ============================================================================
if (napiFfiEnabled) {
    val nodeExecutable = rootProject.extensions.getByType<NodeJsEnvSpec>().executable
    val addonDirectory = rootProject.file(ffiNapiDir)
    val installNodeFfiHeaders =
        tasks.register<Exec>("installNode$ffiName" + "Headers") {
            group = "build"
            description = "Installs the N-API C++ header dependency with package scripts disabled."
            dependsOn(rootProject.tasks.named("kotlinNodeJsSetup"))
            workingDir = addonDirectory
            doFirst {
                val node = File(nodeExecutable.get())
                val npm =
                    if (System.getProperty("os.name").startsWith("Windows")) {
                        File(node.parentFile, "node_modules/npm/bin/npm-cli.js")
                    } else {
                        File(node.parentFile.parentFile, "lib/node_modules/npm/bin/npm-cli.js")
                    }
                val scratch =
                    layout.buildDirectory
                        .dir("tmp/node-ffi-npm")
                        .get()
                        .asFile
                        .apply { mkdirs() }
                environment("TMPDIR", scratch.absolutePath)
                environment("TMP", scratch.absolutePath)
                environment("TEMP", scratch.absolutePath)
                commandLine(
                    listOf(
                        node.absolutePath,
                        npm.absolutePath,
                        if (addonDirectory.resolve("package-lock.json").isFile) "ci" else "install",
                        "--ignore-scripts",
                        "--omit=dev",
                        "--no-audit",
                        "--no-fund",
                    ) +
                        if (gradle.startParameter.isOffline) listOf("--offline") else emptyList(),
                )
            }
        }
    val buildNodeFfi =
        tasks.register<BuildToolTask>("buildNode$ffiName") {
            group = "build"
            description = "Builds the native node-$ffiNameLower N-API addon with its declared binding settings."
            dependsOn(installNodeFfiHeaders)
            toolClass.set(NodeFfiBuilder::class.java.name)
            arguments.addAll(
                "--project-dir",
                rootProject.projectDir.absolutePath,
                "--addon-dir",
                addonDirectory.absolutePath,
                "--build-dir",
                layout.buildDirectory
                    .get()
                    .asFile.absolutePath,
                "--node-version",
                nodeVersion,
            )
            arguments.addAll(nodeExecutable.map { listOf("--node", it) })
            if (gradle.startParameter.isOffline) arguments.add("--offline")
        }

    val copyNodeFfi =
        tasks.register<Copy>("copyNode$ffiName") {
            dependsOn(
                buildNodeFfi,
                rootProject.tasks.named("kotlinNpmInstall"),
                rootProject.tasks.named("kotlinUpgradeYarnLock"),
            )
            outputs.upToDateWhen { false }
            from(addonDirectory)
            into(rootProject.layout.buildDirectory.dir("js/node_modules/$ffiNpmPackage"))
        }
    val copyWasmNodeFfi =
        tasks.register<Copy>("copyWasmNode$ffiName") {
            dependsOn(
                buildNodeFfi,
                rootProject.tasks.named("kotlinWasmNpmInstall"),
                rootProject.tasks.named("kotlinWasmUpgradeYarnLock"),
            )
            outputs.upToDateWhen { false }
            from(addonDirectory)
            into(rootProject.layout.buildDirectory.dir("wasm/node_modules/$ffiNpmPackage"))
        }
    tasks.matching { it.name.startsWith("jsNodeTest") || it.name.startsWith("wasmJsNodeTest") }.configureEach {
        dependsOn(copyNodeFfi, copyWasmNodeFfi)
    }
}

// Propagate JNI and N-API native bindings from composite includedBuilds
val extraJavaLibPaths = mutableListOf<String>()
if (jvmFfiEnabled) {
    extraJavaLibPaths.add(
        layout.buildDirectory
            .dir("natives")
            .get()
            .asFile.absolutePath,
    )
}
gradle.includedBuilds.forEach { ib ->
    val ibPropsFile = File(ib.projectDir, "gradle.properties")
    if (ibPropsFile.exists()) {
        val ibProps =
            ibPropsFile
                .readLines()
                .map { it.trim() }
                .filter { it.isNotEmpty() && !it.startsWith("#") && '=' in it }
                .associate { it.substringBefore('=').trim() to it.substringAfter('=').trim() }
        val ibFfiRaw = (ibProps["project.ffi.name"] ?: "Ffi").trim()
        val ibFfiName = ibFfiRaw.replaceFirstChar { it.uppercase() }
        val ibFfiLower = ibFfiRaw.lowercase()
        val ibJvmFfi = (ibProps["project.ffi.jvm"] ?: "false").trim().lowercase() == "true"
        val ibNapiFfi = (ibProps["project.ffi.napi"] ?: "false").trim().lowercase() == "true"
        val ibHasLibrarySubproject = File(ib.projectDir, "library").isDirectory
        val ibTaskPrefix = if (ibHasLibrarySubproject) ":library" else ""
        val ibBuildPrefix = if (ibHasLibrarySubproject) "library/build" else "build"

        if (ibJvmFfi) {
            extraJavaLibPaths.add(File(ib.projectDir, "$ibBuildPrefix/natives").absolutePath)
            tasks.named<Test>("jvmTest") {
                dependsOn(ib.task("$ibTaskPrefix:compile${ibFfiName}Jni"))
            }
        }
        if (ibNapiFfi) {
            val copyIbNode =
                tasks.register<Copy>("copyIncludedNode$ibFfiName") {
                    dependsOn(
                        ib.task("$ibTaskPrefix:buildNode$ibFfiName"),
                        rootProject.tasks.named("kotlinNpmInstall"),
                        rootProject.tasks.named("kotlinUpgradeYarnLock"),
                    )
                    outputs.upToDateWhen { false }
                    from(File(ib.projectDir, "native/node-$ibFfiLower"))
                    into(rootProject.layout.buildDirectory.dir("js/node_modules/@kotlinmania/$ibFfiLower-native-bindings"))
                }
            val copyIbWasmNode =
                tasks.register<Copy>("copyIncludedWasmNode$ibFfiName") {
                    dependsOn(
                        ib.task("$ibTaskPrefix:buildNode$ibFfiName"),
                        rootProject.tasks.named("kotlinWasmNpmInstall"),
                        rootProject.tasks.named("kotlinWasmUpgradeYarnLock"),
                    )
                    outputs.upToDateWhen { false }
                    from(File(ib.projectDir, "native/node-$ibFfiLower"))
                    into(rootProject.layout.buildDirectory.dir("wasm/node_modules/@kotlinmania/$ibFfiLower-native-bindings"))
                }
            tasks.matching { it.name.startsWith("jsNodeTest") || it.name.startsWith("wasmJsNodeTest") }.configureEach {
                dependsOn(copyIbNode, copyIbWasmNode)
            }
        }
    }
}
if (extraJavaLibPaths.isNotEmpty()) {
    tasks.named<Test>("jvmTest") {
        systemProperty("java.library.path", extraJavaLibPaths.joinToString(File.pathSeparator))
    }
}
