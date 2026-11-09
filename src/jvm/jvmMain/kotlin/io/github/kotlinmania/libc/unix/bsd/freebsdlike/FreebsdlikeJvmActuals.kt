@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object UnixBsdFreebsdlikeJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_accept4(s: Int, addr: Long, addrlen: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_chflags(path: String?, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_chflagsat(fd: Int, path: String?, flags: Long, atflag: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_clockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_clockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_clockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_duplocale(base: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_endutxent()

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_fchflags(fd: Int, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_fexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getdomainname(name: Long, len: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getgrouplist(name: String?, basegid: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getutxent(): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getutxid(ut: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getutxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_initgroups(name: String?, basegid: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_kevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_lchflags(path: String?, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_lutimes(file: String?, times: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_memrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mkfifoat(dirfd: Int, pathname: String?, mode: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mknodat(dirfd: Int, pathname: String?, mode: Short, dev: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_nlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_ppoll(fds: Long, nfds: Int, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadAttrGetNp(tid: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadMainNp(): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadBarrierattrGetpshared(attr: Long, shared: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadBarrierattrSetpshared(attr: Long, shared: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadGetNameNp(tid: Long, name: Long, len: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadSetNameNp(tid: Long, name: String?)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadGetnameNp(thread: Long, buffer: Long, length: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadSetnameNp(thread: Long, name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_ptrace(request: Int, pid: Int, addr: Long, data: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_utrace(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pututxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_querylocale(mask: Int, loc: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_rtprio(function: Int, pid: Int, rtp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_schedRrGetInterval(pid: Int, t: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_semGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_semTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_sendfile(fd: Int, s: Int, offset: Long, nbytes: Long, hdtr: Long, sbytes: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_setdomainname(name: String?, len: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_sethostname(name: String?, len: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_setresgid(rgid: Short, egid: Short, sgid: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_setresuid(ruid: Short, euid: Short, suid: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_settimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_setutxent()

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_shmOpen(name: String?, oflag: Int, mode: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_sigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_sigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_sysctlbyname(name: String?, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_sysctlnametomib(name: String?, mibp: Long, sizep: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_uselocale(loc: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_ntpAdjtime(buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_ntpGettime(buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_dlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_iconvOpen(tocode: String?, fromcode: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_iconvClose(cd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_explicitBzero(s: Long, len: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_memsetS(s: Long, smax: Long, c: Int, n: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_gethostid(): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_sethostid(hostid: Long)

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_eui64Aton(a: String?, e: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_eui64Ntoa(id: Long, a: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_eui64Ntohost(hostname: Long, len: Long, id: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_eui64Hostton(hostname: String?, id: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_eaccess(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_kenv(action: Int, name: String?, value: Long, len: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_reboot(howto: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_exect(path: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_execvP(file: String?, searchPath: String?, argv: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mqClose(mqd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mqNotify(mqd: Long, notification: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_mqUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_loginTty(fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_fparseln(stream: Long, len: Long, lineno: Long, delim: String?, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_backtrace(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_backtraceSymbols(addrlist: Long, len: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_backtraceSymbolsFd(addrlist: Long, len: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: Int, errstr: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_kvmClose(kd: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_kvmGetprocs(kd: Long, op: Int, arg: Int, cnt: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_kvmGetloadavg(kd: Long, loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: Int, errbuf: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_kvmRead(kd: Long, addr: Long, buf: Long, nbytes: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_freebsdlike_kvmWrite(kd: Long, addr: Long, buf: Long, nbytes: Long): Long
}

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_semDestroy((sem?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_daemon(nochdir, noclose)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_accept4(s, (addr?.value ?: 0L), (addrlen?.value ?: 0L), flags)

public actual fun chflags(path: String?, flags: CUlong): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_chflags(path, flags.toLong())

public actual fun chflagsat(fd: CInt, path: String?, flags: CUlong, atflag: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_chflagsat(fd, path, flags.toLong(), atflag)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_clockGetres(clkId, (tp?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_clockSettime(clkId, (tp?.value ?: 0L))

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_clockGetcpuclockid(pid, (clkId?.value ?: 0L))

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadGetcpuclockid(thread.toLong(), (clkId?.value ?: 0L))

public actual fun dirfd(dirp: DIR?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_dirfd((dirp?.handle ?: 0L))

public actual fun duplocale(base: LocaleT): LocaleT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_duplocale((base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun endutxent() {
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_endutxent()
}

public actual fun fchflags(fd: CInt, flags: CUlong): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_fchflags(fd, flags.toLong())

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_fexecve(fd, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_futimens(fd, (times?.value ?: 0L))

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getdomainname((name?.value ?: 0L), len)

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getgrentR((grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getpwentR((pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getgrouplist(name, basegid.toShort(), (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toLong(), (serv?.value ?: 0L), servlen.toLong(), flags)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getpriority(which, who)

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getresgid((rgid?.value ?: 0L), (egid?.value ?: 0L), (sgid?.value ?: 0L))

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getresuid((ruid?.value ?: 0L), (euid?.value ?: 0L), (suid?.value ?: 0L))

public actual fun getutxent(): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getutxent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getutxid((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getutxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_initgroups(name, basegid.toShort())

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_kevent(kq, (changelist?.value ?: 0L), nchanges, (eventlist?.value ?: 0L), nevents, (timeout?.value ?: 0L))

public actual fun lchflags(path: String?, flags: CUlong): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_lchflags(path, flags.toLong())

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_lutimes(file, (times?.value ?: 0L))

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_memrchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mkfifoat(dirfd, pathname, mode.toShort())

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mknodat(dirfd, pathname, mode.toShort(), dev.toInt())

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mallocUsableSize((ptr?.value ?: 0L)).toULong()

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mincore((addr?.value ?: 0L), len.toLong(), (vec?.value ?: 0L))

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_newlocale(mask, locale, (base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_nlLanginfoL(item, (locale?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pipe2((fds?.value ?: 0L), flags)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixFallocate(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixFadvise(fd, offset, len, advise)

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_ppoll((fds?.value ?: 0L), nfds.toInt(), (timeout?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun pthreadAttrGetNp(tid: PthreadT, attr: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadAttrGetNp(tid.toLong(), (attr?.value ?: 0L))

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadAttrGetguardsize((attr?.value ?: 0L), (guardsize?.value ?: 0L))

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadAttrSetguardsize((attr?.value ?: 0L), guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadCondattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadCondattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadMainNp(): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadMainNp()

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadMutexTimedlock((lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadMutexattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadMutexattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadRwlockattrGetpshared((attr?.value ?: 0L), (value?.value ?: 0L))

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadRwlockattrSetpshared((attr?.value ?: 0L), value)

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadBarrierattrInit((attr?.value ?: 0L))

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadBarrierattrDestroy((attr?.value ?: 0L))

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadBarrierattrGetpshared((attr?.value ?: 0L), (shared?.value ?: 0L))

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadBarrierattrSetpshared((attr?.value ?: 0L), shared)

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadBarrierInit((barrier?.value ?: 0L), (attr?.value ?: 0L), count.toInt())

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadBarrierDestroy((barrier?.value ?: 0L))

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadBarrierWait((barrier?.value ?: 0L))

public actual fun pthreadGetNameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT) {
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadGetNameNp(tid.toLong(), (name?.value ?: 0L), len.toLong())
}

public actual fun pthreadSetNameNp(tid: PthreadT, name: String?) {
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadSetNameNp(tid.toLong(), name)
}

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadGetnameNp(thread.toLong(), (buffer?.value ?: 0L), length.toLong())

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadSetnameNp(thread.toLong(), name)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadSetschedparam(native.toLong(), policy, (param?.value ?: 0L))

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pthreadGetschedparam(native.toLong(), (policy?.value ?: 0L), (param?.value ?: 0L))

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_ptrace(request, pid, (addr?.value ?: 0L), data)

public actual fun utrace(addr: COpaquePointer?, len: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_utrace((addr?.value ?: 0L), len.toLong())

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pututxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_querylocale(mask, (loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rtprio(function: CInt, pid: PidT, rtp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_rtprio(function, pid, (rtp?.value ?: 0L))

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_schedRrGetInterval(pid, (t?.value ?: 0L))

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_schedGetparam(pid, (param?.value ?: 0L))

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_schedSetparam(pid, (param?.value ?: 0L))

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_semTimedwait((sem?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, nbytes: SizeT, hdtr: COpaquePointer?, sbytes: COpaquePointer?, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_sendfile(fd, s, offset, nbytes.toLong(), (hdtr?.value ?: 0L), (sbytes?.value ?: 0L), flags)

public actual fun setdomainname(name: String?, len: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_setdomainname(name, len)

public actual fun sethostname(name: String?, len: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_sethostname(name, len)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_setpriority(which, who, prio)

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_setresgid(rgid.toShort(), egid.toShort(), sgid.toShort())

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_setresuid(ruid.toShort(), euid.toShort(), suid.toShort())

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_settimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun setutxent() {
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_setutxent()
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_shmOpen(name, oflag, mode.toShort())

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_sigwaitinfo((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_sysctl((name?.value ?: 0L), namelen.toInt(), (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_sysctlbyname(name, (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_sysctlnametomib(name, (mibp?.value ?: 0L), (sizep?.value ?: 0L))

public actual fun uselocale(loc: LocaleT): LocaleT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_uselocale((loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_ntpAdjtime((buf?.value ?: 0L))

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_ntpGettime((buf?.value ?: 0L))

public actual fun dlIteratePhdr(callback: FnCallback?, data: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_dlIteratePhdr(0L, (data?.value ?: 0L))

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_iconvOpen(tocode, fromcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_iconv((cd?.value ?: 0L), (inbuf?.value ?: 0L), (inbytesleft?.value ?: 0L), (outbuf?.value ?: 0L), (outbytesleft?.value ?: 0L)).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_iconvClose((cd?.value ?: 0L))

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_explicitBzero((s?.value ?: 0L), len.toLong())
}

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_memsetS((s?.value ?: 0L), smax.toLong(), c, n.toLong())

public actual fun gethostid(): CLong =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_gethostid()

public actual fun sethostid(hostid: CLong) {
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_sethostid(hostid)
}

public actual fun eui64Aton(a: String?, e: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_eui64Aton(a, (e?.value ?: 0L))

public actual fun eui64Ntoa(id: COpaquePointer?, a: COpaquePointer?, len: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_eui64Ntoa((id?.value ?: 0L), (a?.value ?: 0L), len.toLong())

public actual fun eui64Ntohost(hostname: COpaquePointer?, len: SizeT, id: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_eui64Ntohost((hostname?.value ?: 0L), len.toLong(), (id?.value ?: 0L))

public actual fun eui64Hostton(hostname: String?, id: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_eui64Hostton(hostname, (id?.value ?: 0L))

public actual fun eaccess(path: String?, mode: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_eaccess(path, mode)

public actual fun kenv(action: CInt, name: String?, value: COpaquePointer?, len: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_kenv(action, name, (value?.value ?: 0L), len)

public actual fun reboot(howto: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_reboot(howto)

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_exect(path, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_execvP(file, searchPath, (argv?.value ?: 0L))

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mkostemp((template?.value ?: 0L), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mkostemps((template?.value ?: 0L), suffixlen, flags)

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawn((pid?.value ?: 0L), path, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnp((pid?.value ?: 0L), file, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrInit((attr?.value ?: 0L))

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrDestroy((attr?.value ?: 0L))

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrGetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrSetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrGetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrSetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrGetflags((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrSetflags((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrGetpgroup((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrSetpgroup((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrGetschedpolicy((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrSetschedpolicy((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnattrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnFileActionsInit((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnFileActionsDestroy((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddopen((actions?.value ?: 0L), fd, path, oflag, mode.toShort())

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAddclose((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_posixSpawnFileActionsAdddup2((actions?.value ?: 0L), fd, newfd)

public actual fun mqClose(mqd: MqdT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mqClose((mqd?.value ?: 0L))

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mqGetattr((mqd?.value ?: 0L), (attr?.value ?: 0L))

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mqNotify((mqd?.value ?: 0L), (notification?.value ?: 0L))

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    null

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mqReceive((mqd?.value ?: 0L), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L))

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mqSend((mqd?.value ?: 0L), msgPtr, msgLen.toLong(), msgPrio.toInt())

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mqSetattr((mqd?.value ?: 0L), (newattr?.value ?: 0L), (oldattr?.value ?: 0L))

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mqTimedreceive((mqd?.value ?: 0L), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L), (absTimeout?.value ?: 0L))

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mqTimedsend((mqd?.value ?: 0L), msgPtr, msgLen.toLong(), msgPrio.toInt(), (absTimeout?.value ?: 0L))

public actual fun mqUnlink(name: String?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_mqUnlink(name)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getrandom((buf?.value ?: 0L), buflen.toLong(), flags.toInt())

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_forkpty((amaster?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun loginTty(fd: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_loginTty(fd)

public actual fun fparseln(stream: FILE?, len: COpaquePointer?, lineno: COpaquePointer?, delim: String?, flags: CInt): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_fparseln((stream?.handle ?: 0L), (len?.value ?: 0L), (lineno?.value ?: 0L), delim, flags).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtrace(addrlist: COpaquePointer?, len: SizeT): SizeT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_backtrace((addrlist?.value ?: 0L), len.toLong()).toULong()

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: SizeT): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_backtraceSymbols((addrlist?.value ?: 0L), len.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: SizeT, fd: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_backtraceSymbolsFd((addrlist?.value ?: 0L), len.toLong(), fd)

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errstr: String?): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_kvmOpen(execfile, corefile, swapfile, flags, errstr).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmClose(kd: COpaquePointer?): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_kvmClose((kd?.value ?: 0L))

public actual fun kvmGetprocs(kd: COpaquePointer?, op: CInt, arg: CInt, cnt: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_kvmGetprocs((kd?.value ?: 0L), op, arg, (cnt?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmGetloadavg(kd: COpaquePointer?, loadavg: COpaquePointer?, nelem: CInt): CInt =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_kvmGetloadavg((kd?.value ?: 0L), (loadavg?.value ?: 0L), nelem)

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: CInt, errbuf: COpaquePointer?): COpaquePointer? =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_kvmOpenfiles(execfile, corefile, swapfile, flags, (errbuf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmRead(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_kvmRead((kd?.value ?: 0L), addr.toLong(), (buf?.value ?: 0L), nbytes.toLong())

public actual fun kvmWrite(kd: COpaquePointer?, addr: CUlong, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    UnixBsdFreebsdlikeJniBridge.libc_unix_bsd_freebsdlike_kvmWrite((kd?.value ?: 0L), addr.toLong(), (buf?.value ?: 0L), nbytes.toLong())
