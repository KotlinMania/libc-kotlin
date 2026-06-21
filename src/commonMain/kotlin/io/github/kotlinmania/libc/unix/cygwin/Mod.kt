// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias WcharT = CUShort
public typealias BlkcntT = Long
public typealias BlksizeT = Int
public typealias DevT = UInt
public typealias FsblkcntT = CULong
public typealias FsfilcntT = CULong
public typealias InoT = ULong
public typealias KeyT = CLongLong
public typealias SaFamilyT = UShort
public typealias SocklenT = CInt
public typealias OffT = CLong
public typealias IdT = UInt
public typealias ModeT = UInt
public typealias Off64T = CLongLong
public typealias LoffT = Off64T
public typealias IconvT = COpaquePointer?
public typealias ClockT = CULong
public typealias TimeT = CLong
public typealias ClockidT = CULong
public typealias TimerT = CULong
public typealias NlItem = CInt
public typealias NlinkT = CUShort
public typealias SusecondsT = CLong
public typealias UsecondsT = CULong
public typealias SigsetT = CULong
public typealias FdMask = CULong
public typealias PthreadT = COpaquePointer?
public typealias PthreadMutexT = COpaquePointer?
public typealias PthreadKeyT = ULong
public typealias PthreadAttrT = COpaquePointer?
public typealias PthreadMutexattrT = COpaquePointer?
public typealias PthreadCondattrT = COpaquePointer?
public typealias PthreadCondT = COpaquePointer?
public typealias PthreadBarrierattrT = ULong
public typealias PthreadBarrierT = ULong
public typealias PthreadSpinlockT = ULong
public typealias PthreadRwlockT = COpaquePointer?
public typealias PthreadRwlockattrT = COpaquePointer?
public typealias RegisterT = IntptrT
public typealias UChar = CUChar
public typealias UShort = CUShort
public typealias ULong = CULong
public typealias UInt = CUInt
public typealias CaddrT = String?
public typealias VmSizeT = CULong
public typealias RlimT = CULong
public typealias NfdsT = CUInt
public typealias SemT = Sem?
public typealias TcflagT = CUInt
public typealias SpeedT = CUInt
public typealias VmOffsetT = CULong
public typealias PosixSpawnFileActionsT = COpaquePointer?
public typealias PosixSpawnattrT = COpaquePointer?

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)

public data class CpuSetT(
    val bits: ULongArray,
)

public data class Sigaction(
    val saSigaction: SighandlerT,
    val saMask: SigsetT,
    val saFlags: CInt,
)

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: CInt,
    val ssSize: ULong,
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

public data class Bintime(
    val sec: TimeT,
    val frac: ULong,
)

public data class Passwd(
    val pwName: String?,
    val pwPasswd: String?,
    val pwUid: UidT,
    val pwGid: GidT,
    val pwComment: String?,
    val pwGecos: String?,
    val pwDir: String?,
    val pwShell: String?,
)

public data class IfNameindex(
    val ifIndex: CUInt,
    val ifName: String?,
)

public data class Ucred(
    val pid: PidT,
    val uid: UidT,
    val gid: GidT,
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
    val cmsgLen: ULong,
    val cmsgLevel: CInt,
    val cmsgType: CInt,
)

public data class DlInfo(
    val dliFname: ByteArray,
    val dliFbase: COpaquePointer?,
    val dliSname: String?,
    val dliSaddr: COpaquePointer?,
)

public data class In6Pktinfo(
    val ipi6Addr: In6Addr,
    val ipi6Ifindex: UInt,
)

public data class SockaddrIn6(
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class IpMreqSource(
    val imrMultiaddr: InAddr,
    val imrSourceaddr: InAddr,
    val imrInterface: InAddr,
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
    val intNCsPrecedes: CChar,
    val intNSepBySpace: CChar,
    val intNSignPosn: CChar,
    val intPCsPrecedes: CChar,
    val intPSepBySpace: CChar,
    val intPSignPosn: CChar,
)

public data class Termios(
    val cIflag: TcflagT,
    val cOflag: TcflagT,
    val cCflag: TcflagT,
    val cLflag: TcflagT,
    val cLine: CChar,
    val cCc: List<CcT>,
    val cIspeed: SpeedT,
    val cOspeed: SpeedT,
)

public data class SchedParam(
    val schedPriority: CInt,
)

public data class Flock(
    val lType: CShort,
    val lWhence: CShort,
    val lStart: OffT,
    val lLen: OffT,
    val lPid: PidT,
)

public data class Hostent(
    val hName: String?,
    val hAliases: COpaquePointer?,
    val hAddrtype: CShort,
    val hLength: CShort,
    val hAddrList: COpaquePointer?,
)

public data class Linger(
    val lOnoff: CUShort,
    val lLinger: CUShort,
)

public data class FdSet(
    val fdsBits: List<FdMask>,
)

public data class UcFpxreg(
    val significand: UShortArray,
    val exponent: UShort,
)

public data class UcXmmreg(
    val element: UIntArray,
)

public data class Fpstate(
    val cwd: UShort,
    val swd: UShort,
    val ftw: UShort,
    val fop: UShort,
    val rip: ULong,
    val rdp: ULong,
    val mxcsr: UInt,
    val mxcrMask: UInt,
    val st: List<UcFpxreg>,
    val xmm: List<UcXmmreg>,
)

public data class McontextT(
    val p1home: ULong,
    val p2home: ULong,
    val p3home: ULong,
    val p4home: ULong,
    val p5home: ULong,
    val p6home: ULong,
    val ctxflags: UInt,
    val mxcsr: UInt,
    val cs: UShort,
    val ds: UShort,
    val es: UShort,
    val fs: UShort,
    val gs: UShort,
    val ss: UShort,
    val eflags: UInt,
    val dr0: ULong,
    val dr1: ULong,
    val dr2: ULong,
    val dr3: ULong,
    val dr6: ULong,
    val dr7: ULong,
    val rax: ULong,
    val rcx: ULong,
    val rdx: ULong,
    val rbx: ULong,
    val rsp: ULong,
    val rbp: ULong,
    val rsi: ULong,
    val rdi: ULong,
    val r8: ULong,
    val r9: ULong,
    val r10: ULong,
    val r11: ULong,
    val r12: ULong,
    val r13: ULong,
    val r14: ULong,
    val r15: ULong,
    val rip: ULong,
    val fpregs: Fpstate,
    val vregs: ULongArray,
    val vcx: ULong,
    val dbc: ULong,
    val btr: ULong,
    val bfr: ULong,
    val etr: ULong,
    val efr: ULong,
    val oldmask: ULong,
    val cr2: ULong,
)

public data class Sigevent(
    val sigevValue: Sigval,
    val sigevSigno: CInt,
    val sigevNotify: CInt,
    val sigevNotifyFunction: ((Sigval) -> Unit)?,
    val sigevNotifyAttributes: PthreadAttrT?,
)

public data class UcontextT(
    val ucMcontext: McontextT,
    val ucLink: UcontextT?,
    val ucSigmask: SigsetT,
    val ucStack: StackT,
    val ucFlags: CULong,
)

public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrStorage(
    val ssFamily: SaFamilyT,
    val ssAlign: Long,
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
    val stAtime: TimeT,
    val stAtimeNsec: CLong,
    val stMtime: TimeT,
    val stMtimeNsec: CLong,
    val stCtime: TimeT,
    val stCtimeNsec: CLong,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stBirthtime: TimeT,
    val stBirthtimeNsec: CLong,
)

public data class InAddr(
    val sAddr: InAddrT,
)

public data class IpMreq(
    val imrMultiaddr: InAddr,
    val imrInterface: InAddr,
)

public data class InPktinfo(
    val ipiAddr: InAddr,
    val ipiIfindex: UInt,
)

public data class SockaddrIn(
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)

public data class Statvfs(
    val fBsize: CULong,
    val fFrsize: CULong,
    val fBlocks: FsblkcntT,
    val fBfree: FsblkcntT,
    val fBavail: FsblkcntT,
    val fFiles: FsfilcntT,
    val fFfree: FsfilcntT,
    val fFavail: FsfilcntT,
    val fFsid: CULong,
    val fFlag: CULong,
    val fNamemax: CULong,
)

public data class Statfs(
    val fType: CLong,
    val fBsize: CLong,
    val fBlocks: CLong,
    val fBfree: CLong,
    val fBavail: CLong,
    val fFiles: CLong,
    val fFfree: CLong,
    val fFsid: CLong,
    val fNamelen: CLong,
    val fSpare: LongArray,
)

public data class SockaddrUn(
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class Utsname(
    val sysname: ByteArray,
    val nodename: ByteArray,
    val release: ByteArray,
    val version: ByteArray,
    val machine: ByteArray,
    val domainname: ByteArray,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siPid: PidT,
    val siUid: UidT,
    val siErrno: CInt,
)

public data class Dirent(
    val dVersion: UInt,
    val dIno: InoT,
    val dType: CUChar,
    val dInternal1: UInt,
    val dName: ByteArray,
)

public data class MaxAlignT(
    val priv: List<Double>,
)

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: CAnonymousIfrIfru,
)

public data class Ifconf(
    val ifcLen: CInt,
    val ifcIfcu: CAnonymousIfcIfcu,
)

public data class Utmpx(
    val utType: CShort,
    val utPid: PidT,
    val utLine: ByteArray,
    val utId: ByteArray,
    val utTime: TimeT,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utAddr: CLong,
    val utTv: Timeval,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfrIfru(
    val ifruAddr: Sockaddr = null,
    val ifruBroadaddr: Sockaddr = null,
    val ifruDstaddr: Sockaddr = null,
    val ifruNetmask: Sockaddr = null,
    val ifruHwaddr: Sockaddr = null,
    val ifruFlags: CInt = null,
    val ifruMetric: CInt = null,
    val ifruMtu: CInt = null,
    val ifruIfindex: CInt = null,
    val ifruData: String? = null,
)

// C union; only one variant is valid at a time.
public data class CAnonymousIfcIfcu(
    val ifcuBuf: CaddrT = null,
    val ifcuReq: Ifreq? = null,
)

public const val FD_SETSIZE: ULong = 1024uL
public const val CPU_SETSIZE: CInt = 0x400
public const val BUS_ADRALN: CInt = 25
public const val BUS_ADRERR: CInt = 26
public const val BUS_OBJERR: CInt = 27
public const val CLD_EXITED: CInt = 28
public const val CLD_KILLED: CInt = 29
public const val CLD_DUMPED: CInt = 30
public const val CLD_TRAPPED: CInt = 31
public const val CLD_STOPPED: CInt = 32
public const val CLD_CONTINUED: CInt = 33
public const val SIGEV_SIGNAL: CInt = 0
public const val SIGEV_NONE: CInt = 1
public const val SIGEV_THREAD: CInt = 2
public const val SA_NOCLDSTOP: CInt = 0x00000001
public const val SA_NOCLDWAIT: CInt = 0
public const val SA_SIGINFO: CInt = 0x00000002
public const val SA_RESTART: CInt = 0x10000000
public const val SA_ONSTACK: CInt = 0x20000000
public const val SA_NODEFER: CInt = 0x40000000
public const val SA_RESETHAND: CInt = 0x80000000
public const val MINSIGSTKSZ: ULong = 8192uL
public const val SIGSTKSZ: ULong = 32768uL
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
public const val SIGSYS: CInt = 12
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val SIGURG: CInt = 16
public const val SIGSTOP: CInt = 17
public const val SIGTSTP: CInt = 18
public const val SIGCONT: CInt = 19
public const val SIGCHLD: CInt = 20
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGIO: CInt = 23
public const val SIGPOLL: CInt = 23
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
public const val SIGPWR: CInt = 29
public const val SIGUSR1: CInt = 30
public const val SIGUSR2: CInt = 31
public const val SS_ONSTACK: CInt = 0x1
public const val SS_DISABLE: CInt = 0x2
public const val SIG_SETMASK: CInt = 0
public const val SIG_BLOCK: CInt = 1
public const val SIG_UNBLOCK: CInt = 2
public const val TIMER_ABSTIME: CInt = 4
public const val CLOCK_REALTIME_COARSE: ClockidT = 0
public const val CLOCK_REALTIME: ClockidT = 1
public const val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2
public const val CLOCK_THREAD_CPUTIME_ID: ClockidT = 3
public const val CLOCK_MONOTONIC: ClockidT = 4
public const val CLOCK_MONOTONIC_RAW: ClockidT = 5
public const val CLOCK_MONOTONIC_COARSE: ClockidT = 6
public const val CLOCK_BOOTTIME: ClockidT = 7
public const val CLOCK_REALTIME_ALARM: ClockidT = 8
public const val CLOCK_BOOTTIME_ALARM: ClockidT = 9
public const val ITIMER_REAL: CInt = 0
public const val ITIMER_VIRTUAL: CInt = 1
public const val ITIMER_PROF: CInt = 2
public const val PRIO_PROCESS: CInt = 0
public const val PRIO_PGRP: CInt = 1
public const val PRIO_USER: CInt = 2
public const val RLIMIT_CPU: CInt = 0
public const val RLIMIT_FSIZE: CInt = 1
public const val RLIMIT_DATA: CInt = 2
public const val RLIMIT_STACK: CInt = 3
public const val RLIMIT_CORE: CInt = 4
public const val RLIMIT_NOFILE: CInt = 5
public const val RLIMIT_AS: CInt = 6
public const val RLIM_NLIMITS: CInt = 7
public const val RLIMIT_NLIMITS: CInt = RLIM_NLIMITS
public val RLIM_INFINITY: RlimT = 0.inv()
public const val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY
public const val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY
public const val RUSAGE_SELF: CInt = 0
public const val RUSAGE_CHILDREN: CInt = -1
public const val IFF_UP: CInt = 0x1
public const val IFF_BROADCAST: CInt = 0x2
public const val IFF_LOOPBACK: CInt = 0x8
public const val IFF_POINTOPOINT: CInt = 0x10
public const val IFF_NOTRAILERS: CInt = 0x20
public const val IFF_RUNNING: CInt = 0x40
public const val IFF_NOARP: CInt = 0x80
public const val IFF_PROMISC: CInt = 0x100
public const val IFF_MULTICAST: CInt = 0x1000
public const val IFF_LOWER_UP: CInt = 0x10000
public const val IFF_DORMANT: CInt = 0x20000
public const val IF_NAMESIZE: ULong = 44uL
public const val IFNAMSIZ: ULong = IF_NAMESIZE
public const val FIONREAD: CInt = 0x4008667f
public const val FIONBIO: CInt = 0x8004667e
public const val FIOASYNC: CInt = 0x8008667d
public const val FIOCLEX: CInt = 0
public const val SIOCGIFCONF: CULong = 0x80107364uL
public const val SIOCGIFFLAGS: CULong = 0x80507365uL
public const val SIOCGIFADDR: CULong = 0x80507366uL
public const val SIOCGIFBRDADDR: CULong = 0x80507367uL
public const val SIOCGIFNETMASK: CULong = 0x80507368uL
public const val SIOCGIFHWADDR: CULong = 0x80507369uL
public const val SIOCGIFMETRIC: CULong = 0x8050736auL
public const val SIOCGIFMTU: CULong = 0x8050736buL
public const val SIOCGIFINDEX: CULong = 0x8050736cuL
public const val SIOGIFINDEX: CULong = SIOCGIFINDEX
public const val SIOCGIFDSTADDR: CULong = 0x8050736euL
public const val SOL_SOCKET: CInt = 0xffff
public const val SO_DEBUG: CInt = 1
public const val SO_ACCEPTCONN: CInt = 0x0002
public const val SO_REUSEADDR: CInt = 0x0004
public const val SO_KEEPALIVE: CInt = 0x0008
public const val SO_DONTROUTE: CInt = 0x0010
public const val SO_BROADCAST: CInt = 0x0020
public const val SO_USELOOPBACK: CInt = 0x0040
public const val SO_LINGER: CInt = 0x0080
public const val SO_OOBINLINE: CInt = 0x0100
public const val SO_PEERCRED: CInt = 0x0200
public const val SO_PASSCRED: CInt = 0x0400
public const val SO_SNDBUF: CInt = 0x1001
public const val SO_RCVBUF: CInt = 0x1002
public const val SO_SNDLOWAT: CInt = 0x1003
public const val SO_RCVLOWAT: CInt = 0x1004
public const val SO_SNDTIMEO: CInt = 0x1005
public const val SO_RCVTIMEO: CInt = 0x1006
public const val SO_ERROR: CInt = 0x1007
public const val SO_TYPE: CInt = 0x1008
public const val SCM_RIGHTS: CInt = 0x01
public const val SCM_CREDENTIALS: CInt = 0x02
public const val SOCK_STREAM: CInt = 1
public const val SOCK_DGRAM: CInt = 2
public const val SOCK_RAW: CInt = 3
public const val SOCK_RDM: CInt = 4
public const val SOCK_SEQPACKET: CInt = 5
public const val SOCK_NONBLOCK: CInt = 0x01000000
public const val SOCK_CLOEXEC: CInt = 0x02000000
public const val AF_UNSPEC: CInt = 0
public const val AF_LOCAL: CInt = 1
public const val AF_UNIX: CInt = AF_LOCAL
public const val AF_INET: CInt = 2
public const val AF_IMPLINK: CInt = 3
public const val AF_PUP: CInt = 4
public const val AF_CHAOS: CInt = 5
public const val AF_NS: CInt = 6
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
public const val AF_NETBIOS: CInt = 17
public const val AF_INET6: CInt = 23
public const val PF_UNSPEC: CInt = AF_UNSPEC
public const val PF_LOCAL: CInt = AF_LOCAL
public const val PF_UNIX: CInt = PF_LOCAL
public const val PF_INET: CInt = AF_INET
public const val PF_IMPLINK: CInt = AF_IMPLINK
public const val PF_PUP: CInt = AF_PUP
public const val PF_CHAOS: CInt = AF_CHAOS
public const val PF_NS: CInt = AF_NS
public const val PF_ISO: CInt = AF_ISO
public const val PF_OSI: CInt = AF_ISO
public const val PF_DATAKIT: CInt = AF_DATAKIT
public const val PF_CCITT: CInt = AF_CCITT
public const val PF_SNA: CInt = AF_SNA
public const val PF_DECnet: CInt = AF_DECnet
public const val PF_DLI: CInt = AF_DLI
public const val PF_LAT: CInt = AF_LAT
public const val PF_HYLINK: CInt = AF_HYLINK
public const val PF_APPLETALK: CInt = AF_APPLETALK
public const val PF_NETBIOS: CInt = AF_NETBIOS
public const val PF_INET6: CInt = AF_INET6
public const val SOMAXCONN: CInt = 0x7fffffff
public const val MSG_OOB: CInt = 0x1
public const val MSG_PEEK: CInt = 0x2
public const val MSG_DONTROUTE: CInt = 0x4
public const val MSG_WAITALL: CInt = 0x8
public const val MSG_DONTWAIT: CInt = 0x10
public const val MSG_NOSIGNAL: CInt = 0x20
public const val MSG_TRUNC: CInt = 0x0100
public const val MSG_CTRUNC: CInt = 0x0200
public const val MSG_BCAST: CInt = 0x0400
public const val MSG_MCAST: CInt = 0x0800
public const val MSG_CMSG_CLOEXEC: CInt = 0x1000
public const val MSG_EOR: CInt = 0x8000
public const val SOL_IP: CInt = 0
public const val SOL_IPV6: CInt = 41
public const val SOL_TCP: CInt = 6
public const val SOL_UDP: CInt = 17
public const val IPTOS_LOWDELAY: UByte = 0x10u
public const val IPTOS_THROUGHPUT: UByte = 0x08u
public const val IPTOS_RELIABILITY: UByte = 0x04u
public const val IPTOS_LOWCOST: UByte = 0x02u
public const val IPTOS_MINCOST: UByte = IPTOS_LOWCOST
public const val IP_DEFAULT_MULTICAST_TTL: CInt = 1
public const val IP_DEFAULT_MULTICAST_LOOP: CInt = 1
public const val IP_OPTIONS: CInt = 1
public const val IP_HDRINCL: CInt = 2
public const val IP_TOS: CInt = 3
public const val IP_TTL: CInt = 4
public const val IP_MULTICAST_IF: CInt = 9
public const val IP_MULTICAST_TTL: CInt = 10
public const val IP_MULTICAST_LOOP: CInt = 11
public const val IP_ADD_MEMBERSHIP: CInt = 12
public const val IP_DROP_MEMBERSHIP: CInt = 13
public const val IP_ADD_SOURCE_MEMBERSHIP: CInt = 15
public const val IP_DROP_SOURCE_MEMBERSHIP: CInt = 16
public const val IP_BLOCK_SOURCE: CInt = 17
public const val IP_UNBLOCK_SOURCE: CInt = 18
public const val IP_PKTINFO: CInt = 19
public const val IP_RECVTTL: CInt = 21
public const val IP_UNICAST_IF: CInt = 31
public const val IP_RECVTOS: CInt = 40
public const val IP_MTU_DISCOVER: CInt = 71
public const val IP_MTU: CInt = 73
public const val IP_RECVERR: CInt = 75
public const val IP_PMTUDISC_WANT: CInt = 0
public const val IP_PMTUDISC_DO: CInt = 1
public const val IP_PMTUDISC_DONT: CInt = 2
public const val IP_PMTUDISC_PROBE: CInt = 3
public const val IPV6_HOPOPTS: CInt = 1
public const val IPV6_HDRINCL: CInt = 2
public const val IPV6_UNICAST_HOPS: CInt = 4
public const val IPV6_MULTICAST_IF: CInt = 9
public const val IPV6_MULTICAST_HOPS: CInt = 10
public const val IPV6_MULTICAST_LOOP: CInt = 11
public const val IPV6_ADD_MEMBERSHIP: CInt = 12
public const val IPV6_DROP_MEMBERSHIP: CInt = 13
public const val IPV6_JOIN_GROUP: CInt = 12
public const val IPV6_LEAVE_GROUP: CInt = 13
public const val IPV6_DONTFRAG: CInt = 14
public const val IPV6_PKTINFO: CInt = 19
public const val IPV6_HOPLIMIT: CInt = 21
public const val IPV6_CHECKSUM: CInt = 26
public const val IPV6_V6ONLY: CInt = 27
public const val IPV6_UNICAST_IF: CInt = 31
public const val IPV6_RTHDR: CInt = 32
public const val IPV6_RECVRTHDR: CInt = 38
public const val IPV6_TCLASS: CInt = 39
public const val IPV6_RECVTCLASS: CInt = 40
public const val IPV6_MTU_DISCOVER: CInt = 71
public const val IPV6_MTU: CInt = 72
public const val IPV6_RECVERR: CInt = 75
public const val IPV6_PMTUDISC_WANT: CInt = 0
public const val IPV6_PMTUDISC_DO: CInt = 1
public const val IPV6_PMTUDISC_DONT: CInt = 2
public const val IPV6_PMTUDISC_PROBE: CInt = 3
public const val MCAST_JOIN_GROUP: CInt = 41
public const val MCAST_LEAVE_GROUP: CInt = 42
public const val MCAST_BLOCK_SOURCE: CInt = 43
public const val MCAST_UNBLOCK_SOURCE: CInt = 44
public const val MCAST_JOIN_SOURCE_GROUP: CInt = 45
public const val MCAST_LEAVE_SOURCE_GROUP: CInt = 46
public const val MCAST_INCLUDE: CInt = 0
public const val MCAST_EXCLUDE: CInt = 1
public const val SHUT_RD: CInt = 0
public const val SHUT_WR: CInt = 1
public const val SHUT_RDWR: CInt = 2
public const val S_BLKSIZE: ModeT = 1024
public const val S_IREAD: ModeT = 256
public const val S_IWRITE: ModeT = 128
public const val S_IEXEC: ModeT = 64
public const val S_ENFMT: ModeT = 1024
public const val S_IFMT: ModeT = 61440
public const val S_IFDIR: ModeT = 16384
public const val S_IFCHR: ModeT = 8192
public const val S_IFBLK: ModeT = 24576
public const val S_IFREG: ModeT = 32768
public const val S_IFLNK: ModeT = 40960
public const val S_IFSOCK: ModeT = 49152
public const val S_IFIFO: ModeT = 4096
public const val S_IRWXU: ModeT = 448
public const val S_IRUSR: ModeT = 256
public const val S_IWUSR: ModeT = 128
public const val S_IXUSR: ModeT = 64
public const val S_IRWXG: ModeT = 56
public const val S_IRGRP: ModeT = 32
public const val S_IWGRP: ModeT = 16
public const val S_IXGRP: ModeT = 8
public const val S_IRWXO: ModeT = 7
public const val S_IROTH: ModeT = 4
public const val S_IWOTH: ModeT = 2
public const val S_IXOTH: ModeT = 1
public const val UTIME_NOW: CLong = -2
public const val UTIME_OMIT: CLong = -1
public const val ARG_MAX: CInt = 32000
public const val CHILD_MAX: CInt = 256
public const val IOV_MAX: CInt = 1024
public const val PTHREAD_STACK_MIN: ULong = 65536uL
public const val PATH_MAX: CInt = 4096
public const val PIPE_BUF: ULong = 4096uL
public const val NGROUPS_MAX: CInt = 1024
public const val FILENAME_MAX: CInt = 4096
public const val FORK_RELOAD: CInt = 1
public const val FORK_NO_RELOAD: CInt = 0
public const val RTLD_LOCAL: CInt = 0
public const val RTLD_LAZY: CInt = 1
public const val RTLD_NOW: CInt = 2
public const val RTLD_GLOBAL: CInt = 4
public const val RTLD_NODELETE: CInt = 8
public const val RTLD_NOLOAD: CInt = 16
public const val RTLD_DEEPBIND: CInt = 32
public const val IPPROTO_HOPOPTS: CInt = 0
public const val IPPROTO_IGMP: CInt = 2
public const val IPPROTO_IPIP: CInt = 4
public const val IPPROTO_EGP: CInt = 8
public const val IPPROTO_PUP: CInt = 12
public const val IPPROTO_IDP: CInt = 22
public const val IPPROTO_ROUTING: CInt = 43
public const val IPPROTO_FRAGMENT: CInt = 44
public const val IPPROTO_ESP: CInt = 50
public const val IPPROTO_AH: CInt = 51
public const val IPPROTO_NONE: CInt = 59
public const val IPPROTO_DSTOPTS: CInt = 60
public const val IPPROTO_RAW: CInt = 255
public const val IPPROTO_MAX: CInt = 256
public const val AI_PASSIVE: CInt = 0x1
public const val AI_CANONNAME: CInt = 0x2
public const val AI_NUMERICHOST: CInt = 0x4
public const val AI_NUMERICSERV: CInt = 0x8
public const val AI_ALL: CInt = 0x100
public const val AI_ADDRCONFIG: CInt = 0x400
public const val AI_V4MAPPED: CInt = 0x800
public const val NI_NOFQDN: CInt = 0x1
public const val NI_NUMERICHOST: CInt = 0x2
public const val NI_NAMEREQD: CInt = 0x4
public const val NI_NUMERICSERV: CInt = 0x8
public const val NI_DGRAM: CInt = 0x10
public const val NI_MAXHOST: CInt = 1025
public const val NI_MAXSERV: CInt = 32
public const val EAI_AGAIN: CInt = 2
public const val EAI_BADFLAGS: CInt = 3
public const val EAI_FAIL: CInt = 4
public const val EAI_FAMILY: CInt = 5
public const val EAI_MEMORY: CInt = 6
public const val EAI_NODATA: CInt = 7
public const val EAI_NONAME: CInt = 8
public const val EAI_SERVICE: CInt = 9
public const val EAI_SOCKTYPE: CInt = 10
public const val EAI_SYSTEM: CInt = 11
public const val EAI_OVERFLOW: CInt = 14
public const val UT_LINESIZE: ULong = 16uL
public const val UT_NAMESIZE: ULong = 16uL
public const val UT_HOSTSIZE: ULong = 256uL
public const val UT_IDLEN: ULong = 2uL
public const val RUN_LVL: CShort = 1
public const val BOOT_TIME: CShort = 2
public const val NEW_TIME: CShort = 3
public const val OLD_TIME: CShort = 4
public const val INIT_PROCESS: CShort = 5
public const val LOGIN_PROCESS: CShort = 6
public const val USER_PROCESS: CShort = 7
public const val DEAD_PROCESS: CShort = 8
public const val POLLIN: CShort = 0x1
public const val POLLPRI: CShort = 0x2
public const val POLLOUT: CShort = 0x4
public const val POLLERR: CShort = 0x8
public const val POLLHUP: CShort = 0x10
public const val POLLNVAL: CShort = 0x20
public const val POLLRDNORM: CShort = 0x1
public const val POLLRDBAND: CShort = 0x2
public const val POLLWRNORM: CShort = 0x4
public const val POLLWRBAND: CShort = 0x4
public const val LC_ALL: CInt = 0
public const val LC_COLLATE: CInt = 1
public const val LC_CTYPE: CInt = 2
public const val LC_MONETARY: CInt = 3
public const val LC_NUMERIC: CInt = 4
public const val LC_TIME: CInt = 5
public const val LC_MESSAGES: CInt = 6
public val LC_ALL_MASK: CInt = 1 shl 0
public val LC_COLLATE_MASK: CInt = 1 shl 1
public val LC_CTYPE_MASK: CInt = 1 shl 2
public val LC_MONETARY_MASK: CInt = 1 shl 3
public val LC_NUMERIC_MASK: CInt = 1 shl 4
public val LC_TIME_MASK: CInt = 1 shl 5
public val LC_MESSAGES_MASK: CInt = 1 shl 6
public val LC_GLOBAL_LOCALE: LocaleT = -1isize.toLocaleT()
public const val ST_RDONLY: CULong = 0x80000uL
public const val ST_NOSUID: CULong = 0uL
public const val TIOCMGET: CInt = 0x5415
public const val TIOCMBIS: CInt = 0x5416
public const val TIOCMBIC: CInt = 0x5417
public const val TIOCMSET: CInt = 0x5418
public const val TIOCINQ: CInt = 0x541B
public const val TIOCSCTTY: CInt = 0x540E
public const val TIOCSBRK: CInt = 0x5427
public const val TIOCCBRK: CInt = 0x5428
public const val TIOCM_DTR: CInt = 0x002
public const val TIOCM_RTS: CInt = 0x004
public const val TIOCM_CTS: CInt = 0x020
public const val TIOCM_CAR: CInt = 0x040
public const val TIOCM_RNG: CInt = 0x080
public const val TIOCM_CD: CInt = TIOCM_CAR
public const val TIOCM_RI: CInt = TIOCM_RNG
public const val TCOOFF: CInt = 0
public const val TCOON: CInt = 1
public const val TCIOFF: CInt = 2
public const val TCION: CInt = 3
public const val TCGETA: CInt = 5
public const val TCSETA: CInt = 6
public const val TCSETAW: CInt = 7
public const val TCSETAF: CInt = 8
public const val TCIFLUSH: CInt = 0
public const val TCOFLUSH: CInt = 1
public const val TCIOFLUSH: CInt = 2
public const val TCFLSH: CInt = 3
public const val TCSAFLUSH: CInt = 1
public const val TCSANOW: CInt = 2
public const val TCSADRAIN: CInt = 3
public const val TIOCPKT: CInt = 6
public const val TIOCPKT_DATA: CInt = 0x0
public const val TIOCPKT_FLUSHREAD: CInt = 0x1
public const val TIOCPKT_FLUSHWRITE: CInt = 0x2
public const val TIOCPKT_STOP: CInt = 0x4
public const val TIOCPKT_START: CInt = 0x8
public const val TIOCPKT_NOSTOP: CInt = 0x10
public const val TIOCPKT_DOSTOP: CInt = 0x20
public const val IGNBRK: TcflagT = 0x00001
public const val BRKINT: TcflagT = 0x00002
public const val IGNPAR: TcflagT = 0x00004
public const val IMAXBEL: TcflagT = 0x00008
public const val INPCK: TcflagT = 0x00010
public const val ISTRIP: TcflagT = 0x00020
public const val INLCR: TcflagT = 0x00040
public const val IGNCR: TcflagT = 0x00080
public const val ICRNL: TcflagT = 0x00100
public const val IXON: TcflagT = 0x00400
public const val IXOFF: TcflagT = 0x01000
public const val IUCLC: TcflagT = 0x04000
public const val IXANY: TcflagT = 0x08000
public const val PARMRK: TcflagT = 0x10000
public const val IUTF8: TcflagT = 0x20000
public const val OPOST: TcflagT = 0x00001
public const val OLCUC: TcflagT = 0x00002
public const val OCRNL: TcflagT = 0x00004
public const val ONLCR: TcflagT = 0x00008
public const val ONOCR: TcflagT = 0x00010
public const val ONLRET: TcflagT = 0x00020
public const val OFILL: TcflagT = 0x00040
public const val CRDLY: TcflagT = 0x00180
public const val CR0: TcflagT = 0x00000
public const val CR1: TcflagT = 0x00080
public const val CR2: TcflagT = 0x00100
public const val CR3: TcflagT = 0x00180
public const val NLDLY: TcflagT = 0x00200
public const val NL0: TcflagT = 0x00000
public const val NL1: TcflagT = 0x00200
public const val BSDLY: TcflagT = 0x00400
public const val BS0: TcflagT = 0x00000
public const val BS1: TcflagT = 0x00400
public const val TABDLY: TcflagT = 0x01800
public const val TAB0: TcflagT = 0x00000
public const val TAB1: TcflagT = 0x00800
public const val TAB2: TcflagT = 0x01000
public const val TAB3: TcflagT = 0x01800
public const val XTABS: TcflagT = 0x01800
public const val VTDLY: TcflagT = 0x02000
public const val VT0: TcflagT = 0x00000
public const val VT1: TcflagT = 0x02000
public const val FFDLY: TcflagT = 0x04000
public const val FF0: TcflagT = 0x00000
public const val FF1: TcflagT = 0x04000
public const val OFDEL: TcflagT = 0x08000
public const val CBAUD: TcflagT = 0x0100f
public const val B0: SpeedT = 0x00000
public const val B50: SpeedT = 0x00001
public const val B75: SpeedT = 0x00002
public const val B110: SpeedT = 0x00003
public const val B134: SpeedT = 0x00004
public const val B150: SpeedT = 0x00005
public const val B200: SpeedT = 0x00006
public const val B300: SpeedT = 0x00007
public const val B600: SpeedT = 0x00008
public const val B1200: SpeedT = 0x00009
public const val B1800: SpeedT = 0x0000a
public const val B2400: SpeedT = 0x0000b
public const val B4800: SpeedT = 0x0000c
public const val B9600: SpeedT = 0x0000d
public const val B19200: SpeedT = 0x0000e
public const val B38400: SpeedT = 0x0000f
public const val CSIZE: TcflagT = 0x00030
public const val CS5: TcflagT = 0x00000
public const val CS6: TcflagT = 0x00010
public const val CS7: TcflagT = 0x00020
public const val CS8: TcflagT = 0x00030
public const val CSTOPB: TcflagT = 0x00040
public const val CREAD: TcflagT = 0x00080
public const val PARENB: TcflagT = 0x00100
public const val PARODD: TcflagT = 0x00200
public const val HUPCL: TcflagT = 0x00400
public const val CLOCAL: TcflagT = 0x00800
public const val CBAUDEX: TcflagT = 0x0100f
public const val B57600: SpeedT = 0x01001
public const val B115200: SpeedT = 0x01002
public const val B230400: SpeedT = 0x01004
public const val B460800: SpeedT = 0x01006
public const val B500000: SpeedT = 0x01007
public const val B576000: SpeedT = 0x01008
public const val B921600: SpeedT = 0x01009
public const val B1000000: SpeedT = 0x0100a
public const val B1152000: SpeedT = 0x0100b
public const val B1500000: SpeedT = 0x0100c
public const val B2000000: SpeedT = 0x0100d
public const val B2500000: SpeedT = 0x0100e
public const val B3000000: SpeedT = 0x0100f
public const val CRTSCTS: TcflagT = 0x08000
public const val CMSPAR: TcflagT = 0x40000000
public const val ISIG: TcflagT = 0x0001
public const val ICANON: TcflagT = 0x0002
public const val ECHO: TcflagT = 0x0004
public const val ECHOE: TcflagT = 0x0008
public const val ECHOK: TcflagT = 0x0010
public const val ECHONL: TcflagT = 0x0020
public const val NOFLSH: TcflagT = 0x0040
public const val TOSTOP: TcflagT = 0x0080
public const val IEXTEN: TcflagT = 0x0100
public const val FLUSHO: TcflagT = 0x0200
public const val ECHOKE: TcflagT = 0x0400
public const val ECHOCTL: TcflagT = 0x0800
public const val VDISCARD: ULong = 1uL
public const val VEOL: ULong = 2uL
public const val VEOL2: ULong = 3uL
public const val VEOF: ULong = 4uL
public const val VERASE: ULong = 5uL
public const val VINTR: ULong = 6uL
public const val VKILL: ULong = 7uL
public const val VLNEXT: ULong = 8uL
public const val VMIN: ULong = 9uL
public const val VQUIT: ULong = 10uL
public const val VREPRINT: ULong = 11uL
public const val VSTART: ULong = 12uL
public const val VSTOP: ULong = 13uL
public const val VSUSP: ULong = 14uL
public const val VSWTC: ULong = 15uL
public const val VTIME: ULong = 16uL
public const val VWERASE: ULong = 17uL
public const val NCCS: ULong = 18uL
public const val TIOCGWINSZ: CInt = 0x5401
public const val TIOCSWINSZ: CInt = 0x5402
public const val TIOCLINUX: CInt = 0x5403
public const val TIOCGPGRP: CInt = 0x540f
public const val TIOCSPGRP: CInt = 0x5410
public const val WNOHANG: CInt = 1
public const val WUNTRACED: CInt = 2
public const val WCONTINUED: CInt = 8
public const val EXIT_FAILURE: CInt = 1
public const val EXIT_SUCCESS: CInt = 0
public const val PROT_NONE: CInt = 0
public const val PROT_READ: CInt = 1
public const val PROT_WRITE: CInt = 2
public const val PROT_EXEC: CInt = 4
public const val MAP_FILE: CInt = 0
public const val MAP_SHARED: CInt = 1
public const val MAP_PRIVATE: CInt = 2
public const val MAP_TYPE: CInt = 0xf
public const val MAP_FIXED: CInt = 0x10
public const val MAP_ANON: CInt = 0x20
public const val MAP_ANONYMOUS: CInt = MAP_ANON
public const val MAP_NORESERVE: CInt = 0x4000
public const val MS_ASYNC: CInt = 1
public const val MS_SYNC: CInt = 2
public const val MS_INVALIDATE: CInt = 4
public const val POSIX_MADV_NORMAL: CInt = 0
public const val POSIX_MADV_SEQUENTIAL: CInt = 1
public const val POSIX_MADV_RANDOM: CInt = 2
public const val POSIX_MADV_WILLNEED: CInt = 3
public const val POSIX_MADV_DONTNEED: CInt = 4
public const val MADV_NORMAL: CInt = 0
public const val MADV_SEQUENTIAL: CInt = 1
public const val MADV_RANDOM: CInt = 2
public const val MADV_WILLNEED: CInt = 3
public const val MADV_DONTNEED: CInt = 4
public const val F_ULOCK: CInt = 0
public const val F_LOCK: CInt = 1
public const val F_TLOCK: CInt = 2
public const val F_TEST: CInt = 3
public const val F_OK: CInt = 0
public const val R_OK: CInt = 4
public const val W_OK: CInt = 2
public const val X_OK: CInt = 1
public const val SEEK_SET: CInt = 0
public const val SEEK_CUR: CInt = 1
public const val SEEK_END: CInt = 2
public const val _SC_ARG_MAX: CInt = 0
public const val _SC_CHILD_MAX: CInt = 1
public const val _SC_CLK_TCK: CInt = 2
public const val _SC_NGROUPS_MAX: CInt = 3
public const val _SC_OPEN_MAX: CInt = 4
public const val _SC_JOB_CONTROL: CInt = 5
public const val _SC_SAVED_IDS: CInt = 6
public const val _SC_VERSION: CInt = 7
public const val _SC_PAGESIZE: CInt = 8
public const val _SC_PAGE_SIZE: CInt = _SC_PAGESIZE
public const val _SC_NPROCESSORS_CONF: CInt = 9
public const val _SC_NPROCESSORS_ONLN: CInt = 10
public const val _SC_PHYS_PAGES: CInt = 11
public const val _SC_AVPHYS_PAGES: CInt = 12
public const val _SC_MQ_OPEN_MAX: CInt = 13
public const val _SC_MQ_PRIO_MAX: CInt = 14
public const val _SC_RTSIG_MAX: CInt = 15
public const val _SC_SEM_NSEMS_MAX: CInt = 16
public const val _SC_SEM_VALUE_MAX: CInt = 17
public const val _SC_SIGQUEUE_MAX: CInt = 18
public const val _SC_TIMER_MAX: CInt = 19
public const val _SC_TZNAME_MAX: CInt = 20
public const val _SC_ASYNCHRONOUS_IO: CInt = 21
public const val _SC_FSYNC: CInt = 22
public const val _SC_MAPPED_FILES: CInt = 23
public const val _SC_MEMLOCK: CInt = 24
public const val _SC_MEMLOCK_RANGE: CInt = 25
public const val _SC_MEMORY_PROTECTION: CInt = 26
public const val _SC_MESSAGE_PASSING: CInt = 27
public const val _SC_PRIORITIZED_IO: CInt = 28
public const val _SC_REALTIME_SIGNALS: CInt = 29
public const val _SC_SEMAPHORES: CInt = 30
public const val _SC_SHARED_MEMORY_OBJECTS: CInt = 31
public const val _SC_SYNCHRONIZED_IO: CInt = 32
public const val _SC_TIMERS: CInt = 33
public const val _SC_AIO_LISTIO_MAX: CInt = 34
public const val _SC_AIO_MAX: CInt = 35
public const val _SC_AIO_PRIO_DELTA_MAX: CInt = 36
public const val _SC_DELAYTIMER_MAX: CInt = 37
public const val _SC_THREAD_KEYS_MAX: CInt = 38
public const val _SC_THREAD_STACK_MIN: CInt = 39
public const val _SC_THREAD_THREADS_MAX: CInt = 40
public const val _SC_TTY_NAME_MAX: CInt = 41
public const val _SC_THREADS: CInt = 42
public const val _SC_THREAD_ATTR_STACKADDR: CInt = 43
public const val _SC_THREAD_ATTR_STACKSIZE: CInt = 44
public const val _SC_THREAD_PRIORITY_SCHEDULING: CInt = 45
public const val _SC_THREAD_PRIO_INHERIT: CInt = 46
public const val _SC_THREAD_PRIO_PROTECT: CInt = 47
public const val _SC_THREAD_PRIO_CEILING: CInt = _SC_THREAD_PRIO_PROTECT
public const val _SC_THREAD_PROCESS_SHARED: CInt = 48
public const val _SC_THREAD_SAFE_FUNCTIONS: CInt = 49
public const val _SC_GETGR_R_SIZE_MAX: CInt = 50
public const val _SC_GETPW_R_SIZE_MAX: CInt = 51
public const val _SC_LOGIN_NAME_MAX: CInt = 52
public const val _SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 53
public const val _SC_ADVISORY_INFO: CInt = 54
public const val _SC_ATEXIT_MAX: CInt = 55
public const val _SC_BARRIERS: CInt = 56
public const val _SC_BC_BASE_MAX: CInt = 57
public const val _SC_BC_DIM_MAX: CInt = 58
public const val _SC_BC_SCALE_MAX: CInt = 59
public const val _SC_BC_STRING_MAX: CInt = 60
public const val _SC_CLOCK_SELECTION: CInt = 61
public const val _SC_COLL_WEIGHTS_MAX: CInt = 62
public const val _SC_CPUTIME: CInt = 63
public const val _SC_EXPR_NEST_MAX: CInt = 64
public const val _SC_HOST_NAME_MAX: CInt = 65
public const val _SC_IOV_MAX: CInt = 66
public const val _SC_IPV6: CInt = 67
public const val _SC_LINE_MAX: CInt = 68
public const val _SC_MONOTONIC_CLOCK: CInt = 69
public const val _SC_RAW_SOCKETS: CInt = 70
public const val _SC_READER_WRITER_LOCKS: CInt = 71
public const val _SC_REGEXP: CInt = 72
public const val _SC_RE_DUP_MAX: CInt = 73
public const val _SC_SHELL: CInt = 74
public const val _SC_SPAWN: CInt = 75
public const val _SC_SPIN_LOCKS: CInt = 76
public const val _SC_SPORADIC_SERVER: CInt = 77
public const val _SC_SS_REPL_MAX: CInt = 78
public const val _SC_SYMLOOP_MAX: CInt = 79
public const val _SC_THREAD_CPUTIME: CInt = 80
public const val _SC_THREAD_SPORADIC_SERVER: CInt = 81
public const val _SC_TIMEOUTS: CInt = 82
public const val _SC_TRACE: CInt = 83
public const val _SC_TRACE_EVENT_FILTER: CInt = 84
public const val _SC_TRACE_EVENT_NAME_MAX: CInt = 85
public const val _SC_TRACE_INHERIT: CInt = 86
public const val _SC_TRACE_LOG: CInt = 87
public const val _SC_TRACE_NAME_MAX: CInt = 88
public const val _SC_TRACE_SYS_MAX: CInt = 89
public const val _SC_TRACE_USER_EVENT_MAX: CInt = 90
public const val _SC_TYPED_MEMORY_OBJECTS: CInt = 91
public const val _SC_V7_ILP32_OFF32: CInt = 92
public const val _SC_V6_ILP32_OFF32: CInt = _SC_V7_ILP32_OFF32
public const val _SC_XBS5_ILP32_OFF32: CInt = _SC_V7_ILP32_OFF32
public const val _SC_V7_ILP32_OFFBIG: CInt = 93
public const val _SC_V6_ILP32_OFFBIG: CInt = _SC_V7_ILP32_OFFBIG
public const val _SC_XBS5_ILP32_OFFBIG: CInt = _SC_V7_ILP32_OFFBIG
public const val _SC_V7_LP64_OFF64: CInt = 94
public const val _SC_V6_LP64_OFF64: CInt = _SC_V7_LP64_OFF64
public const val _SC_XBS5_LP64_OFF64: CInt = _SC_V7_LP64_OFF64
public const val _SC_V7_LPBIG_OFFBIG: CInt = 95
public const val _SC_V6_LPBIG_OFFBIG: CInt = _SC_V7_LPBIG_OFFBIG
public const val _SC_XBS5_LPBIG_OFFBIG: CInt = _SC_V7_LPBIG_OFFBIG
public const val _SC_XOPEN_CRYPT: CInt = 96
public const val _SC_XOPEN_ENH_I18N: CInt = 97
public const val _SC_XOPEN_LEGACY: CInt = 98
public const val _SC_XOPEN_REALTIME: CInt = 99
public const val _SC_STREAM_MAX: CInt = 100
public const val _SC_PRIORITY_SCHEDULING: CInt = 101
public const val _SC_XOPEN_REALTIME_THREADS: CInt = 102
public const val _SC_XOPEN_SHM: CInt = 103
public const val _SC_XOPEN_STREAMS: CInt = 104
public const val _SC_XOPEN_UNIX: CInt = 105
public const val _SC_XOPEN_VERSION: CInt = 106
public const val _SC_2_CHAR_TERM: CInt = 107
public const val _SC_2_C_BIND: CInt = 108
public const val _SC_2_C_DEV: CInt = 109
public const val _SC_2_FORT_DEV: CInt = 110
public const val _SC_2_FORT_RUN: CInt = 111
public const val _SC_2_LOCALEDEF: CInt = 112
public const val _SC_2_PBS: CInt = 113
public const val _SC_2_PBS_ACCOUNTING: CInt = 114
public const val _SC_2_PBS_CHECKPOINT: CInt = 115
public const val _SC_2_PBS_LOCATE: CInt = 116
public const val _SC_2_PBS_MESSAGE: CInt = 117
public const val _SC_2_PBS_TRACK: CInt = 118
public const val _SC_2_SW_DEV: CInt = 119
public const val _SC_2_UPE: CInt = 120
public const val _SC_2_VERSION: CInt = 121
public const val _SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 122
public const val _SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 123
public const val _SC_XOPEN_UUCP: CInt = 124
public const val _SC_LEVEL1_ICACHE_SIZE: CInt = 125
public const val _SC_LEVEL1_ICACHE_ASSOC: CInt = 126
public const val _SC_LEVEL1_ICACHE_LINESIZE: CInt = 127
public const val _SC_LEVEL1_DCACHE_SIZE: CInt = 128
public const val _SC_LEVEL1_DCACHE_ASSOC: CInt = 129
public const val _SC_LEVEL1_DCACHE_LINESIZE: CInt = 130
public const val _SC_LEVEL2_CACHE_SIZE: CInt = 131
public const val _SC_LEVEL2_CACHE_ASSOC: CInt = 132
public const val _SC_LEVEL2_CACHE_LINESIZE: CInt = 133
public const val _SC_LEVEL3_CACHE_SIZE: CInt = 134
public const val _SC_LEVEL3_CACHE_ASSOC: CInt = 135
public const val _SC_LEVEL3_CACHE_LINESIZE: CInt = 136
public const val _SC_LEVEL4_CACHE_SIZE: CInt = 137
public const val _SC_LEVEL4_CACHE_ASSOC: CInt = 138
public const val _SC_LEVEL4_CACHE_LINESIZE: CInt = 139
public const val _PC_LINK_MAX: CInt = 0
public const val _PC_MAX_CANON: CInt = 1
public const val _PC_MAX_INPUT: CInt = 2
public const val _PC_NAME_MAX: CInt = 3
public const val _PC_PATH_MAX: CInt = 4
public const val _PC_PIPE_BUF: CInt = 5
public const val _PC_CHOWN_RESTRICTED: CInt = 6
public const val _PC_NO_TRUNC: CInt = 7
public const val _PC_VDISABLE: CInt = 8
public const val _PC_ASYNC_IO: CInt = 9
public const val _PC_PRIO_IO: CInt = 10
public const val _PC_SYNC_IO: CInt = 11
public const val _PC_FILESIZEBITS: CInt = 12
public const val _PC_2_SYMLINKS: CInt = 13
public const val _PC_SYMLINK_MAX: CInt = 14
public const val _PC_ALLOC_SIZE_MIN: CInt = 15
public const val _PC_REC_INCR_XFER_SIZE: CInt = 16
public const val _PC_REC_MAX_XFER_SIZE: CInt = 17
public const val _PC_REC_MIN_XFER_SIZE: CInt = 18
public const val _PC_REC_XFER_ALIGN: CInt = 19
public const val _PC_TIMESTAMP_RESOLUTION: CInt = 20
public const val _CS_PATH: CInt = 0
public const val O_ACCMODE: CInt = 0x3
public const val O_RDONLY: CInt = 0
public const val O_WRONLY: CInt = 1
public const val O_RDWR: CInt = 2
public const val O_APPEND: CInt = 0x0008
public const val O_CREAT: CInt = 0x0200
public const val O_TRUNC: CInt = 0x0400
public const val O_EXCL: CInt = 0x0800
public const val O_SYNC: CInt = 0x2000
public const val O_NONBLOCK: CInt = 0x4000
public const val O_NOCTTY: CInt = 0x8000
public const val O_CLOEXEC: CInt = 0x40000
public const val O_NOFOLLOW: CInt = 0x100000
public const val O_DIRECTORY: CInt = 0x200000
public const val O_EXEC: CInt = 0x400000
public const val O_SEARCH: CInt = 0x400000
public const val O_DIRECT: CInt = 0x80000
public const val O_DSYNC: CInt = 0x2000
public const val O_RSYNC: CInt = 0x2000
public const val O_TMPFILE: CInt = 0x800000
public const val O_NOATIME: CInt = 0x1000000
public const val O_PATH: CInt = 0x2000000
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
public const val F_RGETLK: CInt = 10
public const val F_RSETLK: CInt = 11
public const val F_CNVT: CInt = 12
public const val F_RSETLKW: CInt = 13
public const val F_DUPFD_CLOEXEC: CInt = 14
public const val F_RDLCK: CInt = 1
public const val F_WRLCK: CInt = 2
public const val F_UNLCK: CInt = 3
public const val AT_FDCWD: CInt = -2
public const val AT_EACCESS: CInt = 1
public const val AT_SYMLINK_NOFOLLOW: CInt = 2
public const val AT_SYMLINK_FOLLOW: CInt = 4
public const val AT_REMOVEDIR: CInt = 8
public const val AT_EMPTY_PATH: CInt = 16
public const val LOCK_SH: CInt = 1
public const val LOCK_EX: CInt = 2
public const val LOCK_NB: CInt = 4
public const val LOCK_UN: CInt = 8
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
public const val ENOMSG: CInt = 35
public const val EIDRM: CInt = 36
public const val ECHRNG: CInt = 37
public const val EL2NSYNC: CInt = 38
public const val EL3HLT: CInt = 39
public const val EL3RST: CInt = 40
public const val ELNRNG: CInt = 41
public const val EUNATCH: CInt = 42
public const val ENOCSI: CInt = 43
public const val EL2HLT: CInt = 44
public const val EDEADLK: CInt = 45
public const val ENOLCK: CInt = 46
public const val EBADE: CInt = 50
public const val EBADR: CInt = 51
public const val EXFULL: CInt = 52
public const val ENOANO: CInt = 53
public const val EBADRQC: CInt = 54
public const val EBADSLT: CInt = 55
public const val EDEADLOCK: CInt = 56
public const val EBFONT: CInt = 57
public const val ENOSTR: CInt = 60
public const val ENODATA: CInt = 61
public const val ETIME: CInt = 62
public const val ENOSR: CInt = 63
public const val ENONET: CInt = 64
public const val ENOPKG: CInt = 65
public const val EREMOTE: CInt = 66
public const val ENOLINK: CInt = 67
public const val EADV: CInt = 68
public const val ESRMNT: CInt = 69
public const val ECOMM: CInt = 70
public const val EPROTO: CInt = 71
public const val EMULTIHOP: CInt = 74
public const val EDOTDOT: CInt = 76
public const val EBADMSG: CInt = 77
public const val EFTYPE: CInt = 79
public const val ENOTUNIQ: CInt = 80
public const val EBADFD: CInt = 81
public const val EREMCHG: CInt = 82
public const val ELIBACC: CInt = 83
public const val ELIBBAD: CInt = 84
public const val ELIBSCN: CInt = 85
public const val ELIBMAX: CInt = 86
public const val ELIBEXEC: CInt = 87
public const val ENOSYS: CInt = 88
public const val ENOTEMPTY: CInt = 90
public const val ENAMETOOLONG: CInt = 91
public const val ELOOP: CInt = 92
public const val EOPNOTSUPP: CInt = 95
public const val EPFNOSUPPORT: CInt = 96
public const val ECONNRESET: CInt = 104
public const val ENOBUFS: CInt = 105
public const val EAFNOSUPPORT: CInt = 106
public const val EPROTOTYPE: CInt = 107
public const val ENOTSOCK: CInt = 108
public const val ENOPROTOOPT: CInt = 109
public const val ESHUTDOWN: CInt = 110
public const val ECONNREFUSED: CInt = 111
public const val EADDRINUSE: CInt = 112
public const val ECONNABORTED: CInt = 113
public const val ENETUNREACH: CInt = 114
public const val ENETDOWN: CInt = 115
public const val ETIMEDOUT: CInt = 116
public const val EHOSTDOWN: CInt = 117
public const val EHOSTUNREACH: CInt = 118
public const val EINPROGRESS: CInt = 119
public const val EALREADY: CInt = 120
public const val EDESTADDRREQ: CInt = 121
public const val EMSGSIZE: CInt = 122
public const val EPROTONOSUPPORT: CInt = 123
public const val ESOCKTNOSUPPORT: CInt = 124
public const val EADDRNOTAVAIL: CInt = 125
public const val ENETRESET: CInt = 126
public const val EISCONN: CInt = 127
public const val ENOTCONN: CInt = 128
public const val ETOOMANYREFS: CInt = 129
public const val EPROCLIM: CInt = 130
public const val EUSERS: CInt = 131
public const val EDQUOT: CInt = 132
public const val ESTALE: CInt = 133
public const val ENOTSUP: CInt = 134
public const val ENOMEDIUM: CInt = 135
public const val EILSEQ: CInt = 138
public const val EOVERFLOW: CInt = 139
public const val ECANCELED: CInt = 140
public const val ENOTRECOVERABLE: CInt = 141
public const val EOWNERDEAD: CInt = 142
public const val ESTRPIPE: CInt = 143
public const val EWOULDBLOCK: CInt = EAGAIN
public const val SCHED_OTHER: CInt = 3
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
// PTHREAD_COND_INITIALIZER: PthreadCondT = 21 as *mut _ (initializer represented at the FFI boundary)
public const val PTHREAD_CREATE_DETACHED: CInt = 1
public const val PTHREAD_CREATE_JOINABLE: CInt = 0
public const val PTHREAD_MUTEX_RECURSIVE: CInt = 0
public const val PTHREAD_MUTEX_ERRORCHECK: CInt = 1
public const val PTHREAD_MUTEX_NORMAL: CInt = 2
public const val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL
// PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = 18 as *mut _ (initializer represented at the FFI boundary)
// PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = 20 as *mut _ (initializer represented at the FFI boundary)
// PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = 19 as *mut _ (initializer represented at the FFI boundary)
public const val PTHREAD_PROCESS_SHARED: CInt = 1
public const val PTHREAD_PROCESS_PRIVATE: CInt = 0
// PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = 22 as *mut _ (initializer represented at the FFI boundary)
public const val LITTLE_ENDIAN: CInt = 1234
public const val BIG_ENDIAN: CInt = 4321
public const val TCP_NODELAY: CInt = 1
public const val TCP_KEEPIDLE: CInt = 3
public const val TCP_MAXSEG: CInt = 4
public const val TCP_QUICKACK: CInt = 12
public const val TCP_USER_TIMEOUT: CInt = 14
public const val TCP_FASTOPEN: CInt = 15
public const val TCP_KEEPCNT: CInt = 16
public const val TCP_KEEPINTVL: CInt = 17
public const val WINDOWS_POST: CInt = 0
public const val WINDOWS_SEND: CInt = 1
public const val WINDOWS_HWND: CInt = 2
public const val MOUNT_TEXT: CUInt = 0x01u
public const val MOUNT_SYSTEM: CUInt = 0x08u
public const val MOUNT_EXEC: CUInt = 0x10u
public const val MOUNT_CYGDRIVE: CUInt = 0x20u
public const val MOUNT_CYGWIN_EXEC: CUInt = 0x40u
public const val MOUNT_SPARSE: CUInt = 0x80u
public const val MOUNT_NOTEXEC: CUInt = 0x100u
public const val MOUNT_DEVFS: CUInt = 0x200u
public const val MOUNT_PROC: CUInt = 0x400u
public const val MOUNT_RO: CUInt = 0x1000u
public const val MOUNT_NOACL: CUInt = 0x2000u
public const val MOUNT_NOPOSIX: CUInt = 0x4000u
public const val MOUNT_OVERRIDE: CUInt = 0x8000u
public const val MOUNT_IMMUTABLE: CUInt = 0x10000u
public const val MOUNT_AUTOMATIC: CUInt = 0x20000u
public const val MOUNT_DOS: CUInt = 0x40000u
public const val MOUNT_IHASH: CUInt = 0x80000u
public const val MOUNT_BIND: CUInt = 0x100000u
public const val MOUNT_USER_TEMP: CUInt = 0x200000u
public const val MOUNT_DONT_USE: CUInt = 0x80000000u
public const val _POSIX_VDISABLE: CcT = 0
public const val GRND_NONBLOCK: CUInt = 0x1u
public const val GRND_RANDOM: CUInt = 0x2u
public const val _IOFBF: CInt = 0
public const val _IOLBF: CInt = 1
public const val _IONBF: CInt = 2
public const val BUFSIZ: CInt = 1024
public const val POSIX_SPAWN_RESETIDS: CInt = 0x01
public const val POSIX_SPAWN_SETPGROUP: CInt = 0x02
public const val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x04
public const val POSIX_SPAWN_SETSCHEDULER: CInt = 0x08
public const val POSIX_SPAWN_SETSIGDEF: CInt = 0x10
public const val POSIX_SPAWN_SETSIGMASK: CInt = 0x20
public const val POSIX_FADV_NORMAL: CInt = 0
public const val POSIX_FADV_SEQUENTIAL: CInt = 1
public const val POSIX_FADV_RANDOM: CInt = 2
public const val POSIX_FADV_WILLNEED: CInt = 3
public const val POSIX_FADV_DONTNEED: CInt = 4
public const val POSIX_FADV_NOREUSE: CInt = 5
public const val FALLOC_FL_PUNCH_HOLE: CInt = 0x0001
public const val FALLOC_FL_ZERO_RANGE: CInt = 0x0002
public const val FALLOC_FL_UNSHARE_RANGE: CInt = 0x0004
public const val FALLOC_FL_COLLAPSE_RANGE: CInt = 0x0008
public const val FALLOC_FL_INSERT_RANGE: CInt = 0x0010
public const val FALLOC_FL_KEEP_SIZE: CInt = 0x1000

// Inline helper functions (Rust `f!`/`safe_f!`); bodies provided per platform.
public expect fun fDCLR(fd: CInt, set: FdSet?): ()
public expect fun fDISSET(fd: CInt, set: FdSet?): Boolean
public expect fun fDSET(fd: CInt, set: FdSet?): ()
public expect fun fDZERO(set: FdSet?): ()
public expect fun cPUALLOCSIZE(count: CInt): ULong
public expect fun cPUCOUNTS(size: ULong, cpuset: &cpuSetT): CInt
public expect fun cPUZERO(cpuset: &mut cpuSetT): ()
public expect fun cPUSET(cpu: ULong, cpuset: &mut cpuSetT): ()
public expect fun cPUCLR(cpu: ULong, cpuset: &mut cpuSetT): ()
public expect fun cPUISSET(cpu: ULong, cpuset: &cpuSetT): Boolean
public expect fun cPUCOUNT(cpuset: &cpuSetT): CInt
public expect fun cPUEQUAL(set1: &cpuSetT, set2: &cpuSetT): Boolean
public expect fun cMSGLEN(length: CUInt): CUInt
public expect fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr?
public expect fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr?
public expect fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer?

public expect fun sigwait(set: SigsetT?, sig: CInt?): CInt
public expect fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt
public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt
public expect fun sigsuspend(mask: SigsetT?): CInt
public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt
public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt
public expect fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt
public expect fun strftime(s: String?, max: ULong, format: String?, tm: Tm?): ULong
public expect fun asctimeR(tm: Tm?, buf: String?): String?
public expect fun ctimeR(timep: TimeT?, buf: String?): String?
public expect fun strptime(s: String?, format: String?, tm: Tm?): String?
public expect fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt
public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt
public expect fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt
public expect fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT?): CInt
public expect fun timerDelete(timerid: TimerT): CInt
public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt
public expect fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt
public expect fun timerGetoverrun(timerid: TimerT): CInt
public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt
public expect fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt
public expect fun futimes(fd: CInt, times: Timeval?): CInt
public expect fun lutimes(file: String?, times: Timeval?): CInt
public expect fun settimeofday(tv: Timeval?, tz: Timezone?): CInt
public expect fun getitimer(which: CInt, currValue: Itimerval?): CInt
public expect fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt
public expect fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt
public expect fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt
public expect fun getrlimit(resource: CInt, rlim: Rlimit?): CInt
public expect fun setrlimit(resource: CInt, rlim: Rlimit?): CInt
public expect fun getpriority(which: CInt, who: IdT): CInt
public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt
public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun getpwent(): Passwd?
public expect fun setpwent()
public expect fun endpwent()
public expect fun ifNameindex(): IfNameindex?
public expect fun ifFreenameindex(ptr: IfNameindex?)
public expect fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT
public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT
public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt
public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt
public expect fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt
public expect fun futimens(fd: CInt, times: Timespec?): CInt
public expect fun dlfork(val: CInt)
public expect fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt
public expect fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt
public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT
public expect fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT
public expect fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT
public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, sevlen: SocklenT, flags: CInt): CInt
public expect fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt
public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT
public expect fun freelocale(loc: LocaleT)
public expect fun duplocale(base: LocaleT): LocaleT
public expect fun uselocale(loc: LocaleT): LocaleT
public expect fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt
public expect fun semDestroy(sem: SemT?): CInt
public expect fun semOpen(name: String?, oflag: CInt, ...): SemT?
public expect fun semClose(sem: SemT?): CInt
public expect fun semUnlink(name: String?): CInt
public expect fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt
public expect fun semGetvalue(sem: SemT?, sval: CInt?): CInt
public expect fun clearenv(): CInt
public expect fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt
public expect fun getpt(): CInt
public expect fun memalign(align: ULong, size: ULong): COpaquePointer?
public expect fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt
public expect fun abs(i: CInt): CInt
public expect fun arc4random(): UInt
public expect fun arc4randomUniform(l: UInt): UInt
public expect fun arc4randomBuf(buf: COpaquePointer?, size: ULong)
public expect fun labs(i: CLong): CLong
public expect fun mkostemp(template: String?, flags: CInt): CInt
public expect fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt
public expect fun mkstemps(template: String?, suffixlen: CInt): CInt
public expect fun rand(): CInt
public expect fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer?
public expect fun reallocf(ptr: COpaquePointer?, size: ULong): COpaquePointer?
public expect fun srand(seed: CUInt)
public expect fun drand48(): CDouble
public expect fun erand48(xseed: CUShort?): CDouble
public expect fun jrand48(xseed: CUShort?): CLong
public expect fun lcong48(p: CUShort?)
public expect fun lrand48(): CLong
public expect fun mrand48(): CLong
public expect fun nrand48(xseed: CUShort?): CLong
public expect fun seed48(xseed: CUShort?): CUShort?
public expect fun srand48(seed: CLong)
public expect fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?)
public expect fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt
public expect fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt
public expect fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt
public expect fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt
public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt
public expect fun shmUnlink(name: String?): CInt
public expect fun explicitBzero(s: COpaquePointer?, len: ULong)
public expect fun ffs(value: CInt): CInt
public expect fun ffsl(value: CLong): CInt
public expect fun ffsll(value: CLongLong): CInt
public expect fun fls(value: CInt): CInt
public expect fun flsl(value: CLong): CInt
public expect fun flsll(value: CLongLong): CInt
public expect fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt
public expect fun strncasecmpL(s1: String?, s2: String?, n: ULong, loc: LocaleT): CInt
public expect fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt
public expect fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt
public expect fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer?
public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer?
public expect fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt
public expect fun strsep(string: COpaquePointer?, delim: String?): String?
public expect fun basename(path: String?): String?
public expect fun daemon(nochdir: CInt, noclose: CInt): CInt
public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt
public expect fun eaccess(pathname: String?, mode: CInt): CInt
public expect fun euidaccess(pathname: String?, mode: CInt): CInt
public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt
public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun fdatasync(fd: CInt): CInt
public expect fun getdomainname(name: String?, len: ULong): CInt
public expect fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt
public expect fun gethostid(): CLong
public expect fun getpagesize(): CInt
public expect fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt
public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt
public expect fun pipe2(fds: CInt?, flags: CInt): CInt
public expect fun sbrk(increment: IntptrT): COpaquePointer?
public expect fun setgroups(ngroups: CInt, ptr: GidT?): CInt
public expect fun sethostname(name: String?, len: ULong): CInt
public expect fun vhangup(): CInt
public expect fun getdtablesize(): CInt
public expect fun sync()
public expect fun errno(): CInt?
public expect fun schedSetparam(pid: PidT, param: SchedParam?): CInt
public expect fun schedGetparam(pid: PidT, param: SchedParam?): CInt
public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt
public expect fun schedGetscheduler(pid: PidT): CInt
public expect fun schedGetPriorityMax(policy: CInt): CInt
public expect fun schedGetPriorityMin(policy: CInt): CInt
public expect fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt
public expect fun schedGetcpu(): CInt
public expect fun schedGetaffinity(pid: PidT, cpusetsize: ULong, mask: CpuSetT?): CInt
public expect fun schedSetaffinity(pid: PidT, cpusetsize: ULong, cpuset: CpuSetT?): CInt
public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt
public expect fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt
public expect fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt
public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt
public expect fun pthreadCancel(thread: PthreadT): CInt
public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt
public expect fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt
public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt
public expect fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt
public expect fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt
public expect fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt
public expect fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt
public expect fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt
public expect fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUInt): CInt
public expect fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt
public expect fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt
public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt
public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt
public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt
public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt
public expect fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT?, protocol: CInt?): CInt
public expect fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt
public expect fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT?, protocol: CInt): CInt
public expect fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt
public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt
public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt
public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt
public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt
public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt
public expect fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, val: CInt?): CInt
public expect fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, val: CInt): CInt
public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt
public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt
public expect fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT?): CInt
public expect fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt
public expect fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt
public expect fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT?): CInt
public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt
public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt
public expect fun ioctl(fd: CInt, request: CInt, ...): CInt
public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT
public expect fun mount(src: String?, target: String?, flags: CUInt): CInt
public expect fun umount(target: String?): CInt
public expect fun cygwinUmount(target: String?, flags: CUInt): CInt
public expect fun dirfd(dirp: DIR?): CInt
public expect fun seekdir(dirp: DIR?, loc: CLong)
public expect fun telldir(dirp: DIR?): CLong
public expect fun uname(buf: Utsname?): CInt
public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT?, attrp: PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt
public expect fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt
public expect fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt
public expect fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt
public expect fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt
public expect fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt
public expect fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt
public expect fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt
public expect fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt
public expect fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt
public expect fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt
public expect fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: SchedParam?): CInt
public expect fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt
public expect fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt
public expect fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt
public expect fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt
public expect fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt
public expect fun posixSpawnFileActionsAddchdir(actions: PosixSpawnFileActionsT?, path: String?): CInt
public expect fun posixSpawnFileActionsAddfchdir(actions: PosixSpawnFileActionsT?, fd: CInt): CInt
public expect fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT?, path: String?): CInt
public expect fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT?, fd: CInt): CInt
public expect fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT
public expect fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt
public expect fun getgrgid(gid: GidT): Group?
public expect fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt
public expect fun getgrnam(name: String?): Group?
public expect fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt
public expect fun initgroups(user: String?, group: GidT): CInt
public expect fun statfs(path: String?, buf: Statfs?): CInt
public expect fun fstatfs(fd: CInt, buf: Statfs?): CInt
public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt
public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt
public expect fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt
public expect fun endutxent()
public expect fun getutxent(): Utmpx?
public expect fun getutxid(id: Utmpx?): Utmpx?
public expect fun getutxline(line: Utmpx?): Utmpx?
public expect fun pututxline(utmpx: Utmpx?): Utmpx?
public expect fun setutxent()
public expect fun utmpxname(file: String?): CInt
public expect fun updwtmpx(file: String?, utmpx: Utmpx?)
