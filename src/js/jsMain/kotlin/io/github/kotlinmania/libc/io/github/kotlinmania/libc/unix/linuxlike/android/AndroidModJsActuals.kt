package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.COpaquePointer

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun endgrent() {
    js("require('@kotlinmania/libc-native-bindings').endgrent()")
}

public actual fun getgrent(): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrent()") as Group?

public actual fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit64(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun prlimit(pid: PidT, resource: CInt, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').prlimit(pid, resource, newLimit?.toLong() ?: 0L, oldLimit?.toLong() ?: 0L)") as CInt

public actual fun prlimit64(pid: PidT, resource: CInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').prlimit64(pid, resource, newLimit?.toLong() ?: 0L, oldLimit?.toLong() ?: 0L)") as CInt

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mlock2(addr?.value ?: 0L, len, flags)") as CInt

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').madvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun preadv(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, count, offset)") as SsizeT

public actual fun pwritev(fd: CInt, iov: Iovec?, count: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, count, offset)") as SsizeT

public actual fun processVmReadv(pid: PidT, localIov: Iovec?, localIovCount: CUlong, remoteIov: Iovec?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').processVmReadv(pid, localIov?.toLong() ?: 0L, localIovCount, remoteIov?.toLong() ?: 0L, remoteIovCount, flags)") as SsizeT

public actual fun processVmWritev(pid: PidT, localIov: Iovec?, localIovCount: CUlong, remoteIov: Iovec?, remoteIovCount: CUlong, flags: CUlong): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').processVmWritev(pid, localIov?.toLong() ?: 0L, localIovCount, remoteIov?.toLong() ?: 0L, remoteIovCount, flags)") as SsizeT

public actual fun getpriority(which: CInt, who: IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun schedCpualloc(count: SizeT): io.github.kotlinmania.libc.CpuSetT? =
    js("require('@kotlinmania/libc-native-bindings').schedCpualloc(count)") as io.github.kotlinmania.libc.CpuSetT?

public actual fun schedCpufree(set: io.github.kotlinmania.libc.CpuSetT?) {
    js("require('@kotlinmania/libc-native-bindings').schedCpufree(set?.toLong() ?: 0L)")
}

public actual fun schedCpucount(setsize: SizeT, set: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedCpucount(setsize, set?.toLong() ?: 0L)") as CInt

public actual fun schedGetcpu(): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetcpu()") as CInt

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    js("require('@kotlinmania/libc-native-bindings').mallinfo()") as io.github.kotlinmania.libc.Mallinfo

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mallocInfo(options, stream?.toLong() ?: 0L)") as CInt

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mallocUsableSize(ptr?.value ?: 0L)") as SizeT

public actual fun utmpname(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').utmpname(name)") as CInt

public actual fun setutent() {
    js("require('@kotlinmania/libc-native-bindings').setutent()")
}

public actual fun getutent(): Utmp? =
    js("require('@kotlinmania/libc-native-bindings').getutent()") as Utmp?

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    js("require('@kotlinmania/libc-native-bindings').seekdir(dirp?.toLong() ?: 0L, loc)")
}

public actual fun telldir(dirp: DIR?): CLong =
    js("require('@kotlinmania/libc-native-bindings').telldir(dirp?.toLong() ?: 0L)") as CLong

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').fallocate(fd, mode, offset, len)") as CInt

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').fallocate64(fd, mode, offset, len)") as CInt

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate(fd, offset, len)") as CInt

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate64(fd, offset, len)") as CInt

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getxattr(path, name, value?.value ?: 0L, size)") as SsizeT

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').lgetxattr(path, name, value?.value ?: 0L, size)") as SsizeT

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').fgetxattr(filedes, name, value?.value ?: 0L, size)") as SsizeT

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setxattr(path, name, value?.value ?: 0L, size, flags)") as CInt

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').lsetxattr(path, name, value?.value ?: 0L, size, flags)") as CInt

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetxattr(filedes, name, value?.value ?: 0L, size, flags)") as CInt

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').listxattr(path, list?.value ?: 0L, size)") as SsizeT

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').llistxattr(path, list?.value ?: 0L, size)") as SsizeT

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').flistxattr(filedes, list?.value ?: 0L, size)") as SsizeT

public actual fun removexattr(path: String?, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').removexattr(path, name)") as CInt

public actual fun lremovexattr(path: String?, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lremovexattr(path, name)") as CInt

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fremovexattr(filedes, name)") as CInt

public actual fun signalfd(fd: CInt, mask: SigsetT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').signalfd(fd, mask?.toLong() ?: 0L, flags)") as CInt

public actual fun timerfdCreate(clock: ClockidT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdCreate(clock, flags)") as CInt

public actual fun timerfdGettime(fd: CInt, currentValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdGettime(fd, currentValue?.toLong() ?: 0L)") as CInt

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)") as CInt

public actual fun epollCreate(size: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCreate(size)") as CInt

public actual fun epollCreate1(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCreate1(flags)") as CInt

public actual fun epollWait(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollWait(epfd, events?.toLong() ?: 0L, maxevents, timeout)") as CInt

public actual fun epollCtl(epfd: CInt, op: CInt, fd: CInt, event: EpollEvent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').epollCtl(epfd, op, fd, event?.toLong() ?: 0L)") as CInt

public actual fun unshare(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').unshare(flags)") as CInt

public actual fun umount(target: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').umount(target)") as CInt

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMax(policy)") as CInt

public actual fun tee(fdIn: CInt, fdOut: CInt, len: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').tee(fdIn, fdOut, len, flags)") as SsizeT

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun splice(fdIn: CInt, offIn: CLonglong?, fdOut: CInt, offOut: CLonglong?, len: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').splice(fdIn, offIn?.toLong() ?: 0L, fdOut, offOut?.toLong() ?: 0L, len, flags)") as SsizeT

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfd(initval, flags)") as CInt

public actual fun eventfdRead(fd: CInt, value: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfdRead(fd, value?.toLong() ?: 0L)") as CInt

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfdWrite(fd, value)") as CInt

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedRrGetInterval(pid, tp?.toLong() ?: 0L)") as CInt

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)") as CInt

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun setns(fd: CInt, nstype: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setns(fd, nstype)") as CInt

public actual fun swapoff(puath: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapoff(puath)") as CInt

public actual fun vmsplice(fd: CInt, iov: Iovec?, nrSegs: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').vmsplice(fd, iov?.toLong() ?: 0L, nrSegs, flags)") as SsizeT

public actual fun mount(src: String?, target: String?, fstype: String?, flags: CUlong, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mount(src, target, fstype, flags, data?.value ?: 0L)") as CInt

public actual fun personality(persona: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').personality(persona)") as CInt

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun schedGetscheduler(pid: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetscheduler(pid)") as CInt

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun sethostname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetPriorityMin(policy)") as CInt

public actual fun sysinfo(info: Sysinfo?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysinfo(info?.toLong() ?: 0L)") as CInt

public actual fun umount2(target: String?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').umount2(target, flags)") as CInt

public actual fun swapon(path: String?, swapflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').swapon(path, swapflags)") as CInt

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetscheduler(pid, policy, param?.toLong() ?: 0L)") as CInt

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: CLong?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendfile(outFd, inFd, offset?.toLong() ?: 0L, count)") as SsizeT

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: Off64T?, count: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendfile64(outFd, inFd, offset?.toLong() ?: 0L, count)") as SsizeT

public actual fun setfsgid(gid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setfsgid(gid)") as CInt

public actual fun setfsuid(uid: UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setfsuid(uid)") as CInt

public actual fun sigsuspend(mask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigsuspend(mask?.toLong() ?: 0L)") as CInt

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)") as CInt

public actual fun semClose(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrnam(name: String?): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as Group?

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun getgrgid(gid: GidT): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as Group?

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)") as CInt

public actual fun initgroups(user: String?, group: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(user, group)") as CInt

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').faccessat(dirfd, pathname, mode, flags)") as CInt

public actual fun errno(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errno()") as CInt?

public actual fun inotifyRmWatch(fd: CInt, wd: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyRmWatch(fd, wd)") as CInt

public actual fun inotifyInit(): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyInit()") as CInt

public actual fun inotifyInit1(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyInit1(flags)") as CInt

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').inotifyAddWatch(fd, path, mask)") as CInt

public actual fun regcomp(preg: io.github.kotlinmania.libc.RegexT?, pattern: String?, cflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regcomp(preg?.toLong() ?: 0L, pattern, cflags)") as CInt

public actual fun regexec(preg: io.github.kotlinmania.libc.RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)") as CInt

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)") as SizeT

public actual fun regfree(preg: io.github.kotlinmania.libc.RegexT?) {
    js("require('@kotlinmania/libc-native-bindings').regfree(preg?.toLong() ?: 0L)")
}

public actual fun androidSetAbortMessage(msg: String?) {
    js("require('@kotlinmania/libc-native-bindings').androidSetAbortMessage(msg)")
}

public actual fun gettid(): PidT =
    js("require('@kotlinmania/libc-native-bindings').gettid()") as PidT

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').tgkill(tgid, tid, sig)") as CInt

public actual fun getauxval(type: CUlong): CUlong =
    js("require('@kotlinmania/libc-native-bindings').getauxval(type)") as CUlong

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getrandom(buf?.value ?: 0L, buflen, flags)") as SsizeT

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getentropy(buf?.value ?: 0L, buflen)") as CInt

public actual fun systemPropertySet(name: String?, value: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').systemPropertySet(name, value)") as CInt

public actual fun systemPropertyGet(name: String?, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').systemPropertyGet(name, value?.value ?: 0L)") as CInt

public actual fun systemPropertyFind(name: String?): PropInfo? =
    js("require('@kotlinmania/libc-native-bindings').systemPropertyFind(name)") as PropInfo?

public actual fun systemPropertyFindNth(n: CUint): PropInfo? =
    js("require('@kotlinmania/libc-native-bindings').systemPropertyFindNth(n)") as PropInfo?

public actual fun systemPropertyForeach(callback: SystemPropertyForeachCallbackCallback, cookie: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').systemPropertyForeach(callback, cookie?.value ?: 0L)") as CInt

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun arc4random(): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4random()") as UInt

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    js("require('@kotlinmania/libc-native-bindings').arc4randomUniform(upperBound)") as UInt

public actual fun arc4randomBuf(buf: COpaquePointer?, n: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').arc4randomBuf(buf?.value ?: 0L, n)")
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').reallocarray(ptr?.value ?: 0L, nmemb, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirname(path: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dirname(path)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').basename(path)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)") as CInt

public actual fun sync() {
    js("require('@kotlinmania/libc-native-bindings').sync()")
}

public actual fun syncfs(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').syncfs(fd)") as CInt

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').freadUnlocked(buf?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)") as SizeT

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').fwriteUnlocked(buf?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)") as SizeT

public actual fun fflushUnlocked(stream: FILE?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fflushUnlocked(stream?.toLong() ?: 0L)") as CInt

public actual fun fgetsUnlocked(buf: COpaquePointer?, size: CInt, stream: FILE?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').fgetsUnlocked(buf?.value ?: 0L, size, stream?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun klogctl(syslogType: CInt, bufp: COpaquePointer?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').klogctl(syslogType, bufp?.value ?: 0L, len)") as CInt

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').memfdCreate(name, flags)") as CInt

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').renameat2(olddirfd, oldpath, newdirfd, newpath, flags)") as CInt
