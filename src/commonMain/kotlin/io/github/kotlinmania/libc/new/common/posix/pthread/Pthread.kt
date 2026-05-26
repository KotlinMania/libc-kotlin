// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix.pthread

/**
 * Header: `pthread.h`.
 *
 * <https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/pthread.h.html>
 *
 * Every declaration is mirrored as `expect`; per-target actuals are a single
 * edge call into the platform mechanism (`platform.posix` cinterop on K/N,
 * JNI on the JVM and Android, an N-API addon on Node, a Web Workers +
 * SharedArrayBuffer shim in the browser, the wasi-threads import on WASI).
 */

/** `pthread_t` — opaque thread handle. */
public expect class PthreadT

/** `pthread_attr_t` — opaque thread attributes object. */
public expect class PthreadAttrT

/** `pthread_mutex_t` — opaque mutex. */
public expect class PthreadMutexT

/** `pthread_mutexattr_t` — opaque mutex attributes object. */
public expect class PthreadMutexattrT

/** `pthread_cond_t` — opaque condition variable. */
public expect class PthreadCondT

/** `pthread_condattr_t` — opaque condition-variable attributes object. */
public expect class PthreadCondattrT

/** `pthread_rwlock_t` — opaque reader/writer lock. */
public expect class PthreadRwlockT

/** `pthread_rwlockattr_t` — opaque rwlock attributes object. */
public expect class PthreadRwlockattrT

/** `pthread_barrier_t` — opaque barrier. */
public expect class PthreadBarrierT

/** `pthread_barrierattr_t` — opaque barrier attributes object. */
public expect class PthreadBarrierattrT

/** `pthread_spinlock_t` — opaque spinlock. */
public expect class PthreadSpinlockT

/** `pthread_once_t` — opaque "do this once" control object. */
public expect class PthreadOnceT

public expect fun pthreadCancel(thread: PthreadT): Int

public expect fun pthreadKill(thread: PthreadT, sig: Int): Int

public expect fun pthreadSetschedprio(native: PthreadT, priority: Int): Int

public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int

public expect fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int

public expect fun pthreadSpinLock(lock: PthreadSpinlockT): Int

public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int

public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int

public expect fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int

public expect fun pthreadBarrierWait(barrier: PthreadBarrierT): Int

public expect fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int

public expect fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int

public expect fun pthreadMutexConsistent(mutex: PthreadMutexT): Int
