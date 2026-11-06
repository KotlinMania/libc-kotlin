package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.COpaquePointer

internal object FreebsdModRawLibc {
    external fun fhlink(fhp: Long, to: String?): Int
    external fun fhlinkat(fhp: Long, tofd: Int, to: String?): Int
    external fun fhreadlink(fhp: Long, buf: Long, bufsize: Long): Int
    external fun getfhat(fd: Int, path: Long, fhp: Long, flag: Int): Int
    external fun error(): Long?
    external fun aioCancel(fd: Int, aiocbp: Long): Int
    external fun aioError(aiocbp: Long): Int
    external fun aioFsync(op: Int, aiocbp: Long): Int
    external fun aioRead(aiocbp: Long): Int
    external fun aioReadv(aiocbp: Long): Int
    external fun aioReturn(aiocbp: Long): Long
    external fun aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int
    external fun aioWrite(aiocbp: Long): Int
    external fun aioWritev(aiocbp: Long): Int
    external fun copyFileRange(infd: Int, inoffp: Long, outfd: Int, outoffp: Long, len: Long, flags: Int): Long
    external fun devnameR(dev: Long, mode: Int, buf: Long, len: Int): Long?
    external fun extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int
    external fun extattrDeleteFile(path: String?, attrnamespace: Int, attrname: String?): Int
    external fun extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int
    external fun extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long
    external fun extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long
    external fun extattrGetLink(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long
    external fun extattrListFd(fd: Int, attrnamespace: Int, data: Long, nbytes: Long): Long
    external fun extattrListFile(path: String?, attrnamespace: Int, data: Long, nbytes: Long): Long
    external fun extattrListLink(path: String?, attrnamespace: Int, data: Long, nbytes: Long): Long
    external fun extattrSetFd(fd: Int, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long
    external fun extattrSetFile(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long
    external fun extattrSetLink(path: String?, attrnamespace: Int, attrname: String?, data: Long, nbytes: Long): Long
    external fun fspacectl(fd: Int, cmd: Int, rqsr: Long, flags: Int, rmsr: Long): Int
    external fun jail(jail: Long): Int
    external fun jailAttach(jid: Int): Int
    external fun jailRemove(jid: Int): Int
    external fun jailGet(iov: Long, niov: Int, flags: Int): Int
    external fun jailSet(iov: Long, niov: Int, flags: Int): Int
    external fun lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int
    external fun getutxuser(user: String?): Long?
    external fun setutxdb(type: Int, file: String?): Int
    external fun aioWaitcomplete(iocbp: Long, timeout: Long): Long
    external fun mqGetfdNp(mqd: Long): Int
    external fun waitid(idtype: Long, id: Long, infop: Long, options: Int): Int
    external fun ptsnameR(fd: Int, buf: Long, buflen: Long): Int
    external fun ftok(pathname: String?, projId: Int): Long
    external fun shmget(key: Long, size: Long, shmflg: Int): Int
    external fun shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long?
    external fun shmdt(shmaddr: Long): Int
    external fun shmctl(shmid: Int, cmd: Int, buf: Long): Int
    external fun semget(key: Long, nsems: Int, semflg: Int): Int
    external fun semop(semid: Int, sops: Long, nsops: Long): Int
    external fun msgctl(msqid: Int, cmd: Int, buf: Long): Int
    external fun msgget(key: Long, msgflg: Int): Int
    external fun msgsnd(msqid: Int, msgp: Long, msgsz: Long, msgflg: Int): Int
    external fun cfmakesane(termios: Long)
    external fun pdfork(fdp: Long, flags: Int): Int
    external fun pdgetpid(fd: Int, pidp: Long): Int
    external fun pdkill(fd: Int, signum: Int): Int
    external fun rtprioThread(function: Int, lwpid: Long, rtp: Long): Int
    external fun uuidgen(store: Long, count: Int): Int
    external fun thrKill(id: Long, sig: Int): Int
    external fun thrKill2(pid: Int, id: Long, sig: Int): Int
    external fun thrSelf(tid: Long): Int
    external fun pthreadGetthreadidNp(): Int
    external fun pthreadGetaffinityNp(td: Long, cpusetsize: Long, cpusetp: Long): Int
    external fun pthreadSetaffinityNp(td: Long, cpusetsize: Long, cpusetp: Long): Int
    external fun schedGetaffinity(pid: Int, cpusetsz: Long, cpuset: Long): Int
    external fun schedSetaffinity(pid: Int, cpusetsz: Long, cpuset: Long): Int
    external fun schedGetcpu(): Int
    external fun pthreadMutexConsistent(mutex: Long): Int
    external fun pthreadMutexattrGetrobust(attr: Long, robust: Long): Int
    external fun pthreadMutexattrSetrobust(attr: Long, robust: Int): Int
    external fun pthreadSpinInit(lock: Long, pshared: Int): Int
    external fun pthreadSpinDestroy(lock: Long): Int
    external fun pthreadSpinLock(lock: Long): Int
    external fun pthreadSpinTrylock(lock: Long): Int
    external fun pthreadSpinUnlock(lock: Long): Int
    external fun pthreadTimedjoinNp(thread: Long, retval: Long, abstime: Long): Int
    external fun statfs(path: String?, buf: Long): Int
    external fun fstatfs(fd: Int, buf: Long): Int
    external fun dup3(src: Int, dst: Int, flags: Int): Int
    external fun xuname(nmln: Int, buf: Long): Int
    external fun sendmmsg(sockfd: Int, msgvec: Long, vlen: Long, flags: Int): Long
    external fun recvmmsg(sockfd: Int, msgvec: Long, vlen: Long, flags: Int, timeout: Long): Long
    external fun memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long?
    external fun fhopen(fhp: Long, flags: Int): Int
    external fun fhstat(fhp: Long, buf: Long): Int
    external fun fhstatfs(fhp: Long, buf: Long): Int
    external fun getfh(path: String?, fhp: Long): Int
    external fun lgetfh(path: String?, fhp: Long): Int
    external fun getfsstat(buf: Long, bufsize: Long, mode: Int): Int
    external fun getmntinfo(mntbufp: Long, mode: Int): Int
    external fun mount(type: String?, dir: String?, flags: Int, data: Long): Int
    external fun nmount(iov: Long, niov: Int, flags: Int): Int
    external fun rfork(flags: Int): Int
    external fun cpusetGetaffinity(level: Long, which: Long, id: Long, setsize: Long, mask: Long): Int
    external fun cpusetSetaffinity(level: Long, which: Long, id: Long, setsize: Long, mask: Long): Int
    external fun cpuset(setid: Long): Int
    external fun cpusetGetid(level: Long, which: Long, id: Long, setid: Long): Int
    external fun cpusetSetid(which: Long, id: Long, setid: Long): Int
    external fun capEnter(): Int
    external fun capGetmode(modep: Long): Int
    external fun capFcntlsGet(fd: Int, fcntlrightsp: Long): Int
    external fun capFcntlsLimit(fd: Int, fcntlrights: Int): Int
    external fun capIoctlsGet(fd: Int, cmds: Long, maxcmds: Long): Long
    external fun capIoctlsLimit(fd: Int, cmds: Long, ncmds: Long): Int
    external fun capRightsGet(version: Int, fd: Int, rightsp: Long): Int
    external fun capRightsIsValid(rights: Long): Boolean
    external fun capRightsLimit(fd: Int, rights: Long): Int
    external fun capRightsMerge(dst: Long, src: Long): Long?
    external fun capRightsRemove(dst: Long, src: Long): Long?
    external fun capRightsContains(big: Long, little: Long): Boolean
    external fun capSandboxed(): Boolean
    external fun reallocarray(ptr: Long, nmemb: Long, size: Long): Long?
    external fun ffs(value: Int): Int
    external fun ffsl(value: Long): Int
    external fun ffsll(value: Long): Int
    external fun fls(value: Int): Int
    external fun flsl(value: Long): Int
    external fun flsll(value: Long): Int
    external fun mallocStatsPrint(writeCb: Long, cbopaque: Long, opt: String?)
    external fun mallctl(name: String?, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun mallctlnametomib(name: String?, mibp: Long, miplen: Long): Int
    external fun mallctlbymib(mib: Long, mible: Long, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int
    external fun mallocx(size: Long, flags: Int): Long?
    external fun rallocx(ptr: Long, size: Long, flags: Int): Long?
    external fun xallocx(ptr: Long, size: Long, extra: Long, flags: Int): Long
    external fun sallocx(ptr: Long, flags: Int): Long
    external fun dallocx(ptr: Long, flags: Int)
    external fun sdallocx(ptr: Long, size: Long, flags: Int)
    external fun nallocx(size: Long, flags: Int): Long
    external fun procctl(idtype: Long, id: Long, cmd: Int, data: Long): Int
    external fun getpagesize(): Int
    external fun getpagesizes(pagesize: Long, nelem: Int): Int
    external fun clockGetcpuclockid2(arg1: Long, arg2: Int, arg3: Long): Int
    external fun strchrnul(s: String?, c: Int): Long?
    external fun shmCreateLargepage(path: String?, flags: Int, psind: Int, allocPolicy: Int, mode: Int): Int
    external fun shmRename(pathFrom: String?, pathTo: String?, flags: Int): Int
    external fun memfdCreate(name: String?, flags: Int): Int
    external fun setaudit(auditinfo: Long): Int
    external fun eventfd(initval: Int, flags: Int): Int
    external fun eventfdRead(fd: Int, value: Long): Int
    external fun eventfdWrite(fd: Int, value: Long): Int
    external fun fdatasync(fd: Int): Int
    external fun elfAuxInfo(aux: Int, buf: Long, buflen: Int): Int
    external fun timingsafeBcmp(a: Long, b: Long, len: Long): Int
    external fun timingsafeMemcmp(a: Long, b: Long, len: Long): Int
    external fun umtxOp(obj: Long, op: Int, value: Long, uaddr: Long, uaddr2: Long): Int
    external fun sctpPeeloff(s: Int, id: Long): Int
    external fun sctpBindx(s: Int, addrs: Long, num: Int, tpe: Int): Int
    external fun sctpConnectx(s: Int, addrs: Long, addrcnt: Int, id: Long): Int
    external fun sctpGetaddrlen(family: Long): Int
    external fun sctpGetpaddrs(s: Int, asocid: Long, addrs: Long): Int
    external fun sctpFreepaddrs(addrs: Long)
    external fun sctpGetladdrs(s: Int, asocid: Long, addrs: Long): Int
    external fun sctpFreeladdrs(addrs: Long)
    external fun sctpOptInfo(s: Int, id: Long, opt: Int, arg: Long, size: Long): Int
    external fun sctpSendv(sd: Int, iov: Long, iovcnt: Int, addrs: Long, addrcnt: Int, info: Long, infolen: Int, infotype: Int, flags: Int): Long
    external fun sctpRecvv(sd: Int, iov: Long, iovcnt: Int, from: Long, fromlen: Long, info: Long, infolen: Long, infotype: Long, flags: Long): Long
    external fun timerfdCreate(clockid: Int, flags: Int): Int
    external fun timerfdGettime(fd: Int, currValue: Long): Int
    external fun timerfdSettime(fd: Int, flags: Int, newValue: Long, oldValue: Long): Int
    external fun closefrom(lowfd: Int)
    external fun closeRange(lowfd: Int, highfd: Int, flags: Int): Int
    external fun execvpe(file: String?, argv: Long, envp: Long): Int
    external fun kcmp(pid1: Int, pid2: Int, type: Int, idx1: Long, idx2: Long): Int
    external fun dlvsym(handle: Long, symbol: String?, version: String?): Long?
    external fun memstatStrerror(error: Int): Long?
    external fun memstatMtlAlloc(): Long?
    external fun memstatMtlFirst(list: Long): Long?
    external fun memstatMtlNext(mtp: Long): Long?
    external fun memstatMtlFind(list: Long, allocator: Int, name: String?): Long?
    external fun memstatMtlFree(list: Long)
    external fun memstatMtlGeterror(list: Long): Int
    external fun memstatGetName(mtp: Long): Long?
    external fun kvmDpcpuSetcpu(kd: Long, cpu: Int): Int
    external fun kvmGetargv(kd: Long, p: Long, nchr: Int): Long?
    external fun kvmGetcptime(kd: Long, cpTime: Long): Int
    external fun kvmGetenvv(kd: Long, p: Long, nchr: Int): Long?
    external fun kvmGeterr(kd: Long): Long?
    external fun kvmGetmaxcpu(kd: Long): Int
    external fun kvmGetncpus(kd: Long): Int
    external fun kvmGetpcpu(kd: Long, cpu: Int): Long?
    external fun kvmCounterU64Fetch(kd: Long, base: Long): Long
    external fun kvmGetswapinfo(kd: Long, info: Long, maxswap: Int, flags: Int): Int
    external fun kvmNative(kd: Long): Int
    external fun kvmNlist(kd: Long, nl: Long): Int
    external fun kvmNlist2(kd: Long, nl: Long): Int
    external fun kvmReadZpcpu(kd: Long, base: Long, buf: Long, size: Long, cpu: Int): Long
    external fun kvmRead2(kd: Long, addr: Long, buf: Long, nbytes: Long): Long
    external fun extattrNamespaceToString(attrnamespace: Int, string: Long): Int
    external fun extattrStringToNamespace(string: String?, attrnamespace: Long): Int
    external fun realhostname(host: Long, hsize: Long, ip: Long): Int
    external fun realhostnameSa(host: Long, hsize: Long, addr: Long, addrlen: Int): Int
    external fun kldIsloaded(name: String?): Int
    external fun kldLoad(name: String?): Int
    external fun kinfoGetvmmap(pid: Int, cntp: Long): Long?
    external fun hexdump(ptr: Long, length: Int, hdr: String?, flags: Int)
    external fun humanizeNumber(buf: Long, len: Long, number: Long, suffix: String?, scale: Int, flags: Int): Int
    external fun getlocalbase(): Long?
    external fun pidfileOpen(path: String?, mode: Int, pidptr: Long): Long?
    external fun pidfileWrite(path: Long): Int
    external fun pidfileClose(path: Long): Int
    external fun pidfileRemove(path: Long): Int
    external fun pidfileFileno(path: Long): Int
    external fun procstatOpenSysctl(): Long?
    external fun procstatGetfiles(procstat: Long, kp: Long, mmapped: Int): Long?
    external fun procstatFreefiles(procstat: Long, head: Long)
    external fun procstatGetprocs(procstat: Long, what: Int, arg: Int, count: Long): Long?
    external fun procstatFreeprocs(procstat: Long, p: Long)
    external fun procstatGetvmmap(procstat: Long, kp: Long, count: Long): Long?
    external fun procstatFreevmmap(procstat: Long, vmmap: Long)
    external fun procstatClose(procstat: Long)
    external fun procstatFreeargv(procstat: Long)
    external fun procstatFreeenvv(procstat: Long)
    external fun procstatFreegroups(procstat: Long, groups: Long)
    external fun procstatFreeptlwpinfo(procstat: Long, pl: Long)
    external fun procstatGetargv(procstat: Long, kp: Long, nchr: Long): Long?
    external fun procstatGetenvv(procstat: Long, kp: Long, nchr: Long): Long?
    external fun procstatGetgroups(procstat: Long, kp: Long, count: Long): Long?
    external fun procstatGetosrel(procstat: Long, kp: Long, osrelp: Long): Int
    external fun procstatGetpathname(procstat: Long, kp: Long, pathname: Long, maxlen: Long): Int
    external fun procstatGetrlimit(procstat: Long, kp: Long, which: Int, rlimit: Long): Int
    external fun procstatGetumask(procstat: Long, kp: Long, maskp: Long): Int
    external fun procstatOpenCore(filename: String?): Long?
    external fun procstatOpenKvm(nlistf: String?, memf: String?): Long?
    external fun procstatGetSocketInfo(proc: Long, fst: Long, sock: Long, errbuf: Long): Int
    external fun procstatGetVnodeInfo(proc: Long, fst: Long, vn: Long, errbuf: Long): Int
    external fun procstatGetPtsInfo(proc: Long, fst: Long, pts: Long, errbuf: Long): Int
    external fun procstatGetShmInfo(proc: Long, fst: Long, shm: Long, errbuf: Long): Int
    external fun timerCreate(clockId: Int, evp: Long, timerid: Long): Int
    external fun timerDelete(timerid: Long): Int
    external fun timerGetoverrun(timerid: Long): Int
    external fun timerGettime(timerid: Long, value: Long): Int
    external fun timerSettime(timerid: Long, flags: Int, value: Long, ovalue: Long): Int
    external fun devstatGetnumdevs(kd: Long): Int
    external fun devstatGetgeneration(kd: Long): Long
    external fun devstatGetversion(kd: Long): Int
    external fun devstatCheckversion(kd: Long): Int
    external fun devstatSelectdevs(devSelect: Long, numSelected: Long, numSelections: Long, selectGeneration: Long, currentGeneration: Long, devices: Long, numdevs: Int, matches: Long, numMatches: Int, devSelections: Long, numDevSelections: Int, selectMode: Long, maxshowdevs: Int, perfSelect: Int): Int
    external fun devstatBuildmatch(matchStr: Long, matches: Long, numMatches: Long): Int
}

public actual fun fhlink(fhp: Fhandle?, to: String?): CInt =
    FreebsdModRawLibc.fhlink(fhp?.toLong() ?: 0L, to)

public actual fun fhlinkat(fhp: Fhandle?, tofd: CInt, to: String?): CInt =
    FreebsdModRawLibc.fhlinkat(fhp?.toLong() ?: 0L, tofd, to)

public actual fun fhreadlink(fhp: Fhandle?, buf: COpaquePointer?, bufsize: SizeT): CInt =
    FreebsdModRawLibc.fhreadlink(fhp?.toLong() ?: 0L, buf?.value ?: 0L, bufsize)

public actual fun getfhat(fd: CInt, path: COpaquePointer?, fhp: Fhandle?, flag: CInt): CInt =
    FreebsdModRawLibc.getfhat(fd, path?.value ?: 0L, fhp?.toLong() ?: 0L, flag)

public actual fun error(): CInt? =
    FreebsdModRawLibc.error()

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    FreebsdModRawLibc.aioCancel(fd, aiocbp?.toLong() ?: 0L)

public actual fun aioError(aiocbp: Aiocb?): CInt =
    FreebsdModRawLibc.aioError(aiocbp?.toLong() ?: 0L)

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    FreebsdModRawLibc.aioFsync(op, aiocbp?.toLong() ?: 0L)

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    FreebsdModRawLibc.aioRead(aiocbp?.toLong() ?: 0L)

public actual fun aioReadv(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    FreebsdModRawLibc.aioReadv(aiocbp?.toLong() ?: 0L)

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    FreebsdModRawLibc.aioReturn(aiocbp?.toLong() ?: 0L)

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    FreebsdModRawLibc.aioSuspend(aiocbList?.value ?: 0L, nitems, timeout?.toLong() ?: 0L)

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    FreebsdModRawLibc.aioWrite(aiocbp?.toLong() ?: 0L)

public actual fun aioWritev(aiocbp: io.github.kotlinmania.libc.Aiocb?): CInt =
    FreebsdModRawLibc.aioWritev(aiocbp?.toLong() ?: 0L)

public actual fun copyFileRange(infd: CInt, inoffp: OffT?, outfd: CInt, outoffp: OffT?, len: SizeT, flags: CUint): SsizeT =
    FreebsdModRawLibc.copyFileRange(infd, inoffp?.toLong() ?: 0L, outfd, outoffp?.toLong() ?: 0L, len, flags)

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: CInt): COpaquePointer? =
    FreebsdModRawLibc.devnameR(dev, mode, buf?.value ?: 0L, len).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    FreebsdModRawLibc.extattrDeleteFd(fd, attrnamespace, attrname)

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    FreebsdModRawLibc.extattrDeleteFile(path, attrnamespace, attrname)

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    FreebsdModRawLibc.extattrDeleteLink(path, attrnamespace, attrname)

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdModRawLibc.extattrGetFd(fd, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdModRawLibc.extattrGetFile(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdModRawLibc.extattrGetLink(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdModRawLibc.extattrListFd(fd, attrnamespace, data?.value ?: 0L, nbytes)

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdModRawLibc.extattrListFile(path, attrnamespace, data?.value ?: 0L, nbytes)

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdModRawLibc.extattrListLink(path, attrnamespace, data?.value ?: 0L, nbytes)

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdModRawLibc.extattrSetFd(fd, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdModRawLibc.extattrSetFile(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdModRawLibc.extattrSetLink(path, attrnamespace, attrname, data?.value ?: 0L, nbytes)

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: SpacectlRange?, flags: CInt, rmsr: SpacectlRange?): CInt =
    FreebsdModRawLibc.fspacectl(fd, cmd, rqsr?.toLong() ?: 0L, flags, rmsr?.toLong() ?: 0L)

public actual fun jail(jail: io.github.kotlinmania.libc.Jail?): CInt =
    FreebsdModRawLibc.jail(jail?.toLong() ?: 0L)

public actual fun jailAttach(jid: CInt): CInt =
    FreebsdModRawLibc.jailAttach(jid)

public actual fun jailRemove(jid: CInt): CInt =
    FreebsdModRawLibc.jailRemove(jid)

public actual fun jailGet(iov: Iovec?, niov: CUint, flags: CInt): CInt =
    FreebsdModRawLibc.jailGet(iov?.toLong() ?: 0L, niov, flags)

public actual fun jailSet(iov: Iovec?, niov: CUint, flags: CInt): CInt =
    FreebsdModRawLibc.jailSet(iov?.toLong() ?: 0L, niov, flags)

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    FreebsdModRawLibc.lioListio(mode, aiocbList?.value ?: 0L, nitems, sevp?.toLong() ?: 0L)

public actual fun getutxuser(user: String?): Utmpx? =
    FreebsdModRawLibc.getutxuser(user)

public actual fun setutxdb(type: CInt, file: String?): CInt =
    FreebsdModRawLibc.setutxdb(type, file)

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): SsizeT =
    FreebsdModRawLibc.aioWaitcomplete(iocbp?.value ?: 0L, timeout?.toLong() ?: 0L)

public actual fun mqGetfdNp(mqd: io.github.kotlinmania.libc.MqdT): CInt =
    FreebsdModRawLibc.mqGetfdNp(mqd)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    FreebsdModRawLibc.waitid(idtype, id, infop?.toLong() ?: 0L, options)

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    FreebsdModRawLibc.ptsnameR(fd, buf?.value ?: 0L, buflen)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    FreebsdModRawLibc.ftok(pathname, projId)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    FreebsdModRawLibc.shmget(key, size, shmflg)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    FreebsdModRawLibc.shmat(shmid, shmaddr?.value ?: 0L, shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    FreebsdModRawLibc.shmdt(shmaddr?.value ?: 0L)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    FreebsdModRawLibc.shmctl(shmid, cmd, buf?.toLong() ?: 0L)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    FreebsdModRawLibc.semget(key, nsems, semflg)

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: SizeT): CInt =
    FreebsdModRawLibc.semop(semid, sops?.toLong() ?: 0L, nsops)

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: io.github.kotlinmania.libc.MsqidDs?): CInt =
    FreebsdModRawLibc.msgctl(msqid, cmd, buf?.toLong() ?: 0L)

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    FreebsdModRawLibc.msgget(key, msgflg)

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    FreebsdModRawLibc.msgsnd(msqid, msgp?.value ?: 0L, msgsz, msgflg)

public actual fun cfmakesane(termios: Termios?) {
    FreebsdModRawLibc.cfmakesane(termios?.toLong() ?: 0L)
}

public actual fun pdfork(fdp: CInt?, flags: CInt): PidT =
    FreebsdModRawLibc.pdfork(fdp?.toLong() ?: 0L, flags)

public actual fun pdgetpid(fd: CInt, pidp: PidT?): CInt =
    FreebsdModRawLibc.pdgetpid(fd, pidp?.toLong() ?: 0L)

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    FreebsdModRawLibc.pdkill(fd, signum)

public actual fun rtprioThread(function: CInt, lwpid: io.github.kotlinmania.libc.LwpidT, rtp: Rtprio?): CInt =
    FreebsdModRawLibc.rtprioThread(function, lwpid, rtp?.toLong() ?: 0L)

public actual fun uuidgen(store: Uuid?, count: CInt): CInt =
    FreebsdModRawLibc.uuidgen(store?.toLong() ?: 0L, count)

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    FreebsdModRawLibc.thrKill(id, sig)

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    FreebsdModRawLibc.thrKill2(pid, id, sig)

public actual fun thrSelf(tid: CLong?): CInt =
    FreebsdModRawLibc.thrSelf(tid?.toLong() ?: 0L)

public actual fun pthreadGetthreadidNp(): CInt =
    FreebsdModRawLibc.pthreadGetthreadidNp()

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: CpusetT?): CInt =
    FreebsdModRawLibc.pthreadGetaffinityNp(td, cpusetsize, cpusetp?.toLong() ?: 0L)

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: CpusetT?): CInt =
    FreebsdModRawLibc.pthreadSetaffinityNp(td, cpusetsize, cpusetp?.toLong() ?: 0L)

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: io.github.kotlinmania.libc.CpusetT?): CInt =
    FreebsdModRawLibc.schedGetaffinity(pid, cpusetsz, cpuset?.toLong() ?: 0L)

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: io.github.kotlinmania.libc.CpusetT?): CInt =
    FreebsdModRawLibc.schedSetaffinity(pid, cpusetsz, cpuset?.toLong() ?: 0L)

public actual fun schedGetcpu(): CInt =
    FreebsdModRawLibc.schedGetcpu()

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT?): CInt =
    FreebsdModRawLibc.pthreadMutexConsistent(mutex?.toLong() ?: 0L)

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT?, robust: CInt?): CInt =
    FreebsdModRawLibc.pthreadMutexattrGetrobust(attr?.toLong() ?: 0L, robust?.toLong() ?: 0L)

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT?, robust: CInt): CInt =
    FreebsdModRawLibc.pthreadMutexattrSetrobust(attr?.toLong() ?: 0L, robust)

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    FreebsdModRawLibc.pthreadSpinInit(lock?.value ?: 0L, pshared)

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    FreebsdModRawLibc.pthreadSpinDestroy(lock?.value ?: 0L)

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    FreebsdModRawLibc.pthreadSpinLock(lock?.value ?: 0L)

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    FreebsdModRawLibc.pthreadSpinTrylock(lock?.value ?: 0L)

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    FreebsdModRawLibc.pthreadSpinUnlock(lock?.value ?: 0L)

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    FreebsdModRawLibc.pthreadTimedjoinNp(thread, retval?.value ?: 0L, abstime?.toLong() ?: 0L)

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    FreebsdModRawLibc.statfs(path, buf?.toLong() ?: 0L)

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    FreebsdModRawLibc.fstatfs(fd, buf?.toLong() ?: 0L)

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    FreebsdModRawLibc.dup3(src, dst, flags)

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    FreebsdModRawLibc.xuname(nmln, buf?.value ?: 0L)

public actual fun sendmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: SizeT, flags: CInt): SsizeT =
    FreebsdModRawLibc.sendmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: io.github.kotlinmania.libc.Mmsghdr?, vlen: SizeT, flags: CInt, timeout: Timespec?): SsizeT =
    FreebsdModRawLibc.recvmmsg(sockfd, msgvec?.toLong() ?: 0L, vlen, flags, timeout?.toLong() ?: 0L)

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    FreebsdModRawLibc.memmem(haystack?.value ?: 0L, haystacklen, needle?.value ?: 0L, needlelen).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun fhopen(fhp: Fhandle?, flags: CInt): CInt =
    FreebsdModRawLibc.fhopen(fhp?.toLong() ?: 0L, flags)

public actual fun fhstat(fhp: Fhandle?, buf: Stat?): CInt =
    FreebsdModRawLibc.fhstat(fhp?.toLong() ?: 0L, buf?.toLong() ?: 0L)

public actual fun fhstatfs(fhp: Fhandle?, buf: Statfs?): CInt =
    FreebsdModRawLibc.fhstatfs(fhp?.toLong() ?: 0L, buf?.toLong() ?: 0L)

public actual fun getfh(path: String?, fhp: Fhandle?): CInt =
    FreebsdModRawLibc.getfh(path, fhp?.toLong() ?: 0L)

public actual fun lgetfh(path: String?, fhp: Fhandle?): CInt =
    FreebsdModRawLibc.lgetfh(path, fhp?.toLong() ?: 0L)

public actual fun getfsstat(buf: Statfs?, bufsize: CLong, mode: CInt): CInt =
    FreebsdModRawLibc.getfsstat(buf?.toLong() ?: 0L, bufsize, mode)

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    FreebsdModRawLibc.getmntinfo(mntbufp?.value ?: 0L, mode)

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    FreebsdModRawLibc.mount(type, dir, flags, data?.value ?: 0L)

public actual fun nmount(iov: Iovec?, niov: CUint, flags: CInt): CInt =
    FreebsdModRawLibc.nmount(iov?.toLong() ?: 0L, niov, flags)

public actual fun rfork(flags: CInt): CInt =
    FreebsdModRawLibc.rfork(flags)

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CpusetT?): CInt =
    FreebsdModRawLibc.cpusetGetaffinity(level, which, id, setsize, mask?.toLong() ?: 0L)

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: CpusetT?): CInt =
    FreebsdModRawLibc.cpusetSetaffinity(level, which, id, setsize, mask?.toLong() ?: 0L)

public actual fun cpuset(setid: CInt?): CInt =
    FreebsdModRawLibc.cpuset(setid?.toLong() ?: 0L)

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: CInt?): CInt =
    FreebsdModRawLibc.cpusetGetid(level, which, id, setid?.toLong() ?: 0L)

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: io.github.kotlinmania.libc.CpusetidT): CInt =
    FreebsdModRawLibc.cpusetSetid(which, id, setid)

public actual fun capEnter(): CInt =
    FreebsdModRawLibc.capEnter()

public actual fun capGetmode(modep: CUint?): CInt =
    FreebsdModRawLibc.capGetmode(modep?.toLong() ?: 0L)

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: CUint?): CInt =
    FreebsdModRawLibc.capFcntlsGet(fd, fcntlrightsp?.toLong() ?: 0L)

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    FreebsdModRawLibc.capFcntlsLimit(fd, fcntlrights)

public actual fun capIoctlsGet(fd: CInt, cmds: CUlong?, maxcmds: ULong): Long =
    FreebsdModRawLibc.capIoctlsGet(fd, cmds?.toLong() ?: 0L, maxcmds)

public actual fun capIoctlsLimit(fd: CInt, cmds: CUlong?, ncmds: ULong): CInt =
    FreebsdModRawLibc.capIoctlsLimit(fd, cmds?.toLong() ?: 0L, ncmds)

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: CapRightsT?): CInt =
    FreebsdModRawLibc.capRightsGet(version, fd, rightsp?.toLong() ?: 0L)

public actual fun capRightsIsValid(rights: CapRightsT?): Boolean =
    FreebsdModRawLibc.capRightsIsValid(rights?.toLong() ?: 0L)

public actual fun capRightsLimit(fd: CInt, rights: CapRightsT?): CInt =
    FreebsdModRawLibc.capRightsLimit(fd, rights?.toLong() ?: 0L)

public actual fun capRightsMerge(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    FreebsdModRawLibc.capRightsMerge(dst?.toLong() ?: 0L, src?.toLong() ?: 0L)

public actual fun capRightsRemove(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    FreebsdModRawLibc.capRightsRemove(dst?.toLong() ?: 0L, src?.toLong() ?: 0L)

public actual fun capRightsContains(big: CapRightsT?, little: CapRightsT?): Boolean =
    FreebsdModRawLibc.capRightsContains(big?.toLong() ?: 0L, little?.toLong() ?: 0L)

public actual fun capSandboxed(): Boolean =
    FreebsdModRawLibc.capSandboxed()

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    FreebsdModRawLibc.reallocarray(ptr?.value ?: 0L, nmemb, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ffs(value: CInt): CInt =
    FreebsdModRawLibc.ffs(value)

public actual fun ffsl(value: CLong): CInt =
    FreebsdModRawLibc.ffsl(value)

public actual fun ffsll(value: CLonglong): CInt =
    FreebsdModRawLibc.ffsll(value)

public actual fun fls(value: CInt): CInt =
    FreebsdModRawLibc.fls(value)

public actual fun flsl(value: CLong): CInt =
    FreebsdModRawLibc.flsl(value)

public actual fun flsll(value: CLonglong): CInt =
    FreebsdModRawLibc.flsll(value)

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: COpaquePointer?, opt: String?) {
    FreebsdModRawLibc.mallocStatsPrint(writeCb, cbopaque?.value ?: 0L, opt)
}

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    FreebsdModRawLibc.mallctl(name, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun mallctlnametomib(name: String?, mibp: SizeT?, miplen: SizeT?): CInt =
    FreebsdModRawLibc.mallctlnametomib(name, mibp?.toLong() ?: 0L, miplen?.toLong() ?: 0L)

public actual fun mallctlbymib(mib: SizeT?, mible: SizeT, oldp: COpaquePointer?, oldlenp: SizeT?, newp: COpaquePointer?, newlen: SizeT): CInt =
    FreebsdModRawLibc.mallctlbymib(mib?.toLong() ?: 0L, mible, oldp?.value ?: 0L, oldlenp?.toLong() ?: 0L, newp?.value ?: 0L, newlen)

public actual fun mallocx(size: SizeT, flags: CInt): COpaquePointer? =
    FreebsdModRawLibc.mallocx(size, flags).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun rallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): COpaquePointer? =
    FreebsdModRawLibc.rallocx(ptr?.value ?: 0L, size, flags).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun xallocx(ptr: COpaquePointer?, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    FreebsdModRawLibc.xallocx(ptr?.value ?: 0L, size, extra, flags)

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): SizeT =
    FreebsdModRawLibc.sallocx(ptr?.value ?: 0L, flags)

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt) {
    FreebsdModRawLibc.dallocx(ptr?.value ?: 0L, flags)
}

public actual fun sdallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt) {
    FreebsdModRawLibc.sdallocx(ptr?.value ?: 0L, size, flags)
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    FreebsdModRawLibc.nallocx(size, flags)

public actual fun procctl(idtype: io.github.kotlinmania.libc.IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    FreebsdModRawLibc.procctl(idtype, id, cmd, data?.value ?: 0L)

public actual fun getpagesize(): CInt =
    FreebsdModRawLibc.getpagesize()

public actual fun getpagesizes(pagesize: SizeT?, nelem: CInt): CInt =
    FreebsdModRawLibc.getpagesizes(pagesize?.toLong() ?: 0L, nelem)

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: CInt?): CInt =
    FreebsdModRawLibc.clockGetcpuclockid2(arg1, arg2, arg3?.toLong() ?: 0L)

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    FreebsdModRawLibc.strchrnul(s, c).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    FreebsdModRawLibc.shmCreateLargepage(path, flags, psind, allocPolicy, mode)

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    FreebsdModRawLibc.shmRename(pathFrom, pathTo, flags)

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    FreebsdModRawLibc.memfdCreate(name, flags)

public actual fun setaudit(auditinfo: AuditinfoT?): CInt =
    FreebsdModRawLibc.setaudit(auditinfo?.toLong() ?: 0L)

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    FreebsdModRawLibc.eventfd(initval, flags)

public actual fun eventfdRead(fd: CInt, value: CUlong?): CInt =
    FreebsdModRawLibc.eventfdRead(fd, value?.toLong() ?: 0L)

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    FreebsdModRawLibc.eventfdWrite(fd, value)

public actual fun fdatasync(fd: CInt): CInt =
    FreebsdModRawLibc.fdatasync(fd)

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    FreebsdModRawLibc.elfAuxInfo(aux, buf?.value ?: 0L, buflen)

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    FreebsdModRawLibc.timingsafeBcmp(a?.value ?: 0L, b?.value ?: 0L, len)

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    FreebsdModRawLibc.timingsafeMemcmp(a?.value ?: 0L, b?.value ?: 0L, len)

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, value: CUlong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    FreebsdModRawLibc.umtxOp(obj?.value ?: 0L, op, value, uaddr?.value ?: 0L, uaddr2?.value ?: 0L)

public actual fun sctpPeeloff(s: CInt, id: io.github.kotlinmania.libc.SctpAssocT): CInt =
    FreebsdModRawLibc.sctpPeeloff(s, id)

public actual fun sctpBindx(s: CInt, addrs: Sockaddr?, num: CInt, tpe: CInt): CInt =
    FreebsdModRawLibc.sctpBindx(s, addrs?.toLong() ?: 0L, num, tpe)

public actual fun sctpConnectx(s: CInt, addrs: Sockaddr?, addrcnt: CInt, id: CUint?): CInt =
    FreebsdModRawLibc.sctpConnectx(s, addrs?.toLong() ?: 0L, addrcnt, id?.toLong() ?: 0L)

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    FreebsdModRawLibc.sctpGetaddrlen(family)

public actual fun sctpGetpaddrs(s: CInt, asocid: io.github.kotlinmania.libc.SctpAssocT, addrs: COpaquePointer?): CInt =
    FreebsdModRawLibc.sctpGetpaddrs(s, asocid, addrs?.value ?: 0L)

public actual fun sctpFreepaddrs(addrs: Sockaddr?) {
    FreebsdModRawLibc.sctpFreepaddrs(addrs?.toLong() ?: 0L)
}

public actual fun sctpGetladdrs(s: CInt, asocid: io.github.kotlinmania.libc.SctpAssocT, addrs: COpaquePointer?): CInt =
    FreebsdModRawLibc.sctpGetladdrs(s, asocid, addrs?.value ?: 0L)

public actual fun sctpFreeladdrs(addrs: Sockaddr?) {
    FreebsdModRawLibc.sctpFreeladdrs(addrs?.toLong() ?: 0L)
}

public actual fun sctpOptInfo(s: CInt, id: io.github.kotlinmania.libc.SctpAssocT, opt: CInt, arg: COpaquePointer?, size: SocklenT?): CInt =
    FreebsdModRawLibc.sctpOptInfo(s, id, opt, arg?.value ?: 0L, size?.toLong() ?: 0L)

public actual fun sctpSendv(sd: CInt, iov: Iovec?, iovcnt: CInt, addrs: Sockaddr?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    FreebsdModRawLibc.sctpSendv(sd, iov?.toLong() ?: 0L, iovcnt, addrs?.toLong() ?: 0L, addrcnt, info?.value ?: 0L, infolen, infotype, flags)

public actual fun sctpRecvv(sd: CInt, iov: Iovec?, iovcnt: CInt, from: Sockaddr?, fromlen: SocklenT?, info: COpaquePointer?, infolen: SocklenT?, infotype: CUint?, flags: CInt?): SsizeT =
    FreebsdModRawLibc.sctpRecvv(sd, iov?.toLong() ?: 0L, iovcnt, from?.toLong() ?: 0L, fromlen?.toLong() ?: 0L, info?.value ?: 0L, infolen?.toLong() ?: 0L, infotype?.toLong() ?: 0L, flags?.toLong() ?: 0L)

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    FreebsdModRawLibc.timerfdCreate(clockid, flags)

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    FreebsdModRawLibc.timerfdGettime(fd, currValue?.toLong() ?: 0L)

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    FreebsdModRawLibc.timerfdSettime(fd, flags, newValue?.toLong() ?: 0L, oldValue?.toLong() ?: 0L)

public actual fun closefrom(lowfd: CInt) {
    FreebsdModRawLibc.closefrom(lowfd)
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    FreebsdModRawLibc.closeRange(lowfd, highfd, flags)

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    FreebsdModRawLibc.execvpe(file, argv?.value ?: 0L, envp?.value ?: 0L)

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    FreebsdModRawLibc.kcmp(pid1, pid2, type, idx1, idx2)

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    FreebsdModRawLibc.dlvsym(handle?.value ?: 0L, symbol, version).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memstatStrerror(error: CInt): COpaquePointer? =
    FreebsdModRawLibc.memstatStrerror(error).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memstatMtlAlloc(): MemoryTypeList? =
    FreebsdModRawLibc.memstatMtlAlloc()

public actual fun memstatMtlFirst(list: MemoryTypeList?): MemoryType? =
    FreebsdModRawLibc.memstatMtlFirst(list?.toLong() ?: 0L)

public actual fun memstatMtlNext(mtp: MemoryType?): MemoryType? =
    FreebsdModRawLibc.memstatMtlNext(mtp?.toLong() ?: 0L)

public actual fun memstatMtlFind(list: MemoryTypeList?, allocator: CInt, name: String?): MemoryType? =
    FreebsdModRawLibc.memstatMtlFind(list?.toLong() ?: 0L, allocator, name)

public actual fun memstatMtlFree(list: MemoryTypeList?) {
    FreebsdModRawLibc.memstatMtlFree(list?.toLong() ?: 0L)
}

public actual fun memstatMtlGeterror(list: MemoryTypeList?): CInt =
    FreebsdModRawLibc.memstatMtlGeterror(list?.toLong() ?: 0L)

public actual fun memstatGetName(mtp: MemoryType?): COpaquePointer? =
    FreebsdModRawLibc.memstatGetName(mtp?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmDpcpuSetcpu(kd: KvmT?, cpu: CUint): CInt =
    FreebsdModRawLibc.kvmDpcpuSetcpu(kd?.toLong() ?: 0L, cpu)

public actual fun kvmGetargv(kd: KvmT?, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    FreebsdModRawLibc.kvmGetargv(kd?.toLong() ?: 0L, p?.toLong() ?: 0L, nchr).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmGetcptime(kd: KvmT?, cpTime: CLong?): CInt =
    FreebsdModRawLibc.kvmGetcptime(kd?.toLong() ?: 0L, cpTime?.toLong() ?: 0L)

public actual fun kvmGetenvv(kd: KvmT?, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    FreebsdModRawLibc.kvmGetenvv(kd?.toLong() ?: 0L, p?.toLong() ?: 0L, nchr).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmGeterr(kd: KvmT?): COpaquePointer? =
    FreebsdModRawLibc.kvmGeterr(kd?.toLong() ?: 0L).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmGetmaxcpu(kd: KvmT?): CInt =
    FreebsdModRawLibc.kvmGetmaxcpu(kd?.toLong() ?: 0L)

public actual fun kvmGetncpus(kd: KvmT?): CInt =
    FreebsdModRawLibc.kvmGetncpus(kd?.toLong() ?: 0L)

public actual fun kvmGetpcpu(kd: KvmT?, cpu: CInt): COpaquePointer? =
    FreebsdModRawLibc.kvmGetpcpu(kd?.toLong() ?: 0L, cpu).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun kvmCounterU64Fetch(kd: KvmT?, base: CUlong): ULong =
    FreebsdModRawLibc.kvmCounterU64Fetch(kd?.toLong() ?: 0L, base)

public actual fun kvmGetswapinfo(kd: KvmT?, info: KvmSwap?, maxswap: CInt, flags: CInt): CInt =
    FreebsdModRawLibc.kvmGetswapinfo(kd?.toLong() ?: 0L, info?.toLong() ?: 0L, maxswap, flags)

public actual fun kvmNative(kd: KvmT?): CInt =
    FreebsdModRawLibc.kvmNative(kd?.toLong() ?: 0L)

public actual fun kvmNlist(kd: KvmT?, nl: Nlist?): CInt =
    FreebsdModRawLibc.kvmNlist(kd?.toLong() ?: 0L, nl?.toLong() ?: 0L)

public actual fun kvmNlist2(kd: KvmT?, nl: KvmNlist?): CInt =
    FreebsdModRawLibc.kvmNlist2(kd?.toLong() ?: 0L, nl?.toLong() ?: 0L)

public actual fun kvmReadZpcpu(kd: KvmT?, base: CUlong, buf: COpaquePointer?, size: SizeT, cpu: CInt): SsizeT =
    FreebsdModRawLibc.kvmReadZpcpu(kd?.toLong() ?: 0L, base, buf?.value ?: 0L, size, cpu)

public actual fun kvmRead2(kd: KvmT?, addr: KvaddrT, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    FreebsdModRawLibc.kvmRead2(kd?.toLong() ?: 0L, addr, buf?.value ?: 0L, nbytes)

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    FreebsdModRawLibc.extattrNamespaceToString(attrnamespace, string?.value ?: 0L)

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    FreebsdModRawLibc.extattrStringToNamespace(string, attrnamespace?.toLong() ?: 0L)

public actual fun realhostname(host: COpaquePointer?, hsize: SizeT, ip: InAddr?): CInt =
    FreebsdModRawLibc.realhostname(host?.value ?: 0L, hsize, ip?.toLong() ?: 0L)

public actual fun realhostnameSa(host: COpaquePointer?, hsize: SizeT, addr: Sockaddr?, addrlen: CInt): CInt =
    FreebsdModRawLibc.realhostnameSa(host?.value ?: 0L, hsize, addr?.toLong() ?: 0L, addrlen)

public actual fun kldIsloaded(name: String?): CInt =
    FreebsdModRawLibc.kldIsloaded(name)

public actual fun kldLoad(name: String?): CInt =
    FreebsdModRawLibc.kldLoad(name)

public actual fun kinfoGetvmmap(pid: PidT, cntp: CInt?): KinfoVmentry? =
    FreebsdModRawLibc.kinfoGetvmmap(pid, cntp?.toLong() ?: 0L)

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
    FreebsdModRawLibc.hexdump(ptr?.value ?: 0L, length, hdr, flags)
}

public actual fun humanizeNumber(buf: COpaquePointer?, len: SizeT, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    FreebsdModRawLibc.humanizeNumber(buf?.value ?: 0L, len, number, suffix, scale, flags)

public actual fun getlocalbase(): COpaquePointer? =
    FreebsdModRawLibc.getlocalbase().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: PidT?): io.github.kotlinmania.libc.Pidfh? =
    FreebsdModRawLibc.pidfileOpen(path, mode, pidptr?.toLong() ?: 0L)

public actual fun pidfileWrite(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    FreebsdModRawLibc.pidfileWrite(path?.toLong() ?: 0L)

public actual fun pidfileClose(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    FreebsdModRawLibc.pidfileClose(path?.toLong() ?: 0L)

public actual fun pidfileRemove(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    FreebsdModRawLibc.pidfileRemove(path?.toLong() ?: 0L)

public actual fun pidfileFileno(path: io.github.kotlinmania.libc.Pidfh?): CInt =
    FreebsdModRawLibc.pidfileFileno(path?.toLong() ?: 0L)

public actual fun procstatOpenSysctl(): Procstat? =
    FreebsdModRawLibc.procstatOpenSysctl()

public actual fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: CInt): FilestatList? =
    FreebsdModRawLibc.procstatGetfiles(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, mmapped)

public actual fun procstatFreefiles(procstat: Procstat?, head: FilestatList?) {
    FreebsdModRawLibc.procstatFreefiles(procstat?.toLong() ?: 0L, head?.toLong() ?: 0L)
}

public actual fun procstatGetprocs(procstat: Procstat?, what: CInt, arg: CInt, count: CUint?): KinfoProc? =
    FreebsdModRawLibc.procstatGetprocs(procstat?.toLong() ?: 0L, what, arg, count?.toLong() ?: 0L)

public actual fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?) {
    FreebsdModRawLibc.procstatFreeprocs(procstat?.toLong() ?: 0L, p?.toLong() ?: 0L)
}

public actual fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: CUint?): KinfoVmentry? =
    FreebsdModRawLibc.procstatGetvmmap(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, count?.toLong() ?: 0L)

public actual fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?) {
    FreebsdModRawLibc.procstatFreevmmap(procstat?.toLong() ?: 0L, vmmap?.toLong() ?: 0L)
}

public actual fun procstatClose(procstat: Procstat?) {
    FreebsdModRawLibc.procstatClose(procstat?.toLong() ?: 0L)
}

public actual fun procstatFreeargv(procstat: Procstat?) {
    FreebsdModRawLibc.procstatFreeargv(procstat?.toLong() ?: 0L)
}

public actual fun procstatFreeenvv(procstat: Procstat?) {
    FreebsdModRawLibc.procstatFreeenvv(procstat?.toLong() ?: 0L)
}

public actual fun procstatFreegroups(procstat: Procstat?, groups: GidT?) {
    FreebsdModRawLibc.procstatFreegroups(procstat?.toLong() ?: 0L, groups?.toLong() ?: 0L)
}

public actual fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?) {
    FreebsdModRawLibc.procstatFreeptlwpinfo(procstat?.toLong() ?: 0L, pl?.toLong() ?: 0L)
}

public actual fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: SizeT): COpaquePointer? =
    FreebsdModRawLibc.procstatGetargv(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, nchr).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: SizeT): COpaquePointer? =
    FreebsdModRawLibc.procstatGetenvv(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, nchr).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: CUint?): GidT? =
    FreebsdModRawLibc.procstatGetgroups(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, count?.toLong() ?: 0L)

public actual fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: CInt?): CInt =
    FreebsdModRawLibc.procstatGetosrel(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, osrelp?.toLong() ?: 0L)

public actual fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: COpaquePointer?, maxlen: SizeT): CInt =
    FreebsdModRawLibc.procstatGetpathname(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, pathname?.value ?: 0L, maxlen)

public actual fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: CInt, rlimit: Rlimit?): CInt =
    FreebsdModRawLibc.procstatGetrlimit(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, which, rlimit?.toLong() ?: 0L)

public actual fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: CUshort?): CInt =
    FreebsdModRawLibc.procstatGetumask(procstat?.toLong() ?: 0L, kp?.toLong() ?: 0L, maskp?.toLong() ?: 0L)

public actual fun procstatOpenCore(filename: String?): Procstat? =
    FreebsdModRawLibc.procstatOpenCore(filename)

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat? =
    FreebsdModRawLibc.procstatOpenKvm(nlistf, memf)

public actual fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: COpaquePointer?): CInt =
    FreebsdModRawLibc.procstatGetSocketInfo(proc?.toLong() ?: 0L, fst?.toLong() ?: 0L, sock?.toLong() ?: 0L, errbuf?.value ?: 0L)

public actual fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Vnstat?, errbuf: COpaquePointer?): CInt =
    FreebsdModRawLibc.procstatGetVnodeInfo(proc?.toLong() ?: 0L, fst?.toLong() ?: 0L, vn?.toLong() ?: 0L, errbuf?.value ?: 0L)

public actual fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: COpaquePointer?): CInt =
    FreebsdModRawLibc.procstatGetPtsInfo(proc?.toLong() ?: 0L, fst?.toLong() ?: 0L, pts?.toLong() ?: 0L, errbuf?.value ?: 0L)

public actual fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: COpaquePointer?): CInt =
    FreebsdModRawLibc.procstatGetShmInfo(proc?.toLong() ?: 0L, fst?.toLong() ?: 0L, shm?.toLong() ?: 0L, errbuf?.value ?: 0L)

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: COpaquePointer?): CInt =
    FreebsdModRawLibc.timerCreate(clockId, evp?.toLong() ?: 0L, timerid?.value ?: 0L)

public actual fun timerDelete(timerid: TimerT): CInt =
    FreebsdModRawLibc.timerDelete(timerid)

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    FreebsdModRawLibc.timerGetoverrun(timerid)

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    FreebsdModRawLibc.timerGettime(timerid, value?.toLong() ?: 0L)

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    FreebsdModRawLibc.timerSettime(timerid, flags, value?.toLong() ?: 0L, ovalue?.toLong() ?: 0L)

public actual fun devstatGetnumdevs(kd: KvmT?): CInt =
    FreebsdModRawLibc.devstatGetnumdevs(kd?.toLong() ?: 0L)

public actual fun devstatGetgeneration(kd: KvmT?): CLong =
    FreebsdModRawLibc.devstatGetgeneration(kd?.toLong() ?: 0L)

public actual fun devstatGetversion(kd: KvmT?): CInt =
    FreebsdModRawLibc.devstatGetversion(kd?.toLong() ?: 0L)

public actual fun devstatCheckversion(kd: KvmT?): CInt =
    FreebsdModRawLibc.devstatCheckversion(kd?.toLong() ?: 0L)

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: CInt?, numSelections: CInt?, selectGeneration: CLong?, currentGeneration: CLong, devices: Devstat?, numdevs: CInt, matches: DevstatMatch?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    FreebsdModRawLibc.devstatSelectdevs(devSelect?.value ?: 0L, numSelected?.toLong() ?: 0L, numSelections?.toLong() ?: 0L, selectGeneration?.toLong() ?: 0L, currentGeneration, devices?.toLong() ?: 0L, numdevs, matches?.toLong() ?: 0L, numMatches, devSelections?.value ?: 0L, numDevSelections, selectMode, maxshowdevs, perfSelect)

public actual fun devstatBuildmatch(matchStr: COpaquePointer?, matches: COpaquePointer?, numMatches: CInt?): CInt =
    FreebsdModRawLibc.devstatBuildmatch(matchStr?.value ?: 0L, matches?.value ?: 0L, numMatches?.toLong() ?: 0L)
