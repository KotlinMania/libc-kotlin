// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.*

public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt

public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt

public expect fun pthreadAttrGetinheritsched(attr: PthreadAttrT?, inheritsched: CInt?): CInt

public expect fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt

public expect fun pthreadAttrGetschedpolicy(attr: PthreadAttrT?, policy: CInt?): CInt

public expect fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt

public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt

public expect fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt

public expect fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt

public expect fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt

public expect fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong): CInt

public expect fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt

public expect fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUInt): CInt

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

public expect fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt

public expect fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt

public expect fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT?, protocol: CInt?): CInt

public expect fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt

public expect fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robustness: CInt?): CInt

public expect fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT?, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt

public expect fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt

public expect fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, `val`: CInt?): CInt

public expect fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, `val`: CInt): CInt

public expect fun pthreadOnce(control: PthreadOnceT?, routine: (() -> Unit)?): CInt


public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt

public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt

public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt
