package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr, errnum: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface LsearchComparCallback {
    public operator fun invoke(arg0: ConstPtr, arg1: ConstPtr): CInt
}

public fun cmsgAlign(len: Int): Int = len + sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1 and (sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1).inv()

public fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress, ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawMeta)
    } else {
        MutPtr(0L)
    }

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(((MutPtr(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(length.toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toUInt()

public fun cmsgLen(length: CUint): CUint = cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next > max) {
        MutPtr(0L)
    } else {
        MutPtr((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    }
}

public fun fdClr(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U32) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] and (1u shl (fd1 % size)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U32) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1u shl (fd1 % size))) != 0u
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U32) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] or (1u shl (fd1 % size))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0u
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun wifexited(status: CInt): Boolean = (status and 0xff.inv()) == 0

public fun wexitstatus(status: CInt): CInt = status and 0xff

public fun wifsignaled(status: CInt): Boolean = ((status shr 8) and 0xff) != 0

public fun wtermsig(status: CInt): CInt = (status shr 8) and 0xff

public fun wifstopped(status: CInt): Boolean = ((status shr 16) and 0xff) != 0

public fun wstopsig(status: CInt): CInt = (status shr 16) and 0xff

public fun wcoredump(status: CInt): Boolean = (status and 0x10000) != 0

public fun wifcontinued(status: CInt): Boolean = (status and 0x20000) != 0

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, priority: CInt): CInt

public expect fun endusershell()

public expect fun getpass(prompt: ConstPtr): MutPtr

public expect fun getusershell(): MutPtr

public expect fun issetugid(): CInt

public expect fun setusershell()

public expect fun utimensat(fd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun errnop(): MutPtr

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getifaddrs(ifap: MutPtr): CInt

public expect fun freeifaddrs(ifa: MutPtr)

public expect fun ppoll(fds: MutPtr, numfds: NfdsT, timeout: ConstPtr, sigMask: ConstPtr): CInt

public expect fun getspent(): MutPtr

public expect fun getspentR(pwd: MutPtr, buf: MutPtr, bufferSize: SizeT, res: MutPtr): CInt

public expect fun setspent()

public expect fun endspent()

public expect fun getspnam(name: ConstPtr): MutPtr

public expect fun getspnamR(name: ConstPtr, spwd: MutPtr, buffer: MutPtr, bufferSize: SizeT, res: MutPtr): CInt

public expect fun sgetspent(line: ConstPtr): MutPtr

public expect fun sgetspentR(line: ConstPtr, spwd: MutPtr, buffer: MutPtr, bufferSize: SizeT, res: MutPtr): CInt

public expect fun fgetspent(file: MutPtr): MutPtr

public expect fun fgetspentR(file: MutPtr, spwd: MutPtr, buffer: MutPtr, bufferSize: SizeT, res: MutPtr): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt

public expect fun pthreadCreate(thread: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun valloc(numBytes: SizeT): MutPtr

public expect fun mallocUsableSize(ptr: MutPtr): SizeT

public expect fun memalign(align: SizeT, size: SizeT): MutPtr

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt

public expect fun initgroups(name: ConstPtr, basegid: GidT): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr): CInt

public expect fun pthreadSpinLock(lock: MutPtr): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

public expect fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt

public expect fun globfree(pglob: MutPtr)

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advice: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun telldir(dirp: MutPtr): CLong

public expect fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT

public expect fun nlLanginfo(item: NlItem): MutPtr

public expect fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt

public expect fun accept4(socket: CInt, address: MutPtr, addressLength: MutPtr, flags: CInt): CInt

public expect fun writev(fd: CInt, iov: ConstPtr, count: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr, count: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr, argv: ConstPtr, environment: ConstPtr): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrouplist(user: ConstPtr, basegroup: GidT, grouplist: MutPtr, groupcount: MutPtr): CInt

public expect fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt

public expect fun sigsuspend(mask: ConstPtr): CInt

public expect fun semClose(sem: MutPtr): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: ConstPtr): CInt

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwent(): MutPtr

public expect fun setpwent()

public expect fun endpwent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr

public expect fun setgrent()

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun popen(command: ConstPtr, mode: ConstPtr): MutPtr

public expect fun sethostname(name: ConstPtr, len: SizeT): CInt

public expect fun uname(buf: MutPtr): CInt

public expect fun getutxent(): MutPtr

public expect fun getutxid(ut: ConstPtr): MutPtr

public expect fun getutxline(ut: ConstPtr): MutPtr

public expect fun pututxline(ut: ConstPtr): MutPtr

public expect fun setutxent()

public expect fun endutxent()

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt

public expect fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt

public expect fun getitimer(which: CInt, currValue: MutPtr): CInt

public expect fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt

public expect fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr)

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtype: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt

public expect fun ftok(pathname: ConstPtr, projId: CInt): KeyT

public expect fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun lsearch(key: ConstPtr, base: MutPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr

public expect fun lfind(key: ConstPtr, base: ConstPtr, nelp: MutPtr, width: SizeT, compar: LsearchComparCallback?): MutPtr

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: Entry, action: Action): MutPtr

public expect fun drand48(): CDouble

public expect fun erand48(xseed: MutPtr): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: MutPtr): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: MutPtr): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: MutPtr): MutPtr

public expect fun lcong48(p: MutPtr)

public expect fun clearenv(): CInt

public expect fun ctermid(s: MutPtr): MutPtr

public expect fun sync()

public expect fun getpagesize(): CInt

public expect fun brk(addr: MutPtr): CInt

public expect fun sbrk(increment: IntptrT): MutPtr

public expect fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnFileActionsInit(fileActions: MutPtr): CInt

public expect fun posixSpawnFileActionsDestroy(fileActions: MutPtr): CInt

public expect fun posixSpawnFileActionsAddopen(fileActions: MutPtr, fildes: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(fileActions: MutPtr, fildes: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(fileActions: MutPtr, fildes: CInt, newfildes: CInt): CInt

public expect fun posixSpawnattrInit(attr: MutPtr): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr, pgroup: MutPtr): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr, pgroup: PidT): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr, sigdefault: MutPtr): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr, sigdefault: ConstPtr): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr, sigmask: MutPtr): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr, sigmask: ConstPtr): CInt

public expect fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt

public expect fun strcasecmpL(string1: ConstPtr, string2: ConstPtr, locale: LocaleT): CInt

public expect fun strncasecmpL(string1: ConstPtr, string2: ConstPtr, length: SizeT, locale: LocaleT): CInt

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

public expect fun memmem(source: ConstPtr, sourceLength: SizeT, search: ConstPtr, searchLength: SizeT): MutPtr

public expect fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, buffer: MutPtr, length: SizeT): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt
