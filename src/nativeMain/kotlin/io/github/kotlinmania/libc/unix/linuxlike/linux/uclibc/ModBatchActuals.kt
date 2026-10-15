// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_gettimeofday

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.handle.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun pthreadRwlockattrGetkindNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetkindNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: UInt, vararg args: Any?): Long =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("sendmmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires FFI bridge")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires FFI bridge")

public actual fun sethostid(hostid: Long): Int =
    throw UnsupportedOperationException("sethostid requires manual FFI bridge — not yet implemented")

public actual fun fanotifyMark(fd: Int, flags: UInt, mask: ULong, dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("fanotifyMark requires manual FFI bridge — not yet implemented")

public actual fun getrlimit64(resource: ULong, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun setrlimit64(resource: ULong, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun getrlimit(resource: ULong, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit requires FFI bridge")

public actual fun setrlimit(resource: ULong, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit requires FFI bridge")

public actual fun getpriority(which: UInt, who: UInt): Int =
    throw UnsupportedOperationException("getpriority requires FFI bridge")

public actual fun setpriority(which: UInt, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority requires FFI bridge")

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval requires manual FFI bridge — not yet implemented")
