package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.COpaquePointer

internal object CygwinModRawLibc {
    external fun sigwait(set: Long, sig: Long): Int
    external fun sigwaitinfo(set: Long, info: Long): Int
    external fun pthreadSigmask(how: Int, set: Long, oldset: Long): Int
    external fun sigsuspend(mask: Long): Int
    external fun sigaltstack(ss: Long, oss: Long): Int
    external fun pthreadKill(thread: Long, sig: Int): Int
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
    external fun strftime(s: Long, max: Long, format: String?, tm: Long): Long
    external fun asctimeR(tm: Long, buf: Long): Long?
    external fun ctimeR(timep: Long, buf: Long): Long?
    external fun strptime(s: String?, format: String?, tm: Long): Long?
    external fun clockSettime(clkId: Int, tp: Long): Int
    external fun clockGettime(clkId: Int, tp: Long): Int
    external fun clockGetres(clkId: Int, tp: Long): Int
    external fun timerCreate(clockid: Int, sevp: Long, timerid: Long): Int
    external fun timerDelete(timerid: Long): Int
    external fun timerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int
    external fun timerGettime(timerid: Long, currValue: Long): Int
    external fun timerGetoverrun(timerid: Long): Int
    external fun clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun clockGetcpuclockid(pid: Int, clkId: Long): Int
    external fun futimes(fd: Int, times: Long): Int
    external fun lutimes(file: String?, times: Long): Int
    external fun settimeofday(tv: Long, tz: Long): Int
    external fun getitimer(which: Int, currValue: Long): Int
    external fun setitimer(which: Int, newValue: Long, oldValue: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun futimesat(fd: Int, path: String?, times: Long): Int
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit(resource: Int, rlim: Long): Int
    external fun getpriority(which: Int, who: Long): Int
    external fun setpriority(which: Int, who: Long, prio: Int): Int
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwent(): Long?
    external fun setpwent()
    external fun endpwent()
    external fun ifNameindex(): Long?
    external fun ifFreenameindex(ptr: Long)
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun dlfork(value: Int)
    external fun accept4(s: Int, addr: Long, addrlen: Long, flags: Int): Int
    external fun bind(socket: Int, address: Long, addressLen: Int): Int
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun recvmsg(fd: Int, msg: Long, flags: Int): Long
    external fun sendmsg(fd: Int, msg: Long, flags: Int): Long
    external fun getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, sevlen: Int, flags: Int): Int
    external fun ppoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun freelocale(loc: Long)
    external fun duplocale(base: Long): Long
    external fun uselocale(loc: Long): Long
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun semDestroy(sem: Long): Int
    external fun semClose(sem: Long): Int
    external fun semUnlink(name: String?): Int
    external fun semTimedwait(sem: Long, abstime: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
    external fun clearenv(): Int
    external fun ptsnameR(fd: Int, buf: Long, buflen: Long): Int
    external fun getpt(): Int
    external fun memalign(align: Long, size: Long): Long?
    external fun getloadavg(loadavg: Long, nelem: Int): Int
    external fun abs(i: Int): Int
    external fun arc4random(): Int
    external fun arc4randomUniform(l: Int): Int
    external fun arc4randomBuf(buf: Long, size: Long)
    external fun labs(i: Long): Long
    external fun mkostemp(template: Long, flags: Int): Int
    external fun mkostemps(template: Long, suffixlen: Int, flags: Int): Int
    external fun mkstemps(template: Long, suffixlen: Int): Int
    external fun rand(): Int
    external fun reallocarray(ptr: Long, nmemb: Long, size: Long): Long?
    external fun reallocf(ptr: Long, size: Long): Long?
    external fun srand(seed: Int)
    external fun drand48(): Double
    external fun erand48(xseed: Long): Double
    external fun jrand48(xseed: Long): Long
    external fun lcong48(p: Long)
    external fun lrand48(): Long
    external fun mrand48(): Long
    external fun nrand48(xseed: Long): Long
    external fun seed48(xseed: Long): Long?
    external fun srand48(seed: Long)
    external fun qsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun posixMadvise(addr: Long, len: Long, advice: Int): Int
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun explicitBzero(s: Long, len: Long)
    external fun ffs(value: Int): Int
    external fun ffsl(value: Long): Int
    external fun ffsll(value: Long): Int
    external fun fls(value: Int): Int
    external fun flsl(value: Long): Int
    external fun flsll(value: Long): Int
    external fun strcasecmpL(s1: String?, s2: String?, loc: Long): Int
    external fun strncasecmpL(s1: String?, s2: String?, n: Long, loc: Long): Int
    external fun timingsafeBcmp(a: Long, b: Long, len: Long): Int
    external fun timingsafeMemcmp(a: Long, b: Long, len: Long): Int
    external fun memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long?
    external fun memrchr(cx: Long, c: Int, n: Long): Long?
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun strsep(string: Long, delim: String?): Long?
    external fun basename(path: String?): Long?
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun dup3(src: Int, dst: Int, flags: Int): Int
    external fun eaccess(pathname: String?, mode: Int): Int
    external fun euidaccess(pathname: String?, mode: Int): Int
    external fun execvpe(file: String?, argv: Long, envp: Long): Int
    external fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun fexecve(fd: Int, argv: Long, envp: Long): Int
    external fun fdatasync(fd: Int): Int
    external fun getdomainname(name: Long, len: Long): Int
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun gethostid(): Long
    external fun getpagesize(): Int
    external fun getpeereid(socket: Int, euid: Long, egid: Long): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun pipe2(fds: Long, flags: Int): Int
    external fun sbrk(increment: Long): Long?
    external fun setgroups(ngroups: Int, ptr: Long): Int
    external fun sethostname(name: String?, len: Long): Int
    external fun vhangup(): Int
    external fun getdtablesize(): Int
    external fun sync()
    external fun errno(): Long?
    external fun schedSetparam(pid: Int, param: Long): Int
    external fun schedGetparam(pid: Int, param: Long): Int
    external fun schedSetscheduler(pid: Int, policy: Int, param: Long): Int
    external fun schedGetscheduler(pid: Int): Int
    external fun schedGetPriorityMax(policy: Int): Int
    external fun schedGetPriorityMin(policy: Int): Int
    external fun schedRrGetInterval(pid: Int, t: Long): Int
    external fun schedGetcpu(): Int
    external fun schedGetaffinity(pid: Int, cpusetsize: Long, mask: Long): Int
    external fun schedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int
    external fun pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrGetschedparam(attr: Long, param: Long): Int
    external fun pthreadAttrSetschedparam(attr: Long, param: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadCancel(thread: Long): Int
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Int): Int
    external fun pthreadCondattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadBarrierattrInit(attr: Long): Int
    external fun pthreadBarrierattrSetpshared(attr: Long, shared: Int): Int
    external fun pthreadBarrierattrGetpshared(attr: Long, shared: Long): Int
    external fun pthreadBarrierattrDestroy(attr: Long): Int
    external fun pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int
    external fun pthreadBarrierDestroy(barrier: Long): Int
    external fun pthreadBarrierWait(barrier: Long): Int
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun pthreadGetcpuclockid(thread: Long, clkId: Long): Int
    external fun pthreadGetschedparam(native: Long, policy: Long, param: Long): Int
    external fun pthreadMutexTimedlock(lock: Long, abstime: Long): Int
    external fun pthreadMutexattrGetprotocol(attr: Long, protocol: Long): Int
    external fun pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadMutexattrSetprotocol(attr: Long, protocol: Int): Int
    external fun pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadSpinDestroy(lock: Long): Int
    external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    external fun pthreadSpinLock(lock: Long): Int
    external fun pthreadSpinTrylock(lock: Long): Int
    external fun pthreadSpinUnlock(lock: Long): Int
    external fun pthreadRwlockattrGetpshared(attr: Long, value: Long): Int
    external fun pthreadRwlockattrSetpshared(attr: Long, value: Int): Int
    external fun pthreadSetschedparam(native: Long, policy: Int, param: Long): Int
    external fun pthreadSetschedprio(native: Long, priority: Int): Int
    external fun pthreadGetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int
    external fun pthreadGetattrNp(native: Long, attr: Long): Int
    external fun pthreadGetnameNp(thread: Long, name: Long, len: Long): Int
    external fun pthreadSetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int
    external fun pthreadSetnameNp(thread: Long, name: String?): Int
    external fun pthreadSigqueue(thread: Long, sig: Int, value: Long): Int
    external fun getrandom(buf: Long, buflen: Long, flags: Int): Long
    external fun mount(src: String?, target: String?, flags: Int): Int
    external fun umount(target: String?): Int
    external fun cygwinUmount(target: String?, flags: Int): Int
    external fun dirfd(dirp: Long): Int
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun uname(buf: Long): Int
    external fun posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnattrInit(attr: Long): Int
    external fun posixSpawnattrDestroy(attr: Long): Int
    external fun posixSpawnattrGetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrGetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrGetflags(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetflags(attr: Long, flags: Short): Int
    external fun posixSpawnattrGetpgroup(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetpgroup(attr: Long, flags: Int): Int
    external fun posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int
    external fun posixSpawnattrGetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnattrSetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnFileActionsInit(actions: Long): Int
    external fun posixSpawnFileActionsDestroy(actions: Long): Int
    external fun posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int
    external fun posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int
    external fun posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int
    external fun posixSpawnFileActionsAddchdir(actions: Long, path: String?): Int
    external fun posixSpawnFileActionsAddfchdir(actions: Long, fd: Int): Int
    external fun posixSpawnFileActionsAddchdirNp(actions: Long, path: String?): Int
    external fun posixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int
    external fun forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun getgrgid(gid: Int): Long?
    external fun getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrouplist(user: String?, group: Int, groups: Long, ngroups: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun initgroups(user: String?, group: Int): Int
    external fun statfs(path: String?, buf: Long): Int
    external fun fstatfs(fd: Int, buf: Long): Int
    external fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int
    external fun endutxent()
    external fun getutxent(): Long?
    external fun getutxid(id: Long): Long?
    external fun getutxline(line: Long): Long?
    external fun pututxline(utmpx: Long): Long?
    external fun setutxent()
    external fun utmpxname(file: String?): Int
    external fun updwtmpx(file: String?, utmpx: Long)
}

public actual fun sigwait(set: CUlong?, sig: CInt?): CInt =
    CygwinModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun sigwaitinfo(set: CUlong?, info: SiginfoT?): CInt =
    CygwinModRawLibc.sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun pthreadSigmask(how: CInt, set: CUlong?, oldset: CUlong?): CInt =
    CygwinModRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun sigsuspend(mask: CUlong?): CInt =
    CygwinModRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    CygwinModRawLibc.sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    CygwinModRawLibc.pthreadKill(thread, sig)

public actual fun sigtimedwait(set: CUlong?, info: SiginfoT?, timeout: Timespec?): CInt =
    CygwinModRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: Tm?): SizeT =
    CygwinModRawLibc.strftime(s?.value ?: 0L, max, format, tm?.toLong() ?: 0L)

public actual fun asctimeR(tm: Tm?, buf: COpaquePointer?): COpaquePointer? =
    CygwinModRawLibc.asctimeR(tm?.toLong() ?: 0L, buf?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: CLong?, buf: COpaquePointer?): COpaquePointer? =
    CygwinModRawLibc.ctimeR(timep?.toLong() ?: 0L, buf?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strptime(s: String?, format: String?, tm: Tm?): COpaquePointer? =
    CygwinModRawLibc.strptime(s, format, tm?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    CygwinModRawLibc.clockSettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    CygwinModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    CygwinModRawLibc.clockGetres(clkId, tp?.toLong() ?: 0L)

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: CUlong?): CInt =
    CygwinModRawLibc.timerCreate(clockid, sevp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)

public actual fun timerDelete(timerid: TimerT): CInt =
    CygwinModRawLibc.timerDelete(timerid)

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    CygwinModRawLibc.timerSettime(timerid, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    CygwinModRawLibc.timerGettime(timerid, currValue?.toLong() ?: 0L)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    CygwinModRawLibc.timerGetoverrun(timerid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    CygwinModRawLibc.clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun clockGetcpuclockid(pid: PidT, clkId: CUlong?): CInt =
    CygwinModRawLibc.clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)

public actual fun futimes(fd: CInt, times: Timeval?): CInt =
    CygwinModRawLibc.futimes(fd, times?.toLong() ?: 0L)

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    CygwinModRawLibc.lutimes(file, times?.toLong() ?: 0L)

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    CygwinModRawLibc.settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    CygwinModRawLibc.getitimer(which, currValue?.toLong() ?: 0L)

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    CygwinModRawLibc.setitimer(which, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    CygwinModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt =
    CygwinModRawLibc.futimesat(fd, path, times?.toLong() ?: 0L)

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    CygwinModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    CygwinModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    CygwinModRawLibc.getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    CygwinModRawLibc.setpriority(which, who, prio)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    CygwinModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    CygwinModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwent(): Passwd? =
    CygwinModRawLibc.getpwent()

public actual fun setpwent() {
    CygwinModRawLibc.setpwent()
}

public actual fun endpwent() {
    CygwinModRawLibc.endpwent()
}

public actual fun ifNameindex(): IfNameindex? =
    CygwinModRawLibc.ifNameindex()

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    CygwinModRawLibc.ifFreenameindex(ptr?.toLong() ?: 0L)
}

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    CygwinModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    CygwinModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    CygwinModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    CygwinModRawLibc.mknodat(dirfd, pathname, mode, dev)

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    CygwinModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    CygwinModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun dlfork(value: CInt) {
    CygwinModRawLibc.dlfork(value)
}

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: CInt?, flags: CInt): CInt =
    CygwinModRawLibc.accept4(s, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L, flags)

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    CygwinModRawLibc.bind(socket, address?.toLong() ?: 0L, addressLen)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: Sockaddr?, addrlen: CInt?): SsizeT =
    CygwinModRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    CygwinModRawLibc.recvmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    CygwinModRawLibc.sendmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, sevlen: SocklenT, flags: CInt): CInt =
    CygwinModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, sevlen, flags)

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: CUlong?): CInt =
    CygwinModRawLibc.ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    CygwinModRawLibc.newlocale(mask, locale, base)

public actual fun freelocale(loc: LocaleT) {
    CygwinModRawLibc.freelocale(loc)
}

public actual fun duplocale(base: LocaleT): LocaleT =
    CygwinModRawLibc.duplocale(base)

public actual fun uselocale(loc: LocaleT): LocaleT =
    CygwinModRawLibc.uselocale(loc)

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    CygwinModRawLibc.semInit(sem?.value ?: 0L, pshared, value)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    CygwinModRawLibc.semDestroy(sem?.value ?: 0L)

public actual fun semClose(sem: COpaquePointer?): CInt =
    CygwinModRawLibc.semClose(sem?.value ?: 0L)

public actual fun semUnlink(name: String?): CInt =
    CygwinModRawLibc.semUnlink(name)

public actual fun semTimedwait(sem: COpaquePointer?, abstime: Timespec?): CInt =
    CygwinModRawLibc.semTimedwait(sem?.value ?: 0L, abstime?.toLong() ?: 0L)

public actual fun semGetvalue(sem: COpaquePointer?, sval: CInt?): CInt =
    CygwinModRawLibc.semGetvalue(sem?.value ?: 0L, sval?.toLong() ?: 0L)

public actual fun clearenv(): CInt =
    CygwinModRawLibc.clearenv()

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    CygwinModRawLibc.ptsnameR(fd, buf?.value ?: 0L, buflen)

public actual fun getpt(): CInt =
    CygwinModRawLibc.getpt()

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    CygwinModRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    CygwinModRawLibc.getloadavg(loadavg?.toLong() ?: 0L, nelem)

public actual fun abs(i: CInt): CInt =
    CygwinModRawLibc.abs(i)

public actual fun arc4random(): UInt =
    CygwinModRawLibc.arc4random()

public actual fun arc4randomUniform(l: UInt): UInt =
    CygwinModRawLibc.arc4randomUniform(l)

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    CygwinModRawLibc.arc4randomBuf(buf?.value ?: 0L, size)
}

public actual fun labs(i: CLong): CLong =
    CygwinModRawLibc.labs(i)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    CygwinModRawLibc.mkostemp(template?.value ?: 0L, flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    CygwinModRawLibc.mkostemps(template?.value ?: 0L, suffixlen, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    CygwinModRawLibc.mkstemps(template?.value ?: 0L, suffixlen)

public actual fun rand(): CInt =
    CygwinModRawLibc.rand()

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    CygwinModRawLibc.reallocarray(ptr?.value ?: 0L, nmemb, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    CygwinModRawLibc.reallocf(ptr?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srand(seed: CUint) {
    CygwinModRawLibc.srand(seed)
}

public actual fun drand48(): CDouble =
    CygwinModRawLibc.drand48()

public actual fun erand48(xseed: CUshort?): CDouble =
    CygwinModRawLibc.erand48(xseed?.toLong() ?: 0L)

public actual fun jrand48(xseed: CUshort?): CLong =
    CygwinModRawLibc.jrand48(xseed?.toLong() ?: 0L)

public actual fun lcong48(p: CUshort?) {
    CygwinModRawLibc.lcong48(p?.toLong() ?: 0L)
}

public actual fun lrand48(): CLong =
    CygwinModRawLibc.lrand48()

public actual fun mrand48(): CLong =
    CygwinModRawLibc.mrand48()

public actual fun nrand48(xseed: CUshort?): CLong =
    CygwinModRawLibc.nrand48(xseed?.toLong() ?: 0L)

public actual fun seed48(xseed: CUshort?): CUshort? =
    CygwinModRawLibc.seed48(xseed?.toLong() ?: 0L)

public actual fun srand48(seed: CLong) {
    CygwinModRawLibc.srand48(seed)
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    CygwinModRawLibc.qsortR(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L, arg?.value ?: 0L)
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    CygwinModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    CygwinModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    CygwinModRawLibc.posixMadvise(addr?.value ?: 0L, len, advice)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    CygwinModRawLibc.madvise(addr?.value ?: 0L, len, advice)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    CygwinModRawLibc.shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    CygwinModRawLibc.shmUnlink(name)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    CygwinModRawLibc.explicitBzero(s?.value ?: 0L, len)
}

public actual fun ffs(value: CInt): CInt =
    CygwinModRawLibc.ffs(value)

public actual fun ffsl(value: CLong): CInt =
    CygwinModRawLibc.ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    CygwinModRawLibc.ffsll(value)

public actual fun fls(value: CInt): CInt =
    CygwinModRawLibc.fls(value)

public actual fun flsl(value: CLong): CInt =
    CygwinModRawLibc.flsl(value)

public actual fun flsll(value: CLonglong): CInt =
    CygwinModRawLibc.flsll(value)

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    CygwinModRawLibc.strcasecmpL(s1, s2, loc)

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    CygwinModRawLibc.strncasecmpL(s1, s2, n, loc)

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    CygwinModRawLibc.timingsafeBcmp(a?.value ?: 0L, b?.value ?: 0L, len)

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    CygwinModRawLibc.timingsafeMemcmp(a?.value ?: 0L, b?.value ?: 0L, len)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    CygwinModRawLibc.memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    CygwinModRawLibc.memrchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    CygwinModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    CygwinModRawLibc.strsep(string?.value ?: 0L, delim).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: String?): COpaquePointer? =
    CygwinModRawLibc.basename(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    CygwinModRawLibc.daemon(nochdir, noclose)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    CygwinModRawLibc.dup3(src, dst, flags)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    CygwinModRawLibc.eaccess(pathname, mode)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    CygwinModRawLibc.euidaccess(pathname, mode)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    CygwinModRawLibc.execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    CygwinModRawLibc.faccessat(dirfd, pathname, mode, flags)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    CygwinModRawLibc.fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun fdatasync(fd: CInt): CInt =
    CygwinModRawLibc.fdatasync(fd)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    CygwinModRawLibc.getdomainname(name?.value ?: 0L, len)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    CygwinModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun gethostid(): CLong =
    CygwinModRawLibc.gethostid()

public actual fun getpagesize(): CInt =
    CygwinModRawLibc.getpagesize()

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    CygwinModRawLibc.getpeereid(socket, euid?.toLong() ?: 0L, egid?.toLong() ?: 0L)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    CygwinModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    CygwinModRawLibc.pipe2(fds?.toLong() ?: 0L, flags)

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    CygwinModRawLibc.sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    CygwinModRawLibc.setgroups(ngroups, ptr?.toLong() ?: 0L)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    CygwinModRawLibc.sethostname(name, len)

public actual fun vhangup(): CInt =
    CygwinModRawLibc.vhangup()

public actual fun getdtablesize(): CInt =
    CygwinModRawLibc.getdtablesize()

public actual fun sync() {
    CygwinModRawLibc.sync()
}

public actual fun errno(): CInt? =
    CygwinModRawLibc.errno()

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    CygwinModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    CygwinModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    CygwinModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    CygwinModRawLibc.schedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    CygwinModRawLibc.schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    CygwinModRawLibc.schedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    CygwinModRawLibc.schedRrGetInterval(pid, t?.toLong() ?: 0L)

public actual fun schedGetcpu(): CInt =
    CygwinModRawLibc.schedGetcpu()

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: CpuSetT?): CInt =
    CygwinModRawLibc.schedGetaffinity(pid, cpusetsize, mask?.toLong() ?: 0L)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    CygwinModRawLibc.schedSetaffinity(pid, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    CygwinModRawLibc.pthreadAttrGetguardsize(attr?.value ?: 0L, guardsize?.toLong() ?: 0L)

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    CygwinModRawLibc.pthreadAttrGetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    CygwinModRawLibc.pthreadAttrSetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    CygwinModRawLibc.pthreadAttrGetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    CygwinModRawLibc.pthreadCancel(thread)

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: CUlong?): CInt =
    CygwinModRawLibc.pthreadCondattrGetclock(attr?.value ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    CygwinModRawLibc.pthreadCondattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    CygwinModRawLibc.pthreadCondattrSetclock(attr?.value ?: 0L, clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    CygwinModRawLibc.pthreadCondattrSetpshared(attr?.value ?: 0L, pshared)

public actual fun pthreadBarrierattrInit(attr: ULong?): CInt =
    CygwinModRawLibc.pthreadBarrierattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadBarrierattrSetpshared(attr: ULong?, shared: CInt): CInt =
    CygwinModRawLibc.pthreadBarrierattrSetpshared(attr?.toLong() ?: 0L, shared)

public actual fun pthreadBarrierattrGetpshared(attr: ULong?, shared: CInt?): CInt =
    CygwinModRawLibc.pthreadBarrierattrGetpshared(attr?.toLong() ?: 0L, shared?.toLong() ?: 0L)

public actual fun pthreadBarrierattrDestroy(attr: ULong?): CInt =
    CygwinModRawLibc.pthreadBarrierattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadBarrierInit(barrier: ULong?, attr: ULong?, count: CUint): CInt =
    CygwinModRawLibc.pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.toLong() ?: 0L, count)

public actual fun pthreadBarrierDestroy(barrier: ULong?): CInt =
    CygwinModRawLibc.pthreadBarrierDestroy(barrier?.toLong() ?: 0L)

public actual fun pthreadBarrierWait(barrier: ULong?): CInt =
    CygwinModRawLibc.pthreadBarrierWait(barrier?.toLong() ?: 0L)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    CygwinModRawLibc.pthreadCreate(native?.value ?: 0L, attr?.value ?: 0L, f, value?.value ?: 0L)

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: CUlong?): CInt =
    CygwinModRawLibc.pthreadGetcpuclockid(thread, clkId?.toLong() ?: 0L)

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    CygwinModRawLibc.pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: Timespec?): CInt =
    CygwinModRawLibc.pthreadMutexTimedlock(lock?.value ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: CInt?): CInt =
    CygwinModRawLibc.pthreadMutexattrGetprotocol(attr?.value ?: 0L, protocol?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    CygwinModRawLibc.pthreadMutexattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    CygwinModRawLibc.pthreadMutexattrSetprotocol(attr?.value ?: 0L, protocol)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    CygwinModRawLibc.pthreadMutexattrSetpshared(attr?.value ?: 0L, pshared)

public actual fun pthreadSpinDestroy(lock: ULong?): CInt =
    CygwinModRawLibc.pthreadSpinDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadSpinInit(lock: ULong?, pshared: CInt): CInt =
    CygwinModRawLibc.pthreadSpinInit(lock?.toLong() ?: 0L, pshared)

public actual fun pthreadSpinLock(lock: ULong?): CInt =
    CygwinModRawLibc.pthreadSpinLock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinTrylock(lock: ULong?): CInt =
    CygwinModRawLibc.pthreadSpinTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinUnlock(lock: ULong?): CInt =
    CygwinModRawLibc.pthreadSpinUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: CInt?): CInt =
    CygwinModRawLibc.pthreadRwlockattrGetpshared(attr?.value ?: 0L, value?.toLong() ?: 0L)

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    CygwinModRawLibc.pthreadRwlockattrSetpshared(attr?.value ?: 0L, value)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    CygwinModRawLibc.pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    CygwinModRawLibc.pthreadSetschedprio(native, priority)

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    CygwinModRawLibc.pthreadGetaffinityNp(thread, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    CygwinModRawLibc.pthreadGetattrNp(native, attr?.value ?: 0L)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    CygwinModRawLibc.pthreadGetnameNp(thread, name?.value ?: 0L, len)

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    CygwinModRawLibc.pthreadSetaffinityNp(thread, cpusetsize, cpuset?.toLong() ?: 0L)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    CygwinModRawLibc.pthreadSetnameNp(thread, name)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    CygwinModRawLibc.pthreadSigqueue(thread, sig, value)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    CygwinModRawLibc.getrandom(buf?.value ?: 0L, buflen, flags)

public actual fun mount(src: String?, target: String?, flags: CUint): CInt =
    CygwinModRawLibc.mount(src, target, flags)

public actual fun umount(target: String?): CInt =
    CygwinModRawLibc.umount(target)

public actual fun cygwinUmount(target: String?, flags: CUint): CInt =
    CygwinModRawLibc.cygwinUmount(target, flags)

public actual fun dirfd(dirp: DIR?): CInt =
    CygwinModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    CygwinModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    CygwinModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun uname(buf: Utsname?): CInt =
    CygwinModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    CygwinModRawLibc.posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    CygwinModRawLibc.posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    CygwinModRawLibc.posixSpawnattrInit(attr?.value ?: 0L)

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    CygwinModRawLibc.posixSpawnattrDestroy(attr?.value ?: 0L)

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: CUlong?): CInt =
    CygwinModRawLibc.posixSpawnattrGetsigdefault(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: CUlong?): CInt =
    CygwinModRawLibc.posixSpawnattrSetsigdefault(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: CUlong?): CInt =
    CygwinModRawLibc.posixSpawnattrGetsigmask(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: CUlong?): CInt =
    CygwinModRawLibc.posixSpawnattrSetsigmask(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    CygwinModRawLibc.posixSpawnattrGetflags(attr?.value ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    CygwinModRawLibc.posixSpawnattrSetflags(attr?.value ?: 0L, flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt =
    CygwinModRawLibc.posixSpawnattrGetpgroup(attr?.value ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    CygwinModRawLibc.posixSpawnattrSetpgroup(attr?.value ?: 0L, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: CInt?): CInt =
    CygwinModRawLibc.posixSpawnattrGetschedpolicy(attr?.value ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    CygwinModRawLibc.posixSpawnattrSetschedpolicy(attr?.value ?: 0L, flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    CygwinModRawLibc.posixSpawnattrGetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    CygwinModRawLibc.posixSpawnattrSetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    CygwinModRawLibc.posixSpawnFileActionsInit(actions?.value ?: 0L)

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    CygwinModRawLibc.posixSpawnFileActionsDestroy(actions?.value ?: 0L)

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    CygwinModRawLibc.posixSpawnFileActionsAddopen(actions?.value ?: 0L, fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    CygwinModRawLibc.posixSpawnFileActionsAddclose(actions?.value ?: 0L, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    CygwinModRawLibc.posixSpawnFileActionsAdddup2(actions?.value ?: 0L, fd, newfd)

public actual fun posixSpawnFileActionsAddchdir(actions: COpaquePointer?, path: String?): CInt =
    CygwinModRawLibc.posixSpawnFileActionsAddchdir(actions?.value ?: 0L, path)

public actual fun posixSpawnFileActionsAddfchdir(actions: COpaquePointer?, fd: CInt): CInt =
    CygwinModRawLibc.posixSpawnFileActionsAddfchdir(actions?.value ?: 0L, fd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    CygwinModRawLibc.posixSpawnFileActionsAddchdirNp(actions?.value ?: 0L, path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    CygwinModRawLibc.posixSpawnFileActionsAddfchdirNp(actions?.value ?: 0L, fd)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    CygwinModRawLibc.forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    CygwinModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun getgrgid(gid: GidT): Group? =
    CygwinModRawLibc.getgrgid(gid)

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    CygwinModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    CygwinModRawLibc.getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun getgrnam(name: String?): Group? =
    CygwinModRawLibc.getgrnam(name)

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    CygwinModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun initgroups(user: String?, group: GidT): CInt =
    CygwinModRawLibc.initgroups(user, group)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    CygwinModRawLibc.statfs(path, buf?.toLong() ?: 0L)

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    CygwinModRawLibc.fstatfs(fd, buf?.toLong() ?: 0L)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    CygwinModRawLibc.posixFadvise(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    CygwinModRawLibc.posixFallocate(fd, offset, len)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    CygwinModRawLibc.fallocate(fd, mode, offset, len)

public actual fun endutxent() {
    CygwinModRawLibc.endutxent()
}

public actual fun getutxent(): Utmpx? =
    CygwinModRawLibc.getutxent()

public actual fun getutxid(id: Utmpx?): Utmpx? =
    CygwinModRawLibc.getutxid(id?.toLong() ?: 0L)

public actual fun getutxline(line: Utmpx?): Utmpx? =
    CygwinModRawLibc.getutxline(line?.toLong() ?: 0L)

public actual fun pututxline(utmpx: Utmpx?): Utmpx? =
    CygwinModRawLibc.pututxline(utmpx?.toLong() ?: 0L)

public actual fun setutxent() {
    CygwinModRawLibc.setutxent()
}

public actual fun utmpxname(file: String?): CInt =
    CygwinModRawLibc.utmpxname(file)

public actual fun updwtmpx(file: String?, utmpx: Utmpx?) {
    CygwinModRawLibc.updwtmpx(file, utmpx?.toLong() ?: 0L)
}
