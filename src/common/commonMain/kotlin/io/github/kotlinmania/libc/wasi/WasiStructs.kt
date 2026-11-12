@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

public class ClockidT internal constructor(
    valueCtorArg: ConstPtr<UByte>,
) {
    public var value: ConstPtr<UByte> = valueCtorArg
        internal set

    public var field0: ConstPtr<UByte>
        get() = value
        set(v) {
            value = v
        }

    public constructor() : this(
        valueCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): ConstPtr<UByte> = this.value

    public fun copy(value: ConstPtr<UByte> = this.value): ClockidT = ClockidT(valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ClockidT) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int = this.value.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClockidT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ClockidT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): ClockidT =
                    ClockidT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UByte>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: ClockidT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UByte>(64)
                    ).writeNative(addr, value.value)
                }
            }

        public operator fun invoke(
            value: ConstPtr<UByte> = ConstPtr(0L),
        ): ClockidT =
            ClockidT(
                valueCtorArg = value,
            )
    }
}

public data class FposT(
    public var data: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FposT) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FposT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FposT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): FposT =
                    FposT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: FposT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.data.toList())
                }
            }
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
    public var tmGmtoff: CInt,
    tmZoneCtorArg: ConstPtr<CChar>,
    public var tmNsec: CInt,
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
        tmGmtoff = 0,
        tmZoneCtorArg = ConstPtr(0L),
        tmNsec = 0,
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

    public operator fun component10(): CInt = this.tmGmtoff

    public operator fun component11(): ConstPtr<CChar> = this.tmZone

    public operator fun component12(): CInt = this.tmNsec

    public fun copy(tmSec: CInt = this.tmSec, tmMin: CInt = this.tmMin, tmHour: CInt = this.tmHour, tmMday: CInt = this.tmMday, tmMon: CInt = this.tmMon, tmYear: CInt = this.tmYear, tmWday: CInt = this.tmWday, tmYday: CInt = this.tmYday, tmIsdst: CInt = this.tmIsdst, tmGmtoff: CInt = this.tmGmtoff, tmZone: ConstPtr<CChar> = this.tmZone, tmNsec: CInt = this.tmNsec): Tm = Tm(tmSec = tmSec, tmMin = tmMin, tmHour = tmHour, tmMday = tmMday, tmMon = tmMon, tmYear = tmYear, tmWday = tmWday, tmYday = tmYday, tmIsdst = tmIsdst, tmGmtoff = tmGmtoff, tmZoneCtorArg = tmZone, tmNsec = tmNsec)

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
        if (this.tmNsec != other.tmNsec) return false
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
        result = 31 * result + this.tmNsec.hashCode()
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.tmGmtoff)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 40L, value.tmZone)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.tmNsec)
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
            tmGmtoff: CInt = 0,
            tmZone: ConstPtr<CChar> = ConstPtr(0L),
            tmNsec: CInt = 0,
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
                tmNsec = tmNsec,
            )
    }
}

public data class Timeval(
    public var tvSec: TimeT = 0L,
    public var tvUsec: SusecondsT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Timeval =
                    Timeval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Timeval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tvUsec)
                }
            }
    }
}

public data class Timespec(
    public var tvSec: TimeT = 0L,
    public var tvNsec: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timespec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timespec> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Timespec =
                    Timespec(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Timespec) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tvNsec)
                }
            }
    }
}

public data class Tms(
    public var tmsUtime: ClockT = 0L,
    public var tmsStime: ClockT = 0L,
    public var tmsCutime: ClockT = 0L,
    public var tmsCstime: ClockT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tms> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tms> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Tms =
                    Tms(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Tms) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.tmsUtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.tmsStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.tmsCutime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.tmsCstime)
                }
            }
    }
}

public data class Itimerspec(
    public var itInterval: Timespec = Timespec(),
    public var itValue: Timespec = Timespec(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Itimerspec> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Itimerspec> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Itimerspec =
                    Itimerspec(
                        (Timespec.typeLayout()).readNative(addr),
                        (Timespec.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Itimerspec) {
                    (Timespec.typeLayout()).writeNative(addr, value.itInterval)
                    (Timespec.typeLayout()).writeNative(addr + 16L, value.itValue)
                }
            }
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
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Iovec =
                    Iovec(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Iovec) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.iovBase)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.iovLen)
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

public data class Pollfd(
    public var fd: CInt = 0,
    public var events: CShort = 0,
    public var revents: CShort = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pollfd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Pollfd> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Pollfd =
                    Pollfd(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: Pollfd) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.fd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.events)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.revents)
                }
            }
    }
}

public data class Rusage(
    public var ruUtime: Timeval = Timeval(),
    public var ruStime: Timeval = Timeval(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rusage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rusage> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): Rusage =
                    Rusage(
                        (Timeval.typeLayout()).readNative(addr),
                        (Timeval.typeLayout()).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Rusage) {
                    (Timeval.typeLayout()).writeNative(addr, value.ruUtime)
                    (Timeval.typeLayout()).writeNative(addr + 16L, value.ruStime)
                }
            }
    }
}

public data class Stat(
    public var stDev: DevT = 0uL,
    public var stIno: InoT = 0uL,
    public var stNlink: NlinkT = 0uL,
    public var stMode: ModeT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var pad0: CUint = 0u,
    public var stRdev: DevT = 0uL,
    public var stSize: OffT = 0L,
    public var stBlksize: BlksizeT = 0L,
    public var stBlocks: BlkcntT = 0L,
    public var stAtim: Timespec = Timespec(),
    public var stMtim: Timespec = Timespec(),
    public var stCtim: Timespec = Timespec(),
    public var reserved: LongArray = LongArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Stat) return false
        if (this.stDev != other.stDev) return false
        if (this.stIno != other.stIno) return false
        if (this.stNlink != other.stNlink) return false
        if (this.stMode != other.stMode) return false
        if (this.stUid != other.stUid) return false
        if (this.stGid != other.stGid) return false
        if (this.pad0 != other.pad0) return false
        if (this.stRdev != other.stRdev) return false
        if (this.stSize != other.stSize) return false
        if (this.stBlksize != other.stBlksize) return false
        if (this.stBlocks != other.stBlocks) return false
        if (this.stAtim != other.stAtim) return false
        if (this.stMtim != other.stMtim) return false
        if (this.stCtim != other.stCtim) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stDev.hashCode()
        result = 31 * result + this.stIno.hashCode()
        result = 31 * result + this.stNlink.hashCode()
        result = 31 * result + this.stMode.hashCode()
        result = 31 * result + this.stUid.hashCode()
        result = 31 * result + this.stGid.hashCode()
        result = 31 * result + this.pad0.hashCode()
        result = 31 * result + this.stRdev.hashCode()
        result = 31 * result + this.stSize.hashCode()
        result = 31 * result + this.stBlksize.hashCode()
        result = 31 * result + this.stBlocks.hashCode()
        result = 31 * result + this.stAtim.hashCode()
        result = 31 * result + this.stMtim.hashCode()
        result = 31 * result + this.stCtim.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Stat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 144L
                override fun readNative(addr: Long): Stat =
                    Stat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 64L),
                        (Timespec.typeLayout()).readNative(addr + 72L),
                        (Timespec.typeLayout()).readNative(addr + 88L),
                        (Timespec.typeLayout()).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (3).toInt())
                        ).readNative(addr + 120L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: Stat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.stDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.stIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.stNlink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.stUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.stGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.pad0)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.stRdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 48L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 56L, value.stBlksize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 64L, value.stBlocks)
                    (Timespec.typeLayout()).writeNative(addr + 72L, value.stAtim)
                    (Timespec.typeLayout()).writeNative(addr + 88L, value.stMtim)
                    (Timespec.typeLayout()).writeNative(addr + 104L, value.stCtim)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (3).toInt())
                    ).writeNative(addr + 120L, value.reserved.toList())
                }
            }
    }
}

public data class FdSet(
    public var nfds: Int = 0,
    public var fds: IntArray = IntArray(FD_SETSIZE.toInt()),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (this.nfds != other.nfds) return false
        if (!this.fds.contentEquals(other.fds)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.nfds.hashCode()
        result = 31 * result + this.fds.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdSet> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<FdSet> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((8L + ((FD_SETSIZE.toInt()).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).strideBytes)), 8L)
                override fun readNative(addr: Long): FdSet =
                    FdSet(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (FD_SETSIZE.toInt()).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: FdSet) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.nfds)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (FD_SETSIZE.toInt()).toInt())
                    ).writeNative(addr + 8L, value.fds.toList())
                }
            }
    }
}

public data class PthreadAttrT(
    public var size: LongArray = LongArray(9),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 72L
                override fun readNative(addr: Long): PthreadAttrT =
                    PthreadAttrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (9).toInt())
                        ).readNative(addr).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadAttrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (9).toInt())
                    ).writeNative(addr, value.size.toList())
                }
            }
    }
}

public data class PthreadMutexattrT(
    public var attr: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PthreadMutexattrT =
                    PthreadMutexattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.attr)
                }
            }
    }
}

public data class PthreadCondattrT(
    public var attr: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PthreadCondattrT =
                    PthreadCondattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadCondattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.attr)
                }
            }
    }
}

public data class PthreadBarrierattrT(
    public var attr: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierattrT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): PthreadBarrierattrT =
                    PthreadBarrierattrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadBarrierattrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.attr)
                }
            }
    }
}

public data class PthreadRwlockattrT(
    public var attr: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockattrT) return false
        if (!this.attr.contentEquals(other.attr)) return false
        return true
    }

    override fun hashCode(): Int = this.attr.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): PthreadRwlockattrT =
                    PthreadRwlockattrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockattrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr, value.attr.toList())
                }
            }
    }
}

public class PthreadCondT internal constructor(
    sizeCtorArg: List<MutPtr<CVoid>>,
) {
    public var size: List<MutPtr<CVoid>> = sizeCtorArg
        internal set

    public constructor() : this(
        sizeCtorArg = List(12) { MutPtr(0L) },
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.size

    public fun copy(size: List<MutPtr<CVoid>> = this.size): PthreadCondT = PthreadCondT(sizeCtorArg = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int = this.size.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 96L
                override fun readNative(addr: Long): PthreadCondT =
                    PthreadCondT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (12).toInt(),
                                )
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadCondT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (12).toInt(),
                            )
                    ).writeNative(addr, value.size)
                }
            }

        public operator fun invoke(
            size: List<MutPtr<CVoid>> = List(12) { MutPtr(0L) },
        ): PthreadCondT =
            PthreadCondT(
                sizeCtorArg = size,
            )
    }
}

public class PthreadMutexT internal constructor(
    sizeCtorArg: List<MutPtr<CVoid>>,
) {
    public var size: List<MutPtr<CVoid>> = sizeCtorArg
        internal set

    public constructor() : this(
        sizeCtorArg = List(6) { MutPtr(0L) },
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.size

    public fun copy(size: List<MutPtr<CVoid>> = this.size): PthreadMutexT = PthreadMutexT(sizeCtorArg = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int = this.size.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PthreadMutexT =
                    PthreadMutexT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (6).toInt(),
                                )
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (6).toInt(),
                            )
                    ).writeNative(addr, value.size)
                }
            }

        public operator fun invoke(
            size: List<MutPtr<CVoid>> = List(6) { MutPtr(0L) },
        ): PthreadMutexT =
            PthreadMutexT(
                sizeCtorArg = size,
            )
    }
}

public class PthreadRwlockT internal constructor(
    sizeCtorArg: List<MutPtr<CVoid>>,
) {
    public var size: List<MutPtr<CVoid>> = sizeCtorArg
        internal set

    public constructor() : this(
        sizeCtorArg = List(8) { MutPtr(0L) },
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.size

    public fun copy(size: List<MutPtr<CVoid>> = this.size): PthreadRwlockT = PthreadRwlockT(sizeCtorArg = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int = this.size.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): PthreadRwlockT =
                    PthreadRwlockT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (8).toInt(),
                                )
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (8).toInt(),
                            )
                    ).writeNative(addr, value.size)
                }
            }

        public operator fun invoke(
            size: List<MutPtr<CVoid>> = List(8) { MutPtr(0L) },
        ): PthreadRwlockT =
            PthreadRwlockT(
                sizeCtorArg = size,
            )
    }
}

public class PthreadBarrierT internal constructor(
    sizeCtorArg: List<MutPtr<CVoid>>,
) {
    public var size: List<MutPtr<CVoid>> = sizeCtorArg
        internal set

    public constructor() : this(
        sizeCtorArg = List(5) { MutPtr(0L) },
    )

    public operator fun component1(): List<MutPtr<CVoid>> = this.size

    public fun copy(size: List<MutPtr<CVoid>> = this.size): PthreadBarrierT = PthreadBarrierT(sizeCtorArg = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierT) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int = this.size.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): PthreadBarrierT =
                    PthreadBarrierT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (5).toInt(),
                                )
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadBarrierT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (5).toInt(),
                            )
                    ).writeNative(addr, value.size)
                }
            }

        public operator fun invoke(
            size: List<MutPtr<CVoid>> = List(5) { MutPtr(0L) },
        ): PthreadBarrierT =
            PthreadBarrierT(
                sizeCtorArg = size,
            )
    }
}

// Declare dirent outside of s! so that it doesn't implement Copy, Eq, Hash,
// etc., since it contains a flexible array member with a dynamic size.
public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dType: CUchar = 0u,
    /**
     * dName is declared in WASI libc as a flexible array member, which
     * can't be directly expressed in Rust. As an imperfect workaround,
     * declare it as a zero-length array instead.
     */
    public var dName: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dType != other.dType) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dType.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                        ).readNative(addr + 9L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.dType)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                    ).writeNative(addr + 9L, value.dName.toList())
                }
            }
    }
}
