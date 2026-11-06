@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.qurt

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_signal(sig, handler)

public actual fun kill(pid: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_kill(pid, sig)

public actual fun raise(sig: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_raise(sig)

public actual fun alarm(seconds: CUint): CUint =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_alarm(seconds)

public actual fun pause(): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_pause()

public actual fun sigemptyset(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigemptyset(set?.value?.toCPointer<ByteVar>())

public actual fun sigfillset(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigfillset(set?.value?.toCPointer<ByteVar>())

public actual fun sigaddset(set: SigsetT?, signum: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigaddset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigdelset(set: SigsetT?, signum: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigdelset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: SigsetT?, signum: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigismember(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigprocmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigprocmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun sigpending(set: SigsetT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigpending(set?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: SigsetT?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun sigaction(sig: CInt, act: Sigaction?, oact: Sigaction?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigaction(sig, act?.value?.toCPointer<ByteVar>(), oact?.value?.toCPointer<ByteVar>())

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.new.qurt.cinterop.libc_signal_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())
