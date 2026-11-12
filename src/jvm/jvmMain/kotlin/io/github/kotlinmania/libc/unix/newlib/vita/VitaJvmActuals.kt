@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNewlibVitaJniBridge {
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
        val stream = UnixNewlibVitaJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixNewlibVitaFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixNewlibVitaReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixNewlibVitaSendmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibVitaRecvmsg(s: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadAttrGetprocessoridNp(attr: Long, processorId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadAttrSetprocessoridNp(attr: Long, processorId: Int): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPthreadGetprocessoridNp(): Int

    @JvmStatic
    external fun libcUnixNewlibVitaGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixNewlibVitaPipe2(fds: Long, flags: Int): Int
}

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaFutimens(fd, times.rawAddress)

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaReadv(fd, iov.rawAddress, iovcnt)

public actual fun sendmsg(s: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaSendmsg(s, msg.rawAddress, flags)

public actual fun recvmsg(s: CInt, msg: MutPtr, flags: CInt): SsizeT =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaRecvmsg(s, msg.rawAddress, flags)

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadAttrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadAttrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrGetprocessoridNp(attr: ConstPtr, processorId: MutPtr): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadAttrGetprocessoridNp(attr.rawAddress, processorId.rawAddress)

public actual fun pthreadAttrSetprocessoridNp(attr: MutPtr, processorId: CInt): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadAttrSetprocessoridNp(attr.rawAddress, processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadCondattrSetclock(attr.rawAddress, clockId.toLong())

public actual fun pthreadGetprocessoridNp(): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPthreadGetprocessoridNp()

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaGetentropy(buf.rawAddress, buflen.toLong())

public actual fun pipe2(fds: MutPtr, flags: CInt): CInt =
    UnixNewlibVitaJniBridge.libcUnixNewlibVitaPipe2(fds.rawAddress, flags)
