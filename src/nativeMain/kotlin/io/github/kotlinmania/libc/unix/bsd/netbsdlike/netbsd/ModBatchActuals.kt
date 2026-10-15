// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_dirfd
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_lchflags
import libc.cinterop.libc_sched_getscheduler
import libc.cinterop.libc_settimeofday

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): Int =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun sockcredSize(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE requires manual FFI bridge — not yet implemented")

public actual fun protMprotect(x: Int): Int =
    throw UnsupportedOperationException("pROTMPROTECT requires manual FFI bridge — not yet implemented")

public actual fun protMprotectExtract(x: Int): Int =
    throw UnsupportedOperationException("pROTMPROTECTEXTRACT requires manual FFI bridge — not yet implemented")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires FFI bridge")

public actual fun reallocarr(ptr: COpaquePointer?, number: ULong, size: ULong): Int =
    throw UnsupportedOperationException("reallocarr requires manual FFI bridge — not yet implemented")

public actual fun chflags(path: String?, flags: ULong): Int =
    throw UnsupportedOperationException("chflags requires FFI bridge")

public actual fun fchflags(fd: Int, flags: ULong): Int =
    throw UnsupportedOperationException("fchflags requires FFI bridge")

public actual fun lchflags(path: String?, flags: ULong): Int =
    libc.cinterop.libc_lchflags(path, flags)

public actual fun extattrListFd(fd: Int, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFd requires manual FFI bridge — not yet implemented")

public actual fun extattrListFile(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFile requires manual FFI bridge — not yet implemented")

public actual fun extattrListLink(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListLink requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFd requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteFile(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFile requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteLink requires manual FFI bridge — not yet implemented")

public actual fun extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFd requires manual FFI bridge — not yet implemented")

public actual fun extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFile requires manual FFI bridge — not yet implemented")

public actual fun extattrGetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetLink requires manual FFI bridge — not yet implemented")

public actual fun extattrNamespaceToString(attrnamespace: Int, string: COpaquePointer?): Int =
    throw UnsupportedOperationException("extattrNamespaceToString requires manual FFI bridge — not yet implemented")

public actual fun extattrSetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Int =
    throw UnsupportedOperationException("extattrSetFd requires manual FFI bridge — not yet implemented")

public actual fun extattrSetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Int =
    throw UnsupportedOperationException("extattrSetFile requires manual FFI bridge — not yet implemented")

public actual fun extattrSetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Int =
    throw UnsupportedOperationException("extattrSetLink requires manual FFI bridge — not yet implemented")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: Int?): Int =
    throw UnsupportedOperationException("extattrStringToNamespace requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR requires manual FFI bridge — not yet implemented")

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo requires manual FFI bridge — not yet implemented")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires FFI bridge")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl requires manual FFI bridge — not yet implemented")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctlbyname requires manual FFI bridge — not yet implemented")

public actual fun sysctlnametomib(sname: String?, name: Int?, namelenp: ULong?): Int =
    throw UnsupportedOperationException("sysctlnametomib requires manual FFI bridge — not yet implemented")

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: ULong, eventlist: Kevent?, nevents: ULong, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent requires manual FFI bridge — not yet implemented")

public actual fun mount(src: String?, target: String?, flags: Int, data: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen requires manual FFI bridge — not yet implemented")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose requires manual FFI bridge — not yet implemented")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr requires manual FFI bridge — not yet implemented")

public actual fun mqNotify(mqd: Int, notification: Sigevent?): Int =
    throw UnsupportedOperationException("mqNotify requires manual FFI bridge — not yet implemented")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive requires manual FFI bridge — not yet implemented")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend requires manual FFI bridge — not yet implemented")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr requires manual FFI bridge — not yet implemented")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive requires manual FFI bridge — not yet implemented")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend requires manual FFI bridge — not yet implemented")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: Int, pid: Int, addr: COpaquePointer?, data: Int): Int =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun utrace(label: String?, addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("utrace requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(t: ULong, name: String?, len: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(t: ULong, name: String?, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetNp(thread: ULong, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadAttrGetNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetattrNp(native: ULong, attr: PthreadAttrT?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetaffinityNp(thread: ULong, size: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetaffinityNp(thread: ULong, size: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun cpusetCreate(): ULong? =
    throw UnsupportedOperationException("cpusetCreate requires manual FFI bridge — not yet implemented")

public actual fun cpusetDestroy(set: ULong?): Unit = throw UnsupportedOperationException("cpusetDestroy requires manual FFI bridge — not yet implemented")

public actual fun cpusetClr(cpu: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("cpusetClr requires manual FFI bridge — not yet implemented")

public actual fun cpusetSet(cpu: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("cpusetSet requires manual FFI bridge — not yet implemented")

public actual fun cpusetIsset(cpu: ULong, set: ULong?): Int =
    throw UnsupportedOperationException("cpusetIsset requires manual FFI bridge — not yet implemented")

public actual fun cpusetSize(set: ULong?): ULong =
    throw UnsupportedOperationException("cpusetSize requires manual FFI bridge — not yet implemented")

public actual fun cpusetZero(set: ULong?): Unit = throw UnsupportedOperationException("cpusetZero requires manual FFI bridge — not yet implemented")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires manual FFI bridge — not yet implemented")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo requires manual FFI bridge — not yet implemented")

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun freelocale(loc: io.github.kotlinmania.libc.COpaquePointer?): Unit = throw UnsupportedOperationException("freelocale requires manual FFI bridge — not yet implemented")

public actual fun localeconvL(loc: io.github.kotlinmania.libc.COpaquePointer?): Lconv? =
    throw UnsupportedOperationException("localeconvL requires manual FFI bridge — not yet implemented")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): Int {
    if (tv == null) return -1
    val tvPtr: CPointer<ByteVar>? = tv.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.value.toCPointer()
    val result = libc_settimeofday(tvPtr, tzPtr)
    return result
}

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun kqueue1(flags: Int): Int =
    throw UnsupportedOperationException("kqueue1 requires manual FFI bridge — not yet implemented")

public actual fun lwpSelf(): Int =
    throw UnsupportedOperationException("lwpSelf requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires FFI bridge")

public actual fun dlauxinfo(): COpaquePointer? =
    throw UnsupportedOperationException("dlauxinfo requires manual FFI bridge — not yet implemented")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires manual FFI bridge — not yet implemented")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose requires manual FFI bridge — not yet implemented")

public actual fun timerCreate(clockid: Int, sevp: Sigevent?, timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerCreate requires manual FFI bridge — not yet implemented")

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerDelete requires manual FFI bridge — not yet implemented")

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("timerGetoverrun requires manual FFI bridge — not yet implemented")

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime requires manual FFI bridge — not yet implemented")

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.COpaquePointer?, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime requires manual FFI bridge — not yet implemented")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires manual FFI bridge — not yet implemented")

public actual fun explicitMemset(b: COpaquePointer?, c: Int, len: ULong): Unit = throw UnsupportedOperationException("explicitMemset requires manual FFI bridge — not yet implemented")

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("consttimeMemequal requires manual FFI bridge — not yet implemented")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle requires manual FFI bridge — not yet implemented")

public actual fun mremap(oldp: COpaquePointer?, oldsize: ULong, newp: COpaquePointer?, newsize: ULong, flags: Int): COpaquePointer? =
    throw UnsupportedOperationException("mremap requires manual FFI bridge — not yet implemented")

public actual fun schedRrGetInterval(pid: Int, t: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: Int): Int {
    val result = libc_sched_getscheduler(pid)
    return result
}

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun pollts(fds: Pollfd?, nfds: UInt, ts: Timespec?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("pollts requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires manual FFI bridge — not yet implemented")

public actual fun reboot(mode: Int, bootstr: String?): Int =
    throw UnsupportedOperationException("reboot requires FFI bridge")

public actual fun lwpPark(clock: Int, flags: Int, ts: Timespec?, unpark: Int, hint: COpaquePointer?, unparkhint: COpaquePointer?): Int =
    throw UnsupportedOperationException("lwpPark requires manual FFI bridge — not yet implemented")

public actual fun lwpUnpark(lwp: Int, hint: COpaquePointer?): Int =
    throw UnsupportedOperationException("lwpUnpark requires manual FFI bridge — not yet implemented")

public actual fun lwpUnparkAll(targets: Int?, ntargets: ULong, hint: COpaquePointer?): Int =
    throw UnsupportedOperationException("lwpUnparkAll requires manual FFI bridge — not yet implemented")

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("getmntinfo requires manual FFI bridge — not yet implemented")

public actual fun getvfsstat(buf: Statvfs?, bufsize: ULong, flags: Int): Int =
    throw UnsupportedOperationException("getvfsstat requires manual FFI bridge — not yet implemented")

public actual fun eventfd(`val`: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd requires manual FFI bridge — not yet implemented")

public actual fun eventfdRead(efd: Int, valp: ULong?): Int =
    throw UnsupportedOperationException("eventfdRead requires manual FFI bridge — not yet implemented")

public actual fun eventfdWrite(efd: Int, `val`: ULong): Int =
    throw UnsupportedOperationException("eventfdWrite requires manual FFI bridge — not yet implemented")

public actual fun timerfdCreate(clockid: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate requires manual FFI bridge — not yet implemented")

public actual fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime requires manual FFI bridge — not yet implemented")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime requires manual FFI bridge — not yet implemented")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwentR requires manual FFI bridge — not yet implemented")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrentR requires manual FFI bridge — not yet implemented")

public actual fun emalloc(n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("emalloc requires manual FFI bridge — not yet implemented")

public actual fun ecalloc(n: ULong, c: ULong): COpaquePointer? =
    throw UnsupportedOperationException("ecalloc requires manual FFI bridge — not yet implemented")

public actual fun erealloc(p: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("erealloc requires manual FFI bridge — not yet implemented")

public actual fun ereallocarr(p: COpaquePointer?, n: ULong, s: ULong): Unit = throw UnsupportedOperationException("ereallocarr requires manual FFI bridge — not yet implemented")

public actual fun estrdup(s: String?): String? =
    throw UnsupportedOperationException("estrdup requires manual FFI bridge — not yet implemented")

public actual fun estrndup(s: String?, len: ULong): String? =
    throw UnsupportedOperationException("estrndup requires manual FFI bridge — not yet implemented")

public actual fun estrlcpy(dst: String?, src: String?, len: ULong): ULong =
    throw UnsupportedOperationException("estrlcpy requires manual FFI bridge — not yet implemented")

public actual fun estrlcat(dst: String?, src: String?, len: ULong): ULong =
    throw UnsupportedOperationException("estrlcat requires manual FFI bridge — not yet implemented")

public actual fun easprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("easprintf requires manual FFI bridge — not yet implemented")

public actual fun evasprintf(string: COpaquePointer?, fmt: String?, vararg args: Any?): Int =
    throw UnsupportedOperationException("evasprintf requires manual FFI bridge — not yet implemented")

public actual fun securePath(path: String?): Int =
    throw UnsupportedOperationException("securePath requires manual FFI bridge — not yet implemented")

public actual fun snprintb(buf: String?, buflen: ULong, fmt: String?, `val`: ULong): Int =
    throw UnsupportedOperationException("snprintb requires manual FFI bridge — not yet implemented")

public actual fun snprintbM(buf: String?, buflen: ULong, fmt: String?, `val`: ULong, max: ULong): Int =
    throw UnsupportedOperationException("snprintbM requires manual FFI bridge — not yet implemented")

public actual fun getbootfile(): String? =
    throw UnsupportedOperationException("getbootfile requires manual FFI bridge — not yet implemented")

public actual fun getbyteorder(): Int =
    throw UnsupportedOperationException("getbyteorder requires manual FFI bridge — not yet implemented")

public actual fun getdiskrawname(buf: String?, buflen: ULong, name: String?): String? =
    throw UnsupportedOperationException("getdiskrawname requires manual FFI bridge — not yet implemented")

public actual fun getdiskcookedname(buf: String?, buflen: ULong, name: String?): String? =
    throw UnsupportedOperationException("getdiskcookedname requires manual FFI bridge — not yet implemented")

public actual fun getfsspecname(buf: String?, buflen: ULong, spec: String?): String? =
    throw UnsupportedOperationException("getfsspecname requires manual FFI bridge — not yet implemented")

public actual fun strpct(buf: String?, bufsiz: ULong, numerator: ULong, denominator: ULong, precision: ULong): String? =
    throw UnsupportedOperationException("strpct requires manual FFI bridge — not yet implemented")

public actual fun strspct(buf: String?, bufsiz: ULong, numerator: Long, denominator: Long, precision: ULong): String? =
    throw UnsupportedOperationException("strspct requires manual FFI bridge — not yet implemented")

public actual fun login(ut: Utmp?): Unit = throw UnsupportedOperationException("login requires manual FFI bridge — not yet implemented")

public actual fun loginx(ut: Utmpx?): Unit = throw UnsupportedOperationException("loginx requires manual FFI bridge — not yet implemented")

public actual fun logout(line: String?): Unit = throw UnsupportedOperationException("logout requires manual FFI bridge — not yet implemented")

public actual fun logoutx(line: String?, status: Int, tpe: Int): Unit = throw UnsupportedOperationException("logoutx requires manual FFI bridge — not yet implemented")

public actual fun logwtmp(line: String?, name: String?, host: String?): Unit = throw UnsupportedOperationException("logwtmp requires manual FFI bridge — not yet implemented")

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: Int, tpe: Int): Unit = throw UnsupportedOperationException("logwtmpx requires manual FFI bridge — not yet implemented")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("getxattr requires manual FFI bridge — not yet implemented")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("lgetxattr requires manual FFI bridge — not yet implemented")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("fgetxattr requires manual FFI bridge — not yet implemented")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("setxattr requires manual FFI bridge — not yet implemented")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Int =
    throw UnsupportedOperationException("lsetxattr requires manual FFI bridge — not yet implemented")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr requires manual FFI bridge — not yet implemented")

public actual fun listxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("listxattr requires manual FFI bridge — not yet implemented")

public actual fun llistxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("llistxattr requires manual FFI bridge — not yet implemented")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("flistxattr requires manual FFI bridge — not yet implemented")

public actual fun removexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("removexattr requires manual FFI bridge — not yet implemented")

public actual fun lremovexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("lremovexattr requires manual FFI bridge — not yet implemented")

public actual fun fremovexattr(fd: Int, path: String?, name: String?): Int =
    throw UnsupportedOperationException("fremovexattr requires manual FFI bridge — not yet implemented")

public actual fun stringToFlags(stringP: COpaquePointer?, setp: ULong?, clrp: ULong?): Int =
    throw UnsupportedOperationException("stringToFlags requires manual FFI bridge — not yet implemented")

public actual fun flagsToString(flags: ULong, def: String?): Int =
    throw UnsupportedOperationException("flagsToString requires manual FFI bridge — not yet implemented")

public actual fun kinfoGetvmmap(pid: Int, cntp: ULong?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap requires manual FFI bridge — not yet implemented")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: Int): Int =
    throw UnsupportedOperationException("backtraceSymbolsFd requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: ULong, fmt: String?): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbolsFmt requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: ULong, fd: Int, fmt: String?): Int =
    throw UnsupportedOperationException("backtraceSymbolsFdFmt requires manual FFI bridge — not yet implemented")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires manual FFI bridge — not yet implemented")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortR requires manual FFI bridge — not yet implemented")
