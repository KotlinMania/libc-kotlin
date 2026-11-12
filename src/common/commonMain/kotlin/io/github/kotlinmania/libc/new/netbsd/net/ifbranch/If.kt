// port-lint: source new/netbsd/net/if_.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.netbsd.net.ifbranch

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SockaddrStorage
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `net / if.h`
//
// <https://github.com/NetBSD/src/tree/trunk/sys/timex.h>

// supports multicast
public class IfData(
    public var ifiType: CUchar = 0u,
    public var ifiAddrlen: CUchar = 0u,
    public var ifiHdrlen: CUchar = 0u,
    public var ifiLinkState: CInt = 0,
    public var ifiMtu: ULong = 0uL,
    public var ifiMetric: ULong = 0uL,
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
    public var ifiNoproto: ULong = 0uL,
    public var ifiLastchange: Timespec = Timespec(),
)

public val LINK_STATE_UNKNOWN: CInt = 0

// link invalid/unknown
public val LINK_STATE_DOWN: CInt = 1

// link is down
public val LINK_STATE_UP: CInt = 2

// link is up
public val IFF_UP: CInt = 0x0001

// interface is up
public val IFF_BROADCAST: CInt = 0x0002

// broadcast address valid
public val IFF_DEBUG: CInt = 0x0004

// turn on debugging
public val IFF_LOOPBACK: CInt = 0x0008

// is a loopback net
public val IFF_POINTOPOINT: CInt = 0x0010

// interface is point-to-point link
public val IFF_RUNNING: CInt = 0x0040

// resources allocated
public val IFF_NOARP: CInt = 0x0080

// no address resolution protocol
public val IFF_PROMISC: CInt = 0x0100

// receive all packets
public val IFF_ALLMULTI: CInt = 0x0200

// receive all multicast packets
public val IFF_OACTIVE: CInt = 0x0400

// transmission in progress
public val IFF_SIMPLEX: CInt = 0x0800

// can't hear own transmissions
public val IFF_LINK0: CInt = 0x1000

// per link layer defined bit
public val IFF_LINK1: CInt = 0x2000

// per link layer defined bit
public val IFF_LINK2: CInt = 0x4000

// per link layer defined bit
public val IFF_MULTICAST: CInt = 0x8000

public data class IfMsghdr(
    public var ifmMsglen: CUshort = 0u,
    public var ifmVersion: CUchar = 0u,
    public var ifmType: CUchar = 0u,
    public var ifmAddrs: CInt = 0,
    public var ifmFlags: CInt = 0,
    public var ifmIndex: CUshort = 0u,
    public var ifmData: IfData = IfData(),
)

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

public class CAnonymousIfrIfru internal constructor(
    public var ifruAddr: Sockaddr,
    public var ifruDstaddr: Sockaddr,
    public var ifruBroadaddr: Sockaddr,
    public var space: SockaddrStorage,
    public var ifruFlags: CShort,
    public var ifruAddrflags: CInt,
    public var ifruMetrics: CInt,
    public var ifruMtu: CInt,
    public var ifruDlt: CInt,
    public var ifruValue: CUint,
    ifruDataCtorArg: MutPtr<CVoid>,
    // buf and buflen are deprecated but they contribute to union size
    public var ifruB: CAnonymousIfrIfruIfruB,
) {
    public var ifruData: MutPtr<CVoid> = ifruDataCtorArg
        internal set

    public constructor() : this(
        ifruAddr = Sockaddr(),
        ifruDstaddr = Sockaddr(),
        ifruBroadaddr = Sockaddr(),
        space = SockaddrStorage(),
        ifruFlags = 0,
        ifruAddrflags = 0,
        ifruMetrics = 0,
        ifruMtu = 0,
        ifruDlt = 0,
        ifruValue = 0u,
        ifruDataCtorArg = MutPtr(0L),
        ifruB = CAnonymousIfrIfruIfruB(),
    )

    public operator fun component1(): Sockaddr = this.ifruAddr

    public operator fun component2(): Sockaddr = this.ifruDstaddr

    public operator fun component3(): Sockaddr = this.ifruBroadaddr

    public operator fun component4(): SockaddrStorage = this.space

    public operator fun component5(): CShort = this.ifruFlags

    public operator fun component6(): CInt = this.ifruAddrflags

    public operator fun component7(): CInt = this.ifruMetrics

    public operator fun component8(): CInt = this.ifruMtu

    public operator fun component9(): CInt = this.ifruDlt

    public operator fun component10(): CUint = this.ifruValue

    public operator fun component11(): MutPtr<CVoid> = this.ifruData

    public operator fun component12(): CAnonymousIfrIfruIfruB = this.ifruB

    public fun copy(ifruAddr: Sockaddr = this.ifruAddr, ifruDstaddr: Sockaddr = this.ifruDstaddr, ifruBroadaddr: Sockaddr = this.ifruBroadaddr, space: SockaddrStorage = this.space, ifruFlags: CShort = this.ifruFlags, ifruAddrflags: CInt = this.ifruAddrflags, ifruMetrics: CInt = this.ifruMetrics, ifruMtu: CInt = this.ifruMtu, ifruDlt: CInt = this.ifruDlt, ifruValue: CUint = this.ifruValue, ifruData: MutPtr<CVoid> = this.ifruData, ifruB: CAnonymousIfrIfruIfruB = this.ifruB): CAnonymousIfrIfru = CAnonymousIfrIfru(ifruAddr = ifruAddr, ifruDstaddr = ifruDstaddr, ifruBroadaddr = ifruBroadaddr, space = space, ifruFlags = ifruFlags, ifruAddrflags = ifruAddrflags, ifruMetrics = ifruMetrics, ifruMtu = ifruMtu, ifruDlt = ifruDlt, ifruValue = ifruValue, ifruDataCtorArg = ifruData, ifruB = ifruB)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfru) return false
        if (this.ifruAddr != other.ifruAddr) return false
        if (this.ifruDstaddr != other.ifruDstaddr) return false
        if (this.ifruBroadaddr != other.ifruBroadaddr) return false
        if (this.space != other.space) return false
        if (this.ifruFlags != other.ifruFlags) return false
        if (this.ifruAddrflags != other.ifruAddrflags) return false
        if (this.ifruMetrics != other.ifruMetrics) return false
        if (this.ifruMtu != other.ifruMtu) return false
        if (this.ifruDlt != other.ifruDlt) return false
        if (this.ifruValue != other.ifruValue) return false
        if (this.ifruData != other.ifruData) return false
        if (this.ifruB != other.ifruB) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ifruAddr.hashCode()
        result = 31 * result + this.ifruDstaddr.hashCode()
        result = 31 * result + this.ifruBroadaddr.hashCode()
        result = 31 * result + this.space.hashCode()
        result = 31 * result + this.ifruFlags.hashCode()
        result = 31 * result + this.ifruAddrflags.hashCode()
        result = 31 * result + this.ifruMetrics.hashCode()
        result = 31 * result + this.ifruMtu.hashCode()
        result = 31 * result + this.ifruDlt.hashCode()
        result = 31 * result + this.ifruValue.hashCode()
        result = 31 * result + this.ifruData.hashCode()
        result = 31 * result + this.ifruB.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            ifruAddr: Sockaddr = Sockaddr(),
            ifruDstaddr: Sockaddr = Sockaddr(),
            ifruBroadaddr: Sockaddr = Sockaddr(),
            space: SockaddrStorage = SockaddrStorage(),
            ifruFlags: CShort = 0,
            ifruAddrflags: CInt = 0,
            ifruMetrics: CInt = 0,
            ifruMtu: CInt = 0,
            ifruDlt: CInt = 0,
            ifruValue: CUint = 0u,
            ifruData: MutPtr<CVoid> = MutPtr(0L),
            ifruB: CAnonymousIfrIfruIfruB = CAnonymousIfrIfruIfruB(),
        ): CAnonymousIfrIfru =
            CAnonymousIfrIfru(
                ifruAddr = ifruAddr,
                ifruDstaddr = ifruDstaddr,
                ifruBroadaddr = ifruBroadaddr,
                space = space,
                ifruFlags = ifruFlags,
                ifruAddrflags = ifruAddrflags,
                ifruMetrics = ifruMetrics,
                ifruMtu = ifruMtu,
                ifruDlt = ifruDlt,
                ifruValue = ifruValue,
                ifruDataCtorArg = ifruData,
                ifruB = ifruB,
            )
    }
}

public class CAnonymousIfrIfruIfruB internal constructor(
    public var bBuflen: UInt,
    bBufCtorArg: MutPtr<CVoid>,
) {
    public var bBuf: MutPtr<CVoid> = bBufCtorArg
        internal set

    public constructor() : this(
        bBuflen = 0u,
        bBufCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.bBuflen

    public operator fun component2(): MutPtr<CVoid> = this.bBuf

    public fun copy(bBuflen: UInt = this.bBuflen, bBuf: MutPtr<CVoid> = this.bBuf): CAnonymousIfrIfruIfruB = CAnonymousIfrIfruIfruB(bBuflen = bBuflen, bBufCtorArg = bBuf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CAnonymousIfrIfruIfruB) return false
        if (this.bBuflen != other.bBuflen) return false
        if (this.bBuf != other.bBuf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.bBuflen.hashCode()
        result = 31 * result + this.bBuf.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousIfrIfruIfruB> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<CAnonymousIfrIfruIfruB> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): CAnonymousIfrIfruIfruB =
                    CAnonymousIfrIfruIfruB(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: CAnonymousIfrIfruIfruB) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.bBuflen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.bBuf)
                }
            }

        public operator fun invoke(
            bBuflen: UInt = 0u,
            bBuf: MutPtr<CVoid> = MutPtr(0L),
        ): CAnonymousIfrIfruIfruB =
            CAnonymousIfrIfruIfruB(
                bBuflen = bBuflen,
                bBufCtorArg = bBuf,
            )
    }
}

public data class Ifconf(
    public var ifcLen: CInt = 0,
    public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu(),
)

public class CAnonymousIfcIfcu internal constructor(
    ifcuBufCtorArg: MutPtr<CVoid>,
    ifcuReqCtorArg: MutPtr<Ifreq>,
) {
    public var ifcuBuf: MutPtr<CVoid> = ifcuBufCtorArg
        internal set

    public var ifcuReq: MutPtr<Ifreq> = ifcuReqCtorArg
        internal set

    public constructor() : this(
        ifcuBufCtorArg = MutPtr(0L),
        ifcuReqCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.ifcuBuf

    public operator fun component2(): MutPtr<Ifreq> = this.ifcuReq

    public fun copy(ifcuBuf: MutPtr<CVoid> = this.ifcuBuf, ifcuReq: MutPtr<Ifreq> = this.ifcuReq): CAnonymousIfcIfcu = CAnonymousIfcIfcu(ifcuBufCtorArg = ifcuBuf, ifcuReqCtorArg = ifcuReq)

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

    public companion object {
        public operator fun invoke(
            ifcuBuf: MutPtr<CVoid> = MutPtr(0L),
            ifcuReq: MutPtr<Ifreq> = MutPtr(0L),
        ): CAnonymousIfcIfcu =
            CAnonymousIfcIfcu(
                ifcuBufCtorArg = ifcuBuf,
                ifcuReqCtorArg = ifcuReq,
            )
    }
}
