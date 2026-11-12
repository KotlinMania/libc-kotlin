// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `pthread.h`
//
// <https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/pthread.h.html>

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt

public expect fun pthreadAttrGetinheritsched(attr: ConstPtr, inheritsched: MutPtr): CInt

public expect fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt

public expect fun pthreadAttrGetschedpolicy(attr: ConstPtr, policy: MutPtr): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt

public expect fun pthreadAttrSetinheritsched(attr: MutPtr, inheritsched: CInt): CInt

public expect fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt

public expect fun pthreadAttrSetschedpolicy(attr: MutPtr, policy: CInt): CInt

public expect fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt

// Note(reorg): In recent POSIX versions, this is a signal.h function and not required
// in pthread.
public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun pthreadMutexConsistent(mutex: MutPtr): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadMutexattrGetprotocol(attr: ConstPtr, protocol: MutPtr): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadMutexattrGetrobust(attr: ConstPtr, robustness: MutPtr): CInt

public expect fun pthreadMutexattrSetprotocol(attr: MutPtr, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadMutexattrSetrobust(attr: MutPtr, robustness: CInt): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt

// Note(1.0): These shoul be combined to the version that takes an optional unchecked function.
public expect fun pthreadOnce(control: MutPtr, routine: PthreadAtforkPrepareCallback): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

// Note(reorg): In recent POSIX versions, this is a signal.h function and not required
// in pthread.
public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr): CInt

public expect fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: MutPtr): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr): CInt
