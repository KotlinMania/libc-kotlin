// port-lint: source unix/cygwin/cygwin_mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.GidT
import io.github.kotlinmania.libc.Group
import io.github.kotlinmania.libc.PidT
import io.github.kotlinmania.libc.Winsize

public fun interface SigeventSigevNotifyFunctionCallback {
    public operator fun invoke(value: Sigval)
}

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public typealias WcharT = CUshort

public typealias BlkcntT = Long

public typealias BlksizeT = Int

public typealias DevT = UInt

public typealias FsblkcntT = CUlong

public typealias FsfilcntT = CUlong

public typealias InoT = ULong

public typealias KeyT = CLonglong

public typealias SaFamilyT = UShort

public typealias SocklenT = CInt

public typealias OffT = CLong

public typealias IdT = UInt

public typealias ModeT = UInt

public typealias Off64T = CLonglong

public typealias LoffT = Off64T

public typealias IconvT = COpaquePointer?

public typealias ClockT = CUlong

public typealias TimeT = CLong

public typealias ClockidT = CUlong

public typealias TimerT = CUlong

public typealias NlItem = CInt

public typealias NlinkT = CUshort

public typealias SusecondsT = CLong

public typealias UsecondsT = CUlong

public sealed class Timezone {
}

public typealias SigsetT = CUlong

public typealias FdMask = CUlong

public typealias PthreadT = COpaquePointer?

public typealias PthreadMutexT = COpaquePointer?

// Must be Int due to libstd/sysCommon/threadLocal.rs,
// should technically be *mut cVoid
public typealias PthreadKeyT = Int

public typealias PthreadAttrT = COpaquePointer?

public typealias PthreadMutexattrT = COpaquePointer?

public typealias PthreadCondattrT = COpaquePointer?

public typealias PthreadCondT = COpaquePointer?

// The following ones should be *mut cVoid
public typealias PthreadBarrierattrT = ULong

public typealias PthreadBarrierT = ULong

public typealias PthreadSpinlockT = ULong

public typealias PthreadRwlockT = COpaquePointer?

public typealias PthreadRwlockattrT = COpaquePointer?

public typealias RegisterT = IntptrT

public typealias UChar = CUchar

public typealias UShort = CUshort

public typealias ULong = CUlong

public typealias UInt = CUint

public typealias CaddrT = COpaquePointer?

public typealias VmSizeT = CUlong

public typealias RlimT = CUlong

public typealias NfdsT = CUint

public typealias SemT = Sem?

public sealed class Sem {
}

public typealias TcflagT = CUint

public typealias SpeedT = CUint

public typealias VmOffsetT = CUlong

public typealias PosixSpawnFileActionsT = COpaquePointer?

public typealias PosixSpawnattrT = COpaquePointer?

public open class Itimerspec(public var itInterval: Timespec, public var itValue: Timespec)

public open class CpuSetT(public var bits: List<ULong>)

public open class Sigaction(
    public var saSigaction: SighandlerT,
    public var saMask: SigsetT,
    public var saFlags: CInt,
)

public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssFlags: CInt,
    public var ssSize: SizeT,
)

public open class Tm(
    public var tmSec: CInt,
    public var tmMin: CInt,
    public var tmHour: CInt,
    public var tmMday: CInt,
    public var tmMon: CInt,
    public var tmYear: CInt,
    public var tmWday: CInt,
    public var tmYday: CInt,
    public var tmIsdst: CInt,
    public var tmGmtoff: CLong,
    public var tmZone: COpaquePointer?,
)

public open class Bintime(public var sec: TimeT, public var frac: ULong)

public open class Passwd(
    public var pwName: COpaquePointer?,
    public var pwPasswd: COpaquePointer?,
    public var pwUid: UidT,
    public var pwGid: GidT,
    public var pwComment: COpaquePointer?,
    public var pwGecos: COpaquePointer?,
    public var pwDir: COpaquePointer?,
    public var pwShell: COpaquePointer?,
)

public open class IfNameindex(public var ifIndex: CUint, public var ifName: COpaquePointer?)

public open class Ucred(
    public var pid: PidT,
    public var uid: UidT,
    public var gid: GidT,
)

public open class Msghdr(
    public var msgName: COpaquePointer?,
    public var msgNamelen: SocklenT,
    public var msgIov: Iovec?,
    public var msgIovlen: CInt,
    public var msgControl: COpaquePointer?,
    public var msgControllen: SocklenT,
    public var msgFlags: CInt,
)

public open class Cmsghdr(
    public var cmsgLen: SizeT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

public open class DlInfo(
    public var dliFname: List<CChar>,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class In6Pktinfo(public var ipi6Addr: In6Addr, public var ipi6Ifindex: UInt)

public open class SockaddrIn6(
    public var sin6Family: SaFamilyT,
    public var sin6Port: InPortT,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: In6Addr,
    public var sin6ScopeId: UInt,
)

public open class IpMreqSource(
    public var imrMultiaddr: InAddr,
    public var imrSourceaddr: InAddr,
    public var imrInterface: InAddr,
)

public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SocklenT,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: Sockaddr?,
    public var aiNext: Addrinfo?,
)

public open class Lconv(
    public var decimalPoint: COpaquePointer?,
    public var thousandsSep: COpaquePointer?,
    public var grouping: COpaquePointer?,
    public var intCurrSymbol: COpaquePointer?,
    public var currencySymbol: COpaquePointer?,
    public var monDecimalPoint: COpaquePointer?,
    public var monThousandsSep: COpaquePointer?,
    public var monGrouping: COpaquePointer?,
    public var positiveSign: COpaquePointer?,
    public var negativeSign: COpaquePointer?,
    public var intFracDigits: CChar,
    public var fracDigits: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var nSignPosn: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intNSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intPSignPosn: CChar,
)

public open class Termios(
    public var cIflag: TcflagT,
    public var cOflag: TcflagT,
    public var cCflag: TcflagT,
    public var cLflag: TcflagT,
    public var cLine: CChar,
    public var cCc: List<CcT>,
    public var cIspeed: SpeedT,
    public var cOspeed: SpeedT,
)

public open class SchedParam(public var schedPriority: CInt)

public open class Flock(
    public var lType: CShort,
    public var lWhence: CShort,
    public var lStart: OffT,
    public var lLen: OffT,
    public var lPid: PidT,
)

public open class Hostent(
    public var hName: COpaquePointer?,
    public var hAliases: COpaquePointer?,
    public var hAddrtype: CShort,
    public var hLength: CShort,
    public var hAddrList: COpaquePointer?,
)

public open class Linger(public var lOnoff: CUshort, public var lLinger: CUshort)

public open class FdSet(public var fdsBits: List<FdMask>)

public open class UcFpxreg(
    public var significand: List<UShort>,
    public var exponent: UShort,
    public var padding: List<UShort>,
)

public open class UcXmmreg(public var element: List<UInt>)

public open class Fpstate(
    public var cwd: UShort,
    public var swd: UShort,
    public var ftw: UShort,
    public var fop: UShort,
    public var rip: ULong,
    public var rdp: ULong,
    public var mxcsr: UInt,
    public var mxcrMask: UInt,
    public var st: List<UcFpxreg>,
    public var xmm: List<UcXmmreg>,
    public var padding: List<UInt>,
)

public open class McontextT(
    public var p1home: ULong,
    public var p2home: ULong,
    public var p3home: ULong,
    public var p4home: ULong,
    public var p5home: ULong,
    public var p6home: ULong,
    public var ctxflags: UInt,
    public var mxcsr: UInt,
    public var cs: UShort,
    public var ds: UShort,
    public var es: UShort,
    public var fs: UShort,
    public var gs: UShort,
    public var ss: UShort,
    public var eflags: UInt,
    public var dr0: ULong,
    public var dr1: ULong,
    public var dr2: ULong,
    public var dr3: ULong,
    public var dr6: ULong,
    public var dr7: ULong,
    public var rax: ULong,
    public var rcx: ULong,
    public var rdx: ULong,
    public var rbx: ULong,
    public var rsp: ULong,
    public var rbp: ULong,
    public var rsi: ULong,
    public var rdi: ULong,
    public var r8: ULong,
    public var r9: ULong,
    public var r10: ULong,
    public var r11: ULong,
    public var r12: ULong,
    public var r13: ULong,
    public var r14: ULong,
    public var r15: ULong,
    public var rip: ULong,
    public var fpregs: Fpstate,
    public var vregs: List<ULong>,
    public var vcx: ULong,
    public var dbc: ULong,
    public var btr: ULong,
    public var bfr: ULong,
    public var etr: ULong,
    public var efr: ULong,
    public var oldmask: ULong,
    public var cr2: ULong,
)

public open class Sigevent(
    public var sigevValue: Sigval,
    public var sigevSigno: CInt,
    public var sigevNotify: CInt,
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback?,
    public var sigevNotifyAttributes: COpaquePointer?,
)

public open class UcontextT(
    public var ucMcontext: McontextT,
    public var ucLink: UcontextT?,
    public var ucSigmask: SigsetT,
    public var ucStack: StackT,
    public var ucFlags: CUlong,
)

public open class Sockaddr(public var saFamily: SaFamilyT, public var saData: List<CChar>)

public open class SockaddrStorage(
    public var ssFamily: SaFamilyT,
    public var ssPad1: List<CChar>,
    public var ssAlign: Long,
    public var ssPad2: List<CChar>,
)

public open class Stat(
    public var stDev: DevT,
    public var stIno: InoT,
    public var stMode: ModeT,
    public var stNlink: NlinkT,
    public var stUid: UidT,
    public var stGid: GidT,
    public var stRdev: DevT,
    public var stSize: OffT,
    public var stAtime: TimeT,
    public var stAtimeNsec: CLong,
    public var stMtime: TimeT,
    public var stMtimeNsec: CLong,
    public var stCtime: TimeT,
    public var stCtimeNsec: CLong,
    public var stBlksize: BlksizeT,
    public var stBlocks: BlkcntT,
    public var stBirthtime: TimeT,
    public var stBirthtimeNsec: CLong,
)

public open class InAddr(public var sAddr: InAddrT)

public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class InPktinfo(public var ipiAddr: InAddr, public var ipiIfindex: UInt)

public open class SockaddrIn(
    public var sinFamily: SaFamilyT,
    public var sinPort: InPortT,
    public var sinAddr: InAddr,
    public var sinZero: List<UByte>,
)

public open class Statvfs(
    public var fBsize: CUlong,
    public var fFrsize: CUlong,
    public var fBlocks: FsblkcntT,
    public var fBfree: FsblkcntT,
    public var fBavail: FsblkcntT,
    public var fFiles: FsfilcntT,
    public var fFfree: FsfilcntT,
    public var fFavail: FsfilcntT,
    public var fFsid: CUlong,
    public var fFlag: CUlong,
    public var fNamemax: CUlong,
)

public open class Statfs(
    public var fType: CLong,
    public var fBsize: CLong,
    public var fBlocks: CLong,
    public var fBfree: CLong,
    public var fBavail: CLong,
    public var fFiles: CLong,
    public var fFfree: CLong,
    public var fFsid: CLong,
    public var fNamelen: CLong,
    public var fSpare: List<CLong>,
)

public open class SockaddrUn(public var sunFamily: SaFamilyT, public var sunPath: List<CChar>)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
    public var domainname: List<CChar>,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siPid: PidT,
    public var siUid: UidT,
    public var siErrno: CInt,
    public var pad: List<UInt>,
) {
    public open fun siAddr(): COpaquePointer? {
        open class SiginfoSiAddr(
            public var siSigno: CInt,
            public var siCode: CInt,
            public var siPid: PidT,
            public var siUid: UidT,
            public var siErrno: CInt,
            public var siAddr: COpaquePointer?,
        )
        return (((this as SiginfoT?) as SiginfoSiAddr?)).siAddr
    }

    public open fun siStatus(): CInt {
        open class SiginfoSigchld(
            public var siSigno: CInt,
            public var siCode: CInt,
            public var siPid: PidT,
            public var siUid: UidT,
            public var siErrno: CInt,
            public var siStatus: CInt,
        )
        return (((this as SiginfoT?) as SiginfoSigchld?)).siStatus
    }

    public open fun siPid(): PidT {
        return this.siPid
    }

    public open fun siUid(): UidT {
        return this.siUid
    }

    public open fun siValue(): Sigval {
        open class SiginfoSiValue(
            public var siSigno: CInt,
            public var siCode: CInt,
            public var siPid: PidT,
            public var siUid: UidT,
            public var siErrno: CInt,
            public var siValue: Sigval,
        )
        return (((this as SiginfoT?) as SiginfoSiValue?)).siValue
    }
}

public open class Dirent(
    public var dVersion: UInt,
    public var dIno: InoT,
    public var dType: CUchar,
    public var dUnused1: List<CUchar>,
    public var dInternal1: UInt,
    public var dName: List<CChar>,
)

public open class MaxAlignT(public var priv: List<Double>)

public open class CAnonymousIfrIfru(
    public var ifruAddr: Sockaddr? = null,
    public var ifruBroadaddr: Sockaddr? = null,
    public var ifruDstaddr: Sockaddr? = null,
    public var ifruNetmask: Sockaddr? = null,
    public var ifruHwaddr: Sockaddr? = null,
    public var ifruFlags: CInt? = null,
    public var ifruMetric: CInt? = null,
    public var ifruMtu: CInt? = null,
    public var ifruIfindex: CInt? = null,
    public var ifruData: COpaquePointer?? = null,
    public var ifruPad: List<CChar>? = null,
)

public open class Ifreq(
    /**
     * if name, e.g. "en0"
     */
    public var ifrName: List<CChar>,
    public var ifrIfru: CAnonymousIfrIfru,
)

public open class CAnonymousIfcIfcu(public var ifcuBuf: CaddrT? = null, public var ifcuReq: Ifreq?? = null)

public open class Ifconf(public var ifcLen: CInt, public var ifcIfcu: CAnonymousIfcIfcu)

public open class Utmpx(
    public var utType: CShort,
    public var utPid: PidT,
    public var utLine: List<CChar>,
    public var utId: List<CChar>,
    public var utTime: TimeT,
    public var utUser: List<CChar>,
    public var utHost: List<CChar>,
    public var utAddr: CLong,
    public var utTv: Timeval,
)

public val FD_SETSIZE: Int = 1024

public val CPU_SETSIZE: CInt = 0x400

// siCode values for SIGBUS signal
public val BUS_ADRALN: CInt = 25

public val BUS_ADRERR: CInt = 26

public val BUS_OBJERR: CInt = 27

// siCode values for SIGCHLD signal
public val CLD_EXITED: CInt = 28

public val CLD_KILLED: CInt = 29

public val CLD_DUMPED: CInt = 30

public val CLD_TRAPPED: CInt = 31

public val CLD_STOPPED: CInt = 32

public val CLD_CONTINUED: CInt = 33

public val SIGEV_SIGNAL: CInt = 0

public val SIGEV_NONE: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val SA_NOCLDSTOP: CInt = 0x00000001

public val SA_NOCLDWAIT: CInt = 0

// Note: does not exist on Cygwin!
public val SA_SIGINFO: CInt = 0x00000002

public val SA_RESTART: CInt = 0x10000000

public val SA_ONSTACK: CInt = 0x20000000

public val SA_NODEFER: CInt = 0x40000000

public val SA_RESETHAND: CInt = 0x80000000

public val MINSIGSTKSZ: SizeT = 8192uL

public val SIGSTKSZ: SizeT = 32768uL

public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGTRAP: CInt = 5

public val SIGABRT: CInt = 6

public val SIGEMT: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGBUS: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGSYS: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGURG: CInt = 16

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGCONT: CInt = 19

public val SIGCHLD: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGIO: CInt = 23

public val SIGPOLL: CInt = 23

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGPWR: CInt = 29

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SS_ONSTACK: CInt = 0x1

public val SS_DISABLE: CInt = 0x2

public val SIG_SETMASK: CInt = 0

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val TIMER_ABSTIME: CInt = 4

public val CLOCK_REALTIME_COARSE: ClockidT = 0uL

public val CLOCK_REALTIME: ClockidT = 1uL

public val CLOCK_PROCESS_CPUTIME_ID: ClockidT = 2uL

public val CLOCK_THREAD_CPUTIME_ID: ClockidT = 3uL

public val CLOCK_MONOTONIC: ClockidT = 4uL

public val CLOCK_MONOTONIC_RAW: ClockidT = 5uL

public val CLOCK_MONOTONIC_COARSE: ClockidT = 6uL

public val CLOCK_BOOTTIME: ClockidT = 7uL

public val CLOCK_REALTIME_ALARM: ClockidT = 8uL

public val CLOCK_BOOTTIME_ALARM: ClockidT = 9uL

public val ITIMER_REAL: CInt = 0

public val ITIMER_VIRTUAL: CInt = 1

public val ITIMER_PROF: CInt = 2

public val PRIO_PROCESS: CInt = 0

public val PRIO_PGRP: CInt = 1

public val PRIO_USER: CInt = 2

public val RLIMIT_CPU: CInt = 0

public val RLIMIT_FSIZE: CInt = 1

public val RLIMIT_DATA: CInt = 2

public val RLIMIT_STACK: CInt = 3

public val RLIMIT_CORE: CInt = 4

public val RLIMIT_NOFILE: CInt = 5

public val RLIMIT_AS: CInt = 6

public val RLIM_NLIMITS: CInt = 7

public val RLIMIT_NLIMITS: CInt = RLIM_NLIMITS

public val RLIM_INFINITY: RlimT = 0uL.inv()

public val RLIM_SAVED_MAX: RlimT = RLIM_INFINITY

public val RLIM_SAVED_CUR: RlimT = RLIM_INFINITY

public val RUSAGE_SELF: CInt = 0

public val RUSAGE_CHILDREN: CInt = -1

public val IFF_UP: CInt = 0x1

// interface is up
public val IFF_BROADCAST: CInt = 0x2

// broadcast address valid
public val IFF_LOOPBACK: CInt = 0x8

// is a loopback net
public val IFF_POINTOPOINT: CInt = 0x10

// interface is point-to-point link
public val IFF_NOTRAILERS: CInt = 0x20

// avoid use of trailers
public val IFF_RUNNING: CInt = 0x40

// resources allocated
public val IFF_NOARP: CInt = 0x80

// no address resolution protocol
public val IFF_PROMISC: CInt = 0x100

// receive all packets
public val IFF_MULTICAST: CInt = 0x1000

// supports multicast
public val IFF_LOWER_UP: CInt = 0x10000

// driver signals L1 up
public val IFF_DORMANT: CInt = 0x20000

// driver signals dormant
public val IF_NAMESIZE: SizeT = 44uL

public val IFNAMSIZ: SizeT = IF_NAMESIZE

public val FIONREAD: CInt = 0x4008667f

public val FIONBIO: CInt = 0x8004667e

public val FIOASYNC: CInt = 0x8008667d

public val FIOCLEX: CInt = 0

// Note: does not exist on Cygwin!
public val SIOCGIFCONF: CUlong = 0x80107364uL

public val SIOCGIFFLAGS: CUlong = 0x80507365uL

public val SIOCGIFADDR: CUlong = 0x80507366uL

public val SIOCGIFBRDADDR: CUlong = 0x80507367uL

public val SIOCGIFNETMASK: CUlong = 0x80507368uL

public val SIOCGIFHWADDR: CUlong = 0x80507369uL

public val SIOCGIFMETRIC: CUlong = 0x8050736auL

public val SIOCGIFMTU: CUlong = 0x8050736buL

public val SIOCGIFINDEX: CUlong = 0x8050736cuL

public val SIOGIFINDEX: CUlong = SIOCGIFINDEX

public val SIOCGIFDSTADDR: CUlong = 0x8050736euL

public val SOL_SOCKET: CInt = 0xffff

public val SO_DEBUG: CInt = 1

public val SO_ACCEPTCONN: CInt = 0x0002

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_OOBINLINE: CInt = 0x0100

public val SO_PEERCRED: CInt = 0x0200

public val SO_PASSCRED: CInt = 0x0400

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_SNDLOWAT: CInt = 0x1003

public val SO_RCVLOWAT: CInt = 0x1004

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SCM_RIGHTS: CInt = 0x01

public val SCM_CREDENTIALS: CInt = 0x02

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_NONBLOCK: CInt = 0x01000000

public val SOCK_CLOEXEC: CInt = 0x02000000

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val AF_UNIX: CInt = AF_LOCAL

public val AF_INET: CInt = 2

public val AF_IMPLINK: CInt = 3

public val AF_PUP: CInt = 4

public val AF_CHAOS: CInt = 5

public val AF_NS: CInt = 6

public val AF_ISO: CInt = 7

public val AF_OSI: CInt = AF_ISO

public val AF_ECMA: CInt = 8

public val AF_DATAKIT: CInt = 9

public val AF_CCITT: CInt = 10

public val AF_SNA: CInt = 11

public val AF_DE_CNET: CInt = 12

public val AF_DLI: CInt = 13

public val AF_LAT: CInt = 14

public val AF_HYLINK: CInt = 15

public val AF_APPLETALK: CInt = 16

public val AF_NETBIOS: CInt = 17

public val AF_INET6: CInt = 23

public val PF_UNSPEC: CInt = AF_UNSPEC

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_UNIX: CInt = PF_LOCAL

public val PF_INET: CInt = AF_INET

public val PF_IMPLINK: CInt = AF_IMPLINK

public val PF_PUP: CInt = AF_PUP

public val PF_CHAOS: CInt = AF_CHAOS

public val PF_NS: CInt = AF_NS

public val PF_ISO: CInt = AF_ISO

public val PF_OSI: CInt = AF_ISO

public val PF_DATAKIT: CInt = AF_DATAKIT

public val PF_CCITT: CInt = AF_CCITT

public val PF_SNA: CInt = AF_SNA

public val PF_DE_CNET: CInt = AF_DE_CNET

public val PF_DLI: CInt = AF_DLI

public val PF_LAT: CInt = AF_LAT

public val PF_HYLINK: CInt = AF_HYLINK

public val PF_APPLETALK: CInt = AF_APPLETALK

public val PF_NETBIOS: CInt = AF_NETBIOS

public val PF_INET6: CInt = AF_INET6

public val SOMAXCONN: CInt = 0x7fffffff

public val MSG_OOB: CInt = 0x1

public val MSG_PEEK: CInt = 0x2

public val MSG_DONTROUTE: CInt = 0x4

public val MSG_WAITALL: CInt = 0x8

public val MSG_DONTWAIT: CInt = 0x10

public val MSG_NOSIGNAL: CInt = 0x20

public val MSG_TRUNC: CInt = 0x0100

public val MSG_CTRUNC: CInt = 0x0200

public val MSG_BCAST: CInt = 0x0400

public val MSG_MCAST: CInt = 0x0800

public val MSG_CMSG_CLOEXEC: CInt = 0x1000

public val MSG_EOR: CInt = 0x8000

public val SOL_IP: CInt = 0

public val SOL_IPV6: CInt = 41

public val SOL_TCP: CInt = 6

public val SOL_UDP: CInt = 17

public val IPTOS_LOWDELAY: UByte = 0x10u

public val IPTOS_THROUGHPUT: UByte = 0x08u

public val IPTOS_RELIABILITY: UByte = 0x04u

public val IPTOS_LOWCOST: UByte = 0x02u

public val IPTOS_MINCOST: UByte = IPTOS_LOWCOST

public val IP_DEFAULT_MULTICAST_TTL: CInt = 1

public val IP_DEFAULT_MULTICAST_LOOP: CInt = 1

public val IP_OPTIONS: CInt = 1

public val IP_HDRINCL: CInt = 2

public val IP_TOS: CInt = 3

public val IP_TTL: CInt = 4

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

public val IP_ADD_SOURCE_MEMBERSHIP: CInt = 15

public val IP_DROP_SOURCE_MEMBERSHIP: CInt = 16

public val IP_BLOCK_SOURCE: CInt = 17

public val IP_UNBLOCK_SOURCE: CInt = 18

public val IP_PKTINFO: CInt = 19

public val IP_RECVTTL: CInt = 21

public val IP_UNICAST_IF: CInt = 31

public val IP_RECVTOS: CInt = 40

public val IP_MTU_DISCOVER: CInt = 71

public val IP_MTU: CInt = 73

public val IP_RECVERR: CInt = 75

public val IP_PMTUDISC_WANT: CInt = 0

public val IP_PMTUDISC_DO: CInt = 1

public val IP_PMTUDISC_DONT: CInt = 2

public val IP_PMTUDISC_PROBE: CInt = 3

public val IPV6_HOPOPTS: CInt = 1

public val IPV6_HDRINCL: CInt = 2

public val IPV6_UNICAST_HOPS: CInt = 4

public val IPV6_MULTICAST_IF: CInt = 9

public val IPV6_MULTICAST_HOPS: CInt = 10

public val IPV6_MULTICAST_LOOP: CInt = 11

public val IPV6_ADD_MEMBERSHIP: CInt = 12

public val IPV6_DROP_MEMBERSHIP: CInt = 13

public val IPV6_JOIN_GROUP: CInt = 12

public val IPV6_LEAVE_GROUP: CInt = 13

public val IPV6_DONTFRAG: CInt = 14

public val IPV6_PKTINFO: CInt = 19

public val IPV6_HOPLIMIT: CInt = 21

public val IPV6_CHECKSUM: CInt = 26

public val IPV6_V6ONLY: CInt = 27

public val IPV6_UNICAST_IF: CInt = 31

public val IPV6_RTHDR: CInt = 32

public val IPV6_RECVRTHDR: CInt = 38

public val IPV6_TCLASS: CInt = 39

public val IPV6_RECVTCLASS: CInt = 40

public val IPV6_MTU_DISCOVER: CInt = 71

public val IPV6_MTU: CInt = 72

public val IPV6_RECVERR: CInt = 75

public val IPV6_PMTUDISC_WANT: CInt = 0

public val IPV6_PMTUDISC_DO: CInt = 1

public val IPV6_PMTUDISC_DONT: CInt = 2

public val IPV6_PMTUDISC_PROBE: CInt = 3

public val MCAST_JOIN_GROUP: CInt = 41

public val MCAST_LEAVE_GROUP: CInt = 42

public val MCAST_BLOCK_SOURCE: CInt = 43

public val MCAST_UNBLOCK_SOURCE: CInt = 44

public val MCAST_JOIN_SOURCE_GROUP: CInt = 45

public val MCAST_LEAVE_SOURCE_GROUP: CInt = 46

public val MCAST_INCLUDE: CInt = 0

public val MCAST_EXCLUDE: CInt = 1

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val S_BLKSIZE: ModeT = 1024u

public val S_IREAD: ModeT = 256u

public val S_IWRITE: ModeT = 128u

public val S_IEXEC: ModeT = 64u

public val S_ENFMT: ModeT = 1024u

public val S_IFMT: ModeT = 61440u

public val S_IFDIR: ModeT = 16384u

public val S_IFCHR: ModeT = 8192u

public val S_IFBLK: ModeT = 24576u

public val S_IFREG: ModeT = 32768u

public val S_IFLNK: ModeT = 40960u

public val S_IFSOCK: ModeT = 49152u

public val S_IFIFO: ModeT = 4096u

public val S_IRWXU: ModeT = 448u

public val S_IRUSR: ModeT = 256u

public val S_IWUSR: ModeT = 128u

public val S_IXUSR: ModeT = 64u

public val S_IRWXG: ModeT = 56u

public val S_IRGRP: ModeT = 32u

public val S_IWGRP: ModeT = 16u

public val S_IXGRP: ModeT = 8u

public val S_IRWXO: ModeT = 7u

public val S_IROTH: ModeT = 4u

public val S_IWOTH: ModeT = 2u

public val S_IXOTH: ModeT = 1u

public val UTIME_NOW: CLong = -2L

public val UTIME_OMIT: CLong = -1L

public val ARG_MAX: CInt = 32000

public val CHILD_MAX: CInt = 256

public val IOV_MAX: CInt = 1024

public val PTHREAD_STACK_MIN: SizeT = 65536uL

public val PATH_MAX: CInt = 4096

public val PIPE_BUF: Int = 4096

public val NGROUPS_MAX: CInt = 1024

public val FILENAME_MAX: CInt = 4096

public val FORK_RELOAD: CInt = 1

public val FORK_NO_RELOAD: CInt = 0

public val RTLD_DEFAULT: COpaquePointer? = null

public val RTLD_LOCAL: CInt = 0

public val RTLD_LAZY: CInt = 1

public val RTLD_NOW: CInt = 2

public val RTLD_GLOBAL: CInt = 4

public val RTLD_NODELETE: CInt = 8

public val RTLD_NOLOAD: CInt = 16

public val RTLD_DEEPBIND: CInt = 32

/**
 * IP6 hop-by-hop options
 */
public val IPPROTO_HOPOPTS: CInt = 0

/**
 * gateway mgmt protocol
 */
public val IPPROTO_IGMP: CInt = 2

/**
 * IPIP tunnels (older KA9Q tunnels use 94)
 */
public val IPPROTO_IPIP: CInt = 4

/**
 * exterior gateway protocol
 */
public val IPPROTO_EGP: CInt = 8

/**
 * pup
 */
public val IPPROTO_PUP: CInt = 12

/**
 * xns idp
 */
public val IPPROTO_IDP: CInt = 22

/**
 * IP6 routing header
 */
public val IPPROTO_ROUTING: CInt = 43

/**
 * IP6 fragmentation header
 */
public val IPPROTO_FRAGMENT: CInt = 44

/**
 * IP6 Encap Sec. Payload
 */
public val IPPROTO_ESP: CInt = 50

/**
 * IP6 Auth Header
 */
public val IPPROTO_AH: CInt = 51

/**
 * IP6 no next header
 */
public val IPPROTO_NONE: CInt = 59

/**
 * IP6 destination option
 */
public val IPPROTO_DSTOPTS: CInt = 60

public val IPPROTO_RAW: CInt = 255

public val IPPROTO_MAX: CInt = 256

public val AI_PASSIVE: CInt = 0x1

public val AI_CANONNAME: CInt = 0x2

public val AI_NUMERICHOST: CInt = 0x4

public val AI_NUMERICSERV: CInt = 0x8

public val AI_ALL: CInt = 0x100

public val AI_ADDRCONFIG: CInt = 0x400

public val AI_V4MAPPED: CInt = 0x800

public val NI_NOFQDN: CInt = 0x1

public val NI_NUMERICHOST: CInt = 0x2

public val NI_NAMEREQD: CInt = 0x4

public val NI_NUMERICSERV: CInt = 0x8

public val NI_DGRAM: CInt = 0x10

public val NI_MAXHOST: CInt = 1025

public val NI_MAXSERV: CInt = 32

public val EAI_AGAIN: CInt = 2

public val EAI_BADFLAGS: CInt = 3

public val EAI_FAIL: CInt = 4

public val EAI_FAMILY: CInt = 5

public val EAI_MEMORY: CInt = 6

public val EAI_NODATA: CInt = 7

public val EAI_NONAME: CInt = 8

public val EAI_SERVICE: CInt = 9

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SYSTEM: CInt = 11

public val EAI_OVERFLOW: CInt = 14

public val UT_LINESIZE: Int = 16

public val UT_NAMESIZE: Int = 16

public val UT_HOSTSIZE: Int = 256

public val UT_IDLEN: Int = 2

public val RUN_LVL: CShort = 1

public val BOOT_TIME: CShort = 2

public val NEW_TIME: CShort = 3

public val OLD_TIME: CShort = 4

public val INIT_PROCESS: CShort = 5

public val LOGIN_PROCESS: CShort = 6

public val USER_PROCESS: CShort = 7

public val DEAD_PROCESS: CShort = 8

public val POLLIN: CShort = 0x1

public val POLLPRI: CShort = 0x2

public val POLLOUT: CShort = 0x4

public val POLLERR: CShort = 0x8

public val POLLHUP: CShort = 0x10

public val POLLNVAL: CShort = 0x20

public val POLLRDNORM: CShort = 0x1

public val POLLRDBAND: CShort = 0x2

public val POLLWRNORM: CShort = 0x4

public val POLLWRBAND: CShort = 0x4

public val LC_ALL: CInt = 0

public val LC_COLLATE: CInt = 1

public val LC_CTYPE: CInt = 2

public val LC_MONETARY: CInt = 3

public val LC_NUMERIC: CInt = 4

public val LC_TIME: CInt = 5

public val LC_MESSAGES: CInt = 6

public val LC_ALL_MASK: CInt = 1 shl 0

public val LC_COLLATE_MASK: CInt = 1 shl 1

public val LC_CTYPE_MASK: CInt = 1 shl 2

public val LC_MONETARY_MASK: CInt = 1 shl 3

public val LC_NUMERIC_MASK: CInt = 1 shl 4

public val LC_TIME_MASK: CInt = 1 shl 5

public val LC_MESSAGES_MASK: CInt = 1 shl 6

public val LC_GLOBAL_LOCALE: LocaleT = (-1 as LocaleT)

public val SEM_FAILED: COpaquePointer? = null

public val ST_RDONLY: CUlong = 0x80000uL

public val ST_NOSUID: CUlong = 0uL

public val TIOCMGET: CInt = 0x5415

public val TIOCMBIS: CInt = 0x5416

public val TIOCMBIC: CInt = 0x5417

public val TIOCMSET: CInt = 0x5418

public val TIOCINQ: CInt = 0x541B

public val TIOCSCTTY: CInt = 0x540E

public val TIOCSBRK: CInt = 0x5427

public val TIOCCBRK: CInt = 0x5428

public val TIOCM_DTR: CInt = 0x002

public val TIOCM_RTS: CInt = 0x004

public val TIOCM_CTS: CInt = 0x020

public val TIOCM_CAR: CInt = 0x040

public val TIOCM_RNG: CInt = 0x080

public val TIOCM_CD: CInt = TIOCM_CAR

public val TIOCM_RI: CInt = TIOCM_RNG

public val TCOOFF: CInt = 0

public val TCOON: CInt = 1

public val TCIOFF: CInt = 2

public val TCION: CInt = 3

public val TCGETA: CInt = 5

public val TCSETA: CInt = 6

public val TCSETAW: CInt = 7

public val TCSETAF: CInt = 8

public val TCIFLUSH: CInt = 0

public val TCOFLUSH: CInt = 1

public val TCIOFLUSH: CInt = 2

public val TCFLSH: CInt = 3

public val TCSAFLUSH: CInt = 1

public val TCSANOW: CInt = 2

public val TCSADRAIN: CInt = 3

public val TIOCPKT: CInt = 6

public val TIOCPKT_DATA: CInt = 0x0

public val TIOCPKT_FLUSHREAD: CInt = 0x1

public val TIOCPKT_FLUSHWRITE: CInt = 0x2

public val TIOCPKT_STOP: CInt = 0x4

public val TIOCPKT_START: CInt = 0x8

public val TIOCPKT_NOSTOP: CInt = 0x10

public val TIOCPKT_DOSTOP: CInt = 0x20

public val IGNBRK: TcflagT = 0x00001u

public val BRKINT: TcflagT = 0x00002u

public val IGNPAR: TcflagT = 0x00004u

public val IMAXBEL: TcflagT = 0x00008u

public val INPCK: TcflagT = 0x00010u

public val ISTRIP: TcflagT = 0x00020u

public val INLCR: TcflagT = 0x00040u

public val IGNCR: TcflagT = 0x00080u

public val ICRNL: TcflagT = 0x00100u

public val IXON: TcflagT = 0x00400u

public val IXOFF: TcflagT = 0x01000u

public val IUCLC: TcflagT = 0x04000u

public val IXANY: TcflagT = 0x08000u

public val PARMRK: TcflagT = 0x10000u

public val IUTF8: TcflagT = 0x20000u

public val OPOST: TcflagT = 0x00001u

public val OLCUC: TcflagT = 0x00002u

public val OCRNL: TcflagT = 0x00004u

public val ONLCR: TcflagT = 0x00008u

public val ONOCR: TcflagT = 0x00010u

public val ONLRET: TcflagT = 0x00020u

public val OFILL: TcflagT = 0x00040u

public val CRDLY: TcflagT = 0x00180u

public val CR0: TcflagT = 0x00000u

public val CR1: TcflagT = 0x00080u

public val CR2: TcflagT = 0x00100u

public val CR3: TcflagT = 0x00180u

public val NLDLY: TcflagT = 0x00200u

public val NL0: TcflagT = 0x00000u

public val NL1: TcflagT = 0x00200u

public val BSDLY: TcflagT = 0x00400u

public val BS0: TcflagT = 0x00000u

public val BS1: TcflagT = 0x00400u

public val TABDLY: TcflagT = 0x01800u

public val TAB0: TcflagT = 0x00000u

public val TAB1: TcflagT = 0x00800u

public val TAB2: TcflagT = 0x01000u

public val TAB3: TcflagT = 0x01800u

public val XTABS: TcflagT = 0x01800u

public val VTDLY: TcflagT = 0x02000u

public val VT0: TcflagT = 0x00000u

public val VT1: TcflagT = 0x02000u

public val FFDLY: TcflagT = 0x04000u

public val FF0: TcflagT = 0x00000u

public val FF1: TcflagT = 0x04000u

public val OFDEL: TcflagT = 0x08000u

public val CBAUD: TcflagT = 0x0100fu

public val B0: SpeedT = 0x00000u

public val B50: SpeedT = 0x00001u

public val B75: SpeedT = 0x00002u

public val B110: SpeedT = 0x00003u

public val B134: SpeedT = 0x00004u

public val B150: SpeedT = 0x00005u

public val B200: SpeedT = 0x00006u

public val B300: SpeedT = 0x00007u

public val B600: SpeedT = 0x00008u

public val B1200: SpeedT = 0x00009u

public val B1800: SpeedT = 0x0000au

public val B2400: SpeedT = 0x0000bu

public val B4800: SpeedT = 0x0000cu

public val B9600: SpeedT = 0x0000du

public val B19200: SpeedT = 0x0000eu

public val B38400: SpeedT = 0x0000fu

public val CSIZE: TcflagT = 0x00030u

public val CS5: TcflagT = 0x00000u

public val CS6: TcflagT = 0x00010u

public val CS7: TcflagT = 0x00020u

public val CS8: TcflagT = 0x00030u

public val CSTOPB: TcflagT = 0x00040u

public val CREAD: TcflagT = 0x00080u

public val PARENB: TcflagT = 0x00100u

public val PARODD: TcflagT = 0x00200u

public val HUPCL: TcflagT = 0x00400u

public val CLOCAL: TcflagT = 0x00800u

public val CBAUDEX: TcflagT = 0x0100fu

public val B57600: SpeedT = 0x01001u

public val B115200: SpeedT = 0x01002u

public val B230400: SpeedT = 0x01004u

public val B460800: SpeedT = 0x01006u

public val B500000: SpeedT = 0x01007u

public val B576000: SpeedT = 0x01008u

public val B921600: SpeedT = 0x01009u

public val B1000000: SpeedT = 0x0100au

public val B1152000: SpeedT = 0x0100bu

public val B1500000: SpeedT = 0x0100cu

public val B2000000: SpeedT = 0x0100du

public val B2500000: SpeedT = 0x0100eu

public val B3000000: SpeedT = 0x0100fu

public val CRTSCTS: TcflagT = 0x08000u

public val CMSPAR: TcflagT = 0x40000000u

public val ISIG: TcflagT = 0x0001u

public val ICANON: TcflagT = 0x0002u

public val ECHO: TcflagT = 0x0004u

public val ECHOE: TcflagT = 0x0008u

public val ECHOK: TcflagT = 0x0010u

public val ECHONL: TcflagT = 0x0020u

public val NOFLSH: TcflagT = 0x0040u

public val TOSTOP: TcflagT = 0x0080u

public val IEXTEN: TcflagT = 0x0100u

public val FLUSHO: TcflagT = 0x0200u

public val ECHOKE: TcflagT = 0x0400u

public val ECHOCTL: TcflagT = 0x0800u

public val VDISCARD: Int = 1

public val VEOL: Int = 2

public val VEOL2: Int = 3

public val VEOF: Int = 4

public val VERASE: Int = 5

public val VINTR: Int = 6

public val VKILL: Int = 7

public val VLNEXT: Int = 8

public val VMIN: Int = 9

public val VQUIT: Int = 10

public val VREPRINT: Int = 11

public val VSTART: Int = 12

public val VSTOP: Int = 13

public val VSUSP: Int = 14

public val VSWTC: Int = 15

public val VTIME: Int = 16

public val VWERASE: Int = 17

public val NCCS: Int = 18

public val TIOCGWINSZ: CInt = 0x5401

public val TIOCSWINSZ: CInt = 0x5402

public val TIOCLINUX: CInt = 0x5403

public val TIOCGPGRP: CInt = 0x540f

public val TIOCSPGRP: CInt = 0x5410

public val WNOHANG: CInt = 1

public val WUNTRACED: CInt = 2

public val WCONTINUED: CInt = 8

public val EXIT_FAILURE: CInt = 1

public val EXIT_SUCCESS: CInt = 0

public val PROT_NONE: CInt = 0

public val PROT_READ: CInt = 1

public val PROT_WRITE: CInt = 2

public val PROT_EXEC: CInt = 4

public val MAP_FILE: CInt = 0

public val MAP_SHARED: CInt = 1

public val MAP_PRIVATE: CInt = 2

public val MAP_TYPE: CInt = 0xf

public val MAP_FIXED: CInt = 0x10

public val MAP_ANON: CInt = 0x20

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val MAP_NORESERVE: CInt = 0x4000

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

public val MS_ASYNC: CInt = 1

public val MS_SYNC: CInt = 2

public val MS_INVALIDATE: CInt = 4

public val POSIX_MADV_NORMAL: CInt = 0

public val POSIX_MADV_SEQUENTIAL: CInt = 1

public val POSIX_MADV_RANDOM: CInt = 2

public val POSIX_MADV_WILLNEED: CInt = 3

public val POSIX_MADV_DONTNEED: CInt = 4

public val MADV_NORMAL: CInt = 0

public val MADV_SEQUENTIAL: CInt = 1

public val MADV_RANDOM: CInt = 2

public val MADV_WILLNEED: CInt = 3

public val MADV_DONTNEED: CInt = 4

public val F_ULOCK: CInt = 0

public val F_LOCK: CInt = 1

public val F_TLOCK: CInt = 2

public val F_TEST: CInt = 3

public val F_OK: CInt = 0

public val R_OK: CInt = 4

public val W_OK: CInt = 2

public val X_OK: CInt = 1

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

public val SC_ARG_MAX: CInt = 0

public val SC_CHILD_MAX: CInt = 1

public val SC_CLK_TCK: CInt = 2

public val SC_NGROUPS_MAX: CInt = 3

public val SC_OPEN_MAX: CInt = 4

public val SC_JOB_CONTROL: CInt = 5

public val SC_SAVED_IDS: CInt = 6

public val SC_VERSION: CInt = 7

public val SC_PAGESIZE: CInt = 8

public val SC_PAGE_SIZE: CInt = SC_PAGESIZE

public val SC_NPROCESSORS_CONF: CInt = 9

public val SC_NPROCESSORS_ONLN: CInt = 10

public val SC_PHYS_PAGES: CInt = 11

public val SC_AVPHYS_PAGES: CInt = 12

public val SC_MQ_OPEN_MAX: CInt = 13

public val SC_MQ_PRIO_MAX: CInt = 14

public val SC_RTSIG_MAX: CInt = 15

public val SC_SEM_NSEMS_MAX: CInt = 16

public val SC_SEM_VALUE_MAX: CInt = 17

public val SC_SIGQUEUE_MAX: CInt = 18

public val SC_TIMER_MAX: CInt = 19

public val SC_TZNAME_MAX: CInt = 20

public val SC_ASYNCHRONOUS_IO: CInt = 21

public val SC_FSYNC: CInt = 22

public val SC_MAPPED_FILES: CInt = 23

public val SC_MEMLOCK: CInt = 24

public val SC_MEMLOCK_RANGE: CInt = 25

public val SC_MEMORY_PROTECTION: CInt = 26

public val SC_MESSAGE_PASSING: CInt = 27

public val SC_PRIORITIZED_IO: CInt = 28

public val SC_REALTIME_SIGNALS: CInt = 29

public val SC_SEMAPHORES: CInt = 30

public val SC_SHARED_MEMORY_OBJECTS: CInt = 31

public val SC_SYNCHRONIZED_IO: CInt = 32

public val SC_TIMERS: CInt = 33

public val SC_AIO_LISTIO_MAX: CInt = 34

public val SC_AIO_MAX: CInt = 35

public val SC_AIO_PRIO_DELTA_MAX: CInt = 36

public val SC_DELAYTIMER_MAX: CInt = 37

public val SC_THREAD_KEYS_MAX: CInt = 38

public val SC_THREAD_STACK_MIN: CInt = 39

public val SC_THREAD_THREADS_MAX: CInt = 40

public val SC_TTY_NAME_MAX: CInt = 41

public val SC_THREADS: CInt = 42

public val SC_THREAD_ATTR_STACKADDR: CInt = 43

public val SC_THREAD_ATTR_STACKSIZE: CInt = 44

public val SC_THREAD_PRIORITY_SCHEDULING: CInt = 45

public val SC_THREAD_PRIO_INHERIT: CInt = 46

public val SC_THREAD_PRIO_PROTECT: CInt = 47

public val SC_THREAD_PRIO_CEILING: CInt = SC_THREAD_PRIO_PROTECT

public val SC_THREAD_PROCESS_SHARED: CInt = 48

public val SC_THREAD_SAFE_FUNCTIONS: CInt = 49

public val SC_GETGR_R_SIZE_MAX: CInt = 50

public val SC_GETPW_R_SIZE_MAX: CInt = 51

public val SC_LOGIN_NAME_MAX: CInt = 52

public val SC_THREAD_DESTRUCTOR_ITERATIONS: CInt = 53

public val SC_ADVISORY_INFO: CInt = 54

public val SC_ATEXIT_MAX: CInt = 55

public val SC_BARRIERS: CInt = 56

public val SC_BC_BASE_MAX: CInt = 57

public val SC_BC_DIM_MAX: CInt = 58

public val SC_BC_SCALE_MAX: CInt = 59

public val SC_BC_STRING_MAX: CInt = 60

public val SC_CLOCK_SELECTION: CInt = 61

public val SC_COLL_WEIGHTS_MAX: CInt = 62

public val SC_CPUTIME: CInt = 63

public val SC_EXPR_NEST_MAX: CInt = 64

public val SC_HOST_NAME_MAX: CInt = 65

public val SC_IOV_MAX: CInt = 66

public val SC_IPV6: CInt = 67

public val SC_LINE_MAX: CInt = 68

public val SC_MONOTONIC_CLOCK: CInt = 69

public val SC_RAW_SOCKETS: CInt = 70

public val SC_READER_WRITER_LOCKS: CInt = 71

public val SC_REGEXP: CInt = 72

public val SC_RE_DUP_MAX: CInt = 73

public val SC_SHELL: CInt = 74

public val SC_SPAWN: CInt = 75

public val SC_SPIN_LOCKS: CInt = 76

public val SC_SPORADIC_SERVER: CInt = 77

public val SC_SS_REPL_MAX: CInt = 78

public val SC_SYMLOOP_MAX: CInt = 79

public val SC_THREAD_CPUTIME: CInt = 80

public val SC_THREAD_SPORADIC_SERVER: CInt = 81

public val SC_TIMEOUTS: CInt = 82

public val SC_TRACE: CInt = 83

public val SC_TRACE_EVENT_FILTER: CInt = 84

public val SC_TRACE_EVENT_NAME_MAX: CInt = 85

public val SC_TRACE_INHERIT: CInt = 86

public val SC_TRACE_LOG: CInt = 87

public val SC_TRACE_NAME_MAX: CInt = 88

public val SC_TRACE_SYS_MAX: CInt = 89

public val SC_TRACE_USER_EVENT_MAX: CInt = 90

public val SC_TYPED_MEMORY_OBJECTS: CInt = 91

public val SC_V7_ILP32_OFF32: CInt = 92

public val SC_V6_ILP32_OFF32: CInt = SC_V7_ILP32_OFF32

public val SC_XBS5_ILP32_OFF32: CInt = SC_V7_ILP32_OFF32

public val SC_V7_ILP32_OFFBIG: CInt = 93

public val SC_V6_ILP32_OFFBIG: CInt = SC_V7_ILP32_OFFBIG

public val SC_XBS5_ILP32_OFFBIG: CInt = SC_V7_ILP32_OFFBIG

public val SC_V7_LP64_OFF64: CInt = 94

public val SC_V6_LP64_OFF64: CInt = SC_V7_LP64_OFF64

public val SC_XBS5_LP64_OFF64: CInt = SC_V7_LP64_OFF64

public val SC_V7_LPBIG_OFFBIG: CInt = 95

public val SC_V6_LPBIG_OFFBIG: CInt = SC_V7_LPBIG_OFFBIG

public val SC_XBS5_LPBIG_OFFBIG: CInt = SC_V7_LPBIG_OFFBIG

public val SC_XOPEN_CRYPT: CInt = 96

public val SC_XOPEN_ENH_I18N: CInt = 97

public val SC_XOPEN_LEGACY: CInt = 98

public val SC_XOPEN_REALTIME: CInt = 99

public val SC_STREAM_MAX: CInt = 100

public val SC_PRIORITY_SCHEDULING: CInt = 101

public val SC_XOPEN_REALTIME_THREADS: CInt = 102

public val SC_XOPEN_SHM: CInt = 103

public val SC_XOPEN_STREAMS: CInt = 104

public val SC_XOPEN_UNIX: CInt = 105

public val SC_XOPEN_VERSION: CInt = 106

public val SC_2_CHAR_TERM: CInt = 107

public val SC_2_C_BIND: CInt = 108

public val SC_2_C_DEV: CInt = 109

public val SC_2_FORT_DEV: CInt = 110

public val SC_2_FORT_RUN: CInt = 111

public val SC_2_LOCALEDEF: CInt = 112

public val SC_2_PBS: CInt = 113

public val SC_2_PBS_ACCOUNTING: CInt = 114

public val SC_2_PBS_CHECKPOINT: CInt = 115

public val SC_2_PBS_LOCATE: CInt = 116

public val SC_2_PBS_MESSAGE: CInt = 117

public val SC_2_PBS_TRACK: CInt = 118

public val SC_2_SW_DEV: CInt = 119

public val SC_2_UPE: CInt = 120

public val SC_2_VERSION: CInt = 121

public val SC_THREAD_ROBUST_PRIO_INHERIT: CInt = 122

public val SC_THREAD_ROBUST_PRIO_PROTECT: CInt = 123

public val SC_XOPEN_UUCP: CInt = 124

public val SC_LEVEL1_ICACHE_SIZE: CInt = 125

public val SC_LEVEL1_ICACHE_ASSOC: CInt = 126

public val SC_LEVEL1_ICACHE_LINESIZE: CInt = 127

public val SC_LEVEL1_DCACHE_SIZE: CInt = 128

public val SC_LEVEL1_DCACHE_ASSOC: CInt = 129

public val SC_LEVEL1_DCACHE_LINESIZE: CInt = 130

public val SC_LEVEL2_CACHE_SIZE: CInt = 131

public val SC_LEVEL2_CACHE_ASSOC: CInt = 132

public val SC_LEVEL2_CACHE_LINESIZE: CInt = 133

public val SC_LEVEL3_CACHE_SIZE: CInt = 134

public val SC_LEVEL3_CACHE_ASSOC: CInt = 135

public val SC_LEVEL3_CACHE_LINESIZE: CInt = 136

public val SC_LEVEL4_CACHE_SIZE: CInt = 137

public val SC_LEVEL4_CACHE_ASSOC: CInt = 138

public val SC_LEVEL4_CACHE_LINESIZE: CInt = 139

public val PC_LINK_MAX: CInt = 0

public val PC_MAX_CANON: CInt = 1

public val PC_MAX_INPUT: CInt = 2

public val PC_NAME_MAX: CInt = 3

public val PC_PATH_MAX: CInt = 4

public val PC_PIPE_BUF: CInt = 5

public val PC_CHOWN_RESTRICTED: CInt = 6

public val PC_NO_TRUNC: CInt = 7

public val PC_VDISABLE: CInt = 8

public val PC_ASYNC_IO: CInt = 9

public val PC_PRIO_IO: CInt = 10

public val PC_SYNC_IO: CInt = 11

public val PC_FILESIZEBITS: CInt = 12

public val PC_2_SYMLINKS: CInt = 13

public val PC_SYMLINK_MAX: CInt = 14

public val PC_ALLOC_SIZE_MIN: CInt = 15

public val PC_REC_INCR_XFER_SIZE: CInt = 16

public val PC_REC_MAX_XFER_SIZE: CInt = 17

public val PC_REC_MIN_XFER_SIZE: CInt = 18

public val PC_REC_XFER_ALIGN: CInt = 19

public val PC_TIMESTAMP_RESOLUTION: CInt = 20

public val CS_PATH: CInt = 0

public val O_ACCMODE: CInt = 0x3

public val O_RDONLY: CInt = 0

public val O_WRONLY: CInt = 1

public val O_RDWR: CInt = 2

public val O_APPEND: CInt = 0x0008

public val O_CREAT: CInt = 0x0200

public val O_TRUNC: CInt = 0x0400

public val O_EXCL: CInt = 0x0800

public val O_SYNC: CInt = 0x2000

public val O_NONBLOCK: CInt = 0x4000

public val O_NOCTTY: CInt = 0x8000

public val O_CLOEXEC: CInt = 0x40000

public val O_NOFOLLOW: CInt = 0x100000

public val O_DIRECTORY: CInt = 0x200000

public val O_EXEC: CInt = 0x400000

public val O_SEARCH: CInt = 0x400000

public val O_DIRECT: CInt = 0x80000

public val O_DSYNC: CInt = 0x2000

public val O_RSYNC: CInt = 0x2000

public val O_TMPFILE: CInt = 0x800000

public val O_NOATIME: CInt = 0x1000000

public val O_PATH: CInt = 0x2000000

public val F_DUPFD: CInt = 0

public val F_GETFD: CInt = 1

public val F_SETFD: CInt = 2

public val F_GETFL: CInt = 3

public val F_SETFL: CInt = 4

public val F_GETOWN: CInt = 5

public val F_SETOWN: CInt = 6

public val F_GETLK: CInt = 7

public val F_SETLK: CInt = 8

public val F_SETLKW: CInt = 9

public val F_RGETLK: CInt = 10

public val F_RSETLK: CInt = 11

public val F_CNVT: CInt = 12

public val F_RSETLKW: CInt = 13

public val F_DUPFD_CLOEXEC: CInt = 14

public val F_RDLCK: CInt = 1

public val F_WRLCK: CInt = 2

public val F_UNLCK: CInt = 3

public val AT_FDCWD: CInt = -2

public val AT_EACCESS: CInt = 1

public val AT_SYMLINK_NOFOLLOW: CInt = 2

public val AT_SYMLINK_FOLLOW: CInt = 4

public val AT_REMOVEDIR: CInt = 8

public val AT_EMPTY_PATH: CInt = 16

public val LOCK_SH: CInt = 1

public val LOCK_EX: CInt = 2

public val LOCK_NB: CInt = 4

public val LOCK_UN: CInt = 8

public val EPERM: CInt = 1

public val ENOENT: CInt = 2

public val ESRCH: CInt = 3

public val EINTR: CInt = 4

public val EIO: CInt = 5

public val ENXIO: CInt = 6

public val E2BIG: CInt = 7

public val ENOEXEC: CInt = 8

public val EBADF: CInt = 9

public val ECHILD: CInt = 10

public val EAGAIN: CInt = 11

public val ENOMEM: CInt = 12

public val EACCES: CInt = 13

public val EFAULT: CInt = 14

public val ENOTBLK: CInt = 15

public val EBUSY: CInt = 16

public val EEXIST: CInt = 17

public val EXDEV: CInt = 18

public val ENODEV: CInt = 19

public val ENOTDIR: CInt = 20

public val EISDIR: CInt = 21

public val EINVAL: CInt = 22

public val ENFILE: CInt = 23

public val EMFILE: CInt = 24

public val ENOTTY: CInt = 25

public val ETXTBSY: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDOM: CInt = 33

public val ERANGE: CInt = 34

public val ENOMSG: CInt = 35

public val EIDRM: CInt = 36

public val ECHRNG: CInt = 37

public val EL2NSYNC: CInt = 38

public val EL3HLT: CInt = 39

public val EL3RST: CInt = 40

public val ELNRNG: CInt = 41

public val EUNATCH: CInt = 42

public val ENOCSI: CInt = 43

public val EL2HLT: CInt = 44

public val EDEADLK: CInt = 45

public val ENOLCK: CInt = 46

public val EBADE: CInt = 50

public val EBADR: CInt = 51

public val EXFULL: CInt = 52

public val ENOANO: CInt = 53

public val EBADRQC: CInt = 54

public val EBADSLT: CInt = 55

public val EDEADLOCK: CInt = 56

public val EBFONT: CInt = 57

public val ENOSTR: CInt = 60

public val ENODATA: CInt = 61

public val ETIME: CInt = 62

public val ENOSR: CInt = 63

public val ENONET: CInt = 64

public val ENOPKG: CInt = 65

public val EREMOTE: CInt = 66

public val ENOLINK: CInt = 67

public val EADV: CInt = 68

public val ESRMNT: CInt = 69

public val ECOMM: CInt = 70

public val EPROTO: CInt = 71

public val EMULTIHOP: CInt = 74

public val EDOTDOT: CInt = 76

public val EBADMSG: CInt = 77

public val EFTYPE: CInt = 79

public val ENOTUNIQ: CInt = 80

public val EBADFD: CInt = 81

public val EREMCHG: CInt = 82

public val ELIBACC: CInt = 83

public val ELIBBAD: CInt = 84

public val ELIBSCN: CInt = 85

public val ELIBMAX: CInt = 86

public val ELIBEXEC: CInt = 87

public val ENOSYS: CInt = 88

public val ENOTEMPTY: CInt = 90

public val ENAMETOOLONG: CInt = 91

public val ELOOP: CInt = 92

public val EOPNOTSUPP: CInt = 95

public val EPFNOSUPPORT: CInt = 96

public val ECONNRESET: CInt = 104

public val ENOBUFS: CInt = 105

public val EAFNOSUPPORT: CInt = 106

public val EPROTOTYPE: CInt = 107

public val ENOTSOCK: CInt = 108

public val ENOPROTOOPT: CInt = 109

public val ESHUTDOWN: CInt = 110

public val ECONNREFUSED: CInt = 111

public val EADDRINUSE: CInt = 112

public val ECONNABORTED: CInt = 113

public val ENETUNREACH: CInt = 114

public val ENETDOWN: CInt = 115

public val ETIMEDOUT: CInt = 116

public val EHOSTDOWN: CInt = 117

public val EHOSTUNREACH: CInt = 118

public val EINPROGRESS: CInt = 119

public val EALREADY: CInt = 120

public val EDESTADDRREQ: CInt = 121

public val EMSGSIZE: CInt = 122

public val EPROTONOSUPPORT: CInt = 123

public val ESOCKTNOSUPPORT: CInt = 124

public val EADDRNOTAVAIL: CInt = 125

public val ENETRESET: CInt = 126

public val EISCONN: CInt = 127

public val ENOTCONN: CInt = 128

public val ETOOMANYREFS: CInt = 129

public val EPROCLIM: CInt = 130

public val EUSERS: CInt = 131

public val EDQUOT: CInt = 132

public val ESTALE: CInt = 133

public val ENOTSUP: CInt = 134

public val ENOMEDIUM: CInt = 135

public val EILSEQ: CInt = 138

public val EOVERFLOW: CInt = 139

public val ECANCELED: CInt = 140

public val ENOTRECOVERABLE: CInt = 141

public val EOWNERDEAD: CInt = 142

public val ESTRPIPE: CInt = 143

public val EWOULDBLOCK: CInt = EAGAIN

// Operation would block
public val SCHED_OTHER: CInt = 3

public val SCHED_FIFO: CInt = 1

public val SCHED_RR: CInt = 2

public val PTHREAD_COND_INITIALIZER: PthreadCondT = COpaquePointer(21.toLong())

public val PTHREAD_CREATE_DETACHED: CInt = 1

public val PTHREAD_CREATE_JOINABLE: CInt = 0

public val PTHREAD_MUTEX_RECURSIVE: CInt = 0

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 1

public val PTHREAD_MUTEX_NORMAL: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_RECURSIVE_MUTEX_INITIALIZER_NP: PthreadMutexT = COpaquePointer(18.toLong())

public val PTHREAD_ERRORCHECK_MUTEX_INITIALIZER_NP: PthreadMutexT = COpaquePointer(20.toLong())

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = COpaquePointer(19.toLong())

public val PTHREAD_PROCESS_SHARED: CInt = 1

public val PTHREAD_PROCESS_PRIVATE: CInt = 0

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = COpaquePointer(22.toLong())

public val LITTLE_ENDIAN: CInt = 1234

public val BIG_ENDIAN: CInt = 4321

public val TCP_NODELAY: CInt = 1

public val TCP_KEEPIDLE: CInt = 3

public val TCP_MAXSEG: CInt = 4

public val TCP_QUICKACK: CInt = 12

public val TCP_USER_TIMEOUT: CInt = 14

public val TCP_FASTOPEN: CInt = 15

public val TCP_KEEPCNT: CInt = 16

public val TCP_KEEPINTVL: CInt = 17

public val WINDOWS_POST: CInt = 0

public val WINDOWS_SEND: CInt = 1

public val WINDOWS_HWND: CInt = 2

public val MOUNT_TEXT: CUint = 0x01u

public val MOUNT_SYSTEM: CUint = 0x08u

public val MOUNT_EXEC: CUint = 0x10u

public val MOUNT_CYGDRIVE: CUint = 0x20u

public val MOUNT_CYGWIN_EXEC: CUint = 0x40u

public val MOUNT_SPARSE: CUint = 0x80u

public val MOUNT_NOTEXEC: CUint = 0x100u

public val MOUNT_DEVFS: CUint = 0x200u

public val MOUNT_PROC: CUint = 0x400u

public val MOUNT_RO: CUint = 0x1000u

public val MOUNT_NOACL: CUint = 0x2000u

public val MOUNT_NOPOSIX: CUint = 0x4000u

public val MOUNT_OVERRIDE: CUint = 0x8000u

public val MOUNT_IMMUTABLE: CUint = 0x10000u

public val MOUNT_AUTOMATIC: CUint = 0x20000u

public val MOUNT_DOS: CUint = 0x40000u

public val MOUNT_IHASH: CUint = 0x80000u

public val MOUNT_BIND: CUint = 0x100000u

public val MOUNT_USER_TEMP: CUint = 0x200000u

public val MOUNT_DONT_USE: CUint = 0x80000000u

public val POSIX_VDISABLE: CcT = 0

public val GRND_NONBLOCK: CUint = 0x1u

public val GRND_RANDOM: CUint = 0x2u

public val IOFBF: CInt = 0

public val IOLBF: CInt = 1

public val IONBF: CInt = 2

public val BUFSIZ: CInt = 1024

public val POSIX_SPAWN_RESETIDS: CInt = 0x01

public val POSIX_SPAWN_SETPGROUP: CInt = 0x02

public val POSIX_SPAWN_SETSCHEDPARAM: CInt = 0x04

public val POSIX_SPAWN_SETSCHEDULER: CInt = 0x08

public val POSIX_SPAWN_SETSIGDEF: CInt = 0x10

public val POSIX_SPAWN_SETSIGMASK: CInt = 0x20

public val POSIX_FADV_NORMAL: CInt = 0

public val POSIX_FADV_SEQUENTIAL: CInt = 1

public val POSIX_FADV_RANDOM: CInt = 2

public val POSIX_FADV_WILLNEED: CInt = 3

public val POSIX_FADV_DONTNEED: CInt = 4

public val POSIX_FADV_NOREUSE: CInt = 5

public val FALLOC_FL_PUNCH_HOLE: CInt = 0x0001

public val FALLOC_FL_ZERO_RANGE: CInt = 0x0002

public val FALLOC_FL_UNSHARE_RANGE: CInt = 0x0004

public val FALLOC_FL_COLLAPSE_RANGE: CInt = 0x0008

public val FALLOC_FL_INSERT_RANGE: CInt = 0x0010

public val FALLOC_FL_KEEP_SIZE: CInt = 0x1000

public fun fdClr(fd: CInt, set: FdSet?) {
    val fd1 = fd.toInt()
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set!!.fdsBits[fd1 / size] and (1 shl (fd1 % size)).inv()
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val fd1 = fd.toInt()
    val size = 8 * 8
    return (set!!.fdsBits[fd1 / size] and (1 shl (fd1 % size))) != 0
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val fd1 = fd.toInt()
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set!!.fdsBits[fd1 / size] or (1 shl (fd1 % size))
}

public fun fdZero(set: FdSet?) {
    for (slot in set!!.fdsBits.iterMut()) {
        slot = 0
    }
}

public fun cpuAllocSize(count: CInt): SizeT {
    val dummy: CpuSetT = Any(bits = List(16) { 0 })
    val sizeInBits = 8 * 8
    return ((count.toULong() + sizeInBits - 1uL) / 8uL).toULong()
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = 8
    for (i in cpuset.bits[0 until (size / sizeOfMask)].iter()) {
        s += i.countOnes()
    }
    return s.toInt()
}

public fun cpuZero(cpuset: CpuSetT) {
    for (slot in cpuset.bits.iterMut()) {
        slot = 0
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
    }
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * 8
    if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
    }
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * 8
    return if (cpu < sizeInBits) {
        val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
        0uL != (cpuset.bits[idx] and (1uL shl offset))
    } else {
        false
    }
}

public fun cpuCount(cpuset: CpuSetT): CInt {
    return CPU_COUNT_S(sizeOf<CpuSetT>(), cpuset)
}

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean {
    return set1.bits == set2.bits
}

public fun cmsgLen(length: CUint): CUint {
    return CMSG_ALIGN(sizeOf<Cmsghdr>()).toUInt() + length
}

public fun cmsgSpace(length: CUint): CUint {
    return (CMSG_ALIGN(length.toInt()) + CMSG_ALIGN(sizeOf<Cmsghdr>())).toUInt()
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() >= sizeOf<Cmsghdr>()) {
        mhdr!!.msgControl.cast()
    } else {
        null
    }
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    val next = null
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + (mhdr!!.msgControllen).toInt()
    return if (((next)?.hashCode()?.toLong() ?: 0L).toInt() + CMSG_ALIGN(sizeOf<Cmsghdr>()).toInt() > max) {
        null
    } else {
        next
    }
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return (cmsg)?.let { COpaquePointer(it.hashCode().toLong() + (1).toLong()) }.castMut().cast()
}

public fun makedev(ma: CUint, mi: CUint): DevT {
    val ma1 = ma.toUInt()
    val mi1 = mi.toUInt()
    return (ma1 shl 16) or (mi1 and 0xffffu)
}

public fun major(dev: DevT): CUint {
    return ((dev shr 16) and 0xffffu).toUInt()
}

public fun minor(dev: DevT): CUint {
    return (dev and 0xffffu).toUInt()
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0xff) == 0
}

public fun wifsignaled(status: CInt): Boolean {
    return (status and 127) != 127 && (status and 127) != 0
}

public fun wifstopped(status: CInt): Boolean {
    return (status and 0xff) == 127
}

public fun wifcontinued(status: CInt): Boolean {
    return (status and 65535) == 65535
}

public fun wexitstatus(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wtermsig(status: CInt): CInt {
    return status and 127
}

public fun wstopsig(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wcoredump(status: CInt): Boolean {
    return WIFSIGNALED(status) && (status and 0x80) != 0
}

public fun cmsgAlign(len: Int): Int {
    return len + sizeOf<Int>() - 1 and (sizeOf<Int>() - 1).inv()
}

public expect fun sigwait(set: CUlong?, sig: CInt?): CInt

public expect fun sigwaitinfo(set: CUlong?, info: SiginfoT?): CInt

public expect fun pthreadSigmask(how: CInt, set: CUlong?, oldset: CUlong?): CInt

public expect fun sigsuspend(mask: CUlong?): CInt

public expect fun sigaltstack(ss: StackT?, oss: StackT?): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun sigtimedwait(set: CUlong?, info: SiginfoT?, timeout: Timespec?): CInt

public expect fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: Tm?): SizeT

public expect fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(timep: CLong?, buf: COpaquePointer?): COpaquePointer?

public expect fun strptime(s: String?, format: String?, tm: Tm?): COpaquePointer?

public expect fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt

public expect fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt

public expect fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: CUlong?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt

public expect fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: CUlong?): CInt

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

public expect fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

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

public expect fun dlfork(value: CInt)

public expect fun accept4(s: CInt, addr: Sockaddr?, addrlen: CInt?, flags: CInt): CInt

public expect fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: CInt?): SsizeT

public expect fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT

public expect fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, sevlen: SocklenT, flags: CInt): CInt

public expect fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: CUlong?): CInt

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun semTimedwait(sem: COpaquePointer?, abstime: Timespec?): CInt

public expect fun semGetvalue(sem: COpaquePointer?, sval: CInt?): CInt

public expect fun clearenv(): CInt

public expect fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun getpt(): CInt

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt

public expect fun abs(i: CInt): CInt

public expect fun arc4random(): UInt

public expect fun arc4randomUniform(l: UInt): UInt

public expect fun arc4randomBuf(buf: COpaquePointer?, size: SizeT)

public expect fun labs(i: CLong): CLong

public expect fun mkostemp(template: COpaquePointer?, flags: CInt): CInt

public expect fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun rand(): CInt

public expect fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer?

public expect fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun srand(seed: CUint)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: CUshort?): CDouble

public expect fun jrand48(xseed: CUshort?): CLong

public expect fun lcong48(p: CUshort?)

public expect fun lrand48(): CLong

public expect fun mrand48(): CLong

public expect fun nrand48(xseed: CUshort?): CLong

public expect fun seed48(xseed: CUshort?): CUshort?

public expect fun srand48(seed: CLong)

public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?)

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun explicitBzero(s: COpaquePointer?, len: SizeT)

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLonglong): CInt

public expect fun fls(value: CInt): CInt

public expect fun flsl(value: CLong): CInt

public expect fun flsll(value: CLonglong): CInt

public expect fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt

public expect fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt

public expect fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt

public expect fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer?

public expect fun basename(path: String?): COpaquePointer?

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun eaccess(pathname: String?, mode: CInt): CInt

public expect fun euidaccess(pathname: String?, mode: CInt): CInt

public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun getdomainname(name: COpaquePointer?, len: SizeT): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun gethostid(): CLong

public expect fun getpagesize(): CInt

public expect fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun pipe2(fds: CInt?, flags: CInt): CInt

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun setgroups(ngroups: CInt, ptr: GidT?): CInt

public expect fun sethostname(name: String?, len: SizeT): CInt

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

public expect fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpuSetT?): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt

public expect fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt

public expect fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: CUlong?): CInt

public expect fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadBarrierattrInit(attr: ULong?): CInt

public expect fun pthreadBarrierattrSetpshared(attr: ULong?, shared: CInt): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ULong?, shared: CInt?): CInt

public expect fun pthreadBarrierattrDestroy(attr: ULong?): CInt

public expect fun pthreadBarrierInit(barrier: ULong?, attr: ULong?, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: ULong?): CInt

public expect fun pthreadBarrierWait(barrier: ULong?): CInt

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: CUlong?): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt

public expect fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: Timespec?): CInt

public expect fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: CInt?): CInt

public expect fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt

public expect fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: ULong?): CInt

public expect fun pthreadSpinInit(lock: ULong?, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: ULong?): CInt

public expect fun pthreadSpinTrylock(lock: ULong?): CInt

public expect fun pthreadSpinUnlock(lock: ULong?): CInt

public expect fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: CInt?): CInt

public expect fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

public expect fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun mount(src: String?, target: String?, flags: CUint): CInt

public expect fun umount(target: String?): CInt

public expect fun cygwinUmount(target: String?, flags: CUint): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun uname(buf: Utsname?): CInt

public expect fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: CUlong?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: CUlong?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: CUlong?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: CUlong?): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: CInt?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt

public expect fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt

public expect fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt

public expect fun posixSpawnFileActionsAddchdir(actions: COpaquePointer?, path: String?): CInt

public expect fun posixSpawnFileActionsAddfchdir(actions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt

public expect fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt

public expect fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT

public expect fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt

public expect fun getgrgid(gid: GidT): Group?

public expect fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt

public expect fun getgrnam(name: String?): Group?

public expect fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

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
