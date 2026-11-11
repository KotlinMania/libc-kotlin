@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAtfork
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAttrGetguardsize
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAttrGetinheritsched
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAttrGetschedparam
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAttrGetschedpolicy
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAttrGetstack
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAttrSetguardsize
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAttrSetinheritsched
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAttrSetschedparam
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAttrSetschedpolicy
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadAttrSetstack
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadBarrierDestroy
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadBarrierInit
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadBarrierWait
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadBarrierattrDestroy
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadBarrierattrGetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadBarrierattrInit
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadBarrierattrSetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadCancel
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadCondattrGetclock
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadCondattrGetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadCondattrSetclock
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadCondattrSetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadCreate
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadGetcpuclockid
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadGetschedparam
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadKill
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadMutexConsistent
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadMutexTimedlock
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadMutexattrGetprotocol
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadMutexattrGetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadMutexattrGetrobust
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadMutexattrSetprotocol
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadMutexattrSetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadMutexattrSetrobust
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadOnce
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadRwlockattrGetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadRwlockattrSetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadSetschedparam
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadSetschedprio
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadSigmask
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadSpinDestroy
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadSpinInit
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadSpinLock
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadSpinTrylock
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libc_new_common_posix_pthread_pthreadSpinUnlock
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libc_new_common_posix_pthread_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadAttrGetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadAttrGetinheritsched(attr?.value?.toCPointer<ByteVar>(), inheritsched?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadAttrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadAttrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    libc_new_common_posix_pthread_pthreadAttrSetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    libc_new_common_posix_pthread_pthreadAttrSetinheritsched(attr?.value?.toCPointer<ByteVar>(), inheritsched)

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadAttrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    libc_new_common_posix_pthread_pthreadAttrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy)

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    libc_new_common_posix_pthread_pthreadAttrSetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadBarrierDestroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    libc_new_common_posix_pthread_pthreadBarrierInit(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadBarrierWait(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadBarrierattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadBarrierattrGetpshared(attr?.value?.toCPointer<ByteVar>(), shared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadBarrierattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    libc_new_common_posix_pthread_pthreadBarrierattrSetpshared(attr?.value?.toCPointer<ByteVar>(), shared)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libc_new_common_posix_pthread_pthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadCondattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    libc_new_common_posix_pthread_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    libc_new_common_posix_pthread_pthreadCondattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadCreate(native?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadGetcpuclockid(thread.toLong().toCPointer<ByteVar>(), clkId?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libc_new_common_posix_pthread_pthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadMutexConsistent(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadMutexTimedlock(lock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadMutexattrGetprotocol(attr?.value?.toCPointer<ByteVar>(), protocol?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadMutexattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robustness: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadMutexattrGetrobust(attr?.value?.toCPointer<ByteVar>(), robustness?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    libc_new_common_posix_pthread_pthreadMutexattrSetprotocol(attr?.value?.toCPointer<ByteVar>(), protocol)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    libc_new_common_posix_pthread_pthreadMutexattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    libc_new_common_posix_pthread_pthreadMutexattrSetrobust(attr?.value?.toCPointer<ByteVar>(), robustness)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadRwlockattrGetpshared(attr?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    libc_new_common_posix_pthread_pthreadRwlockattrSetpshared(attr?.value?.toCPointer<ByteVar>(), value)

public actual fun pthreadOnce(control: COpaquePointer?, routine: PthreadAtforkPrepareCallback): CInt =
    libc_new_common_posix_pthread_pthreadOnce(control?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    libc_new_common_posix_pthread_pthreadSetschedprio(native.toLong().toCPointer<ByteVar>(), priority)

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oldset?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    libc_new_common_posix_pthread_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    libc_new_common_posix_pthread_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())
