// port-lint: source new/common/posix/pthread.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.convert
import kotlinx.cinterop.invoke
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toLong
import platform.posix.RTLD_DEFAULT
import platform.posix.dlsym

// Android NDK (bionic) — see ANDROID.md in the workspace for the surface
// classification driving the choices below.
//
// Bucket 1 (direct platform.posix delegation): pthread_kill.
// Bucket 2 (in bionic above K/N's min API ceiling, resolved via dlsym):
//   pthread_setschedprio    (API 28+)
//   pthread_barrier_init    (API 24+)
//   pthread_barrier_destroy (API 24+)
//   pthread_barrier_wait    (API 24+)
//   pthread_barrierattr_*   (API 24+)
// Bucket 3 (bionic intentionally lacks it): pthread_cancel,
//   pthread_spin_*, pthread_mutex_consistent — return ENOSYS.

private val pthreadSetschedprioP: CPointer<CFunction<(Long, Int) -> Int>>? =
    dlsym(RTLD_DEFAULT, "pthread_setschedprio")?.reinterpret()

private val pthreadBarrierDestroyP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(RTLD_DEFAULT, "pthread_barrier_destroy")?.reinterpret()

private val pthreadBarrierWaitP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(RTLD_DEFAULT, "pthread_barrier_wait")?.reinterpret()

private val pthreadBarrierattrDestroyP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(RTLD_DEFAULT, "pthread_barrierattr_destroy")?.reinterpret()

private val pthreadBarrierattrInitP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(RTLD_DEFAULT, "pthread_barrierattr_init")?.reinterpret()

public actual fun pthreadCancel(thread: PthreadT): Int = 38

public actual fun pthreadKill(thread: PthreadT, sig: Int): Int =
    platform.posix.pthread_kill(thread.rawValue.toLong().convert(), sig)

public actual fun pthreadSetschedprio(native: PthreadT, priority: Int): Int =
    pthreadSetschedprioP?.invoke(native.rawValue.toLong(), priority) ?: 38

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int = 38
public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int = 38
public actual fun pthreadSpinLock(lock: PthreadSpinlockT): Int = 38
public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int = 38
public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int = 38

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int =
    pthreadBarrierDestroyP?.invoke(barrier.rawValue) ?: 38

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): Int =
    pthreadBarrierWaitP?.invoke(barrier.rawValue) ?: 38

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int =
    pthreadBarrierattrDestroyP?.invoke(attr.rawValue) ?: 38

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int =
    pthreadBarrierattrInitP?.invoke(attr.rawValue) ?: 38

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): Int = 38
