// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong) {
    throw UnsupportedOperationException("arc4randomBuf requires N-API addon")
}

public actual fun setgroups(ngroups: CInt, grouplist: GidT?): CInt =
    throw UnsupportedOperationException("setgroups requires N-API addon")

