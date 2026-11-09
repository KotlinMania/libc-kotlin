@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT

private object UnixNewlibRtemsJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_newlib_rtems_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_rtems_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_newlib_rtems_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_newlib_rtems_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_rtems_pthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_rtems_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_newlib_rtems_arc4randomBuf(buf: Long, nbytes: Long)

    @JvmStatic
    external fun libc_unix_newlib_rtems_setgroups(ngroups: Int, grouplist: Long): Int
}

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixNewlibRtemsJniBridge.libc_unix_newlib_rtems_futimens(fd, (times?.value ?: 0L))

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixNewlibRtemsJniBridge.libc_unix_newlib_rtems_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixNewlibRtemsJniBridge.libc_unix_newlib_rtems_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    UnixNewlibRtemsJniBridge.libc_unix_newlib_rtems_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixNewlibRtemsJniBridge.libc_unix_newlib_rtems_pthreadCondattrSetclock((attr?.value ?: 0L), clockId.toLong())

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixNewlibRtemsJniBridge.libc_unix_newlib_rtems_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    UnixNewlibRtemsJniBridge.libc_unix_newlib_rtems_arc4randomBuf((buf?.value ?: 0L), nbytes.toLong())
}

public actual fun setgroups(ngroups: CInt, grouplist: COpaquePointer?): CInt =
    UnixNewlibRtemsJniBridge.libc_unix_newlib_rtems_setgroups(ngroups, (grouplist?.value ?: 0L))
