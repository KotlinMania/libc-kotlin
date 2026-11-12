@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.mem.constPtrFromRustCast
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface SigeventSigevNotifyFunctionCallback {
    public operator fun invoke(value: Sigval)
}

public class DebugStruct(
    private val out: StringBuilder,
    private val name: String,
) {
    private val fields: MutableList<String> = mutableListOf()

    public fun field(name: String, value: Any?): DebugStruct =
        apply {
            fields.add("$name: $value")
        }

    public fun finish() {
        if (fields.isEmpty()) {
            out.append(name)
        } else {
            out.append("$name { ${fields.joinToString(", ")} }")
        }
    }

    public fun finishNonExhaustive() {
        fields.add("..")
        finish()
    }
}

public data class Itimerspec(
    public var itInterval: Timespec = Timespec(),
    public var itValue: Timespec = Timespec(),
)

public data class CpuSetT(
    public var bits: ULongArray = ULongArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CpuSetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuSetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CpuSetT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): CpuSetT =
                    CpuSetT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: CpuSetT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (16).toInt())
                    ).writeNative(addr, value.bits.toList())
                }
            }
    }
}

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saMask: SigsetT = 0uL,
    public var saFlags: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigaction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigaction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Sigaction =
                    Sigaction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Sigaction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.saSigaction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.saMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.saFlags)
                }
            }
    }
}

public class StackT internal constructor(
    ssSpCtorArg: MutPtr<CVoid>,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
) {
    public var ssSp: MutPtr<CVoid> = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssFlags = 0,
        ssSize = 0uL,
    )

    public operator fun component1(): MutPtr<CVoid> = this.ssSp

    public operator fun component2(): CInt = this.ssFlags

    public operator fun component3(): SizeT = this.ssSize

    public fun copy(ssSp: MutPtr<CVoid> = this.ssSp, ssFlags: CInt = this.ssFlags, ssSize: SizeT = this.ssSize): StackT = StackT(ssSpCtorArg = ssSp, ssFlags = ssFlags, ssSize = ssSize)

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
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ssFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ssSize)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr<CVoid> = MutPtr(0L),
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

public class Tm internal constructor(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
    public var tmGmtoff: CLong,
    tmZoneCtorArg: ConstPtr<CChar>,
) {
    public var tmZone: ConstPtr<CChar> = tmZoneCtorArg
        internal set

    public constructor() : this(
        tmSec = 0,
        tmMin = 0,
        tmHour = 0,
        tmMday = 0,
        tmMon = 0,
        tmYear = 0,
        tmWday = 0,
        tmYday = 0,
        tmIsdst = 0,
        tmGmtoff = 0L,
        tmZoneCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): CInt = this.tmSec

    public operator fun component2(): CInt = this.tmMin

    public operator fun component3(): CInt = this.tmHour

    public operator fun component4(): CInt = this.tmMday

    public operator fun component5(): CInt = this.tmMon

    public operator fun component6(): CInt = this.tmYear

    public operator fun component7(): CInt = this.tmWday

    public operator fun component8(): CInt = this.tmYday

    public operator fun component9(): CInt = this.tmIsdst

    public operator fun component10(): CLong = this.tmGmtoff

    public operator fun component11(): ConstPtr<CChar> = this.tmZone

    public fun copy(tmSec: CInt = this.tmSec, tmMin: CInt = this.tmMin, tmHour: CInt = this.tmHour, tmMday: CInt = this.tmMday, tmMon: CInt = this.tmMon, tmYear: CInt = this.tmYear, tmWday: CInt = this.tmWday, tmYday: CInt = this.tmYday, tmIsdst: CInt = this.tmIsdst, tmGmtoff: CLong = this.tmGmtoff, tmZone: ConstPtr<CChar> = this.tmZone): Tm = Tm(tmSec = tmSec, tmMin = tmMin, tmHour = tmHour, tmMday = tmMday, tmMon = tmMon, tmYear = tmYear, tmWday = tmWday, tmYday = tmYday, tmIsdst = tmIsdst, tmGmtoff = tmGmtoff, tmZoneCtorArg = tmZone)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Tm) return false
        if (this.tmSec != other.tmSec) return false
        if (this.tmMin != other.tmMin) return false
        if (this.tmHour != other.tmHour) return false
        if (this.tmMday != other.tmMday) return false
        if (this.tmMon != other.tmMon) return false
        if (this.tmYear != other.tmYear) return false
        if (this.tmWday != other.tmWday) return false
        if (this.tmYday != other.tmYday) return false
        if (this.tmIsdst != other.tmIsdst) return false
        if (this.tmGmtoff != other.tmGmtoff) return false
        if (this.tmZone != other.tmZone) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.tmSec.hashCode()
        result = 31 * result + this.tmMin.hashCode()
        result = 31 * result + this.tmHour.hashCode()
        result = 31 * result + this.tmMday.hashCode()
        result = 31 * result + this.tmMon.hashCode()
        result = 31 * result + this.tmYear.hashCode()
        result = 31 * result + this.tmWday.hashCode()
        result = 31 * result + this.tmYday.hashCode()
        result = 31 * result + this.tmIsdst.hashCode()
        result = 31 * result + this.tmGmtoff.hashCode()
        result = 31 * result + this.tmZone.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tm> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Tm =
                    Tm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Tm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tmSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tmMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.tmHour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.tmMday)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.tmMon)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.tmYear)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.tmWday)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.tmYday)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.tmIsdst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.tmGmtoff)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 48L, value.tmZone)
                }
            }

        public operator fun invoke(
            tmSec: CInt = 0,
            tmMin: CInt = 0,
            tmHour: CInt = 0,
            tmMday: CInt = 0,
            tmMon: CInt = 0,
            tmYear: CInt = 0,
            tmWday: CInt = 0,
            tmYday: CInt = 0,
            tmIsdst: CInt = 0,
            tmGmtoff: CLong = 0L,
            tmZone: ConstPtr<CChar> = ConstPtr(0L),
        ): Tm =
            Tm(
                tmSec = tmSec,
                tmMin = tmMin,
                tmHour = tmHour,
                tmMday = tmMday,
                tmMon = tmMon,
                tmYear = tmYear,
                tmWday = tmWday,
                tmYday = tmYday,
                tmIsdst = tmIsdst,
                tmGmtoff = tmGmtoff,
                tmZoneCtorArg = tmZone,
            )
    }
}

public data class Bintime(
    public var sec: TimeT = 0L,
    public var frac: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bintime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Bintime> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Bintime =
                    Bintime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Bintime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.sec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.frac)
                }
            }
    }
}

public class Passwd internal constructor(
    pwNameCtorArg: MutPtr<CChar>,
    pwPasswdCtorArg: MutPtr<CChar>,
    public var pwUid: UidT,
    public var pwGid: GidT,
    pwCommentCtorArg: MutPtr<CChar>,
    pwGecosCtorArg: MutPtr<CChar>,
    pwDirCtorArg: MutPtr<CChar>,
    pwShellCtorArg: MutPtr<CChar>,
) {
    public var pwName: MutPtr<CChar> = pwNameCtorArg
        internal set

    public var pwPasswd: MutPtr<CChar> = pwPasswdCtorArg
        internal set

    public var pwComment: MutPtr<CChar> = pwCommentCtorArg
        internal set

    public var pwGecos: MutPtr<CChar> = pwGecosCtorArg
        internal set

    public var pwDir: MutPtr<CChar> = pwDirCtorArg
        internal set

    public var pwShell: MutPtr<CChar> = pwShellCtorArg
        internal set

    public constructor() : this(
        pwNameCtorArg = MutPtr(0L),
        pwPasswdCtorArg = MutPtr(0L),
        pwUid = 0u,
        pwGid = 0u,
        pwCommentCtorArg = MutPtr(0L),
        pwGecosCtorArg = MutPtr(0L),
        pwDirCtorArg = MutPtr(0L),
        pwShellCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.pwName

    public operator fun component2(): MutPtr<CChar> = this.pwPasswd

    public operator fun component3(): UidT = this.pwUid

    public operator fun component4(): GidT = this.pwGid

    public operator fun component5(): MutPtr<CChar> = this.pwComment

    public operator fun component6(): MutPtr<CChar> = this.pwGecos

    public operator fun component7(): MutPtr<CChar> = this.pwDir

    public operator fun component8(): MutPtr<CChar> = this.pwShell

    public fun copy(pwName: MutPtr<CChar> = this.pwName, pwPasswd: MutPtr<CChar> = this.pwPasswd, pwUid: UidT = this.pwUid, pwGid: GidT = this.pwGid, pwComment: MutPtr<CChar> = this.pwComment, pwGecos: MutPtr<CChar> = this.pwGecos, pwDir: MutPtr<CChar> = this.pwDir, pwShell: MutPtr<CChar> = this.pwShell): Passwd = Passwd(pwNameCtorArg = pwName, pwPasswdCtorArg = pwPasswd, pwUid = pwUid, pwGid = pwGid, pwCommentCtorArg = pwComment, pwGecosCtorArg = pwGecos, pwDirCtorArg = pwDir, pwShellCtorArg = pwShell)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Passwd) return false
        if (this.pwName != other.pwName) return false
        if (this.pwPasswd != other.pwPasswd) return false
        if (this.pwUid != other.pwUid) return false
        if (this.pwGid != other.pwGid) return false
        if (this.pwComment != other.pwComment) return false
        if (this.pwGecos != other.pwGecos) return false
        if (this.pwDir != other.pwDir) return false
        if (this.pwShell != other.pwShell) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwName.hashCode()
        result = 31 * result + this.pwPasswd.hashCode()
        result = 31 * result + this.pwUid.hashCode()
        result = 31 * result + this.pwGid.hashCode()
        result = 31 * result + this.pwComment.hashCode()
        result = 31 * result + this.pwGecos.hashCode()
        result = 31 * result + this.pwDir.hashCode()
        result = 31 * result + this.pwShell.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Passwd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Passwd> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Passwd =
                    Passwd(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Passwd) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.pwName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.pwPasswd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.pwUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.pwGid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 24L, value.pwComment)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 32L, value.pwGecos)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 40L, value.pwDir)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 48L, value.pwShell)
                }
            }

        public operator fun invoke(
            pwName: MutPtr<CChar> = MutPtr(0L),
            pwPasswd: MutPtr<CChar> = MutPtr(0L),
            pwUid: UidT = 0u,
            pwGid: GidT = 0u,
            pwComment: MutPtr<CChar> = MutPtr(0L),
            pwGecos: MutPtr<CChar> = MutPtr(0L),
            pwDir: MutPtr<CChar> = MutPtr(0L),
            pwShell: MutPtr<CChar> = MutPtr(0L),
        ): Passwd =
            Passwd(
                pwNameCtorArg = pwName,
                pwPasswdCtorArg = pwPasswd,
                pwUid = pwUid,
                pwGid = pwGid,
                pwCommentCtorArg = pwComment,
                pwGecosCtorArg = pwGecos,
                pwDirCtorArg = pwDir,
                pwShellCtorArg = pwShell,
            )
    }
}

public class IfNameindex internal constructor(
    public var ifIndex: CUint,
    ifNameCtorArg: MutPtr<CChar>,
) {
    public var ifName: MutPtr<CChar> = ifNameCtorArg
        internal set

    public constructor() : this(
        ifIndex = 0u,
        ifNameCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ifIndex

    public operator fun component2(): MutPtr<CChar> = this.ifName

    public fun copy(ifIndex: CUint = this.ifIndex, ifName: MutPtr<CChar> = this.ifName): IfNameindex = IfNameindex(ifIndex = ifIndex, ifNameCtorArg = ifName)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IfNameindex) return false
        if (this.ifIndex != other.ifIndex) return false
        if (this.ifName != other.ifName) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifIndex.hashCode()
        result = 31 * result + this.ifName.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfNameindex> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IfNameindex> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): IfNameindex =
                    IfNameindex(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IfNameindex) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ifIndex)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.ifName)
                }
            }

        public operator fun invoke(
            ifIndex: CUint = 0u,
            ifName: MutPtr<CChar> = MutPtr(0L),
        ): IfNameindex =
            IfNameindex(
                ifIndex = ifIndex,
                ifNameCtorArg = ifName,
            )
    }
}

public data class Ucred(
    public var pid: PidT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ucred> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ucred> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Ucred =
                    Ucred(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Ucred) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.pid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.uid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.gid)
                }
            }
    }
}

public class Msghdr internal constructor(
    msgNameCtorArg: MutPtr<CVoid>,
    public var msgNamelen: SocklenT,
    msgIovCtorArg: MutPtr<Iovec>,
    public var msgIovlen: CInt,
    msgControlCtorArg: MutPtr<CVoid>,
    public var msgControllen: SocklenT,
    public var msgFlags: CInt,
) {
    public var msgName: MutPtr<CVoid> = msgNameCtorArg
        internal set

    public var msgIov: MutPtr<Iovec> = msgIovCtorArg
        internal set

    public var msgControl: MutPtr<CVoid> = msgControlCtorArg
        internal set

    public constructor() : this(
        msgNameCtorArg = MutPtr(0L),
        msgNamelen = 0,
        msgIovCtorArg = MutPtr(0L),
        msgIovlen = 0,
        msgControlCtorArg = MutPtr(0L),
        msgControllen = 0,
        msgFlags = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.msgName

    public operator fun component2(): SocklenT = this.msgNamelen

    public operator fun component3(): MutPtr<Iovec> = this.msgIov

    public operator fun component4(): CInt = this.msgIovlen

    public operator fun component5(): MutPtr<CVoid> = this.msgControl

    public operator fun component6(): SocklenT = this.msgControllen

    public operator fun component7(): CInt = this.msgFlags

    public fun copy(msgName: MutPtr<CVoid> = this.msgName, msgNamelen: SocklenT = this.msgNamelen, msgIov: MutPtr<Iovec> = this.msgIov, msgIovlen: CInt = this.msgIovlen, msgControl: MutPtr<CVoid> = this.msgControl, msgControllen: SocklenT = this.msgControllen, msgFlags: CInt = this.msgFlags): Msghdr = Msghdr(msgNameCtorArg = msgName, msgNamelen = msgNamelen, msgIovCtorArg = msgIov, msgIovlen = msgIovlen, msgControlCtorArg = msgControl, msgControllen = msgControllen, msgFlags = msgFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msghdr) return false
        if (this.msgName != other.msgName) return false
        if (this.msgNamelen != other.msgNamelen) return false
        if (this.msgIov != other.msgIov) return false
        if (this.msgIovlen != other.msgIovlen) return false
        if (this.msgControl != other.msgControl) return false
        if (this.msgControllen != other.msgControllen) return false
        if (this.msgFlags != other.msgFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msgName.hashCode()
        result = 31 * result + this.msgNamelen.hashCode()
        result = 31 * result + this.msgIov.hashCode()
        result = 31 * result + this.msgIovlen.hashCode()
        result = 31 * result + this.msgControl.hashCode()
        result = 31 * result + this.msgControllen.hashCode()
        result = 31 * result + this.msgFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msghdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Msghdr =
                    Msghdr(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Iovec>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: Msghdr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.msgName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.msgNamelen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Iovec>(64)
                    ).writeNative(addr + 16L, value.msgIov)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.msgIovlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.msgControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.msgControllen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.msgFlags)
                }
            }

        public operator fun invoke(
            msgName: MutPtr<CVoid> = MutPtr(0L),
            msgNamelen: SocklenT = 0,
            msgIov: MutPtr<Iovec> = MutPtr(0L),
            msgIovlen: CInt = 0,
            msgControl: MutPtr<CVoid> = MutPtr(0L),
            msgControllen: SocklenT = 0,
            msgFlags: CInt = 0,
        ): Msghdr =
            Msghdr(
                msgNameCtorArg = msgName,
                msgNamelen = msgNamelen,
                msgIovCtorArg = msgIov,
                msgIovlen = msgIovlen,
                msgControlCtorArg = msgControl,
                msgControllen = msgControllen,
                msgFlags = msgFlags,
            )
    }
}

public data class Cmsghdr(
    public var cmsgLen: SizeT = 0uL,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Cmsghdr =
                    Cmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Cmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.cmsgLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cmsgLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.cmsgType)
                }
            }
    }
}

public class DlInfo internal constructor(
    public var dliFname: UByteArray,
    dliFbaseCtorArg: MutPtr<CVoid>,
    dliSnameCtorArg: ConstPtr<CChar>,
    dliSaddrCtorArg: MutPtr<CVoid>,
) {
    public var dliFbase: MutPtr<CVoid> = dliFbaseCtorArg
        internal set

    public var dliSname: ConstPtr<CChar> = dliSnameCtorArg
        internal set

    public var dliSaddr: MutPtr<CVoid> = dliSaddrCtorArg
        internal set

    public constructor() : this(
        dliFname = UByteArray(PATH_MAX),
        dliFbaseCtorArg = MutPtr(0L),
        dliSnameCtorArg = ConstPtr(0L),
        dliSaddrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UByteArray = this.dliFname

    public operator fun component2(): MutPtr<CVoid> = this.dliFbase

    public operator fun component3(): ConstPtr<CChar> = this.dliSname

    public operator fun component4(): MutPtr<CVoid> = this.dliSaddr

    public fun copy(dliFname: UByteArray = this.dliFname, dliFbase: MutPtr<CVoid> = this.dliFbase, dliSname: ConstPtr<CChar> = this.dliSname, dliSaddr: MutPtr<CVoid> = this.dliSaddr): DlInfo = DlInfo(dliFname = dliFname, dliFbaseCtorArg = dliFbase, dliSnameCtorArg = dliSname, dliSaddrCtorArg = dliSaddr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlInfo) return false
        if (!this.dliFname.contentEquals(other.dliFname)) return false
        if (this.dliFbase != other.dliFbase) return false
        if (this.dliSname != other.dliSname) return false
        if (this.dliSaddr != other.dliSaddr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dliFname.contentHashCode()
        result = 31 * result + this.dliFbase.hashCode()
        result = 31 * result + this.dliSname.hashCode()
        result = 31 * result + this.dliSaddr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlInfo> {
                override val alignBytes: Long = 8L
                private val off1: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((PATH_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 8L)
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off1 + 8L), 8L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + 8L), 8L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + 8L), 8L)
                override fun readNative(addr: Long): DlInfo =
                    DlInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PATH_MAX).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + off1),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + off2),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + off3),
                    )
                override fun writeNative(addr: Long, value: DlInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PATH_MAX).toInt())
                    ).writeNative(addr, value.dliFname.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + off1, value.dliFbase)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + off2, value.dliSname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + off3, value.dliSaddr)
                }
            }

        public operator fun invoke(
            dliFname: UByteArray = UByteArray(PATH_MAX),
            dliFbase: MutPtr<CVoid> = MutPtr(0L),
            dliSname: ConstPtr<CChar> = ConstPtr(0L),
            dliSaddr: MutPtr<CVoid> = MutPtr(0L),
        ): DlInfo =
            DlInfo(
                dliFname = dliFname,
                dliFbaseCtorArg = dliFbase,
                dliSnameCtorArg = dliSname,
                dliSaddrCtorArg = dliSaddr,
            )
    }
}

public data class In6Pktinfo(
    public var ipi6Addr: In6Addr = In6Addr(),
    public var ipi6Ifindex: UInt = 0u,
)

public data class SockaddrIn6(
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

public data class IpMreqSource(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrSourceaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMreqSource> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMreqSource> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): IpMreqSource =
                    IpMreqSource(
                        (InAddr.typeLayout()).readNative(addr),
                        (InAddr.typeLayout()).readNative(addr + 4L),
                        (InAddr.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IpMreqSource) {
                    (InAddr.typeLayout()).writeNative(addr, value.imrMultiaddr)
                    (InAddr.typeLayout()).writeNative(addr + 4L, value.imrSourceaddr)
                    (InAddr.typeLayout()).writeNative(addr + 8L, value.imrInterface)
                }
            }
    }
}

public class Addrinfo internal constructor(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    aiCanonnameCtorArg: MutPtr<CChar>,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiNextCtorArg: MutPtr<Addrinfo>,
) {
    public var aiCanonname: MutPtr<CChar> = aiCanonnameCtorArg
        internal set

    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfo> = aiNextCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0,
        aiCanonnameCtorArg = MutPtr(0L),
        aiAddrCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.aiFlags

    public operator fun component2(): CInt = this.aiFamily

    public operator fun component3(): CInt = this.aiSocktype

    public operator fun component4(): CInt = this.aiProtocol

    public operator fun component5(): SocklenT = this.aiAddrlen

    public operator fun component6(): MutPtr<CChar> = this.aiCanonname

    public operator fun component7(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component8(): MutPtr<Addrinfo> = this.aiNext

    public fun copy(aiFlags: CInt = this.aiFlags, aiFamily: CInt = this.aiFamily, aiSocktype: CInt = this.aiSocktype, aiProtocol: CInt = this.aiProtocol, aiAddrlen: SocklenT = this.aiAddrlen, aiCanonname: MutPtr<CChar> = this.aiCanonname, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiNext: MutPtr<Addrinfo> = this.aiNext): Addrinfo = Addrinfo(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiCanonnameCtorArg = aiCanonname, aiAddrCtorArg = aiAddr, aiNextCtorArg = aiNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfo) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiNext != other.aiNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Addrinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Addrinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Addrinfo =
                    Addrinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Addrinfo>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Addrinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.aiFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.aiFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.aiSocktype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.aiProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.aiAddrlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 24L, value.aiCanonname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 32L, value.aiAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Addrinfo>(64)
                    ).writeNative(addr + 40L, value.aiNext)
                }
            }

        public operator fun invoke(
            aiFlags: CInt = 0,
            aiFamily: CInt = 0,
            aiSocktype: CInt = 0,
            aiProtocol: CInt = 0,
            aiAddrlen: SocklenT = 0,
            aiCanonname: MutPtr<CChar> = MutPtr(0L),
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiNext: MutPtr<Addrinfo> = MutPtr(0L),
        ): Addrinfo =
            Addrinfo(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiCanonnameCtorArg = aiCanonname,
                aiAddrCtorArg = aiAddr,
                aiNextCtorArg = aiNext,
            )
    }
}

public class Lconv internal constructor(
    decimalPointCtorArg: MutPtr<CChar>,
    thousandsSepCtorArg: MutPtr<CChar>,
    groupingCtorArg: MutPtr<CChar>,
    intCurrSymbolCtorArg: MutPtr<CChar>,
    currencySymbolCtorArg: MutPtr<CChar>,
    monDecimalPointCtorArg: MutPtr<CChar>,
    monThousandsSepCtorArg: MutPtr<CChar>,
    monGroupingCtorArg: MutPtr<CChar>,
    positiveSignCtorArg: MutPtr<CChar>,
    negativeSignCtorArg: MutPtr<CChar>,
    public var intFracDigits: CChar,
    public var fracDigits: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var nSignPosn: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intNSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intPSignPosn: CChar,
) {
    public var decimalPoint: MutPtr<CChar> = decimalPointCtorArg
        internal set

    public var thousandsSep: MutPtr<CChar> = thousandsSepCtorArg
        internal set

    public var grouping: MutPtr<CChar> = groupingCtorArg
        internal set

    public var intCurrSymbol: MutPtr<CChar> = intCurrSymbolCtorArg
        internal set

    public var currencySymbol: MutPtr<CChar> = currencySymbolCtorArg
        internal set

    public var monDecimalPoint: MutPtr<CChar> = monDecimalPointCtorArg
        internal set

    public var monThousandsSep: MutPtr<CChar> = monThousandsSepCtorArg
        internal set

    public var monGrouping: MutPtr<CChar> = monGroupingCtorArg
        internal set

    public var positiveSign: MutPtr<CChar> = positiveSignCtorArg
        internal set

    public var negativeSign: MutPtr<CChar> = negativeSignCtorArg
        internal set

    public constructor() : this(
        decimalPointCtorArg = MutPtr(0L),
        thousandsSepCtorArg = MutPtr(0L),
        groupingCtorArg = MutPtr(0L),
        intCurrSymbolCtorArg = MutPtr(0L),
        currencySymbolCtorArg = MutPtr(0L),
        monDecimalPointCtorArg = MutPtr(0L),
        monThousandsSepCtorArg = MutPtr(0L),
        monGroupingCtorArg = MutPtr(0L),
        positiveSignCtorArg = MutPtr(0L),
        negativeSignCtorArg = MutPtr(0L),
        intFracDigits = 0u,
        fracDigits = 0u,
        pCsPrecedes = 0u,
        pSepBySpace = 0u,
        nCsPrecedes = 0u,
        nSepBySpace = 0u,
        pSignPosn = 0u,
        nSignPosn = 0u,
        intNCsPrecedes = 0u,
        intNSepBySpace = 0u,
        intNSignPosn = 0u,
        intPCsPrecedes = 0u,
        intPSepBySpace = 0u,
        intPSignPosn = 0u,
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lconv> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lconv> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): Lconv =
                    Lconv(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 81L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 82L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 83L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 85L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 86L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 87L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 89L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 90L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 91L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 93L),
                    )
                override fun writeNative(addr: Long, value: Lconv) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.decimalPoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.thousandsSep)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.grouping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 24L, value.intCurrSymbol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 32L, value.currencySymbol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 40L, value.monDecimalPoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 48L, value.monThousandsSep)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 56L, value.monGrouping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 64L, value.positiveSign)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 72L, value.negativeSign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 80L, value.intFracDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 81L, value.fracDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 82L, value.pCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 83L, value.pSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 84L, value.nCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 85L, value.nSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 86L, value.pSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 87L, value.nSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 88L, value.intNCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 89L, value.intNSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 90L, value.intNSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 91L, value.intPCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 92L, value.intPSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 93L, value.intPSignPosn)
                }
            }

        public operator fun invoke(
            decimalPoint: MutPtr<CChar> = MutPtr(0L),
            thousandsSep: MutPtr<CChar> = MutPtr(0L),
            grouping: MutPtr<CChar> = MutPtr(0L),
            intCurrSymbol: MutPtr<CChar> = MutPtr(0L),
            currencySymbol: MutPtr<CChar> = MutPtr(0L),
            monDecimalPoint: MutPtr<CChar> = MutPtr(0L),
            monThousandsSep: MutPtr<CChar> = MutPtr(0L),
            monGrouping: MutPtr<CChar> = MutPtr(0L),
            positiveSign: MutPtr<CChar> = MutPtr(0L),
            negativeSign: MutPtr<CChar> = MutPtr(0L),
            intFracDigits: CChar = 0u,
            fracDigits: CChar = 0u,
            pCsPrecedes: CChar = 0u,
            pSepBySpace: CChar = 0u,
            nCsPrecedes: CChar = 0u,
            nSepBySpace: CChar = 0u,
            pSignPosn: CChar = 0u,
            nSignPosn: CChar = 0u,
            intNCsPrecedes: CChar = 0u,
            intNSepBySpace: CChar = 0u,
            intNSignPosn: CChar = 0u,
            intPCsPrecedes: CChar = 0u,
            intPSepBySpace: CChar = 0u,
            intPSignPosn: CChar = 0u,
        ): Lconv =
            Lconv(
                decimalPointCtorArg = decimalPoint,
                thousandsSepCtorArg = thousandsSep,
                groupingCtorArg = grouping,
                intCurrSymbolCtorArg = intCurrSymbol,
                currencySymbolCtorArg = currencySymbol,
                monDecimalPointCtorArg = monDecimalPoint,
                monThousandsSepCtorArg = monThousandsSep,
                monGroupingCtorArg = monGrouping,
                positiveSignCtorArg = positiveSign,
                negativeSignCtorArg = negativeSign,
                intFracDigits = intFracDigits,
                fracDigits = fracDigits,
                pCsPrecedes = pCsPrecedes,
                pSepBySpace = pSepBySpace,
                nCsPrecedes = nCsPrecedes,
                nSepBySpace = nSepBySpace,
                pSignPosn = pSignPosn,
                nSignPosn = nSignPosn,
                intNCsPrecedes = intNCsPrecedes,
                intNSepBySpace = intNSepBySpace,
                intNSignPosn = intNSignPosn,
                intPCsPrecedes = intPCsPrecedes,
                intPSepBySpace = intPSepBySpace,
                intPSignPosn = intPSignPosn,
            )
    }
}

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CChar = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
    public var cIspeed: SpeedT = 0u,
    public var cOspeed: SpeedT = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (this.cLine != other.cLine) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (this.cIspeed != other.cIspeed) return false
        if (this.cOspeed != other.cOspeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cLine.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios> {
                override val alignBytes: Long = 4L
                private val off6: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((17L + ((NCCS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                private val off7: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off6 + 4L), 4L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off7 + 4L), 4L)
                override fun readNative(addr: Long): Termios =
                    Termios(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (NCCS).toInt())
                        ).readNative(addr + 17L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off6),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off7),
                    )
                override fun writeNative(addr: Long, value: Termios) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cIflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cOflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cCflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cLflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.cLine)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (NCCS).toInt())
                    ).writeNative(addr + 17L, value.cCc.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off6, value.cIspeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off7, value.cOspeed)
                }
            }
    }
}

public data class SchedParam(
    public var schedPriority: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): SchedParam =
                    SchedParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SchedParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.schedPriority)
                }
            }
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

public class Hostent internal constructor(
    hNameCtorArg: ConstPtr<CChar>,
    hAliasesCtorArg: MutPtr<MutPtr<CChar>>,
    public var hAddrtype: CShort,
    public var hLength: CShort,
    hAddrListCtorArg: MutPtr<MutPtr<CChar>>,
) {
    public var hName: ConstPtr<CChar> = hNameCtorArg
        internal set

    public var hAliases: MutPtr<MutPtr<CChar>> = hAliasesCtorArg
        internal set

    public var hAddrList: MutPtr<MutPtr<CChar>> = hAddrListCtorArg
        internal set

    public constructor() : this(
        hNameCtorArg = ConstPtr(0L),
        hAliasesCtorArg = MutPtr(0L),
        hAddrtype = 0,
        hLength = 0,
        hAddrListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<CChar> = this.hName

    public operator fun component2(): MutPtr<MutPtr<CChar>> = this.hAliases

    public operator fun component3(): CShort = this.hAddrtype

    public operator fun component4(): CShort = this.hLength

    public operator fun component5(): MutPtr<MutPtr<CChar>> = this.hAddrList

    public fun copy(hName: ConstPtr<CChar> = this.hName, hAliases: MutPtr<MutPtr<CChar>> = this.hAliases, hAddrtype: CShort = this.hAddrtype, hLength: CShort = this.hLength, hAddrList: MutPtr<MutPtr<CChar>> = this.hAddrList): Hostent = Hostent(hNameCtorArg = hName, hAliasesCtorArg = hAliases, hAddrtype = hAddrtype, hLength = hLength, hAddrListCtorArg = hAddrList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Hostent) return false
        if (this.hName != other.hName) return false
        if (this.hAliases != other.hAliases) return false
        if (this.hAddrtype != other.hAddrtype) return false
        if (this.hLength != other.hLength) return false
        if (this.hAddrList != other.hAddrList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.hName.hashCode()
        result = 31 * result + this.hAliases.hashCode()
        result = 31 * result + this.hAddrtype.hashCode()
        result = 31 * result + this.hLength.hashCode()
        result = 31 * result + this.hAddrList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hostent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Hostent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Hostent =
                    Hostent(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CChar>>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CChar>>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Hostent) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr, value.hName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CChar>>(64)
                    ).writeNative(addr + 8L, value.hAliases)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.hAddrtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 18L, value.hLength)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CChar>>(64)
                    ).writeNative(addr + 24L, value.hAddrList)
                }
            }

        public operator fun invoke(
            hName: ConstPtr<CChar> = ConstPtr(0L),
            hAliases: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            hAddrtype: CShort = 0,
            hLength: CShort = 0,
            hAddrList: MutPtr<MutPtr<CChar>> = MutPtr(0L),
        ): Hostent =
            Hostent(
                hNameCtorArg = hName,
                hAliasesCtorArg = hAliases,
                hAddrtype = hAddrtype,
                hLength = hLength,
                hAddrListCtorArg = hAddrList,
            )
    }
}

public data class Linger(
    public var lOnoff: CUshort = 0u,
    public var lLinger: CUshort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linger> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linger> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Linger =
                    Linger(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Linger) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.lOnoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.lLinger)
                }
            }
    }
}

public data class FdSet(
    public var fdsBits: ULongArray = ULongArray(FD_SETSIZE / sizeOf<CUlong>(typeLayoutT = ObjectSlotLayout<CUlong>()) / 8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (!this.fdsBits.contentEquals(other.fdsBits)) return false
        return true
    }

    override fun hashCode(): Int = this.fdsBits.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdSet> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((FD_SETSIZE / sizeOf<CUlong>(typeLayoutT = ObjectSlotLayout<CUlong>()) / 8).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).strideBytes), 8L)
                override fun readNative(addr: Long): FdSet =
                    FdSet(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (FD_SETSIZE / sizeOf<CUlong>(typeLayoutT = ObjectSlotLayout<CUlong>()) / 8).toInt())
                        ).readNative(addr).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: FdSet) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (FD_SETSIZE / sizeOf<CUlong>(typeLayoutT = ObjectSlotLayout<CUlong>()) / 8).toInt())
                    ).writeNative(addr, value.fdsBits.toList())
                }
            }
    }
}

public data class UcFpxreg(
    public var significand: UShortArray = UShortArray(4),
    public var exponent: UShort = 0u,
    public var padding: UShortArray = UShortArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcFpxreg) return false
        if (!this.significand.contentEquals(other.significand)) return false
        if (this.exponent != other.exponent) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.significand.contentHashCode()
        result = 31 * result + this.exponent.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UcFpxreg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UcFpxreg> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UcFpxreg =
                    UcFpxreg(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                        ).readNative(addr).toUShortArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                        ).readNative(addr + 10L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: UcFpxreg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (4).toInt())
                    ).writeNative(addr, value.significand.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.exponent)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (3).toInt())
                    ).writeNative(addr + 10L, value.padding.toList())
                }
            }
    }
}

public data class UcXmmreg(
    public var element: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcXmmreg) return false
        if (!this.element.contentEquals(other.element)) return false
        return true
    }

    override fun hashCode(): Int = this.element.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UcXmmreg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UcXmmreg> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UcXmmreg =
                    UcXmmreg(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: UcXmmreg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.element.toList())
                }
            }
    }
}

public data class Fpstate(
    public var cwd: UShort = 0u,
    public var swd: UShort = 0u,
    public var ftw: UShort = 0u,
    public var fop: UShort = 0u,
    public var rip: ULong = 0uL,
    public var rdp: ULong = 0uL,
    public var mxcsr: UInt = 0u,
    public var mxcrMask: UInt = 0u,
    public var st: List<UcFpxreg> = List(8) { UcFpxreg() },
    public var xmm: List<UcXmmreg> = List(16) { UcXmmreg() },
    public var padding: UIntArray = UIntArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Fpstate) return false
        if (this.cwd != other.cwd) return false
        if (this.swd != other.swd) return false
        if (this.ftw != other.ftw) return false
        if (this.fop != other.fop) return false
        if (this.rip != other.rip) return false
        if (this.rdp != other.rdp) return false
        if (this.mxcsr != other.mxcsr) return false
        if (this.mxcrMask != other.mxcrMask) return false
        if (this.st != other.st) return false
        if (this.xmm != other.xmm) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cwd.hashCode()
        result = 31 * result + this.swd.hashCode()
        result = 31 * result + this.ftw.hashCode()
        result = 31 * result + this.fop.hashCode()
        result = 31 * result + this.rip.hashCode()
        result = 31 * result + this.rdp.hashCode()
        result = 31 * result + this.mxcsr.hashCode()
        result = 31 * result + this.mxcrMask.hashCode()
        result = 31 * result + this.st.hashCode()
        result = 31 * result + this.xmm.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpstate> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Fpstate> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 512L
                override fun readNative(addr: Long): Fpstate =
                    Fpstate(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UcFpxreg.typeLayout(), (8).toInt())
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(UcXmmreg.typeLayout(), (16).toInt())
                        ).readNative(addr + 160L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (24).toInt())
                        ).readNative(addr + 416L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Fpstate) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.cwd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.swd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.ftw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.fop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rip)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.rdp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.mxcsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.mxcrMask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UcFpxreg.typeLayout(), (8).toInt())
                    ).writeNative(addr + 32L, value.st)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(UcXmmreg.typeLayout(), (16).toInt())
                    ).writeNative(addr + 160L, value.xmm)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (24).toInt())
                    ).writeNative(addr + 416L, value.padding.toList())
                }
            }
    }
}

public class McontextT(
    public var p1home: ULong = 0uL,
    public var p2home: ULong = 0uL,
    public var p3home: ULong = 0uL,
    public var p4home: ULong = 0uL,
    public var p5home: ULong = 0uL,
    public var p6home: ULong = 0uL,
    public var ctxflags: UInt = 0u,
    public var mxcsr: UInt = 0u,
    public var cs: UShort = 0u,
    public var ds: UShort = 0u,
    public var es: UShort = 0u,
    public var fs: UShort = 0u,
    public var gs: UShort = 0u,
    public var ss: UShort = 0u,
    public var eflags: UInt = 0u,
    public var dr0: ULong = 0uL,
    public var dr1: ULong = 0uL,
    public var dr2: ULong = 0uL,
    public var dr3: ULong = 0uL,
    public var dr6: ULong = 0uL,
    public var dr7: ULong = 0uL,
    public var rax: ULong = 0uL,
    public var rcx: ULong = 0uL,
    public var rdx: ULong = 0uL,
    public var rbx: ULong = 0uL,
    public var rsp: ULong = 0uL,
    public var rbp: ULong = 0uL,
    public var rsi: ULong = 0uL,
    public var rdi: ULong = 0uL,
    public var r8: ULong = 0uL,
    public var r9: ULong = 0uL,
    public var r10: ULong = 0uL,
    public var r11: ULong = 0uL,
    public var r12: ULong = 0uL,
    public var r13: ULong = 0uL,
    public var r14: ULong = 0uL,
    public var r15: ULong = 0uL,
    public var rip: ULong = 0uL,
    public var fpregs: Fpstate = Fpstate(),
    public var vregs: ULongArray = ULongArray(52),
    public var vcx: ULong = 0uL,
    public var dbc: ULong = 0uL,
    public var btr: ULong = 0uL,
    public var bfr: ULong = 0uL,
    public var etr: ULong = 0uL,
    public var efr: ULong = 0uL,
    public var oldmask: ULong = 0uL,
    public var cr2: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<McontextT> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 1248L
                override fun readNative(addr: Long): McontextT =
                    McontextT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 62L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 66L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 128L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 240L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 248L),
                        (Fpstate.typeLayout()).readNative(addr + 256L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (52).toInt())
                        ).readNative(addr + 768L).toULongArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1208L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1216L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1224L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1232L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1240L),
                    )
                override fun writeNative(addr: Long, value: McontextT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.p1home)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.p2home)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.p3home)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.p4home)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.p5home)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.p6home)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.ctxflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.mxcsr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.cs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.ds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.es)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 62L, value.fs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 64L, value.gs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 66L, value.ss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.eflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.dr0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.dr1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.dr2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.dr3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 104L, value.dr6)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 112L, value.dr7)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 120L, value.rax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 128L, value.rcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 136L, value.rdx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 144L, value.rbx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 152L, value.rsp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 160L, value.rbp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 168L, value.rsi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 176L, value.rdi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 184L, value.r8)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 192L, value.r9)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 200L, value.r10)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 208L, value.r11)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 216L, value.r12)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 224L, value.r13)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 232L, value.r14)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 240L, value.r15)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 248L, value.rip)
                    (Fpstate.typeLayout()).writeNative(addr + 256L, value.fpregs)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (52).toInt())
                    ).writeNative(addr + 768L, value.vregs.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1184L, value.vcx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1192L, value.dbc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1200L, value.btr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1208L, value.bfr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1216L, value.etr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1224L, value.efr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1232L, value.oldmask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1240L, value.cr2)
                }
            }
    }
}

public class Sigevent internal constructor(
    public var sigevValue: Sigval,
    public var sigevSigno: CInt,
    public var sigevNotify: CInt,
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback?,
    sigevNotifyAttributesCtorArg: MutPtr<PthreadAttrT>,
) {
    public var sigevNotifyAttributes: MutPtr<PthreadAttrT> = sigevNotifyAttributesCtorArg
        internal set

    public constructor() : this(
        sigevValue = Sigval(),
        sigevSigno = 0,
        sigevNotify = 0,
        sigevNotifyFunction = null,
        sigevNotifyAttributesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Sigval = this.sigevValue

    public operator fun component2(): CInt = this.sigevSigno

    public operator fun component3(): CInt = this.sigevNotify

    public operator fun component4(): SigeventSigevNotifyFunctionCallback? = this.sigevNotifyFunction

    public operator fun component5(): MutPtr<PthreadAttrT> = this.sigevNotifyAttributes

    public fun copy(sigevValue: Sigval = this.sigevValue, sigevSigno: CInt = this.sigevSigno, sigevNotify: CInt = this.sigevNotify, sigevNotifyFunction: SigeventSigevNotifyFunctionCallback? = this.sigevNotifyFunction, sigevNotifyAttributes: MutPtr<PthreadAttrT> = this.sigevNotifyAttributes): Sigevent = Sigevent(sigevValue = sigevValue, sigevSigno = sigevSigno, sigevNotify = sigevNotify, sigevNotifyFunction = sigevNotifyFunction, sigevNotifyAttributesCtorArg = sigevNotifyAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigevent) return false
        if (this.sigevValue != other.sigevValue) return false
        if (this.sigevSigno != other.sigevSigno) return false
        if (this.sigevNotify != other.sigevNotify) return false
        if (this.sigevNotifyFunction != other.sigevNotifyFunction) return false
        if (this.sigevNotifyAttributes != other.sigevNotifyAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sigevValue.hashCode()
        result = 31 * result + this.sigevSigno.hashCode()
        result = 31 * result + this.sigevNotify.hashCode()
        result = 31 * result + this.sigevNotifyFunction.hashCode()
        result = 31 * result + this.sigevNotifyAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sigevValue: Sigval = Sigval(),
            sigevSigno: CInt = 0,
            sigevNotify: CInt = 0,
            sigevNotifyFunction: SigeventSigevNotifyFunctionCallback? = null,
            sigevNotifyAttributes: MutPtr<PthreadAttrT> = MutPtr(0L),
        ): Sigevent =
            Sigevent(
                sigevValue = sigevValue,
                sigevSigno = sigevSigno,
                sigevNotify = sigevNotify,
                sigevNotifyFunction = sigevNotifyFunction,
                sigevNotifyAttributesCtorArg = sigevNotifyAttributes,
            )
    }
}

public class UcontextT internal constructor(
    ucMcontextCtorArg: McontextT,
    ucLinkCtorArg: MutPtr<UcontextT>,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    public var ucFlags: CUlong,
) {
    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public var ucLink: MutPtr<UcontextT> = ucLinkCtorArg
        internal set

    public constructor() : this(
        ucMcontextCtorArg = McontextT(),
        ucLinkCtorArg = MutPtr(0L),
        ucSigmask = 0uL,
        ucStack = StackT(),
        ucFlags = 0uL,
    )

    public operator fun component1(): McontextT = this.ucMcontext

    public operator fun component2(): MutPtr<UcontextT> = this.ucLink

    public operator fun component3(): SigsetT = this.ucSigmask

    public operator fun component4(): StackT = this.ucStack

    public operator fun component5(): CUlong = this.ucFlags

    public fun copy(ucMcontext: McontextT = this.ucMcontext, ucLink: MutPtr<UcontextT> = this.ucLink, ucSigmask: SigsetT = this.ucSigmask, ucStack: StackT = this.ucStack, ucFlags: CUlong = this.ucFlags): UcontextT = UcontextT(ucMcontextCtorArg = ucMcontext, ucLinkCtorArg = ucLink, ucSigmask = ucSigmask, ucStack = ucStack, ucFlags = ucFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucMcontext != other.ucMcontext) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucFlags != other.ucFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucMcontext.hashCode()
        result = 31 * result + this.ucLink.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucFlags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UcontextT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UcontextT> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 1296L
                override fun readNative(addr: Long): UcontextT =
                    UcontextT(
                        (McontextT.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UcontextT>(64)
                        ).readNative(addr + 1248L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1256L),
                        (StackT.typeLayout()).readNative(addr + 1264L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 1288L),
                    )
                override fun writeNative(addr: Long, value: UcontextT) {
                    (McontextT.typeLayout()).writeNative(addr, value.ucMcontext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UcontextT>(64)
                    ).writeNative(addr + 1248L, value.ucLink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1256L, value.ucSigmask)
                    (StackT.typeLayout()).writeNative(addr + 1264L, value.ucStack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 1288L, value.ucFlags)
                }
            }

        public operator fun invoke(
            ucMcontext: McontextT = McontextT(),
            ucLink: MutPtr<UcontextT> = MutPtr(0L),
            ucSigmask: SigsetT = 0uL,
            ucStack: StackT = StackT(),
            ucFlags: CUlong = 0uL,
        ): UcontextT =
            UcontextT(
                ucMcontextCtorArg = ucMcontext,
                ucLinkCtorArg = ucLink,
                ucSigmask = ucSigmask,
                ucStack = ucStack,
                ucFlags = ucFlags,
            )
    }
}

public data class Sockaddr(
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Sockaddr =
                    Sockaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Sockaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.saFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 2L, value.saData.toList())
                }
            }
    }
}

public data class SockaddrStorage(
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssAlign: Long = 0L,
    public var ssPad2: UByteArray = UByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssAlign.hashCode()
        result = 31 * result + this.ssPad2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): SockaddrStorage =
                    SockaddrStorage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (112).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrStorage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ssFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 2L, value.ssPad1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.ssAlign)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (112).toInt())
                    ).writeNative(addr + 16L, value.ssPad2.toList())
                }
            }
    }
}

public class Stat(
    public var stDev: DevT = 0u,
    public var stIno: InoT = 0uL,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0u,
    public var stSize: OffT = 0L,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stBlocks: BlkcntT = 0L,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimeNsec: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.stAtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.stMtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.stCtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.stBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.stBirthtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.stBirthtimeNsec)
                }
            }
    }
}

public data class InAddr(
    public var sAddr: InAddrT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): InAddr =
                    InAddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: InAddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sAddr)
                }
            }
    }
}

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpMreq =
                    IpMreq(
                        (InAddr.typeLayout()).readNative(addr),
                        (InAddr.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpMreq) {
                    (InAddr.typeLayout()).writeNative(addr, value.imrMultiaddr)
                    (InAddr.typeLayout()).writeNative(addr + 4L, value.imrInterface)
                }
            }
    }
}

public data class InPktinfo(
    public var ipiAddr: InAddr = InAddr(),
    public var ipiIfindex: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InPktinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InPktinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): InPktinfo =
                    InPktinfo(
                        (InAddr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: InPktinfo) {
                    (InAddr.typeLayout()).writeNative(addr, value.ipiAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.ipiIfindex)
                }
            }
    }
}

public data class SockaddrIn(
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: UByteArray = UByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinFamily.hashCode()
        result = 31 * result + this.sinPort.hashCode()
        result = 31 * result + this.sinAddr.hashCode()
        result = 31 * result + this.sinZero.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SockaddrIn =
                    SockaddrIn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (InAddr.typeLayout()).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrIn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sinPort)
                    (InAddr.typeLayout()).writeNative(addr + 4L, value.sinAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 8L, value.sinZero.toList())
                }
            }
    }
}

public data class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0uL,
    public var fBfree: FsblkcntT = 0uL,
    public var fBavail: FsblkcntT = 0uL,
    public var fFiles: FsfilcntT = 0uL,
    public var fFfree: FsfilcntT = 0uL,
    public var fFavail: FsfilcntT = 0uL,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): Statvfs =
                    Statvfs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: Statvfs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.fBsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.fFrsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.fBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.fBfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.fBavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.fFiles)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.fFfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.fFavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.fFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.fFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.fNamemax)
                }
            }
    }
}

public data class Statfs(
    public var fType: CLong = 0L,
    public var fBsize: CLong = 0L,
    public var fBlocks: CLong = 0L,
    public var fBfree: CLong = 0L,
    public var fBavail: CLong = 0L,
    public var fFiles: CLong = 0L,
    public var fFfree: CLong = 0L,
    public var fFsid: CLong = 0L,
    public var fNamelen: CLong = 0L,
    public var fSpare: LongArray = LongArray(6),
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
        result = 31 * result + this.fSpare.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statfs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statfs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 120L
                override fun readNative(addr: Long): Statfs =
                    Statfs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (6).toInt())
                        ).readNative(addr + 72L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: Statfs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.fType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.fBsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.fBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.fBfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.fBavail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.fFiles)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.fFfree)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.fFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.fNamelen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (6).toInt())
                    ).writeNative(addr + 72L, value.fSpare.toList())
                }
            }
    }
}

public data class SockaddrUn(
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(108),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrUn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrUn> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 110L
                override fun readNative(addr: Long): SockaddrUn =
                    SockaddrUn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (108).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrUn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sunFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (108).toInt())
                    ).writeNative(addr + 2L, value.sunPath.toList())
                }
            }
    }
}

public data class Utsname(
    public var sysname: UByteArray = UByteArray(66),
    public var nodename: UByteArray = UByteArray(65),
    public var release: UByteArray = UByteArray(65),
    public var version: UByteArray = UByteArray(65),
    public var machine: UByteArray = UByteArray(65),
    public var domainname: UByteArray = UByteArray(65),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utsname) return false
        if (!this.sysname.contentEquals(other.sysname)) return false
        if (!this.nodename.contentEquals(other.nodename)) return false
        if (!this.release.contentEquals(other.release)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.machine.contentEquals(other.machine)) return false
        if (!this.domainname.contentEquals(other.domainname)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sysname.contentHashCode()
        result = 31 * result + this.nodename.contentHashCode()
        result = 31 * result + this.release.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.machine.contentHashCode()
        result = 31 * result + this.domainname.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utsname> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utsname> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 391L
                override fun readNative(addr: Long): Utsname =
                    Utsname(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (66).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (65).toInt())
                        ).readNative(addr + 66L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (65).toInt())
                        ).readNative(addr + 131L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (65).toInt())
                        ).readNative(addr + 196L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (65).toInt())
                        ).readNative(addr + 261L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (65).toInt())
                        ).readNative(addr + 326L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Utsname) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (66).toInt())
                    ).writeNative(addr, value.sysname.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (65).toInt())
                    ).writeNative(addr + 66L, value.nodename.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (65).toInt())
                    ).writeNative(addr + 131L, value.release.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (65).toInt())
                    ).writeNative(addr + 196L, value.version.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (65).toInt())
                    ).writeNative(addr + 261L, value.machine.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (65).toInt())
                    ).writeNative(addr + 326L, value.domainname.toList())
                }
            }
    }
}

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siPid: PidT = 0,
    public var siUid: UidT = 0u,
    public var siErrno: CInt = 0,
    public var pad: UIntArray = UIntArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siPid != other.siPid) return false
        if (this.siUid != other.siUid) return false
        if (this.siErrno != other.siErrno) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siPid.hashCode()
        result = 31 * result + this.siUid.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public fun siAddr(): MutPtr<CVoid> {
        data class SiginfoSiAddr(
            public var siSigno: CInt = 0,
            public var siCode: CInt = 0,
            public var siPid: PidT = 0,
            public var siUid: UidT = 0u,
            public var siErrno: CInt = 0,
            public var siAddr: MutPtr<CVoid> = MutPtr(0L),
        )
        return (SiginfoSiAddr.typeLayout()).readNative(((ConstPtr<SiginfoSiAddr>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).siAddr
    }

    public fun siStatus(): CInt {
        data class SiginfoSigchld(
            public var siSigno: CInt = 0,
            public var siCode: CInt = 0,
            public var siPid: PidT = 0,
            public var siUid: UidT = 0u,
            public var siErrno: CInt = 0,
            public var siStatus: CInt = 0,
        )
        return (SiginfoSigchld.typeLayout()).readNative(((ConstPtr<SiginfoSigchld>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).siStatus
    }

    public fun siValue(): Sigval {
        data class SiginfoSiValue(
            public var siSigno: CInt = 0,
            public var siCode: CInt = 0,
            public var siPid: PidT = 0,
            public var siUid: UidT = 0u,
            public var siErrno: CInt = 0,
            public var siValue: Sigval = Sigval(),
        )
        return (ObjectSlotLayout<SiginfoSiValue>()).readNative(((ConstPtr<SiginfoSiValue>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).siValue
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 148L
                override fun readNative(addr: Long): SiginfoT =
                    SiginfoT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                        ).readNative(addr + 20L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 12L, value.siUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.siErrno)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                    ).writeNative(addr + 20L, value.pad.toList())
                }
            }
    }
}

public data class Dirent(
    public var dVersion: UInt = 0u,
    public var dIno: InoT = 0uL,
    public var dType: CUchar = 0u,
    public var dUnused1: UByteArray = UByteArray(3),
    public var dInternal1: UInt = 0u,
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dVersion != other.dVersion) return false
        if (this.dIno != other.dIno) return false
        if (this.dType != other.dType) return false
        if (!this.dUnused1.contentEquals(other.dUnused1)) return false
        if (this.dInternal1 != other.dInternal1) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dVersion.hashCode()
        result = 31 * result + this.dIno.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dUnused1.contentHashCode()
        result = 31 * result + this.dInternal1.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 280L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 17L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.dIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 16L, value.dType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 17L, value.dUnused1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dInternal1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 24L, value.dName.toList())
                }
            }
    }
}

public data class MaxAlignT(
    public var priv: DoubleArray = DoubleArray(4),
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
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (4).toInt())
                        ).readNative(addr).toDoubleArray(),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F64, (4).toInt())
                    ).writeNative(addr, value.priv.toList())
                }
            }
    }
}

public class CAnonymousIfrIfru internal constructor(
    public var ifruAddr: Sockaddr,
    public var ifruBroadaddr: Sockaddr,
    public var ifruDstaddr: Sockaddr,
    public var ifruNetmask: Sockaddr,
    public var ifruHwaddr: Sockaddr,
    public var ifruFlags: CInt,
    public var ifruMetric: CInt,
    public var ifruMtu: CInt,
    public var ifruIfindex: CInt,
    ifruDataCtorArg: MutPtr<CChar>,
    public var ifruPad: UByteArray,
) {
    public var ifruData: MutPtr<CChar> = ifruDataCtorArg
        internal set

    public constructor() : this(
        ifruAddr = Sockaddr(),
        ifruBroadaddr = Sockaddr(),
        ifruDstaddr = Sockaddr(),
        ifruNetmask = Sockaddr(),
        ifruHwaddr = Sockaddr(),
        ifruFlags = 0,
        ifruMetric = 0,
        ifruMtu = 0,
        ifruIfindex = 0,
        ifruDataCtorArg = MutPtr(0L),
        ifruPad = UByteArray(28),
    )

    public operator fun component1(): Sockaddr = this.ifruAddr

    public operator fun component2(): Sockaddr = this.ifruBroadaddr

    public operator fun component3(): Sockaddr = this.ifruDstaddr

    public operator fun component4(): Sockaddr = this.ifruNetmask

    public operator fun component5(): Sockaddr = this.ifruHwaddr

    public operator fun component6(): CInt = this.ifruFlags

    public operator fun component7(): CInt = this.ifruMetric

    public operator fun component8(): CInt = this.ifruMtu

    public operator fun component9(): CInt = this.ifruIfindex

    public operator fun component10(): MutPtr<CChar> = this.ifruData

    public operator fun component11(): UByteArray = this.ifruPad

    public fun copy(ifruAddr: Sockaddr = this.ifruAddr, ifruBroadaddr: Sockaddr = this.ifruBroadaddr, ifruDstaddr: Sockaddr = this.ifruDstaddr, ifruNetmask: Sockaddr = this.ifruNetmask, ifruHwaddr: Sockaddr = this.ifruHwaddr, ifruFlags: CInt = this.ifruFlags, ifruMetric: CInt = this.ifruMetric, ifruMtu: CInt = this.ifruMtu, ifruIfindex: CInt = this.ifruIfindex, ifruData: MutPtr<CChar> = this.ifruData, ifruPad: UByteArray = this.ifruPad): CAnonymousIfrIfru = CAnonymousIfrIfru(ifruAddr = ifruAddr, ifruBroadaddr = ifruBroadaddr, ifruDstaddr = ifruDstaddr, ifruNetmask = ifruNetmask, ifruHwaddr = ifruHwaddr, ifruFlags = ifruFlags, ifruMetric = ifruMetric, ifruMtu = ifruMtu, ifruIfindex = ifruIfindex, ifruDataCtorArg = ifruData, ifruPad = ifruPad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruNetmask != other.ifruNetmask) return false
        if (this.ifruHwaddr != other.ifruHwaddr) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruMetric != other.ifruMetric) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruIfindex != other.ifruIfindex) return false
        if (this.ifruData != other.ifruData) return false
        if (!this.ifruPad.contentEquals(other.ifruPad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruNetmask.hashCode()
        result = 31 * result + this.ifruHwaddr.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruMetric.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruIfindex.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruPad.contentHashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public companion object {
        public operator fun invoke(
            ifruAddr: Sockaddr = Sockaddr(),
            ifruBroadaddr: Sockaddr = Sockaddr(),
            ifruDstaddr: Sockaddr = Sockaddr(),
            ifruNetmask: Sockaddr = Sockaddr(),
            ifruHwaddr: Sockaddr = Sockaddr(),
            ifruFlags: CInt = 0,
            ifruMetric: CInt = 0,
            ifruMtu: CInt = 0,
            ifruIfindex: CInt = 0,
            ifruData: MutPtr<CChar> = MutPtr(0L),
            ifruPad: UByteArray = UByteArray(28),
        ): CAnonymousIfrIfru =
            CAnonymousIfrIfru(
                ifruAddr = ifruAddr,
                ifruBroadaddr = ifruBroadaddr,
                ifruDstaddr = ifruDstaddr,
                ifruNetmask = ifruNetmask,
                ifruHwaddr = ifruHwaddr,
                ifruFlags = ifruFlags,
                ifruMetric = ifruMetric,
                ifruMtu = ifruMtu,
                ifruIfindex = ifruIfindex,
                ifruDataCtorArg = ifruData,
                ifruPad = ifruPad,
            )
    }
}

public data class Ifreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifrName: UByteArray = UByteArray(IFNAMSIZ.toInt()),
    public var ifrIfru: CAnonymousIfrIfru = CAnonymousIfrIfru(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifreq) return false
        if (!this.ifrName.contentEquals(other.ifrName)) return false
        if (this.ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifrName.contentHashCode()
        result = 31 * result + this.ifrIfru.hashCode()
        return result
    }
}

public class CAnonymousIfcIfcu internal constructor(
    ifcuBufCtorArg: CaddrT,
    ifcuReqCtorArg: MutPtr<Ifreq>,
) {
    public var ifcuBuf: CaddrT = ifcuBufCtorArg
        internal set

    public var ifcuReq: MutPtr<Ifreq> = ifcuReqCtorArg
        internal set

    public constructor() : this(
        ifcuBufCtorArg = MutPtr(0L),
        ifcuReqCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CaddrT = this.ifcuBuf

    public operator fun component2(): MutPtr<Ifreq> = this.ifcuReq

    public fun copy(ifcuBuf: CaddrT = this.ifcuBuf, ifcuReq: MutPtr<Ifreq> = this.ifcuReq): CAnonymousIfcIfcu = CAnonymousIfcIfcu(ifcuBufCtorArg = ifcuBuf, ifcuReqCtorArg = ifcuReq)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfcIfcu) return false
        if (this.ifcuBuf != other.ifcuBuf) return false
        if (this.ifcuReq != other.ifcuReq) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifcuBuf.hashCode()
        result = 31 * result + this.ifcuReq.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifc_ifcu").finishNonExhaustive()
    }

    public companion object {
        public operator fun invoke(
            ifcuBuf: CaddrT = MutPtr(0L),
            ifcuReq: MutPtr<Ifreq> = MutPtr(0L),
        ): CAnonymousIfcIfcu =
            CAnonymousIfcIfcu(
                ifcuBufCtorArg = ifcuBuf,
                ifcuReqCtorArg = ifcuReq,
            )
    }
}

public data class Ifconf(
    public var ifcLen: CInt = 0,
    public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu(),
)

public data class Utmpx(
    public var utType: CShort = 0,
    public var utPid: PidT = 0,
    public var utLine: UByteArray = UByteArray(UT_LINESIZE),
    public var utId: UByteArray = UByteArray(UT_IDLEN),
    public var utTime: TimeT = 0L,
    public var utUser: UByteArray = UByteArray(UT_NAMESIZE),
    public var utHost: UByteArray = UByteArray(UT_HOSTSIZE),
    public var utAddr: CLong = 0L,
    public var utTv: Timeval = Timeval(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (this.utType != other.utType) return false
        if (this.utPid != other.utPid) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (this.utTime != other.utTime) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utAddr != other.utAddr) return false
        if (this.utTv != other.utTv) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utTime.hashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utAddr.hashCode()
        result = 31 * result + this.utTv.hashCode()
        return result
    }
}
