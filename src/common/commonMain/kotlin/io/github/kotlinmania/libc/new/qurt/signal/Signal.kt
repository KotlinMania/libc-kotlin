// port-lint: source new/qurt/signal.rs
package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.PthreadAttrT
import io.github.kotlinmania.libc.new.qurt.SigsetT
import io.github.kotlinmania.libc.new.qurt.SizeT

// Header: `signal.h`

public fun interface SigeventSigevNotifyFunctionCallback {
    public operator fun invoke(arg0: Sigval)
}

public fun interface SigactionSaHandlerCallback {
    public operator fun invoke(arg0: CInt)
}

public fun interface SigactionSaSigactionCallback {
    public operator fun invoke(arg0: CInt, arg1: COpaquePointer?, arg2: COpaquePointer?)
}

// Standard signal numbers
public val SIGHUP: CInt = 1

public val SIGINT: CInt = 2

public val SIGQUIT: CInt = 3

public val SIGILL: CInt = 4

public val SIGTRAP: CInt = 5

public val SIGABRT: CInt = 6

public val SIGBUS: CInt = 7

public val SIGFPE: CInt = 8

public val SIGKILL: CInt = 9

public val SIGUSR1: CInt = 10

public val SIGSEGV: CInt = 11

public val SIGUSR2: CInt = 12

public val SIGPIPE: CInt = 13

public val SIGALRM: CInt = 14

public val SIGTERM: CInt = 15

public val SIGSTKFLT: CInt = 16

public val SIGCHLD: CInt = 17

public val SIGCONT: CInt = 18

public val SIGSTOP: CInt = 19

public val SIGTSTP: CInt = 20

public val SIGTTIN: CInt = 21

public val SIGTTOU: CInt = 22

public val SIGURG: CInt = 23

public val SIGXCPU: CInt = 24

public val SIGXFSZ: CInt = 25

public val SIGVTALRM: CInt = 26

public val SIGPROF: CInt = 27

public val SIGWINCH: CInt = 28

public val SIGIO: CInt = 29

public val SIGPWR: CInt = 30

public val SIGSYS: CInt = 31

// Signal handling constants
public val SIG_DFL: SighandlerT = 0.toULong()

public val SIG_IGN: SighandlerT = 1.toULong()

public val SIG_ERR: SighandlerT = (0.inv()).toULong()

// Signal mask operations (QuRT uses different values than Linux)
public val SIG_BLOCK: CInt = 1

public val SIG_UNBLOCK: CInt = 2

public val SIG_SETMASK: CInt = 3

// QuRT-specific signal constants
public val POSIX_MSG: CInt = 7

public val POSIX_NOTIF: CInt = 8

public val SIGRTMIN: CInt = 10

public val SIGRTMAX: CInt = 32

// Notification types (from QuRT signal.h)
public val SIGEV_NONE: CInt = 0

public val SIGEV_SIGNAL: CInt = 1

public val SIGEV_THREAD: CInt = 2

public val SA_SIGINFO: CInt = 1

public typealias SighandlerT = SizeT

// Signal structures based on QuRT SDK headers
public data class Sigval(
    public var sivalInt: CInt = 0,
    public var sivalPtr: COpaquePointer? = null,
)

public data class Sigevent(
    public var sigevNotify: CInt = 0,
    public var sigevSigno: CInt = 0,
    public var sigevValue: Sigval = Sigval(),
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback? = null,
    public var sigevNotifyAttributes: PthreadAttrT? = null,
)

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siValue: Sigval = Sigval(),
)

public data class Sigaction(
    public var saHandler: SigactionSaHandlerCallback? = null,
    public var saMask: SigsetT = 0uL,
    public var saFlags: CInt = 0,
    public var saSigaction: SigactionSaSigactionCallback? = null,
)

public expect fun signal(sig: CInt, handler: SighandlerT): SighandlerT

public expect fun kill(pid: PidT, sig: CInt): CInt

public expect fun raise(sig: CInt): CInt

public expect fun alarm(seconds: CUint): CUint

public expect fun pause(): CInt

// Signal mask functions
public expect fun sigemptyset(set: COpaquePointer?): CInt

public expect fun sigfillset(set: COpaquePointer?): CInt

public expect fun sigaddset(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigdelset(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigismember(set: COpaquePointer?, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun sigpending(set: COpaquePointer?): CInt

public expect fun sigsuspend(mask: COpaquePointer?): CInt

// QuRT-specific signal functions
public expect fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt

public expect fun sigaction(sig: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt

public expect fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt
