package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.netbsd.Utmp
import io.github.kotlinmania.libc.new.netbsd.Utmpx
import io.github.kotlinmania.libc.new.netbsd.sys.Itimerspec
import io.github.kotlinmania.libc.new.netbsd.sys.Statvfs
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.Passwd
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.SchedParam
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.Termios

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd requires N-API addon")

public actual fun sockcredSize(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE requires N-API addon")

public actual fun protMprotect(x: Int): Int =
    throw UnsupportedOperationException("pROTMPROTECT requires N-API addon")

public actual fun protMprotectExtract(x: Int): Int =
    throw UnsupportedOperationException("pROTMPROTECTEXTRACT requires N-API addon")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires N-API addon")

public actual fun reallocarr(ptr: COpaquePointer?, number: ULong, size: ULong): Int =
    throw UnsupportedOperationException("reallocarr requires N-API addon")

public actual fun chflags(path: String?, flags: ULong): Int =
    throw UnsupportedOperationException("chflags requires N-API addon")

public actual fun fchflags(fd: Int, flags: ULong): Int =
    throw UnsupportedOperationException("fchflags requires N-API addon")

public actual fun lchflags(path: String?, flags: ULong): Int =
    throw UnsupportedOperationException("lchflags requires N-API addon")

public actual fun extattrListFd(fd: Int, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFd requires N-API addon")

public actual fun extattrListFile(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFile requires N-API addon")

public actual fun extattrListLink(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListLink requires N-API addon")

public actual fun extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFd requires N-API addon")

public actual fun extattrDeleteFile(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFile requires N-API addon")

public actual fun extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteLink requires N-API addon")

public actual fun extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFd requires N-API addon")

public actual fun extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFile requires N-API addon")

public actual fun extattrGetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetLink requires N-API addon")

public actual fun extattrNamespaceToString(attrnamespace: Int, string: COpaquePointer?): Int =
    throw UnsupportedOperationException("extattrNamespaceToString requires N-API addon")

public actual fun extattrSetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Int =
    throw UnsupportedOperationException("extattrSetFd requires N-API addon")

public actual fun extattrSetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Int =
    throw UnsupportedOperationException("extattrSetFile requires N-API addon")

public actual fun extattrSetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Int =
    throw UnsupportedOperationException("extattrSetLink requires N-API addon")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: Int?): Int =
    throw UnsupportedOperationException("extattrStringToNamespace requires N-API addon")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires N-API addon")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires N-API addon")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR requires N-API addon")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires N-API addon")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires N-API addon")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl requires N-API addon")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctlbyname requires N-API addon")

public actual fun sysctlnametomib(sname: String?, name: Int?, namelenp: ULong?): Int =
    throw UnsupportedOperationException("sysctlnametomib requires N-API addon")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: ULong, eventlist: Kevent?, nevents: ULong, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent requires N-API addon")

public actual fun mount(src: String?, target: String?, flags: Int, data: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen requires N-API addon")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose requires N-API addon")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr requires N-API addon")

public actual fun mqNotify(mqd: Int, notification: Sigevent?): Int =
    throw UnsupportedOperationException("mqNotify requires N-API addon")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive requires N-API addon")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend requires N-API addon")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr requires N-API addon")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive requires N-API addon")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend requires N-API addon")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink requires N-API addon")

public actual fun ptrace(request: Int, pid: Int, addr: COpaquePointer?, data: Int): Int =
    throw UnsupportedOperationException("ptrace requires N-API addon")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("utrace requires N-API addon")

public actual fun pthreadGetnameNp(t: ULong, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires N-API addon")

public actual fun pthreadSetnameNp(t: ULong, name: String?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp requires N-API addon")

public actual fun pthreadAttrGetNp(thread: ULong, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrGetNp requires N-API addon")

public actual fun pthreadGetattrNp(native: ULong, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp requires N-API addon")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires N-API addon")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires N-API addon")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires N-API addon")

public actual fun pthreadGetaffinityNp(thread: ULong, size: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires N-API addon")

public actual fun pthreadSetaffinityNp(thread: ULong, size: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires N-API addon")

public actual fun cpusetCreate(): ULong? =
    throw UnsupportedOperationException("cpusetCreate requires N-API addon")

public actual fun cpusetDestroy(set: ULong?): Unit = throw UnsupportedOperationException("cpusetDestroy requires N-API addon")

public actual fun cpusetClr(cpu: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("cpusetClr requires N-API addon")

public actual fun cpusetSet(cpu: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("cpusetSet requires N-API addon")

public actual fun cpusetIsset(cpu: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("cpusetIsset requires N-API addon")

public actual fun cpusetSize(set: ULong?): ULong =
    throw UnsupportedOperationException("cpusetSize requires N-API addon")

public actual fun cpusetZero(set: ULong?): Unit = throw UnsupportedOperationException("cpusetZero requires N-API addon")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires N-API addon")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo requires N-API addon")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires N-API addon")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires N-API addon")

public actual fun localeconvL(loc: io.github.kotlinmania.libc.COpaquePointer?): Lconv? =
    throw UnsupportedOperationException("localeconvL requires N-API addon")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires N-API addon")

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("settimeofday requires N-API addon")

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires N-API addon")

public actual fun kqueue1(flags: Int): Int =
    throw UnsupportedOperationException("kqueue1 requires N-API addon")

public actual fun lwpSelf(): Int =
    throw UnsupportedOperationException("lwpSelf requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun dlauxinfo(): COpaquePointer? =
    throw UnsupportedOperationException("dlauxinfo requires N-API addon")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires N-API addon")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose requires N-API addon")

public actual fun timerCreate(clockid: Int, sevp: Sigevent?, timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires N-API addon")

public actual fun explicitMemset(b: COpaquePointer?, c: Int, len: ULong): Unit = throw UnsupportedOperationException("explicitMemset requires N-API addon")

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("consttimeMemequal requires N-API addon")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle requires N-API addon")

public actual fun mremap(oldp: COpaquePointer?, oldsize: ULong, newp: COpaquePointer?, newsize: ULong, flags: Int): COpaquePointer? =
    throw UnsupportedOperationException("mremap requires N-API addon")

public actual fun schedRrGetInterval(pid: Int, t: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires N-API addon")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires N-API addon")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires N-API addon")

public actual fun schedGetscheduler(pid: Int): Int =
    throw UnsupportedOperationException("schedGetscheduler requires N-API addon")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires N-API addon")

public actual fun pollts(fds: Pollfd?, nfds: UInt, ts: Timespec?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("pollts requires N-API addon")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun reboot(mode: Int, bootstr: String?): Int =
    throw UnsupportedOperationException("reboot requires N-API addon")

public actual fun lwpPark(clock: Int, flags: Int, ts: Timespec?, unpark: Int, hint: COpaquePointer?, unparkhint: COpaquePointer?): Int =
    throw UnsupportedOperationException("lwpPark requires N-API addon")

public actual fun lwpUnpark(lwp: Int, hint: COpaquePointer?): Int =
    throw UnsupportedOperationException("lwpUnpark requires N-API addon")

public actual fun lwpUnparkAll(targets: Int?, ntargets: ULong, hint: COpaquePointer?): Int =
    throw UnsupportedOperationException("lwpUnparkAll requires N-API addon")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo requires N-API addon")

public actual fun getvfsstat(buf: Statvfs?, bufsize: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getvfsstat requires N-API addon")

public actual fun eventfd(`val`: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd requires N-API addon")

public actual fun eventfdRead(efd: Int, valp: ULong?): Int =
    throw UnsupportedOperationException("eventfdRead requires N-API addon")

public actual fun eventfdWrite(efd: Int, `val`: ULong): Int =
    throw UnsupportedOperationException("eventfdWrite requires N-API addon")

public actual fun timerfdCreate(clockid: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate requires N-API addon")

public actual fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime requires N-API addon")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwentR requires N-API addon")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrentR requires N-API addon")

public actual fun emalloc(n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("emalloc requires N-API addon")

public actual fun ecalloc(n: ULong, c: ULong): COpaquePointer? =
    throw UnsupportedOperationException("ecalloc requires N-API addon")

public actual fun erealloc(p: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("erealloc requires N-API addon")

public actual fun ereallocarr(p: COpaquePointer?, n: ULong, s: ULong): Unit = throw UnsupportedOperationException("ereallocarr requires N-API addon")

public actual fun estrdup(s: String?): String? =
    throw UnsupportedOperationException("estrdup requires N-API addon")

public actual fun estrndup(s: String?, len: ULong): String? =
    throw UnsupportedOperationException("estrndup requires N-API addon")

public actual fun estrlcpy(dst: String?, src: String?, len: ULong): ULong =
    throw UnsupportedOperationException("estrlcpy requires N-API addon")

public actual fun estrlcat(dst: String?, src: String?, len: ULong): ULong =
    throw UnsupportedOperationException("estrlcat requires N-API addon")

public actual fun easprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("easprintf requires N-API addon")

public actual fun evasprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("evasprintf requires N-API addon")

public actual fun securePath(path: String?): Int =
    throw UnsupportedOperationException("securePath requires N-API addon")

public actual fun snprintb(buf: String?, buflen: ULong, fmt: String?, `val`: ULong): Int =
    throw UnsupportedOperationException("snprintb requires N-API addon")

public actual fun snprintbM(buf: String?, buflen: ULong, fmt: String?, `val`: ULong, max: ULong): Int =
    throw UnsupportedOperationException("snprintbM requires N-API addon")

public actual fun getbootfile(): String? =
    throw UnsupportedOperationException("getbootfile requires N-API addon")

public actual fun getbyteorder(): Int =
    throw UnsupportedOperationException("getbyteorder requires N-API addon")

public actual fun getdiskrawname(buf: String?, buflen: ULong, name: String?): String? =
    throw UnsupportedOperationException("getdiskrawname requires N-API addon")

public actual fun getdiskcookedname(buf: String?, buflen: ULong, name: String?): String? =
    throw UnsupportedOperationException("getdiskcookedname requires N-API addon")

public actual fun getfsspecname(buf: String?, buflen: ULong, spec: String?): String? =
    throw UnsupportedOperationException("getfsspecname requires N-API addon")

public actual fun strpct(buf: String?, bufsiz: ULong, numerator: ULong, denominator: ULong, precision: ULong): String? =
    throw UnsupportedOperationException("strpct requires N-API addon")

public actual fun strspct(buf: String?, bufsiz: ULong, numerator: Long, denominator: Long, precision: ULong): String? =
    throw UnsupportedOperationException("strspct requires N-API addon")

public actual fun login(ut: Utmp?): Unit = throw UnsupportedOperationException("login requires N-API addon")

public actual fun loginx(ut: Utmpx?): Unit = throw UnsupportedOperationException("loginx requires N-API addon")

public actual fun logout(line: String?): Unit = throw UnsupportedOperationException("logout requires N-API addon")

public actual fun logoutx(line: String?, status: Int, tpe: Int): Unit = throw UnsupportedOperationException("logoutx requires N-API addon")

public actual fun logwtmp(line: String?, name: String?, host: String?): Unit = throw UnsupportedOperationException("logwtmp requires N-API addon")

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: Int, tpe: Int): Unit = throw UnsupportedOperationException("logwtmpx requires N-API addon")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("getxattr requires N-API addon")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("lgetxattr requires N-API addon")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("fgetxattr requires N-API addon")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("setxattr requires N-API addon")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("lsetxattr requires N-API addon")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr requires N-API addon")

public actual fun listxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("listxattr requires N-API addon")

public actual fun llistxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("llistxattr requires N-API addon")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("flistxattr requires N-API addon")

public actual fun removexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("removexattr requires N-API addon")

public actual fun lremovexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("lremovexattr requires N-API addon")

public actual fun fremovexattr(fd: Int, path: String?, name: String?): Int =
    throw UnsupportedOperationException("fremovexattr requires N-API addon")

public actual fun stringToFlags(stringP: COpaquePointer?, setp: ULong?, clrp: ULong?): Int =
    throw UnsupportedOperationException("stringToFlags requires N-API addon")

public actual fun flagsToString(flags: ULong, def: String?): Int =
    throw UnsupportedOperationException("flagsToString requires N-API addon")

public actual fun kinfoGetvmmap(pid: Int, cntp: ULong?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap requires N-API addon")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace requires N-API addon")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires N-API addon")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: Int): Int =
    throw UnsupportedOperationException("backtraceSymbolsFd requires N-API addon")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbolsFmt requires N-API addon")

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: ULong, fd: Int, fmt: String?): Int =
    throw UnsupportedOperationException("backtraceSymbolsFdFmt requires N-API addon")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires N-API addon")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortR requires N-API addon")
