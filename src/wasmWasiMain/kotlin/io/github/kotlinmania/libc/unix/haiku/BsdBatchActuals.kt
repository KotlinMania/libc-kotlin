// port-lint: source Bsd.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon not available on WASI — no C library access")

public actual fun getprogname(): String? =
    throw UnsupportedOperationException("getprogname not available on WASI — no C library access")

public actual fun setprogname(progname: String?) {
    throw UnsupportedOperationException("setprogname not available on WASI — no C library access")
}

public actual fun arc4randomBuf(buf: COpaquePointer?, n: ULong) {
    throw UnsupportedOperationException("arc4randomBuf not available on WASI — no C library access")
}

public actual fun mkstemps(template: String?, suffixlen: CInt): CInt =
    throw UnsupportedOperationException("mkstemps not available on WASI — no C library access")

public actual fun strtonum(nptr: String?, minval: CLongLong, maxval: CLongLong, errstr: COpaquePointer?): CLongLong =
    throw UnsupportedOperationException("strtonum not available on WASI — no C library access")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty not available on WASI — no C library access")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty not available on WASI — no C library access")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty not available on WASI — no C library access")

public actual fun strsep(string: COpaquePointer?, delimiters: String?): String? =
    throw UnsupportedOperationException("strsep not available on WASI — no C library access")

public actual fun explicitBzero(buf: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero not available on WASI — no C library access")
}

public actual fun slInit(): StringList? =
    throw UnsupportedOperationException("slInit not available on WASI — no C library access")

public actual fun slAdd(sl: StringList?, n: String?): CInt =
    throw UnsupportedOperationException("slAdd not available on WASI — no C library access")

public actual fun slFree(sl: StringList?, i: CInt) {
    throw UnsupportedOperationException("slFree not available on WASI — no C library access")
}

public actual fun slFind(sl: StringList?, n: String?): String? =
    throw UnsupportedOperationException("slFind not available on WASI — no C library access")

public actual fun kqueue(): CInt =
    throw UnsupportedOperationException("kqueue not available on WASI — no C library access")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent not available on WASI — no C library access")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes not available on WASI — no C library access")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv not available on WASI — no C library access")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev not available on WASI — no C library access")

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    throw UnsupportedOperationException("wait4 not available on WASI — no C library access")

