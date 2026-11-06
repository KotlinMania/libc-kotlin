package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.COpaquePointer

internal object AppleModRawLibc {
    external fun setgrent()
    external fun daemon(nochdir: Int, noclose: Int): Int
    external fun semDestroy(sem: Long): Int
    external fun semInit(sem: Long, pshared: Int, value: Int): Int
    external fun aioRead(aiocbp: Long): Int
    external fun aioWrite(aiocbp: Long): Int
    external fun aioFsync(op: Int, aiocbp: Long): Int
    external fun aioError(aiocbp: Long): Int
    external fun aioReturn(aiocbp: Long): Long
    external fun aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int
    external fun aioCancel(fd: Int, aiocbp: Long): Int
    external fun chflags(path: String?, flags: Int): Int
    external fun fchflags(fd: Int, flags: Int): Int
    external fun clockGetres(clkId: Long, tp: Long): Int
    external fun clockGettime(clkId: Long, tp: Long): Int
    external fun lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int
    external fun dirfd(dirp: Long): Int
    external fun lutimes(file: String?, times: Long): Int
    external fun gettimeofday(tp: Long, tz: Long): Int
    external fun getutxent(): Long?
    external fun getutxid(ut: Long): Long?
    external fun getutxline(ut: Long): Long?
    external fun pututxline(ut: Long): Long?
    external fun setutxent()
    external fun endutxent()
    external fun utmpxname(file: String?): Int
    external fun asctime(tm: Long): Long?
    external fun ctime(clock: Long): Long?
    external fun getdate(datestr: String?): Long?
    external fun strptime(buf: String?, format: String?, timeptr: Long): Long?
    external fun asctimeR(tm: Long, result: Long): Long?
    external fun ctimeR(clock: Long, result: Long): Long?
    external fun getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int
    external fun mincore(addr: Long, len: Long, vec: Long): Int
    external fun sysctlnametomib(name: String?, mibp: Long, sizep: Long): Int
    external fun mprotect(addr: Long, len: Long, prot: Int): Int
    external fun semget(key: Long, nsems: Int, semflg: Int): Int
    external fun semop(semid: Int, sops: Long, nsops: Long): Int
    external fun ftok(pathname: String?, projId: Int): Long
    external fun shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long?
    external fun shmdt(shmaddr: Long): Int
    external fun shmctl(shmid: Int, cmd: Int, buf: Long): Int
    external fun shmget(key: Long, size: Long, shmflg: Int): Int
    external fun sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun sysctlbyname(name: String?, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun machAbsoluteTime(): Long
    external fun machTimebaseInfo(info: Long): Int
    external fun machHostSelf(): Int
    external fun machThreadSelf(): Int
    external fun pthreadCondTimedwaitRelativeNp(cond: Long, lock: Long, timeout: Long): Int
    external fun pthreadAttrGetscope(attr: Long, contentionscope: Long): Int
    external fun pthreadAttrGetstackaddr(attr: Long, stackaddr: Long): Int
    external fun pthreadAttrGetdetachstate(attr: Long, detachstate: Long): Int
    external fun pthreadAttrSetscope(attr: Long, contentionscope: Int): Int
    external fun pthreadAttrSetstackaddr(attr: Long, stackaddr: Long): Int
    external fun pthreadSetnameNp(name: String?): Int
    external fun pthreadGetnameNp(thread: Long, name: Long, len: Long): Int
    external fun pthreadMachThreadNp(thread: Long): Long
    external fun pthreadFromMachThreadNp(port: Long): Long
    external fun pthreadGetStackaddrNp(thread: Long): Long?
    external fun pthreadGetStacksizeNp(thread: Long): Long
    external fun pthreadMainNp(): Int
    external fun pthreadThreadidNp(thread: Long, threadId: Long): Int
    external fun pthreadJitWriteProtectNp(enabled: Int)
    external fun pthreadJitWriteProtectSupportedNp(): Int
    external fun pthreadJitWriteWithCallbackNp(callback: Long, ctx: Long): Int
    external fun pthreadJitWriteFreezeCallbacksNp()
    external fun pthreadCpuNumberNp(cpuNumberOut: Long): Int
    external fun osSyncWaitOnAddress(addr: Long, value: Long, size: Long, flags: Long): Int
    external fun osSyncWaitOnAddressWithDeadline(addr: Long, value: Long, size: Long, flags: Long, clockid: Long, deadline: Long): Int
    external fun osSyncWaitOnAddressWithTimeout(addr: Long, value: Long, size: Long, flags: Long, clockid: Long, timeoutNs: Long): Int
    external fun osSyncWakeByAddressAny(addr: Long, size: Long, flags: Long): Int
    external fun osSyncWakeByAddressAll(addr: Long, size: Long, flags: Long): Int
    external fun osUnfairLockLock(lock: Long)
    external fun osUnfairLockTrylock(lock: Long): Boolean
    external fun osUnfairLockUnlock(lock: Long)
    external fun osUnfairLockAssertOwner(lock: Long)
    external fun osUnfairLockAssertNotOwner(lock: Long)
    external fun osLogCreate(subsystem: String?, category: String?): Long
    external fun osLogTypeEnabled(oslog: Long, tpe: Long): Boolean
    external fun osSignpostIdMakeWithPointer(log: Long, ptr: Long): Long
    external fun osSignpostIdGenerate(log: Long): Long
    external fun osSignpostEnabled(log: Long): Boolean
    external fun threadPolicySet(thread: Long, flavor: Long, policyInfo: Long, count: Long): Int
    external fun threadPolicyGet(thread: Long, flavor: Long, policyInfo: Long, count: Long, getDefault: Long): Int
    external fun threadInfo(targetAct: Long, flavor: Long, threadInfoOut: Long, threadInfoOutCnt: Long): Int
    external fun error(): Long?
    external fun backtrace(buf: Long, sz: Int): Int
    external fun backtraceSymbols(addrs: Long, sz: Int): Long?
    external fun backtraceSymbolsFd(addrs: Long, sz: Int, fd: Int)
    external fun backtraceFromFp(startfp: Long, array: Long, size: Int): Int
    external fun backtraceImageOffsets(array: Long, imageOffsets: Long, size: Int)
    external fun backtraceAsync(array: Long, length: Long, taskId: Long): Long
    external fun statfs(path: String?, buf: Long): Int
    external fun fstatfs(fd: Int, buf: Long): Int
    external fun kevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int
    external fun kevent64(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, flags: Int, timeout: Long): Int
    external fun mount(src: String?, target: String?, flags: Int, data: Long): Int
    external fun fmount(src: String?, fd: Int, flags: Int, data: Long): Int
    external fun ptrace(request: Int, pid: Int, addr: Long, data: Int): Int
    external fun quotactl(special: String?, cmd: Int, id: Int, data: Long): Int
    external fun sethostname(name: String?, len: Int): Int
    external fun sendfile(fd: Int, s: Int, offset: Long, len: Long, hdtr: Long, flags: Int): Int
    external fun futimens(fd: Int, times: Long): Int
    external fun utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int
    external fun openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int
    external fun forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int
    external fun loginTty(fd: Int): Int
    external fun duplocale(base: Long): Long
    external fun freelocale(loc: Long): Int
    external fun localeconvL(loc: Long): Long?
    external fun newlocale(mask: Int, locale: String?, base: Long): Long
    external fun uselocale(loc: Long): Long
    external fun querylocale(mask: Int, loc: Long): Long?
    external fun getpriority(which: Int, who: Long): Int
    external fun setpriority(which: Int, who: Long, prio: Int): Int
    external fun getdomainname(name: Long, len: Int): Int
    external fun setdomainname(name: String?, len: Int): Int
    external fun preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long
    external fun getxattr(path: String?, name: String?, value: Long, size: Long, position: Int, flags: Int): Long
    external fun fgetxattr(filedes: Int, name: String?, value: Long, size: Long, position: Int, flags: Int): Long
    external fun setxattr(path: String?, name: String?, value: Long, size: Long, position: Int, flags: Int): Int
    external fun fsetxattr(filedes: Int, name: String?, value: Long, size: Long, position: Int, flags: Int): Int
    external fun listxattr(path: String?, list: Long, size: Long, flags: Int): Long
    external fun flistxattr(filedes: Int, list: Long, size: Long, flags: Int): Long
    external fun removexattr(path: String?, name: String?, flags: Int): Int
    external fun renamexNp(from: String?, to: String?, flags: Int): Int
    external fun renameatxNp(fromfd: Int, from: String?, tofd: Int, to: String?, flags: Int): Int
    external fun fremovexattr(filedes: Int, name: String?, flags: Int): Int
    external fun getgrouplist(name: String?, basegid: Int, groups: Long, ngroups: Long): Int
    external fun initgroups(user: String?, basegroup: Int): Int
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun brk(addr: Long): Long?
    external fun sbrk(increment: Int): Long?
    external fun settimeofday(tv: Long, tz: Long): Int
    external fun dyldImageCount(): Int
    external fun dyldGetImageHeader(imageIndex: Int): Long?
    external fun dyldGetImageVmaddrSlide(imageIndex: Int): Long
    external fun dyldGetImageName(imageIndex: Int): Long?
    external fun posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int
    external fun posixSpawnattrInit(attr: Long): Int
    external fun posixSpawnattrDestroy(attr: Long): Int
    external fun posixSpawnattrGetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigdefault(attr: Long, default: Long): Int
    external fun posixSpawnattrGetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrSetsigmask(attr: Long, default: Long): Int
    external fun posixSpawnattrGetflags(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetflags(attr: Long, flags: Short): Int
    external fun posixSpawnattrGetpgroup(attr: Long, flags: Long): Int
    external fun posixSpawnattrSetpgroup(attr: Long, flags: Int): Int
    external fun posixSpawnattrSetarchprefNp(attr: Long, count: Long, pref: Long, subpref: Long, ocount: Long): Int
    external fun posixSpawnattrGetarchprefNp(attr: Long, count: Long, pref: Long, subpref: Long, ocount: Long): Int
    external fun posixSpawnattrGetbinprefNp(attr: Long, count: Long, pref: Long, ocount: Long): Int
    external fun posixSpawnattrSetbinprefNp(attr: Long, count: Long, pref: Long, ocount: Long): Int
    external fun posixSpawnFileActionsInit(actions: Long): Int
    external fun posixSpawnFileActionsDestroy(actions: Long): Int
    external fun posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Int): Int
    external fun posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int
    external fun posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int
    external fun uname(buf: Long): Int
    external fun connectx(socket: Int, endpoints: Long, associd: Long, flags: Int, iov: Long, iovcnt: Int, len: Long, connid: Long): Int
    external fun disconnectx(socket: Int, associd: Long, connid: Long): Int
    external fun ntpAdjtime(buf: Long): Int
    external fun ntpGettime(buf: Long): Int
    external fun getmntinfo(mntbufp: Long, flags: Int): Int
    external fun getfsstat(mntbufp: Long, bufsize: Int, flags: Int): Int
    external fun clonefile(src: String?, dst: String?, flags: Int): Int
    external fun clonefileat(srcDirfd: Int, src: String?, dstDirfd: Int, dst: String?, flags: Int): Int
    external fun fclonefileat(srcfd: Int, dstDirfd: Int, dst: String?, flags: Int): Int
    external fun copyfile(from: String?, to: String?, state: Long, flags: Long): Int
    external fun fcopyfile(from: Int, to: Int, state: Long, flags: Long): Int
    external fun copyfileStateFree(s: Long): Int
    external fun copyfileStateAlloc(): Long
    external fun copyfileStateGet(s: Long, flags: Int, dst: Long): Int
    external fun copyfileStateSet(s: Long, flags: Int, src: Long): Int
    external fun machErrorString(errorValue: Long): Long?
    external fun memsetS(s: Long, smax: Long, c: Int, n: Long): Int
    external fun memsetPattern4(b: Long, pattern4: Long, len: Long)
    external fun memsetPattern8(b: Long, pattern8: Long, len: Long)
    external fun memsetPattern16(b: Long, pattern16: Long, len: Long)
    external fun strtonum(numstr: String?, minval: Long, maxval: Long, errstrp: Long): Long
    external fun mstats(): Long
    external fun mallocZoneCheck(zone: Long): Boolean
    external fun mallocZonePrint(zone: Long, verbose: Boolean)
    external fun mallocZoneStatistics(zone: Long, stats: Long)
    external fun mallocZoneLog(zone: Long, address: Long)
    external fun mallocZonePrintPtrInfo(ptr: Long)
    external fun mallocDefaultZone(): Long?
    external fun mallocZoneFromPtr(ptr: Long): Long?
    external fun mallocZoneMalloc(zone: Long, size: Long): Long?
    external fun mallocZoneValloc(zone: Long, size: Long): Long?
    external fun mallocZoneCalloc(zone: Long, numItems: Long, size: Long): Long?
    external fun mallocZoneRealloc(zone: Long, ptr: Long, size: Long): Long?
    external fun mallocZoneFree(zone: Long, ptr: Long)
    external fun procListpids(t: Int, typeinfo: Int, buffer: Long, buffersize: Int): Int
    external fun procListallpids(buffer: Long, buffersize: Int): Int
    external fun procListpgrppids(pgrpid: Int, buffer: Long, buffersize: Int): Int
    external fun procListchildpids(ppid: Int, buffer: Long, buffersize: Int): Int
    external fun procPidinfo(pid: Int, flavor: Int, arg: Long, buffer: Long, buffersize: Int): Int
    external fun procPidfdinfo(pid: Int, fd: Int, flavor: Int, buffer: Long, buffersize: Int): Int
    external fun procPidfileportinfo(pid: Int, fileport: Int, flavor: Int, buffer: Long, buffersize: Int): Int
    external fun procPidpath(pid: Int, buffer: Long, buffersize: Int): Int
    external fun procName(pid: Int, buffer: Long, buffersize: Int): Int
    external fun procRegionfilename(pid: Int, address: Long, buffer: Long, buffersize: Int): Int
    external fun procKmsgbuf(buffer: Long, buffersize: Int): Int
    external fun procLibversion(major: Long, minor: Long): Int
    external fun procPidRusage(pid: Int, flavor: Int, buffer: Long): Int
    external fun procSetNoSmt(): Int
    external fun procSetthreadNoSmt(): Int
    external fun procSetCsm(flags: Int): Int
    external fun procSetthreadCsm(flags: Int): Int
    external fun gethostuuid(id: Long, timeout: Long): Int
    external fun gethostid(): Long
    external fun sethostid(hostid: Long)
    external fun cCRandomGenerateBytes(bytes: Long, size: Long): Long
    external fun getentropy(buf: Long, buflen: Long): Int
    external fun nsgetExecutablePath(buf: Long, bufsize: Long): Int
    external fun nsgetArgv(): Long?
    external fun nsgetArgc(): Long?
    external fun nsgetEnviron(): Long?
    external fun nsgetProgname(): Long?
    external fun machVmMap(targetTask: Long, address: Long, size: Long, mask: Long, flags: Int, obj: Long, offset: Long, copy: Boolean, curProtection: Long, maxProtection: Long, inheritance: Long): Long
    external fun vmAllocate(targetTask: Long, address: Long, size: Long, flags: Int): Long
    external fun vmDeallocate(targetTask: Long, address: Long, size: Long): Long
    external fun hostStatistics64(hostPriv: Long, flavor: Long, hostInfo64Out: Long, hostInfo64OutCnt: Long): Long
    external fun hostProcessorInfo(host: Long, flavor: Long, outProcessorCount: Long, outProcessorInfo: Long, outProcessorInfoCnt: Long): Long
    external fun taskForPid(host: Long, pid: Int, task: Long): Long
    external fun taskInfo(host: Long, flavor: Int, taskInfoOut: Long, taskInfoCount: Long): Long
    external fun taskCreate(targetTask: Long, ledgers: Long, ledgersCnt: Long, inheritMemory: Boolean, childTask: Long): Long
    external fun taskTerminate(targetTask: Long): Long
    external fun taskThreads(targetTask: Long, actList: Long, actListCnt: Long): Long
    external fun hostStatistics(hostPriv: Long, flavor: Long, hostInfoOut: Long, hostInfoOutCnt: Long): Long
    external fun sysdirStartSearchPathEnumeration(dir: Long, domainMask: Long): Long
    external fun sysdirGetNextSearchPathEnumeration(state: Long, path: Long): Long
    external fun getattrlist(path: String?, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int
    external fun fgetattrlist(fd: Int, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int
    external fun getattrlistat(fd: Int, path: String?, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Long): Int
    external fun setattrlist(path: String?, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int
    external fun fsetattrlist(fd: Int, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int
    external fun setattrlistat(dirFd: Int, path: String?, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int
    external fun getattrlistbulk(dirfd: Int, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Long): Int
    external fun mallocSize(ptr: Long): Long
    external fun mallocGoodSize(size: Long): Long
    external fun dirname(path: Long): Long?
    external fun basename(path: Long): Long?
    external fun mkfifoat(dirfd: Int, pathname: String?, mode: Int): Int
    external fun mknodat(dirfd: Int, pathname: String?, mode: Int, dev: Long): Int
    external fun freadlink(fd: Int, buf: Long, size: Long): Int
    external fun execvP(file: String?, searchPath: String?, argv: Long): Int
    external fun qsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)
    external fun clockSettime(clockId: Long, tp: Long): Int
    external fun memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long?
    external fun taskSetInfo(targetTask: Long, flavor: Long, taskInfoIn: Long, taskInfoInCnt: Long): Long
    external fun iconvOpen(tocode: String?, fromcode: String?): Long
    external fun iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long
    external fun iconvClose(cd: Long): Int
}

public actual fun setgrent() {
    AppleModRawLibc.setgrent()
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    AppleModRawLibc.daemon(nochdir, noclose)

public actual fun semDestroy(sem: CInt?): CInt =
    AppleModRawLibc.semDestroy(sem?.toLong() ?: 0L)

public actual fun semInit(sem: CInt?, pshared: CInt, value: CUint): CInt =
    AppleModRawLibc.semInit(sem?.toLong() ?: 0L, pshared, value)

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    AppleModRawLibc.aioRead(aiocbp?.toLong() ?: 0L)

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    AppleModRawLibc.aioWrite(aiocbp?.toLong() ?: 0L)

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    AppleModRawLibc.aioFsync(op, aiocbp?.toLong() ?: 0L)

public actual fun aioError(aiocbp: Aiocb?): CInt =
    AppleModRawLibc.aioError(aiocbp?.toLong() ?: 0L)

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    AppleModRawLibc.aioReturn(aiocbp?.toLong() ?: 0L)

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    AppleModRawLibc.aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    AppleModRawLibc.aioCancel(fd, aiocbp?.toLong() ?: 0L)

public actual fun chflags(path: String?, flags: CUint): CInt =
    AppleModRawLibc.chflags(path, flags)

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    AppleModRawLibc.fchflags(fd, flags)

public actual fun clockGetres(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    AppleModRawLibc.clockGetres(clkId, tp?.toLong() ?: 0L)

public actual fun clockGettime(clkId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    AppleModRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    AppleModRawLibc.lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)

public actual fun dirfd(dirp: DIR?): CInt =
    AppleModRawLibc.dirfd(dirp?.toLong() ?: 0L)

public actual fun lutimes(file: String?, times: Timeval?): CInt =
    AppleModRawLibc.lutimes(file, times?.toLong() ?: 0L)

public actual fun gettimeofday(tp: Timeval?, tz: COpaquePointer?): CInt =
    AppleModRawLibc.gettimeofday(tp?.toLong() ?: 0L, tz?.value ?: 0L)

public actual fun getutxent(): Utmpx? =
    AppleModRawLibc.getutxent()

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    AppleModRawLibc.getutxid(ut?.toLong() ?: 0L)

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    AppleModRawLibc.getutxline(ut?.toLong() ?: 0L)

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    AppleModRawLibc.pututxline(ut?.toLong() ?: 0L)

public actual fun setutxent() {
    AppleModRawLibc.setutxent()
}

public actual fun endutxent() {
    AppleModRawLibc.endutxent()
}

public actual fun utmpxname(file: String?): CInt =
    AppleModRawLibc.utmpxname(file)

public actual fun asctime(tm: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    AppleModRawLibc.asctime(tm?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctime(clock: CLong?): COpaquePointer? =
    AppleModRawLibc.ctime(clock?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getdate(datestr: String?): io.github.kotlinmania.libc.Tm? =
    AppleModRawLibc.getdate(datestr)

public actual fun strptime(buf: String?, format: String?, timeptr: io.github.kotlinmania.libc.Tm?): COpaquePointer? =
    AppleModRawLibc.strptime(buf, format, timeptr?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun asctimeR(tm: io.github.kotlinmania.libc.Tm?, result: COpaquePointer?): COpaquePointer? =
    AppleModRawLibc.asctimeR(tm?.toLong() ?: 0L, result?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(clock: CLong?, result: COpaquePointer?): COpaquePointer? =
    AppleModRawLibc.ctimeR(clock?.toLong() ?: 0L, result?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getnameinfo(sa: Sockaddr?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    AppleModRawLibc.getnameinfo(sa?.toLong() ?: 0L, salen, host?.value ?: 0L, hostlen, serv?.value ?: 0L, servlen, flags)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    AppleModRawLibc.mincore(addr?.value ?: 0L, len, vec?.value ?: 0L)

public actual fun sysctlnametomib(name: String?, mibp: CInt?, sizep: SizeT?): CInt =
    AppleModRawLibc.sysctlnametomib(name, mibp?.toLong() ?: 0L, sizep?.toLong() ?: 0L)

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    AppleModRawLibc.mprotect(addr?.value ?: 0L, len, prot)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    AppleModRawLibc.semget(key, nsems, semflg)

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    AppleModRawLibc.semop(semid, sops?.toLong() ?: 0L, nsops)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    AppleModRawLibc.ftok(pathname, projId)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    AppleModRawLibc.shmat(shmid, shmaddr?.value ?: 0L, shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    AppleModRawLibc.shmdt(shmaddr?.value ?: 0L)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.ShmidDs?): CInt =
    AppleModRawLibc.shmctl(shmid, cmd, buf?.toLong() ?: 0L)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    AppleModRawLibc.shmget(key, size, shmflg)

public actual fun sysctl(name: CInt?, namelen: CUint, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    AppleModRawLibc.sysctl(name?.toLong() ?: 0L, namelen, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    AppleModRawLibc.sysctlbyname(name, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun machAbsoluteTime(): ULong =
    AppleModRawLibc.machAbsoluteTime()

public actual fun machTimebaseInfo(info: io.github.kotlinmania.libc.MachTimebaseInfo?): CInt =
    AppleModRawLibc.machTimebaseInfo(info?.toLong() ?: 0L)

public actual fun machHostSelf(): MachPortT =
    AppleModRawLibc.machHostSelf()

public actual fun machThreadSelf(): MachPortT =
    AppleModRawLibc.machThreadSelf()

public actual fun pthreadCondTimedwaitRelativeNp(cond: PthreadCondT?, lock: PthreadMutexT?, timeout: Timespec?): CInt =
    AppleModRawLibc.pthreadCondTimedwaitRelativeNp(cond?.toLong() ?: 0L, lock?.toLong() ?: 0L, timeout?.toLong() ?: 0L)

public actual fun pthreadAttrGetscope(attr: PthreadAttrT?, contentionscope: CInt?): CInt =
    AppleModRawLibc.pthreadAttrGetscope(attr?.toLong() ?: 0L, contentionscope?.toLong() ?: 0L)

public actual fun pthreadAttrGetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    AppleModRawLibc.pthreadAttrGetstackaddr(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L)

public actual fun pthreadAttrGetdetachstate(attr: PthreadAttrT?, detachstate: CInt?): CInt =
    AppleModRawLibc.pthreadAttrGetdetachstate(attr?.toLong() ?: 0L, detachstate?.toLong() ?: 0L)

public actual fun pthreadAttrSetscope(attr: PthreadAttrT?, contentionscope: CInt): CInt =
    AppleModRawLibc.pthreadAttrSetscope(attr?.toLong() ?: 0L, contentionscope)

public actual fun pthreadAttrSetstackaddr(attr: PthreadAttrT?, stackaddr: COpaquePointer?): CInt =
    AppleModRawLibc.pthreadAttrSetstackaddr(attr?.toLong() ?: 0L, stackaddr?.value ?: 0L)

public actual fun pthreadSetnameNp(name: String?): CInt =
    AppleModRawLibc.pthreadSetnameNp(name)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    AppleModRawLibc.pthreadGetnameNp(thread, name?.value ?: 0L, len)

public actual fun pthreadMachThreadNp(thread: PthreadT): io.github.kotlinmania.libc.MachPortT =
    AppleModRawLibc.pthreadMachThreadNp(thread)

public actual fun pthreadFromMachThreadNp(port: io.github.kotlinmania.libc.MachPortT): PthreadT =
    AppleModRawLibc.pthreadFromMachThreadNp(port)

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    AppleModRawLibc.pthreadGetStackaddrNp(thread).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    AppleModRawLibc.pthreadGetStacksizeNp(thread)

public actual fun pthreadMainNp(): CInt =
    AppleModRawLibc.pthreadMainNp()

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: ULong?): CInt =
    AppleModRawLibc.pthreadThreadidNp(thread, threadId?.toLong() ?: 0L)

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    AppleModRawLibc.pthreadJitWriteProtectNp(enabled)
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    AppleModRawLibc.pthreadJitWriteProtectSupportedNp()

public actual fun pthreadJitWriteWithCallbackNp(callback: io.github.kotlinmania.libc.PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    AppleModRawLibc.pthreadJitWriteWithCallbackNp(callback, ctx?.value ?: 0L)

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    AppleModRawLibc.pthreadJitWriteFreezeCallbacksNp()
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: SizeT?): CInt =
    AppleModRawLibc.pthreadCpuNumberNp(cpuNumberOut?.toLong() ?: 0L)

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    AppleModRawLibc.osSyncWaitOnAddress(addr?.value ?: 0L, value, size, flags)

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    AppleModRawLibc.osSyncWaitOnAddressWithDeadline(addr?.value ?: 0L, value, size, flags, clockid, deadline)

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    AppleModRawLibc.osSyncWaitOnAddressWithTimeout(addr?.value ?: 0L, value, size, flags, clockid, timeoutNs)

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    AppleModRawLibc.osSyncWakeByAddressAny(addr?.value ?: 0L, size, flags)

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    AppleModRawLibc.osSyncWakeByAddressAll(addr?.value ?: 0L, size, flags)

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    AppleModRawLibc.osUnfairLockLock(lock)
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    AppleModRawLibc.osUnfairLockTrylock(lock)

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    AppleModRawLibc.osUnfairLockUnlock(lock)
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    AppleModRawLibc.osUnfairLockAssertOwner(lock)
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    AppleModRawLibc.osUnfairLockAssertNotOwner(lock)
}

public actual fun osLogCreate(subsystem: String?, category: String?): io.github.kotlinmania.libc.OsLogT =
    AppleModRawLibc.osLogCreate(subsystem, category)

public actual fun osLogTypeEnabled(oslog: io.github.kotlinmania.libc.OsLogT, tpe: io.github.kotlinmania.libc.OsLogTypeT): Boolean =
    AppleModRawLibc.osLogTypeEnabled(oslog, tpe)

public actual fun osSignpostIdMakeWithPointer(log: io.github.kotlinmania.libc.OsLogT, ptr: COpaquePointer?): io.github.kotlinmania.libc.OsSignpostIdT =
    AppleModRawLibc.osSignpostIdMakeWithPointer(log, ptr?.value ?: 0L)

public actual fun osSignpostIdGenerate(log: io.github.kotlinmania.libc.OsLogT): io.github.kotlinmania.libc.OsSignpostIdT =
    AppleModRawLibc.osSignpostIdGenerate(log)

public actual fun osSignpostEnabled(log: io.github.kotlinmania.libc.OsLogT): Boolean =
    AppleModRawLibc.osSignpostEnabled(log)

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    AppleModRawLibc.threadPolicySet(thread, flavor, policyInfo, count)

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: UInt?, getDefault: BooleanT?): KernReturnT =
    AppleModRawLibc.threadPolicyGet(thread, flavor, policyInfo, count?.toLong() ?: 0L, getDefault?.toLong() ?: 0L)

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: UInt?): KernReturnT =
    AppleModRawLibc.threadInfo(targetAct, flavor, threadInfoOut, threadInfoOutCnt?.toLong() ?: 0L)

public actual fun error(): CInt? =
    AppleModRawLibc.error()

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    AppleModRawLibc.backtrace(buf?.value ?: 0L, sz)

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    AppleModRawLibc.backtraceSymbols(addrs?.value ?: 0L, sz).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    AppleModRawLibc.backtraceSymbolsFd(addrs?.value ?: 0L, sz, fd)
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    AppleModRawLibc.backtraceFromFp(startfp?.value ?: 0L, array?.value ?: 0L, size)

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: ImageOffset?, size: CInt) {
    AppleModRawLibc.backtraceImageOffsets(array?.value ?: 0L, imageOffsets?.toLong() ?: 0L, size)
}

public actual fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: UInt?): SizeT =
    AppleModRawLibc.backtraceAsync(array?.value ?: 0L, length, taskId?.toLong() ?: 0L)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    AppleModRawLibc.statfs(path, buf?.toLong() ?: 0L)

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    AppleModRawLibc.fstatfs(fd, buf?.toLong() ?: 0L)

public actual fun kevent(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent?, nevents: CInt, timeout: Timespec?): CInt =
    AppleModRawLibc.kevent(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, timeout?.toLong() ?: 0L)

public actual fun kevent64(kq: CInt, changelist: io.github.kotlinmania.libc.Kevent64S?, nchanges: CInt, eventlist: io.github.kotlinmania.libc.Kevent64S?, nevents: CInt, flags: CUint, timeout: Timespec?): CInt =
    AppleModRawLibc.kevent64(kq, changelist?.toLong() ?: 0L, nchanges, eventlist?.toLong() ?: 0L, nevents, flags, timeout?.toLong() ?: 0L)

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    AppleModRawLibc.mount(src, target, flags, data?.value ?: 0L)

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    AppleModRawLibc.fmount(src, fd, flags, data?.value ?: 0L)

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    AppleModRawLibc.ptrace(request, pid, addr?.value ?: 0L, data)

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt =
    AppleModRawLibc.quotactl(special, cmd, id, data?.value ?: 0L)

public actual fun sethostname(name: String?, len: CInt): CInt =
    AppleModRawLibc.sethostname(name, len)

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: OffT?, hdtr: io.github.kotlinmania.libc.SfHdtr?, flags: CInt): CInt =
    AppleModRawLibc.sendfile(fd, s, offset, len?.toLong() ?: 0L, hdtr?.toLong() ?: 0L, flags)

public actual fun futimens(fd: CInt, times: Timespec?): CInt =
    AppleModRawLibc.futimens(fd, times?.toLong() ?: 0L)

public actual fun utimensat(dirfd: CInt, path: String?, times: Timespec?, flag: CInt): CInt =
    AppleModRawLibc.utimensat(dirfd, path, times?.toLong() ?: 0L, flag)

public actual fun openpty(amaster: CInt?, aslave: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): CInt =
    AppleModRawLibc.openpty(amaster?.toLong() ?: 0L, aslave?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun forkpty(amaster: CInt?, name: COpaquePointer?, termp: Termios?, winp: Winsize?): PidT =
    AppleModRawLibc.forkpty(amaster?.toLong() ?: 0L, name?.value ?: 0L, termp?.toLong() ?: 0L, winp?.toLong() ?: 0L)

public actual fun loginTty(fd: CInt): CInt =
    AppleModRawLibc.loginTty(fd)

public actual fun duplocale(base: LocaleT): LocaleT =
    AppleModRawLibc.duplocale(base)

public actual fun freelocale(loc: LocaleT): CInt =
    AppleModRawLibc.freelocale(loc)

public actual fun localeconvL(loc: LocaleT): Lconv? =
    AppleModRawLibc.localeconvL(loc)

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    AppleModRawLibc.newlocale(mask, locale, base)

public actual fun uselocale(loc: LocaleT): LocaleT =
    AppleModRawLibc.uselocale(loc)

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    AppleModRawLibc.querylocale(mask, loc).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpriority(which: CInt, who: io.github.kotlinmania.libc.IdT): CInt =
    AppleModRawLibc.getpriority(which, who)

public actual fun setpriority(which: CInt, who: io.github.kotlinmania.libc.IdT, prio: CInt): CInt =
    AppleModRawLibc.setpriority(which, who, prio)

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    AppleModRawLibc.getdomainname(name?.value ?: 0L, len)

public actual fun setdomainname(name: String?, len: CInt): CInt =
    AppleModRawLibc.setdomainname(name, len)

public actual fun preadv(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    AppleModRawLibc.preadv(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT): SsizeT =
    AppleModRawLibc.pwritev(fd, iov?.toLong() ?: 0L, iovcnt, offset)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    AppleModRawLibc.getxattr(path, name, value?.value ?: 0L, size, position, flags)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    AppleModRawLibc.fgetxattr(filedes, name, value?.value ?: 0L, size, position, flags)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    AppleModRawLibc.setxattr(path, name, value?.value ?: 0L, size, position, flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    AppleModRawLibc.fsetxattr(filedes, name, value?.value ?: 0L, size, position, flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    AppleModRawLibc.listxattr(path, list?.value ?: 0L, size, flags)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    AppleModRawLibc.flistxattr(filedes, list?.value ?: 0L, size, flags)

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    AppleModRawLibc.removexattr(path, name, flags)

public actual fun renamexNp(from: String?, to: String?, flags: CUint): CInt =
    AppleModRawLibc.renamexNp(from, to, flags)

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt =
    AppleModRawLibc.renameatxNp(fromfd, from, tofd, to, flags)

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    AppleModRawLibc.fremovexattr(filedes, name, flags)

public actual fun getgrouplist(name: String?, basegid: CInt, groups: CInt?, ngroups: CInt?): CInt =
    AppleModRawLibc.getgrouplist(name, basegid, groups?.toLong() ?: 0L, ngroups?.toLong() ?: 0L)

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    AppleModRawLibc.initgroups(user, basegroup)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: io.github.kotlinmania.libc.SiginfoT?, options: CInt): CInt =
    AppleModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    AppleModRawLibc.brk(addr?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sbrk(increment: CInt): COpaquePointer? =
    AppleModRawLibc.sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun settimeofday(tv: Timeval?, tz: io.github.kotlinmania.libc.Timezone?): CInt =
    AppleModRawLibc.settimeofday(tv?.toLong() ?: 0L, tz?.toLong() ?: 0L)

public actual fun dyldImageCount(): UInt =
    AppleModRawLibc.dyldImageCount()

public actual fun dyldGetImageHeader(imageIndex: UInt): MachHeader? =
    AppleModRawLibc.dyldGetImageHeader(imageIndex)

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    AppleModRawLibc.dyldGetImageVmaddrSlide(imageIndex)

public actual fun dyldGetImageName(imageIndex: UInt): COpaquePointer? =
    AppleModRawLibc.dyldGetImageName(imageIndex).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixSpawn(pid: PidT?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    AppleModRawLibc.posixSpawn(pid?.toLong() ?: 0L, path, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnp(pid: PidT?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    AppleModRawLibc.posixSpawnp(pid?.toLong() ?: 0L, file, fileActions?.value ?: 0L, attrp?.value ?: 0L, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    AppleModRawLibc.posixSpawnattrInit(attr?.value ?: 0L)

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    AppleModRawLibc.posixSpawnattrDestroy(attr?.value ?: 0L)

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: UInt?): CInt =
    AppleModRawLibc.posixSpawnattrGetsigdefault(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: UInt?): CInt =
    AppleModRawLibc.posixSpawnattrSetsigdefault(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: UInt?): CInt =
    AppleModRawLibc.posixSpawnattrGetsigmask(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: UInt?): CInt =
    AppleModRawLibc.posixSpawnattrSetsigmask(attr?.value ?: 0L, default?.toLong() ?: 0L)

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: CShort?): CInt =
    AppleModRawLibc.posixSpawnattrGetflags(attr?.value ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    AppleModRawLibc.posixSpawnattrSetflags(attr?.value ?: 0L, flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: PidT?): CInt =
    AppleModRawLibc.posixSpawnattrGetpgroup(attr?.value ?: 0L, flags?.toLong() ?: 0L)

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    AppleModRawLibc.posixSpawnattrSetpgroup(attr?.value ?: 0L, flags)

public actual fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, subpref: CInt?, ocount: SizeT?): CInt =
    AppleModRawLibc.posixSpawnattrSetarchprefNp(attr?.value ?: 0L, count, pref?.toLong() ?: 0L, subpref?.toLong() ?: 0L, ocount?.toLong() ?: 0L)

public actual fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, subpref: CInt?, ocount: SizeT?): CInt =
    AppleModRawLibc.posixSpawnattrGetarchprefNp(attr?.value ?: 0L, count, pref?.toLong() ?: 0L, subpref?.toLong() ?: 0L, ocount?.toLong() ?: 0L)

public actual fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, ocount: SizeT?): CInt =
    AppleModRawLibc.posixSpawnattrGetbinprefNp(attr?.value ?: 0L, count, pref?.toLong() ?: 0L, ocount?.toLong() ?: 0L)

public actual fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: CInt?, ocount: SizeT?): CInt =
    AppleModRawLibc.posixSpawnattrSetbinprefNp(attr?.value ?: 0L, count, pref?.toLong() ?: 0L, ocount?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    AppleModRawLibc.posixSpawnFileActionsInit(actions?.value ?: 0L)

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    AppleModRawLibc.posixSpawnFileActionsDestroy(actions?.value ?: 0L)

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    AppleModRawLibc.posixSpawnFileActionsAddopen(actions?.value ?: 0L, fd, path, oflag, mode)

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    AppleModRawLibc.posixSpawnFileActionsAddclose(actions?.value ?: 0L, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    AppleModRawLibc.posixSpawnFileActionsAdddup2(actions?.value ?: 0L, fd, newfd)

public actual fun uname(buf: Utsname?): CInt =
    AppleModRawLibc.uname(buf?.toLong() ?: 0L)

public actual fun connectx(socket: CInt, endpoints: SaEndpointsT?, associd: SaeAssocidT, flags: CUint, iov: Iovec?, iovcnt: CUint, len: SizeT?, connid: UInt?): CInt =
    AppleModRawLibc.connectx(socket, endpoints?.toLong() ?: 0L, associd, flags, iov?.toLong() ?: 0L, iovcnt, len?.toLong() ?: 0L, connid?.toLong() ?: 0L)

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    AppleModRawLibc.disconnectx(socket, associd, connid)

public actual fun ntpAdjtime(buf: Timex?): CInt =
    AppleModRawLibc.ntpAdjtime(buf?.toLong() ?: 0L)

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    AppleModRawLibc.ntpGettime(buf?.toLong() ?: 0L)

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    AppleModRawLibc.getmntinfo(mntbufp?.value ?: 0L, flags)

public actual fun getfsstat(mntbufp: Statfs?, bufsize: CInt, flags: CInt): CInt =
    AppleModRawLibc.getfsstat(mntbufp?.toLong() ?: 0L, bufsize, flags)

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    AppleModRawLibc.clonefile(src, dst, flags)

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    AppleModRawLibc.clonefileat(srcDirfd, src, dstDirfd, dst, flags)

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    AppleModRawLibc.fclonefileat(srcfd, dstDirfd, dst, flags)

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    AppleModRawLibc.copyfile(from, to, state, flags)

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    AppleModRawLibc.fcopyfile(from, to, state, flags)

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    AppleModRawLibc.copyfileStateFree(s)

public actual fun copyfileStateAlloc(): CopyfileStateT =
    AppleModRawLibc.copyfileStateAlloc()

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    AppleModRawLibc.copyfileStateGet(s, flags, dst?.value ?: 0L)

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    AppleModRawLibc.copyfileStateSet(s, flags, src?.value ?: 0L)

public actual fun machErrorString(errorValue: io.github.kotlinmania.libc.MachErrorT): COpaquePointer? =
    AppleModRawLibc.machErrorString(errorValue).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    AppleModRawLibc.memsetS(s?.value ?: 0L, smax, c, n)

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT) {
    AppleModRawLibc.memsetPattern4(b?.value ?: 0L, pattern4?.value ?: 0L, len)
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT) {
    AppleModRawLibc.memsetPattern8(b?.value ?: 0L, pattern8?.value ?: 0L, len)
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT) {
    AppleModRawLibc.memsetPattern16(b?.value ?: 0L, pattern16?.value ?: 0L, len)
}

public actual fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong =
    AppleModRawLibc.strtonum(numstr, minval, maxval, errstrp?.value ?: 0L)

public actual fun mstats(): Mstats =
    AppleModRawLibc.mstats()

public actual fun mallocZoneCheck(zone: MallocZoneT?): BooleanT =
    AppleModRawLibc.mallocZoneCheck(zone?.toLong() ?: 0L)

public actual fun mallocZonePrint(zone: MallocZoneT?, verbose: BooleanT) {
    AppleModRawLibc.mallocZonePrint(zone?.toLong() ?: 0L, verbose)
}

public actual fun mallocZoneStatistics(zone: MallocZoneT?, stats: MallocStatisticsT?) {
    AppleModRawLibc.mallocZoneStatistics(zone?.toLong() ?: 0L, stats?.toLong() ?: 0L)
}

public actual fun mallocZoneLog(zone: MallocZoneT?, address: COpaquePointer?) {
    AppleModRawLibc.mallocZoneLog(zone?.toLong() ?: 0L, address?.value ?: 0L)
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    AppleModRawLibc.mallocZonePrintPtrInfo(ptr?.value ?: 0L)
}

public actual fun mallocDefaultZone(): MallocZoneT? =
    AppleModRawLibc.mallocDefaultZone()

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): MallocZoneT? =
    AppleModRawLibc.mallocZoneFromPtr(ptr?.value ?: 0L)

public actual fun mallocZoneMalloc(zone: MallocZoneT?, size: SizeT): COpaquePointer? =
    AppleModRawLibc.mallocZoneMalloc(zone?.toLong() ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneValloc(zone: MallocZoneT?, size: SizeT): COpaquePointer? =
    AppleModRawLibc.mallocZoneValloc(zone?.toLong() ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneCalloc(zone: MallocZoneT?, numItems: SizeT, size: SizeT): COpaquePointer? =
    AppleModRawLibc.mallocZoneCalloc(zone?.toLong() ?: 0L, numItems, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneRealloc(zone: MallocZoneT?, ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    AppleModRawLibc.mallocZoneRealloc(zone?.toLong() ?: 0L, ptr?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneFree(zone: MallocZoneT?, ptr: COpaquePointer?) {
    AppleModRawLibc.mallocZoneFree(zone?.toLong() ?: 0L, ptr?.value ?: 0L)
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    AppleModRawLibc.procListpids(t, typeinfo, buffer?.value ?: 0L, buffersize)

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    AppleModRawLibc.procListallpids(buffer?.value ?: 0L, buffersize)

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    AppleModRawLibc.procListpgrppids(pgrpid, buffer?.value ?: 0L, buffersize)

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    AppleModRawLibc.procListchildpids(ppid, buffer?.value ?: 0L, buffersize)

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    AppleModRawLibc.procPidinfo(pid, flavor, arg, buffer?.value ?: 0L, buffersize)

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    AppleModRawLibc.procPidfdinfo(pid, fd, flavor, buffer?.value ?: 0L, buffersize)

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    AppleModRawLibc.procPidfileportinfo(pid, fileport, flavor, buffer?.value ?: 0L, buffersize)

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    AppleModRawLibc.procPidpath(pid, buffer?.value ?: 0L, buffersize)

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    AppleModRawLibc.procName(pid, buffer?.value ?: 0L, buffersize)

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    AppleModRawLibc.procRegionfilename(pid, address, buffer?.value ?: 0L, buffersize)

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    AppleModRawLibc.procKmsgbuf(buffer?.value ?: 0L, buffersize)

public actual fun procLibversion(major: CInt?, minor: CInt?): CInt =
    AppleModRawLibc.procLibversion(major?.toLong() ?: 0L, minor?.toLong() ?: 0L)

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt =
    AppleModRawLibc.procPidRusage(pid, flavor, buffer?.value ?: 0L)

public actual fun procSetNoSmt(): CInt =
    AppleModRawLibc.procSetNoSmt()

public actual fun procSetthreadNoSmt(): CInt =
    AppleModRawLibc.procSetthreadNoSmt()

public actual fun procSetCsm(flags: UInt): CInt =
    AppleModRawLibc.procSetCsm(flags)

public actual fun procSetthreadCsm(flags: UInt): CInt =
    AppleModRawLibc.procSetthreadCsm(flags)

public actual fun gethostuuid(id: COpaquePointer?, timeout: Timespec?): CInt =
    AppleModRawLibc.gethostuuid(id?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun gethostid(): CLong =
    AppleModRawLibc.gethostid()

public actual fun sethostid(hostid: CLong) {
    AppleModRawLibc.sethostid(hostid)
}

public actual fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): io.github.kotlinmania.libc.CCRNGStatus =
    AppleModRawLibc.cCRandomGenerateBytes(bytes?.value ?: 0L, size)

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    AppleModRawLibc.getentropy(buf?.value ?: 0L, buflen)

public actual fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: UInt?): CInt =
    AppleModRawLibc.nsgetExecutablePath(buf?.value ?: 0L, bufsize?.toLong() ?: 0L)

public actual fun nsgetArgv(): COpaquePointer? =
    AppleModRawLibc.nsgetArgv().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nsgetArgc(): CInt? =
    AppleModRawLibc.nsgetArgc()

public actual fun nsgetEnviron(): COpaquePointer? =
    AppleModRawLibc.nsgetEnviron().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nsgetProgname(): COpaquePointer? =
    AppleModRawLibc.nsgetProgname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun machVmMap(targetTask: io.github.kotlinmania.libc.VmMapT, address: ULong?, size: io.github.kotlinmania.libc.MachVmSizeT, mask: io.github.kotlinmania.libc.MachVmOffsetT, flags: CInt, obj: io.github.kotlinmania.libc.MemEntryNamePortT, offset: io.github.kotlinmania.libc.MemoryObjectOffsetT, copy: BooleanT, curProtection: io.github.kotlinmania.libc.VmProtT, maxProtection: io.github.kotlinmania.libc.VmProtT, inheritance: io.github.kotlinmania.libc.VmInheritT): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.machVmMap(targetTask, address?.toLong() ?: 0L, size, mask, flags, obj, offset, copy, curProtection, maxProtection, inheritance)

public actual fun vmAllocate(targetTask: VmMapT, address: UintptrT?, size: VmSizeT, flags: CInt): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.vmAllocate(targetTask, address?.toLong() ?: 0L, size, flags)

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.vmDeallocate(targetTask, address, size)

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.hostStatistics64(hostPriv, flavor, hostInfo64Out, hostInfo64OutCnt?.toLong() ?: 0L)

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: UInt?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.hostProcessorInfo(host, flavor, outProcessorCount?.toLong() ?: 0L, outProcessorInfo?.value ?: 0L, outProcessorInfoCnt?.toLong() ?: 0L)

public actual fun taskForPid(host: io.github.kotlinmania.libc.MachPortT, pid: PidT, task: CUint?): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.taskForPid(host, pid, task?.toLong() ?: 0L)

public actual fun taskInfo(host: io.github.kotlinmania.libc.MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: UInt?): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.taskInfo(host, flavor, taskInfoOut, taskInfoCount?.toLong() ?: 0L)

public actual fun taskCreate(targetTask: io.github.kotlinmania.libc.TaskT, ledgers: io.github.kotlinmania.libc.LedgerArrayT, ledgersCnt: io.github.kotlinmania.libc.MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: CUint?): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.taskCreate(targetTask, ledgers, ledgersCnt, inheritMemory, childTask?.toLong() ?: 0L)

public actual fun taskTerminate(targetTask: io.github.kotlinmania.libc.TaskT): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.taskTerminate(targetTask)

public actual fun taskThreads(targetTask: io.github.kotlinmania.libc.TaskInspectT, actList: COpaquePointer?, actListCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.taskThreads(targetTask, actList?.value ?: 0L, actListCnt?.toLong() ?: 0L)

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: UInt?): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.hostStatistics(hostPriv, flavor, hostInfoOut, hostInfoOutCnt?.toLong() ?: 0L)

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): io.github.kotlinmania.libc.SysdirSearchPathEnumerationState =
    AppleModRawLibc.sysdirStartSearchPathEnumeration(dir, domainMask)

public actual fun sysdirGetNextSearchPathEnumeration(state: io.github.kotlinmania.libc.SysdirSearchPathEnumerationState, path: COpaquePointer?): io.github.kotlinmania.libc.SysdirSearchPathEnumerationState =
    AppleModRawLibc.sysdirGetNextSearchPathEnumeration(state, path?.value ?: 0L)

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    AppleModRawLibc.getattrlist(path, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    AppleModRawLibc.fgetattrlist(fd, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt =
    AppleModRawLibc.getattrlistat(fd, path, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    AppleModRawLibc.setattrlist(path, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    AppleModRawLibc.fsetattrlist(fd, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    AppleModRawLibc.setattrlistat(dirFd, path, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt =
    AppleModRawLibc.getattrlistbulk(dirfd, attrList?.value ?: 0L, attrBuf?.value ?: 0L, attrBufSize, options)

public actual fun mallocSize(ptr: COpaquePointer?): SizeT =
    AppleModRawLibc.mallocSize(ptr?.value ?: 0L)

public actual fun mallocGoodSize(size: SizeT): SizeT =
    AppleModRawLibc.mallocGoodSize(size)

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    AppleModRawLibc.dirname(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    AppleModRawLibc.basename(path?.value ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    AppleModRawLibc.mkfifoat(dirfd, pathname, mode)

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    AppleModRawLibc.mknodat(dirfd, pathname, mode, dev)

public actual fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt =
    AppleModRawLibc.freadlink(fd, buf?.value ?: 0L, size)

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    AppleModRawLibc.execvP(file, searchPath, argv?.value ?: 0L)

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    AppleModRawLibc.qsortR(base?.value ?: 0L, num, size, arg?.value ?: 0L, compar?.toLong() ?: 0L)
}

public actual fun clockSettime(clockId: io.github.kotlinmania.libc.ClockidT, tp: Timespec?): CInt =
    AppleModRawLibc.clockSettime(clockId, tp?.toLong() ?: 0L)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    AppleModRawLibc.memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun taskSetInfo(targetTask: io.github.kotlinmania.libc.TaskT, flavor: io.github.kotlinmania.libc.TaskFlavorT, taskInfoIn: io.github.kotlinmania.libc.TaskInfoT, taskInfoInCnt: io.github.kotlinmania.libc.MachMsgTypeNumberT): io.github.kotlinmania.libc.KernReturnT =
    AppleModRawLibc.taskSetInfo(targetTask, flavor, taskInfoIn, taskInfoInCnt)

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    AppleModRawLibc.iconvOpen(tocode, fromcode)

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: SizeT?, outbuf: COpaquePointer?, outbytesleft: SizeT?): SizeT =
    AppleModRawLibc.iconv(cd, inbuf?.value ?: 0L, inbytesleft?.toLong() ?: 0L, outbuf?.value ?: 0L, outbytesleft?.toLong() ?: 0L)

public actual fun iconvClose(cd: IconvT): CInt =
    AppleModRawLibc.iconvClose(cd)
