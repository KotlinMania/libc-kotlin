@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SigsetT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalAlarm
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalKill
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalPause
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalRaise
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigaction
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigaddset
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigdelset
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigemptyset
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigfillset
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigismember
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSignal
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigpending
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigprocmask
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigsuspend
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigtimedwait
import io.github.kotlinmania.libc.new.qurt.signal.cinterop.libcNewQurtSignalSigwait
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    libcNewQurtSignalSignal(sig, handler)

public actual fun kill(pid: PidT, sig: CInt): CInt =
    libcNewQurtSignalKill(pid, sig)

public actual fun raise(sig: CInt): CInt =
    libcNewQurtSignalRaise(sig)

public actual fun alarm(seconds: CUint): CUint =
    libcNewQurtSignalAlarm(seconds)

public actual fun pause(): CInt =
    libcNewQurtSignalPause()

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    libcNewQurtSignalSigemptyset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    libcNewQurtSignalSigfillset(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    libcNewQurtSignalSigaddset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    libcNewQurtSignalSigdelset(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    libcNewQurtSignalSigismember(set.rawAddress.toCPointer<ByteVar>(), signum)

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    libcNewQurtSignalSigprocmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    libcNewQurtSignalSigpending(set.rawAddress.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    libcNewQurtSignalSigsuspend(mask.rawAddress.toCPointer<ByteVar>())

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    libcNewQurtSignalSigwait(set.rawAddress.toCPointer<ByteVar>(), sig.rawAddress.toCPointer<ByteVar>())

public actual fun sigaction(sig: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    libcNewQurtSignalSigaction(sig, act.rawAddress.toCPointer<ByteVar>(), oact.rawAddress.toCPointer<ByteVar>())

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    libcNewQurtSignalSigtimedwait(set.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), timeout.rawAddress.toCPointer<ByteVar>())
