@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.espidf

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNewlibEspidfJniBridge {
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
        val stream = UnixNewlibEspidfJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixNewlibEspidfPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixNewlibEspidfGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibEspidfGethostname(name: Long, namelen: Long)

    @JvmStatic
    external fun libcUnixNewlibEspidfSendmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibEspidfRecvmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibEspidfEventfd(initval: Int, flags: Int): Int
}

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun gethostname(name: MutPtr, namelen: SsizeT) {
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfGethostname(name.rawAddress, namelen)
}

public actual fun sendmsg(s: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfSendmsg(s, msg.rawAddress, flags)

public actual fun recvmsg(s: CInt, msg: MutPtr, flags: CInt): SsizeT =
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfRecvmsg(s, msg.rawAddress, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    UnixNewlibEspidfJniBridge.libcUnixNewlibEspidfEventfd(initval.toInt(), flags)
