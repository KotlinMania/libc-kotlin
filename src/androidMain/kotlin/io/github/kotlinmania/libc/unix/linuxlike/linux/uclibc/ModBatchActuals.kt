// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("gettimeofday not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrGetkindNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrSetkindNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp not available on Android host — use androidNative target for FFI")

public actual fun ptrace(request: UInt, vararg args: Any?): Long =
    throw UnsupportedOperationException("ptrace not available on Android host — use androidNative target for FFI")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("sendmmsg not available on Android host — use androidNative target for FFI")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg not available on Android host — use androidNative target for FFI")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty not available on Android host — use androidNative target for FFI")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty not available on Android host — use androidNative target for FFI")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun sethostid(hostid: Long): Int =
    throw UnsupportedOperationException("sethostid not available on Android host — use androidNative target for FFI")

public actual fun fanotifyMark(fd: Int, flags: UInt, mask: ULong, dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("fanotifyMark not available on Android host — use androidNative target for FFI")

public actual fun getrlimit64(resource: ULong, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 not available on Android host — use androidNative target for FFI")

public actual fun setrlimit64(resource: ULong, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 not available on Android host — use androidNative target for FFI")

public actual fun getrlimit(resource: ULong, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on Android host — use androidNative target for FFI")

public actual fun setrlimit(resource: ULong, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on Android host — use androidNative target for FFI")

public actual fun getpriority(which: UInt, who: UInt): Int =
    throw UnsupportedOperationException("getpriority not available on Android host — use androidNative target for FFI")

public actual fun setpriority(which: UInt, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority not available on Android host — use androidNative target for FFI")

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval not available on Android host — use androidNative target for FFI")
