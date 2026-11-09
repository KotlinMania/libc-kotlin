@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT

private object NewQurtSignalJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_qurt_signal_signal(sig: Int, handler: Long): Long

    @JvmStatic
    external fun libc_new_qurt_signal_kill(pid: Int, sig: Int): Int

    @JvmStatic
    external fun libc_new_qurt_signal_raise(sig: Int): Int

    @JvmStatic
    external fun libc_new_qurt_signal_alarm(seconds: Int): Int

    @JvmStatic
    external fun libc_new_qurt_signal_pause(): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigemptyset(set: Long): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigfillset(set: Long): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigaddset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigdelset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigismember(set: Long, signum: Int): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigprocmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigpending(set: Long): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigaction(sig: Int, act: Long, oact: Long): Int

    @JvmStatic
    external fun libc_new_qurt_signal_sigtimedwait(set: Long, info: Long, timeout: Long): Int
}

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    NewQurtSignalJniBridge.libc_new_qurt_signal_signal(sig, handler.toLong()).toULong()

public actual fun kill(pid: PidT, sig: CInt): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_kill(pid, sig)

public actual fun raise(sig: CInt): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_raise(sig)

public actual fun alarm(seconds: CUint): CUint =
    NewQurtSignalJniBridge.libc_new_qurt_signal_alarm(seconds.toInt()).toUInt()

public actual fun pause(): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_pause()

public actual fun sigemptyset(set: COpaquePointer?): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigemptyset((set?.value ?: 0L))

public actual fun sigfillset(set: COpaquePointer?): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigfillset((set?.value ?: 0L))

public actual fun sigaddset(set: COpaquePointer?, signum: CInt): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigaddset((set?.value ?: 0L), signum)

public actual fun sigdelset(set: COpaquePointer?, signum: CInt): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigdelset((set?.value ?: 0L), signum)

public actual fun sigismember(set: COpaquePointer?, signum: CInt): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigismember((set?.value ?: 0L), signum)

public actual fun sigprocmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigprocmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun sigpending(set: COpaquePointer?): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigpending((set?.value ?: 0L))

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigsuspend((mask?.value ?: 0L))

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun sigaction(sig: CInt, act: COpaquePointer?, oact: COpaquePointer?): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigaction(sig, (act?.value ?: 0L), (oact?.value ?: 0L))

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    NewQurtSignalJniBridge.libc_new_qurt_signal_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))
