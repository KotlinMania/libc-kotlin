package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlonglong
import io.github.kotlinmania.libc.unix.linuxlike.MSG_FIN
import io.github.kotlinmania.libc.unix.linuxlike.io
import io.github.kotlinmania.libc.unix.linuxlike.ior
import io.github.kotlinmania.libc.unix.linuxlike.iow
import io.github.kotlinmania.libc.unix.linuxlike.iowr
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Ioctl
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.U64

public val NFT_REJECT_TCP_RST: CInt = 1

public val NFT_REJECT_ICMPX_UNREACH: CInt = 2

public val NFT_REJECT_ICMPX_NO_ROUTE: CInt = 0

public val NFT_REJECT_ICMPX_PORT_UNREACH: CInt = 1

public val NFT_REJECT_ICMPX_HOST_UNREACH: CInt = 2

public val NFT_REJECT_ICMPX_ADMIN_PROHIBITED: CInt = 3

public val NFT_NAT_SNAT: CInt = 0

public val NFT_NAT_DNAT: CInt = 1

public val NFT_TRACETYPE_UNSPEC: CInt = 0

public val NFT_TRACETYPE_POLICY: CInt = 1

public val NFT_TRACETYPE_RETURN: CInt = 2

public val NFT_TRACETYPE_RULE: CInt = 3

public val NFT_NG_INCREMENTAL: CInt = 0

public val NFT_NG_RANDOM: CInt = 1

// linux/input.h
public val FF_MAX: U16 = 0x7fu

public val FF_CNT: Int = FF_MAX.toInt() + 1

// linux/input-event-codes.h
public val INPUT_PROP_POINTER: U16 = 0x00u

public val INPUT_PROP_DIRECT: U16 = 0x01u

public val INPUT_PROP_BUTTONPAD: U16 = 0x02u

public val INPUT_PROP_SEMI_MT: U16 = 0x03u

public val INPUT_PROP_TOPBUTTONPAD: U16 = 0x04u

public val INPUT_PROP_POINTING_STICK: U16 = 0x05u

public val INPUT_PROP_ACCELEROMETER: U16 = 0x06u

public val INPUT_PROP_MAX: U16 = 0x1fu

public val INPUT_PROP_CNT: Int = INPUT_PROP_MAX.toInt() + 1

public val EV_MAX: U16 = 0x1fu

public val EV_CNT: Int = EV_MAX.toInt() + 1

public val SYN_MAX: U16 = 0xfu

public val SYN_CNT: Int = SYN_MAX.toInt() + 1

public val KEY_MAX: U16 = 0x2ffu

public val KEY_CNT: Int = KEY_MAX.toInt() + 1

public val REL_MAX: U16 = 0x0fu

public val REL_CNT: Int = REL_MAX.toInt() + 1

public val ABS_MAX: U16 = 0x3fu

public val ABS_CNT: Int = ABS_MAX.toInt() + 1

public val SW_MAX: U16 = 0x10u

public val SW_CNT: Int = SW_MAX.toInt() + 1

public val MSC_MAX: U16 = 0x07u

public val MSC_CNT: Int = MSC_MAX.toInt() + 1

public val LED_MAX: U16 = 0x0fu

public val LED_CNT: Int = LED_MAX.toInt() + 1

public val REP_MAX: U16 = 0x01u

public val REP_CNT: Int = REP_MAX.toInt() + 1

public val SND_MAX: U16 = 0x07u

public val SND_CNT: Int = SND_MAX.toInt() + 1

// linux/uinput.h
public val UINPUT_VERSION: CUint = 5u

public val UINPUT_MAX_NAME_SIZE: Int = 80

// uapi/linux/fanotify.h
public val FAN_ACCESS: ULong = 0x00000001uL

public val FAN_MODIFY: ULong = 0x00000002uL

public val FAN_ATTRIB: ULong = 0x00000004uL

public val FAN_CLOSE_WRITE: ULong = 0x00000008uL

public val FAN_CLOSE_NOWRITE: ULong = 0x00000010uL

public val FAN_OPEN: ULong = 0x00000020uL

public val FAN_MOVED_FROM: ULong = 0x00000040uL

public val FAN_MOVED_TO: ULong = 0x00000080uL

public val FAN_CREATE: ULong = 0x00000100uL

public val FAN_DELETE: ULong = 0x00000200uL

public val FAN_DELETE_SELF: ULong = 0x00000400uL

public val FAN_MOVE_SELF: ULong = 0x00000800uL

public val FAN_OPEN_EXEC: ULong = 0x00001000uL

public val FAN_Q_OVERFLOW: ULong = 0x00004000uL

public val FAN_FS_ERROR: ULong = 0x00008000uL

public val FAN_OPEN_PERM: ULong = 0x00010000uL

public val FAN_ACCESS_PERM: ULong = 0x00020000uL

public val FAN_OPEN_EXEC_PERM: ULong = 0x00040000uL

public val FAN_EVENT_ON_CHILD: ULong = 0x08000000uL

public val FAN_RENAME: ULong = 0x10000000uL

public val FAN_ONDIR: ULong = 0x40000000uL

public val FAN_CLOSE: ULong = FAN_CLOSE_WRITE or FAN_CLOSE_NOWRITE

public val FAN_MOVE: ULong = FAN_MOVED_FROM or FAN_MOVED_TO

public val FAN_CLOEXEC: CUint = 0x00000001u

public val FAN_NONBLOCK: CUint = 0x00000002u

public val FAN_CLASS_NOTIF: CUint = 0x00000000u

public val FAN_CLASS_CONTENT: CUint = 0x00000004u

public val FAN_CLASS_PRE_CONTENT: CUint = 0x00000008u

public val FAN_UNLIMITED_QUEUE: CUint = 0x00000010u

public val FAN_UNLIMITED_MARKS: CUint = 0x00000020u

public val FAN_ENABLE_AUDIT: CUint = 0x00000040u

public val FAN_REPORT_PIDFD: CUint = 0x00000080u

public val FAN_REPORT_TID: CUint = 0x00000100u

public val FAN_REPORT_FID: CUint = 0x00000200u

public val FAN_REPORT_DIR_FID: CUint = 0x00000400u

public val FAN_REPORT_NAME: CUint = 0x00000800u

public val FAN_REPORT_TARGET_FID: CUint = 0x00001000u

public val FAN_REPORT_DFID_NAME: CUint = FAN_REPORT_DIR_FID or FAN_REPORT_NAME

public val FAN_REPORT_DFID_NAME_TARGET: CUint = FAN_REPORT_DFID_NAME or FAN_REPORT_FID or FAN_REPORT_TARGET_FID

public val FAN_MARK_ADD: CUint = 0x00000001u

public val FAN_MARK_REMOVE: CUint = 0x00000002u

public val FAN_MARK_DONT_FOLLOW: CUint = 0x00000004u

public val FAN_MARK_ONLYDIR: CUint = 0x00000008u

public val FAN_MARK_IGNORED_MASK: CUint = 0x00000020u

public val FAN_MARK_IGNORED_SURV_MODIFY: CUint = 0x00000040u

public val FAN_MARK_FLUSH: CUint = 0x00000080u

public val FAN_MARK_EVICTABLE: CUint = 0x00000200u

public val FAN_MARK_IGNORE: CUint = 0x00000400u

public val FAN_MARK_INODE: CUint = 0x00000000u

public val FAN_MARK_MOUNT: CUint = 0x00000010u

public val FAN_MARK_FILESYSTEM: CUint = 0x00000100u

public val FAN_MARK_IGNORE_SURV: CUint = FAN_MARK_IGNORE or FAN_MARK_IGNORED_SURV_MODIFY

public val FANOTIFY_METADATA_VERSION: UByte = 3u

public val FAN_EVENT_INFO_TYPE_FID: UByte = 1u

public val FAN_EVENT_INFO_TYPE_DFID_NAME: UByte = 2u

public val FAN_EVENT_INFO_TYPE_DFID: UByte = 3u

public val FAN_EVENT_INFO_TYPE_PIDFD: UByte = 4u

public val FAN_EVENT_INFO_TYPE_ERROR: UByte = 5u

public val FAN_EVENT_INFO_TYPE_OLD_DFID_NAME: UByte = 10u

public val FAN_EVENT_INFO_TYPE_NEW_DFID_NAME: UByte = 12u

public val FAN_RESPONSE_INFO_NONE: UByte = 0u

public val FAN_RESPONSE_INFO_AUDIT_RULE: UByte = 1u

public val FAN_ALLOW: UInt = 0x01u

public val FAN_DENY: UInt = 0x02u

public val FAN_AUDIT: UInt = 0x10u

public val FAN_INFO: UInt = 0x20u

public val FAN_NOFD: CInt = -1

public val FAN_NOPIDFD: CInt = FAN_NOFD

public val FAN_EPIDFD: CInt = -2

// linux/futex.h
public val FUTEX_WAIT: CInt = 0

public val FUTEX_WAKE: CInt = 1

public val FUTEX_FD: CInt = 2

public val FUTEX_REQUEUE: CInt = 3

public val FUTEX_CMP_REQUEUE: CInt = 4

public val FUTEX_WAKE_OP: CInt = 5

public val FUTEX_LOCK_PI: CInt = 6

public val FUTEX_UNLOCK_PI: CInt = 7

public val FUTEX_TRYLOCK_PI: CInt = 8

public val FUTEX_WAIT_BITSET: CInt = 9

public val FUTEX_WAKE_BITSET: CInt = 10

public val FUTEX_WAIT_REQUEUE_PI: CInt = 11

public val FUTEX_CMP_REQUEUE_PI: CInt = 12

public val FUTEX_LOCK_PI2: CInt = 13

public val FUTEX_PRIVATE_FLAG: CInt = 128

public val FUTEX_CLOCK_REALTIME: CInt = 256

public val FUTEX_CMD_MASK: CInt = (FUTEX_PRIVATE_FLAG or FUTEX_CLOCK_REALTIME).inv()

public val FUTEX_WAITERS: UInt = 0x80000000u

public val FUTEX_OWNER_DIED: UInt = 0x40000000u

public val FUTEX_TID_MASK: UInt = 0x3fffffffu

public val FUTEX_BITSET_MATCH_ANY: CInt = 0xffffffff.toInt()

public val FUTEX_OP_SET: CInt = 0

public val FUTEX_OP_ADD: CInt = 1

public val FUTEX_OP_OR: CInt = 2

public val FUTEX_OP_ANDN: CInt = 3

public val FUTEX_OP_XOR: CInt = 4

public val FUTEX_OP_OPARG_SHIFT: CInt = 8

public val FUTEX_OP_CMP_EQ: CInt = 0

public val FUTEX_OP_CMP_NE: CInt = 1

public val FUTEX_OP_CMP_LT: CInt = 2

public val FUTEX_OP_CMP_LE: CInt = 3

public val FUTEX_OP_CMP_GT: CInt = 4

public val FUTEX_OP_CMP_GE: CInt = 5

// linux/kexec.h
public val KEXEC_ON_CRASH: CInt = 0x00000001

public val KEXEC_PRESERVE_CONTEXT: CInt = 0x00000002

public val KEXEC_ARCH_MASK: CInt = 0xffff0000.toInt()

public val KEXEC_FILE_UNLOAD: CInt = 0x00000001

public val KEXEC_FILE_ON_CRASH: CInt = 0x00000002

public val KEXEC_FILE_NO_INITRAMFS: CInt = 0x00000004

// linux/reboot.h
public val LINUX_REBOOT_MAGIC1: CInt = 0xfee1dead.toInt()

public val LINUX_REBOOT_MAGIC2: CInt = 672274793

public val LINUX_REBOOT_MAGIC2A: CInt = 85072278

public val LINUX_REBOOT_MAGIC2B: CInt = 369367448

public val LINUX_REBOOT_MAGIC2C: CInt = 537993216

public val LINUX_REBOOT_CMD_RESTART: CInt = 0x01234567

public val LINUX_REBOOT_CMD_HALT: CInt = 0xCDEF0123.toInt()

public val LINUX_REBOOT_CMD_CAD_ON: CInt = 0x89ABCDEF.toInt()

public val LINUX_REBOOT_CMD_CAD_OFF: CInt = 0x00000000

public val LINUX_REBOOT_CMD_POWER_OFF: CInt = 0x4321FEDC

public val LINUX_REBOOT_CMD_RESTART2: CInt = 0xA1B2C3D4.toInt()

public val LINUX_REBOOT_CMD_SW_SUSPEND: CInt = 0xD000FCE2.toInt()

public val LINUX_REBOOT_CMD_KEXEC: CInt = 0x45584543

// linux/errqueue.h
public val SO_EE_ORIGIN_NONE: UByte = 0u

public val SO_EE_ORIGIN_LOCAL: UByte = 1u

public val SO_EE_ORIGIN_ICMP: UByte = 2u

public val SO_EE_ORIGIN_ICMP6: UByte = 3u

public val SO_EE_ORIGIN_TXSTATUS: UByte = 4u

public val SO_EE_ORIGIN_TIMESTAMPING: UByte = SO_EE_ORIGIN_TXSTATUS

// linux/sctp.h
public val SCTP_FUTURE_ASSOC: CInt = 0

public val SCTP_CURRENT_ASSOC: CInt = 1

public val SCTP_ALL_ASSOC: CInt = 2

public val SCTP_RTOINFO: CInt = 0

public val SCTP_ASSOCINFO: CInt = 1

public val SCTP_INITMSG: CInt = 2

public val SCTP_NODELAY: CInt = 3

public val SCTP_AUTOCLOSE: CInt = 4

public val SCTP_SET_PEER_PRIMARY_ADDR: CInt = 5

public val SCTP_PRIMARY_ADDR: CInt = 6

public val SCTP_ADAPTATION_LAYER: CInt = 7

public val SCTP_DISABLE_FRAGMENTS: CInt = 8

public val SCTP_PEER_ADDR_PARAMS: CInt = 9

public val SCTP_DEFAULT_SEND_PARAM: CInt = 10

public val SCTP_EVENTS: CInt = 11

public val SCTP_I_WANT_MAPPED_V4_ADDR: CInt = 12

public val SCTP_MAXSEG: CInt = 13

public val SCTP_STATUS: CInt = 14

public val SCTP_GET_PEER_ADDR_INFO: CInt = 15

public val SCTP_DELAYED_ACK_TIME: CInt = 16

public val SCTP_DELAYED_ACK: CInt = SCTP_DELAYED_ACK_TIME

public val SCTP_DELAYED_SACK: CInt = SCTP_DELAYED_ACK_TIME

public val SCTP_CONTEXT: CInt = 17

public val SCTP_FRAGMENT_INTERLEAVE: CInt = 18

public val SCTP_PARTIAL_DELIVERY_POINT: CInt = 19

public val SCTP_MAX_BURST: CInt = 20

public val SCTP_AUTH_CHUNK: CInt = 21

public val SCTP_HMAC_IDENT: CInt = 22

public val SCTP_AUTH_KEY: CInt = 23

public val SCTP_AUTH_ACTIVE_KEY: CInt = 24

public val SCTP_AUTH_DELETE_KEY: CInt = 25

public val SCTP_PEER_AUTH_CHUNKS: CInt = 26

public val SCTP_LOCAL_AUTH_CHUNKS: CInt = 27

public val SCTP_GET_ASSOC_NUMBER: CInt = 28

public val SCTP_GET_ASSOC_ID_LIST: CInt = 29

public val SCTP_AUTO_ASCONF: CInt = 30

public val SCTP_PEER_ADDR_THLDS: CInt = 31

public val SCTP_RECVRCVINFO: CInt = 32

public val SCTP_RECVNXTINFO: CInt = 33

public val SCTP_DEFAULT_SNDINFO: CInt = 34

public val SCTP_AUTH_DEACTIVATE_KEY: CInt = 35

public val SCTP_REUSE_PORT: CInt = 36

public val SCTP_PEER_ADDR_THLDS_V2: CInt = 37

public val SCTP_PR_SCTP_NONE: CInt = 0x0000

public val SCTP_PR_SCTP_TTL: CInt = 0x0010

public val SCTP_PR_SCTP_RTX: CInt = 0x0020

public val SCTP_PR_SCTP_PRIO: CInt = 0x0030

public val SCTP_PR_SCTP_MAX: CInt = SCTP_PR_SCTP_PRIO

public val SCTP_PR_SCTP_MASK: CInt = 0x0030

public val SCTP_ENABLE_RESET_STREAM_REQ: CInt = 0x01

public val SCTP_ENABLE_RESET_ASSOC_REQ: CInt = 0x02

public val SCTP_ENABLE_CHANGE_ASSOC_REQ: CInt = 0x04

public val SCTP_ENABLE_STRRESET_MASK: CInt = 0x07

public val SCTP_STREAM_RESET_INCOMING: CInt = 0x01

public val SCTP_STREAM_RESET_OUTGOING: CInt = 0x02

public val SCTP_INIT: CInt = 0

public val SCTP_SNDRCV: CInt = 1

public val SCTP_SNDINFO: CInt = 2

public val SCTP_RCVINFO: CInt = 3

public val SCTP_NXTINFO: CInt = 4

public val SCTP_PRINFO: CInt = 5

public val SCTP_AUTHINFO: CInt = 6

public val SCTP_DSTADDRV4: CInt = 7

public val SCTP_DSTADDRV6: CInt = 8

public val SCTP_UNORDERED: CInt = 1 shl 0

public val SCTP_ADDR_OVER: CInt = 1 shl 1

public val SCTP_ABORT: CInt = 1 shl 2

public val SCTP_SACK_IMMEDIATELY: CInt = 1 shl 3

public val SCTP_SENDALL: CInt = 1 shl 6

public val SCTP_PR_SCTP_ALL: CInt = 1 shl 7

public val SCTP_NOTIFICATION: CInt = MSG_NOTIFICATION

public val SCTP_EOF: CInt = MSG_FIN

// DCCP socket options
public val DCCP_SOCKOPT_PACKET_SIZE: CInt = 1

public val DCCP_SOCKOPT_SERVICE: CInt = 2

public val DCCP_SOCKOPT_CHANGE_L: CInt = 3

public val DCCP_SOCKOPT_CHANGE_R: CInt = 4

public val DCCP_SOCKOPT_GET_CUR_MPS: CInt = 5

public val DCCP_SOCKOPT_SERVER_TIMEWAIT: CInt = 6

public val DCCP_SOCKOPT_SEND_CSCOV: CInt = 10

public val DCCP_SOCKOPT_RECV_CSCOV: CInt = 11

public val DCCP_SOCKOPT_AVAILABLE_CCIDS: CInt = 12

public val DCCP_SOCKOPT_CCID: CInt = 13

public val DCCP_SOCKOPT_TX_CCID: CInt = 14

public val DCCP_SOCKOPT_RX_CCID: CInt = 15

public val DCCP_SOCKOPT_QPOLICY_ID: CInt = 16

public val DCCP_SOCKOPT_QPOLICY_TXQLEN: CInt = 17

public val DCCP_SOCKOPT_CCID_RX_INFO: CInt = 128

public val DCCP_SOCKOPT_CCID_TX_INFO: CInt = 192

/**
 * maximum number of services provided on the same listening port
 */
public val DCCP_SERVICE_LIST_MAX_LEN: CInt = 32

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_NET: CInt = 3

public val CTL_FS: CInt = 5

public val CTL_DEBUG: CInt = 6

public val CTL_DEV: CInt = 7

public val CTL_BUS: CInt = 8

public val CTL_ABI: CInt = 9

public val CTL_CPU: CInt = 10

public val CTL_BUS_ISA: CInt = 1

public val INOTIFY_MAX_USER_INSTANCES: CInt = 1

public val INOTIFY_MAX_USER_WATCHES: CInt = 2

public val INOTIFY_MAX_QUEUED_EVENTS: CInt = 3

public val KERN_OSTYPE: CInt = 1

public val KERN_OSRELEASE: CInt = 2

public val KERN_OSREV: CInt = 3

public val KERN_VERSION: CInt = 4

public val KERN_SECUREMASK: CInt = 5

public val KERN_PROF: CInt = 6

public val KERN_NODENAME: CInt = 7

public val KERN_DOMAINNAME: CInt = 8

public val KERN_PANIC: CInt = 15

public val KERN_REALROOTDEV: CInt = 16

public val KERN_SPARC_REBOOT: CInt = 21

public val KERN_CTLALTDEL: CInt = 22

public val KERN_PRINTK: CInt = 23

public val KERN_NAMETRANS: CInt = 24

public val KERN_PPC_HTABRECLAIM: CInt = 25

public val KERN_PPC_ZEROPAGED: CInt = 26

public val KERN_PPC_POWERSAVE_NAP: CInt = 27

public val KERN_MODPROBE: CInt = 28

public val KERN_SG_BIG_BUFF: CInt = 29

public val KERN_ACCT: CInt = 30

public val KERN_PPC_L2CR: CInt = 31

public val KERN_RTSIGNR: CInt = 32

public val KERN_RTSIGMAX: CInt = 33

public val KERN_SHMMAX: CInt = 34

public val KERN_MSGMAX: CInt = 35

public val KERN_MSGMNB: CInt = 36

public val KERN_MSGPOOL: CInt = 37

public val KERN_SYSRQ: CInt = 38

public val KERN_MAX_THREADS: CInt = 39

public val KERN_RANDOM: CInt = 40

public val KERN_SHMALL: CInt = 41

public val KERN_MSGMNI: CInt = 42

public val KERN_SEM: CInt = 43

public val KERN_SPARC_STOP_A: CInt = 44

public val KERN_SHMMNI: CInt = 45

public val KERN_OVERFLOWUID: CInt = 46

public val KERN_OVERFLOWGID: CInt = 47

public val KERN_SHMPATH: CInt = 48

public val KERN_HOTPLUG: CInt = 49

public val KERN_IEEE_EMULATION_WARNINGS: CInt = 50

public val KERN_S390_USER_DEBUG_LOGGING: CInt = 51

public val KERN_CORE_USES_PID: CInt = 52

public val KERN_TAINTED: CInt = 53

public val KERN_CADPID: CInt = 54

public val KERN_PIDMAX: CInt = 55

public val KERN_CORE_PATTERN: CInt = 56

public val KERN_PANIC_ON_OOPS: CInt = 57

public val KERN_HPPA_PWRSW: CInt = 58

public val KERN_HPPA_UNALIGNED: CInt = 59

public val KERN_PRINTK_RATELIMIT: CInt = 60

public val KERN_PRINTK_RATELIMIT_BURST: CInt = 61

public val KERN_PTY: CInt = 62

public val KERN_NGROUPS_MAX: CInt = 63

public val KERN_SPARC_SCONS_PWROFF: CInt = 64

public val KERN_HZ_TIMER: CInt = 65

public val KERN_UNKNOWN_NMI_PANIC: CInt = 66

public val KERN_BOOTLOADER_TYPE: CInt = 67

public val KERN_RANDOMIZE: CInt = 68

public val KERN_SETUID_DUMPABLE: CInt = 69

public val KERN_SPIN_RETRY: CInt = 70

public val KERN_ACPI_VIDEO_FLAGS: CInt = 71

public val KERN_IA64_UNALIGNED: CInt = 72

public val KERN_COMPAT_LOG: CInt = 73

public val KERN_MAX_LOCK_DEPTH: CInt = 74

public val KERN_NMI_WATCHDOG: CInt = 75

public val KERN_PANIC_ON_NMI: CInt = 76

public val VM_OVERCOMMIT_MEMORY: CInt = 5

public val VM_PAGE_CLUSTER: CInt = 10

public val VM_DIRTY_BACKGROUND: CInt = 11

public val VM_DIRTY_RATIO: CInt = 12

public val VM_DIRTY_WB_CS: CInt = 13

public val VM_DIRTY_EXPIRE_CS: CInt = 14

public val VM_NR_PDFLUSH_THREADS: CInt = 15

public val VM_OVERCOMMIT_RATIO: CInt = 16

public val VM_PAGEBUF: CInt = 17

public val VM_HUGETLB_PAGES: CInt = 18

public val VM_SWAPPINESS: CInt = 19

public val VM_LOWMEM_RESERVE_RATIO: CInt = 20

public val VM_MIN_FREE_KBYTES: CInt = 21

public val VM_MAX_MAP_COUNT: CInt = 22

public val VM_LAPTOP_MODE: CInt = 23

public val VM_BLOCK_DUMP: CInt = 24

public val VM_HUGETLB_GROUP: CInt = 25

public val VM_VFS_CACHE_PRESSURE: CInt = 26

public val VM_LEGACY_VA_LAYOUT: CInt = 27

public val VM_SWAP_TOKEN_TIMEOUT: CInt = 28

public val VM_DROP_PAGECACHE: CInt = 29

public val VM_PERCPU_PAGELIST_FRACTION: CInt = 30

public val VM_ZONE_RECLAIM_MODE: CInt = 31

public val VM_MIN_UNMAPPED: CInt = 32

public val VM_PANIC_ON_OOM: CInt = 33

public val VM_VDSO_ENABLED: CInt = 34

public val VM_MIN_SLAB: CInt = 35

public val NET_CORE: CInt = 1

public val NET_ETHER: CInt = 2

public val NET_802: CInt = 3

public val NET_UNIX: CInt = 4

public val NET_IPV4: CInt = 5

public val NET_IPX: CInt = 6

public val NET_ATALK: CInt = 7

public val NET_NETROM: CInt = 8

public val NET_AX25: CInt = 9

public val NET_BRIDGE: CInt = 10

public val NET_ROSE: CInt = 11

public val NET_IPV6: CInt = 12

public val NET_X25: CInt = 13

public val NET_TR: CInt = 14

public val NET_DECNET: CInt = 15

public val NET_ECONET: CInt = 16

public val NET_SCTP: CInt = 17

public val NET_LLC: CInt = 18

public val NET_NETFILTER: CInt = 19

public val NET_DCCP: CInt = 20

public val NET_IRDA: CInt = 412

// include/linux/sched.h

/**
 * I'm a virtual CPU.
 */
public val PF_VCPU: CInt = 0x00000001

/**
 * I am an IDLE thread.
 */
public val PF_IDLE: CInt = 0x00000002

/**
 * Getting shut down.
 */
public val PF_EXITING: CInt = 0x00000004

/**
 * Coredumps should ignore this task.
 */
public val PF_POSTCOREDUMP: CInt = 0x00000008

/**
 * Task is an IO worker.
 */
public val PF_IO_WORKER: CInt = 0x00000010

/**
 * I'm a workqueue worker.
 */
public val PF_WQ_WORKER: CInt = 0x00000020

/**
 * Forked but didn't exec.
 */
public val PF_FORKNOEXEC: CInt = 0x00000040

/**
 * Process policy on mce errors.
 */
public val PF_MCE_PROCESS: CInt = 0x00000080

/**
 * Used super-user privileges.
 */
public val PF_SUPERPRIV: CInt = 0x00000100

/**
 * Dumped core.
 */
public val PF_DUMPCORE: CInt = 0x00000200

/**
 * Killed by a signal.
 */
public val PF_SIGNALED: CInt = 0x00000400

/**
 * Allocating memory to free memory.
 *
 * See `memallocNoreclaimSave()`.
 */
public val PF_MEMALLOC: CInt = 0x00000800

/**
 * `setUser()` noticed that `RLIMIT_NPROC` was exceeded.
 */
public val PF_NPROC_EXCEEDED: CInt = 0x00001000

/**
 * If unset the fpu must be initialized before use.
 */
public val PF_USED_MATH: CInt = 0x00002000

/**
 * Kernel thread cloned from userspace thread.
 */
public val PF_USER_WORKER: CInt = 0x00004000

/**
 * This thread should not be frozen.
 */
public val PF_NOFREEZE: CInt = 0x00008000

/**
 * I am `kswapd`.
 */
public val PF_KSWAPD: CInt = 0x00020000

/**
 * All allocations inherit `GFP_NOFS`.
 *
 * See `memallocNfsSave()`.
 */
public val PF_MEMALLOC_NOFS: CInt = 0x00040000

/**
 * All allocations inherit `GFP_NOIO`.
 *
 * See `memallocNoioSave()`.
 */
public val PF_MEMALLOC_NOIO: CInt = 0x00080000

/**
 * Throttle writes only against the bdi I write to, I am cleaning
 * dirty pages from some other bdi.
 */
public val PF_LOCAL_THROTTLE: CInt = 0x00100000

/**
 * I am a kernel thread.
 */
public val PF_KTHREAD: CInt = 0x00200000

/**
 * Randomize virtual address space.
 */
public val PF_RANDOMIZE: CInt = 0x00400000

/**
 * Userland is not allowed to meddle with `cpusMask`.
 */
public val PF_NO_SETAFFINITY: CInt = 0x04000000

/**
 * Early kill for mce process policy.
 */
public val PF_MCE_EARLY: CInt = 0x08000000

/**
 * Allocations constrained to zones which allow long term pinning.
 *
 * See `memallocPinSave()`.
 */
public val PF_MEMALLOC_PIN: CInt = 0x10000000

/**
 * Plug has ts that needs updating.
 */
public val PF_BLOCK_TS: CInt = 0x20000000

// The used value is the highest possible bit fitting on 32 bits, so directly
// defining it as a signed integer causes the compiler to report an overflow.
// Use instead a private intermediary that assuringly has the correct type and
// cast it where necessary to the wanted final type, which preserves the
// desired information as-is in terms of integer representation.
public val PF_SUSPEND_TASK_UINT: CUint = 0x80000000u

/**
 * This thread called `freezeProcesses()` and should not be frozen.
 */
public val PF_SUSPEND_TASK: CInt = PF_SUSPEND_TASK_UINT.toInt()

public val CLONE_PIDFD: CInt = 0x1000

public val SCHED_FLAG_RESET_ON_FORK: CInt = 0x01

public val SCHED_FLAG_RECLAIM: CInt = 0x02

public val SCHED_FLAG_DL_OVERRUN: CInt = 0x04

public val SCHED_FLAG_KEEP_POLICY: CInt = 0x08

public val SCHED_FLAG_KEEP_PARAMS: CInt = 0x10

public val SCHED_FLAG_UTIL_CLAMP_MIN: CInt = 0x20

public val SCHED_FLAG_UTIL_CLAMP_MAX: CInt = 0x40

// linux/ifXdp.h
public val XDP_SHARED_UMEM: U16 = (1u.toUInt() shl 0).toUShort()

public val XDP_COPY: U16 = (1u.toUInt() shl 1).toUShort()

public val XDP_ZEROCOPY: U16 = (1u.toUInt() shl 2).toUShort()

public val XDP_USE_NEED_WAKEUP: U16 = (1u.toUInt() shl 3).toUShort()

public val XDP_USE_SG: U16 = (1u.toUInt() shl 4).toUShort()

public val XDP_UMEM_UNALIGNED_CHUNK_FLAG: U32 = 1u shl 0

public val XDP_RING_NEED_WAKEUP: U32 = 1u shl 0

public val XDP_MMAP_OFFSETS: CInt = 1

public val XDP_RX_RING: CInt = 2

public val XDP_TX_RING: CInt = 3

public val XDP_UMEM_REG: CInt = 4

public val XDP_UMEM_FILL_RING: CInt = 5

public val XDP_UMEM_COMPLETION_RING: CInt = 6

public val XDP_STATISTICS: CInt = 7

public val XDP_OPTIONS: CInt = 8

public val XDP_OPTIONS_ZEROCOPY: U32 = 1u shl 0

public val XDP_PGOFF_RX_RING: OffT = 0L

public val XDP_PGOFF_TX_RING: OffT = 0x80000000L

public val XDP_UMEM_PGOFF_FILL_RING: CUlonglong = 0x100000000uL

public val XDP_UMEM_PGOFF_COMPLETION_RING: CUlonglong = 0x180000000uL

public val XSK_UNALIGNED_BUF_OFFSET_SHIFT: CInt = 48

public val XSK_UNALIGNED_BUF_ADDR_MASK: CUlonglong = (1uL shl XSK_UNALIGNED_BUF_OFFSET_SHIFT) - 1uL

public val XDP_PKT_CONTD: U32 = 1u shl 0

public val XDP_UMEM_TX_SW_CSUM: U32 = 1u shl 1

public val XDP_UMEM_TX_METADATA_LEN: U32 = 1u shl 2

public val XDP_TXMD_FLAGS_TIMESTAMP: U32 = 1u shl 0

public val XDP_TXMD_FLAGS_CHECKSUM: U32 = 1u shl 1

public val XDP_TX_METADATA: U32 = 1u shl 1

public val SOL_XDP: CInt = 283

// linux/mount.h
public val MOUNT_ATTR_RDONLY: U64 = 0x00000001uL

public val MOUNT_ATTR_NOSUID: U64 = 0x00000002uL

public val MOUNT_ATTR_NODEV: U64 = 0x00000004uL

public val MOUNT_ATTR_NOEXEC: U64 = 0x00000008uL

public val MOUNT_ATTR__ATIME: U64 = 0x00000070uL

public val MOUNT_ATTR_RELATIME: U64 = 0x00000000uL

public val MOUNT_ATTR_NOATIME: U64 = 0x00000010uL

public val MOUNT_ATTR_STRICTATIME: U64 = 0x00000020uL

public val MOUNT_ATTR_NODIRATIME: U64 = 0x00000080uL

public val MOUNT_ATTR_IDMAP: U64 = 0x00100000uL

public val MOUNT_ATTR_NOSYMFOLLOW: U64 = 0x00200000uL

public val MOUNT_ATTR_SIZE_VER0: CInt = 32

public val SCHED_FLAG_KEEP_ALL: CInt = SCHED_FLAG_KEEP_POLICY or SCHED_FLAG_KEEP_PARAMS

public val SCHED_FLAG_UTIL_CLAMP: CInt = SCHED_FLAG_UTIL_CLAMP_MIN or SCHED_FLAG_UTIL_CLAMP_MAX

public val SCHED_FLAG_ALL: CInt = SCHED_FLAG_RESET_ON_FORK or SCHED_FLAG_RECLAIM or SCHED_FLAG_DL_OVERRUN or SCHED_FLAG_KEEP_ALL or SCHED_FLAG_UTIL_CLAMP

// ioctlEventpoll: added in Linux 6.9
public val EPIOCSPARAMS: Ioctl = 0x40088a01uL

public val EPIOCGPARAMS: Ioctl = 0x80088a02uL

// siginfo.h
public val SI_DETHREAD: CInt = -7

public val TRAP_PERF: CInt = 6

public val NS_GET_USERNS: Ioctl = io(NSIO, 0x1u)

public val NS_GET_PARENT: Ioctl = io(NSIO, 0x2u)

public val NS_GET_NSTYPE: Ioctl = io(NSIO, 0x3u)

public val NS_GET_OWNER_UID: Ioctl = io(NSIO, 0x4u)

public val NS_GET_MNTNS_ID: Ioctl = ior<U64>(NSIO, 0x5u)

public val NS_GET_PID_FROM_PIDNS: Ioctl = ior<CInt>(NSIO, 0x6u)

public val NS_GET_TGID_FROM_PIDNS: Ioctl = ior<CInt>(NSIO, 0x7u)

public val NS_GET_PID_IN_PIDNS: Ioctl = ior<CInt>(NSIO, 0x8u)

public val NS_GET_TGID_IN_PIDNS: Ioctl = ior<CInt>(NSIO, 0x9u)

public val NS_MNT_GET_INFO: Ioctl = ior<MntNsInfo>(NSIO, 10u)

public val NS_MNT_GET_NEXT: Ioctl = ior<MntNsInfo>(NSIO, 11u)

public val NS_MNT_GET_PREV: Ioctl = ior<MntNsInfo>(NSIO, 12u)

public val PIDFD_GET_CGROUP_NAMESPACE: Ioctl = io(PIDFS_IOCTL_MAGIC, 1u)

public val PIDFD_GET_IPC_NAMESPACE: Ioctl = io(PIDFS_IOCTL_MAGIC, 2u)

public val PIDFD_GET_MNT_NAMESPACE: Ioctl = io(PIDFS_IOCTL_MAGIC, 3u)

public val PIDFD_GET_NET_NAMESPACE: Ioctl = io(PIDFS_IOCTL_MAGIC, 4u)

public val PIDFD_GET_PID_NAMESPACE: Ioctl = io(PIDFS_IOCTL_MAGIC, 5u)

public val PIDFD_GET_PID_FOR_CHILDREN_NAMESPACE: Ioctl = io(PIDFS_IOCTL_MAGIC, 6u)

public val PIDFD_GET_TIME_NAMESPACE: Ioctl = io(PIDFS_IOCTL_MAGIC, 7u)

public val PIDFD_GET_TIME_FOR_CHILDREN_NAMESPACE: Ioctl = io(PIDFS_IOCTL_MAGIC, 8u)

public val PIDFD_GET_USER_NAMESPACE: Ioctl = io(PIDFS_IOCTL_MAGIC, 9u)

public val PIDFD_GET_UTS_NAMESPACE: Ioctl = io(PIDFS_IOCTL_MAGIC, 10u)

public val PIDFD_GET_INFO: Ioctl = iowr<PidfdInfo>(PIDFS_IOCTL_MAGIC, 11u)

public val TPACKET_HDRLEN: Int = ((8 + TPACKET_ALIGNMENT - 1) and (TPACKET_ALIGNMENT - 1).inv()) + 8

public val TPACKET2_HDRLEN: Int = ((8 + TPACKET_ALIGNMENT - 1) and (TPACKET_ALIGNMENT - 1).inv()) + 8

public val TPACKET3_HDRLEN: Int = ((8 + TPACKET_ALIGNMENT - 1) and (TPACKET_ALIGNMENT - 1).inv()) + 8

public val PTP_CLOCK_GETCAPS: Ioctl = ior<PtpClockCaps>(PTP_CLK_MAGIC, 1u)

public val PTP_EXTTS_REQUEST: Ioctl = iow<PtpExttsRequest>(PTP_CLK_MAGIC, 2u)

public val PTP_PEROUT_REQUEST: Ioctl = iow<PtpPeroutRequest>(PTP_CLK_MAGIC, 3u)

public val PTP_ENABLE_PPS: Ioctl = iow<CInt>(PTP_CLK_MAGIC, 4u)

public val PTP_SYS_OFFSET: Ioctl = iow<PtpSysOffset>(PTP_CLK_MAGIC, 5u)

public val PTP_PIN_GETFUNC: Ioctl = iowr<PtpPinDesc>(PTP_CLK_MAGIC, 6u)

public val PTP_PIN_SETFUNC: Ioctl = iow<PtpPinDesc>(PTP_CLK_MAGIC, 7u)

public val PTP_SYS_OFFSET_PRECISE: Ioctl = iowr<PtpSysOffsetPrecise>(PTP_CLK_MAGIC, 8u)

public val PTP_SYS_OFFSET_EXTENDED: Ioctl = iowr<PtpSysOffsetExtended>(PTP_CLK_MAGIC, 9u)

public val PTP_CLOCK_GETCAPS2: Ioctl = ior<PtpClockCaps>(PTP_CLK_MAGIC, 10u)

public val PTP_EXTTS_REQUEST2: Ioctl = iow<PtpExttsRequest>(PTP_CLK_MAGIC, 11u)

public val PTP_PEROUT_REQUEST2: Ioctl = iow<PtpPeroutRequest>(PTP_CLK_MAGIC, 12u)

public val PTP_ENABLE_PPS2: Ioctl = iow<CInt>(PTP_CLK_MAGIC, 13u)

public val PTP_SYS_OFFSET2: Ioctl = iow<PtpSysOffset>(PTP_CLK_MAGIC, 14u)

public val PTP_PIN_GETFUNC2: Ioctl = iowr<PtpPinDesc>(PTP_CLK_MAGIC, 15u)

public val PTP_PIN_SETFUNC2: Ioctl = iow<PtpPinDesc>(PTP_CLK_MAGIC, 16u)

public val PTP_SYS_OFFSET_PRECISE2: Ioctl = iowr<PtpSysOffsetPrecise>(PTP_CLK_MAGIC, 17u)

public val PTP_SYS_OFFSET_EXTENDED2: Ioctl = iowr<PtpSysOffsetExtended>(PTP_CLK_MAGIC, 18u)

public val SECBIT_NOROOT_LOCKED: CInt = issecureMask(SECURE_NOROOT_LOCKED)

public val SECBIT_NO_SETUID_FIXUP_LOCKED: CInt = issecureMask(SECURE_NO_SETUID_FIXUP_LOCKED)

public val SECBIT_KEEP_CAPS_LOCKED: CInt = issecureMask(SECURE_KEEP_CAPS_LOCKED)

public val SECBIT_NO_CAP_AMBIENT_RAISE_LOCKED: CInt = issecureMask(SECURE_NO_CAP_AMBIENT_RAISE_LOCKED)

public val SECBIT_EXEC_RESTRICT_FILE_LOCKED: CInt = issecureMask(SECURE_EXEC_RESTRICT_FILE_LOCKED)

public val SECBIT_EXEC_DENY_INTERACTIVE_LOCKED: CInt = issecureMask(SECURE_EXEC_DENY_INTERACTIVE_LOCKED)

public val SECURE_ALL_UNPRIVILEGED: CInt = issecureMask(SECURE_EXEC_RESTRICT_FILE) or issecureMask(SECURE_EXEC_DENY_INTERACTIVE)
