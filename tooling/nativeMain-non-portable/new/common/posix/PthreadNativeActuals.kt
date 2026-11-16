@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libc.cinterop.libc_pthread_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: SizeT?): CInt =
    libc.cinterop.libc_pthread_pthread_attr_getguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetinheritsched(attr: PthreadAttrT?, inheritsched: CInt?): CInt =
    libc.cinterop.libc_pthread_pthread_attr_getinheritsched(attr?.value?.toCPointer<ByteVar>(), inheritsched?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    libc.cinterop.libc_pthread_pthread_attr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedpolicy(attr: PthreadAttrT?, policy: CInt?): CInt =
    libc.cinterop.libc_pthread_pthread_attr_getschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    libc.cinterop.libc_pthread_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: SizeT): CInt =
    libc.cinterop.libc_pthread_pthread_attr_setguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_attr_setinheritsched(attr?.value?.toCPointer<ByteVar>(), inheritsched)

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    libc.cinterop.libc_pthread_pthread_attr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_attr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy)

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    libc.cinterop.libc_pthread_pthread_attr_setstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    libc.cinterop.libc_pthread_pthread_barrier_destroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUint): CInt =
    libc.cinterop.libc_pthread_pthread_barrier_init(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    libc.cinterop.libc_pthread_pthread_barrier_wait(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt =
    libc.cinterop.libc_pthread_pthread_barrierattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt =
    libc.cinterop.libc_pthread_pthread_barrierattr_getpshared(attr?.value?.toCPointer<ByteVar>(), shared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt =
    libc.cinterop.libc_pthread_pthread_barrierattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_barrierattr_setpshared(attr?.value?.toCPointer<ByteVar>(), shared)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libc.cinterop.libc_pthread_pthread_cancel(thread.toInt())

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    libc.cinterop.libc_pthread_pthread_condattr_getclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt =
    libc.cinterop.libc_pthread_pthread_condattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    libc.cinterop.libc_pthread_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_condattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc.cinterop.libc_pthread_pthread_create(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), f.toInt(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    libc.cinterop.libc_pthread_pthread_getcpuclockid(thread.toInt(), clkId?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    libc.cinterop.libc_pthread_pthread_getschedparam(native.toInt(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_kill(thread.toInt(), sig)

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    libc.cinterop.libc_pthread_pthread_mutex_consistent(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    libc.cinterop.libc_pthread_pthread_mutex_timedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT?, protocol: CInt?): CInt =
    libc.cinterop.libc_pthread_pthread_mutexattr_getprotocol(attr?.value?.toCPointer<ByteVar>(), protocol?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt =
    libc.cinterop.libc_pthread_pthread_mutexattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robustness: CInt?): CInt =
    libc.cinterop.libc_pthread_pthread_mutexattr_getrobust(attr?.value?.toCPointer<ByteVar>(), robustness?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT?, protocol: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_mutexattr_setprotocol(attr?.value?.toCPointer<ByteVar>(), protocol)

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_mutexattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_mutexattr_setrobust(attr?.value?.toCPointer<ByteVar>(), robustness)

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, value: CInt?): CInt =
    libc.cinterop.libc_pthread_pthread_rwlockattr_getpshared(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, value: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_rwlockattr_setpshared(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun pthreadOnce(control: PthreadOnceT?, routine: PthreadAtforkPrepareCallback): CInt =
    libc.cinterop.libc_pthread_pthread_once(control?.value?.toCPointer<ByteVar>(), routine.toInt())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    libc.cinterop.libc_pthread_pthread_setschedparam(native.toInt(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_setschedprio(native.toInt(), priority)

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    libc.cinterop.libc_pthread_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_pthread_spin_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    libc.cinterop.libc_pthread_pthread_spin_init(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_pthread_spin_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_pthread_spin_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_pthread_spin_unlock(lock?.value?.toCPointer<ByteVar>())
