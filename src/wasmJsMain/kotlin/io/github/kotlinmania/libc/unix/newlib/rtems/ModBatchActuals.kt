// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires N-API addon")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires N-API addon")

public actual fun setgroups(ngroups: Int, grouplist: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires N-API addon")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires N-API addon")
