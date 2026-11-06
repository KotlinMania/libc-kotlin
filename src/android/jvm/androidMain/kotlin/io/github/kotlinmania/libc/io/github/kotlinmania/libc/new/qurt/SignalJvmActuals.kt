package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object SignalRawLibc {
    external fun signal(sig: Int, handler: Long): Long
    external fun kill(pid: Int, sig: Int): Int
    external fun raise(sig: Int): Int
    external fun alarm(seconds: Int): Int
    external fun pause(): Int
    external fun sigemptyset(set: Long): Int
    external fun sigfillset(set: Long): Int
    external fun sigaddset(set: Long, signum: Int): Int
    external fun sigdelset(set: Long, signum: Int): Int
    external fun sigismember(set: Long, signum: Int): Int
    external fun sigprocmask(how: Int, set: Long, oldset: Long): Int
    external fun sigpending(set: Long): Int
    external fun sigsuspend(mask: Long): Int
    external fun sigwait(set: Long, sig: Long): Int
    external fun sigaction(sig: Int, act: Long, oact: Long): Int
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
}

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    SignalRawLibc.signal(sig, handler)

public actual fun kill(pid: PidT, sig: CInt): CInt =
    SignalRawLibc.kill(pid, sig)

public actual fun raise(sig: CInt): CInt =
    SignalRawLibc.raise(sig)

public actual fun alarm(seconds: CUint): CUint =
    SignalRawLibc.alarm(seconds)

public actual fun pause(): CInt =
    SignalRawLibc.pause()

public actual fun sigemptyset(set: SigsetT?): CInt =
    SignalRawLibc.sigemptyset(set?.toLong() ?: 0L)

public actual fun sigfillset(set: SigsetT?): CInt =
    SignalRawLibc.sigfillset(set?.toLong() ?: 0L)

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    SignalRawLibc.sigaddset(set?.toLong() ?: 0L, signum)

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    SignalRawLibc.sigdelset(set?.toLong() ?: 0L, signum)

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    SignalRawLibc.sigismember(set?.toLong() ?: 0L, signum)

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    SignalRawLibc.sigprocmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun sigpending(set: SigsetT?): CInt =
    SignalRawLibc.sigpending(set?.toLong() ?: 0L)

public actual fun sigsuspend(mask: SigsetT?): CInt =
    SignalRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    SignalRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun sigaction(sig: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    SignalRawLibc.sigaction(sig, act?.toLong() ?: 0L, oact?.toLong() ?: 0L)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    SignalRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)
