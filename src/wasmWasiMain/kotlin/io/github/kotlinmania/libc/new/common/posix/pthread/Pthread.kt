@file:OptIn(kotlin.wasm.ExperimentalWasmInterop::class)

// port-lint: source new/common/posix/pthread.rs

package io.github.kotlinmania.libc.new.common.posix.pthread

import kotlin.wasm.WasmImport

public actual class PthreadT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadAttrT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadMutexT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadMutexattrT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadCondT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadCondattrT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadRwlockT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadRwlockattrT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadBarrierT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadBarrierattrT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadSpinlockT internal constructor(
    internal val rawHandle: Int,
)

public actual class PthreadOnceT internal constructor(
    internal val rawHandle: Int,
)

@WasmImport("libc_kotlin_pthread", "pthread_cancel")
private external fun wasiPthreadCancel(thread: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_kill")
private external fun wasiPthreadKill(thread: Int, sig: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_setschedprio")
private external fun wasiPthreadSetschedprio(thread: Int, priority: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_spin_destroy")
private external fun wasiPthreadSpinDestroy(lock: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_spin_init")
private external fun wasiPthreadSpinInit(lock: Int, pshared: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_spin_lock")
private external fun wasiPthreadSpinLock(lock: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_spin_trylock")
private external fun wasiPthreadSpinTrylock(lock: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_spin_unlock")
private external fun wasiPthreadSpinUnlock(lock: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_barrier_destroy")
private external fun wasiPthreadBarrierDestroy(barrier: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_barrier_wait")
private external fun wasiPthreadBarrierWait(barrier: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_barrierattr_destroy")
private external fun wasiPthreadBarrierattrDestroy(attr: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_barrierattr_init")
private external fun wasiPthreadBarrierattrInit(attr: Int): Int

@WasmImport("libc_kotlin_pthread", "pthread_mutex_consistent")
private external fun wasiPthreadMutexConsistent(mutex: Int): Int

public actual fun pthreadCancel(thread: PthreadT): Int = wasiPthreadCancel(thread.rawHandle)

public actual fun pthreadKill(thread: PthreadT, sig: Int): Int = wasiPthreadKill(thread.rawHandle, sig)

public actual fun pthreadSetschedprio(native: PthreadT, priority: Int): Int =
    wasiPthreadSetschedprio(native.rawHandle, priority)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int = wasiPthreadSpinDestroy(lock.rawHandle)

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int =
    wasiPthreadSpinInit(lock.rawHandle, pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): Int = wasiPthreadSpinLock(lock.rawHandle)

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int = wasiPthreadSpinTrylock(lock.rawHandle)

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int = wasiPthreadSpinUnlock(lock.rawHandle)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int = wasiPthreadBarrierDestroy(barrier.rawHandle)

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): Int = wasiPthreadBarrierWait(barrier.rawHandle)

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int =
    wasiPthreadBarrierattrDestroy(attr.rawHandle)

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int =
    wasiPthreadBarrierattrInit(attr.rawHandle)

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): Int =
    wasiPthreadMutexConsistent(mutex.rawHandle)
