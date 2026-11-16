package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.UintptrT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpAffinityT
import io.github.kotlinmania.libc.unix.solarish.illumos.LgrpRsrcT
import io.github.kotlinmania.libc.unix.sysconf
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

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr, size: ULong, data: MutPtr): CInt
}

public fun cmsgHdrAlign(p: Int): Int = (p + CMSG_HDR_ALIGNMENT - 1) and (CMSG_HDR_ALIGNMENT - 1).inv()

public fun cmsgDataAlign(p: Int): Int = (p + CMSG_DATA_ALIGNMENT - 1) and (CMSG_DATA_ALIGNMENT - 1).inv()

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(cmsgDataAlign(ConstPtr((cmsg).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes)).rawAddress.toInt()).toLong())

public fun cmsgLen(length: CUint): CUint = cmsgDataAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    if ((((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()) < sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr(0L)
    } else {
        MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress, ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawMeta)
    }

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsgHdrAlign(cmsg.rawAddress.toInt() + ((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt() + sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next > max) {
        MutPtr(0L)
    } else {
        MutPtr(cmsgHdrAlign(cmsg.rawAddress.toInt() + ((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()).toLong())
    }
}

public fun cmsgSpace(length: CUint): CUint = cmsgHdrAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()) + length.toInt()).toUInt()

public fun fdClr(fd: CInt, set: MutPtr) {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] and (1L shl (fd1 % bits)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val fd1 = fd
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / bits] and (1L shl (fd1 % bits))) != 0L
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val bits = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr) {
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

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit(resource: CInt, rlim: ConstPtr): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun abs(i: CInt): CInt

public expect fun acct(filename: ConstPtr): CInt

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

public expect fun getrandom(bbuf: MutPtr, buflen: SizeT, flags: CUint): SsizeT

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun settimeofday(tp: ConstPtr, tz: ConstPtr): CInt

public expect fun getifaddrs(ifap: MutPtr): CInt

public expect fun freeifaddrs(ifa: MutPtr)

public expect fun stackGetbounds(sp: MutPtr): CInt

public expect fun getgrouplist(name: ConstPtr, basegid: GidT, groups: MutPtr, ngroups: MutPtr): CInt

public expect fun initgroups(name: ConstPtr, basegid: GidT): CInt

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt

public expect fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun errno(): MutPtr

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): MutPtr

public expect fun fdatasync(fd: CInt): CInt

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun getprogname(): ConstPtr

public expect fun setprogname(name: ConstPtr)

public expect fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt

public expect fun getpriority(which: CInt, who: CInt): CInt

public expect fun setpriority(which: CInt, who: CInt, prio: CInt): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun sethostname(name: ConstPtr, len: CInt): CInt

public expect fun ifNameindex(): MutPtr

public expect fun ifFreenameindex(ptr: MutPtr)

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt

public expect fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadGetnameNp(tid: PthreadT, name: MutPtr, len: SizeT): CInt

public expect fun pthreadSetnameNp(tid: PthreadT, name: ConstPtr): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

public expect fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt

public expect fun globfree(pglob: MutPtr)

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnFileActionsInit(fileActions: MutPtr): CInt

public expect fun posixSpawnFileActionsDestroy(fileActions: MutPtr): CInt

public expect fun posixSpawnFileActionsAddopen(fileActions: MutPtr, fildes: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(fileActions: MutPtr, fildes: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(fileActions: MutPtr, fildes: CInt, newfildes: CInt): CInt

public expect fun posixSpawnFileActionsAddclosefromNp(fileActions: MutPtr, lowfiledes: CInt): CInt

public expect fun posixSpawnFileActionsAddchdir(fileActions: MutPtr, path: ConstPtr): CInt

public expect fun posixSpawnFileActionsAddchdirNp(fileActions: MutPtr, path: ConstPtr): CInt

public expect fun posixSpawnFileActionsAddfchdir(fileActions: MutPtr, fd: CInt): CInt

public expect fun posixSpawnattrInit(attr: MutPtr): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr, pgroup: PidT): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr, pgroup: MutPtr): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr, policy: CInt): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr, policy: MutPtr): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr, sigdefault: ConstPtr): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr, sigdefault: MutPtr): CInt

public expect fun posixSpawnattrSetsigignoreNp(attr: MutPtr, sigignore: ConstPtr): CInt

public expect fun posixSpawnattrGetsigignoreNp(attr: ConstPtr, sigignore: MutPtr): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr, sigmask: ConstPtr): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr, sigmask: MutPtr): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun shmdt(shmaddr: ConstPtr): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun telldir(dirp: MutPtr): CLong

public expect fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr

public expect fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT

public expect fun mkstemps(template: MutPtr, suffixlen: CInt): CInt

public expect fun futimesat(fd: CInt, path: ConstPtr, times: ConstPtr): CInt

public expect fun futimens(dirfd: CInt, times: ConstPtr): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr

public expect fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT

public expect fun accept4(fd: CInt, address: MutPtr, addressLen: MutPtr, flags: CInt): CInt

public expect fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: ConstPtr): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt

public expect fun portCreate(): CInt

public expect fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: MutPtr): CInt

public expect fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt

public expect fun portGet(port: CInt, pe: MutPtr, timeout: MutPtr): CInt

public expect fun portGetn(port: CInt, peList: MutPtr, max: CUint, nget: MutPtr, timeout: MutPtr): CInt

public expect fun portSend(port: CInt, events: CInt, user: MutPtr): CInt

public expect fun portSendn(portList: MutPtr, errorList: MutPtr, nent: CUint, events: CInt, user: MutPtr): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt

public expect fun sigsuspend(mask: ConstPtr): CInt

public expect fun semClose(sem: MutPtr): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun thrSelf(): ThreadT

public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

public expect fun semUnlink(name: ConstPtr): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun nativeGetpwentR(pwd: MutPtr, buf: MutPtr, buflen: CInt): MutPtr

public expect fun nativeGetgrentR(grp: MutPtr, buf: MutPtr, buflen: CInt): MutPtr

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr

public expect fun popen(command: ConstPtr, mode: ConstPtr): MutPtr

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun uname(buf: MutPtr): CInt

public expect fun pipe2(fds: MutPtr, flags: CInt): CInt

public expect fun makeutx(ux: ConstPtr): MutPtr

public expect fun modutx(ux: ConstPtr): MutPtr

public expect fun updwtmpx(file: ConstPtr, ut: MutPtr)

public expect fun utmpxname(file: ConstPtr): CInt

public expect fun getutxent(): MutPtr

public expect fun getutxid(ut: ConstPtr): MutPtr

public expect fun getutxline(ut: ConstPtr): MutPtr

public expect fun pututxline(ut: ConstPtr): MutPtr

public expect fun setutxent()

public expect fun endutxent()

public expect fun endutent()

public expect fun getutent(): MutPtr

public expect fun getutid(u: ConstPtr): MutPtr

public expect fun getutline(u: ConstPtr): MutPtr

public expect fun pututline(u: ConstPtr): MutPtr

public expect fun setutent()

public expect fun utmpname(file: ConstPtr): CInt

public expect fun getutmp(ux: ConstPtr, u: MutPtr)

public expect fun getutmpx(u: ConstPtr, ux: MutPtr)

public expect fun updwtmp(file: ConstPtr, u: MutPtr)

public expect fun ntpAdjtime(buf: MutPtr): CInt

public expect fun ntpGettime(buf: MutPtr): CInt

public expect fun timerCreate(clockId: ClockidT, evp: MutPtr, timerid: MutPtr): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: MutPtr): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr, ovalue: MutPtr): CInt

public expect fun ucredGet(pid: PidT): MutPtr

public expect fun getpeerucred(fd: CInt, ucred: MutPtr): CInt

public expect fun ucredFree(ucred: MutPtr)

public expect fun ucredGeteuid(ucred: ConstPtr): UidT

public expect fun ucredGetruid(ucred: ConstPtr): UidT

public expect fun ucredGetsuid(ucred: ConstPtr): UidT

public expect fun ucredGetegid(ucred: ConstPtr): GidT

public expect fun ucredGetrgid(ucred: ConstPtr): GidT

public expect fun ucredGetsgid(ucred: ConstPtr): GidT

public expect fun ucredGetgroups(ucred: ConstPtr, groups: MutPtr): CInt

public expect fun ucredGetpid(ucred: ConstPtr): PidT

public expect fun ucredGetprojid(ucred: ConstPtr): ProjidT

public expect fun ucredGetzoneid(ucred: ConstPtr): ZoneidT

public expect fun ucredGetpflags(ucred: ConstPtr, flags: CUint): CUint

public expect fun ucredSize(): SizeT

public expect fun psetCreate(newpset: MutPtr): CInt

public expect fun psetDestroy(pset: PsetidT): CInt

public expect fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: MutPtr): CInt

public expect fun psetInfo(pset: PsetidT, tpe: MutPtr, numcpus: MutPtr, cpulist: MutPtr): CInt

public expect fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: MutPtr): CInt

public expect fun psetList(pset: MutPtr, numpsets: MutPtr): CInt

public expect fun psetSetattr(pset: PsetidT, attr: CUint): CInt

public expect fun psetGetattr(pset: PsetidT, attr: MutPtr): CInt

public expect fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: MutPtr): CInt

public expect fun pOnline(processorid: ProcessoridT, flag: CInt): CInt

public expect fun processorInfo(processorid: ProcessoridT, infop: MutPtr): CInt

public expect fun getexecname(): ConstPtr

public expect fun gethostid(): CLong

public expect fun getpflags(flags: CUint): CUint

public expect fun setpflags(flags: CUint, value: CUint): CInt

public expect fun sysinfo(command: CInt, buf: MutPtr, count: CLong): CInt

public expect fun faccessat(fd: CInt, path: ConstPtr, amode: CInt, flag: CInt): CInt

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt

public expect fun getpagesize(): CInt

public expect fun getpagesizes(pagesize: MutPtr, nelem: CInt): CInt

public expect fun mmapobj(fd: CInt, flags: CUint, storage: MutPtr, elements: MutPtr, arg: MutPtr): CInt

public expect fun meminfo(inaddr: ConstPtr, addrCount: CInt, infoReq: ConstPtr, infoCount: CInt, outdata: MutPtr, validity: MutPtr): CInt

public expect fun strsep(string: MutPtr, delim: ConstPtr): MutPtr

public expect fun getisax(array: MutPtr, n: CUint): CUint

public expect fun backtrace(buffer: MutPtr, size: CInt): CInt

public expect fun backtraceSymbols(buffer: ConstPtr, size: CInt): MutPtr

public expect fun backtraceSymbolsFd(buffer: ConstPtr, size: CInt, fd: CInt)

public expect fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt

public expect fun sync()

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt

public expect fun aioError(aiocbp: ConstPtr): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr): CInt

public expect fun aioRead(aiocbp: MutPtr): CInt

public expect fun aioReturn(aiocbp: MutPtr): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt

public expect fun aioWaitn(aiocbList: MutPtr, nent: CUint, nwait: MutPtr, timeout: ConstPtr): CInt

public expect fun aioWrite(aiocbp: MutPtr): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt

public expect fun major(version: CInt, devnum: DevT): MajorT

public expect fun minor(version: CInt, devnum: DevT): MinorT

public expect fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(buf: MutPtr, nbytes: SizeT)

public expect fun arc4randomUniform(upperBound: UInt): UInt

public expect fun secureGetenv(name: ConstPtr): MutPtr

public expect fun strftime(s: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr): SizeT

public expect fun strftimeL(s: MutPtr, maxsize: SizeT, format: ConstPtr, timeptr: ConstPtr, loc: LocaleT): SizeT

public expect fun sendfile(outFd: CInt, inFd: CInt, off: MutPtr, len: SizeT): SsizeT

public expect fun sendfilev(fildes: CInt, vec: ConstPtr, sfvcnt: CInt, xferred: MutPtr): SsizeT

public expect fun lgrpInit(view: LgrpViewT): LgrpCookieT

public expect fun lgrpFini(cookie: LgrpCookieT): CInt

public expect fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT

public expect fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt

public expect fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: MutPtr, count: CUint, content: LgrpContentT): CInt

public expect fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT

public expect fun lgrpNlgrps(cookie: LgrpCookieT): CInt

public expect fun lgrpView(cookie: LgrpCookieT): LgrpViewT

public expect fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT

public expect fun lgrpVersion(version: CInt): CInt

public expect fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: MutPtr, count: CUint, tpe: LgrpRsrcT): CInt

public expect fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT

public fun major(device: DevT): MajorT = major(NEWDEV, device)

public fun minor(device: DevT): MinorT = minor(NEWDEV, device)

public fun makedev(maj: MajorT, min: MinorT): DevT = makedev(NEWDEV, maj, min)
