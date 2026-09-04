// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public actual fun cMSGFIRSTHDR(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on JVM — no C library access")

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on JVM — no C library access")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on JVM — no C library access")

public actual fun fDCLR(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDCLR not available on JVM — no C library access")
}

public actual fun fDISSET(fd: CInt, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on JVM — no C library access")

public actual fun fDSET(fd: CInt, set: FdSet?) {
    throw UnsupportedOperationException("fDSET not available on JVM — no C library access")
}

public actual fun fDZERO(set: FdSet?) {
    throw UnsupportedOperationException("fDZERO not available on JVM — no C library access")
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit not available on JVM — no C library access")

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit not available on JVM — no C library access")

public actual fun getpriority(which: CInt, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority not available on JVM — no C library access")

public actual fun setpriority(which: CInt, who: IdT, priority: CInt): CInt =
    throw UnsupportedOperationException("setpriority not available on JVM — no C library access")

public actual fun endusershell() {
    throw UnsupportedOperationException("endusershell not available on JVM — no C library access")
}

public actual fun getpass(prompt: String?): String? =
    throw UnsupportedOperationException("getpass not available on JVM — no C library access")

public actual fun getusershell(): String? =
    throw UnsupportedOperationException("getusershell not available on JVM — no C library access")

public actual fun issetugid(): CInt =
    throw UnsupportedOperationException("issetugid not available on JVM — no C library access")

public actual fun setusershell() {
    throw UnsupportedOperationException("setusershell not available on JVM — no C library access")
}

public actual fun utimensat(fd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    throw UnsupportedOperationException("utimensat not available on JVM — no C library access")

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    throw UnsupportedOperationException("futimens not available on JVM — no C library access")

public actual fun strerrorR(errnum: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("strerrorR not available on JVM — no C library access")

public actual fun errnop(): CInt? =
    throw UnsupportedOperationException("errnop not available on JVM — no C library access")

public actual fun abs(i: CInt): CInt =
    throw UnsupportedOperationException("abs not available on JVM — no C library access")

public actual fun labs(i: CLong): CLong =
    throw UnsupportedOperationException("labs not available on JVM — no C library access")

public actual fun rand(): CInt =
    throw UnsupportedOperationException("rand not available on JVM — no C library access")

public actual fun srand(seed: CUInt) {
    throw UnsupportedOperationException("srand not available on JVM — no C library access")
}

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getifaddrs not available on JVM — no C library access")

public actual fun freeifaddrs(ifa: Ifaddrs?) {
    throw UnsupportedOperationException("freeifaddrs not available on JVM — no C library access")
}

public actual fun ppoll(fds: Pollfd?, numfds: NfdsT, timeout: Timespec?, sigMask: SigsetT?): CInt =
    throw UnsupportedOperationException("ppoll not available on JVM — no C library access")

public actual fun getspent(): Spwd? =
    throw UnsupportedOperationException("getspent not available on JVM — no C library access")

public actual fun getspentR(pwd: Spwd?, buf: String?, bufferSize: ULong, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspentR not available on JVM — no C library access")

public actual fun setspent() {
    throw UnsupportedOperationException("setspent not available on JVM — no C library access")
}

public actual fun endspent() {
    throw UnsupportedOperationException("endspent not available on JVM — no C library access")
}

public actual fun getspnam(name: String?): Spwd? =
    throw UnsupportedOperationException("getspnam not available on JVM — no C library access")

public actual fun getspnamR(name: String?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspnamR not available on JVM — no C library access")

public actual fun sgetspent(line: String?): Spwd? =
    throw UnsupportedOperationException("sgetspent not available on JVM — no C library access")

public actual fun sgetspentR(line: String?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sgetspentR not available on JVM — no C library access")

public actual fun fgetspent(file: FILE?): Spwd? =
    throw UnsupportedOperationException("fgetspent not available on JVM — no C library access")

public actual fun fgetspentR(file: FILE?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetspentR not available on JVM — no C library access")

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    throw UnsupportedOperationException("mkfifoat not available on JVM — no C library access")

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    throw UnsupportedOperationException("mknodat not available on JVM — no C library access")

public actual fun semDestroy(sem: SemT?): CInt =
    throw UnsupportedOperationException("semDestroy not available on JVM — no C library access")

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUInt): CInt =
    throw UnsupportedOperationException("semInit not available on JVM — no C library access")

public actual fun clockGetres(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGetres not available on JVM — no C library access")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockGettime not available on JVM — no C library access")

public actual fun clockSettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("clockSettime not available on JVM — no C library access")

public actual fun clockGetcpuclockid(pid: PidT, clkId: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid not available on JVM — no C library access")

public actual fun pthreadAttrGetguardsize(attr: PthreadAttrT, guardsize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrSetguardsize(attr: PthreadAttrT, guardsize: ULong): CInt =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: PthreadAttrT, stackaddr: COpaquePointer?, stacksize: ULong?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: ClockidT?): CInt =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on JVM — no C library access")

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: ClockidT): CInt =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on JVM — no C library access")

public actual fun valloc(numBytes: ULong): COpaquePointer? =
    throw UnsupportedOperationException("valloc not available on JVM — no C library access")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize not available on JVM — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on JVM — no C library access")

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    throw UnsupportedOperationException("setgroups not available on JVM — no C library access")

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    throw UnsupportedOperationException("initgroups not available on JVM — no C library access")

public actual fun ioctl(fd: CInt, request: CULong, vararg args: Any?): CInt =
    throw UnsupportedOperationException("ioctl not available on JVM — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: CInt): CInt =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun dirfd(dirp: DIR?): CInt =
    throw UnsupportedOperationException("dirfd not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: String?, hostlen: SocklenT, serv: String?, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("getnameinfo not available on JVM — no C library access")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on JVM — no C library access")


public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit not available on JVM — no C library access")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on JVM — no C library access")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinLock not available on JVM — no C library access")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on JVM — no C library access")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on JVM — no C library access")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid not available on JVM — no C library access")

public actual fun globfree(pglob: GlobT?) {
    throw UnsupportedOperationException("globfree not available on JVM — no C library access")
}

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("posixMadvise not available on JVM — no C library access")

public actual fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt =
    throw UnsupportedOperationException("posixFadvise not available on JVM — no C library access")

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    throw UnsupportedOperationException("posixFallocate not available on JVM — no C library access")

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmOpen not available on JVM — no C library access")

public actual fun shmUnlink(name: String?): CInt =
    throw UnsupportedOperationException("shmUnlink not available on JVM — no C library access")

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    throw UnsupportedOperationException("seekdir not available on JVM — no C library access")
}

public actual fun telldir(dirp: DIR?): CLong =
    throw UnsupportedOperationException("telldir not available on JVM — no C library access")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: CInt): CInt =
    throw UnsupportedOperationException("madvise not available on JVM — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: CInt): CInt =
    throw UnsupportedOperationException("msync not available on JVM — no C library access")

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: ULong, flags: CInt, addr: Sockaddr?, addrlen: SocklenT?): SsizeT =
    throw UnsupportedOperationException("recvfrom not available on JVM — no C library access")

public actual fun nlLanginfo(item: NlItem): String? =
    throw UnsupportedOperationException("nlLanginfo not available on JVM — no C library access")

public actual fun bind(socket: CInt, address: Sockaddr?, addressLen: SocklenT): CInt =
    throw UnsupportedOperationException("bind not available on JVM — no C library access")

public actual fun accept4(socket: CInt, address: Sockaddr?, addressLength: SocklenT?, flags: CInt): CInt =
    throw UnsupportedOperationException("accept4 not available on JVM — no C library access")

public actual fun writev(fd: CInt, iov: Iovec?, count: CInt): SsizeT =
    throw UnsupportedOperationException("writev not available on JVM — no C library access")

public actual fun readv(fd: CInt, iov: Iovec?, count: CInt): SsizeT =
    throw UnsupportedOperationException("readv not available on JVM — no C library access")

public actual fun sendmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmsg not available on JVM — no C library access")

public actual fun recvmsg(fd: CInt, msg: Msghdr?, flags: CInt): SsizeT =
    throw UnsupportedOperationException("recvmsg not available on JVM — no C library access")

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe not available on JVM — no C library access")

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrgidR not available on JVM — no C library access")

public actual fun getgrouplist(user: String?, basegroup: GidT, grouplist: GidT?, groupcount: CInt?): CInt =
    throw UnsupportedOperationException("getgrouplist not available on JVM — no C library access")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    throw UnsupportedOperationException("sigaltstack not available on JVM — no C library access")

public actual fun sigsuspend(mask: SigsetT?): CInt =
    throw UnsupportedOperationException("sigsuspend not available on JVM — no C library access")

public actual fun semClose(sem: SemT?): CInt =
    throw UnsupportedOperationException("semClose not available on JVM — no C library access")

public actual fun getdtablesize(): CInt =
    throw UnsupportedOperationException("getdtablesize not available on JVM — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrnamR not available on JVM — no C library access")

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    throw UnsupportedOperationException("pthreadSigmask not available on JVM — no C library access")

public actual fun semOpen(name: String?, oflag: CInt, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on JVM — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on JVM — no C library access")

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    throw UnsupportedOperationException("pthreadKill not available on JVM — no C library access")

public actual fun semUnlink(name: String?): CInt =
    throw UnsupportedOperationException("semUnlink not available on JVM — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwnamR not available on JVM — no C library access")

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwuidR not available on JVM — no C library access")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on JVM — no C library access")

public actual fun setpwent() {
    throw UnsupportedOperationException("setpwent not available on JVM — no C library access")
}

public actual fun endpwent() {
    throw UnsupportedOperationException("endpwent not available on JVM — no C library access")
}

public actual fun endgrent() {
    throw UnsupportedOperationException("endgrent not available on JVM — no C library access")
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on JVM — no C library access")

public actual fun setgrent() {
    throw UnsupportedOperationException("setgrent not available on JVM — no C library access")
}

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    throw UnsupportedOperationException("sigwait not available on JVM — no C library access")

public actual fun getgrgid(gid: GidT): Group? =
    throw UnsupportedOperationException("getgrgid not available on JVM — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on JVM — no C library access")

public actual fun sethostname(name: String?, len: ULong): CInt =
    throw UnsupportedOperationException("sethostname not available on JVM — no C library access")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on JVM — no C library access")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on JVM — no C library access")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on JVM — no C library access")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on JVM — no C library access")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on JVM — no C library access")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent not available on JVM — no C library access")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent not available on JVM — no C library access")
}

public actual fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("faccessat not available on JVM — no C library access")

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("sigtimedwait not available on JVM — no C library access")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): CInt =
    throw UnsupportedOperationException("sigwaitinfo not available on JVM — no C library access")

public actual fun getitimer(which: CInt, currValue: Itimerval?): CInt =
    throw UnsupportedOperationException("getitimer not available on JVM — no C library access")

public actual fun setitimer(which: CInt, newValue: Itimerval?, oldValue: Itimerval?): CInt =
    throw UnsupportedOperationException("setitimer not available on JVM — no C library access")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: CInt): CInt =
    throw UnsupportedOperationException("regcomp not available on JVM — no C library access")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: CInt): CInt =
    throw UnsupportedOperationException("regexec not available on JVM — no C library access")

public actual fun regerror(errcode: CInt, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on JVM — no C library access")

public actual fun regfree(preg: RegexT?) {
    throw UnsupportedOperationException("regfree not available on JVM — no C library access")
}

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl not available on JVM — no C library access")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget not available on JVM — no C library access")

public actual fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgtype: CLong, msgflg: CInt): SsizeT =
    throw UnsupportedOperationException("msgrcv not available on JVM — no C library access")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd not available on JVM — no C library access")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    throw UnsupportedOperationException("semget not available on JVM — no C library access")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl not available on JVM — no C library access")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop not available on JVM — no C library access")

public actual fun memrchr(cx: COpaquePointer?, c: CInt, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on JVM — no C library access")

public actual fun hcreate(nelt: ULong): CInt =
    throw UnsupportedOperationException("hcreate not available on JVM — no C library access")

public actual fun hdestroy() {
    throw UnsupportedOperationException("hdestroy not available on JVM — no C library access")
}

public actual fun hsearch(entry: ENTRY, action: ACTION): ENTRY? =
    throw UnsupportedOperationException("hsearch not available on JVM — no C library access")

public actual fun lrand48(): CLong =
    throw UnsupportedOperationException("lrand48 not available on JVM — no C library access")

public actual fun nrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("nrand48 not available on JVM — no C library access")

public actual fun mrand48(): CLong =
    throw UnsupportedOperationException("mrand48 not available on JVM — no C library access")

public actual fun jrand48(xseed: CUShort?): CLong =
    throw UnsupportedOperationException("jrand48 not available on JVM — no C library access")

public actual fun srand48(seed: CLong) {
    throw UnsupportedOperationException("srand48 not available on JVM — no C library access")
}

public actual fun seed48(xseed: CUShort?): CUShort? =
    throw UnsupportedOperationException("seed48 not available on JVM — no C library access")

public actual fun lcong48(p: CUShort?) {
    throw UnsupportedOperationException("lcong48 not available on JVM — no C library access")
}

public actual fun clearenv(): CInt =
    throw UnsupportedOperationException("clearenv not available on JVM — no C library access")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid not available on JVM — no C library access")

public actual fun sync() {
    throw UnsupportedOperationException("sync not available on JVM — no C library access")
}

public actual fun getpagesize(): CInt =
    throw UnsupportedOperationException("getpagesize not available on JVM — no C library access")

public actual fun brk(addr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("brk not available on JVM — no C library access")

public actual fun sbrk(increment: IntptrT): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on JVM — no C library access")

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawn not available on JVM — no C library access")

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: PosixSpawnFileActionsT, attrp: PosixSpawnattrT, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("posixSpawnp not available on JVM — no C library access")

public actual fun posixSpawnFileActionsInit(fileActions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on JVM — no C library access")

public actual fun posixSpawnFileActionsDestroy(fileActions: PosixSpawnFileActionsT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAddopen(fileActions: PosixSpawnFileActionsT, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAddclose(fileActions: PosixSpawnFileActionsT, fildes: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAdddup2(fileActions: PosixSpawnFileActionsT, fildes: CInt, newfildes: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on JVM — no C library access")

public actual fun posixSpawnattrInit(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrInit not available on JVM — no C library access")

public actual fun posixSpawnattrDestroy(attr: PosixSpawnattrT): CInt =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on JVM — no C library access")

public actual fun posixSpawnattrGetflags(attr: PosixSpawnattrT, flags: CShort?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on JVM — no C library access")

public actual fun posixSpawnattrSetflags(attr: PosixSpawnattrT, flags: CShort): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on JVM — no C library access")

public actual fun posixSpawnattrGetpgroup(attr: PosixSpawnattrT, pgroup: PidT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on JVM — no C library access")

public actual fun posixSpawnattrSetpgroup(attr: PosixSpawnattrT, pgroup: PidT): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on JVM — no C library access")

public actual fun posixSpawnattrGetsigdefault(attr: PosixSpawnattrT, sigdefault: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on JVM — no C library access")

public actual fun posixSpawnattrSetsigdefault(attr: PosixSpawnattrT, sigdefault: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on JVM — no C library access")

public actual fun posixSpawnattrGetsigmask(attr: PosixSpawnattrT, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on JVM — no C library access")

public actual fun posixSpawnattrSetsigmask(attr: PosixSpawnattrT, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on JVM — no C library access")

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    throw UnsupportedOperationException("getoptLong not available on JVM — no C library access")

public actual fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt =
    throw UnsupportedOperationException("strcasecmpL not available on JVM — no C library access")

public actual fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: LocaleT): CInt =
    throw UnsupportedOperationException("strncasecmpL not available on JVM — no C library access")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy not available on JVM — no C library access")

public actual fun memmem(source: COpaquePointer?, sourceLength: ULong, search: COpaquePointer?, searchLength: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on JVM — no C library access")

public actual fun pthreadGetattrNp(thread: PthreadT, attr: PthreadAttrT): CInt =
    throw UnsupportedOperationException("pthreadGetattrNp not available on JVM — no C library access")

public actual fun pthreadGetnameNp(thread: PthreadT, buffer: String?, length: ULong): CInt =
    throw UnsupportedOperationException("pthreadGetnameNp not available on JVM — no C library access")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    throw UnsupportedOperationException("pthreadSetnameNp not available on JVM — no C library access")

