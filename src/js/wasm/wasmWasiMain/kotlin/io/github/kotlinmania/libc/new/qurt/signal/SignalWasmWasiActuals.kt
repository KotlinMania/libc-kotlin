@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SigsetT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
@kotlin.wasm.WasmImport("libc", "libcNewQurtSignalSignal")
private external fun wasiLibcNewQurtSignalSignal(sig: Int, handler: Long): Long

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    wasiLibcNewQurtSignalSignal(sig, handler.toLong()).toULong()

@kotlin.wasm.WasmImport("libc", "libcNewQurtSignalKill")
private external fun wasiLibcNewQurtSignalKill(pid: Int, sig: Int): Int

public actual fun kill(pid: PidT, sig: CInt): CInt =
    wasiLibcNewQurtSignalKill(pid, sig)

@kotlin.wasm.WasmImport("libc", "libcNewQurtSignalRaise")
private external fun wasiLibcNewQurtSignalRaise(sig: Int): Int

public actual fun raise(sig: CInt): CInt =
    wasiLibcNewQurtSignalRaise(sig)

@kotlin.wasm.WasmImport("libc", "libcNewQurtSignalAlarm")
private external fun wasiLibcNewQurtSignalAlarm(seconds: Int): Int

public actual fun alarm(seconds: CUint): CUint =
    wasiLibcNewQurtSignalAlarm(seconds.toInt()).toUInt()

@kotlin.wasm.WasmImport("libc", "libcNewQurtSignalPause")
private external fun wasiLibcNewQurtSignalPause(): Int

public actual fun pause(): CInt =
    wasiLibcNewQurtSignalPause()

public actual fun sigemptyset(set: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigemptyset")

public actual fun sigfillset(set: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigfillset")

public actual fun sigaddset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigaddset")

public actual fun sigdelset(set: MutPtr<SigsetT>, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigdelset")

public actual fun sigismember(set: ConstPtr<SigsetT>, signum: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigismember")

public actual fun sigprocmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigprocmask")

public actual fun sigpending(set: MutPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigpending")

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigsuspend")

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigwait")

public actual fun sigaction(sig: CInt, act: ConstPtr<Sigaction>, oact: MutPtr<Sigaction>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigaction")

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcNewQurtSignalSigtimedwait")
