@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAtfork
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAttrGetguardsize
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAttrGetinheritsched
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAttrGetschedparam
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAttrGetschedpolicy
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAttrGetstack
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAttrSetguardsize
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAttrSetinheritsched
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAttrSetschedparam
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAttrSetschedpolicy
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadAttrSetstack
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadBarrierDestroy
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadBarrierInit
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadBarrierWait
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadBarrierattrDestroy
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadBarrierattrGetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadBarrierattrInit
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadBarrierattrSetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadCancel
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadCondattrGetclock
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadCondattrGetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadCondattrSetclock
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadCondattrSetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadCreate
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadGetcpuclockid
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadGetschedparam
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadKill
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadMutexConsistent
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadMutexTimedlock
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadMutexattrGetprotocol
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadMutexattrGetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadMutexattrGetrobust
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadMutexattrSetprotocol
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadMutexattrSetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadMutexattrSetrobust
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadOnce
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadRwlockattrGetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadRwlockattrSetpshared
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadSetschedparam
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadSetschedprio
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadSigmask
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadSpinDestroy
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadSpinInit
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadSpinLock
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadSpinTrylock
import io.github.kotlinmania.libc.new.common.posix.pthread.cinterop.libcNewCommonPosixPthreadPthreadSpinUnlock
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    libcNewCommonPosixPthreadPthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadAttrGetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr, inheritsched: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadAttrGetinheritsched(attr.rawAddress.toCPointer<ByteVar>(), inheritsched.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadAttrGetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr, policy: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadAttrGetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadAttrGetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    libcNewCommonPosixPthreadPthreadAttrSetguardsize(attr.rawAddress.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrSetinheritsched(attr: MutPtr, inheritsched: CInt): CInt =
    libcNewCommonPosixPthreadPthreadAttrSetinheritsched(attr.rawAddress.toCPointer<ByteVar>(), inheritsched)

public actual fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    libcNewCommonPosixPthreadPthreadAttrSetschedparam(attr.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr, policy: CInt): CInt =
    libcNewCommonPosixPthreadPthreadAttrSetschedpolicy(attr.rawAddress.toCPointer<ByteVar>(), policy)

public actual fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt =
    libcNewCommonPosixPthreadPthreadAttrSetstack(attr.rawAddress.toCPointer<ByteVar>(), stackaddr.rawAddress.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadBarrierDestroy(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    libcNewCommonPosixPthreadPthreadBarrierInit(barrier.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadBarrierWait(barrier.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadBarrierattrDestroy(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadBarrierattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadBarrierattrInit(attr.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt =
    libcNewCommonPosixPthreadPthreadBarrierattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), shared)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    libcNewCommonPosixPthreadPthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadCondattrGetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadCondattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    libcNewCommonPosixPthreadPthreadCondattrSetclock(attr.rawAddress.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    libcNewCommonPosixPthreadPthreadCondattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadCreate(native.rawAddress.toCPointer<ByteVar>(), attr.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadGetcpuclockid(thread.toLong().toCPointer<ByteVar>(), clkId.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadGetschedparam(native.toLong().toCPointer<ByteVar>(), policy.rawAddress.toCPointer<ByteVar>(), param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    libcNewCommonPosixPthreadPthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun pthreadMutexConsistent(mutex: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadMutexConsistent(mutex.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    libcNewCommonPosixPthreadPthreadMutexTimedlock(lock.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr, protocol: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadMutexattrGetprotocol(attr.rawAddress.toCPointer<ByteVar>(), protocol.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadMutexattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr, robustness: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadMutexattrGetrobust(attr.rawAddress.toCPointer<ByteVar>(), robustness.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr, protocol: CInt): CInt =
    libcNewCommonPosixPthreadPthreadMutexattrSetprotocol(attr.rawAddress.toCPointer<ByteVar>(), protocol)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    libcNewCommonPosixPthreadPthreadMutexattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexattrSetrobust(attr: MutPtr, robustness: CInt): CInt =
    libcNewCommonPosixPthreadPthreadMutexattrSetrobust(attr.rawAddress.toCPointer<ByteVar>(), robustness)

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadRwlockattrGetpshared(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    libcNewCommonPosixPthreadPthreadRwlockattrSetpshared(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pthreadOnce(control: MutPtr, routine: PthreadAtforkPrepareCallback): CInt =
    libcNewCommonPosixPthreadPthreadOnce(control.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    libcNewCommonPosixPthreadPthreadSetschedparam(native.toLong().toCPointer<ByteVar>(), policy, param.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    libcNewCommonPosixPthreadPthreadSetschedprio(native.toLong().toCPointer<ByteVar>(), priority)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadSigmask(how, set.rawAddress.toCPointer<ByteVar>(), oldset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadSpinDestroy(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    libcNewCommonPosixPthreadPthreadSpinInit(lock.rawAddress.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadSpinLock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadSpinTrylock(lock.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    libcNewCommonPosixPthreadPthreadSpinUnlock(lock.rawAddress.toCPointer<ByteVar>())
