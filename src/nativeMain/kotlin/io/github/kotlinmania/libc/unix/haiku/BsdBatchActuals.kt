// port-lint: source Bsd.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_daemon
import libc.cinterop.libc_mkstemps
import libc.cinterop.libc_strtonum

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    libc.cinterop.libc_daemon(nochdir, noclose)

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires manual FFI bridge — not yet implemented")

public actual fun setprogname(progname: String?): Unit = throw UnsupportedOperationException("setprogname requires manual FFI bridge — not yet implemented")

public actual fun arc4randomBuf(buf: COpaquePointer?, n: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")

public actual fun mkstemps(template: String?, suffixlen: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkstemps(template, suffixlen)
}

public actual fun strtonum(nptr: String?, minval: Long, maxval: Long, errstr: COpaquePointer?): Long {
    if (nptr == null) return 0
    return libc.cinterop.libc_strtonum(nptr, minval, maxval, errstr?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty requires manual FFI bridge — not yet implemented")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun strsep(string: COpaquePointer?, delimiters: String?): String? =
    throw UnsupportedOperationException("strsep requires manual FFI bridge — not yet implemented")

public actual fun explicitBzero(buf: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero requires manual FFI bridge — not yet implemented")

public actual fun slInit(): io.github.kotlinmania.libc.unix.haiku.Stringlist? =
    throw UnsupportedOperationException("slInit requires manual FFI bridge — not yet implemented")

public actual fun slAdd(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, n: String?): Int =
    throw UnsupportedOperationException("slAdd requires manual FFI bridge — not yet implemented")

public actual fun slFree(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, i: Int): Unit = throw UnsupportedOperationException("slFree requires manual FFI bridge — not yet implemented")

public actual fun slFind(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, n: String?): String? =
    throw UnsupportedOperationException("slFind requires manual FFI bridge — not yet implemented")

public actual fun kqueue(): Int =
    throw UnsupportedOperationException("kqueue requires manual FFI bridge — not yet implemented")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent requires manual FFI bridge — not yet implemented")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes requires manual FFI bridge — not yet implemented")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires FFI bridge")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires FFI bridge")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 requires manual FFI bridge — not yet implemented")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires manual FFI bridge — not yet implemented")
