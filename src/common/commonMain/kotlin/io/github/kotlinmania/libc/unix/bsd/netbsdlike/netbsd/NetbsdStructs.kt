@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.new.netbsd.sys.ipc.IpcPerm
import io.github.kotlinmania.libc.new.netbsd.sys.types.DevT
import io.github.kotlinmania.libc.new.netbsd.sys.types.LwpidT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PATH_MAX
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.InoT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.NlinkT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.TimeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.mem.constPtrFromRustCast
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

public class Aiocb internal constructor(
    public var aioOffset: OffT,
    aioBufCtorArg: MutPtr<CVoid>,
    public var aioNbytes: SizeT,
    public var aioFildes: CInt,
    public var aioLioOpcode: CInt,
    public var aioReqprio: CInt,
    public var aioSigevent: Sigevent,
    public var state: CInt,
    public var errnum: CInt,
    public var retval: SsizeT,
) {
    public var aioBuf: MutPtr<CVoid> = aioBufCtorArg
        internal set

    public constructor() : this(
        aioOffset = 0L,
        aioBufCtorArg = MutPtr(0L),
        aioNbytes = 0uL,
        aioFildes = 0,
        aioLioOpcode = 0,
        aioReqprio = 0,
        aioSigevent = Sigevent(),
        state = 0,
        errnum = 0,
        retval = 0L,
    )

    public operator fun component1(): OffT = this.aioOffset

    public operator fun component2(): MutPtr<CVoid> = this.aioBuf

    public operator fun component3(): SizeT = this.aioNbytes

    public operator fun component4(): CInt = this.aioFildes

    public operator fun component5(): CInt = this.aioLioOpcode

    public operator fun component6(): CInt = this.aioReqprio

    public operator fun component7(): Sigevent = this.aioSigevent

    public operator fun component8(): CInt = this.state

    public operator fun component9(): CInt = this.errnum

    public operator fun component10(): SsizeT = this.retval

    public fun copy(aioOffset: OffT = this.aioOffset, aioBuf: MutPtr<CVoid> = this.aioBuf, aioNbytes: SizeT = this.aioNbytes, aioFildes: CInt = this.aioFildes, aioLioOpcode: CInt = this.aioLioOpcode, aioReqprio: CInt = this.aioReqprio, aioSigevent: Sigevent = this.aioSigevent, state: CInt = this.state, errnum: CInt = this.errnum, retval: SsizeT = this.retval): Aiocb = Aiocb(aioOffset = aioOffset, aioBufCtorArg = aioBuf, aioNbytes = aioNbytes, aioFildes = aioFildes, aioLioOpcode = aioLioOpcode, aioReqprio = aioReqprio, aioSigevent = aioSigevent, state = state, errnum = errnum, retval = retval)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Aiocb) return false
        if (this.aioOffset != other.aioOffset) return false
        if (this.aioBuf != other.aioBuf) return false
        if (this.aioNbytes != other.aioNbytes) return false
        if (this.aioFildes != other.aioFildes) return false
        if (this.aioLioOpcode != other.aioLioOpcode) return false
        if (this.aioReqprio != other.aioReqprio) return false
        if (this.aioSigevent != other.aioSigevent) return false
        if (this.state != other.state) return false
        if (this.errnum != other.errnum) return false
        if (this.retval != other.retval) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aioOffset.hashCode()
        result = 31 * result + this.aioBuf.hashCode()
        result = 31 * result + this.aioNbytes.hashCode()
        result = 31 * result + this.aioFildes.hashCode()
        result = 31 * result + this.aioLioOpcode.hashCode()
        result = 31 * result + this.aioReqprio.hashCode()
        result = 31 * result + this.aioSigevent.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.errnum.hashCode()
        result = 31 * result + this.retval.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            aioOffset: OffT = 0L,
            aioBuf: MutPtr<CVoid> = MutPtr(0L),
            aioNbytes: SizeT = 0uL,
            aioFildes: CInt = 0,
            aioLioOpcode: CInt = 0,
            aioReqprio: CInt = 0,
            aioSigevent: Sigevent = Sigevent(),
            state: CInt = 0,
            errnum: CInt = 0,
            retval: SsizeT = 0L,
        ): Aiocb =
            Aiocb(
                aioOffset = aioOffset,
                aioBufCtorArg = aioBuf,
                aioNbytes = aioNbytes,
                aioFildes = aioFildes,
                aioLioOpcode = aioLioOpcode,
                aioReqprio = aioReqprio,
                aioSigevent = aioSigevent,
                state = state,
                errnum = errnum,
                retval = retval,
            )
    }
}

public class GlobT internal constructor(
    public var glPathc: SizeT,
    public var glMatchc: SizeT,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    glPathvCtorArg: MutPtr<MutPtr<CChar>>,
    unused3CtorArg: MutPtr<CVoid>,
    unused4CtorArg: MutPtr<CVoid>,
    unused5CtorArg: MutPtr<CVoid>,
    unused6CtorArg: MutPtr<CVoid>,
    unused7CtorArg: MutPtr<CVoid>,
    unused8CtorArg: MutPtr<CVoid>,
) {
    public var glPathv: MutPtr<MutPtr<CChar>> = glPathvCtorArg
        internal set

    public var unused3: MutPtr<CVoid> = unused3CtorArg
        internal set

    public var unused4: MutPtr<CVoid> = unused4CtorArg
        internal set

    public var unused5: MutPtr<CVoid> = unused5CtorArg
        internal set

    public var unused6: MutPtr<CVoid> = unused6CtorArg
        internal set

    public var unused7: MutPtr<CVoid> = unused7CtorArg
        internal set

    public var unused8: MutPtr<CVoid> = unused8CtorArg
        internal set

    public constructor() : this(
        glPathc = 0uL,
        glMatchc = 0uL,
        glOffs = 0uL,
        glFlags = 0,
        glPathvCtorArg = MutPtr(0L),
        unused3CtorArg = MutPtr(0L),
        unused4CtorArg = MutPtr(0L),
        unused5CtorArg = MutPtr(0L),
        unused6CtorArg = MutPtr(0L),
        unused7CtorArg = MutPtr(0L),
        unused8CtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.glPathc

    public operator fun component2(): SizeT = this.glMatchc

    public operator fun component3(): SizeT = this.glOffs

    public operator fun component4(): CInt = this.glFlags

    public operator fun component5(): MutPtr<MutPtr<CChar>> = this.glPathv

    public operator fun component6(): MutPtr<CVoid> = this.unused3

    public operator fun component7(): MutPtr<CVoid> = this.unused4

    public operator fun component8(): MutPtr<CVoid> = this.unused5

    public operator fun component9(): MutPtr<CVoid> = this.unused6

    public operator fun component10(): MutPtr<CVoid> = this.unused7

    public operator fun component11(): MutPtr<CVoid> = this.unused8

    public fun copy(glPathc: SizeT = this.glPathc, glMatchc: SizeT = this.glMatchc, glOffs: SizeT = this.glOffs, glFlags: CInt = this.glFlags, glPathv: MutPtr<MutPtr<CChar>> = this.glPathv, unused3: MutPtr<CVoid> = this.unused3, unused4: MutPtr<CVoid> = this.unused4, unused5: MutPtr<CVoid> = this.unused5, unused6: MutPtr<CVoid> = this.unused6, unused7: MutPtr<CVoid> = this.unused7, unused8: MutPtr<CVoid> = this.unused8): GlobT = GlobT(glPathc = glPathc, glMatchc = glMatchc, glOffs = glOffs, glFlags = glFlags, glPathvCtorArg = glPathv, unused3CtorArg = unused3, unused4CtorArg = unused4, unused5CtorArg = unused5, unused6CtorArg = unused6, unused7CtorArg = unused7, unused8CtorArg = unused8)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GlobT) return false
        if (this.glPathc != other.glPathc) return false
        if (this.glMatchc != other.glMatchc) return false
        if (this.glOffs != other.glOffs) return false
        if (this.glFlags != other.glFlags) return false
        if (this.glPathv != other.glPathv) return false
        if (this.unused3 != other.unused3) return false
        if (this.unused4 != other.unused4) return false
        if (this.unused5 != other.unused5) return false
        if (this.unused6 != other.unused6) return false
        if (this.unused7 != other.unused7) return false
        if (this.unused8 != other.unused8) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.glPathc.hashCode()
        result = 31 * result + this.glMatchc.hashCode()
        result = 31 * result + this.glOffs.hashCode()
        result = 31 * result + this.glFlags.hashCode()
        result = 31 * result + this.glPathv.hashCode()
        result = 31 * result + this.unused3.hashCode()
        result = 31 * result + this.unused4.hashCode()
        result = 31 * result + this.unused5.hashCode()
        result = 31 * result + this.unused6.hashCode()
        result = 31 * result + this.unused7.hashCode()
        result = 31 * result + this.unused8.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): GlobT =
                    GlobT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CChar>>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 80L),
                    )
                override fun writeNative(addr: Long, value: GlobT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.glPathc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.glMatchc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.glOffs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.glFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CChar>>(64)
                    ).writeNative(addr + 32L, value.glPathv)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.unused3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.unused4)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.unused5)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 64L, value.unused6)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 72L, value.unused7)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 80L, value.unused8)
                }
            }

        public operator fun invoke(
            glPathc: SizeT = 0uL,
            glMatchc: SizeT = 0uL,
            glOffs: SizeT = 0uL,
            glFlags: CInt = 0,
            glPathv: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            unused3: MutPtr<CVoid> = MutPtr(0L),
            unused4: MutPtr<CVoid> = MutPtr(0L),
            unused5: MutPtr<CVoid> = MutPtr(0L),
            unused6: MutPtr<CVoid> = MutPtr(0L),
            unused7: MutPtr<CVoid> = MutPtr(0L),
            unused8: MutPtr<CVoid> = MutPtr(0L),
        ): GlobT =
            GlobT(
                glPathc = glPathc,
                glMatchc = glMatchc,
                glOffs = glOffs,
                glFlags = glFlags,
                glPathvCtorArg = glPathv,
                unused3CtorArg = unused3,
                unused4CtorArg = unused4,
                unused5CtorArg = unused5,
                unused6CtorArg = unused6,
                unused7CtorArg = unused7,
                unused8CtorArg = unused8,
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
    tmZoneCtorArg: MutPtr<CChar>,
) {
    public var tmZone: MutPtr<CChar> = tmZoneCtorArg
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
        tmZoneCtorArg = MutPtr(0L),
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

    public operator fun component11(): MutPtr<CChar> = this.tmZone

    public fun copy(tmSec: CInt = this.tmSec, tmMin: CInt = this.tmMin, tmHour: CInt = this.tmHour, tmMday: CInt = this.tmMday, tmMon: CInt = this.tmMon, tmYear: CInt = this.tmYear, tmWday: CInt = this.tmWday, tmYday: CInt = this.tmYday, tmIsdst: CInt = this.tmIsdst, tmGmtoff: CLong = this.tmGmtoff, tmZone: MutPtr<CChar> = this.tmZone): Tm = Tm(tmSec = tmSec, tmMin = tmMin, tmHour = tmHour, tmMday = tmMday, tmMon = tmMon, tmYear = tmYear, tmWday = tmWday, tmYday = tmYday, tmIsdst = tmIsdst, tmGmtoff = tmGmtoff, tmZoneCtorArg = tmZone)

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
                                .mutPtrLayout<CChar>(64)
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
                            .mutPtrLayout<CChar>(64)
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
            tmZone: MutPtr<CChar> = MutPtr(0L),
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

public data class MqAttr(
    public var mqFlags: CLong = 0L,
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MqAttr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MqAttr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MqAttr =
                    MqAttr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: MqAttr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.mqFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.mqMaxmsg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.mqMsgsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.mqCurmsgs)
                }
            }
    }
}

public data class SigsetT(
    public var bits: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SigsetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SigsetT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SigsetT =
                    SigsetT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: SigsetT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.bits.toList())
                }
            }
    }
}

public class Stat(
    public var stDev: DevT = 0uL,
    public var stMode: ModeT = 0u,
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0uL,
    public var stAtime: TimeT = 0L,
    public var stAtimensec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimensec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimensec: CLong = 0L,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimensec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stFlags: UInt = 0u,
    public var stGen: UInt = 0u,
    public var stSpare: UIntArray = UIntArray(2),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 30L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr + 132L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 28L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 30L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.stAtimensec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.stMtimensec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.stCtimensec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.stBirthtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.stBirthtimensec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.stBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.stFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.stGen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr + 132L, value.stSpare.toList())
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
        aiAddrlen = 0u,
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aiAddrlen)
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
            aiAddrlen: SocklenT = 0u,
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

public class SiginfoT internal constructor(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var pad1: CInt,
    siAddrCtorArg: MutPtr<CVoid>,
    public var pad2: ULongArray,
) {
    public var siAddr: MutPtr<CVoid> = siAddrCtorArg
        internal set

    public constructor() : this(
        siSigno = 0,
        siCode = 0,
        siErrno = 0,
        pad1 = 0,
        siAddrCtorArg = MutPtr(0L),
        pad2 = ULongArray(13),
    )

    public operator fun component1(): CInt = this.siSigno

    public operator fun component2(): CInt = this.siCode

    public operator fun component3(): CInt = this.siErrno

    public operator fun component4(): CInt = this.pad1

    public operator fun component5(): MutPtr<CVoid> = this.siAddr

    public operator fun component6(): ULongArray = this.pad2

    public fun copy(siSigno: CInt = this.siSigno, siCode: CInt = this.siCode, siErrno: CInt = this.siErrno, pad1: CInt = this.pad1, siAddr: MutPtr<CVoid> = this.siAddr, pad2: ULongArray = this.pad2): SiginfoT = SiginfoT(siSigno = siSigno, siCode = siCode, siErrno = siErrno, pad1 = pad1, siAddrCtorArg = siAddr, pad2 = pad2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siErrno != other.siErrno) return false
        if (this.pad1 != other.pad1) return false
        if (this.siAddr != other.siAddr) return false
        if (!this.pad2.contentEquals(other.pad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.pad1.hashCode()
        result = 31 * result + this.siAddr.hashCode()
        result = 31 * result + this.pad2.contentHashCode()
        return result
    }

    public fun siPid(): PidT {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
        )
        return (ObjectSlotLayout<SiginfoTimer>()).readNative(((ConstPtr<SiginfoTimer>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).pid
    }

    public fun siUid(): UidT {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
        )
        return (ObjectSlotLayout<SiginfoTimer>()).readNative(((ConstPtr<SiginfoTimer>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).uid
    }

    public fun siValue(): Sigval {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
            public var value: Sigval = Sigval(),
        )
        return (ObjectSlotLayout<SiginfoTimer>()).readNative(((ConstPtr<SiginfoTimer>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).value
    }

    public fun siStatus(): CInt {
        data class SiginfoTimer(
            public var siSigno: CInt = 0,
            public var siErrno: CInt = 0,
            public var siCode: CInt = 0,
            public var pad1: CInt = 0,
            public var pid: PidT = 0,
            public var uid: UidT = 0u,
            public var status: CInt = 0,
        )
        return (ObjectSlotLayout<SiginfoTimer>()).readNative(((ConstPtr<SiginfoTimer>((constPtrFromRustCast<SiginfoT>(this)).rawAddress, (constPtrFromRustCast<SiginfoT>(this)).rawMeta))).rawAddress).status
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (13).toInt())
                        ).readNative(addr + 24L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siErrno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.pad1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.siAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (13).toInt())
                    ).writeNative(addr + 24L, value.pad2.toList())
                }
            }

        public operator fun invoke(
            siSigno: CInt = 0,
            siCode: CInt = 0,
            siErrno: CInt = 0,
            pad1: CInt = 0,
            siAddr: MutPtr<CVoid> = MutPtr(0L),
            pad2: ULongArray = ULongArray(13),
        ): SiginfoT =
            SiginfoT(
                siSigno = siSigno,
                siCode = siCode,
                siErrno = siErrno,
                pad1 = pad1,
                siAddrCtorArg = siAddr,
                pad2 = pad2,
            )
    }
}

public class PthreadAttrT internal constructor(
    public var ptaMagic: CUint,
    public var ptaFlags: CInt,
    ptaPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptaPrivate: MutPtr<CVoid> = ptaPrivateCtorArg
        internal set

    public constructor() : this(
        ptaMagic = 0u,
        ptaFlags = 0,
        ptaPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptaMagic

    public operator fun component2(): CInt = this.ptaFlags

    public operator fun component3(): MutPtr<CVoid> = this.ptaPrivate

    public fun copy(ptaMagic: CUint = this.ptaMagic, ptaFlags: CInt = this.ptaFlags, ptaPrivate: MutPtr<CVoid> = this.ptaPrivate): PthreadAttrT = PthreadAttrT(ptaMagic = ptaMagic, ptaFlags = ptaFlags, ptaPrivateCtorArg = ptaPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (this.ptaMagic != other.ptaMagic) return false
        if (this.ptaFlags != other.ptaFlags) return false
        if (this.ptaPrivate != other.ptaPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptaMagic.hashCode()
        result = 31 * result + this.ptaFlags.hashCode()
        result = 31 * result + this.ptaPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PthreadAttrT =
                    PthreadAttrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PthreadAttrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptaMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ptaFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.ptaPrivate)
                }
            }

        public operator fun invoke(
            ptaMagic: CUint = 0u,
            ptaFlags: CInt = 0,
            ptaPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadAttrT =
            PthreadAttrT(
                ptaMagic = ptaMagic,
                ptaFlags = ptaFlags,
                ptaPrivateCtorArg = ptaPrivate,
            )
    }
}

public class PthreadMutexT internal constructor(
    public var ptmMagic: CUint,
    public var ptmErrorcheck: PthreadSpinT,
    public var ptmPad1: UByteArray,
    // actually a union with a non-unused, 0-initialized field
    public var ptmUnused: PthreadSpinT,
    public var ptmPad2: UByteArray,
    ptmOwnerCtorArg: PthreadT,
    ptmWaitersCtorArg: MutPtr<UByte>,
    public var ptmRecursed: CUint,
    ptmSpare2CtorArg: MutPtr<CVoid>,
) {
    public var ptmOwner: PthreadT = ptmOwnerCtorArg
        internal set

    public var ptmWaiters: MutPtr<UByte> = ptmWaitersCtorArg
        internal set

    public var ptmSpare2: MutPtr<CVoid> = ptmSpare2CtorArg
        internal set

    public constructor() : this(
        ptmMagic = 0u,
        ptmErrorcheck = 0u,
        ptmPad1 = UByteArray(3),
        ptmUnused = 0u,
        ptmPad2 = UByteArray(3),
        ptmOwnerCtorArg = 0uL,
        ptmWaitersCtorArg = MutPtr(0L),
        ptmRecursed = 0u,
        ptmSpare2CtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptmMagic

    public operator fun component2(): PthreadSpinT = this.ptmErrorcheck

    public operator fun component3(): UByteArray = this.ptmPad1

    public operator fun component4(): PthreadSpinT = this.ptmUnused

    public operator fun component5(): UByteArray = this.ptmPad2

    public operator fun component6(): PthreadT = this.ptmOwner

    public operator fun component7(): MutPtr<UByte> = this.ptmWaiters

    public operator fun component8(): CUint = this.ptmRecursed

    public operator fun component9(): MutPtr<CVoid> = this.ptmSpare2

    public fun copy(ptmMagic: CUint = this.ptmMagic, ptmErrorcheck: PthreadSpinT = this.ptmErrorcheck, ptmPad1: UByteArray = this.ptmPad1, ptmUnused: PthreadSpinT = this.ptmUnused, ptmPad2: UByteArray = this.ptmPad2, ptmOwner: PthreadT = this.ptmOwner, ptmWaiters: MutPtr<UByte> = this.ptmWaiters, ptmRecursed: CUint = this.ptmRecursed, ptmSpare2: MutPtr<CVoid> = this.ptmSpare2): PthreadMutexT = PthreadMutexT(ptmMagic = ptmMagic, ptmErrorcheck = ptmErrorcheck, ptmPad1 = ptmPad1, ptmUnused = ptmUnused, ptmPad2 = ptmPad2, ptmOwnerCtorArg = ptmOwner, ptmWaitersCtorArg = ptmWaiters, ptmRecursed = ptmRecursed, ptmSpare2CtorArg = ptmSpare2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (this.ptmMagic != other.ptmMagic) return false
        if (this.ptmErrorcheck != other.ptmErrorcheck) return false
        if (!this.ptmPad1.contentEquals(other.ptmPad1)) return false
        if (this.ptmUnused != other.ptmUnused) return false
        if (!this.ptmPad2.contentEquals(other.ptmPad2)) return false
        if (this.ptmOwner != other.ptmOwner) return false
        if (this.ptmWaiters != other.ptmWaiters) return false
        if (this.ptmRecursed != other.ptmRecursed) return false
        if (this.ptmSpare2 != other.ptmSpare2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptmMagic.hashCode()
        result = 31 * result + this.ptmErrorcheck.hashCode()
        result = 31 * result + this.ptmPad1.contentHashCode()
        result = 31 * result + this.ptmUnused.hashCode()
        result = 31 * result + this.ptmPad2.contentHashCode()
        result = 31 * result + this.ptmOwner.hashCode()
        result = 31 * result + this.ptmWaiters.hashCode()
        result = 31 * result + this.ptmRecursed.hashCode()
        result = 31 * result + this.ptmSpare2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PthreadMutexT =
                    PthreadMutexT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 5L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptmMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.ptmErrorcheck)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 5L, value.ptmPad1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.ptmUnused)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 9L, value.ptmPad2.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.ptmOwner)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.ptmWaiters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.ptmRecursed)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.ptmSpare2)
                }
            }

        public operator fun invoke(
            ptmMagic: CUint = 0u,
            ptmErrorcheck: PthreadSpinT = 0u,
            ptmPad1: UByteArray = UByteArray(3),
            ptmUnused: PthreadSpinT = 0u,
            ptmPad2: UByteArray = UByteArray(3),
            ptmOwner: PthreadT = 0uL,
            ptmWaiters: MutPtr<UByte> = MutPtr(0L),
            ptmRecursed: CUint = 0u,
            ptmSpare2: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadMutexT =
            PthreadMutexT(
                ptmMagic = ptmMagic,
                ptmErrorcheck = ptmErrorcheck,
                ptmPad1 = ptmPad1,
                ptmUnused = ptmUnused,
                ptmPad2 = ptmPad2,
                ptmOwnerCtorArg = ptmOwner,
                ptmWaitersCtorArg = ptmWaiters,
                ptmRecursed = ptmRecursed,
                ptmSpare2CtorArg = ptmSpare2,
            )
    }
}

public class PthreadMutexattrT internal constructor(
    public var ptmaMagic: CUint,
    ptmaPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptmaPrivate: MutPtr<CVoid> = ptmaPrivateCtorArg
        internal set

    public constructor() : this(
        ptmaMagic = 0u,
        ptmaPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptmaMagic

    public operator fun component2(): MutPtr<CVoid> = this.ptmaPrivate

    public fun copy(ptmaMagic: CUint = this.ptmaMagic, ptmaPrivate: MutPtr<CVoid> = this.ptmaPrivate): PthreadMutexattrT = PthreadMutexattrT(ptmaMagic = ptmaMagic, ptmaPrivateCtorArg = ptmaPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexattrT) return false
        if (this.ptmaMagic != other.ptmaMagic) return false
        if (this.ptmaPrivate != other.ptmaPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptmaMagic.hashCode()
        result = 31 * result + this.ptmaPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PthreadMutexattrT =
                    PthreadMutexattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptmaMagic)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.ptmaPrivate)
                }
            }

        public operator fun invoke(
            ptmaMagic: CUint = 0u,
            ptmaPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadMutexattrT =
            PthreadMutexattrT(
                ptmaMagic = ptmaMagic,
                ptmaPrivateCtorArg = ptmaPrivate,
            )
    }
}

public class PthreadRwlockattrT internal constructor(
    public var ptraMagic: CUint,
    ptraPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptraPrivate: MutPtr<CVoid> = ptraPrivateCtorArg
        internal set

    public constructor() : this(
        ptraMagic = 0u,
        ptraPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptraMagic

    public operator fun component2(): MutPtr<CVoid> = this.ptraPrivate

    public fun copy(ptraMagic: CUint = this.ptraMagic, ptraPrivate: MutPtr<CVoid> = this.ptraPrivate): PthreadRwlockattrT = PthreadRwlockattrT(ptraMagic = ptraMagic, ptraPrivateCtorArg = ptraPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockattrT) return false
        if (this.ptraMagic != other.ptraMagic) return false
        if (this.ptraPrivate != other.ptraPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptraMagic.hashCode()
        result = 31 * result + this.ptraPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PthreadRwlockattrT =
                    PthreadRwlockattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptraMagic)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.ptraPrivate)
                }
            }

        public operator fun invoke(
            ptraMagic: CUint = 0u,
            ptraPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadRwlockattrT =
            PthreadRwlockattrT(
                ptraMagic = ptraMagic,
                ptraPrivateCtorArg = ptraPrivate,
            )
    }
}

public class PthreadCondT internal constructor(
    public var ptcMagic: CUint,
    public var ptcLock: PthreadSpinT,
    ptcWaitersFirstCtorArg: MutPtr<UByte>,
    ptcWaitersLastCtorArg: MutPtr<UByte>,
    ptcMutexCtorArg: MutPtr<PthreadMutexT>,
    ptcPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptcWaitersFirst: MutPtr<UByte> = ptcWaitersFirstCtorArg
        internal set

    public var ptcWaitersLast: MutPtr<UByte> = ptcWaitersLastCtorArg
        internal set

    public var ptcMutex: MutPtr<PthreadMutexT> = ptcMutexCtorArg
        internal set

    public var ptcPrivate: MutPtr<CVoid> = ptcPrivateCtorArg
        internal set

    public constructor() : this(
        ptcMagic = 0u,
        ptcLock = 0u,
        ptcWaitersFirstCtorArg = MutPtr(0L),
        ptcWaitersLastCtorArg = MutPtr(0L),
        ptcMutexCtorArg = MutPtr(0L),
        ptcPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptcMagic

    public operator fun component2(): PthreadSpinT = this.ptcLock

    public operator fun component3(): MutPtr<UByte> = this.ptcWaitersFirst

    public operator fun component4(): MutPtr<UByte> = this.ptcWaitersLast

    public operator fun component5(): MutPtr<PthreadMutexT> = this.ptcMutex

    public operator fun component6(): MutPtr<CVoid> = this.ptcPrivate

    public fun copy(ptcMagic: CUint = this.ptcMagic, ptcLock: PthreadSpinT = this.ptcLock, ptcWaitersFirst: MutPtr<UByte> = this.ptcWaitersFirst, ptcWaitersLast: MutPtr<UByte> = this.ptcWaitersLast, ptcMutex: MutPtr<PthreadMutexT> = this.ptcMutex, ptcPrivate: MutPtr<CVoid> = this.ptcPrivate): PthreadCondT = PthreadCondT(ptcMagic = ptcMagic, ptcLock = ptcLock, ptcWaitersFirstCtorArg = ptcWaitersFirst, ptcWaitersLastCtorArg = ptcWaitersLast, ptcMutexCtorArg = ptcMutex, ptcPrivateCtorArg = ptcPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (this.ptcMagic != other.ptcMagic) return false
        if (this.ptcLock != other.ptcLock) return false
        if (this.ptcWaitersFirst != other.ptcWaitersFirst) return false
        if (this.ptcWaitersLast != other.ptcWaitersLast) return false
        if (this.ptcMutex != other.ptcMutex) return false
        if (this.ptcPrivate != other.ptcPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptcMagic.hashCode()
        result = 31 * result + this.ptcLock.hashCode()
        result = 31 * result + this.ptcWaitersFirst.hashCode()
        result = 31 * result + this.ptcWaitersLast.hashCode()
        result = 31 * result + this.ptcMutex.hashCode()
        result = 31 * result + this.ptcPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): PthreadCondT =
                    PthreadCondT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PthreadMutexT>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: PthreadCondT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptcMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.ptcLock)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.ptcWaitersFirst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.ptcWaitersLast)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PthreadMutexT>(64)
                    ).writeNative(addr + 24L, value.ptcMutex)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.ptcPrivate)
                }
            }

        public operator fun invoke(
            ptcMagic: CUint = 0u,
            ptcLock: PthreadSpinT = 0u,
            ptcWaitersFirst: MutPtr<UByte> = MutPtr(0L),
            ptcWaitersLast: MutPtr<UByte> = MutPtr(0L),
            ptcMutex: MutPtr<PthreadMutexT> = MutPtr(0L),
            ptcPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadCondT =
            PthreadCondT(
                ptcMagic = ptcMagic,
                ptcLock = ptcLock,
                ptcWaitersFirstCtorArg = ptcWaitersFirst,
                ptcWaitersLastCtorArg = ptcWaitersLast,
                ptcMutexCtorArg = ptcMutex,
                ptcPrivateCtorArg = ptcPrivate,
            )
    }
}

public class PthreadCondattrT internal constructor(
    public var ptcaMagic: CUint,
    ptcaPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptcaPrivate: MutPtr<CVoid> = ptcaPrivateCtorArg
        internal set

    public constructor() : this(
        ptcaMagic = 0u,
        ptcaPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptcaMagic

    public operator fun component2(): MutPtr<CVoid> = this.ptcaPrivate

    public fun copy(ptcaMagic: CUint = this.ptcaMagic, ptcaPrivate: MutPtr<CVoid> = this.ptcaPrivate): PthreadCondattrT = PthreadCondattrT(ptcaMagic = ptcaMagic, ptcaPrivateCtorArg = ptcaPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (this.ptcaMagic != other.ptcaMagic) return false
        if (this.ptcaPrivate != other.ptcaPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptcaMagic.hashCode()
        result = 31 * result + this.ptcaPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PthreadCondattrT =
                    PthreadCondattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PthreadCondattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptcaMagic)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.ptcaPrivate)
                }
            }

        public operator fun invoke(
            ptcaMagic: CUint = 0u,
            ptcaPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadCondattrT =
            PthreadCondattrT(
                ptcaMagic = ptcaMagic,
                ptcaPrivateCtorArg = ptcaPrivate,
            )
    }
}

public class PthreadRwlockT internal constructor(
    public var ptrMagic: CUint,
    public var ptrInterlock: PthreadSpinT,
    ptrRblockedFirstCtorArg: MutPtr<UByte>,
    ptrRblockedLastCtorArg: MutPtr<UByte>,
    ptrWblockedFirstCtorArg: MutPtr<UByte>,
    ptrWblockedLastCtorArg: MutPtr<UByte>,
    public var ptrNreaders: CUint,
    ptrOwnerCtorArg: PthreadT,
    ptrPrivateCtorArg: MutPtr<CVoid>,
) {
    public var ptrRblockedFirst: MutPtr<UByte> = ptrRblockedFirstCtorArg
        internal set

    public var ptrRblockedLast: MutPtr<UByte> = ptrRblockedLastCtorArg
        internal set

    public var ptrWblockedFirst: MutPtr<UByte> = ptrWblockedFirstCtorArg
        internal set

    public var ptrWblockedLast: MutPtr<UByte> = ptrWblockedLastCtorArg
        internal set

    public var ptrOwner: PthreadT = ptrOwnerCtorArg
        internal set

    public var ptrPrivate: MutPtr<CVoid> = ptrPrivateCtorArg
        internal set

    public constructor() : this(
        ptrMagic = 0u,
        ptrInterlock = 0u,
        ptrRblockedFirstCtorArg = MutPtr(0L),
        ptrRblockedLastCtorArg = MutPtr(0L),
        ptrWblockedFirstCtorArg = MutPtr(0L),
        ptrWblockedLastCtorArg = MutPtr(0L),
        ptrNreaders = 0u,
        ptrOwnerCtorArg = 0uL,
        ptrPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.ptrMagic

    public operator fun component2(): PthreadSpinT = this.ptrInterlock

    public operator fun component3(): MutPtr<UByte> = this.ptrRblockedFirst

    public operator fun component4(): MutPtr<UByte> = this.ptrRblockedLast

    public operator fun component5(): MutPtr<UByte> = this.ptrWblockedFirst

    public operator fun component6(): MutPtr<UByte> = this.ptrWblockedLast

    public operator fun component7(): CUint = this.ptrNreaders

    public operator fun component8(): PthreadT = this.ptrOwner

    public operator fun component9(): MutPtr<CVoid> = this.ptrPrivate

    public fun copy(ptrMagic: CUint = this.ptrMagic, ptrInterlock: PthreadSpinT = this.ptrInterlock, ptrRblockedFirst: MutPtr<UByte> = this.ptrRblockedFirst, ptrRblockedLast: MutPtr<UByte> = this.ptrRblockedLast, ptrWblockedFirst: MutPtr<UByte> = this.ptrWblockedFirst, ptrWblockedLast: MutPtr<UByte> = this.ptrWblockedLast, ptrNreaders: CUint = this.ptrNreaders, ptrOwner: PthreadT = this.ptrOwner, ptrPrivate: MutPtr<CVoid> = this.ptrPrivate): PthreadRwlockT = PthreadRwlockT(ptrMagic = ptrMagic, ptrInterlock = ptrInterlock, ptrRblockedFirstCtorArg = ptrRblockedFirst, ptrRblockedLastCtorArg = ptrRblockedLast, ptrWblockedFirstCtorArg = ptrWblockedFirst, ptrWblockedLastCtorArg = ptrWblockedLast, ptrNreaders = ptrNreaders, ptrOwnerCtorArg = ptrOwner, ptrPrivateCtorArg = ptrPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (this.ptrMagic != other.ptrMagic) return false
        if (this.ptrInterlock != other.ptrInterlock) return false
        if (this.ptrRblockedFirst != other.ptrRblockedFirst) return false
        if (this.ptrRblockedLast != other.ptrRblockedLast) return false
        if (this.ptrWblockedFirst != other.ptrWblockedFirst) return false
        if (this.ptrWblockedLast != other.ptrWblockedLast) return false
        if (this.ptrNreaders != other.ptrNreaders) return false
        if (this.ptrOwner != other.ptrOwner) return false
        if (this.ptrPrivate != other.ptrPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptrMagic.hashCode()
        result = 31 * result + this.ptrInterlock.hashCode()
        result = 31 * result + this.ptrRblockedFirst.hashCode()
        result = 31 * result + this.ptrRblockedLast.hashCode()
        result = 31 * result + this.ptrWblockedFirst.hashCode()
        result = 31 * result + this.ptrWblockedLast.hashCode()
        result = 31 * result + this.ptrNreaders.hashCode()
        result = 31 * result + this.ptrOwner.hashCode()
        result = 31 * result + this.ptrPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): PthreadRwlockT =
                    PthreadRwlockT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptrMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.ptrInterlock)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 8L, value.ptrRblockedFirst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 16L, value.ptrRblockedLast)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.ptrWblockedFirst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.ptrWblockedLast)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.ptrNreaders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.ptrOwner)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.ptrPrivate)
                }
            }

        public operator fun invoke(
            ptrMagic: CUint = 0u,
            ptrInterlock: PthreadSpinT = 0u,
            ptrRblockedFirst: MutPtr<UByte> = MutPtr(0L),
            ptrRblockedLast: MutPtr<UByte> = MutPtr(0L),
            ptrWblockedFirst: MutPtr<UByte> = MutPtr(0L),
            ptrWblockedLast: MutPtr<UByte> = MutPtr(0L),
            ptrNreaders: CUint = 0u,
            ptrOwner: PthreadT = 0uL,
            ptrPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PthreadRwlockT =
            PthreadRwlockT(
                ptrMagic = ptrMagic,
                ptrInterlock = ptrInterlock,
                ptrRblockedFirstCtorArg = ptrRblockedFirst,
                ptrRblockedLastCtorArg = ptrRblockedLast,
                ptrWblockedFirstCtorArg = ptrWblockedFirst,
                ptrWblockedLastCtorArg = ptrWblockedLast,
                ptrNreaders = ptrNreaders,
                ptrOwnerCtorArg = ptrOwner,
                ptrPrivateCtorArg = ptrPrivate,
            )
    }
}

public data class PthreadSpinlockT(
    public var ptsMagic: CUint = 0u,
    public var ptsSpin: PthreadSpinT = 0u,
    public var ptsFlags: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadSpinlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadSpinlockT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PthreadSpinlockT =
                    PthreadSpinlockT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PthreadSpinlockT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptsMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.ptsSpin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ptsFlags)
                }
            }
    }
}

public class Kevent internal constructor(
    public var ident: UintptrT,
    public var filter: UInt,
    public var flags: UInt,
    public var fflags: UInt,
    public var data: Long,
    udataCtorArg: MutPtr<CVoid>,
) {
    public var udata: MutPtr<CVoid> = udataCtorArg
        internal set

    public constructor() : this(
        ident = 0uL,
        filter = 0u,
        flags = 0u,
        fflags = 0u,
        data = 0L,
        udataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UintptrT = this.ident

    public operator fun component2(): UInt = this.filter

    public operator fun component3(): UInt = this.flags

    public operator fun component4(): UInt = this.fflags

    public operator fun component5(): Long = this.data

    public operator fun component6(): MutPtr<CVoid> = this.udata

    public fun copy(ident: UintptrT = this.ident, filter: UInt = this.filter, flags: UInt = this.flags, fflags: UInt = this.fflags, data: Long = this.data, udata: MutPtr<CVoid> = this.udata): Kevent = Kevent(ident = ident, filter = filter, flags = flags, fflags = fflags, data = data, udataCtorArg = udata)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Kevent) return false
        if (this.ident != other.ident) return false
        if (this.filter != other.filter) return false
        if (this.flags != other.flags) return false
        if (this.fflags != other.fflags) return false
        if (this.data != other.data) return false
        if (this.udata != other.udata) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ident.hashCode()
        result = 31 * result + this.filter.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.fflags.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.udata.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kevent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Kevent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Kevent =
                    Kevent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Kevent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ident)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.filter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.fflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.data)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.udata)
                }
            }

        public operator fun invoke(
            ident: UintptrT = 0uL,
            filter: UInt = 0u,
            flags: UInt = 0u,
            fflags: UInt = 0u,
            data: Long = 0L,
            udata: MutPtr<CVoid> = MutPtr(0L),
        ): Kevent =
            Kevent(
                ident = ident,
                filter = filter,
                flags = flags,
                fflags = fflags,
                data = data,
                udataCtorArg = udata,
            )
    }
}

public data class Dqblk(
    public var dqbBhardlimit: UInt = 0u,
    public var dqbBsoftlimit: UInt = 0u,
    public var dqbCurblocks: UInt = 0u,
    public var dqbIhardlimit: UInt = 0u,
    public var dqbIsoftlimit: UInt = 0u,
    public var dqbCurinodes: UInt = 0u,
    public var dqbBtime: Int = 0,
    public var dqbItime: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dqblk> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dqblk> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Dqblk =
                    Dqblk(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Dqblk) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.dqbBhardlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dqbBsoftlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dqbCurblocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dqbIhardlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.dqbIsoftlimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.dqbCurinodes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.dqbBtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.dqbItime)
                }
            }
    }
}

public class DlInfo internal constructor(
    dliFnameCtorArg: ConstPtr<CChar>,
    dliFbaseCtorArg: MutPtr<CVoid>,
    dliSnameCtorArg: ConstPtr<CChar>,
    dliSaddrCtorArg: ConstPtr<CVoid>,
) {
    public var dliFname: ConstPtr<CChar> = dliFnameCtorArg
        internal set

    public var dliFbase: MutPtr<CVoid> = dliFbaseCtorArg
        internal set

    public var dliSname: ConstPtr<CChar> = dliSnameCtorArg
        internal set

    public var dliSaddr: ConstPtr<CVoid> = dliSaddrCtorArg
        internal set

    public constructor() : this(
        dliFnameCtorArg = ConstPtr(0L),
        dliFbaseCtorArg = MutPtr(0L),
        dliSnameCtorArg = ConstPtr(0L),
        dliSaddrCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<CChar> = this.dliFname

    public operator fun component2(): MutPtr<CVoid> = this.dliFbase

    public operator fun component3(): ConstPtr<CChar> = this.dliSname

    public operator fun component4(): ConstPtr<CVoid> = this.dliSaddr

    public fun copy(dliFname: ConstPtr<CChar> = this.dliFname, dliFbase: MutPtr<CVoid> = this.dliFbase, dliSname: ConstPtr<CChar> = this.dliSname, dliSaddr: ConstPtr<CVoid> = this.dliSaddr): DlInfo = DlInfo(dliFnameCtorArg = dliFname, dliFbaseCtorArg = dliFbase, dliSnameCtorArg = dliSname, dliSaddrCtorArg = dliSaddr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlInfo) return false
        if (this.dliFname != other.dliFname) return false
        if (this.dliFbase != other.dliFbase) return false
        if (this.dliSname != other.dliSname) return false
        if (this.dliSaddr != other.dliSaddr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dliFname.hashCode()
        result = 31 * result + this.dliFbase.hashCode()
        result = 31 * result + this.dliSname.hashCode()
        result = 31 * result + this.dliSaddr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): DlInfo =
                    DlInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: DlInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr, value.dliFname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.dliFbase)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.dliSname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.dliSaddr)
                }
            }

        public operator fun invoke(
            dliFname: ConstPtr<CChar> = ConstPtr(0L),
            dliFbase: MutPtr<CVoid> = MutPtr(0L),
            dliSname: ConstPtr<CChar> = ConstPtr(0L),
            dliSaddr: ConstPtr<CVoid> = ConstPtr(0L),
        ): DlInfo =
            DlInfo(
                dliFnameCtorArg = dliFname,
                dliFbaseCtorArg = dliFbase,
                dliSnameCtorArg = dliSname,
                dliSaddrCtorArg = dliSaddr,
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
    public var intPCsPrecedes: CChar,
    public var intNCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intNSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var intNSignPosn: CChar,
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
        intPCsPrecedes = 0u,
        intNCsPrecedes = 0u,
        intPSepBySpace = 0u,
        intNSepBySpace = 0u,
        intPSignPosn = 0u,
        intNSignPosn = 0u,
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 88L, value.intPCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 89L, value.intNCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 90L, value.intPSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 91L, value.intNSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 92L, value.intPSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 93L, value.intNSignPosn)
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
            intPCsPrecedes: CChar = 0u,
            intNCsPrecedes: CChar = 0u,
            intPSepBySpace: CChar = 0u,
            intNSepBySpace: CChar = 0u,
            intPSignPosn: CChar = 0u,
            intNSignPosn: CChar = 0u,
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
                intPCsPrecedes = intPCsPrecedes,
                intNCsPrecedes = intNCsPrecedes,
                intPSepBySpace = intPSepBySpace,
                intNSepBySpace = intNSepBySpace,
                intPSignPosn = intPSignPosn,
                intNSignPosn = intNSignPosn,
            )
    }
}

public data class Sockcred(
    public var scPid: PidT = 0,
    public var scUid: UidT = 0u,
    public var scEuid: UidT = 0u,
    public var scGid: GidT = 0u,
    public var scEgid: GidT = 0u,
    public var scNgroups: CInt = 0,
    public var scGroups: UShortArray = UShortArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockcred) return false
        if (this.scPid != other.scPid) return false
        if (this.scUid != other.scUid) return false
        if (this.scEuid != other.scEuid) return false
        if (this.scGid != other.scGid) return false
        if (this.scEgid != other.scEgid) return false
        if (this.scNgroups != other.scNgroups) return false
        if (!this.scGroups.contentEquals(other.scGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scPid.hashCode()
        result = 31 * result + this.scUid.hashCode()
        result = 31 * result + this.scEuid.hashCode()
        result = 31 * result + this.scGid.hashCode()
        result = 31 * result + this.scEgid.hashCode()
        result = 31 * result + this.scNgroups.hashCode()
        result = 31 * result + this.scGroups.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockcred> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockcred> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Sockcred =
                    Sockcred(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 16L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Sockcred) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.scPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.scUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.scEuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.scGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.scEgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.scNgroups)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 16L, value.scGroups.toList())
                }
            }
    }
}

public data class Uucred(
    public var crUnused: CUshort = 0u,
    public var crUid: UidT = 0u,
    public var crGid: GidT = 0u,
    public var crNgroups: CShort = 0,
    public var crGroups: UShortArray = UShortArray(NGROUPS_MAX),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Uucred) return false
        if (this.crUnused != other.crUnused) return false
        if (this.crUid != other.crUid) return false
        if (this.crGid != other.crGid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crUnused.hashCode()
        result = 31 * result + this.crUid.hashCode()
        result = 31 * result + this.crGid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Uucred> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Uucred> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((NGROUPS_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).strideBytes)), 2L)
                override fun readNative(addr: Long): Uucred =
                    Uucred(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (NGROUPS_MAX).toInt())
                        ).readNative(addr + 8L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Uucred) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.crUnused)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.crUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.crGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.crNgroups)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (NGROUPS_MAX).toInt())
                    ).writeNative(addr + 8L, value.crGroups.toList())
                }
            }
    }
}

public data class Unpcbid(
    public var unpPid: PidT = 0,
    public var unpEuid: UidT = 0u,
    public var unpEgid: GidT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Unpcbid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Unpcbid> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Unpcbid =
                    Unpcbid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Unpcbid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.unpPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.unpEuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.unpEgid)
                }
            }
    }
}

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: UByte = 0u,
    public var sdlNlen: UByte = 0u,
    public var sdlAlen: UByte = 0u,
    public var sdlSlen: UByte = 0u,
    public var sdlData: UByteArray = UByteArray(24),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrDl) return false
        if (this.sdlLen != other.sdlLen) return false
        if (this.sdlFamily != other.sdlFamily) return false
        if (this.sdlIndex != other.sdlIndex) return false
        if (this.sdlType != other.sdlType) return false
        if (this.sdlNlen != other.sdlNlen) return false
        if (this.sdlAlen != other.sdlAlen) return false
        if (this.sdlSlen != other.sdlSlen) return false
        if (!this.sdlData.contentEquals(other.sdlData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sdlLen.hashCode()
        result = 31 * result + this.sdlFamily.hashCode()
        result = 31 * result + this.sdlIndex.hashCode()
        result = 31 * result + this.sdlType.hashCode()
        result = 31 * result + this.sdlNlen.hashCode()
        result = 31 * result + this.sdlAlen.hashCode()
        result = 31 * result + this.sdlSlen.hashCode()
        result = 31 * result + this.sdlData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrDl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrDl> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SockaddrDl =
                    SockaddrDl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrDl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sdlLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sdlFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sdlIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.sdlType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.sdlNlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.sdlAlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.sdlSlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (24).toInt())
                    ).writeNative(addr + 8L, value.sdlData.toList())
                }
            }
    }
}

public class ShmidDs internal constructor(
    public var shmPerm: IpcPerm,
    public var shmSegsz: SizeT,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: ShmattT,
    public var shmAtime: TimeT,
    public var shmDtime: TimeT,
    public var shmCtime: TimeT,
    shmInternalCtorArg: MutPtr<CVoid>,
) {
    public var shmInternal: MutPtr<CVoid> = shmInternalCtorArg
        internal set

    public constructor() : this(
        shmPerm = IpcPerm(),
        shmSegsz = 0uL,
        shmLpid = 0,
        shmCpid = 0,
        shmNattch = 0u,
        shmAtime = 0L,
        shmDtime = 0L,
        shmCtime = 0L,
        shmInternalCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IpcPerm = this.shmPerm

    public operator fun component2(): SizeT = this.shmSegsz

    public operator fun component3(): PidT = this.shmLpid

    public operator fun component4(): PidT = this.shmCpid

    public operator fun component5(): ShmattT = this.shmNattch

    public operator fun component6(): TimeT = this.shmAtime

    public operator fun component7(): TimeT = this.shmDtime

    public operator fun component8(): TimeT = this.shmCtime

    public operator fun component9(): MutPtr<CVoid> = this.shmInternal

    public fun copy(shmPerm: IpcPerm = this.shmPerm, shmSegsz: SizeT = this.shmSegsz, shmLpid: PidT = this.shmLpid, shmCpid: PidT = this.shmCpid, shmNattch: ShmattT = this.shmNattch, shmAtime: TimeT = this.shmAtime, shmDtime: TimeT = this.shmDtime, shmCtime: TimeT = this.shmCtime, shmInternal: MutPtr<CVoid> = this.shmInternal): ShmidDs = ShmidDs(shmPerm = shmPerm, shmSegsz = shmSegsz, shmLpid = shmLpid, shmCpid = shmCpid, shmNattch = shmNattch, shmAtime = shmAtime, shmDtime = shmDtime, shmCtime = shmCtime, shmInternalCtorArg = shmInternal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShmidDs) return false
        if (this.shmPerm != other.shmPerm) return false
        if (this.shmSegsz != other.shmSegsz) return false
        if (this.shmLpid != other.shmLpid) return false
        if (this.shmCpid != other.shmCpid) return false
        if (this.shmNattch != other.shmNattch) return false
        if (this.shmAtime != other.shmAtime) return false
        if (this.shmDtime != other.shmDtime) return false
        if (this.shmCtime != other.shmCtime) return false
        if (this.shmInternal != other.shmInternal) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.shmPerm.hashCode()
        result = 31 * result + this.shmSegsz.hashCode()
        result = 31 * result + this.shmLpid.hashCode()
        result = 31 * result + this.shmCpid.hashCode()
        result = 31 * result + this.shmNattch.hashCode()
        result = 31 * result + this.shmAtime.hashCode()
        result = 31 * result + this.shmDtime.hashCode()
        result = 31 * result + this.shmCtime.hashCode()
        result = 31 * result + this.shmInternal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            shmPerm: IpcPerm = IpcPerm(),
            shmSegsz: SizeT = 0uL,
            shmLpid: PidT = 0,
            shmCpid: PidT = 0,
            shmNattch: ShmattT = 0u,
            shmAtime: TimeT = 0L,
            shmDtime: TimeT = 0L,
            shmCtime: TimeT = 0L,
            shmInternal: MutPtr<CVoid> = MutPtr(0L),
        ): ShmidDs =
            ShmidDs(
                shmPerm = shmPerm,
                shmSegsz = shmSegsz,
                shmLpid = shmLpid,
                shmCpid = shmCpid,
                shmNattch = shmNattch,
                shmAtime = shmAtime,
                shmDtime = shmDtime,
                shmCtime = shmCtime,
                shmInternalCtorArg = shmInternal,
            )
    }
}

// elf.h
public data class Elf32Phdr(
    public var pType: Elf32Word = 0u,
    public var pOffset: Elf32Off = 0u,
    public var pVaddr: Elf32Addr = 0u,
    public var pPaddr: Elf32Addr = 0u,
    public var pFilesz: Elf32Word = 0u,
    public var pMemsz: Elf32Word = 0u,
    public var pFlags: Elf32Word = 0u,
    public var pAlign: Elf32Word = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Phdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Phdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Elf32Phdr =
                    Elf32Phdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Elf32Phdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.pVaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pFilesz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.pMemsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.pFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.pAlign)
                }
            }
    }
}

public data class Elf64Phdr(
    public var pType: Elf64Word = 0u,
    public var pFlags: Elf64Word = 0u,
    public var pOffset: Elf64Off = 0uL,
    public var pVaddr: Elf64Addr = 0uL,
    public var pPaddr: Elf64Addr = 0uL,
    public var pFilesz: Elf64Xword = 0uL,
    public var pMemsz: Elf64Xword = 0uL,
    public var pAlign: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Phdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Phdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Elf64Phdr =
                    Elf64Phdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Elf64Phdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.pType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.pVaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.pFilesz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.pMemsz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.pAlign)
                }
            }
    }
}

public data class Aux32Info(
    public var aType: Elf32Word = 0u,
    public var aV: Elf32Word = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aux32Info> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aux32Info> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Aux32Info =
                    Aux32Info(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Aux32Info) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.aV)
                }
            }
    }
}

public data class Aux64Info(
    public var aType: Elf64Word = 0u,
    public var aV: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aux64Info> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Aux64Info> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Aux64Info =
                    Aux64Info(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Aux64Info) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.aType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.aV)
                }
            }
    }
}

// link.h
public class DlPhdrInfo internal constructor(
    public var dlpiAddr: ElfAddr,
    dlpiNameCtorArg: ConstPtr<CChar>,
    dlpiPhdrCtorArg: ConstPtr<ElfPhdr>,
    public var dlpiPhnum: ElfHalf,
    public var dlpiAdds: CUlonglong,
    public var dlpiSubs: CUlonglong,
    public var dlpiTlsModid: Int,
    dlpiTlsDataCtorArg: MutPtr<CVoid>,
) {
    public var dlpiName: ConstPtr<CChar> = dlpiNameCtorArg
        internal set

    public var dlpiPhdr: ConstPtr<ElfPhdr> = dlpiPhdrCtorArg
        internal set

    public var dlpiTlsData: MutPtr<CVoid> = dlpiTlsDataCtorArg
        internal set

    public constructor() : this(
        dlpiAddr = 0u,
        dlpiNameCtorArg = ConstPtr(0L),
        dlpiPhdrCtorArg = ConstPtr(0L),
        dlpiPhnum = 0u,
        dlpiAdds = 0uL,
        dlpiSubs = 0uL,
        dlpiTlsModid = 0,
        dlpiTlsDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ElfAddr = this.dlpiAddr

    public operator fun component2(): ConstPtr<CChar> = this.dlpiName

    public operator fun component3(): ConstPtr<ElfPhdr> = this.dlpiPhdr

    public operator fun component4(): ElfHalf = this.dlpiPhnum

    public operator fun component5(): CUlonglong = this.dlpiAdds

    public operator fun component6(): CUlonglong = this.dlpiSubs

    public operator fun component7(): Int = this.dlpiTlsModid

    public operator fun component8(): MutPtr<CVoid> = this.dlpiTlsData

    public fun copy(dlpiAddr: ElfAddr = this.dlpiAddr, dlpiName: ConstPtr<CChar> = this.dlpiName, dlpiPhdr: ConstPtr<ElfPhdr> = this.dlpiPhdr, dlpiPhnum: ElfHalf = this.dlpiPhnum, dlpiAdds: CUlonglong = this.dlpiAdds, dlpiSubs: CUlonglong = this.dlpiSubs, dlpiTlsModid: Int = this.dlpiTlsModid, dlpiTlsData: MutPtr<CVoid> = this.dlpiTlsData): DlPhdrInfo = DlPhdrInfo(dlpiAddr = dlpiAddr, dlpiNameCtorArg = dlpiName, dlpiPhdrCtorArg = dlpiPhdr, dlpiPhnum = dlpiPhnum, dlpiAdds = dlpiAdds, dlpiSubs = dlpiSubs, dlpiTlsModid = dlpiTlsModid, dlpiTlsDataCtorArg = dlpiTlsData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DlPhdrInfo) return false
        if (this.dlpiAddr != other.dlpiAddr) return false
        if (this.dlpiName != other.dlpiName) return false
        if (this.dlpiPhdr != other.dlpiPhdr) return false
        if (this.dlpiPhnum != other.dlpiPhnum) return false
        if (this.dlpiAdds != other.dlpiAdds) return false
        if (this.dlpiSubs != other.dlpiSubs) return false
        if (this.dlpiTlsModid != other.dlpiTlsModid) return false
        if (this.dlpiTlsData != other.dlpiTlsData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dlpiAddr.hashCode()
        result = 31 * result + this.dlpiName.hashCode()
        result = 31 * result + this.dlpiPhdr.hashCode()
        result = 31 * result + this.dlpiPhnum.hashCode()
        result = 31 * result + this.dlpiAdds.hashCode()
        result = 31 * result + this.dlpiSubs.hashCode()
        result = 31 * result + this.dlpiTlsModid.hashCode()
        result = 31 * result + this.dlpiTlsData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlPhdrInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlPhdrInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): DlPhdrInfo =
                    DlPhdrInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<ElfPhdr>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: DlPhdrInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dlpiAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.dlpiName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<ElfPhdr>(64)
                    ).writeNative(addr + 16L, value.dlpiPhdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.dlpiPhnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.dlpiAdds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.dlpiSubs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 48L, value.dlpiTlsModid)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.dlpiTlsData)
                }
            }

        public operator fun invoke(
            dlpiAddr: ElfAddr = 0u,
            dlpiName: ConstPtr<CChar> = ConstPtr(0L),
            dlpiPhdr: ConstPtr<ElfPhdr> = ConstPtr(0L),
            dlpiPhnum: ElfHalf = 0u,
            dlpiAdds: CUlonglong = 0uL,
            dlpiSubs: CUlonglong = 0uL,
            dlpiTlsModid: Int = 0,
            dlpiTlsData: MutPtr<CVoid> = MutPtr(0L),
        ): DlPhdrInfo =
            DlPhdrInfo(
                dlpiAddr = dlpiAddr,
                dlpiNameCtorArg = dlpiName,
                dlpiPhdrCtorArg = dlpiPhdr,
                dlpiPhnum = dlpiPhnum,
                dlpiAdds = dlpiAdds,
                dlpiSubs = dlpiSubs,
                dlpiTlsModid = dlpiTlsModid,
                dlpiTlsDataCtorArg = dlpiTlsData,
            )
    }
}

public data class AcceptFilterArg(
    public var afName: UByteArray = UByteArray(16),
    public var afArg: UByteArray = UByteArray((256 - 16).toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AcceptFilterArg) return false
        if (!this.afName.contentEquals(other.afName)) return false
        if (!this.afArg.contentEquals(other.afArg)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.afName.contentHashCode()
        result = 31 * result + this.afArg.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AcceptFilterArg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AcceptFilterArg> {
                override val alignBytes: Long = 1L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((16L + ((256 - 16).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override fun readNative(addr: Long): AcceptFilterArg =
                    AcceptFilterArg(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256 - 16).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: AcceptFilterArg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.afName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256 - 16).toInt())
                    ).writeNative(addr + 16L, value.afArg.toList())
                }
            }
    }
}

public data class KiSigsetT(
    public var bits: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is KiSigsetT) return false
        if (!this.bits.contentEquals(other.bits)) return false
        return true
    }

    override fun hashCode(): Int = this.bits.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KiSigsetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KiSigsetT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): KiSigsetT =
                    KiSigsetT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: KiSigsetT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.bits.toList())
                }
            }
    }
}

public class KinfoProc2 {
    public var pForw: ULong = 0uL

    public var pBack: ULong = 0uL

    public var pPaddr: ULong = 0uL

    public var pAddr: ULong = 0uL

    public var pFd: ULong = 0uL

    public var pCwdi: ULong = 0uL

    public var pStats: ULong = 0uL

    public var pLimit: ULong = 0uL

    public var pVmspace: ULong = 0uL

    public var pSigacts: ULong = 0uL

    public var pSess: ULong = 0uL

    public var pTsess: ULong = 0uL

    public var pRu: ULong = 0uL

    public var pEflag: Int = 0

    public var pExitsig: Int = 0

    public var pFlag: Int = 0

    public var pPid: Int = 0

    public var pPpid: Int = 0

    public var pSid: Int = 0

    public var pPgid: Int = 0

    public var pTpgid: Int = 0

    public var pUid: UInt = 0u

    public var pRuid: UInt = 0u

    public var pGid: UInt = 0u

    public var pRgid: UInt = 0u

    public var pGroups: UIntArray = UIntArray(KI_NGROUPS)

    public var pNgroups: Short = 0

    public var pJobc: Short = 0

    public var pTdev: UInt = 0u

    public var pEstcpu: UInt = 0u

    public var pRtimeSec: UInt = 0u

    public var pRtimeUsec: UInt = 0u

    public var pCpticks: Int = 0

    public var pPctcpu: UInt = 0u

    public var pSwtime: UInt = 0u

    public var pSlptime: UInt = 0u

    public var pSchedflags: Int = 0

    public var pUticks: ULong = 0uL

    public var pSticks: ULong = 0uL

    public var pIticks: ULong = 0uL

    public var pTracep: ULong = 0uL

    public var pTraceflag: Int = 0

    public var pHoldcnt: Int = 0

    public var pSiglist: KiSigsetT = KiSigsetT()

    public var pSigmask: KiSigsetT = KiSigsetT()

    public var pSigignore: KiSigsetT = KiSigsetT()

    public var pSigcatch: KiSigsetT = KiSigsetT()

    public var pStat: Byte = 0

    public var pPriority: UByte = 0u

    public var pUsrpri: UByte = 0u

    public var pNice: UByte = 0u

    public var pXstat: UShort = 0u

    public var pAcflag: UShort = 0u

    public var pComm: UByteArray = UByteArray(KI_MAXCOMLEN)

    public var pWmesg: UByteArray = UByteArray(KI_WMESGLEN)

    public var pWchan: ULong = 0uL

    public var pLogin: UByteArray = UByteArray(KI_MAXLOGNAME)

    public var pVmRssize: Int = 0

    public var pVmTsize: Int = 0

    public var pVmDsize: Int = 0

    public var pVmSsize: Int = 0

    public var pUvalid: Long = 0L

    public var pUstartSec: UInt = 0u

    public var pUstartUsec: UInt = 0u

    public var pUutimeSec: UInt = 0u

    public var pUutimeUsec: UInt = 0u

    public var pUstimeSec: UInt = 0u

    public var pUstimeUsec: UInt = 0u

    public var pUruMaxrss: ULong = 0uL

    public var pUruIxrss: ULong = 0uL

    public var pUruIdrss: ULong = 0uL

    public var pUruIsrss: ULong = 0uL

    public var pUruMinflt: ULong = 0uL

    public var pUruMajflt: ULong = 0uL

    public var pUruNswap: ULong = 0uL

    public var pUruInblock: ULong = 0uL

    public var pUruOublock: ULong = 0uL

    public var pUruMsgsnd: ULong = 0uL

    public var pUruMsgrcv: ULong = 0uL

    public var pUruNsignals: ULong = 0uL

    public var pUruNvcsw: ULong = 0uL

    public var pUruNivcsw: ULong = 0uL

    public var pUctimeSec: UInt = 0u

    public var pUctimeUsec: UInt = 0u

    public var pCpuid: ULong = 0uL

    public var pRealflag: ULong = 0uL

    public var pNlwps: ULong = 0uL

    public var pNrlwps: ULong = 0uL

    public var pRealstat: ULong = 0uL

    public var pSvuid: UInt = 0u

    public var pSvgid: UInt = 0u

    public var pEname: UByteArray = UByteArray(KI_MAXEMULLEN)

    public var pVmVsize: Long = 0L

    public var pVmMsize: Long = 0L

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoProc2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoProc2> {
                override val alignBytes: Long = 8L
                private val off26: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((152L + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L)
                private val off27: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off26 + 2L), 2L)
                private val off28: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off27 + 2L), 4L)
                private val off29: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off28 + 4L), 4L)
                private val off30: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off29 + 4L), 4L)
                private val off31: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off30 + 4L), 4L)
                private val off32: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off31 + 4L), 4L)
                private val off33: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off32 + 4L), 4L)
                private val off34: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off33 + 4L), 4L)
                private val off35: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off34 + 4L), 4L)
                private val off36: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off35 + 4L), 4L)
                private val off37: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off36 + 4L), 8L)
                private val off38: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off37 + 8L), 8L)
                private val off39: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off38 + 8L), 8L)
                private val off40: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off39 + 8L), 8L)
                private val off41: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off40 + 8L), 4L)
                private val off42: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off41 + 4L), 4L)
                private val off43: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off42 + 4L), 4L)
                private val off44: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off43 + 16L), 4L)
                private val off45: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off44 + 16L), 4L)
                private val off46: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off45 + 16L), 4L)
                private val off47: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off46 + 16L), 1L)
                private val off48: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off47 + 1L), 1L)
                private val off49: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off48 + 1L), 1L)
                private val off50: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off49 + 1L), 1L)
                private val off51: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off50 + 1L), 2L)
                private val off52: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off51 + 2L), 2L)
                private val off53: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off52 + 2L), 1L)
                private val off54: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off53 + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off55: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off54 + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                private val off56: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off55 + 8L), 1L)
                private val off57: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off56 + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                private val off58: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off57 + 4L), 4L)
                private val off59: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off58 + 4L), 4L)
                private val off60: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off59 + 4L), 4L)
                private val off61: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off60 + 4L), 8L)
                private val off62: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off61 + 8L), 4L)
                private val off63: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off62 + 4L), 4L)
                private val off64: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off63 + 4L), 4L)
                private val off65: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off64 + 4L), 4L)
                private val off66: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off65 + 4L), 4L)
                private val off67: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off66 + 4L), 4L)
                private val off68: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off67 + 4L), 8L)
                private val off69: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off68 + 8L), 8L)
                private val off70: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off69 + 8L), 8L)
                private val off71: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off70 + 8L), 8L)
                private val off72: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off71 + 8L), 8L)
                private val off73: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off72 + 8L), 8L)
                private val off74: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off73 + 8L), 8L)
                private val off75: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off74 + 8L), 8L)
                private val off76: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off75 + 8L), 8L)
                private val off77: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off76 + 8L), 8L)
                private val off78: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off77 + 8L), 8L)
                private val off79: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off78 + 8L), 8L)
                private val off80: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off79 + 8L), 8L)
                private val off81: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off80 + 8L), 8L)
                private val off82: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off81 + 8L), 4L)
                private val off83: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off82 + 4L), 4L)
                private val off84: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off83 + 4L), 8L)
                private val off85: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off84 + 8L), 8L)
                private val off86: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off85 + 8L), 8L)
                private val off87: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off86 + 8L), 8L)
                private val off88: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off87 + 8L), 8L)
                private val off89: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off88 + 8L), 4L)
                private val off90: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off89 + 4L), 4L)
                private val off91: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off90 + 4L), 1L)
                private val off92: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off91 + ((KI_MAXEMULLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                private val off93: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off92 + 8L), 8L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off93 + 8L), 8L)
                override fun readNative(addr: Long): KinfoProc2 =
                    KinfoProc2().apply {
                        this.pForw = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr)
                        this.pBack = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L)
                        this.pPaddr = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L)
                        this.pAddr = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L)
                        this.pFd = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L)
                        this.pCwdi = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L)
                        this.pStats = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L)
                        this.pLimit = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L)
                        this.pVmspace = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L)
                        this.pSigacts = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L)
                        this.pSess = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L)
                        this.pTsess = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L)
                        this.pRu = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L)
                        this.pEflag = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 104L)
                        this.pExitsig = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 108L)
                        this.pFlag = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 112L)
                        this.pPid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 116L)
                        this.pPpid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L)
                        this.pSid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 124L)
                        this.pPgid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 128L)
                        this.pTpgid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 132L)
                        this.pUid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L)
                        this.pRuid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L)
                        this.pGid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L)
                        this.pRgid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L)
                        this.pGroups =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (KI_NGROUPS).toInt())
                            ).readNative(addr + 152L).toUIntArray()
                        this.pNgroups = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + off26)
                        this.pJobc = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + off27)
                        this.pTdev = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off28)
                        this.pEstcpu = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off29)
                        this.pRtimeSec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off30)
                        this.pRtimeUsec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off31)
                        this.pCpticks = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off32)
                        this.pPctcpu = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off33)
                        this.pSwtime = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off34)
                        this.pSlptime = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off35)
                        this.pSchedflags = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off36)
                        this.pUticks = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off37)
                        this.pSticks = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off38)
                        this.pIticks = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off39)
                        this.pTracep = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off40)
                        this.pTraceflag = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off41)
                        this.pHoldcnt = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off42)
                        this.pSiglist = (KiSigsetT.typeLayout()).readNative(addr + off43)
                        this.pSigmask = (KiSigsetT.typeLayout()).readNative(addr + off44)
                        this.pSigignore = (KiSigsetT.typeLayout()).readNative(addr + off45)
                        this.pSigcatch = (KiSigsetT.typeLayout()).readNative(addr + off46)
                        this.pStat = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + off47)
                        this.pPriority = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off48)
                        this.pUsrpri = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off49)
                        this.pNice = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off50)
                        this.pXstat = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off51)
                        this.pAcflag = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off52)
                        this.pComm =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXCOMLEN).toInt())
                            ).readNative(addr + off53).toUByteArray()
                        this.pWmesg =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_WMESGLEN).toInt())
                            ).readNative(addr + off54).toUByteArray()
                        this.pWchan = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off55)
                        this.pLogin =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXLOGNAME).toInt())
                            ).readNative(addr + off56).toUByteArray()
                        this.pVmRssize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off57)
                        this.pVmTsize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off58)
                        this.pVmDsize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off59)
                        this.pVmSsize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off60)
                        this.pUvalid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + off61)
                        this.pUstartSec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off62)
                        this.pUstartUsec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off63)
                        this.pUutimeSec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off64)
                        this.pUutimeUsec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off65)
                        this.pUstimeSec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off66)
                        this.pUstimeUsec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off67)
                        this.pUruMaxrss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off68)
                        this.pUruIxrss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off69)
                        this.pUruIdrss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off70)
                        this.pUruIsrss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off71)
                        this.pUruMinflt = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off72)
                        this.pUruMajflt = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off73)
                        this.pUruNswap = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off74)
                        this.pUruInblock = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off75)
                        this.pUruOublock = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off76)
                        this.pUruMsgsnd = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off77)
                        this.pUruMsgrcv = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off78)
                        this.pUruNsignals = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off79)
                        this.pUruNvcsw = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off80)
                        this.pUruNivcsw = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off81)
                        this.pUctimeSec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off82)
                        this.pUctimeUsec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off83)
                        this.pCpuid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off84)
                        this.pRealflag = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off85)
                        this.pNlwps = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off86)
                        this.pNrlwps = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off87)
                        this.pRealstat = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off88)
                        this.pSvuid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off89)
                        this.pSvgid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off90)
                        this.pEname =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXEMULLEN).toInt())
                            ).readNative(addr + off91).toUByteArray()
                        this.pVmVsize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + off92)
                        this.pVmMsize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + off93)
                    }
                override fun writeNative(addr: Long, value: KinfoProc2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.pForw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pBack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.pAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.pFd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.pCwdi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.pStats)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.pLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.pVmspace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.pSigacts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.pSess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.pTsess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.pRu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 104L, value.pEflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 108L, value.pExitsig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 112L, value.pFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 116L, value.pPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.pPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 124L, value.pSid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 128L, value.pPgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 132L, value.pTpgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.pUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.pRuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.pGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.pRgid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (KI_NGROUPS).toInt())
                    ).writeNative(addr + 152L, value.pGroups.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + off26, value.pNgroups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + off27, value.pJobc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off28, value.pTdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off29, value.pEstcpu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off30, value.pRtimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off31, value.pRtimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off32, value.pCpticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off33, value.pPctcpu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off34, value.pSwtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off35, value.pSlptime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off36, value.pSchedflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off37, value.pUticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off38, value.pSticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off39, value.pIticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off40, value.pTracep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off41, value.pTraceflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off42, value.pHoldcnt)
                    (KiSigsetT.typeLayout()).writeNative(addr + off43, value.pSiglist)
                    (KiSigsetT.typeLayout()).writeNative(addr + off44, value.pSigmask)
                    (KiSigsetT.typeLayout()).writeNative(addr + off45, value.pSigignore)
                    (KiSigsetT.typeLayout()).writeNative(addr + off46, value.pSigcatch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + off47, value.pStat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off48, value.pPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off49, value.pUsrpri)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off50, value.pNice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off51, value.pXstat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off52, value.pAcflag)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXCOMLEN).toInt())
                    ).writeNative(addr + off53, value.pComm.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_WMESGLEN).toInt())
                    ).writeNative(addr + off54, value.pWmesg.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off55, value.pWchan)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXLOGNAME).toInt())
                    ).writeNative(addr + off56, value.pLogin.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off57, value.pVmRssize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off58, value.pVmTsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off59, value.pVmDsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off60, value.pVmSsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + off61, value.pUvalid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off62, value.pUstartSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off63, value.pUstartUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off64, value.pUutimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off65, value.pUutimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off66, value.pUstimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off67, value.pUstimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off68, value.pUruMaxrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off69, value.pUruIxrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off70, value.pUruIdrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off71, value.pUruIsrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off72, value.pUruMinflt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off73, value.pUruMajflt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off74, value.pUruNswap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off75, value.pUruInblock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off76, value.pUruOublock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off77, value.pUruMsgsnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off78, value.pUruMsgrcv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off79, value.pUruNsignals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off80, value.pUruNvcsw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off81, value.pUruNivcsw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off82, value.pUctimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off83, value.pUctimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off84, value.pCpuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off85, value.pRealflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off86, value.pNlwps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off87, value.pNrlwps)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off88, value.pRealstat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off89, value.pSvuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off90, value.pSvgid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXEMULLEN).toInt())
                    ).writeNative(addr + off91, value.pEname.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + off92, value.pVmVsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + off93, value.pVmMsize)
                }
            }
    }
}

public class KinfoLwp(
    public var lForw: ULong = 0uL,
    public var lBack: ULong = 0uL,
    public var lLaddr: ULong = 0uL,
    public var lAddr: ULong = 0uL,
    public var lLid: Int = 0,
    public var lFlag: Int = 0,
    public var lSwtime: UInt = 0u,
    public var lSlptime: UInt = 0u,
    public var lSchedflags: Int = 0,
    public var lHoldcnt: Int = 0,
    public var lPriority: UByte = 0u,
    public var lUsrpri: UByte = 0u,
    public var lStat: Byte = 0,
    public var lPad1: Byte = 0,
    public var lPad2: Int = 0,
    public var lWmesg: UByteArray = UByteArray(KI_WMESGLEN),
    public var lWchan: ULong = 0uL,
    public var lCpuid: ULong = 0uL,
    public var lRtimeSec: UInt = 0u,
    public var lRtimeUsec: UInt = 0u,
    public var lCpticks: UInt = 0u,
    public var lPctcpu: UInt = 0u,
    public var lPid: UInt = 0u,
    public var lName: UByteArray = UByteArray(KI_LNAMELEN),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoLwp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoLwp> {
                override val alignBytes: Long = 8L
                private val off16: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((64L + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                private val off17: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off16 + 8L), 8L)
                private val off18: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off17 + 8L), 4L)
                private val off19: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off18 + 4L), 4L)
                private val off20: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off19 + 4L), 4L)
                private val off21: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off20 + 4L), 4L)
                private val off22: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off21 + 4L), 4L)
                private val off23: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off22 + 4L), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off23 + ((KI_LNAMELEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): KinfoLwp =
                    KinfoLwp(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 57L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 59L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_WMESGLEN).toInt())
                        ).readNative(addr + 64L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off16),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off17),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off18),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off19),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off20),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off21),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off22),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_LNAMELEN).toInt())
                        ).readNative(addr + off23).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KinfoLwp) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.lForw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.lBack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.lLaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.lAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.lLid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.lFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.lSwtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.lSlptime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.lSchedflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.lHoldcnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 56L, value.lPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 57L, value.lUsrpri)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 58L, value.lStat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 59L, value.lPad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.lPad2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_WMESGLEN).toInt())
                    ).writeNative(addr + 64L, value.lWmesg.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off16, value.lWchan)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off17, value.lCpuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off18, value.lRtimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off19, value.lRtimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off20, value.lCpticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off21, value.lPctcpu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off22, value.lPid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_LNAMELEN).toInt())
                    ).writeNative(addr + off23, value.lName.toList())
                }
            }
    }
}

public class KinfoVmentry(
    public var kveStart: ULong = 0uL,
    public var kveEnd: ULong = 0uL,
    public var kveOffset: ULong = 0uL,
    public var kveType: UInt = 0u,
    public var kveFlags: UInt = 0u,
    public var kveCount: UInt = 0u,
    public var kveWiredCount: UInt = 0u,
    public var kveAdvice: UInt = 0u,
    public var kveAttributes: UInt = 0u,
    public var kveProtection: UInt = 0u,
    public var kveMaxProtection: UInt = 0u,
    public var kveRefCount: UInt = 0u,
    public var kveInheritance: UInt = 0u,
    public var kveVnFileid: ULong = 0uL,
    public var kveVnSize: ULong = 0uL,
    public var kveVnFsid: ULong = 0uL,
    public var kveVnRdev: ULong = 0uL,
    public var kveVnType: UInt = 0u,
    public var kveVnMode: UInt = 0u,
    public var kvePath: UByteArray = UByteArray(PATH_MAX),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoVmentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoVmentry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((104L + ((PATH_MAX).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): KinfoVmentry =
                    KinfoVmentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PATH_MAX).toInt())
                        ).readNative(addr + 104L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: KinfoVmentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.kveStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.kveEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.kveOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.kveType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.kveFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.kveCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.kveWiredCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.kveAdvice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.kveAttributes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.kveProtection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.kveMaxProtection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.kveRefCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.kveInheritance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.kveVnFileid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.kveVnSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.kveVnFsid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.kveVnRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.kveVnType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.kveVnMode)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PATH_MAX).toInt())
                    ).writeNative(addr + 104L, value.kvePath.toList())
                }
            }
    }
}

public class CAnonymousPosixSpawnFaeOpen internal constructor(
    pathCtorArg: MutPtr<CChar>,
    public var oflag: CInt,
    public var mode: ModeT,
) {
    public var path: MutPtr<CChar> = pathCtorArg
        internal set

    public constructor() : this(
        pathCtorArg = MutPtr(0L),
        oflag = 0,
        mode = 0u,
    )

    public operator fun component1(): MutPtr<CChar> = this.path

    public operator fun component2(): CInt = this.oflag

    public operator fun component3(): ModeT = this.mode

    public fun copy(path: MutPtr<CChar> = this.path, oflag: CInt = this.oflag, mode: ModeT = this.mode): CAnonymousPosixSpawnFaeOpen = CAnonymousPosixSpawnFaeOpen(pathCtorArg = path, oflag = oflag, mode = mode)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousPosixSpawnFaeOpen) return false
        if (this.path != other.path) return false
        if (this.oflag != other.oflag) return false
        if (this.mode != other.mode) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.path.hashCode()
        result = 31 * result + this.oflag.hashCode()
        result = 31 * result + this.mode.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPosixSpawnFaeOpen> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPosixSpawnFaeOpen> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): CAnonymousPosixSpawnFaeOpen =
                    CAnonymousPosixSpawnFaeOpen(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPosixSpawnFaeOpen) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.path)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.oflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.mode)
                }
            }

        public operator fun invoke(
            path: MutPtr<CChar> = MutPtr(0L),
            oflag: CInt = 0,
            mode: ModeT = 0u,
        ): CAnonymousPosixSpawnFaeOpen =
            CAnonymousPosixSpawnFaeOpen(
                pathCtorArg = path,
                oflag = oflag,
                mode = mode,
            )
    }
}

public data class CAnonymousPosixSpawnFaeDup2(
    public var newfildes: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPosixSpawnFaeDup2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousPosixSpawnFaeDup2> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): CAnonymousPosixSpawnFaeDup2 =
                    CAnonymousPosixSpawnFaeDup2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CAnonymousPosixSpawnFaeDup2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.newfildes)
                }
            }
    }
}

public data class PosixSpawnattrT(
    public var saFlags: CShort = 0,
    public var saPgroup: PidT = 0,
    public var saSchedparam: SchedParam = SchedParam(),
    public var saSchedpolicy: CInt = 0,
    public var saSigdefault: SigsetT = SigsetT(),
    public var saSigmask: SigsetT = SigsetT(),
)

public data class PosixSpawnFileActionsEntryT(
    public var faeAction: FaeAction = FaeAction.entries.first(),
    public var faeFildes: CInt = 0,
    public var faeData: CAnonymousPosixSpawnFae = CAnonymousPosixSpawnFae(),
)

public class PosixSpawnFileActionsT internal constructor(
    public var size: CUint,
    public var len: CUint,
    faeCtorArg: MutPtr<PosixSpawnFileActionsEntryT>,
) {
    public var fae: MutPtr<PosixSpawnFileActionsEntryT> = faeCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        len = 0u,
        faeCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.size

    public operator fun component2(): CUint = this.len

    public operator fun component3(): MutPtr<PosixSpawnFileActionsEntryT> = this.fae

    public fun copy(size: CUint = this.size, len: CUint = this.len, fae: MutPtr<PosixSpawnFileActionsEntryT> = this.fae): PosixSpawnFileActionsT = PosixSpawnFileActionsT(size = size, len = len, faeCtorArg = fae)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PosixSpawnFileActionsT) return false
        if (this.size != other.size) return false
        if (this.len != other.len) return false
        if (this.fae != other.fae) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.len.hashCode()
        result = 31 * result + this.fae.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PosixSpawnFileActionsT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PosixSpawnFileActionsT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): PosixSpawnFileActionsT =
                    PosixSpawnFileActionsT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<PosixSpawnFileActionsEntryT>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PosixSpawnFileActionsT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.len)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<PosixSpawnFileActionsEntryT>(64)
                    ).writeNative(addr + 8L, value.fae)
                }
            }

        public operator fun invoke(
            size: CUint = 0u,
            len: CUint = 0u,
            fae: MutPtr<PosixSpawnFileActionsEntryT> = MutPtr(0L),
        ): PosixSpawnFileActionsT =
            PosixSpawnFileActionsT(
                size = size,
                len = len,
                faeCtorArg = fae,
            )
    }
}

public data class PtraceLwpinfo(
    public var plLwpid: LwpidT = 0,
    public var plEvent: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceLwpinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceLwpinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PtraceLwpinfo =
                    PtraceLwpinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: PtraceLwpinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.plLwpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.plEvent)
                }
            }
    }
}

public class PtraceLwpstatus internal constructor(
    public var plLwpid: LwpidT,
    public var plSigpend: SigsetT,
    public var plSigmask: SigsetT,
    public var plName: UByteArray,
    plPrivateCtorArg: MutPtr<CVoid>,
) {
    public var plPrivate: MutPtr<CVoid> = plPrivateCtorArg
        internal set

    public constructor() : this(
        plLwpid = 0,
        plSigpend = SigsetT(),
        plSigmask = SigsetT(),
        plName = UByteArray(20),
        plPrivateCtorArg = MutPtr(0L),
    )

    public operator fun component1(): LwpidT = this.plLwpid

    public operator fun component2(): SigsetT = this.plSigpend

    public operator fun component3(): SigsetT = this.plSigmask

    public operator fun component4(): UByteArray = this.plName

    public operator fun component5(): MutPtr<CVoid> = this.plPrivate

    public fun copy(plLwpid: LwpidT = this.plLwpid, plSigpend: SigsetT = this.plSigpend, plSigmask: SigsetT = this.plSigmask, plName: UByteArray = this.plName, plPrivate: MutPtr<CVoid> = this.plPrivate): PtraceLwpstatus = PtraceLwpstatus(plLwpid = plLwpid, plSigpend = plSigpend, plSigmask = plSigmask, plName = plName, plPrivateCtorArg = plPrivate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceLwpstatus) return false
        if (this.plLwpid != other.plLwpid) return false
        if (this.plSigpend != other.plSigpend) return false
        if (this.plSigmask != other.plSigmask) return false
        if (!this.plName.contentEquals(other.plName)) return false
        if (this.plPrivate != other.plPrivate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.plLwpid.hashCode()
        result = 31 * result + this.plSigpend.hashCode()
        result = 31 * result + this.plSigmask.hashCode()
        result = 31 * result + this.plName.contentHashCode()
        result = 31 * result + this.plPrivate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceLwpstatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceLwpstatus> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): PtraceLwpstatus =
                    PtraceLwpstatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (SigsetT.typeLayout()).readNative(addr + 4L),
                        (SigsetT.typeLayout()).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                        ).readNative(addr + 36L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: PtraceLwpstatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.plLwpid)
                    (SigsetT.typeLayout()).writeNative(addr + 4L, value.plSigpend)
                    (SigsetT.typeLayout()).writeNative(addr + 20L, value.plSigmask)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (20).toInt())
                    ).writeNative(addr + 36L, value.plName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.plPrivate)
                }
            }

        public operator fun invoke(
            plLwpid: LwpidT = 0,
            plSigpend: SigsetT = SigsetT(),
            plSigmask: SigsetT = SigsetT(),
            plName: UByteArray = UByteArray(20),
            plPrivate: MutPtr<CVoid> = MutPtr(0L),
        ): PtraceLwpstatus =
            PtraceLwpstatus(
                plLwpid = plLwpid,
                plSigpend = plSigpend,
                plSigmask = plSigmask,
                plName = plName,
                plPrivateCtorArg = plPrivate,
            )
    }
}

public data class PtraceSiginfo(
    public var psiSiginfo: SiginfoT = SiginfoT(),
    public var psiLwpid: LwpidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceSiginfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceSiginfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): PtraceSiginfo =
                    PtraceSiginfo(
                        (SiginfoT.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: PtraceSiginfo) {
                    (SiginfoT.typeLayout()).writeNative(addr, value.psiSiginfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 128L, value.psiLwpid)
                }
            }
    }
}

public data class PtraceEvent(
    public var peSetEvent: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceEvent> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PtraceEvent =
                    PtraceEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PtraceEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.peSetEvent)
                }
            }
    }
}

public data class Sysctldesc(
    public var descrNum: Int = 0,
    public var descrVer: UInt = 0u,
    public var descrLen: UInt = 0u,
    public var descrStr: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sysctldesc) return false
        if (this.descrNum != other.descrNum) return false
        if (this.descrVer != other.descrVer) return false
        if (this.descrLen != other.descrLen) return false
        if (!this.descrStr.contentEquals(other.descrStr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.descrNum.hashCode()
        result = 31 * result + this.descrVer.hashCode()
        result = 31 * result + this.descrLen.hashCode()
        result = 31 * result + this.descrStr.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sysctldesc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sysctldesc> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Sysctldesc =
                    Sysctldesc(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Sysctldesc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.descrNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.descrVer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.descrLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 12L, value.descrStr.toList())
                }
            }
    }
}

public class TcpInfo(
    public var tcpiState: UByte = 0u,
    public var tcpiCaState: UByte = 0u,
    public var tcpiRetransmits: UByte = 0u,
    public var tcpiProbes: UByte = 0u,
    public var tcpiBackoff: UByte = 0u,
    public var tcpiOptions: UByte = 0u,
    public var tcpSndWscale: UByte = 0u,
    public var tcpRcvWscale: UByte = 0u,
    public var tcpiRto: UInt = 0u,
    public var tcpiAto: UInt = 0u,
    public var tcpiSndMss: UInt = 0u,
    public var tcpiRcvMss: UInt = 0u,
    public var tcpiUnacked: UInt = 0u,
    public var tcpiSacked: UInt = 0u,
    public var tcpiLost: UInt = 0u,
    public var tcpiRetrans: UInt = 0u,
    public var tcpiFackets: UInt = 0u,
    public var tcpiLastDataSent: UInt = 0u,
    public var tcpiLastAckSent: UInt = 0u,
    public var tcpiLastDataRecv: UInt = 0u,
    public var tcpiLastAckRecv: UInt = 0u,
    public var tcpiPmtu: UInt = 0u,
    public var tcpiRcvSsthresh: UInt = 0u,
    public var tcpiRtt: UInt = 0u,
    public var tcpiRttvar: UInt = 0u,
    public var tcpiSndSsthresh: UInt = 0u,
    public var tcpiSndCwnd: UInt = 0u,
    public var tcpiAdvmss: UInt = 0u,
    public var tcpiReordering: UInt = 0u,
    public var tcpiRcvRtt: UInt = 0u,
    public var tcpiRcvSpace: UInt = 0u,
    public var tcpiSndWnd: UInt = 0u,
    public var tcpiSndBwnd: UInt = 0u,
    public var tcpiSndNxt: UInt = 0u,
    public var tcpiRcvNxt: UInt = 0u,
    public var tcpiToeTid: UInt = 0u,
    public var tcpiSndRexmitpack: UInt = 0u,
    public var tcpiRcvOoopack: UInt = 0u,
    public var tcpiSndZerowin: UInt = 0u,
    public var tcpiPad: UIntArray = UIntArray(26),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 236L
                override fun readNative(addr: Long): TcpInfo =
                    TcpInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 7L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 108L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 116L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 124L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (26).toInt())
                        ).readNative(addr + 132L).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: TcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.tcpiState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.tcpiCaState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.tcpiRetransmits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.tcpiProbes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.tcpiBackoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.tcpiOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.tcpSndWscale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.tcpRcvWscale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.tcpiRto)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.tcpiAto)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.tcpiSndMss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.tcpiRcvMss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.tcpiUnacked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.tcpiSacked)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.tcpiLost)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.tcpiRetrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.tcpiFackets)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.tcpiLastDataSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.tcpiLastAckSent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.tcpiLastDataRecv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.tcpiLastAckRecv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.tcpiPmtu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.tcpiRcvSsthresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.tcpiRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.tcpiRttvar)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.tcpiSndSsthresh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 80L, value.tcpiSndCwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 84L, value.tcpiAdvmss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 88L, value.tcpiReordering)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.tcpiRcvRtt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 96L, value.tcpiRcvSpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.tcpiSndWnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.tcpiSndBwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.tcpiSndNxt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.tcpiRcvNxt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.tcpiToeTid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.tcpiSndRexmitpack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.tcpiRcvOoopack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.tcpiSndZerowin)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (26).toInt())
                    ).writeNative(addr + 132L, value.tcpiPad.toList())
                }
            }
    }
}

public data class InPktinfo(
    public var ipiAddr: InAddr = InAddr(),
    public var ipiIfindex: CUint = 0u,
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

public data class Arphdr(
    public var arHrd: UShort = 0u,
    public var arPro: UShort = 0u,
    public var arHln: UByte = 0u,
    public var arPln: UByte = 0u,
    public var arOp: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arphdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arphdr> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Arphdr =
                    Arphdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Arphdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.arHrd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.arPro)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.arHln)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.arPln)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.arOp)
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

public data class SockaddrIn(
    public var sinLen: UByte = 0u,
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: ByteArray = ByteArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrIn) return false
        if (this.sinLen != other.sinLen) return false
        if (this.sinFamily != other.sinFamily) return false
        if (this.sinPort != other.sinPort) return false
        if (this.sinAddr != other.sinAddr) return false
        if (!this.sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sinLen.hashCode()
        result = 31 * result + this.sinFamily.hashCode()
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (InAddr.typeLayout()).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8).toInt())
                        ).readNative(addr + 8L).toByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrIn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sinLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sinFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sinPort)
                    (InAddr.typeLayout()).writeNative(addr + 4L, value.sinAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (8).toInt())
                    ).writeNative(addr + 8L, value.sinZero.toList())
                }
            }
    }
}

public data class Dirent(
    public var dFileno: InoT = 0uL,
    public var dReclen: UShort = 0u,
    public var dNamlen: UShort = 0u,
    public var dType: UByte = 0u,
    public var dName: UByteArray = UByteArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dFileno != other.dFileno) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dNamlen != other.dNamlen) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dFileno.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 528L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                        ).readNative(addr + 13L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dFileno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.dReclen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.dNamlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.dType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (512).toInt())
                    ).writeNative(addr + 13L, value.dName.toList())
                }
            }
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssPad2: Long = 0L,
    public var ssPad3: UByteArray = UByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssLen != other.ssLen) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssPad2 != other.ssPad2) return false
        if (!this.ssPad3.contentEquals(other.ssPad3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.ssFamily.hashCode()
        result = 31 * result + this.ssPad1.contentHashCode()
        result = 31 * result + this.ssPad2.hashCode()
        result = 31 * result + this.ssPad3.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): SockaddrStorage =
                    SockaddrStorage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.ssLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.ssFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 2L, value.ssPad1.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.ssPad2)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (112).toInt())
                    ).writeNative(addr + 16L, value.ssPad3.toList())
                }
            }
    }
}

public class Sigevent internal constructor(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    unused1CtorArg: MutPtr<CVoid>,
    sigevNotifyAttributesCtorArg: MutPtr<CVoid>,
) {
    public var unused1: MutPtr<CVoid> = unused1CtorArg
        internal set

    // actually a function pointer
    public var sigevNotifyAttributes: MutPtr<CVoid> = sigevNotifyAttributesCtorArg
        internal set

    public constructor() : this(
        sigevNotify = 0,
        sigevSigno = 0,
        sigevValue = Sigval(),
        unused1CtorArg = MutPtr(0L),
        sigevNotifyAttributesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.sigevNotify

    public operator fun component2(): CInt = this.sigevSigno

    public operator fun component3(): Sigval = this.sigevValue

    public operator fun component4(): MutPtr<CVoid> = this.unused1

    public operator fun component5(): MutPtr<CVoid> = this.sigevNotifyAttributes

    public fun copy(sigevNotify: CInt = this.sigevNotify, sigevSigno: CInt = this.sigevSigno, sigevValue: Sigval = this.sigevValue, unused1: MutPtr<CVoid> = this.unused1, sigevNotifyAttributes: MutPtr<CVoid> = this.sigevNotifyAttributes): Sigevent = Sigevent(sigevNotify = sigevNotify, sigevSigno = sigevSigno, sigevValue = sigevValue, unused1CtorArg = unused1, sigevNotifyAttributesCtorArg = sigevNotifyAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigevent) return false
        if (this.sigevNotify != other.sigevNotify) return false
        if (this.sigevSigno != other.sigevSigno) return false
        if (this.sigevValue != other.sigevValue) return false
        if (this.unused1 != other.unused1) return false
        if (this.sigevNotifyAttributes != other.sigevNotifyAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sigevNotify.hashCode()
        result = 31 * result + this.sigevSigno.hashCode()
        result = 31 * result + this.sigevValue.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.sigevNotifyAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sigevNotify: CInt = 0,
            sigevSigno: CInt = 0,
            sigevValue: Sigval = Sigval(),
            unused1: MutPtr<CVoid> = MutPtr(0L),
            sigevNotifyAttributes: MutPtr<CVoid> = MutPtr(0L),
        ): Sigevent =
            Sigevent(
                sigevNotify = sigevNotify,
                sigevSigno = sigevSigno,
                sigevValue = sigevValue,
                unused1CtorArg = unused1,
                sigevNotifyAttributesCtorArg = sigevNotifyAttributes,
            )
    }
}

public data class CAnonymousPosixSpawnFae(
    public var open: CAnonymousPosixSpawnFaeOpen = CAnonymousPosixSpawnFaeOpen(),
    public var dup2: CAnonymousPosixSpawnFaeDup2 = CAnonymousPosixSpawnFaeDup2(),
) {
    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_posix_spawn_fae").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousPosixSpawnFae): Boolean = this.open == other.open || this.dup2 == other.dup2

    public override fun hashCode(): Int {
        var state = 0
        run {
            state = 31 * state + (this.open).hashCode()
            state = 31 * state + (this.dup2).hashCode()
        }
        return state
    }
}
