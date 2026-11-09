@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    0

public actual fun getprogname(): COpaquePointer? =
    null

public actual fun setprogname(progname: String?) {
}

public actual fun arc4random(): UInt =
    0u

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    0u

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
}

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    0

public actual fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong =
    0L

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    0

public actual fun loginTty(fd: CInt): CInt =
    0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    0

public actual fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer? =
    null

public actual fun explicitBzero(buf: COpaquePointer?, len: SizeT) {
}

public actual fun slInit(): COpaquePointer? =
    null

public actual fun slAdd(sl: COpaquePointer?, n: COpaquePointer?): CInt =
    0

public actual fun slFree(sl: COpaquePointer?, i: CInt) {
}

public actual fun slFind(sl: COpaquePointer?, n: COpaquePointer?): COpaquePointer? =
    null

public actual fun kqueue(): CInt =
    0

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    0

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    0

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    0
