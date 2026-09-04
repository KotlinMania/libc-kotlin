// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent requires N-API addon")
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun chflags(path: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("chflags requires N-API addon")

public actual fun fchflags(fd: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("fchflags requires N-API addon")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires N-API addon")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires N-API addon")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime requires N-API addon")

public actual fun ctime(clock: TimeT?): String? =
    throw UnsupportedOperationException("ctime requires N-API addon")

public actual fun getdate(datestr: String?): Tm? =
    throw UnsupportedOperationException("getdate requires N-API addon")

public actual fun strptime(buf: String?, format: String?, timeptr: Tm?): String? =
    throw UnsupportedOperationException("strptime requires N-API addon")

public actual fun asctimeR(tm: Tm?, result: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctimeR(clock: TimeT?, result: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore requires N-API addon")

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: ULong?): CInt =
    throw UnsupportedOperationException("sysctlnametomib requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    throw UnsupportedOperationException("semget requires N-API addon")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl requires N-API addon")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop requires N-API addon")

public actual fun shmOpen(name: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl requires N-API addon")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctlbyname requires N-API addon")

public actual fun machAbsoluteTime(): ULong =
    throw UnsupportedOperationException("machAbsoluteTime requires N-API addon")

public actual fun machTimebaseInfo(info: MachTimebaseInfo?): CInt =
    throw UnsupportedOperationException("machTimebaseInfo requires N-API addon")

public actual fun pthreadCondTimedwaitRelativeNp(cond: PthreadCondT, lock: PthreadMutexT, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwaitRelativeNp requires N-API addon")

public actual fun pthreadAttrGetscope(attr: PthreadAttrT, contentionscope: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetscope requires N-API addon")

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr requires N-API addon")

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT, detachstate: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate requires N-API addon")

public actual fun pthreadAttrSetscope(attr: PthreadAttrT, contentionscope: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetscope requires N-API addon")

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr requires N-API addon")

public actual fun pthreadSetnameNp(name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp requires N-API addon")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetStackaddrNp requires N-API addon")

public actual fun pthreadGetStacksizeNp(thread: PthreadT): ULong =
    throw UnsupportedOperationException("pthreadGetStacksizeNp requires N-API addon")

public actual fun pthreadMainNp(): CInt =
    throw UnsupportedOperationException("pthreadMainNp requires N-API addon")

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: ULong?): CInt =
    throw UnsupportedOperationException("pthreadThreadidNp requires N-API addon")

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    throw UnsupportedOperationException("pthreadJitWriteProtectNp requires N-API addon")
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    throw UnsupportedOperationException("pthreadJitWriteProtectSupportedNp requires N-API addon")

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJitWriteWithCallbackNp requires N-API addon")

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    throw UnsupportedOperationException("pthreadJitWriteFreezeCallbacksNp requires N-API addon")
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: ULong?): CInt =
    throw UnsupportedOperationException("pthreadCpuNumberNp requires N-API addon")

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT): CInt =
    throw UnsupportedOperationException("osSyncWaitOnAddress requires N-API addon")

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithDeadline requires N-API addon")

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithTimeout requires N-API addon")

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: ULong, flags: OsSyncWakeByAddressFlagsT): CInt =
    throw UnsupportedOperationException("osSyncWakeByAddressAny requires N-API addon")

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: ULong, flags: OsSyncWakeByAddressFlagsT): CInt =
    throw UnsupportedOperationException("osSyncWakeByAddressAll requires N-API addon")

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockLock requires N-API addon")
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    throw UnsupportedOperationException("osUnfairLockTrylock requires N-API addon")

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockUnlock requires N-API addon")
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockAssertOwner requires N-API addon")
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockAssertNotOwner requires N-API addon")
}

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    throw UnsupportedOperationException("osLogTypeEnabled requires N-API addon")

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    throw UnsupportedOperationException("osSignpostEnabled requires N-API addon")

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    throw UnsupportedOperationException("threadPolicySet requires N-API addon")

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT?, getDefault: BooleanT?): KernReturnT =
    throw UnsupportedOperationException("threadPolicyGet requires N-API addon")

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("threadInfo requires N-API addon")

public actual fun error(): CInt? =
    throw UnsupportedOperationException("error requires N-API addon")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    throw UnsupportedOperationException("backtrace requires N-API addon")

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires N-API addon")

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    throw UnsupportedOperationException("backtraceSymbolsFd requires N-API addon")
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    throw UnsupportedOperationException("backtraceFromFp requires N-API addon")

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: CInt) {
    throw UnsupportedOperationException("backtraceImageOffsets requires N-API addon")
}

public actual fun backtraceAsync(array: COpaquePointer?, length: ULong, taskId: UInt?): ULong =
    throw UnsupportedOperationException("backtraceAsync requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent requires N-API addon")

public actual fun kevent64(kq: CInt, changelist: Kevent64S?, nchanges: CInt, eventlist: Kevent64S?, nevents: CInt, flags: CUInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent64 requires N-API addon")

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fmount requires N-API addon")

public actual fun ptrace(request: CInt, pid: PidT, addr: String?, data: CInt): CInt =
    throw UnsupportedOperationException("ptrace requires N-API addon")

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: String?): CInt =
    throw UnsupportedOperationException("quotactl requires N-API addon")

public actual fun sethostname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: OffT?, hdtr: SfHdtr?, flags: CInt): CInt =
    throw UnsupportedOperationException("sendfile requires N-API addon")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires N-API addon")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(loc: LocaleT): CInt =
    throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun localeconvL(loc: LocaleT): Lconv? =
    throw UnsupportedOperationException("localeconvL requires N-API addon")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun querylocale(mask: CInt, loc: LocaleT): String? =
    throw UnsupportedOperationException("querylocale requires N-API addon")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun getdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun setdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("setdomainname requires N-API addon")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("getxattr requires N-API addon")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("fgetxattr requires N-API addon")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): CInt =
    throw UnsupportedOperationException("setxattr requires N-API addon")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): CInt =
    throw UnsupportedOperationException("fsetxattr requires N-API addon")

public actual fun listxattr(path: String?, list: String?, size: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("listxattr requires N-API addon")

public actual fun flistxattr(filedes: CInt, list: String?, size: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("flistxattr requires N-API addon")

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("removexattr requires N-API addon")

public actual fun renamexNp(from: String?, to: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renamexNp requires N-API addon")

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renameatxNp requires N-API addon")

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("fremovexattr requires N-API addon")

public actual fun getgrouplist(name: String?, basegid: CInt, groups: CInt?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("brk requires N-API addon")

public actual fun sbrk(increment: CInt): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun dyldGetImageHeader(imageIndex: UInt): MachHeader? =
    throw UnsupportedOperationException("dyldGetImageHeader requires N-API addon")

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    throw UnsupportedOperationException("dyldGetImageVmaddrSlide requires N-API addon")

public actual fun dyldGetImageName(imageIndex: UInt): String? =
    throw UnsupportedOperationException("dyldGetImageName requires N-API addon")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp requires N-API addon")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit requires N-API addon")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires N-API addon")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires N-API addon")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires N-API addon")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires N-API addon")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires N-API addon")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires N-API addon")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires N-API addon")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires N-API addon")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires N-API addon")

public actual fun posixSpawnattrSetarchprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, subpref: CpuSubtypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetarchprefNp requires N-API addon")

public actual fun posixSpawnattrGetarchprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, subpref: CpuSubtypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetarchprefNp requires N-API addon")

public actual fun posixSpawnattrGetbinprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetbinprefNp requires N-API addon")

public actual fun posixSpawnattrSetbinprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetbinprefNp requires N-API addon")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun connectx(socket: CInt, endpoints: SaEndpointsT?, associd: SaeAssocidT, flags: CUInt, iov: Iovec?, iovcnt: CUInt, len: ULong?, connid: SaeConnidT?): CInt =
    throw UnsupportedOperationException("connectx requires N-API addon")

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    throw UnsupportedOperationException("disconnectx requires N-API addon")

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime requires N-API addon")

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime requires N-API addon")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo requires N-API addon")

public actual fun getfsstat(mntbufp: Statfs?, bufsize: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("getfsstat requires N-API addon")

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    throw UnsupportedOperationException("clonefile requires N-API addon")

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    throw UnsupportedOperationException("clonefileat requires N-API addon")

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    throw UnsupportedOperationException("fclonefileat requires N-API addon")

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    throw UnsupportedOperationException("copyfile requires N-API addon")

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    throw UnsupportedOperationException("fcopyfile requires N-API addon")

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    throw UnsupportedOperationException("copyfileStateFree requires N-API addon")

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    throw UnsupportedOperationException("copyfileStateGet requires N-API addon")

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    throw UnsupportedOperationException("copyfileStateSet requires N-API addon")

public actual fun machErrorString(errorValue: MachErrorT): String? =
    throw UnsupportedOperationException("machErrorString requires N-API addon")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt =
    throw UnsupportedOperationException("memsetS requires N-API addon")

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("memsetPattern4 requires N-API addon")
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("memsetPattern8 requires N-API addon")
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("memsetPattern16 requires N-API addon")
}

public actual fun strtonum(numstr: String?, minval: CLongLong, maxval: CLongLong, errstrp: COpaquePointer?): CLongLong =
    throw UnsupportedOperationException("strtonum requires N-API addon")

public actual fun mallocPrintf(format: String?, vararg args: Any?) {
    throw UnsupportedOperationException("mallocPrintf requires N-API addon")
}

public actual fun mallocZoneCheck(zone: MallocZoneT): BooleanT =
    throw UnsupportedOperationException("mallocZoneCheck requires N-API addon")

public actual fun mallocZonePrint(zone: MallocZoneT, verbose: BooleanT) {
    throw UnsupportedOperationException("mallocZonePrint requires N-API addon")
}

public actual fun mallocZoneStatistics(zone: MallocZoneT, stats: MallocStatisticsT?) {
    throw UnsupportedOperationException("mallocZoneStatistics requires N-API addon")
}

public actual fun mallocZoneLog(zone: MallocZoneT, address: COpaquePointer?) {
    throw UnsupportedOperationException("mallocZoneLog requires N-API addon")
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("mallocZonePrintPtrInfo requires N-API addon")
}

public actual fun mallocDefaultZone(): MallocZoneT =
    throw UnsupportedOperationException("mallocDefaultZone requires N-API addon")

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): MallocZoneT =
    throw UnsupportedOperationException("mallocZoneFromPtr requires N-API addon")

public actual fun mallocZoneMalloc(zone: MallocZoneT, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneMalloc requires N-API addon")

public actual fun mallocZoneValloc(zone: MallocZoneT, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneValloc requires N-API addon")

public actual fun mallocZoneCalloc(zone: MallocZoneT, numItems: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneCalloc requires N-API addon")

public actual fun mallocZoneRealloc(zone: MallocZoneT, ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneRealloc requires N-API addon")

public actual fun mallocZoneFree(zone: MallocZoneT, ptr: COpaquePointer?) {
    throw UnsupportedOperationException("mallocZoneFree requires N-API addon")
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListpids requires N-API addon")

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListallpids requires N-API addon")

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListpgrppids requires N-API addon")

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListchildpids requires N-API addon")

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procPidinfo requires N-API addon")

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procPidfdinfo requires N-API addon")

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procPidfileportinfo requires N-API addon")

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procPidpath requires N-API addon")

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procName requires N-API addon")

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procRegionfilename requires N-API addon")

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procKmsgbuf requires N-API addon")

public actual fun procLibversion(major: CInt?, minor: CInt?): CInt =
    throw UnsupportedOperationException("procLibversion requires N-API addon")

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: RusageInfoT): CInt =
    throw UnsupportedOperationException("procPidRusage requires N-API addon")

public actual fun procSetNoSmt(): CInt =
    throw UnsupportedOperationException("procSetNoSmt requires N-API addon")

public actual fun procSetthreadNoSmt(): CInt =
    throw UnsupportedOperationException("procSetthreadNoSmt requires N-API addon")

public actual fun procSetCsm(flags: UInt): CInt =
    throw UnsupportedOperationException("procSetCsm requires N-API addon")

public actual fun procSetthreadCsm(flags: UInt): CInt =
    throw UnsupportedOperationException("procSetthreadCsm requires N-API addon")

public actual fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("gethostuuid requires N-API addon")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun sethostid(hostid: CLong) {
    throw UnsupportedOperationException("sethostid requires N-API addon")
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun nSGetExecutablePath(buf: String?, bufsize: UInt?): CInt =
    throw UnsupportedOperationException("nSGetExecutablePath requires N-API addon")

public actual fun nSGetArgv(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetArgv requires N-API addon")

public actual fun nSGetArgc(): CInt? =
    throw UnsupportedOperationException("nSGetArgc requires N-API addon")

public actual fun nSGetEnviron(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetEnviron requires N-API addon")

public actual fun nSGetProgname(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetProgname requires N-API addon")

public actual fun machVmMap(targetTask: VmMapT, address: MachVmAddressT?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, `object`: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    throw UnsupportedOperationException("machVmMap requires N-API addon")

public actual fun vmAllocate(targetTask: VmMapT, address: VmAddressT?, size: VmSizeT, flags: CInt): KernReturnT =
    throw UnsupportedOperationException("vmAllocate requires N-API addon")

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    throw UnsupportedOperationException("vmDeallocate requires N-API addon")

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("hostStatistics64 requires N-API addon")

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: NaturalT?, outProcessorInfo: ProcessorInfoArrayT, outProcessorInfoCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("hostProcessorInfo requires N-API addon")

public actual fun taskForPid(host: MachPortT, pid: PidT, task: MachPortT?): KernReturnT =
    throw UnsupportedOperationException("taskForPid requires N-API addon")

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("taskInfo requires N-API addon")

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: TaskT?): KernReturnT =
    throw UnsupportedOperationException("taskCreate requires N-API addon")

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    throw UnsupportedOperationException("taskTerminate requires N-API addon")

public actual fun taskThreads(targetTask: TaskInspectT, actList: ThreadActArrayT, actListCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("taskThreads requires N-API addon")

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("hostStatistics requires N-API addon")

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("getattrlist requires N-API addon")

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("fgetattrlist requires N-API addon")

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: CULong): CInt =
    throw UnsupportedOperationException("getattrlistat requires N-API addon")

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("setattrlist requires N-API addon")

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("fsetattrlist requires N-API addon")

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("setattrlistat requires N-API addon")

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): CInt =
    throw UnsupportedOperationException("getattrlistbulk requires N-API addon")

public actual fun mallocSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocSize requires N-API addon")

public actual fun mallocGoodSize(size: ULong): ULong =
    throw UnsupportedOperationException("mallocGoodSize requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun freadlink(fd: CInt, buf: String?, size: ULong): CInt =
    throw UnsupportedOperationException("freadlink requires N-API addon")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvP requires N-API addon")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    throw UnsupportedOperationException("taskSetInfo requires N-API addon")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires N-API addon")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose requires N-API addon")

