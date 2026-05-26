// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix.pthread

// Android NDK (bionic) does not implement pthread_cancel, pthread_setschedprio,
// pthread_mutex_consistent, pthread_spin_*, or pthread_barrier_*. pthread_kill
// is also a special case on bionic (signal-thread routing). The actuals below
// return ENOSYS (38) so the commonMain expects resolve; a higher-level
// abstraction can substitute Android-specific equivalents.
public actual fun pthreadCancel(thread: PthreadT): Int = 38
public actual fun pthreadKill(thread: PthreadT, sig: Int): Int = 38
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
