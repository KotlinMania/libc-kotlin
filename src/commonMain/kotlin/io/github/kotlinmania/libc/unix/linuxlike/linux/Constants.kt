package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.unix.INT_MAX
import io.github.kotlinmania.libc.unix.INT_MIN
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.O_NONBLOCK

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.ENODATA
import io.github.kotlinmania.libc.unix.linuxlike.IPC_STAT
import io.github.kotlinmania.libc.unix.linuxlike.MSG_FIN
import io.github.kotlinmania.libc.unix.linuxlike.NLMSG_MIN_TYPE
import io.github.kotlinmania.libc.unix.linuxlike.O_CLOEXEC
import io.github.kotlinmania.libc.unix.linuxlike.O_EXCL
import io.github.kotlinmania.libc.unix.linuxlike.ioRequest
import io.github.kotlinmania.libc.unix.linuxlike.ioctlCode

public const val NLMSG_OVERRUN: Int = 0x4

public const val PIDTYPE_PID: UInt = 0u

public const val PIDTYPE_TGID: UInt = 1u

public const val PIDTYPE_PGID: UInt = 2u

public const val PIDTYPE_SID: UInt = 3u

public const val PIDTYPE_MAX: UInt = 4u

public const val PROC_CN_MCAST_LISTEN: UInt = 1u

public const val PROC_CN_MCAST_IGNORE: UInt = 2u

public const val PROC_EVENT_NONE: UInt = 0x00000000u

public const val PROC_EVENT_FORK: UInt = 0x00000001u

public const val PROC_EVENT_EXEC: UInt = 0x00000002u

public const val PROC_EVENT_UID: UInt = 0x00000004u

public const val PROC_EVENT_GID: UInt = 0x00000040u

public const val PROC_EVENT_SID: UInt = 0x00000080u

public const val PROC_EVENT_PTRACE: UInt = 0x00000100u

public const val PROC_EVENT_COMM: UInt = 0x00000200u

public const val PROC_EVENT_NONZERO_EXIT: UInt = 0x20000000u

public const val PROC_EVENT_COREDUMP: UInt = 0x40000000u

public const val PROC_EVENT_EXIT: UInt = 0x80000000u

public const val POSIX_SPAWN_USEVFORK: Int = 64

public const val POSIX_SPAWN_SETSID: Int = 128

public const val F_SEAL_FUTURE_WRITE: Int = 0x0010

public const val F_SEAL_EXEC: Int = 0x0020

public const val IFF_LOWER_UP: Int = 0x10000

public const val IFF_DORMANT: Int = 0x20000

public const val IFF_ECHO: Int = 0x40000

public const val AT_EXECVE_CHECK: Int = 0x10000

public val IFA_UNSPEC: UShort = (0).toUShort()

public val IFA_ADDRESS: UShort = (1).toUShort()

public val IFA_LOCAL: UShort = (2).toUShort()

public val IFA_LABEL: UShort = (3).toUShort()

public val IFA_BROADCAST: UShort = (4).toUShort()

public val IFA_ANYCAST: UShort = (5).toUShort()

public val IFA_CACHEINFO: UShort = (6).toUShort()

public val IFA_MULTICAST: UShort = (7).toUShort()

public val IFA_FLAGS: UShort = (8).toUShort()

public const val IFA_F_SECONDARY: UInt = 0x01u

public const val IFA_F_TEMPORARY: UInt = 0x01u

public const val IFA_F_NODAD: UInt = 0x02u

public const val IFA_F_OPTIMISTIC: UInt = 0x04u

public const val IFA_F_DADFAILED: UInt = 0x08u

public const val IFA_F_HOMEADDRESS: UInt = 0x10u

public const val IFA_F_DEPRECATED: UInt = 0x20u

public const val IFA_F_TENTATIVE: UInt = 0x40u

public const val IFA_F_PERMANENT: UInt = 0x80u

public const val IFA_F_MANAGETEMPADDR: UInt = 0x100u

public const val IFA_F_NOPREFIXROUTE: UInt = 0x200u

public const val IFA_F_MCAUTOJOIN: UInt = 0x400u

public const val IFA_F_STABLE_PRIVACY: UInt = 0x800u

public const val RWF_HIPRI: Int = 0x00000001

public const val RWF_DSYNC: Int = 0x00000002

public const val RWF_SYNC: Int = 0x00000004

public const val RWF_NOWAIT: Int = 0x00000008

public const val RWF_APPEND: Int = 0x00000010

public const val RWF_NOAPPEND: Int = 0x00000020

public const val RWF_ATOMIC: Int = 0x00000040

public const val RWF_DONTCACHE: Int = 0x00000080

public val IFLA_UNSPEC: UShort = (0).toUShort()

public val IFLA_ADDRESS: UShort = (1).toUShort()

public val IFLA_BROADCAST: UShort = (2).toUShort()

public val IFLA_IFNAME: UShort = (3).toUShort()

public val IFLA_MTU: UShort = (4).toUShort()

public val IFLA_LINK: UShort = (5).toUShort()

public val IFLA_QDISC: UShort = (6).toUShort()

public val IFLA_STATS: UShort = (7).toUShort()

public val IFLA_COST: UShort = (8).toUShort()

public val IFLA_PRIORITY: UShort = (9).toUShort()

public val IFLA_MASTER: UShort = (10).toUShort()

public val IFLA_WIRELESS: UShort = (11).toUShort()

public val IFLA_PROTINFO: UShort = (12).toUShort()

public val IFLA_TXQLEN: UShort = (13).toUShort()

public val IFLA_MAP: UShort = (14).toUShort()

public val IFLA_WEIGHT: UShort = (15).toUShort()

public val IFLA_OPERSTATE: UShort = (16).toUShort()

public val IFLA_LINKMODE: UShort = (17).toUShort()

public val IFLA_LINKINFO: UShort = (18).toUShort()

public val IFLA_NET_NS_PID: UShort = (19).toUShort()

public val IFLA_IFALIAS: UShort = (20).toUShort()

public val IFLA_NUM_VF: UShort = (21).toUShort()

public val IFLA_VFINFO_LIST: UShort = (22).toUShort()

public val IFLA_STATS64: UShort = (23).toUShort()

public val IFLA_VF_PORTS: UShort = (24).toUShort()

public val IFLA_PORT_SELF: UShort = (25).toUShort()

public val IFLA_AF_SPEC: UShort = (26).toUShort()

public val IFLA_GROUP: UShort = (27).toUShort()

public val IFLA_NET_NS_FD: UShort = (28).toUShort()

public val IFLA_EXT_MASK: UShort = (29).toUShort()

public val IFLA_PROMISCUITY: UShort = (30).toUShort()

public val IFLA_NUM_TX_QUEUES: UShort = (31).toUShort()

public val IFLA_NUM_RX_QUEUES: UShort = (32).toUShort()

public val IFLA_CARRIER: UShort = (33).toUShort()

public val IFLA_PHYS_PORT_ID: UShort = (34).toUShort()

public val IFLA_CARRIER_CHANGES: UShort = (35).toUShort()

public val IFLA_PHYS_SWITCH_ID: UShort = (36).toUShort()

public val IFLA_LINK_NETNSID: UShort = (37).toUShort()

public val IFLA_PHYS_PORT_NAME: UShort = (38).toUShort()

public val IFLA_PROTO_DOWN: UShort = (39).toUShort()

public val IFLA_GSO_MAX_SEGS: UShort = (40).toUShort()

public val IFLA_GSO_MAX_SIZE: UShort = (41).toUShort()

public val IFLA_PAD: UShort = (42).toUShort()

public val IFLA_XDP: UShort = (43).toUShort()

public val IFLA_EVENT: UShort = (44).toUShort()

public val IFLA_NEW_NETNSID: UShort = (45).toUShort()

public val IFLA_IF_NETNSID: UShort = (46).toUShort()

public val IFLA_TARGET_NETNSID: UShort = IFLA_IF_NETNSID

public val IFLA_CARRIER_UP_COUNT: UShort = (47).toUShort()

public val IFLA_CARRIER_DOWN_COUNT: UShort = (48).toUShort()

public val IFLA_NEW_IFINDEX: UShort = (49).toUShort()

public val IFLA_MIN_MTU: UShort = (50).toUShort()

public val IFLA_MAX_MTU: UShort = (51).toUShort()

public val IFLA_PROP_LIST: UShort = (52).toUShort()

public val IFLA_ALT_IFNAME: UShort = (53).toUShort()

public val IFLA_PERM_ADDRESS: UShort = (54).toUShort()

public val IFLA_PROTO_DOWN_REASON: UShort = (55).toUShort()

public val IFLA_PARENT_DEV_NAME: UShort = (56).toUShort()

public val IFLA_PARENT_DEV_BUS_NAME: UShort = (57).toUShort()

public val IFLA_GRO_MAX_SIZE: UShort = (58).toUShort()

public val IFLA_TSO_MAX_SIZE: UShort = (59).toUShort()

public val IFLA_TSO_MAX_SEGS: UShort = (60).toUShort()

public val IFLA_ALLMULTI: UShort = (61).toUShort()

public val IFLA_INFO_UNSPEC: UShort = (0).toUShort()

public val IFLA_INFO_KIND: UShort = (1).toUShort()

public val IFLA_INFO_DATA: UShort = (2).toUShort()

public val IFLA_INFO_XSTATS: UShort = (3).toUShort()

public val IFLA_INFO_SLAVE_KIND: UShort = (4).toUShort()

public val IFLA_INFO_SLAVE_DATA: UShort = (5).toUShort()

public const val SEEK_DATA: Int = 3

public const val SEEK_HOLE: Int = 4

public const val MPOL_DEFAULT: Int = 0

public const val MPOL_PREFERRED: Int = 1

public const val MPOL_BIND: Int = 2

public const val MPOL_INTERLEAVE: Int = 3

public const val MPOL_LOCAL: Int = 4

public val MPOL_F_NUMA_BALANCING: Int = 1 shl 13

public val MPOL_F_RELATIVE_NODES: Int = 1 shl 14

public val MPOL_F_STATIC_NODES: Int = 1 shl 15

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = crate::pthread_mutex_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = crate::pthread_cond_t { size: [0 (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = crate::pthread_rwlock_t { size: [0 (initializer represented at the FFI boundary)
public const val RENAME_NOREPLACE: UInt = 1u

public const val RENAME_EXCHANGE: UInt = 2u

public const val RENAME_WHITEOUT: UInt = 4u

public val MSG_STAT: Int = 11 or (IPC_STAT and 0x100)

public const val MSG_INFO: Int = 12

public const val MSG_NOTIFICATION: Int = 0x8000

public const val MSG_NOERROR: Int = 4096

public const val MSG_EXCEPT: Int = 8192

public const val MSG_ZEROCOPY: Int = 0x4000000

public const val SEM_UNDO: Int = 0x1000

public const val GETPID: Int = 11

public const val GETVAL: Int = 12

public const val GETALL: Int = 13

public const val GETNCNT: Int = 14

public const val GETZCNT: Int = 15

public const val SETVAL: Int = 16

public const val SETALL: Int = 17

public val SEM_STAT: Int = 18 or (IPC_STAT and 0x100)

public const val SEM_INFO: Int = 19

public val SEM_STAT_ANY: Int = 20 or (IPC_STAT and 0x100)

public const val QFMT_VFS_OLD: Int = 1

public const val QFMT_VFS_V0: Int = 2

public const val QFMT_VFS_V1: Int = 4

public const val EFD_SEMAPHORE: Int = 0x1

public val RB_AUTOBOOT: Int = 0x01234567.toInt()

public val RB_HALT_SYSTEM: Int = 0xcdef0123.toInt()

public val RB_ENABLE_CAD: Int = 0x89abcdef.toInt()

public val RB_DISABLE_CAD: Int = 0x00000000.toInt()

public val RB_POWER_OFF: Int = 0x4321fedc.toInt()

public val RB_SW_SUSPEND: Int = 0xd000fce2.toInt()

public val RB_KEXEC: Int = 0x45584543.toInt()

public const val SYNC_FILE_RANGE_WAIT_BEFORE: UInt = 1u

public const val SYNC_FILE_RANGE_WRITE: UInt = 2u

public const val SYNC_FILE_RANGE_WAIT_AFTER: UInt = 4u

public const val MREMAP_MAYMOVE: Int = 1

public const val MREMAP_FIXED: Int = 2

public const val MREMAP_DONTUNMAP: Int = 4

internal const val NSIO: UInt = 0xb7u

public val NS_GET_USERNS: Int = ioRequest(NSIO, 0x1u)

public val NS_GET_PARENT: Int = ioRequest(NSIO, 0x2u)

public val NS_GET_NSTYPE: Int = ioRequest(NSIO, 0x3u)

public val NS_GET_OWNER_UID: Int = ioRequest(NSIO, 0x4u)

// NS_GET_MNTNS_ID = _IOR(NSIO, 0x5, __u64) (ioctl request code; computed at the FFI boundary)
public val NS_GET_PID_FROM_PIDNS: Int = ioctlCode<Int>(NSIO, 0x6u)

public val NS_GET_TGID_FROM_PIDNS: Int = ioctlCode<Int>(NSIO, 0x7u)

public val NS_GET_PID_IN_PIDNS: Int = ioctlCode<Int>(NSIO, 0x8u)

public val NS_GET_TGID_IN_PIDNS: Int = ioctlCode<Int>(NSIO, 0x9u)

public const val MNT_NS_INFO_SIZE_VER0: Int = 16

// Upstream struct not yet ported: mnt_ns_info
// public val NS_MNT_GET_INFO: Ioctl = ioctlCode<mnt_ns_info>(NSIO, 10u)
// Upstream struct not yet ported: mnt_ns_info
// public val NS_MNT_GET_NEXT: Ioctl = ioctlCode<mnt_ns_info>(NSIO, 11u)
// Upstream struct not yet ported: mnt_ns_info
// public val NS_MNT_GET_PREV: Ioctl = ioctlCode<mnt_ns_info>(NSIO, 12u)
public val PIDFD_NONBLOCK: UInt = O_NONBLOCK.toUInt()

public val PIDFD_THREAD: UInt = O_EXCL.toUInt()

public val PIDFD_SIGNAL_THREAD: UInt = 1u shl 0

public val PIDFD_SIGNAL_THREAD_GROUP: UInt = 1u shl 1

public val PIDFD_SIGNAL_PROCESS_GROUP: UInt = 1u shl 2

public val PIDFD_INFO_PID: UInt = 1u shl 0

public val PIDFD_INFO_CREDS: UInt = 1u shl 1

public val PIDFD_INFO_CGROUPID: UInt = 1u shl 2

public val PIDFD_INFO_EXIT: UInt = 1u shl 3

public const val PIDFD_INFO_SIZE_VER0: UInt = 64u

internal const val PIDFS_IOCTL_MAGIC: UInt = 0xFFu

public val PIDFD_GET_CGROUP_NAMESPACE: Int = ioRequest(PIDFS_IOCTL_MAGIC, 1u)

public val PIDFD_GET_IPC_NAMESPACE: Int = ioRequest(PIDFS_IOCTL_MAGIC, 2u)

public val PIDFD_GET_MNT_NAMESPACE: Int = ioRequest(PIDFS_IOCTL_MAGIC, 3u)

public val PIDFD_GET_NET_NAMESPACE: Int = ioRequest(PIDFS_IOCTL_MAGIC, 4u)

public val PIDFD_GET_PID_NAMESPACE: Int = ioRequest(PIDFS_IOCTL_MAGIC, 5u)

public val PIDFD_GET_PID_FOR_CHILDREN_NAMESPACE: Int = ioRequest(PIDFS_IOCTL_MAGIC, 6u)

public val PIDFD_GET_TIME_NAMESPACE: Int = ioRequest(PIDFS_IOCTL_MAGIC, 7u)

public val PIDFD_GET_TIME_FOR_CHILDREN_NAMESPACE: Int = ioRequest(PIDFS_IOCTL_MAGIC, 8u)

public val PIDFD_GET_USER_NAMESPACE: Int = ioRequest(PIDFS_IOCTL_MAGIC, 9u)

public val PIDFD_GET_UTS_NAMESPACE: Int = ioRequest(PIDFS_IOCTL_MAGIC, 10u)

// Upstream struct not yet ported: pidfd_info
// public val PIDFD_GET_INFO: Ioctl = ioctlCode<pidfd_info>(PIDFS_IOCTL_MAGIC, 11u)
public const val PR_SET_MDWE: Int = 65

public const val PR_GET_MDWE: Int = 66

public val PR_MDWE_REFUSE_EXEC_GAIN: UInt = 1u shl 0

public val PR_MDWE_NO_INHERIT: UInt = 1u shl 1

public const val GRND_NONBLOCK: UInt = 0x0001u

public const val GRND_RANDOM: UInt = 0x0002u

public const val GRND_INSECURE: UInt = 0x0004u

public const val SECCOMP_MODE_DISABLED: UInt = 0u

public const val SECCOMP_MODE_STRICT: UInt = 1u

public const val SECCOMP_MODE_FILTER: UInt = 2u

public const val SECCOMP_SET_MODE_STRICT: UInt = 0u

public const val SECCOMP_SET_MODE_FILTER: UInt = 1u

public const val SECCOMP_GET_ACTION_AVAIL: UInt = 2u

public const val SECCOMP_GET_NOTIF_SIZES: UInt = 3u

public val SECCOMP_FILTER_FLAG_TSYNC: ULong = 1uL shl 0

public val SECCOMP_FILTER_FLAG_LOG: ULong = 1uL shl 1

public val SECCOMP_FILTER_FLAG_SPEC_ALLOW: ULong = 1uL shl 2

public val SECCOMP_FILTER_FLAG_NEW_LISTENER: ULong = 1uL shl 3

public val SECCOMP_FILTER_FLAG_TSYNC_ESRCH: ULong = 1uL shl 4

public val SECCOMP_FILTER_FLAG_WAIT_KILLABLE_RECV: ULong = 1uL shl 5

public const val SECCOMP_RET_KILL_PROCESS: UInt = 0x80000000u

public const val SECCOMP_RET_KILL_THREAD: UInt = 0x00000000u

public const val SECCOMP_RET_KILL: UInt = SECCOMP_RET_KILL_THREAD

public const val SECCOMP_RET_TRAP: UInt = 0x00030000u

public const val SECCOMP_RET_ERRNO: UInt = 0x00050000u

public const val SECCOMP_RET_USER_NOTIF: UInt = 0x7fc00000u

public const val SECCOMP_RET_TRACE: UInt = 0x7ff00000u

public const val SECCOMP_RET_LOG: UInt = 0x7ffc0000u

public const val SECCOMP_RET_ALLOW: UInt = 0x7fff0000u

public const val SECCOMP_RET_ACTION_FULL: UInt = 0xffff0000u

public const val SECCOMP_RET_ACTION: UInt = 0x7fff0000u

public const val SECCOMP_RET_DATA: UInt = 0x0000ffffu

public const val SECCOMP_USER_NOTIF_FLAG_CONTINUE: ULong = 1uL

public const val SECCOMP_ADDFD_FLAG_SETFD: ULong = 1uL

public const val SECCOMP_ADDFD_FLAG_SEND: ULong = 2uL

public const val TFD_CLOEXEC: Int = O_CLOEXEC

public const val TFD_NONBLOCK: Int = O_NONBLOCK

public const val TFD_TIMER_ABSTIME: Int = 1

public const val TFD_TIMER_CANCEL_ON_SET: Int = 2

public const val FALLOC_FL_KEEP_SIZE: Int = 0x01

public const val FALLOC_FL_PUNCH_HOLE: Int = 0x02

public const val FALLOC_FL_COLLAPSE_RANGE: Int = 0x08

public const val FALLOC_FL_ZERO_RANGE: Int = 0x10

public const val FALLOC_FL_INSERT_RANGE: Int = 0x20

public const val FALLOC_FL_UNSHARE_RANGE: Int = 0x40

public const val ENOATTR: Int = ENODATA

public const val SO_ORIGINAL_DST: Int = 80

public const val IP_RECVFRAGSIZE: Int = 25

public const val IPV6_FLOWINFO: Int = 11

public const val IPV6_FLOWLABEL_MGR: Int = 32

public const val IPV6_FLOWINFO_SEND: Int = 33

public const val IPV6_RECVFRAGSIZE: Int = 77

public const val IPV6_FREEBIND: Int = 78

public const val IPV6_FLOWINFO_FLOWLABEL: Int = 0x000fffff

public const val IPV6_FLOWINFO_PRIORITY: Int = 0x0ff00000

public const val SK_MEMINFO_RMEM_ALLOC: Int = 0

public const val SK_MEMINFO_RCVBUF: Int = 1

public const val SK_MEMINFO_WMEM_ALLOC: Int = 2

public const val SK_MEMINFO_SNDBUF: Int = 3

public const val SK_MEMINFO_FWD_ALLOC: Int = 4

public const val SK_MEMINFO_WMEM_QUEUED: Int = 5

public const val SK_MEMINFO_OPTMEM: Int = 6

public const val SK_MEMINFO_BACKLOG: Int = 7

public const val SK_MEMINFO_DROPS: Int = 8

public val CLOSE_RANGE_UNSHARE: UInt = 1u shl 1

public val CLOSE_RANGE_CLOEXEC: UInt = 1u shl 2

public const val SKF_AD_OFF: Int = -0x1000

public const val SKF_AD_PROTOCOL: Int = 0

public const val SKF_AD_PKTTYPE: Int = 4

public const val SKF_AD_IFINDEX: Int = 8

public const val SKF_AD_NLATTR: Int = 12

public const val SKF_AD_NLATTR_NEST: Int = 16

public const val SKF_AD_MARK: Int = 20

public const val SKF_AD_QUEUE: Int = 24

public const val SKF_AD_HATYPE: Int = 28

public const val SKF_AD_RXHASH: Int = 32

public const val SKF_AD_CPU: Int = 36

public const val SKF_AD_ALU_XOR_X: Int = 40

public const val SKF_AD_VLAN_TAG: Int = 44

public const val SKF_AD_VLAN_TAG_PRESENT: Int = 48

public const val SKF_AD_PAY_OFFSET: Int = 52

public const val SKF_AD_RANDOM: Int = 56

public const val SKF_AD_VLAN_TPID: Int = 60

public const val SKF_AD_MAX: Int = 64

public const val SKF_NET_OFF: Int = -0x100000

public const val SKF_LL_OFF: Int = -0x200000

public const val BPF_NET_OFF: Int = SKF_NET_OFF

public const val BPF_LL_OFF: Int = SKF_LL_OFF

public const val BPF_MEMWORDS: Int = 16

public const val BPF_MAXINSNS: Int = 4096

public const val BPF_LD: UInt = 0x00u

public const val BPF_LDX: UInt = 0x01u

public const val BPF_ST: UInt = 0x02u

public const val BPF_STX: UInt = 0x03u

public const val BPF_ALU: UInt = 0x04u

public const val BPF_JMP: UInt = 0x05u

public const val BPF_RET: UInt = 0x06u

public const val BPF_MISC: UInt = 0x07u

public const val BPF_W: UInt = 0x00u

public const val BPF_H: UInt = 0x08u

public const val BPF_B: UInt = 0x10u

public const val BPF_IMM: UInt = 0x00u

public const val BPF_ABS: UInt = 0x20u

public const val BPF_IND: UInt = 0x40u

public const val BPF_MEM: UInt = 0x60u

public const val BPF_LEN: UInt = 0x80u

public const val BPF_MSH: UInt = 0xa0u

public const val BPF_ADD: UInt = 0x00u

public const val BPF_SUB: UInt = 0x10u

public const val BPF_MUL: UInt = 0x20u

public const val BPF_DIV: UInt = 0x30u

public const val BPF_OR: UInt = 0x40u

public const val BPF_AND: UInt = 0x50u

public const val BPF_LSH: UInt = 0x60u

public const val BPF_RSH: UInt = 0x70u

public const val BPF_NEG: UInt = 0x80u

public const val BPF_MOD: UInt = 0x90u

public const val BPF_XOR: UInt = 0xa0u

public const val BPF_JA: UInt = 0x00u

public const val BPF_JEQ: UInt = 0x10u

public const val BPF_JGT: UInt = 0x20u

public const val BPF_JGE: UInt = 0x30u

public const val BPF_JSET: UInt = 0x40u

public const val BPF_K: UInt = 0x00u

public const val BPF_X: UInt = 0x08u

public const val BPF_A: UInt = 0x10u

public const val BPF_TAX: UInt = 0x00u

public const val BPF_TXA: UInt = 0x80u

public const val RESOLVE_NO_XDEV: ULong = 0x01uL

public const val RESOLVE_NO_MAGICLINKS: ULong = 0x02uL

public const val RESOLVE_NO_SYMLINKS: ULong = 0x04uL

public const val RESOLVE_BENEATH: ULong = 0x08uL

public const val RESOLVE_IN_ROOT: ULong = 0x10uL

public const val RESOLVE_CACHED: ULong = 0x20uL

public const val ETH_ALEN: Int = 6

public const val ETH_HLEN: Int = 14

public const val ETH_ZLEN: Int = 60

public const val ETH_DATA_LEN: Int = 1500

public const val ETH_FRAME_LEN: Int = 1514

public const val ETH_FCS_LEN: Int = 4

public const val ETH_P_LOOP: Int = 0x0060

public const val ETH_P_PUP: Int = 0x0200

public const val ETH_P_PUPAT: Int = 0x0201

public const val ETH_P_IP: Int = 0x0800

public const val ETH_P_X25: Int = 0x0805

public const val ETH_P_ARP: Int = 0x0806

public const val ETH_P_BPQ: Int = 0x08FF

public const val ETH_P_IEEEPUP: Int = 0x0a00

public const val ETH_P_IEEEPUPAT: Int = 0x0a01

public const val ETH_P_BATMAN: Int = 0x4305

public const val ETH_P_DEC: Int = 0x6000

public const val ETH_P_DNA_DL: Int = 0x6001

public const val ETH_P_DNA_RC: Int = 0x6002

public const val ETH_P_DNA_RT: Int = 0x6003

public const val ETH_P_LAT: Int = 0x6004

public const val ETH_P_DIAG: Int = 0x6005

public const val ETH_P_CUST: Int = 0x6006

public const val ETH_P_SCA: Int = 0x6007

public const val ETH_P_TEB: Int = 0x6558

public const val ETH_P_RARP: Int = 0x8035

public const val ETH_P_ATALK: Int = 0x809B

public const val ETH_P_AARP: Int = 0x80F3

public const val ETH_P_8021Q: Int = 0x8100

public const val ETH_P_IPX: Int = 0x8137

public const val ETH_P_IPV6: Int = 0x86DD

public const val ETH_P_PAUSE: Int = 0x8808

public const val ETH_P_SLOW: Int = 0x8809

public const val ETH_P_WCCP: Int = 0x883E

public const val ETH_P_MPLS_UC: Int = 0x8847

public const val ETH_P_MPLS_MC: Int = 0x8848

public const val ETH_P_ATMMPOA: Int = 0x884c

public const val ETH_P_PPP_DISC: Int = 0x8863

public const val ETH_P_PPP_SES: Int = 0x8864

public const val ETH_P_LINK_CTL: Int = 0x886c

public const val ETH_P_ATMFATE: Int = 0x8884

public const val ETH_P_PAE: Int = 0x888E

public const val ETH_P_AOE: Int = 0x88A2

public const val ETH_P_8021AD: Int = 0x88A8

public const val ETH_P_802_EX1: Int = 0x88B5

public const val ETH_P_TIPC: Int = 0x88CA

public const val ETH_P_MACSEC: Int = 0x88E5

public const val ETH_P_8021AH: Int = 0x88E7

public const val ETH_P_MVRP: Int = 0x88F5

public const val ETH_P_1588: Int = 0x88F7

public const val ETH_P_PRP: Int = 0x88FB

public const val ETH_P_FCOE: Int = 0x8906

public const val ETH_P_TDLS: Int = 0x890D

public const val ETH_P_FIP: Int = 0x8914

public const val ETH_P_80221: Int = 0x8917

public const val ETH_P_LOOPBACK: Int = 0x9000

public const val ETH_P_QINQ1: Int = 0x9100

public const val ETH_P_QINQ2: Int = 0x9200

public const val ETH_P_QINQ3: Int = 0x9300

public const val ETH_P_EDSA: Int = 0xDADA

public const val ETH_P_AF_IUCV: Int = 0xFBFB

public const val ETH_P_802_3_MIN: Int = 0x0600

public const val ETH_P_802_3: Int = 0x0001

public const val ETH_P_AX25: Int = 0x0002

public const val ETH_P_ALL: Int = 0x0003

public const val ETH_P_802_2: Int = 0x0004

public const val ETH_P_SNAP: Int = 0x0005

public const val ETH_P_DDCMP: Int = 0x0006

public const val ETH_P_WAN_PPP: Int = 0x0007

public const val ETH_P_PPP_MP: Int = 0x0008

public const val ETH_P_LOCALTALK: Int = 0x0009

public const val ETH_P_CANFD: Int = 0x000D

public const val ETH_P_PPPTALK: Int = 0x0010

public const val ETH_P_TR_802_2: Int = 0x0011

public const val ETH_P_MOBITEX: Int = 0x0015

public const val ETH_P_CONTROL: Int = 0x0016

public const val ETH_P_IRDA: Int = 0x0017

public const val ETH_P_ECONET: Int = 0x0018

public const val ETH_P_HDLC: Int = 0x0019

public const val ETH_P_ARCNET: Int = 0x001A

public const val ETH_P_DSA: Int = 0x001B

public const val ETH_P_TRAILER: Int = 0x001C

public const val ETH_P_PHONET: Int = 0x00F5

public const val ETH_P_IEEE802154: Int = 0x00F6

public const val ETH_P_CAIF: Int = 0x00F7

public const val POSIX_SPAWN_RESETIDS: Int = 0x01

public const val POSIX_SPAWN_SETPGROUP: Int = 0x02

public const val POSIX_SPAWN_SETSIGDEF: Int = 0x04

public const val POSIX_SPAWN_SETSIGMASK: Int = 0x08

public const val POSIX_SPAWN_SETSCHEDPARAM: Int = 0x10

public const val POSIX_SPAWN_SETSCHEDULER: Int = 0x20

public const val NFNLGRP_NONE: Int = 0

public const val NFNLGRP_CONNTRACK_NEW: Int = 1

public const val NFNLGRP_CONNTRACK_UPDATE: Int = 2

public const val NFNLGRP_CONNTRACK_DESTROY: Int = 3

public const val NFNLGRP_CONNTRACK_EXP_NEW: Int = 4

public const val NFNLGRP_CONNTRACK_EXP_UPDATE: Int = 5

public const val NFNLGRP_CONNTRACK_EXP_DESTROY: Int = 6

public const val NFNLGRP_NFTABLES: Int = 7

public const val NFNLGRP_ACCT_QUOTA: Int = 8

public const val NFNLGRP_NFTRACE: Int = 9

public const val NFNETLINK_V0: Int = 0

public const val NFNL_SUBSYS_NONE: Int = 0

public const val NFNL_SUBSYS_CTNETLINK: Int = 1

public const val NFNL_SUBSYS_CTNETLINK_EXP: Int = 2

public const val NFNL_SUBSYS_QUEUE: Int = 3

public const val NFNL_SUBSYS_ULOG: Int = 4

public const val NFNL_SUBSYS_OSF: Int = 5

public const val NFNL_SUBSYS_IPSET: Int = 6

public const val NFNL_SUBSYS_ACCT: Int = 7

public const val NFNL_SUBSYS_CTNETLINK_TIMEOUT: Int = 8

public const val NFNL_SUBSYS_CTHELPER: Int = 9

public const val NFNL_SUBSYS_NFTABLES: Int = 10

public const val NFNL_SUBSYS_NFT_COMPAT: Int = 11

public const val NFNL_SUBSYS_HOOK: Int = 12

public const val NFNL_SUBSYS_COUNT: Int = 13

public const val NFNL_MSG_BATCH_BEGIN: Int = NLMSG_MIN_TYPE

public val NFNL_MSG_BATCH_END: Int = NLMSG_MIN_TYPE + 1

public const val NFNL_BATCH_UNSPEC: Int = 0

public const val NFNL_BATCH_GENID: Int = 1

public const val NFULNL_MSG_PACKET: Int = 0

public const val NFULNL_MSG_CONFIG: Int = 1

public const val NFULA_VLAN_UNSPEC: Int = 0

public const val NFULA_VLAN_PROTO: Int = 1

public const val NFULA_VLAN_TCI: Int = 2

public const val NFULA_UNSPEC: Int = 0

public const val NFULA_PACKET_HDR: Int = 1

public const val NFULA_MARK: Int = 2

public const val NFULA_TIMESTAMP: Int = 3

public const val NFULA_IFINDEX_INDEV: Int = 4

public const val NFULA_IFINDEX_OUTDEV: Int = 5

public const val NFULA_IFINDEX_PHYSINDEV: Int = 6

public const val NFULA_IFINDEX_PHYSOUTDEV: Int = 7

public const val NFULA_HWADDR: Int = 8

public const val NFULA_PAYLOAD: Int = 9

public const val NFULA_PREFIX: Int = 10

public const val NFULA_UID: Int = 11

public const val NFULA_SEQ: Int = 12

public const val NFULA_SEQ_GLOBAL: Int = 13

public const val NFULA_GID: Int = 14

public const val NFULA_HWTYPE: Int = 15

public const val NFULA_HWHEADER: Int = 16

public const val NFULA_HWLEN: Int = 17

public const val NFULA_CT: Int = 18

public const val NFULA_CT_INFO: Int = 19

public const val NFULA_VLAN: Int = 20

public const val NFULA_L2HDR: Int = 21

public const val NFULNL_CFG_CMD_NONE: Int = 0

public const val NFULNL_CFG_CMD_BIND: Int = 1

public const val NFULNL_CFG_CMD_UNBIND: Int = 2

public const val NFULNL_CFG_CMD_PF_BIND: Int = 3

public const val NFULNL_CFG_CMD_PF_UNBIND: Int = 4

public const val NFULA_CFG_UNSPEC: Int = 0

public const val NFULA_CFG_CMD: Int = 1

public const val NFULA_CFG_MODE: Int = 2

public const val NFULA_CFG_NLBUFSIZ: Int = 3

public const val NFULA_CFG_TIMEOUT: Int = 4

public const val NFULA_CFG_QTHRESH: Int = 5

public const val NFULA_CFG_FLAGS: Int = 6

public const val NFULNL_COPY_NONE: Int = 0x00

public const val NFULNL_COPY_META: Int = 0x01

public const val NFULNL_COPY_PACKET: Int = 0x02

public const val NFULNL_CFG_F_SEQ: Int = 0x0001

public const val NFULNL_CFG_F_SEQ_GLOBAL: Int = 0x0002

public const val NFULNL_CFG_F_CONNTRACK: Int = 0x0004

public const val NFQNL_MSG_PACKET: Int = 0

public const val NFQNL_MSG_VERDICT: Int = 1

public const val NFQNL_MSG_CONFIG: Int = 2

public const val NFQNL_MSG_VERDICT_BATCH: Int = 3

public const val NFQA_UNSPEC: Int = 0

public const val NFQA_PACKET_HDR: Int = 1

public const val NFQA_VERDICT_HDR: Int = 2

public const val NFQA_MARK: Int = 3

public const val NFQA_TIMESTAMP: Int = 4

public const val NFQA_IFINDEX_INDEV: Int = 5

public const val NFQA_IFINDEX_OUTDEV: Int = 6

public const val NFQA_IFINDEX_PHYSINDEV: Int = 7

public const val NFQA_IFINDEX_PHYSOUTDEV: Int = 8

public const val NFQA_HWADDR: Int = 9

public const val NFQA_PAYLOAD: Int = 10

public const val NFQA_CT: Int = 11

public const val NFQA_CT_INFO: Int = 12

public const val NFQA_CAP_LEN: Int = 13

public const val NFQA_SKB_INFO: Int = 14

public const val NFQA_EXP: Int = 15

public const val NFQA_UID: Int = 16

public const val NFQA_GID: Int = 17

public const val NFQA_SECCTX: Int = 18

public const val NFQA_VLAN: Int = 19

public const val NFQA_L2HDR: Int = 20

public const val NFQA_PRIORITY: Int = 21

public const val NFQA_VLAN_UNSPEC: Int = 0

public const val NFQA_VLAN_PROTO: Int = 1

public const val NFQA_VLAN_TCI: Int = 2

public const val NFQNL_CFG_CMD_NONE: Int = 0

public const val NFQNL_CFG_CMD_BIND: Int = 1

public const val NFQNL_CFG_CMD_UNBIND: Int = 2

public const val NFQNL_CFG_CMD_PF_BIND: Int = 3

public const val NFQNL_CFG_CMD_PF_UNBIND: Int = 4

public const val NFQNL_COPY_NONE: Int = 0

public const val NFQNL_COPY_META: Int = 1

public const val NFQNL_COPY_PACKET: Int = 2

public const val NFQA_CFG_UNSPEC: Int = 0

public const val NFQA_CFG_CMD: Int = 1

public const val NFQA_CFG_PARAMS: Int = 2

public const val NFQA_CFG_QUEUE_MAXLEN: Int = 3

public const val NFQA_CFG_MASK: Int = 4

public const val NFQA_CFG_FLAGS: Int = 5

public const val NFQA_CFG_F_FAIL_OPEN: Int = 0x0001

public const val NFQA_CFG_F_CONNTRACK: Int = 0x0002

public const val NFQA_CFG_F_GSO: Int = 0x0004

public const val NFQA_CFG_F_UID_GID: Int = 0x0008

public const val NFQA_CFG_F_SECCTX: Int = 0x0010

public const val NFQA_CFG_F_MAX: Int = 0x0020

public const val NFQA_SKB_CSUMNOTREADY: Int = 0x0001

public const val NFQA_SKB_GSO: Int = 0x0002

public const val NFQA_SKB_CSUM_NOTVERIFIED: Int = 0x0004

public const val GENL_NAMSIZ: Int = 16

public const val GENL_MIN_ID: Int = NLMSG_MIN_TYPE

public const val GENL_MAX_ID: Int = 1023

public const val GENL_ADMIN_PERM: Int = 0x01

public const val GENL_CMD_CAP_DO: Int = 0x02

public const val GENL_CMD_CAP_DUMP: Int = 0x04

public const val GENL_CMD_CAP_HASPOL: Int = 0x08

public const val GENL_ID_CTRL: Int = NLMSG_MIN_TYPE

public const val CTRL_CMD_UNSPEC: Int = 0

public const val CTRL_CMD_NEWFAMILY: Int = 1

public const val CTRL_CMD_DELFAMILY: Int = 2

public const val CTRL_CMD_GETFAMILY: Int = 3

public const val CTRL_CMD_NEWOPS: Int = 4

public const val CTRL_CMD_DELOPS: Int = 5

public const val CTRL_CMD_GETOPS: Int = 6

public const val CTRL_CMD_NEWMCAST_GRP: Int = 7

public const val CTRL_CMD_DELMCAST_GRP: Int = 8

public const val CTRL_CMD_GETMCAST_GRP: Int = 9

public const val CTRL_ATTR_UNSPEC: Int = 0

public const val CTRL_ATTR_FAMILY_ID: Int = 1

public const val CTRL_ATTR_FAMILY_NAME: Int = 2

public const val CTRL_ATTR_VERSION: Int = 3

public const val CTRL_ATTR_HDRSIZE: Int = 4

public const val CTRL_ATTR_MAXATTR: Int = 5

public const val CTRL_ATTR_OPS: Int = 6

public const val CTRL_ATTR_MCAST_GROUPS: Int = 7

public const val CTRL_ATTR_OP_UNSPEC: Int = 0

public const val CTRL_ATTR_OP_ID: Int = 1

public const val CTRL_ATTR_OP_FLAGS: Int = 2

public const val CTRL_ATTR_MCAST_GRP_UNSPEC: Int = 0

public const val CTRL_ATTR_MCAST_GRP_NAME: Int = 1

public const val CTRL_ATTR_MCAST_GRP_ID: Int = 2

public const val PACKET_FANOUT: Int = 18

public const val PACKET_TX_HAS_OFF: Int = 19

public const val PACKET_QDISC_BYPASS: Int = 20

public const val PACKET_ROLLOVER_STATS: Int = 21

public const val PACKET_FANOUT_DATA: Int = 22

public const val PACKET_IGNORE_OUTGOING: Int = 23

public const val PACKET_VNET_HDR_SZ: Int = 24

public const val PACKET_FANOUT_HASH: UInt = 0u

public const val PACKET_FANOUT_LB: UInt = 1u

public const val PACKET_FANOUT_CPU: UInt = 2u

public const val PACKET_FANOUT_ROLLOVER: UInt = 3u

public const val PACKET_FANOUT_RND: UInt = 4u

public const val PACKET_FANOUT_QM: UInt = 5u

public const val PACKET_FANOUT_CBPF: UInt = 6u

public const val PACKET_FANOUT_EBPF: UInt = 7u

public const val PACKET_FANOUT_FLAG_ROLLOVER: UInt = 0x1000u

public const val PACKET_FANOUT_FLAG_UNIQUEID: UInt = 0x2000u

public const val PACKET_FANOUT_FLAG_IGNORE_OUTGOING: UInt = 0x4000u

public const val PACKET_FANOUT_FLAG_DEFRAG: UInt = 0x8000u

public const val TP_STATUS_KERNEL: UInt = 0u

public val TP_STATUS_USER: UInt = 1u shl 0

public val TP_STATUS_COPY: UInt = 1u shl 1

public val TP_STATUS_LOSING: UInt = 1u shl 2

public val TP_STATUS_CSUMNOTREADY: UInt = 1u shl 3

public val TP_STATUS_VLAN_VALID: UInt = 1u shl 4

public val TP_STATUS_BLK_TMO: UInt = 1u shl 5

public val TP_STATUS_VLAN_TPID_VALID: UInt = 1u shl 6

public val TP_STATUS_CSUM_VALID: UInt = 1u shl 7

public const val TP_STATUS_AVAILABLE: UInt = 0u

public val TP_STATUS_SEND_REQUEST: UInt = 1u shl 0

public val TP_STATUS_SENDING: UInt = 1u shl 1

public val TP_STATUS_WRONG_FORMAT: UInt = 1u shl 2

public val TP_STATUS_TS_SOFTWARE: UInt = 1u shl 29

public val TP_STATUS_TS_SYS_HARDWARE: UInt = 1u shl 30

public val TP_STATUS_TS_RAW_HARDWARE: UInt = 1u shl 31

public const val TP_FT_REQ_FILL_RXHASH: UInt = 1u

public const val TPACKET_ALIGNMENT: ULong = 16uL

// TPACKET_HDRLEN = align(size_of<TpacketHdr>(), TPACKET_ALIGNMENT) + size_of<SockaddrLl>() (computed at the FFI boundary)
// TPACKET2_HDRLEN = align(size_of<Tpacket2Hdr>(), TPACKET_ALIGNMENT) + size_of<SockaddrLl>() (computed at the FFI boundary)
// TPACKET3_HDRLEN = align(size_of<Tpacket3Hdr>(), TPACKET_ALIGNMENT) + size_of<SockaddrLl>() (computed at the FFI boundary)
public const val NF_DROP: Int = 0

public const val NF_ACCEPT: Int = 1

public const val NF_STOLEN: Int = 2

public const val NF_QUEUE: Int = 3

public const val NF_REPEAT: Int = 4

public const val NF_STOP: Int = 5

public const val NF_MAX_VERDICT: Int = NF_STOP

public const val NF_VERDICT_MASK: Int = 0x000000ff

public const val NF_VERDICT_FLAG_QUEUE_BYPASS: Int = 0x00008000

public const val NF_VERDICT_QMASK: Int = 0xffff0000.toInt()

public const val NF_VERDICT_QBITS: Int = 16

public const val NF_VERDICT_BITS: Int = 16

public const val NF_INET_PRE_ROUTING: Int = 0

public const val NF_INET_LOCAL_IN: Int = 1

public const val NF_INET_FORWARD: Int = 2

public const val NF_INET_LOCAL_OUT: Int = 3

public const val NF_INET_POST_ROUTING: Int = 4

public const val NF_INET_NUMHOOKS: Int = 5

public const val NF_INET_INGRESS: Int = NF_INET_NUMHOOKS

public const val NF_NETDEV_INGRESS: Int = 0

public const val NF_NETDEV_EGRESS: Int = 1

public const val NF_NETDEV_NUMHOOKS: Int = 2

public const val NFPROTO_UNSPEC: Int = 0

public const val NFPROTO_INET: Int = 1

public const val NFPROTO_IPV4: Int = 2

public const val NFPROTO_ARP: Int = 3

public const val NFPROTO_NETDEV: Int = 5

public const val NFPROTO_BRIDGE: Int = 7

public const val NFPROTO_IPV6: Int = 10

public const val NFPROTO_DECNET: Int = 12

public const val NFPROTO_NUMPROTO: Int = 13

public const val NF_ARP: Int = 0

public const val NF_ARP_IN: Int = 0

public const val NF_ARP_OUT: Int = 1

public const val NF_ARP_FORWARD: Int = 2

public const val NF_ARP_NUMHOOKS: Int = 3

public const val NF_BR_PRE_ROUTING: Int = 0

public const val NF_BR_LOCAL_IN: Int = 1

public const val NF_BR_FORWARD: Int = 2

public const val NF_BR_LOCAL_OUT: Int = 3

public const val NF_BR_POST_ROUTING: Int = 4

public const val NF_BR_BROUTING: Int = 5

public const val NF_BR_NUMHOOKS: Int = 6

public const val NF_BR_PRI_FIRST: Int = INT_MIN

public const val NF_BR_PRI_NAT_DST_BRIDGED: Int = -300

public const val NF_BR_PRI_FILTER_BRIDGED: Int = -200

public const val NF_BR_PRI_BRNF: Int = 0

public const val NF_BR_PRI_NAT_DST_OTHER: Int = 100

public const val NF_BR_PRI_FILTER_OTHER: Int = 200

public const val NF_BR_PRI_NAT_SRC: Int = 300

public const val NF_BR_PRI_LAST: Int = INT_MAX

public const val NF_IP_PRE_ROUTING: Int = 0

public const val NF_IP_LOCAL_IN: Int = 1

public const val NF_IP_FORWARD: Int = 2

public const val NF_IP_LOCAL_OUT: Int = 3

public const val NF_IP_POST_ROUTING: Int = 4

public const val NF_IP_NUMHOOKS: Int = 5

public const val NF_IP_PRI_FIRST: Int = INT_MIN

public const val NF_IP_PRI_RAW_BEFORE_DEFRAG: Int = -450

public const val NF_IP_PRI_CONNTRACK_DEFRAG: Int = -400

public const val NF_IP_PRI_RAW: Int = -300

public const val NF_IP_PRI_SELINUX_FIRST: Int = -225

public const val NF_IP_PRI_CONNTRACK: Int = -200

public const val NF_IP_PRI_MANGLE: Int = -150

public const val NF_IP_PRI_NAT_DST: Int = -100

public const val NF_IP_PRI_FILTER: Int = 0

public const val NF_IP_PRI_SECURITY: Int = 50

public const val NF_IP_PRI_NAT_SRC: Int = 100

public const val NF_IP_PRI_SELINUX_LAST: Int = 225

public const val NF_IP_PRI_CONNTRACK_HELPER: Int = 300

public const val NF_IP_PRI_CONNTRACK_CONFIRM: Int = INT_MAX

public const val NF_IP_PRI_LAST: Int = INT_MAX

public const val NF_IP6_PRE_ROUTING: Int = 0

public const val NF_IP6_LOCAL_IN: Int = 1

public const val NF_IP6_FORWARD: Int = 2

public const val NF_IP6_LOCAL_OUT: Int = 3

public const val NF_IP6_POST_ROUTING: Int = 4

public const val NF_IP6_NUMHOOKS: Int = 5

public const val NF_IP6_PRI_FIRST: Int = INT_MIN

public const val NF_IP6_PRI_RAW_BEFORE_DEFRAG: Int = -450

public const val NF_IP6_PRI_CONNTRACK_DEFRAG: Int = -400

public const val NF_IP6_PRI_RAW: Int = -300

public const val NF_IP6_PRI_SELINUX_FIRST: Int = -225

public const val NF_IP6_PRI_CONNTRACK: Int = -200

public const val NF_IP6_PRI_MANGLE: Int = -150

public const val NF_IP6_PRI_NAT_DST: Int = -100

public const val NF_IP6_PRI_FILTER: Int = 0

public const val NF_IP6_PRI_SECURITY: Int = 50

public const val NF_IP6_PRI_NAT_SRC: Int = 100

public const val NF_IP6_PRI_SELINUX_LAST: Int = 225

public const val NF_IP6_PRI_CONNTRACK_HELPER: Int = 300

public const val NF_IP6_PRI_LAST: Int = INT_MAX

public const val IP6T_SO_ORIGINAL_DST: Int = 80

public const val SIOCSHWTSTAMP: ULong = 0x000089b0uL

public const val SIOCGHWTSTAMP: ULong = 0x000089b1uL

public const val WIRELESS_EXT: ULong = 0x16uL

public const val SIOCSIWCOMMIT: ULong = 0x8B00uL

public const val SIOCGIWNAME: ULong = 0x8B01uL

public const val SIOCSIWNWID: ULong = 0x8B02uL

public const val SIOCGIWNWID: ULong = 0x8B03uL

public const val SIOCSIWFREQ: ULong = 0x8B04uL

public const val SIOCGIWFREQ: ULong = 0x8B05uL

public const val SIOCSIWMODE: ULong = 0x8B06uL

public const val SIOCGIWMODE: ULong = 0x8B07uL

public const val SIOCSIWSENS: ULong = 0x8B08uL

public const val SIOCGIWSENS: ULong = 0x8B09uL

public const val SIOCSIWRANGE: ULong = 0x8B0AuL

public const val SIOCGIWRANGE: ULong = 0x8B0BuL

public const val SIOCSIWPRIV: ULong = 0x8B0CuL

public const val SIOCGIWPRIV: ULong = 0x8B0DuL

public const val SIOCSIWSTATS: ULong = 0x8B0EuL

public const val SIOCGIWSTATS: ULong = 0x8B0FuL

public const val SIOCSIWSPY: ULong = 0x8B10uL

public const val SIOCGIWSPY: ULong = 0x8B11uL

public const val SIOCSIWTHRSPY: ULong = 0x8B12uL

public const val SIOCGIWTHRSPY: ULong = 0x8B13uL

public const val SIOCSIWAP: ULong = 0x8B14uL

public const val SIOCGIWAP: ULong = 0x8B15uL

public const val SIOCGIWAPLIST: ULong = 0x8B17uL

public const val SIOCSIWSCAN: ULong = 0x8B18uL

public const val SIOCGIWSCAN: ULong = 0x8B19uL

public const val SIOCSIWESSID: ULong = 0x8B1AuL

public const val SIOCGIWESSID: ULong = 0x8B1BuL

public const val SIOCSIWNICKN: ULong = 0x8B1CuL

public const val SIOCGIWNICKN: ULong = 0x8B1DuL

public const val SIOCSIWRATE: ULong = 0x8B20uL

public const val SIOCGIWRATE: ULong = 0x8B21uL

public const val SIOCSIWRTS: ULong = 0x8B22uL

public const val SIOCGIWRTS: ULong = 0x8B23uL

public const val SIOCSIWFRAG: ULong = 0x8B24uL

public const val SIOCGIWFRAG: ULong = 0x8B25uL

public const val SIOCSIWTXPOW: ULong = 0x8B26uL

public const val SIOCGIWTXPOW: ULong = 0x8B27uL

public const val SIOCSIWRETRY: ULong = 0x8B28uL

public const val SIOCGIWRETRY: ULong = 0x8B29uL

public const val SIOCSIWENCODE: ULong = 0x8B2AuL

public const val SIOCGIWENCODE: ULong = 0x8B2BuL

public const val SIOCSIWPOWER: ULong = 0x8B2CuL

public const val SIOCGIWPOWER: ULong = 0x8B2DuL

public const val SIOCSIWGENIE: ULong = 0x8B30uL

public const val SIOCGIWGENIE: ULong = 0x8B31uL

public const val SIOCSIWMLME: ULong = 0x8B16uL

public const val SIOCSIWAUTH: ULong = 0x8B32uL

public const val SIOCGIWAUTH: ULong = 0x8B33uL

public const val SIOCSIWENCODEEXT: ULong = 0x8B34uL

public const val SIOCGIWENCODEEXT: ULong = 0x8B35uL

public const val SIOCSIWPMKSA: ULong = 0x8B36uL

public const val SIOCIWFIRSTPRIV: ULong = 0x8BE0uL

public const val SIOCIWLASTPRIV: ULong = 0x8BFFuL

public const val SIOCIWFIRST: ULong = 0x8B00uL

public const val SIOCIWLAST: ULong = SIOCIWLASTPRIV

public const val IWEVTXDROP: ULong = 0x8C00uL

public const val IWEVQUAL: ULong = 0x8C01uL

public const val IWEVCUSTOM: ULong = 0x8C02uL

public const val IWEVREGISTERED: ULong = 0x8C03uL

public const val IWEVEXPIRED: ULong = 0x8C04uL

public const val IWEVGENIE: ULong = 0x8C05uL

public const val IWEVMICHAELMICFAILURE: ULong = 0x8C06uL

public const val IWEVASSOCREQIE: ULong = 0x8C07uL

public const val IWEVASSOCRESPIE: ULong = 0x8C08uL

public const val IWEVPMKIDCAND: ULong = 0x8C09uL

public const val IWEVFIRST: ULong = 0x8C00uL

public const val IW_PRIV_TYPE_MASK: ULong = 0x7000uL

public const val IW_PRIV_TYPE_NONE: ULong = 0x0000uL

public const val IW_PRIV_TYPE_BYTE: ULong = 0x1000uL

public const val IW_PRIV_TYPE_CHAR: ULong = 0x2000uL

public const val IW_PRIV_TYPE_INT: ULong = 0x4000uL

public const val IW_PRIV_TYPE_FLOAT: ULong = 0x5000uL

public const val IW_PRIV_TYPE_ADDR: ULong = 0x6000uL

public const val IW_PRIV_SIZE_FIXED: ULong = 0x0800uL

public const val IW_PRIV_SIZE_MASK: ULong = 0x07FFuL

public const val IW_MAX_FREQUENCIES: ULong = 32uL

public const val IW_MAX_BITRATES: ULong = 32uL

public const val IW_MAX_TXPOWER: ULong = 8uL

public const val IW_MAX_SPY: ULong = 8uL

public const val IW_MAX_AP: ULong = 64uL

public const val IW_ESSID_MAX_SIZE: ULong = 32uL

public const val IW_MODE_AUTO: ULong = 0uL

public const val IW_MODE_ADHOC: ULong = 1uL

public const val IW_MODE_INFRA: ULong = 2uL

public const val IW_MODE_MASTER: ULong = 3uL

public const val IW_MODE_REPEAT: ULong = 4uL

public const val IW_MODE_SECOND: ULong = 5uL

public const val IW_MODE_MONITOR: ULong = 6uL

public const val IW_MODE_MESH: ULong = 7uL

public const val IW_QUAL_QUAL_UPDATED: ULong = 0x01uL

public const val IW_QUAL_LEVEL_UPDATED: ULong = 0x02uL

public const val IW_QUAL_NOISE_UPDATED: ULong = 0x04uL

public const val IW_QUAL_ALL_UPDATED: ULong = 0x07uL

public const val IW_QUAL_DBM: ULong = 0x08uL

public const val IW_QUAL_QUAL_INVALID: ULong = 0x10uL

public const val IW_QUAL_LEVEL_INVALID: ULong = 0x20uL

public const val IW_QUAL_NOISE_INVALID: ULong = 0x40uL

public const val IW_QUAL_RCPI: ULong = 0x80uL

public const val IW_QUAL_ALL_INVALID: ULong = 0x70uL

public const val IW_FREQ_AUTO: ULong = 0x00uL

public const val IW_FREQ_FIXED: ULong = 0x01uL

public const val IW_MAX_ENCODING_SIZES: ULong = 8uL

public const val IW_ENCODING_TOKEN_MAX: ULong = 64uL

public const val IW_ENCODE_INDEX: ULong = 0x00FFuL

public const val IW_ENCODE_FLAGS: ULong = 0xFF00uL

public const val IW_ENCODE_MODE: ULong = 0xF000uL

public const val IW_ENCODE_DISABLED: ULong = 0x8000uL

public const val IW_ENCODE_ENABLED: ULong = 0x0000uL

public const val IW_ENCODE_RESTRICTED: ULong = 0x4000uL

public const val IW_ENCODE_OPEN: ULong = 0x2000uL

public const val IW_ENCODE_NOKEY: ULong = 0x0800uL

public const val IW_ENCODE_TEMP: ULong = 0x0400uL

public const val IW_POWER_ON: ULong = 0x0000uL

public const val IW_POWER_TYPE: ULong = 0xF000uL

public const val IW_POWER_PERIOD: ULong = 0x1000uL

public const val IW_POWER_TIMEOUT: ULong = 0x2000uL

public const val IW_POWER_MODE: ULong = 0x0F00uL

public const val IW_POWER_UNICAST_R: ULong = 0x0100uL

public const val IW_POWER_MULTICAST_R: ULong = 0x0200uL

public const val IW_POWER_ALL_R: ULong = 0x0300uL

public const val IW_POWER_FORCE_S: ULong = 0x0400uL

public const val IW_POWER_REPEATER: ULong = 0x0800uL

public const val IW_POWER_MODIFIER: ULong = 0x000FuL

public const val IW_POWER_MIN: ULong = 0x0001uL

public const val IW_POWER_MAX: ULong = 0x0002uL

public const val IW_POWER_RELATIVE: ULong = 0x0004uL

public const val IW_TXPOW_TYPE: ULong = 0x00FFuL

public const val IW_TXPOW_DBM: ULong = 0x0000uL

public const val IW_TXPOW_MWATT: ULong = 0x0001uL

public const val IW_TXPOW_RELATIVE: ULong = 0x0002uL

public const val IW_TXPOW_RANGE: ULong = 0x1000uL

public const val IW_RETRY_ON: ULong = 0x0000uL

public const val IW_RETRY_TYPE: ULong = 0xF000uL

public const val IW_RETRY_LIMIT: ULong = 0x1000uL

public const val IW_RETRY_LIFETIME: ULong = 0x2000uL

public const val IW_RETRY_MODIFIER: ULong = 0x00FFuL

public const val IW_RETRY_MIN: ULong = 0x0001uL

public const val IW_RETRY_MAX: ULong = 0x0002uL

public const val IW_RETRY_RELATIVE: ULong = 0x0004uL

public const val IW_RETRY_SHORT: ULong = 0x0010uL

public const val IW_RETRY_LONG: ULong = 0x0020uL

public const val IW_SCAN_DEFAULT: ULong = 0x0000uL

public const val IW_SCAN_ALL_ESSID: ULong = 0x0001uL

public const val IW_SCAN_THIS_ESSID: ULong = 0x0002uL

public const val IW_SCAN_ALL_FREQ: ULong = 0x0004uL

public const val IW_SCAN_THIS_FREQ: ULong = 0x0008uL

public const val IW_SCAN_ALL_MODE: ULong = 0x0010uL

public const val IW_SCAN_THIS_MODE: ULong = 0x0020uL

public const val IW_SCAN_ALL_RATE: ULong = 0x0040uL

public const val IW_SCAN_THIS_RATE: ULong = 0x0080uL

public const val IW_SCAN_TYPE_ACTIVE: ULong = 0uL

public const val IW_SCAN_TYPE_PASSIVE: ULong = 1uL

public const val IW_SCAN_MAX_DATA: ULong = 4096uL

public const val IW_SCAN_CAPA_NONE: ULong = 0x00uL

public const val IW_SCAN_CAPA_ESSID: ULong = 0x01uL

public const val IW_SCAN_CAPA_BSSID: ULong = 0x02uL

public const val IW_SCAN_CAPA_CHANNEL: ULong = 0x04uL

public const val IW_SCAN_CAPA_MODE: ULong = 0x08uL

public const val IW_SCAN_CAPA_RATE: ULong = 0x10uL

public const val IW_SCAN_CAPA_TYPE: ULong = 0x20uL

public const val IW_SCAN_CAPA_TIME: ULong = 0x40uL

public const val IW_CUSTOM_MAX: ULong = 256uL

public const val IW_GENERIC_IE_MAX: ULong = 1024uL

public const val IW_MLME_DEAUTH: ULong = 0uL

public const val IW_MLME_DISASSOC: ULong = 1uL

public const val IW_MLME_AUTH: ULong = 2uL

public const val IW_MLME_ASSOC: ULong = 3uL

public const val IW_AUTH_INDEX: ULong = 0x0FFFuL

public const val IW_AUTH_FLAGS: ULong = 0xF000uL

public const val IW_AUTH_WPA_VERSION: ULong = 0uL

public const val IW_AUTH_CIPHER_PAIRWISE: ULong = 1uL

public const val IW_AUTH_CIPHER_GROUP: ULong = 2uL

public const val IW_AUTH_KEY_MGMT: ULong = 3uL

public const val IW_AUTH_TKIP_COUNTERMEASURES: ULong = 4uL

public const val IW_AUTH_DROP_UNENCRYPTED: ULong = 5uL

public const val IW_AUTH_80211_AUTH_ALG: ULong = 6uL

public const val IW_AUTH_WPA_ENABLED: ULong = 7uL

public const val IW_AUTH_RX_UNENCRYPTED_EAPOL: ULong = 8uL

public const val IW_AUTH_ROAMING_CONTROL: ULong = 9uL

public const val IW_AUTH_PRIVACY_INVOKED: ULong = 10uL

public const val IW_AUTH_CIPHER_GROUP_MGMT: ULong = 11uL

public const val IW_AUTH_MFP: ULong = 12uL

public const val IW_AUTH_WPA_VERSION_DISABLED: ULong = 0x00000001uL

public const val IW_AUTH_WPA_VERSION_WPA: ULong = 0x00000002uL

public const val IW_AUTH_WPA_VERSION_WPA2: ULong = 0x00000004uL

public const val IW_AUTH_CIPHER_NONE: ULong = 0x00000001uL

public const val IW_AUTH_CIPHER_WEP40: ULong = 0x00000002uL

public const val IW_AUTH_CIPHER_TKIP: ULong = 0x00000004uL

public const val IW_AUTH_CIPHER_CCMP: ULong = 0x00000008uL

public const val IW_AUTH_CIPHER_WEP104: ULong = 0x00000010uL

public const val IW_AUTH_CIPHER_AES_CMAC: ULong = 0x00000020uL

public const val IW_AUTH_KEY_MGMT_802_1X: ULong = 1uL

public const val IW_AUTH_KEY_MGMT_PSK: ULong = 2uL

public const val IW_AUTH_ALG_OPEN_SYSTEM: ULong = 0x00000001uL

public const val IW_AUTH_ALG_SHARED_KEY: ULong = 0x00000002uL

public const val IW_AUTH_ALG_LEAP: ULong = 0x00000004uL

public const val IW_AUTH_ROAMING_ENABLE: ULong = 0uL

public const val IW_AUTH_ROAMING_DISABLE: ULong = 1uL

public const val IW_AUTH_MFP_DISABLED: ULong = 0uL

public const val IW_AUTH_MFP_OPTIONAL: ULong = 1uL

public const val IW_AUTH_MFP_REQUIRED: ULong = 2uL

public const val IW_ENCODE_SEQ_MAX_SIZE: ULong = 8uL

public const val IW_ENCODE_ALG_NONE: ULong = 0uL

public const val IW_ENCODE_ALG_WEP: ULong = 1uL

public const val IW_ENCODE_ALG_TKIP: ULong = 2uL

public const val IW_ENCODE_ALG_CCMP: ULong = 3uL

public const val IW_ENCODE_ALG_PMK: ULong = 4uL

public const val IW_ENCODE_ALG_AES_CMAC: ULong = 5uL

public const val IW_ENCODE_EXT_TX_SEQ_VALID: ULong = 0x00000001uL

public const val IW_ENCODE_EXT_RX_SEQ_VALID: ULong = 0x00000002uL

public const val IW_ENCODE_EXT_GROUP_KEY: ULong = 0x00000004uL

public const val IW_ENCODE_EXT_SET_TX_KEY: ULong = 0x00000008uL

public const val IW_MICFAILURE_KEY_ID: ULong = 0x00000003uL

public const val IW_MICFAILURE_GROUP: ULong = 0x00000004uL

public const val IW_MICFAILURE_PAIRWISE: ULong = 0x00000008uL

public const val IW_MICFAILURE_STAKEY: ULong = 0x00000010uL

public const val IW_MICFAILURE_COUNT: ULong = 0x00000060uL

public const val IW_ENC_CAPA_WPA: ULong = 0x00000001uL

public const val IW_ENC_CAPA_WPA2: ULong = 0x00000002uL

public const val IW_ENC_CAPA_CIPHER_TKIP: ULong = 0x00000004uL

public const val IW_ENC_CAPA_CIPHER_CCMP: ULong = 0x00000008uL

public const val IW_ENC_CAPA_4WAY_HANDSHAKE: ULong = 0x00000010uL

public const val IW_EVENT_CAPA_K_0: ULong = 0x4000050uL

public const val IW_EVENT_CAPA_K_1: ULong = 0x400uL

public const val IW_PMKSA_ADD: ULong = 1uL

public const val IW_PMKSA_REMOVE: ULong = 2uL

public const val IW_PMKSA_FLUSH: ULong = 3uL

public const val IW_PMKID_LEN: ULong = 16uL

public const val IW_PMKID_CAND_PREAUTH: ULong = 0x00000001uL

public const val IW_EV_LCP_PK_LEN: ULong = 4uL

public const val IW_EV_CHAR_PK_LEN: ULong = 20uL

public const val IW_EV_UINT_PK_LEN: ULong = 8uL

public const val IW_EV_FREQ_PK_LEN: ULong = 12uL

public const val IW_EV_PARAM_PK_LEN: ULong = 12uL

public const val IW_EV_ADDR_PK_LEN: ULong = 20uL

public const val IW_EV_QUAL_PK_LEN: ULong = 8uL

public const val IW_EV_POINT_PK_LEN: ULong = 8uL

public val NUD_NONE: UShort = (0x00).toUShort()

public val NUD_INCOMPLETE: UShort = (0x01).toUShort()

public val NUD_REACHABLE: UShort = (0x02).toUShort()

public val NUD_STALE: UShort = (0x04).toUShort()

public val NUD_DELAY: UShort = (0x08).toUShort()

public val NUD_PROBE: UShort = (0x10).toUShort()

public val NUD_FAILED: UShort = (0x20).toUShort()

public val NUD_NOARP: UShort = (0x40).toUShort()

public val NUD_PERMANENT: UShort = (0x80).toUShort()

public val NTF_USE: UByte = (0x01).toUByte()

public val NTF_SELF: UByte = (0x02).toUByte()

public val NTF_MASTER: UByte = (0x04).toUByte()

public val NTF_PROXY: UByte = (0x08).toUByte()

public val NTF_ROUTER: UByte = (0x80).toUByte()

public val NDA_UNSPEC: UShort = (0).toUShort()

public val NDA_DST: UShort = (1).toUShort()

public val NDA_LLADDR: UShort = (2).toUShort()

public val NDA_CACHEINFO: UShort = (3).toUShort()

public val NDA_PROBES: UShort = (4).toUShort()

public val NDA_VLAN: UShort = (5).toUShort()

public val NDA_PORT: UShort = (6).toUShort()

public val NDA_VNI: UShort = (7).toUShort()

public val NDA_IFINDEX: UShort = (8).toUShort()

public const val NLM_F_BULK: Int = 0x200

public val TCA_UNSPEC: UShort = (0).toUShort()

public val TCA_KIND: UShort = (1).toUShort()

public val TCA_OPTIONS: UShort = (2).toUShort()

public val TCA_STATS: UShort = (3).toUShort()

public val TCA_XSTATS: UShort = (4).toUShort()

public val TCA_RATE: UShort = (5).toUShort()

public val TCA_FCNT: UShort = (6).toUShort()

public val TCA_STATS2: UShort = (7).toUShort()

public val TCA_STAB: UShort = (8).toUShort()

public val RTM_NEWLINK: UShort = (16).toUShort()

public val RTM_DELLINK: UShort = (17).toUShort()

public val RTM_GETLINK: UShort = (18).toUShort()

public val RTM_SETLINK: UShort = (19).toUShort()

public val RTM_NEWADDR: UShort = (20).toUShort()

public val RTM_DELADDR: UShort = (21).toUShort()

public val RTM_GETADDR: UShort = (22).toUShort()

public val RTM_NEWROUTE: UShort = (24).toUShort()

public val RTM_DELROUTE: UShort = (25).toUShort()

public val RTM_GETROUTE: UShort = (26).toUShort()

public val RTM_NEWNEIGH: UShort = (28).toUShort()

public val RTM_DELNEIGH: UShort = (29).toUShort()

public val RTM_GETNEIGH: UShort = (30).toUShort()

public val RTM_NEWRULE: UShort = (32).toUShort()

public val RTM_DELRULE: UShort = (33).toUShort()

public val RTM_GETRULE: UShort = (34).toUShort()

public val RTM_NEWQDISC: UShort = (36).toUShort()

public val RTM_DELQDISC: UShort = (37).toUShort()

public val RTM_GETQDISC: UShort = (38).toUShort()

public val RTM_NEWTCLASS: UShort = (40).toUShort()

public val RTM_DELTCLASS: UShort = (41).toUShort()

public val RTM_GETTCLASS: UShort = (42).toUShort()

public val RTM_NEWTFILTER: UShort = (44).toUShort()

public val RTM_DELTFILTER: UShort = (45).toUShort()

public val RTM_GETTFILTER: UShort = (46).toUShort()

public val RTM_NEWACTION: UShort = (48).toUShort()

public val RTM_DELACTION: UShort = (49).toUShort()

public val RTM_GETACTION: UShort = (50).toUShort()

public val RTM_NEWPREFIX: UShort = (52).toUShort()

public val RTM_GETMULTICAST: UShort = (58).toUShort()

public val RTM_GETANYCAST: UShort = (62).toUShort()

public val RTM_NEWNEIGHTBL: UShort = (64).toUShort()

public val RTM_GETNEIGHTBL: UShort = (66).toUShort()

public val RTM_SETNEIGHTBL: UShort = (67).toUShort()

public val RTM_NEWNDUSEROPT: UShort = (68).toUShort()

public val RTM_NEWADDRLABEL: UShort = (72).toUShort()

public val RTM_DELADDRLABEL: UShort = (73).toUShort()

public val RTM_GETADDRLABEL: UShort = (74).toUShort()

public val RTM_GETDCB: UShort = (78).toUShort()

public val RTM_SETDCB: UShort = (79).toUShort()

public val RTM_NEWNETCONF: UShort = (80).toUShort()

public val RTM_GETNETCONF: UShort = (82).toUShort()

public val RTM_NEWMDB: UShort = (84).toUShort()

public val RTM_DELMDB: UShort = (85).toUShort()

public val RTM_GETMDB: UShort = (86).toUShort()

public val RTM_NEWNSID: UShort = (88).toUShort()

public val RTM_DELNSID: UShort = (89).toUShort()

public val RTM_GETNSID: UShort = (90).toUShort()

public const val RTM_F_NOTIFY: UInt = 0x100u

public const val RTM_F_CLONED: UInt = 0x200u

public const val RTM_F_EQUALIZE: UInt = 0x400u

public const val RTM_F_PREFIX: UInt = 0x800u

public val RTA_UNSPEC: UShort = (0).toUShort()

public val RTA_DST: UShort = (1).toUShort()

public val RTA_SRC: UShort = (2).toUShort()

public val RTA_IIF: UShort = (3).toUShort()

public val RTA_OIF: UShort = (4).toUShort()

public val RTA_GATEWAY: UShort = (5).toUShort()

public val RTA_PRIORITY: UShort = (6).toUShort()

public val RTA_PREFSRC: UShort = (7).toUShort()

public val RTA_METRICS: UShort = (8).toUShort()

public val RTA_MULTIPATH: UShort = (9).toUShort()

public val RTA_PROTOINFO: UShort = (10).toUShort()

public val RTA_FLOW: UShort = (11).toUShort()

public val RTA_CACHEINFO: UShort = (12).toUShort()

public val RTA_SESSION: UShort = (13).toUShort()

public val RTA_MP_ALGO: UShort = (14).toUShort()

public val RTA_TABLE: UShort = (15).toUShort()

public val RTA_MARK: UShort = (16).toUShort()

public val RTA_MFC_STATS: UShort = (17).toUShort()

public val RTN_UNSPEC: UByte = (0).toUByte()

public val RTN_UNICAST: UByte = (1).toUByte()

public val RTN_LOCAL: UByte = (2).toUByte()

public val RTN_BROADCAST: UByte = (3).toUByte()

public val RTN_ANYCAST: UByte = (4).toUByte()

public val RTN_MULTICAST: UByte = (5).toUByte()

public val RTN_BLACKHOLE: UByte = (6).toUByte()

public val RTN_UNREACHABLE: UByte = (7).toUByte()

public val RTN_PROHIBIT: UByte = (8).toUByte()

public val RTN_THROW: UByte = (9).toUByte()

public val RTN_NAT: UByte = (10).toUByte()

public val RTN_XRESOLVE: UByte = (11).toUByte()

public val RTPROT_UNSPEC: UByte = (0).toUByte()

public val RTPROT_REDIRECT: UByte = (1).toUByte()

public val RTPROT_KERNEL: UByte = (2).toUByte()

public val RTPROT_BOOT: UByte = (3).toUByte()

public val RTPROT_STATIC: UByte = (4).toUByte()

public val RT_SCOPE_UNIVERSE: UByte = (0).toUByte()

public val RT_SCOPE_SITE: UByte = (200).toUByte()

public val RT_SCOPE_LINK: UByte = (253).toUByte()

public val RT_SCOPE_HOST: UByte = (254).toUByte()

public val RT_SCOPE_NOWHERE: UByte = (255).toUByte()

public val RT_TABLE_UNSPEC: UByte = (0).toUByte()

public val RT_TABLE_COMPAT: UByte = (252).toUByte()

public val RT_TABLE_DEFAULT: UByte = (253).toUByte()

public val RT_TABLE_MAIN: UByte = (254).toUByte()

public val RT_TABLE_LOCAL: UByte = (255).toUByte()

public val RTMSG_OVERRUN: UInt = NLMSG_OVERRUN.toUInt()

public const val RTMSG_NEWDEVICE: UInt = 0x11u

public const val RTMSG_DELDEVICE: UInt = 0x12u

public const val RTMSG_NEWROUTE: UInt = 0x21u

public const val RTMSG_DELROUTE: UInt = 0x22u

public const val RTMSG_NEWRULE: UInt = 0x31u

public const val RTMSG_DELRULE: UInt = 0x32u

public const val RTMSG_CONTROL: UInt = 0x40u

public const val RTMSG_AR_FAILED: UInt = 0x51u

public val RTEXT_FILTER_VF: Int = 1 shl 0

public val RTEXT_FILTER_BRVLAN: Int = 1 shl 1

public val RTEXT_FILTER_BRVLAN_COMPRESSED: Int = 1 shl 2

public val RTEXT_FILTER_SKIP_STATS: Int = 1 shl 3

public val RTEXT_FILTER_MRP: Int = 1 shl 4

public val RTEXT_FILTER_CFM_CONFIG: Int = 1 shl 5

public val RTEXT_FILTER_CFM_STATUS: Int = 1 shl 6

public const val RTMGRP_LINK: Int = 0x00001

public const val RTMGRP_NOTIFY: Int = 0x00002

public const val RTMGRP_NEIGH: Int = 0x00004

public const val RTMGRP_TC: Int = 0x00008

public const val RTMGRP_IPV4_IFADDR: Int = 0x00010

public const val RTMGRP_IPV4_MROUTE: Int = 0x00020

public const val RTMGRP_IPV4_ROUTE: Int = 0x00040

public const val RTMGRP_IPV4_RULE: Int = 0x00080

public const val RTMGRP_IPV6_IFADDR: Int = 0x00100

public const val RTMGRP_IPV6_MROUTE: Int = 0x00200

public const val RTMGRP_IPV6_ROUTE: Int = 0x00400

public const val RTMGRP_IPV6_IFINFO: Int = 0x00800

public const val RTMGRP_DECnet_IFADDR: Int = 0x01000

public const val RTMGRP_DECnet_ROUTE: Int = 0x04000

public const val RTMGRP_IPV6_PREFIX: Int = 0x20000

public const val RTNLGRP_NONE: UInt = 0x00u

public const val RTNLGRP_LINK: UInt = 0x01u

public const val RTNLGRP_NOTIFY: UInt = 0x02u

public const val RTNLGRP_NEIGH: UInt = 0x03u

public const val RTNLGRP_TC: UInt = 0x04u

public const val RTNLGRP_IPV4_IFADDR: UInt = 0x05u

public const val RTNLGRP_IPV4_MROUTE: UInt = 0x06u

public const val RTNLGRP_IPV4_ROUTE: UInt = 0x07u

public const val RTNLGRP_IPV4_RULE: UInt = 0x08u

public const val RTNLGRP_IPV6_IFADDR: UInt = 0x09u

public const val RTNLGRP_IPV6_MROUTE: UInt = 0x0au

public const val RTNLGRP_IPV6_ROUTE: UInt = 0x0bu

public const val RTNLGRP_IPV6_IFINFO: UInt = 0x0cu

public const val RTNLGRP_DECnet_IFADDR: UInt = 0x0du

public const val RTNLGRP_NOP2: UInt = 0x0eu

public const val RTNLGRP_DECnet_ROUTE: UInt = 0x0fu

public const val RTNLGRP_DECnet_RULE: UInt = 0x10u

public const val RTNLGRP_NOP4: UInt = 0x11u

public const val RTNLGRP_IPV6_PREFIX: UInt = 0x12u

public const val RTNLGRP_IPV6_RULE: UInt = 0x13u

public const val RTNLGRP_ND_USEROPT: UInt = 0x14u

public const val RTNLGRP_PHONET_IFADDR: UInt = 0x15u

public const val RTNLGRP_PHONET_ROUTE: UInt = 0x16u

public const val RTNLGRP_DCB: UInt = 0x17u

public const val RTNLGRP_IPV4_NETCONF: UInt = 0x18u

public const val RTNLGRP_IPV6_NETCONF: UInt = 0x19u

public const val RTNLGRP_MDB: UInt = 0x1au

public const val RTNLGRP_MPLS_ROUTE: UInt = 0x1bu

public const val RTNLGRP_NSID: UInt = 0x1cu

public const val RTNLGRP_MPLS_NETCONF: UInt = 0x1du

public const val RTNLGRP_IPV4_MROUTE_R: UInt = 0x1eu

public const val RTNLGRP_IPV6_MROUTE_R: UInt = 0x1fu

public const val RTNLGRP_NEXTHOP: UInt = 0x20u

public const val RTNLGRP_BRVLAN: UInt = 0x21u

public const val RTNLGRP_MCTP_IFADDR: UInt = 0x22u

public const val RTNLGRP_TUNNEL: UInt = 0x23u

public const val RTNLGRP_STATS: UInt = 0x24u

public const val CN_IDX_PROC: UInt = 0x1u

public const val CN_VAL_PROC: UInt = 0x1u

public const val CN_IDX_CIFS: UInt = 0x2u

public const val CN_VAL_CIFS: UInt = 0x1u

public const val CN_W1_IDX: UInt = 0x3u

public const val CN_W1_VAL: UInt = 0x1u

public const val CN_IDX_V86D: UInt = 0x4u

public const val CN_VAL_V86D_UVESAFB: UInt = 0x1u

public const val CN_IDX_BB: UInt = 0x5u

public const val CN_DST_IDX: UInt = 0x6u

public const val CN_DST_VAL: UInt = 0x1u

public const val CN_IDX_DM: UInt = 0x7u

public const val CN_VAL_DM_USERSPACE_LOG: UInt = 0x1u

public const val CN_IDX_DRBD: UInt = 0x8u

public const val CN_VAL_DRBD: UInt = 0x1u

public const val CN_KVP_IDX: UInt = 0x9u

public const val CN_KVP_VAL: UInt = 0x1u

public const val CN_VSS_IDX: UInt = 0xAu

public const val CN_VSS_VAL: UInt = 0x1u

public const val MODULE_INIT_IGNORE_MODVERSIONS: UInt = 0x0001u

public const val MODULE_INIT_IGNORE_VERMAGIC: UInt = 0x0002u

public val SOF_TIMESTAMPING_TX_HARDWARE: UInt = 1u shl 0

public val SOF_TIMESTAMPING_TX_SOFTWARE: UInt = 1u shl 1

public val SOF_TIMESTAMPING_RX_HARDWARE: UInt = 1u shl 2

public val SOF_TIMESTAMPING_RX_SOFTWARE: UInt = 1u shl 3

public val SOF_TIMESTAMPING_SOFTWARE: UInt = 1u shl 4

public val SOF_TIMESTAMPING_SYS_HARDWARE: UInt = 1u shl 5

public val SOF_TIMESTAMPING_RAW_HARDWARE: UInt = 1u shl 6

public val SOF_TIMESTAMPING_OPT_ID: UInt = 1u shl 7

public val SOF_TIMESTAMPING_TX_SCHED: UInt = 1u shl 8

public val SOF_TIMESTAMPING_TX_ACK: UInt = 1u shl 9

public val SOF_TIMESTAMPING_OPT_CMSG: UInt = 1u shl 10

public val SOF_TIMESTAMPING_OPT_TSONLY: UInt = 1u shl 11

public val SOF_TIMESTAMPING_OPT_STATS: UInt = 1u shl 12

public val SOF_TIMESTAMPING_OPT_PKTINFO: UInt = 1u shl 13

public val SOF_TIMESTAMPING_OPT_TX_SWHW: UInt = 1u shl 14

public val SOF_TIMESTAMPING_BIND_PHC: UInt = 1u shl 15

public val SOF_TIMESTAMPING_OPT_ID_TCP: UInt = 1u shl 16

public val SOF_TIMESTAMPING_OPT_RX_FILTER: UInt = 1u shl 17

public val SOF_TXTIME_DEADLINE_MODE: UInt = 1u shl 0

public val SOF_TXTIME_REPORT_ERRORS: UInt = 1u shl 1

public const val HWTSTAMP_TX_OFF: UInt = 0u

public const val HWTSTAMP_TX_ON: UInt = 1u

public const val HWTSTAMP_TX_ONESTEP_SYNC: UInt = 2u

public const val HWTSTAMP_TX_ONESTEP_P2P: UInt = 3u

public const val HWTSTAMP_FILTER_NONE: UInt = 0u

public const val HWTSTAMP_FILTER_ALL: UInt = 1u

public const val HWTSTAMP_FILTER_SOME: UInt = 2u

public const val HWTSTAMP_FILTER_PTP_V1_L4_EVENT: UInt = 3u

public const val HWTSTAMP_FILTER_PTP_V1_L4_SYNC: UInt = 4u

public const val HWTSTAMP_FILTER_PTP_V1_L4_DELAY_REQ: UInt = 5u

public const val HWTSTAMP_FILTER_PTP_V2_L4_EVENT: UInt = 6u

public const val HWTSTAMP_FILTER_PTP_V2_L4_SYNC: UInt = 7u

public const val HWTSTAMP_FILTER_PTP_V2_L4_DELAY_REQ: UInt = 8u

public const val HWTSTAMP_FILTER_PTP_V2_L2_EVENT: UInt = 9u

public const val HWTSTAMP_FILTER_PTP_V2_L2_SYNC: UInt = 10u

public const val HWTSTAMP_FILTER_PTP_V2_L2_DELAY_REQ: UInt = 11u

public const val HWTSTAMP_FILTER_PTP_V2_EVENT: UInt = 12u

public const val HWTSTAMP_FILTER_PTP_V2_SYNC: UInt = 13u

public const val HWTSTAMP_FILTER_PTP_V2_DELAY_REQ: UInt = 14u

public const val HWTSTAMP_FILTER_NTP_ALL: UInt = 15u

public const val PTP_MAX_SAMPLES: UInt = 25u

internal const val PTP_CLK_MAGIC: UInt = 0x3Du

// Upstream struct not yet ported: ptp_clock_caps
// public val PTP_CLOCK_GETCAPS: Ioctl = ioctlCode<ptp_clock_caps>(PTP_CLK_MAGIC, 1u)
// Upstream struct not yet ported: ptp_extts_request
// public val PTP_EXTTS_REQUEST: Ioctl = ioctlCode<ptp_extts_request>(PTP_CLK_MAGIC, 2u)
// Upstream struct not yet ported: ptp_perout_request
// public val PTP_PEROUT_REQUEST: Ioctl = ioctlCode<ptp_perout_request>(PTP_CLK_MAGIC, 3u)
public val PTP_ENABLE_PPS: Int = ioctlCode<Int>(PTP_CLK_MAGIC, 4u)

// Upstream struct not yet ported: ptp_sys_offset
// public val PTP_SYS_OFFSET: Ioctl = ioctlCode<ptp_sys_offset>(PTP_CLK_MAGIC, 5u)
// Upstream struct not yet ported: ptp_pin_desc
// public val PTP_PIN_GETFUNC: Ioctl = ioctlCode<ptp_pin_desc>(PTP_CLK_MAGIC, 6u)
// Upstream struct not yet ported: ptp_pin_desc
// public val PTP_PIN_SETFUNC: Ioctl = ioctlCode<ptp_pin_desc>(PTP_CLK_MAGIC, 7u)
// Upstream struct not yet ported: ptp_sys_offset_precise
// public val PTP_SYS_OFFSET_PRECISE: Ioctl = ioctlCode<ptp_sys_offset_precise>(PTP_CLK_MAGIC, 8u)
// Upstream struct not yet ported: ptp_sys_offset_extended
// public val PTP_SYS_OFFSET_EXTENDED: Ioctl = ioctlCode<ptp_sys_offset_extended>(PTP_CLK_MAGIC, 9u)
// Upstream struct not yet ported: ptp_clock_caps
// public val PTP_CLOCK_GETCAPS2: Ioctl = ioctlCode<ptp_clock_caps>(PTP_CLK_MAGIC, 10u)
// Upstream struct not yet ported: ptp_extts_request
// public val PTP_EXTTS_REQUEST2: Ioctl = ioctlCode<ptp_extts_request>(PTP_CLK_MAGIC, 11u)
// Upstream struct not yet ported: ptp_perout_request
// public val PTP_PEROUT_REQUEST2: Ioctl = ioctlCode<ptp_perout_request>(PTP_CLK_MAGIC, 12u)
public val PTP_ENABLE_PPS2: Int = ioctlCode<Int>(PTP_CLK_MAGIC, 13u)

// Upstream struct not yet ported: ptp_sys_offset
// public val PTP_SYS_OFFSET2: Ioctl = ioctlCode<ptp_sys_offset>(PTP_CLK_MAGIC, 14u)
// Upstream struct not yet ported: ptp_pin_desc
// public val PTP_PIN_GETFUNC2: Ioctl = ioctlCode<ptp_pin_desc>(PTP_CLK_MAGIC, 15u)
// Upstream struct not yet ported: ptp_pin_desc
// public val PTP_PIN_SETFUNC2: Ioctl = ioctlCode<ptp_pin_desc>(PTP_CLK_MAGIC, 16u)
// Upstream struct not yet ported: ptp_sys_offset_precise
// public val PTP_SYS_OFFSET_PRECISE2: Ioctl = ioctlCode<ptp_sys_offset_precise>(PTP_CLK_MAGIC, 17u)
// Upstream struct not yet ported: ptp_sys_offset_extended
// public val PTP_SYS_OFFSET_EXTENDED2: Ioctl = ioctlCode<ptp_sys_offset_extended>(PTP_CLK_MAGIC, 18u)
public const val PTP_PF_NONE: UInt = 0u

public const val PTP_PF_EXTTS: UInt = 1u

public const val PTP_PF_PEROUT: UInt = 2u

public const val PTP_PF_PHYSYNC: UInt = 3u

public const val TLS_TX: Int = 1

public const val TLS_RX: Int = 2

public const val TLS_TX_ZEROCOPY_RO: Int = 3

public const val TLS_RX_EXPECT_NO_PAD: Int = 4

public const val TLS_1_2_VERSION_MAJOR: UByte = 0x3u

public const val TLS_1_2_VERSION_MINOR: UByte = 0x3u

public const val TLS_1_3_VERSION_MAJOR: UByte = 0x3u

public const val TLS_1_3_VERSION_MINOR: UByte = 0x4u

public const val TLS_CIPHER_AES_GCM_128: UShort = 51u

public const val TLS_CIPHER_AES_GCM_128_IV_SIZE: ULong = 8uL

public const val TLS_CIPHER_AES_GCM_128_KEY_SIZE: ULong = 16uL

public const val TLS_CIPHER_AES_GCM_128_SALT_SIZE: ULong = 4uL

public const val TLS_CIPHER_AES_GCM_128_TAG_SIZE: ULong = 16uL

public const val TLS_CIPHER_AES_GCM_128_REC_SEQ_SIZE: ULong = 8uL

public const val TLS_CIPHER_AES_GCM_256: UShort = 52u

public const val TLS_CIPHER_AES_GCM_256_IV_SIZE: ULong = 8uL

public const val TLS_CIPHER_AES_GCM_256_KEY_SIZE: ULong = 32uL

public const val TLS_CIPHER_AES_GCM_256_SALT_SIZE: ULong = 4uL

public const val TLS_CIPHER_AES_GCM_256_TAG_SIZE: ULong = 16uL

public const val TLS_CIPHER_AES_GCM_256_REC_SEQ_SIZE: ULong = 8uL

public const val TLS_CIPHER_AES_CCM_128: UShort = 53u

public const val TLS_CIPHER_AES_CCM_128_IV_SIZE: ULong = 8uL

public const val TLS_CIPHER_AES_CCM_128_KEY_SIZE: ULong = 16uL

public const val TLS_CIPHER_AES_CCM_128_SALT_SIZE: ULong = 4uL

public const val TLS_CIPHER_AES_CCM_128_TAG_SIZE: ULong = 16uL

public const val TLS_CIPHER_AES_CCM_128_REC_SEQ_SIZE: ULong = 8uL

public const val TLS_CIPHER_CHACHA20_POLY1305: UShort = 54u

public const val TLS_CIPHER_CHACHA20_POLY1305_IV_SIZE: ULong = 12uL

public const val TLS_CIPHER_CHACHA20_POLY1305_KEY_SIZE: ULong = 32uL

public const val TLS_CIPHER_CHACHA20_POLY1305_SALT_SIZE: ULong = 0uL

public const val TLS_CIPHER_CHACHA20_POLY1305_TAG_SIZE: ULong = 16uL

public const val TLS_CIPHER_CHACHA20_POLY1305_REC_SEQ_SIZE: ULong = 8uL

public const val TLS_CIPHER_SM4_GCM: UShort = 55u

public const val TLS_CIPHER_SM4_GCM_IV_SIZE: ULong = 8uL

public const val TLS_CIPHER_SM4_GCM_KEY_SIZE: ULong = 16uL

public const val TLS_CIPHER_SM4_GCM_SALT_SIZE: ULong = 4uL

public const val TLS_CIPHER_SM4_GCM_TAG_SIZE: ULong = 16uL

public const val TLS_CIPHER_SM4_GCM_REC_SEQ_SIZE: ULong = 8uL

public const val TLS_CIPHER_SM4_CCM: UShort = 56u

public const val TLS_CIPHER_SM4_CCM_IV_SIZE: ULong = 8uL

public const val TLS_CIPHER_SM4_CCM_KEY_SIZE: ULong = 16uL

public const val TLS_CIPHER_SM4_CCM_SALT_SIZE: ULong = 4uL

public const val TLS_CIPHER_SM4_CCM_TAG_SIZE: ULong = 16uL

public const val TLS_CIPHER_SM4_CCM_REC_SEQ_SIZE: ULong = 8uL

public const val TLS_CIPHER_ARIA_GCM_128: UShort = 57u

public const val TLS_CIPHER_ARIA_GCM_128_IV_SIZE: ULong = 8uL

public const val TLS_CIPHER_ARIA_GCM_128_KEY_SIZE: ULong = 16uL

public const val TLS_CIPHER_ARIA_GCM_128_SALT_SIZE: ULong = 4uL

public const val TLS_CIPHER_ARIA_GCM_128_TAG_SIZE: ULong = 16uL

public const val TLS_CIPHER_ARIA_GCM_128_REC_SEQ_SIZE: ULong = 8uL

public const val TLS_CIPHER_ARIA_GCM_256: UShort = 58u

public const val TLS_CIPHER_ARIA_GCM_256_IV_SIZE: ULong = 8uL

public const val TLS_CIPHER_ARIA_GCM_256_KEY_SIZE: ULong = 32uL

public const val TLS_CIPHER_ARIA_GCM_256_SALT_SIZE: ULong = 4uL

public const val TLS_CIPHER_ARIA_GCM_256_TAG_SIZE: ULong = 16uL

public const val TLS_CIPHER_ARIA_GCM_256_REC_SEQ_SIZE: ULong = 8uL

public const val TLS_SET_RECORD_TYPE: Int = 1

public const val TLS_GET_RECORD_TYPE: Int = 2

public const val SOL_TLS: Int = 282

public const val TLS_INFO_UNSPEC: Int = 0x00

public const val TLS_INFO_VERSION: Int = 0x01

public const val TLS_INFO_CIPHER: Int = 0x02

public const val TLS_INFO_TXCONF: Int = 0x03

public const val TLS_INFO_RXCONF: Int = 0x04

public const val TLS_INFO_ZC_RO_TX: Int = 0x05

public const val TLS_INFO_RX_NO_PAD: Int = 0x06

public const val TLS_CONF_BASE: Int = 1

public const val TLS_CONF_SW: Int = 2

public const val TLS_CONF_HW: Int = 3

public const val TLS_CONF_HW_RECORD: Int = 4

public const val ALG_SET_KEY: Int = 1

public const val ALG_SET_IV: Int = 2

public const val ALG_SET_OP: Int = 3

public const val ALG_SET_AEAD_ASSOCLEN: Int = 4

public const val ALG_SET_AEAD_AUTHSIZE: Int = 5

public const val ALG_SET_DRBG_ENTROPY: Int = 6

public const val ALG_SET_KEY_BY_KEY_SERIAL: Int = 7

public const val ALG_OP_DECRYPT: Int = 0

public const val ALG_OP_ENCRYPT: Int = 1

public const val IF_OPER_UNKNOWN: Int = 0

public const val IF_OPER_NOTPRESENT: Int = 1

public const val IF_OPER_DOWN: Int = 2

public const val IF_OPER_LOWERLAYERDOWN: Int = 3

public const val IF_OPER_TESTING: Int = 4

public const val IF_OPER_DORMANT: Int = 5

public const val IF_OPER_UP: Int = 6

public const val IF_LINK_MODE_DEFAULT: Int = 0

public const val IF_LINK_MODE_DORMANT: Int = 1

public const val IF_LINK_MODE_TESTING: Int = 2

public const val MAP_SHARED_VALIDATE: Int = 0x3

public const val MAP_DROPPABLE: Int = 0x8

public const val VMADDR_CID_ANY: UInt = 0xFFFFFFFFu

public const val VMADDR_CID_HYPERVISOR: UInt = 0u

public const val VMADDR_CID_RESERVED: UInt = 1u

public const val VMADDR_CID_LOCAL: UInt = 1u

public const val VMADDR_CID_HOST: UInt = 2u

public const val VMADDR_PORT_ANY: UInt = 0xFFFFFFFFu

public const val IN_ACCESS: UInt = 0x00000001u

public const val IN_MODIFY: UInt = 0x00000002u

public const val IN_ATTRIB: UInt = 0x00000004u

public const val IN_CLOSE_WRITE: UInt = 0x00000008u

public const val IN_CLOSE_NOWRITE: UInt = 0x00000010u

public val IN_CLOSE: UInt = IN_CLOSE_WRITE or IN_CLOSE_NOWRITE

public const val IN_OPEN: UInt = 0x00000020u

public const val IN_MOVED_FROM: UInt = 0x00000040u

public const val IN_MOVED_TO: UInt = 0x00000080u

public val IN_MOVE: UInt = IN_MOVED_FROM or IN_MOVED_TO

public const val IN_CREATE: UInt = 0x00000100u

public const val IN_DELETE: UInt = 0x00000200u

public const val IN_DELETE_SELF: UInt = 0x00000400u

public const val IN_MOVE_SELF: UInt = 0x00000800u

public const val IN_UNMOUNT: UInt = 0x00002000u

public const val IN_Q_OVERFLOW: UInt = 0x00004000u

public const val IN_IGNORED: UInt = 0x00008000u

public const val IN_ONLYDIR: UInt = 0x01000000u

public const val IN_DONT_FOLLOW: UInt = 0x02000000u

public const val IN_EXCL_UNLINK: UInt = 0x04000000u

public const val SECURE_NOROOT: Int = 0

public const val SECURE_NOROOT_LOCKED: Int = 1

public const val SECURE_NO_SETUID_FIXUP: Int = 2

public const val SECURE_NO_SETUID_FIXUP_LOCKED: Int = 3

public const val SECURE_KEEP_CAPS: Int = 4

public const val SECURE_KEEP_CAPS_LOCKED: Int = 5

public const val SECURE_NO_CAP_AMBIENT_RAISE: Int = 6

public const val SECURE_NO_CAP_AMBIENT_RAISE_LOCKED: Int = 7

public const val SECURE_EXEC_RESTRICT_FILE: Int = 8

public const val SECURE_EXEC_RESTRICT_FILE_LOCKED: Int = 9

public const val SECURE_EXEC_DENY_INTERACTIVE: Int = 10

public const val SECURE_EXEC_DENY_INTERACTIVE_LOCKED: Int = 11

public val SECBIT_NOROOT: Int = isSecureMask(SECURE_NOROOT)

public val SECBIT_NOROOT_LOCKED: Int = isSecureMask(SECURE_NOROOT_LOCKED)

public val SECBIT_NO_SETUID_FIXUP: Int = isSecureMask(SECURE_NO_SETUID_FIXUP)

public val SECBIT_NO_SETUID_FIXUP_LOCKED: Int = isSecureMask(SECURE_NO_SETUID_FIXUP_LOCKED)

public val SECBIT_KEEP_CAPS: Int = isSecureMask(SECURE_KEEP_CAPS)

public val SECBIT_KEEP_CAPS_LOCKED: Int = isSecureMask(SECURE_KEEP_CAPS_LOCKED)

public val SECBIT_NO_CAP_AMBIENT_RAISE: Int = isSecureMask(SECURE_NO_CAP_AMBIENT_RAISE)

public val SECBIT_EXEC_RESTRICT_FILE: Int = isSecureMask(SECURE_EXEC_RESTRICT_FILE)

public val SECBIT_EXEC_RESTRICT_FILE_LOCKED: Int = isSecureMask(SECURE_EXEC_RESTRICT_FILE_LOCKED)

public val SECBIT_EXEC_DENY_INTERACTIVE: Int = isSecureMask(SECURE_EXEC_DENY_INTERACTIVE)

public const val SECUREBITS_DEFAULT: Int = 0x00000000

public val SECURE_ALL_BITS: Int = SECBIT_NOROOT or SECBIT_NO_SETUID_FIXUP or SECBIT_KEEP_CAPS or SECBIT_NO_CAP_AMBIENT_RAISE or SECBIT_EXEC_RESTRICT_FILE or SECBIT_EXEC_DENY_INTERACTIVE

public val SECURE_ALL_LOCKS: Int = SECURE_ALL_BITS shl 1

public const val IN_MASK_CREATE: UInt = 0x10000000u

public const val IN_MASK_ADD: UInt = 0x20000000u

public const val IN_ISDIR: UInt = 0x40000000u

public const val IN_ONESHOT: UInt = 0x8000_0000u

public val IN_ALL_EVENTS: UInt = IN_ACCESS or IN_MODIFY or IN_ATTRIB or IN_CLOSE_WRITE or IN_CLOSE_NOWRITE or IN_OPEN or IN_MOVED_FROM or IN_MOVED_TO or IN_DELETE or IN_CREATE or IN_DELETE_SELF or IN_MOVE_SELF

public const val IN_CLOEXEC: Int = O_CLOEXEC

public const val IN_NONBLOCK: Int = O_NONBLOCK

public const val OPEN_TREE_CLONE: UInt = 0x01u

public val OPEN_TREE_CLOEXEC: UInt = O_CLOEXEC.toUInt()

public const val NFT_TABLE_MAXNAMELEN: Int = 256

public const val NFT_CHAIN_MAXNAMELEN: Int = 256

public const val NFT_SET_MAXNAMELEN: Int = 256

public const val NFT_OBJ_MAXNAMELEN: Int = 256

public const val NFT_USERDATA_MAXLEN: Int = 256

public const val NFT_REG_VERDICT: Int = 0

public const val NFT_REG_1: Int = 1

public const val NFT_REG_2: Int = 2

public const val NFT_REG_3: Int = 3

public const val NFT_REG_4: Int = 4

public const val __NFT_REG_MAX: Int = 5

public const val NFT_REG32_00: Int = 8

public const val NFT_REG32_01: Int = 9

public const val NFT_REG32_02: Int = 10

public const val NFT_REG32_03: Int = 11

public const val NFT_REG32_04: Int = 12

public const val NFT_REG32_05: Int = 13

public const val NFT_REG32_06: Int = 14

public const val NFT_REG32_07: Int = 15

public const val NFT_REG32_08: Int = 16

public const val NFT_REG32_09: Int = 17

public const val NFT_REG32_10: Int = 18

public const val NFT_REG32_11: Int = 19

public const val NFT_REG32_12: Int = 20

public const val NFT_REG32_13: Int = 21

public const val NFT_REG32_14: Int = 22

public const val NFT_REG32_15: Int = 23

public const val NFT_REG_SIZE: Int = 16

public const val NFT_REG32_SIZE: Int = 4

public const val NFT_CONTINUE: Int = -1

public const val NFT_BREAK: Int = -2

public const val NFT_JUMP: Int = -3

public const val NFT_GOTO: Int = -4

public const val NFT_RETURN: Int = -5

public const val NFT_MSG_NEWTABLE: Int = 0

public const val NFT_MSG_GETTABLE: Int = 1

public const val NFT_MSG_DELTABLE: Int = 2

public const val NFT_MSG_NEWCHAIN: Int = 3

public const val NFT_MSG_GETCHAIN: Int = 4

public const val NFT_MSG_DELCHAIN: Int = 5

public const val NFT_MSG_NEWRULE: Int = 6

public const val NFT_MSG_GETRULE: Int = 7

public const val NFT_MSG_DELRULE: Int = 8

public const val NFT_MSG_NEWSET: Int = 9

public const val NFT_MSG_GETSET: Int = 10

public const val NFT_MSG_DELSET: Int = 11

public const val NFT_MSG_NEWSETELEM: Int = 12

public const val NFT_MSG_GETSETELEM: Int = 13

public const val NFT_MSG_DELSETELEM: Int = 14

public const val NFT_MSG_NEWGEN: Int = 15

public const val NFT_MSG_GETGEN: Int = 16

public const val NFT_MSG_TRACE: Int = 17

public const val NFT_MSG_NEWOBJ: Int = 18

public const val NFT_MSG_GETOBJ: Int = 19

public const val NFT_MSG_DELOBJ: Int = 20

public const val NFT_MSG_GETOBJ_RESET: Int = 21

public const val NFT_MSG_MAX: Int = 34

public const val NFT_SET_ANONYMOUS: Int = 0x1

public const val NFT_SET_CONSTANT: Int = 0x2

public const val NFT_SET_INTERVAL: Int = 0x4

public const val NFT_SET_MAP: Int = 0x8

public const val NFT_SET_TIMEOUT: Int = 0x10

public const val NFT_SET_EVAL: Int = 0x20

public const val NFT_SET_POL_PERFORMANCE: Int = 0

public const val NFT_SET_POL_MEMORY: Int = 1

public const val NFT_SET_ELEM_INTERVAL_END: Int = 0x1

public const val NFT_DATA_VALUE: UInt = 0u

public const val NFT_DATA_VERDICT: UInt = 0xffffff00u

public const val NFT_DATA_RESERVED_MASK: UInt = 0xffffff00u

public const val NFT_DATA_VALUE_MAXLEN: Int = 64

public const val NFT_BYTEORDER_NTOH: Int = 0

public const val NFT_BYTEORDER_HTON: Int = 1

public const val NFT_CMP_EQ: Int = 0

public const val NFT_CMP_NEQ: Int = 1

public const val NFT_CMP_LT: Int = 2

public const val NFT_CMP_LTE: Int = 3

public const val NFT_CMP_GT: Int = 4

public const val NFT_CMP_GTE: Int = 5

public const val NFT_RANGE_EQ: Int = 0

public const val NFT_RANGE_NEQ: Int = 1

public val NFT_LOOKUP_F_INV: Int = 1 shl 0

public const val NFT_DYNSET_OP_ADD: Int = 0

public const val NFT_DYNSET_OP_UPDATE: Int = 1

public val NFT_DYNSET_F_INV: Int = 1 shl 0

public const val NFT_PAYLOAD_LL_HEADER: Int = 0

public const val NFT_PAYLOAD_NETWORK_HEADER: Int = 1

public const val NFT_PAYLOAD_TRANSPORT_HEADER: Int = 2

public const val NFT_PAYLOAD_CSUM_NONE: Int = 0

public const val NFT_PAYLOAD_CSUM_INET: Int = 1

public const val NFT_META_LEN: Int = 0

public const val NFT_META_PROTOCOL: Int = 1

public const val NFT_META_PRIORITY: Int = 2

public const val NFT_META_MARK: Int = 3

public const val NFT_META_IIF: Int = 4

public const val NFT_META_OIF: Int = 5

public const val NFT_META_IIFNAME: Int = 6

public const val NFT_META_OIFNAME: Int = 7

public const val NFT_META_IIFTYPE: Int = 8

public const val NFT_META_OIFTYPE: Int = 9

public const val NFT_META_SKUID: Int = 10

public const val NFT_META_SKGID: Int = 11

public const val NFT_META_NFTRACE: Int = 12

public const val NFT_META_RTCLASSID: Int = 13

public const val NFT_META_SECMARK: Int = 14

public const val NFT_META_NFPROTO: Int = 15

public const val NFT_META_L4PROTO: Int = 16

public const val NFT_META_BRI_IIFNAME: Int = 17

public const val NFT_META_BRI_OIFNAME: Int = 18

public const val NFT_META_PKTTYPE: Int = 19

public const val NFT_META_CPU: Int = 20

public const val NFT_META_IIFGROUP: Int = 21

public const val NFT_META_OIFGROUP: Int = 22

public const val NFT_META_CGROUP: Int = 23

public const val NFT_META_PRANDOM: Int = 24

public const val NFT_CT_STATE: Int = 0

public const val NFT_CT_DIRECTION: Int = 1

public const val NFT_CT_STATUS: Int = 2

public const val NFT_CT_MARK: Int = 3

public const val NFT_CT_SECMARK: Int = 4

public const val NFT_CT_EXPIRATION: Int = 5

public const val NFT_CT_HELPER: Int = 6

public const val NFT_CT_L3PROTOCOL: Int = 7

public const val NFT_CT_SRC: Int = 8

public const val NFT_CT_DST: Int = 9

public const val NFT_CT_PROTOCOL: Int = 10

public const val NFT_CT_PROTO_SRC: Int = 11

public const val NFT_CT_PROTO_DST: Int = 12

public const val NFT_CT_LABELS: Int = 13

public const val NFT_CT_PKTS: Int = 14

public const val NFT_CT_BYTES: Int = 15

public const val NFT_CT_AVGPKT: Int = 16

public const val NFT_CT_ZONE: Int = 17

public const val NFT_CT_EVENTMASK: Int = 18

public const val NFT_CT_SRC_IP: Int = 19

public const val NFT_CT_DST_IP: Int = 20

public const val NFT_CT_SRC_IP6: Int = 21

public const val NFT_CT_DST_IP6: Int = 22

public const val NFT_LIMIT_PKTS: Int = 0

public const val NFT_LIMIT_PKT_BYTES: Int = 1

public val NFT_LIMIT_F_INV: Int = 1 shl 0

public const val NFT_QUEUE_FLAG_BYPASS: Int = 0x01

public const val NFT_QUEUE_FLAG_CPU_FANOUT: Int = 0x02

public const val NFT_QUEUE_FLAG_MASK: Int = 0x03

public val NFT_QUOTA_F_INV: Int = 1 shl 0

public const val NFT_REJECT_ICMP_UNREACH: Int = 0

public const val NFT_REJECT_TCP_RST: Int = 1

public const val NFT_REJECT_ICMPX_UNREACH: Int = 2

public const val NFT_REJECT_ICMPX_NO_ROUTE: Int = 0

public const val NFT_REJECT_ICMPX_PORT_UNREACH: Int = 1

public const val NFT_REJECT_ICMPX_HOST_UNREACH: Int = 2

public const val NFT_REJECT_ICMPX_ADMIN_PROHIBITED: Int = 3

public const val NFT_NAT_SNAT: Int = 0

public const val NFT_NAT_DNAT: Int = 1

public const val NFT_TRACETYPE_UNSPEC: Int = 0

public const val NFT_TRACETYPE_POLICY: Int = 1

public const val NFT_TRACETYPE_RETURN: Int = 2

public const val NFT_TRACETYPE_RULE: Int = 3

public const val NFT_NG_INCREMENTAL: Int = 0

public const val NFT_NG_RANDOM: Int = 1

public const val FF_MAX: UShort = 0x7fu

public val FF_CNT: ULong = FF_MAX.toULong() + 1u

public const val INPUT_PROP_POINTER: UShort = 0x00u

public const val INPUT_PROP_DIRECT: UShort = 0x01u

public const val INPUT_PROP_BUTTONPAD: UShort = 0x02u

public const val INPUT_PROP_SEMI_MT: UShort = 0x03u

public const val INPUT_PROP_TOPBUTTONPAD: UShort = 0x04u

public const val INPUT_PROP_POINTING_STICK: UShort = 0x05u

public const val INPUT_PROP_ACCELEROMETER: UShort = 0x06u

public const val INPUT_PROP_MAX: UShort = 0x1fu

public val INPUT_PROP_CNT: ULong = INPUT_PROP_MAX.toULong() + 1u

public const val EV_MAX: UShort = 0x1fu

public val EV_CNT: ULong = EV_MAX.toULong() + 1u

public const val SYN_MAX: UShort = 0xfu

public val SYN_CNT: ULong = SYN_MAX.toULong() + 1u

public const val KEY_MAX: UShort = 0x2ffu

public val KEY_CNT: ULong = KEY_MAX.toULong() + 1u

public const val REL_MAX: UShort = 0x0fu

public val REL_CNT: ULong = REL_MAX.toULong() + 1u

public const val ABS_MAX: UShort = 0x3fu

public val ABS_CNT: ULong = ABS_MAX.toULong() + 1u

public const val SW_MAX: UShort = 0x10u

public val SW_CNT: ULong = SW_MAX.toULong() + 1u

public const val MSC_MAX: UShort = 0x07u

public val MSC_CNT: ULong = MSC_MAX.toULong() + 1u

public const val LED_MAX: UShort = 0x0fu

public val LED_CNT: ULong = LED_MAX.toULong() + 1u

public const val REP_MAX: UShort = 0x01u

public val REP_CNT: ULong = REP_MAX.toULong() + 1u

public const val SND_MAX: UShort = 0x07u

public val SND_CNT: ULong = SND_MAX.toULong() + 1u

public const val UINPUT_VERSION: UInt = 5u

public const val UINPUT_MAX_NAME_SIZE: ULong = 80uL

public const val FAN_ACCESS: ULong = 0x00000001uL

public const val FAN_MODIFY: ULong = 0x00000002uL

public const val FAN_ATTRIB: ULong = 0x00000004uL

public const val FAN_CLOSE_WRITE: ULong = 0x00000008uL

public const val FAN_CLOSE_NOWRITE: ULong = 0x00000010uL

public const val FAN_OPEN: ULong = 0x00000020uL

public const val FAN_MOVED_FROM: ULong = 0x00000040uL

public const val FAN_MOVED_TO: ULong = 0x00000080uL

public const val FAN_CREATE: ULong = 0x00000100uL

public const val FAN_DELETE: ULong = 0x00000200uL

public const val FAN_DELETE_SELF: ULong = 0x00000400uL

public const val FAN_MOVE_SELF: ULong = 0x00000800uL

public const val FAN_OPEN_EXEC: ULong = 0x00001000uL

public const val FAN_Q_OVERFLOW: ULong = 0x00004000uL

public const val FAN_FS_ERROR: ULong = 0x00008000uL

public const val FAN_OPEN_PERM: ULong = 0x00010000uL

public const val FAN_ACCESS_PERM: ULong = 0x00020000uL

public const val FAN_OPEN_EXEC_PERM: ULong = 0x00040000uL

public const val FAN_EVENT_ON_CHILD: ULong = 0x08000000uL

public const val FAN_RENAME: ULong = 0x10000000uL

public const val FAN_ONDIR: ULong = 0x40000000uL

public val FAN_CLOSE: ULong = FAN_CLOSE_WRITE or FAN_CLOSE_NOWRITE

public val FAN_MOVE: ULong = FAN_MOVED_FROM or FAN_MOVED_TO

public const val FAN_CLOEXEC: UInt = 0x00000001u

public const val FAN_NONBLOCK: UInt = 0x00000002u

public const val FAN_CLASS_NOTIF: UInt = 0x00000000u

public const val FAN_CLASS_CONTENT: UInt = 0x00000004u

public const val FAN_CLASS_PRE_CONTENT: UInt = 0x00000008u

public const val FAN_UNLIMITED_QUEUE: UInt = 0x00000010u

public const val FAN_UNLIMITED_MARKS: UInt = 0x00000020u

public const val FAN_ENABLE_AUDIT: UInt = 0x00000040u

public const val FAN_REPORT_PIDFD: UInt = 0x00000080u

public const val FAN_REPORT_TID: UInt = 0x00000100u

public const val FAN_REPORT_FID: UInt = 0x00000200u

public const val FAN_REPORT_DIR_FID: UInt = 0x00000400u

public const val FAN_REPORT_NAME: UInt = 0x00000800u

public const val FAN_REPORT_TARGET_FID: UInt = 0x00001000u

public val FAN_REPORT_DFID_NAME: UInt = FAN_REPORT_DIR_FID or FAN_REPORT_NAME

public const val FAN_MARK_ADD: UInt = 0x00000001u

public const val FAN_MARK_REMOVE: UInt = 0x00000002u

public const val FAN_MARK_DONT_FOLLOW: UInt = 0x00000004u

public const val FAN_MARK_ONLYDIR: UInt = 0x00000008u

public const val FAN_MARK_IGNORED_MASK: UInt = 0x00000020u

public const val FAN_MARK_IGNORED_SURV_MODIFY: UInt = 0x00000040u

public const val FAN_MARK_FLUSH: UInt = 0x00000080u

public const val FAN_MARK_EVICTABLE: UInt = 0x00000200u

public const val FAN_MARK_IGNORE: UInt = 0x00000400u

public const val FAN_MARK_INODE: UInt = 0x00000000u

public const val FAN_MARK_MOUNT: UInt = 0x00000010u

public const val FAN_MARK_FILESYSTEM: UInt = 0x00000100u

public val FAN_MARK_IGNORE_SURV: UInt = FAN_MARK_IGNORE or FAN_MARK_IGNORED_SURV_MODIFY

public val FANOTIFY_METADATA_VERSION: UByte = (3).toUByte()

public val FAN_EVENT_INFO_TYPE_FID: UByte = (1).toUByte()

public val FAN_EVENT_INFO_TYPE_DFID_NAME: UByte = (2).toUByte()

public val FAN_EVENT_INFO_TYPE_DFID: UByte = (3).toUByte()

public val FAN_EVENT_INFO_TYPE_PIDFD: UByte = (4).toUByte()

public val FAN_EVENT_INFO_TYPE_ERROR: UByte = (5).toUByte()

public val FAN_EVENT_INFO_TYPE_OLD_DFID_NAME: UByte = (10).toUByte()

public val FAN_EVENT_INFO_TYPE_NEW_DFID_NAME: UByte = (12).toUByte()

public val FAN_RESPONSE_INFO_NONE: UByte = (0).toUByte()

public val FAN_RESPONSE_INFO_AUDIT_RULE: UByte = (1).toUByte()

public const val FAN_ALLOW: UInt = 0x01u

public const val FAN_DENY: UInt = 0x02u

public const val FAN_AUDIT: UInt = 0x10u

public const val FAN_INFO: UInt = 0x20u

public const val FAN_NOFD: Int = -1

public const val FAN_NOPIDFD: Int = FAN_NOFD

public const val FAN_EPIDFD: Int = -2

public const val FUTEX_WAIT: Int = 0

public const val FUTEX_WAKE: Int = 1

public const val FUTEX_FD: Int = 2

public const val FUTEX_REQUEUE: Int = 3

public const val FUTEX_CMP_REQUEUE: Int = 4

public const val FUTEX_WAKE_OP: Int = 5

public const val FUTEX_LOCK_PI: Int = 6

public const val FUTEX_UNLOCK_PI: Int = 7

public const val FUTEX_TRYLOCK_PI: Int = 8

public const val FUTEX_WAIT_BITSET: Int = 9

public const val FUTEX_WAKE_BITSET: Int = 10

public const val FUTEX_WAIT_REQUEUE_PI: Int = 11

public const val FUTEX_CMP_REQUEUE_PI: Int = 12

public const val FUTEX_LOCK_PI2: Int = 13

public const val FUTEX_PRIVATE_FLAG: Int = 128

public const val FUTEX_CLOCK_REALTIME: Int = 256

public val FUTEX_CMD_MASK: Int = (FUTEX_PRIVATE_FLAG or FUTEX_CLOCK_REALTIME).inv()

public const val FUTEX_WAITERS: UInt = 0x80000000u

public const val FUTEX_OWNER_DIED: UInt = 0x40000000u

public const val FUTEX_TID_MASK: UInt = 0x3fffffffu

public const val FUTEX_BITSET_MATCH_ANY: Int = 0xffffffff.toInt()

public const val FUTEX_OP_SET: Int = 0

public const val FUTEX_OP_ADD: Int = 1

public const val FUTEX_OP_OR: Int = 2

public const val FUTEX_OP_ANDN: Int = 3

public const val FUTEX_OP_XOR: Int = 4

public const val FUTEX_OP_OPARG_SHIFT: Int = 8

public const val FUTEX_OP_CMP_EQ: Int = 0

public const val FUTEX_OP_CMP_NE: Int = 1

public const val FUTEX_OP_CMP_LT: Int = 2

public const val FUTEX_OP_CMP_LE: Int = 3

public const val FUTEX_OP_CMP_GT: Int = 4

public const val FUTEX_OP_CMP_GE: Int = 5

public const val KEXEC_ON_CRASH: Int = 0x00000001

public const val KEXEC_PRESERVE_CONTEXT: Int = 0x00000002

public const val KEXEC_ARCH_MASK: Int = 0xffff0000.toInt()

public const val KEXEC_FILE_UNLOAD: Int = 0x00000001

public const val KEXEC_FILE_ON_CRASH: Int = 0x00000002

public const val KEXEC_FILE_NO_INITRAMFS: Int = 0x00000004

public const val LINUX_REBOOT_MAGIC1: Int = 0xfee1dead.toInt()

public const val LINUX_REBOOT_MAGIC2: Int = 672274793

public const val LINUX_REBOOT_MAGIC2A: Int = 85072278

public const val LINUX_REBOOT_MAGIC2B: Int = 369367448

public const val LINUX_REBOOT_MAGIC2C: Int = 537993216

public const val LINUX_REBOOT_CMD_RESTART: Int = 0x01234567

public const val LINUX_REBOOT_CMD_HALT: Int = 0xCDEF0123.toInt()

public const val LINUX_REBOOT_CMD_CAD_ON: Int = 0x89ABCDEF.toInt()

public const val LINUX_REBOOT_CMD_CAD_OFF: Int = 0x00000000

public const val LINUX_REBOOT_CMD_POWER_OFF: Int = 0x4321FEDC

public const val LINUX_REBOOT_CMD_RESTART2: Int = 0xA1B2C3D4.toInt()

public const val LINUX_REBOOT_CMD_SW_SUSPEND: Int = 0xD000FCE2.toInt()

public const val LINUX_REBOOT_CMD_KEXEC: Int = 0x45584543

public val SO_EE_ORIGIN_NONE: UByte = (0).toUByte()

public val SO_EE_ORIGIN_LOCAL: UByte = (1).toUByte()

public val SO_EE_ORIGIN_ICMP: UByte = (2).toUByte()

public val SO_EE_ORIGIN_ICMP6: UByte = (3).toUByte()

public val SO_EE_ORIGIN_TXSTATUS: UByte = (4).toUByte()

public val SO_EE_ORIGIN_TIMESTAMPING: UByte = SO_EE_ORIGIN_TXSTATUS

public const val SCTP_FUTURE_ASSOC: Int = 0

public const val SCTP_CURRENT_ASSOC: Int = 1

public const val SCTP_ALL_ASSOC: Int = 2

public const val SCTP_RTOINFO: Int = 0

public const val SCTP_ASSOCINFO: Int = 1

public const val SCTP_INITMSG: Int = 2

public const val SCTP_NODELAY: Int = 3

public const val SCTP_AUTOCLOSE: Int = 4

public const val SCTP_SET_PEER_PRIMARY_ADDR: Int = 5

public const val SCTP_PRIMARY_ADDR: Int = 6

public const val SCTP_ADAPTATION_LAYER: Int = 7

public const val SCTP_DISABLE_FRAGMENTS: Int = 8

public const val SCTP_PEER_ADDR_PARAMS: Int = 9

public const val SCTP_DEFAULT_SEND_PARAM: Int = 10

public const val SCTP_EVENTS: Int = 11

public const val SCTP_I_WANT_MAPPED_V4_ADDR: Int = 12

public const val SCTP_MAXSEG: Int = 13

public const val SCTP_STATUS: Int = 14

public const val SCTP_GET_PEER_ADDR_INFO: Int = 15

public const val SCTP_DELAYED_ACK_TIME: Int = 16

public const val SCTP_DELAYED_ACK: Int = SCTP_DELAYED_ACK_TIME

public const val SCTP_DELAYED_SACK: Int = SCTP_DELAYED_ACK_TIME

public const val SCTP_CONTEXT: Int = 17

public const val SCTP_FRAGMENT_INTERLEAVE: Int = 18

public const val SCTP_PARTIAL_DELIVERY_POINT: Int = 19

public const val SCTP_MAX_BURST: Int = 20

public const val SCTP_AUTH_CHUNK: Int = 21

public const val SCTP_HMAC_IDENT: Int = 22

public const val SCTP_AUTH_KEY: Int = 23

public const val SCTP_AUTH_ACTIVE_KEY: Int = 24

public const val SCTP_AUTH_DELETE_KEY: Int = 25

public const val SCTP_PEER_AUTH_CHUNKS: Int = 26

public const val SCTP_LOCAL_AUTH_CHUNKS: Int = 27

public const val SCTP_GET_ASSOC_NUMBER: Int = 28

public const val SCTP_GET_ASSOC_ID_LIST: Int = 29

public const val SCTP_AUTO_ASCONF: Int = 30

public const val SCTP_PEER_ADDR_THLDS: Int = 31

public const val SCTP_RECVRCVINFO: Int = 32

public const val SCTP_RECVNXTINFO: Int = 33

public const val SCTP_DEFAULT_SNDINFO: Int = 34

public const val SCTP_AUTH_DEACTIVATE_KEY: Int = 35

public const val SCTP_REUSE_PORT: Int = 36

public const val SCTP_PEER_ADDR_THLDS_V2: Int = 37

public const val SCTP_PR_SCTP_NONE: Int = 0x0000

public const val SCTP_PR_SCTP_TTL: Int = 0x0010

public const val SCTP_PR_SCTP_RTX: Int = 0x0020

public const val SCTP_PR_SCTP_PRIO: Int = 0x0030

public const val SCTP_PR_SCTP_MAX: Int = SCTP_PR_SCTP_PRIO

public const val SCTP_PR_SCTP_MASK: Int = 0x0030

public const val SCTP_ENABLE_RESET_STREAM_REQ: Int = 0x01

public const val SCTP_ENABLE_RESET_ASSOC_REQ: Int = 0x02

public const val SCTP_ENABLE_CHANGE_ASSOC_REQ: Int = 0x04

public const val SCTP_ENABLE_STRRESET_MASK: Int = 0x07

public const val SCTP_STREAM_RESET_INCOMING: Int = 0x01

public const val SCTP_STREAM_RESET_OUTGOING: Int = 0x02

public const val SCTP_INIT: Int = 0

public const val SCTP_SNDRCV: Int = 1

public const val SCTP_SNDINFO: Int = 2

public const val SCTP_RCVINFO: Int = 3

public const val SCTP_NXTINFO: Int = 4

public const val SCTP_PRINFO: Int = 5

public const val SCTP_AUTHINFO: Int = 6

public const val SCTP_DSTADDRV4: Int = 7

public const val SCTP_DSTADDRV6: Int = 8

public val SCTP_UNORDERED: Int = 1 shl 0

public val SCTP_ADDR_OVER: Int = 1 shl 1

public val SCTP_ABORT: Int = 1 shl 2

public val SCTP_SACK_IMMEDIATELY: Int = 1 shl 3

public val SCTP_SENDALL: Int = 1 shl 6

public val SCTP_PR_SCTP_ALL: Int = 1 shl 7

public const val SCTP_NOTIFICATION: Int = MSG_NOTIFICATION

public const val SCTP_EOF: Int = MSG_FIN

public const val DCCP_SOCKOPT_PACKET_SIZE: Int = 1

public const val DCCP_SOCKOPT_SERVICE: Int = 2

public const val DCCP_SOCKOPT_CHANGE_L: Int = 3

public const val DCCP_SOCKOPT_CHANGE_R: Int = 4

public const val DCCP_SOCKOPT_GET_CUR_MPS: Int = 5

public const val DCCP_SOCKOPT_SERVER_TIMEWAIT: Int = 6

public const val DCCP_SOCKOPT_SEND_CSCOV: Int = 10

public const val DCCP_SOCKOPT_RECV_CSCOV: Int = 11

public const val DCCP_SOCKOPT_AVAILABLE_CCIDS: Int = 12

public const val DCCP_SOCKOPT_CCID: Int = 13

public const val DCCP_SOCKOPT_TX_CCID: Int = 14

public const val DCCP_SOCKOPT_RX_CCID: Int = 15

public const val DCCP_SOCKOPT_QPOLICY_ID: Int = 16

public const val DCCP_SOCKOPT_QPOLICY_TXQLEN: Int = 17

public const val DCCP_SOCKOPT_CCID_RX_INFO: Int = 128

public const val DCCP_SOCKOPT_CCID_TX_INFO: Int = 192

public const val DCCP_SERVICE_LIST_MAX_LEN: Int = 32

public const val CTL_KERN: Int = 1

public const val CTL_VM: Int = 2

public const val CTL_NET: Int = 3

public const val CTL_FS: Int = 5

public const val CTL_DEBUG: Int = 6

public const val CTL_DEV: Int = 7

public const val CTL_BUS: Int = 8

public const val CTL_ABI: Int = 9

public const val CTL_CPU: Int = 10

public const val CTL_BUS_ISA: Int = 1

public const val INOTIFY_MAX_USER_INSTANCES: Int = 1

public const val INOTIFY_MAX_USER_WATCHES: Int = 2

public const val INOTIFY_MAX_QUEUED_EVENTS: Int = 3

public const val KERN_OSTYPE: Int = 1

public const val KERN_OSRELEASE: Int = 2

public const val KERN_OSREV: Int = 3

public const val KERN_VERSION: Int = 4

public const val KERN_SECUREMASK: Int = 5

public const val KERN_PROF: Int = 6

public const val KERN_NODENAME: Int = 7

public const val KERN_DOMAINNAME: Int = 8

public const val KERN_PANIC: Int = 15

public const val KERN_REALROOTDEV: Int = 16

public const val KERN_SPARC_REBOOT: Int = 21

public const val KERN_CTLALTDEL: Int = 22

public const val KERN_PRINTK: Int = 23

public const val KERN_NAMETRANS: Int = 24

public const val KERN_PPC_HTABRECLAIM: Int = 25

public const val KERN_PPC_ZEROPAGED: Int = 26

public const val KERN_PPC_POWERSAVE_NAP: Int = 27

public const val KERN_MODPROBE: Int = 28

public const val KERN_SG_BIG_BUFF: Int = 29

public const val KERN_ACCT: Int = 30

public const val KERN_PPC_L2CR: Int = 31

public const val KERN_RTSIGNR: Int = 32

public const val KERN_RTSIGMAX: Int = 33

public const val KERN_SHMMAX: Int = 34

public const val KERN_MSGMAX: Int = 35

public const val KERN_MSGMNB: Int = 36

public const val KERN_MSGPOOL: Int = 37

public const val KERN_SYSRQ: Int = 38

public const val KERN_MAX_THREADS: Int = 39

public const val KERN_RANDOM: Int = 40

public const val KERN_SHMALL: Int = 41

public const val KERN_MSGMNI: Int = 42

public const val KERN_SEM: Int = 43

public const val KERN_SPARC_STOP_A: Int = 44

public const val KERN_SHMMNI: Int = 45

public const val KERN_OVERFLOWUID: Int = 46

public const val KERN_OVERFLOWGID: Int = 47

public const val KERN_SHMPATH: Int = 48

public const val KERN_HOTPLUG: Int = 49

public const val KERN_IEEE_EMULATION_WARNINGS: Int = 50

public const val KERN_S390_USER_DEBUG_LOGGING: Int = 51

public const val KERN_CORE_USES_PID: Int = 52

public const val KERN_TAINTED: Int = 53

public const val KERN_CADPID: Int = 54

public const val KERN_PIDMAX: Int = 55

public const val KERN_CORE_PATTERN: Int = 56

public const val KERN_PANIC_ON_OOPS: Int = 57

public const val KERN_HPPA_PWRSW: Int = 58

public const val KERN_HPPA_UNALIGNED: Int = 59

public const val KERN_PRINTK_RATELIMIT: Int = 60

public const val KERN_PRINTK_RATELIMIT_BURST: Int = 61

public const val KERN_PTY: Int = 62

public const val KERN_NGROUPS_MAX: Int = 63

public const val KERN_SPARC_SCONS_PWROFF: Int = 64

public const val KERN_HZ_TIMER: Int = 65

public const val KERN_UNKNOWN_NMI_PANIC: Int = 66

public const val KERN_BOOTLOADER_TYPE: Int = 67

public const val KERN_RANDOMIZE: Int = 68

public const val KERN_SETUID_DUMPABLE: Int = 69

public const val KERN_SPIN_RETRY: Int = 70

public const val KERN_ACPI_VIDEO_FLAGS: Int = 71

public const val KERN_IA64_UNALIGNED: Int = 72

public const val KERN_COMPAT_LOG: Int = 73

public const val KERN_MAX_LOCK_DEPTH: Int = 74

public const val KERN_NMI_WATCHDOG: Int = 75

public const val KERN_PANIC_ON_NMI: Int = 76

public const val VM_OVERCOMMIT_MEMORY: Int = 5

public const val VM_PAGE_CLUSTER: Int = 10

public const val VM_DIRTY_BACKGROUND: Int = 11

public const val VM_DIRTY_RATIO: Int = 12

public const val VM_DIRTY_WB_CS: Int = 13

public const val VM_DIRTY_EXPIRE_CS: Int = 14

public const val VM_NR_PDFLUSH_THREADS: Int = 15

public const val VM_OVERCOMMIT_RATIO: Int = 16

public const val VM_PAGEBUF: Int = 17

public const val VM_HUGETLB_PAGES: Int = 18

public const val VM_SWAPPINESS: Int = 19

public const val VM_LOWMEM_RESERVE_RATIO: Int = 20

public const val VM_MIN_FREE_KBYTES: Int = 21

public const val VM_MAX_MAP_COUNT: Int = 22

public const val VM_LAPTOP_MODE: Int = 23

public const val VM_BLOCK_DUMP: Int = 24

public const val VM_HUGETLB_GROUP: Int = 25

public const val VM_VFS_CACHE_PRESSURE: Int = 26

public const val VM_LEGACY_VA_LAYOUT: Int = 27

public const val VM_SWAP_TOKEN_TIMEOUT: Int = 28

public const val VM_DROP_PAGECACHE: Int = 29

public const val VM_PERCPU_PAGELIST_FRACTION: Int = 30

public const val VM_ZONE_RECLAIM_MODE: Int = 31

public const val VM_MIN_UNMAPPED: Int = 32

public const val VM_PANIC_ON_OOM: Int = 33

public const val VM_VDSO_ENABLED: Int = 34

public const val VM_MIN_SLAB: Int = 35

public const val NET_CORE: Int = 1

public const val NET_ETHER: Int = 2

public const val NET_802: Int = 3

public const val NET_UNIX: Int = 4

public const val NET_IPV4: Int = 5

public const val NET_IPX: Int = 6

public const val NET_ATALK: Int = 7

public const val NET_NETROM: Int = 8

public const val NET_AX25: Int = 9

public const val NET_BRIDGE: Int = 10

public const val NET_ROSE: Int = 11

public const val NET_IPV6: Int = 12

public const val NET_X25: Int = 13

public const val NET_TR: Int = 14

public const val NET_DECNET: Int = 15

public const val NET_ECONET: Int = 16

public const val NET_SCTP: Int = 17

public const val NET_LLC: Int = 18

public const val NET_NETFILTER: Int = 19

public const val NET_DCCP: Int = 20

public const val NET_IRDA: Int = 412

public const val PF_VCPU: Int = 0x00000001

public const val PF_IDLE: Int = 0x00000002

public const val PF_EXITING: Int = 0x00000004

public const val PF_POSTCOREDUMP: Int = 0x00000008

public const val PF_IO_WORKER: Int = 0x00000010

public const val PF_WQ_WORKER: Int = 0x00000020

public const val PF_FORKNOEXEC: Int = 0x00000040

public const val PF_MCE_PROCESS: Int = 0x00000080

public const val PF_SUPERPRIV: Int = 0x00000100

public const val PF_DUMPCORE: Int = 0x00000200

public const val PF_SIGNALED: Int = 0x00000400

public const val PF_MEMALLOC: Int = 0x00000800

public const val PF_NPROC_EXCEEDED: Int = 0x00001000

public const val PF_USED_MATH: Int = 0x00002000

public const val PF_USER_WORKER: Int = 0x00004000

public const val PF_NOFREEZE: Int = 0x00008000

public const val PF_KSWAPD: Int = 0x00020000

public const val PF_MEMALLOC_NOFS: Int = 0x00040000

public const val PF_MEMALLOC_NOIO: Int = 0x00080000

public const val PF_LOCAL_THROTTLE: Int = 0x00100000

public const val PF_KTHREAD: Int = 0x00200000

public const val PF_RANDOMIZE: Int = 0x00400000

public const val PF_NO_SETAFFINITY: Int = 0x04000000

public const val PF_MCE_EARLY: Int = 0x08000000

public const val PF_MEMALLOC_PIN: Int = 0x10000000

public const val PF_BLOCK_TS: Int = 0x20000000

internal const val PF_SUSPEND_TASK_UINT: UInt = 0x80000000u

public val PF_SUSPEND_TASK: Int = PF_SUSPEND_TASK_UINT.toInt()

public const val CLONE_PIDFD: Int = 0x1000

public const val SCHED_FLAG_RESET_ON_FORK: Int = 0x01

public const val SCHED_FLAG_RECLAIM: Int = 0x02

public const val SCHED_FLAG_DL_OVERRUN: Int = 0x04

public const val SCHED_FLAG_KEEP_POLICY: Int = 0x08

public const val SCHED_FLAG_KEEP_PARAMS: Int = 0x10

public const val SCHED_FLAG_UTIL_CLAMP_MIN: Int = 0x20

public const val SCHED_FLAG_UTIL_CLAMP_MAX: Int = 0x40

public val XDP_SHARED_UMEM: UShort = (1 shl 0).toUShort()

public val XDP_COPY: UShort = (1 shl 1).toUShort()

public val XDP_ZEROCOPY: UShort = (1 shl 2).toUShort()

public val XDP_USE_NEED_WAKEUP: UShort = (1 shl 3).toUShort()

public val XDP_USE_SG: UShort = (1 shl 4).toUShort()

public val XDP_UMEM_UNALIGNED_CHUNK_FLAG: UInt = 1u shl 0

public val XDP_RING_NEED_WAKEUP: UInt = 1u shl 0

public const val XDP_MMAP_OFFSETS: Int = 1

public const val XDP_RX_RING: Int = 2

public const val XDP_TX_RING: Int = 3

public const val XDP_UMEM_REG: Int = 4

public const val XDP_UMEM_FILL_RING: Int = 5

public const val XDP_UMEM_COMPLETION_RING: Int = 6

public const val XDP_STATISTICS: Int = 7

public const val XDP_OPTIONS: Int = 8

public val XDP_OPTIONS_ZEROCOPY: UInt = 1u shl 0

public const val XDP_PGOFF_RX_RING: Long = 0

public const val XDP_PGOFF_TX_RING: Long = 0x80000000

public const val XDP_UMEM_PGOFF_FILL_RING: ULong = 0x100000000uL

public const val XDP_UMEM_PGOFF_COMPLETION_RING: ULong = 0x180000000uL

public const val XSK_UNALIGNED_BUF_OFFSET_SHIFT: Int = 48

public val XDP_PKT_CONTD: UInt = 1u shl 0

public val XDP_UMEM_TX_SW_CSUM: UInt = 1u shl 1

public val XDP_UMEM_TX_METADATA_LEN: UInt = 1u shl 2

public val XDP_TXMD_FLAGS_TIMESTAMP: UInt = 1u shl 0

public val XDP_TXMD_FLAGS_CHECKSUM: UInt = 1u shl 1

public val XDP_TX_METADATA: UInt = 1u shl 1

public const val SOL_XDP: Int = 283

public const val MOUNT_ATTR_RDONLY: ULong = 0x00000001uL

public const val MOUNT_ATTR_NOSUID: ULong = 0x00000002uL

public const val MOUNT_ATTR_NODEV: ULong = 0x00000004uL

public const val MOUNT_ATTR_NOEXEC: ULong = 0x00000008uL

public const val MOUNT_ATTR__ATIME: ULong = 0x00000070uL

public const val MOUNT_ATTR_RELATIME: ULong = 0x00000000uL

public const val MOUNT_ATTR_NOATIME: ULong = 0x00000010uL

public const val MOUNT_ATTR_STRICTATIME: ULong = 0x00000020uL

public const val MOUNT_ATTR_NODIRATIME: ULong = 0x00000080uL

public const val MOUNT_ATTR_IDMAP: ULong = 0x00100000uL

public const val MOUNT_ATTR_NOSYMFOLLOW: ULong = 0x00200000uL

public const val MOUNT_ATTR_SIZE_VER0: Int = 32

public val SCHED_FLAG_KEEP_ALL: Int = SCHED_FLAG_KEEP_POLICY or SCHED_FLAG_KEEP_PARAMS

public val SCHED_FLAG_UTIL_CLAMP: Int = SCHED_FLAG_UTIL_CLAMP_MIN or SCHED_FLAG_UTIL_CLAMP_MAX

public val SCHED_FLAG_ALL: Int = SCHED_FLAG_RESET_ON_FORK or SCHED_FLAG_RECLAIM or SCHED_FLAG_DL_OVERRUN or SCHED_FLAG_KEEP_ALL or SCHED_FLAG_UTIL_CLAMP

public const val EPIOCSPARAMS: Int = 0x40088a01.toInt()

public const val EPIOCGPARAMS: Int = 0x80088a02.toInt()

public const val SI_DETHREAD: Int = -7

public const val TRAP_PERF: Int = 6
