// port-lint: source unix/haiku/bsd.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.ElfAddr
import io.github.kotlinmania.libc.ElfHalf
import io.github.kotlinmania.libc.ElfPhdr
import io.github.kotlinmania.libc.Iovec
import io.github.kotlinmania.libc.OffT
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Rusage
import io.github.kotlinmania.libc.Termios
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.Timeval
import io.github.kotlinmania.libc.UintptrT
import io.github.kotlinmania.libc.Winsize

// This file contains the BSD APIs available in Haiku. It corresponds to the
// header files in `headers / compatibility / bsd`.
//
// Note that Haiku's BSD compatibility is a combination of system APIs and
// utility libraries. There should only be system APIs in `libc`. When you are
// trying to determine whether something should be included in this file, the
// best indicator is whether it also exists in the BSD-specific definitions in
// this libc crate.

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: DlPhdrInfo?, size: ULong, data: COpaquePointer?): CInt
}

// stringlist.h (utility library)
// Note: this is kept because it was previously introduced
public typealias StringList = Stringlist

// stringlist.h (utility library)
// Note: this is kept because it was previously introduced
public open class Stringlist(
    public var slStr: COpaquePointer?,
    public var slMax: SizeT,
    public var slCur: SizeT,
)

// sys/event.h
public open class Kevent(
    public var ident: UintptrT,
    public var filter: CShort,
    public var flags: CUshort,
    public var fflags: CUint,
    public var data: Long,
    public var udata: COpaquePointer?,
    public var ext: List<ULong>,
)

// sys/linkElf.h
public open class DlPhdrInfo(
    public var dlpiAddr: ElfAddr,
    public var dlpiName: COpaquePointer?,
    public var dlpiPhdr: ElfPhdr?,
    public var dlpiPhnum: ElfHalf,
)

// sys/event.h
public val EVFILT_READ: Short = -1

public val EVFILT_WRITE: Short = -2

public val EVFILT_PROC: Short = -5

public val EV_ADD: UShort = 0x0001u

public val EV_DELETE: UShort = 0x0002u

public val EV_ONESHOT: UShort = 0x0010u

public val EV_CLEAR: UShort = 0x0020u

public val EV_EOF: UShort = 0x8000u

public val EV_ERROR: UShort = 0x4000u

public val NOTE_EXIT: UInt = 0x80000000u

// sys/ioccom.h
public val IOC_VOID: CUlong = 0x20000000uL

public val IOC_OUT: CUlong = 0x40000000uL

public val IOC_IN: CUlong = 0x80000000uL

public val IOC_INOUT: CUlong = IOC_IN or IOC_OUT

public val IOC_DIRMASK: CUlong = 0xe0000000uL

// stdlib.h
public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getprogname(): COpaquePointer?

public expect fun setprogname(progname: String?)

public expect fun arc4random(): UInt

public expect fun arc4randomUniform(upperBound: UInt): UInt

public expect fun arc4randomBuf(buf: COpaquePointer?, n: SizeT)

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong

// pty.h
public expect fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt

public expect fun loginTty(fd: CInt): CInt

public expect fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT

// string.h
public expect fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer?

public expect fun explicitBzero(buf: COpaquePointer?, len: SizeT)

// stringlist.h (utility library)
// Note: this is kept because it was previously introduced
public expect fun slInit(): Stringlist?

public expect fun slAdd(sl: Stringlist?, n: COpaquePointer?): CInt

public expect fun slFree(sl: Stringlist?, i: CInt)

public expect fun slFind(sl: Stringlist?, n: COpaquePointer?): COpaquePointer?

// sys/event.h
public expect fun kqueue(): CInt

public expect fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt

// sys/linkElf.h
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt

// sys/time.h
public expect fun lutimes(file: String?, times: Timeval?): CInt

// sys/uov.h
public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

// sys/wait.h
public expect fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT
