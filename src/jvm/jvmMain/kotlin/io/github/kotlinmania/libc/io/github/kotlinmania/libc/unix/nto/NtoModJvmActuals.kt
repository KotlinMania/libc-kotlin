package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.COpaquePointer

internal object NtoModRawLibc {
    external fun sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int
    external fun recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int
    external fun semDestroy(sem: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun fdatasync(fd: Int): Int
    external fun getpriority(which: Int, who: Long): Int
    external fun setpriority(which: Int, who: Long, prio: Int): Int
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun mknodat(fd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun clockGetres(clkId: Long, tp: Long): Int
    external fun clockGettime(clkId: Long, tp: Long): Int
    external fun clockSettime(clkId: Long, tp: Long): Int
    external fun clockGetcpuclockid(pid: Int, clkId: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun memalign(align: Long, size: Long): Long?
    external fun setgroups(ngroups: Int, ptr: Long): Int
    external fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun nlLanginfo(item: Long): Long?
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadRwlockattrGetpshared(attr: Long, value: Long): Int
    external fun pthreadRwlockattrSetpshared(attr: Long, value: Int): Int
    external fun ptsnameR(fd: Int, buf: Long, buflen: Long): Long?
    external fun clearenv(): Int
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun wait4(pid: Int, status: Long, options: Int, rusage: Long): Int
    external fun execvpe(file: String?, argv: Long, envp: Long): Int
    external fun getifaddrs(ifap: Long): Int
    external fun freeifaddrs(ifa: Long)
    external fun bind(socket: Int, address: Long, addressLen: Long): Int
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun sendmsg(fd: Int, msg: Long, flags: Int): Long
    external fun recvmsg(fd: Int, msg: Long, flags: Int): Long
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int
    external fun loginTty(fd: Int): Int
    external fun uname(buf: Long): Int
    external fun getpeereid(socket: Int, euid: Long, egid: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun abs(i: Int): Int
    external fun labs(i: Long): Long
    external fun rand(): Int
    external fun srand(seed: Int)
    external fun setpwent()
    external fun endpwent()
    external fun getpwent(): Long?
    external fun setgrent()
    external fun endgrent()
    external fun getgrent(): Long?
    external fun setspent()
    external fun endspent()
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun ftok(pathname: String?, projId: Int): Long
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun mkostemp(template: Long, flags: Int): Int
    external fun mkostemps(template: Long, suffixlen: Int, flags: Int): Int
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
    external fun sigwaitinfo(set: Long, info: Long): Int
    external fun pthreadSetschedprio(native: Long, priority: Int): Int
    external fun ifNameindex(): Long?
    external fun ifFreenameindex(ptr: Long)
    external fun glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree(pglob: Long)
    external fun posixMadvise(addr: Long, len: Long, advice: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun mkstemps(template: Long, suffixlen: Int): Int
    external fun getdomainname(name: Long, len: Long): Int
    external fun setdomainname(name: String?, len: Long): Int
    external fun sync()
    external fun pthreadGetschedparam(native: Long, policy: Long, param: Long): Int
    external fun umount(target: String?, flags: Int): Int
    external fun schedGetPriorityMax(policy: Int): Int
    external fun settimeofday(tv: Long, tz: Long): Int
    external fun schedRrGetInterval(pid: Int, tp: Long): Int
    external fun semTimedwait(sem: Long, abstime: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
    external fun schedSetparam(pid: Int, param: Long): Int
    external fun mount(specialDevice: String?, mountDirectory: String?, flags: Int, mountType: String?, mountData: Long, mountDatalen: Int): Int
    external fun schedGetparam(pid: Int, param: Long): Int
    external fun pthreadMutexConsistent(mutex: Long): Int
    external fun pthreadMutexTimedlock(lock: Long, abstime: Long): Int
    external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    external fun pthreadSpinDestroy(lock: Long): Int
    external fun pthreadSpinLock(lock: Long): Int
    external fun pthreadSpinTrylock(lock: Long): Int
    external fun pthreadSpinUnlock(lock: Long): Int
    external fun pthreadBarrierattrInit(attr: Long): Int
    external fun pthreadBarrierattrDestroy(attr: Long): Int
    external fun pthreadBarrierattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadBarrierattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int
    external fun pthreadBarrierDestroy(barrier: Long): Int
    external fun pthreadBarrierWait(barrier: Long): Int
    external fun schedGetscheduler(pid: Int): Int
    external fun clockNanosleep(clkId: Long, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int
    external fun sethostname(name: String?, len: Long): Int
    external fun schedGetPriorityMin(policy: Int): Int
    external fun pthreadCondattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadSetschedparam(native: Long, policy: Int, param: Long): Int
    external fun schedSetscheduler(pid: Int, policy: Int, param: Long): Int
    external fun sigsuspend(mask: Long): Int
    external fun getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun semClose(sem: Long): Int
    external fun getdtablesize(): Int
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun initgroups(user: String?, group: Int): Int
    external fun pthreadSigmask(how: Int, set: Long, oldset: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun pthreadCancel(thread: Long): Int
    external fun pthreadKill(thread: Long, sig: Int): Int
    external fun semUnlink(name: String?): Int
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun sigwait(set: Long, sig: Long): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun getgrgid(gid: Int): Long?
    external fun getgrouplist(user: String?, group: Int, groups: Long, ngroups: Long): Int
    external fun pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadMutexattrGetrobust(attr: Long, robustness: Long): Int
    external fun pthreadMutexattrSetrobust(attr: Long, robustness: Int): Int
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun getitimer(which: Int, currValue: Long): Int
    external fun setitimer(which: Int, value: Long, ovalue: Long): Int
    external fun posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnattrInit(attr: Long): Int
    external fun posixSpawnattrDestroy(attr: Long): Int
    external fun posixSpawnattrGetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrGetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrGetflags(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetflags(attr: Long, flags: Short): Int
    external fun posixSpawnattrGetpgroup(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetpgroup(attr: Long, flags: Int): Int
    external fun posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int
    external fun posixSpawnattrGetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnattrSetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnFileActionsInit(actions: Long): Int
    external fun posixSpawnFileActionsDestroy(actions: Long): Int
    external fun posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int
    external fun posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int
    external fun posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int
    external fun popen(command: String?, mode: String?): Long?
    external fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun inotifyRmWatch(fd: Int, wd: Int): Int
    external fun inotifyInit(): Int
    external fun inotifyAddWatch(fd: Int, path: String?, mask: Int): Int
    external fun gettid(): Int
    external fun pthreadGetcpuclockid(thread: Long, clkId: Long): Int
    external fun getnameinfo(sa: Long, salen: Long, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun mallopt(param: Int, value: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun ctermid(s: Long): Long?
    external fun mallinfo(): Long
    external fun getpwentR(pwd: Long, buf: Long, bufsize: Int, result: Long): Int
    external fun pthreadGetnameNp(thread: Long, name: Long, len: Int): Int
    external fun pthreadSetnameNp(thread: Long, name: String?): Int
    external fun sysctl(arg0: Long, arg1: Int, arg2: Long, arg3: Long, arg4: Long, arg5: Long): Int
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit(resource: Int, rlp: Long): Int
    external fun lioListio(mode: Int, list: Long, nent: Int, sig: Long): Int
    external fun dlIteratePhdr(callback: Long, data: Long): Int
    external fun memsetS(s: Long, smax: Long, c: Int, n: Long): Int
    external fun regcomp(preg: Long, pattern: String?, cflags: Int): Int
    external fun regexec(preg: Long, str: String?, nmatch: Long, pmatch: Long, eflags: Int): Int
    external fun regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long
    external fun regfree(preg: Long)
    external fun dirfd(dirp: Long): Int
    external fun aioCancel(fd: Int, aiocbp: Long): Int
    external fun aioError(aiocbp: Long): Int
    external fun aioFsync(operation: Int, aiocbp: Long): Int
    external fun aioRead(aiocbp: Long): Int
    external fun aioReturn(aiocpb: Long): Long
    external fun aioSuspend(list: Long, nent: Int, timeout: Long): Int
    external fun aioWrite(aiocpb: Long): Int
    external fun mqClose(mqdes: Long): Int
    external fun mqGetattr(mqdes: Long, mqstat: Long): Int
    external fun mqNotify(mqdes: Long, notification: Long): Int
    external fun mqReceive(mqdes: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long
    external fun mqSend(mqdes: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int
    external fun mqSetattr(mqdes: Long, mqstat: Long, omqstat: Long): Int
    external fun mqTimedreceive(mqdes: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long
    external fun mqTimedsend(mqdes: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int
    external fun mqUnlink(name: String?): Int
    external fun getErrnoPtr(): Long?
    external fun myThreadExit(valuePtr: Long)
    external fun cxaAtexit(cb: Long, arg: Long, dso: Long): Int
}

public actual fun sendmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CUint): CInt =
    NtoModRawLibc.sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CUint, timeout: Timespec?): CInt =
    NtoModRawLibc.recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)

public actual fun semDestroy(sem: SyncT?): CInt =
    NtoModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semInit(sem: SyncT?, pshared: CInt, value: CUint): CInt =
    NtoModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun fdatasync(fd: CInt): CInt =
    NtoModRawLibc.fdatasync(fd)

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    NtoModRawLibc.getpriority(which, who)

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    NtoModRawLibc.setpriority(which, who, prio)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    NtoModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(fd: CInt, pathname: String?, mode: ModeT, dev: io.github.kotlinmania.libc.DevT): CInt =
    NtoModRawLibc.mknodat(fd, pathname, mode, dev)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    NtoModRawLibc.clockGetres(clkId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    NtoModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    NtoModRawLibc.clockSettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockGetcpuclockid(pid: PidT, clkId: CInt?): CInt =
    NtoModRawLibc.clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    NtoModRawLibc.pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    NtoModRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    NtoModRawLibc.setgroups(ngroups, ptr?.toLong() ?: 0L)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    NtoModRawLibc.posixFadvise(fd, offset, len, advise)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    NtoModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    NtoModRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    NtoModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.SyncAttr?, clockId: CInt?): CInt =
    NtoModRawLibc.pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.SyncAttr?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    NtoModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt): CInt =
    NtoModRawLibc.pthreadCondattrSetpshared(attr?.toLong() ?: 0L, pshared)

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt): CInt =
    NtoModRawLibc.pthreadMutexattrSetpshared(attr?.toLong() ?: 0L, pshared)

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, value: CInt?): CInt =
    NtoModRawLibc.pthreadRwlockattrGetpshared(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, value: CInt): CInt =
    NtoModRawLibc.pthreadRwlockattrSetpshared(attr?.toLong() ?: 0L, value)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): COpaquePointer? =
    NtoModRawLibc.ptsnameR(fd, buf?.value ?: 0L, buflen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clearenv(): CInt =
    NtoModRawLibc.clearenv()

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    NtoModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    NtoModRawLibc.wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    NtoModRawLibc.execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    NtoModRawLibc.getifaddrs(ifap?.value ?: 0L)

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    NtoModRawLibc.freeifaddrs(ifa?.toLong() ?: 0L)
}

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    NtoModRawLibc.bind(socket, address?.toLong() ?: 0L, addressLen)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    NtoModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    NtoModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    NtoModRawLibc.sendmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    NtoModRawLibc.recvmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    NtoModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    NtoModRawLibc.forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun loginTty(fd: CInt): CInt =
    NtoModRawLibc.loginTty(fd)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    NtoModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    NtoModRawLibc.getpeereid(socket, euid?.toLong() ?: 0L, egid?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    NtoModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun abs(i: CInt): CInt =
    NtoModRawLibc.abs(i)

public actual fun labs(i: CLong): CLong =
    NtoModRawLibc.labs(i)

public actual fun rand(): CInt =
    NtoModRawLibc.rand()

public actual fun srand(seed: CUint) {
    NtoModRawLibc.srand(seed)
}

public actual fun setpwent() {
    NtoModRawLibc.setpwent()
}

public actual fun endpwent() {
    NtoModRawLibc.endpwent()
}

public actual fun getpwent(): Passwd? =
    NtoModRawLibc.getpwent()

public actual fun setgrent() {
    NtoModRawLibc.setgrent()
}

public actual fun endgrent() {
    NtoModRawLibc.endgrent()
}

public actual fun getgrent(): Group? =
    NtoModRawLibc.getgrent()

public actual fun setspent() {
    NtoModRawLibc.setspent()
}

public actual fun endspent() {
    NtoModRawLibc.endspent()
}

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    NtoModRawLibc.shmOpen(name, oflag, mode)

public actual fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT =
    NtoModRawLibc.ftok(pathname, projId)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    NtoModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    NtoModRawLibc.posixFallocate(fd, offset, len)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    NtoModRawLibc.mkostemp(template?.value ?: 0L, flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    NtoModRawLibc.mkostemps(template?.value ?: 0L, suffixlen, flags)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    NtoModRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    NtoModRawLibc.sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun pthreadSetschedprio(native: io.github.kotlinmania.libc.PthreadT, priority: CInt): CInt =
    NtoModRawLibc.pthreadSetschedprio(native, priority)

public actual fun ifNameindex(): IfNameindex? =
    NtoModRawLibc.ifNameindex()

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    NtoModRawLibc.ifFreenameindex(ptr?.toLong() ?: 0L)
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    NtoModRawLibc.glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    NtoModRawLibc.globfree(pglob?.toLong() ?: 0L)
}

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    NtoModRawLibc.posixMadvise(addr?.value ?: 0L, len, advice)

public actual fun shmUnlink(name: String?): CInt =
    NtoModRawLibc.shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    NtoModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    NtoModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    NtoModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    NtoModRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    NtoModRawLibc.mkstemps(template?.value ?: 0L, suffixlen)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    NtoModRawLibc.getdomainname(name?.value ?: 0L, len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    NtoModRawLibc.setdomainname(name, len)

public actual fun sync() {
    NtoModRawLibc.sync()
}

public actual fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    NtoModRawLibc.pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun umount(target: String?, flags: CInt): CInt =
    NtoModRawLibc.umount(target, flags)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    NtoModRawLibc.schedGetPriorityMax(policy)

public actual fun settimeofday(tv: Timeval?, tz: COpaquePointer?): CInt =
    NtoModRawLibc.settimeofday(tv?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    NtoModRawLibc.schedRrGetInterval(pid, tp?.toLong() ?: 0L)

public actual fun semTimedwait(sem: SyncT?, abstime: Timespec?): CInt =
    NtoModRawLibc.semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun semGetvalue(sem: SyncT?, sval: CInt?): CInt =
    NtoModRawLibc.semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)

public actual fun schedSetparam(pid: PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    NtoModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun mount(specialDevice: String?, mountDirectory: String?, flags: CInt, mountType: String?, mountData: COpaquePointer?, mountDatalen: CInt): CInt =
    NtoModRawLibc.mount(specialDevice, mountDirectory, flags, mountType, mountData?.value ?: 0L, mountDatalen)

public actual fun schedGetparam(pid: PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    NtoModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun pthreadMutexConsistent(mutex: io.github.kotlinmania.libc.SyncT?): CInt =
    NtoModRawLibc.pthreadMutexConsistent(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.SyncT?, abstime: Timespec?): CInt =
    NtoModRawLibc.pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadSpinInit(lock: SyncT?, pshared: CInt): CInt =
    NtoModRawLibc.pthreadSpinInit(lock?.toLong() ?: 0L, pshared)

public actual fun pthreadSpinDestroy(lock: SyncT?): CInt =
    NtoModRawLibc.pthreadSpinDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadSpinLock(lock: SyncT?): CInt =
    NtoModRawLibc.pthreadSpinLock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinTrylock(lock: SyncT?): CInt =
    NtoModRawLibc.pthreadSpinTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinUnlock(lock: SyncT?): CInt =
    NtoModRawLibc.pthreadSpinUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadBarrierattrInit(attr: SyncAttr?): CInt =
    NtoModRawLibc.pthreadBarrierattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadBarrierattrDestroy(attr: SyncAttr?): CInt =
    NtoModRawLibc.pthreadBarrierattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadBarrierattrGetpshared(attr: SyncAttr?, pshared: CInt?): CInt =
    NtoModRawLibc.pthreadBarrierattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadBarrierattrSetpshared(attr: SyncAttr?, pshared: CInt): CInt =
    NtoModRawLibc.pthreadBarrierattrSetpshared(attr?.toLong() ?: 0L, pshared)

public actual fun pthreadBarrierInit(barrier: io.github.kotlinmania.libc.PthreadBarrierT?, attr: SyncAttr?, count: CUint): CInt =
    NtoModRawLibc.pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.toLong() ?: 0L, count)

public actual fun pthreadBarrierDestroy(barrier: io.github.kotlinmania.libc.PthreadBarrierT?): CInt =
    NtoModRawLibc.pthreadBarrierDestroy(barrier?.toLong() ?: 0L)

public actual fun pthreadBarrierWait(barrier: io.github.kotlinmania.libc.PthreadBarrierT?): CInt =
    NtoModRawLibc.pthreadBarrierWait(barrier?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    NtoModRawLibc.schedGetscheduler(pid)

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    NtoModRawLibc.clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT?): CInt =
    NtoModRawLibc.pthreadAttrGetguardsize(attr?.toLong() ?: 0L, guardsize?.toLong() ?: 0L)

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.PthreadAttrT?, guardsize: SizeT): CInt =
    NtoModRawLibc.pthreadAttrSetguardsize(attr?.toLong() ?: 0L, guardsize)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    NtoModRawLibc.sethostname(name, len)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    NtoModRawLibc.schedGetPriorityMin(policy)

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt?): CInt =
    NtoModRawLibc.pthreadCondattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    NtoModRawLibc.pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    NtoModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt =
    NtoModRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    NtoModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun semClose(sem: SyncT?): CInt =
    NtoModRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun getdtablesize(): CInt =
    NtoModRawLibc.getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    NtoModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun initgroups(user: String?, group: GidT): CInt =
    NtoModRawLibc.initgroups(user, group)

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    NtoModRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun getgrnam(name: String?): Group? =
    NtoModRawLibc.getgrnam(name)

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    NtoModRawLibc.pthreadCancel(thread)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    NtoModRawLibc.pthreadKill(thread, sig)

public actual fun semUnlink(name: String?): CInt =
    NtoModRawLibc.semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    NtoModRawLibc.daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    NtoModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    NtoModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    NtoModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun pthreadAtfork(prepare: FnCallback?, parent: FnCallback?, child: FnCallback?): CInt =
    NtoModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun getgrgid(gid: GidT): Group? =
    NtoModRawLibc.getgrgid(gid)

public actual fun getgrouplist(user: String?, group: GidT, groups: GidT?, ngroups: CInt?): CInt =
    NtoModRawLibc.getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.SyncAttr?, pshared: CInt?): CInt =
    NtoModRawLibc.pthreadMutexattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.SyncAttr?, robustness: CInt?): CInt =
    NtoModRawLibc.pthreadMutexattrGetrobust(attr?.toLong() ?: 0L, robustness?.toLong() ?: 0L)

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.SyncAttr?, robustness: CInt): CInt =
    NtoModRawLibc.pthreadMutexattrSetrobust(attr?.toLong() ?: 0L, robustness)

public actual fun pthreadCreate(native: CInt?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    NtoModRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    NtoModRawLibc.getitimer(which, currValue?.toLong() ?: 0L)

public actual fun setitimer(which: CInt, value: Itimerval?, ovalue: Itimerval?): CInt =
    NtoModRawLibc.setitimer(which, value?.toLong() ?: 0L, ovalue?.toLong() ?: 0L)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: UintptrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    NtoModRawLibc.posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: UintptrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    NtoModRawLibc.posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnattrInit(attr: UintptrT?): CInt =
    NtoModRawLibc.posixSpawnattrInit(attr?.toLong() ?: 0L)

public actual fun posixSpawnattrDestroy(attr: UintptrT?): CInt =
    NtoModRawLibc.posixSpawnattrDestroy(attr?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigdefault(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    NtoModRawLibc.posixSpawnattrGetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigdefault(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    NtoModRawLibc.posixSpawnattrSetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigmask(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    NtoModRawLibc.posixSpawnattrGetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigmask(attr: UintptrT?, default: io.github.kotlinmania.libc.SigsetT?): CInt =
    NtoModRawLibc.posixSpawnattrSetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetflags(attr: UintptrT?, flags: CShort?): CInt =
    NtoModRawLibc.posixSpawnattrGetflags(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetflags(attr: UintptrT?, flags: CShort): CInt =
    NtoModRawLibc.posixSpawnattrSetflags(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetpgroup(attr: UintptrT?, flags: PidT?): CInt =
    NtoModRawLibc.posixSpawnattrGetpgroup(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetpgroup(attr: UintptrT?, flags: PidT): CInt =
    NtoModRawLibc.posixSpawnattrSetpgroup(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: UintptrT?, flags: CInt?): CInt =
    NtoModRawLibc.posixSpawnattrGetschedpolicy(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedpolicy(attr: UintptrT?, flags: CInt): CInt =
    NtoModRawLibc.posixSpawnattrSetschedpolicy(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetschedparam(attr: UintptrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    NtoModRawLibc.posixSpawnattrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedparam(attr: UintptrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    NtoModRawLibc.posixSpawnattrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    NtoModRawLibc.posixSpawnFileActionsInit(actions?.value ?: 0L)

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    NtoModRawLibc.posixSpawnFileActionsDestroy(actions?.value ?: 0L)

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    NtoModRawLibc.posixSpawnFileActionsAddopen(actions?.value ?: 0L, fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    NtoModRawLibc.posixSpawnFileActionsAddclose(actions?.value ?: 0L, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    NtoModRawLibc.posixSpawnFileActionsAdddup2(actions?.value ?: 0L, fd, newfd)

public actual fun popen(command: String?, mode: String?): FILE? =
    NtoModRawLibc.popen(command, mode)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    NtoModRawLibc.faccessat(dirfd, pathname, mode, flags)

public actual fun inotifyRmWatch(fd: CInt, wd: CInt): CInt =
    NtoModRawLibc.inotifyRmWatch(fd, wd)

public actual fun inotifyInit(): CInt =
    NtoModRawLibc.inotifyInit()

public actual fun inotifyAddWatch(fd: CInt, path: String?, mask: UInt): CInt =
    NtoModRawLibc.inotifyAddWatch(fd, path, mask)

public actual fun gettid(): PidT =
    NtoModRawLibc.gettid()

public actual fun pthreadGetcpuclockid(thread: io.github.kotlinmania.libc.PthreadT, clkId: CInt?): CInt =
    NtoModRawLibc.pthreadGetcpuclockid(thread, clkId?.toLong() ?: 0L)

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    NtoModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun mallopt(param: CInt, value: Long): CInt =
    NtoModRawLibc.mallopt(param, value)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    NtoModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    NtoModRawLibc.ctermid(s?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    NtoModRawLibc.mallinfo()

public actual fun getpwentR(pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, bufsize: CInt, result: COpaquePointer?): CInt =
    NtoModRawLibc.getpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, bufsize, result?.value ?: 0L)

public actual fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: CInt): CInt =
    NtoModRawLibc.pthreadGetnameNp(thread, name?.value ?: 0L, len)

public actual fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    NtoModRawLibc.pthreadSetnameNp(thread, name)

public actual fun sysctl(arg0: CInt?, arg1: CUint, arg2: COpaquePointer?, arg3: SizeT?, arg4: COpaquePointer?, arg5: SizeT): CInt =
    NtoModRawLibc.sysctl(arg0?.toLong() ?: 0L, arg1, arg2?.value ?: 0L, arg3?.toLong() ?: 0L, arg4?.value ?: 0L, arg5)

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    NtoModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: CInt, rlp: Rlimit?): CInt =
    NtoModRawLibc.setrlimit(resource, rlp?.toLong() ?: 0L)

public actual fun lioListio(mode: CInt, list: COpaquePointer?, nent: CInt, sig: Sigevent?): CInt =
    NtoModRawLibc.lioListio(mode, list?.value ?: 0L, nent, sig?.toLong() ?: 0L)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    NtoModRawLibc.dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    NtoModRawLibc.memsetS(s?.value ?: 0L, smax, c, n)

public actual fun regcomp(preg: io.github.kotlinmania.libc.RegexT?, pattern: String?, cflags: CInt): CInt =
    NtoModRawLibc.regcomp(preg?.toLong() ?: 0L, pattern, cflags)

public actual fun regexec(preg: io.github.kotlinmania.libc.RegexT?, str: String?, nmatch: SizeT, pmatch: io.github.kotlinmania.libc.RegmatchT?, eflags: CInt): CInt =
    NtoModRawLibc.regexec(preg?.toLong() ?: 0L, str, nmatch, pmatch?.toLong() ?: 0L, eflags)

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    NtoModRawLibc.regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)

public actual fun regfree(preg: io.github.kotlinmania.libc.RegexT?) {
    NtoModRawLibc.regfree(preg?.toLong() ?: 0L)
}

public actual fun dirfd(dirp: DIR?): CInt =
    NtoModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun aioCancel(fd: CInt, aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    NtoModRawLibc.aioCancel(fd, aiocbp?.toLong() ?: 0L)

public actual fun aioError(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    NtoModRawLibc.aioError(aiocbp?.toLong() ?: 0L)

public actual fun aioFsync(operation: CInt, aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    NtoModRawLibc.aioFsync(operation, aiocbp?.toLong() ?: 0L)

public actual fun aioRead(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    NtoModRawLibc.aioRead(aiocbp?.toLong() ?: 0L)

public actual fun aioReturn(aiocpb: io.github.kotlinmania.libc.Aiocb?): SsizeT =
    NtoModRawLibc.aioReturn(aiocpb?.toLong() ?: 0L)

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt =
    NtoModRawLibc.aioSuspend(list?.value ?: 0L, nent, timeout?.toLong() ?: 0L)

public actual fun aioWrite(aiocpb: io.github.kotlinmania.libc.Aiocb?): CInt =
    NtoModRawLibc.aioWrite(aiocpb?.toLong() ?: 0L)

public actual fun mqClose(mqdes: io.github.kotlinmania.libc.MqdT): CInt =
    NtoModRawLibc.mqClose(mqdes)

public actual fun mqGetattr(mqdes: io.github.kotlinmania.libc.MqdT, mqstat: io.github.kotlinmania.libc.MqAttr?): CInt =
    NtoModRawLibc.mqGetattr(mqdes, mqstat?.toLong() ?: 0L)

public actual fun mqNotify(mqdes: io.github.kotlinmania.libc.MqdT, notification: io.github.kotlinmania.libc.Sigevent?): CInt =
    NtoModRawLibc.mqNotify(mqdes, notification?.toLong() ?: 0L)

public actual fun mqReceive(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    NtoModRawLibc.mqReceive(mqdes, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)

public actual fun mqSend(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    NtoModRawLibc.mqSend(mqdes, msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqdes: io.github.kotlinmania.libc.MqdT, mqstat: MqAttr?, omqstat: MqAttr?): CInt =
    NtoModRawLibc.mqSetattr(mqdes, mqstat?.toLong() ?: 0L, omqstat?.toLong() ?: 0L)

public actual fun mqTimedreceive(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    NtoModRawLibc.mqTimedreceive(mqdes, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)

public actual fun mqTimedsend(mqdes: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    NtoModRawLibc.mqTimedsend(mqdes, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)

public actual fun mqUnlink(name: String?): CInt =
    NtoModRawLibc.mqUnlink(name)

public actual fun getErrnoPtr(): CInt? =
    NtoModRawLibc.getErrnoPtr()

public actual fun myThreadExit(valuePtr: COpaquePointer?) {
    NtoModRawLibc.myThreadExit(valuePtr?.value ?: 0L)
}

public actual fun cxaAtexit(cb: FnCallback, arg: COpaquePointer?, dso: COpaquePointer?): CInt =
    NtoModRawLibc.cxaAtexit(cb, arg?.value ?: 0L, dso?.value ?: 0L)
