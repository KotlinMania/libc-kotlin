// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun cPUALLOCSIZE(count: Int): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE requires N-API addon")

public actual fun cPUZERO(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO requires N-API addon")

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET requires N-API addon")

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR requires N-API addon")

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires N-API addon")

public actual fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNTS requires N-API addon")

public actual fun cPUCOUNT(cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNT requires N-API addon")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires N-API addon")

public actual fun nLAALIGN(len: Int): Int =
    throw UnsupportedOperationException("nLAALIGN requires N-API addon")

public actual fun sOEEOFFENDER(ee: SockExtendedErr?): Sockaddr? =
    throw UnsupportedOperationException("sOEEOFFENDER requires N-API addon")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent requires N-API addon")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent requires N-API addon")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires N-API addon")

public actual fun getrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 requires N-API addon")

public actual fun setrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 requires N-API addon")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun prlimit(pid: Int, resource: Int, newLimit: Rlimit?, oldLimit: Rlimit?): Int =
    throw UnsupportedOperationException("prlimit requires N-API addon")

public actual fun prlimit64(pid: Int, resource: Int, newLimit: Rlimit64?, oldLimit: Rlimit64?): Int =
    throw UnsupportedOperationException("prlimit64 requires N-API addon")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("mlock2 requires N-API addon")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires N-API addon")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int =
    getnameinfoNapi(
        sa,
        salen,
        if (host != null && hostlen > 0uL) ByteArray(hostlen.toInt().coerceAtMost(4096)) else null,
        hostlen.toUInt(),
        if (serv != null && servlen > 0uL) ByteArray(servlen.toInt().coerceAtMost(4096)) else null,
        servlen.toUInt(),
        flags,
    )

public actual fun preadv(fd: Int, iov: Iovec?, count: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun pwritev(fd: Int, iov: Iovec?, count: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun processVmReadv(pid: Int, localIov: Iovec?, localIovCount: ULong, remoteIov: Iovec?, remoteIovCount: ULong, flags: ULong): Long =
    throw UnsupportedOperationException("processVmReadv requires N-API addon")

public actual fun processVmWritev(pid: Int, localIov: Iovec?, localIovCount: ULong, remoteIov: Iovec?, remoteIovCount: ULong, flags: ULong): Long =
    throw UnsupportedOperationException("processVmWritev requires N-API addon")

public actual fun ptrace(request: Int, vararg args: Any?): Long =
    throw UnsupportedOperationException("ptrace requires N-API addon")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun schedCpualloc(count: ULong): CpuSetT? =
    throw UnsupportedOperationException("schedCpualloc requires N-API addon")

public actual fun schedCpufree(set: CpuSetT?): Unit = throw UnsupportedOperationException("schedCpufree requires N-API addon")

public actual fun schedCpucount(setsize: ULong, set: CpuSetT?): Int =
    throw UnsupportedOperationException("schedCpucount requires N-API addon")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu requires N-API addon")

public actual fun mallocInfo(options: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("mallocInfo requires N-API addon")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires N-API addon")

public actual fun utmpname(name: String?): Int =
    throw UnsupportedOperationException("utmpname requires N-API addon")

public actual fun setutent(): Unit = throw UnsupportedOperationException("setutent requires N-API addon")

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent requires N-API addon")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires N-API addon")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires N-API addon")

public actual fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate requires N-API addon")

public actual fun fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate64 requires N-API addon")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun posixFallocate64(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate64 requires N-API addon")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("getxattr requires N-API addon")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("lgetxattr requires N-API addon")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("fgetxattr requires N-API addon")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("setxattr requires N-API addon")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("lsetxattr requires N-API addon")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr requires N-API addon")

public actual fun listxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("listxattr requires N-API addon")

public actual fun llistxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("llistxattr requires N-API addon")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("flistxattr requires N-API addon")

public actual fun removexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("removexattr requires N-API addon")

public actual fun lremovexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("lremovexattr requires N-API addon")

public actual fun fremovexattr(filedes: Int, name: String?): Int =
    throw UnsupportedOperationException("fremovexattr requires N-API addon")

public actual fun signalfd(fd: Int, mask: ULong?, flags: Int): Int =
    throw UnsupportedOperationException("signalfd requires N-API addon")

public actual fun timerfdCreate(clock: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate requires N-API addon")

public actual fun timerfdGettime(fd: Int, currentValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime requires N-API addon")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime requires N-API addon")

public actual fun syscall(num: Long, vararg args: Any?): Long =
    throw UnsupportedOperationException("syscall requires N-API addon")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires N-API addon")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires N-API addon")

public actual fun epollCreate(size: Int): Int =
    throw UnsupportedOperationException("epollCreate requires N-API addon")

public actual fun epollCreate1(flags: Int): Int =
    throw UnsupportedOperationException("epollCreate1 requires N-API addon")

public actual fun epollWait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int): Int =
    throw UnsupportedOperationException("epollWait requires N-API addon")

public actual fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int =
    throw UnsupportedOperationException("epollCtl requires N-API addon")

public actual fun unshare(flags: Int): Int =
    throw UnsupportedOperationException("unshare requires N-API addon")

public actual fun umount(target: String?): Int =
    throw UnsupportedOperationException("umount requires N-API addon")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax requires N-API addon")

public actual fun tee(fdIn: Int, fdOut: Int, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("tee requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun splice(fdIn: Int, offIn: Long?, fdOut: Int, offOut: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("splice requires N-API addon")

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd requires N-API addon")

public actual fun eventfdRead(fd: Int, value: ULong?): Int =
    throw UnsupportedOperationException("eventfdRead requires N-API addon")

public actual fun eventfdWrite(fd: Int, value: ULong): Int =
    throw UnsupportedOperationException("eventfdWrite requires N-API addon")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun semGetvalue(sem: SemT?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun setns(fd: Int, nstype: Int): Int =
    throw UnsupportedOperationException("setns requires N-API addon")

public actual fun swapoff(puath: String?): Int =
    throw UnsupportedOperationException("swapoff requires N-API addon")

public actual fun vmsplice(fd: Int, iov: Iovec?, nrSegs: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("vmsplice requires N-API addon")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: ULong, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun personality(persona: UInt): Int =
    throw UnsupportedOperationException("personality requires N-API addon")

public actual fun prctl(option: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("prctl requires N-API addon")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun ppoll(fds: Pollfd?, nfds: UInt, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("ppoll requires N-API addon")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin requires N-API addon")

public actual fun sysinfo(info: Sysinfo?): Int =
    throw UnsupportedOperationException("sysinfo requires N-API addon")

public actual fun umount2(target: String?, flags: Int): Int =
    throw UnsupportedOperationException("umount2 requires N-API addon")

public actual fun swapon(path: String?, swapflags: Int): Int =
    throw UnsupportedOperationException("swapon requires N-API addon")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun sendfile(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long =
    throw UnsupportedOperationException("sendfile requires N-API addon")

public actual fun sendfile64(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long =
    throw UnsupportedOperationException("sendfile64 requires N-API addon")

public actual fun setfsgid(gid: UInt): Int =
    throw UnsupportedOperationException("setfsgid requires N-API addon")

public actual fun setfsuid(uid: UInt): Int =
    throw UnsupportedOperationException("setfsuid requires N-API addon")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend requires N-API addon")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires N-API addon")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack requires N-API addon")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose requires N-API addon")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires N-API addon")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires N-API addon")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires N-API addon")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink requires N-API addon")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires N-API addon")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires N-API addon")

public actual fun getgrouplist(user: String?, group: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun initgroups(user: String?, group: UInt): Int =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun popen(command: String?, mode: String?): FILE? =
    popenNapi(command, mode)

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat requires N-API addon")

public actual fun errno(): Int? =
    getErrnoNapi()

public actual fun inotifyRmWatch(fd: Int, wd: UInt): Int =
    throw UnsupportedOperationException("inotifyRmWatch requires N-API addon")

public actual fun inotifyInit(): Int =
    throw UnsupportedOperationException("inotifyInit requires N-API addon")

public actual fun inotifyInit1(flags: Int): Int =
    throw UnsupportedOperationException("inotifyInit1 requires N-API addon")

public actual fun inotifyAddWatch(fd: Int, path: String?, mask: UInt): Int =
    throw UnsupportedOperationException("inotifyAddWatch requires N-API addon")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp requires N-API addon")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec requires N-API addon")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires N-API addon")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree requires N-API addon")

public actual fun androidSetAbortMessage(msg: String?): Unit = throw UnsupportedOperationException("androidSetAbortMessage requires N-API addon")

public actual fun gettid(): Int =
    throw UnsupportedOperationException("gettid requires N-API addon")

public actual fun tgkill(tgid: Int, tid: Int, sig: Int): Int =
    throw UnsupportedOperationException("tgkill requires N-API addon")

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval requires N-API addon")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun systemPropertySet(name: String?, value: String?): Int =
    throw UnsupportedOperationException("systemPropertySet requires N-API addon")

public actual fun systemPropertyGet(name: String?, value: String?): Int =
    throw UnsupportedOperationException("systemPropertyGet requires N-API addon")

public actual fun systemPropertyFind(name: String?): PropInfo? =
    throw UnsupportedOperationException("systemPropertyFind requires N-API addon")

public actual fun systemPropertyFindNth(n: UInt): PropInfo? =
    throw UnsupportedOperationException("systemPropertyFindNth requires N-API addon")

public actual fun arc4randomBuf(buf: COpaquePointer?, n: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires N-API addon")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename requires N-API addon")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong requires N-API addon")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires N-API addon")

public actual fun syncfs(fd: Int): Int =
    throw UnsupportedOperationException("syncfs requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("freadUnlocked requires N-API addon")

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwriteUnlocked requires N-API addon")

public actual fun fflushUnlocked(stream: FILE?): Int =
    throw UnsupportedOperationException("fflushUnlocked requires N-API addon")

public actual fun fgetsUnlocked(buf: String?, size: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgetsUnlocked requires N-API addon")

public actual fun klogctl(syslogType: Int, bufp: String?, len: Int): Int =
    throw UnsupportedOperationException("klogctl requires N-API addon")

public actual fun memfdCreate(name: String?, flags: UInt): Int =
    throw UnsupportedOperationException("memfdCreate requires N-API addon")

public actual fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renameat2 requires N-API addon")

public actual fun clone(cb: ((COpaquePointer?) -> Int)?, childStack: COpaquePointer?, flags: Int, arg: COpaquePointer?, vararg args: Any?): Int =
    throw UnsupportedOperationException("clone requires N-API addon")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires N-API addon")

public actual fun systemPropertyForeach(callback: ((PropInfo?, COpaquePointer?) -> Unit)?, cookie: COpaquePointer?): Int =
    throw UnsupportedOperationException("systemPropertyForeach requires N-API addon")
