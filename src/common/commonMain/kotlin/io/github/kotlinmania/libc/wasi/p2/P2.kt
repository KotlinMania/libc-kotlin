// port-lint: source wasi/p2.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Sockaddr =
                    Sockaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: Sockaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.saFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (0).toInt())
                    ).writeNative(addr + 2L, value.saData.toList())
                }
            }
    }
}

public data class InAddr(
    public var sAddr: InAddrT = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): InAddr =
                    InAddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: InAddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sAddr)
                }
            }
    }
}

public data class SockaddrIn(
    public var sinFamily: SaFamilyT = 0u,
    public var sinPort: InPortT = 0u,
    public var sinAddr: InAddr = InAddr(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): SockaddrIn =
                    SockaddrIn(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (InAddr.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SockaddrIn) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sinFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sinPort)
                    (InAddr.typeLayout()).writeNative(addr + 4L, value.sinAddr)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<In6Addr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<In6Addr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): In6Addr =
                    In6Addr(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: In6Addr) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.s6Addr.toList())
                }
            }
    }
}

public data class SockaddrIn6(
    public var sin6Family: SaFamilyT = 0u,
    public var sin6Port: InPortT = 0u,
    public var sin6Flowinfo: CUint = 0u,
    public var sin6Addr: In6Addr = In6Addr(),
    public var sin6ScopeId: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn6> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrIn6> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 32L
                override fun readNative(addr: Long): SockaddrIn6 =
                    SockaddrIn6(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (In6Addr.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SockaddrIn6) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.sin6Family)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.sin6Port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.sin6Flowinfo)
                    (In6Addr.typeLayout()).writeNative(addr + 8L, value.sin6Addr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.sin6ScopeId)
                }
            }
    }
}

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

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrStorage> {
                override val alignBytes: Long = 16L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): SockaddrStorage =
                    SockaddrStorage(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 2L).toUByteArray(),
                    )
                override fun writeNative(addr: Long, value: SockaddrStorage) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.ssFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 2L, value.ssData.toList())
                }
            }
    }
}

public class Addrinfo internal constructor(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    aiAddrCtorArg: MutPtr<Sockaddr>,
    aiCanonnameCtorArg: MutPtr<CChar>,
    aiNextCtorArg: MutPtr<Addrinfo>,
) {
    public var aiAddr: MutPtr<Sockaddr> = aiAddrCtorArg
        internal set

    public var aiCanonname: MutPtr<CChar> = aiCanonnameCtorArg
        internal set

    public var aiNext: MutPtr<Addrinfo> = aiNextCtorArg
        internal set

    public constructor() : this(
        aiFlags = 0,
        aiFamily = 0,
        aiSocktype = 0,
        aiProtocol = 0,
        aiAddrlen = 0u,
        aiAddrCtorArg = MutPtr(0L),
        aiCanonnameCtorArg = MutPtr(0L),
        aiNextCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.aiFlags

    public operator fun component2(): CInt = this.aiFamily

    public operator fun component3(): CInt = this.aiSocktype

    public operator fun component4(): CInt = this.aiProtocol

    public operator fun component5(): SocklenT = this.aiAddrlen

    public operator fun component6(): MutPtr<Sockaddr> = this.aiAddr

    public operator fun component7(): MutPtr<CChar> = this.aiCanonname

    public operator fun component8(): MutPtr<Addrinfo> = this.aiNext

    public fun copy(aiFlags: CInt = this.aiFlags, aiFamily: CInt = this.aiFamily, aiSocktype: CInt = this.aiSocktype, aiProtocol: CInt = this.aiProtocol, aiAddrlen: SocklenT = this.aiAddrlen, aiAddr: MutPtr<Sockaddr> = this.aiAddr, aiCanonname: MutPtr<CChar> = this.aiCanonname, aiNext: MutPtr<Addrinfo> = this.aiNext): Addrinfo = Addrinfo(aiFlags = aiFlags, aiFamily = aiFamily, aiSocktype = aiSocktype, aiProtocol = aiProtocol, aiAddrlen = aiAddrlen, aiAddrCtorArg = aiAddr, aiCanonnameCtorArg = aiCanonname, aiNextCtorArg = aiNext)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Addrinfo) return false
        if (this.aiFlags != other.aiFlags) return false
        if (this.aiFamily != other.aiFamily) return false
        if (this.aiSocktype != other.aiSocktype) return false
        if (this.aiProtocol != other.aiProtocol) return false
        if (this.aiAddrlen != other.aiAddrlen) return false
        if (this.aiAddr != other.aiAddr) return false
        if (this.aiCanonname != other.aiCanonname) return false
        if (this.aiNext != other.aiNext) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.aiFlags.hashCode()
        result = 31 * result + this.aiFamily.hashCode()
        result = 31 * result + this.aiSocktype.hashCode()
        result = 31 * result + this.aiProtocol.hashCode()
        result = 31 * result + this.aiAddrlen.hashCode()
        result = 31 * result + this.aiAddr.hashCode()
        result = 31 * result + this.aiCanonname.hashCode()
        result = 31 * result + this.aiNext.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Addrinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Addrinfo> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 48L
                override fun readNative(addr: Long): Addrinfo =
                    Addrinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Sockaddr>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CChar>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<Addrinfo>(64)
                        ).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Addrinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.aiFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.aiFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.aiSocktype)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.aiProtocol)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.aiAddrlen)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Sockaddr>(64)
                    ).writeNative(addr + 24L, value.aiAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CChar>(64)
                    ).writeNative(addr + 32L, value.aiCanonname)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<Addrinfo>(64)
                    ).writeNative(addr + 40L, value.aiNext)
                }
            }

        public operator fun invoke(
            aiFlags: CInt = 0,
            aiFamily: CInt = 0,
            aiSocktype: CInt = 0,
            aiProtocol: CInt = 0,
            aiAddrlen: SocklenT = 0u,
            aiAddr: MutPtr<Sockaddr> = MutPtr(0L),
            aiCanonname: MutPtr<CChar> = MutPtr(0L),
            aiNext: MutPtr<Addrinfo> = MutPtr(0L),
        ): Addrinfo =
            Addrinfo(
                aiFlags = aiFlags,
                aiFamily = aiFamily,
                aiSocktype = aiSocktype,
                aiProtocol = aiProtocol,
                aiAddrlen = aiAddrlen,
                aiAddrCtorArg = aiAddr,
                aiCanonnameCtorArg = aiCanonname,
                aiNextCtorArg = aiNext,
            )
    }
}

public data class IpMreq(
    public var imrMultiaddr: InAddr = InAddr(),
    public var imrInterface: InAddr = InAddr(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IpMreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): IpMreq =
                    IpMreq(
                        (InAddr.typeLayout()).readNative(addr),
                        (InAddr.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: IpMreq) {
                    (InAddr.typeLayout()).writeNative(addr, value.imrMultiaddr)
                    (InAddr.typeLayout()).writeNative(addr + 4L, value.imrInterface)
                }
            }
    }
}

public data class Ipv6Mreq(
    public var ipv6mrMultiaddr: In6Addr = In6Addr(),
    public var ipv6mrInterface: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6Mreq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Ipv6Mreq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Ipv6Mreq =
                    Ipv6Mreq(
                        (In6Addr.typeLayout()).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: Ipv6Mreq) {
                    (In6Addr.typeLayout()).writeNative(addr, value.ipv6mrMultiaddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.ipv6mrInterface)
                }
            }
    }
}

public data class Linger(
    public var lOnoff: CInt = 0,
    public var lLinger: CInt = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linger> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Linger> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 8L
                override fun readNative(addr: Long): Linger =
                    Linger(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Linger) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.lOnoff)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.lLinger)
                }
            }
    }
}

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

public expect fun connect(fd: CInt, name: ConstPtr<Sockaddr>, addrlen: SocklenT): CInt

public expect fun bind(socket: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): CInt

public expect fun listen(socket: CInt, backlog: CInt): CInt

public expect fun accept(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt

public expect fun accept4(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt

public expect fun getsockname(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt

public expect fun getpeername(socket: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): CInt

public expect fun sendto(socket: CInt, buffer: ConstPtr<CVoid>, length: SizeT, flags: CInt, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): SsizeT

public expect fun recvfrom(socket: CInt, buffer: MutPtr<CVoid>, length: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): CInt

public expect fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: ConstPtr<CVoid>, optlen: SocklenT): CInt

public expect fun getaddrinfo(host: ConstPtr<CChar>, serv: ConstPtr<CChar>, hint: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): CInt

public expect fun freeaddrinfo(p: MutPtr<Addrinfo>)

public expect fun gaiStrerror(ecode: CInt): ConstPtr<CChar>
