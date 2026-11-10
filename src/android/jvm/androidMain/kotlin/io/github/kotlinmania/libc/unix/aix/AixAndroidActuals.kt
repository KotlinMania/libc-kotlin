@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

private object UnixAixJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_aix_thrKill(id: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_aix_thrSelf(): Long

    @JvmStatic
    external fun libc_unix_aix_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrGetdetachstate(attr: Long, detachstate: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrGetinheritsched(attr: Long, inheritsched: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrGetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrGetschedpolicy(attr: Long, policy: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrGetscope(attr: Long, contentionscope: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrSetinheritsched(attr: Long, inheritsched: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrSetschedpolicy(attr: Long, policy: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrSetscope(attr: Long, contentionscope: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadAttrSetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadBarrierattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadBarrierattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadCleanupPop(execute: Int)

    @JvmStatic
    external fun libc_unix_aix_pthreadCleanupPush(routine: Long, arg: Long)

    @JvmStatic
    external fun libc_unix_aix_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadCreate(thread: Long, attr: Long, startRoutine: Long, arg: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadGetconcurrency(): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadGetcpuclockid(threadId: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadGetschedparam(thread: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadKill(thread: Long, sig: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexattrGetprioceiling(attr: Long, prioceiling: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexattrGetprotocol(attr: Long, protocol: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexattrGetrobust(attr: Long, robust: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexattrGettype(attr: Long, type: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexattrSetprioceiling(attr: Long, prioceiling: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexattrSetprotocol(attr: Long, protocol: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexattrSetrobust(attr: Long, robust: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexConsistent(mutex: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexGetprioceiling(mutex: Long, prioceiling: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexSetprioceiling(mutex: Long, prioceiling: Int, oldCeiling: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadMutexTimedlock(mutex: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadOnce(onceControl: Long, initRoutine: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadRwlockattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadRwlockattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadRwlockTimedrdlock(rwlock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadRwlockTimedwrlock(rwlock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSetcancelstate(state: Int, oldstate: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSetcanceltype(type: Int, oldtype: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSetconcurrency(newLevel: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSetschedparam(thread: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSetschedprio(thread: Long, prio: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSigmask(how: Int, set: Long, oset: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pthreadTestcancel()

    @JvmStatic
    external fun libc_unix_aix_iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libc_unix_aix_iconvClose(cd: Long): Int

    @JvmStatic
    external fun libc_unix_aix_iconvOpen(tocode: String?, fromcode: String?): Long

    @JvmStatic
    external fun libc_unix_aix_acct(filename: Long): Int

    @JvmStatic
    external fun libc_unix_aix_aioCancel(fildes: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_aioError(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_aioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_aioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_aioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libc_unix_aix_aioSuspend(list: Long, nent: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_aix_aioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_basename(path: Long): Long

    @JvmStatic
    external fun libc_unix_aix_bind(socket: Int, address: Long, addressLen: Int): Int

    @JvmStatic
    external fun libc_unix_aix_brk(addr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_clearenv(): Int

    @JvmStatic
    external fun libc_unix_aix_clockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_aix_clockGetres(clkId: Long, tp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_clockGettime(clkId: Long, tp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_clockNanosleep(clkId: Long, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_clockSettime(clockId: Long, tp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_creat64(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_aix_ctermid(s: Long): Long

    @JvmStatic
    external fun libc_unix_aix_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_dirname(path: Long): Long

    @JvmStatic
    external fun libc_unix_aix_drand48(): Double

    @JvmStatic
    external fun libc_unix_aix_duplocale(arg1: Long): Long

    @JvmStatic
    external fun libc_unix_aix_endgrent()

    @JvmStatic
    external fun libc_unix_aix_endmntent(streamp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_endpwent()

    @JvmStatic
    external fun libc_unix_aix_endutent()

    @JvmStatic
    external fun libc_unix_aix_endutxent()

    @JvmStatic
    external fun libc_unix_aix_erand48(xseed: Long): Double

    @JvmStatic
    external fun libc_unix_aix_faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_fattach(fildes: Int, path: String?): Int

    @JvmStatic
    external fun libc_unix_aix_fdatasync(fd: Int): Int

    @JvmStatic
    external fun libc_unix_aix_fexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_ffs(value: Int): Int

    @JvmStatic
    external fun libc_unix_aix_ffsl(value: Long): Int

    @JvmStatic
    external fun libc_unix_aix_ffsll(value: Long): Int

    @JvmStatic
    external fun libc_unix_aix_fgetgrent(file: Long): Long

    @JvmStatic
    external fun libc_unix_aix_fgetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_fgetpwent(file: Long): Long

    @JvmStatic
    external fun libc_unix_aix_fopen64(filename: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_aix_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_aix_freopen64(filename: String?, mode: String?, file: Long): Long

    @JvmStatic
    external fun libc_unix_aix_fseeko64(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_unix_aix_fsetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_fstat64(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_fstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_fstatfs64(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_fstatvfs64(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_ftello64(stream: Long): Long

    @JvmStatic
    external fun libc_unix_aix_ftok(path: String?, id: Int): Int

    @JvmStatic
    external fun libc_unix_aix_ftruncate64(fd: Int, length: Long): Int

    @JvmStatic
    external fun libc_unix_aix_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_aix_getcontext(ucp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_getdomainname(name: Long, len: Int): Int

    @JvmStatic
    external fun libc_unix_aix_getdtablesize(): Int

    @JvmStatic
    external fun libc_unix_aix_getgrent(): Long

    @JvmStatic
    external fun libc_unix_aix_getgrgid(gid: Short): Long

    @JvmStatic
    external fun libc_unix_aix_getgrgidR(gid: Short, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_aix_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_aix_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_aix_getgrset(user: String?): Long

    @JvmStatic
    external fun libc_unix_aix_gethostid(): Long

    @JvmStatic
    external fun libc_unix_aix_getmntent(stream: Long): Long

    @JvmStatic
    external fun libc_unix_aix_getnameinfo(sa: Long, salen: Long, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_getpagesize(): Int

    @JvmStatic
    external fun libc_unix_aix_getpeereid(socket: Int, euid: Long, egid: Long): Int

    @JvmStatic
    external fun libc_unix_aix_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_aix_getpwent(): Long

    @JvmStatic
    external fun libc_unix_aix_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_aix_getpwuidR(uid: Short, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_aix_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_aix_getrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_aix_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_aix_getitimer(which: Int, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_aix_getutent(): Long

    @JvmStatic
    external fun libc_unix_aix_getutid(u: Long): Long

    @JvmStatic
    external fun libc_unix_aix_getutline(u: Long): Long

    @JvmStatic
    external fun libc_unix_aix_getutxent(): Long

    @JvmStatic
    external fun libc_unix_aix_getutxid(ut: Long): Long

    @JvmStatic
    external fun libc_unix_aix_getutxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_aix_glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_aix_globfree(pglob: Long)

    @JvmStatic
    external fun libc_unix_aix_hasmntopt(mnt: Long, opt: String?): Long

    @JvmStatic
    external fun libc_unix_aix_hcreate(nelt: Long): Int

    @JvmStatic
    external fun libc_unix_aix_hdestroy()

    @JvmStatic
    external fun libc_unix_aix_ifFreenameindex(ptr: Long)

    @JvmStatic
    external fun libc_unix_aix_ifNameindex(): Long

    @JvmStatic
    external fun libc_unix_aix_initgroups(name: String?, basegid: Short): Int

    @JvmStatic
    external fun libc_unix_aix_jrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_aix_lcong48(p: Long)

    @JvmStatic
    external fun libc_unix_aix_lfind(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libc_unix_aix_lioListio(mode: Int, aiocbList: Long, nent: Int, sevp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_lparGetInfo(command: Int, buf: Long, bufsize: Long): Int

    @JvmStatic
    external fun libc_unix_aix_lparSetResources(id: Int, resource: Long): Int

    @JvmStatic
    external fun libc_unix_aix_lrand48(): Long

    @JvmStatic
    external fun libc_unix_aix_lsearch(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long

    @JvmStatic
    external fun libc_unix_aix_lseek64(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libc_unix_aix_lstat64(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_aix_mallopt(param: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_aix_memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libc_unix_aix_memsetS(s: Long, smax: Long, c: Int, n: Long): Int

    @JvmStatic
    external fun libc_unix_aix_mincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libc_unix_aix_mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_aix_mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libc_unix_aix_mount(device: String?, path: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_aix_mqClose(mqd: Long): Int

    @JvmStatic
    external fun libc_unix_aix_mqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_mqNotify(mqd: Long, notification: Long): Int

    @JvmStatic
    external fun libc_unix_aix_mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libc_unix_aix_mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libc_unix_aix_mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libc_unix_aix_mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libc_unix_aix_mqUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_aix_mrand48(): Long

    @JvmStatic
    external fun libc_unix_aix_msgctl(msqid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_msgget(key: Int, msgflg: Int): Int

    @JvmStatic
    external fun libc_unix_aix_msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libc_unix_aix_msgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int

    @JvmStatic
    external fun libc_unix_aix_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_unix_aix_nlLanginfo(item: Int): Long

    @JvmStatic
    external fun libc_unix_aix_nlLanginfoL(item: Int, loc: Long): Long

    @JvmStatic
    external fun libc_unix_aix_nrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_aix_pollsetCreate(maxfd: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pollsetCtl(ps: Int, pollctlArray: Long, arrayLength: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pollsetDestroy(ps: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pollsetPoll(ps: Int, polldataArray: Long, arrayLength: Int, timeout: Int): Int

    @JvmStatic
    external fun libc_unix_aix_pollsetQuery(ps: Int, pollfdQuery: Long): Int

    @JvmStatic
    external fun libc_unix_aix_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_aix_posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_unix_aix_posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_unix_aix_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixFallocate64(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_aix_posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pread64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_aix_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_aix_ptrace64(request: Int, id: Long, addr: Long, data: Int, buff: Long): Int

    @JvmStatic
    external fun libc_unix_aix_pututline(u: Long): Long

    @JvmStatic
    external fun libc_unix_aix_pututxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_aix_pwrite64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_aix_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_aix_quotactl(cmd: Long, special: Int, id: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_aix_rand(): Int

    @JvmStatic
    external fun libc_unix_aix_readv(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_aix_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_unix_aix_recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_aix_recvmsg(sockfd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_aix_regcomp(preg: Long, pattern: String?, cflags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libc_unix_aix_regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_regfree(preg: Long)

    @JvmStatic
    external fun libc_unix_aix_sbrk(increment: Long): Long

    @JvmStatic
    external fun libc_unix_aix_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_aix_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_unix_aix_schedGetPriorityMax(policy: Int): Int

    @JvmStatic
    external fun libc_unix_aix_schedGetPriorityMin(policy: Int): Int

    @JvmStatic
    external fun libc_unix_aix_schedRrGetInterval(pid: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_aix_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_aix_sctpOptInfo(sd: Int, id: Int, opt: Int, argSize: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_aix_sctpPeeloff(s: Int, id: Long): Int

    @JvmStatic
    external fun libc_unix_aix_seed48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_aix_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_unix_aix_semClose(sem: Long): Int

    @JvmStatic
    external fun libc_unix_aix_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_aix_semGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libc_unix_aix_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_aix_semTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_aix_semUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_aix_semget(key: Int, nsems: Int, semflag: Int): Int

    @JvmStatic
    external fun libc_unix_aix_semop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libc_unix_aix_sendFile(socket: Long, iobuf: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_aix_sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_sendmsg(sockfd: Int, msg: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_aix_setcontext(ucp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_setdomainname(name: String?, len: Int): Int

    @JvmStatic
    external fun libc_unix_aix_setgroups(ngroups: Int, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_setgrent()

    @JvmStatic
    external fun libc_unix_aix_sethostid(hostid: Int): Int

    @JvmStatic
    external fun libc_unix_aix_sethostname(name: String?, len: Int): Int

    @JvmStatic
    external fun libc_unix_aix_setmntent(filename: String?, ty: String?): Long

    @JvmStatic
    external fun libc_unix_aix_setpriority(which: Int, who: Int, priority: Int): Int

    @JvmStatic
    external fun libc_unix_aix_setpwent()

    @JvmStatic
    external fun libc_unix_aix_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_aix_setrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_aix_settimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_aix_setitimer(which: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_aix_setutent()

    @JvmStatic
    external fun libc_unix_aix_setutxent()

    @JvmStatic
    external fun libc_unix_aix_sigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libc_unix_aix_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_unix_aix_sigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_aix_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_aix_sigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_aix_shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libc_unix_aix_shmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libc_unix_aix_shmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_shmget(key: Int, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libc_unix_aix_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_aix_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_aix_splice(socket1: Int, socket2: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_srand(seed: Int)

    @JvmStatic
    external fun libc_unix_aix_srand48(seed: Long)

    @JvmStatic
    external fun libc_unix_aix_stat64(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_stat64at(dirfd: Int, path: String?, buf: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_aix_statfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_statfs64(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_statvfs64(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_statx(path: String?, buf: Long, length: Int, command: Int): Int

    @JvmStatic
    external fun libc_unix_aix_strcasecmpL(string1: String?, string2: String?, locale: Long): Int

    @JvmStatic
    external fun libc_unix_aix_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_aix_strftime(arg1: Long, arg2: Long, arg3: String?, arg4: Long): Long

    @JvmStatic
    external fun libc_unix_aix_strncasecmpL(string1: String?, string2: String?, length: Long, locale: Long): Int

    @JvmStatic
    external fun libc_unix_aix_strptime(s: String?, format: String?, tm: Long): Long

    @JvmStatic
    external fun libc_unix_aix_strsep(string: Long, delim: String?): Long

    @JvmStatic
    external fun libc_unix_aix_swapcontext(uocp: Long, ucp: Long): Int

    @JvmStatic
    external fun libc_unix_aix_swapoff(path: String?): Int

    @JvmStatic
    external fun libc_unix_aix_swapon(path: String?): Int

    @JvmStatic
    external fun libc_unix_aix_sync()

    @JvmStatic
    external fun libc_unix_aix_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_aix_timerCreate(clockid: Long, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libc_unix_aix_timerDelete(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_aix_timerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_aix_timerGettime(timerid: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_aix_timerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_aix_truncate64(path: String?, length: Long): Int

    @JvmStatic
    external fun libc_unix_aix_uname(buf: Long): Int

    @JvmStatic
    external fun libc_unix_aix_updwtmp(file: String?, u: Long)

    @JvmStatic
    external fun libc_unix_aix_uselocale(loc: Long): Long

    @JvmStatic
    external fun libc_unix_aix_utmpname(file: String?): Int

    @JvmStatic
    external fun libc_unix_aix_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_aix_wait4(pid: Int, status: Long, options: Int, rusage: Long): Int

    @JvmStatic
    external fun libc_unix_aix_waitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_aix_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_unix_aix_errno(): Long
}

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_thrKill(id.toLong(), sig)

public actual fun thrSelf(): ThreadT =
    UnixAixJniBridge.libc_unix_aix_thrSelf().toUInt()

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAtfork(0L, 0L, 0L)

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrGetdetachstate((attr?.value ?: 0L), (detachstate?.value ?: 0L))

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrGetguardsize((attr?.value ?: 0L), (guardsize?.value ?: 0L))

public actual fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrGetinheritsched((attr?.value ?: 0L), (inheritsched?.value ?: 0L))

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrGetstackaddr((attr?.value ?: 0L), (stackaddr?.value ?: 0L))

public actual fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrGetschedpolicy((attr?.value ?: 0L), (policy?.value ?: 0L))

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrGetscope((attr?.value ?: 0L), (contentionscope?.value ?: 0L))

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrSetguardsize((attr?.value ?: 0L), guardsize.toLong())

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrSetinheritsched((attr?.value ?: 0L), inheritsched)

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrSetschedpolicy((attr?.value ?: 0L), policy)

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrSetscope((attr?.value ?: 0L), contentionscope)

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrSetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), stacksize.toLong())

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadAttrSetstackaddr((attr?.value ?: 0L), (stackaddr?.value ?: 0L))

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadBarrierattrDestroy((attr?.value ?: 0L))

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadBarrierattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadBarrierattrInit((attr?.value ?: 0L))

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadBarrierattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadBarrierDestroy((barrier?.value ?: 0L))

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadBarrierInit((barrier?.value ?: 0L), (attr?.value ?: 0L), count.toInt())

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadBarrierWait((barrier?.value ?: 0L))

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadCancel(thread.toLong())

public actual fun pthreadCleanupPop(execute: CInt) {
    UnixAixJniBridge.libc_unix_aix_pthreadCleanupPop(execute)
}

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: COpaquePointer?) {
    UnixAixJniBridge.libc_unix_aix_pthreadCleanupPush(0L, (arg?.value ?: 0L))
}

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadCondattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadCondattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadCreate((thread?.value ?: 0L), (attr?.value ?: 0L), 0L, (arg?.value ?: 0L))

public actual fun pthreadGetconcurrency(): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadGetconcurrency()

public actual fun pthreadGetcpuclockid(threadId: PthreadT, clockId: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadGetcpuclockid(threadId.toLong(), (clockId?.value ?: 0L))

public actual fun pthreadGetschedparam(thread: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadGetschedparam(thread.toLong(), (policy?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadKill(thread.toLong(), sig)

public actual fun pthreadMutexattrGetprioceiling(attr: COpaquePointer?, prioceiling: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexattrGetprioceiling((attr?.value ?: 0L), (prioceiling?.value ?: 0L))

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexattrGetprotocol((attr?.value ?: 0L), (protocol?.value ?: 0L))

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexattrGetrobust((attr?.value ?: 0L), (robust?.value ?: 0L))

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, type: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexattrGettype((attr?.value ?: 0L), (type?.value ?: 0L))

public actual fun pthreadMutexattrSetprioceiling(attr: COpaquePointer?, prioceiling: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexattrSetprioceiling((attr?.value ?: 0L), prioceiling)

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexattrSetprotocol((attr?.value ?: 0L), protocol)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexattrSetrobust((attr?.value ?: 0L), robust)

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexConsistent((mutex?.value ?: 0L))

public actual fun pthreadMutexGetprioceiling(mutex: COpaquePointer?, prioceiling: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexGetprioceiling((mutex?.value ?: 0L), (prioceiling?.value ?: 0L))

public actual fun pthreadMutexSetprioceiling(mutex: COpaquePointer?, prioceiling: CInt, oldCeiling: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexSetprioceiling((mutex?.value ?: 0L), prioceiling, (oldCeiling?.value ?: 0L))

public actual fun pthreadMutexTimedlock(mutex: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadMutexTimedlock((mutex?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadOnce(onceControl: COpaquePointer?, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadOnce((onceControl?.value ?: 0L), 0L)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadRwlockattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadRwlockattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadRwlockTimedrdlock(rwlock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadRwlockTimedrdlock((rwlock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadRwlockTimedwrlock(rwlock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadRwlockTimedwrlock((rwlock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadSetcancelstate(state: CInt, oldstate: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSetcancelstate(state, (oldstate?.value ?: 0L))

public actual fun pthreadSetcanceltype(type: CInt, oldtype: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSetcanceltype(type, (oldtype?.value ?: 0L))

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSetconcurrency(newLevel)

public actual fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSetschedparam(thread.toLong(), policy, (param?.value ?: 0L))

public actual fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSetschedprio(thread.toLong(), prio)

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oset: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSigmask(how, (set?.value ?: 0L), (oset?.value ?: 0L))

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSpinDestroy((lock?.value ?: 0L))

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSpinInit((lock?.value ?: 0L), pshared)

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSpinLock((lock?.value ?: 0L))

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSpinTrylock((lock?.value ?: 0L))

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pthreadSpinUnlock((lock?.value ?: 0L))

public actual fun pthreadTestcancel() {
    UnixAixJniBridge.libc_unix_aix_pthreadTestcancel()
}

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    UnixAixJniBridge.libc_unix_aix_iconv((cd?.value ?: 0L), (inbuf?.value ?: 0L), (inbytesleft?.value ?: 0L), (outbuf?.value ?: 0L), (outbytesleft?.value ?: 0L)).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixAixJniBridge.libc_unix_aix_iconvClose((cd?.value ?: 0L))

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    UnixAixJniBridge.libc_unix_aix_iconvOpen(tocode, fromcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun acct(filename: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_acct((filename?.value ?: 0L))

public actual fun aioCancel(fildes: CInt, aiocbp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_aioCancel(fildes, (aiocbp?.value ?: 0L))

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_aioError((aiocbp?.value ?: 0L))

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_aioFsync(op, (aiocbp?.value ?: 0L))

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_aioRead((aiocbp?.value ?: 0L))

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    UnixAixJniBridge.libc_unix_aix_aioReturn((aiocbp?.value ?: 0L))

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_aioSuspend((list?.value ?: 0L), nent, (timeout?.value ?: 0L))

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_aioWrite((aiocbp?.value ?: 0L))

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_basename((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    UnixAixJniBridge.libc_unix_aix_bind(socket, (address?.value ?: 0L), addressLen.toInt())

public actual fun brk(addr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_brk((addr?.value ?: 0L))

public actual fun clearenv(): CInt =
    UnixAixJniBridge.libc_unix_aix_clearenv()

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_clockGetcpuclockid(pid, (clkId?.value ?: 0L))

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_clockGetres(clkId, (tp?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_clockSettime(clockId, (tp?.value ?: 0L))

public actual fun creat64(path: String?, mode: ModeT): CInt =
    UnixAixJniBridge.libc_unix_aix_creat64(path, mode.toInt())

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_ctermid((s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirfd(dirp: DIR?): CInt =
    UnixAixJniBridge.libc_unix_aix_dirfd((dirp?.handle ?: 0L))

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_dirname((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun drand48(): CDouble =
    UnixAixJniBridge.libc_unix_aix_drand48()

public actual fun duplocale(arg1: LocaleT): LocaleT =
    UnixAixJniBridge.libc_unix_aix_duplocale((arg1?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun endgrent() {
    UnixAixJniBridge.libc_unix_aix_endgrent()
}

public actual fun endmntent(streamp: FILE?): CInt =
    UnixAixJniBridge.libc_unix_aix_endmntent((streamp?.handle ?: 0L))

public actual fun endpwent() {
    UnixAixJniBridge.libc_unix_aix_endpwent()
}

public actual fun endutent() {
    UnixAixJniBridge.libc_unix_aix_endutent()
}

public actual fun endutxent() {
    UnixAixJniBridge.libc_unix_aix_endutxent()
}

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    UnixAixJniBridge.libc_unix_aix_erand48((xseed?.value ?: 0L))

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_faccessat(dirfd, pathname, mode, flags)

public actual fun fattach(fildes: CInt, path: String?): CInt =
    UnixAixJniBridge.libc_unix_aix_fattach(fildes, path)

public actual fun fdatasync(fd: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_fdatasync(fd)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_fexecve(fd, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun ffs(value: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_ffs(value)

public actual fun ffsl(value: CLong): CInt =
    UnixAixJniBridge.libc_unix_aix_ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    UnixAixJniBridge.libc_unix_aix_ffsll(value)

public actual fun fgetgrent(file: FILE?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_fgetgrent((file?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_fgetpos64((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun fgetpwent(file: FILE?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_fgetpwent((file?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    UnixAixJniBridge.libc_unix_aix_fopen64(filename, mode).let { if (it == 0L) null else FILE(it) }

public actual fun freelocale(loc: LocaleT) {
    UnixAixJniBridge.libc_unix_aix_freelocale((loc?.value ?: 0L))
}

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    UnixAixJniBridge.libc_unix_aix_freopen64(filename, mode, (file?.handle ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_fseeko64((stream?.handle ?: 0L), offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_fsetpos64((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun fstat64(fildes: CInt, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_fstat64(fildes, (buf?.value ?: 0L))

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_fstatfs(fd, (buf?.value ?: 0L))

public actual fun fstatfs64(fd: CInt, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_fstatfs64(fd, (buf?.value ?: 0L))

public actual fun fstatvfs64(fd: CInt, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_fstatvfs64(fd, (buf?.value ?: 0L))

public actual fun ftello64(stream: FILE?): Off64T =
    UnixAixJniBridge.libc_unix_aix_ftello64((stream?.handle ?: 0L))

public actual fun ftok(path: String?, id: CInt): KeyT =
    UnixAixJniBridge.libc_unix_aix_ftok(path, id)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    UnixAixJniBridge.libc_unix_aix_ftruncate64(fd, length)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_futimens(fd, (times?.value ?: 0L))

public actual fun getcontext(ucp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_getcontext((ucp?.value ?: 0L))

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_getdomainname((name?.value ?: 0L), len)

public actual fun getdtablesize(): CInt =
    UnixAixJniBridge.libc_unix_aix_getdtablesize()

public actual fun getgrent(): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getgrent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getgrgid(gid.toShort()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_getgrgidR(gid.toShort(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrset(user: String?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getgrset(user).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostid(): CLong =
    UnixAixJniBridge.libc_unix_aix_gethostid()

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getmntent((stream?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getnameinfo(sa: COpaquePointer?, salen: SizeT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_getnameinfo((sa?.value ?: 0L), salen.toLong(), (host?.value ?: 0L), hostlen.toLong(), (serv?.value ?: 0L), servlen.toLong(), flags)

public actual fun getpagesize(): CInt =
    UnixAixJniBridge.libc_unix_aix_getpagesize()

public actual fun getpeereid(socket: CInt, euid: COpaquePointer?, egid: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_getpeereid(socket, (euid?.value ?: 0L), (egid?.value ?: 0L))

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixAixJniBridge.libc_unix_aix_getpriority(which, who.toInt())

public actual fun getpwent(): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_getpwuidR(uid.toShort(), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_getrlimit(resource, (rlim?.value ?: 0L))

public actual fun getrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_getrlimit64(resource, (rlim?.value ?: 0L))

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun getitimer(which: CInt, currValue: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_getitimer(which, (currValue?.value ?: 0L))

public actual fun getutent(): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getutent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutid(u: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getutid((u?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutline(u: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getutline((u?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxent(): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getutxent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getutxid((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_getutxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_glob(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree(pglob: COpaquePointer?) {
    UnixAixJniBridge.libc_unix_aix_globfree((pglob?.value ?: 0L))
}

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_hasmntopt((mnt?.value ?: 0L), opt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcreate(nelt: SizeT): CInt =
    UnixAixJniBridge.libc_unix_aix_hcreate(nelt.toLong())

public actual fun hdestroy() {
    UnixAixJniBridge.libc_unix_aix_hdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): COpaquePointer? =
    null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    UnixAixJniBridge.libc_unix_aix_ifFreenameindex((ptr?.value ?: 0L))
}

public actual fun ifNameindex(): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_ifNameindex().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    UnixAixJniBridge.libc_unix_aix_initgroups(name, basegid.toShort())

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    UnixAixJniBridge.libc_unix_aix_jrand48((xseed?.value ?: 0L))

public actual fun lcong48(p: COpaquePointer?) {
    UnixAixJniBridge.libc_unix_aix_lcong48((p?.value ?: 0L))
}

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_lfind((key?.value ?: 0L), (base?.value ?: 0L), (nelp?.value ?: 0L), width.toLong(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_lioListio(mode, (aiocbList?.value ?: 0L), nent, (sevp?.value ?: 0L))

public actual fun loadquery(flags: CInt, buf: COpaquePointer?, buflen: CUint, vararg variadicArgs: Long): CInt =
    0

public actual fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: SizeT): CInt =
    UnixAixJniBridge.libc_unix_aix_lparGetInfo(command, (buf?.value ?: 0L), bufsize.toLong())

public actual fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_lparSetResources(id, (resource?.value ?: 0L))

public actual fun lrand48(): CLong =
    UnixAixJniBridge.libc_unix_aix_lrand48()

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_lsearch((key?.value ?: 0L), (base?.value ?: 0L), (nelp?.value ?: 0L), width.toLong(), 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    UnixAixJniBridge.libc_unix_aix_lseek64(fd, offset, whence)

public actual fun lstat64(path: String?, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_lstat64(path, (buf?.value ?: 0L))

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun makecontext(ucp: COpaquePointer?, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long) {
}

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_mallopt(param, value)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_memmem((haystack?.value ?: 0L), haystacklen.toLong(), (needle?.value ?: 0L), needlelen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    UnixAixJniBridge.libc_unix_aix_memsetS((s?.value ?: 0L), smax.toLong(), c, n.toLong())

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_mincore((addr?.value ?: 0L), len.toLong(), (vec?.value ?: 0L))

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixAixJniBridge.libc_unix_aix_mkfifoat(dirfd, pathname, mode.toInt())

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixAixJniBridge.libc_unix_aix_mknodat(dirfd, pathname, mode.toInt(), dev.toLong())

public actual fun mount(device: String?, path: String?, flags: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_mount(device, path, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun mqClose(mqd: MqdT): CInt =
    UnixAixJniBridge.libc_unix_aix_mqClose(mqd.toLong())

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_mqGetattr(mqd.toLong(), (attr?.value ?: 0L))

public actual fun mqNotify(mqd: MqdT, notification: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_mqNotify(mqd.toLong(), (notification?.value ?: 0L))

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    0

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    UnixAixJniBridge.libc_unix_aix_mqReceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L))

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixAixJniBridge.libc_unix_aix_mqSend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt())

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_mqSetattr(mqd.toLong(), (newattr?.value ?: 0L), (oldattr?.value ?: 0L))

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    UnixAixJniBridge.libc_unix_aix_mqTimedreceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L), (absTimeout?.value ?: 0L))

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_mqTimedsend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt(), (absTimeout?.value ?: 0L))

public actual fun mqUnlink(name: String?): CInt =
    UnixAixJniBridge.libc_unix_aix_mqUnlink(name)

public actual fun mrand48(): CLong =
    UnixAixJniBridge.libc_unix_aix_mrand48()

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_msgctl(msqid, cmd, (buf?.value ?: 0L))

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixAixJniBridge.libc_unix_aix_msgrcv(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_msgsnd(msqid, (msgp?.value ?: 0L), msgsz.toLong(), msgflg)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    UnixAixJniBridge.libc_unix_aix_newlocale(mask, locale, (base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: NlItem, loc: LocaleT): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_nlLanginfoL(item, (loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    UnixAixJniBridge.libc_unix_aix_nrand48((xseed?.value ?: 0L))

public actual fun open64(path: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    UnixAixJniBridge.libc_unix_aix_pollsetCreate(maxfd)

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: COpaquePointer?, arrayLength: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pollsetCtl(ps, (pollctlArray?.value ?: 0L), arrayLength)

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    UnixAixJniBridge.libc_unix_aix_pollsetDestroy(ps)

public actual fun pollsetPoll(ps: PollsetT, polldataArray: COpaquePointer?, arrayLength: CInt, timeout: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_pollsetPoll(ps, (polldataArray?.value ?: 0L), arrayLength, timeout)

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_pollsetQuery(ps, (pollfdQuery?.value ?: 0L))

public actual fun popen(command: String?, mode: String?): FILE? =
    UnixAixJniBridge.libc_unix_aix_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_posixFadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_posixFadvise64(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixAixJniBridge.libc_unix_aix_posixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    UnixAixJniBridge.libc_unix_aix_posixFallocate64(fd, offset, len)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_posixMadvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawn((pid?.value ?: 0L), path, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnFileActionsAddclose((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnFileActionsAdddup2((actions?.value ?: 0L), fd, newfd)

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnFileActionsAddopen((actions?.value ?: 0L), fd, path, oflag, mode.toInt())

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnFileActionsDestroy((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnFileActionsInit((actions?.value ?: 0L))

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrDestroy((attr?.value ?: 0L))

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrGetflags((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrGetpgroup((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrGetschedpolicy((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrGetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrGetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrInit((attr?.value ?: 0L))

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrSetflags((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrSetpgroup((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrSetschedpolicy((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrSetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnattrSetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_posixSpawnp((pid?.value ?: 0L), file, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    UnixAixJniBridge.libc_unix_aix_pread64(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffsetT): SsizeT =
    UnixAixJniBridge.libc_unix_aix_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_ptrace64(request, id, addr, data, (buff?.value ?: 0L))

public actual fun pututline(u: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_pututline((u?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_pututxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    UnixAixJniBridge.libc_unix_aix_pwrite64(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffsetT): SsizeT =
    UnixAixJniBridge.libc_unix_aix_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun quotactl(cmd: COpaquePointer?, special: CInt, id: CInt, data: CaddrT): CInt =
    UnixAixJniBridge.libc_unix_aix_quotactl((cmd?.value ?: 0L), special, id, (data?.value ?: 0L))

public actual fun rand(): CInt =
    UnixAixJniBridge.libc_unix_aix_rand()

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixAixJniBridge.libc_unix_aix_readv(fd, (iov?.value ?: 0L), iovcnt)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    UnixAixJniBridge.libc_unix_aix_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_recvmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags, (timeout?.value ?: 0L))

public actual fun recvmsg(sockfd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixAixJniBridge.libc_unix_aix_recvmsg(sockfd, (msg?.value ?: 0L), flags)

public actual fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_regcomp((preg?.value ?: 0L), pattern, cflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    UnixAixJniBridge.libc_unix_aix_regerror(errcode, (preg?.value ?: 0L), (errbuf?.value ?: 0L), errbufSize.toLong()).toULong()

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_regexec((preg?.value ?: 0L), input, nmatch.toLong(), (pmatch?.value ?: 0L), eflags)

public actual fun regfree(preg: COpaquePointer?) {
    UnixAixJniBridge.libc_unix_aix_regfree((preg?.value ?: 0L))
}

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_schedGetparam(pid, (param?.value ?: 0L))

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixAixJniBridge.libc_unix_aix_schedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_schedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, tp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_schedRrGetInterval(pid, (tp?.value ?: 0L))

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_schedSetparam(pid, (param?.value ?: 0L))

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_sctpOptInfo(sd, id.toInt(), opt, (argSize?.value ?: 0L), (size?.value ?: 0L))

public actual fun sctpPeeloff(s: CInt, id: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_sctpPeeloff(s, (id?.value ?: 0L))

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_seed48((xseed?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    UnixAixJniBridge.libc_unix_aix_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun semClose(sem: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_semClose((sem?.value ?: 0L))

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_semDestroy((sem?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixAixJniBridge.libc_unix_aix_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_semTimedwait((sem?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun semUnlink(name: String?): CInt =
    UnixAixJniBridge.libc_unix_aix_semUnlink(name)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    UnixAixJniBridge.libc_unix_aix_semop(semid, (sops?.value ?: 0L), nsops.toLong())

public actual fun sendFile(socket: COpaquePointer?, iobuf: COpaquePointer?, flags: CUint): SsizeT =
    UnixAixJniBridge.libc_unix_aix_sendFile((socket?.value ?: 0L), (iobuf?.value ?: 0L), flags.toInt())

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_sendmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags)

public actual fun sendmsg(sockfd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    UnixAixJniBridge.libc_unix_aix_sendmsg(sockfd, (msg?.value ?: 0L), flags)

public actual fun setcontext(ucp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_setcontext((ucp?.value ?: 0L))

public actual fun setdomainname(name: String?, len: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_setdomainname(name, len)

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_setgroups(ngroups, (ptr?.value ?: 0L))

public actual fun setgrent() {
    UnixAixJniBridge.libc_unix_aix_setgrent()
}

public actual fun sethostid(hostid: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_sethostid(hostid)

public actual fun sethostname(name: String?, len: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_sethostname(name, len)

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    UnixAixJniBridge.libc_unix_aix_setmntent(filename, ty).let { if (it == 0L) null else FILE(it) }

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_setpriority(which, who.toInt(), priority)

public actual fun setpwent() {
    UnixAixJniBridge.libc_unix_aix_setpwent()
}

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_setrlimit(resource, (rlim?.value ?: 0L))

public actual fun setrlimit64(resource: CInt, rlim: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_setrlimit64(resource, (rlim?.value ?: 0L))

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_settimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_setitimer(which, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun setutent() {
    UnixAixJniBridge.libc_unix_aix_setutent()
}

public actual fun setutxent() {
    UnixAixJniBridge.libc_unix_aix_setutxent()
}

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_sigaltstack((ss?.value ?: 0L), (oss?.value ?: 0L))

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_sigsuspend((mask?.value ?: 0L))

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_sigwaitinfo((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_shmat(shmid, (shmaddr?.value ?: 0L), shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_shmdt((shmaddr?.value ?: 0L))

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_shmctl(shmid, cmd, (buf?.value ?: 0L))

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_shmget(key, size.toLong(), shmflg)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixAixJniBridge.libc_unix_aix_shmOpen(name, oflag, mode.toInt())

public actual fun shmUnlink(name: String?): CInt =
    UnixAixJniBridge.libc_unix_aix_shmUnlink(name)

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_splice(socket1, socket2, flags)

public actual fun srand(seed: CUint) {
    UnixAixJniBridge.libc_unix_aix_srand(seed.toInt())
}

public actual fun srand48(seed: CLong) {
    UnixAixJniBridge.libc_unix_aix_srand48(seed)
}

public actual fun stat64(path: String?, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_stat64(path, (buf?.value ?: 0L))

public actual fun stat64at(dirfd: CInt, path: String?, buf: COpaquePointer?, flags: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_stat64at(dirfd, path, (buf?.value ?: 0L), flags)

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_statfs(path, (buf?.value ?: 0L))

public actual fun statfs64(path: String?, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_statfs64(path, (buf?.value ?: 0L))

public actual fun statvfs64(path: String?, buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_statvfs64(path, (buf?.value ?: 0L))

public actual fun statx(path: String?, buf: COpaquePointer?, length: CInt, command: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_statx(path, (buf?.value ?: 0L), length, command)

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    UnixAixJniBridge.libc_unix_aix_strcasecmpL(string1, string2, (locale?.value ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixAixJniBridge.libc_unix_aix_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: COpaquePointer?): SizeT =
    UnixAixJniBridge.libc_unix_aix_strftime((arg1?.value ?: 0L), arg2.toLong(), arg3, (arg4?.value ?: 0L)).toULong()

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    UnixAixJniBridge.libc_unix_aix_strncasecmpL(string1, string2, length.toLong(), (locale?.value ?: 0L))

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_strptime(s, format, (tm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_strsep((string?.value ?: 0L), delim).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun swapcontext(uocp: COpaquePointer?, ucp: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_swapcontext((uocp?.value ?: 0L), (ucp?.value ?: 0L))

public actual fun swapoff(path: String?): CInt =
    UnixAixJniBridge.libc_unix_aix_swapoff(path)

public actual fun swapon(path: String?): CInt =
    UnixAixJniBridge.libc_unix_aix_swapon(path)

public actual fun sync() {
    UnixAixJniBridge.libc_unix_aix_sync()
}

public actual fun telldir(dirp: DIR?): CLong =
    UnixAixJniBridge.libc_unix_aix_telldir((dirp?.handle ?: 0L))

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_timerCreate(clockid, (sevp?.value ?: 0L), (timerid?.value ?: 0L))

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixAixJniBridge.libc_unix_aix_timerDelete(timerid)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixAixJniBridge.libc_unix_aix_timerGetoverrun(timerid)

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_timerGettime(timerid, (value?.value ?: 0L))

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_timerSettime(timerid, flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun truncate64(path: String?, length: Off64T): CInt =
    UnixAixJniBridge.libc_unix_aix_truncate64(path, length)

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixAixJniBridge.libc_unix_aix_uname((buf?.value ?: 0L))

public actual fun updwtmp(file: String?, u: COpaquePointer?) {
    UnixAixJniBridge.libc_unix_aix_updwtmp(file, (u?.value ?: 0L))
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    UnixAixJniBridge.libc_unix_aix_uselocale((loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utmpname(file: String?): CInt =
    UnixAixJniBridge.libc_unix_aix_utmpname(file)

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    UnixAixJniBridge.libc_unix_aix_wait4(pid, (status?.value ?: 0L), options, (rusage?.value ?: 0L))

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    UnixAixJniBridge.libc_unix_aix_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L), options)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    UnixAixJniBridge.libc_unix_aix_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun errno(): COpaquePointer? =
    UnixAixJniBridge.libc_unix_aix_errno().let { if (it == 0L) null else COpaquePointer(it) }
