package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr<CChar>, errnum: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface LsearchComparCallback {
    public operator fun invoke(arg0: ConstPtr<CVoid>, arg1: ConstPtr<CVoid>): CInt
}

public fun cmsgAlign(len: Int): Int = len + sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1 and (sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1).inv()

public fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr<Cmsghdr>(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress, ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawMeta)
    } else {
        MutPtr<Cmsghdr>(0L)
    }

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr(((MutPtr<CUchar>(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (ObjectSlotLayout<CUchar>()).strideBytes))

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(length.toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toUInt()

public fun cmsgLen(length: CUint): CUint = cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next > max) {
        MutPtr<Cmsghdr>(0L)
    } else {
        MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    }
}

public fun fdClr(fd: CInt, set: MutPtr<FdSet>) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0]) * 8
    (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] = (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1u shl (fd1 % size)).inv()
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr<FdSet>): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0]) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1u shl (fd1 % size))) != 0u
}

public fun fdSet(fd: CInt, set: MutPtr<FdSet>) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0]) * 8
    (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] = (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] or (1u shl (fd1 % size))
    return
}

public fun fdZero(set: MutPtr<FdSet>) {
    for (idx in ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits).indices) {
        ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits)[idx] = 0u
    }
}

public fun wifexited(status: CInt): Boolean = (status and 0xff.inv()) == 0

public fun wexitstatus(status: CInt): CInt = status and 0xff

public fun wifsignaled(status: CInt): Boolean = ((status shr 8) and 0xff) != 0

public fun wtermsig(status: CInt): CInt = (status shr 8) and 0xff

public fun wifstopped(status: CInt): Boolean = ((status shr 16) and 0xff) != 0

public fun wstopsig(status: CInt): CInt = (status shr 16) and 0xff

public fun wcoredump(status: CInt): Boolean = (status and 0x10000) != 0

public fun wifcontinued(status: CInt): Boolean = (status and 0x20000) != 0

public expect fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, priority: CInt): CInt

public expect fun endusershell()

public expect fun getpass(prompt: ConstPtr<CChar>): MutPtr<CChar>

public expect fun getusershell(): MutPtr<CChar>

public expect fun issetugid(): CInt

public expect fun setusershell()

public expect fun utimensat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun errnop(): MutPtr<CInt>

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt

public expect fun freeifaddrs(ifa: MutPtr<Ifaddrs>)

public expect fun ppoll(fds: MutPtr<Pollfd>, numfds: NfdsT, timeout: ConstPtr<Timespec>, sigMask: ConstPtr<SigsetT>): CInt

public expect fun getspent(): MutPtr<Spwd>

public expect fun getspentR(pwd: MutPtr<Spwd>, buf: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt

public expect fun setspent()

public expect fun endspent()

public expect fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd>

public expect fun getspnamR(name: ConstPtr<CChar>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt

public expect fun sgetspent(line: ConstPtr<CChar>): MutPtr<Spwd>

public expect fun sgetspentR(line: ConstPtr<CChar>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt

public expect fun fgetspent(file: MutPtr<FILE>): MutPtr<Spwd>

public expect fun fgetspentR(file: MutPtr<FILE>, spwd: MutPtr<Spwd>, buffer: MutPtr<CChar>, bufferSize: SizeT, res: MutPtr<MutPtr<Spwd>>): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt

public expect fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun valloc(numBytes: SizeT): MutPtr<CVoid>

public expect fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT

public expect fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt

public expect fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt

public expect fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt

public expect fun globfree(pglob: MutPtr<GlobT>)

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr<CChar>): CInt

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT

public expect fun nlLanginfo(item: NlItem): MutPtr<CChar>

public expect fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt

public expect fun accept4(socket: CInt, address: MutPtr<Sockaddr>, addressLength: MutPtr<SocklenT>, flags: CInt): CInt

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, count: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, count: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, environment: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun getgrouplist(user: ConstPtr<CChar>, basegroup: GidT, grouplist: MutPtr<GidT>, groupcount: MutPtr<CInt>): CInt

public expect fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwent(): MutPtr<Passwd>

public expect fun setpwent()

public expect fun endpwent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr<Group>

public expect fun setgrent()

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun getutxent(): MutPtr<Utmpx>

public expect fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun setutxent()

public expect fun endutxent()

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt

public expect fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt

public expect fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt

public expect fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt

public expect fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt

public expect fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr<RegexT>)

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt

public expect fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT

public expect fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid>

public expect fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LsearchComparCallback?): MutPtr<CVoid>

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: Entry, action: Action): MutPtr<Entry>

public expect fun drand48(): CDouble

public expect fun erand48(xseed: MutPtr<CUshort>): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: MutPtr<CUshort>): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: MutPtr<CUshort>): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort>

public expect fun lcong48(p: MutPtr<CUshort>)

public expect fun clearenv(): CInt

public expect fun ctermid(s: MutPtr<CChar>): MutPtr<CChar>

public expect fun sync()

public expect fun getpagesize(): CInt

public expect fun brk(addr: MutPtr<CVoid>): CInt

public expect fun sbrk(increment: IntptrT): MutPtr<CVoid>

public expect fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnFileActionsInit(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsDestroy(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsAddopen(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, newfildes: CInt): CInt

public expect fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, pgroup: MutPtr<PidT>): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, pgroup: PidT): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, sigdefault: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, sigdefault: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, sigmask: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt

public expect fun strcasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, locale: LocaleT): CInt

public expect fun strncasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, length: SizeT, locale: LocaleT): CInt

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

public expect fun memmem(source: ConstPtr<CVoid>, sourceLength: SizeT, search: ConstPtr<CVoid>, searchLength: SizeT): MutPtr<CVoid>

public expect fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr<CChar>, length: SizeT): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt
