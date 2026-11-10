package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
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

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: COpaquePointer?): COpaquePointer?
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errnum: CInt): CInt
}

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: COpaquePointer?, size: ULong, data: COpaquePointer?): CInt
}

public fun cmsgHdrAlign(p: Int): Int {
    return (p + CMSG_HDR_ALIGNMENT - 1) and (CMSG_HDR_ALIGNMENT - 1).inv()
}

public fun cmsgDataAlign(p: Int): Int {
    return (p + CMSG_DATA_ALIGNMENT - 1) and (CMSG_DATA_ALIGNMENT - 1).inv()
}

public fun cmsgData(cmsg: COpaquePointer?): COpaquePointer? {
    return COpaquePointer(cmsgDataAlign((((cmsg)?.let { COpaquePointer(it.rawValue + 1.toLong()) })?.rawValue ?: 0L).toInt()).toLong())
}

public fun cmsgLen(length: CUint): CUint {
    return cmsgDataAlign(8).toUInt() + length
}

public fun cmsgFirsthdr(mhdr: Msghdr?): Cmsghdr? {
    return if (((mhdr!!.msgControllen).toInt()) < 8) {
        null
    } else {
        null
    }
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if ((cmsg == null)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsgHdrAlign(((cmsg).hashCode().toLong()).toInt() + cmsg.cmsgLen.toInt() + 8)
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + mhdr.msgControllen.toInt()
    return if (next > max) {
        null
    } else {
        null
    }
}

public fun cmsgSpace(length: CUint): CUint {
    return cmsgHdrAlign(8 + length.toInt()).toUInt()
}

public fun fdClr(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd
    set!!.fdsBits[fd1 / bits] = set.fdsBits[fd1 / bits] and (1L shl (fd1 % bits)).inv()
    return
}

public fun fdIsset(fd: CInt, set: FdSet?): Boolean {
    val bits = 8 * 8
    val fd1 = fd
    return (set!!.fdsBits[fd1 / bits] and (1L shl (fd1 % bits))) != 0L
}

public fun fdSet(fd: CInt, set: FdSet?) {
    val bits = 8 * 8
    val fd1 = fd
    set!!.fdsBits[fd1 / bits] = set.fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    return
}

public fun fdZero(set: FdSet?) {
    for (idx in (set!!.fdsBits).indices) {
        (set.fdsBits)[idx] = 0L
    }
}

public fun sigrtmax(): CInt {
    return sysconf(SC_SIGRT_MAX).toInt()
}

public fun sigrtmin(): CInt {
    return sysconf(SC_SIGRT_MIN).toInt()
}

public fun wifexited(status: CInt): Boolean {
    return (status and 0xFF) == 0
}

public fun wexitstatus(status: CInt): CInt {
    return (status shr 8) and 0xFF
}

public fun wtermsig(status: CInt): CInt {
    return status and 0x7F
}

public fun wifcontinued(status: CInt): Boolean {
    return (status and 0xffff) == 0xffff
}

public fun wstopsig(status: CInt): CInt {
    return (status and 0xff00) shr 8
}

public fun wifsignaled(status: CInt): Boolean {
    return ((status and 0xff) > 0) && (status and 0xff00 == 0)
}

public fun wifstopped(status: CInt): Boolean {
    return ((status and 0xff) == 0x7f) && ((status and 0xff00) != 0)
}

public fun wcoredump(status: CInt): Boolean {
    return (status and 0x80) != 0
}

public fun mrGetType(flags: CUint): CUint {
    return flags and 0x0000ffffu
}

public expect fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt

public expect fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun abs(i: CInt): CInt

public expect fun acct(filename: String?): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun getifaddrs(ifap: COpaquePointer?): CInt

public expect fun freeifaddrs(ifa: COpaquePointer?)

public expect fun stackGetbounds(sp: COpaquePointer?): CInt

public expect fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt

public expect fun initgroups(name: String?, basegid: GidT): CInt

public expect fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt

public expect fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun errno(): COpaquePointer?

public expect fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt

public expect fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): COpaquePointer?

public expect fun fdatasync(fd: CInt): CInt

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer?

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun getprogname(): COpaquePointer?

public expect fun setprogname(name: String?)

public expect fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt

public expect fun getpriority(which: CInt, who: CInt): CInt

public expect fun setpriority(which: CInt, who: CInt, prio: CInt): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun sethostname(name: String?, len: CInt): CInt

public expect fun ifNameindex(): COpaquePointer?

public expect fun ifFreenameindex(ptr: COpaquePointer?)

public expect fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt

public expect fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt

public expect fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt

public expect fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt

public expect fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt

public expect fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun pthreadGetnameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadSetnameNp(tid: PthreadT, name: String?): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt

public expect fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt

public expect fun globfree(pglob: COpaquePointer?)

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt

public expect fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt

public expect fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt

public expect fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt

public expect fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: String?): CInt

public expect fun seekdir(dirp: DIR?, loc: CLong)

public expect fun telldir(dirp: DIR?): CLong

public expect fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt

public expect fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT

public expect fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt

public expect fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt

public expect fun futimens(dirfd: CInt, times: COpaquePointer?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun nlLanginfo(item: NlItem): COpaquePointer?

public expect fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT

public expect fun accept4(fd: CInt, address: COpaquePointer?, addressLen: COpaquePointer?, flags: CInt): CInt

public expect fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: String?): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt

public expect fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt

public expect fun portCreate(): CInt

public expect fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt

public expect fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt

public expect fun portGet(port: CInt, pe: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun portGetn(port: CInt, peList: COpaquePointer?, max: CUint, nget: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt

public expect fun portSendn(portList: COpaquePointer?, errorList: COpaquePointer?, nent: CUint, events: CInt, user: COpaquePointer?): CInt

public expect fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt

public expect fun sigsuspend(mask: COpaquePointer?): CInt

public expect fun semClose(sem: COpaquePointer?): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun thrSelf(): ThreadT

public expect fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt

public expect fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer?

public expect fun getgrnam(name: String?): COpaquePointer?

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt

public expect fun semUnlink(name: String?): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun nativeGetpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer?

public expect fun nativeGetgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer?

public expect fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): COpaquePointer?

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): COpaquePointer?

public expect fun popen(command: String?, mode: String?): FILE?

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun uname(buf: COpaquePointer?): CInt

public expect fun pipe2(fds: COpaquePointer?, flags: CInt): CInt

public expect fun makeutx(ux: COpaquePointer?): COpaquePointer?

public expect fun modutx(ux: COpaquePointer?): COpaquePointer?

public expect fun updwtmpx(file: String?, ut: COpaquePointer?)

public expect fun utmpxname(file: String?): CInt

public expect fun getutxent(): COpaquePointer?

public expect fun getutxid(ut: COpaquePointer?): COpaquePointer?

public expect fun getutxline(ut: COpaquePointer?): COpaquePointer?

public expect fun pututxline(ut: COpaquePointer?): COpaquePointer?

public expect fun setutxent()

public expect fun endutxent()

public expect fun endutent()

public expect fun getutent(): COpaquePointer?

public expect fun getutid(u: COpaquePointer?): COpaquePointer?

public expect fun getutline(u: COpaquePointer?): COpaquePointer?

public expect fun pututline(u: COpaquePointer?): COpaquePointer?

public expect fun setutent()

public expect fun utmpname(file: String?): CInt

public expect fun getutmp(ux: COpaquePointer?, u: COpaquePointer?)

public expect fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?)

public expect fun updwtmp(file: String?, u: COpaquePointer?)

public expect fun ntpAdjtime(buf: COpaquePointer?): CInt

public expect fun ntpGettime(buf: COpaquePointer?): CInt

public expect fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt

public expect fun ucredGet(pid: PidT): COpaquePointer?

public expect fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt

public expect fun ucredFree(ucred: COpaquePointer?)

public expect fun ucredGeteuid(ucred: COpaquePointer?): UidT

public expect fun ucredGetruid(ucred: COpaquePointer?): UidT

public expect fun ucredGetsuid(ucred: COpaquePointer?): UidT

public expect fun ucredGetegid(ucred: COpaquePointer?): GidT

public expect fun ucredGetrgid(ucred: COpaquePointer?): GidT

public expect fun ucredGetsgid(ucred: COpaquePointer?): GidT

public expect fun ucredGetgroups(ucred: COpaquePointer?, groups: COpaquePointer?): CInt

public expect fun ucredGetpid(ucred: COpaquePointer?): PidT

public expect fun ucredGetprojid(ucred: COpaquePointer?): ProjidT

public expect fun ucredGetzoneid(ucred: COpaquePointer?): ZoneidT

public expect fun ucredGetpflags(ucred: COpaquePointer?, flags: CUint): CUint

public expect fun ucredSize(): SizeT

public expect fun psetCreate(newpset: COpaquePointer?): CInt

public expect fun psetDestroy(pset: PsetidT): CInt

public expect fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: COpaquePointer?): CInt

public expect fun psetInfo(pset: PsetidT, tpe: COpaquePointer?, numcpus: COpaquePointer?, cpulist: COpaquePointer?): CInt

public expect fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: COpaquePointer?): CInt

public expect fun psetList(pset: COpaquePointer?, numpsets: COpaquePointer?): CInt

public expect fun psetSetattr(pset: PsetidT, attr: CUint): CInt

public expect fun psetGetattr(pset: PsetidT, attr: COpaquePointer?): CInt

public expect fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: COpaquePointer?): CInt

public expect fun pOnline(processorid: ProcessoridT, flag: CInt): CInt

public expect fun processorInfo(processorid: ProcessoridT, infop: COpaquePointer?): CInt

public expect fun getexecname(): COpaquePointer?

public expect fun gethostid(): CLong

public expect fun getpflags(flags: CUint): CUint

public expect fun setpflags(flags: CUint, value: CUint): CInt

public expect fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt

public expect fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt

// #include <link.h>
public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt

public expect fun getpagesize(): CInt

public expect fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt

public expect fun mmapobj(fd: CInt, flags: CUint, storage: COpaquePointer?, elements: COpaquePointer?, arg: COpaquePointer?): CInt

public expect fun meminfo(inaddr: COpaquePointer?, addrCount: CInt, infoReq: COpaquePointer?, infoCount: CInt, outdata: COpaquePointer?, validity: COpaquePointer?): CInt

public expect fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer?

public expect fun getisax(array: COpaquePointer?, n: CUint): CUint

public expect fun backtrace(buffer: COpaquePointer?, size: CInt): CInt

public expect fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer?

public expect fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt)

public expect fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt

public expect fun sync()

public expect fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioError(aiocbp: COpaquePointer?): CInt

public expect fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioRead(aiocbp: COpaquePointer?): CInt

public expect fun aioReturn(aiocbp: COpaquePointer?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt

public expect fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun aioWrite(aiocbp: COpaquePointer?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt

public expect fun major(version: CInt, devnum: DevT): MajorT

public expect fun minor(version: CInt, devnum: DevT): MinorT

public expect fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT

public expect fun arc4random(): UInt

public expect fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT)

public expect fun arc4randomUniform(upperBound: UInt): UInt

public expect fun secureGetenv(name: String?): COpaquePointer?

public expect fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT

public expect fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, loc: LocaleT): SizeT

public expect fun sendfile(outFd: CInt, inFd: CInt, off: COpaquePointer?, len: SizeT): SsizeT

public expect fun sendfilev(fildes: CInt, vec: COpaquePointer?, sfvcnt: CInt, xferred: COpaquePointer?): SsizeT

public expect fun lgrpInit(view: LgrpViewT): LgrpCookieT

public expect fun lgrpFini(cookie: LgrpCookieT): CInt

public expect fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT

public expect fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt

public expect fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: COpaquePointer?, count: CUint, content: LgrpContentT): CInt

public expect fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT

public expect fun lgrpNlgrps(cookie: LgrpCookieT): CInt

public expect fun lgrpView(cookie: LgrpCookieT): LgrpViewT

public expect fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT

public expect fun lgrpVersion(version: CInt): CInt

public expect fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: COpaquePointer?, count: CUint, tpe: LgrpRsrcT): CInt

public expect fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT

public fun major(device: DevT): MajorT {
    return major(NEWDEV, device)
}

public fun minor(device: DevT): MinorT {
    return minor(NEWDEV, device)
}

public fun makedev(maj: MajorT, min: MinorT): DevT {
    return makedev(NEWDEV, maj, min)
}
