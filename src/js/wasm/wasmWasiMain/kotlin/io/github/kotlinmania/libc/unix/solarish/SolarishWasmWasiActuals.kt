@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish

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

public actual fun getrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit(resource: CInt, rlim: COpaquePointer?): CInt =
    0

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun abs(i: CInt): CInt =
    0

public actual fun acct(filename: String?): CInt =
    0

public actual fun dirfd(dirp: DIR?): CInt =
    0

public actual fun labs(i: CLong): CLong =
    0L

public actual fun rand(): CInt =
    0

public actual fun srand(seed: CUint) {
}

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    0L

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun settimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    0

public actual fun freeifaddrs(ifa: COpaquePointer?) {
}

public actual fun stackGetbounds(sp: COpaquePointer?): CInt =
    0

public actual fun getgrouplist(name: String?, basegid: GidT, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    0

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    0

public actual fun setgroups(ngroups: CInt, ptr: COpaquePointer?): CInt =
    0

public actual fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun errno(): COpaquePointer? =
    null

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    0

public actual fun clockSettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    0

public actual fun setpwent() {
}

public actual fun endpwent() {
}

public actual fun getpwent(): COpaquePointer? =
    null

public actual fun fdatasync(fd: CInt): CInt =
    0

public actual fun nlLanginfoL(item: NlItem, locale: LocaleT): COpaquePointer? =
    null

public actual fun duplocale(base: LocaleT): LocaleT =
    null

public actual fun freelocale(loc: LocaleT) {
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    null

public actual fun uselocale(loc: LocaleT): LocaleT =
    null

public actual fun getprogname(): COpaquePointer? =
    null

public actual fun setprogname(name: String?) {
}

public actual fun getloadavg(loadavg: COpaquePointer?, nelem: CInt): CInt =
    0

public actual fun getpriority(which: CInt, who: CInt): CInt =
    0

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    0

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    0

public actual fun sethostname(name: String?, len: CInt): CInt =
    0

public actual fun ifNameindex(): COpaquePointer? =
    null

public actual fun ifFreenameindex(ptr: COpaquePointer?) {
}

public actual fun pthreadCreate(native: COpaquePointer?, attr: COpaquePointer?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetstack(attr: COpaquePointer?, stackaddr: COpaquePointer?, stacksize: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrGetclock(attr: COpaquePointer?, clockId: COpaquePointer?): CInt =
    0

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): CInt =
    0

public actual fun semTimedwait(sem: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun semGetvalue(sem: COpaquePointer?, sval: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexTimedlock(lock: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun pthreadGetnameNp(tid: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun pthreadSetnameNp(tid: PthreadT, name: String?): CInt =
    0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    0

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: COpaquePointer?): CInt =
    0

public actual fun globfree(pglob: COpaquePointer?) {
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    0

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt =
    0

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt =
    0

public actual fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt =
    0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    0

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    0

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    null

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    0

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    0

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun shmUnlink(name: String?): CInt =
    0

public actual fun seekdir(dirp: DIR?, loc: CLong) {
}

public actual fun telldir(dirp: DIR?): CLong =
    0L

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: COpaquePointer?, addrlen: COpaquePointer?): SsizeT =
    0L

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    0

public actual fun futimesat(fd: CInt, path: String?, times: COpaquePointer?): CInt =
    0

public actual fun futimens(dirfd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun nlLanginfo(item: NlItem): COpaquePointer? =
    null

public actual fun bind(socket: CInt, address: COpaquePointer?, addressLen: SocklenT): CInt =
    0

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun readv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun sendmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun recvmsg(fd: CInt, msg: COpaquePointer?, flags: CInt): SsizeT =
    0L

public actual fun accept4(fd: CInt, address: COpaquePointer?, addressLen: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun mqOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): MqdT =
    null

public actual fun mqClose(mqd: MqdT): CInt =
    0

public actual fun mqUnlink(name: String?): CInt =
    0

public actual fun mqReceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?): SsizeT =
    0L

public actual fun mqTimedreceive(mqd: MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: COpaquePointer?, absTimeout: COpaquePointer?): SsizeT =
    0L

public actual fun mqSend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    0

public actual fun mqTimedsend(mqd: MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: COpaquePointer?): CInt =
    0

public actual fun mqGetattr(mqd: MqdT, attr: COpaquePointer?): CInt =
    0

public actual fun mqSetattr(mqd: MqdT, newattr: COpaquePointer?, oldattr: COpaquePointer?): CInt =
    0

public actual fun portCreate(): CInt =
    0

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt =
    0

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    0

public actual fun portGet(port: CInt, pe: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun portGetn(port: CInt, peList: COpaquePointer?, max: CUint, nget: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt =
    0

public actual fun portSendn(portList: COpaquePointer?, errorList: COpaquePointer?, nent: CUint, events: CInt, user: COpaquePointer?): CInt =
    0

public actual fun getgrgidR(gid: GidT, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun sigaltstack(ss: COpaquePointer?, oss: COpaquePointer?): CInt =
    0

public actual fun sigsuspend(mask: COpaquePointer?): CInt =
    0

public actual fun semClose(sem: COpaquePointer?): CInt =
    0

public actual fun getdtablesize(): CInt =
    0

public actual fun getgrnamR(name: String?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun thrSelf(): ThreadT =
    0u

public actual fun pthreadSigmask(how: CInt, set: COpaquePointer?, oldset: COpaquePointer?): CInt =
    0

public actual fun semOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun getgrnam(name: String?): COpaquePointer? =
    null

public actual fun pthreadKill(thread: PthreadT, sig: CInt): CInt =
    0

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    0

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    0

public actual fun schedGetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun schedSetparam(pid: PidT, param: COpaquePointer?): CInt =
    0

public actual fun schedGetscheduler(pid: PidT): CInt =
    0

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: COpaquePointer?): CInt =
    0

public actual fun semUnlink(name: String?): CInt =
    0

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    0

public actual fun getpwnamR(name: String?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getpwuidR(uid: UidT, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun nativeGetpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    null

public actual fun nativeGetgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    null

public actual fun sigwait(set: COpaquePointer?, sig: COpaquePointer?): CInt =
    0

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    0

public actual fun getgrgid(gid: GidT): COpaquePointer? =
    null

public actual fun setgrent() {
}

public actual fun endgrent() {
}

public actual fun getgrent(): COpaquePointer? =
    null

public actual fun popen(command: String?, mode: String?): FILE? =
    null

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    0

public actual fun uname(buf: COpaquePointer?): CInt =
    0

public actual fun pipe2(fds: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun makeutx(ux: COpaquePointer?): COpaquePointer? =
    null

public actual fun modutx(ux: COpaquePointer?): COpaquePointer? =
    null

public actual fun updwtmpx(file: String?, ut: COpaquePointer?) {
}

public actual fun utmpxname(file: String?): CInt =
    0

public actual fun getutxent(): COpaquePointer? =
    null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun setutxent() {
}

public actual fun endutxent() {
}

public actual fun endutent() {
}

public actual fun getutent(): COpaquePointer? =
    null

public actual fun getutid(u: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutline(u: COpaquePointer?): COpaquePointer? =
    null

public actual fun pututline(u: COpaquePointer?): COpaquePointer? =
    null

public actual fun setutent() {
}

public actual fun utmpname(file: String?): CInt =
    0

public actual fun getutmp(ux: COpaquePointer?, u: COpaquePointer?) {
}

public actual fun getutmpx(u: COpaquePointer?, ux: COpaquePointer?) {
}

public actual fun updwtmp(file: String?, u: COpaquePointer?) {
}

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    0

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    0

public actual fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt =
    0

public actual fun timerDelete(timerid: TimerT): CInt =
    0

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    0

public actual fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt =
    0

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt =
    0

public actual fun ucredGet(pid: PidT): COpaquePointer? =
    null

public actual fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt =
    0

public actual fun ucredFree(ucred: COpaquePointer?) {
}

public actual fun ucredGeteuid(ucred: COpaquePointer?): UidT =
    0u

public actual fun ucredGetruid(ucred: COpaquePointer?): UidT =
    0u

public actual fun ucredGetsuid(ucred: COpaquePointer?): UidT =
    0u

public actual fun ucredGetegid(ucred: COpaquePointer?): GidT =
    0u

public actual fun ucredGetrgid(ucred: COpaquePointer?): GidT =
    0u

public actual fun ucredGetsgid(ucred: COpaquePointer?): GidT =
    0u

public actual fun ucredGetgroups(ucred: COpaquePointer?, groups: COpaquePointer?): CInt =
    0

public actual fun ucredGetpid(ucred: COpaquePointer?): PidT =
    0

public actual fun ucredGetprojid(ucred: COpaquePointer?): ProjidT =
    0

public actual fun ucredGetzoneid(ucred: COpaquePointer?): ZoneidT =
    0

public actual fun ucredGetpflags(ucred: COpaquePointer?, flags: CUint): CUint =
    0u

public actual fun ucredSize(): SizeT =
    0uL

public actual fun psetCreate(newpset: COpaquePointer?): CInt =
    0

public actual fun psetDestroy(pset: PsetidT): CInt =
    0

public actual fun psetAssign(pset: PsetidT, cpu: ProcessoridT, opset: COpaquePointer?): CInt =
    0

public actual fun psetInfo(pset: PsetidT, tpe: COpaquePointer?, numcpus: COpaquePointer?, cpulist: COpaquePointer?): CInt =
    0

public actual fun psetBind(pset: PsetidT, idtype: IdtypeT, id: IdT, opset: COpaquePointer?): CInt =
    0

public actual fun psetList(pset: COpaquePointer?, numpsets: COpaquePointer?): CInt =
    0

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    0

public actual fun psetGetattr(pset: PsetidT, attr: COpaquePointer?): CInt =
    0

public actual fun processorBind(idtype: IdtypeT, id: IdT, newBinding: ProcessoridT, oldBinding: COpaquePointer?): CInt =
    0

public actual fun pOnline(processorid: ProcessoridT, flag: CInt): CInt =
    0

public actual fun processorInfo(processorid: ProcessoridT, infop: COpaquePointer?): CInt =
    0

public actual fun getexecname(): COpaquePointer? =
    null

public actual fun gethostid(): CLong =
    0L

public actual fun getpflags(flags: CUint): CUint =
    0u

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    0

public actual fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt =
    0

public actual fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt =
    0

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    0

public actual fun getpagesize(): CInt =
    0

public actual fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt =
    0

public actual fun mmapobj(fd: CInt, flags: CUint, storage: COpaquePointer?, elements: COpaquePointer?, arg: COpaquePointer?): CInt =
    0

public actual fun meminfo(inaddr: COpaquePointer?, addrCount: CInt, infoReq: COpaquePointer?, infoCount: CInt, outdata: COpaquePointer?, validity: COpaquePointer?): CInt =
    0

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    null

public actual fun getisax(array: COpaquePointer?, n: CUint): CUint =
    0u

public actual fun backtrace(buffer: COpaquePointer?, size: CInt): CInt =
    0

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? =
    null

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: COpaquePointer?, longindex: COpaquePointer?): CInt =
    0

public actual fun sync() {
}

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    0L

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    0

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    0

public actual fun major(version: CInt, devnum: DevT): MajorT =
    0u

public actual fun minor(version: CInt, devnum: DevT): MinorT =
    0u

public actual fun makedev(version: CInt, majdev: MajorT, mindev: MinorT): DevT =
    0uL

public actual fun arc4random(): UInt =
    0u

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    0u

public actual fun secureGetenv(name: String?): COpaquePointer? =
    null

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?): SizeT =
    0uL

public actual fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: COpaquePointer?, loc: LocaleT): SizeT =
    0uL

public actual fun sendfile(outFd: CInt, inFd: CInt, off: COpaquePointer?, len: SizeT): SsizeT =
    0L

public actual fun sendfilev(fildes: CInt, vec: COpaquePointer?, sfvcnt: CInt, xferred: COpaquePointer?): SsizeT =
    0L

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    0uL

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    0

public actual fun lgrpAffinityGet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT): LgrpAffinityT =
    0

public actual fun lgrpAffinitySet(idtype: IdtypeT, id: IdT, lgrp: LgrpIdT, aff: LgrpAffinityT): CInt =
    0

public actual fun lgrpCpus(cookie: LgrpCookieT, lgrp: LgrpIdT, cpuids: COpaquePointer?, count: CUint, content: LgrpContentT): CInt =
    0

public actual fun lgrpMemSize(cookie: LgrpCookieT, lgrp: LgrpIdT, tpe: LgrpMemSizeFlagT, content: LgrpContentT): LgrpMemSizeT =
    0L

public actual fun lgrpNlgrps(cookie: LgrpCookieT): CInt =
    0

public actual fun lgrpView(cookie: LgrpCookieT): LgrpViewT =
    0u

public actual fun lgrpHome(idtype: IdtypeT, id: IdT): LgrpIdT =
    0

public actual fun lgrpVersion(version: CInt): CInt =
    0

public actual fun lgrpResources(cookie: LgrpCookieT, lgrp: LgrpIdT, lgrps: COpaquePointer?, count: CUint, tpe: LgrpRsrcT): CInt =
    0

public actual fun lgrpRoot(cookie: LgrpCookieT): LgrpIdT =
    0
