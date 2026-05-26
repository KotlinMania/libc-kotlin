// port-lint: source new/common/posix/pthread.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toLong

public actual fun pthreadCancel(thread: PthreadT): Int =
    platform.posix.pthread_cancel(thread.rawValue.toLong().toULong())

public actual fun pthreadKill(thread: PthreadT, sig: Int): Int =
    platform.posix.pthread_kill(thread.rawValue.toLong().toULong(), sig)

// pthread_setschedprio is not exposed by mingw-w64's winpthreads pthread.h.
public actual fun pthreadSetschedprio(native: PthreadT, priority: Int): Int = 38

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int =
    platform.posix.pthread_spin_destroy(lock.rawValue.reinterpret())

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int =
    platform.posix.pthread_spin_init(lock.rawValue.reinterpret(), pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): Int =
    platform.posix.pthread_spin_lock(lock.rawValue.reinterpret())

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int =
    platform.posix.pthread_spin_trylock(lock.rawValue.reinterpret())

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int =
    platform.posix.pthread_spin_unlock(lock.rawValue.reinterpret())

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int =
    platform.posix.pthread_barrier_destroy(barrier.rawValue.reinterpret())

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): Int =
    platform.posix.pthread_barrier_wait(barrier.rawValue.reinterpret())

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int =
    platform.posix.pthread_barrierattr_destroy(attr.rawValue.reinterpret())

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int =
    platform.posix.pthread_barrierattr_init(attr.rawValue.reinterpret())

// pthread_mutex_consistent is not exposed by mingw-w64's winpthreads pthread.h.
public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): Int = 38
