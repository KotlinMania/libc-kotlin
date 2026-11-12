@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix

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
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Aiocb
import io.github.kotlinmania.libc.unix.aix.powerpc64.MsqidDs
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadBarrierT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadMutexT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadOnceT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadRwlockT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadSpinlockT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SiginfoT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SigsetT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Stat
import io.github.kotlinmania.libc.unix.aix.powerpc64.Statfs
import io.github.kotlinmania.libc.unix.aix.powerpc64.UcontextT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Utmpx
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixAixJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixAixThrKill(id: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixAixThrSelf(): Long

    @JvmStatic
    external fun libcUnixAixPthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrGetdetachstate(attr: Long, detachstate: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrGetinheritsched(attr: Long, inheritsched: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrGetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrGetschedpolicy(attr: Long, policy: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrGetscope(attr: Long, contentionscope: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrSetinheritsched(attr: Long, inheritsched: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrSetschedpolicy(attr: Long, policy: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrSetscope(attr: Long, contentionscope: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadAttrSetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadBarrierattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadBarrierattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadCreate(thread: Long, attr: Long, startRoutine: Long, arg: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadGetconcurrency(): Int

    @JvmStatic
    external fun libcUnixAixPthreadGetcpuclockid(threadId: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadGetschedparam(thread: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexattrGetprioceiling(attr: Long, prioceiling: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexattrGetprotocol(attr: Long, protocol: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexattrGetrobust(attr: Long, robust: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexattrGettype(attr: Long, type: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexattrSetprioceiling(attr: Long, prioceiling: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexattrSetprotocol(attr: Long, protocol: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexattrSetrobust(attr: Long, robust: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexConsistent(mutex: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexGetprioceiling(mutex: Long, prioceiling: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexSetprioceiling(mutex: Long, prioceiling: Int, oldCeiling: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadMutexTimedlock(mutex: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadOnce(onceControl: Long, initRoutine: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadRwlockattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadRwlockattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadRwlockTimedrdlock(rwlock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadRwlockTimedwrlock(rwlock: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadSetcancelstate(state: Int, oldstate: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadSetcanceltype(type: Int, oldtype: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadSetconcurrency(newLevel: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadSetschedparam(thread: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadSetschedprio(thread: Long, prio: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadSigmask(how: Int, set: Long, oset: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libcUnixAixPthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libcUnixAixPthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libcUnixAixIconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libcUnixAixIconvClose(cd: Long): Int

    @JvmStatic
    external fun libcUnixAixIconvOpen(tocode: Long, fromcode: Long): Long

    @JvmStatic
    external fun libcUnixAixAcct(filename: Long): Int

    @JvmStatic
    external fun libcUnixAixAioCancel(fildes: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixAixAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixAixAioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixAixAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixAixAioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libcUnixAixAioSuspend(list: Long, nent: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixAixAioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixAixBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixAixBind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libcUnixAixBrk(addr: Long): Int

    @JvmStatic
    external fun libcUnixAixClearenv(): Int

    @JvmStatic
    external fun libcUnixAixClockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libcUnixAixClockGetres(clkId: Long, tp: Long): Int

    @JvmStatic
    external fun libcUnixAixClockGettime(clkId: Long, tp: Long): Int

    @JvmStatic
    external fun libcUnixAixClockNanosleep(clkId: Long, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libcUnixAixClockSettime(clockId: Long, tp: Long): Int

    @JvmStatic
    external fun libcUnixAixCreat64(path: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixAixCtermid(s: Long): Long

    @JvmStatic
    external fun libcUnixAixDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixAixDirname(path: Long): Long

    @JvmStatic
    external fun libcUnixAixDrand48(): Double

    @JvmStatic
    external fun libcUnixAixDuplocale(arg1: Long): Long

    @JvmStatic
    external fun libcUnixAixEndgrent()

    @JvmStatic
    external fun libcUnixAixEndmntent(streamp: Long): Int

    @JvmStatic
    external fun libcUnixAixEndpwent()

    @JvmStatic
    external fun libcUnixAixEndutent()

    @JvmStatic
    external fun libcUnixAixEndutxent()

    @JvmStatic
    external fun libcUnixAixErand48(xseed: Long): Double

    @JvmStatic
    external fun libcUnixAixFaccessat(dirfd: Int, pathname: Long, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixAixFattach(fildes: Int, path: Long): Int

    @JvmStatic
    external fun libcUnixAixFdatasync(fd: Int): Int

    @JvmStatic
    external fun libcUnixAixFexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixAixFfs(value: Int): Int

    @JvmStatic
    external fun libcUnixAixFfsl(value: Long): Int

    @JvmStatic
    external fun libcUnixAixFfsll(value: Long): Int

    @JvmStatic
    external fun libcUnixAixFgetgrent(file: Long): Long

    @JvmStatic
    external fun libcUnixAixFgetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcUnixAixFgetpwent(file: Long): Long

    @JvmStatic
    external fun libcUnixAixFopen64(filename: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixAixFreelocale(loc: Long)

    @JvmStatic
    external fun libcUnixAixFreopen64(filename: Long, mode: Long, file: Long): Long

    @JvmStatic
    external fun libcUnixAixFseeko64(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libcUnixAixFsetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libcUnixAixFstat64(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixFstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixFstatfs64(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixFstatvfs64(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixFtello64(stream: Long): Long

    @JvmStatic
    external fun libcUnixAixFtok(path: Long, id: Int): Int

    @JvmStatic
    external fun libcUnixAixFtruncate64(fd: Int, length: Long): Int

    @JvmStatic
    external fun libcUnixAixFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixAixGetcontext(ucp: Long): Int

    @JvmStatic
    external fun libcUnixAixGetdomainname(name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixAixGetdtablesize(): Int

    @JvmStatic
    external fun libcUnixAixGetgrent(): Long

    @JvmStatic
    external fun libcUnixAixGetgrgid(gid: Short): Long

    @JvmStatic
    external fun libcUnixAixGetgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixAixGetgrnam(name: Long): Long

    @JvmStatic
    external fun libcUnixAixGetgrnamR(name: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixAixGetgrset(user: Long): Long

    @JvmStatic
    external fun libcUnixAixGethostid(): Long

    @JvmStatic
    external fun libcUnixAixGetmntent(stream: Long): Long

    @JvmStatic
    external fun libcUnixAixGetnameinfo(sa: Long, salen: Long, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixAixGetpagesize(): Int

    @JvmStatic
    external fun libcUnixAixGetpeereid(socket: Int, euid: Long, egid: Long): Int

    @JvmStatic
    external fun libcUnixAixGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixAixGetpwent(): Long

    @JvmStatic
    external fun libcUnixAixGetpwnamR(name: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixAixGetpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixAixGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixAixGetrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixAixGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixAixGetitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libcUnixAixGetutent(): Long

    @JvmStatic
    external fun libcUnixAixGetutid(u: Long): Long

    @JvmStatic
    external fun libcUnixAixGetutline(u: Long): Long

    @JvmStatic
    external fun libcUnixAixGetutxent(): Long

    @JvmStatic
    external fun libcUnixAixGetutxid(ut: Long): Long

    @JvmStatic
    external fun libcUnixAixGetutxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixAixGlob(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixAixGlobfree(pglob: Long)

    @JvmStatic
    external fun libcUnixAixHasmntopt(mnt: Long, opt: Long): Long

    @JvmStatic
    external fun libcUnixAixHcreate(nelt: Long): Int

    @JvmStatic
    external fun libcUnixAixHdestroy()

    @JvmStatic
    external fun libcUnixAixIfFreenameindex(ptr: Long)

    @JvmStatic
    external fun libcUnixAixIfNameindex(): Long

    @JvmStatic
    external fun libcUnixAixInitgroups(name: Long, basegid: Short): Int

    @JvmStatic
    external fun libcUnixAixIoctl(fildes: Int, request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixAixJrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixAixLcong48(p: Long)

    @JvmStatic
    external fun libcUnixAixLfind(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libcUnixAixLioListio(mode: Int, aiocbList: Long, nent: Int, sevp: Long): Int

    @JvmStatic
    external fun libcUnixAixLoadquery(flags: Int, buf: Long, buflen: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixAixLparGetInfo(command: Int, buf: Long, bufsize: Long): Int

    @JvmStatic
    external fun libcUnixAixLparSetResources(id: Int, resource: Long): Int

    @JvmStatic
    external fun libcUnixAixLrand48(): Long

    @JvmStatic
    external fun libcUnixAixLsearch(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libcUnixAixLseek64(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libcUnixAixLstat64(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixAixMakecontext(ucp: Long, func: Long, argc: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixAixMallopt(param: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixAixMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixAixMemsetS(s: Long, smax: Long, c: Int, n: Long): Int

    @JvmStatic
    external fun libcUnixAixMincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libcUnixAixMkfifoat(dirfd: Int, pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixAixMknodat(dirfd: Int, pathname: Long, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libcUnixAixMount(device: Long, path: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixAixMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixAixMqClose(mqd: Long): Int

    @JvmStatic
    external fun libcUnixAixMqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixAixMqNotify(mqd: Long, notification: Long): Int

    @JvmStatic
    external fun libcUnixAixMqOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixAixMqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libcUnixAixMqSend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libcUnixAixMqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libcUnixAixMqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libcUnixAixMqTimedsend(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libcUnixAixMqUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixAixMrand48(): Long

    @JvmStatic
    external fun libcUnixAixMsgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixMsgget(key: Int, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixAixMsgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libcUnixAixMsgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixAixMsync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixAixNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixAixNlLanginfo(item: Int): Long

    @JvmStatic
    external fun libcUnixAixNlLanginfoL(item: Int, loc: Long): Long

    @JvmStatic
    external fun libcUnixAixNrand48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixAixOpen64(path: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixAixPollsetCreate(maxfd: Int): Int

    @JvmStatic
    external fun libcUnixAixPollsetCtl(ps: Int, pollctlArray: Long, arrayLength: Int): Int

    @JvmStatic
    external fun libcUnixAixPollsetDestroy(ps: Int): Int

    @JvmStatic
    external fun libcUnixAixPollsetPoll(ps: Int, polldataArray: Long, arrayLength: Int, timeout: Int): Int

    @JvmStatic
    external fun libcUnixAixPollsetQuery(ps: Int, pollfdQuery: Long): Int

    @JvmStatic
    external fun libcUnixAixPopen(command: Long, mode: Long): Long

    @JvmStatic
    external fun libcUnixAixPosixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcUnixAixPosixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libcUnixAixPosixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixFallocate64(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnFileActionsAddopen(actions: Long, fd: Int, path: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixAixPosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixAixPread64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixAixPreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixAixPtrace64(request: Int, id: Long, addr: Long, data: Int, buff: Long): Int

    @JvmStatic
    external fun libcUnixAixPututline(u: Long): Long

    @JvmStatic
    external fun libcUnixAixPututxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixAixPwrite64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libcUnixAixPwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixAixQuotactl(cmd: Long, special: Int, id: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixAixRand(): Int

    @JvmStatic
    external fun libcUnixAixReadv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixAixRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcUnixAixRecvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixAixRecvmsg(sockfd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixAixRegcomp(preg: Long, pattern: Long, cflags: Int): Int

    @JvmStatic
    external fun libcUnixAixRegerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libcUnixAixRegexec(preg: Long, input: Long, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libcUnixAixRegfree(preg: Long)

    @JvmStatic
    external fun libcUnixAixSbrk(increment: Long): Long

    @JvmStatic
    external fun libcUnixAixSchedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixAixSchedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libcUnixAixSchedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libcUnixAixSchedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libcUnixAixSchedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixAixSchedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixAixSchedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixAixSctpOptInfo(sd: Int, id: Int, opt: Int, argSize: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixAixSctpPeeloff(s: Int, id: Long): Int

    @JvmStatic
    external fun libcUnixAixSeed48(xseed: Long): Long

    @JvmStatic
    external fun libcUnixAixSeekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libcUnixAixSemClose(sem: Long): Int

    @JvmStatic
    external fun libcUnixAixSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixAixSemGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libcUnixAixSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixAixSemOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixAixSemTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixAixSemUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixAixSemctl(semid: Int, semnum: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixAixSemget(key: Int, nsems: Int, semflag: Int): Int

    @JvmStatic
    external fun libcUnixAixSemop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libcUnixAixSendFile(socket: Long, iobuf: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixAixSendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixAixSendmsg(sockfd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixAixSetcontext(ucp: Long): Int

    @JvmStatic
    external fun libcUnixAixSetdomainname(name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixAixSetgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libcUnixAixSetgrent()

    @JvmStatic
    external fun libcUnixAixSethostid(hostid: Int): Int

    @JvmStatic
    external fun libcUnixAixSethostname(name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixAixSetmntent(filename: Long, ty: Long): Long

    @JvmStatic
    external fun libcUnixAixSetpriority(which: Int, who: Int, priority: Int): Int

    @JvmStatic
    external fun libcUnixAixSetpwent()

    @JvmStatic
    external fun libcUnixAixSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixAixSetrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixAixSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixAixSetitimer(which: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixAixSetutent()

    @JvmStatic
    external fun libcUnixAixSetutxent()

    @JvmStatic
    external fun libcUnixAixSigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libcUnixAixSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcUnixAixSigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixAixSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcUnixAixSigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libcUnixAixShmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libcUnixAixShmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libcUnixAixShmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixShmget(key: Int, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libcUnixAixShmOpen(name: Long, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libcUnixAixShmUnlink(name: Long): Int

    @JvmStatic
    external fun libcUnixAixSplice(socket1: Int, socket2: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixAixSrand(seed: Int)

    @JvmStatic
    external fun libcUnixAixSrand48(seed: Long)

    @JvmStatic
    external fun libcUnixAixStat64(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixStat64at(dirfd: Int, path: Long, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixAixStatfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixStatfs64(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixStatvfs64(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixAixStatx(path: Long, buf: Long, length: Int, command: Int): Int

    @JvmStatic
    external fun libcUnixAixStrcasecmpL(string1: Long, string2: Long, locale: Long): Int

    @JvmStatic
    external fun libcUnixAixStrerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixAixStrftime(arg1: Long, arg2: Long, arg3: Long, arg4: Long): Long

    @JvmStatic
    external fun libcUnixAixStrncasecmpL(string1: Long, string2: Long, length: Long, locale: Long): Int

    @JvmStatic
    external fun libcUnixAixStrptime(s: Long, format: Long, tm: Long): Long

    @JvmStatic
    external fun libcUnixAixStrsep(string: Long, delim: Long): Long

    @JvmStatic
    external fun libcUnixAixSwapcontext(uocp: Long, ucp: Long): Int

    @JvmStatic
    external fun libcUnixAixSwapoff(path: Long): Int

    @JvmStatic
    external fun libcUnixAixSwapon(path: Long): Int

    @JvmStatic
    external fun libcUnixAixSync()

    @JvmStatic
    external fun libcUnixAixTelldir(dirp: Long): Long

    @JvmStatic
    external fun libcUnixAixTimerCreate(clockid: Long, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libcUnixAixTimerDelete(timerid: Long): Int

    @JvmStatic
    external fun libcUnixAixTimerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libcUnixAixTimerGettime(timerid: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixAixTimerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libcUnixAixTruncate64(path: Long, length: Long): Int

    @JvmStatic
    external fun libcUnixAixUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixAixUpdwtmp(file: Long, u: Long)

    @JvmStatic
    external fun libcUnixAixUselocale(loc: Long): Long

    @JvmStatic
    external fun libcUnixAixUtmpname(file: Long): Int

    @JvmStatic
    external fun libcUnixAixUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixAixWait4(pid: Int, status: Long, options: Int, rusage: Long): Int

    @JvmStatic
    external fun libcUnixAixWaitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixAixWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcUnixAixErrno(): Long
}

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    UnixAixJniBridge.libcUnixAixThrKill(id.toLong(), sig)

public actual fun thrSelf(): ThreadT =
    UnixAixJniBridge.libcUnixAixThrSelf().toUInt()

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAtfork(0L, 0L, 0L)

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrGetdetachstate(attr.rawAddress, detachstate.rawAddress)

public actual fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrGetguardsize(attr.rawAddress, guardsize.rawAddress)

public actual fun pthreadAttrGetinheritsched(attr: ConstPtr<PthreadAttrT>, inheritsched: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrGetinheritsched(attr.rawAddress, inheritsched.rawAddress)

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrGetstackaddr(attr.rawAddress, stackaddr.rawAddress)

public actual fun pthreadAttrGetschedpolicy(attr: ConstPtr<PthreadAttrT>, policy: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrGetschedpolicy(attr.rawAddress, policy.rawAddress)

public actual fun pthreadAttrGetscope(attr: ConstPtr<PthreadAttrT>, contentionscope: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrGetscope(attr.rawAddress, contentionscope.rawAddress)

public actual fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrGetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.rawAddress)

public actual fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrSetguardsize(attr.rawAddress, guardsize.toLong())

public actual fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrSetinheritsched(attr.rawAddress, inheritsched)

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrSetschedpolicy(attr.rawAddress, policy)

public actual fun pthreadAttrSetscope(attr: MutPtr<PthreadAttrT>, contentionscope: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrSetscope(attr.rawAddress, contentionscope)

public actual fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrSetstack(attr.rawAddress, stackaddr.rawAddress, stacksize.toLong())

public actual fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadAttrSetstackaddr(attr.rawAddress, stackaddr.rawAddress)

public actual fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadBarrierattrDestroy(attr.rawAddress)

public actual fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, pshared: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadBarrierattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadBarrierattrInit(attr.rawAddress)

public actual fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, pshared: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadBarrierattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadBarrierDestroy(barrier.rawAddress)

public actual fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt =
    UnixAixJniBridge.libcUnixAixPthreadBarrierInit(barrier.rawAddress, attr.rawAddress, count.toInt())

public actual fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadBarrierWait(barrier.rawAddress)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixAixJniBridge.libcUnixAixPthreadCancel(thread.toLong())

public actual fun pthreadCleanupPop(execute: CInt) {}

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: MutPtr<CVoid>) {}

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadCondattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    UnixAixJniBridge.libcUnixAixPthreadCondattrSetclock(attr.rawAddress, clockId)

public actual fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadCondattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadCreate(thread.rawAddress, attr.rawAddress, 0L, arg.rawAddress)

public actual fun pthreadGetconcurrency(): CInt =
    UnixAixJniBridge.libcUnixAixPthreadGetconcurrency()

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: MutPtr<ClockidT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadGetcpuclockid(threadId.toLong(), clockId.rawAddress)

public actual fun pthreadGetschedparam(thread: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadGetschedparam(thread.toLong(), policy.rawAddress, param.rawAddress)

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadKill(thread.toLong(), sig)

public actual fun pthreadMutexattrGetprioceiling(attr: ConstPtr<PthreadMutexattrT>, prioceiling: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexattrGetprioceiling(attr.rawAddress, prioceiling.rawAddress)

public actual fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexattrGetprotocol(attr.rawAddress, protocol.rawAddress)

public actual fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexattrGetrobust(attr.rawAddress, robust.rawAddress)

public actual fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, type: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexattrGettype(attr.rawAddress, type.rawAddress)

public actual fun pthreadMutexattrSetprioceiling(attr: MutPtr<PthreadMutexattrT>, prioceiling: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexattrSetprioceiling(attr.rawAddress, prioceiling)

public actual fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexattrSetprotocol(attr.rawAddress, protocol)

public actual fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexattrSetrobust(attr.rawAddress, robust)

public actual fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexConsistent(mutex.rawAddress)

public actual fun pthreadMutexGetprioceiling(mutex: ConstPtr<PthreadMutexT>, prioceiling: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexGetprioceiling(mutex.rawAddress, prioceiling.rawAddress)

public actual fun pthreadMutexSetprioceiling(mutex: MutPtr<PthreadMutexT>, prioceiling: CInt, oldCeiling: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexSetprioceiling(mutex.rawAddress, prioceiling, oldCeiling.rawAddress)

public actual fun pthreadMutexTimedlock(mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadMutexTimedlock(mutex.rawAddress, abstime.rawAddress)

public actual fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    UnixAixJniBridge.libcUnixAixPthreadOnce(onceControl.rawAddress, 0L)

public actual fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, pshared: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadRwlockattrGetpshared(attr.rawAddress, pshared.rawAddress)

public actual fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, pshared: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadRwlockattrSetpshared(attr.rawAddress, pshared)

public actual fun pthreadRwlockTimedrdlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadRwlockTimedrdlock(rwlock.rawAddress, abstime.rawAddress)

public actual fun pthreadRwlockTimedwrlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadRwlockTimedwrlock(rwlock.rawAddress, abstime.rawAddress)

public actual fun pthreadSetcancelstate(state: CInt, oldstate: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSetcancelstate(state, oldstate.rawAddress)

public actual fun pthreadSetcanceltype(type: CInt, oldtype: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSetcanceltype(type, oldtype.rawAddress)

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSetconcurrency(newLevel)

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSetschedparam(thread.toLong(), policy, param.rawAddress)

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSetschedprio(thread.toLong(), prio)

public actual fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oset: MutPtr<SigsetT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSigmask(how, set.rawAddress, oset.rawAddress)

public actual fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSpinDestroy(lock.rawAddress)

public actual fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSpinInit(lock.rawAddress, pshared)

public actual fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSpinLock(lock.rawAddress)

public actual fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSpinTrylock(lock.rawAddress)

public actual fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt =
    UnixAixJniBridge.libcUnixAixPthreadSpinUnlock(lock.rawAddress)

public actual fun pthreadTestcancel() {}

public actual fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT =
    UnixAixJniBridge.libcUnixAixIconv(cd.rawAddress, inbuf.rawAddress, inbytesleft.rawAddress, outbuf.rawAddress, outbytesleft.rawAddress).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixAixJniBridge.libcUnixAixIconvClose(cd.rawAddress)

public actual fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT =
    MutPtr(UnixAixJniBridge.libcUnixAixIconvOpen(tocode.rawAddress, fromcode.rawAddress))

public actual fun acct(filename: MutPtr<CChar>): CInt =
    UnixAixJniBridge.libcUnixAixAcct(filename.rawAddress)

public actual fun aioCancel(fildes: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    UnixAixJniBridge.libcUnixAixAioCancel(fildes, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr<Aiocb>): CInt =
    UnixAixJniBridge.libcUnixAixAioError(aiocbp.rawAddress)

public actual fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt =
    UnixAixJniBridge.libcUnixAixAioFsync(op, aiocbp.rawAddress)

public actual fun aioRead(aiocbp: MutPtr<Aiocb>): CInt =
    UnixAixJniBridge.libcUnixAixAioRead(aiocbp.rawAddress)

public actual fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT =
    UnixAixJniBridge.libcUnixAixAioReturn(aiocbp.rawAddress)

public actual fun aioSuspend(list: ConstPtr<ConstPtr<Aiocb>>, nent: CInt, timeout: ConstPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixAioSuspend(list.rawAddress, nent, timeout.rawAddress)

public actual fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt =
    UnixAixJniBridge.libcUnixAixAioWrite(aiocbp.rawAddress)

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixAixJniBridge.libcUnixAixBasename(path.rawAddress))

public actual fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt =
    UnixAixJniBridge.libcUnixAixBind(socket, address.rawAddress, addressLen.toInt())

public actual fun brk(addr: MutPtr<CVoid>): CInt =
    UnixAixJniBridge.libcUnixAixBrk(addr.rawAddress)

public actual fun clearenv(): CInt =
    UnixAixJniBridge.libcUnixAixClearenv()

public actual fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt =
    UnixAixJniBridge.libcUnixAixClockGetcpuclockid(pid, clkId.rawAddress)

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixClockGetres(clkId, tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixClockGettime(clkId, tp.rawAddress)

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixClockNanosleep(clkId, flags, rqtp.rawAddress, rmtp.rawAddress)

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixClockSettime(clockId, tp.rawAddress)

public actual fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixAixJniBridge.libcUnixAixCreat64(path.rawAddress, mode.toInt())

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixAixJniBridge.libcUnixAixCtermid(s.rawAddress))

public actual fun dirfd(dirp: MutPtr<DIR>): CInt =
    UnixAixJniBridge.libcUnixAixDirfd(dirp.rawAddress)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixAixJniBridge.libcUnixAixDirname(path.rawAddress))

public actual fun drand48(): CDouble =
    UnixAixJniBridge.libcUnixAixDrand48()

public actual fun duplocale(arg1: LocaleT): LocaleT =
    MutPtr(UnixAixJniBridge.libcUnixAixDuplocale(arg1.rawAddress))

public actual fun endgrent() {
    UnixAixJniBridge.libcUnixAixEndgrent()
}

public actual fun endmntent(streamp: MutPtr<FILE>): CInt =
    UnixAixJniBridge.libcUnixAixEndmntent(streamp.rawAddress)

public actual fun endpwent() {
    UnixAixJniBridge.libcUnixAixEndpwent()
}

public actual fun endutent() {
    UnixAixJniBridge.libcUnixAixEndutent()
}

public actual fun endutxent() {
    UnixAixJniBridge.libcUnixAixEndutxent()
}

public actual fun erand48(xseed: MutPtr<CUshort>): CDouble =
    UnixAixJniBridge.libcUnixAixErand48(xseed.rawAddress)

public actual fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt =
    UnixAixJniBridge.libcUnixAixFaccessat(dirfd, pathname.rawAddress, mode, flags)

public actual fun fattach(fildes: CInt, path: ConstPtr<CChar>): CInt =
    UnixAixJniBridge.libcUnixAixFattach(fildes, path.rawAddress)

public actual fun fdatasync(fd: CInt): CInt =
    UnixAixJniBridge.libcUnixAixFdatasync(fd)

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixAixJniBridge.libcUnixAixFexecve(fd, argv.rawAddress, envp.rawAddress)

public actual fun ffs(value: CInt): CInt =
    UnixAixJniBridge.libcUnixAixFfs(value)

public actual fun ffsl(value: CLong): CInt =
    UnixAixJniBridge.libcUnixAixFfsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    UnixAixJniBridge.libcUnixAixFfsll(value)

public actual fun fgetgrent(file: MutPtr<FILE>): MutPtr<Group> =
    MutPtr(UnixAixJniBridge.libcUnixAixFgetgrent(file.rawAddress))

public actual fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt =
    UnixAixJniBridge.libcUnixAixFgetpos64(stream.rawAddress, ptr.rawAddress)

public actual fun fgetpwent(file: MutPtr<FILE>): MutPtr<Passwd> =
    MutPtr(UnixAixJniBridge.libcUnixAixFgetpwent(file.rawAddress))

public actual fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(UnixAixJniBridge.libcUnixAixFopen64(filename.rawAddress, mode.rawAddress))

public actual fun freelocale(loc: LocaleT) {
    UnixAixJniBridge.libcUnixAixFreelocale(loc.rawAddress)
}

public actual fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE> =
    MutPtr(UnixAixJniBridge.libcUnixAixFreopen64(filename.rawAddress, mode.rawAddress, file.rawAddress))

public actual fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt =
    UnixAixJniBridge.libcUnixAixFseeko64(stream.rawAddress, offset, whence)

public actual fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt =
    UnixAixJniBridge.libcUnixAixFsetpos64(stream.rawAddress, ptr.rawAddress)

public actual fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt =
    UnixAixJniBridge.libcUnixAixFstat64(fildes, buf.rawAddress)

public actual fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt =
    UnixAixJniBridge.libcUnixAixFstatfs(fd, buf.rawAddress)

public actual fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt =
    UnixAixJniBridge.libcUnixAixFstatfs64(fd, buf.rawAddress)

public actual fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt =
    UnixAixJniBridge.libcUnixAixFstatvfs64(fd, buf.rawAddress)

public actual fun ftello64(stream: MutPtr<FILE>): Off64T =
    UnixAixJniBridge.libcUnixAixFtello64(stream.rawAddress)

public actual fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT =
    UnixAixJniBridge.libcUnixAixFtok(path.rawAddress, id)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    UnixAixJniBridge.libcUnixAixFtruncate64(fd, length)

public actual fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixFutimens(fd, times.rawAddress)

public actual fun getcontext(ucp: MutPtr<UcontextT>): CInt =
    UnixAixJniBridge.libcUnixAixGetcontext(ucp.rawAddress)

public actual fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt =
    UnixAixJniBridge.libcUnixAixGetdomainname(name.rawAddress, len)

public actual fun getdtablesize(): CInt =
    UnixAixJniBridge.libcUnixAixGetdtablesize()

public actual fun getgrent(): MutPtr<Group> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetgrent())

public actual fun getgrgid(gid: GidT): MutPtr<Group> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetgrgid(gid.toShort()))

public actual fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixAixJniBridge.libcUnixAixGetgrgidR(gid.toShort(), grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetgrnam(name.rawAddress))

public actual fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    UnixAixJniBridge.libcUnixAixGetgrnamR(name.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrset(user: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetgrset(user.rawAddress))

public actual fun gethostid(): CLong =
    UnixAixJniBridge.libcUnixAixGethostid()

public actual fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetmntent(stream.rawAddress))

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SizeT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt =
    UnixAixJniBridge.libcUnixAixGetnameinfo(sa.rawAddress, salen.toLong(), host.rawAddress, hostlen.toLong(), serv.rawAddress, servlen.toLong(), flags)

public actual fun getpagesize(): CInt =
    UnixAixJniBridge.libcUnixAixGetpagesize()

public actual fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt =
    UnixAixJniBridge.libcUnixAixGetpeereid(socket, euid.rawAddress, egid.rawAddress)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixAixJniBridge.libcUnixAixGetpriority(which, who.toInt())

public actual fun getpwent(): MutPtr<Passwd> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetpwent())

public actual fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixAixJniBridge.libcUnixAixGetpwnamR(name.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    UnixAixJniBridge.libcUnixAixGetpwuidR(uid.toShort(), pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt =
    UnixAixJniBridge.libcUnixAixGetrlimit(resource, rlim.rawAddress)

public actual fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt =
    UnixAixJniBridge.libcUnixAixGetrlimit64(resource, rlim.rawAddress)

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt =
    UnixAixJniBridge.libcUnixAixGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt =
    UnixAixJniBridge.libcUnixAixGetitimer(which, currValue.rawAddress)

public actual fun getutent(): MutPtr<Utmp> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetutent())

public actual fun getutid(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetutid(u.rawAddress))

public actual fun getutline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetutline(u.rawAddress))

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetutxent())

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixAixJniBridge.libcUnixAixGetutxline(ut.rawAddress))

public actual fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt =
    UnixAixJniBridge.libcUnixAixGlob(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree(pglob: MutPtr<GlobT>) {
    UnixAixJniBridge.libcUnixAixGlobfree(pglob.rawAddress)
}

public actual fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixAixJniBridge.libcUnixAixHasmntopt(mnt.rawAddress, opt.rawAddress))

public actual fun hcreate(nelt: SizeT): CInt =
    UnixAixJniBridge.libcUnixAixHcreate(nelt.toLong())

public actual fun hdestroy() {
    UnixAixJniBridge.libcUnixAixHdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): MutPtr<Entry> =
    MutPtr(0L)

public actual fun ifFreenameindex(ptr: MutPtr<IfNameindex>) {
    UnixAixJniBridge.libcUnixAixIfFreenameindex(ptr.rawAddress)
}

public actual fun ifNameindex(): MutPtr<IfNameindex> =
    MutPtr(UnixAixJniBridge.libcUnixAixIfNameindex())

public actual fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt =
    UnixAixJniBridge.libcUnixAixInitgroups(name.rawAddress, basegid.toShort())

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    UnixAixJniBridge.libcUnixAixIoctl(fildes, request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun jrand48(xseed: MutPtr<CUshort>): CLong =
    UnixAixJniBridge.libcUnixAixJrand48(xseed.rawAddress)

public actual fun lcong48(p: MutPtr<CUshort>) {
    UnixAixJniBridge.libcUnixAixLcong48(p.rawAddress)
}

public actual fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid> =
    MutPtr(UnixAixJniBridge.libcUnixAixLfind(key.rawAddress, base.rawAddress, nelp.rawAddress, width.toLong(), 0L))

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nent: CInt, sevp: MutPtr<Sigevent>): CInt =
    UnixAixJniBridge.libcUnixAixLioListio(mode, aiocbList.rawAddress, nent, sevp.rawAddress)

public actual fun loadquery(flags: CInt, buf: MutPtr<CVoid>, buflen: CUint, vararg variadicArgs: Long): CInt =
    UnixAixJniBridge.libcUnixAixLoadquery(flags, buf.rawAddress, buflen.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun lparGetInfo(command: CInt, buf: MutPtr<CVoid>, bufsize: SizeT): CInt =
    UnixAixJniBridge.libcUnixAixLparGetInfo(command, buf.rawAddress, bufsize.toLong())

public actual fun lparSetResources(id: CInt, resource: MutPtr<CVoid>): CInt =
    UnixAixJniBridge.libcUnixAixLparSetResources(id, resource.rawAddress)

public actual fun lrand48(): CLong =
    UnixAixJniBridge.libcUnixAixLrand48()

public actual fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid> =
    MutPtr(UnixAixJniBridge.libcUnixAixLsearch(key.rawAddress, base.rawAddress, nelp.rawAddress, width.toLong(), 0L))

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    UnixAixJniBridge.libcUnixAixLseek64(fd, offset, whence)

public actual fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    UnixAixJniBridge.libcUnixAixLstat64(path.rawAddress, buf.rawAddress)

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    UnixAixJniBridge.libcUnixAixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun makecontext(ucp: MutPtr<UcontextT>, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long) {
    UnixAixJniBridge.libcUnixAixMakecontext(ucp.rawAddress, 0L, argc, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    UnixAixJniBridge.libcUnixAixMallopt(param, value)

public actual fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid> =
    MutPtr(UnixAixJniBridge.libcUnixAixMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt =
    UnixAixJniBridge.libcUnixAixMemsetS(s.rawAddress, smax.toLong(), c, n.toLong())

public actual fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr<CChar>): CInt =
    UnixAixJniBridge.libcUnixAixMincore(addr.rawAddress, len.toLong(), vec.rawAddress)

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt =
    UnixAixJniBridge.libcUnixAixMkfifoat(dirfd, pathname.rawAddress, mode.toInt())

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt =
    UnixAixJniBridge.libcUnixAixMknodat(dirfd, pathname.rawAddress, mode.toInt(), dev.toLong())

public actual fun mount(device: ConstPtr<CChar>, path: ConstPtr<CChar>, flags: CInt): CInt =
    UnixAixJniBridge.libcUnixAixMount(device.rawAddress, path.rawAddress, flags)

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixAixJniBridge.libcUnixAixMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun mqClose(mqd: MqdT): CInt =
    UnixAixJniBridge.libcUnixAixMqClose(mqd.toLong())

public actual fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt =
    UnixAixJniBridge.libcUnixAixMqGetattr(mqd.toLong(), attr.rawAddress)

public actual fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt =
    UnixAixJniBridge.libcUnixAixMqNotify(mqd.toLong(), notification.rawAddress)

public actual fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT =
    UnixAixJniBridge.libcUnixAixMqOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L).toInt()

public actual fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT =
    UnixAixJniBridge.libcUnixAixMqReceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress)

public actual fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixAixJniBridge.libcUnixAixMqSend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt())

public actual fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt =
    UnixAixJniBridge.libcUnixAixMqSetattr(mqd.toLong(), newattr.rawAddress, oldattr.rawAddress)

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT =
    UnixAixJniBridge.libcUnixAixMqTimedreceive(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.rawAddress, absTimeout.rawAddress)

public actual fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixMqTimedsend(mqd.toLong(), msgPtr.rawAddress, msgLen.toLong(), msgPrio.toInt(), absTimeout.rawAddress)

public actual fun mqUnlink(name: ConstPtr<CChar>): CInt =
    UnixAixJniBridge.libcUnixAixMqUnlink(name.rawAddress)

public actual fun mrand48(): CLong =
    UnixAixJniBridge.libcUnixAixMrand48()

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt =
    UnixAixJniBridge.libcUnixAixMsgctl(msqid, cmd, buf.rawAddress)

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    UnixAixJniBridge.libcUnixAixMsgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixAixJniBridge.libcUnixAixMsgrcv(msqid, msgp.rawAddress, msgsz.toLong(), msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt =
    UnixAixJniBridge.libcUnixAixMsgsnd(msqid, msgp.rawAddress, msgsz.toLong(), msgflg)

public actual fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt =
    UnixAixJniBridge.libcUnixAixMsync(addr.rawAddress, len.toLong(), flags)

public actual fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT =
    MutPtr(UnixAixJniBridge.libcUnixAixNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun nlLanginfo(item: NlItem): MutPtr<CChar> =
    MutPtr(UnixAixJniBridge.libcUnixAixNlLanginfo(item))

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar> =
    MutPtr(UnixAixJniBridge.libcUnixAixNlLanginfoL(item, loc.rawAddress))

public actual fun nrand48(xseed: MutPtr<CUshort>): CLong =
    UnixAixJniBridge.libcUnixAixNrand48(xseed.rawAddress)

public actual fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixAixJniBridge.libcUnixAixOpen64(path.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    UnixAixJniBridge.libcUnixAixPollsetCreate(maxfd)

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: MutPtr<PollCtl>, arrayLength: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPollsetCtl(ps, pollctlArray.rawAddress, arrayLength)

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    UnixAixJniBridge.libcUnixAixPollsetDestroy(ps)

public actual fun pollsetPoll(ps: PollsetT, polldataArray: MutPtr<Pollfd>, arrayLength: CInt, timeout: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPollsetPoll(ps, polldataArray.rawAddress, arrayLength, timeout)

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: MutPtr<Pollfd>): CInt =
    UnixAixJniBridge.libcUnixAixPollsetQuery(ps, pollfdQuery.rawAddress)

public actual fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(UnixAixJniBridge.libcUnixAixPopen(command.rawAddress, mode.rawAddress))

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPosixFadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPosixFadvise64(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixAixJniBridge.libcUnixAixPosixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    UnixAixJniBridge.libcUnixAixPosixFallocate64(fd, offset, len)

public actual fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPosixMadvise(addr.rawAddress, len.toLong(), advice)

public actual fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnFileActionsAddclose(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnFileActionsAdddup2(actions.rawAddress, fd, newfd)

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnFileActionsAddopen(actions.rawAddress, fd, path.rawAddress, oflag, mode.toInt())

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnFileActionsDestroy(actions.rawAddress)

public actual fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnFileActionsInit(actions.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrGetpgroup(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrGetschedpolicy(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrGetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrGetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrSetpgroup(attr.rawAddress, flags)

public actual fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrSetschedpolicy(attr.rawAddress, flags)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrSetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnattrSetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt =
    UnixAixJniBridge.libcUnixAixPosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    UnixAixJniBridge.libcUnixAixPread64(fd, buf.rawAddress, count.toLong(), offset)

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT =
    UnixAixJniBridge.libcUnixAixPreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixPtrace64(request, id, addr, data, buff.rawAddress)

public actual fun pututline(u: ConstPtr<Utmp>): MutPtr<Utmp> =
    MutPtr(UnixAixJniBridge.libcUnixAixPututline(u.rawAddress))

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(UnixAixJniBridge.libcUnixAixPututxline(ut.rawAddress))

public actual fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT =
    UnixAixJniBridge.libcUnixAixPwrite64(fd, buf.rawAddress, count.toLong(), offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT =
    UnixAixJniBridge.libcUnixAixPwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun quotactl(cmd: MutPtr<CChar>, special: CInt, id: CInt, data: CaddrT): CInt =
    UnixAixJniBridge.libcUnixAixQuotactl(cmd.rawAddress, special, id, data.rawAddress)

public actual fun rand(): CInt =
    UnixAixJniBridge.libcUnixAixRand()

public actual fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixAixJniBridge.libcUnixAixReadv(fd, iov.rawAddress, iovcnt)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    UnixAixJniBridge.libcUnixAixRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixRecvmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags, timeout.rawAddress)

public actual fun recvmsg(sockfd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT =
    UnixAixJniBridge.libcUnixAixRecvmsg(sockfd, msg.rawAddress, flags)

public actual fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt =
    UnixAixJniBridge.libcUnixAixRegcomp(preg.rawAddress, pattern.rawAddress, cflags)

public actual fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT =
    UnixAixJniBridge.libcUnixAixRegerror(errcode, preg.rawAddress, errbuf.rawAddress, errbufSize.toLong()).toULong()

public actual fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt =
    UnixAixJniBridge.libcUnixAixRegexec(preg.rawAddress, input.rawAddress, nmatch.toLong(), pmatch.rawAddress, eflags)

public actual fun regfree(preg: MutPtr<RegexT>) {
    UnixAixJniBridge.libcUnixAixRegfree(preg.rawAddress)
}

public actual fun sbrk(increment: IntptrT): MutPtr<CVoid> =
    MutPtr(UnixAixJniBridge.libcUnixAixSbrk(increment))

public actual fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt =
    UnixAixJniBridge.libcUnixAixSchedGetparam(pid, param.rawAddress)

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixAixJniBridge.libcUnixAixSchedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixAixJniBridge.libcUnixAixSchedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixAixJniBridge.libcUnixAixSchedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixSchedRrGetInterval(pid, tp.rawAddress)

public actual fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt =
    UnixAixJniBridge.libcUnixAixSchedSetparam(pid, param.rawAddress)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixAixJniBridge.libcUnixAixSchedSetscheduler(pid, policy, param.rawAddress)

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: MutPtr<CVoid>, size: MutPtr<SizeT>): CInt =
    UnixAixJniBridge.libcUnixAixSctpOptInfo(sd, id.toInt(), opt, argSize.rawAddress, size.rawAddress)

public actual fun sctpPeeloff(s: CInt, id: MutPtr<CUint>): CInt =
    UnixAixJniBridge.libcUnixAixSctpPeeloff(s, id.rawAddress)

public actual fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort> =
    MutPtr(UnixAixJniBridge.libcUnixAixSeed48(xseed.rawAddress))

public actual fun seekdir(dirp: MutPtr<DIR>, loc: CLong) {
    UnixAixJniBridge.libcUnixAixSeekdir(dirp.rawAddress, loc)
}

public actual fun semClose(sem: MutPtr<SemT>): CInt =
    UnixAixJniBridge.libcUnixAixSemClose(sem.rawAddress)

public actual fun semDestroy(sem: MutPtr<SemT>): CInt =
    UnixAixJniBridge.libcUnixAixSemDestroy(sem.rawAddress)

public actual fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixSemGetvalue(sem.rawAddress, sval.rawAddress)

public actual fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt =
    UnixAixJniBridge.libcUnixAixSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT> =
    MutPtr(UnixAixJniBridge.libcUnixAixSemOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L))

public actual fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixSemTimedwait(sem.rawAddress, abstime.rawAddress)

public actual fun semUnlink(name: ConstPtr<CChar>): CInt =
    UnixAixJniBridge.libcUnixAixSemUnlink(name.rawAddress)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixAixJniBridge.libcUnixAixSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    UnixAixJniBridge.libcUnixAixSemget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt =
    UnixAixJniBridge.libcUnixAixSemop(semid, sops.rawAddress, nsops.toLong())

public actual fun sendFile(socket: MutPtr<CInt>, iobuf: MutPtr<SfParms>, flags: CUint): SsizeT =
    UnixAixJniBridge.libcUnixAixSendFile(socket.rawAddress, iobuf.rawAddress, flags.toInt())

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    UnixAixJniBridge.libcUnixAixSendmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags)

public actual fun sendmsg(sockfd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT =
    UnixAixJniBridge.libcUnixAixSendmsg(sockfd, msg.rawAddress, flags)

public actual fun setcontext(ucp: ConstPtr<UcontextT>): CInt =
    UnixAixJniBridge.libcUnixAixSetcontext(ucp.rawAddress)

public actual fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt =
    UnixAixJniBridge.libcUnixAixSetdomainname(name.rawAddress, len)

public actual fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt =
    UnixAixJniBridge.libcUnixAixSetgroups(ngroups, ptr.rawAddress)

public actual fun setgrent() {
    UnixAixJniBridge.libcUnixAixSetgrent()
}

public actual fun sethostid(hostid: CInt): CInt =
    UnixAixJniBridge.libcUnixAixSethostid(hostid)

public actual fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt =
    UnixAixJniBridge.libcUnixAixSethostname(name.rawAddress, len)

public actual fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE> =
    MutPtr(UnixAixJniBridge.libcUnixAixSetmntent(filename.rawAddress, ty.rawAddress))

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    UnixAixJniBridge.libcUnixAixSetpriority(which, who.toInt(), priority)

public actual fun setpwent() {
    UnixAixJniBridge.libcUnixAixSetpwent()
}

public actual fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt =
    UnixAixJniBridge.libcUnixAixSetrlimit(resource, rlim.rawAddress)

public actual fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt =
    UnixAixJniBridge.libcUnixAixSetrlimit64(resource, rlim.rawAddress)

public actual fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt =
    UnixAixJniBridge.libcUnixAixSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt =
    UnixAixJniBridge.libcUnixAixSetitimer(which, newValue.rawAddress, oldValue.rawAddress)

public actual fun setutent() {
    UnixAixJniBridge.libcUnixAixSetutent()
}

public actual fun setutxent() {
    UnixAixJniBridge.libcUnixAixSetutxent()
}

public actual fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt =
    UnixAixJniBridge.libcUnixAixSigaltstack(ss.rawAddress, oss.rawAddress)

public actual fun sigsuspend(mask: ConstPtr<SigsetT>): CInt =
    UnixAixJniBridge.libcUnixAixSigsuspend(mask.rawAddress)

public actual fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt =
    UnixAixJniBridge.libcUnixAixSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)

public actual fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt =
    UnixAixJniBridge.libcUnixAixSigwait(set.rawAddress, sig.rawAddress)

public actual fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt =
    UnixAixJniBridge.libcUnixAixSigwaitinfo(set.rawAddress, info.rawAddress)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid> =
    MutPtr(UnixAixJniBridge.libcUnixAixShmat(shmid, shmaddr.rawAddress, shmflg))

public actual fun shmdt(shmaddr: ConstPtr<CVoid>): CInt =
    UnixAixJniBridge.libcUnixAixShmdt(shmaddr.rawAddress)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt =
    UnixAixJniBridge.libcUnixAixShmctl(shmid, cmd, buf.rawAddress)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixAixJniBridge.libcUnixAixShmget(key, size.toLong(), shmflg)

public actual fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt =
    UnixAixJniBridge.libcUnixAixShmOpen(name.rawAddress, oflag, mode.toInt())

public actual fun shmUnlink(name: ConstPtr<CChar>): CInt =
    UnixAixJniBridge.libcUnixAixShmUnlink(name.rawAddress)

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    UnixAixJniBridge.libcUnixAixSplice(socket1, socket2, flags)

public actual fun srand(seed: CUint) {
    UnixAixJniBridge.libcUnixAixSrand(seed.toInt())
}

public actual fun srand48(seed: CLong) {
    UnixAixJniBridge.libcUnixAixSrand48(seed)
}

public actual fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt =
    UnixAixJniBridge.libcUnixAixStat64(path.rawAddress, buf.rawAddress)

public actual fun stat64at(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt =
    UnixAixJniBridge.libcUnixAixStat64at(dirfd, path.rawAddress, buf.rawAddress, flags)

public actual fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt =
    UnixAixJniBridge.libcUnixAixStatfs(path.rawAddress, buf.rawAddress)

public actual fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt =
    UnixAixJniBridge.libcUnixAixStatfs64(path.rawAddress, buf.rawAddress)

public actual fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt =
    UnixAixJniBridge.libcUnixAixStatvfs64(path.rawAddress, buf.rawAddress)

public actual fun statx(path: ConstPtr<CChar>, buf: MutPtr<Stat>, length: CInt, command: CInt): CInt =
    UnixAixJniBridge.libcUnixAixStatx(path.rawAddress, buf.rawAddress, length, command)

public actual fun strcasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, locale: LocaleT): CInt =
    UnixAixJniBridge.libcUnixAixStrcasecmpL(string1.rawAddress, string2.rawAddress, locale.rawAddress)

public actual fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt =
    UnixAixJniBridge.libcUnixAixStrerrorR(errnum, buf.rawAddress, buflen.toLong())

public actual fun strftime(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: ConstPtr<Tm>): SizeT =
    UnixAixJniBridge.libcUnixAixStrftime(arg1.rawAddress, arg2.toLong(), arg3.rawAddress, arg4.rawAddress).toULong()

public actual fun strncasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, length: SizeT, locale: LocaleT): CInt =
    UnixAixJniBridge.libcUnixAixStrncasecmpL(string1.rawAddress, string2.rawAddress, length.toLong(), locale.rawAddress)

public actual fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar> =
    MutPtr(UnixAixJniBridge.libcUnixAixStrptime(s.rawAddress, format.rawAddress, tm.rawAddress))

public actual fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixAixJniBridge.libcUnixAixStrsep(string.rawAddress, delim.rawAddress))

public actual fun swapcontext(uocp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt =
    UnixAixJniBridge.libcUnixAixSwapcontext(uocp.rawAddress, ucp.rawAddress)

public actual fun swapoff(path: ConstPtr<CChar>): CInt =
    UnixAixJniBridge.libcUnixAixSwapoff(path.rawAddress)

public actual fun swapon(path: ConstPtr<CChar>): CInt =
    UnixAixJniBridge.libcUnixAixSwapon(path.rawAddress)

public actual fun sync() {
    UnixAixJniBridge.libcUnixAixSync()
}

public actual fun telldir(dirp: MutPtr<DIR>): CLong =
    UnixAixJniBridge.libcUnixAixTelldir(dirp.rawAddress)

public actual fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt =
    UnixAixJniBridge.libcUnixAixTimerCreate(clockid, sevp.rawAddress, timerid.rawAddress)

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixAixJniBridge.libcUnixAixTimerDelete(timerid)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixAixJniBridge.libcUnixAixTimerGetoverrun(timerid)

public actual fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt =
    UnixAixJniBridge.libcUnixAixTimerGettime(timerid, value.rawAddress)

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt =
    UnixAixJniBridge.libcUnixAixTimerSettime(timerid, flags, newValue.rawAddress, oldValue.rawAddress)

public actual fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt =
    UnixAixJniBridge.libcUnixAixTruncate64(path.rawAddress, length)

public actual fun uname(buf: MutPtr<Utsname>): CInt =
    UnixAixJniBridge.libcUnixAixUname(buf.rawAddress)

public actual fun updwtmp(file: ConstPtr<CChar>, u: ConstPtr<Utmp>) {
    UnixAixJniBridge.libcUnixAixUpdwtmp(file.rawAddress, u.rawAddress)
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(UnixAixJniBridge.libcUnixAixUselocale(loc.rawAddress))

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    UnixAixJniBridge.libcUnixAixUtmpname(file.rawAddress)

public actual fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt =
    UnixAixJniBridge.libcUnixAixUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT =
    UnixAixJniBridge.libcUnixAixWait4(pid, status.rawAddress, options, rusage.rawAddress)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt =
    UnixAixJniBridge.libcUnixAixWaitid(idtype.toInt(), id.toInt(), infop.rawAddress, options)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    UnixAixJniBridge.libcUnixAixWritev(fd, iov.rawAddress, iovcnt)

public actual fun errno(): MutPtr<CInt> =
    MutPtr(UnixAixJniBridge.libcUnixAixErrno())
