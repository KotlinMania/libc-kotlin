@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.newlib.rtems
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Timespec
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_futimens

public actual fun futimens(fd: Int, times: Timespec?): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_futimens(fd, timesPtr)
    return result
}

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("writev requires FFI bridge")

public actual fun readv(fd: Int, iov: Iovec?, iovcnt: Int): Long =
    throw UnsupportedOperationException("readv requires FFI bridge")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires manual FFI bridge — not yet implemented")

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")

public actual fun setgroups(ngroups: Int, grouplist: UInt?): Int =
    throw UnsupportedOperationException("setgroups requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")
