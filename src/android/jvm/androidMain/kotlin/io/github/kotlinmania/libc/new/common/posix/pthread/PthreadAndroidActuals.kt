@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT

private object NewCommonPosixPthreadJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAttrGetinheritsched(attr: Long, inheritsched: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAttrGetschedpolicy(attr: Long, policy: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAttrSetinheritsched(attr: Long, inheritsched: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAttrSetschedpolicy(attr: Long, policy: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadBarrierattrGetpshared(attr: Long, shared: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadBarrierattrSetpshared(attr: Long, shared: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadMutexConsistent(mutex: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadMutexattrGetprotocol(attr: Long, protocol: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadMutexattrGetrobust(attr: Long, robustness: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadMutexattrSetprotocol(attr: Long, protocol: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadMutexattrSetrobust(attr: Long, robustness: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadOnce(control: Long, routine: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadSetschedprio(native: Long, priority: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_new_common_posix_pthread_pthreadSpinUnlock(lock: Long): Int
}

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAtfork(0L, 0L, 0L)

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAttrGetguardsize((attr?.value ?: 0L), (guardsize?.value ?: 0L))

public actual fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAttrGetinheritsched((attr?.value ?: 0L), (inheritsched?.value ?: 0L))

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAttrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAttrGetschedpolicy((attr?.value ?: 0L), (policy?.value ?: 0L))

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAttrSetguardsize((attr?.value ?: 0L), guardsize.toLong())

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAttrSetinheritsched((attr?.value ?: 0L), inheritsched)

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAttrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAttrSetschedpolicy((attr?.value ?: 0L), policy)

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadAttrSetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), stacksize.toLong())

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadBarrierDestroy((barrier?.value ?: 0L))

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadBarrierInit((barrier?.value ?: 0L), (attr?.value ?: 0L), count.toInt())

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadBarrierWait((barrier?.value ?: 0L))

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadBarrierattrDestroy((attr?.value ?: 0L))

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadBarrierattrGetpshared((attr?.value ?: 0L), (shared?.value ?: 0L))

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadBarrierattrInit((attr?.value ?: 0L))

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadBarrierattrSetpshared((attr?.value ?: 0L), shared)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadCancel(thread.toLong())

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadCondattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadCondattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadGetcpuclockid(thread.toLong(), (clkId?.value ?: 0L))

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadGetschedparam(native.toLong(), (policy?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadKill(thread.toLong(), sig)

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadMutexConsistent((mutex?.value ?: 0L))

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadMutexTimedlock((lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadMutexattrGetprotocol((attr?.value ?: 0L), (protocol?.value ?: 0L))

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadMutexattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robustness: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadMutexattrGetrobust((attr?.value ?: 0L), (robustness?.value ?: 0L))

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadMutexattrSetprotocol((attr?.value ?: 0L), protocol)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadMutexattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadMutexattrSetrobust((attr?.value ?: 0L), robustness)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadRwlockattrGetpshared((attr?.value ?: 0L), (value?.value ?: 0L))

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadRwlockattrSetpshared((attr?.value ?: 0L), value)

public actual fun pthreadOnce(control: COpaquePointer?, routine: PthreadAtforkPrepareCallback): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadOnce((control?.value ?: 0L), 0L)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadSetschedparam(native.toLong(), policy, (param?.value ?: 0L))

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadSetschedprio(native.toLong(), priority)

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadSigmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadSpinDestroy((lock?.value ?: 0L))

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadSpinInit((lock?.value ?: 0L), pshared)

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadSpinLock((lock?.value ?: 0L))

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadSpinTrylock((lock?.value ?: 0L))

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    NewCommonPosixPthreadJniBridge.libc_new_common_posix_pthread_pthreadSpinUnlock((lock?.value ?: 0L))
