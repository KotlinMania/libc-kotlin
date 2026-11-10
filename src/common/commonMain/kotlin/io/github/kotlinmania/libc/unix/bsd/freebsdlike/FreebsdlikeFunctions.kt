package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
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

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: COpaquePointer?, size: ULong, data: COpaquePointer?): CInt
}

// link.h
public fun wifcontinued(status: CInt): Boolean = status == 0x13

public fun wstopsig(status: CInt): CInt = status shr 8

public fun wifstopped(status: CInt): Boolean = (status and 127) == 127

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt

public expect fun chflags(path: String?, flags: CUlong): CInt

public expect fun chflagsat(fd: CInt, path: String?, flags: CUlong, atflag: CInt): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

public expect fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun endutxent()

public expect fun fchflags(fd: CInt, flags: CUlong): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun getdomainname(name: COpaquePointer?, len: CInt): CInt

public expect fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt

public expect fun getpriority(which: CInt, who: CInt): CInt

public expect fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt

public expect fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt

public expect fun getutxent(): COpaquePointer?

public expect fun getutxid(ut: COpaquePointer?): COpaquePointer?

public expect fun getutxline(ut: COpaquePointer?): COpaquePointer?

public expect fun initgroups(name: String?, basegid: GidT): CInt

public expect fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt

public expect fun lchflags(path: String?, flags: CUlong): CInt

public expect fun lutimes(file: String?, times: COpaquePointer?): CInt

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun mallocUsableSize(ptr: COpaquePointer?): SizeT

public expect fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer?

public expect fun pipe2(fds: COpaquePointer?, flags: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pthreadAttrGetNp(tid: PthreadT, attr: COpaquePointer?): CInt

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt

public expect fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt

public expect fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadMainNp(): CInt

public expect fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt

public expect fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt

public expect fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt

public expect fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt

public expect fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt

public expect fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt

public expect fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt

public expect fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt

public expect fun pthreadBarrierWait(barrier: COpaquePointer?): CInt

public expect fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT)

public expect fun pthreadSetNameNp(tid: PthreadT, name: String?)

public expect fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt

public expect fun utrace(addr: COpaquePointer?, len: SizeT): CInt

public expect fun pututxline(ut: COpaquePointer?): COpaquePointer?

public expect fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer?

public expect fun rtprio(function: CInt, pid: PidT, rtp: COpaquePointer?): CInt

public expect fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt

public expect fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt

public expect fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt

public expect fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: COpaquePointer?, sbytes: COpaquePointer?, flags: CInt): CInt

public expect fun setdomainname(name: String?, len: CInt): CInt

public expect fun sethostname(name: String?, len: CInt): CInt

public expect fun setpriority(which: CInt, who: CInt, prio: CInt): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun setutxent()

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun ntpAdjtime(buf: COpaquePointer?): CInt

public expect fun ntpGettime(buf: COpaquePointer?): CInt

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt

public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT

public expect fun iconvClose(cd: IconvT): CInt

// Added in `FreeBSD` 11.0
// Added in `DragonFly BSD` 5.4
public expect fun explicitBzero(s: COpaquePointer?, len: SizeT)

// ISO/IEC 9899:2011 ("ISO C11") K.3.7.4.1
public expect fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong)

public expect fun eui64Aton(a: String?, e: COpaquePointer?): CInt

public expect fun eui64Ntoa(id: COpaquePointer?, a: COpaquePointer?, len: SizeT): CInt

public expect fun eui64Ntohost(hostname: COpaquePointer?, len: SizeT, id: COpaquePointer?): CInt

public expect fun eui64Hostton(hostname: String?, id: COpaquePointer?): CInt

public expect fun eaccess(path: String?, mode: CInt): CInt

public expect fun kenv(action: CInt, name: String?, value: COpaquePointer?, len: CInt): CInt

public expect fun reboot(howto: CInt): CInt

public expect fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt

public expect fun mkostemp(template: COpaquePointer?, flags: CInt): CInt

public expect fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt

public expect fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt

public expect fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

public expect fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun fparseln(stream: FILE?, len: COpaquePointer?, lineno: COpaquePointer?, delim: String?, flags: CInt): COpaquePointer?

public expect fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT

public expect fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer?

public expect fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt

public expect fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): COpaquePointer?

public expect fun kvmClose(kd: COpaquePointer?): CInt

public expect fun kvmGetprocs(kd: COpaquePointer?, op: CInt, arg: CInt, cnt: COpaquePointer?): COpaquePointer?

public expect fun kvmGetloadavg(kd: COpaquePointer?, loadavg: COpaquePointer?, nelem: CInt): CInt

public expect fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: COpaquePointer?): COpaquePointer?

public expect fun kvmRead(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun kvmWrite(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT
