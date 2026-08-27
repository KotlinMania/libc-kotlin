// port-lint: source libc/src/new/qurt/signal.rs
package io.github.kotlinmania.libc.new.qurt
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public typealias SighandlerT = ULong

public data class Sigval(
    val sivalInt: CInt,
    val sivalPtr: COpaquePointer?,
)

public data class Sigevent(
    val sigevNotify: CInt,
    val sigevSigno: CInt,
    val sigevValue: Sigval,
    val sigevNotifyFunction: ((Sigval) -> Unit)?,
    val sigevNotifyAttributes: PthreadAttrT?,
)

public data class SiginfoT(
    val siSigno: CInt,
    val siCode: CInt,
    val siValue: Sigval,
    val siAddr: COpaquePointer? = null,
    val siPid: PidT? = null,
    val siUid: UidT? = null,
    val siStatus: CInt? = null,
    val siUtime: CLong? = null,
    val siStime: CLong? = null,
)

public data class Sigaction(
    val saHandler: ((CInt) -> Unit)?,
    val saMask: SigsetT,
    val saFlags: CInt,
    val saSigaction: ((CInt, SiginfoT?, COpaquePointer?) -> Unit)?,
)

public const val SIGHUP: CInt = 1
public const val SIGINT: CInt = 2
public const val SIGQUIT: CInt = 3
public const val SIGILL: CInt = 4
public const val SIGTRAP: CInt = 5
public const val SIGABRT: CInt = 6
public const val SIGBUS: CInt = 7
public const val SIGFPE: CInt = 8
public const val SIGKILL: CInt = 9
public const val SIGUSR1: CInt = 10
public const val SIGSEGV: CInt = 11
public const val SIGUSR2: CInt = 12
public const val SIGPIPE: CInt = 13
public const val SIGALRM: CInt = 14
public const val SIGTERM: CInt = 15
public const val SIGSTKFLT: CInt = 16
public const val SIGCHLD: CInt = 17
public const val SIGCONT: CInt = 18
public const val SIGSTOP: CInt = 19
public const val SIGTSTP: CInt = 20
public const val SIGTTIN: CInt = 21
public const val SIGTTOU: CInt = 22
public const val SIGURG: CInt = 23
public const val SIGXCPU: CInt = 24
public const val SIGXFSZ: CInt = 25
public const val SIGVTALRM: CInt = 26
public const val SIGPROF: CInt = 27
public const val SIGWINCH: CInt = 28
public const val SIGIO: CInt = 29
public const val SIGPWR: CInt = 30
public const val SIGSYS: CInt = 31
public val SIG_DFL: SighandlerT = 0.toSighandlerT()
public val SIG_IGN: SighandlerT = 1.toSighandlerT()
public val SIG_ERR: SighandlerT = 0.toSighandlerT().inv()
public const val SIG_BLOCK: CInt = 1
public const val SIG_UNBLOCK: CInt = 2
public const val SIG_SETMASK: CInt = 3
public const val POSIX_MSG: CInt = 7
public const val POSIX_NOTIF: CInt = 8
public const val SIGRTMIN: CInt = 10
public const val SIGRTMAX: CInt = 32
public const val SIGEV_NONE: CInt = 0
public const val SIGEV_SIGNAL: CInt = 1
public const val SIGEV_THREAD: CInt = 2
public const val SA_SIGINFO: CInt = 1

public fun signal(sig: CInt, handler: SighandlerT): SighandlerT = throw UnsupportedOperationException("Not implemented on this platform")

public fun kill(pid: PidT, sig: CInt): CInt = -1

public fun raise(sig: CInt): CInt = -1

public fun alarm(seconds: CUInt): CUInt = 0u

public fun pause(): CInt = -1

public fun sigemptyset(set: SigsetT?): CInt = -1

public fun sigfillset(set: SigsetT?): CInt = -1

public fun sigaddset(set: SigsetT?, signum: CInt): CInt = -1

public fun sigdelset(set: SigsetT?, signum: CInt): CInt = -1

public fun sigismember(set: SigsetT?, signum: CInt): CInt = -1

public fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt = -1

public fun sigpending(set: SigsetT?): CInt = -1

public fun sigsuspend(mask: SigsetT?): CInt = -1

public fun sigwait(set: SigsetT?, sig: CInt?): CInt = -1

public fun sigaction(sig: CInt, act: Sigaction?, oact: Sigaction?): CInt = -1

public fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt = -1
