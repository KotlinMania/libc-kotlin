@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadAttrT
import io.github.kotlinmania.libc.unix.newlib.PthreadCondattrT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNewlibRtemsJniBridge {
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
        val stream = UnixNewlibRtemsJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixNewlibRtemsFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixNewlibRtemsWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixNewlibRtemsReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixNewlibRtemsPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixNewlibRtemsPthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibRtemsGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixNewlibRtemsArc4randomBuf(buf: Long, nbytes: Long)

    @JvmStatic
    external fun libcUnixNewlibRtemsSetgroups(ngroups: Int, grouplist: Long): Int
}

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsFutimens(fd, times.rawAddress)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsReadv(fd, iov.rawAddress, iovcnt)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsPthreadCondattrSetclock(attr.rawAddress, clockId.toLong())

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsGetentropy(buf.rawAddress, buflen.toLong())

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, nbytes: SizeT) {
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsArc4randomBuf(buf.rawAddress, nbytes.toLong())
}

public actual fun setgroups(ngroups: CInt, grouplist: ConstPtr<GidT>): CInt =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsSetgroups(ngroups, grouplist.rawAddress)
