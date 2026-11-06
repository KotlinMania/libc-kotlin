package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.COpaquePointer

internal object RtemsModRawLibc {
    external fun futimens(fd: Int, times: Long): Int
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Int): Int
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun arc4randomBuf(buf: Long, nbytes: Long)
    external fun setgroups(ngroups: Int, grouplist: Long): Int
}

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    RtemsModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    RtemsModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    RtemsModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    RtemsModRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    RtemsModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    RtemsModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    RtemsModRawLibc.arc4randomBuf(buf?.value ?: 0L, nbytes)
}

public actual fun setgroups(ngroups: CInt, grouplist: GidT?): CInt =
    RtemsModRawLibc.setgroups(ngroups, grouplist?.toLong() ?: 0L)
