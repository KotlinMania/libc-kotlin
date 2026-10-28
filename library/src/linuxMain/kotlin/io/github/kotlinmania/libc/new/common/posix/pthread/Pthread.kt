// port-lint: source new/common/posix/pthread.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

public actual fun pthreadCancel(thread: PthreadT): Int =
    libc.cinterop.libc_pthread_cancel(thread.rawValue)

public actual fun pthreadKill(thread: PthreadT, sig: Int): Int =
    libc.cinterop.libc_pthread_kill(thread.rawValue, sig)

public actual fun pthreadSetschedprio(native: PthreadT, priority: Int): Int =
    libc.cinterop.libc_pthread_setschedprio(native.rawValue, priority)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int =
    libc.cinterop.libc_pthread_spin_destroy(lock.rawValue)

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int =
    libc.cinterop.libc_pthread_spin_init(lock.rawValue, pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): Int =
    libc.cinterop.libc_pthread_spin_lock(lock.rawValue)

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int =
    libc.cinterop.libc_pthread_spin_trylock(lock.rawValue)

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int =
    libc.cinterop.libc_pthread_spin_unlock(lock.rawValue)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int =
    libc.cinterop.libc_pthread_barrier_destroy(barrier.rawValue)

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): Int =
    libc.cinterop.libc_pthread_barrier_wait(barrier.rawValue)

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int =
    libc.cinterop.libc_pthread_barrierattr_destroy(attr.rawValue)

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int =
    libc.cinterop.libc_pthread_barrierattr_init(attr.rawValue)

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): Int =
    libc.cinterop.libc_pthread_mutex_consistent(mutex.rawValue)
