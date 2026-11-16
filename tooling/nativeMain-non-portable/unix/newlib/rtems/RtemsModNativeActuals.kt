@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_rtems_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_rtems_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_rtems_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_rtems_mod_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_rtems_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_rtems_mod_getentropy(buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_rtems_mod_arc4random_buf(buf?.value?.toCPointer<ByteVar>(), nbytes)
}

public actual fun setgroups(ngroups: CInt, grouplist: GidT?): CInt =
    io.github.kotlinmania.libc.unix.newlib.rtems.cinterop.libc_rtems_mod_setgroups(ngroups, grouplist?.value?.toCPointer<ByteVar>())
