// port-lint: source new/common/posix/pthread.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

public actual fun pthreadCancel(thread: PthreadT): Int =
    libc.cinterop.libc_pthread_cancel(thread.rawValue)

public actual fun pthreadKill(thread: PthreadT, sig: Int): Int =
    libc.cinterop.libc_pthread_kill(thread.rawValue, sig)

// Apple libc lacks pthread_setschedprio, pthread_mutex_consistent,
// pthread_spin_* and pthread_barrier_* — these are Linux/glibc-only POSIX
// extensions. Returning the target ENOSYS value keeps the surface uniform; a higher-level
// abstraction can substitute pthread_setschedparam, os_unfair_lock, dispatch
// semaphore, etc. where the semantics actually need to be reached on Apple.
public actual fun pthreadSetschedprio(native: PthreadT, priority: Int): Int = platform.posix.ENOSYS

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int = platform.posix.ENOSYS

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int = platform.posix.ENOSYS

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): Int = platform.posix.ENOSYS

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int = platform.posix.ENOSYS

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int = platform.posix.ENOSYS

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int = platform.posix.ENOSYS

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): Int = platform.posix.ENOSYS

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int = platform.posix.ENOSYS

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int = platform.posix.ENOSYS

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): Int = platform.posix.ENOSYS
