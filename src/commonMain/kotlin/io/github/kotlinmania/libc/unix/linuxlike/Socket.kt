// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

/**
 * Socket-related structures and types for Linux-like systems.
 *
 * Ported from the linux-like upstream Rust libc module.
 */

public typealias SaFamilyT = UShort

public typealias SpeedT = CUInt

public typealias TcflagT = CUInt

public typealias ClockidT = CInt

public typealias TimerT = COpaquePointer?

public typealias UsecondsT = UInt

public typealias KeyT = CInt

public typealias IdT = CUInt

/**
 * IPv4 address structure.
 *
 * Represents a 32-bit IPv4 address.
 */
public data class InAddr(
    val sAddr: CUInt
)

/**
 * IPv4 multicast group request structure.
 *
 * Used for joining/leaving IPv4 multicast groups.
 */
public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr
)

/**
 * IPv4 multicast group request structure with interface index.
 *
 * Extended version of IpMreq that includes an interface index.
 */
public data class IpMreqn(
    val imrMultiaddr: InAddr,
    val imrAddress: InAddr,
    val imrIfindex: CInt
)

/**
 * IPv4 source-specific multicast request structure.
 *
 * Used for source-specific multicast (SSM) operations.
 */
public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
    val imrSourceaddr: InAddr
)

/**
 * Generic socket address structure.
 *
 * This is the base socket address type used in socket APIs.
 */
public data class Sockaddr(
    val saFamily: CUShort,
    val saData: ByteArray
) {
    init {
        require(saData.size == 14) { "Socket address data must be exactly 14 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Sockaddr
        if (saFamily != other.saFamily) return false
        if (!saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = saFamily.hashCode()
        result = 31 * result + saData.contentHashCode()
        return result
    }
}

/**
 * IPv4 socket address structure.
 *
 * Used for IPv4 socket addressing (AF_INET).
 */
public data class SockaddrIn(
    val sinFamily: CUShort,
    val sinPort: CUShort,
    val sinAddr: InAddr,
    val sinZero: ByteArray
) {
    init {
        require(sinZero.size == 8) { "Socket address padding must be exactly 8 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as SockaddrIn
        if (sinFamily != other.sinFamily) return false
        if (sinPort != other.sinPort) return false
        if (sinAddr != other.sinAddr) return false
        if (!sinZero.contentEquals(other.sinZero)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = sinFamily.hashCode()
        result = 31 * result + sinPort.hashCode()
        result = 31 * result + sinAddr.hashCode()
        result = 31 * result + sinZero.contentHashCode()
        return result
    }
}

/**
 * IPv6 address structure.
 *
 * Represents a 128-bit IPv6 address as an array of 16 bytes.
 * In the upstream Rust code, this is marked with `repr(align(4))` for 4-byte alignment.
 */
public data class In6Addr(
    val s6Addr: ByteArray
) {
    init {
        require(s6Addr.size == 16) { "IPv6 address must be exactly 16 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as In6Addr
        return s6Addr.contentEquals(other.s6Addr)
    }

    override fun hashCode(): Int {
        return s6Addr.contentHashCode()
    }
}

/**
 * IPv6 socket address structure.
 *
 * Used for IPv6 socket addressing (AF_INET6).
 */
public data class SockaddrIn6(
    val sin6Family: CUShort,
    val sin6Port: CUShort,
    val sin6Flowinfo: CUInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: CUInt
)

/**
 * IPv6 multicast group request structure.
 *
 * Used for joining/leaving IPv6 multicast groups.
 *
 * Note: On Android, the interface field is signed Int. On other platforms, it is unsigned Int.
 * For Kotlin Multiplatform portability, this uses CInt (which is consistent across all
 * KMP targets). Platform-specific differentiation is omitted in this initial translation.
 */
public data class Ipv6Mreq(
    val ipv6mrMultiaddr: In6Addr,
    val ipv6mrInterface: CInt
)

/**
 * Link layer socket address structure.
 *
 * Used for packet sockets (AF_PACKET).
 */
public data class SockaddrLl(
    val sllFamily: CUShort,
    val sllProtocol: CUShort,
    val sllIfindex: CInt,
    val sllHatype: CUShort,
    val sllPkttype: UByte,
    val sllHalen: UByte,
    val sllAddr: ByteArray
) {
    init {
        require(sllAddr.size == 8) { "Link layer address must be exactly 8 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as SockaddrLl
        if (sllFamily != other.sllFamily) return false
        if (sllProtocol != other.sllProtocol) return false
        if (sllIfindex != other.sllIfindex) return false
        if (sllHatype != other.sllHatype) return false
        if (sllPkttype != other.sllPkttype) return false
        if (sllHalen != other.sllHalen) return false
        if (!sllAddr.contentEquals(other.sllAddr)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = sllFamily.hashCode()
        result = 31 * result + sllProtocol.hashCode()
        result = 31 * result + sllIfindex
        result = 31 * result + sllHatype.hashCode()
        result = 31 * result + sllPkttype.hashCode()
        result = 31 * result + sllHalen.hashCode()
        result = 31 * result + sllAddr.contentHashCode()
        return result
    }
}

/**
 * Unix domain socket address structure.
 *
 * Used for Unix domain sockets (AF_UNIX/AF_LOCAL).
 */
public data class SockaddrUn(
    val sunFamily: CUShort,
    val sunPath: ByteArray
) {
    init {
        require(sunPath.size == 108) { "Unix socket path must be exactly 108 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as SockaddrUn
        if (sunFamily != other.sunFamily) return false
        if (!sunPath.contentEquals(other.sunPath)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = sunFamily.hashCode()
        result = 31 * result + sunPath.contentHashCode()
        return result
    }
}

/**
 * Socket address storage structure.
 *
 * Large enough to hold any socket address type.
 * This structure is used when you need to store a socket address of unknown type.
 *
 * Note: The upstream Rust code has platform-specific padding based on pointer width.
 * For Kotlin Multiplatform, we use a simplified representation as padding is handled
 * by platform-specific FFI layers.
 */
public data class SockaddrStorage(
    val ssFamily: CUShort,
    val padding: ByteArray
) {
    init {
        // Platform-specific size: 126 bytes for 32-bit, 118 bytes for 64-bit
        // We'll use the larger size (126) for compatibility
        require(padding.size == 126) { "Socket address storage padding must be 126 bytes" }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as SockaddrStorage
        if (ssFamily != other.ssFamily) return false
        if (!padding.contentEquals(other.padding)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = ssFamily.hashCode()
        result = 31 * result + padding.contentHashCode()
        return result
    }
}

/**
 * Address information structure.
 *
 * Used by getaddrinfo() and related functions for host/service name resolution.
 *
 * Note: The order of fields, particularly the address field, is important for FFI compatibility.
 * The upstream Rust code has different field ordering for Android vs other platforms,
 * but the logical structure is the same.
 */
public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: CUInt,
    val aiAddr: ByteArray?,
    val aiCanonname: String?,
    val aiNext: Addrinfo?
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false
        other as Addrinfo
        if (aiFlags != other.aiFlags) return false
        if (aiFamily != other.aiFamily) return false
        if (aiSocktype != other.aiSocktype) return false
        if (aiProtocol != other.aiProtocol) return false
        if (aiAddrlen != other.aiAddrlen) return false
        if (aiAddr != null) {
            if (other.aiAddr == null) return false
            if (!aiAddr.contentEquals(other.aiAddr)) return false
        } else if (other.aiAddr != null) return false
        if (aiCanonname != other.aiCanonname) return false
        if (aiNext != other.aiNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = aiFlags
        result = 31 * result + aiFamily
        result = 31 * result + aiSocktype
        result = 31 * result + aiProtocol
        result = 31 * result + aiAddrlen.hashCode()
        result = 31 * result + (aiAddr?.contentHashCode() ?: 0)
        result = 31 * result + (aiCanonname?.hashCode() ?: 0)
        result = 31 * result + (aiNext?.hashCode() ?: 0)
        return result
    }
}

/**
 * Socket linger structure.
 *
 * Controls the behavior of close() when there is unsent data.
 * Used with the SO_LINGER socket option.
 */
public data class Linger(
    val lOnoff: CInt,
    val lLinger: CInt
)

internal fun cmsgAlign(len: ULong): ULong {
    return (len + ULong.SIZE_BYTES.toULong() - 1uL) and (ULong.SIZE_BYTES.toULong() - 1uL).inv()
}
