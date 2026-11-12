// port-lint: source new/qurt/signal.rs
package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.PthreadAttrT
import io.github.kotlinmania.libc.new.qurt.SigsetT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `signal.h`

public fun interface SigeventSigevNotifyFunctionCallback {
    public operator fun invoke(arg0: Sigval)
}

public fun interface SigactionSaHandlerCallback {
    public operator fun invoke(arg0: CInt)
}

public fun interface SigactionSaSigactionCallback {
    public operator fun invoke(arg0: CInt, arg1: MutPtr<SiginfoT>, arg2: MutPtr<CVoid>)
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
public class Sigval internal constructor(
    public var sivalInt: CInt,
    sivalPtrCtorArg: MutPtr<CVoid>,
) {
    public var sivalPtr: MutPtr<CVoid> = sivalPtrCtorArg
        internal set

    public constructor() : this(
        sivalInt = 0,
        sivalPtrCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.sivalInt

    public operator fun component2(): MutPtr<CVoid> = this.sivalPtr

    public fun copy(sivalInt: CInt = this.sivalInt, sivalPtr: MutPtr<CVoid> = this.sivalPtr): Sigval = Sigval(sivalInt = sivalInt, sivalPtrCtorArg = sivalPtr)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigval) return false
        if (this.sivalInt != other.sivalInt) return false
        if (this.sivalPtr != other.sivalPtr) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sivalInt.hashCode()
        result = 31 * result + this.sivalPtr.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sigval> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 16L
                override fun readNative(addr: Long): Sigval =
                    Sigval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: Sigval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.sivalInt)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.sivalPtr)
                }
            }

        public operator fun invoke(
            sivalInt: CInt = 0,
            sivalPtr: MutPtr<CVoid> = MutPtr(0L),
        ): Sigval =
            Sigval(
                sivalInt = sivalInt,
                sivalPtrCtorArg = sivalPtr,
            )
    }
}

public class Sigevent internal constructor(
    public var sigevNotify: CInt,
    public var sigevSigno: CInt,
    public var sigevValue: Sigval,
    public var sigevNotifyFunction: SigeventSigevNotifyFunctionCallback?,
    sigevNotifyAttributesCtorArg: MutPtr<PthreadAttrT>,
) {
    public var sigevNotifyAttributes: MutPtr<PthreadAttrT> = sigevNotifyAttributesCtorArg
        internal set

    public constructor() : this(
        sigevNotify = 0,
        sigevSigno = 0,
        sigevValue = Sigval(),
        sigevNotifyFunction = null,
        sigevNotifyAttributesCtorArg = MutPtr(0L),
    )

    public operator fun component1(): CInt = this.sigevNotify

    public operator fun component2(): CInt = this.sigevSigno

    public operator fun component3(): Sigval = this.sigevValue

    public operator fun component4(): SigeventSigevNotifyFunctionCallback? = this.sigevNotifyFunction

    public operator fun component5(): MutPtr<PthreadAttrT> = this.sigevNotifyAttributes

    public fun copy(sigevNotify: CInt = this.sigevNotify, sigevSigno: CInt = this.sigevSigno, sigevValue: Sigval = this.sigevValue, sigevNotifyFunction: SigeventSigevNotifyFunctionCallback? = this.sigevNotifyFunction, sigevNotifyAttributes: MutPtr<PthreadAttrT> = this.sigevNotifyAttributes): Sigevent = Sigevent(sigevNotify = sigevNotify, sigevSigno = sigevSigno, sigevValue = sigevValue, sigevNotifyFunction = sigevNotifyFunction, sigevNotifyAttributesCtorArg = sigevNotifyAttributes)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sigevent) return false
        if (this.sigevNotify != other.sigevNotify) return false
        if (this.sigevSigno != other.sigevSigno) return false
        if (this.sigevValue != other.sigevValue) return false
        if (this.sigevNotifyFunction != other.sigevNotifyFunction) return false
        if (this.sigevNotifyAttributes != other.sigevNotifyAttributes) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.sigevNotify.hashCode()
        result = 31 * result + this.sigevSigno.hashCode()
        result = 31 * result + this.sigevValue.hashCode()
        result = 31 * result + this.sigevNotifyFunction.hashCode()
        result = 31 * result + this.sigevNotifyAttributes.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            sigevNotify: CInt = 0,
            sigevSigno: CInt = 0,
            sigevValue: Sigval = Sigval(),
            sigevNotifyFunction: SigeventSigevNotifyFunctionCallback? = null,
            sigevNotifyAttributes: MutPtr<PthreadAttrT> = MutPtr(0L),
        ): Sigevent =
            Sigevent(
                sigevNotify = sigevNotify,
                sigevSigno = sigevSigno,
                sigevValue = sigevValue,
                sigevNotifyFunction = sigevNotifyFunction,
                sigevNotifyAttributesCtorArg = sigevNotifyAttributes,
            )
    }
}

public data class SiginfoT(
    public var siSigno: CInt = 0,
    public var siCode: CInt = 0,
    public var siValue: Sigval = Sigval(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SiginfoT> {
                override val alignBytes: Long = 8L
                override val sizeBytes: Long = 24L
                override fun readNative(addr: Long): SiginfoT =
                    SiginfoT(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (Sigval.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SiginfoT) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.siSigno)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.siCode)
                    (Sigval.typeLayout()).writeNative(addr + 8L, value.siValue)
                }
            }
    }
}

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
public expect fun sigemptyset(set: MutPtr<SigsetT>): CInt

public expect fun sigfillset(set: MutPtr<SigsetT>): CInt

public expect fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt

public expect fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt

public expect fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt

public expect fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun sigpending(set: MutPtr<SigsetT>): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

// QuRT-specific signal functions
public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun sigaction(sig: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt

public expect fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt
