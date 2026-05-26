// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix.pthread

// MinGW posix.def does not vendor pthreads-w32; the POSIX pthread surface is
// not bound on this target. The actuals below return ENOSYS so the commonMain
// expects resolve. A higher-level abstraction can substitute Windows native
// CreateThread / SRWLOCK / CONDITION_VARIABLE where the semantics need to be
// reached.
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
