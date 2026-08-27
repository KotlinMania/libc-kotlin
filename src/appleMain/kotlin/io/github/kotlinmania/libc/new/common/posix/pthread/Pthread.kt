// port-lint: source libc/src/new/common/posix/pthread.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import kotlinx.cinterop.reinterpret

public actual fun pthreadCancel(thread: PthreadT): Int =
    platform.posix.pthread_cancel(thread.rawValue.reinterpret())

public actual fun pthreadKill(thread: PthreadT, sig: Int): Int =
    platform.posix.pthread_kill(thread.rawValue.reinterpret(), sig)

// Apple libc lacks pthread_setschedprio, pthread_mutex_consistent,
// pthread_spin_* and pthread_barrier_* — these are Linux/glibc-only POSIX
// extensions. Returning ENOSYS (38) keeps the surface uniform; a higher-level
// abstraction can substitute pthread_setschedparam, os_unfair_lock, dispatch
// semaphore, etc. where the semantics actually need to be reached on Apple.
public actual fun pthreadSetschedprio(native: PthreadT, priority: Int): Int = 38

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int = 38

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int = 38

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): Int = 38

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int = 38

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int = 38

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int = 38

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): Int = 38

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int = 38

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int = 38

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): Int = 38
