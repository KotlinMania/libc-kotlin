package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.COpaquePointer

internal object AixModRawLibc {
    external fun thrKill(id: Long, sig: Int): Int
    external fun thrSelf(): Long
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun pthreadAttrGetdetachstate(attr: Long, detachstate: Long): Int
    external fun pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrGetinheritsched(attr: Long, inheritsched: Long): Int
    external fun pthreadAttrGetschedparam(attr: Long, param: Long): Int
    external fun pthreadAttrGetstackaddr(attr: Long, stackaddr: Long): Int
    external fun pthreadAttrGetschedpolicy(attr: Long, policy: Long): Int
    external fun pthreadAttrGetscope(attr: Long, contentionscope: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrSetinheritsched(attr: Long, inheritsched: Int): Int
    external fun pthreadAttrSetschedparam(attr: Long, param: Long): Int
    external fun pthreadAttrSetschedpolicy(attr: Long, policy: Int): Int
    external fun pthreadAttrSetscope(attr: Long, contentionscope: Int): Int
    external fun pthreadAttrSetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadAttrSetstackaddr(attr: Long, stackaddr: Long): Int
    external fun pthreadBarrierattrDestroy(attr: Long): Int
    external fun pthreadBarrierattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadBarrierattrInit(attr: Long): Int
    external fun pthreadBarrierattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadBarrierDestroy(barrier: Long): Int
    external fun pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int
    external fun pthreadBarrierWait(barrier: Long): Int
    external fun pthreadCancel(thread: Long): Int
    external fun pthreadCleanupPop(execute: Int)
    external fun pthreadCleanupPush(routine: Long, arg: Long)
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadCreate(thread: Long, attr: Long, startRoutine: Long, arg: Long): Int
    external fun pthreadGetconcurrency(): Int
    external fun pthreadGetcpuclockid(threadId: Long, clockId: Long): Int
    external fun pthreadGetschedparam(thread: Long, policy: Long, param: Long): Int
    external fun pthreadKill(thread: Long, sig: Int): Int
    external fun pthreadMutexattrGetprioceiling(attr: Long, prioceiling: Long): Int
    external fun pthreadMutexattrGetprotocol(attr: Long, protocol: Long): Int
    external fun pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadMutexattrGetrobust(attr: Long, robust: Long): Int
    external fun pthreadMutexattrGettype(attr: Long, type: Long): Int
    external fun pthreadMutexattrSetprioceiling(attr: Long, prioceiling: Int): Int
    external fun pthreadMutexattrSetprotocol(attr: Long, protocol: Int): Int
    external fun pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadMutexattrSetrobust(attr: Long, robust: Int): Int
    external fun pthreadMutexConsistent(mutex: Long): Int
    external fun pthreadMutexGetprioceiling(mutex: Long, prioceiling: Long): Int
    external fun pthreadMutexSetprioceiling(mutex: Long, prioceiling: Int, oldCeiling: Long): Int
    external fun pthreadMutexTimedlock(mutex: Long, abstime: Long): Int
    external fun pthreadOnce(onceControl: Long, initRoutine: Long): Int
    external fun pthreadRwlockattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadRwlockattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadRwlockTimedrdlock(rwlock: Long, abstime: Long): Int
    external fun pthreadRwlockTimedwrlock(rwlock: Long, abstime: Long): Int
    external fun pthreadSetcancelstate(state: Int, oldstate: Long): Int
    external fun pthreadSetcanceltype(type: Int, oldtype: Long): Int
    external fun pthreadSetconcurrency(newLevel: Int): Int
    external fun pthreadSetschedparam(thread: Long, policy: Int, param: Long): Int
    external fun pthreadSetschedprio(thread: Long, prio: Int): Int
    external fun pthreadSigmask(how: Int, set: Long, oset: Long): Int
    external fun pthreadSpinDestroy(lock: Long): Int
    external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    external fun pthreadSpinLock(lock: Long): Int
    external fun pthreadSpinTrylock(lock: Long): Int
    external fun pthreadSpinUnlock(lock: Long): Int
    external fun pthreadTestcancel()
    external fun iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long
    external fun iconvClose(cd: Long): Int
    external fun iconvOpen(tocode: String?, fromcode: String?): Long
    external fun acct(filename: Long): Int
    external fun aioCancel(fildes: Int, aiocbp: Long): Int
    external fun aioError(aiocbp: Long): Int
    external fun aioFsync(op: Int, aiocbp: Long): Int
    external fun aioRead(aiocbp: Long): Int
    external fun aioReturn(aiocbp: Long): Long
    external fun aioSuspend(list: Long, nent: Int, timeout: Long): Int
    external fun aioWrite(aiocbp: Long): Int
    external fun basename(path: Long): Long?
    external fun bind(socket: Int, address: Long, addressLen: Long): Int
    external fun brk(addr: Long): Int
    external fun clearenv(): Int
    external fun clockGetcpuclockid(pid: Int, clkId: Long): Int
    external fun clockGetres(clkId: Long, tp: Long): Int
    external fun clockGettime(clkId: Long, tp: Long): Int
    external fun clockNanosleep(clkId: Long, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun clockSettime(clockId: Long, tp: Long): Int
    external fun creat64(path: String?, mode: Int): Int
    external fun ctermid(s: Long): Long?
    external fun dirfd(dirp: Long): Int
    external fun dirname(path: Long): Long?
    external fun drand48(): Double
    external fun duplocale(arg1: Long): Long
    external fun endgrent()
    external fun endmntent(streamp: Long): Int
    external fun endpwent()
    external fun endutent()
    external fun endutxent()
    external fun erand48(xseed: Long): Double
    external fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun fattach(fildes: Int, path: String?): Int
    external fun fdatasync(fd: Int): Int
    external fun fexecve(fd: Int, argv: Long, envp: Long): Int
    external fun ffs(value: Int): Int
    external fun ffsl(value: Long): Int
    external fun ffsll(value: Long): Int
    external fun fgetgrent(file: Long): Long?
    external fun fgetpos64(stream: Long, ptr: Long): Int
    external fun fgetpwent(file: Long): Long?
    external fun fopen64(filename: String?, mode: String?): Long?
    external fun freelocale(loc: Long)
    external fun freopen64(filename: String?, mode: String?, file: Long): Long?
    external fun fseeko64(stream: Long, offset: Long, whence: Int): Int
    external fun fsetpos64(stream: Long, ptr: Long): Int
    external fun fstat64(fildes: Int, buf: Long): Int
    external fun fstatfs(fd: Int, buf: Long): Int
    external fun fstatfs64(fd: Int, buf: Long): Int
    external fun fstatvfs64(fd: Int, buf: Long): Int
    external fun ftello64(stream: Long): Long
    external fun ftok(path: String?, id: Int): Long
    external fun ftruncate64(fd: Int, length: Long): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun getcontext(ucp: Long): Int
    external fun getdomainname(name: Long, len: Int): Int
    external fun getdtablesize(): Int
    external fun getgrent(): Long?
    external fun getgrgid(gid: Int): Long?
    external fun getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrset(user: String?): Long?
    external fun gethostid(): Long
    external fun getmntent(stream: Long): Long?
    external fun getnameinfo(sa: Long, salen: Long, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun getpagesize(): Int
    external fun getpeereid(socket: Int, euid: Long, egid: Long): Int
    external fun getpriority(which: Int, who: Long): Int
    external fun getpwent(): Long?
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun getrlimit64(resource: Int, rlim: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun getitimer(which: Int, currValue: Long): Int
    external fun getutent(): Long?
    external fun getutid(u: Long): Long?
    external fun getutline(u: Long): Long?
    external fun getutxent(): Long?
    external fun getutxid(ut: Long): Long?
    external fun getutxline(ut: Long): Long?
    external fun glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree(pglob: Long)
    external fun hasmntopt(mnt: Long, opt: String?): Long?
    external fun hcreate(nelt: Long): Int
    external fun hdestroy()
    external fun hsearch(entry: Long, action: Long): Long?
    external fun ifFreenameindex(ptr: Long)
    external fun ifNameindex(): Long?
    external fun initgroups(name: String?, basegid: Int): Int
    external fun jrand48(xseed: Long): Long
    external fun lcong48(p: Long)
    external fun lfind(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long?
    external fun lioListio(mode: Int, aiocbList: Long, nent: Int, sevp: Long): Int
    external fun lparGetInfo(command: Int, buf: Long, bufsize: Long): Int
    external fun lparSetResources(id: Int, resource: Long): Int
    external fun lrand48(): Long
    external fun lsearch(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long?
    external fun lseek64(fd: Int, offset: Long, whence: Int): Long
    external fun lstat64(path: String?, buf: Long): Int
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun mallinfo(): Long
    external fun mallopt(param: Int, value: Int): Int
    external fun memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long?
    external fun memsetS(s: Long, smax: Long, c: Int, n: Long): Int
    external fun mincore(addr: Long, len: Long, vec: Long): Int
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun mount(device: String?, path: String?, flags: Int): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun mqClose(mqd: Long): Int
    external fun mqGetattr(mqd: Long, attr: Long): Int
    external fun mqNotify(mqd: Long, notification: Long): Int
    external fun mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long
    external fun mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int
    external fun mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int
    external fun mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long
    external fun mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int
    external fun mqUnlink(name: String?): Int
    external fun mrand48(): Long
    external fun msgctl(msqid: Int, cmd: Int, buf: Long): Int
    external fun msgget(key: Long, msgflg: Int): Int
    external fun msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long
    external fun msgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun nlLanginfo(item: Long): Long?
    external fun nlLanginfoL(item: Long, loc: Long): Long?
    external fun nrand48(xseed: Long): Long
    external fun pollsetCreate(maxfd: Int): Long
    external fun pollsetCtl(ps: Long, pollctlArray: Long, arrayLength: Int): Int
    external fun pollsetDestroy(ps: Long): Int
    external fun pollsetPoll(ps: Long, polldataArray: Long, arrayLength: Int, timeout: Int): Int
    external fun pollsetQuery(ps: Long, pollfdQuery: Long): Int
    external fun popen(command: String?, mode: String?): Long?
    external fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun posixFallocate64(fd: Int, offset: Long, len: Long): Int
    external fun posixMadvise(addr: Long, len: Long, advice: Int): Int
    external fun posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int
    external fun posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int
    external fun posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int
    external fun posixSpawnFileActionsDestroy(actions: Long): Int
    external fun posixSpawnFileActionsInit(actions: Long): Int
    external fun posixSpawnattrDestroy(attr: Long): Int
    external fun posixSpawnattrGetflags(attr: Long, flags: Long): Int
    external fun posixSpawnattrGetpgroup(attr: Long, flags: Long): Int
    external fun posixSpawnattrGetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int
    external fun posixSpawnattrGetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrGetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrInit(attr: Long): Int
    external fun posixSpawnattrSetflags(attr: Long, flags: Short): Int
    external fun posixSpawnattrSetpgroup(attr: Long, flags: Int): Int
    external fun posixSpawnattrSetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int
    external fun posixSpawnattrSetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun pread64(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun ptrace64(request: Int, id: Long, addr: Long, data: Int, buff: Long): Int
    external fun pututline(u: Long): Long?
    external fun pututxline(ut: Long): Long?
    external fun pwrite64(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun quotactl(cmd: Long, special: Int, id: Int, data: Long): Int
    external fun rand(): Int
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int
    external fun recvmsg(sockfd: Int, msg: Long, flags: Int): Long
    external fun regcomp(preg: Long, pattern: String?, cflags: Int): Int
    external fun regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long
    external fun regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int
    external fun regfree(preg: Long)
    external fun sbrk(increment: Long): Long?
    external fun schedGetparam(pid: Int, param: Long): Int
    external fun schedGetscheduler(pid: Int): Int
    external fun schedGetPriorityMax(policy: Int): Int
    external fun schedGetPriorityMin(policy: Int): Int
    external fun schedRrGetInterval(pid: Int, tp: Long): Int
    external fun schedSetparam(pid: Int, param: Long): Int
    external fun schedSetscheduler(pid: Int, policy: Int, param: Long): Int
    external fun sctpOptInfo(sd: Int, id: Long, opt: Int, argSize: Long, size: Long): Int
    external fun sctpPeeloff(s: Int, id: Long): Int
    external fun seed48(xseed: Long): Long?
    external fun seekdir(dirp: Long, loc: Long)
    external fun semClose(sem: Long): Int
    external fun semDestroy(sem: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun semTimedwait(sem: Long, abstime: Long): Int
    external fun semUnlink(name: String?): Int
    external fun semget(key: Long, nsems: Int, semflag: Int): Int
    external fun semop(semid: Int, sops: Long, nsops: Long): Int
    external fun sendFile(socket: Long, iobuf: Long, flags: Int): Long
    external fun sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int
    external fun sendmsg(sockfd: Int, msg: Long, flags: Int): Long
    external fun setcontext(ucp: Long): Int
    external fun setdomainname(name: String?, len: Int): Int
    external fun setgroups(ngroups: Int, ptr: Long): Int
    external fun setgrent()
    external fun sethostid(hostid: Int): Int
    external fun sethostname(name: String?, len: Int): Int
    external fun setmntent(filename: String?, ty: String?): Long?
    external fun setpriority(which: Int, who: Long, priority: Int): Int
    external fun setpwent()
    external fun setrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit64(resource: Int, rlim: Long): Int
    external fun settimeofday(tv: Long, tz: Long): Int
    external fun setitimer(which: Int, newValue: Long, oldValue: Long): Int
    external fun setutent()
    external fun setutxent()
    external fun sigaltstack(ss: Long, oss: Long): Int
    external fun sigsuspend(mask: Long): Int
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
    external fun sigwait(set: Long, sig: Long): Int
    external fun sigwaitinfo(set: Long, info: Long): Int
    external fun shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long?
    external fun shmdt(shmaddr: Long): Int
    external fun shmctl(shmid: Int, cmd: Int, buf: Long): Int
    external fun shmget(key: Long, size: Long, shmflg: Int): Int
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun splice(socket1: Int, socket2: Int, flags: Int): Int
    external fun srand(seed: Int)
    external fun srand48(seed: Long)
    external fun stat64(path: String?, buf: Long): Int
    external fun stat64at(dirfd: Int, path: String?, buf: Long, flags: Int): Int
    external fun statfs(path: String?, buf: Long): Int
    external fun statfs64(path: String?, buf: Long): Int
    external fun statvfs64(path: String?, buf: Long): Int
    external fun statx(path: String?, buf: Long, length: Int, command: Int): Int
    external fun strcasecmpL(string1: String?, string2: String?, locale: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun strftime(arg1: Long, arg2: Long, arg3: String?, arg4: Long): Long
    external fun strncasecmpL(string1: String?, string2: String?, length: Long, locale: Long): Int
    external fun strptime(s: String?, format: String?, tm: Long): Long?
    external fun strsep(string: Long, delim: String?): Long?
    external fun swapcontext(uocp: Long, ucp: Long): Int
    external fun swapoff(path: String?): Int
    external fun swapon(path: String?): Int
    external fun sync()
    external fun telldir(dirp: Long): Long
    external fun timerCreate(clockid: Long, sevp: Long, timerid: Long): Int
    external fun timerDelete(timerid: Long): Int
    external fun timerGetoverrun(timerid: Long): Int
    external fun timerGettime(timerid: Long, value: Long): Int
    external fun timerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int
    external fun truncate64(path: String?, length: Long): Int
    external fun uname(buf: Long): Int
    external fun updwtmp(file: String?, u: Long)
    external fun uselocale(loc: Long): Long
    external fun utmpname(file: String?): Int
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun wait4(pid: Int, status: Long, options: Int, rusage: Long): Int
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun errno(): Long?
}

public actual fun thrKill(id: ThreadT, sig: CInt): CInt =
    AixModRawLibc.thrKill(id, sig)

public actual fun thrSelf(): ThreadT =
    AixModRawLibc.thrSelf()

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    AixModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: CInt?): CInt =
    AixModRawLibc.pthreadAttrGetdetachstate(attr?.value ?: 0L, detachstate?.toLong() ?: 0L)

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    AixModRawLibc.pthreadAttrGetguardsize(attr?.value ?: 0L, guardsize?.toLong() ?: 0L)

public actual fun pthreadAttrGetinheritsched(attr: COpaquePointer?, inheritsched: CInt?): CInt =
    AixModRawLibc.pthreadAttrGetinheritsched(attr?.value ?: 0L, inheritsched?.toLong() ?: 0L)

public actual fun pthreadAttrGetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    AixModRawLibc.pthreadAttrGetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    AixModRawLibc.pthreadAttrGetstackaddr(attr?.value ?: 0L, stackaddr?.value ?: 0L)

public actual fun pthreadAttrGetschedpolicy(attr: COpaquePointer?, policy: CInt?): CInt =
    AixModRawLibc.pthreadAttrGetschedpolicy(attr?.value ?: 0L, policy?.toLong() ?: 0L)

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: CInt?): CInt =
    AixModRawLibc.pthreadAttrGetscope(attr?.value ?: 0L, contentionscope?.toLong() ?: 0L)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    AixModRawLibc.pthreadAttrGetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    AixModRawLibc.pthreadAttrSetguardsize(attr?.value ?: 0L, guardsize)

public actual fun pthreadAttrSetinheritsched(attr: COpaquePointer?, inheritsched: CInt): CInt =
    AixModRawLibc.pthreadAttrSetinheritsched(attr?.value ?: 0L, inheritsched)

public actual fun pthreadAttrSetschedparam(attr: COpaquePointer?, param: SchedParam?): CInt =
    AixModRawLibc.pthreadAttrSetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadAttrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    AixModRawLibc.pthreadAttrSetschedpolicy(attr?.value ?: 0L, policy)

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    AixModRawLibc.pthreadAttrSetscope(attr?.value ?: 0L, contentionscope)

public actual fun pthreadAttrSetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT): CInt =
    AixModRawLibc.pthreadAttrSetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize)

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    AixModRawLibc.pthreadAttrSetstackaddr(attr?.value ?: 0L, stackaddr?.value ?: 0L)

public actual fun pthreadBarrierattrDestroy(attr: COpaquePointer?): CInt =
    AixModRawLibc.pthreadBarrierattrDestroy(attr?.value ?: 0L)

public actual fun pthreadBarrierattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    AixModRawLibc.pthreadBarrierattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadBarrierattrInit(attr: COpaquePointer?): CInt =
    AixModRawLibc.pthreadBarrierattrInit(attr?.value ?: 0L)

public actual fun pthreadBarrierattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    AixModRawLibc.pthreadBarrierattrSetpshared(attr?.value ?: 0L, pshared)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrierT?): CInt =
    AixModRawLibc.pthreadBarrierDestroy(barrier?.toLong() ?: 0L)

public actual fun pthreadBarrierInit(barrier: PthreadBarrierT?, attr: COpaquePointer?, count: CUint): CInt =
    AixModRawLibc.pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.value ?: 0L, count)

public actual fun pthreadBarrierWait(barrier: PthreadBarrierT?): CInt =
    AixModRawLibc.pthreadBarrierWait(barrier?.toLong() ?: 0L)

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    AixModRawLibc.pthreadCancel(thread)

public actual fun pthreadCleanupPop(execute: CInt) {
    AixModRawLibc.pthreadCleanupPop(execute)
}

public actual fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: COpaquePointer?) {
    AixModRawLibc.pthreadCleanupPush(routine?.toLong() ?: 0L, arg?.value ?: 0L)
}

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: CLonglong?): CInt =
    AixModRawLibc.pthreadCondattrGetclock(attr?.value ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    AixModRawLibc.pthreadCondattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    AixModRawLibc.pthreadCondattrSetclock(attr?.value ?: 0L, clockId)

public actual fun pthreadCondattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    AixModRawLibc.pthreadCondattrSetpshared(attr?.value ?: 0L, pshared)

public actual fun pthreadCreate(thread: CUint?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): CInt =
    AixModRawLibc.pthreadCreate(thread?.toLong() ?: 0L, attr?.value ?: 0L, startRoutine, arg?.value ?: 0L)

public actual fun pthreadGetconcurrency(): CInt =
    AixModRawLibc.pthreadGetconcurrency()

public actual fun pthreadGetcpuclockid(threadId: io.github.kotlinmania.libc.PthreadT, clockId: CLonglong?): CInt =
    AixModRawLibc.pthreadGetcpuclockid(threadId, clockId?.toLong() ?: 0L)

public actual fun pthreadGetschedparam(thread: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: SchedParam?): CInt =
    AixModRawLibc.pthreadGetschedparam(thread, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    AixModRawLibc.pthreadKill(thread, sig)

public actual fun pthreadMutexattrGetprioceiling(attr: COpaquePointer?, prioceiling: CInt?): CInt =
    AixModRawLibc.pthreadMutexattrGetprioceiling(attr?.value ?: 0L, prioceiling?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetprotocol(attr: COpaquePointer?, protocol: CInt?): CInt =
    AixModRawLibc.pthreadMutexattrGetprotocol(attr?.value ?: 0L, protocol?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    AixModRawLibc.pthreadMutexattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: CInt?): CInt =
    AixModRawLibc.pthreadMutexattrGetrobust(attr?.value ?: 0L, robust?.toLong() ?: 0L)

public actual fun pthreadMutexattrGettype(attr: COpaquePointer?, type: CInt?): CInt =
    AixModRawLibc.pthreadMutexattrGettype(attr?.value ?: 0L, type?.toLong() ?: 0L)

public actual fun pthreadMutexattrSetprioceiling(attr: COpaquePointer?, prioceiling: CInt): CInt =
    AixModRawLibc.pthreadMutexattrSetprioceiling(attr?.value ?: 0L, prioceiling)

public actual fun pthreadMutexattrSetprotocol(attr: COpaquePointer?, protocol: CInt): CInt =
    AixModRawLibc.pthreadMutexattrSetprotocol(attr?.value ?: 0L, protocol)

public actual fun pthreadMutexattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    AixModRawLibc.pthreadMutexattrSetpshared(attr?.value ?: 0L, pshared)

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    AixModRawLibc.pthreadMutexattrSetrobust(attr?.value ?: 0L, robust)

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    AixModRawLibc.pthreadMutexConsistent(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexGetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt?): CInt =
    AixModRawLibc.pthreadMutexGetprioceiling(mutex?.toLong() ?: 0L, prioceiling?.toLong() ?: 0L)

public actual fun pthreadMutexSetprioceiling(mutex: PthreadMutexT?, prioceiling: CInt, oldCeiling: CInt?): CInt =
    AixModRawLibc.pthreadMutexSetprioceiling(mutex?.toLong() ?: 0L, prioceiling, oldCeiling?.toLong() ?: 0L)

public actual fun pthreadMutexTimedlock(mutex: PthreadMutexT?, abstime: Timespec?): CInt =
    AixModRawLibc.pthreadMutexTimedlock(mutex?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadOnce(onceControl: PthreadOnceT?, initRoutine: PthreadAtforkPrepareCallback?): CInt =
    AixModRawLibc.pthreadOnce(onceControl?.toLong() ?: 0L, initRoutine?.toLong() ?: 0L)

public actual fun pthreadRwlockattrGetpshared(attr: COpaquePointer?, pshared: CInt?): CInt =
    AixModRawLibc.pthreadRwlockattrGetpshared(attr?.value ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadRwlockattrSetpshared(attr: COpaquePointer?, pshared: CInt): CInt =
    AixModRawLibc.pthreadRwlockattrSetpshared(attr?.value ?: 0L, pshared)

public actual fun pthreadRwlockTimedrdlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt =
    AixModRawLibc.pthreadRwlockTimedrdlock(rwlock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadRwlockTimedwrlock(rwlock: PthreadRwlockT?, abstime: Timespec?): CInt =
    AixModRawLibc.pthreadRwlockTimedwrlock(rwlock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadSetcancelstate(state: CInt, oldstate: CInt?): CInt =
    AixModRawLibc.pthreadSetcancelstate(state, oldstate?.toLong() ?: 0L)

public actual fun pthreadSetcanceltype(type: CInt, oldtype: CInt?): CInt =
    AixModRawLibc.pthreadSetcanceltype(type, oldtype?.toLong() ?: 0L)

public actual fun pthreadSetconcurrency(newLevel: CInt): CInt =
    AixModRawLibc.pthreadSetconcurrency(newLevel)

public actual fun pthreadSetschedparam(thread: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: SchedParam?): CInt =
    AixModRawLibc.pthreadSetschedparam(thread, policy, param?.toLong() ?: 0L)

public actual fun pthreadSetschedprio(thread: io.github.kotlinmania.libc.PthreadT, prio: CInt): CInt =
    AixModRawLibc.pthreadSetschedprio(thread, prio)

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oset: SigsetT?): CInt =
    AixModRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oset?.toLong() ?: 0L)

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    AixModRawLibc.pthreadSpinDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    AixModRawLibc.pthreadSpinInit(lock?.toLong() ?: 0L, pshared)

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    AixModRawLibc.pthreadSpinLock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    AixModRawLibc.pthreadSpinTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    AixModRawLibc.pthreadSpinUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadTestcancel() {
    AixModRawLibc.pthreadTestcancel()
}

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    AixModRawLibc.iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)

public actual fun iconvClose(cd: IconvT): CInt =
    AixModRawLibc.iconvClose(cd)

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    AixModRawLibc.iconvOpen(tocode, fromcode)

public actual fun acct(filename: COpaquePointer?): CInt =
    AixModRawLibc.acct(filename?.value ?: 0L)

public actual fun aioCancel(fildes: CInt, aiocbp: Aiocb?): CInt =
    AixModRawLibc.aioCancel(fildes, aiocbp?.toLong() ?: 0L)

public actual fun aioError(aiocbp: Aiocb?): CInt =
    AixModRawLibc.aioError(aiocbp?.toLong() ?: 0L)

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    AixModRawLibc.aioFsync(op, aiocbp?.toLong() ?: 0L)

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    AixModRawLibc.aioRead(aiocbp?.toLong() ?: 0L)

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    AixModRawLibc.aioReturn(aiocbp?.toLong() ?: 0L)

public actual fun aioSuspend(list: COpaquePointer?, nent: CInt, timeout: Timespec?): CInt =
    AixModRawLibc.aioSuspend(list?.value ?: 0L, nent, timeout?.toLong() ?: 0L)

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    AixModRawLibc.aioWrite(aiocbp?.toLong() ?: 0L)

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    AixModRawLibc.basename(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    AixModRawLibc.bind(socket, address?.toLong() ?: 0L, addressLen)

public actual fun brk(addr: COpaquePointer?): CInt =
    AixModRawLibc.brk(addr?.value ?: 0L)

public actual fun clearenv(): CInt =
    AixModRawLibc.clearenv()

public actual fun clockGetcpuclockid(pid: PidT, clkId: CLonglong?): CInt =
    AixModRawLibc.clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    AixModRawLibc.clockGetres(clkId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    AixModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    AixModRawLibc.clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    AixModRawLibc.clockSettime(clockId, tp?.toLong() ?: 0L)

public actual fun creat64(path: String?, mode: ModeT): CInt =
    AixModRawLibc.creat64(path, mode)

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    AixModRawLibc.ctermid(s?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dirfd(dirp: DIR?): CInt =
    AixModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    AixModRawLibc.dirname(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun drand48(): CDouble =
    AixModRawLibc.drand48()

public actual fun duplocale(arg1: LocaleT): LocaleT =
    AixModRawLibc.duplocale(arg1)

public actual fun endgrent() {
    AixModRawLibc.endgrent()
}

public actual fun endmntent(streamp: FILE?): CInt =
    AixModRawLibc.endmntent(streamp?.toLong() ?: 0L)

public actual fun endpwent() {
    AixModRawLibc.endpwent()
}

public actual fun endutent() {
    AixModRawLibc.endutent()
}

public actual fun endutxent() {
    AixModRawLibc.endutxent()
}

public actual fun erand48(xseed: CUshort?): CDouble =
    AixModRawLibc.erand48(xseed?.toLong() ?: 0L)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    AixModRawLibc.faccessat(dirfd, pathname, mode, flags)

public actual fun fattach(fildes: CInt, path: String?): CInt =
    AixModRawLibc.fattach(fildes, path)

public actual fun fdatasync(fd: CInt): CInt =
    AixModRawLibc.fdatasync(fd)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    AixModRawLibc.fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun ffs(value: CInt): CInt =
    AixModRawLibc.ffs(value)

public actual fun ffsl(value: CLong): CInt =
    AixModRawLibc.ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    AixModRawLibc.ffsll(value)

public actual fun fgetgrent(file: FILE?): Group? =
    AixModRawLibc.fgetgrent(file?.toLong() ?: 0L)

public actual fun fgetpos64(stream: FILE?, ptr: CLonglong?): CInt =
    AixModRawLibc.fgetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun fgetpwent(file: FILE?): io.github.kotlinmania.libc.Passwd? =
    AixModRawLibc.fgetpwent(file?.toLong() ?: 0L)

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    AixModRawLibc.fopen64(filename, mode)

public actual fun freelocale(loc: LocaleT) {
    AixModRawLibc.freelocale(loc)
}

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    AixModRawLibc.freopen64(filename, mode, file?.toLong() ?: 0L)

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    AixModRawLibc.fseeko64(stream?.toLong() ?: 0L, offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: CLonglong?): CInt =
    AixModRawLibc.fsetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun fstat64(fildes: CInt, buf: Stat64?): CInt =
    AixModRawLibc.fstat64(fildes, buf?.toLong() ?: 0L)

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    AixModRawLibc.fstatfs(fd, buf?.toLong() ?: 0L)

public actual fun fstatfs64(fd: CInt, buf: Statfs64?): CInt =
    AixModRawLibc.fstatfs64(fd, buf?.toLong() ?: 0L)

public actual fun fstatvfs64(fd: CInt, buf: Statvfs64?): CInt =
    AixModRawLibc.fstatvfs64(fd, buf?.toLong() ?: 0L)

public actual fun ftello64(stream: FILE?): Off64T =
    AixModRawLibc.ftello64(stream?.toLong() ?: 0L)

public actual fun ftok(path: String?, id: CInt): io.github.kotlinmania.libc.KeyT =
    AixModRawLibc.ftok(path, id)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    AixModRawLibc.ftruncate64(fd, length)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    AixModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun getcontext(ucp: UcontextT?): CInt =
    AixModRawLibc.getcontext(ucp?.toLong() ?: 0L)

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    AixModRawLibc.getdomainname(name?.value ?: 0L, len)

public actual fun getdtablesize(): CInt =
    AixModRawLibc.getdtablesize()

public actual fun getgrent(): Group? =
    AixModRawLibc.getgrent()

public actual fun getgrgid(gid: GidT): Group? =
    AixModRawLibc.getgrgid(gid)

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    AixModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrnam(name: String?): Group? =
    AixModRawLibc.getgrnam(name)

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    AixModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrset(user: String?): COpaquePointer? =
    AixModRawLibc.getgrset(user).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostid(): CLong =
    AixModRawLibc.gethostid()

public actual fun getmntent(stream: FILE?): io.github.kotlinmania.libc.Mntent? =
    AixModRawLibc.getmntent(stream?.toLong() ?: 0L)

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: SizeT, host: COpaquePointer?, hostlen: SizeT, serv: COpaquePointer?, servlen: SizeT, flags: CInt): CInt =
    AixModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun getpagesize(): CInt =
    AixModRawLibc.getpagesize()

public actual fun getpeereid(socket: CInt, euid: UidT?, egid: GidT?): CInt =
    AixModRawLibc.getpeereid(socket, euid?.toLong() ?: 0L, egid?.toLong() ?: 0L)

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    AixModRawLibc.getpriority(which, who)

public actual fun getpwent(): io.github.kotlinmania.libc.Passwd? =
    AixModRawLibc.getpwent()

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    AixModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    AixModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    AixModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun getrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    AixModRawLibc.getrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    AixModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    AixModRawLibc.getitimer(which, currValue?.toLong() ?: 0L)

public actual fun getutent(): Utmp? =
    AixModRawLibc.getutent()

public actual fun getutid(u: Utmp?): Utmp? =
    AixModRawLibc.getutid(u?.toLong() ?: 0L)

public actual fun getutline(u: Utmp?): Utmp? =
    AixModRawLibc.getutline(u?.toLong() ?: 0L)

public actual fun getutxent(): Utmpx? =
    AixModRawLibc.getutxent()

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    AixModRawLibc.getutxid(ut?.toLong() ?: 0L)

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    AixModRawLibc.getutxline(ut?.toLong() ?: 0L)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    AixModRawLibc.glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    AixModRawLibc.globfree(pglob?.toLong() ?: 0L)
}

public actual fun hasmntopt(mnt: io.github.kotlinmania.libc.Mntent?, opt: String?): COpaquePointer? =
    AixModRawLibc.hasmntopt(mnt?.toLong() ?: 0L, opt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcreate(nelt: SizeT): CInt =
    AixModRawLibc.hcreate(nelt)

public actual fun hdestroy() {
    AixModRawLibc.hdestroy()
}

public actual fun hsearch(entry: Entry, action: Action): Entry? =
    AixModRawLibc.hsearch(entry, action)

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    AixModRawLibc.ifFreenameindex(ptr?.toLong() ?: 0L)
}

public actual fun ifNameindex(): IfNameindex? =
    AixModRawLibc.ifNameindex()

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    AixModRawLibc.initgroups(name, basegid)

public actual fun jrand48(xseed: CUshort?): CLong =
    AixModRawLibc.jrand48(xseed?.toLong() ?: 0L)

public actual fun lcong48(p: CUshort?) {
    AixModRawLibc.lcong48(p?.toLong() ?: 0L)
}

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    AixModRawLibc.lfind(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nent: CInt, sevp: Sigevent?): CInt =
    AixModRawLibc.lioListio(mode, aiocbList?.value ?: 0L, nent, sevp?.toLong() ?: 0L)

public actual fun lparGetInfo(command: CInt, buf: COpaquePointer?, bufsize: SizeT): CInt =
    AixModRawLibc.lparGetInfo(command, buf?.value ?: 0L, bufsize)

public actual fun lparSetResources(id: CInt, resource: COpaquePointer?): CInt =
    AixModRawLibc.lparSetResources(id, resource?.value ?: 0L)

public actual fun lrand48(): CLong =
    AixModRawLibc.lrand48()

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LfindComparCallback?): COpaquePointer? =
    AixModRawLibc.lsearch(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    AixModRawLibc.lseek64(fd, offset, whence)

public actual fun lstat64(path: String?, buf: Stat64?): CInt =
    AixModRawLibc.lstat64(path, buf?.toLong() ?: 0L)

public actual fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt =
    AixModRawLibc.madvise(addr, len, advice)

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    AixModRawLibc.mallinfo()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    AixModRawLibc.mallopt(param, value)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    AixModRawLibc.memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    AixModRawLibc.memsetS(s?.value ?: 0L, smax, c, n)

public actual fun mincore(addr: CaddrT, len: SizeT, vec: COpaquePointer?): CInt =
    AixModRawLibc.mincore(addr, len, vec?.value ?: 0L)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    AixModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    AixModRawLibc.mknodat(dirfd, pathname, mode, dev)

public actual fun mount(device: String?, path: String?, flags: CInt): CInt =
    AixModRawLibc.mount(device, path, flags)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    AixModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    AixModRawLibc.mqClose(mqd)

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    AixModRawLibc.mqGetattr(mqd, attr?.toLong() ?: 0L)

public actual fun mqNotify(mqd: io.github.kotlinmania.libc.MqdT, notification: io.github.kotlinmania.libc.Sigevent?): CInt =
    AixModRawLibc.mqNotify(mqd, notification?.toLong() ?: 0L)

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    AixModRawLibc.mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    AixModRawLibc.mqSend(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    AixModRawLibc.mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    AixModRawLibc.mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    AixModRawLibc.mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)

public actual fun mqUnlink(name: String?): CInt =
    AixModRawLibc.mqUnlink(name)

public actual fun mrand48(): CLong =
    AixModRawLibc.mrand48()

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    AixModRawLibc.msgctl(msqid, cmd, buf?.toLong() ?: 0L)

public actual fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt =
    AixModRawLibc.msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    AixModRawLibc.msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtyp, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    AixModRawLibc.msgsnd(msqid, msgp?.value ?: 0L, msgsz, msgflg)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    AixModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    AixModRawLibc.newlocale(mask, locale, base)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    AixModRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, loc: LocaleT): COpaquePointer? =
    AixModRawLibc.nlLanginfoL(item, loc).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nrand48(xseed: CUshort?): CLong =
    AixModRawLibc.nrand48(xseed?.toLong() ?: 0L)

public actual fun pollsetCreate(maxfd: CInt): PollsetT =
    AixModRawLibc.pollsetCreate(maxfd)

public actual fun pollsetCtl(ps: PollsetT, pollctlArray: PollCtl?, arrayLength: CInt): CInt =
    AixModRawLibc.pollsetCtl(ps, pollctlArray?.toLong() ?: 0L, arrayLength)

public actual fun pollsetDestroy(ps: PollsetT): CInt =
    AixModRawLibc.pollsetDestroy(ps)

public actual fun pollsetPoll(ps: PollsetT, polldataArray: Pollfd?, arrayLength: CInt, timeout: CInt): CInt =
    AixModRawLibc.pollsetPoll(ps, polldataArray?.toLong() ?: 0L, arrayLength, timeout)

public actual fun pollsetQuery(ps: PollsetT, pollfdQuery: Pollfd?): CInt =
    AixModRawLibc.pollsetQuery(ps, pollfdQuery?.toLong() ?: 0L)

public actual fun popen(command: String?, mode: String?): FILE? =
    AixModRawLibc.popen(command, mode)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    AixModRawLibc.posixFadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    AixModRawLibc.posixFadvise64(fd, offset, len, advise)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    AixModRawLibc.posixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    AixModRawLibc.posixFallocate64(fd, offset, len)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    AixModRawLibc.posixMadvise(addr?.value ?: 0L, len, advice)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    AixModRawLibc.posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    AixModRawLibc.posixSpawnFileActionsAddclose(actions?.value ?: 0L, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    AixModRawLibc.posixSpawnFileActionsAdddup2(actions?.value ?: 0L, fd, newfd)

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    AixModRawLibc.posixSpawnFileActionsAddopen(actions?.value ?: 0L, fd, path, oflag, mode)

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    AixModRawLibc.posixSpawnFileActionsDestroy(actions?.value ?: 0L)

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    AixModRawLibc.posixSpawnFileActionsInit(actions?.value ?: 0L)

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    AixModRawLibc.posixSpawnattrDestroy(attr?.toLong() ?: 0L)

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    AixModRawLibc.posixSpawnattrGetflags(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: PidT?): CInt =
    AixModRawLibc.posixSpawnattrGetpgroup(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    AixModRawLibc.posixSpawnattrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    AixModRawLibc.posixSpawnattrGetschedpolicy(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    AixModRawLibc.posixSpawnattrGetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    AixModRawLibc.posixSpawnattrGetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    AixModRawLibc.posixSpawnattrInit(attr?.toLong() ?: 0L)

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    AixModRawLibc.posixSpawnattrSetflags(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: PidT): CInt =
    AixModRawLibc.posixSpawnattrSetpgroup(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    AixModRawLibc.posixSpawnattrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    AixModRawLibc.posixSpawnattrSetschedpolicy(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    AixModRawLibc.posixSpawnattrSetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: SigsetT?): CInt =
    AixModRawLibc.posixSpawnattrSetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    AixModRawLibc.posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    AixModRawLibc.pread64(fd, buf?.value ?: 0L, count, offset)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT =
    AixModRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: CInt?): CInt =
    AixModRawLibc.ptrace64(request, id, addr, data, buff?.toLong() ?: 0L)

public actual fun pututline(u: Utmp?): Utmp? =
    AixModRawLibc.pututline(u?.toLong() ?: 0L)

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    AixModRawLibc.pututxline(ut?.toLong() ?: 0L)

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    AixModRawLibc.pwrite64(fd, buf?.value ?: 0L, count, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffsetT): SsizeT =
    AixModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun quotactl(cmd: COpaquePointer?, special: CInt, id: CInt, data: CaddrT): CInt =
    AixModRawLibc.quotactl(cmd?.value ?: 0L, special, id, data)

public actual fun rand(): CInt =
    AixModRawLibc.rand()

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    AixModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT =
    AixModRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun recvmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: CUint, flags: CInt, timeout: Timespec?): CInt =
    AixModRawLibc.recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)

public actual fun recvmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    AixModRawLibc.recvmsg(sockfd, msg?.toLong() ?: 0L, flags)

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    AixModRawLibc.regcomp(preg?.toLong() ?: 0L, pattern, cflags)

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    AixModRawLibc.regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    AixModRawLibc.regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)

public actual fun regfree(preg: RegexT?) {
    AixModRawLibc.regfree(preg?.toLong() ?: 0L)
}

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    AixModRawLibc.sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    AixModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    AixModRawLibc.schedGetscheduler(pid)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    AixModRawLibc.schedGetPriorityMax(policy)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    AixModRawLibc.schedGetPriorityMin(policy)

public actual fun schedRrGetInterval(pid: PidT, tp: Timespec?): CInt =
    AixModRawLibc.schedRrGetInterval(pid, tp?.toLong() ?: 0L)

public actual fun schedSetparam(pid: PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    AixModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    AixModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun sctpOptInfo(sd: CInt, id: io.github.kotlinmania.libc.SctpAssocT, opt: CInt, argSize: COpaquePointer?, size: SizeT?): CInt =
    AixModRawLibc.sctpOptInfo(sd, id, opt, argSize?.value ?: 0L, size?.toLong() ?: 0L)

public actual fun sctpPeeloff(s: CInt, id: CUint?): CInt =
    AixModRawLibc.sctpPeeloff(s, id?.toLong() ?: 0L)

public actual fun seed48(xseed: CUshort?): CUshort? =
    AixModRawLibc.seed48(xseed?.toLong() ?: 0L)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    AixModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun semClose(sem: CInt?): CInt =
    AixModRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun semDestroy(sem: CInt?): CInt =
    AixModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semGetvalue(sem: CInt?, sval: CInt?): CInt =
    AixModRawLibc.semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)

public actual fun semInit(sem: CInt?, pshared: CInt, value: CUint): CInt =
    AixModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun semTimedwait(sem: CInt?, abstime: Timespec?): CInt =
    AixModRawLibc.semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun semUnlink(name: String?): CInt =
    AixModRawLibc.semUnlink(name)

public actual fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflag: CInt): CInt =
    AixModRawLibc.semget(key, nsems, semflag)

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    AixModRawLibc.semop(semid, sops?.toLong() ?: 0L, nsops)

public actual fun sendFile(socket: CInt?, iobuf: SfParms?, flags: CUint): SsizeT =
    AixModRawLibc.sendFile(socket?.toLong() ?: 0L, iobuf?.toLong() ?: 0L, flags)

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUint, flags: CInt): CInt =
    AixModRawLibc.sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)

public actual fun sendmsg(sockfd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    AixModRawLibc.sendmsg(sockfd, msg?.toLong() ?: 0L, flags)

public actual fun setcontext(ucp: UcontextT?): CInt =
    AixModRawLibc.setcontext(ucp?.toLong() ?: 0L)

public actual fun setdomainname(name: String?, len: CInt): CInt =
    AixModRawLibc.setdomainname(name, len)

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    AixModRawLibc.setgroups(ngroups, ptr?.toLong() ?: 0L)

public actual fun setgrent() {
    AixModRawLibc.setgrent()
}

public actual fun sethostid(hostid: CInt): CInt =
    AixModRawLibc.sethostid(hostid)

public actual fun sethostname(name: String?, len: CInt): CInt =
    AixModRawLibc.sethostname(name, len)

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    AixModRawLibc.setmntent(filename, ty)

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    AixModRawLibc.setpriority(which, who, priority)

public actual fun setpwent() {
    AixModRawLibc.setpwent()
}

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    AixModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit64(resource: CInt, rlim: Rlimit64?): CInt =
    AixModRawLibc.setrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun settimeofday(tv: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    AixModRawLibc.settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    AixModRawLibc.setitimer(which, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun setutent() {
    AixModRawLibc.setutent()
}

public actual fun setutxent() {
    AixModRawLibc.setutxent()
}

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    AixModRawLibc.sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)

public actual fun sigsuspend(mask: SigsetT?): CInt =
    AixModRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    AixModRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    AixModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    AixModRawLibc.sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    AixModRawLibc.shmat(shmid, shmaddr?.value ?: 0L, shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    AixModRawLibc.shmdt(shmaddr?.value ?: 0L)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    AixModRawLibc.shmctl(shmid, cmd, buf?.toLong() ?: 0L)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    AixModRawLibc.shmget(key, size, shmflg)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    AixModRawLibc.shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    AixModRawLibc.shmUnlink(name)

public actual fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt =
    AixModRawLibc.splice(socket1, socket2, flags)

public actual fun srand(seed: CUint) {
    AixModRawLibc.srand(seed)
}

public actual fun srand48(seed: CLong) {
    AixModRawLibc.srand48(seed)
}

public actual fun stat64(path: String?, buf: Stat64?): CInt =
    AixModRawLibc.stat64(path, buf?.toLong() ?: 0L)

public actual fun stat64at(dirfd: CInt, path: String?, buf: Stat64?, flags: CInt): CInt =
    AixModRawLibc.stat64at(dirfd, path, buf?.toLong() ?: 0L, flags)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    AixModRawLibc.statfs(path, buf?.toLong() ?: 0L)

public actual fun statfs64(path: String?, buf: Statfs64?): CInt =
    AixModRawLibc.statfs64(path, buf?.toLong() ?: 0L)

public actual fun statvfs64(path: String?, buf: Statvfs64?): CInt =
    AixModRawLibc.statvfs64(path, buf?.toLong() ?: 0L)

public actual fun statx(path: String?, buf: Stat?, length: CInt, command: CInt): CInt =
    AixModRawLibc.statx(path, buf?.toLong() ?: 0L, length, command)

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    AixModRawLibc.strcasecmpL(string1, string2, locale)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    AixModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun strftime(arg1: COpaquePointer?, arg2: SizeT, arg3: String?, arg4: Tm?): SizeT =
    AixModRawLibc.strftime(arg1?.value ?: 0L, arg2, arg3, arg4?.toLong() ?: 0L)

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    AixModRawLibc.strncasecmpL(string1, string2, length, locale)

public actual fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    AixModRawLibc.strptime(s, format, tm?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    AixModRawLibc.strsep(string?.value ?: 0L, delim).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun swapcontext(uocp: UcontextT?, ucp: UcontextT?): CInt =
    AixModRawLibc.swapcontext(uocp?.toLong() ?: 0L, ucp?.toLong() ?: 0L)

public actual fun swapoff(path: String?): CInt =
    AixModRawLibc.swapoff(path)

public actual fun swapon(path: String?): CInt =
    AixModRawLibc.swapon(path)

public actual fun sync() {
    AixModRawLibc.sync()
}

public actual fun telldir(dirp: DIR?): CLong =
    AixModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun timerCreate(clockid: io.github.kotlinmania.libc.ClockidT, sevp: io.github.kotlinmania.libc.Sigevent?, timerid: CLong?): CInt =
    AixModRawLibc.timerCreate(clockid, sevp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)

public actual fun timerDelete(timerid: TimerT): CInt =
    AixModRawLibc.timerDelete(timerid)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    AixModRawLibc.timerGetoverrun(timerid)

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    AixModRawLibc.timerGettime(timerid, value?.toLong() ?: 0L)

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.TimerT, flags: CInt, newValue: io.github.kotlinmania.libc.Itimerspec?, oldValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    AixModRawLibc.timerSettime(timerid, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun truncate64(path: String?, length: Off64T): CInt =
    AixModRawLibc.truncate64(path, length)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    AixModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun updwtmp(file: String?, u: Utmp?) {
    AixModRawLibc.updwtmp(file, u?.toLong() ?: 0L)
}

public actual fun uselocale(loc: LocaleT): LocaleT =
    AixModRawLibc.uselocale(loc)

public actual fun utmpname(file: String?): CInt =
    AixModRawLibc.utmpname(file)

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    AixModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun wait4(pid: PidT, status: CInt?, options: CInt, rusage: Rusage?): PidT =
    AixModRawLibc.wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    AixModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    AixModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun errno(): CInt? =
    AixModRawLibc.errno()
