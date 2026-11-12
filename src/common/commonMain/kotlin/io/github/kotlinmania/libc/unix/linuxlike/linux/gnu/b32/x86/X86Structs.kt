@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.FsidT
import io.github.kotlinmania.libc.unix.linuxlike.KeyT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Blkcnt64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.DevT
import io.github.kotlinmania.libc.unix.linuxlike.linux.ModeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.BlksizeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.FsblkcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.FsfilcntT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.FswordT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.MsglenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.MsgqnumT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.NlinkT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.ShmattT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.TimeT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface SigactionSaRestorerCallback {
    public operator fun invoke()
}

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = SigsetT(),
    public var saFlags: CInt = 0,
    public var saRestorer: SigactionSaRestorerCallback? = null,
)

public data class Statfs(
    public var fType: FswordT = 0,
    public var fBsize: FswordT = 0,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: FswordT = 0,
    public var fFrsize: FswordT = 0,
    public var fFlags: FswordT = 0,
    public var fSpare: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statfs) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamelen != other.fNamelen) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlags != other.fFlags) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamelen.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Flock =
                    Flock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Flock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.lType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.lWhence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lPid)
                }
            }
    }
}

public data class Flock64(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: Off64T = 0L,
    public var lLen: Off64T = 0L,
    public var lPid: PidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Flock64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Flock64 =
                    Flock64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Flock64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.lType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.lWhence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lPid)
                }
            }
    }
}

public data class LibcFpreg(
    public var significand: UShortArray = UShortArray(4),
    public var exponent: UShort = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LibcFpreg) return false
        if (!this.significand.contentEquals(other.significand)) return false
        if (this.exponent != other.exponent) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.significand.contentHashCode()
        result = 31 * result + this.exponent.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LibcFpreg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LibcFpreg> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 10L
                override fun readNative(addr: Long): LibcFpreg =
                    LibcFpreg(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LibcFpreg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr, value.significand.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.exponent)
                }
            }
    }
}

public data class LibcFpstate(
    public var cw: CUlong = 0uL,
    public var sw: CUlong = 0uL,
    public var tag: CUlong = 0uL,
    public var ipoff: CUlong = 0uL,
    public var cssel: CUlong = 0uL,
    public var dataoff: CUlong = 0uL,
    public var datasel: CUlong = 0uL,
    public var st: List<LibcFpreg> = List(8) { LibcFpreg() },
    public var status: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LibcFpstate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LibcFpstate> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): LibcFpstate =
                    LibcFpstate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(LibcFpreg.typeLayout(), (8).toInt())
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                    )
                override fun writeNative(addr: Long, value: LibcFpstate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.cw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.sw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.tag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ipoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.cssel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.dataoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.datasel)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(LibcFpreg.typeLayout(), (8).toInt())
                    ).writeNative(addr + 56L, value.st)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.status)
                }
            }
    }
}

public data class UserFpregsStruct(
    public var cwd: CLong = 0L,
    public var swd: CLong = 0L,
    public var twd: CLong = 0L,
    public var fip: CLong = 0L,
    public var fcs: CLong = 0L,
    public var foo: CLong = 0L,
    public var fos: CLong = 0L,
    public var stSpace: LongArray = LongArray(20),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserFpregsStruct) return false
        if (this.cwd != other.cwd) return false
        if (this.swd != other.swd) return false
        if (this.twd != other.twd) return false
        if (this.fip != other.fip) return false
        if (this.fcs != other.fcs) return false
        if (this.foo != other.foo) return false
        if (this.fos != other.fos) return false
        if (!this.stSpace.contentEquals(other.stSpace)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cwd.hashCode()
        result = 31 * result + this.swd.hashCode()
        result = 31 * result + this.twd.hashCode()
        result = 31 * result + this.fip.hashCode()
        result = 31 * result + this.fcs.hashCode()
        result = 31 * result + this.foo.hashCode()
        result = 31 * result + this.fos.hashCode()
        result = 31 * result + this.stSpace.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserFpregsStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserFpregsStruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 216L
                override fun readNative(addr: Long): UserFpregsStruct =
                    UserFpregsStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (20).toInt())
                        ).readNative(addr + 56L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: UserFpregsStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.cwd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.swd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.twd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.fip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.fcs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.foo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.fos)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (20).toInt())
                    ).writeNative(addr + 56L, value.stSpace.toList())
                }
            }
    }
}

public class UserRegsStruct(
    public var ebx: CLong = 0L,
    public var ecx: CLong = 0L,
    public var edx: CLong = 0L,
    public var esi: CLong = 0L,
    public var edi: CLong = 0L,
    public var ebp: CLong = 0L,
    public var eax: CLong = 0L,
    public var xds: CLong = 0L,
    public var xes: CLong = 0L,
    public var xfs: CLong = 0L,
    public var xgs: CLong = 0L,
    public var origEax: CLong = 0L,
    public var eip: CLong = 0L,
    public var xcs: CLong = 0L,
    public var eflags: CLong = 0L,
    public var esp: CLong = 0L,
    public var xss: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserRegsStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserRegsStruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): UserRegsStruct =
                    UserRegsStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: UserRegsStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.ebx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.ecx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.edx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.esi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.edi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.ebp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.eax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.xds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.xes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.xfs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.xgs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.origEax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.eip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.xcs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.eflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.esp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.xss)
                }
            }
    }
}

public class User internal constructor(
    public var regs: UserRegsStruct,
    public var uFpvalid: CInt,
    public var i387: UserFpregsStruct,
    public var uTsize: CUlong,
    public var uDsize: CUlong,
    public var uSsize: CUlong,
    public var startCode: CUlong,
    public var startStack: CUlong,
    public var signal: CLong,
    public var reserved: CInt,
    uAr0CtorArg: MutPtr,
    uFpstateCtorArg: MutPtr,
    public var magic: CUlong,
    public var uComm: UByteArray,
    public var uDebugreg: IntArray,
) {
    public var uAr0: MutPtr = uAr0CtorArg
        internal set

    public var uFpstate: MutPtr = uFpstateCtorArg
        internal set

    public constructor() : this(
        regs = UserRegsStruct(),
        uFpvalid = 0,
        i387 = UserFpregsStruct(),
        uTsize = 0uL,
        uDsize = 0uL,
        uSsize = 0uL,
        startCode = 0uL,
        startStack = 0uL,
        signal = 0L,
        reserved = 0,
        uAr0CtorArg = MutPtr(0L),
        uFpstateCtorArg = MutPtr(0L),
        magic = 0uL,
        uComm = UByteArray(32),
        uDebugreg = IntArray(8),
    )

    public operator fun component1(): UserRegsStruct = this.regs

    public operator fun component2(): CInt = this.uFpvalid

    public operator fun component3(): UserFpregsStruct = this.i387

    public operator fun component4(): CUlong = this.uTsize

    public operator fun component5(): CUlong = this.uDsize

    public operator fun component6(): CUlong = this.uSsize

    public operator fun component7(): CUlong = this.startCode

    public operator fun component8(): CUlong = this.startStack

    public operator fun component9(): CLong = this.signal

    public operator fun component10(): CInt = this.reserved

    public operator fun component11(): MutPtr = this.uAr0

    public operator fun component12(): MutPtr = this.uFpstate

    public operator fun component13(): CUlong = this.magic

    public operator fun component14(): UByteArray = this.uComm

    public operator fun component15(): IntArray = this.uDebugreg

    public fun copy(regs: UserRegsStruct = this.regs, uFpvalid: CInt = this.uFpvalid, i387: UserFpregsStruct = this.i387, uTsize: CUlong = this.uTsize, uDsize: CUlong = this.uDsize, uSsize: CUlong = this.uSsize, startCode: CUlong = this.startCode, startStack: CUlong = this.startStack, signal: CLong = this.signal, reserved: CInt = this.reserved, uAr0: MutPtr = this.uAr0, uFpstate: MutPtr = this.uFpstate, magic: CUlong = this.magic, uComm: UByteArray = this.uComm, uDebugreg: IntArray = this.uDebugreg): User = User(regs = regs, uFpvalid = uFpvalid, i387 = i387, uTsize = uTsize, uDsize = uDsize, uSsize = uSsize, startCode = startCode, startStack = startStack, signal = signal, reserved = reserved, uAr0CtorArg = uAr0, uFpstateCtorArg = uFpstate, magic = magic, uComm = uComm, uDebugreg = uDebugreg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is User) return false
        if (this.regs != other.regs) return false
        if (this.uFpvalid != other.uFpvalid) return false
        if (this.i387 != other.i387) return false
        if (this.uTsize != other.uTsize) return false
        if (this.uDsize != other.uDsize) return false
        if (this.uSsize != other.uSsize) return false
        if (this.startCode != other.startCode) return false
        if (this.startStack != other.startStack) return false
        if (this.signal != other.signal) return false
        if (this.reserved != other.reserved) return false
        if (this.uAr0 != other.uAr0) return false
        if (this.uFpstate != other.uFpstate) return false
        if (this.magic != other.magic) return false
        if (!this.uComm.contentEquals(other.uComm)) return false
        if (!this.uDebugreg.contentEquals(other.uDebugreg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.regs.hashCode()
        result = 31 * result + this.uFpvalid.hashCode()
        result = 31 * result + this.i387.hashCode()
        result = 31 * result + this.uTsize.hashCode()
        result = 31 * result + this.uDsize.hashCode()
        result = 31 * result + this.uSsize.hashCode()
        result = 31 * result + this.startCode.hashCode()
        result = 31 * result + this.startStack.hashCode()
        result = 31 * result + this.signal.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.uAr0.hashCode()
        result = 31 * result + this.uFpstate.hashCode()
        result = 31 * result + this.magic.hashCode()
        result = 31 * result + this.uComm.contentHashCode()
        result = 31 * result + this.uDebugreg.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<User> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<User> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 504L
                override fun readNative(addr: Long): User =
                    User(
                        (UserRegsStruct.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 136L),
                        (UserFpregsStruct.typeLayout()).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 360L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 368L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 376L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 384L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 392L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 400L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 408L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 416L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 424L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 432L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 440L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (8).toInt())
                        ).readNative(addr + 472L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: User) {
                    (UserRegsStruct.typeLayout()).writeNative(addr, value.regs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 136L, value.uFpvalid)
                    (UserFpregsStruct.typeLayout()).writeNative(addr + 144L, value.i387)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 360L, value.uTsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 368L, value.uDsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 376L, value.uSsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 384L, value.startCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 392L, value.startStack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 400L, value.signal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 408L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 416L, value.uAr0)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 424L, value.uFpstate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 432L, value.magic)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 440L, value.uComm.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (8).toInt())
                    ).writeNative(addr + 472L, value.uDebugreg.toList())
                }
            }

        public operator fun invoke(
            regs: UserRegsStruct = UserRegsStruct(),
            uFpvalid: CInt = 0,
            i387: UserFpregsStruct = UserFpregsStruct(),
            uTsize: CUlong = 0uL,
            uDsize: CUlong = 0uL,
            uSsize: CUlong = 0uL,
            startCode: CUlong = 0uL,
            startStack: CUlong = 0uL,
            signal: CLong = 0L,
            reserved: CInt = 0,
            uAr0: MutPtr = MutPtr(0L),
            uFpstate: MutPtr = MutPtr(0L),
            magic: CUlong = 0uL,
            uComm: UByteArray = UByteArray(32),
            uDebugreg: IntArray = IntArray(8),
        ): User =
            User(
                regs = regs,
                uFpvalid = uFpvalid,
                i387 = i387,
                uTsize = uTsize,
                uDsize = uDsize,
                uSsize = uSsize,
                startCode = startCode,
                startStack = startStack,
                signal = signal,
                reserved = reserved,
                uAr0CtorArg = uAr0,
                uFpstateCtorArg = uFpstate,
                magic = magic,
                uComm = uComm,
                uDebugreg = uDebugreg,
            )
    }
}

public class McontextT internal constructor(
    public var gregs: IntArray,
    fpregsCtorArg: MutPtr,
    public var oldmask: CUlong,
    public var cr2: CUlong,
) {
    public var fpregs: MutPtr = fpregsCtorArg
        internal set

    public constructor() : this(
        gregs = IntArray(19),
        fpregsCtorArg = MutPtr(0L),
        oldmask = 0uL,
        cr2 = 0uL,
    )

    public operator fun component1(): IntArray = this.gregs

    public operator fun component2(): MutPtr = this.fpregs

    public operator fun component3(): CUlong = this.oldmask

    public operator fun component4(): CUlong = this.cr2

    public fun copy(gregs: IntArray = this.gregs, fpregs: MutPtr = this.fpregs, oldmask: CUlong = this.oldmask, cr2: CUlong = this.cr2): McontextT = McontextT(gregs = gregs, fpregsCtorArg = fpregs, oldmask = oldmask, cr2 = cr2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is McontextT) return false
        if (!this.gregs.contentEquals(other.gregs)) return false
        if (this.fpregs != other.fpregs) return false
        if (this.oldmask != other.oldmask) return false
        if (this.cr2 != other.cr2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.gregs.contentHashCode()
        result = 31 * result + this.fpregs.hashCode()
        result = 31 * result + this.oldmask.hashCode()
        result = 31 * result + this.cr2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (19).toInt())
                        ).readNative(addr).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (19).toInt())
                    ).writeNative(addr, value.gregs.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr + 80L, value.fpregs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.oldmask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.cr2)
                }
            }

        public operator fun invoke(
            gregs: IntArray = IntArray(19),
            fpregs: MutPtr = MutPtr(0L),
            oldmask: CUlong = 0uL,
            cr2: CUlong = 0uL,
        ): McontextT =
            McontextT(
                gregs = gregs,
                fpregsCtorArg = fpregs,
                oldmask = oldmask,
                cr2 = cr2,
            )
    }
}

public data class IpcPerm(
    public var key: KeyT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: CUshort = 0u,
    public var pad1: CUshort = 0u,
    public var seq: CUshort = 0u,
    public var pad2: CUshort = 0u,
    public var unused1: CUlong = 0uL,
    public var unused2: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpcPerm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpcPerm> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): IpcPerm =
                    IpcPerm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: IpcPerm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.key)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.uid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.gid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.cuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.cgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.pad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.seq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.pad2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.unused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.unused2)
                }
            }
    }
}

public class Stat64(
    public var stDev: DevT = 0uL,
    public var pad1: CUint = 0u,
    public var stIno: CUlong = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var pad2: CUint = 0u,
    public var stSize: Off64T = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stBlocks: Blkcnt64T = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var atimePad: CInt = 0,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var mtimePad: CInt = 0,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var ctimePad: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 152L
                override fun readNative(addr: Long): Stat64 =
                    Stat64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 34L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 144L),
                    )
                override fun writeNative(addr: Long, value: Stat64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 32L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 34L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.pad2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.stBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.stAtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.atimePad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.stMtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.mtimePad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 136L, value.stCtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 144L, value.ctimePad)
                }
            }
    }
}

public data class Statfs64(
    public var fType: FswordT = 0,
    public var fBsize: FswordT = 0,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamelen: FswordT = 0,
    public var fFrsize: FswordT = 0,
    public var fFlags: FswordT = 0,
    public var fSpare: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statfs64) return false
        if (this.fType != other.fType) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fNamelen != other.fNamelen) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fFlags != other.fFlags) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fType.hashCode()
        result = 31 * result + this.fBsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fNamelen.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fFlags.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }
}

public data class Statvfs64(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: ULong = 0uL,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFavail: ULong = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fUnused: CInt = 0,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fSpare: IntArray = IntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs64) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (this.fUnused != other.fUnused) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fSpare.contentEquals(other.fSpare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fBsize.hashCode()
        result = 31 * result + this.fFrsize.hashCode()
        result = 31 * result + this.fBlocks.hashCode()
        result = 31 * result + this.fBfree.hashCode()
        result = 31 * result + this.fBavail.hashCode()
        result = 31 * result + this.fFiles.hashCode()
        result = 31 * result + this.fFfree.hashCode()
        result = 31 * result + this.fFavail.hashCode()
        result = 31 * result + this.fFsid.hashCode()
        result = 31 * result + this.fUnused.hashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): Statvfs64 =
                    Statvfs64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (6).toInt())
                        ).readNative(addr + 96L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: Statvfs64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.fBsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fFrsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.fBfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.fBavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.fFiles)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.fFfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.fFavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.fFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.fUnused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.fFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.fNamemax)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (6).toInt())
                    ).writeNative(addr + 96L, value.fSpare.toList())
                }
            }
    }
}

public data class ShmidDs(
    public var shmPerm: IpcPerm = IpcPerm(),
    public var shmSegsz: SizeT = 0uL,
    public var shmAtime: TimeT = 0L,
    public var unused1: CUlong = 0uL,
    public var shmDtime: TimeT = 0L,
    public var unused2: CUlong = 0uL,
    public var shmCtime: TimeT = 0L,
    public var unused3: CUlong = 0uL,
    public var shmCpid: PidT = 0,
    public var shmLpid: PidT = 0,
    public var shmNattch: ShmattT = 0uL,
    public var unused4: CUlong = 0uL,
    public var unused5: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShmidDs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ShmidDs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): ShmidDs =
                    ShmidDs(
                        (IpcPerm.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: ShmidDs) {
                    (IpcPerm.typeLayout()).writeNative(addr, value.shmPerm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.shmSegsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.shmAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.unused1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.shmDtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.unused2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.shmCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.unused3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.shmCpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 100L, value.shmLpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.shmNattch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.unused4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.unused5)
                }
            }
    }
}

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgStime: TimeT = 0L,
    public var glibcReserved1: CUlong = 0uL,
    public var msgRtime: TimeT = 0L,
    public var glibcReserved2: CUlong = 0uL,
    public var msgCtime: TimeT = 0L,
    public var glibcReserved3: CUlong = 0uL,
    public var msgCbytes: CUlong = 0uL,
    public var msgQnum: MsgqnumT = 0uL,
    public var msgQbytes: MsglenT = 0uL,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var glibcReserved4: CUlong = 0uL,
    public var glibcReserved5: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsqidDs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsqidDs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): MsqidDs =
                    MsqidDs(
                        (IpcPerm.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: MsqidDs) {
                    (IpcPerm.typeLayout()).writeNative(addr, value.msgPerm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.msgStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.glibcReserved1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.msgRtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.glibcReserved2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.msgCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.glibcReserved3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.msgCbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.msgQnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.msgQbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 112L, value.msgLspid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 116L, value.msgLrpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.glibcReserved4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.glibcReserved5)
                }
            }
    }
}

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siErrno: CInt = 0,
    public var siCode: CInt = 0,
    public var pad: IntArray = IntArray(29),
    public var align: IntArray = IntArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siCode != other.siCode) return false
        if (!this.pad.contentEquals(other.pad)) return false
        if (!this.align.contentEquals(other.align)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        result = 31 * result + this.align.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): SiginfoT =
                    SiginfoT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (29).toInt())
                        ).readNative(addr + 12L).toIntArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (0).toInt())
                        ).readNative(addr + 128L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siErrno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siCode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (29).toInt())
                    ).writeNative(addr + 12L, value.pad.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64, (0).toInt())
                    ).writeNative(addr + 128L, value.align.toList())
                }
            }
    }
}

public class StackT internal constructor(
    ssSpCtorArg: MutPtr,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
) {
    public var ssSp: MutPtr = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssFlags = 0,
        ssSize = 0uL,
    )

    public operator fun component1(): MutPtr = this.ssSp

    public operator fun component2(): CInt = this.ssFlags

    public operator fun component3(): SizeT = this.ssSize

    public fun copy(ssSp: MutPtr = this.ssSp, ssFlags: CInt = this.ssFlags, ssSize: SizeT = this.ssSize): StackT = StackT(ssSpCtorArg = ssSp, ssFlags = ssFlags, ssSize = ssSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackT) return false
        if (this.ssSp != other.ssSp) return false
        if (this.ssFlags != other.ssFlags) return false
        if (this.ssSize != other.ssSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssSp.hashCode()
        result = 31 * result + this.ssFlags.hashCode()
        result = 31 * result + this.ssSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<StackT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ssFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ssSize)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr = MutPtr(0L),
            ssFlags: CInt = 0,
            ssSize: SizeT = 0uL,
        ): StackT =
            StackT(
                ssSpCtorArg = ssSp,
                ssFlags = ssFlags,
                ssSize = ssSize,
            )
    }
}

public data class UserFpxregsStruct(
    public var cwd: CUshort = 0u,
    public var swd: CUshort = 0u,
    public var twd: CUshort = 0u,
    public var fop: CUshort = 0u,
    public var fip: CLong = 0L,
    public var fcs: CLong = 0L,
    public var foo: CLong = 0L,
    public var fos: CLong = 0L,
    public var mxcsr: CLong = 0L,
    public var reserved: CLong = 0L,
    public var stSpace: LongArray = LongArray(32),
    public var xmmSpace: LongArray = LongArray(32),
    public var padding: LongArray = LongArray(56),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UserFpxregsStruct) return false
        if (this.cwd != other.cwd) return false
        if (this.swd != other.swd) return false
        if (this.twd != other.twd) return false
        if (this.fop != other.fop) return false
        if (this.fip != other.fip) return false
        if (this.fcs != other.fcs) return false
        if (this.foo != other.foo) return false
        if (this.fos != other.fos) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.reserved != other.reserved) return false
        if (!this.stSpace.contentEquals(other.stSpace)) return false
        if (!this.xmmSpace.contentEquals(other.xmmSpace)) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cwd.hashCode()
        result = 31 * result + this.swd.hashCode()
        result = 31 * result + this.twd.hashCode()
        result = 31 * result + this.fop.hashCode()
        result = 31 * result + this.fip.hashCode()
        result = 31 * result + this.fcs.hashCode()
        result = 31 * result + this.foo.hashCode()
        result = 31 * result + this.fos.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.reserved.hashCode()
        result = 31 * result + this.stSpace.contentHashCode()
        result = 31 * result + this.xmmSpace.contentHashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserFpxregsStruct> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UserFpxregsStruct> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 1016L
                override fun readNative(addr: Long): UserFpxregsStruct =
                    UserFpxregsStruct(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (32).toInt())
                        ).readNative(addr + 56L).toLongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (32).toInt())
                        ).readNative(addr + 312L).toLongArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (56).toInt())
                        ).readNative(addr + 568L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: UserFpxregsStruct) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cwd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.swd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.twd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.fop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.fip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.fcs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.foo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.fos)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.mxcsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (32).toInt())
                    ).writeNative(addr + 56L, value.stSpace.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (32).toInt())
                    ).writeNative(addr + 312L, value.xmmSpace.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (56).toInt())
                    ).writeNative(addr + 568L, value.padding.toList())
                }
            }
    }
}

public class UcontextT internal constructor(
    public var ucFlags: CUlong,
    ucLinkCtorArg: MutPtr,
    public var ucStack: StackT,
    ucMcontextCtorArg: McontextT,
    public var ucSigmask: SigsetT,
    public var private: UByteArray,
    public var ssp: ULongArray,
) {
    public var ucLink: MutPtr = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucFlags = 0uL,
        ucLinkCtorArg = MutPtr(0L),
        ucStack = StackT(),
        ucMcontextCtorArg = McontextT(),
        ucSigmask = SigsetT(),
        private = UByteArray(112),
        ssp = ULongArray(4),
    )

    public operator fun component1(): CUlong = this.ucFlags

    public operator fun component2(): MutPtr = this.ucLink

    public operator fun component3(): StackT = this.ucStack

    public operator fun component4(): McontextT = this.ucMcontext

    public operator fun component5(): SigsetT = this.ucSigmask

    public operator fun component6(): UByteArray = this.private

    public operator fun component7(): ULongArray = this.ssp

    public fun copy(ucFlags: CUlong = this.ucFlags, ucLink: MutPtr = this.ucLink, ucStack: StackT = this.ucStack, ucMcontext: McontextT = this.ucMcontext, ucSigmask: SigsetT = this.ucSigmask, private: UByteArray = this.private, ssp: ULongArray = this.ssp): UcontextT = UcontextT(ucFlags = ucFlags, ucLinkCtorArg = ucLink, ucStack = ucStack, ucMcontextCtorArg = ucMcontext, ucSigmask = ucSigmask, private = private, ssp = ssp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucFlags != other.ucFlags) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (!this.private.contentEquals(other.private)) return false
        if (!this.ssp.contentEquals(other.ssp)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucFlags.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.private.contentHashCode()
        result = 31 * result + this.ssp.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucFlags: CUlong = 0uL,
            ucLink: MutPtr = MutPtr(0L),
            ucStack: StackT = StackT(),
            ucMcontext: McontextT = McontextT(),
            ucSigmask: SigsetT = SigsetT(),
            private: UByteArray = UByteArray(112),
            ssp: ULongArray = ULongArray(4),
        ): UcontextT =
            UcontextT(
                ucFlags = ucFlags,
                ucLinkCtorArg = ucLink,
                ucStack = ucStack,
                ucMcontextCtorArg = ucMcontext,
                ucSigmask = ucSigmask,
                private = private,
                ssp = ssp,
            )
    }
}

public data class MaxAlignT(
    public var priv: DoubleArray = DoubleArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MaxAlignT) return false
        if (!this.priv.contentEquals(other.priv)) return false
        return true
    }

    override fun hashCode(): Int = this.priv.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (6).toInt())
                        ).readNative(addr).toDoubleArray(),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (6).toInt())
                    ).writeNative(addr, value.priv.toList())
                }
            }
    }
}
