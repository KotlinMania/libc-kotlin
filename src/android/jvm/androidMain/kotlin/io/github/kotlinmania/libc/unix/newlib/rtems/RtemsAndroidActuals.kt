@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNewlibRtemsJniBridge {
    init {
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

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsFutimens(fd, times.rawAddress)

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsReadv(fd, iov.rawAddress, iovcnt)

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsPthreadCondattrSetclock(attr.rawAddress, clockId.toLong())

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsGetentropy(buf.rawAddress, buflen.toLong())

public actual fun arc4randomBuf(buf: MutPtr, nbytes: SizeT) {
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsArc4randomBuf(buf.rawAddress, nbytes.toLong())
}

public actual fun setgroups(ngroups: CInt, grouplist: ConstPtr): CInt =
    UnixNewlibRtemsJniBridge.libcUnixNewlibRtemsSetgroups(ngroups, grouplist.rawAddress)
