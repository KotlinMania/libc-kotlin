@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_thr_kill(id, sig)

public actual fun thrSelf(): ThreadT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_thr_self()

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_atfork(prepare?.value?.toCPointer<ByteVar>(), parent?.value?.toCPointer<ByteVar>(), child?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_getdetachstate(attr?.value?.toCPointer<ByteVar>(), detachstate?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_getguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_getinheritsched(attr?.value?.toCPointer<ByteVar>(), inheritsched?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_getstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_getschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_getscope(attr?.value?.toCPointer<ByteVar>(), contentionscope?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_getstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_setguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_setinheritsched(attr?.value?.toCPointer<ByteVar>(), inheritsched)

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy)

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_setscope(attr?.value?.toCPointer<ByteVar>(), contentionscope)

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_setstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_attr_setstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_barrierattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_barrierattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_barrierattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_barrierattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_barrier_destroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: COpaquePointer?, count: CUint): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_barrier_init(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_barrier_wait(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_cancel(thread)

public actual fun pthreadCleanupPop(execute: CInt) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_cleanup_pop(execute)
}

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_cleanup_push(routine?.value?.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: CLonglong?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_condattr_getclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_condattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_condattr_setclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_condattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadCreate(thread: CUint?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_create(thread?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), startRoutine.toInt(), arg?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetconcurrency(): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_getconcurrency()

public actual fun pthreadGetcpuclockid(threadId: io.github.kotlinmania.libc.PthreadT, clockId: CLonglong?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_getcpuclockid(threadId, clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(thread: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_getschedparam(thread, policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_kill(thread, sig)

public actual fun pthreadMutexattrGetprioceiling(attr: COpaquePointer?, prioceiling: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutexattr_getprioceiling(attr?.value?.toCPointer<ByteVar>(), prioceiling?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutexattr_getprotocol(attr?.value?.toCPointer<ByteVar>(), protocol?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutexattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutexattr_getrobust(attr?.value?.toCPointer<ByteVar>(), robust?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, type: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutexattr_gettype(attr?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprioceiling(attr: COpaquePointer?, prioceiling: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutexattr_setprioceiling(attr?.value?.toCPointer<ByteVar>(), prioceiling)

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutexattr_setprotocol(attr?.value?.toCPointer<ByteVar>(), protocol)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutexattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutexattr_setrobust(attr?.value?.toCPointer<ByteVar>(), robust)

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutex_consistent(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexGetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutex_getprioceiling(mutex?.value?.toCPointer<ByteVar>(), prioceiling?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexSetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt, oldCeiling: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutex_setprioceiling(mutex?.value?.toCPointer<ByteVar>(), prioceiling, oldCeiling?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_mutex_timedlock(mutex?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_once(onceControl?.value?.toCPointer<ByteVar>(), initRoutine?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_rwlockattr_getpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_rwlockattr_setpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadRwlockTimedrdlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_rwlock_timedrdlock(rwlock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedwrlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_rwlock_timedwrlock(rwlock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetcancelstate(state: CInt, oldstate: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_setcancelstate(state, oldstate?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetcanceltype(type: CInt, oldtype: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_setcanceltype(type, oldtype?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_setconcurrency(newLevel)

public actual fun pthreadSetschedparam(thread: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_setschedparam(thread, policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(thread: io.github.kotlinmania.libc.PthreadT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_setschedprio(thread, prio)

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oset: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_sigmask(how, set?.value?.toCPointer<ByteVar>(), oset?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_spin_destroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_spin_init(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_spin_lock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_spin_trylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_spin_unlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadTestcancel() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pthread_testcancel()
}

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_iconv_close(cd?.value?.toCPointer<ByteVar>())

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_iconv_open(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun acct(filename: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_acct(filename?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fildes: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_aio_cancel(fildes, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_aio_error(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_aio_fsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_aio_read(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_aio_return(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_aio_suspend(list?.value?.toCPointer<ByteVar>(), nent, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_aio_write(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun brk(addr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_brk(addr?.value?.toCPointer<ByteVar>())

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_clearenv()

public actual fun clockGetcpuclockid(pid: PidT, clkId: CLonglong?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_clock_getcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_clock_getres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_clock_nanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_clock_settime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun creat64(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_creat64(path, mode)

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun drand48(): CDouble =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_drand48()

public actual fun duplocale(arg1: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_duplocale(arg1.toInt())

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_endgrent()
}

public actual fun endmntent(streamp: FILE?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_endmntent(streamp?.handle?.toCPointer<ByteVar>())

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_endpwent()
}

public actual fun endutent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_endutent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_endutxent()
}

public actual fun erand48(xseed: CUshort?): CDouble =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_faccessat(dirfd, pathname, mode, flags)

public actual fun fattach(fildes: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fattach(fildes, path)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fdatasync(fd)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun ffs(value: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_ffs(value)

public actual fun ffsl(value: CLong): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_ffsll(value)

public actual fun fgetgrent(file: FILE?): Group? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fgetgrent(file?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fgetpos64(stream: FILE?, ptr: CLonglong?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fgetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fgetpwent(file: FILE?): io.github.kotlinmania.libc.Passwd? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fgetpwent(file?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fopen64(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_freelocale(loc.toInt())
}

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_freopen64(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fseeko64(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: CLonglong?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fsetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fstat64(fildes: CInt, buf: Stat64?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fstat64(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs64(fd: CInt, buf: Statfs64?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fstatfs64(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_fstatvfs64(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun ftello64(stream: FILE?): Off64T =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_ftello64(stream?.handle?.toCPointer<ByteVar>())

public actual fun ftok(path: String?, id: CInt): io.github.kotlinmania.libc.KeyT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_ftok(path, id)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_ftruncate64(fd, length)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun getcontext(ucp: UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getdtablesize()

public actual fun getgrent(): Group? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgid(gid: GidT): Group? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getgrgid_r(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): Group? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getgrnam_r(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrset(user: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getgrset(user)?.let { COpaquePointer(it.toLong()) }

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_gethostid()

public actual fun getmntent(stream: FILE?): io.github.kotlinmania.libc.Mntent? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getmntent(stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: SizeT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getpagesize(): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getpagesize()

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getpeereid(socket, euid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getpriority(which, who)

public actual fun getpwent(): io.github.kotlinmania.libc.Passwd? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getpwnam_r(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getpwuid_r(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun getutent(): Utmp? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getutent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutid(u: Utmp?): Utmp? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getutid(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutline(u: Utmp?): Utmp? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getutline(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxent(): Utmpx? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_glob(pattern, flags, errfunc?.value?.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun hasmntopt(mnt: io.github.kotlinmania.libc.Mntent?, opt: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_hasmntopt(mnt?.value?.toCPointer<ByteVar>(), opt)?.let { COpaquePointer(it.toLong()) }

public actual fun hcreate(nelt: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_hcreate(nelt)

public actual fun hdestroy() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_hdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): Entry? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_hsearch(entry.toInt(), action.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_if_freenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun ifNameindex(): IfNameindex? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_if_nameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_initgroups(name, basegid)

public actual fun jrand48(xseed: CUshort?): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lcong48(p: CUshort?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_lfind(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, compar?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_lio_listio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nent, sevp?.value?.toCPointer<ByteVar>())

public actual fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_lpar_get_info(command, buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_lpar_set_resources(id, resource?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_lrand48()

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_lsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, compar?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_lseek64(fd, offset, whence)

public actual fun lstat64(path: String?, buf: Stat64?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_lstat64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mallinfo()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mallopt(param, value)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_memset_s(s?.value?.toCPointer<ByteVar>(), smax, c, n)

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mknodat(dirfd, pathname, mode, dev)

public actual fun mount(device: String?, path: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mount(device, path, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mq_close(mqd)

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mq_getattr(mqd, attr?.value?.toCPointer<ByteVar>())

public actual fun mqNotify(mqd: io.github.kotlinmania.libc.MqdT, notification: io.github.kotlinmania.libc.Sigevent?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mq_notify(mqd, notification?.value?.toCPointer<ByteVar>())

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mq_receive(mqd, msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mq_send(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mq_setattr(mqd, newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mq_timedreceive(mqd, msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mq_timedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mq_unlink(name)

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_mrand48()

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_newlocale(mask, locale, base.toInt())

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_nl_langinfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, loc: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_nl_langinfo_l(item, loc.toInt())?.let { COpaquePointer(it.toLong()) }

public actual fun nrand48(xseed: CUshort?): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pollset_create(maxfd)

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: PollCtl?, arrayLength: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pollset_ctl(ps, pollctlArray?.value?.toCPointer<ByteVar>(), arrayLength)

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pollset_destroy(ps)

public actual fun pollsetPoll(ps: PollsetT, polldataArray: Pollfd?, arrayLength: CInt, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pollset_poll(ps, polldataArray?.value?.toCPointer<ByteVar>(), arrayLength, timeout)

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: Pollfd?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pollset_query(ps, pollfdQuery?.value?.toCPointer<ByteVar>())

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_fadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_fadvise64(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_fallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_fallocate64(fd, offset, len)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawn_file_actions_addclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawn_file_actions_adddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawn_file_actions_addopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawn_file_actions_destroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawn_file_actions_init(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_destroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_getflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_getpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_getschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_getschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_getsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_getsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_init(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_setflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_setpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_setschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_setschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_setsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnattr_setsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_posix_spawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pread64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_ptrace64(request, id, addr, data, buff?.value?.toCPointer<ByteVar>())

public actual fun pututline(u: Utmp?): Utmp? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pututline(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pwrite64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun quotactl(cmd: COpaquePointer?, special: CInt, id: CInt, data: CaddrT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_quotactl(cmd?.value?.toCPointer<ByteVar>(), special, id, data?.value?.toCPointer<ByteVar>())

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_rand()

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun recvmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun recvmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_recvmsg(sockfd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regfree(preg: RegexT?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sched_getparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sched_getscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sched_get_priority_max(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sched_get_priority_min(policy)

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sched_rr_get_interval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sched_setparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sched_setscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sctpOptInfo(sd: CInt, id: io.github.kotlinmania.libc.SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: SizeT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sctp_opt_info(sd, id, opt, argSize?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sctpPeeloff(s: CInt, id: CUint?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sctp_peeloff(s, id?.value?.toCPointer<ByteVar>())

public actual fun seed48(xseed: CUshort?): CUshort? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun semClose(sem: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sem_close(sem?.value?.toCPointer<ByteVar>())

public actual fun semDestroy(sem: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sem_destroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: CInt?, sval: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sem_getvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: CInt?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sem_init(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semTimedwait(sem: CInt?, abstime: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sem_timedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sem_unlink(name)

public actual fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflag: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun sendFile(socket: CInt?, iobuf: SfParms?, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_send_file(socket?.value?.toCPointer<ByteVar>(), iobuf?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun sendmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sendmsg(sockfd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun setcontext(ucp: UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun setdomainname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setdomainname(name, len)

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setgrent()
}

public actual fun sethostid(hostid: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sethostid(hostid)

public actual fun sethostname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sethostname(name, len)

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setmntent(filename, ty)?.let { FILE(it.toLong()) }

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setpriority(which, who, priority)

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setpwent()
}

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun settimeofday(tv: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun setutent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setutent()
}

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_setutxent()
}

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: SigsetT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_shmget(key, size, shmflg)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_shm_open(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_shm_unlink(name)

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_splice(socket1, socket2, flags)

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_srand(seed)
}

public actual fun srand48(seed: CLong) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_srand48(seed)
}

public actual fun stat64(path: String?, buf: Stat64?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_stat64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun stat64at(dirfd: CInt, path: String?, buf: Stat64?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_stat64at(dirfd, path, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun statfs64(path: String?, buf: Statfs64?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_statfs64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun statvfs64(path: String?, buf: Statvfs64?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_statvfs64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun statx(path: String?, buf: Stat?, length: CInt, command: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_statx(path, buf?.value?.toCPointer<ByteVar>(), length, command)

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_strcasecmp_l(string1, string2, locale.toInt())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_strerror_r(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: Tm?): SizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_strftime(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_strncasecmp_l(string1, string2, length, locale.toInt())

public actual fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_strptime(s, format, tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_strsep(string?.value?.toCPointer<ByteVar>(), delim)?.let { COpaquePointer(it.toLong()) }

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_swapcontext(uocp?.value?.toCPointer<ByteVar>(), ucp?.value?.toCPointer<ByteVar>())

public actual fun swapoff(path: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_swapoff(path)

public actual fun swapon(path: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_swapon(path)

public actual fun sync() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_sync()
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: io.github.kotlinmania.libc.ClockidT, sevp: io.github.kotlinmania.libc.Sigevent?, timerid: CLong?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_timer_create(clockid, sevp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_timer_delete(timerid)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_timer_getoverrun(timerid)

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_timer_gettime(timerid, value?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.TimerT, flags: CInt, newValue: io.github.kotlinmania.libc.Itimerspec?, oldValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_timer_settime(timerid, flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun truncate64(path: String?, length: Off64T): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_truncate64(path, length)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun updwtmp(file: String?, u: Utmp?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_updwtmp(file, u?.value?.toCPointer<ByteVar>())
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_uselocale(loc.toInt())

public actual fun utmpname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_utmpname(file)

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun errno(): CInt? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_aix_mod_errno()?.let { COpaquePointer(it.toLong()) }
