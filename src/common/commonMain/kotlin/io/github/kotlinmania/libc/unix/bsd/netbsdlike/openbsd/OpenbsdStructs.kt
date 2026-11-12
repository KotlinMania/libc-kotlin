@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.new.openbsd.sys.ipc.IpcPerm
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.bsd.BlkcntT
import io.github.kotlinmania.libc.unix.bsd.FsidT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.InoT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.NlinkT
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.TimeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
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

public data class IpMreqn(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrAddress: InAddr = InAddr(),
    public var imrIfindex: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMreqn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMreqn> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): IpMreqn =
                    IpMreqn(
                        (InAddr.typeLayout()).readNative(addr),
                        (InAddr.typeLayout()).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: IpMreqn) {
                    (InAddr.typeLayout()).writeNative(addr, value.imrMultiaddr)
                    (InAddr.typeLayout()).writeNative(addr + 4L, value.imrAddress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.imrIfindex)
                }
            }
    }
}

public class GlobT internal constructor(
    public var glPathc: SizeT,
    public var glMatchc: SizeT,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    glPathvCtorArg: MutPtr<MutPtr<CChar>>,
    unused1CtorArg: MutPtr<CVoid>,
    unused2CtorArg: MutPtr<CVoid>,
    unused3CtorArg: MutPtr<CVoid>,
    unused4CtorArg: MutPtr<CVoid>,
    unused5CtorArg: MutPtr<CVoid>,
    unused6CtorArg: MutPtr<CVoid>,
    unused7CtorArg: MutPtr<CVoid>,
) {
    public var glPathv: MutPtr<MutPtr<CChar>> = glPathvCtorArg
        internal set

    public var unused1: MutPtr<CVoid> = unused1CtorArg
        internal set

    public var unused2: MutPtr<CVoid> = unused2CtorArg
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

    public constructor() : this(
        glPathc = 0uL,
        glMatchc = 0uL,
        glOffs = 0uL,
        glFlags = 0,
        glPathvCtorArg = MutPtr(0L),
        unused1CtorArg = MutPtr(0L),
        unused2CtorArg = MutPtr(0L),
        unused3CtorArg = MutPtr(0L),
        unused4CtorArg = MutPtr(0L),
        unused5CtorArg = MutPtr(0L),
        unused6CtorArg = MutPtr(0L),
        unused7CtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.glPathc

    public operator fun component2(): SizeT = this.glMatchc

    public operator fun component3(): SizeT = this.glOffs

    public operator fun component4(): CInt = this.glFlags

    public operator fun component5(): MutPtr<MutPtr<CChar>> = this.glPathv

    public operator fun component6(): MutPtr<CVoid> = this.unused1

    public operator fun component7(): MutPtr<CVoid> = this.unused2

    public operator fun component8(): MutPtr<CVoid> = this.unused3

    public operator fun component9(): MutPtr<CVoid> = this.unused4

    public operator fun component10(): MutPtr<CVoid> = this.unused5

    public operator fun component11(): MutPtr<CVoid> = this.unused6

    public operator fun component12(): MutPtr<CVoid> = this.unused7

    public fun copy(glPathc: SizeT = this.glPathc, glMatchc: SizeT = this.glMatchc, glOffs: SizeT = this.glOffs, glFlags: CInt = this.glFlags, glPathv: MutPtr<MutPtr<CChar>> = this.glPathv, unused1: MutPtr<CVoid> = this.unused1, unused2: MutPtr<CVoid> = this.unused2, unused3: MutPtr<CVoid> = this.unused3, unused4: MutPtr<CVoid> = this.unused4, unused5: MutPtr<CVoid> = this.unused5, unused6: MutPtr<CVoid> = this.unused6, unused7: MutPtr<CVoid> = this.unused7): GlobT = GlobT(glPathc = glPathc, glMatchc = glMatchc, glOffs = glOffs, glFlags = glFlags, glPathvCtorArg = glPathv, unused1CtorArg = unused1, unused2CtorArg = unused2, unused3CtorArg = unused3, unused4CtorArg = unused4, unused5CtorArg = unused5, unused6CtorArg = unused6, unused7CtorArg = unused7)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GlobT) return false
        if (this.glPathc != other.glPathc) return false
        if (this.glMatchc != other.glMatchc) return false
        if (this.glOffs != other.glOffs) return false
        if (this.glFlags != other.glFlags) return false
        if (this.glPathv != other.glPathv) return false
        if (this.unused1 != other.unused1) return false
        if (this.unused2 != other.unused2) return false
        if (this.unused3 != other.unused3) return false
        if (this.unused4 != other.unused4) return false
        if (this.unused5 != other.unused5) return false
        if (this.unused6 != other.unused6) return false
        if (this.unused7 != other.unused7) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.glPathc.hashCode()
        result = 31 * result + this.glMatchc.hashCode()
        result = 31 * result + this.glOffs.hashCode()
        result = 31 * result + this.glFlags.hashCode()
        result = 31 * result + this.glPathv.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.unused3.hashCode()
        result = 31 * result + this.unused4.hashCode()
        result = 31 * result + this.unused5.hashCode()
        result = 31 * result + this.unused6.hashCode()
        result = 31 * result + this.unused7.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GlobT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
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
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 88L),
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
                    ).writeNative(addr + 40L, value.unused1)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.unused2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.unused3)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 64L, value.unused4)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 72L, value.unused5)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 80L, value.unused6)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 88L, value.unused7)
                }
            }

        public operator fun invoke(
            glPathc: SizeT = 0uL,
            glMatchc: SizeT = 0uL,
            glOffs: SizeT = 0uL,
            glFlags: CInt = 0,
            glPathv: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            unused1: MutPtr<CVoid> = MutPtr(0L),
            unused2: MutPtr<CVoid> = MutPtr(0L),
            unused3: MutPtr<CVoid> = MutPtr(0L),
            unused4: MutPtr<CVoid> = MutPtr(0L),
            unused5: MutPtr<CVoid> = MutPtr(0L),
            unused6: MutPtr<CVoid> = MutPtr(0L),
            unused7: MutPtr<CVoid> = MutPtr(0L),
        ): GlobT =
            GlobT(
                glPathc = glPathc,
                glMatchc = glMatchc,
                glOffs = glOffs,
                glFlags = glFlags,
                glPathvCtorArg = glPathv,
                unused1CtorArg = unused1,
                unused2CtorArg = unused2,
                unused3CtorArg = unused3,
                unused4CtorArg = unused4,
                unused5CtorArg = unused5,
                unused6CtorArg = unused6,
                unused7CtorArg = unused7,
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
    public var intPSepBySpace: CChar,
    public var intNCsPrecedes: CChar,
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
        intPSepBySpace = 0u,
        intNCsPrecedes = 0u,
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 89L, value.intPSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 90L, value.intNCsPrecedes)
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
            intPSepBySpace: CChar = 0u,
            intNCsPrecedes: CChar = 0u,
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
                intPSepBySpace = intPSepBySpace,
                intNCsPrecedes = intNCsPrecedes,
                intNSepBySpace = intNSepBySpace,
                intPSignPosn = intPSignPosn,
                intNSignPosn = intNSignPosn,
            )
    }
}

public class UfsArgs internal constructor(
    fspecCtorArg: MutPtr<CChar>,
    public var exportInfo: ExportArgs,
) {
    public var fspec: MutPtr<CChar> = fspecCtorArg
        internal set

    public constructor() : this(
        fspecCtorArg = MutPtr(0L),
        exportInfo = ExportArgs(),
    )

    public operator fun component1(): MutPtr<CChar> = this.fspec

    public operator fun component2(): ExportArgs = this.exportInfo

    public fun copy(fspec: MutPtr<CChar> = this.fspec, exportInfo: ExportArgs = this.exportInfo): UfsArgs = UfsArgs(fspecCtorArg = fspec, exportInfo = exportInfo)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UfsArgs) return false
        if (this.fspec != other.fspec) return false
        if (this.exportInfo != other.exportInfo) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fspec.hashCode()
        result = 31 * result + this.exportInfo.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UfsArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UfsArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 88L
                override fun readNative(addr: Long): UfsArgs =
                    UfsArgs(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (ExportArgs.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UfsArgs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.fspec)
                    (ExportArgs.typeLayout()).writeNative(addr + 8L, value.exportInfo)
                }
            }

        public operator fun invoke(
            fspec: MutPtr<CChar> = MutPtr(0L),
            exportInfo: ExportArgs = ExportArgs(),
        ): UfsArgs =
            UfsArgs(
                fspecCtorArg = fspec,
                exportInfo = exportInfo,
            )
    }
}

public class MfsArgs internal constructor(
    fspecCtorArg: MutPtr<CChar>,
    public var exportInfo: ExportArgs,
    baseCtorArg: MutPtr<CChar>,
    public var size: CUlong,
) {
    public var fspec: MutPtr<CChar> = fspecCtorArg
        internal set

    // https://github.com/openbsd/src/blob/HEAD/sys/sys/types.h#L134
    public var base: MutPtr<CChar> = baseCtorArg
        internal set

    public constructor() : this(
        fspecCtorArg = MutPtr(0L),
        exportInfo = ExportArgs(),
        baseCtorArg = MutPtr(0L),
        size = 0uL,
    )

    public operator fun component1(): MutPtr<CChar> = this.fspec

    public operator fun component2(): ExportArgs = this.exportInfo

    public operator fun component3(): MutPtr<CChar> = this.base

    public operator fun component4(): CUlong = this.size

    public fun copy(fspec: MutPtr<CChar> = this.fspec, exportInfo: ExportArgs = this.exportInfo, base: MutPtr<CChar> = this.base, size: CUlong = this.size): MfsArgs = MfsArgs(fspecCtorArg = fspec, exportInfo = exportInfo, baseCtorArg = base, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MfsArgs) return false
        if (this.fspec != other.fspec) return false
        if (this.exportInfo != other.exportInfo) return false
        if (this.base != other.base) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fspec.hashCode()
        result = 31 * result + this.exportInfo.hashCode()
        result = 31 * result + this.base.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MfsArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MfsArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): MfsArgs =
                    MfsArgs(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (ExportArgs.typeLayout()).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: MfsArgs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.fspec)
                    (ExportArgs.typeLayout()).writeNative(addr + 8L, value.exportInfo)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 88L, value.base)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.size)
                }
            }

        public operator fun invoke(
            fspec: MutPtr<CChar> = MutPtr(0L),
            exportInfo: ExportArgs = ExportArgs(),
            base: MutPtr<CChar> = MutPtr(0L),
            size: CUlong = 0uL,
        ): MfsArgs =
            MfsArgs(
                fspecCtorArg = fspec,
                exportInfo = exportInfo,
                baseCtorArg = base,
                size = size,
            )
    }
}

public class IsoArgs internal constructor(
    fspecCtorArg: MutPtr<CChar>,
    public var exportInfo: ExportArgs,
    public var flags: CInt,
    public var sess: CInt,
) {
    public var fspec: MutPtr<CChar> = fspecCtorArg
        internal set

    public constructor() : this(
        fspecCtorArg = MutPtr(0L),
        exportInfo = ExportArgs(),
        flags = 0,
        sess = 0,
    )

    public operator fun component1(): MutPtr<CChar> = this.fspec

    public operator fun component2(): ExportArgs = this.exportInfo

    public operator fun component3(): CInt = this.flags

    public operator fun component4(): CInt = this.sess

    public fun copy(fspec: MutPtr<CChar> = this.fspec, exportInfo: ExportArgs = this.exportInfo, flags: CInt = this.flags, sess: CInt = this.sess): IsoArgs = IsoArgs(fspecCtorArg = fspec, exportInfo = exportInfo, flags = flags, sess = sess)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IsoArgs) return false
        if (this.fspec != other.fspec) return false
        if (this.exportInfo != other.exportInfo) return false
        if (this.flags != other.flags) return false
        if (this.sess != other.sess) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fspec.hashCode()
        result = 31 * result + this.exportInfo.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.sess.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IsoArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IsoArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): IsoArgs =
                    IsoArgs(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (ExportArgs.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 92L),
                    )
                override fun writeNative(addr: Long, value: IsoArgs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.fspec)
                    (ExportArgs.typeLayout()).writeNative(addr + 8L, value.exportInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 88L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 92L, value.sess)
                }
            }

        public operator fun invoke(
            fspec: MutPtr<CChar> = MutPtr(0L),
            exportInfo: ExportArgs = ExportArgs(),
            flags: CInt = 0,
            sess: CInt = 0,
        ): IsoArgs =
            IsoArgs(
                fspecCtorArg = fspec,
                exportInfo = exportInfo,
                flags = flags,
                sess = sess,
            )
    }
}

public class NfsArgs internal constructor(
    public var version: CInt,
    addrCtorArg: MutPtr<Sockaddr>,
    public var addrlen: CInt,
    public var sotype: CInt,
    public var proto: CInt,
    fhCtorArg: MutPtr<CUchar>,
    public var fhsize: CInt,
    public var flags: CInt,
    public var wsize: CInt,
    public var rsize: CInt,
    public var readdirsize: CInt,
    public var timeo: CInt,
    public var retrans: CInt,
    public var maxgrouplist: CInt,
    public var readahead: CInt,
    public var leaseterm: CInt,
    public var deadthresh: CInt,
    hostnameCtorArg: MutPtr<CChar>,
    public var acregmin: CInt,
    public var acregmax: CInt,
    public var acdirmin: CInt,
    public var acdirmax: CInt,
) {
    public var addr: MutPtr<Sockaddr> = addrCtorArg
        internal set

    public var fh: MutPtr<CUchar> = fhCtorArg
        internal set

    public var hostname: MutPtr<CChar> = hostnameCtorArg
        internal set

    public constructor() : this(
        version = 0,
        addrCtorArg = MutPtr(0L),
        addrlen = 0,
        sotype = 0,
        proto = 0,
        fhCtorArg = MutPtr(0L),
        fhsize = 0,
        flags = 0,
        wsize = 0,
        rsize = 0,
        readdirsize = 0,
        timeo = 0,
        retrans = 0,
        maxgrouplist = 0,
        readahead = 0,
        leaseterm = 0,
        deadthresh = 0,
        hostnameCtorArg = MutPtr(0L),
        acregmin = 0,
        acregmax = 0,
        acdirmin = 0,
        acdirmax = 0,
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfsArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NfsArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 112L
                override fun readNative(addr: Long): NfsArgs =
                    NfsArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CUchar>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 76L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 108L),
                    )
                override fun writeNative(addr: Long, value: NfsArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 8L, value.addr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.addrlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.sotype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.proto)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CUchar>(64)
                    ).writeNative(addr + 32L, value.fh)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.fhsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.wsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.rsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.readdirsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.timeo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.retrans)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.maxgrouplist)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.readahead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 76L, value.leaseterm)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 80L, value.deadthresh)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 88L, value.hostname)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.acregmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 100L, value.acregmax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 104L, value.acdirmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 108L, value.acdirmax)
                }
            }

        public operator fun invoke(
            version: CInt = 0,
            addr: MutPtr<Sockaddr> = MutPtr(0L),
            addrlen: CInt = 0,
            sotype: CInt = 0,
            proto: CInt = 0,
            fh: MutPtr<CUchar> = MutPtr(0L),
            fhsize: CInt = 0,
            flags: CInt = 0,
            wsize: CInt = 0,
            rsize: CInt = 0,
            readdirsize: CInt = 0,
            timeo: CInt = 0,
            retrans: CInt = 0,
            maxgrouplist: CInt = 0,
            readahead: CInt = 0,
            leaseterm: CInt = 0,
            deadthresh: CInt = 0,
            hostname: MutPtr<CChar> = MutPtr(0L),
            acregmin: CInt = 0,
            acregmax: CInt = 0,
            acdirmin: CInt = 0,
            acdirmax: CInt = 0,
        ): NfsArgs =
            NfsArgs(
                version = version,
                addrCtorArg = addr,
                addrlen = addrlen,
                sotype = sotype,
                proto = proto,
                fhCtorArg = fh,
                fhsize = fhsize,
                flags = flags,
                wsize = wsize,
                rsize = rsize,
                readdirsize = readdirsize,
                timeo = timeo,
                retrans = retrans,
                maxgrouplist = maxgrouplist,
                readahead = readahead,
                leaseterm = leaseterm,
                deadthresh = deadthresh,
                hostnameCtorArg = hostname,
                acregmin = acregmin,
                acregmax = acregmax,
                acdirmin = acdirmin,
                acdirmax = acdirmax,
            )
    }
}

public class MsdosfsArgs internal constructor(
    fspecCtorArg: MutPtr<CChar>,
    public var exportInfo: ExportArgs,
    public var uid: UidT,
    public var gid: GidT,
    public var mask: ModeT,
    public var flags: CInt,
) {
    public var fspec: MutPtr<CChar> = fspecCtorArg
        internal set

    public constructor() : this(
        fspecCtorArg = MutPtr(0L),
        exportInfo = ExportArgs(),
        uid = 0u,
        gid = 0u,
        mask = 0u,
        flags = 0,
    )

    public operator fun component1(): MutPtr<CChar> = this.fspec

    public operator fun component2(): ExportArgs = this.exportInfo

    public operator fun component3(): UidT = this.uid

    public operator fun component4(): GidT = this.gid

    public operator fun component5(): ModeT = this.mask

    public operator fun component6(): CInt = this.flags

    public fun copy(fspec: MutPtr<CChar> = this.fspec, exportInfo: ExportArgs = this.exportInfo, uid: UidT = this.uid, gid: GidT = this.gid, mask: ModeT = this.mask, flags: CInt = this.flags): MsdosfsArgs = MsdosfsArgs(fspecCtorArg = fspec, exportInfo = exportInfo, uid = uid, gid = gid, mask = mask, flags = flags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MsdosfsArgs) return false
        if (this.fspec != other.fspec) return false
        if (this.exportInfo != other.exportInfo) return false
        if (this.uid != other.uid) return false
        if (this.gid != other.gid) return false
        if (this.mask != other.mask) return false
        if (this.flags != other.flags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fspec.hashCode()
        result = 31 * result + this.exportInfo.hashCode()
        result = 31 * result + this.uid.hashCode()
        result = 31 * result + this.gid.hashCode()
        result = 31 * result + this.mask.hashCode()
        result = 31 * result + this.flags.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsdosfsArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsdosfsArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): MsdosfsArgs =
                    MsdosfsArgs(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (ExportArgs.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 90L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: MsdosfsArgs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.fspec)
                    (ExportArgs.typeLayout()).writeNative(addr + 8L, value.exportInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 88L, value.uid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 90L, value.gid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.flags)
                }
            }

        public operator fun invoke(
            fspec: MutPtr<CChar> = MutPtr(0L),
            exportInfo: ExportArgs = ExportArgs(),
            uid: UidT = 0u,
            gid: GidT = 0u,
            mask: ModeT = 0u,
            flags: CInt = 0,
        ): MsdosfsArgs =
            MsdosfsArgs(
                fspecCtorArg = fspec,
                exportInfo = exportInfo,
                uid = uid,
                gid = gid,
                mask = mask,
                flags = flags,
            )
    }
}

public class NtfsArgs internal constructor(
    fspecCtorArg: MutPtr<CChar>,
    public var exportInfo: ExportArgs,
    public var uid: UidT,
    public var gid: GidT,
    public var mode: ModeT,
    public var flag: CUlong,
) {
    public var fspec: MutPtr<CChar> = fspecCtorArg
        internal set

    public constructor() : this(
        fspecCtorArg = MutPtr(0L),
        exportInfo = ExportArgs(),
        uid = 0u,
        gid = 0u,
        mode = 0u,
        flag = 0uL,
    )

    public operator fun component1(): MutPtr<CChar> = this.fspec

    public operator fun component2(): ExportArgs = this.exportInfo

    public operator fun component3(): UidT = this.uid

    public operator fun component4(): GidT = this.gid

    public operator fun component5(): ModeT = this.mode

    public operator fun component6(): CUlong = this.flag

    public fun copy(fspec: MutPtr<CChar> = this.fspec, exportInfo: ExportArgs = this.exportInfo, uid: UidT = this.uid, gid: GidT = this.gid, mode: ModeT = this.mode, flag: CUlong = this.flag): NtfsArgs = NtfsArgs(fspecCtorArg = fspec, exportInfo = exportInfo, uid = uid, gid = gid, mode = mode, flag = flag)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is NtfsArgs) return false
        if (this.fspec != other.fspec) return false
        if (this.exportInfo != other.exportInfo) return false
        if (this.uid != other.uid) return false
        if (this.gid != other.gid) return false
        if (this.mode != other.mode) return false
        if (this.flag != other.flag) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fspec.hashCode()
        result = 31 * result + this.exportInfo.hashCode()
        result = 31 * result + this.uid.hashCode()
        result = 31 * result + this.gid.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.flag.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NtfsArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): NtfsArgs =
                    NtfsArgs(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (ExportArgs.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 90L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                    )
                override fun writeNative(addr: Long, value: NtfsArgs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.fspec)
                    (ExportArgs.typeLayout()).writeNative(addr + 8L, value.exportInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 88L, value.uid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 90L, value.gid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 92L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.flag)
                }
            }

        public operator fun invoke(
            fspec: MutPtr<CChar> = MutPtr(0L),
            exportInfo: ExportArgs = ExportArgs(),
            uid: UidT = 0u,
            gid: GidT = 0u,
            mode: ModeT = 0u,
            flag: CUlong = 0uL,
        ): NtfsArgs =
            NtfsArgs(
                fspecCtorArg = fspec,
                exportInfo = exportInfo,
                uid = uid,
                gid = gid,
                mode = mode,
                flag = flag,
            )
    }
}

public class UdfArgs internal constructor(
    fspecCtorArg: MutPtr<CChar>,
    public var lastblock: UInt,
) {
    public var fspec: MutPtr<CChar> = fspecCtorArg
        internal set

    public constructor() : this(
        fspecCtorArg = MutPtr(0L),
        lastblock = 0u,
    )

    public operator fun component1(): MutPtr<CChar> = this.fspec

    public operator fun component2(): UInt = this.lastblock

    public fun copy(fspec: MutPtr<CChar> = this.fspec, lastblock: UInt = this.lastblock): UdfArgs = UdfArgs(fspecCtorArg = fspec, lastblock = lastblock)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UdfArgs) return false
        if (this.fspec != other.fspec) return false
        if (this.lastblock != other.lastblock) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fspec.hashCode()
        result = 31 * result + this.lastblock.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UdfArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UdfArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): UdfArgs =
                    UdfArgs(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UdfArgs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.fspec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.lastblock)
                }
            }

        public operator fun invoke(
            fspec: MutPtr<CChar> = MutPtr(0L),
            lastblock: UInt = 0u,
        ): UdfArgs =
            UdfArgs(
                fspecCtorArg = fspec,
                lastblock = lastblock,
            )
    }
}

public data class TmpfsArgs(
    public var taVersion: CInt = 0,
    public var taNodesMax: InoT = 0uL,
    public var taSizeMax: OffT = 0L,
    public var taRootUid: UidT = 0u,
    public var taRootGid: GidT = 0u,
    public var taRootMode: ModeT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TmpfsArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TmpfsArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): TmpfsArgs =
                    TmpfsArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: TmpfsArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.taVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.taNodesMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.taSizeMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.taRootUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 26L, value.taRootGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.taRootMode)
                }
            }
    }
}

public class FusefsArgs internal constructor(
    nameCtorArg: MutPtr<CChar>,
    public var fd: CInt,
    public var maxRead: CInt,
    public var allowOther: CInt,
) {
    public var name: MutPtr<CChar> = nameCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = MutPtr(0L),
        fd = 0,
        maxRead = 0,
        allowOther = 0,
    )

    public operator fun component1(): MutPtr<CChar> = this.name

    public operator fun component2(): CInt = this.fd

    public operator fun component3(): CInt = this.maxRead

    public operator fun component4(): CInt = this.allowOther

    public fun copy(name: MutPtr<CChar> = this.name, fd: CInt = this.fd, maxRead: CInt = this.maxRead, allowOther: CInt = this.allowOther): FusefsArgs = FusefsArgs(nameCtorArg = name, fd = fd, maxRead = maxRead, allowOther = allowOther)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FusefsArgs) return false
        if (this.name != other.name) return false
        if (this.fd != other.fd) return false
        if (this.maxRead != other.maxRead) return false
        if (this.allowOther != other.allowOther) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.fd.hashCode()
        result = 31 * result + this.maxRead.hashCode()
        result = 31 * result + this.allowOther.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FusefsArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FusefsArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): FusefsArgs =
                    FusefsArgs(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: FusefsArgs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.fd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.maxRead)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.allowOther)
                }
            }

        public operator fun invoke(
            name: MutPtr<CChar> = MutPtr(0L),
            fd: CInt = 0,
            maxRead: CInt = 0,
            allowOther: CInt = 0,
        ): FusefsArgs =
            FusefsArgs(
                nameCtorArg = name,
                fd = fd,
                maxRead = maxRead,
                allowOther = allowOther,
            )
    }
}

public data class Xucred(
    public var crUid: UidT = 0u,
    public var crGid: GidT = 0u,
    public var crNgroups: CShort = 0,
    // https://github.com/openbsd/src/blob/HEAD/sys/sys/syslimits.h#L44
    public var crGroups: UShortArray = UShortArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Xucred) return false
        if (this.crUid != other.crUid) return false
        if (this.crGid != other.crGid) return false
        if (this.crNgroups != other.crNgroups) return false
        if (!this.crGroups.contentEquals(other.crGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.crUid.hashCode()
        result = 31 * result + this.crGid.hashCode()
        result = 31 * result + this.crNgroups.hashCode()
        result = 31 * result + this.crGroups.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xucred> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Xucred> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 38L
                override fun readNative(addr: Long): Xucred =
                    Xucred(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                        ).readNative(addr + 6L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Xucred) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.crUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.crGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.crNgroups)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (16).toInt())
                    ).writeNative(addr + 6L, value.crGroups.toList())
                }
            }
    }
}

public class ExportArgs internal constructor(
    public var exFlags: CInt,
    public var exRoot: UidT,
    public var exAnon: Xucred,
    exAddrCtorArg: MutPtr<Sockaddr>,
    public var exAddrlen: CInt,
    exMaskCtorArg: MutPtr<Sockaddr>,
    public var exMasklen: CInt,
) {
    public var exAddr: MutPtr<Sockaddr> = exAddrCtorArg
        internal set

    public var exMask: MutPtr<Sockaddr> = exMaskCtorArg
        internal set

    public constructor() : this(
        exFlags = 0,
        exRoot = 0u,
        exAnon = Xucred(),
        exAddrCtorArg = MutPtr(0L),
        exAddrlen = 0,
        exMaskCtorArg = MutPtr(0L),
        exMasklen = 0,
    )

    public operator fun component1(): CInt = this.exFlags

    public operator fun component2(): UidT = this.exRoot

    public operator fun component3(): Xucred = this.exAnon

    public operator fun component4(): MutPtr<Sockaddr> = this.exAddr

    public operator fun component5(): CInt = this.exAddrlen

    public operator fun component6(): MutPtr<Sockaddr> = this.exMask

    public operator fun component7(): CInt = this.exMasklen

    public fun copy(exFlags: CInt = this.exFlags, exRoot: UidT = this.exRoot, exAnon: Xucred = this.exAnon, exAddr: MutPtr<Sockaddr> = this.exAddr, exAddrlen: CInt = this.exAddrlen, exMask: MutPtr<Sockaddr> = this.exMask, exMasklen: CInt = this.exMasklen): ExportArgs = ExportArgs(exFlags = exFlags, exRoot = exRoot, exAnon = exAnon, exAddrCtorArg = exAddr, exAddrlen = exAddrlen, exMaskCtorArg = exMask, exMasklen = exMasklen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ExportArgs) return false
        if (this.exFlags != other.exFlags) return false
        if (this.exRoot != other.exRoot) return false
        if (this.exAnon != other.exAnon) return false
        if (this.exAddr != other.exAddr) return false
        if (this.exAddrlen != other.exAddrlen) return false
        if (this.exMask != other.exMask) return false
        if (this.exMasklen != other.exMasklen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.exFlags.hashCode()
        result = 31 * result + this.exRoot.hashCode()
        result = 31 * result + this.exAnon.hashCode()
        result = 31 * result + this.exAddr.hashCode()
        result = 31 * result + this.exAddrlen.hashCode()
        result = 31 * result + this.exMask.hashCode()
        result = 31 * result + this.exMasklen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExportArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ExportArgs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): ExportArgs =
                    ExportArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (Xucred.typeLayout()).readNative(addr + 6L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: ExportArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.exFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.exRoot)
                    (Xucred.typeLayout()).writeNative(addr + 6L, value.exAnon)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 48L, value.exAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.exAddrlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 64L, value.exMask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.exMasklen)
                }
            }

        public operator fun invoke(
            exFlags: CInt = 0,
            exRoot: UidT = 0u,
            exAnon: Xucred = Xucred(),
            exAddr: MutPtr<Sockaddr> = MutPtr(0L),
            exAddrlen: CInt = 0,
            exMask: MutPtr<Sockaddr> = MutPtr(0L),
            exMasklen: CInt = 0,
        ): ExportArgs =
            ExportArgs(
                exFlags = exFlags,
                exRoot = exRoot,
                exAnon = exAnon,
                exAddrCtorArg = exAddr,
                exAddrlen = exAddrlen,
                exMaskCtorArg = exMask,
                exMasklen = exMasklen,
            )
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

public data class Splice(
    public var spFd: CInt = 0,
    public var spMax: OffT = 0L,
    public var spIdle: Timeval = Timeval(),
)

public class Kevent internal constructor(
    public var ident: UintptrT,
    public var filter: CShort,
    public var flags: CUshort,
    public var fflags: CUint,
    public var data: Long,
    udataCtorArg: MutPtr<CVoid>,
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
    )

    public operator fun component1(): UintptrT = this.ident

    public operator fun component2(): CShort = this.filter

    public operator fun component3(): CUshort = this.flags

    public operator fun component4(): CUint = this.fflags

    public operator fun component5(): Long = this.data

    public operator fun component6(): MutPtr<CVoid> = this.udata

    public fun copy(ident: UintptrT = this.ident, filter: CShort = this.filter, flags: CUshort = this.flags, fflags: CUint = this.fflags, data: Long = this.data, udata: MutPtr<CVoid> = this.udata): Kevent = Kevent(ident = ident, filter = filter, flags = flags, fflags = fflags, data = data, udataCtorArg = udata)

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
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Kevent =
                    Kevent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Kevent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.ident)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 8L, value.filter)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.fflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.data)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.udata)
                }
            }

        public operator fun invoke(
            ident: UintptrT = 0uL,
            filter: CShort = 0,
            flags: CUshort = 0u,
            fflags: CUint = 0u,
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

public class Stat(
    public var stMode: ModeT = 0u,
    public var stDev: DevT = 0,
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stRdev: DevT = 0,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stSize: OffT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stBlksize: BlksizeT = 0,
    public var stFlags: UInt = 0u,
    public var stGen: UInt = 0u,
    public var stBirthtime: TimeT = 0L,
    public var stBirthtimeNsec: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 100L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.stAtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.stMtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 72L, value.stCtimeNsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 80L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.stBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 100L, value.stFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.stGen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.stBirthtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.stBirthtimeNsec)
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

public class Addrinfo internal constructor(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiCanonnameCtorArg: MutPtr<CChar>,
    aiNextCtorArg: MutPtr<Addrinfo>,
) {
    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiCanonname: MutPtr<CChar> = aiCanonnameCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfo> = aiNextCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0u,
        aiAddrCtorArg = MutPtr(0L),
        aiCanonnameCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.aiFlags

    public operator fun component2(): CInt = this.aiFamily

    public operator fun component3(): CInt = this.aiSocktype

    public operator fun component4(): CInt = this.aiProtocol

    public operator fun component5(): SocklenT = this.aiAddrlen

    public operator fun component6(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component7(): MutPtr<CChar> = this.aiCanonname

    public operator fun component8(): MutPtr<Addrinfo> = this.aiNext

    public fun copy(aiFlags: CInt = this.aiFlags, aiFamily: CInt = this.aiFamily, aiSocktype: CInt = this.aiSocktype, aiProtocol: CInt = this.aiProtocol, aiAddrlen: SocklenT = this.aiAddrlen, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiCanonname: MutPtr<CChar> = this.aiCanonname, aiNext: MutPtr<Addrinfo> = this.aiNext): Addrinfo = Addrinfo(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiAddrCtorArg = aiAddr, aiCanonnameCtorArg = aiCanonname, aiNextCtorArg = aiNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfo) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiNext != other.aiNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
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
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
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
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 24L, value.aiAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 32L, value.aiCanonname)
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
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiCanonname: MutPtr<CChar> = MutPtr(0L),
            aiNext: MutPtr<Addrinfo> = MutPtr(0L),
        ): Addrinfo =
            Addrinfo(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiAddrCtorArg = aiAddr,
                aiCanonnameCtorArg = aiCanonname,
                aiNextCtorArg = aiNext,
            )
    }
}

public class DlInfo internal constructor(
    dliFnameCtorArg: ConstPtr<CChar>,
    dliFbaseCtorArg: MutPtr<CVoid>,
    dliSnameCtorArg: ConstPtr<CChar>,
    dliSaddrCtorArg: MutPtr<CVoid>,
) {
    public var dliFname: ConstPtr<CChar> = dliFnameCtorArg
        internal set

    public var dliFbase: MutPtr<CVoid> = dliFbaseCtorArg
        internal set

    public var dliSname: ConstPtr<CChar> = dliSnameCtorArg
        internal set

    public var dliSaddr: MutPtr<CVoid> = dliSaddrCtorArg
        internal set

    public constructor() : this(
        dliFnameCtorArg = ConstPtr(0L),
        dliFbaseCtorArg = MutPtr(0L),
        dliSnameCtorArg = ConstPtr(0L),
        dliSaddrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): ConstPtr<CChar> = this.dliFname

    public operator fun component2(): MutPtr<CVoid> = this.dliFbase

    public operator fun component3(): ConstPtr<CChar> = this.dliSname

    public operator fun component4(): MutPtr<CVoid> = this.dliSaddr

    public fun copy(dliFname: ConstPtr<CChar> = this.dliFname, dliFbase: MutPtr<CVoid> = this.dliFbase, dliSname: ConstPtr<CChar> = this.dliSname, dliSaddr: MutPtr<CVoid> = this.dliSaddr): DlInfo = DlInfo(dliFnameCtorArg = dliFname, dliFbaseCtorArg = dliFbase, dliSnameCtorArg = dliSname, dliSaddrCtorArg = dliSaddr)

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
                                .mutPtrLayout<CVoid>(64)
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
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.dliSaddr)
                }
            }

        public operator fun invoke(
            dliFname: ConstPtr<CChar> = ConstPtr(0L),
            dliFbase: MutPtr<CVoid> = MutPtr(0L),
            dliSname: ConstPtr<CChar> = ConstPtr(0L),
            dliSaddr: MutPtr<CVoid> = MutPtr(0L),
        ): DlInfo =
            DlInfo(
                dliFnameCtorArg = dliFname,
                dliFbaseCtorArg = dliFbase,
                dliSnameCtorArg = dliSname,
                dliSaddrCtorArg = dliSaddr,
            )
    }
}

public class IfData(
    public var ifiType: CUchar = 0u,
    public var ifiAddrlen: CUchar = 0u,
    public var ifiHdrlen: CUchar = 0u,
    public var ifiLinkState: CUchar = 0u,
    public var ifiMtu: UInt = 0u,
    public var ifiMetric: UInt = 0u,
    public var ifiRdomain: UInt = 0u,
    public var ifiBaudrate: ULong = 0uL,
    public var ifiIpackets: ULong = 0uL,
    public var ifiIerrors: ULong = 0uL,
    public var ifiOpackets: ULong = 0uL,
    public var ifiOerrors: ULong = 0uL,
    public var ifiCollisions: ULong = 0uL,
    public var ifiIbytes: ULong = 0uL,
    public var ifiObytes: ULong = 0uL,
    public var ifiImcasts: ULong = 0uL,
    public var ifiOmcasts: ULong = 0uL,
    public var ifiIqdrops: ULong = 0uL,
    public var ifiOqdrops: ULong = 0uL,
    public var ifiNoproto: ULong = 0uL,
    public var ifiCapabilities: UInt = 0u,
    public var ifiLastchange: Timeval = Timeval(),
)

public data class IfMsghdr(
    public var ifmMsglen: CUshort = 0u,
    public var ifmVersion: CUchar = 0u,
    public var ifmType: CUchar = 0u,
    public var ifmHdrlen: CUshort = 0u,
    public var ifmIndex: CUshort = 0u,
    public var ifmTableid: CUshort = 0u,
    public var ifmPad1: CUchar = 0u,
    public var ifmPad2: CUchar = 0u,
    public var ifmAddrs: CInt = 0,
    public var ifmFlags: CInt = 0,
    public var ifmXflags: CInt = 0,
    public var ifmData: IfData = IfData(),
)

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: CUchar = 0u,
    public var sdlIndex: CUshort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
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

public data class Sockpeercred(
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var pid: PidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockpeercred> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockpeercred> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Sockpeercred =
                    Sockpeercred(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Sockpeercred) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.uid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.gid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.pid)
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

public class ShmidDs internal constructor(
    public var shmPerm: IpcPerm,
    public var shmSegsz: CInt,
    public var shmLpid: PidT,
    public var shmCpid: PidT,
    public var shmNattch: CShort,
    public var shmAtime: TimeT,
    public var shmAtimensec: CLong,
    public var shmDtime: TimeT,
    public var shmDtimensec: CLong,
    public var shmCtime: TimeT,
    public var shmCtimensec: CLong,
    shmInternalCtorArg: MutPtr<CVoid>,
) {
    public var shmInternal: MutPtr<CVoid> = shmInternalCtorArg
        internal set

    public constructor() : this(
        shmPerm = IpcPerm(),
        shmSegsz = 0,
        shmLpid = 0,
        shmCpid = 0,
        shmNattch = 0,
        shmAtime = 0L,
        shmAtimensec = 0L,
        shmDtime = 0L,
        shmDtimensec = 0L,
        shmCtime = 0L,
        shmCtimensec = 0L,
        shmInternalCtorArg = MutPtr(0L),
    )

    public operator fun component1(): IpcPerm = this.shmPerm

    public operator fun component2(): CInt = this.shmSegsz

    public operator fun component3(): PidT = this.shmLpid

    public operator fun component4(): PidT = this.shmCpid

    public operator fun component5(): CShort = this.shmNattch

    public operator fun component6(): TimeT = this.shmAtime

    public operator fun component7(): CLong = this.shmAtimensec

    public operator fun component8(): TimeT = this.shmDtime

    public operator fun component9(): CLong = this.shmDtimensec

    public operator fun component10(): TimeT = this.shmCtime

    public operator fun component11(): CLong = this.shmCtimensec

    public operator fun component12(): MutPtr<CVoid> = this.shmInternal

    public fun copy(shmPerm: IpcPerm = this.shmPerm, shmSegsz: CInt = this.shmSegsz, shmLpid: PidT = this.shmLpid, shmCpid: PidT = this.shmCpid, shmNattch: CShort = this.shmNattch, shmAtime: TimeT = this.shmAtime, shmAtimensec: CLong = this.shmAtimensec, shmDtime: TimeT = this.shmDtime, shmDtimensec: CLong = this.shmDtimensec, shmCtime: TimeT = this.shmCtime, shmCtimensec: CLong = this.shmCtimensec, shmInternal: MutPtr<CVoid> = this.shmInternal): ShmidDs = ShmidDs(shmPerm = shmPerm, shmSegsz = shmSegsz, shmLpid = shmLpid, shmCpid = shmCpid, shmNattch = shmNattch, shmAtime = shmAtime, shmAtimensec = shmAtimensec, shmDtime = shmDtime, shmDtimensec = shmDtimensec, shmCtime = shmCtime, shmCtimensec = shmCtimensec, shmInternalCtorArg = shmInternal)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ShmidDs) return false
        if (this.shmPerm != other.shmPerm) return false
        if (this.shmSegsz != other.shmSegsz) return false
        if (this.shmLpid != other.shmLpid) return false
        if (this.shmCpid != other.shmCpid) return false
        if (this.shmNattch != other.shmNattch) return false
        if (this.shmAtime != other.shmAtime) return false
        if (this.shmAtimensec != other.shmAtimensec) return false
        if (this.shmDtime != other.shmDtime) return false
        if (this.shmDtimensec != other.shmDtimensec) return false
        if (this.shmCtime != other.shmCtime) return false
        if (this.shmCtimensec != other.shmCtimensec) return false
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
        result = 31 * result + this.shmAtimensec.hashCode()
        result = 31 * result + this.shmDtime.hashCode()
        result = 31 * result + this.shmDtimensec.hashCode()
        result = 31 * result + this.shmCtime.hashCode()
        result = 31 * result + this.shmCtimensec.hashCode()
        result = 31 * result + this.shmInternal.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            shmPerm: IpcPerm = IpcPerm(),
            shmSegsz: CInt = 0,
            shmLpid: PidT = 0,
            shmCpid: PidT = 0,
            shmNattch: CShort = 0,
            shmAtime: TimeT = 0L,
            shmAtimensec: CLong = 0L,
            shmDtime: TimeT = 0L,
            shmDtimensec: CLong = 0L,
            shmCtime: TimeT = 0L,
            shmCtimensec: CLong = 0L,
            shmInternal: MutPtr<CVoid> = MutPtr(0L),
        ): ShmidDs =
            ShmidDs(
                shmPerm = shmPerm,
                shmSegsz = shmSegsz,
                shmLpid = shmLpid,
                shmCpid = shmCpid,
                shmNattch = shmNattch,
                shmAtime = shmAtime,
                shmAtimensec = shmAtimensec,
                shmDtime = shmDtime,
                shmDtimensec = shmDtimensec,
                shmCtime = shmCtime,
                shmCtimensec = shmCtimensec,
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

// link.h
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
        dlpiAddr = 0u,
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
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlPhdrInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DlPhdrInfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
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
                }
            }

        public operator fun invoke(
            dlpiAddr: ElfAddr = 0u,
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

// sys/sysctl.h
public class KinfoProc {
    public var pForw: ULong = 0uL

    public var pBack: ULong = 0uL

    public var pPaddr: ULong = 0uL

    public var pAddr: ULong = 0uL

    public var pFd: ULong = 0uL

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

    public var pSiglist: Int = 0

    public var pSigmask: UInt = 0u

    public var pSigignore: UInt = 0u

    public var pSigcatch: UInt = 0u

    public var pStat: Byte = 0

    public var pPriority: UByte = 0u

    public var pUsrpri: UByte = 0u

    public var pNice: UByte = 0u

    public var pXstat: UShort = 0u

    public var pSpare: UShort = 0u

    public var pComm: UByteArray = UByteArray(KI_MAXCOMLEN)

    public var pWmesg: UByteArray = UByteArray(KI_WMESGLEN)

    public var pWchan: ULong = 0uL

    public var pLogin: UByteArray = UByteArray(KI_MAXLOGNAME)

    public var pVmRssize: Int = 0

    public var pVmTsize: Int = 0

    public var pVmDsize: Int = 0

    public var pVmSsize: Int = 0

    public var pUvalid: Long = 0L

    public var pUstartSec: ULong = 0uL

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

    public var pPsflags: UInt = 0u

    public var pAcflag: UInt = 0u

    public var pSvuid: UInt = 0u

    public var pSvgid: UInt = 0u

    public var pEmul: UByteArray = UByteArray(KI_EMULNAMELEN)

    public var pRlimRssCur: ULong = 0uL

    public var pCpuid: ULong = 0uL

    public var pVmMapSize: ULong = 0uL

    public var pTid: Int = 0

    public var pRtableid: UInt = 0u

    public var pPledge: ULong = 0uL

    public var pName: UByteArray = UByteArray(KI_MAXCOMLEN)

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoProc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoProc> {
                override val alignBytes: Long = 8L
                private val off25: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((144L + ((KI_NGROUPS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes)), 2L)
                private val off26: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off25 + 2L), 2L)
                private val off27: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off26 + 2L), 4L)
                private val off28: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off27 + 4L), 4L)
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
                        .alignUpBytes((off35 + 4L), 8L)
                private val off37: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off36 + 8L), 8L)
                private val off38: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off37 + 8L), 8L)
                private val off39: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off38 + 8L), 8L)
                private val off40: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off39 + 8L), 4L)
                private val off41: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off40 + 4L), 4L)
                private val off42: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off41 + 4L), 4L)
                private val off43: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off42 + 4L), 4L)
                private val off44: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off43 + 4L), 4L)
                private val off45: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off44 + 4L), 4L)
                private val off46: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off45 + 4L), 1L)
                private val off47: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off46 + 1L), 1L)
                private val off48: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off47 + 1L), 1L)
                private val off49: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off48 + 1L), 1L)
                private val off50: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off49 + 1L), 2L)
                private val off51: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off50 + 2L), 2L)
                private val off52: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off51 + 2L), 1L)
                private val off53: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off52 + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off54: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off53 + ((KI_WMESGLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                private val off55: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off54 + 8L), 1L)
                private val off56: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off55 + ((KI_MAXLOGNAME).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                private val off57: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off56 + 4L), 4L)
                private val off58: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off57 + 4L), 4L)
                private val off59: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off58 + 4L), 4L)
                private val off60: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off59 + 4L), 8L)
                private val off61: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off60 + 8L), 8L)
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
                        .alignUpBytes((off66 + 4L), 8L)
                private val off68: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off67 + 8L), 8L)
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
                        .alignUpBytes((off80 + 8L), 4L)
                private val off82: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off81 + 4L), 4L)
                private val off83: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off82 + 4L), 4L)
                private val off84: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off83 + 4L), 4L)
                private val off85: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off84 + 4L), 4L)
                private val off86: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off85 + 4L), 4L)
                private val off87: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off86 + 4L), 1L)
                private val off88: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off87 + ((KI_EMULNAMELEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                private val off89: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off88 + 8L), 8L)
                private val off90: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off89 + 8L), 8L)
                private val off91: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off90 + 8L), 4L)
                private val off92: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off91 + 4L), 4L)
                private val off93: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off92 + 4L), 8L)
                private val off94: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off93 + 8L), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off94 + ((KI_MAXCOMLEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): KinfoProc =
                    KinfoProc().apply {
                        this.pForw = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr)
                        this.pBack = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L)
                        this.pPaddr = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L)
                        this.pAddr = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L)
                        this.pFd = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L)
                        this.pStats = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L)
                        this.pLimit = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L)
                        this.pVmspace = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L)
                        this.pSigacts = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L)
                        this.pSess = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L)
                        this.pTsess = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 80L)
                        this.pRu = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L)
                        this.pEflag = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 96L)
                        this.pExitsig = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 100L)
                        this.pFlag = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 104L)
                        this.pPid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 108L)
                        this.pPpid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 112L)
                        this.pSid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 116L)
                        this.pPgid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 120L)
                        this.pTpgid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 124L)
                        this.pUid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 128L)
                        this.pRuid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L)
                        this.pGid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L)
                        this.pRgid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L)
                        this.pGroups =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (KI_NGROUPS))
                            ).readNative(addr + 144L).toUIntArray()
                        this.pNgroups = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + off25)
                        this.pJobc = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + off26)
                        this.pTdev = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off27)
                        this.pEstcpu = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off28)
                        this.pRtimeSec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off29)
                        this.pRtimeUsec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off30)
                        this.pCpticks = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off31)
                        this.pPctcpu = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off32)
                        this.pSwtime = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off33)
                        this.pSlptime = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off34)
                        this.pSchedflags = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off35)
                        this.pUticks = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off36)
                        this.pSticks = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off37)
                        this.pIticks = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off38)
                        this.pTracep = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off39)
                        this.pTraceflag = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off40)
                        this.pHoldcnt = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off41)
                        this.pSiglist = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off42)
                        this.pSigmask = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off43)
                        this.pSigignore = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off44)
                        this.pSigcatch = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off45)
                        this.pStat = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + off46)
                        this.pPriority = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off47)
                        this.pUsrpri = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off48)
                        this.pNice = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + off49)
                        this.pXstat = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off50)
                        this.pSpare = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + off51)
                        this.pComm =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXCOMLEN))
                            ).readNative(addr + off52).toUByteArray()
                        this.pWmesg =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_WMESGLEN))
                            ).readNative(addr + off53).toUByteArray()
                        this.pWchan = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off54)
                        this.pLogin =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXLOGNAME))
                            ).readNative(addr + off55).toUByteArray()
                        this.pVmRssize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off56)
                        this.pVmTsize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off57)
                        this.pVmDsize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off58)
                        this.pVmSsize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off59)
                        this.pUvalid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + off60)
                        this.pUstartSec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off61)
                        this.pUstartUsec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off62)
                        this.pUutimeSec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off63)
                        this.pUutimeUsec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off64)
                        this.pUstimeSec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off65)
                        this.pUstimeUsec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off66)
                        this.pUruMaxrss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off67)
                        this.pUruIxrss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off68)
                        this.pUruIdrss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off69)
                        this.pUruIsrss = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off70)
                        this.pUruMinflt = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off71)
                        this.pUruMajflt = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off72)
                        this.pUruNswap = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off73)
                        this.pUruInblock = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off74)
                        this.pUruOublock = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off75)
                        this.pUruMsgsnd = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off76)
                        this.pUruMsgrcv = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off77)
                        this.pUruNsignals = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off78)
                        this.pUruNvcsw = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off79)
                        this.pUruNivcsw = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off80)
                        this.pUctimeSec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off81)
                        this.pUctimeUsec = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off82)
                        this.pPsflags = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off83)
                        this.pAcflag = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off84)
                        this.pSvuid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off85)
                        this.pSvgid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off86)
                        this.pEmul =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_EMULNAMELEN))
                            ).readNative(addr + off87).toUByteArray()
                        this.pRlimRssCur = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off88)
                        this.pCpuid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off89)
                        this.pVmMapSize = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off90)
                        this.pTid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + off91)
                        this.pRtableid = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off92)
                        this.pPledge = (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + off93)
                        this.pName =
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXCOMLEN))
                            ).readNative(addr + off94).toUByteArray()
                    }
                override fun writeNative(addr: Long, value: KinfoProc) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.pForw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.pBack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.pPaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.pAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.pFd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.pStats)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.pLimit)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.pVmspace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.pSigacts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.pSess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 80L, value.pTsess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.pRu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 96L, value.pEflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 100L, value.pExitsig)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 104L, value.pFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 108L, value.pPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 112L, value.pPpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 116L, value.pSid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 120L, value.pPgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 124L, value.pTpgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.pUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.pRuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.pGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.pRgid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (KI_NGROUPS))
                    ).writeNative(addr + 144L, value.pGroups.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + off25, value.pNgroups)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + off26, value.pJobc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off27, value.pTdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off28, value.pEstcpu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off29, value.pRtimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off30, value.pRtimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off31, value.pCpticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off32, value.pPctcpu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off33, value.pSwtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off34, value.pSlptime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off35, value.pSchedflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off36, value.pUticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off37, value.pSticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off38, value.pIticks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off39, value.pTracep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off40, value.pTraceflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off41, value.pHoldcnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off42, value.pSiglist)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off43, value.pSigmask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off44, value.pSigignore)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off45, value.pSigcatch)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + off46, value.pStat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off47, value.pPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off48, value.pUsrpri)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + off49, value.pNice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off50, value.pXstat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + off51, value.pSpare)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXCOMLEN))
                    ).writeNative(addr + off52, value.pComm.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_WMESGLEN))
                    ).writeNative(addr + off53, value.pWmesg.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off54, value.pWchan)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXLOGNAME))
                    ).writeNative(addr + off55, value.pLogin.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off56, value.pVmRssize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off57, value.pVmTsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off58, value.pVmDsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off59, value.pVmSsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + off60, value.pUvalid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off61, value.pUstartSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off62, value.pUstartUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off63, value.pUutimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off64, value.pUutimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off65, value.pUstimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off66, value.pUstimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off67, value.pUruMaxrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off68, value.pUruIxrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off69, value.pUruIdrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off70, value.pUruIsrss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off71, value.pUruMinflt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off72, value.pUruMajflt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off73, value.pUruNswap)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off74, value.pUruInblock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off75, value.pUruOublock)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off76, value.pUruMsgsnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off77, value.pUruMsgrcv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off78, value.pUruNsignals)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off79, value.pUruNvcsw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off80, value.pUruNivcsw)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off81, value.pUctimeSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off82, value.pUctimeUsec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off83, value.pPsflags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off84, value.pAcflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off85, value.pSvuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off86, value.pSvgid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_EMULNAMELEN))
                    ).writeNative(addr + off87, value.pEmul.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off88, value.pRlimRssCur)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off89, value.pCpuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off90, value.pVmMapSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + off91, value.pTid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off92, value.pRtableid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + off93, value.pPledge)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (KI_MAXCOMLEN))
                    ).writeNative(addr + off94, value.pName.toList())
                }
            }
    }
}

public data class KinfoVmentry(
    public var kveStart: CUlong = 0uL,
    public var kveEnd: CUlong = 0uL,
    public var kveGuard: CUlong = 0uL,
    public var kveFspace: CUlong = 0uL,
    public var kveFspaceAugment: CUlong = 0uL,
    public var kveOffset: ULong = 0uL,
    public var kveWiredCount: CInt = 0,
    public var kveEtype: CInt = 0,
    public var kveProtection: CInt = 0,
    public var kveMaxProtection: CInt = 0,
    public var kveAdvice: CInt = 0,
    public var kveInheritance: CInt = 0,
    public var kveFlags: UByte = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoVmentry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<KinfoVmentry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 80L
                override fun readNative(addr: Long): KinfoVmentry =
                    KinfoVmentry(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: KinfoVmentry) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.kveStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.kveEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.kveGuard)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.kveFspace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.kveFspaceAugment)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.kveOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.kveWiredCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.kveEtype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.kveProtection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 60L, value.kveMaxProtection)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.kveAdvice)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.kveInheritance)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 72L, value.kveFlags)
                }
            }
    }
}

public data class PtraceState(
    public var peReportEvent: CInt = 0,
    public var peOtherPid: PidT = 0,
    public var peTid: PidT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): PtraceState =
                    PtraceState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: PtraceState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.peReportEvent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.peOtherPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.peTid)
                }
            }
    }
}

public data class PtraceThreadState(
    public var ptsTid: PidT = 0,
    public var ptsName: UByteArray = UByteArray(PT_PTS_NAMELEN),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PtraceThreadState) return false
        if (this.ptsTid != other.ptsTid) return false
        if (!this.ptsName.contentEquals(other.ptsName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ptsTid.hashCode()
        result = 31 * result + this.ptsName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceThreadState> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PtraceThreadState> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((4L + ((PT_PTS_NAMELEN).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                override fun readNative(addr: Long): PtraceThreadState =
                    PtraceThreadState(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PT_PTS_NAMELEN))
                        ).readNative(addr + 4L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PtraceThreadState) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.ptsTid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (PT_PTS_NAMELEN))
                    ).writeNative(addr + 4L, value.ptsName.toList())
                }
            }
    }
}

// search.h
public class Entry internal constructor(
    keyCtorArg: MutPtr<CChar>,
    dataCtorArg: MutPtr<CVoid>,
) {
    public var key: MutPtr<CChar> = keyCtorArg
        internal set

    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public constructor() : this(
        keyCtorArg = MutPtr(0L),
        dataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.key

    public operator fun component2(): MutPtr<CVoid> = this.data

    public fun copy(key: MutPtr<CChar> = this.key, data: MutPtr<CVoid> = this.data): Entry = Entry(keyCtorArg = key, dataCtorArg = data)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Entry) return false
        if (this.key != other.key) return false
        if (this.data != other.data) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.key.hashCode()
        result = 31 * result + this.data.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Entry> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Entry> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Entry =
                    Entry(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Entry) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.key)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.data)
                }
            }

        public operator fun invoke(
            key: MutPtr<CChar> = MutPtr(0L),
            data: MutPtr<CVoid> = MutPtr(0L),
        ): Entry =
            Entry(
                keyCtorArg = key,
                dataCtorArg = data,
            )
    }
}

public data class Ifreq(
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

public class TcpInfo(
    public var tcpiState: UByte = 0u,
    public var tcpiCaState: UByte = 0u,
    public var tcpiRetransmits: UByte = 0u,
    public var tcpiProbes: UByte = 0u,
    public var tcpiBackoff: UByte = 0u,
    public var tcpiOptions: UByte = 0u,
    public var tcpiSndWscale: UByte = 0u,
    public var tcpiRcvWscale: UByte = 0u,
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
    public var tcpiSndNxt: UInt = 0u,
    public var tcpiRcvNxt: UInt = 0u,
    public var tcpiToeTid: UInt = 0u,
    public var tcpiSndRexmitpack: UInt = 0u,
    public var tcpiRcvOoopack: UInt = 0u,
    public var tcpiSndZerowin: UInt = 0u,
    public var tcpiRttmin: UInt = 0u,
    public var tcpiMaxSndwnd: UInt = 0u,
    public var tcpiRcvAdv: UInt = 0u,
    public var tcpiRcvUp: UInt = 0u,
    public var tcpiSndUna: UInt = 0u,
    public var tcpiSndUp: UInt = 0u,
    public var tcpiSndWl1: UInt = 0u,
    public var tcpiSndWl2: UInt = 0u,
    public var tcpiSndMax: UInt = 0u,
    public var tcpiTsRecent: UInt = 0u,
    public var tcpiTsRecentAge: UInt = 0u,
    public var tcpiRfbufCnt: UInt = 0u,
    public var tcpiRfbufTs: UInt = 0u,
    public var tcpiSoRcvSbCc: UInt = 0u,
    public var tcpiSoRcvSbHiwat: UInt = 0u,
    public var tcpiSoRcvSbLowat: UInt = 0u,
    public var tcpiSoRcvSbWat: UInt = 0u,
    public var tcpiSoSndSbCc: UInt = 0u,
    public var tcpiSoSndSbHiwat: UInt = 0u,
    public var tcpiSoSndSbLowat: UInt = 0u,
    public var tcpiSoSndSbWat: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<TcpInfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 212L
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 132L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 136L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 140L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 144L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 152L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 156L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 160L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 164L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 168L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 172L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 176L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 180L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 184L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 188L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 192L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 196L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 200L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 204L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 208L),
                    )
                override fun writeNative(addr: Long, value: TcpInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.tcpiState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.tcpiCaState)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.tcpiRetransmits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.tcpiProbes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.tcpiBackoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.tcpiOptions)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 6L, value.tcpiSndWscale)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 7L, value.tcpiRcvWscale)
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 104L, value.tcpiSndNxt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 108L, value.tcpiRcvNxt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 112L, value.tcpiToeTid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 116L, value.tcpiSndRexmitpack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 120L, value.tcpiRcvOoopack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 124L, value.tcpiSndZerowin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 128L, value.tcpiRttmin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 132L, value.tcpiMaxSndwnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 136L, value.tcpiRcvAdv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 140L, value.tcpiRcvUp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 144L, value.tcpiSndUna)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.tcpiSndUp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 152L, value.tcpiSndWl1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 156L, value.tcpiSndWl2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 160L, value.tcpiSndMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 164L, value.tcpiTsRecent)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 168L, value.tcpiTsRecentAge)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 172L, value.tcpiRfbufCnt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 176L, value.tcpiRfbufTs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 180L, value.tcpiSoRcvSbCc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 184L, value.tcpiSoRcvSbHiwat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 188L, value.tcpiSoRcvSbLowat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 192L, value.tcpiSoRcvSbWat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 196L, value.tcpiSoSndSbCc)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 200L, value.tcpiSoSndSbHiwat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 204L, value.tcpiSoSndSbLowat)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 208L, value.tcpiSoSndSbWat)
                }
            }
    }
}

public data class Dirent(
    public var dFileno: InoT = 0uL,
    public var dOff: OffT = 0L,
    public var dReclen: UShort = 0u,
    public var dType: UByte = 0u,
    public var dNamlen: UByte = 0u,
    public var dPadding: UByteArray = UByteArray(4),
    public var dName: UByteArray = UByteArray(256),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dFileno != other.dFileno) return false
        if (this.dOff != other.dOff) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dType != other.dType) return false
        if (this.dNamlen != other.dNamlen) return false
        if (!this.dPadding.contentEquals(other.dPadding)) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dFileno.hashCode()
        result = 31 * result + this.dOff.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dNamlen.hashCode()
        result = 31 * result + this.dPadding.contentHashCode()
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 19L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dFileno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.dOff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.dReclen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 18L, value.dType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 19L, value.dNamlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 20L, value.dPadding.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 24L, value.dName.toList())
                }
            }
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssPad2: Long = 0L,
    public var ssPad3: UByteArray = UByteArray(240),
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
                override val sizeBytes: Long = 256L
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
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (240).toInt())
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
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (240).toInt())
                    ).writeNative(addr + 16L, value.ssPad3.toList())
                }
            }
    }
}

public class SiginfoT internal constructor(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    siAddrCtorArg: MutPtr<CChar>,
    public var pad: UByteArray,
) {
    public var siAddr: MutPtr<CChar> = siAddrCtorArg
        internal set

    public constructor() : this(
        siSigno = 0,
        siCode = 0,
        siErrno = 0,
        siAddrCtorArg = MutPtr(0L),
        pad = UByteArray(108),
    )

    public operator fun component1(): CInt = this.siSigno

    public operator fun component2(): CInt = this.siCode

    public operator fun component3(): CInt = this.siErrno

    public operator fun component4(): MutPtr<CChar> = this.siAddr

    public operator fun component5(): UByteArray = this.pad

    public fun copy(siSigno: CInt = this.siSigno, siCode: CInt = this.siCode, siErrno: CInt = this.siErrno, siAddr: MutPtr<CChar> = this.siAddr, pad: UByteArray = this.pad): SiginfoT = SiginfoT(siSigno = siSigno, siCode = siCode, siErrno = siErrno, siAddrCtorArg = siAddr, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siAddr != other.siAddr) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siAddr.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public fun siPid(): PidT {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val off = 12L + SI_PAD.toLong() * 4L
        val out =
            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32
                .readNative(scratch + off)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public fun siUid(): UidT {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val off = 16L + SI_PAD.toLong() * 4L
        val out =
            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16
                .readNative(scratch + off)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public fun siValue(): Sigval {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val off =
            io.github.kotlinmania.rustlang.core.mem
                .alignUpBytes(20L + SI_PAD.toLong() * 4L, 8L)
        val out = Sigval.typeLayout().readNative(scratch + off)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public fun siStatus(): CInt {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val off =
            io.github.kotlinmania.rustlang.core.mem
                .alignUpBytes(20L + SI_PAD.toLong() * 4L, 8L) + 16L
        val out =
            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32
                .readNative(scratch + off)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 136L
                override fun readNative(addr: Long): SiginfoT =
                    SiginfoT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (108).toInt())
                        ).readNative(addr + 24L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siErrno)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.siAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (108).toInt())
                    ).writeNative(addr + 24L, value.pad.toList())
                }
            }

        public operator fun invoke(
            siSigno: CInt = 0,
            siCode: CInt = 0,
            siErrno: CInt = 0,
            siAddr: MutPtr<CChar> = MutPtr(0L),
            pad: UByteArray = UByteArray(108),
        ): SiginfoT =
            SiginfoT(
                siSigno = siSigno,
                siCode = siCode,
                siErrno = siErrno,
                siAddrCtorArg = siAddr,
                pad = pad,
            )
    }
}

public data class Lastlog(
    public var llTime: TimeT = 0L,
    public var llLine: UByteArray = UByteArray(UT_LINESIZE),
    public var llHost: UByteArray = UByteArray(UT_HOSTSIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Lastlog) return false
        if (this.llTime != other.llTime) return false
        if (!this.llLine.contentEquals(other.llLine)) return false
        if (!this.llHost.contentEquals(other.llHost)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.llTime.hashCode()
        result = 31 * result + this.llLine.contentHashCode()
        result = 31 * result + this.llHost.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lastlog> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lastlog> {
                override val alignBytes: Long = 8L
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((UT_LINESIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((UT_HOSTSIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override fun readNative(addr: Long): Lastlog =
                    Lastlog(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_LINESIZE))
                        ).readNative(addr + 8L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_HOSTSIZE))
                        ).readNative(addr + off2).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Lastlog) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.llTime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_LINESIZE))
                    ).writeNative(addr + 8L, value.llLine.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_HOSTSIZE))
                    ).writeNative(addr + off2, value.llHost.toList())
                }
            }
    }
}

public data class Utmp(
    public var utLine: UByteArray = UByteArray(UT_LINESIZE),
    public var utName: UByteArray = UByteArray(UT_NAMESIZE),
    public var utHost: UByteArray = UByteArray(UT_HOSTSIZE),
    public var utTime: TimeT = 0L,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmp) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utName.contentEquals(other.utName)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (this.utTime != other.utTime) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utLine.contentHashCode()
        result = 31 * result + this.utName.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utTime.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utmp> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utmp> {
                override val alignBytes: Long = 8L
                private val off1: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((UT_LINESIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off1 + ((UT_NAMESIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((UT_HOSTSIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 8L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + 8L), 8L)
                override fun readNative(addr: Long): Utmp =
                    Utmp(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_LINESIZE))
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_NAMESIZE))
                        ).readNative(addr + off1).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_HOSTSIZE))
                        ).readNative(addr + off2).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + off3),
                    )
                override fun writeNative(addr: Long, value: Utmp) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_LINESIZE))
                    ).writeNative(addr, value.utLine.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_NAMESIZE))
                    ).writeNative(addr + off1, value.utName.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (UT_HOSTSIZE))
                    ).writeNative(addr + off2, value.utHost.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + off3, value.utTime)
                }
            }
    }
}

public class Statfs(
    public var fFlags: UInt = 0u,
    public var fBsize: UInt = 0u,
    public var fIosize: UInt = 0u,
    public var fBlocks: ULong = 0uL,
    public var fBfree: ULong = 0uL,
    public var fBavail: Long = 0L,
    public var fFiles: ULong = 0uL,
    public var fFfree: ULong = 0uL,
    public var fFavail: Long = 0L,
    public var fSyncwrites: ULong = 0uL,
    public var fSyncreads: ULong = 0uL,
    public var fAsyncwrites: ULong = 0uL,
    public var fAsyncreads: ULong = 0uL,
    public var fFsid: FsidT = FsidT(),
    public var fNamemax: UInt = 0u,
    public var fOwner: UidT = 0u,
    public var fCtime: ULong = 0uL,
    public var fFstypename: UByteArray = UByteArray(16),
    public var fMntonname: UByteArray = UByteArray(90),
    public var fMntfromname: UByteArray = UByteArray(90),
    public var fMntfromspec: UByteArray = UByteArray(90),
    public var mountInfo: MountInfo = MountInfo(),
)

public data class MountInfo(
    public var ufsArgs: UfsArgs = UfsArgs(),
    public var mfsArgs: MfsArgs = MfsArgs(),
    public var nfsArgs: NfsArgs = NfsArgs(),
    public var isoArgs: IsoArgs = IsoArgs(),
    public var msdosfsArgs: MsdosfsArgs = MsdosfsArgs(),
    public var ntfsArgs: NtfsArgs = NtfsArgs(),
    public var tmpfsArgs: TmpfsArgs = TmpfsArgs(),
    public var align: UByteArray = UByteArray(160),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MountInfo) return false
        if (this.ufsArgs != other.ufsArgs) return false
        if (this.mfsArgs != other.mfsArgs) return false
        if (this.nfsArgs != other.nfsArgs) return false
        if (this.isoArgs != other.isoArgs) return false
        if (this.msdosfsArgs != other.msdosfsArgs) return false
        if (this.ntfsArgs != other.ntfsArgs) return false
        if (this.tmpfsArgs != other.tmpfsArgs) return false
        if (!this.align.contentEquals(other.align)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ufsArgs.hashCode()
        result = 31 * result + this.mfsArgs.hashCode()
        result = 31 * result + this.nfsArgs.hashCode()
        result = 31 * result + this.isoArgs.hashCode()
        result = 31 * result + this.msdosfsArgs.hashCode()
        result = 31 * result + this.ntfsArgs.hashCode()
        result = 31 * result + this.tmpfsArgs.hashCode()
        result = 31 * result + this.align.contentHashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "mount_info").finishNonExhaustive()
    }

    public fun eq(other: MountInfo): Boolean = (this.align.zip(other.align)).all({ (a, b) -> a == b })
}

public class CAnonymousIfrIfru internal constructor(
    public var ifruAddr: Sockaddr,
    public var ifruDstaddr: Sockaddr,
    public var ifruBroadaddr: Sockaddr,
    public var ifruFlags: CShort,
    public var ifruMetric: CInt,
    public var ifruVnetid: Long,
    public var ifruMedia: ULong,
    ifruDataCtorArg: CaddrT,
    public var ifruIndex: CUint,
) {
    public var ifruData: CaddrT = ifruDataCtorArg
        internal set

    public constructor() : this(
        ifruAddr = Sockaddr(),
        ifruDstaddr = Sockaddr(),
        ifruBroadaddr = Sockaddr(),
        ifruFlags = 0,
        ifruMetric = 0,
        ifruVnetid = 0L,
        ifruMedia = 0uL,
        ifruDataCtorArg = MutPtr(0L),
        ifruIndex = 0u,
    )

    public operator fun component1(): Sockaddr = this.ifruAddr

    public operator fun component2(): Sockaddr = this.ifruDstaddr

    public operator fun component3(): Sockaddr = this.ifruBroadaddr

    public operator fun component4(): CShort = this.ifruFlags

    public operator fun component5(): CInt = this.ifruMetric

    public operator fun component6(): Long = this.ifruVnetid

    public operator fun component7(): ULong = this.ifruMedia

    public operator fun component8(): CaddrT = this.ifruData

    public operator fun component9(): CUint = this.ifruIndex

    public fun copy(ifruAddr: Sockaddr = this.ifruAddr, ifruDstaddr: Sockaddr = this.ifruDstaddr, ifruBroadaddr: Sockaddr = this.ifruBroadaddr, ifruFlags: CShort = this.ifruFlags, ifruMetric: CInt = this.ifruMetric, ifruVnetid: Long = this.ifruVnetid, ifruMedia: ULong = this.ifruMedia, ifruData: CaddrT = this.ifruData, ifruIndex: CUint = this.ifruIndex): CAnonymousIfrIfru = CAnonymousIfrIfru(ifruAddr = ifruAddr, ifruDstaddr = ifruDstaddr, ifruBroadaddr = ifruBroadaddr, ifruFlags = ifruFlags, ifruMetric = ifruMetric, ifruVnetid = ifruVnetid, ifruMedia = ifruMedia, ifruDataCtorArg = ifruData, ifruIndex = ifruIndex)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruMetric != other.ifruMetric) return false
        if (this.ifruVnetid != other.ifruVnetid) return false
        if (this.ifruMedia != other.ifruMedia) return false
        if (this.ifruData != other.ifruData) return false
        if (this.ifruIndex != other.ifruIndex) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruMetric.hashCode()
        result = 31 * result + this.ifruVnetid.hashCode()
        result = 31 * result + this.ifruMedia.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruIndex.hashCode()
        return result
    }

    public fun fmt(f: StringBuilder) {
        DebugStruct(f, "__c_anonymous_ifr_ifru").finishNonExhaustive()
    }

    public fun eq(other: CAnonymousIfrIfru): Boolean = this.ifruAddr == other.ifruAddr && this.ifruDstaddr == other.ifruDstaddr && this.ifruBroadaddr == other.ifruBroadaddr && this.ifruFlags == other.ifruFlags && this.ifruMetric == other.ifruMetric && this.ifruVnetid == other.ifruVnetid && this.ifruMedia == other.ifruMedia && this.ifruData == other.ifruData && this.ifruIndex == other.ifruIndex

    public companion object {
        public operator fun invoke(
            ifruAddr: Sockaddr = Sockaddr(),
            ifruDstaddr: Sockaddr = Sockaddr(),
            ifruBroadaddr: Sockaddr = Sockaddr(),
            ifruFlags: CShort = 0,
            ifruMetric: CInt = 0,
            ifruVnetid: Long = 0L,
            ifruMedia: ULong = 0uL,
            ifruData: CaddrT = MutPtr(0L),
            ifruIndex: CUint = 0u,
        ): CAnonymousIfrIfru =
            CAnonymousIfrIfru(
                ifruAddr = ifruAddr,
                ifruDstaddr = ifruDstaddr,
                ifruBroadaddr = ifruBroadaddr,
                ifruFlags = ifruFlags,
                ifruMetric = ifruMetric,
                ifruVnetid = ifruVnetid,
                ifruMedia = ifruMedia,
                ifruDataCtorArg = ifruData,
                ifruIndex = ifruIndex,
            )
    }
}
