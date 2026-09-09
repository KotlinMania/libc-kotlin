// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.ByteVar

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    libc.cinterop.libc_gettimeofday(tp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), tz?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    libc.cinterop.libc_pwritev(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    libc.cinterop.libc_preadv(fd, iov?.handle?.toCPointer<kotlinx.cinterop.ByteVar>(), iovcnt, offset)

public actual fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("getrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("setrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    libc.cinterop.libc_getrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    libc.cinterop.libc_setrlimit(resource, rlim?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun getauxval(type: CULong): CULong =
    throw UnsupportedOperationException("getauxval requires manual FFI bridge — not yet implemented")
