// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix.pthread

public actual class PthreadT internal constructor(internal val rawHandle: Long)

public actual class PthreadAttrT internal constructor(internal val rawHandle: Long)

public actual class PthreadMutexT internal constructor(internal val rawHandle: Long)

public actual class PthreadMutexattrT internal constructor(internal val rawHandle: Long)

public actual class PthreadCondT internal constructor(internal val rawHandle: Long)

public actual class PthreadCondattrT internal constructor(internal val rawHandle: Long)

public actual class PthreadRwlockT internal constructor(internal val rawHandle: Long)

public actual class PthreadRwlockattrT internal constructor(internal val rawHandle: Long)

public actual class PthreadBarrierT internal constructor(internal val rawHandle: Long)

public actual class PthreadBarrierattrT internal constructor(internal val rawHandle: Long)

public actual class PthreadSpinlockT internal constructor(internal val rawHandle: Long)

public actual class PthreadOnceT internal constructor(internal val rawHandle: Long)

private object PthreadNative {
    init {
        // Loaded lazily; the JNI shim is published alongside the libc-kotlin
        // artifact and must be on java.library.path. The compiler does not
        // require it to be present, but invoking any of the externals does.
        System.loadLibrary("libc_kotlin_pthread")
    }

    @JvmStatic external fun pthreadCancel(thread: Long): Int
    @JvmStatic external fun pthreadKill(thread: Long, sig: Int): Int
    @JvmStatic external fun pthreadSetschedprio(thread: Long, priority: Int): Int
    @JvmStatic external fun pthreadSpinDestroy(lock: Long): Int
    @JvmStatic external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    @JvmStatic external fun pthreadSpinLock(lock: Long): Int
    @JvmStatic external fun pthreadSpinTrylock(lock: Long): Int
    @JvmStatic external fun pthreadSpinUnlock(lock: Long): Int
    @JvmStatic external fun pthreadBarrierDestroy(barrier: Long): Int
    @JvmStatic external fun pthreadBarrierWait(barrier: Long): Int
    @JvmStatic external fun pthreadBarrierattrDestroy(attr: Long): Int
    @JvmStatic external fun pthreadBarrierattrInit(attr: Long): Int
    @JvmStatic external fun pthreadMutexConsistent(mutex: Long): Int
}

public actual fun pthreadCancel(thread: PthreadT): Int =
    PthreadNative.pthreadCancel(thread.rawHandle)

public actual fun pthreadKill(thread: PthreadT, sig: Int): Int =
    PthreadNative.pthreadKill(thread.rawHandle, sig)

public actual fun pthreadSetschedprio(native: PthreadT, priority: Int): Int =
    PthreadNative.pthreadSetschedprio(native.rawHandle, priority)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int =
    PthreadNative.pthreadSpinDestroy(lock.rawHandle)

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int =
    PthreadNative.pthreadSpinInit(lock.rawHandle, pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): Int =
    PthreadNative.pthreadSpinLock(lock.rawHandle)

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int =
    PthreadNative.pthreadSpinTrylock(lock.rawHandle)

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int =
    PthreadNative.pthreadSpinUnlock(lock.rawHandle)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int =
    PthreadNative.pthreadBarrierDestroy(barrier.rawHandle)

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): Int =
    PthreadNative.pthreadBarrierWait(barrier.rawHandle)

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int =
    PthreadNative.pthreadBarrierattrDestroy(attr.rawHandle)

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int =
    PthreadNative.pthreadBarrierattrInit(attr.rawHandle)

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): Int =
    PthreadNative.pthreadMutexConsistent(mutex.rawHandle)
