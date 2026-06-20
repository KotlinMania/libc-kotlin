// port-lint: source new/netbsd/net/if_.rs
package io.github.kotlinmania.libc.new.netbsd.net

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

/**
 * Header: `net/if.h`.
 */

public data class IfData(
    val ifiType: CUChar,
    val ifiAddrlen: CUChar,
    val ifiHdrlen: CUChar,
    val ifiLinkState: CInt,
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

public const val LINK_STATE_UNKNOWN: CInt = 0
public const val LINK_STATE_DOWN: CInt = 1
public const val LINK_STATE_UP: CInt = 2

public const val IFF_UP: CInt = 0x0001
public const val IFF_BROADCAST: CInt = 0x0002
public const val IFF_DEBUG: CInt = 0x0004
public const val IFF_LOOPBACK: CInt = 0x0008
public const val IFF_POINTOPOINT: CInt = 0x0010
public const val IFF_RUNNING: CInt = 0x0040
public const val IFF_NOARP: CInt = 0x0080
public const val IFF_PROMISC: CInt = 0x0100
public const val IFF_ALLMULTI: CInt = 0x0200
public const val IFF_OACTIVE: CInt = 0x0400
public const val IFF_SIMPLEX: CInt = 0x0800
public const val IFF_LINK0: CInt = 0x1000
public const val IFF_LINK1: CInt = 0x2000
public const val IFF_LINK2: CInt = 0x4000
public const val IFF_MULTICAST: CInt = 0x8000

public data class IfMsghdr(
    val ifmMsglen: CUShort,
    val ifmVersion: CUChar,
    val ifmType: CUChar,
    val ifmAddrs: CInt,
    val ifmFlags: CInt,
    val ifmIndex: CUShort,
    val ifmData: IfData,
)

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
) {
    init {
        require(ifrName.size == IFNAMSIZ) { "ifr_name must be $IFNAMSIZ bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Ifreq
        if (!ifrName.contentEquals(other.ifrName)) return false
        if (ifrIfru != other.ifrIfru) return false
        return true
    }

    override fun hashCode(): Int {
        var result = ifrName.contentHashCode()
        result = 31 * result + ifrIfru.hashCode()
        return result
    }
}

// C union; only one variant is valid at a time. ifru_b is deprecated but
// contributes to the union size.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr? = null,
    val ifruDstaddr: Sockaddr? = null,
    val ifruBroadaddr: Sockaddr? = null,
    val space: SockaddrStorage? = null,
    val ifruFlags: CShort? = null,
    val ifruAddrflags: CInt? = null,
    val ifruMetrics: CInt? = null,
    val ifruMtu: CInt? = null,
    val ifruDlt: CInt? = null,
    val ifruValue: CUInt? = null,
    val ifruData: COpaquePointer? = null,
    val ifruB: CAnonymousIfrIfruIfruB? = null,
)

public data class CAnonymousIfrIfruIfruB(
    val bBuflen: UInt,
    val bBuf: COpaquePointer?,
)

public data class Ifconf(
    val ifcLen: CInt,
    val ifcIfcu: CAnonymousIfcIfcu,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfcIfcu(
    val ifcuBuf: COpaquePointer? = null,
    val ifcuReq: Ifreq? = null,
)
