// port-lint: source unix/haiku/bsd.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias StringList = Stringlist

public data class Stringlist(
    val slStr: COpaquePointer?,
    val slMax: ULong,
    val slCur: ULong,
)

public data class Kevent(
    val ident: UintptrT,
    val filter: CShort,
    val flags: CUShort,
    val fflags: CUInt,
    val data: Long,
    val udata: COpaquePointer?,
    val ext: ULongArray,
)

public data class DlPhdrInfo(
    val dlpiAddr: ElfAddr,
    val dlpiName: String?,
    val dlpiPhdr: ElfPhdr?,
    val dlpiPhnum: ElfHalf,
)

public const val EVFILT_READ: Short = -1
public const val EVFILT_WRITE: Short = -2
public const val EVFILT_PROC: Short = -5
public val EV_ADD: UShort = (0x0001).toUShort()
public val EV_DELETE: UShort = (0x0002).toUShort()
public val EV_ONESHOT: UShort = (0x0010).toUShort()
public val EV_CLEAR: UShort = (0x0020).toUShort()
public val EV_EOF: UShort = (0x8000).toUShort()
public val EV_ERROR: UShort = (0x4000).toUShort()
public const val NOTE_EXIT: UInt = 0x80000000u
public const val IOC_VOID: CULong = 0x20000000uL
public const val IOC_OUT: CULong = 0x40000000uL
public const val IOC_IN: CULong = 0x80000000uL
public val IOC_INOUT: CULong = IOC_IN or IOC_OUT
public const val IOC_DIRMASK: CULong = 0xe0000000uL

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getprogname(): String?

public expect fun setprogname(progname: String?)

public expect fun arc4random(): UInt

public expect fun arc4randomUniform(upperBound: UInt): UInt

public expect fun arc4randomBuf(buf: COpaquePointer?, n: ULong)

public expect fun mkstemps(template: String?, suffixlen: CInt): CInt

public expect fun strtonum(nptr: String?, minval: CLongLong, maxval: CLongLong, errstr: COpaquePointer?): CLongLong

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt

public expect fun loginTty(fd: CInt): CInt

public expect fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT

public expect fun strsep(string: COpaquePointer?, delimiters: String?): String?

public expect fun explicitBzero(buf: COpaquePointer?, len: ULong)

public expect fun slInit(): StringList?

public expect fun slAdd(sl: StringList?, n: String?): CInt

public expect fun slFree(sl: StringList?, i: CInt)

public expect fun slFind(sl: StringList?, n: String?): String?

public expect fun kqueue(): CInt

public expect fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt

public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt

public expect fun lutimes(file: String?, times: Timeval?): CInt

public expect fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT
