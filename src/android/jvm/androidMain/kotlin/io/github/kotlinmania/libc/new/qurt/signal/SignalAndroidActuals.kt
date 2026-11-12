@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SigsetT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtSignalJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtSignalSignal(sig: Int, handler: Long): Long

    @JvmStatic
    external fun libcNewQurtSignalKill(pid: Int, sig: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalRaise(sig: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalAlarm(seconds: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalPause(): Int

    @JvmStatic
    external fun libcNewQurtSignalSigemptyset(set: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigfillset(set: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigaddset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalSigdelset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalSigismember(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalSigprocmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigpending(set: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigaction(sig: Int, act: Long, oact: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigtimedwait(set: Long, info: Long, timeout: Long): Int
}

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    NewQurtSignalJniBridge.libcNewQurtSignalSignal(sig, handler.toLong()).toULong()

public actual fun kill(pid: PidT, sig: CInt): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalKill(pid, sig)

public actual fun raise(sig: CInt): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalRaise(sig)

public actual fun alarm(seconds: CUint): CUint =
    NewQurtSignalJniBridge.libcNewQurtSignalAlarm(seconds.toInt()).toUInt()

public actual fun pause(): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalPause()

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigemptyset(set.rawAddress)

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigfillset(set.rawAddress)

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigaddset(set.rawAddress, signum)

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigdelset(set.rawAddress, signum)

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigismember(set.rawAddress, signum)

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigprocmask(how, set.rawAddress, oldset.rawAddress)

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigpending(set.rawAddress)

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigsuspend(mask.rawAddress)

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigwait(set.rawAddress, sig.rawAddress)

public actual fun sigaction(sig: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigaction(sig, act.rawAddress, oact.rawAddress)

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)
