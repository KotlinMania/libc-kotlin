// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on WASI — no C library access")

public actual fun cPUALLOCSIZE(count: Int): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE not available on WASI — no C library access")

public actual fun cPUZERO(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO not available on WASI — no C library access")

public actual fun cPUSET(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET not available on WASI — no C library access")

public actual fun cPUCLR(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR not available on WASI — no C library access")

public actual fun cPUISSET(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on WASI — no C library access")

public actual fun cPUCOUNTS(size: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNTS not available on WASI — no C library access")

public actual fun cPUCOUNT(cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNT not available on WASI — no C library access")

public actual fun cPUEQUAL(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL not available on WASI — no C library access")

public actual fun nLAALIGN(len: Int): Int =
    throw UnsupportedOperationException("nLAALIGN not available on WASI — no C library access")

public actual fun sOEEOFFENDER(ee: SockExtendedErr?): Sockaddr? =
    throw UnsupportedOperationException("sOEEOFFENDER not available on WASI — no C library access")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent not available on WASI — no C library access")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent not available on WASI — no C library access")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on WASI — no C library access")

public actual fun getrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 not available on WASI — no C library access")

public actual fun setrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 not available on WASI — no C library access")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on WASI — no C library access")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on WASI — no C library access")

public actual fun prlimit(pid: Int, resource: Int, newLimit: Rlimit?, oldLimit: Rlimit?): Int =
    throw UnsupportedOperationException("prlimit not available on WASI — no C library access")

public actual fun prlimit64(pid: Int, resource: Int, newLimit: Rlimit64?, oldLimit: Rlimit64?): Int =
    throw UnsupportedOperationException("prlimit64 not available on WASI — no C library access")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on WASI — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("gettimeofday not available on WASI — no C library access")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("mlock2 not available on WASI — no C library access")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise not available on WASI — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on WASI — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on WASI — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int =
    io.github.kotlinmania.libc.internal.WasiLibcEnv.getnameinfo(
        sa,
        salen,
        if (host != null && hostlen > 0uL) ByteArray(hostlen.toInt().coerceAtMost(4096)) else null,
        hostlen.toUInt(),
        if (serv != null && servlen > 0uL) ByteArray(servlen.toInt().coerceAtMost(4096)) else null,
        servlen.toUInt(),
        flags,
    )

public actual fun preadv(fd: Int, iov: Iovec?, count: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv not available on WASI — no C library access")

public actual fun pwritev(fd: Int, iov: Iovec?, count: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev not available on WASI — no C library access")

public actual fun processVmReadv(pid: Int, localIov: Iovec?, localIovCount: ULong, remoteIov: Iovec?, remoteIovCount: ULong, flags: ULong): Long =
    throw UnsupportedOperationException("processVmReadv not available on WASI — no C library access")

public actual fun processVmWritev(pid: Int, localIov: Iovec?, localIovCount: ULong, remoteIov: Iovec?, remoteIovCount: ULong, flags: ULong): Long =
    throw UnsupportedOperationException("processVmWritev not available on WASI — no C library access")

public actual fun ptrace(request: Int, vararg args: Any?): Long =
    throw UnsupportedOperationException("ptrace not available on WASI — no C library access")

public actual fun getpriority(which: Int, who: UInt): Int =
    throw UnsupportedOperationException("getpriority not available on WASI — no C library access")

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority not available on WASI — no C library access")

public actual fun schedCpualloc(count: ULong): CpuSetT? =
    throw UnsupportedOperationException("schedCpualloc not available on WASI — no C library access")

public actual fun schedCpufree(set: CpuSetT?): Unit = throw UnsupportedOperationException("schedCpufree not available on WASI — no C library access")

public actual fun schedCpucount(setsize: ULong, set: CpuSetT?): Int =
    throw UnsupportedOperationException("schedCpucount not available on WASI — no C library access")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu not available on WASI — no C library access")

public actual fun mallocInfo(options: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("mallocInfo not available on WASI — no C library access")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize not available on WASI — no C library access")

public actual fun utmpname(name: String?): Int =
    throw UnsupportedOperationException("utmpname not available on WASI — no C library access")

public actual fun setutent(): Unit = throw UnsupportedOperationException("setutent not available on WASI — no C library access")

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent not available on WASI — no C library access")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on WASI — no C library access")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on WASI — no C library access")

public actual fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate not available on WASI — no C library access")

public actual fun fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate64 not available on WASI — no C library access")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate not available on WASI — no C library access")

public actual fun posixFallocate64(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate64 not available on WASI — no C library access")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("getxattr not available on WASI — no C library access")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("lgetxattr not available on WASI — no C library access")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("fgetxattr not available on WASI — no C library access")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("setxattr not available on WASI — no C library access")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("lsetxattr not available on WASI — no C library access")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr not available on WASI — no C library access")

public actual fun listxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("listxattr not available on WASI — no C library access")

public actual fun llistxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("llistxattr not available on WASI — no C library access")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("flistxattr not available on WASI — no C library access")

public actual fun removexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("removexattr not available on WASI — no C library access")

public actual fun lremovexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("lremovexattr not available on WASI — no C library access")

public actual fun fremovexattr(filedes: Int, name: String?): Int =
    throw UnsupportedOperationException("fremovexattr not available on WASI — no C library access")

public actual fun signalfd(fd: Int, mask: ULong?, flags: Int): Int =
    throw UnsupportedOperationException("signalfd not available on WASI — no C library access")

public actual fun timerfdCreate(clock: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate not available on WASI — no C library access")

public actual fun timerfdGettime(fd: Int, currentValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime not available on WASI — no C library access")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime not available on WASI — no C library access")

public actual fun syscall(num: Long, vararg args: Any?): Long =
    throw UnsupportedOperationException("syscall not available on WASI — no C library access")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity not available on WASI — no C library access")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity not available on WASI — no C library access")

public actual fun epollCreate(size: Int): Int =
    throw UnsupportedOperationException("epollCreate not available on WASI — no C library access")

public actual fun epollCreate1(flags: Int): Int =
    throw UnsupportedOperationException("epollCreate1 not available on WASI — no C library access")

public actual fun epollWait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int): Int =
    throw UnsupportedOperationException("epollWait not available on WASI — no C library access")

public actual fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int =
    throw UnsupportedOperationException("epollCtl not available on WASI — no C library access")

public actual fun unshare(flags: Int): Int =
    throw UnsupportedOperationException("unshare not available on WASI — no C library access")

public actual fun umount(target: String?): Int =
    throw UnsupportedOperationException("umount not available on WASI — no C library access")

public actual fun schedGetPriorityMax(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMax not available on WASI — no C library access")

public actual fun tee(fdIn: Int, fdOut: Int, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("tee not available on WASI — no C library access")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("settimeofday not available on WASI — no C library access")

public actual fun splice(fdIn: Int, offIn: Long?, fdOut: Int, offOut: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("splice not available on WASI — no C library access")

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd not available on WASI — no C library access")

public actual fun eventfdRead(fd: Int, value: ULong?): Int =
    throw UnsupportedOperationException("eventfdRead not available on WASI — no C library access")

public actual fun eventfdWrite(fd: Int, value: ULong): Int =
    throw UnsupportedOperationException("eventfdWrite not available on WASI — no C library access")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval not available on WASI — no C library access")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait not available on WASI — no C library access")

public actual fun semGetvalue(sem: SemT?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue not available on WASI — no C library access")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam not available on WASI — no C library access")

public actual fun setns(fd: Int, nstype: Int): Int =
    throw UnsupportedOperationException("setns not available on WASI — no C library access")

public actual fun swapoff(puath: String?): Int =
    throw UnsupportedOperationException("swapoff not available on WASI — no C library access")

public actual fun vmsplice(fd: Int, iov: Iovec?, nrSegs: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("vmsplice not available on WASI — no C library access")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: ULong, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount not available on WASI — no C library access")

public actual fun personality(persona: UInt): Int =
    throw UnsupportedOperationException("personality not available on WASI — no C library access")

public actual fun prctl(option: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("prctl not available on WASI — no C library access")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam not available on WASI — no C library access")

public actual fun ppoll(fds: Pollfd?, nfds: UInt, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("ppoll not available on WASI — no C library access")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler not available on WASI — no C library access")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep not available on WASI — no C library access")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname not available on WASI — no C library access")

public actual fun schedGetPriorityMin(policy: Int): Int =
    throw UnsupportedOperationException("schedGetPriorityMin not available on WASI — no C library access")

public actual fun sysinfo(info: Sysinfo?): Int =
    throw UnsupportedOperationException("sysinfo not available on WASI — no C library access")

public actual fun umount2(target: String?, flags: Int): Int =
    throw UnsupportedOperationException("umount2 not available on WASI — no C library access")

public actual fun swapon(path: String?, swapflags: Int): Int =
    throw UnsupportedOperationException("swapon not available on WASI — no C library access")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler not available on WASI — no C library access")

public actual fun sendfile(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long =
    throw UnsupportedOperationException("sendfile not available on WASI — no C library access")

public actual fun sendfile64(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long =
    throw UnsupportedOperationException("sendfile64 not available on WASI — no C library access")

public actual fun setfsgid(gid: UInt): Int =
    throw UnsupportedOperationException("setfsgid not available on WASI — no C library access")

public actual fun setfsuid(uid: UInt): Int =
    throw UnsupportedOperationException("setfsuid not available on WASI — no C library access")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend not available on WASI — no C library access")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR not available on WASI — no C library access")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack not available on WASI — no C library access")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose not available on WASI — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR not available on WASI — no C library access")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on WASI — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on WASI — no C library access")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink not available on WASI — no C library access")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    throw UnsupportedOperationException("daemon not available on WASI — no C library access")

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait not available on WASI — no C library access")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait not available on WASI — no C library access")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid not available on WASI — no C library access")

public actual fun getgrouplist(user: String?, group: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist not available on WASI — no C library access")

public actual fun initgroups(user: String?, group: UInt): Int =
    throw UnsupportedOperationException("initgroups not available on WASI — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on WASI — no C library access")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat not available on WASI — no C library access")

public actual fun errno(): Int? =
    throw UnsupportedOperationException("errno not available on WASI — no C library access")

public actual fun inotifyRmWatch(fd: Int, wd: UInt): Int =
    throw UnsupportedOperationException("inotifyRmWatch not available on WASI — no C library access")

public actual fun inotifyInit(): Int =
    throw UnsupportedOperationException("inotifyInit not available on WASI — no C library access")

public actual fun inotifyInit1(flags: Int): Int =
    throw UnsupportedOperationException("inotifyInit1 not available on WASI — no C library access")

public actual fun inotifyAddWatch(fd: Int, path: String?, mask: UInt): Int =
    throw UnsupportedOperationException("inotifyAddWatch not available on WASI — no C library access")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp not available on WASI — no C library access")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec not available on WASI — no C library access")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on WASI — no C library access")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree not available on WASI — no C library access")

public actual fun androidSetAbortMessage(msg: String?): Unit = throw UnsupportedOperationException("androidSetAbortMessage not available on WASI — no C library access")

public actual fun gettid(): Int =
    throw UnsupportedOperationException("gettid not available on WASI — no C library access")

public actual fun tgkill(tgid: Int, tid: Int, sig: Int): Int =
    throw UnsupportedOperationException("tgkill not available on WASI — no C library access")

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval not available on WASI — no C library access")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom not available on WASI — no C library access")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy not available on WASI — no C library access")

public actual fun systemPropertySet(name: String?, value: String?): Int =
    throw UnsupportedOperationException("systemPropertySet not available on WASI — no C library access")

public actual fun systemPropertyGet(name: String?, value: String?): Int =
    throw UnsupportedOperationException("systemPropertyGet not available on WASI — no C library access")

public actual fun systemPropertyFind(name: String?): PropInfo? =
    throw UnsupportedOperationException("systemPropertyFind not available on WASI — no C library access")

public actual fun systemPropertyFindNth(n: UInt): PropInfo? =
    throw UnsupportedOperationException("systemPropertyFindNth not available on WASI — no C library access")

public actual fun arc4randomBuf(buf: COpaquePointer?, n: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf not available on WASI — no C library access")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray not available on WASI — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on WASI — no C library access")

public actual fun basename(path: String?): String? =
    throw UnsupportedOperationException("basename not available on WASI — no C library access")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong not available on WASI — no C library access")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on WASI — no C library access")

public actual fun syncfs(fd: Int): Int =
    throw UnsupportedOperationException("syncfs not available on WASI — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on WASI — no C library access")

public actual fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("freadUnlocked not available on WASI — no C library access")

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwriteUnlocked not available on WASI — no C library access")

public actual fun fflushUnlocked(stream: FILE?): Int =
    throw UnsupportedOperationException("fflushUnlocked not available on WASI — no C library access")

public actual fun fgetsUnlocked(buf: String?, size: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgetsUnlocked not available on WASI — no C library access")

public actual fun klogctl(syslogType: Int, bufp: String?, len: Int): Int =
    throw UnsupportedOperationException("klogctl not available on WASI — no C library access")

public actual fun memfdCreate(name: String?, flags: UInt): Int =
    throw UnsupportedOperationException("memfdCreate not available on WASI — no C library access")

public actual fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renameat2 not available on WASI — no C library access")

public actual fun clone(cb: ((COpaquePointer?) -> Int)?, childStack: COpaquePointer?, flags: Int, arg: COpaquePointer?, vararg args: Any?): Int =
    throw UnsupportedOperationException("clone not available on WASI — no C library access")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr not available on WASI — no C library access")

public actual fun systemPropertyForeach(callback: ((PropInfo?, COpaquePointer?) -> Unit)?, cookie: COpaquePointer?): Int =
    throw UnsupportedOperationException("systemPropertyForeach not available on WASI — no C library access")
