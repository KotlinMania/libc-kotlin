package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

internal object PthreadRawLibc {
    external fun pthreadCreate(thread: Long, attr: Long, startRoutine: Long, arg: Long): Int
    external fun pthreadJoin(thread: Long, retval: Long): Int
    external fun pthreadDetach(thread: Long): Int
    external fun pthreadExit(retval: Long): Long
    external fun pthreadSelf(): Long
    external fun pthreadEqual(t1: Long, t2: Long): Int
    external fun pthreadAttrInit(attr: Long): Int
    external fun pthreadAttrDestroy(attr: Long): Int
    external fun pthreadAttrSetstacksize(attr: Long, stacksize: Long): Int
    external fun pthreadAttrGetstacksize(attr: Long, stacksize: Long): Int
    external fun pthreadAttrSetdetachstate(attr: Long, detachstate: Int): Int
    external fun pthreadAttrGetdetachstate(attr: Long, detachstate: Long): Int
    external fun pthreadMutexInit(mutex: Long, attr: Long): Int
    external fun pthreadMutexDestroy(mutex: Long): Int
    external fun pthreadMutexLock(mutex: Long): Int
    external fun pthreadMutexTrylock(mutex: Long): Int
    external fun pthreadMutexUnlock(mutex: Long): Int
    external fun pthreadMutexattrInit(attr: Long): Int
    external fun pthreadMutexattrDestroy(attr: Long): Int
    external fun pthreadMutexattrSettype(attr: Long, kind: Int): Int
    external fun pthreadMutexattrGettype(attr: Long, kind: Long): Int
    external fun pthreadCondInit(cond: Long, attr: Long): Int
    external fun pthreadCondDestroy(cond: Long): Int
    external fun pthreadCondWait(cond: Long, mutex: Long): Int
    external fun pthreadCondTimedwait(cond: Long, mutex: Long, abstime: Long): Int
    external fun pthreadCondSignal(cond: Long): Int
    external fun pthreadCondBroadcast(cond: Long): Int
    external fun pthreadCondattrInit(attr: Long): Int
    external fun pthreadCondattrDestroy(attr: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Int): Int
    external fun pthreadKeyCreate(key: Long, destructor: Long): Int
    external fun pthreadKeyDelete(key: Long): Int
    external fun pthreadGetspecific(key: Long): Long?
    external fun pthreadSetspecific(key: Long, value: Long): Int
    external fun pthreadOnce(onceControl: Long, initRoutine: Long): Int
    external fun pthreadGetnameNp(thread: Long, name: Long, len: Long): Int
    external fun pthreadAttrSetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int
    external fun pthreadAttrGetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int
    external fun posixMemalign(memptr: Long, alignment: Long, size: Long): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrGetinheritsched(attr: Long, inheritsched: Long): Int
    external fun pthreadAttrGetschedparam(attr: Long, param: Long): Int
    external fun pthreadAttrGetschedpolicy(attr: Long, policy: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrSetinheritsched(attr: Long, inheritsched: Int): Int
    external fun pthreadAttrSetschedparam(attr: Long, param: Long): Int
    external fun pthreadAttrSetschedpolicy(attr: Long, policy: Int): Int
    external fun pthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadBarrierDestroy(barrier: Long): Int
    external fun pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int
    external fun pthreadBarrierWait(barrier: Long): Int
    external fun pthreadBarrierattrDestroy(attr: Long): Int
    external fun pthreadBarrierattrGetpshared(attr: Long, shared: Long): Int
    external fun pthreadBarrierattrInit(attr: Long): Int
    external fun pthreadBarrierattrSetpshared(attr: Long, shared: Int): Int
    external fun pthreadCancel(thread: Long): Int
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Int): Int
    external fun pthreadCondattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun pthreadGetcpuclockid(thread: Long, clkId: Long): Int
    external fun pthreadGetschedparam(native: Long, policy: Long, param: Long): Int
    external fun pthreadKill(thread: Long, sig: Int): Int
    external fun pthreadMutexConsistent(mutex: Long): Int
    external fun pthreadMutexTimedlock(lock: Long, abstime: Long): Int
    external fun pthreadMutexattrGetprotocol(attr: Long, protocol: Long): Int
    external fun pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadMutexattrGetrobust(attr: Long, robustness: Long): Int
    external fun pthreadMutexattrSetprotocol(attr: Long, protocol: Int): Int
    external fun pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadMutexattrSetrobust(attr: Long, robustness: Int): Int
    external fun pthreadRwlockattrGetpshared(attr: Long, value: Long): Int
    external fun pthreadRwlockattrSetpshared(attr: Long, value: Int): Int
    external fun pthreadOnce(control: Long, routine: Long): Int
    external fun pthreadSetschedparam(native: Long, policy: Int, param: Long): Int
    external fun pthreadSetschedprio(native: Long, priority: Int): Int
    external fun pthreadSigmask(how: Int, set: Long, oldset: Long): Int
    external fun pthreadSpinDestroy(lock: Long): Int
    external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    external fun pthreadSpinLock(lock: Long): Int
    external fun pthreadSpinTrylock(lock: Long): Int
    external fun pthreadSpinUnlock(lock: Long): Int
    external fun pthreadGetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int
    external fun pthreadGetattrNp(native: Long, attr: Long): Int
    external fun pthreadGetnameNp(thread: Long, name: Long, len: Long): Int
    external fun pthreadSetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int
    external fun pthreadSetnameNp(thread: Long, name: String?): Int
}

public actual fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    PthreadRawLibc.pthreadCreate(thread?.toLong() ?: 0L, attr?.toLong() ?: 0L, startRoutine, arg?.value ?: 0L)

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    PthreadRawLibc.pthreadJoin(thread, retval?.value ?: 0L)

public actual fun pthreadDetach(thread: PthreadT): CInt =
    PthreadRawLibc.pthreadDetach(thread)

public actual fun pthreadExit(retval: COpaquePointer?): Nothing =
    PthreadRawLibc.pthreadExit(retval?.value ?: 0L)

public actual fun pthreadSelf(): PthreadT =
    PthreadRawLibc.pthreadSelf()

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    PthreadRawLibc.pthreadEqual(t1, t2)

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    PthreadRawLibc.pthreadAttrInit(attr?.toLong() ?: 0L)

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    PthreadRawLibc.pthreadAttrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: SizeT): CInt =
    PthreadRawLibc.pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stacksize)

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: SizeT?): CInt =
    PthreadRawLibc.pthreadAttrGetstacksize(attr?.toLong() ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, detachstate: CInt): CInt =
    PthreadRawLibc.pthreadAttrSetdetachstate(attr?.toLong() ?: 0L, detachstate)

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt =
    PthreadRawLibc.pthreadAttrGetdetachstate(attr?.toLong() ?: 0L, detachstate?.toLong() ?: 0L)

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    PthreadRawLibc.pthreadMutexInit(mutex?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    PthreadRawLibc.pthreadMutexDestroy(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    PthreadRawLibc.pthreadMutexLock(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    PthreadRawLibc.pthreadMutexTrylock(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    PthreadRawLibc.pthreadMutexUnlock(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    PthreadRawLibc.pthreadMutexattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    PthreadRawLibc.pthreadMutexattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, kind: CInt): CInt =
    PthreadRawLibc.pthreadMutexattrSettype(attr?.toLong() ?: 0L, kind)

public actual fun pthreadMutexattrGettype(attr: PthreadMutexattrT?, kind: CInt?): CInt =
    PthreadRawLibc.pthreadMutexattrGettype(attr?.toLong() ?: 0L, kind?.toLong() ?: 0L)

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    PthreadRawLibc.pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    PthreadRawLibc.pthreadCondDestroy(cond?.toLong() ?: 0L)

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt =
    PthreadRawLibc.pthreadCondWait(cond?.toLong() ?: 0L, mutex?.toLong() ?: 0L)

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    PthreadRawLibc.pthreadCondTimedwait(cond?.toLong() ?: 0L, mutex?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    PthreadRawLibc.pthreadCondSignal(cond?.toLong() ?: 0L)

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    PthreadRawLibc.pthreadCondBroadcast(cond?.toLong() ?: 0L)

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    PthreadRawLibc.pthreadCondattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    PthreadRawLibc.pthreadCondattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    PthreadRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun pthreadKeyCreate(key: PthreadKeyT?, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    PthreadRawLibc.pthreadKeyCreate(key?.toLong() ?: 0L, destructor?.toLong() ?: 0L)

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    PthreadRawLibc.pthreadKeyDelete(key)

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    PthreadRawLibc.pthreadGetspecific(key).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    PthreadRawLibc.pthreadSetspecific(key, value?.value ?: 0L)

public actual fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    PthreadRawLibc.pthreadOnce(onceControl?.toLong() ?: 0L, initRoutine)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    PthreadRawLibc.pthreadGetnameNp(thread, name?.value ?: 0L, len)

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    PthreadRawLibc.pthreadAttrSetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    PthreadRawLibc.pthreadAttrGetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt =
    PthreadRawLibc.posixMemalign(memptr?.value ?: 0L, alignment, size)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    PthreadRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: SizeT?): CInt =
    PthreadRawLibc.pthreadAttrGetguardsize(attr?.toLong() ?: 0L, guardsize?.toLong() ?: 0L)

public actual fun pthreadAttrGetinheritsched(attr: PthreadAttrT?, inheritsched: CInt?): CInt =
    PthreadRawLibc.pthreadAttrGetinheritsched(attr?.toLong() ?: 0L, inheritsched?.toLong() ?: 0L)

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    PthreadRawLibc.pthreadAttrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrGetschedpolicy(attr: PthreadAttrT?, policy: CInt?): CInt =
    PthreadRawLibc.pthreadAttrGetschedpolicy(attr?.toLong() ?: 0L, policy?.toLong() ?: 0L)

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    PthreadRawLibc.pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: SizeT): CInt =
    PthreadRawLibc.pthreadAttrSetguardsize(attr?.toLong() ?: 0L, guardsize)

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt =
    PthreadRawLibc.pthreadAttrSetinheritsched(attr?.toLong() ?: 0L, inheritsched)

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    PthreadRawLibc.pthreadAttrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt =
    PthreadRawLibc.pthreadAttrSetschedpolicy(attr?.toLong() ?: 0L, policy)

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    PthreadRawLibc.pthreadAttrSetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    PthreadRawLibc.pthreadBarrierDestroy(barrier?.toLong() ?: 0L)

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUint): CInt =
    PthreadRawLibc.pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.toLong() ?: 0L, count)

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    PthreadRawLibc.pthreadBarrierWait(barrier?.toLong() ?: 0L)

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt =
    PthreadRawLibc.pthreadBarrierattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt =
    PthreadRawLibc.pthreadBarrierattrGetpshared(attr?.toLong() ?: 0L, shared?.toLong() ?: 0L)

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt =
    PthreadRawLibc.pthreadBarrierattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt =
    PthreadRawLibc.pthreadBarrierattrSetpshared(attr?.toLong() ?: 0L, shared)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    PthreadRawLibc.pthreadCancel(thread)

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    PthreadRawLibc.pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt =
    PthreadRawLibc.pthreadCondattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    PthreadRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt =
    PthreadRawLibc.pthreadCondattrSetpshared(attr?.toLong() ?: 0L, pshared)

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    PthreadRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    PthreadRawLibc.pthreadGetcpuclockid(thread, clkId?.toLong() ?: 0L)

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    PthreadRawLibc.pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    PthreadRawLibc.pthreadKill(thread, sig)

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    PthreadRawLibc.pthreadMutexConsistent(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    PthreadRawLibc.pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT?, protocol: CInt?): CInt =
    PthreadRawLibc.pthreadMutexattrGetprotocol(attr?.toLong() ?: 0L, protocol?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt =
    PthreadRawLibc.pthreadMutexattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robustness: CInt?): CInt =
    PthreadRawLibc.pthreadMutexattrGetrobust(attr?.toLong() ?: 0L, robustness?.toLong() ?: 0L)

public actual fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT?, protocol: CInt): CInt =
    PthreadRawLibc.pthreadMutexattrSetprotocol(attr?.toLong() ?: 0L, protocol)

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    PthreadRawLibc.pthreadMutexattrSetpshared(attr?.toLong() ?: 0L, pshared)

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt =
    PthreadRawLibc.pthreadMutexattrSetrobust(attr?.toLong() ?: 0L, robustness)

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, value: CInt?): CInt =
    PthreadRawLibc.pthreadRwlockattrGetpshared(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, value: CInt): CInt =
    PthreadRawLibc.pthreadRwlockattrSetpshared(attr?.toLong() ?: 0L, value)

public actual fun pthreadOnce(control: PthreadOnceT?, routine: PthreadAtforkPrepareCallback): CInt =
    PthreadRawLibc.pthreadOnce(control?.toLong() ?: 0L, routine)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    PthreadRawLibc.pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    PthreadRawLibc.pthreadSetschedprio(native, priority)

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    PthreadRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    PthreadRawLibc.pthreadSpinDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    PthreadRawLibc.pthreadSpinInit(lock?.toLong() ?: 0L, pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    PthreadRawLibc.pthreadSpinLock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    PthreadRawLibc.pthreadSpinTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    PthreadRawLibc.pthreadSpinUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    PthreadRawLibc.pthreadGetaffinityNp(thread, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt =
    PthreadRawLibc.pthreadGetattrNp(native, attr?.toLong() ?: 0L)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    PthreadRawLibc.pthreadGetnameNp(thread, name?.value ?: 0L, len)

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    PthreadRawLibc.pthreadSetaffinityNp(thread, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    PthreadRawLibc.pthreadSetnameNp(thread, name)
