package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.COpaquePointer

public actual fun pthreadCreate(thread: PthreadT?, attr: PthreadAttrT?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(thread?.toLong() ?: 0L, attr?.toLong() ?: 0L, startRoutine, arg?.value ?: 0L)") as CInt

public actual fun pthreadJoin(thread: PthreadT, retval: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadJoin(thread, retval?.value ?: 0L)") as CInt

public actual fun pthreadDetach(thread: PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadDetach(thread)") as CInt

public actual fun pthreadExit(retval: COpaquePointer?): Nothing =
    js("require('@kotlinmania/libc-native-bindings').pthreadExit(retval?.value ?: 0L)") as Nothing

public actual fun pthreadSelf(): PthreadT =
    js("require('@kotlinmania/libc-native-bindings').pthreadSelf()") as PthreadT

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadEqual(t1, t2)") as CInt

public actual fun pthreadAttrInit(attr: PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrDestroy(attr: PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetstacksize(attr: PthreadAttrT?, stacksize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstacksize(attr?.toLong() ?: 0L, stacksize)") as CInt

public actual fun pthreadAttrGetstacksize(attr: PthreadAttrT?, stacksize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstacksize(attr?.toLong() ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetdetachstate(attr: PthreadAttrT?, detachstate: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetdetachstate(attr?.toLong() ?: 0L, detachstate)") as CInt

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetdetachstate(attr?.toLong() ?: 0L, detachstate?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexInit(mutex: PthreadMutexT?, attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexInit(mutex?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexDestroy(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexDestroy(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexLock(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexLock(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTrylock(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTrylock(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexUnlock(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexUnlock(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrInit(attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrDestroy(attr: PthreadMutexattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSettype(attr: PthreadMutexattrT?, kind: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSettype(attr?.toLong() ?: 0L, kind)") as CInt

public actual fun pthreadMutexattrGettype(attr: PthreadMutexattrT?, kind: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGettype(attr?.toLong() ?: 0L, kind?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondInit(cond?.toLong() ?: 0L, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondDestroy(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondDestroy(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondWait(cond: PthreadCondT?, mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondWait(cond?.toLong() ?: 0L, mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondTimedwait(cond: PthreadCondT?, mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondTimedwait(cond?.toLong() ?: 0L, mutex?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondSignal(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondSignal(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondBroadcast(cond: PthreadCondT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondBroadcast(cond?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrInit(attr: PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrDestroy(attr: PthreadCondattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as CInt

public actual fun pthreadKeyCreate(key: PthreadKeyT?, destructor: PthreadKeyCreateDestructorCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKeyCreate(key?.toLong() ?: 0L, destructor?.toLong() ?: 0L)") as CInt

public actual fun pthreadKeyDelete(key: PthreadKeyT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKeyDelete(key)") as CInt

public actual fun pthreadGetspecific(key: PthreadKeyT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetspecific(key)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadSetspecific(key: PthreadKeyT, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetspecific(key, value?.value ?: 0L)") as CInt

public actual fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: PthreadOnceInitRoutineCallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadOnce(onceControl?.toLong() ?: 0L, initRoutine)") as CInt

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetnameNp(thread, name?.value ?: 0L, len)") as CInt

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT?, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetaffinityNp(attr?.toLong() ?: 0L, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun posixMemalign(memptr: COpaquePointer?, alignment: SizeT, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMemalign(memptr?.value ?: 0L, alignment, size)") as CInt

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetguardsize(attr?.toLong() ?: 0L, guardsize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetinheritsched(attr: PthreadAttrT?, inheritsched: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetinheritsched(attr?.toLong() ?: 0L, inheritsched?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetschedpolicy(attr: PthreadAttrT?, policy: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetschedpolicy(attr?.toLong() ?: 0L, policy?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetguardsize(attr?.toLong() ?: 0L, guardsize)") as CInt

public actual fun pthreadAttrSetinheritsched(attr: PthreadAttrT?, inheritsched: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetinheritsched(attr?.toLong() ?: 0L, inheritsched)") as CInt

public actual fun pthreadAttrSetschedparam(attr: PthreadAttrT?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetschedpolicy(attr: PthreadAttrT?, policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetschedpolicy(attr?.toLong() ?: 0L, policy)") as CInt

public actual fun pthreadAttrSetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize)") as CInt

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierDestroy(barrier?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.toLong() ?: 0L, count)") as CInt

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierWait(barrier?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrGetpshared(attr?.toLong() ?: 0L, shared?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrSetpshared(attr?.toLong() ?: 0L, shared)") as CInt

public actual fun pthreadCancel(thread: PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCancel(thread)") as CInt

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as CInt

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetpshared(attr?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadCreate(native: PthreadT?, attr: PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetcpuclockid(thread, clkId?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKill(thread, sig)") as CInt

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexConsistent(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetprotocol(attr: PthreadMutexattrT?, protocol: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetprotocol(attr?.toLong() ?: 0L, protocol?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robustness: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetrobust(attr?.toLong() ?: 0L, robustness?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSetprotocol(attr: PthreadMutexattrT?, protocol: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetprotocol(attr?.toLong() ?: 0L, protocol)") as CInt

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetpshared(attr?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robustness: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetrobust(attr?.toLong() ?: 0L, robustness)") as CInt

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT?, value: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrGetpshared(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT?, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrSetpshared(attr?.toLong() ?: 0L, value)") as CInt

public actual fun pthreadOnce(control: PthreadOnceT?, routine: PthreadAtforkPrepareCallback): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadOnce(control?.toLong() ?: 0L, routine)") as CInt

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedprio(native, priority)") as CInt

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinInit(lock?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinLock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinTrylock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetaffinityNp(thread, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetattrNp(native, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetnameNp(thread, name?.value ?: 0L, len)") as CInt

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetaffinityNp(thread, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetnameNp(thread, name)") as CInt
