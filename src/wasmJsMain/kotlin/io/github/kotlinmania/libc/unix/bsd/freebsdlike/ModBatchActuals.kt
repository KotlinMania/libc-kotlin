// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public actual fun semDestroy(sem: SemT): CInt =
    throw UnsupportedOperationException("semDestroy requires N-API addon")

public actual fun semInit(sem: SemT, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit requires N-API addon")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 requires N-API addon")

public actual fun chflags(path: String?, flags: CULong): CInt =
    throw UnsupportedOperationException("chflags requires N-API addon")

public actual fun chflagsat(fd: CInt, path: String?, flags: CULong, atflag: CInt): CInt =
    throw UnsupportedOperationException("chflagsat requires N-API addon")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres requires N-API addon")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime requires N-API addon")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime requires N-API addon")

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid requires N-API addon")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadGetcpuclockid requires N-API addon")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires N-API addon")
}

public actual fun fchflags(fd: CInt, flags: CULong): CInt =
    throw UnsupportedOperationException("fchflags requires N-API addon")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve requires N-API addon")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens requires N-API addon")

public actual fun getdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("getdomainname requires N-API addon")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrentR requires N-API addon")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwentR requires N-API addon")

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid requires N-API addon")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    throw UnsupportedOperationException("initgroups requires N-API addon")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent requires N-API addon")

public actual fun lchflags(path: String?, flags: CULong): CInt =
    throw UnsupportedOperationException("lchflags requires N-API addon")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes requires N-API addon")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires N-API addon")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat requires N-API addon")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat requires N-API addon")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires N-API addon")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore requires N-API addon")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL requires N-API addon")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 requires N-API addon")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate requires N-API addon")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise requires N-API addon")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll requires N-API addon")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv requires N-API addon")

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadAttrGetNp requires N-API addon")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires N-API addon")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires N-API addon")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires N-API addon")

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetpshared requires N-API addon")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires N-API addon")

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetpshared requires N-API addon")

public actual fun pthreadMainNp(): CInt =
    throw UnsupportedOperationException("pthreadMainNp requires N-API addon")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires N-API addon")

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared requires N-API addon")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires N-API addon")

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared requires N-API addon")

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared requires N-API addon")

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrInit requires N-API addon")

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy requires N-API addon")

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT, shared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared requires N-API addon")

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT, shared: CInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared requires N-API addon")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT, attr: PthreadBarrierattrT, count: CUInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierInit requires N-API addon")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): CInt =
    throw UnsupportedOperationException("pthreadBarrierDestroy requires N-API addon")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): CInt =
    throw UnsupportedOperationException("pthreadBarrierWait requires N-API addon")

public actual fun pthreadGetNameNp(tid: PthreadT, name: String?, len: ULong) {
    throw UnsupportedOperationException("pthreadGetNameNp requires N-API addon")
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    throw UnsupportedOperationException("pthreadSetNameNp requires N-API addon")
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: String?, length: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp requires N-API addon")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam requires N-API addon")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam requires N-API addon")

public actual fun ptrace(request: CInt, pid: PidT, addr: String?, data: CInt): CInt =
    throw UnsupportedOperationException("ptrace requires N-API addon")

public actual fun utrace(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("utrace requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev requires N-API addon")

public actual fun querylocale(mask: CInt, loc: LocaleT): String? =
    throw UnsupportedOperationException("querylocale requires N-API addon")

public actual fun rtprio(function: CInt, pid: PidT, rtp: Rtprio?): CInt =
    throw UnsupportedOperationException("rtprio requires N-API addon")

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun semGetvalue(sem: SemT, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue requires N-API addon")

public actual fun semTimedwait(sem: SemT, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait requires N-API addon")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: ULong, hdtr: SfHdtr?, sbytes: OffT?, flags: CInt): CInt =
    throw UnsupportedOperationException("sendfile requires N-API addon")

public actual fun setdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("setdomainname requires N-API addon")

public actual fun sethostname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("sethostname requires N-API addon")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid requires N-API addon")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires N-API addon")
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen requires N-API addon")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo requires N-API addon")

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl requires N-API addon")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctlbyname requires N-API addon")

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: ULong?): CInt =
    throw UnsupportedOperationException("sysctlnametomib requires N-API addon")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale requires N-API addon")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat requires N-API addon")

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime requires N-API addon")

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime requires N-API addon")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires N-API addon")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose requires N-API addon")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero requires N-API addon")
}

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt =
    throw UnsupportedOperationException("memsetS requires N-API addon")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid requires N-API addon")

public actual fun sethostid(hostid: CLong) {
    throw UnsupportedOperationException("sethostid requires N-API addon")
}

public actual fun eui64Aton(a: String?, e: Eui64?): CInt =
    throw UnsupportedOperationException("eui64Aton requires N-API addon")

public actual fun eui64Ntoa(id: Eui64?, a: String?, len: ULong): CInt =
    throw UnsupportedOperationException("eui64Ntoa requires N-API addon")

public actual fun eui64Ntohost(hostname: String?, len: ULong, id: Eui64?): CInt =
    throw UnsupportedOperationException("eui64Ntohost requires N-API addon")

public actual fun eui64Hostton(hostname: String?, id: Eui64?): CInt =
    throw UnsupportedOperationException("eui64Hostton requires N-API addon")

public actual fun eaccess(path: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("eaccess requires N-API addon")

public actual fun kenv(action: CInt, name: String?, value: String?, len: CInt): CInt =
    throw UnsupportedOperationException("kenv requires N-API addon")

public actual fun reboot(howto: CInt): CInt =
    throw UnsupportedOperationException("reboot requires N-API addon")

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("exect requires N-API addon")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvP requires N-API addon")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemp requires N-API addon")

public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemps requires N-API addon")

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

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT, flags: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires N-API addon")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT, flags: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires N-API addon")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires N-API addon")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires N-API addon")

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

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose requires N-API addon")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr requires N-API addon")

public actual fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify requires N-API addon")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen requires N-API addon")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive requires N-API addon")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend requires N-API addon")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr requires N-API addon")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive requires N-API addon")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend requires N-API addon")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink requires N-API addon")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty requires N-API addon")

public actual fun fparseln(stream: FILE?, len: ULong?, lineno: ULong?, delim: String?, flags: CInt): String? =
    throw UnsupportedOperationException("fparseln requires N-API addon")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace requires N-API addon")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires N-API addon")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: CInt): CInt =
    throw UnsupportedOperationException("backtraceSymbolsFd requires N-API addon")

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): KvmT =
    throw UnsupportedOperationException("kvmOpen requires N-API addon")

public actual fun kvmClose(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmClose requires N-API addon")

public actual fun kvmGetprocs(kd: KvmT, op: CInt, arg: CInt, cnt: CInt?): KinfoProc? =
    throw UnsupportedOperationException("kvmGetprocs requires N-API addon")

public actual fun kvmGetloadavg(kd: KvmT, loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("kvmGetloadavg requires N-API addon")

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: String?): KvmT =
    throw UnsupportedOperationException("kvmOpenfiles requires N-API addon")

public actual fun kvmRead(kd: KvmT, addr: CULong, buf: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("kvmRead requires N-API addon")

public actual fun kvmWrite(kd: KvmT, addr: CULong, buf: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("kvmWrite requires N-API addon")

