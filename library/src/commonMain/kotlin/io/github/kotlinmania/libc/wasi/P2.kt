// port-lint: source wasi/p2.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public data class Sockaddr(
    val saFamily: UShort,
    val saData: ByteArray,
)

public data class InAddr(
    val sAddr: UInt,
)

public data class SockaddrIn(
    val sinFamily: UShort,
    val sinPort: UShort,
    val sinAddr: InAddr,
)

public data class In6Addr(
    val s6Addr: UByteArray,
)

public data class SockaddrIn6(
    val sin6Family: UShort,
    val sin6Port: UShort,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class SockaddrStorage(
    val ssFamily: UShort,
    val ssData: ByteArray,
)

public data class Addrinfo(
    val aiFlags: Int,
    val aiFamily: Int,
    val aiSocktype: Int,
    val aiProtocol: Int,
    val aiAddrlen: UInt,
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
    val ipv6mrInterface: UInt,
)

public data class Linger(
    val lOnoff: Int,
    val lLinger: Int,
)

public val SHUT_RD: Int = 1 shl 0
public val SHUT_WR: Int = 1 shl 1
public val SHUT_RDWR: Int = SHUT_RD or SHUT_WR
public const val MSG_NOSIGNAL: Int = 0x4000
public const val MSG_PEEK: Int = 0x0002
public const val SO_REUSEADDR: Int = 2
public const val SO_TYPE: Int = 3
public const val SO_ERROR: Int = 4
public const val SO_BROADCAST: Int = 6
public const val SO_SNDBUF: Int = 7
public const val SO_RCVBUF: Int = 8
public const val SO_KEEPALIVE: Int = 9
public const val SO_LINGER: Int = 13
public const val SO_ACCEPTCONN: Int = 30
public const val SO_PROTOCOL: Int = 38
public const val SO_DOMAIN: Int = 39
public const val SO_RCVTIMEO: Int = 66
public const val SO_SNDTIMEO: Int = 67
public const val SOCK_DGRAM: Int = 5
public const val SOCK_STREAM: Int = 6
public const val SOCK_NONBLOCK: Int = 0x00004000
public const val SOL_SOCKET: Int = 0x7fffffff
public const val AF_UNSPEC: Int = 0
public const val AF_INET: Int = 1
public const val AF_INET6: Int = 2
public const val IPPROTO_IP: Int = 0
public const val IPPROTO_TCP: Int = 6
public const val IPPROTO_UDP: Int = 17
public const val IPPROTO_IPV6: Int = 41
public const val IP_TTL: Int = 2
public const val IP_MULTICAST_TTL: Int = 33
public const val IP_MULTICAST_LOOP: Int = 34
public const val IP_ADD_MEMBERSHIP: Int = 35
public const val IP_DROP_MEMBERSHIP: Int = 36
public const val IPV6_UNICAST_HOPS: Int = 16
public const val IPV6_MULTICAST_LOOP: Int = 19
public const val IPV6_JOIN_GROUP: Int = 20
public const val IPV6_LEAVE_GROUP: Int = 21
public const val IPV6_V6ONLY: Int = 26
public const val IPV6_ADD_MEMBERSHIP: Int = IPV6_JOIN_GROUP
public const val IPV6_DROP_MEMBERSHIP: Int = IPV6_LEAVE_GROUP
public const val TCP_NODELAY: Int = 1
public const val TCP_KEEPIDLE: Int = 4
public const val TCP_KEEPINTVL: Int = 5
public const val TCP_KEEPCNT: Int = 6
public const val EAI_SYSTEM: Int = -11

public expect fun socket(domain: Int, type: Int, protocol: Int): Int

public expect fun connect(fd: Int, name: Sockaddr?, addrlen: UInt): Int

public expect fun bind(socket: Int, addr: Sockaddr?, addrlen: UInt): Int

public expect fun listen(socket: Int, backlog: Int): Int

public expect fun accept(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int

public expect fun accept4(socket: Int, addr: Sockaddr?, addrlen: UInt?, flags: Int): Int

public expect fun getsockname(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int

public expect fun getpeername(socket: Int, addr: Sockaddr?, addrlen: UInt?): Int

public expect fun sendto(socket: Int, buffer: COpaquePointer?, length: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt): Long

public expect fun recvfrom(socket: Int, buffer: COpaquePointer?, length: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long

public expect fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt?): Int

public expect fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: COpaquePointer?, optlen: UInt): Int

public expect fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): Int

public expect fun freeaddrinfo(p: Addrinfo?)

public expect fun gaiStrerror(ecode: Int): String?
