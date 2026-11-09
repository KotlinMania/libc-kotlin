@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

private object UnixNtoJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_nto_sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_nto_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_nto_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_nto_fdatasync(fd: Int): Int

    @JvmStatic
    external fun libc_unix_nto_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_nto_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_nto_mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_nto_mknodat(fd: Int, pathname: String?, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libc_unix_nto_clockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_clockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_clockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_nto_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_nto_setgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_unix_nto_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_nto_nlLanginfo(item: Int): Long

    @JvmStatic
    external fun libc_unix_nto_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libc_unix_nto_ptsnameR(fd: Int, buf: Long, buflen: Long): Long

    @JvmStatic
    external fun libc_unix_nto_clearenv(): Int

    @JvmStatic
    external fun libc_unix_nto_waitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_nto_wait4(pid: Int, status: Long, options: Int, rusage: Long): Int

    @JvmStatic
    external fun libc_unix_nto_execvpe(file: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_getifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libc_unix_nto_freeifaddrs(ifa: Long)

    @JvmStatic
    external fun libc_unix_nto_bind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libc_unix_nto_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_nto_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_nto_sendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_nto_recvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_nto_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_loginTty(fd: Int): Int

    @JvmStatic
    external fun libc_unix_nto_uname(buf: Long): Int

    @JvmStatic
    external fun libc_unix_nto_getpeereid(socket: Int, euid: Long, egid: Long): Int

    @JvmStatic
    external fun libc_unix_nto_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_nto_abs(i: Int): Int

    @JvmStatic
    external fun libc_unix_nto_labs(i: Long): Long

    @JvmStatic
    external fun libc_unix_nto_rand(): Int

    @JvmStatic
    external fun libc_unix_nto_srand(seed: Int)

    @JvmStatic
    external fun libc_unix_nto_setpwent()

    @JvmStatic
    external fun libc_unix_nto_endpwent()

    @JvmStatic
    external fun libc_unix_nto_getpwent(): Long

    @JvmStatic
    external fun libc_unix_nto_setgrent()

    @JvmStatic
    external fun libc_unix_nto_endgrent()

    @JvmStatic
    external fun libc_unix_nto_getgrent(): Long

    @JvmStatic
    external fun libc_unix_nto_setspent()

    @JvmStatic
    external fun libc_unix_nto_endspent()

    @JvmStatic
    external fun libc_unix_nto_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_nto_ftok(pathname: String?, projId: Int): Int

    @JvmStatic
    external fun libc_unix_nto_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_nto_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_nto_mkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_mkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_sigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_nto_sigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadSetschedprio(native: Long, priority: Int): Int

    @JvmStatic
    external fun libc_unix_nto_ifNameindex(): Long

    @JvmStatic
    external fun libc_unix_nto_ifFreenameindex(ptr: Long)

    @JvmStatic
    external fun libc_unix_nto_glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_nto_globfree(pglob: Long)

    @JvmStatic
    external fun libc_unix_nto_posixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_nto_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_nto_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_unix_nto_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_nto_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_unix_nto_mkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libc_unix_nto_getdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_nto_setdomainname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_nto_sync()

    @JvmStatic
    external fun libc_unix_nto_pthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_umount(target: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_schedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libc_unix_nto_settimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_nto_schedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_semTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_nto_semGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libc_unix_nto_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_mount(specialDevice: String?, mountDirectory: String?, flags: Int, mountType: String?, mountData: Long, mountDatalen: Int): Int

    @JvmStatic
    external fun libc_unix_nto_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadMutexConsistent(mutex: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadBarrierattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadBarrierattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libc_unix_nto_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_unix_nto_clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_nto_sethostname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_nto_schedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_unix_nto_getgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_nto_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_unix_nto_getdtablesize(): Int

    @JvmStatic
    external fun libc_unix_nto_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_nto_initgroups(user: String?, group: Short): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libc_unix_nto_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_nto_pthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_nto_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_nto_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_nto_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_nto_getpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_nto_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_unix_nto_getgrgid(gid: Short): Long

    @JvmStatic
    external fun libc_unix_nto_getgrouplist(user: String?, group: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadMutexattrGetrobust(attr: Long, robustness: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadMutexattrSetrobust(attr: Long, robustness: Int): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_nto_getitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_nto_setitimer(which: Int, value: Long, ovalue: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_nto_posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libc_unix_nto_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_nto_faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_inotifyRmWatch(fd: Int, wd: Int): Int

    @JvmStatic
    external fun libc_unix_nto_inotifyInit(): Int

    @JvmStatic
    external fun libc_unix_nto_inotifyAddWatch(fd: Int, path: String?, mask: Int): Int

    @JvmStatic
    external fun libc_unix_nto_gettid(): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_nto_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_mallopt(param: Int, value: Long): Int

    @JvmStatic
    external fun libc_unix_nto_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_nto_ctermid(s: Long): Long

    @JvmStatic
    external fun libc_unix_nto_getpwentR(pwd: Long, buf: Long, bufsize: Int, result: Long): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadGetnameNp(thread: Long, name: Long, len: Int): Int

    @JvmStatic
    external fun libc_unix_nto_pthreadSetnameNp(thread: Long, name: String?): Int

    @JvmStatic
    external fun libc_unix_nto_sysctl(arg0: Long, arg1: Int, arg2: Long, arg3: Long, arg4: Long, arg5: Long): Int

    @JvmStatic
    external fun libc_unix_nto_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_nto_setrlimit(resource: Int, rlp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_lioListio(mode: Int, list: Long, nent: Int, sig: Long): Int

    @JvmStatic
    external fun libc_unix_nto_dlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_nto_memsetS(s: Long, smax: Long, c: Int, n: Long): Int

    @JvmStatic
    external fun libc_unix_nto_regcomp(preg: Long, pattern: String?, cflags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_regexec(preg: Long, str: String?, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libc_unix_nto_regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libc_unix_nto_regfree(preg: Long)

    @JvmStatic
    external fun libc_unix_nto_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_aioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_aioError(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_aioFsync(operation: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_aioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_nto_aioReturn(aiocpb: Long): Long

    @JvmStatic
    external fun libc_unix_nto_aioSuspend(list: Long, nent: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_nto_aioWrite(aiocpb: Long): Int

    @JvmStatic
    external fun libc_unix_nto_mqClose(mqdes: Long): Int

    @JvmStatic
    external fun libc_unix_nto_mqGetattr(mqdes: Long, mqstat: Long): Int

    @JvmStatic
    external fun libc_unix_nto_mqNotify(mqdes: Long, notification: Long): Int

    @JvmStatic
    external fun libc_unix_nto_mqReceive(mqdes: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libc_unix_nto_mqSend(mqdes: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libc_unix_nto_mqSetattr(mqdes: Long, mqstat: Long, omqstat: Long): Int

    @JvmStatic
    external fun libc_unix_nto_mqTimedreceive(mqdes: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libc_unix_nto_mqTimedsend(mqdes: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libc_unix_nto_mqUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_nto_getErrnoPtr(): Long

    @JvmStatic
    external fun libc_unix_nto_myThreadExit(valuePtr: Long)
}

private var _ffi_static_SYSPAGE_PTR: COpaquePointer? = null
public actual var SYSPAGE_PTR: COpaquePointer?
    get() = _ffi_static_SYSPAGE_PTR
    set(value) {
        _ffi_static_SYSPAGE_PTR = value
    }

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    UnixNtoJniBridge.libc_unix_nto_sendmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags.toInt())

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_recvmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags.toInt(), (timeout?.value ?: 0L))

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_semDestroy((sem?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixNtoJniBridge.libc_unix_nto_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun fdatasync(fd: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_fdatasync(fd)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixNtoJniBridge.libc_unix_nto_getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_setpriority(which, who, prio)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixNtoJniBridge.libc_unix_nto_mkfifoat(dirfd, pathname, mode.toInt())

public actual fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixNtoJniBridge.libc_unix_nto_mknodat(fd, pathname, mode.toInt(), dev.toInt())

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_clockGetres(clkId, (tp?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_clockSettime(clkId, (tp?.value ?: 0L))

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_clockGetcpuclockid(pid, (clkId?.value ?: 0L))

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    UnixNtoJniBridge.libc_unix_nto_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_setgroups(ngroups, (ptr?.value ?: 0L))

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_futimens(fd, (times?.value ?: 0L))

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    UnixNtoJniBridge.libc_unix_nto_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadCondattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadMutexattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadRwlockattrGetpshared((attr?.value ?: 0L), (value?.value ?: 0L))

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadRwlockattrSetpshared((attr?.value ?: 0L), value)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): COpaquePointer? =
    UnixNtoJniBridge.libc_unix_nto_ptsnameR(fd, (buf?.value ?: 0L), buflen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clearenv(): CInt =
    UnixNtoJniBridge.libc_unix_nto_clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_waitid(idtype.toInt(), id, (infop?.value ?: 0L), options)

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    UnixNtoJniBridge.libc_unix_nto_wait4(pid, (status?.value ?: 0L), options, (rusage?.value ?: 0L))

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_execvpe(file, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_getifaddrs((ifap?.value ?: 0L))

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    UnixNtoJniBridge.libc_unix_nto_freeifaddrs((ifa?.value ?: 0L))
}

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    UnixNtoJniBridge.libc_unix_nto_bind(socket, (address?.value ?: 0L), addressLen.toInt())

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixNtoJniBridge.libc_unix_nto_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixNtoJniBridge.libc_unix_nto_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixNtoJniBridge.libc_unix_nto_sendmsg(fd, (msg?.value ?: 0L), flags)

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixNtoJniBridge.libc_unix_nto_recvmsg(fd, (msg?.value ?: 0L), flags)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixNtoJniBridge.libc_unix_nto_forkpty((amaster?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun loginTty(fd: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_loginTty(fd)

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_uname((buf?.value ?: 0L))

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_getpeereid(socket, (euid?.value ?: 0L), (egid?.value ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixNtoJniBridge.libc_unix_nto_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun abs(i: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_abs(i)

public actual fun labs(i: CLong): CLong =
    UnixNtoJniBridge.libc_unix_nto_labs(i)

public actual fun rand(): CInt =
    UnixNtoJniBridge.libc_unix_nto_rand()

public actual fun srand(seed: CUint) {
    UnixNtoJniBridge.libc_unix_nto_srand(seed.toInt())
}

public actual fun setpwent() {
    UnixNtoJniBridge.libc_unix_nto_setpwent()
}

public actual fun endpwent() {
    UnixNtoJniBridge.libc_unix_nto_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    UnixNtoJniBridge.libc_unix_nto_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgrent() {
    UnixNtoJniBridge.libc_unix_nto_setgrent()
}

public actual fun endgrent() {
    UnixNtoJniBridge.libc_unix_nto_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    UnixNtoJniBridge.libc_unix_nto_getgrent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setspent() {
    UnixNtoJniBridge.libc_unix_nto_setspent()
}

public actual fun endspent() {
    UnixNtoJniBridge.libc_unix_nto_endspent()
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixNtoJniBridge.libc_unix_nto_shmOpen(name, oflag, mode.toInt())

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    UnixNtoJniBridge.libc_unix_nto_ftok(pathname, projId).toUInt()

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixFallocate(fd, offset, len)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_mkostemp((template?.value ?: 0L), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_mkostemps((template?.value ?: 0L), suffixlen, flags)

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_sigwaitinfo((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadSetschedprio(native.toLong(), priority)

public actual fun ifNameindex(): COpaquePointer? =
    UnixNtoJniBridge.libc_unix_nto_ifNameindex().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    UnixNtoJniBridge.libc_unix_nto_ifFreenameindex((ptr?.value ?: 0L))
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: FnCallback?, pglob: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_glob(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree(pglob: COpaquePointer?) {
    UnixNtoJniBridge.libc_unix_nto_globfree((pglob?.value ?: 0L))
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixMadvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun shmUnlink(name: String?): CInt =
    UnixNtoJniBridge.libc_unix_nto_shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    UnixNtoJniBridge.libc_unix_nto_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    UnixNtoJniBridge.libc_unix_nto_telldir((dirp?.handle ?: 0L))

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    UnixNtoJniBridge.libc_unix_nto_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_mkstemps((template?.value ?: 0L), suffixlen)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    UnixNtoJniBridge.libc_unix_nto_getdomainname((name?.value ?: 0L), len.toLong())

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    UnixNtoJniBridge.libc_unix_nto_setdomainname(name, len.toLong())

public actual fun sync() {
    UnixNtoJniBridge.libc_unix_nto_sync()
}

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadGetschedparam(native.toLong(), (policy?.value ?: 0L), (param?.value ?: 0L))

public actual fun umount(target: String?, flags: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_umount(target, flags)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_schedGetPriorityMax(policy)

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_settimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_schedRrGetInterval(pid, (tp?.value ?: 0L))

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_semTimedwait((sem?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_schedSetparam(pid, (param?.value ?: 0L))

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_mount(specialDevice, mountDirectory, flags, mountType, (mountData?.value ?: 0L), mountDatalen)

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_schedGetparam(pid, (param?.value ?: 0L))

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadMutexConsistent((mutex?.value ?: 0L))

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadMutexTimedlock((lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadSpinInit((lock?.value ?: 0L), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadSpinDestroy((lock?.value ?: 0L))

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadSpinLock((lock?.value ?: 0L))

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadSpinTrylock((lock?.value ?: 0L))

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadSpinUnlock((lock?.value ?: 0L))

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadBarrierattrInit((attr?.value ?: 0L))

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadBarrierattrDestroy((attr?.value ?: 0L))

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadBarrierattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadBarrierattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadBarrierInit((barrier?.value ?: 0L), (attr?.value ?: 0L), count.toInt())

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadBarrierDestroy((barrier?.value ?: 0L))

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadBarrierWait((barrier?.value ?: 0L))

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixNtoJniBridge.libc_unix_nto_schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadAttrGetguardsize((attr?.value ?: 0L), (guardsize?.value ?: 0L))

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadAttrSetguardsize((attr?.value ?: 0L), guardsize.toLong())

public actual fun sethostname(name: String?, len: SizeT): CInt =
    UnixNtoJniBridge.libc_unix_nto_sethostname(name, len.toLong())

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_schedGetPriorityMin(policy)

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadCondattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadSetschedparam(native.toLong(), policy, (param?.value ?: 0L))

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_sigsuspend((mask?.value ?: 0L))

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_getgrgidR(gid.toShort(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun semClose(sem: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_semClose((sem?.value ?: 0L))

public actual fun getdtablesize(): CInt =
    UnixNtoJniBridge.libc_unix_nto_getdtablesize()

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun initgroups(user: String?, group: GidT): CInt =
    UnixNtoJniBridge.libc_unix_nto_initgroups(user, group.toShort())

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadSigmask(how, (set?.value ?: 0L), (oldset?.value ?: 0L))

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixNtoJniBridge.libc_unix_nto_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadCancel(thread.toLong())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadKill(thread.toLong(), sig)

public actual fun semUnlink(name: String?): CInt =
    UnixNtoJniBridge.libc_unix_nto_semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_getpwuidR(uid.toShort(), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun pthreadAtfork(prepare: FnCallback1?, parent: FnCallback1?, child: FnCallback1?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixNtoJniBridge.libc_unix_nto_getgrgid(gid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_getgrouplist(user, group.toShort(), (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadMutexattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robustness: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadMutexattrGetrobust((attr?.value ?: 0L), (robustness?.value ?: 0L))

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robustness: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadMutexattrSetrobust((attr?.value ?: 0L), robustness)

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback2, value: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_getitimer(which, (currValue?.value ?: 0L))

public actual fun setitimer(which: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_setitimer(which, (value?.value ?: 0L), (ovalue?.value ?: 0L))

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawn((pid?.value ?: 0L), path, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnp((pid?.value ?: 0L), file, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrInit((attr?.value ?: 0L))

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrDestroy((attr?.value ?: 0L))

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrGetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrSetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrGetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrSetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrGetflags((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrSetflags((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrGetpgroup((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrSetpgroup((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrGetschedpolicy((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrSetschedpolicy((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnattrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnFileActionsInit((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnFileActionsDestroy((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnFileActionsAddopen((actions?.value ?: 0L), fd, path, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnFileActionsAddclose((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_posixSpawnFileActionsAdddup2((actions?.value ?: 0L), fd, newfd)

public actual fun popen(command: String?, mode: String?): FILE? =
    UnixNtoJniBridge.libc_unix_nto_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_faccessat(dirfd, pathname, mode, flags)

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_inotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    UnixNtoJniBridge.libc_unix_nto_inotifyInit()

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_inotifyAddWatch(fd, path, mask.toInt())

public actual fun gettid(): PidT =
    UnixNtoJniBridge.libc_unix_nto_gettid()

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadGetcpuclockid(thread.toLong(), (clkId?.value ?: 0L))

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun mallopt(param: CInt, value: Long): CInt =
    UnixNtoJniBridge.libc_unix_nto_mallopt(param, value)

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    UnixNtoJniBridge.libc_unix_nto_ctermid((s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufsize: CInt, result: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_getpwentR((pwd?.value ?: 0L), (buf?.value ?: 0L), bufsize, (result?.value ?: 0L))

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadGetnameNp(thread.toLong(), (name?.value ?: 0L), len)

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    UnixNtoJniBridge.libc_unix_nto_pthreadSetnameNp(thread.toLong(), name)

public actual fun sysctl(arg0: COpaquePointer?, arg1: CUint, arg2: COpaquePointer?, arg3: COpaquePointer?, arg4: COpaquePointer?, arg5: SizeT): CInt =
    UnixNtoJniBridge.libc_unix_nto_sysctl((arg0?.value ?: 0L), arg1.toInt(), (arg2?.value ?: 0L), (arg3?.value ?: 0L), (arg4?.value ?: 0L), arg5.toLong())

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit(resource: CInt, rlp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_setrlimit(resource, (rlp?.value ?: 0L))

public actual fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_lioListio(mode, (list?.value ?: 0L), nent, (sig?.value ?: 0L))

public actual fun dlIteratePhdr(callback: FnCallback3?, data: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_dlIteratePhdr(0L, (data?.value ?: 0L))

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    UnixNtoJniBridge.libc_unix_nto_memsetS((s?.value ?: 0L), smax.toLong(), c, n.toLong())

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_regcomp((preg?.value ?: 0L), pattern, cflags)

public actual fun regexec(preg: COpaquePointer?, str: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    UnixNtoJniBridge.libc_unix_nto_regexec((preg?.value ?: 0L), str, nmatch.toLong(), (pmatch?.value ?: 0L), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    UnixNtoJniBridge.libc_unix_nto_regerror(errcode, (preg?.value ?: 0L), (errbuf?.value ?: 0L), errbufSize.toLong()).toULong()

public actual fun regfree(preg: COpaquePointer?) {
    UnixNtoJniBridge.libc_unix_nto_regfree((preg?.value ?: 0L))
}

public actual fun dirfd(dirp: DIR?): CInt =
    UnixNtoJniBridge.libc_unix_nto_dirfd((dirp?.handle ?: 0L))

public actual fun dircntl(dir: DIR?, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_aioCancel(fd, (aiocbp?.value ?: 0L))

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_aioError((aiocbp?.value ?: 0L))

public actual fun aioFsync(operation: CInt, aiocbp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_aioFsync(operation, (aiocbp?.value ?: 0L))

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_aioRead((aiocbp?.value ?: 0L))

public actual fun aioReturn(aiocpb: COpaquePointer?): SsizeT =
    UnixNtoJniBridge.libc_unix_nto_aioReturn((aiocpb?.value ?: 0L))

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_aioSuspend((list?.value ?: 0L), nent, (timeout?.value ?: 0L))

public actual fun aioWrite(aiocpb: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_aioWrite((aiocpb?.value ?: 0L))

public actual fun mqClose(mqdes: MqdT): CInt =
    UnixNtoJniBridge.libc_unix_nto_mqClose(mqdes.toLong())

public actual fun mqGetattr(mqdes: MqdT, mqstat: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_mqGetattr(mqdes.toLong(), (mqstat?.value ?: 0L))

public actual fun mqNotify(mqdes: MqdT, notification: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_mqNotify(mqdes.toLong(), (notification?.value ?: 0L))

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    0

public actual fun mqReceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    UnixNtoJniBridge.libc_unix_nto_mqReceive(mqdes.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L))

public actual fun mqSend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixNtoJniBridge.libc_unix_nto_mqSend(mqdes.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt())

public actual fun mqSetattr(mqdes: MqdT, mqstat: COpaquePointer?, omqstat: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_mqSetattr(mqdes.toLong(), (mqstat?.value ?: 0L), (omqstat?.value ?: 0L))

public actual fun mqTimedreceive(mqdes: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    UnixNtoJniBridge.libc_unix_nto_mqTimedreceive(mqdes.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L), (absTimeout?.value ?: 0L))

public actual fun mqTimedsend(mqdes: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    UnixNtoJniBridge.libc_unix_nto_mqTimedsend(mqdes.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt(), (absTimeout?.value ?: 0L))

public actual fun mqUnlink(name: String?): CInt =
    UnixNtoJniBridge.libc_unix_nto_mqUnlink(name)

public actual fun getErrnoPtr(): COpaquePointer? =
    UnixNtoJniBridge.libc_unix_nto_getErrnoPtr().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun myThreadExit(valuePtr: COpaquePointer?) {
    UnixNtoJniBridge.libc_unix_nto_myThreadExit((valuePtr?.value ?: 0L))
}
