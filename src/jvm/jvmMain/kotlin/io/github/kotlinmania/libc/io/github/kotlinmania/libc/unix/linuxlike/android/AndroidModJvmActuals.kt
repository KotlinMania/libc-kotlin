package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.COpaquePointer

internal object AndroidModRawLibc {
    external fun setgrent()
    external fun endgrent()
    external fun getgrent(): Long?
    external fun getrlimit64(resource: Int, rlim: Long): Int
    external fun setrlimit64(resource: Int, rlim: Long): Int
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit(resource: Int, rlim: Long): Int
    external fun prlimit(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int
    external fun prlimit64(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun mlock2(addr: Long, len: Long, flags: Int): Int
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun preadv(fd: Int, iov: Long, count: Int, offset: Long): Long
    external fun pwritev(fd: Int, iov: Long, count: Int, offset: Long): Long
    external fun processVmReadv(pid: Int, localIov: Long, localIovCount: Long, remoteIov: Long, remoteIovCount: Long, flags: Long): Long
    external fun processVmWritev(pid: Int, localIov: Long, localIovCount: Long, remoteIov: Long, remoteIovCount: Long, flags: Long): Long
    external fun getpriority(which: Int, who: Long): Int
    external fun setpriority(which: Int, who: Long, prio: Int): Int
    external fun schedCpualloc(count: Long): Long?
    external fun schedCpufree(set: Long)
    external fun schedCpucount(setsize: Long, set: Long): Int
    external fun schedGetcpu(): Int
    external fun mallinfo(): Long
    external fun mallocInfo(options: Int, stream: Long): Int
    external fun mallocUsableSize(ptr: Long): Long
    external fun utmpname(name: String?): Int
    external fun setutent()
    external fun getutent(): Long?
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int
    external fun fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun posixFallocate64(fd: Int, offset: Long, len: Long): Int
    external fun getxattr(path: String?, name: String?, value: Long, size: Long): Long
    external fun lgetxattr(path: String?, name: String?, value: Long, size: Long): Long
    external fun fgetxattr(filedes: Int, name: String?, value: Long, size: Long): Long
    external fun setxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int
    external fun lsetxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int
    external fun fsetxattr(filedes: Int, name: String?, value: Long, size: Long, flags: Int): Int
    external fun listxattr(path: String?, list: Long, size: Long): Long
    external fun llistxattr(path: String?, list: Long, size: Long): Long
    external fun flistxattr(filedes: Int, list: Long, size: Long): Long
    external fun removexattr(path: String?, name: String?): Int
    external fun lremovexattr(path: String?, name: String?): Int
    external fun fremovexattr(filedes: Int, name: String?): Int
    external fun signalfd(fd: Int, mask: Long, flags: Int): Int
    external fun timerfdCreate(clock: Int, flags: Int): Int
    external fun timerfdGettime(fd: Int, currentValue: Long): Int
    external fun timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int
    external fun schedGetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int
    external fun schedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int
    external fun epollCreate(size: Int): Int
    external fun epollCreate1(flags: Int): Int
    external fun epollWait(epfd: Int, events: Long, maxevents: Int, timeout: Int): Int
    external fun epollCtl(epfd: Int, op: Int, fd: Int, event: Long): Int
    external fun unshare(flags: Int): Int
    external fun umount(target: String?): Int
    external fun schedGetPriorityMax(policy: Int): Int
    external fun tee(fdIn: Int, fdOut: Int, len: Long, flags: Int): Long
    external fun settimeofday(tv: Long, tz: Long): Int
    external fun splice(fdIn: Int, offIn: Long, fdOut: Int, offOut: Long, len: Long, flags: Int): Long
    external fun eventfd(initval: Int, flags: Int): Int
    external fun eventfdRead(fd: Int, value: Long): Int
    external fun eventfdWrite(fd: Int, value: Long): Int
    external fun schedRrGetInterval(pid: Int, tp: Long): Int
    external fun semTimedwait(sem: Long, abstime: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
    external fun schedSetparam(pid: Int, param: Long): Int
    external fun setns(fd: Int, nstype: Int): Int
    external fun swapoff(puath: String?): Int
    external fun vmsplice(fd: Int, iov: Long, nrSegs: Long, flags: Int): Long
    external fun mount(src: String?, target: String?, fstype: String?, flags: Long, data: Long): Int
    external fun personality(persona: Int): Int
    external fun schedGetparam(pid: Int, param: Long): Int
    external fun ppoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int
    external fun schedGetscheduler(pid: Int): Int
    external fun clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun sethostname(name: String?, len: Long): Int
    external fun schedGetPriorityMin(policy: Int): Int
    external fun sysinfo(info: Long): Int
    external fun umount2(target: String?, flags: Int): Int
    external fun swapon(path: String?, swapflags: Int): Int
    external fun schedSetscheduler(pid: Int, policy: Int, param: Long): Int
    external fun sendfile(outFd: Int, inFd: Int, offset: Long, count: Long): Long
    external fun sendfile64(outFd: Int, inFd: Int, offset: Long, count: Long): Long
    external fun setfsgid(gid: Int): Int
    external fun setfsuid(uid: Int): Int
    external fun sigsuspend(mask: Long): Int
    external fun getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun sigaltstack(ss: Long, oss: Long): Int
    external fun semClose(sem: Long): Int
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun semUnlink(name: String?): Int
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
    external fun sigwait(set: Long, sig: Long): Int
    external fun getgrgid(gid: Int): Long?
    external fun getgrouplist(user: String?, group: Int, groups: Long, ngroups: Long): Int
    external fun initgroups(user: String?, group: Int): Int
    external fun popen(command: String?, mode: String?): Long?
    external fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun errno(): Long?
    external fun inotifyRmWatch(fd: Int, wd: Int): Int
    external fun inotifyInit(): Int
    external fun inotifyInit1(flags: Int): Int
    external fun inotifyAddWatch(fd: Int, path: String?, mask: Int): Int
    external fun regcomp(preg: Long, pattern: String?, cflags: Int): Int
    external fun regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int
    external fun regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long
    external fun regfree(preg: Long)
    external fun androidSetAbortMessage(msg: String?)
    external fun gettid(): Int
    external fun tgkill(tgid: Int, tid: Int, sig: Int): Int
    external fun getauxval(type: Long): Long
    external fun getrandom(buf: Long, buflen: Long, flags: Int): Long
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun systemPropertySet(name: String?, value: String?): Int
    external fun systemPropertyGet(name: String?, value: Long): Int
    external fun systemPropertyFind(name: String?): Long?
    external fun systemPropertyFindNth(n: Int): Long?
    external fun systemPropertyForeach(callback: Long, cookie: Long): Int
    external fun dlIteratePhdr(callback: Long, data: Long): Int
    external fun arc4random(): Int
    external fun arc4randomUniform(upperBound: Int): Int
    external fun arc4randomBuf(buf: Long, n: Long)
    external fun reallocarray(ptr: Long, nmemb: Long, size: Long): Long?
    external fun dirname(path: String?): Long?
    external fun basename(path: String?): Long?
    external fun getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int
    external fun sync()
    external fun syncfs(fd: Int): Int
    external fun memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long?
    external fun freadUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long
    external fun fwriteUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long
    external fun fflushUnlocked(stream: Long): Int
    external fun fgetsUnlocked(buf: Long, size: Int, stream: Long): Long?
    external fun klogctl(syslogType: Int, bufp: Long, len: Int): Int
    external fun memfdCreate(name: String?, flags: Int): Int
    external fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: Int): Int
}

public actual fun setgrent() {
    AndroidModRawLibc.setgrent()
}

public actual fun endgrent() {
    AndroidModRawLibc.endgrent()
}

public actual fun getgrent(): Group? =
    AndroidModRawLibc.getgrent()

public actual fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    AndroidModRawLibc.getrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    AndroidModRawLibc.setrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    AndroidModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    AndroidModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    AndroidModRawLibc.prlimit(pid, resource, newLimit?.toLong() ?: 0L, oldLimit?.toLong() ?: 0L)

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    AndroidModRawLibc.prlimit64(pid, resource, newLimit?.toLong() ?: 0L, oldLimit?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    AndroidModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    AndroidModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    AndroidModRawLibc.mlock2(addr?.value ?: 0L, len, flags)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    AndroidModRawLibc.madvise(addr?.value ?: 0L, len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    AndroidModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    AndroidModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    AndroidModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun preadv(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT =
    AndroidModRawLibc.preadv(fd, iov?.toLong() ?: 0L, count, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT =
    AndroidModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, count, offset)

public actual fun processVmReadv(pid: PidT, localIov: Iovec?, localIovCount: CUlong, remoteIov: Iovec?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    AndroidModRawLibc.processVmReadv(pid, localIov?.toLong() ?: 0L, localIovCount, remoteIov?.toLong() ?: 0L, remoteIovCount, flags)

public actual fun processVmWritev(pid: PidT, localIov: Iovec?, localIovCount: CUlong, remoteIov: Iovec?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    AndroidModRawLibc.processVmWritev(pid, localIov?.toLong() ?: 0L, localIovCount, remoteIov?.toLong() ?: 0L, remoteIovCount, flags)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    AndroidModRawLibc.getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    AndroidModRawLibc.setpriority(which, who, prio)

public actual fun schedCpualloc(count: SizeT): io.github.kotlinmania.libc.CpuSetT? =
    AndroidModRawLibc.schedCpualloc(count)

public actual fun schedCpufree(set: io.github.kotlinmania.libc.CpuSetT?) {
    AndroidModRawLibc.schedCpufree(set?.toLong() ?: 0L)
}

public actual fun schedCpucount(setsize: SizeT, set: CpuSetT?): CInt =
    AndroidModRawLibc.schedCpucount(setsize, set?.toLong() ?: 0L)

public actual fun schedGetcpu(): CInt =
    AndroidModRawLibc.schedGetcpu()

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    AndroidModRawLibc.mallinfo()

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    AndroidModRawLibc.mallocInfo(options, stream?.toLong() ?: 0L)

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    AndroidModRawLibc.mallocUsableSize(ptr?.value ?: 0L)

public actual fun utmpname(name: String?): CInt =
    AndroidModRawLibc.utmpname(name)

public actual fun setutent() {
    AndroidModRawLibc.setutent()
}

public actual fun getutent(): Utmp? =
    AndroidModRawLibc.getutent()

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    AndroidModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    AndroidModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    AndroidModRawLibc.fallocate(fd, mode, offset, len)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    AndroidModRawLibc.fallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    AndroidModRawLibc.posixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    AndroidModRawLibc.posixFallocate64(fd, offset, len)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    AndroidModRawLibc.getxattr(path, name, value?.value ?: 0L, size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    AndroidModRawLibc.lgetxattr(path, name, value?.value ?: 0L, size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    AndroidModRawLibc.fgetxattr(filedes, name, value?.value ?: 0L, size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    AndroidModRawLibc.setxattr(path, name, value?.value ?: 0L, size, flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    AndroidModRawLibc.lsetxattr(path, name, value?.value ?: 0L, size, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    AndroidModRawLibc.fsetxattr(filedes, name, value?.value ?: 0L, size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    AndroidModRawLibc.listxattr(path, list?.value ?: 0L, size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    AndroidModRawLibc.llistxattr(path, list?.value ?: 0L, size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    AndroidModRawLibc.flistxattr(filedes, list?.value ?: 0L, size)

public actual fun removexattr(path: String?, name: String?): CInt =
    AndroidModRawLibc.removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    AndroidModRawLibc.lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    AndroidModRawLibc.fremovexattr(filedes, name)

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    AndroidModRawLibc.signalfd(fd, mask?.toLong() ?: 0L, flags)

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    AndroidModRawLibc.timerfdCreate(clock, flags)

public actual fun timerfdGettime(fd: CInt, currentValue: Itimerspec?): CInt =
    AndroidModRawLibc.timerfdGettime(fd, currentValue?.toLong() ?: 0L)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    AndroidModRawLibc.timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    AndroidModRawLibc.schedGetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    AndroidModRawLibc.schedSetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun epollCreate(size: CInt): CInt =
    AndroidModRawLibc.epollCreate(size)

public actual fun epollCreate1(flags: CInt): CInt =
    AndroidModRawLibc.epollCreate1(flags)

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    AndroidModRawLibc.epollWait(epfd, events?.toLong() ?: 0L, maxevents, timeout)

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    AndroidModRawLibc.epollCtl(epfd, op, fd, event?.toLong() ?: 0L)

public actual fun unshare(flags: CInt): CInt =
    AndroidModRawLibc.unshare(flags)

public actual fun umount(target: String?): CInt =
    AndroidModRawLibc.umount(target)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    AndroidModRawLibc.schedGetPriorityMax(policy)

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    AndroidModRawLibc.tee(fdIn, fdOut, len, flags)

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    AndroidModRawLibc.settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT =
    AndroidModRawLibc.splice(fdIn, offIn?.toLong() ?: 0L, fdOut, offOut?.toLong() ?: 0L, len, flags)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    AndroidModRawLibc.eventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: ULong?): CInt =
    AndroidModRawLibc.eventfdRead(fd, value?.toLong() ?: 0L)

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    AndroidModRawLibc.eventfdWrite(fd, value)

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    AndroidModRawLibc.schedRrGetInterval(pid, tp?.toLong() ?: 0L)

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    AndroidModRawLibc.semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    AndroidModRawLibc.semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    AndroidModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    AndroidModRawLibc.setns(fd, nstype)

public actual fun swapoff(puath: String?): CInt =
    AndroidModRawLibc.swapoff(puath)

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: SizeT, flags: CUint): SsizeT =
    AndroidModRawLibc.vmsplice(fd, iov?.toLong() ?: 0L, nrSegs, flags)

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    AndroidModRawLibc.mount(src, target, fstype, flags, data?.value ?: 0L)

public actual fun personality(persona: CUint): CInt =
    AndroidModRawLibc.personality(persona)

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    AndroidModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    AndroidModRawLibc.ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    AndroidModRawLibc.schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    AndroidModRawLibc.clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    AndroidModRawLibc.sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    AndroidModRawLibc.schedGetPriorityMin(policy)

public actual fun sysinfo(info: Sysinfo?): CInt =
    AndroidModRawLibc.sysinfo(info?.toLong() ?: 0L)

public actual fun umount2(target: String?, flags: CInt): CInt =
    AndroidModRawLibc.umount2(target, flags)

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    AndroidModRawLibc.swapon(path, swapflags)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    AndroidModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: CLong?, count: SizeT): SsizeT =
    AndroidModRawLibc.sendfile(outFd, inFd, offset?.toLong() ?: 0L, count)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: SizeT): SsizeT =
    AndroidModRawLibc.sendfile64(outFd, inFd, offset?.toLong() ?: 0L, count)

public actual fun setfsgid(gid: GidT): CInt =
    AndroidModRawLibc.setfsgid(gid)

public actual fun setfsuid(uid: UidT): CInt =
    AndroidModRawLibc.setfsuid(uid)

public actual fun sigsuspend(mask: SigsetT?): CInt =
    AndroidModRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    AndroidModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    AndroidModRawLibc.sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)

public actual fun semClose(sem: SemT?): CInt =
    AndroidModRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    AndroidModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrnam(name: String?): Group? =
    AndroidModRawLibc.getgrnam(name)

public actual fun semUnlink(name: String?): CInt =
    AndroidModRawLibc.semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    AndroidModRawLibc.daemon(nochdir, noclose)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    AndroidModRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    AndroidModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun getgrgid(gid: GidT): Group? =
    AndroidModRawLibc.getgrgid(gid)

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    AndroidModRawLibc.getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun initgroups(user: String?, group: GidT): CInt =
    AndroidModRawLibc.initgroups(user, group)

public actual fun popen(command: String?, mode: String?): FILE? =
    AndroidModRawLibc.popen(command, mode)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    AndroidModRawLibc.faccessat(dirfd, pathname, mode, flags)

public actual fun errno(): CInt? =
    AndroidModRawLibc.errno()

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    AndroidModRawLibc.inotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    AndroidModRawLibc.inotifyInit()

public actual fun inotifyInit1(flags: CInt): CInt =
    AndroidModRawLibc.inotifyInit1(flags)

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    AndroidModRawLibc.inotifyAddWatch(fd, path, mask)

public actual fun regcomp(preg: io.github.kotlinmania.libc.RegexT?, pattern: String?, cflags: CInt): CInt =
    AndroidModRawLibc.regcomp(preg?.toLong() ?: 0L, pattern, cflags)

public actual fun regexec(preg: io.github.kotlinmania.libc.RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    AndroidModRawLibc.regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    AndroidModRawLibc.regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)

public actual fun regfree(preg: io.github.kotlinmania.libc.RegexT?) {
    AndroidModRawLibc.regfree(preg?.toLong() ?: 0L)
}

public actual fun androidSetAbortMessage(msg: String?) {
    AndroidModRawLibc.androidSetAbortMessage(msg)
}

public actual fun gettid(): PidT =
    AndroidModRawLibc.gettid()

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    AndroidModRawLibc.tgkill(tgid, tid, sig)

public actual fun getauxval(type: CUlong): CUlong =
    AndroidModRawLibc.getauxval(type)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    AndroidModRawLibc.getrandom(buf?.value ?: 0L, buflen, flags)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    AndroidModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun systemPropertySet(name: String?, value: String?): CInt =
    AndroidModRawLibc.systemPropertySet(name, value)

public actual fun systemPropertyGet(name: String?, value: COpaquePointer?): CInt =
    AndroidModRawLibc.systemPropertyGet(name, value?.value ?: 0L)

public actual fun systemPropertyFind(name: String?): PropInfo? =
    AndroidModRawLibc.systemPropertyFind(name)

public actual fun systemPropertyFindNth(n: CUint): PropInfo? =
    AndroidModRawLibc.systemPropertyFindNth(n)

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: COpaquePointer?): CInt =
    AndroidModRawLibc.systemPropertyForeach(callback, cookie?.value ?: 0L)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    AndroidModRawLibc.dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun arc4random(): UInt =
    AndroidModRawLibc.arc4random()

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    AndroidModRawLibc.arc4randomUniform(upperBound)

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    AndroidModRawLibc.arc4randomBuf(buf?.value ?: 0L, n)
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    AndroidModRawLibc.reallocarray(ptr?.value ?: 0L, nmemb, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirname(path: String?): COpaquePointer? =
    AndroidModRawLibc.dirname(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: String?): COpaquePointer? =
    AndroidModRawLibc.basename(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    AndroidModRawLibc.getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)

public actual fun sync() {
    AndroidModRawLibc.sync()
}

public actual fun syncfs(fd: CInt): CInt =
    AndroidModRawLibc.syncfs(fd)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    AndroidModRawLibc.memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    AndroidModRawLibc.freadUnlocked(buf?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    AndroidModRawLibc.fwriteUnlocked(buf?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun fflushUnlocked(stream: FILE?): CInt =
    AndroidModRawLibc.fflushUnlocked(stream?.toLong() ?: 0L)

public actual fun fgetsUnlocked(buf: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    AndroidModRawLibc.fgetsUnlocked(buf?.value ?: 0L, size, stream?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    AndroidModRawLibc.klogctl(syslogType, bufp?.value ?: 0L, len)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    AndroidModRawLibc.memfdCreate(name, flags)

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    AndroidModRawLibc.renameat2(olddirfd, oldpath, newdirfd, newpath, flags)
