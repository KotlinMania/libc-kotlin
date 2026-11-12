// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.apple.libpthread.pthread.sched.SchedParam
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadCondattrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexattrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadOnceT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadRwlockattrT
import io.github.kotlinmania.libc.new.qurt.ClockidT
import io.github.kotlinmania.libc.new.qurt.PthreadBarrierT
import io.github.kotlinmania.libc.new.qurt.PthreadBarrierattrT
import io.github.kotlinmania.libc.new.qurt.PthreadSpinlockT
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// Header: `pthread.h`
//
// <https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/pthread.h.html>

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrGetinheritsched(attr: ConstPtr<PthreadAttrT>, inheritsched: MutPtr<CInt>): CInt

public expect fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt

public expect fun pthreadAttrGetschedpolicy(attr: ConstPtr<PthreadAttrT>, policy: MutPtr<CInt>): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt

public expect fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt

public expect fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt

public expect fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt

// Note(reorg): In recent POSIX versions, this is a signal.h function and not required
// in pthread.
public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robustness: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt

public expect fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt

// Note(1.0): These shoul be combined to the version that takes an optional unchecked function.
public expect fun pthreadOnce(control: MutPtr<PthreadOnceT>, routine: PthreadAtforkPrepareCallback): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

// Note(reorg): In recent POSIX versions, this is a signal.h function and not required
// in pthread.
public expect fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt
