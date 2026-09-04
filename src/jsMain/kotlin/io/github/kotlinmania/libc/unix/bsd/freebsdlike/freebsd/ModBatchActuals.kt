// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun mALLOCXALIGN(lg: CUInt): CInt =
    throw UnsupportedOperationException("mALLOCXALIGN requires N-API addon")

public actual fun sOCKCREDSIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE requires N-API addon")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun cPUZERO(cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUZERO requires N-API addon")
}

public actual fun cPUFILL(cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUFILL requires N-API addon")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUSET requires N-API addon")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUCLR requires N-API addon")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpusetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires N-API addon")

public actual fun cPUCOUNT(cpuset: CpusetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNT requires N-API addon")

public actual fun sOCKCRED2SIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCRED2SIZE requires N-API addon")

public actual fun pROTMAX(x: CInt): CInt =
    throw UnsupportedOperationException("pROTMAX requires N-API addon")

public actual fun pROTMAXEXTRACT(x: CInt): CInt =
    throw UnsupportedOperationException("pROTMAXEXTRACT requires N-API addon")

public actual fun fhlink(fhp: FhandleT?, to: String?): CInt =
    throw UnsupportedOperationException("fhlink requires N-API addon")

public actual fun fhlinkat(fhp: FhandleT?, tofd: CInt, to: String?): CInt =
    throw UnsupportedOperationException("fhlinkat requires N-API addon")

public actual fun fhreadlink(fhp: FhandleT?, buf: String?, bufsize: ULong): CInt =
    throw UnsupportedOperationException("fhreadlink requires N-API addon")

public actual fun getfhat(fd: CInt, path: String?, fhp: Fhandle?, flag: CInt): CInt =
    throw UnsupportedOperationException("getfhat requires N-API addon")

public actual fun error(): CInt? =
    throw UnsupportedOperationException("error requires N-API addon")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioReadv(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioReadv requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun aioWritev(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWritev requires N-API addon")

public actual fun copyFileRange(infd: CInt, inoffp: OffT?, outfd: CInt, outoffp: OffT?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("copyFileRange requires N-API addon")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: String?, len: CInt): String? =
    throw UnsupportedOperationException("devnameR requires N-API addon")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteFd requires N-API addon")

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteFile requires N-API addon")

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteLink requires N-API addon")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetFd requires N-API addon")

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetFile requires N-API addon")

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetLink requires N-API addon")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListFd requires N-API addon")

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListFile requires N-API addon")

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListLink requires N-API addon")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrSetFd requires N-API addon")

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrSetFile requires N-API addon")

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrSetLink requires N-API addon")

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: SpacectlRange?, flags: CInt, rmsr: SpacectlRange?): CInt =
    throw UnsupportedOperationException("fspacectl requires N-API addon")

public actual fun jail(jail: Jail?): CInt =
    throw UnsupportedOperationException("jail requires N-API addon")

public actual fun jailAttach(jid: CInt): CInt =
    throw UnsupportedOperationException("jailAttach requires N-API addon")

public actual fun jailRemove(jid: CInt): CInt =
    throw UnsupportedOperationException("jailRemove requires N-API addon")

public actual fun jailGet(iov: Iovec?, niov: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("jailGet requires N-API addon")

public actual fun jailSet(iov: Iovec?, niov: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("jailSet requires N-API addon")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun getutxuser(user: String?): Utmpx? =
    throw UnsupportedOperationException("getutxuser requires N-API addon")

public actual fun setutxdb(type: CInt, file: String?): CInt =
    throw UnsupportedOperationException("setutxdb requires N-API addon")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("aioWaitcomplete requires N-API addon")

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqGetfdNp requires N-API addon")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR requires N-API addon")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    throw UnsupportedOperationException("semget requires N-API addon")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl requires N-API addon")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop requires N-API addon")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl requires N-API addon")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget requires N-API addon")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd requires N-API addon")

public actual fun cfmakesane(termios: Termios?) {
    throw UnsupportedOperationException("cfmakesane requires N-API addon")
}

public actual fun pdfork(fdp: CInt?, flags: CInt): PidT =
    throw UnsupportedOperationException("pdfork requires N-API addon")

public actual fun pdgetpid(fd: CInt, pidp: PidT?): CInt =
    throw UnsupportedOperationException("pdgetpid requires N-API addon")

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    throw UnsupportedOperationException("pdkill requires N-API addon")

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: Rtprio?): CInt =
    throw UnsupportedOperationException("rtprioThread requires N-API addon")

public actual fun uuidgen(store: Uuid?, count: CInt): CInt =
    throw UnsupportedOperationException("uuidgen requires N-API addon")

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    throw UnsupportedOperationException("thrKill requires N-API addon")

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    throw UnsupportedOperationException("thrKill2 requires N-API addon")

public actual fun thrSelf(tid: CLong?): CInt =
    throw UnsupportedOperationException("thrSelf requires N-API addon")

public actual fun pthreadGetthreadidNp(): CInt =
    throw UnsupportedOperationException("pthreadGetthreadidNp requires N-API addon")

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: ULong, cpusetp: CpusetT?): CInt =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires N-API addon")

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: ULong, cpusetp: CpusetT?): CInt =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires N-API addon")

public actual fun schedGetaffinity(pid: PidT, cpusetsz: ULong, cpuset: CpusetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity requires N-API addon")

public actual fun schedSetaffinity(pid: PidT, cpusetsz: ULong, cpuset: CpusetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity requires N-API addon")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("schedGetcpu requires N-API addon")

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexConsistent requires N-API addon")

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT, robust: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust requires N-API addon")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT, robust: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires N-API addon")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit requires N-API addon")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy requires N-API addon")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinLock requires N-API addon")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock requires N-API addon")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock requires N-API addon")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 requires N-API addon")

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("xuname requires N-API addon")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmmsg requires N-API addon")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: ULong, flags: CInt, timeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("recvmmsg requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun fhopen(fhp: FhandleT?, flags: CInt): CInt =
    throw UnsupportedOperationException("fhopen requires N-API addon")

public actual fun fhstat(fhp: Fhandle?, buf: Stat?): CInt =
    throw UnsupportedOperationException("fhstat requires N-API addon")

public actual fun fhstatfs(fhp: FhandleT?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fhstatfs requires N-API addon")

public actual fun getfh(path: String?, fhp: FhandleT?): CInt =
    throw UnsupportedOperationException("getfh requires N-API addon")

public actual fun lgetfh(path: String?, fhp: FhandleT?): CInt =
    throw UnsupportedOperationException("lgetfh requires N-API addon")

public actual fun getfsstat(buf: Statfs?, bufsize: CLong, mode: CInt): CInt =
    throw UnsupportedOperationException("getfsstat requires N-API addon")

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo requires N-API addon")

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun nmount(iov: Iovec?, niov: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("nmount requires N-API addon")

public actual fun setproctitle(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitle requires N-API addon")
}

public actual fun rfork(flags: CInt): CInt =
    throw UnsupportedOperationException("rfork requires N-API addon")

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: ULong, mask: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetGetaffinity requires N-API addon")

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: ULong, mask: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetSetaffinity requires N-API addon")

public actual fun cpuset(setid: CpusetidT?): CInt =
    throw UnsupportedOperationException("cpuset requires N-API addon")

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: CpusetidT?): CInt =
    throw UnsupportedOperationException("cpusetGetid requires N-API addon")

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    throw UnsupportedOperationException("cpusetSetid requires N-API addon")

public actual fun capEnter(): CInt =
    throw UnsupportedOperationException("capEnter requires N-API addon")

public actual fun capGetmode(modep: CUInt?): CInt =
    throw UnsupportedOperationException("capGetmode requires N-API addon")

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: UInt?): CInt =
    throw UnsupportedOperationException("capFcntlsGet requires N-API addon")

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    throw UnsupportedOperationException("capFcntlsLimit requires N-API addon")

public actual fun capIoctlsGet(fd: CInt, cmds: ULong?, maxcmds: ULong): Long =
    throw UnsupportedOperationException("capIoctlsGet requires N-API addon")

public actual fun capIoctlsLimit(fd: CInt, cmds: ULong?, ncmds: ULong): CInt =
    throw UnsupportedOperationException("capIoctlsLimit requires N-API addon")

public actual fun capRightsInit(version: CInt, rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsInit requires N-API addon")

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: CapRightsT?): CInt =
    throw UnsupportedOperationException("capRightsGet requires N-API addon")

public actual fun capRightsSet(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsSet requires N-API addon")

public actual fun capRightsClear(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsClear requires N-API addon")

public actual fun capRightsIsSet(rights: CapRightsT?, vararg args: Any?): Boolean =
    throw UnsupportedOperationException("capRightsIsSet requires N-API addon")

public actual fun capRightsIsValid(rights: CapRightsT?): Boolean =
    throw UnsupportedOperationException("capRightsIsValid requires N-API addon")

public actual fun capRightsLimit(fd: CInt, rights: CapRightsT?): CInt =
    throw UnsupportedOperationException("capRightsLimit requires N-API addon")

public actual fun capRightsMerge(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    throw UnsupportedOperationException("capRightsMerge requires N-API addon")

public actual fun capRightsRemove(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    throw UnsupportedOperationException("capRightsRemove requires N-API addon")

public actual fun capRightsContains(big: CapRightsT?, little: CapRightsT?): Boolean =
    throw UnsupportedOperationException("capRightsContains requires N-API addon")

public actual fun capSandboxed(): Boolean =
    throw UnsupportedOperationException("capSandboxed requires N-API addon")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires N-API addon")

public actual fun ffs(value: CInt): CInt =
    throw UnsupportedOperationException("ffs requires N-API addon")

public actual fun ffsl(value: CLong): CInt =
    throw UnsupportedOperationException("ffsl requires N-API addon")

public actual fun ffsll(value: CLongLong): CInt =
    throw UnsupportedOperationException("ffsll requires N-API addon")

public actual fun fls(value: CInt): CInt =
    throw UnsupportedOperationException("fls requires N-API addon")

public actual fun flsl(value: CLong): CInt =
    throw UnsupportedOperationException("flsl requires N-API addon")

public actual fun flsll(value: CLongLong): CInt =
    throw UnsupportedOperationException("flsll requires N-API addon")

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("mallctl requires N-API addon")

public actual fun mallctlnametomib(name: String?, mibp: ULong?, miplen: ULong?): CInt =
    throw UnsupportedOperationException("mallctlnametomib requires N-API addon")

public actual fun mallctlbymib(mib: ULong?, mible: ULong, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("mallctlbymib requires N-API addon")

public actual fun mallocx(size: ULong, flags: CInt): COpaquePointer? =
    throw UnsupportedOperationException("mallocx requires N-API addon")

public actual fun rallocx(ptr: COpaquePointer?, size: ULong, flags: CInt): COpaquePointer? =
    throw UnsupportedOperationException("rallocx requires N-API addon")

public actual fun xallocx(ptr: COpaquePointer?, size: ULong, extra: ULong, flags: CInt): ULong =
    throw UnsupportedOperationException("xallocx requires N-API addon")

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): ULong =
    throw UnsupportedOperationException("sallocx requires N-API addon")

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt) {
    throw UnsupportedOperationException("dallocx requires N-API addon")
}

public actual fun sdallocx(ptr: COpaquePointer?, size: ULong, flags: CInt) {
    throw UnsupportedOperationException("sdallocx requires N-API addon")
}

public actual fun nallocx(size: ULong, flags: CInt): ULong =
    throw UnsupportedOperationException("nallocx requires N-API addon")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("procctl requires N-API addon")

public actual fun getpagesize(): CInt =
    throw UnsupportedOperationException("getpagesize requires N-API addon")

public actual fun getpagesizes(pagesize: ULong?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getpagesizes requires N-API addon")

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid2 requires N-API addon")

public actual fun strchrnul(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchrnul requires N-API addon")

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmCreateLargepage requires N-API addon")

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("shmRename requires N-API addon")

public actual fun memfdCreate(name: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("memfdCreate requires N-API addon")

public actual fun setaudit(auditinfo: AuditinfoT?): CInt =
    throw UnsupportedOperationException("setaudit requires N-API addon")

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd requires N-API addon")

public actual fun eventfdRead(fd: CInt, value: EventfdT?): CInt =
    throw UnsupportedOperationException("eventfdRead requires N-API addon")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    throw UnsupportedOperationException("eventfdWrite requires N-API addon")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    throw UnsupportedOperationException("elfAuxInfo requires N-API addon")

public actual fun setproctitleFast(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitleFast requires N-API addon")
}

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("timingsafeBcmp requires N-API addon")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("timingsafeMemcmp requires N-API addon")

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, `val`: CULong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("umtxOp requires N-API addon")

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    throw UnsupportedOperationException("sctpPeeloff requires N-API addon")

public actual fun sctpBindx(s: CInt, addrs: Sockaddr?, num: CInt, tpe: CInt): CInt =
    throw UnsupportedOperationException("sctpBindx requires N-API addon")

public actual fun sctpConnectx(s: CInt, addrs: Sockaddr?, addrcnt: CInt, id: SctpAssocT?): CInt =
    throw UnsupportedOperationException("sctpConnectx requires N-API addon")

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    throw UnsupportedOperationException("sctpGetaddrlen requires N-API addon")

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sctpGetpaddrs requires N-API addon")

public actual fun sctpFreepaddrs(addrs: Sockaddr?) {
    throw UnsupportedOperationException("sctpFreepaddrs requires N-API addon")
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sctpGetladdrs requires N-API addon")

public actual fun sctpFreeladdrs(addrs: Sockaddr?) {
    throw UnsupportedOperationException("sctpFreeladdrs requires N-API addon")
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: SocklenT?): CInt =
    throw UnsupportedOperationException("sctpOptInfo requires N-API addon")

public actual fun sctpSendv(sd: CInt, iov: Iovec?, iovcnt: CInt, addrs: Sockaddr?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sctpSendv requires N-API addon")

public actual fun sctpRecvv(sd: CInt, iov: Iovec?, iovcnt: CInt, from: Sockaddr?, fromlen: SocklenT?, info: COpaquePointer?, infolen: SocklenT?, infotype: CUInt?, flags: CInt?): SsizeT =
    throw UnsupportedOperationException("sctpRecvv requires N-API addon")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate requires N-API addon")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime requires N-API addon")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime requires N-API addon")

public actual fun closefrom(lowfd: CInt) {
    throw UnsupportedOperationException("closefrom requires N-API addon")
}

public actual fun closeRange(lowfd: CUInt, highfd: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("closeRange requires N-API addon")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires N-API addon")

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CULong, idx2: CULong): CInt =
    throw UnsupportedOperationException("kcmp requires N-API addon")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires N-API addon")

public actual fun memstatStrerror(error: CInt): String? =
    throw UnsupportedOperationException("memstatStrerror requires N-API addon")

public actual fun memstatMtlAlloc(): MemoryTypeList? =
    throw UnsupportedOperationException("memstatMtlAlloc requires N-API addon")

public actual fun memstatMtlFirst(list: MemoryTypeList?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFirst requires N-API addon")

public actual fun memstatMtlNext(mtp: MemoryType?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlNext requires N-API addon")

public actual fun memstatMtlFind(list: MemoryTypeList?, allocator: CInt, name: String?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFind requires N-API addon")

public actual fun memstatMtlFree(list: MemoryTypeList?) {
    throw UnsupportedOperationException("memstatMtlFree requires N-API addon")
}

public actual fun memstatMtlGeterror(list: MemoryTypeList?): CInt =
    throw UnsupportedOperationException("memstatMtlGeterror requires N-API addon")

public actual fun memstatGetName(mtp: MemoryType?): String? =
    throw UnsupportedOperationException("memstatGetName requires N-API addon")

public actual fun kvmDpcpuSetcpu(kd: KvmT, cpu: CUInt): CInt =
    throw UnsupportedOperationException("kvmDpcpuSetcpu requires N-API addon")

public actual fun kvmGetargv(kd: KvmT, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetargv requires N-API addon")

public actual fun kvmGetcptime(kd: KvmT, cpTime: CLong?): CInt =
    throw UnsupportedOperationException("kvmGetcptime requires N-API addon")

public actual fun kvmGetenvv(kd: KvmT, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetenvv requires N-API addon")

public actual fun kvmGeterr(kd: KvmT): String? =
    throw UnsupportedOperationException("kvmGeterr requires N-API addon")

public actual fun kvmGetmaxcpu(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmGetmaxcpu requires N-API addon")

public actual fun kvmGetncpus(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmGetncpus requires N-API addon")

public actual fun kvmGetpcpu(kd: KvmT, cpu: CInt): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetpcpu requires N-API addon")

public actual fun kvmCounterU64Fetch(kd: KvmT, base: CULong): ULong =
    throw UnsupportedOperationException("kvmCounterU64Fetch requires N-API addon")

public actual fun kvmGetswapinfo(kd: KvmT, info: KvmSwap?, maxswap: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("kvmGetswapinfo requires N-API addon")

public actual fun kvmNative(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmNative requires N-API addon")

public actual fun kvmNlist(kd: KvmT, nl: Nlist?): CInt =
    throw UnsupportedOperationException("kvmNlist requires N-API addon")

public actual fun kvmNlist2(kd: KvmT, nl: KvmNlist?): CInt =
    throw UnsupportedOperationException("kvmNlist2 requires N-API addon")

public actual fun kvmReadZpcpu(kd: KvmT, base: CULong, buf: COpaquePointer?, size: ULong, cpu: CInt): SsizeT =
    throw UnsupportedOperationException("kvmReadZpcpu requires N-API addon")

public actual fun kvmRead2(kd: KvmT, addr: KvaddrT, buf: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("kvmRead2 requires N-API addon")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    throw UnsupportedOperationException("extattrNamespaceToString requires N-API addon")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    throw UnsupportedOperationException("extattrStringToNamespace requires N-API addon")

public actual fun realhostname(host: String?, hsize: ULong, ip: InAddr?): CInt =
    throw UnsupportedOperationException("realhostname requires N-API addon")

public actual fun realhostnameSa(host: String?, hsize: ULong, addr: Sockaddr?, addrlen: CInt): CInt =
    throw UnsupportedOperationException("realhostnameSa requires N-API addon")

public actual fun kldIsloaded(name: String?): CInt =
    throw UnsupportedOperationException("kldIsloaded requires N-API addon")

public actual fun kldLoad(name: String?): CInt =
    throw UnsupportedOperationException("kldLoad requires N-API addon")

public actual fun kinfoGetvmmap(pid: PidT, cntp: CInt?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap requires N-API addon")

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
    throw UnsupportedOperationException("hexdump requires N-API addon")
}

public actual fun humanizeNumber(buf: String?, len: ULong, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("humanizeNumber requires N-API addon")

public actual fun flopen(path: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("flopen requires N-API addon")

public actual fun flopenat(fd: CInt, path: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("flopenat requires N-API addon")

public actual fun getlocalbase(): String? =
    throw UnsupportedOperationException("getlocalbase requires N-API addon")

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: PidT?): Pidfh? =
    throw UnsupportedOperationException("pidfileOpen requires N-API addon")

public actual fun pidfileWrite(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileWrite requires N-API addon")

public actual fun pidfileClose(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileClose requires N-API addon")

public actual fun pidfileRemove(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileRemove requires N-API addon")

public actual fun pidfileFileno(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileFileno requires N-API addon")

public actual fun procstatOpenSysctl(): Procstat? =
    throw UnsupportedOperationException("procstatOpenSysctl requires N-API addon")

public actual fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: CInt): FilestatList? =
    throw UnsupportedOperationException("procstatGetfiles requires N-API addon")

public actual fun procstatFreefiles(procstat: Procstat?, head: FilestatList?) {
    throw UnsupportedOperationException("procstatFreefiles requires N-API addon")
}

public actual fun procstatGetprocs(procstat: Procstat?, what: CInt, arg: CInt, count: CUInt?): KinfoProc? =
    throw UnsupportedOperationException("procstatGetprocs requires N-API addon")

public actual fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?) {
    throw UnsupportedOperationException("procstatFreeprocs requires N-API addon")
}

public actual fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: CUInt?): KinfoVmentry? =
    throw UnsupportedOperationException("procstatGetvmmap requires N-API addon")

public actual fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?) {
    throw UnsupportedOperationException("procstatFreevmmap requires N-API addon")
}

public actual fun procstatClose(procstat: Procstat?) {
    throw UnsupportedOperationException("procstatClose requires N-API addon")
}

public actual fun procstatFreeargv(procstat: Procstat?) {
    throw UnsupportedOperationException("procstatFreeargv requires N-API addon")
}

public actual fun procstatFreeenvv(procstat: Procstat?) {
    throw UnsupportedOperationException("procstatFreeenvv requires N-API addon")
}

public actual fun procstatFreegroups(procstat: Procstat?, groups: GidT?) {
    throw UnsupportedOperationException("procstatFreegroups requires N-API addon")
}

public actual fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?) {
    throw UnsupportedOperationException("procstatFreeptlwpinfo requires N-API addon")
}

public actual fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetargv requires N-API addon")

public actual fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetenvv requires N-API addon")

public actual fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: CUInt?): GidT? =
    throw UnsupportedOperationException("procstatGetgroups requires N-API addon")

public actual fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: CInt?): CInt =
    throw UnsupportedOperationException("procstatGetosrel requires N-API addon")

public actual fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: String?, maxlen: ULong): CInt =
    throw UnsupportedOperationException("procstatGetpathname requires N-API addon")

public actual fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: CInt, rlimit: Rlimit?): CInt =
    throw UnsupportedOperationException("procstatGetrlimit requires N-API addon")

public actual fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: CUShort?): CInt =
    throw UnsupportedOperationException("procstatGetumask requires N-API addon")

public actual fun procstatOpenCore(filename: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenCore requires N-API addon")

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenKvm requires N-API addon")

public actual fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetSocketInfo requires N-API addon")

public actual fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Vnstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetVnodeInfo requires N-API addon")

public actual fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetPtsInfo requires N-API addon")

public actual fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetShmInfo requires N-API addon")

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun devstatGetnumdevs(kd: KvmT): CInt =
    throw UnsupportedOperationException("devstatGetnumdevs requires N-API addon")

public actual fun devstatGetgeneration(kd: KvmT): CLong =
    throw UnsupportedOperationException("devstatGetgeneration requires N-API addon")

public actual fun devstatGetversion(kd: KvmT): CInt =
    throw UnsupportedOperationException("devstatGetversion requires N-API addon")

public actual fun devstatCheckversion(kd: KvmT): CInt =
    throw UnsupportedOperationException("devstatCheckversion requires N-API addon")

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: CInt?, numSelections: CInt?, selectGeneration: CLong?, currentGeneration: CLong, devices: Devstat?, numdevs: CInt, matches: DevstatMatch?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    throw UnsupportedOperationException("devstatSelectdevs requires N-API addon")

public actual fun devstatBuildmatch(matchStr: String?, matches: COpaquePointer?, numMatches: CInt?): CInt =
    throw UnsupportedOperationException("devstatBuildmatch requires N-API addon")

