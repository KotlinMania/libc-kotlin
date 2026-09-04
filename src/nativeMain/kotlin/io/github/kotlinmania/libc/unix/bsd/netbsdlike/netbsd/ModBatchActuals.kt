// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd requires manual FFI bridge — not yet implemented")

public actual fun sOCKCREDSIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE requires manual FFI bridge — not yet implemented")

public actual fun pROTMPROTECT(x: CInt): CInt =
    throw UnsupportedOperationException("pROTMPROTECT requires manual FFI bridge — not yet implemented")

public actual fun pROTMPROTECTEXTRACT(x: CInt): CInt =
    throw UnsupportedOperationException("pROTMPROTECTEXTRACT requires manual FFI bridge — not yet implemented")

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("clockNanosleep requires manual FFI bridge — not yet implemented")

public actual fun reallocarr(ptr: COpaquePointer?, number: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("reallocarr requires manual FFI bridge — not yet implemented")

public actual fun chflags(path: String?, flags: CULong): CInt =
    throw UnsupportedOperationException("chflags requires manual FFI bridge — not yet implemented")

public actual fun fchflags(fd: CInt, flags: CULong): CInt =
    throw UnsupportedOperationException("fchflags requires manual FFI bridge — not yet implemented")

public actual fun lchflags(path: String?, flags: CULong): CInt =
    throw UnsupportedOperationException("lchflags requires manual FFI bridge — not yet implemented")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListFd requires manual FFI bridge — not yet implemented")

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListFile requires manual FFI bridge — not yet implemented")

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListLink requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteFd requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteFile requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteLink requires manual FFI bridge — not yet implemented")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetFd requires manual FFI bridge — not yet implemented")

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetFile requires manual FFI bridge — not yet implemented")

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetLink requires manual FFI bridge — not yet implemented")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    throw UnsupportedOperationException("extattrNamespaceToString requires manual FFI bridge — not yet implemented")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): CInt =
    throw UnsupportedOperationException("extattrSetFd requires manual FFI bridge — not yet implemented")

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): CInt =
    throw UnsupportedOperationException("extattrSetFile requires manual FFI bridge — not yet implemented")

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): CInt =
    throw UnsupportedOperationException("extattrSetLink requires manual FFI bridge — not yet implemented")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    throw UnsupportedOperationException("extattrStringToNamespace requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: String?, termp: Termios?, winp: Winsize?): CInt =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun forkpty(amaster: CInt?, name: String?, termp: Termios?, winp: Winsize?): PidT =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR requires manual FFI bridge — not yet implemented")

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    throw UnsupportedOperationException("lutimes requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect requires manual FFI bridge — not yet implemented")

public actual fun sysctl(name: CInt?, namelen: CUInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctl requires manual FFI bridge — not yet implemented")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("sysctlbyname requires manual FFI bridge — not yet implemented")

public actual fun sysctlnametomib(sname: String?, name: CInt?, namelenp: ULong?): CInt =
    throw UnsupportedOperationException("sysctlnametomib requires manual FFI bridge — not yet implemented")

public actual fun kevent(kq: CInt, changelist: Kevent?, nchanges: ULong, eventlist: Kevent?, nevents: ULong, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("kevent requires manual FFI bridge — not yet implemented")

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: ULong): CInt =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun mqOpen(name: String?, oflag: CInt, vararg args: Any?): MqdT =
    throw UnsupportedOperationException("mqOpen requires manual FFI bridge — not yet implemented")

public actual fun mqClose(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqClose requires manual FFI bridge — not yet implemented")

public actual fun mqGetattr(mqd: MqdT, attr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqGetattr requires manual FFI bridge — not yet implemented")

public actual fun mqNotify(mqd: MqdT, notification: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify requires manual FFI bridge — not yet implemented")

public actual fun mqReceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?): SsizeT =
    throw UnsupportedOperationException("mqReceive requires manual FFI bridge — not yet implemented")

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt): CInt =
    throw UnsupportedOperationException("mqSend requires manual FFI bridge — not yet implemented")

public actual fun mqSetattr(mqd: MqdT, newattr: MqAttr?, oldattr: MqAttr?): CInt =
    throw UnsupportedOperationException("mqSetattr requires manual FFI bridge — not yet implemented")

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt?, absTimeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("mqTimedreceive requires manual FFI bridge — not yet implemented")

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: ULong, msgPrio: CUInt, absTimeout: Timespec?): CInt =
    throw UnsupportedOperationException("mqTimedsend requires manual FFI bridge — not yet implemented")

public actual fun mqUnlink(name: String?): CInt =
    throw UnsupportedOperationException("mqUnlink requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("utrace requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(t: PthreadT, name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: ULong, set: CpusetT?): CInt =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: ULong, set: CpusetT?): CInt =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun cpusetCreate(): CpusetT? =
    throw UnsupportedOperationException("cpusetCreate requires manual FFI bridge — not yet implemented")

public actual fun cpusetDestroy(set: CpusetT?) {
    throw UnsupportedOperationException("cpusetDestroy requires manual FFI bridge — not yet implemented")
}

public actual fun cpusetClr(cpu: CpuidT, set: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetClr requires manual FFI bridge — not yet implemented")

public actual fun cpusetSet(cpu: CpuidT, set: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetSet requires manual FFI bridge — not yet implemented")

public actual fun cpusetIsset(cpu: CpuidT, set: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetIsset requires manual FFI bridge — not yet implemented")

public actual fun cpusetSize(set: CpusetT?): ULong =
    throw UnsupportedOperationException("cpusetSize requires manual FFI bridge — not yet implemented")

public actual fun cpusetZero(set: CpusetT?) {
    throw UnsupportedOperationException("cpusetZero requires manual FFI bridge — not yet implemented")
}

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait requires manual FFI bridge — not yet implemented")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo requires manual FFI bridge — not yet implemented")

public actual fun duplocale(base: LocaleT): LocaleT =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: LocaleT) {
    throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")
}

public actual fun localeconvL(loc: LocaleT): Lconv? =
    throw UnsupportedOperationException("localeconvL requires manual FFI bridge — not yet implemented")

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("settimeofday requires manual FFI bridge — not yet implemented")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun kqueue1(flags: CInt): CInt =
    throw UnsupportedOperationException("kqueue1 requires manual FFI bridge — not yet implemented")

public actual fun lwpSelf(): LwpidT =
    throw UnsupportedOperationException("lwpSelf requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires manual FFI bridge — not yet implemented")

public actual fun dlauxinfo(): COpaquePointer? =
    throw UnsupportedOperationException("dlauxinfo requires manual FFI bridge — not yet implemented")

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires manual FFI bridge — not yet implemented")

public actual fun iconvClose(cd: IconvT): CInt =
    throw UnsupportedOperationException("iconvClose requires manual FFI bridge — not yet implemented")

public actual fun timerCreate(clockid: ClockidT, sevp: Sigevent?, timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerCreate requires manual FFI bridge — not yet implemented")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete requires manual FFI bridge — not yet implemented")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun requires manual FFI bridge — not yet implemented")

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime requires manual FFI bridge — not yet implemented")

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime requires manual FFI bridge — not yet implemented")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires manual FFI bridge — not yet implemented")

public actual fun explicitMemset(b: COpaquePointer?, c: CInt, len: ULong) {
    throw UnsupportedOperationException("explicitMemset requires manual FFI bridge — not yet implemented")
}

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("consttimeMemequal requires manual FFI bridge — not yet implemented")

public actual fun setproctitle(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitle requires manual FFI bridge — not yet implemented")
}

public actual fun mremap(oldp: COpaquePointer?, oldsize: ULong, newp: COpaquePointer?, newsize: ULong, flags: CInt): COpaquePointer? =
    throw UnsupportedOperationException("mremap requires manual FFI bridge — not yet implemented")

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: PidT): CInt =
    throw UnsupportedOperationException("schedGetscheduler requires manual FFI bridge — not yet implemented")

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun pollts(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("pollts requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom requires manual FFI bridge — not yet implemented")

public actual fun reboot(mode: CInt, bootstr: String?): CInt =
    throw UnsupportedOperationException("reboot requires manual FFI bridge — not yet implemented")

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: Timespec?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt =
    throw UnsupportedOperationException("lwpPark requires manual FFI bridge — not yet implemented")

public actual fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt =
    throw UnsupportedOperationException("lwpUnpark requires manual FFI bridge — not yet implemented")

public actual fun lwpUnparkAll(targets: LwpidT?, ntargets: ULong, hint: COpaquePointer?): CInt =
    throw UnsupportedOperationException("lwpUnparkAll requires manual FFI bridge — not yet implemented")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo requires manual FFI bridge — not yet implemented")

public actual fun getvfsstat(buf: Statvfs?, bufsize: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("getvfsstat requires manual FFI bridge — not yet implemented")

public actual fun eventfd(`val`: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd requires manual FFI bridge — not yet implemented")

public actual fun eventfdRead(efd: CInt, valp: EventfdT?): CInt =
    throw UnsupportedOperationException("eventfdRead requires manual FFI bridge — not yet implemented")

public actual fun eventfdWrite(efd: CInt, `val`: EventfdT): CInt =
    throw UnsupportedOperationException("eventfdWrite requires manual FFI bridge — not yet implemented")

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate requires manual FFI bridge — not yet implemented")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime requires manual FFI bridge — not yet implemented")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime requires manual FFI bridge — not yet implemented")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwentR requires manual FFI bridge — not yet implemented")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrentR requires manual FFI bridge — not yet implemented")

public actual fun emalloc(n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("emalloc requires manual FFI bridge — not yet implemented")

public actual fun ecalloc(n: ULong, c: ULong): COpaquePointer? =
    throw UnsupportedOperationException("ecalloc requires manual FFI bridge — not yet implemented")

public actual fun erealloc(p: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("erealloc requires manual FFI bridge — not yet implemented")

public actual fun ereallocarr(p: COpaquePointer?, n: ULong, s: ULong) {
    throw UnsupportedOperationException("ereallocarr requires manual FFI bridge — not yet implemented")
}

public actual fun estrdup(s: String?): String? =
    throw UnsupportedOperationException("estrdup requires manual FFI bridge — not yet implemented")

public actual fun estrndup(s: String?, len: ULong): String? =
    throw UnsupportedOperationException("estrndup requires manual FFI bridge — not yet implemented")

public actual fun estrlcpy(dst: String?, src: String?, len: ULong): ULong =
    throw UnsupportedOperationException("estrlcpy requires manual FFI bridge — not yet implemented")

public actual fun estrlcat(dst: String?, src: String?, len: ULong): ULong =
    throw UnsupportedOperationException("estrlcat requires manual FFI bridge — not yet implemented")

public actual fun easprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("easprintf requires manual FFI bridge — not yet implemented")

public actual fun evasprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): CInt =
    throw UnsupportedOperationException("evasprintf requires manual FFI bridge — not yet implemented")

public actual fun securePath(path: String?): CInt =
    throw UnsupportedOperationException("securePath requires manual FFI bridge — not yet implemented")

public actual fun snprintb(buf: String?, buflen: ULong, fmt: String?, `val`: ULong): CInt =
    throw UnsupportedOperationException("snprintb requires manual FFI bridge — not yet implemented")

public actual fun snprintbM(buf: String?, buflen: ULong, fmt: String?, `val`: ULong, max: ULong): CInt =
    throw UnsupportedOperationException("snprintbM requires manual FFI bridge — not yet implemented")

public actual fun getbootfile(): String? =
    throw UnsupportedOperationException("getbootfile requires manual FFI bridge — not yet implemented")

public actual fun getbyteorder(): CInt =
    throw UnsupportedOperationException("getbyteorder requires manual FFI bridge — not yet implemented")

public actual fun getdiskrawname(buf: String?, buflen: ULong, name: String?): String? =
    throw UnsupportedOperationException("getdiskrawname requires manual FFI bridge — not yet implemented")

public actual fun getdiskcookedname(buf: String?, buflen: ULong, name: String?): String? =
    throw UnsupportedOperationException("getdiskcookedname requires manual FFI bridge — not yet implemented")

public actual fun getfsspecname(buf: String?, buflen: ULong, spec: String?): String? =
    throw UnsupportedOperationException("getfsspecname requires manual FFI bridge — not yet implemented")

public actual fun strpct(buf: String?, bufsiz: ULong, numerator: UintmaxT, denominator: UintmaxT, precision: ULong): String? =
    throw UnsupportedOperationException("strpct requires manual FFI bridge — not yet implemented")

public actual fun strspct(buf: String?, bufsiz: ULong, numerator: IntmaxT, denominator: IntmaxT, precision: ULong): String? =
    throw UnsupportedOperationException("strspct requires manual FFI bridge — not yet implemented")

public actual fun login(ut: Utmp?) {
    throw UnsupportedOperationException("login requires manual FFI bridge — not yet implemented")
}

public actual fun loginx(ut: Utmpx?) {
    throw UnsupportedOperationException("loginx requires manual FFI bridge — not yet implemented")
}

public actual fun logout(line: String?) {
    throw UnsupportedOperationException("logout requires manual FFI bridge — not yet implemented")
}

public actual fun logoutx(line: String?, status: CInt, tpe: CInt) {
    throw UnsupportedOperationException("logoutx requires manual FFI bridge — not yet implemented")
}

public actual fun logwtmp(line: String?, name: String?, host: String?) {
    throw UnsupportedOperationException("logwtmp requires manual FFI bridge — not yet implemented")
}

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt) {
    throw UnsupportedOperationException("logwtmpx requires manual FFI bridge — not yet implemented")
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("getxattr requires manual FFI bridge — not yet implemented")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("lgetxattr requires manual FFI bridge — not yet implemented")

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong): SsizeT =
    throw UnsupportedOperationException("fgetxattr requires manual FFI bridge — not yet implemented")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): CInt =
    throw UnsupportedOperationException("setxattr requires manual FFI bridge — not yet implemented")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): CInt =
    throw UnsupportedOperationException("lsetxattr requires manual FFI bridge — not yet implemented")

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("fsetxattr requires manual FFI bridge — not yet implemented")

public actual fun listxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("listxattr requires manual FFI bridge — not yet implemented")

public actual fun llistxattr(path: String?, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("llistxattr requires manual FFI bridge — not yet implemented")

public actual fun flistxattr(filedes: CInt, list: String?, size: ULong): SsizeT =
    throw UnsupportedOperationException("flistxattr requires manual FFI bridge — not yet implemented")

public actual fun removexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("removexattr requires manual FFI bridge — not yet implemented")

public actual fun lremovexattr(path: String?, name: String?): CInt =
    throw UnsupportedOperationException("lremovexattr requires manual FFI bridge — not yet implemented")

public actual fun fremovexattr(fd: CInt, path: String?, name: String?): CInt =
    throw UnsupportedOperationException("fremovexattr requires manual FFI bridge — not yet implemented")

public actual fun stringToFlags(stringP: COpaquePointer?, setp: CULong?, clrp: CULong?): CInt =
    throw UnsupportedOperationException("stringToFlags requires manual FFI bridge — not yet implemented")

public actual fun flagsToString(flags: CULong, def: String?): CInt =
    throw UnsupportedOperationException("flagsToString requires manual FFI bridge — not yet implemented")

public actual fun kinfoGetvmmap(pid: PidT, cntp: ULong?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap requires manual FFI bridge — not yet implemented")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: CInt): CInt =
    throw UnsupportedOperationException("backtraceSymbolsFd requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbolsFmt requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: ULong, fd: CInt, fmt: String?): CInt =
    throw UnsupportedOperationException("backtraceSymbolsFdFmt requires manual FFI bridge — not yet implemented")
