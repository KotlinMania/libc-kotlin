// port-lint: source new/linux_uapi/linux/netlink.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.netlink

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.new.qurt.SaFamilyT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout

// Header: `uapi / linux / netlink.h`

public val NETLINK_ROUTE: CInt = 0

public val NETLINK_UNUSED: CInt = 1

public val NETLINK_USERSOCK: CInt = 2

public val NETLINK_FIREWALL: CInt = 3

public val NETLINK_SOCK_DIAG: CInt = 4

public val NETLINK_NFLOG: CInt = 5

public val NETLINK_XFRM: CInt = 6

public val NETLINK_SELINUX: CInt = 7

public val NETLINK_ISCSI: CInt = 8

public val NETLINK_AUDIT: CInt = 9

public val NETLINK_FIB_LOOKUP: CInt = 10

public val NETLINK_CONNECTOR: CInt = 11

public val NETLINK_NETFILTER: CInt = 12

public val NETLINK_IP6_FW: CInt = 13

public val NETLINK_DNRTMSG: CInt = 14

public val NETLINK_KOBJECT_UEVENT: CInt = 15

public val NETLINK_GENERIC: CInt = 16

public val NETLINK_SCSITRANSPORT: CInt = 18

public val NETLINK_ECRYPTFS: CInt = 19

public val NETLINK_RDMA: CInt = 20

public val NETLINK_CRYPTO: CInt = 21

public val NETLINK_INET_DIAG: CInt = NETLINK_SOCK_DIAG

public val MAX_LINKS: CInt = 32

public data class SockaddrNl(
    public var nlFamily: SaFamilyT = 0u,
    public var nlPad: CUshort = 0u,
    public var nlPid: UInt = 0u,
    public var nlGroups: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrNl> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SockaddrNl> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 12L
                override fun readNative(addr: Long): SockaddrNl =
                    SockaddrNl(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SockaddrNl) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nlFamily)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nlPad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nlPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nlGroups)
                }
            }
    }
}

public data class Nlmsghdr(
    public var nlmsgLen: UInt = 0u,
    public var nlmsgType: UShort = 0u,
    public var nlmsgFlags: UShort = 0u,
    public var nlmsgSeq: UInt = 0u,
    public var nlmsgPid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlmsghdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlmsghdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Nlmsghdr =
                    Nlmsghdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: Nlmsghdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nlmsgLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.nlmsgType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.nlmsgFlags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nlmsgSeq)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nlmsgPid)
                }
            }
    }
}

public val NLM_F_REQUEST: CInt = 1

public val NLM_F_MULTI: CInt = 2

public val NLM_F_ACK: CInt = 4

public val NLM_F_ECHO: CInt = 8

public val NLM_F_DUMP_INTR: CInt = 16

public val NLM_F_DUMP_FILTERED: CInt = 32

public val NLM_F_ROOT: CInt = 0x100

public val NLM_F_MATCH: CInt = 0x200

public val NLM_F_ATOMIC: CInt = 0x400

public val NLM_F_DUMP: CInt = NLM_F_ROOT or NLM_F_MATCH

public val NLM_F_REPLACE: CInt = 0x100

public val NLM_F_EXCL: CInt = 0x200

public val NLM_F_CREATE: CInt = 0x400

public val NLM_F_APPEND: CInt = 0x800

public val NLM_F_NONREC: CInt = 0x100

public val NLM_F_CAPPED: CInt = 0x100

public val NLM_F_ACK_TLVS: CInt = 0x200

public val NLMSG_NOOP: CInt = 0x1

public val NLMSG_ERROR: CInt = 0x2

public val NLMSG_DONE: CInt = 0x3

public val NLMSG_OVERRUN: CInt = 0x4

public val NLMSG_MIN_TYPE: CInt = 0x10

public data class Nlmsgerr(
    public var error: CInt = 0,
    public var msg: Nlmsghdr = Nlmsghdr(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlmsgerr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlmsgerr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 20L
                override fun readNative(addr: Long): Nlmsgerr =
                    Nlmsgerr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (Nlmsghdr.typeLayout()).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Nlmsgerr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.error)
                    (Nlmsghdr.typeLayout()).writeNative(addr + 4L, value.msg)
                }
            }
    }
}

public val NETLINK_ADD_MEMBERSHIP: CInt = 1

public val NETLINK_DROP_MEMBERSHIP: CInt = 2

public val NETLINK_PKTINFO: CInt = 3

public val NETLINK_BROADCAST_ERROR: CInt = 4

public val NETLINK_NO_ENOBUFS: CInt = 5

public val NETLINK_RX_RING: CInt = 6

public val NETLINK_TX_RING: CInt = 7

public val NETLINK_LISTEN_ALL_NSID: CInt = 8

public val NETLINK_LIST_MEMBERSHIPS: CInt = 9

public val NETLINK_CAP_ACK: CInt = 10

public val NETLINK_EXT_ACK: CInt = 11

public val NETLINK_GET_STRICT_CHK: CInt = 12

public data class NlPktinfo(
    public var group: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlPktinfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlPktinfo> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): NlPktinfo =
                    NlPktinfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: NlPktinfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.group)
                }
            }
    }
}

public data class NlMmapReq(
    public var nmBlockSize: CUint = 0u,
    public var nmBlockNr: CUint = 0u,
    public var nmFrameSize: CUint = 0u,
    public var nmFrameNr: CUint = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlMmapReq> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlMmapReq> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): NlMmapReq =
                    NlMmapReq(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: NlMmapReq) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nmBlockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nmBlockNr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nmFrameSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nmFrameNr)
                }
            }
    }
}

public data class NlMmapHdr(
    public var nmStatus: CUint = 0u,
    public var nmLen: CUint = 0u,
    public var nmGroup: UInt = 0u,
    public var nmPid: UInt = 0u,
    public var nmUid: UInt = 0u,
    public var nmGid: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlMmapHdr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<NlMmapHdr> {
                override val alignBytes: Long = 4L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): NlMmapHdr =
                    NlMmapHdr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: NlMmapHdr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.nmStatus)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.nmLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.nmGroup)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.nmPid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.nmUid)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.nmGid)
                }
            }
    }
}

public data class Nlattr(
    public var nlaLen: UShort = 0u,
    public var nlaType: UShort = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlattr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Nlattr> {
                override val alignBytes: Long = 2L
                override val sizeBytes: Long = 4L
                override fun readNative(addr: Long): Nlattr =
                    Nlattr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Nlattr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.nlaLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.nlaType)
                }
            }
    }
}

public val NLA_F_NESTED: CInt = 1 shl 15

public val NLA_F_NET_BYTEORDER: CInt = 1 shl 14

public val NLA_TYPE_MASK: CInt = (NLA_F_NESTED or NLA_F_NET_BYTEORDER).inv()

public val NLA_ALIGNTO: CInt = 4

public fun nlaAlign(len: CInt): CInt = ((len) + NLA_ALIGNTO - 1) and (NLA_ALIGNTO - 1).inv()
