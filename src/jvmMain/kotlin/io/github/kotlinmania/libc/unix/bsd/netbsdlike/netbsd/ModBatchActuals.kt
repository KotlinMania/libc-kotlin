// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on JVM — no C library access")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on JVM — no C library access")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on JVM — no C library access")

public actual fun sockcredSize(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE not available on JVM — no C library access")

public actual fun protMprotect(x: Int): Int =
    throw UnsupportedOperationException("pROTMPROTECT not available on JVM — no C library access")

public actual fun protMprotectExtract(x: Int): Int =
    throw UnsupportedOperationException("pROTMPROTECTEXTRACT not available on JVM — no C library access")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep not available on JVM — no C library access")

public actual fun reallocarr(ptr: COpaquePointer?, number: ULong, size: ULong): Int =
    throw UnsupportedOperationException("reallocarr not available on JVM — no C library access")

public actual fun chflags(path: String?, flags: ULong): Int =
    throw UnsupportedOperationException("chflags not available on JVM — no C library access")

public actual fun fchflags(fd: Int, flags: ULong): Int =
    throw UnsupportedOperationException("fchflags not available on JVM — no C library access")

public actual fun lchflags(path: String?, flags: ULong): Int =
    throw UnsupportedOperationException("lchflags not available on JVM — no C library access")

public actual fun extattrListFd(fd: Int, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFd not available on JVM — no C library access")

public actual fun extattrListFile(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFile not available on JVM — no C library access")

public actual fun extattrListLink(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListLink not available on JVM — no C library access")

public actual fun extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFd not available on JVM — no C library access")

public actual fun extattrDeleteFile(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFile not available on JVM — no C library access")

public actual fun extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteLink not available on JVM — no C library access")

public actual fun extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFd not available on JVM — no C library access")

public actual fun extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFile not available on JVM — no C library access")

public actual fun extattrGetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetLink not available on JVM — no C library access")

public actual fun extattrNamespaceToString(attrnamespace: Int, string: COpaquePointer?): Int =
    throw UnsupportedOperationException("extattrNamespaceToString not available on JVM — no C library access")

public actual fun extattrSetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Int =
    throw UnsupportedOperationException("extattrSetFd not available on JVM — no C library access")

public actual fun extattrSetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Int =
    throw UnsupportedOperationException("extattrSetFile not available on JVM — no C library access")

public actual fun extattrSetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Int =
    throw UnsupportedOperationException("extattrSetLink not available on JVM — no C library access")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: Int?): Int =
    throw UnsupportedOperationException("extattrStringToNamespace not available on JVM — no C library access")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty not available on JVM — no C library access")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty not available on JVM — no C library access")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR not available on JVM — no C library access")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo not available on JVM — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl not available on JVM — no C library access")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctlbyname not available on JVM — no C library access")

public actual fun sysctlnametomib(sname: String?, name: Int?, namelenp: ULong?): Int =
    throw UnsupportedOperationException("sysctlnametomib not available on JVM — no C library access")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: ULong, eventlist: Kevent?, nevents: ULong, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent not available on JVM — no C library access")

public actual fun mount(src: String?, target: String?, flags: Int, data: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("mount not available on JVM — no C library access")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen not available on JVM — no C library access")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose not available on JVM — no C library access")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr not available on JVM — no C library access")

public actual fun mqNotify(mqd: Int, notification: Sigevent?): Int =
    throw UnsupportedOperationException("mqNotify not available on JVM — no C library access")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive not available on JVM — no C library access")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend not available on JVM — no C library access")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr not available on JVM — no C library access")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive not available on JVM — no C library access")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend not available on JVM — no C library access")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink not available on JVM — no C library access")

public actual fun ptrace(request: Int, pid: Int, addr: COpaquePointer?, data: Int): Int =
    throw UnsupportedOperationException("ptrace not available on JVM — no C library access")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("utrace not available on JVM — no C library access")

public actual fun pthreadGetnameNp(t: ULong, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp not available on JVM — no C library access")

public actual fun pthreadSetnameNp(t: ULong, name: String?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp not available on JVM — no C library access")

public actual fun pthreadAttrGetNp(thread: ULong, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrGetNp not available on JVM — no C library access")

public actual fun pthreadGetattrNp(native: ULong, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp not available on JVM — no C library access")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun pthreadGetaffinityNp(thread: ULong, size: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp not available on JVM — no C library access")

public actual fun pthreadSetaffinityNp(thread: ULong, size: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp not available on JVM — no C library access")

public actual fun cpusetCreate(): ULong? =
    throw UnsupportedOperationException("cpusetCreate not available on JVM — no C library access")

public actual fun cpusetDestroy(set: ULong?): Unit = throw UnsupportedOperationException("cpusetDestroy not available on JVM — no C library access")

public actual fun cpusetClr(cpu: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("cpusetClr not available on JVM — no C library access")

public actual fun cpusetSet(cpu: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("cpusetSet not available on JVM — no C library access")

public actual fun cpusetIsset(cpu: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("cpusetIsset not available on JVM — no C library access")

public actual fun cpusetSize(set: ULong?): ULong =
    throw UnsupportedOperationException("cpusetSize not available on JVM — no C library access")

public actual fun cpusetZero(set: ULong?): Unit = throw UnsupportedOperationException("cpusetZero not available on JVM — no C library access")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait not available on JVM — no C library access")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo not available on JVM — no C library access")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale not available on JVM — no C library access")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale not available on JVM — no C library access")

public actual fun localeconvL(loc: io.github.kotlinmania.libc.COpaquePointer?): Lconv? =
    throw UnsupportedOperationException("localeconvL not available on JVM — no C library access")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale not available on JVM — no C library access")

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("settimeofday not available on JVM — no C library access")

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 not available on JVM — no C library access")

public actual fun kqueue1(flags: Int): Int =
    throw UnsupportedOperationException("kqueue1 not available on JVM — no C library access")

public actual fun lwpSelf(): Int =
    throw UnsupportedOperationException("lwpSelf not available on JVM — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on JVM — no C library access")

public actual fun dlauxinfo(): COpaquePointer? =
    throw UnsupportedOperationException("dlauxinfo not available on JVM — no C library access")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv not available on JVM — no C library access")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose not available on JVM — no C library access")

public actual fun timerCreate(clockid: Int, sevp: Sigevent?, timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerCreate not available on JVM — no C library access")

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerDelete not available on JVM — no C library access")

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerGetoverrun not available on JVM — no C library access")

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime not available on JVM — no C library access")

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime not available on JVM — no C library access")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym not available on JVM — no C library access")

public actual fun explicitMemset(b: COpaquePointer?, c: Int, len: ULong): Unit = throw UnsupportedOperationException("explicitMemset not available on JVM — no C library access")

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("consttimeMemequal not available on JVM — no C library access")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle not available on JVM — no C library access")

public actual fun mremap(oldp: COpaquePointer?, oldsize: ULong, newp: COpaquePointer?, newsize: ULong, flags: Int): COpaquePointer? =
    throw UnsupportedOperationException("mremap not available on JVM — no C library access")

public actual fun schedRrGetInterval(pid: Int, t: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval not available on JVM — no C library access")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam not available on JVM — no C library access")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam not available on JVM — no C library access")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler not available on JVM — no C library access")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler not available on JVM — no C library access")

public actual fun pollts(fds: Pollfd?, nfds: UInt, ts: Timespec?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("pollts not available on JVM — no C library access")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom not available on JVM — no C library access")

public actual fun reboot(mode: Int, bootstr: String?): Int =
    throw UnsupportedOperationException("reboot not available on JVM — no C library access")

public actual fun lwpPark(clock: Int, flags: Int, ts: Timespec?, unpark: Int, hint: COpaquePointer?, unparkhint: COpaquePointer?): Int =
    throw UnsupportedOperationException("lwpPark not available on JVM — no C library access")

public actual fun lwpUnpark(lwp: Int, hint: COpaquePointer?): Int =
    throw UnsupportedOperationException("lwpUnpark not available on JVM — no C library access")

public actual fun lwpUnparkAll(targets: Int?, ntargets: ULong, hint: COpaquePointer?): Int =
    throw UnsupportedOperationException("lwpUnparkAll not available on JVM — no C library access")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo not available on JVM — no C library access")

public actual fun getvfsstat(buf: Statvfs?, bufsize: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getvfsstat not available on JVM — no C library access")

public actual fun eventfd(`val`: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd not available on JVM — no C library access")

public actual fun eventfdRead(efd: Int, valp: ULong?): Int =
    throw UnsupportedOperationException("eventfdRead not available on JVM — no C library access")

public actual fun eventfdWrite(efd: Int, `val`: ULong): Int =
    throw UnsupportedOperationException("eventfdWrite not available on JVM — no C library access")

public actual fun timerfdCreate(clockid: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate not available on JVM — no C library access")

public actual fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime not available on JVM — no C library access")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime not available on JVM — no C library access")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead not available on JVM — no C library access")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite not available on JVM — no C library access")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync not available on JVM — no C library access")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError not available on JVM — no C library access")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn not available on JVM — no C library access")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend not available on JVM — no C library access")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel not available on JVM — no C library access")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio not available on JVM — no C library access")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwentR not available on JVM — no C library access")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrentR not available on JVM — no C library access")

public actual fun emalloc(n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("emalloc not available on JVM — no C library access")

public actual fun ecalloc(n: ULong, c: ULong): COpaquePointer? =
    throw UnsupportedOperationException("ecalloc not available on JVM — no C library access")

public actual fun erealloc(p: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("erealloc not available on JVM — no C library access")

public actual fun ereallocarr(p: COpaquePointer?, n: ULong, s: ULong): Unit = throw UnsupportedOperationException("ereallocarr not available on JVM — no C library access")

public actual fun estrdup(s: String?): String? =
    throw UnsupportedOperationException("estrdup not available on JVM — no C library access")

public actual fun estrndup(s: String?, len: ULong): String? =
    throw UnsupportedOperationException("estrndup not available on JVM — no C library access")

public actual fun estrlcpy(dst: String?, src: String?, len: ULong): ULong =
    throw UnsupportedOperationException("estrlcpy not available on JVM — no C library access")

public actual fun estrlcat(dst: String?, src: String?, len: ULong): ULong =
    throw UnsupportedOperationException("estrlcat not available on JVM — no C library access")

public actual fun easprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("easprintf not available on JVM — no C library access")

public actual fun evasprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("evasprintf not available on JVM — no C library access")

public actual fun securePath(path: String?): Int =
    throw UnsupportedOperationException("securePath not available on JVM — no C library access")

public actual fun snprintb(buf: String?, buflen: ULong, fmt: String?, `val`: ULong): Int =
    throw UnsupportedOperationException("snprintb not available on JVM — no C library access")

public actual fun snprintbM(buf: String?, buflen: ULong, fmt: String?, `val`: ULong, max: ULong): Int =
    throw UnsupportedOperationException("snprintbM not available on JVM — no C library access")

public actual fun getbootfile(): String? =
    throw UnsupportedOperationException("getbootfile not available on JVM — no C library access")

public actual fun getbyteorder(): Int =
    throw UnsupportedOperationException("getbyteorder not available on JVM — no C library access")

public actual fun getdiskrawname(buf: String?, buflen: ULong, name: String?): String? =
    throw UnsupportedOperationException("getdiskrawname not available on JVM — no C library access")

public actual fun getdiskcookedname(buf: String?, buflen: ULong, name: String?): String? =
    throw UnsupportedOperationException("getdiskcookedname not available on JVM — no C library access")

public actual fun getfsspecname(buf: String?, buflen: ULong, spec: String?): String? =
    throw UnsupportedOperationException("getfsspecname not available on JVM — no C library access")

public actual fun strpct(buf: String?, bufsiz: ULong, numerator: ULong, denominator: ULong, precision: ULong): String? =
    throw UnsupportedOperationException("strpct not available on JVM — no C library access")

public actual fun strspct(buf: String?, bufsiz: ULong, numerator: Long, denominator: Long, precision: ULong): String? =
    throw UnsupportedOperationException("strspct not available on JVM — no C library access")

public actual fun login(ut: Utmp?): Unit = throw UnsupportedOperationException("login not available on JVM — no C library access")

public actual fun loginx(ut: Utmpx?): Unit = throw UnsupportedOperationException("loginx not available on JVM — no C library access")

public actual fun logout(line: String?): Unit = throw UnsupportedOperationException("logout not available on JVM — no C library access")

public actual fun logoutx(line: String?, status: Int, tpe: Int): Unit = throw UnsupportedOperationException("logoutx not available on JVM — no C library access")

public actual fun logwtmp(line: String?, name: String?, host: String?): Unit = throw UnsupportedOperationException("logwtmp not available on JVM — no C library access")

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: Int, tpe: Int): Unit = throw UnsupportedOperationException("logwtmpx not available on JVM — no C library access")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("getxattr not available on JVM — no C library access")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("lgetxattr not available on JVM — no C library access")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("fgetxattr not available on JVM — no C library access")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("setxattr not available on JVM — no C library access")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("lsetxattr not available on JVM — no C library access")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr not available on JVM — no C library access")

public actual fun listxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("listxattr not available on JVM — no C library access")

public actual fun llistxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("llistxattr not available on JVM — no C library access")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("flistxattr not available on JVM — no C library access")

public actual fun removexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("removexattr not available on JVM — no C library access")

public actual fun lremovexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("lremovexattr not available on JVM — no C library access")

public actual fun fremovexattr(fd: Int, path: String?, name: String?): Int =
    throw UnsupportedOperationException("fremovexattr not available on JVM — no C library access")

public actual fun stringToFlags(stringP: COpaquePointer?, setp: ULong?, clrp: ULong?): Int =
    throw UnsupportedOperationException("stringToFlags not available on JVM — no C library access")

public actual fun flagsToString(flags: ULong, def: String?): Int =
    throw UnsupportedOperationException("flagsToString not available on JVM — no C library access")

public actual fun kinfoGetvmmap(pid: Int, cntp: ULong?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap not available on JVM — no C library access")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace not available on JVM — no C library access")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on JVM — no C library access")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: Int): Int =
    throw UnsupportedOperationException("backtraceSymbolsFd not available on JVM — no C library access")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbolsFmt not available on JVM — no C library access")

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: ULong, fd: Int, fmt: String?): Int =
    throw UnsupportedOperationException("backtraceSymbolsFdFmt not available on JVM — no C library access")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr not available on JVM — no C library access")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortR not available on JVM — no C library access")
