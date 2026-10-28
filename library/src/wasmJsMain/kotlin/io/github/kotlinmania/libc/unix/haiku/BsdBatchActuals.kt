// port-lint: source Bsd.rs
package io.github.kotlinmania.libc.unix.haiku
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires N-API addon")

public actual fun setprogname(progname: String?): Unit = throw UnsupportedOperationException("setprogname requires N-API addon")

public actual fun arc4randomBuf(buf: COpaquePointer?, n: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires N-API addon")

public actual fun mkstemps(template: String?, suffixlen: Int): Int =
    throw UnsupportedOperationException("mkstemps requires N-API addon")

public actual fun strtonum(nptr: String?, minval: Long, maxval: Long, errstr: COpaquePointer?): Long =
    throw UnsupportedOperationException("strtonum requires N-API addon")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty requires N-API addon")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun strsep(string: COpaquePointer?, delimiters: String?): String? =
    throw UnsupportedOperationException("strsep requires N-API addon")

public actual fun explicitBzero(buf: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero requires N-API addon")

public actual fun slInit(): io.github.kotlinmania.libc.unix.haiku.Stringlist? =
    throw UnsupportedOperationException("slInit requires N-API addon")

public actual fun slAdd(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, n: String?): Int =
    throw UnsupportedOperationException("slAdd requires N-API addon")

public actual fun slFree(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, i: Int): Unit = throw UnsupportedOperationException("slFree requires N-API addon")

public actual fun slFind(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, n: String?): String? =
    throw UnsupportedOperationException("slFind requires N-API addon")

public actual fun kqueue(): Int =
    throw UnsupportedOperationException("kqueue requires N-API addon")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent requires N-API addon")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes requires N-API addon")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int =
    throw UnsupportedOperationException("wait4 requires N-API addon")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires N-API addon")
