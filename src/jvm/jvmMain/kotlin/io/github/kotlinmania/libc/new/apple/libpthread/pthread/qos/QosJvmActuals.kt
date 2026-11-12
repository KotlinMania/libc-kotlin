@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.apple.libpthread.pthread.qos

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.apple.libpthread.sys.qos.QosClassT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewAppleLibpthreadPthreadQosJniBridge {
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
        val stream = NewAppleLibpthreadPthreadQosJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp(attr: Long, cls: Long, priority: Long): Int

    @JvmStatic
    external fun libcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp(thread: Long, cls: Long, priority: Long): Int
}

public actual fun pthreadAttrSetQosClassNp(attr: MutPtr, cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadAttrGetQosClassNp(attr: MutPtr, cls: MutPtr, priority: MutPtr): CInt =
    NewAppleLibpthreadPthreadQosJniBridge.libcNewAppleLibpthreadPthreadQosPthreadAttrGetQosClassNp(attr.rawAddress, cls.rawAddress, priority.rawAddress)

public actual fun pthreadSetQosClassSelfNp(cls: QosClassT, priority: CInt): CInt =
    0

public actual fun pthreadGetQosClassNp(thread: PthreadT, cls: MutPtr, priority: MutPtr): CInt =
    NewAppleLibpthreadPthreadQosJniBridge.libcNewAppleLibpthreadPthreadQosPthreadGetQosClassNp(thread.toLong(), cls.rawAddress, priority.rawAddress)
