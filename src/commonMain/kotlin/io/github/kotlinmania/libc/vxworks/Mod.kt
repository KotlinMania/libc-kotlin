// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias UintptrT = ULong
public typealias IntptrT = Long
public typealias PtrdiffT = Long
public typealias SizeT = UintptrT
public typealias SsizeT = IntptrT
public typealias SpeedT = CUInt
public typealias TcflagT = CUInt
public typealias ClockT = CLong
public typealias CcT = CUChar
public typealias PidT = CInt
public typealias InAddrT = UInt
public typealias SighandlerT = ULong
public typealias CpusetT = UInt
public typealias BlkcntT = CLong
public typealias BlksizeT = CLong
public typealias InoT = CULong
public typealias RlimT = CULong
public typealias SusecondsT = CLong
public typealias TimeT = CLongLong
public typealias ErrnoT = CInt
public typealias UsecondsT = CULong
public typealias SocklenT = CUInt
public typealias PthreadT = CULong
public typealias ClockidT = CInt
public typealias DevT = CULong
public typealias ModeT = CInt
public typealias NlinkT = CULong
public typealias UidT = CUShort
public typealias GidT = CUShort
public typealias SigsetT = CULongLong
public typealias KeyT = CLong
public typealias NfdsT = CUInt
public typealias Stat64 = Stat
public typealias PthreadKeyT = CULong
public typealias OffT = CLongLong
public typealias Off64T = OffT
public typealias BOOL = CInt
public typealias VxOBJHANDLE = CInt
public typealias VxTASKID = VxOBJHANDLE
public typealias VxMSGQID = VxOBJHANDLE
public typealias VxSEMIDKERNEL = VxOBJHANDLE
public typealias VxRTPID = VxOBJHANDLE
public typealias VxSDID = VxOBJHANDLE
public typealias VxCONDVARID = VxOBJHANDLE
public typealias VxSEMID = VxSemaphore?
public typealias OBJHANDLE = VxOBJHANDLE
public typealias TASKID = OBJHANDLE
public typealias MSGQID = OBJHANDLE
public typealias SEMIDKERNEL = OBJHANDLE
public typealias RTPID = OBJHANDLE
public typealias SDID = OBJHANDLE
public typealias CONDVARID = OBJHANDLE
public typealias STATUS = OBJHANDLE
public typealias VxUsrArgT = Long
public typealias VxExitCodeT = Long
public typealias VxTicksT = CUInt
public typealias VxTicks64T = CULongLong
public typealias SaFamilyT = CUChar
public typealias MqdT = CInt

public data class PthreadCondattrT(
    val condAttrStatus: CInt,
    val condAttrPshared: CInt,
    val condAttrClockId: ClockidT,
)

public data class PthreadCondT(
    val condSemId: VxSEMID,
    val condValid: CInt,
    val condInitted: CInt,
    val condRefCount: CInt,
    val condMutex: PthreadMutexT?,
    val condAttr: PthreadCondattrT,
    val condSemName: ByteArray,
)

public data class PthreadRwlockattrT(
    val rwlockAttrStatus: CInt,
    val rwlockAttrPshared: CInt,
    val rwlockAttrMaxReaders: CUInt,
    val rwlockAttrConformOpt: CUInt,
)

public data class PthreadRwlockT(
    val rwlockSemId: VxSEMID,
    val rwlockReadersRefCount: CUInt,
    val rwlockValid: CInt,
    val rwlockInitted: CInt,
    val rwlockAttr: PthreadRwlockattrT,
    val rwlockSemName: ByteArray,
)

public data class Timeval(
    val tvSec: TimeT,
    val tvUsec: SusecondsT,
)

public data class Linger(
    val lOnoff: CInt,
    val lLinger: CInt,
)

public data class Sockaddr(
    val saLen: CUChar,
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class Iovec(
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: SocklenT,
    val msgIov: Iovec?,
    val msgIovlen: CInt,
    val msgControl: COpaquePointer?,
    val msgControllen: SocklenT,
    val msgFlags: CInt,
)

public data class Cmsghdr(
    val cmsgLen: SocklenT,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class Pollfd(
    val fd: CInt,
    val events: CShort,
    val revents: CShort,
)

public data class Rlimit(
    val rlimCur: RlimT,
    val rlimMax: RlimT,
)

public data class Stat(
    val stDev: DevT,
    val stIno: InoT,
    val stMode: ModeT,
    val stNlink: NlinkT,
    val stUid: UidT,
    val stGid: GidT,
    val stRdev: DevT,
    val stSize: OffT,
    val stAtim: Timespec,
    val stAtime: TimeT,
    val stMtim: Timespec,
    val stMtime: TimeT,
    val stCtim: Timespec,
    val stCtime: TimeT,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stAttrib: CUChar,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
)

public data class SchedParam(
    val schedPriority: CInt,
    val schedSsLowPriority: CInt,
    val schedSsReplPeriod: Timespec,
    val schedSsInitBudget: Timespec,
    val schedSsMaxRepl: CInt,
)

public data class SchedParam(
    val schedPriority: CInt,
    val schedSsLowPriority: CInt,
    val schedSsReplPeriod: Timespec,
    val schedSsInitBudget: Timespec,
    val schedSsMaxRepl: CInt,
)

public data class PthreadAttrT(
    val threadAttrStatus: CInt,
    val threadAttrStacksize: ULong,
    val threadAttrStackaddr: COpaquePointer?,
    val threadAttrGuardsize: ULong,
    val threadAttrDetachstate: CInt,
    val threadAttrContentionscope: CInt,
    val threadAttrInheritsched: CInt,
    val threadAttrSchedpolicy: CInt,
    val threadAttrName: String?,
    val threadAttrOptions: CInt,
    val threadAttrSchedparam: SchedParam,
)

public data class Sigaction(
    val saU: SaUT,
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssSize: ULong,
    val ssFlags: CInt,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siValue: Sigval,
    val siErrno: CInt,
    val siStatus: CInt,
    val siAddr: COpaquePointer?,
    val siUid: UidT,
    val siPid: PidT,
)

public data class PthreadMutexattrT(
    val mutexAttrStatus: CInt,
    val mutexAttrPshared: CInt,
    val mutexAttrProtocol: CInt,
    val mutexAttrPrioceiling: CInt,
    val mutexAttrType: CInt,
)

public data class PthreadMutexT(
    val mutexSemId: VxSEMID,
    val mutexValid: CInt,
    val mutexInitted: CInt,
    val mutexCondRefCount: CInt,
    val mutexSavPriority: CInt,
    val mutexAttr: PthreadMutexattrT,
    val mutexSemName: ByteArray,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
)

public data class Tm(
    val tmSec: CInt,
    val tmMin: CInt,
    val tmHour: CInt,
    val tmMday: CInt,
    val tmMon: CInt,
    val tmYear: CInt,
    val tmWday: CInt,
    val tmYday: CInt,
    val tmIsdst: CInt,
)

public data class Tms(
    val tmsUtime: ClockT,
    val tmsStime: ClockT,
    val tmsCutime: ClockT,
    val tmsCstime: ClockT,
)

public data class Utimbuf(
    val actime: TimeT,
    val modtime: TimeT,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class In6Addr(
    val s6Addr: UByteArray,
)

public data class Ipv6Mreq(
    val ipv6mrMultiaddr: In6Addr,
    val ipv6mrInterface: CUInt,
)

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: ULong,
    val aiCanonname: String?,
    val aiAddr: Sockaddr?,
    val aiNext: Addrinfo?,
)

public data class Servent(
    val sName: String?,
    val sAliases: COpaquePointer?,
    val sPort: CInt,
    val sProto: String?,
)

public data class Protoent(
    val pName: String?,
    val pAliases: COpaquePointer?,
    val pProto: CInt,
)

public data class Hostent(
    val hName: String?,
    val hAliases: COpaquePointer?,
    val hAddrtype: CInt,
    val hLength: CInt,
    val hAddrList: COpaquePointer?,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: UByte,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class SockaddrIn6(
    val sin6Len: UByte,
    val sin6Family: UByte,
    val sin6Port: UShort,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class MqAttr(
    val mqMaxmsg: CLong,
    val mqMsgsize: CLong,
    val mqFlags: CLong,
    val mqCurmsgs: CLong,
)

public data class Winsize(
    val wsRow: CUShort,
    val wsCol: CUShort,
    val wsXpixel: CUShort,
    val wsYpixel: CUShort,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cCc: List<CcT>,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class Rusage(
    val ruUtime: Timeval,
    val ruStime: Timeval,
    val ruMaxrss: CLong,
    val ruIxrss: CLong,
    val ruIdrss: CLong,
    val ruIsrss: CLong,
    val ruMinflt: CLong,
    val ruMajflt: CLong,
    val ruNswap: CLong,
    val ruInblock: CLong,
    val ruOublock: CLong,
    val ruMsgsnd: CLong,
    val ruMsgrcv: CLong,
    val ruNsignals: CLong,
    val ruNvcsw: CLong,
    val ruNivcsw: CLong,
)

public data class Lconv(
    val currencySymbol: String?,
    val intCurrSymbol: String?,
    val monDecimalPoint: String?,
    val monGrouping: String?,
    val monThousandsSep: String?,
    val negativeSign: String?,
    val positiveSign: String?,
    val fracDigits: CChar,
    val nCsPrecedes: CChar,
    val nSepBySpace: CChar,
    val nSignPosn: CChar,
    val pCsPrecedes: CChar,
    val pSepBySpace: CChar,
    val pSignPosn: CChar,
    val intFracDigits: CChar,
    val intNCsPrecedes: CChar,
    val intNSepBySpace: CChar,
    val intNSignPosn: CChar,
    val intPCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intPSignPosn: CChar,
    val decimalPoint: String?,
    val grouping: String?,
    val thousandsSep: String?,
    val fracGrouping: String?,
    val fracSep: String?,
    val `false`: String?,
    val `true`: String?,
    val no: String?,
    val yes: String?,
)

public data class Group(
    val grName: String?,
    val grPasswd: String?,
    val grGid: CInt,
    val grMem: COpaquePointer?,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
    val endian: ByteArray,
    val kernelversion: ByteArray,
    val releaseversion: ByteArray,
    val processor: ByteArray,
    val bsprevision: ByteArray,
    val builddate: ByteArray,
)

public data class Dirent(
    val dIno: InoT,
    val dName: ByteArray,
    val dType: CUChar,
)

public data class SockaddrUn(
    val sunLen: UByte,
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class RTPDESC(
    val status: CInt,
    val options: UInt,
    val entrAddr: COpaquePointer?,
    val initTaskId: TASKID,
    val parentId: RTPID,
    val pathName: ByteArray,
    val taskCnt: CInt,
    val textStart: COpaquePointer?,
    val textEnd: COpaquePointer?,
)

public data class SockaddrStorage(
    val ssLen: CUChar,
    val ssFamily: SaFamilyT,
    val ssAlign: Int,
)

// C union; only one variant is valid at a time.
public data class SaUT(
    val saHandler: ((CInt) -> Nothing)? = null,
    val saSigaction: ((CInt, SiginfoT?, COpaquePointer?) -> Nothing)? = null,
)

// C union; only one variant is valid at a time.
public data class Sigval(
    val sivalInt: CInt? = null,
    val sivalPtr: COpaquePointer? = null,
)

public const val EXIT_SUCCESS: CInt = 0
public const val EXIT_FAILURE: CInt = 1
public const val EAI_SERVICE: CInt = 9
public const val EAI_SOCKTYPE: CInt = 10
public const val EAI_SYSTEM: CInt = 11
public const val INT_MAX: CInt = 0x7fffffff
public const val INT_MIN: CInt = -INT_MAX - 1
public const val CLOCK_REALTIME: CInt = 0x0
public const val CLOCK_MONOTONIC: CInt = 0x1
public const val CLOCK_PROCESS_CPUTIME_ID: CInt = 0x2
public const val CLOCK_THREAD_CPUTIME_ID: CInt = 0x3
public const val TIMER_ABSTIME: CInt = 0x1
public const val TIMER_RELTIME: CInt = 0x0
public const val PTHREAD_INITIALIZED_OBJ: CInt = 0xF70990EF
public const val PTHREAD_DESTROYED_OBJ: CInt = -1
public const val PTHREAD_VALID_OBJ: CInt = 0xEC542A37
public const val PTHREAD_INVALID_OBJ: CInt = -1
public const val PTHREAD_UNUSED_YET_OBJ: CInt = -1
public const val PTHREAD_PRIO_NONE: CInt = 0
public const val PTHREAD_PRIO_INHERIT: CInt = 1
public const val PTHREAD_PRIO_PROTECT: CInt = 2
public const val PTHREAD_MUTEX_NORMAL: CInt = 0
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 1
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 2
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
public const val PTHREAD_STACK_MIN: ULong = 4096uL
public const val _PTHREAD_SHARED_SEM_NAME_MAX: ULong = 30uL
public const val SCHED_FIFO: CInt = 0x01
public const val SCHED_RR: CInt = 0x02
public const val SCHED_OTHER: CInt = 0x04
public const val SCHED_SPORADIC: CInt = 0x08
public const val PRIO_PROCESS: CUInt = 0u
public const val SCHED_FIFO_HIGH_PRI: CInt = 255
public const val SCHED_FIFO_LOW_PRI: CInt = 0
public const val SCHED_RR_HIGH_PRI: CInt = 255
public const val SCHED_RR_LOW_PRI: CInt = 0
public const val SCHED_SPORADIC_HIGH_PRI: CInt = 255
public const val SCHED_SPORADIC_LOW_PRI: CInt = 0
public const val ERROR: CInt = -1
public const val OK: CInt = 0
public const val EPERM: CInt = 1
public const val ENOENT: CInt = 2
public const val ESRCH: CInt = 3
public const val EINTR: CInt = 4
public const val EIO: CInt = 5
public const val ENXIO: CInt = 6
public const val E2BIG: CInt = 7
public const val ENOEXEC: CInt = 8
public const val EBADF: CInt = 9
public const val ECHILD: CInt = 10
public const val EAGAIN: CInt = 11
public const val ENOMEM: CInt = 12
public const val EACCES: CInt = 13
public const val EFAULT: CInt = 14
public const val ENOTEMPTY: CInt = 15
public const val EBUSY: CInt = 16
public const val EEXIST: CInt = 17
public const val EXDEV: CInt = 18
public const val ENODEV: CInt = 19
public const val ENOTDIR: CInt = 20
public const val EISDIR: CInt = 21
public const val EINVAL: CInt = 22
public const val ENFILE: CInt = 23
public const val EMFILE: CInt = 24
public const val ENOTTY: CInt = 25
public const val ENAMETOOLONG: CInt = 26
public const val EFBIG: CInt = 27
public const val ENOSPC: CInt = 28
public const val ESPIPE: CInt = 29
public const val EROFS: CInt = 30
public const val EMLINK: CInt = 31
public const val EPIPE: CInt = 32
public const val EDEADLK: CInt = 33
public const val ENOLCK: CInt = 34
public const val ENOTSUP: CInt = 35
public const val EMSGSIZE: CInt = 36
public const val EDOM: CInt = 37
public const val ERANGE: CInt = 38
public const val EDOOM: CInt = 39
public const val EDESTADDRREQ: CInt = 40
public const val EPROTOTYPE: CInt = 41
public const val ENOPROTOOPT: CInt = 42
public const val EPROTONOSUPPORT: CInt = 43
public const val ESOCKTNOSUPPORT: CInt = 44
public const val EOPNOTSUPP: CInt = 45
public const val EPFNOSUPPORT: CInt = 46
public const val EAFNOSUPPORT: CInt = 47
public const val EADDRINUSE: CInt = 48
public const val EADDRNOTAVAIL: CInt = 49
public const val ENOTSOCK: CInt = 50
public const val ENETUNREACH: CInt = 51
public const val ENETRESET: CInt = 52
public const val ECONNABORTED: CInt = 53
public const val ECONNRESET: CInt = 54
public const val ENOBUFS: CInt = 55
public const val EISCONN: CInt = 56
public const val ENOTCONN: CInt = 57
public const val ESHUTDOWN: CInt = 58
public const val ETOOMANYREFS: CInt = 59
public const val ETIMEDOUT: CInt = 60
public const val ECONNREFUSED: CInt = 61
public const val ENETDOWN: CInt = 62
public const val ETXTBSY: CInt = 63
public const val ELOOP: CInt = 64
public const val EHOSTUNREACH: CInt = 65
public const val ENOTBLK: CInt = 66
public const val EHOSTDOWN: CInt = 67
public const val EINPROGRESS: CInt = 68
public const val EALREADY: CInt = 69
public const val EWOULDBLOCK: CInt = 70
public const val ENOSYS: CInt = 71
public const val ECANCELED: CInt = 72
public const val ENOSR: CInt = 74
public const val ENOSTR: CInt = 75
public const val EPROTO: CInt = 76
public const val EBADMSG: CInt = 77
public const val ENODATA: CInt = 78
public const val ETIME: CInt = 79
public const val ENOMSG: CInt = 80
public const val EFPOS: CInt = 81
public const val EILSEQ: CInt = 82
public const val EDQUOT: CInt = 83
public const val EIDRM: CInt = 84
public const val EOVERFLOW: CInt = 85
public const val EMULTIHOP: CInt = 86
public const val ENOLINK: CInt = 87
public const val ESTALE: CInt = 88
public const val EOWNERDEAD: CInt = 89
public const val ENOTRECOVERABLE: CInt = 90
public const val S_nfsLib_NFS_OK: CInt = OK
public const val S_nfsLib_NFSERR_PERM: CInt = EPERM
public const val S_nfsLib_NFSERR_NOENT: CInt = ENOENT
public const val S_nfsLib_NFSERR_IO: CInt = EIO
public const val S_nfsLib_NFSERR_NXIO: CInt = ENXIO
public const val S_nfsLib_NFSERR_ACCESS: CInt = EACCES
public const val S_nfsLib_NFSERR_EXIST: CInt = EEXIST
public const val S_nfsLib_NFSERR_ENODEV: CInt = ENODEV
public const val S_nfsLib_NFSERR_NOTDIR: CInt = ENOTDIR
public const val S_nfsLib_NFSERR_ISDIR: CInt = EISDIR
public const val S_nfsLib_NFSERR_INVAL: CInt = EINVAL
public const val S_nfsLib_NFSERR_FBIG: CInt = EFBIG
public const val S_nfsLib_NFSERR_NOSPC: CInt = ENOSPC
public const val S_nfsLib_NFSERR_ROFS: CInt = EROFS
public const val S_nfsLib_NFSERR_NAMETOOLONG: CInt = ENAMETOOLONG
public const val S_nfsLib_NFSERR_NOTEMPTY: CInt = ENOTEMPTY
public const val S_nfsLib_NFSERR_DQUOT: CInt = EDQUOT
public const val S_nfsLib_NFSERR_STALE: CInt = ESTALE
public val S_nfsLib_NFSERR_WFLUSH: CInt = M_nfsStat or NFSERR_WFLUSH.toInt()
public val S_nfsLib_NFSERR_REMOTE: CInt = M_nfsStat or NFSERR_REMOTE.toInt()
public val S_nfsLib_NFSERR_BADHANDLE: CInt = M_nfsStat or NFSERR_BADHANDLE.toInt()
public val S_nfsLib_NFSERR_NOT_SYNC: CInt = M_nfsStat or NFSERR_NOT_SYNC.toInt()
public val S_nfsLib_NFSERR_BAD_COOKIE: CInt = M_nfsStat or NFSERR_BAD_COOKIE.toInt()
public const val S_nfsLib_NFSERR_NOTSUPP: CInt = EOPNOTSUPP
public val S_nfsLib_NFSERR_TOOSMALL: CInt = M_nfsStat or NFSERR_TOOSMALL.toInt()
public const val S_nfsLib_NFSERR_SERVERFAULT: CInt = EIO
public val S_nfsLib_NFSERR_BADTYPE: CInt = M_nfsStat or NFSERR_BADTYPE.toInt()
public val S_nfsLib_NFSERR_JUKEBOX: CInt = M_nfsStat or NFSERR_JUKEBOX.toInt()
public const val S_taskLib_NAME_NOT_FOUND: CInt = taskErrorBase + 0x0065
public const val S_taskLib_TASK_HOOK_TABLE_FULL: CInt = taskErrorBase + 0x0066
public const val S_taskLib_TASK_HOOK_NOT_FOUND: CInt = taskErrorBase + 0x0067
public const val S_taskLib_ILLEGAL_PRIORITY: CInt = taskErrorBase + 0x006D
public const val VX_TASK_NAME_LENGTH: CInt = 31
public const val VX_TASK_RENAME_LENGTH: CInt = 16
public const val TCIFLUSH: CInt = 0
public const val VINTR: ULong = 0uL
public const val VQUIT: ULong = 1uL
public const val VERASE: ULong = 2uL
public const val VKILL: ULong = 3uL
public const val VEOF: ULong = 4uL
public const val VMIN: ULong = 16uL
public const val VTIME: ULong = 17uL
public const val S_semLib_INVALID_STATE: CInt = semErrorBase + 0x0065
public const val S_semLib_INVALID_OPTION: CInt = semErrorBase + 0x0066
public const val S_semLib_INVALID_QUEUE_TYPE: CInt = semErrorBase + 0x0067
public const val S_semLib_INVALID_OPERATION: CInt = semErrorBase + 0x0068
public const val S_objLib_OBJ_ID_ERROR: CInt = objErrorBase + 0x0001
public const val S_objLib_OBJ_UNAVAILABLE: CInt = objErrorBase + 0x0002
public const val S_objLib_OBJ_DELETED: CInt = objErrorBase + 0x0003
public const val S_objLib_OBJ_TIMEOUT: CInt = objErrorBase + 0x0004
public const val S_objLib_OBJ_NO_METHOD: CInt = objErrorBase + 0x0005
public const val IPPROTO_IP: CInt = 0
public const val IPPROTO_ICMP: CInt = 1
public const val IPPROTO_TCP: CInt = 6
public const val IPPROTO_IPV6: CInt = 41
public const val IPPROTO_ICMPV6: CInt = 58
public const val INADDR_ANY: InAddrT = 0
public const val INADDR_LOOPBACK: InAddrT = 2130706433
public const val INADDR_BROADCAST: InAddrT = 4294967295
public const val INADDR_NONE: InAddrT = 4294967295
public val IN6ADDR_LOOPBACK_INIT: In6Addr = In6Addr(s6Addr = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1])
public val IN6ADDR_ANY_INIT: In6Addr = In6Addr(s6Addr = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0])
public const val IPPROTO_UDP: CInt = 17
public const val IP_TTL: CInt = 4
public const val IP_MULTICAST_IF: CInt = 9
public const val IP_MULTICAST_TTL: CInt = 10
public const val IP_MULTICAST_LOOP: CInt = 11
public const val IP_ADD_MEMBERSHIP: CInt = 12
public const val IP_DROP_MEMBERSHIP: CInt = 13
public const val NI_MAXHOST: CInt = 1025
public const val IPV6_V6ONLY: CInt = 1
public const val IPV6_UNICAST_HOPS: CInt = 4
public const val IPV6_MULTICAST_IF: CInt = 9
public const val IPV6_MULTICAST_HOPS: CInt = 10
public const val IPV6_MULTICAST_LOOP: CInt = 11
public const val IPV6_ADD_MEMBERSHIP: CInt = 12
public const val IPV6_DROP_MEMBERSHIP: CInt = 13
public const val S_IFMT: CInt = 61440
public const val S_IFIFO: CInt = 4096
public const val S_IFCHR: CInt = 8192
public const val S_IFDIR: CInt = 16384
public const val S_IFBLK: CInt = 24576
public const val S_IFREG: CInt = 32768
public const val S_IFLNK: CInt = 40960
public const val S_IFSHM: CInt = 45056
public const val S_IFSOCK: CInt = 49152
public const val S_ISUID: CInt = 2048
public const val S_ISGID: CInt = 1024
public const val S_ISTXT: CInt = 512
public const val S_ISVTX: CInt = 512
public const val S_IRUSR: CInt = 256
public const val S_IWUSR: CInt = 128
public const val S_IXUSR: CInt = 64
public const val S_IRWXU: CInt = 448
public const val S_IRGRP: CInt = 32
public const val S_IWGRP: CInt = 16
public const val S_IXGRP: CInt = 8
public const val S_IRWXG: CInt = 56
public const val S_IROTH: CInt = 4
public const val S_IWOTH: CInt = 2
public const val S_IXOTH: CInt = 1
public const val S_IRWXO: CInt = 7
public const val UTIME_OMIT: CLong = 0x3ffffffe
public const val UTIME_NOW: CLong = 0x3fffffff
public const val SOL_SOCKET: CInt = 0xffff
public const val SOMAXCONN: CInt = 128
public const val SO_DEBUG: CInt = 0x0001
public const val SO_REUSEADDR: CInt = 0x0004
public const val SO_KEEPALIVE: CInt = 0x0008
public const val SO_DONTROUTE: CInt = 0x0010
public const val SO_RCVLOWAT: CInt = 0x0012
public const val SO_SNDLOWAT: CInt = 0x0013
public const val SO_SNDTIMEO: CInt = 0x1005
public const val SO_ACCEPTCONN: CInt = 0x001e
public const val SO_BROADCAST: CInt = 0x0020
public const val SO_USELOOPBACK: CInt = 0x0040
public const val SO_LINGER: CInt = 0x0080
public const val SO_REUSEPORT: CInt = 0x0200
public const val SO_VLAN: CInt = 0x8000
public const val SO_SNDBUF: CInt = 0x1001
public const val SO_RCVBUF: CInt = 0x1002
public const val SO_RCVTIMEO: CInt = 0x1006
public const val SO_ERROR: CInt = 0x1007
public const val SO_TYPE: CInt = 0x1008
public const val SO_BINDTODEVICE: CInt = 0x1010
public const val SO_OOBINLINE: CInt = 0x1011
public const val SO_CONNTIMEO: CInt = 0x100a
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val SOCK_SEQPACKET: CInt = 5
public const val SOCK_PACKET: CInt = 10
public const val _SS_MAXSIZE: ULong = 128uL

// _SS_ALIGNSIZE = size_of<UInt>() (computed at the FFI boundary)
// _SS_PAD2SIZE = _SS_MAXSIZE - size_of<CUChar>() - size_of<SaFamilyT>() - _SS_PAD1SIZE - _SS_ALIGNSIZE
public const val MSG_OOB: CInt = 0x0001
public const val MSG_PEEK: CInt = 0x0002
public const val MSG_DONTROUTE: CInt = 0x0004
public const val MSG_EOR: CInt = 0x0008
public const val MSG_TRUNC: CInt = 0x0010
public const val MSG_CTRUNC: CInt = 0x0020
public const val MSG_WAITALL: CInt = 0x0040
public const val MSG_DONTWAIT: CInt = 0x0080
public const val MSG_EOF: CInt = 0x0100
public const val MSG_EXP: CInt = 0x0200
public const val MSG_MBUF: CInt = 0x0400
public const val MSG_NOTIFICATION: CInt = 0x0800
public const val MSG_COMPAT: CInt = 0x8000
public const val AF_UNSPEC: CInt = 0
public const val AF_LOCAL: CInt = 1
public const val PF_LOCAL: CInt = AF_LOCAL
public const val PF_UNIX: CInt = PF_LOCAL
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val AF_UNIX: CInt = AF_LOCAL
public const val AF_INET: CInt = 2
public const val PF_INET: CInt = AF_INET
public const val AF_NETLINK: CInt = 16
public const val AF_ROUTE: CInt = 17
public const val AF_LINK: CInt = 18
public const val AF_PACKET: CInt = 19
public const val pseudo_AF_KEY: CInt = 27
public const val AF_KEY: CInt = pseudo_AF_KEY
public const val AF_INET6: CInt = 28
public const val PF_INET6: CInt = AF_INET6
public const val AF_SOCKDEV: CInt = 31
public const val AF_TIPC: CInt = 33
public const val AF_MIPC: CInt = 34
public const val AF_MIPC_SAFE: CInt = 35
public const val AF_MAX: CInt = 39
public const val B0: SpeedT = 0
public const val B50: SpeedT = 50
public const val B75: SpeedT = 75
public const val B110: SpeedT = 110
public const val B134: SpeedT = 134
public const val B150: SpeedT = 150
public const val B200: SpeedT = 200
public const val B300: SpeedT = 300
public const val B600: SpeedT = 600
public const val B1200: SpeedT = 1200
public const val B1800: SpeedT = 1800
public const val B2400: SpeedT = 2400
public const val B4800: SpeedT = 4800
public const val B9600: SpeedT = 9600
public const val B19200: SpeedT = 19200
public const val B38400: SpeedT = 38400
public const val B57600: SpeedT = 57600
public const val B115200: SpeedT = 115200
public const val B230400: SpeedT = 230400
public const val IGNBRK: TcflagT = 0x00000001
public const val BRKINT: TcflagT = 0x00000002
public const val IGNCR: TcflagT = 0x00000200
public const val IGNPAR: TcflagT = 0x00000000
public const val INPCK: TcflagT = 0x00000020
public const val ISTRIP: TcflagT = 0x00000040
public const val INLCR: TcflagT = 0x00000100
public const val ISIG: TcflagT = 0x00000001
public const val IXOFF: TcflagT = 0x00010000
public const val IXON: TcflagT = 0x00002000
public const val PARMRK: TcflagT = 0x00000000
public const val NOFLSH: TcflagT = 0x00000000
public const val NCCS: ULong = 20uL
public const val OPOST: TcflagT = 0x00000001
public const val ONLCR: TcflagT = 0x00000004
public const val ECHO: TcflagT = 0x00000010
public const val OCRNL: TcflagT = 0x00000010
public const val ECHOE: TcflagT = 0x00000020
public const val ECHOK: TcflagT = 0x00000040
public const val ECHONL: TcflagT = 0x00000100
public const val IFNAMSIZ: ULong = 16uL
public const val IF_NAMESIZE: ULong = IFNAMSIZ
public const val CLOCAL: TcflagT = 0x1
public const val CREAD: TcflagT = 0x2
public const val CS5: TcflagT = 0x0
public const val CS6: TcflagT = 0x4
public const val CS7: TcflagT = 0x8
public const val CS8: TcflagT = 0xc
public const val CSTOPB: TcflagT = 0x20
public const val CSIZE: TcflagT = 0xc
public const val PARODD: TcflagT = 0x80
public const val PARENB: TcflagT = 0x40
public val DT_FIFO: CUChar = (1).toUByte()
public val DT_CHR: CUChar = (2).toUByte()
public val DT_DIR: CUChar = (4).toUByte()
public val DT_BLK: CUChar = (6).toUByte()
public val DT_REG: CUChar = (8).toUByte()
public val DT_LNK: CUChar = (10).toUByte()
public val DT_SOCK: CUChar = (12).toUByte()
public const val FNM_NOMATCH: CInt = 1
public const val FNM_NOESCAPE: CInt = 1
public const val FNM_PATHNAME: CInt = 2
public const val FNM_PERIOD: CInt = 4
public const val FNM_CASEFOLD: CInt = 16
public const val F_OK: CInt = 0
public const val X_OK: CInt = 1
public const val W_OK: CInt = 2
public const val _PC_CHOWN_RESTRICTED: CInt = 4
public const val _PC_LINK_MAX: CInt = 6
public const val _PC_MAX_CANON: CInt = 7
public const val _PC_MAX_INPUT: CInt = 8
public const val _PC_NAME_MAX: CInt = 9
public const val _PC_NO_TRUNC: CInt = 10
public const val _PC_PATH_MAX: CInt = 11
public const val _PC_PIPE_BUF: CInt = 12
public const val _PC_VDISABLE: CInt = 20
public const val HUPCL: TcflagT = 0x10
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val ICANON: TcflagT = 0x00000002
public const val ICRNL: TcflagT = 0x00000400
public const val IEXTEN: TcflagT = 0x00000000
public const val TCP_NODELAY: CInt = 1
public const val TCP_MAXSEG: CInt = 2
public const val TCP_NOPUSH: CInt = 3
public const val TCP_KEEPIDLE: CInt = 4
public const val TCP_KEEPINTVL: CInt = 5
public const val TCP_KEEPCNT: CInt = 6
public const val TCSANOW: CInt = 0
public const val TCSADRAIN: CInt = 1
public const val TCSAFLUSH: CInt = 2
public const val FIONREAD: CInt = 0x40040001
public const val FIOFLUSH: CInt = 2
public const val FIOOPTIONS: CInt = 3
public const val FIOBAUDRATE: CInt = 4
public const val FIODISKFORMAT: CInt = 5
public const val FIODISKINIT: CInt = 6
public const val FIOSEEK: CInt = 7
public const val FIOWHERE: CInt = 8
public const val FIODIRENTRY: CInt = 9
public const val FIORENAME: CInt = 10
public const val FIOREADYCHANGE: CInt = 11
public const val FIODISKCHANGE: CInt = 13
public const val FIOCANCEL: CInt = 14
public const val FIOSQUEEZE: CInt = 15
public const val FIOGETNAME: CInt = 18
public const val FIONBIO: CInt = 0x90040010
public const val PATH_MAX: CInt = _PARM_PATH_MAX
public const val _POSIX_PATH_MAX: CInt = 256
public const val POLLIN: CShort = 0x0001
public const val POLLPRI: CShort = 0x0002
public const val POLLOUT: CShort = 0x0004
public const val POLLRDNORM: CShort = 0x0040
public const val POLLWRNORM: CShort = POLLOUT
public const val POLLRDBAND: CShort = 0x0080
public const val POLLWRBAND: CShort = 0x0100
public const val POLLERR: CShort = 0x0008
public const val POLLHUP: CShort = 0x0010
public const val POLLNVAL: CShort = 0x0020
public const val FD_CLOEXEC: CInt = 1
public const val F_DUPFD: CInt = 0
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val F_GETOWN: CInt = 5
public const val F_SETOWN: CInt = 6
public const val F_GETLK: CInt = 7
public const val F_SETLK: CInt = 8
public const val F_SETLKW: CInt = 9
public const val F_DUPFD_CLOEXEC: CInt = 14
public const val LOG_EMERG: CInt = 0
public const val LOG_ALERT: CInt = 1
public const val LOG_CRIT: CInt = 2
public const val LOG_ERR: CInt = 3
public const val LOG_WARNING: CInt = 4
public const val LOG_NOTICE: CInt = 5
public const val LOG_INFO: CInt = 6
public const val LOG_DEBUG: CInt = 7
public val LOG_KERN: CInt = 0 shl 3
public val LOG_USER: CInt = 1 shl 3
public val LOG_MAIL: CInt = 2 shl 3
public val LOG_DAEMON: CInt = 3 shl 3
public val LOG_AUTH: CInt = 4 shl 3
public val LOG_SYSLOG: CInt = 5 shl 3
public val LOG_LPR: CInt = 6 shl 3
public val LOG_NEWS: CInt = 7 shl 3
public val LOG_UUCP: CInt = 8 shl 3
public val LOG_LOCAL0: CInt = 16 shl 3
public val LOG_LOCAL1: CInt = 17 shl 3
public val LOG_LOCAL2: CInt = 18 shl 3
public val LOG_LOCAL3: CInt = 19 shl 3
public val LOG_LOCAL4: CInt = 20 shl 3
public val LOG_LOCAL5: CInt = 21 shl 3
public val LOG_LOCAL6: CInt = 22 shl 3
public val LOG_LOCAL7: CInt = 23 shl 3
public const val LOG_PID: CInt = 0x01
public const val LOG_CONS: CInt = 0x02
public const val LOG_ODELAY: CInt = 0x04
public const val LOG_NDELAY: CInt = 0x08
public const val LOG_NOWAIT: CInt = 0x10
public const val LOG_PRIMASK: CInt = 0x7
public const val LOG_FACMASK: CInt = 0x3f8
public const val RTLD_LOCAL: CInt = 0
public const val RTLD_LAZY: CInt = 1
public const val RTLD_NOW: CInt = 2
public const val RTLD_GLOBAL: CInt = 256
public val SIG_DFL: SighandlerT = 0.toSighandlerT()
public val SIG_IGN: SighandlerT = 1.toSighandlerT()
public val SIG_ERR: SighandlerT = -1.toLong().toSighandlerT()
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGTRAP: CInt = 5
public const val SIGABRT: CInt = 6
public const val SIGEMT: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGBUS: CInt = 10
public const val SIGSEGV: CInt = 11
public const val SIGFMT: CInt = 12
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val SIGCNCL: CInt = 16
public const val SIGSTOP: CInt = 17
public const val SIGTSTP: CInt = 18
public const val SIGCONT: CInt = 19
public const val SIGCHLD: CInt = 20
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGUSR1: CInt = 30
public const val SIGUSR2: CInt = 31
public const val SIGPOLL: CInt = 32
public const val SIGPROF: CInt = 33
public const val SIGSYS: CInt = 34
public const val SIGURG: CInt = 35
public const val SIGVTALRM: CInt = 36
public const val SIGXCPU: CInt = 37
public const val SIGXFSZ: CInt = 38
public const val SIGRTMIN: CInt = 48
public const val SIGIO: CInt = SIGRTMIN
public const val SIGWINCH: CInt = SIGRTMIN + 5
public const val SIGLOST: CInt = SIGRTMIN + 6
public const val SIG_BLOCK: CInt = 1
public const val SIG_UNBLOCK: CInt = 2
public const val SIG_SETMASK: CInt = 3
public const val SA_NOCLDSTOP: CInt = 0x0001
public const val SA_SIGINFO: CInt = 0x0002
public const val SA_ONSTACK: CInt = 0x0004
public const val SA_INTERRUPT: CInt = 0x0008
public const val SA_RESETHAND: CInt = 0x0010
public const val SA_RESTART: CInt = 0x0020
public const val SA_NODEFER: CInt = 0x0040
public const val SA_NOCLDWAIT: CInt = 0x0080
public const val SI_SYNC: CInt = 0
public const val SI_USER: CInt = -1
public const val SI_QUEUE: CInt = -2
public const val SI_TIMER: CInt = -3
public const val SI_ASYNCIO: CInt = -4
public const val SI_MESGQ: CInt = -5
public const val SI_CHILD: CInt = -6
public const val SI_KILL: CInt = SI_USER
public const val AT_FDCWD: CInt = -100
public const val AT_SYMLINK_NOFOLLOW: CInt = 0x100
public const val AT_REMOVEDIR: CInt = 0x200
public const val AT_SYMLINK_FOLLOW: CInt = 0x400
public const val _PARM_NAME_MAX: CInt = 255
public const val _PARM_PATH_MAX: CInt = 1024
public const val WNOHANG: CInt = 0x01
public const val WUNTRACED: CInt = 0x02
public const val WCONTINUED: CInt = 0x04

// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = pthread_mutex_t { mutexSemId: null_mut(), mutexValid: PTHREAD_VALID_OBJ, mutexInitted: PTHREAD_UNUSED_YET_OBJ, mutexCondRefCount: 0, mutexSavPriority: -1, mutexAttr: PTHREAD_MUTEXATTR_INITIALIZER, mutexSemName: [0 (initializer represented at the FFI boundary)
// PTHREAD_COND_INITIALIZER: PthreadCondT = pthread_cond_t { condSemId: null_mut(), condValid: PTHREAD_VALID_OBJ, condInitted: PTHREAD_UNUSED_YET_OBJ, condRefCount: 0, condMutex: null_mut(), condAttr: PTHREAD_CONDATTR_INITIALIZER, condSemName: [0 (initializer represented at the FFI boundary)
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = pthread_rwlock_t { rwlockSemId: null_mut(), rwlockReadersRefCount: 0, rwlockValid: PTHREAD_VALID_OBJ, rwlockInitted: PTHREAD_UNUSED_YET_OBJ, rwlockAttr: PTHREAD_RWLOCKATTR_INITIALIZER, rwlockSemName: [0 (initializer represented at the FFI boundary)
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val VX_RTP_NAME_LENGTH: CInt = 255
public const val RTP_ID_ERROR: RTPID = -1
public const val R_OK: CInt = 4
public const val _SC_ARG_MAX: CInt = 4
public const val _SC_CHILD_MAX: CInt = 12
public const val _SC_CLK_TCK: CInt = 13
public const val _SC_GETPW_R_SIZE_MAX: CInt = 21
public const val _SC_HOST_NAME_MAX: CInt = 22
public const val _SC_NGROUPS_MAX: CInt = 36
public const val _SC_OPEN_MAX: CInt = 37
public const val _SC_PAGE_SIZE: CInt = 38
public const val _SC_PAGESIZE: CInt = 39
public const val _SC_STREAM_MAX: CInt = 59
public const val _SC_SYMLOOP_MAX: CInt = 60
public const val _SC_TTY_NAME_MAX: CInt = 87
public const val _SC_TZNAME_MAX: CInt = 89
public const val _SC_VERSION: CInt = 94
public const val O_ACCMODE: CInt = 3
public const val O_CLOEXEC: CInt = 0x100000
public const val O_EXCL: CInt = 0x0800
public const val O_CREAT: CInt = 0x0200
public const val O_TRUNC: CInt = 0x0400
public const val O_APPEND: CInt = 0x0008
public const val O_RDWR: CInt = 0x0002
public const val O_WRONLY: CInt = 0x0001
public const val O_RDONLY: CInt = 0
public const val O_NONBLOCK: CInt = 0x4000
public const val PROT_NONE: CInt = 0x0000
public const val PROT_READ: CInt = 0x0001
public const val PROT_WRITE: CInt = 0x0002
public const val PROT_EXEC: CInt = 0x0004
public const val MAP_SHARED: CInt = 0x0001
public const val MAP_PRIVATE: CInt = 0x0002
public const val MAP_ANON: CInt = 0x0004
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val MAP_FIXED: CInt = 0x0010
public const val MAP_CONTIG: CInt = 0x0020
public const val MS_SYNC: CInt = 0x0001
public const val MS_ASYNC: CInt = 0x0002
public const val MS_INVALIDATE: CInt = 0x0004
public const val TIOCGWINSZ: CInt = 0x1740087468
public const val TIOCSWINSZ: CInt = -0x7ff78b99

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?

public expect fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr?

public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?

public expect fun isalnum(c: CInt): CInt

public expect fun isalpha(c: CInt): CInt

public expect fun iscntrl(c: CInt): CInt

public expect fun isdigit(c: CInt): CInt

public expect fun isgraph(c: CInt): CInt

public expect fun islower(c: CInt): CInt

public expect fun isprint(c: CInt): CInt

public expect fun ispunct(c: CInt): CInt

public expect fun isspace(c: CInt): CInt

public expect fun isupper(c: CInt): CInt

public expect fun isxdigit(c: CInt): CInt

public expect fun isblank(c: CInt): CInt

public expect fun tolower(c: CInt): CInt

public expect fun toupper(c: CInt): CInt

public expect fun fopen(filename: String?, mode: String?): FILE?

public expect fun freopen(filename: String?, mode: String?, file: FILE?): FILE?

public expect fun fflush(file: FILE?): CInt

public expect fun fclose(file: FILE?): CInt

public expect fun remove(filename: String?): CInt

public expect fun rename(oldname: String?, newname: String?): CInt

public expect fun tmpfile(): FILE?

public expect fun setvbuf(stream: FILE?, buffer: String?, mode: CInt, size: ULong): CInt

public expect fun setbuf(stream: FILE?, buf: String?)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: FILE?): CInt

public expect fun fgets(buf: String?, n: CInt, stream: FILE?): String?

public expect fun fputc(c: CInt, stream: FILE?): CInt

public expect fun fputs(s: String?, stream: FILE?): CInt

public expect fun puts(s: String?): CInt

public expect fun ungetc(c: CInt, stream: FILE?): CInt

public expect fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong

public expect fun fwrite(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong

public expect fun fseek(stream: FILE?, offset: CLong, whence: CInt): CInt

public expect fun ftell(stream: FILE?): CLong

public expect fun rewind(stream: FILE?)

public expect fun fgetpos(stream: FILE?, ptr: FposT?): CInt

public expect fun fsetpos(stream: FILE?, ptr: FposT?): CInt

public expect fun feof(stream: FILE?): CInt

public expect fun ferror(stream: FILE?): CInt

public expect fun perror(s: String?)

public expect fun atof(s: String?): CDouble

public expect fun atoi(s: String?): CInt

public expect fun atol(s: String?): CLong

public expect fun atoll(s: String?): CLongLong

public expect fun strtod(s: String?, endp: COpaquePointer?): CDouble

public expect fun strtof(s: String?, endp: COpaquePointer?): CFloat

public expect fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLongLong

public expect fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CULong

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CULongLong

public expect fun calloc(nobj: ULong, size: ULong): COpaquePointer?

public expect fun malloc(size: ULong): COpaquePointer?

public expect fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: (() -> Unit)?): CInt

public expect fun system(s: String?): CInt

public expect fun getenv(s: String?): String?

public expect fun cfgetospeed(termios: Termios?): SpeedT

public expect fun cfmakeraw(termios: Termios?): CInt

public expect fun cfsetispeed(termios: Termios?, speed: SpeedT): CInt

public expect fun cfsetospeed(termios: Termios?, speed: SpeedT): CInt

public expect fun strcpy(dst: String?, src: String?): String?

public expect fun strncpy(dst: String?, src: String?, n: ULong): String?

public expect fun strcat(s: String?, ct: String?): String?

public expect fun strncat(s: String?, ct: String?, n: ULong): String?

public expect fun strcmp(cs: String?, ct: String?): CInt

public expect fun strncmp(cs: String?, ct: String?, n: ULong): CInt

public expect fun strcoll(cs: String?, ct: String?): CInt

public expect fun strchr(cs: String?, c: CInt): String?

public expect fun strrchr(cs: String?, c: CInt): String?

public expect fun strspn(cs: String?, ct: String?): ULong

public expect fun strcspn(cs: String?, ct: String?): ULong

public expect fun strdup(cs: String?): String?

public expect fun strpbrk(cs: String?, ct: String?): String?

public expect fun strstr(cs: String?, ct: String?): String?

public expect fun strcasecmp(s1: String?, s2: String?): CInt

public expect fun strncasecmp(s1: String?, s2: String?, n: ULong): CInt

public expect fun strlen(cs: String?): ULong

public expect fun strnlen(cs: String?, n: ULong): ULong

public expect fun strerror(n: CInt): String?

public expect fun strtok(s: String?, t: String?): String?

public expect fun strxfrm(s: String?, ct: String?, n: ULong): ULong

public expect fun wcslen(buf: WcharT?): ULong

public expect fun wcstombs(dest: String?, src: WcharT?, n: ULong): ULong

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun wmemchr(cx: WcharT?, c: WcharT, n: ULong): WcharT?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?

public expect fun alignedAlloc(alignment: ULong, size: ULong): COpaquePointer?

public expect fun uname(buf: Utsname?): CInt

public expect fun times(buf: Tms?): ClockT

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun pclose(stream: FILE?): CInt

public expect fun mkdtemp(template: String?): String?

public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt

public expect fun getprotobyname(name: String?): Protoent?

public expect fun getprotobynumber(proto: CInt): Protoent?

public expect fun getservbyname(name: String?, proto: String?): Servent?

public expect fun fchownat(dirfd: CInt, pathname: String?, owner: UidT, group: GidT, flags: CInt): CInt

public expect fun fprintf(stream: FILE?, format: String?, vararg args: Any?): CInt

public expect fun printf(format: String?, vararg args: Any?): CInt

public expect fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): CInt

public expect fun sprintf(s: String?, format: String?, vararg args: Any?): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg args: Any?): CInt

public expect fun scanf(format: String?, vararg args: Any?): CInt

public expect fun sscanf(s: String?, format: String?, vararg args: Any?): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun stat(path: String?, buf: Stat?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun creat(path: String?, mode: ModeT): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun fchown(fd: CInt, owner: UidT, group: GidT): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun alarm(seconds: CUInt): CUInt

public expect fun fchdir(dirfd: CInt): CInt

public expect fun chown(path: String?, uid: UidT, gid: GidT): CInt

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getegid(): GidT

public expect fun geteuid(): UidT

public expect fun getgroups(ngroupsMax: CInt, groups: GidT?): CInt

public expect fun getlogin(): String?

public expect fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt

public expect fun pathconf(path: String?, name: CInt): CLong

public expect fun pause(): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun sleep(secs: CUInt): CUInt

public expect fun ttyname(fd: CInt): String?

public expect fun wait(status: CInt?): PidT

public expect fun umask(mask: ModeT): ModeT

public expect fun mlock(addr: COpaquePointer?, len: ULong): CInt

public expect fun mlockall(flags: CInt): CInt

public expect fun munlock(addr: COpaquePointer?, len: ULong): CInt

public expect fun munlockall(): CInt

public expect fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: ULong): CInt

public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt

public expect fun truncate(path: String?, length: OffT): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt

public expect fun pthreadExit(value: COpaquePointer?): Nothing

public expect fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, state: CInt): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt

public expect fun sigaddset(set: SigsetT?, signum: CInt): CInt

public expect fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt

public expect fun utimes(filename: String?, times: Timeval?): CInt

public expect fun futimens(fd: CInt, times: Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt

public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?

public expect fun dlerror(): String?

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): CInt

public expect fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt

public expect fun gmtimeR(timeP: TimeT?, result: Tm?): Tm?

public expect fun localtimeR(timeP: TimeT?, result: Tm?): Tm?

public expect fun mktime(tm: Tm?): TimeT

public expect fun time(time: TimeT?): TimeT

public expect fun gmtime(timeP: TimeT?): Tm?

public expect fun localtime(timeP: TimeT?): Tm?

public expect fun timegm(tm: Tm?): TimeT

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun gethostname(name: String?, len: ULong): CInt

public expect fun usleep(secs: UsecondsT): CInt

public expect fun putenv(string: String?): CInt

public expect fun setlocale(category: CInt, locale: String?): String?

public expect fun localeconv(): Lconv?

public expect fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun sigpending(set: SigsetT?): CInt

public expect fun mkfifo(path: String?, mode: ModeT): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun mkstemp(template: String?): CInt

public expect fun tmpnam(ptr: String?): String?

public expect fun openlog(ident: String?, logopt: CInt, facility: CInt)

public expect fun closelog()

public expect fun setlogmask(maskpri: CInt): CInt

public expect fun syslog(priority: CInt, message: String?, vararg args: Any?)

public expect fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: Termios?): CInt

public expect fun tcgetattr(fd: CInt, termios: Termios?): CInt

public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt

public expect fun confstr(name: CInt, buf: String?, len: ULong): ULong

public expect fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt

public expect fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt

public expect fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt

public expect fun utime(file: String?, buf: Utimbuf?): CInt

public expect fun memalign(blockSize: ULong, sizeArg: ULong): COpaquePointer?

public expect fun getcwd(buf: String?, size: ULong): String?

public expect fun chdir(attr: String?): CInt

public expect fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexattrSettype(pAttr: PthreadMutexattrT?, pType: CInt): CInt

public expect fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt

public expect fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt

public expect fun pthreadMutexLock(mutex: PthreadMutexT?): CInt

public expect fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt

public expect fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): CInt

public expect fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt

public expect fun pthreadAttrSetname(pAttr: PthreadAttrT?, name: String?): CInt

public expect fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: ULong): CInt

public expect fun pthreadAttrGetstacksize(attr: PthreadAttrT?, size: ULong?): CInt

public expect fun pthreadAttrInit(attr: PthreadAttrT?): CInt

public expect fun pthreadCreate(pThread: PthreadT?, pAttr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt

public expect fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt

public expect fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt

public expect fun pthreadAttrDestroy(thread: PthreadAttrT?): CInt

public expect fun pthreadDetach(thread: PthreadT): CInt

public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt

public expect fun fstat(fildes: CInt, buf: Stat?): CInt

public expect fun lstat(path: String?, buf: Stat?): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun readdirR(pDir: DIR?, entry: Dirent?, result: COpaquePointer?): CInt

public expect fun readdir(pDir: DIR?): Dirent?

public expect fun open(path: String?, oflag: CInt, vararg args: Any?): CInt

public expect fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt

public expect fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt

public expect fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt

public expect fun pthreadCondattrGetclock(pAttr: PthreadCondattrT?, pClockId: ClockidT?): CInt

public expect fun pthreadCondattrSetclock(pAttr: PthreadCondattrT?, clockId: ClockidT): CInt

public expect fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt

public expect fun pthreadCondDestroy(cond: PthreadCondT?): CInt

public expect fun pthreadCondSignal(cond: PthreadCondT?): CInt

public expect fun pthreadCondBroadcast(cond: PthreadCondT?): CInt

public expect fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt

public expect fun pthreadRwlockattrInit(attr: PthreadRwlockattrT?): CInt

public expect fun pthreadRwlockattrDestroy(attr: PthreadRwlockattrT?): CInt

public expect fun pthreadRwlockattrSetmaxreaders(attr: PthreadRwlockattrT?, attr2: CUInt): CInt

public expect fun pthreadRwlockInit(attr: PthreadRwlockT?, host: PthreadRwlockattrT?): CInt

public expect fun pthreadRwlockDestroy(attr: PthreadRwlockT?): CInt

public expect fun pthreadRwlockRdlock(attr: PthreadRwlockT?): CInt

public expect fun pthreadRwlockTryrdlock(attr: PthreadRwlockT?): CInt

public expect fun pthreadRwlockTimedrdlock(attr: PthreadRwlockT?, host: Timespec?): CInt

public expect fun pthreadRwlockWrlock(attr: PthreadRwlockT?): CInt

public expect fun pthreadRwlockTrywrlock(attr: PthreadRwlockT?): CInt

public expect fun pthreadRwlockTimedwrlock(attr: PthreadRwlockT?, host: Timespec?): CInt

public expect fun pthreadRwlockUnlock(attr: PthreadRwlockT?): CInt

public expect fun pthreadKeyCreate(key: PthreadKeyT?, dtor: ((COpaquePointer?) -> Unit)?): CInt

public expect fun pthreadKeyDelete(key: PthreadKeyT): CInt

public expect fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt

public expect fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer?

public expect fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadAttrGetname(attr: PthreadAttrT?, name: COpaquePointer?): CInt

public expect fun pthreadJoin(thread: PthreadT, status: COpaquePointer?): CInt

public expect fun pthreadSelf(): PthreadT

public expect fun clockGettime(clockId: ClockidT, tp: Timespec?): CInt

public expect fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt

public expect fun clockGetres(clockId: ClockidT, res: Timespec?): CInt

public expect fun clockNanosleep(clockId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun accept(s: CInt, addr: Sockaddr?, addrlen: SocklenT?): CInt

public expect fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt

public expect fun connect(s: CInt, name: Sockaddr?, namelen: SocklenT): CInt

public expect fun getpeername(s: CInt, name: Sockaddr?, namelen: SocklenT?): CInt

public expect fun getsockname(socket: CInt, address: Sockaddr?, addressLen: SocklenT?): CInt

public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: SocklenT?): CInt

public expect fun listen(socket: CInt, backlog: CInt): CInt

public expect fun recv(s: CInt, buf: COpaquePointer?, bufLen: ULong, flags: CInt): SsizeT

public expect fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: ULong, flags: CInt, from: Sockaddr?, pFromLen: SocklenT?): SsizeT

public expect fun recvmsg(socket: CInt, mp: Msghdr?, flags: CInt): SsizeT

public expect fun send(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt): SsizeT

public expect fun sendmsg(socket: CInt, mp: Msghdr?, flags: CInt): SsizeT

public expect fun sendto(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT

public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt

public expect fun shutdown(s: CInt, how: CInt): CInt

public expect fun socket(domain: CInt, type: CInt, protocol: CInt): CInt

public expect fun ioctl(fd: CInt, request: CInt, vararg args: Any?): CInt

public expect fun fcntl(fd: CInt, cmd: CInt, vararg args: Any?): CInt

public expect fun gaiStrerror(errcode: CInt): String?

public expect fun close(fd: CInt): CInt

public expect fun read(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT

public expect fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT

public expect fun isatty(fd: CInt): CInt

public expect fun dup(src: CInt): CInt

public expect fun dup2(src: CInt, dst: CInt): CInt

public expect fun pipe(fds: CInt?): CInt

public expect fun unlink(pathname: String?): CInt

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt

public expect fun freeaddrinfo(res: Addrinfo?)

public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

public expect fun getpid(): PidT

public expect fun getppid(): PidT

public expect fun setpgid(pid: PidT, pgid: PidT): PidT

public expect fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT

public expect fun sysconf(attr: CInt): CLong

public expect fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt

public expect fun unsetenv(envVarName: String?): CInt

public expect fun realpath(fileName: String?, resolvedName: String?): String?

public expect fun link(src: String?, dst: String?): CInt

public expect fun readlink(path: String?, buf: String?, bufsize: ULong): SsizeT

public expect fun symlink(path1: String?, path2: String?): CInt

public expect fun opendir(name: String?): DIR?

public expect fun rmdir(path: String?): CInt

public expect fun mkdir(dirName: String?, mode: ModeT): CInt

public expect fun chmod(path: String?, mode: ModeT): CInt

public expect fun fchmod(attr1: CInt, attr2: ModeT): CInt

public expect fun fsync(fd: CInt): CInt

public expect fun closedir(ptr: DIR?): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt

public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt

public expect fun schedYield(): CInt

public expect fun errnoSet(err: CInt): CInt

public expect fun errnoGet(): CInt

public expect fun exit(status: CInt): Nothing

public expect fun setgid(gid: GidT): CInt

public expect fun getgid(): GidT

public expect fun setuid(uid: UidT): CInt

public expect fun getuid(): UidT

public expect fun sigemptyset(set: SigsetT?): CInt

public expect fun sigfillset(set: SigsetT?): CInt

public expect fun sigdelset(set: SigsetT?, signum: CInt): CInt

public expect fun sigismember(set: SigsetT?, signum: CInt): CInt

public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oset: SigsetT?): CInt

public expect fun kill(pid: PidT, signo: CInt): CInt

public expect fun sigqueue(pid: PidT, signo: CInt, value: Sigval): CInt

public expect fun sigqueue(rtpId: RTPID, signo: CInt, pValue: Sigval?, sigCode: CInt): CInt

public expect fun taskKill(taskId: TASKID, signo: CInt): CInt

public expect fun raise(signo: CInt): CInt

public expect fun taskIdSelf(): TASKID

public expect fun taskDelay(ticks: VxTicksT): CInt

public expect fun taskNameSet(taskId: TASKID, taskName: String?): CInt

public expect fun taskNameGet(taskId: TASKID, bufName: String?, bufsize: ULong): CInt

public expect fun rtpInfoGet(rtpId: RTPID, rtpStruct: RTPDESC?): CInt

public expect fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: ULong, options: CInt, taskOptions: CInt): RTPID

public expect fun realpath(fileName: String?, resolvedName: String?): String?

public expect fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): BOOL

public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT

public expect fun randBytes(buf: COpaquePointer?, length: CInt): CInt

public expect fun randABytes(buf: COpaquePointer?, length: CInt): CInt

public expect fun randUBytes(buf: COpaquePointer?, length: CInt): CInt

public expect fun randSecure(): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt

public expect fun vxCpuEnabledGet(): CpusetT

public expect fun vxCpuConfiguredGet(): CpusetT
