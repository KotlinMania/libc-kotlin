package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.COpaquePointer

internal object HaikuModRawLibc {
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit(resource: Int, rlim: Long): Int
    external fun getpriority(which: Int, who: Long): Int
    external fun setpriority(which: Int, who: Long, priority: Int): Int
    external fun endusershell()
    external fun getpass(prompt: String?): Long?
    external fun getusershell(): Long?
    external fun issetugid(): Int
    external fun setusershell()
    external fun utimensat(fd: Int, path: String?, times: Long, flag: Int): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun errnop(): Long?
    external fun abs(i: Int): Int
    external fun labs(i: Long): Long
    external fun rand(): Int
    external fun srand(seed: Int)
    external fun getifaddrs(ifap: Long): Int
    external fun freeifaddrs(ifa: Long)
    external fun ppoll(fds: Long, numfds: Long, timeout: Long, sigMask: Long): Int
    external fun getspent(): Long?
    external fun getspentR(pwd: Long, buf: Long, bufferSize: Long, res: Long): Int
    external fun setspent()
    external fun endspent()
    external fun getspnam(name: String?): Long?
    external fun getspnamR(name: String?, spwd: Long, buffer: Long, bufferSize: Long, res: Long): Int
    external fun sgetspent(line: String?): Long?
    external fun sgetspentR(line: String?, spwd: Long, buffer: Long, bufferSize: Long, res: Long): Int
    external fun fgetspent(file: Long): Long?
    external fun fgetspentR(file: Long, spwd: Long, buffer: Long, bufferSize: Long, res: Long): Int
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun semDestroy(sem: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun clockGetres(clkId: Long, tp: Long): Int
    external fun clockGettime(clkId: Long, tp: Long): Int
    external fun clockSettime(clkId: Long, tp: Long): Int
    external fun clockGetcpuclockid(pid: Int, clkId: Long): Int
    external fun pthreadCreate(thread: Long, attr: Long, f: Long, value: Long): Int
    external fun pthreadAttrGetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrSetguardsize(attr: Long, guardsize: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Long): Int
    external fun valloc(numBytes: Long): Long?
    external fun mallocUsableSize(ptr: Long): Long
    external fun memalign(align: Long, size: Long): Long?
    external fun setgroups(ngroups: Int, ptr: Long): Int
    external fun initgroups(name: String?, basegid: Int): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun dirfd(dirp: Long): Int
    external fun getnameinfo(sa: Long, salen: Long, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun pthreadMutexTimedlock(lock: Long, abstime: Long): Int
    external fun pthreadSigqueue(thread: Long, sig: Int, value: Long): Int
    external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    external fun pthreadSpinDestroy(lock: Long): Int
    external fun pthreadSpinLock(lock: Long): Int
    external fun pthreadSpinTrylock(lock: Long): Int
    external fun pthreadSpinUnlock(lock: Long): Int
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree(pglob: Long)
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun posixMadvise(addr: Long, len: Long, advice: Int): Int
    external fun posixFadvise(fd: Int, offset: Long, len: Long, advice: Int): Int
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun nlLanginfo(item: Long): Long?
    external fun bind(socket: Int, address: Long, addressLen: Long): Int
    external fun accept4(socket: Int, address: Long, addressLength: Long, flags: Int): Int
    external fun writev(fd: Int, iov: Long, count: Int): Long
    external fun readv(fd: Int, iov: Long, count: Int): Long
    external fun sendmsg(fd: Int, msg: Long, flags: Int): Long
    external fun recvmsg(fd: Int, msg: Long, flags: Int): Long
    external fun execvpe(file: String?, argv: Long, environment: Long): Int
    external fun getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getgrouplist(user: String?, basegroup: Int, grouplist: Long, groupcount: Long): Int
    external fun sigaltstack(ss: Long, oss: Long): Int
    external fun sigsuspend(mask: Long): Int
    external fun semClose(sem: Long): Int
    external fun getdtablesize(): Int
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun pthreadSigmask(how: Int, set: Long, oldset: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun pthreadKill(thread: Long, sig: Int): Int
    external fun semUnlink(name: String?): Int
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwent(): Long?
    external fun setpwent()
    external fun endpwent()
    external fun endgrent()
    external fun getgrent(): Long?
    external fun setgrent()
    external fun sigwait(set: Long, sig: Long): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun getgrgid(gid: Int): Long?
    external fun popen(command: String?, mode: String?): Long?
    external fun sethostname(name: String?, len: Long): Int
    external fun uname(buf: Long): Int
    external fun getutxent(): Long?
    external fun getutxid(ut: Long): Long?
    external fun getutxline(ut: Long): Long?
    external fun pututxline(ut: Long): Long?
    external fun setutxent()
    external fun endutxent()
    external fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int
    external fun sigtimedwait(set: Long, info: Long, timeout: Long): Int
    external fun sigwaitinfo(set: Long, info: Long): Int
    external fun getitimer(which: Int, currValue: Long): Int
    external fun setitimer(which: Int, newValue: Long, oldValue: Long): Int
    external fun regcomp(preg: Long, pattern: String?, cflags: Int): Int
    external fun regexec(preg: Long, input: String?, nmatch: Long, pmatch: Long, eflags: Int): Int
    external fun regerror(errcode: Int, preg: Long, errbuf: Long, errbufSize: Long): Long
    external fun regfree(preg: Long)
    external fun msgctl(msqid: Int, cmd: Int, buf: Long): Int
    external fun msgget(key: Long, msgflg: Int): Int
    external fun msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtype: Long, msgflg: Int): Long
    external fun msgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int
    external fun semget(key: Long, nsems: Int, semflg: Int): Int
    external fun semop(semid: Int, sops: Long, nsops: Long): Int
    external fun ftok(pathname: String?, projId: Int): Long
    external fun memrchr(cx: Long, c: Int, n: Long): Long?
    external fun lsearch(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long?
    external fun lfind(key: Long, base: Long, nelp: Long, width: Long, compar: Long): Long?
    external fun hcreate(nelt: Long): Int
    external fun hdestroy()
    external fun hsearch(entry: Long, action: Long): Long?
    external fun drand48(): Double
    external fun erand48(xseed: Long): Double
    external fun lrand48(): Long
    external fun nrand48(xseed: Long): Long
    external fun mrand48(): Long
    external fun jrand48(xseed: Long): Long
    external fun srand48(seed: Long)
    external fun seed48(xseed: Long): Long?
    external fun lcong48(p: Long)
    external fun clearenv(): Int
    external fun ctermid(s: Long): Long?
    external fun sync()
    external fun getpagesize(): Int
    external fun brk(addr: Long): Int
    external fun sbrk(increment: Long): Long?
    external fun posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnFileActionsInit(fileActions: Long): Int
    external fun posixSpawnFileActionsDestroy(fileActions: Long): Int
    external fun posixSpawnFileActionsAddopen(fileActions: Long, fildes: Int, path: String?, oflag: Int, mode: Int): Int
    external fun posixSpawnFileActionsAddclose(fileActions: Long, fildes: Int): Int
    external fun posixSpawnFileActionsAdddup2(fileActions: Long, fildes: Int, newfildes: Int): Int
    external fun posixSpawnattrInit(attr: Long): Int
    external fun posixSpawnattrDestroy(attr: Long): Int
    external fun posixSpawnattrGetflags(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetflags(attr: Long, flags: Short): Int
    external fun posixSpawnattrGetpgroup(attr: Long, pgroup: Long): Int
    external fun posixSpawnattrSetpgroup(attr: Long, pgroup: Int): Int
    external fun posixSpawnattrGetsigdefault(attr: Long, sigdefault: Long): Int
    external fun posixSpawnattrSetsigdefault(attr: Long, sigdefault: Long): Int
    external fun posixSpawnattrGetsigmask(attr: Long, sigmask: Long): Int
    external fun posixSpawnattrSetsigmask(attr: Long, sigmask: Long): Int
    external fun getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int
    external fun strcasecmpL(string1: String?, string2: String?, locale: Long): Int
    external fun strncasecmpL(string1: String?, string2: String?, length: Long, locale: Long): Int
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun memmem(source: Long, sourceLength: Long, search: Long, searchLength: Long): Long?
    external fun pthreadGetattrNp(thread: Long, attr: Long): Int
    external fun pthreadGetnameNp(thread: Long, buffer: Long, length: Long): Int
    external fun pthreadSetnameNp(thread: Long, name: String?): Int
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    HaikuModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    HaikuModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun getpriority(which: CInt, who: IdT): CInt =
    HaikuModRawLibc.getpriority(which, who)

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    HaikuModRawLibc.setpriority(which, who, priority)

public actual fun endusershell() {
    HaikuModRawLibc.endusershell()
}

public actual fun getpass(prompt: String?): COpaquePointer? =
    HaikuModRawLibc.getpass(prompt).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getusershell(): COpaquePointer? =
    HaikuModRawLibc.getusershell().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun issetugid(): CInt =
    HaikuModRawLibc.issetugid()

public actual fun setusershell() {
    HaikuModRawLibc.setusershell()
}

public actual fun utimensat(fd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    HaikuModRawLibc.utimensat(fd, path, times?.toLong() ?: 0L, flag)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    HaikuModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    HaikuModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun errnop(): CInt? =
    HaikuModRawLibc.errnop()

public actual fun abs(i: CInt): CInt =
    HaikuModRawLibc.abs(i)

public actual fun labs(i: CLong): CLong =
    HaikuModRawLibc.labs(i)

public actual fun rand(): CInt =
    HaikuModRawLibc.rand()

public actual fun srand(seed: CUint) {
    HaikuModRawLibc.srand(seed)
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    HaikuModRawLibc.getifaddrs(ifap?.value ?: 0L)

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    HaikuModRawLibc.freeifaddrs(ifa?.toLong() ?: 0L)
}

public actual fun ppoll(fds: Pollfd?, numfds: io.github.kotlinmania.libc.NfdsT, timeout: Timespec?, sigMask: ULong?): CInt =
    HaikuModRawLibc.ppoll(fds?.toLong() ?: 0L, numfds, timeout?.toLong() ?: 0L, sigMask?.toLong() ?: 0L)

public actual fun getspent(): Spwd? =
    HaikuModRawLibc.getspent()

public actual fun getspentR(pwd: Spwd?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    HaikuModRawLibc.getspentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, bufferSize, res?.value ?: 0L)

public actual fun setspent() {
    HaikuModRawLibc.setspent()
}

public actual fun endspent() {
    HaikuModRawLibc.endspent()
}

public actual fun getspnam(name: String?): Spwd? =
    HaikuModRawLibc.getspnam(name)

public actual fun getspnamR(name: String?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    HaikuModRawLibc.getspnamR(name, spwd?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize, res?.value ?: 0L)

public actual fun sgetspent(line: String?): Spwd? =
    HaikuModRawLibc.sgetspent(line)

public actual fun sgetspentR(line: String?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    HaikuModRawLibc.sgetspentR(line, spwd?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize, res?.value ?: 0L)

public actual fun fgetspent(file: FILE?): Spwd? =
    HaikuModRawLibc.fgetspent(file?.toLong() ?: 0L)

public actual fun fgetspentR(file: FILE?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    HaikuModRawLibc.fgetspentR(file?.toLong() ?: 0L, spwd?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize, res?.value ?: 0L)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    HaikuModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    HaikuModRawLibc.mknodat(dirfd, pathname, mode, dev)

public actual fun semDestroy(sem: SemT?): CInt =
    HaikuModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    HaikuModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    HaikuModRawLibc.clockGetres(clkId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    HaikuModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    HaikuModRawLibc.clockSettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockGetcpuclockid(pid: PidT, clkId: Int?): CInt =
    HaikuModRawLibc.clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)

public actual fun pthreadCreate(thread: UintptrT?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    HaikuModRawLibc.pthreadCreate(thread?.toLong() ?: 0L, attr?.value ?: 0L, f, value?.value ?: 0L)

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    HaikuModRawLibc.pthreadAttrGetguardsize(attr?.value ?: 0L, guardsize?.toLong() ?: 0L)

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    HaikuModRawLibc.pthreadAttrSetguardsize(attr?.value ?: 0L, guardsize)

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    HaikuModRawLibc.pthreadAttrGetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadCondattrGetclock(attr: UintptrT?, clockId: Int?): CInt =
    HaikuModRawLibc.pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: UintptrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    HaikuModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun valloc(numBytes: SizeT): COpaquePointer? =
    HaikuModRawLibc.valloc(numBytes).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    HaikuModRawLibc.mallocUsableSize(ptr?.value ?: 0L)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    HaikuModRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    HaikuModRawLibc.setgroups(ngroups, ptr?.toLong() ?: 0L)

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    HaikuModRawLibc.initgroups(name, basegid)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    HaikuModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun dirfd(dirp: DIR?): CInt =
    HaikuModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    HaikuModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    HaikuModRawLibc.pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadSigqueue(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt, value: Sigval): CInt =
    HaikuModRawLibc.pthreadSigqueue(thread, sig, value)

public actual fun pthreadSpinInit(lock: io.github.kotlinmania.libc.PthreadSpinlockT?, pshared: CInt): CInt =
    HaikuModRawLibc.pthreadSpinInit(lock?.toLong() ?: 0L, pshared)

public actual fun pthreadSpinDestroy(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    HaikuModRawLibc.pthreadSpinDestroy(lock?.toLong() ?: 0L)

public actual fun pthreadSpinLock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    HaikuModRawLibc.pthreadSpinLock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinTrylock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    HaikuModRawLibc.pthreadSpinTrylock(lock?.toLong() ?: 0L)

public actual fun pthreadSpinUnlock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    HaikuModRawLibc.pthreadSpinUnlock(lock?.toLong() ?: 0L)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    HaikuModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    HaikuModRawLibc.glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    HaikuModRawLibc.globfree(pglob?.toLong() ?: 0L)
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    HaikuModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    HaikuModRawLibc.posixMadvise(addr?.value ?: 0L, len, advice)

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    HaikuModRawLibc.posixFadvise(fd, offset, len, advice)

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    HaikuModRawLibc.posixFallocate(fd, offset, len)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    HaikuModRawLibc.shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    HaikuModRawLibc.shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    HaikuModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    HaikuModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    HaikuModRawLibc.madvise(addr?.value ?: 0L, len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    HaikuModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    HaikuModRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    HaikuModRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    HaikuModRawLibc.bind(socket, address?.toLong() ?: 0L, addressLen)

public actual fun accept4(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLength: UInt?, flags: CInt): CInt =
    HaikuModRawLibc.accept4(socket, address?.toLong() ?: 0L, addressLength?.toLong() ?: 0L, flags)

public actual fun writev(fd: CInt, iov: Iovec?, count: CInt): SsizeT =
    HaikuModRawLibc.writev(fd, iov?.toLong() ?: 0L, count)

public actual fun readv(fd: CInt, iov: Iovec?, count: CInt): SsizeT =
    HaikuModRawLibc.readv(fd, iov?.toLong() ?: 0L, count)

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    HaikuModRawLibc.sendmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    HaikuModRawLibc.recvmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    HaikuModRawLibc.execvpe(file, argv?.value ?: 0L, environment?.value ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HaikuModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getgrouplist(user: String?, basegroup: GidT, grouplist: GidT?, groupcount: CInt?): CInt =
    HaikuModRawLibc.getgrouplist(user, basegroup, grouplist?.toLong() ?: 0L, groupcount?.toLong() ?: 0L)

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    HaikuModRawLibc.sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)

public actual fun sigsuspend(mask: ULong?): CInt =
    HaikuModRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun semClose(sem: SemT?): CInt =
    HaikuModRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun getdtablesize(): CInt =
    HaikuModRawLibc.getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HaikuModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun pthreadSigmask(how: CInt, set: ULong?, oldset: ULong?): CInt =
    HaikuModRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun getgrnam(name: String?): Group? =
    HaikuModRawLibc.getgrnam(name)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    HaikuModRawLibc.pthreadKill(thread, sig)

public actual fun semUnlink(name: String?): CInt =
    HaikuModRawLibc.semUnlink(name)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HaikuModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    HaikuModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwent(): Passwd? =
    HaikuModRawLibc.getpwent()

public actual fun setpwent() {
    HaikuModRawLibc.setpwent()
}

public actual fun endpwent() {
    HaikuModRawLibc.endpwent()
}

public actual fun endgrent() {
    HaikuModRawLibc.endgrent()
}

public actual fun getgrent(): Group? =
    HaikuModRawLibc.getgrent()

public actual fun setgrent() {
    HaikuModRawLibc.setgrent()
}

public actual fun sigwait(set: ULong?, sig: CInt?): CInt =
    HaikuModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    HaikuModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun getgrgid(gid: GidT): Group? =
    HaikuModRawLibc.getgrgid(gid)

public actual fun popen(command: String?, mode: String?): FILE? =
    HaikuModRawLibc.popen(command, mode)

public actual fun sethostname(name: String?, len: SizeT): CInt =
    HaikuModRawLibc.sethostname(name, len)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    HaikuModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun getutxent(): Utmpx? =
    HaikuModRawLibc.getutxent()

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    HaikuModRawLibc.getutxid(ut?.toLong() ?: 0L)

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    HaikuModRawLibc.getutxline(ut?.toLong() ?: 0L)

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    HaikuModRawLibc.pututxline(ut?.toLong() ?: 0L)

public actual fun setutxent() {
    HaikuModRawLibc.setutxent()
}

public actual fun endutxent() {
    HaikuModRawLibc.endutxent()
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    HaikuModRawLibc.faccessat(dirfd, pathname, mode, flags)

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): CInt =
    HaikuModRawLibc.sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun sigwaitinfo(set: ULong?, info: SiginfoT?): CInt =
    HaikuModRawLibc.sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    HaikuModRawLibc.getitimer(which, currValue?.toLong() ?: 0L)

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    HaikuModRawLibc.setitimer(which, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    HaikuModRawLibc.regcomp(preg?.toLong() ?: 0L, pattern, cflags)

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    HaikuModRawLibc.regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    HaikuModRawLibc.regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)

public actual fun regfree(preg: RegexT?) {
    HaikuModRawLibc.regfree(preg?.toLong() ?: 0L)
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    HaikuModRawLibc.msgctl(msqid, cmd, buf?.toLong() ?: 0L)

public actual fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt =
    HaikuModRawLibc.msgget(key, msgflg)

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    HaikuModRawLibc.msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtype, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    HaikuModRawLibc.msgsnd(msqid, msgp?.value ?: 0L, msgsz, msgflg)

public actual fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflg: CInt): CInt =
    HaikuModRawLibc.semget(key, nsems, semflg)

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    HaikuModRawLibc.semop(semid, sops?.toLong() ?: 0L, nsops)

public actual fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT =
    HaikuModRawLibc.ftok(pathname, projId)

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    HaikuModRawLibc.memrchr(cx?.value ?: 0L, c, n).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    HaikuModRawLibc.lsearch(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    HaikuModRawLibc.lfind(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcreate(nelt: SizeT): CInt =
    HaikuModRawLibc.hcreate(nelt)

public actual fun hdestroy() {
    HaikuModRawLibc.hdestroy()
}

public actual fun hsearch(entry: io.github.kotlinmania.libc.Entry, action: io.github.kotlinmania.libc.Action): Entry? =
    HaikuModRawLibc.hsearch(entry, action)

public actual fun drand48(): CDouble =
    HaikuModRawLibc.drand48()

public actual fun erand48(xseed: CUshort?): CDouble =
    HaikuModRawLibc.erand48(xseed?.toLong() ?: 0L)

public actual fun lrand48(): CLong =
    HaikuModRawLibc.lrand48()

public actual fun nrand48(xseed: CUshort?): CLong =
    HaikuModRawLibc.nrand48(xseed?.toLong() ?: 0L)

public actual fun mrand48(): CLong =
    HaikuModRawLibc.mrand48()

public actual fun jrand48(xseed: CUshort?): CLong =
    HaikuModRawLibc.jrand48(xseed?.toLong() ?: 0L)

public actual fun srand48(seed: CLong) {
    HaikuModRawLibc.srand48(seed)
}

public actual fun seed48(xseed: CUshort?): CUshort? =
    HaikuModRawLibc.seed48(xseed?.toLong() ?: 0L)

public actual fun lcong48(p: CUshort?) {
    HaikuModRawLibc.lcong48(p?.toLong() ?: 0L)
}

public actual fun clearenv(): CInt =
    HaikuModRawLibc.clearenv()

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    HaikuModRawLibc.ctermid(s?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sync() {
    HaikuModRawLibc.sync()
}

public actual fun getpagesize(): CInt =
    HaikuModRawLibc.getpagesize()

public actual fun brk(addr: COpaquePointer?): CInt =
    HaikuModRawLibc.brk(addr?.value ?: 0L)

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    HaikuModRawLibc.sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    HaikuModRawLibc.posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    HaikuModRawLibc.posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    HaikuModRawLibc.posixSpawnFileActionsInit(fileActions?.value ?: 0L)

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    HaikuModRawLibc.posixSpawnFileActionsDestroy(fileActions?.value ?: 0L)

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    HaikuModRawLibc.posixSpawnFileActionsAddopen(fileActions?.value ?: 0L, fildes, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    HaikuModRawLibc.posixSpawnFileActionsAddclose(fileActions?.value ?: 0L, fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    HaikuModRawLibc.posixSpawnFileActionsAdddup2(fileActions?.value ?: 0L, fildes, newfildes)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    HaikuModRawLibc.posixSpawnattrInit(attr?.value ?: 0L)

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    HaikuModRawLibc.posixSpawnattrDestroy(attr?.value ?: 0L)

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    HaikuModRawLibc.posixSpawnattrGetflags(attr?.value ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    HaikuModRawLibc.posixSpawnattrSetflags(attr?.value ?: 0L, flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: PidT?): CInt =
    HaikuModRawLibc.posixSpawnattrGetpgroup(attr?.value ?: 0L, pgroup?.toLong() ?: 0L)

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    HaikuModRawLibc.posixSpawnattrSetpgroup(attr?.value ?: 0L, pgroup)

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: ULong?): CInt =
    HaikuModRawLibc.posixSpawnattrGetsigdefault(attr?.value ?: 0L, sigdefault?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: ULong?): CInt =
    HaikuModRawLibc.posixSpawnattrSetsigdefault(attr?.value ?: 0L, sigdefault?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: ULong?): CInt =
    HaikuModRawLibc.posixSpawnattrGetsigmask(attr?.value ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: ULong?): CInt =
    HaikuModRawLibc.posixSpawnattrSetsigmask(attr?.value ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    HaikuModRawLibc.getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    HaikuModRawLibc.strcasecmpL(string1, string2, locale)

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    HaikuModRawLibc.strncasecmpL(string1, string2, length, locale)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    HaikuModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer? =
    HaikuModRawLibc.memmem(source?.value ?: 0L, sourceLength, search?.value ?: 0L, searchLength).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadGetattrNp(thread: io.github.kotlinmania.libc.PthreadT, attr: COpaquePointer?): CInt =
    HaikuModRawLibc.pthreadGetattrNp(thread, attr?.value ?: 0L)

public actual fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    HaikuModRawLibc.pthreadGetnameNp(thread, buffer?.value ?: 0L, length)

public actual fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    HaikuModRawLibc.pthreadSetnameNp(thread, name)
