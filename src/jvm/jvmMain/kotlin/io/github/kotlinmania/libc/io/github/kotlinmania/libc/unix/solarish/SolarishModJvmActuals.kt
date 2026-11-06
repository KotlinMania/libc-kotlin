package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.COpaquePointer

internal object SolarishModRawLibc {
    external fun getrlimit(resource: Int, rlim: Long): Int
    external fun setrlimit(resource: Int, rlim: Long): Int
    external fun strerrorR(errnum: Int, buf: Long, buflen: Long): Int
    external fun semDestroy(sem: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun abs(i: Int): Int
    external fun acct(filename: String?): Int
    external fun dirfd(dirp: Long): Int
    external fun labs(i: Long): Long
    external fun rand(): Int
    external fun srand(seed: Int)
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun getrandom(bbuf: Long, buflen: Long, flags: Int): Long
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun settimeofday(tp: Long, tz: Long): Int
    external fun getifaddrs(ifap: Long): Int
    external fun freeifaddrs(ifa: Long)
    external fun stackGetbounds(sp: Long): Int
    external fun getgrouplist(name: String?, basegid: Int, groups: Long, ngroups: Long): Int
    external fun initgroups(name: String?, basegid: Int): Int
    external fun setgroups(ngroups: Int, ptr: Long): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun errno(): Long?
    external fun clockGetres(clkId: Long, tp: Long): Int
    external fun clockGettime(clkId: Long, tp: Long): Int
    external fun clockNanosleep(clkId: Long, flags: Int, rqtp: Long, rmtp: Long): Int
    external fun clockSettime(clkId: Long, tp: Long): Int
    external fun getnameinfo(sa: Long, salen: Long, host: Long, hostlen: Long, serv: Long, servlen: Long, flags: Int): Int
    external fun setpwent()
    external fun endpwent()
    external fun getpwent(): Long?
    external fun fdatasync(fd: Int): Int
    external fun nlLanginfoL(item: Long, locale: Long): Long?
    external fun duplocale(base: Long): Long
    external fun freelocale(loc: Long)
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun uselocale(loc: Long): Long
    external fun getprogname(): Long?
    external fun setprogname(name: String?)
    external fun getloadavg(loadavg: Long, nelem: Int): Int
    external fun getpriority(which: Int, who: Int): Int
    external fun setpriority(which: Int, who: Int, prio: Int): Int
    external fun mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun sethostname(name: String?, len: Int): Int
    external fun ifNameindex(): Long?
    external fun ifFreenameindex(ptr: Long)
    external fun pthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int
    external fun pthreadAttrGetstack(attr: Long, stackaddr: Long, stacksize: Long): Int
    external fun pthreadCondattrGetclock(attr: Long, clockId: Long): Int
    external fun pthreadCondattrSetclock(attr: Long, clockId: Long): Int
    external fun semTimedwait(sem: Long, abstime: Long): Int
    external fun semGetvalue(sem: Long, sval: Long): Int
    external fun pthreadMutexTimedlock(lock: Long, abstime: Long): Int
    external fun pthreadGetnameNp(tid: Long, name: Long, len: Long): Int
    external fun pthreadSetnameNp(tid: Long, name: String?): Int
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun glob(pattern: String?, flags: Int, errfunc: Long, pglob: Long): Int
    external fun globfree(pglob: Long)
    external fun posixFallocate(fd: Int, offset: Long, len: Long): Int
    external fun posixMadvise(addr: Long, len: Long, advice: Int): Int
    external fun posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnFileActionsInit(fileActions: Long): Int
    external fun posixSpawnFileActionsDestroy(fileActions: Long): Int
    external fun posixSpawnFileActionsAddopen(fileActions: Long, fildes: Int, path: String?, oflag: Int, mode: Int): Int
    external fun posixSpawnFileActionsAddclose(fileActions: Long, fildes: Int): Int
    external fun posixSpawnFileActionsAdddup2(fileActions: Long, fildes: Int, newfildes: Int): Int
    external fun posixSpawnFileActionsAddclosefromNp(fileActions: Long, lowfiledes: Int): Int
    external fun posixSpawnFileActionsAddchdir(fileActions: Long, path: String?): Int
    external fun posixSpawnFileActionsAddchdirNp(fileActions: Long, path: String?): Int
    external fun posixSpawnFileActionsAddfchdir(fileActions: Long, fd: Int): Int
    external fun posixSpawnattrInit(attr: Long): Int
    external fun posixSpawnattrDestroy(attr: Long): Int
    external fun posixSpawnattrSetflags(attr: Long, flags: Short): Int
    external fun posixSpawnattrGetflags(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetpgroup(attr: Long, pgroup: Int): Int
    external fun posixSpawnattrGetpgroup(attr: Long, pgroup: Long): Int
    external fun posixSpawnattrSetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnattrGetschedparam(attr: Long, param: Long): Int
    external fun posixSpawnattrSetschedpolicy(attr: Long, policy: Int): Int
    external fun posixSpawnattrGetschedpolicy(attr: Long, policy: Long): Int
    external fun posixSpawnattrSetsigdefault(attr: Long, sigdefault: Long): Int
    external fun posixSpawnattrGetsigdefault(attr: Long, sigdefault: Long): Int
    external fun posixSpawnattrSetsigignoreNp(attr: Long, sigignore: Long): Int
    external fun posixSpawnattrGetsigignoreNp(attr: Long, sigignore: Long): Int
    external fun posixSpawnattrSetsigmask(attr: Long, sigmask: Long): Int
    external fun posixSpawnattrGetsigmask(attr: Long, sigmask: Long): Int
    external fun shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long?
    external fun shmctl(shmid: Int, cmd: Int, buf: Long): Int
    external fun shmdt(shmaddr: Long): Int
    external fun shmget(key: Long, size: Long, shmflg: Int): Int
    external fun shmOpen(name: String?, oflag: Int, mode: Int): Int
    external fun shmUnlink(name: String?): Int
    external fun seekdir(dirp: Long, loc: Long)
    external fun telldir(dirp: Long): Long
    external fun madvise(addr: Long, len: Long, advice: Int): Int
    external fun msync(addr: Long, len: Long, flags: Int): Int
    external fun memalign(align: Long, size: Long): Long?
    external fun recvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Long
    external fun mkstemps(template: Long, suffixlen: Int): Int
    external fun futimesat(fd: Int, path: String?, times: Long): Int
    external fun futimens(dirfd: Int, times: Long): Int
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun nlLanginfo(item: Long): Long?
    external fun bind(socket: Int, address: Long, addressLen: Long): Int
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun readv(fd: Int, iov: Long, iovcnt: Int): Long
    external fun sendmsg(fd: Int, msg: Long, flags: Int): Long
    external fun recvmsg(fd: Int, msg: Long, flags: Int): Long
    external fun accept4(fd: Int, address: Long, addressLen: Long, flags: Int): Int
    external fun mqClose(mqd: Long): Int
    external fun mqUnlink(name: String?): Int
    external fun mqReceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long): Long
    external fun mqTimedreceive(mqd: Long, msgPtr: Long, msgLen: Long, msgPrio: Long, absTimeout: Long): Long
    external fun mqSend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int): Int
    external fun mqTimedsend(mqd: Long, msgPtr: String?, msgLen: Long, msgPrio: Int, absTimeout: Long): Int
    external fun mqGetattr(mqd: Long, attr: Long): Int
    external fun mqSetattr(mqd: Long, newattr: Long, oldattr: Long): Int
    external fun portCreate(): Int
    external fun portAssociate(port: Int, source: Int, obj: Long, events: Int, user: Long): Int
    external fun portDissociate(port: Int, source: Int, obj: Long): Int
    external fun portGet(port: Int, pe: Long, timeout: Long): Int
    external fun portGetn(port: Int, peList: Long, max: Int, nget: Long, timeout: Long): Int
    external fun portSend(port: Int, events: Int, user: Long): Int
    external fun portSendn(portList: Long, errorList: Long, nent: Int, events: Int, user: Long): Int
    external fun getgrgidR(gid: Int, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun sigaltstack(ss: Long, oss: Long): Int
    external fun sigsuspend(mask: Long): Int
    external fun semClose(sem: Long): Int
    external fun getdtablesize(): Int
    external fun getgrnamR(name: String?, grp: Long, buf: Long, buflen: Long, result: Long): Int
    external fun thrSelf(): Long
    external fun pthreadSigmask(how: Int, set: Long, oldset: Long): Int
    external fun getgrnam(name: String?): Long?
    external fun pthreadKill(thread: Long, sig: Int): Int
    external fun schedGetPriorityMin(policy: Int): Int
    external fun schedGetPriorityMax(policy: Int): Int
    external fun schedGetparam(pid: Int, param: Long): Int
    external fun schedSetparam(pid: Int, param: Long): Int
    external fun schedGetscheduler(pid: Int): Int
    external fun schedSetscheduler(pid: Int, policy: Int, param: Long): Int
    external fun semUnlink(name: String?): Int
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun getpwnamR(name: String?, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun getpwuidR(uid: Int, pwd: Long, buf: Long, buflen: Long, result: Long): Int
    external fun nativeGetpwentR(pwd: Long, buf: Long, buflen: Int): Long?
    external fun nativeGetgrentR(grp: Long, buf: Long, buflen: Int): Long?
    external fun sigwait(set: Long, sig: Long): Int
    external fun pthreadAtfork(prepare: Long, parent: Long, child: Long): Int
    external fun getgrgid(gid: Int): Long?
    external fun setgrent()
    external fun endgrent()
    external fun getgrent(): Long?
    external fun popen(command: String?, mode: String?): Long?
    external fun dup3(src: Int, dst: Int, flags: Int): Int
    external fun uname(buf: Long): Int
    external fun pipe2(fds: Long, flags: Int): Int
    external fun makeutx(ux: Long): Long?
    external fun modutx(ux: Long): Long?
    external fun updwtmpx(file: String?, ut: Long)
    external fun utmpxname(file: String?): Int
    external fun getutxent(): Long?
    external fun getutxid(ut: Long): Long?
    external fun getutxline(ut: Long): Long?
    external fun pututxline(ut: Long): Long?
    external fun setutxent()
    external fun endutxent()
    external fun endutent()
    external fun getutent(): Long?
    external fun getutid(u: Long): Long?
    external fun getutline(u: Long): Long?
    external fun pututline(u: Long): Long?
    external fun setutent()
    external fun utmpname(file: String?): Int
    external fun getutmp(ux: Long, u: Long)
    external fun getutmpx(u: Long, ux: Long)
    external fun updwtmp(file: String?, u: Long)
    external fun ntpAdjtime(buf: Long): Int
    external fun ntpGettime(buf: Long): Int
    external fun timerCreate(clockId: Int, evp: Long, timerid: Long): Int
    external fun timerDelete(timerid: Long): Int
    external fun timerGetoverrun(timerid: Long): Int
    external fun timerGettime(timerid: Long, value: Long): Int
    external fun timerSettime(timerid: Long, flags: Int, value: Long, ovalue: Long): Int
    external fun ucredGet(pid: Int): Long?
    external fun getpeerucred(fd: Int, ucred: Long): Int
    external fun ucredFree(ucred: Long)
    external fun ucredGeteuid(ucred: Long): Int
    external fun ucredGetruid(ucred: Long): Int
    external fun ucredGetsuid(ucred: Long): Int
    external fun ucredGetegid(ucred: Long): Int
    external fun ucredGetrgid(ucred: Long): Int
    external fun ucredGetsgid(ucred: Long): Int
    external fun ucredGetgroups(ucred: Long, groups: Long): Int
    external fun ucredGetpid(ucred: Long): Int
    external fun ucredGetprojid(ucred: Long): Long
    external fun ucredGetzoneid(ucred: Long): Long
    external fun ucredGetpflags(ucred: Long, flags: Int): Int
    external fun ucredSize(): Long
    external fun psetCreate(newpset: Long): Int
    external fun psetDestroy(pset: Long): Int
    external fun psetAssign(pset: Long, cpu: Long, opset: Long): Int
    external fun psetInfo(pset: Long, tpe: Long, numcpus: Long, cpulist: Long): Int
    external fun psetBind(pset: Long, idtype: Long, id: Long, opset: Long): Int
    external fun psetList(pset: Long, numpsets: Long): Int
    external fun psetSetattr(pset: Long, attr: Int): Int
    external fun psetGetattr(pset: Long, attr: Long): Int
    external fun processorBind(idtype: Long, id: Long, newBinding: Long, oldBinding: Long): Int
    external fun pOnline(processorid: Long, flag: Int): Int
    external fun processorInfo(processorid: Long, infop: Long): Int
    external fun getexecname(): Long?
    external fun gethostid(): Long
    external fun getpflags(flags: Int): Int
    external fun setpflags(flags: Int, value: Int): Int
    external fun sysinfo(command: Int, buf: Long, count: Long): Int
    external fun faccessat(fd: Int, path: String?, amode: Int, flag: Int): Int
    external fun dlIteratePhdr(callback: Long, data: Long): Int
    external fun getpagesize(): Int
    external fun getpagesizes(pagesize: Long, nelem: Int): Int
    external fun mmapobj(fd: Int, flags: Int, storage: Long, elements: Long, arg: Long): Int
    external fun meminfo(inaddr: Long, addrCount: Int, infoReq: Long, infoCount: Int, outdata: Long, validity: Long): Int
    external fun strsep(string: Long, delim: String?): Long?
    external fun getisax(array: Long, n: Int): Int
    external fun backtrace(buffer: Long, size: Int): Int
    external fun backtraceSymbols(buffer: Long, size: Int): Long?
    external fun backtraceSymbolsFd(buffer: Long, size: Int, fd: Int)
    external fun getoptLong(argc: Int, argv: Long, optstring: String?, longopts: Long, longindex: Long): Int
    external fun sync()
    external fun aioCancel(fd: Int, aiocbp: Long): Int
    external fun aioError(aiocbp: Long): Int
    external fun aioFsync(op: Int, aiocbp: Long): Int
    external fun aioRead(aiocbp: Long): Int
    external fun aioReturn(aiocbp: Long): Long
    external fun aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int
    external fun aioWaitn(aiocbList: Long, nent: Int, nwait: Long, timeout: Long): Int
    external fun aioWrite(aiocbp: Long): Int
    external fun lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int
    external fun major(version: Int, devnum: Long): Long
    external fun minor(version: Int, devnum: Long): Long
    external fun makedev(version: Int, majdev: Long, mindev: Long): Long
    external fun arc4random(): Int
    external fun arc4randomBuf(buf: Long, nbytes: Long)
    external fun arc4randomUniform(upperBound: Int): Int
    external fun secureGetenv(name: String?): Long?
    external fun strftime(s: Long, maxsize: Long, format: String?, timeptr: Long): Long
    external fun strftimeL(s: Long, maxsize: Long, format: String?, timeptr: Long, loc: Long): Long
    external fun sendfile(outFd: Int, inFd: Int, off: Long, len: Long): Long
    external fun sendfilev(fildes: Int, vec: Long, sfvcnt: Int, xferred: Long): Long
    external fun lgrpInit(view: Long): Long
    external fun lgrpFini(cookie: Long): Int
    external fun lgrpAffinityGet(idtype: Long, id: Long, lgrp: Long): Long
    external fun lgrpAffinitySet(idtype: Long, id: Long, lgrp: Long, aff: Long): Int
    external fun lgrpCpus(cookie: Long, lgrp: Long, cpuids: Long, count: Int, content: Long): Int
    external fun lgrpMemSize(cookie: Long, lgrp: Long, tpe: Long, content: Long): Long
    external fun lgrpNlgrps(cookie: Long): Int
    external fun lgrpView(cookie: Long): Long
    external fun lgrpHome(idtype: Long, id: Long): Long
    external fun lgrpVersion(version: Int): Int
    external fun lgrpResources(cookie: Long, lgrp: Long, lgrps: Long, count: Int, tpe: Long): Int
    external fun lgrpRoot(cookie: Long): Long
}

public actual fun getrlimit(resource: CInt, rlim: Rlimit?): CInt =
    SolarishModRawLibc.getrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun setrlimit(resource: CInt, rlim: Rlimit?): CInt =
    SolarishModRawLibc.setrlimit(resource, rlim?.toLong() ?: 0L)

public actual fun strerrorR(errnum: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    SolarishModRawLibc.strerrorR(errnum, buf?.value ?: 0L, buflen)

public actual fun semDestroy(sem: SemT?): CInt =
    SolarishModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semInit(sem: SemT?, pshared: CInt, value: CUint): CInt =
    SolarishModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun abs(i: CInt): CInt =
    SolarishModRawLibc.abs(i)

public actual fun acct(filename: String?): CInt =
    SolarishModRawLibc.acct(filename)

public actual fun dirfd(dirp: DIR?): CInt =
    SolarishModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun labs(i: CLong): CLong =
    SolarishModRawLibc.labs(i)

public actual fun rand(): CInt =
    SolarishModRawLibc.rand()

public actual fun srand(seed: CUint) {
    SolarishModRawLibc.srand(seed)
}

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    SolarishModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun getrandom(bbuf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    SolarishModRawLibc.getrandom(bbuf?.value ?: 0L, buflen, flags)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    SolarishModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun settimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    SolarishModRawLibc.settimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun getifaddrs(ifap: COpaquePointer?): CInt =
    SolarishModRawLibc.getifaddrs(ifap?.value ?: 0L)

public actual fun freeifaddrs(ifa: io.github.kotlinmania.libc.Ifaddrs?) {
    SolarishModRawLibc.freeifaddrs(ifa?.toLong() ?: 0L)
}

public actual fun stackGetbounds(sp: io.github.kotlinmania.libc.StackT?): CInt =
    SolarishModRawLibc.stackGetbounds(sp?.toLong() ?: 0L)

public actual fun getgrouplist(name: String?, basegid: GidT, groups: GidT?, ngroups: CInt?): CInt =
    SolarishModRawLibc.getgrouplist(name, basegid, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun initgroups(name: String?, basegid: GidT): CInt =
    SolarishModRawLibc.initgroups(name, basegid)

public actual fun setgroups(ngroups: CInt, ptr: GidT?): CInt =
    SolarishModRawLibc.setgroups(ngroups, ptr?.toLong() ?: 0L)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    SolarishModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun errno(): CInt? =
    SolarishModRawLibc.errno()

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    SolarishModRawLibc.clockGetres(clkId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    SolarishModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun clockNanosleep(clkId: io.github.kotlinmania.libc.ClockidT, flags: CInt, rqtp: Timespec?, rmtp: Timespec?): CInt =
    SolarishModRawLibc.clockNanosleep(clkId, flags, rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)

public actual fun clockSettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    SolarishModRawLibc.clockSettime(clkId, tp?.toLong() ?: 0L)

public actual fun getnameinfo(sa: io.github.kotlinmania.libc.Sockaddr?, salen: io.github.kotlinmania.libc.SocklenT, host: COpaquePointer?, hostlen: io.github.kotlinmania.libc.SocklenT, serv: COpaquePointer?, servlen: io.github.kotlinmania.libc.SocklenT, flags: CInt): CInt =
    SolarishModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun setpwent() {
    SolarishModRawLibc.setpwent()
}

public actual fun endpwent() {
    SolarishModRawLibc.endpwent()
}

public actual fun getpwent(): Passwd? =
    SolarishModRawLibc.getpwent()

public actual fun fdatasync(fd: CInt): CInt =
    SolarishModRawLibc.fdatasync(fd)

public actual fun nlLanginfoL(item: io.github.kotlinmania.libc.NlItem, locale: LocaleT): COpaquePointer? =
    SolarishModRawLibc.nlLanginfoL(item, locale).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun duplocale(base: LocaleT): LocaleT =
    SolarishModRawLibc.duplocale(base)

public actual fun freelocale(loc: LocaleT) {
    SolarishModRawLibc.freelocale(loc)
}

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    SolarishModRawLibc.newlocale(mask, locale, base)

public actual fun uselocale(loc: LocaleT): LocaleT =
    SolarishModRawLibc.uselocale(loc)

public actual fun getprogname(): COpaquePointer? =
    SolarishModRawLibc.getprogname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setprogname(name: String?) {
    SolarishModRawLibc.setprogname(name)
}

public actual fun getloadavg(loadavg: CDouble?, nelem: CInt): CInt =
    SolarishModRawLibc.getloadavg(loadavg?.toLong() ?: 0L, nelem)

public actual fun getpriority(which: CInt, who: CInt): CInt =
    SolarishModRawLibc.getpriority(which, who)

public actual fun setpriority(which: CInt, who: CInt, prio: CInt): CInt =
    SolarishModRawLibc.setpriority(which, who, prio)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    SolarishModRawLibc.mknodat(dirfd, pathname, mode, dev)

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    SolarishModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun sethostname(name: String?, len: CInt): CInt =
    SolarishModRawLibc.sethostname(name, len)

public actual fun ifNameindex(): IfNameindex? =
    SolarishModRawLibc.ifNameindex()

public actual fun ifFreenameindex(ptr: IfNameindex?) {
    SolarishModRawLibc.ifFreenameindex(ptr?.toLong() ?: 0L)
}

public actual fun pthreadCreate(native: CUint?, attr: io.github.kotlinmania.libc.PthreadAttrT?, f: PthreadCreateFCallback, value: COpaquePointer?): CInt =
    SolarishModRawLibc.pthreadCreate(native?.toLong() ?: 0L, attr?.toLong() ?: 0L, f, value?.value ?: 0L)

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.PthreadAttrT?, stackaddr: COpaquePointer?, stacksize: SizeT?): CInt =
    SolarishModRawLibc.pthreadAttrGetstack(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L, stacksize?.toLong() ?: 0L)

public actual fun pthreadCondattrGetclock(attr: PthreadCondattrT?, clockId: CInt?): CInt =
    SolarishModRawLibc.pthreadCondattrGetclock(attr?.toLong() ?: 0L, clockId?.toLong() ?: 0L)

public actual fun pthreadCondattrSetclock(attr: PthreadCondattrT?, clockId: io.github.kotlinmania.libc.ClockidT): CInt =
    SolarishModRawLibc.pthreadCondattrSetclock(attr?.toLong() ?: 0L, clockId)

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): CInt =
    SolarishModRawLibc.semTimedwait(sem?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun semGetvalue(sem: SemT?, sval: CInt?): CInt =
    SolarishModRawLibc.semGetvalue(sem?.toLong() ?: 0L, sval?.toLong() ?: 0L)

public actual fun pthreadMutexTimedlock(lock: PthreadMutexT?, abstime: Timespec?): CInt =
    SolarishModRawLibc.pthreadMutexTimedlock(lock?.toLong() ?: 0L, abstime?.toLong() ?: 0L)

public actual fun pthreadGetnameNp(tid: io.github.kotlinmania.libc.PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    SolarishModRawLibc.pthreadGetnameNp(tid, name?.value ?: 0L, len)

public actual fun pthreadSetnameNp(tid: io.github.kotlinmania.libc.PthreadT, name: String?): CInt =
    SolarishModRawLibc.pthreadSetnameNp(tid, name)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    SolarishModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun glob(pattern: String?, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: io.github.kotlinmania.libc.GlobT?): CInt =
    SolarishModRawLibc.glob(pattern, flags, errfunc?.toLong() ?: 0L, pglob?.toLong() ?: 0L)

public actual fun globfree(pglob: io.github.kotlinmania.libc.GlobT?) {
    SolarishModRawLibc.globfree(pglob?.toLong() ?: 0L)
}

public actual fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt =
    SolarishModRawLibc.posixFallocate(fd, offset, len)

public actual fun posixMadvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    SolarishModRawLibc.posixMadvise(addr?.value ?: 0L, len, advice)

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    SolarishModRawLibc.posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    SolarishModRawLibc.posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnFileActionsInit(fileActions: COpaquePointer?): CInt =
    SolarishModRawLibc.posixSpawnFileActionsInit(fileActions?.value ?: 0L)

public actual fun posixSpawnFileActionsDestroy(fileActions: COpaquePointer?): CInt =
    SolarishModRawLibc.posixSpawnFileActionsDestroy(fileActions?.value ?: 0L)

public actual fun posixSpawnFileActionsAddopen(fileActions: COpaquePointer?, fildes: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    SolarishModRawLibc.posixSpawnFileActionsAddopen(fileActions?.value ?: 0L, fildes, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(fileActions: COpaquePointer?, fildes: CInt): CInt =
    SolarishModRawLibc.posixSpawnFileActionsAddclose(fileActions?.value ?: 0L, fildes)

public actual fun posixSpawnFileActionsAdddup2(fileActions: COpaquePointer?, fildes: CInt, newfildes: CInt): CInt =
    SolarishModRawLibc.posixSpawnFileActionsAdddup2(fileActions?.value ?: 0L, fildes, newfildes)

public actual fun posixSpawnFileActionsAddclosefromNp(fileActions: COpaquePointer?, lowfiledes: CInt): CInt =
    SolarishModRawLibc.posixSpawnFileActionsAddclosefromNp(fileActions?.value ?: 0L, lowfiledes)

public actual fun posixSpawnFileActionsAddchdir(fileActions: COpaquePointer?, path: String?): CInt =
    SolarishModRawLibc.posixSpawnFileActionsAddchdir(fileActions?.value ?: 0L, path)

public actual fun posixSpawnFileActionsAddchdirNp(fileActions: COpaquePointer?, path: String?): CInt =
    SolarishModRawLibc.posixSpawnFileActionsAddchdirNp(fileActions?.value ?: 0L, path)

public actual fun posixSpawnFileActionsAddfchdir(fileActions: COpaquePointer?, fd: CInt): CInt =
    SolarishModRawLibc.posixSpawnFileActionsAddfchdir(fileActions?.value ?: 0L, fd)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    SolarishModRawLibc.posixSpawnattrInit(attr?.value ?: 0L)

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    SolarishModRawLibc.posixSpawnattrDestroy(attr?.value ?: 0L)

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    SolarishModRawLibc.posixSpawnattrSetflags(attr?.value ?: 0L, flags)

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    SolarishModRawLibc.posixSpawnattrGetflags(attr?.value ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, pgroup: PidT): CInt =
    SolarishModRawLibc.posixSpawnattrSetpgroup(attr?.value ?: 0L, pgroup)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, pgroup: PidT?): CInt =
    SolarishModRawLibc.posixSpawnattrGetpgroup(attr?.value ?: 0L, pgroup?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    SolarishModRawLibc.posixSpawnattrSetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnattrGetschedparam(attr: COpaquePointer?, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    SolarishModRawLibc.posixSpawnattrGetschedparam(attr?.value ?: 0L, param?.toLong() ?: 0L)

public actual fun posixSpawnattrSetschedpolicy(attr: COpaquePointer?, policy: CInt): CInt =
    SolarishModRawLibc.posixSpawnattrSetschedpolicy(attr?.value ?: 0L, policy)

public actual fun posixSpawnattrGetschedpolicy(attr: COpaquePointer?, policy: CInt?): CInt =
    SolarishModRawLibc.posixSpawnattrGetschedpolicy(attr?.value ?: 0L, policy?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, sigdefault: SigsetT?): CInt =
    SolarishModRawLibc.posixSpawnattrSetsigdefault(attr?.value ?: 0L, sigdefault?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, sigdefault: SigsetT?): CInt =
    SolarishModRawLibc.posixSpawnattrGetsigdefault(attr?.value ?: 0L, sigdefault?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigignoreNp(attr: COpaquePointer?, sigignore: SigsetT?): CInt =
    SolarishModRawLibc.posixSpawnattrSetsigignoreNp(attr?.value ?: 0L, sigignore?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigignoreNp(attr: COpaquePointer?, sigignore: SigsetT?): CInt =
    SolarishModRawLibc.posixSpawnattrGetsigignoreNp(attr?.value ?: 0L, sigignore?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, sigmask: SigsetT?): CInt =
    SolarishModRawLibc.posixSpawnattrSetsigmask(attr?.value ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, sigmask: SigsetT?): CInt =
    SolarishModRawLibc.posixSpawnattrGetsigmask(attr?.value ?: 0L, sigmask?.toLong() ?: 0L)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    SolarishModRawLibc.shmat(shmid, shmaddr?.value ?: 0L, shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    SolarishModRawLibc.shmctl(shmid, cmd, buf?.toLong() ?: 0L)

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    SolarishModRawLibc.shmdt(shmaddr?.value ?: 0L)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    SolarishModRawLibc.shmget(key, size, shmflg)

public actual fun shmOpen(name: String?, oflag: CInt, mode: ModeT): CInt =
    SolarishModRawLibc.shmOpen(name, oflag, mode)

public actual fun shmUnlink(name: String?): CInt =
    SolarishModRawLibc.shmUnlink(name)

public actual fun seekdir(dirp: DIR?, loc: CLong) {
    SolarishModRawLibc.seekdir(dirp?.toLong() ?: 0L, loc)
}

public actual fun telldir(dirp: DIR?): CLong =
    SolarishModRawLibc.telldir(dirp?.toLong() ?: 0L)

public actual fun madvise(addr: COpaquePointer?, len: SizeT, advice: CInt): CInt =
    SolarishModRawLibc.madvise(addr?.value ?: 0L, len, advice)

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    SolarishModRawLibc.msync(addr?.value ?: 0L, len, flags)

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    SolarishModRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun recvfrom(socket: CInt, buf: COpaquePointer?, len: SizeT, flags: CInt, addr: io.github.kotlinmania.libc.Sockaddr?, addrlen: CUint?): SsizeT =
    SolarishModRawLibc.recvfrom(socket, buf?.value ?: 0L, len, flags, addr?.toLong() ?: 0L, addrlen?.toLong() ?: 0L)

public actual fun mkstemps(template: COpaquePointer?, suffixlen: CInt): CInt =
    SolarishModRawLibc.mkstemps(template?.value ?: 0L, suffixlen)

public actual fun futimesat(fd: CInt, path: String?, times: Timeval?): CInt =
    SolarishModRawLibc.futimesat(fd, path, times?.toLong() ?: 0L)

public actual fun futimens(dirfd: CInt, times: Timespec?): CInt =
    SolarishModRawLibc.futimens(dirfd, times?.toLong() ?: 0L)

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    SolarishModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun nlLanginfo(item: io.github.kotlinmania.libc.NlItem): COpaquePointer? =
    SolarishModRawLibc.nlLanginfo(item).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun bind(socket: CInt, address: io.github.kotlinmania.libc.Sockaddr?, addressLen: io.github.kotlinmania.libc.SocklenT): CInt =
    SolarishModRawLibc.bind(socket, address?.toLong() ?: 0L, addressLen)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    SolarishModRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun readv(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    SolarishModRawLibc.readv(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun sendmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    SolarishModRawLibc.sendmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun recvmsg(fd: CInt, msg: io.github.kotlinmania.libc.Msghdr?, flags: CInt): SsizeT =
    SolarishModRawLibc.recvmsg(fd, msg?.toLong() ?: 0L, flags)

public actual fun accept4(fd: CInt, address: Sockaddr?, addressLen: CUint?, flags: CInt): CInt =
    SolarishModRawLibc.accept4(fd, address?.toLong() ?: 0L, addressLen?.toLong() ?: 0L, flags)

public actual fun mqClose(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    SolarishModRawLibc.mqClose(mqd)

public actual fun mqUnlink(name: String?): CInt =
    SolarishModRawLibc.mqUnlink(name)

public actual fun mqReceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?): SsizeT =
    SolarishModRawLibc.mqReceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L)

public actual fun mqTimedreceive(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: COpaquePointer?, msgLen: SizeT, msgPrio: CUint?, absTimeout: Timespec?): SsizeT =
    SolarishModRawLibc.mqTimedreceive(mqd, msgPtr?.value ?: 0L, msgLen, msgPrio?.toLong() ?: 0L, absTimeout?.toLong() ?: 0L)

public actual fun mqSend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint): CInt =
    SolarishModRawLibc.mqSend(mqd, msgPtr, msgLen, msgPrio)

public actual fun mqTimedsend(mqd: io.github.kotlinmania.libc.MqdT, msgPtr: String?, msgLen: SizeT, msgPrio: CUint, absTimeout: Timespec?): CInt =
    SolarishModRawLibc.mqTimedsend(mqd, msgPtr, msgLen, msgPrio, absTimeout?.toLong() ?: 0L)

public actual fun mqGetattr(mqd: io.github.kotlinmania.libc.MqdT, attr: io.github.kotlinmania.libc.MqAttr?): CInt =
    SolarishModRawLibc.mqGetattr(mqd, attr?.toLong() ?: 0L)

public actual fun mqSetattr(mqd: io.github.kotlinmania.libc.MqdT, newattr: io.github.kotlinmania.libc.MqAttr?, oldattr: io.github.kotlinmania.libc.MqAttr?): CInt =
    SolarishModRawLibc.mqSetattr(mqd, newattr?.toLong() ?: 0L, oldattr?.toLong() ?: 0L)

public actual fun portCreate(): CInt =
    SolarishModRawLibc.portCreate()

public actual fun portAssociate(port: CInt, source: CInt, obj: UintptrT, events: CInt, user: COpaquePointer?): CInt =
    SolarishModRawLibc.portAssociate(port, source, obj, events, user?.value ?: 0L)

public actual fun portDissociate(port: CInt, source: CInt, obj: UintptrT): CInt =
    SolarishModRawLibc.portDissociate(port, source, obj)

public actual fun portGet(port: CInt, pe: PortEvent?, timeout: Timespec?): CInt =
    SolarishModRawLibc.portGet(port, pe?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun portGetn(port: CInt, peList: PortEvent?, max: CUint, nget: CUint?, timeout: Timespec?): CInt =
    SolarishModRawLibc.portGetn(port, peList?.toLong() ?: 0L, max, nget?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun portSend(port: CInt, events: CInt, user: COpaquePointer?): CInt =
    SolarishModRawLibc.portSend(port, events, user?.value ?: 0L)

public actual fun portSendn(portList: CInt?, errorList: CInt?, nent: CUint, events: CInt, user: COpaquePointer?): CInt =
    SolarishModRawLibc.portSendn(portList?.toLong() ?: 0L, errorList?.toLong() ?: 0L, nent, events, user?.value ?: 0L)

public actual fun getgrgidR(gid: GidT, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    SolarishModRawLibc.getgrgidR(gid, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun sigaltstack(ss: StackT?, oss: StackT?): CInt =
    SolarishModRawLibc.sigaltstack(ss?.toLong() ?: 0L, oss?.toLong() ?: 0L)

public actual fun sigsuspend(mask: io.github.kotlinmania.libc.SigsetT?): CInt =
    SolarishModRawLibc.sigsuspend(mask?.toLong() ?: 0L)

public actual fun semClose(sem: SemT?): CInt =
    SolarishModRawLibc.semClose(sem?.toLong() ?: 0L)

public actual fun getdtablesize(): CInt =
    SolarishModRawLibc.getdtablesize()

public actual fun getgrnamR(name: String?, grp: Group?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    SolarishModRawLibc.getgrnamR(name, grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun thrSelf(): io.github.kotlinmania.libc.ThreadT =
    SolarishModRawLibc.thrSelf()

public actual fun pthreadSigmask(how: CInt, set: SigsetT?, oldset: SigsetT?): CInt =
    SolarishModRawLibc.pthreadSigmask(how, set?.toLong() ?: 0L, oldset?.toLong() ?: 0L)

public actual fun getgrnam(name: String?): Group? =
    SolarishModRawLibc.getgrnam(name)

public actual fun pthreadKill(thread: io.github.kotlinmania.libc.PthreadT, sig: CInt): CInt =
    SolarishModRawLibc.pthreadKill(thread, sig)

public actual fun schedGetPriorityMin(policy: CInt): CInt =
    SolarishModRawLibc.schedGetPriorityMin(policy)

public actual fun schedGetPriorityMax(policy: CInt): CInt =
    SolarishModRawLibc.schedGetPriorityMax(policy)

public actual fun schedGetparam(pid: PidT, param: SchedParam?): CInt =
    SolarishModRawLibc.schedGetparam(pid, param?.toLong() ?: 0L)

public actual fun schedSetparam(pid: PidT, param: SchedParam?): CInt =
    SolarishModRawLibc.schedSetparam(pid, param?.toLong() ?: 0L)

public actual fun schedGetscheduler(pid: PidT): CInt =
    SolarishModRawLibc.schedGetscheduler(pid)

public actual fun schedSetscheduler(pid: PidT, policy: CInt, param: io.github.kotlinmania.libc.SchedParam?): CInt =
    SolarishModRawLibc.schedSetscheduler(pid, policy, param?.toLong() ?: 0L)

public actual fun semUnlink(name: String?): CInt =
    SolarishModRawLibc.semUnlink(name)

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    SolarishModRawLibc.daemon(nochdir, noclose)

public actual fun getpwnamR(name: String?, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    SolarishModRawLibc.getpwnamR(name, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun getpwuidR(uid: UidT, pwd: Passwd?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    SolarishModRawLibc.getpwuidR(uid, pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen, result?.value ?: 0L)

public actual fun nativeGetpwentR(pwd: Passwd?, buf: COpaquePointer?, buflen: CInt): Passwd? =
    SolarishModRawLibc.nativeGetpwentR(pwd?.toLong() ?: 0L, buf?.value ?: 0L, buflen)

public actual fun nativeGetgrentR(grp: Group?, buf: COpaquePointer?, buflen: CInt): Group? =
    SolarishModRawLibc.nativeGetgrentR(grp?.toLong() ?: 0L, buf?.value ?: 0L, buflen)

public actual fun sigwait(set: SigsetT?, sig: CInt?): CInt =
    SolarishModRawLibc.sigwait(set?.toLong() ?: 0L, sig?.toLong() ?: 0L)

public actual fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt =
    SolarishModRawLibc.pthreadAtfork(prepare?.toLong() ?: 0L, parent?.toLong() ?: 0L, child?.toLong() ?: 0L)

public actual fun getgrgid(gid: GidT): Group? =
    SolarishModRawLibc.getgrgid(gid)

public actual fun setgrent() {
    SolarishModRawLibc.setgrent()
}

public actual fun endgrent() {
    SolarishModRawLibc.endgrent()
}

public actual fun getgrent(): Group? =
    SolarishModRawLibc.getgrent()

public actual fun popen(command: String?, mode: String?): FILE? =
    SolarishModRawLibc.popen(command, mode)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    SolarishModRawLibc.dup3(src, dst, flags)

public actual fun uname(buf: io.github.kotlinmania.libc.Utsname?): CInt =
    SolarishModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun pipe2(fds: CInt?, flags: CInt): CInt =
    SolarishModRawLibc.pipe2(fds?.toLong() ?: 0L, flags)

public actual fun makeutx(ux: Utmpx?): Utmpx? =
    SolarishModRawLibc.makeutx(ux?.toLong() ?: 0L)

public actual fun modutx(ux: Utmpx?): Utmpx? =
    SolarishModRawLibc.modutx(ux?.toLong() ?: 0L)

public actual fun updwtmpx(file: String?, ut: Utmpx?) {
    SolarishModRawLibc.updwtmpx(file, ut?.toLong() ?: 0L)
}

public actual fun utmpxname(file: String?): CInt =
    SolarishModRawLibc.utmpxname(file)

public actual fun getutxent(): Utmpx? =
    SolarishModRawLibc.getutxent()

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    SolarishModRawLibc.getutxid(ut?.toLong() ?: 0L)

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    SolarishModRawLibc.getutxline(ut?.toLong() ?: 0L)

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    SolarishModRawLibc.pututxline(ut?.toLong() ?: 0L)

public actual fun setutxent() {
    SolarishModRawLibc.setutxent()
}

public actual fun endutxent() {
    SolarishModRawLibc.endutxent()
}

public actual fun endutent() {
    SolarishModRawLibc.endutent()
}

public actual fun getutent(): Utmp? =
    SolarishModRawLibc.getutent()

public actual fun getutid(u: Utmp?): Utmp? =
    SolarishModRawLibc.getutid(u?.toLong() ?: 0L)

public actual fun getutline(u: Utmp?): Utmp? =
    SolarishModRawLibc.getutline(u?.toLong() ?: 0L)

public actual fun pututline(u: Utmp?): Utmp? =
    SolarishModRawLibc.pututline(u?.toLong() ?: 0L)

public actual fun setutent() {
    SolarishModRawLibc.setutent()
}

public actual fun utmpname(file: String?): CInt =
    SolarishModRawLibc.utmpname(file)

public actual fun getutmp(ux: Utmpx?, u: Utmp?) {
    SolarishModRawLibc.getutmp(ux?.toLong() ?: 0L, u?.toLong() ?: 0L)
}

public actual fun getutmpx(u: Utmp?, ux: Utmpx?) {
    SolarishModRawLibc.getutmpx(u?.toLong() ?: 0L, ux?.toLong() ?: 0L)
}

public actual fun updwtmp(file: String?, u: Utmp?) {
    SolarishModRawLibc.updwtmp(file, u?.toLong() ?: 0L)
}

public actual fun ntpAdjtime(buf: Timex?): CInt =
    SolarishModRawLibc.ntpAdjtime(buf?.toLong() ?: 0L)

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    SolarishModRawLibc.ntpGettime(buf?.toLong() ?: 0L)

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: CInt?): CInt =
    SolarishModRawLibc.timerCreate(clockId, evp?.toLong() ?: 0L, timerid?.toLong() ?: 0L)

public actual fun timerDelete(timerid: TimerT): CInt =
    SolarishModRawLibc.timerDelete(timerid)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    SolarishModRawLibc.timerGetoverrun(timerid)

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    SolarishModRawLibc.timerGettime(timerid, value?.toLong() ?: 0L)

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    SolarishModRawLibc.timerSettime(timerid, flags, value?.toLong() ?: 0L, ovalue?.toLong() ?: 0L)

public actual fun ucredGet(pid: PidT): UcredT? =
    SolarishModRawLibc.ucredGet(pid)

public actual fun getpeerucred(fd: CInt, ucred: COpaquePointer?): CInt =
    SolarishModRawLibc.getpeerucred(fd, ucred?.value ?: 0L)

public actual fun ucredFree(ucred: UcredT?) {
    SolarishModRawLibc.ucredFree(ucred?.toLong() ?: 0L)
}

public actual fun ucredGeteuid(ucred: UcredT?): UidT =
    SolarishModRawLibc.ucredGeteuid(ucred?.toLong() ?: 0L)

public actual fun ucredGetruid(ucred: UcredT?): UidT =
    SolarishModRawLibc.ucredGetruid(ucred?.toLong() ?: 0L)

public actual fun ucredGetsuid(ucred: UcredT?): UidT =
    SolarishModRawLibc.ucredGetsuid(ucred?.toLong() ?: 0L)

public actual fun ucredGetegid(ucred: UcredT?): GidT =
    SolarishModRawLibc.ucredGetegid(ucred?.toLong() ?: 0L)

public actual fun ucredGetrgid(ucred: UcredT?): GidT =
    SolarishModRawLibc.ucredGetrgid(ucred?.toLong() ?: 0L)

public actual fun ucredGetsgid(ucred: UcredT?): GidT =
    SolarishModRawLibc.ucredGetsgid(ucred?.toLong() ?: 0L)

public actual fun ucredGetgroups(ucred: UcredT?, groups: COpaquePointer?): CInt =
    SolarishModRawLibc.ucredGetgroups(ucred?.toLong() ?: 0L, groups?.value ?: 0L)

public actual fun ucredGetpid(ucred: UcredT?): PidT =
    SolarishModRawLibc.ucredGetpid(ucred?.toLong() ?: 0L)

public actual fun ucredGetprojid(ucred: UcredT?): ProjidT =
    SolarishModRawLibc.ucredGetprojid(ucred?.toLong() ?: 0L)

public actual fun ucredGetzoneid(ucred: UcredT?): ZoneidT =
    SolarishModRawLibc.ucredGetzoneid(ucred?.toLong() ?: 0L)

public actual fun ucredGetpflags(ucred: UcredT?, flags: CUint): CUint =
    SolarishModRawLibc.ucredGetpflags(ucred?.toLong() ?: 0L, flags)

public actual fun ucredSize(): SizeT =
    SolarishModRawLibc.ucredSize()

public actual fun psetCreate(newpset: CInt?): CInt =
    SolarishModRawLibc.psetCreate(newpset?.toLong() ?: 0L)

public actual fun psetDestroy(pset: io.github.kotlinmania.libc.PsetidT): CInt =
    SolarishModRawLibc.psetDestroy(pset)

public actual fun psetAssign(pset: io.github.kotlinmania.libc.PsetidT, cpu: io.github.kotlinmania.libc.ProcessoridT, opset: CInt?): CInt =
    SolarishModRawLibc.psetAssign(pset, cpu, opset?.toLong() ?: 0L)

public actual fun psetInfo(pset: io.github.kotlinmania.libc.PsetidT, tpe: CInt?, numcpus: CUint?, cpulist: CInt?): CInt =
    SolarishModRawLibc.psetInfo(pset, tpe?.toLong() ?: 0L, numcpus?.toLong() ?: 0L, cpulist?.toLong() ?: 0L)

public actual fun psetBind(pset: io.github.kotlinmania.libc.PsetidT, idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, opset: CInt?): CInt =
    SolarishModRawLibc.psetBind(pset, idtype, id, opset?.toLong() ?: 0L)

public actual fun psetList(pset: CInt?, numpsets: CUint?): CInt =
    SolarishModRawLibc.psetList(pset?.toLong() ?: 0L, numpsets?.toLong() ?: 0L)

public actual fun psetSetattr(pset: PsetidT, attr: CUint): CInt =
    SolarishModRawLibc.psetSetattr(pset, attr)

public actual fun psetGetattr(pset: PsetidT, attr: CUint?): CInt =
    SolarishModRawLibc.psetGetattr(pset, attr?.toLong() ?: 0L)

public actual fun processorBind(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, newBinding: io.github.kotlinmania.libc.ProcessoridT, oldBinding: CInt?): CInt =
    SolarishModRawLibc.processorBind(idtype, id, newBinding, oldBinding?.toLong() ?: 0L)

public actual fun pOnline(processorid: io.github.kotlinmania.libc.ProcessoridT, flag: CInt): CInt =
    SolarishModRawLibc.pOnline(processorid, flag)

public actual fun processorInfo(processorid: io.github.kotlinmania.libc.ProcessoridT, infop: ProcessorInfoT?): CInt =
    SolarishModRawLibc.processorInfo(processorid, infop?.toLong() ?: 0L)

public actual fun getexecname(): COpaquePointer? =
    SolarishModRawLibc.getexecname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun gethostid(): CLong =
    SolarishModRawLibc.gethostid()

public actual fun getpflags(flags: CUint): CUint =
    SolarishModRawLibc.getpflags(flags)

public actual fun setpflags(flags: CUint, value: CUint): CInt =
    SolarishModRawLibc.setpflags(flags, value)

public actual fun sysinfo(command: CInt, buf: COpaquePointer?, count: CLong): CInt =
    SolarishModRawLibc.sysinfo(command, buf?.value ?: 0L, count)

public actual fun faccessat(fd: CInt, path: String?, amode: CInt, flag: CInt): CInt =
    SolarishModRawLibc.faccessat(fd, path, amode, flag)

public actual fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: COpaquePointer?): CInt =
    SolarishModRawLibc.dlIteratePhdr(callback?.toLong() ?: 0L, data?.value ?: 0L)

public actual fun getpagesize(): CInt =
    SolarishModRawLibc.getpagesize()

public actual fun getpagesizes(pagesize: SizeT?, nelem: CInt): CInt =
    SolarishModRawLibc.getpagesizes(pagesize?.toLong() ?: 0L, nelem)

public actual fun mmapobj(fd: CInt, flags: CUint, storage: MmapobjResultT?, elements: CUint?, arg: COpaquePointer?): CInt =
    SolarishModRawLibc.mmapobj(fd, flags, storage?.toLong() ?: 0L, elements?.toLong() ?: 0L, arg?.value ?: 0L)

public actual fun meminfo(inaddr: ULong?, addrCount: CInt, infoReq: CUint?, infoCount: CInt, outdata: ULong?, validity: CUint?): CInt =
    SolarishModRawLibc.meminfo(inaddr?.toLong() ?: 0L, addrCount, infoReq?.toLong() ?: 0L, infoCount, outdata?.toLong() ?: 0L, validity?.toLong() ?: 0L)

public actual fun strsep(string: COpaquePointer?, delim: String?): COpaquePointer? =
    SolarishModRawLibc.strsep(string?.value ?: 0L, delim).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getisax(array: UInt?, n: CUint): CUint =
    SolarishModRawLibc.getisax(array?.toLong() ?: 0L, n)

public actual fun backtrace(buffer: COpaquePointer?, size: CInt): CInt =
    SolarishModRawLibc.backtrace(buffer?.value ?: 0L, size)

public actual fun backtraceSymbols(buffer: COpaquePointer?, size: CInt): COpaquePointer? =
    SolarishModRawLibc.backtraceSymbols(buffer?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, size: CInt, fd: CInt) {
    SolarishModRawLibc.backtraceSymbolsFd(buffer?.value ?: 0L, size, fd)
}

public actual fun getoptLong(argc: CInt, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: CInt?): CInt =
    SolarishModRawLibc.getoptLong(argc, argv?.value ?: 0L, optstring, longopts?.toLong() ?: 0L, longindex?.toLong() ?: 0L)

public actual fun sync() {
    SolarishModRawLibc.sync()
}

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    SolarishModRawLibc.aioCancel(fd, aiocbp?.toLong() ?: 0L)

public actual fun aioError(aiocbp: Aiocb?): CInt =
    SolarishModRawLibc.aioError(aiocbp?.toLong() ?: 0L)

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    SolarishModRawLibc.aioFsync(op, aiocbp?.toLong() ?: 0L)

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    SolarishModRawLibc.aioRead(aiocbp?.toLong() ?: 0L)

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    SolarishModRawLibc.aioReturn(aiocbp?.toLong() ?: 0L)

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    SolarishModRawLibc.aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)

public actual fun aioWaitn(aiocbList: COpaquePointer?, nent: CUint, nwait: CUint?, timeout: Timespec?): CInt =
    SolarishModRawLibc.aioWaitn(aiocbList?.value ?: 0L, nent, nwait?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    SolarishModRawLibc.aioWrite(aiocbp?.toLong() ?: 0L)

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    SolarishModRawLibc.lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)

public actual fun major(version: CInt, devnum: io.github.kotlinmania.libc.DevT): io.github.kotlinmania.libc.MajorT =
    SolarishModRawLibc.major(version, devnum)

public actual fun minor(version: CInt, devnum: io.github.kotlinmania.libc.DevT): io.github.kotlinmania.libc.MinorT =
    SolarishModRawLibc.minor(version, devnum)

public actual fun makedev(version: CInt, majdev: io.github.kotlinmania.libc.MajorT, mindev: io.github.kotlinmania.libc.MinorT): io.github.kotlinmania.libc.DevT =
    SolarishModRawLibc.makedev(version, majdev, mindev)

public actual fun arc4random(): UInt =
    SolarishModRawLibc.arc4random()

public actual fun arc4randomBuf(buf: COpaquePointer?, nbytes: SizeT) {
    SolarishModRawLibc.arc4randomBuf(buf?.value ?: 0L, nbytes)
}

public actual fun arc4randomUniform(upperBound: UInt): UInt =
    SolarishModRawLibc.arc4randomUniform(upperBound)

public actual fun secureGetenv(name: String?): COpaquePointer? =
    SolarishModRawLibc.secureGetenv(name).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strftime(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: io.github.kotlinmania.libc.Tm?): SizeT =
    SolarishModRawLibc.strftime(s?.value ?: 0L, maxsize, format, timeptr?.toLong() ?: 0L)

public actual fun strftimeL(s: COpaquePointer?, maxsize: SizeT, format: String?, timeptr: io.github.kotlinmania.libc.Tm?, loc: LocaleT): SizeT =
    SolarishModRawLibc.strftimeL(s?.value ?: 0L, maxsize, format, timeptr?.toLong() ?: 0L, loc)

public actual fun sendfile(outFd: CInt, inFd: CInt, off: CLong?, len: SizeT): SsizeT =
    SolarishModRawLibc.sendfile(outFd, inFd, off?.toLong() ?: 0L, len)

public actual fun sendfilev(fildes: CInt, vec: SendfilevecT?, sfvcnt: CInt, xferred: SizeT?): SsizeT =
    SolarishModRawLibc.sendfilev(fildes, vec?.toLong() ?: 0L, sfvcnt, xferred?.toLong() ?: 0L)

public actual fun lgrpInit(view: LgrpViewT): LgrpCookieT =
    SolarishModRawLibc.lgrpInit(view)

public actual fun lgrpFini(cookie: LgrpCookieT): CInt =
    SolarishModRawLibc.lgrpFini(cookie)

public actual fun lgrpAffinityGet(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, lgrp: io.github.kotlinmania.libc.LgrpIdT): LgrpAffinityT =
    SolarishModRawLibc.lgrpAffinityGet(idtype, id, lgrp)

public actual fun lgrpAffinitySet(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT, lgrp: io.github.kotlinmania.libc.LgrpIdT, aff: LgrpAffinityT): CInt =
    SolarishModRawLibc.lgrpAffinitySet(idtype, id, lgrp, aff)

public actual fun lgrpCpus(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, cpuids: CInt?, count: CUint, content: io.github.kotlinmania.libc.LgrpContentT): CInt =
    SolarishModRawLibc.lgrpCpus(cookie, lgrp, cpuids?.toLong() ?: 0L, count, content)

public actual fun lgrpMemSize(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, tpe: io.github.kotlinmania.libc.LgrpMemSizeFlagT, content: io.github.kotlinmania.libc.LgrpContentT): io.github.kotlinmania.libc.LgrpMemSizeT =
    SolarishModRawLibc.lgrpMemSize(cookie, lgrp, tpe, content)

public actual fun lgrpNlgrps(cookie: io.github.kotlinmania.libc.LgrpCookieT): CInt =
    SolarishModRawLibc.lgrpNlgrps(cookie)

public actual fun lgrpView(cookie: io.github.kotlinmania.libc.LgrpCookieT): io.github.kotlinmania.libc.LgrpViewT =
    SolarishModRawLibc.lgrpView(cookie)

public actual fun lgrpHome(idtype: io.github.kotlinmania.libc.IdtypeT, id: io.github.kotlinmania.libc.IdT): io.github.kotlinmania.libc.LgrpIdT =
    SolarishModRawLibc.lgrpHome(idtype, id)

public actual fun lgrpVersion(version: CInt): CInt =
    SolarishModRawLibc.lgrpVersion(version)

public actual fun lgrpResources(cookie: io.github.kotlinmania.libc.LgrpCookieT, lgrp: io.github.kotlinmania.libc.LgrpIdT, lgrps: CInt?, count: CUint, tpe: LgrpRsrcT): CInt =
    SolarishModRawLibc.lgrpResources(cookie, lgrp, lgrps?.toLong() ?: 0L, count, tpe)

public actual fun lgrpRoot(cookie: io.github.kotlinmania.libc.LgrpCookieT): io.github.kotlinmania.libc.LgrpIdT =
    SolarishModRawLibc.lgrpRoot(cookie)
