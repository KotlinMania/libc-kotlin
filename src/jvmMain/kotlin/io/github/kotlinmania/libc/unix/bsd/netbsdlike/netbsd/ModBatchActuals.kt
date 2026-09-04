// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on JVM — no C library access")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on JVM — no C library access")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on JVM — no C library access")

public actual fun sOCKCREDSIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE not available on JVM — no C library access")

public actual fun pROTMPROTECT(x: CInt): CInt =
    throw UnsupportedOperationException("pROTMPROTECT not available on JVM — no C library access")

public actual fun pROTMPROTECTEXTRACT(x: CInt): CInt =
    throw UnsupportedOperationException("pROTMPROTECTEXTRACT not available on JVM — no C library access")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep not available on JVM — no C library access")

public actual fun reallocarr(ptr: COpaquePointer?, number: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("reallocarr not available on JVM — no C library access")

public actual fun chflags(path: String?, flags: CULong): CInt =
    throw UnsupportedOperationException("chflags not available on JVM — no C library access")

public actual fun fchflags(fd: CInt, flags: CULong): CInt =
    throw UnsupportedOperationException("fchflags not available on JVM — no C library access")

public actual fun lchflags(path: String?, flags: CULong): CInt =
    throw UnsupportedOperationException("lchflags not available on JVM — no C library access")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListFd not available on JVM — no C library access")

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListFile not available on JVM — no C library access")

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListLink not available on JVM — no C library access")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteFd not available on JVM — no C library access")

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteFile not available on JVM — no C library access")

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteLink not available on JVM — no C library access")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetFd not available on JVM — no C library access")

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetFile not available on JVM — no C library access")

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetLink not available on JVM — no C library access")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    throw UnsupportedOperationException("extattrNamespaceToString not available on JVM — no C library access")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): CInt =
    throw UnsupportedOperationException("extattrSetFd not available on JVM — no C library access")

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): CInt =
    throw UnsupportedOperationException("extattrSetFile not available on JVM — no C library access")

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): CInt =
    throw UnsupportedOperationException("extattrSetLink not available on JVM — no C library access")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    throw UnsupportedOperationException("extattrStringToNamespace not available on JVM — no C library access")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty not available on JVM — no C library access")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty not available on JVM — no C library access")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR not available on JVM — no C library access")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on JVM — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl not available on JVM — no C library access")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctlbyname not available on JVM — no C library access")

public actual fun sysctlnametomib(sname: String?, name: CInt?, namelenp: ULong?): CInt =
    throw UnsupportedOperationException("sysctlnametomib not available on JVM — no C library access")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: ULong, eventlist: Kevent?, nevents: ULong, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent not available on JVM — no C library access")

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: ULong): CInt =
    throw UnsupportedOperationException("mount not available on JVM — no C library access")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen not available on JVM — no C library access")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose not available on JVM — no C library access")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr not available on JVM — no C library access")

public actual fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify not available on JVM — no C library access")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive not available on JVM — no C library access")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend not available on JVM — no C library access")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr not available on JVM — no C library access")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive not available on JVM — no C library access")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend not available on JVM — no C library access")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink not available on JVM — no C library access")

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    throw UnsupportedOperationException("ptrace not available on JVM — no C library access")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("utrace not available on JVM — no C library access")

public actual fun pthreadGetnameNp(t: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp not available on JVM — no C library access")

public actual fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp not available on JVM — no C library access")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetNp not available on JVM — no C library access")

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp not available on JVM — no C library access")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: ULong, set: CpusetT?): CInt =
    throw UnsupportedOperationException("pthreadGetaffinityNp not available on JVM — no C library access")

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: ULong, set: CpusetT?): CInt =
    throw UnsupportedOperationException("pthreadSetaffinityNp not available on JVM — no C library access")

public actual fun cpusetCreate(): CpusetT? =
    throw UnsupportedOperationException("cpusetCreate not available on JVM — no C library access")

public actual fun cpusetDestroy(set: CpusetT?) {
    throw UnsupportedOperationException("cpusetDestroy not available on JVM — no C library access")
}

public actual fun cpusetClr(cpu: CpuidT, set: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetClr not available on JVM — no C library access")

public actual fun cpusetSet(cpu: CpuidT, set: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetSet not available on JVM — no C library access")

public actual fun cpusetIsset(cpu: CpuidT, set: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetIsset not available on JVM — no C library access")

public actual fun cpusetSize(set: CpusetT?): ULong =
    throw UnsupportedOperationException("cpusetSize not available on JVM — no C library access")

public actual fun cpusetZero(set: CpusetT?) {
    throw UnsupportedOperationException("cpusetZero not available on JVM — no C library access")
}

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait not available on JVM — no C library access")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo not available on JVM — no C library access")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale not available on JVM — no C library access")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale not available on JVM — no C library access")
}

public actual fun localeconvL(loc: LocaleT): Lconv? =
    throw UnsupportedOperationException("localeconvL not available on JVM — no C library access")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale not available on JVM — no C library access")

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("settimeofday not available on JVM — no C library access")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 not available on JVM — no C library access")

public actual fun kqueue1(flags: CInt): CInt =
    throw UnsupportedOperationException("kqueue1 not available on JVM — no C library access")

public actual fun lwpSelf(): LwpidT =
    throw UnsupportedOperationException("lwpSelf not available on JVM — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on JVM — no C library access")

public actual fun dlauxinfo(): COpaquePointer? =
    throw UnsupportedOperationException("dlauxinfo not available on JVM — no C library access")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv not available on JVM — no C library access")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose not available on JVM — no C library access")

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerCreate not available on JVM — no C library access")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete not available on JVM — no C library access")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun not available on JVM — no C library access")

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime not available on JVM — no C library access")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime not available on JVM — no C library access")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym not available on JVM — no C library access")

public actual fun explicitMemset(b: COpaquePointer?, c: CInt, len: ULong) {
    throw UnsupportedOperationException("explicitMemset not available on JVM — no C library access")
}

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("consttimeMemequal not available on JVM — no C library access")

public actual fun setproctitle(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitle not available on JVM — no C library access")
}

public actual fun mremap(oldp: COpaquePointer?, oldsize: ULong, newp: COpaquePointer?, newsize: ULong, flags: CInt): COpaquePointer? =
    throw UnsupportedOperationException("mremap not available on JVM — no C library access")

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval not available on JVM — no C library access")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam not available on JVM — no C library access")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam not available on JVM — no C library access")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler not available on JVM — no C library access")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler not available on JVM — no C library access")

public actual fun pollts(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("pollts not available on JVM — no C library access")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom not available on JVM — no C library access")

public actual fun reboot(mode: CInt, bootstr: String?): CInt =
    throw UnsupportedOperationException("reboot not available on JVM — no C library access")

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: Timespec?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt =
    throw UnsupportedOperationException("lwpPark not available on JVM — no C library access")

public actual fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt =
    throw UnsupportedOperationException("lwpUnpark not available on JVM — no C library access")

public actual fun lwpUnparkAll(targets: LwpidT?, ntargets: ULong, hint: COpaquePointer?): CInt =
    throw UnsupportedOperationException("lwpUnparkAll not available on JVM — no C library access")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo not available on JVM — no C library access")

public actual fun getvfsstat(buf: Statvfs?, bufsize: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getvfsstat not available on JVM — no C library access")

public actual fun eventfd(`val`: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd not available on JVM — no C library access")

public actual fun eventfdRead(efd: CInt, valp: EventfdT?): CInt =
    throw UnsupportedOperationException("eventfdRead not available on JVM — no C library access")

public actual fun eventfdWrite(efd: CInt, `val`: EventfdT): CInt =
    throw UnsupportedOperationException("eventfdWrite not available on JVM — no C library access")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate not available on JVM — no C library access")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime not available on JVM — no C library access")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime not available on JVM — no C library access")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead not available on JVM — no C library access")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite not available on JVM — no C library access")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync not available on JVM — no C library access")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError not available on JVM — no C library access")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn not available on JVM — no C library access")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend not available on JVM — no C library access")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel not available on JVM — no C library access")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio not available on JVM — no C library access")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwentR not available on JVM — no C library access")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrentR not available on JVM — no C library access")

public actual fun emalloc(n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("emalloc not available on JVM — no C library access")

public actual fun ecalloc(n: ULong, c: ULong): COpaquePointer? =
    throw UnsupportedOperationException("ecalloc not available on JVM — no C library access")

public actual fun erealloc(p: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("erealloc not available on JVM — no C library access")

public actual fun ereallocarr(p: COpaquePointer?, n: ULong, s: ULong) {
    throw UnsupportedOperationException("ereallocarr not available on JVM — no C library access")
}

public actual fun estrdup(s: String?): String? =
    throw UnsupportedOperationException("estrdup not available on JVM — no C library access")

public actual fun estrndup(s: String?, len: ULong): String? =
    throw UnsupportedOperationException("estrndup not available on JVM — no C library access")

public actual fun estrlcpy(dst: String?, src: String?, len: ULong): ULong =
    throw UnsupportedOperationException("estrlcpy not available on JVM — no C library access")

public actual fun estrlcat(dst: String?, src: String?, len: ULong): ULong =
    throw UnsupportedOperationException("estrlcat not available on JVM — no C library access")

public actual fun easprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("easprintf not available on JVM — no C library access")

public actual fun evasprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("evasprintf not available on JVM — no C library access")

public actual fun securePath(path: String?): CInt =
    throw UnsupportedOperationException("securePath not available on JVM — no C library access")

public actual fun snprintb(buf: String?, buflen: ULong, fmt: String?, `val`: ULong): CInt =
    throw UnsupportedOperationException("snprintb not available on JVM — no C library access")

public actual fun snprintbM(buf: String?, buflen: ULong, fmt: String?, `val`: ULong, max: ULong): CInt =
    throw UnsupportedOperationException("snprintbM not available on JVM — no C library access")

public actual fun getbootfile(): String? =
    throw UnsupportedOperationException("getbootfile not available on JVM — no C library access")

public actual fun getbyteorder(): CInt =
    throw UnsupportedOperationException("getbyteorder not available on JVM — no C library access")

public actual fun getdiskrawname(buf: String?, buflen: ULong, name: String?): String? =
    throw UnsupportedOperationException("getdiskrawname not available on JVM — no C library access")

public actual fun getdiskcookedname(buf: String?, buflen: ULong, name: String?): String? =
    throw UnsupportedOperationException("getdiskcookedname not available on JVM — no C library access")

public actual fun getfsspecname(buf: String?, buflen: ULong, spec: String?): String? =
    throw UnsupportedOperationException("getfsspecname not available on JVM — no C library access")

public actual fun strpct(buf: String?, bufsiz: ULong, numerator: UintmaxT, denominator: UintmaxT, precision: ULong): String? =
    throw UnsupportedOperationException("strpct not available on JVM — no C library access")

public actual fun strspct(buf: String?, bufsiz: ULong, numerator: IntmaxT, denominator: IntmaxT, precision: ULong): String? =
    throw UnsupportedOperationException("strspct not available on JVM — no C library access")

public actual fun login(ut: Utmp?) {
    throw UnsupportedOperationException("login not available on JVM — no C library access")
}

public actual fun loginx(ut: Utmpx?) {
    throw UnsupportedOperationException("loginx not available on JVM — no C library access")
}

public actual fun logout(line: String?) {
    throw UnsupportedOperationException("logout not available on JVM — no C library access")
}

public actual fun logoutx(line: String?, status: CInt, tpe: CInt) {
    throw UnsupportedOperationException("logoutx not available on JVM — no C library access")
}

public actual fun logwtmp(line: String?, name: String?, host: String?) {
    throw UnsupportedOperationException("logwtmp not available on JVM — no C library access")
}

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt) {
    throw UnsupportedOperationException("logwtmpx not available on JVM — no C library access")
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("getxattr not available on JVM — no C library access")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("lgetxattr not available on JVM — no C library access")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("fgetxattr not available on JVM — no C library access")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): CInt =
    throw UnsupportedOperationException("setxattr not available on JVM — no C library access")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): CInt =
    throw UnsupportedOperationException("lsetxattr not available on JVM — no C library access")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("fsetxattr not available on JVM — no C library access")

public actual fun listxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("listxattr not available on JVM — no C library access")

public actual fun llistxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("llistxattr not available on JVM — no C library access")

public actual fun flistxattr(filedes: CInt, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("flistxattr not available on JVM — no C library access")

public actual fun removexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("removexattr not available on JVM — no C library access")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("lremovexattr not available on JVM — no C library access")

public actual fun fremovexattr(fd: CInt, path: String?, name: String?): CInt =
    throw UnsupportedOperationException("fremovexattr not available on JVM — no C library access")

public actual fun stringToFlags(stringP: COpaquePointer?, setp: CULong?, clrp: CULong?): CInt =
    throw UnsupportedOperationException("stringToFlags not available on JVM — no C library access")

public actual fun flagsToString(flags: CULong, def: String?): CInt =
    throw UnsupportedOperationException("flagsToString not available on JVM — no C library access")

public actual fun kinfoGetvmmap(pid: PidT, cntp: ULong?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap not available on JVM — no C library access")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace not available on JVM — no C library access")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on JVM — no C library access")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: CInt): CInt =
    throw UnsupportedOperationException("backtraceSymbolsFd not available on JVM — no C library access")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbolsFmt not available on JVM — no C library access")

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: ULong, fd: CInt, fmt: String?): CInt =
    throw UnsupportedOperationException("backtraceSymbolsFdFmt not available on JVM — no C library access")

