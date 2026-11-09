@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.SizeT

private object UnixHurdJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_hurd_lutimes(file: String?, times: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_futimes(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_mkfifoat(fd: Int, path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_libcCurrentSigrtmin(): Int

    @JvmStatic
    external fun libc_unix_hurd_libcCurrentSigrtmax(): Int

    @JvmStatic
    external fun libc_unix_hurd_wait4(pid: Int, status: Long, options: Int, rusage: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_waitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_sigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_sigsuspend(mask: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_sigtimedwait(set: Long, info: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_sigwaitinfo(set: Long, info: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_sigaltstack(ss: Long, oss: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pipe2(fds: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_dup3(oldfd: Int, newfd: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_pread64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_pwrite64(fd: Int, buf: Long, count: Long, offset: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_readv(fd: Int, iovec: Long, count: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_writev(fd: Int, iovec: Long, count: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_preadv(fd: Int, iovec: Long, count: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_pwritev(fd: Int, iovec: Long, count: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_preadv64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_pwritev64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_freadUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_aioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_aioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_aioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_aioError(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_aioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_aioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_mqClose(mqd: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_mqUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_hurd_mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_mqGetattr(mqd: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_lseek64(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_lseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_fgetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fseeko64(stream: Long, offset: Long, whence: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_fsetpos64(stream: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_ftello64(stream: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_bind(fd: Int, addr: Long, len: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_accept4(fd: Int, addr: Long, len: Long, flg: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_ppoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_recvmsg(fd: Int, message: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_sendmsg(fd: Int, message: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_sendfile(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_sendfile64(outFd: Int, inFd: Int, offset: Long, count: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_shutdown(fd: Int, how: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_sethostname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getdomainname(name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_setdomainname(name: String?, len: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_ifNameindex(): Long

    @JvmStatic
    external fun libc_unix_hurd_ifFreenameindex(ptr: Long)

    @JvmStatic
    external fun libc_unix_hurd_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_getifaddrs(ifap: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_freeifaddrs(ifa: Long)

    @JvmStatic
    external fun libc_unix_hurd_uname(buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_gethostid(): Long

    @JvmStatic
    external fun libc_unix_hurd_sethostid(hostid: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_setpwent()

    @JvmStatic
    external fun libc_unix_hurd_endpwent()

    @JvmStatic
    external fun libc_unix_hurd_getpwent(): Long

    @JvmStatic
    external fun libc_unix_hurd_setgrent()

    @JvmStatic
    external fun libc_unix_hurd_endgrent()

    @JvmStatic
    external fun libc_unix_hurd_getgrent(): Long

    @JvmStatic
    external fun libc_unix_hurd_setspent()

    @JvmStatic
    external fun libc_unix_hurd_endspent()

    @JvmStatic
    external fun libc_unix_hurd_getspent(): Long

    @JvmStatic
    external fun libc_unix_hurd_getspnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_hurd_getpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fgetpwentR(stream: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fgetgrentR(stream: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_putpwent(p: Long, stream: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_putgrent(grp: Long, stream: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fgetspentR(fp: Long, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_sgetspentR(s: String?, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getspentR(spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getspnamR(name: String?, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getmntentR(stream: Long, mntbuf: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_utmpname(file: String?): Int

    @JvmStatic
    external fun libc_unix_hurd_utmpxname(file: String?): Int

    @JvmStatic
    external fun libc_unix_hurd_getutxent(): Long

    @JvmStatic
    external fun libc_unix_hurd_getutxid(ut: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_getutxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_pututxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_setutxent()

    @JvmStatic
    external fun libc_unix_hurd_endutxent()

    @JvmStatic
    external fun libc_unix_hurd_getresuid(ruid: Long, euid: Long, suid: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getresgid(rgid: Long, egid: Long, sgid: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_setresuid(ruid: Int, euid: Int, suid: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_setresgid(rgid: Int, egid: Int, sgid: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_initgroups(user: String?, group: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_getgrgid(gid: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getgrnam(name: String?): Long

    @JvmStatic
    external fun libc_unix_hurd_getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getgrouplist(user: String?, group: Int, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_setgroups(ngroups: Long, ptr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_acct(filename: String?): Int

    @JvmStatic
    external fun libc_unix_hurd_setmntent(filename: String?, ty: String?): Long

    @JvmStatic
    external fun libc_unix_hurd_getmntent(stream: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_addmntent(stream: Long, mnt: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_endmntent(streamp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_hasmntopt(mnt: Long, opt: String?): Long

    @JvmStatic
    external fun libc_unix_hurd_pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadKill(threadid: Long, signo: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadCancel(thread: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadEqual(t1: Long, t2: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadGetattrNp(thr: Long, attr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadMutexTimedlock(lock: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadRwlockattrGetpshared(attr: Long, value: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadRwlockattrSetpshared(attr: Long, value: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadCondattrSetclock(attr: Long, clockId: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadCondattrGetpshared(attr: Long, pshared: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadCondattrSetpshared(attr: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadOnce(control: Long, routine: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadBarrierattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadBarrierattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadBarrierattrGetpshared(attr: Long, shared: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadBarrierattrSetpshared(attr: Long, shared: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadBarrierDestroy(barrier: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadBarrierWait(barrier: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadSpinInit(lock: Long, pshared: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadSpinDestroy(lock: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadSpinLock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadSpinTrylock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadSpinUnlock(lock: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadAtfork(prepare: Long, parent: Long, child: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadSigmask(how: Int, newmask: Long, oldmask: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_schedGetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_schedSetparam(pid: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_schedGetscheduler(pid: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_schedSetscheduler(pid: Int, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_pthreadGetcpuclockid(thread: Long, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_semTimedwait(sem: Long, abstime: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_semGetvalue(sem: Long, sval: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_clockGetres(clockId: Int, res: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_clockGettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_clockSettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_clockGetcpuclockid(pid: Int, clkId: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_clockNanosleep(clkId: Int, flags: Int, rqtp: Long, rmtp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_settimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_asctimeR(tm: Long, buf: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_ctimeR(timep: Long, buf: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_strftime(s: Long, max: Long, format: String?, tm: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_strptime(s: String?, format: String?, tm: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_timerCreate(clockid: Int, sevp: Long, timerid: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_timerDelete(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_timerGetoverrun(timerid: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_timerGettime(timerid: Long, currValue: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_timerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fstat(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fstat64(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fstatat(fd: Int, file: String?, buf: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_fstatat64(fd: Int, file: String?, buf: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_statx(dirfd: Int, pathname: String?, flags: Int, mask: Int, statxbuf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_ftruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_ftruncate64(fd: Int, length: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_truncate64(file: String?, length: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_lstat(file: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_lstat64(file: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_statfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_statfs64(file: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fstatfs64(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_statvfs(file: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_statvfs64(file: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fstatvfs(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fstatvfs64(fildes: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fopen64(filename: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_hurd_freopen64(filename: String?, mode: String?, file: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_creat64(path: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_mkostemp(template: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_mkostemps(template: Long, suffixlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_mkstemps(template: Long, suffixlen: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_tmpfile64(): Long

    @JvmStatic
    external fun libc_unix_hurd_popen(command: String?, mode: String?): Long

    @JvmStatic
    external fun libc_unix_hurd_getdtablesize(): Int

    @JvmStatic
    external fun libc_unix_hurd_closeRange(first: Int, last: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getpt(): Int

    @JvmStatic
    external fun libc_unix_hurd_ptsnameR(fd: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_loginTty(fd: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_ctermid(s: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_clearenv(): Int

    @JvmStatic
    external fun libc_unix_hurd_execveat(dirfd: Int, pathname: String?, argv: Long, envp: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_execvpe(file: String?, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_fexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnattrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnFileActionsAddchdirNp(actions: Long, path: String?): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnFileActionsAddclosefromNp(actions: Long, from: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_posixSpawnFileActionsAddtcsetpgrpNp(actions: Long, tcfd: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_shmOpen(name: String?, oflag: Int, mode: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_shmUnlink(name: String?): Int

    @JvmStatic
    external fun libc_unix_hurd_euidaccess(pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_eaccess(pathname: String?, mode: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_stat(file: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_stat64(file: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_readdir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_readdir64(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_readdirR(dirp: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_readdir64R(dirp: Long, entry: Long, result: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_seekdir(dirp: Long, loc: Long)

    @JvmStatic
    external fun libc_unix_hurd_telldir(dirp: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_strerrorR(errnum: Int, buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_errnoLocation(): Long

    @JvmStatic
    external fun libc_unix_hurd_mmap64(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_msync(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_sync()

    @JvmStatic
    external fun libc_unix_hurd_syncfs(fd: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_fdatasync(fd: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixFallocate(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixFallocate64(fd: Int, offset: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_madvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_posixMadvise(addr: Long, len: Long, advice: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_getrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_setrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_setrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_getrandom(buffer: Long, length: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_getentropy(buffer: Long, length: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_memrchr(cx: Long, c: Int, n: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_strchrnul(s: String?, c: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_abs(i: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_labs(i: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_rand(): Int

    @JvmStatic
    external fun libc_unix_hurd_srand(seed: Int)

    @JvmStatic
    external fun libc_unix_hurd_drand48(): Double

    @JvmStatic
    external fun libc_unix_hurd_erand48(xseed: Long): Double

    @JvmStatic
    external fun libc_unix_hurd_lrand48(): Long

    @JvmStatic
    external fun libc_unix_hurd_nrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_mrand48(): Long

    @JvmStatic
    external fun libc_unix_hurd_jrand48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_srand48(seed: Long)

    @JvmStatic
    external fun libc_unix_hurd_seed48(xseed: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_lcong48(p: Long)

    @JvmStatic
    external fun libc_unix_hurd_qsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libc_unix_hurd_brk(addr: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_sbrk(increment: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_mallopt(param: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_mallocInfo(options: Int, stream: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_mallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_mallocTrim(pad: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_iconvOpen(tocode: String?, fromcode: String?): Long

    @JvmStatic
    external fun libc_unix_hurd_iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_iconvClose(cd: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_backtrace(buf: Long, sz: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_reboot(howTo: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_getloadavg(loadavg: Long, nelem: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_regfree(preg: Long)

    @JvmStatic
    external fun libc_unix_hurd_glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_globfree(pglob: Long)

    @JvmStatic
    external fun libc_unix_hurd_glob64(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_globfree64(pglob: Long)

    @JvmStatic
    external fun libc_unix_hurd_getxattr(path: String?, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_lgetxattr(path: String?, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_fgetxattr(filedes: Int, name: String?, value: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_setxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_lsetxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_fsetxattr(filedes: Int, name: String?, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_listxattr(path: String?, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_llistxattr(path: String?, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_flistxattr(filedes: Int, list: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_removexattr(path: String?, name: String?): Int

    @JvmStatic
    external fun libc_unix_hurd_lremovexattr(path: String?, name: String?): Int

    @JvmStatic
    external fun libc_unix_hurd_fremovexattr(filedes: Int, name: String?): Int

    @JvmStatic
    external fun libc_unix_hurd_dirname(path: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_posixBasename(path: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_gnuBasename(path: String?): Long

    @JvmStatic
    external fun libc_unix_hurd_dlmopen(lmid: Long, filename: String?, flag: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_dlinfo(handle: Long, request: Int, info: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_dladdr1(addr: Long, info: Long, extraInfo: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_hurd_duplocale(base: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_freelocale(loc: Long)

    @JvmStatic
    external fun libc_unix_hurd_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_uselocale(loc: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_nlLanginfo(item: Int): Long

    @JvmStatic
    external fun libc_unix_hurd_nlLanginfoL(item: Int, locale: Long): Long

    @JvmStatic
    external fun libc_unix_hurd_dlIteratePhdr(callback: Long, data: Long): Int

    @JvmStatic
    external fun libc_unix_hurd_gnuGetLibcRelease(): Long

    @JvmStatic
    external fun libc_unix_hurd_gnuGetLibcVersion(): Long
}

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_lutimes(file, (times?.value ?: 0L))

public actual fun futimes(fd: CInt, times: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_futimes(fd, (times?.value ?: 0L))

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_futimens(fd, (times?.value ?: 0L))

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mkfifoat(fd, path, mode.toInt())

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mknodat(dirfd, pathname, mode.toInt(), dev.toLong())

public actual fun libcCurrentSigrtmin(): CInt =
    UnixHurdJniBridge.libc_unix_hurd_libcCurrentSigrtmin()

public actual fun libcCurrentSigrtmax(): CInt =
    UnixHurdJniBridge.libc_unix_hurd_libcCurrentSigrtmax()

public actual fun wait4(pid: PidT, status: COpaquePointer?, options: CInt, rusage: COpaquePointer?): PidT =
    UnixHurdJniBridge.libc_unix_hurd_wait4(pid, (status?.value ?: 0L), options, (rusage?.value ?: 0L))

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L), options)

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_sigwait((set?.value ?: 0L), (sig?.value ?: 0L))

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_sigsuspend((mask?.value ?: 0L))

public actual fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_sigtimedwait((set?.value ?: 0L), (info?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_sigwaitinfo((set?.value ?: 0L), (info?.value ?: 0L))

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_sigaltstack((ss?.value ?: 0L), (oss?.value ?: 0L))

public actual fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt =
    0

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pipe2((fds?.value ?: 0L), flags)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_dup3(oldfd, newfd, flags)

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_pread64(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_pwrite64(fd, (buf?.value ?: 0L), count.toLong(), offset)

public actual fun readv(fd: CInt, iovec: COpaquePointer?, count: CInt): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_readv(fd, (iovec?.value ?: 0L), count)

public actual fun writev(fd: CInt, iovec: COpaquePointer?, count: CInt): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_writev(fd, (iovec?.value ?: 0L), count)

public actual fun preadv(fd: CInt, iovec: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_preadv(fd, (iovec?.value ?: 0L), count, offset)

public actual fun pwritev(fd: CInt, iovec: COpaquePointer?, count: CInt, offset: OffT): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_pwritev(fd, (iovec?.value ?: 0L), count, offset)

public actual fun preadv64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_preadv64(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_pwritev64(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    UnixHurdJniBridge.libc_unix_hurd_freadUnlocked((buf?.value ?: 0L), size.toLong(), nobj.toLong(), (stream?.handle ?: 0L)).toULong()

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_aioRead((aiocbp?.value ?: 0L))

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_aioWrite((aiocbp?.value ?: 0L))

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_aioFsync(op, (aiocbp?.value ?: 0L))

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_aioError((aiocbp?.value ?: 0L))

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_aioReturn((aiocbp?.value ?: 0L))

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_aioSuspend((aiocbList?.value ?: 0L), nitems, (timeout?.value ?: 0L))

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_aioCancel(fd, (aiocbp?.value ?: 0L))

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_lioListio(mode, (aiocbList?.value ?: 0L), nitems, (sevp?.value ?: 0L))

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    0

public actual fun mqClose(mqd: MqdT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mqClose(mqd.toLong())

public actual fun mqUnlink(name: String?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mqUnlink(name)

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_mqReceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L))

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_mqTimedreceive(mqd.toLong(), (msgPtr?.value ?: 0L), msgLen.toLong(), (msgPrio?.value ?: 0L), (absTimeout?.value ?: 0L))

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mqSend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt())

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mqTimedsend(mqd.toLong(), msgPtr, msgLen.toLong(), msgPrio.toInt(), (absTimeout?.value ?: 0L))

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mqGetattr(mqd.toLong(), (attr?.value ?: 0L))

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mqSetattr(mqd.toLong(), (newattr?.value ?: 0L), (oldattr?.value ?: 0L))

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    UnixHurdJniBridge.libc_unix_hurd_lseek64(fd, offset, whence)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    UnixHurdJniBridge.libc_unix_hurd_lseek(fd, offset, whence)

public actual fun fgetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fgetpos64((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fseeko64((stream?.handle ?: 0L), offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fsetpos64((stream?.handle ?: 0L), (ptr?.value ?: 0L))

public actual fun ftello64(stream: FILE?): Off64T =
    UnixHurdJniBridge.libc_unix_hurd_ftello64((stream?.handle ?: 0L))

public actual fun bind(fd: CInt, addr: COpaquePointer?, len: SocklenT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_bind(fd, (addr?.value ?: 0L), len.toInt())

public actual fun accept4(fd: CInt, addr: COpaquePointer?, len: COpaquePointer?, flg: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_accept4(fd, (addr?.value ?: 0L), (len?.value ?: 0L), flg)

public actual fun ppoll(fds: COpaquePointer?, nfds: NfdsT, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_ppoll((fds?.value ?: 0L), nfds.toLong(), (timeout?.value ?: 0L), (sigmask?.value ?: 0L))

public actual fun recvmsg(fd: CInt, message: COpaquePointer?, flags: CInt): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_recvmsg(fd, (message?.value ?: 0L), flags)

public actual fun sendmsg(fd: CInt, message: COpaquePointer?, flags: CInt): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_sendmsg(fd, (message?.value ?: 0L), flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_recvfrom(socket, (buf?.value ?: 0L), len.toLong(), flags, (addr?.value ?: 0L), (addrlen?.value ?: 0L))

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_sendfile(outFd, inFd, (offset?.value ?: 0L), count.toLong())

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: COpaquePointer?, count: SizeT): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_sendfile64(outFd, inFd, (offset?.value ?: 0L), count.toLong())

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_shutdown(fd, how)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_sethostname(name, len.toLong())

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getdomainname((name?.value ?: 0L), len.toLong())

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_setdomainname(name, len.toLong())

public actual fun ifNameindex(): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_ifNameindex().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
    UnixHurdJniBridge.libc_unix_hurd_ifFreenameindex((ptr?.value ?: 0L))
}

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getifaddrs((ifap?.value ?: 0L))

public actual fun freeifaddrs(ifa: COpaquePointer?) {
    UnixHurdJniBridge.libc_unix_hurd_freeifaddrs((ifa?.value ?: 0L))
}

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_uname((buf?.value ?: 0L))

public actual fun gethostid(): CLong =
    UnixHurdJniBridge.libc_unix_hurd_gethostid()

public actual fun sethostid(hostid: CLong): CInt =
    UnixHurdJniBridge.libc_unix_hurd_sethostid(hostid)

public actual fun setpwent() {
    UnixHurdJniBridge.libc_unix_hurd_setpwent()
}

public actual fun endpwent() {
    UnixHurdJniBridge.libc_unix_hurd_endpwent()
}

public actual fun getpwent(): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getpwent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgrent() {
    UnixHurdJniBridge.libc_unix_hurd_setgrent()
}

public actual fun endgrent() {
    UnixHurdJniBridge.libc_unix_hurd_endgrent()
}

public actual fun getgrent(): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getgrent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setspent() {
    UnixHurdJniBridge.libc_unix_hurd_setspent()
}

public actual fun endspent() {
    UnixHurdJniBridge.libc_unix_hurd_endspent()
}

public actual fun getspent(): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getspent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getspnam(name: String?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getspnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getpwentR((pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getgrentR((grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun fgetpwentR(stream: FILE?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fgetpwentR((stream?.handle ?: 0L), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun fgetgrentR(stream: FILE?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fgetgrentR((stream?.handle ?: 0L), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun putpwent(p: COpaquePointer?, stream: FILE?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_putpwent((p?.value ?: 0L), (stream?.handle ?: 0L))

public actual fun putgrent(grp: COpaquePointer?, stream: FILE?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_putgrent((grp?.value ?: 0L), (stream?.handle ?: 0L))

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getpwnamR(name, (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getpwuidR(uid.toInt(), (pwd?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun fgetspentR(fp: FILE?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fgetspentR((fp?.handle ?: 0L), (spbuf?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (spbufp?.value ?: 0L))

public actual fun sgetspentR(s: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_sgetspentR(s, (spbuf?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (spbufp?.value ?: 0L))

public actual fun getspentR(spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getspentR((spbuf?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (spbufp?.value ?: 0L))

public actual fun getspnamR(name: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getspnamR(name, (spbuf?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (spbufp?.value ?: 0L))

public actual fun getmntentR(stream: FILE?, mntbuf: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getmntentR((stream?.handle ?: 0L), (mntbuf?.value ?: 0L), (buf?.value ?: 0L), buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utmpname(file: String?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_utmpname(file)

public actual fun utmpxname(file: String?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_utmpxname(file)

public actual fun getutxent(): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getutxent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getutxid((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getutxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_pututxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setutxent() {
    UnixHurdJniBridge.libc_unix_hurd_setutxent()
}

public actual fun endutxent() {
    UnixHurdJniBridge.libc_unix_hurd_endutxent()
}

public actual fun getresuid(ruid: COpaquePointer?, euid: COpaquePointer?, suid: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getresuid((ruid?.value ?: 0L), (euid?.value ?: 0L), (suid?.value ?: 0L))

public actual fun getresgid(rgid: COpaquePointer?, egid: COpaquePointer?, sgid: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getresgid((rgid?.value ?: 0L), (egid?.value ?: 0L), (sgid?.value ?: 0L))

public actual fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_setresuid(ruid.toInt(), euid.toInt(), suid.toInt())

public actual fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_setresgid(rgid.toInt(), egid.toInt(), sgid.toInt())

public actual fun initgroups(user: String?, group: GidT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_initgroups(user, group.toInt())

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getgrgid(gid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getgrgidR(gid.toInt(), (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrnam(name: String?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getgrnam(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getgrnamR(name, (grp?.value ?: 0L), (buf?.value ?: 0L), buflen.toLong(), (result?.value ?: 0L))

public actual fun getgrouplist(user: String?, group: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getgrouplist(user, group.toInt(), (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun setgroups(ngroups: SizeT, ptr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_setgroups(ngroups.toLong(), (ptr?.value ?: 0L))

public actual fun acct(filename: String?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_acct(filename)

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    UnixHurdJniBridge.libc_unix_hurd_setmntent(filename, ty).let { if (it == 0L) null else FILE(it) }

public actual fun getmntent(stream: FILE?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_getmntent((stream?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun addmntent(stream: FILE?, mnt: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_addmntent((stream?.handle ?: 0L), (mnt?.value ?: 0L))

public actual fun endmntent(streamp: FILE?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_endmntent((streamp?.handle ?: 0L))

public actual fun hasmntopt(mnt: COpaquePointer?, opt: String?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_hasmntopt((mnt?.value ?: 0L), opt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: FnCallback, value: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadCreate((native?.value ?: 0L), (attr?.value ?: 0L), 0L, (value?.value ?: 0L))

public actual fun pthreadKill(threadid: PthreadT, signo: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadKill(threadid, signo)

public actual fun pthreadCancel(thread: PthreadT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadCancel(thread)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadEqual(t1, t2)

public actual fun pthreadGetattrNp(thr: PthreadT, attr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadGetattrNp(thr, (attr?.value ?: 0L))

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadAttrGetguardsize((attr?.value ?: 0L), (guardsize?.value ?: 0L))

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadAttrSetguardsize((attr?.value ?: 0L), guardsize.toLong())

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadAttrGetstack((attr?.value ?: 0L), (stackaddr?.value ?: 0L), (stacksize?.value ?: 0L))

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadMutexattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadMutexattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadMutexTimedlock((lock?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadRwlockattrGetpshared((attr?.value ?: 0L), (value?.value ?: 0L))

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, value: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadRwlockattrSetpshared((attr?.value ?: 0L), value)

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadCondattrGetclock((attr?.value ?: 0L), (clockId?.value ?: 0L))

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadCondattrSetclock((attr?.value ?: 0L), clockId)

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadCondattrGetpshared((attr?.value ?: 0L), (pshared?.value ?: 0L))

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadCondattrSetpshared((attr?.value ?: 0L), pshared)

public actual fun pthreadOnce(control: COpaquePointer?, routine: FnCallback1): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadOnce((control?.value ?: 0L), 0L)

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadBarrierattrInit((attr?.value ?: 0L))

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadBarrierattrDestroy((attr?.value ?: 0L))

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, shared: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadBarrierattrGetpshared((attr?.value ?: 0L), (shared?.value ?: 0L))

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, shared: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadBarrierattrSetpshared((attr?.value ?: 0L), shared)

public actual fun pthreadBarrierInit(barrier: COpaquePointer?, attr: COpaquePointer?, count: CUint): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadBarrierInit((barrier?.value ?: 0L), (attr?.value ?: 0L), count.toInt())

public actual fun pthreadBarrierDestroy(barrier: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadBarrierDestroy((barrier?.value ?: 0L))

public actual fun pthreadBarrierWait(barrier: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadBarrierWait((barrier?.value ?: 0L))

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadSpinInit((lock?.value ?: 0L), pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadSpinDestroy((lock?.value ?: 0L))

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadSpinLock((lock?.value ?: 0L))

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadSpinTrylock((lock?.value ?: 0L))

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadSpinUnlock((lock?.value ?: 0L))

public actual fun pthreadAtfork(prepare: FnCallback1?, parent: FnCallback1?, child: FnCallback1?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadAtfork(0L, 0L, 0L)

public actual fun pthreadSigmask(how: CInt, newmask: COpaquePointer?, oldmask: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadSigmask(how, (newmask?.value ?: 0L), (oldmask?.value ?: 0L))

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_schedGetparam(pid, (param?.value ?: 0L))

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_schedSetparam(pid, (param?.value ?: 0L))

public actual fun schedGetscheduler(pid: PidT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_schedSetscheduler(pid, policy, (param?.value ?: 0L))

public actual fun pthreadGetschedparam(native: PthreadT, policy: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadGetschedparam(native, (policy?.value ?: 0L), (param?.value ?: 0L))

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadSetschedparam(native, policy, (param?.value ?: 0L))

public actual fun pthreadGetcpuclockid(thread: PthreadT, clkId: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_pthreadGetcpuclockid(thread, (clkId?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixHurdJniBridge.libc_unix_hurd_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_semDestroy((sem?.value ?: 0L))

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_semTimedwait((sem?.value ?: 0L), (abstime?.value ?: 0L))

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_semGetvalue((sem?.value ?: 0L), (sval?.value ?: 0L))

public actual fun clockGetres(clockId: ClockidT, res: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_clockGetres(clockId, (res?.value ?: 0L))

public actual fun clockGettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_clockGettime(clockId, (tp?.value ?: 0L))

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_clockSettime(clockId, (tp?.value ?: 0L))

public actual fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_clockGetcpuclockid(pid, (clkId?.value ?: 0L))

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_clockNanosleep(clkId, flags, (rqtp?.value ?: 0L), (rmtp?.value ?: 0L))

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_settimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_asctimeR((tm?.value ?: 0L), (buf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_ctimeR((timep?.value ?: 0L), (buf?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: COpaquePointer?): SizeT =
    UnixHurdJniBridge.libc_unix_hurd_strftime((s?.value ?: 0L), max.toLong(), format, (tm?.value ?: 0L)).toULong()

public actual fun strptime(s: String?, format: String?, tm: COpaquePointer?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_strptime(s, format, (tm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun timerCreate(clockid: ClockidT, sevp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_timerCreate(clockid, (sevp?.value ?: 0L), (timerid?.value ?: 0L))

public actual fun timerDelete(timerid: TimerT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_timerDelete(timerid.toLong())

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_timerGetoverrun(timerid.toLong())

public actual fun timerGettime(timerid: TimerT, currValue: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_timerGettime(timerid.toLong(), (currValue?.value ?: 0L))

public actual fun timerSettime(timerid: TimerT, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_timerSettime(timerid.toLong(), flags, (newValue?.value ?: 0L), (oldValue?.value ?: 0L))

public actual fun fstat(fd: CInt, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fstat(fd, (buf?.value ?: 0L))

public actual fun fstat64(fd: CInt, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fstat64(fd, (buf?.value ?: 0L))

public actual fun fstatat(fd: CInt, file: String?, buf: COpaquePointer?, flag: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fstatat(fd, file, (buf?.value ?: 0L), flag)

public actual fun fstatat64(fd: CInt, file: String?, buf: COpaquePointer?, flag: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fstatat64(fd, file, (buf?.value ?: 0L), flag)

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_statx(dirfd, pathname, flags, mask.toInt(), (statxbuf?.value ?: 0L))

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_ftruncate(fd, length)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    UnixHurdJniBridge.libc_unix_hurd_ftruncate64(fd, length)

public actual fun truncate64(file: String?, length: Off64T): CInt =
    UnixHurdJniBridge.libc_unix_hurd_truncate64(file, length)

public actual fun lstat(file: String?, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_lstat(file, (buf?.value ?: 0L))

public actual fun lstat64(file: String?, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_lstat64(file, (buf?.value ?: 0L))

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_statfs(path, (buf?.value ?: 0L))

public actual fun statfs64(file: String?, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_statfs64(file, (buf?.value ?: 0L))

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fstatfs(fd, (buf?.value ?: 0L))

public actual fun fstatfs64(fildes: CInt, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fstatfs64(fildes, (buf?.value ?: 0L))

public actual fun statvfs(file: String?, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_statvfs(file, (buf?.value ?: 0L))

public actual fun statvfs64(file: String?, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_statvfs64(file, (buf?.value ?: 0L))

public actual fun fstatvfs(fildes: CInt, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fstatvfs(fildes, (buf?.value ?: 0L))

public actual fun fstatvfs64(fildes: CInt, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fstatvfs64(fildes, (buf?.value ?: 0L))

public actual fun open(file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun open64(file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun openat(fd: CInt, file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun openat64(fd: CInt, file: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    UnixHurdJniBridge.libc_unix_hurd_fopen64(filename, mode).let { if (it == 0L) null else FILE(it) }

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    UnixHurdJniBridge.libc_unix_hurd_freopen64(filename, mode, (file?.handle ?: 0L)).let { if (it == 0L) null else FILE(it) }

public actual fun creat64(path: String?, mode: ModeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_creat64(path, mode.toInt())

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mkostemp((template?.value ?: 0L), flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mkostemps((template?.value ?: 0L), suffixlen, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mkstemps((template?.value ?: 0L), suffixlen)

public actual fun tmpfile64(): FILE? =
    UnixHurdJniBridge.libc_unix_hurd_tmpfile64().let { if (it == 0L) null else FILE(it) }

public actual fun popen(command: String?, mode: String?): FILE? =
    UnixHurdJniBridge.libc_unix_hurd_popen(command, mode).let { if (it == 0L) null else FILE(it) }

public actual fun getdtablesize(): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getdtablesize()

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_closeRange(first.toInt(), last.toInt(), flags)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixHurdJniBridge.libc_unix_hurd_forkpty((amaster?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun getpt(): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getpt()

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_ptsnameR(fd, (buf?.value ?: 0L), buflen.toLong())

public actual fun loginTty(fd: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_loginTty(fd)

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_ctermid((s?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clearenv(): CInt =
    UnixHurdJniBridge.libc_unix_hurd_clearenv()

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_execveat(dirfd, pathname, (argv?.value ?: 0L), (envp?.value ?: 0L), flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_execvpe(file, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fexecve(fd, (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_daemon(nochdir, noclose)

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawn((pid?.value ?: 0L), path, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnp((pid?.value ?: 0L), file, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrInit((attr?.value ?: 0L))

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrDestroy((attr?.value ?: 0L))

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrGetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrSetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrGetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrSetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrGetflags((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrSetflags((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrGetpgroup((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrSetpgroup((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrGetschedpolicy((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrSetschedpolicy((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrGetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnattrSetschedparam((attr?.value ?: 0L), (param?.value ?: 0L))

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnFileActionsInit((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnFileActionsDestroy((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnFileActionsAddopen((actions?.value ?: 0L), fd, path, oflag, mode.toInt())

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnFileActionsAddclose((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnFileActionsAdddup2((actions?.value ?: 0L), fd, newfd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnFileActionsAddchdirNp((actions?.value ?: 0L), path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnFileActionsAddfchdirNp((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: COpaquePointer?, from: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnFileActionsAddclosefromNp((actions?.value ?: 0L), from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: COpaquePointer?, tcfd: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixSpawnFileActionsAddtcsetpgrpNp((actions?.value ?: 0L), tcfd)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_shmOpen(name, oflag, mode.toInt())

public actual fun shmUnlink(name: String?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_shmUnlink(name)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_eaccess(pathname, mode)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_faccessat(dirfd, pathname, mode, flags)

public actual fun stat(file: String?, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_stat(file, (buf?.value ?: 0L))

public actual fun stat64(file: String?, buf: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_stat64(file, (buf?.value ?: 0L))

public actual fun readdir(dirp: DIR?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_readdir((dirp?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun readdir64(dirp: DIR?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_readdir64((dirp?.handle ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun readdirR(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_readdirR((dirp?.handle ?: 0L), (entry?.value ?: 0L), (result?.value ?: 0L))

public actual fun readdir64R(dirp: DIR?, entry: COpaquePointer?, result: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_readdir64R((dirp?.handle ?: 0L), (entry?.value ?: 0L), (result?.value ?: 0L))

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    UnixHurdJniBridge.libc_unix_hurd_seekdir((dirp?.handle ?: 0L), loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    UnixHurdJniBridge.libc_unix_hurd_telldir((dirp?.handle ?: 0L))

public actual fun dirfd(dirp: DIR?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_dirfd((dirp?.handle ?: 0L))

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_strerrorR(errnum, (buf?.value ?: 0L), buflen.toLong())

public actual fun errnoLocation(): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_errnoLocation().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_mmap64((addr?.value ?: 0L), len.toLong(), prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mremap(addr: COpaquePointer?, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_msync((addr?.value ?: 0L), len.toLong(), flags)

public actual fun sync() {
    UnixHurdJniBridge.libc_unix_hurd_sync()
}

public actual fun syncfs(fd: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_syncfs(fd)

public actual fun fdatasync(fd: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fdatasync(fd)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixFallocate64(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixFadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixFadvise64(fd, offset, len, advise)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_madvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_posixMadvise((addr?.value ?: 0L), len.toLong(), advice)

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getrlimit(resource.toInt(), (rlim?.value ?: 0L))

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getrlimit64(resource.toInt(), (rlim?.value ?: 0L))

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_setrlimit(resource.toInt(), (rlim?.value ?: 0L))

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_setrlimit64(resource.toInt(), (rlim?.value ?: 0L))

public actual fun getpriority(which: PriorityWhich, who: IdT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getpriority(which.toInt(), who.toInt())

public actual fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_setpriority(which.toInt(), who.toInt(), prio)

public actual fun getrandom(buffer: COpaquePointer?, length: SizeT, flags: CUint): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_getrandom((buffer?.value ?: 0L), length.toLong(), flags.toInt())

public actual fun getentropy(buffer: COpaquePointer?, length: SizeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getentropy((buffer?.value ?: 0L), length.toLong())

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_memrchr((cx?.value ?: 0L), c, n.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_memmem((haystack?.value ?: 0L), haystacklen.toLong(), (needle?.value ?: 0L), needlelen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_strchrnul(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_abs(i)

public actual fun labs(i: CLong): CLong =
    UnixHurdJniBridge.libc_unix_hurd_labs(i)

public actual fun rand(): CInt =
    UnixHurdJniBridge.libc_unix_hurd_rand()

public actual fun srand(seed: CUint) {
    UnixHurdJniBridge.libc_unix_hurd_srand(seed.toInt())
}

public actual fun drand48(): CDouble =
    UnixHurdJniBridge.libc_unix_hurd_drand48()

public actual fun erand48(xseed: COpaquePointer?): CDouble =
    UnixHurdJniBridge.libc_unix_hurd_erand48((xseed?.value ?: 0L))

public actual fun lrand48(): CLong =
    UnixHurdJniBridge.libc_unix_hurd_lrand48()

public actual fun nrand48(xseed: COpaquePointer?): CLong =
    UnixHurdJniBridge.libc_unix_hurd_nrand48((xseed?.value ?: 0L))

public actual fun mrand48(): CLong =
    UnixHurdJniBridge.libc_unix_hurd_mrand48()

public actual fun jrand48(xseed: COpaquePointer?): CLong =
    UnixHurdJniBridge.libc_unix_hurd_jrand48((xseed?.value ?: 0L))

public actual fun srand48(seed: CLong) {
    UnixHurdJniBridge.libc_unix_hurd_srand48(seed)
}

public actual fun seed48(xseed: COpaquePointer?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_seed48((xseed?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lcong48(p: COpaquePointer?) {
    UnixHurdJniBridge.libc_unix_hurd_lcong48((p?.value ?: 0L))
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback2?, arg: COpaquePointer?) {
    UnixHurdJniBridge.libc_unix_hurd_qsortR((base?.value ?: 0L), num.toLong(), size.toLong(), 0L, (arg?.value ?: 0L))
}

public actual fun brk(addr: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_brk((addr?.value ?: 0L))

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallopt(param: CInt, value: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mallopt(param, value)

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallinfo2(): Mallinfo2 =
    Mallinfo2()

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mallocInfo(options, (stream?.handle ?: 0L))

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    UnixHurdJniBridge.libc_unix_hurd_mallocUsableSize((ptr?.value ?: 0L)).toULong()

public actual fun mallocTrim(pad: SizeT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_mallocTrim(pad.toLong())

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    UnixHurdJniBridge.libc_unix_hurd_iconvOpen(tocode, fromcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    UnixHurdJniBridge.libc_unix_hurd_iconv((cd?.value ?: 0L), (inbuf?.value ?: 0L), (inbytesleft?.value ?: 0L), (outbuf?.value ?: 0L), (outbytesleft?.value ?: 0L)).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixHurdJniBridge.libc_unix_hurd_iconvClose((cd?.value ?: 0L))

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getoptLong(argc, (argv?.value ?: 0L), optstring, (longopts?.value ?: 0L), (longindex?.value ?: 0L))

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_backtrace((buf?.value ?: 0L), sz)

public actual fun reboot(howTo: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_reboot(howTo)

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_getloadavg((loadavg?.value ?: 0L), nelem)

public actual fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_regexec((preg?.value ?: 0L), input, nmatch.toLong(), (pmatch?.value ?: 0L), eflags)

public actual fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    UnixHurdJniBridge.libc_unix_hurd_regerror(errcode, (preg?.value ?: 0L), (errbuf?.value ?: 0L), errbufSize.toLong()).toULong()

public actual fun regfree(preg: COpaquePointer?) {
    UnixHurdJniBridge.libc_unix_hurd_regfree((preg?.value ?: 0L))
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: FnCallback3?, pglob: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_glob(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree(pglob: COpaquePointer?) {
    UnixHurdJniBridge.libc_unix_hurd_globfree((pglob?.value ?: 0L))
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: FnCallback3?, pglob: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_glob64(pattern, flags, 0L, (pglob?.value ?: 0L))

public actual fun globfree64(pglob: COpaquePointer?) {
    UnixHurdJniBridge.libc_unix_hurd_globfree64((pglob?.value ?: 0L))
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_getxattr(path, name, (value?.value ?: 0L), size.toLong())

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_lgetxattr(path, name, (value?.value ?: 0L), size.toLong())

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_fgetxattr(filedes, name, (value?.value ?: 0L), size.toLong())

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_setxattr(path, name, (value?.value ?: 0L), size.toLong(), flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_lsetxattr(path, name, (value?.value ?: 0L), size.toLong(), flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fsetxattr(filedes, name, (value?.value ?: 0L), size.toLong(), flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_listxattr(path, (list?.value ?: 0L), size.toLong())

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_llistxattr(path, (list?.value ?: 0L), size.toLong())

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    UnixHurdJniBridge.libc_unix_hurd_flistxattr(filedes, (list?.value ?: 0L), size.toLong())

public actual fun removexattr(path: String?, name: String?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_fremovexattr(filedes, name)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_dirname((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_posixBasename((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuBasename(path: String?): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_gnuBasename(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_dlmopen(lmid, filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_dlinfo((handle?.value ?: 0L), request, (info?.value ?: 0L))

public actual fun dladdr1(addr: COpaquePointer?, info: COpaquePointer?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    UnixHurdJniBridge.libc_unix_hurd_dladdr1((addr?.value ?: 0L), (info?.value ?: 0L), (extraInfo?.value ?: 0L), flags)

public actual fun duplocale(base: LocaleT): LocaleT =
    UnixHurdJniBridge.libc_unix_hurd_duplocale((base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freelocale(loc: LocaleT) {
    UnixHurdJniBridge.libc_unix_hurd_freelocale((loc?.value ?: 0L))
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    UnixHurdJniBridge.libc_unix_hurd_newlocale(mask, locale, (base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    UnixHurdJniBridge.libc_unix_hurd_uselocale((loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_nlLanginfoL(item, (locale?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlIteratePhdr(callback: FnCallback4?, data: COpaquePointer?): CInt =
    UnixHurdJniBridge.libc_unix_hurd_dlIteratePhdr(0L, (data?.value ?: 0L))

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_gnuGetLibcRelease().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    UnixHurdJniBridge.libc_unix_hurd_gnuGetLibcVersion().let { if (it == 0L) null else COpaquePointer(it) }
