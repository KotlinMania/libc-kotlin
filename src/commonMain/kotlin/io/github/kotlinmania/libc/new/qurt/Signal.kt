// port-lint: source new/qurt/signal.rs
package io.github.kotlinmania.libc.new.qurt
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public data class Sigval(
    val sivalInt: Int,
    val sivalPtr: COpaquePointer?,
)

public data class Sigevent(
    val sigevNotify: Int,
    val sigevSigno: Int,
    val sigevValue: Sigval,
    val sigevNotifyFunction: ((Sigval) -> Unit)?,
    val sigevNotifyAttributes: UInt?,
)

public data class SiginfoT(
    val handle: Long = 0L,
    val siSigno: Int,
    val siCode: Int,
    val siValue: Sigval,
    val siAddr: COpaquePointer? = null,
    val siPid: Int? = null,
    val siUid: UInt? = null,
    val siStatus: Int? = null,
    val siUtime: Long? = null,
    val siStime: Long? = null,
)

public data class Sigaction(
    val saHandler: ((Int) -> Unit)?,
    val saMask: ULong,
    val saFlags: Int,
    val saSigaction: ((Int, SiginfoT?, COpaquePointer?) -> Unit)?,
)

public const val SIGHUP: Int = 1
public const val SIGINT: Int = 2
public const val SIGQUIT: Int = 3
public const val SIGILL: Int = 4
public const val SIGTRAP: Int = 5
public const val SIGABRT: Int = 6
public const val SIGBUS: Int = 7
public const val SIGFPE: Int = 8
public const val SIGKILL: Int = 9
public const val SIGUSR1: Int = 10
public const val SIGSEGV: Int = 11
public const val SIGUSR2: Int = 12
public const val SIGPIPE: Int = 13
public const val SIGALRM: Int = 14
public const val SIGTERM: Int = 15
public const val SIGSTKFLT: Int = 16
public const val SIGCHLD: Int = 17
public const val SIGCONT: Int = 18
public const val SIGSTOP: Int = 19
public const val SIGTSTP: Int = 20
public const val SIGTTIN: Int = 21
public const val SIGTTOU: Int = 22
public const val SIGURG: Int = 23
public const val SIGXCPU: Int = 24
public const val SIGXFSZ: Int = 25
public const val SIGVTALRM: Int = 26
public const val SIGPROF: Int = 27
public const val SIGWINCH: Int = 28
public const val SIGIO: Int = 29
public const val SIGPWR: Int = 30
public const val SIGSYS: Int = 31
public val SIG_DFL: ULong = 0.toULong()
public val SIG_IGN: ULong = 1.toULong()
public val SIG_ERR: ULong = 0.toULong().inv()
public const val SIG_BLOCK: Int = 1
public const val SIG_UNBLOCK: Int = 2
public const val SIG_SETMASK: Int = 3
public const val POSIX_MSG: Int = 7
public const val POSIX_NOTIF: Int = 8
public const val SIGRTMIN: Int = 10
public const val SIGRTMAX: Int = 32
public const val SIGEV_NONE: Int = 0
public const val SIGEV_SIGNAL: Int = 1
public const val SIGEV_THREAD: Int = 2
public const val SA_SIGINFO: Int = 1

public fun signal(sig: Int, handler: ULong): ULong = throw UnsupportedOperationException("Not implemented on this platform")

public expect fun kill(pid: Int, sig: Int): Int

public expect fun raise(sig: Int): Int

public fun alarm(seconds: UInt): UInt = 0u

public expect fun pause(): Int

public expect fun sigemptyset(set: ULong?): Int

public expect fun sigfillset(set: ULong?): Int

public expect fun sigaddset(set: ULong?, signum: Int): Int

public expect fun sigdelset(set: ULong?, signum: Int): Int

public expect fun sigismember(set: ULong?, signum: Int): Int

public expect fun sigprocmask(how: Int, set: ULong?, oldset: ULong?): Int

public expect fun sigpending(set: ULong?): Int

public expect fun sigsuspend(mask: ULong?): Int

public expect fun sigwait(set: ULong?, sig: Int?): Int

public expect fun sigaction(sig: Int, act: Sigaction?, oact: Sigaction?): Int

public expect fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int
