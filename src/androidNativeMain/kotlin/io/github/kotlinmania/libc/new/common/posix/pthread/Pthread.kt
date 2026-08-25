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
import platform.posix.dlsym

// Empirically verified against API 35 arm64-v8a emulator's libc.so
// (docs/bionic-libc-pthread-api35-arm64.txt). The bucket classification
// from ANDROID.md is updated based on real exported symbols:
//
// Bucket 1 (direct platform.posix delegation): pthread_kill.
// Bucket 2 (in bionic but not in K/N's posix.def — resolved via dlsym):
//   pthread_setschedprio    LIBC_P (API 28+)
//   pthread_spin_*          LIBC_N (API 24+)   — was wrongly Bucket 3
//   pthread_barrier_*       LIBC_N (API 24+)
//   pthread_barrierattr_*   LIBC_N (API 24+)
// Bucket 3 (genuinely absent from bionic libc.so on every API level):
//   pthread_cancel          — Android removed it as unsafe
//   pthread_mutex_consistent — bionic has no robust mutexes

private val pthreadSetschedprioP: CPointer<CFunction<(Long, Int) -> Int>>? =
    dlsym(null, "pthread_setschedprio")?.reinterpret()

private val pthreadSpinDestroyP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_spin_destroy")?.reinterpret()

private val pthreadSpinInitP: CPointer<CFunction<(COpaquePointer, Int) -> Int>>? =
    dlsym(null, "pthread_spin_init")?.reinterpret()

private val pthreadSpinLockP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_spin_lock")?.reinterpret()

private val pthreadSpinTrylockP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_spin_trylock")?.reinterpret()

private val pthreadSpinUnlockP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_spin_unlock")?.reinterpret()

private val pthreadBarrierDestroyP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_barrier_destroy")?.reinterpret()

private val pthreadBarrierWaitP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_barrier_wait")?.reinterpret()

private val pthreadBarrierattrDestroyP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_barrierattr_destroy")?.reinterpret()

private val pthreadBarrierattrInitP: CPointer<CFunction<(COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_barrierattr_init")?.reinterpret()

public actual fun pthreadCancel(thread: PthreadT): Int = 38

public actual fun pthreadKill(thread: PthreadT, sig: Int): Int =
    platform.posix.pthread_kill(thread.rawValue.toLong().convert(), sig)

public actual fun pthreadSetschedprio(native: PthreadT, priority: Int): Int =
    pthreadSetschedprioP?.invoke(native.rawValue.toLong(), priority) ?: 38

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int =
    pthreadSpinDestroyP?.invoke(lock.rawValue) ?: 38

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int =
    pthreadSpinInitP?.invoke(lock.rawValue, pshared) ?: 38

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): Int =
    pthreadSpinLockP?.invoke(lock.rawValue) ?: 38

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int =
    pthreadSpinTrylockP?.invoke(lock.rawValue) ?: 38

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int =
    pthreadSpinUnlockP?.invoke(lock.rawValue) ?: 38

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int =
    pthreadBarrierDestroyP?.invoke(barrier.rawValue) ?: 38

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): Int =
    pthreadBarrierWaitP?.invoke(barrier.rawValue) ?: 38

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int =
    pthreadBarrierattrDestroyP?.invoke(attr.rawValue) ?: 38

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int =
    pthreadBarrierattrInitP?.invoke(attr.rawValue) ?: 38

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): Int = 38
