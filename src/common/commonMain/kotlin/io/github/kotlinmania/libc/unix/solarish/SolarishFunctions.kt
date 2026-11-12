package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.illumos.Aiocb
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpRsrcT
import io.github.kotlinmania.libc.unix.solarish.illumos.ShmidDs
import io.github.kotlinmania.libc.unix.solarish.illumos.Utmpx
import io.github.kotlinmania.libc.unix.solarish.x8664.DlPhdrInfo
import io.github.kotlinmania.libc.unix.sysconf
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
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

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr<DlPhdrInfo>, size: ULong, data: MutPtr<CVoid>): CInt
}

public fun cmsgHdrAlign(p: Int): Int = (p + CMSG_HDR_ALIGNMENT - 1) and (CMSG_HDR_ALIGNMENT - 1).inv()

public fun cmsgDataAlign(p: Int): Int = (p + CMSG_DATA_ALIGNMENT - 1) and (CMSG_DATA_ALIGNMENT - 1).inv()

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr<CUchar>(cmsgDataAlign(ConstPtr<CVoid>((cmsg).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes)).rawAddress.toInt()).toLong())

public fun cmsgLen(length: CUint): CUint = cmsgDataAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if ((((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()) < sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr<Cmsghdr>(0L)
    } else {
        MutPtr<Cmsghdr>(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress, ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawMeta)
    }

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsgHdrAlign(cmsg.rawAddress.toInt() + ((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt() + sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next > max) {
        MutPtr<Cmsghdr>(0L)
    } else {
        MutPtr<Cmsghdr>(cmsgHdrAlign(cmsg.rawAddress.toInt() + ((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()).toLong())
    }
}

public fun cmsgSpace(length: CUint): CUint = cmsgHdrAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toInt() + length.toInt()).toUInt()

public fun fdClr(fd: CInt, set: MutPtr<FdSet>) {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] and (1L shl (fd1 % bits)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr<FdSet>): Boolean {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val fd1 = fd
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / bits] and (1L shl (fd1 % bits))) != 0L
}

public fun fdSet(fd: CInt, set: MutPtr<FdSet>) {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr<FdSet>) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0L
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun sigrtmax(): CInt = sysconf(SC_SIGRT_MAX).toInt()

public fun sigrtmin(): CInt = sysconf(SC_SIGRT_MIN).toInt()

public fun wifexited(status: CInt): Boolean = (status and 0xFF) == 0

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0xFF

public fun wtermsig(status: CInt): CInt = status and 0x7F

public fun wifcontinued(status: CInt): Boolean = (status and 0xffff) == 0xffff

public fun wstopsig(status: CInt): CInt = (status and 0xff00) shr 8

public fun wifsignaled(status: CInt): Boolean = ((status and 0xff) > 0) && (status and 0xff00 == 0)

public fun wifstopped(status: CInt): Boolean = ((status and 0xff) == 0x7f) && ((status and 0xff00) != 0)

public fun wcoredump(status: CInt): Boolean = (status and 0x80) != 0

public fun mrGetType(flags: CUint): CUint = flags and 0x0000ffffu

public expect fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun abs(i: CInt): CInt

public expect fun acct(filename: ConstPtr<CChar>): CInt

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

public expect fun getrandom(bbuf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun settimeofday(tp: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt

public expect fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt

public expect fun freeifaddrs(ifa: MutPtr<Ifaddrs>)

public expect fun stackGetbounds(sp: MutPtr<StackT>): CInt

public expect fun getgrouplist(name: ConstPtr<CChar>, basegid: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt

public expect fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt

public expect fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun errno(): MutPtr<CInt>

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): MutPtr<Passwd>

public expect fun fdatasync(fd: CInt): CInt

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar>

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun getprogname(): ConstPtr<CChar>

public expect fun setprogname(name: ConstPtr<CChar>)

public expect fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt

public expect fun getpriority(which: CInt, who: CInt): CInt

public expect fun setpriority(which: CInt, who: CInt, prio: CInt): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt

public expect fun ifNameindex(): MutPtr<IfNameindex>

public expect fun ifFreenameindex(ptr: MutPtr<IfNameindex>)

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadGetnameNp(tid: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt

public expect fun pthreadSetnameNp(tid: PthreadT, name: ConstPtr<CChar>): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt

public expect fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt

public expect fun globfree(pglob: MutPtr<GlobT>)

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnFileActionsInit(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsDestroy(fileActions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsAddopen(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(fileActions: MutPtr<PosixSpawnFileActionsT>, fildes: CInt, newfildes: CInt): CInt

public expect fun posixSpawnFileActionsAddclosefromNp(fileActions: MutPtr<PosixSpawnFileActionsT>, lowfiledes: CInt): CInt

public expect fun posixSpawnFileActionsAddchdir(fileActions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt

public expect fun posixSpawnFileActionsAddchdirNp(fileActions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt

public expect fun posixSpawnFileActionsAddfchdir(fileActions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

public expect fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, pgroup: PidT): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, pgroup: MutPtr<PidT>): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, policy: CInt): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, policy: MutPtr<CInt>): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, sigdefault: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, sigdefault: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigignoreNp(attr: MutPtr<PosixSpawnattrT>, sigignore: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetsigignoreNp(attr: ConstPtr<PosixSpawnattrT>, sigignore: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, sigmask: MutPtr<SigsetT>): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid>

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt

public expect fun shmdt(shmaddr: ConstPtr<CVoid>): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr<CChar>): CInt

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT

public expect fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt

public expect fun futimesat(fd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun futimens(dirfd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr<CChar>

public expect fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT

public expect fun accept4(fd: CInt, address: MutPtr<Sockaddr>, addressLen: MutPtr<SocklenT>, flags: CInt): CInt

public expect fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: ConstPtr<CChar>): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt

public expect fun portCreate(): CInt

public expect fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: MutPtr<CVoid>): CInt

public expect fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt

public expect fun portGet(port: CInt, pe: MutPtr<PortEvent>, timeout: MutPtr<Timespec>): CInt

public expect fun portGetn(port: CInt, peList: MutPtr<PortEvent>, max: CUint, nget: MutPtr<CUint>, timeout: MutPtr<Timespec>): CInt

public expect fun portSend(port: CInt, events: CInt, user: MutPtr<CVoid>): CInt

public expect fun portSendn(portList: MutPtr<CInt>, errorList: MutPtr<CInt>, nent: CUint, events: CInt, user: MutPtr<CVoid>): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun thrSelf(): ThreadT

public expect fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun nativeGetpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Passwd>

public expect fun nativeGetgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Group>

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr<Group>

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt

public expect fun makeutx(ux: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun modutx(ux: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun updwtmpx(file: ConstPtr<CChar>, ut: MutPtr<Utmpx>)

public expect fun utmpxname(file: ConstPtr<CChar>): CInt

public expect fun getutxent(): MutPtr<Utmpx>

public expect fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun setutxent()

public expect fun endutxent()

public expect fun endutent()

public expect fun getutent(): MutPtr<Utmp>

public expect fun getutid(u: ConstPtr<Utmp>): MutPtr<Utmp>

public expect fun getutline(u: ConstPtr<Utmp>): MutPtr<Utmp>

public expect fun pututline(u: ConstPtr<Utmp>): MutPtr<Utmp>

public expect fun setutent()

public expect fun utmpname(file: ConstPtr<CChar>): CInt

public expect fun getutmp(ux: ConstPtr<Utmpx>, u: MutPtr<Utmp>)

public expect fun getutmpx(u: ConstPtr<Utmp>, ux: MutPtr<Utmpx>)

public expect fun updwtmp(file: ConstPtr<CChar>, u: MutPtr<Utmp>)

public expect fun ntpAdjtime(buf: MutPtr<Timex>): CInt

public expect fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt

public expect fun timerCreate(clockId: ClockidT, evp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr<Itimerspec>, ovalue: MutPtr<Itimerspec>): CInt

public expect fun ucredGet(pid: PidT): MutPtr<UcredT>

public expect fun getpeerucred(fd: CInt, ucred: MutPtr<MutPtr<UcredT>>): CInt

public expect fun ucredFree(ucred: MutPtr<UcredT>)

public expect fun ucredGeteuid(ucred: ConstPtr<UcredT>): UidT

public expect fun ucredGetruid(ucred: ConstPtr<UcredT>): UidT

public expect fun ucredGetsuid(ucred: ConstPtr<UcredT>): UidT

public expect fun ucredGetegid(ucred: ConstPtr<UcredT>): GidT

public expect fun ucredGetrgid(ucred: ConstPtr<UcredT>): GidT

public expect fun ucredGetsgid(ucred: ConstPtr<UcredT>): GidT

public expect fun ucredGetgroups(ucred: ConstPtr<UcredT>, groups: MutPtr<ConstPtr<GidT>>): CInt

public expect fun ucredGetpid(ucred: ConstPtr<UcredT>): PidT

public expect fun ucredGetprojid(ucred: ConstPtr<UcredT>): ProjidT

public expect fun ucredGetzoneid(ucred: ConstPtr<UcredT>): ZoneidT

public expect fun ucredGetpflags(ucred: ConstPtr<UcredT>, flags: CUint): CUint

public expect fun ucredSize(): SizeT

public expect fun psetCreate(newpset: MutPtr<PsetidT>): CInt

public expect fun psetDestroy(pset: PsetidT): CInt

public expect fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: MutPtr<PsetidT>): CInt

public expect fun psetInfo(pset: PsetidT, tpe: MutPtr<CInt>, numcpus: MutPtr<CUint>, cpulist: MutPtr<ProcessoridT>): CInt

public expect fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: MutPtr<PsetidT>): CInt

public expect fun psetList(pset: MutPtr<PsetidT>, numpsets: MutPtr<CUint>): CInt

public expect fun psetSetattr(pset: PsetidT, attr: CUint): CInt

public expect fun psetGetattr(pset: PsetidT, attr: MutPtr<CUint>): CInt

public expect fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: MutPtr<ProcessoridT>): CInt

public expect fun pOnline(processorid: ProcessoridT, flag: CInt): CInt

public expect fun processorInfo(processorid: ProcessoridT, infop: MutPtr<ProcessorInfoT>): CInt

public expect fun getexecname(): ConstPtr<CChar>

public expect fun gethostid(): CLong

public expect fun getpflags(flags: CUint): CUint

public expect fun setpflags(flags: CUint, value: CUint): CInt

public expect fun sysinfo(command: CInt, buf: MutPtr<CChar>, count: CLong): CInt

public expect fun faccessat(fd: CInt, path: ConstPtr<CChar>, amode: CInt, flag: CInt): CInt

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt

public expect fun getpagesize(): CInt

public expect fun getpagesizes(pagesize: MutPtr<SizeT>, nelem: CInt): CInt

public expect fun mmapobj(fd: CInt, flags: CUint, storage: MutPtr<MmapobjResultT>, elements: MutPtr<CUint>, arg: MutPtr<CVoid>): CInt

public expect fun meminfo(inaddr: ConstPtr<ULong>, addrCount: CInt, infoReq: ConstPtr<CUint>, infoCount: CInt, outdata: MutPtr<ULong>, validity: MutPtr<CUint>): CInt

public expect fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar>

public expect fun getisax(array: MutPtr<UInt>, n: CUint): CUint

public expect fun backtrace(buffer: MutPtr<MutPtr<CVoid>>, size: CInt): CInt

public expect fun backtraceSymbols(buffer: ConstPtr<MutPtr<CVoid>>, size: CInt): MutPtr<MutPtr<CChar>>

public expect fun backtraceSymbolsFd(buffer: ConstPtr<MutPtr<CVoid>>, size: CInt, fd: CInt)

public expect fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt

public expect fun sync()

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioError(aiocbp: ConstPtr<Aiocb>): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioRead(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun aioWaitn(aiocbList: MutPtr<MutPtr<Aiocb>>, nent: CUint, nwait: MutPtr<CUint>, timeout: ConstPtr<Timespec>): CInt

public expect fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt

public expect fun major(version: CInt, devnum: DevT): MajorT

public expect fun minor(version: CInt, devnum: DevT): MinorT

public expect fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(buf: MutPtr<CVoid>, nbytes: SizeT)

public expect fun arc4randomUniform(upperBound: UInt): UInt

public expect fun secureGetenv(name: ConstPtr<CChar>): MutPtr<CChar>

public expect fun strftime(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>): SizeT

public expect fun strftimeL(s: MutPtr<CChar>, maxsize: SizeT, format: ConstPtr<CChar>, timeptr: ConstPtr<Tm>, loc: LocaleT): SizeT

public expect fun sendfile(outFd: CInt, inFd: CInt, off: MutPtr<OffT>, len: SizeT): SsizeT

public expect fun sendfilev(fildes: CInt, vec: ConstPtr<SendfilevecT>, sfvcnt: CInt, xferred: MutPtr<SizeT>): SsizeT

public expect fun lgrpInit(view: LgrpViewT): LgrpCookieT

public expect fun lgrpFini(cookie: LgrpCookieT): CInt

public expect fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT

public expect fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt

public expect fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: MutPtr<ProcessoridT>, count: CUint, content: LgrpContentT): CInt

public expect fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT

public expect fun lgrpNlgrps(cookie: LgrpCookieT): CInt

public expect fun lgrpView(cookie: LgrpCookieT): LgrpViewT

public expect fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT

public expect fun lgrpVersion(version: CInt): CInt

public expect fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: MutPtr<LgrpIdT>, count: CUint, tpe: LgrpRsrcT): CInt

public expect fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT

public fun major(device: DevT): MajorT = major(NEWDEV, device)

public fun minor(device: DevT): MinorT = minor(NEWDEV, device)

public fun makedev(maj: MajorT, min: MinorT): DevT = makedev(NEWDEV, maj, min)
