@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.semaphore

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtSemaphoreJniBridge {
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
        val stream = NewQurtSemaphoreJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcNewQurtSemaphoreSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcNewQurtSemaphoreSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcNewQurtSemaphoreSemWait(sem: Long): Int

    @JvmStatic
    external fun libcNewQurtSemaphoreSemTrywait(sem: Long): Int

    @JvmStatic
    external fun libcNewQurtSemaphoreSemPost(sem: Long): Int

    @JvmStatic
    external fun libcNewQurtSemaphoreSemGetvalue(sem: Long, sval: Long): Int
}

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun semDestroy(sem: MutPtr): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemDestroy(sem.rawAddress)

public actual fun semWait(sem: MutPtr): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemWait(sem.rawAddress)

public actual fun semTrywait(sem: MutPtr): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemTrywait(sem.rawAddress)

public actual fun semPost(sem: MutPtr): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemPost(sem.rawAddress)

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    NewQurtSemaphoreJniBridge.libcNewQurtSemaphoreSemGetvalue(sem.rawAddress, sval.rawAddress)
