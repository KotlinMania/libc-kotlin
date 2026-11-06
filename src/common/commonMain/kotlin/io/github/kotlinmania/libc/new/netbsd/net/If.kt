// port-lint: source new/netbsd/net/if_.rs
package io.github.kotlinmania.libc.new.netbsd.net

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.Sockaddr
import io.github.kotlinmania.libc.SockaddrStorage
import io.github.kotlinmania.libc.Timespec
import io.github.kotlinmania.libc.unix.IFNAMSIZ

// Header: `net / if.h`
//
// <https://github.com/NetBSD/src/tree/trunk/sys/timex.h>

// supports multicast
public open class IfData(
    public var ifiType: CUchar,
    public var ifiAddrlen: CUchar,
    public var ifiHdrlen: CUchar,
    public var ifiLinkState: CInt,
    public var ifiMtu: ULong,
    public var ifiMetric: ULong,
    public var ifiBaudrate: ULong,
    public var ifiIpackets: ULong,
    public var ifiIerrors: ULong,
    public var ifiOpackets: ULong,
    public var ifiOerrors: ULong,
    public var ifiCollisions: ULong,
    public var ifiIbytes: ULong,
    public var ifiObytes: ULong,
    public var ifiImcasts: ULong,
    public var ifiOmcasts: ULong,
    public var ifiIqdrops: ULong,
    public var ifiNoproto: ULong,
    public var ifiLastchange: Timespec,
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

public open class IfMsghdr(
    public var ifmMsglen: CUshort,
    public var ifmVersion: CUchar,
    public var ifmType: CUchar,
    public var ifmAddrs: CInt,
    public var ifmFlags: CInt,
    public var ifmIndex: CUshort,
    public var ifmData: IfData,
)

public open class Ifreq(public var ifrName: List<CChar>, public var ifrIfru: CAnonymousIfrIfru)

public open class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr? = null,
    public var ifruDstaddr: Sockaddr? = null,
    public var ifruBroadaddr: Sockaddr? = null,
    public var space: SockaddrStorage? = null,
    public var ifruFlags: CShort? = null,
    public var ifruAddrflags: CInt? = null,
    public var ifruMetrics: CInt? = null,
    public var ifruMtu: CInt? = null,
    public var ifruDlt: CInt? = null,
    public var ifruValue: CUint? = null,
    public var ifruData: COpaquePointer?? = null,
    // buf and buflen are deprecated but they contribute to union size
    public var ifruB: CAnonymousIfrIfruIfruB? = null,
)

public open class CAnonymousIfrIfruIfruB(public var bBuflen: UInt, public var bBuf: COpaquePointer?)

public open class Ifconf(public var ifcLen: CInt, public var ifcIfcu: CAnonymousIfcIfcu)

public open class CAnonymousIfcIfcu(public var ifcuBuf: COpaquePointer?? = null, public var ifcuReq: Ifreq?? = null)
