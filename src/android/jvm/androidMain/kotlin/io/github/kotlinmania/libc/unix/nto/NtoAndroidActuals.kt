@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNtoJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixNtoGetSYSPAGEPTR(): Long

    @JvmStatic
    external fun libcUnixNtoSetSYSPAGEPTR(value: Long)

    @JvmStatic
    external fun libcUnixNtoSendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoRecvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixNtoSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixNtoSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixNtoFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcUnixNtoGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixNtoSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixNtoMkfifoat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixNtoMknodat(fd: Int, pathname: Long, mode: Int, dev: Int): Int

    @JvmStatic
    external fun libcUnixNtoClockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixNtoClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixNtoClockSettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixNtoClockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixNtoMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixNtoSetgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcUnixNtoFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixNtoNlLanginfo(item: Int): Long

    @JvmStatic
    external fun libcUnixNtoUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixNtoPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libcUnixNtoPthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixNtoPthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixNtoPthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libcUnixNtoPtsnameR(fd: Int, buf: Long, buflen: Long): Long

    @JvmStatic
    external fun libcUnixNtoClearenv(): Int

    @JvmStatic
    external fun libcUnixNtoWaitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixNtoWait4(pid: Int, status: Long, options: Int, rusage: Long): Int

    @JvmStatic
    external fun libcUnixNtoExecvpe(file: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libcUnixNtoFreeifaddrs(ifa: Long)

    @JvmStatic
    external fun libcUnixNtoBind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libcUnixNtoWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixNtoReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixNtoSendmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNtoRecvmsg(fd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNtoOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixNtoForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixNtoLoginTty(fd: Int): Int

    @JvmStatic
    external fun libcUnixNtoUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetpeereid(socket: Int, euid: Long, egid: Long): Int

    @JvmStatic
    external fun libcUnixNtoStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixNtoAbs(i: Int): Int

    @JvmStatic
    external fun libcUnixNtoLabs(i: Long): Long

    @JvmStatic
    external fun libcUnixNtoRand(): Int

    @JvmStatic
    external fun libcUnixNtoSrand(seed: Int)

    @JvmStatic
    external fun libcUnixNtoSetpwent()

    @JvmStatic
    external fun libcUnixNtoEndpwent()

    @JvmStatic
    external fun libcUnixNtoGetpwent(): Long

    @JvmStatic
    external fun libcUnixNtoSetgrent()

    @JvmStatic
    external fun libcUnixNtoEndgrent()

    @JvmStatic
    external fun libcUnixNtoGetgrent(): Long

    @JvmStatic
    external fun libcUnixNtoSetspent()

    @JvmStatic
    external fun libcUnixNtoEndspent()

    @JvmStatic
    external fun libcUnixNtoShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixNtoFtok(pathname: Long, projId: Int): Int

    @JvmStatic
    external fun libcUnixNtoMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixNtoPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixNtoMkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoMkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixNtoSigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadSetschedprio(native: Long, priority: Int): Int

    @JvmStatic
    external fun libcUnixNtoIfNameindex(): Long

    @JvmStatic
    external fun libcUnixNtoIfFreenameindex(ptr: Long)

    @JvmStatic
    external fun libcUnixNtoGlob(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixNtoGlobfree(pglob: Long)

    @JvmStatic
    external fun libcUnixNtoPosixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixNtoShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixNtoSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcUnixNtoTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixNtoMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcUnixNtoMkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libcUnixNtoGetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixNtoSetdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixNtoSync()

    @JvmStatic
    external fun libcUnixNtoPthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoUmount(target: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoSchedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libcUnixNtoSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixNtoSchedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixNtoSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixNtoSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcUnixNtoSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoMount(specialDevice: Long, mountDirectory: Long, flags: Int, mountType: Long, mountData: Long, mountDatalen: Int): Int

    @JvmStatic
    external fun libcUnixNtoSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadMutexConsistent(mutex: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixNtoPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadBarrierattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadBarrierattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixNtoPthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libcUnixNtoPthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libcUnixNtoSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcUnixNtoClockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixNtoSethostname(name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixNtoSchedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libcUnixNtoPthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNtoSemClose(sem: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixNtoGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNtoInitgroups(user: Long, group: Short): Int

    @JvmStatic
    external fun libcUnixNtoPthreadSigmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcUnixNtoSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixNtoGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixNtoPthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixNtoSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixNtoDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixNtoGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixNtoSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixNtoGetgrouplist(user: Long, group: Short, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadMutexattrGetrobust(attr: Long, robustness: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadMutexattrSetrobust(attr: Long, robustness: Int): Int

    @JvmStatic
    external fun libcUnixNtoPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixNtoSetitimer(which: Int, value: Long, ovalue: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnFileActionsAddopen(actions: Long, fd: Int, path: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixNtoPosixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libcUnixNtoPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixNtoFaccessat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoInotifyRmWatch(fd: Int, wd: Int): Int

    @JvmStatic
    external fun libcUnixNtoInotifyInit(): Int

    @JvmStatic
    external fun libcUnixNtoInotifyAddWatch(fd: Int, path: Long, mask: Int): Int

    @JvmStatic
    external fun libcUnixNtoGettid(): Int

    @JvmStatic
    external fun libcUnixNtoPthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixNtoMallopt(param: Int, value: Long): Int

    @JvmStatic
    external fun libcUnixNtoGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixNtoCtermid(s: Long): Long

    @JvmStatic
    external fun libcUnixNtoIoctl(fd: Int, request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetpwentR(pwd: Long, buf: Long, bufsize: Int, result: Long): Int

    @JvmStatic
    external fun libcUnixNtoPthreadGetnameNp(thread: Long, name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixNtoPthreadSetnameNp(thread: Long, name: Long): Int

    @JvmStatic
    external fun libcUnixNtoSysctl(arg0: Long, arg1: Int, arg2: Long, arg3: Long, arg4: Long, arg5: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixNtoSetrlimit(resource: Int, rlp: Long): Int

    @JvmStatic
    external fun libcUnixNtoLioListio(mode: Int, list: Long, nent: Int, sig: Long): Int

    @JvmStatic
    external fun libcUnixNtoDlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libcUnixNtoMemsetS(s: Long, smax: Long, c: Int, n: Long): Int

    @JvmStatic
    external fun libcUnixNtoRegcomp(preg: Long, pattern: Long, cflags: Int): Int

    @JvmStatic
    external fun libcUnixNtoRegexec(preg: Long, str: Long, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libcUnixNtoRegerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libcUnixNtoRegfree(preg: Long)

    @JvmStatic
    external fun libcUnixNtoDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixNtoDircntl(dir: Long, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixNtoAioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixNtoAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixNtoAioFsync(operation: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixNtoAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixNtoAioReturn(aiocpb: Long): Long

    @JvmStatic
    external fun libcUnixNtoAioSuspend(list: Long, nent: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixNtoAioWrite(aiocpb: Long): Int

    @JvmStatic
    external fun libcUnixNtoMqClose(mqdes: Long): Int

    @JvmStatic
    external fun libcUnixNtoMqGetattr(mqdes: Long, mqstat: Long): Int

    @JvmStatic
    external fun libcUnixNtoMqNotify(mqdes: Long, notification: Long): Int

    @JvmStatic
    external fun libcUnixNtoMqOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixNtoMqReceive(mqdes: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libcUnixNtoMqSend(mqdes: Long, msgPtr: Long, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libcUnixNtoMqSetattr(mqdes: Long, mqstat: Long, omqstat: Long): Int

    @JvmStatic
    external fun libcUnixNtoMqTimedreceive(mqdes: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libcUnixNtoMqTimedsend(mqdes: Long, msgPtr: Long, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libcUnixNtoMqUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixNtoGetErrnoPtr(): Long

    @JvmStatic
    external fun libcUnixNtoMyThreadExit(valuePtr: Long)
}

public actual var SYSPAGE_PTR: MutPtr
    get() = MutPtr(UnixNtoJniBridge.libcUnixNtoGetSYSPAGEPTR())
    set(value) {
        UnixNtoJniBridge.libcUnixNtoSetSYSPAGEPTR(value.rawAddress)
    }

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint): CInt =
    UnixNtoJniBridge.libcUnixNtoSendmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags.toInt())

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint, timeout: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoRecvmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags.toInt(), timeout.rawAddress)

public actual fun semDestroy(sem: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSemDestroy(sem.rawAddress)

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    UnixNtoJniBridge.libcUnixNtoSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun fdatasync(fd: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoFdatasync(fd)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixNtoJniBridge.libcUnixNtoGetpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoSetpriority(which, who, prio)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    UnixNtoJniBridge.libcUnixNtoMkfifoat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun mknodat(fd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    UnixNtoJniBridge.libcUnixNtoMknodat(fd, pathname.rawAddress, mode.toInt(), dev.toInt())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoClockGetres(clkId, tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoClockGettime(clkId, tp.rawAddress)

public actual fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoClockSettime(clkId, tp.rawAddress)

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoClockGetcpuclockid(pid, clkId.rawAddress)

public actual fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun memalign(align: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoMemalign(align.toLong(), size.toLong()))

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSetgroups(ngroups, ptr.rawAddress)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoFutimens(fd, times.rawAddress)

public actual fun nlLanginfo(item: NlItem): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoNlLanginfo(item))

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadCondattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadMutexattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadRwlockattrGetpshared(attr.rawAddress, value.rawAddress)

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadRwlockattrSetpshared(attr.rawAddress, value)

public actual fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoPtsnameR(fd, buf.rawAddress, buflen.toLong()))

public actual fun clearenv(): CInt =
    UnixNtoJniBridge.libcUnixNtoClearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoWaitid(idtype.toInt(), id, infop.rawAddress, options)

public actual fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT =
    UnixNtoJniBridge.libcUnixNtoWait4(pid, status.rawAddress, options, rusage.rawAddress)

public actual fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoExecvpe(file.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun getifaddrs(ifap: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGetifaddrs(ifap.rawAddress)

public actual fun freeifaddrs(ifa: MutPtr) {
    UnixNtoJniBridge.libcUnixNtoFreeifaddrs(ifa.rawAddress)
}

public actual fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt =
    UnixNtoJniBridge.libcUnixNtoBind(socket, address.rawAddress, addressLen.toInt())

public actual fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    UnixNtoJniBridge.libcUnixNtoWritev(fd, iov.rawAddress, iovcnt)

public actual fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT =
    UnixNtoJniBridge.libcUnixNtoReadv(fd, iov.rawAddress, iovcnt)

public actual fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT =
    UnixNtoJniBridge.libcUnixNtoSendmsg(fd, msg.rawAddress, flags)

public actual fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT =
    UnixNtoJniBridge.libcUnixNtoRecvmsg(fd, msg.rawAddress, flags)

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    UnixNtoJniBridge.libcUnixNtoForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun loginTty(fd: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoLoginTty(fd)

public actual fun uname(buf: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoUname(buf.rawAddress)

public actual fun getpeereid(socket: CInt, euid: MutPtr, egid: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGetpeereid(socket, euid.rawAddress, egid.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt =
    UnixNtoJniBridge.libcUnixNtoStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun abs(i: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoAbs(i)

public actual fun labs(i: CLong): CLong =
    UnixNtoJniBridge.libcUnixNtoLabs(i)

public actual fun rand(): CInt =
    UnixNtoJniBridge.libcUnixNtoRand()

public actual fun srand(seed: CUint) {
    UnixNtoJniBridge.libcUnixNtoSrand(seed.toInt())
}

public actual fun setpwent() {
    UnixNtoJniBridge.libcUnixNtoSetpwent()
}

public actual fun endpwent() {
    UnixNtoJniBridge.libcUnixNtoEndpwent()
}

public actual fun getpwent(): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoGetpwent())

public actual fun setgrent() {
    UnixNtoJniBridge.libcUnixNtoSetgrent()
}

public actual fun endgrent() {
    UnixNtoJniBridge.libcUnixNtoEndgrent()
}

public actual fun getgrent(): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoGetgrent())

public actual fun setspent() {
    UnixNtoJniBridge.libcUnixNtoSetspent()
}

public actual fun endspent() {
    UnixNtoJniBridge.libcUnixNtoEndspent()
}

public actual fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    UnixNtoJniBridge.libcUnixNtoShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    UnixNtoJniBridge.libcUnixNtoFtok(pathname.rawAddress, projId).toUInt()

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixFallocate(fd, offset, len)

public actual fun mkostemp(template: MutPtr, flags: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoMkostemp(template.rawAddress, flags)

public actual fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoMkostemps(template.rawAddress, suffixlen, flags)

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSigwaitinfo(set.rawAddress, info.rawAddress)

public actual fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadSetschedprio(native.toLong(), priority)

public actual fun ifNameindex(): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoIfNameindex())

public actual fun ifFreenameindex(ptr: MutPtr) {
    UnixNtoJniBridge.libcUnixNtoIfFreenameindex(ptr.rawAddress)
}

public actual fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGlob(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree(pglob: MutPtr) {
    UnixNtoJniBridge.libcUnixNtoGlobfree(pglob.rawAddress)
}

public actual fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun shmUnlink(name: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoShmUnlink(name.rawAddress)

public actual fun seekdir(dirp: MutPtr, loc: CLong) {
    UnixNtoJniBridge.libcUnixNtoSeekdir(dirp.rawAddress, loc)
}

public actual fun telldir(dirp: MutPtr): CLong =
    UnixNtoJniBridge.libcUnixNtoTelldir(dirp.rawAddress)

public actual fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoMsync(addr.rawAddress, len.toLong(), flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    UnixNtoJniBridge.libcUnixNtoRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun mkstemps(template: MutPtr, suffixlen: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoMkstemps(template.rawAddress, suffixlen)

public actual fun getdomainname(name: MutPtr, len: SizeT): CInt =
    UnixNtoJniBridge.libcUnixNtoGetdomainname(name.rawAddress, len.toLong())

public actual fun setdomainname(name: ConstPtr, len: SizeT): CInt =
    UnixNtoJniBridge.libcUnixNtoSetdomainname(name.rawAddress, len.toLong())

public actual fun sync() {
    UnixNtoJniBridge.libcUnixNtoSync()
}

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun umount(target: ConstPtr, flags: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoUmount(target.rawAddress, flags)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoSchedGetPriorityMax(policy)

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSchedRrGetInterval(pid, tp.rawAddress)

public actual fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun schedSetparam(pid: PidT, param: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSchedSetparam(pid, param.rawAddress)

public actual fun mount(specialDevice: ConstPtr, mountDirectory: ConstPtr, flags: CInt, mountType: ConstPtr, mountData: ConstPtr, mountDatalen: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoMount(specialDevice.rawAddress, mountDirectory.rawAddress, flags, mountType.rawAddress, mountData.rawAddress, mountDatalen)

public actual fun schedGetparam(pid: PidT, param: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSchedGetparam(pid, param.rawAddress)

public actual fun pthreadMutexConsistent(mutex: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadMutexConsistent(mutex.rawAddress)

public actual fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadMutexTimedlock(lock.rawAddress, abstime.rawAddress)

public actual fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinDestroy(lock: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinLock(lock: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadSpinUnlock(lock.rawAddress)

public actual fun pthreadBarrierattrInit(attr: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadBarrierattrInit(attr.rawAddress)

public actual fun pthreadBarrierattrDestroy(attr: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadBarrierattrDestroy(attr.rawAddress)

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadBarrierattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr, pshared: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadBarrierattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadBarrierInit(barrier.rawAddress, attr.rawAddress, count.toInt())

public actual fun pthreadBarrierDestroy(barrier: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadBarrierDestroy(barrier.rawAddress)

public actual fun pthreadBarrierWait(barrier: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadBarrierWait(barrier.rawAddress)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixNtoJniBridge.libcUnixNtoSchedGetscheduler(pid)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoClockNanosleep(clkId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun sethostname(name: ConstPtr, len: SizeT): CInt =
    UnixNtoJniBridge.libcUnixNtoSethostname(name.rawAddress, len.toLong())

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoSchedGetPriorityMin(policy)

public actual fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadCondattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun sigsuspend(mask: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSigsuspend(mask.rawAddress)

public actual fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun semClose(sem: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSemClose(sem.rawAddress)

public actual fun getdtablesize(): CInt =
    UnixNtoJniBridge.libcUnixNtoGetdtablesize()

public actual fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun initgroups(user: ConstPtr, group: GidT): CInt =
    UnixNtoJniBridge.libcUnixNtoInitgroups(user.rawAddress, group.toShort())

public actual fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadSigmask(how, set.rawAddress, oldset.rawAddress)

public actual fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun getgrnam(name: ConstPtr): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoGetgrnam(name.rawAddress))

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadCancel(thread.toLong())

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadKill(thread.toLong(), sig)

public actual fun semUnlink(name: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSemUnlink(name.rawAddress)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoDaemon(nochdir, noclose)

public actual fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGetpwuidR(uid.toShort(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSigwait(set.rawAddress, sig.rawAddress)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadAtfork(0L, 0L, 0L)

public actual fun getgrgid(gid: GidT): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoGetgrgid(gid.toShort()))

public actual fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGetgrouplist(user.rawAddress, group.toShort(), groups.rawAddress, ngroups.rawAddress)

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadMutexattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr, robustness: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadMutexattrGetrobust(attr.rawAddress, robustness.rawAddress)

public actual fun pthreadMutexattrSetrobust(attr: MutPtr, robustness: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadMutexattrSetrobust(attr.rawAddress, robustness)

public actual fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun getitimer(which: CInt, currValue: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGetitimer(which, currValue.rawAddress)

public actual fun setitimer(which: CInt, value: ConstPtr, ovalue: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSetitimer(which, value.rawAddress, ovalue.rawAddress)

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrGetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrSetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrGetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrSetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrGetpgroup(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrSetpgroup(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrGetschedpolicy(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrSetschedpolicy(attr.rawAddress, flags)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnattrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnFileActionsInit(actions.rawAddress)

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnFileActionsDestroy(actions.rawAddress)

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnFileActionsAddopen(actions.rawAddress, fd, path.rawAddress, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnFileActionsAddclose(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPosixSpawnFileActionsAdddup2(actions.rawAddress, fd, newfd)

public actual fun popen(command: ConstPtr, mode: ConstPtr): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoPopen(command.rawAddress, mode.rawAddress))

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoFaccessat(dirfd, pathname.rawAddress, mode, flags)

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoInotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    UnixNtoJniBridge.libcUnixNtoInotifyInit()

public actual fun inotifyAddWatch(fd: CInt, path: ConstPtr, mask: UInt): CInt =
    UnixNtoJniBridge.libcUnixNtoInotifyAddWatch(fd, path.rawAddress, mask.toInt())

public actual fun gettid(): PidT =
    UnixNtoJniBridge.libcUnixNtoGettid()

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadGetcpuclockid(thread.toLong(), clkId.rawAddress)

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun mallopt(param: CInt, value: Long): CInt =
    UnixNtoJniBridge.libcUnixNtoMallopt(param, value)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun ctermid(s: MutPtr): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoCtermid(s.rawAddress))

public actual fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    UnixNtoJniBridge.libcUnixNtoIoctl(fd, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, bufsize: CInt, result: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGetpwentR(pwd.rawAddress, buf.rawAddress, bufsize, result.rawAddress)

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadGetnameNp(thread.toLong(), name.rawAddress, len)

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoPthreadSetnameNp(thread.toLong(), name.rawAddress)

public actual fun sysctl(arg0: ConstPtr, arg1: CUint, arg2: MutPtr, arg3: MutPtr, arg4: ConstPtr, arg5: SizeT): CInt =
    UnixNtoJniBridge.libcUnixNtoSysctl(arg0.rawAddress, arg1.toInt(), arg2.rawAddress, arg3.rawAddress, arg4.rawAddress, arg5.toLong())

public actual fun getrlimit(resource: CInt, rlim: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoGetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit(resource: CInt, rlp: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoSetrlimit(resource, rlp.rawAddress)

public actual fun lioListio(mode: CInt, list: ConstPtr, nent: CInt, sig: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoLioListio(mode, list.rawAddress, nent, sig.rawAddress)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoDlIteratePhdr(0L, data.rawAddress)

public actual fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt =
    UnixNtoJniBridge.libcUnixNtoMemsetS(s.rawAddress, smax.toLong(), c, n.toLong())

public actual fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoRegcomp(preg.rawAddress, pattern.rawAddress, cflags)

public actual fun regexec(preg: ConstPtr, str: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt =
    UnixNtoJniBridge.libcUnixNtoRegexec(preg.rawAddress, str.rawAddress, nmatch.toLong(), pmatch.rawAddress, eflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT =
    UnixNtoJniBridge.libcUnixNtoRegerror(errcode, preg.rawAddress, errbuf.rawAddress, errbufSize.toLong()).toULong()

public actual fun regfree(preg: MutPtr) {
    UnixNtoJniBridge.libcUnixNtoRegfree(preg.rawAddress)
}

public actual fun dirfd(dirp: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoDirfd(dirp.rawAddress)

public actual fun dircntl(dir: MutPtr, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixNtoJniBridge.libcUnixNtoDircntl(dir.rawAddress, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoAioCancel(fd, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoAioError(aiocbp.rawAddress)

public actual fun aioFsync(operation: CInt, aiocbp: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoAioFsync(operation, aiocbp.rawAddress)

public actual fun aioRead(aiocbp: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoAioRead(aiocbp.rawAddress)

public actual fun aioReturn(aiocpb: MutPtr): SsizeT =
    UnixNtoJniBridge.libcUnixNtoAioReturn(aiocpb.rawAddress)

public actual fun aioSuspend(list: ConstPtr, nent: CInt, timeout: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoAioSuspend(list.rawAddress, nent, timeout.rawAddress)

public actual fun aioWrite(aiocpb: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoAioWrite(aiocpb.rawAddress)

public actual fun mqClose(mqdes: MqdT): CInt =
    UnixNtoJniBridge.libcUnixNtoMqClose(mqdes.toLong())

public actual fun mqGetattr(mqdes: MqdT, mqstat: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoMqGetattr(mqdes.toLong(), mqstat.rawAddress)

public actual fun mqNotify(mqdes: MqdT, notification: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoMqNotify(mqdes.toLong(), notification.rawAddress)

public actual fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT =
    UnixNtoJniBridge.libcUnixNtoMqOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toInt()

public actual fun mqReceive(mqdes: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT =
    UnixNtoJniBridge.libcUnixNtoMqReceive(mqdes.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress)

public actual fun mqSend(mqdes: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixNtoJniBridge.libcUnixNtoMqSend(mqdes.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt())

public actual fun mqSetattr(mqdes: MqdT, mqstat: ConstPtr, omqstat: MutPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoMqSetattr(mqdes.toLong(), mqstat.rawAddress, omqstat.rawAddress)

public actual fun mqTimedreceive(mqdes: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT =
    UnixNtoJniBridge.libcUnixNtoMqTimedreceive(mqdes.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress, absTimeout.rawAddress)

public actual fun mqTimedsend(mqdes: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoMqTimedsend(mqdes.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt(), absTimeout.rawAddress)

public actual fun mqUnlink(name: ConstPtr): CInt =
    UnixNtoJniBridge.libcUnixNtoMqUnlink(name.rawAddress)

public actual fun getErrnoPtr(): MutPtr =
    MutPtr(UnixNtoJniBridge.libcUnixNtoGetErrnoPtr())

public actual fun myThreadExit(valuePtr: MutPtr) {
    UnixNtoJniBridge.libcUnixNtoMyThreadExit(valuePtr.rawAddress)
}
