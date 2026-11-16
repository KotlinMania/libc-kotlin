// port-lint: source vxworks/vxworks_mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.EINVAL
import io.github.kotlinmania.libc.ENOMEM
import io.github.kotlinmania.libc.errnoGet
import io.github.kotlinmania.libc.errnoSet

// Interface to VxWorks C library

public fun interface SaUTSaHandlerCallback {
    public operator fun invoke(arg0: CInt): Nothing
}

public fun interface SaUTSaSigactionCallback {
    public operator fun invoke(arg0: CInt, arg1: io.github.kotlinmania.libc.SiginfoT?, arg2: COpaquePointer?): Nothing
}

public fun interface AtexitCbCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface PthreadKeyCreateDtorCallback {
    public operator fun invoke(arg0: COpaquePointer?)
}

// Dummy functions, these don't really exist in VxWorks.
// wait.h macros
public sealed class DIR {
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias UintptrT = ULong

public typealias IntptrT = Long

public typealias PtrdiffT = Long

public typealias SizeT = io.github.kotlinmania.libc.UintptrT

public typealias SsizeT = IntptrT

public typealias SpeedT = CUint

public typealias TcflagT = CUint

public typealias ClockT = CLong

public typealias CcT = CUchar

public typealias PidT = CInt

public typealias InAddrT = UInt

public typealias SighandlerT = SizeT

public typealias CpusetT = UInt

public typealias BlkcntT = CLong

public typealias BlksizeT = CLong

public typealias InoT = CUlong

public typealias RlimT = CUlong

public typealias SusecondsT = CLong

public typealias TimeT = CLonglong

public typealias ErrnoT = CInt

public typealias UsecondsT = CUlong

public typealias SocklenT = CUint

public typealias PthreadT = CUlong

public typealias ClockidT = CInt

// defined for the structs
public typealias DevT = CUlong

public typealias ModeT = CInt

public typealias NlinkT = CUlong

public typealias UidT = CUshort

public typealias GidT = CUshort

public typealias SigsetT = CUlonglong

public typealias KeyT = CLong

public typealias NfdsT = CUint

public typealias Stat64 = io.github.kotlinmania.libc.Stat

public typealias PthreadKeyT = CUlong

// From bOffT.h
public typealias OffT = CLonglong

public typealias Off64T = OffT

// From bBool.h
public typealias Bool = CInt

// From vxWind.h ..
public typealias VxObjHandle = CInt

public typealias VxTaskId = io.github.kotlinmania.libc.VxObjHandle

public typealias VxMsgQId = io.github.kotlinmania.libc.VxObjHandle

public typealias VxSemIdKernel = io.github.kotlinmania.libc.VxObjHandle

public typealias VxRtpId = io.github.kotlinmania.libc.VxObjHandle

public typealias VxSdId = io.github.kotlinmania.libc.VxObjHandle

public typealias VxCondvarId = io.github.kotlinmania.libc.VxObjHandle

public typealias VxSemId = io.github.kotlinmania.libc.VxSemaphore?

public typealias ObjHandle = io.github.kotlinmania.libc.VxObjHandle

public typealias TaskId = io.github.kotlinmania.libc.ObjHandle

public typealias MsgQId = io.github.kotlinmania.libc.ObjHandle

public typealias SemIdKernel = io.github.kotlinmania.libc.ObjHandle

public typealias RtpId = io.github.kotlinmania.libc.ObjHandle

public typealias SdId = io.github.kotlinmania.libc.ObjHandle

public typealias CondvarId = io.github.kotlinmania.libc.ObjHandle

public typealias Status = io.github.kotlinmania.libc.ObjHandle

// From vxTypes.h
public typealias VxUsrArgT = Int

public typealias VxExitCodeT = Int

public typealias VxTicksT = CUint

public typealias VxTicks64T = CUlonglong

public typealias SaFamilyT = CUchar

// mqueue.h
public typealias MqdT = CInt

public sealed class VxSemaphore {
}

// bPthreadCondattrT.h
public open class PthreadCondattrT(
    public var condAttrStatus: CInt,
    public var condAttrPshared: CInt,
    public var condAttrClockId: io.github.kotlinmania.libc.ClockidT,
)

// bPthreadCondT.h
public open class PthreadCondT(
    public var condSemId: io.github.kotlinmania.libc.VxSemId,
    public var condValid: CInt,
    public var condInitted: CInt,
    public var condRefCount: CInt,
    public var condMutex: io.github.kotlinmania.libc.PthreadMutexT?,
    public var condAttr: io.github.kotlinmania.libc.PthreadCondattrT,
    public var condSemName: List<CChar>,
)

// bPthreadRwlockattrT.h
public open class PthreadRwlockattrT(
    public var rwlockAttrStatus: CInt,
    public var rwlockAttrPshared: CInt,
    public var rwlockAttrMaxReaders: CUint,
    public var rwlockAttrConformOpt: CUint,
)

// bPthreadRwlockT.h
public open class PthreadRwlockT(
    public var rwlockSemId: io.github.kotlinmania.libc.VxSemId,
    public var rwlockReadersRefCount: CUint,
    public var rwlockValid: CInt,
    public var rwlockInitted: CInt,
    public var rwlockAttr: io.github.kotlinmania.libc.PthreadRwlockattrT,
    public var rwlockSemName: List<CChar>,
)

// bStructTimeval.h
public open class Timeval(public var tvSec: io.github.kotlinmania.libc.TimeT, public var tvUsec: io.github.kotlinmania.libc.SusecondsT)

// socket.h
public open class Linger(public var lOnoff: CInt, public var lLinger: CInt)

public open class Sockaddr(
    public var saLen: CUchar,
    public var saFamily: SaFamilyT,
    public var saData: List<CChar>,
)

public open class Iovec(public var iovBase: COpaquePointer?, public var iovLen: SizeT)

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
    public var cmsgLen: SocklenT,
    public var cmsgLevel: CInt,
    public var cmsgType: CInt,
)

// poll.h
public open class Pollfd(
    public var fd: CInt,
    public var events: CShort,
    public var revents: CShort,
)

// resource.h
public open class Rlimit(public var rlimCur: io.github.kotlinmania.libc.RlimT, public var rlimMax: io.github.kotlinmania.libc.RlimT)

// stat.h
public open class Stat(
    public var stDev: io.github.kotlinmania.libc.DevT,
    public var stIno: io.github.kotlinmania.libc.InoT,
    public var stMode: ModeT,
    public var stNlink: io.github.kotlinmania.libc.NlinkT,
    public var stUid: io.github.kotlinmania.libc.UidT,
    public var stGid: io.github.kotlinmania.libc.GidT,
    public var stRdev: io.github.kotlinmania.libc.DevT,
    public var stSize: OffT,
    public var stAtim: Timespec,
    public var stAtime: io.github.kotlinmania.libc.TimeT,
    public var stMtim: Timespec,
    public var stMtime: io.github.kotlinmania.libc.TimeT,
    public var stCtim: Timespec,
    public var stCtime: io.github.kotlinmania.libc.TimeT,
    public var stBlksize: io.github.kotlinmania.libc.BlksizeT,
    public var stBlocks: io.github.kotlinmania.libc.BlkcntT,
    public var stAttrib: CUchar,
    public var stReserved1: CInt,
    public var stReserved2: CInt,
    public var stReserved3: CInt,
    public var stReserved4: CInt,
)

// bStructTimespec.h
public open class Timespec(public var tvSec: io.github.kotlinmania.libc.TimeT, public var tvNsec: CLong)

// bStructSchedParam.h
public open class SchedParam(
    public var schedPriority: CInt,
    // scheduling priority
    public var schedSsLowPriority: CInt,
    // low scheduling priority
    public var schedSsReplPeriod: io.github.kotlinmania.libc.Timespec,
    // replenishment period
    public var schedSsInitBudget: io.github.kotlinmania.libc.Timespec,
    // initial budget
    public var schedSsMaxRepl: CInt,
)

// bPthreadAttrT.h
public open class PthreadAttrT(
    public var threadAttrStatus: CInt,
    public var threadAttrStacksize: SizeT,
    public var threadAttrStackaddr: COpaquePointer?,
    public var threadAttrGuardsize: SizeT,
    public var threadAttrDetachstate: CInt,
    public var threadAttrContentionscope: CInt,
    public var threadAttrInheritsched: CInt,
    public var threadAttrSchedpolicy: CInt,
    public var threadAttrName: COpaquePointer?,
    public var threadAttrOptions: CInt,
    public var threadAttrSchedparam: io.github.kotlinmania.libc.SchedParam,
)

// signal.h
public open class Sigaction(
    public var saU: io.github.kotlinmania.libc.SaUT,
    public var saSigaction: io.github.kotlinmania.libc.SighandlerT,
    public var saMask: io.github.kotlinmania.libc.SigsetT,
    public var saFlags: CInt,
)

// bStackT.h
public open class StackT(
    public var ssSp: COpaquePointer?,
    public var ssSize: SizeT,
    public var ssFlags: CInt,
)

// signal.h
public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siValue: io.github.kotlinmania.libc.Sigval,
    public var siErrno: CInt,
    public var siStatus: CInt,
    public var siAddr: COpaquePointer?,
    public var siUid: io.github.kotlinmania.libc.UidT,
    public var siPid: io.github.kotlinmania.libc.PidT,
) {
    public open fun siAddr(): COpaquePointer? {
        return this.siAddr
    }

    public open fun siValue(): io.github.kotlinmania.libc.Sigval {
        return this.siValue
    }

    public open fun siPid(): io.github.kotlinmania.libc.PidT {
        return this.siPid
    }

    public open fun siUid(): io.github.kotlinmania.libc.UidT {
        return this.siUid
    }

    public open fun siStatus(): CInt {
        return this.siStatus
    }
}

// pthread.h (krnl)
// bPthreadMutexattrT.h (usr)
public open class PthreadMutexattrT(
    public var mutexAttrStatus: CInt,
    public var mutexAttrPshared: CInt,
    public var mutexAttrProtocol: CInt,
    public var mutexAttrPrioceiling: CInt,
    public var mutexAttrType: CInt,
)

// pthread.h (krnl)
// bPthreadMutexT.h (usr)
public open class PthreadMutexT(
    public var mutexSemId: io.github.kotlinmania.libc.VxSemId,
    // _Vx_SEM_ID ..
    public var mutexValid: CInt,
    public var mutexInitted: CInt,
    public var mutexCondRefCount: CInt,
    public var mutexSavPriority: CInt,
    public var mutexAttr: io.github.kotlinmania.libc.PthreadMutexattrT,
    public var mutexSemName: List<CChar>,
)

// time.h
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
)

// sys/times.h
public open class Tms(
    public var tmsUtime: io.github.kotlinmania.libc.ClockT,
    public var tmsStime: io.github.kotlinmania.libc.ClockT,
    public var tmsCutime: io.github.kotlinmania.libc.ClockT,
    public var tmsCstime: io.github.kotlinmania.libc.ClockT,
)

// utime.h
public open class Utimbuf(public var actime: TimeT, public var modtime: TimeT)

// in.h
public open class InAddr(public var sAddr: InAddrT)

// in.h
public open class IpMreq(public var imrMultiaddr: InAddr, public var imrInterface: InAddr)

public open class In6Addr(public var s6Addr: List<UByte>)

// in6.h
public open class Ipv6Mreq(public var ipv6mrMultiaddr: In6Addr, public var ipv6mrInterface: CUint)

// netdb.h
public open class Addrinfo(
    public var aiFlags: CInt,
    public var aiFamily: CInt,
    public var aiSocktype: CInt,
    public var aiProtocol: CInt,
    public var aiAddrlen: SizeT,
    public var aiCanonname: COpaquePointer?,
    public var aiAddr: io.github.kotlinmania.libc.Sockaddr?,
    public var aiNext: io.github.kotlinmania.libc.Addrinfo?,
)

// netdb.h
public open class Servent(
    public var sName: COpaquePointer?,
    public var sAliases: COpaquePointer?,
    public var sPort: CInt,
    public var sProto: COpaquePointer?,
)

// netdb.h
public open class Protoent(
    public var pName: COpaquePointer?,
    public var pAliases: COpaquePointer?,
    public var pProto: CInt,
)

// netdb.h
public open class Hostent(
    public var hName: COpaquePointer?,
    public var hAliases: COpaquePointer?,
    public var hAddrtype: CInt,
    public var hLength: CInt,
    public var hAddrList: COpaquePointer?,
)

// in.h
public open class SockaddrIn(
    public var sinLen: UByte,
    public var sinFamily: UByte,
    public var sinPort: UShort,
    public var sinAddr: io.github.kotlinmania.libc.InAddr,
    public var sinZero: List<CChar>,
)

// in6.h
public open class SockaddrIn6(
    public var sin6Len: UByte,
    public var sin6Family: UByte,
    public var sin6Port: UShort,
    public var sin6Flowinfo: UInt,
    public var sin6Addr: io.github.kotlinmania.libc.In6Addr,
    public var sin6ScopeId: UInt,
)

public open class DlInfo(
    public var dliFname: COpaquePointer?,
    public var dliFbase: COpaquePointer?,
    public var dliSname: COpaquePointer?,
    public var dliSaddr: COpaquePointer?,
)

public open class MqAttr(
    public var mqMaxmsg: CLong,
    public var mqMsgsize: CLong,
    public var mqFlags: CLong,
    public var mqCurmsgs: CLong,
)

public open class Winsize(
    public var wsRow: CUshort,
    public var wsCol: CUshort,
    public var wsXpixel: CUshort,
    public var wsYpixel: CUshort,
)

public open class Termios(
    public var cIflag: io.github.kotlinmania.libc.TcflagT,
    public var cOflag: io.github.kotlinmania.libc.TcflagT,
    public var cCflag: io.github.kotlinmania.libc.TcflagT,
    public var cLflag: io.github.kotlinmania.libc.TcflagT,
    public var cCc: List<io.github.kotlinmania.libc.CcT>,
    public var cIspeed: io.github.kotlinmania.libc.SpeedT,
    public var cOspeed: io.github.kotlinmania.libc.SpeedT,
)

public open class Rusage(
    public var ruUtime: Timeval,
    public var ruStime: Timeval,
    public var ruMaxrss: CLong,
    public var ruIxrss: CLong,
    public var ruIdrss: CLong,
    public var ruIsrss: CLong,
    public var ruMinflt: CLong,
    public var ruMajflt: CLong,
    public var ruNswap: CLong,
    public var ruInblock: CLong,
    public var ruOublock: CLong,
    public var ruMsgsnd: CLong,
    public var ruMsgrcv: CLong,
    public var ruNsignals: CLong,
    public var ruNvcsw: CLong,
    public var ruNivcsw: CLong,
)

public open class Lconv(
    public var currencySymbol: COpaquePointer?,
    public var intCurrSymbol: COpaquePointer?,
    public var monDecimalPoint: COpaquePointer?,
    public var monGrouping: COpaquePointer?,
    public var monThousandsSep: COpaquePointer?,
    public var negativeSign: COpaquePointer?,
    public var positiveSign: COpaquePointer?,
    public var fracDigits: CChar,
    public var nCsPrecedes: CChar,
    public var nSepBySpace: CChar,
    public var nSignPosn: CChar,
    public var pCsPrecedes: CChar,
    public var pSepBySpace: CChar,
    public var pSignPosn: CChar,
    public var intFracDigits: CChar,
    public var intNCsPrecedes: CChar,
    public var intNSepBySpace: CChar,
    public var intNSignPosn: CChar,
    public var intPCsPrecedes: CChar,
    public var intPSepBySpace: CChar,
    public var intPSignPosn: CChar,
    public var decimalPoint: COpaquePointer?,
    public var grouping: COpaquePointer?,
    public var thousandsSep: COpaquePointer?,
    public var fracGrouping: COpaquePointer?,
    public var fracSep: COpaquePointer?,
    public var falseVal: COpaquePointer?,
    public var trueVal: COpaquePointer?,
    public var no: COpaquePointer?,
    public var yes: COpaquePointer?,
)

// grp.h
public open class Group(
    public var grName: COpaquePointer?,
    public var grPasswd: COpaquePointer?,
    public var grGid: CInt,
    public var grMem: COpaquePointer?,
)

public open class Utsname(
    public var sysname: List<CChar>,
    public var nodename: List<CChar>,
    public var release: List<CChar>,
    public var version: List<CChar>,
    public var machine: List<CChar>,
    public var endian: List<CChar>,
    public var kernelversion: List<CChar>,
    public var releaseversion: List<CChar>,
    public var processor: List<CChar>,
    public var bsprevision: List<CChar>,
    public var builddate: List<CChar>,
)

// dirent.h
public open class Dirent(
    public var dIno: io.github.kotlinmania.libc.InoT,
    public var dName: List<CChar>,
    public var dType: CUchar,
)

public open class SockaddrUn(
    public var sunLen: UByte,
    public var sunFamily: SaFamilyT,
    public var sunPath: List<CChar>,
)

// rtpLibCommon.h
public open class RtpDesc(
    public var status: CInt,
    public var options: UInt,
    public var entrAddr: COpaquePointer?,
    public var initTaskId: io.github.kotlinmania.libc.TaskId,
    public var parentId: io.github.kotlinmania.libc.RtpId,
    public var pathName: List<CChar>,
    public var taskCnt: CInt,
    public var textStart: COpaquePointer?,
    public var textEnd: COpaquePointer?,
)

// socket.h
public open class SockaddrStorage(
    public var ssLen: CUchar,
    public var ssFamily: io.github.kotlinmania.libc.SaFamilyT,
    public var ssPad1: List<CChar>,
    public var ssAlign: Int,
    public var ssPad2: List<CChar>,
)

public open class SaUT(public var saHandler: SaUTSaHandlerCallback?? = null, public var saSigaction: SaUTSaSigactionCallback?? = null) {
    public open fun eq(other: SaUT): Boolean {
        return run {
            val h1 = when (val matchVal = this.saHandler) {
                null -> 0.toInt()
                else -> {
                    val handler = matchVal
                    handler.toInt()
                }
            }
            val h2 = when (val matchVal1 = other.saHandler) {
                null -> 0.toInt()
                else -> {
                    val handler1 = matchVal1
                    handler1.toInt()
                }
            }
            h1 == h2
        }
    }

    public override fun hashCode(): Int {
        var state = 0
        run {
            val h = when (val matchVal = this.saHandler) {
                null -> 0.toInt()
                else -> {
                    val handler = matchVal
                    handler.toInt()
                }
            }
            state = 31 * state + (h).hashCode()
        }
        return state
    }
}

public open class Sigval(public var sivalInt: CInt? = null, public var sivalPtr: COpaquePointer?? = null) {
    public open fun eq(other: Sigval): Boolean {
        return this.sivalPtr.toInt() == other.sivalPtr.toInt()
    }

    public override fun hashCode(): Int {
        var state = 0
        state = 31 * state + ((this.sivalPtr.toInt())).hashCode()
        return state
    }
}

public val EXIT_SUCCESS: CInt = 0

public val EXIT_FAILURE: CInt = 1

public val EAI_SERVICE: CInt = 9

public val EAI_SOCKTYPE: CInt = 10

public val EAI_SYSTEM: CInt = 11

public val INT_MAX: CInt = 0x7fffffff

public val INT_MIN: CInt = -INT_MAX - 1

// Note(vxworks): This is not defined in vxWorks, but we have to define it here
// to make the building pass for getrandom and std
public val RTLD_DEFAULT: COpaquePointer? = null

// Clock Lib Stuff
public val CLOCK_REALTIME: CInt = 0x0

public val CLOCK_MONOTONIC: CInt = 0x1

public val CLOCK_PROCESS_CPUTIME_ID: CInt = 0x2

public val CLOCK_THREAD_CPUTIME_ID: CInt = 0x3

public val TIMER_ABSTIME: CInt = 0x1

public val TIMER_RELTIME: CInt = 0x0

// PTHREAD STUFF
public val PTHREAD_INITIALIZED_OBJ: CInt = 0xF70990EF

public val PTHREAD_DESTROYED_OBJ: CInt = -1

public val PTHREAD_VALID_OBJ: CInt = 0xEC542A37

public val PTHREAD_INVALID_OBJ: CInt = -1

public val PTHREAD_UNUSED_YET_OBJ: CInt = -1

public val PTHREAD_PRIO_NONE: CInt = 0

public val PTHREAD_PRIO_INHERIT: CInt = 1

public val PTHREAD_PRIO_PROTECT: CInt = 2

public val PTHREAD_MUTEX_NORMAL: CInt = 0

public val PTHREAD_MUTEX_ERRORCHECK: CInt = 1

public val PTHREAD_MUTEX_RECURSIVE: CInt = 2

public val PTHREAD_MUTEX_DEFAULT: CInt = PTHREAD_MUTEX_NORMAL

public val PTHREAD_STACK_MIN: Int = 4096

public val PTHREAD_SHARED_SEM_NAME_MAX: Int = 30

// sched.h
public val SCHED_FIFO: CInt = 0x01

public val SCHED_RR: CInt = 0x02

public val SCHED_OTHER: CInt = 0x04

public val SCHED_SPORADIC: CInt = 0x08

public val PRIO_PROCESS: CUint = 0u

public val SCHED_FIFO_HIGH_PRI: CInt = 255

public val SCHED_FIFO_LOW_PRI: CInt = 0

public val SCHED_RR_HIGH_PRI: CInt = 255

public val SCHED_RR_LOW_PRI: CInt = 0

public val SCHED_SPORADIC_HIGH_PRI: CInt = 255

public val SCHED_SPORADIC_LOW_PRI: CInt = 0

// ERRNO STUFF
public val ERROR: CInt = -1

public val OK: CInt = 0

public val EPERM: CInt = 1

// Not owner
public val ENOENT: CInt = 2

// No such file or directory
public val ESRCH: CInt = 3

// No such process
public val EINTR: CInt = 4

// Interrupted system call
public val EIO: CInt = 5

// I/O error
public val ENXIO: CInt = 6

// No such device or address
public val E2BIG: CInt = 7

// Arg list too long
public val ENOEXEC: CInt = 8

// Exec format error
public val EBADF: CInt = 9

// Bad file number
public val ECHILD: CInt = 10

// No children
public val EAGAIN: CInt = 11

// No more processes
public val ENOMEM: CInt = 12

// Not enough core
public val EACCES: CInt = 13

// Permission denied
public val EFAULT: CInt = 14

public val ENOTEMPTY: CInt = 15

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

public val ENAMETOOLONG: CInt = 26

public val EFBIG: CInt = 27

public val ENOSPC: CInt = 28

public val ESPIPE: CInt = 29

public val EROFS: CInt = 30

public val EMLINK: CInt = 31

public val EPIPE: CInt = 32

public val EDEADLK: CInt = 33

public val ENOLCK: CInt = 34

public val ENOTSUP: CInt = 35

public val EMSGSIZE: CInt = 36

public val EDOM: CInt = 37

public val ERANGE: CInt = 38

public val EDOOM: CInt = 39

public val EDESTADDRREQ: CInt = 40

public val EPROTOTYPE: CInt = 41

public val ENOPROTOOPT: CInt = 42

public val EPROTONOSUPPORT: CInt = 43

public val ESOCKTNOSUPPORT: CInt = 44

public val EOPNOTSUPP: CInt = 45

public val EPFNOSUPPORT: CInt = 46

public val EAFNOSUPPORT: CInt = 47

public val EADDRINUSE: CInt = 48

public val EADDRNOTAVAIL: CInt = 49

public val ENOTSOCK: CInt = 50

public val ENETUNREACH: CInt = 51

public val ENETRESET: CInt = 52

public val ECONNABORTED: CInt = 53

public val ECONNRESET: CInt = 54

public val ENOBUFS: CInt = 55

public val EISCONN: CInt = 56

public val ENOTCONN: CInt = 57

public val ESHUTDOWN: CInt = 58

public val ETOOMANYREFS: CInt = 59

public val ETIMEDOUT: CInt = 60

public val ECONNREFUSED: CInt = 61

public val ENETDOWN: CInt = 62

public val ETXTBSY: CInt = 63

public val ELOOP: CInt = 64

public val EHOSTUNREACH: CInt = 65

public val ENOTBLK: CInt = 66

public val EHOSTDOWN: CInt = 67

public val EINPROGRESS: CInt = 68

public val EALREADY: CInt = 69

public val EWOULDBLOCK: CInt = 70

public val ENOSYS: CInt = 71

public val ECANCELED: CInt = 72

public val ENOSR: CInt = 74

public val ENOSTR: CInt = 75

public val EPROTO: CInt = 76

public val EBADMSG: CInt = 77

public val ENODATA: CInt = 78

public val ETIME: CInt = 79

public val ENOMSG: CInt = 80

public val EFPOS: CInt = 81

public val EILSEQ: CInt = 82

public val EDQUOT: CInt = 83

public val EIDRM: CInt = 84

public val EOVERFLOW: CInt = 85

public val EMULTIHOP: CInt = 86

public val ENOLINK: CInt = 87

public val ESTALE: CInt = 88

public val EOWNERDEAD: CInt = 89

public val ENOTRECOVERABLE: CInt = 90

// NFS errnos: Refer to pkgsV2/storage/fs/nfs/h/nfs/nfsCommon.h
public val M_NFS_STAT: CInt = 48 shl 16

public sealed class Nfsstat(public val value: Int) {
    public data object NfserrRemote : Nfsstat(71)
    public data object NfserrWflush : Nfsstat(99)
    public data object NfserrBadhandle : Nfsstat(10001)
    public data object NfserrNotSync : Nfsstat(10002)
    public data object NfserrBadCookie : Nfsstat(10003)
    public data object NfserrToosmall : Nfsstat(10005)
    public data object NfserrBadtype : Nfsstat(10007)
    public data object NfserrJukebox : Nfsstat(10008)
}

public val S_NFS_LIB_NFS_OK: CInt = OK

public val S_NFS_LIB_NFSERR_PERM: CInt = EPERM

public val S_NFS_LIB_NFSERR_NOENT: CInt = ENOENT

public val S_NFS_LIB_NFSERR_IO: CInt = EIO

public val S_NFS_LIB_NFSERR_NXIO: CInt = ENXIO

public val S_NFS_LIB_NFSERR_ACCESS: CInt = EACCES

public val S_NFS_LIB_NFSERR_EXIST: CInt = EEXIST

public val S_NFS_LIB_NFSERR_ENODEV: CInt = ENODEV

public val S_NFS_LIB_NFSERR_NOTDIR: CInt = ENOTDIR

public val S_NFS_LIB_NFSERR_ISDIR: CInt = EISDIR

public val S_NFS_LIB_NFSERR_INVAL: CInt = EINVAL

public val S_NFS_LIB_NFSERR_FBIG: CInt = EFBIG

public val S_NFS_LIB_NFSERR_NOSPC: CInt = ENOSPC

public val S_NFS_LIB_NFSERR_ROFS: CInt = EROFS

public val S_NFS_LIB_NFSERR_NAMETOOLONG: CInt = ENAMETOOLONG

public val S_NFS_LIB_NFSERR_NOTEMPTY: CInt = ENOTEMPTY

public val S_NFS_LIB_NFSERR_DQUOT: CInt = EDQUOT

public val S_NFS_LIB_NFSERR_STALE: CInt = ESTALE

public val S_NFS_LIB_NFSERR_WFLUSH: CInt = M_NFS_STAT or NFSERR_WFLUSH.toInt()

public val S_NFS_LIB_NFSERR_REMOTE: CInt = M_NFS_STAT or NFSERR_REMOTE.toInt()

public val S_NFS_LIB_NFSERR_BADHANDLE: CInt = M_NFS_STAT or NFSERR_BADHANDLE.toInt()

public val S_NFS_LIB_NFSERR_NOT_SYNC: CInt = M_NFS_STAT or NFSERR_NOT_SYNC.toInt()

public val S_NFS_LIB_NFSERR_BAD_COOKIE: CInt = M_NFS_STAT or NFSERR_BAD_COOKIE.toInt()

public val S_NFS_LIB_NFSERR_NOTSUPP: CInt = EOPNOTSUPP

public val S_NFS_LIB_NFSERR_TOOSMALL: CInt = M_NFS_STAT or NFSERR_TOOSMALL.toInt()

public val S_NFS_LIB_NFSERR_SERVERFAULT: CInt = EIO

public val S_NFS_LIB_NFSERR_BADTYPE: CInt = M_NFS_STAT or NFSERR_BADTYPE.toInt()

public val S_NFS_LIB_NFSERR_JUKEBOX: CInt = M_NFS_STAT or NFSERR_JUKEBOX.toInt()

// internal offset values for below constants
public val TASK_ERROR_BASE: CInt = 0x00030000

public val SEM_ERROR_BASE: CInt = 0x00160000

public val OBJ_ERROR_BASE: CInt = 0x003d0000

// taskLibCommon.h
public val S_TASK_LIB_NAME_NOT_FOUND: CInt = TASK_ERROR_BASE + 0x0065

public val S_TASK_LIB_TASK_HOOK_TABLE_FULL: CInt = TASK_ERROR_BASE + 0x0066

public val S_TASK_LIB_TASK_HOOK_NOT_FOUND: CInt = TASK_ERROR_BASE + 0x0067

public val S_TASK_LIB_ILLEGAL_PRIORITY: CInt = TASK_ERROR_BASE + 0x006D

// Note(vxworks): could also be useful for TASK_DESC type
public val VX_TASK_NAME_LENGTH: CInt = 31

public val VX_TASK_RENAME_LENGTH: CInt = 16

public val TCIFLUSH: CInt = 0

public val VINTR: Int = 0

public val VQUIT: Int = 1

public val VERASE: Int = 2

public val VKILL: Int = 3

public val VEOF: Int = 4

public val VMIN: Int = 16

public val VTIME: Int = 17

// semLibCommon.h
public val S_SEM_LIB_INVALID_STATE: CInt = SEM_ERROR_BASE + 0x0065

public val S_SEM_LIB_INVALID_OPTION: CInt = SEM_ERROR_BASE + 0x0066

public val S_SEM_LIB_INVALID_QUEUE_TYPE: CInt = SEM_ERROR_BASE + 0x0067

public val S_SEM_LIB_INVALID_OPERATION: CInt = SEM_ERROR_BASE + 0x0068

// objLibCommon.h
public val S_OBJ_LIB_OBJ_ID_ERROR: CInt = OBJ_ERROR_BASE + 0x0001

public val S_OBJ_LIB_OBJ_UNAVAILABLE: CInt = OBJ_ERROR_BASE + 0x0002

public val S_OBJ_LIB_OBJ_DELETED: CInt = OBJ_ERROR_BASE + 0x0003

public val S_OBJ_LIB_OBJ_TIMEOUT: CInt = OBJ_ERROR_BASE + 0x0004

public val S_OBJ_LIB_OBJ_NO_METHOD: CInt = OBJ_ERROR_BASE + 0x0005

// netinet/in.h
public val IPPROTO_IP: CInt = 0

public val IPPROTO_ICMP: CInt = 1

public val IPPROTO_TCP: CInt = 6

public val IPPROTO_IPV6: CInt = 41

public val IPPROTO_ICMPV6: CInt = 58

public val INADDR_ANY: InAddrT = 0u

public val INADDR_LOOPBACK: InAddrT = 2130706433u

public val INADDR_BROADCAST: InAddrT = 4294967295u

public val INADDR_NONE: InAddrT = 4294967295u

// netinet6/in6.h
public val IN6ADDR_LOOPBACK_INIT: In6Addr = Any(s6Addr = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1))

public val IN6ADDR_ANY_INIT: In6Addr = Any(s6Addr = listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0))

// udp.h
public val IPPROTO_UDP: CInt = 17

public val IP_TTL: CInt = 4

public val IP_MULTICAST_IF: CInt = 9

public val IP_MULTICAST_TTL: CInt = 10

public val IP_MULTICAST_LOOP: CInt = 11

public val IP_ADD_MEMBERSHIP: CInt = 12

public val IP_DROP_MEMBERSHIP: CInt = 13

// netdb.h
public val NI_MAXHOST: CInt = 1025

// in6.h
public val IPV6_V6ONLY: CInt = 1

public val IPV6_UNICAST_HOPS: CInt = 4

public val IPV6_MULTICAST_IF: CInt = 9

public val IPV6_MULTICAST_HOPS: CInt = 10

public val IPV6_MULTICAST_LOOP: CInt = 11

public val IPV6_ADD_MEMBERSHIP: CInt = 12

public val IPV6_DROP_MEMBERSHIP: CInt = 13

// STAT Stuff
public val S_IFMT: CInt = 61440

public val S_IFIFO: CInt = 4096

public val S_IFCHR: CInt = 8192

public val S_IFDIR: CInt = 16384

public val S_IFBLK: CInt = 24576

public val S_IFREG: CInt = 32768

public val S_IFLNK: CInt = 40960

public val S_IFSHM: CInt = 45056

public val S_IFSOCK: CInt = 49152

public val S_ISUID: CInt = 2048

public val S_ISGID: CInt = 1024

public val S_ISTXT: CInt = 512

public val S_ISVTX: CInt = 512

public val S_IRUSR: CInt = 256

public val S_IWUSR: CInt = 128

public val S_IXUSR: CInt = 64

public val S_IRWXU: CInt = 448

public val S_IRGRP: CInt = 32

public val S_IWGRP: CInt = 16

public val S_IXGRP: CInt = 8

public val S_IRWXG: CInt = 56

public val S_IROTH: CInt = 4

public val S_IWOTH: CInt = 2

public val S_IXOTH: CInt = 1

public val S_IRWXO: CInt = 7

public val UTIME_OMIT: CLong = 0x3ffffffeL

public val UTIME_NOW: CLong = 0x3fffffffL

// socket.h
public val SOL_SOCKET: CInt = 0xffff

public val SOMAXCONN: CInt = 128

public val SO_DEBUG: CInt = 0x0001

public val SO_REUSEADDR: CInt = 0x0004

public val SO_KEEPALIVE: CInt = 0x0008

public val SO_DONTROUTE: CInt = 0x0010

public val SO_RCVLOWAT: CInt = 0x0012

public val SO_SNDLOWAT: CInt = 0x0013

public val SO_SNDTIMEO: CInt = 0x1005

public val SO_ACCEPTCONN: CInt = 0x001e

public val SO_BROADCAST: CInt = 0x0020

public val SO_USELOOPBACK: CInt = 0x0040

public val SO_LINGER: CInt = 0x0080

public val SO_REUSEPORT: CInt = 0x0200

public val SO_VLAN: CInt = 0x8000

public val SO_SNDBUF: CInt = 0x1001

public val SO_RCVBUF: CInt = 0x1002

public val SO_RCVTIMEO: CInt = 0x1006

public val SO_ERROR: CInt = 0x1007

public val SO_TYPE: CInt = 0x1008

public val SO_BINDTODEVICE: CInt = 0x1010

public val SO_OOBINLINE: CInt = 0x1011

public val SO_CONNTIMEO: CInt = 0x100a

public val SOCK_STREAM: CInt = 1

public val SOCK_DGRAM: CInt = 2

public val SOCK_RAW: CInt = 3

public val SOCK_RDM: CInt = 4

public val SOCK_SEQPACKET: CInt = 5

public val SOCK_PACKET: CInt = 10

public val SS_MAXSIZE: Int = 128

public val SS_ALIGNSIZE: Int = sizeOf<UInt>()

public val SS_PAD1SIZE: Int = SS_ALIGNSIZE - sizeOf<CUchar>() - sizeOf<io.github.kotlinmania.libc.SaFamilyT>()

public val SS_PAD2SIZE: Int = SS_MAXSIZE - sizeOf<CUchar>() - sizeOf<io.github.kotlinmania.libc.SaFamilyT>() - SS_PAD1SIZE - SS_ALIGNSIZE

public val MSG_OOB: CInt = 0x0001

public val MSG_PEEK: CInt = 0x0002

public val MSG_DONTROUTE: CInt = 0x0004

public val MSG_EOR: CInt = 0x0008

public val MSG_TRUNC: CInt = 0x0010

public val MSG_CTRUNC: CInt = 0x0020

public val MSG_WAITALL: CInt = 0x0040

public val MSG_DONTWAIT: CInt = 0x0080

public val MSG_EOF: CInt = 0x0100

public val MSG_EXP: CInt = 0x0200

public val MSG_MBUF: CInt = 0x0400

public val MSG_NOTIFICATION: CInt = 0x0800

public val MSG_COMPAT: CInt = 0x8000

public val AF_UNSPEC: CInt = 0

public val AF_LOCAL: CInt = 1

public val PF_LOCAL: CInt = AF_LOCAL

public val PF_UNIX: CInt = PF_LOCAL

public val PF_UNSPEC: CInt = AF_UNSPEC

public val AF_UNIX: CInt = AF_LOCAL

public val AF_INET: CInt = 2

public val PF_INET: CInt = AF_INET

public val AF_NETLINK: CInt = 16

public val AF_ROUTE: CInt = 17

public val AF_LINK: CInt = 18

public val AF_PACKET: CInt = 19

public val PSEUDO_AF_KEY: CInt = 27

public val AF_KEY: CInt = PSEUDO_AF_KEY

public val AF_INET6: CInt = 28

public val PF_INET6: CInt = AF_INET6

public val AF_SOCKDEV: CInt = 31

public val AF_TIPC: CInt = 33

public val AF_MIPC: CInt = 34

public val AF_MIPC_SAFE: CInt = 35

public val AF_MAX: CInt = 39

// termios.h
public val B0: io.github.kotlinmania.libc.SpeedT = 0u

public val B50: io.github.kotlinmania.libc.SpeedT = 50u

public val B75: io.github.kotlinmania.libc.SpeedT = 75u

public val B110: io.github.kotlinmania.libc.SpeedT = 110u

public val B134: io.github.kotlinmania.libc.SpeedT = 134u

public val B150: io.github.kotlinmania.libc.SpeedT = 150u

public val B200: io.github.kotlinmania.libc.SpeedT = 200u

public val B300: io.github.kotlinmania.libc.SpeedT = 300u

public val B600: io.github.kotlinmania.libc.SpeedT = 600u

public val B1200: io.github.kotlinmania.libc.SpeedT = 1200u

public val B1800: io.github.kotlinmania.libc.SpeedT = 1800u

public val B2400: io.github.kotlinmania.libc.SpeedT = 2400u

public val B4800: io.github.kotlinmania.libc.SpeedT = 4800u

public val B9600: io.github.kotlinmania.libc.SpeedT = 9600u

public val B19200: io.github.kotlinmania.libc.SpeedT = 19200u

public val B38400: io.github.kotlinmania.libc.SpeedT = 38400u

public val B57600: io.github.kotlinmania.libc.SpeedT = 57600u

public val B115200: io.github.kotlinmania.libc.SpeedT = 115200u

public val B230400: io.github.kotlinmania.libc.SpeedT = 230400u

public val IGNBRK: io.github.kotlinmania.libc.TcflagT = 0x00000001u

public val BRKINT: io.github.kotlinmania.libc.TcflagT = 0x00000002u

public val IGNCR: io.github.kotlinmania.libc.TcflagT = 0x00000200u

public val IGNPAR: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val INPCK: io.github.kotlinmania.libc.TcflagT = 0x00000020u

public val ISTRIP: io.github.kotlinmania.libc.TcflagT = 0x00000040u

public val INLCR: io.github.kotlinmania.libc.TcflagT = 0x00000100u

public val ISIG: io.github.kotlinmania.libc.TcflagT = 0x00000001u

public val IXOFF: io.github.kotlinmania.libc.TcflagT = 0x00010000u

public val IXON: io.github.kotlinmania.libc.TcflagT = 0x00002000u

public val PARMRK: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val NOFLSH: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val NCCS: Int = 20

public val OPOST: io.github.kotlinmania.libc.TcflagT = 0x00000001u

public val ONLCR: io.github.kotlinmania.libc.TcflagT = 0x00000004u

public val ECHO: io.github.kotlinmania.libc.TcflagT = 0x00000010u

public val OCRNL: io.github.kotlinmania.libc.TcflagT = 0x00000010u

public val ECHOE: io.github.kotlinmania.libc.TcflagT = 0x00000020u

public val ECHOK: io.github.kotlinmania.libc.TcflagT = 0x00000040u

public val ECHONL: io.github.kotlinmania.libc.TcflagT = 0x00000100u

// net/if.h
public val IFNAMSIZ: SizeT = 16uL

public val IF_NAMESIZE: SizeT = IFNAMSIZ

// sioLibCommon.h
public val CLOCAL: io.github.kotlinmania.libc.TcflagT = 0x1u

public val CREAD: io.github.kotlinmania.libc.TcflagT = 0x2u

public val CS5: io.github.kotlinmania.libc.TcflagT = 0x0u

public val CS6: io.github.kotlinmania.libc.TcflagT = 0x4u

public val CS7: io.github.kotlinmania.libc.TcflagT = 0x8u

public val CS8: io.github.kotlinmania.libc.TcflagT = 0xcu

public val CSTOPB: io.github.kotlinmania.libc.TcflagT = 0x20u

public val CSIZE: io.github.kotlinmania.libc.TcflagT = 0xcu

public val PARODD: io.github.kotlinmania.libc.TcflagT = 0x80u

public val PARENB: io.github.kotlinmania.libc.TcflagT = 0x40u

public val DT_FIFO: CUchar = 1u

public val DT_CHR: CUchar = 2u

public val DT_DIR: CUchar = 4u

public val DT_BLK: CUchar = 6u

public val DT_REG: CUchar = 8u

public val DT_LNK: CUchar = 10u

public val DT_SOCK: CUchar = 12u

public val FNM_NOMATCH: CInt = 1

public val FNM_NOESCAPE: CInt = 1

public val FNM_PATHNAME: CInt = 2

public val FNM_PERIOD: CInt = 4

public val FNM_CASEFOLD: CInt = 16

public val F_OK: CInt = 0

public val X_OK: CInt = 1

public val W_OK: CInt = 2

public val PC_CHOWN_RESTRICTED: CInt = 4

public val PC_LINK_MAX: CInt = 6

public val PC_MAX_CANON: CInt = 7

public val PC_MAX_INPUT: CInt = 8

public val PC_NAME_MAX: CInt = 9

public val PC_NO_TRUNC: CInt = 10

public val PC_PATH_MAX: CInt = 11

public val PC_PIPE_BUF: CInt = 12

public val PC_VDISABLE: CInt = 20

public val HUPCL: io.github.kotlinmania.libc.TcflagT = 0x10u

public val SHUT_RD: CInt = 0

public val SHUT_WR: CInt = 1

public val SHUT_RDWR: CInt = 2

public val ICANON: io.github.kotlinmania.libc.TcflagT = 0x00000002u

public val ICRNL: io.github.kotlinmania.libc.TcflagT = 0x00000400u

public val IEXTEN: io.github.kotlinmania.libc.TcflagT = 0x00000000u

public val TCP_NODELAY: CInt = 1

public val TCP_MAXSEG: CInt = 2

public val TCP_NOPUSH: CInt = 3

public val TCP_KEEPIDLE: CInt = 4

public val TCP_KEEPINTVL: CInt = 5

public val TCP_KEEPCNT: CInt = 6

public val TCSANOW: CInt = 0

public val TCSADRAIN: CInt = 1

public val TCSAFLUSH: CInt = 2

// ioLib.h
public val FIONREAD: CInt = 0x40040001

public val FIOFLUSH: CInt = 2

public val FIOOPTIONS: CInt = 3

public val FIOBAUDRATE: CInt = 4

public val FIODISKFORMAT: CInt = 5

public val FIODISKINIT: CInt = 6

public val FIOSEEK: CInt = 7

public val FIOWHERE: CInt = 8

public val FIODIRENTRY: CInt = 9

public val FIORENAME: CInt = 10

public val FIOREADYCHANGE: CInt = 11

public val FIODISKCHANGE: CInt = 13

public val FIOCANCEL: CInt = 14

public val FIOSQUEEZE: CInt = 15

public val FIOGETNAME: CInt = 18

public val FIONBIO: CInt = 0x90040010

// limits.h
public val PATH_MAX: CInt = PARM_PATH_MAX

public val POSIX_PATH_MAX: CInt = 256

// Some poll stuff
public val POLLIN: CShort = 0x0001

public val POLLPRI: CShort = 0x0002

public val POLLOUT: CShort = 0x0004

public val POLLRDNORM: CShort = 0x0040

public val POLLWRNORM: CShort = POLLOUT

public val POLLRDBAND: CShort = 0x0080

public val POLLWRBAND: CShort = 0x0100

public val POLLERR: CShort = 0x0008

public val POLLHUP: CShort = 0x0010

public val POLLNVAL: CShort = 0x0020

// fnctlcom.h
public val FD_CLOEXEC: CInt = 1

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

public val F_DUPFD_CLOEXEC: CInt = 14

public val LOG_EMERG: CInt = 0

public val LOG_ALERT: CInt = 1

public val LOG_CRIT: CInt = 2

public val LOG_ERR: CInt = 3

public val LOG_WARNING: CInt = 4

public val LOG_NOTICE: CInt = 5

public val LOG_INFO: CInt = 6

public val LOG_DEBUG: CInt = 7

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

public val LOG_PID: CInt = 0x01

public val LOG_CONS: CInt = 0x02

public val LOG_ODELAY: CInt = 0x04

public val LOG_NDELAY: CInt = 0x08

public val LOG_NOWAIT: CInt = 0x10

public val LOG_PRIMASK: CInt = 0x7

public val LOG_FACMASK: CInt = 0x3f8

// dlfcn.h
public val RTLD_LOCAL: CInt = 0

public val RTLD_LAZY: CInt = 1

public val RTLD_NOW: CInt = 2

public val RTLD_GLOBAL: CInt = 256

// signal.h
public val SIG_DFL: SighandlerT = 0.toULong()

public val SIG_IGN: SighandlerT = 1.toULong()

public val SIG_ERR: SighandlerT = ((-1).toInt()).toULong()

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

public val SIGFMT: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGCNCL: CInt = 16

public val SIGSTOP: CInt = 17

public val SIGTSTP: CInt = 18

public val SIGCONT: CInt = 19

public val SIGCHLD: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGUSR1: CInt = 30

public val SIGUSR2: CInt = 31

public val SIGPOLL: CInt = 32

public val SIGPROF: CInt = 33

public val SIGSYS: CInt = 34

public val SIGURG: CInt = 35

public val SIGVTALRM: CInt = 36

public val SIGXCPU: CInt = 37

public val SIGXFSZ: CInt = 38

public val SIGRTMIN: CInt = 48

public val SIGIO: CInt = SIGRTMIN

public val SIGWINCH: CInt = SIGRTMIN + 5

public val SIGLOST: CInt = SIGRTMIN + 6

public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

public val SA_NOCLDSTOP: CInt = 0x0001

public val SA_SIGINFO: CInt = 0x0002

public val SA_ONSTACK: CInt = 0x0004

public val SA_INTERRUPT: CInt = 0x0008

public val SA_RESETHAND: CInt = 0x0010

public val SA_RESTART: CInt = 0x0020

public val SA_NODEFER: CInt = 0x0040

public val SA_NOCLDWAIT: CInt = 0x0080

public val SI_SYNC: CInt = 0

public val SI_USER: CInt = -1

public val SI_QUEUE: CInt = -2

public val SI_TIMER: CInt = -3

public val SI_ASYNCIO: CInt = -4

public val SI_MESGQ: CInt = -5

public val SI_CHILD: CInt = -6

public val SI_KILL: CInt = SI_USER

public val AT_FDCWD: CInt = -100

public val AT_SYMLINK_NOFOLLOW: CInt = 0x100

public val AT_REMOVEDIR: CInt = 0x200

public val AT_SYMLINK_FOLLOW: CInt = 0x400

// vxParams.h definitions
public val PARM_NAME_MAX: CInt = 255

public val PARM_PATH_MAX: CInt = 1024

// WAIT STUFF
public val WNOHANG: CInt = 0x01

public val WUNTRACED: CInt = 0x02

public val WCONTINUED: CInt = 0x04

public val PTHREAD_MUTEXATTR_INITIALIZER: PthreadMutexattrT = Any(mutexAttrStatus = PTHREAD_INITIALIZED_OBJ, mutexAttrProtocol = PTHREAD_PRIO_NONE, mutexAttrPrioceiling = 0, mutexAttrType = PTHREAD_MUTEX_DEFAULT, mutexAttrPshared = 1)

public val PTHREAD_MUTEX_INITIALIZER: PthreadMutexT = Any(mutexSemId = null, mutexValid = PTHREAD_VALID_OBJ, mutexInitted = PTHREAD_UNUSED_YET_OBJ, mutexCondRefCount = 0, mutexSavPriority = -1, mutexAttr = PTHREAD_MUTEXATTR_INITIALIZER, mutexSemName = List(PTHREAD_SHARED_SEM_NAME_MAX) { 0 })

public val PTHREAD_CONDATTR_INITIALIZER: PthreadCondattrT = Any(condAttrStatus = 0xf70990ef, condAttrPshared = 1, condAttrClockId = CLOCK_REALTIME)

public val PTHREAD_COND_INITIALIZER: PthreadCondT = Any(condSemId = null, condValid = PTHREAD_VALID_OBJ, condInitted = PTHREAD_UNUSED_YET_OBJ, condRefCount = 0, condMutex = null, condAttr = PTHREAD_CONDATTR_INITIALIZER, condSemName = List(PTHREAD_SHARED_SEM_NAME_MAX) { 0 })

public val PTHREAD_RWLOCKATTR_INITIALIZER: PthreadRwlockattrT = Any(rwlockAttrStatus = PTHREAD_INITIALIZED_OBJ, rwlockAttrPshared = 1, rwlockAttrMaxReaders = 0, rwlockAttrConformOpt = 1)

public val PTHREAD_RWLOCK_INITIALIZER: PthreadRwlockT = Any(rwlockSemId = null, rwlockReadersRefCount = 0, rwlockValid = PTHREAD_VALID_OBJ, rwlockInitted = PTHREAD_UNUSED_YET_OBJ, rwlockAttr = PTHREAD_RWLOCKATTR_INITIALIZER, rwlockSemName = List(PTHREAD_SHARED_SEM_NAME_MAX) { 0 })

public val SEEK_SET: CInt = 0

public val SEEK_CUR: CInt = 1

public val SEEK_END: CInt = 2

// rtpLibCommon.h
public val VX_RTP_NAME_LENGTH: CInt = 255

public val RTP_ID_ERROR: io.github.kotlinmania.libc.RtpId = -1

// h/public/unistd.h
// h/public/unistd.h
public val R_OK: CInt = 4

public val SC_ARG_MAX: CInt = 4

// Via unistd.h
public val SC_CHILD_MAX: CInt = 12

public val SC_CLK_TCK: CInt = 13

public val SC_GETPW_R_SIZE_MAX: CInt = 21

public val SC_HOST_NAME_MAX: CInt = 22

public val SC_NGROUPS_MAX: CInt = 36

public val SC_OPEN_MAX: CInt = 37

public val SC_PAGE_SIZE: CInt = 38

public val SC_PAGESIZE: CInt = 39

public val SC_STREAM_MAX: CInt = 59

public val SC_SYMLOOP_MAX: CInt = 60

public val SC_TTY_NAME_MAX: CInt = 87

public val SC_TZNAME_MAX: CInt = 89

public val SC_VERSION: CInt = 94

public val O_ACCMODE: CInt = 3

public val O_CLOEXEC: CInt = 0x100000

// fcntlcom
public val O_EXCL: CInt = 0x0800

public val O_CREAT: CInt = 0x0200

public val O_TRUNC: CInt = 0x0400

public val O_APPEND: CInt = 0x0008

public val O_RDWR: CInt = 0x0002

public val O_WRONLY: CInt = 0x0001

public val O_RDONLY: CInt = 0

public val O_NONBLOCK: CInt = 0x4000

// mman.h
public val PROT_NONE: CInt = 0x0000

public val PROT_READ: CInt = 0x0001

public val PROT_WRITE: CInt = 0x0002

public val PROT_EXEC: CInt = 0x0004

public val MAP_SHARED: CInt = 0x0001

public val MAP_PRIVATE: CInt = 0x0002

public val MAP_ANON: CInt = 0x0004

public val MAP_ANONYMOUS: CInt = MAP_ANON

public val MAP_FIXED: CInt = 0x0010

public val MAP_CONTIG: CInt = 0x0020

public val MS_SYNC: CInt = 0x0001

public val MS_ASYNC: CInt = 0x0002

public val MS_INVALIDATE: CInt = 0x0004

public val MAP_FAILED: COpaquePointer? = (0.inv() as COpaquePointer?)

// sys/ttycom.h
public val TIOCGWINSZ: CInt = 0x1740087468

public val TIOCSWINSZ: CInt = -0x7ff78b99

public sealed class FILE {
}

public sealed class FposT {
}

public fun cmsgAlign(len: Int): Int {
    return len + sizeOf<Int>() - 1 and (sizeOf<Int>() - 1).inv()
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    val next = ((cmsg)?.hashCode()?.toLong() ?: 0L).toInt() + CMSG_ALIGN((cmsg!!.cmsgLen).toInt()) + CMSG_ALIGN(sizeOf<Cmsghdr>())
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + (mhdr!!.msgControllen).toInt()
    return if (next <= max) {
        null
    } else {
        nullMut<Cmsghdr>()
    }
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() > 0) {
        (mhdr!!.msgControl as Cmsghdr?)
    } else {
        nullMut<Cmsghdr>()
    }
}

public fun cmsgData(cmsg: Cmsghdr?): CUchar? {
    return ((((cmsg)?.hashCode()?.toLong() ?: 0L).toUByte()))?.let { COpaquePointer(it.hashCode().toLong() + (CMSG_ALIGN(sizeOf<Cmsghdr>()).toInt()).toLong()) }
}

public fun cmsgSpace(length: CUint): CUint {
    return (CMSG_ALIGN(length.toInt()) + CMSG_ALIGN(sizeOf<Cmsghdr>())).toUInt()
}

public fun cmsgLen(length: CUint): CUint {
    return CMSG_ALIGN(sizeOf<Cmsghdr>()).toUInt() + length
}

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

public expect fun setvbuf(stream: FILE?, buffer: COpaquePointer?, mode: CInt, size: SizeT): CInt

public expect fun setbuf(stream: FILE?, buf: COpaquePointer?)

public expect fun getchar(): CInt

public expect fun putchar(c: CInt): CInt

public expect fun fgetc(stream: FILE?): CInt

public expect fun fgets(buf: COpaquePointer?, n: CInt, stream: FILE?): COpaquePointer?

public expect fun fputc(c: CInt, stream: FILE?): CInt

public expect fun fputs(s: String?, stream: FILE?): CInt

public expect fun puts(s: String?): CInt

public expect fun ungetc(c: CInt, stream: FILE?): CInt

public expect fun fread(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

public expect fun fwrite(ptr: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT

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

public expect fun atoll(s: String?): CLonglong

public expect fun strtod(s: String?, endp: COpaquePointer?): CDouble

public expect fun strtof(s: String?, endp: COpaquePointer?): CFloat

public expect fun strtol(s: String?, endp: COpaquePointer?, base: CInt): CLong

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: CInt): CLonglong

public expect fun strtoul(s: String?, endp: COpaquePointer?, base: CInt): CUlong

public expect fun strtoull(s: String?, endp: COpaquePointer?, base: CInt): CUlonglong

public expect fun calloc(nobj: SizeT, size: SizeT): COpaquePointer?

public expect fun malloc(size: SizeT): COpaquePointer?

public expect fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun abort(): Nothing

public expect fun exit(status: CInt): Nothing

public expect fun atexit(cb: AtexitCbCallback): CInt

public expect fun system(s: String?): CInt

public expect fun getenv(s: String?): COpaquePointer?

public expect fun cfgetospeed(termios: io.github.kotlinmania.libc.Termios?): io.github.kotlinmania.libc.SpeedT

public expect fun cfmakeraw(termios: io.github.kotlinmania.libc.Termios?): CInt

public expect fun cfsetispeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt

public expect fun cfsetospeed(termios: io.github.kotlinmania.libc.Termios?, speed: io.github.kotlinmania.libc.SpeedT): CInt

public expect fun strcpy(dst: COpaquePointer?, src: String?): COpaquePointer?

public expect fun strncpy(dst: COpaquePointer?, src: String?, n: SizeT): COpaquePointer?

public expect fun strcat(s: COpaquePointer?, ct: String?): COpaquePointer?

public expect fun strncat(s: COpaquePointer?, ct: String?, n: SizeT): COpaquePointer?

public expect fun strcmp(cs: String?, ct: String?): CInt

public expect fun strncmp(cs: String?, ct: String?, n: SizeT): CInt

public expect fun strcoll(cs: String?, ct: String?): CInt

public expect fun strchr(cs: String?, c: CInt): COpaquePointer?

public expect fun strrchr(cs: String?, c: CInt): COpaquePointer?

public expect fun strspn(cs: String?, ct: String?): SizeT

public expect fun strcspn(cs: String?, ct: String?): SizeT

public expect fun strdup(cs: String?): COpaquePointer?

public expect fun strpbrk(cs: String?, ct: String?): COpaquePointer?

public expect fun strstr(cs: String?, ct: String?): COpaquePointer?

public expect fun strcasecmp(s1: String?, s2: String?): CInt

public expect fun strncasecmp(s1: String?, s2: String?, n: SizeT): CInt

public expect fun strlen(cs: String?): SizeT

public expect fun strnlen(cs: String?, n: SizeT): SizeT

public expect fun strerror(n: CInt): COpaquePointer?

public expect fun strtok(s: COpaquePointer?, t: String?): COpaquePointer?

public expect fun strxfrm(s: COpaquePointer?, ct: String?, n: SizeT): SizeT

public expect fun wcslen(buf: WcharT?): SizeT

public expect fun wcstombs(dest: COpaquePointer?, src: WcharT?, n: SizeT): SizeT

public expect fun memchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun wmemchr(cx: WcharT?, c: WcharT, n: SizeT): WcharT?

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: SizeT): CInt

public expect fun memcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memccpy(dest: COpaquePointer?, src: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun memset(dest: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun alignedAlloc(alignment: SizeT, size: SizeT): COpaquePointer?

public expect fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt

public expect fun times(buf: io.github.kotlinmania.libc.Tms?): io.github.kotlinmania.libc.ClockT

public expect fun tcflush(fd: CInt, action: CInt): CInt

public expect fun pclose(stream: FILE?): CInt

public expect fun mkdtemp(template: COpaquePointer?): COpaquePointer?

public expect fun linkat(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CInt): CInt

public expect fun unlinkat(dirfd: CInt, pathname: String?, flags: CInt): CInt

// netdb.h
public expect fun getprotobyname(name: String?): Protoent?

public expect fun getprotobynumber(proto: CInt): Protoent?

public expect fun getservbyname(name: String?, proto: String?): Servent?

public expect fun fchownat(dirfd: CInt, pathname: String?, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT, flags: CInt): CInt

public expect fun fprintf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun printf(format: String?, vararg variadicArgs: Long): CInt

public expect fun snprintf(s: COpaquePointer?, n: SizeT, format: String?, vararg variadicArgs: Long): CInt

public expect fun sprintf(s: COpaquePointer?, format: String?, vararg variadicArgs: Long): CInt

public expect fun fscanf(stream: FILE?, format: String?, vararg variadicArgs: Long): CInt

public expect fun scanf(format: String?, vararg variadicArgs: Long): CInt

public expect fun sscanf(s: String?, format: String?, vararg variadicArgs: Long): CInt

public expect fun getcharUnlocked(): CInt

public expect fun putcharUnlocked(c: CInt): CInt

public expect fun stat(path: String?, buf: Stat?): CInt

public expect fun fdopen(fd: CInt, mode: String?): FILE?

public expect fun fileno(stream: FILE?): CInt

public expect fun creat(path: String?, mode: ModeT): CInt

public expect fun rewinddir(dirp: DIR?)

public expect fun fchown(fd: CInt, owner: io.github.kotlinmania.libc.UidT, group: io.github.kotlinmania.libc.GidT): CInt

public expect fun access(path: String?, amode: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun fchdir(dirfd: CInt): CInt

public expect fun chown(path: String?, uid: UidT, gid: GidT): CInt

public expect fun fpathconf(filedes: CInt, name: CInt): CLong

public expect fun getegid(): GidT

public expect fun geteuid(): UidT

public expect fun getgroups(ngroupsMax: CInt, groups: CUshort?): CInt

public expect fun getlogin(): COpaquePointer?

public expect fun getopt(argc: CInt, argv: COpaquePointer?, optstr: String?): CInt

public expect fun pathconf(path: String?, name: CInt): CLong

public expect fun pause(): CInt

public expect fun seteuid(uid: UidT): CInt

public expect fun setegid(gid: GidT): CInt

public expect fun sleep(secs: CUint): CUint

public expect fun ttyname(fd: CInt): COpaquePointer?

public expect fun wait(status: CInt?): PidT

public expect fun umask(mask: ModeT): ModeT

public expect fun mlock(addr: COpaquePointer?, len: SizeT): CInt

public expect fun mlockall(flags: CInt): CInt

public expect fun munlock(addr: COpaquePointer?, len: SizeT): CInt

public expect fun munlockall(): CInt

public expect fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: SizeT): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun truncate(path: String?, length: OffT): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: COpaquePointer?): CInt

public expect fun pthreadExit(value: COpaquePointer?): Nothing

public expect fun pthreadAttrSetdetachstate(attr: io.github.kotlinmania.libc.PthreadAttrT?, state: CInt): CInt

public expect fun pthreadEqual(t1: io.github.kotlinmania.libc.PthreadT, t2: io.github.kotlinmania.libc.PthreadT): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun sigaddset(set: CUlonglong?, signum: CInt): CInt

public expect fun sigaction(signum: CInt, act: Sigaction?, oldact: Sigaction?): CInt

public expect fun utimes(filename: String?, times: io.github.kotlinmania.libc.Timeval?): CInt

public expect fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt

public expect fun dlopen(filename: String?, flag: CInt): COpaquePointer?

public expect fun dlerror(): COpaquePointer?

public expect fun dlsym(handle: COpaquePointer?, symbol: String?): COpaquePointer?

public expect fun dlclose(handle: COpaquePointer?): CInt

public expect fun dladdr(addr: COpaquePointer?, info: DlInfo?): CInt

// time.h
public expect fun gmtimeR(timeP: CLonglong?, result: Tm?): Tm?

public expect fun localtimeR(timeP: CLonglong?, result: Tm?): Tm?

public expect fun mktime(tm: Tm?): TimeT

public expect fun time(time: CLonglong?): TimeT

public expect fun gmtime(timeP: CLonglong?): Tm?

public expect fun localtime(timeP: CLonglong?): Tm?

public expect fun timegm(tm: Tm?): TimeT

public expect fun difftime(time1: TimeT, time0: TimeT): CDouble

public expect fun gethostname(name: COpaquePointer?, len: SizeT): CInt

public expect fun usleep(secs: io.github.kotlinmania.libc.UsecondsT): CInt

public expect fun putenv(string: COpaquePointer?): CInt

public expect fun setlocale(category: CInt, locale: String?): COpaquePointer?

public expect fun localeconv(): Lconv?

public expect fun sigprocmask(how: CInt, set: CUlonglong?, oldset: CUlonglong?): CInt

public expect fun sigpending(set: CUlonglong?): CInt

public expect fun mkfifo(path: String?, mode: ModeT): CInt

public expect fun fseeko(stream: FILE?, offset: OffT, whence: CInt): CInt

public expect fun ftello(stream: FILE?): OffT

public expect fun mkstemp(template: COpaquePointer?): CInt

public expect fun tmpnam(ptr: COpaquePointer?): COpaquePointer?

public expect fun openlog(ident: String?, logopt: CInt, facility: CInt)

public expect fun closelog()

public expect fun setlogmask(maskpri: CInt): CInt

public expect fun syslog(priority: CInt, message: String?, vararg variadicArgs: Long)

public expect fun getline(lineptr: COpaquePointer?, n: ULong?, stream: FILE?): SsizeT

public expect fun tcsetattr(fd: CInt, optionalActions: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt

public expect fun tcgetattr(fd: CInt, termios: io.github.kotlinmania.libc.Termios?): CInt

public expect fun tcsendbreak(fd: CInt, duration: CInt): CInt

public expect fun confstr(name: CInt, buf: COpaquePointer?, len: SizeT): SizeT

public expect fun fnmatch(pattern: String?, name: String?, flags: CInt): CInt

public expect fun symlinkat(target: String?, newdirfd: CInt, linkpath: String?): CInt

// sys/stat.h
public expect fun fchmodat(dirfd: CInt, pathname: String?, mode: ModeT, flags: CInt): CInt

// utime.h
public expect fun utime(file: String?, buf: Utimbuf?): CInt

// stdlib.h
public expect fun memalign(blockSize: SizeT, sizeArg: SizeT): COpaquePointer?

// ioLib.h
public expect fun getcwd(buf: COpaquePointer?, size: SizeT): COpaquePointer?

// ioLib.h
public expect fun chdir(attr: String?): CInt

// pthread.h
public expect fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt

// pthread.h
public expect fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt

// pthread.h
public expect fun pthreadMutexattrSettype(pAttr: io.github.kotlinmania.libc.PthreadMutexattrT?, pType: CInt): CInt

// pthread.h
public expect fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt

// pthread.h
public expect fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt

// pthread.h
public expect fun pthreadMutexLock(mutex: PthreadMutexT?): CInt

// pthread.h
public expect fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt

// pthread.h
public expect fun pthreadMutexTimedlock(attr: PthreadMutexT?, spec: Timespec?): CInt

// pthread.h
public expect fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt

// pthread.h
public expect fun pthreadAttrSetname(pAttr: io.github.kotlinmania.libc.PthreadAttrT?, name: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadAttrSetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, stacksize: SizeT): CInt

// pthread.h
public expect fun pthreadAttrGetstacksize(attr: io.github.kotlinmania.libc.PthreadAttrT?, size: ULong?): CInt

// pthread.h
public expect fun pthreadAttrInit(attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt

// pthread.h
public expect fun pthreadCreate(pThread: CUlong?, pAttr: io.github.kotlinmania.libc.PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, value: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt

// pthread.h
public expect fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt

// pthread.h
public expect fun pthreadAttrSetinheritsched(attr: io.github.kotlinmania.libc.PthreadAttrT?, inheritsched: CInt): CInt

// pthread.h
public expect fun pthreadAttrSetschedpolicy(attr: io.github.kotlinmania.libc.PthreadAttrT?, policy: CInt): CInt

// pthread.h
public expect fun pthreadAttrDestroy(thread: io.github.kotlinmania.libc.PthreadAttrT?): CInt

// pthread.h
public expect fun pthreadDetach(thread: io.github.kotlinmania.libc.PthreadT): CInt

// int pthreadAtfork (void (*)(void), void (*)(void), void (*)(void));
public expect fun pthreadAtfork(prepare: AtexitCbCallback?, parent: AtexitCbCallback?, child: AtexitCbCallback?): CInt

// stat.h
public expect fun fstat(fildes: CInt, buf: Stat?): CInt

// stat.h
public expect fun lstat(path: String?, buf: Stat?): CInt

// unistd.h
public expect fun ftruncate(fd: CInt, length: OffT): CInt

// dirent.h
public expect fun readdirR(pDir: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt

// dirent.h
public expect fun readdir(pDir: DIR?): io.github.kotlinmania.libc.Dirent?

// fcntl.h or
// ioLib.h
public expect fun open(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt

// poll.h
public expect fun poll(fds: Pollfd?, nfds: NfdsT, timeout: CInt): CInt

// pthread.h
public expect fun pthreadCondattrInit(attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt

// pthread.h
public expect fun pthreadCondattrDestroy(attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt

// pthread.h
public expect fun pthreadCondattrGetclock(pAttr: io.github.kotlinmania.libc.PthreadCondattrT?, pClockId: CInt?): CInt

// pthread.h
public expect fun pthreadCondattrSetclock(pAttr: io.github.kotlinmania.libc.PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt

// pthread.h
public expect fun pthreadCondInit(cond: io.github.kotlinmania.libc.PthreadCondT?, attr: io.github.kotlinmania.libc.PthreadCondattrT?): CInt

// pthread.h
public expect fun pthreadCondDestroy(cond: PthreadCondT?): CInt

// pthread.h
public expect fun pthreadCondSignal(cond: io.github.kotlinmania.libc.PthreadCondT?): CInt

// pthread.h
public expect fun pthreadCondBroadcast(cond: io.github.kotlinmania.libc.PthreadCondT?): CInt

// pthread.h
public expect fun pthreadCondWait(cond: io.github.kotlinmania.libc.PthreadCondT?, mutex: io.github.kotlinmania.libc.PthreadMutexT?): CInt

// pthread.h
public expect fun pthreadRwlockattrInit(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt

// pthread.h
public expect fun pthreadRwlockattrDestroy(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt

// pthread.h
public expect fun pthreadRwlockattrSetmaxreaders(attr: io.github.kotlinmania.libc.PthreadRwlockattrT?, attr2: CUint): CInt

// pthread.h
public expect fun pthreadRwlockInit(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.PthreadRwlockattrT?): CInt

// pthread.h
public expect fun pthreadRwlockDestroy(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt

// pthread.h
public expect fun pthreadRwlockRdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt

// pthread.h
public expect fun pthreadRwlockTryrdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt

// pthread.h
public expect fun pthreadRwlockTimedrdlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.Timespec?): CInt

// pthread.h
public expect fun pthreadRwlockWrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt

// pthread.h
public expect fun pthreadRwlockTrywrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt

// pthread.h
public expect fun pthreadRwlockTimedwrlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?, host: io.github.kotlinmania.libc.Timespec?): CInt

// pthread.h
public expect fun pthreadRwlockUnlock(attr: io.github.kotlinmania.libc.PthreadRwlockT?): CInt

// pthread.h
public expect fun pthreadKeyCreate(key: CUlong?, dtor: PthreadKeyCreateDtorCallback?): CInt

// pthread.h
public expect fun pthreadKeyDelete(key: io.github.kotlinmania.libc.PthreadKeyT): CInt

// pthread.h
public expect fun pthreadSetspecific(key: io.github.kotlinmania.libc.PthreadKeyT, value: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadGetspecific(key: io.github.kotlinmania.libc.PthreadKeyT): COpaquePointer?

// pthread.h
public expect fun pthreadCondTimedwait(cond: io.github.kotlinmania.libc.PthreadCondT?, mutex: io.github.kotlinmania.libc.PthreadMutexT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt

// pthread.h
public expect fun pthreadAttrGetname(attr: io.github.kotlinmania.libc.PthreadAttrT?, name: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadJoin(thread: io.github.kotlinmania.libc.PthreadT, status: COpaquePointer?): CInt

// pthread.h
public expect fun pthreadSelf(): io.github.kotlinmania.libc.PthreadT

// clockLib.h
public expect fun clockGettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt

// clockLib.h
public expect fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt

// clockLib.h
public expect fun clockGetres(clockId: io.github.kotlinmania.libc.ClockidT, res: io.github.kotlinmania.libc.Timespec?): CInt

// clockLib.h
public expect fun clockNanosleep(clockId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt

// timerLib.h
public expect fun nanosleep(rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt

// socket.h
public expect fun accept(s: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): CInt

// socket.h
public expect fun bind(fd: CInt, addr: Sockaddr?, len: SocklenT): CInt

// socket.h
public expect fun connect(s: CInt, name: io.github.kotlinmania.libc.Sockaddr?, namelen: io.github.kotlinmania.libc.SocklenT): CInt

// socket.h
public expect fun getpeername(s: CInt, name: io.github.kotlinmania.libc.Sockaddr?, namelen: CUint?): CInt

// socket.h
public expect fun getsockname(socket: CInt, address: Sockaddr?, addressLen: CUint?): CInt

// socket.h
public expect fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: COpaquePointer?, optlen: CUint?): CInt

// socket.h
public expect fun listen(socket: CInt, backlog: CInt): CInt

// socket.h
public expect fun recv(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt): SsizeT

// socket.h
public expect fun recvfrom(s: CInt, buf: COpaquePointer?, bufLen: SizeT, flags: CInt, from: io.github.kotlinmania.libc.Sockaddr?, pFromLen: CUint?): SsizeT

public expect fun recvmsg(socket: CInt, mp: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

// socket.h
public expect fun send(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt): SsizeT

public expect fun sendmsg(socket: CInt, mp: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT

// socket.h
public expect fun sendto(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: SocklenT): SsizeT

// socket.h
public expect fun setsockopt(socket: CInt, level: CInt, name: CInt, value: COpaquePointer?, optionLen: SocklenT): CInt

// socket.h
public expect fun shutdown(s: CInt, how: CInt): CInt

// socket.h
public expect fun socket(domain: CInt, type: CInt, protocol: CInt): CInt

// icotl.h
public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

// fcntl.h
public expect fun fcntl(fd: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

// ntpRfc2553.h for kernel
// netdb.h for user
public expect fun gaiStrerror(errcode: CInt): COpaquePointer?

// ioLib.h or
// unistd.h
public expect fun close(fd: CInt): CInt

// ioLib.h or
// unistd.h
public expect fun read(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

// ioLib.h or
// unistd.h
public expect fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

// ioLib.h or
// unistd.h
public expect fun isatty(fd: CInt): CInt

// ioLib.h or
// unistd.h
public expect fun dup(src: CInt): CInt

// ioLib.h or
// unistd.h
public expect fun dup2(src: CInt, dst: CInt): CInt

// ioLib.h or
// unistd.h
public expect fun pipe(fds: CInt?): CInt

// ioLib.h or
// unistd.h
public expect fun unlink(pathname: String?): CInt

// unistd.h and
// ioLib.h
public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

// netdb.h
public expect fun getaddrinfo(node: String?, service: String?, hints: Addrinfo?, res: COpaquePointer?): CInt

// netdb.h
public expect fun freeaddrinfo(res: Addrinfo?)

// signal.h
public expect fun signal(signum: CInt, handler: SighandlerT): SighandlerT

// unistd.h
public expect fun getpid(): PidT

// unistd.h
public expect fun getppid(): PidT

// unistd.h
public expect fun setpgid(pid: PidT, pgid: PidT): PidT

// wait.h
public expect fun waitpid(pid: PidT, status: CInt?, options: CInt): PidT

// unistd.h
public expect fun sysconf(attr: CInt): CLong

// stdlib.h
public expect fun setenv(envVarName: String?, envVarValue: String?, overwrite: CInt): CInt

// stdlib.h
public expect fun unsetenv(envVarName: String?): CInt

// stdlib.h
public expect fun realpath(fileName: String?, resolvedName: COpaquePointer?): COpaquePointer?

// unistd.h
public expect fun link(src: String?, dst: String?): CInt

// unistd.h
public expect fun readlink(path: String?, buf: COpaquePointer?, bufsize: SizeT): SsizeT

// unistd.h
public expect fun symlink(path1: String?, path2: String?): CInt

// dirent.h
public expect fun opendir(name: String?): DIR?

// unistd.h
public expect fun rmdir(path: String?): CInt

// stat.h
public expect fun mkdir(dirName: String?, mode: ModeT): CInt

// stat.h
public expect fun chmod(path: String?, mode: ModeT): CInt

// stat.h
public expect fun fchmod(attr1: CInt, attr2: ModeT): CInt

// unistd.h
public expect fun fsync(fd: CInt): CInt

// dirent.h
public expect fun closedir(ptr: DIR?): CInt

// sched.h
public expect fun schedGetPriorityMax(policy: CInt): CInt

// sched.h
public expect fun schedGetPriorityMin(policy: CInt): CInt

// sched.h
public expect fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt

// sched.h
public expect fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt

// sched.h
public expect fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt

// sched.h
public expect fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt

// sched.h
public expect fun schedRrGetInterval(pid: io.github.kotlinmania.libc.PidT, tp: io.github.kotlinmania.libc.Timespec?): CInt

// sched.h
public expect fun schedYield(): CInt

// errnoLib.h
public expect fun errnoSet(err: CInt): CInt

// errnoLib.h
public expect fun errnoGet(): CInt

// unistd.h
public expect fun setgid(gid: io.github.kotlinmania.libc.GidT): CInt

// unistd.h
public expect fun getgid(): io.github.kotlinmania.libc.GidT

// unistd.h
public expect fun setuid(uid: io.github.kotlinmania.libc.UidT): CInt

// unistd.h
public expect fun getuid(): io.github.kotlinmania.libc.UidT

// signal.h
public expect fun sigemptyset(set: CUlonglong?): CInt

public expect fun sigfillset(set: CUlonglong?): CInt

public expect fun sigdelset(set: CUlonglong?, signum: CInt): CInt

public expect fun sigismember(set: CUlonglong?, signum: CInt): CInt

// pthread.h for kernel
// signal.h for user
public expect fun pthreadSigmask(how: CInt, set: CUlonglong?, oset: CUlonglong?): CInt

// signal.h for user
public expect fun kill(pid: PidT, signo: CInt): CInt

// signal.h for user
public expect fun sigqueue(pid: PidT, signo: CInt, value: io.github.kotlinmania.libc.Sigval): CInt

// signal.h for user
public expect fun sigqueue(rtpId: io.github.kotlinmania.libc.RtpId, signo: CInt, pValue: io.github.kotlinmania.libc.Sigval?, sigCode: CInt): CInt

// signal.h
public expect fun taskKill(taskId: io.github.kotlinmania.libc.TaskId, signo: CInt): CInt

// signal.h
public expect fun raise(signo: CInt): CInt

// taskLibCommon.h
public expect fun taskIdSelf(): io.github.kotlinmania.libc.TaskId

public expect fun taskDelay(ticks: io.github.kotlinmania.libc.VxTicksT): CInt

// taskLib.h
public expect fun taskNameSet(taskId: io.github.kotlinmania.libc.TaskId, taskName: COpaquePointer?): CInt

public expect fun taskNameGet(taskId: io.github.kotlinmania.libc.TaskId, bufName: COpaquePointer?, bufsize: SizeT): CInt

// rtpLibCommon.h
public expect fun rtpInfoGet(rtpId: io.github.kotlinmania.libc.RtpId, rtpStruct: io.github.kotlinmania.libc.RtpDesc?): CInt

public expect fun rtpSpawn(pubrtpFileName: String?, argv: COpaquePointer?, envp: COpaquePointer?, priority: CInt, uStackSize: SizeT, options: CInt, taskOptions: CInt): RtpId

// pathLib.h
public expect fun pathIsAbsolute(filepath: String?, pNameTail: COpaquePointer?): Bool

public expect fun writev(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt): SsizeT

// randomNumGen.h
public expect fun randBytes(buf: CUchar?, length: CInt): CInt

public expect fun randABytes(buf: CUchar?, length: CInt): CInt

public expect fun randUBytes(buf: CUchar?, length: CInt): CInt

public expect fun randSecure(): CInt

// mqueue.h
public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): io.github.kotlinmania.libc.MqdT

public expect fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT

public expect fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: io.github.kotlinmania.libc.Timespec?): SsizeT

public expect fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: io.github.kotlinmania.libc.Timespec?): CInt

public expect fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt

public expect fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt

// vxCpuLib.h
public expect fun vxCpuEnabledGet(): io.github.kotlinmania.libc.CpusetT

// Get set of running CPU's in the system
public expect fun vxCpuConfiguredGet(): io.github.kotlinmania.libc.CpusetT

public fun wifexited(status: CInt): Boolean {
    return (status and 0xFF00) == 0
}

public fun wifsignaled(status: CInt): Boolean {
    return (status and 0xFF00) != 0
}

public fun wifstopped(status: CInt): Boolean {
    return (status and 0xFF0000) != 0
}

public fun wexitstatus(status: CInt): CInt {
    return status and 0xFF
}

public fun wifcontinued(status: CInt): CInt {
    return (status shr 24) and 0xFF
}

public fun wtermsig(status: CInt): CInt {
    return (status shr 8) and 0xFF
}

public fun wstopsig(status: CInt): CInt {
    return (status shr 16) and 0xFF
}

public fun pread(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT {
    return -1L
}

public fun pwrite(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT {
    return -1L
}

public fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt {
    var memptr = memptr
    // check to see if align is a power of 2 and if align is a multiple
    // of sizeof(void *)
    if ((align and align - 1uL != 0uL) || (align.toInt() % sizeOf<SizeT>() != 0)) {
        return EINVAL
    }
    return run {
        // posixMemalign should not set errno
        val e = errnoGet()
        val temp = memalign(align, size)
        errnoSet(e.toInt())
        if ((temp == null)) {
            ENOMEM
        } else {
            memptr = temp
            0
        }
    }
}
