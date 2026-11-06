// port-lint: source unix/haiku/bsd.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.LibcDynamicFfi
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.Winsize

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
public fun daemon(nochdir: CInt, noclose: CInt): CInt {
    return LibcDynamicFfi.invoke("daemon", -1, longArrayOf(nochdir.toLong(), noclose.toLong())).toInt()
}

public fun getprogname(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getprogname", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun setprogname(progname: String?) {
    val __cstr_0 = if (progname == null) 0L else LibcDynamicFfi.allocUtf8CString(progname)
    try {
        LibcDynamicFfi.invoke("setprogname", -1, longArrayOf(__cstr_0))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun arc4random(): UInt {
    return LibcDynamicFfi.invoke("arc4random", -1, longArrayOf()).toUInt()
}

public fun arc4randomUniform(upperBound: UInt): UInt {
    return LibcDynamicFfi.invoke("arc4random_uniform", -1, longArrayOf(upperBound.toLong())).toUInt()
}

public fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    LibcDynamicFfi.invoke("arc4random_buf", -1, longArrayOf(buf?.value ?: 0L, n.toLong()))
}

public fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt {
    return LibcDynamicFfi.invoke("mkstemps", -1, longArrayOf(template?.value ?: 0L, suffixlen.toLong())).toInt()
}

public fun strtonum(nptr: String?, minval: CLonglong, maxval: CLonglong, errstr: COpaquePointer?): CLonglong {
    val __cstr_0 = if (nptr == null) 0L else LibcDynamicFfi.allocUtf8CString(nptr)
    try {
        return LibcDynamicFfi.invoke("strtonum", -1, longArrayOf(__cstr_0, minval, maxval, errstr?.value ?: 0L))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// pty.h
public fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    val __slot_1 = if (aslave == null) 0L else LibcDynamicFfi.allocScalarSlot(aslave.toLong())
    try {
        return LibcDynamicFfi.invoke("openpty", -1, longArrayOf(__slot_0, __slot_1, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun loginTty(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("login_tty", -1, longArrayOf(fd.toLong())).toInt()
}

public fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT {
    val __slot_0 = if (amaster == null) 0L else LibcDynamicFfi.allocScalarSlot(amaster.toLong())
    try {
        return LibcDynamicFfi.invoke("forkpty", -1, longArrayOf(__slot_0, name?.value ?: 0L, termp?.value ?: 0L, winp?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// string.h
public fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer? {
    val __cstr_1 = if (delimiters == null) 0L else LibcDynamicFfi.allocUtf8CString(delimiters)
    try {
        val rawRet = LibcDynamicFfi.invoke("strsep", -1, longArrayOf(string?.value ?: 0L, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun explicitBzero(buf: COpaquePointer?, len: SizeT) {
    LibcDynamicFfi.invoke("explicit_bzero", -1, longArrayOf(buf?.value ?: 0L, len.toLong()))
}

// stringlist.h (utility library)
// Note: this is kept because it was previously introduced
public fun slInit(): Stringlist? {
    val rawRet = LibcDynamicFfi.invoke("sl_init", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun slAdd(sl: Stringlist?, n: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("sl_add", -1, longArrayOf(sl?.value ?: 0L, n?.value ?: 0L)).toInt()
}

public fun slFree(sl: Stringlist?, i: CInt) {
    LibcDynamicFfi.invoke("sl_free", -1, longArrayOf(sl?.value ?: 0L, i.toLong()))
}

public fun slFind(sl: Stringlist?, n: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("sl_find", -1, longArrayOf(sl?.value ?: 0L, n?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

// sys/event.h
public fun kqueue(): CInt {
    return LibcDynamicFfi.invoke("kqueue", -1, longArrayOf()).toInt()
}

public fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("kevent", -1, longArrayOf(kq.toLong(), changelist?.value ?: 0L, nchanges.toLong(), eventlist?.value ?: 0L, nevents.toLong(), timeout?.value ?: 0L)).toInt()
}

// sys/linkElf.h
public fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("dl_iterate_phdr", -1, longArrayOf(callback?.value ?: 0L, data?.value ?: 0L)).toInt()
}

// sys/time.h
public fun lutimes(file: String?, times: Timeval?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("lutimes", -1, longArrayOf(__cstr_0, times?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

// sys/uov.h
public fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("preadv", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

public fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT {
    return LibcDynamicFfi.invoke("pwritev", -1, longArrayOf(fd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), offset))
}

// sys/wait.h
public fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT {
    val __slot_1 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("wait4", -1, longArrayOf(pid.toLong(), __slot_1, options.toLong(), rusage?.value ?: 0L)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}
