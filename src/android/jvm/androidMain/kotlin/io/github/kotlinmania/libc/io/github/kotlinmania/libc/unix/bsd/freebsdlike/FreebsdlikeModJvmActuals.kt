package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.COpaquePointer

internal object FreebsdlikeModRawLibc {
    external fun semDestroy(sem: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun accept4(s: Int, addr: Long, addrlen: Long, flags: Int): Int
    external fun chflags(path: String?, flags: Long): Int
    external fun chflagsat(fd: Int, path: String?, flags: Long, atflag: Int): Int
    external fun clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun clockGetres(clkId: Int, tp: Long): Int
    external fun clockGettime(clkId: Int, tp: Long): Int
    external fun clockSettime(clkId: Int, tp: Long): Int
    external fun clockGetcpuclockid(pid: Int, clkId: Long): Int
    external fun pthreadGetcpuclockid(thread: Long, clkId: Long): Int
    external fun dirfd(dirp: Long): Int
    external fun duplocale(base: Long): Long
    external fun endutxent()
    external fun fchflags(fd: Int, flags: Long): Int
    external fun fexecve(fd: Int, argv: Long, envp: Long): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun getdomainname(name: Long, len: Int): Int
    external fun getgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrouplist(name: String?, basegid: Int, groups: Long, ngroups: Long): Int
    external fun getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun getpriority(which: Int, who: Int): Int
    external fun getresgid(rgid: Long, egid: Long, sgid: Long): Int
    external fun getresuid(ruid: Long, euid: Long, suid: Long): Int
    external fun getutxent(): Long?
    external fun getutxid(ut: Long): Long?
    external fun getutxline(ut: Long): Long?
    external fun initgroups(name: String?, basegid: Int): Int
    external fun kevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int
    external fun lchflags(path: String?, flags: Long): Int
    external fun lutimes(file: String?, times: Long): Int
    external fun memrchr(cx: Long, c: Int, n: Long): Long?
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun mallocUsableSize(ptr: Long): Long
    external fun mincore(addr: Long, len: Long, vec: Long): Int
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun nlLanginfoL(item: Long, locale: Long): Long?
    external fun pipe2(fds: Long, flags: Int): Int
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun ppoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun pthreadAttrGetNp(tid: Long, attr: Long): Int
    external fun pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Int): Int
    external fun pthreadCondattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadMainNp(): Int
    external fun pthreadMutexTimedlock(lock: Long, abstime: Long): Int
    external fun pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadRwlockattrGetpshared(attr: Long, value: Long): Int
    external fun pthreadRwlockattrSetpshared(attr: Long, value: Int): Int
    external fun pthreadBarrierattrInit(attr: Long): Int
    external fun pthreadBarrierattrDestroy(attr: Long): Int
    external fun pthreadBarrierattrGetpshared(attr: Long, shared: Long): Int
    external fun pthreadBarrierattrSetpshared(attr: Long, shared: Int): Int
    external fun pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int
    external fun pthreadBarrierDestroy(barrier: Long): Int
    external fun pthreadBarrierWait(barrier: Long): Int
    external fun pthreadGetNameNp(tid: Long, name: Long, len: Long)
    external fun pthreadSetNameNp(tid: Long, name: String?)
    external fun pthreadGetnameNp(thread: Long, buffer: Long, length: Long): Int
    external fun pthreadSetnameNp(thread: Long, name: String?): Int
    external fun pthreadSetschedparam(native: Long, policy: Int, param: Long): Int
    external fun pthreadGetschedparam(native: Long, policy: Long, param: Long): Int
    external fun ptrace(request: Int, pid: Int, addr: Long, data: Int): Int
    external fun utrace(addr: Long, len: Long): Int
    external fun pututxline(ut: Long): Long?
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun querylocale(mask: Int, loc: Long): Long?
    external fun rtprio(function: Int, pid: Int, rtp: Long): Int
    external fun schedRrGetInterval(pid: Int, t: Long): Int
    external fun schedGetparam(pid: Int, param: Long): Int
    external fun schedSetparam(pid: Int, param: Long): Int
    external fun schedGetscheduler(pid: Int): Int
    external fun schedSetscheduler(pid: Int, policy: Int, param: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
    external fun semTimedwait(sem: Long, abstime: Long): Int
    external fun sendfile(fd: Int, s: Int, offset: Long, nbytes: Long, hdtr: Long, sbytes: Long, flags: Int): Int
    external fun setdomainname(name: String?, len: Int): Int
    external fun sethostname(name: String?, len: Int): Int
    external fun setpriority(which: Int, who: Int, prio: Int): Int
    external fun setresgid(rgid: Int, egid: Int, sgid: Int): Int
    external fun setresuid(ruid: Int, euid: Int, suid: Int): Int
    external fun settimeofday(tv: Long, tz: Long): Int
    external fun setutxent()
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
    external fun sigwaitinfo(set: Long, info: Long): Int
    external fun sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun sysctlbyname(name: String?, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun sysctlnametomib(name: String?, mibp: Long, sizep: Long): Int
    external fun uselocale(loc: Long): Long
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun ntpAdjtime(buf: Long): Int
    external fun ntpGettime(buf: Long): Int
    external fun dlIteratePhdr(callback: Long, data: Long): Int
    external fun iconvOpen(tocode: String?, fromcode: String?): Long
    external fun iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long
    external fun iconvClose(cd: Long): Int
    external fun explicitBzero(s: Long, len: Long)
    external fun memsetS(s: Long, smax: Long, c: Int, n: Long): Int
    external fun gethostid(): Long
    external fun sethostid(hostid: Long)
    external fun eui64Aton(a: String?, e: Long): Int
    external fun eui64Ntoa(id: Long, a: Long, len: Long): Int
    external fun eui64Ntohost(hostname: Long, len: Long, id: Long): Int
    external fun eui64Hostton(hostname: String?, id: Long): Int
    external fun eaccess(path: String?, mode: Int): Int
    external fun kenv(action: Int, name: String?, value: Long, len: Int): Int
    external fun reboot(howto: Int): Int
    external fun exect(path: String?, argv: Long, envp: Long): Int
    external fun execvP(file: String?, searchPath: String?, argv: Long): Int
    external fun mkostemp(template: Long, flags: Int): Int
    external fun mkostemps(template: Long, suffixlen: Int, flags: Int): Int
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
    external fun mqClose(mqd: Long): Int
    external fun mqGetattr(mqd: Long, attr: Long): Int
    external fun mqNotify(mqd: Long, notification: Long): Int
    external fun mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long
    external fun mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int
    external fun mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int
    external fun mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long
    external fun mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int
    external fun mqUnlink(name: String?): Int
    external fun getrandom(buf: Long, buflen: Long, flags: Int): Long
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int
    external fun loginTty(fd: Int): Int
    external fun fparseln(stream: Long, len: Long, lineno: Long, delim: String?, flags: Int): Long?
    external fun backtrace(addrlist: Long, len: Long): Long
    external fun backtraceSymbols(addrlist: Long, len: Long): Long?
    external fun backtraceSymbolsFd(addrlist: Long, len: Long, fd: Int): Int
    external fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: Int, errstr: String?): Long?
    external fun kvmClose(kd: Long): Int
    external fun kvmGetprocs(kd: Long, op: Int, arg: Int, cnt: Long): Long?
    external fun kvmGetloadavg(kd: Long, loadavg: Long, nelem: Int): Int
    external fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: Int, errbuf: Long): Long?
    external fun kvmRead(kd: Long, addr: Long, buf: Long, nbytes: Long): Long
    external fun kvmWrite(kd: Long, addr: Long, buf: Long, nbytes: Long): Long
}

public actual fun semDestroy(sem: SemT?): CInt =
    FreebsdlikeModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    FreebsdlikeModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    FreebsdlikeModRawLibc.daemon(nochdir, noclose)

public actual fun gettimeofday(tp: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    FreebsdlikeModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    FreebsdlikeModRawLibc.accept4(s, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L, flags)

public actual fun chflags(path: String?, flags: CUlong): CInt =
    FreebsdlikeModRawLibc.chflags(path, flags)

public actual fun chflagsat(fd: CInt, path: String?, flags: CUlong, atflag: CInt): CInt =
    FreebsdlikeModRawLibc.chflagsat(fd, path, flags, atflag)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    FreebsdlikeModRawLibc.clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    FreebsdlikeModRawLibc.clockGetres(clkId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    FreebsdlikeModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    FreebsdlikeModRawLibc.clockSettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    FreebsdlikeModRawLibc.clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    FreebsdlikeModRawLibc.pthreadGetcpuclockid(thread, clkId?.toLong() ?: 0L)

public actual fun dirfd(dirp: DIR?): CInt =
    FreebsdlikeModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun duplocale(base: LocaleT): LocaleT =
    FreebsdlikeModRawLibc.duplocale(base)

public actual fun endutxent() {
    FreebsdlikeModRawLibc.endutxent()
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    FreebsdlikeModRawLibc.fchflags(fd, flags)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    FreebsdlikeModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    FreebsdlikeModRawLibc.getdomainname(name?.value ?: 0L, len)

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.getgrentR(grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.getpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    FreebsdlikeModRawLibc.getgrouplist(name, basegid, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    FreebsdlikeModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    FreebsdlikeModRawLibc.getpriority(which, who)

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    FreebsdlikeModRawLibc.getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    FreebsdlikeModRawLibc.getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)

public actual fun getutxent(): Utmpx? =
    FreebsdlikeModRawLibc.getutxent()

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    FreebsdlikeModRawLibc.getutxid(ut?.toLong() ?: 0L)

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    FreebsdlikeModRawLibc.getutxline(ut?.toLong() ?: 0L)

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    FreebsdlikeModRawLibc.initgroups(name, basegid)

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    FreebsdlikeModRawLibc.kevent(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, timeout?.toLong() ?: 0L)

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    FreebsdlikeModRawLibc.lchflags(path, flags)

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    FreebsdlikeModRawLibc.lutimes(file, times?.toLong() ?: 0L)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    FreebsdlikeModRawLibc.memrchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    FreebsdlikeModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    FreebsdlikeModRawLibc.mknodat(dirfd, pathname, mode, dev)

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    FreebsdlikeModRawLibc.mallocUsableSize(ptr?.value ?: 0L)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.mincore(addr?.value ?: 0L, len, vec?.value ?: 0L)

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    FreebsdlikeModRawLibc.newlocale(mask, locale, base)

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    FreebsdlikeModRawLibc.nlLanginfoL(item, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    FreebsdlikeModRawLibc.pipe2(fds?.toLong() ?: 0L, flags)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    FreebsdlikeModRawLibc.posixFallocate(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    FreebsdlikeModRawLibc.posixFadvise(fd, offset, len, advise)

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    FreebsdlikeModRawLibc.ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    FreebsdlikeModRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.pthreadAttrGetNp(tid, attr?.value ?: 0L)

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    FreebsdlikeModRawLibc.pthreadAttrGetguardsize(attr?.value ?: 0L, guardsize?.toLong() ?: 0L)

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    FreebsdlikeModRawLibc.pthreadAttrSetguardsize(attr?.value ?: 0L, guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    FreebsdlikeModRawLibc.pthreadAttrGetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: ClockidT?): CInt =
    FreebsdlikeModRawLibc.pthreadCondattrGetclock(attr?.value ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    FreebsdlikeModRawLibc.pthreadCondattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    FreebsdlikeModRawLibc.pthreadCondattrSetclock(attr?.value ?: 0L, clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    FreebsdlikeModRawLibc.pthreadCondattrSetpshared(attr?.value ?: 0L, pshared)

public actual fun pthreadMainNp(): CInt =
    FreebsdlikeModRawLibc.pthreadMainNp()

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: Timespec?): CInt =
    FreebsdlikeModRawLibc.pthreadMutexTimedlock(lock?.value ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    FreebsdlikeModRawLibc.pthreadMutexattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    FreebsdlikeModRawLibc.pthreadMutexattrSetpshared(attr?.value ?: 0L, pshared)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: CInt?): CInt =
    FreebsdlikeModRawLibc.pthreadRwlockattrGetpshared(attr?.value ?: 0L, value?.toLong() ?: 0L)

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    FreebsdlikeModRawLibc.pthreadRwlockattrSetpshared(attr?.value ?: 0L, value)

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt =
    FreebsdlikeModRawLibc.pthreadBarrierattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt =
    FreebsdlikeModRawLibc.pthreadBarrierattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt =
    FreebsdlikeModRawLibc.pthreadBarrierattrGetpshared(attr?.toLong() ?: 0L, shared?.toLong() ?: 0L)

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt =
    FreebsdlikeModRawLibc.pthreadBarrierattrSetpshared(attr?.toLong() ?: 0L, shared)

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUint): CInt =
    FreebsdlikeModRawLibc.pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.toLong() ?: 0L, count)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    FreebsdlikeModRawLibc.pthreadBarrierDestroy(barrier?.toLong() ?: 0L)

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    FreebsdlikeModRawLibc.pthreadBarrierWait(barrier?.toLong() ?: 0L)

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    FreebsdlikeModRawLibc.pthreadGetNameNp(tid, name?.value ?: 0L, len)
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    FreebsdlikeModRawLibc.pthreadSetNameNp(tid, name)
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    FreebsdlikeModRawLibc.pthreadGetnameNp(thread, buffer?.value ?: 0L, length)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    FreebsdlikeModRawLibc.pthreadSetnameNp(thread, name)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    FreebsdlikeModRawLibc.pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    FreebsdlikeModRawLibc.pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    FreebsdlikeModRawLibc.ptrace(request, pid, addr?.value ?: 0L, data)

public actual fun utrace(addr: COpaquePointer?, len: SizeT): CInt =
    FreebsdlikeModRawLibc.utrace(addr?.value ?: 0L, len)

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    FreebsdlikeModRawLibc.pututxline(ut?.toLong() ?: 0L)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    FreebsdlikeModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    FreebsdlikeModRawLibc.querylocale(mask, loc).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtprio(function: CInt, pid: PidT, rtp: Rtprio?): CInt =
    FreebsdlikeModRawLibc.rtprio(function, pid, rtp?.toLong() ?: 0L)

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    FreebsdlikeModRawLibc.schedRrGetInterval(pid, t?.toLong() ?: 0L)

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    FreebsdlikeModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    FreebsdlikeModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    FreebsdlikeModRawLibc.schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    FreebsdlikeModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    FreebsdlikeModRawLibc.semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    FreebsdlikeModRawLibc.semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: io.github.kotlinmania.libc.SfHdtr?, sbytes: OffT?, flags: CInt): CInt =
    FreebsdlikeModRawLibc.sendfile(fd, s, offset, nbytes, hdtr?.toLong() ?: 0L, sbytes?.toLong() ?: 0L, flags)

public actual fun setdomainname(name: String?, len: CInt): CInt =
    FreebsdlikeModRawLibc.setdomainname(name, len)

public actual fun sethostname(name: String?, len: CInt): CInt =
    FreebsdlikeModRawLibc.sethostname(name, len)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    FreebsdlikeModRawLibc.setpriority(which, who, prio)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    FreebsdlikeModRawLibc.setresgid(rgid, egid, sgid)

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    FreebsdlikeModRawLibc.setresuid(ruid, euid, suid)

public actual fun settimeofday(tv: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    FreebsdlikeModRawLibc.settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun setutxent() {
    FreebsdlikeModRawLibc.setutxent()
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    FreebsdlikeModRawLibc.shmOpen(name, oflag, mode)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    FreebsdlikeModRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    FreebsdlikeModRawLibc.sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    FreebsdlikeModRawLibc.sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    FreebsdlikeModRawLibc.sysctlbyname(name, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: SizeT?): CInt =
    FreebsdlikeModRawLibc.sysctlnametomib(name, mibp?.toLong() ?: 0L, sizep?.toLong() ?: 0L)

public actual fun uselocale(loc: LocaleT): LocaleT =
    FreebsdlikeModRawLibc.uselocale(loc)

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    FreebsdlikeModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun ntpAdjtime(buf: Timex?): CInt =
    FreebsdlikeModRawLibc.ntpAdjtime(buf?.toLong() ?: 0L)

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    FreebsdlikeModRawLibc.ntpGettime(buf?.toLong() ?: 0L)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    FreebsdlikeModRawLibc.iconvOpen(tocode, fromcode)

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    FreebsdlikeModRawLibc.iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)

public actual fun iconvClose(cd: IconvT): CInt =
    FreebsdlikeModRawLibc.iconvClose(cd)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    FreebsdlikeModRawLibc.explicitBzero(s?.value ?: 0L, len)
}

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    FreebsdlikeModRawLibc.memsetS(s?.value ?: 0L, smax, c, n)

public actual fun gethostid(): CLong =
    FreebsdlikeModRawLibc.gethostid()

public actual fun sethostid(hostid: CLong) {
    FreebsdlikeModRawLibc.sethostid(hostid)
}

public actual fun eui64Aton(a: String?, e: Eui64?): CInt =
    FreebsdlikeModRawLibc.eui64Aton(a, e?.toLong() ?: 0L)

public actual fun eui64Ntoa(id: Eui64?, a: COpaquePointer?, len: SizeT): CInt =
    FreebsdlikeModRawLibc.eui64Ntoa(id?.toLong() ?: 0L, a?.value ?: 0L, len)

public actual fun eui64Ntohost(hostname: COpaquePointer?, len: SizeT, id: Eui64?): CInt =
    FreebsdlikeModRawLibc.eui64Ntohost(hostname?.value ?: 0L, len, id?.toLong() ?: 0L)

public actual fun eui64Hostton(hostname: String?, id: Eui64?): CInt =
    FreebsdlikeModRawLibc.eui64Hostton(hostname, id?.toLong() ?: 0L)

public actual fun eaccess(path: String?, mode: CInt): CInt =
    FreebsdlikeModRawLibc.eaccess(path, mode)

public actual fun kenv(action: CInt, name: String?, value: COpaquePointer?, len: CInt): CInt =
    FreebsdlikeModRawLibc.kenv(action, name, value?.value ?: 0L, len)

public actual fun reboot(howto: CInt): CInt =
    FreebsdlikeModRawLibc.reboot(howto)

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.exect(path, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.execvP(file, searchPath, argv?.value ?: 0L)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    FreebsdlikeModRawLibc.mkostemp(template?.value ?: 0L, flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    FreebsdlikeModRawLibc.mkostemps(template?.value ?: 0L, suffixlen, flags)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrInit(attr?.value ?: 0L)

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrDestroy(attr?.value ?: 0L)

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrGetsigdefault(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrSetsigdefault(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrGetsigmask(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrSetsigmask(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrGetflags(attr?.value ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrSetflags(attr?.value ?: 0L, flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrGetpgroup(attr?.value ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrSetpgroup(attr?.value ?: 0L, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: CInt?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrGetschedpolicy(attr?.value ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrSetschedpolicy(attr?.value ?: 0L, flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrGetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    FreebsdlikeModRawLibc.posixSpawnattrSetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.posixSpawnFileActionsInit(actions?.value ?: 0L)

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.posixSpawnFileActionsDestroy(actions?.value ?: 0L)

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    FreebsdlikeModRawLibc.posixSpawnFileActionsAddopen(actions?.value ?: 0L, fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    FreebsdlikeModRawLibc.posixSpawnFileActionsAddclose(actions?.value ?: 0L, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    FreebsdlikeModRawLibc.posixSpawnFileActionsAdddup2(actions?.value ?: 0L, fd, newfd)

public actual fun mqClose(mqd: MqdT): CInt =
    FreebsdlikeModRawLibc.mqClose(mqd)

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    FreebsdlikeModRawLibc.mqGetattr(mqd, attr?.toLong() ?: 0L)

public actual fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt =
    FreebsdlikeModRawLibc.mqNotify(mqd, notification?.toLong() ?: 0L)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    FreebsdlikeModRawLibc.mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    FreebsdlikeModRawLibc.mqSend(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    FreebsdlikeModRawLibc.mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    FreebsdlikeModRawLibc.mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    FreebsdlikeModRawLibc.mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)

public actual fun mqUnlink(name: String?): CInt =
    FreebsdlikeModRawLibc.mqUnlink(name)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    FreebsdlikeModRawLibc.getrandom(buf?.value ?: 0L, buflen, flags)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    FreebsdlikeModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    FreebsdlikeModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    FreebsdlikeModRawLibc.forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun loginTty(fd: CInt): CInt =
    FreebsdlikeModRawLibc.loginTty(fd)

public actual fun fparseln(stream: FILE?, len: SizeT?, lineno: SizeT?, delim: String?, flags: CInt): COpaquePointer? =
    FreebsdlikeModRawLibc.fparseln(stream?.toLong() ?: 0L, len?.toLong() ?: 0L, lineno?.toLong() ?: 0L, delim, flags).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    FreebsdlikeModRawLibc.backtrace(addrlist?.value ?: 0L, len)

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    FreebsdlikeModRawLibc.backtraceSymbols(addrlist?.value ?: 0L, len).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    FreebsdlikeModRawLibc.backtraceSymbolsFd(addrlist?.value ?: 0L, len, fd)

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): COpaquePointer? =
    FreebsdlikeModRawLibc.kvmOpen(execfile, corefile, swapfile, flags, errstr).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmClose(kd: COpaquePointer?): CInt =
    FreebsdlikeModRawLibc.kvmClose(kd?.value ?: 0L)

public actual fun kvmGetprocs(kd: COpaquePointer?, op: CInt, arg: CInt, cnt: CInt?): KinfoProc? =
    FreebsdlikeModRawLibc.kvmGetprocs(kd?.value ?: 0L, op, arg, cnt?.toLong() ?: 0L)

public actual fun kvmGetloadavg(kd: COpaquePointer?, loadavg: CDouble?, nelem: CInt): CInt =
    FreebsdlikeModRawLibc.kvmGetloadavg(kd?.value ?: 0L, loadavg?.toLong() ?: 0L, nelem)

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: COpaquePointer?): COpaquePointer? =
    FreebsdlikeModRawLibc.kvmOpenfiles(execfile, corefile, swapfile, flags, errbuf?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmRead(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdlikeModRawLibc.kvmRead(kd?.value ?: 0L, addr, buf?.value ?: 0L, nbytes)

public actual fun kvmWrite(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdlikeModRawLibc.kvmWrite(kd?.value ?: 0L, addr, buf?.value ?: 0L, nbytes)
