@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixCygwinJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixCygwinSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixCygwinSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixCygwinStrftime(s: Long, max: Long, format: Long, tm: Long): Long

    @JvmStatic
    external fun libcUnixCygwinAsctimeR(tm: Long, buf: Long): Long

    @JvmStatic
    external fun libcUnixCygwinCtimeR(timep: Long, buf: Long): Long

    @JvmStatic
    external fun libcUnixCygwinStrptime(s: Long, format: Long, tm: Long): Long

    @JvmStatic
    external fun libcUnixCygwinClockSettime(clkId: Long, tp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinClockGettime(clkId: Long, tp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinClockGetres(clkId: Long, tp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinTimerCreate(clockid: Long, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libcUnixCygwinTimerDelete(timerid: Long): Int

    @JvmStatic
    external fun libcUnixCygwinTimerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixCygwinTimerGettime(timerid: Long, currValue: Long): Int

    @JvmStatic
    external fun libcUnixCygwinTimerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libcUnixCygwinClockNanosleep(clkId: Long, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinClockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libcUnixCygwinFutimes(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixCygwinLutimes(file: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSetitimer(which: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixCygwinFutimesat(fd: Int, path: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixCygwinSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixCygwinGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetpwent(): Long

    @JvmStatic
    external fun libcUnixCygwinSetpwent()

    @JvmStatic
    external fun libcUnixCygwinEndpwent()

    @JvmStatic
    external fun libcUnixCygwinIfNameindex(): Long

    @JvmStatic
    external fun libcUnixCygwinIfFreenameindex(ptr: Long)

    @JvmStatic
    external fun libcUnixCygwinReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixCygwinWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixCygwinMkfifoat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixCygwinMknodat(dirfd: Int, pathname: Long, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libcUnixCygwinUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixCygwinFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixCygwinDlfork(value: Int)

    @JvmStatic
    external fun libcUnixCygwinAccept4(s: Int, addr: Long, addrlen: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinBind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libcUnixCygwinRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcUnixCygwinRecvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixCygwinSendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixCygwinGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, sevlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPpoll(fds: Long, nfds: Int, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixCygwinNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixCygwinFreelocale(loc: Long)

    @JvmStatic
    external fun libcUnixCygwinDuplocale(base: Long): Long

    @JvmStatic
    external fun libcUnixCygwinUselocale(loc: Long): Long

    @JvmStatic
    external fun libcUnixCygwinSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixCygwinSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixCygwinSemClose(sem: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcUnixCygwinClearenv(): Int

    @JvmStatic
    external fun libcUnixCygwinPtsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetpt(): Int

    @JvmStatic
    external fun libcUnixCygwinMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixCygwinGetloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libcUnixCygwinAbs(i: Int): Int

    @JvmStatic
    external fun libcUnixCygwinArc4random(): Int

    @JvmStatic
    external fun libcUnixCygwinArc4randomUniform(l: Int): Int

    @JvmStatic
    external fun libcUnixCygwinArc4randomBuf(buf: Long, size: Long)

    @JvmStatic
    external fun libcUnixCygwinLabs(i: Long): Long

    @JvmStatic
    external fun libcUnixCygwinMkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinMkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinMkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libcUnixCygwinRand(): Int

    @JvmStatic
    external fun libcUnixCygwinReallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixCygwinReallocf(ptr: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixCygwinSrand(seed: Int)

    @JvmStatic
    external fun libcUnixCygwinDrand48(): Double

    @JvmStatic
    external fun libcUnixCygwinErand48(xseed: Long): Double

    @JvmStatic
    external fun libcUnixCygwinJrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixCygwinLcong48(p: Long)

    @JvmStatic
    external fun libcUnixCygwinLrand48(): Long

    @JvmStatic
    external fun libcUnixCygwinMrand48(): Long

    @JvmStatic
    external fun libcUnixCygwinNrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixCygwinSeed48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixCygwinSrand48(seed: Long)

    @JvmStatic
    external fun libcUnixCygwinQsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libcUnixCygwinMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixCygwinMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPosixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixCygwinMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixCygwinShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixCygwinShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixCygwinExplicitBzero(s: Long, len: Long)

    @JvmStatic
    external fun libcUnixCygwinFfs(value: Int): Int

    @JvmStatic
    external fun libcUnixCygwinFfsl(value: Long): Int

    @JvmStatic
    external fun libcUnixCygwinFfsll(value: Long): Int

    @JvmStatic
    external fun libcUnixCygwinFls(value: Int): Int

    @JvmStatic
    external fun libcUnixCygwinFlsl(value: Long): Int

    @JvmStatic
    external fun libcUnixCygwinFlsll(value: Long): Int

    @JvmStatic
    external fun libcUnixCygwinStrcasecmpL(s1: Long, s2: Long, loc: Long): Int

    @JvmStatic
    external fun libcUnixCygwinStrncasecmpL(s1: Long, s2: Long, n: Long, loc: Long): Int

    @JvmStatic
    external fun libcUnixCygwinTimingsafeBcmp(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixCygwinTimingsafeMemcmp(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixCygwinMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixCygwinMemrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libcUnixCygwinStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixCygwinStrsep(string: Long, delim: Long): Long

    @JvmStatic
    external fun libcUnixCygwinBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixCygwinDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixCygwinDup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinEaccess(pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixCygwinEuidaccess(pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixCygwinExecvpe(file: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinFaccessat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinFexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcUnixCygwinGetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGethostid(): Long

    @JvmStatic
    external fun libcUnixCygwinGetpagesize(): Int

    @JvmStatic
    external fun libcUnixCygwinGetpeereid(socket: Int, euid: Long, egid: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinSbrk(increment: Long): Long

    @JvmStatic
    external fun libcUnixCygwinSetgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixCygwinVhangup(): Int

    @JvmStatic
    external fun libcUnixCygwinGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixCygwinSync()

    @JvmStatic
    external fun libcUnixCygwinErrno(): Long

    @JvmStatic
    external fun libcUnixCygwinSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcUnixCygwinSchedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libcUnixCygwinSchedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libcUnixCygwinSchedRrGetInterval(pid: Int, t: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSchedGetcpu(): Int

    @JvmStatic
    external fun libcUnixCygwinSchedGetaffinity(pid: Int, cpusetsize: Long, mask: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSchedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadBarrierattrSetpshared(attr: Long, shared: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadBarrierattrGetpshared(attr: Long, shared: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadMutexattrGetprotocol(attr: Long, protocol: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadMutexattrSetprotocol(attr: Long, protocol: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadSetschedprio(native: Long, priority: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadGetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadGetattrNp(native: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadSetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPthreadSetnameNp(thread: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixCygwinIoctl(fd: Int, request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixCygwinMount(src: Long, target: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinUmount(target: Long): Int

    @JvmStatic
    external fun libcUnixCygwinCygwinUmount(target: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcUnixCygwinTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixCygwinUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnFileActionsAddopen(actions: Long, fd: Int, path: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnFileActionsAddchdir(actions: Long, path: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnFileActionsAddfchdir(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnFileActionsAddchdirNp(actions: Long, path: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixCygwinForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixCygwinGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetgrouplist(user: Long, group: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixCygwinGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixCygwinGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixCygwinInitgroups(user: Long, group: Short): Int

    @JvmStatic
    external fun libcUnixCygwinStatfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixCygwinFstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixCygwinPosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcUnixCygwinPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixCygwinFallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixCygwinEndutxent()

    @JvmStatic
    external fun libcUnixCygwinGetutxent(): Long

    @JvmStatic
    external fun libcUnixCygwinGetutxid(id: Long): Long

    @JvmStatic
    external fun libcUnixCygwinGetutxline(line: Long): Long

    @JvmStatic
    external fun libcUnixCygwinPututxline(utmpx: Long): Long

    @JvmStatic
    external fun libcUnixCygwinSetutxent()

    @JvmStatic
    external fun libcUnixCygwinUtmpxname(file: Long): Int

    @JvmStatic
    external fun libcUnixCygwinUpdwtmpx(file: Long, utmpx: Long)
}

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSigwait(set.rawAddress, sig.rawAddress)

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSigwaitinfo(set.rawAddress, info.rawAddress)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSigsuspend(mask.rawAddress)

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadKill(thread.rawAddress, sig)

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT =
    UnixCygwinJniBridge.libcUnixCygwinStrftime(s.rawAddress, max.toLong(), format.rawAddress, tm.rawAddress).toULong()

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinAsctimeR(tm.rawAddress, buf.rawAddress))

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinCtimeR(timep.rawAddress, buf.rawAddress))

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinStrptime(s.rawAddress, format.rawAddress, tm.rawAddress))

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinClockSettime(clkId.toLong(), tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinClockGettime(clkId.toLong(), tp.rawAddress)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinClockGetres(clkId.toLong(), tp.rawAddress)

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinTimerCreate(clockid.toLong(), sevp.rawAddress, timerid.rawAddress)

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinTimerDelete(timerid.toLong())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinTimerSettime(timerid.toLong(), flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinTimerGettime(timerid.toLong(), currValue.rawAddress)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinTimerGetoverrun(timerid.toLong())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinClockNanosleep(clkId.toLong(), flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinClockGetcpuclockid(pid, clkId.rawAddress)

public actual fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFutimes(fd, times.rawAddress)

public actual fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinLutimes(file.rawAddress, times.rawAddress)

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetitimer(which, currValue.rawAddress)

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSetitimer(which, newValue.rawAddress, oldValue.rawAddress)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun futimesat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFutimesat(fd, path.rawAddress, times.rawAddress)

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSetrlimit(resource, rlim.rawAddress)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSetpriority(which, who.toInt(), prio)

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetpwuidR(uid.toShort(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinGetpwent())

public actual fun setpwent() {
    UnixCygwinJniBridge.libcUnixCygwinSetpwent()
}

public actual fun endpwent() {
    UnixCygwinJniBridge.libcUnixCygwinEndpwent()
}

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinIfNameindex())

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    UnixCygwinJniBridge.libcUnixCygwinIfFreenameindex(ptr.rawAddress)
}

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixCygwinJniBridge.libcUnixCygwinReadv(fd, iov.rawAddress, iovcnt)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixCygwinJniBridge.libcUnixCygwinWritev(fd, iov.rawAddress, iovcnt)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinMkfifoat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinMknodat(dirfd, pathname.rawAddress, mode.toInt(), dev.toInt())

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFutimens(fd, times.rawAddress)

public actual fun dlfork(value: CInt) {
    UnixCygwinJniBridge.libcUnixCygwinDlfork(value)
}

public actual fun accept4(s: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>, flags: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinAccept4(s, addr.rawAddress, addrlen.rawAddress, flags)

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinBind(socket, address.rawAddress, addressLen)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    UnixCygwinJniBridge.libcUnixCygwinRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    UnixCygwinJniBridge.libcUnixCygwinRecvmsg(fd, msg.rawAddress, flags)

public actual fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    UnixCygwinJniBridge.libcUnixCygwinSendmsg(fd, msg.rawAddress, flags)

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, sevlen: SocklenT, flags: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetnameinfo(sa.rawAddress, salen, host.rawAddress, hostlen, serv.rawAddress, sevlen, flags)

public actual fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPpoll(fds.rawAddress, nfds.toInt(), timeout.rawAddress, sigmask.rawAddress)

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun freelocale(loc: LocaleT) {
    UnixCygwinJniBridge.libcUnixCygwinFreelocale(loc.rawAddress)
}

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinDuplocale(base.rawAddress))

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinUselocale(loc.rawAddress))

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSemDestroy(sem.rawAddress)

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSemClose(sem.rawAddress)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSemUnlink(name.rawAddress)

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun clearenv(): CInt =
    UnixCygwinJniBridge.libcUnixCygwinClearenv()

public actual fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPtsnameR(fd, buf.rawAddress, buflen.toLong())

public actual fun getpt(): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetpt()

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinMemalign(align.toLong(), size.toLong()))

public actual fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetloadavg(loadavg.rawAddress, nelem)

public actual fun abs(i: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinAbs(i)

public actual fun arc4random(): UInt =
    UnixCygwinJniBridge.libcUnixCygwinArc4random().toUInt()

public actual fun arc4randomUniform(l: UInt): UInt =
    UnixCygwinJniBridge.libcUnixCygwinArc4randomUniform(l.toInt()).toUInt()

public actual fun arc4randomBuf(buf: MutPtr<CVoid>, size: SizeT) {
    UnixCygwinJniBridge.libcUnixCygwinArc4randomBuf(buf.rawAddress, size.toLong())
}

public actual fun labs(i: CLong): CLong =
    UnixCygwinJniBridge.libcUnixCygwinLabs(i)

public actual fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinMkostemp(template.rawAddress, flags)

public actual fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinMkostemps(template.rawAddress, suffixlen, flags)

public actual fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinMkstemps(template.rawAddress, suffixlen)

public actual fun rand(): CInt =
    UnixCygwinJniBridge.libcUnixCygwinRand()

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinReallocarray(ptr.rawAddress, nmemb.toLong(), size.toLong()))

public actual fun reallocf(ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinReallocf(ptr.rawAddress, size.toLong()))

public actual fun srand(seed: CUint) {
    UnixCygwinJniBridge.libcUnixCygwinSrand(seed.toInt())
}

public actual fun drand48(): CDouble =
    UnixCygwinJniBridge.libcUnixCygwinDrand48()

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    UnixCygwinJniBridge.libcUnixCygwinErand48(xseed.rawAddress)

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    UnixCygwinJniBridge.libcUnixCygwinJrand48(xseed.rawAddress)

public actual fun lcong48(p: MutPtr<CUshort>) {
    UnixCygwinJniBridge.libcUnixCygwinLcong48(p.rawAddress)
}

public actual fun lrand48(): CLong =
    UnixCygwinJniBridge.libcUnixCygwinLrand48()

public actual fun mrand48(): CLong =
    UnixCygwinJniBridge.libcUnixCygwinMrand48()

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    UnixCygwinJniBridge.libcUnixCygwinNrand48(xseed.rawAddress)

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinSeed48(xseed.rawAddress))

public actual fun srand48(seed: CLong) {
    UnixCygwinJniBridge.libcUnixCygwinSrand48(seed)
}

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    UnixCygwinJniBridge.libcUnixCygwinQsortR(base.rawAddress, num.toLong(), size.toLong(), 0L, arg.rawAddress)
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinMsync(addr.rawAddress, len.toLong(), flags)

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinShmUnlink(name.rawAddress)

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    UnixCygwinJniBridge.libcUnixCygwinExplicitBzero(s.rawAddress, len.toLong())
}

public actual fun ffs(value: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFfs(value)

public actual fun ffsl(value: CLong): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFfsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFfsll(value)

public actual fun fls(value: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFls(value)

public actual fun flsl(value: CLong): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFlsl(value)

public actual fun flsll(value: CLonglong): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFlsll(value)

public actual fun strcasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, loc: LocaleT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinStrcasecmpL(s1.rawAddress, s2.rawAddress, loc.rawAddress)

public actual fun strncasecmpL(s1: ConstPtr<CChar>, s2: ConstPtr<CChar>, n: SizeT, loc: LocaleT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinStrncasecmpL(s1.rawAddress, s2.rawAddress, n.toLong(), loc.rawAddress)

public actual fun timingsafeBcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinTimingsafeBcmp(a.rawAddress, b.rawAddress, len.toLong())

public actual fun timingsafeMemcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinTimingsafeMemcmp(a.rawAddress, b.rawAddress, len.toLong())

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinMemrchr(cx.rawAddress, c, n.toLong()))

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinStrsep(string.rawAddress, delim.rawAddress))

public actual fun basename(path: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinBasename(path.rawAddress))

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinDaemon(nochdir, noclose)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinDup3(src, dst, flags)

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinEaccess(pathname.rawAddress, mode)

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinEuidaccess(pathname.rawAddress, mode)

public actual fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinExecvpe(file.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFaccessat(dirfd, pathname.rawAddress, mode, flags)

public actual fun fexecve(fd: CInt, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFexecve(fd, argv.rawAddress, envp.rawAddress)

public actual fun fdatasync(fd: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFdatasync(fd)

public actual fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetdomainname(name.rawAddress, len.toLong())

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetentropy(buf.rawAddress, buflen.toLong())

public actual fun gethostid(): CLong =
    UnixCygwinJniBridge.libcUnixCygwinGethostid()

public actual fun getpagesize(): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetpagesize()

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetpeereid(socket, euid.rawAddress, egid.rawAddress)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadAtfork(0L, 0L, 0L)

public actual fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPipe2(fds.rawAddress, flags)

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinSbrk(increment))

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSetgroups(ngroups, ptr.rawAddress)

public actual fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSethostname(name.rawAddress, len.toLong())

public actual fun vhangup(): CInt =
    UnixCygwinJniBridge.libcUnixCygwinVhangup()

public actual fun getdtablesize(): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetdtablesize()

public actual fun sync() {
    UnixCygwinJniBridge.libcUnixCygwinSync()
}

public actual fun errno(): MutPtr<CInt> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinErrno())

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSchedSetparam(pid, param.rawAddress)

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSchedGetparam(pid, param.rawAddress)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSchedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSchedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSchedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, t: MutPtr<Timespec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSchedRrGetInterval(pid, t.rawAddress)

public actual fun schedGetcpu(): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSchedGetcpu()

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: MutPtr<CpuSetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSchedGetaffinity(pid, cpusetsize.toLong(), mask.rawAddress)

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinSchedSetaffinity(pid, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadAttrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadAttrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadCancel(thread.rawAddress)

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadCondattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadCondattrSetclock(attr.rawAddress, clockId.toLong())

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadCondattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadBarrierattrInit(attr.rawAddress)

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadBarrierattrSetpshared(attr.rawAddress, shared)

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadBarrierattrGetpshared(attr.rawAddress, shared.rawAddress)

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadBarrierattrDestroy(attr.rawAddress)

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadBarrierInit(barrier.rawAddress, attr.rawAddress, count.toInt())

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadBarrierDestroy(barrier.rawAddress)

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadBarrierWait(barrier.rawAddress)

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadGetcpuclockid(thread.rawAddress, clkId.rawAddress)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadGetschedparam(native.rawAddress, policy.rawAddress, param.rawAddress)

public actual fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadMutexattrGetprotocol(attr.rawAddress, protocol.rawAddress)

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadMutexattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadMutexattrSetprotocol(attr.rawAddress, protocol)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadMutexattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadSpinUnlock(lock.rawAddress)

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadRwlockattrGetpshared(attr.rawAddress, value.rawAddress)

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadRwlockattrSetpshared(attr.rawAddress, value)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadSetschedparam(native.rawAddress, policy, param.rawAddress)

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadSetschedprio(native.rawAddress, priority)

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadGetaffinityNp(thread.rawAddress, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun pthreadGetattrNp(native: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadGetattrNp(native.rawAddress, attr.rawAddress)

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadGetnameNp(thread.rawAddress, name.rawAddress, len.toLong())

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadSetaffinityNp(thread.rawAddress, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPthreadSetnameNp(thread.rawAddress, name.rawAddress)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    UnixCygwinJniBridge.libcUnixCygwinIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    UnixCygwinJniBridge.libcUnixCygwinGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, flags: CUint): CInt =
    UnixCygwinJniBridge.libcUnixCygwinMount(src.rawAddress, target.rawAddress, flags.toInt())

public actual fun umount(target: ConstPtr<CChar>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinUmount(target.rawAddress)

public actual fun cygwinUmount(target: ConstPtr<CChar>, flags: CUint): CInt =
    UnixCygwinJniBridge.libcUnixCygwinCygwinUmount(target.rawAddress, flags.toInt())

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinDirfd(dirp.rawAddress)

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    UnixCygwinJniBridge.libcUnixCygwinSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    UnixCygwinJniBridge.libcUnixCygwinTelldir(dirp.rawAddress)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinUname(buf.rawAddress)

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrGetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrSetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrGetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrSetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrGetpgroup(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrSetpgroup(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrGetschedpolicy(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrSetschedpolicy(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnattrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnFileActionsInit(actions.rawAddress)

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnFileActionsDestroy(actions.rawAddress)

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnFileActionsAddopen(actions.rawAddress, fd, path.rawAddress, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnFileActionsAddclose(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnFileActionsAdddup2(actions.rawAddress, fd, newfd)

public actual fun posixSpawnFileActionsAddchdir(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnFileActionsAddchdir(actions.rawAddress, path.rawAddress)

public actual fun posixSpawnFileActionsAddfchdir(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnFileActionsAddfchdir(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnFileActionsAddchdirNp(actions.rawAddress, path.rawAddress)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixSpawnFileActionsAddfchdirNp(actions.rawAddress, fd)

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT =
    UnixCygwinJniBridge.libcUnixCygwinForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinGetgrgid(gid.toShort()))

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetgrouplist(user.rawAddress, group.toShort(), groups.rawAddress, ngroups.rawAddress)

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinGetgrnam(name.rawAddress))

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinInitgroups(user.rawAddress, group.toShort())

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinStatfs(path.rawAddress, buf.rawAddress)

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFstatfs(fd, buf.rawAddress)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixFadvise(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinPosixFallocate(fd, offset, len)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    UnixCygwinJniBridge.libcUnixCygwinFallocate(fd, mode, offset, len)

public actual fun endutxent() {
    UnixCygwinJniBridge.libcUnixCygwinEndutxent()
}

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinGetutxent())

public actual fun getutxid(id: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinGetutxid(id.rawAddress))

public actual fun getutxline(line: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinGetutxline(line.rawAddress))

public actual fun pututxline(utmpx: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixCygwinJniBridge.libcUnixCygwinPututxline(utmpx.rawAddress))

public actual fun setutxent() {
    UnixCygwinJniBridge.libcUnixCygwinSetutxent()
}

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    UnixCygwinJniBridge.libcUnixCygwinUtmpxname(file.rawAddress)

public actual fun updwtmpx(file: ConstPtr<CChar>, utmpx: ConstPtr<Utmpx>) {
    UnixCygwinJniBridge.libcUnixCygwinUpdwtmpx(file.rawAddress, utmpx.rawAddress)
}
