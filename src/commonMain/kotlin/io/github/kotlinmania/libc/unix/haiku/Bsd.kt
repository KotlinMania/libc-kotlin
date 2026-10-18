// port-lint: source unix/haiku/bsd.rs
package io.github.kotlinmania.libc.unix.haiku
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize

import io.github.kotlinmania.libc.*

public data class Stringlist(
    val slStr: COpaquePointer?,
    val slMax: ULong,
    val slCur: ULong,
)

public data class Kevent(
    val ident: ULong,
    val filter: Short,
    val flags: UShort,
    val fflags: UInt,
    val data: Long,
    val udata: COpaquePointer?,
    val ext: ULongArray,
)

public data class DlPhdrInfo(
    val dlpiAddr: UInt,
    val dlpiName: String?,
    val dlpiPhdr: io.github.kotlinmania.libc.unix.haiku.Elf32Phdr?,
    val dlpiPhnum: UShort,
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
public const val IOC_VOID: ULong = 0x20000000uL
public const val IOC_OUT: ULong = 0x40000000uL
public const val IOC_IN: ULong = 0x80000000uL
public val IOC_INOUT: ULong = IOC_IN or IOC_OUT
public const val IOC_DIRMASK: ULong = 0xe0000000uL

public expect fun daemon(nochdir: Int, noclose: Int): Int

public expect fun getprogname(): String?

public expect fun setprogname(progname: String?)

public fun arc4random(): UInt = 0u

public fun arc4randomUniform(upperBound: UInt): UInt = 0u

public expect fun arc4randomBuf(buf: COpaquePointer?, n: ULong)

public expect fun mkstemps(template: String?, suffixlen: Int): Int

public expect fun strtonum(nptr: String?, minval: Long, maxval: Long, errstr: COpaquePointer?): Long

public expect fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int

public expect fun loginTty(fd: Int): Int

public expect fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int

public expect fun strsep(string: COpaquePointer?, delimiters: String?): String?

public expect fun explicitBzero(buf: COpaquePointer?, len: ULong)

public expect fun slInit(): io.github.kotlinmania.libc.unix.haiku.Stringlist?

public expect fun slAdd(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, n: String?): Int

public expect fun slFree(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, i: Int)

public expect fun slFind(sl: io.github.kotlinmania.libc.unix.haiku.Stringlist?, n: String?): String?

public expect fun kqueue(): Int

public expect fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int

public expect fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int

public expect fun lutimes(file: String?, times: Timeval?): Int

public expect fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long

public expect fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long

public expect fun wait4(pid: Int, status: Int?, options: Int, rusage: Rusage?): Int
