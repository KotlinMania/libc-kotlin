// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp not available on JVM — no C library access")

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp not available on JVM — no C library access")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo not available on JVM — no C library access")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev not available on JVM — no C library access")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv not available on JVM — no C library access")

public actual fun getrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 not available on JVM — no C library access")

public actual fun setrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 not available on JVM — no C library access")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on JVM — no C library access")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on JVM — no C library access")

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval not available on JVM — no C library access")
