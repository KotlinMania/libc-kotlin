@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

private object UnixCygwinJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_cygwin_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_sigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_sigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_sigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_strftime(s: Long, max: Long, format: String?, tm: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_asctimeR(tm: Long, buf: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_ctimeR(timep: Long, buf: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_strptime(s: String?, format: String?, tm: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_clockSettime(clkId: Long, tp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_clockGettime(clkId: Long, tp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_clockGetres(clkId: Long, tp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_timerCreate(clockid: Long, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_timerDelete(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_timerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_timerGettime(timerid: Long, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_timerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_clockNanosleep(clkId: Long, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_clockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_futimes(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_lutimes(file: String?, times: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_settimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_setitimer(which: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_futimesat(fd: Int, path: String?, times: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getpwent(): Long

    @JvmStatic
    external fun libc_unix_cygwin_setpwent()

    @JvmStatic
    external fun libc_unix_cygwin_endpwent()

    @JvmStatic
    external fun libc_unix_cygwin_ifNameindex(): Long

    @JvmStatic
    external fun libc_unix_cygwin_ifFreenameindex(ptr: Long)

    @JvmStatic
    external fun libc_unix_cygwin_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_cygwin_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_cygwin_mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_dlfork(value: Int)

    @JvmStatic
    external fun libc_unix_cygwin_accept4(s: Int, addr: Long, addrlen: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_bind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_recvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_cygwin_sendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_cygwin_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, sevlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_ppoll(fds: Long, nfds: Int, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_cygwin_duplocale(base: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_uselocale(loc: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_semOpen(name: String?, oflag: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_cygwin_semTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_semGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_clearenv(): Int

    @JvmStatic
    external fun libc_unix_cygwin_ptsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getpt(): Int

    @JvmStatic
    external fun libc_unix_cygwin_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_getloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_abs(i: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_arc4random(): Int

    @JvmStatic
    external fun libc_unix_cygwin_arc4randomUniform(l: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_arc4randomBuf(buf: Long, size: Long)

    @JvmStatic
    external fun libc_unix_cygwin_labs(i: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_mkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_mkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_mkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_rand(): Int

    @JvmStatic
    external fun libc_unix_cygwin_reallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_reallocf(ptr: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_srand(seed: Int)

    @JvmStatic
    external fun libc_unix_cygwin_drand48(): Double

    @JvmStatic
    external fun libc_unix_cygwin_erand48(xseed: Long): Double

    @JvmStatic
    external fun libc_unix_cygwin_jrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_lcong48(p: Long)

    @JvmStatic
    external fun libc_unix_cygwin_lrand48(): Long

    @JvmStatic
    external fun libc_unix_cygwin_mrand48(): Long

    @JvmStatic
    external fun libc_unix_cygwin_nrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_seed48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_srand48(seed: Long)

    @JvmStatic
    external fun libc_unix_cygwin_qsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libc_unix_cygwin_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_cygwin_explicitBzero(s: Long, len: Long)

    @JvmStatic
    external fun libc_unix_cygwin_ffs(value: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_ffsl(value: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_ffsll(value: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_fls(value: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_flsl(value: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_flsll(value: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_strcasecmpL(s1: String?, s2: String?, loc: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_strncasecmpL(s1: String?, s2: String?, n: Long, loc: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_timingsafeBcmp(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_timingsafeMemcmp(a: Long, b: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_memrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_strsep(string: Long, delim: String?): Long

    @JvmStatic
    external fun libc_unix_cygwin_basename(path: String?): Long

    @JvmStatic
    external fun libc_unix_cygwin_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_dup3(src: Int, dst: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_eaccess(pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_euidaccess(pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_execvpe(file: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_fexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_fdatasync(fd: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_getdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_gethostid(): Long

    @JvmStatic
    external fun libc_unix_cygwin_getpagesize(): Int

    @JvmStatic
    external fun libc_unix_cygwin_getpeereid(socket: Int, euid: Long, egid: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_sbrk(increment: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_setgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_sethostname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_vhangup(): Int

    @JvmStatic
    external fun libc_unix_cygwin_getdtablesize(): Int

    @JvmStatic
    external fun libc_unix_cygwin_sync()

    @JvmStatic
    external fun libc_unix_cygwin_errno(): Long

    @JvmStatic
    external fun libc_unix_cygwin_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_schedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_schedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_schedRrGetInterval(pid: Int, t: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_schedGetcpu(): Int

    @JvmStatic
    external fun libc_unix_cygwin_schedGetaffinity(pid: Int, cpusetsize: Long, mask: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_schedSetaffinity(pid: Int, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadBarrierattrSetpshared(attr: Long, shared: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadBarrierattrGetpshared(attr: Long, shared: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadMutexattrGetprotocol(attr: Long, protocol: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadMutexattrSetprotocol(attr: Long, protocol: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadSetschedprio(native: Long, priority: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadGetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadGetattrNp(native: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadSetaffinityNp(thread: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_pthreadSetnameNp(thread: Long, name: String?): Int

    @JvmStatic
    external fun libc_unix_cygwin_ioctl(fd: Int, request: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_cygwin_mount(src: String?, target: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_umount(target: String?): Int

    @JvmStatic
    external fun libc_unix_cygwin_cygwinUmount(target: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_unix_cygwin_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_uname(buf: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnFileActionsAddchdir(actions: Long, path: String?): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnFileActionsAddfchdir(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnFileActionsAddchdirNp(actions: Long, path: String?): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getgrgid(gid: Short): Long

    @JvmStatic
    external fun libc_unix_cygwin_getgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getgrouplist(user: String?, group: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_cygwin_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_initgroups(user: String?, group: Short): Int

    @JvmStatic
    external fun libc_unix_cygwin_statfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_fstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_unix_cygwin_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_cygwin_endutxent()

    @JvmStatic
    external fun libc_unix_cygwin_getutxent(): Long

    @JvmStatic
    external fun libc_unix_cygwin_getutxid(id: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_getutxline(line: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_pututxline(utmpx: Long): Long

    @JvmStatic
    external fun libc_unix_cygwin_setutxent()

    @JvmStatic
    external fun libc_unix_cygwin_utmpxname(file: String?): Int

    @JvmStatic
    external fun libc_unix_cygwin_updwtmpx(file: String?, utmpx: Long)
}

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_sigwaitinfo((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadSigmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_sigsuspend((mask?.value ?: 0L))

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_sigaltstack((ss?.value ?: 0L), (oss?.value ?: 0L))

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadKill((thread?.value ?: 0L), sig)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    UnixCygwinJniBridge.libc_unix_cygwin_strftime((s?.value ?: 0L), max.toLong(), format, (tm?.value ?: 0L)).toULong()

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_asctimeR((tm?.value ?: 0L), (buf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_ctimeR((timep?.value ?: 0L), (buf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_strptime(s, format, (tm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_clockSettime(clkId.toLong(), (tp?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_clockGettime(clkId.toLong(), (tp?.value ?: 0L))

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_clockGetres(clkId.toLong(), (tp?.value ?: 0L))

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_timerCreate(clockid.toLong(), (sevp?.value ?: 0L), (timerid?.value ?: 0L))

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_timerDelete(timerid.toLong())

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_timerSettime(timerid.toLong(), flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_timerGettime(timerid.toLong(), (currValue?.value ?: 0L))

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_timerGetoverrun(timerid.toLong())

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_clockNanosleep(clkId.toLong(), flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_clockGetcpuclockid(pid, (clkId?.value ?: 0L))

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_futimes(fd, (times?.value ?: 0L))

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_lutimes(file, (times?.value ?: 0L))

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_settimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getitimer(which, (currValue?.value ?: 0L))

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_setitimer(which, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_futimesat(fd, path, (times?.value ?: 0L))

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_setpriority(which, who.toInt(), prio)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getpwuidR(uid.toShort(), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwent(): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setpwent() {
    UnixCygwinJniBridge.libc_unix_cygwin_setpwent()
}

public actual fun endpwent() {
    UnixCygwinJniBridge.libc_unix_cygwin_endpwent()
}

public actual fun ifNameindex(): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_ifNameindex().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    UnixCygwinJniBridge.libc_unix_cygwin_ifFreenameindex((ptr?.value ?: 0L))
}

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixCygwinJniBridge.libc_unix_cygwin_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixCygwinJniBridge.libc_unix_cygwin_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_mkfifoat(dirfd, pathname, mode.toInt())

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_mknodat(dirfd, pathname, mode.toInt(), dev.toInt())

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_futimens(fd, (times?.value ?: 0L))

public actual fun dlfork(value: CInt) {
    UnixCygwinJniBridge.libc_unix_cygwin_dlfork(value)
}

public actual fun accept4(s: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?, flags: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_accept4(s, (addr?.value ?: 0L), (addrlen?.value ?: 0L), flags)

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_bind(socket, (address?.value ?: 0L), addressLen)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    UnixCygwinJniBridge.libc_unix_cygwin_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixCygwinJniBridge.libc_unix_cygwin_recvmsg(fd, (msg?.value ?: 0L), flags)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixCygwinJniBridge.libc_unix_cygwin_sendmsg(fd, (msg?.value ?: 0L), flags)

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, sevlen: SocklenT, flags: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getnameinfo((sa?.value ?: 0L), salen, (host?.value ?: 0L), hostlen, (serv?.value ?: 0L), sevlen, flags)

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_ppoll((fds?.value ?: 0L), nfds.toInt(), (timeout?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    UnixCygwinJniBridge.libc_unix_cygwin_newlocale(mask, locale, (base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freelocale(loc: LocaleT) {
    UnixCygwinJniBridge.libc_unix_cygwin_freelocale((loc?.value ?: 0L))
}

public actual fun duplocale(base: LocaleT): LocaleT =
    UnixCygwinJniBridge.libc_unix_cygwin_duplocale((base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    UnixCygwinJniBridge.libc_unix_cygwin_uselocale((loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_semDestroy((sem?.value ?: 0L))

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_semOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun semClose(sem: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_semClose((sem?.value ?: 0L))

public actual fun semUnlink(name: String?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_semUnlink(name)

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_semTimedwait((sem?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))

public actual fun clearenv(): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_clearenv()

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_ptsnameR(fd, (buf?.value ?: 0L), buflen.toLong())

public actual fun getpt(): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getpt()

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getloadavg((loadavg?.value ?: 0L), nelem)

public actual fun abs(i: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_abs(i)

public actual fun arc4random(): UInt =
    UnixCygwinJniBridge.libc_unix_cygwin_arc4random().toUInt()

public actual fun arc4randomUniform(l: UInt): UInt =
    UnixCygwinJniBridge.libc_unix_cygwin_arc4randomUniform(l.toInt()).toUInt()

public actual fun arc4randomBuf(buf: COpaquePointer?, size: SizeT) {
    UnixCygwinJniBridge.libc_unix_cygwin_arc4randomBuf((buf?.value ?: 0L), size.toLong())
}

public actual fun labs(i: CLong): CLong =
    UnixCygwinJniBridge.libc_unix_cygwin_labs(i)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_mkostemp((template?.value ?: 0L), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_mkostemps((template?.value ?: 0L), suffixlen, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_mkstemps((template?.value ?: 0L), suffixlen)

public actual fun rand(): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_rand()

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_reallocarray((ptr?.value ?: 0L), nmemb.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun reallocf(ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_reallocf((ptr?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srand(seed: CUint) {
    UnixCygwinJniBridge.libc_unix_cygwin_srand(seed.toInt())
}

public actual fun drand48(): CDouble =
    UnixCygwinJniBridge.libc_unix_cygwin_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    UnixCygwinJniBridge.libc_unix_cygwin_erand48((xseed?.value ?: 0L))

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    UnixCygwinJniBridge.libc_unix_cygwin_jrand48((xseed?.value ?: 0L))

public actual fun lcong48(p: COpaquePointer?) {
    UnixCygwinJniBridge.libc_unix_cygwin_lcong48((p?.value ?: 0L))
}

public actual fun lrand48(): CLong =
    UnixCygwinJniBridge.libc_unix_cygwin_lrand48()

public actual fun mrand48(): CLong =
    UnixCygwinJniBridge.libc_unix_cygwin_mrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    UnixCygwinJniBridge.libc_unix_cygwin_nrand48((xseed?.value ?: 0L))

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_seed48((xseed?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun srand48(seed: CLong) {
    UnixCygwinJniBridge.libc_unix_cygwin_srand48(seed)
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    UnixCygwinJniBridge.libc_unix_cygwin_qsortR((base?.value ?: 0L), num.toLong(), size.toLong(), 0L, (arg?.value ?: 0L))
}

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixMadvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_shmOpen(name, oflag, mode.toInt())

public actual fun shmUnlink(name: String?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_shmUnlink(name)

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
    UnixCygwinJniBridge.libc_unix_cygwin_explicitBzero((s?.value ?: 0L), len.toLong())
}

public actual fun ffs(value: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_ffs(value)

public actual fun ffsl(value: CLong): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_ffsll(value)

public actual fun fls(value: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_fls(value)

public actual fun flsl(value: CLong): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_flsl(value)

public actual fun flsll(value: CLonglong): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_flsll(value)

public actual fun strcasecmpL(s1: String?, s2: String?, loc: LocaleT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_strcasecmpL(s1, s2, (loc?.value ?: 0L))

public actual fun strncasecmpL(s1: String?, s2: String?, n: SizeT, loc: LocaleT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_strncasecmpL(s1, s2, n.toLong(), (loc?.value ?: 0L))

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_timingsafeBcmp((a?.value ?: 0L), (b?.value ?: 0L), len.toLong())

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_timingsafeMemcmp((a?.value ?: 0L), (b?.value ?: 0L), len.toLong())

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_memmem((haystack?.value ?: 0L), haystacklen.toLong(), (needle?.value ?: 0L), needlelen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_memrchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_strsep((string?.value ?: 0L), delim).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: String?): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_basename(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_daemon(nochdir, noclose)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_dup3(src, dst, flags)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_eaccess(pathname, mode)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_euidaccess(pathname, mode)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_execvpe(file, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_faccessat(dirfd, pathname, mode, flags)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_fexecve(fd, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun fdatasync(fd: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_fdatasync(fd)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getdomainname((name?.value ?: 0L), len.toLong())

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun gethostid(): CLong =
    UnixCygwinJniBridge.libc_unix_cygwin_gethostid()

public actual fun getpagesize(): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getpagesize()

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getpeereid(socket, (euid?.value ?: 0L), (egid?.value ?: 0L))

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadAtfork(0L, 0L, 0L)

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pipe2((fds?.value ?: 0L), flags)

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_setgroups(ngroups, (ptr?.value ?: 0L))

public actual fun sethostname(name: String?, len: SizeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_sethostname(name, len.toLong())

public actual fun vhangup(): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_vhangup()

public actual fun getdtablesize(): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getdtablesize()

public actual fun sync() {
    UnixCygwinJniBridge.libc_unix_cygwin_sync()
}

public actual fun errno(): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_errno().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_schedSetparam(pid, (param?.value ?: 0L))

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_schedGetparam(pid, (param?.value ?: 0L))

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_schedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_schedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, t: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_schedRrGetInterval(pid, (t?.value ?: 0L))

public actual fun schedGetcpu(): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_schedGetcpu()

public actual fun schedGetaffinity(pid: PidT, cpusetsize: SizeT, mask: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_schedGetaffinity(pid, cpusetsize.toLong(), (mask?.value ?: 0L))

public actual fun schedSetaffinity(pid: PidT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_schedSetaffinity(pid, cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadAttrGetguardsize((attr?.value ?: 0L), (guardsize?.value ?: 0L))

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadAttrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadAttrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadCancel((thread?.value ?: 0L))

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadCondattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadCondattrSetclock((attr?.value ?: 0L), clockId.toLong())

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadCondattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadBarrierattrInit((attr?.value ?: 0L))

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadBarrierattrSetpshared((attr?.value ?: 0L), shared)

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadBarrierattrGetpshared((attr?.value ?: 0L), (shared?.value ?: 0L))

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadBarrierattrDestroy((attr?.value ?: 0L))

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadBarrierInit((barrier?.value ?: 0L), (attr?.value ?: 0L), count.toInt())

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadBarrierDestroy((barrier?.value ?: 0L))

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadBarrierWait((barrier?.value ?: 0L))

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadGetcpuclockid((thread?.value ?: 0L), (clkId?.value ?: 0L))

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadGetschedparam((native?.value ?: 0L), (policy?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadMutexTimedlock((lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadMutexattrGetprotocol((attr?.value ?: 0L), (protocol?.value ?: 0L))

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadMutexattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadMutexattrSetprotocol((attr?.value ?: 0L), protocol)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadMutexattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadSpinDestroy((lock?.value ?: 0L))

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadSpinInit((lock?.value ?: 0L), pshared)

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadSpinLock((lock?.value ?: 0L))

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadSpinTrylock((lock?.value ?: 0L))

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadSpinUnlock((lock?.value ?: 0L))

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadRwlockattrGetpshared((attr?.value ?: 0L), (value?.value ?: 0L))

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadRwlockattrSetpshared((attr?.value ?: 0L), value)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadSetschedparam((native?.value ?: 0L), policy, (param?.value ?: 0L))

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadSetschedprio((native?.value ?: 0L), priority)

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadGetaffinityNp((thread?.value ?: 0L), cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadGetattrNp((native?.value ?: 0L), (attr?.value ?: 0L))

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadGetnameNp((thread?.value ?: 0L), (name?.value ?: 0L), len.toLong())

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadSetaffinityNp((thread?.value ?: 0L), cpusetsize.toLong(), (cpuset?.value ?: 0L))

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_pthreadSetnameNp((thread?.value ?: 0L), name)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_ioctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    UnixCygwinJniBridge.libc_unix_cygwin_getrandom((buf?.value ?: 0L), buflen.toLong(), flags.toInt())

public actual fun mount(src: String?, target: String?, flags: CUint): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_mount(src, target, flags.toInt())

public actual fun umount(target: String?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_umount(target)

public actual fun cygwinUmount(target: String?, flags: CUint): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_cygwinUmount(target, flags.toInt())

public actual fun dirfd(dirp: DIR?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_dirfd((dirp?.handle ?: 0L))

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    UnixCygwinJniBridge.libc_unix_cygwin_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    UnixCygwinJniBridge.libc_unix_cygwin_telldir((dirp?.handle ?: 0L))

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_uname((buf?.value ?: 0L))

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawn((pid?.value ?: 0L), path, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnp((pid?.value ?: 0L), file, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrInit((attr?.value ?: 0L))

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrDestroy((attr?.value ?: 0L))

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrGetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrSetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrGetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrSetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrGetflags((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrSetflags((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrGetpgroup((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrSetpgroup((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrGetschedpolicy((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrSetschedpolicy((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnattrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnFileActionsInit((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnFileActionsDestroy((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnFileActionsAddopen((actions?.value ?: 0L), fd, path, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnFileActionsAddclose((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnFileActionsAdddup2((actions?.value ?: 0L), fd, newfd)

public actual fun posixSpawnFileActionsAddchdir(actions: COpaquePointer?, path: String?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnFileActionsAddchdir((actions?.value ?: 0L), path)

public actual fun posixSpawnFileActionsAddfchdir(actions: COpaquePointer?, fd: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnFileActionsAddfchdir((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L), fd)

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixCygwinJniBridge.libc_unix_cygwin_forkpty((amaster?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_getgrgid(gid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getgrgidR(gid.toShort(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getgrouplist(user, group.toShort(), (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun initgroups(user: String?, group: GidT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_initgroups(user, group.toShort())

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_statfs(path, (buf?.value ?: 0L))

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_fstatfs(fd, (buf?.value ?: 0L))

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixFadvise(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_posixFallocate(fd, offset, len)

public actual fun fallocate(fd: CInt, mode: CInt, offset: OffT, len: OffT): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_fallocate(fd, mode, offset, len)

public actual fun endutxent() {
    UnixCygwinJniBridge.libc_unix_cygwin_endutxent()
}

public actual fun getutxent(): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_getutxent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxid(id: COpaquePointer?): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_getutxid((id?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxline(line: COpaquePointer?): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_getutxline((line?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pututxline(utmpx: COpaquePointer?): COpaquePointer? =
    UnixCygwinJniBridge.libc_unix_cygwin_pututxline((utmpx?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setutxent() {
    UnixCygwinJniBridge.libc_unix_cygwin_setutxent()
}

public actual fun utmpxname(file: String?): CInt =
    UnixCygwinJniBridge.libc_unix_cygwin_utmpxname(file)

public actual fun updwtmpx(file: String?, utmpx: COpaquePointer?) {
    UnixCygwinJniBridge.libc_unix_cygwin_updwtmpx(file, (utmpx?.value ?: 0L))
}
