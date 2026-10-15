// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.getnameinfo

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on JVM — no C library access")

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on JVM — no C library access")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent not available on JVM — no C library access")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon not available on JVM — no C library access")

public actual fun semDestroy(sem: Int?): Int =
    throw UnsupportedOperationException("semDestroy not available on JVM — no C library access")

public actual fun semInit(sem: Int?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit not available on JVM — no C library access")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead not available on JVM — no C library access")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite not available on JVM — no C library access")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync not available on JVM — no C library access")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError not available on JVM — no C library access")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn not available on JVM — no C library access")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend not available on JVM — no C library access")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel not available on JVM — no C library access")

public actual fun chflags(path: String?, flags: UInt): Int =
    throw UnsupportedOperationException("chflags not available on JVM — no C library access")

public actual fun fchflags(fd: Int, flags: UInt): Int =
    throw UnsupportedOperationException("fchflags not available on JVM — no C library access")

public actual fun clockGetres(clkId: UInt, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres not available on JVM — no C library access")

public actual fun clockGettime(clkId: UInt, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on JVM — no C library access")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio not available on JVM — no C library access")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on JVM — no C library access")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on JVM — no C library access")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on JVM — no C library access")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on JVM — no C library access")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on JVM — no C library access")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent not available on JVM — no C library access")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent not available on JVM — no C library access")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname not available on JVM — no C library access")

public actual fun asctime(tm: Tm?): String? =
    throw UnsupportedOperationException("asctime not available on JVM — no C library access")

public actual fun ctime(clock: Long?): String? =
    throw UnsupportedOperationException("ctime not available on JVM — no C library access")

public actual fun getdate(datestr: String?): Tm? =
    throw UnsupportedOperationException("getdate not available on JVM — no C library access")

public actual fun strptime(buf: String?, format: String?, timeptr: Tm?): String? =
    throw UnsupportedOperationException("strptime not available on JVM — no C library access")

public actual fun asctimeR(tm: Tm?, result: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on JVM — no C library access")

public actual fun ctimeR(clock: Long?, result: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int {
    val hBuf = if (hostlen > 0u) ByteArray(hostlen.toInt().coerceAtMost(4096)) else null
    val sBuf = if (servlen > 0u) ByteArray(servlen.toInt().coerceAtMost(256)) else null
    return getnameinfo(sa, salen, hBuf, hostlen, sBuf, servlen, flags)
}

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): Int =
    throw UnsupportedOperationException("mincore not available on JVM — no C library access")

public actual fun sysctlnametomib(name: String?, mibp: Int?, sizep: ULong?): Int =
    throw UnsupportedOperationException("sysctlnametomib not available on JVM — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun semget(key: Int, nsems: Int, semflg: Int): Int =
    throw UnsupportedOperationException("semget not available on JVM — no C library access")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl not available on JVM — no C library access")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop not available on JVM — no C library access")

public actual fun shmOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("shmOpen not available on JVM — no C library access")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on JVM — no C library access")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt not available on JVM — no C library access")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl not available on JVM — no C library access")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget not available on JVM — no C library access")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl not available on JVM — no C library access")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctlbyname not available on JVM — no C library access")

public actual fun machAbsoluteTime(): ULong =
    throw UnsupportedOperationException("machAbsoluteTime not available on JVM — no C library access")

public actual fun machTimebaseInfo(info: MachTimebaseInfo?): Int =
    throw UnsupportedOperationException("machTimebaseInfo not available on JVM — no C library access")

public actual fun pthreadCondTimedwaitRelativeNp(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("pthreadCondTimedwaitRelativeNp not available on JVM — no C library access")

public actual fun pthreadAttrGetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetscope not available on JVM — no C library access")

public actual fun pthreadAttrGetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstackaddr not available on JVM — no C library access")

public actual fun pthreadAttrGetdetachstate(attr: io.github.kotlinmania.libc.COpaquePointer?, detachstate: Int?): Int =
    throw UnsupportedOperationException("pthreadAttrGetdetachstate not available on JVM — no C library access")

public actual fun pthreadAttrSetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int): Int =
    throw UnsupportedOperationException("pthreadAttrSetscope not available on JVM — no C library access")

public actual fun pthreadAttrSetstackaddr(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrSetstackaddr not available on JVM — no C library access")

public actual fun pthreadSetnameNp(name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp not available on JVM — no C library access")

public actual fun pthreadGetnameNp(thread: ULong, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp not available on JVM — no C library access")

public actual fun pthreadGetStackaddrNp(thread: ULong): COpaquePointer? =
    throw UnsupportedOperationException("pthreadGetStackaddrNp not available on JVM — no C library access")

public actual fun pthreadGetStacksizeNp(thread: ULong): ULong =
    throw UnsupportedOperationException("pthreadGetStacksizeNp not available on JVM — no C library access")

public actual fun pthreadMainNp(): Int =
    throw UnsupportedOperationException("pthreadMainNp not available on JVM — no C library access")

public actual fun pthreadThreadidNp(thread: ULong, threadId: ULong?): Int =
    throw UnsupportedOperationException("pthreadThreadidNp not available on JVM — no C library access")

public actual fun pthreadJitWriteProtectNp(enabled: Int): Unit = throw UnsupportedOperationException("pthreadJitWriteProtectNp not available on JVM — no C library access")

public actual fun pthreadJitWriteProtectSupportedNp(): Int =
    throw UnsupportedOperationException("pthreadJitWriteProtectSupportedNp not available on JVM — no C library access")

public actual fun pthreadJitWriteWithCallbackNp(callback: ((io.github.kotlinmania.libc.COpaquePointer?) -> Int)?, ctx: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadJitWriteWithCallbackNp not available on JVM — no C library access")

public actual fun pthreadJitWriteFreezeCallbacksNp(): Unit = throw UnsupportedOperationException("pthreadJitWriteFreezeCallbacksNp not available on JVM — no C library access")

public actual fun pthreadCpuNumberNp(cpuNumberOut: ULong?): Int =
    throw UnsupportedOperationException("pthreadCpuNumberNp not available on JVM — no C library access")

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("osSyncWaitOnAddress not available on JVM — no C library access")

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt, clockid: UInt, deadline: ULong): Int =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithDeadline not available on JVM — no C library access")

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: ULong, flags: UInt, clockid: UInt, timeoutNs: ULong): Int =
    throw UnsupportedOperationException("osSyncWaitOnAddressWithTimeout not available on JVM — no C library access")

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("osSyncWakeByAddressAny not available on JVM — no C library access")

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("osSyncWakeByAddressAll not available on JVM — no C library access")

public actual fun osUnfairLockLock(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockLock not available on JVM — no C library access")

public actual fun osUnfairLockTrylock(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Boolean =
    throw UnsupportedOperationException("osUnfairLockTrylock not available on JVM — no C library access")

public actual fun osUnfairLockUnlock(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockUnlock not available on JVM — no C library access")

public actual fun osUnfairLockAssertOwner(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockAssertOwner not available on JVM — no C library access")

public actual fun osUnfairLockAssertNotOwner(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?): Unit = throw UnsupportedOperationException("osUnfairLockAssertNotOwner not available on JVM — no C library access")

public actual fun osLogTypeEnabled(oslog: io.github.kotlinmania.libc.COpaquePointer?, tpe: UByte): Boolean =
    throw UnsupportedOperationException("osLogTypeEnabled not available on JVM — no C library access")

public actual fun osSignpostEnabled(log: io.github.kotlinmania.libc.COpaquePointer?): Boolean =
    throw UnsupportedOperationException("osSignpostEnabled not available on JVM — no C library access")

public actual fun threadPolicySet(thread: UInt, flavor: UInt, policyInfo: Int?, count: UInt): Int =
    throw UnsupportedOperationException("threadPolicySet not available on JVM — no C library access")

public actual fun threadPolicyGet(thread: UInt, flavor: UInt, policyInfo: Int?, count: UInt?, getDefault: Int?): Int =
    throw UnsupportedOperationException("threadPolicyGet not available on JVM — no C library access")

public actual fun threadInfo(targetAct: UInt, flavor: UInt, threadInfoOut: Int?, threadInfoOutCnt: UInt?): Int =
    throw UnsupportedOperationException("threadInfo not available on JVM — no C library access")

public actual fun error(): Int? =
    io.github.kotlinmania.libc.internal.LibcJni
        .getErrno()

public actual fun backtrace(buf: COpaquePointer?, sz: Int): Int =
    throw UnsupportedOperationException("backtrace not available on JVM — no C library access")

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: Int): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on JVM — no C library access")

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: Int, fd: Int): Unit = throw UnsupportedOperationException("backtraceSymbolsFd not available on JVM — no C library access")

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: Int): Int =
    throw UnsupportedOperationException("backtraceFromFp not available on JVM — no C library access")

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: Int): Unit = throw UnsupportedOperationException("backtraceImageOffsets not available on JVM — no C library access")

public actual fun backtraceAsync(array: COpaquePointer?, length: ULong, taskId: UInt?): ULong =
    throw UnsupportedOperationException("backtraceAsync not available on JVM — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs not available on JVM — no C library access")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs not available on JVM — no C library access")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent not available on JVM — no C library access")

public actual fun kevent64(kq: Int, changelist: Kevent64S?, nchanges: Int, eventlist: Kevent64S?, nevents: Int, flags: UInt, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent64 not available on JVM — no C library access")

public actual fun mount(src: String?, target: String?, flags: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount not available on JVM — no C library access")

public actual fun fmount(src: String?, fd: Int, flags: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("fmount not available on JVM — no C library access")

public actual fun ptrace(request: Int, pid: Int, addr: String?, data: Int): Int =
    throw UnsupportedOperationException("ptrace not available on JVM — no C library access")

public actual fun quotactl(special: String?, cmd: Int, id: Int, data: String?): Int =
    throw UnsupportedOperationException("quotactl not available on JVM — no C library access")

public actual fun sethostname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("sethostname not available on JVM — no C library access")

public actual fun sendfile(fd: Int, s: Int, offset: Long, len: Long?, hdtr: SfHdtr?, flags: Int): Int =
    throw UnsupportedOperationException("sendfile not available on JVM — no C library access")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on JVM — no C library access")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat not available on JVM — no C library access")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty not available on JVM — no C library access")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty not available on JVM — no C library access")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty not available on JVM — no C library access")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale not available on JVM — no C library access")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("freelocale not available on JVM — no C library access")

public actual fun localeconvL(loc: io.github.kotlinmania.libc.COpaquePointer?): Lconv? =
    throw UnsupportedOperationException("localeconvL not available on JVM — no C library access")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale not available on JVM — no C library access")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale not available on JVM — no C library access")

public actual fun querylocale(mask: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("querylocale not available on JVM — no C library access")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority not available on JVM — no C library access")

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority not available on JVM — no C library access")

public actual fun getdomainname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("getdomainname not available on JVM — no C library access")

public actual fun setdomainname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("setdomainname not available on JVM — no C library access")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv not available on JVM — no C library access")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev not available on JVM — no C library access")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Long =
    throw UnsupportedOperationException("getxattr not available on JVM — no C library access")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Long =
    throw UnsupportedOperationException("fgetxattr not available on JVM — no C library access")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Int =
    throw UnsupportedOperationException("setxattr not available on JVM — no C library access")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, position: UInt, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr not available on JVM — no C library access")

public actual fun listxattr(path: String?, list: String?, size: ULong, flags: Int): Long =
    throw UnsupportedOperationException("listxattr not available on JVM — no C library access")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong, flags: Int): Long =
    throw UnsupportedOperationException("flistxattr not available on JVM — no C library access")

public actual fun removexattr(path: String?, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("removexattr not available on JVM — no C library access")

public actual fun renamexNp(from: String?, to: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renamexNp not available on JVM — no C library access")

public actual fun renameatxNp(fromfd: Int, from: String?, tofd: Int, to: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renameatxNp not available on JVM — no C library access")

public actual fun fremovexattr(filedes: Int, name: String?, flags: Int): Int =
    throw UnsupportedOperationException("fremovexattr not available on JVM — no C library access")

public actual fun getgrouplist(name: String?, basegid: Int, groups: Int?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist not available on JVM — no C library access")

public actual fun initgroups(user: String?, basegroup: Int): Int =
    throw UnsupportedOperationException("initgroups not available on JVM — no C library access")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid not available on JVM — no C library access")

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    throw UnsupportedOperationException("brk not available on JVM — no C library access")

public actual fun sbrk(increment: Int): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on JVM — no C library access")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday not available on JVM — no C library access")

public actual fun dyldGetImageHeader(imageIndex: UInt): MachHeader? =
    throw UnsupportedOperationException("dyldGetImageHeader not available on JVM — no C library access")

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): Long =
    throw UnsupportedOperationException("dyldGetImageVmaddrSlide not available on JVM — no C library access")

public actual fun dyldGetImageName(imageIndex: UInt): String? =
    throw UnsupportedOperationException("dyldGetImageName not available on JVM — no C library access")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn not available on JVM — no C library access")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp not available on JVM — no C library access")

public actual fun posixSpawnattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit not available on JVM — no C library access")

public actual fun posixSpawnattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on JVM — no C library access")

public actual fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on JVM — no C library access")

public actual fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on JVM — no C library access")

public actual fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on JVM — no C library access")

public actual fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: UInt?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on JVM — no C library access")

public actual fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on JVM — no C library access")

public actual fun posixSpawnattrSetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on JVM — no C library access")

public actual fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on JVM — no C library access")

public actual fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on JVM — no C library access")

public actual fun posixSpawnattrSetarchprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, subpref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetarchprefNp not available on JVM — no C library access")

public actual fun posixSpawnattrGetarchprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, subpref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetarchprefNp not available on JVM — no C library access")

public actual fun posixSpawnattrGetbinprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetbinprefNp not available on JVM — no C library access")

public actual fun posixSpawnattrSetbinprefNp(attr: io.github.kotlinmania.libc.COpaquePointer?, count: ULong, pref: Int?, ocount: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetbinprefNp not available on JVM — no C library access")

public actual fun posixSpawnFileActionsInit(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on JVM — no C library access")

public actual fun posixSpawnFileActionsDestroy(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAddopen(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, path: String?, oflag: Int, mode: UShort): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAddclose(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAdddup2(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on JVM — no C library access")

public actual fun uname(buf: Utsname?): Int =
    io.github.kotlinmania.libc.internal.LibcJni
        .uname(buf)

public actual fun connectx(socket: Int, endpoints: SaEndpointsT?, associd: UInt, flags: UInt, iov: Iovec?, iovcnt: UInt, len: ULong?, connid: UInt?): Int =
    throw UnsupportedOperationException("connectx not available on JVM — no C library access")

public actual fun disconnectx(socket: Int, associd: UInt, connid: UInt): Int =
    throw UnsupportedOperationException("disconnectx not available on JVM — no C library access")

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime not available on JVM — no C library access")

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime not available on JVM — no C library access")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo not available on JVM — no C library access")

public actual fun getfsstat(mntbufp: Statfs?, bufsize: Int, flags: Int): Int =
    throw UnsupportedOperationException("getfsstat not available on JVM — no C library access")

public actual fun clonefile(src: String?, dst: String?, flags: UInt): Int =
    throw UnsupportedOperationException("clonefile not available on JVM — no C library access")

public actual fun clonefileat(srcDirfd: Int, src: String?, dstDirfd: Int, dst: String?, flags: UInt): Int =
    throw UnsupportedOperationException("clonefileat not available on JVM — no C library access")

public actual fun fclonefileat(srcfd: Int, dstDirfd: Int, dst: String?, flags: UInt): Int =
    throw UnsupportedOperationException("fclonefileat not available on JVM — no C library access")

public actual fun copyfile(from: String?, to: String?, state: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt): Int =
    throw UnsupportedOperationException("copyfile not available on JVM — no C library access")

public actual fun fcopyfile(from: Int, to: Int, state: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt): Int =
    throw UnsupportedOperationException("fcopyfile not available on JVM — no C library access")

public actual fun copyfileStateFree(s: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("copyfileStateFree not available on JVM — no C library access")

public actual fun copyfileStateGet(s: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt, dst: COpaquePointer?): Int =
    throw UnsupportedOperationException("copyfileStateGet not available on JVM — no C library access")

public actual fun copyfileStateSet(s: io.github.kotlinmania.libc.COpaquePointer?, flags: UInt, src: COpaquePointer?): Int =
    throw UnsupportedOperationException("copyfileStateSet not available on JVM — no C library access")

public actual fun machErrorString(errorValue: Int): String? =
    throw UnsupportedOperationException("machErrorString not available on JVM — no C library access")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: Int, n: ULong): Int =
    throw UnsupportedOperationException("memsetS not available on JVM — no C library access")

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("memsetPattern4 not available on JVM — no C library access")

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("memsetPattern8 not available on JVM — no C library access")

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("memsetPattern16 not available on JVM — no C library access")

public actual fun strtonum(numstr: String?, minval: Long, maxval: Long, errstrp: COpaquePointer?): Long =
    throw UnsupportedOperationException("strtonum not available on JVM — no C library access")

public actual fun mallocPrintf(format: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("mallocPrintf not available on JVM — no C library access")

public actual fun mallocZoneCheck(zone: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("mallocZoneCheck not available on JVM — no C library access")

public actual fun mallocZonePrint(zone: io.github.kotlinmania.libc.COpaquePointer?, verbose: Int): Unit = throw UnsupportedOperationException("mallocZonePrint not available on JVM — no C library access")

public actual fun mallocZoneStatistics(zone: io.github.kotlinmania.libc.COpaquePointer?, stats: MallocStatisticsT?): Unit = throw UnsupportedOperationException("mallocZoneStatistics not available on JVM — no C library access")

public actual fun mallocZoneLog(zone: io.github.kotlinmania.libc.COpaquePointer?, address: COpaquePointer?): Unit = throw UnsupportedOperationException("mallocZoneLog not available on JVM — no C library access")

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("mallocZonePrintPtrInfo not available on JVM — no C library access")

public actual fun mallocDefaultZone(): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("mallocDefaultZone not available on JVM — no C library access")

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneFromPtr not available on JVM — no C library access")

public actual fun mallocZoneMalloc(zone: io.github.kotlinmania.libc.COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneMalloc not available on JVM — no C library access")

public actual fun mallocZoneValloc(zone: io.github.kotlinmania.libc.COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneValloc not available on JVM — no C library access")

public actual fun mallocZoneCalloc(zone: io.github.kotlinmania.libc.COpaquePointer?, numItems: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneCalloc not available on JVM — no C library access")

public actual fun mallocZoneRealloc(zone: io.github.kotlinmania.libc.COpaquePointer?, ptr: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mallocZoneRealloc not available on JVM — no C library access")

public actual fun mallocZoneFree(zone: io.github.kotlinmania.libc.COpaquePointer?, ptr: COpaquePointer?): Unit = throw UnsupportedOperationException("mallocZoneFree not available on JVM — no C library access")

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListpids not available on JVM — no C library access")

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListallpids not available on JVM — no C library access")

public actual fun procListpgrppids(pgrpid: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListpgrppids not available on JVM — no C library access")

public actual fun procListchildpids(ppid: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procListchildpids not available on JVM — no C library access")

public actual fun procPidinfo(pid: Int, flavor: Int, arg: ULong, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procPidinfo not available on JVM — no C library access")

public actual fun procPidfdinfo(pid: Int, fd: Int, flavor: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procPidfdinfo not available on JVM — no C library access")

public actual fun procPidfileportinfo(pid: Int, fileport: UInt, flavor: Int, buffer: COpaquePointer?, buffersize: Int): Int =
    throw UnsupportedOperationException("procPidfileportinfo not available on JVM — no C library access")

public actual fun procPidpath(pid: Int, buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procPidpath not available on JVM — no C library access")

public actual fun procName(pid: Int, buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procName not available on JVM — no C library access")

public actual fun procRegionfilename(pid: Int, address: ULong, buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procRegionfilename not available on JVM — no C library access")

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): Int =
    throw UnsupportedOperationException("procKmsgbuf not available on JVM — no C library access")

public actual fun procLibversion(major: Int?, minor: Int?): Int =
    throw UnsupportedOperationException("procLibversion not available on JVM — no C library access")

public actual fun procPidRusage(pid: Int, flavor: Int, buffer: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("procPidRusage not available on JVM — no C library access")

public actual fun procSetNoSmt(): Int =
    throw UnsupportedOperationException("procSetNoSmt not available on JVM — no C library access")

public actual fun procSetthreadNoSmt(): Int =
    throw UnsupportedOperationException("procSetthreadNoSmt not available on JVM — no C library access")

public actual fun procSetCsm(flags: UInt): Int =
    throw UnsupportedOperationException("procSetCsm not available on JVM — no C library access")

public actual fun procSetthreadCsm(flags: UInt): Int =
    throw UnsupportedOperationException("procSetthreadCsm not available on JVM — no C library access")

public actual fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("gethostuuid not available on JVM — no C library access")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid not available on JVM — no C library access")

public actual fun sethostid(hostid: Long): Unit = throw UnsupportedOperationException("sethostid not available on JVM — no C library access")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy not available on JVM — no C library access")

public actual fun nsGetExecutablePath(buf: String?, bufsize: UInt?): Int =
    throw UnsupportedOperationException("nSGetExecutablePath not available on JVM — no C library access")

public actual fun nsGetArgv(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetArgv not available on JVM — no C library access")

public actual fun nsGetArgc(): Int? =
    throw UnsupportedOperationException("nSGetArgc not available on JVM — no C library access")

public actual fun nsGetEnviron(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetEnviron not available on JVM — no C library access")

public actual fun nsGetProgname(): COpaquePointer? =
    throw UnsupportedOperationException("nSGetProgname not available on JVM — no C library access")

public actual fun machVmMap(targetTask: UInt, address: ULong?, size: ULong, mask: ULong, flags: Int, `object`: UInt, offset: ULong, copy: Int, curProtection: Int, maxProtection: Int, inheritance: UInt): Int =
    throw UnsupportedOperationException("machVmMap not available on JVM — no C library access")

public actual fun vmAllocate(targetTask: UInt, address: ULong?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("vmAllocate not available on JVM — no C library access")

public actual fun vmDeallocate(targetTask: UInt, address: ULong, size: ULong): Int =
    throw UnsupportedOperationException("vmDeallocate not available on JVM — no C library access")

public actual fun hostStatistics64(hostPriv: UInt, flavor: Int, hostInfo64Out: Int?, hostInfo64OutCnt: UInt?): Int =
    throw UnsupportedOperationException("hostStatistics64 not available on JVM — no C library access")

public actual fun hostProcessorInfo(host: UInt, flavor: Int, outProcessorCount: UInt?, outProcessorInfo: Int?, outProcessorInfoCnt: UInt?): Int =
    throw UnsupportedOperationException("hostProcessorInfo not available on JVM — no C library access")

public actual fun taskForPid(host: UInt, pid: Int, task: UInt?): Int =
    throw UnsupportedOperationException("taskForPid not available on JVM — no C library access")

public actual fun taskInfo(host: UInt, flavor: UInt, taskInfoOut: Int?, taskInfoCount: UInt?): Int =
    throw UnsupportedOperationException("taskInfo not available on JVM — no C library access")

public actual fun taskCreate(targetTask: UInt, ledgers: UInt?, ledgersCnt: UInt, inheritMemory: Int, childTask: UInt?): Int =
    throw UnsupportedOperationException("taskCreate not available on JVM — no C library access")

public actual fun taskTerminate(targetTask: UInt): Int =
    throw UnsupportedOperationException("taskTerminate not available on JVM — no C library access")

public actual fun taskThreads(targetTask: UInt, actList: UInt?, actListCnt: UInt?): Int =
    throw UnsupportedOperationException("taskThreads not available on JVM — no C library access")

public actual fun hostStatistics(hostPriv: UInt, flavor: Int, hostInfoOut: Int?, hostInfoOutCnt: UInt?): Int =
    throw UnsupportedOperationException("hostStatistics not available on JVM — no C library access")

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("getattrlist not available on JVM — no C library access")

public actual fun fgetattrlist(fd: Int, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("fgetattrlist not available on JVM — no C library access")

public actual fun getattrlistat(fd: Int, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): Int =
    throw UnsupportedOperationException("getattrlistat not available on JVM — no C library access")

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("setattrlist not available on JVM — no C library access")

public actual fun fsetattrlist(fd: Int, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("fsetattrlist not available on JVM — no C library access")

public actual fun setattrlistat(dirFd: Int, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: UInt): Int =
    throw UnsupportedOperationException("setattrlistat not available on JVM — no C library access")

public actual fun getattrlistbulk(dirfd: Int, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: ULong, options: ULong): Int =
    throw UnsupportedOperationException("getattrlistbulk not available on JVM — no C library access")

public actual fun mallocSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocSize not available on JVM — no C library access")

public actual fun mallocGoodSize(size: ULong): ULong =
    throw UnsupportedOperationException("mallocGoodSize not available on JVM — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on JVM — no C library access")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on JVM — no C library access")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UShort): Int =
    throw UnsupportedOperationException("mkfifoat not available on JVM — no C library access")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UShort, dev: Int): Int =
    throw UnsupportedOperationException("mknodat not available on JVM — no C library access")

public actual fun freadlink(fd: Int, buf: String?, size: ULong): Int =
    throw UnsupportedOperationException("freadlink not available on JVM — no C library access")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvP not available on JVM — no C library access")

public actual fun clockSettime(clockId: UInt, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime not available on JVM — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on JVM — no C library access")

public actual fun taskSetInfo(targetTask: UInt, flavor: UInt, taskInfoIn: Int?, taskInfoInCnt: UInt): Int =
    throw UnsupportedOperationException("taskSetInfo not available on JVM — no C library access")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv not available on JVM — no C library access")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose not available on JVM — no C library access")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, arg: COpaquePointer?, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?): Unit = throw UnsupportedOperationException("qsortR not available on JVM — no C library access")
