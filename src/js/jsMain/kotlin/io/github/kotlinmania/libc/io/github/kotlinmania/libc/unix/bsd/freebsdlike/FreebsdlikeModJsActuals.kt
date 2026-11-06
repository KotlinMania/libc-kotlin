package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.COpaquePointer

public actual fun semDestroy(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').daemon(nochdir, noclose)") as CInt

public actual fun gettimeofday(tp: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun accept4(s: CInt, addr: Sockaddr?, addrlen: SocklenT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept4(s, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L, flags)") as CInt

public actual fun chflags(path: String?, flags: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').chflags(path, flags)") as CInt

public actual fun chflagsat(fd: CInt, path: String?, flags: CUlong, atflag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').chflagsat(fd, path, flags, atflag)") as CInt

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: ClockidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetcpuclockid(thread, clkId?.toLong() ?: 0L)") as CInt

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun duplocale(base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(base)") as LocaleT

public actual fun endutxent() {
    js("require('@kotlinmania/libc-native-bindings').endutxent()")
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchflags(fd, flags)") as CInt

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdomainname(name?.value ?: 0L, len)") as CInt

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrentR(grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(name, basegid, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)") as CInt

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun getpriority(which: CInt, who: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun getresgid(rgid: GidT?, egid: GidT?, sgid: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)") as CInt

public actual fun getresuid(ruid: UidT?, euid: UidT?, suid: UidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)") as CInt

public actual fun getutxent(): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxent()") as Utmpx?

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxid(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(name, basegid)") as CInt

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: CInt, eventlist: Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kevent(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, timeout?.toLong() ?: 0L)") as CInt

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').lchflags(path, flags)") as CInt

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lutimes(file, times?.toLong() ?: 0L)") as CInt

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memrchr(cx?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifoat(dirfd, pathname, mode)") as CInt

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknodat(dirfd, pathname, mode, dev)") as CInt

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mallocUsableSize(ptr?.value ?: 0L)") as SizeT

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mincore(addr?.value ?: 0L, len, vec?.value ?: 0L)") as CInt

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(mask, locale, base)") as LocaleT

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfoL(item, locale)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pipe2(fds?.toLong() ?: 0L, flags)") as CInt

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate(fd, offset, len)") as CInt

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise(fd, offset, len, advise)") as CInt

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: Timespec?, sigmask: SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetNp(tid, attr?.value ?: 0L)") as CInt

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetguardsize(attr?.value ?: 0L, guardsize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetguardsize(attr?.value ?: 0L, guardsize)") as CInt

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: ClockidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetclock(attr?.value ?: 0L, clockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.value ?: 0L, clockId)") as CInt

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetpshared(attr?.value ?: 0L, pshared)") as CInt

public actual fun pthreadMainNp(): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMainNp()") as CInt

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTimedlock(lock?.value ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)") as CInt

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexattrSetpshared(attr?.value ?: 0L, pshared)") as CInt

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrGetpshared(attr?.value ?: 0L, value?.toLong() ?: 0L)") as CInt

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadRwlockattrSetpshared(attr?.value ?: 0L, value)") as CInt

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrInit(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrDestroy(attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattrT?, shared: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrGetpshared(attr?.toLong() ?: 0L, shared?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattrT?, shared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierattrSetpshared(attr?.toLong() ?: 0L, shared)") as CInt

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: PthreadBarrierattrT?, count: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.toLong() ?: 0L, count)") as CInt

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierDestroy(barrier?.toLong() ?: 0L)") as CInt

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadBarrierWait(barrier?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').pthreadGetNameNp(tid, name?.value ?: 0L, len)")
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    js("require('@kotlinmania/libc-native-bindings').pthreadSetNameNp(tid, name)")
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetnameNp(thread, buffer?.value ?: 0L, length)") as CInt

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetnameNp(thread, name)") as CInt

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetschedparam(native: PthreadT, policy: CInt?, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptrace(request, pid, addr?.value ?: 0L, data)") as CInt

public actual fun utrace(addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').utrace(addr?.value ?: 0L, len)") as CInt

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').pututxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)") as SsizeT

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').querylocale(mask, loc)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtprio(function: CInt, pid: PidT, rtp: Rtprio?): CInt =
    js("require('@kotlinmania/libc-native-bindings').rtprio(function, pid, rtp?.toLong() ?: 0L)") as CInt

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedRrGetInterval(pid, t?.toLong() ?: 0L)") as CInt

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetscheduler(pid: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetscheduler(pid)") as CInt

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetscheduler(pid, policy, param?.toLong() ?: 0L)") as CInt

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)") as CInt

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: io.github.kotlinmania.libc.SfHdtr?, sbytes: OffT?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sendfile(fd, s, offset, nbytes, hdtr?.toLong() ?: 0L, sbytes?.toLong() ?: 0L, flags)") as CInt

public actual fun setdomainname(name: String?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setdomainname(name, len)") as CInt

public actual fun sethostname(name: String?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, prio)") as CInt

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresgid(rgid, egid, sgid)") as CInt

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setresuid(ruid, euid, suid)") as CInt

public actual fun settimeofday(tv: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)") as CInt

public actual fun setutxent() {
    js("require('@kotlinmania/libc-native-bindings').setutxent()")
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctlbyname(name, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctlnametomib(name, mibp?.toLong() ?: 0L, sizep?.toLong() ?: 0L)") as CInt

public actual fun uselocale(loc: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').uselocale(loc)") as LocaleT

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(dirfd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun ntpAdjtime(buf: Timex?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ntpAdjtime(buf?.toLong() ?: 0L)") as CInt

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ntpGettime(buf?.toLong() ?: 0L)") as CInt

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    js("require('@kotlinmania/libc-native-bindings').iconvOpen(tocode, fromcode)") as IconvT

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)") as SizeT

public actual fun iconvClose(cd: IconvT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iconvClose(cd)") as CInt

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').explicitBzero(s?.value ?: 0L, len)")
}

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').memsetS(s?.value ?: 0L, smax, c, n)") as CInt

public actual fun gethostid(): CLong =
    js("require('@kotlinmania/libc-native-bindings').gethostid()") as CLong

public actual fun sethostid(hostid: CLong) {
    js("require('@kotlinmania/libc-native-bindings').sethostid(hostid)")
}

public actual fun eui64Aton(a: String?, e: Eui64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').eui64Aton(a, e?.toLong() ?: 0L)") as CInt

public actual fun eui64Ntoa(id: Eui64?, a: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').eui64Ntoa(id?.toLong() ?: 0L, a?.value ?: 0L, len)") as CInt

public actual fun eui64Ntohost(hostname: COpaquePointer?, len: SizeT, id: Eui64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').eui64Ntohost(hostname?.value ?: 0L, len, id?.toLong() ?: 0L)") as CInt

public actual fun eui64Hostton(hostname: String?, id: Eui64?): CInt =
    js("require('@kotlinmania/libc-native-bindings').eui64Hostton(hostname, id?.toLong() ?: 0L)") as CInt

public actual fun eaccess(path: String?, mode: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eaccess(path, mode)") as CInt

public actual fun kenv(action: CInt, name: String?, value: COpaquePointer?, len: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').kenv(action, name, value?.value ?: 0L, len)") as CInt

public actual fun reboot(howto: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').reboot(howto)") as CInt

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').exect(path, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvP(file, searchPath, argv?.value ?: 0L)") as CInt

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemp(template?.value ?: 0L, flags)") as CInt

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkostemps(template?.value ?: 0L, suffixlen, flags)") as CInt

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrInit(attr?.value ?: 0L)") as CInt

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrDestroy(attr?.value ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigdefault(attr?.value ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigdefault(attr?.value ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigmask(attr?.value ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigmask(attr?.value ?: 0L, default?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetflags(attr?.value ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetflags(attr?.value ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetpgroup(attr?.value ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetpgroup(attr?.value ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedpolicy(attr?.value ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedpolicy(attr?.value ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsInit(actions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsDestroy(actions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddopen(actions?.value ?: 0L, fd, path, oflag, mode)") as CInt

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclose(actions?.value ?: 0L, fd)") as CInt

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAdddup2(actions?.value ?: 0L, fd, newfd)") as CInt

public actual fun mqClose(mqd: MqdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqClose(mqd)") as CInt

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqGetattr(mqd, attr?.toLong() ?: 0L)") as CInt

public actual fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqNotify(mqd, notification?.toLong() ?: 0L)") as CInt

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)") as SsizeT

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSend(mqd, msgPtr, msgLen, msgPrio)") as CInt

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)") as CInt

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)") as SsizeT

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)") as CInt

public actual fun mqUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqUnlink(name)") as CInt

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getrandom(buf?.value ?: 0L, buflen, flags)") as SsizeT

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getentropy(buf?.value ?: 0L, buflen)") as CInt

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    js("require('@kotlinmania/libc-native-bindings').forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as PidT

public actual fun loginTty(fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').loginTty(fd)") as CInt

public actual fun fparseln(stream: FILE?, len: SizeT?, lineno: SizeT?, delim: String?, flags: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').fparseln(stream?.toLong() ?: 0L, len?.toLong() ?: 0L, lineno?.toLong() ?: 0L, delim, flags)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').backtrace(addrlist?.value ?: 0L, len)") as SizeT

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbols(addrlist?.value ?: 0L, len)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbolsFd(addrlist?.value ?: 0L, len, fd)") as CInt

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').kvmOpen(execfile, corefile, swapfile, flags, errstr)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmClose(kd: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kvmClose(kd?.value ?: 0L)") as CInt

public actual fun kvmGetprocs(kd: COpaquePointer?, op: CInt, arg: CInt, cnt: CInt?): KinfoProc? =
    js("require('@kotlinmania/libc-native-bindings').kvmGetprocs(kd?.value ?: 0L, op, arg, cnt?.toLong() ?: 0L)") as KinfoProc?

public actual fun kvmGetloadavg(kd: COpaquePointer?, loadavg: CDouble?, nelem: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').kvmGetloadavg(kd?.value ?: 0L, loadavg?.toLong() ?: 0L, nelem)") as CInt

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').kvmOpenfiles(execfile, corefile, swapfile, flags, errbuf?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmRead(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').kvmRead(kd?.value ?: 0L, addr, buf?.value ?: 0L, nbytes)") as SsizeT

public actual fun kvmWrite(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').kvmWrite(kd?.value ?: 0L, addr, buf?.value ?: 0L, nbytes)") as SsizeT
