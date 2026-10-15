// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.newlib.rtems

import io.github.kotlinmania.libc.*

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on Android host — use androidNative target for FFI")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev not available on Android host — use androidNative target for FFI")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on Android host — use androidNative target for FFI")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy not available on Android host — use androidNative target for FFI")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf not available on Android host — use androidNative target for FFI")

public actual fun setgroups(ngroups: Int, grouplist: UInt?): Int =
    throw UnsupportedOperationException("setgroups not available on Android host — use androidNative target for FFI")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on Android host — use androidNative target for FFI")
