@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.utmpx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.new.qurt.UidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewNetbsdUtmpxJniBridge {
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
        val stream = NewNetbsdUtmpxJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcNewNetbsdUtmpxSetutxent()

    @JvmStatic
    external fun libcNewNetbsdUtmpxEndutxent()

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetutxent(): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetutxid(ut: Long): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetutxline(ut: Long): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpxPututxline(ut: Long): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpxUpdwtmpx(file: Long, ut: Long): Int

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetlastlogx(fname: Long, uid: Int, ll: Long): Long

    @JvmStatic
    external fun libcNewNetbsdUtmpxUpdlastlogx(fname: Long, uid: Int, ll: Long): Int

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetutmp(ux: Long, u: Long)

    @JvmStatic
    external fun libcNewNetbsdUtmpxGetutmpx(u: Long, ux: Long)

    @JvmStatic
    external fun libcNewNetbsdUtmpxUtmpxname(file: Long): Int
}

public actual fun setutxent() {
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxSetutxent()
}

public actual fun endutxent() {
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxEndutxent()
}

public actual fun getutxent(): MutPtr =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutxent())

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutxline(ut.rawAddress))

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxPututxline(ut.rawAddress))

public actual fun updwtmpx(file: ConstPtr, ut: ConstPtr): CInt =
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxUpdwtmpx(file.rawAddress, ut.rawAddress)

public actual fun getlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): MutPtr =
    MutPtr(NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetlastlogx(fname.rawAddress, uid.toInt(), ll.rawAddress))

public actual fun updlastlogx(fname: ConstPtr, uid: UidT, ll: MutPtr): CInt =
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxUpdlastlogx(fname.rawAddress, uid.toInt(), ll.rawAddress)

public actual fun getutmp(ux: ConstPtr, u: MutPtr) {
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutmp(ux.rawAddress, u.rawAddress)
}

public actual fun getutmpx(u: ConstPtr, ux: MutPtr) {
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxGetutmpx(u.rawAddress, ux.rawAddress)
}

public actual fun utmpxname(file: ConstPtr): CInt =
    NewNetbsdUtmpxJniBridge.libcNewNetbsdUtmpxUtmpxname(file.rawAddress)
