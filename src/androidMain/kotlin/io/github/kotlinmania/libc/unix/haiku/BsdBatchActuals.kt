// port-lint: source Bsd.rs
package io.github.kotlinmania.libc.unix.haiku
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize

import io.github.kotlinmania.libc.*

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon not available on Android host — use androidNative target for FFI")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname not available on Android host — use androidNative target for FFI")

public actual fun setprogname(progname: String?): Unit = throw UnsupportedOperationException("setprogname not available on Android host — use androidNative target for FFI")

public actual fun arc4randomBuf(buf: COpaquePointer?, n: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf not available on Android host — use androidNative target for FFI")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps not available on Android host — use androidNative target for FFI")

public actual fun strtonum(nptr: String?, minval: Long, maxval: Long, errstr: COpaquePointer?): Long =
    throw UnsupportedOperationException("strtonum not available on Android host — use androidNative target for FFI")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty not available on Android host — use androidNative target for FFI")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty not available on Android host — use androidNative target for FFI")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty not available on Android host — use androidNative target for FFI")

public actual fun strsep(string: COpaquePointer?, delimiters: String?): String? =
    throw UnsupportedOperationException("strsep not available on Android host — use androidNative target for FFI")

public actual fun explicitBzero(buf: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero not available on Android host — use androidNative target for FFI")

public actual fun slInit(): io.github.kotlinmania.libc.unix.haiku.Stringlist? =
    throw UnsupportedOperationException("slInit not available on Android host — use androidNative target for FFI")

public actual fun slAdd(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, n: String?): Int =
    throw UnsupportedOperationException("slAdd not available on Android host — use androidNative target for FFI")

public actual fun slFree(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, i: Int): Unit = throw UnsupportedOperationException("slFree not available on Android host — use androidNative target for FFI")

public actual fun slFind(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, n: String?): String? =
    throw UnsupportedOperationException("slFind not available on Android host — use androidNative target for FFI")

public actual fun kqueue(): Int =
    throw UnsupportedOperationException("kqueue not available on Android host — use androidNative target for FFI")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent not available on Android host — use androidNative target for FFI")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 not available on Android host — use androidNative target for FFI")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr not available on Android host — use androidNative target for FFI")
