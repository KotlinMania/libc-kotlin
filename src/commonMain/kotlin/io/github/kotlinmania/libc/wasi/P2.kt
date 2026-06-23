// port-lint: source wasi/p2.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias SaFamilyT = CUShort
public typealias InPortT = CUShort
public typealias InAddrT = CUInt
public typealias SocklenT = CUInt

public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class SockaddrIn(
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
)

public data class In6Addr(
    val s6Addr: UByteArray,
)

public data class SockaddrIn6(
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: CUInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: CUInt,
)

public data class SockaddrStorage(
    val ssFamily: SaFamilyT,
    val ssData: ByteArray,
)

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: SocklenT,
    val aiAddr: Sockaddr?,
    val aiCanonname: String?,
    val aiNext: Addrinfo?,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class Ipv6Mreq(
    val ipv6mrMultiaddr: In6Addr,
    val ipv6mrInterface: CUInt,
)

public data class Linger(
    val lOnoff: CInt,
    val lLinger: CInt,
)

public val SHUT_RD: CInt = 1 shl 0
public val SHUT_WR: CInt = 1 shl 1
public val SHUT_RDWR: CInt = SHUT_RD or SHUT_WR
public const val MSG_NOSIGNAL: CInt = 0x4000
public const val MSG_PEEK: CInt = 0x0002
public const val SO_REUSEADDR: CInt = 2
public const val SO_TYPE: CInt = 3
public const val SO_ERROR: CInt = 4
public const val SO_BROADCAST: CInt = 6
public const val SO_SNDBUF: CInt = 7
public const val SO_RCVBUF: CInt = 8
public const val SO_KEEPALIVE: CInt = 9
public const val SO_LINGER: CInt = 13
public const val SO_ACCEPTCONN: CInt = 30
public const val SO_PROTOCOL: CInt = 38
public const val SO_DOMAIN: CInt = 39
public const val SO_RCVTIMEO: CInt = 66
public const val SO_SNDTIMEO: CInt = 67
public const val SOCK_DGRAM: CInt = 5
public const val SOCK_STREAM: CInt = 6
public const val SOCK_NONBLOCK: CInt = 0x00004000
public const val SOL_SOCKET: CInt = 0x7fffffff
public const val AF_UNSPEC: CInt = 0
public const val AF_INET: CInt = 1
public const val AF_INET6: CInt = 2
public const val IPPROTO_IP: CInt = 0
public const val IPPROTO_TCP: CInt = 6
public const val IPPROTO_UDP: CInt = 17
public const val IPPROTO_IPV6: CInt = 41
public const val IP_TTL: CInt = 2
public const val IP_MULTICAST_TTL: CInt = 33
public const val IP_MULTICAST_LOOP: CInt = 34
public const val IP_ADD_MEMBERSHIP: CInt = 35
public const val IP_DROP_MEMBERSHIP: CInt = 36
public const val IPV6_UNICAST_HOPS: CInt = 16
public const val IPV6_MULTICAST_LOOP: CInt = 19
public const val IPV6_JOIN_GROUP: CInt = 20
public const val IPV6_LEAVE_GROUP: CInt = 21
public const val IPV6_V6ONLY: CInt = 26
public const val IPV6_ADD_MEMBERSHIP: CInt = IPV6_JOIN_GROUP
public const val IPV6_DROP_MEMBERSHIP: CInt = IPV6_LEAVE_GROUP
public const val TCP_NODELAY: CInt = 1
public const val TCP_KEEPIDLE: CInt = 4
public const val TCP_KEEPINTVL: CInt = 5
public const val TCP_KEEPCNT: CInt = 6
public const val EAI_SYSTEM: CInt = -11

public expect fun socket(domain: CInt, type: CInt, protocol: CInt): CInt
public expect fun connect(fd: CInt, name: Sockaddr?, addrlen: SocklenT): CInt
public expect fun bind(socket: CInt, addr: Sockaddr?, addrlen: SocklenT): CInt
public expect fun listen(socket: CInt, backlog: CInt): CInt
public expect fun accept(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt
public expect fun accept4(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt
public expect fun getsockname(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt
public expect fun getpeername(socket: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt
public expect fun sendto(socket: CInt, buffer: COpaquePointer?, length: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT
public expect fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT
public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt
public expect fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt
public expect fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): CInt
public expect fun freeaddrinfo(p: Addrinfo?)
public expect fun gaiStrerror(ecode: CInt): String?
