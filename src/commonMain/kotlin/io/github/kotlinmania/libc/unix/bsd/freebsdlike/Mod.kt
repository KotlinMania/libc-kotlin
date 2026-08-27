// port-lint: source libc/src/unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public const val POLLIN: CShort = 0x0001
public const val POLLPRI: CShort = 0x0002
public const val POLLOUT: CShort = 0x0004
public const val POLLERR: CShort = 0x0008
public const val POLLHUP: CShort = 0x0010
public const val POLLNVAL: CShort = 0x0020
public const val POLLRDNORM: CShort = 0x0040
public const val POLLRDBAND: CShort = 0x0080
public const val POLLWRBAND: CShort = 0x0100
public typealias ModeT = UShort
public typealias PthreadAttrT = COpaquePointer?
public typealias RlimT = Long
public typealias PthreadMutexT = COpaquePointer?
public typealias PthreadMutexattrT = COpaquePointer?
public typealias PthreadCondT = COpaquePointer?
public typealias PthreadCondattrT = COpaquePointer?
public typealias PthreadRwlockT = COpaquePointer?
public typealias PthreadRwlockattrT = COpaquePointer?
public typealias PthreadKeyT = CInt
public typealias TcflagT = CUInt
public typealias SpeedT = CUInt
public typealias NlItem = CInt
public typealias IdT = Long
public typealias VmSizeT = UintptrT
public typealias KeyT = CLong
public typealias Elf32Addr = UInt
public typealias Elf32Half = UShort
public typealias Elf32Lword = ULong
public typealias Elf32Off = UInt
public typealias Elf32Sword = Int
public typealias Elf32Word = UInt
public typealias Elf64Addr = ULong
public typealias Elf64Half = UShort
public typealias Elf64Lword = ULong
public typealias Elf64Off = ULong
public typealias Elf64Sword = Int
public typealias Elf64Sxword = Long
public typealias Elf64Word = UInt
public typealias Elf64Xword = ULong
public typealias ElfAddr = Elf64Addr
public typealias ElfHalf = Elf64Half
public typealias ElfPhdr = Elf64Phdr
public typealias IconvT = COpaquePointer?
public typealias KvmT = COpaquePointer?
public typealias PosixSpawnattrT = COpaquePointer?
public typealias PosixSpawnFileActionsT = COpaquePointer?

public data class InAddr(
    val sAddr: InAddrT,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class IpMreqn(
    val imrMultiaddr: InAddr,
    val imrAddress: InAddr,
    val imrIfindex: CInt,
)

public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrSourceaddr: InAddr,
    val imrInterface: InAddr,
)

public data class GlobT(
    val glPathc: ULong,
    val glMatchc: ULong,
    val glOffs: ULong,
    val glFlags: CInt,
    val glPathv: COpaquePointer?,
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
    val tmGmtoff: CLong,
    val tmZone: String?,
)

public data class Addrinfo(
    val aiFlags: CInt,
    val aiFamily: CInt,
    val aiSocktype: CInt,
    val aiProtocol: CInt,
    val aiAddrlen: SocklenT,
    val aiCanonname: String?,
    val aiAddr: Sockaddr?,
    val aiNext: Addrinfo?,
)

public data class SigsetT(
    val bits: UIntArray,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siErrno: CInt,
    val siCode: CInt,
    val siPid: PidT,
    val siUid: UidT,
    val siStatus: CInt,
    val siAddr: COpaquePointer?,
    val siValue: Sigval,
    val siUtime: CLong? = null,
    val siStime: CLong? = null,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saFlags: CInt,
    val saMask: SigsetT,
)

public data class SchedParam(
    val schedPriority: CInt,
)

public data class DlInfo(
    val dliFname: String?,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
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

public data class Flock(
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
    val lType: CShort,
    val lWhence: CShort,
    val lSysid: CInt,
)

public data class SfHdtr(
    val headers: Iovec?,
    val hdrCnt: CInt,
    val trailers: Iovec?,
    val trlCnt: CInt,
)

public data class Lconv(
    val decimalPoint: String?,
    val thousandsSep: String?,
    val grouping: String?,
    val intCurrSymbol: String?,
    val currencySymbol: String?,
    val monDecimalPoint: String?,
    val monThousandsSep: String?,
    val monGrouping: String?,
    val positiveSign: String?,
    val negativeSign: String?,
    val intFracDigits: CChar,
    val fracDigits: CChar,
    val pCsPrecedes: CChar,
    val pSepBySpace: CChar,
    val nCsPrecedes: CChar,
    val nSepBySpace: CChar,
    val pSignPosn: CChar,
    val nSignPosn: CChar,
    val intPCsPrecedes: CChar,
    val intNCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intNSepBySpace: CChar,
    val intPSignPosn: CChar,
    val intNSignPosn: CChar,
)

public data class Cmsgcred(
    val cmcredPid: PidT,
    val cmcredUid: UidT,
    val cmcredEuid: UidT,
    val cmcredGid: GidT,
    val cmcredNgroups: CShort,
    val cmcredGroups: List<GidT>,
)

public data class Rtprio(
    val type: CUShort,
    val prio: CUShort,
)

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: CUInt,
)

public data class Arphdr(
    val arHrd: UShort,
    val arPro: UShort,
    val arHln: UByte,
    val arPln: UByte,
    val arOp: UShort,
)

public data class Timex(
    val modes: CUInt,
    val offset: CLong,
    val freq: CLong,
    val maxerror: CLong,
    val esterror: CLong,
    val status: CInt,
    val constant: CLong,
    val precision: CLong,
    val tolerance: CLong,
    val ppsfreq: CLong,
    val jitter: CLong,
    val shift: CInt,
    val stabil: CLong,
    val jitcnt: CLong,
    val calcnt: CLong,
    val errcnt: CLong,
    val stbcnt: CLong,
)

public data class Ntptimeval(
    val time: Timespec,
    val maxerror: CLong,
    val esterror: CLong,
    val tai: CLong,
    val timeState: CInt,
)

public data class AcceptFilterArg(
    val afName: ByteArray,
    val afArg: ByteArray,
)

public data class PtraceIoDesc(
    val piodOp: CInt,
    val piodOffs: COpaquePointer?,
    val piodAddr: COpaquePointer?,
    val piodLen: ULong,
)

public data class BpfProgram(
    val bfLen: CUInt,
    val bfInsns: BpfInsn?,
)

public data class BpfStat(
    val bsRecv: CUInt,
    val bsDrop: CUInt,
)

public data class BpfVersion(
    val bvMajor: CUShort,
    val bvMinor: CUShort,
)

public data class BpfHdr(
    val bhTstamp: Timeval,
    val bhCaplen: UInt,
    val bhDatalen: UInt,
    val bhHdrlen: CUShort,
)

public data class BpfInsn(
    val code: CUShort,
    val jt: CUChar,
    val jf: CUChar,
    val k: UInt,
)

public data class BpfDltlist(
    val bflLen: CUInt,
    val bflList: CUInt?,
)

public data class Elf32Phdr(
    val pType: Elf32Word,
    val pOffset: Elf32Off,
    val pVaddr: Elf32Addr,
    val pPaddr: Elf32Addr,
    val pFilesz: Elf32Word,
    val pMemsz: Elf32Word,
    val pFlags: Elf32Word,
    val pAlign: Elf32Word,
)

public data class Elf64Phdr(
    val pType: Elf64Word,
    val pFlags: Elf64Word,
    val pOffset: Elf64Off,
    val pVaddr: Elf64Addr,
    val pPaddr: Elf64Addr,
    val pFilesz: Elf64Xword,
    val pMemsz: Elf64Xword,
    val pAlign: Elf64Xword,
)

// Generic ELF type aliases for DlPhdrInfo — the upstream Rust cfg-gates
// these to Elf64_* or Elf32_* per architecture. Here the 64-bit variants
// are used as the commonMain default.

public data class DlPhdrInfo(
    val dlpiAddr: ElfAddr,
    val dlpiName: String?,
    val dlpiPhdr: ElfPhdr?,
    val dlpiPhnum: ElfHalf,
    val dlpiAdds: CULongLong,
    val dlpiSubs: CULongLong,
    val dlpiTlsModid: ULong,
    val dlpiTlsData: COpaquePointer?,
)

public data class IpcPerm(
    val cuid: UidT,
    val cgid: GidT,
    val uid: UidT,
    val gid: GidT,
    val mode: ModeT,
    val seq: CUShort,
    val key: KeyT,
)

public data class Eui64(
    val octet: UByteArray,
)

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: SaFamilyT,
    val ssAlign: Long,
)

public const val AIO_LISTIO_MAX: CInt = 16
public const val AIO_CANCELED: CInt = 1
public const val AIO_NOTCANCELED: CInt = 2
public const val AIO_ALLDONE: CInt = 3
public const val LIO_NOP: CInt = 0
public const val LIO_WRITE: CInt = 1
public const val LIO_READ: CInt = 2
public const val LIO_WAIT: CInt = 1
public const val LIO_NOWAIT: CInt = 0
public const val SIGEV_NONE: CInt = 0
public const val SIGEV_SIGNAL: CInt = 1
public const val SIGEV_THREAD: CInt = 2
public const val SIGEV_KEVENT: CInt = 3
public const val CODESET: NlItem = 0
public const val D_T_FMT: NlItem = 1
public const val D_FMT: NlItem = 2
public const val T_FMT: NlItem = 3
public const val T_FMT_AMPM: NlItem = 4
public const val AM_STR: NlItem = 5
public const val PM_STR: NlItem = 6
public const val DAY_1: NlItem = 7
public const val DAY_2: NlItem = 8
public const val DAY_3: NlItem = 9
public const val DAY_4: NlItem = 10
public const val DAY_5: NlItem = 11
public const val DAY_6: NlItem = 12
public const val DAY_7: NlItem = 13
public const val ABDAY_1: NlItem = 14
public const val ABDAY_2: NlItem = 15
public const val ABDAY_3: NlItem = 16
public const val ABDAY_4: NlItem = 17
public const val ABDAY_5: NlItem = 18
public const val ABDAY_6: NlItem = 19
public const val ABDAY_7: NlItem = 20
public const val MON_1: NlItem = 21
public const val MON_2: NlItem = 22
public const val MON_3: NlItem = 23
public const val MON_4: NlItem = 24
public const val MON_5: NlItem = 25
public const val MON_6: NlItem = 26
public const val MON_7: NlItem = 27
public const val MON_8: NlItem = 28
public const val MON_9: NlItem = 29
public const val MON_10: NlItem = 30
public const val MON_11: NlItem = 31
public const val MON_12: NlItem = 32
public const val ABMON_1: NlItem = 33
public const val ABMON_2: NlItem = 34
public const val ABMON_3: NlItem = 35
public const val ABMON_4: NlItem = 36
public const val ABMON_5: NlItem = 37
public const val ABMON_6: NlItem = 38
public const val ABMON_7: NlItem = 39
public const val ABMON_8: NlItem = 40
public const val ABMON_9: NlItem = 41
public const val ABMON_10: NlItem = 42
public const val ABMON_11: NlItem = 43
public const val ABMON_12: NlItem = 44
public const val ERA: NlItem = 45
public const val ERA_D_FMT: NlItem = 46
public const val ERA_D_T_FMT: NlItem = 47
public const val ERA_T_FMT: NlItem = 48
public const val ALT_DIGITS: NlItem = 49
public const val RADIXCHAR: NlItem = 50
public const val THOUSEP: NlItem = 51
public const val YESEXPR: NlItem = 52
public const val NOEXPR: NlItem = 53
public const val YESSTR: NlItem = 54
public const val NOSTR: NlItem = 55
public const val CRNCYSTR: NlItem = 56
public const val D_MD_ORDER: NlItem = 57
public const val ALTMON_1: NlItem = 58
public const val ALTMON_2: NlItem = 59
public const val ALTMON_3: NlItem = 60
public const val ALTMON_4: NlItem = 61
public const val ALTMON_5: NlItem = 62
public const val ALTMON_6: NlItem = 63
public const val ALTMON_7: NlItem = 64
public const val ALTMON_8: NlItem = 65
public const val ALTMON_9: NlItem = 66
public const val ALTMON_10: NlItem = 67
public const val ALTMON_11: NlItem = 68
public const val ALTMON_12: NlItem = 69
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val EOF: CInt = -1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val SEEK_DATA: CInt = 3
public const val SEEK_HOLE: CInt = 4
public const val _IOFBF: CInt = 0
public const val _IONBF: CInt = 2
public const val _IOLBF: CInt = 1
public const val BUFSIZ: CUInt = 1024u
public const val FOPEN_MAX: CUInt = 20u
public const val FILENAME_MAX: CUInt = 1024u
public const val L_tmpnam: CUInt = 1024u
public const val TMP_MAX: CUInt = 308915776u
public const val O_NOCTTY: CInt = 32768
public const val O_DIRECT: CInt = 0x00010000
public const val S_IFIFO: ModeT = 4096u
public const val S_IFCHR: ModeT = 8192u
public const val S_IFBLK: ModeT = 24576u
public const val S_IFDIR: ModeT = 16384u
public const val S_IFREG: ModeT = 32768u
public const val S_IFLNK: ModeT = 40960u
public const val S_IFSOCK: ModeT = 49152u
public const val S_IFMT: ModeT = 61440u
public const val S_IEXEC: ModeT = 64u
public const val S_IWRITE: ModeT = 128u
public const val S_IREAD: ModeT = 256u
public const val S_IRWXU: ModeT = 448u
public const val S_IXUSR: ModeT = 64u
public const val S_IWUSR: ModeT = 128u
public const val S_IRUSR: ModeT = 256u
public const val S_IRWXG: ModeT = 56u
public const val S_IXGRP: ModeT = 8u
public const val S_IWGRP: ModeT = 16u
public const val S_IRGRP: ModeT = 32u
public const val S_IRWXO: ModeT = 7u
public const val S_IXOTH: ModeT = 1u
public const val S_IWOTH: ModeT = 2u
public const val S_IROTH: ModeT = 4u
public const val F_OK: CInt = 0
public const val R_OK: CInt = 4
public const val W_OK: CInt = 2
public const val X_OK: CInt = 1
public const val F_LOCK: CInt = 1
public const val F_TEST: CInt = 3
public const val F_TLOCK: CInt = 2
public const val F_ULOCK: CInt = 0
public const val F_DUPFD_CLOEXEC: CInt = 17
public const val F_DUP2FD: CInt = 10
public const val F_DUP2FD_CLOEXEC: CInt = 18
public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGABRT: CInt = 6
public const val SIGEMT: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGSEGV: CInt = 11
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val PROT_NONE: CInt = 0
public const val PROT_READ: CInt = 1
public const val PROT_WRITE: CInt = 2
public const val PROT_EXEC: CInt = 4
public const val MAP_FILE: CInt = 0x0000
public const val MAP_SHARED: CInt = 0x0001
public const val MAP_PRIVATE: CInt = 0x0002
public const val MAP_FIXED: CInt = 0x0010
public const val MAP_ANON: CInt = 0x1000
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val MCL_CURRENT: CInt = 0x0001
public const val MCL_FUTURE: CInt = 0x0002
public const val MNT_EXPUBLIC: CInt = 0x20000000
public const val MNT_NOATIME: CInt = 0x10000000
public const val MNT_NOCLUSTERR: CInt = 0x40000000
public const val MNT_NOCLUSTERW: CInt = 0x80000000.toInt()
public const val MNT_NOSYMFOLLOW: CInt = 0x00400000
public const val MNT_SOFTDEP: CInt = 0x00200000
public const val MNT_SUIDDIR: CInt = 0x00100000
public const val MNT_EXRDONLY: CInt = 0x00000080
public const val MNT_DEFEXPORTED: CInt = 0x00000200
public const val MNT_EXPORTANON: CInt = 0x00000400
public const val MNT_EXKERB: CInt = 0x00000800
public const val MNT_DELEXPORT: CInt = 0x00020000
public const val MS_SYNC: CInt = 0x0000
public const val MS_ASYNC: CInt = 0x0001
public const val MS_INVALIDATE: CInt = 0x0002
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
public const val EDEADLK: CInt = 11
public const val ENOMEM: CInt = 12
public const val EACCES: CInt = 13
public const val EFAULT: CInt = 14
public const val ENOTBLK: CInt = 15
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
public const val ETXTBSY: CInt = 26
public const val EFBIG: CInt = 27
public const val ENOSPC: CInt = 28
public const val ESPIPE: CInt = 29
public const val EROFS: CInt = 30
public const val EMLINK: CInt = 31
public const val EPIPE: CInt = 32
public const val EDOM: CInt = 33
public const val ERANGE: CInt = 34
public const val EAGAIN: CInt = 35
public const val EWOULDBLOCK: CInt = 35
public const val EINPROGRESS: CInt = 36
public const val EALREADY: CInt = 37
public const val ENOTSOCK: CInt = 38
public const val EDESTADDRREQ: CInt = 39
public const val EMSGSIZE: CInt = 40
public const val EPROTOTYPE: CInt = 41
public const val ENOPROTOOPT: CInt = 42
public const val EPROTONOSUPPORT: CInt = 43
public const val ESOCKTNOSUPPORT: CInt = 44
public const val EOPNOTSUPP: CInt = 45
public const val ENOTSUP: CInt = EOPNOTSUPP
public const val EPFNOSUPPORT: CInt = 46
public const val EAFNOSUPPORT: CInt = 47
public const val EADDRINUSE: CInt = 48
public const val EADDRNOTAVAIL: CInt = 49
public const val ENETDOWN: CInt = 50
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
public const val ELOOP: CInt = 62
public const val ENAMETOOLONG: CInt = 63
public const val EHOSTDOWN: CInt = 64
public const val EHOSTUNREACH: CInt = 65
public const val ENOTEMPTY: CInt = 66
public const val EPROCLIM: CInt = 67
public const val EUSERS: CInt = 68
public const val EDQUOT: CInt = 69
public const val ESTALE: CInt = 70
public const val EREMOTE: CInt = 71
public const val EBADRPC: CInt = 72
public const val ERPCMISMATCH: CInt = 73
public const val EPROGUNAVAIL: CInt = 74
public const val EPROGMISMATCH: CInt = 75
public const val EPROCUNAVAIL: CInt = 76
public const val ENOLCK: CInt = 77
public const val ENOSYS: CInt = 78
public const val EFTYPE: CInt = 79
public const val EAUTH: CInt = 80
public const val ENEEDAUTH: CInt = 81
public const val EIDRM: CInt = 82
public const val ENOMSG: CInt = 83
public const val EOVERFLOW: CInt = 84
public const val ECANCELED: CInt = 85
public const val EILSEQ: CInt = 86
public const val ENOATTR: CInt = 87
public const val EDOOFUS: CInt = 88
public const val EBADMSG: CInt = 89
public const val EMULTIHOP: CInt = 90
public const val ENOLINK: CInt = 91
public const val EPROTO: CInt = 92
public val POLLSTANDARD: CShort = (POLLIN.toInt() or POLLPRI.toInt() or POLLOUT.toInt() or POLLRDNORM.toInt() or POLLRDBAND.toInt() or POLLWRBAND.toInt() or POLLERR.toInt() or POLLHUP.toInt() or POLLNVAL.toInt()).toShort()
public const val AI_PASSIVE: CInt = 0x00000001
public const val AI_CANONNAME: CInt = 0x00000002
public const val AI_NUMERICHOST: CInt = 0x00000004
public const val AI_NUMERICSERV: CInt = 0x00000008
public const val AI_ALL: CInt = 0x00000100
public const val AI_ADDRCONFIG: CInt = 0x00000400
public const val AI_V4MAPPED: CInt = 0x00000800
public const val EAI_AGAIN: CInt = 2
public const val EAI_BADFLAGS: CInt = 3
public const val EAI_FAIL: CInt = 4
public const val EAI_FAMILY: CInt = 5
public const val EAI_MEMORY: CInt = 6
public const val EAI_NONAME: CInt = 8
public const val EAI_SERVICE: CInt = 9
public const val EAI_SOCKTYPE: CInt = 10
public const val EAI_SYSTEM: CInt = 11
public const val EAI_OVERFLOW: CInt = 14
public const val F_DUPFD: CInt = 0
public const val F_GETFD: CInt = 1
public const val F_SETFD: CInt = 2
public const val F_GETFL: CInt = 3
public const val F_SETFL: CInt = 4
public const val SIGTRAP: CInt = 5
public const val GLOB_APPEND: CInt = 0x0001
public const val GLOB_DOOFFS: CInt = 0x0002
public const val GLOB_ERR: CInt = 0x0004
public const val GLOB_MARK: CInt = 0x0008
public const val GLOB_NOCHECK: CInt = 0x0010
public const val GLOB_NOSORT: CInt = 0x0020
public const val GLOB_NOESCAPE: CInt = 0x2000
public const val GLOB_NOSPACE: CInt = -1
public const val GLOB_ABORTED: CInt = -2
public const val GLOB_NOMATCH: CInt = -3
public const val POSIX_MADV_NORMAL: CInt = 0
public const val POSIX_MADV_RANDOM: CInt = 1
public const val POSIX_MADV_SEQUENTIAL: CInt = 2
public const val POSIX_MADV_WILLNEED: CInt = 3
public const val POSIX_MADV_DONTNEED: CInt = 4
public const val PTHREAD_BARRIER_SERIAL_THREAD: CInt = -1
public const val PTHREAD_PROCESS_PRIVATE: CInt = 0
public const val PTHREAD_PROCESS_SHARED: CInt = 1
public const val PTHREAD_CREATE_JOINABLE: CInt = 0
public const val PTHREAD_CREATE_DETACHED: CInt = 1
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_RSS: CInt = 5
public const val RLIMIT_MEMLOCK: CInt = 6
public const val RLIMIT_NPROC: CInt = 7
public const val RLIMIT_NOFILE: CInt = 8
public const val RLIMIT_SBSIZE: CInt = 9
public const val RLIMIT_VMEM: CInt = 10
public const val RLIMIT_AS: CInt = RLIMIT_VMEM
public const val RLIM_INFINITY: RlimT = 0x7fff_ffff_ffff_ffffL
public const val RUSAGE_SELF: CInt = 0
public const val RUSAGE_CHILDREN: CInt = -1
public const val CLOCK_REALTIME: ClockidT = 0
public const val CLOCK_VIRTUAL: ClockidT = 1
public const val CLOCK_PROF: ClockidT = 2
public const val CLOCK_MONOTONIC: ClockidT = 4
public const val CLOCK_UPTIME: ClockidT = 5
public const val CLOCK_UPTIME_PRECISE: ClockidT = 7
public const val CLOCK_UPTIME_FAST: ClockidT = 8
public const val CLOCK_REALTIME_PRECISE: ClockidT = 9
public const val CLOCK_REALTIME_FAST: ClockidT = 10
public const val CLOCK_MONOTONIC_PRECISE: ClockidT = 11
public const val CLOCK_MONOTONIC_FAST: ClockidT = 12
public const val CLOCK_SECOND: ClockidT = 13
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 14
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 15
public const val MADV_NORMAL: CInt = 0
public const val MADV_RANDOM: CInt = 1
public const val MADV_SEQUENTIAL: CInt = 2
public const val MADV_WILLNEED: CInt = 3
public const val MADV_DONTNEED: CInt = 4
public const val MADV_FREE: CInt = 5
public const val MADV_NOSYNC: CInt = 6
public const val MADV_AUTOSYNC: CInt = 7
public const val MADV_NOCORE: CInt = 8
public const val MADV_CORE: CInt = 9
public const val MINCORE_INCORE: CInt = 0x1
public const val MINCORE_REFERENCED: CInt = 0x2
public const val MINCORE_MODIFIED: CInt = 0x4
public const val MINCORE_REFERENCED_OTHER: CInt = 0x8
public const val MINCORE_MODIFIED_OTHER: CInt = 0x10
public const val AF_UNSPEC: CInt = 0
public const val AF_LOCAL: CInt = 1
public const val AF_UNIX: CInt = AF_LOCAL
public const val AF_INET: CInt = 2
public const val AF_IMPLINK: CInt = 3
public const val AF_PUP: CInt = 4
public const val AF_CHAOS: CInt = 5
public const val AF_NETBIOS: CInt = 6
public const val AF_ISO: CInt = 7
public const val AF_OSI: CInt = AF_ISO
public const val AF_ECMA: CInt = 8
public const val AF_DATAKIT: CInt = 9
public const val AF_CCITT: CInt = 10
public const val AF_SNA: CInt = 11
public const val AF_DECnet: CInt = 12
public const val AF_DLI: CInt = 13
public const val AF_LAT: CInt = 14
public const val AF_HYLINK: CInt = 15
public const val AF_APPLETALK: CInt = 16
public const val AF_ROUTE: CInt = 17
public const val AF_LINK: CInt = 18
public const val pseudo_AF_XTP: CInt = 19
public const val AF_COIP: CInt = 20
public const val AF_CNT: CInt = 21
public const val pseudo_AF_RTIP: CInt = 22
public const val AF_IPX: CInt = 23
public const val AF_SIP: CInt = 24
public const val pseudo_AF_PIP: CInt = 25
public const val AF_ISDN: CInt = 26
public const val AF_E164: CInt = AF_ISDN
public const val pseudo_AF_KEY: CInt = 27
public const val AF_INET6: CInt = 28
public const val AF_NATM: CInt = 29
public const val AF_ATM: CInt = 30
public const val pseudo_AF_HDRCMPLT: CInt = 31
public const val AF_NETGRAPH: CInt = 32
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val PF_LOCAL: CInt = AF_LOCAL
public const val PF_UNIX: CInt = PF_LOCAL
public const val PF_INET: CInt = AF_INET
public const val PF_IMPLINK: CInt = AF_IMPLINK
public const val PF_PUP: CInt = AF_PUP
public const val PF_CHAOS: CInt = AF_CHAOS
public const val PF_NETBIOS: CInt = AF_NETBIOS
public const val PF_ISO: CInt = AF_ISO
public const val PF_OSI: CInt = AF_ISO
public const val PF_ECMA: CInt = AF_ECMA
public const val PF_DATAKIT: CInt = AF_DATAKIT
public const val PF_CCITT: CInt = AF_CCITT
public const val PF_SNA: CInt = AF_SNA
public const val PF_DECnet: CInt = AF_DECnet
public const val PF_DLI: CInt = AF_DLI
public const val PF_LAT: CInt = AF_LAT
public const val PF_HYLINK: CInt = AF_HYLINK
public const val PF_APPLETALK: CInt = AF_APPLETALK
public const val PF_ROUTE: CInt = AF_ROUTE
public const val PF_LINK: CInt = AF_LINK
public const val PF_XTP: CInt = pseudo_AF_XTP
public const val PF_COIP: CInt = AF_COIP
public const val PF_CNT: CInt = AF_CNT
public const val PF_SIP: CInt = AF_SIP
public const val PF_IPX: CInt = AF_IPX
public const val PF_RTIP: CInt = pseudo_AF_RTIP
public const val PF_PIP: CInt = pseudo_AF_PIP
public const val PF_ISDN: CInt = AF_ISDN
public const val PF_KEY: CInt = pseudo_AF_KEY
public const val PF_INET6: CInt = AF_INET6
public const val PF_NATM: CInt = AF_NATM
public const val PF_ATM: CInt = AF_ATM
public const val PF_NETGRAPH: CInt = AF_NETGRAPH
public const val PIOD_READ_D: CInt = 1
public const val PIOD_WRITE_D: CInt = 2
public const val PIOD_READ_I: CInt = 3
public const val PIOD_WRITE_I: CInt = 4
public const val PT_TRACE_ME: CInt = 0
public const val PT_READ_I: CInt = 1
public const val PT_READ_D: CInt = 2
public const val PT_WRITE_I: CInt = 4
public const val PT_WRITE_D: CInt = 5
public const val PT_CONTINUE: CInt = 7
public const val PT_KILL: CInt = 8
public const val PT_STEP: CInt = 9
public const val PT_ATTACH: CInt = 10
public const val PT_DETACH: CInt = 11
public const val PT_IO: CInt = 12
public const val SOMAXCONN: CInt = 128
public const val MSG_OOB: CInt = 0x00000001
public const val MSG_PEEK: CInt = 0x00000002
public const val MSG_DONTROUTE: CInt = 0x00000004
public const val MSG_EOR: CInt = 0x00000008
public const val MSG_TRUNC: CInt = 0x00000010
public const val MSG_CTRUNC: CInt = 0x00000020
public const val MSG_WAITALL: CInt = 0x00000040
public const val MSG_DONTWAIT: CInt = 0x00000080
public const val MSG_EOF: CInt = 0x00000100
public const val SCM_TIMESTAMP: CInt = 0x02
public const val SCM_CREDS: CInt = 0x03
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val SOCK_SEQPACKET: CInt = 5
public const val SOCK_CLOEXEC: CInt = 0x10000000
public const val SOCK_NONBLOCK: CInt = 0x20000000
public const val SOCK_MAXADDRLEN: CInt = 255
public const val IP_TTL: CInt = 4
public const val IP_HDRINCL: CInt = 2
public const val IP_RECVDSTADDR: CInt = 7
public const val IP_SENDSRCADDR: CInt = IP_RECVDSTADDR
public const val IP_ADD_MEMBERSHIP: CInt = 12
public const val IP_DROP_MEMBERSHIP: CInt = 13
public const val IP_RECVIF: CInt = 20
public const val IP_RECVTTL: CInt = 65
public const val IPV6_RECVHOPLIMIT: CInt = 37
public const val IPV6_JOIN_GROUP: CInt = 12
public const val IPV6_LEAVE_GROUP: CInt = 13
public const val IPV6_CHECKSUM: CInt = 26
public const val IPV6_RECVPKTINFO: CInt = 36
public const val IPV6_PKTINFO: CInt = 46
public const val IPV6_HOPLIMIT: CInt = 47
public const val IPV6_RECVTCLASS: CInt = 57
public const val IPV6_TCLASS: CInt = 61
public const val IP_ADD_SOURCE_MEMBERSHIP: CInt = 70
public const val IP_DROP_SOURCE_MEMBERSHIP: CInt = 71
public const val IP_BLOCK_SOURCE: CInt = 72
public const val IP_UNBLOCK_SOURCE: CInt = 73
public const val TCP_NOPUSH: CInt = 4
public const val TCP_NOOPT: CInt = 8
public const val TCP_KEEPIDLE: CInt = 256
public const val TCP_KEEPINTVL: CInt = 512
public const val TCP_KEEPCNT: CInt = 1024
public const val SOL_SOCKET: CInt = 0xffff
public const val SO_DEBUG: CInt = 0x01
public const val SO_ACCEPTCONN: CInt = 0x0002
public const val SO_REUSEADDR: CInt = 0x0004
public const val SO_KEEPALIVE: CInt = 0x0008
public const val SO_DONTROUTE: CInt = 0x0010
public const val SO_BROADCAST: CInt = 0x0020
public const val SO_USELOOPBACK: CInt = 0x0040
public const val SO_LINGER: CInt = 0x0080
public const val SO_OOBINLINE: CInt = 0x0100
public const val SO_REUSEPORT: CInt = 0x0200
public const val SO_TIMESTAMP: CInt = 0x0400
public const val SO_NOSIGPIPE: CInt = 0x0800
public const val SO_ACCEPTFILTER: CInt = 0x1000
public const val SO_SNDBUF: CInt = 0x1001
public const val SO_RCVBUF: CInt = 0x1002
public const val SO_SNDLOWAT: CInt = 0x1003
public const val SO_RCVLOWAT: CInt = 0x1004
public const val SO_SNDTIMEO: CInt = 0x1005
public const val SO_RCVTIMEO: CInt = 0x1006
public const val SO_ERROR: CInt = 0x1007
public const val SO_TYPE: CInt = 0x1008
public const val LOCAL_PEERCRED: CInt = 1
public const val RTF_XRESOLVE: CInt = 0x200
public const val RTF_LLINFO: CInt = 0x400
public const val RTF_PROTO3: CInt = 0x40000
public const val RTF_PINNED: CInt = 0x100000
public const val RTF_LOCAL: CInt = 0x200000
public const val RTF_BROADCAST: CInt = 0x400000
public const val RTF_MULTICAST: CInt = 0x800000
public const val RTM_LOCK: CInt = 0x8
public const val RTM_RESOLVE: CInt = 0xb
public const val RTM_NEWADDR: CInt = 0xc
public const val RTM_DELADDR: CInt = 0xd
public const val RTM_IFINFO: CInt = 0xe
public const val RTM_NEWMADDR: CInt = 0xf
public const val RTM_DELMADDR: CInt = 0x10
public const val RTM_IFANNOUNCE: CInt = 0x11
public const val RTM_IEEE80211: CInt = 0x12
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val LOCK_SH: CInt = 1
public const val LOCK_EX: CInt = 2
public const val LOCK_NB: CInt = 4
public const val LOCK_UN: CInt = 8
public const val MAP_COPY: CInt = 0x0002
public const val MAP_RENAME: CInt = 0x0020
public const val MAP_NORESERVE: CInt = 0x0040
public const val MAP_HASSEMAPHORE: CInt = 0x0200
public const val MAP_STACK: CInt = 0x0400
public const val MAP_NOSYNC: CInt = 0x0800
public const val MAP_NOCORE: CInt = 0x020000
public const val IPPROTO_RAW: CInt = 255
public const val _PC_LINK_MAX: CInt = 1
public const val _PC_MAX_CANON: CInt = 2
public const val _PC_MAX_INPUT: CInt = 3
public const val _PC_NAME_MAX: CInt = 4
public const val _PC_PATH_MAX: CInt = 5
public const val _PC_PIPE_BUF: CInt = 6
public const val _PC_CHOWN_RESTRICTED: CInt = 7
public const val _PC_NO_TRUNC: CInt = 8
public const val _PC_VDISABLE: CInt = 9
public const val _PC_ALLOC_SIZE_MIN: CInt = 10
public const val _PC_FILESIZEBITS: CInt = 12
public const val _PC_REC_INCR_XFER_SIZE: CInt = 14
public const val _PC_REC_MAX_XFER_SIZE: CInt = 15
public const val _PC_REC_MIN_XFER_SIZE: CInt = 16
public const val _PC_REC_XFER_ALIGN: CInt = 17
public const val _PC_SYMLINK_MAX: CInt = 18
public const val _PC_MIN_HOLE_SIZE: CInt = 21
public const val _PC_ASYNC_IO: CInt = 53
public const val _PC_PRIO_IO: CInt = 54
public const val _PC_SYNC_IO: CInt = 55
public const val _PC_ACL_EXTENDED: CInt = 59
public const val _PC_ACL_PATH_MAX: CInt = 60
public const val _PC_CAP_PRESENT: CInt = 61
public const val _PC_INF_PRESENT: CInt = 62
public const val _PC_MAC_PRESENT: CInt = 63
public const val _SC_ARG_MAX: CInt = 1
public const val _SC_CHILD_MAX: CInt = 2
public const val _SC_CLK_TCK: CInt = 3
public const val _SC_NGROUPS_MAX: CInt = 4
public const val _SC_OPEN_MAX: CInt = 5
public const val _SC_JOB_CONTROL: CInt = 6
public const val _SC_SAVED_IDS: CInt = 7
public const val _SC_VERSION: CInt = 8
public const val _SC_BC_BASE_MAX: CInt = 9
public const val _SC_BC_DIM_MAX: CInt = 10
public const val _SC_BC_SCALE_MAX: CInt = 11
public const val _SC_BC_STRING_MAX: CInt = 12
public const val _SC_COLL_WEIGHTS_MAX: CInt = 13
public const val _SC_EXPR_NEST_MAX: CInt = 14
public const val _SC_LINE_MAX: CInt = 15
public const val _SC_RE_DUP_MAX: CInt = 16
public const val _SC_2_VERSION: CInt = 17
public const val _SC_2_C_BIND: CInt = 18
public const val _SC_2_C_DEV: CInt = 19
public const val _SC_2_CHAR_TERM: CInt = 20
public const val _SC_2_FORT_DEV: CInt = 21
public const val _SC_2_FORT_RUN: CInt = 22
public const val _SC_2_LOCALEDEF: CInt = 23
public const val _SC_2_SW_DEV: CInt = 24
public const val _SC_2_UPE: CInt = 25
public const val _SC_STREAM_MAX: CInt = 26
public const val _SC_TZNAME_MAX: CInt = 27
public const val _SC_ASYNCHRONOUS_IO: CInt = 28
public const val _SC_MAPPED_FILES: CInt = 29
public const val _SC_MEMLOCK: CInt = 30
public const val _SC_MEMLOCK_RANGE: CInt = 31
public const val _SC_MEMORY_PROTECTION: CInt = 32
public const val _SC_MESSAGE_PASSING: CInt = 33
public const val _SC_PRIORITIZED_IO: CInt = 34
public const val _SC_PRIORITY_SCHEDULING: CInt = 35
public const val _SC_REALTIME_SIGNALS: CInt = 36
public const val _SC_SEMAPHORES: CInt = 37
public const val _SC_FSYNC: CInt = 38
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 39
public const val _SC_SYNCHRONIZED_IO: CInt = 40
public const val _SC_TIMERS: CInt = 41
public const val _SC_AIO_LISTIO_MAX: CInt = 42
public const val _SC_AIO_MAX: CInt = 43
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 44
public const val _SC_DELAYTIMER_MAX: CInt = 45
public const val _SC_MQ_OPEN_MAX: CInt = 46
public const val _SC_PAGESIZE: CInt = 47
public const val _SC_PAGE_SIZE: CInt = _SC_PAGESIZE
public const val _SC_RTSIG_MAX: CInt = 48
public const val _SC_SEM_NSEMS_MAX: CInt = 49
public const val _SC_SEM_VALUE_MAX: CInt = 50
public const val _SC_SIGQUEUE_MAX: CInt = 51
public const val _SC_TIMER_MAX: CInt = 52
public const val _SC_IOV_MAX: CInt = 56
public const val _SC_NPROCESSORS_CONF: CInt = 57
public const val _SC_2_PBS: CInt = 59
public const val _SC_2_PBS_ACCOUNTING: CInt = 60
public const val _SC_2_PBS_CHECKPOINT: CInt = 61
public const val _SC_2_PBS_LOCATE: CInt = 62
public const val _SC_2_PBS_MESSAGE: CInt = 63
public const val _SC_2_PBS_TRACK: CInt = 64
public const val _SC_ADVISORY_INFO: CInt = 65
public const val _SC_BARRIERS: CInt = 66
public const val _SC_CLOCK_SELECTION: CInt = 67
public const val _SC_CPUTIME: CInt = 68
public const val _SC_FILE_LOCKING: CInt = 69
public const val _SC_NPROCESSORS_ONLN: CInt = 58
public const val _SC_GETGR_R_SIZE_MAX: CInt = 70
public const val _SC_GETPW_R_SIZE_MAX: CInt = 71
public const val _SC_HOST_NAME_MAX: CInt = 72
public const val _SC_LOGIN_NAME_MAX: CInt = 73
public const val _SC_MONOTONIC_CLOCK: CInt = 74
public const val _SC_MQ_PRIO_MAX: CInt = 75
public const val _SC_READER_WRITER_LOCKS: CInt = 76
public const val _SC_REGEXP: CInt = 77
public const val _SC_SHELL: CInt = 78
public const val _SC_SPAWN: CInt = 79
public const val _SC_SPIN_LOCKS: CInt = 80
public const val _SC_SPORADIC_SERVER: CInt = 81
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 82
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 83
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 85
public const val _SC_THREAD_KEYS_MAX: CInt = 86
public const val _SC_THREAD_PRIO_INHERIT: CInt = 87
public const val _SC_THREAD_PRIO_PROTECT: CInt = 88
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 89
public const val _SC_THREAD_PROCESS_SHARED: CInt = 90
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 91
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 92
public const val _SC_THREAD_STACK_MIN: CInt = 93
public const val _SC_THREAD_THREADS_MAX: CInt = 94
public const val _SC_TIMEOUTS: CInt = 95
public const val _SC_THREADS: CInt = 96
public const val _SC_TRACE: CInt = 97
public const val _SC_TRACE_EVENT_FILTER: CInt = 98
public const val _SC_TRACE_INHERIT: CInt = 99
public const val _SC_TRACE_LOG: CInt = 100
public const val _SC_TTY_NAME_MAX: CInt = 101
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 102
public const val _SC_V6_ILP32_OFF32: CInt = 103
public const val _SC_V6_ILP32_OFFBIG: CInt = 104
public const val _SC_V6_LP64_OFF64: CInt = 105
public const val _SC_V6_LPBIG_OFFBIG: CInt = 106
public const val _SC_ATEXIT_MAX: CInt = 107
public const val _SC_XOPEN_CRYPT: CInt = 108
public const val _SC_XOPEN_ENH_I18N: CInt = 109
public const val _SC_XOPEN_LEGACY: CInt = 110
public const val _SC_XOPEN_REALTIME: CInt = 111
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 112
public const val _SC_XOPEN_SHM: CInt = 113
public const val _SC_XOPEN_STREAMS: CInt = 114
public const val _SC_XOPEN_UNIX: CInt = 115
public const val _SC_XOPEN_VERSION: CInt = 116
public const val _SC_XOPEN_XCU_VERSION: CInt = 117
public const val _SC_IPV6: CInt = 118
public const val _SC_RAW_SOCKETS: CInt = 119
public const val _SC_SYMLOOP_MAX: CInt = 120
public const val _SC_PHYS_PAGES: CInt = 121
public const val _CS_PATH: CInt = 1

// PTHREAD_MUTEX_INITIALIZER: FFI boundary initializer — zero-valued struct, not representable in Kotlin
// PTHREAD_COND_INITIALIZER: FFI boundary initializer — zero-valued struct, not representable in Kotlin
// PTHREAD_RWLOCK_INITIALIZER: FFI boundary initializer — zero-valued struct, not representable in Kotlin
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 1
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 2
public const val PTHREAD_MUTEX_NORMAL: CInt = 3
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_ERRORCHECK
public const val SCHED_FIFO: CInt = 1
public const val SCHED_OTHER: CInt = 2
public const val SCHED_RR: CInt = 3
public const val FD_SETSIZE: ULong = 1024uL
public const val ST_NOSUID: CULong = 2uL
public const val NI_MAXHOST: ULong = 1025uL
public const val XUCRED_VERSION: CUInt = 0u
public const val RTLD_LOCAL: CInt = 0
public const val RTLD_NODELETE: CInt = 0x1000
public const val RTLD_NOLOAD: CInt = 0x2000
public const val RTLD_GLOBAL: CInt = 0x100
public val LOG_NTP: CInt = 12 shl 3
public val LOG_SECURITY: CInt = 13 shl 3
public val LOG_CONSOLE: CInt = 14 shl 3
public const val LOG_NFACILITIES: CInt = 24
public const val TIOCEXCL: CULong = 0x2000740duL
public const val TIOCNXCL: CULong = 0x2000740euL
public const val TIOCFLUSH: CULong = 0x80047410uL
public const val TIOCGETA: CULong = 0x402c7413uL
public const val TIOCSETA: CULong = 0x802c7414uL
public const val TIOCSETAW: CULong = 0x802c7415uL
public const val TIOCSETAF: CULong = 0x802c7416uL
public const val TIOCGETD: CULong = 0x4004741auL
public const val TIOCSETD: CULong = 0x8004741buL
public const val TIOCGDRAINWAIT: CULong = 0x40047456uL
public const val TIOCSDRAINWAIT: CULong = 0x80047457uL
public const val TIOCMGDTRWAIT: CULong = 0x4004745auL
public const val TIOCMSDTRWAIT: CULong = 0x8004745buL
public const val TIOCDRAIN: CULong = 0x2000745euL
public const val TIOCEXT: CULong = 0x80047460uL
public const val TIOCSCTTY: CULong = 0x20007461uL
public const val TIOCCONS: CULong = 0x80047462uL
public const val TIOCGSID: CULong = 0x40047463uL
public const val TIOCSTAT: CULong = 0x20007465uL
public const val TIOCUCNTL: CULong = 0x80047466uL
public const val TIOCSWINSZ: CULong = 0x80087467uL
public const val TIOCGWINSZ: CULong = 0x40087468uL
public const val TIOCMGET: CULong = 0x4004746auL
public const val TIOCM_LE: CInt = 0x1
public const val TIOCM_DTR: CInt = 0x2
public const val TIOCM_RTS: CInt = 0x4
public const val TIOCM_ST: CInt = 0x8
public const val TIOCM_SR: CInt = 0x10
public const val TIOCM_CTS: CInt = 0x20
public const val TIOCM_RI: CInt = 0x80
public const val TIOCM_DSR: CInt = 0x100
public const val TIOCM_CD: CInt = 0x40
public const val TIOCM_CAR: CInt = 0x40
public const val TIOCM_RNG: CInt = 0x80
public const val TIOCMBIC: CULong = 0x8004746buL
public const val TIOCMBIS: CULong = 0x8004746cuL
public const val TIOCMSET: CULong = 0x8004746duL
public const val TIOCSTART: CULong = 0x2000746euL
public const val TIOCSTOP: CULong = 0x2000746fuL
public const val TIOCPKT: CULong = 0x80047470uL
public const val TIOCPKT_DATA: CInt = 0x0
public const val TIOCPKT_FLUSHREAD: CInt = 0x1
public const val TIOCPKT_FLUSHWRITE: CInt = 0x2
public const val TIOCPKT_STOP: CInt = 0x4
public const val TIOCPKT_START: CInt = 0x8
public const val TIOCPKT_NOSTOP: CInt = 0x10
public const val TIOCPKT_DOSTOP: CInt = 0x20
public const val TIOCPKT_IOCTL: CInt = 0x40
public const val TIOCNOTTY: CULong = 0x20007471uL
public const val TIOCSTI: CULong = 0x80017472uL
public const val TIOCOUTQ: CULong = 0x40047473uL
public const val TIOCSPGRP: CULong = 0x80047476uL
public const val TIOCGPGRP: CULong = 0x40047477uL
public const val TIOCCDTR: CULong = 0x20007478uL
public const val TIOCSDTR: CULong = 0x20007479uL
public const val TTYDISC: CInt = 0x0
public const val SLIPDISC: CInt = 0x4
public const val PPPDISC: CInt = 0x5
public const val NETGRAPHDISC: CInt = 0x6
public const val BIOCGRSIG: CULong = 0x40044272uL
public const val BIOCSRSIG: CULong = 0x80044273uL
public const val BIOCSDLT: CULong = 0x80044278uL
public const val BIOCGSEESENT: CULong = 0x40044276uL
public const val BIOCSSEESENT: CULong = 0x80044277uL
public const val BIOCGDLTLIST: CULong = 0xc0104279uL
public const val BIOCSETF: CULong = 0x80104267uL
public const val FIODTYPE: CULong = 0x4004667auL
public const val FIOGETLBA: CULong = 0x40046679uL
public const val B0: SpeedT = 0u
public const val B50: SpeedT = 50u
public const val B75: SpeedT = 75u
public const val B110: SpeedT = 110u
public const val B134: SpeedT = 134u
public const val B150: SpeedT = 150u
public const val B200: SpeedT = 200u
public const val B300: SpeedT = 300u
public const val B600: SpeedT = 600u
public const val B1200: SpeedT = 1200u
public const val B1800: SpeedT = 1800u
public const val B2400: SpeedT = 2400u
public const val B4800: SpeedT = 4800u
public const val B9600: SpeedT = 9600u
public const val B19200: SpeedT = 19200u
public const val B38400: SpeedT = 38400u
public const val B7200: SpeedT = 7200u
public const val B14400: SpeedT = 14400u
public const val B28800: SpeedT = 28800u
public const val B57600: SpeedT = 57600u
public const val B76800: SpeedT = 76800u
public const val B115200: SpeedT = 115200u
public const val B230400: SpeedT = 230400u
public const val EXTA: SpeedT = 19200u
public const val EXTB: SpeedT = 38400u
public const val CRTSCTS: TcflagT = 0x00030000u
public const val CCTS_OFLOW: TcflagT = 0x00010000u
public const val CRTS_IFLOW: TcflagT = 0x00020000u
public const val CDTR_IFLOW: TcflagT = 0x00040000u
public const val CDSR_OFLOW: TcflagT = 0x00080000u
public const val CCAR_OFLOW: TcflagT = 0x00100000u
public const val VERASE2: ULong = 7uL
public const val OCRNL: TcflagT = 0x10u
public const val ONOCR: TcflagT = 0x20u
public const val ONLRET: TcflagT = 0x40u
public const val CMGROUP_MAX: ULong = 16uL
public const val EUI64_LEN: ULong = 8uL
public const val SIZEOF_LONG: ULong = 8uL
public const val BPF_ALIGNMENT: ULong = SIZEOF_LONG
public val RTP_PRIO_MIN: CUShort = (0).toUShort()
public val RTP_PRIO_MAX: CUShort = (31).toUShort()
public const val RTP_LOOKUP: CInt = 0
public const val RTP_SET: CInt = 1
public const val UF_SETTABLE: CULong = 0x0000ffffuL
public const val UF_NODUMP: CULong = 0x00000001uL
public const val UF_IMMUTABLE: CULong = 0x00000002uL
public const val UF_APPEND: CULong = 0x00000004uL
public const val UF_OPAQUE: CULong = 0x00000008uL
public const val UF_NOUNLINK: CULong = 0x00000010uL
public const val SF_SETTABLE: CULong = 0xffff0000uL
public const val SF_ARCHIVED: CULong = 0x00010000uL
public const val SF_IMMUTABLE: CULong = 0x00020000uL
public const val SF_APPEND: CULong = 0x00040000uL
public const val SF_NOUNLINK: CULong = 0x00100000uL
public const val TIMER_ABSTIME: CInt = 1
public const val NTP_API: CInt = 4
public const val MAXPHASE: CLong = 500000000
public const val MAXFREQ: CLong = 500000
public const val MINSEC: CInt = 256
public const val MAXSEC: CInt = 2048
public const val NANOSECOND: CLong = 1000000000
public const val SCALE_PPM: CInt = 65
public const val MAXTC: CInt = 10
public const val MOD_OFFSET: CUInt = 0x0001u
public const val MOD_FREQUENCY: CUInt = 0x0002u
public const val MOD_MAXERROR: CUInt = 0x0004u
public const val MOD_ESTERROR: CUInt = 0x0008u
public const val MOD_STATUS: CUInt = 0x0010u
public const val MOD_TIMECONST: CUInt = 0x0020u
public const val MOD_PPSMAX: CUInt = 0x0040u
public const val MOD_TAI: CUInt = 0x0080u
public const val MOD_MICRO: CUInt = 0x1000u
public const val MOD_NANO: CUInt = 0x2000u
public const val MOD_CLKB: CUInt = 0x4000u
public const val MOD_CLKA: CUInt = 0x8000u
public const val STA_PLL: CInt = 0x0001
public const val STA_PPSFREQ: CInt = 0x0002
public const val STA_PPSTIME: CInt = 0x0004
public const val STA_FLL: CInt = 0x0008
public const val STA_INS: CInt = 0x0010
public const val STA_DEL: CInt = 0x0020
public const val STA_UNSYNC: CInt = 0x0040
public const val STA_FREQHOLD: CInt = 0x0080
public const val STA_PPSSIGNAL: CInt = 0x0100
public const val STA_PPSJITTER: CInt = 0x0200
public const val STA_PPSWANDER: CInt = 0x0400
public const val STA_PPSERROR: CInt = 0x0800
public const val STA_CLOCKERR: CInt = 0x1000
public const val STA_NANO: CInt = 0x2000
public const val STA_MODE: CInt = 0x4000
public const val STA_CLK: CInt = 0x8000
public val STA_RONLY: CInt = STA_PPSSIGNAL or STA_PPSJITTER or STA_PPSWANDER or STA_PPSERROR or STA_CLOCKERR or STA_NANO or STA_MODE or STA_CLK
public const val TIME_OK: CInt = 0
public const val TIME_INS: CInt = 1
public const val TIME_DEL: CInt = 2
public const val TIME_OOP: CInt = 3
public const val TIME_WAIT: CInt = 4
public const val TIME_ERROR: CInt = 5
public const val REG_ENOSYS: CInt = -1
public const val REG_ILLSEQ: CInt = 17
public const val IPC_PRIVATE: KeyT = 0
public const val IPC_CREAT: CInt = 512
public const val IPC_EXCL: CInt = 1024
public const val IPC_NOWAIT: CInt = 2048
public const val IPC_RMID: CInt = 0
public const val IPC_SET: CInt = 1
public const val IPC_STAT: CInt = 2
public const val IPC_R: CInt = 256
public const val IPC_W: CInt = 128
public const val IPC_M: CInt = 4096
public const val SHM_RDONLY: CInt = 4096
public const val SHM_RND: CInt = 8192
public const val SHM_R: CInt = 256
public const val SHM_W: CInt = 128
public const val KENV_GET: CInt = 0
public const val KENV_SET: CInt = 1
public const val KENV_UNSET: CInt = 2
public const val KENV_DUMP: CInt = 3
public const val KENV_MNAMELEN: CInt = 128
public const val KENV_MVALLEN: CInt = 128
public const val RB_ASKNAME: CInt = 0x001
public const val RB_SINGLE: CInt = 0x002
public const val RB_NOSYNC: CInt = 0x004
public const val RB_HALT: CInt = 0x008
public const val RB_INITNAME: CInt = 0x010
public const val RB_DFLTROOT: CInt = 0x020
public const val RB_KDB: CInt = 0x040
public const val RB_RDONLY: CInt = 0x080
public const val RB_DUMP: CInt = 0x100
public const val RB_MINIROOT: CInt = 0x200
public const val RB_VERBOSE: CInt = 0x800
public const val RB_SERIAL: CInt = 0x1000
public const val RB_CDROM: CInt = 0x2000
public const val RB_POWEROFF: CInt = 0x4000
public const val RB_GDB: CInt = 0x8000
public const val RB_MUTE: CInt = 0x10000
public const val RB_SELFTEST: CInt = 0x20000
public const val GRND_NONBLOCK: CUInt = 0x1u
public const val GRND_RANDOM: CUInt = 0x2u
public const val GRND_INSECURE: CUInt = 0x4u
public const val POSIX_SPAWN_RESETIDS: CInt = 0x01
public const val POSIX_SPAWN_SETPGROUP: CInt = 0x02
public const val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x04
public const val POSIX_SPAWN_SETSCHEDULER: CInt = 0x08
public const val POSIX_SPAWN_SETSIGDEF: CInt = 0x10
public const val POSIX_SPAWN_SETSIGMASK: CInt = 0x20

public fun semDestroy(sem: SemT): CInt = -1

public fun semInit(sem: SemT, pshared: CInt, value: CUInt): CInt = -1

public fun daemon(nochdir: CInt, noclose: CInt): CInt = -1

public fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt = -1

public fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt = -1

public fun chflags(path: String?, flags: CULong): CInt = -1

public fun chflagsat(fd: CInt, path: String?, flags: CULong, atflag: CInt): CInt = -1

public fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt = -1

public fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt = -1

public fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt = -1

public fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt = -1

public fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt = -1

public fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt = -1

public fun dirfd(dirp: DIR?): CInt = -1

public fun duplocale(base: LocaleT): LocaleT = null

public fun endutxent() { }

public fun fchflags(fd: CInt, flags: CULong): CInt = -1

public fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt = -1

public fun futimens(fd: CInt, times: Timespec?): CInt = -1

public fun getdomainname(name: String?, len: CInt): CInt = -1

public fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt = -1

public fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt = -1

public fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt = -1

public fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt = -1

public fun getpriority(which: CInt, who: CInt): CInt = -1

public fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt = -1

public fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt = -1

public fun getutxent(): Utmpx? = null

public fun getutxid(ut: Utmpx?): Utmpx? = null

public fun getutxline(ut: Utmpx?): Utmpx? = null

public fun initgroups(name: String?, basegid: GidT): CInt = -1

public fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt = -1

public fun lchflags(path: String?, flags: CULong): CInt = -1

public fun lutimes(file: String?, times: Timeval?): CInt = -1

public fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? = null

public fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt = -1

public fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt = -1

public fun mallocUsableSize(ptr: COpaquePointer?): ULong = 0uL

public fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): CInt = -1

public fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT = null

public fun nlLanginfoL(item: NlItem, locale: LocaleT): String? = null

public fun pipe2(fds: CInt?, flags: CInt): CInt = -1

public fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt = -1

public fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt = -1

public fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt = -1

public fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT = -1L

public fun pthreadAttrGetNp(tid: PthreadT, attr: PthreadAttrT): CInt = -1

public fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt = -1

public fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt = -1

public fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt = -1

public fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt = -1

public fun pthreadCondattrGetpshared(attr: PthreadCondattrT, pshared: CInt?): CInt = -1

public fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt = -1

public fun pthreadCondattrSetpshared(attr: PthreadCondattrT, pshared: CInt): CInt = -1

public fun pthreadMainNp(): CInt = -1

public fun pthreadMutexTimedlock(lock: PthreadMutexT, abstime: Timespec?): CInt = -1

public fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT, pshared: CInt?): CInt = -1

public fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT, pshared: CInt): CInt = -1

public fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT, `val`: CInt?): CInt = -1

public fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT, `val`: CInt): CInt = -1

public fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): CInt = -1

public fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): CInt = -1

public fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT, shared: CInt?): CInt = -1

public fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT, shared: CInt): CInt = -1

public fun pthreadBarrierInit(barrier: PthreadBarrierT, attr: PthreadBarrierattrT, count: CUInt): CInt = -1

public fun pthreadBarrierDestroy(barrier: PthreadBarrierT): CInt = -1

public fun pthreadBarrierWait(barrier: PthreadBarrierT): CInt = -1

public fun pthreadGetNameNp(tid: PthreadT, name: String?, len: ULong) { }

public fun pthreadSetNameNp(tid: PthreadT, name: String?) { }

public fun pthreadGetnameNp(thread: PthreadT, buffer: String?, length: ULong): CInt = -1

public fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt = -1

public fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt = -1

public fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt = -1

public fun ptrace(request: CInt, pid: PidT, addr: String?, data: CInt): CInt = -1

public fun utrace(addr: COpaquePointer?, len: ULong): CInt = -1

public fun pututxline(ut: Utmpx?): Utmpx? = null

public fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT = -1L

public fun querylocale(mask: CInt, loc: LocaleT): String? = null

public fun rtprio(function: CInt, pid: PidT, rtp: Rtprio?): CInt = -1

public fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt = -1

public fun schedGetparam(pid: PidT, param: SchedParam?): CInt = -1

public fun schedSetparam(pid: PidT, param: SchedParam?): CInt = -1

public fun schedGetscheduler(pid: PidT): CInt = -1

public fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt = -1

public fun semGetvalue(sem: SemT, sval: CInt?): CInt = -1

public fun semTimedwait(sem: SemT, abstime: Timespec?): CInt = -1

public fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: ULong, hdtr: SfHdtr?, sbytes: OffT?, flags: CInt): CInt = -1

public fun setdomainname(name: String?, len: CInt): CInt = -1

public fun sethostname(name: String?, len: CInt): CInt = -1

public fun setpriority(which: CInt, who: CInt, prio: CInt): CInt = -1

public fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt = -1

public fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt = -1

public fun settimeofday(tv: Timeval?, tz: Timezone?): CInt = -1

public fun setutxent() { }

public fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt = -1

public fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt = -1

public fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt = -1

public fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt = -1

public fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt = -1

public fun sysctlnametomib(name: String?, mibp: CInt?, sizep: ULong?): CInt = -1

public fun uselocale(loc: LocaleT): LocaleT = null

public fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt = -1

public fun ntpAdjtime(buf: Timex?): CInt = -1

public fun ntpGettime(buf: Ntptimeval?): CInt = -1

public fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt = -1

public fun iconvOpen(tocode: String?, fromcode: String?): IconvT = throw UnsupportedOperationException("Not implemented on this platform")

public fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong = 0uL

public fun iconvClose(cd: IconvT): CInt = -1

public fun explicitBzero(s: COpaquePointer?, len: ULong) { }

public fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt = -1

public fun gethostid(): CLong = -1L

public fun sethostid(hostid: CLong) { }

public fun eui64Aton(a: String?, e: Eui64?): CInt = -1

public fun eui64Ntoa(id: Eui64?, a: String?, len: ULong): CInt = -1

public fun eui64Ntohost(hostname: String?, len: ULong, id: Eui64?): CInt = -1

public fun eui64Hostton(hostname: String?, id: Eui64?): CInt = -1

public fun eaccess(path: String?, mode: CInt): CInt = -1

public fun kenv(action: CInt, name: String?, value: String?, len: CInt): CInt = -1

public fun reboot(howto: CInt): CInt = -1

public fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt = -1

public fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt = -1

public fun mkostemp(template: String?, flags: CInt): CInt = -1

public fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt = -1

public fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt = -1

public fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt = -1

public fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt = -1

public fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt = -1

public fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt = -1

public fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt = -1

public fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt = -1

public fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt = -1

public fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt = -1

public fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt = -1

public fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, flags: PidT?): CInt = -1

public fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, flags: PidT): CInt = -1

public fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT, flags: CInt?): CInt = -1

public fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT, flags: CInt): CInt = -1

public fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt = -1

public fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt = -1

public fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt = -1

public fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt = -1

public fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt = -1

public fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt = -1

public fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt = -1

public fun mqClose(mqd: MqdT): CInt = -1

public fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt = -1

public fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt = -1

public fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT = -1

public fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT = -1L

public fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt = -1

public fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt = -1

public fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT = -1L

public fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt = -1

public fun mqUnlink(name: String?): CInt = -1

public fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT = -1L

public fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt = -1

public fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt = -1

public fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT = -1

public fun loginTty(fd: CInt): CInt = -1

public fun fparseln(stream: FILE?, len: ULong?, lineno: ULong?, delim: String?, flags: CInt): String? = null

public fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong = 0uL

public fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? = null

public fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: CInt): CInt = -1

public fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): KvmT = null

public fun kvmClose(kd: KvmT): CInt = -1

public fun kvmGetprocs(kd: KvmT, op: CInt, arg: CInt, cnt: CInt?): KinfoProc? = null

public fun kvmGetloadavg(kd: KvmT, loadavg: CDouble?, nelem: CInt): CInt = -1

public fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: String?): KvmT = null

public fun kvmRead(kd: KvmT, addr: CULong, buf: COpaquePointer?, nbytes: ULong): SsizeT = -1L

public fun kvmWrite(kd: KvmT, addr: CULong, buf: COpaquePointer?, nbytes: ULong): SsizeT = -1L
