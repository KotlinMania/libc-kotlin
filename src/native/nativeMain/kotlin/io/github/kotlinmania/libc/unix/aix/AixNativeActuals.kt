@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.DIR
import io.github.kotlinmania.libc.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_thrKill(id.toLong().toCPointer<ByteVar>(), sig)

public actual fun thrSelf(): ThreadT =
    (io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_thrSelf()?.toLong() ?: 0L).toUInt()

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAtfork(0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrGetdetachstate(attr?.value?.toCPointer<ByteVar>(), detachstate?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrGetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrGetinheritsched(attr?.value?.toCPointer<ByteVar>(), inheritsched?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrGetstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrGetscope(attr?.value?.toCPointer<ByteVar>(), contentionscope?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrGetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrSetguardsize(attr?.value?.toCPointer<ByteVar>(), guardsize)

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrSetinheritsched(attr?.value?.toCPointer<ByteVar>(), inheritsched)

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), policy)

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrSetscope(attr?.value?.toCPointer<ByteVar>(), contentionscope)

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrSetstack(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>(), stacksize)

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadAttrSetstackaddr(attr?.value?.toCPointer<ByteVar>(), stackaddr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadBarrierattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadBarrierattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadBarrierattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadBarrierattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadBarrierDestroy(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadBarrierInit(barrier?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), count)

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadBarrierWait(barrier?.value?.toCPointer<ByteVar>())

public actual fun pthreadCancel(thread: PthreadT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadCancel(thread.toLong().toCPointer<ByteVar>())

public actual fun pthreadCleanupPop(execute: CInt) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadCleanupPop(execute)
}

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadCleanupPush(0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())
}

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadCondattrGetclock(attr?.value?.toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadCondattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadCondattrSetclock(attr?.value?.toCPointer<ByteVar>(), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadCondattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadCreate(thread?.value?.toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>(), arg?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetconcurrency(): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadGetconcurrency()

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadGetcpuclockid(threadId.toLong().toCPointer<ByteVar>(), clockId?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetschedparam(thread: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadGetschedparam(thread.toLong().toCPointer<ByteVar>(), policy?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadKill(thread.toLong().toCPointer<ByteVar>(), sig)

public actual fun pthreadMutexattrGetprioceiling(attr: COpaquePointer?, prioceiling: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexattrGetprioceiling(attr?.value?.toCPointer<ByteVar>(), prioceiling?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexattrGetprotocol(attr?.value?.toCPointer<ByteVar>(), protocol?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexattrGetrobust(attr?.value?.toCPointer<ByteVar>(), robust?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, type: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexattrGettype(attr?.value?.toCPointer<ByteVar>(), type?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexattrSetprioceiling(attr: COpaquePointer?, prioceiling: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexattrSetprioceiling(attr?.value?.toCPointer<ByteVar>(), prioceiling)

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexattrSetprotocol(attr?.value?.toCPointer<ByteVar>(), protocol)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexattrSetrobust(attr?.value?.toCPointer<ByteVar>(), robust)

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexConsistent(mutex?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexGetprioceiling(mutex: COpaquePointer?, prioceiling: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexGetprioceiling(mutex?.value?.toCPointer<ByteVar>(), prioceiling?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexSetprioceiling(mutex: COpaquePointer?, prioceiling: CInt, oldCeiling: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexSetprioceiling(mutex?.value?.toCPointer<ByteVar>(), prioceiling, oldCeiling?.value?.toCPointer<ByteVar>())

public actual fun pthreadMutexTimedlock(mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadMutexTimedlock(mutex?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadOnce(onceControl?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadRwlockattrGetpshared(attr?.value?.toCPointer<ByteVar>(), pshared?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadRwlockattrSetpshared(attr?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadRwlockTimedrdlock(rwlock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadRwlockTimedrdlock(rwlock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadRwlockTimedwrlock(rwlock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadRwlockTimedwrlock(rwlock?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetcancelstate(state: CInt, oldstate: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSetcancelstate(state, oldstate?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetcanceltype(type: CInt, oldtype: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSetcanceltype(type, oldtype?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSetconcurrency(newLevel)

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSetschedparam(thread.toLong().toCPointer<ByteVar>(), policy, param?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSetschedprio(thread.toLong().toCPointer<ByteVar>(), prio)

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSigmask(how, set?.value?.toCPointer<ByteVar>(), oset?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSpinDestroy(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSpinInit(lock?.value?.toCPointer<ByteVar>(), pshared)

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSpinLock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSpinTrylock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadSpinUnlock(lock?.value?.toCPointer<ByteVar>())

public actual fun pthreadTestcancel() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pthreadTestcancel()
}

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_iconv(cd?.value?.toCPointer<ByteVar>(), inbuf?.value?.toCPointer<ByteVar>(), inbytesleft?.value?.toCPointer<ByteVar>(), outbuf?.value?.toCPointer<ByteVar>(), outbytesleft?.value?.toCPointer<ByteVar>())

public actual fun iconvClose(cd: IconvT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_iconvClose(cd?.value?.toCPointer<ByteVar>())

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_iconvOpen(tocode, fromcode)?.let { COpaquePointer(it.toLong()) }

public actual fun acct(filename: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_acct(filename?.value?.toCPointer<ByteVar>())

public actual fun aioCancel(fildes: CInt, aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_aioCancel(fildes, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_aioError(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_aioFsync(op, aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_aioRead(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_aioReturn(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_aioSuspend(list?.value?.toCPointer<ByteVar>(), nent, timeout?.value?.toCPointer<ByteVar>())

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_aioWrite(aiocbp?.value?.toCPointer<ByteVar>())

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_basename(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_bind(socket, address?.value?.toCPointer<ByteVar>(), addressLen)

public actual fun brk(addr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_brk(addr?.value?.toCPointer<ByteVar>())

public actual fun clearenv(): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_clearenv()

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_clockGetcpuclockid(pid, clkId?.value?.toCPointer<ByteVar>())

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_clockGetres(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_clockNanosleep(clkId, flags, rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_clockSettime(clockId, tp?.value?.toCPointer<ByteVar>())

public actual fun creat64(path: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_creat64(path, mode)

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_ctermid(s?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun dirfd(dirp: DIR?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_dirfd(dirp?.handle?.toCPointer<ByteVar>())

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_dirname(path?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun drand48(): CDouble =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_drand48()

public actual fun duplocale(arg1: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_duplocale(arg1?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun endgrent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_endgrent()
}

public actual fun endmntent(streamp: FILE?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_endmntent(streamp?.handle?.toCPointer<ByteVar>())

public actual fun endpwent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_endpwent()
}

public actual fun endutent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_endutent()
}

public actual fun endutxent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_endutxent()
}

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_erand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_faccessat(dirfd, pathname, mode, flags)

public actual fun fattach(fildes: CInt, path: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fattach(fildes, path)

public actual fun fdatasync(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fdatasync(fd)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fexecve(fd, argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun ffs(value: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_ffs(value)

public actual fun ffsl(value: CLong): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_ffsll(value)

public actual fun fgetgrent(file: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fgetgrent(file?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fgetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fgetpwent(file: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fgetpwent(file?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fopen64(filename, mode)?.let { FILE(it.toLong()) }

public actual fun freelocale(loc: LocaleT) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_freelocale(loc?.value?.toCPointer<ByteVar>())
}

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_freopen64(filename, mode, file?.handle?.toCPointer<ByteVar>())?.let { FILE(it.toLong()) }

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fseeko64(stream?.handle?.toCPointer<ByteVar>(), offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fsetpos64(stream?.handle?.toCPointer<ByteVar>(), ptr?.value?.toCPointer<ByteVar>())

public actual fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fstat64(fildes, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fstatfs(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fstatfs64(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_fstatvfs64(fd, buf?.value?.toCPointer<ByteVar>())

public actual fun ftello64(stream: FILE?): Off64T =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_ftello64(stream?.handle?.toCPointer<ByteVar>())

public actual fun ftok(path: String?, id: CInt): KeyT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_ftok(path, id)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_ftruncate64(fd, length)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_futimens(fd, times?.value?.toCPointer<ByteVar>())

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getdomainname(name?.value?.toCPointer<ByteVar>(), len)

public actual fun getdtablesize(): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getdtablesize()

public actual fun getgrent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getgrent()?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getgrgid(gid)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getgrgidR(gid, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrnam(name: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getgrnam(name)?.let { COpaquePointer(it.toLong()) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getgrnamR(name, grp?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getgrset(user: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getgrset(user)?.let { COpaquePointer(it.toLong()) }

public actual fun gethostid(): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_gethostid()

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getmntent(stream?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getnameinfo(sa: COpaquePointer?, salen: SizeT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getnameinfo(sa?.value?.toCPointer<ByteVar>(), salen, host?.value?.toCPointer<ByteVar>(), hostlen, serv?.value?.toCPointer<ByteVar>(), servlen, flags)

public actual fun getpagesize(): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getpagesize()

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getpeereid(socket, euid?.value?.toCPointer<ByteVar>(), egid?.value?.toCPointer<ByteVar>())

public actual fun getpriority(which: CInt, who: IdT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getpriority(which, who)

public actual fun getpwent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getpwent()?.let { COpaquePointer(it.toLong()) }

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getpwnamR(name, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getpwuidR(uid, pwd?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), buflen, result?.value?.toCPointer<ByteVar>())

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_gettimeofday(tp?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getitimer(which, currValue?.value?.toCPointer<ByteVar>())

public actual fun getutent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getutent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutid(u: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getutid(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutline(u: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getutline(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxent(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getutxent()?.let { COpaquePointer(it.toLong()) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getutxid(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_getutxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_glob(pattern, flags, 0L.toCPointer<ByteVar>(), pglob?.value?.toCPointer<ByteVar>())

public actual fun globfree(pglob: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_globfree(pglob?.value?.toCPointer<ByteVar>())
}

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_hasmntopt(mnt?.value?.toCPointer<ByteVar>(), opt)?.let { COpaquePointer(it.toLong()) }

public actual fun hcreate(nelt: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_hcreate(nelt)

public actual fun hdestroy() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_hdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_ifFreenameindex(ptr?.value?.toCPointer<ByteVar>())
}

public actual fun ifNameindex(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_ifNameindex()?.let { COpaquePointer(it.toLong()) }

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_initgroups(name, basegid)

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_jrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun lcong48(p: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_lcong48(p?.value?.toCPointer<ByteVar>())
}

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_lfind(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_lioListio(mode, aiocbList?.value?.toCPointer<ByteVar>(), nent, sevp?.value?.toCPointer<ByteVar>())

public actual fun loadquery(flags: CInt, buf: COpaquePointer?, buflen: CUint, vararg variadicArgs: Long): CInt =
    0

public actual fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_lparGetInfo(command, buf?.value?.toCPointer<ByteVar>(), bufsize)

public actual fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_lparSetResources(id, resource?.value?.toCPointer<ByteVar>())

public actual fun lrand48(): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_lrand48()

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_lsearch(key?.value?.toCPointer<ByteVar>(), base?.value?.toCPointer<ByteVar>(), nelp?.value?.toCPointer<ByteVar>(), width, 0L.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_lseek64(fd, offset, whence)

public actual fun lstat64(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_lstat64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_madvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun makecontext(ucp: COpaquePointer?, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long) {
}

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mallopt(param, value)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_memmem(haystack?.value?.toCPointer<ByteVar>(), haystacklen, needle?.value?.toCPointer<ByteVar>(), needlelen)?.let { COpaquePointer(it.toLong()) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_memsetS(s?.value?.toCPointer<ByteVar>(), smax, c, n)

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mincore(addr?.value?.toCPointer<ByteVar>(), len, vec?.value?.toCPointer<ByteVar>())

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mknodat(dirfd, pathname, mode, dev)

public actual fun mount(device: String?, path: String?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mount(device, path, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mprotect(addr?.value?.toCPointer<ByteVar>(), len, prot)

public actual fun mqClose(mqd: MqdT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mqClose(mqd.toLong().toCPointer<ByteVar>())

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mqGetattr(mqd.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mqNotify(mqd.toLong().toCPointer<ByteVar>(), notification?.value?.toCPointer<ByteVar>())

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    0

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mqReceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>())

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mqSend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mqSetattr(mqd.toLong().toCPointer<ByteVar>(), newattr?.value?.toCPointer<ByteVar>(), oldattr?.value?.toCPointer<ByteVar>())

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mqTimedreceive(mqd.toLong().toCPointer<ByteVar>(), msgPtr?.value?.toCPointer<ByteVar>(), msgLen, msgPrio?.value?.toCPointer<ByteVar>(), absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mqTimedsend(mqd.toLong().toCPointer<ByteVar>(), msgPtr, msgLen, msgPrio, absTimeout?.value?.toCPointer<ByteVar>())

public actual fun mqUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mqUnlink(name)

public actual fun mrand48(): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_mrand48()

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_msgctl(msqid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_msgrcv(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_msgsnd(msqid, msgp?.value?.toCPointer<ByteVar>(), msgsz, msgflg)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_msync(addr?.value?.toCPointer<ByteVar>(), len, flags)

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_newlocale(mask, locale, base?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_nlLanginfo(item)?.let { COpaquePointer(it.toLong()) }

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_nlLanginfoL(item, loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_nrand48(xseed?.value?.toCPointer<ByteVar>())

public actual fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pollsetCreate(maxfd)

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: COpaquePointer?, arrayLength: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pollsetCtl(ps, pollctlArray?.value?.toCPointer<ByteVar>(), arrayLength)

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pollsetDestroy(ps)

public actual fun pollsetPoll(ps: PollsetT, polldataArray: COpaquePointer?, arrayLength: CInt, timeout: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pollsetPoll(ps, polldataArray?.value?.toCPointer<ByteVar>(), arrayLength, timeout)

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pollsetQuery(ps, pollfdQuery?.value?.toCPointer<ByteVar>())

public actual fun popen(command: String?, mode: String?): FILE? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_popen(command, mode)?.let { FILE(it.toLong()) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixFadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixFadvise64(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixFallocate64(fd, offset, len)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixMadvise(addr?.value?.toCPointer<ByteVar>(), len, advice)

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawn(pid?.value?.toCPointer<ByteVar>(), path, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnFileActionsAddclose(actions?.value?.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnFileActionsAdddup2(actions?.value?.toCPointer<ByteVar>(), fd, newfd)

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnFileActionsAddopen(actions?.value?.toCPointer<ByteVar>(), fd, path, oflag, mode)

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnFileActionsDestroy(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnFileActionsInit(actions?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrDestroy(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrGetflags(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrGetpgroup(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrGetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrGetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrGetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrGetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrInit(attr?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrSetflags(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrSetpgroup(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrSetschedparam(attr?.value?.toCPointer<ByteVar>(), param?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrSetschedpolicy(attr?.value?.toCPointer<ByteVar>(), flags)

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrSetsigdefault(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnattrSetsigmask(attr?.value?.toCPointer<ByteVar>(), default?.value?.toCPointer<ByteVar>())

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_posixSpawnp(pid?.value?.toCPointer<ByteVar>(), file, fileActions?.value?.toCPointer<ByteVar>(), attrp?.value?.toCPointer<ByteVar>(), argv?.value?.toCPointer<ByteVar>(), envp?.value?.toCPointer<ByteVar>())

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pread64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffsetT): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_preadv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_ptrace64(request, id, addr, data, buff?.value?.toCPointer<ByteVar>())

public actual fun pututline(u: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pututline(u?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pututxline(ut?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pwrite64(fd, buf?.value?.toCPointer<ByteVar>(), count, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffsetT): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_pwritev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt, offset)

public actual fun quotactl(cmd: COpaquePointer?, special: CInt, id: CInt, data: CaddrT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_quotactl(cmd?.value?.toCPointer<ByteVar>(), special, id, data?.value?.toCPointer<ByteVar>())

public actual fun rand(): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_rand()

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_readv(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_recvfrom(socket, buf?.value?.toCPointer<ByteVar>(), len, flags, addr?.value?.toCPointer<ByteVar>(), addrlen?.value?.toCPointer<ByteVar>())

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_recvmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags, timeout?.value?.toCPointer<ByteVar>())

public actual fun recvmsg(sockfd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_recvmsg(sockfd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_regcomp(preg?.value?.toCPointer<ByteVar>(), pattern, cflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_regerror(errcode, preg?.value?.toCPointer<ByteVar>(), errbuf?.value?.toCPointer<ByteVar>(), errbufSize)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_regexec(preg?.value?.toCPointer<ByteVar>(), input, nmatch, pmatch?.value?.toCPointer<ByteVar>(), eflags)

public actual fun regfree(preg: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_regfree(preg?.value?.toCPointer<ByteVar>())
}

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sbrk(increment)?.let { COpaquePointer(it.toLong()) }

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_schedGetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedGetscheduler(pid: PidT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_schedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_schedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_schedRrGetInterval(pid, tp?.value?.toCPointer<ByteVar>())

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_schedSetparam(pid, param?.value?.toCPointer<ByteVar>())

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_schedSetscheduler(pid, policy, param?.value?.toCPointer<ByteVar>())

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sctpOptInfo(sd, id, opt, argSize?.value?.toCPointer<ByteVar>(), size?.value?.toCPointer<ByteVar>())

public actual fun sctpPeeloff(s: CInt, id: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sctpPeeloff(s, id?.value?.toCPointer<ByteVar>())

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_seed48(xseed?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_seekdir(dirp?.handle?.toCPointer<ByteVar>(), loc)
}

public actual fun semClose(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_semClose(sem?.value?.toCPointer<ByteVar>())

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_semDestroy(sem?.value?.toCPointer<ByteVar>())

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_semGetvalue(sem?.value?.toCPointer<ByteVar>(), sval?.value?.toCPointer<ByteVar>())

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_semInit(sem?.value?.toCPointer<ByteVar>(), pshared, value)

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_semTimedwait(sem?.value?.toCPointer<ByteVar>(), abstime?.value?.toCPointer<ByteVar>())

public actual fun semUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_semUnlink(name)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_semop(semid, sops?.value?.toCPointer<ByteVar>(), nsops)

public actual fun sendFile(socket: COpaquePointer?, iobuf: COpaquePointer?, flags: CUint): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sendFile(socket?.value?.toCPointer<ByteVar>(), iobuf?.value?.toCPointer<ByteVar>(), flags)

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sendmmsg(sockfd, msgvec?.value?.toCPointer<ByteVar>(), vlen, flags)

public actual fun sendmsg(sockfd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sendmsg(sockfd, msg?.value?.toCPointer<ByteVar>(), flags)

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setcontext(ucp?.value?.toCPointer<ByteVar>())

public actual fun setdomainname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setdomainname(name, len)

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setgroups(ngroups, ptr?.value?.toCPointer<ByteVar>())

public actual fun setgrent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setgrent()
}

public actual fun sethostid(hostid: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sethostid(hostid)

public actual fun sethostname(name: String?, len: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sethostname(name, len)

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setmntent(filename, ty)?.let { FILE(it.toLong()) }

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setpriority(which, who, priority)

public actual fun setpwent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setpwent()
}

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setrlimit(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setrlimit64(resource, rlim?.value?.toCPointer<ByteVar>())

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_settimeofday(tv?.value?.toCPointer<ByteVar>(), tz?.value?.toCPointer<ByteVar>())

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setitimer(which, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun setutent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setutent()
}

public actual fun setutxent() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_setutxent()
}

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sigaltstack(ss?.value?.toCPointer<ByteVar>(), oss?.value?.toCPointer<ByteVar>())

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sigsuspend(mask?.value?.toCPointer<ByteVar>())

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sigtimedwait(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), timeout?.value?.toCPointer<ByteVar>())

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sigwait(set?.value?.toCPointer<ByteVar>(), sig?.value?.toCPointer<ByteVar>())

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sigwaitinfo(set?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>())

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_shmat(shmid, shmaddr?.value?.toCPointer<ByteVar>(), shmflg)?.let { COpaquePointer(it.toLong()) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_shmdt(shmaddr?.value?.toCPointer<ByteVar>())

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_shmctl(shmid, cmd, buf?.value?.toCPointer<ByteVar>())

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_shmget(key, size, shmflg)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_shmUnlink(name)

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_splice(socket1, socket2, flags)

public actual fun srand(seed: CUint) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_srand(seed)
}

public actual fun srand48(seed: CLong) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_srand48(seed)
}

public actual fun stat64(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_stat64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun stat64at(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_stat64at(dirfd, path, buf?.value?.toCPointer<ByteVar>(), flags)

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_statfs(path, buf?.value?.toCPointer<ByteVar>())

public actual fun statfs64(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_statfs64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun statvfs64(path: String?, buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_statvfs64(path, buf?.value?.toCPointer<ByteVar>())

public actual fun statx(path: String?, buf: COpaquePointer?, length: CInt, command: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_statx(path, buf?.value?.toCPointer<ByteVar>(), length, command)

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_strcasecmpL(string1, string2, locale?.value?.toCPointer<ByteVar>())

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_strerrorR(errnum, buf?.value?.toCPointer<ByteVar>(), buflen)

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_strftime(arg1?.value?.toCPointer<ByteVar>(), arg2, arg3, arg4?.value?.toCPointer<ByteVar>())

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_strncasecmpL(string1, string2, length, locale?.value?.toCPointer<ByteVar>())

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_strptime(s, format, tm?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_strsep(string?.value?.toCPointer<ByteVar>(), delim)?.let { COpaquePointer(it.toLong()) }

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_swapcontext(uocp?.value?.toCPointer<ByteVar>(), ucp?.value?.toCPointer<ByteVar>())

public actual fun swapoff(path: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_swapoff(path)

public actual fun swapon(path: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_swapon(path)

public actual fun sync() {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_sync()
}

public actual fun telldir(dirp: DIR?): CLong =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_telldir(dirp?.handle?.toCPointer<ByteVar>())

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_timerCreate(clockid, sevp?.value?.toCPointer<ByteVar>(), timerid?.value?.toCPointer<ByteVar>())

public actual fun timerDelete(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_timerDelete(timerid.toCPointer<ByteVar>())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_timerGetoverrun(timerid.toCPointer<ByteVar>())

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_timerGettime(timerid.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_timerSettime(timerid.toCPointer<ByteVar>(), flags, newValue?.value?.toCPointer<ByteVar>(), oldValue?.value?.toCPointer<ByteVar>())

public actual fun truncate64(path: String?, length: Off64T): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_truncate64(path, length)

public actual fun uname(buf: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_uname(buf?.value?.toCPointer<ByteVar>())

public actual fun updwtmp(file: String?, u: COpaquePointer?) {
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_updwtmp(file, u?.value?.toCPointer<ByteVar>())
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_uselocale(loc?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun utmpname(file: String?): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_utmpname(file)

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_utimensat(dirfd, path, times?.value?.toCPointer<ByteVar>(), flag)

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_wait4(pid, status?.value?.toCPointer<ByteVar>(), options, rusage?.value?.toCPointer<ByteVar>())

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_waitid(idtype, id, infop?.value?.toCPointer<ByteVar>(), options)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun errno(): COpaquePointer? =
    io.github.kotlinmania.libc.unix.aix.cinterop.libc_unix_aix_errno()?.let { COpaquePointer(it.toLong()) }
