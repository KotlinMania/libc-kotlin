package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.NfdsT
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.Passwd
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.ClockidT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqAttr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.MqdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.PthreadBarrierT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.PthreadBarrierattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.SemT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Sigevent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Utmpx
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Kevent
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.KinfoProc
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr<DlPhdrInfo>, size: ULong, data: MutPtr<CVoid>): CInt
}

// link.h
public fun wifcontinued(status: CInt): Boolean = status == 0x13

public fun wstopsig(status: CInt): CInt = status shr 8

public fun wifstopped(status: CInt): Boolean = (status and 127) == 127

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt

public expect fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt

public expect fun chflags(path: ConstPtr<CChar>, flags: CUlong): CInt

public expect fun chflagsat(fd: CInt, path: ConstPtr<CChar>, flags: CUlong, atflag: CInt): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun endutxent()

public expect fun fchflags(fd: CInt, flags: CUlong): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt

public expect fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt

public expect fun getpriority(which: CInt, who: CInt): CInt

public expect fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt

public expect fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt

public expect fun getutxent(): MutPtr<Utmpx>

public expect fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt

public expect fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun lchflags(path: ConstPtr<CChar>, flags: CUlong): CInt

public expect fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun mallocUsableSize(ptr: ConstPtr<CVoid>): SizeT

public expect fun mincore(addr: ConstPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt

public expect fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar>

public expect fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pthreadAttrGetNp(tid: PthreadT, attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt

public expect fun pthreadMainNp(): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadGetNameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT)

public expect fun pthreadSetNameNp(tid: PthreadT, name: ConstPtr<CChar>)

public expect fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr<CChar>, length: SizeT): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: MutPtr<CChar>, data: CInt): CInt

public expect fun utrace(addr: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun querylocale(mask: CInt, loc: LocaleT): ConstPtr<CChar>

public expect fun rtprio(function: CInt, pid: PidT, rtp: MutPtr<Rtprio>): CInt

public expect fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt

public expect fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt

public expect fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: MutPtr<SfHdtr>, sbytes: MutPtr<OffT>, flags: CInt): CInt

public expect fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt

public expect fun setpriority(which: CInt, who: CInt, prio: CInt): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt

public expect fun setutxent()

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt

public expect fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt

public expect fun sysctl(name: ConstPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt

public expect fun sysctlbyname(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: ConstPtr<CVoid>, newlen: SizeT): CInt

public expect fun sysctlnametomib(name: ConstPtr<CChar>, mibp: MutPtr<CInt>, sizep: MutPtr<SizeT>): CInt

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun ntpAdjtime(buf: MutPtr<Timex>): CInt

public expect fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt

public expect fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT

public expect fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT

public expect fun iconvClose(cd: IconvT): CInt

// Added in `FreeBSD` 11.0
// Added in `DragonFly BSD` 5.4
public expect fun explicitBzero(s: MutPtr<CVoid>, len: SizeT)

// ISO/IEC 9899:2011 ("ISO C11") K.3.7.4.1
public expect fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong)

public expect fun eui64Aton(a: ConstPtr<CChar>, e: MutPtr<Eui64>): CInt

public expect fun eui64Ntoa(id: ConstPtr<Eui64>, a: MutPtr<CChar>, len: SizeT): CInt

public expect fun eui64Ntohost(hostname: MutPtr<CChar>, len: SizeT, id: ConstPtr<Eui64>): CInt

public expect fun eui64Hostton(hostname: ConstPtr<CChar>, id: MutPtr<Eui64>): CInt

public expect fun eaccess(path: ConstPtr<CChar>, mode: CInt): CInt

public expect fun kenv(action: CInt, name: ConstPtr<CChar>, value: MutPtr<CChar>, len: CInt): CInt

public expect fun reboot(howto: CInt): CInt

public expect fun exect(path: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun execvP(file: ConstPtr<CChar>, searchPath: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>): CInt

public expect fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt

public expect fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt

public expect fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt

public expect fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt

public expect fun mqUnlink(name: ConstPtr<CChar>): CInt

public expect fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

public expect fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt

public expect fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun fparseln(stream: MutPtr<FILE>, len: MutPtr<SizeT>, lineno: MutPtr<SizeT>, delim: ConstPtr<CChar>, flags: CInt): MutPtr<CChar>

public expect fun backtrace(addrlist: MutPtr<MutPtr<CVoid>>, len: SizeT): SizeT

public expect fun backtraceSymbols(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT): MutPtr<MutPtr<CChar>>

public expect fun backtraceSymbolsFd(addrlist: ConstPtr<MutPtr<CVoid>>, len: SizeT, fd: CInt): CInt

public expect fun kvmOpen(execfile: ConstPtr<CChar>, corefile: ConstPtr<CChar>, swapfile: ConstPtr<CChar>, flags: CInt, errstr: ConstPtr<CChar>): MutPtr<KvmT>

public expect fun kvmClose(kd: MutPtr<KvmT>): CInt

public expect fun kvmGetprocs(kd: MutPtr<KvmT>, op: CInt, arg: CInt, cnt: MutPtr<CInt>): MutPtr<KinfoProc>

public expect fun kvmGetloadavg(kd: MutPtr<KvmT>, loadavg: MutPtr<CDouble>, nelem: CInt): CInt

public expect fun kvmOpenfiles(execfile: ConstPtr<CChar>, corefile: ConstPtr<CChar>, swapfile: ConstPtr<CChar>, flags: CInt, errbuf: MutPtr<CChar>): MutPtr<KvmT>

public expect fun kvmRead(kd: MutPtr<KvmT>, addr: CUlong, buf: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun kvmWrite(kd: MutPtr<KvmT>, addr: CUlong, buf: ConstPtr<CVoid>, nbytes: SizeT): SsizeT
