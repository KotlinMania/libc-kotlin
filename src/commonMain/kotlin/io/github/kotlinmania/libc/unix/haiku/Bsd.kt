// port-lint: source libc/src/unix/haiku/bsd.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

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

public fun daemon(nochdir: CInt, noclose: CInt): CInt = -1

public fun getprogname(): String? = null

public fun setprogname(progname: String?) { }

public fun arc4random(): UInt = 0u

public fun arc4randomUniform(upperBound: UInt): UInt = 0u

public fun arc4randomBuf(buf: COpaquePointer?, n: ULong) { }

public fun mkstemps(template: String?, suffixlen: CInt): CInt = -1

public fun strtonum(nptr: String?, minval: CLongLong, maxval: CLongLong, errstr: COpaquePointer?): CLongLong = -1L

public fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt = -1

public fun loginTty(fd: CInt): CInt = -1

public fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT = -1

public fun strsep(string: COpaquePointer?, delimiters: String?): String? = null

public fun explicitBzero(buf: COpaquePointer?, len: ULong) { }

public fun slInit(): StringList? = null

public fun slAdd(sl: StringList?, n: String?): CInt = -1

public fun slFree(sl: StringList?, i: CInt) { }

public fun slFind(sl: StringList?, n: String?): String? = null

public fun kqueue(): CInt = -1

public fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt = -1

public fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt = -1

public fun lutimes(file: String?, times: Timeval?): CInt = -1

public fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT = -1L

public fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT = -1L

public fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT = -1
