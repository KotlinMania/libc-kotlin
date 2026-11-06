// port-lint: source new/linux_uapi/linux/netlink.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.SaFamilyT

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

public open class SockaddrNl(
    public var nlFamily: SaFamilyT,
    public var nlPad: CUshort,
    public var nlPid: UInt,
    public var nlGroups: UInt,
)

public open class Nlmsghdr(
    public var nlmsgLen: UInt,
    public var nlmsgType: UShort,
    public var nlmsgFlags: UShort,
    public var nlmsgSeq: UInt,
    public var nlmsgPid: UInt,
)

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

public open class Nlmsgerr(public var error: CInt, public var msg: Nlmsghdr)

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

public open class NlPktinfo(public var group: UInt)

public open class NlMmapReq(
    public var nmBlockSize: CUint,
    public var nmBlockNr: CUint,
    public var nmFrameSize: CUint,
    public var nmFrameNr: CUint,
)

public open class NlMmapHdr(
    public var nmStatus: CUint,
    public var nmLen: CUint,
    public var nmGroup: UInt,
    public var nmPid: UInt,
    public var nmUid: UInt,
    public var nmGid: UInt,
)

public open class Nlattr(public var nlaLen: UShort, public var nlaType: UShort)

public val NLA_F_NESTED: CInt = 1 shl 15

public val NLA_F_NET_BYTEORDER: CInt = 1 shl 14

public val NLA_TYPE_MASK: CInt = (NLA_F_NESTED or NLA_F_NET_BYTEORDER).inv()

public val NLA_ALIGNTO: CInt = 4

public fun nlaAlign(len: CInt): CInt {
    return ((len) + NLA_ALIGNTO - 1) and (NLA_ALIGNTO - 1).inv()
}
