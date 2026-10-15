// port-lint: source new/linux_uapi/linux/netlink.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux

import io.github.kotlinmania.libc.*

public data class SockaddrNl(
    val nlFamily: UShort,
    val nlPid: UInt,
    val nlGroups: UInt,
)

public data class Nlmsghdr(
    val nlmsgLen: UInt,
    val nlmsgType: UShort,
    val nlmsgFlags: UShort,
    val nlmsgSeq: UInt,
    val nlmsgPid: UInt,
)

public data class Nlmsgerr(
    val error: Int,
    val msg: Nlmsghdr,
)

public data class NlPktinfo(
    val group: UInt,
)

public data class NlMmapReq(
    val nmBlockSize: UInt,
    val nmBlockNr: UInt,
    val nmFrameSize: UInt,
    val nmFrameNr: UInt,
)

public data class NlMmapHdr(
    val nmStatus: UInt,
    val nmLen: UInt,
    val nmGroup: UInt,
    val nmPid: UInt,
    val nmUid: UInt,
    val nmGid: UInt,
)

public data class Nlattr(
    val nlaLen: UShort,
    val nlaType: UShort,
)

public const val NETLINK_ROUTE: Int = 0
public const val NETLINK_UNUSED: Int = 1
public const val NETLINK_USERSOCK: Int = 2
public const val NETLINK_FIREWALL: Int = 3
public const val NETLINK_SOCK_DIAG: Int = 4
public const val NETLINK_NFLOG: Int = 5
public const val NETLINK_XFRM: Int = 6
public const val NETLINK_SELINUX: Int = 7
public const val NETLINK_ISCSI: Int = 8
public const val NETLINK_AUDIT: Int = 9
public const val NETLINK_FIB_LOOKUP: Int = 10
public const val NETLINK_CONNECTOR: Int = 11
public const val NETLINK_NETFILTER: Int = 12
public const val NETLINK_IP6_FW: Int = 13
public const val NETLINK_DNRTMSG: Int = 14
public const val NETLINK_KOBJECT_UEVENT: Int = 15
public const val NETLINK_GENERIC: Int = 16
public const val NETLINK_SCSITRANSPORT: Int = 18
public const val NETLINK_ECRYPTFS: Int = 19
public const val NETLINK_RDMA: Int = 20
public const val NETLINK_CRYPTO: Int = 21
public const val NETLINK_INET_DIAG: Int = NETLINK_SOCK_DIAG
public const val MAX_LINKS: Int = 32
public const val NLM_F_REQUEST: Int = 1
public const val NLM_F_MULTI: Int = 2
public const val NLM_F_ACK: Int = 4
public const val NLM_F_ECHO: Int = 8
public const val NLM_F_DUMP_INTR: Int = 16
public const val NLM_F_DUMP_FILTERED: Int = 32
public const val NLM_F_ROOT: Int = 0x100
public const val NLM_F_MATCH: Int = 0x200
public const val NLM_F_ATOMIC: Int = 0x400
public val NLM_F_DUMP: Int = NLM_F_ROOT or NLM_F_MATCH
public const val NLM_F_REPLACE: Int = 0x100
public const val NLM_F_EXCL: Int = 0x200
public const val NLM_F_CREATE: Int = 0x400
public const val NLM_F_APPEND: Int = 0x800
public const val NLM_F_NONREC: Int = 0x100
public const val NLM_F_CAPPED: Int = 0x100
public const val NLM_F_ACK_TLVS: Int = 0x200
public const val NLMSG_NOOP: Int = 0x1
public const val NLMSG_ERROR: Int = 0x2
public const val NLMSG_DONE: Int = 0x3
public const val NLMSG_OVERRUN: Int = 0x4
public const val NLMSG_MIN_TYPE: Int = 0x10
public const val NETLINK_ADD_MEMBERSHIP: Int = 1
public const val NETLINK_DROP_MEMBERSHIP: Int = 2
public const val NETLINK_PKTINFO: Int = 3
public const val NETLINK_BROADCAST_ERROR: Int = 4
public const val NETLINK_NO_ENOBUFS: Int = 5
public const val NETLINK_RX_RING: Int = 6
public const val NETLINK_TX_RING: Int = 7
public const val NETLINK_LISTEN_ALL_NSID: Int = 8
public const val NETLINK_LIST_MEMBERSHIPS: Int = 9
public const val NETLINK_CAP_ACK: Int = 10
public const val NETLINK_EXT_ACK: Int = 11
public const val NETLINK_GET_STRICT_CHK: Int = 12
public val NLA_F_NESTED: Int = 1 shl 15
public val NLA_F_NET_BYTEORDER: Int = 1 shl 14
public val NLA_TYPE_MASK: Int = (NLA_F_NESTED or NLA_F_NET_BYTEORDER).inv()
public const val NLA_ALIGNTO: Int = 4

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun nlaAlign(len: Int): Int
