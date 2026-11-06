package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import cmsghdr
import offT

public typealias DevT = UInt

public typealias WcharT = Int

public typealias ClockT = ULong

public typealias InoT = ULong

public typealias LwpidT = Int

public typealias NlinkT = UInt

public typealias BlksizeT = Long

public typealias ClockidT = CUlong

public typealias TimeT = Long

public typealias SusecondsT = Long

public typealias UuidT = Uuid

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias IdtypeT = CUint

public typealias ShmattT = CUint

public typealias MqdT = CInt

public typealias SemT = Sem?

public typealias CpusetT = CpumaskT

public typealias CpuSetT = CpumaskT

public typealias RegisterT = CLong

public typealias UmtxT = CInt

public typealias PthreadBarrierattrT = CInt

public typealias PthreadBarrierT = UintptrT

public typealias PthreadSpinlockT = UintptrT

public typealias SegszT = Int

public typealias VmProtT = UByte

public typealias VmMaptypeT = UByte

public typealias VmInheritT = Byte

public typealias VmSubsysT = CInt

public typealias VmEflagsT = CUint

public typealias VmMapT = CAnonymousVmMap?

public typealias VmMapEntryT = VmMapEntry?

public typealias Pmap = CAnonymousPmap

public val RAND_MAX: CInt = 0x7fffffff

public val PTHREAD_STACK_MIN: SizeT = 16384uL

public val SIGSTKSZ: SizeT = 40960uL

public val SIGCKPT: CInt = 33

public val SIGCKPTEXIT: CInt = 34

public val CKPT_FREEZE: CInt = 0x1

public val CKPT_THAW: CInt = 0x2

public val MADV_INVAL: CInt = 10

public val MADV_SETMAP: CInt = 11

public val O_CLOEXEC: CInt = 0x00020000

public val O_DIRECTORY: CInt = 0x08000000

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val F_GETPATH: CInt = 19

public val ENOMEDIUM: CInt = 93

public val ENOTRECOVERABLE: CInt = 94

public val EOWNERDEAD: CInt = 95

public val EASYNC: CInt = 99

public val ELAST: CInt = 99

public val RLIMIT_POSIXLOCKS: CInt = 11

public val RLIM_NLIMITS: RlimT = 12

public val Q_GETQUOTA: CInt = 0x300

public val Q_SETQUOTA: CInt = 0x400

public val CTL_UNSPEC: CInt = 0

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_VFS: CInt = 3

public val CTL_NET: CInt = 4

public val CTL_DEBUG: CInt = 5

public val CTL_HW: CInt = 6

public val CTL_MACHDEP: CInt = 7

public val CTL_USER: CInt = 8

public val CTL_P1003_1B: CInt = 9

public val CTL_LWKT: CInt = 10

public val CTL_MAXID: CInt = 11

public val KERN_OSTYPE: CInt = 1

public val KERN_OSRELEASE: CInt = 2

public val KERN_OSREV: CInt = 3

public val KERN_VERSION: CInt = 4

public val KERN_MAXVNODES: CInt = 5

public val KERN_MAXPROC: CInt = 6

public val KERN_MAXFILES: CInt = 7

public val KERN_ARGMAX: CInt = 8

public val KERN_SECURELVL: CInt = 9

public val KERN_HOSTNAME: CInt = 10

public val KERN_HOSTID: CInt = 11

public val KERN_CLOCKRATE: CInt = 12

public val KERN_VNODE: CInt = 13

public val KERN_PROC: CInt = 14

public val KERN_FILE: CInt = 15

public val KERN_PROF: CInt = 16

public val KERN_POSIX1: CInt = 17

public val KERN_NGROUPS: CInt = 18

public val KERN_JOB_CONTROL: CInt = 19

public val KERN_SAVED_IDS: CInt = 20

public val KERN_BOOTTIME: CInt = 21

public val KERN_NISDOMAINNAME: CInt = 22

public val KERN_UPDATEINTERVAL: CInt = 23

public val KERN_OSRELDATE: CInt = 24

public val KERN_NTP_PLL: CInt = 25

public val KERN_BOOTFILE: CInt = 26

public val KERN_MAXFILESPERPROC: CInt = 27

public val KERN_MAXPROCPERUID: CInt = 28

public val KERN_DUMPDEV: CInt = 29

public val KERN_IPC: CInt = 30

public val KERN_DUMMY: CInt = 31

public val KERN_PS_STRINGS: CInt = 32

public val KERN_USRSTACK: CInt = 33

public val KERN_LOGSIGEXIT: CInt = 34

public val KERN_IOV_MAX: CInt = 35

public val KERN_MAXPOSIXLOCKSPERUID: CInt = 36

public val KERN_MAXID: CInt = 37

public val KERN_PROC_ALL: CInt = 0

public val KERN_PROC_PID: CInt = 1

public val KERN_PROC_PGRP: CInt = 2

public val KERN_PROC_SESSION: CInt = 3

public val KERN_PROC_TTY: CInt = 4

public val KERN_PROC_UID: CInt = 5

public val KERN_PROC_RUID: CInt = 6

public val KERN_PROC_ARGS: CInt = 7

public val KERN_PROC_CWD: CInt = 8

public val KERN_PROC_PATHNAME: CInt = 9

public val KERN_PROC_FLAGMASK: CInt = 0x10

public val KERN_PROC_FLAG_LWP: CInt = 0x10

public val KIPC_MAXSOCKBUF: CInt = 1

public val KIPC_SOCKBUF_WASTE: CInt = 2

public val KIPC_SOMAXCONN: CInt = 3

public val KIPC_MAX_LINKHDR: CInt = 4

public val KIPC_MAX_PROTOHDR: CInt = 5

public val KIPC_MAX_HDR: CInt = 6

public val KIPC_MAX_DATALEN: CInt = 7

public val KIPC_MBSTAT: CInt = 8

public val KIPC_NMBCLUSTERS: CInt = 9

public val HW_MACHINE: CInt = 1

public val HW_MODEL: CInt = 2

public val HW_NCPU: CInt = 3

public val HW_BYTEORDER: CInt = 4

public val HW_PHYSMEM: CInt = 5

public val HW_USERMEM: CInt = 6

public val HW_PAGESIZE: CInt = 7

public val HW_DISKNAMES: CInt = 8

public val HW_DISKSTATS: CInt = 9

public val HW_FLOATINGPT: CInt = 10

public val HW_MACHINE_ARCH: CInt = 11

public val HW_MACHINE_PLATFORM: CInt = 12

public val HW_SENSORS: CInt = 13

public val HW_MAXID: CInt = 14

public val USER_CS_PATH: CInt = 1

public val USER_BC_BASE_MAX: CInt = 2

public val USER_BC_DIM_MAX: CInt = 3

public val USER_BC_SCALE_MAX: CInt = 4

public val USER_BC_STRING_MAX: CInt = 5

public val USER_COLL_WEIGHTS_MAX: CInt = 6

public val USER_EXPR_NEST_MAX: CInt = 7

public val USER_LINE_MAX: CInt = 8

public val USER_RE_DUP_MAX: CInt = 9

public val USER_POSIX2_VERSION: CInt = 10

public val USER_POSIX2_C_BIND: CInt = 11

public val USER_POSIX2_C_DEV: CInt = 12

public val USER_POSIX2_CHAR_TERM: CInt = 13

public val USER_POSIX2_FORT_DEV: CInt = 14

public val USER_POSIX2_FORT_RUN: CInt = 15

public val USER_POSIX2_LOCALEDEF: CInt = 16

public val USER_POSIX2_SW_DEV: CInt = 17

public val USER_POSIX2_UPE: CInt = 18

public val USER_STREAM_MAX: CInt = 19

public val USER_TZNAME_MAX: CInt = 20

public val USER_MAXID: CInt = 21

public val CTL_P1003_1B_ASYNCHRONOUS_IO: CInt = 1

public val CTL_P1003_1B_MAPPED_FILES: CInt = 2

public val CTL_P1003_1B_MEMLOCK: CInt = 3

public val CTL_P1003_1B_MEMLOCK_RANGE: CInt = 4

public val CTL_P1003_1B_MEMORY_PROTECTION: CInt = 5

public val CTL_P1003_1B_MESSAGE_PASSING: CInt = 6

public val CTL_P1003_1B_PRIORITIZED_IO: CInt = 7

public val CTL_P1003_1B_PRIORITY_SCHEDULING: CInt = 8

public val CTL_P1003_1B_REALTIME_SIGNALS: CInt = 9

public val CTL_P1003_1B_SEMAPHORES: CInt = 10

public val CTL_P1003_1B_FSYNC: CInt = 11

public val CTL_P1003_1B_SHARED_MEMORY_OBJECTS: CInt = 12

public val CTL_P1003_1B_SYNCHRONIZED_IO: CInt = 13

public val CTL_P1003_1B_TIMERS: CInt = 14

public val CTL_P1003_1B_AIO_LISTIO_MAX: CInt = 15

public val CTL_P1003_1B_AIO_MAX: CInt = 16

public val CTL_P1003_1B_AIO_PRIO_DELTA_MAX: CInt = 17

public val CTL_P1003_1B_DELAYTIMER_MAX: CInt = 18

public val CTL_P1003_1B_UNUSED1: CInt = 19

public val CTL_P1003_1B_PAGESIZE: CInt = 20

public val CTL_P1003_1B_RTSIG_MAX: CInt = 21

public val CTL_P1003_1B_SEM_NSEMS_MAX: CInt = 22

public val CTL_P1003_1B_SEM_VALUE_MAX: CInt = 23

public val CTL_P1003_1B_SIGQUEUE_MAX: CInt = 24

public val CTL_P1003_1B_TIMER_MAX: CInt = 25

public val CTL_P1003_1B_MAXID: CInt = 26

public val CPUCTL_RSMSR: CInt = 0xc0106301

public val CPUCTL_WRMSR: CInt = 0xc0106302

public val CPUCTL_CPUID: CInt = 0xc0106303

public val CPUCTL_UPDATE: CInt = 0xc0106304

public val CPUCTL_MSRSBIT: CInt = 0xc0106305

public val CPUCTL_MSRCBIT: CInt = 0xc0106306

public val CPUCTL_CPUID_COUNT: CInt = 0xc0106307

public val CPU_SETSIZE: SizeT = sizeOf<CpumaskT>() * 8uL

public val EVFILT_READ: Short = -1

public val EVFILT_WRITE: Short = -2

public val EVFILT_AIO: Short = -3

public val EVFILT_VNODE: Short = -4

public val EVFILT_PROC: Short = -5

public val EVFILT_SIGNAL: Short = -6

public val EVFILT_TIMER: Short = -7

public val EVFILT_EXCEPT: Short = -8

public val EVFILT_USER: Short = -9

public val EVFILT_FS: Short = -10

public val EV_ADD: UShort = 0x1u

public val EV_DELETE: UShort = 0x2u

public val EV_ENABLE: UShort = 0x4u

public val EV_DISABLE: UShort = 0x8u

public val EV_ONESHOT: UShort = 0x10u

public val EV_CLEAR: UShort = 0x20u

public val EV_RECEIPT: UShort = 0x40u

public val EV_DISPATCH: UShort = 0x80u

public val EV_NODATA: UShort = 0x1000u

public val EV_FLAG1: UShort = 0x2000u

public val EV_ERROR: UShort = 0x4000u

public val EV_EOF: UShort = 0x8000u

public val EV_HUP: UShort = 0x8000u

public val EV_SYSFLAGS: UShort = 0xf000u

public val FIODNAME: CUlong = 0x80106678uL

public val NOTE_TRIGGER: UInt = 0x01000000u

public val NOTE_FFNOP: UInt = 0x00000000u

public val NOTE_FFAND: UInt = 0x40000000u

public val NOTE_FFOR: UInt = 0x80000000u

public val NOTE_FFCOPY: UInt = 0xc0000000u

public val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public val NOTE_LOWAT: UInt = 0x00000001u

public val NOTE_OOB: UInt = 0x00000002u

public val NOTE_DELETE: UInt = 0x00000001u

public val NOTE_WRITE: UInt = 0x00000002u

public val NOTE_EXTEND: UInt = 0x00000004u

public val NOTE_ATTRIB: UInt = 0x00000008u

public val NOTE_LINK: UInt = 0x00000010u

public val NOTE_RENAME: UInt = 0x00000020u

public val NOTE_REVOKE: UInt = 0x00000040u

public val NOTE_EXIT: UInt = 0x80000000u

public val NOTE_FORK: UInt = 0x40000000u

public val NOTE_EXEC: UInt = 0x20000000u

public val NOTE_PDATAMASK: UInt = 0x000fffffu

public val NOTE_PCTRLMASK: UInt = 0xf0000000u

public val NOTE_TRACK: UInt = 0x00000001u

public val NOTE_TRACKERR: UInt = 0x00000002u

public val NOTE_CHILD: UInt = 0x00000004u

public val SO_SNDSPACE: CInt = 0x100a

public val SO_CPUHINT: CInt = 0x1030

public val SO_PASSCRED: CInt = 0x4000

public val PT_FIRSTMACH: CInt = 32

public val PROC_REAP_ACQUIRE: CInt = 0x0001

public val PROC_REAP_RELEASE: CInt = 0x0002

public val PROC_REAP_STATUS: CInt = 0x0003

public val PROC_PDEATHSIG_CTL: CInt = 0x0004

public val PROC_PDEATHSIG_STATUS: CInt = 0x0005

// https://github.com/DragonFlyBSD/DragonFlyBSD/blob/HEAD/sys/net/if.h#L101
public val IFF_UP: CInt = 0x1

// interface is up
public val IFF_BROADCAST: CInt = 0x2

// broadcast address valid
public val IFF_DEBUG: CInt = 0x4

// turn on debugging
public val IFF_LOOPBACK: CInt = 0x8

// is a loopback net
public val IFF_POINTOPOINT: CInt = 0x10

// interface is point-to-point link
public val IFF_SMART: CInt = 0x20

// interface manages own routes
public val IFF_RUNNING: CInt = 0x40

// resources allocated
public val IFF_NOARP: CInt = 0x80

// no address resolution protocol
public val IFF_PROMISC: CInt = 0x100

// receive all packets
public val IFF_ALLMULTI: CInt = 0x200

// receive all multicast packets
public val IFF_OACTIVE_COMPAT: CInt = 0x400

// was transmission in progress
public val IFF_SIMPLEX: CInt = 0x800

// can't hear own transmissions
public val IFF_LINK0: CInt = 0x1000

// per link layer defined bit
public val IFF_LINK1: CInt = 0x2000

// per link layer defined bit
public val IFF_LINK2: CInt = 0x4000

// per link layer defined bit
public val IFF_ALTPHYS: CInt = IFF_LINK2

// use alternate physical connection
public val IFF_MULTICAST: CInt = 0x8000

// supports multicast
// was interface is in polling mode
public val IFF_POLLING_COMPAT: CInt = 0x10000

public val IFF_PPROMISC: CInt = 0x20000

// user-requested promisc mode
public val IFF_MONITOR: CInt = 0x40000

// user-requested monitor mode
public val IFF_STATICARP: CInt = 0x80000

// static ARP
public val IFF_NPOLLING: CInt = 0x100000

// interface is in polling mode
public val IFF_IDIRECT: CInt = 0x200000

// direct input
//
// sys/netinet/in.h
// Protocols (RFC 1700)
// NOTE: These are in addition to the constants defined in src/unix/mod.rs
// IPPROTO_IP defined in src/unix/mod.rs
/**
 * IP6 hop-by-hop options
 */
public val IPPROTO_HOPOPTS: CInt = 0

// IPPROTO_ICMP defined in src/unix/mod.rs
/**
 * group mgmt protocol
 */
public val IPPROTO_IGMP: CInt = 2

/**
 * gateway^2 (deprecated)
 */
public val IPPROTO_GGP: CInt = 3

/**
 * for compatibility
 */
public val IPPROTO_IPIP: CInt = 4

// IPPROTO_TCP defined in src/unix/mod.rs
/**
 * Stream protocol II.
 */
public val IPPROTO_ST: CInt = 7

/**
 * exterior gateway protocol
 */
public val IPPROTO_EGP: CInt = 8

/**
 * private interior gateway
 */
public val IPPROTO_PIGP: CInt = 9

/**
 * BBN RCC Monitoring
 */
public val IPPROTO_RCCMON: CInt = 10

/**
 * network voice protocol
 */
public val IPPROTO_NVPII: CInt = 11

/**
 * pup
 */
public val IPPROTO_PUP: CInt = 12

/**
 * Argus
 */
public val IPPROTO_ARGUS: CInt = 13

/**
 * EMCON
 */
public val IPPROTO_EMCON: CInt = 14

/**
 * Cross Net Debugger
 */
public val IPPROTO_XNET: CInt = 15

/**
 * Chaos
 */
public val IPPROTO_CHAOS: CInt = 16

// IPPROTO_UDP defined in src/unix/mod.rs
/**
 * Multiplexing
 */
public val IPPROTO_MUX: CInt = 18

/**
 * DCN Measurement Subsystems
 */
public val IPPROTO_MEAS: CInt = 19

/**
 * Host Monitoring
 */
public val IPPROTO_HMP: CInt = 20

/**
 * Packet Radio Measurement
 */
public val IPPROTO_PRM: CInt = 21

/**
 * xns idp
 */
public val IPPROTO_IDP: CInt = 22

/**
 * Trunk-1
 */
public val IPPROTO_TRUNK1: CInt = 23

/**
 * Trunk-2
 */
public val IPPROTO_TRUNK2: CInt = 24

/**
 * Leaf-1
 */
public val IPPROTO_LEAF1: CInt = 25

/**
 * Leaf-2
 */
public val IPPROTO_LEAF2: CInt = 26

/**
 * Reliable Data
 */
public val IPPROTO_RDP: CInt = 27

/**
 * Reliable Transaction
 */
public val IPPROTO_IRTP: CInt = 28

/**
 * tp-4 w/ class negotiation
 */
public val IPPROTO_TP: CInt = 29

/**
 * Bulk Data Transfer
 */
public val IPPROTO_BLT: CInt = 30

/**
 * Network Services
 */
public val IPPROTO_NSP: CInt = 31

/**
 * Merit Internodal
 */
public val IPPROTO_INP: CInt = 32

/**
 * Sequential Exchange
 */
public val IPPROTO_SEP: CInt = 33

/**
 * Third Party Connect
 */
public val IPPROTO_3PC: CInt = 34

/**
 * InterDomain Policy Routing
 */
public val IPPROTO_IDPR: CInt = 35

/**
 * XTP
 */
public val IPPROTO_XTP: CInt = 36

/**
 * Datagram Delivery
 */
public val IPPROTO_DDP: CInt = 37

/**
 * Control Message Transport
 */
public val IPPROTO_CMTP: CInt = 38

/**
 * TP++ Transport
 */
public val IPPROTO_TPXX: CInt = 39

/**
 * IL transport protocol
 */
public val IPPROTO_IL: CInt = 40

// IPPROTO_IPV6 defined in src/unix/mod.rs
/**
 * Source Demand Routing
 */
public val IPPROTO_SDRP: CInt = 42

/**
 * IP6 routing header
 */
public val IPPROTO_ROUTING: CInt = 43

/**
 * IP6 fragmentation header
 */
public val IPPROTO_FRAGMENT: CInt = 44

/**
 * InterDomain Routing
 */
public val IPPROTO_IDRP: CInt = 45

/**
 * resource reservation
 */
public val IPPROTO_RSVP: CInt = 46

/**
 * General Routing Encap.
 */
public val IPPROTO_GRE: CInt = 47

/**
 * Mobile Host Routing
 */
public val IPPROTO_MHRP: CInt = 48

/**
 * BHA
 */
public val IPPROTO_BHA: CInt = 49

/**
 * IP6 Encap Sec. Payload
 */
public val IPPROTO_ESP: CInt = 50

/**
 * IP6 Auth Header
 */
public val IPPROTO_AH: CInt = 51

/**
 * Integ. Net Layer Security
 */
public val IPPROTO_INLSP: CInt = 52

/**
 * IP with encryption
 */
public val IPPROTO_SWIPE: CInt = 53

/**
 * Next Hop Resolution
 */
public val IPPROTO_NHRP: CInt = 54

/**
 * IP Mobility
 */
public val IPPROTO_MOBILE: CInt = 55

/**
 * Transport Layer Security
 */
public val IPPROTO_TLSP: CInt = 56

/**
 * SKIP
 */
public val IPPROTO_SKIP: CInt = 57

// IPPROTO_ICMPV6 defined in src/unix/mod.rs
/**
 * IP6 no next header
 */
public val IPPROTO_NONE: CInt = 59

/**
 * IP6 destination option
 */
public val IPPROTO_DSTOPTS: CInt = 60

/**
 * any host internal protocol
 */
public val IPPROTO_AHIP: CInt = 61

/**
 * CFTP
 */
public val IPPROTO_CFTP: CInt = 62

/**
 * "hello" routing protocol
 */
public val IPPROTO_HELLO: CInt = 63

/**
 * SATNET/Backroom EXPAK
 */
public val IPPROTO_SATEXPAK: CInt = 64

/**
 * Kryptolan
 */
public val IPPROTO_KRYPTOLAN: CInt = 65

/**
 * Remote Virtual Disk
 */
public val IPPROTO_RVD: CInt = 66

/**
 * Pluribus Packet Core
 */
public val IPPROTO_IPPC: CInt = 67

/**
 * Any distributed FS
 */
public val IPPROTO_ADFS: CInt = 68

/**
 * Satnet Monitoring
 */
public val IPPROTO_SATMON: CInt = 69

/**
 * VISA Protocol
 */
public val IPPROTO_VISA: CInt = 70

/**
 * Packet Core Utility
 */
public val IPPROTO_IPCV: CInt = 71

/**
 * Comp. Prot. Net. Executive
 */
public val IPPROTO_CPNX: CInt = 72

/**
 * Comp. Prot. HeartBeat
 */
public val IPPROTO_CPHB: CInt = 73

/**
 * Wang Span Network
 */
public val IPPROTO_WSN: CInt = 74

/**
 * Packet Video Protocol
 */
public val IPPROTO_PVP: CInt = 75

/**
 * BackRoom SATNET Monitoring
 */
public val IPPROTO_BRSATMON: CInt = 76

/**
 * Sun net disk proto (temp.)
 */
public val IPPROTO_ND: CInt = 77

/**
 * WIDEBAND Monitoring
 */
public val IPPROTO_WBMON: CInt = 78

/**
 * WIDEBAND EXPAK
 */
public val IPPROTO_WBEXPAK: CInt = 79

/**
 * ISO cnlp
 */
public val IPPROTO_EON: CInt = 80

/**
 * VMTP
 */
public val IPPROTO_VMTP: CInt = 81

/**
 * Secure VMTP
 */
public val IPPROTO_SVMTP: CInt = 82

/**
 * Banyon VINES
 */
public val IPPROTO_VINES: CInt = 83

/**
 * TTP
 */
public val IPPROTO_TTP: CInt = 84

/**
 * NSFNET-IGP
 */
public val IPPROTO_IGP: CInt = 85

/**
 * dissimilar gateway prot.
 */
public val IPPROTO_DGP: CInt = 86

/**
 * TCF
 */
public val IPPROTO_TCF: CInt = 87

/**
 * Cisco/GXS IGRP
 */
public val IPPROTO_IGRP: CInt = 88

/**
 * OSPFIGP
 */
public val IPPROTO_OSPFIGP: CInt = 89

/**
 * Strite RPC protocol
 */
public val IPPROTO_SRPC: CInt = 90

/**
 * Locus Address Resoloution
 */
public val IPPROTO_LARP: CInt = 91

/**
 * Multicast Transport
 */
public val IPPROTO_MTP: CInt = 92

/**
 * AX.25 Frames
 */
public val IPPROTO_AX25: CInt = 93

/**
 * IP encapsulated in IP
 */
public val IPPROTO_IPEIP: CInt = 94

/**
 * Mobile Int.ing control
 */
public val IPPROTO_MICP: CInt = 95

/**
 * Semaphore Comm. security
 */
public val IPPROTO_SCCSP: CInt = 96

/**
 * Ethernet IP encapsulation
 */
public val IPPROTO_ETHERIP: CInt = 97

/**
 * encapsulation header
 */
public val IPPROTO_ENCAP: CInt = 98

/**
 * any private encr. scheme
 */
public val IPPROTO_APES: CInt = 99

/**
 * GMTP
 */
public val IPPROTO_GMTP: CInt = 100

/**
 * payload compression (IPComp)
 */
public val IPPROTO_IPCOMP: CInt = 108

// 101-254: Partly Unassigned
/**
 * Protocol Independent Mcast
 */
public val IPPROTO_PIM: CInt = 103

/**
 * CARP
 */
public val IPPROTO_CARP: CInt = 112

/**
 * PGM
 */
public val IPPROTO_PGM: CInt = 113

/**
 * PFSYNC
 */
public val IPPROTO_PFSYNC: CInt = 240

// 255: Reserved
// BSD Private, local use, namespace incursion, no longer used
/**
 * divert pseudo-protocol
 */
public val IPPROTO_DIVERT: CInt = 254

public val IPPROTO_MAX: CInt = 256

/**
 * last return value of *_input(), meaning "all job for this pkt is done".
 */
public val IPPROTO_DONE: CInt = 257

/**
 * Used by RSS: the layer3 protocol is unknown
 */
public val IPPROTO_UNKNOWN: CInt = 258

// sys/netinet/tcp.h
public val TCP_SIGNATURE_ENABLE: CInt = 16

public val TCP_KEEPINIT: CInt = 32

public val TCP_FASTKEEP: CInt = 128

public val AF_BLUETOOTH: CInt = 33

public val AF_MPLS: CInt = 34

public val AF_IEEE80211: CInt = 35

public val PF_BLUETOOTH: CInt = AF_BLUETOOTH

public val NET_RT_DUMP: CInt = 1

public val NET_RT_FLAGS: CInt = 2

public val NET_RT_IFLIST: CInt = 3

public val NET_RT_MAXID: CInt = 4

public val SOMAXOPT_SIZE: CInt = 65536

public val MSG_UNUSED09: CInt = 0x00000200

public val MSG_NOSIGNAL: CInt = 0x00000400

public val MSG_SYNC: CInt = 0x00000800

public val MSG_CMSG_CLOEXEC: CInt = 0x00001000

public val MSG_FBLOCKING: CInt = 0x00010000

public val MSG_FNONBLOCKING: CInt = 0x00020000

public val MSG_FMASK: CInt = 0xFFFF0000

// sys/mount.h
public val MNT_NODEV: CInt = 0x00000010

public val MNT_AUTOMOUNTED: CInt = 0x00000020

public val MNT_TRIM: CInt = 0x01000000

public val MNT_LOCAL: CInt = 0x00001000

public val MNT_QUOTA: CInt = 0x00002000

public val MNT_ROOTFS: CInt = 0x00004000

public val MNT_USER: CInt = 0x00008000

public val MNT_IGNORE: CInt = 0x00800000

// utmpx entry types
public val EMPTY: CShort = 0

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val OLD_TIME: CShort = 3

public val NEW_TIME: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val ACCOUNTING: CShort = 9

public val SIGNATURE: CShort = 10

public val DOWNTIME: CShort = 11

// utmpx database types
public val UTX_DB_UTMPX: CUint = 0u

public val UTX_DB_WTMPX: CUint = 1u

public val UTX_DB_LASTLOG: CUint = 2u

public val UTX_LINESIZE: Int = 32

public val UTX_USERSIZE: Int = 32

public val UTX_IDSIZE: Int = 4

public val UTX_HOSTSIZE: Int = 256

public val LC_COLLATE_MASK: CInt = 1 shl 0

public val LC_CTYPE_MASK: CInt = 1 shl 1

public val LC_MONETARY_MASK: CInt = 1 shl 2

public val LC_NUMERIC_MASK: CInt = 1 shl 3

public val LC_TIME_MASK: CInt = 1 shl 4

public val LC_MESSAGES_MASK: CInt = 1 shl 5

public val LC_ALL_MASK: CInt = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK

public val TIOCSIG: CUlong = 0x2000745fuL

public val BTUARTDISC: CInt = 0x7

public val TIOCDCDTIMESTAMP: CUlong = 0x40107458uL

public val TIOCISPTMASTER: CUlong = 0x20007455uL

public val TIOCMODG: CUlong = 0x40047403uL

public val TIOCMODS: CUlong = 0x80047404uL

public val TIOCREMOTE: CUlong = 0x80047469uL

public val TIOCTIMESTAMP: CUlong = 0x40107459uL

// Constants used by "at" family of system calls.
public val AT_FDCWD: CInt = 0xFFFAFDCD

// invalid file descriptor
public val AT_SYMLINK_NOFOLLOW: CInt = 1

public val AT_REMOVEDIR: CInt = 2

public val AT_EACCESS: CInt = 4

public val AT_SYMLINK_FOLLOW: CInt = 8

public val VCHECKPT: Int = 19

public val PC_2_SYMLINKS: CInt = 22

public val PC_TIMESTAMP_RESOLUTION: CInt = 23

public val CS_PATH: CInt = 1

public val SC_V7_ILP32_OFF32: CInt = 122

public val SC_V7_ILP32_OFFBIG: CInt = 123

public val SC_V7_LP64_OFF64: CInt = 124

public val SC_V7_LPBIG_OFFBIG: CInt = 125

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 126

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 127

public val WCONTINUED: CInt = 0x4

public val WSTOPPED: CInt = 0x2

public val WNOWAIT: CInt = 0x8

public val WEXITED: CInt = 0x10

public val WTRAPPED: CInt = 0x20

// Similar to FreeBSD, only the standardized ones are exposed.
// There are more.
public val P_PID: IdtypeT = 0u

public val P_PGID: IdtypeT = 2u

public val P_ALL: IdtypeT = 7u

// Values for struct rtprio (type_ field)
public val RTP_PRIO_REALTIME: CUshort = 0u

public val RTP_PRIO_NORMAL: CUshort = 1u

public val RTP_PRIO_IDLE: CUshort = 2u

public val RTP_PRIO_THREAD: CUshort = 3u

// Flags for chflags(2)
public val UF_NOHISTORY: CUlong = 0x00000040uL

public val UF_CACHE: CUlong = 0x00000080uL

public val UF_XLINK: CUlong = 0x00000100uL

public val SF_NOHISTORY: CUlong = 0x00400000uL

public val SF_CACHE: CUlong = 0x00800000uL

public val SF_XLINK: CUlong = 0x01000000uL

// timespec constants
public val UTIME_OMIT: CLong = -2L

public val UTIME_NOW: CLong = -1L

public val MINCORE_SUPER: CInt = 0x20

// kinfoProc constants
public val MAXCOMLEN: Int = 16

public val MAXLOGNAME: Int = 33

public val NGROUPS: Int = 16

public val RB_PAUSE: CInt = 0x40000

public val RB_VIDEO: CInt = 0x20000000

// net/route.h
public val RTF_CLONING: CInt = 0x100

public val RTF_PRCLONING: CInt = 0x10000

public val RTF_WASCLONED: CInt = 0x20000

public val RTF_MPLSOPS: CInt = 0x1000000

public val RTM_VERSION: CInt = 7

public val RTAX_MPLS1: CInt = 8

public val RTAX_MPLS2: CInt = 9

public val RTAX_MPLS3: CInt = 10

public val RTAX_MAX: CInt = 11

public fun cmsgAlign(n: Int): Int {
    return (n + (sizeOf<CLong>() - 1)) and (sizeOf<CLong>() - 1).inv()
}

public fun errnoLocation(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("__errno_location", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
}

public fun setgrent() {
    LibcDynamicFfi.invoke("setgrent", -1, longArrayOf())
}

public fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt {
    return LibcDynamicFfi.invoke("mprotect", -1, longArrayOf(addr?.value ?: 0L, len.toLong(), prot.toLong())).toInt()
}

public fun setutxdb(type: CUint, file: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("setutxdb", -1, longArrayOf(type.toLong(), file?.value ?: 0L)).toInt()
}

public fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("aio_waitcomplete", -1, longArrayOf(iocbp?.value ?: 0L, timeout?.value ?: 0L)).toInt()
}

public fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("devname_r", -1, longArrayOf(dev.toLong(), mode.toLong(), buf?.value ?: 0L, len.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt {
    return LibcDynamicFfi.invoke("waitid", -1, longArrayOf(idtype.toLong(), id.toLong(), infop?.value ?: 0L, options.toLong())).toInt()
}

public fun freelocale(loc: LocaleT) {
    LibcDynamicFfi.invoke("freelocale", -1, longArrayOf(loc?.value ?: 0L))
}

public fun lwpRtprio(function: CInt, pid: PidT, lwpid: LwpidT, rtp: Rtprio?): CInt {
    return LibcDynamicFfi.invoke("lwp_rtprio", -1, longArrayOf(function.toLong(), pid.toLong(), lwpid.toLong(), rtp?.value ?: 0L)).toInt()
}

public fun statfs(path: String?, buf: Statfs?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("statfs", -1, longArrayOf(__cstr_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun fstatfs(fd: CInt, buf: Statfs?): CInt {
    return LibcDynamicFfi.invoke("fstatfs", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun uname(buf: Utsname?): CInt {
    return LibcDynamicFfi.invoke("uname", -1, longArrayOf(buf?.value ?: 0L)).toInt()
}

public fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmem", -1, longArrayOf(haystack?.value ?: 0L, haystacklen.toLong(), needle?.value ?: 0L, needlelen.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pthreadSpinInit(lock: UintptrT?, pshared: CInt): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_init", -1, longArrayOf(__slot_0, pshared.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinDestroy(lock: UintptrT?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_destroy", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinLock(lock: UintptrT?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_lock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinTrylock(lock: UintptrT?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_trylock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadSpinUnlock(lock: UintptrT?): CInt {
    val __slot_0 = if (lock == null) 0L else LibcDynamicFfi.allocScalarSlot(lock.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_spin_unlock", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpumaskT?): CInt {
    return LibcDynamicFfi.invoke("sched_getaffinity", -1, longArrayOf(pid.toLong(), cpusetsize.toLong(), mask?.value ?: 0L)).toInt()
}

public fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpumaskT?): CInt {
    return LibcDynamicFfi.invoke("sched_setaffinity", -1, longArrayOf(pid.toLong(), cpusetsize.toLong(), mask?.value ?: 0L)).toInt()
}

public fun schedGetcpu(): CInt {
    return LibcDynamicFfi.invoke("sched_getcpu", -1, longArrayOf()).toInt()
}

public fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
    val __cstr_0 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        LibcDynamicFfi.invoke("setproctitle", 1, longArrayOf(__cstr_0) + variadicArgs)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt {
    return LibcDynamicFfi.invoke("shmget", -1, longArrayOf(key.toLong(), size.toLong(), shmflg.toLong())).toInt()
}

public fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("shmat", -1, longArrayOf(shmid.toLong(), shmaddr?.value ?: 0L, shmflg.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun shmdt(shmaddr: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("shmdt", -1, longArrayOf(shmaddr?.value ?: 0L)).toInt()
}

public fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt {
    return LibcDynamicFfi.invoke("shmctl", -1, longArrayOf(shmid.toLong(), cmd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("procctl", -1, longArrayOf(idtype.toLong(), id.toLong(), cmd.toLong(), data?.value ?: 0L)).toInt()
}

public fun updwtmpx(file: String?, ut: Utmpx?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("updwtmpx", -1, longArrayOf(__cstr_0, ut?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): Lastlogx? {
    val __cstr_0 = if (fname == null) 0L else LibcDynamicFfi.allocUtf8CString(fname)
    try {
        val rawRet = LibcDynamicFfi.invoke("getlastlogx", -1, longArrayOf(__cstr_0, uid.toLong(), ll?.value ?: 0L))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun updlastlogx(fname: String?, uid: UidT, ll: Lastlogx?): CInt {
    val __cstr_0 = if (fname == null) 0L else LibcDynamicFfi.allocUtf8CString(fname)
    try {
        return LibcDynamicFfi.invoke("updlastlogx", -1, longArrayOf(__cstr_0, uid.toLong(), ll?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getutxuser(name: String?): Utmpx {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        LibcDynamicFfi.invoke("getutxuser", -1, longArrayOf(__cstr_0))
        return null as Utmpx
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun utmpxname(file: String?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("utmpxname", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun sysCheckpoint(tpe: CInt, fd: CInt, pid: PidT, retval: CInt): CInt {
    return LibcDynamicFfi.invoke("sys_checkpoint", -1, longArrayOf(tpe.toLong(), fd.toLong(), pid.toLong(), retval.toLong())).toInt()
}

public fun umtxSleep(ptr: CInt?, value: CInt, timeout: CInt): CInt {
    val __slot_0 = if (ptr == null) 0L else LibcDynamicFfi.allocScalarSlot(ptr.toLong())
    try {
        return LibcDynamicFfi.invoke("umtx_sleep", -1, longArrayOf(__slot_0, value.toLong(), timeout.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun umtxWakeup(ptr: CInt?, count: CInt): CInt {
    val __slot_0 = if (ptr == null) 0L else LibcDynamicFfi.allocScalarSlot(ptr.toLong())
    try {
        return LibcDynamicFfi.invoke("umtx_wakeup", -1, longArrayOf(__slot_0, count.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun dirname(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("dirname", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun basename(path: COpaquePointer?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("basename", -1, longArrayOf(path?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getmntinfo", -1, longArrayOf(mntbufp?.value ?: 0L, flags.toLong())).toInt()
}

public fun getmntvinfo(mntbufp: COpaquePointer?, mntvbufp: COpaquePointer?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("getmntvinfo", -1, longArrayOf(mntbufp?.value ?: 0L, mntvbufp?.value ?: 0L, flags.toLong())).toInt()
}

public fun closefrom(lowfd: CInt): CInt {
    return LibcDynamicFfi.invoke("closefrom", -1, longArrayOf(lowfd.toLong())).toInt()
}

public fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_cancel", -1, longArrayOf(fd.toLong(), aiocbp?.value ?: 0L)).toInt()
}

public fun aioError(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_error", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_fsync", -1, longArrayOf(op.toLong(), aiocbp?.value ?: 0L)).toInt()
}

public fun aioRead(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_read", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun aioReturn(aiocbp: Aiocb?): SsizeT {
    return LibcDynamicFfi.invoke("aio_return", -1, longArrayOf(aiocbp?.value ?: 0L))
}

public fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt {
    return LibcDynamicFfi.invoke("aio_suspend", -1, longArrayOf(aiocbList?.value ?: 0L, nitems.toLong(), timeout?.value ?: 0L)).toInt()
}

public fun aioWrite(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_write", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("lio_listio", -1, longArrayOf(mode.toLong(), aiocbList?.value ?: 0L, nitems.toLong(), sevp?.value ?: 0L)).toInt()
}

public fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("reallocf", -1, longArrayOf(ptr?.value ?: 0L, size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun freezero(ptr: COpaquePointer?, size: SizeT) {
    LibcDynamicFfi.invoke("freezero", -1, longArrayOf(ptr?.value ?: 0L, size.toLong()))
}

public fun kvmVmMapEntryFirst(kvm: KvmT?, map: VmMapT, entry: VmMapEntryT): VmMapEntryT {
    val rawRet = LibcDynamicFfi.invoke("kvm_vm_map_entry_first", -1, longArrayOf(kvm?.value ?: 0L, map?.value ?: 0L, entry?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun kvmVmMapEntryNext(kvm: KvmT?, map: VmMapEntryT, entry: VmMapEntryT): VmMapEntryT {
    val rawRet = LibcDynamicFfi.invoke("kvm_vm_map_entry_next", -1, longArrayOf(kvm?.value ?: 0L, map?.value ?: 0L, entry?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}
