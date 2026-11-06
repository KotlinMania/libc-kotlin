package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.COpaquePointer

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setrlimit(resource, rlim?.toLong() ?: 0L)") as CInt

public actual fun getpriority(which: CInt, who: IdT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpriority(which, who)") as CInt

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').setpriority(which, who, priority)") as CInt

public actual fun endusershell() {
    js("require('@kotlinmania/libc-native-bindings').endusershell()")
}

public actual fun getpass(prompt: String?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getpass(prompt)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getusershell(): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').getusershell()") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun issetugid(): CInt =
    js("require('@kotlinmania/libc-native-bindings').issetugid()") as CInt

public actual fun setusershell() {
    js("require('@kotlinmania/libc-native-bindings').setusershell()")
}

public actual fun utimensat(fd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').utimensat(fd, path, times?.toLong() ?: 0L, flag)") as CInt

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').futimens(fd, times?.toLong() ?: 0L)") as CInt

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strerrorR(errnum, buf?.value ?: 0L, buflen)") as CInt

public actual fun errnop(): CInt? =
    js("require('@kotlinmania/libc-native-bindings').errnop()") as CInt?

public actual fun abs(i: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').abs(i)") as CInt

public actual fun labs(i: CLong): CLong =
    js("require('@kotlinmania/libc-native-bindings').labs(i)") as CLong

public actual fun rand(): CInt =
    js("require('@kotlinmania/libc-native-bindings').rand()") as CInt

public actual fun srand(seed: CUint) {
    js("require('@kotlinmania/libc-native-bindings').srand(seed)")
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getifaddrs(ifap?.value ?: 0L)") as CInt

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    js("require('@kotlinmania/libc-native-bindings').freeifaddrs(ifa?.toLong() ?: 0L)")
}

public actual fun ppoll(fds: Pollfd?, numfds: io.github.kotlinmania.libc.NfdsT, timeout: Timespec?, sigMask: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').ppoll(fds?.toLong() ?: 0L, numfds, timeout?.toLong() ?: 0L, sigMask?.toLong() ?: 0L)") as CInt

public actual fun getspent(): Spwd? =
    js("require('@kotlinmania/libc-native-bindings').getspent()") as Spwd?

public actual fun getspentR(pwd: Spwd?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getspentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, bufferSize, res?.value ?: 0L)") as CInt

public actual fun setspent() {
    js("require('@kotlinmania/libc-native-bindings').setspent()")
}

public actual fun endspent() {
    js("require('@kotlinmania/libc-native-bindings').endspent()")
}

public actual fun getspnam(name: String?): Spwd? =
    js("require('@kotlinmania/libc-native-bindings').getspnam(name)") as Spwd?

public actual fun getspnamR(name: String?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getspnamR(name, spwd?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize, res?.value ?: 0L)") as CInt

public actual fun sgetspent(line: String?): Spwd? =
    js("require('@kotlinmania/libc-native-bindings').sgetspent(line)") as Spwd?

public actual fun sgetspentR(line: String?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sgetspentR(line, spwd?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize, res?.value ?: 0L)") as CInt

public actual fun fgetspent(file: FILE?): Spwd? =
    js("require('@kotlinmania/libc-native-bindings').fgetspent(file?.toLong() ?: 0L)") as Spwd?

public actual fun fgetspentR(file: FILE?, spwd: Spwd?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').fgetspentR(file?.toLong() ?: 0L, spwd?.toLong() ?: 0L, buffer?.value ?: 0L, bufferSize, res?.value ?: 0L)") as CInt

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mkfifoat(dirfd, pathname, mode)") as CInt

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    js("require('@kotlinmania/libc-native-bindings').mknodat(dirfd, pathname, mode, dev)") as CInt

public actual fun semDestroy(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semDestroy(sem?.toLong() ?: 0L)") as CInt

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    js("require('@kotlinmania/libc-native-bindings').semInit(sem?.toLong() ?: 0L, pshared, value)") as CInt

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetres(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockSettime(clkId, tp?.toLong() ?: 0L)") as CInt

public actual fun clockGetcpuclockid(pid: PidT, clkId: Int?): CInt =
    js("require('@kotlinmania/libc-native-bindings').clockGetcpuclockid(pid, clkId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCreate(thread: UintptrT?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCreate(thread?.toLong() ?: 0L, attr?.value ?: 0L, f, value?.value ?: 0L)") as CInt

public actual fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetguardsize(attr?.value ?: 0L, guardsize?.toLong() ?: 0L)") as CInt

public actual fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrSetguardsize(attr?.value ?: 0L, guardsize)") as CInt

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAttrGetstack(attr?.value ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrGetclock(attr: UintptrT?, clockId: Int?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)") as CInt

public actual fun pthreadCondattrSetclock(attr: UintptrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)") as CInt

public actual fun valloc(numBytes: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').valloc(numBytes)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    js("require('@kotlinmania/libc-native-bindings').mallocUsableSize(ptr?.value ?: 0L)") as SizeT

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memalign(align, size)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setgroups(ngroups, ptr?.toLong() ?: 0L)") as CInt

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').initgroups(name, basegid)") as CInt

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').mprotect(addr?.value ?: 0L, len, prot)") as CInt

public actual fun dirfd(dirp: DIR?): CInt =
    js("require('@kotlinmania/libc-native-bindings').dirfd(dirp?.toLong() ?: 0L)") as CInt

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)") as CInt

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)") as CInt

public actual fun pthreadSigqueue(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt, value: Sigval): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigqueue(thread, sig, value)") as CInt

public actual fun pthreadSpinInit(lock: io.github.kotlinmania.libc.PthreadSpinlockT?, pshared: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinInit(lock?.toLong() ?: 0L, pshared)") as CInt

public actual fun pthreadSpinDestroy(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinDestroy(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinLock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinLock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinTrylock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinTrylock(lock?.toLong() ?: 0L)") as CInt

public actual fun pthreadSpinUnlock(lock: io.github.kotlinmania.libc.PthreadSpinlockT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSpinUnlock(lock?.toLong() ?: 0L)") as CInt

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').waitid(idtype, id, infop?.toLong() ?: 0L, options)") as CInt

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)") as CInt

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    js("require('@kotlinmania/libc-native-bindings').globfree(pglob?.toLong() ?: 0L)")
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)") as CInt

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixMadvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFadvise(fd, offset, len, advice)") as CInt

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixFallocate(fd, offset, len)") as CInt

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmOpen(name, oflag, mode)") as CInt

public actual fun shmUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').shmUnlink(name)") as CInt

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    js("require('@kotlinmania/libc-native-bindings').seekdir(dirp?.toLong() ?: 0L, loc)")
}

public actual fun telldir(dirp: DIR?): CLong =
    js("require('@kotlinmania/libc-native-bindings').telldir(dirp?.toLong() ?: 0L)") as CLong

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').madvise(addr?.value ?: 0L, len, advice)") as CInt

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msync(addr?.value ?: 0L, len, flags)") as CInt

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: UInt?): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)") as SsizeT

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').nlLanginfo(item)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    js("require('@kotlinmania/libc-native-bindings').bind(socket, address?.toLong() ?: 0L, addressLen)") as CInt

public actual fun accept4(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLength: UInt?, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').accept4(socket, address?.toLong() ?: 0L, addressLength?.toLong() ?: 0L, flags)") as CInt

public actual fun writev(fd: CInt, iov: Iovec?, count: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').writev(fd, iov?.toLong() ?: 0L, count)") as SsizeT

public actual fun readv(fd: CInt, iov: Iovec?, count: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').readv(fd, iov?.toLong() ?: 0L, count)") as SsizeT

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').sendmsg(fd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').recvmsg(fd, msg?.toLong() ?: 0L, flags)") as SsizeT

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').execvpe(file, argv?.value ?: 0L, environment?.value ?: 0L)") as CInt

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getgrouplist(user: String?, basegroup: GidT, grouplist: GidT?, groupcount: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrouplist(user, basegroup, grouplist?.toLong() ?: 0L, groupcount?.toLong() ?: 0L)") as CInt

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)") as CInt

public actual fun sigsuspend(mask: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigsuspend(mask?.toLong() ?: 0L)") as CInt

public actual fun semClose(sem: SemT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semClose(sem?.toLong() ?: 0L)") as CInt

public actual fun getdtablesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getdtablesize()") as CInt

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun pthreadSigmask(how: CInt, set: ULong?, oldset: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)") as CInt

public actual fun getgrnam(name: String?): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrnam(name)") as Group?

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadKill(thread, sig)") as CInt

public actual fun semUnlink(name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').semUnlink(name)") as CInt

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)") as CInt

public actual fun getpwent(): Passwd? =
    js("require('@kotlinmania/libc-native-bindings').getpwent()") as Passwd?

public actual fun setpwent() {
    js("require('@kotlinmania/libc-native-bindings').setpwent()")
}

public actual fun endpwent() {
    js("require('@kotlinmania/libc-native-bindings').endpwent()")
}

public actual fun endgrent() {
    js("require('@kotlinmania/libc-native-bindings').endgrent()")
}

public actual fun getgrent(): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrent()") as Group?

public actual fun setgrent() {
    js("require('@kotlinmania/libc-native-bindings').setgrent()")
}

public actual fun sigwait(set: ULong?, sig: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)") as CInt

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)") as CInt

public actual fun getgrgid(gid: GidT): Group? =
    js("require('@kotlinmania/libc-native-bindings').getgrgid(gid)") as Group?

public actual fun popen(command: String?, mode: String?): FILE? =
    js("require('@kotlinmania/libc-native-bindings').popen(command, mode)") as FILE?

public actual fun sethostname(name: String?, len: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').sethostname(name, len)") as CInt

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    js("require('@kotlinmania/libc-native-bindings').uname(buf?.toLong() ?: 0L)") as CInt

public actual fun getutxent(): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxent()") as Utmpx?

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxid(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').getutxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    js("require('@kotlinmania/libc-native-bindings').pututxline(ut?.toLong() ?: 0L)") as Utmpx?

public actual fun setutxent() {
    js("require('@kotlinmania/libc-native-bindings').setutxent()")
}

public actual fun endutxent() {
    js("require('@kotlinmania/libc-native-bindings').endutxent()")
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').faccessat(dirfd, pathname, mode, flags)") as CInt

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigtimedwait(set?.toLong() ?: 0L, info?.toLong() ?: 0L, timeout?.toLong() ?: 0L)") as CInt

public actual fun sigwaitinfo(set: ULong?, info: SiginfoT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').sigwaitinfo(set?.toLong() ?: 0L, info?.toLong() ?: 0L)") as CInt

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getitimer(which, currValue?.toLong() ?: 0L)") as CInt

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    js("require('@kotlinmania/libc-native-bindings').setitimer(which, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)") as CInt

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regcomp(preg?.toLong() ?: 0L, pattern, cflags)") as CInt

public actual fun regexec(preg: RegexT?, input: String?, nmatch: SizeT, pmatch: RegmatchT?, eflags: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').regexec(preg?.toLong() ?: 0L, input, nmatch, pmatch?.toLong() ?: 0L, eflags)") as CInt

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT =
    js("require('@kotlinmania/libc-native-bindings').regerror(errcode, preg?.toLong() ?: 0L, errbuf?.value ?: 0L, errbufSize)") as SizeT

public actual fun regfree(preg: RegexT?) {
    js("require('@kotlinmania/libc-native-bindings').regfree(preg?.toLong() ?: 0L)")
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgctl(msqid, cmd, buf?.toLong() ?: 0L)") as CInt

public actual fun msgget(key: io.github.kotlinmania.libc.KeyT, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgget(key, msgflg)") as CInt

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT =
    js("require('@kotlinmania/libc-native-bindings').msgrcv(msqid, msgp?.value ?: 0L, msgsz, msgtype, msgflg)") as SsizeT

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').msgsnd(msqid, msgp?.value ?: 0L, msgsz, msgflg)") as CInt

public actual fun semget(key: io.github.kotlinmania.libc.KeyT, nsems: CInt, semflg: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').semget(key, nsems, semflg)") as CInt

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').semop(semid, sops?.toLong() ?: 0L, nsops)") as CInt

public actual fun ftok(pathname: String?, projId: CInt): io.github.kotlinmania.libc.KeyT =
    js("require('@kotlinmania/libc-native-bindings').ftok(pathname, projId)") as io.github.kotlinmania.libc.KeyT

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memrchr(cx?.value ?: 0L, c, n)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').lsearch(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: SizeT?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').lfind(key?.value ?: 0L, base?.value ?: 0L, nelp?.toLong() ?: 0L, width, compar?.toLong() ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun hcreate(nelt: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').hcreate(nelt)") as CInt

public actual fun hdestroy() {
    js("require('@kotlinmania/libc-native-bindings').hdestroy()")
}

public actual fun hsearch(entry: io.github.kotlinmania.libc.Entry, action: io.github.kotlinmania.libc.Action): Entry? =
    js("require('@kotlinmania/libc-native-bindings').hsearch(entry, action)") as Entry?

public actual fun drand48(): CDouble =
    js("require('@kotlinmania/libc-native-bindings').drand48()") as CDouble

public actual fun erand48(xseed: CUshort?): CDouble =
    js("require('@kotlinmania/libc-native-bindings').erand48(xseed?.toLong() ?: 0L)") as CDouble

public actual fun lrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').lrand48()") as CLong

public actual fun nrand48(xseed: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').nrand48(xseed?.toLong() ?: 0L)") as CLong

public actual fun mrand48(): CLong =
    js("require('@kotlinmania/libc-native-bindings').mrand48()") as CLong

public actual fun jrand48(xseed: CUshort?): CLong =
    js("require('@kotlinmania/libc-native-bindings').jrand48(xseed?.toLong() ?: 0L)") as CLong

public actual fun srand48(seed: CLong) {
    js("require('@kotlinmania/libc-native-bindings').srand48(seed)")
}

public actual fun seed48(xseed: CUshort?): CUshort? =
    js("require('@kotlinmania/libc-native-bindings').seed48(xseed?.toLong() ?: 0L)") as CUshort?

public actual fun lcong48(p: CUshort?) {
    js("require('@kotlinmania/libc-native-bindings').lcong48(p?.toLong() ?: 0L)")
}

public actual fun clearenv(): CInt =
    js("require('@kotlinmania/libc-native-bindings').clearenv()") as CInt

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').ctermid(s?.value ?: 0L)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sync() {
    js("require('@kotlinmania/libc-native-bindings').sync()")
}

public actual fun getpagesize(): CInt =
    js("require('@kotlinmania/libc-native-bindings').getpagesize()") as CInt

public actual fun brk(addr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').brk(addr?.value ?: 0L)") as CInt

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').sbrk(increment)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsInit(fileActions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsDestroy(fileActions?.value ?: 0L)") as CInt

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddopen(fileActions?.value ?: 0L, fildes, path, oflag, mode)") as CInt

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAddclose(fileActions?.value ?: 0L, fildes)") as CInt

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnFileActionsAdddup2(fileActions?.value ?: 0L, fildes, newfildes)") as CInt

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrInit(attr?.value ?: 0L)") as CInt

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrDestroy(attr?.value ?: 0L)") as CInt

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetflags(attr?.value ?: 0L, flags?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetflags(attr?.value ?: 0L, flags)") as CInt

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: PidT?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetpgroup(attr?.value ?: 0L, pgroup?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetpgroup(attr?.value ?: 0L, pgroup)") as CInt

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigdefault(attr?.value ?: 0L, sigdefault?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigdefault(attr?.value ?: 0L, sigdefault?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrGetsigmask(attr?.value ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: ULong?): CInt =
    js("require('@kotlinmania/libc-native-bindings').posixSpawnattrSetsigmask(attr?.value ?: 0L, sigmask?.toLong() ?: 0L)") as CInt

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    js("require('@kotlinmania/libc-native-bindings').getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)") as CInt

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strcasecmpL(string1, string2, locale)") as CInt

public actual fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt =
    js("require('@kotlinmania/libc-native-bindings').strncasecmpL(string1, string2, length, locale)") as CInt

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').getentropy(buf?.value ?: 0L, buflen)") as CInt

public actual fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer? =
    js("require('@kotlinmania/libc-native-bindings').memmem(source?.value ?: 0L, sourceLength, search?.value ?: 0L, searchLength)") as Long?
    .let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadGetattrNp(thread: io.github.kotlinmania.libc.PthreadT, attr: COpaquePointer?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetattrNp(thread, attr?.value ?: 0L)") as CInt

public actual fun pthreadGetnameNp(thread: io.github.kotlinmania.libc.PthreadT, buffer: COpaquePointer?, length: SizeT): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadGetnameNp(thread, buffer?.value ?: 0L, length)") as CInt

public actual fun pthreadSetnameNp(thread: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    js("require('@kotlinmania/libc-native-bindings').pthreadSetnameNp(thread, name)") as CInt
