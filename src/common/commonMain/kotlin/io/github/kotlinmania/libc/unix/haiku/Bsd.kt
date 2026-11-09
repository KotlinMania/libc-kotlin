// port-lint: source unix/haiku/bsd.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.haiku.b64.ElfAddr
import io.github.kotlinmania.libc.unix.haiku.b64.ElfHalf
import io.github.kotlinmania.libc.unix.haiku.b64.ElfPhdr

// This file contains the BSD APIs available in Haiku. It corresponds to the
// header files in `headers / compatibility / bsd`.
//
// Note that Haiku's BSD compatibility is a combination of system APIs and
// utility libraries. There should only be system APIs in `libc`. When you are
// trying to determine whether something should be included in this file, the
// best indicator is whether it also exists in the BSD-specific definitions in
// this libc crate.

public fun interface FnCallback {
    public operator fun invoke(info: COpaquePointer?, size: ULong, data: COpaquePointer?): CInt
}

// stringlist.h (utility library)
// Note: this is kept because it was previously introduced
public typealias StringList = Stringlist

// stringlist.h (utility library)
// Note: this is kept because it was previously introduced
public data class Stringlist(
    public var slStr: COpaquePointer? = null,
    public var slMax: SizeT = 0uL,
    public var slCur: SizeT = 0uL,
)

// sys/event.h
public data class Kevent(
    public var ident: UintptrT = 0uL,
    public var filter: CShort = 0,
    public var flags: CUshort = 0u,
    public var fflags: CUint = 0u,
    public var data: Long = 0L,
    public var udata: COpaquePointer? = null,
    public var ext: ULongArray = ULongArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kevent) return false
        if (this.ident != other.ident) return false
        if (this.filter != other.filter) return false
        if (this.flags != other.flags) return false
        if (this.fflags != other.fflags) return false
        if (this.data != other.data) return false
        if (this.udata != other.udata) return false
        if (!this.ext.contentEquals(other.ext)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ident.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fflags.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.udata.hashCode()
        result = 31 * result + this.ext.contentHashCode()
        return result
    }
}

// sys/linkElf.h
public data class DlPhdrInfo(
    public var dlpiAddr: ElfAddr = 0uL,
    public var dlpiName: COpaquePointer? = null,
    public var dlpiPhdr: ElfPhdr? = null,
    public var dlpiPhnum: ElfHalf = 0u,
)

// sys/event.h
public val EVFILT_READ: Short = (-1).toShort()

public val EVFILT_WRITE: Short = (-2).toShort()

public val EVFILT_PROC: Short = (-5).toShort()

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
public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

public expect fun loginTty(fd: CInt): CInt

public expect fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT

// string.h
public expect fun strsep(string: COpaquePointer?, delimiters: String?): COpaquePointer?

public expect fun explicitBzero(buf: COpaquePointer?, len: SizeT)

// stringlist.h (utility library)
// Note: this is kept because it was previously introduced
public expect fun slInit(): COpaquePointer?

public expect fun slAdd(sl: COpaquePointer?, n: COpaquePointer?): CInt

public expect fun slFree(sl: COpaquePointer?, i: CInt)

public expect fun slFind(sl: COpaquePointer?, n: COpaquePointer?): COpaquePointer?

// sys/event.h
public expect fun kqueue(): CInt

public expect fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt

// sys/linkElf.h
public expect fun dlIteratePhdr(callback: FnCallback?, data: COpaquePointer?): CInt

// sys/time.h
public expect fun lutimes(file: String?, times: COpaquePointer?): CInt

// sys/uov.h
public expect fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

// sys/wait.h
public expect fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT
