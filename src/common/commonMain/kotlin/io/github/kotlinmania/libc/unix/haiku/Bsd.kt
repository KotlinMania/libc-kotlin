// port-lint: source unix/haiku/bsd.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.haiku.b64.ElfAddr
import io.github.kotlinmania.libc.unix.haiku.b64.ElfHalf
import io.github.kotlinmania.libc.unix.haiku.b64.ElfPhdr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// This file contains the BSD APIs available in Haiku. It corresponds to the
// header files in `headers / compatibility / bsd`.
//
// Note that Haiku's BSD compatibility is a combination of system APIs and
// utility libraries. There should only be system APIs in `libc`. When you are
// trying to determine whether something should be included in this file, the
// best indicator is whether it also exists in the BSD-specific definitions in
// this libc crate.

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr<DlPhdrInfo>, size: ULong, data: MutPtr<CVoid>): CInt
}

// stringlist.h (utility library)
// Note: this is kept because it was previously introduced
public typealias StringList = Stringlist

// stringlist.h (utility library)
// Note: this is kept because it was previously introduced
public class Stringlist internal constructor(
    slStrCtorArg: MutPtr<MutPtr<CChar>>,
    public var slMax: SizeT,
    public var slCur: SizeT,
) {
    public var slStr: MutPtr<MutPtr<CChar>> = slStrCtorArg
        internal set

    public constructor() : this(
        slStrCtorArg = MutPtr(0L),
        slMax = 0uL,
        slCur = 0uL,
    )

    public operator fun component1(): MutPtr<MutPtr<CChar>> = this.slStr

    public operator fun component2(): SizeT = this.slMax

    public operator fun component3(): SizeT = this.slCur

    public fun copy(slStr: MutPtr<MutPtr<CChar>> = this.slStr, slMax: SizeT = this.slMax, slCur: SizeT = this.slCur): Stringlist = Stringlist(slStrCtorArg = slStr, slMax = slMax, slCur = slCur)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stringlist) return false
        if (this.slStr != other.slStr) return false
        if (this.slMax != other.slMax) return false
        if (this.slCur != other.slCur) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.slStr.hashCode()
        result = 31 * result + this.slMax.hashCode()
        result = 31 * result + this.slCur.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stringlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stringlist> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Stringlist =
                    Stringlist(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CChar>>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Stringlist) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CChar>>(64)
                    ).writeNative(addr, value.slStr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.slMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.slCur)
                }
            }

        public operator fun invoke(
            slStr: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            slMax: SizeT = 0uL,
            slCur: SizeT = 0uL,
        ): Stringlist =
            Stringlist(
                slStrCtorArg = slStr,
                slMax = slMax,
                slCur = slCur,
            )
    }
}

// sys/event.h
public class Kevent internal constructor(
    public var ident: UintptrT,
    public var filter: CShort,
    public var flags: CUshort,
    public var fflags: CUint,
    public var data: Long,
    udataCtorArg: MutPtr<CVoid>,
    public var ext: ULongArray,
) {
    public var udata: MutPtr<CVoid> = udataCtorArg
        internal set

    public constructor() : this(
        ident = 0uL,
        filter = 0,
        flags = 0u,
        fflags = 0u,
        data = 0L,
        udataCtorArg = MutPtr(0L),
        ext = ULongArray(4),
    )

    public operator fun component1(): UintptrT = this.ident

    public operator fun component2(): CShort = this.filter

    public operator fun component3(): CUshort = this.flags

    public operator fun component4(): CUint = this.fflags

    public operator fun component5(): Long = this.data

    public operator fun component6(): MutPtr<CVoid> = this.udata

    public operator fun component7(): ULongArray = this.ext

    public fun copy(ident: UintptrT = this.ident, filter: CShort = this.filter, flags: CUshort = this.flags, fflags: CUint = this.fflags, data: Long = this.data, udata: MutPtr<CVoid> = this.udata, ext: ULongArray = this.ext): Kevent = Kevent(ident = ident, filter = filter, flags = flags, fflags = fflags, data = data, udataCtorArg = udata, ext = ext)

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kevent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kevent> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Kevent =
                    Kevent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Kevent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.ident)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.filter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.data)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.udata)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (4).toInt())
                    ).writeNative(addr + 32L, value.ext)
                }
            }

        public operator fun invoke(
            ident: UintptrT = 0uL,
            filter: CShort = 0,
            flags: CUshort = 0u,
            fflags: CUint = 0u,
            data: Long = 0L,
            udata: MutPtr<CVoid> = MutPtr(0L),
            ext: ULongArray = ULongArray(4),
        ): Kevent =
            Kevent(
                ident = ident,
                filter = filter,
                flags = flags,
                fflags = fflags,
                data = data,
                udataCtorArg = udata,
                ext = ext,
            )
    }
}

// sys/linkElf.h
public class DlPhdrInfo internal constructor(
    public var dlpiAddr: ElfAddr,
    dlpiNameCtorArg: ConstPtr<CChar>,
    dlpiPhdrCtorArg: ConstPtr<ElfPhdr>,
    public var dlpiPhnum: ElfHalf,
) {
    public var dlpiName: ConstPtr<CChar> = dlpiNameCtorArg
        internal set

    public var dlpiPhdr: ConstPtr<ElfPhdr> = dlpiPhdrCtorArg
        internal set

    public constructor() : this(
        dlpiAddr = 0uL,
        dlpiNameCtorArg = ConstPtr(0L),
        dlpiPhdrCtorArg = ConstPtr(0L),
        dlpiPhnum = 0u,
    )

    public operator fun component1(): ElfAddr = this.dlpiAddr

    public operator fun component2(): ConstPtr<CChar> = this.dlpiName

    public operator fun component3(): ConstPtr<ElfPhdr> = this.dlpiPhdr

    public operator fun component4(): ElfHalf = this.dlpiPhnum

    public fun copy(dlpiAddr: ElfAddr = this.dlpiAddr, dlpiName: ConstPtr<CChar> = this.dlpiName, dlpiPhdr: ConstPtr<ElfPhdr> = this.dlpiPhdr, dlpiPhnum: ElfHalf = this.dlpiPhnum): DlPhdrInfo = DlPhdrInfo(dlpiAddr = dlpiAddr, dlpiNameCtorArg = dlpiName, dlpiPhdrCtorArg = dlpiPhdr, dlpiPhnum = dlpiPhnum)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlPhdrInfo) return false
        if (this.dlpiAddr != other.dlpiAddr) return false
        if (this.dlpiName != other.dlpiName) return false
        if (this.dlpiPhdr != other.dlpiPhdr) return false
        if (this.dlpiPhnum != other.dlpiPhnum) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dlpiAddr.hashCode()
        result = 31 * result + this.dlpiName.hashCode()
        result = 31 * result + this.dlpiPhdr.hashCode()
        result = 31 * result + this.dlpiPhnum.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            dlpiAddr: ElfAddr = 0uL,
            dlpiName: ConstPtr<CChar> = ConstPtr(0L),
            dlpiPhdr: ConstPtr<ElfPhdr> = ConstPtr(0L),
            dlpiPhnum: ElfHalf = 0u,
        ): DlPhdrInfo =
            DlPhdrInfo(
                dlpiAddr = dlpiAddr,
                dlpiNameCtorArg = dlpiName,
                dlpiPhdrCtorArg = dlpiPhdr,
                dlpiPhnum = dlpiPhnum,
            )
    }
}

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

public expect fun getprogname(): ConstPtr<CChar>

public expect fun setprogname(progname: ConstPtr<CChar>)

public expect fun arc4random(): UInt

public expect fun arc4randomUniform(upperBound: UInt): UInt

public expect fun arc4randomBuf(buf: MutPtr<CVoid>, n: SizeT)

public expect fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt

public expect fun strtonum(nptr: ConstPtr<CChar>, minval: CLonglong, maxval: CLonglong, errstr: MutPtr<ConstPtr<CChar>>): CLonglong

// pty.h
public expect fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt

public expect fun loginTty(fd: CInt): CInt

public expect fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT

// string.h
public expect fun strsep(string: MutPtr<MutPtr<CChar>>, delimiters: ConstPtr<CChar>): MutPtr<CChar>

public expect fun explicitBzero(buf: MutPtr<CVoid>, len: SizeT)

// stringlist.h (utility library)
// Note: this is kept because it was previously introduced
public expect fun slInit(): MutPtr<StringList>

public expect fun slAdd(sl: MutPtr<StringList>, n: MutPtr<CChar>): CInt

public expect fun slFree(sl: MutPtr<StringList>, i: CInt)

public expect fun slFind(sl: MutPtr<StringList>, n: MutPtr<CChar>): MutPtr<CChar>

// sys/event.h
public expect fun kqueue(): CInt

public expect fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt

// sys/linkElf.h
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt

// sys/time.h
public expect fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

// sys/uov.h
public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

// sys/wait.h
public expect fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT
