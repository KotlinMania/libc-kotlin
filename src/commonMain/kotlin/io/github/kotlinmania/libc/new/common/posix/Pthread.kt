// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.*

public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int

public expect fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int

public expect fun pthreadAttrGetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int?): Int

public expect fun pthreadAttrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int

public expect fun pthreadAttrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int?): Int

public expect fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int

public expect fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong): Int

public expect fun pthreadAttrSetinheritsched(attr: io.github.kotlinmania.libc.COpaquePointer?, inheritsched: Int): Int

public expect fun pthreadAttrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int

public expect fun pthreadAttrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int): Int

public expect fun pthreadAttrSetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong): Int

public expect fun pthreadBarrierDestroy(barrier: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun pthreadBarrierInit(barrier: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?, count: UInt): Int

public expect fun pthreadBarrierWait(barrier: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun pthreadBarrierattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun pthreadBarrierattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, shared: Int?): Int

public expect fun pthreadBarrierattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, shared: Int): Int

public expect fun pthreadCancel(thread: ULong): Int

public expect fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int?): Int

public expect fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int

public expect fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int

public expect fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int

public expect fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int

public expect fun pthreadGetcpuclockid(thread: ULong, clkId: Int?): Int

public expect fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int

public expect fun pthreadKill(thread: ULong, sig: Int): Int

public expect fun pthreadMutexConsistent(mutex: io.github.kotlinmania.libc.COpaquePointer?): Int

public expect fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int

public expect fun pthreadMutexattrGetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int?): Int

public expect fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int

public expect fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robustness: Int?): Int

public expect fun pthreadMutexattrSetprotocol(attr: io.github.kotlinmania.libc.COpaquePointer?, protocol: Int): Int

public expect fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int

public expect fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robustness: Int): Int

public expect fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int?): Int

public expect fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int): Int

public expect fun pthreadOnce(control: Int?, routine: (() -> Unit)?): Int

public expect fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int

public expect fun pthreadSetschedprio(native: ULong, priority: Int): Int

public expect fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int

public expect fun pthreadSpinDestroy(lock: Int?): Int

public expect fun pthreadSpinInit(lock: Int?, pshared: Int): Int

public expect fun pthreadSpinLock(lock: Int?): Int

public expect fun pthreadSpinTrylock(lock: Int?): Int

public expect fun pthreadSpinUnlock(lock: Int?): Int
