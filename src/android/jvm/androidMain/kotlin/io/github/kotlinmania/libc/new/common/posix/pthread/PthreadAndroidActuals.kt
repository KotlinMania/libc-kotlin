@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewCommonPosixPthreadJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrGetinheritsched(attr: Long, inheritsched: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrGetschedpolicy(attr: Long, policy: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrSetinheritsched(attr: Long, inheritsched: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrSetschedpolicy(attr: Long, policy: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierattrGetpshared(attr: Long, shared: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadBarrierattrSetpshared(attr: Long, shared: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexConsistent(mutex: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrGetprotocol(attr: Long, protocol: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrGetrobust(attr: Long, robustness: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrSetprotocol(attr: Long, protocol: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadMutexattrSetrobust(attr: Long, robustness: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadOnce(control: Long, routine: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSetschedprio(native: Long, priority: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcNewCommonPosixPthreadPthreadSpinUnlock(lock: Long): Int
}

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAtfork(0L, 0L, 0L)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr, inheritsched: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrGetinheritsched(attr.rawAddress, inheritsched.rawAddress)

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr, policy: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrGetschedpolicy(attr.rawAddress, policy.rawAddress)

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun pthreadAttrSetinheritsched(attr: MutPtr, inheritsched: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrSetinheritsched(attr.rawAddress, inheritsched)

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr, policy: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrSetschedpolicy(attr.rawAddress, policy)

public actual fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadAttrSetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.toLong())

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierDestroy(barrier.rawAddress)

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierInit(barrier.rawAddress, attr.rawAddress, count.toInt())

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierWait(barrier.rawAddress)

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierattrDestroy(attr.rawAddress)

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierattrGetpshared(attr.rawAddress, shared.rawAddress)

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierattrInit(attr.rawAddress)

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadBarrierattrSetpshared(attr.rawAddress, shared)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCancel(thread.toLong())

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCondattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCondattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadGetcpuclockid(thread.toLong(), clkId.rawAddress)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadKill(thread.toLong(), sig)

public actual fun pthreadMutexConsistent(mutex: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexConsistent(mutex.rawAddress)

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr, protocol: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrGetprotocol(attr.rawAddress, protocol.rawAddress)

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr, robustness: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrGetrobust(attr.rawAddress, robustness.rawAddress)

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr, protocol: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrSetprotocol(attr.rawAddress, protocol)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadMutexattrSetrobust(attr: MutPtr, robustness: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadMutexattrSetrobust(attr.rawAddress, robustness)

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadRwlockattrGetpshared(attr.rawAddress, value.rawAddress)

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadRwlockattrSetpshared(attr.rawAddress, value)

public actual fun pthreadOnce(control: MutPtr, routine: PthreadAtforkPrepareCallback): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadOnce(control.rawAddress, 0L)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSetschedprio(native.toLong(), priority)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    NewCommonPosixPthreadJniBridge.libcNewCommonPosixPthreadPthreadSpinUnlock(lock.rawAddress)
