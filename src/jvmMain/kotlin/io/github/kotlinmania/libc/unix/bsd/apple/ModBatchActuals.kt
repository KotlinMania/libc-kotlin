// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on JVM — no C library access")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on JVM — no C library access")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent not available on JVM — no C library access")
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon not available on JVM — no C library access")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy not available on JVM — no C library access")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit not available on JVM — no C library access")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead not available on JVM — no C library access")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite not available on JVM — no C library access")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync not available on JVM — no C library access")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError not available on JVM — no C library access")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn not available on JVM — no C library access")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend not available on JVM — no C library access")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel not available on JVM — no C library access")

public actual fun chflags(path: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("chflags not available on JVM — no C library access")

public actual fun fchflags(fd: CInt, flags: CUInt): CInt =
    throw UnsupportedOperationException("fchflags not available on JVM — no C library access")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres not available on JVM — no C library access")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on JVM — no C library access")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio not available on JVM — no C library access")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on JVM — no C library access")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on JVM — no C library access")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on JVM — no C library access")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on JVM — no C library access")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on JVM — no C library access")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent not available on JVM — no C library access")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent not available on JVM — no C library access")
}

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname not available on JVM — no C library access")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime not available on JVM — no C library access")

public actual fun ctime(clock: TimeT?): String? =
    throw UnsupportedOperationException("ctime not available on JVM — no C library access")

public actual fun getdate(datestr: String?): Tm? =
    throw UnsupportedOperationException("getdate not available on JVM — no C library access")

public actual fun strptime(buf: String?, format: String?, timeptr: Tm?): String? =
    throw UnsupportedOperationException("strptime not available on JVM — no C library access")

public actual fun asctimeR(tm: Tm?, result: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on JVM — no C library access")

public actual fun ctimeR(clock: TimeT?, result: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on JVM — no C library access")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore not available on JVM — no C library access")

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: ULong?): CInt =
    throw UnsupportedOperationException("sysctlnametomib not available on JVM — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    throw UnsupportedOperationException("semget not available on JVM — no C library access")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl not available on JVM — no C library access")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop not available on JVM — no C library access")

public actual fun shmOpen(name: String?, oflag: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("shmOpen not available on JVM — no C library access")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on JVM — no C library access")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt not available on JVM — no C library access")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl not available on JVM — no C library access")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget not available on JVM — no C library access")

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl not available on JVM — no C library access")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctlbyname not available on JVM — no C library access")

public actual fun machAbsoluteTime(): ULong =
    throw UnsupportedOperationException("machAbsoluteTime not available on JVM — no C library access")

public actual fun machTimebaseInfo(info: MachTimebaseInfo?): CInt =
    throw UnsupportedOperationException("machTimebaseInfo not available on JVM — no C library access")

public actual fun pthreadCondTimedwaitRelativeNp(cond: PthreadCondT, lock: PthreadMutexT, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadCondTimedwaitRelativeNp not available on JVM — no C library access")

public actual fun pthreadAttrGetscope(attr: PthreadAttrT, contentionscope: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetscope not available on JVM — no C library access")

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr not available on JVM — no C library access")

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT, detachstate: CInt?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate not available on JVM — no C library access")

public actual fun pthreadAttrSetscope(attr: PthreadAttrT, contentionscope: CInt): CInt =
    throw UnsupportedOperationException("pthreadAttrSetscope not available on JVM — no C library access")

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT, stackaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr not available on JVM — no C library access")

public actual fun pthreadSetnameNp(name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp not available on JVM — no C library access")

public actual fun pthreadGetnameNp(thread: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp not available on JVM — no C library access")

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetStackaddrNp not available on JVM — no C library access")

public actual fun pthreadGetStacksizeNp(thread: PthreadT): ULong =
    throw UnsupportedOperationException("pthreadGetStacksizeNp not available on JVM — no C library access")

public actual fun pthreadMainNp(): CInt =
    throw UnsupportedOperationException("pthreadMainNp not available on JVM — no C library access")

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: ULong?): CInt =
    throw UnsupportedOperationException("pthreadThreadidNp not available on JVM — no C library access")

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    throw UnsupportedOperationException("pthreadJitWriteProtectNp not available on JVM — no C library access")
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    throw UnsupportedOperationException("pthreadJitWriteProtectSupportedNp not available on JVM — no C library access")

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadJitWriteWithCallbackNp not available on JVM — no C library access")

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    throw UnsupportedOperationException("pthreadJitWriteFreezeCallbacksNp not available on JVM — no C library access")
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: ULong?): CInt =
    throw UnsupportedOperationException("pthreadCpuNumberNp not available on JVM — no C library access")

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT): CInt =
    throw UnsupportedOperationException("osSyncWaitOnAddress not available on JVM — no C library access")

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithDeadline not available on JVM — no C library access")

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: ULong, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithTimeout not available on JVM — no C library access")

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: ULong, flags: OsSyncWakeByAddressFlagsT): CInt =
    throw UnsupportedOperationException("osSyncWakeByAddressAny not available on JVM — no C library access")

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: ULong, flags: OsSyncWakeByAddressFlagsT): CInt =
    throw UnsupportedOperationException("osSyncWakeByAddressAll not available on JVM — no C library access")

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockLock not available on JVM — no C library access")
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    throw UnsupportedOperationException("osUnfairLockTrylock not available on JVM — no C library access")

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockUnlock not available on JVM — no C library access")
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockAssertOwner not available on JVM — no C library access")
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    throw UnsupportedOperationException("osUnfairLockAssertNotOwner not available on JVM — no C library access")
}

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    throw UnsupportedOperationException("osLogTypeEnabled not available on JVM — no C library access")

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    throw UnsupportedOperationException("osSignpostEnabled not available on JVM — no C library access")

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    throw UnsupportedOperationException("threadPolicySet not available on JVM — no C library access")

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT?, getDefault: BooleanT?): KernReturnT =
    throw UnsupportedOperationException("threadPolicyGet not available on JVM — no C library access")

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("threadInfo not available on JVM — no C library access")

public actual fun error(): CInt? =
    throw UnsupportedOperationException("error not available on JVM — no C library access")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    throw UnsupportedOperationException("backtrace not available on JVM — no C library access")

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on JVM — no C library access")

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    throw UnsupportedOperationException("backtraceSymbolsFd not available on JVM — no C library access")
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    throw UnsupportedOperationException("backtraceFromFp not available on JVM — no C library access")

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: CInt) {
    throw UnsupportedOperationException("backtraceImageOffsets not available on JVM — no C library access")
}

public actual fun backtraceAsync(array: COpaquePointer?, length: ULong, taskId: UInt?): ULong =
    throw UnsupportedOperationException("backtraceAsync not available on JVM — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs not available on JVM — no C library access")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs not available on JVM — no C library access")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent not available on JVM — no C library access")

public actual fun kevent64(kq: CInt, changelist: Kevent64S?, nchanges: CInt, eventlist: Kevent64S?, nevents: CInt, flags: CUInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent64 not available on JVM — no C library access")

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount not available on JVM — no C library access")

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fmount not available on JVM — no C library access")

public actual fun ptrace(request: CInt, pid: PidT, addr: String?, data: CInt): CInt =
    throw UnsupportedOperationException("ptrace not available on JVM — no C library access")

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: String?): CInt =
    throw UnsupportedOperationException("quotactl not available on JVM — no C library access")

public actual fun sethostname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("sethostname not available on JVM — no C library access")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: OffT?, hdtr: SfHdtr?, flags: CInt): CInt =
    throw UnsupportedOperationException("sendfile not available on JVM — no C library access")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on JVM — no C library access")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat not available on JVM — no C library access")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty not available on JVM — no C library access")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty not available on JVM — no C library access")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty not available on JVM — no C library access")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale not available on JVM — no C library access")

public actual fun freelocale(loc: LocaleT): CInt =
    throw UnsupportedOperationException("freelocale not available on JVM — no C library access")

public actual fun localeconvL(loc: LocaleT): Lconv? =
    throw UnsupportedOperationException("localeconvL not available on JVM — no C library access")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale not available on JVM — no C library access")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale not available on JVM — no C library access")

public actual fun querylocale(mask: CInt, loc: LocaleT): String? =
    throw UnsupportedOperationException("querylocale not available on JVM — no C library access")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority not available on JVM — no C library access")

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority not available on JVM — no C library access")

public actual fun getdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("getdomainname not available on JVM — no C library access")

public actual fun setdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("setdomainname not available on JVM — no C library access")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv not available on JVM — no C library access")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev not available on JVM — no C library access")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("getxattr not available on JVM — no C library access")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("fgetxattr not available on JVM — no C library access")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): CInt =
    throw UnsupportedOperationException("setxattr not available on JVM — no C library access")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: CInt): CInt =
    throw UnsupportedOperationException("fsetxattr not available on JVM — no C library access")

public actual fun listxattr(path: String?, list: String?, size: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("listxattr not available on JVM — no C library access")

public actual fun flistxattr(filedes: CInt, list: String?, size: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("flistxattr not available on JVM — no C library access")

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("removexattr not available on JVM — no C library access")

public actual fun renamexNp(from: String?, to: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renamexNp not available on JVM — no C library access")

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renameatxNp not available on JVM — no C library access")

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("fremovexattr not available on JVM — no C library access")

public actual fun getgrouplist(name: String?, basegid: CInt, groups: CInt?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist not available on JVM — no C library access")

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    throw UnsupportedOperationException("initgroups not available on JVM — no C library access")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid not available on JVM — no C library access")

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("brk not available on JVM — no C library access")

public actual fun sbrk(increment: CInt): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on JVM — no C library access")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday not available on JVM — no C library access")

public actual fun dyldGetImageHeader(imageIndex: UInt): MachHeader? =
    throw UnsupportedOperationException("dyldGetImageHeader not available on JVM — no C library access")

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    throw UnsupportedOperationException("dyldGetImageVmaddrSlide not available on JVM — no C library access")

public actual fun dyldGetImageName(imageIndex: UInt): String? =
    throw UnsupportedOperationException("dyldGetImageName not available on JVM — no C library access")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn not available on JVM — no C library access")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp not available on JVM — no C library access")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit not available on JVM — no C library access")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on JVM — no C library access")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on JVM — no C library access")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on JVM — no C library access")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on JVM — no C library access")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on JVM — no C library access")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on JVM — no C library access")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on JVM — no C library access")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on JVM — no C library access")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on JVM — no C library access")

public actual fun posixSpawnattrSetarchprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, subpref: CpuSubtypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetarchprefNp not available on JVM — no C library access")

public actual fun posixSpawnattrGetarchprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, subpref: CpuSubtypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetarchprefNp not available on JVM — no C library access")

public actual fun posixSpawnattrGetbinprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetbinprefNp not available on JVM — no C library access")

public actual fun posixSpawnattrSetbinprefNp(attr: PosixSpawnattrT, count: ULong, pref: CpuTypeT?, ocount: ULong?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetbinprefNp not available on JVM — no C library access")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on JVM — no C library access")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on JVM — no C library access")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on JVM — no C library access")

public actual fun connectx(socket: CInt, endpoints: SaEndpointsT?, associd: SaeAssocidT, flags: CUInt, iov: Iovec?, iovcnt: CUInt, len: ULong?, connid: SaeConnidT?): CInt =
    throw UnsupportedOperationException("connectx not available on JVM — no C library access")

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    throw UnsupportedOperationException("disconnectx not available on JVM — no C library access")

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime not available on JVM — no C library access")

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime not available on JVM — no C library access")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo not available on JVM — no C library access")

public actual fun getfsstat(mntbufp: Statfs?, bufsize: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("getfsstat not available on JVM — no C library access")

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    throw UnsupportedOperationException("clonefile not available on JVM — no C library access")

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    throw UnsupportedOperationException("clonefileat not available on JVM — no C library access")

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    throw UnsupportedOperationException("fclonefileat not available on JVM — no C library access")

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    throw UnsupportedOperationException("copyfile not available on JVM — no C library access")

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    throw UnsupportedOperationException("fcopyfile not available on JVM — no C library access")

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    throw UnsupportedOperationException("copyfileStateFree not available on JVM — no C library access")

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    throw UnsupportedOperationException("copyfileStateGet not available on JVM — no C library access")

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    throw UnsupportedOperationException("copyfileStateSet not available on JVM — no C library access")

public actual fun machErrorString(errorValue: MachErrorT): String? =
    throw UnsupportedOperationException("machErrorString not available on JVM — no C library access")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt =
    throw UnsupportedOperationException("memsetS not available on JVM — no C library access")

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("memsetPattern4 not available on JVM — no C library access")
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("memsetPattern8 not available on JVM — no C library access")
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("memsetPattern16 not available on JVM — no C library access")
}

public actual fun strtonum(numstr: String?, minval: CLongLong, maxval: CLongLong, errstrp: COpaquePointer?): CLongLong =
    throw UnsupportedOperationException("strtonum not available on JVM — no C library access")

public actual fun mallocPrintf(format: String?, vararg args: Any?) {
    throw UnsupportedOperationException("mallocPrintf not available on JVM — no C library access")
}

public actual fun mallocZoneCheck(zone: MallocZoneT): BooleanT =
    throw UnsupportedOperationException("mallocZoneCheck not available on JVM — no C library access")

public actual fun mallocZonePrint(zone: MallocZoneT, verbose: BooleanT) {
    throw UnsupportedOperationException("mallocZonePrint not available on JVM — no C library access")
}

public actual fun mallocZoneStatistics(zone: MallocZoneT, stats: MallocStatisticsT?) {
    throw UnsupportedOperationException("mallocZoneStatistics not available on JVM — no C library access")
}

public actual fun mallocZoneLog(zone: MallocZoneT, address: COpaquePointer?) {
    throw UnsupportedOperationException("mallocZoneLog not available on JVM — no C library access")
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    throw UnsupportedOperationException("mallocZonePrintPtrInfo not available on JVM — no C library access")
}

public actual fun mallocDefaultZone(): MallocZoneT =
    throw UnsupportedOperationException("mallocDefaultZone not available on JVM — no C library access")

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): MallocZoneT =
    throw UnsupportedOperationException("mallocZoneFromPtr not available on JVM — no C library access")

public actual fun mallocZoneMalloc(zone: MallocZoneT, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneMalloc not available on JVM — no C library access")

public actual fun mallocZoneValloc(zone: MallocZoneT, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneValloc not available on JVM — no C library access")

public actual fun mallocZoneCalloc(zone: MallocZoneT, numItems: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneCalloc not available on JVM — no C library access")

public actual fun mallocZoneRealloc(zone: MallocZoneT, ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneRealloc not available on JVM — no C library access")

public actual fun mallocZoneFree(zone: MallocZoneT, ptr: COpaquePointer?) {
    throw UnsupportedOperationException("mallocZoneFree not available on JVM — no C library access")
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListpids not available on JVM — no C library access")

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListallpids not available on JVM — no C library access")

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListpgrppids not available on JVM — no C library access")

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procListchildpids not available on JVM — no C library access")

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procPidinfo not available on JVM — no C library access")

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procPidfdinfo not available on JVM — no C library access")

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    throw UnsupportedOperationException("procPidfileportinfo not available on JVM — no C library access")

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procPidpath not available on JVM — no C library access")

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procName not available on JVM — no C library access")

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procRegionfilename not available on JVM — no C library access")

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    throw UnsupportedOperationException("procKmsgbuf not available on JVM — no C library access")

public actual fun procLibversion(major: CInt?, minor: CInt?): CInt =
    throw UnsupportedOperationException("procLibversion not available on JVM — no C library access")

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: RusageInfoT): CInt =
    throw UnsupportedOperationException("procPidRusage not available on JVM — no C library access")

public actual fun procSetNoSmt(): CInt =
    throw UnsupportedOperationException("procSetNoSmt not available on JVM — no C library access")

public actual fun procSetthreadNoSmt(): CInt =
    throw UnsupportedOperationException("procSetthreadNoSmt not available on JVM — no C library access")

public actual fun procSetCsm(flags: UInt): CInt =
    throw UnsupportedOperationException("procSetCsm not available on JVM — no C library access")

public actual fun procSetthreadCsm(flags: UInt): CInt =
    throw UnsupportedOperationException("procSetthreadCsm not available on JVM — no C library access")

public actual fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("gethostuuid not available on JVM — no C library access")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid not available on JVM — no C library access")

public actual fun sethostid(hostid: CLong) {
    throw UnsupportedOperationException("sethostid not available on JVM — no C library access")
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy not available on JVM — no C library access")

public actual fun nSGetExecutablePath(buf: String?, bufsize: UInt?): CInt =
    throw UnsupportedOperationException("nSGetExecutablePath not available on JVM — no C library access")

public actual fun nSGetArgv(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetArgv not available on JVM — no C library access")

public actual fun nSGetArgc(): CInt? =
    throw UnsupportedOperationException("nSGetArgc not available on JVM — no C library access")

public actual fun nSGetEnviron(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetEnviron not available on JVM — no C library access")

public actual fun nSGetProgname(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetProgname not available on JVM — no C library access")

public actual fun machVmMap(targetTask: VmMapT, address: MachVmAddressT?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, `object`: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    throw UnsupportedOperationException("machVmMap not available on JVM — no C library access")

public actual fun vmAllocate(targetTask: VmMapT, address: VmAddressT?, size: VmSizeT, flags: CInt): KernReturnT =
    throw UnsupportedOperationException("vmAllocate not available on JVM — no C library access")

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    throw UnsupportedOperationException("vmDeallocate not available on JVM — no C library access")

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("hostStatistics64 not available on JVM — no C library access")

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: NaturalT?, outProcessorInfo: ProcessorInfoArrayT, outProcessorInfoCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("hostProcessorInfo not available on JVM — no C library access")

public actual fun taskForPid(host: MachPortT, pid: PidT, task: MachPortT?): KernReturnT =
    throw UnsupportedOperationException("taskForPid not available on JVM — no C library access")

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("taskInfo not available on JVM — no C library access")

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: TaskT?): KernReturnT =
    throw UnsupportedOperationException("taskCreate not available on JVM — no C library access")

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    throw UnsupportedOperationException("taskTerminate not available on JVM — no C library access")

public actual fun taskThreads(targetTask: TaskInspectT, actList: ThreadActArrayT, actListCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("taskThreads not available on JVM — no C library access")

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MachMsgTypeNumberT?): KernReturnT =
    throw UnsupportedOperationException("hostStatistics not available on JVM — no C library access")

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("getattrlist not available on JVM — no C library access")

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("fgetattrlist not available on JVM — no C library access")

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: CULong): CInt =
    throw UnsupportedOperationException("getattrlistat not available on JVM — no C library access")

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("setattrlist not available on JVM — no C library access")

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("fsetattrlist not available on JVM — no C library access")

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): CInt =
    throw UnsupportedOperationException("setattrlistat not available on JVM — no C library access")

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): CInt =
    throw UnsupportedOperationException("getattrlistbulk not available on JVM — no C library access")

public actual fun mallocSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocSize not available on JVM — no C library access")

public actual fun mallocGoodSize(size: ULong): ULong =
    throw UnsupportedOperationException("mallocGoodSize not available on JVM — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on JVM — no C library access")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on JVM — no C library access")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat not available on JVM — no C library access")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat not available on JVM — no C library access")

public actual fun freadlink(fd: CInt, buf: String?, size: ULong): CInt =
    throw UnsupportedOperationException("freadlink not available on JVM — no C library access")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvP not available on JVM — no C library access")

public actual fun clockSettime(clockId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime not available on JVM — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on JVM — no C library access")

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    throw UnsupportedOperationException("taskSetInfo not available on JVM — no C library access")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv not available on JVM — no C library access")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose not available on JVM — no C library access")

