// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires manual FFI bridge — not yet implemented")
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon requires manual FFI bridge — not yet implemented")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires manual FFI bridge — not yet implemented")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun chflags(path: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("chflags requires manual FFI bridge — not yet implemented")

public actual fun fchflags(fd: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("fchflags requires manual FFI bridge — not yet implemented")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires manual FFI bridge — not yet implemented")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires manual FFI bridge — not yet implemented")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires manual FFI bridge — not yet implemented")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires manual FFI bridge — not yet implemented")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires manual FFI bridge — not yet implemented")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires manual FFI bridge — not yet implemented")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires manual FFI bridge — not yet implemented")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires manual FFI bridge — not yet implemented")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires manual FFI bridge — not yet implemented")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires manual FFI bridge — not yet implemented")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires manual FFI bridge — not yet implemented")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime requires manual FFI bridge — not yet implemented")

public actual fun ctime(clock: TimeT?): String? =
    throw UnsupportedOperationException("ctime requires manual FFI bridge — not yet implemented")

public actual fun getdate(datestr: String?): Tm? =
    throw UnsupportedOperationException("getdate requires manual FFI bridge — not yet implemented")

public actual fun strptime(buf: String?, format: String?, timeptr: Tm?): String? =
    throw UnsupportedOperationException("strptime requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(tm: Tm?, result: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun ctimeR(clock: TimeT?, result: String?): String? =
    throw UnsupportedOperationException("ctimeR requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore requires manual FFI bridge — not yet implemented")

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: ULong?): CInt =
    throw UnsupportedOperationException("sysctlnametomib requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires manual FFI bridge — not yet implemented")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    throw UnsupportedOperationException("semget requires manual FFI bridge — not yet implemented")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl requires manual FFI bridge — not yet implemented")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop requires manual FFI bridge — not yet implemented")

public actual fun shmOpen(name: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("shmOpen requires manual FFI bridge — not yet implemented")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires manual FFI bridge — not yet implemented")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt requires manual FFI bridge — not yet implemented")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl requires manual FFI bridge — not yet implemented")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctlbyname requires manual FFI bridge — not yet implemented")

public actual fun machAbsoluteTime(): ULong =
    throw UnsupportedOperationException("machAbsoluteTime requires manual FFI bridge — not yet implemented")

public actual fun machTimebaseInfo(info: MachTimebaseInfo?): CInt =
    throw UnsupportedOperationException("machTimebaseInfo requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondTimedwaitRelativeNp(cond: PthreadCondT, lock: PthreadMutexT, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwaitRelativeNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetscope(attr: PthreadAttrT, contentionscope: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetscope requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT, detachstate: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetscope(attr: PthreadAttrT, contentionscope: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetscope requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetStackaddrNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetStacksizeNp(thread: PthreadT): ULong =
    throw UnsupportedOperationException("pthreadGetStacksizeNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadMainNp(): CInt =
    throw UnsupportedOperationException("pthreadMainNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: ULong?): CInt =
    throw UnsupportedOperationException("pthreadThreadidNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    throw UnsupportedOperationException("pthreadJitWriteProtectNp requires manual FFI bridge — not yet implemented")
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    throw UnsupportedOperationException("pthreadJitWriteProtectSupportedNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJitWriteWithCallbackNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    throw UnsupportedOperationException("pthreadJitWriteFreezeCallbacksNp requires manual FFI bridge — not yet implemented")
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: ULong?): CInt =
    throw UnsupportedOperationException("pthreadCpuNumberNp requires manual FFI bridge — not yet implemented")

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT): CInt =
    throw UnsupportedOperationException("osSyncWaitOnAddress requires manual FFI bridge — not yet implemented")

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithDeadline requires manual FFI bridge — not yet implemented")

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithTimeout requires manual FFI bridge — not yet implemented")

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: ULong, flags: OsSyncWakeByAddressFlagsT): CInt =
    throw UnsupportedOperationException("osSyncWakeByAddressAny requires manual FFI bridge — not yet implemented")

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: ULong, flags: OsSyncWakeByAddressFlagsT): CInt =
    throw UnsupportedOperationException("osSyncWakeByAddressAll requires manual FFI bridge — not yet implemented")

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockLock requires manual FFI bridge — not yet implemented")
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    throw UnsupportedOperationException("osUnfairLockTrylock requires manual FFI bridge — not yet implemented")

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockUnlock requires manual FFI bridge — not yet implemented")
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockAssertOwner requires manual FFI bridge — not yet implemented")
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockAssertNotOwner requires manual FFI bridge — not yet implemented")
}

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    throw UnsupportedOperationException("osLogTypeEnabled requires manual FFI bridge — not yet implemented")

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    throw UnsupportedOperationException("osSignpostEnabled requires manual FFI bridge — not yet implemented")

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    throw UnsupportedOperationException("threadPolicySet requires manual FFI bridge — not yet implemented")

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT?, getDefault: BooleanT?): KernReturnT =
    throw UnsupportedOperationException("threadPolicyGet requires manual FFI bridge — not yet implemented")

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("threadInfo requires manual FFI bridge — not yet implemented")

public actual fun error(): CInt? =
    throw UnsupportedOperationException("error requires manual FFI bridge — not yet implemented")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    throw UnsupportedOperationException("backtrace requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    throw UnsupportedOperationException("backtraceSymbolsFd requires manual FFI bridge — not yet implemented")
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    throw UnsupportedOperationException("backtraceFromFp requires manual FFI bridge — not yet implemented")

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: CInt) {
    throw UnsupportedOperationException("backtraceImageOffsets requires manual FFI bridge — not yet implemented")
}

public actual fun backtraceAsync(array: COpaquePointer?, length: ULong, taskId: UInt?): ULong =
    throw UnsupportedOperationException("backtraceAsync requires manual FFI bridge — not yet implemented")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent requires manual FFI bridge — not yet implemented")

public actual fun kevent64(kq: CInt, changelist: Kevent64S?, nchanges: CInt, eventlist: Kevent64S?, nevents: CInt, flags: CUInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent64 requires manual FFI bridge — not yet implemented")

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fmount requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: CInt, pid: PidT, addr: String?, data: CInt): CInt =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: String?): CInt =
    throw UnsupportedOperationException("quotactl requires manual FFI bridge — not yet implemented")

public actual fun sethostname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("sethostname requires manual FFI bridge — not yet implemented")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: OffT?, hdtr: SfHdtr?, flags: CInt): CInt =
    throw UnsupportedOperationException("sendfile requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires manual FFI bridge — not yet implemented")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires manual FFI bridge — not yet implemented")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: LocaleT): CInt =
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun localeconvL(loc: LocaleT): Lconv? =
    throw UnsupportedOperationException("localeconvL requires manual FFI bridge — not yet implemented")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun querylocale(mask: CInt, loc: LocaleT): String? =
    throw UnsupportedOperationException("querylocale requires manual FFI bridge — not yet implemented")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority requires manual FFI bridge — not yet implemented")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires manual FFI bridge — not yet implemented")

public actual fun getdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("getdomainname requires manual FFI bridge — not yet implemented")

public actual fun setdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("setdomainname requires manual FFI bridge — not yet implemented")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires manual FFI bridge — not yet implemented")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires manual FFI bridge — not yet implemented")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("getxattr requires manual FFI bridge — not yet implemented")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("fgetxattr requires manual FFI bridge — not yet implemented")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): CInt =
    throw UnsupportedOperationException("setxattr requires manual FFI bridge — not yet implemented")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): CInt =
    throw UnsupportedOperationException("fsetxattr requires manual FFI bridge — not yet implemented")

public actual fun listxattr(path: String?, list: String?, size: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("listxattr requires manual FFI bridge — not yet implemented")

public actual fun flistxattr(filedes: CInt, list: String?, size: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("flistxattr requires manual FFI bridge — not yet implemented")

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("removexattr requires manual FFI bridge — not yet implemented")

public actual fun renamexNp(from: String?, to: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renamexNp requires manual FFI bridge — not yet implemented")

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renameatxNp requires manual FFI bridge — not yet implemented")

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("fremovexattr requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(name: String?, basegid: CInt, groups: CInt?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires manual FFI bridge — not yet implemented")

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    throw UnsupportedOperationException("initgroups requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("brk requires manual FFI bridge — not yet implemented")

public actual fun sbrk(increment: CInt): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires manual FFI bridge — not yet implemented")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday requires manual FFI bridge — not yet implemented")

public actual fun dyldGetImageHeader(imageIndex: UInt): MachHeader? =
    throw UnsupportedOperationException("dyldGetImageHeader requires manual FFI bridge — not yet implemented")

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    throw UnsupportedOperationException("dyldGetImageVmaddrSlide requires manual FFI bridge — not yet implemented")

public actual fun dyldGetImageName(imageIndex: UInt): String? =
    throw UnsupportedOperationException("dyldGetImageName requires manual FFI bridge — not yet implemented")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetarchprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, subpref: CpuSubtypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetarchprefNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetarchprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, subpref: CpuSubtypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetarchprefNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetbinprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetbinprefNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetbinprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetbinprefNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires manual FFI bridge — not yet implemented")

public actual fun connectx(socket: CInt, endpoints: SaEndpointsT?, associd: SaeAssocidT, flags: CUInt, iov: Iovec?, iovcnt: CUInt, len: ULong?, connid: SaeConnidT?): CInt =
    throw UnsupportedOperationException("connectx requires manual FFI bridge — not yet implemented")

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    throw UnsupportedOperationException("disconnectx requires manual FFI bridge — not yet implemented")

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime requires manual FFI bridge — not yet implemented")

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime requires manual FFI bridge — not yet implemented")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo requires manual FFI bridge — not yet implemented")

public actual fun getfsstat(mntbufp: Statfs?, bufsize: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("getfsstat requires manual FFI bridge — not yet implemented")

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    throw UnsupportedOperationException("clonefile requires manual FFI bridge — not yet implemented")

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    throw UnsupportedOperationException("clonefileat requires manual FFI bridge — not yet implemented")

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    throw UnsupportedOperationException("fclonefileat requires manual FFI bridge — not yet implemented")

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    throw UnsupportedOperationException("copyfile requires manual FFI bridge — not yet implemented")

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    throw UnsupportedOperationException("fcopyfile requires manual FFI bridge — not yet implemented")

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    throw UnsupportedOperationException("copyfileStateFree requires manual FFI bridge — not yet implemented")

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    throw UnsupportedOperationException("copyfileStateGet requires manual FFI bridge — not yet implemented")

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    throw UnsupportedOperationException("copyfileStateSet requires manual FFI bridge — not yet implemented")

public actual fun machErrorString(errorValue: MachErrorT): String? =
    throw UnsupportedOperationException("machErrorString requires manual FFI bridge — not yet implemented")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt =
    throw UnsupportedOperationException("memsetS requires manual FFI bridge — not yet implemented")

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("memsetPattern4 requires manual FFI bridge — not yet implemented")
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("memsetPattern8 requires manual FFI bridge — not yet implemented")
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("memsetPattern16 requires manual FFI bridge — not yet implemented")
}

public actual fun strtonum(numstr: String?, minval: CLongLong, maxval: CLongLong, errstrp: COpaquePointer?): CLongLong =
    throw UnsupportedOperationException("strtonum requires manual FFI bridge — not yet implemented")

public actual fun mallocPrintf(format: String?, vararg args: Any?) {
    throw UnsupportedOperationException("mallocPrintf requires manual FFI bridge — not yet implemented")
}

public actual fun mallocZoneCheck(zone: MallocZoneT): BooleanT =
    throw UnsupportedOperationException("mallocZoneCheck requires manual FFI bridge — not yet implemented")

public actual fun mallocZonePrint(zone: MallocZoneT, verbose: BooleanT) {
    throw UnsupportedOperationException("mallocZonePrint requires manual FFI bridge — not yet implemented")
}

public actual fun mallocZoneStatistics(zone: MallocZoneT, stats: MallocStatisticsT?) {
    throw UnsupportedOperationException("mallocZoneStatistics requires manual FFI bridge — not yet implemented")
}

public actual fun mallocZoneLog(zone: MallocZoneT, address: COpaquePointer?) {
    throw UnsupportedOperationException("mallocZoneLog requires manual FFI bridge — not yet implemented")
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("mallocZonePrintPtrInfo requires manual FFI bridge — not yet implemented")
}

public actual fun mallocDefaultZone(): MallocZoneT =
    throw UnsupportedOperationException("mallocDefaultZone requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): MallocZoneT =
    throw UnsupportedOperationException("mallocZoneFromPtr requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneMalloc(zone: MallocZoneT, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneMalloc requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneValloc(zone: MallocZoneT, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneValloc requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneCalloc(zone: MallocZoneT, numItems: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneCalloc requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneRealloc(zone: MallocZoneT, ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneRealloc requires manual FFI bridge — not yet implemented")

public actual fun mallocZoneFree(zone: MallocZoneT, ptr: COpaquePointer?) {
    throw UnsupportedOperationException("mallocZoneFree requires manual FFI bridge — not yet implemented")
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListpids requires manual FFI bridge — not yet implemented")

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListallpids requires manual FFI bridge — not yet implemented")

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListpgrppids requires manual FFI bridge — not yet implemented")

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListchildpids requires manual FFI bridge — not yet implemented")

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procPidinfo requires manual FFI bridge — not yet implemented")

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procPidfdinfo requires manual FFI bridge — not yet implemented")

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procPidfileportinfo requires manual FFI bridge — not yet implemented")

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procPidpath requires manual FFI bridge — not yet implemented")

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procName requires manual FFI bridge — not yet implemented")

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procRegionfilename requires manual FFI bridge — not yet implemented")

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procKmsgbuf requires manual FFI bridge — not yet implemented")

public actual fun procLibversion(major: CInt?, minor: CInt?): CInt =
    throw UnsupportedOperationException("procLibversion requires manual FFI bridge — not yet implemented")

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: RusageInfoT): CInt =
    throw UnsupportedOperationException("procPidRusage requires manual FFI bridge — not yet implemented")

public actual fun procSetNoSmt(): CInt =
    throw UnsupportedOperationException("procSetNoSmt requires manual FFI bridge — not yet implemented")

public actual fun procSetthreadNoSmt(): CInt =
    throw UnsupportedOperationException("procSetthreadNoSmt requires manual FFI bridge — not yet implemented")

public actual fun procSetCsm(flags: UInt): CInt =
    throw UnsupportedOperationException("procSetCsm requires manual FFI bridge — not yet implemented")

public actual fun procSetthreadCsm(flags: UInt): CInt =
    throw UnsupportedOperationException("procSetthreadCsm requires manual FFI bridge — not yet implemented")

public actual fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("gethostuuid requires manual FFI bridge — not yet implemented")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid requires manual FFI bridge — not yet implemented")

public actual fun sethostid(hostid: CLong) {
    throw UnsupportedOperationException("sethostid requires manual FFI bridge — not yet implemented")
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy requires manual FFI bridge — not yet implemented")

public actual fun nSGetExecutablePath(buf: String?, bufsize: UInt?): CInt =
    throw UnsupportedOperationException("nSGetExecutablePath requires manual FFI bridge — not yet implemented")

public actual fun nSGetArgv(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetArgv requires manual FFI bridge — not yet implemented")

public actual fun nSGetArgc(): CInt? =
    throw UnsupportedOperationException("nSGetArgc requires manual FFI bridge — not yet implemented")

public actual fun nSGetEnviron(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetEnviron requires manual FFI bridge — not yet implemented")

public actual fun nSGetProgname(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetProgname requires manual FFI bridge — not yet implemented")

public actual fun machVmMap(targetTask: VmMapT, address: MachVmAddressT?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, `object`: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    throw UnsupportedOperationException("machVmMap requires manual FFI bridge — not yet implemented")

public actual fun vmAllocate(targetTask: VmMapT, address: VmAddressT?, size: VmSizeT, flags: CInt): KernReturnT =
    throw UnsupportedOperationException("vmAllocate requires manual FFI bridge — not yet implemented")

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    throw UnsupportedOperationException("vmDeallocate requires manual FFI bridge — not yet implemented")

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("hostStatistics64 requires manual FFI bridge — not yet implemented")

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: NaturalT?, outProcessorInfo: ProcessorInfoArrayT, outProcessorInfoCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("hostProcessorInfo requires manual FFI bridge — not yet implemented")

public actual fun taskForPid(host: MachPortT, pid: PidT, task: MachPortT?): KernReturnT =
    throw UnsupportedOperationException("taskForPid requires manual FFI bridge — not yet implemented")

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("taskInfo requires manual FFI bridge — not yet implemented")

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: TaskT?): KernReturnT =
    throw UnsupportedOperationException("taskCreate requires manual FFI bridge — not yet implemented")

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    throw UnsupportedOperationException("taskTerminate requires manual FFI bridge — not yet implemented")

public actual fun taskThreads(targetTask: TaskInspectT, actList: ThreadActArrayT, actListCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("taskThreads requires manual FFI bridge — not yet implemented")

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("hostStatistics requires manual FFI bridge — not yet implemented")

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("getattrlist requires manual FFI bridge — not yet implemented")

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("fgetattrlist requires manual FFI bridge — not yet implemented")

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: CULong): CInt =
    throw UnsupportedOperationException("getattrlistat requires manual FFI bridge — not yet implemented")

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("setattrlist requires manual FFI bridge — not yet implemented")

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("fsetattrlist requires manual FFI bridge — not yet implemented")

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("setattrlistat requires manual FFI bridge — not yet implemented")

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): CInt =
    throw UnsupportedOperationException("getattrlistbulk requires manual FFI bridge — not yet implemented")

public actual fun mallocSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocSize requires manual FFI bridge — not yet implemented")

public actual fun mallocGoodSize(size: ULong): ULong =
    throw UnsupportedOperationException("mallocGoodSize requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires manual FFI bridge — not yet implemented")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires manual FFI bridge — not yet implemented")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat requires manual FFI bridge — not yet implemented")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat requires manual FFI bridge — not yet implemented")

public actual fun freadlink(fd: CInt, buf: String?, size: ULong): CInt =
    throw UnsupportedOperationException("freadlink requires manual FFI bridge — not yet implemented")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvP requires manual FFI bridge — not yet implemented")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires manual FFI bridge — not yet implemented")

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    throw UnsupportedOperationException("taskSetInfo requires manual FFI bridge — not yet implemented")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires manual FFI bridge — not yet implemented")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose requires manual FFI bridge — not yet implemented")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?) {
    throw UnsupportedOperationException("qsortR requires manual FFI bridge — not yet implemented")
}
