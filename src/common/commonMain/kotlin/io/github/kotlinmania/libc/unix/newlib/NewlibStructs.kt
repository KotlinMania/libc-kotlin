@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.CcT
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr
import io.github.kotlinmania.libc.unix.newlib.generic.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface SigactionSaHandlerCallback {
    public operator fun invoke(arg1: CInt)
}

// supports multicast
// The order of the `aiAddr` field in this struct is crucial
// for converting between the Rust and C types.
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
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
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
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Addrinfo>(64)
                        ).readNative(addr + 48L),
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
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 40L, value.aiAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Addrinfo>(64)
                    ).writeNative(addr + 48L, value.aiNext)
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

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class InAddr(
    public var sAddr: InAddrT = 0u,
)

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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 88L, value.intNCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 89L, value.intNSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 90L, value.intNSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 91L, value.intPCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 92L, value.intPSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 93L, value.intPSignPosn)
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

public data class Tm(
    public var tmSec: CInt = 0,
    public var tmMin: CInt = 0,
    public var tmHour: CInt = 0,
    public var tmMday: CInt = 0,
    public var tmMon: CInt = 0,
    public var tmYear: CInt = 0,
    public var tmWday: CInt = 0,
    public var tmYday: CInt = 0,
    public var tmIsdst: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Tm> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
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
    public var fFiles: FsfilcntT = 0u,
    public var fFfree: FsfilcntT = 0u,
    public var fFavail: FsfilcntT = 0u,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
)

public data class Sigaction(
    public var saHandler: SigactionSaHandlerCallback = SigactionSaHandlerCallback { _ -> },
    public var saMask: SigsetT = SigsetT(),
    public var saFlags: CInt = 0,
)

public class StackT internal constructor(
    ssSpCtorArg: MutPtr<CVoid>,
    public var ssFlags: CInt,
    public var ssSize: Int,
) {
    public var ssSp: MutPtr<CVoid> = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssFlags = 0,
        ssSize = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.ssSp

    public operator fun component2(): CInt = this.ssFlags

    public operator fun component3(): Int = this.ssSize

    public fun copy(ssSp: MutPtr<CVoid> = this.ssSp, ssFlags: CInt = this.ssFlags, ssSize: Int = this.ssSize): StackT = StackT(ssSpCtorArg = ssSp, ssFlags = ssFlags, ssSize = ssSize)

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
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): StackT =
                    StackT(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.ssFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.ssSize)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr<CVoid> = MutPtr(0L),
            ssFlags: CInt = 0,
            ssSize: Int = 0,
        ): StackT =
            StackT(
                ssSpCtorArg = ssSp,
                ssFlags = ssFlags,
                ssSize = ssSize,
            )
    }
}

public data class FdSet(
    // Unverified
    public var fdsBits: ULongArray = ULongArray(FD_SETSIZE / ULONG_SIZE),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is FdSet) return false
        if (!this.fdsBits.contentEquals(other.fdsBits)) return false
        return true
    }

    override fun hashCode(): Int = this.fdsBits.contentHashCode()
}

public class Passwd internal constructor(
    pwNameCtorArg: MutPtr<CChar>,
    pwPasswdCtorArg: MutPtr<CChar>,
    public var pwUid: UidT,
    public var pwGid: GidT,
    pwGecosCtorArg: MutPtr<CChar>,
    pwDirCtorArg: MutPtr<CChar>,
    pwShellCtorArg: MutPtr<CChar>,
) {
    // Unverified
    public var pwName: MutPtr<CChar> = pwNameCtorArg
        internal set

    public var pwPasswd: MutPtr<CChar> = pwPasswdCtorArg
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
        pwGecosCtorArg = MutPtr(0L),
        pwDirCtorArg = MutPtr(0L),
        pwShellCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.pwName

    public operator fun component2(): MutPtr<CChar> = this.pwPasswd

    public operator fun component3(): UidT = this.pwUid

    public operator fun component4(): GidT = this.pwGid

    public operator fun component5(): MutPtr<CChar> = this.pwGecos

    public operator fun component6(): MutPtr<CChar> = this.pwDir

    public operator fun component7(): MutPtr<CChar> = this.pwShell

    public fun copy(pwName: MutPtr<CChar> = this.pwName, pwPasswd: MutPtr<CChar> = this.pwPasswd, pwUid: UidT = this.pwUid, pwGid: GidT = this.pwGid, pwGecos: MutPtr<CChar> = this.pwGecos, pwDir: MutPtr<CChar> = this.pwDir, pwShell: MutPtr<CChar> = this.pwShell): Passwd = Passwd(pwNameCtorArg = pwName, pwPasswdCtorArg = pwPasswd, pwUid = pwUid, pwGid = pwGid, pwGecosCtorArg = pwGecos, pwDirCtorArg = pwDir, pwShellCtorArg = pwShell)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Passwd) return false
        if (this.pwName != other.pwName) return false
        if (this.pwPasswd != other.pwPasswd) return false
        if (this.pwUid != other.pwUid) return false
        if (this.pwGid != other.pwGid) return false
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
        result = 31 * result + this.pwGecos.hashCode()
        result = 31 * result + this.pwDir.hashCode()
        result = 31 * result + this.pwShell.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwName: MutPtr<CChar> = MutPtr(0L),
            pwPasswd: MutPtr<CChar> = MutPtr(0L),
            pwUid: UidT = 0u,
            pwGid: GidT = 0u,
            pwGecos: MutPtr<CChar> = MutPtr(0L),
            pwDir: MutPtr<CChar> = MutPtr(0L),
            pwShell: MutPtr<CChar> = MutPtr(0L),
        ): Passwd =
            Passwd(
                pwNameCtorArg = pwName,
                pwPasswdCtorArg = pwPasswd,
                pwUid = pwUid,
                pwGid = pwGid,
                pwGecosCtorArg = pwGecos,
                pwDirCtorArg = pwDir,
                pwShellCtorArg = pwShell,
            )
    }
}

public data class Termios(
    // Unverified
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CcT = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
    public var cIspeed: UInt = 0u,
    public var cOspeed: UInt = 0u,
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
}

public data class SemT(
    // Unverified
    public var size: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SemT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SemT> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SemT =
                    SemT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SemT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (16).toInt())
                    ).writeNative(addr, value.size)
                }
            }
    }
}

public class DlInfo internal constructor(
    dliFnameCtorArg: ConstPtr<CChar>,
    dliFbaseCtorArg: MutPtr<CVoid>,
    dliSnameCtorArg: ConstPtr<CChar>,
    dliSaddrCtorArg: MutPtr<CVoid>,
) {
    // Unverified
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
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
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

public data class Utsname(
    // Unverified
    public var sysname: UByteArray = UByteArray(65),
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
                override val sizeBytes: Long = 390L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Utsname =
                    Utsname(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                        ).readNative(addr + 65L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                        ).readNative(addr + 130L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                        ).readNative(addr + 195L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                        ).readNative(addr + 260L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                        ).readNative(addr + 325L),
                    )
                override fun writeNative(addr: Long, value: Utsname) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                    ).writeNative(addr, value.sysname)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                    ).writeNative(addr + 65L, value.nodename)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                    ).writeNative(addr + 130L, value.release)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                    ).writeNative(addr + 195L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                    ).writeNative(addr + 260L, value.machine)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (65).toInt())
                    ).writeNative(addr + 325L, value.domainname)
                }
            }
    }
}

public data class CpuSetT(
    // Unverified
    public var bits: UIntArray = UIntArray(32),
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
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): CpuSetT =
                    CpuSetT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: CpuSetT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                    ).writeNative(addr, value.bits)
                }
            }
    }
}

public class PthreadAttrT internal constructor(
    // Unverified
    public var size: UByteArray,
    public var isInitialized: Int,
    stackaddrCtorArg: MutPtr<CVoid>,
    public var stacksize: Int,
    public var contentionscope: Int,
    public var inheritsched: Int,
    public var schedpolicy: Int,
    public var schedparam: Int,
    public var detachstate: Int,
) {
    public var stackaddr: MutPtr<CVoid> = stackaddrCtorArg
        internal set

    public constructor() : this(
        size = UByteArray(SIZEOF_PTHREAD_ATTR_T),
        isInitialized = 0,
        stackaddrCtorArg = MutPtr(0L),
        stacksize = 0,
        contentionscope = 0,
        inheritsched = 0,
        schedpolicy = 0,
        schedparam = 0,
        detachstate = 0,
    )

    public operator fun component1(): UByteArray = this.size

    public operator fun component2(): Int = this.isInitialized

    public operator fun component3(): MutPtr<CVoid> = this.stackaddr

    public operator fun component4(): Int = this.stacksize

    public operator fun component5(): Int = this.contentionscope

    public operator fun component6(): Int = this.inheritsched

    public operator fun component7(): Int = this.schedpolicy

    public operator fun component8(): Int = this.schedparam

    public operator fun component9(): Int = this.detachstate

    public fun copy(size: UByteArray = this.size, isInitialized: Int = this.isInitialized, stackaddr: MutPtr<CVoid> = this.stackaddr, stacksize: Int = this.stacksize, contentionscope: Int = this.contentionscope, inheritsched: Int = this.inheritsched, schedpolicy: Int = this.schedpolicy, schedparam: Int = this.schedparam, detachstate: Int = this.detachstate): PthreadAttrT = PthreadAttrT(size = size, isInitialized = isInitialized, stackaddrCtorArg = stackaddr, stacksize = stacksize, contentionscope = contentionscope, inheritsched = inheritsched, schedpolicy = schedpolicy, schedparam = schedparam, detachstate = detachstate)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (!this.size.contentEquals(other.size)) return false
        if (this.isInitialized != other.isInitialized) return false
        if (this.stackaddr != other.stackaddr) return false
        if (this.stacksize != other.stacksize) return false
        if (this.contentionscope != other.contentionscope) return false
        if (this.inheritsched != other.inheritsched) return false
        if (this.schedpolicy != other.schedpolicy) return false
        if (this.schedparam != other.schedparam) return false
        if (this.detachstate != other.detachstate) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.contentHashCode()
        result = 31 * result + this.isInitialized.hashCode()
        result = 31 * result + this.stackaddr.hashCode()
        result = 31 * result + this.stacksize.hashCode()
        result = 31 * result + this.contentionscope.hashCode()
        result = 31 * result + this.inheritsched.hashCode()
        result = 31 * result + this.schedpolicy.hashCode()
        result = 31 * result + this.schedparam.hashCode()
        result = 31 * result + this.detachstate.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(
                            (
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(
                                                                            (
                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                    .alignUpBytes(
                                                                                        (
                                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                                .alignUpBytes(
                                                                                                    (
                                                                                                        io.github.kotlinmania.rustlang.core.mem
                                                                                                            .alignUpBytes(
                                                                                                                (
                                                                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                                                                        .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                                                                                ),
                                                                                                                8L,
                                                                                                            ) + 8L
                                                                                                    ),
                                                                                                    4L,
                                                                                                ) + 4L
                                                                                        ),
                                                                                        4L,
                                                                                    ) + 4L
                                                                            ),
                                                                            4L,
                                                                        ) + 4L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        4L,
                                    ) + 4L
                            ),
                            maxOf(maxOf(1L, 4L), 8L),
                        )
                override val alignBytes: Long = maxOf(maxOf(1L, 4L), 8L)
                override fun readNative(addr: Long): PthreadAttrT =
                    PthreadAttrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_ATTR_T).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L),
                        ),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                        ),
                                        8L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                    ),
                                                    8L,
                                                ) + 8L
                                        ),
                                        4L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                                ),
                                                                8L,
                                                            ) + 8L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(
                                                                            (
                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                    .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                                            ),
                                                                            8L,
                                                                        ) + 8L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(
                                                                            (
                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                    .alignUpBytes(
                                                                                        (
                                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                                .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                                                        ),
                                                                                        8L,
                                                                                    ) + 8L
                                                                            ),
                                                                            4L,
                                                                        ) + 4L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(
                                                                            (
                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                    .alignUpBytes(
                                                                                        (
                                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                                .alignUpBytes(
                                                                                                    (
                                                                                                        io.github.kotlinmania.rustlang.core.mem
                                                                                                            .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                                                                    ),
                                                                                                    8L,
                                                                                                ) + 8L
                                                                                        ),
                                                                                        4L,
                                                                                    ) + 4L
                                                                            ),
                                                                            4L,
                                                                        ) + 4L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(
                            addr +
                                io.github.kotlinmania.rustlang.core.mem
                                    .alignUpBytes(
                                        (
                                            io.github.kotlinmania.rustlang.core.mem
                                                .alignUpBytes(
                                                    (
                                                        io.github.kotlinmania.rustlang.core.mem
                                                            .alignUpBytes(
                                                                (
                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                        .alignUpBytes(
                                                                            (
                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                    .alignUpBytes(
                                                                                        (
                                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                                .alignUpBytes(
                                                                                                    (
                                                                                                        io.github.kotlinmania.rustlang.core.mem
                                                                                                            .alignUpBytes(
                                                                                                                (
                                                                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                                                                        .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                                                                                ),
                                                                                                                8L,
                                                                                                            ) + 8L
                                                                                                    ),
                                                                                                    4L,
                                                                                                ) + 4L
                                                                                        ),
                                                                                        4L,
                                                                                    ) + 4L
                                                                            ),
                                                                            4L,
                                                                        ) + 4L
                                                                ),
                                                                4L,
                                                            ) + 4L
                                                    ),
                                                    4L,
                                                ) + 4L
                                        ),
                                        4L,
                                    ),
                        ),
                    )
                override fun writeNative(addr: Long, value: PthreadAttrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_ATTR_T).toInt())
                    ).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L),
                        value.isInitialized,
                    )
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                    ),
                                    8L,
                                ),
                        value.stackaddr,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                ),
                                                8L,
                                            ) + 8L
                                    ),
                                    4L,
                                ),
                        value.stacksize,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                            ),
                                                            8L,
                                                        ) + 8L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    4L,
                                ),
                        value.contentionscope,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(
                                                                        (
                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                                        ),
                                                                        8L,
                                                                    ) + 8L
                                                            ),
                                                            4L,
                                                        ) + 4L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    4L,
                                ),
                        value.inheritsched,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(
                                                                        (
                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                .alignUpBytes(
                                                                                    (
                                                                                        io.github.kotlinmania.rustlang.core.mem
                                                                                            .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                                                    ),
                                                                                    8L,
                                                                                ) + 8L
                                                                        ),
                                                                        4L,
                                                                    ) + 4L
                                                            ),
                                                            4L,
                                                        ) + 4L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    4L,
                                ),
                        value.schedpolicy,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(
                                                                        (
                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                .alignUpBytes(
                                                                                    (
                                                                                        io.github.kotlinmania.rustlang.core.mem
                                                                                            .alignUpBytes(
                                                                                                (
                                                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                                                        .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                                                                ),
                                                                                                8L,
                                                                                            ) + 8L
                                                                                    ),
                                                                                    4L,
                                                                                ) + 4L
                                                                        ),
                                                                        4L,
                                                                    ) + 4L
                                                            ),
                                                            4L,
                                                        ) + 4L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    4L,
                                ),
                        value.schedparam,
                    )
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(
                        addr +
                            io.github.kotlinmania.rustlang.core.mem
                                .alignUpBytes(
                                    (
                                        io.github.kotlinmania.rustlang.core.mem
                                            .alignUpBytes(
                                                (
                                                    io.github.kotlinmania.rustlang.core.mem
                                                        .alignUpBytes(
                                                            (
                                                                io.github.kotlinmania.rustlang.core.mem
                                                                    .alignUpBytes(
                                                                        (
                                                                            io.github.kotlinmania.rustlang.core.mem
                                                                                .alignUpBytes(
                                                                                    (
                                                                                        io.github.kotlinmania.rustlang.core.mem
                                                                                            .alignUpBytes(
                                                                                                (
                                                                                                    io.github.kotlinmania.rustlang.core.mem
                                                                                                        .alignUpBytes(
                                                                                                            (
                                                                                                                io.github.kotlinmania.rustlang.core.mem
                                                                                                                    .alignUpBytes(((SIZEOF_PTHREAD_ATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 4L) + 4L
                                                                                                            ),
                                                                                                            8L,
                                                                                                        ) + 8L
                                                                                                ),
                                                                                                4L,
                                                                                            ) + 4L
                                                                                    ),
                                                                                    4L,
                                                                                ) + 4L
                                                                        ),
                                                                        4L,
                                                                    ) + 4L
                                                            ),
                                                            4L,
                                                        ) + 4L
                                                ),
                                                4L,
                                            ) + 4L
                                    ),
                                    4L,
                                ),
                        value.detachstate,
                    )
                }
            }

        public operator fun invoke(
            size: UByteArray = UByteArray(SIZEOF_PTHREAD_ATTR_T),
            isInitialized: Int = 0,
            stackaddr: MutPtr<CVoid> = MutPtr(0L),
            stacksize: Int = 0,
            contentionscope: Int = 0,
            inheritsched: Int = 0,
            schedpolicy: Int = 0,
            schedparam: Int = 0,
            detachstate: Int = 0,
        ): PthreadAttrT =
            PthreadAttrT(
                size = size,
                isInitialized = isInitialized,
                stackaddrCtorArg = stackaddr,
                stacksize = stacksize,
                contentionscope = contentionscope,
                inheritsched = inheritsched,
                schedpolicy = schedpolicy,
                schedparam = schedparam,
                detachstate = detachstate,
            )
    }
}

public data class PthreadRwlockattrT(
    // Unverified
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_RWLOCKATTR_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockattrT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_RWLOCKATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PthreadRwlockattrT =
                    PthreadRwlockattrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_RWLOCKATTR_T).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockattrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_RWLOCKATTR_T).toInt())
                    ).writeNative(addr, value.size)
                }
            }
    }
}

public data class PthreadMutexT(
    // Unverified
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_MUTEX_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_MUTEX_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PthreadMutexT =
                    PthreadMutexT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_MUTEX_T).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_MUTEX_T).toInt())
                    ).writeNative(addr, value.size)
                }
            }
    }
}

public data class PthreadRwlockT(
    // Unverified
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_RWLOCK_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_RWLOCK_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PthreadRwlockT =
                    PthreadRwlockT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_RWLOCK_T).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_RWLOCK_T).toInt())
                    ).writeNative(addr, value.size)
                }
            }
    }
}

public data class PthreadMutexattrT(
    // Unverified
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_MUTEXATTR_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadMutexattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadMutexattrT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_MUTEXATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): PthreadMutexattrT =
                    PthreadMutexattrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_MUTEXATTR_T).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadMutexattrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_MUTEXATTR_T).toInt())
                    ).writeNative(addr, value.size)
                }
            }
    }
}

public data class PthreadCondT(
    // Unverified
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_COND_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_COND_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), maxOf(8L, 1L))
                override val alignBytes: Long = maxOf(8L, 1L)
                override fun readNative(addr: Long): PthreadCondT =
                    PthreadCondT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_COND_T).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadCondT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_COND_T).toInt())
                    ).writeNative(addr, value.size)
                }
            }
    }
}

public data class PthreadCondattrT(
    // Unverified
    public var size: UByteArray = UByteArray(SIZEOF_PTHREAD_CONDATTR_T),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondattrT) return false
        if (!this.size.contentEquals(other.size)) return false
        return true
    }

    override fun hashCode(): Int = this.size.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadCondattrT> {
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SIZEOF_PTHREAD_CONDATTR_T).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), maxOf(4L, 1L))
                override val alignBytes: Long = maxOf(4L, 1L)
                override fun readNative(addr: Long): PthreadCondattrT =
                    PthreadCondattrT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_CONDATTR_T).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadCondattrT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SIZEOF_PTHREAD_CONDATTR_T).toInt())
                    ).writeNative(addr, value.size)
                }
            }
    }
}
