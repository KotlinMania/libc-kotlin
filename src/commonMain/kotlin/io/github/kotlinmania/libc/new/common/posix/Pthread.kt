// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.*

public fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): CInt = -1

public fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt = -1

public fun pthreadAttrGetinheritsched(attr: PthreadAttrT, inheritsched: CInt?): CInt = -1

public fun pthreadAttrGetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt = -1

public fun pthreadAttrGetschedpolicy(attr: PthreadAttrT, policy: CInt?): CInt = -1

public fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt = -1

public fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt = -1

public fun pthreadAttrSetinheritsched(attr: PthreadAttrT, inheritsched: CInt): CInt = -1

public fun pthreadAttrSetschedparam(attr: PthreadAttrT, param: SchedParam?): CInt = -1

public fun pthreadAttrSetschedpolicy(attr: PthreadAttrT, policy: CInt): CInt = -1

public fun pthreadAttrSetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong): CInt = -1

public fun pthreadBarrierDestroy(barrier: PthreadBarrierT): CInt = -1

public fun pthreadBarrierInit(barrier: PthreadBarrierT, attr: PthreadBarrierattrT, count: CUInt): CInt = -1

public fun pthreadBarrierWait(barrier: PthreadBarrierT): CInt = -1

public fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): CInt = -1

public fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT, shared: CInt?): CInt = -1

public fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): CInt = -1

public fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT, shared: CInt): CInt = -1

public fun pthreadCancel(thread: PthreadT): CInt = -1

public fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt = -1

public fun pthreadCondattrGetpshared(attr: PthreadCondattrT, pshared: CInt?): CInt = -1

public fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt = -1

public fun pthreadCondattrSetpshared(attr: PthreadCondattrT, pshared: CInt): CInt = -1

public fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): CInt = -1

public fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt = -1

public fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt = -1

public fun pthreadKill(thread: PthreadT, sig: CInt): CInt = -1

public fun pthreadMutexConsistent(mutex: PthreadMutexT): CInt = -1

public fun pthreadMutexTimedlock(lock: PthreadMutexT, abstime: Timespec?): CInt = -1

public fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT, protocol: CInt?): CInt = -1

public fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT, pshared: CInt?): CInt = -1

public fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT, robustness: CInt?): CInt = -1

public fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT, protocol: CInt): CInt = -1

public fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT, pshared: CInt): CInt = -1

public fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT, robustness: CInt): CInt = -1

public fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT, `val`: CInt?): CInt = -1

public fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT, `val`: CInt): CInt = -1

public fun pthreadOnce(control: PthreadOnceT?, routine: (() -> Unit)?): CInt = -1

public fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt = -1

public fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt = -1

public fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt = -1

public fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt = -1

public fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt = -1

public fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt = -1

public fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt = -1

public fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt = -1
