// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp requires N-API addon")

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp requires N-API addon")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("getrlimit64 requires N-API addon")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("setrlimit64 requires N-API addon")

public actual fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun getauxval(type: CULong): CULong =
    throw UnsupportedOperationException("getauxval requires N-API addon")

