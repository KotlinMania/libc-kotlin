// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.ClockidT
import io.github.kotlinmania.libc.PthreadAttrT
import io.github.kotlinmania.libc.PthreadBarrierT
import io.github.kotlinmania.libc.PthreadBarrierattrT
import io.github.kotlinmania.libc.PthreadCondattrT
import io.github.kotlinmania.libc.PthreadMutexT
import io.github.kotlinmania.libc.PthreadMutexattrT
import io.github.kotlinmania.libc.PthreadOnceT
import io.github.kotlinmania.libc.PthreadRwlockattrT
import io.github.kotlinmania.libc.PthreadSpinlockT
import io.github.kotlinmania.libc.PthreadT
import io.github.kotlinmania.libc.SchedParam
import io.github.kotlinmania.libc.SigsetT
import io.github.kotlinmania.libc.Timespec

// Header: `pthread.h`
//
// <https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/pthread.h.html>

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: SizeT?): CInt

public expect fun pthreadAttrGetinheritsched(attr: PthreadAttrT?, inheritsched: CInt?): CInt

public expect fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt

public expect fun pthreadAttrGetschedpolicy(attr: PthreadAttrT?, policy: CInt?): CInt

public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt

public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: SizeT): CInt

public expect fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt

public expect fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt

public expect fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt

public expect fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt

public expect fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt

public expect fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUint): CInt

public expect fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt

public expect fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt

public expect fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt

public expect fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt

public expect fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt

public expect fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt

public expect fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt

// Note(reorg): In recent POSIX versions, this is a signal.h function and not required
// in pthread.
public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt

public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT?, protocol: CInt?): CInt

public expect fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt

public expect fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robustness: CInt?): CInt

public expect fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT?, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt

public expect fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt

public expect fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, value: CInt?): CInt

public expect fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, value: CInt): CInt

// Note(1.0): These shoul be combined to the version that takes an optional unchecked function.
public expect fun pthreadOnce(control: PthreadOnceT?, routine: PthreadAtforkPrepareCallback): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

// Note(reorg): In recent POSIX versions, this is a signal.h function and not required
// in pthread.
public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt
