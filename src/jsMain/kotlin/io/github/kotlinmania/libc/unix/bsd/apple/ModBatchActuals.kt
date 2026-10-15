// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent requires N-API addon")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun semDestroy(sem: Int?): Int =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semInit(sem: Int?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun chflags(path: String?, flags: UInt): Int =
    throw UnsupportedOperationException("chflags requires N-API addon")

public actual fun fchflags(fd: Int, flags: UInt): Int =
    throw UnsupportedOperationException("fchflags requires N-API addon")

public actual fun clockGetres(clkId: UInt, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: UInt, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent requires N-API addon")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent requires N-API addon")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime requires N-API addon")

public actual fun ctime(clock: Long?): String? =
    throw UnsupportedOperationException("ctime requires N-API addon")

public actual fun getdate(datestr: String?): Tm? =
    throw UnsupportedOperationException("getdate requires N-API addon")

public actual fun strptime(buf: String?, format: String?, timeptr: Tm?): String? =
    throw UnsupportedOperationException("strptime requires N-API addon")

public actual fun asctimeR(tm: Tm?, result: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctimeR(clock: Long?, result: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    getnameinfoNapi(
        sa,
        salen,
        if (host != null && hostlen > 0u) ByteArray(hostlen.toInt()) else null,
        hostlen,
        if (serv != null && servlen > 0u) ByteArray(servlen.toInt()) else null,
        servlen,
        flags,
    )

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): Int =
    throw UnsupportedOperationException("mincore requires N-API addon")

public actual fun sysctlnametomib(name: String?, mibp: Int?, sizep: ULong?): Int =
    throw UnsupportedOperationException("sysctlnametomib requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun semget(key: Int, nsems: Int, semflg: Int): Int =
    throw UnsupportedOperationException("semget requires N-API addon")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl requires N-API addon")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop requires N-API addon")

public actual fun shmOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl requires N-API addon")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctlbyname requires N-API addon")

public actual fun machAbsoluteTime(): ULong =
    throw UnsupportedOperationException("machAbsoluteTime requires N-API addon")

public actual fun machTimebaseInfo(info: MachTimebaseInfo?): Int =
    throw UnsupportedOperationException("machTimebaseInfo requires N-API addon")

public actual fun pthreadCondTimedwaitRelativeNp(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwaitRelativeNp requires N-API addon")

public actual fun pthreadAttrGetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetscope requires N-API addon")

public actual fun pthreadAttrGetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr requires N-API addon")

public actual fun pthreadAttrGetdetachstate(attr: io.github.kotlinmania.libc.COpaquePointer?, detachstate: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate requires N-API addon")

public actual fun pthreadAttrSetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetscope requires N-API addon")

public actual fun pthreadAttrSetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr requires N-API addon")

public actual fun pthreadSetnameNp(name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp requires N-API addon")

public actual fun pthreadGetnameNp(thread: ULong, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadGetStackaddrNp(thread: ULong): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetStackaddrNp requires N-API addon")

public actual fun pthreadGetStacksizeNp(thread: ULong): ULong =
    throw UnsupportedOperationException("pthreadGetStacksizeNp requires N-API addon")

public actual fun pthreadMainNp(): Int =
    throw UnsupportedOperationException("pthreadMainNp requires N-API addon")

public actual fun pthreadThreadidNp(thread: ULong, threadId: ULong?): Int =
    throw UnsupportedOperationException("pthreadThreadidNp requires N-API addon")

public actual fun pthreadJitWriteProtectNp(enabled: Int): Unit = throw UnsupportedOperationException("pthreadJitWriteProtectNp requires N-API addon")

public actual fun pthreadJitWriteProtectSupportedNp(): Int =
    throw UnsupportedOperationException("pthreadJitWriteProtectSupportedNp requires N-API addon")

public actual fun pthreadJitWriteWithCallbackNp(callback: ((io.github.kotlinmania.libc.COpaquePointer?) -> Int)?, ctx: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJitWriteWithCallbackNp requires N-API addon")

public actual fun pthreadJitWriteFreezeCallbacksNp(): Unit = throw UnsupportedOperationException("pthreadJitWriteFreezeCallbacksNp requires N-API addon")

public actual fun pthreadCpuNumberNp(cpuNumberOut: ULong?): Int =
    throw UnsupportedOperationException("pthreadCpuNumberNp requires N-API addon")

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("osSyncWaitOnAddress requires N-API addon")

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt, clockid: UInt, deadline: ULong): Int =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithDeadline requires N-API addon")

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt, clockid: UInt, timeoutNs: ULong): Int =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithTimeout requires N-API addon")

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("osSyncWakeByAddressAny requires N-API addon")

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("osSyncWakeByAddressAll requires N-API addon")

public actual fun osUnfairLockLock(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockLock requires N-API addon")

public actual fun osUnfairLockTrylock(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Boolean =
    throw UnsupportedOperationException("osUnfairLockTrylock requires N-API addon")

public actual fun osUnfairLockUnlock(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockUnlock requires N-API addon")

public actual fun osUnfairLockAssertOwner(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockAssertOwner requires N-API addon")

public actual fun osUnfairLockAssertNotOwner(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockAssertNotOwner requires N-API addon")

public actual fun osLogTypeEnabled(oslog: io.github.kotlinmania.libc.COpaquePointer?, tpe: UByte): Boolean =
    throw UnsupportedOperationException("osLogTypeEnabled requires N-API addon")

public actual fun osSignpostEnabled(log: io.github.kotlinmania.libc.COpaquePointer?): Boolean =
    throw UnsupportedOperationException("osSignpostEnabled requires N-API addon")

public actual fun threadPolicySet(thread: UInt, flavor: UInt, policyInfo: Int?, count: UInt): Int =
    throw UnsupportedOperationException("threadPolicySet requires N-API addon")

public actual fun threadPolicyGet(thread: UInt, flavor: UInt, policyInfo: Int?, count: UInt?, getDefault: Int?): Int =
    throw UnsupportedOperationException("threadPolicyGet requires N-API addon")

public actual fun threadInfo(targetAct: UInt, flavor: UInt, threadInfoOut: Int?, threadInfoOutCnt: UInt?): Int =
    throw UnsupportedOperationException("threadInfo requires N-API addon")

public actual fun error(): Int? =
    getErrnoNapi()

public actual fun backtrace(buf: COpaquePointer?, sz: Int): Int =
    throw UnsupportedOperationException("backtrace requires N-API addon")

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: Int): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires N-API addon")

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: Int, fd: Int): Unit = throw UnsupportedOperationException("backtraceSymbolsFd requires N-API addon")

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("backtraceFromFp requires N-API addon")

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: Int): Unit = throw UnsupportedOperationException("backtraceImageOffsets requires N-API addon")

public actual fun backtraceAsync(array: COpaquePointer?, length: ULong, taskId: UInt?): ULong =
    throw UnsupportedOperationException("backtraceAsync requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent requires N-API addon")

public actual fun kevent64(kq: Int, changelist: Kevent64S?, nchanges: Int, eventlist: Kevent64S?, nevents: Int, flags: UInt, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent64 requires N-API addon")

public actual fun mount(src: String?, target: String?, flags: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun fmount(src: String?, fd: Int, flags: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("fmount requires N-API addon")

public actual fun ptrace(request: Int, pid: Int, addr: String?, data: Int): Int =
    throw UnsupportedOperationException("ptrace requires N-API addon")

public actual fun quotactl(special: String?, cmd: Int, id: Int, data: String?): Int =
    throw UnsupportedOperationException("quotactl requires N-API addon")

public actual fun sethostname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun sendfile(fd: Int, s: Int, offset: Long, len: Long?, hdtr: SfHdtr?, flags: Int): Int =
    throw UnsupportedOperationException("sendfile requires N-API addon")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty requires N-API addon")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun localeconvL(loc: io.github.kotlinmania.libc.COpaquePointer?): Lconv? =
    throw UnsupportedOperationException("localeconvL requires N-API addon")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun querylocale(mask: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("querylocale requires N-API addon")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun getdomainname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun setdomainname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("setdomainname requires N-API addon")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Long =
    throw UnsupportedOperationException("getxattr requires N-API addon")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Long =
    throw UnsupportedOperationException("fgetxattr requires N-API addon")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Int =
    throw UnsupportedOperationException("setxattr requires N-API addon")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr requires N-API addon")

public actual fun listxattr(path: String?, list: String?, size: ULong, flags: Int): Long =
    throw UnsupportedOperationException("listxattr requires N-API addon")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong, flags: Int): Long =
    throw UnsupportedOperationException("flistxattr requires N-API addon")

public actual fun removexattr(path: String?, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("removexattr requires N-API addon")

public actual fun renamexNp(from: String?, to: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renamexNp requires N-API addon")

public actual fun renameatxNp(fromfd: Int, from: String?, tofd: Int, to: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renameatxNp requires N-API addon")

public actual fun fremovexattr(filedes: Int, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("fremovexattr requires N-API addon")

public actual fun getgrouplist(name: String?, basegid: Int, groups: Int?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun initgroups(user: String?, basegroup: Int): Int =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("brk requires N-API addon")

public actual fun sbrk(increment: Int): COpaquePointer? =
    throw UnsupportedOperationException("sbrk requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun dyldGetImageHeader(imageIndex: UInt): MachHeader? =
    throw UnsupportedOperationException("dyldGetImageHeader requires N-API addon")

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): Long =
    throw UnsupportedOperationException("dyldGetImageVmaddrSlide requires N-API addon")

public actual fun dyldGetImageName(imageIndex: UInt): String? =
    throw UnsupportedOperationException("dyldGetImageName requires N-API addon")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn requires N-API addon")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp requires N-API addon")

public actual fun posixSpawnattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit requires N-API addon")

public actual fun posixSpawnattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires N-API addon")

public actual fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires N-API addon")

public actual fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires N-API addon")

public actual fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires N-API addon")

public actual fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires N-API addon")

public actual fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires N-API addon")

public actual fun posixSpawnattrSetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires N-API addon")

public actual fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires N-API addon")

public actual fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires N-API addon")

public actual fun posixSpawnattrSetarchprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, subpref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetarchprefNp requires N-API addon")

public actual fun posixSpawnattrGetarchprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, subpref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetarchprefNp requires N-API addon")

public actual fun posixSpawnattrGetbinprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetbinprefNp requires N-API addon")

public actual fun posixSpawnattrSetbinprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetbinprefNp requires N-API addon")

public actual fun posixSpawnFileActionsInit(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires N-API addon")

public actual fun posixSpawnFileActionsDestroy(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires N-API addon")

public actual fun posixSpawnFileActionsAddopen(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, path: String?, oflag: Int, mode: UShort): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires N-API addon")

public actual fun posixSpawnFileActionsAddclose(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires N-API addon")

public actual fun posixSpawnFileActionsAdddup2(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires N-API addon")

public actual fun uname(buf: Utsname?): Int =
    unameNapi(buf)

public actual fun connectx(socket: Int, endpoints: SaEndpointsT?, associd: UInt, flags: UInt, iov: Iovec?, iovcnt: UInt, len: ULong?, connid: UInt?): Int =
    throw UnsupportedOperationException("connectx requires N-API addon")

public actual fun disconnectx(socket: Int, associd: UInt, connid: UInt): Int =
    throw UnsupportedOperationException("disconnectx requires N-API addon")

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime requires N-API addon")

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime requires N-API addon")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo requires N-API addon")

public actual fun getfsstat(mntbufp: Statfs?, bufsize: Int, flags: Int): Int =
    throw UnsupportedOperationException("getfsstat requires N-API addon")

public actual fun clonefile(src: String?, dst: String?, flags: UInt): Int =
    throw UnsupportedOperationException("clonefile requires N-API addon")

public actual fun clonefileat(srcDirfd: Int, src: String?, dstDirfd: Int, dst: String?, flags: UInt): Int =
    throw UnsupportedOperationException("clonefileat requires N-API addon")

public actual fun fclonefileat(srcfd: Int, dstDirfd: Int, dst: String?, flags: UInt): Int =
    throw UnsupportedOperationException("fclonefileat requires N-API addon")

public actual fun copyfile(from: String?, to: String?, state: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt): Int =
    throw UnsupportedOperationException("copyfile requires N-API addon")

public actual fun fcopyfile(from: Int, to: Int, state: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt): Int =
    throw UnsupportedOperationException("fcopyfile requires N-API addon")

public actual fun copyfileStateFree(s: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("copyfileStateFree requires N-API addon")

public actual fun copyfileStateGet(s: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt, dst: COpaquePointer?): Int =
    throw UnsupportedOperationException("copyfileStateGet requires N-API addon")

public actual fun copyfileStateSet(s: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt, src: COpaquePointer?): Int =
    throw UnsupportedOperationException("copyfileStateSet requires N-API addon")

public actual fun machErrorString(errorValue: Int): String? =
    throw UnsupportedOperationException("machErrorString requires N-API addon")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: Int, n: ULong): Int =
    throw UnsupportedOperationException("memsetS requires N-API addon")

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("memsetPattern4 requires N-API addon")

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("memsetPattern8 requires N-API addon")

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("memsetPattern16 requires N-API addon")

public actual fun strtonum(numstr: String?, minval: Long, maxval: Long, errstrp: COpaquePointer?): Long =
    throw UnsupportedOperationException("strtonum requires N-API addon")

public actual fun mallocPrintf(format: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("mallocPrintf requires N-API addon")

public actual fun mallocZoneCheck(zone: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("mallocZoneCheck requires N-API addon")

public actual fun mallocZonePrint(zone: io.github.kotlinmania.libc.COpaquePointer?, verbose: Int): Unit = throw UnsupportedOperationException("mallocZonePrint requires N-API addon")

public actual fun mallocZoneStatistics(zone: io.github.kotlinmania.libc.COpaquePointer?, stats: MallocStatisticsT?): Unit = throw UnsupportedOperationException("mallocZoneStatistics requires N-API addon")

public actual fun mallocZoneLog(zone: io.github.kotlinmania.libc.COpaquePointer?, address: COpaquePointer?): Unit = throw UnsupportedOperationException("mallocZoneLog requires N-API addon")

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("mallocZonePrintPtrInfo requires N-API addon")

public actual fun mallocDefaultZone(): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("mallocDefaultZone requires N-API addon")

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneFromPtr requires N-API addon")

public actual fun mallocZoneMalloc(zone: io.github.kotlinmania.libc.COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneMalloc requires N-API addon")

public actual fun mallocZoneValloc(zone: io.github.kotlinmania.libc.COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneValloc requires N-API addon")

public actual fun mallocZoneCalloc(zone: io.github.kotlinmania.libc.COpaquePointer?, numItems: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneCalloc requires N-API addon")

public actual fun mallocZoneRealloc(zone: io.github.kotlinmania.libc.COpaquePointer?, ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneRealloc requires N-API addon")

public actual fun mallocZoneFree(zone: io.github.kotlinmania.libc.COpaquePointer?, ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("mallocZoneFree requires N-API addon")

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListpids requires N-API addon")

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListallpids requires N-API addon")

public actual fun procListpgrppids(pgrpid: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListpgrppids requires N-API addon")

public actual fun procListchildpids(ppid: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListchildpids requires N-API addon")

public actual fun procPidinfo(pid: Int, flavor: Int, arg: ULong, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procPidinfo requires N-API addon")

public actual fun procPidfdinfo(pid: Int, fd: Int, flavor: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procPidfdinfo requires N-API addon")

public actual fun procPidfileportinfo(pid: Int, fileport: UInt, flavor: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procPidfileportinfo requires N-API addon")

public actual fun procPidpath(pid: Int, buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procPidpath requires N-API addon")

public actual fun procName(pid: Int, buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procName requires N-API addon")

public actual fun procRegionfilename(pid: Int, address: ULong, buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procRegionfilename requires N-API addon")

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procKmsgbuf requires N-API addon")

public actual fun procLibversion(major: Int?, minor: Int?): Int =
    throw UnsupportedOperationException("procLibversion requires N-API addon")

public actual fun procPidRusage(pid: Int, flavor: Int, buffer: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("procPidRusage requires N-API addon")

public actual fun procSetNoSmt(): Int =
    throw UnsupportedOperationException("procSetNoSmt requires N-API addon")

public actual fun procSetthreadNoSmt(): Int =
    throw UnsupportedOperationException("procSetthreadNoSmt requires N-API addon")

public actual fun procSetCsm(flags: UInt): Int =
    throw UnsupportedOperationException("procSetCsm requires N-API addon")

public actual fun procSetthreadCsm(flags: UInt): Int =
    throw UnsupportedOperationException("procSetthreadCsm requires N-API addon")

public actual fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("gethostuuid requires N-API addon")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun sethostid(hostid: Long): Unit = throw UnsupportedOperationException("sethostid requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun nsGetExecutablePath(buf: String?, bufsize: UInt?): Int =
    throw UnsupportedOperationException("nSGetExecutablePath requires N-API addon")

public actual fun nsGetArgv(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetArgv requires N-API addon")

public actual fun nsGetArgc(): Int? =
    throw UnsupportedOperationException("nSGetArgc requires N-API addon")

public actual fun nsGetEnviron(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetEnviron requires N-API addon")

public actual fun nsGetProgname(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetProgname requires N-API addon")

public actual fun machVmMap(targetTask: UInt, address: ULong?, size: ULong, mask: ULong, flags: Int, `object`: UInt, offset: ULong, copy: Int, curProtection: Int, maxProtection: Int, inheritance: UInt): Int =
    throw UnsupportedOperationException("machVmMap requires N-API addon")

public actual fun vmAllocate(targetTask: UInt, address: ULong?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("vmAllocate requires N-API addon")

public actual fun vmDeallocate(targetTask: UInt, address: ULong, size: ULong): Int =
    throw UnsupportedOperationException("vmDeallocate requires N-API addon")

public actual fun hostStatistics64(hostPriv: UInt, flavor: Int, hostInfo64Out: Int?, hostInfo64OutCnt: UInt?): Int =
    throw UnsupportedOperationException("hostStatistics64 requires N-API addon")

public actual fun hostProcessorInfo(host: UInt, flavor: Int, outProcessorCount: UInt?, outProcessorInfo: Int?, outProcessorInfoCnt: UInt?): Int =
    throw UnsupportedOperationException("hostProcessorInfo requires N-API addon")

public actual fun taskForPid(host: UInt, pid: Int, task: UInt?): Int =
    throw UnsupportedOperationException("taskForPid requires N-API addon")

public actual fun taskInfo(host: UInt, flavor: UInt, taskInfoOut: Int?, taskInfoCount: UInt?): Int =
    throw UnsupportedOperationException("taskInfo requires N-API addon")

public actual fun taskCreate(targetTask: UInt, ledgers: UInt?, ledgersCnt: UInt, inheritMemory: Int, childTask: UInt?): Int =
    throw UnsupportedOperationException("taskCreate requires N-API addon")

public actual fun taskTerminate(targetTask: UInt): Int =
    throw UnsupportedOperationException("taskTerminate requires N-API addon")

public actual fun taskThreads(targetTask: UInt, actList: UInt?, actListCnt: UInt?): Int =
    throw UnsupportedOperationException("taskThreads requires N-API addon")

public actual fun hostStatistics(hostPriv: UInt, flavor: Int, hostInfoOut: Int?, hostInfoOutCnt: UInt?): Int =
    throw UnsupportedOperationException("hostStatistics requires N-API addon")

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("getattrlist requires N-API addon")

public actual fun fgetattrlist(fd: Int, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("fgetattrlist requires N-API addon")

public actual fun getattrlistat(fd: Int, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): Int =
    throw UnsupportedOperationException("getattrlistat requires N-API addon")

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("setattrlist requires N-API addon")

public actual fun fsetattrlist(fd: Int, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("fsetattrlist requires N-API addon")

public actual fun setattrlistat(dirFd: Int, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("setattrlistat requires N-API addon")

public actual fun getattrlistbulk(dirfd: Int, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): Int =
    throw UnsupportedOperationException("getattrlistbulk requires N-API addon")

public actual fun mallocSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocSize requires N-API addon")

public actual fun mallocGoodSize(size: ULong): ULong =
    throw UnsupportedOperationException("mallocGoodSize requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UShort): Int =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UShort, dev: Int): Int =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun freadlink(fd: Int, buf: String?, size: ULong): Int =
    throw UnsupportedOperationException("freadlink requires N-API addon")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvP requires N-API addon")

public actual fun clockSettime(clockId: UInt, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun taskSetInfo(targetTask: UInt, flavor: UInt, taskInfoIn: Int?, taskInfoInCnt: UInt): Int =
    throw UnsupportedOperationException("taskSetInfo requires N-API addon")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires N-API addon")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose requires N-API addon")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsortR requires N-API addon")
