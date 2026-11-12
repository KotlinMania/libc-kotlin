@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
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
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.haiku.b64.TimeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public data class InAddr(
    public var sAddr: InAddrT = 0u,
)

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class Sockaddr(
    public var saLen: UByte = 0u,
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(30),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saLen != other.saLen) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saLen.hashCode()
        result = 31 * result + this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Sockaddr =
                    Sockaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (30).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Sockaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.saLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.saFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (30).toInt())
                    ).writeNative(addr + 2L, value.saData)
                }
            }
    }
}

public data class SockaddrIn(
    public var sinLen: UByte = 0u,
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
    public var sinZero: ByteArray = ByteArray(24),
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
}

public data class SockaddrIn6(
    public var sin6Len: UByte = 0u,
    public var sin6Family: UByte = 0u,
    public var sin6Port: UShort = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

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
                override val sizeBytes: Long = 48L
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

public class Ifaddrs internal constructor(
    ifaNextCtorArg: MutPtr<Ifaddrs>,
    ifaNameCtorArg: ConstPtr<CChar>,
    public var ifaFlags: CUint,
    ifaAddrCtorArg: MutPtr<Sockaddr>,
    ifaNetmaskCtorArg: MutPtr<Sockaddr>,
    ifaDstaddrCtorArg: MutPtr<Sockaddr>,
    ifaDataCtorArg: MutPtr<CVoid>,
) {
    public var ifaNext: MutPtr<Ifaddrs> = ifaNextCtorArg
        internal set

    public var ifaName: ConstPtr<CChar> = ifaNameCtorArg
        internal set

    public var ifaAddr: MutPtr<Sockaddr> = ifaAddrCtorArg
        internal set

    public var ifaNetmask: MutPtr<Sockaddr> = ifaNetmaskCtorArg
        internal set

    public var ifaDstaddr: MutPtr<Sockaddr> = ifaDstaddrCtorArg
        internal set

    public var ifaData: MutPtr<CVoid> = ifaDataCtorArg
        internal set

    public constructor() : this(
        ifaNextCtorArg = MutPtr(0L),
        ifaNameCtorArg = ConstPtr(0L),
        ifaFlags = 0u,
        ifaAddrCtorArg = MutPtr(0L),
        ifaNetmaskCtorArg = MutPtr(0L),
        ifaDstaddrCtorArg = MutPtr(0L),
        ifaDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Ifaddrs> = this.ifaNext

    public operator fun component2(): ConstPtr<CChar> = this.ifaName

    public operator fun component3(): CUint = this.ifaFlags

    public operator fun component4(): MutPtr<Sockaddr> = this.ifaAddr

    public operator fun component5(): MutPtr<Sockaddr> = this.ifaNetmask

    public operator fun component6(): MutPtr<Sockaddr> = this.ifaDstaddr

    public operator fun component7(): MutPtr<CVoid> = this.ifaData

    public fun copy(ifaNext: MutPtr<Ifaddrs> = this.ifaNext, ifaName: ConstPtr<CChar> = this.ifaName, ifaFlags: CUint = this.ifaFlags, ifaAddr: MutPtr<Sockaddr> = this.ifaAddr, ifaNetmask: MutPtr<Sockaddr> = this.ifaNetmask, ifaDstaddr: MutPtr<Sockaddr> = this.ifaDstaddr, ifaData: MutPtr<CVoid> = this.ifaData): Ifaddrs = Ifaddrs(ifaNextCtorArg = ifaNext, ifaNameCtorArg = ifaName, ifaFlags = ifaFlags, ifaAddrCtorArg = ifaAddr, ifaNetmaskCtorArg = ifaNetmask, ifaDstaddrCtorArg = ifaDstaddr, ifaDataCtorArg = ifaData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Ifaddrs) return false
        if (this.ifaNext != other.ifaNext) return false
        if (this.ifaName != other.ifaName) return false
        if (this.ifaFlags != other.ifaFlags) return false
        if (this.ifaAddr != other.ifaAddr) return false
        if (this.ifaNetmask != other.ifaNetmask) return false
        if (this.ifaDstaddr != other.ifaDstaddr) return false
        if (this.ifaData != other.ifaData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifaNext.hashCode()
        result = 31 * result + this.ifaName.hashCode()
        result = 31 * result + this.ifaFlags.hashCode()
        result = 31 * result + this.ifaAddr.hashCode()
        result = 31 * result + this.ifaNetmask.hashCode()
        result = 31 * result + this.ifaDstaddr.hashCode()
        result = 31 * result + this.ifaData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifaddrs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ifaddrs> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Ifaddrs =
                    Ifaddrs(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Ifaddrs>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Ifaddrs) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Ifaddrs>(64)
                    ).writeNative(addr, value.ifaNext)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.ifaName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ifaFlags)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 24L, value.ifaAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 32L, value.ifaNetmask)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 40L, value.ifaDstaddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.ifaData)
                }
            }

        public operator fun invoke(
            ifaNext: MutPtr<Ifaddrs> = MutPtr(0L),
            ifaName: ConstPtr<CChar> = ConstPtr(0L),
            ifaFlags: CUint = 0u,
            ifaAddr: MutPtr<Sockaddr> = MutPtr(0L),
            ifaNetmask: MutPtr<Sockaddr> = MutPtr(0L),
            ifaDstaddr: MutPtr<Sockaddr> = MutPtr(0L),
            ifaData: MutPtr<CVoid> = MutPtr(0L),
        ): Ifaddrs =
            Ifaddrs(
                ifaNextCtorArg = ifaNext,
                ifaNameCtorArg = ifaName,
                ifaFlags = ifaFlags,
                ifaAddrCtorArg = ifaAddr,
                ifaNetmaskCtorArg = ifaNetmask,
                ifaDstaddrCtorArg = ifaDstaddr,
                ifaDataCtorArg = ifaData,
            )
    }
}

public data class FdSet(
    // size for 1024 bits, and a fdMask with size u32
    public var fdsBits: UIntArray = UIntArray(32),
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
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): FdSet =
                    FdSet(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: FdSet) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (32).toInt())
                    ).writeNative(addr, value.fdsBits)
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
        tmGmtoff = 0,
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

    public operator fun component10(): CInt = this.tmGmtoff

    public operator fun component11(): MutPtr<CChar> = this.tmZone

    public fun copy(tmSec: CInt = this.tmSec, tmMin: CInt = this.tmMin, tmHour: CInt = this.tmHour, tmMday: CInt = this.tmMday, tmMon: CInt = this.tmMon, tmYear: CInt = this.tmYear, tmWday: CInt = this.tmWday, tmYday: CInt = this.tmYday, tmIsdst: CInt = this.tmIsdst, tmGmtoff: CInt = this.tmGmtoff, tmZone: MutPtr<CChar> = this.tmZone): Tm = Tm(tmSec = tmSec, tmMin = tmMin, tmHour = tmHour, tmMday = tmMday, tmMon = tmMon, tmYear = tmYear, tmWday = tmWday, tmYday = tmYday, tmIsdst = tmIsdst, tmGmtoff = tmGmtoff, tmZoneCtorArg = tmZone)

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
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
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
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 40L),
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
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 40L, value.tmZone)
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

public data class Utsname(
    public var sysname: UByteArray = UByteArray(32),
    public var nodename: UByteArray = UByteArray(32),
    public var release: UByteArray = UByteArray(32),
    public var version: UByteArray = UByteArray(32),
    public var machine: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utsname) return false
        if (!this.sysname.contentEquals(other.sysname)) return false
        if (!this.nodename.contentEquals(other.nodename)) return false
        if (!this.release.contentEquals(other.release)) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.machine.contentEquals(other.machine)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sysname.contentHashCode()
        result = 31 * result + this.nodename.contentHashCode()
        result = 31 * result + this.release.contentHashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.machine.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utsname> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Utsname> {
                override val sizeBytes: Long = 160L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Utsname =
                    Utsname(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 64L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                        ).readNative(addr + 128L),
                    )
                override fun writeNative(addr: Long, value: Utsname) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr, value.sysname)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 32L, value.nodename)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 64L, value.release)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 96L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (32).toInt())
                    ).writeNative(addr + 128L, value.machine)
                }
            }
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 89L, value.intPSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8).writeNative(addr + 90L, value.intNCsPrecedes)
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
        msgNamelen = 0u,
        msgIovCtorArg = MutPtr(0L),
        msgIovlen = 0,
        msgControlCtorArg = MutPtr(0L),
        msgControllen = 0u,
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
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Msghdr =
                    Msghdr(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Iovec>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: Msghdr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.msgName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.msgNamelen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Iovec>(64)
                    ).writeNative(addr + 16L, value.msgIov)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.msgIovlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.msgControl)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.msgControllen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.msgFlags)
                }
            }

        public operator fun invoke(
            msgName: MutPtr<CVoid> = MutPtr(0L),
            msgNamelen: SocklenT = 0u,
            msgIov: MutPtr<Iovec> = MutPtr(0L),
            msgIovlen: CInt = 0,
            msgControl: MutPtr<CVoid> = MutPtr(0L),
            msgControllen: SocklenT = 0u,
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
    public var cmsgLen: SocklenT = 0u,
    public var cmsgLevel: CInt = 0,
    public var cmsgType: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Cmsghdr> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Cmsghdr =
                    Cmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Cmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cmsgLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.cmsgLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.cmsgType)
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

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cLine: CChar = 0u,
    public var cIspeed: SpeedT = 0u,
    public var cOspeed: SpeedT = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Termios) return false
        if (this.cIflag != other.cIflag) return false
        if (this.cOflag != other.cOflag) return false
        if (this.cCflag != other.cCflag) return false
        if (this.cLflag != other.cLflag) return false
        if (this.cLine != other.cLine) return false
        if (this.cIspeed != other.cIspeed) return false
        if (this.cOspeed != other.cOspeed) return false
        if (!this.cCc.contentEquals(other.cCc)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cLine.hashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        return result
    }
}

public data class Flock(
    public var lType: CShort = 0,
    public var lWhence: CShort = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
)

public class Stat(
    public var stDev: DevT = 0,
    public var stIno: InoT = 0L,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var stSize: OffT = 0L,
    public var stRdev: DevT = 0,
    public var stBlksize: BlksizeT = 0,
    public var stAtime: TimeT = 0L,
    public var stAtimeNsec: CLong = 0L,
    public var stMtime: TimeT = 0L,
    public var stMtimeNsec: CLong = 0L,
    public var stCtime: TimeT = 0L,
    public var stCtimeNsec: CLong = 0L,
    public var stCrtime: TimeT = 0L,
    public var stCrtimeNsec: CLong = 0L,
    public var stType: UInt = 0u,
    public var stBlocks: BlkcntT = 0L,
)

public class GlobT internal constructor(
    public var glPathc: SizeT,
    public var unused1: SizeT,
    public var glOffs: SizeT,
    public var unused2: SizeT,
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
        unused1 = 0uL,
        glOffs = 0uL,
        unused2 = 0uL,
        glPathvCtorArg = MutPtr(0L),
        unused3CtorArg = MutPtr(0L),
        unused4CtorArg = MutPtr(0L),
        unused5CtorArg = MutPtr(0L),
        unused6CtorArg = MutPtr(0L),
        unused7CtorArg = MutPtr(0L),
        unused8CtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.glPathc

    public operator fun component2(): SizeT = this.unused1

    public operator fun component3(): SizeT = this.glOffs

    public operator fun component4(): SizeT = this.unused2

    public operator fun component5(): MutPtr<MutPtr<CChar>> = this.glPathv

    public operator fun component6(): MutPtr<CVoid> = this.unused3

    public operator fun component7(): MutPtr<CVoid> = this.unused4

    public operator fun component8(): MutPtr<CVoid> = this.unused5

    public operator fun component9(): MutPtr<CVoid> = this.unused6

    public operator fun component10(): MutPtr<CVoid> = this.unused7

    public operator fun component11(): MutPtr<CVoid> = this.unused8

    public fun copy(glPathc: SizeT = this.glPathc, unused1: SizeT = this.unused1, glOffs: SizeT = this.glOffs, unused2: SizeT = this.unused2, glPathv: MutPtr<MutPtr<CChar>> = this.glPathv, unused3: MutPtr<CVoid> = this.unused3, unused4: MutPtr<CVoid> = this.unused4, unused5: MutPtr<CVoid> = this.unused5, unused6: MutPtr<CVoid> = this.unused6, unused7: MutPtr<CVoid> = this.unused7, unused8: MutPtr<CVoid> = this.unused8): GlobT = GlobT(glPathc = glPathc, unused1 = unused1, glOffs = glOffs, unused2 = unused2, glPathvCtorArg = glPathv, unused3CtorArg = unused3, unused4CtorArg = unused4, unused5CtorArg = unused5, unused6CtorArg = unused6, unused7CtorArg = unused7, unused8CtorArg = unused8)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GlobT) return false
        if (this.glPathc != other.glPathc) return false
        if (this.unused1 != other.unused1) return false
        if (this.glOffs != other.glOffs) return false
        if (this.unused2 != other.unused2) return false
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
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.glOffs.hashCode()
        result = 31 * result + this.unused2.hashCode()
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
        public operator fun invoke(
            glPathc: SizeT = 0uL,
            unused1: SizeT = 0uL,
            glOffs: SizeT = 0uL,
            unused2: SizeT = 0uL,
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
                unused1 = unused1,
                glOffs = glOffs,
                unused2 = unused2,
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

public data class PthreadMutexT(
    public var flags: UInt = 0u,
    public var lock: Int = 0,
    public var unused: Int = 0,
    public var owner: Int = 0,
    public var ownerCount: Int = 0,
)

public class PthreadCondT internal constructor(
    public var flags: UInt,
    public var unused: Int,
    mutexCtorArg: MutPtr<CVoid>,
    public var waiterCount: Int,
    public var lock: Int,
) {
    public var mutex: MutPtr<CVoid> = mutexCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        unused = 0,
        mutexCtorArg = MutPtr(0L),
        waiterCount = 0,
        lock = 0,
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Int = this.unused

    public operator fun component3(): MutPtr<CVoid> = this.mutex

    public operator fun component4(): Int = this.waiterCount

    public operator fun component5(): Int = this.lock

    public fun copy(flags: UInt = this.flags, unused: Int = this.unused, mutex: MutPtr<CVoid> = this.mutex, waiterCount: Int = this.waiterCount, lock: Int = this.lock): PthreadCondT = PthreadCondT(flags = flags, unused = unused, mutexCtorArg = mutex, waiterCount = waiterCount, lock = lock)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadCondT) return false
        if (this.flags != other.flags) return false
        if (this.unused != other.unused) return false
        if (this.mutex != other.mutex) return false
        if (this.waiterCount != other.waiterCount) return false
        if (this.lock != other.lock) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.unused.hashCode()
        result = 31 * result + this.mutex.hashCode()
        result = 31 * result + this.waiterCount.hashCode()
        result = 31 * result + this.lock.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: UInt = 0u,
            unused: Int = 0,
            mutex: MutPtr<CVoid> = MutPtr(0L),
            waiterCount: Int = 0,
            lock: Int = 0,
        ): PthreadCondT =
            PthreadCondT(
                flags = flags,
                unused = unused,
                mutexCtorArg = mutex,
                waiterCount = waiterCount,
                lock = lock,
            )
    }
}

public class PthreadRwlockT internal constructor(
    public var flags: UInt,
    public var owner: Int,
    public var lockSem: Int,
    // this is actually a union
    public var lockCount: Int,
    public var readerCount: Int,
    public var writerCount: Int,
    waitersCtorArg: List<MutPtr<CVoid>>,
) {
    public var waiters: List<MutPtr<CVoid>> = waitersCtorArg
        internal set

    public constructor() : this(
        flags = 0u,
        owner = 0,
        lockSem = 0,
        lockCount = 0,
        readerCount = 0,
        writerCount = 0,
        waitersCtorArg = List(2) { MutPtr(0L) },
    )

    public operator fun component1(): UInt = this.flags

    public operator fun component2(): Int = this.owner

    public operator fun component3(): Int = this.lockSem

    public operator fun component4(): Int = this.lockCount

    public operator fun component5(): Int = this.readerCount

    public operator fun component6(): Int = this.writerCount

    public operator fun component7(): List<MutPtr<CVoid>> = this.waiters

    public fun copy(flags: UInt = this.flags, owner: Int = this.owner, lockSem: Int = this.lockSem, lockCount: Int = this.lockCount, readerCount: Int = this.readerCount, writerCount: Int = this.writerCount, waiters: List<MutPtr<CVoid>> = this.waiters): PthreadRwlockT = PthreadRwlockT(flags = flags, owner = owner, lockSem = lockSem, lockCount = lockCount, readerCount = readerCount, writerCount = writerCount, waitersCtorArg = waiters)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (this.flags != other.flags) return false
        if (this.owner != other.owner) return false
        if (this.lockSem != other.lockSem) return false
        if (this.lockCount != other.lockCount) return false
        if (this.readerCount != other.readerCount) return false
        if (this.writerCount != other.writerCount) return false
        if (this.waiters != other.waiters) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.owner.hashCode()
        result = 31 * result + this.lockSem.hashCode()
        result = 31 * result + this.lockCount.hashCode()
        result = 31 * result + this.readerCount.hashCode()
        result = 31 * result + this.writerCount.hashCode()
        result = 31 * result + this.waiters.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): PthreadRwlockT =
                    PthreadRwlockT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CVoid>(64),
                                    (2).toInt(),
                                )
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.owner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.lockSem)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.lockCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.readerCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.writerCount)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CVoid>(64),
                                (2).toInt(),
                            )
                    ).writeNative(addr + 24L, value.waiters)
                }
            }

        public operator fun invoke(
            flags: UInt = 0u,
            owner: Int = 0,
            lockSem: Int = 0,
            lockCount: Int = 0,
            readerCount: Int = 0,
            writerCount: Int = 0,
            waiters: List<MutPtr<CVoid>> = List(2) { MutPtr(0L) },
        ): PthreadRwlockT =
            PthreadRwlockT(
                flags = flags,
                owner = owner,
                lockSem = lockSem,
                lockCount = lockCount,
                readerCount = readerCount,
                writerCount = writerCount,
                waitersCtorArg = waiters,
            )
    }
}

public data class PthreadSpinlockT(
    public var lock: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadSpinlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadSpinlockT> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): PthreadSpinlockT =
                    PthreadSpinlockT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: PthreadSpinlockT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.lock)
                }
            }
    }
}

public class Passwd internal constructor(
    pwNameCtorArg: MutPtr<CChar>,
    pwPasswdCtorArg: MutPtr<CChar>,
    public var pwUid: UidT,
    public var pwGid: GidT,
    pwDirCtorArg: MutPtr<CChar>,
    pwShellCtorArg: MutPtr<CChar>,
    pwGecosCtorArg: MutPtr<CChar>,
) {
    public var pwName: MutPtr<CChar> = pwNameCtorArg
        internal set

    public var pwPasswd: MutPtr<CChar> = pwPasswdCtorArg
        internal set

    public var pwDir: MutPtr<CChar> = pwDirCtorArg
        internal set

    public var pwShell: MutPtr<CChar> = pwShellCtorArg
        internal set

    public var pwGecos: MutPtr<CChar> = pwGecosCtorArg
        internal set

    public constructor() : this(
        pwNameCtorArg = MutPtr(0L),
        pwPasswdCtorArg = MutPtr(0L),
        pwUid = 0u,
        pwGid = 0u,
        pwDirCtorArg = MutPtr(0L),
        pwShellCtorArg = MutPtr(0L),
        pwGecosCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.pwName

    public operator fun component2(): MutPtr<CChar> = this.pwPasswd

    public operator fun component3(): UidT = this.pwUid

    public operator fun component4(): GidT = this.pwGid

    public operator fun component5(): MutPtr<CChar> = this.pwDir

    public operator fun component6(): MutPtr<CChar> = this.pwShell

    public operator fun component7(): MutPtr<CChar> = this.pwGecos

    public fun copy(pwName: MutPtr<CChar> = this.pwName, pwPasswd: MutPtr<CChar> = this.pwPasswd, pwUid: UidT = this.pwUid, pwGid: GidT = this.pwGid, pwDir: MutPtr<CChar> = this.pwDir, pwShell: MutPtr<CChar> = this.pwShell, pwGecos: MutPtr<CChar> = this.pwGecos): Passwd = Passwd(pwNameCtorArg = pwName, pwPasswdCtorArg = pwPasswd, pwUid = pwUid, pwGid = pwGid, pwDirCtorArg = pwDir, pwShellCtorArg = pwShell, pwGecosCtorArg = pwGecos)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Passwd) return false
        if (this.pwName != other.pwName) return false
        if (this.pwPasswd != other.pwPasswd) return false
        if (this.pwUid != other.pwUid) return false
        if (this.pwGid != other.pwGid) return false
        if (this.pwDir != other.pwDir) return false
        if (this.pwShell != other.pwShell) return false
        if (this.pwGecos != other.pwGecos) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pwName.hashCode()
        result = 31 * result + this.pwPasswd.hashCode()
        result = 31 * result + this.pwUid.hashCode()
        result = 31 * result + this.pwGid.hashCode()
        result = 31 * result + this.pwDir.hashCode()
        result = 31 * result + this.pwShell.hashCode()
        result = 31 * result + this.pwGecos.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            pwName: MutPtr<CChar> = MutPtr(0L),
            pwPasswd: MutPtr<CChar> = MutPtr(0L),
            pwUid: UidT = 0u,
            pwGid: GidT = 0u,
            pwDir: MutPtr<CChar> = MutPtr(0L),
            pwShell: MutPtr<CChar> = MutPtr(0L),
            pwGecos: MutPtr<CChar> = MutPtr(0L),
        ): Passwd =
            Passwd(
                pwNameCtorArg = pwName,
                pwPasswdCtorArg = pwPasswd,
                pwUid = pwUid,
                pwGid = pwGid,
                pwDirCtorArg = pwDir,
                pwShellCtorArg = pwShell,
                pwGecosCtorArg = pwGecos,
            )
    }
}

public data class Statvfs(
    public var fBsize: CUlong = 0uL,
    public var fFrsize: CUlong = 0uL,
    public var fBlocks: FsblkcntT = 0L,
    public var fBfree: FsblkcntT = 0L,
    public var fBavail: FsblkcntT = 0L,
    public var fFiles: FsfilcntT = 0L,
    public var fFfree: FsfilcntT = 0L,
    public var fFavail: FsfilcntT = 0L,
    public var fFsid: CUlong = 0uL,
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
)

public class StackT internal constructor(
    ssSpCtorArg: MutPtr<CVoid>,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
) {
    public var ssSp: MutPtr<CVoid> = ssSpCtorArg
        internal set

    public constructor() : this(
        ssSpCtorArg = MutPtr(0L),
        ssSize = 0uL,
        ssFlags = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.ssSp

    public operator fun component2(): SizeT = this.ssSize

    public operator fun component3(): CInt = this.ssFlags

    public fun copy(ssSp: MutPtr<CVoid> = this.ssSp, ssSize: SizeT = this.ssSize, ssFlags: CInt = this.ssFlags): StackT = StackT(ssSpCtorArg = ssSp, ssSize = ssSize, ssFlags = ssFlags)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is StackT) return false
        if (this.ssSp != other.ssSp) return false
        if (this.ssSize != other.ssSize) return false
        if (this.ssFlags != other.ssFlags) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssSp.hashCode()
        result = 31 * result + this.ssSize.hashCode()
        result = 31 * result + this.ssFlags.hashCode()
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: StackT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.ssSp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.ssSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.ssFlags)
                }
            }

        public operator fun invoke(
            ssSp: MutPtr<CVoid> = MutPtr(0L),
            ssSize: SizeT = 0uL,
            ssFlags: CInt = 0,
        ): StackT =
            StackT(
                ssSpCtorArg = ssSp,
                ssSize = ssSize,
                ssFlags = ssFlags,
            )
    }
}

public class SiginfoT internal constructor(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siErrno: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    siAddrCtorArg: MutPtr<CVoid>,
    public var siStatus: CInt,
    public var siBand: CLong,
    sigvalCtorArg: MutPtr<CVoid>,
) {
    public var siAddr: MutPtr<CVoid> = siAddrCtorArg
        internal set

    public var sigval: MutPtr<CVoid> = sigvalCtorArg
        internal set

    public constructor() : this(
        siSigno = 0,
        siCode = 0,
        siErrno = 0,
        siPid = 0,
        siUid = 0u,
        siAddrCtorArg = MutPtr(0L),
        siStatus = 0,
        siBand = 0L,
        sigvalCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.siSigno

    public operator fun component2(): CInt = this.siCode

    public operator fun component3(): CInt = this.siErrno

    public operator fun component4(): PidT = this.siPid

    public operator fun component5(): UidT = this.siUid

    public operator fun component6(): MutPtr<CVoid> = this.siAddr

    public operator fun component7(): CInt = this.siStatus

    public operator fun component8(): CLong = this.siBand

    public operator fun component9(): MutPtr<CVoid> = this.sigval

    public fun copy(siSigno: CInt = this.siSigno, siCode: CInt = this.siCode, siErrno: CInt = this.siErrno, siPid: PidT = this.siPid, siUid: UidT = this.siUid, siAddr: MutPtr<CVoid> = this.siAddr, siStatus: CInt = this.siStatus, siBand: CLong = this.siBand, sigval: MutPtr<CVoid> = this.sigval): SiginfoT = SiginfoT(siSigno = siSigno, siCode = siCode, siErrno = siErrno, siPid = siPid, siUid = siUid, siAddrCtorArg = siAddr, siStatus = siStatus, siBand = siBand, sigvalCtorArg = sigval)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siErrno != other.siErrno) return false
        if (this.siPid != other.siPid) return false
        if (this.siUid != other.siUid) return false
        if (this.siAddr != other.siAddr) return false
        if (this.siStatus != other.siStatus) return false
        if (this.siBand != other.siBand) return false
        if (this.sigval != other.sigval) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.siPid.hashCode()
        result = 31 * result + this.siUid.hashCode()
        result = 31 * result + this.siAddr.hashCode()
        result = 31 * result + this.siStatus.hashCode()
        result = 31 * result + this.siBand.hashCode()
        result = 31 * result + this.sigval.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            siSigno: CInt = 0,
            siCode: CInt = 0,
            siErrno: CInt = 0,
            siPid: PidT = 0,
            siUid: UidT = 0u,
            siAddr: MutPtr<CVoid> = MutPtr(0L),
            siStatus: CInt = 0,
            siBand: CLong = 0L,
            sigval: MutPtr<CVoid> = MutPtr(0L),
        ): SiginfoT =
            SiginfoT(
                siSigno = siSigno,
                siCode = siCode,
                siErrno = siErrno,
                siPid = siPid,
                siUid = siUid,
                siAddrCtorArg = siAddr,
                siStatus = siStatus,
                siBand = siBand,
                sigvalCtorArg = sigval,
            )
    }
}

public class Sigaction internal constructor(
    public var saSigaction: SighandlerT,
    // actually a union with saHandler
    public var saMask: SigsetT,
    public var saFlags: CInt,
    saUserdataCtorArg: MutPtr<CVoid>,
) {
    public var saUserdata: MutPtr<CVoid> = saUserdataCtorArg
        internal set

    public constructor() : this(
        saSigaction = 0uL,
        saMask = 0uL,
        saFlags = 0,
        saUserdataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): SighandlerT = this.saSigaction

    public operator fun component2(): SigsetT = this.saMask

    public operator fun component3(): CInt = this.saFlags

    public operator fun component4(): MutPtr<CVoid> = this.saUserdata

    public fun copy(saSigaction: SighandlerT = this.saSigaction, saMask: SigsetT = this.saMask, saFlags: CInt = this.saFlags, saUserdata: MutPtr<CVoid> = this.saUserdata): Sigaction = Sigaction(saSigaction = saSigaction, saMask = saMask, saFlags = saFlags, saUserdataCtorArg = saUserdata)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigaction) return false
        if (this.saSigaction != other.saSigaction) return false
        if (this.saMask != other.saMask) return false
        if (this.saFlags != other.saFlags) return false
        if (this.saUserdata != other.saUserdata) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saSigaction.hashCode()
        result = 31 * result + this.saMask.hashCode()
        result = 31 * result + this.saFlags.hashCode()
        result = 31 * result + this.saUserdata.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            saSigaction: SighandlerT = 0uL,
            saMask: SigsetT = 0uL,
            saFlags: CInt = 0,
            saUserdata: MutPtr<CVoid> = MutPtr(0L),
        ): Sigaction =
            Sigaction(
                saSigaction = saSigaction,
                saMask = saMask,
                saFlags = saFlags,
                saUserdataCtorArg = saUserdata,
            )
    }
}

public data class SemT(
    public var type: Int = 0,
    public var namedSemId: Int = 0,
    // actually a union with unnamedSem (i32)
    public var padding: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SemT) return false
        if (this.type != other.type) return false
        if (this.namedSemId != other.namedSemId) return false
        if (!this.padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.type.hashCode()
        result = 31 * result + this.namedSemId.hashCode()
        result = 31 * result + this.padding.contentHashCode()
        return result
    }
}

public data class Ucred(
    public var pid: PidT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
)

public data class SockaddrDl(
    public var sdlLen: UByte = 0u,
    public var sdlFamily: UByte = 0u,
    public var sdlEType: UShort = 0u,
    public var sdlIndex: UInt = 0u,
    public var sdlType: UByte = 0u,
    public var sdlNlen: UByte = 0u,
    public var sdlAlen: UByte = 0u,
    public var sdlSlen: UByte = 0u,
    public var sdlData: UByteArray = UByteArray(46),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrDl) return false
        if (this.sdlLen != other.sdlLen) return false
        if (this.sdlFamily != other.sdlFamily) return false
        if (this.sdlEType != other.sdlEType) return false
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
        result = 31 * result + this.sdlEType.hashCode()
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
                override val sizeBytes: Long = 60L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SockaddrDl =
                    SockaddrDl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 11L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (46).toInt())
                        ).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SockaddrDl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sdlLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sdlFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sdlEType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sdlIndex)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.sdlType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.sdlNlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 10L, value.sdlAlen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 11L, value.sdlSlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (46).toInt())
                    ).writeNative(addr + 12L, value.sdlData)
                }
            }
    }
}

public class Spwd internal constructor(
    spNampCtorArg: MutPtr<CChar>,
    spPwdpCtorArg: MutPtr<CChar>,
    public var spLstchg: CInt,
    public var spMin: CInt,
    public var spMax: CInt,
    public var spWarn: CInt,
    public var spInact: CInt,
    public var spExpire: CInt,
    public var spFlag: CInt,
) {
    public var spNamp: MutPtr<CChar> = spNampCtorArg
        internal set

    public var spPwdp: MutPtr<CChar> = spPwdpCtorArg
        internal set

    public constructor() : this(
        spNampCtorArg = MutPtr(0L),
        spPwdpCtorArg = MutPtr(0L),
        spLstchg = 0,
        spMin = 0,
        spMax = 0,
        spWarn = 0,
        spInact = 0,
        spExpire = 0,
        spFlag = 0,
    )

    public operator fun component1(): MutPtr<CChar> = this.spNamp

    public operator fun component2(): MutPtr<CChar> = this.spPwdp

    public operator fun component3(): CInt = this.spLstchg

    public operator fun component4(): CInt = this.spMin

    public operator fun component5(): CInt = this.spMax

    public operator fun component6(): CInt = this.spWarn

    public operator fun component7(): CInt = this.spInact

    public operator fun component8(): CInt = this.spExpire

    public operator fun component9(): CInt = this.spFlag

    public fun copy(spNamp: MutPtr<CChar> = this.spNamp, spPwdp: MutPtr<CChar> = this.spPwdp, spLstchg: CInt = this.spLstchg, spMin: CInt = this.spMin, spMax: CInt = this.spMax, spWarn: CInt = this.spWarn, spInact: CInt = this.spInact, spExpire: CInt = this.spExpire, spFlag: CInt = this.spFlag): Spwd = Spwd(spNampCtorArg = spNamp, spPwdpCtorArg = spPwdp, spLstchg = spLstchg, spMin = spMin, spMax = spMax, spWarn = spWarn, spInact = spInact, spExpire = spExpire, spFlag = spFlag)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Spwd) return false
        if (this.spNamp != other.spNamp) return false
        if (this.spPwdp != other.spPwdp) return false
        if (this.spLstchg != other.spLstchg) return false
        if (this.spMin != other.spMin) return false
        if (this.spMax != other.spMax) return false
        if (this.spWarn != other.spWarn) return false
        if (this.spInact != other.spInact) return false
        if (this.spExpire != other.spExpire) return false
        if (this.spFlag != other.spFlag) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.spNamp.hashCode()
        result = 31 * result + this.spPwdp.hashCode()
        result = 31 * result + this.spLstchg.hashCode()
        result = 31 * result + this.spMin.hashCode()
        result = 31 * result + this.spMax.hashCode()
        result = 31 * result + this.spWarn.hashCode()
        result = 31 * result + this.spInact.hashCode()
        result = 31 * result + this.spExpire.hashCode()
        result = 31 * result + this.spFlag.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Spwd> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Spwd> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Spwd =
                    Spwd(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Spwd) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.spNamp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.spPwdp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.spLstchg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.spMin)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.spMax)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.spWarn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.spInact)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.spExpire)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.spFlag)
                }
            }

        public operator fun invoke(
            spNamp: MutPtr<CChar> = MutPtr(0L),
            spPwdp: MutPtr<CChar> = MutPtr(0L),
            spLstchg: CInt = 0,
            spMin: CInt = 0,
            spMax: CInt = 0,
            spWarn: CInt = 0,
            spInact: CInt = 0,
            spExpire: CInt = 0,
            spFlag: CInt = 0,
        ): Spwd =
            Spwd(
                spNampCtorArg = spNamp,
                spPwdpCtorArg = spPwdp,
                spLstchg = spLstchg,
                spMin = spMin,
                spMax = spMax,
                spWarn = spWarn,
                spInact = spInact,
                spExpire = spExpire,
                spFlag = spFlag,
            )
    }
}

public class RegexT internal constructor(
    bufferCtorArg: MutPtr<CVoid>,
    public var allocated: SizeT,
    public var used: SizeT,
    public var syntax: CUlong,
    fastmapCtorArg: MutPtr<CChar>,
    translateCtorArg: MutPtr<CChar>,
    public var reNsub: SizeT,
    public var bitfield: UByte,
) {
    public var buffer: MutPtr<CVoid> = bufferCtorArg
        internal set

    public var fastmap: MutPtr<CChar> = fastmapCtorArg
        internal set

    public var translate: MutPtr<CChar> = translateCtorArg
        internal set

    public constructor() : this(
        bufferCtorArg = MutPtr(0L),
        allocated = 0uL,
        used = 0uL,
        syntax = 0uL,
        fastmapCtorArg = MutPtr(0L),
        translateCtorArg = MutPtr(0L),
        reNsub = 0uL,
        bitfield = 0u,
    )

    public operator fun component1(): MutPtr<CVoid> = this.buffer

    public operator fun component2(): SizeT = this.allocated

    public operator fun component3(): SizeT = this.used

    public operator fun component4(): CUlong = this.syntax

    public operator fun component5(): MutPtr<CChar> = this.fastmap

    public operator fun component6(): MutPtr<CChar> = this.translate

    public operator fun component7(): SizeT = this.reNsub

    public operator fun component8(): UByte = this.bitfield

    public fun copy(buffer: MutPtr<CVoid> = this.buffer, allocated: SizeT = this.allocated, used: SizeT = this.used, syntax: CUlong = this.syntax, fastmap: MutPtr<CChar> = this.fastmap, translate: MutPtr<CChar> = this.translate, reNsub: SizeT = this.reNsub, bitfield: UByte = this.bitfield): RegexT = RegexT(bufferCtorArg = buffer, allocated = allocated, used = used, syntax = syntax, fastmapCtorArg = fastmap, translateCtorArg = translate, reNsub = reNsub, bitfield = bitfield)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegexT) return false
        if (this.buffer != other.buffer) return false
        if (this.allocated != other.allocated) return false
        if (this.used != other.used) return false
        if (this.syntax != other.syntax) return false
        if (this.fastmap != other.fastmap) return false
        if (this.translate != other.translate) return false
        if (this.reNsub != other.reNsub) return false
        if (this.bitfield != other.bitfield) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buffer.hashCode()
        result = 31 * result + this.allocated.hashCode()
        result = 31 * result + this.used.hashCode()
        result = 31 * result + this.syntax.hashCode()
        result = 31 * result + this.fastmap.hashCode()
        result = 31 * result + this.translate.hashCode()
        result = 31 * result + this.reNsub.hashCode()
        result = 31 * result + this.bitfield.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            buffer: MutPtr<CVoid> = MutPtr(0L),
            allocated: SizeT = 0uL,
            used: SizeT = 0uL,
            syntax: CUlong = 0uL,
            fastmap: MutPtr<CChar> = MutPtr(0L),
            translate: MutPtr<CChar> = MutPtr(0L),
            reNsub: SizeT = 0uL,
            bitfield: UByte = 0u,
        ): RegexT =
            RegexT(
                bufferCtorArg = buffer,
                allocated = allocated,
                used = used,
                syntax = syntax,
                fastmapCtorArg = fastmap,
                translateCtorArg = translate,
                reNsub = reNsub,
                bitfield = bitfield,
            )
    }
}

public data class RegmatchT(
    public var rmSo: RegoffT = 0,
    public var rmEo: RegoffT = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegmatchT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegmatchT> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RegmatchT =
                    RegmatchT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: RegmatchT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.rmSo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.rmEo)
                }
            }
    }
}

public data class MsqidDs(
    public var msgPerm: IpcPerm = IpcPerm(),
    public var msgQnum: MsgqnumT = 0u,
    public var msgQbytes: MsglenT = 0u,
    public var msgLspid: PidT = 0,
    public var msgLrpid: PidT = 0,
    public var msgStime: TimeT = 0L,
    public var msgRtime: TimeT = 0L,
    public var msgCtime: TimeT = 0L,
)

public data class IpcPerm(
    public var key: KeyT = 0,
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
)

public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sembuf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sembuf> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): Sembuf =
                    Sembuf(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Sembuf) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.semNum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.semOp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.semFlg)
                }
            }
    }
}

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
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
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

public class Option internal constructor(
    nameCtorArg: ConstPtr<CChar>,
    public var hasArg: CInt,
    flagCtorArg: MutPtr<CInt>,
    public var value: CInt,
) {
    public var name: ConstPtr<CChar> = nameCtorArg
        internal set

    public var flag: MutPtr<CInt> = flagCtorArg
        internal set

    public constructor() : this(
        nameCtorArg = ConstPtr(0L),
        hasArg = 0,
        flagCtorArg = MutPtr(0L),
        value = 0,
    )

    public operator fun component1(): ConstPtr<CChar> = this.name

    public operator fun component2(): CInt = this.hasArg

    public operator fun component3(): MutPtr<CInt> = this.flag

    public operator fun component4(): CInt = this.value

    public fun copy(name: ConstPtr<CChar> = this.name, hasArg: CInt = this.hasArg, flag: MutPtr<CInt> = this.flag, value: CInt = this.value): Option = Option(nameCtorArg = name, hasArg = hasArg, flagCtorArg = flag, value = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Option) return false
        if (this.name != other.name) return false
        if (this.hasArg != other.hasArg) return false
        if (this.flag != other.flag) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.hashCode()
        result = 31 * result + this.hasArg.hashCode()
        result = 31 * result + this.flag.hashCode()
        result = 31 * result + this.value.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Option> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Option> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Option =
                    Option(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CInt>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: Option) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.hasArg)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CInt>(64)
                    ).writeNative(addr + 16L, value.flag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.value)
                }
            }

        public operator fun invoke(
            name: ConstPtr<CChar> = ConstPtr(0L),
            hasArg: CInt = 0,
            flag: MutPtr<CInt> = MutPtr(0L),
            value: CInt = 0,
        ): Option =
            Option(
                nameCtorArg = name,
                hasArg = hasArg,
                flagCtorArg = flag,
                value = value,
            )
    }
}

public data class SockaddrUn(
    public var sunLen: UByte = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(126),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrUn) return false
        if (this.sunLen != other.sunLen) return false
        if (this.sunFamily != other.sunFamily) return false
        if (!this.sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sunLen.hashCode()
        result = 31 * result + this.sunFamily.hashCode()
        result = 31 * result + this.sunPath.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrUn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrUn> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): SockaddrUn =
                    SockaddrUn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (126).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: SockaddrUn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sunLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sunFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (126).toInt())
                    ).writeNative(addr + 2L, value.sunPath)
                }
            }
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssPad2: ULong = 0uL,
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
}

public data class Dirent(
    public var dDev: DevT = 0,
    public var dPdev: DevT = 0,
    public var dIno: InoT = 0L,
    public var dPino: Long = 0L,
    public var dReclen: CUshort = 0u,
    public var dName: UByteArray = UByteArray(1024),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dDev != other.dDev) return false
        if (this.dPdev != other.dPdev) return false
        if (this.dIno != other.dIno) return false
        if (this.dPino != other.dPino) return false
        if (this.dReclen != other.dReclen) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dDev.hashCode()
        result = 31 * result + this.dPdev.hashCode()
        result = 31 * result + this.dIno.hashCode()
        result = 31 * result + this.dPino.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val sizeBytes: Long = 1056L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1024).toInt())
                        ).readNative(addr + 26L),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.dDev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.dPdev)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.dIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.dPino)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.dReclen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I8, (1024).toInt())
                    ).writeNative(addr + 26L, value.dName)
                }
            }
    }
}

public class Sigevent internal constructor(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    unused1CtorArg: MutPtr<CVoid>,
    sigevNotifyAttributesCtorArg: MutPtr<PthreadAttrT>,
) {
    public var unused1: MutPtr<CVoid> = unused1CtorArg
        internal set

    // actually a function pointer
    public var sigevNotifyAttributes: MutPtr<PthreadAttrT> = sigevNotifyAttributesCtorArg
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

    public operator fun component5(): MutPtr<PthreadAttrT> = this.sigevNotifyAttributes

    public fun copy(sigevNotify: CInt = this.sigevNotify, sigevSigno: CInt = this.sigevSigno, sigevValue: Sigval = this.sigevValue, unused1: MutPtr<CVoid> = this.unused1, sigevNotifyAttributes: MutPtr<PthreadAttrT> = this.sigevNotifyAttributes): Sigevent = Sigevent(sigevNotify = sigevNotify, sigevSigno = sigevSigno, sigevValue = sigevValue, unused1CtorArg = unused1, sigevNotifyAttributesCtorArg = sigevNotifyAttributes)

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
            sigevNotifyAttributes: MutPtr<PthreadAttrT> = MutPtr(0L),
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

public data class Utmpx(
    public var utType: CShort = 0,
    public var utTv: Timeval = Timeval(),
    public var utId: UByteArray = UByteArray(8),
    public var utPid: PidT = 0,
    public var utUser: UByteArray = UByteArray(32),
    public var utLine: UByteArray = UByteArray(16),
    public var utHost: UByteArray = UByteArray(128),
    public var utReserved: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Utmpx) return false
        if (this.utType != other.utType) return false
        if (this.utTv != other.utTv) return false
        if (!this.utId.contentEquals(other.utId)) return false
        if (this.utPid != other.utPid) return false
        if (!this.utUser.contentEquals(other.utUser)) return false
        if (!this.utLine.contentEquals(other.utLine)) return false
        if (!this.utHost.contentEquals(other.utHost)) return false
        if (!this.utReserved.contentEquals(other.utReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.utType.hashCode()
        result = 31 * result + this.utTv.hashCode()
        result = 31 * result + this.utId.contentHashCode()
        result = 31 * result + this.utPid.hashCode()
        result = 31 * result + this.utUser.contentHashCode()
        result = 31 * result + this.utLine.contentHashCode()
        result = 31 * result + this.utHost.contentHashCode()
        result = 31 * result + this.utReserved.contentHashCode()
        return result
    }
}
