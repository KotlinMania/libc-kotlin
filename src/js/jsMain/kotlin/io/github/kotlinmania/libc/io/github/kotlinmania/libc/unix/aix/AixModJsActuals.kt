package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.COpaquePointer

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').thrKill(id, sig)") as CInt

public actual fun thrSelf(): ThreadT =
    js("require('@kotlinmania/libc-native-bindings').thrSelf()") as ThreadT

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetdetachstate(attr?.value ?: 0L, detachstate?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetguardsize(attr?.value ?: 0L, guardsize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetinheritsched(attr?.value ?: 0L, inheritsched?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstackaddr(attr?.value ?: 0L, stackaddr?.value ?: 0L)") as CInt

public actual fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetschedpolicy(attr?.value ?: 0L, policy?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetscope(attr?.value ?: 0L, contentionscope?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetguardsize(attr?.value ?: 0L, guardsize)") as CInt

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetinheritsched(attr?.value ?: 0L, inheritsched)") as CInt

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetschedpolicy(attr?.value ?: 0L, policy)") as CInt

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetscope(attr?.value ?: 0L, contentionscope)") as CInt

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize)") as CInt

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstackaddr(attr?.value ?: 0L, stackaddr?.value ?: 0L)") as CInt

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrDestroy(attr?.value ?: 0L)") as CInt

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrInit(attr?.value ?: 0L)") as CInt

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrSetpshared(attr?.value ?: 0L, pshared)") as CInt

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierDestroy(barrier?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: COpaquePointer?, count: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.value ?: 0L, count)") as CInt

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierWait(barrier?.toLong() ?: 0L)") as CInt

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCancel(thread)") as CInt

public actual fun pthreadCleanupPop(execute: CInt) {
    js("require('@kotlinmania/libc-native-bindings').pthreadCleanupPop(execute)")
}

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').pthreadCleanupPush(routine?.toLong() ?: 0L, arg?.value ?: 0L)")
}

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: CLonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetclock(attr?.value ?: 0L, clockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.value ?: 0L, clockId)") as CInt

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetpshared(attr?.value ?: 0L, pshared)") as CInt

public actual fun pthreadCreate(thread: CUint?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(thread?.toLong() ?: 0L, attr?.value ?: 0L, startRoutine, arg?.value ?: 0L)") as CInt

public actual fun pthreadGetconcurrency(): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetconcurrency()") as CInt

public actual fun pthreadGetcpuclockid(threadId: io.github.kotlinmania.libc.PthreadT, clockId: CLonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetcpuclockid(threadId, clockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetschedparam(thread: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetschedparam(thread, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKill(thread, sig)") as CInt

public actual fun pthreadMutexattrGetprioceiling(attr: COpaquePointer?, prioceiling: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetprioceiling(attr?.value ?: 0L, prioceiling?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetprotocol(attr?.value ?: 0L, protocol?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetrobust(attr?.value ?: 0L, robust?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, type: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGettype(attr?.value ?: 0L, type?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSetprioceiling(attr: COpaquePointer?, prioceiling: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetprioceiling(attr?.value ?: 0L, prioceiling)") as CInt

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetprotocol(attr?.value ?: 0L, protocol)") as CInt

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetpshared(attr?.value ?: 0L, pshared)") as CInt

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetrobust(attr?.value ?: 0L, robust)") as CInt

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexConsistent(mutex?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexGetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexGetprioceiling(mutex?.toLong() ?: 0L, prioceiling?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexSetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt, oldCeiling: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexSetprioceiling(mutex?.toLong() ?: 0L, prioceiling, oldCeiling?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexTimedlock(mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTimedlock(mutex?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadOnce(onceControl?.toLong() ?: 0L, initRoutine?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrSetpshared(attr?.value ?: 0L, pshared)") as CInt

public actual fun pthreadRwlockTimedrdlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockTimedrdlock(rwlock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockTimedwrlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockTimedwrlock(rwlock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetcancelstate(state: CInt, oldstate: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetcancelstate(state, oldstate?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetcanceltype(type: CInt, oldtype: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetcanceltype(type, oldtype?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetconcurrency(newLevel)") as CInt

public actual fun pthreadSetschedparam(thread: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedparam(thread, policy, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetschedprio(thread: io.github.kotlinmania.libc.PthreadT, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedprio(thread, prio)") as CInt

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oset: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, set?.toLong() ?: 0L, oset?.toLong() ?: 0L)") as CInt

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

public actual fun pthreadTestcancel() {
    js("require('@kotlinmania/libc-native-bindings').pthreadTestcancel()")
}

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)") as SizeT

public actual fun iconvClose(cd: IconvT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iconvClose(cd)") as CInt

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    js("require('@kotlinmania/libc-native-bindings').iconvOpen(tocode, fromcode)") as IconvT

public actual fun acct(filename: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').acct(filename?.value ?: 0L)") as CInt

public actual fun aioCancel(fildes: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioCancel(fildes, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioError(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioError(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioFsync(op, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioRead(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').aioReturn(aiocbp?.toLong() ?: 0L)") as SsizeT

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioSuspend(list?.value ?: 0L, nent, timeout?.toLong() ?: 0L)") as CInt

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWrite(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').basename(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(socket, address?.toLong() ?: 0L, addressLen)") as CInt

public actual fun brk(addr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').brk(addr?.value ?: 0L)") as CInt

public actual fun clearenv(): CInt =
    js("require('@kotlinmania/libc-native-bindings').clearenv()") as CInt

public actual fun clockGetcpuclockid(pid: PidT, clkId: CLonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)") as CInt

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clockId, tp?.toLong() ?: 0L)") as CInt

public actual fun creat64(path: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').creat64(path, mode)") as CInt

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctermid(s?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dirname(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun drand48(): CDouble =
    js("require('@kotlinmania/libc-native-bindings').drand48()") as CDouble

public actual fun duplocale(arg1: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(arg1)") as LocaleT

public actual fun endgrent() {
    js("require('@kotlinmania/libc-native-bindings').endgrent()")
}

public actual fun endmntent(streamp: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').endmntent(streamp?.toLong() ?: 0L)") as CInt

public actual fun endpwent() {
    js("require('@kotlinmania/libc-native-bindings').endpwent()")
}

public actual fun endutent() {
    js("require('@kotlinmania/libc-native-bindings').endutent()")
}

public actual fun endutxent() {
    js("require('@kotlinmania/libc-native-bindings').endutxent()")
}

public actual fun erand48(xseed: CUshort?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').erand48(xseed?.toLong() ?: 0L)") as CDouble

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').faccessat(dirfd, pathname, mode, flags)") as CInt

public actual fun fattach(fildes: CInt, path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fattach(fildes, path)") as CInt

public actual fun fdatasync(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fdatasync(fd)") as CInt

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun ffs(value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').ffs(value)") as CInt

public actual fun ffsl(value: CLong): CInt =
    js("require('@kotlinmania/libc-native-bindings').ffsl(value)") as CInt

public actual fun ffsll(value: CLonglong): CInt =
    js("require('@kotlinmania/libc-native-bindings').ffsll(value)") as CInt

public actual fun fgetgrent(file: FILE?): Group? =
    js("require('@kotlinmania/libc-native-bindings').fgetgrent(file?.toLong() ?: 0L)") as Group?

public actual fun fgetpos64(stream: FILE?, ptr: CLonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)") as CInt

public actual fun fgetpwent(file: FILE?): io.github.kotlinmania.libc.Passwd? =
    js("require('@kotlinmania/libc-native-bindings').fgetpwent(file?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Passwd?

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').fopen64(filename, mode)") as FILE?

public actual fun freelocale(loc: LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)")
}

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').freopen64(filename, mode, file?.toLong() ?: 0L)") as FILE?

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fseeko64(stream?.toLong() ?: 0L, offset, whence)") as CInt

public actual fun fsetpos64(stream: FILE?, ptr: CLonglong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)") as CInt

public actual fun fstat64(fildes: CInt, buf: Stat64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstat64(fildes, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatfs64(fd: CInt, buf: Statfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs64(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatvfs64(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun ftello64(stream: FILE?): Off64T =
    js("require('@kotlinmania/libc-native-bindings').ftello64(stream?.toLong() ?: 0L)") as Off64T

public actual fun ftok(path: String?, id: CInt): io.github.kotlinmania.libc.KeyT =
    js("require('@kotlinmania/libc-native-bindings').ftok(path, id)") as io.github.kotlinmania.libc.KeyT

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').ftruncate64(fd, length)") as CInt

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun getcontext(ucp: UcontextT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getcontext(ucp?.toLong() ?: 0L)") as CInt

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdomainname(name?.value ?: 0L, len)") as CInt

public actual fun getdtablesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdtablesize()") as CInt

public actual fun getgrent(): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrent()") as Group?

public actual fun getgrgid(gid: GidT): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as Group?

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrnam(name: String?): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as Group?

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrset(user: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getgrset(user)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').gethostid()") as CLong

public actual fun getmntent(stream: FILE?): io.github.kotlinmania.libc.Mntent? =
    js("require('@kotlinmania/libc-native-bindings').getmntent(stream?.toLong() ?: 0L)") as io.github.kotlinmania.libc.Mntent?

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: SizeT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun getpagesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpagesize()") as CInt

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpeereid(socket, euid?.toLong() ?: 0L, egid?.toLong() ?: 0L)") as CInt

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun getpwent(): io.github.kotlinmania.libc.Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwent()") as io.github.kotlinmania.libc.Passwd?

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getitimer(which, currValue?.toLong() ?: 0L)") as CInt

public actual fun getutent(): Utmp? =
    js("require('@kotlinmania/libc-native-bindings').getutent()") as Utmp?

public actual fun getutid(u: Utmp?): Utmp? =
    js("require('@kotlinmania/libc-native-bindings').getutid(u?.toLong() ?: 0L)") as Utmp?

public actual fun getutline(u: Utmp?): Utmp? =
    js("require('@kotlinmania/libc-native-bindings').getutline(u?.toLong() ?: 0L)") as Utmp?

public actual fun getutxent(): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxent()") as Utmpx?

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxid(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    js("require('@kotlinmania/libc-native-bindings').globfree(pglob?.toLong() ?: 0L)")
}

public actual fun hasmntopt(mnt: io.github.kotlinmania.libc.Mntent?, opt: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').hasmntopt(mnt?.toLong() ?: 0L, opt)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcreate(nelt: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').hcreate(nelt)") as CInt

public actual fun hdestroy() {
    js("require('@kotlinmania/libc-native-bindings').hdestroy()")
}

public actual fun hsearch(entry: Entry, action: Action): Entry? =
    js("require('@kotlinmania/libc-native-bindings').hsearch(entry, action)") as Entry?

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    js("require('@kotlinmania/libc-native-bindings').ifFreenameindex(ptr?.toLong() ?: 0L)")
}

public actual fun ifNameindex(): IfNameindex? =
    js("require('@kotlinmania/libc-native-bindings').ifNameindex()") as IfNameindex?

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(name, basegid)") as CInt

public actual fun jrand48(xseed: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').jrand48(xseed?.toLong() ?: 0L)") as CLong

public actual fun lcong48(p: CUshort?) {
    js("require('@kotlinmania/libc-native-bindings').lcong48(p?.toLong() ?: 0L)")
}

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').lfind(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lioListio(mode, aiocbList?.value ?: 0L, nent, sevp?.toLong() ?: 0L)") as CInt

public actual fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').lparGetInfo(command, buf?.value ?: 0L, bufsize)") as CInt

public actual fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lparSetResources(id, resource?.value ?: 0L)") as CInt

public actual fun lrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').lrand48()") as CLong

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').lsearch(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    js("require('@kotlinmania/libc-native-bindings').lseek64(fd, offset, whence)") as Off64T

public actual fun lstat64(path: String?, buf: Stat64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lstat64(path, buf?.toLong() ?: 0L)") as CInt

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').madvise(addr, len, advice)") as CInt

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    js("require('@kotlinmania/libc-native-bindings').mallinfo()") as io.github.kotlinmania.libc.Mallinfo

public actual fun mallopt(param: CInt, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallopt(param, value)") as CInt

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').memsetS(s?.value ?: 0L, smax, c, n)") as CInt

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mincore(addr, len, vec?.value ?: 0L)") as CInt

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifoat(dirfd, pathname, mode)") as CInt

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknodat(dirfd, pathname, mode, dev)") as CInt

public actual fun mount(device: String?, path: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mount(device, path, flags)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqClose(mqd)") as CInt

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqGetattr(mqd, attr?.toLong() ?: 0L)") as CInt

public actual fun mqNotify(mqd: io.github.kotlinmania.libc.MqdT, notification: io.github.kotlinmania.libc.Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqNotify(mqd, notification?.toLong() ?: 0L)") as CInt

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)") as SsizeT

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSend(mqd, msgPtr, msgLen, msgPrio)") as CInt

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)") as CInt

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)") as SsizeT

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)") as CInt

public actual fun mqUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqUnlink(name)") as CInt

public actual fun mrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').mrand48()") as CLong

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgctl(msqid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgget(key, msgflg)") as CInt

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)") as SsizeT

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgsnd(msqid, msgp?.value ?: 0L, msgsz, msgflg)") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(mask, locale, base)") as LocaleT

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfo(item)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, loc: LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfoL(item, loc)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nrand48(xseed: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').nrand48(xseed?.toLong() ?: 0L)") as CLong

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    js("require('@kotlinmania/libc-native-bindings').pollsetCreate(maxfd)") as PollsetT

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: PollCtl?, arrayLength: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pollsetCtl(ps, pollctlArray?.toLong() ?: 0L, arrayLength)") as CInt

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pollsetDestroy(ps)") as CInt

public actual fun pollsetPoll(ps: PollsetT, polldataArray: Pollfd?, arrayLength: CInt, timeout: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pollsetPoll(ps, polldataArray?.toLong() ?: 0L, arrayLength, timeout)") as CInt

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: Pollfd?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pollsetQuery(ps, pollfdQuery?.toLong() ?: 0L)") as CInt

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise(fd, offset, len, advise)") as CInt

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise64(fd, offset, len, advise)") as CInt

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate(fd, offset, len)") as CInt

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate64(fd, offset, len)") as CInt

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMadvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclose(actions?.value ?: 0L, fd)") as CInt

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAdddup2(actions?.value ?: 0L, fd, newfd)") as CInt

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddopen(actions?.value ?: 0L, fd, path, oflag, mode)") as CInt

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsDestroy(actions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsInit(actions?.value ?: 0L)") as CInt

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetflags(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetpgroup(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedpolicy(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetflags(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetpgroup(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedpolicy(attr?.toLong() ?: 0L, flags)") as CInt

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pread64(fd, buf?.value ?: 0L, count, offset)") as SsizeT

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptrace64(request, id, addr, data, buff?.toLong() ?: 0L)") as CInt

public actual fun pututline(u: Utmp?): Utmp? =
    js("require('@kotlinmania/libc-native-bindings').pututline(u?.toLong() ?: 0L)") as Utmp?

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').pututxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwrite64(fd, buf?.value ?: 0L, count, offset)") as SsizeT

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun quotactl(cmd: COpaquePointer?, special: CInt, id: CInt, data: CaddrT): CInt =
    js("require('@kotlinmania/libc-native-bindings').quotactl(cmd?.value ?: 0L, special, id, data)") as CInt

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT

public actual fun recvmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun recvmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(sockfd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regcomp(preg?.toLong() ?: 0L, pattern, cflags)") as CInt

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)") as SizeT

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)") as CInt

public actual fun regfree(preg: RegexT?) {
    js("require('@kotlinmania/libc-native-bindings').regfree(preg?.toLong() ?: 0L)")
}

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sbrk(increment)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetscheduler(pid: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetscheduler(pid)") as CInt

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMax(policy)") as CInt

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMin(policy)") as CInt

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedRrGetInterval(pid, tp?.toLong() ?: 0L)") as CInt

public actual fun schedSetparam(pid: PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetscheduler(pid, policy, param?.toLong() ?: 0L)") as CInt

public actual fun sctpOptInfo(sd: CInt, id: io.github.kotlinmania.libc.SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sctpOptInfo(sd, id, opt, argSize?.value ?: 0L, size?.toLong() ?: 0L)") as CInt

public actual fun sctpPeeloff(s: CInt, id: CUint?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sctpPeeloff(s, id?.toLong() ?: 0L)") as CInt

public actual fun seed48(xseed: CUshort?): CUshort? =
    js("require('@kotlinmania/libc-native-bindings').seed48(xseed?.toLong() ?: 0L)") as CUshort?

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    js("require('@kotlinmania/libc-native-bindings').seekdir(dirp?.toLong() ?: 0L, loc)")
}

public actual fun semClose(sem: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun semDestroy(sem: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: CInt?, sval: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: CInt?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun semTimedwait(sem: CInt?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').semget(key, nsems, semflag)") as CInt

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').semop(semid, sops?.toLong() ?: 0L, nsops)") as CInt

public actual fun sendFile(socket: CInt?, iobuf: SfParms?, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendFile(socket?.toLong() ?: 0L, iobuf?.toLong() ?: 0L, flags)") as SsizeT

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)") as CInt

public actual fun sendmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(sockfd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun setcontext(ucp: UcontextT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setcontext(ucp?.toLong() ?: 0L)") as CInt

public actual fun setdomainname(name: String?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setdomainname(name, len)") as CInt

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgroups(ngroups, ptr?.toLong() ?: 0L)") as CInt

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun sethostid(hostid: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostid(hostid)") as CInt

public actual fun sethostname(name: String?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').setmntent(filename, ty)") as FILE?

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, priority)") as CInt

public actual fun setpwent() {
    js("require('@kotlinmania/libc-native-bindings').setpwent()")
}

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun settimeofday(tv: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setitimer(which, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun setutent() {
    js("require('@kotlinmania/libc-native-bindings').setutent()")
}

public actual fun setutxent() {
    js("require('@kotlinmania/libc-native-bindings').setutxent()")
}

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)") as CInt

public actual fun sigsuspend(mask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigsuspend(mask?.toLong() ?: 0L)") as CInt

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').shmat(shmid, shmaddr?.value ?: 0L, shmflg)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmdt(shmaddr?.value ?: 0L)") as CInt

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmctl(shmid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmget(key, size, shmflg)") as CInt

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun shmUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmUnlink(name)") as CInt

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').splice(socket1, socket2, flags)") as CInt

public actual fun srand(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(seed)")
}

public actual fun srand48(seed: CLong) {
    js("require('@kotlinmania/libc-native-bindings').srand48(seed)")
}

public actual fun stat64(path: String?, buf: Stat64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat64(path, buf?.toLong() ?: 0L)") as CInt

public actual fun stat64at(dirfd: CInt, path: String?, buf: Stat64?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').stat64at(dirfd, path, buf?.toLong() ?: 0L, flags)") as CInt

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs(path, buf?.toLong() ?: 0L)") as CInt

public actual fun statfs64(path: String?, buf: Statfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs64(path, buf?.toLong() ?: 0L)") as CInt

public actual fun statvfs64(path: String?, buf: Statvfs64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statvfs64(path, buf?.toLong() ?: 0L)") as CInt

public actual fun statx(path: String?, buf: Stat?, length: CInt, command: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').statx(path, buf?.toLong() ?: 0L, length, command)") as CInt

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcasecmpL(string1, string2, locale)") as CInt

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: Tm?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').strftime(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)") as SizeT

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncasecmpL(string1, string2, length, locale)") as CInt

public actual fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strptime(s, format, tm?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strsep(string?.value ?: 0L, delim)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapcontext(uocp?.toLong() ?: 0L, ucp?.toLong() ?: 0L)") as CInt

public actual fun swapoff(path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapoff(path)") as CInt

public actual fun swapon(path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapon(path)") as CInt

public actual fun sync() {
    js("require('@kotlinmania/libc-native-bindings').sync()")
}

public actual fun telldir(dirp: DIR?): CLong =
    js("require('@kotlinmania/libc-native-bindings').telldir(dirp?.toLong() ?: 0L)") as CLong

public actual fun timerCreate(clockid: io.github.kotlinmania.libc.ClockidT, sevp: io.github.kotlinmania.libc.Sigevent?, timerid: CLong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerCreate(clockid, sevp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)") as CInt

public actual fun timerDelete(timerid: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerDelete(timerid)") as CInt

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGetoverrun(timerid)") as CInt

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGettime(timerid, value?.toLong() ?: 0L)") as CInt

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.TimerT, flags: CInt, newValue: io.github.kotlinmania.libc.Itimerspec?, oldValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerSettime(timerid, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun truncate64(path: String?, length: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').truncate64(path, length)") as CInt

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun updwtmp(file: String?, u: Utmp?) {
    js("require('@kotlinmania/libc-native-bindings').updwtmp(file, u?.toLong() ?: 0L)")
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').uselocale(loc)") as LocaleT

public actual fun utmpname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpname(file)") as CInt

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    js("require('@kotlinmania/libc-native-bindings').wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)") as PidT

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, iovcnt)") as SsizeT

public actual fun errno(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errno()") as CInt?
