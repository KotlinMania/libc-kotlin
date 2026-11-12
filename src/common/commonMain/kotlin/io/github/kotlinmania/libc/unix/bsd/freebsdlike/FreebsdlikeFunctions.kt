package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr, size: ULong, data: MutPtr): CInt
}

// link.h
public fun wifcontinued(status: CInt): Boolean = status == 0x13

public fun wstopsig(status: CInt): CInt = status shr 8

public fun wifstopped(status: CInt): Boolean = (status and 127) == 127

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun accept4(s: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt

public expect fun chflags(path: ConstPtr, flags: CUlong): CInt

public expect fun chflagsat(fd: CInt, path: ConstPtr, flags: CUlong, atflag: CInt): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun endutxent()

public expect fun fchflags(fd: CInt, flags: CUlong): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun getdomainname(name: MutPtr, len: CInt): CInt

public expect fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt

public expect fun getpriority(which: CInt, who: CInt): CInt

public expect fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt

public expect fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt

public expect fun getutxent(): MutPtr

public expect fun getutxid(ut: ConstPtr): MutPtr

public expect fun getutxline(ut: ConstPtr): MutPtr

public expect fun initgroups(name: ConstPtr, basegid: GidT): CInt

public expect fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt

public expect fun lchflags(path: ConstPtr, flags: CUlong): CInt

public expect fun lutimes(file: ConstPtr, times: ConstPtr): CInt

public expect fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun mallocUsableSize(ptr: ConstPtr): SizeT

public expect fun mincore(addr: ConstPtr, len: SizeT, vec: MutPtr): CInt

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr

public expect fun pipe2(fds: MutPtr, flags: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt

public expect fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pthreadAttrGetNp(tid: PthreadT, attr: MutPtr): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadMainNp(): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr): CInt

public expect fun pthreadGetNameNp(tid: PthreadT, name: MutPtr, len: SizeT)

public expect fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr)

public expect fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr, length: SizeT): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt

public expect fun utrace(addr: ConstPtr, len: SizeT): CInt

public expect fun pututxline(ut: ConstPtr): MutPtr

public expect fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun querylocale(mask: CInt, loc: LocaleT): ConstPtr

public expect fun rtprio(function: CInt, pid: PidT, rtp: MutPtr): CInt

public expect fun schedRrGetInterval(pid: PidT, t: MutPtr): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

public expect fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt

public expect fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt

public expect fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: MutPtr, sbytes: MutPtr, flags: CInt): CInt

public expect fun setdomainname(name: ConstPtr, len: CInt): CInt

public expect fun sethostname(name: ConstPtr, len: CInt): CInt

public expect fun setpriority(which: CInt, who: CInt, prio: CInt): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt

public expect fun setutxent()

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt

public expect fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt

public expect fun sysctl(name: ConstPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt

public expect fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: ConstPtr, newlen: SizeT): CInt

public expect fun sysctlnametomib(name: ConstPtr, mibp: MutPtr, sizep: MutPtr): CInt

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun ntpAdjtime(buf: MutPtr): CInt

public expect fun ntpGettime(buf: MutPtr): CInt

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt

public expect fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT

public expect fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT

public expect fun iconvClose(cd: IconvT): CInt

// Added in `FreeBSD` 11.0
// Added in `DragonFly BSD` 5.4
public expect fun explicitBzero(s: MutPtr, len: SizeT)

// ISO/IEC 9899:2011 ("ISO C11") K.3.7.4.1
public expect fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong)

public expect fun eui64Aton(a: ConstPtr, e: MutPtr): CInt

public expect fun eui64Ntoa(id: ConstPtr, a: MutPtr, len: SizeT): CInt

public expect fun eui64Ntohost(hostname: MutPtr, len: SizeT, id: ConstPtr): CInt

public expect fun eui64Hostton(hostname: ConstPtr, id: MutPtr): CInt

public expect fun eaccess(path: ConstPtr, mode: CInt): CInt

public expect fun kenv(action: CInt, name: ConstPtr, value: MutPtr, len: CInt): CInt

public expect fun reboot(howto: CInt): CInt

public expect fun exect(path: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun execvP(file: ConstPtr, searchPath: ConstPtr, argv: ConstPtr): CInt

public expect fun mkostemp(template: MutPtr, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt

public expect fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnattrInit(attr: MutPtr): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt

public expect fun mqNotify(mqd: MqdT, notification: ConstPtr): CInt

public expect fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt

public expect fun mqUnlink(name: ConstPtr): CInt

public expect fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt

public expect fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun fparseln(stream: MutPtr, len: MutPtr, lineno: MutPtr, delim: ConstPtr, flags: CInt): MutPtr

public expect fun backtrace(addrlist: MutPtr, len: SizeT): SizeT

public expect fun backtraceSymbols(addrlist: ConstPtr, len: SizeT): MutPtr

public expect fun backtraceSymbolsFd(addrlist: ConstPtr, len: SizeT, fd: CInt): CInt

public expect fun kvmOpen(execfile: ConstPtr, corefile: ConstPtr, swapfile: ConstPtr, flags: CInt, errstr: ConstPtr): MutPtr

public expect fun kvmClose(kd: MutPtr): CInt

public expect fun kvmGetprocs(kd: MutPtr, op: CInt, arg: CInt, cnt: MutPtr): MutPtr

public expect fun kvmGetloadavg(kd: MutPtr, loadavg: MutPtr, nelem: CInt): CInt

public expect fun kvmOpenfiles(execfile: ConstPtr, corefile: ConstPtr, swapfile: ConstPtr, flags: CInt, errbuf: MutPtr): MutPtr

public expect fun kvmRead(kd: MutPtr, addr: CUlong, buf: MutPtr, nbytes: SizeT): SsizeT

public expect fun kvmWrite(kd: MutPtr, addr: CUlong, buf: ConstPtr, nbytes: SizeT): SsizeT
