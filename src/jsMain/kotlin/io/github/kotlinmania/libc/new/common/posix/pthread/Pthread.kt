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

@JsModule("libc-kotlin-pthread")
@JsNonModule
private external object PthreadAddon {
    fun pthreadCancel(thread: Int): Int
    fun pthreadKill(thread: Int, sig: Int): Int
    fun pthreadSetschedprio(thread: Int, priority: Int): Int
    fun pthreadSpinDestroy(lock: Int): Int
    fun pthreadSpinInit(lock: Int, pshared: Int): Int
    fun pthreadSpinLock(lock: Int): Int
    fun pthreadSpinTrylock(lock: Int): Int
    fun pthreadSpinUnlock(lock: Int): Int
    fun pthreadBarrierDestroy(barrier: Int): Int
    fun pthreadBarrierWait(barrier: Int): Int
    fun pthreadBarrierattrDestroy(attr: Int): Int
    fun pthreadBarrierattrInit(attr: Int): Int
    fun pthreadMutexConsistent(mutex: Int): Int
}

public actual fun pthreadCancel(thread: PthreadT): Int =
    PthreadAddon.pthreadCancel(thread.rawHandle)

public actual fun pthreadKill(thread: PthreadT, sig: Int): Int =
    PthreadAddon.pthreadKill(thread.rawHandle, sig)

public actual fun pthreadSetschedprio(native: PthreadT, priority: Int): Int =
    PthreadAddon.pthreadSetschedprio(native.rawHandle, priority)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int =
    PthreadAddon.pthreadSpinDestroy(lock.rawHandle)

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int =
    PthreadAddon.pthreadSpinInit(lock.rawHandle, pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): Int =
    PthreadAddon.pthreadSpinLock(lock.rawHandle)

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int =
    PthreadAddon.pthreadSpinTrylock(lock.rawHandle)

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int =
    PthreadAddon.pthreadSpinUnlock(lock.rawHandle)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int =
    PthreadAddon.pthreadBarrierDestroy(barrier.rawHandle)

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): Int =
    PthreadAddon.pthreadBarrierWait(barrier.rawHandle)

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int =
    PthreadAddon.pthreadBarrierattrDestroy(attr.rawHandle)

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int =
    PthreadAddon.pthreadBarrierattrInit(attr.rawHandle)

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): Int =
    PthreadAddon.pthreadMutexConsistent(mutex.rawHandle)
