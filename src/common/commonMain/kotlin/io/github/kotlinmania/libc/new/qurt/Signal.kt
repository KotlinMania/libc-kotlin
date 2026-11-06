// port-lint: source new/qurt/signal.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.LibcDynamicFfi

// Header: `signal.h`

public fun interface SigeventSigevNotifyFunctionCallback {
    public operator fun invoke(arg0: Sigval)
}

public fun interface SigactionSaHandlerCallback {
    public operator fun invoke(arg0: CInt)
}

public fun interface SigactionSaSigactionCallback {
    public operator fun invoke(arg0: CInt, arg1: SiginfoT?, arg2: COpaquePointer?)
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
public open class Sigval(public var sivalInt: CInt, public var sivalPtr: COpaquePointer?)

public open class Sigevent(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback?,
    public var sigevNotifyAttributes: PthreadAttrT?,
)

public open class SiginfoT(
    public var siSigno: CInt,
    public var siCode: CInt,
    public var siValue: Sigval,
)

public open class Sigaction(
    public var saHandler: SigactionSaHandlerCallback?,
    public var saMask: SigsetT,
    public var saFlags: CInt,
    public var saSigaction: SigactionSaSigactionCallback?,
)

public fun signal(sig: CInt, handler: SighandlerT): SighandlerT {
    return LibcDynamicFfi.invoke("signal", -1, longArrayOf(sig.toLong(), handler.toLong())).toULong()
}

public fun kill(pid: PidT, sig: CInt): CInt {
    return LibcDynamicFfi.invoke("kill", -1, longArrayOf(pid.toLong(), sig.toLong())).toInt()
}

public fun raise(sig: CInt): CInt {
    return LibcDynamicFfi.invoke("raise", -1, longArrayOf(sig.toLong())).toInt()
}

public fun alarm(seconds: CUint): CUint {
    return LibcDynamicFfi.invoke("alarm", -1, longArrayOf(seconds.toLong())).toUInt()
}

public fun pause(): CInt {
    return LibcDynamicFfi.invoke("pause", -1, longArrayOf()).toInt()
}

// Signal mask functions
public fun sigemptyset(set: SigsetT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigemptyset", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigfillset(set: SigsetT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigfillset", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigaddset(set: SigsetT?, signum: CInt): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigaddset", -1, longArrayOf(__slot_0, signum.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigdelset(set: SigsetT?, signum: CInt): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigdelset", -1, longArrayOf(__slot_0, signum.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigismember(set: SigsetT?, signum: CInt): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigismember", -1, longArrayOf(__slot_0, signum.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt {
    val __slot_1 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_2 = if (oldset == null) 0L else LibcDynamicFfi.allocScalarSlot(oldset.toLong())
    try {
        return LibcDynamicFfi.invoke("sigprocmask", -1, longArrayOf(how.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sigpending(set: SigsetT?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigpending", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sigsuspend(mask: SigsetT?): CInt {
    val __slot_0 = if (mask == null) 0L else LibcDynamicFfi.allocScalarSlot(mask.toLong())
    try {
        return LibcDynamicFfi.invoke("sigsuspend", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

// QuRT-specific signal functions
public fun sigwait(set: SigsetT?, sig: CInt?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    val __slot_1 = if (sig == null) 0L else LibcDynamicFfi.allocScalarSlot(sig.toLong())
    try {
        return LibcDynamicFfi.invoke("sigwait", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sigaction(sig: CInt, act: Sigaction?, oact: Sigaction?): CInt {
    return LibcDynamicFfi.invoke("_sigaction", -1, longArrayOf(sig.toLong(), act?.value ?: 0L, oact?.value ?: 0L)).toInt()
}

public fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt {
    val __slot_0 = if (set == null) 0L else LibcDynamicFfi.allocScalarSlot(set.toLong())
    try {
        return LibcDynamicFfi.invoke("sigtimedwait", -1, longArrayOf(__slot_0, info?.value ?: 0L, timeout?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}
