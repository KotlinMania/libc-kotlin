// port-lint: source wasi/p2.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT

public typealias SaFamilyT = CUshort

public typealias InPortT = CUshort

public typealias InAddrT = CUint

public typealias SocklenT = CUint

public data class Sockaddr(
    public var saFamily: SaFamilyT = 0u,
    public var saData: UByteArray = UByteArray(0),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }
}

public data class InAddr(
    public var sAddr: InAddrT = 0u,
)

public data class SockaddrIn(
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
)

public data class In6Addr(
    public var s6Addr: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is In6Addr) return false
        if (!this.s6Addr.contentEquals(other.s6Addr)) return false
        return true
    }

    override fun hashCode(): Int = this.s6Addr.contentHashCode()
}

public data class SockaddrIn6(
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: CUint = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: CUint = 0u,
)

public data class SockaddrStorage(
    public var ssFamily: SaFamilyT = 0u,
    public var ssData: UByteArray = UByteArray(32),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SockaddrStorage) return false
        if (this.ssFamily != other.ssFamily) return false
        if (!this.ssData.contentEquals(other.ssData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.ssFamily.hashCode()
        result = 31 * result + this.ssData.contentHashCode()
        return result
    }
}

public data class Addrinfo(
    public var aiFlags: CInt = 0,
    public var aiFamily: CInt = 0,
    public var aiSocktype: CInt = 0,
    public var aiProtocol: CInt = 0,
    public var aiAddrlen: SocklenT = 0u,
    public var aiAddr: Sockaddr? = null,
    public var aiCanonname: COpaquePointer? = null,
    public var aiNext: Addrinfo? = null,
)

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
)

public data class Ipv6Mreq(
    public var ipv6mrMultiaddr: In6Addr = In6Addr(),
    public var ipv6mrInterface: CUint = 0u,
)

public data class Linger(
    public var lOnoff: CInt = 0,
    public var lLinger: CInt = 0,
)

public val SHUT_RD: CInt = 1 shl 0

public val SHUT_WR: CInt = 1 shl 1

public val SHUT_RDWR: CInt = SHUT_RD or SHUT_WR

public val MSG_NOSIGNAL: CInt = 0x4000

public val MSG_PEEK: CInt = 0x0002

public val SO_REUSEADDR: CInt = 2

public val SO_TYPE: CInt = 3

public val SO_ERROR: CInt = 4

public val SO_BROADCAST: CInt = 6

public val SO_SNDBUF: CInt = 7

public val SO_RCVBUF: CInt = 8

public val SO_KEEPALIVE: CInt = 9

public val SO_LINGER: CInt = 13

public val SO_ACCEPTCONN: CInt = 30

public val SO_PROTOCOL: CInt = 38

public val SO_DOMAIN: CInt = 39

public val SO_RCVTIMEO: CInt = 66

public val SO_SNDTIMEO: CInt = 67

public val SOCK_DGRAM: CInt = 5

public val SOCK_STREAM: CInt = 6

public val SOCK_NONBLOCK: CInt = 0x00004000

public val SOL_SOCKET: CInt = 0x7fffffff

public val AF_UNSPEC: CInt = 0

public val AF_INET: CInt = 1

public val AF_INET6: CInt = 2

public val IPPROTO_IP: CInt = 0

public val IPPROTO_TCP: CInt = 6

public val IPPROTO_UDP: CInt = 17

public val IPPROTO_IPV6: CInt = 41

public val IP_TTL: CInt = 2

public val IP_MULTICAST_TTL: CInt = 33

public val IP_MULTICAST_LOOP: CInt = 34

public val IP_ADD_MEMBERSHIP: CInt = 35

public val IP_DROP_MEMBERSHIP: CInt = 36

public val IPV6_UNICAST_HOPS: CInt = 16

public val IPV6_MULTICAST_LOOP: CInt = 19

public val IPV6_JOIN_GROUP: CInt = 20

public val IPV6_LEAVE_GROUP: CInt = 21

public val IPV6_V6ONLY: CInt = 26

public val IPV6_ADD_MEMBERSHIP: CInt = IPV6_JOIN_GROUP

public val IPV6_DROP_MEMBERSHIP: CInt = IPV6_LEAVE_GROUP

public val TCP_NODELAY: CInt = 1

public val TCP_KEEPIDLE: CInt = 4

public val TCP_KEEPINTVL: CInt = 5

public val TCP_KEEPCNT: CInt = 6

public val EAI_SYSTEM: CInt = -11

public expect fun socket(domain: CInt, type: CInt, protocol: CInt): CInt

public expect fun connect(fd: CInt, name: COpaquePointer?, addrlen: SocklenT): CInt

public expect fun bind(socket: CInt, addr: COpaquePointer?, addrlen: SocklenT): CInt

public expect fun listen(socket: CInt, backlog: CInt): CInt

public expect fun accept(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt

public expect fun accept4(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt

public expect fun getsockname(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt

public expect fun getpeername(socket: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): CInt

public expect fun sendto(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: SocklenT): SsizeT

public expect fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: COpaquePointer?): CInt

public expect fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt

public expect fun getaddrinfo(host: String?, serv: String?, hint: COpaquePointer?, res: COpaquePointer?): CInt

public expect fun freeaddrinfo(p: COpaquePointer?)

public expect fun gaiStrerror(ecode: CInt): COpaquePointer?
