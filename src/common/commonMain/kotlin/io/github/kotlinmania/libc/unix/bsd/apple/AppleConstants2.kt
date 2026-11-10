package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort

public val SIGEV_SIGNAL: CInt = 1

public val SIGEV_THREAD: CInt = 3

public val AIO_CANCELED: CInt = 2

public val AIO_NOTCANCELED: CInt = 4

public val AIO_ALLDONE: CInt = 1

public val AIO_LISTIO_MAX: CInt = 16

public val LIO_NOP: CInt = 0

public val LIO_WRITE: CInt = 2

public val LIO_READ: CInt = 1

public val LIO_WAIT: CInt = 2

public val LIO_NOWAIT: CInt = 1

public val WEXITED: CInt = 0x00000004

public val WSTOPPED: CInt = 0x00000008

public val WCONTINUED: CInt = 0x00000010

public val WNOWAIT: CInt = 0x00000020

public val P_ALL: IdtypeT = 0u

public val P_PID: IdtypeT = 1u

public val P_PGID: IdtypeT = 2u

public val UTIME_OMIT: CLong = -2L

public val UTIME_NOW: CLong = -1L

public val XATTR_NOFOLLOW: CInt = 0x0001

public val XATTR_CREATE: CInt = 0x0002

public val XATTR_REPLACE: CInt = 0x0004

public val XATTR_NOSECURITY: CInt = 0x0008

public val XATTR_NODEFAULT: CInt = 0x0010

public val XATTR_SHOWCOMPRESSION: CInt = 0x0020

public val NET_RT_IFLIST2: CInt = 0x0006

// net/route.h
public val RTF_DELCLONE: CInt = 0x80

public val RTF_CLONING: CInt = 0x100

public val RTF_XRESOLVE: CInt = 0x200

public val RTF_LLINFO: CInt = 0x400

public val RTF_NOIFREF: CInt = 0x2000

public val RTF_PRCLONING: CInt = 0x10000

public val RTF_WASCLONED: CInt = 0x20000

public val RTF_PROTO3: CInt = 0x40000

public val RTF_PINNED: CInt = 0x100000

public val RTF_LOCAL: CInt = 0x200000

public val RTF_BROADCAST: CInt = 0x400000

public val RTF_MULTICAST: CInt = 0x800000

public val RTF_IFSCOPE: CInt = 0x1000000

public val RTF_CONDEMNED: CInt = 0x2000000

public val RTF_IFREF: CInt = 0x4000000

public val RTF_PROXY: CInt = 0x8000000

public val RTF_ROUTER: CInt = 0x10000000

public val RTF_DEAD: CInt = 0x20000000

public val RTF_GLOBAL: CInt = 0x40000000

public val RTM_VERSION: CInt = 5

// Message types
public val RTM_LOCK: CInt = 0x8

public val RTM_OLDADD: CInt = 0x9

public val RTM_OLDDEL: CInt = 0xa

public val RTM_RESOLVE: CInt = 0xb

public val RTM_NEWADDR: CInt = 0xc

public val RTM_DELADDR: CInt = 0xd

public val RTM_IFINFO: CInt = 0xe

public val RTM_NEWMADDR: CInt = 0xf

public val RTM_DELMADDR: CInt = 0x10

public val RTM_IFINFO2: CInt = 0x12

public val RTM_NEWMADDR2: CInt = 0x13

public val RTM_GET2: CInt = 0x14

// Bitmask values for rtmInits and rmxLocks.
public val RTV_MTU: CInt = 0x1

public val RTV_HOPCOUNT: CInt = 0x2

public val RTV_EXPIRE: CInt = 0x4

public val RTV_RPIPE: CInt = 0x8

public val RTV_SPIPE: CInt = 0x10

public val RTV_SSTHRESH: CInt = 0x20

public val RTV_RTT: CInt = 0x40

public val RTV_RTTVAR: CInt = 0x80

public val RTAX_MAX: CInt = 8

public val KERN_PROCARGS2: CInt = 49

public val PROC_PIDTASKALLINFO: CInt = 2

public val PROC_PIDTBSDINFO: CInt = 3

public val PROC_PIDTASKINFO: CInt = 4

public val PROC_PIDTHREADINFO: CInt = 5

public val PROC_PIDVNODEPATHINFO: CInt = 9

public val PROC_PIDPATHINFO_MAXSIZE: CInt = 4096

public val PROC_PIDLISTFDS: CInt = 1

public val PROX_FDTYPE_ATALK: CInt = 0

public val PROX_FDTYPE_VNODE: CInt = 1

public val PROX_FDTYPE_SOCKET: CInt = 2

public val PROX_FDTYPE_PSHM: CInt = 3

public val PROX_FDTYPE_PSEM: CInt = 4

public val PROX_FDTYPE_KQUEUE: CInt = 5

public val PROX_FDTYPE_PIPE: CInt = 6

public val PROX_FDTYPE_FSEVENTS: CInt = 7

public val PROX_FDTYPE_NETPOLICY: CInt = 9

public val PROX_FDTYPE_CHANNEL: CInt = 10

public val PROX_FDTYPE_NEXUS: CInt = 11

public val PROC_CSM_ALL: CUint = 0x0001u

public val PROC_CSM_NOSMT: CUint = 0x0002u

public val PROC_CSM_TECS: CUint = 0x0004u

public val MAXCOMLEN: Int = 16

public val MAXTHREADNAMESIZE: Int = 64

public val XUCRED_VERSION: CUint = 0u

public val LC_SEGMENT: UInt = 0x1u

public val LC_SEGMENT_64: UInt = 0x19u

public val MH_MAGIC: UInt = 0xfeedfaceu

public val MH_MAGIC_64: UInt = 0xfeedfacfu

// net/ifUtun.h
public val UTUN_OPT_FLAGS: CInt = 1

public val UTUN_OPT_IFNAME: CInt = 2

// net/bpf.h
public val DLT_NULL: CUint = 0u

// no link-layer encapsulation
public val DLT_EN10MB: CUint = 1u

// Ethernet (10Mb)
public val DLT_EN3MB: CUint = 2u

// Experimental Ethernet (3Mb)
public val DLT_AX25: CUint = 3u

// Amateur Radio AX.25
public val DLT_PRONET: CUint = 4u

// Proteon ProNET Token Ring
public val DLT_CHAOS: CUint = 5u

// Chaos
public val DLT_IEEE802: CUint = 6u

// IEEE 802 Networks
public val DLT_ARCNET: CUint = 7u

// ARCNET
public val DLT_SLIP: CUint = 8u

// Serial Line IP
public val DLT_PPP: CUint = 9u

// Point-to-point Protocol
public val DLT_FDDI: CUint = 10u

// FDDI
public val DLT_ATM_RFC1483: CUint = 11u

// LLC/SNAP encapsulated atm
public val DLT_RAW: CUint = 12u

// raw IP
public val DLT_LOOP: CUint = 108u

// https://github.com/apple/darwin-xnu/blob/HEAD/bsd/net/bpf.h#L100
// sizeof(i32)
public val BPF_ALIGNMENT: CInt = 4

// sys/mount.h
public val MNT_NODEV: CInt = 0x00000010

public val MNT_UNION: CInt = 0x00000020

public val MNT_CPROTECT: CInt = 0x00000080

// MAC labeled / "quarantined" flag
public val MNT_QUARANTINE: CInt = 0x00000400

// Flags set by internal operations.
public val MNT_LOCAL: CInt = 0x00001000

public val MNT_QUOTA: CInt = 0x00002000

public val MNT_ROOTFS: CInt = 0x00004000

public val MNT_DOVOLFS: CInt = 0x00008000

public val MNT_DONTBROWSE: CInt = 0x00100000

public val MNT_IGNORE_OWNERSHIP: CInt = 0x00200000

public val MNT_AUTOMOUNTED: CInt = 0x00400000

public val MNT_JOURNALED: CInt = 0x00800000

public val MNT_NOUSERXATTR: CInt = 0x01000000

public val MNT_DEFWRITE: CInt = 0x02000000

public val MNT_MULTILABEL: CInt = 0x04000000

public val MNT_NOATIME: CInt = 0x10000000

public val MNT_SNAPSHOT: CInt = 0x40000000

// External filesystem command modifier flags.
public val MNT_NOBLOCK: CInt = 0x00020000

// sys/spawn.h:
// DIFF(main): changed to `cShort` in f62eb023ab
public val POSIX_SPAWN_RESETIDS: CInt = 0x0001

public val POSIX_SPAWN_SETPGROUP: CInt = 0x0002

public val POSIX_SPAWN_SETSIGDEF: CInt = 0x0004

public val POSIX_SPAWN_SETSIGMASK: CInt = 0x0008

public val POSIX_SPAWN_SETEXEC: CInt = 0x0040

public val POSIX_SPAWN_START_SUSPENDED: CInt = 0x0080

public val POSIX_SPAWN_CLOEXEC_DEFAULT: CInt = 0x4000

// sys/ipc.h:
public val IPC_CREAT: CInt = 0x200

public val IPC_EXCL: CInt = 0x400

public val IPC_NOWAIT: CInt = 0x800

public val IPC_PRIVATE: KeyT = 0

public val IPC_RMID: CInt = 0

public val IPC_SET: CInt = 1

public val IPC_STAT: CInt = 2

public val IPC_R: CInt = 0x100

public val IPC_W: CInt = 0x80

public val IPC_M: CInt = 0x1000

// sys/sem.h
public val SEM_UNDO: CInt = 4096

public val GETNCNT: CInt = 3

public val GETPID: CInt = 4

public val GETVAL: CInt = 5

public val GETALL: CInt = 6

public val GETZCNT: CInt = 7

public val SETVAL: CInt = 8

public val SETALL: CInt = 9

// sys/shm.h
public val SHM_RDONLY: CInt = 0x1000

public val SHM_RND: CInt = 0x2000

public val SHMLBA: CInt = 16 * 1024

public val SHM_R: CInt = IPC_R

public val SHM_W: CInt = IPC_W

// Flags for chflags(2)
public val UF_SETTABLE: CUint = 0x0000ffffu

public val UF_NODUMP: CUint = 0x00000001u

public val UF_IMMUTABLE: CUint = 0x00000002u

public val UF_APPEND: CUint = 0x00000004u

public val UF_OPAQUE: CUint = 0x00000008u

public val UF_COMPRESSED: CUint = 0x00000020u

public val UF_TRACKED: CUint = 0x00000040u

public val SF_SETTABLE: CUint = 0x3fff0000u

public val SF_ARCHIVED: CUint = 0x00010000u

public val SF_IMMUTABLE: CUint = 0x00020000u

public val SF_APPEND: CUint = 0x00040000u

public val UF_HIDDEN: CUint = 0x00008000u

// <sys/timex.h>
public val NTP_API: CInt = 4

public val MAXPHASE: CLong = 500000000L

public val MAXFREQ: CLong = 500000L

public val MINSEC: CInt = 256

public val MAXSEC: CInt = 2048

public val NANOSECOND: CLong = 1000000000L

public val SCALE_PPM: CInt = 65

public val MAXTC: CInt = 10

public val MOD_OFFSET: CUint = 0x0001u

public val MOD_FREQUENCY: CUint = 0x0002u

public val MOD_MAXERROR: CUint = 0x0004u

public val MOD_ESTERROR: CUint = 0x0008u

public val MOD_STATUS: CUint = 0x0010u

public val MOD_TIMECONST: CUint = 0x0020u

public val MOD_PPSMAX: CUint = 0x0040u

public val MOD_TAI: CUint = 0x0080u

public val MOD_MICRO: CUint = 0x1000u

public val MOD_NANO: CUint = 0x2000u

public val MOD_CLKB: CUint = 0x4000u

public val MOD_CLKA: CUint = 0x8000u

public val STA_PLL: CInt = 0x0001

public val STA_PPSFREQ: CInt = 0x0002

public val STA_PPSTIME: CInt = 0x0004

public val STA_FLL: CInt = 0x0008

public val STA_INS: CInt = 0x0010

public val STA_DEL: CInt = 0x0020

public val STA_UNSYNC: CInt = 0x0040

public val STA_FREQHOLD: CInt = 0x0080

public val STA_PPSSIGNAL: CInt = 0x0100

public val STA_PPSJITTER: CInt = 0x0200

public val STA_PPSWANDER: CInt = 0x0400

public val STA_PPSERROR: CInt = 0x0800

public val STA_CLOCKERR: CInt = 0x1000

public val STA_NANO: CInt = 0x2000

public val STA_MODE: CInt = 0x4000

public val STA_CLK: CInt = 0x8000

public val STA_RONLY: CInt = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK

public val TIME_OK: CInt = 0

public val TIME_INS: CInt = 1

public val TIME_DEL: CInt = 2

public val TIME_OOP: CInt = 3

public val TIME_WAIT: CInt = 4

public val TIME_ERROR: CInt = 5

// <sys/mount.h>
public val MNT_WAIT: CInt = 1

public val MNT_NOWAIT: CInt = 2

// <mach/threadPolicy.h>
public val THREAD_STANDARD_POLICY: CInt = 1

public val THREAD_STANDARD_POLICY_COUNT: CInt = 0

public val THREAD_EXTENDED_POLICY: CInt = 1

public val THREAD_TIME_CONSTRAINT_POLICY: CInt = 2

public val THREAD_PRECEDENCE_POLICY: CInt = 3

public val THREAD_AFFINITY_POLICY: CInt = 4

public val THREAD_AFFINITY_TAG_NULL: CInt = 0

public val THREAD_BACKGROUND_POLICY: CInt = 5

public val THREAD_BACKGROUND_POLICY_DARWIN_BG: CInt = 0x1000

public val THREAD_LATENCY_QOS_POLICY: CInt = 7

public val THREAD_THROUGHPUT_QOS_POLICY: CInt = 8

// <mach/threadInfo.h>
public val TH_STATE_RUNNING: CInt = 1

public val TH_STATE_STOPPED: CInt = 2

public val TH_STATE_WAITING: CInt = 3

public val TH_STATE_UNINTERRUPTIBLE: CInt = 4

public val TH_STATE_HALTED: CInt = 5

public val TH_FLAGS_SWAPPED: CInt = 0x1

public val TH_FLAGS_IDLE: CInt = 0x2

public val TH_FLAGS_GLOBAL_FORCED_IDLE: CInt = 0x4

public val THREAD_BASIC_INFO: CInt = 3

public val THREAD_IDENTIFIER_INFO: CInt = 4

public val THREAD_EXTENDED_INFO: CInt = 5

// CommonCrypto/CommonCryptoError.h
public val K_CC_SUCCESS: Int = 0

public val K_CC_PARAM_ERROR: Int = -4300

public val K_CC_BUFFER_TOO_SMALL: Int = -4301

public val K_CC_MEMORY_FAILURE: Int = -4302

public val K_CC_ALIGNMENT_ERROR: Int = -4303

public val K_CC_DECODE_ERROR: Int = -4304

public val K_CC_UNIMPLEMENTED: Int = -4305

public val K_CC_OVERFLOW: Int = -4306

public val K_CCRNG_FAILURE: Int = -4307

public val K_CC_UNSPECIFIED_ERROR: Int = -4308

public val K_CC_CALL_SEQUENCE_ERROR: Int = -4309

public val K_CC_KEY_SIZE_ERROR: Int = -4310

public val K_CC_INVALID_KEY: Int = -4311

// mach/hostInfo.h
public val HOST_LOAD_INFO: Int = 1

public val HOST_VM_INFO: Int = 2

public val HOST_CPU_LOAD_INFO: Int = 3

public val HOST_VM_INFO64: Int = 4

public val HOST_EXTMOD_INFO64: Int = 5

public val HOST_EXPIRED_TASK_INFO: Int = 6

// mach/vmStatistics.h
public val VM_PAGE_QUERY_PAGE_PRESENT: Int = 0x1

public val VM_PAGE_QUERY_PAGE_FICTITIOUS: Int = 0x2

public val VM_PAGE_QUERY_PAGE_REF: Int = 0x4

public val VM_PAGE_QUERY_PAGE_DIRTY: Int = 0x8

public val VM_PAGE_QUERY_PAGE_PAGED_OUT: Int = 0x10

public val VM_PAGE_QUERY_PAGE_COPIED: Int = 0x20

public val VM_PAGE_QUERY_PAGE_SPECULATIVE: Int = 0x40

public val VM_PAGE_QUERY_PAGE_EXTERNAL: Int = 0x80

public val VM_PAGE_QUERY_PAGE_CS_VALIDATED: Int = 0x100

public val VM_PAGE_QUERY_PAGE_CS_TAINTED: Int = 0x200

public val VM_PAGE_QUERY_PAGE_CS_NX: Int = 0x400

// mach/taskInfo.h
public val TASK_THREAD_TIMES_INFO: UInt = 3u

public val HOST_CPU_LOAD_INFO_COUNT: UInt = 4u

public val MACH_TASK_BASIC_INFO: UInt = 20u

public val MACH_PORT_NULL: Int = 0

public val RUSAGE_INFO_V0: CInt = 0

public val RUSAGE_INFO_V1: CInt = 1

public val RUSAGE_INFO_V2: CInt = 2

public val RUSAGE_INFO_V3: CInt = 3

public val RUSAGE_INFO_V4: CInt = 4

// copyfile.h
public val COPYFILE_ACL: CopyfileFlagsT = 1u shl 0

public val COPYFILE_STAT: CopyfileFlagsT = 1u shl 1

public val COPYFILE_XATTR: CopyfileFlagsT = 1u shl 2

public val COPYFILE_DATA: CopyfileFlagsT = 1u shl 3

public val COPYFILE_SECURITY: CopyfileFlagsT = COPYFILE_STAT or COPYFILE_ACL

public val COPYFILE_METADATA: CopyfileFlagsT = COPYFILE_SECURITY or COPYFILE_XATTR

public val COPYFILE_RECURSIVE: CopyfileFlagsT = 1u shl 15

public val COPYFILE_CHECK: CopyfileFlagsT = 1u shl 16

public val COPYFILE_EXCL: CopyfileFlagsT = 1u shl 17

public val COPYFILE_NOFOLLOW_SRC: CopyfileFlagsT = 1u shl 18

public val COPYFILE_NOFOLLOW_DST: CopyfileFlagsT = 1u shl 19

public val COPYFILE_MOVE: CopyfileFlagsT = 1u shl 20

public val COPYFILE_UNLINK: CopyfileFlagsT = 1u shl 21

public val COPYFILE_NOFOLLOW: CopyfileFlagsT = COPYFILE_NOFOLLOW_SRC or COPYFILE_NOFOLLOW_DST

public val COPYFILE_PACK: CopyfileFlagsT = 1u shl 22

public val COPYFILE_UNPACK: CopyfileFlagsT = 1u shl 23

public val COPYFILE_CLONE: CopyfileFlagsT = 1u shl 24

public val COPYFILE_CLONE_FORCE: CopyfileFlagsT = 1u shl 25

public val COPYFILE_RUN_IN_PLACE: CopyfileFlagsT = 1u shl 26

public val COPYFILE_DATA_SPARSE: CopyfileFlagsT = 1u shl 27

public val COPYFILE_PRESERVE_DST_TRACKED: CopyfileFlagsT = 1u shl 28

public val COPYFILE_VERBOSE: CopyfileFlagsT = 1u shl 30

public val COPYFILE_RECURSE_ERROR: CInt = 0

public val COPYFILE_RECURSE_FILE: CInt = 1

public val COPYFILE_RECURSE_DIR: CInt = 2

public val COPYFILE_RECURSE_DIR_CLEANUP: CInt = 3

public val COPYFILE_COPY_DATA: CInt = 4

public val COPYFILE_COPY_XATTR: CInt = 5

public val COPYFILE_START: CInt = 1

public val COPYFILE_FINISH: CInt = 2

public val COPYFILE_ERR: CInt = 3

public val COPYFILE_PROGRESS: CInt = 4

public val COPYFILE_CONTINUE: CInt = 0

public val COPYFILE_SKIP: CInt = 1

public val COPYFILE_QUIT: CInt = 2

public val COPYFILE_STATE_SRC_FD: CInt = 1

public val COPYFILE_STATE_SRC_FILENAME: CInt = 2

public val COPYFILE_STATE_DST_FD: CInt = 3

public val COPYFILE_STATE_DST_FILENAME: CInt = 4

public val COPYFILE_STATE_QUARANTINE: CInt = 5

public val COPYFILE_STATE_STATUS_CB: CInt = 6

public val COPYFILE_STATE_STATUS_CTX: CInt = 7

public val COPYFILE_STATE_COPIED: CInt = 8

public val COPYFILE_STATE_XATTRNAME: CInt = 9

public val COPYFILE_STATE_WAS_CLONED: CInt = 10

public val COPYFILE_STATE_SRC_BSIZE: CInt = 11

public val COPYFILE_STATE_DST_BSIZE: CInt = 12

public val COPYFILE_STATE_BSIZE: CInt = 13

// <sys/attr.h>
public val ATTR_BIT_MAP_COUNT: CUshort = 5u

public val FSOPT_NOFOLLOW: UInt = 0x1u

public val FSOPT_NOFOLLOW_ANY: UInt = 0x800u

public val FSOPT_REPORT_FULLSIZE: UInt = 0x4u

public val FSOPT_PACK_INVAL_ATTRS: UInt = 0x8u

public val FSOPT_ATTR_CMN_EXTENDED: UInt = 0x20u

public val FSOPT_RETURN_REALDEV: UInt = 0x200u

public val ATTR_CMN_NAME: AttrgroupT = 0x00000001u

public val ATTR_CMN_DEVID: AttrgroupT = 0x00000002u

public val ATTR_CMN_FSID: AttrgroupT = 0x00000004u

public val ATTR_CMN_OBJTYPE: AttrgroupT = 0x00000008u

public val ATTR_CMN_OBJTAG: AttrgroupT = 0x00000010u

public val ATTR_CMN_OBJID: AttrgroupT = 0x00000020u

public val ATTR_CMN_OBJPERMANENTID: AttrgroupT = 0x00000040u

public val ATTR_CMN_PAROBJID: AttrgroupT = 0x00000080u

public val ATTR_CMN_SCRIPT: AttrgroupT = 0x00000100u

public val ATTR_CMN_CRTIME: AttrgroupT = 0x00000200u

public val ATTR_CMN_MODTIME: AttrgroupT = 0x00000400u

public val ATTR_CMN_CHGTIME: AttrgroupT = 0x00000800u

public val ATTR_CMN_ACCTIME: AttrgroupT = 0x00001000u

public val ATTR_CMN_BKUPTIME: AttrgroupT = 0x00002000u

public val ATTR_CMN_FNDRINFO: AttrgroupT = 0x00004000u

public val ATTR_CMN_OWNERID: AttrgroupT = 0x00008000u

public val ATTR_CMN_GRPID: AttrgroupT = 0x00010000u

public val ATTR_CMN_ACCESSMASK: AttrgroupT = 0x00020000u

public val ATTR_CMN_FLAGS: AttrgroupT = 0x00040000u

public val ATTR_CMN_GEN_COUNT: AttrgroupT = 0x00080000u

public val ATTR_CMN_DOCUMENT_ID: AttrgroupT = 0x00100000u

public val ATTR_CMN_USERACCESS: AttrgroupT = 0x00200000u

public val ATTR_CMN_EXTENDED_SECURITY: AttrgroupT = 0x00400000u

public val ATTR_CMN_UUID: AttrgroupT = 0x00800000u

public val ATTR_CMN_GRPUUID: AttrgroupT = 0x01000000u

public val ATTR_CMN_FILEID: AttrgroupT = 0x02000000u

public val ATTR_CMN_PARENTID: AttrgroupT = 0x04000000u

public val ATTR_CMN_FULLPATH: AttrgroupT = 0x08000000u

public val ATTR_CMN_ADDEDTIME: AttrgroupT = 0x10000000u

public val ATTR_CMN_DATA_PROTECT_FLAGS: AttrgroupT = 0x40000000u

public val ATTR_CMN_RETURNED_ATTRS: AttrgroupT = 0x80000000u

public val ATTR_VOL_FSTYPE: AttrgroupT = 0x00000001u

public val ATTR_VOL_SIGNATURE: AttrgroupT = 0x00000002u

public val ATTR_VOL_SIZE: AttrgroupT = 0x00000004u

public val ATTR_VOL_SPACEFREE: AttrgroupT = 0x00000008u

public val ATTR_VOL_SPACEAVAIL: AttrgroupT = 0x00000010u

public val ATTR_VOL_MINALLOCATION: AttrgroupT = 0x00000020u

public val ATTR_VOL_ALLOCATIONCLUMP: AttrgroupT = 0x00000040u

public val ATTR_VOL_IOBLOCKSIZE: AttrgroupT = 0x00000080u

public val ATTR_VOL_OBJCOUNT: AttrgroupT = 0x00000100u

public val ATTR_VOL_FILECOUNT: AttrgroupT = 0x00000200u

public val ATTR_VOL_DIRCOUNT: AttrgroupT = 0x00000400u

public val ATTR_VOL_MAXOBJCOUNT: AttrgroupT = 0x00000800u

public val ATTR_VOL_MOUNTPOINT: AttrgroupT = 0x00001000u

public val ATTR_VOL_NAME: AttrgroupT = 0x00002000u

public val ATTR_VOL_MOUNTFLAGS: AttrgroupT = 0x00004000u

public val ATTR_VOL_MOUNTEDDEVICE: AttrgroupT = 0x00008000u

public val ATTR_VOL_ENCODINGSUSED: AttrgroupT = 0x00010000u

public val ATTR_VOL_CAPABILITIES: AttrgroupT = 0x00020000u

public val ATTR_VOL_UUID: AttrgroupT = 0x00040000u

public val ATTR_VOL_SPACEUSED: AttrgroupT = 0x00800000u

public val ATTR_VOL_QUOTA_SIZE: AttrgroupT = 0x10000000u

public val ATTR_VOL_RESERVED_SIZE: AttrgroupT = 0x20000000u

public val ATTR_VOL_ATTRIBUTES: AttrgroupT = 0x40000000u

public val ATTR_VOL_INFO: AttrgroupT = 0x80000000u

public val ATTR_DIR_LINKCOUNT: AttrgroupT = 0x00000001u

public val ATTR_DIR_ENTRYCOUNT: AttrgroupT = 0x00000002u

public val ATTR_DIR_MOUNTSTATUS: AttrgroupT = 0x00000004u

public val ATTR_DIR_ALLOCSIZE: AttrgroupT = 0x00000008u

public val ATTR_DIR_IOBLOCKSIZE: AttrgroupT = 0x00000010u

public val ATTR_DIR_DATALENGTH: AttrgroupT = 0x00000020u

public val ATTR_FILE_LINKCOUNT: AttrgroupT = 0x00000001u

public val ATTR_FILE_TOTALSIZE: AttrgroupT = 0x00000002u

public val ATTR_FILE_ALLOCSIZE: AttrgroupT = 0x00000004u

public val ATTR_FILE_IOBLOCKSIZE: AttrgroupT = 0x00000008u

public val ATTR_FILE_DEVTYPE: AttrgroupT = 0x00000020u

public val ATTR_FILE_FORKCOUNT: AttrgroupT = 0x00000080u

public val ATTR_FILE_FORKLIST: AttrgroupT = 0x00000100u

public val ATTR_FILE_DATALENGTH: AttrgroupT = 0x00000200u

public val ATTR_FILE_DATAALLOCSIZE: AttrgroupT = 0x00000400u

public val ATTR_FILE_RSRCLENGTH: AttrgroupT = 0x00001000u

public val ATTR_FILE_RSRCALLOCSIZE: AttrgroupT = 0x00002000u

public val ATTR_CMNEXT_RELPATH: AttrgroupT = 0x00000004u

public val ATTR_CMNEXT_PRIVATESIZE: AttrgroupT = 0x00000008u

public val ATTR_CMNEXT_LINKID: AttrgroupT = 0x00000010u

public val ATTR_CMNEXT_NOFIRMLINKPATH: AttrgroupT = 0x00000020u

public val ATTR_CMNEXT_REALDEVID: AttrgroupT = 0x00000040u

public val ATTR_CMNEXT_REALFSID: AttrgroupT = 0x00000080u

public val ATTR_CMNEXT_CLONEID: AttrgroupT = 0x00000100u

public val ATTR_CMNEXT_EXT_FLAGS: AttrgroupT = 0x00000200u

public val ATTR_CMNEXT_RECURSIVE_GENCOUNT: AttrgroupT = 0x00000400u

public val DIR_MNTSTATUS_MNTPOINT: UInt = 0x1u

public val VOL_CAPABILITIES_FORMAT: Int = 0

public val VOL_CAPABILITIES_INTERFACES: Int = 1

public val VOL_CAP_FMT_PERSISTENTOBJECTIDS: AttrgroupT = 0x00000001u

public val VOL_CAP_FMT_SYMBOLICLINKS: AttrgroupT = 0x00000002u

public val VOL_CAP_FMT_HARDLINKS: AttrgroupT = 0x00000004u

public val VOL_CAP_FMT_JOURNAL: AttrgroupT = 0x00000008u

public val VOL_CAP_FMT_JOURNAL_ACTIVE: AttrgroupT = 0x00000010u

public val VOL_CAP_FMT_NO_ROOT_TIMES: AttrgroupT = 0x00000020u

public val VOL_CAP_FMT_SPARSE_FILES: AttrgroupT = 0x00000040u

public val VOL_CAP_FMT_ZERO_RUNS: AttrgroupT = 0x00000080u

public val VOL_CAP_FMT_CASE_SENSITIVE: AttrgroupT = 0x00000100u

public val VOL_CAP_FMT_CASE_PRESERVING: AttrgroupT = 0x00000200u

public val VOL_CAP_FMT_FAST_STATFS: AttrgroupT = 0x00000400u

public val VOL_CAP_FMT_2TB_FILESIZE: AttrgroupT = 0x00000800u

public val VOL_CAP_FMT_OPENDENYMODES: AttrgroupT = 0x00001000u

public val VOL_CAP_FMT_HIDDEN_FILES: AttrgroupT = 0x00002000u

public val VOL_CAP_FMT_PATH_FROM_ID: AttrgroupT = 0x00004000u

public val VOL_CAP_FMT_NO_VOLUME_SIZES: AttrgroupT = 0x00008000u

public val VOL_CAP_FMT_DECMPFS_COMPRESSION: AttrgroupT = 0x00010000u

public val VOL_CAP_FMT_64BIT_OBJECT_IDS: AttrgroupT = 0x00020000u

public val VOL_CAP_FMT_DIR_HARDLINKS: AttrgroupT = 0x00040000u

public val VOL_CAP_FMT_DOCUMENT_ID: AttrgroupT = 0x00080000u

public val VOL_CAP_FMT_WRITE_GENERATION_COUNT: AttrgroupT = 0x00100000u

public val VOL_CAP_FMT_NO_IMMUTABLE_FILES: AttrgroupT = 0x00200000u

public val VOL_CAP_FMT_NO_PERMISSIONS: AttrgroupT = 0x00400000u

public val VOL_CAP_FMT_SHARED_SPACE: AttrgroupT = 0x00800000u

public val VOL_CAP_FMT_VOL_GROUPS: AttrgroupT = 0x01000000u

public val VOL_CAP_FMT_SEALED: AttrgroupT = 0x02000000u

public val VOL_CAP_INT_SEARCHFS: AttrgroupT = 0x00000001u

public val VOL_CAP_INT_ATTRLIST: AttrgroupT = 0x00000002u

public val VOL_CAP_INT_NFSEXPORT: AttrgroupT = 0x00000004u

public val VOL_CAP_INT_READDIRATTR: AttrgroupT = 0x00000008u

public val VOL_CAP_INT_EXCHANGEDATA: AttrgroupT = 0x00000010u

public val VOL_CAP_INT_COPYFILE: AttrgroupT = 0x00000020u

public val VOL_CAP_INT_ALLOCATE: AttrgroupT = 0x00000040u

public val VOL_CAP_INT_VOL_RENAME: AttrgroupT = 0x00000080u

public val VOL_CAP_INT_ADVLOCK: AttrgroupT = 0x00000100u

public val VOL_CAP_INT_FLOCK: AttrgroupT = 0x00000200u

public val VOL_CAP_INT_EXTENDED_SECURITY: AttrgroupT = 0x00000400u

public val VOL_CAP_INT_USERACCESS: AttrgroupT = 0x00000800u

public val VOL_CAP_INT_MANLOCK: AttrgroupT = 0x00001000u

public val VOL_CAP_INT_NAMEDSTREAMS: AttrgroupT = 0x00002000u

public val VOL_CAP_INT_EXTENDED_ATTR: AttrgroupT = 0x00004000u

public val VOL_CAP_INT_CLONE: AttrgroupT = 0x00010000u

public val VOL_CAP_INT_SNAPSHOT: AttrgroupT = 0x00020000u

public val VOL_CAP_INT_RENAME_SWAP: AttrgroupT = 0x00040000u

public val VOL_CAP_INT_RENAME_EXCL: AttrgroupT = 0x00080000u

public val VOL_CAP_INT_RENAME_OPENFAIL: AttrgroupT = 0x00100000u

// os/clock.h
public val OS_CLOCK_MACH_ABSOLUTE_TIME: OsClockidT = 32u

// os/osSyncWaitOnAddress.h
public val OS_SYNC_WAIT_ON_ADDRESS_NONE: OsSyncWaitOnAddressFlagsT = 0x00000000u

public val OS_SYNC_WAIT_ON_ADDRESS_SHARED: OsSyncWaitOnAddressFlagsT = 0x00000001u

public val OS_SYNC_WAKE_BY_ADDRESS_NONE: OsSyncWakeByAddressFlagsT = 0x00000000u

public val OS_SYNC_WAKE_BY_ADDRESS_SHARED: OsSyncWakeByAddressFlagsT = 0x00000001u

// <proc.h>
/**
 * Process being created by fork.
 */
public val SIDL: UInt = 1u

/**
 * Currently runnable.
 */
public val SRUN: UInt = 2u

/**
 * Sleeping on an address.
 */
public val SSLEEP: UInt = 3u

/**
 * Process debugging or suspension.
 */
public val SSTOP: UInt = 4u

/**
 * Awaiting collection by parent.
 */
public val SZOMB: UInt = 5u

// sys/vsock.h
public val VMADDR_CID_ANY: CUint = 0xFFFFFFFFu

public val VMADDR_CID_HYPERVISOR: CUint = 0u

public val VMADDR_CID_RESERVED: CUint = 1u

public val VMADDR_CID_HOST: CUint = 2u

public val VMADDR_PORT_ANY: CUint = 0xFFFFFFFFu

// bsd/net/ifMib.h
/**
 * Non-interface-specific
 */
public val IFMIB_SYSTEM: CInt = 1

/**
 * Per-interface data table
 */
public val IFMIB_IFDATA: CInt = 2

/**
 * All interfaces data at once
 */
public val IFMIB_IFALLDATA: CInt = 3

/**
 * Generic stats for all kinds of ifaces
 */
public val IFDATA_GENERAL: CInt = 1

/**
 * Specific to the type of interface
 */
public val IFDATA_LINKSPECIFIC: CInt = 2

/**
 * Addresses assigned to interface
 */
public val IFDATA_ADDRS: CInt = 3

/**
 * Multicast addresses assigned to interface
 */
public val IFDATA_MULTIADDRS: CInt = 4

/**
 * Number of interfaces configured
 */
public val IFMIB_IFCOUNT: CInt = 1

/**
 * Functions not specific to a type of iface
 */
public val NETLINK_GENERIC: CInt = 0

public val DOT3COMPLIANCE_STATS: CInt = 1

public val DOT3COMPLIANCE_COLLS: CInt = 2

// kernControl.h
public val MAX_KCTL_NAME: Int = 96

public val PROC_PIDLISTFD_SIZE: CInt = 8

public val THREAD_EXTENDED_POLICY_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()

public val THREAD_TIME_CONSTRAINT_POLICY_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()

public val THREAD_PRECEDENCE_POLICY_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()

public val THREAD_AFFINITY_POLICY_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()

public val THREAD_BACKGROUND_POLICY_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()

public val THREAD_LATENCY_QOS_POLICY_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()

public val THREAD_THROUGHPUT_QOS_POLICY_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()

public val THREAD_BASIC_INFO_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()

public val THREAD_IDENTIFIER_INFO_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()

public val THREAD_EXTENDED_INFO_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()

public val TASK_THREAD_TIMES_INFO_COUNT: UInt = (8 / 8).toUInt()

public val MACH_TASK_BASIC_INFO_COUNT: UInt = (8 / 8).toUInt()

public val HOST_VM_INFO64_COUNT: MachMsgTypeNumberT = (8 / 8).toUInt()
