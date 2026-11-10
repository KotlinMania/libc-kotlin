@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.ClockidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun chflags(path: String?, flags: CUlong): CInt =
    0

public actual fun chflagsat(fd: CInt, path: String?, flags: CUlong, atflag: CInt): CInt =
    0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    0

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    0

public actual fun dirfd(dirp: DIR?): CInt =
    0

public actual fun duplocale(base: LocaleT): LocaleT =
    null

public actual fun endutxent() {
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    0

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    0

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    0

public actual fun getpriority(which: CInt, who: CInt): CInt =
    0

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    0

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    0

public actual fun getutxent(): COpaquePointer? =
    null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    0

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    0

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    0

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    null

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    0

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    0uL

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    0

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    null

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    null

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    0

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    0

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    0

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    0

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadMainNp(): CInt =
    0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    0

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    0

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    0

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    0

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    0

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    0

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    0

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    0

public actual fun utrace(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    null

public actual fun rtprio(function: CInt, pid: PidT, rtp: COpaquePointer?): CInt =
    0

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: COpaquePointer?, sbytes: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun setdomainname(name: String?, len: CInt): CInt =
    0

public actual fun sethostname(name: String?, len: CInt): CInt =
    0

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    0

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    0

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    0

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun setutxent() {
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    0

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    0

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    0

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    0

public actual fun uselocale(loc: LocaleT): LocaleT =
    null

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    0

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    0

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    null

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    0uL

public actual fun iconvClose(cd: IconvT): CInt =
    0

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
}

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    0

public actual fun gethostid(): CLong =
    0L

public actual fun sethostid(hostid: CLong) {
}

public actual fun eui64Aton(a: String?, e: COpaquePointer?): CInt =
    0

public actual fun eui64Ntoa(id: COpaquePointer?, a: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun eui64Ntohost(hostname: COpaquePointer?, len: SizeT, id: COpaquePointer?): CInt =
    0

public actual fun eui64Hostton(hostname: String?, id: COpaquePointer?): CInt =
    0

public actual fun eaccess(path: String?, mode: CInt): CInt =
    0

public actual fun kenv(action: CInt, name: String?, value: COpaquePointer?, len: CInt): CInt =
    0

public actual fun reboot(howto: CInt): CInt =
    0

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    0

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    0

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    0

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    0

public actual fun mqClose(mqd: MqdT): CInt =
    0

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    0

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    0

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    null

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    0L

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    0

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    0

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    0L

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    0

public actual fun mqUnlink(name: String?): CInt =
    0

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    0L

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    0

public actual fun loginTty(fd: CInt): CInt =
    0

public actual fun fparseln(stream: FILE?, len: COpaquePointer?, lineno: COpaquePointer?, delim: String?, flags: CInt): COpaquePointer? =
    null

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    0uL

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    null

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    0

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): COpaquePointer? =
    null

public actual fun kvmClose(kd: COpaquePointer?): CInt =
    0

public actual fun kvmGetprocs(kd: COpaquePointer?, op: CInt, arg: CInt, cnt: COpaquePointer?): COpaquePointer? =
    null

public actual fun kvmGetloadavg(kd: COpaquePointer?, loadavg: COpaquePointer?, nelem: CInt): CInt =
    0

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: COpaquePointer?): COpaquePointer? =
    null

public actual fun kvmRead(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun kvmWrite(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L
