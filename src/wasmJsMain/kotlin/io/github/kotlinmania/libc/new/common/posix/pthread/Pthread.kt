@file:OptIn(kotlin.js.ExperimentalWasmJsInterop::class)

// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix.pthread

public actual class PthreadT internal constructor(internal val rawHandle: Int)

public actual class PthreadAttrT internal constructor(internal val rawHandle: Int)

public actual class PthreadMutexT internal constructor(internal val rawHandle: Int)

public actual class PthreadMutexattrT internal constructor(internal val rawHandle: Int)

public actual class PthreadCondT internal constructor(internal val rawHandle: Int)

public actual class PthreadCondattrT internal constructor(internal val rawHandle: Int)

public actual class PthreadRwlockT internal constructor(internal val rawHandle: Int)

public actual class PthreadRwlockattrT internal constructor(internal val rawHandle: Int)

public actual class PthreadBarrierT internal constructor(internal val rawHandle: Int)

public actual class PthreadBarrierattrT internal constructor(internal val rawHandle: Int)

public actual class PthreadSpinlockT internal constructor(internal val rawHandle: Int)

public actual class PthreadOnceT internal constructor(internal val rawHandle: Int)

@JsFun("(thread) => globalThis.libcKotlinPthread.pthreadCancel(thread)")
private external fun wasmPthreadCancel(thread: Int): Int

@JsFun("(thread, sig) => globalThis.libcKotlinPthread.pthreadKill(thread, sig)")
private external fun wasmPthreadKill(thread: Int, sig: Int): Int

@JsFun("(thread, priority) => globalThis.libcKotlinPthread.pthreadSetschedprio(thread, priority)")
private external fun wasmPthreadSetschedprio(thread: Int, priority: Int): Int

@JsFun("(lock) => globalThis.libcKotlinPthread.pthreadSpinDestroy(lock)")
private external fun wasmPthreadSpinDestroy(lock: Int): Int

@JsFun("(lock, pshared) => globalThis.libcKotlinPthread.pthreadSpinInit(lock, pshared)")
private external fun wasmPthreadSpinInit(lock: Int, pshared: Int): Int

@JsFun("(lock) => globalThis.libcKotlinPthread.pthreadSpinLock(lock)")
private external fun wasmPthreadSpinLock(lock: Int): Int

@JsFun("(lock) => globalThis.libcKotlinPthread.pthreadSpinTrylock(lock)")
private external fun wasmPthreadSpinTrylock(lock: Int): Int

@JsFun("(lock) => globalThis.libcKotlinPthread.pthreadSpinUnlock(lock)")
private external fun wasmPthreadSpinUnlock(lock: Int): Int

@JsFun("(barrier) => globalThis.libcKotlinPthread.pthreadBarrierDestroy(barrier)")
private external fun wasmPthreadBarrierDestroy(barrier: Int): Int

@JsFun("(barrier) => globalThis.libcKotlinPthread.pthreadBarrierWait(barrier)")
private external fun wasmPthreadBarrierWait(barrier: Int): Int

@JsFun("(attr) => globalThis.libcKotlinPthread.pthreadBarrierattrDestroy(attr)")
private external fun wasmPthreadBarrierattrDestroy(attr: Int): Int

@JsFun("(attr) => globalThis.libcKotlinPthread.pthreadBarrierattrInit(attr)")
private external fun wasmPthreadBarrierattrInit(attr: Int): Int

@JsFun("(mutex) => globalThis.libcKotlinPthread.pthreadMutexConsistent(mutex)")
private external fun wasmPthreadMutexConsistent(mutex: Int): Int

public actual fun pthreadCancel(thread: PthreadT): Int = wasmPthreadCancel(thread.rawHandle)

public actual fun pthreadKill(thread: PthreadT, sig: Int): Int = wasmPthreadKill(thread.rawHandle, sig)

public actual fun pthreadSetschedprio(native: PthreadT, priority: Int): Int =
    wasmPthreadSetschedprio(native.rawHandle, priority)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int = wasmPthreadSpinDestroy(lock.rawHandle)

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int =
    wasmPthreadSpinInit(lock.rawHandle, pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): Int = wasmPthreadSpinLock(lock.rawHandle)

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int = wasmPthreadSpinTrylock(lock.rawHandle)

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int = wasmPthreadSpinUnlock(lock.rawHandle)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int = wasmPthreadBarrierDestroy(barrier.rawHandle)

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): Int = wasmPthreadBarrierWait(barrier.rawHandle)

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int =
    wasmPthreadBarrierattrDestroy(attr.rawHandle)

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int =
    wasmPthreadBarrierattrInit(attr.rawHandle)

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): Int =
    wasmPthreadMutexConsistent(mutex.rawHandle)
