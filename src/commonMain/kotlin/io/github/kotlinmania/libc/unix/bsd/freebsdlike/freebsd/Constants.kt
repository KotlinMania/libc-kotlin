// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.PATH_MAX
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.CLOCK_MONOTONIC_FAST
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.CLOCK_REALTIME_FAST
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.CLOCK_UPTIME
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.RLIM_INFINITY

public const val LIO_VECTORED: Int = 4

public const val LIO_WRITEV: Int = 5

public const val LIO_READV: Int = 6

public const val CAP_RIGHTS_VERSION_00: Int = 0

public const val CAP_RIGHTS_VERSION: Int = CAP_RIGHTS_VERSION_00

public val CAP_READ: ULong = capRight(0, 0x0000000000000001uL)

public val CAP_WRITE: ULong = capRight(0, 0x0000000000000002uL)

public val CAP_SEEK_TELL: ULong = capRight(0, 0x0000000000000004uL)

public val CAP_SEEK: ULong = CAP_SEEK_TELL or 0x0000000000000008uL

public val CAP_PREAD: ULong = CAP_SEEK or CAP_READ

public val CAP_PWRITE: ULong = CAP_SEEK or CAP_WRITE

public val CAP_MMAP: ULong = capRight(0, 0x0000000000000010uL)

public val CAP_MMAP_R: ULong = CAP_MMAP or CAP_SEEK or CAP_READ

public val CAP_MMAP_W: ULong = CAP_MMAP or CAP_SEEK or CAP_WRITE

public val CAP_MMAP_X: ULong = CAP_MMAP or CAP_SEEK or 0x0000000000000020uL

public val CAP_MMAP_RW: ULong = CAP_MMAP_R or CAP_MMAP_W

public val CAP_MMAP_RX: ULong = CAP_MMAP_R or CAP_MMAP_X

public val CAP_MMAP_WX: ULong = CAP_MMAP_W or CAP_MMAP_X

public val CAP_MMAP_RWX: ULong = CAP_MMAP_R or CAP_MMAP_W or CAP_MMAP_X

public val CAP_CREATE: ULong = capRight(0, 0x0000000000000040uL)

public val CAP_FEXECVE: ULong = capRight(0, 0x0000000000000080uL)

public val CAP_FSYNC: ULong = capRight(0, 0x0000000000000100uL)

public val CAP_FTRUNCATE: ULong = capRight(0, 0x0000000000000200uL)

public val CAP_LOOKUP: ULong = capRight(0, 0x0000000000000400uL)

public val CAP_FCHDIR: ULong = capRight(0, 0x0000000000000800uL)

public val CAP_FCHFLAGS: ULong = capRight(0, 0x0000000000001000uL)

public val CAP_CHFLAGSAT: ULong = CAP_FCHFLAGS or CAP_LOOKUP

public val CAP_FCHMOD: ULong = capRight(0, 0x0000000000002000uL)

public val CAP_FCHMODAT: ULong = CAP_FCHMOD or CAP_LOOKUP

public val CAP_FCHOWN: ULong = capRight(0, 0x0000000000004000uL)

public val CAP_FCHOWNAT: ULong = CAP_FCHOWN or CAP_LOOKUP

public val CAP_FCNTL: ULong = capRight(0, 0x0000000000008000uL)

public val CAP_FLOCK: ULong = capRight(0, 0x0000000000010000uL)

public val CAP_FPATHCONF: ULong = capRight(0, 0x0000000000020000uL)

public val CAP_FSCK: ULong = capRight(0, 0x0000000000040000uL)

public val CAP_FSTAT: ULong = capRight(0, 0x0000000000080000uL)

public val CAP_FSTATAT: ULong = CAP_FSTAT or CAP_LOOKUP

public val CAP_FSTATFS: ULong = capRight(0, 0x0000000000100000uL)

public val CAP_FUTIMES: ULong = capRight(0, 0x0000000000200000uL)

public val CAP_FUTIMESAT: ULong = CAP_FUTIMES or CAP_LOOKUP

public val CAP_LINKAT_TARGET: ULong = CAP_LOOKUP or 0x0000000000400000uL

public val CAP_MKDIRAT: ULong = CAP_LOOKUP or 0x0000000000800000uL

public val CAP_MKFIFOAT: ULong = CAP_LOOKUP or 0x0000000001000000uL

public val CAP_MKNODAT: ULong = CAP_LOOKUP or 0x0000000002000000uL

public val CAP_RENAMEAT_SOURCE: ULong = CAP_LOOKUP or 0x0000000004000000uL

public val CAP_SYMLINKAT: ULong = CAP_LOOKUP or 0x0000000008000000uL

public val CAP_UNLINKAT: ULong = CAP_LOOKUP or 0x0000000010000000uL

public val CAP_ACCEPT: ULong = capRight(0, 0x0000000020000000uL)

public val CAP_BIND: ULong = capRight(0, 0x0000000040000000uL)

public val CAP_CONNECT: ULong = capRight(0, 0x0000000080000000uL)

public val CAP_GETPEERNAME: ULong = capRight(0, 0x0000000100000000uL)

public val CAP_GETSOCKNAME: ULong = capRight(0, 0x0000000200000000uL)

public val CAP_GETSOCKOPT: ULong = capRight(0, 0x0000000400000000uL)

public val CAP_LISTEN: ULong = capRight(0, 0x0000000800000000uL)

public val CAP_PEELOFF: ULong = capRight(0, 0x0000001000000000uL)

public val CAP_RECV: ULong = CAP_READ

public val CAP_SEND: ULong = CAP_WRITE

public val CAP_SETSOCKOPT: ULong = capRight(0, 0x0000002000000000uL)

public val CAP_SHUTDOWN: ULong = capRight(0, 0x0000004000000000uL)

public val CAP_BINDAT: ULong = CAP_LOOKUP or 0x0000008000000000uL

public val CAP_CONNECTAT: ULong = CAP_LOOKUP or 0x0000010000000000uL

public val CAP_LINKAT_SOURCE: ULong = CAP_LOOKUP or 0x0000020000000000uL

public val CAP_RENAMEAT_TARGET: ULong = CAP_LOOKUP or 0x0000040000000000uL

public val CAP_SOCK_CLIENT: ULong = CAP_CONNECT or CAP_GETPEERNAME or CAP_GETSOCKNAME or CAP_GETSOCKOPT or CAP_PEELOFF or CAP_RECV or CAP_SEND or CAP_SETSOCKOPT or CAP_SHUTDOWN

public val CAP_SOCK_SERVER: ULong = CAP_ACCEPT or CAP_BIND or CAP_GETPEERNAME or CAP_GETSOCKNAME or CAP_GETSOCKOPT or CAP_LISTEN or CAP_PEELOFF or CAP_RECV or CAP_SEND or CAP_SETSOCKOPT or CAP_SHUTDOWN

public val CAP_ALL0: ULong = capRight(0, 0x000007FFFFFFFFFFuL)

public val CAP_UNUSED0_44: ULong = capRight(0, 0x0000080000000000uL)

public val CAP_UNUSED0_57: ULong = capRight(0, 0x0100000000000000uL)

public val CAP_MAC_GET: ULong = capRight(1, 0x0000000000000001uL)

public val CAP_MAC_SET: ULong = capRight(1, 0x0000000000000002uL)

public val CAP_SEM_GETVALUE: ULong = capRight(1, 0x0000000000000004uL)

public val CAP_SEM_POST: ULong = capRight(1, 0x0000000000000008uL)

public val CAP_SEM_WAIT: ULong = capRight(1, 0x0000000000000010uL)

public val CAP_EVENT: ULong = capRight(1, 0x0000000000000020uL)

public val CAP_KQUEUE_EVENT: ULong = capRight(1, 0x0000000000000040uL)

public val CAP_IOCTL: ULong = capRight(1, 0x0000000000000080uL)

public val CAP_TTYHOOK: ULong = capRight(1, 0x0000000000000100uL)

public val CAP_PDGETPID: ULong = capRight(1, 0x0000000000000200uL)

public val CAP_PDWAIT: ULong = capRight(1, 0x0000000000000400uL)

public val CAP_PDKILL: ULong = capRight(1, 0x0000000000000800uL)

public val CAP_EXTATTR_DELETE: ULong = capRight(1, 0x0000000000001000uL)

public val CAP_EXTATTR_GET: ULong = capRight(1, 0x0000000000002000uL)

public val CAP_EXTATTR_LIST: ULong = capRight(1, 0x0000000000004000uL)

public val CAP_EXTATTR_SET: ULong = capRight(1, 0x0000000000008000uL)

public val CAP_ACL_CHECK: ULong = capRight(1, 0x0000000000010000uL)

public val CAP_ACL_DELETE: ULong = capRight(1, 0x0000000000020000uL)

public val CAP_ACL_GET: ULong = capRight(1, 0x0000000000040000uL)

public val CAP_ACL_SET: ULong = capRight(1, 0x0000000000080000uL)

public val CAP_KQUEUE_CHANGE: ULong = capRight(1, 0x0000000000100000uL)

public val CAP_KQUEUE: ULong = CAP_KQUEUE_EVENT or CAP_KQUEUE_CHANGE

public val CAP_ALL1: ULong = capRight(1, 0x00000000001FFFFFuL)

public val CAP_UNUSED1_22: ULong = capRight(1, 0x0000000000200000uL)

public val CAP_UNUSED1_57: ULong = capRight(1, 0x0100000000000000uL)

public val CAP_FCNTL_GETFL: UInt = 1u shl 3

public val CAP_FCNTL_SETFL: UInt = 1u shl 4

public val CAP_FCNTL_GETOWN: UInt = 1u shl 5

public val CAP_FCNTL_SETOWN: UInt = 1u shl 6

public const val DEVSTAT_N_TRANS_FLAGS: Int = 4

public const val DEVSTAT_NAME_LEN: Int = 16

public const val CPU_SETSIZE: Int = 1024

public const val SIGEV_THREAD_ID: Int = 4

public const val EXTATTR_NAMESPACE_EMPTY: Int = 0

public const val EXTATTR_NAMESPACE_USER: Int = 1

public const val EXTATTR_NAMESPACE_SYSTEM: Int = 2

public const val PTHREAD_STACK_MIN: ULong = MINSIGSTKSZ

public const val PTHREAD_MUTEX_ADAPTIVE_NP: Int = 4

public const val PTHREAD_MUTEX_STALLED: Int = 0

public const val PTHREAD_MUTEX_ROBUST: Int = 1

public val SIGSTKSZ: ULong = MINSIGSTKSZ + 32768u

public const val SF_NODISKIO: Int = 0x00000001

public const val SF_MNOWAIT: Int = 0x00000002

public const val SF_SYNC: Int = 0x00000004

public const val SF_USER_READAHEAD: Int = 0x00000008

public const val SF_NOCACHE: Int = 0x00000010

public const val O_CLOEXEC: Int = 0x00100000

public const val O_DIRECTORY: Int = 0x00020000

public const val O_DSYNC: Int = 0x01000000

public const val O_EMPTY_PATH: Int = 0x02000000

public const val O_EXEC: Int = 0x00040000

public const val O_PATH: Int = 0x00400000

public const val O_RESOLVE_BENEATH: Int = 0x00800000

public const val O_SEARCH: Int = O_EXEC

public const val O_TTY_INIT: Int = 0x00080000

public const val O_VERIFY: Int = 0x00200000

public const val F_GETLK: Int = 11

public const val F_SETLK: Int = 12

public const val F_SETLKW: Int = 13

public const val ENOTCAPABLE: Int = 93

public const val ECAPMODE: Int = 94

public const val ENOTRECOVERABLE: Int = 95

public const val EOWNERDEAD: Int = 96

public const val EINTEGRITY: Int = 97

public const val RLIMIT_NPTS: Int = 11

public const val RLIMIT_SWAP: Int = 12

public const val RLIMIT_KQUEUES: Int = 13

public const val RLIMIT_UMTXP: Int = 14

public const val RLIM_NLIMITS: Long = 15

public const val RLIM_SAVED_MAX: Long = RLIM_INFINITY

public const val RLIM_SAVED_CUR: Long = RLIM_INFINITY

public const val CP_USER: Int = 0

public const val CP_NICE: Int = 1

public const val CP_SYS: Int = 2

public const val CP_INTR: Int = 3

public const val CP_IDLE: Int = 4

public const val CPUSTATES: Int = 5

public const val NI_NOFQDN: Int = 0x00000001

public const val NI_NUMERICHOST: Int = 0x00000002

public const val NI_NAMEREQD: Int = 0x00000004

public const val NI_NUMERICSERV: Int = 0x00000008

public const val NI_DGRAM: Int = 0x00000010

public const val NI_NUMERICSCOPE: Int = 0x00000020

public const val XU_NGROUPS: Int = 16

public const val Q_GETQUOTA: Int = 0x700

public const val Q_SETQUOTA: Int = 0x800

public const val MAP_GUARD: Int = 0x00002000

public const val MAP_EXCL: Int = 0x00004000

public const val MAP_PREFAULT_READ: Int = 0x00040000

public const val MAP_ALIGNMENT_SHIFT: Int = 24

public val MAP_ALIGNMENT_MASK: Int = 0xff shl MAP_ALIGNMENT_SHIFT

public val MAP_ALIGNED_SUPER: Int = 1 shl MAP_ALIGNMENT_SHIFT

public const val POSIX_FADV_NORMAL: Int = 0

public const val POSIX_FADV_RANDOM: Int = 1

public const val POSIX_FADV_SEQUENTIAL: Int = 2

public const val POSIX_FADV_WILLNEED: Int = 3

public const val POSIX_FADV_DONTNEED: Int = 4

public const val POSIX_FADV_NOREUSE: Int = 5

public const val POLLINIGNEOF: Short = 0x2000

public const val POLLRDHUP: Short = 0x4000

public const val EVFILT_READ: Short = -1

public const val EVFILT_WRITE: Short = -2

public const val EVFILT_AIO: Short = -3

public const val EVFILT_VNODE: Short = -4

public const val EVFILT_PROC: Short = -5

public const val EVFILT_SIGNAL: Short = -6

public const val EVFILT_TIMER: Short = -7

public const val EVFILT_PROCDESC: Short = -8

public const val EVFILT_FS: Short = -9

public const val EVFILT_LIO: Short = -10

public const val EVFILT_USER: Short = -11

public const val EVFILT_SENDFILE: Short = -12

public const val EVFILT_EMPTY: Short = -13

public val EV_ADD: UShort = (0x1).toUShort()

public val EV_DELETE: UShort = (0x2).toUShort()

public val EV_ENABLE: UShort = (0x4).toUShort()

public val EV_DISABLE: UShort = (0x8).toUShort()

public val EV_FORCEONESHOT: UShort = (0x100).toUShort()

public val EV_KEEPUDATA: UShort = (0x200).toUShort()

public val EV_ONESHOT: UShort = (0x10).toUShort()

public val EV_CLEAR: UShort = (0x20).toUShort()

public val EV_RECEIPT: UShort = (0x40).toUShort()

public val EV_DISPATCH: UShort = (0x80).toUShort()

public val EV_SYSFLAGS: UShort = (0xf000).toUShort()

public val EV_DROP: UShort = (0x1000).toUShort()

public val EV_FLAG1: UShort = (0x2000).toUShort()

public val EV_FLAG2: UShort = (0x4000).toUShort()

public val EV_EOF: UShort = (0x8000).toUShort()

public val EV_ERROR: UShort = (0x4000).toUShort()

public const val NOTE_TRIGGER: UInt = 0x01000000u

public const val NOTE_FFNOP: UInt = 0x00000000u

public const val NOTE_FFAND: UInt = 0x40000000u

public const val NOTE_FFOR: UInt = 0x80000000u

public const val NOTE_FFCOPY: UInt = 0xc0000000u

public const val NOTE_FFCTRLMASK: UInt = 0xc0000000u

public const val NOTE_FFLAGSMASK: UInt = 0x00ffffffu

public const val NOTE_LOWAT: UInt = 0x00000001u

public const val NOTE_FILE_POLL: UInt = 0x00000002u

public const val NOTE_DELETE: UInt = 0x00000001u

public const val NOTE_WRITE: UInt = 0x00000002u

public const val NOTE_EXTEND: UInt = 0x00000004u

public const val NOTE_ATTRIB: UInt = 0x00000008u

public const val NOTE_LINK: UInt = 0x00000010u

public const val NOTE_RENAME: UInt = 0x00000020u

public const val NOTE_REVOKE: UInt = 0x00000040u

public const val NOTE_OPEN: UInt = 0x00000080u

public const val NOTE_CLOSE: UInt = 0x00000100u

public const val NOTE_CLOSE_WRITE: UInt = 0x00000200u

public const val NOTE_READ: UInt = 0x00000400u

public const val NOTE_EXIT: UInt = 0x80000000u

public const val NOTE_FORK: UInt = 0x40000000u

public const val NOTE_EXEC: UInt = 0x20000000u

public const val NOTE_PDATAMASK: UInt = 0x000fffffu

public const val NOTE_PCTRLMASK: UInt = 0xf0000000u

public const val NOTE_TRACK: UInt = 0x00000001u

public const val NOTE_TRACKERR: UInt = 0x00000002u

public const val NOTE_CHILD: UInt = 0x00000004u

public const val NOTE_SECONDS: UInt = 0x00000001u

public const val NOTE_MSECONDS: UInt = 0x00000002u

public const val NOTE_USECONDS: UInt = 0x00000004u

public const val NOTE_NSECONDS: UInt = 0x00000008u

public const val NOTE_ABSTIME: UInt = 0x00000010u

public const val MADV_PROTECT: Int = 10

public const val CTL_UNSPEC: Int = 0

public const val CTL_SYSCTL: Int = 0

public const val CTL_KERN: Int = 1

public const val CTL_VM: Int = 2

public const val CTL_VFS: Int = 3

public const val CTL_NET: Int = 4

public const val CTL_DEBUG: Int = 5

public const val CTL_HW: Int = 6

public const val CTL_MACHDEP: Int = 7

public const val CTL_USER: Int = 8

public const val CTL_P1003_1B: Int = 9

public const val CTL_MAXNAME: Int = 24

public const val CTLTYPE: Int = 0xf

public const val CTLTYPE_NODE: Int = 1

public const val CTLTYPE_INT: Int = 2

public const val CTLTYPE_STRING: Int = 3

public const val CTLTYPE_S64: Int = 4

public const val CTLTYPE_OPAQUE: Int = 5

public const val CTLTYPE_STRUCT: Int = CTLTYPE_OPAQUE

public const val CTLTYPE_UINT: Int = 6

public const val CTLTYPE_LONG: Int = 7

public const val CTLTYPE_ULONG: Int = 8

public const val CTLTYPE_U64: Int = 9

public const val CTLTYPE_U8: Int = 0xa

public const val CTLTYPE_U16: Int = 0xb

public const val CTLTYPE_S8: Int = 0xc

public const val CTLTYPE_S16: Int = 0xd

public const val CTLTYPE_S32: Int = 0xe

public const val CTLTYPE_U32: Int = 0xf

public const val CTLFLAG_RD: Int = 0x80000000.toInt()

public const val CTLFLAG_WR: Int = 0x40000000

public val CTLFLAG_RW: Int = CTLFLAG_RD or CTLFLAG_WR

public const val CTLFLAG_DORMANT: Int = 0x20000000

public const val CTLFLAG_ANYBODY: Int = 0x10000000

public const val CTLFLAG_SECURE: Int = 0x08000000

public const val CTLFLAG_PRISON: Int = 0x04000000

public const val CTLFLAG_DYN: Int = 0x02000000

public const val CTLFLAG_SKIP: Int = 0x01000000

public const val CTLMASK_SECURE: Int = 0x00F00000

public const val CTLFLAG_TUN: Int = 0x00080000

public val CTLFLAG_RDTUN: Int = CTLFLAG_RD or CTLFLAG_TUN

public val CTLFLAG_RWTUN: Int = CTLFLAG_RW or CTLFLAG_TUN

public const val CTLFLAG_MPSAFE: Int = 0x00040000

public const val CTLFLAG_VNET: Int = 0x00020000

public const val CTLFLAG_DYING: Int = 0x00010000

public const val CTLFLAG_CAPRD: Int = 0x00008000

public const val CTLFLAG_CAPWR: Int = 0x00004000

public const val CTLFLAG_STATS: Int = 0x00002000

public const val CTLFLAG_NOFETCH: Int = 0x00001000

public val CTLFLAG_CAPRW: Int = CTLFLAG_CAPRD or CTLFLAG_CAPWR

public const val CTLFLAG_NEEDGIANT: Int = 0x00000800

public const val CTLSHIFT_SECURE: Int = 20

public val CTLFLAG_SECURE1: Int = CTLFLAG_SECURE or (0 shl CTLSHIFT_SECURE)

public val CTLFLAG_SECURE2: Int = CTLFLAG_SECURE or (1 shl CTLSHIFT_SECURE)

public val CTLFLAG_SECURE3: Int = CTLFLAG_SECURE or (2 shl CTLSHIFT_SECURE)

public const val OID_AUTO: Int = -1

public const val CTL_SYSCTL_DEBUG: Int = 0

public const val CTL_SYSCTL_NAME: Int = 1

public const val CTL_SYSCTL_NEXT: Int = 2

public const val CTL_SYSCTL_NAME2OID: Int = 3

public const val CTL_SYSCTL_OIDFMT: Int = 4

public const val CTL_SYSCTL_OIDDESCR: Int = 5

public const val CTL_SYSCTL_OIDLABEL: Int = 6

public const val CTL_SYSCTL_NEXTNOSKIP: Int = 7

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

public const val KERN_HOSTUUID: Int = 36

public const val KERN_ARND: Int = 37

public const val KERN_MAXPHYS: Int = 38

public const val KERN_PROC_ALL: Int = 0

public const val KERN_PROC_PID: Int = 1

public const val KERN_PROC_PGRP: Int = 2

public const val KERN_PROC_SESSION: Int = 3

public const val KERN_PROC_TTY: Int = 4

public const val KERN_PROC_UID: Int = 5

public const val KERN_PROC_RUID: Int = 6

public const val KERN_PROC_ARGS: Int = 7

public const val KERN_PROC_PROC: Int = 8

public const val KERN_PROC_SV_NAME: Int = 9

public const val KERN_PROC_RGID: Int = 10

public const val KERN_PROC_GID: Int = 11

public const val KERN_PROC_PATHNAME: Int = 12

public const val KERN_PROC_OVMMAP: Int = 13

public const val KERN_PROC_OFILEDESC: Int = 14

public const val KERN_PROC_KSTACK: Int = 15

public const val KERN_PROC_INC_THREAD: Int = 0x10

public const val KERN_PROC_VMMAP: Int = 32

public const val KERN_PROC_FILEDESC: Int = 33

public const val KERN_PROC_GROUPS: Int = 34

public const val KERN_PROC_ENV: Int = 35

public const val KERN_PROC_AUXV: Int = 36

public const val KERN_PROC_RLIMIT: Int = 37

public const val KERN_PROC_PS_STRINGS: Int = 38

public const val KERN_PROC_UMASK: Int = 39

public const val KERN_PROC_OSREL: Int = 40

public const val KERN_PROC_SIGTRAMP: Int = 41

public const val KERN_PROC_CWD: Int = 42

public const val KERN_PROC_NFDS: Int = 43

public const val KERN_PROC_SIGFASTBLK: Int = 44

public const val KIPC_MAXSOCKBUF: Int = 1

public const val KIPC_SOCKBUF_WASTE: Int = 2

public const val KIPC_SOMAXCONN: Int = 3

public const val KIPC_MAX_LINKHDR: Int = 4

public const val KIPC_MAX_PROTOHDR: Int = 5

public const val KIPC_MAX_HDR: Int = 6

public const val KIPC_MAX_DATALEN: Int = 7

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

public const val HW_REALMEM: Int = 12

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

public const val USER_LOCALBASE: Int = 21

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

public const val CTL_P1003_1B_MQ_OPEN_MAX: Int = 19

public const val CTL_P1003_1B_PAGESIZE: Int = 20

public const val CTL_P1003_1B_RTSIG_MAX: Int = 21

public const val CTL_P1003_1B_SEM_NSEMS_MAX: Int = 22

public const val CTL_P1003_1B_SEM_VALUE_MAX: Int = 23

public const val CTL_P1003_1B_SIGQUEUE_MAX: Int = 24

public const val CTL_P1003_1B_TIMER_MAX: Int = 25

public const val TIOCGPTN: ULong = 0x4004740fuL

public const val TIOCPTMASTER: ULong = 0x2000741cuL

public const val TIOCSIG: ULong = 0x2004745fuL

public const val TIOCM_DCD: Int = 0x40

public const val H4DISC: Int = 0x7

public const val VM_TOTAL: Int = 1

public const val BIOCSETFNR: ULong = 0x80104282uL

public const val FIODGNAME: ULong = 0x80106678uL

public const val FIONWRITE: ULong = 0x40046677uL

public const val FIONSPACE: ULong = 0x40046676uL

public const val FIOSEEKDATA: ULong = 0xc0086661uL

public const val FIOSEEKHOLE: ULong = 0xc0086662uL

public const val FIOSSHMLPGCNF: ULong = 0x80306664uL

public const val JAIL_API_VERSION: UInt = 2u

public const val JAIL_CREATE: Int = 0x01

public const val JAIL_UPDATE: Int = 0x02

public const val JAIL_ATTACH: Int = 0x04

public const val JAIL_DYING: Int = 0x08

public const val JAIL_SYS_DISABLE: Int = 0

public const val JAIL_SYS_NEW: Int = 1

public const val JAIL_SYS_INHERIT: Int = 2

public const val MNT_ACLS: Int = 0x08000000

public const val MNT_BYFSID: Int = 0x08000000

public const val MNT_GJOURNAL: Int = 0x02000000

public const val MNT_MULTILABEL: Int = 0x04000000

public const val MNT_NFS4ACLS: Int = 0x00000010

public const val MNT_SNAPSHOT: Int = 0x01000000

public const val MNT_UNION: Int = 0x00000020

public const val MNT_NONBUSY: Int = 0x04000000

public const val SCM_BINTIME: Int = 0x04

public const val SCM_REALTIME: Int = 0x05

public const val SCM_MONOTONIC: Int = 0x06

public const val SCM_TIME_INFO: Int = 0x07

public const val SCM_CREDS2: Int = 0x08

public const val SO_BINTIME: Int = 0x2000

public const val SO_NO_OFFLOAD: Int = 0x4000

public const val SO_NO_DDP: Int = 0x8000

public const val SO_REUSEPORT_LB: Int = 0x10000

public const val SO_LABEL: Int = 0x1009

public const val SO_PEERLABEL: Int = 0x1010

public const val SO_LISTENQLIMIT: Int = 0x1011

public const val SO_LISTENQLEN: Int = 0x1012

public const val SO_LISTENINCQLEN: Int = 0x1013

public const val SO_SETFIB: Int = 0x1014

public const val SO_USER_COOKIE: Int = 0x1015

public const val SO_PROTOCOL: Int = 0x1016

public const val SO_PROTOTYPE: Int = SO_PROTOCOL

public const val SO_TS_CLOCK: Int = 0x1017

public const val SO_DOMAIN: Int = 0x1019

public const val SO_SPLICE: Int = 0x1023

public const val SO_VENDOR: Int = 0x80000000.toInt()

public const val SO_TS_REALTIME_MICRO: Int = 0

public const val SO_TS_BINTIME: Int = 1

public const val SO_TS_REALTIME: Int = 2

public const val SO_TS_MONOTONIC: Int = 3

public const val SO_TS_DEFAULT: Int = SO_TS_REALTIME_MICRO

public const val SO_TS_CLOCK_MAX: Int = SO_TS_MONOTONIC

public const val LOCAL_CREDS: Int = 2

public const val LOCAL_CREDS_PERSISTENT: Int = 3

public const val LOCAL_CONNWAIT: Int = 4

public const val LOCAL_VENDOR: Int = SO_VENDOR

public const val PL_EVENT_NONE: Int = 0

public const val PL_EVENT_SIGNAL: Int = 1

public const val PL_FLAG_SA: Int = 0x01

public const val PL_FLAG_BOUND: Int = 0x02

public const val PL_FLAG_SCE: Int = 0x04

public const val PL_FLAG_SCX: Int = 0x08

public const val PL_FLAG_EXEC: Int = 0x10

public const val PL_FLAG_SI: Int = 0x20

public const val PL_FLAG_FORKED: Int = 0x40

public const val PL_FLAG_CHILD: Int = 0x80

public const val PL_FLAG_BORN: Int = 0x100

public const val PL_FLAG_EXITED: Int = 0x200

public const val PL_FLAG_VFORKED: Int = 0x400

public const val PL_FLAG_VFORK_DONE: Int = 0x800

public const val PT_LWPINFO: Int = 13

public const val PT_GETNUMLWPS: Int = 14

public const val PT_GETLWPLIST: Int = 15

public const val PT_CLEARSTEP: Int = 16

public const val PT_SETSTEP: Int = 17

public const val PT_SUSPEND: Int = 18

public const val PT_RESUME: Int = 19

public const val PT_TO_SCE: Int = 20

public const val PT_TO_SCX: Int = 21

public const val PT_SYSCALL: Int = 22

public const val PT_FOLLOW_FORK: Int = 23

public const val PT_LWP_EVENTS: Int = 24

public const val PT_GET_EVENT_MASK: Int = 25

public const val PT_SET_EVENT_MASK: Int = 26

public const val PT_GET_SC_ARGS: Int = 27

public const val PT_GET_SC_RET: Int = 28

public const val PT_COREDUMP: Int = 29

public const val PT_GETREGS: Int = 33

public const val PT_SETREGS: Int = 34

public const val PT_GETFPREGS: Int = 35

public const val PT_SETFPREGS: Int = 36

public const val PT_GETDBREGS: Int = 37

public const val PT_SETDBREGS: Int = 38

public const val PT_VM_TIMESTAMP: Int = 40

public const val PT_VM_ENTRY: Int = 41

public const val PT_GETREGSET: Int = 42

public const val PT_SETREGSET: Int = 43

public const val PT_SC_REMOTE: Int = 44

public const val PT_FIRSTMACH: Int = 64

public const val PTRACE_EXEC: Int = 0x0001

public const val PTRACE_SCE: Int = 0x0002

public const val PTRACE_SCX: Int = 0x0004

public val PTRACE_SYSCALL: Int = PTRACE_SCE or PTRACE_SCX

public const val PTRACE_FORK: Int = 0x0008

public const val PTRACE_LWP: Int = 0x0010

public const val PTRACE_VFORK: Int = 0x0020

public const val PTRACE_DEFAULT: Int = PTRACE_EXEC

public const val PC_COMPRESS: UInt = 0x00000001u

public const val PC_ALL: UInt = 0x00000002u

public const val PROC_SPROTECT: Int = 1

public const val PROC_REAP_ACQUIRE: Int = 2

public const val PROC_REAP_RELEASE: Int = 3

public const val PROC_REAP_STATUS: Int = 4

public const val PROC_REAP_GETPIDS: Int = 5

public const val PROC_REAP_KILL: Int = 6

public const val PROC_TRACE_CTL: Int = 7

public const val PROC_TRACE_STATUS: Int = 8

public const val PROC_TRAPCAP_CTL: Int = 9

public const val PROC_TRAPCAP_STATUS: Int = 10

public const val PROC_PDEATHSIG_CTL: Int = 11

public const val PROC_PDEATHSIG_STATUS: Int = 12

public const val PROC_ASLR_CTL: Int = 13

public const val PROC_ASLR_STATUS: Int = 14

public const val PROC_PROTMAX_CTL: Int = 15

public const val PROC_PROTMAX_STATUS: Int = 16

public const val PROC_STACKGAP_CTL: Int = 17

public const val PROC_STACKGAP_STATUS: Int = 18

public const val PROC_NO_NEW_PRIVS_CTL: Int = 19

public const val PROC_NO_NEW_PRIVS_STATUS: Int = 20

public const val PROC_WXMAP_CTL: Int = 21

public const val PROC_WXMAP_STATUS: Int = 22

public const val PROC_PROCCTL_MD_MIN: Int = 0x10000000

public const val PPROT_SET: Int = 1

public const val PPROT_CLEAR: Int = 2

public const val PPROT_DESCEND: Int = 0x10

public const val PPROT_INHERIT: Int = 0x20

public const val PROC_TRACE_CTL_ENABLE: Int = 1

public const val PROC_TRACE_CTL_DISABLE: Int = 2

public const val PROC_TRACE_CTL_DISABLE_EXEC: Int = 3

public const val PROC_TRAPCAP_CTL_ENABLE: Int = 1

public const val PROC_TRAPCAP_CTL_DISABLE: Int = 2

public const val PROC_ASLR_FORCE_ENABLE: Int = 1

public const val PROC_ASLR_FORCE_DISABLE: Int = 2

public const val PROC_ASLR_NOFORCE: Int = 3

public const val PROC_ASLR_ACTIVE: Int = 0x80000000.toInt()

public const val PROC_PROTMAX_FORCE_ENABLE: Int = 1

public const val PROC_PROTMAX_FORCE_DISABLE: Int = 2

public const val PROC_PROTMAX_NOFORCE: Int = 3

public const val PROC_PROTMAX_ACTIVE: Int = 0x80000000.toInt()

public const val PROC_STACKGAP_ENABLE: Int = 0x0001

public const val PROC_STACKGAP_DISABLE: Int = 0x0002

public const val PROC_STACKGAP_ENABLE_EXEC: Int = 0x0004

public const val PROC_STACKGAP_DISABLE_EXEC: Int = 0x0008

public const val PROC_NO_NEW_PRIVS_ENABLE: Int = 1

public const val PROC_NO_NEW_PRIVS_DISABLE: Int = 2

public const val PROC_WX_MAPPINGS_PERMIT: Int = 0x0001

public const val PROC_WX_MAPPINGS_DISALLOW_EXEC: Int = 0x0002

public const val PROC_WXORX_ENFORCE: Int = 0x80000000.toInt()

public const val AF_SLOW: Int = 33

public const val AF_SCLUSTER: Int = 34

public const val AF_ARP: Int = 35

public const val AF_BLUETOOTH: Int = 36

public const val AF_IEEE80211: Int = 37

public const val AF_INET_SDP: Int = 40

public const val AF_INET6_SDP: Int = 42

public const val IF_MAXUNIT: Int = 0x7fff

public const val IFF_UP: Int = 0x1

public const val IFF_BROADCAST: Int = 0x2

public const val IFF_DEBUG: Int = 0x4

public const val IFF_LOOPBACK: Int = 0x8

public const val IFF_POINTOPOINT: Int = 0x10

public const val IFF_KNOWSEPOCH: Int = 0x20

public const val IFF_RUNNING: Int = 0x40

public const val IFF_DRV_RUNNING: Int = 0x40

public const val IFF_NOARP: Int = 0x80

public const val IFF_PROMISC: Int = 0x100

public const val IFF_ALLMULTI: Int = 0x200

public const val IFF_OACTIVE: Int = 0x400

public const val IFF_DRV_OACTIVE: Int = 0x400

public const val IFF_SIMPLEX: Int = 0x800

public const val IFF_LINK0: Int = 0x1000

public const val IFF_LINK1: Int = 0x2000

public const val IFF_LINK2: Int = 0x4000

public const val IFF_ALTPHYS: Int = IFF_LINK2

public const val IFF_MULTICAST: Int = 0x8000

public const val IFF_CANTCONFIG: Int = 0x10000

public const val IFF_PPROMISC: Int = 0x20000

public const val IFF_MONITOR: Int = 0x40000

public const val IFF_STATICARP: Int = 0x80000

public const val IFF_DYING: Int = 0x200000

public const val IFF_RENAMING: Int = 0x400000

public const val IFF_NOGROUP: Int = 0x800000

public const val LINK_STATE_UNKNOWN: Int = 0

public const val LINK_STATE_DOWN: Int = 1

public const val LINK_STATE_UP: Int = 2

public const val IFCAP_RXCSUM: Int = 0x00001

public const val IFCAP_TXCSUM: Int = 0x00002

public const val IFCAP_NETCONS: Int = 0x00004

public const val IFCAP_VLAN_MTU: Int = 0x00008

public const val IFCAP_VLAN_HWTAGGING: Int = 0x00010

public const val IFCAP_JUMBO_MTU: Int = 0x00020

public const val IFCAP_POLLING: Int = 0x00040

public const val IFCAP_VLAN_HWCSUM: Int = 0x00080

public const val IFCAP_TSO4: Int = 0x00100

public const val IFCAP_TSO6: Int = 0x00200

public const val IFCAP_LRO: Int = 0x00400

public const val IFCAP_WOL_UCAST: Int = 0x00800

public const val IFCAP_WOL_MCAST: Int = 0x01000

public const val IFCAP_WOL_MAGIC: Int = 0x02000

public const val IFCAP_TOE4: Int = 0x04000

public const val IFCAP_TOE6: Int = 0x08000

public const val IFCAP_VLAN_HWFILTER: Int = 0x10000

public const val IFCAP_NV: Int = 0x20000

public const val IFCAP_VLAN_HWTSO: Int = 0x40000

public const val IFCAP_LINKSTATE: Int = 0x80000

public const val IFCAP_NETMAP: Int = 0x100000

public const val IFCAP_RXCSUM_IPV6: Int = 0x200000

public const val IFCAP_TXCSUM_IPV6: Int = 0x400000

public const val IFCAP_HWSTATS: Int = 0x800000

public const val IFCAP_TXRTLMT: Int = 0x1000000

public const val IFCAP_HWRXTSTMP: Int = 0x2000000

public const val IFCAP_MEXTPG: Int = 0x4000000

public const val IFCAP_TXTLS4: Int = 0x8000000

public const val IFCAP_TXTLS6: Int = 0x10000000

public const val IFCAP_VXLAN_HWCSUM: Int = 0x20000000

public const val IFCAP_VXLAN_HWTSO: Int = 0x40000000

public const val IFCAP_TXTLS_RTLMT: Int = 0x80000000.toInt()

public val IFCAP_HWCSUM_IPV6: Int = IFCAP_RXCSUM_IPV6 or IFCAP_TXCSUM_IPV6

public val IFCAP_HWCSUM: Int = IFCAP_RXCSUM or IFCAP_TXCSUM

public val IFCAP_TSO: Int = IFCAP_TSO4 or IFCAP_TSO6

public val IFCAP_WOL: Int = IFCAP_WOL_UCAST or IFCAP_WOL_MCAST or IFCAP_WOL_MAGIC

public val IFCAP_TOE: Int = IFCAP_TOE4 or IFCAP_TOE6

public val IFCAP_TXTLS: Int = IFCAP_TXTLS4 or IFCAP_TXTLS6

public val IFCAP_CANTCHANGE: Int = IFCAP_NETMAP or IFCAP_NV

public const val IFQ_MAXLEN: Int = 50

public const val IFNET_SLOWHZ: Int = 1

public const val IFAN_ARRIVAL: Int = 0

public const val IFAN_DEPARTURE: Int = 1

public const val IFSTATMAX: Int = 800

public const val RSS_FUNC_NONE: Int = 0

public const val RSS_FUNC_PRIVATE: Int = 1

public const val RSS_FUNC_TOEPLITZ: Int = 2

public const val RSS_TYPE_IPV4: Int = 0x00000001

public const val RSS_TYPE_TCP_IPV4: Int = 0x00000002

public const val RSS_TYPE_IPV6: Int = 0x00000004

public const val RSS_TYPE_IPV6_EX: Int = 0x00000008

public const val RSS_TYPE_TCP_IPV6: Int = 0x00000010

public const val RSS_TYPE_TCP_IPV6_EX: Int = 0x00000020

public const val RSS_TYPE_UDP_IPV4: Int = 0x00000040

public const val RSS_TYPE_UDP_IPV6: Int = 0x00000080

public const val RSS_TYPE_UDP_IPV6_EX: Int = 0x00000100

public const val RSS_KEYLEN: Int = 128

public const val IFNET_PCP_NONE: Int = 0xff

public const val IFDR_MSG_SIZE: Int = 64

public const val IFDR_REASON_MSG: Int = 1

public const val IFDR_REASON_VENDOR: Int = 2

public const val IFMIB_SYSTEM: Int = 1

public const val IFMIB_IFDATA: Int = 2

public const val IFDATA_GENERAL: Int = 1

public const val IFDATA_LINKSPECIFIC: Int = 2

public const val IFDATA_DRIVERNAME: Int = 3

public const val IFMIB_IFCOUNT: Int = 1

public const val NETLINK_GENERIC: Int = 0

public const val DOT3COMPLIANCE_STATS: Int = 1

public const val DOT3COMPLIANCE_COLLS: Int = 2

public const val dot3ChipSetAMD7990: Int = 1

public const val dot3ChipSetAMD79900: Int = 2

public const val dot3ChipSetAMD79C940: Int = 3

public const val dot3ChipSetIntel82586: Int = 1

public const val dot3ChipSetIntel82596: Int = 2

public const val dot3ChipSetIntel82557: Int = 3

public const val dot3ChipSetNational8390: Int = 1

public const val dot3ChipSetNationalSonic: Int = 2

public const val dot3ChipSetFujitsu86950: Int = 1

public const val dot3ChipSetDigitalDC21040: Int = 1

public const val dot3ChipSetDigitalDC21140: Int = 2

public const val dot3ChipSetDigitalDC21041: Int = 3

public const val dot3ChipSetDigitalDC21140A: Int = 4

public const val dot3ChipSetDigitalDC21142: Int = 5

public const val dot3ChipSetWesternDigital83C690: Int = 1

public const val dot3ChipSetWesternDigital83C790: Int = 2

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

public const val IPPROTO_DCCP: Int = 33

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

public const val IPPROTO_SCTP: Int = 132

public const val IPPROTO_MH: Int = 135

public const val IPPROTO_UDPLITE: Int = 136

public const val IPPROTO_HIP: Int = 139

public const val IPPROTO_SHIM6: Int = 140

public const val IPPROTO_PIM: Int = 103

public const val IPPROTO_CARP: Int = 112

public const val IPPROTO_PGM: Int = 113

public const val IPPROTO_MPLS: Int = 137

public const val IPPROTO_PFSYNC: Int = 240

public const val IPPROTO_OLD_DIVERT: Int = 254

public const val IPPROTO_MAX: Int = 256

public const val IPPROTO_DONE: Int = 257

public const val IPPROTO_DIVERT: Int = 258

public const val IPPROTO_SEND: Int = 259

public const val TCP_MD5SIG: Int = 16

public const val TCP_INFO: Int = 32

public const val TCP_CONGESTION: Int = 64

public const val TCP_CCALGOOPT: Int = 65

public const val TCP_MAXUNACKTIME: Int = 68

public const val TCP_MAXPEAKRATE: Int = 69

public const val TCP_IDLE_REDUCE: Int = 70

public const val TCP_REMOTE_UDP_ENCAPS_PORT: Int = 71

public const val TCP_DELACK: Int = 72

public const val TCP_FIN_IS_RST: Int = 73

public const val TCP_LOG_LIMIT: Int = 74

public const val TCP_SHARED_CWND_ALLOWED: Int = 75

public const val TCP_PROC_ACCOUNTING: Int = 76

public const val TCP_USE_CMP_ACKS: Int = 77

public const val TCP_PERF_INFO: Int = 78

public const val TCP_LRD: Int = 79

public const val TCP_KEEPINIT: Int = 128

public const val TCP_FASTOPEN: Int = 1025

public const val TCP_PCAP_OUT: Int = 2048

public const val TCP_PCAP_IN: Int = 4096

public const val TCP_FUNCTION_BLK: Int = 8192

public const val TCP_FUNCTION_ALIAS: Int = 8193

public const val TCP_FASTOPEN_PSK_LEN: Int = 16

public const val TCP_FUNCTION_NAME_LEN_MAX: Int = 32

public const val TCP_REUSPORT_LB_NUMA: Int = 1026

public const val TCP_RACK_MBUF_QUEUE: Int = 1050

public const val TCP_RACK_TLP_REDUCE: Int = 1052

public const val TCP_RACK_PACE_MAX_SEG: Int = 1054

public const val TCP_RACK_PACE_ALWAYS: Int = 1055

public const val TCP_RACK_PRR_SENDALOT: Int = 1057

public const val TCP_RACK_MIN_TO: Int = 1058

public const val TCP_RACK_EARLY_SEG: Int = 1060

public const val TCP_RACK_REORD_THRESH: Int = 1061

public const val TCP_RACK_REORD_FADE: Int = 1062

public const val TCP_RACK_TLP_THRESH: Int = 1063

public const val TCP_RACK_PKT_DELAY: Int = 1064

public const val TCP_BBR_IWINTSO: Int = 1067

public const val TCP_BBR_STARTUP_PG: Int = 1069

public const val TCP_BBR_DRAIN_PG: Int = 1070

public const val TCP_BBR_PROBE_RTT_INT: Int = 1072

public const val TCP_BBR_STARTUP_LOSS_EXIT: Int = 1074

public const val TCP_BBR_TSLIMITS: Int = 1076

public const val TCP_BBR_PACE_OH: Int = 1077

public const val TCP_BBR_USEDEL_RATE: Int = 1079

public const val TCP_BBR_MIN_RTO: Int = 1080

public const val TCP_BBR_MAX_RTO: Int = 1081

public const val TCP_BBR_ALGORITHM: Int = 1083

public const val TCP_BBR_PACE_PER_SEC: Int = 1086

public const val TCP_BBR_PACE_DEL_TAR: Int = 1087

public const val TCP_BBR_PACE_SEG_MAX: Int = 1088

public const val TCP_BBR_PACE_SEG_MIN: Int = 1089

public const val TCP_BBR_PACE_CROSS: Int = 1090

public const val TCP_BBR_TMR_PACE_OH: Int = 1096

public const val TCP_BBR_RACK_RTT_USE: Int = 1098

public const val TCP_BBR_RETRAN_WTSO: Int = 1099

public const val TCP_BBR_PROBE_RTT_GAIN: Int = 1101

public const val TCP_BBR_PROBE_RTT_LEN: Int = 1102

public const val TCP_BBR_SEND_IWND_IN_TSO: Int = 1103

public const val TCP_BBR_USE_RACK_RR: Int = 1104

public const val TCP_BBR_HDWR_PACE: Int = 1105

public const val TCP_BBR_UTTER_MAX_TSO: Int = 1106

public const val TCP_BBR_EXTRA_STATE: Int = 1107

public const val TCP_BBR_FLOOR_MIN_TSO: Int = 1108

public const val TCP_BBR_MIN_TOPACEOUT: Int = 1109

public const val TCP_BBR_TSTMP_RAISES: Int = 1110

public const val TCP_BBR_POLICER_DETECT: Int = 1111

public const val TCP_BBR_RACK_INIT_RATE: Int = 1112

public const val IP_BINDANY: Int = 24

public const val IP_BINDMULTI: Int = 25

public const val IP_RSS_LISTEN_BUCKET: Int = 26

public const val IP_ORIGDSTADDR: Int = 27

public const val IP_RECVORIGDSTADDR: Int = IP_ORIGDSTADDR

public const val IP_DONTFRAG: Int = 67

public const val IP_RECVTOS: Int = 68

public const val IPV6_BINDANY: Int = 64

public const val IPV6_ORIGDSTADDR: Int = 72

public const val IPV6_RECVORIGDSTADDR: Int = IPV6_ORIGDSTADDR

public const val PF_SLOW: Int = AF_SLOW

public const val PF_SCLUSTER: Int = AF_SCLUSTER

public const val PF_ARP: Int = AF_ARP

public const val PF_BLUETOOTH: Int = AF_BLUETOOTH

public const val PF_IEEE80211: Int = AF_IEEE80211

public const val PF_INET_SDP: Int = AF_INET_SDP

public const val PF_INET6_SDP: Int = AF_INET6_SDP

public const val NET_RT_DUMP: Int = 1

public const val NET_RT_FLAGS: Int = 2

public const val NET_RT_IFLIST: Int = 3

public const val NET_RT_IFMALIST: Int = 4

public const val NET_RT_IFLISTL: Int = 5

public const val IPC_INFO: Int = 3

public const val MSG_NOERROR: Int = 4096

public const val SHM_LOCK: Int = 11

public const val SHM_UNLOCK: Int = 12

public const val SHM_STAT: Int = 13

public const val SHM_INFO: Int = 14

public const val CTL_MAXID: Int = 10

public const val KERN_MAXID: Int = 38

public const val HW_MAXID: Int = 13

public const val USER_MAXID: Int = 21

public const val CTL_P1003_1B_MAXID: Int = 26

public const val MSG_NOTIFICATION: Int = 0x00002000

public const val MSG_NBIO: Int = 0x00004000

public const val MSG_COMPAT: Int = 0x00008000

public const val MSG_CMSG_CLOEXEC: Int = 0x00040000

public const val MSG_NOSIGNAL: Int = 0x20000

public const val MSG_WAITFORONE: Int = 0x00080000

public const val EMPTY: Short = 0

public const val BOOT_TIME: Short = 1

public const val OLD_TIME: Short = 2

public const val NEW_TIME: Short = 3

public const val USER_PROCESS: Short = 4

public const val INIT_PROCESS: Short = 5

public const val LOGIN_PROCESS: Short = 6

public const val DEAD_PROCESS: Short = 7

public const val SHUTDOWN_TIME: Short = 8

public const val UTXDB_ACTIVE: Int = 0

public const val UTXDB_LASTLOGIN: Int = 1

public const val UTXDB_LOG: Int = 2

public val LC_COLLATE_MASK: Int = 1 shl 0

public val LC_CTYPE_MASK: Int = 1 shl 1

public val LC_MONETARY_MASK: Int = 1 shl 2

public val LC_NUMERIC_MASK: Int = 1 shl 3

public val LC_TIME_MASK: Int = 1 shl 4

public val LC_MESSAGES_MASK: Int = 1 shl 5

public val LC_ALL_MASK: Int = LC_COLLATE_MASK or LC_CTYPE_MASK or LC_MESSAGES_MASK or LC_MONETARY_MASK or LC_NUMERIC_MASK or LC_TIME_MASK

public const val WSTOPPED: Int = 2

public const val WCONTINUED: Int = 4

public const val WNOWAIT: Int = 8

public const val WEXITED: Int = 16

public const val WTRAPPED: Int = 32

public const val P_PID: UInt = 0u

public const val P_PGID: UInt = 2u

public const val P_ALL: UInt = 7u

public const val UTIME_OMIT: Long = -2

public const val UTIME_NOW: Long = -1

public const val B460800: UInt = 460800u

public const val B921600: UInt = 921600u

public const val AT_FDCWD: Int = -100

public const val AT_EACCESS: Int = 0x100

public const val AT_SYMLINK_NOFOLLOW: Int = 0x200

public const val AT_SYMLINK_FOLLOW: Int = 0x400

public const val AT_REMOVEDIR: Int = 0x800

public const val AT_RESOLVE_BENEATH: Int = 0x2000

public const val AT_EMPTY_PATH: Int = 0x4000

public const val AT_NULL: Int = 0

public const val AT_IGNORE: Int = 1

public const val AT_EXECFD: Int = 2

public const val AT_PHDR: Int = 3

public const val AT_PHENT: Int = 4

public const val AT_PHNUM: Int = 5

public const val AT_PAGESZ: Int = 6

public const val AT_BASE: Int = 7

public const val AT_FLAGS: Int = 8

public const val AT_ENTRY: Int = 9

public const val AT_NOTELF: Int = 10

public const val AT_UID: Int = 11

public const val AT_EUID: Int = 12

public const val AT_GID: Int = 13

public const val AT_EGID: Int = 14

public const val AT_EXECPATH: Int = 15

public const val AT_CANARY: Int = 16

public const val AT_OSRELDATE: Int = 18

public const val AT_NCPUS: Int = 19

public const val AT_PAGESIZES: Int = 20

public const val AT_TIMEKEEP: Int = 22

public const val AT_HWCAP: Int = 25

public const val AT_HWCAP2: Int = 26

public const val AT_USRSTACKBASE: Int = 35

public const val AT_USRSTACKLIM: Int = 36

public const val AT_HWCAP3: Int = 38

public const val AT_HWCAP4: Int = 39

public const val TABDLY: UInt = 0x00000004u

public const val TAB0: UInt = 0x00000000u

public const val TAB3: UInt = 0x00000004u

public const val _PC_ACL_NFS4: Int = 64

public const val _SC_CPUSET_SIZE: Int = 122

public const val _UUID_NODE_LEN: ULong = 6uL

public const val PD_DAEMON: Int = 0x00000001

public const val PD_CLOEXEC: Int = 0x00000002

public val PD_ALLOWED_AT_FORK: Int = PD_DAEMON or PD_CLOEXEC

public val RTP_PRIO_REALTIME: UShort = (2).toUShort()

public val RTP_PRIO_NORMAL: UShort = (3).toUShort()

public val RTP_PRIO_IDLE: UShort = (4).toUShort()

public const val UF_SYSTEM: ULong = 0x00000080uL

public const val UF_SPARSE: ULong = 0x00000100uL

public const val UF_OFFLINE: ULong = 0x00000200uL

public const val UF_REPARSE: ULong = 0x00000400uL

public const val UF_ARCHIVE: ULong = 0x00000800uL

public const val UF_READONLY: ULong = 0x00001000uL

public const val UF_HIDDEN: ULong = 0x00008000uL

public const val SF_SNAPSHOT: ULong = 0x00200000uL

public const val F_ADD_SEALS: Int = 19

public const val F_GET_SEALS: Int = 20

public const val F_OGETLK: Int = 7

public const val F_OSETLK: Int = 8

public const val F_OSETLKW: Int = 9

public const val F_RDAHEAD: Int = 16

public const val F_READAHEAD: Int = 15

public const val F_SETLK_REMOTE: Int = 14

public const val F_KINFO: Int = 22

public const val F_SEAL_GROW: Int = 4

public const val F_SEAL_SEAL: Int = 1

public const val F_SEAL_SHRINK: Int = 2

public const val F_SEAL_WRITE: Int = 8

public const val SPACECTL_DEALLOC: Int = 1

public const val HOSTNAME_FOUND: Int = 0

public const val HOSTNAME_INCORRECTNAME: Int = 1

public const val HOSTNAME_INVALIDADDR: Int = 2

public const val HOSTNAME_INVALIDNAME: Int = 3

public const val RFFDG: Int = 4

public const val RFPROC: Int = 16

public const val RFMEM: Int = 32

public const val RFNOWAIT: Int = 64

public const val RFCFDG: Int = 4096

public const val RFTHREAD: Int = 8192

public const val RFSIGSHARE: Int = 16384

public const val RFLINUXTHPN: Int = 65536

public const val RFTSIGZMB: Int = 524288

public const val RFSPAWN: Int = 2147483648.toInt()

public const val EFD_SEMAPHORE: Int = 0x1

public const val EFD_NONBLOCK: Int = 0x4

public const val EFD_CLOEXEC: Int = 0x100000

public const val MALLOCX_ZERO: Int = 0x40

public const val WMESGLEN: ULong = 8uL

public const val LOCKNAMELEN: ULong = 8uL

public const val TDNAMLEN: ULong = 16uL

public const val COMMLEN: ULong = 19uL

public const val KI_EMULNAMELEN: ULong = 16uL

public const val KI_NGROUPS: ULong = 16uL

public const val KI_NSPARE_INT: ULong = 4uL

public const val KI_NSPARE_LONG: ULong = 12uL

public const val KI_CRF_CAPABILITY_MODE: ULong = 0x00000001uL

public const val KI_CRF_GRP_OVERFLOW: ULong = 0x80000000uL

public const val KI_CTTY: ULong = 0x00000001uL

public const val KI_SLEADER: ULong = 0x00000002uL

public const val KI_LOCKBLOCK: ULong = 0x00000004uL

public const val LOGNAMELEN: ULong = 17uL

public const val LOGINCLASSLEN: ULong = 17uL

public const val KF_ATTR_VALID: Int = 0x0001

public const val KF_TYPE_NONE: Int = 0

public const val KF_TYPE_VNODE: Int = 1

public const val KF_TYPE_SOCKET: Int = 2

public const val KF_TYPE_PIPE: Int = 3

public const val KF_TYPE_FIFO: Int = 4

public const val KF_TYPE_KQUEUE: Int = 5

public const val KF_TYPE_MQUEUE: Int = 7

public const val KF_TYPE_SHM: Int = 8

public const val KF_TYPE_SEM: Int = 9

public const val KF_TYPE_PTS: Int = 10

public const val KF_TYPE_PROCDESC: Int = 11

public const val KF_TYPE_DEV: Int = 12

public const val KF_TYPE_UNKNOWN: Int = 255

public const val KF_VTYPE_VNON: Int = 0

public const val KF_VTYPE_VREG: Int = 1

public const val KF_VTYPE_VDIR: Int = 2

public const val KF_VTYPE_VBLK: Int = 3

public const val KF_VTYPE_VCHR: Int = 4

public const val KF_VTYPE_VLNK: Int = 5

public const val KF_VTYPE_VSOCK: Int = 6

public const val KF_VTYPE_VFIFO: Int = 7

public const val KF_VTYPE_VBAD: Int = 8

public const val KF_VTYPE_UNKNOWN: Int = 255

public const val KF_FD_TYPE_CWD: Int = -1

public const val KF_FD_TYPE_ROOT: Int = -2

public const val KF_FD_TYPE_JAIL: Int = -3

public const val KF_FD_TYPE_TRACE: Int = -4

public const val KF_FD_TYPE_TEXT: Int = -5

public const val KF_FD_TYPE_CTTY: Int = -6

public const val KF_FLAG_READ: Int = 0x00000001

public const val KF_FLAG_WRITE: Int = 0x00000002

public const val KF_FLAG_APPEND: Int = 0x00000004

public const val KF_FLAG_ASYNC: Int = 0x00000008

public const val KF_FLAG_FSYNC: Int = 0x00000010

public const val KF_FLAG_NONBLOCK: Int = 0x00000020

public const val KF_FLAG_DIRECT: Int = 0x00000040

public const val KF_FLAG_HASLOCK: Int = 0x00000080

public const val KF_FLAG_SHLOCK: Int = 0x00000100

public const val KF_FLAG_EXLOCK: Int = 0x00000200

public const val KF_FLAG_NOFOLLOW: Int = 0x00000400

public const val KF_FLAG_CREAT: Int = 0x00000800

public const val KF_FLAG_TRUNC: Int = 0x00001000

public const val KF_FLAG_EXCL: Int = 0x00002000

public const val KF_FLAG_EXEC: Int = 0x00004000

public const val KVME_TYPE_NONE: Int = 0

public const val KVME_TYPE_DEFAULT: Int = 1

public const val KVME_TYPE_VNODE: Int = 2

public const val KVME_TYPE_SWAP: Int = 3

public const val KVME_TYPE_DEVICE: Int = 4

public const val KVME_TYPE_PHYS: Int = 5

public const val KVME_TYPE_DEAD: Int = 6

public const val KVME_TYPE_SG: Int = 7

public const val KVME_TYPE_MGTDEVICE: Int = 8

public const val KVME_TYPE_GUARD: Int = 9

public const val KVME_TYPE_UNKNOWN: Int = 255

public const val KVME_PROT_READ: Int = 0x00000001

public const val KVME_PROT_WRITE: Int = 0x00000002

public const val KVME_PROT_EXEC: Int = 0x00000004

public const val KVME_FLAG_COW: Int = 0x00000001

public const val KVME_FLAG_NEEDS_COPY: Int = 0x00000002

public const val KVME_FLAG_NOCOREDUMP: Int = 0x00000004

public const val KVME_FLAG_SUPER: Int = 0x00000008

public const val KVME_FLAG_GROWS_UP: Int = 0x00000010

public const val KVME_FLAG_GROWS_DOWN: Int = 0x00000020

public const val KVME_FLAG_USER_WIRED: Int = 0x00000040

public const val KKST_MAXLEN: Int = 1024

public const val KKST_STATE_STACKOK: Int = 0

public const val KKST_STATE_SWAPPED: Int = 1

public const val KKST_STATE_RUNNING: Int = 2

public const val PRI_MIN: Int = 0

public const val PRI_MAX: Int = 255

public const val PRI_MIN_ITHD: Int = PRI_MIN

public val PRI_MAX_ITHD: Int = PRI_MIN_REALTIME - 1

public const val PI_REALTIME: Int = PRI_MIN_ITHD + 0

public const val PI_AV: Int = PRI_MIN_ITHD + 4

public const val PI_NET: Int = PRI_MIN_ITHD + 8

public const val PI_DISK: Int = PRI_MIN_ITHD + 12

public const val PI_TTY: Int = PRI_MIN_ITHD + 16

public const val PI_DULL: Int = PRI_MIN_ITHD + 20

public const val PI_SOFT: Int = PRI_MIN_ITHD + 24

public const val PRI_MIN_REALTIME: Int = 48

public val PRI_MAX_REALTIME: Int = PRI_MIN_KERN - 1

public const val PRI_MIN_KERN: Int = 80

public val PRI_MAX_KERN: Int = PRI_MIN_TIMESHARE - 1

public const val PSWP: Int = PRI_MIN_KERN + 0

public const val PVM: Int = PRI_MIN_KERN + 4

public const val PINOD: Int = PRI_MIN_KERN + 8

public const val PRIBIO: Int = PRI_MIN_KERN + 12

public const val PVFS: Int = PRI_MIN_KERN + 16

public const val PZERO: Int = PRI_MIN_KERN + 20

public const val PSOCK: Int = PRI_MIN_KERN + 24

public const val PWAIT: Int = PRI_MIN_KERN + 28

public const val PLOCK: Int = PRI_MIN_KERN + 32

public const val PPAUSE: Int = PRI_MIN_KERN + 36

public const val PRI_MIN_TIMESHARE: Int = 120

public val PRI_MAX_TIMESHARE: Int = PRI_MIN_IDLE - 1

public const val PUSER: Int = PRI_MIN_TIMESHARE

public const val PRI_MIN_IDLE: Int = 224

public const val PRI_MAX_IDLE: Int = PRI_MAX

public const val NZERO: Int = 0

public const val RUSAGE_THREAD: Int = 1

public const val ARG_MAX: Int = 256 * 1024

public const val CHILD_MAX: Int = 40

public const val MAXCOMLEN: ULong = 19uL

public const val MAXINTERP: Int = PATH_MAX

public const val MAXLOGNAME: Int = 33

public const val MAXUPRC: Int = CHILD_MAX

public const val NCARGS: Int = ARG_MAX

public val NGROUPS: Int = NGROUPS_MAX + 1

public val NOFILE: Int = OPEN_MAX

public const val NOGROUP: Int = 65535

public const val MAXHOSTNAMELEN: Int = 256

public const val MAX_CANON: Int = 255

public const val MAX_INPUT: Int = 255

public const val NAME_MAX: Int = 255

public const val MAXSYMLINKS: Int = 32

public const val NGROUPS_MAX: Int = 1023

public const val OPEN_MAX: Int = 64

public const val _POSIX_ARG_MAX: Int = 4096

public const val _POSIX_LINK_MAX: Int = 8

public const val _POSIX_MAX_CANON: Int = 255

public const val _POSIX_MAX_INPUT: Int = 255

public const val _POSIX_NAME_MAX: Int = 14

public const val _POSIX_PIPE_BUF: Int = 512

public const val _POSIX_SSIZE_MAX: Int = 32767

public const val _POSIX_STREAM_MAX: Int = 8

public const val BC_BASE_MAX: Int = 99

public const val BC_DIM_MAX: Int = 2048

public const val BC_SCALE_MAX: Int = 99

public const val BC_STRING_MAX: Int = 1000

public const val CHARCLASS_NAME_MAX: Int = 14

public const val COLL_WEIGHTS_MAX: Int = 10

public const val EXPR_NEST_MAX: Int = 32

public const val LINE_MAX: Int = 2048

public const val RE_DUP_MAX: Int = 255

public const val _POSIX2_BC_BASE_MAX: Int = 99

public const val _POSIX2_BC_DIM_MAX: Int = 2048

public const val _POSIX2_BC_SCALE_MAX: Int = 99

public const val _POSIX2_BC_STRING_MAX: Int = 1000

public const val _POSIX2_CHARCLASS_NAME_MAX: Int = 14

public const val _POSIX2_COLL_WEIGHTS_MAX: Int = 2

public const val _POSIX2_EQUIV_CLASS_MAX: Int = 2

public const val _POSIX2_EXPR_NEST_MAX: Int = 32

public const val _POSIX2_LINE_MAX: Int = 2048

public const val _POSIX2_RE_DUP_MAX: Int = 255

public const val TDF_BORROWING: Int = 0x00000001

public const val TDF_INPANIC: Int = 0x00000002

public const val TDF_INMEM: Int = 0x00000004

public const val TDF_SINTR: Int = 0x00000008

public const val TDF_TIMEOUT: Int = 0x00000010

public const val TDF_IDLETD: Int = 0x00000020

public const val TDF_CANSWAP: Int = 0x00000040

public const val TDF_KTH_SUSP: Int = 0x00000100

public const val TDF_ALLPROCSUSP: Int = 0x00000200

public const val TDF_BOUNDARY: Int = 0x00000400

public const val TDF_ASTPENDING: Int = 0x00000800

public const val TDF_SBDRY: Int = 0x00002000

public const val TDF_UPIBLOCKED: Int = 0x00004000

public const val TDF_NEEDSUSPCHK: Int = 0x00008000

public const val TDF_NEEDRESCHED: Int = 0x00010000

public const val TDF_NEEDSIGCHK: Int = 0x00020000

public const val TDF_NOLOAD: Int = 0x00040000

public const val TDF_SERESTART: Int = 0x00080000

public const val TDF_THRWAKEUP: Int = 0x00100000

public const val TDF_SEINTR: Int = 0x00200000

public const val TDF_SWAPINREQ: Int = 0x00400000

public const val TDF_UNUSED23: Int = 0x00800000

public const val TDF_SCHED0: Int = 0x01000000

public const val TDF_SCHED1: Int = 0x02000000

public const val TDF_SCHED2: Int = 0x04000000

public const val TDF_SCHED3: Int = 0x08000000

public const val TDF_ALRMPEND: Int = 0x10000000

public const val TDF_PROFPEND: Int = 0x20000000

public const val TDF_MACPEND: Int = 0x40000000

public const val TDB_SUSPEND: Int = 0x00000001

public const val TDB_XSIG: Int = 0x00000002

public const val TDB_USERWR: Int = 0x00000004

public const val TDB_SCE: Int = 0x00000008

public const val TDB_SCX: Int = 0x00000010

public const val TDB_EXEC: Int = 0x00000020

public const val TDB_FORK: Int = 0x00000040

public const val TDB_STOPATFORK: Int = 0x00000080

public const val TDB_CHILD: Int = 0x00000100

public const val TDB_BORN: Int = 0x00000200

public const val TDB_EXIT: Int = 0x00000400

public const val TDB_VFORK: Int = 0x00000800

public const val TDB_FSTP: Int = 0x00001000

public const val TDB_STEP: Int = 0x00002000

public const val TDP_OLDMASK: Int = 0x00000001

public const val TDP_INKTR: Int = 0x00000002

public const val TDP_INKTRACE: Int = 0x00000004

public const val TDP_BUFNEED: Int = 0x00000008

public const val TDP_COWINPROGRESS: Int = 0x00000010

public const val TDP_ALTSTACK: Int = 0x00000020

public const val TDP_DEADLKTREAT: Int = 0x00000040

public const val TDP_NOFAULTING: Int = 0x00000080

public const val TDP_OWEUPC: Int = 0x00000200

public const val TDP_ITHREAD: Int = 0x00000400

public const val TDP_SYNCIO: Int = 0x00000800

public const val TDP_SCHED1: Int = 0x00001000

public const val TDP_SCHED2: Int = 0x00002000

public const val TDP_SCHED3: Int = 0x00004000

public const val TDP_SCHED4: Int = 0x00008000

public const val TDP_GEOM: Int = 0x00010000

public const val TDP_SOFTDEP: Int = 0x00020000

public const val TDP_NORUNNINGBUF: Int = 0x00040000

public const val TDP_WAKEUP: Int = 0x00080000

public const val TDP_INBDFLUSH: Int = 0x00100000

public const val TDP_KTHREAD: Int = 0x00200000

public const val TDP_CALLCHAIN: Int = 0x00400000

public const val TDP_IGNSUSP: Int = 0x00800000

public const val TDP_AUDITREC: Int = 0x01000000

public const val TDP_RFPPWAIT: Int = 0x02000000

public const val TDP_RESETSPUR: Int = 0x04000000

public const val TDP_NERRNO: Int = 0x08000000

public const val TDP_EXECVMSPC: Int = 0x40000000

public const val TDI_SUSPENDED: Int = 0x0001

public const val TDI_SLEEPING: Int = 0x0002

public const val TDI_SWAPPED: Int = 0x0004

public const val TDI_LOCK: Int = 0x0008

public const val TDI_IWAIT: Int = 0x0010

public const val P_ADVLOCK: Int = 0x00000001

public const val P_CONTROLT: Int = 0x00000002

public const val P_KPROC: Int = 0x00000004

public const val P_UNUSED3: Int = 0x00000008

public const val P_IDLEPROC: Int = 0x00000008

public const val P_PPWAIT: Int = 0x00000010

public const val P_PROFIL: Int = 0x00000020

public const val P_STOPPROF: Int = 0x00000040

public const val P_HADTHREADS: Int = 0x00000080

public const val P_SUGID: Int = 0x00000100

public const val P_SYSTEM: Int = 0x00000200

public const val P_SINGLE_EXIT: Int = 0x00000400

public const val P_TRACED: Int = 0x00000800

public const val P_WAITED: Int = 0x00001000

public const val P_WEXIT: Int = 0x00002000

public const val P_EXEC: Int = 0x00004000

public const val P_WKILLED: Int = 0x00008000

public const val P_CONTINUED: Int = 0x00010000

public const val P_STOPPED_SIG: Int = 0x00020000

public const val P_STOPPED_TRACE: Int = 0x00040000

public const val P_STOPPED_SINGLE: Int = 0x00080000

public const val P_PROTECTED: Int = 0x00100000

public const val P_SIGEVENT: Int = 0x00200000

public const val P_SINGLE_BOUNDARY: Int = 0x00400000

public const val P_HWPMC: Int = 0x00800000

public const val P_JAILED: Int = 0x01000000

public const val P_TOTAL_STOP: Int = 0x02000000

public const val P_INEXEC: Int = 0x04000000

public const val P_STATCHILD: Int = 0x08000000

public const val P_INMEM: Int = 0x10000000

public const val P_SWAPPINGOUT: Int = 0x20000000

public const val P_SWAPPINGIN: Int = 0x40000000

public const val P_PPTRACE: Int = 0x80000000.toInt()

public val P_STOPPED: Int = P_STOPPED_SIG or P_STOPPED_SINGLE or P_STOPPED_TRACE

public const val P2_INHERIT_PROTECTED: Int = 0x00000001

public const val P2_NOTRACE: Int = 0x00000002

public const val P2_NOTRACE_EXEC: Int = 0x00000004

public const val P2_AST_SU: Int = 0x00000008

public const val P2_PTRACE_FSTP: Int = 0x00000010

public const val P2_TRAPCAP: Int = 0x00000020

public const val P2_STKGAP_DISABLE: Int = 0x00000800

public const val P2_STKGAP_DISABLE_EXEC: Int = 0x00001000

public const val P_TREE_ORPHANED: Int = 0x00000001

public const val P_TREE_FIRST_ORPHAN: Int = 0x00000002

public const val P_TREE_REAPER: Int = 0x00000004

public const val SIDL: Byte = 1

public const val SRUN: Byte = 2

public const val SSLEEP: Byte = 3

public const val SSTOP: Byte = 4

public const val SZOMB: Byte = 5

public const val SWAIT: Byte = 6

public const val SLOCK: Byte = 7

public const val P_MAGIC: Int = 0xbeefface.toInt()

public const val TDP_SIGFASTBLOCK: Int = 0x00000100

public const val TDP_UIOHELD: Int = 0x10000000

public const val TDP_SIGFASTPENDING: Int = 0x80000000.toInt()

public const val TDP2_COMPAT32RB: Int = 0x00000002

public const val P2_PROTMAX_ENABLE: Int = 0x00000200

public const val P2_PROTMAX_DISABLE: Int = 0x00000400

public const val TDP2_SBPAGES: Int = 0x00000001

public const val P2_ASLR_ENABLE: Int = 0x00000040

public const val P2_ASLR_DISABLE: Int = 0x00000080

public const val P2_ASLR_IGNSTART: Int = 0x00000100

public const val P_TREE_GRPEXITED: Int = 0x00000008

public const val PS_FST_VTYPE_VNON: Int = 1

public const val PS_FST_VTYPE_VREG: Int = 2

public const val PS_FST_VTYPE_VDIR: Int = 3

public const val PS_FST_VTYPE_VBLK: Int = 4

public const val PS_FST_VTYPE_VCHR: Int = 5

public const val PS_FST_VTYPE_VLNK: Int = 6

public const val PS_FST_VTYPE_VSOCK: Int = 7

public const val PS_FST_VTYPE_VFIFO: Int = 8

public const val PS_FST_VTYPE_VBAD: Int = 9

public const val PS_FST_VTYPE_UNKNOWN: Int = 255

public const val PS_FST_TYPE_VNODE: Int = 1

public const val PS_FST_TYPE_FIFO: Int = 2

public const val PS_FST_TYPE_SOCKET: Int = 3

public const val PS_FST_TYPE_PIPE: Int = 4

public const val PS_FST_TYPE_PTS: Int = 5

public const val PS_FST_TYPE_KQUEUE: Int = 6

public const val PS_FST_TYPE_MQUEUE: Int = 8

public const val PS_FST_TYPE_SHM: Int = 9

public const val PS_FST_TYPE_SEM: Int = 10

public const val PS_FST_TYPE_UNKNOWN: Int = 11

public const val PS_FST_TYPE_NONE: Int = 12

public const val PS_FST_TYPE_PROCDESC: Int = 13

public const val PS_FST_TYPE_DEV: Int = 14

public const val PS_FST_TYPE_EVENTFD: Int = 15

public const val PS_FST_UFLAG_RDIR: Int = 0x0001

public const val PS_FST_UFLAG_CDIR: Int = 0x0002

public const val PS_FST_UFLAG_JAIL: Int = 0x0004

public const val PS_FST_UFLAG_TRACE: Int = 0x0008

public const val PS_FST_UFLAG_TEXT: Int = 0x0010

public const val PS_FST_UFLAG_MMAP: Int = 0x0020

public const val PS_FST_UFLAG_CTTY: Int = 0x0040

public const val PS_FST_FFLAG_READ: Int = 0x0001

public const val PS_FST_FFLAG_WRITE: Int = 0x0002

public const val PS_FST_FFLAG_NONBLOCK: Int = 0x0004

public const val PS_FST_FFLAG_APPEND: Int = 0x0008

public const val PS_FST_FFLAG_SHLOCK: Int = 0x0010

public const val PS_FST_FFLAG_EXLOCK: Int = 0x0020

public const val PS_FST_FFLAG_ASYNC: Int = 0x0040

public const val PS_FST_FFLAG_SYNC: Int = 0x0080

public const val PS_FST_FFLAG_NOFOLLOW: Int = 0x0100

public const val PS_FST_FFLAG_CREAT: Int = 0x0200

public const val PS_FST_FFLAG_TRUNC: Int = 0x0400

public const val PS_FST_FFLAG_EXCL: Int = 0x0800

public const val PS_FST_FFLAG_DIRECT: Int = 0x1000

public const val PS_FST_FFLAG_EXEC: Int = 0x2000

public const val PS_FST_FFLAG_HASLOCK: Int = 0x4000

public const val MAXFIDSZ: Int = 16

public const val MFSNAMELEN: Int = 16

public const val MNAMELEN: Int = 88

public const val MNT_SUJ: ULong = 0x100000000uL

public const val MNT_AUTOMOUNTED: ULong = 0x200000000uL

public const val MNT_UNTRUSTED: ULong = 0x800000000uL

public const val MNT_EXTLS: ULong = 0x4000000000uL

public const val MNT_EXTLSCERT: ULong = 0x8000000000uL

public const val MNT_EXTLSCERTUSER: ULong = 0x10000000000uL

public const val MNT_LOCAL: ULong = 0x000001000uL

public const val MNT_QUOTA: ULong = 0x000002000uL

public const val MNT_ROOTFS: ULong = 0x000004000uL

public const val MNT_USER: ULong = 0x000008000uL

public const val MNT_IGNORE: ULong = 0x000800000uL

public const val MNT_VERIFIED: ULong = 0x400000000uL

public const val MNT_NOCOVER: ULong = 0x001000000000uL

public const val MNT_EMPTYDIR: ULong = 0x002000000000uL

public const val MNT_RECURSE: ULong = 0x100000000000uL

public const val MNT_DEFERRED: ULong = 0x200000000000uL

public const val VFS_VFSCONF: Int = 0

public const val VFS_GENERIC: Int = 0

public const val VFS_MAXTYPENUM: Int = 1

public const val VFS_CONF: Int = 2

public const val MNT_WAIT: Int = 1

public const val MNT_NOWAIT: Int = 2

public const val MNT_LAZY: Int = 3

public const val MNT_SUSPEND: Int = 4

public const val MAXSECFLAVORS: Int = 5

public const val VFCF_STATIC: Int = 0x00010000

public const val VFCF_NETWORK: Int = 0x00020000

public const val VFCF_READONLY: Int = 0x00040000

public const val VFCF_SYNTHETIC: Int = 0x00080000

public const val VFCF_LOOPBACK: Int = 0x00100000

public const val VFCF_UNICODE: Int = 0x00200000

public const val VFCF_JAIL: Int = 0x00400000

public const val VFCF_DELEGADMIN: Int = 0x00800000

public const val VFCF_SBDRY: Int = 0x01000000

public const val DST_NONE: Int = 0

public const val DST_USA: Int = 1

public const val DST_AUST: Int = 2

public const val DST_WET: Int = 3

public const val DST_MET: Int = 4

public const val DST_EET: Int = 5

public const val DST_CAN: Int = 6

public const val CPUCLOCK_WHICH_PID: Int = 0

public const val CPUCLOCK_WHICH_TID: Int = 1

public const val MFD_CLOEXEC: UInt = 0x00000001u

public const val MFD_ALLOW_SEALING: UInt = 0x00000002u

public const val MFD_HUGETLB: UInt = 0x00000004u

public const val MFD_HUGE_MASK: UInt = 0xFC000000u

public val MFD_HUGE_64KB: UInt = 16u shl 26

public val MFD_HUGE_512KB: UInt = 19u shl 26

public val MFD_HUGE_1MB: UInt = 20u shl 26

public val MFD_HUGE_2MB: UInt = 21u shl 26

public val MFD_HUGE_8MB: UInt = 23u shl 26

public val MFD_HUGE_16MB: UInt = 24u shl 26

public val MFD_HUGE_32MB: UInt = 25u shl 26

public val MFD_HUGE_256MB: UInt = 28u shl 26

public val MFD_HUGE_512MB: UInt = 29u shl 26

public val MFD_HUGE_1GB: UInt = 30u shl 26

public val MFD_HUGE_2GB: UInt = 31u shl 26

public val MFD_HUGE_16GB: UInt = 34u shl 26

public const val SHM_LARGEPAGE_ALLOC_DEFAULT: Int = 0

public const val SHM_LARGEPAGE_ALLOC_NOWAIT: Int = 1

public const val SHM_LARGEPAGE_ALLOC_HARD: Int = 2

public val SHM_RENAME_NOREPLACE: Int = 1 shl 0

public val SHM_RENAME_EXCHANGE: Int = 1 shl 1

public const val UMTX_OP_WAIT: Int = 2

public const val UMTX_OP_WAKE: Int = 3

public const val UMTX_OP_MUTEX_TRYLOCK: Int = 4

public const val UMTX_OP_MUTEX_LOCK: Int = 5

public const val UMTX_OP_MUTEX_UNLOCK: Int = 6

public const val UMTX_OP_SET_CEILING: Int = 7

public const val UMTX_OP_CV_WAIT: Int = 8

public const val UMTX_OP_CV_SIGNAL: Int = 9

public const val UMTX_OP_CV_BROADCAST: Int = 10

public const val UMTX_OP_WAIT_UINT: Int = 11

public const val UMTX_OP_RW_RDLOCK: Int = 12

public const val UMTX_OP_RW_WRLOCK: Int = 13

public const val UMTX_OP_RW_UNLOCK: Int = 14

public const val UMTX_OP_WAIT_UINT_PRIVATE: Int = 15

public const val UMTX_OP_WAKE_PRIVATE: Int = 16

public const val UMTX_OP_MUTEX_WAIT: Int = 17

public const val UMTX_OP_NWAKE_PRIVATE: Int = 21

public const val UMTX_OP_MUTEX_WAKE2: Int = 22

public const val UMTX_OP_SEM2_WAIT: Int = 23

public const val UMTX_OP_SEM2_WAKE: Int = 24

public const val UMTX_OP_SHM: Int = 25

public const val UMTX_OP_ROBUST_LISTS: Int = 26

public const val UMTX_ABSTIME: UInt = 1u

public const val CPU_LEVEL_ROOT: Int = 1

public const val CPU_LEVEL_CPUSET: Int = 2

public const val CPU_LEVEL_WHICH: Int = 3

public const val CPU_WHICH_TID: Int = 1

public const val CPU_WHICH_PID: Int = 2

public const val CPU_WHICH_CPUSET: Int = 3

public const val CPU_WHICH_IRQ: Int = 4

public const val CPU_WHICH_JAIL: Int = 5

public const val RTF_LLDATA: Int = 0x400

public const val RTF_FIXEDMTU: Int = 0x80000

public const val RTM_VERSION: Int = 5

public const val RTAX_MAX: Int = 8

public const val SIGTHR: Int = 32

public const val SIGLWP: Int = SIGTHR

public const val SIGLIBRT: Int = 33

public const val SCTP_FUTURE_ASSOC: Int = 0

public const val SCTP_CURRENT_ASSOC: Int = 1

public const val SCTP_ALL_ASSOC: Int = 2

public const val SCTP_NO_NEXT_MSG: Int = 0x0000

public const val SCTP_NEXT_MSG_AVAIL: Int = 0x0001

public const val SCTP_NEXT_MSG_ISCOMPLETE: Int = 0x0002

public const val SCTP_NEXT_MSG_IS_UNORDERED: Int = 0x0004

public const val SCTP_NEXT_MSG_IS_NOTIFICATION: Int = 0x0008

public const val SCTP_RECVV_NOINFO: Int = 0

public const val SCTP_RECVV_RCVINFO: Int = 1

public const val SCTP_RECVV_NXTINFO: Int = 2

public const val SCTP_RECVV_RN: Int = 3

public const val SCTP_SENDV_NOINFO: Int = 0

public const val SCTP_SENDV_SNDINFO: Int = 1

public const val SCTP_SENDV_PRINFO: Int = 2

public const val SCTP_SENDV_AUTHINFO: Int = 3

public const val SCTP_SENDV_SPA: Int = 4

public const val SCTP_SEND_SNDINFO_VALID: Int = 0x00000001

public const val SCTP_SEND_PRINFO_VALID: Int = 0x00000002

public const val SCTP_SEND_AUTHINFO_VALID: Int = 0x00000004

public const val SCTP_NOTIFICATION: Int = 0x0010

public const val SCTP_COMPLETE: Int = 0x0020

public const val SCTP_EOF: Int = 0x0100

public const val SCTP_ABORT: Int = 0x0200

public const val SCTP_UNORDERED: Int = 0x0400

public const val SCTP_ADDR_OVER: Int = 0x0800

public const val SCTP_SENDALL: Int = 0x1000

public const val SCTP_EOR: Int = 0x2000

public const val SCTP_SACK_IMMEDIATELY: Int = 0x4000

public const val SCTP_PR_SCTP_NONE: Int = 0x0000

public const val SCTP_PR_SCTP_TTL: Int = 0x0001

public const val SCTP_PR_SCTP_PRIO: Int = 0x0002

public const val SCTP_PR_SCTP_BUF: Int = SCTP_PR_SCTP_PRIO

public const val SCTP_PR_SCTP_RTX: Int = 0x0003

public const val SCTP_PR_SCTP_MAX: Int = SCTP_PR_SCTP_RTX

public const val SCTP_PR_SCTP_ALL: Int = 0x000f

public const val SCTP_INIT: Int = 0x0001

public const val SCTP_SNDRCV: Int = 0x0002

public const val SCTP_EXTRCV: Int = 0x0003

public const val SCTP_SNDINFO: Int = 0x0004

public const val SCTP_RCVINFO: Int = 0x0005

public const val SCTP_NXTINFO: Int = 0x0006

public const val SCTP_PRINFO: Int = 0x0007

public const val SCTP_AUTHINFO: Int = 0x0008

public const val SCTP_DSTADDRV4: Int = 0x0009

public const val SCTP_DSTADDRV6: Int = 0x000a

public const val SCTP_RTOINFO: Int = 0x00000001

public const val SCTP_ASSOCINFO: Int = 0x00000002

public const val SCTP_INITMSG: Int = 0x00000003

public const val SCTP_NODELAY: Int = 0x00000004

public const val SCTP_AUTOCLOSE: Int = 0x00000005

public const val SCTP_SET_PEER_PRIMARY_ADDR: Int = 0x00000006

public const val SCTP_PRIMARY_ADDR: Int = 0x00000007

public const val SCTP_ADAPTATION_LAYER: Int = 0x00000008

public const val SCTP_ADAPTION_LAYER: Int = 0x00000008

public const val SCTP_DISABLE_FRAGMENTS: Int = 0x00000009

public const val SCTP_PEER_ADDR_PARAMS: Int = 0x0000000a

public const val SCTP_DEFAULT_SEND_PARAM: Int = 0x0000000b

public const val SCTP_EVENTS: Int = 0x0000000c

public const val SCTP_I_WANT_MAPPED_V4_ADDR: Int = 0x0000000d

public const val SCTP_MAXSEG: Int = 0x0000000e

public const val SCTP_DELAYED_SACK: Int = 0x0000000f

public const val SCTP_FRAGMENT_INTERLEAVE: Int = 0x00000010

public const val SCTP_PARTIAL_DELIVERY_POINT: Int = 0x00000011

public const val SCTP_AUTH_CHUNK: Int = 0x00000012

public const val SCTP_AUTH_KEY: Int = 0x00000013

public const val SCTP_HMAC_IDENT: Int = 0x00000014

public const val SCTP_AUTH_ACTIVE_KEY: Int = 0x00000015

public const val SCTP_AUTH_DELETE_KEY: Int = 0x00000016

public const val SCTP_USE_EXT_RCVINFO: Int = 0x00000017

public const val SCTP_AUTO_ASCONF: Int = 0x00000018

public const val SCTP_MAXBURST: Int = 0x00000019

public const val SCTP_MAX_BURST: Int = 0x00000019

public const val SCTP_CONTEXT: Int = 0x0000001a

public const val SCTP_EXPLICIT_EOR: Int = 0x00000001b

public const val SCTP_REUSE_PORT: Int = 0x00000001c

public const val SCTP_AUTH_DEACTIVATE_KEY: Int = 0x00000001d

public const val SCTP_EVENT: Int = 0x0000001e

public const val SCTP_RECVRCVINFO: Int = 0x0000001f

public const val SCTP_RECVNXTINFO: Int = 0x00000020

public const val SCTP_DEFAULT_SNDINFO: Int = 0x00000021

public const val SCTP_DEFAULT_PRINFO: Int = 0x00000022

public const val SCTP_PEER_ADDR_THLDS: Int = 0x00000023

public const val SCTP_REMOTE_UDP_ENCAPS_PORT: Int = 0x00000024

public const val SCTP_ECN_SUPPORTED: Int = 0x00000025

public const val SCTP_AUTH_SUPPORTED: Int = 0x00000027

public const val SCTP_ASCONF_SUPPORTED: Int = 0x00000028

public const val SCTP_RECONFIG_SUPPORTED: Int = 0x00000029

public const val SCTP_NRSACK_SUPPORTED: Int = 0x00000030

public const val SCTP_PKTDROP_SUPPORTED: Int = 0x00000031

public const val SCTP_MAX_CWND: Int = 0x00000032

public const val SCTP_STATUS: Int = 0x00000100

public const val SCTP_GET_PEER_ADDR_INFO: Int = 0x00000101

public const val SCTP_PEER_AUTH_CHUNKS: Int = 0x00000102

public const val SCTP_LOCAL_AUTH_CHUNKS: Int = 0x00000103

public const val SCTP_GET_ASSOC_NUMBER: Int = 0x00000104

public const val SCTP_GET_ASSOC_ID_LIST: Int = 0x00000105

public const val SCTP_TIMEOUTS: Int = 0x00000106

public const val SCTP_PR_STREAM_STATUS: Int = 0x00000107

public const val SCTP_PR_ASSOC_STATUS: Int = 0x00000108

public const val SCTP_COMM_UP: Int = 0x0001

public const val SCTP_COMM_LOST: Int = 0x0002

public const val SCTP_RESTART: Int = 0x0003

public const val SCTP_SHUTDOWN_COMP: Int = 0x0004

public const val SCTP_CANT_STR_ASSOC: Int = 0x0005

public const val SCTP_ASSOC_SUPPORTS_PR: Int = 0x01

public const val SCTP_ASSOC_SUPPORTS_AUTH: Int = 0x02

public const val SCTP_ASSOC_SUPPORTS_ASCONF: Int = 0x03

public const val SCTP_ASSOC_SUPPORTS_MULTIBUF: Int = 0x04

public const val SCTP_ASSOC_SUPPORTS_RE_CONFIG: Int = 0x05

public const val SCTP_ASSOC_SUPPORTS_INTERLEAVING: Int = 0x06

public const val SCTP_ASSOC_SUPPORTS_MAX: Int = 0x06

public const val SCTP_ADDR_AVAILABLE: Int = 0x0001

public const val SCTP_ADDR_UNREACHABLE: Int = 0x0002

public const val SCTP_ADDR_REMOVED: Int = 0x0003

public const val SCTP_ADDR_ADDED: Int = 0x0004

public const val SCTP_ADDR_MADE_PRIM: Int = 0x0005

public const val SCTP_ADDR_CONFIRMED: Int = 0x0006

public const val SCTP_ACTIVE: Int = 0x0001

public const val SCTP_INACTIVE: Int = 0x0002

public const val SCTP_UNCONFIRMED: Int = 0x0200

public const val SCTP_DATA_UNSENT: Int = 0x0001

public const val SCTP_DATA_SENT: Int = 0x0002

public const val SCTP_PARTIAL_DELIVERY_ABORTED: Int = 0x0001

public const val SCTP_AUTH_NEW_KEY: Int = 0x0001

public const val SCTP_AUTH_NEWKEY: Int = SCTP_AUTH_NEW_KEY

public const val SCTP_AUTH_NO_AUTH: Int = 0x0002

public const val SCTP_AUTH_FREE_KEY: Int = 0x0003

public const val SCTP_STREAM_RESET_INCOMING_SSN: Int = 0x0001

public const val SCTP_STREAM_RESET_OUTGOING_SSN: Int = 0x0002

public const val SCTP_STREAM_RESET_DENIED: Int = 0x0004

public const val SCTP_STREAM_RESET_FAILED: Int = 0x0008

public const val SCTP_ASSOC_RESET_DENIED: Int = 0x0004

public const val SCTP_ASSOC_RESET_FAILED: Int = 0x0008

public const val SCTP_STREAM_CHANGE_DENIED: Int = 0x0004

public const val SCTP_STREAM_CHANGE_FAILED: Int = 0x0008

public const val KENV_DUMP_LOADER: Int = 4

public const val KENV_DUMP_STATIC: Int = 5

public const val RB_PAUSE: Int = 0x100000

public const val RB_REROOT: Int = 0x200000

public const val RB_POWERCYCLE: Int = 0x400000

public const val RB_PROBE: Int = 0x10000000

public const val RB_MULTIPLE: Int = 0x20000000

public val INC_ISIPV6: UByte = (0x01).toUByte()

public val INC_IPV6MINMTU: UByte = (0x02).toUByte()

public const val CLOCK_BOOTTIME: Int = CLOCK_UPTIME

public const val CLOCK_REALTIME_COARSE: Int = CLOCK_REALTIME_FAST

public const val CLOCK_MONOTONIC_COARSE: Int = CLOCK_MONOTONIC_FAST

public const val TFD_NONBLOCK: Int = O_NONBLOCK

public const val TFD_CLOEXEC: Int = O_CLOEXEC

public const val TFD_TIMER_ABSTIME: Int = 0x01

public const val TFD_TIMER_CANCEL_ON_SET: Int = 0x02

public val CLOSE_RANGE_CLOEXEC: UInt = 1u shl 2

public const val KCMP_FILE: Int = 100

public const val KCMP_FILEOBJ: Int = 101

public const val KCMP_FILES: Int = 102

public const val KCMP_SIGHAND: Int = 103

public const val KCMP_VM: Int = 104
