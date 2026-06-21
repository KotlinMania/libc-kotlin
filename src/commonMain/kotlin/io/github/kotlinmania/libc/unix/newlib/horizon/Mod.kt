// port-lint: source unix/newlib/horizon/mod.rs
package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias WcharT = CUInt
public typealias URegisterT = CUInt
public typealias UChar = CUChar
public typealias UShort = CUShort
public typealias UInt = CUInt
public typealias ULong = CULong
public typealias Ushort = CUShort
public typealias Uint = CUInt
public typealias Ulong = CULong
public typealias ClockT = CULong
public typealias DaddrT = CLong
public typealias CaddrT = String?
public typealias SbintimeT = CLongLong
public typealias SigsetT = CULong

public data class Hostent(
    val hName: String?,
    val hAliases: COpaquePointer?,
    val hAddrtype: UShort,
    val hLength: UShort,
    val hAddrList: COpaquePointer?,
)

public data class Pollfd(
    val fd: CInt,
    val events: CInt,
    val revents: CInt,
)

public data class Sockaddr(
    val saFamily: SaFamilyT,
    val saData: ByteArray,
)

public data class SockaddrStorage(
    val ssFamily: SaFamilyT,
)

public data class SockaddrIn(
    val sinFamily: SaFamilyT,
    val sinPort: InPortT,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)

public data class SockaddrIn6(
    val sin6Family: SaFamilyT,
    val sin6Port: InPortT,
    val sin6Flowinfo: UInt,
    val sin6Addr: In6Addr,
    val sin6ScopeId: UInt,
)

public data class SockaddrUn(
    val sunLen: CUChar,
    val sunFamily: SaFamilyT,
    val sunPath: ByteArray,
)

public data class SchedParam(
    val schedPriority: CInt,
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
    val stMtim: Timespec,
    val stCtim: Timespec,
    val stBlksize: BlksizeT,
    val stBlocks: BlkcntT,
    val stSpare4: LongArray,
)

public const val SIGEV_NONE: CInt = 1
public const val SIGEV_SIGNAL: CInt = 2
public const val SIGEV_THREAD: CInt = 3
public const val SA_NOCLDSTOP: CInt = 1
public const val MINSIGSTKSZ: CInt = 2048
public const val SIGSTKSZ: CInt = 8192
public const val SS_ONSTACK: CInt = 1
public const val SS_DISABLE: CInt = 2
public const val SIG_SETMASK: CInt = 0
public const val SIG_BLOCK: CInt = 1
public const val SIG_UNBLOCK: CInt = 2
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
public const val SIGCLD: CInt = 20
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGIO: CInt = 23
public const val SIGPOLL: CInt = 23
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
public const val SIGLOST: CInt = 29
public const val SIGUSR1: CInt = 30
public const val SIGUSR2: CInt = 31
public const val NSIG: CInt = 32
public const val CLOCK_ENABLED: CUInt = 1u
public const val CLOCK_DISABLED: CUInt = 0u
public const val CLOCK_ALLOWED: CUInt = 1u
public const val CLOCK_DISALLOWED: CUInt = 0u
public const val TIMER_ABSTIME: CUInt = 4u
public const val SOL_SOCKET: CInt = 65535
public const val MSG_OOB: CInt = 1
public const val MSG_PEEK: CInt = 2
public const val MSG_DONTWAIT: CInt = 4
public const val MSG_DONTROUTE: CInt = 0
public const val MSG_WAITALL: CInt = 0
public const val MSG_MORE: CInt = 0
public const val MSG_NOSIGNAL: CInt = 0
public const val SOL_CONFIG: CUInt = 65534u
public const val PTHREAD_STACK_MIN: ULong = 4096uL
public const val WNOHANG: CInt = 1
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
public const val EAI_AGAIN: CInt = 2
public const val EAI_BADFLAGS: CInt = 3
public const val EAI_FAIL: CInt = 4
public const val EAI_SERVICE: CInt = 9
public const val EAI_SYSTEM: CInt = 11
public const val EAI_BADHINTS: CInt = 12
public const val EAI_PROTOCOL: CInt = 13
public const val EAI_OVERFLOW: CInt = 14
public const val EAI_MAX: CInt = 15
public const val AF_UNIX: CInt = 1
public const val AF_INET6: CInt = 23
public const val FIONBIO: CULong = 1uL
public const val SCHED_FIFO: CInt = 1
public const val SCHED_RR: CInt = 2
public const val GRND_NONBLOCK: CUInt = 0x1u
public const val GRND_RANDOM: CUInt = 0x2u

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt
public expect fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt
public expect fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt
public expect fun pthreadAttrGetprocessoridNp(attr: PthreadAttrT?, processorId: CInt?): CInt
public expect fun pthreadAttrSetprocessoridNp(attr: PthreadAttrT?, processorId: CInt): CInt
public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt
public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt
public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt
public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt
public expect fun pthreadGetprocessoridNp(): CInt
public expect fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT
public expect fun gethostid(): CLong
