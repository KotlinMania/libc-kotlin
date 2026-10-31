// port-lint: source new/common/posix/pthread.rs
package io.github.kotlinmania.libc.new.common.posix.pthread

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT

/**
 * Header: `pthread.h`.
 *
 * <https://pubs.opengroup.org/onlinepubs/9699919799/basedefs/pthread.h.html>
 */

/** Opaque thread handle. */
public expect class PthreadT

/** Opaque thread attributes object. */
public expect class PthreadAttrT

/** Opaque mutex. */
public expect class PthreadMutexT

/** Opaque mutex attributes object. */
public expect class PthreadMutexattrT

/** Opaque condition variable. */
public expect class PthreadCondT

/** Opaque condition-variable attributes object. */
public expect class PthreadCondattrT

/** Opaque reader/writer lock. */
public expect class PthreadRwlockT

/** Opaque reader/writer lock attributes object. */
public expect class PthreadRwlockattrT

/** Opaque barrier. */
public expect class PthreadBarrierT

/** Opaque barrier attributes object. */
public expect class PthreadBarrierattrT

/** Opaque spinlock. */
public expect class PthreadSpinlockT

/** Opaque one-time initialization control object. */
public expect class PthreadOnceT

public expect fun pthreadCancel(thread: PthreadT): Int

public expect fun pthreadKill(thread: PthreadT, sig: Int): Int

public expect fun pthreadSetschedprio(native: PthreadT, priority: Int): Int

public expect fun pthreadSpinDestroy(lock: PthreadSpinlockT): Int

public expect fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: Int): Int

public expect fun pthreadSpinLock(lock: PthreadSpinlockT): Int

public expect fun pthreadSpinTrylock(lock: PthreadSpinlockT): Int

public expect fun pthreadSpinUnlock(lock: PthreadSpinlockT): Int

public expect fun pthreadBarrierDestroy(barrier: PthreadBarrierT): Int

public expect fun pthreadBarrierWait(barrier: PthreadBarrierT): Int

public expect fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): Int

public expect fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): Int

public expect fun pthreadMutexConsistent(mutex: PthreadMutexT): Int

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
public expect fun pthreadBarrierInit(barrier: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?, count: UInt): Int
public expect fun pthreadBarrierattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, shared: Int?): Int
public expect fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, shared: Int): Int
public expect fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int?): Int
public expect fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int
public expect fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int
public expect fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int
public expect fun pthreadCreate(native: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int
public expect fun pthreadGetcpuclockid(thread: ULong, clkId: Int?): Int
public expect fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int
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
public expect fun pthreadSigmask(how: Int, set: SigsetT?, oldset: SigsetT?): Int
