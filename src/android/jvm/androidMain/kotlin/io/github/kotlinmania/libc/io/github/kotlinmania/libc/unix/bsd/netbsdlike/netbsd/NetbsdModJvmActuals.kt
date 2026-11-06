package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.COpaquePointer

internal object NetbsdModRawLibc {
    external fun clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun reallocarr(ptr: Long, number: Long, size: Long): Int
    external fun chflags(path: String?, flags: Long): Int
    external fun fchflags(fd: Int, flags: Long): Int
    external fun lchflags(path: String?, flags: Long): Int
    external fun extattrListFd(fd: Int, attrnamespace: Int, data: Long, nbytes: Long): Long
    external fun extattrListFile(path: String?, attrnamespace: Int, data: Long, nbytes: Long): Long
    external fun extattrListLink(path: String?, attrnamespace: Int, data: Long, nbytes: Long): Long
    external fun extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int
    external fun extattrDeleteFile(path: String?, attrnamespace: Int, attrname: String?): Int
    external fun extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int
    external fun extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long
    external fun extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long
    external fun extattrGetLink(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long
    external fun extattrNamespaceToString(attrnamespace: Int, string: Long): Int
    external fun extattrSetFd(fd: Int, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Int
    external fun extattrSetFile(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Int
    external fun extattrSetLink(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Int
    external fun extattrStringToNamespace(string: String?, attrnamespace: Long): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int
    external fun ptsnameR(fd: Int, buf: Long, buflen: Long): Int
    external fun lutimes(file: String?, times: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun sysctlbyname(name: String?, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun sysctlnametomib(sname: String?, name: Long, namelenp: Long): Int
    external fun kevent(kq: Int, changelist: Long, nchanges: Long, eventlist: Long, nevents: Long, timeout: Long): Int
    external fun mount(src: String?, target: String?, flags: Int, data: Long, size: Long): Int
    external fun mqClose(mqd: Long): Int
    external fun mqGetattr(mqd: Long, attr: Long): Int
    external fun mqNotify(mqd: Long, notification: Long): Int
    external fun mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long
    external fun mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int
    external fun mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int
    external fun mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long
    external fun mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int
    external fun mqUnlink(name: String?): Int
    external fun ptrace(request: Int, pid: Int, addr: Long, data: Int): Int
    external fun utrace(label: String?, addr: Long, len: Long): Int
    external fun pthreadGetnameNp(t: Long, name: Long, len: Long): Int
    external fun pthreadSetnameNp(t: Long, name: String?, arg: Long): Int
    external fun pthreadAttrGetNp(thread: Long, attr: Long): Int
    external fun pthreadGetattrNp(native: Long, attr: Long): Int
    external fun pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadGetaffinityNp(thread: Long, size: Long, set: Long): Int
    external fun pthreadSetaffinityNp(thread: Long, size: Long, set: Long): Int
    external fun cpusetCreate(): Long?
    external fun cpusetDestroy(set: Long)
    external fun cpusetClr(cpu: Long, set: Long): Int
    external fun cpusetSet(cpu: Long, set: Long): Int
    external fun cpusetIsset(cpu: Long, set: Long): Int
    external fun cpusetSize(set: Long): Long
    external fun cpusetZero(set: Long)
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
    external fun sigwaitinfo(set: Long, info: Long): Int
    external fun duplocale(base: Long): Long
    external fun freelocale(loc: Long)
    external fun localeconvL(loc: Long): Long?
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun settimeofday(tv: Long, tz: Long): Int
    external fun dup3(src: Int, dst: Int, flags: Int): Int
    external fun kqueue1(flags: Int): Int
    external fun lwpSelf(): Long
    external fun memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long?
    external fun dlIteratePhdr(callback: Long, data: Long): Int
    external fun dlauxinfo(): Long?
    external fun iconvOpen(tocode: String?, fromcode: String?): Long
    external fun iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long
    external fun iconvClose(cd: Long): Int
    external fun timerCreate(clockid: Int, sevp: Long, timerid: Long): Int
    external fun timerDelete(timerid: Long): Int
    external fun timerGetoverrun(timerid: Long): Int
    external fun timerGettime(timerid: Long, currValue: Long): Int
    external fun timerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int
    external fun dlvsym(handle: Long, symbol: String?, version: String?): Long?
    external fun explicitMemset(b: Long, c: Int, len: Long)
    external fun consttimeMemequal(a: Long, b: Long, len: Long): Int
    external fun mremap(oldp: Long, oldsize: Long, newp: Long, newsize: Long, flags: Int): Long?
    external fun schedRrGetInterval(pid: Int, t: Long): Int
    external fun schedSetparam(pid: Int, param: Long): Int
    external fun schedGetparam(pid: Int, param: Long): Int
    external fun schedGetscheduler(pid: Int): Int
    external fun schedSetscheduler(pid: Int, policy: Int, param: Long): Int
    external fun pollts(fds: Long, nfds: Long, ts: Long, sigmask: Long): Int
    external fun getrandom(buf: Long, buflen: Long, flags: Int): Long
    external fun reboot(mode: Int, bootstr: Long): Int
    external fun lwpPark(clock: Int, flags: Int, ts: Long, unpark: Long, hint: Long, unparkhint: Long): Int
    external fun lwpUnpark(lwp: Long, hint: Long): Int
    external fun lwpUnparkAll(targets: Long, ntargets: Long, hint: Long): Int
    external fun getmntinfo(mntbufp: Long, flags: Int): Int
    external fun getvfsstat(buf: Long, bufsize: Long, flags: Int): Int
    external fun eventfd(value: Int, flags: Int): Int
    external fun eventfdRead(efd: Int, valp: Long): Int
    external fun eventfdWrite(efd: Int, value: Long): Int
    external fun timerfdCreate(clockid: Int, flags: Int): Int
    external fun timerfdGettime(fd: Int, currValue: Long): Int
    external fun timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int
    external fun qsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)
    external fun aioRead(aiocbp: Long): Int
    external fun aioWrite(aiocbp: Long): Int
    external fun aioFsync(op: Int, aiocbp: Long): Int
    external fun aioError(aiocbp: Long): Int
    external fun aioReturn(aiocbp: Long): Long
    external fun aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int
    external fun aioCancel(fd: Int, aiocbp: Long): Int
    external fun lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int
    external fun getpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun efopen(p: String?, m: String?): Long
    external fun emalloc(n: Long): Long?
    external fun ecalloc(n: Long, c: Long): Long?
    external fun erealloc(p: Long, n: Long): Long?
    external fun ereallocarr(p: Long, n: Long, s: Long)
    external fun estrdup(s: String?): Long?
    external fun estrndup(s: String?, len: Long): Long?
    external fun estrlcpy(dst: Long, src: String?, len: Long): Long
    external fun estrlcat(dst: Long, src: String?, len: Long): Long
    external fun estrtoi(nptr: String?, base: Int, lo: Long, hi: Long): Long
    external fun estrtou(nptr: String?, base: Int, lo: Long, hi: Long): Long
    external fun esetfunc(cb: Long): Long?
    external fun securePath(path: String?): Int
    external fun snprintb(buf: Long, buflen: Long, fmt: String?, value: Long): Int
    external fun snprintbM(buf: Long, buflen: Long, fmt: String?, value: Long, max: Long): Int
    external fun getbootfile(): Long?
    external fun getbyteorder(): Int
    external fun getdiskrawname(buf: Long, buflen: Long, name: String?): Long?
    external fun getdiskcookedname(buf: Long, buflen: Long, name: String?): Long?
    external fun getfsspecname(buf: Long, buflen: Long, spec: String?): Long?
    external fun strpct(buf: Long, bufsiz: Long, numerator: Long, denominator: Long, precision: Long): Long?
    external fun strspct(buf: Long, bufsiz: Long, numerator: Long, denominator: Long, precision: Long): Long?
    external fun login(ut: Long)
    external fun loginx(ut: Long)
    external fun logout(line: String?)
    external fun logoutx(line: String?, status: Int, tpe: Int)
    external fun logwtmp(line: String?, name: String?, host: String?)
    external fun logwtmpx(line: String?, name: String?, host: String?, status: Int, tpe: Int)
    external fun getxattr(path: String?, name: String?, value: Long, size: Long): Long
    external fun lgetxattr(path: String?, name: String?, value: Long, size: Long): Long
    external fun fgetxattr(filedes: Int, name: String?, value: Long, size: Long): Long
    external fun setxattr(path: String?, name: String?, value: Long, size: Long): Int
    external fun lsetxattr(path: String?, name: String?, value: Long, size: Long): Int
    external fun fsetxattr(filedes: Int, name: String?, value: Long, size: Long, flags: Int): Int
    external fun listxattr(path: String?, list: Long, size: Long): Long
    external fun llistxattr(path: String?, list: Long, size: Long): Long
    external fun flistxattr(filedes: Int, list: Long, size: Long): Long
    external fun removexattr(path: String?, name: String?): Int
    external fun lremovexattr(path: String?, name: String?): Int
    external fun fremovexattr(fd: Int, path: String?, name: String?): Int
    external fun stringToFlags(stringP: Long, setp: Long, clrp: Long): Int
    external fun flagsToString(flags: Long, def: String?): Int
    external fun kinfoGetvmmap(pid: Int, cntp: Long): Long?
    external fun backtrace(addrlist: Long, len: Long): Long
    external fun backtraceSymbols(addrlist: Long, len: Long): Long?
    external fun backtraceSymbolsFd(addrlist: Long, len: Long, fd: Int): Int
    external fun backtraceSymbolsFmt(addrlist: Long, len: Long, fmt: String?): Long?
    external fun backtraceSymbolsFdFmt(addrlist: Long, len: Long, fd: Int, fmt: String?): Int
}

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    NetbsdModRawLibc.clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun reallocarr(ptr: COpaquePointer?, number: SizeT, size: SizeT): CInt =
    NetbsdModRawLibc.reallocarr(ptr?.value ?: 0L, number, size)

public actual fun chflags(path: String?, flags: CUlong): CInt =
    NetbsdModRawLibc.chflags(path, flags)

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    NetbsdModRawLibc.fchflags(fd, flags)

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    NetbsdModRawLibc.lchflags(path, flags)

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    NetbsdModRawLibc.extattrListFd(fd, attrnamespace, data?.value ?: 0L, nbytes)

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    NetbsdModRawLibc.extattrListFile(path, attrnamespace, data?.value ?: 0L, nbytes)

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    NetbsdModRawLibc.extattrListLink(path, attrnamespace, data?.value ?: 0L, nbytes)

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    NetbsdModRawLibc.extattrDeleteFd(fd, attrnamespace, attrname)

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    NetbsdModRawLibc.extattrDeleteFile(path, attrnamespace, attrname)

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    NetbsdModRawLibc.extattrDeleteLink(path, attrnamespace, attrname)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    NetbsdModRawLibc.extattrGetFd(fd, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    NetbsdModRawLibc.extattrGetFile(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    NetbsdModRawLibc.extattrGetLink(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    NetbsdModRawLibc.extattrNamespaceToString(attrnamespace, string?.value ?: 0L)

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    NetbsdModRawLibc.extattrSetFd(fd, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    NetbsdModRawLibc.extattrSetFile(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    NetbsdModRawLibc.extattrSetLink(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    NetbsdModRawLibc.extattrStringToNamespace(string, attrnamespace?.toLong() ?: 0L)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    NetbsdModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    NetbsdModRawLibc.forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    NetbsdModRawLibc.ptsnameR(fd, buf?.value ?: 0L, buflen)

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    NetbsdModRawLibc.lutimes(file, times?.toLong() ?: 0L)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    NetbsdModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    NetbsdModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    NetbsdModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    NetbsdModRawLibc.sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    NetbsdModRawLibc.sysctlbyname(name, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun sysctlnametomib(sname: String?, name: CInt?, namelenp: SizeT?): CInt =
    NetbsdModRawLibc.sysctlnametomib(sname, name?.toLong() ?: 0L, namelenp?.toLong() ?: 0L)

public actual fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: SizeT, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: SizeT, timeout: Timespec?): CInt =
    NetbsdModRawLibc.kevent(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, timeout?.toLong() ?: 0L)

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: SizeT): CInt =
    NetbsdModRawLibc.mount(src, target, flags, data?.value ?: 0L, size)

public actual fun mqClose(mqd: MqdT): CInt =
    NetbsdModRawLibc.mqClose(mqd)

public actual fun mqGetattr(mqd: MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    NetbsdModRawLibc.mqGetattr(mqd, attr?.toLong() ?: 0L)

public actual fun mqNotify(mqd: MqdT, notification: io.github.kotlinmania.libc.Sigevent?): CInt =
    NetbsdModRawLibc.mqNotify(mqd, notification?.toLong() ?: 0L)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    NetbsdModRawLibc.mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    NetbsdModRawLibc.mqSend(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqd: MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    NetbsdModRawLibc.mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    NetbsdModRawLibc.mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    NetbsdModRawLibc.mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)

public actual fun mqUnlink(name: String?): CInt =
    NetbsdModRawLibc.mqUnlink(name)

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    NetbsdModRawLibc.ptrace(request, pid, addr?.value ?: 0L, data)

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    NetbsdModRawLibc.utrace(label, addr?.value ?: 0L, len)

public actual fun pthreadGetnameNp(t: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    NetbsdModRawLibc.pthreadGetnameNp(t, name?.value ?: 0L, len)

public actual fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt =
    NetbsdModRawLibc.pthreadSetnameNp(t, name, arg?.value ?: 0L)

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    NetbsdModRawLibc.pthreadAttrGetNp(thread, attr?.toLong() ?: 0L)

public actual fun pthreadGetattrNp(native: PthreadT, attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    NetbsdModRawLibc.pthreadGetattrNp(native, attr?.toLong() ?: 0L)

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT?): CInt =
    NetbsdModRawLibc.pthreadAttrGetguardsize(attr?.toLong() ?: 0L, guardsize?.toLong() ?: 0L)

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT): CInt =
    NetbsdModRawLibc.pthreadAttrSetguardsize(attr?.toLong() ?: 0L, guardsize)

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    NetbsdModRawLibc.pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: Cpuset?): CInt =
    NetbsdModRawLibc.pthreadGetaffinityNp(thread, size, set?.toLong() ?: 0L)

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: Cpuset?): CInt =
    NetbsdModRawLibc.pthreadSetaffinityNp(thread, size, set?.toLong() ?: 0L)

public actual fun cpusetCreate(): Cpuset? =
    NetbsdModRawLibc.cpusetCreate()

public actual fun cpusetDestroy(set: Cpuset?) {
    NetbsdModRawLibc.cpusetDestroy(set?.toLong() ?: 0L)
}

public actual fun cpusetClr(cpu: CpuidT, set: Cpuset?): CInt =
    NetbsdModRawLibc.cpusetClr(cpu, set?.toLong() ?: 0L)

public actual fun cpusetSet(cpu: CpuidT, set: Cpuset?): CInt =
    NetbsdModRawLibc.cpusetSet(cpu, set?.toLong() ?: 0L)

public actual fun cpusetIsset(cpu: CpuidT, set: Cpuset?): CInt =
    NetbsdModRawLibc.cpusetIsset(cpu, set?.toLong() ?: 0L)

public actual fun cpusetSize(set: Cpuset?): SizeT =
    NetbsdModRawLibc.cpusetSize(set?.toLong() ?: 0L)

public actual fun cpusetZero(set: Cpuset?) {
    NetbsdModRawLibc.cpusetZero(set?.toLong() ?: 0L)
}

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    NetbsdModRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    NetbsdModRawLibc.sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun duplocale(base: LocaleT): LocaleT =
    NetbsdModRawLibc.duplocale(base)

public actual fun freelocale(loc: LocaleT) {
    NetbsdModRawLibc.freelocale(loc)
}

public actual fun localeconvL(loc: LocaleT): Lconv? =
    NetbsdModRawLibc.localeconvL(loc)

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    NetbsdModRawLibc.newlocale(mask, locale, base)

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    NetbsdModRawLibc.settimeofday(tv?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    NetbsdModRawLibc.dup3(src, dst, flags)

public actual fun kqueue1(flags: CInt): CInt =
    NetbsdModRawLibc.kqueue1(flags)

public actual fun lwpSelf(): LwpidT =
    NetbsdModRawLibc.lwpSelf()

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    NetbsdModRawLibc.memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    NetbsdModRawLibc.dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun dlauxinfo(): COpaquePointer? =
    NetbsdModRawLibc.dlauxinfo().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    NetbsdModRawLibc.iconvOpen(tocode, fromcode)

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    NetbsdModRawLibc.iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)

public actual fun iconvClose(cd: IconvT): CInt =
    NetbsdModRawLibc.iconvClose(cd)

public actual fun timerCreate(clockid: ClockidT, sevp: io.github.kotlinmania.libc.Sigevent?, timerid: TimerT?): CInt =
    NetbsdModRawLibc.timerCreate(clockid, sevp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)

public actual fun timerDelete(timerid: TimerT): CInt =
    NetbsdModRawLibc.timerDelete(timerid)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    NetbsdModRawLibc.timerGetoverrun(timerid)

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    NetbsdModRawLibc.timerGettime(timerid, currValue?.toLong() ?: 0L)

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    NetbsdModRawLibc.timerSettime(timerid, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    NetbsdModRawLibc.dlvsym(handle?.value ?: 0L, symbol, version).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun explicitMemset(b: COpaquePointer?, c: CInt, len: SizeT) {
    NetbsdModRawLibc.explicitMemset(b?.value ?: 0L, c, len)
}

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    NetbsdModRawLibc.consttimeMemequal(a?.value ?: 0L, b?.value ?: 0L, len)

public actual fun mremap(oldp: COpaquePointer?, oldsize: SizeT, newp: COpaquePointer?, newsize: SizeT, flags: CInt): COpaquePointer? =
    NetbsdModRawLibc.mremap(oldp?.value ?: 0L, oldsize, newp?.value ?: 0L, newsize, flags).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    NetbsdModRawLibc.schedRrGetInterval(pid, t?.toLong() ?: 0L)

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    NetbsdModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    NetbsdModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    NetbsdModRawLibc.schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    NetbsdModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun pollts(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: io.github.kotlinmania.libc.SigsetT?): CInt =
    NetbsdModRawLibc.pollts(fds?.toLong() ?: 0L, nfds, ts?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    NetbsdModRawLibc.getrandom(buf?.value ?: 0L, buflen, flags)

public actual fun reboot(mode: CInt, bootstr: COpaquePointer?): CInt =
    NetbsdModRawLibc.reboot(mode, bootstr?.value ?: 0L)

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: Timespec?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt =
    NetbsdModRawLibc.lwpPark(clock, flags, ts?.toLong() ?: 0L, unpark, hint?.value ?: 0L, unparkhint?.value ?: 0L)

public actual fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt =
    NetbsdModRawLibc.lwpUnpark(lwp, hint?.value ?: 0L)

public actual fun lwpUnparkAll(targets: LwpidT?, ntargets: SizeT, hint: COpaquePointer?): CInt =
    NetbsdModRawLibc.lwpUnparkAll(targets?.toLong() ?: 0L, ntargets, hint?.value ?: 0L)

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    NetbsdModRawLibc.getmntinfo(mntbufp?.value ?: 0L, flags)

public actual fun getvfsstat(buf: Statvfs?, bufsize: SizeT, flags: CInt): CInt =
    NetbsdModRawLibc.getvfsstat(buf?.toLong() ?: 0L, bufsize, flags)

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    NetbsdModRawLibc.eventfd(value, flags)

public actual fun eventfdRead(efd: CInt, valp: ULong?): CInt =
    NetbsdModRawLibc.eventfdRead(efd, valp?.toLong() ?: 0L)

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    NetbsdModRawLibc.eventfdWrite(efd, value)

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    NetbsdModRawLibc.timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    NetbsdModRawLibc.timerfdGettime(fd, currValue?.toLong() ?: 0L)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    NetbsdModRawLibc.timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    NetbsdModRawLibc.qsortR(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L, arg?.value ?: 0L)
}

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    NetbsdModRawLibc.aioRead(aiocbp?.toLong() ?: 0L)

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    NetbsdModRawLibc.aioWrite(aiocbp?.toLong() ?: 0L)

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    NetbsdModRawLibc.aioFsync(op, aiocbp?.toLong() ?: 0L)

public actual fun aioError(aiocbp: Aiocb?): CInt =
    NetbsdModRawLibc.aioError(aiocbp?.toLong() ?: 0L)

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    NetbsdModRawLibc.aioReturn(aiocbp?.toLong() ?: 0L)

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    NetbsdModRawLibc.aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    NetbsdModRawLibc.aioCancel(fd, aiocbp?.toLong() ?: 0L)

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    NetbsdModRawLibc.lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)

public actual fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    NetbsdModRawLibc.getpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    NetbsdModRawLibc.getgrentR(grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun efopen(p: String?, m: String?): FILE =
    NetbsdModRawLibc.efopen(p, m)

public actual fun emalloc(n: SizeT): COpaquePointer? =
    NetbsdModRawLibc.emalloc(n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ecalloc(n: SizeT, c: SizeT): COpaquePointer? =
    NetbsdModRawLibc.ecalloc(n, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun erealloc(p: COpaquePointer?, n: SizeT): COpaquePointer? =
    NetbsdModRawLibc.erealloc(p?.value ?: 0L, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ereallocarr(p: COpaquePointer?, n: SizeT, s: SizeT) {
    NetbsdModRawLibc.ereallocarr(p?.value ?: 0L, n, s)
}

public actual fun estrdup(s: String?): COpaquePointer? =
    NetbsdModRawLibc.estrdup(s).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun estrndup(s: String?, len: SizeT): COpaquePointer? =
    NetbsdModRawLibc.estrndup(s, len).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun estrlcpy(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    NetbsdModRawLibc.estrlcpy(dst?.value ?: 0L, src, len)

public actual fun estrlcat(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    NetbsdModRawLibc.estrlcat(dst?.value ?: 0L, src, len)

public actual fun estrtoi(nptr: String?, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    NetbsdModRawLibc.estrtoi(nptr, base, lo, hi)

public actual fun estrtou(nptr: String?, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    NetbsdModRawLibc.estrtou(nptr, base, lo, hi)

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    NetbsdModRawLibc.esetfunc(cb?.toLong() ?: 0L)

public actual fun securePath(path: String?): CInt =
    NetbsdModRawLibc.securePath(path)

public actual fun snprintb(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong): CInt =
    NetbsdModRawLibc.snprintb(buf?.value ?: 0L, buflen, fmt, value)

public actual fun snprintbM(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong, max: SizeT): CInt =
    NetbsdModRawLibc.snprintbM(buf?.value ?: 0L, buflen, fmt, value, max)

public actual fun getbootfile(): COpaquePointer? =
    NetbsdModRawLibc.getbootfile().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getbyteorder(): CInt =
    NetbsdModRawLibc.getbyteorder()

public actual fun getdiskrawname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    NetbsdModRawLibc.getdiskrawname(buf?.value ?: 0L, buflen, name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getdiskcookedname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    NetbsdModRawLibc.getdiskcookedname(buf?.value ?: 0L, buflen, name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getfsspecname(buf: COpaquePointer?, buflen: SizeT, spec: String?): COpaquePointer? =
    NetbsdModRawLibc.getfsspecname(buf?.value ?: 0L, buflen, spec).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpct(buf: COpaquePointer?, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): COpaquePointer? =
    NetbsdModRawLibc.strpct(buf?.value ?: 0L, bufsiz, numerator, denominator, precision).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspct(buf: COpaquePointer?, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): COpaquePointer? =
    NetbsdModRawLibc.strspct(buf?.value ?: 0L, bufsiz, numerator, denominator, precision).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun login(ut: Utmp?) {
    NetbsdModRawLibc.login(ut?.toLong() ?: 0L)
}

public actual fun loginx(ut: Utmpx?) {
    NetbsdModRawLibc.loginx(ut?.toLong() ?: 0L)
}

public actual fun logout(line: String?) {
    NetbsdModRawLibc.logout(line)
}

public actual fun logoutx(line: String?, status: CInt, tpe: CInt) {
    NetbsdModRawLibc.logoutx(line, status, tpe)
}

public actual fun logwtmp(line: String?, name: String?, host: String?) {
    NetbsdModRawLibc.logwtmp(line, name, host)
}

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt) {
    NetbsdModRawLibc.logwtmpx(line, name, host, status, tpe)
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    NetbsdModRawLibc.getxattr(path, name, value?.value ?: 0L, size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    NetbsdModRawLibc.lgetxattr(path, name, value?.value ?: 0L, size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    NetbsdModRawLibc.fgetxattr(filedes, name, value?.value ?: 0L, size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    NetbsdModRawLibc.setxattr(path, name, value?.value ?: 0L, size)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    NetbsdModRawLibc.lsetxattr(path, name, value?.value ?: 0L, size)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    NetbsdModRawLibc.fsetxattr(filedes, name, value?.value ?: 0L, size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    NetbsdModRawLibc.listxattr(path, list?.value ?: 0L, size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    NetbsdModRawLibc.llistxattr(path, list?.value ?: 0L, size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    NetbsdModRawLibc.flistxattr(filedes, list?.value ?: 0L, size)

public actual fun removexattr(path: String?, name: String?): CInt =
    NetbsdModRawLibc.removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    NetbsdModRawLibc.lremovexattr(path, name)

public actual fun fremovexattr(fd: CInt, path: String?, name: String?): CInt =
    NetbsdModRawLibc.fremovexattr(fd, path, name)

public actual fun stringToFlags(stringP: COpaquePointer?, setp: CUlong?, clrp: CUlong?): CInt =
    NetbsdModRawLibc.stringToFlags(stringP?.value ?: 0L, setp?.toLong() ?: 0L, clrp?.toLong() ?: 0L)

public actual fun flagsToString(flags: CUlong, def: String?): CInt =
    NetbsdModRawLibc.flagsToString(flags, def)

public actual fun kinfoGetvmmap(pid: PidT, cntp: SizeT?): KinfoVmentry? =
    NetbsdModRawLibc.kinfoGetvmmap(pid, cntp?.toLong() ?: 0L)

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    NetbsdModRawLibc.backtrace(addrlist?.value ?: 0L, len)

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    NetbsdModRawLibc.backtraceSymbols(addrlist?.value ?: 0L, len).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    NetbsdModRawLibc.backtraceSymbolsFd(addrlist?.value ?: 0L, len, fd)

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    NetbsdModRawLibc.backtraceSymbolsFmt(addrlist?.value ?: 0L, len, fmt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: SizeT, fd: CInt, fmt: String?): CInt =
    NetbsdModRawLibc.backtraceSymbolsFdFmt(addrlist?.value ?: 0L, len, fd, fmt)
