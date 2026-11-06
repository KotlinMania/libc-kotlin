package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.COpaquePointer

internal object BsdRawLibc {
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun getprogname(): Long?
    external fun setprogname(progname: String?)
    external fun arc4random(): Int
    external fun arc4randomUniform(upperBound: Int): Int
    external fun arc4randomBuf(buf: Long, n: Long)
    external fun mkstemps(template: Long, suffixlen: Int): Int
    external fun strtonum(nptr: String?, minval: Long, maxval: Long, errstr: Long): Long
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun loginTty(fd: Int): Int
    external fun forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int
    external fun strsep(string: Long, delimiters: String?): Long?
    external fun explicitBzero(buf: Long, len: Long)
    external fun slInit(): Long?
    external fun slAdd(sl: Long, n: Long): Int
    external fun slFree(sl: Long, i: Int)
    external fun slFind(sl: Long, n: Long): Long?
    external fun kqueue(): Int
    external fun kevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int
    external fun dlIteratePhdr(callback: Long, data: Long): Int
    external fun lutimes(file: String?, times: Long): Int
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun wait4(pid: Int, status: Long, options: Int, rusage: Long): Int
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    BsdRawLibc.daemon(nochdir, noclose)

public actual fun getprogname(): COpaquePointer? =
    BsdRawLibc.getprogname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(progname: String?) {
    BsdRawLibc.setprogname(progname)
}

public actual fun arc4random(): UInt =
    BsdRawLibc.arc4random()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    BsdRawLibc.arc4randomUniform(upperBound)

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    BsdRawLibc.arc4randomBuf(buf?.value ?: 0L, n)
}

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    BsdRawLibc.mkstemps(template?.value ?: 0L, suffixlen)

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    BsdRawLibc.strtonum(nptr, minval, maxval, errstr?.value ?: 0L)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    BsdRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun loginTty(fd: CInt): CInt =
    BsdRawLibc.loginTty(fd)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    BsdRawLibc.forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer? =
    BsdRawLibc.strsep(string?.value ?: 0L, delimiters).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun explicitBzero(buf: COpaquePointer?, len: SizeT) {
    BsdRawLibc.explicitBzero(buf?.value ?: 0L, len)
}

public actual fun slInit(): Stringlist? =
    BsdRawLibc.slInit()

public actual fun slAdd(sl: Stringlist?, n: COpaquePointer?): CInt =
    BsdRawLibc.slAdd(sl?.toLong() ?: 0L, n?.value ?: 0L)

public actual fun slFree(sl: Stringlist?, i: CInt) {
    BsdRawLibc.slFree(sl?.toLong() ?: 0L, i)
}

public actual fun slFind(sl: Stringlist?, n: COpaquePointer?): COpaquePointer? =
    BsdRawLibc.slFind(sl?.toLong() ?: 0L, n?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kqueue(): CInt =
    BsdRawLibc.kqueue()

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    BsdRawLibc.kevent(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, timeout?.toLong() ?: 0L)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    BsdRawLibc.dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    BsdRawLibc.lutimes(file, times?.toLong() ?: 0L)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    BsdRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    BsdRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    BsdRawLibc.wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)
