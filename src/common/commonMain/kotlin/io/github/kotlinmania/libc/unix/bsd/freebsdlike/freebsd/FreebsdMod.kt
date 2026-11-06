package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import OffT
import cmsghdr

public fun interface MallocStatsPrintWriteCbCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?)
}

public typealias FflagsT = UInt

public typealias VmProtT = UChar

public typealias KvaddrT = ULong

public typealias SegszT = Long

public typealias FixptT = UInt

public typealias LwpidT = Int

public typealias BlksizeT = Int

public typealias KsizeT = ULong

public typealias InpGenT = ULong

public typealias SoGenT = ULong

public typealias ClockidT = CInt

public typealias SemT = Sem

public typealias TimerT = CAnonymousTimer?

public typealias FsblkcntT = ULong

public typealias FsfilcntT = ULong

public typealias IdtypeT = CUint

public typealias MsglenT = CUlong

public typealias MsgqnumT = CUlong

public typealias CpulevelT = CInt

public typealias CpuwhichT = CInt

public typealias MqdT = COpaquePointer?

public typealias PthreadSpinlockT = CAnonymousPthreadSpinlock?

public typealias PthreadBarrierattrT = CAnonymousPthreadBarrierattr?

public typealias PthreadBarrierT = CAnonymousPthreadBarrier?

public typealias UuidT = Uuid

public typealias UInt = CUint

public typealias UChar = CUchar

public typealias ULong = CUlong

public typealias UShort = CUshort

public typealias CaddrT = COpaquePointer?

public typealias FhandleT = Fhandle

public typealias AuIdT = UidT

public typealias AuAsidT = PidT

public typealias CpusetidT = CInt

public typealias SctpAssocT = UInt

public typealias EventfdT = ULong

public sealed class DevstatSupportFlags(public val value: UInt) {
    public data object DevstatAllSupported : DevstatSupportFlags(0x00u)
    public data object DevstatNoBlocksize : DevstatSupportFlags(0x01u)
    public data object DevstatNoOrderedTags : DevstatSupportFlags(0x02u)
    public data object DevstatBsUnavailable : DevstatSupportFlags(0x04u)

    public open fun clone(): DevstatSupportFlags {
        return this
    }
}

public sealed class DevstatTransFlags(public val value: UInt) {
    public data object DevstatNoData : DevstatTransFlags(0x00u)
    public data object DevstatRead : DevstatTransFlags(0x01u)
    public data object DevstatWrite : DevstatTransFlags(0x02u)
    public data object DevstatFree : DevstatTransFlags(0x03u)

    public open fun clone(): DevstatTransFlags {
        return this
    }
}

public sealed class DevstatTagType(public val value: UInt) {
    public data object DevstatTagSimple : DevstatTagType(0x00u)
    public data object DevstatTagHead : DevstatTagType(0x01u)
    public data object DevstatTagOrdered : DevstatTagType(0x02u)
    public data object DevstatTagNone : DevstatTagType(0x03u)

    public open fun clone(): DevstatTagType {
        return this
    }
}

public sealed class DevstatMatchFlags(public val value: UInt) {
    public data object DevstatMatchNone : DevstatMatchFlags(0x00u)
    public data object DevstatMatchType : DevstatMatchFlags(0x01u)
    public data object DevstatMatchIf : DevstatMatchFlags(0x02u)
    public data object DevstatMatchPass : DevstatMatchFlags(0x04u)

    public open fun clone(): DevstatMatchFlags {
        return this
    }
}

public sealed class DevstatPriority(public val value: UInt) {
    public data object DevstatPriorityMin : DevstatPriority(0x000u)
    public data object DevstatPriorityOther : DevstatPriority(0x020u)
    public data object DevstatPriorityPass : DevstatPriority(0x030u)
    public data object DevstatPriorityFd : DevstatPriority(0x040u)
    public data object DevstatPriorityWfd : DevstatPriority(0x050u)
    public data object DevstatPriorityTape : DevstatPriority(0x060u)
    public data object DevstatPriorityCd : DevstatPriority(0x090u)
    public data object DevstatPriorityDisk : DevstatPriority(0x110u)
    public data object DevstatPriorityArray : DevstatPriority(0x120u)
    public data object DevstatPriorityMax : DevstatPriority(0xfffu)

    public open fun clone(): DevstatPriority {
        return this
    }
}

public sealed class DevstatTypeFlags(public val value: UInt) {
    public data object DevstatTypeDirect : DevstatTypeFlags(0x000u)
    public data object DevstatTypeSequential : DevstatTypeFlags(0x001u)
    public data object DevstatTypePrinter : DevstatTypeFlags(0x002u)
    public data object DevstatTypeProcessor : DevstatTypeFlags(0x003u)
    public data object DevstatTypeWorm : DevstatTypeFlags(0x004u)
    public data object DevstatTypeCdrom : DevstatTypeFlags(0x005u)
    public data object DevstatTypeScanner : DevstatTypeFlags(0x006u)
    public data object DevstatTypeOptical : DevstatTypeFlags(0x007u)
    public data object DevstatTypeChanger : DevstatTypeFlags(0x008u)
    public data object DevstatTypeComm : DevstatTypeFlags(0x009u)
    public data object DevstatTypeAsc0 : DevstatTypeFlags(0x00au)
    public data object DevstatTypeAsc1 : DevstatTypeFlags(0x00bu)
    public data object DevstatTypeStorarray : DevstatTypeFlags(0x00cu)
    public data object DevstatTypeEnclosure : DevstatTypeFlags(0x00du)
    public data object DevstatTypeFloppy : DevstatTypeFlags(0x00eu)
    public data object DevstatTypeMask : DevstatTypeFlags(0x00fu)
    public data object DevstatTypeIfScsi : DevstatTypeFlags(0x010u)
    public data object DevstatTypeIfIde : DevstatTypeFlags(0x020u)
    public data object DevstatTypeIfOther : DevstatTypeFlags(0x030u)
    public data object DevstatTypeIfMask : DevstatTypeFlags(0x0f0u)
    public data object DevstatTypePass : DevstatTypeFlags(0x100u)

    public open fun clone(): DevstatTypeFlags {
        return this
    }
}

public sealed class DevstatMetric {
    public data object DsmNone : DevstatMetric()
    public data object DsmTotalBytes : DevstatMetric()
    public data object DsmTotalBytesRead : DevstatMetric()
    public data object DsmTotalBytesWrite : DevstatMetric()
    public data object DsmTotalTransfers : DevstatMetric()
    public data object DsmTotalTransfersRead : DevstatMetric()
    public data object DsmTotalTransfersWrite : DevstatMetric()
    public data object DsmTotalTransfersOther : DevstatMetric()
    public data object DsmTotalBlocks : DevstatMetric()
    public data object DsmTotalBlocksRead : DevstatMetric()
    public data object DsmTotalBlocksWrite : DevstatMetric()
    public data object DsmKbPerTransfer : DevstatMetric()
    public data object DsmKbPerTransferRead : DevstatMetric()
    public data object DsmKbPerTransferWrite : DevstatMetric()
    public data object DsmTransfersPerSecond : DevstatMetric()
    public data object DsmTransfersPerSecondRead : DevstatMetric()
    public data object DsmTransfersPerSecondWrite : DevstatMetric()
    public data object DsmTransfersPerSecondOther : DevstatMetric()
    public data object DsmMbPerSecond : DevstatMetric()
    public data object DsmMbPerSecondRead : DevstatMetric()
    public data object DsmMbPerSecondWrite : DevstatMetric()
    public data object DsmBlocksPerSecond : DevstatMetric()
    public data object DsmBlocksPerSecondRead : DevstatMetric()
    public data object DsmBlocksPerSecondWrite : DevstatMetric()
    public data object DsmMsPerTransaction : DevstatMetric()
    public data object DsmMsPerTransactionRead : DevstatMetric()
    public data object DsmMsPerTransactionWrite : DevstatMetric()
    public data object DsmSkip : DevstatMetric()
    public data object DsmTotalBytesFree : DevstatMetric()
    public data object DsmTotalTransfersFree : DevstatMetric()
    public data object DsmTotalBlocksFree : DevstatMetric()
    public data object DsmKbPerTransferFree : DevstatMetric()
    public data object DsmMbPerSecondFree : DevstatMetric()
    public data object DsmTransfersPerSecondFree : DevstatMetric()
    public data object DsmBlocksPerSecondFree : DevstatMetric()
    public data object DsmMsPerTransactionOther : DevstatMetric()
    public data object DsmMsPerTransactionFree : DevstatMetric()
    public data object DsmBusyPct : DevstatMetric()
    public data object DsmQueueLength : DevstatMetric()
    public data object DsmTotalDuration : DevstatMetric()
    public data object DsmTotalDurationRead : DevstatMetric()
    public data object DsmTotalDurationWrite : DevstatMetric()
    public data object DsmTotalDurationFree : DevstatMetric()
    public data object DsmTotalDurationOther : DevstatMetric()
    public data object DsmTotalBusyTime : DevstatMetric()
    public data object DsmMax : DevstatMetric()

    public open fun clone(): DevstatMetric {
        return this
    }
}

public sealed class DevstatSelectMode {
    public data object DsSelectAdd : DevstatSelectMode()
    public data object DsSelectOnly : DevstatSelectMode()
    public data object DsSelectRemove : DevstatSelectMode()
    public data object DsSelectAddonly : DevstatSelectMode()

    public open fun clone(): DevstatSelectMode {
        return this
    }
}

public sealed class Dot3Vendors(public val value: UInt) {
    public data object Dot3VendorAmd : Dot3Vendors(1u)
    public data object Dot3VendorIntel : Dot3Vendors(2u)
    public data object Dot3VendorNational : Dot3Vendors(4u)
    public data object Dot3VendorFujitsu : Dot3Vendors(5u)
    public data object Dot3VendorDigital : Dot3Vendors(6u)
    public data object Dot3VendorWesternDigital : Dot3Vendors(7u)

    public open fun clone(): Dot3Vendors {
        return this
    }
}

// aio.h
public val LIO_VECTORED: CInt = 4

public val LIO_WRITEV: CInt = 5

public val LIO_READV: CInt = 6

// sys/caprights.h
public val CAP_RIGHTS_VERSION_00: Int = 0

public val CAP_RIGHTS_VERSION: Int = CAP_RIGHTS_VERSION_00

public val CAP_READ: ULong = ((1uL shl (57 + (0))) or (0x0000000000000001uL))

public val CAP_WRITE: ULong = ((1uL shl (57 + (0))) or (0x0000000000000002uL))

public val CAP_SEEK_TELL: ULong = ((1uL shl (57 + (0))) or (0x0000000000000004uL))

public val CAP_SEEK: ULong = CAP_SEEK_TELL or 0x0000000000000008uL

public val CAP_PREAD: ULong = CAP_SEEK or CAP_READ

public val CAP_PWRITE: ULong = CAP_SEEK or CAP_WRITE

public val CAP_MMAP: ULong = ((1uL shl (57 + (0))) or (0x0000000000000010uL))

public val CAP_MMAP_R: ULong = CAP_MMAP or CAP_SEEK or CAP_READ

public val CAP_MMAP_W: ULong = CAP_MMAP or CAP_SEEK or CAP_WRITE

public val CAP_MMAP_X: ULong = CAP_MMAP or CAP_SEEK or 0x0000000000000020uL

public val CAP_MMAP_RW: ULong = CAP_MMAP_R or CAP_MMAP_W

public val CAP_MMAP_RX: ULong = CAP_MMAP_R or CAP_MMAP_X

public val CAP_MMAP_WX: ULong = CAP_MMAP_W or CAP_MMAP_X

public val CAP_MMAP_RWX: ULong = CAP_MMAP_R or CAP_MMAP_W or CAP_MMAP_X

public val CAP_CREATE: ULong = ((1uL shl (57 + (0))) or (0x0000000000000040uL))

public val CAP_FEXECVE: ULong = ((1uL shl (57 + (0))) or (0x0000000000000080uL))

public val CAP_FSYNC: ULong = ((1uL shl (57 + (0))) or (0x0000000000000100uL))

public val CAP_FTRUNCATE: ULong = ((1uL shl (57 + (0))) or (0x0000000000000200uL))

public val CAP_LOOKUP: ULong = ((1uL shl (57 + (0))) or (0x0000000000000400uL))

public val CAP_FCHDIR: ULong = ((1uL shl (57 + (0))) or (0x0000000000000800uL))

public val CAP_FCHFLAGS: ULong = ((1uL shl (57 + (0))) or (0x0000000000001000uL))

public val CAP_CHFLAGSAT: ULong = CAP_FCHFLAGS or CAP_LOOKUP

public val CAP_FCHMOD: ULong = ((1uL shl (57 + (0))) or (0x0000000000002000uL))

public val CAP_FCHMODAT: ULong = CAP_FCHMOD or CAP_LOOKUP

public val CAP_FCHOWN: ULong = ((1uL shl (57 + (0))) or (0x0000000000004000uL))

public val CAP_FCHOWNAT: ULong = CAP_FCHOWN or CAP_LOOKUP

public val CAP_FCNTL: ULong = ((1uL shl (57 + (0))) or (0x0000000000008000uL))

public val CAP_FLOCK: ULong = ((1uL shl (57 + (0))) or (0x0000000000010000uL))

public val CAP_FPATHCONF: ULong = ((1uL shl (57 + (0))) or (0x0000000000020000uL))

public val CAP_FSCK: ULong = ((1uL shl (57 + (0))) or (0x0000000000040000uL))

public val CAP_FSTAT: ULong = ((1uL shl (57 + (0))) or (0x0000000000080000uL))

public val CAP_FSTATAT: ULong = CAP_FSTAT or CAP_LOOKUP

public val CAP_FSTATFS: ULong = ((1uL shl (57 + (0))) or (0x0000000000100000uL))

public val CAP_FUTIMES: ULong = ((1uL shl (57 + (0))) or (0x0000000000200000uL))

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

public val CAP_ACCEPT: ULong = ((1uL shl (57 + (0))) or (0x0000000020000000uL))

public val CAP_BIND: ULong = ((1uL shl (57 + (0))) or (0x0000000040000000uL))

public val CAP_CONNECT: ULong = ((1uL shl (57 + (0))) or (0x0000000080000000uL))

public val CAP_GETPEERNAME: ULong = ((1uL shl (57 + (0))) or (0x0000000100000000uL))

public val CAP_GETSOCKNAME: ULong = ((1uL shl (57 + (0))) or (0x0000000200000000uL))

public val CAP_GETSOCKOPT: ULong = ((1uL shl (57 + (0))) or (0x0000000400000000uL))

public val CAP_LISTEN: ULong = ((1uL shl (57 + (0))) or (0x0000000800000000uL))

public val CAP_PEELOFF: ULong = ((1uL shl (57 + (0))) or (0x0000001000000000uL))

public val CAP_RECV: ULong = CAP_READ

public val CAP_SEND: ULong = CAP_WRITE

public val CAP_SETSOCKOPT: ULong = ((1uL shl (57 + (0))) or (0x0000002000000000uL))

public val CAP_SHUTDOWN: ULong = ((1uL shl (57 + (0))) or (0x0000004000000000uL))

public val CAP_BINDAT: ULong = CAP_LOOKUP or 0x0000008000000000uL

public val CAP_CONNECTAT: ULong = CAP_LOOKUP or 0x0000010000000000uL

public val CAP_LINKAT_SOURCE: ULong = CAP_LOOKUP or 0x0000020000000000uL

public val CAP_RENAMEAT_TARGET: ULong = CAP_LOOKUP or 0x0000040000000000uL

public val CAP_SOCK_CLIENT: ULong = CAP_CONNECT or CAP_GETPEERNAME or CAP_GETSOCKNAME or CAP_GETSOCKOPT or CAP_PEELOFF or CAP_RECV or CAP_SEND or CAP_SETSOCKOPT or CAP_SHUTDOWN

public val CAP_SOCK_SERVER: ULong = CAP_ACCEPT or CAP_BIND or CAP_GETPEERNAME or CAP_GETSOCKNAME or CAP_GETSOCKOPT or CAP_LISTEN or CAP_PEELOFF or CAP_RECV or CAP_SEND or CAP_SETSOCKOPT or CAP_SHUTDOWN

public val CAP_ALL0: ULong = ((1uL shl (57 + (0))) or (0x000007FFFFFFFFFFuL))

public val CAP_UNUSED0_44: ULong = ((1uL shl (57 + (0))) or (0x0000080000000000uL))

public val CAP_UNUSED0_57: ULong = ((1uL shl (57 + (0))) or (0x0100000000000000uL))

public val CAP_MAC_GET: ULong = ((1uL shl (57 + (1))) or (0x0000000000000001uL))

public val CAP_MAC_SET: ULong = ((1uL shl (57 + (1))) or (0x0000000000000002uL))

public val CAP_SEM_GETVALUE: ULong = ((1uL shl (57 + (1))) or (0x0000000000000004uL))

public val CAP_SEM_POST: ULong = ((1uL shl (57 + (1))) or (0x0000000000000008uL))

public val CAP_SEM_WAIT: ULong = ((1uL shl (57 + (1))) or (0x0000000000000010uL))

public val CAP_EVENT: ULong = ((1uL shl (57 + (1))) or (0x0000000000000020uL))

public val CAP_KQUEUE_EVENT: ULong = ((1uL shl (57 + (1))) or (0x0000000000000040uL))

public val CAP_IOCTL: ULong = ((1uL shl (57 + (1))) or (0x0000000000000080uL))

public val CAP_TTYHOOK: ULong = ((1uL shl (57 + (1))) or (0x0000000000000100uL))

public val CAP_PDGETPID: ULong = ((1uL shl (57 + (1))) or (0x0000000000000200uL))

public val CAP_PDWAIT: ULong = ((1uL shl (57 + (1))) or (0x0000000000000400uL))

public val CAP_PDKILL: ULong = ((1uL shl (57 + (1))) or (0x0000000000000800uL))

public val CAP_EXTATTR_DELETE: ULong = ((1uL shl (57 + (1))) or (0x0000000000001000uL))

public val CAP_EXTATTR_GET: ULong = ((1uL shl (57 + (1))) or (0x0000000000002000uL))

public val CAP_EXTATTR_LIST: ULong = ((1uL shl (57 + (1))) or (0x0000000000004000uL))

public val CAP_EXTATTR_SET: ULong = ((1uL shl (57 + (1))) or (0x0000000000008000uL))

public val CAP_ACL_CHECK: ULong = ((1uL shl (57 + (1))) or (0x0000000000010000uL))

public val CAP_ACL_DELETE: ULong = ((1uL shl (57 + (1))) or (0x0000000000020000uL))

public val CAP_ACL_GET: ULong = ((1uL shl (57 + (1))) or (0x0000000000040000uL))

public val CAP_ACL_SET: ULong = ((1uL shl (57 + (1))) or (0x0000000000080000uL))

public val CAP_KQUEUE_CHANGE: ULong = ((1uL shl (57 + (1))) or (0x0000000000100000uL))

public val CAP_KQUEUE: ULong = CAP_KQUEUE_EVENT or CAP_KQUEUE_CHANGE

public val CAP_ALL1: ULong = ((1uL shl (57 + (1))) or (0x00000000001FFFFFuL))

public val CAP_UNUSED1_22: ULong = ((1uL shl (57 + (1))) or (0x0000000000200000uL))

public val CAP_UNUSED1_57: ULong = ((1uL shl (57 + (1))) or (0x0100000000000000uL))

public val CAP_FCNTL_GETFL: UInt = 1u shl 3

public val CAP_FCNTL_SETFL: UInt = 1u shl 4

public val CAP_FCNTL_GETOWN: UInt = 1u shl 5

public val CAP_FCNTL_SETOWN: UInt = 1u shl 6

// sys/devicestat.h
public val DEVSTAT_N_TRANS_FLAGS: CInt = 4

public val DEVSTAT_NAME_LEN: CInt = 16

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

public val RLIM_NLIMITS: RlimT = 15

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

public val EVFILT_READ: Short = -1

public val EVFILT_WRITE: Short = -2

public val EVFILT_AIO: Short = -3

public val EVFILT_VNODE: Short = -4

public val EVFILT_PROC: Short = -5

public val EVFILT_SIGNAL: Short = -6

public val EVFILT_TIMER: Short = -7

public val EVFILT_PROCDESC: Short = -8

public val EVFILT_FS: Short = -9

public val EVFILT_LIO: Short = -10

public val EVFILT_USER: Short = -11

public val EVFILT_SENDFILE: Short = -12

public val EVFILT_EMPTY: Short = -13

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

public val CTLFLAG_RD: CInt = 0x80000000

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

public val SO_VENDOR: CInt = 0x80000000

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

public val PROC_ASLR_ACTIVE: CInt = 0x80000000

public val PROC_PROTMAX_FORCE_ENABLE: CInt = 1

public val PROC_PROTMAX_FORCE_DISABLE: CInt = 2

public val PROC_PROTMAX_NOFORCE: CInt = 3

public val PROC_PROTMAX_ACTIVE: CInt = 0x80000000

public val PROC_STACKGAP_ENABLE: CInt = 0x0001

public val PROC_STACKGAP_DISABLE: CInt = 0x0002

public val PROC_STACKGAP_ENABLE_EXEC: CInt = 0x0004

public val PROC_STACKGAP_DISABLE_EXEC: CInt = 0x0008

public val PROC_NO_NEW_PRIVS_ENABLE: CInt = 1

public val PROC_NO_NEW_PRIVS_DISABLE: CInt = 2

public val PROC_WX_MAPPINGS_PERMIT: CInt = 0x0001

public val PROC_WX_MAPPINGS_DISALLOW_EXEC: CInt = 0x0002

public val PROC_WXORX_ENFORCE: CInt = 0x80000000

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
public val IFCAP_TXTLS_RTLMT: CInt = 0x80000000

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

public val SHM_ANON: COpaquePointer? = COpaquePointer(1.toLong())

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

public val B460800: SpeedT = 460800

public val B921600: SpeedT = 921600

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

public val TABDLY: TcflagT = 0x00000004

public val TAB0: TcflagT = 0x00000000

public val TAB3: TcflagT = 0x00000004

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

public val RFSPAWN: CInt = 2147483648

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

public val KI_NSPARE_LONG: Int = 12

/**
 * Flags for the process credential.
 */
public val KI_CRF_CAPABILITY_MODE: Int = 0x00000001

/**
 * Steal a bit from kiCrFlags to indicate that the cred had more than
 * KI_NGROUPS groups.
 */
public val KI_CRF_GRP_OVERFLOW: Int = 0x80000000

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

public val PRI_MAX_ITHD: CInt = PRI_MIN_REALTIME - 1

public val PI_REALTIME: CInt = PRI_MIN_ITHD + 0

public val PI_AV: CInt = PRI_MIN_ITHD + 4

public val PI_NET: CInt = PRI_MIN_ITHD + 8

public val PI_DISK: CInt = PRI_MIN_ITHD + 12

public val PI_TTY: CInt = PRI_MIN_ITHD + 16

public val PI_DULL: CInt = PRI_MIN_ITHD + 20

public val PI_SOFT: CInt = PRI_MIN_ITHD + 24

public val PRI_MIN_REALTIME: CInt = 48

public val PRI_MAX_REALTIME: CInt = PRI_MIN_KERN - 1

public val PRI_MIN_KERN: CInt = 80

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

public val PRI_MIN_TIMESHARE: CInt = 120

public val PRI_MAX_TIMESHARE: CInt = PRI_MIN_IDLE - 1

public val PUSER: CInt = PRI_MIN_TIMESHARE

public val PRI_MIN_IDLE: CInt = 224

public val PRI_MAX_IDLE: CInt = PRI_MAX

public val NZERO: CInt = 0

// Resource utilization information.
public val RUSAGE_THREAD: CInt = 1

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
 *  / * max number groups
 */
public val NGROUPS: CInt = NGROUPS_MAX + 1

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

/**
 * max supplemental group id's
 */
public val NGROUPS_MAX: CInt = 1023

/**
 * max open files per process
 */
public val OPEN_MAX: CInt = 64

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

public val P_PPTRACE: CInt = 0x80000000

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

public val SIDL: CChar = 1

public val SRUN: CChar = 2

public val SSLEEP: CChar = 3

public val SSTOP: CChar = 4

public val SZOMB: CChar = 5

public val SWAIT: CChar = 6

public val SLOCK: CChar = 7

public val P_MAGIC: CInt = 0xbeefface

public val TDP_SIGFASTBLOCK: CInt = 0x00000100

public val TDP_UIOHELD: CInt = 0x10000000

public val TDP_SIGFASTPENDING: CInt = 0x80000000

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

public val SIGLIBRT: CInt = 33

// netinet/sctp.h
public val SCTP_FUTURE_ASSOC: CInt = 0

public val SCTP_CURRENT_ASSOC: CInt = 1

public val SCTP_ALL_ASSOC: CInt = 2

public val SCTP_NO_NEXT_MSG: CInt = 0x0000

public val SCTP_NEXT_MSG_AVAIL: CInt = 0x0001

public val SCTP_NEXT_MSG_ISCOMPLETE: CInt = 0x0002

public val SCTP_NEXT_MSG_IS_UNORDERED: CInt = 0x0004

public val SCTP_NEXT_MSG_IS_NOTIFICATION: CInt = 0x0008

public val SCTP_RECVV_NOINFO: CInt = 0

public val SCTP_RECVV_RCVINFO: CInt = 1

public val SCTP_RECVV_NXTINFO: CInt = 2

public val SCTP_RECVV_RN: CInt = 3

public val SCTP_SENDV_NOINFO: CInt = 0

public val SCTP_SENDV_SNDINFO: CInt = 1

public val SCTP_SENDV_PRINFO: CInt = 2

public val SCTP_SENDV_AUTHINFO: CInt = 3

public val SCTP_SENDV_SPA: CInt = 4

public val SCTP_SEND_SNDINFO_VALID: CInt = 0x00000001

public val SCTP_SEND_PRINFO_VALID: CInt = 0x00000002

public val SCTP_SEND_AUTHINFO_VALID: CInt = 0x00000004

public val SCTP_NOTIFICATION: CInt = 0x0010

public val SCTP_COMPLETE: CInt = 0x0020

public val SCTP_EOF: CInt = 0x0100

public val SCTP_ABORT: CInt = 0x0200

public val SCTP_UNORDERED: CInt = 0x0400

public val SCTP_ADDR_OVER: CInt = 0x0800

public val SCTP_SENDALL: CInt = 0x1000

public val SCTP_EOR: CInt = 0x2000

public val SCTP_SACK_IMMEDIATELY: CInt = 0x4000

public val SCTP_PR_SCTP_NONE: CInt = 0x0000

public val SCTP_PR_SCTP_TTL: CInt = 0x0001

public val SCTP_PR_SCTP_PRIO: CInt = 0x0002

public val SCTP_PR_SCTP_BUF: CInt = SCTP_PR_SCTP_PRIO

public val SCTP_PR_SCTP_RTX: CInt = 0x0003

public val SCTP_PR_SCTP_MAX: CInt = SCTP_PR_SCTP_RTX

public val SCTP_PR_SCTP_ALL: CInt = 0x000f

public val SCTP_INIT: CInt = 0x0001

public val SCTP_SNDRCV: CInt = 0x0002

public val SCTP_EXTRCV: CInt = 0x0003

public val SCTP_SNDINFO: CInt = 0x0004

public val SCTP_RCVINFO: CInt = 0x0005

public val SCTP_NXTINFO: CInt = 0x0006

public val SCTP_PRINFO: CInt = 0x0007

public val SCTP_AUTHINFO: CInt = 0x0008

public val SCTP_DSTADDRV4: CInt = 0x0009

public val SCTP_DSTADDRV6: CInt = 0x000a

public val SCTP_RTOINFO: CInt = 0x00000001

public val SCTP_ASSOCINFO: CInt = 0x00000002

public val SCTP_INITMSG: CInt = 0x00000003

public val SCTP_NODELAY: CInt = 0x00000004

public val SCTP_AUTOCLOSE: CInt = 0x00000005

public val SCTP_SET_PEER_PRIMARY_ADDR: CInt = 0x00000006

public val SCTP_PRIMARY_ADDR: CInt = 0x00000007

public val SCTP_ADAPTATION_LAYER: CInt = 0x00000008

public val SCTP_ADAPTION_LAYER: CInt = 0x00000008

public val SCTP_DISABLE_FRAGMENTS: CInt = 0x00000009

public val SCTP_PEER_ADDR_PARAMS: CInt = 0x0000000a

public val SCTP_DEFAULT_SEND_PARAM: CInt = 0x0000000b

public val SCTP_EVENTS: CInt = 0x0000000c

public val SCTP_I_WANT_MAPPED_V4_ADDR: CInt = 0x0000000d

public val SCTP_MAXSEG: CInt = 0x0000000e

public val SCTP_DELAYED_SACK: CInt = 0x0000000f

public val SCTP_FRAGMENT_INTERLEAVE: CInt = 0x00000010

public val SCTP_PARTIAL_DELIVERY_POINT: CInt = 0x00000011

public val SCTP_AUTH_CHUNK: CInt = 0x00000012

public val SCTP_AUTH_KEY: CInt = 0x00000013

public val SCTP_HMAC_IDENT: CInt = 0x00000014

public val SCTP_AUTH_ACTIVE_KEY: CInt = 0x00000015

public val SCTP_AUTH_DELETE_KEY: CInt = 0x00000016

public val SCTP_USE_EXT_RCVINFO: CInt = 0x00000017

public val SCTP_AUTO_ASCONF: CInt = 0x00000018

public val SCTP_MAXBURST: CInt = 0x00000019

public val SCTP_MAX_BURST: CInt = 0x00000019

public val SCTP_CONTEXT: CInt = 0x0000001a

public val SCTP_EXPLICIT_EOR: CInt = 0x00000001b

public val SCTP_REUSE_PORT: CInt = 0x00000001c

public val SCTP_AUTH_DEACTIVATE_KEY: CInt = 0x00000001d

public val SCTP_EVENT: CInt = 0x0000001e

public val SCTP_RECVRCVINFO: CInt = 0x0000001f

public val SCTP_RECVNXTINFO: CInt = 0x00000020

public val SCTP_DEFAULT_SNDINFO: CInt = 0x00000021

public val SCTP_DEFAULT_PRINFO: CInt = 0x00000022

public val SCTP_PEER_ADDR_THLDS: CInt = 0x00000023

public val SCTP_REMOTE_UDP_ENCAPS_PORT: CInt = 0x00000024

public val SCTP_ECN_SUPPORTED: CInt = 0x00000025

public val SCTP_AUTH_SUPPORTED: CInt = 0x00000027

public val SCTP_ASCONF_SUPPORTED: CInt = 0x00000028

public val SCTP_RECONFIG_SUPPORTED: CInt = 0x00000029

public val SCTP_NRSACK_SUPPORTED: CInt = 0x00000030

public val SCTP_PKTDROP_SUPPORTED: CInt = 0x00000031

public val SCTP_MAX_CWND: CInt = 0x00000032

public val SCTP_STATUS: CInt = 0x00000100

public val SCTP_GET_PEER_ADDR_INFO: CInt = 0x00000101

public val SCTP_PEER_AUTH_CHUNKS: CInt = 0x00000102

public val SCTP_LOCAL_AUTH_CHUNKS: CInt = 0x00000103

public val SCTP_GET_ASSOC_NUMBER: CInt = 0x00000104

public val SCTP_GET_ASSOC_ID_LIST: CInt = 0x00000105

public val SCTP_TIMEOUTS: CInt = 0x00000106

public val SCTP_PR_STREAM_STATUS: CInt = 0x00000107

public val SCTP_PR_ASSOC_STATUS: CInt = 0x00000108

public val SCTP_COMM_UP: CInt = 0x0001

public val SCTP_COMM_LOST: CInt = 0x0002

public val SCTP_RESTART: CInt = 0x0003

public val SCTP_SHUTDOWN_COMP: CInt = 0x0004

public val SCTP_CANT_STR_ASSOC: CInt = 0x0005

public val SCTP_ASSOC_SUPPORTS_PR: CInt = 0x01

public val SCTP_ASSOC_SUPPORTS_AUTH: CInt = 0x02

public val SCTP_ASSOC_SUPPORTS_ASCONF: CInt = 0x03

public val SCTP_ASSOC_SUPPORTS_MULTIBUF: CInt = 0x04

public val SCTP_ASSOC_SUPPORTS_RE_CONFIG: CInt = 0x05

public val SCTP_ASSOC_SUPPORTS_INTERLEAVING: CInt = 0x06

public val SCTP_ASSOC_SUPPORTS_MAX: CInt = 0x06

public val SCTP_ADDR_AVAILABLE: CInt = 0x0001

public val SCTP_ADDR_UNREACHABLE: CInt = 0x0002

public val SCTP_ADDR_REMOVED: CInt = 0x0003

public val SCTP_ADDR_ADDED: CInt = 0x0004

public val SCTP_ADDR_MADE_PRIM: CInt = 0x0005

public val SCTP_ADDR_CONFIRMED: CInt = 0x0006

public val SCTP_ACTIVE: CInt = 0x0001

public val SCTP_INACTIVE: CInt = 0x0002

public val SCTP_UNCONFIRMED: CInt = 0x0200

public val SCTP_DATA_UNSENT: CInt = 0x0001

public val SCTP_DATA_SENT: CInt = 0x0002

public val SCTP_PARTIAL_DELIVERY_ABORTED: CInt = 0x0001

public val SCTP_AUTH_NEW_KEY: CInt = 0x0001

public val SCTP_AUTH_NEWKEY: CInt = SCTP_AUTH_NEW_KEY

public val SCTP_AUTH_NO_AUTH: CInt = 0x0002

public val SCTP_AUTH_FREE_KEY: CInt = 0x0003

public val SCTP_STREAM_RESET_INCOMING_SSN: CInt = 0x0001

public val SCTP_STREAM_RESET_OUTGOING_SSN: CInt = 0x0002

public val SCTP_STREAM_RESET_DENIED: CInt = 0x0004

public val SCTP_STREAM_RESET_FAILED: CInt = 0x0008

public val SCTP_ASSOC_RESET_DENIED: CInt = 0x0004

public val SCTP_ASSOC_RESET_FAILED: CInt = 0x0008

public val SCTP_STREAM_CHANGE_DENIED: CInt = 0x0004

public val SCTP_STREAM_CHANGE_FAILED: CInt = 0x0008

public val KENV_DUMP_LOADER: CInt = 4

public val KENV_DUMP_STATIC: CInt = 5

public val RB_PAUSE: CInt = 0x100000

public val RB_REROOT: CInt = 0x200000

public val RB_POWERCYCLE: CInt = 0x400000

public val RB_PROBE: CInt = 0x10000000

public val RB_MULTIPLE: CInt = 0x20000000

// netinet/inPcb.h
public val INC_ISIPV6: CUchar = 0x01u

public val INC_IPV6MINMTU: CUchar = 0x02u

// sys/time.h
public val CLOCK_BOOTTIME: ClockidT = CLOCK_UPTIME

public val CLOCK_REALTIME_COARSE: ClockidT = CLOCK_REALTIME_FAST

public val CLOCK_MONOTONIC_COARSE: ClockidT = CLOCK_MONOTONIC_FAST

// sys/timerfd.h
public val TFD_NONBLOCK: CInt = O_NONBLOCK

public val TFD_CLOEXEC: CInt = O_CLOEXEC

public val TFD_TIMER_ABSTIME: CInt = 0x01

public val TFD_TIMER_CANCEL_ON_SET: CInt = 0x02

// sys/unistd.h
public val CLOSE_RANGE_CLOEXEC: CUint = 1u shl 2

public val KCMP_FILE: CInt = 100

public val KCMP_FILEOBJ: CInt = 101

public val KCMP_FILES: CInt = 102

public val KCMP_SIGHAND: CInt = 103

public val KCMP_VM: CInt = 104

public fun mapAligned(a: CInt): CInt {
    return a shl 24
}

public fun align(p: Int): Int {
    return (p + ALIGNBYTES) and ALIGNBYTES.inv()
}

public fun error(): CInt? {
    val rawRet = LibcDynamicFfi.invoke("__error", -1, longArrayOf())
    return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 4).toInt()
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

public fun aioReadv(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_readv", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
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

public fun aioWritev(aiocbp: Aiocb?): CInt {
    return LibcDynamicFfi.invoke("aio_writev", -1, longArrayOf(aiocbp?.value ?: 0L)).toInt()
}

public fun copyFileRange(infd: CInt, inoffp: OffT?, outfd: CInt, outoffp: OffT?, len: SizeT, flags: CUint): SsizeT {
    val __slot_1 = if (inoffp == null) 0L else LibcDynamicFfi.allocScalarSlot(inoffp)
    val __slot_3 = if (outoffp == null) 0L else LibcDynamicFfi.allocScalarSlot(outoffp)
    try {
        return LibcDynamicFfi.invoke("copy_file_range", -1, longArrayOf(infd.toLong(), __slot_1, outfd.toLong(), __slot_3, len.toLong(), flags.toLong()))
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: CInt): COpaquePointer? {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        val rawRet = LibcDynamicFfi.invoke("devname_r", -1, longArrayOf(__scratch_0, mode.toLong(), buf?.value ?: 0L, len.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt {
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_delete_fd", -1, longArrayOf(fd.toLong(), attrnamespace.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_delete_file", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_delete_link", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_get_fd", -1, longArrayOf(fd.toLong(), attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_get_file", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_get_link", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("extattr_list_fd", -1, longArrayOf(fd.toLong(), attrnamespace.toLong(), data?.value ?: 0L, nbytes.toLong()))
}

public fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("extattr_list_file", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("extattr_list_link", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_set_fd", -1, longArrayOf(fd.toLong(), attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_set_file", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __cstr_2 = if (attrname == null) 0L else LibcDynamicFfi.allocUtf8CString(attrname)
    try {
        return LibcDynamicFfi.invoke("extattr_set_link", -1, longArrayOf(__cstr_0, attrnamespace.toLong(), __cstr_2, data?.value ?: 0L, nbytes.toLong()))
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun fspacectl(fd: CInt, cmd: CInt, rqsr: SpacectlRange?, flags: CInt, rmsr: SpacectlRange?): CInt {
    return LibcDynamicFfi.invoke("fspacectl", -1, longArrayOf(fd.toLong(), cmd.toLong(), rqsr?.value ?: 0L, flags.toLong(), rmsr?.value ?: 0L)).toInt()
}

public fun jail(jail: Jail?): CInt {
    return LibcDynamicFfi.invoke("jail", -1, longArrayOf(jail?.value ?: 0L)).toInt()
}

public fun jailAttach(jid: CInt): CInt {
    return LibcDynamicFfi.invoke("jail_attach", -1, longArrayOf(jid.toLong())).toInt()
}

public fun jailRemove(jid: CInt): CInt {
    return LibcDynamicFfi.invoke("jail_remove", -1, longArrayOf(jid.toLong())).toInt()
}

public fun jailGet(iov: Iovec?, niov: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("jail_get", -1, longArrayOf(iov?.value ?: 0L, niov.toLong(), flags.toLong())).toInt()
}

public fun jailSet(iov: Iovec?, niov: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("jail_set", -1, longArrayOf(iov?.value ?: 0L, niov.toLong(), flags.toLong())).toInt()
}

public fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt {
    return LibcDynamicFfi.invoke("lio_listio", -1, longArrayOf(mode.toLong(), aiocbList?.value ?: 0L, nitems.toLong(), sevp?.value ?: 0L)).toInt()
}

public fun getutxuser(user: String?): Utmpx? {
    val __cstr_0 = if (user == null) 0L else LibcDynamicFfi.allocUtf8CString(user)
    try {
        val rawRet = LibcDynamicFfi.invoke("getutxuser", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun setutxdb(type: CInt, file: String?): CInt {
    val __cstr_1 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("setutxdb", -1, longArrayOf(type.toLong(), __cstr_1)).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): SsizeT {
    return LibcDynamicFfi.invoke("aio_waitcomplete", -1, longArrayOf(iocbp?.value ?: 0L, timeout?.value ?: 0L))
}

public fun mqGetfdNp(mqd: MqdT): CInt {
    return LibcDynamicFfi.invoke("mq_getfd_np", -1, longArrayOf(mqd?.value ?: 0L)).toInt()
}

public fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt {
    return LibcDynamicFfi.invoke("waitid", -1, longArrayOf(idtype.toLong(), id.toLong(), infop?.value ?: 0L, options.toLong())).toInt()
}

public fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt {
    return LibcDynamicFfi.invoke("ptsname_r", -1, longArrayOf(fd.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun ftok(pathname: String?, projId: CInt): KeyT {
    val __cstr_0 = if (pathname == null) 0L else LibcDynamicFfi.allocUtf8CString(pathname)
    try {
        return LibcDynamicFfi.invoke("ftok", -1, longArrayOf(__cstr_0, projId.toLong())).toInt()
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

public fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt {
    return LibcDynamicFfi.invoke("semget", -1, longArrayOf(key.toLong(), nsems.toLong(), semflg.toLong())).toInt()
}

public fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt {
    return LibcDynamicFfi.invoke("semctl", 3, longArrayOf(semid.toLong(), semnum.toLong(), cmd.toLong()) + variadicArgs).toInt()
}

public fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt {
    return LibcDynamicFfi.invoke("semop", -1, longArrayOf(semid.toLong(), sops?.value ?: 0L, nsops.toLong())).toInt()
}

public fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt {
    return LibcDynamicFfi.invoke("msgctl", -1, longArrayOf(msqid.toLong(), cmd.toLong(), buf?.value ?: 0L)).toInt()
}

public fun msgget(key: KeyT, msgflg: CInt): CInt {
    return LibcDynamicFfi.invoke("msgget", -1, longArrayOf(key.toLong(), msgflg.toLong())).toInt()
}

public fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt {
    return LibcDynamicFfi.invoke("msgsnd", -1, longArrayOf(msqid.toLong(), msgp?.value ?: 0L, msgsz.toLong(), msgflg.toLong())).toInt()
}

public fun cfmakesane(termios: Termios?) {
    LibcDynamicFfi.invoke("cfmakesane", -1, longArrayOf(termios?.value ?: 0L))
}

public fun pdfork(fdp: CInt?, flags: CInt): PidT {
    val __slot_0 = if (fdp == null) 0L else LibcDynamicFfi.allocScalarSlot(fdp.toLong())
    try {
        return LibcDynamicFfi.invoke("pdfork", -1, longArrayOf(__slot_0, flags.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pdgetpid(fd: CInt, pidp: PidT?): CInt {
    val __slot_1 = if (pidp == null) 0L else LibcDynamicFfi.allocScalarSlot(pidp.toLong())
    try {
        return LibcDynamicFfi.invoke("pdgetpid", -1, longArrayOf(fd.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pdkill(fd: CInt, signum: CInt): CInt {
    return LibcDynamicFfi.invoke("pdkill", -1, longArrayOf(fd.toLong(), signum.toLong())).toInt()
}

public fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: Rtprio?): CInt {
    return LibcDynamicFfi.invoke("rtprio_thread", -1, longArrayOf(function.toLong(), lwpid.toLong(), rtp?.value ?: 0L)).toInt()
}

public fun uuidgen(store: Uuid?, count: CInt): CInt {
    return LibcDynamicFfi.invoke("uuidgen", -1, longArrayOf(store?.value ?: 0L, count.toLong())).toInt()
}

public fun thrKill(id: CLong, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("thr_kill", -1, longArrayOf(id, sig.toLong())).toInt()
}

public fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("thr_kill2", -1, longArrayOf(pid.toLong(), id, sig.toLong())).toInt()
}

public fun thrSelf(tid: CLong?): CInt {
    val __slot_0 = if (tid == null) 0L else LibcDynamicFfi.allocScalarSlot(tid)
    try {
        return LibcDynamicFfi.invoke("thr_self", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun pthreadGetthreadidNp(): CInt {
    return LibcDynamicFfi.invoke("pthread_getthreadid_np", -1, longArrayOf()).toInt()
}

public fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: CpusetT?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_getaffinity_np", -1, longArrayOf(__scratch_0, cpusetsize.toLong(), cpusetp?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: CpusetT?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_setaffinity_np", -1, longArrayOf(__scratch_0, cpusetsize.toLong(), cpusetp?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

// sched.h linux compatibility api
public fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: CpusetT?): CInt {
    return LibcDynamicFfi.invoke("sched_getaffinity", -1, longArrayOf(pid.toLong(), cpusetsz.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: CpusetT?): CInt {
    return LibcDynamicFfi.invoke("sched_setaffinity", -1, longArrayOf(pid.toLong(), cpusetsz.toLong(), cpuset?.value ?: 0L)).toInt()
}

public fun schedGetcpu(): CInt {
    return LibcDynamicFfi.invoke("sched_getcpu", -1, longArrayOf()).toInt()
}

public fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt {
    return LibcDynamicFfi.invoke("pthread_mutex_consistent", -1, longArrayOf(mutex?.value ?: 0L)).toInt()
}

public fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robust: CInt?): CInt {
    val __slot_1 = if (robust == null) 0L else LibcDynamicFfi.allocScalarSlot(robust.toLong())
    try {
        return LibcDynamicFfi.invoke("pthread_mutexattr_getrobust", -1, longArrayOf(attr?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robust: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_mutexattr_setrobust", -1, longArrayOf(attr?.value ?: 0L, robust.toLong())).toInt()
}

public fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt {
    return LibcDynamicFfi.invoke("pthread_spin_init", -1, longArrayOf(lock?.value ?: 0L, pshared.toLong())).toInt()
}

public fun pthreadSpinDestroy(lock: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_spin_destroy", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadSpinLock(lock: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_spin_lock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadSpinTrylock(lock: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_spin_trylock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadSpinUnlock(lock: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("pthread_spin_unlock", -1, longArrayOf(lock?.value ?: 0L)).toInt()
}

public fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("pthread_timedjoin_np", -1, longArrayOf(__scratch_0, retval?.value ?: 0L, abstime?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
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

public fun dup3(src: CInt, dst: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("dup3", -1, longArrayOf(src.toLong(), dst.toLong(), flags.toLong())).toInt()
}

public fun xuname(nmln: CInt, buf: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("__xuname", -1, longArrayOf(nmln.toLong(), buf?.value ?: 0L)).toInt()
}

public fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: SizeT, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("sendmmsg", -1, longArrayOf(sockfd.toLong(), msgvec?.value ?: 0L, vlen.toLong(), flags.toLong()))
}

public fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: SizeT, flags: CInt, timeout: Timespec?): SsizeT {
    return LibcDynamicFfi.invoke("recvmmsg", -1, longArrayOf(sockfd.toLong(), msgvec?.value ?: 0L, vlen.toLong(), flags.toLong(), timeout?.value ?: 0L))
}

public fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memmem", -1, longArrayOf(haystack?.value ?: 0L, haystacklen.toLong(), needle?.value ?: 0L, needlelen.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun fhopen(fhp: Fhandle?, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("fhopen", -1, longArrayOf(fhp?.value ?: 0L, flags.toLong())).toInt()
}

public fun fhstat(fhp: Fhandle?, buf: Stat?): CInt {
    return LibcDynamicFfi.invoke("fhstat", -1, longArrayOf(fhp?.value ?: 0L, buf?.value ?: 0L)).toInt()
}

public fun fhstatfs(fhp: Fhandle?, buf: Statfs?): CInt {
    return LibcDynamicFfi.invoke("fhstatfs", -1, longArrayOf(fhp?.value ?: 0L, buf?.value ?: 0L)).toInt()
}

public fun getfh(path: String?, fhp: Fhandle?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("getfh", -1, longArrayOf(__cstr_0, fhp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun lgetfh(path: String?, fhp: Fhandle?): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("lgetfh", -1, longArrayOf(__cstr_0, fhp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun getfsstat(buf: Statfs?, bufsize: CLong, mode: CInt): CInt {
    return LibcDynamicFfi.invoke("getfsstat", -1, longArrayOf(buf?.value ?: 0L, bufsize, mode.toLong())).toInt()
}

public fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt {
    return LibcDynamicFfi.invoke("getmntinfo", -1, longArrayOf(mntbufp?.value ?: 0L, mode.toLong())).toInt()
}

public fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt {
    val __cstr_0 = if (type == null) 0L else LibcDynamicFfi.allocUtf8CString(type)
    val __cstr_1 = if (dir == null) 0L else LibcDynamicFfi.allocUtf8CString(dir)
    try {
        return LibcDynamicFfi.invoke("mount", -1, longArrayOf(__cstr_0, __cstr_1, flags.toLong(), data?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun nmount(iov: Iovec?, niov: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("nmount", -1, longArrayOf(iov?.value ?: 0L, niov.toLong(), flags.toLong())).toInt()
}

public fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
    val __cstr_0 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        LibcDynamicFfi.invoke("setproctitle", 1, longArrayOf(__cstr_0) + variadicArgs)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun rfork(flags: CInt): CInt {
    return LibcDynamicFfi.invoke("rfork", -1, longArrayOf(flags.toLong())).toInt()
}

public fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CpusetT?): CInt {
    return LibcDynamicFfi.invoke("cpuset_getaffinity", -1, longArrayOf(level.toLong(), which.toLong(), id.toLong(), setsize.toLong(), mask?.value ?: 0L)).toInt()
}

public fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CpusetT?): CInt {
    return LibcDynamicFfi.invoke("cpuset_setaffinity", -1, longArrayOf(level.toLong(), which.toLong(), id.toLong(), setsize.toLong(), mask?.value ?: 0L)).toInt()
}

public fun cpuset(setid: CInt?): CInt {
    val __slot_0 = if (setid == null) 0L else LibcDynamicFfi.allocScalarSlot(setid.toLong())
    try {
        return LibcDynamicFfi.invoke("cpuset", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: CInt?): CInt {
    val __slot_3 = if (setid == null) 0L else LibcDynamicFfi.allocScalarSlot(setid.toLong())
    try {
        return LibcDynamicFfi.invoke("cpuset_getid", -1, longArrayOf(level.toLong(), which.toLong(), id.toLong(), __slot_3)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt {
    return LibcDynamicFfi.invoke("cpuset_setid", -1, longArrayOf(which.toLong(), id.toLong(), setid.toLong())).toInt()
}

public fun capEnter(): CInt {
    return LibcDynamicFfi.invoke("cap_enter", -1, longArrayOf()).toInt()
}

public fun capGetmode(modep: CUint?): CInt {
    val __slot_0 = if (modep == null) 0L else LibcDynamicFfi.allocScalarSlot(modep.toLong())
    try {
        return LibcDynamicFfi.invoke("cap_getmode", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun capFcntlsGet(fd: CInt, fcntlrightsp: CUint?): CInt {
    val __slot_1 = if (fcntlrightsp == null) 0L else LibcDynamicFfi.allocScalarSlot(fcntlrightsp.toLong())
    try {
        return LibcDynamicFfi.invoke("cap_fcntls_get", -1, longArrayOf(fd.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt {
    return LibcDynamicFfi.invoke("cap_fcntls_limit", -1, longArrayOf(fd.toLong(), fcntlrights.toLong())).toInt()
}

public fun capIoctlsGet(fd: CInt, cmds: CUlong?, maxcmds: ULong): Long {
    val __slot_1 = if (cmds == null) 0L else LibcDynamicFfi.allocScalarSlot(cmds.toLong())
    try {
        return LibcDynamicFfi.invoke("cap_ioctls_get", -1, longArrayOf(fd.toLong(), __slot_1, maxcmds.toLong()))
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun capIoctlsLimit(fd: CInt, cmds: CUlong?, ncmds: ULong): CInt {
    val __slot_1 = if (cmds == null) 0L else LibcDynamicFfi.allocScalarSlot(cmds.toLong())
    try {
        return LibcDynamicFfi.invoke("cap_ioctls_limit", -1, longArrayOf(fd.toLong(), __slot_1, ncmds.toLong())).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun capRightsInit(version: CInt, rights: CapRightsT?, vararg variadicArgs: Long): CapRightsT? {
    val rawRet = LibcDynamicFfi.invoke("__cap_rights_init", 2, longArrayOf(version.toLong(), rights?.value ?: 0L) + variadicArgs)
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun capRightsGet(version: CInt, fd: CInt, rightsp: CapRightsT?): CInt {
    return LibcDynamicFfi.invoke("__cap_rights_get", -1, longArrayOf(version.toLong(), fd.toLong(), rightsp?.value ?: 0L)).toInt()
}

public fun capRightsSet(rights: CapRightsT?, vararg variadicArgs: Long): CapRightsT? {
    val rawRet = LibcDynamicFfi.invoke("__cap_rights_set", 1, longArrayOf(rights?.value ?: 0L) + variadicArgs)
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun capRightsClear(rights: CapRightsT?, vararg variadicArgs: Long): CapRightsT? {
    val rawRet = LibcDynamicFfi.invoke("__cap_rights_clear", 1, longArrayOf(rights?.value ?: 0L) + variadicArgs)
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun capRightsIsSet(rights: CapRightsT?, vararg variadicArgs: Long): Boolean {
    val rawRet = LibcDynamicFfi.invoke("__cap_rights_is_set", 1, longArrayOf(rights?.value ?: 0L) + variadicArgs)
    return (rawRet and 0xFFL) != 0L
}

public fun capRightsIsValid(rights: CapRightsT?): Boolean {
    val rawRet = LibcDynamicFfi.invoke("cap_rights_is_valid", -1, longArrayOf(rights?.value ?: 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun capRightsLimit(fd: CInt, rights: CapRightsT?): CInt {
    return LibcDynamicFfi.invoke("cap_rights_limit", -1, longArrayOf(fd.toLong(), rights?.value ?: 0L)).toInt()
}

public fun capRightsMerge(dst: CapRightsT?, src: CapRightsT?): CapRightsT? {
    val rawRet = LibcDynamicFfi.invoke("cap_rights_merge", -1, longArrayOf(dst?.value ?: 0L, src?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun capRightsRemove(dst: CapRightsT?, src: CapRightsT?): CapRightsT? {
    val rawRet = LibcDynamicFfi.invoke("cap_rights_remove", -1, longArrayOf(dst?.value ?: 0L, src?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun capRightsContains(big: CapRightsT?, little: CapRightsT?): Boolean {
    val rawRet = LibcDynamicFfi.invoke("cap_rights_contains", -1, longArrayOf(big?.value ?: 0L, little?.value ?: 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun capSandboxed(): Boolean {
    val rawRet = LibcDynamicFfi.invoke("cap_sandboxed", -1, longArrayOf())
    return (rawRet and 0xFFL) != 0L
}

public fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("reallocarray", -1, longArrayOf(ptr?.value ?: 0L, nmemb.toLong(), size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun ffs(value: CInt): CInt {
    return LibcDynamicFfi.invoke("ffs", -1, longArrayOf(value.toLong())).toInt()
}

public fun ffsl(value: CLong): CInt {
    return LibcDynamicFfi.invoke("ffsl", -1, longArrayOf(value)).toInt()
}

public fun ffsll(value: CLonglong): CInt {
    return LibcDynamicFfi.invoke("ffsll", -1, longArrayOf(value)).toInt()
}

public fun fls(value: CInt): CInt {
    return LibcDynamicFfi.invoke("fls", -1, longArrayOf(value.toLong())).toInt()
}

public fun flsl(value: CLong): CInt {
    return LibcDynamicFfi.invoke("flsl", -1, longArrayOf(value)).toInt()
}

public fun flsll(value: CLonglong): CInt {
    return LibcDynamicFfi.invoke("flsll", -1, longArrayOf(value)).toInt()
}

public fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: COpaquePointer?, opt: String?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __cstr_2 = if (opt == null) 0L else LibcDynamicFfi.allocUtf8CString(opt)
    try {
        LibcDynamicFfi.invoke("malloc_stats_print", -1, longArrayOf(__scratch_0, cbopaque?.value ?: 0L, __cstr_2))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __slot_2 = if (oldlenp == null) 0L else LibcDynamicFfi.allocScalarSlot(oldlenp.toLong())
    try {
        return LibcDynamicFfi.invoke("mallctl", -1, longArrayOf(__cstr_0, oldp?.value ?: 0L, __slot_2, newp?.value ?: 0L, newlen.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun mallctlnametomib(name: String?, mibp: SizeT?, miplen: SizeT?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    val __slot_1 = if (mibp == null) 0L else LibcDynamicFfi.allocScalarSlot(mibp.toLong())
    val __slot_2 = if (miplen == null) 0L else LibcDynamicFfi.allocScalarSlot(miplen.toLong())
    try {
        return LibcDynamicFfi.invoke("mallctlnametomib", -1, longArrayOf(__cstr_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun mallctlbymib(mib: SizeT?, mible: SizeT, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt {
    val __slot_0 = if (mib == null) 0L else LibcDynamicFfi.allocScalarSlot(mib.toLong())
    val __slot_3 = if (oldlenp == null) 0L else LibcDynamicFfi.allocScalarSlot(oldlenp.toLong())
    try {
        return LibcDynamicFfi.invoke("mallctlbymib", -1, longArrayOf(__slot_0, mible.toLong(), oldp?.value ?: 0L, __slot_3, newp?.value ?: 0L, newlen.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun mallocx(size: SizeT, flags: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("mallocx", -1, longArrayOf(size.toLong(), flags.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun rallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("rallocx", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), flags.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun xallocx(ptr: COpaquePointer?, size: SizeT, extra: SizeT, flags: CInt): SizeT {
    return LibcDynamicFfi.invoke("xallocx", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), extra.toLong(), flags.toLong())).toULong()
}

public fun sallocx(ptr: COpaquePointer?, flags: CInt): SizeT {
    return LibcDynamicFfi.invoke("sallocx", -1, longArrayOf(ptr?.value ?: 0L, flags.toLong())).toULong()
}

public fun dallocx(ptr: COpaquePointer?, flags: CInt) {
    LibcDynamicFfi.invoke("dallocx", -1, longArrayOf(ptr?.value ?: 0L, flags.toLong()))
}

public fun sdallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt) {
    LibcDynamicFfi.invoke("sdallocx", -1, longArrayOf(ptr?.value ?: 0L, size.toLong(), flags.toLong()))
}

public fun nallocx(size: SizeT, flags: CInt): SizeT {
    return LibcDynamicFfi.invoke("nallocx", -1, longArrayOf(size.toLong(), flags.toLong())).toULong()
}

public fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("procctl", -1, longArrayOf(idtype.toLong(), id.toLong(), cmd.toLong(), data?.value ?: 0L)).toInt()
}

public fun getpagesize(): CInt {
    return LibcDynamicFfi.invoke("getpagesize", -1, longArrayOf()).toInt()
}

public fun getpagesizes(pagesize: SizeT?, nelem: CInt): CInt {
    val __slot_0 = if (pagesize == null) 0L else LibcDynamicFfi.allocScalarSlot(pagesize.toLong())
    try {
        return LibcDynamicFfi.invoke("getpagesizes", -1, longArrayOf(__slot_0, nelem.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: CInt?): CInt {
    val __slot_2 = if (arg3 == null) 0L else LibcDynamicFfi.allocScalarSlot(arg3.toLong())
    try {
        return LibcDynamicFfi.invoke("clock_getcpuclockid2", -1, longArrayOf(arg1.toLong(), arg2.toLong(), __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun strchrnul(s: String?, c: CInt): COpaquePointer? {
    val __cstr_0 = if (s == null) 0L else LibcDynamicFfi.allocUtf8CString(s)
    try {
        val rawRet = LibcDynamicFfi.invoke("strchrnul", -1, longArrayOf(__cstr_0, c.toLong()))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("shm_create_largepage", -1, longArrayOf(__cstr_0, flags.toLong(), psind.toLong(), allocPolicy.toLong(), mode.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt {
    val __cstr_0 = if (pathFrom == null) 0L else LibcDynamicFfi.allocUtf8CString(pathFrom)
    val __cstr_1 = if (pathTo == null) 0L else LibcDynamicFfi.allocUtf8CString(pathTo)
    try {
        return LibcDynamicFfi.invoke("shm_rename", -1, longArrayOf(__cstr_0, __cstr_1, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun memfdCreate(name: String?, flags: CUint): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("memfd_create", -1, longArrayOf(__cstr_0, flags.toLong())).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun setaudit(auditinfo: AuditinfoT?): CInt {
    return LibcDynamicFfi.invoke("setaudit", -1, longArrayOf(auditinfo?.value ?: 0L)).toInt()
}

public fun eventfd(initval: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("eventfd", -1, longArrayOf(initval.toLong(), flags.toLong())).toInt()
}

public fun eventfdRead(fd: CInt, value: CUlong?): CInt {
    val __slot_1 = if (value == null) 0L else LibcDynamicFfi.allocScalarSlot(value.toLong())
    try {
        return LibcDynamicFfi.invoke("eventfd_read", -1, longArrayOf(fd.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun eventfdWrite(fd: CInt, value: EventfdT): CInt {
    return LibcDynamicFfi.invoke("eventfd_write", -1, longArrayOf(fd.toLong(), value.toLong())).toInt()
}

public fun fdatasync(fd: CInt): CInt {
    return LibcDynamicFfi.invoke("fdatasync", -1, longArrayOf(fd.toLong())).toInt()
}

public fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt {
    return LibcDynamicFfi.invoke("elf_aux_info", -1, longArrayOf(aux.toLong(), buf?.value ?: 0L, buflen.toLong())).toInt()
}

public fun setproctitleFast(fmt: String?, vararg variadicArgs: Long) {
    val __cstr_0 = if (fmt == null) 0L else LibcDynamicFfi.allocUtf8CString(fmt)
    try {
        LibcDynamicFfi.invoke("setproctitle_fast", 1, longArrayOf(__cstr_0) + variadicArgs)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("timingsafe_bcmp", -1, longArrayOf(a?.value ?: 0L, b?.value ?: 0L, len.toLong())).toInt()
}

public fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt {
    return LibcDynamicFfi.invoke("timingsafe_memcmp", -1, longArrayOf(a?.value ?: 0L, b?.value ?: 0L, len.toLong())).toInt()
}

public fun umtxOp(obj: COpaquePointer?, op: CInt, value: CUlong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("_umtx_op", -1, longArrayOf(obj?.value ?: 0L, op.toLong(), value.toLong(), uaddr?.value ?: 0L, uaddr2?.value ?: 0L)).toInt()
}

public fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt {
    return LibcDynamicFfi.invoke("sctp_peeloff", -1, longArrayOf(s.toLong(), id.toLong())).toInt()
}

public fun sctpBindx(s: CInt, addrs: Sockaddr?, num: CInt, tpe: CInt): CInt {
    return LibcDynamicFfi.invoke("sctp_bindx", -1, longArrayOf(s.toLong(), addrs?.value ?: 0L, num.toLong(), tpe.toLong())).toInt()
}

public fun sctpConnectx(s: CInt, addrs: Sockaddr?, addrcnt: CInt, id: CUint?): CInt {
    val __slot_3 = if (id == null) 0L else LibcDynamicFfi.allocScalarSlot(id.toLong())
    try {
        return LibcDynamicFfi.invoke("sctp_connectx", -1, longArrayOf(s.toLong(), addrs?.value ?: 0L, addrcnt.toLong(), __slot_3)).toInt()
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sctpGetaddrlen(family: SaFamilyT): CInt {
    return LibcDynamicFfi.invoke("sctp_getaddrlen", -1, longArrayOf(family.toLong())).toInt()
}

public fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("sctp_getpaddrs", -1, longArrayOf(s.toLong(), asocid.toLong(), addrs?.value ?: 0L)).toInt()
}

public fun sctpFreepaddrs(addrs: Sockaddr?) {
    LibcDynamicFfi.invoke("sctp_freepaddrs", -1, longArrayOf(addrs?.value ?: 0L))
}

public fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("sctp_getladdrs", -1, longArrayOf(s.toLong(), asocid.toLong(), addrs?.value ?: 0L)).toInt()
}

public fun sctpFreeladdrs(addrs: Sockaddr?) {
    LibcDynamicFfi.invoke("sctp_freeladdrs", -1, longArrayOf(addrs?.value ?: 0L))
}

public fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: SocklenT?): CInt {
    val __slot_4 = if (size == null) 0L else LibcDynamicFfi.allocScalarSlot(size.toLong())
    try {
        return LibcDynamicFfi.invoke("sctp_opt_info", -1, longArrayOf(s.toLong(), id.toLong(), opt.toLong(), arg?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun sctpSendv(sd: CInt, iov: Iovec?, iovcnt: CInt, addrs: Sockaddr?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT {
    return LibcDynamicFfi.invoke("sctp_sendv", -1, longArrayOf(sd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), addrs?.value ?: 0L, addrcnt.toLong(), info?.value ?: 0L, infolen.toLong(), infotype.toLong(), flags.toLong()))
}

public fun sctpRecvv(sd: CInt, iov: Iovec?, iovcnt: CInt, from: Sockaddr?, fromlen: SocklenT?, info: COpaquePointer?, infolen: SocklenT?, infotype: CUint?, flags: CInt?): SsizeT {
    val __slot_4 = if (fromlen == null) 0L else LibcDynamicFfi.allocScalarSlot(fromlen.toLong())
    val __slot_6 = if (infolen == null) 0L else LibcDynamicFfi.allocScalarSlot(infolen.toLong())
    val __slot_7 = if (infotype == null) 0L else LibcDynamicFfi.allocScalarSlot(infotype.toLong())
    val __slot_8 = if (flags == null) 0L else LibcDynamicFfi.allocScalarSlot(flags.toLong())
    try {
        return LibcDynamicFfi.invoke("sctp_recvv", -1, longArrayOf(sd.toLong(), iov?.value ?: 0L, iovcnt.toLong(), from?.value ?: 0L, __slot_4, info?.value ?: 0L, __slot_6, __slot_7, __slot_8))
    } finally {
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
        if (__slot_6 != 0L) LibcDynamicFfi.freeMem(__slot_6)
        if (__slot_7 != 0L) LibcDynamicFfi.freeMem(__slot_7)
        if (__slot_8 != 0L) LibcDynamicFfi.freeMem(__slot_8)
    }
}

public fun timerfdCreate(clockid: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("timerfd_create", -1, longArrayOf(clockid.toLong(), flags.toLong())).toInt()
}

public fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timerfd_gettime", -1, longArrayOf(fd.toLong(), currValue?.value ?: 0L)).toInt()
}

public fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timerfd_settime", -1, longArrayOf(fd.toLong(), flags.toLong(), newValue?.value ?: 0L, oldValue?.value ?: 0L)).toInt()
}

public fun closefrom(lowfd: CInt) {
    LibcDynamicFfi.invoke("closefrom", -1, longArrayOf(lowfd.toLong()))
}

public fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("close_range", -1, longArrayOf(lowfd.toLong(), highfd.toLong(), flags.toLong())).toInt()
}

public fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt {
    val __cstr_0 = if (file == null) 0L else LibcDynamicFfi.allocUtf8CString(file)
    try {
        return LibcDynamicFfi.invoke("execvpe", -1, longArrayOf(__cstr_0, argv?.value ?: 0L, envp?.value ?: 0L)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt {
    return LibcDynamicFfi.invoke("kcmp", -1, longArrayOf(pid1.toLong(), pid2.toLong(), type.toLong(), idx1.toLong(), idx2.toLong())).toInt()
}

public fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? {
    val __cstr_1 = if (symbol == null) 0L else LibcDynamicFfi.allocUtf8CString(symbol)
    val __cstr_2 = if (version == null) 0L else LibcDynamicFfi.allocUtf8CString(version)
    try {
        val rawRet = LibcDynamicFfi.invoke("dlvsym", -1, longArrayOf(handle?.value ?: 0L, __cstr_1, __cstr_2))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun memstatStrerror(error: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memstat_strerror", -1, longArrayOf(error.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memstatMtlAlloc(): MemoryTypeList? {
    val rawRet = LibcDynamicFfi.invoke("memstat_mtl_alloc", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memstatMtlFirst(list: MemoryTypeList?): MemoryType? {
    val rawRet = LibcDynamicFfi.invoke("memstat_mtl_first", -1, longArrayOf(list?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memstatMtlNext(mtp: MemoryType?): MemoryType? {
    val rawRet = LibcDynamicFfi.invoke("memstat_mtl_next", -1, longArrayOf(mtp?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun memstatMtlFind(list: MemoryTypeList?, allocator: CInt, name: String?): MemoryType? {
    val __cstr_2 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        val rawRet = LibcDynamicFfi.invoke("memstat_mtl_find", -1, longArrayOf(list?.value ?: 0L, allocator.toLong(), __cstr_2))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun memstatMtlFree(list: MemoryTypeList?) {
    LibcDynamicFfi.invoke("memstat_mtl_free", -1, longArrayOf(list?.value ?: 0L))
}

public fun memstatMtlGeterror(list: MemoryTypeList?): CInt {
    return LibcDynamicFfi.invoke("memstat_mtl_geterror", -1, longArrayOf(list?.value ?: 0L)).toInt()
}

public fun memstatGetName(mtp: MemoryType?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("memstat_get_name", -1, longArrayOf(mtp?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun kvmDpcpuSetcpu(kd: KvmT?, cpu: CUint): CInt {
    return LibcDynamicFfi.invoke("kvm_dpcpu_setcpu", -1, longArrayOf(kd?.value ?: 0L, cpu.toLong())).toInt()
}

public fun kvmGetargv(kd: KvmT?, p: KinfoProc?, nchr: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("kvm_getargv", -1, longArrayOf(kd?.value ?: 0L, p?.value ?: 0L, nchr.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun kvmGetcptime(kd: KvmT?, cpTime: CLong?): CInt {
    val __slot_1 = if (cpTime == null) 0L else LibcDynamicFfi.allocScalarSlot(cpTime)
    try {
        return LibcDynamicFfi.invoke("kvm_getcptime", -1, longArrayOf(kd?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun kvmGetenvv(kd: KvmT?, p: KinfoProc?, nchr: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("kvm_getenvv", -1, longArrayOf(kd?.value ?: 0L, p?.value ?: 0L, nchr.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun kvmGeterr(kd: KvmT?): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("kvm_geterr", -1, longArrayOf(kd?.value ?: 0L))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun kvmGetmaxcpu(kd: KvmT?): CInt {
    return LibcDynamicFfi.invoke("kvm_getmaxcpu", -1, longArrayOf(kd?.value ?: 0L)).toInt()
}

public fun kvmGetncpus(kd: KvmT?): CInt {
    return LibcDynamicFfi.invoke("kvm_getncpus", -1, longArrayOf(kd?.value ?: 0L)).toInt()
}

public fun kvmGetpcpu(kd: KvmT?, cpu: CInt): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("kvm_getpcpu", -1, longArrayOf(kd?.value ?: 0L, cpu.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun kvmCounterU64Fetch(kd: KvmT?, base: CUlong): ULong {
    return LibcDynamicFfi.invoke("kvm_counter_u64_fetch", -1, longArrayOf(kd?.value ?: 0L, base.toLong())).toULong()
}

public fun kvmGetswapinfo(kd: KvmT?, info: KvmSwap?, maxswap: CInt, flags: CInt): CInt {
    return LibcDynamicFfi.invoke("kvm_getswapinfo", -1, longArrayOf(kd?.value ?: 0L, info?.value ?: 0L, maxswap.toLong(), flags.toLong())).toInt()
}

public fun kvmNative(kd: KvmT?): CInt {
    return LibcDynamicFfi.invoke("kvm_native", -1, longArrayOf(kd?.value ?: 0L)).toInt()
}

public fun kvmNlist(kd: KvmT?, nl: Nlist?): CInt {
    return LibcDynamicFfi.invoke("kvm_nlist", -1, longArrayOf(kd?.value ?: 0L, nl?.value ?: 0L)).toInt()
}

public fun kvmNlist2(kd: KvmT?, nl: KvmNlist?): CInt {
    return LibcDynamicFfi.invoke("kvm_nlist2", -1, longArrayOf(kd?.value ?: 0L, nl?.value ?: 0L)).toInt()
}

public fun kvmReadZpcpu(kd: KvmT?, base: CUlong, buf: COpaquePointer?, size: SizeT, cpu: CInt): SsizeT {
    return LibcDynamicFfi.invoke("kvm_read_zpcpu", -1, longArrayOf(kd?.value ?: 0L, base.toLong(), buf?.value ?: 0L, size.toLong(), cpu.toLong()))
}

public fun kvmRead2(kd: KvmT?, addr: KvaddrT, buf: COpaquePointer?, nbytes: SizeT): SsizeT {
    return LibcDynamicFfi.invoke("kvm_read2", -1, longArrayOf(kd?.value ?: 0L, addr.toLong(), buf?.value ?: 0L, nbytes.toLong()))
}

public fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("extattr_namespace_to_string", -1, longArrayOf(attrnamespace.toLong(), string?.value ?: 0L)).toInt()
}

public fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt {
    val __cstr_0 = if (string == null) 0L else LibcDynamicFfi.allocUtf8CString(string)
    val __slot_1 = if (attrnamespace == null) 0L else LibcDynamicFfi.allocScalarSlot(attrnamespace.toLong())
    try {
        return LibcDynamicFfi.invoke("extattr_string_to_namespace", -1, longArrayOf(__cstr_0, __slot_1)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun realhostname(host: COpaquePointer?, hsize: SizeT, ip: InAddr?): CInt {
    return LibcDynamicFfi.invoke("realhostname", -1, longArrayOf(host?.value ?: 0L, hsize.toLong(), ip?.value ?: 0L)).toInt()
}

public fun realhostnameSa(host: COpaquePointer?, hsize: SizeT, addr: Sockaddr?, addrlen: CInt): CInt {
    return LibcDynamicFfi.invoke("realhostname_sa", -1, longArrayOf(host?.value ?: 0L, hsize.toLong(), addr?.value ?: 0L, addrlen.toLong())).toInt()
}

public fun kldIsloaded(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("kld_isloaded", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun kldLoad(name: String?): CInt {
    val __cstr_0 = if (name == null) 0L else LibcDynamicFfi.allocUtf8CString(name)
    try {
        return LibcDynamicFfi.invoke("kld_load", -1, longArrayOf(__cstr_0)).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun kinfoGetvmmap(pid: PidT, cntp: CInt?): KinfoVmentry? {
    val __slot_1 = if (cntp == null) 0L else LibcDynamicFfi.allocScalarSlot(cntp.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("kinfo_getvmmap", -1, longArrayOf(pid.toLong(), __slot_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
    val __cstr_2 = if (hdr == null) 0L else LibcDynamicFfi.allocUtf8CString(hdr)
    try {
        LibcDynamicFfi.invoke("hexdump", -1, longArrayOf(ptr?.value ?: 0L, length.toLong(), __cstr_2, flags.toLong()))
    } finally {
        if (__cstr_2 != 0L) LibcDynamicFfi.freeMem(__cstr_2)
    }
}

public fun humanizeNumber(buf: COpaquePointer?, len: SizeT, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt {
    val __cstr_3 = if (suffix == null) 0L else LibcDynamicFfi.allocUtf8CString(suffix)
    try {
        return LibcDynamicFfi.invoke("humanize_number", -1, longArrayOf(buf?.value ?: 0L, len.toLong(), number, __cstr_3, scale.toLong(), flags.toLong())).toInt()
    } finally {
        if (__cstr_3 != 0L) LibcDynamicFfi.freeMem(__cstr_3)
    }
}

public fun flopen(path: String?, flags: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("flopen", 2, longArrayOf(__cstr_0, flags.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun flopenat(fd: CInt, path: String?, flags: CInt, vararg variadicArgs: Long): CInt {
    val __cstr_1 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    try {
        return LibcDynamicFfi.invoke("flopenat", 3, longArrayOf(fd.toLong(), __cstr_1, flags.toLong()) + variadicArgs).toInt()
    } finally {
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun getlocalbase(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("getlocalbase", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun pidfileOpen(path: String?, mode: ModeT, pidptr: PidT?): Pidfh? {
    val __cstr_0 = if (path == null) 0L else LibcDynamicFfi.allocUtf8CString(path)
    val __slot_2 = if (pidptr == null) 0L else LibcDynamicFfi.allocScalarSlot(pidptr.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("pidfile_open", -1, longArrayOf(__cstr_0, mode.toLong(), __slot_2))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun pidfileWrite(path: Pidfh?): CInt {
    return LibcDynamicFfi.invoke("pidfile_write", -1, longArrayOf(path?.value ?: 0L)).toInt()
}

public fun pidfileClose(path: Pidfh?): CInt {
    return LibcDynamicFfi.invoke("pidfile_close", -1, longArrayOf(path?.value ?: 0L)).toInt()
}

public fun pidfileRemove(path: Pidfh?): CInt {
    return LibcDynamicFfi.invoke("pidfile_remove", -1, longArrayOf(path?.value ?: 0L)).toInt()
}

public fun pidfileFileno(path: Pidfh?): CInt {
    return LibcDynamicFfi.invoke("pidfile_fileno", -1, longArrayOf(path?.value ?: 0L)).toInt()
}

public fun procstatOpenSysctl(): Procstat? {
    val rawRet = LibcDynamicFfi.invoke("procstat_open_sysctl", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: CInt): FilestatList? {
    val rawRet = LibcDynamicFfi.invoke("procstat_getfiles", -1, longArrayOf(procstat?.value ?: 0L, kp?.value ?: 0L, mmapped.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun procstatFreefiles(procstat: Procstat?, head: FilestatList?) {
    LibcDynamicFfi.invoke("procstat_freefiles", -1, longArrayOf(procstat?.value ?: 0L, head?.value ?: 0L))
}

public fun procstatGetprocs(procstat: Procstat?, what: CInt, arg: CInt, count: CUint?): KinfoProc? {
    val __slot_3 = if (count == null) 0L else LibcDynamicFfi.allocScalarSlot(count.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("procstat_getprocs", -1, longArrayOf(procstat?.value ?: 0L, what.toLong(), arg.toLong(), __slot_3))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?) {
    LibcDynamicFfi.invoke("procstat_freeprocs", -1, longArrayOf(procstat?.value ?: 0L, p?.value ?: 0L))
}

public fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: CUint?): KinfoVmentry? {
    val __slot_2 = if (count == null) 0L else LibcDynamicFfi.allocScalarSlot(count.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("procstat_getvmmap", -1, longArrayOf(procstat?.value ?: 0L, kp?.value ?: 0L, __slot_2))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?) {
    LibcDynamicFfi.invoke("procstat_freevmmap", -1, longArrayOf(procstat?.value ?: 0L, vmmap?.value ?: 0L))
}

public fun procstatClose(procstat: Procstat?) {
    LibcDynamicFfi.invoke("procstat_close", -1, longArrayOf(procstat?.value ?: 0L))
}

public fun procstatFreeargv(procstat: Procstat?) {
    LibcDynamicFfi.invoke("procstat_freeargv", -1, longArrayOf(procstat?.value ?: 0L))
}

public fun procstatFreeenvv(procstat: Procstat?) {
    LibcDynamicFfi.invoke("procstat_freeenvv", -1, longArrayOf(procstat?.value ?: 0L))
}

public fun procstatFreegroups(procstat: Procstat?, groups: GidT?) {
    val __slot_1 = if (groups == null) 0L else LibcDynamicFfi.allocScalarSlot(groups.toLong())
    try {
        LibcDynamicFfi.invoke("procstat_freegroups", -1, longArrayOf(procstat?.value ?: 0L, __slot_1))
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?) {
    LibcDynamicFfi.invoke("procstat_freeptlwpinfo", -1, longArrayOf(procstat?.value ?: 0L, pl?.value ?: 0L))
}

public fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("procstat_getargv", -1, longArrayOf(procstat?.value ?: 0L, kp?.value ?: 0L, nchr.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: SizeT): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("procstat_getenvv", -1, longArrayOf(procstat?.value ?: 0L, kp?.value ?: 0L, nchr.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: CUint?): GidT? {
    val __slot_2 = if (count == null) 0L else LibcDynamicFfi.allocScalarSlot(count.toLong())
    try {
        val rawRet = LibcDynamicFfi.invoke("procstat_getgroups", -1, longArrayOf(procstat?.value ?: 0L, kp?.value ?: 0L, __slot_2))
        return if (rawRet == 0L) null else LibcDynamicFfi.readScalarSlot(rawRet, 2).toUShort()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: CInt?): CInt {
    val __slot_2 = if (osrelp == null) 0L else LibcDynamicFfi.allocScalarSlot(osrelp.toLong())
    try {
        return LibcDynamicFfi.invoke("procstat_getosrel", -1, longArrayOf(procstat?.value ?: 0L, kp?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: COpaquePointer?, maxlen: SizeT): CInt {
    return LibcDynamicFfi.invoke("procstat_getpathname", -1, longArrayOf(procstat?.value ?: 0L, kp?.value ?: 0L, pathname?.value ?: 0L, maxlen.toLong())).toInt()
}

public fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: CInt, rlimit: Rlimit?): CInt {
    return LibcDynamicFfi.invoke("procstat_getrlimit", -1, longArrayOf(procstat?.value ?: 0L, kp?.value ?: 0L, which.toLong(), rlimit?.value ?: 0L)).toInt()
}

public fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: CUshort?): CInt {
    val __slot_2 = if (maskp == null) 0L else LibcDynamicFfi.allocScalarSlot(maskp.toLong())
    try {
        return LibcDynamicFfi.invoke("procstat_getumask", -1, longArrayOf(procstat?.value ?: 0L, kp?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun procstatOpenCore(filename: String?): Procstat? {
    val __cstr_0 = if (filename == null) 0L else LibcDynamicFfi.allocUtf8CString(filename)
    try {
        val rawRet = LibcDynamicFfi.invoke("procstat_open_core", -1, longArrayOf(__cstr_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
    }
}

public fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat? {
    val __cstr_0 = if (nlistf == null) 0L else LibcDynamicFfi.allocUtf8CString(nlistf)
    val __cstr_1 = if (memf == null) 0L else LibcDynamicFfi.allocUtf8CString(memf)
    try {
        val rawRet = LibcDynamicFfi.invoke("procstat_open_kvm", -1, longArrayOf(__cstr_0, __cstr_1))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__cstr_0 != 0L) LibcDynamicFfi.freeMem(__cstr_0)
        if (__cstr_1 != 0L) LibcDynamicFfi.freeMem(__cstr_1)
    }
}

public fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("procstat_get_socket_info", -1, longArrayOf(proc?.value ?: 0L, fst?.value ?: 0L, sock?.value ?: 0L, errbuf?.value ?: 0L)).toInt()
}

public fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Vnstat?, errbuf: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("procstat_get_vnode_info", -1, longArrayOf(proc?.value ?: 0L, fst?.value ?: 0L, vn?.value ?: 0L, errbuf?.value ?: 0L)).toInt()
}

public fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("procstat_get_pts_info", -1, longArrayOf(proc?.value ?: 0L, fst?.value ?: 0L, pts?.value ?: 0L, errbuf?.value ?: 0L)).toInt()
}

public fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("procstat_get_shm_info", -1, longArrayOf(proc?.value ?: 0L, fst?.value ?: 0L, shm?.value ?: 0L, errbuf?.value ?: 0L)).toInt()
}

public fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: COpaquePointer?): CInt {
    return LibcDynamicFfi.invoke("timer_create", -1, longArrayOf(clockId.toLong(), evp?.value ?: 0L, timerid?.value ?: 0L)).toInt()
}

public fun timerDelete(timerid: TimerT): CInt {
    return LibcDynamicFfi.invoke("timer_delete", -1, longArrayOf(timerid?.value ?: 0L)).toInt()
}

public fun timerGetoverrun(timerid: TimerT): CInt {
    return LibcDynamicFfi.invoke("timer_getoverrun", -1, longArrayOf(timerid?.value ?: 0L)).toInt()
}

public fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timer_gettime", -1, longArrayOf(timerid?.value ?: 0L, value?.value ?: 0L)).toInt()
}

public fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt {
    return LibcDynamicFfi.invoke("timer_settime", -1, longArrayOf(timerid?.value ?: 0L, flags.toLong(), value?.value ?: 0L, ovalue?.value ?: 0L)).toInt()
}

public fun devstatGetnumdevs(kd: KvmT?): CInt {
    return LibcDynamicFfi.invoke("devstat_getnumdevs", -1, longArrayOf(kd?.value ?: 0L)).toInt()
}

public fun devstatGetgeneration(kd: KvmT?): CLong {
    return LibcDynamicFfi.invoke("devstat_getgeneration", -1, longArrayOf(kd?.value ?: 0L))
}

public fun devstatGetversion(kd: KvmT?): CInt {
    return LibcDynamicFfi.invoke("devstat_getversion", -1, longArrayOf(kd?.value ?: 0L)).toInt()
}

public fun devstatCheckversion(kd: KvmT?): CInt {
    return LibcDynamicFfi.invoke("devstat_checkversion", -1, longArrayOf(kd?.value ?: 0L)).toInt()
}

public fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: CInt?, numSelections: CInt?, selectGeneration: CLong?, currentGeneration: CLong, devices: Devstat?, numdevs: CInt, matches: DevstatMatch?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt {
    val __slot_1 = if (numSelected == null) 0L else LibcDynamicFfi.allocScalarSlot(numSelected.toLong())
    val __slot_2 = if (numSelections == null) 0L else LibcDynamicFfi.allocScalarSlot(numSelections.toLong())
    val __slot_3 = if (selectGeneration == null) 0L else LibcDynamicFfi.allocScalarSlot(selectGeneration)
    val __scratch_11 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("devstat_selectdevs", -1, longArrayOf(devSelect?.value ?: 0L, __slot_1, __slot_2, __slot_3, currentGeneration, devices?.value ?: 0L, numdevs.toLong(), matches?.value ?: 0L, numMatches.toLong(), devSelections?.value ?: 0L, numDevSelections.toLong(), __scratch_11, maxshowdevs.toLong(), perfSelect.toLong())).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
        if (__scratch_11 != 0L) LibcDynamicFfi.freeMem(__scratch_11)
    }
}

public fun devstatBuildmatch(matchStr: COpaquePointer?, matches: COpaquePointer?, numMatches: CInt?): CInt {
    val __slot_2 = if (numMatches == null) 0L else LibcDynamicFfi.allocScalarSlot(numMatches.toLong())
    try {
        return LibcDynamicFfi.invoke("devstat_buildmatch", -1, longArrayOf(matchStr?.value ?: 0L, matches?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}
