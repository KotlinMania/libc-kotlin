// port-lint: source new/linux_uapi/linux/netlink.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux

import io.github.kotlinmania.libc.*

public data class SockaddrNl(
    val nlFamily: SaFamilyT,
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
    val error: CInt,
    val msg: Nlmsghdr,
)

public data class NlPktinfo(
    val group: UInt,
)

public data class NlMmapReq(
    val nmBlockSize: CUInt,
    val nmBlockNr: CUInt,
    val nmFrameSize: CUInt,
    val nmFrameNr: CUInt,
)

public data class NlMmapHdr(
    val nmStatus: CUInt,
    val nmLen: CUInt,
    val nmGroup: UInt,
    val nmPid: UInt,
    val nmUid: UInt,
    val nmGid: UInt,
)

public data class Nlattr(
    val nlaLen: UShort,
    val nlaType: UShort,
)

public const val NETLINK_ROUTE: CInt = 0
public const val NETLINK_UNUSED: CInt = 1
public const val NETLINK_USERSOCK: CInt = 2
public const val NETLINK_FIREWALL: CInt = 3
public const val NETLINK_SOCK_DIAG: CInt = 4
public const val NETLINK_NFLOG: CInt = 5
public const val NETLINK_XFRM: CInt = 6
public const val NETLINK_SELINUX: CInt = 7
public const val NETLINK_ISCSI: CInt = 8
public const val NETLINK_AUDIT: CInt = 9
public const val NETLINK_FIB_LOOKUP: CInt = 10
public const val NETLINK_CONNECTOR: CInt = 11
public const val NETLINK_NETFILTER: CInt = 12
public const val NETLINK_IP6_FW: CInt = 13
public const val NETLINK_DNRTMSG: CInt = 14
public const val NETLINK_KOBJECT_UEVENT: CInt = 15
public const val NETLINK_GENERIC: CInt = 16
public const val NETLINK_SCSITRANSPORT: CInt = 18
public const val NETLINK_ECRYPTFS: CInt = 19
public const val NETLINK_RDMA: CInt = 20
public const val NETLINK_CRYPTO: CInt = 21
public const val NETLINK_INET_DIAG: CInt = NETLINK_SOCK_DIAG
public const val MAX_LINKS: CInt = 32
public const val NLM_F_REQUEST: CInt = 1
public const val NLM_F_MULTI: CInt = 2
public const val NLM_F_ACK: CInt = 4
public const val NLM_F_ECHO: CInt = 8
public const val NLM_F_DUMP_INTR: CInt = 16
public const val NLM_F_DUMP_FILTERED: CInt = 32
public const val NLM_F_ROOT: CInt = 0x100
public const val NLM_F_MATCH: CInt = 0x200
public const val NLM_F_ATOMIC: CInt = 0x400
public val NLM_F_DUMP: CInt = NLM_F_ROOT or NLM_F_MATCH
public const val NLM_F_REPLACE: CInt = 0x100
public const val NLM_F_EXCL: CInt = 0x200
public const val NLM_F_CREATE: CInt = 0x400
public const val NLM_F_APPEND: CInt = 0x800
public const val NLM_F_NONREC: CInt = 0x100
public const val NLM_F_CAPPED: CInt = 0x100
public const val NLM_F_ACK_TLVS: CInt = 0x200
public const val NLMSG_NOOP: CInt = 0x1
public const val NLMSG_ERROR: CInt = 0x2
public const val NLMSG_DONE: CInt = 0x3
public const val NLMSG_OVERRUN: CInt = 0x4
public const val NLMSG_MIN_TYPE: CInt = 0x10
public const val NETLINK_ADD_MEMBERSHIP: CInt = 1
public const val NETLINK_DROP_MEMBERSHIP: CInt = 2
public const val NETLINK_PKTINFO: CInt = 3
public const val NETLINK_BROADCAST_ERROR: CInt = 4
public const val NETLINK_NO_ENOBUFS: CInt = 5
public const val NETLINK_RX_RING: CInt = 6
public const val NETLINK_TX_RING: CInt = 7
public const val NETLINK_LISTEN_ALL_NSID: CInt = 8
public const val NETLINK_LIST_MEMBERSHIPS: CInt = 9
public const val NETLINK_CAP_ACK: CInt = 10
public const val NETLINK_EXT_ACK: CInt = 11
public const val NETLINK_GET_STRICT_CHK: CInt = 12
public val NLA_F_NESTED: CInt = 1 shl 15
public val NLA_F_NET_BYTEORDER: CInt = 1 shl 14
public val NLA_TYPE_MASK: CInt = (NLA_F_NESTED or NLA_F_NET_BYTEORDER).inv()
public const val NLA_ALIGNTO: CInt = 4

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public fun nLAALIGN(len: CInt): CInt = -1
