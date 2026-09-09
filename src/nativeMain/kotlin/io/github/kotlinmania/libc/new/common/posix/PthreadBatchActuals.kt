// port-lint: source Pthread.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cValue
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import libc.cinterop.libc_pthread_condattr_getclock
import libc.cinterop.libc_pthread_condattr_setclock
import libc.cinterop.libc_pthread_setschedparam
import libc.cinterop.libc_pthread_sigmask
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.ULongVar
import libc.cinterop.libc_pthread_attr_getstack

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetinheritsched(attr: PthreadAttrT, inheritsched: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetinheritsched requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetschedpolicy(attr: PthreadAttrT, policy: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt = memScoped {
    val stackaddrPtr: CPointer<ByteVar>? = stackaddr?.value?.toCPointer()
    val stackSizeVar = alloc<ULongVar>()
    val result = libc.cinterop.libc_pthread_attr_getstack(attr.rawValue, stackaddrPtr, stackSizeVar.ptr)
    return@memScoped result
}

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT, inheritsched: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetinheritsched requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT, policy: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): CInt =
    throw UnsupportedOperationException("pthreadBarrierDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT, attr: PthreadBarrierattrT, count: CUInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): CInt =
    throw UnsupportedOperationException("pthreadBarrierWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT, shared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT, shared: CInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadCancel(thread: PthreadT): CInt =
    throw UnsupportedOperationException("pthreadCancel requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt =
    memScoped {
        val clkIdPtr = alloc<IntVar>()
        val result = libc_pthread_condattr_getclock(attr.rawValue, clkIdPtr.ptr)
        if (result == 0 && clockId != null) {
            // Output parameter — caller asked for the value but Kotlin nullable Int
            // cannot be written back; the C side wrote into clkIdPtr.
        }
        result
    }

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    libc_pthread_condattr_setclock(attr.rawValue, clockId)

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc.cinterop.libc_pthread_kill(thread.toLong().toCPointer<kotlinx.cinterop.ByteVar>(), sig)

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexConsistent requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT, abstime: Timespec?): CInt =
    libc.cinterop.libc_pthread_mutex_timedlock(lock.value.toCPointer<kotlinx.cinterop.ByteVar>(), abstime?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT, protocol: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetprotocol requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT, robustness: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT, protocol: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetprotocol requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT, robustness: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    memScoped {
        val cParam = cValue<platform.posix.sched_param> {
            sched_priority = param?.schedPriority ?: 0
        }
        libc_pthread_setschedparam(native.rawValue, policy, cParam)
    }

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    throw UnsupportedOperationException("pthreadSetschedprio requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    libc_pthread_sigmask(how, set?.rawValue, oldset?.rawValue)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_destroy(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    libc.cinterop.libc_pthread_spin_init(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_lock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_trylock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    libc.cinterop.libc_pthread_spin_unlock(lock?.toLong()?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadAtfork requires manual FFI bridge — not yet implemented")

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadCreate requires manual FFI bridge — not yet implemented")

public actual fun pthreadOnce(control: PthreadOnceT?, routine: (() -> Unit)?): CInt =
    throw UnsupportedOperationException("pthreadOnce requires manual FFI bridge — not yet implemented")
