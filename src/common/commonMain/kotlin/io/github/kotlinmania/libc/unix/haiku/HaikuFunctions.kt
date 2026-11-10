package io.github.kotlinmania.libc.unix.haiku

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
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errnum: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface LsearchComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?): CInt
}

public fun cmsgAlign(len: Int): Int {
    return len + 8 - 1 and (8 - 1).inv()
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if ((mhdr!!.msgControllen).toInt() >= 8) {
        null
    } else {
        null
    }
}

public fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? {
    return COpaquePointer(((COpaquePointer((cmsg).hashCode().toLong()))).rawValue + (cmsgAlign(8)).toLong())
}

public fun cmsgSpace(length: CUint): CUint {
    return (cmsgAlign(length.toInt()) + cmsgAlign(8)).toUInt()
}

public fun cmsgLen(length: CUint): CUint {
    return cmsgAlign(8).toUInt() + length
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if ((cmsg == null)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = ((cmsg).hashCode().toLong()).toInt() + cmsgAlign(cmsg.cmsgLen.toInt()) + cmsgAlign(8)
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + mhdr.msgControllen.toInt()
    return if (next > max) {
        null
    } else {
        null
    }
}

public fun fdClr(fd: CInt, set: FdSet?) {
    val fd1 = fd
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set.fdsBits[fd1 / size] and (1u shl (fd1 % size)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val fd1 = fd
    val size = 8 * 8
    return (set!!.fdsBits[fd1 / size] and (1u shl (fd1 % size))) != 0u
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val fd1 = fd
    val size = 8 * 8
    set!!.fdsBits[fd1 / size] = set.fdsBits[fd1 / size] or (1u shl (fd1 % size))
    return
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set.fdsBits)[idx] = 0u
    }
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0xff.inv()) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return status and 0xff
}

public fun wifsignaled(status: CInt): Boolean {
    return ((status shr 8) and 0xff) != 0
}

public fun wtermsig(status: CInt): CInt {
    return (status shr 8) and 0xff
}

public fun wifstopped(status: CInt): Boolean {
    return ((status shr 16) and 0xff) != 0
}

public fun wstopsig(status: CInt): CInt {
    return (status shr 16) and 0xff
}

public fun wcoredump(status: CInt): Boolean {
    return (status and 0x10000) != 0
}

public fun wifcontinued(status: CInt): Boolean {
    return (status and 0x20000) != 0
}

public expect fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, priority: CInt): CInt

public expect fun endusershell()

public expect fun getpass(prompt: String?): COpaquePointer?

public expect fun getusershell(): COpaquePointer?

public expect fun issetugid(): CInt

public expect fun setusershell()

public expect fun utimensat(fd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun errnop(): COpaquePointer?

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: COpaquePointer?)

public expect fun ppoll(fds: COpaquePointer?, numfds: NfdsT, timeout: COpaquePointer?, sigMask: COpaquePointer?): CInt

public expect fun getspent(): COpaquePointer?

public expect fun getspentR(pwd: COpaquePointer?, buf: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt

public expect fun setspent()

public expect fun endspent()

public expect fun getspnam(name: String?): COpaquePointer?

public expect fun getspnamR(name: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt

public expect fun sgetspent(line: String?): COpaquePointer?

public expect fun sgetspentR(line: String?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt

public expect fun fgetspent(file: FILE?): COpaquePointer?

public expect fun fgetspentR(file: FILE?, spwd: COpaquePointer?, buffer: COpaquePointer?, bufferSize: SizeT, res: COpaquePointer?): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: COpaquePointer?): CInt

public expect fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadAttrGetguardsize(attr: COpaquePointer?, guardsize: COpaquePointer?): CInt

public expect fun pthreadAttrSetguardsize(attr: COpaquePointer?, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun valloc(numBytes: SizeT): COpaquePointer?

public expect fun mallocUsableSize(ptr: COpaquePointer?): SizeT

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt

public expect fun initgroups(name: String?, basegid: GidT): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadSpinLock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinTrylock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinUnlock(lock: COpaquePointer?): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt

public expect fun globfree(pglob: COpaquePointer?)

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun nlLanginfo(item: NlItem): COpaquePointer?

public expect fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt

public expect fun accept4(socket: CInt, address: COpaquePointer?, addressLength: COpaquePointer?, flags: CInt): CInt

public expect fun writev(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, count: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: String?, argv: COpaquePointer?, environment: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrouplist(user: String?, basegroup: GidT, grouplist: COpaquePointer?, groupcount: COpaquePointer?): CInt

public expect fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt

public expect fun sigsuspend(mask: COpaquePointer?): CInt

public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun getgrnam(name: String?): COpaquePointer?

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwent(): COpaquePointer?

public expect fun setpwent()

public expect fun endpwent()

public expect fun endgrent()

public expect fun getgrent(): COpaquePointer?

public expect fun setgrent()

public expect fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): COpaquePointer?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun sethostname(name: String?, len: SizeT): CInt

public expect fun uname(buf: COpaquePointer?): CInt

public expect fun getutxent(): COpaquePointer?

public expect fun getutxid(ut: COpaquePointer?): COpaquePointer?

public expect fun getutxline(ut: COpaquePointer?): COpaquePointer?

public expect fun pututxline(ut: COpaquePointer?): COpaquePointer?

public expect fun setutxent()

public expect fun endutxent()

public expect fun faccessat(dirfd: CInt, pathname: String?, mode: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: COpaquePointer?, info: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun sigwaitinfo(set: COpaquePointer?, info: COpaquePointer?): CInt

public expect fun getitimer(which: CInt, currValue: COpaquePointer?): CInt

public expect fun setitimer(which: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun regcomp(preg: COpaquePointer?, pattern: String?, cflags: CInt): CInt

public expect fun regexec(preg: COpaquePointer?, input: String?, nmatch: SizeT, pmatch: COpaquePointer?, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: COpaquePointer?, errbuf: COpaquePointer?, errbufSize: SizeT): SizeT

public expect fun regfree(preg: COpaquePointer?)

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun memrchr(cx: COpaquePointer?, c: CInt, n: SizeT): COpaquePointer?

public expect fun lsearch(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer?

public expect fun lfind(key: COpaquePointer?, base: COpaquePointer?, nelp: COpaquePointer?, width: SizeT, compar: LsearchComparCallback?): COpaquePointer?

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: Entry, action: Action): COpaquePointer?

public expect fun drand48(): CDouble

public expect fun erand48(xseed: COpaquePointer?): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: COpaquePointer?): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: COpaquePointer?): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: COpaquePointer?): COpaquePointer?

public expect fun lcong48(p: COpaquePointer?)

public expect fun clearenv(): CInt

public expect fun ctermid(s: COpaquePointer?): COpaquePointer?

public expect fun sync()

public expect fun getpagesize(): CInt

public expect fun brk(addr: COpaquePointer?): CInt

public expect fun sbrk(increment: IntptrT): COpaquePointer?

public expect fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt

public expect fun strcasecmpL(string1: String?, string2: String?, locale: LocaleT): CInt

public expect fun strncasecmpL(string1: String?, string2: String?, length: SizeT, locale: LocaleT): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun memmem(source: COpaquePointer?, sourceLength: SizeT, search: COpaquePointer?, searchLength: SizeT): COpaquePointer?

public expect fun pthreadGetattrNp(thread: PthreadT, attr: COpaquePointer?): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, buffer: COpaquePointer?, length: SizeT): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt
