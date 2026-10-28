package io.github.kotlinmania.libc.unix.haiku
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval

public actual fun cmsgFirstHdr(mhdr: Msghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGFIRSTHDR not available on JVM — no C library access")

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on JVM — no C library access")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on JVM — no C library access")

public actual fun fdClear(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDCLR not available on JVM — no C library access")

public actual fun fdIsSet(fd: Int, set: FdSet?): Boolean =
    throw UnsupportedOperationException("fDISSET not available on JVM — no C library access")

public actual fun fdSet(fd: Int, set: FdSet?): Unit = throw UnsupportedOperationException("fDSET not available on JVM — no C library access")

public actual fun fdZero(set: FdSet?): Unit = throw UnsupportedOperationException("fDZERO not available on JVM — no C library access")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on JVM — no C library access")

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on JVM — no C library access")

public actual fun getpriority(which: Int, who: Int): Int =
    throw UnsupportedOperationException("getpriority not available on JVM — no C library access")

public actual fun setpriority(which: Int, who: Int, priority: Int): Int =
    throw UnsupportedOperationException("setpriority not available on JVM — no C library access")

public actual fun endusershell(): Unit = throw UnsupportedOperationException("endusershell not available on JVM — no C library access")

public actual fun getpass(prompt: String?): String? =
    throw UnsupportedOperationException("getpass not available on JVM — no C library access")

public actual fun getusershell(): String? =
    throw UnsupportedOperationException("getusershell not available on JVM — no C library access")

public actual fun issetugid(): Int =
    throw UnsupportedOperationException("issetugid not available on JVM — no C library access")

public actual fun setusershell(): Unit = throw UnsupportedOperationException("setusershell not available on JVM — no C library access")

public actual fun utimensat(fd: Int, path: String?, times: Timespec?, flag: Int): Int =
    throw UnsupportedOperationException("utimensat not available on JVM — no C library access")

public actual fun futimens(fd: Int, times: Timespec?): Int =
    throw UnsupportedOperationException("futimens not available on JVM — no C library access")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR not available on JVM — no C library access")

public actual fun errnop(): Int? =
    throw UnsupportedOperationException("errnop not available on JVM — no C library access")

public actual fun abs(i: Int): Int =
    throw UnsupportedOperationException("abs not available on JVM — no C library access")

public actual fun labs(i: Long): Long =
    throw UnsupportedOperationException("labs not available on JVM — no C library access")

public actual fun rand(): Int =
    throw UnsupportedOperationException("rand not available on JVM — no C library access")

public actual fun srand(seed: UInt): Unit = throw UnsupportedOperationException("srand not available on JVM — no C library access")

public actual fun getifaddrs(ifap: COpaquePointer?): Int =
    throw UnsupportedOperationException("getifaddrs not available on JVM — no C library access")

public actual fun freeifaddrs(ifa: Ifaddrs?): Unit = throw UnsupportedOperationException("freeifaddrs not available on JVM — no C library access")

public actual fun ppoll(fds: Pollfd?, numfds: ULong, timeout: Timespec?, sigMask: ULong?): Int =
    throw UnsupportedOperationException("ppoll not available on JVM — no C library access")

public actual fun getspent(): Spwd? =
    throw UnsupportedOperationException("getspent not available on JVM — no C library access")

public actual fun getspentR(pwd: Spwd?, buf: String?, bufferSize: ULong, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("getspentR not available on JVM — no C library access")

public actual fun setspent(): Unit = throw UnsupportedOperationException("setspent not available on JVM — no C library access")

public actual fun endspent(): Unit = throw UnsupportedOperationException("endspent not available on JVM — no C library access")

public actual fun getspnam(name: String?): Spwd? =
    throw UnsupportedOperationException("getspnam not available on JVM — no C library access")

public actual fun getspnamR(name: String?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("getspnamR not available on JVM — no C library access")

public actual fun sgetspent(line: String?): Spwd? =
    throw UnsupportedOperationException("sgetspent not available on JVM — no C library access")

public actual fun sgetspentR(line: String?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("sgetspentR not available on JVM — no C library access")

public actual fun fgetspent(file: FILE?): Spwd? =
    throw UnsupportedOperationException("fgetspent not available on JVM — no C library access")

public actual fun fgetspentR(file: FILE?, spwd: Spwd?, buffer: String?, bufferSize: ULong, res: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetspentR not available on JVM — no C library access")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UInt): Int =
    throw UnsupportedOperationException("mkfifoat not available on JVM — no C library access")

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UInt, dev: Int): Int =
    throw UnsupportedOperationException("mknodat not available on JVM — no C library access")

public actual fun semDestroy(sem: SemT?): Int =
    throw UnsupportedOperationException("semDestroy not available on JVM — no C library access")

public actual fun semInit(sem: SemT?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit not available on JVM — no C library access")

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres not available on JVM — no C library access")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on JVM — no C library access")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime not available on JVM — no C library access")

public actual fun clockGetcpuclockid(pid: Int, clkId: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid not available on JVM — no C library access")

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize not available on JVM — no C library access")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack not available on JVM — no C library access")

public actual fun pthreadCondattrGetclock(attr: ULong?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock not available on JVM — no C library access")

public actual fun pthreadCondattrSetclock(attr: ULong?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock not available on JVM — no C library access")

public actual fun valloc(numBytes: ULong): COpaquePointer? =
    throw UnsupportedOperationException("valloc not available on JVM — no C library access")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize not available on JVM — no C library access")

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on JVM — no C library access")

public actual fun setgroups(ngroups: Int, ptr: UInt?): Int =
    throw UnsupportedOperationException("setgroups not available on JVM — no C library access")

public actual fun initgroups(name: String?, basegid: UInt): Int =
    throw UnsupportedOperationException("initgroups not available on JVM — no C library access")

public actual fun ioctl(fd: Int, request: ULong, vararg args: Any?): Int =
    throw UnsupportedOperationException("ioctl not available on JVM — no C library access")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect not available on JVM — no C library access")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("dirfd not available on JVM — no C library access")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: UInt, serv: String?, servlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("getnameinfo not available on JVM — no C library access")

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock not available on JVM — no C library access")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit not available on JVM — no C library access")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on JVM — no C library access")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinLock not available on JVM — no C library access")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on JVM — no C library access")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on JVM — no C library access")

public actual fun waitid(idtype: Int, id: Int, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid not available on JVM — no C library access")

public actual fun globfree(pglob: GlobT?): Unit = throw UnsupportedOperationException("globfree not available on JVM — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): Int =
    throw UnsupportedOperationException("gettimeofday not available on JVM — no C library access")

public actual fun posixMadvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("posixMadvise not available on JVM — no C library access")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advice: Int): Int =
    throw UnsupportedOperationException("posixFadvise not available on JVM — no C library access")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate not available on JVM — no C library access")

public actual fun shmOpen(name: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmOpen not available on JVM — no C library access")

public actual fun shmUnlink(name: String?): Int =
    throw UnsupportedOperationException("shmUnlink not available on JVM — no C library access")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir not available on JVM — no C library access")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir not available on JVM — no C library access")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise not available on JVM — no C library access")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync not available on JVM — no C library access")

public actual fun recvfrom(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int, addr: Sockaddr?, addrlen: UInt?): Long =
    throw UnsupportedOperationException("recvfrom not available on JVM — no C library access")

public actual fun nlLanginfo(item: Int): String? =
    throw UnsupportedOperationException("nlLanginfo not available on JVM — no C library access")

public actual fun bind(socket: Int, address: Sockaddr?, addressLen: UInt): Int =
    throw UnsupportedOperationException("bind not available on JVM — no C library access")

public actual fun accept4(socket: Int, address: Sockaddr?, addressLength: UInt?, flags: Int): Int =
    throw UnsupportedOperationException("accept4 not available on JVM — no C library access")

public actual fun writev(fd: Int, iov: Iovec?, count: Int): Long =
    throw UnsupportedOperationException("writev not available on JVM — no C library access")

public actual fun readv(fd: Int, iov: Iovec?, count: Int): Long =
    throw UnsupportedOperationException("readv not available on JVM — no C library access")

public actual fun sendmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("sendmsg not available on JVM — no C library access")

public actual fun recvmsg(fd: Int, msg: Msghdr?, flags: Int): Long =
    throw UnsupportedOperationException("recvmsg not available on JVM — no C library access")

public actual fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe not available on JVM — no C library access")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR not available on JVM — no C library access")

public actual fun getgrouplist(user: String?, basegroup: UInt, grouplist: UInt?, groupcount: Int?): Int =
    throw UnsupportedOperationException("getgrouplist not available on JVM — no C library access")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack not available on JVM — no C library access")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend not available on JVM — no C library access")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose not available on JVM — no C library access")

public actual fun getdtablesize(): Int =
    throw UnsupportedOperationException("getdtablesize not available on JVM — no C library access")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR not available on JVM — no C library access")

public actual fun pthreadSigmask(how: Int, set: ULong?, oldset: ULong?): Int =
    throw UnsupportedOperationException("pthreadSigmask not available on JVM — no C library access")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen not available on JVM — no C library access")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam not available on JVM — no C library access")

public actual fun pthreadKill(thread: ULong, sig: Int): Int =
    throw UnsupportedOperationException("pthreadKill not available on JVM — no C library access")

public actual fun semUnlink(name: String?): Int =
    throw UnsupportedOperationException("semUnlink not available on JVM — no C library access")

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwnamR not available on JVM — no C library access")

public actual fun getpwuidR(uid: UInt, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwuidR not available on JVM — no C library access")

public actual fun getpwent(): Passwd? =
    throw UnsupportedOperationException("getpwent not available on JVM — no C library access")

public actual fun setpwent(): Unit = throw UnsupportedOperationException("setpwent not available on JVM — no C library access")

public actual fun endpwent(): Unit = throw UnsupportedOperationException("endpwent not available on JVM — no C library access")

public actual fun endgrent(): Unit = throw UnsupportedOperationException("endgrent not available on JVM — no C library access")

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent not available on JVM — no C library access")

public actual fun setgrent(): Unit = throw UnsupportedOperationException("setgrent not available on JVM — no C library access")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait not available on JVM — no C library access")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid not available on JVM — no C library access")

public actual fun popen(command: String?, mode: String?): FILE? =
    throw UnsupportedOperationException("popen not available on JVM — no C library access")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname not available on JVM — no C library access")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname not available on JVM — no C library access")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on JVM — no C library access")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on JVM — no C library access")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on JVM — no C library access")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on JVM — no C library access")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent not available on JVM — no C library access")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent not available on JVM — no C library access")

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int =
    throw UnsupportedOperationException("faccessat not available on JVM — no C library access")

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait not available on JVM — no C library access")

public actual fun sigwaitinfo(set: ULong?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo not available on JVM — no C library access")

public actual fun getitimer(which: Int, currValue: Itimerval?): Int =
    throw UnsupportedOperationException("getitimer not available on JVM — no C library access")

public actual fun setitimer(which: Int, newValue: Itimerval?, oldValue: Itimerval?): Int =
    throw UnsupportedOperationException("setitimer not available on JVM — no C library access")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp not available on JVM — no C library access")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec not available on JVM — no C library access")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror not available on JVM — no C library access")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree not available on JVM — no C library access")

public actual fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int =
    throw UnsupportedOperationException("msgctl not available on JVM — no C library access")

public actual fun msgget(key: Int, msgflg: Int): Int =
    throw UnsupportedOperationException("msgget not available on JVM — no C library access")

public actual fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtype: Long, msgflg: Int): Long =
    throw UnsupportedOperationException("msgrcv not available on JVM — no C library access")

public actual fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int =
    throw UnsupportedOperationException("msgsnd not available on JVM — no C library access")

public actual fun semget(key: Int, nsems: Int, semflg: Int): Int =
    throw UnsupportedOperationException("semget not available on JVM — no C library access")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl not available on JVM — no C library access")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop not available on JVM — no C library access")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr not available on JVM — no C library access")

public actual fun hcreate(nelt: ULong): Int =
    throw UnsupportedOperationException("hcreate not available on JVM — no C library access")

public actual fun hdestroy(): Unit = throw UnsupportedOperationException("hdestroy not available on JVM — no C library access")

public actual fun hsearch(entry: io.github.kotlinmania.libc.unix.haiku.Entry, action: Int): io.github.kotlinmania.libc.unix.haiku.Entry? =
    throw UnsupportedOperationException("hsearch not available on JVM — no C library access")

public actual fun lrand48(): Long =
    throw UnsupportedOperationException("lrand48 not available on JVM — no C library access")

public actual fun nrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("nrand48 not available on JVM — no C library access")

public actual fun mrand48(): Long =
    throw UnsupportedOperationException("mrand48 not available on JVM — no C library access")

public actual fun jrand48(xseed: UShort?): Long =
    throw UnsupportedOperationException("jrand48 not available on JVM — no C library access")

public actual fun srand48(seed: Long): Unit = throw UnsupportedOperationException("srand48 not available on JVM — no C library access")

public actual fun seed48(xseed: UShort?): UShort? =
    throw UnsupportedOperationException("seed48 not available on JVM — no C library access")

public actual fun lcong48(p: UShort?): Unit = throw UnsupportedOperationException("lcong48 not available on JVM — no C library access")

public actual fun clearenv(): Int =
    throw UnsupportedOperationException("clearenv not available on JVM — no C library access")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid not available on JVM — no C library access")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync not available on JVM — no C library access")

public actual fun getpagesize(): Int =
    throw UnsupportedOperationException("getpagesize not available on JVM — no C library access")

public actual fun brk(addr: COpaquePointer?): Int =
    throw UnsupportedOperationException("brk not available on JVM — no C library access")

public actual fun sbrk(increment: Long): COpaquePointer? =
    throw UnsupportedOperationException("sbrk not available on JVM — no C library access")

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn not available on JVM — no C library access")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp not available on JVM — no C library access")

public actual fun posixSpawnFileActionsInit(fileActions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit not available on JVM — no C library access")

public actual fun posixSpawnFileActionsDestroy(fileActions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAddopen(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int, path: String?, oflag: Int, mode: UInt): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAddclose(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose not available on JVM — no C library access")

public actual fun posixSpawnFileActionsAdddup2(fileActions: io.github.kotlinmania.libc.COpaquePointer?, fildes: Int, newfildes: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 not available on JVM — no C library access")

public actual fun posixSpawnattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit not available on JVM — no C library access")

public actual fun posixSpawnattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy not available on JVM — no C library access")

public actual fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags not available on JVM — no C library access")

public actual fun posixSpawnattrSetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags not available on JVM — no C library access")

public actual fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, pgroup: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup not available on JVM — no C library access")

public actual fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, pgroup: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup not available on JVM — no C library access")

public actual fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, sigdefault: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault not available on JVM — no C library access")

public actual fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, sigdefault: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault not available on JVM — no C library access")

public actual fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask not available on JVM — no C library access")

public actual fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask not available on JVM — no C library access")

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong not available on JVM — no C library access")

public actual fun strcasecmpL(string1: String?, string2: String?, locale: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("strcasecmpL not available on JVM — no C library access")

public actual fun strncasecmpL(string1: String?, string2: String?, length: ULong, locale: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("strncasecmpL not available on JVM — no C library access")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy not available on JVM — no C library access")

public actual fun memmem(source: COpaquePointer?, sourceLength: ULong, search: COpaquePointer?, searchLength: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on JVM — no C library access")

public actual fun pthreadGetattrNp(thread: ULong, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadGetattrNp not available on JVM — no C library access")

public actual fun pthreadGetnameNp(thread: ULong, buffer: String?, length: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp not available on JVM — no C library access")

public actual fun pthreadSetnameNp(thread: ULong, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp not available on JVM — no C library access")

public actual fun pthreadCreate(thread: ULong?, attr: io.github.kotlinmania.libc.COpaquePointer?, f: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadCreate not available on JVM — no C library access")

public actual fun glob(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: GlobT?): Int =
    throw UnsupportedOperationException("glob not available on JVM — no C library access")

public actual fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int =
    throw UnsupportedOperationException("pthreadAtfork not available on JVM — no C library access")

public actual fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lsearch not available on JVM — no C library access")

public actual fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: ULong?, width: ULong, compar: ((COpaquePointer?, COpaquePointer?) -> Int)?): COpaquePointer? =
    throw UnsupportedOperationException("lfind not available on JVM — no C library access")

public actual fun pthreadSigqueue(thread: ULong, sig: Int, value: Sigval): Int =
    throw UnsupportedOperationException("pthreadSigqueue not available on JVM — no C library access")
