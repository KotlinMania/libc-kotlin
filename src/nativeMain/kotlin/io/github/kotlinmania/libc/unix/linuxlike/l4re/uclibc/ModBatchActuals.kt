// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_getrlimit
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_setrlimit

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    libc.cinterop.libc_gettimeofday(tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires FFI bridge")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires FFI bridge")

public actual fun getrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun setrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    libc.cinterop.libc_getrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    libc.cinterop.libc_setrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval requires manual FFI bridge — not yet implemented")
