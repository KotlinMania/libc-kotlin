// port-lint: source Bsd.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname requires N-API addon")

public actual fun setprogname(progname: String?) {
    throw UnsupportedOperationException("setprogname requires N-API addon")
}

public actual fun arc4randomBuf(buf: COpaquePointer?, n: ULong) {
    throw UnsupportedOperationException("arc4randomBuf requires N-API addon")
}

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps requires N-API addon")

public actual fun strtonum(nptr: String?, minval: CLongLong, maxval: CLongLong, errstr: COpaquePointer?): CLongLong =
    throw UnsupportedOperationException("strtonum requires N-API addon")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires N-API addon")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun strsep(string: COpaquePointer?, delimiters: String?): String? =
    throw UnsupportedOperationException("strsep requires N-API addon")

public actual fun explicitBzero(buf: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero requires N-API addon")
}

public actual fun slInit(): StringList? =
    throw UnsupportedOperationException("slInit requires N-API addon")

public actual fun slAdd(sl: StringList?, n: String?): CInt =
    throw UnsupportedOperationException("slAdd requires N-API addon")

public actual fun slFree(sl: StringList?, i: CInt) {
    throw UnsupportedOperationException("slFree requires N-API addon")
}

public actual fun slFind(sl: StringList?, n: String?): String? =
    throw UnsupportedOperationException("slFind requires N-API addon")

public actual fun kqueue(): CInt =
    throw UnsupportedOperationException("kqueue requires N-API addon")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent requires N-API addon")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes requires N-API addon")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 requires N-API addon")

