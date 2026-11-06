package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.COpaquePointer

internal object HurdModRawLibc {
    external fun lutimes(file: String?, times: Long): Int
    external fun futimes(fd: Int, times: Long): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun mkfifoat(fd: Int, path: String?, mode: Int): Int
    external fun mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun libcCurrentSigrtmin(): Int
    external fun libcCurrentSigrtmax(): Int
    external fun wait4(pid: Long, status: Long, options: Int, rusage: Long): Long
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun sigwait(set: Long, sig: Long): Int
    external fun sigsuspend(mask: Long): Int
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
    external fun sigwaitinfo(set: Long, info: Long): Int
    external fun sigaltstack(ss: Long, oss: Long): Int
    external fun pipe2(fds: Long, flags: Int): Int
    external fun dup3(oldfd: Int, newfd: Int, flags: Int): Int
    external fun pread64(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun pwrite64(fd: Int, buf: Long, count: Long, offset: Long): Long
    external fun readv(fd: Int, iovec: Long, count: Int): Long
    external fun writev(fd: Int, iovec: Long, count: Int): Long
    external fun preadv(fd: Int, iovec: Long, count: Int, offset: Long): Long
    external fun pwritev(fd: Int, iovec: Long, count: Int, offset: Long): Long
    external fun preadv64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun pwritev64(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun freadUnlocked(buf: Long, size: Long, nobj: Long, stream: Long): Long
    external fun aioRead(aiocbp: Long): Int
    external fun aioWrite(aiocbp: Long): Int
    external fun aioFsync(op: Int, aiocbp: Long): Int
    external fun aioError(aiocbp: Long): Int
    external fun aioReturn(aiocbp: Long): Long
    external fun aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int
    external fun aioCancel(fd: Int, aiocbp: Long): Int
    external fun lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int
    external fun mqClose(mqd: Long): Int
    external fun mqUnlink(name: String?): Int
    external fun mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long
    external fun mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long
    external fun mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int
    external fun mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int
    external fun mqGetattr(mqd: Long, attr: Long): Int
    external fun mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int
    external fun lseek64(fd: Int, offset: Long, whence: Int): Long
    external fun lseek(fd: Int, offset: Long, whence: Int): Long
    external fun fgetpos64(stream: Long, ptr: Long): Int
    external fun fseeko64(stream: Long, offset: Long, whence: Int): Int
    external fun fsetpos64(stream: Long, ptr: Long): Int
    external fun ftello64(stream: Long): Long
    external fun bind(fd: Int, addr: Long, len: Long): Int
    external fun accept4(fd: Int, addr: Long, len: Long, flg: Int): Int
    external fun ppoll(fds: Long, nfds: Long, timeout: Long, sigmask: Long): Int
    external fun recvmsg(fd: Int, message: Long, flags: Int): Long
    external fun sendmsg(fd: Int, message: Long, flags: Int): Long
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun sendfile(outFd: Int, inFd: Int, offset: Long, count: Long): Long
    external fun sendfile64(outFd: Int, inFd: Int, offset: Long, count: Long): Long
    external fun shutdown(fd: Int, how: Int): Int
    external fun sethostname(name: String?, len: Long): Int
    external fun getdomainname(name: Long, len: Long): Int
    external fun setdomainname(name: String?, len: Long): Int
    external fun ifNameindex(): Long?
    external fun ifFreenameindex(ptr: Long)
    external fun getnameinfo(sa: Long, salen: Long, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun getifaddrs(ifap: Long): Int
    external fun freeifaddrs(ifa: Long)
    external fun uname(buf: Long): Int
    external fun gethostid(): Long
    external fun sethostid(hostid: Long): Int
    external fun setpwent()
    external fun endpwent()
    external fun getpwent(): Long?
    external fun setgrent()
    external fun endgrent()
    external fun getgrent(): Long?
    external fun setspent()
    external fun endspent()
    external fun getspent(): Long?
    external fun getspnam(name: String?): Long?
    external fun getpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun fgetpwentR(stream: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun fgetgrentR(stream: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun putpwent(p: Long, stream: Long): Int
    external fun putgrent(grp: Long, stream: Long): Int
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun fgetspentR(fp: Long, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int
    external fun sgetspentR(s: String?, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int
    external fun getspentR(spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int
    external fun getspnamR(name: String?, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int
    external fun getmntentR(stream: Long, mntbuf: Long, buf: Long, buflen: Int): Long?
    external fun utmpname(file: String?): Int
    external fun utmpxname(file: String?): Int
    external fun getutxent(): Long?
    external fun getutxid(ut: Long): Long?
    external fun getutxline(ut: Long): Long?
    external fun pututxline(ut: Long): Long?
    external fun setutxent()
    external fun endutxent()
    external fun getresuid(ruid: Long, euid: Long, suid: Long): Int
    external fun getresgid(rgid: Long, egid: Long, sgid: Long): Int
    external fun setresuid(ruid: Long, euid: Long, suid: Long): Int
    external fun setresgid(rgid: Long, egid: Long, sgid: Long): Int
    external fun initgroups(user: String?, group: Long): Int
    external fun getgrgid(gid: Long): Long?
    external fun getgrgidR(gid: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrouplist(user: String?, group: Long, groups: Long, ngroups: Long): Int
    external fun setgroups(ngroups: Long, ptr: Long): Int
    external fun acct(filename: String?): Int
    external fun setmntent(filename: String?, ty: String?): Long?
    external fun getmntent(stream: Long): Long?
    external fun addmntent(stream: Long, mnt: Long): Int
    external fun endmntent(streamp: Long): Int
    external fun hasmntopt(mnt: Long, opt: String?): Long?
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun pthreadKill(threadid: Long, signo: Int): Int
    external fun pthreadCancel(thread: Long): Int
    external fun pthreadEqual(t1: Long, t2: Long): Int
    external fun pthreadGetattrNp(thr: Long, attr: Long): Int
    external fun pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadMutexattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadMutexattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadMutexTimedlock(lock: Long, abstime: Long): Int
    external fun pthreadRwlockattrGetpshared(attr: Long, value: Long): Int
    external fun pthreadRwlockattrSetpshared(attr: Long, value: Int): Int
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Int): Int
    external fun pthreadCondattrGetpshared(attr: Long, pshared: Long): Int
    external fun pthreadCondattrSetpshared(attr: Long, pshared: Int): Int
    external fun pthreadOnce(control: Long, routine: Long): Int
    external fun pthreadBarrierattrInit(attr: Long): Int
    external fun pthreadBarrierattrDestroy(attr: Long): Int
    external fun pthreadBarrierattrGetpshared(attr: Long, shared: Long): Int
    external fun pthreadBarrierattrSetpshared(attr: Long, shared: Int): Int
    external fun pthreadBarrierInit(barrier: Long, attr: Long, count: Int): Int
    external fun pthreadBarrierDestroy(barrier: Long): Int
    external fun pthreadBarrierWait(barrier: Long): Int
    external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    external fun pthreadSpinDestroy(lock: Long): Int
    external fun pthreadSpinLock(lock: Long): Int
    external fun pthreadSpinTrylock(lock: Long): Int
    external fun pthreadSpinUnlock(lock: Long): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun pthreadSigmask(how: Int, newmask: Long, oldmask: Long): Int
    external fun schedGetparam(pid: Long, param: Long): Int
    external fun schedSetparam(pid: Long, param: Long): Int
    external fun schedGetscheduler(pid: Long): Int
    external fun schedSetscheduler(pid: Long, policy: Int, param: Long): Int
    external fun pthreadGetschedparam(native: Long, policy: Long, param: Long): Int
    external fun pthreadSetschedparam(native: Long, policy: Int, param: Long): Int
    external fun pthreadGetcpuclockid(thread: Long, clkId: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun semDestroy(sem: Long): Int
    external fun semTimedwait(sem: Long, abstime: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
    external fun clockGetres(clockId: Int, res: Long): Int
    external fun clockGettime(clockId: Int, tp: Long): Int
    external fun clockSettime(clockId: Int, tp: Long): Int
    external fun clockGetcpuclockid(pid: Long, clkId: Long): Int
    external fun clockNanosleep(clkId: Long, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun settimeofday(tv: Long, tz: Long): Int
    external fun asctimeR(tm: Long, buf: Long): Long?
    external fun ctimeR(timep: Long, buf: Long): Long?
    external fun strftime(s: Long, max: Long, format: String?, tm: Long): Long
    external fun strptime(s: String?, format: String?, tm: Long): Long?
    external fun timerCreate(clockid: Long, sevp: Long, timerid: Long): Int
    external fun timerDelete(timerid: Long): Int
    external fun timerGetoverrun(timerid: Long): Int
    external fun timerGettime(timerid: Long, currValue: Long): Int
    external fun timerSettime(timerid: Long, flags: Int, newValue: Long, oldValue: Long): Int
    external fun fstat(fd: Int, buf: Long): Int
    external fun fstat64(fd: Int, buf: Long): Int
    external fun fstatat(fd: Int, file: String?, buf: Long, flag: Int): Int
    external fun fstatat64(fd: Int, file: String?, buf: Long, flag: Int): Int
    external fun statx(dirfd: Int, pathname: String?, flags: Int, mask: Int, statxbuf: Long): Int
    external fun ftruncate(fd: Int, length: Long): Int
    external fun ftruncate64(fd: Int, length: Long): Int
    external fun truncate64(file: String?, length: Long): Int
    external fun lstat(file: String?, buf: Long): Int
    external fun lstat64(file: String?, buf: Long): Int
    external fun statfs(path: String?, buf: Long): Int
    external fun statfs64(file: String?, buf: Long): Int
    external fun fstatfs(fd: Int, buf: Long): Int
    external fun fstatfs64(fildes: Int, buf: Long): Int
    external fun statvfs(file: String?, buf: Long): Int
    external fun statvfs64(file: String?, buf: Long): Int
    external fun fstatvfs(fildes: Int, buf: Long): Int
    external fun fstatvfs64(fildes: Int, buf: Long): Int
    external fun fopen64(filename: String?, mode: String?): Long?
    external fun freopen64(filename: String?, mode: String?, file: Long): Long?
    external fun creat64(path: String?, mode: Int): Int
    external fun mkostemp(template: Long, flags: Int): Int
    external fun mkostemps(template: Long, suffixlen: Int, flags: Int): Int
    external fun mkstemps(template: Long, suffixlen: Int): Int
    external fun tmpfile64(): Long?
    external fun popen(command: String?, mode: String?): Long?
    external fun getdtablesize(): Int
    external fun closeRange(first: Int, last: Int, flags: Int): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Long
    external fun getpt(): Int
    external fun ptsnameR(fd: Int, buf: Long, buflen: Long): Int
    external fun loginTty(fd: Int): Int
    external fun ctermid(s: Long): Long?
    external fun clearenv(): Int
    external fun execveat(dirfd: Int, pathname: String?, argv: Long, envp: Long, flags: Int): Int
    external fun execvpe(file: String?, argv: Long, envp: Long): Int
    external fun fexecve(fd: Int, argv: Long, envp: Long): Int
    external fun daemon(nochdir: Int, noclose: Int): Int
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
    external fun posixSpawnattrSetpgroup(attr: Long, flags: Long): Int
    external fun posixSpawnattrGetschedpolicy(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetschedpolicy(attr: Long, flags: Int): Int
    external fun posixSpawnattrGetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnattrSetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnFileActionsInit(actions: Long): Int
    external fun posixSpawnFileActionsDestroy(actions: Long): Int
    external fun posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int
    external fun posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int
    external fun posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int
    external fun posixSpawnFileActionsAddchdirNp(actions: Long, path: String?): Int
    external fun posixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int
    external fun posixSpawnFileActionsAddclosefromNp(actions: Long, from: Int): Int
    external fun posixSpawnFileActionsAddtcsetpgrpNp(actions: Long, tcfd: Int): Int
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun euidaccess(pathname: String?, mode: Int): Int
    external fun eaccess(pathname: String?, mode: Int): Int
    external fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun stat(file: String?, buf: Long): Int
    external fun stat64(file: String?, buf: Long): Int
    external fun readdir(dirp: Long): Long?
    external fun readdir64(dirp: Long): Long?
    external fun readdirR(dirp: Long, entry: Long, result: Long): Int
    external fun readdir64R(dirp: Long, entry: Long, result: Long): Int
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun dirfd(dirp: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun errnoLocation(): Long?
    external fun mmap64(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long?
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun sync()
    external fun syncfs(fd: Int): Int
    external fun fdatasync(fd: Int): Int
    external fun fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun posixFallocate64(fd: Int, offset: Long, len: Long): Int
    external fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun posixFadvise64(fd: Int, offset: Long, len: Long, advise: Int): Int
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun posixMadvise(addr: Long, len: Long, advice: Int): Int
    external fun getrlimit(resource: Long, rlim: Long): Int
    external fun getrlimit64(resource: Long, rlim: Long): Int
    external fun setrlimit(resource: Long, rlim: Long): Int
    external fun setrlimit64(resource: Long, rlim: Long): Int
    external fun getpriority(which: Long, who: Long): Int
    external fun setpriority(which: Long, who: Long, prio: Int): Int
    external fun getrandom(buffer: Long, length: Long, flags: Int): Long
    external fun getentropy(buffer: Long, length: Long): Int
    external fun memrchr(cx: Long, c: Int, n: Long): Long?
    external fun memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long?
    external fun strchrnul(s: String?, c: Int): Long?
    external fun abs(i: Int): Int
    external fun labs(i: Long): Long
    external fun rand(): Int
    external fun srand(seed: Int)
    external fun drand48(): Double
    external fun erand48(xseed: Long): Double
    external fun lrand48(): Long
    external fun nrand48(xseed: Long): Long
    external fun mrand48(): Long
    external fun jrand48(xseed: Long): Long
    external fun srand48(seed: Long)
    external fun seed48(xseed: Long): Long?
    external fun lcong48(p: Long)
    external fun qsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)
    external fun brk(addr: Long): Int
    external fun sbrk(increment: Long): Long?
    external fun memalign(align: Long, size: Long): Long?
    external fun mallopt(param: Int, value: Int): Int
    external fun mallinfo(): Long
    external fun mallinfo2(): Long
    external fun mallocInfo(options: Int, stream: Long): Int
    external fun mallocUsableSize(ptr: Long): Long
    external fun mallocTrim(pad: Long): Int
    external fun iconvOpen(tocode: String?, fromcode: String?): Long
    external fun iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long
    external fun iconvClose(cd: Long): Int
    external fun getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int
    external fun backtrace(buf: Long, sz: Int): Int
    external fun reboot(howTo: Int): Int
    external fun getloadavg(loadavg: Long, nelem: Int): Int
    external fun regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int
    external fun regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long
    external fun regfree(preg: Long)
    external fun glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree(pglob: Long)
    external fun glob64(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree64(pglob: Long)
    external fun getxattr(path: String?, name: String?, value: Long, size: Long): Long
    external fun lgetxattr(path: String?, name: String?, value: Long, size: Long): Long
    external fun fgetxattr(filedes: Int, name: String?, value: Long, size: Long): Long
    external fun setxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int
    external fun lsetxattr(path: String?, name: String?, value: Long, size: Long, flags: Int): Int
    external fun fsetxattr(filedes: Int, name: String?, value: Long, size: Long, flags: Int): Int
    external fun listxattr(path: String?, list: Long, size: Long): Long
    external fun llistxattr(path: String?, list: Long, size: Long): Long
    external fun flistxattr(filedes: Int, list: Long, size: Long): Long
    external fun removexattr(path: String?, name: String?): Int
    external fun lremovexattr(path: String?, name: String?): Int
    external fun fremovexattr(filedes: Int, name: String?): Int
    external fun dirname(path: Long): Long?
    external fun posixBasename(path: Long): Long?
    external fun gnuBasename(path: String?): Long?
    external fun dlmopen(lmid: Long, filename: String?, flag: Int): Long?
    external fun dlinfo(handle: Long, request: Int, info: Long): Int
    external fun dladdr1(addr: Long, info: Long, extraInfo: Long, flags: Int): Int
    external fun duplocale(base: Long): Long
    external fun freelocale(loc: Long)
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun uselocale(loc: Long): Long
    external fun nlLanginfo(item: Long): Long?
    external fun nlLanginfoL(item: Long, locale: Long): Long?
    external fun dlIteratePhdr(callback: Long, data: Long): Int
    external fun gnuGetLibcRelease(): Long?
    external fun gnuGetLibcVersion(): Long?
}

public actual fun lutimes(file: String?, times: io.github.kotlinmania.libc.Timeval?): CInt =
    HurdModRawLibc.lutimes(file, times?.toLong() ?: 0L)

public actual fun futimes(fd: CInt, times: io.github.kotlinmania.libc.Timeval?): CInt =
    HurdModRawLibc.futimes(fd, times?.toLong() ?: 0L)

public actual fun futimens(fd: CInt, times: io.github.kotlinmania.libc.Timespec?): CInt =
    HurdModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun utimensat(dirfd: CInt, path: String?, times: io.github.kotlinmania.libc.Timespec?, flag: CInt): CInt =
    HurdModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun mkfifoat(fd: CInt, path: String?, mode: ModeT): CInt =
    HurdModRawLibc.mkfifoat(fd, path, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    HurdModRawLibc.mknodat(dirfd, pathname, mode, dev)

public actual fun libcCurrentSigrtmin(): CInt =
    HurdModRawLibc.libcCurrentSigrtmin()

public actual fun libcCurrentSigrtmax(): CInt =
    HurdModRawLibc.libcCurrentSigrtmax()

public actual fun wait4(pid: io.github.kotlinmania.libc.PidT, status: CInt?, options: CInt, rusage: Rusage?): io.github.kotlinmania.libc.PidT =
    HurdModRawLibc.wait4(pid, status?.toLong() ?: 0L, options, rusage?.toLong() ?: 0L)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    HurdModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun sigwait(set: CUlong?, sig: CInt?): CInt =
    HurdModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun sigsuspend(mask: CUlong?): CInt =
    HurdModRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun sigtimedwait(set: CUlong?, info: SiginfoT?, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    HurdModRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sigwaitinfo(set: CUlong?, info: SiginfoT?): CInt =
    HurdModRawLibc.sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    HurdModRawLibc.sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    HurdModRawLibc.pipe2(fds?.toLong() ?: 0L, flags)

public actual fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt =
    HurdModRawLibc.dup3(oldfd, newfd, flags)

public actual fun pread64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    HurdModRawLibc.pread64(fd, buf?.value ?: 0L, count, offset)

public actual fun pwrite64(fd: CInt, buf: COpaquePointer?, count: SizeT, offset: Off64T): SsizeT =
    HurdModRawLibc.pwrite64(fd, buf?.value ?: 0L, count, offset)

public actual fun readv(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt): SsizeT =
    HurdModRawLibc.readv(fd, iovec?.toLong() ?: 0L, count)

public actual fun writev(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt): SsizeT =
    HurdModRawLibc.writev(fd, iovec?.toLong() ?: 0L, count)

public actual fun preadv(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt, offset: OffT): SsizeT =
    HurdModRawLibc.preadv(fd, iovec?.toLong() ?: 0L, count, offset)

public actual fun pwritev(fd: CInt, iovec: io.github.kotlinmania.libc.Iovec?, count: CInt, offset: OffT): SsizeT =
    HurdModRawLibc.pwritev(fd, iovec?.toLong() ?: 0L, count, offset)

public actual fun preadv64(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    HurdModRawLibc.preadv64(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun pwritev64(fd: CInt, iov: io.github.kotlinmania.libc.Iovec?, iovcnt: CInt, offset: Off64T): SsizeT =
    HurdModRawLibc.pwritev64(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun freadUnlocked(buf: COpaquePointer?, size: SizeT, nobj: SizeT, stream: FILE?): SizeT =
    HurdModRawLibc.freadUnlocked(buf?.value ?: 0L, size, nobj, stream?.toLong() ?: 0L)

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    HurdModRawLibc.aioRead(aiocbp?.toLong() ?: 0L)

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    HurdModRawLibc.aioWrite(aiocbp?.toLong() ?: 0L)

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    HurdModRawLibc.aioFsync(op, aiocbp?.toLong() ?: 0L)

public actual fun aioError(aiocbp: Aiocb?): CInt =
    HurdModRawLibc.aioError(aiocbp?.toLong() ?: 0L)

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    HurdModRawLibc.aioReturn(aiocbp?.toLong() ?: 0L)

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: io.github.kotlinmania.libc.Timespec?): CInt =
    HurdModRawLibc.aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    HurdModRawLibc.aioCancel(fd, aiocbp?.toLong() ?: 0L)

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: io.github.kotlinmania.libc.Sigevent?): CInt =
    HurdModRawLibc.lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    HurdModRawLibc.mqClose(mqd)

public actual fun mqUnlink(name: String?): CInt =
    HurdModRawLibc.mqUnlink(name)

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    HurdModRawLibc.mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: io.github.kotlinmania.libc.Timespec?): SsizeT =
    HurdModRawLibc.mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    HurdModRawLibc.mqSend(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: io.github.kotlinmania.libc.Timespec?): CInt =
    HurdModRawLibc.mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    HurdModRawLibc.mqGetattr(mqd, attr?.toLong() ?: 0L)

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    HurdModRawLibc.mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)

public actual fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T =
    HurdModRawLibc.lseek64(fd, offset, whence)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    HurdModRawLibc.lseek(fd, offset, whence)

public actual fun fgetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    HurdModRawLibc.fgetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun fseeko64(stream: FILE?, offset: Off64T, whence: CInt): CInt =
    HurdModRawLibc.fseeko64(stream?.toLong() ?: 0L, offset, whence)

public actual fun fsetpos64(stream: FILE?, ptr: Fpos64T?): CInt =
    HurdModRawLibc.fsetpos64(stream?.toLong() ?: 0L, ptr?.toLong() ?: 0L)

public actual fun ftello64(stream: FILE?): Off64T =
    HurdModRawLibc.ftello64(stream?.toLong() ?: 0L)

public actual fun bind(fd: CInt, addr: Sockaddr?, len: io.github.kotlinmania.libc.SocklenT): CInt =
    HurdModRawLibc.bind(fd, addr?.toLong() ?: 0L, len)

public actual fun accept4(fd: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, len: CUint?, flg: CInt): CInt =
    HurdModRawLibc.accept4(fd, addr?.toLong() ?: 0L, len?.toLong() ?: 0L, flg)

public actual fun ppoll(fds: Pollfd?, nfds: NfdsT, timeout: io.github.kotlinmania.libc.Timespec?, sigmask: CUlong?): CInt =
    HurdModRawLibc.ppoll(fds?.toLong() ?: 0L, nfds, timeout?.toLong() ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun recvmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT =
    HurdModRawLibc.recvmsg(fd, message?.toLong() ?: 0L, flags)

public actual fun sendmsg(fd: CInt, message: Msghdr?, flags: CInt): SsizeT =
    HurdModRawLibc.sendmsg(fd, message?.toLong() ?: 0L, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT =
    HurdModRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun sendfile(outFd: CInt, inFd: CInt, offset: CLong?, count: SizeT): SsizeT =
    HurdModRawLibc.sendfile(outFd, inFd, offset?.toLong() ?: 0L, count)

public actual fun sendfile64(outFd: CInt, inFd: CInt, offset: SquadType?, count: SizeT): SsizeT =
    HurdModRawLibc.sendfile64(outFd, inFd, offset?.toLong() ?: 0L, count)

public actual fun shutdown(fd: CInt, how: CInt): CInt =
    HurdModRawLibc.shutdown(fd, how)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    HurdModRawLibc.sethostname(name, len)

public actual fun getdomainname(name: COpaquePointer?, len: SizeT): CInt =
    HurdModRawLibc.getdomainname(name?.value ?: 0L, len)

public actual fun setdomainname(name: String?, len: SizeT): CInt =
    HurdModRawLibc.setdomainname(name, len)

public actual fun ifNameindex(): IfNameindex? =
    HurdModRawLibc.ifNameindex()

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    HurdModRawLibc.ifFreenameindex(ptr?.toLong() ?: 0L)
}

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    HurdModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    HurdModRawLibc.getifaddrs(ifap?.value ?: 0L)

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    HurdModRawLibc.freeifaddrs(ifa?.toLong() ?: 0L)
}

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    HurdModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun gethostid(): CLong =
    HurdModRawLibc.gethostid()

public actual fun sethostid(hostid: CLong): CInt =
    HurdModRawLibc.sethostid(hostid)

public actual fun setpwent() {
    HurdModRawLibc.setpwent()
}

public actual fun endpwent() {
    HurdModRawLibc.endpwent()
}

public actual fun getpwent(): Passwd? =
    HurdModRawLibc.getpwent()

public actual fun setgrent() {
    HurdModRawLibc.setgrent()
}

public actual fun endgrent() {
    HurdModRawLibc.endgrent()
}

public actual fun getgrent(): Group? =
    HurdModRawLibc.getgrent()

public actual fun setspent() {
    HurdModRawLibc.setspent()
}

public actual fun endspent() {
    HurdModRawLibc.endspent()
}

public actual fun getspent(): Spwd? =
    HurdModRawLibc.getspent()

public actual fun getspnam(name: String?): Spwd? =
    HurdModRawLibc.getspnam(name)

public actual fun getpwentR(pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HurdModRawLibc.getpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrentR(grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HurdModRawLibc.getgrentR(grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun fgetpwentR(stream: FILE?, pwd: io.github.kotlinmania.libc.Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HurdModRawLibc.fgetpwentR(stream?.toLong() ?: 0L, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HurdModRawLibc.fgetgrentR(stream?.toLong() ?: 0L, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun putpwent(p: io.github.kotlinmania.libc.Passwd?, stream: FILE?): CInt =
    HurdModRawLibc.putpwent(p?.toLong() ?: 0L, stream?.toLong() ?: 0L)

public actual fun putgrent(grp: Group?, stream: FILE?): CInt =
    HurdModRawLibc.putgrent(grp?.toLong() ?: 0L, stream?.toLong() ?: 0L)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HurdModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: io.github.kotlinmania.libc.UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HurdModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun fgetspentR(fp: FILE?, spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    HurdModRawLibc.fgetspentR(fp?.toLong() ?: 0L, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)

public actual fun sgetspentR(s: String?, spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    HurdModRawLibc.sgetspentR(s, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)

public actual fun getspentR(spbuf: io.github.kotlinmania.libc.Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    HurdModRawLibc.getspentR(spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)

public actual fun getspnamR(name: String?, spbuf: Spwd?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    HurdModRawLibc.getspnamR(name, spbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen, spbufp?.value ?: 0L)

public actual fun getmntentR(stream: FILE?, mntbuf: io.github.kotlinmania.libc.Mntent?, buf: COpaquePointer?, buflen: CInt): io.github.kotlinmania.libc.Mntent? =
    HurdModRawLibc.getmntentR(stream?.toLong() ?: 0L, mntbuf?.toLong() ?: 0L, buf?.value ?: 0L, buflen)

public actual fun utmpname(file: String?): CInt =
    HurdModRawLibc.utmpname(file)

public actual fun utmpxname(file: String?): CInt =
    HurdModRawLibc.utmpxname(file)

public actual fun getutxent(): Utmpx? =
    HurdModRawLibc.getutxent()

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    HurdModRawLibc.getutxid(ut?.toLong() ?: 0L)

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    HurdModRawLibc.getutxline(ut?.toLong() ?: 0L)

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    HurdModRawLibc.pututxline(ut?.toLong() ?: 0L)

public actual fun setutxent() {
    HurdModRawLibc.setutxent()
}

public actual fun endutxent() {
    HurdModRawLibc.endutxent()
}

public actual fun getresuid(ruid: CUint?, euid: CUint?, suid: CUint?): CInt =
    HurdModRawLibc.getresuid(ruid?.toLong() ?: 0L, euid?.toLong() ?: 0L, suid?.toLong() ?: 0L)

public actual fun getresgid(rgid: CUint?, egid: CUint?, sgid: CUint?): CInt =
    HurdModRawLibc.getresgid(rgid?.toLong() ?: 0L, egid?.toLong() ?: 0L, sgid?.toLong() ?: 0L)

public actual fun setresuid(ruid: io.github.kotlinmania.libc.UidT, euid: io.github.kotlinmania.libc.UidT, suid: io.github.kotlinmania.libc.UidT): CInt =
    HurdModRawLibc.setresuid(ruid, euid, suid)

public actual fun setresgid(rgid: io.github.kotlinmania.libc.GidT, egid: io.github.kotlinmania.libc.GidT, sgid: io.github.kotlinmania.libc.GidT): CInt =
    HurdModRawLibc.setresgid(rgid, egid, sgid)

public actual fun initgroups(user: String?, group: io.github.kotlinmania.libc.GidT): CInt =
    HurdModRawLibc.initgroups(user, group)

public actual fun getgrgid(gid: io.github.kotlinmania.libc.GidT): Group? =
    HurdModRawLibc.getgrgid(gid)

public actual fun getgrgidR(gid: io.github.kotlinmania.libc.GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HurdModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrnam(name: String?): Group? =
    HurdModRawLibc.getgrnam(name)

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HurdModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrouplist(user: String?, group: io.github.kotlinmania.libc.GidT, groups: CUint?, ngroups: CInt?): CInt =
    HurdModRawLibc.getgrouplist(user, group, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun setgroups(ngroups: SizeT, ptr: CUint?): CInt =
    HurdModRawLibc.setgroups(ngroups, ptr?.toLong() ?: 0L)

public actual fun acct(filename: String?): CInt =
    HurdModRawLibc.acct(filename)

public actual fun setmntent(filename: String?, ty: String?): FILE? =
    HurdModRawLibc.setmntent(filename, ty)

public actual fun getmntent(stream: FILE?): io.github.kotlinmania.libc.Mntent? =
    HurdModRawLibc.getmntent(stream?.toLong() ?: 0L)

public actual fun addmntent(stream: FILE?, mnt: io.github.kotlinmania.libc.Mntent?): CInt =
    HurdModRawLibc.addmntent(stream?.toLong() ?: 0L, mnt?.toLong() ?: 0L)

public actual fun endmntent(streamp: FILE?): CInt =
    HurdModRawLibc.endmntent(streamp?.toLong() ?: 0L)

public actual fun hasmntopt(mnt: io.github.kotlinmania.libc.Mntent?, opt: String?): COpaquePointer? =
    HurdModRawLibc.hasmntopt(mnt?.toLong() ?: 0L, opt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadCreate(native: CLong?, attr: PthreadAttr?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    HurdModRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun pthreadKill(threadid: io.github.kotlinmania.libc.PthreadT, signo: CInt): CInt =
    HurdModRawLibc.pthreadKill(threadid, signo)

public actual fun pthreadCancel(thread: io.github.kotlinmania.libc.PthreadT): CInt =
    HurdModRawLibc.pthreadCancel(thread)

public actual fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt =
    HurdModRawLibc.pthreadEqual(t1, t2)

public actual fun pthreadGetattrNp(thr: io.github.kotlinmania.libc.PthreadT, attr: PthreadAttr?): CInt =
    HurdModRawLibc.pthreadGetattrNp(thr, attr?.toLong() ?: 0L)

public actual fun pthreadAttrGetguardsize(attr: PthreadAttr?, guardsize: SizeT?): CInt =
    HurdModRawLibc.pthreadAttrGetguardsize(attr?.toLong() ?: 0L, guardsize?.toLong() ?: 0L)

public actual fun pthreadAttrSetguardsize(attr: PthreadAttr?, guardsize: SizeT): CInt =
    HurdModRawLibc.pthreadAttrSetguardsize(attr?.toLong() ?: 0L, guardsize)

public actual fun pthreadAttrGetstack(attr: PthreadAttr?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    HurdModRawLibc.pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetpshared(attr: PthreadMutexattr?, pshared: CInt?): CInt =
    HurdModRawLibc.pthreadMutexattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadMutexattrSetpshared(attr: PthreadMutexattr?, pshared: CInt): CInt =
    HurdModRawLibc.pthreadMutexattrSetpshared(attr?.toLong() ?: 0L, pshared)

public actual fun pthreadMutexTimedlock(lock: PthreadMutex?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    HurdModRawLibc.pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadRwlockattrGetpshared(attr: PthreadRwlockattr?, value: CInt?): CInt =
    HurdModRawLibc.pthreadRwlockattrGetpshared(attr?.toLong() ?: 0L, value?.toLong() ?: 0L)

public actual fun pthreadRwlockattrSetpshared(attr: PthreadRwlockattr?, value: CInt): CInt =
    HurdModRawLibc.pthreadRwlockattrSetpshared(attr?.toLong() ?: 0L, value)

public actual fun pthreadCondattrGetclock(attr: PthreadCondattr?, clockId: CInt?): CInt =
    HurdModRawLibc.pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattr?, clockId: ClockidT): CInt =
    HurdModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun pthreadCondattrGetpshared(attr: PthreadCondattr?, pshared: CInt?): CInt =
    HurdModRawLibc.pthreadCondattrGetpshared(attr?.toLong() ?: 0L, pshared?.toLong() ?: 0L)

public actual fun pthreadCondattrSetpshared(attr: PthreadCondattr?, pshared: CInt): CInt =
    HurdModRawLibc.pthreadCondattrSetpshared(attr?.toLong() ?: 0L, pshared)

public actual fun pthreadOnce(control: PthreadOnce?, routine: PthreadOnceRoutineCallback): CInt =
    HurdModRawLibc.pthreadOnce(control?.toLong() ?: 0L, routine)

public actual fun pthreadBarrierattrInit(attr: PthreadBarrierattr?): CInt =
    HurdModRawLibc.pthreadBarrierattrInit(attr?.toLong() ?: 0L)

public actual fun pthreadBarrierattrDestroy(attr: PthreadBarrierattr?): CInt =
    HurdModRawLibc.pthreadBarrierattrDestroy(attr?.toLong() ?: 0L)

public actual fun pthreadBarrierattrGetpshared(attr: PthreadBarrierattr?, shared: CInt?): CInt =
    HurdModRawLibc.pthreadBarrierattrGetpshared(attr?.toLong() ?: 0L, shared?.toLong() ?: 0L)

public actual fun pthreadBarrierattrSetpshared(attr: PthreadBarrierattr?, shared: CInt): CInt =
    HurdModRawLibc.pthreadBarrierattrSetpshared(attr?.toLong() ?: 0L, shared)

public actual fun pthreadBarrierInit(barrier: PthreadBarrier?, attr: PthreadBarrierattr?, count: CUint): CInt =
    HurdModRawLibc.pthreadBarrierInit(barrier?.toLong() ?: 0L, attr?.toLong() ?: 0L, count)

public actual fun pthreadBarrierDestroy(barrier: PthreadBarrier?): CInt =
    HurdModRawLibc.pthreadBarrierDestroy(barrier?.toLong() ?: 0L)

public actual fun pthreadBarrierWait(barrier: PthreadBarrier?): CInt =
    HurdModRawLibc.pthreadBarrierWait(barrier?.toLong() ?: 0L)

public actual fun pthreadSpinInit(lock: CInt?, pshared: CInt): CInt =
    HurdModRawLibc.pthreadSpinInit(lock?.toLong() ?: 0L, pshared)

public actual fun pthreadSpinDestroy(lock: CInt?): CInt =
    HurdModRawLibc.pthreadSpinDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadSpinLock(lock: CInt?): CInt =
    HurdModRawLibc.pthreadSpinLock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinTrylock(lock: CInt?): CInt =
    HurdModRawLibc.pthreadSpinTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinUnlock(lock: CInt?): CInt =
    HurdModRawLibc.pthreadSpinUnlock(lock?.toLong() ?: 0L)

public actual fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt =
    HurdModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun pthreadSigmask(how: CInt, newmask: CUlong?, oldmask: CUlong?): CInt =
    HurdModRawLibc.pthreadSigmask(how, newmask?.toLong() ?: 0L, oldmask?.toLong() ?: 0L)

public actual fun schedGetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    HurdModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun schedSetparam(pid: io.github.kotlinmania.libc.PidT, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    HurdModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: io.github.kotlinmania.libc.PidT): CInt =
    HurdModRawLibc.schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: io.github.kotlinmania.libc.PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    HurdModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun pthreadGetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    HurdModRawLibc.pthreadGetschedparam(native, policy?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun pthreadSetschedparam(native: io.github.kotlinmania.libc.PthreadT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    HurdModRawLibc.pthreadSetschedparam(native, policy, param?.toLong() ?: 0L)

public actual fun pthreadGetcpuclockid(thread: io.github.kotlinmania.libc.PthreadT, clkId: CInt?): CInt =
    HurdModRawLibc.pthreadGetcpuclockid(thread, clkId?.toLong() ?: 0L)

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    HurdModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun semDestroy(sem: SemT?): CInt =
    HurdModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semTimedwait(sem: SemT?, abstime: io.github.kotlinmania.libc.Timespec?): CInt =
    HurdModRawLibc.semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    HurdModRawLibc.semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)

public actual fun clockGetres(clockId: ClockidT, res: io.github.kotlinmania.libc.Timespec?): CInt =
    HurdModRawLibc.clockGetres(clockId, res?.toLong() ?: 0L)

public actual fun clockGettime(clockId: ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    HurdModRawLibc.clockGettime(clockId, tp?.toLong() ?: 0L)

public actual fun clockSettime(clockId: ClockidT, tp: io.github.kotlinmania.libc.Timespec?): CInt =
    HurdModRawLibc.clockSettime(clockId, tp?.toLong() ?: 0L)

public actual fun clockGetcpuclockid(pid: io.github.kotlinmania.libc.PidT, clkId: CInt?): CInt =
    HurdModRawLibc.clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: io.github.kotlinmania.libc.Timespec?, rmtp: io.github.kotlinmania.libc.Timespec?): CInt =
    HurdModRawLibc.clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun gettimeofday(tp: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    HurdModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun settimeofday(tv: io.github.kotlinmania.libc.Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    HurdModRawLibc.settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun asctimeR(tm: io.github.kotlinmania.libc.Tm?, buf: COpaquePointer?): COpaquePointer? =
    HurdModRawLibc.asctimeR(tm?.toLong() ?: 0L, buf?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(timep: CLong?, buf: COpaquePointer?): COpaquePointer? =
    HurdModRawLibc.ctimeR(timep?.toLong() ?: 0L, buf?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, max: SizeT, format: String?, tm: io.github.kotlinmania.libc.Tm?): SizeT =
    HurdModRawLibc.strftime(s?.value ?: 0L, max, format, tm?.toLong() ?: 0L)

public actual fun strptime(s: String?, format: String?, tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    HurdModRawLibc.strptime(s, format, tm?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun timerCreate(clockid: io.github.kotlinmania.libc.ClockidT, sevp: io.github.kotlinmania.libc.Sigevent?, timerid: UwordType?): CInt =
    HurdModRawLibc.timerCreate(clockid, sevp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.TimerT): CInt =
    HurdModRawLibc.timerDelete(timerid)

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.TimerT): CInt =
    HurdModRawLibc.timerGetoverrun(timerid)

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.TimerT, currValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    HurdModRawLibc.timerGettime(timerid, currValue?.toLong() ?: 0L)

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.TimerT, flags: CInt, newValue: io.github.kotlinmania.libc.Itimerspec?, oldValue: io.github.kotlinmania.libc.Itimerspec?): CInt =
    HurdModRawLibc.timerSettime(timerid, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun fstat(fd: CInt, buf: Stat?): CInt =
    HurdModRawLibc.fstat(fd, buf?.toLong() ?: 0L)

public actual fun fstat64(fd: CInt, buf: Stat64?): CInt =
    HurdModRawLibc.fstat64(fd, buf?.toLong() ?: 0L)

public actual fun fstatat(fd: CInt, file: String?, buf: Stat?, flag: CInt): CInt =
    HurdModRawLibc.fstatat(fd, file, buf?.toLong() ?: 0L, flag)

public actual fun fstatat64(fd: CInt, file: String?, buf: Stat64?, flag: CInt): CInt =
    HurdModRawLibc.fstatat64(fd, file, buf?.toLong() ?: 0L, flag)

public actual fun statx(dirfd: CInt, pathname: String?, flags: CInt, mask: CUint, statxbuf: Statx?): CInt =
    HurdModRawLibc.statx(dirfd, pathname, flags, mask, statxbuf?.toLong() ?: 0L)

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    HurdModRawLibc.ftruncate(fd, length)

public actual fun ftruncate64(fd: CInt, length: Off64T): CInt =
    HurdModRawLibc.ftruncate64(fd, length)

public actual fun truncate64(file: String?, length: Off64T): CInt =
    HurdModRawLibc.truncate64(file, length)

public actual fun lstat(file: String?, buf: Stat?): CInt =
    HurdModRawLibc.lstat(file, buf?.toLong() ?: 0L)

public actual fun lstat64(file: String?, buf: Stat64?): CInt =
    HurdModRawLibc.lstat64(file, buf?.toLong() ?: 0L)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    HurdModRawLibc.statfs(path, buf?.toLong() ?: 0L)

public actual fun statfs64(file: String?, buf: Statfs64?): CInt =
    HurdModRawLibc.statfs64(file, buf?.toLong() ?: 0L)

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    HurdModRawLibc.fstatfs(fd, buf?.toLong() ?: 0L)

public actual fun fstatfs64(fildes: CInt, buf: Statfs64?): CInt =
    HurdModRawLibc.fstatfs64(fildes, buf?.toLong() ?: 0L)

public actual fun statvfs(file: String?, buf: Statvfs?): CInt =
    HurdModRawLibc.statvfs(file, buf?.toLong() ?: 0L)

public actual fun statvfs64(file: String?, buf: Statvfs64?): CInt =
    HurdModRawLibc.statvfs64(file, buf?.toLong() ?: 0L)

public actual fun fstatvfs(fildes: CInt, buf: Statvfs?): CInt =
    HurdModRawLibc.fstatvfs(fildes, buf?.toLong() ?: 0L)

public actual fun fstatvfs64(fildes: CInt, buf: Statvfs64?): CInt =
    HurdModRawLibc.fstatvfs64(fildes, buf?.toLong() ?: 0L)

public actual fun fopen64(filename: String?, mode: String?): FILE? =
    HurdModRawLibc.fopen64(filename, mode)

public actual fun freopen64(filename: String?, mode: String?, file: FILE?): FILE? =
    HurdModRawLibc.freopen64(filename, mode, file?.toLong() ?: 0L)

public actual fun creat64(path: String?, mode: ModeT): CInt =
    HurdModRawLibc.creat64(path, mode)

public actual fun mkostemp(template: COpaquePointer?, flags: CInt): CInt =
    HurdModRawLibc.mkostemp(template?.value ?: 0L, flags)

public actual fun mkostemps(template: COpaquePointer?, suffixlen: CInt, flags: CInt): CInt =
    HurdModRawLibc.mkostemps(template?.value ?: 0L, suffixlen, flags)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    HurdModRawLibc.mkstemps(template?.value ?: 0L, suffixlen)

public actual fun tmpfile64(): FILE? =
    HurdModRawLibc.tmpfile64()

public actual fun popen(command: String?, mode: String?): FILE? =
    HurdModRawLibc.popen(command, mode)

public actual fun getdtablesize(): CInt =
    HurdModRawLibc.getdtablesize()

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    HurdModRawLibc.closeRange(first, last, flags)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    HurdModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): io.github.kotlinmania.libc.PidT =
    HurdModRawLibc.forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun getpt(): CInt =
    HurdModRawLibc.getpt()

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    HurdModRawLibc.ptsnameR(fd, buf?.value ?: 0L, buflen)

public actual fun loginTty(fd: CInt): CInt =
    HurdModRawLibc.loginTty(fd)

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    HurdModRawLibc.ctermid(s?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun clearenv(): CInt =
    HurdModRawLibc.clearenv()

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    HurdModRawLibc.execveat(dirfd, pathname, argv?.value ?: 0L, envp?.value ?: 0L, flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    HurdModRawLibc.execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun fexecve(fd: CInt, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    HurdModRawLibc.fexecve(fd, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    HurdModRawLibc.daemon(nochdir, noclose)

public actual fun posixSpawn(pid: CInt?, path: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    HurdModRawLibc.posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnp(pid: CInt?, file: String?, fileActions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, attrp: io.github.kotlinmania.libc.PosixSpawnattrT?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    HurdModRawLibc.posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.toLong() ?: 0L, attrp?.toLong() ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT?): CInt =
    HurdModRawLibc.posixSpawnattrInit(attr?.toLong() ?: 0L)

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT?): CInt =
    HurdModRawLibc.posixSpawnattrDestroy(attr?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    HurdModRawLibc.posixSpawnattrGetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    HurdModRawLibc.posixSpawnattrSetsigdefault(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    HurdModRawLibc.posixSpawnattrGetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT?, default: CUlong?): CInt =
    HurdModRawLibc.posixSpawnattrSetsigmask(attr?.toLong() ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT?, flags: CShort?): CInt =
    HurdModRawLibc.posixSpawnattrGetflags(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT?, flags: CShort): CInt =
    HurdModRawLibc.posixSpawnattrSetflags(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    HurdModRawLibc.posixSpawnattrGetpgroup(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT?, flags: io.github.kotlinmania.libc.PidT): CInt =
    HurdModRawLibc.posixSpawnattrSetpgroup(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetschedpolicy(attr: PosixSpawnattrT?, flags: CInt?): CInt =
    HurdModRawLibc.posixSpawnattrGetschedpolicy(attr?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedpolicy(attr: PosixSpawnattrT?, flags: CInt): CInt =
    HurdModRawLibc.posixSpawnattrSetschedpolicy(attr?.toLong() ?: 0L, flags)

public actual fun posixSpawnattrGetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    HurdModRawLibc.posixSpawnattrGetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedparam(attr: PosixSpawnattrT?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    HurdModRawLibc.posixSpawnattrSetschedparam(attr?.toLong() ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsInit(actions: PosixSpawnFileActionsT?): CInt =
    HurdModRawLibc.posixSpawnFileActionsInit(actions?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsDestroy(actions: PosixSpawnFileActionsT?): CInt =
    HurdModRawLibc.posixSpawnFileActionsDestroy(actions?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    HurdModRawLibc.posixSpawnFileActionsAddopen(actions?.toLong() ?: 0L, fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: PosixSpawnFileActionsT?, fd: CInt): CInt =
    HurdModRawLibc.posixSpawnFileActionsAddclose(actions?.toLong() ?: 0L, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: PosixSpawnFileActionsT?, fd: CInt, newfd: CInt): CInt =
    HurdModRawLibc.posixSpawnFileActionsAdddup2(actions?.toLong() ?: 0L, fd, newfd)

public actual fun posixSpawnFileActionsAddchdirNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, path: String?): CInt =
    HurdModRawLibc.posixSpawnFileActionsAddchdirNp(actions?.toLong() ?: 0L, path)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, fd: CInt): CInt =
    HurdModRawLibc.posixSpawnFileActionsAddfchdirNp(actions?.toLong() ?: 0L, fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, from: CInt): CInt =
    HurdModRawLibc.posixSpawnFileActionsAddclosefromNp(actions?.toLong() ?: 0L, from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: io.github.kotlinmania.libc.PosixSpawnFileActionsT?, tcfd: CInt): CInt =
    HurdModRawLibc.posixSpawnFileActionsAddtcsetpgrpNp(actions?.toLong() ?: 0L, tcfd)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    HurdModRawLibc.shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    HurdModRawLibc.shmUnlink(name)

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    HurdModRawLibc.euidaccess(pathname, mode)

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    HurdModRawLibc.eaccess(pathname, mode)

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    HurdModRawLibc.faccessat(dirfd, pathname, mode, flags)

public actual fun stat(file: String?, buf: Stat?): CInt =
    HurdModRawLibc.stat(file, buf?.toLong() ?: 0L)

public actual fun stat64(file: String?, buf: Stat64?): CInt =
    HurdModRawLibc.stat64(file, buf?.toLong() ?: 0L)

public actual fun readdir(dirp: DIR?): io.github.kotlinmania.libc.Dirent? =
    HurdModRawLibc.readdir(dirp?.toLong() ?: 0L)

public actual fun readdir64(dirp: DIR?): io.github.kotlinmania.libc.Dirent64? =
    HurdModRawLibc.readdir64(dirp?.toLong() ?: 0L)

public actual fun readdirR(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent?, result: COpaquePointer?): CInt =
    HurdModRawLibc.readdirR(dirp?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)

public actual fun readdir64R(dirp: DIR?, entry: io.github.kotlinmania.libc.Dirent64?, result: COpaquePointer?): CInt =
    HurdModRawLibc.readdir64R(dirp?.toLong() ?: 0L, entry?.toLong() ?: 0L, result?.value ?: 0L)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    HurdModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    HurdModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun dirfd(dirp: DIR?): CInt =
    HurdModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    HurdModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun errnoLocation(): CInt? =
    HurdModRawLibc.errnoLocation()

public actual fun mmap64(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): COpaquePointer? =
    HurdModRawLibc.mmap64(addr?.value ?: 0L, len, prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    HurdModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    HurdModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun sync() {
    HurdModRawLibc.sync()
}

public actual fun syncfs(fd: CInt): CInt =
    HurdModRawLibc.syncfs(fd)

public actual fun fdatasync(fd: CInt): CInt =
    HurdModRawLibc.fdatasync(fd)

public actual fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt =
    HurdModRawLibc.fallocate64(fd, mode, offset, len)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    HurdModRawLibc.posixFallocate(fd, offset, len)

public actual fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt =
    HurdModRawLibc.posixFallocate64(fd, offset, len)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt =
    HurdModRawLibc.posixFadvise(fd, offset, len, advise)

public actual fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt =
    HurdModRawLibc.posixFadvise64(fd, offset, len, advise)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    HurdModRawLibc.madvise(addr?.value ?: 0L, len, advice)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    HurdModRawLibc.posixMadvise(addr?.value ?: 0L, len, advice)

public actual fun getrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    HurdModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun getrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: io.github.kotlinmania.libc.Rlimit64?): CInt =
    HurdModRawLibc.getrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: Rlimit?): CInt =
    HurdModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit64(resource: io.github.kotlinmania.libc.RlimitResourceT, rlim: io.github.kotlinmania.libc.Rlimit64?): CInt =
    HurdModRawLibc.setrlimit64(resource, rlim?.toLong() ?: 0L)

public actual fun getpriority(which: io.github.kotlinmania.libc.PriorityWhich, who: io.github.kotlinmania.libc.IdT): CInt =
    HurdModRawLibc.getpriority(which, who)

public actual fun setpriority(which: io.github.kotlinmania.libc.PriorityWhich, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    HurdModRawLibc.setpriority(which, who, prio)

public actual fun getrandom(buffer: COpaquePointer?, length: SizeT, flags: CUint): SsizeT =
    HurdModRawLibc.getrandom(buffer?.value ?: 0L, length, flags)

public actual fun getentropy(buffer: COpaquePointer?, length: SizeT): CInt =
    HurdModRawLibc.getentropy(buffer?.value ?: 0L, length)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    HurdModRawLibc.memrchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    HurdModRawLibc.memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    HurdModRawLibc.strchrnul(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun abs(i: CInt): CInt =
    HurdModRawLibc.abs(i)

public actual fun labs(i: CLong): CLong =
    HurdModRawLibc.labs(i)

public actual fun rand(): CInt =
    HurdModRawLibc.rand()

public actual fun srand(seed: CUint) {
    HurdModRawLibc.srand(seed)
}

public actual fun drand48(): CDouble =
    HurdModRawLibc.drand48()

public actual fun erand48(xseed: CUshort?): CDouble =
    HurdModRawLibc.erand48(xseed?.toLong() ?: 0L)

public actual fun lrand48(): CLong =
    HurdModRawLibc.lrand48()

public actual fun nrand48(xseed: CUshort?): CLong =
    HurdModRawLibc.nrand48(xseed?.toLong() ?: 0L)

public actual fun mrand48(): CLong =
    HurdModRawLibc.mrand48()

public actual fun jrand48(xseed: CUshort?): CLong =
    HurdModRawLibc.jrand48(xseed?.toLong() ?: 0L)

public actual fun srand48(seed: CLong) {
    HurdModRawLibc.srand48(seed)
}

public actual fun seed48(xseed: CUshort?): CUshort? =
    HurdModRawLibc.seed48(xseed?.toLong() ?: 0L)

public actual fun lcong48(p: CUshort?) {
    HurdModRawLibc.lcong48(p?.toLong() ?: 0L)
}

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?) {
    HurdModRawLibc.qsortR(base?.value ?: 0L, num, size, compar?.toLong() ?: 0L, arg?.value ?: 0L)
}

public actual fun brk(addr: COpaquePointer?): CInt =
    HurdModRawLibc.brk(addr?.value ?: 0L)

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    HurdModRawLibc.sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    HurdModRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallopt(param: CInt, value: CInt): CInt =
    HurdModRawLibc.mallopt(param, value)

public actual fun mallinfo(): io.github.kotlinmania.libc.Mallinfo =
    HurdModRawLibc.mallinfo()

public actual fun mallinfo2(): io.github.kotlinmania.libc.Mallinfo2 =
    HurdModRawLibc.mallinfo2()

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    HurdModRawLibc.mallocInfo(options, stream?.toLong() ?: 0L)

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    HurdModRawLibc.mallocUsableSize(ptr?.value ?: 0L)

public actual fun mallocTrim(pad: SizeT): CInt =
    HurdModRawLibc.mallocTrim(pad)

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    HurdModRawLibc.iconvOpen(tocode, fromcode)

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    HurdModRawLibc.iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)

public actual fun iconvClose(cd: IconvT): CInt =
    HurdModRawLibc.iconvClose(cd)

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    HurdModRawLibc.getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    HurdModRawLibc.backtrace(buf?.value ?: 0L, sz)

public actual fun reboot(howTo: CInt): CInt =
    HurdModRawLibc.reboot(howTo)

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    HurdModRawLibc.getloadavg(loadavg?.toLong() ?: 0L, nelem)

public actual fun regexec(preg: io.github.kotlinmania.libc.RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    HurdModRawLibc.regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)

public actual fun regerror(errcode: CInt, preg: io.github.kotlinmania.libc.RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    HurdModRawLibc.regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)

public actual fun regfree(preg: io.github.kotlinmania.libc.RegexT?) {
    HurdModRawLibc.regfree(preg?.toLong() ?: 0L)
}

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    HurdModRawLibc.glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    HurdModRawLibc.globfree(pglob?.toLong() ?: 0L)
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: Glob64T?): CInt =
    HurdModRawLibc.glob64(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree64(pglob: Glob64T?) {
    HurdModRawLibc.globfree64(pglob?.toLong() ?: 0L)
}

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    HurdModRawLibc.getxattr(path, name, value?.value ?: 0L, size)

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    HurdModRawLibc.lgetxattr(path, name, value?.value ?: 0L, size)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT): SsizeT =
    HurdModRawLibc.fgetxattr(filedes, name, value?.value ?: 0L, size)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    HurdModRawLibc.setxattr(path, name, value?.value ?: 0L, size, flags)

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    HurdModRawLibc.lsetxattr(path, name, value?.value ?: 0L, size, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, flags: CInt): CInt =
    HurdModRawLibc.fsetxattr(filedes, name, value?.value ?: 0L, size, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    HurdModRawLibc.listxattr(path, list?.value ?: 0L, size)

public actual fun llistxattr(path: String?, list: COpaquePointer?, size: SizeT): SsizeT =
    HurdModRawLibc.llistxattr(path, list?.value ?: 0L, size)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT): SsizeT =
    HurdModRawLibc.flistxattr(filedes, list?.value ?: 0L, size)

public actual fun removexattr(path: String?, name: String?): CInt =
    HurdModRawLibc.removexattr(path, name)

public actual fun lremovexattr(path: String?, name: String?): CInt =
    HurdModRawLibc.lremovexattr(path, name)

public actual fun fremovexattr(filedes: CInt, name: String?): CInt =
    HurdModRawLibc.fremovexattr(filedes, name)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    HurdModRawLibc.dirname(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    HurdModRawLibc.posixBasename(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuBasename(path: String?): COpaquePointer? =
    HurdModRawLibc.gnuBasename(path).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    HurdModRawLibc.dlmopen(lmid, filename, flag).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    HurdModRawLibc.dlinfo(handle?.value ?: 0L, request, info?.value ?: 0L)

public actual fun dladdr1(addr: COpaquePointer?, info: io.github.kotlinmania.libc.DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    HurdModRawLibc.dladdr1(addr?.value ?: 0L, info?.toLong() ?: 0L, extraInfo?.value ?: 0L, flags)

public actual fun duplocale(base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    HurdModRawLibc.duplocale(base)

public actual fun freelocale(loc: io.github.kotlinmania.libc.LocaleT) {
    HurdModRawLibc.freelocale(loc)
}

public actual fun newlocale(mask: CInt, locale: String?, base: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    HurdModRawLibc.newlocale(mask, locale, base)

public actual fun uselocale(loc: io.github.kotlinmania.libc.LocaleT): io.github.kotlinmania.libc.LocaleT =
    HurdModRawLibc.uselocale(loc)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    HurdModRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: io.github.kotlinmania.libc.LocaleT): COpaquePointer? =
    HurdModRawLibc.nlLanginfoL(item, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    HurdModRawLibc.dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    HurdModRawLibc.gnuGetLibcRelease().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    HurdModRawLibc.gnuGetLibcVersion().let { if (it == 0L) null else COpaquePointer(it) }
