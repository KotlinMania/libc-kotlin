@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_unix_newlib_rtems_arc4randomBuf
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_unix_newlib_rtems_futimens
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_unix_newlib_rtems_getentropy
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_unix_newlib_rtems_pthreadCondattrSetclock
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_unix_newlib_rtems_pthreadCreate
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_unix_newlib_rtems_readv
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_unix_newlib_rtems_setgroups
import io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_unix_newlib_rtems_writev
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    libc_unix_newlib_rtems_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_unix_newlib_rtems_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    libc_unix_newlib_rtems_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_unix_newlib_rtems_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    libc_unix_newlib_rtems_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    libc_unix_newlib_rtems_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    libc_unix_newlib_rtems_arc4randomBuf(buf?.value?.toCPointer<ByteVar>(), nbytes)
}

public actual fun setgroups(ngroups: CInt, grouplist: COpaquePointer?): CInt =
    libc_unix_newlib_rtems_setgroups(ngroups, grouplist?.value?.toCPointer<ByteVar>())
