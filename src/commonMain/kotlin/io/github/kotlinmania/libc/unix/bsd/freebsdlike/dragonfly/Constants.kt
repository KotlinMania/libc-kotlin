package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public const val RAND_MAX: Int = 0x7fff_ffff

public const val PTHREAD_STACK_MIN: ULong = 16384uL

public const val SIGSTKSZ: ULong = 40960uL

public const val SIGCKPT: Int = 33

public const val SIGCKPTEXIT: Int = 34

public const val CKPT_FREEZE: Int = 0x1

public const val CKPT_THAW: Int = 0x2

public const val MADV_INVAL: Int = 10

public const val MADV_SETMAP: Int = 11

public const val O_CLOEXEC: Int = 0x00020000

public const val O_DIRECTORY: Int = 0x08000000

public const val F_GETLK: Int = 7

public const val F_SETLK: Int = 8

public const val F_SETLKW: Int = 9

public const val F_GETPATH: Int = 19

public const val ENOMEDIUM: Int = 93

public const val ENOTRECOVERABLE: Int = 94

public const val EOWNERDEAD: Int = 95

public const val EASYNC: Int = 99

public const val ELAST: Int = 99

public const val RLIMIT_POSIXLOCKS: Int = 11

public const val RLIM_NLIMITS: ULong = 12uL

public const val Q_GETQUOTA: Int = 0x300

public const val Q_SETQUOTA: Int = 0x400

public const val CTL_UNSPEC: Int = 0

public const val CTL_KERN: Int = 1

public const val CTL_VM: Int = 2

public const val CTL_VFS: Int = 3

public const val CTL_NET: Int = 4

public const val CTL_DEBUG: Int = 5

public const val CTL_HW: Int = 6

public const val CTL_MACHDEP: Int = 7

public const val CTL_USER: Int = 8

public const val CTL_P1003_1B: Int = 9

public const val CTL_LWKT: Int = 10

public const val CTL_MAXID: Int = 11

public const val KERN_OSTYPE: Int = 1

public const val KERN_OSRELEASE: Int = 2

public const val KERN_OSREV: Int = 3

public const val KERN_VERSION: Int = 4

public const val KERN_MAXVNODES: Int = 5

public const val KERN_MAXPROC: Int = 6

public const val KERN_MAXFILES: Int = 7

public const val KERN_ARGMAX: Int = 8

public const val KERN_SECURELVL: Int = 9

public const val KERN_HOSTNAME: Int = 10

public const val KERN_HOSTID: Int = 11

public const val KERN_CLOCKRATE: Int = 12

public const val KERN_VNODE: Int = 13

public const val KERN_PROC: Int = 14

public const val KERN_FILE: Int = 15

public const val KERN_PROF: Int = 16

public const val KERN_POSIX1: Int = 17

public const val KERN_NGROUPS: Int = 18

public const val KERN_JOB_CONTROL: Int = 19

public const val KERN_SAVED_IDS: Int = 20

public const val KERN_BOOTTIME: Int = 21

public const val KERN_NISDOMAINNAME: Int = 22

public const val KERN_UPDATEINTERVAL: Int = 23

public const val KERN_OSRELDATE: Int = 24

public const val KERN_NTP_PLL: Int = 25

public const val KERN_BOOTFILE: Int = 26

public const val KERN_MAXFILESPERPROC: Int = 27

public const val KERN_MAXPROCPERUID: Int = 28

public const val KERN_DUMPDEV: Int = 29

public const val KERN_IPC: Int = 30

public const val KERN_DUMMY: Int = 31

public const val KERN_PS_STRINGS: Int = 32

public const val KERN_USRSTACK: Int = 33

public const val KERN_LOGSIGEXIT: Int = 34

public const val KERN_IOV_MAX: Int = 35

public const val KERN_MAXPOSIXLOCKSPERUID: Int = 36

public const val KERN_MAXID: Int = 37

public const val KERN_PROC_ALL: Int = 0

public const val KERN_PROC_PID: Int = 1

public const val KERN_PROC_PGRP: Int = 2

public const val KERN_PROC_SESSION: Int = 3

public const val KERN_PROC_TTY: Int = 4

public const val KERN_PROC_UID: Int = 5

public const val KERN_PROC_RUID: Int = 6

public const val KERN_PROC_ARGS: Int = 7

public const val KERN_PROC_CWD: Int = 8

public const val KERN_PROC_PATHNAME: Int = 9

public const val KERN_PROC_FLAGMASK: Int = 0x10

public const val KERN_PROC_FLAG_LWP: Int = 0x10

public const val KIPC_MAXSOCKBUF: Int = 1

public const val KIPC_SOCKBUF_WASTE: Int = 2

public const val KIPC_SOMAXCONN: Int = 3

public const val KIPC_MAX_LINKHDR: Int = 4

public const val KIPC_MAX_PROTOHDR: Int = 5

public const val KIPC_MAX_HDR: Int = 6

public const val KIPC_MAX_DATALEN: Int = 7

public const val KIPC_MBSTAT: Int = 8

public const val KIPC_NMBCLUSTERS: Int = 9

public const val HW_MACHINE: Int = 1

public const val HW_MODEL: Int = 2

public const val HW_NCPU: Int = 3

public const val HW_BYTEORDER: Int = 4

public const val HW_PHYSMEM: Int = 5

public const val HW_USERMEM: Int = 6

public const val HW_PAGESIZE: Int = 7

public const val HW_DISKNAMES: Int = 8

public const val HW_DISKSTATS: Int = 9

public const val HW_FLOATINGPT: Int = 10

public const val HW_MACHINE_ARCH: Int = 11

public const val HW_MACHINE_PLATFORM: Int = 12

public const val HW_SENSORS: Int = 13

public const val HW_MAXID: Int = 14

public const val USER_CS_PATH: Int = 1

public const val USER_BC_BASE_MAX: Int = 2

public const val USER_BC_DIM_MAX: Int = 3

public const val USER_BC_SCALE_MAX: Int = 4

public const val USER_BC_STRING_MAX: Int = 5

public const val USER_COLL_WEIGHTS_MAX: Int = 6

public const val USER_EXPR_NEST_MAX: Int = 7

public const val USER_LINE_MAX: Int = 8

public const val USER_RE_DUP_MAX: Int = 9

public const val USER_POSIX2_VERSION: Int = 10

public const val USER_POSIX2_C_BIND: Int = 11

public const val USER_POSIX2_C_DEV: Int = 12

public const val USER_POSIX2_CHAR_TERM: Int = 13

public const val USER_POSIX2_FORT_DEV: Int = 14

public const val USER_POSIX2_FORT_RUN: Int = 15

public const val USER_POSIX2_LOCALEDEF: Int = 16

public const val USER_POSIX2_SW_DEV: Int = 17

public const val USER_POSIX2_UPE: Int = 18

public const val USER_STREAM_MAX: Int = 19

public const val USER_TZNAME_MAX: Int = 20

public const val USER_MAXID: Int = 21

public const val CTL_P1003_1B_ASYNCHRONOUS_IO: Int = 1

public const val CTL_P1003_1B_MAPPED_FILES: Int = 2

public const val CTL_P1003_1B_MEMLOCK: Int = 3

public const val CTL_P1003_1B_MEMLOCK_RANGE: Int = 4

public const val CTL_P1003_1B_MEMORY_PROTECTION: Int = 5

public const val CTL_P1003_1B_MESSAGE_PASSING: Int = 6

public const val CTL_P1003_1B_PRIORITIZED_IO: Int = 7

public const val CTL_P1003_1B_PRIORITY_SCHEDULING: Int = 8

public const val CTL_P1003_1B_REALTIME_SIGNALS: Int = 9

public const val CTL_P1003_1B_SEMAPHORES: Int = 10

public const val CTL_P1003_1B_FSYNC: Int = 11

public const val CTL_P1003_1B_SHARED_MEMORY_OBJECTS: Int = 12

public const val CTL_P1003_1B_SYNCHRONIZED_IO: Int = 13

public const val CTL_P1003_1B_TIMERS: Int = 14

public const val CTL_P1003_1B_AIO_LISTIO_MAX: Int = 15

public const val CTL_P1003_1B_AIO_MAX: Int = 16

public const val CTL_P1003_1B_AIO_PRIO_DELTA_MAX: Int = 17

public const val CTL_P1003_1B_DELAYTIMER_MAX: Int = 18

public const val CTL_P1003_1B_UNUSED1: Int = 19

public const val CTL_P1003_1B_PAGESIZE: Int = 20

public const val CTL_P1003_1B_RTSIG_MAX: Int = 21

public const val CTL_P1003_1B_SEM_NSEMS_MAX: Int = 22

public const val CTL_P1003_1B_SEM_VALUE_MAX: Int = 23

public const val CTL_P1003_1B_SIGQUEUE_MAX: Int = 24

public const val CTL_P1003_1B_TIMER_MAX: Int = 25

public const val CTL_P1003_1B_MAXID: Int = 26

public const val CPUCTL_RSMSR: Int = 0xc0106301.toInt()

public const val CPUCTL_WRMSR: Int = 0xc0106302.toInt()

public const val CPUCTL_CPUID: Int = 0xc0106303.toInt()

public const val CPUCTL_UPDATE: Int = 0xc0106304.toInt()

public const val CPUCTL_MSRSBIT: Int = 0xc0106305.toInt()

public const val CPUCTL_MSRCBIT: Int = 0xc0106306.toInt()

public const val CPUCTL_CPUID_COUNT: Int = 0xc0106307.toInt()

// CPU_SETSIZE = size_of<CpumaskT>() * 8 (computed at the FFI boundary)
public const val EVFILT_READ: Short = -1

public const val EVFILT_WRITE: Short = -2

public const val EVFILT_AIO: Short = -3

public const val EVFILT_VNODE: Short = -4

public const val EVFILT_PROC: Short = -5

public const val EVFILT_SIGNAL: Short = -6

public const val EVFILT_TIMER: Short = -7

public const val EVFILT_EXCEPT: Short = -8

public const val EVFILT_USER: Short = -9

public const val EVFILT_FS: Short = -10

public val EV_ADD: UShort = (0x1).toUShort()

public val EV_DELETE: UShort = (0x2).toUShort()

public val EV_ENABLE: UShort = (0x4).toUShort()

public val EV_DISABLE: UShort = (0x8).toUShort()

public val EV_ONESHOT: UShort = (0x10).toUShort()

public val EV_CLEAR: UShort = (0x20).toUShort()

public val EV_RECEIPT: UShort = (0x40).toUShort()

public val EV_DISPATCH: UShort = (0x80).toUShort()

public val EV_NODATA: UShort = (0x1000).toUShort()

public val EV_FLAG1: UShort = (0x2000).toUShort()

public val EV_ERROR: UShort = (0x4000).toUShort()

public val EV_EOF: UShort = (0x8000).toUShort()

public val EV_HUP: UShort = (0x8000).toUShort()

public val EV_SYSFLAGS: UShort = (0xf000).toUShort()

public const val FIODNAME: ULong = 0x80106678uL

public const val NOTE_TRIGGER: UInt = 0x01000000u

public const val NOTE_FFNOP: UInt = 0x00000000u

public const val NOTE_FFAND: UInt = 0x40000000u

public const val NOTE_FFOR: UInt = 0x80000000u

public const val NOTE_FFCOPY: UInt = 0xc0000000u

public const val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public const val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public const val NOTE_LOWAT: UInt = 0x00000001u

public const val NOTE_OOB: UInt = 0x00000002u

public const val NOTE_DELETE: UInt = 0x00000001u

public const val NOTE_WRITE: UInt = 0x00000002u

public const val NOTE_EXTEND: UInt = 0x00000004u

public const val NOTE_ATTRIB: UInt = 0x00000008u

public const val NOTE_LINK: UInt = 0x00000010u

public const val NOTE_RENAME: UInt = 0x00000020u

public const val NOTE_REVOKE: UInt = 0x00000040u

public const val NOTE_EXIT: UInt = 0x80000000u

public const val NOTE_FORK: UInt = 0x40000000u

public const val NOTE_EXEC: UInt = 0x20000000u

public const val NOTE_PDATAMASK: UInt = 0x000fffffu

public const val NOTE_PCTRLMASK: UInt = 0xf0000000u

public const val NOTE_TRACK: UInt = 0x00000001u

public const val NOTE_TRACKERR: UInt = 0x00000002u

public const val NOTE_CHILD: UInt = 0x00000004u

public const val SO_SNDSPACE: Int = 0x100a

public const val SO_CPUHINT: Int = 0x1030

public const val SO_PASSCRED: Int = 0x4000

public const val PT_FIRSTMACH: Int = 32

public const val PROC_REAP_ACQUIRE: Int = 0x0001

public const val PROC_REAP_RELEASE: Int = 0x0002

public const val PROC_REAP_STATUS: Int = 0x0003

public const val PROC_PDEATHSIG_CTL: Int = 0x0004

public const val PROC_PDEATHSIG_STATUS: Int = 0x0005

public const val IFF_UP: Int = 0x1

public const val IFF_BROADCAST: Int = 0x2

public const val IFF_DEBUG: Int = 0x4

public const val IFF_LOOPBACK: Int = 0x8

public const val IFF_POINTOPOINT: Int = 0x10

public const val IFF_SMART: Int = 0x20

public const val IFF_RUNNING: Int = 0x40

public const val IFF_NOARP: Int = 0x80

public const val IFF_PROMISC: Int = 0x100

public const val IFF_ALLMULTI: Int = 0x200

public const val IFF_OACTIVE_COMPAT: Int = 0x400

public const val IFF_SIMPLEX: Int = 0x800

public const val IFF_LINK0: Int = 0x1000

public const val IFF_LINK1: Int = 0x2000

public const val IFF_LINK2: Int = 0x4000

public const val IFF_ALTPHYS: Int = IFF_LINK2

public const val IFF_MULTICAST: Int = 0x8000

public const val IFF_POLLING_COMPAT: Int = 0x10000

public const val IFF_PPROMISC: Int = 0x20000

public const val IFF_MONITOR: Int = 0x40000

public const val IFF_STATICARP: Int = 0x80000

public const val IFF_NPOLLING: Int = 0x100000

public const val IFF_IDIRECT: Int = 0x200000

public const val IPPROTO_HOPOPTS: Int = 0

public const val IPPROTO_IGMP: Int = 2

public const val IPPROTO_GGP: Int = 3

public const val IPPROTO_IPIP: Int = 4

public const val IPPROTO_ST: Int = 7

public const val IPPROTO_EGP: Int = 8

public const val IPPROTO_PIGP: Int = 9

public const val IPPROTO_RCCMON: Int = 10

public const val IPPROTO_NVPII: Int = 11

public const val IPPROTO_PUP: Int = 12

public const val IPPROTO_ARGUS: Int = 13

public const val IPPROTO_EMCON: Int = 14

public const val IPPROTO_XNET: Int = 15

public const val IPPROTO_CHAOS: Int = 16

public const val IPPROTO_MUX: Int = 18

public const val IPPROTO_MEAS: Int = 19

public const val IPPROTO_HMP: Int = 20

public const val IPPROTO_PRM: Int = 21

public const val IPPROTO_IDP: Int = 22

public const val IPPROTO_TRUNK1: Int = 23

public const val IPPROTO_TRUNK2: Int = 24

public const val IPPROTO_LEAF1: Int = 25

public const val IPPROTO_LEAF2: Int = 26

public const val IPPROTO_RDP: Int = 27

public const val IPPROTO_IRTP: Int = 28

public const val IPPROTO_TP: Int = 29

public const val IPPROTO_BLT: Int = 30

public const val IPPROTO_NSP: Int = 31

public const val IPPROTO_INP: Int = 32

public const val IPPROTO_SEP: Int = 33

public const val IPPROTO_3PC: Int = 34

public const val IPPROTO_IDPR: Int = 35

public const val IPPROTO_XTP: Int = 36

public const val IPPROTO_DDP: Int = 37

public const val IPPROTO_CMTP: Int = 38

public const val IPPROTO_TPXX: Int = 39

public const val IPPROTO_IL: Int = 40

public const val IPPROTO_SDRP: Int = 42

public const val IPPROTO_ROUTING: Int = 43

public const val IPPROTO_FRAGMENT: Int = 44

public const val IPPROTO_IDRP: Int = 45

public const val IPPROTO_RSVP: Int = 46

public const val IPPROTO_GRE: Int = 47

public const val IPPROTO_MHRP: Int = 48

public const val IPPROTO_BHA: Int = 49

public const val IPPROTO_ESP: Int = 50

public const val IPPROTO_AH: Int = 51

public const val IPPROTO_INLSP: Int = 52

public const val IPPROTO_SWIPE: Int = 53

public const val IPPROTO_NHRP: Int = 54

public const val IPPROTO_MOBILE: Int = 55

public const val IPPROTO_TLSP: Int = 56

public const val IPPROTO_SKIP: Int = 57

public const val IPPROTO_NONE: Int = 59

public const val IPPROTO_DSTOPTS: Int = 60

public const val IPPROTO_AHIP: Int = 61

public const val IPPROTO_CFTP: Int = 62

public const val IPPROTO_HELLO: Int = 63

public const val IPPROTO_SATEXPAK: Int = 64

public const val IPPROTO_KRYPTOLAN: Int = 65

public const val IPPROTO_RVD: Int = 66

public const val IPPROTO_IPPC: Int = 67

public const val IPPROTO_ADFS: Int = 68

public const val IPPROTO_SATMON: Int = 69

public const val IPPROTO_VISA: Int = 70

public const val IPPROTO_IPCV: Int = 71

public const val IPPROTO_CPNX: Int = 72

public const val IPPROTO_CPHB: Int = 73

public const val IPPROTO_WSN: Int = 74

public const val IPPROTO_PVP: Int = 75

public const val IPPROTO_BRSATMON: Int = 76

public const val IPPROTO_ND: Int = 77

public const val IPPROTO_WBMON: Int = 78

public const val IPPROTO_WBEXPAK: Int = 79

public const val IPPROTO_EON: Int = 80

public const val IPPROTO_VMTP: Int = 81

public const val IPPROTO_SVMTP: Int = 82

public const val IPPROTO_VINES: Int = 83

public const val IPPROTO_TTP: Int = 84

public const val IPPROTO_IGP: Int = 85

public const val IPPROTO_DGP: Int = 86

public const val IPPROTO_TCF: Int = 87

public const val IPPROTO_IGRP: Int = 88

public const val IPPROTO_OSPFIGP: Int = 89

public const val IPPROTO_SRPC: Int = 90

public const val IPPROTO_LARP: Int = 91

public const val IPPROTO_MTP: Int = 92

public const val IPPROTO_AX25: Int = 93

public const val IPPROTO_IPEIP: Int = 94

public const val IPPROTO_MICP: Int = 95

public const val IPPROTO_SCCSP: Int = 96

public const val IPPROTO_ETHERIP: Int = 97

public const val IPPROTO_ENCAP: Int = 98

public const val IPPROTO_APES: Int = 99

public const val IPPROTO_GMTP: Int = 100

public const val IPPROTO_IPCOMP: Int = 108

public const val IPPROTO_PIM: Int = 103

public const val IPPROTO_CARP: Int = 112

public const val IPPROTO_PGM: Int = 113

public const val IPPROTO_PFSYNC: Int = 240

public const val IPPROTO_DIVERT: Int = 254

public const val IPPROTO_MAX: Int = 256

public const val IPPROTO_DONE: Int = 257

public const val IPPROTO_UNKNOWN: Int = 258

public const val TCP_SIGNATURE_ENABLE: Int = 16

public const val TCP_KEEPINIT: Int = 32

public const val TCP_FASTKEEP: Int = 128

public const val AF_BLUETOOTH: Int = 33

public const val AF_MPLS: Int = 34

public const val AF_IEEE80211: Int = 35

public const val PF_BLUETOOTH: Int = AF_BLUETOOTH

public const val NET_RT_DUMP: Int = 1

public const val NET_RT_FLAGS: Int = 2

public const val NET_RT_IFLIST: Int = 3

public const val NET_RT_MAXID: Int = 4

public const val SOMAXOPT_SIZE: Int = 65536

public const val MSG_UNUSED09: Int = 0x00000200

public const val MSG_NOSIGNAL: Int = 0x00000400

public const val MSG_SYNC: Int = 0x00000800

public const val MSG_CMSG_CLOEXEC: Int = 0x00001000

public const val MSG_FBLOCKING: Int = 0x00010000

public const val MSG_FNONBLOCKING: Int = 0x00020000

public const val MSG_FMASK: Int = 0xFFFF0000.toInt()

public const val MNT_NODEV: Int = 0x00000010

public const val MNT_AUTOMOUNTED: Int = 0x00000020

public const val MNT_TRIM: Int = 0x01000000

public const val MNT_LOCAL: Int = 0x00001000

public const val MNT_QUOTA: Int = 0x00002000

public const val MNT_ROOTFS: Int = 0x00004000

public const val MNT_USER: Int = 0x00008000

public const val MNT_IGNORE: Int = 0x00800000

public const val EMPTY: Short = 0

public const val RUN_LVL: Short = 1

public const val BOOT_TIME: Short = 2

public const val OLD_TIME: Short = 3

public const val NEW_TIME: Short = 4

public const val INIT_PROCESS: Short = 5

public const val LOGIN_PROCESS: Short = 6

public const val USER_PROCESS: Short = 7

public const val DEAD_PROCESS: Short = 8

public const val ACCOUNTING: Short = 9

public const val SIGNATURE: Short = 10

public const val DOWNTIME: Short = 11

public const val UTX_DB_UTMPX: UInt = 0u

public const val UTX_DB_WTMPX: UInt = 1u

public const val UTX_DB_LASTLOG: UInt = 2u

public const val _UTX_LINESIZE: ULong = 32uL

public const val _UTX_USERSIZE: ULong = 32uL

public const val _UTX_IDSIZE: ULong = 4uL

public const val _UTX_HOSTSIZE: ULong = 256uL

public val LC_COLLATE_MASK: Int = 1 shl 0

public val LC_CTYPE_MASK: Int = 1 shl 1

public val LC_MONETARY_MASK: Int = 1 shl 2

public val LC_NUMERIC_MASK: Int = 1 shl 3

public val LC_TIME_MASK: Int = 1 shl 4

public val LC_MESSAGES_MASK: Int = 1 shl 5

public val LC_ALL_MASK: Int = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK

public const val TIOCSIG: ULong = 0x2000745fuL

public const val BTUARTDISC: Int = 0x7

public const val TIOCDCDTIMESTAMP: ULong = 0x40107458uL

public const val TIOCISPTMASTER: ULong = 0x20007455uL

public const val TIOCMODG: ULong = 0x40047403uL

public const val TIOCMODS: ULong = 0x80047404uL

public const val TIOCREMOTE: ULong = 0x80047469uL

public const val TIOCTIMESTAMP: ULong = 0x40107459uL

public const val AT_FDCWD: Int = 0xFFFAFDCD.toInt()

public const val AT_SYMLINK_NOFOLLOW: Int = 1

public const val AT_REMOVEDIR: Int = 2

public const val AT_EACCESS: Int = 4

public const val AT_SYMLINK_FOLLOW: Int = 8

public const val VCHECKPT: ULong = 19uL

public const val _PC_2_SYMLINKS: Int = 22

public const val _PC_TIMESTAMP_RESOLUTION: Int = 23

public const val _CS_PATH: Int = 1

public const val _SC_V7_ILP32_OFF32: Int = 122

public const val _SC_V7_ILP32_OFFBIG: Int = 123

public const val _SC_V7_LP64_OFF64: Int = 124

public const val _SC_V7_LPBIG_OFFBIG: Int = 125

public const val _SC_THREAD_ROBUST_PRIO_INHERIT: Int = 126

public const val _SC_THREAD_ROBUST_PRIO_PROTECT: Int = 127

public const val WCONTINUED: Int = 0x4

public const val WSTOPPED: Int = 0x2

public const val WNOWAIT: Int = 0x8

public const val WEXITED: Int = 0x10

public const val WTRAPPED: Int = 0x20

public const val P_PID: UInt = 0u

public const val P_PGID: UInt = 2u

public const val P_ALL: UInt = 7u

public val RTP_PRIO_REALTIME: UShort = (0).toUShort()

public val RTP_PRIO_NORMAL: UShort = (1).toUShort()

public val RTP_PRIO_IDLE: UShort = (2).toUShort()

public val RTP_PRIO_THREAD: UShort = (3).toUShort()

public const val UF_NOHISTORY: ULong = 0x00000040uL

public const val UF_CACHE: ULong = 0x00000080uL

public const val UF_XLINK: ULong = 0x00000100uL

public const val SF_NOHISTORY: ULong = 0x00400000uL

public const val SF_CACHE: ULong = 0x00800000uL

public const val SF_XLINK: ULong = 0x01000000uL

public const val UTIME_OMIT: Long = -2

public const val UTIME_NOW: Long = -1

public const val MINCORE_SUPER: Int = 0x20

public const val MAXCOMLEN: ULong = 16uL

public const val MAXLOGNAME: ULong = 33uL

public const val NGROUPS: ULong = 16uL

public const val RB_PAUSE: Int = 0x40000

public const val RB_VIDEO: Int = 0x20000000

public const val RTF_CLONING: Int = 0x100

public const val RTF_PRCLONING: Int = 0x10000

public const val RTF_WASCLONED: Int = 0x20000

public const val RTF_MPLSOPS: Int = 0x1000000

public const val RTM_VERSION: Int = 7

public const val RTAX_MPLS1: Int = 8

public const val RTAX_MPLS2: Int = 9

public const val RTAX_MPLS3: Int = 10

public const val RTAX_MAX: Int = 11
