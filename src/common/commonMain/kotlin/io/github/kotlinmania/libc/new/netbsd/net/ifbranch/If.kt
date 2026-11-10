// port-lint: source new/netbsd/net/if_.rs
@file:OptIn(ExperimentalUnsignedTypes::class)
package io.github.kotlinmania.libc.new.netbsd.net.ifbranch

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.IFNAMSIZ
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.SockaddrStorage
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr

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

public data class Ifreq(public var ifrName: UByteArray = UByteArray(IFNAMSIZ.toInt()), public var ifrIfru: CAnonymousIfrIfru = CAnonymousIfrIfru()) {
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

public data class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr = Sockaddr(),
    public var ifruDstaddr: Sockaddr = Sockaddr(),
    public var ifruBroadaddr: Sockaddr = Sockaddr(),
    public var space: SockaddrStorage = SockaddrStorage(),
    public var ifruFlags: CShort = 0,
    public var ifruAddrflags: CInt = 0,
    public var ifruMetrics: CInt = 0,
    public var ifruMtu: CInt = 0,
    public var ifruDlt: CInt = 0,
    public var ifruValue: CUint = 0u,
    public var ifruData: COpaquePointer? = null,
    // buf and buflen are deprecated but they contribute to union size
    public var ifruB: CAnonymousIfrIfruIfruB = CAnonymousIfrIfruIfruB(),
)

public data class CAnonymousIfrIfruIfruB(public var bBuflen: UInt = 0u, public var bBuf: COpaquePointer? = null)

public data class Ifconf(public var ifcLen: CInt = 0, public var ifcIfcu: CAnonymousIfcIfcu = CAnonymousIfcIfcu())

public data class CAnonymousIfcIfcu(public var ifcuBuf: COpaquePointer? = null, public var ifcuReq: Ifreq? = null)
