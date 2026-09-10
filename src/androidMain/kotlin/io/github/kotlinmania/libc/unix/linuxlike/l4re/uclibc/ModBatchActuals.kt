// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp not available on Android host — use androidNative target for FFI")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty not available on Android host — use androidNative target for FFI")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("getrlimit64 not available on Android host — use androidNative target for FFI")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("setrlimit64 not available on Android host — use androidNative target for FFI")

public actual fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit not available on Android host — use androidNative target for FFI")

public actual fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit not available on Android host — use androidNative target for FFI")

public actual fun getauxval(type: CULong): CULong =
    throw UnsupportedOperationException("getauxval not available on Android host — use androidNative target for FFI")

