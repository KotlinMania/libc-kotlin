package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.COpaquePointer

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun getprogname(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getprogname()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(progname: String?) {
    js("require('@kotlinmania/libc-native-bindings').setprogname(progname)")
}

public actual fun arc4random(): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4random()") as UInt

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4randomUniform(upperBound)") as UInt

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').arc4randomBuf(buf?.value ?: 0L, n)")
}

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkstemps(template?.value ?: 0L, suffixlen)") as CInt

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').strtonum(nptr, minval, maxval, errstr?.value ?: 0L)") as CLonglong

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun loginTty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').loginTty(fd)") as CInt

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    js("require('@kotlinmania/libc-native-bindings').forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as PidT

public actual fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strsep(string?.value ?: 0L, delimiters)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun explicitBzero(buf: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').explicitBzero(buf?.value ?: 0L, len)")
}

public actual fun slInit(): Stringlist? =
    js("require('@kotlinmania/libc-native-bindings').slInit()") as Stringlist?

public actual fun slAdd(sl: Stringlist?, n: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').slAdd(sl?.toLong() ?: 0L, n?.value ?: 0L)") as CInt

public actual fun slFree(sl: Stringlist?, i: CInt) {
    js("require('@kotlinmania/libc-native-bindings').slFree(sl?.toLong() ?: 0L, i)")
}

public actual fun slFind(sl: Stringlist?, n: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').slFind(sl?.toLong() ?: 0L, n?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kqueue(): CInt =
    js("require('@kotlinmania/libc-native-bindings').kqueue()") as CInt

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kevent(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, timeout?.toLong() ?: 0L)") as CInt

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lutimes(file, times?.toLong() ?: 0L)") as CInt

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    js("require('@kotlinmania/libc-native-bindings').wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)") as PidT
