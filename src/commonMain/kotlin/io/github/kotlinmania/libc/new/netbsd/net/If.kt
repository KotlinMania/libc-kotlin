// port-lint: source new/netbsd/net/if_.rs
package io.github.kotlinmania.libc.new.netbsd.net

import io.github.kotlinmania.libc.*

public data class IfData(
    val ifiType: UByte,
    val ifiAddrlen: UByte,
    val ifiHdrlen: UByte,
    val ifiLinkState: Int,
    val ifiMtu: ULong,
    val ifiMetric: ULong,
    val ifiBaudrate: ULong,
    val ifiIpackets: ULong,
    val ifiIerrors: ULong,
    val ifiOpackets: ULong,
    val ifiOerrors: ULong,
    val ifiCollisions: ULong,
    val ifiIbytes: ULong,
    val ifiObytes: ULong,
    val ifiImcasts: ULong,
    val ifiOmcasts: ULong,
    val ifiIqdrops: ULong,
    val ifiNoproto: ULong,
    val ifiLastchange: Timespec,
)

public data class IfMsghdr(
    val ifmMsglen: UShort,
    val ifmVersion: UByte,
    val ifmType: UByte,
    val ifmAddrs: Int,
    val ifmFlags: Int,
    val ifmIndex: UShort,
    val ifmData: IfData,
)

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
)

public data class Ifconf(
    val ifcLen: Int,
    val ifcIfcu: CAnonymousIfcIfcu,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val space: SockaddrStorage? = null,
    val ifruFlags: Short? = null,
    val ifruAddrflags: Int? = null,
    val ifruMetrics: Int? = null,
    val ifruMtu: Int? = null,
    val ifruDlt: Int? = null,
    val ifruValue: UInt? = null,
    val ifruData: COpaquePointer? = null,
    val ifruB: CAnonymousIfrIfruIfruB? = null,
)

// C struct; buf and buflen are deprecated but contribute to union size.
public data class CAnonymousIfrIfruIfruB(
    val bBuflen: UInt? = null,
    val bBuf: COpaquePointer? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfcIfcu(
    val ifcuBuf: COpaquePointer? = null,
    val ifcuReq: Ifreq? = null,
)

public const val LINK_STATE_UNKNOWN: Int = 0
public const val LINK_STATE_DOWN: Int = 1
public const val LINK_STATE_UP: Int = 2
public const val IFF_UP: Int = 0x0001
public const val IFF_BROADCAST: Int = 0x0002
public const val IFF_DEBUG: Int = 0x0004
public const val IFF_LOOPBACK: Int = 0x0008
public const val IFF_POINTOPOINT: Int = 0x0010
public const val IFF_RUNNING: Int = 0x0040
public const val IFF_NOARP: Int = 0x0080
public const val IFF_PROMISC: Int = 0x0100
public const val IFF_ALLMULTI: Int = 0x0200
public const val IFF_OACTIVE: Int = 0x0400
public const val IFF_SIMPLEX: Int = 0x0800
public const val IFF_LINK0: Int = 0x1000
public const val IFF_LINK1: Int = 0x2000
public const val IFF_LINK2: Int = 0x4000
public const val IFF_MULTICAST: Int = 0x8000
