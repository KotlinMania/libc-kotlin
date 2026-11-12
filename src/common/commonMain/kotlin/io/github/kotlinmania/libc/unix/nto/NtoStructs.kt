@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.I128
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.In6Addr
import io.github.kotlinmania.libc.unix.InAddrT
import io.github.kotlinmania.libc.unix.InPortT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SighandlerT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.nto.aarch64.McontextT
import io.github.kotlinmania.libc.unix.nto.aarch64.StackT
import io.github.kotlinmania.libc.unix.nto.aarch64.TimeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface GlobTGlErrfuncCallback {
    public operator fun invoke(arg0: ConstPtr<CChar>, arg1: CInt): CInt
}

public fun interface ThreadAttrExitfuncCallback {
    public operator fun invoke(fake: MutPtr<CVoid>)
}

// intentionally not public, only used for fdSet
// QNX Network Stack Versioning:
//
// The `if` block targets the legacy `io - pkt` stack.
// - targetEnv = "nto70": QNX 7.0
// - targetEnv = "nto71": Standard QNX 7.1 (default legacy stack)
//
// The `else` block targets the modern `io - sock` stack.
// - targetEnv = "nto71Iosock": QNX 7.1 with the optional new stack
// - targetEnv = "nto80": QNX 8.0
public data class DirentExtra(
    public var dDatalen: UShort = 0u,
    public var dType: UShort = 0u,
    public var dReserved: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DirentExtra> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DirentExtra> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): DirentExtra =
                    DirentExtra(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: DirentExtra) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.dDatalen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.dType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.dReserved)
                }
            }
    }
}

public class Stat(
    public var stIno: InoT = 0uL,
    public var stSize: OffT = 0L,
    public var stDev: DevT = 0u,
    public var stRdev: DevT = 0u,
    public var stUid: UidT = 0u,
    public var stGid: GidT = 0u,
    public var oldStMtime: Time32t = 0u,
    public var oldStAtime: Time32t = 0u,
    public var oldStCtime: Time32t = 0u,
    public var stMode: ModeT = 0u,
    public var stNlink: NlinkT = 0u,
    public var stBlocksize: BlksizeT = 0u,
    public var stNblocks: Int = 0,
    public var stBlksize: BlksizeT = 0u,
    public var stBlocks: BlkcntT = 0uL,
    public var stMtim: Timespec = Timespec(),
    public var stAtim: Timespec = Timespec(),
    public var stCtim: Timespec = Timespec(),
)

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

public data class Sockaddr(
    public var saLen: UByte = 0u,
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(14),
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
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Sockaddr =
                    Sockaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Sockaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.saLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.saFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 2L, value.saData.toList())
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

public data class SockaddrIn6(
    public var sin6Len: UByte = 0u,
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: UInt = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: UInt = 0u,
)

// The order of the `aiAddr` field in this struct is crucial
// for converting between the Rust and C types.
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

public data class FdSet(
    public var fdsBits: UIntArray = UIntArray(2 * FD_SETSIZE / ULONG_SIZE),
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
                override val alignBytes: Long = 4L
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((2 * FD_SETSIZE / ULONG_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).strideBytes), 4L)
                override fun readNative(addr: Long): FdSet =
                    FdSet(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2 * FD_SETSIZE / ULONG_SIZE).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: FdSet) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2 * FD_SETSIZE / ULONG_SIZE).toInt())
                    ).writeNative(addr, value.fdsBits.toList())
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

public data class SchedParam(
    public var schedPriority: CInt = 0,
    public var schedCurpriority: CInt = 0,
    public var reserved: IntArray = IntArray(10),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SchedParam) return false
        if (this.schedPriority != other.schedPriority) return false
        if (this.schedCurpriority != other.schedCurpriority) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.schedPriority.hashCode()
        result = 31 * result + this.schedCurpriority.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SchedParam> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SchedParam =
                    SchedParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (10).toInt())
                        ).readNative(addr + 8L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: SchedParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.schedPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.schedCurpriority)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (10).toInt())
                    ).writeNative(addr + 8L, value.reserved.toList())
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

public class Lconv internal constructor(
    currencySymbolCtorArg: MutPtr<CChar>,
    intCurrSymbolCtorArg: MutPtr<CChar>,
    monDecimalPointCtorArg: MutPtr<CChar>,
    monGroupingCtorArg: MutPtr<CChar>,
    monThousandsSepCtorArg: MutPtr<CChar>,
    negativeSignCtorArg: MutPtr<CChar>,
    positiveSignCtorArg: MutPtr<CChar>,
    public var fracDigits: CChar,
    public var intFracDigits: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var nSignPosn: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intNSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intPSignPosn: CChar,
    decimalPointCtorArg: MutPtr<CChar>,
    groupingCtorArg: MutPtr<CChar>,
    thousandsSepCtorArg: MutPtr<CChar>,
    fracGroupingCtorArg: MutPtr<CChar>,
    fracSepCtorArg: MutPtr<CChar>,
    falseValCtorArg: MutPtr<CChar>,
    trueValCtorArg: MutPtr<CChar>,
    noCtorArg: MutPtr<CChar>,
    yesCtorArg: MutPtr<CChar>,
    nostrCtorArg: MutPtr<CChar>,
    yesstrCtorArg: MutPtr<CChar>,
    reservedCtorArg: List<MutPtr<CChar>>,
) {
    public var currencySymbol: MutPtr<CChar> = currencySymbolCtorArg
        internal set

    public var intCurrSymbol: MutPtr<CChar> = intCurrSymbolCtorArg
        internal set

    public var monDecimalPoint: MutPtr<CChar> = monDecimalPointCtorArg
        internal set

    public var monGrouping: MutPtr<CChar> = monGroupingCtorArg
        internal set

    public var monThousandsSep: MutPtr<CChar> = monThousandsSepCtorArg
        internal set

    public var negativeSign: MutPtr<CChar> = negativeSignCtorArg
        internal set

    public var positiveSign: MutPtr<CChar> = positiveSignCtorArg
        internal set

    public var decimalPoint: MutPtr<CChar> = decimalPointCtorArg
        internal set

    public var grouping: MutPtr<CChar> = groupingCtorArg
        internal set

    public var thousandsSep: MutPtr<CChar> = thousandsSepCtorArg
        internal set

    public var fracGrouping: MutPtr<CChar> = fracGroupingCtorArg
        internal set

    public var fracSep: MutPtr<CChar> = fracSepCtorArg
        internal set

    public var falseVal: MutPtr<CChar> = falseValCtorArg
        internal set

    public var trueVal: MutPtr<CChar> = trueValCtorArg
        internal set

    public var no: MutPtr<CChar> = noCtorArg
        internal set

    public var yes: MutPtr<CChar> = yesCtorArg
        internal set

    public var nostr: MutPtr<CChar> = nostrCtorArg
        internal set

    public var yesstr: MutPtr<CChar> = yesstrCtorArg
        internal set

    public var reserved: List<MutPtr<CChar>> = reservedCtorArg
        internal set

    public constructor() : this(
        currencySymbolCtorArg = MutPtr(0L),
        intCurrSymbolCtorArg = MutPtr(0L),
        monDecimalPointCtorArg = MutPtr(0L),
        monGroupingCtorArg = MutPtr(0L),
        monThousandsSepCtorArg = MutPtr(0L),
        negativeSignCtorArg = MutPtr(0L),
        positiveSignCtorArg = MutPtr(0L),
        fracDigits = 0u,
        intFracDigits = 0u,
        nCsPrecedes = 0u,
        nSepBySpace = 0u,
        nSignPosn = 0u,
        pCsPrecedes = 0u,
        pSepBySpace = 0u,
        pSignPosn = 0u,
        intNCsPrecedes = 0u,
        intNSepBySpace = 0u,
        intNSignPosn = 0u,
        intPCsPrecedes = 0u,
        intPSepBySpace = 0u,
        intPSignPosn = 0u,
        decimalPointCtorArg = MutPtr(0L),
        groupingCtorArg = MutPtr(0L),
        thousandsSepCtorArg = MutPtr(0L),
        fracGroupingCtorArg = MutPtr(0L),
        fracSepCtorArg = MutPtr(0L),
        falseValCtorArg = MutPtr(0L),
        trueValCtorArg = MutPtr(0L),
        noCtorArg = MutPtr(0L),
        yesCtorArg = MutPtr(0L),
        nostrCtorArg = MutPtr(0L),
        yesstrCtorArg = MutPtr(0L),
        reservedCtorArg = List(8) { MutPtr(0L) },
    )

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lconv> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Lconv> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 224L
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 57L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 59L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 61L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 62L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 63L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 65L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 66L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 67L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 69L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 80L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 104L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 112L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 120L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 136L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 144L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 152L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                        .mutPtrLayout<CChar>(64),
                                    (8).toInt(),
                                )
                        ).readNative(addr + 160L),
                    )
                override fun writeNative(addr: Long, value: Lconv) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr, value.currencySymbol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 8L, value.intCurrSymbol)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.monDecimalPoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 24L, value.monGrouping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 32L, value.monThousandsSep)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 40L, value.negativeSign)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 48L, value.positiveSign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 56L, value.fracDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 57L, value.intFracDigits)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 58L, value.nCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 59L, value.nSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 60L, value.nSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 61L, value.pCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 62L, value.pSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 63L, value.pSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 64L, value.intNCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 65L, value.intNSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 66L, value.intNSignPosn)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 67L, value.intPCsPrecedes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 68L, value.intPSepBySpace)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 69L, value.intPSignPosn)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 72L, value.decimalPoint)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 80L, value.grouping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 88L, value.thousandsSep)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 96L, value.fracGrouping)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 104L, value.fracSep)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 112L, value.falseVal)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 120L, value.trueVal)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 128L, value.no)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 136L, value.yes)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 144L, value.nostr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 152L, value.yesstr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                    .mutPtrLayout<CChar>(64),
                                (8).toInt(),
                            )
                    ).writeNative(addr + 160L, value.reserved)
                }
            }

        public operator fun invoke(
            currencySymbol: MutPtr<CChar> = MutPtr(0L),
            intCurrSymbol: MutPtr<CChar> = MutPtr(0L),
            monDecimalPoint: MutPtr<CChar> = MutPtr(0L),
            monGrouping: MutPtr<CChar> = MutPtr(0L),
            monThousandsSep: MutPtr<CChar> = MutPtr(0L),
            negativeSign: MutPtr<CChar> = MutPtr(0L),
            positiveSign: MutPtr<CChar> = MutPtr(0L),
            fracDigits: CChar = 0u,
            intFracDigits: CChar = 0u,
            nCsPrecedes: CChar = 0u,
            nSepBySpace: CChar = 0u,
            nSignPosn: CChar = 0u,
            pCsPrecedes: CChar = 0u,
            pSepBySpace: CChar = 0u,
            pSignPosn: CChar = 0u,
            intNCsPrecedes: CChar = 0u,
            intNSepBySpace: CChar = 0u,
            intNSignPosn: CChar = 0u,
            intPCsPrecedes: CChar = 0u,
            intPSepBySpace: CChar = 0u,
            intPSignPosn: CChar = 0u,
            decimalPoint: MutPtr<CChar> = MutPtr(0L),
            grouping: MutPtr<CChar> = MutPtr(0L),
            thousandsSep: MutPtr<CChar> = MutPtr(0L),
            fracGrouping: MutPtr<CChar> = MutPtr(0L),
            fracSep: MutPtr<CChar> = MutPtr(0L),
            falseVal: MutPtr<CChar> = MutPtr(0L),
            trueVal: MutPtr<CChar> = MutPtr(0L),
            no: MutPtr<CChar> = MutPtr(0L),
            yes: MutPtr<CChar> = MutPtr(0L),
            nostr: MutPtr<CChar> = MutPtr(0L),
            yesstr: MutPtr<CChar> = MutPtr(0L),
            reserved: List<MutPtr<CChar>> = List(8) { MutPtr(0L) },
        ): Lconv =
            Lconv(
                currencySymbolCtorArg = currencySymbol,
                intCurrSymbolCtorArg = intCurrSymbol,
                monDecimalPointCtorArg = monDecimalPoint,
                monGroupingCtorArg = monGrouping,
                monThousandsSepCtorArg = monThousandsSep,
                negativeSignCtorArg = negativeSign,
                positiveSignCtorArg = positiveSign,
                fracDigits = fracDigits,
                intFracDigits = intFracDigits,
                nCsPrecedes = nCsPrecedes,
                nSepBySpace = nSepBySpace,
                nSignPosn = nSignPosn,
                pCsPrecedes = pCsPrecedes,
                pSepBySpace = pSepBySpace,
                pSignPosn = pSignPosn,
                intNCsPrecedes = intNCsPrecedes,
                intNSepBySpace = intNSepBySpace,
                intNSignPosn = intNSignPosn,
                intPCsPrecedes = intPCsPrecedes,
                intPSepBySpace = intPSepBySpace,
                intPSignPosn = intPSignPosn,
                decimalPointCtorArg = decimalPoint,
                groupingCtorArg = grouping,
                thousandsSepCtorArg = thousandsSep,
                fracGroupingCtorArg = fracGrouping,
                fracSepCtorArg = fracSep,
                falseValCtorArg = falseVal,
                trueValCtorArg = trueVal,
                noCtorArg = no,
                yesCtorArg = yes,
                nostrCtorArg = nostr,
                yesstrCtorArg = yesstr,
                reservedCtorArg = reserved,
            )
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

public class Ifaddrs internal constructor(
    ifaNextCtorArg: MutPtr<Ifaddrs>,
    ifaNameCtorArg: MutPtr<CChar>,
    public var ifaFlags: CUint,
    ifaAddrCtorArg: MutPtr<Sockaddr>,
    ifaNetmaskCtorArg: MutPtr<Sockaddr>,
    ifaDstaddrCtorArg: MutPtr<Sockaddr>,
    ifaDataCtorArg: MutPtr<CVoid>,
) {
    public var ifaNext: MutPtr<Ifaddrs> = ifaNextCtorArg
        internal set

    public var ifaName: MutPtr<CChar> = ifaNameCtorArg
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
        ifaNameCtorArg = MutPtr(0L),
        ifaFlags = 0u,
        ifaAddrCtorArg = MutPtr(0L),
        ifaNetmaskCtorArg = MutPtr(0L),
        ifaDstaddrCtorArg = MutPtr(0L),
        ifaDataCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<Ifaddrs> = this.ifaNext

    public operator fun component2(): MutPtr<CChar> = this.ifaName

    public operator fun component3(): CUint = this.ifaFlags

    public operator fun component4(): MutPtr<Sockaddr> = this.ifaAddr

    public operator fun component5(): MutPtr<Sockaddr> = this.ifaNetmask

    public operator fun component6(): MutPtr<Sockaddr> = this.ifaDstaddr

    public operator fun component7(): MutPtr<CVoid> = this.ifaData

    public fun copy(ifaNext: MutPtr<Ifaddrs> = this.ifaNext, ifaName: MutPtr<CChar> = this.ifaName, ifaFlags: CUint = this.ifaFlags, ifaAddr: MutPtr<Sockaddr> = this.ifaAddr, ifaNetmask: MutPtr<Sockaddr> = this.ifaNetmask, ifaDstaddr: MutPtr<Sockaddr> = this.ifaDstaddr, ifaData: MutPtr<CVoid> = this.ifaData): Ifaddrs = Ifaddrs(ifaNextCtorArg = ifaNext, ifaNameCtorArg = ifaName, ifaFlags = ifaFlags, ifaAddrCtorArg = ifaAddr, ifaNetmaskCtorArg = ifaNetmask, ifaDstaddrCtorArg = ifaDstaddr, ifaDataCtorArg = ifaData)

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
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Ifaddrs =
                    Ifaddrs(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Ifaddrs>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
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
                            .mutPtrLayout<CChar>(64)
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
            ifaName: MutPtr<CChar> = MutPtr(0L),
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

public data class Arpreq(
    public var arpPa: Sockaddr = Sockaddr(),
    public var arpHa: Sockaddr = Sockaddr(),
    public var arpFlags: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arpreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Arpreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): Arpreq =
                    Arpreq(
                        (Sockaddr.typeLayout()).readNative(addr),
                        (Sockaddr.typeLayout()).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: Arpreq) {
                    (Sockaddr.typeLayout()).writeNative(addr, value.arpPa)
                    (Sockaddr.typeLayout()).writeNative(addr + 16L, value.arpHa)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.arpFlags)
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

public data class Mmsghdr(
    public var msgHdr: Msghdr = Msghdr(),
    public var msgLen: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mmsghdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 56L
                override fun readNative(addr: Long): Mmsghdr =
                    Mmsghdr(
                        (Msghdr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: Mmsghdr) {
                    (Msghdr.typeLayout()).writeNative(addr, value.msgHdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.msgLen)
                }
            }
    }
}

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siErrno: CInt = 0,
    public var data: UByteArray = UByteArray(36),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SiginfoT) return false
        if (this.siSigno != other.siSigno) return false
        if (this.siCode != other.siCode) return false
        if (this.siErrno != other.siErrno) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.siSigno.hashCode()
        result = 31 * result + this.siCode.hashCode()
        result = 31 * result + this.siErrno.hashCode()
        result = 31 * result + this.data.contentHashCode()
        return result
    }

    public fun siAddr(): MutPtr<CVoid> {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val out =
            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                .mutPtrLayout<CVoid>(64)
                .readNative(scratch + 32L)
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
        val out = Sigval.typeLayout().readNative(scratch + 32L)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public fun siPid(): PidT {
        val sz = maxOf(64L, typeLayout().sizeBytes)
        val scratch =
            io.github.kotlinmania.rustlang.core.intrinsics
                .kmAlloc(sz, 8L)
        typeLayout().writeNative(scratch, this)
        val out =
            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32
                .readNative(scratch + 16L)
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
        val out =
            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32
                .readNative(scratch + 24L)
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
        val out =
            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32
                .readNative(scratch + 28L)
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmDealloc(scratch, sz, 8L)
        return out
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SiginfoT =
                    SiginfoT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                        ).readNative(addr + 12L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.siErrno)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (36).toInt())
                    ).writeNative(addr + 12L, value.data.toList())
                }
            }
    }
}

public data class Sigaction(
    public var saSigaction: SighandlerT = 0uL,
    public var saFlags: CInt = 0,
    public var saMask: SigsetT = SigsetT(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigaction> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigaction> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Sigaction =
                    Sigaction(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (SigsetT.typeLayout()).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Sigaction) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.saSigaction)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.saFlags)
                    (SigsetT.typeLayout()).writeNative(addr + 12L, value.saMask)
                }
            }
    }
}

public data class Sync(
    public var union: CUint = 0u,
    public var owner: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sync> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sync> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Sync =
                    Sync(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Sync) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.union)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.owner)
                }
            }
    }
}

public data class Rlimit64(
    public var rlimCur: Rlim64T = 0uL,
    public var rlimMax: Rlim64T = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rlimit64> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Rlimit64> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Rlimit64 =
                    Rlimit64(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Rlimit64) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.rlimCur)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.rlimMax)
                }
            }
    }
}

public class GlobT internal constructor(
    public var glPathc: SizeT,
    public var glMatchc: CInt,
    glPathvCtorArg: MutPtr<MutPtr<CChar>>,
    public var glOffs: SizeT,
    public var glFlags: CInt,
    public var glErrfunc: GlobTGlErrfuncCallback,
    unused1CtorArg: MutPtr<CVoid>,
    unused2CtorArg: MutPtr<CVoid>,
    unused3CtorArg: MutPtr<CVoid>,
    unused4CtorArg: MutPtr<CVoid>,
    unused5CtorArg: MutPtr<CVoid>,
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

    public constructor() : this(
        glPathc = 0uL,
        glMatchc = 0,
        glPathvCtorArg = MutPtr(0L),
        glOffs = 0uL,
        glFlags = 0,
        glErrfunc = GlobTGlErrfuncCallback { _, _ -> 0 },
        unused1CtorArg = MutPtr(0L),
        unused2CtorArg = MutPtr(0L),
        unused3CtorArg = MutPtr(0L),
        unused4CtorArg = MutPtr(0L),
        unused5CtorArg = MutPtr(0L),
    )

    public operator fun component1(): SizeT = this.glPathc

    public operator fun component2(): CInt = this.glMatchc

    public operator fun component3(): MutPtr<MutPtr<CChar>> = this.glPathv

    public operator fun component4(): SizeT = this.glOffs

    public operator fun component5(): CInt = this.glFlags

    public operator fun component6(): GlobTGlErrfuncCallback = this.glErrfunc

    public operator fun component7(): MutPtr<CVoid> = this.unused1

    public operator fun component8(): MutPtr<CVoid> = this.unused2

    public operator fun component9(): MutPtr<CVoid> = this.unused3

    public operator fun component10(): MutPtr<CVoid> = this.unused4

    public operator fun component11(): MutPtr<CVoid> = this.unused5

    public fun copy(glPathc: SizeT = this.glPathc, glMatchc: CInt = this.glMatchc, glPathv: MutPtr<MutPtr<CChar>> = this.glPathv, glOffs: SizeT = this.glOffs, glFlags: CInt = this.glFlags, glErrfunc: GlobTGlErrfuncCallback = this.glErrfunc, unused1: MutPtr<CVoid> = this.unused1, unused2: MutPtr<CVoid> = this.unused2, unused3: MutPtr<CVoid> = this.unused3, unused4: MutPtr<CVoid> = this.unused4, unused5: MutPtr<CVoid> = this.unused5): GlobT = GlobT(glPathc = glPathc, glMatchc = glMatchc, glPathvCtorArg = glPathv, glOffs = glOffs, glFlags = glFlags, glErrfunc = glErrfunc, unused1CtorArg = unused1, unused2CtorArg = unused2, unused3CtorArg = unused3, unused4CtorArg = unused4, unused5CtorArg = unused5)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GlobT) return false
        if (this.glPathc != other.glPathc) return false
        if (this.glMatchc != other.glMatchc) return false
        if (this.glPathv != other.glPathv) return false
        if (this.glOffs != other.glOffs) return false
        if (this.glFlags != other.glFlags) return false
        if (this.glErrfunc != other.glErrfunc) return false
        if (this.unused1 != other.unused1) return false
        if (this.unused2 != other.unused2) return false
        if (this.unused3 != other.unused3) return false
        if (this.unused4 != other.unused4) return false
        if (this.unused5 != other.unused5) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.glPathc.hashCode()
        result = 31 * result + this.glMatchc.hashCode()
        result = 31 * result + this.glPathv.hashCode()
        result = 31 * result + this.glOffs.hashCode()
        result = 31 * result + this.glFlags.hashCode()
        result = 31 * result + this.glErrfunc.hashCode()
        result = 31 * result + this.unused1.hashCode()
        result = 31 * result + this.unused2.hashCode()
        result = 31 * result + this.unused3.hashCode()
        result = 31 * result + this.unused4.hashCode()
        result = 31 * result + this.unused5.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            glPathc: SizeT = 0uL,
            glMatchc: CInt = 0,
            glPathv: MutPtr<MutPtr<CChar>> = MutPtr(0L),
            glOffs: SizeT = 0uL,
            glFlags: CInt = 0,
            glErrfunc: GlobTGlErrfuncCallback = GlobTGlErrfuncCallback { _, _ -> 0 },
            unused1: MutPtr<CVoid> = MutPtr(0L),
            unused2: MutPtr<CVoid> = MutPtr(0L),
            unused3: MutPtr<CVoid> = MutPtr(0L),
            unused4: MutPtr<CVoid> = MutPtr(0L),
            unused5: MutPtr<CVoid> = MutPtr(0L),
        ): GlobT =
            GlobT(
                glPathc = glPathc,
                glMatchc = glMatchc,
                glPathvCtorArg = glPathv,
                glOffs = glOffs,
                glFlags = glFlags,
                glErrfunc = glErrfunc,
                unused1CtorArg = unused1,
                unused2CtorArg = unused2,
                unused3CtorArg = unused3,
                unused4CtorArg = unused4,
                unused5CtorArg = unused5,
            )
    }
}

public class Passwd internal constructor(
    pwNameCtorArg: MutPtr<CChar>,
    pwPasswdCtorArg: MutPtr<CChar>,
    public var pwUid: UidT,
    public var pwGid: GidT,
    pwAgeCtorArg: MutPtr<CChar>,
    pwCommentCtorArg: MutPtr<CChar>,
    pwGecosCtorArg: MutPtr<CChar>,
    pwDirCtorArg: MutPtr<CChar>,
    pwShellCtorArg: MutPtr<CChar>,
) {
    public var pwName: MutPtr<CChar> = pwNameCtorArg
        internal set

    public var pwPasswd: MutPtr<CChar> = pwPasswdCtorArg
        internal set

    public var pwAge: MutPtr<CChar> = pwAgeCtorArg
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
        pwAgeCtorArg = MutPtr(0L),
        pwCommentCtorArg = MutPtr(0L),
        pwGecosCtorArg = MutPtr(0L),
        pwDirCtorArg = MutPtr(0L),
        pwShellCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CChar> = this.pwName

    public operator fun component2(): MutPtr<CChar> = this.pwPasswd

    public operator fun component3(): UidT = this.pwUid

    public operator fun component4(): GidT = this.pwGid

    public operator fun component5(): MutPtr<CChar> = this.pwAge

    public operator fun component6(): MutPtr<CChar> = this.pwComment

    public operator fun component7(): MutPtr<CChar> = this.pwGecos

    public operator fun component8(): MutPtr<CChar> = this.pwDir

    public operator fun component9(): MutPtr<CChar> = this.pwShell

    public fun copy(pwName: MutPtr<CChar> = this.pwName, pwPasswd: MutPtr<CChar> = this.pwPasswd, pwUid: UidT = this.pwUid, pwGid: GidT = this.pwGid, pwAge: MutPtr<CChar> = this.pwAge, pwComment: MutPtr<CChar> = this.pwComment, pwGecos: MutPtr<CChar> = this.pwGecos, pwDir: MutPtr<CChar> = this.pwDir, pwShell: MutPtr<CChar> = this.pwShell): Passwd = Passwd(pwNameCtorArg = pwName, pwPasswdCtorArg = pwPasswd, pwUid = pwUid, pwGid = pwGid, pwAgeCtorArg = pwAge, pwCommentCtorArg = pwComment, pwGecosCtorArg = pwGecos, pwDirCtorArg = pwDir, pwShellCtorArg = pwShell)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Passwd) return false
        if (this.pwName != other.pwName) return false
        if (this.pwPasswd != other.pwPasswd) return false
        if (this.pwUid != other.pwUid) return false
        if (this.pwGid != other.pwGid) return false
        if (this.pwAge != other.pwAge) return false
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
        result = 31 * result + this.pwAge.hashCode()
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
                override val sizeBytes: Long = 64L
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
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 56L),
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
                    ).writeNative(addr + 24L, value.pwAge)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 32L, value.pwComment)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 40L, value.pwGecos)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 48L, value.pwDir)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 56L, value.pwShell)
                }
            }

        public operator fun invoke(
            pwName: MutPtr<CChar> = MutPtr(0L),
            pwPasswd: MutPtr<CChar> = MutPtr(0L),
            pwUid: UidT = 0u,
            pwGid: GidT = 0u,
            pwAge: MutPtr<CChar> = MutPtr(0L),
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
                pwAgeCtorArg = pwAge,
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

public data class Sembuf(
    public var semNum: CUshort = 0u,
    public var semOp: CShort = 0,
    public var semFlg: CShort = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sembuf> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sembuf> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 6L
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

public data class Elf32Ehdr(
    public var eIdent: UByteArray = UByteArray(16),
    public var eType: Elf32Half = 0u,
    public var eMachine: Elf32Half = 0u,
    public var eVersion: Elf32Word = 0u,
    public var eEntry: Elf32Addr = 0u,
    public var ePhoff: Elf32Off = 0u,
    public var eShoff: Elf32Off = 0u,
    public var eFlags: Elf32Word = 0u,
    public var eEhsize: Elf32Half = 0u,
    public var ePhentsize: Elf32Half = 0u,
    public var ePhnum: Elf32Half = 0u,
    public var eShentsize: Elf32Half = 0u,
    public var eShnum: Elf32Half = 0u,
    public var eShstrndx: Elf32Half = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elf32Ehdr) return false
        if (!this.eIdent.contentEquals(other.eIdent)) return false
        if (this.eType != other.eType) return false
        if (this.eMachine != other.eMachine) return false
        if (this.eVersion != other.eVersion) return false
        if (this.eEntry != other.eEntry) return false
        if (this.ePhoff != other.ePhoff) return false
        if (this.eShoff != other.eShoff) return false
        if (this.eFlags != other.eFlags) return false
        if (this.eEhsize != other.eEhsize) return false
        if (this.ePhentsize != other.ePhentsize) return false
        if (this.ePhnum != other.ePhnum) return false
        if (this.eShentsize != other.eShentsize) return false
        if (this.eShnum != other.eShnum) return false
        if (this.eShstrndx != other.eShstrndx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eIdent.contentHashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eMachine.hashCode()
        result = 31 * result + this.eVersion.hashCode()
        result = 31 * result + this.eEntry.hashCode()
        result = 31 * result + this.ePhoff.hashCode()
        result = 31 * result + this.eShoff.hashCode()
        result = 31 * result + this.eFlags.hashCode()
        result = 31 * result + this.eEhsize.hashCode()
        result = 31 * result + this.ePhentsize.hashCode()
        result = 31 * result + this.ePhnum.hashCode()
        result = 31 * result + this.eShentsize.hashCode()
        result = 31 * result + this.eShnum.hashCode()
        result = 31 * result + this.eShstrndx.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Ehdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Ehdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 52L
                override fun readNative(addr: Long): Elf32Ehdr =
                    Elf32Ehdr(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 42L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 46L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 50L),
                    )
                override fun writeNative(addr: Long, value: Elf32Ehdr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.eIdent.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.eType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.eMachine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.eVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.eEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.ePhoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.eShoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.eFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 40L, value.eEhsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 42L, value.ePhentsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 44L, value.ePhnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 46L, value.eShentsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 48L, value.eShnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 50L, value.eShstrndx)
                }
            }
    }
}

public data class Elf64Ehdr(
    public var eIdent: UByteArray = UByteArray(16),
    public var eType: Elf64Half = 0u,
    public var eMachine: Elf64Half = 0u,
    public var eVersion: Elf64Word = 0u,
    public var eEntry: Elf64Addr = 0uL,
    public var ePhoff: Elf64Off = 0uL,
    public var eShoff: Elf64Off = 0uL,
    public var eFlags: Elf64Word = 0u,
    public var eEhsize: Elf64Half = 0u,
    public var ePhentsize: Elf64Half = 0u,
    public var ePhnum: Elf64Half = 0u,
    public var eShentsize: Elf64Half = 0u,
    public var eShnum: Elf64Half = 0u,
    public var eShstrndx: Elf64Half = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elf64Ehdr) return false
        if (!this.eIdent.contentEquals(other.eIdent)) return false
        if (this.eType != other.eType) return false
        if (this.eMachine != other.eMachine) return false
        if (this.eVersion != other.eVersion) return false
        if (this.eEntry != other.eEntry) return false
        if (this.ePhoff != other.ePhoff) return false
        if (this.eShoff != other.eShoff) return false
        if (this.eFlags != other.eFlags) return false
        if (this.eEhsize != other.eEhsize) return false
        if (this.ePhentsize != other.ePhentsize) return false
        if (this.ePhnum != other.ePhnum) return false
        if (this.eShentsize != other.eShentsize) return false
        if (this.eShnum != other.eShnum) return false
        if (this.eShstrndx != other.eShstrndx) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.eIdent.contentHashCode()
        result = 31 * result + this.eType.hashCode()
        result = 31 * result + this.eMachine.hashCode()
        result = 31 * result + this.eVersion.hashCode()
        result = 31 * result + this.eEntry.hashCode()
        result = 31 * result + this.ePhoff.hashCode()
        result = 31 * result + this.eShoff.hashCode()
        result = 31 * result + this.eFlags.hashCode()
        result = 31 * result + this.eEhsize.hashCode()
        result = 31 * result + this.ePhentsize.hashCode()
        result = 31 * result + this.ePhnum.hashCode()
        result = 31 * result + this.eShentsize.hashCode()
        result = 31 * result + this.eShnum.hashCode()
        result = 31 * result + this.eShstrndx.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Ehdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Ehdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Elf64Ehdr =
                    Elf64Ehdr(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 54L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 58L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 62L),
                    )
                override fun writeNative(addr: Long, value: Elf64Ehdr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.eIdent.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.eType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.eMachine)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.eVersion)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.eEntry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.ePhoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 40L, value.eShoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.eFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 52L, value.eEhsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 54L, value.ePhentsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 56L, value.ePhnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 58L, value.eShentsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 60L, value.eShnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 62L, value.eShstrndx)
                }
            }
    }
}

public data class Elf32Sym(
    public var stName: Elf32Word = 0u,
    public var stValue: Elf32Addr = 0u,
    public var stSize: Elf32Word = 0u,
    public var stInfo: CUchar = 0u,
    public var stOther: CUchar = 0u,
    public var stShndx: Elf32Section = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Sym> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Sym> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Elf32Sym =
                    Elf32Sym(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 13L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 14L),
                    )
                override fun writeNative(addr: Long, value: Elf32Sym) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.stName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.stValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.stSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 12L, value.stInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 13L, value.stOther)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 14L, value.stShndx)
                }
            }
    }
}

public data class Elf64Sym(
    public var stName: Elf64Word = 0u,
    public var stInfo: CUchar = 0u,
    public var stOther: CUchar = 0u,
    public var stShndx: Elf64Section = 0u,
    public var stValue: Elf64Addr = 0uL,
    public var stSize: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Sym> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Sym> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Elf64Sym =
                    Elf64Sym(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 5L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Elf64Sym) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.stName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 4L, value.stInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 5L, value.stOther)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.stShndx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.stValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.stSize)
                }
            }
    }
}

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

public data class Elf32Shdr(
    public var shName: Elf32Word = 0u,
    public var shType: Elf32Word = 0u,
    public var shFlags: Elf32Word = 0u,
    public var shAddr: Elf32Addr = 0u,
    public var shOffset: Elf32Off = 0u,
    public var shSize: Elf32Word = 0u,
    public var shLink: Elf32Word = 0u,
    public var shInfo: Elf32Word = 0u,
    public var shAddralign: Elf32Word = 0u,
    public var shEntsize: Elf32Word = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Shdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf32Shdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Elf32Shdr =
                    Elf32Shdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                    )
                override fun writeNative(addr: Long, value: Elf32Shdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.shName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.shType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.shFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.shAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.shOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.shSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.shLink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.shInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.shAddralign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.shEntsize)
                }
            }
    }
}

public data class Elf64Shdr(
    public var shName: Elf64Word = 0u,
    public var shType: Elf64Word = 0u,
    public var shFlags: Elf64Xword = 0uL,
    public var shAddr: Elf64Addr = 0uL,
    public var shOffset: Elf64Off = 0uL,
    public var shSize: Elf64Xword = 0uL,
    public var shLink: Elf64Word = 0u,
    public var shInfo: Elf64Word = 0u,
    public var shAddralign: Elf64Xword = 0uL,
    public var shEntsize: Elf64Xword = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Shdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Elf64Shdr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 64L
                override fun readNative(addr: Long): Elf64Shdr =
                    Elf64Shdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: Elf64Shdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.shName)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.shType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.shFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.shAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.shOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 32L, value.shSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.shLink)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.shInfo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 48L, value.shAddralign)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.shEntsize)
                }
            }
    }
}

public data class In6Pktinfo(
    public var ipi6Addr: In6Addr = In6Addr(),
    public var ipi6Ifindex: CUint = 0u,
)

public data class InotifyEvent(
    public var wd: CInt = 0,
    public var mask: UInt = 0u,
    public var cookie: UInt = 0u,
    public var len: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InotifyEvent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InotifyEvent> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): InotifyEvent =
                    InotifyEvent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: InotifyEvent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.wd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.mask)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cookie)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.len)
                }
            }
    }
}

public data class RegmatchT(
    public var rmSo: RegoffT = 0L,
    public var rmEo: RegoffT = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegmatchT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegmatchT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): RegmatchT =
                    RegmatchT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: RegmatchT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.rmSo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.rmEo)
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
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
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
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
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

public data class Termios(
    public var cIflag: TcflagT = 0u,
    public var cOflag: TcflagT = 0u,
    public var cCflag: TcflagT = 0u,
    public var cLflag: TcflagT = 0u,
    public var cCc: UByteArray = UByteArray(NCCS),
    public var reserved: UIntArray = UIntArray(3),
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
        if (!this.cCc.contentEquals(other.cCc)) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (this.cIspeed != other.cIspeed) return false
        if (this.cOspeed != other.cOspeed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.cIflag.hashCode()
        result = 31 * result + this.cOflag.hashCode()
        result = 31 * result + this.cCflag.hashCode()
        result = 31 * result + this.cLflag.hashCode()
        result = 31 * result + this.cCc.contentHashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.cIspeed.hashCode()
        result = 31 * result + this.cOspeed.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Termios> {
                override val alignBytes: Long = 4L
                private val off5: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((16L + ((NCCS).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 4L)
                private val off6: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off5 + 12L), 4L)
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
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (NCCS).toInt())
                        ).readNative(addr + 16L).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                        ).readNative(addr + off5).toUIntArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off6),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + off7),
                    )
                override fun writeNative(addr: Long, value: Termios) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.cIflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.cOflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cCflag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.cLflag)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (NCCS).toInt())
                    ).writeNative(addr + 16L, value.cCc.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (3).toInt())
                    ).writeNative(addr + off5, value.reserved.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off6, value.cIspeed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + off7, value.cOspeed)
                }
            }
    }
}

public data class Mallinfo(
    public var arena: CInt = 0,
    public var ordblks: CInt = 0,
    public var smblks: CInt = 0,
    public var hblks: CInt = 0,
    public var hblkhd: CInt = 0,
    public var usmblks: CInt = 0,
    public var fsmblks: CInt = 0,
    public var uordblks: CInt = 0,
    public var fordblks: CInt = 0,
    public var keepcost: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mallinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mallinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 40L
                override fun readNative(addr: Long): Mallinfo =
                    Mallinfo(
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
                    )
                override fun writeNative(addr: Long, value: Mallinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.arena)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.ordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.smblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.hblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.hblkhd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.usmblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.fsmblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.uordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 32L, value.fordblks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 36L, value.keepcost)
                }
            }
    }
}

public data class Flock(
    public var lType: Short = 0,
    public var lWhence: Short = 0,
    public var lZero1: Int = 0,
    public var lStart: OffT = 0L,
    public var lLen: OffT = 0L,
    public var lPid: PidT = 0,
    public var lSysid: UInt = 0u,
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
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: Flock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.lType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.lWhence)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lZero1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.lStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.lLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.lPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.lSysid)
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
    public var fBasetype: UByteArray = UByteArray(16),
    public var fFlag: CUlong = 0uL,
    public var fNamemax: CUlong = 0uL,
    public var fFiller: UIntArray = UIntArray(21),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Statvfs) return false
        if (this.fBsize != other.fBsize) return false
        if (this.fFrsize != other.fFrsize) return false
        if (this.fBlocks != other.fBlocks) return false
        if (this.fBfree != other.fBfree) return false
        if (this.fBavail != other.fBavail) return false
        if (this.fFiles != other.fFiles) return false
        if (this.fFfree != other.fFfree) return false
        if (this.fFavail != other.fFavail) return false
        if (this.fFsid != other.fFsid) return false
        if (!this.fBasetype.contentEquals(other.fBasetype)) return false
        if (this.fFlag != other.fFlag) return false
        if (this.fNamemax != other.fNamemax) return false
        if (!this.fFiller.contentEquals(other.fFiller)) return false
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
        result = 31 * result + this.fBasetype.contentHashCode()
        result = 31 * result + this.fFlag.hashCode()
        result = 31 * result + this.fNamemax.hashCode()
        result = 31 * result + this.fFiller.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Statvfs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 192L
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
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr + 72L).toUByteArray(),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 96L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (21).toInt())
                        ).readNative(addr + 104L).toUIntArray(),
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
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr + 72L, value.fBasetype.toList())
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 88L, value.fFlag)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 96L, value.fNamemax)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (21).toInt())
                    ).writeNative(addr + 104L, value.fFiller.toList())
                }
            }
    }
}

public class Aiocb internal constructor(
    public var aioFildes: CInt,
    public var aioReqprio: CInt,
    public var aioOffset: OffT,
    aioBufCtorArg: MutPtr<CVoid>,
    public var aioNbytes: SizeT,
    public var aioSigevent: Sigevent,
    public var aioLioOpcode: CInt,
    aioLioStateCtorArg: MutPtr<CVoid>,
    public var aioPad: IntArray,
    aioNextCtorArg: MutPtr<Aiocb>,
    public var aioFlag: CUint,
    public var aioIotype: CUint,
    public var aioResult: SsizeT,
    public var aioError: CUint,
    aioSuspendCtorArg: MutPtr<CVoid>,
    aioPlistCtorArg: MutPtr<CVoid>,
    public var aioPolicy: CInt,
    public var aioParam: SchedParam,
) {
    public var aioBuf: MutPtr<CVoid> = aioBufCtorArg
        internal set

    public var aioLioState: MutPtr<CVoid> = aioLioStateCtorArg
        internal set

    public var aioNext: MutPtr<Aiocb> = aioNextCtorArg
        internal set

    public var aioSuspend: MutPtr<CVoid> = aioSuspendCtorArg
        internal set

    public var aioPlist: MutPtr<CVoid> = aioPlistCtorArg
        internal set

    public constructor() : this(
        aioFildes = 0,
        aioReqprio = 0,
        aioOffset = 0L,
        aioBufCtorArg = MutPtr(0L),
        aioNbytes = 0uL,
        aioSigevent = Sigevent(),
        aioLioOpcode = 0,
        aioLioStateCtorArg = MutPtr(0L),
        aioPad = IntArray(3),
        aioNextCtorArg = MutPtr(0L),
        aioFlag = 0u,
        aioIotype = 0u,
        aioResult = 0L,
        aioError = 0u,
        aioSuspendCtorArg = MutPtr(0L),
        aioPlistCtorArg = MutPtr(0L),
        aioPolicy = 0,
        aioParam = SchedParam(),
    )

    public companion object {
        public operator fun invoke(
            aioFildes: CInt = 0,
            aioReqprio: CInt = 0,
            aioOffset: OffT = 0L,
            aioBuf: MutPtr<CVoid> = MutPtr(0L),
            aioNbytes: SizeT = 0uL,
            aioSigevent: Sigevent = Sigevent(),
            aioLioOpcode: CInt = 0,
            aioLioState: MutPtr<CVoid> = MutPtr(0L),
            aioPad: IntArray = IntArray(3),
            aioNext: MutPtr<Aiocb> = MutPtr(0L),
            aioFlag: CUint = 0u,
            aioIotype: CUint = 0u,
            aioResult: SsizeT = 0L,
            aioError: CUint = 0u,
            aioSuspend: MutPtr<CVoid> = MutPtr(0L),
            aioPlist: MutPtr<CVoid> = MutPtr(0L),
            aioPolicy: CInt = 0,
            aioParam: SchedParam = SchedParam(),
        ): Aiocb =
            Aiocb(
                aioFildes = aioFildes,
                aioReqprio = aioReqprio,
                aioOffset = aioOffset,
                aioBufCtorArg = aioBuf,
                aioNbytes = aioNbytes,
                aioSigevent = aioSigevent,
                aioLioOpcode = aioLioOpcode,
                aioLioStateCtorArg = aioLioState,
                aioPad = aioPad,
                aioNextCtorArg = aioNext,
                aioFlag = aioFlag,
                aioIotype = aioIotype,
                aioResult = aioResult,
                aioError = aioError,
                aioSuspendCtorArg = aioSuspend,
                aioPlistCtorArg = aioPlist,
                aioPolicy = aioPolicy,
                aioParam = aioParam,
            )
    }
}

public data class PthreadAttrT(
    public var data1: CLong = 0L,
    public var data2: UByteArray = UByteArray(96),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadAttrT) return false
        if (this.data1 != other.data1) return false
        if (!this.data2.contentEquals(other.data2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.data1.hashCode()
        result = 31 * result + this.data2.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadAttrT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 104L
                override fun readNative(addr: Long): PthreadAttrT =
                    PthreadAttrT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (96).toInt())
                        ).readNative(addr + 8L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadAttrT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.data1)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (96).toInt())
                    ).writeNative(addr + 8L, value.data2.toList())
                }
            }
    }
}

public data class IpcPerm(
    public var uid: UidT = 0u,
    public var gid: GidT = 0u,
    public var cuid: UidT = 0u,
    public var cgid: GidT = 0u,
    public var mode: ModeT = 0u,
    public var seq: CUint = 0u,
    public var key: KeyT = 0u,
    public var reserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IpcPerm) return false
        if (this.uid != other.uid) return false
        if (this.gid != other.gid) return false
        if (this.cuid != other.cuid) return false
        if (this.cgid != other.cgid) return false
        if (this.mode != other.mode) return false
        if (this.seq != other.seq) return false
        if (this.key != other.key) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.uid.hashCode()
        result = 31 * result + this.gid.hashCode()
        result = 31 * result + this.cuid.hashCode()
        result = 31 * result + this.cgid.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.seq.hashCode()
        result = 31 * result + this.key.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpcPerm> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpcPerm> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 36L
                override fun readNative(addr: Long): IpcPerm =
                    IpcPerm(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (4).toInt())
                        ).readNative(addr + 20L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: IpcPerm) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.uid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.gid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.cuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.cgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.seq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.key)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (4).toInt())
                    ).writeNative(addr + 20L, value.reserved.toList())
                }
            }
    }
}

public class RegexT internal constructor(
    public var reMagic: CInt,
    public var reNsub: SizeT,
    reEndpCtorArg: ConstPtr<CChar>,
    reGCtorArg: MutPtr<CVoid>,
) {
    public var reEndp: ConstPtr<CChar> = reEndpCtorArg
        internal set

    public var reG: MutPtr<CVoid> = reGCtorArg
        internal set

    public constructor() : this(
        reMagic = 0,
        reNsub = 0uL,
        reEndpCtorArg = ConstPtr(0L),
        reGCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.reMagic

    public operator fun component2(): SizeT = this.reNsub

    public operator fun component3(): ConstPtr<CChar> = this.reEndp

    public operator fun component4(): MutPtr<CVoid> = this.reG

    public fun copy(reMagic: CInt = this.reMagic, reNsub: SizeT = this.reNsub, reEndp: ConstPtr<CChar> = this.reEndp, reG: MutPtr<CVoid> = this.reG): RegexT = RegexT(reMagic = reMagic, reNsub = reNsub, reEndpCtorArg = reEndp, reGCtorArg = reG)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RegexT) return false
        if (this.reMagic != other.reMagic) return false
        if (this.reNsub != other.reNsub) return false
        if (this.reEndp != other.reEndp) return false
        if (this.reG != other.reG) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.reMagic.hashCode()
        result = 31 * result + this.reNsub.hashCode()
        result = 31 * result + this.reEndp.hashCode()
        result = 31 * result + this.reG.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegexT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegexT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): RegexT =
                    RegexT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<CChar>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: RegexT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.reMagic)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.reNsub)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<CChar>(64)
                    ).writeNative(addr + 16L, value.reEndp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.reG)
                }
            }

        public operator fun invoke(
            reMagic: CInt = 0,
            reNsub: SizeT = 0uL,
            reEndp: ConstPtr<CChar> = ConstPtr(0L),
            reG: MutPtr<CVoid> = MutPtr(0L),
        ): RegexT =
            RegexT(
                reMagic = reMagic,
                reNsub = reNsub,
                reEndpCtorArg = reEndp,
                reGCtorArg = reG,
            )
    }
}

public class ThreadAttr internal constructor(
    public var flags: CInt,
    public var stacksize: SizeT,
    stackaddrCtorArg: MutPtr<CVoid>,
    public var exitfunc: ThreadAttrExitfuncCallback?,
    public var policy: CInt,
    public var param: SchedParam,
    public var guardsize: CUint,
    public var prealloc: CUint,
    public var spare: IntArray,
) {
    public var stackaddr: MutPtr<CVoid> = stackaddrCtorArg
        internal set

    public constructor() : this(
        flags = 0,
        stacksize = 0uL,
        stackaddrCtorArg = MutPtr(0L),
        exitfunc = null,
        policy = 0,
        param = SchedParam(),
        guardsize = 0u,
        prealloc = 0u,
        spare = IntArray(2),
    )

    public operator fun component1(): CInt = this.flags

    public operator fun component2(): SizeT = this.stacksize

    public operator fun component3(): MutPtr<CVoid> = this.stackaddr

    public operator fun component4(): ThreadAttrExitfuncCallback? = this.exitfunc

    public operator fun component5(): CInt = this.policy

    public operator fun component6(): SchedParam = this.param

    public operator fun component7(): CUint = this.guardsize

    public operator fun component8(): CUint = this.prealloc

    public operator fun component9(): IntArray = this.spare

    public fun copy(flags: CInt = this.flags, stacksize: SizeT = this.stacksize, stackaddr: MutPtr<CVoid> = this.stackaddr, exitfunc: ThreadAttrExitfuncCallback? = this.exitfunc, policy: CInt = this.policy, param: SchedParam = this.param, guardsize: CUint = this.guardsize, prealloc: CUint = this.prealloc, spare: IntArray = this.spare): ThreadAttr = ThreadAttr(flags = flags, stacksize = stacksize, stackaddrCtorArg = stackaddr, exitfunc = exitfunc, policy = policy, param = param, guardsize = guardsize, prealloc = prealloc, spare = spare)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ThreadAttr) return false
        if (this.flags != other.flags) return false
        if (this.stacksize != other.stacksize) return false
        if (this.stackaddr != other.stackaddr) return false
        if (this.exitfunc != other.exitfunc) return false
        if (this.policy != other.policy) return false
        if (this.param != other.param) return false
        if (this.guardsize != other.guardsize) return false
        if (this.prealloc != other.prealloc) return false
        if (!this.spare.contentEquals(other.spare)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.flags.hashCode()
        result = 31 * result + this.stacksize.hashCode()
        result = 31 * result + this.stackaddr.hashCode()
        result = 31 * result + this.exitfunc.hashCode()
        result = 31 * result + this.policy.hashCode()
        result = 31 * result + this.param.hashCode()
        result = 31 * result + this.guardsize.hashCode()
        result = 31 * result + this.prealloc.hashCode()
        result = 31 * result + this.spare.contentHashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            flags: CInt = 0,
            stacksize: SizeT = 0uL,
            stackaddr: MutPtr<CVoid> = MutPtr(0L),
            exitfunc: ThreadAttrExitfuncCallback? = null,
            policy: CInt = 0,
            param: SchedParam = SchedParam(),
            guardsize: CUint = 0u,
            prealloc: CUint = 0u,
            spare: IntArray = IntArray(2),
        ): ThreadAttr =
            ThreadAttr(
                flags = flags,
                stacksize = stacksize,
                stackaddrCtorArg = stackaddr,
                exitfunc = exitfunc,
                policy = policy,
                param = param,
                guardsize = guardsize,
                prealloc = prealloc,
                spare = spare,
            )
    }
}

public data class SyncAttr(
    public var protocol: CInt = 0,
    public var flags: CInt = 0,
    public var prioceiling: CInt = 0,
    public var clockid: CInt = 0,
    public var count: CInt = 0,
    public var reserved: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SyncAttr) return false
        if (this.protocol != other.protocol) return false
        if (this.flags != other.flags) return false
        if (this.prioceiling != other.prioceiling) return false
        if (this.clockid != other.clockid) return false
        if (this.count != other.count) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.protocol.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.prioceiling.hashCode()
        result = 31 * result + this.clockid.hashCode()
        result = 31 * result + this.count.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SyncAttr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SyncAttr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SyncAttr =
                    SyncAttr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (3).toInt())
                        ).readNative(addr + 20L).toIntArray(),
                    )
                override fun writeNative(addr: Long, value: SyncAttr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.protocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.prioceiling)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.clockid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (3).toInt())
                    ).writeNative(addr + 20L, value.reserved.toList())
                }
            }
    }
}

public data class Sockcred(
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
        if (this.scUid != other.scUid) return false
        if (this.scEuid != other.scEuid) return false
        if (this.scGid != other.scGid) return false
        if (this.scEgid != other.scEgid) return false
        if (this.scNgroups != other.scNgroups) return false
        if (!this.scGroups.contentEquals(other.scGroups)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.scUid.hashCode()
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
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Sockcred =
                    Sockcred(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                        ).readNative(addr + 12L).toUShortArray(),
                    )
                override fun writeNative(addr: Long, value: Sockcred) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.scUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.scEuid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.scGid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.scEgid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.scNgroups)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16, (1).toInt())
                    ).writeNative(addr + 12L, value.scGroups.toList())
                }
            }
    }
}

public class BpfProgram internal constructor(
    public var bfLen: CUint,
    bfInsnsCtorArg: MutPtr<BpfInsn>,
) {
    public var bfInsns: MutPtr<BpfInsn> = bfInsnsCtorArg
        internal set

    public constructor() : this(
        bfLen = 0u,
        bfInsnsCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.bfLen

    public operator fun component2(): MutPtr<BpfInsn> = this.bfInsns

    public fun copy(bfLen: CUint = this.bfLen, bfInsns: MutPtr<BpfInsn> = this.bfInsns): BpfProgram = BpfProgram(bfLen = bfLen, bfInsnsCtorArg = bfInsns)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BpfProgram) return false
        if (this.bfLen != other.bfLen) return false
        if (this.bfInsns != other.bfInsns) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bfLen.hashCode()
        result = 31 * result + this.bfInsns.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfProgram> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfProgram> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BpfProgram =
                    BpfProgram(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<BpfInsn>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BpfProgram) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bfLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<BpfInsn>(64)
                    ).writeNative(addr + 8L, value.bfInsns)
                }
            }

        public operator fun invoke(
            bfLen: CUint = 0u,
            bfInsns: MutPtr<BpfInsn> = MutPtr(0L),
        ): BpfProgram =
            BpfProgram(
                bfLen = bfLen,
                bfInsnsCtorArg = bfInsns,
            )
    }
}

public data class BpfStat(
    public var bsRecv: ULong = 0uL,
    public var bsDrop: ULong = 0uL,
    public var bsCapt: ULong = 0uL,
    public var bsPadding: ULongArray = ULongArray(13),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BpfStat) return false
        if (this.bsRecv != other.bsRecv) return false
        if (this.bsDrop != other.bsDrop) return false
        if (this.bsCapt != other.bsCapt) return false
        if (!this.bsPadding.contentEquals(other.bsPadding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bsRecv.hashCode()
        result = 31 * result + this.bsDrop.hashCode()
        result = 31 * result + this.bsCapt.hashCode()
        result = 31 * result + this.bsPadding.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfStat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfStat> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 128L
                override fun readNative(addr: Long): BpfStat =
                    BpfStat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (13).toInt())
                        ).readNative(addr + 24L).toULongArray(),
                    )
                override fun writeNative(addr: Long, value: BpfStat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.bsRecv)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.bsDrop)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.bsCapt)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64, (13).toInt())
                    ).writeNative(addr + 24L, value.bsPadding.toList())
                }
            }
    }
}

public data class BpfVersion(
    public var bvMajor: CUshort = 0u,
    public var bvMinor: CUshort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfVersion> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfVersion> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): BpfVersion =
                    BpfVersion(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: BpfVersion) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.bvMajor)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.bvMinor)
                }
            }
    }
}

public data class BpfHdr(
    public var bhTstamp: Timeval = Timeval(),
    public var bhCaplen: UInt = 0u,
    public var bhDatalen: UInt = 0u,
    public var bhHdrlen: UShort = 0u,
)

public data class BpfInsn(
    public var code: UShort = 0u,
    public var jt: CUchar = 0u,
    public var jf: CUchar = 0u,
    public var k: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfInsn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfInsn> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): BpfInsn =
                    BpfInsn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 3L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: BpfInsn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.code)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 2L, value.jt)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 3L, value.jf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.k)
                }
            }
    }
}

public class BpfDltlist internal constructor(
    public var bflLen: CUint,
    bflListCtorArg: MutPtr<CUint>,
) {
    public var bflList: MutPtr<CUint> = bflListCtorArg
        internal set

    public constructor() : this(
        bflLen = 0u,
        bflListCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CUint = this.bflLen

    public operator fun component2(): MutPtr<CUint> = this.bflList

    public fun copy(bflLen: CUint = this.bflLen, bflList: MutPtr<CUint> = this.bflList): BpfDltlist = BpfDltlist(bflLen = bflLen, bflListCtorArg = bflList)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BpfDltlist) return false
        if (this.bflLen != other.bflLen) return false
        if (this.bflList != other.bflList) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bflLen.hashCode()
        result = 31 * result + this.bflList.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfDltlist> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<BpfDltlist> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): BpfDltlist =
                    BpfDltlist(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CUint>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: BpfDltlist) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bflLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CUint>(64)
                    ).writeNative(addr + 8L, value.bflList)
                }
            }

        public operator fun invoke(
            bflLen: CUint = 0u,
            bflList: MutPtr<CUint> = MutPtr(0L),
        ): BpfDltlist =
            BpfDltlist(
                bflLen = bflLen,
                bflListCtorArg = bflList,
            )
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

public class DlPhdrInfo internal constructor(
    public var dlpiAddr: Elf64Addr,
    dlpiNameCtorArg: ConstPtr<CChar>,
    dlpiPhdrCtorArg: ConstPtr<Elf64Phdr>,
    public var dlpiPhnum: Elf64Half,
) {
    public var dlpiName: ConstPtr<CChar> = dlpiNameCtorArg
        internal set

    public var dlpiPhdr: ConstPtr<Elf64Phdr> = dlpiPhdrCtorArg
        internal set

    public constructor() : this(
        dlpiAddr = 0uL,
        dlpiNameCtorArg = ConstPtr(0L),
        dlpiPhdrCtorArg = ConstPtr(0L),
        dlpiPhnum = 0u,
    )

    public operator fun component1(): Elf64Addr = this.dlpiAddr

    public operator fun component2(): ConstPtr<CChar> = this.dlpiName

    public operator fun component3(): ConstPtr<Elf64Phdr> = this.dlpiPhdr

    public operator fun component4(): Elf64Half = this.dlpiPhnum

    public fun copy(dlpiAddr: Elf64Addr = this.dlpiAddr, dlpiName: ConstPtr<CChar> = this.dlpiName, dlpiPhdr: ConstPtr<Elf64Phdr> = this.dlpiPhdr, dlpiPhnum: Elf64Half = this.dlpiPhnum): DlPhdrInfo = DlPhdrInfo(dlpiAddr = dlpiAddr, dlpiNameCtorArg = dlpiName, dlpiPhdrCtorArg = dlpiPhdr, dlpiPhnum = dlpiPhnum)

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
                                .constPtrLayout<Elf64Phdr>(64)
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
                            .constPtrLayout<Elf64Phdr>(64)
                    ).writeNative(addr + 16L, value.dlpiPhdr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 24L, value.dlpiPhnum)
                }
            }

        public operator fun invoke(
            dlpiAddr: Elf64Addr = 0uL,
            dlpiName: ConstPtr<CChar> = ConstPtr(0L),
            dlpiPhdr: ConstPtr<Elf64Phdr> = ConstPtr(0L),
            dlpiPhnum: Elf64Half = 0u,
        ): DlPhdrInfo =
            DlPhdrInfo(
                dlpiAddr = dlpiAddr,
                dlpiNameCtorArg = dlpiName,
                dlpiPhdrCtorArg = dlpiPhdr,
                dlpiPhnum = dlpiPhnum,
            )
    }
}

public class UcontextT internal constructor(
    ucLinkCtorArg: MutPtr<UcontextT>,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    ucMcontextCtorArg: McontextT,
) {
    public var ucLink: MutPtr<UcontextT> = ucLinkCtorArg
        internal set

    public var ucMcontext: McontextT = ucMcontextCtorArg
        internal set

    public constructor() : this(
        ucLinkCtorArg = MutPtr(0L),
        ucSigmask = SigsetT(),
        ucStack = StackT(),
        ucMcontextCtorArg = McontextT(),
    )

    public operator fun component1(): MutPtr<UcontextT> = this.ucLink

    public operator fun component2(): SigsetT = this.ucSigmask

    public operator fun component3(): StackT = this.ucStack

    public operator fun component4(): McontextT = this.ucMcontext

    public fun copy(ucLink: MutPtr<UcontextT> = this.ucLink, ucSigmask: SigsetT = this.ucSigmask, ucStack: StackT = this.ucStack, ucMcontext: McontextT = this.ucMcontext): UcontextT = UcontextT(ucLinkCtorArg = ucLink, ucSigmask = ucSigmask, ucStack = ucStack, ucMcontextCtorArg = ucMcontext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UcontextT) return false
        if (this.ucLink != other.ucLink) return false
        if (this.ucSigmask != other.ucSigmask) return false
        if (this.ucStack != other.ucStack) return false
        if (this.ucMcontext != other.ucMcontext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ucLink.hashCode()
        result = 31 * result + this.ucSigmask.hashCode()
        result = 31 * result + this.ucStack.hashCode()
        result = 31 * result + this.ucMcontext.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ucLink: MutPtr<UcontextT> = MutPtr(0L),
            ucSigmask: SigsetT = SigsetT(),
            ucStack: StackT = StackT(),
            ucMcontext: McontextT = McontextT(),
        ): UcontextT =
            UcontextT(
                ucLinkCtorArg = ucLink,
                ucSigmask = ucSigmask,
                ucStack = ucStack,
                ucMcontextCtorArg = ucMcontext,
            )
    }
}

public data class SockaddrUn(
    public var sunLen: UByte = 0u,
    public var sunFamily: SaFamilyT = 0u,
    public var sunPath: UByteArray = UByteArray(104),
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
                override val alignBytes: Long = 1L
                override val sizeBytes: Long = 106L
                override fun readNative(addr: Long): SockaddrUn =
                    SockaddrUn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (104).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrUn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.sunLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.sunFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (104).toInt())
                    ).writeNative(addr + 2L, value.sunPath.toList())
                }
            }
    }
}

public data class SockaddrStorage(
    public var ssLen: UByte = 0u,
    public var ssFamily: SaFamilyT = 0u,
    public var ssPad1: UByteArray = UByteArray(6),
    public var ssAlign: Long = 0L,
    public var ssPad2: UByteArray = UByteArray(112),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssLen != other.ssLen) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssPad1.contentEquals(other.ssPad1)) return false
        if (this.ssAlign != other.ssAlign) return false
        if (!this.ssPad2.contentEquals(other.ssPad2)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssLen.hashCode()
        result = 31 * result + this.ssFamily.hashCode()
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
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.ssAlign)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (112).toInt())
                    ).writeNative(addr + 16L, value.ssPad2.toList())
                }
            }
    }
}

public data class Utsname(
    public var sysname: UByteArray = UByteArray(SYSNAME_SIZE),
    public var nodename: UByteArray = UByteArray(SYSNAME_SIZE),
    public var release: UByteArray = UByteArray(SYSNAME_SIZE),
    public var version: UByteArray = UByteArray(SYSNAME_SIZE),
    public var machine: UByteArray = UByteArray(SYSNAME_SIZE),
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
                override val alignBytes: Long = 1L
                private val off1: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes(((SYSNAME_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes), 1L)
                private val off2: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off1 + ((SYSNAME_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off3: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off2 + ((SYSNAME_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                private val off4: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off3 + ((SYSNAME_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override val sizeBytes: Long =
                    io.github.kotlinmania.rustlang.core.mem
                        .alignUpBytes((off4 + ((SYSNAME_SIZE).toLong() * (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).strideBytes)), 1L)
                override fun readNative(addr: Long): Utsname =
                    Utsname(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SYSNAME_SIZE).toInt())
                        ).readNative(addr).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SYSNAME_SIZE).toInt())
                        ).readNative(addr + off1).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SYSNAME_SIZE).toInt())
                        ).readNative(addr + off2).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SYSNAME_SIZE).toInt())
                        ).readNative(addr + off3).toUByteArray(),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SYSNAME_SIZE).toInt())
                        ).readNative(addr + off4).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Utsname) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SYSNAME_SIZE).toInt())
                    ).writeNative(addr, value.sysname.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SYSNAME_SIZE).toInt())
                    ).writeNative(addr + off1, value.nodename.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SYSNAME_SIZE).toInt())
                    ).writeNative(addr + off2, value.release.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SYSNAME_SIZE).toInt())
                    ).writeNative(addr + off3, value.version.toList())
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (SYSNAME_SIZE).toInt())
                    ).writeNative(addr + off4, value.machine.toList())
                }
            }
    }
}

public data class Sigevent(
    public var sigevNotify: CInt = 0,
    public var padding1: CInt = 0,
    public var sigevSigno: CInt = 0,
    // union
    public var padding2: CInt = 0,
    public var sigevValue: Sigval = Sigval(),
    public var sigevUn2: Int = 0,
)

public data class Dirent(
    public var dIno: InoT = 0uL,
    public var dOffset: OffT = 0L,
    public var dReclen: CShort = 0,
    public var dNamelen: CShort = 0,
    public var dName: UByteArray = UByteArray(1),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Dirent) return false
        if (this.dIno != other.dIno) return false
        if (this.dOffset != other.dOffset) return false
        if (this.dReclen != other.dReclen) return false
        if (this.dNamelen != other.dNamelen) return false
        if (!this.dName.contentEquals(other.dName)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dIno.hashCode()
        result = 31 * result + this.dOffset.hashCode()
        result = 31 * result + this.dReclen.hashCode()
        result = 31 * result + this.dNamelen.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Dirent> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Dirent =
                    Dirent(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Dirent) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.dIno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.dOffset)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 16L, value.dReclen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 18L, value.dNamelen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1).toInt())
                    ).writeNative(addr + 20L, value.dName.toList())
                }
            }
    }
}

public data class SigsetT(
    public var value: UIntArray = UIntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SigsetT) return false
        if (!this.value.contentEquals(other.value)) return false
        return true
    }

    override fun hashCode(): Int = this.value.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SigsetT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SigsetT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SigsetT =
                    SigsetT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                        ).readNative(addr).toUIntArray(),
                    )
                override fun writeNative(addr: Long, value: SigsetT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (2).toInt())
                    ).writeNative(addr, value.value.toList())
                }
            }
    }
}

public data class MqAttr(
    public var mqMaxmsg: CLong = 0L,
    public var mqMsgsize: CLong = 0L,
    public var mqFlags: CLong = 0L,
    public var mqCurmsgs: CLong = 0L,
    public var mqSendwait: CLong = 0L,
    public var mqRecvwait: CLong = 0L,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MqAttr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MqAttr> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): MqAttr =
                    MqAttr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: MqAttr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.mqMaxmsg)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.mqMsgsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 16L, value.mqFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 24L, value.mqCurmsgs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 32L, value.mqSendwait)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 40L, value.mqRecvwait)
                }
            }
    }
}

public data class SockaddrDl(
    public var sdlLen: CUchar = 0u,
    public var sdlFamily: SaFamilyT = 0u,
    public var sdlIndex: UShort = 0u,
    public var sdlType: CUchar = 0u,
    public var sdlNlen: CUchar = 0u,
    public var sdlAlen: CUchar = 0u,
    public var sdlSlen: CUchar = 0u,
    public var sdlData: UByteArray = UByteArray(12),
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
                override val sizeBytes: Long = 20L
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
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
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
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (12).toInt())
                    ).writeNative(addr + 8L, value.sdlData.toList())
                }
            }
    }
}

public class Msg internal constructor(
    msgNextCtorArg: MutPtr<Msg>,
    public var msgType: CLong,
    public var msgTs: CUshort,
    public var msgSpot: CShort,
    public var pad: UByteArray,
) {
    public var msgNext: MutPtr<Msg> = msgNextCtorArg
        internal set

    public constructor() : this(
        msgNextCtorArg = MutPtr(0L),
        msgType = 0L,
        msgTs = 0u,
        msgSpot = 0,
        pad = UByteArray(4),
    )

    public operator fun component1(): MutPtr<Msg> = this.msgNext

    public operator fun component2(): CLong = this.msgType

    public operator fun component3(): CUshort = this.msgTs

    public operator fun component4(): CShort = this.msgSpot

    public operator fun component5(): UByteArray = this.pad

    public fun copy(msgNext: MutPtr<Msg> = this.msgNext, msgType: CLong = this.msgType, msgTs: CUshort = this.msgTs, msgSpot: CShort = this.msgSpot, pad: UByteArray = this.pad): Msg = Msg(msgNextCtorArg = msgNext, msgType = msgType, msgTs = msgTs, msgSpot = msgSpot, pad = pad)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Msg) return false
        if (this.msgNext != other.msgNext) return false
        if (this.msgType != other.msgType) return false
        if (this.msgTs != other.msgTs) return false
        if (this.msgSpot != other.msgSpot) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msgNext.hashCode()
        result = 31 * result + this.msgType.hashCode()
        result = 31 * result + this.msgTs.hashCode()
        result = 31 * result + this.msgSpot.hashCode()
        result = 31 * result + this.pad.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Msg> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): Msg =
                    Msg(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Msg>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 18L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                        ).readNative(addr + 20L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Msg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Msg>(64)
                    ).writeNative(addr, value.msgNext)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.msgType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.msgTs)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 18L, value.msgSpot)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (4).toInt())
                    ).writeNative(addr + 20L, value.pad.toList())
                }
            }

        public operator fun invoke(
            msgNext: MutPtr<Msg> = MutPtr(0L),
            msgType: CLong = 0L,
            msgTs: CUshort = 0u,
            msgSpot: CShort = 0,
            pad: UByteArray = UByteArray(4),
        ): Msg =
            Msg(
                msgNextCtorArg = msgNext,
                msgType = msgType,
                msgTs = msgTs,
                msgSpot = msgSpot,
                pad = pad,
            )
    }
}

public class MsqidDs internal constructor(
    public var msgPerm: IpcPerm,
    msgFirstCtorArg: MutPtr<Msg>,
    msgLastCtorArg: MutPtr<Msg>,
    public var msgCbytes: MsglenT,
    public var msgQnum: MsgqnumT,
    public var msgQbytes: MsglenT,
    public var msgLspid: PidT,
    public var msgLrpid: PidT,
    public var msgStime: TimeT,
    public var msgPad1: CLong,
    public var msgRtime: TimeT,
    public var msgPad2: CLong,
    public var msgCtime: TimeT,
    public var msgPad3: CLong,
    public var msgPad4: LongArray,
) {
    public var msgFirst: MutPtr<Msg> = msgFirstCtorArg
        internal set

    public var msgLast: MutPtr<Msg> = msgLastCtorArg
        internal set

    public constructor() : this(
        msgPerm = IpcPerm(),
        msgFirstCtorArg = MutPtr(0L),
        msgLastCtorArg = MutPtr(0L),
        msgCbytes = 0uL,
        msgQnum = 0uL,
        msgQbytes = 0uL,
        msgLspid = 0,
        msgLrpid = 0,
        msgStime = 0L,
        msgPad1 = 0L,
        msgRtime = 0L,
        msgPad2 = 0L,
        msgCtime = 0L,
        msgPad3 = 0L,
        msgPad4 = LongArray(4),
    )

    public operator fun component1(): IpcPerm = this.msgPerm

    public operator fun component2(): MutPtr<Msg> = this.msgFirst

    public operator fun component3(): MutPtr<Msg> = this.msgLast

    public operator fun component4(): MsglenT = this.msgCbytes

    public operator fun component5(): MsgqnumT = this.msgQnum

    public operator fun component6(): MsglenT = this.msgQbytes

    public operator fun component7(): PidT = this.msgLspid

    public operator fun component8(): PidT = this.msgLrpid

    public operator fun component9(): TimeT = this.msgStime

    public operator fun component10(): CLong = this.msgPad1

    public operator fun component11(): TimeT = this.msgRtime

    public operator fun component12(): CLong = this.msgPad2

    public operator fun component13(): TimeT = this.msgCtime

    public operator fun component14(): CLong = this.msgPad3

    public operator fun component15(): LongArray = this.msgPad4

    public fun copy(msgPerm: IpcPerm = this.msgPerm, msgFirst: MutPtr<Msg> = this.msgFirst, msgLast: MutPtr<Msg> = this.msgLast, msgCbytes: MsglenT = this.msgCbytes, msgQnum: MsgqnumT = this.msgQnum, msgQbytes: MsglenT = this.msgQbytes, msgLspid: PidT = this.msgLspid, msgLrpid: PidT = this.msgLrpid, msgStime: TimeT = this.msgStime, msgPad1: CLong = this.msgPad1, msgRtime: TimeT = this.msgRtime, msgPad2: CLong = this.msgPad2, msgCtime: TimeT = this.msgCtime, msgPad3: CLong = this.msgPad3, msgPad4: LongArray = this.msgPad4): MsqidDs = MsqidDs(msgPerm = msgPerm, msgFirstCtorArg = msgFirst, msgLastCtorArg = msgLast, msgCbytes = msgCbytes, msgQnum = msgQnum, msgQbytes = msgQbytes, msgLspid = msgLspid, msgLrpid = msgLrpid, msgStime = msgStime, msgPad1 = msgPad1, msgRtime = msgRtime, msgPad2 = msgPad2, msgCtime = msgCtime, msgPad3 = msgPad3, msgPad4 = msgPad4)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MsqidDs) return false
        if (this.msgPerm != other.msgPerm) return false
        if (this.msgFirst != other.msgFirst) return false
        if (this.msgLast != other.msgLast) return false
        if (this.msgCbytes != other.msgCbytes) return false
        if (this.msgQnum != other.msgQnum) return false
        if (this.msgQbytes != other.msgQbytes) return false
        if (this.msgLspid != other.msgLspid) return false
        if (this.msgLrpid != other.msgLrpid) return false
        if (this.msgStime != other.msgStime) return false
        if (this.msgPad1 != other.msgPad1) return false
        if (this.msgRtime != other.msgRtime) return false
        if (this.msgPad2 != other.msgPad2) return false
        if (this.msgCtime != other.msgCtime) return false
        if (this.msgPad3 != other.msgPad3) return false
        if (!this.msgPad4.contentEquals(other.msgPad4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.msgPerm.hashCode()
        result = 31 * result + this.msgFirst.hashCode()
        result = 31 * result + this.msgLast.hashCode()
        result = 31 * result + this.msgCbytes.hashCode()
        result = 31 * result + this.msgQnum.hashCode()
        result = 31 * result + this.msgQbytes.hashCode()
        result = 31 * result + this.msgLspid.hashCode()
        result = 31 * result + this.msgLrpid.hashCode()
        result = 31 * result + this.msgStime.hashCode()
        result = 31 * result + this.msgPad1.hashCode()
        result = 31 * result + this.msgRtime.hashCode()
        result = 31 * result + this.msgPad2.hashCode()
        result = 31 * result + this.msgCtime.hashCode()
        result = 31 * result + this.msgPad3.hashCode()
        result = 31 * result + this.msgPad4.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsqidDs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MsqidDs> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 168L
                override fun readNative(addr: Long): MsqidDs =
                    MsqidDs(
                        (IpcPerm.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Msg>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Msg>(64)
                        ).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 80L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 84L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 88L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 96L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 104L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 112L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 120L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (4).toInt())
                        ).readNative(addr + 136L).toLongArray(),
                    )
                override fun writeNative(addr: Long, value: MsqidDs) {
                    (IpcPerm.typeLayout()).writeNative(addr, value.msgPerm)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Msg>(64)
                    ).writeNative(addr + 40L, value.msgFirst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Msg>(64)
                    ).writeNative(addr + 48L, value.msgLast)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 56L, value.msgCbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 64L, value.msgQnum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 72L, value.msgQbytes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 80L, value.msgLspid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 84L, value.msgLrpid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 88L, value.msgStime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 96L, value.msgPad1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 104L, value.msgRtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 112L, value.msgPad2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 120L, value.msgCtime)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 128L, value.msgPad3)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64, (4).toInt())
                    ).writeNative(addr + 136L, value.msgPad4.toList())
                }
            }

        public operator fun invoke(
            msgPerm: IpcPerm = IpcPerm(),
            msgFirst: MutPtr<Msg> = MutPtr(0L),
            msgLast: MutPtr<Msg> = MutPtr(0L),
            msgCbytes: MsglenT = 0uL,
            msgQnum: MsgqnumT = 0uL,
            msgQbytes: MsglenT = 0uL,
            msgLspid: PidT = 0,
            msgLrpid: PidT = 0,
            msgStime: TimeT = 0L,
            msgPad1: CLong = 0L,
            msgRtime: TimeT = 0L,
            msgPad2: CLong = 0L,
            msgCtime: TimeT = 0L,
            msgPad3: CLong = 0L,
            msgPad4: LongArray = LongArray(4),
        ): MsqidDs =
            MsqidDs(
                msgPerm = msgPerm,
                msgFirstCtorArg = msgFirst,
                msgLastCtorArg = msgLast,
                msgCbytes = msgCbytes,
                msgQnum = msgQnum,
                msgQbytes = msgQbytes,
                msgLspid = msgLspid,
                msgLrpid = msgLrpid,
                msgStime = msgStime,
                msgPad1 = msgPad1,
                msgRtime = msgRtime,
                msgPad2 = msgPad2,
                msgCtime = msgCtime,
                msgPad3 = msgPad3,
                msgPad4 = msgPad4,
            )
    }
}

public data class SyncT(
    public var u: CUint = 0u,
    // union
    public var owner: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SyncT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SyncT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): SyncT =
                    SyncT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SyncT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.u)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.owner)
                }
            }
    }
}

public data class PthreadBarrierT(
    // union
    public var pad: UByteArray = UByteArray(28),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadBarrierT) return false
        if (!this.pad.contentEquals(other.pad)) return false
        return true
    }

    override fun hashCode(): Int = this.pad.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadBarrierT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 28L
                override fun readNative(addr: Long): PthreadBarrierT =
                    PthreadBarrierT(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (28).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: PthreadBarrierT) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (28).toInt())
                    ).writeNative(addr, value.pad.toList())
                }
            }
    }
}

public class PthreadRwlockT internal constructor(
    public var active: CInt,
    public var blockedwriters: CInt,
    public var blockedreaders: CInt,
    public var heavy: CInt,
    lockCtorArg: PthreadMutexT,
    rcondCtorArg: PthreadCondT,
    wcondCtorArg: PthreadCondT,
    // union
    public var owner: CUint,
    public var spare: CUint,
) {
    public var lock: PthreadMutexT = lockCtorArg
        internal set

    // union
    public var rcond: PthreadCondT = rcondCtorArg
        internal set

    // union
    public var wcond: PthreadCondT = wcondCtorArg
        internal set

    public constructor() : this(
        active = 0,
        blockedwriters = 0,
        blockedreaders = 0,
        heavy = 0,
        lockCtorArg = SyncT(),
        rcondCtorArg = SyncT(),
        wcondCtorArg = SyncT(),
        owner = 0u,
        spare = 0u,
    )

    public operator fun component1(): CInt = this.active

    public operator fun component2(): CInt = this.blockedwriters

    public operator fun component3(): CInt = this.blockedreaders

    public operator fun component4(): CInt = this.heavy

    public operator fun component5(): PthreadMutexT = this.lock

    public operator fun component6(): PthreadCondT = this.rcond

    public operator fun component7(): PthreadCondT = this.wcond

    public operator fun component8(): CUint = this.owner

    public operator fun component9(): CUint = this.spare

    public fun copy(active: CInt = this.active, blockedwriters: CInt = this.blockedwriters, blockedreaders: CInt = this.blockedreaders, heavy: CInt = this.heavy, lock: PthreadMutexT = this.lock, rcond: PthreadCondT = this.rcond, wcond: PthreadCondT = this.wcond, owner: CUint = this.owner, spare: CUint = this.spare): PthreadRwlockT = PthreadRwlockT(active = active, blockedwriters = blockedwriters, blockedreaders = blockedreaders, heavy = heavy, lockCtorArg = lock, rcondCtorArg = rcond, wcondCtorArg = wcond, owner = owner, spare = spare)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PthreadRwlockT) return false
        if (this.active != other.active) return false
        if (this.blockedwriters != other.blockedwriters) return false
        if (this.blockedreaders != other.blockedreaders) return false
        if (this.heavy != other.heavy) return false
        if (this.lock != other.lock) return false
        if (this.rcond != other.rcond) return false
        if (this.wcond != other.wcond) return false
        if (this.owner != other.owner) return false
        if (this.spare != other.spare) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.active.hashCode()
        result = 31 * result + this.blockedwriters.hashCode()
        result = 31 * result + this.blockedreaders.hashCode()
        result = 31 * result + this.heavy.hashCode()
        result = 31 * result + this.lock.hashCode()
        result = 31 * result + this.rcond.hashCode()
        result = 31 * result + this.wcond.hashCode()
        result = 31 * result + this.owner.hashCode()
        result = 31 * result + this.spare.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<PthreadRwlockT> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): PthreadRwlockT =
                    PthreadRwlockT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (SyncT.typeLayout()).readNative(addr + 16L),
                        (SyncT.typeLayout()).readNative(addr + 24L),
                        (SyncT.typeLayout()).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: PthreadRwlockT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.active)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.blockedwriters)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.blockedreaders)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.heavy)
                    (SyncT.typeLayout()).writeNative(addr + 16L, value.lock)
                    (SyncT.typeLayout()).writeNative(addr + 24L, value.rcond)
                    (SyncT.typeLayout()).writeNative(addr + 32L, value.wcond)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.owner)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.spare)
                }
            }

        public operator fun invoke(
            active: CInt = 0,
            blockedwriters: CInt = 0,
            blockedreaders: CInt = 0,
            heavy: CInt = 0,
            lock: PthreadMutexT = SyncT(),
            rcond: PthreadCondT = SyncT(),
            wcond: PthreadCondT = SyncT(),
            owner: CUint = 0u,
            spare: CUint = 0u,
        ): PthreadRwlockT =
            PthreadRwlockT(
                active = active,
                blockedwriters = blockedwriters,
                blockedreaders = blockedreaders,
                heavy = heavy,
                lockCtorArg = lock,
                rcondCtorArg = rcond,
                wcondCtorArg = wcond,
                owner = owner,
                spare = spare,
            )
    }
}

// There is no canonical definition of cLongdouble in Rust. For both AArch64 and x8664,
// however, the size and alignment properties are that of the gcc __int128 which corresponds (at
// least on rustc 1.78+ with LLVM 18, see
// https://blog.rust-lang.org/2024/03/30/i128-layout-update/) to i128. Use this instead until we
// get native f128 support.
//
// The definition was taken from the definition of the _Maxalignt struct in the QNX SDK.
// However, on QNX7, there is a different definition of std.maxAlignT (the C++ version of
// this type). In practice, this doesn't make a difference for the _alignment_ properties of the
// type - however, it changes the size, so using in in any other form than the zero-sized array
// form would be bogus and it would potentially change the size of the data type. On QNX8, this
// got fixed and both C and C++ are using the same definition.
public data class MaxAlignT(
    public var ll: CLonglong = 0L,
    public var ld: I128 = I128(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<MaxAlignT> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): MaxAlignT =
                    MaxAlignT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .i128Layout(::I128, { it.high }, { it.low })
                        ).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: MaxAlignT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr, value.ll)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .i128Layout(::I128, { it.high }, { it.low })
                    ).writeNative(addr + 16L, value.ld)
                }
            }
    }
}
