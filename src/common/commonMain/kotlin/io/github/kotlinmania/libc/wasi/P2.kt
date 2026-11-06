// port-lint: source wasi/p2.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.LibcDynamicFfi

public typealias SaFamilyT = CUshort

public typealias InPortT = CUshort

public typealias InAddrT = CUint

public typealias SocklenT = CUint

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<CChar>)

public open class InAddr(public var sAddr: InAddrT)

public open class SockaddrIn(
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
)

public open class In6Addr(public var s6Addr: List<CUchar>)

public open class SockaddrIn6(
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: CUint,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: CUint,
)

public open class SockaddrStorage(public var ssFamily: SaFamilyT, public var ssData: List<CChar>)

public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    public var aiAddr: Sockaddr?,
    public var aiCanonname: COpaquePointer?,
    public var aiNext: Addrinfo?,
)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class Ipv6Mreq(public var ipv6mrMultiaddr: In6Addr, public var ipv6mrInterface: CUint)

public open class Linger(public var lOnoff: CInt, public var lLinger: CInt)

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

public fun socket(domain: CInt, type: CInt, protocol: CInt): CInt {
    return LibcDynamicFfi.invoke("socket", -1, longArrayOf(domain.toLong(), type.toLong(), protocol.toLong())).toInt()
}

public fun connect(fd: CInt, name: Sockaddr?, addrlen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("connect", -1, longArrayOf(fd.toLong(), name?.value ?: 0L, addrlen.toLong())).toInt()
}

public fun bind(socket: CInt, addr: Sockaddr?, addrlen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("bind", -1, longArrayOf(socket.toLong(), addr?.value ?: 0L, addrlen.toLong())).toInt()
}

public fun listen(socket: CInt, backlog: CInt): CInt {
    return LibcDynamicFfi.invoke("listen", -1, longArrayOf(socket.toLong(), backlog.toLong())).toInt()
}

public fun accept(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt {
    val __slot_2 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("accept", -1, longArrayOf(socket.toLong(), addr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun accept4(socket: CInt, addr: Sockaddr?, addrlen: CUint?, flags: CInt): CInt {
    val __slot_2 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("accept4", -1, longArrayOf(socket.toLong(), addr?.value ?: 0L, __slot_2, flags.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getsockname(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt {
    val __slot_2 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("getsockname", -1, longArrayOf(socket.toLong(), addr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun getpeername(socket: CInt, addr: Sockaddr?, addrlen: CUint?): CInt {
    val __slot_2 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("getpeername", -1, longArrayOf(socket.toLong(), addr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sendto(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT {
    return LibcDynamicFfi.invoke("sendto", -1, longArrayOf(socket.toLong(), buffer?.value ?: 0L, length.toLong(), flags.toLong(), addr?.value ?: 0L, addrlen.toLong()))
}

public fun recvfrom(socket: CInt, buffer: COpaquePointer?, length: SizeT, flags: CInt, addr: Sockaddr?, addrlen: CUint?): SsizeT {
    val __slot_5 = if (addrlen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrlen.toLong())
    try {
        return LibcDynamicFfi.invoke("recvfrom", -1, longArrayOf(socket.toLong(), buffer?.value ?: 0L, length.toLong(), flags.toLong(), addr?.value ?: 0L, __slot_5))
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CUint?): CInt {
    val __slot_4 = if (optlen == null) 0L else LibcDynamicFfi.allocScalarSlot(optlen.toLong())
    try {
        return LibcDynamicFfi.invoke("getsockopt", -1, longArrayOf(sockfd.toLong(), level.toLong(), optname.toLong(), optval?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT): CInt {
    return LibcDynamicFfi.invoke("setsockopt", -1, longArrayOf(sockfd.toLong(), level.toLong(), optname.toLong(), optval?.value ?: 0L, optlen.toLong())).toInt()
}

public fun getaddrinfo(host: String?, serv: String?, hint: Addrinfo?, res: COpaquePointer?): CInt {
    val __cstr_0 = if (host == null) 0L else LibcDynamicFfi.allocUtf8CString(host)
    val __cstr_1 = if (serv == null) 0L else LibcDynamicFfi.allocUtf8CString(serv)
    try {
        return LibcDynamicFfi.invoke("getaddrinfo", -1, longArrayOf(__cstr_0, __cstr_1, hint?.value ?: 0L, res?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun freeaddrinfo(p: Addrinfo?) {
    LibcDynamicFfi.invoke("freeaddrinfo", -1, longArrayOf(p?.value ?: 0L))
}

public fun gaiStrerror(ecode: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("gai_strerror", -1, longArrayOf(ecode.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}
