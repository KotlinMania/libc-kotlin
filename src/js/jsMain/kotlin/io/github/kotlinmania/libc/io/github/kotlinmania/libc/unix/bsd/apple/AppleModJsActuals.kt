package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.COpaquePointer

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun semDestroy(sem: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: CInt?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioRead(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWrite(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioFsync(op, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioError(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioError(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').aioReturn(aiocbp?.toLong() ?: 0L)") as SsizeT

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)") as CInt

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioCancel(fd, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun chflags(path: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').chflags(path, flags)") as CInt

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchflags(fd, flags)") as CInt

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)") as CInt

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lutimes(file, times?.toLong() ?: 0L)") as CInt

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun getutxent(): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxent()") as Utmpx?

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxid(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').pututxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun setutxent() {
    js("require('@kotlinmania/libc-native-bindings').setutxent()")
}

public actual fun endutxent() {
    js("require('@kotlinmania/libc-native-bindings').endutxent()")
}

public actual fun utmpxname(file: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpxname(file)") as CInt

public actual fun asctime(tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').asctime(tm?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctime(clock: CLong?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctime(clock?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getdate(datestr: String?): io.github.kotlinmania.libc.Tm? =
    js("require('@kotlinmania/libc-native-bindings').getdate(datestr)") as io.github.kotlinmania.libc.Tm?

public actual fun strptime(buf: String?, format: String?, timeptr: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strptime(buf, format, timeptr?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun asctimeR(tm: io.github.kotlinmania.libc.Tm?, result: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').asctimeR(tm?.toLong() ?: 0L, result?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(clock: CLong?, result: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctimeR(clock?.toLong() ?: 0L, result?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mincore(addr?.value ?: 0L, len, vec?.value ?: 0L)") as CInt

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctlnametomib(name, mibp?.toLong() ?: 0L, sizep?.toLong() ?: 0L)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').semget(key, nsems, semflg)") as CInt

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').semop(semid, sops?.toLong() ?: 0L, nsops)") as CInt

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    js("require('@kotlinmania/libc-native-bindings').ftok(pathname, projId)") as KeyT

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').shmat(shmid, shmaddr?.value ?: 0L, shmflg)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmdt(shmaddr?.value ?: 0L)") as CInt

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmctl(shmid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmget(key, size, shmflg)") as CInt

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctlbyname(name, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun machAbsoluteTime(): ULong =
    js("require('@kotlinmania/libc-native-bindings').machAbsoluteTime()") as ULong

public actual fun machTimebaseInfo(info: io.github.kotlinmania.libc.MachTimebaseInfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').machTimebaseInfo(info?.toLong() ?: 0L)") as CInt

public actual fun machHostSelf(): MachPortT =
    js("require('@kotlinmania/libc-native-bindings').machHostSelf()") as MachPortT

public actual fun machThreadSelf(): MachPortT =
    js("require('@kotlinmania/libc-native-bindings').machThreadSelf()") as MachPortT

public actual fun pthreadCondTimedwaitRelativeNp(cond: PthreadCondT?, lock: PthreadMutexT?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondTimedwaitRelativeNp(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetscope(attr: PthreadAttrT?, contentionscope: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetscope(attr?.toLong() ?: 0L, contentionscope?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstackaddr(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L)") as CInt

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetdetachstate(attr?.toLong() ?: 0L, detachstate?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetscope(attr: PthreadAttrT?, contentionscope: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetscope(attr?.toLong() ?: 0L, contentionscope)") as CInt

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetstackaddr(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L)") as CInt

public actual fun pthreadSetnameNp(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetnameNp(name)") as CInt

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetnameNp(thread, name?.value ?: 0L, len)") as CInt

public actual fun pthreadMachThreadNp(thread: PthreadT): io.github.kotlinmania.libc.MachPortT =
    js("require('@kotlinmania/libc-native-bindings').pthreadMachThreadNp(thread)") as io.github.kotlinmania.libc.MachPortT

public actual fun pthreadFromMachThreadNp(port: io.github.kotlinmania.libc.MachPortT): PthreadT =
    js("require('@kotlinmania/libc-native-bindings').pthreadFromMachThreadNp(port)") as PthreadT

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetStackaddrNp(thread)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetStacksizeNp(thread)") as SizeT

public actual fun pthreadMainNp(): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMainNp()") as CInt

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadThreadidNp(thread, threadId?.toLong() ?: 0L)") as CInt

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    js("require('@kotlinmania/libc-native-bindings').pthreadJitWriteProtectNp(enabled)")
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadJitWriteProtectSupportedNp()") as CInt

public actual fun pthreadJitWriteWithCallbackNp(callback: io.github.kotlinmania.libc.PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadJitWriteWithCallbackNp(callback, ctx?.value ?: 0L)") as CInt

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    js("require('@kotlinmania/libc-native-bindings').pthreadJitWriteFreezeCallbacksNp()")
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCpuNumberNp(cpuNumberOut?.toLong() ?: 0L)") as CInt

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    js("require('@kotlinmania/libc-native-bindings').osSyncWaitOnAddress(addr?.value ?: 0L, value, size, flags)") as CInt

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').osSyncWaitOnAddressWithDeadline(addr?.value ?: 0L, value, size, flags, clockid, deadline)") as CInt

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').osSyncWaitOnAddressWithTimeout(addr?.value ?: 0L, value, size, flags, clockid, timeoutNs)") as CInt

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    js("require('@kotlinmania/libc-native-bindings').osSyncWakeByAddressAny(addr?.value ?: 0L, size, flags)") as CInt

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    js("require('@kotlinmania/libc-native-bindings').osSyncWakeByAddressAll(addr?.value ?: 0L, size, flags)") as CInt

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    js("require('@kotlinmania/libc-native-bindings').osUnfairLockLock(lock)")
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    js("require('@kotlinmania/libc-native-bindings').osUnfairLockTrylock(lock)") as Boolean

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    js("require('@kotlinmania/libc-native-bindings').osUnfairLockUnlock(lock)")
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    js("require('@kotlinmania/libc-native-bindings').osUnfairLockAssertOwner(lock)")
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    js("require('@kotlinmania/libc-native-bindings').osUnfairLockAssertNotOwner(lock)")
}

public actual fun osLogCreate(subsystem: String?, category: String?): io.github.kotlinmania.libc.OsLogT =
    js("require('@kotlinmania/libc-native-bindings').osLogCreate(subsystem, category)") as io.github.kotlinmania.libc.OsLogT

public actual fun osLogTypeEnabled(oslog: io.github.kotlinmania.libc.OsLogT, tpe: io.github.kotlinmania.libc.OsLogTypeT): Boolean =
    js("require('@kotlinmania/libc-native-bindings').osLogTypeEnabled(oslog, tpe)") as Boolean

public actual fun osSignpostIdMakeWithPointer(log: io.github.kotlinmania.libc.OsLogT, ptr: COpaquePointer?): io.github.kotlinmania.libc.OsSignpostIdT =
    js("require('@kotlinmania/libc-native-bindings').osSignpostIdMakeWithPointer(log, ptr?.value ?: 0L)") as io.github.kotlinmania.libc.OsSignpostIdT

public actual fun osSignpostIdGenerate(log: io.github.kotlinmania.libc.OsLogT): io.github.kotlinmania.libc.OsSignpostIdT =
    js("require('@kotlinmania/libc-native-bindings').osSignpostIdGenerate(log)") as io.github.kotlinmania.libc.OsSignpostIdT

public actual fun osSignpostEnabled(log: io.github.kotlinmania.libc.OsLogT): Boolean =
    js("require('@kotlinmania/libc-native-bindings').osSignpostEnabled(log)") as Boolean

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').threadPolicySet(thread, flavor, policyInfo, count)") as KernReturnT

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: UInt?, getDefault: BooleanT?): KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').threadPolicyGet(thread, flavor, policyInfo, count?.toLong() ?: 0L, getDefault?.toLong() ?: 0L)") as KernReturnT

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: UInt?): KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').threadInfo(targetAct, flavor, threadInfoOut, threadInfoOutCnt?.toLong() ?: 0L)") as KernReturnT

public actual fun error(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').error()") as CInt?

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').backtrace(buf?.value ?: 0L, sz)") as CInt

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbols(addrs?.value ?: 0L, sz)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbolsFd(addrs?.value ?: 0L, sz, fd)")
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').backtraceFromFp(startfp?.value ?: 0L, array?.value ?: 0L, size)") as CInt

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: CInt) {
    js("require('@kotlinmania/libc-native-bindings').backtraceImageOffsets(array?.value ?: 0L, imageOffsets?.toLong() ?: 0L, size)")
}

public actual fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: UInt?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').backtraceAsync(array?.value ?: 0L, length, taskId?.toLong() ?: 0L)") as SizeT

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').statfs(path, buf?.toLong() ?: 0L)") as CInt

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fstatfs(fd, buf?.toLong() ?: 0L)") as CInt

public actual fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kevent(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, timeout?.toLong() ?: 0L)") as CInt

public actual fun kevent64(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent64S?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent64S?, nevents: CInt, flags: CUint, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kevent64(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, flags, timeout?.toLong() ?: 0L)") as CInt

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mount(src, target, flags, data?.value ?: 0L)") as CInt

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fmount(src, fd, flags, data?.value ?: 0L)") as CInt

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptrace(request, pid, addr?.value ?: 0L, data)") as CInt

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').quotactl(special, cmd, id, data?.value ?: 0L)") as CInt

public actual fun sethostname(name: String?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: OffT?, hdtr: io.github.kotlinmania.libc.SfHdtr?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendfile(fd, s, offset, len?.toLong() ?: 0L, hdtr?.toLong() ?: 0L, flags)") as CInt

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    js("require('@kotlinmania/libc-native-bindings').forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as PidT

public actual fun loginTty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').loginTty(fd)") as CInt

public actual fun duplocale(base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(base)") as LocaleT

public actual fun freelocale(loc: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)") as CInt

public actual fun localeconvL(loc: LocaleT): Lconv? =
    js("require('@kotlinmania/libc-native-bindings').localeconvL(loc)") as Lconv?

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(mask, locale, base)") as LocaleT

public actual fun uselocale(loc: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').uselocale(loc)") as LocaleT

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').querylocale(mask, loc)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdomainname(name?.value ?: 0L, len)") as CInt

public actual fun setdomainname(name: String?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setdomainname(name, len)") as CInt

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getxattr(path, name, value?.value ?: 0L, size, position, flags)") as SsizeT

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').fgetxattr(filedes, name, value?.value ?: 0L, size, position, flags)") as SsizeT

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setxattr(path, name, value?.value ?: 0L, size, position, flags)") as CInt

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetxattr(filedes, name, value?.value ?: 0L, size, position, flags)") as CInt

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').listxattr(path, list?.value ?: 0L, size, flags)") as SsizeT

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').flistxattr(filedes, list?.value ?: 0L, size, flags)") as SsizeT

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').removexattr(path, name, flags)") as CInt

public actual fun renamexNp(from: String?, to: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').renamexNp(from, to, flags)") as CInt

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').renameatxNp(fromfd, from, tofd, to, flags)") as CInt

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fremovexattr(filedes, name, flags)") as CInt

public actual fun getgrouplist(name: String?, basegid: CInt, groups: CInt?, ngroups: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(name, basegid, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)") as CInt

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(user, basegroup)") as CInt

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').brk(addr?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sbrk(increment: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sbrk(increment)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun settimeofday(tv: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun dyldImageCount(): UInt =
    js("require('@kotlinmania/libc-native-bindings').dyldImageCount()") as UInt

public actual fun dyldGetImageHeader(imageIndex: UInt): MachHeader? =
    js("require('@kotlinmania/libc-native-bindings').dyldGetImageHeader(imageIndex)") as MachHeader?

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    js("require('@kotlinmania/libc-native-bindings').dyldGetImageVmaddrSlide(imageIndex)") as IntptrT

public actual fun dyldGetImageName(imageIndex: UInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dyldGetImageName(imageIndex)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrInit(attr?.value ?: 0L)") as CInt

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrDestroy(attr?.value ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigdefault(attr?.value ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigdefault(attr?.value ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigmask(attr?.value ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigmask(attr?.value ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetflags(attr?.value ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetflags(attr?.value ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetpgroup(attr?.value ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetpgroup(attr?.value ?: 0L, flags)") as CInt

public actual fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, subpref: CInt?, ocount: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetarchprefNp(attr?.value ?: 0L, count, pref?.toLong() ?: 0L, subpref?.toLong() ?: 0L, ocount?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, subpref: CInt?, ocount: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetarchprefNp(attr?.value ?: 0L, count, pref?.toLong() ?: 0L, subpref?.toLong() ?: 0L, ocount?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, ocount: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetbinprefNp(attr?.value ?: 0L, count, pref?.toLong() ?: 0L, ocount?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, ocount: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetbinprefNp(attr?.value ?: 0L, count, pref?.toLong() ?: 0L, ocount?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsInit(actions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsDestroy(actions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddopen(actions?.value ?: 0L, fd, path, oflag, mode)") as CInt

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclose(actions?.value ?: 0L, fd)") as CInt

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAdddup2(actions?.value ?: 0L, fd, newfd)") as CInt

public actual fun uname(buf: Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun connectx(socket: CInt, endpoints: SaEndpointsT?, associd: SaeAssocidT, flags: CUint, iov: Iovec?, iovcnt: CUint, len: SizeT?, connid: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').connectx(socket, endpoints?.toLong() ?: 0L, associd, flags, iov?.toLong() ?: 0L, iovcnt, len?.toLong() ?: 0L, connid?.toLong() ?: 0L)") as CInt

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').disconnectx(socket, associd, connid)") as CInt

public actual fun ntpAdjtime(buf: Timex?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ntpAdjtime(buf?.toLong() ?: 0L)") as CInt

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ntpGettime(buf?.toLong() ?: 0L)") as CInt

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getmntinfo(mntbufp?.value ?: 0L, flags)") as CInt

public actual fun getfsstat(mntbufp: Statfs?, bufsize: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getfsstat(mntbufp?.toLong() ?: 0L, bufsize, flags)") as CInt

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').clonefile(src, dst, flags)") as CInt

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').clonefileat(srcDirfd, src, dstDirfd, dst, flags)") as CInt

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fclonefileat(srcfd, dstDirfd, dst, flags)") as CInt

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    js("require('@kotlinmania/libc-native-bindings').copyfile(from, to, state, flags)") as CInt

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    js("require('@kotlinmania/libc-native-bindings').fcopyfile(from, to, state, flags)") as CInt

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    js("require('@kotlinmania/libc-native-bindings').copyfileStateFree(s)") as CInt

public actual fun copyfileStateAlloc(): CopyfileStateT =
    js("require('@kotlinmania/libc-native-bindings').copyfileStateAlloc()") as CopyfileStateT

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').copyfileStateGet(s, flags, dst?.value ?: 0L)") as CInt

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').copyfileStateSet(s, flags, src?.value ?: 0L)") as CInt

public actual fun machErrorString(errorValue: io.github.kotlinmania.libc.MachErrorT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').machErrorString(errorValue)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').memsetS(s?.value ?: 0L, smax, c, n)") as CInt

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').memsetPattern4(b?.value ?: 0L, pattern4?.value ?: 0L, len)")
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').memsetPattern8(b?.value ?: 0L, pattern8?.value ?: 0L, len)")
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').memsetPattern16(b?.value ?: 0L, pattern16?.value ?: 0L, len)")
}

public actual fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong =
    js("require('@kotlinmania/libc-native-bindings').strtonum(numstr, minval, maxval, errstrp?.value ?: 0L)") as CLonglong

public actual fun mstats(): Mstats =
    js("require('@kotlinmania/libc-native-bindings').mstats()") as Mstats

public actual fun mallocZoneCheck(zone: MallocZoneT?): BooleanT =
    js("require('@kotlinmania/libc-native-bindings').mallocZoneCheck(zone?.toLong() ?: 0L)") as BooleanT

public actual fun mallocZonePrint(zone: MallocZoneT?, verbose: BooleanT) {
    js("require('@kotlinmania/libc-native-bindings').mallocZonePrint(zone?.toLong() ?: 0L, verbose)")
}

public actual fun mallocZoneStatistics(zone: MallocZoneT?, stats: MallocStatisticsT?) {
    js("require('@kotlinmania/libc-native-bindings').mallocZoneStatistics(zone?.toLong() ?: 0L, stats?.toLong() ?: 0L)")
}

public actual fun mallocZoneLog(zone: MallocZoneT?, address: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').mallocZoneLog(zone?.toLong() ?: 0L, address?.value ?: 0L)")
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').mallocZonePrintPtrInfo(ptr?.value ?: 0L)")
}

public actual fun mallocDefaultZone(): MallocZoneT? =
    js("require('@kotlinmania/libc-native-bindings').mallocDefaultZone()") as MallocZoneT?

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): MallocZoneT? =
    js("require('@kotlinmania/libc-native-bindings').mallocZoneFromPtr(ptr?.value ?: 0L)") as MallocZoneT?

public actual fun mallocZoneMalloc(zone: MallocZoneT?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mallocZoneMalloc(zone?.toLong() ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneValloc(zone: MallocZoneT?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mallocZoneValloc(zone?.toLong() ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneCalloc(zone: MallocZoneT?, numItems: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mallocZoneCalloc(zone?.toLong() ?: 0L, numItems, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneRealloc(zone: MallocZoneT?, ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mallocZoneRealloc(zone?.toLong() ?: 0L, ptr?.value ?: 0L, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneFree(zone: MallocZoneT?, ptr: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').mallocZoneFree(zone?.toLong() ?: 0L, ptr?.value ?: 0L)")
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procListpids(t, typeinfo, buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procListallpids(buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procListpgrppids(pgrpid, buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procListchildpids(ppid, buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procPidinfo(pid, flavor, arg, buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procPidfdinfo(pid, fd, flavor, buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procPidfileportinfo(pid, fileport, flavor, buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procPidpath(pid, buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procName(pid, buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procRegionfilename(pid, address, buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procKmsgbuf(buffer?.value ?: 0L, buffersize)") as CInt

public actual fun procLibversion(major: CInt?, minor: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procLibversion(major?.toLong() ?: 0L, minor?.toLong() ?: 0L)") as CInt

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').procPidRusage(pid, flavor, buffer?.value ?: 0L)") as CInt

public actual fun procSetNoSmt(): CInt =
    js("require('@kotlinmania/libc-native-bindings').procSetNoSmt()") as CInt

public actual fun procSetthreadNoSmt(): CInt =
    js("require('@kotlinmania/libc-native-bindings').procSetthreadNoSmt()") as CInt

public actual fun procSetCsm(flags: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procSetCsm(flags)") as CInt

public actual fun procSetthreadCsm(flags: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').procSetthreadCsm(flags)") as CInt

public actual fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gethostuuid(id?.value ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun gethostid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').gethostid()") as CLong

public actual fun sethostid(hostid: CLong) {
    js("require('@kotlinmania/libc-native-bindings').sethostid(hostid)")
}

public actual fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): io.github.kotlinmania.libc.CCRNGStatus =
    js("require('@kotlinmania/libc-native-bindings').cCRandomGenerateBytes(bytes?.value ?: 0L, size)") as io.github.kotlinmania.libc.CCRNGStatus

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getentropy(buf?.value ?: 0L, buflen)") as CInt

public actual fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: UInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').nsgetExecutablePath(buf?.value ?: 0L, bufsize?.toLong() ?: 0L)") as CInt

public actual fun nsgetArgv(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nsgetArgv()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nsgetArgc(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').nsgetArgc()") as CInt?

public actual fun nsgetEnviron(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nsgetEnviron()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nsgetProgname(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nsgetProgname()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun machVmMap(targetTask: io.github.kotlinmania.libc.VmMapT, address: ULong?, size: io.github.kotlinmania.libc.MachVmSizeT, mask: io.github.kotlinmania.libc.MachVmOffsetT, flags: CInt, obj: io.github.kotlinmania.libc.MemEntryNamePortT, offset: io.github.kotlinmania.libc.MemoryObjectOffsetT, copy: BooleanT, curProtection: io.github.kotlinmania.libc.VmProtT, maxProtection: io.github.kotlinmania.libc.VmProtT, inheritance: io.github.kotlinmania.libc.VmInheritT): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').machVmMap(targetTask, address?.toLong() ?: 0L, size, mask, flags, obj, offset, copy, curProtection, maxProtection, inheritance)") as io.github.kotlinmania.libc.KernReturnT

public actual fun vmAllocate(targetTask: VmMapT, address: UintptrT?, size: VmSizeT, flags: CInt): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').vmAllocate(targetTask, address?.toLong() ?: 0L, size, flags)") as io.github.kotlinmania.libc.KernReturnT

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').vmDeallocate(targetTask, address, size)") as io.github.kotlinmania.libc.KernReturnT

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').hostStatistics64(hostPriv, flavor, hostInfo64Out, hostInfo64OutCnt?.toLong() ?: 0L)") as io.github.kotlinmania.libc.KernReturnT

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: UInt?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').hostProcessorInfo(host, flavor, outProcessorCount?.toLong() ?: 0L, outProcessorInfo?.value ?: 0L, outProcessorInfoCnt?.toLong() ?: 0L)") as io.github.kotlinmania.libc.KernReturnT

public actual fun taskForPid(host: io.github.kotlinmania.libc.MachPortT, pid: PidT, task: CUint?): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').taskForPid(host, pid, task?.toLong() ?: 0L)") as io.github.kotlinmania.libc.KernReturnT

public actual fun taskInfo(host: io.github.kotlinmania.libc.MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: UInt?): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').taskInfo(host, flavor, taskInfoOut, taskInfoCount?.toLong() ?: 0L)") as io.github.kotlinmania.libc.KernReturnT

public actual fun taskCreate(targetTask: io.github.kotlinmania.libc.TaskT, ledgers: io.github.kotlinmania.libc.LedgerArrayT, ledgersCnt: io.github.kotlinmania.libc.MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: CUint?): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').taskCreate(targetTask, ledgers, ledgersCnt, inheritMemory, childTask?.toLong() ?: 0L)") as io.github.kotlinmania.libc.KernReturnT

public actual fun taskTerminate(targetTask: io.github.kotlinmania.libc.TaskT): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').taskTerminate(targetTask)") as io.github.kotlinmania.libc.KernReturnT

public actual fun taskThreads(targetTask: io.github.kotlinmania.libc.TaskInspectT, actList: COpaquePointer?, actListCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').taskThreads(targetTask, actList?.value ?: 0L, actListCnt?.toLong() ?: 0L)") as io.github.kotlinmania.libc.KernReturnT

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').hostStatistics(hostPriv, flavor, hostInfoOut, hostInfoOutCnt?.toLong() ?: 0L)") as io.github.kotlinmania.libc.KernReturnT

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): io.github.kotlinmania.libc.SysdirSearchPathEnumerationState =
    js("require('@kotlinmania/libc-native-bindings').sysdirStartSearchPathEnumeration(dir, domainMask)") as io.github.kotlinmania.libc.SysdirSearchPathEnumerationState

public actual fun sysdirGetNextSearchPathEnumeration(state: io.github.kotlinmania.libc.SysdirSearchPathEnumerationState, path: COpaquePointer?): io.github.kotlinmania.libc.SysdirSearchPathEnumerationState =
    js("require('@kotlinmania/libc-native-bindings').sysdirGetNextSearchPathEnumeration(state, path?.value ?: 0L)") as io.github.kotlinmania.libc.SysdirSearchPathEnumerationState

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getattrlist(path, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)") as CInt

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetattrlist(fd, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)") as CInt

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').getattrlistat(fd, path, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)") as CInt

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setattrlist(path, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)") as CInt

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetattrlist(fd, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)") as CInt

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setattrlistat(dirFd, path, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)") as CInt

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').getattrlistbulk(dirfd, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)") as CInt

public actual fun mallocSize(ptr: COpaquePointer?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mallocSize(ptr?.value ?: 0L)") as SizeT

public actual fun mallocGoodSize(size: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mallocGoodSize(size)") as SizeT

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dirname(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').basename(path?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifoat(dirfd, pathname, mode)") as CInt

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknodat(dirfd, pathname, mode, dev)") as CInt

public actual fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').freadlink(fd, buf?.value ?: 0L, size)") as CInt

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvP(file, searchPath, argv?.value ?: 0L)") as CInt

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    js("require('@kotlinmania/libc-native-bindings').qsortR(base?.value ?: 0L, num, size, arg?.value ?: 0L, compar?.toLong() ?: 0L)")
}

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clockId, tp?.toLong() ?: 0L)") as CInt

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun taskSetInfo(targetTask: io.github.kotlinmania.libc.TaskT, flavor: io.github.kotlinmania.libc.TaskFlavorT, taskInfoIn: io.github.kotlinmania.libc.TaskInfoT, taskInfoInCnt: io.github.kotlinmania.libc.MachMsgTypeNumberT): io.github.kotlinmania.libc.KernReturnT =
    js("require('@kotlinmania/libc-native-bindings').taskSetInfo(targetTask, flavor, taskInfoIn, taskInfoInCnt)") as io.github.kotlinmania.libc.KernReturnT

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    js("require('@kotlinmania/libc-native-bindings').iconvOpen(tocode, fromcode)") as IconvT

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)") as SizeT

public actual fun iconvClose(cd: IconvT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iconvClose(cd)") as CInt
