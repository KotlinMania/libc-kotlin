@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_signal(sig, handler)

public actual fun kill(pid: PidT, sig: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_kill(pid, sig)

public actual fun raise(sig: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_raise(sig)

public actual fun alarm(seconds: CUint): CUint =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_alarm(seconds)

public actual fun pause(): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_pause()

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigemptyset(set?.value?.toCPointer<ByteVar>())

public actual fun sigfillset(set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigfillset(set?.value?.toCPointer<ByteVar>())

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigaddset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigdelset(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigismember(set?.value?.toCPointer<ByteVar>(), signum)

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigprocmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun sigpending(set: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigpending(set?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun sigaction(sig: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigaction(sig, act?.value?.toCPointer<ByteVar>(), oact?.value?.toCPointer<ByteVar>())

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.qurt.signal.cinterop.libc_new_qurt_signal_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())
