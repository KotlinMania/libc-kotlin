// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public actual fun semDestroy(sem: SemT): CInt =
    throw UnsupportedOperationException("semDestroy not available on Android host — use androidNative target for FFI")

public actual fun semInit(sem: SemT, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit not available on Android host — use androidNative target for FFI")

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    throw UnsupportedOperationException("daemon not available on Android host — use androidNative target for FFI")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on Android host — use androidNative target for FFI")

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 not available on Android host — use androidNative target for FFI")

public actual fun chflags(path: String?, flags: CULong): CInt =
    throw UnsupportedOperationException("chflags not available on Android host — use androidNative target for FFI")

public actual fun chflagsat(fd: CInt, path: String?, flags: CULong, atflag: CInt): CInt =
    throw UnsupportedOperationException("chflagsat not available on Android host — use androidNative target for FFI")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep not available on Android host — use androidNative target for FFI")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres not available on Android host — use androidNative target for FFI")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on Android host — use androidNative target for FFI")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime not available on Android host — use androidNative target for FFI")

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadGetcpuclockid not available on Android host — use androidNative target for FFI")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on Android host — use androidNative target for FFI")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale not available on Android host — use androidNative target for FFI")

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent not available on Android host — use androidNative target for FFI")
}

public actual fun fchflags(fd: CInt, flags: CULong): CInt =
    throw UnsupportedOperationException("fchflags not available on Android host — use androidNative target for FFI")

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fexecve not available on Android host — use androidNative target for FFI")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on Android host — use androidNative target for FFI")

public actual fun getdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("getdomainname not available on Android host — use androidNative target for FFI")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrentR not available on Android host — use androidNative target for FFI")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwentR not available on Android host — use androidNative target for FFI")

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist not available on Android host — use androidNative target for FFI")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on Android host — use androidNative target for FFI")

public actual fun getpriority(which: CInt, who: CInt): CInt =
    throw UnsupportedOperationException("getpriority not available on Android host — use androidNative target for FFI")

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    throw UnsupportedOperationException("getresgid not available on Android host — use androidNative target for FFI")

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    throw UnsupportedOperationException("getresuid not available on Android host — use androidNative target for FFI")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on Android host — use androidNative target for FFI")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on Android host — use androidNative target for FFI")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on Android host — use androidNative target for FFI")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    throw UnsupportedOperationException("initgroups not available on Android host — use androidNative target for FFI")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent not available on Android host — use androidNative target for FFI")

public actual fun lchflags(path: String?, flags: CULong): CInt =
    throw UnsupportedOperationException("lchflags not available on Android host — use androidNative target for FFI")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes not available on Android host — use androidNative target for FFI")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on Android host — use androidNative target for FFI")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat not available on Android host — use androidNative target for FFI")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat not available on Android host — use androidNative target for FFI")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize not available on Android host — use androidNative target for FFI")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): CInt =
    throw UnsupportedOperationException("mincore not available on Android host — use androidNative target for FFI")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale not available on Android host — use androidNative target for FFI")

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): String? =
    throw UnsupportedOperationException("nlLanginfoL not available on Android host — use androidNative target for FFI")

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    throw UnsupportedOperationException("pipe2 not available on Android host — use androidNative target for FFI")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate not available on Android host — use androidNative target for FFI")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise not available on Android host — use androidNative target for FFI")

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll not available on Android host — use androidNative target for FFI")

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("preadv not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadAttrGetNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on Android host — use androidNative target for FFI")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on Android host — use androidNative target for FFI")

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadMainNp(): CInt =
    throw UnsupportedOperationException("pthreadMainNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattrT, pshared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattrT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattrT, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattrT, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT, shared: CInt?): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT, shared: CInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT, attr: PthreadBarrierattrT, count: CUInt): CInt =
    throw UnsupportedOperationException("pthreadBarrierInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT): CInt =
    throw UnsupportedOperationException("pthreadBarrierDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT): CInt =
    throw UnsupportedOperationException("pthreadBarrierWait not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetNameNp(tid: PthreadT, name: String?, len: ULong) {
    throw UnsupportedOperationException("pthreadGetNameNp not available on Android host — use androidNative target for FFI")
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    throw UnsupportedOperationException("pthreadSetNameNp not available on Android host — use androidNative target for FFI")
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: String?, length: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    throw UnsupportedOperationException("pthreadGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun ptrace(request: CInt, pid: PidT, addr: String?, data: CInt): CInt =
    throw UnsupportedOperationException("ptrace not available on Android host — use androidNative target for FFI")

public actual fun utrace(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("utrace not available on Android host — use androidNative target for FFI")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on Android host — use androidNative target for FFI")

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    throw UnsupportedOperationException("pwritev not available on Android host — use androidNative target for FFI")

public actual fun querylocale(mask: CInt, loc: LocaleT): String? =
    throw UnsupportedOperationException("querylocale not available on Android host — use androidNative target for FFI")

public actual fun rtprio(function: CInt, pid: PidT, rtp: Rtprio?): CInt =
    throw UnsupportedOperationException("rtprio not available on Android host — use androidNative target for FFI")

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval not available on Android host — use androidNative target for FFI")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam not available on Android host — use androidNative target for FFI")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam not available on Android host — use androidNative target for FFI")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler not available on Android host — use androidNative target for FFI")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler not available on Android host — use androidNative target for FFI")

public actual fun semGetvalue(sem: SemT, sval: CInt?): CInt =
    throw UnsupportedOperationException("semGetvalue not available on Android host — use androidNative target for FFI")

public actual fun semTimedwait(sem: SemT, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("semTimedwait not available on Android host — use androidNative target for FFI")

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: ULong, hdtr: SfHdtr?, sbytes: OffT?, flags: CInt): CInt =
    throw UnsupportedOperationException("sendfile not available on Android host — use androidNative target for FFI")

public actual fun setdomainname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("setdomainname not available on Android host — use androidNative target for FFI")

public actual fun sethostname(name: String?, len: CInt): CInt =
    throw UnsupportedOperationException("sethostname not available on Android host — use androidNative target for FFI")

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority not available on Android host — use androidNative target for FFI")

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    throw UnsupportedOperationException("setresgid not available on Android host — use androidNative target for FFI")

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    throw UnsupportedOperationException("setresuid not available on Android host — use androidNative target for FFI")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("settimeofday not available on Android host — use androidNative target for FFI")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent not available on Android host — use androidNative target for FFI")
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen not available on Android host — use androidNative target for FFI")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait not available on Android host — use androidNative target for FFI")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo not available on Android host — use androidNative target for FFI")

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl not available on Android host — use androidNative target for FFI")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctlbyname not available on Android host — use androidNative target for FFI")

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: ULong?): CInt =
    throw UnsupportedOperationException("sysctlnametomib not available on Android host — use androidNative target for FFI")

public actual fun uselocale(loc: LocaleT): LocaleT =
    throw UnsupportedOperationException("uselocale not available on Android host — use androidNative target for FFI")

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat not available on Android host — use androidNative target for FFI")

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime not available on Android host — use androidNative target for FFI")

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime not available on Android host — use androidNative target for FFI")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv not available on Android host — use androidNative target for FFI")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose not available on Android host — use androidNative target for FFI")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero not available on Android host — use androidNative target for FFI")
}

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: CInt, n: ULong): CInt =
    throw UnsupportedOperationException("memsetS not available on Android host — use androidNative target for FFI")

public actual fun gethostid(): CLong =
    throw UnsupportedOperationException("gethostid not available on Android host — use androidNative target for FFI")

public actual fun sethostid(hostid: CLong) {
    throw UnsupportedOperationException("sethostid not available on Android host — use androidNative target for FFI")
}

public actual fun eui64Aton(a: String?, e: Eui64?): CInt =
    throw UnsupportedOperationException("eui64Aton not available on Android host — use androidNative target for FFI")

public actual fun eui64Ntoa(id: Eui64?, a: String?, len: ULong): CInt =
    throw UnsupportedOperationException("eui64Ntoa not available on Android host — use androidNative target for FFI")

public actual fun eui64Ntohost(hostname: String?, len: ULong, id: Eui64?): CInt =
    throw UnsupportedOperationException("eui64Ntohost not available on Android host — use androidNative target for FFI")

public actual fun eui64Hostton(hostname: String?, id: Eui64?): CInt =
    throw UnsupportedOperationException("eui64Hostton not available on Android host — use androidNative target for FFI")

public actual fun eaccess(path: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("eaccess not available on Android host — use androidNative target for FFI")

public actual fun kenv(action: CInt, name: String?, value: String?, len: CInt): CInt =
    throw UnsupportedOperationException("kenv not available on Android host — use androidNative target for FFI")

public actual fun reboot(howto: CInt): CInt =
    throw UnsupportedOperationException("reboot not available on Android host — use androidNative target for FFI")

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("exect not available on Android host — use androidNative target for FFI")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvP not available on Android host — use androidNative target for FFI")

public actual fun mkostemp(template: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemp not available on Android host — use androidNative target for FFI")

public actual fun mkostemps(template: String?, suffixlen: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("mkostemps not available on Android host — use androidNative target for FFI")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, default: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, flags: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, flags: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT, flags: CInt?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT, flags: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on Android host — use androidNative target for FFI")

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT, fd: CInt, newfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on Android host — use androidNative target for FFI")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose not available on Android host — use androidNative target for FFI")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr not available on Android host — use androidNative target for FFI")

public actual fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify not available on Android host — use androidNative target for FFI")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen not available on Android host — use androidNative target for FFI")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive not available on Android host — use androidNative target for FFI")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend not available on Android host — use androidNative target for FFI")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr not available on Android host — use androidNative target for FFI")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive not available on Android host — use androidNative target for FFI")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend not available on Android host — use androidNative target for FFI")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink not available on Android host — use androidNative target for FFI")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom not available on Android host — use androidNative target for FFI")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy not available on Android host — use androidNative target for FFI")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty not available on Android host — use androidNative target for FFI")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty not available on Android host — use androidNative target for FFI")

public actual fun loginTty(fd: CInt): CInt =
    throw UnsupportedOperationException("loginTty not available on Android host — use androidNative target for FFI")

public actual fun fparseln(stream: FILE?, len: ULong?, lineno: ULong?, delim: String?, flags: CInt): String? =
    throw UnsupportedOperationException("fparseln not available on Android host — use androidNative target for FFI")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace not available on Android host — use androidNative target for FFI")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on Android host — use androidNative target for FFI")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: CInt): CInt =
    throw UnsupportedOperationException("backtraceSymbolsFd not available on Android host — use androidNative target for FFI")

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): KvmT =
    throw UnsupportedOperationException("kvmOpen not available on Android host — use androidNative target for FFI")

public actual fun kvmClose(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmClose not available on Android host — use androidNative target for FFI")

public actual fun kvmGetprocs(kd: KvmT, op: CInt, arg: CInt, cnt: CInt?): KinfoProc? =
    throw UnsupportedOperationException("kvmGetprocs not available on Android host — use androidNative target for FFI")

public actual fun kvmGetloadavg(kd: KvmT, loadavg: CDouble?, nelem: CInt): CInt =
    throw UnsupportedOperationException("kvmGetloadavg not available on Android host — use androidNative target for FFI")

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: String?): KvmT =
    throw UnsupportedOperationException("kvmOpenfiles not available on Android host — use androidNative target for FFI")

public actual fun kvmRead(kd: KvmT, addr: CULong, buf: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("kvmRead not available on Android host — use androidNative target for FFI")

public actual fun kvmWrite(kd: KvmT, addr: CULong, buf: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("kvmWrite not available on Android host — use androidNative target for FFI")


public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> CInt)?, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlIteratePhdr not available on Android host — use androidNative target for FFI")
