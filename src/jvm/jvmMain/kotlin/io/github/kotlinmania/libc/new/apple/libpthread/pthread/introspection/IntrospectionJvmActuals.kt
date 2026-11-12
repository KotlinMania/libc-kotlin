@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.introspection

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadKeyT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewAppleLibpthreadPthreadIntrospectionJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "libc_jni.dll"
                "macos" -> "liblibc_jni.dylib"
                else -> "liblibc_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/libc/native/$hostPlatform-$hostArch/$libFileName"
        val stream = NewAppleLibpthreadPthreadIntrospectionJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("libc_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionHookInstall(hook: Long): Long

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionSetspecificNp(thread: Long, key: Long, value: Long): Int

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionGetspecificNp(thread: Long, key: Long): Long
}

public actual fun pthreadIntrospectionHookInstall(hook: PthreadIntrospectionHookT): PthreadIntrospectionHookT =
    PthreadIntrospectionHookT { _, _, _, _ -> }

public actual fun pthreadIntrospectionSetspecificNp(thread: PthreadT, key: PthreadKeyT, value: ConstPtr): CInt =
    NewAppleLibpthreadPthreadIntrospectionJniBridge.libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionSetspecificNp(thread.toLong(), key.toLong(), value.rawAddress)

public actual fun pthreadIntrospectionGetspecificNp(thread: PthreadT, key: PthreadKeyT): MutPtr =
    MutPtr(NewAppleLibpthreadPthreadIntrospectionJniBridge.libcNewAppleLibpthreadPthreadIntrospectionPthreadIntrospectionGetspecificNp(thread.toLong(), key.toLong()))
