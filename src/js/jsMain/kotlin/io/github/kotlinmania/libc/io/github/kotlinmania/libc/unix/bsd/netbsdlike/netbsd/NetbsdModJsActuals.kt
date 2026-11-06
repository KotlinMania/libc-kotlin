package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.COpaquePointer

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)") as CInt

public actual fun reallocarr(ptr: COpaquePointer?, number: SizeT, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').reallocarr(ptr?.value ?: 0L, number, size)") as CInt

public actual fun chflags(path: String?, flags: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').chflags(path, flags)") as CInt

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').fchflags(fd, flags)") as CInt

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    js("require('@kotlinmania/libc-native-bindings').lchflags(path, flags)") as CInt

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrListFd(fd, attrnamespace, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrListFile(path, attrnamespace, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrListLink(path, attrnamespace, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrDeleteFd(fd, attrnamespace, attrname)") as CInt

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrDeleteFile(path, attrnamespace, attrname)") as CInt

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrDeleteLink(path, attrnamespace, attrname)") as CInt

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrGetFd(fd, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrGetFile(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').extattrGetLink(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as SsizeT

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrNamespaceToString(attrnamespace, string?.value ?: 0L)") as CInt

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrSetFd(fd, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as CInt

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrSetFile(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as CInt

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrSetLink(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)") as CInt

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').extattrStringToNamespace(string, attrnamespace?.toLong() ?: 0L)") as CInt

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    js("require('@kotlinmania/libc-native-bindings').openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as CInt

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    js("require('@kotlinmania/libc-native-bindings').forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)") as PidT

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptsnameR(fd, buf?.value ?: 0L, buflen)") as CInt

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lutimes(file, times?.toLong() ?: 0L)") as CInt

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctlbyname(name, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)") as CInt

public actual fun sysctlnametomib(sname: String?, name: CInt?, namelenp: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sysctlnametomib(sname, name?.toLong() ?: 0L, namelenp?.toLong() ?: 0L)") as CInt

public actual fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: SizeT, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: SizeT, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').kevent(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, timeout?.toLong() ?: 0L)") as CInt

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mount(src, target, flags, data?.value ?: 0L, size)") as CInt

public actual fun mqClose(mqd: MqdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqClose(mqd)") as CInt

public actual fun mqGetattr(mqd: MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqGetattr(mqd, attr?.toLong() ?: 0L)") as CInt

public actual fun mqNotify(mqd: MqdT, notification: io.github.kotlinmania.libc.Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqNotify(mqd, notification?.toLong() ?: 0L)") as CInt

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)") as SsizeT

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSend(mqd, msgPtr, msgLen, msgPrio)") as CInt

public actual fun mqSetattr(mqd: MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)") as CInt

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)") as SsizeT

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)") as CInt

public actual fun mqUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').mqUnlink(name)") as CInt

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').ptrace(request, pid, addr?.value ?: 0L, data)") as CInt

public actual fun utrace(label: String?, addr: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').utrace(label, addr?.value ?: 0L, len)") as CInt

public actual fun pthreadGetnameNp(t: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetnameNp(t, name?.value ?: 0L, len)") as CInt

public actual fun pthreadSetnameNp(t: PthreadT, name: String?, arg: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetnameNp(t, name, arg?.value ?: 0L)") as CInt

public actual fun pthreadAttrGetNp(thread: PthreadT, attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetNp(thread, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetattrNp(native: PthreadT, attr: io.github.kotlinmania.libc.PthreadAttrT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetattrNp(native, attr?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetguardsize(attr?.toLong() ?: 0L, guardsize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetguardsize(attr?.toLong() ?: 0L, guardsize)") as CInt

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadGetaffinityNp(thread: PthreadT, size: SizeT, set: Cpuset?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetaffinityNp(thread, size, set?.toLong() ?: 0L)") as CInt

public actual fun pthreadSetaffinityNp(thread: PthreadT, size: SizeT, set: Cpuset?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetaffinityNp(thread, size, set?.toLong() ?: 0L)") as CInt

public actual fun cpusetCreate(): Cpuset? =
    js("require('@kotlinmania/libc-native-bindings').cpusetCreate()") as Cpuset?

public actual fun cpusetDestroy(set: Cpuset?) {
    js("require('@kotlinmania/libc-native-bindings').cpusetDestroy(set?.toLong() ?: 0L)")
}

public actual fun cpusetClr(cpu: CpuidT, set: Cpuset?): CInt =
    js("require('@kotlinmania/libc-native-bindings').cpusetClr(cpu, set?.toLong() ?: 0L)") as CInt

public actual fun cpusetSet(cpu: CpuidT, set: Cpuset?): CInt =
    js("require('@kotlinmania/libc-native-bindings').cpusetSet(cpu, set?.toLong() ?: 0L)") as CInt

public actual fun cpusetIsset(cpu: CpuidT, set: Cpuset?): CInt =
    js("require('@kotlinmania/libc-native-bindings').cpusetIsset(cpu, set?.toLong() ?: 0L)") as CInt

public actual fun cpusetSize(set: Cpuset?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').cpusetSize(set?.toLong() ?: 0L)") as SizeT

public actual fun cpusetZero(set: Cpuset?) {
    js("require('@kotlinmania/libc-native-bindings').cpusetZero(set?.toLong() ?: 0L)")
}

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun duplocale(base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').duplocale(base)") as LocaleT

public actual fun freelocale(loc: LocaleT) {
    js("require('@kotlinmania/libc-native-bindings').freelocale(loc)")
}

public actual fun localeconvL(loc: LocaleT): Lconv? =
    js("require('@kotlinmania/libc-native-bindings').localeconvL(loc)") as Lconv?

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    js("require('@kotlinmania/libc-native-bindings').newlocale(mask, locale, base)") as LocaleT

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').settimeofday(tv?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').dup3(src, dst, flags)") as CInt

public actual fun kqueue1(flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').kqueue1(flags)") as CInt

public actual fun lwpSelf(): LwpidT =
    js("require('@kotlinmania/libc-native-bindings').lwpSelf()") as LwpidT

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)") as CInt

public actual fun dlauxinfo(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlauxinfo()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    js("require('@kotlinmania/libc-native-bindings').iconvOpen(tocode, fromcode)") as IconvT

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)") as SizeT

public actual fun iconvClose(cd: IconvT): CInt =
    js("require('@kotlinmania/libc-native-bindings').iconvClose(cd)") as CInt

public actual fun timerCreate(clockid: ClockidT, sevp: io.github.kotlinmania.libc.Sigevent?, timerid: TimerT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerCreate(clockid, sevp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)") as CInt

public actual fun timerDelete(timerid: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerDelete(timerid)") as CInt

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGetoverrun(timerid)") as CInt

public actual fun timerGettime(timerid: TimerT, currValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerGettime(timerid, currValue?.toLong() ?: 0L)") as CInt

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerSettime(timerid, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').dlvsym(handle?.value ?: 0L, symbol, version)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun explicitMemset(b: COpaquePointer?, c: CInt, len: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').explicitMemset(b?.value ?: 0L, c, len)")
}

public actual fun consttimeMemequal(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').consttimeMemequal(a?.value ?: 0L, b?.value ?: 0L, len)") as CInt

public actual fun mremap(oldp: COpaquePointer?, oldsize: SizeT, newp: COpaquePointer?, newsize: SizeT, flags: CInt): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').mremap(oldp?.value ?: 0L, oldsize, newp?.value ?: 0L, newsize, flags)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedRrGetInterval(pid: PidT, t: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedRrGetInterval(pid, t?.toLong() ?: 0L)") as CInt

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetparam(pid, param?.toLong() ?: 0L)") as CInt

public actual fun schedGetscheduler(pid: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedGetscheduler(pid)") as CInt

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: SchedParam?): CInt =
    js("require('@kotlinmania/libc-native-bindings').schedSetscheduler(pid, policy, param?.toLong() ?: 0L)") as CInt

public actual fun pollts(fds: Pollfd?, nfds: NfdsT, ts: Timespec?, sigmask: io.github.kotlinmania.libc.SigsetT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pollts(fds?.toLong() ?: 0L, nfds, ts?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getrandom(buf?.value ?: 0L, buflen, flags)") as SsizeT

public actual fun reboot(mode: CInt, bootstr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').reboot(mode, bootstr?.value ?: 0L)") as CInt

public actual fun lwpPark(clock: ClockidT, flags: CInt, ts: Timespec?, unpark: LwpidT, hint: COpaquePointer?, unparkhint: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lwpPark(clock, flags, ts?.toLong() ?: 0L, unpark, hint?.value ?: 0L, unparkhint?.value ?: 0L)") as CInt

public actual fun lwpUnpark(lwp: LwpidT, hint: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lwpUnpark(lwp, hint?.value ?: 0L)") as CInt

public actual fun lwpUnparkAll(targets: LwpidT?, ntargets: SizeT, hint: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lwpUnparkAll(targets?.toLong() ?: 0L, ntargets, hint?.value ?: 0L)") as CInt

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getmntinfo(mntbufp?.value ?: 0L, flags)") as CInt

public actual fun getvfsstat(buf: Statvfs?, bufsize: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getvfsstat(buf?.toLong() ?: 0L, bufsize, flags)") as CInt

public actual fun eventfd(value: CUint, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfd(value, flags)") as CInt

public actual fun eventfdRead(efd: CInt, valp: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfdRead(efd, valp?.toLong() ?: 0L)") as CInt

public actual fun eventfdWrite(efd: CInt, value: EventfdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').eventfdWrite(efd, value)") as CInt

public actual fun timerfdCreate(clockid: ClockidT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdCreate(clockid, flags)") as CInt

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdGettime(fd, currValue?.toLong() ?: 0L)") as CInt

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    js("require('@kotlinmania/libc-native-bindings').qsortR(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L, arg?.value ?: 0L)")
}

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioRead(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioWrite(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioFsync(op, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioError(aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioError(aiocbp?.toLong() ?: 0L)") as CInt

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').aioReturn(aiocbp?.toLong() ?: 0L)") as SsizeT

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)") as CInt

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    js("require('@kotlinmania/libc-native-bindings').aioCancel(fd, aiocbp?.toLong() ?: 0L)") as CInt

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)") as CInt

public actual fun getpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrentR(grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun efopen(p: String?, m: String?): FILE =
    js("require('@kotlinmania/libc-native-bindings').efopen(p, m)") as FILE

public actual fun emalloc(n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').emalloc(n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ecalloc(n: SizeT, c: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ecalloc(n, c)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun erealloc(p: COpaquePointer?, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').erealloc(p?.value ?: 0L, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ereallocarr(p: COpaquePointer?, n: SizeT, s: SizeT) {
    js("require('@kotlinmania/libc-native-bindings').ereallocarr(p?.value ?: 0L, n, s)")
}

public actual fun estrdup(s: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').estrdup(s)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun estrndup(s: String?, len: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').estrndup(s, len)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun estrlcpy(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').estrlcpy(dst?.value ?: 0L, src, len)") as SizeT

public actual fun estrlcat(dst: COpaquePointer?, src: String?, len: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').estrlcat(dst?.value ?: 0L, src, len)") as SizeT

public actual fun estrtoi(nptr: String?, base: CInt, lo: IntmaxT, hi: IntmaxT): IntmaxT =
    js("require('@kotlinmania/libc-native-bindings').estrtoi(nptr, base, lo, hi)") as IntmaxT

public actual fun estrtou(nptr: String?, base: CInt, lo: UintmaxT, hi: UintmaxT): UintmaxT =
    js("require('@kotlinmania/libc-native-bindings').estrtou(nptr, base, lo, hi)") as UintmaxT

public actual fun esetfunc(cb: EsetfuncCbCallback?): EsetfuncCbCallback? =
    js("require('@kotlinmania/libc-native-bindings').esetfunc(cb?.toLong() ?: 0L)") as EsetfuncCbCallback?

public actual fun securePath(path: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').securePath(path)") as CInt

public actual fun snprintb(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong): CInt =
    js("require('@kotlinmania/libc-native-bindings').snprintb(buf?.value ?: 0L, buflen, fmt, value)") as CInt

public actual fun snprintbM(buf: COpaquePointer?, buflen: SizeT, fmt: String?, value: ULong, max: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').snprintbM(buf?.value ?: 0L, buflen, fmt, value, max)") as CInt

public actual fun getbootfile(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getbootfile()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getbyteorder(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getbyteorder()") as CInt

public actual fun getdiskrawname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getdiskrawname(buf?.value ?: 0L, buflen, name)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getdiskcookedname(buf: COpaquePointer?, buflen: SizeT, name: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getdiskcookedname(buf?.value ?: 0L, buflen, name)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getfsspecname(buf: COpaquePointer?, buflen: SizeT, spec: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getfsspecname(buf?.value ?: 0L, buflen, spec)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strpct(buf: COpaquePointer?, bufsiz: SizeT, numerator: UintmaxT, denominator: UintmaxT, precision: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strpct(buf?.value ?: 0L, bufsiz, numerator, denominator, precision)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strspct(buf: COpaquePointer?, bufsiz: SizeT, numerator: IntmaxT, denominator: IntmaxT, precision: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').strspct(buf?.value ?: 0L, bufsiz, numerator, denominator, precision)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun login(ut: Utmp?) {
    js("require('@kotlinmania/libc-native-bindings').login(ut?.toLong() ?: 0L)")
}

public actual fun loginx(ut: Utmpx?) {
    js("require('@kotlinmania/libc-native-bindings').loginx(ut?.toLong() ?: 0L)")
}

public actual fun logout(line: String?) {
    js("require('@kotlinmania/libc-native-bindings').logout(line)")
}

public actual fun logoutx(line: String?, status: CInt, tpe: CInt) {
    js("require('@kotlinmania/libc-native-bindings').logoutx(line, status, tpe)")
}

public actual fun logwtmp(line: String?, name: String?, host: String?) {
    js("require('@kotlinmania/libc-native-bindings').logwtmp(line, name, host)")
}

public actual fun logwtmpx(line: String?, name: String?, host: String?, status: CInt, tpe: CInt) {
    js("require('@kotlinmania/libc-native-bindings').logwtmpx(line, name, host, status, tpe)")
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').getxattr(path, name, value?.value ?: 0L, size)") as SsizeT

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').lgetxattr(path, name, value?.value ?: 0L, size)") as SsizeT

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').fgetxattr(filedes, name, value?.value ?: 0L, size)") as SsizeT

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').setxattr(path, name, value?.value ?: 0L, size)") as CInt

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').lsetxattr(path, name, value?.value ?: 0L, size)") as CInt

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').fsetxattr(filedes, name, value?.value ?: 0L, size, flags)") as CInt

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').listxattr(path, list?.value ?: 0L, size)") as SsizeT

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').llistxattr(path, list?.value ?: 0L, size)") as SsizeT

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').flistxattr(filedes, list?.value ?: 0L, size)") as SsizeT

public actual fun removexattr(path: String?, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').removexattr(path, name)") as CInt

public actual fun lremovexattr(path: String?, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').lremovexattr(path, name)") as CInt

public actual fun fremovexattr(fd: CInt, path: String?, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fremovexattr(fd, path, name)") as CInt

public actual fun stringToFlags(stringP: COpaquePointer?, setp: CUlong?, clrp: CUlong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').stringToFlags(stringP?.value ?: 0L, setp?.toLong() ?: 0L, clrp?.toLong() ?: 0L)") as CInt

public actual fun flagsToString(flags: CUlong, def: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').flagsToString(flags, def)") as CInt

public actual fun kinfoGetvmmap(pid: PidT, cntp: SizeT?): KinfoVmentry? =
    js("require('@kotlinmania/libc-native-bindings').kinfoGetvmmap(pid, cntp?.toLong() ?: 0L)") as KinfoVmentry?

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').backtrace(addrlist?.value ?: 0L, len)") as SizeT

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbols(addrlist?.value ?: 0L, len)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbolsFd(addrlist?.value ?: 0L, len, fd)") as CInt

public actual fun backtraceSymbolsFmt(addrlist: COpaquePointer?, len: SizeT, fmt: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbolsFmt(addrlist?.value ?: 0L, len, fmt)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFdFmt(addrlist: COpaquePointer?, len: SizeT, fd: CInt, fmt: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').backtraceSymbolsFdFmt(addrlist?.value ?: 0L, len, fd, fmt)") as CInt
