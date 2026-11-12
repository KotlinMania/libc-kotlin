package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// stat.h
public data class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stMode: CShort = 0,
    public var stNlink: CShort = 0,
    public var stUid: CShort = 0,
    public var stGid: CShort = 0,
    public var stRdev: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stAtime: TimeT = 0L,
    public var stMtime: TimeT = 0L,
    public var stCtime: TimeT = 0L,
    public var stBlksize: BlksizeT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val sizeBytes: Long = 72L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 18L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 20L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 22L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.stAtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.stMtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.stCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.stBlksize)
                }
            }
    }
}

// time.h
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

// stdlib.h
public data class QdivT(
    public var quot: QuadT = 0L,
    public var rem: QuadT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<QdivT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<QdivT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): QdivT =
                    QdivT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: QdivT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.quot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.rem)
                }
            }
    }
}

public data class LldivT(
    public var quot: CLonglong = 0L,
    public var rem: CLonglong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<LldivT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<LldivT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): LldivT =
                    LldivT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: LldivT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.quot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.rem)
                }
            }
    }
}

public data class DivT(
    public var quot: CInt = 0,
    public var rem: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DivT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DivT> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DivT =
                    DivT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DivT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.quot)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.rem)
                }
            }
    }
}

public data class LdivT(
    public var quot: CLong = 0L,
    public var rem: CLong = 0L,
)

// locale.h
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
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 81L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 82L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 83L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 85L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 86L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 87L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 89L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 90L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 91L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 92L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).readNative(addr + 93L),
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 80L, value.intFracDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 81L, value.fracDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 82L, value.pCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 83L, value.pSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 84L, value.nCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 85L, value.nSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 86L, value.pSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 87L, value.nSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 88L, value.intPCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 89L, value.intNCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 90L, value.intPSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 91L, value.intNSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 92L, value.intPSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 93L, value.intNSignPosn)
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

public class Iovec internal constructor(
    iovBaseCtorArg: MutPtr<CVoid>,
    public var iovLen: SizeT,
) {
    public var iovBase: MutPtr<CVoid> = iovBaseCtorArg
        internal set

    public constructor() : this(
        iovBaseCtorArg = MutPtr(0L),
        iovLen = 0uL,
    )

    public operator fun component1(): MutPtr<CVoid> = this.iovBase

    public operator fun component2(): SizeT = this.iovLen

    public fun copy(iovBase: MutPtr<CVoid> = this.iovBase, iovLen: SizeT = this.iovLen): Iovec = Iovec(iovBaseCtorArg = iovBase, iovLen = iovLen)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Iovec) return false
        if (this.iovBase != other.iovBase) return false
        if (this.iovLen != other.iovLen) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.iovBase.hashCode()
        result = 31 * result + this.iovLen.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iovec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Iovec> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Iovec =
                    Iovec(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Iovec) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.iovBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.iovLen)
                }
            }

        public operator fun invoke(
            iovBase: MutPtr<CVoid> = MutPtr(0L),
            iovLen: SizeT = 0uL,
        ): Iovec =
            Iovec(
                iovBaseCtorArg = iovBase,
                iovLen = iovLen,
            )
    }
}

public data class Timeval(
    public var tvSec: CLong = 0L,
    public var tvUsec: CLong = 0L,
)
