package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.bsd.PATH_MAX
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.RLIM_INFINITY
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.RlimT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SpeedT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.TcflagT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.MINSIGSTKSZ
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// aio.h
public val LIO_VECTORED: CInt = 4

public val LIO_WRITEV: CInt = 5

public val LIO_READV: CInt = 6

// sys/caprights.h
public val CAP_RIGHTS_VERSION_00: Int = 0

public val CAP_RIGHTS_VERSION: Int = CAP_RIGHTS_VERSION_00

public val CAP_READ: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000000001uL))

public val CAP_WRITE: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000000002uL))

public val CAP_SEEK_TELL: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000000004uL))

public val CAP_SEEK: ULong = CAP_SEEK_TELL or 0x0000000000000008uL

public val CAP_PREAD: ULong = CAP_SEEK or CAP_READ

public val CAP_PWRITE: ULong = CAP_SEEK or CAP_WRITE

public val CAP_MMAP: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000000010uL))

public val CAP_MMAP_R: ULong = CAP_MMAP or CAP_SEEK or CAP_READ

public val CAP_MMAP_W: ULong = CAP_MMAP or CAP_SEEK or CAP_WRITE

public val CAP_MMAP_X: ULong = CAP_MMAP or CAP_SEEK or 0x0000000000000020uL

public val CAP_MMAP_RW: ULong = CAP_MMAP_R or CAP_MMAP_W

public val CAP_MMAP_RX: ULong = CAP_MMAP_R or CAP_MMAP_X

public val CAP_MMAP_WX: ULong = CAP_MMAP_W or CAP_MMAP_X

public val CAP_MMAP_RWX: ULong = CAP_MMAP_R or CAP_MMAP_W or CAP_MMAP_X

public val CAP_CREATE: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000000040uL))

public val CAP_FEXECVE: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000000080uL))

public val CAP_FSYNC: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000000100uL))

public val CAP_FTRUNCATE: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000000200uL))

public val CAP_LOOKUP: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000000400uL))

public val CAP_FCHDIR: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000000800uL))

public val CAP_FCHFLAGS: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000001000uL))

public val CAP_CHFLAGSAT: ULong = CAP_FCHFLAGS or CAP_LOOKUP

public val CAP_FCHMOD: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000002000uL))

public val CAP_FCHMODAT: ULong = CAP_FCHMOD or CAP_LOOKUP

public val CAP_FCHOWN: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000004000uL))

public val CAP_FCHOWNAT: ULong = CAP_FCHOWN or CAP_LOOKUP

public val CAP_FCNTL: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000008000uL))

public val CAP_FLOCK: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000010000uL))

public val CAP_FPATHCONF: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000020000uL))

public val CAP_FSCK: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000040000uL))

public val CAP_FSTAT: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000080000uL))

public val CAP_FSTATAT: ULong = CAP_FSTAT or CAP_LOOKUP

public val CAP_FSTATFS: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000100000uL))

public val CAP_FUTIMES: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000000200000uL))

public val CAP_FUTIMESAT: ULong = CAP_FUTIMES or CAP_LOOKUP

// Note: this was named CAP_LINKAT prior to FreeBSD 11.0.
public val CAP_LINKAT_TARGET: ULong = CAP_LOOKUP or 0x0000000000400000uL

public val CAP_MKDIRAT: ULong = CAP_LOOKUP or 0x0000000000800000uL

public val CAP_MKFIFOAT: ULong = CAP_LOOKUP or 0x0000000001000000uL

public val CAP_MKNODAT: ULong = CAP_LOOKUP or 0x0000000002000000uL

// Note: this was named CAP_RENAMEAT prior to FreeBSD 11.0.
public val CAP_RENAMEAT_SOURCE: ULong = CAP_LOOKUP or 0x0000000004000000uL

public val CAP_SYMLINKAT: ULong = CAP_LOOKUP or 0x0000000008000000uL

public val CAP_UNLINKAT: ULong = CAP_LOOKUP or 0x0000000010000000uL

public val CAP_ACCEPT: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000020000000uL))

public val CAP_BIND: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000040000000uL))

public val CAP_CONNECT: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000080000000uL))

public val CAP_GETPEERNAME: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000100000000uL))

public val CAP_GETSOCKNAME: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000200000000uL))

public val CAP_GETSOCKOPT: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000400000000uL))

public val CAP_LISTEN: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000000800000000uL))

public val CAP_PEELOFF: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000001000000000uL))

public val CAP_RECV: ULong = CAP_READ

public val CAP_SEND: ULong = CAP_WRITE

public val CAP_SETSOCKOPT: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000002000000000uL))

public val CAP_SHUTDOWN: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000004000000000uL))

public val CAP_BINDAT: ULong = CAP_LOOKUP or 0x0000008000000000uL

public val CAP_CONNECTAT: ULong = CAP_LOOKUP or 0x0000010000000000uL

public val CAP_LINKAT_SOURCE: ULong = CAP_LOOKUP or 0x0000020000000000uL

public val CAP_RENAMEAT_TARGET: ULong = CAP_LOOKUP or 0x0000040000000000uL

public val CAP_SOCK_CLIENT: ULong = CAP_CONNECT or CAP_GETPEERNAME or CAP_GETSOCKNAME or CAP_GETSOCKOPT or CAP_PEELOFF or CAP_RECV or CAP_SEND or CAP_SETSOCKOPT or CAP_SHUTDOWN

public val CAP_SOCK_SERVER: ULong = CAP_ACCEPT or CAP_BIND or CAP_GETPEERNAME or CAP_GETSOCKNAME or CAP_GETSOCKOPT or CAP_LISTEN or CAP_PEELOFF or CAP_RECV or CAP_SEND or CAP_SETSOCKOPT or CAP_SHUTDOWN

public val CAP_ALL0: ULong = ((1uL shl (57 + (0)).toInt()) or (0x000007FFFFFFFFFFuL))

public val CAP_UNUSED0_44: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0000080000000000uL))

public val CAP_UNUSED0_57: ULong = ((1uL shl (57 + (0)).toInt()) or (0x0100000000000000uL))

public val CAP_MAC_GET: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000001uL))

public val CAP_MAC_SET: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000002uL))

public val CAP_SEM_GETVALUE: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000004uL))

public val CAP_SEM_POST: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000008uL))

public val CAP_SEM_WAIT: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000010uL))

public val CAP_EVENT: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000020uL))

public val CAP_KQUEUE_EVENT: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000040uL))

public val CAP_IOCTL: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000080uL))

public val CAP_TTYHOOK: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000100uL))

public val CAP_PDGETPID: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000200uL))

public val CAP_PDWAIT: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000400uL))

public val CAP_PDKILL: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000000800uL))

public val CAP_EXTATTR_DELETE: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000001000uL))

public val CAP_EXTATTR_GET: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000002000uL))

public val CAP_EXTATTR_LIST: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000004000uL))

public val CAP_EXTATTR_SET: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000008000uL))

public val CAP_ACL_CHECK: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000010000uL))

public val CAP_ACL_DELETE: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000020000uL))

public val CAP_ACL_GET: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000040000uL))

public val CAP_ACL_SET: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000080000uL))

public val CAP_KQUEUE_CHANGE: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000100000uL))

public val CAP_KQUEUE: ULong = CAP_KQUEUE_EVENT or CAP_KQUEUE_CHANGE

public val CAP_ALL1: ULong = ((1uL shl (57 + (1)).toInt()) or (0x00000000001FFFFFuL))

public val CAP_UNUSED1_22: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0000000000200000uL))

public val CAP_UNUSED1_57: ULong = ((1uL shl (57 + (1)).toInt()) or (0x0100000000000000uL))

public val CAP_FCNTL_GETFL: UInt = 1u shl 3

public val CAP_FCNTL_SETFL: UInt = 1u shl 4

public val CAP_FCNTL_GETOWN: UInt = 1u shl 5

public val CAP_FCNTL_SETOWN: UInt = 1u shl 6

// sys/devicestat.h
public val DEVSTAT_N_TRANS_FLAGS: CInt = 4

public val DEVSTAT_NAME_LEN: CInt = 16

// sys/cpuset.h
public val CPU_SETSIZE: CInt = 1024

public val SIGEV_THREAD_ID: CInt = 4

public val EXTATTR_NAMESPACE_EMPTY: CInt = 0

public val EXTATTR_NAMESPACE_USER: CInt = 1

public val EXTATTR_NAMESPACE_SYSTEM: CInt = 2

public val PTHREAD_STACK_MIN: SizeT = MINSIGSTKSZ

public val PTHREAD_MUTEX_ADAPTIVE_NP: CInt = 4

public val PTHREAD_MUTEX_STALLED: CInt = 0

public val PTHREAD_MUTEX_ROBUST: CInt = 1

public val SIGSTKSZ: SizeT = MINSIGSTKSZ + 32768uL

public val SF_NODISKIO: CInt = 0x00000001

public val SF_MNOWAIT: CInt = 0x00000002

public val SF_SYNC: CInt = 0x00000004

public val SF_USER_READAHEAD: CInt = 0x00000008

public val SF_NOCACHE: CInt = 0x00000010

public val O_CLOEXEC: CInt = 0x00100000

public val O_DIRECTORY: CInt = 0x00020000

public val O_DSYNC: CInt = 0x01000000

public val O_EMPTY_PATH: CInt = 0x02000000

public val O_EXEC: CInt = 0x00040000

public val O_PATH: CInt = 0x00400000

public val O_RESOLVE_BENEATH: CInt = 0x00800000

public val O_SEARCH: CInt = O_EXEC

public val O_TTY_INIT: CInt = 0x00080000

public val O_VERIFY: CInt = 0x00200000

public val F_GETLK: CInt = 11

public val F_SETLK: CInt = 12

public val F_SETLKW: CInt = 13

public val ENOTCAPABLE: CInt = 93

public val ECAPMODE: CInt = 94

public val ENOTRECOVERABLE: CInt = 95

public val EOWNERDEAD: CInt = 96

public val EINTEGRITY: CInt = 97

public val RLIMIT_NPTS: CInt = 11

public val RLIMIT_SWAP: CInt = 12

public val RLIMIT_KQUEUES: CInt = 13

public val RLIMIT_UMTXP: CInt = 14

public val RLIM_NLIMITS: RlimT = 15L

public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY

public val CP_USER: CInt = 0

public val CP_NICE: CInt = 1

public val CP_SYS: CInt = 2

public val CP_INTR: CInt = 3

public val CP_IDLE: CInt = 4

public val CPUSTATES: CInt = 5

public val NI_NOFQDN: CInt = 0x00000001

public val NI_NUMERICHOST: CInt = 0x00000002

public val NI_NAMEREQD: CInt = 0x00000004

public val NI_NUMERICSERV: CInt = 0x00000008

public val NI_DGRAM: CInt = 0x00000010

public val NI_NUMERICSCOPE: CInt = 0x00000020

public val XU_NGROUPS: CInt = 16

public val Q_GETQUOTA: CInt = 0x700

public val Q_SETQUOTA: CInt = 0x800

public val MAP_GUARD: CInt = 0x00002000

public val MAP_EXCL: CInt = 0x00004000

public val MAP_PREFAULT_READ: CInt = 0x00040000

public val MAP_ALIGNMENT_SHIFT: CInt = 24

public val MAP_ALIGNMENT_MASK: CInt = 0xff shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNED_SUPER: CInt = 1 shl MAP_ALIGNMENT_SHIFT

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_RANDOM: CInt = 1

public val POSIX_FADV_SEQUENTIAL: CInt = 2

public val POSIX_FADV_WILLNEED: CInt = 3

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val POLLINIGNEOF: CShort = 0x2000

public val POLLRDHUP: CShort = 0x4000

public val EVFILT_READ: Short = (-1).toShort()

public val EVFILT_WRITE: Short = (-2).toShort()

public val EVFILT_AIO: Short = (-3).toShort()

public val EVFILT_VNODE: Short = (-4).toShort()

public val EVFILT_PROC: Short = (-5).toShort()

public val EVFILT_SIGNAL: Short = (-6).toShort()

public val EVFILT_TIMER: Short = (-7).toShort()

public val EVFILT_PROCDESC: Short = (-8).toShort()

public val EVFILT_FS: Short = (-9).toShort()

public val EVFILT_LIO: Short = (-10).toShort()

public val EVFILT_USER: Short = (-11).toShort()

public val EVFILT_SENDFILE: Short = (-12).toShort()

public val EVFILT_EMPTY: Short = (-13).toShort()

public val EV_ADD: UShort = 0x1u

public val EV_DELETE: UShort = 0x2u

public val EV_ENABLE: UShort = 0x4u

public val EV_DISABLE: UShort = 0x8u

public val EV_FORCEONESHOT: UShort = 0x100u

public val EV_KEEPUDATA: UShort = 0x200u

public val EV_ONESHOT: UShort = 0x10u

public val EV_CLEAR: UShort = 0x20u

public val EV_RECEIPT: UShort = 0x40u

public val EV_DISPATCH: UShort = 0x80u

public val EV_SYSFLAGS: UShort = 0xf000u

public val EV_DROP: UShort = 0x1000u

public val EV_FLAG1: UShort = 0x2000u

public val EV_FLAG2: UShort = 0x4000u

public val EV_EOF: UShort = 0x8000u

public val EV_ERROR: UShort = 0x4000u

public val NOTE_TRIGGER: UInt = 0x01000000u

public val NOTE_FFNOP: UInt = 0x00000000u

public val NOTE_FFAND: UInt = 0x40000000u

public val NOTE_FFOR: UInt = 0x80000000u

public val NOTE_FFCOPY: UInt = 0xc0000000u

public val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public val NOTE_LOWAT: UInt = 0x00000001u

public val NOTE_FILE_POLL: UInt = 0x00000002u

public val NOTE_DELETE: UInt = 0x00000001u

public val NOTE_WRITE: UInt = 0x00000002u

public val NOTE_EXTEND: UInt = 0x00000004u

public val NOTE_ATTRIB: UInt = 0x00000008u

public val NOTE_LINK: UInt = 0x00000010u

public val NOTE_RENAME: UInt = 0x00000020u

public val NOTE_REVOKE: UInt = 0x00000040u

public val NOTE_OPEN: UInt = 0x00000080u

public val NOTE_CLOSE: UInt = 0x00000100u

public val NOTE_CLOSE_WRITE: UInt = 0x00000200u

public val NOTE_READ: UInt = 0x00000400u

public val NOTE_EXIT: UInt = 0x80000000u

public val NOTE_FORK: UInt = 0x40000000u

public val NOTE_EXEC: UInt = 0x20000000u

public val NOTE_PDATAMASK: UInt = 0x000fffffu

public val NOTE_PCTRLMASK: UInt = 0xf0000000u

public val NOTE_TRACK: UInt = 0x00000001u

public val NOTE_TRACKERR: UInt = 0x00000002u

public val NOTE_CHILD: UInt = 0x00000004u

public val NOTE_SECONDS: UInt = 0x00000001u

public val NOTE_MSECONDS: UInt = 0x00000002u

public val NOTE_USECONDS: UInt = 0x00000004u

public val NOTE_NSECONDS: UInt = 0x00000008u

public val NOTE_ABSTIME: UInt = 0x00000010u

public val MADV_PROTECT: CInt = 10

public val CTL_UNSPEC: CInt = 0

public val CTL_SYSCTL: CInt = 0

public val CTL_KERN: CInt = 1

public val CTL_VM: CInt = 2

public val CTL_VFS: CInt = 3

public val CTL_NET: CInt = 4

public val CTL_DEBUG: CInt = 5

public val CTL_HW: CInt = 6

public val CTL_MACHDEP: CInt = 7

public val CTL_USER: CInt = 8

public val CTL_P1003_1B: CInt = 9

// sys/sysctl.h
public val CTL_MAXNAME: CInt = 24

public val CTLTYPE: CInt = 0xf

public val CTLTYPE_NODE: CInt = 1

public val CTLTYPE_INT: CInt = 2

public val CTLTYPE_STRING: CInt = 3

public val CTLTYPE_S64: CInt = 4

public val CTLTYPE_OPAQUE: CInt = 5

public val CTLTYPE_STRUCT: CInt = CTLTYPE_OPAQUE

public val CTLTYPE_UINT: CInt = 6

public val CTLTYPE_LONG: CInt = 7

public val CTLTYPE_ULONG: CInt = 8

public val CTLTYPE_U64: CInt = 9

public val CTLTYPE_U8: CInt = 0xa

public val CTLTYPE_U16: CInt = 0xb

public val CTLTYPE_S8: CInt = 0xc

public val CTLTYPE_S16: CInt = 0xd

public val CTLTYPE_S32: CInt = 0xe

public val CTLTYPE_U32: CInt = 0xf

public val CTLFLAG_RD: CInt = 0x80000000.toInt()

public val CTLFLAG_WR: CInt = 0x40000000

public val CTLFLAG_RW: CInt = CTLFLAG_RD or CTLFLAG_WR

public val CTLFLAG_DORMANT: CInt = 0x20000000

public val CTLFLAG_ANYBODY: CInt = 0x10000000

public val CTLFLAG_SECURE: CInt = 0x08000000

public val CTLFLAG_PRISON: CInt = 0x04000000

public val CTLFLAG_DYN: CInt = 0x02000000

public val CTLFLAG_SKIP: CInt = 0x01000000

public val CTLMASK_SECURE: CInt = 0x00F00000

public val CTLFLAG_TUN: CInt = 0x00080000

public val CTLFLAG_RDTUN: CInt = CTLFLAG_RD or CTLFLAG_TUN

public val CTLFLAG_RWTUN: CInt = CTLFLAG_RW or CTLFLAG_TUN

public val CTLFLAG_MPSAFE: CInt = 0x00040000

public val CTLFLAG_VNET: CInt = 0x00020000

public val CTLFLAG_DYING: CInt = 0x00010000

public val CTLFLAG_CAPRD: CInt = 0x00008000

public val CTLFLAG_CAPWR: CInt = 0x00004000

public val CTLFLAG_STATS: CInt = 0x00002000

public val CTLFLAG_NOFETCH: CInt = 0x00001000

public val CTLFLAG_CAPRW: CInt = CTLFLAG_CAPRD or CTLFLAG_CAPWR

public val CTLFLAG_NEEDGIANT: CInt = 0x00000800

public val CTLSHIFT_SECURE: CInt = 20

public val CTLFLAG_SECURE1: CInt = CTLFLAG_SECURE or (0 shl CTLSHIFT_SECURE)

public val CTLFLAG_SECURE2: CInt = CTLFLAG_SECURE or (1 shl CTLSHIFT_SECURE)

public val CTLFLAG_SECURE3: CInt = CTLFLAG_SECURE or (2 shl CTLSHIFT_SECURE)

public val OID_AUTO: CInt = -1

public val CTL_SYSCTL_DEBUG: CInt = 0

public val CTL_SYSCTL_NAME: CInt = 1

public val CTL_SYSCTL_NEXT: CInt = 2

public val CTL_SYSCTL_NAME2OID: CInt = 3

public val CTL_SYSCTL_OIDFMT: CInt = 4

public val CTL_SYSCTL_OIDDESCR: CInt = 5

public val CTL_SYSCTL_OIDLABEL: CInt = 6

public val CTL_SYSCTL_NEXTNOSKIP: CInt = 7

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

public val KERN_HOSTUUID: CInt = 36

public val KERN_ARND: CInt = 37

public val KERN_MAXPHYS: CInt = 38

public val KERN_PROC_ALL: CInt = 0

public val KERN_PROC_PID: CInt = 1

public val KERN_PROC_PGRP: CInt = 2

public val KERN_PROC_SESSION: CInt = 3

public val KERN_PROC_TTY: CInt = 4

public val KERN_PROC_UID: CInt = 5

public val KERN_PROC_RUID: CInt = 6

public val KERN_PROC_ARGS: CInt = 7

public val KERN_PROC_PROC: CInt = 8

public val KERN_PROC_SV_NAME: CInt = 9

public val KERN_PROC_RGID: CInt = 10

public val KERN_PROC_GID: CInt = 11

public val KERN_PROC_PATHNAME: CInt = 12

public val KERN_PROC_OVMMAP: CInt = 13

public val KERN_PROC_OFILEDESC: CInt = 14

public val KERN_PROC_KSTACK: CInt = 15

public val KERN_PROC_INC_THREAD: CInt = 0x10

public val KERN_PROC_VMMAP: CInt = 32

public val KERN_PROC_FILEDESC: CInt = 33

public val KERN_PROC_GROUPS: CInt = 34

public val KERN_PROC_ENV: CInt = 35

public val KERN_PROC_AUXV: CInt = 36

public val KERN_PROC_RLIMIT: CInt = 37

public val KERN_PROC_PS_STRINGS: CInt = 38

public val KERN_PROC_UMASK: CInt = 39

public val KERN_PROC_OSREL: CInt = 40

public val KERN_PROC_SIGTRAMP: CInt = 41

public val KERN_PROC_CWD: CInt = 42

public val KERN_PROC_NFDS: CInt = 43

public val KERN_PROC_SIGFASTBLK: CInt = 44

public val KIPC_MAXSOCKBUF: CInt = 1

public val KIPC_SOCKBUF_WASTE: CInt = 2

public val KIPC_SOMAXCONN: CInt = 3

public val KIPC_MAX_LINKHDR: CInt = 4

public val KIPC_MAX_PROTOHDR: CInt = 5

public val KIPC_MAX_HDR: CInt = 6

public val KIPC_MAX_DATALEN: CInt = 7

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

public val HW_REALMEM: CInt = 12

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

public val USER_LOCALBASE: CInt = 21

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

public val CTL_P1003_1B_MQ_OPEN_MAX: CInt = 19

public val CTL_P1003_1B_PAGESIZE: CInt = 20

public val CTL_P1003_1B_RTSIG_MAX: CInt = 21

public val CTL_P1003_1B_SEM_NSEMS_MAX: CInt = 22

public val CTL_P1003_1B_SEM_VALUE_MAX: CInt = 23

public val CTL_P1003_1B_SIGQUEUE_MAX: CInt = 24

public val CTL_P1003_1B_TIMER_MAX: CInt = 25

public val TIOCGPTN: CUlong = 0x4004740fuL

public val TIOCPTMASTER: CUlong = 0x2000741cuL

public val TIOCSIG: CUlong = 0x2004745fuL

public val TIOCM_DCD: CInt = 0x40

public val H4DISC: CInt = 0x7

public val VM_TOTAL: CInt = 1

public val BIOCSETFNR: CUlong = 0x80104282uL

public val FIODGNAME: CUlong = 0x80106678uL

public val FIONWRITE: CUlong = 0x40046677uL

public val FIONSPACE: CUlong = 0x40046676uL

public val FIOSEEKDATA: CUlong = 0xc0086661uL

public val FIOSEEKHOLE: CUlong = 0xc0086662uL

public val FIOSSHMLPGCNF: CUlong = 0x80306664uL

public val JAIL_API_VERSION: UInt = 2u

public val JAIL_CREATE: CInt = 0x01

public val JAIL_UPDATE: CInt = 0x02

public val JAIL_ATTACH: CInt = 0x04

public val JAIL_DYING: CInt = 0x08

public val JAIL_SYS_DISABLE: CInt = 0

public val JAIL_SYS_NEW: CInt = 1

public val JAIL_SYS_INHERIT: CInt = 2

public val MNT_ACLS: CInt = 0x08000000

public val MNT_BYFSID: CInt = 0x08000000

public val MNT_GJOURNAL: CInt = 0x02000000

public val MNT_MULTILABEL: CInt = 0x04000000

public val MNT_NFS4ACLS: CInt = 0x00000010

public val MNT_SNAPSHOT: CInt = 0x01000000

public val MNT_UNION: CInt = 0x00000020

public val MNT_NONBUSY: CInt = 0x04000000

public val SCM_BINTIME: CInt = 0x04

public val SCM_REALTIME: CInt = 0x05

public val SCM_MONOTONIC: CInt = 0x06

public val SCM_TIME_INFO: CInt = 0x07

public val SCM_CREDS2: CInt = 0x08

public val SO_BINTIME: CInt = 0x2000

public val SO_NO_OFFLOAD: CInt = 0x4000

public val SO_NO_DDP: CInt = 0x8000

public val SO_REUSEPORT_LB: CInt = 0x10000

public val SO_LABEL: CInt = 0x1009

public val SO_PEERLABEL: CInt = 0x1010

public val SO_LISTENQLIMIT: CInt = 0x1011

public val SO_LISTENQLEN: CInt = 0x1012

public val SO_LISTENINCQLEN: CInt = 0x1013

public val SO_SETFIB: CInt = 0x1014

public val SO_USER_COOKIE: CInt = 0x1015

public val SO_PROTOCOL: CInt = 0x1016

public val SO_PROTOTYPE: CInt = SO_PROTOCOL

public val SO_TS_CLOCK: CInt = 0x1017

public val SO_DOMAIN: CInt = 0x1019

public val SO_SPLICE: CInt = 0x1023

public val SO_VENDOR: CInt = 0x80000000.toInt()

public val SO_TS_REALTIME_MICRO: CInt = 0

public val SO_TS_BINTIME: CInt = 1

public val SO_TS_REALTIME: CInt = 2

public val SO_TS_MONOTONIC: CInt = 3

public val SO_TS_DEFAULT: CInt = SO_TS_REALTIME_MICRO

public val SO_TS_CLOCK_MAX: CInt = SO_TS_MONOTONIC

public val LOCAL_CREDS: CInt = 2

public val LOCAL_CREDS_PERSISTENT: CInt = 3

public val LOCAL_CONNWAIT: CInt = 4

public val LOCAL_VENDOR: CInt = SO_VENDOR

public val PL_EVENT_NONE: CInt = 0

public val PL_EVENT_SIGNAL: CInt = 1

public val PL_FLAG_SA: CInt = 0x01

public val PL_FLAG_BOUND: CInt = 0x02

public val PL_FLAG_SCE: CInt = 0x04

public val PL_FLAG_SCX: CInt = 0x08

public val PL_FLAG_EXEC: CInt = 0x10

public val PL_FLAG_SI: CInt = 0x20

public val PL_FLAG_FORKED: CInt = 0x40

public val PL_FLAG_CHILD: CInt = 0x80

public val PL_FLAG_BORN: CInt = 0x100

public val PL_FLAG_EXITED: CInt = 0x200

public val PL_FLAG_VFORKED: CInt = 0x400

public val PL_FLAG_VFORK_DONE: CInt = 0x800

public val PT_LWPINFO: CInt = 13

public val PT_GETNUMLWPS: CInt = 14

public val PT_GETLWPLIST: CInt = 15

public val PT_CLEARSTEP: CInt = 16

public val PT_SETSTEP: CInt = 17

public val PT_SUSPEND: CInt = 18

public val PT_RESUME: CInt = 19

public val PT_TO_SCE: CInt = 20

public val PT_TO_SCX: CInt = 21

public val PT_SYSCALL: CInt = 22

public val PT_FOLLOW_FORK: CInt = 23

public val PT_LWP_EVENTS: CInt = 24

public val PT_GET_EVENT_MASK: CInt = 25

public val PT_SET_EVENT_MASK: CInt = 26

public val PT_GET_SC_ARGS: CInt = 27

public val PT_GET_SC_RET: CInt = 28

public val PT_COREDUMP: CInt = 29

public val PT_GETREGS: CInt = 33

public val PT_SETREGS: CInt = 34

public val PT_GETFPREGS: CInt = 35

public val PT_SETFPREGS: CInt = 36

public val PT_GETDBREGS: CInt = 37

public val PT_SETDBREGS: CInt = 38

public val PT_VM_TIMESTAMP: CInt = 40

public val PT_VM_ENTRY: CInt = 41

public val PT_GETREGSET: CInt = 42

public val PT_SETREGSET: CInt = 43

public val PT_SC_REMOTE: CInt = 44

public val PT_FIRSTMACH: CInt = 64

public val PTRACE_EXEC: CInt = 0x0001

public val PTRACE_SCE: CInt = 0x0002

public val PTRACE_SCX: CInt = 0x0004

public val PTRACE_SYSCALL: CInt = PTRACE_SCE or PTRACE_SCX

public val PTRACE_FORK: CInt = 0x0008

public val PTRACE_LWP: CInt = 0x0010

public val PTRACE_VFORK: CInt = 0x0020

public val PTRACE_DEFAULT: CInt = PTRACE_EXEC

public val PC_COMPRESS: UInt = 0x00000001u

public val PC_ALL: UInt = 0x00000002u

public val PROC_SPROTECT: CInt = 1

public val PROC_REAP_ACQUIRE: CInt = 2

public val PROC_REAP_RELEASE: CInt = 3

public val PROC_REAP_STATUS: CInt = 4

public val PROC_REAP_GETPIDS: CInt = 5

public val PROC_REAP_KILL: CInt = 6

public val PROC_TRACE_CTL: CInt = 7

public val PROC_TRACE_STATUS: CInt = 8

public val PROC_TRAPCAP_CTL: CInt = 9

public val PROC_TRAPCAP_STATUS: CInt = 10

public val PROC_PDEATHSIG_CTL: CInt = 11

public val PROC_PDEATHSIG_STATUS: CInt = 12

public val PROC_ASLR_CTL: CInt = 13

public val PROC_ASLR_STATUS: CInt = 14

public val PROC_PROTMAX_CTL: CInt = 15

public val PROC_PROTMAX_STATUS: CInt = 16

public val PROC_STACKGAP_CTL: CInt = 17

public val PROC_STACKGAP_STATUS: CInt = 18

public val PROC_NO_NEW_PRIVS_CTL: CInt = 19

public val PROC_NO_NEW_PRIVS_STATUS: CInt = 20

public val PROC_WXMAP_CTL: CInt = 21

public val PROC_WXMAP_STATUS: CInt = 22

public val PROC_PROCCTL_MD_MIN: CInt = 0x10000000

public val PPROT_SET: CInt = 1

public val PPROT_CLEAR: CInt = 2

public val PPROT_DESCEND: CInt = 0x10

public val PPROT_INHERIT: CInt = 0x20

public val PROC_TRACE_CTL_ENABLE: CInt = 1

public val PROC_TRACE_CTL_DISABLE: CInt = 2

public val PROC_TRACE_CTL_DISABLE_EXEC: CInt = 3

public val PROC_TRAPCAP_CTL_ENABLE: CInt = 1

public val PROC_TRAPCAP_CTL_DISABLE: CInt = 2

public val PROC_ASLR_FORCE_ENABLE: CInt = 1

public val PROC_ASLR_FORCE_DISABLE: CInt = 2

public val PROC_ASLR_NOFORCE: CInt = 3

public val PROC_ASLR_ACTIVE: CInt = 0x80000000.toInt()

public val PROC_PROTMAX_FORCE_ENABLE: CInt = 1

public val PROC_PROTMAX_FORCE_DISABLE: CInt = 2

public val PROC_PROTMAX_NOFORCE: CInt = 3

public val PROC_PROTMAX_ACTIVE: CInt = 0x80000000.toInt()

public val PROC_STACKGAP_ENABLE: CInt = 0x0001

public val PROC_STACKGAP_DISABLE: CInt = 0x0002

public val PROC_STACKGAP_ENABLE_EXEC: CInt = 0x0004

public val PROC_STACKGAP_DISABLE_EXEC: CInt = 0x0008

public val PROC_NO_NEW_PRIVS_ENABLE: CInt = 1

public val PROC_NO_NEW_PRIVS_DISABLE: CInt = 2

public val PROC_WX_MAPPINGS_PERMIT: CInt = 0x0001

public val PROC_WX_MAPPINGS_DISALLOW_EXEC: CInt = 0x0002

public val PROC_WXORX_ENFORCE: CInt = 0x80000000.toInt()

public val AF_SLOW: CInt = 33

public val AF_SCLUSTER: CInt = 34

public val AF_ARP: CInt = 35

public val AF_BLUETOOTH: CInt = 36

public val AF_IEEE80211: CInt = 37

public val AF_INET_SDP: CInt = 40

public val AF_INET6_SDP: CInt = 42

// sys/net/if.h
public val IF_MAXUNIT: CInt = 0x7fff

/**
 * (n) interface is up
 */
public val IFF_UP: CInt = 0x1

/**
 * (i) broadcast address valid
 */
public val IFF_BROADCAST: CInt = 0x2

/**
 * (n) turn on debugging
 */
public val IFF_DEBUG: CInt = 0x4

/**
 * (i) is a loopback net
 */
public val IFF_LOOPBACK: CInt = 0x8

/**
 * (i) is a point-to-point link
 */
public val IFF_POINTOPOINT: CInt = 0x10

/**
 * (i) calls ifInput in net epoch
 */
public val IFF_KNOWSEPOCH: CInt = 0x20

/**
 * (d) resources allocated
 */
public val IFF_RUNNING: CInt = 0x40

/**
 * (d) resources allocate
 */
public val IFF_DRV_RUNNING: CInt = 0x40

/**
 * (n) no address resolution protocol
 */
public val IFF_NOARP: CInt = 0x80

/**
 * (n) receive all packets
 */
public val IFF_PROMISC: CInt = 0x100

/**
 * (n) receive all multicast packets
 */
public val IFF_ALLMULTI: CInt = 0x200

/**
 * (d) tx hardware queue is full
 */
public val IFF_OACTIVE: CInt = 0x400

/**
 * (d) tx hardware queue is full
 */
public val IFF_DRV_OACTIVE: CInt = 0x400

/**
 * (i) can't hear own transmissions
 */
public val IFF_SIMPLEX: CInt = 0x800

/**
 * per link layer defined bit
 */
public val IFF_LINK0: CInt = 0x1000

/**
 * per link layer defined bit
 */
public val IFF_LINK1: CInt = 0x2000

/**
 * per link layer defined bit
 */
public val IFF_LINK2: CInt = 0x4000

/**
 * use alternate physical connection
 */
public val IFF_ALTPHYS: CInt = IFF_LINK2

/**
 * (i) supports multicast
 */
public val IFF_MULTICAST: CInt = 0x8000

/**
 * (i) unconfigurable using ioctl(2)
 */
public val IFF_CANTCONFIG: CInt = 0x10000

/**
 * (n) user-requested promisc mode
 */
public val IFF_PPROMISC: CInt = 0x20000

/**
 * (n) user-requested monitor mode
 */
public val IFF_MONITOR: CInt = 0x40000

/**
 * (n) static ARP
 */
public val IFF_STATICARP: CInt = 0x80000

/**
 * (n) interface is winding down
 */
public val IFF_DYING: CInt = 0x200000

/**
 * (n) interface is being renamed
 */
public val IFF_RENAMING: CInt = 0x400000

/**
 * interface is not part of any groups
 */
public val IFF_NOGROUP: CInt = 0x800000

/**
 * link invalid/unknown
 */
public val LINK_STATE_UNKNOWN: CInt = 0

/**
 * link is down
 */
public val LINK_STATE_DOWN: CInt = 1

/**
 * link is up
 */
public val LINK_STATE_UP: CInt = 2

/**
 * can offload checksum on RX
 */
public val IFCAP_RXCSUM: CInt = 0x00001

/**
 * can offload checksum on TX
 */
public val IFCAP_TXCSUM: CInt = 0x00002

/**
 * can be a network console
 */
public val IFCAP_NETCONS: CInt = 0x00004

/**
 * VLAN-compatible MTU
 */
public val IFCAP_VLAN_MTU: CInt = 0x00008

/**
 * hardware VLAN tag support
 */
public val IFCAP_VLAN_HWTAGGING: CInt = 0x00010

/**
 * 9000 byte MTU supported
 */
public val IFCAP_JUMBO_MTU: CInt = 0x00020

/**
 * driver supports polling
 */
public val IFCAP_POLLING: CInt = 0x00040

/**
 * can do IFCAP_HWCSUM on VLANs
 */
public val IFCAP_VLAN_HWCSUM: CInt = 0x00080

/**
 * can do TCP Segmentation Offload
 */
public val IFCAP_TSO4: CInt = 0x00100

/**
 * can do TCP6 Segmentation Offload
 */
public val IFCAP_TSO6: CInt = 0x00200

/**
 * can do Large Receive Offload
 */
public val IFCAP_LRO: CInt = 0x00400

/**
 * wake on any unicast frame
 */
public val IFCAP_WOL_UCAST: CInt = 0x00800

/**
 * wake on any multicast frame
 */
public val IFCAP_WOL_MCAST: CInt = 0x01000

/**
 * wake on any Magic Packet
 */
public val IFCAP_WOL_MAGIC: CInt = 0x02000

/**
 * interface can offload TCP
 */
public val IFCAP_TOE4: CInt = 0x04000

/**
 * interface can offload TCP6
 */
public val IFCAP_TOE6: CInt = 0x08000

/**
 * interface hw can filter vlan tag
 */
public val IFCAP_VLAN_HWFILTER: CInt = 0x10000

/**
 * can do SIOCGIFCAPNV/SIOCSIFCAPNV
 */
public val IFCAP_NV: CInt = 0x20000

/**
 * can do IFCAP_TSO on VLANs
 */
public val IFCAP_VLAN_HWTSO: CInt = 0x40000

/**
 * the runtime link state is dynamic
 */
public val IFCAP_LINKSTATE: CInt = 0x80000

/**
 * netmap mode supported/enabled
 */
public val IFCAP_NETMAP: CInt = 0x100000

/**
 * can offload checksum on IPv6 RX
 */
public val IFCAP_RXCSUM_IPV6: CInt = 0x200000

/**
 * can offload checksum on IPv6 TX
 */
public val IFCAP_TXCSUM_IPV6: CInt = 0x400000

/**
 * manages counters internally
 */
public val IFCAP_HWSTATS: CInt = 0x800000

/**
 * hardware supports TX rate limiting
 */
public val IFCAP_TXRTLMT: CInt = 0x1000000

/**
 * hardware rx timestamping
 */
public val IFCAP_HWRXTSTMP: CInt = 0x2000000

/**
 * understands M_EXTPG mbufs
 */
public val IFCAP_MEXTPG: CInt = 0x4000000

/**
 * can do TLS encryption and segmentation for TCP
 */
public val IFCAP_TXTLS4: CInt = 0x8000000

/**
 * can do TLS encryption and segmentation for TCP6
 */
public val IFCAP_TXTLS6: CInt = 0x10000000

/**
 * can do IFCAN_HWCSUM on VXLANs
 */
public val IFCAP_VXLAN_HWCSUM: CInt = 0x20000000

/**
 * can do IFCAP_TSO on VXLANs
 */
public val IFCAP_VXLAN_HWTSO: CInt = 0x40000000

/**
 * can do TLS with rate limiting
 */
public val IFCAP_TXTLS_RTLMT: CInt = 0x80000000.toInt()

public val IFCAP_HWCSUM_IPV6: CInt = IFCAP_RXCSUM_IPV6 or IFCAP_TXCSUM_IPV6

public val IFCAP_HWCSUM: CInt = IFCAP_RXCSUM or IFCAP_TXCSUM

public val IFCAP_TSO: CInt = IFCAP_TSO4 or IFCAP_TSO6

public val IFCAP_WOL: CInt = IFCAP_WOL_UCAST or IFCAP_WOL_MCAST or IFCAP_WOL_MAGIC

public val IFCAP_TOE: CInt = IFCAP_TOE4 or IFCAP_TOE6

public val IFCAP_TXTLS: CInt = IFCAP_TXTLS4 or IFCAP_TXTLS6

public val IFCAP_CANTCHANGE: CInt = IFCAP_NETMAP or IFCAP_NV

public val IFQ_MAXLEN: CInt = 50

public val IFNET_SLOWHZ: CInt = 1

public val IFAN_ARRIVAL: CInt = 0

public val IFAN_DEPARTURE: CInt = 1

public val IFSTATMAX: CInt = 800

public val RSS_FUNC_NONE: CInt = 0

public val RSS_FUNC_PRIVATE: CInt = 1

public val RSS_FUNC_TOEPLITZ: CInt = 2

public val RSS_TYPE_IPV4: CInt = 0x00000001

public val RSS_TYPE_TCP_IPV4: CInt = 0x00000002

public val RSS_TYPE_IPV6: CInt = 0x00000004

public val RSS_TYPE_IPV6_EX: CInt = 0x00000008

public val RSS_TYPE_TCP_IPV6: CInt = 0x00000010

public val RSS_TYPE_TCP_IPV6_EX: CInt = 0x00000020

public val RSS_TYPE_UDP_IPV4: CInt = 0x00000040

public val RSS_TYPE_UDP_IPV6: CInt = 0x00000080

public val RSS_TYPE_UDP_IPV6_EX: CInt = 0x00000100

public val RSS_KEYLEN: CInt = 128

public val IFNET_PCP_NONE: CInt = 0xff

public val IFDR_MSG_SIZE: CInt = 64

public val IFDR_REASON_MSG: CInt = 1

public val IFDR_REASON_VENDOR: CInt = 2

// sys/net/ifMib.h

/**
 * non-interface-specific
 */
public val IFMIB_SYSTEM: CInt = 1

/**
 * per-interface data table
 */
public val IFMIB_IFDATA: CInt = 2

/**
 * generic stats for all kinds of ifaces
 */
public val IFDATA_GENERAL: CInt = 1

/**
 * specific to the type of interface
 */
public val IFDATA_LINKSPECIFIC: CInt = 2

/**
 * driver name and unit
 */
public val IFDATA_DRIVERNAME: CInt = 3

/**
 * number of interfaces configured
 */
public val IFMIB_IFCOUNT: CInt = 1

/**
 * functions not specific to a type of iface
 */
public val NETLINK_GENERIC: CInt = 0

public val DOT3COMPLIANCE_STATS: CInt = 1

public val DOT3COMPLIANCE_COLLS: CInt = 2

public val DOT3CHIP_SET_AMD7990: CInt = 1

public val DOT3CHIP_SET_AMD79900: CInt = 2

public val DOT3CHIP_SET_AMD79C940: CInt = 3

public val DOT3CHIP_SET_INTEL82586: CInt = 1

public val DOT3CHIP_SET_INTEL82596: CInt = 2

public val DOT3CHIP_SET_INTEL82557: CInt = 3

public val DOT3CHIP_SET_NATIONAL8390: CInt = 1

public val DOT3CHIP_SET_NATIONAL_SONIC: CInt = 2

public val DOT3CHIP_SET_FUJITSU86950: CInt = 1

public val DOT3CHIP_SET_DIGITAL_DC21040: CInt = 1

public val DOT3CHIP_SET_DIGITAL_DC21140: CInt = 2

public val DOT3CHIP_SET_DIGITAL_DC21041: CInt = 3

public val DOT3CHIP_SET_DIGITAL_DC21140A: CInt = 4

public val DOT3CHIP_SET_DIGITAL_DC21142: CInt = 5

public val DOT3CHIP_SET_WESTERN_DIGITAL83C690: CInt = 1

public val DOT3CHIP_SET_WESTERN_DIGITAL83C790: CInt = 2

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

public val IPPROTO_SEP: CInt = 33

/**
 * Datagram Congestion Control Protocol
 */
public val IPPROTO_DCCP: CInt = 33

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

/**
 * SCTP
 */
public val IPPROTO_SCTP: CInt = 132

/**
 * IPv6 Mobility Header
 */
public val IPPROTO_MH: CInt = 135

/**
 * UDP-Lite
 */
public val IPPROTO_UDPLITE: CInt = 136

/**
 * IP6 Host Identity Protocol
 */
public val IPPROTO_HIP: CInt = 139

/**
 * IP6 Shim6 Protocol
 */
public val IPPROTO_SHIM6: CInt = 140

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
 * MPLS-in-IP
 */
public val IPPROTO_MPLS: CInt = 137

/**
 * PFSYNC
 */
public val IPPROTO_PFSYNC: CInt = 240

// 255: Reserved
// BSD Private, local use, namespace incursion, no longer used

/**
 * OLD divert pseudo-proto
 */
public val IPPROTO_OLD_DIVERT: CInt = 254

public val IPPROTO_MAX: CInt = 256

/**
 * last return value of *_input(), meaning "all job for this pkt is done".
 */
public val IPPROTO_DONE: CInt = 257

// Only used internally, so can be outside the range of valid IP protocols.

/**
 * divert pseudo-protocol
 */
public val IPPROTO_DIVERT: CInt = 258

/**
 * SeND pseudo-protocol
 */
public val IPPROTO_SEND: CInt = 259

// sys/netinet/TCP.h
public val TCP_MD5SIG: CInt = 16

public val TCP_INFO: CInt = 32

public val TCP_CONGESTION: CInt = 64

public val TCP_CCALGOOPT: CInt = 65

public val TCP_MAXUNACKTIME: CInt = 68

public val TCP_MAXPEAKRATE: CInt = 69

public val TCP_IDLE_REDUCE: CInt = 70

public val TCP_REMOTE_UDP_ENCAPS_PORT: CInt = 71

public val TCP_DELACK: CInt = 72

public val TCP_FIN_IS_RST: CInt = 73

public val TCP_LOG_LIMIT: CInt = 74

public val TCP_SHARED_CWND_ALLOWED: CInt = 75

public val TCP_PROC_ACCOUNTING: CInt = 76

public val TCP_USE_CMP_ACKS: CInt = 77

public val TCP_PERF_INFO: CInt = 78

public val TCP_LRD: CInt = 79

public val TCP_KEEPINIT: CInt = 128

public val TCP_FASTOPEN: CInt = 1025

public val TCP_PCAP_OUT: CInt = 2048

public val TCP_PCAP_IN: CInt = 4096

public val TCP_FUNCTION_BLK: CInt = 8192

public val TCP_FUNCTION_ALIAS: CInt = 8193

public val TCP_FASTOPEN_PSK_LEN: CInt = 16

public val TCP_FUNCTION_NAME_LEN_MAX: CInt = 32

public val TCP_REUSPORT_LB_NUMA: CInt = 1026

public val TCP_RACK_MBUF_QUEUE: CInt = 1050

public val TCP_RACK_TLP_REDUCE: CInt = 1052

public val TCP_RACK_PACE_MAX_SEG: CInt = 1054

public val TCP_RACK_PACE_ALWAYS: CInt = 1055

public val TCP_RACK_PRR_SENDALOT: CInt = 1057

public val TCP_RACK_MIN_TO: CInt = 1058

public val TCP_RACK_EARLY_SEG: CInt = 1060

public val TCP_RACK_REORD_THRESH: CInt = 1061

public val TCP_RACK_REORD_FADE: CInt = 1062

public val TCP_RACK_TLP_THRESH: CInt = 1063

public val TCP_RACK_PKT_DELAY: CInt = 1064

public val TCP_BBR_IWINTSO: CInt = 1067

public val TCP_BBR_STARTUP_PG: CInt = 1069

public val TCP_BBR_DRAIN_PG: CInt = 1070

public val TCP_BBR_PROBE_RTT_INT: CInt = 1072

public val TCP_BBR_STARTUP_LOSS_EXIT: CInt = 1074

public val TCP_BBR_TSLIMITS: CInt = 1076

public val TCP_BBR_PACE_OH: CInt = 1077

public val TCP_BBR_USEDEL_RATE: CInt = 1079

public val TCP_BBR_MIN_RTO: CInt = 1080

public val TCP_BBR_MAX_RTO: CInt = 1081

public val TCP_BBR_ALGORITHM: CInt = 1083

public val TCP_BBR_PACE_PER_SEC: CInt = 1086

public val TCP_BBR_PACE_DEL_TAR: CInt = 1087

public val TCP_BBR_PACE_SEG_MAX: CInt = 1088

public val TCP_BBR_PACE_SEG_MIN: CInt = 1089

public val TCP_BBR_PACE_CROSS: CInt = 1090

public val TCP_BBR_TMR_PACE_OH: CInt = 1096

public val TCP_BBR_RACK_RTT_USE: CInt = 1098

public val TCP_BBR_RETRAN_WTSO: CInt = 1099

public val TCP_BBR_PROBE_RTT_GAIN: CInt = 1101

public val TCP_BBR_PROBE_RTT_LEN: CInt = 1102

public val TCP_BBR_SEND_IWND_IN_TSO: CInt = 1103

public val TCP_BBR_USE_RACK_RR: CInt = 1104

public val TCP_BBR_HDWR_PACE: CInt = 1105

public val TCP_BBR_UTTER_MAX_TSO: CInt = 1106

public val TCP_BBR_EXTRA_STATE: CInt = 1107

public val TCP_BBR_FLOOR_MIN_TSO: CInt = 1108

public val TCP_BBR_MIN_TOPACEOUT: CInt = 1109

public val TCP_BBR_TSTMP_RAISES: CInt = 1110

public val TCP_BBR_POLICER_DETECT: CInt = 1111

public val TCP_BBR_RACK_INIT_RATE: CInt = 1112

public val IP_BINDANY: CInt = 24

public val IP_BINDMULTI: CInt = 25

public val IP_RSS_LISTEN_BUCKET: CInt = 26

public val IP_ORIGDSTADDR: CInt = 27

public val IP_RECVORIGDSTADDR: CInt = IP_ORIGDSTADDR

public val IP_DONTFRAG: CInt = 67

public val IP_RECVTOS: CInt = 68

public val IPV6_BINDANY: CInt = 64

public val IPV6_ORIGDSTADDR: CInt = 72

public val IPV6_RECVORIGDSTADDR: CInt = IPV6_ORIGDSTADDR

public val PF_SLOW: CInt = AF_SLOW

public val PF_SCLUSTER: CInt = AF_SCLUSTER

public val PF_ARP: CInt = AF_ARP

public val PF_BLUETOOTH: CInt = AF_BLUETOOTH

public val PF_IEEE80211: CInt = AF_IEEE80211

public val PF_INET_SDP: CInt = AF_INET_SDP

public val PF_INET6_SDP: CInt = AF_INET6_SDP

public val NET_RT_DUMP: CInt = 1

public val NET_RT_FLAGS: CInt = 2

public val NET_RT_IFLIST: CInt = 3

public val NET_RT_IFMALIST: CInt = 4

public val NET_RT_IFLISTL: CInt = 5

// System V IPC
public val IPC_INFO: CInt = 3

public val MSG_NOERROR: CInt = 4096

public val SHM_LOCK: CInt = 11

public val SHM_UNLOCK: CInt = 12

public val SHM_STAT: CInt = 13

public val SHM_INFO: CInt = 14

public val SHM_ANON: MutPtr<CChar> = MutPtr<CChar>(1.toLong())

// The *_MAXID constants never should've been used outside of the
// FreeBSD base system.  And with the exception of CTL_P1003_1B_MAXID,
// they were all removed in svn r262489.  They remain here for backwards
// compatibility only, and are scheduled to be removed in libc 1.0.0.
public val CTL_MAXID: CInt = 10

public val KERN_MAXID: CInt = 38

public val HW_MAXID: CInt = 13

public val USER_MAXID: CInt = 21

public val CTL_P1003_1B_MAXID: CInt = 26

public val MSG_NOTIFICATION: CInt = 0x00002000

public val MSG_NBIO: CInt = 0x00004000

public val MSG_COMPAT: CInt = 0x00008000

public val MSG_CMSG_CLOEXEC: CInt = 0x00040000

public val MSG_NOSIGNAL: CInt = 0x20000

public val MSG_WAITFORONE: CInt = 0x00080000

// utmpx entry types
public val EMPTY: CShort = 0

public val BOOT_TIME: CShort = 1

public val OLD_TIME: CShort = 2

public val NEW_TIME: CShort = 3

public val USER_PROCESS: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val DEAD_PROCESS: CShort = 7

public val SHUTDOWN_TIME: CShort = 8

// utmp database types
public val UTXDB_ACTIVE: CInt = 0

public val UTXDB_LASTLOGIN: CInt = 1

public val UTXDB_LOG: CInt = 2

public val LC_COLLATE_MASK: CInt = 1 shl 0

public val LC_CTYPE_MASK: CInt = 1 shl 1

public val LC_MONETARY_MASK: CInt = 1 shl 2

public val LC_NUMERIC_MASK: CInt = 1 shl 3

public val LC_TIME_MASK: CInt = 1 shl 4

public val LC_MESSAGES_MASK: CInt = 1 shl 5

public val LC_ALL_MASK: CInt = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK

public val WSTOPPED: CInt = 2

// same as WUNTRACED
public val WCONTINUED: CInt = 4

public val WNOWAIT: CInt = 8

public val WEXITED: CInt = 16

public val WTRAPPED: CInt = 32

// FreeBSD defines a great many more of these, we only expose the
// standardized ones.
public val P_PID: IdtypeT = 0u

public val P_PGID: IdtypeT = 2u

public val P_ALL: IdtypeT = 7u

public val UTIME_OMIT: CLong = -2L

public val UTIME_NOW: CLong = -1L

public val B460800: SpeedT = 460800u

public val B921600: SpeedT = 921600u

public val AT_FDCWD: CInt = -100

public val AT_EACCESS: CInt = 0x100

public val AT_SYMLINK_NOFOLLOW: CInt = 0x200

public val AT_SYMLINK_FOLLOW: CInt = 0x400

public val AT_REMOVEDIR: CInt = 0x800

public val AT_RESOLVE_BENEATH: CInt = 0x2000

public val AT_EMPTY_PATH: CInt = 0x4000

public val AT_NULL: CInt = 0

public val AT_IGNORE: CInt = 1

public val AT_EXECFD: CInt = 2

public val AT_PHDR: CInt = 3

public val AT_PHENT: CInt = 4

public val AT_PHNUM: CInt = 5

public val AT_PAGESZ: CInt = 6

public val AT_BASE: CInt = 7

public val AT_FLAGS: CInt = 8

public val AT_ENTRY: CInt = 9

public val AT_NOTELF: CInt = 10

public val AT_UID: CInt = 11

public val AT_EUID: CInt = 12

public val AT_GID: CInt = 13

public val AT_EGID: CInt = 14

public val AT_EXECPATH: CInt = 15

public val AT_CANARY: CInt = 16

public val AT_OSRELDATE: CInt = 18

public val AT_NCPUS: CInt = 19

public val AT_PAGESIZES: CInt = 20

public val AT_TIMEKEEP: CInt = 22

public val AT_HWCAP: CInt = 25

public val AT_HWCAP2: CInt = 26

public val AT_USRSTACKBASE: CInt = 35

public val AT_USRSTACKLIM: CInt = 36

public val AT_HWCAP3: CInt = 38

public val AT_HWCAP4: CInt = 39

public val TABDLY: TcflagT = 0x00000004u

public val TAB0: TcflagT = 0x00000000u

public val TAB3: TcflagT = 0x00000004u

public val PC_ACL_NFS4: CInt = 64

public val SC_CPUSET_SIZE: CInt = 122

public val UUID_NODE_LEN: Int = 6

// Flags which can be passed to pdfork(2)
public val PD_DAEMON: CInt = 0x00000001

public val PD_CLOEXEC: CInt = 0x00000002

public val PD_ALLOWED_AT_FORK: CInt = PD_DAEMON or PD_CLOEXEC

// Values for struct rtprio (type_ field)
public val RTP_PRIO_REALTIME: CUshort = 2u

public val RTP_PRIO_NORMAL: CUshort = 3u

public val RTP_PRIO_IDLE: CUshort = 4u

// Flags for chflags(2)
public val UF_SYSTEM: CUlong = 0x00000080uL

public val UF_SPARSE: CUlong = 0x00000100uL

public val UF_OFFLINE: CUlong = 0x00000200uL

public val UF_REPARSE: CUlong = 0x00000400uL

public val UF_ARCHIVE: CUlong = 0x00000800uL

public val UF_READONLY: CUlong = 0x00001000uL

public val UF_HIDDEN: CUlong = 0x00008000uL

public val SF_SNAPSHOT: CUlong = 0x00200000uL

// fcntl commands
public val F_ADD_SEALS: CInt = 19

public val F_GET_SEALS: CInt = 20

public val F_OGETLK: CInt = 7

public val F_OSETLK: CInt = 8

public val F_OSETLKW: CInt = 9

public val F_RDAHEAD: CInt = 16

public val F_READAHEAD: CInt = 15

public val F_SETLK_REMOTE: CInt = 14

public val F_KINFO: CInt = 22

// for use with F_ADD_SEALS
public val F_SEAL_GROW: CInt = 4

public val F_SEAL_SEAL: CInt = 1

public val F_SEAL_SHRINK: CInt = 2

public val F_SEAL_WRITE: CInt = 8

// for use with fspacectl
public val SPACECTL_DEALLOC: CInt = 1

// For realhostname* api
public val HOSTNAME_FOUND: CInt = 0

public val HOSTNAME_INCORRECTNAME: CInt = 1

public val HOSTNAME_INVALIDADDR: CInt = 2

public val HOSTNAME_INVALIDNAME: CInt = 3

// For rfork
public val RFFDG: CInt = 4

public val RFPROC: CInt = 16

public val RFMEM: CInt = 32

public val RFNOWAIT: CInt = 64

public val RFCFDG: CInt = 4096

public val RFTHREAD: CInt = 8192

public val RFSIGSHARE: CInt = 16384

public val RFLINUXTHPN: CInt = 65536

public val RFTSIGZMB: CInt = 524288

public val RFSPAWN: CInt = 2147483648.toInt()

// For eventfd
public val EFD_SEMAPHORE: CInt = 0x1

public val EFD_NONBLOCK: CInt = 0x4

public val EFD_CLOEXEC: CInt = 0x100000

public val MALLOCX_ZERO: CInt = 0x40

/**
 * size of returned wchan message
 */
public val WMESGLEN: Int = 8

/**
 * size of returned lock name
 */
public val LOCKNAMELEN: Int = 8

/**
 * size of returned thread name
 */
public val TDNAMLEN: Int = 16

/**
 * size of returned kiComm name
 */
public val COMMLEN: Int = 19

/**
 * size of returned kiEmul
 */
public val KI_EMULNAMELEN: Int = 16

/**
 * number of groups in kiGroups
 */
public val KI_NGROUPS: Int = 16

public val KI_NSPARE_INT: Int = 4

public val KI_NSPARE_LONG: Int = 12

/**
 * Flags for the process credential.
 */
public val KI_CRF_CAPABILITY_MODE: Int = 0x00000001

/**
 * Steal a bit from kiCrFlags to indicate that the cred had more than
 * KI_NGROUPS groups.
 */
public val KI_CRF_GRP_OVERFLOW: Int = 0x80000000.toInt()

/**
 * controlling tty vnode active
 */
public val KI_CTTY: Int = 0x00000001

/**
 * session leader
 */
public val KI_SLEADER: Int = 0x00000002

/**
 * proc blocked on lock kiLockname
 */
public val KI_LOCKBLOCK: Int = 0x00000004

/**
 * size of returned kiLogin
 */
public val LOGNAMELEN: Int = 17

/**
 * size of returned kiLoginclass
 */
public val LOGINCLASSLEN: Int = 17

public val KF_ATTR_VALID: CInt = 0x0001

public val KF_TYPE_NONE: CInt = 0

public val KF_TYPE_VNODE: CInt = 1

public val KF_TYPE_SOCKET: CInt = 2

public val KF_TYPE_PIPE: CInt = 3

public val KF_TYPE_FIFO: CInt = 4

public val KF_TYPE_KQUEUE: CInt = 5

public val KF_TYPE_MQUEUE: CInt = 7

public val KF_TYPE_SHM: CInt = 8

public val KF_TYPE_SEM: CInt = 9

public val KF_TYPE_PTS: CInt = 10

public val KF_TYPE_PROCDESC: CInt = 11

public val KF_TYPE_DEV: CInt = 12

public val KF_TYPE_UNKNOWN: CInt = 255

public val KF_VTYPE_VNON: CInt = 0

public val KF_VTYPE_VREG: CInt = 1

public val KF_VTYPE_VDIR: CInt = 2

public val KF_VTYPE_VBLK: CInt = 3

public val KF_VTYPE_VCHR: CInt = 4

public val KF_VTYPE_VLNK: CInt = 5

public val KF_VTYPE_VSOCK: CInt = 6

public val KF_VTYPE_VFIFO: CInt = 7

public val KF_VTYPE_VBAD: CInt = 8

public val KF_VTYPE_UNKNOWN: CInt = 255

/**
 * Current working directory
 */
public val KF_FD_TYPE_CWD: CInt = -1

/**
 * Root directory
 */
public val KF_FD_TYPE_ROOT: CInt = -2

/**
 * Jail directory
 */
public val KF_FD_TYPE_JAIL: CInt = -3

/**
 * Ktrace vnode
 */
public val KF_FD_TYPE_TRACE: CInt = -4

public val KF_FD_TYPE_TEXT: CInt = -5

/**
 * Controlling terminal
 */
public val KF_FD_TYPE_CTTY: CInt = -6

public val KF_FLAG_READ: CInt = 0x00000001

public val KF_FLAG_WRITE: CInt = 0x00000002

public val KF_FLAG_APPEND: CInt = 0x00000004

public val KF_FLAG_ASYNC: CInt = 0x00000008

public val KF_FLAG_FSYNC: CInt = 0x00000010

public val KF_FLAG_NONBLOCK: CInt = 0x00000020

public val KF_FLAG_DIRECT: CInt = 0x00000040

public val KF_FLAG_HASLOCK: CInt = 0x00000080

public val KF_FLAG_SHLOCK: CInt = 0x00000100

public val KF_FLAG_EXLOCK: CInt = 0x00000200

public val KF_FLAG_NOFOLLOW: CInt = 0x00000400

public val KF_FLAG_CREAT: CInt = 0x00000800

public val KF_FLAG_TRUNC: CInt = 0x00001000

public val KF_FLAG_EXCL: CInt = 0x00002000

public val KF_FLAG_EXEC: CInt = 0x00004000

public val KVME_TYPE_NONE: CInt = 0

public val KVME_TYPE_DEFAULT: CInt = 1

public val KVME_TYPE_VNODE: CInt = 2

public val KVME_TYPE_SWAP: CInt = 3

public val KVME_TYPE_DEVICE: CInt = 4

public val KVME_TYPE_PHYS: CInt = 5

public val KVME_TYPE_DEAD: CInt = 6

public val KVME_TYPE_SG: CInt = 7

public val KVME_TYPE_MGTDEVICE: CInt = 8

// Present in `sys / user.h` but is undefined for whatever reason...
// pub const KVME_TYPE_GUARD: cInt = 9;
public val KVME_TYPE_UNKNOWN: CInt = 255

public val KVME_PROT_READ: CInt = 0x00000001

public val KVME_PROT_WRITE: CInt = 0x00000002

public val KVME_PROT_EXEC: CInt = 0x00000004

public val KVME_FLAG_COW: CInt = 0x00000001

public val KVME_FLAG_NEEDS_COPY: CInt = 0x00000002

public val KVME_FLAG_NOCOREDUMP: CInt = 0x00000004

public val KVME_FLAG_SUPER: CInt = 0x00000008

public val KVME_FLAG_GROWS_UP: CInt = 0x00000010

public val KVME_FLAG_GROWS_DOWN: CInt = 0x00000020

public val KVME_FLAG_USER_WIRED: CInt = 0x00000040

public val KKST_MAXLEN: CInt = 1024

/**
 * Stack is valid.
 */
public val KKST_STATE_STACKOK: CInt = 0

/**
 * Stack swapped out.
 */
public val KKST_STATE_SWAPPED: CInt = 1

public val KKST_STATE_RUNNING: CInt = 2

// Constants about priority.
public val PRI_MIN: CInt = 0

public val PRI_MAX: CInt = 255

public val PRI_MIN_ITHD: CInt = PRI_MIN

public val PRI_MIN_REALTIME: CInt = 48

public val PRI_MAX_ITHD: CInt = PRI_MIN_REALTIME - 1

public val PI_REALTIME: CInt = PRI_MIN_ITHD + 0

public val PI_AV: CInt = PRI_MIN_ITHD + 4

public val PI_NET: CInt = PRI_MIN_ITHD + 8

public val PI_DISK: CInt = PRI_MIN_ITHD + 12

public val PI_TTY: CInt = PRI_MIN_ITHD + 16

public val PI_DULL: CInt = PRI_MIN_ITHD + 20

public val PI_SOFT: CInt = PRI_MIN_ITHD + 24

public val PRI_MIN_KERN: CInt = 80

public val PRI_MAX_REALTIME: CInt = PRI_MIN_KERN - 1

public val PRI_MIN_TIMESHARE: CInt = 120

public val PRI_MAX_KERN: CInt = PRI_MIN_TIMESHARE - 1

public val PSWP: CInt = PRI_MIN_KERN + 0

public val PVM: CInt = PRI_MIN_KERN + 4

public val PINOD: CInt = PRI_MIN_KERN + 8

public val PRIBIO: CInt = PRI_MIN_KERN + 12

public val PVFS: CInt = PRI_MIN_KERN + 16

public val PZERO: CInt = PRI_MIN_KERN + 20

public val PSOCK: CInt = PRI_MIN_KERN + 24

public val PWAIT: CInt = PRI_MIN_KERN + 28

public val PLOCK: CInt = PRI_MIN_KERN + 32

public val PPAUSE: CInt = PRI_MIN_KERN + 36

public val PRI_MIN_IDLE: CInt = 224

public val PRI_MAX_TIMESHARE: CInt = PRI_MIN_IDLE - 1

public val PUSER: CInt = PRI_MIN_TIMESHARE

public val PRI_MAX_IDLE: CInt = PRI_MAX

public val NZERO: CInt = 0

// Resource utilization information.
public val RUSAGE_THREAD: CInt = 1

public val ARG_MAX: CInt = 256 * 1024

public val CHILD_MAX: CInt = 40

/**
 * max command name remembered
 */
public val MAXCOMLEN: Int = 19

/**
 * max interpreter file name length
 */
public val MAXINTERP: CInt = PATH_MAX

/**
 * max login name length (incl. NUL)
 */
public val MAXLOGNAME: CInt = 33

/**
 * max simultaneous processes
 */
public val MAXUPRC: CInt = CHILD_MAX

/**
 * max bytes for an exec function
 */
public val NCARGS: CInt = ARG_MAX

/**
 * max supplemental group id's
 */
public val NGROUPS_MAX: CInt = 1023

/**
 *  / * max number groups
 */
public val NGROUPS: CInt = NGROUPS_MAX + 1

/**
 * max open files per process
 */
public val OPEN_MAX: CInt = 64

/**
 * max open files per process
 */
public val NOFILE: CInt = OPEN_MAX

/**
 * marker for empty group set member
 */
public val NOGROUP: CInt = 65535

/**
 * max hostname size
 */
public val MAXHOSTNAMELEN: CInt = 256

/**
 * max bytes in term canon input line
 */
public val MAX_CANON: CInt = 255

/**
 * max bytes in terminal input
 */
public val MAX_INPUT: CInt = 255

/**
 * max bytes in a file name
 */
public val NAME_MAX: CInt = 255

public val MAXSYMLINKS: CInt = 32

public val POSIX_ARG_MAX: CInt = 4096

public val POSIX_LINK_MAX: CInt = 8

public val POSIX_MAX_CANON: CInt = 255

public val POSIX_MAX_INPUT: CInt = 255

public val POSIX_NAME_MAX: CInt = 14

public val POSIX_PIPE_BUF: CInt = 512

public val POSIX_SSIZE_MAX: CInt = 32767

public val POSIX_STREAM_MAX: CInt = 8

/**
 * max ibase/obase values in bc(1)
 */
public val BC_BASE_MAX: CInt = 99

/**
 * max array elements in bc(1)
 */
public val BC_DIM_MAX: CInt = 2048

/**
 * max scale value in bc(1)
 */
public val BC_SCALE_MAX: CInt = 99

/**
 * max const string length in bc(1)
 */
public val BC_STRING_MAX: CInt = 1000

/**
 * max character class name size
 */
public val CHARCLASS_NAME_MAX: CInt = 14

/**
 * max weights for order keyword
 */
public val COLL_WEIGHTS_MAX: CInt = 10

/**
 * max expressions nested in expr(1)
 */
public val EXPR_NEST_MAX: CInt = 32

/**
 * max bytes in an input line
 */
public val LINE_MAX: CInt = 2048

/**
 * max RE's in interval notation
 */
public val RE_DUP_MAX: CInt = 255

public val POSIX2_BC_BASE_MAX: CInt = 99

public val POSIX2_BC_DIM_MAX: CInt = 2048

public val POSIX2_BC_SCALE_MAX: CInt = 99

public val POSIX2_BC_STRING_MAX: CInt = 1000

public val POSIX2_CHARCLASS_NAME_MAX: CInt = 14

public val POSIX2_COLL_WEIGHTS_MAX: CInt = 2

public val POSIX2_EQUIV_CLASS_MAX: CInt = 2

public val POSIX2_EXPR_NEST_MAX: CInt = 32

public val POSIX2_LINE_MAX: CInt = 2048

public val POSIX2_RE_DUP_MAX: CInt = 255

// sys/proc.h
public val TDF_BORROWING: CInt = 0x00000001

public val TDF_INPANIC: CInt = 0x00000002

public val TDF_INMEM: CInt = 0x00000004

public val TDF_SINTR: CInt = 0x00000008

public val TDF_TIMEOUT: CInt = 0x00000010

public val TDF_IDLETD: CInt = 0x00000020

public val TDF_CANSWAP: CInt = 0x00000040

public val TDF_KTH_SUSP: CInt = 0x00000100

public val TDF_ALLPROCSUSP: CInt = 0x00000200

public val TDF_BOUNDARY: CInt = 0x00000400

public val TDF_ASTPENDING: CInt = 0x00000800

public val TDF_SBDRY: CInt = 0x00002000

public val TDF_UPIBLOCKED: CInt = 0x00004000

public val TDF_NEEDSUSPCHK: CInt = 0x00008000

public val TDF_NEEDRESCHED: CInt = 0x00010000

public val TDF_NEEDSIGCHK: CInt = 0x00020000

public val TDF_NOLOAD: CInt = 0x00040000

public val TDF_SERESTART: CInt = 0x00080000

public val TDF_THRWAKEUP: CInt = 0x00100000

public val TDF_SEINTR: CInt = 0x00200000

public val TDF_SWAPINREQ: CInt = 0x00400000

public val TDF_UNUSED23: CInt = 0x00800000

public val TDF_SCHED0: CInt = 0x01000000

public val TDF_SCHED1: CInt = 0x02000000

public val TDF_SCHED2: CInt = 0x04000000

public val TDF_SCHED3: CInt = 0x08000000

public val TDF_ALRMPEND: CInt = 0x10000000

public val TDF_PROFPEND: CInt = 0x20000000

public val TDF_MACPEND: CInt = 0x40000000

public val TDB_SUSPEND: CInt = 0x00000001

public val TDB_XSIG: CInt = 0x00000002

public val TDB_USERWR: CInt = 0x00000004

public val TDB_SCE: CInt = 0x00000008

public val TDB_SCX: CInt = 0x00000010

public val TDB_EXEC: CInt = 0x00000020

public val TDB_FORK: CInt = 0x00000040

public val TDB_STOPATFORK: CInt = 0x00000080

public val TDB_CHILD: CInt = 0x00000100

public val TDB_BORN: CInt = 0x00000200

public val TDB_EXIT: CInt = 0x00000400

public val TDB_VFORK: CInt = 0x00000800

public val TDB_FSTP: CInt = 0x00001000

public val TDB_STEP: CInt = 0x00002000

public val TDP_OLDMASK: CInt = 0x00000001

public val TDP_INKTR: CInt = 0x00000002

public val TDP_INKTRACE: CInt = 0x00000004

public val TDP_BUFNEED: CInt = 0x00000008

public val TDP_COWINPROGRESS: CInt = 0x00000010

public val TDP_ALTSTACK: CInt = 0x00000020

public val TDP_DEADLKTREAT: CInt = 0x00000040

public val TDP_NOFAULTING: CInt = 0x00000080

public val TDP_OWEUPC: CInt = 0x00000200

public val TDP_ITHREAD: CInt = 0x00000400

public val TDP_SYNCIO: CInt = 0x00000800

public val TDP_SCHED1: CInt = 0x00001000

public val TDP_SCHED2: CInt = 0x00002000

public val TDP_SCHED3: CInt = 0x00004000

public val TDP_SCHED4: CInt = 0x00008000

public val TDP_GEOM: CInt = 0x00010000

public val TDP_SOFTDEP: CInt = 0x00020000

public val TDP_NORUNNINGBUF: CInt = 0x00040000

public val TDP_WAKEUP: CInt = 0x00080000

public val TDP_INBDFLUSH: CInt = 0x00100000

public val TDP_KTHREAD: CInt = 0x00200000

public val TDP_CALLCHAIN: CInt = 0x00400000

public val TDP_IGNSUSP: CInt = 0x00800000

public val TDP_AUDITREC: CInt = 0x01000000

public val TDP_RFPPWAIT: CInt = 0x02000000

public val TDP_RESETSPUR: CInt = 0x04000000

public val TDP_NERRNO: CInt = 0x08000000

public val TDP_EXECVMSPC: CInt = 0x40000000

public val TDI_SUSPENDED: CInt = 0x0001

public val TDI_SLEEPING: CInt = 0x0002

public val TDI_SWAPPED: CInt = 0x0004

public val TDI_LOCK: CInt = 0x0008

public val TDI_IWAIT: CInt = 0x0010

public val P_ADVLOCK: CInt = 0x00000001

public val P_CONTROLT: CInt = 0x00000002

public val P_KPROC: CInt = 0x00000004

public val P_UNUSED3: CInt = 0x00000008

public val P_IDLEPROC: CInt = 0x00000008

public val P_PPWAIT: CInt = 0x00000010

public val P_PROFIL: CInt = 0x00000020

public val P_STOPPROF: CInt = 0x00000040

public val P_HADTHREADS: CInt = 0x00000080

public val P_SUGID: CInt = 0x00000100

public val P_SYSTEM: CInt = 0x00000200

public val P_SINGLE_EXIT: CInt = 0x00000400

public val P_TRACED: CInt = 0x00000800

public val P_WAITED: CInt = 0x00001000

public val P_WEXIT: CInt = 0x00002000

public val P_EXEC: CInt = 0x00004000

public val P_WKILLED: CInt = 0x00008000

public val P_CONTINUED: CInt = 0x00010000

public val P_STOPPED_SIG: CInt = 0x00020000

public val P_STOPPED_TRACE: CInt = 0x00040000

public val P_STOPPED_SINGLE: CInt = 0x00080000

public val P_PROTECTED: CInt = 0x00100000

public val P_SIGEVENT: CInt = 0x00200000

public val P_SINGLE_BOUNDARY: CInt = 0x00400000

public val P_HWPMC: CInt = 0x00800000

public val P_JAILED: CInt = 0x01000000

public val P_TOTAL_STOP: CInt = 0x02000000

public val P_INEXEC: CInt = 0x04000000

public val P_STATCHILD: CInt = 0x08000000

public val P_INMEM: CInt = 0x10000000

public val P_SWAPPINGOUT: CInt = 0x20000000

public val P_SWAPPINGIN: CInt = 0x40000000

public val P_PPTRACE: CInt = 0x80000000.toInt()

public val P_STOPPED: CInt = P_STOPPED_SIG or P_STOPPED_SINGLE or P_STOPPED_TRACE

public val P2_INHERIT_PROTECTED: CInt = 0x00000001

public val P2_NOTRACE: CInt = 0x00000002

public val P2_NOTRACE_EXEC: CInt = 0x00000004

public val P2_AST_SU: CInt = 0x00000008

public val P2_PTRACE_FSTP: CInt = 0x00000010

public val P2_TRAPCAP: CInt = 0x00000020

public val P2_STKGAP_DISABLE: CInt = 0x00000800

public val P2_STKGAP_DISABLE_EXEC: CInt = 0x00001000

public val P_TREE_ORPHANED: CInt = 0x00000001

public val P_TREE_FIRST_ORPHAN: CInt = 0x00000002

public val P_TREE_REAPER: CInt = 0x00000004

public val SIDL: CChar = 1u

public val SRUN: CChar = 2u

public val SSLEEP: CChar = 3u

public val SSTOP: CChar = 4u

public val SZOMB: CChar = 5u

public val SWAIT: CChar = 6u

public val SLOCK: CChar = 7u

public val P_MAGIC: CInt = 0xbeefface.toInt()

public val TDP_SIGFASTBLOCK: CInt = 0x00000100

public val TDP_UIOHELD: CInt = 0x10000000

public val TDP_SIGFASTPENDING: CInt = 0x80000000.toInt()

public val TDP2_COMPAT32RB: CInt = 0x00000002

public val P2_PROTMAX_ENABLE: CInt = 0x00000200

public val P2_PROTMAX_DISABLE: CInt = 0x00000400

public val TDP2_SBPAGES: CInt = 0x00000001

public val P2_ASLR_ENABLE: CInt = 0x00000040

public val P2_ASLR_DISABLE: CInt = 0x00000080

public val P2_ASLR_IGNSTART: CInt = 0x00000100

public val P_TREE_GRPEXITED: CInt = 0x00000008

// libprocstat.h
public val PS_FST_VTYPE_VNON: CInt = 1

public val PS_FST_VTYPE_VREG: CInt = 2

public val PS_FST_VTYPE_VDIR: CInt = 3

public val PS_FST_VTYPE_VBLK: CInt = 4

public val PS_FST_VTYPE_VCHR: CInt = 5

public val PS_FST_VTYPE_VLNK: CInt = 6

public val PS_FST_VTYPE_VSOCK: CInt = 7

public val PS_FST_VTYPE_VFIFO: CInt = 8

public val PS_FST_VTYPE_VBAD: CInt = 9

public val PS_FST_VTYPE_UNKNOWN: CInt = 255

public val PS_FST_TYPE_VNODE: CInt = 1

public val PS_FST_TYPE_FIFO: CInt = 2

public val PS_FST_TYPE_SOCKET: CInt = 3

public val PS_FST_TYPE_PIPE: CInt = 4

public val PS_FST_TYPE_PTS: CInt = 5

public val PS_FST_TYPE_KQUEUE: CInt = 6

public val PS_FST_TYPE_MQUEUE: CInt = 8

public val PS_FST_TYPE_SHM: CInt = 9

public val PS_FST_TYPE_SEM: CInt = 10

public val PS_FST_TYPE_UNKNOWN: CInt = 11

public val PS_FST_TYPE_NONE: CInt = 12

public val PS_FST_TYPE_PROCDESC: CInt = 13

public val PS_FST_TYPE_DEV: CInt = 14

public val PS_FST_TYPE_EVENTFD: CInt = 15

public val PS_FST_UFLAG_RDIR: CInt = 0x0001

public val PS_FST_UFLAG_CDIR: CInt = 0x0002

public val PS_FST_UFLAG_JAIL: CInt = 0x0004

public val PS_FST_UFLAG_TRACE: CInt = 0x0008

public val PS_FST_UFLAG_TEXT: CInt = 0x0010

public val PS_FST_UFLAG_MMAP: CInt = 0x0020

public val PS_FST_UFLAG_CTTY: CInt = 0x0040

public val PS_FST_FFLAG_READ: CInt = 0x0001

public val PS_FST_FFLAG_WRITE: CInt = 0x0002

public val PS_FST_FFLAG_NONBLOCK: CInt = 0x0004

public val PS_FST_FFLAG_APPEND: CInt = 0x0008

public val PS_FST_FFLAG_SHLOCK: CInt = 0x0010

public val PS_FST_FFLAG_EXLOCK: CInt = 0x0020

public val PS_FST_FFLAG_ASYNC: CInt = 0x0040

public val PS_FST_FFLAG_SYNC: CInt = 0x0080

public val PS_FST_FFLAG_NOFOLLOW: CInt = 0x0100

public val PS_FST_FFLAG_CREAT: CInt = 0x0200

public val PS_FST_FFLAG_TRUNC: CInt = 0x0400

public val PS_FST_FFLAG_EXCL: CInt = 0x0800

public val PS_FST_FFLAG_DIRECT: CInt = 0x1000

public val PS_FST_FFLAG_EXEC: CInt = 0x2000

public val PS_FST_FFLAG_HASLOCK: CInt = 0x4000

// sys/mount.h

/**
 * File identifier.
 * These are unique per filesystem on a single machine.
 *
 * Note that the offset of fidData is 4 bytes, so care must be taken to avoid
 * undefined behavior accessing unaligned fields within an embedded struct.
 */
public val MAXFIDSZ: CInt = 16

/**
 * Length of type name including null.
 */
public val MFSNAMELEN: CInt = 16

/**
 * Size of on/from name bufs.
 */
public val MNAMELEN: CInt = 88

/**
 * Using journaled soft updates.
 */
public val MNT_SUJ: ULong = 0x100000000uL

/**
 * Mounted by automountd(8).
 */
public val MNT_AUTOMOUNTED: ULong = 0x200000000uL

/**
 * Filesys metadata untrusted.
 */
public val MNT_UNTRUSTED: ULong = 0x800000000uL

/**
 * Require TLS.
 */
public val MNT_EXTLS: ULong = 0x4000000000uL

/**
 * Require TLS with client cert.
 */
public val MNT_EXTLSCERT: ULong = 0x8000000000uL

/**
 * Require TLS with user cert.
 */
public val MNT_EXTLSCERTUSER: ULong = 0x10000000000uL

/**
 * Filesystem is stored locally.
 */
public val MNT_LOCAL: ULong = 0x000001000uL

/**
 * Quotas are enabled on fs.
 */
public val MNT_QUOTA: ULong = 0x000002000uL

/**
 * Identifies the root fs.
 */
public val MNT_ROOTFS: ULong = 0x000004000uL

/**
 * Mounted by a user.
 */
public val MNT_USER: ULong = 0x000008000uL

/**
 * Do not show entry in df.
 */
public val MNT_IGNORE: ULong = 0x000800000uL

/**
 * Filesystem is verified.
 */
public val MNT_VERIFIED: ULong = 0x400000000uL

/**
 * Do not cover a mount point.
 */
public val MNT_NOCOVER: ULong = 0x001000000000uL

/**
 * Only mount on empty dir.
 */
public val MNT_EMPTYDIR: ULong = 0x002000000000uL

/**
 * Recursively unmount uppers.
 */
public val MNT_RECURSE: ULong = 0x100000000000uL

/**
 * Unmount in async context.
 */
public val MNT_DEFERRED: ULong = 0x200000000000uL

/**
 * Get configured filesystems.
 */
public val VFS_VFSCONF: CInt = 0

/**
 * Generic filesystem information.
 */
public val VFS_GENERIC: CInt = 0

/**
 * int: highest defined filesystem type.
 */
public val VFS_MAXTYPENUM: CInt = 1

/**
 * struct: vfsconf for filesystem given as next argument.
 */
public val VFS_CONF: CInt = 2

/**
 * Synchronously wait for I/O to complete.
 */
public val MNT_WAIT: CInt = 1

/**
 * Start all I/O, but do not wait for it.
 */
public val MNT_NOWAIT: CInt = 2

/**
 * Push data not written by filesystem syncer.
 */
public val MNT_LAZY: CInt = 3

/**
 * Suspend file system after sync.
 */
public val MNT_SUSPEND: CInt = 4

public val MAXSECFLAVORS: CInt = 5

/**
 * Statically compiled into kernel.
 */
public val VFCF_STATIC: CInt = 0x00010000

/**
 * May get data over the network.
 */
public val VFCF_NETWORK: CInt = 0x00020000

/**
 * Writes are not implemented.
 */
public val VFCF_READONLY: CInt = 0x00040000

/**
 * Data does not represent real files.
 */
public val VFCF_SYNTHETIC: CInt = 0x00080000

/**
 * Aliases some other mounted FS.
 */
public val VFCF_LOOPBACK: CInt = 0x00100000

/**
 * Stores file names as Unicode.
 */
public val VFCF_UNICODE: CInt = 0x00200000

/**
 * Can be mounted from within a jail.
 */
public val VFCF_JAIL: CInt = 0x00400000

/**
 * Supports delegated administration.
 */
public val VFCF_DELEGADMIN: CInt = 0x00800000

/**
 * Stop at Boundary: defer stop requests to kernel->user (AST) transition.
 */
public val VFCF_SBDRY: CInt = 0x01000000

// time.h

/**
 * not on dst
 */
public val DST_NONE: CInt = 0

/**
 * USA style dst
 */
public val DST_USA: CInt = 1

/**
 * Australian style dst
 */
public val DST_AUST: CInt = 2

/**
 * Western European dst
 */
public val DST_WET: CInt = 3

/**
 * Middle European dst
 */
public val DST_MET: CInt = 4

/**
 * Eastern European dst
 */
public val DST_EET: CInt = 5

/**
 * Canada
 */
public val DST_CAN: CInt = 6

public val CPUCLOCK_WHICH_PID: CInt = 0

public val CPUCLOCK_WHICH_TID: CInt = 1

public val MFD_CLOEXEC: CUint = 0x00000001u

public val MFD_ALLOW_SEALING: CUint = 0x00000002u

public val MFD_HUGETLB: CUint = 0x00000004u

public val MFD_HUGE_MASK: CUint = 0xFC000000u

public val MFD_HUGE_64KB: CUint = 16u shl 26

public val MFD_HUGE_512KB: CUint = 19u shl 26

public val MFD_HUGE_1MB: CUint = 20u shl 26

public val MFD_HUGE_2MB: CUint = 21u shl 26

public val MFD_HUGE_8MB: CUint = 23u shl 26

public val MFD_HUGE_16MB: CUint = 24u shl 26

public val MFD_HUGE_32MB: CUint = 25u shl 26

public val MFD_HUGE_256MB: CUint = 28u shl 26

public val MFD_HUGE_512MB: CUint = 29u shl 26

public val MFD_HUGE_1GB: CUint = 30u shl 26

public val MFD_HUGE_2GB: CUint = 31u shl 26

public val MFD_HUGE_16GB: CUint = 34u shl 26

public val SHM_LARGEPAGE_ALLOC_DEFAULT: CInt = 0

public val SHM_LARGEPAGE_ALLOC_NOWAIT: CInt = 1

public val SHM_LARGEPAGE_ALLOC_HARD: CInt = 2

public val SHM_RENAME_NOREPLACE: CInt = 1 shl 0

public val SHM_RENAME_EXCHANGE: CInt = 1 shl 1

// sys/umtx.h
public val UMTX_OP_WAIT: CInt = 2

public val UMTX_OP_WAKE: CInt = 3

public val UMTX_OP_MUTEX_TRYLOCK: CInt = 4

public val UMTX_OP_MUTEX_LOCK: CInt = 5

public val UMTX_OP_MUTEX_UNLOCK: CInt = 6

public val UMTX_OP_SET_CEILING: CInt = 7

public val UMTX_OP_CV_WAIT: CInt = 8

public val UMTX_OP_CV_SIGNAL: CInt = 9

public val UMTX_OP_CV_BROADCAST: CInt = 10

public val UMTX_OP_WAIT_UINT: CInt = 11

public val UMTX_OP_RW_RDLOCK: CInt = 12

public val UMTX_OP_RW_WRLOCK: CInt = 13

public val UMTX_OP_RW_UNLOCK: CInt = 14

public val UMTX_OP_WAIT_UINT_PRIVATE: CInt = 15

public val UMTX_OP_WAKE_PRIVATE: CInt = 16

public val UMTX_OP_MUTEX_WAIT: CInt = 17

public val UMTX_OP_NWAKE_PRIVATE: CInt = 21

public val UMTX_OP_MUTEX_WAKE2: CInt = 22

public val UMTX_OP_SEM2_WAIT: CInt = 23

public val UMTX_OP_SEM2_WAKE: CInt = 24

public val UMTX_OP_SHM: CInt = 25

public val UMTX_OP_ROBUST_LISTS: CInt = 26

public val UMTX_ABSTIME: UInt = 1u

public val CPU_LEVEL_ROOT: CInt = 1

public val CPU_LEVEL_CPUSET: CInt = 2

public val CPU_LEVEL_WHICH: CInt = 3

public val CPU_WHICH_TID: CInt = 1

public val CPU_WHICH_PID: CInt = 2

public val CPU_WHICH_CPUSET: CInt = 3

public val CPU_WHICH_IRQ: CInt = 4

public val CPU_WHICH_JAIL: CInt = 5

// net/route.h
public val RTF_LLDATA: CInt = 0x400

public val RTF_FIXEDMTU: CInt = 0x80000

public val RTM_VERSION: CInt = 5

public val RTAX_MAX: CInt = 8

// sys/signal.h
public val SIGTHR: CInt = 32

public val SIGLWP: CInt = SIGTHR
