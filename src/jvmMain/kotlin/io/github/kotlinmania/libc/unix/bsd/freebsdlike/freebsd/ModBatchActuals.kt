// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on JVM — no C library access")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on JVM — no C library access")

public actual fun mALLOCXALIGN(lg: CUInt): CInt =
    throw UnsupportedOperationException("mALLOCXALIGN not available on JVM — no C library access")

public actual fun sOCKCREDSIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE not available on JVM — no C library access")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname not available on JVM — no C library access")

public actual fun cPUZERO(cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUZERO not available on JVM — no C library access")
}

public actual fun cPUFILL(cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUFILL not available on JVM — no C library access")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUSET not available on JVM — no C library access")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUCLR not available on JVM — no C library access")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpusetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on JVM — no C library access")

public actual fun cPUCOUNT(cpuset: CpusetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNT not available on JVM — no C library access")

public actual fun sOCKCRED2SIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCRED2SIZE not available on JVM — no C library access")

public actual fun pROTMAX(x: CInt): CInt =
    throw UnsupportedOperationException("pROTMAX not available on JVM — no C library access")

public actual fun pROTMAXEXTRACT(x: CInt): CInt =
    throw UnsupportedOperationException("pROTMAXEXTRACT not available on JVM — no C library access")

public actual fun fhlink(fhp: FhandleT?, to: String?): CInt =
    throw UnsupportedOperationException("fhlink not available on JVM — no C library access")

public actual fun fhlinkat(fhp: FhandleT?, tofd: CInt, to: String?): CInt =
    throw UnsupportedOperationException("fhlinkat not available on JVM — no C library access")

public actual fun fhreadlink(fhp: FhandleT?, buf: String?, bufsize: ULong): CInt =
    throw UnsupportedOperationException("fhreadlink not available on JVM — no C library access")

public actual fun getfhat(fd: CInt, path: String?, fhp: Fhandle?, flag: CInt): CInt =
    throw UnsupportedOperationException("getfhat not available on JVM — no C library access")

public actual fun error(): CInt? =
    throw UnsupportedOperationException("error not available on JVM — no C library access")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel not available on JVM — no C library access")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError not available on JVM — no C library access")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync not available on JVM — no C library access")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead not available on JVM — no C library access")

public actual fun aioReadv(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioReadv not available on JVM — no C library access")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn not available on JVM — no C library access")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend not available on JVM — no C library access")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite not available on JVM — no C library access")

public actual fun aioWritev(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWritev not available on JVM — no C library access")

public actual fun copyFileRange(infd: CInt, inoffp: OffT?, outfd: CInt, outoffp: OffT?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("copyFileRange not available on JVM — no C library access")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: String?, len: CInt): String? =
    throw UnsupportedOperationException("devnameR not available on JVM — no C library access")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteFd not available on JVM — no C library access")

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteFile not available on JVM — no C library access")

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteLink not available on JVM — no C library access")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetFd not available on JVM — no C library access")

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetFile not available on JVM — no C library access")

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetLink not available on JVM — no C library access")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListFd not available on JVM — no C library access")

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListFile not available on JVM — no C library access")

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListLink not available on JVM — no C library access")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrSetFd not available on JVM — no C library access")

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrSetFile not available on JVM — no C library access")

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrSetLink not available on JVM — no C library access")

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: SpacectlRange?, flags: CInt, rmsr: SpacectlRange?): CInt =
    throw UnsupportedOperationException("fspacectl not available on JVM — no C library access")

public actual fun jail(jail: Jail?): CInt =
    throw UnsupportedOperationException("jail not available on JVM — no C library access")

public actual fun jailAttach(jid: CInt): CInt =
    throw UnsupportedOperationException("jailAttach not available on JVM — no C library access")

public actual fun jailRemove(jid: CInt): CInt =
    throw UnsupportedOperationException("jailRemove not available on JVM — no C library access")

public actual fun jailGet(iov: Iovec?, niov: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("jailGet not available on JVM — no C library access")

public actual fun jailSet(iov: Iovec?, niov: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("jailSet not available on JVM — no C library access")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio not available on JVM — no C library access")

public actual fun getutxuser(user: String?): Utmpx? =
    throw UnsupportedOperationException("getutxuser not available on JVM — no C library access")

public actual fun setutxdb(type: CInt, file: String?): CInt =
    throw UnsupportedOperationException("setutxdb not available on JVM — no C library access")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("aioWaitcomplete not available on JVM — no C library access")

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqGetfdNp not available on JVM — no C library access")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid not available on JVM — no C library access")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR not available on JVM — no C library access")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget not available on JVM — no C library access")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on JVM — no C library access")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt not available on JVM — no C library access")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl not available on JVM — no C library access")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    throw UnsupportedOperationException("semget not available on JVM — no C library access")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl not available on JVM — no C library access")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop not available on JVM — no C library access")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl not available on JVM — no C library access")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget not available on JVM — no C library access")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd not available on JVM — no C library access")

public actual fun cfmakesane(termios: Termios?) {
    throw UnsupportedOperationException("cfmakesane not available on JVM — no C library access")
}

public actual fun pdfork(fdp: CInt?, flags: CInt): PidT =
    throw UnsupportedOperationException("pdfork not available on JVM — no C library access")

public actual fun pdgetpid(fd: CInt, pidp: PidT?): CInt =
    throw UnsupportedOperationException("pdgetpid not available on JVM — no C library access")

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    throw UnsupportedOperationException("pdkill not available on JVM — no C library access")

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: Rtprio?): CInt =
    throw UnsupportedOperationException("rtprioThread not available on JVM — no C library access")

public actual fun uuidgen(store: Uuid?, count: CInt): CInt =
    throw UnsupportedOperationException("uuidgen not available on JVM — no C library access")

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    throw UnsupportedOperationException("thrKill not available on JVM — no C library access")

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    throw UnsupportedOperationException("thrKill2 not available on JVM — no C library access")

public actual fun thrSelf(tid: CLong?): CInt =
    throw UnsupportedOperationException("thrSelf not available on JVM — no C library access")

public actual fun pthreadGetthreadidNp(): CInt =
    throw UnsupportedOperationException("pthreadGetthreadidNp not available on JVM — no C library access")

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: ULong, cpusetp: CpusetT?): CInt =
    throw UnsupportedOperationException("pthreadGetaffinityNp not available on JVM — no C library access")

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: ULong, cpusetp: CpusetT?): CInt =
    throw UnsupportedOperationException("pthreadSetaffinityNp not available on JVM — no C library access")

public actual fun schedGetaffinity(pid: PidT, cpusetsz: ULong, cpuset: CpusetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity not available on JVM — no C library access")

public actual fun schedSetaffinity(pid: PidT, cpusetsz: ULong, cpuset: CpusetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity not available on JVM — no C library access")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("schedGetcpu not available on JVM — no C library access")

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexConsistent not available on JVM — no C library access")

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT, robust: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust not available on JVM — no C library access")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT, robust: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust not available on JVM — no C library access")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit not available on JVM — no C library access")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on JVM — no C library access")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinLock not available on JVM — no C library access")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on JVM — no C library access")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on JVM — no C library access")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadTimedjoinNp not available on JVM — no C library access")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs not available on JVM — no C library access")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs not available on JVM — no C library access")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 not available on JVM — no C library access")

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("xuname not available on JVM — no C library access")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmmsg not available on JVM — no C library access")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: ULong, flags: CInt, timeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("recvmmsg not available on JVM — no C library access")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on JVM — no C library access")

public actual fun fhopen(fhp: FhandleT?, flags: CInt): CInt =
    throw UnsupportedOperationException("fhopen not available on JVM — no C library access")

public actual fun fhstat(fhp: Fhandle?, buf: Stat?): CInt =
    throw UnsupportedOperationException("fhstat not available on JVM — no C library access")

public actual fun fhstatfs(fhp: FhandleT?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fhstatfs not available on JVM — no C library access")

public actual fun getfh(path: String?, fhp: FhandleT?): CInt =
    throw UnsupportedOperationException("getfh not available on JVM — no C library access")

public actual fun lgetfh(path: String?, fhp: FhandleT?): CInt =
    throw UnsupportedOperationException("lgetfh not available on JVM — no C library access")

public actual fun getfsstat(buf: Statfs?, bufsize: CLong, mode: CInt): CInt =
    throw UnsupportedOperationException("getfsstat not available on JVM — no C library access")

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo not available on JVM — no C library access")

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount not available on JVM — no C library access")

public actual fun nmount(iov: Iovec?, niov: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("nmount not available on JVM — no C library access")

public actual fun setproctitle(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitle not available on JVM — no C library access")
}

public actual fun rfork(flags: CInt): CInt =
    throw UnsupportedOperationException("rfork not available on JVM — no C library access")

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: ULong, mask: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetGetaffinity not available on JVM — no C library access")

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: ULong, mask: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetSetaffinity not available on JVM — no C library access")

public actual fun cpuset(setid: CpusetidT?): CInt =
    throw UnsupportedOperationException("cpuset not available on JVM — no C library access")

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: CpusetidT?): CInt =
    throw UnsupportedOperationException("cpusetGetid not available on JVM — no C library access")

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    throw UnsupportedOperationException("cpusetSetid not available on JVM — no C library access")

public actual fun capEnter(): CInt =
    throw UnsupportedOperationException("capEnter not available on JVM — no C library access")

public actual fun capGetmode(modep: CUInt?): CInt =
    throw UnsupportedOperationException("capGetmode not available on JVM — no C library access")

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: UInt?): CInt =
    throw UnsupportedOperationException("capFcntlsGet not available on JVM — no C library access")

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    throw UnsupportedOperationException("capFcntlsLimit not available on JVM — no C library access")

public actual fun capIoctlsGet(fd: CInt, cmds: ULong?, maxcmds: ULong): Long =
    throw UnsupportedOperationException("capIoctlsGet not available on JVM — no C library access")

public actual fun capIoctlsLimit(fd: CInt, cmds: ULong?, ncmds: ULong): CInt =
    throw UnsupportedOperationException("capIoctlsLimit not available on JVM — no C library access")

public actual fun capRightsInit(version: CInt, rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsInit not available on JVM — no C library access")

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: CapRightsT?): CInt =
    throw UnsupportedOperationException("capRightsGet not available on JVM — no C library access")

public actual fun capRightsSet(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsSet not available on JVM — no C library access")

public actual fun capRightsClear(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsClear not available on JVM — no C library access")

public actual fun capRightsIsSet(rights: CapRightsT?, vararg args: Any?): Boolean =
    throw UnsupportedOperationException("capRightsIsSet not available on JVM — no C library access")

public actual fun capRightsIsValid(rights: CapRightsT?): Boolean =
    throw UnsupportedOperationException("capRightsIsValid not available on JVM — no C library access")

public actual fun capRightsLimit(fd: CInt, rights: CapRightsT?): CInt =
    throw UnsupportedOperationException("capRightsLimit not available on JVM — no C library access")

public actual fun capRightsMerge(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    throw UnsupportedOperationException("capRightsMerge not available on JVM — no C library access")

public actual fun capRightsRemove(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    throw UnsupportedOperationException("capRightsRemove not available on JVM — no C library access")

public actual fun capRightsContains(big: CapRightsT?, little: CapRightsT?): Boolean =
    throw UnsupportedOperationException("capRightsContains not available on JVM — no C library access")

public actual fun capSandboxed(): Boolean =
    throw UnsupportedOperationException("capSandboxed not available on JVM — no C library access")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray not available on JVM — no C library access")

public actual fun ffs(value: CInt): CInt =
    throw UnsupportedOperationException("ffs not available on JVM — no C library access")

public actual fun ffsl(value: CLong): CInt =
    throw UnsupportedOperationException("ffsl not available on JVM — no C library access")

public actual fun ffsll(value: CLongLong): CInt =
    throw UnsupportedOperationException("ffsll not available on JVM — no C library access")

public actual fun fls(value: CInt): CInt =
    throw UnsupportedOperationException("fls not available on JVM — no C library access")

public actual fun flsl(value: CLong): CInt =
    throw UnsupportedOperationException("flsl not available on JVM — no C library access")

public actual fun flsll(value: CLongLong): CInt =
    throw UnsupportedOperationException("flsll not available on JVM — no C library access")

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("mallctl not available on JVM — no C library access")

public actual fun mallctlnametomib(name: String?, mibp: ULong?, miplen: ULong?): CInt =
    throw UnsupportedOperationException("mallctlnametomib not available on JVM — no C library access")

public actual fun mallctlbymib(mib: ULong?, mible: ULong, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("mallctlbymib not available on JVM — no C library access")

public actual fun mallocx(size: ULong, flags: CInt): COpaquePointer? =
    throw UnsupportedOperationException("mallocx not available on JVM — no C library access")

public actual fun rallocx(ptr: COpaquePointer?, size: ULong, flags: CInt): COpaquePointer? =
    throw UnsupportedOperationException("rallocx not available on JVM — no C library access")

public actual fun xallocx(ptr: COpaquePointer?, size: ULong, extra: ULong, flags: CInt): ULong =
    throw UnsupportedOperationException("xallocx not available on JVM — no C library access")

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): ULong =
    throw UnsupportedOperationException("sallocx not available on JVM — no C library access")

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt) {
    throw UnsupportedOperationException("dallocx not available on JVM — no C library access")
}

public actual fun sdallocx(ptr: COpaquePointer?, size: ULong, flags: CInt) {
    throw UnsupportedOperationException("sdallocx not available on JVM — no C library access")
}

public actual fun nallocx(size: ULong, flags: CInt): ULong =
    throw UnsupportedOperationException("nallocx not available on JVM — no C library access")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("procctl not available on JVM — no C library access")

public actual fun getpagesize(): CInt =
    throw UnsupportedOperationException("getpagesize not available on JVM — no C library access")

public actual fun getpagesizes(pagesize: ULong?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getpagesizes not available on JVM — no C library access")

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid2 not available on JVM — no C library access")

public actual fun strchrnul(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchrnul not available on JVM — no C library access")

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmCreateLargepage not available on JVM — no C library access")

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("shmRename not available on JVM — no C library access")

public actual fun memfdCreate(name: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("memfdCreate not available on JVM — no C library access")

public actual fun setaudit(auditinfo: AuditinfoT?): CInt =
    throw UnsupportedOperationException("setaudit not available on JVM — no C library access")

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd not available on JVM — no C library access")

public actual fun eventfdRead(fd: CInt, value: EventfdT?): CInt =
    throw UnsupportedOperationException("eventfdRead not available on JVM — no C library access")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    throw UnsupportedOperationException("eventfdWrite not available on JVM — no C library access")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync not available on JVM — no C library access")

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    throw UnsupportedOperationException("elfAuxInfo not available on JVM — no C library access")

public actual fun setproctitleFast(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitleFast not available on JVM — no C library access")
}

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("timingsafeBcmp not available on JVM — no C library access")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("timingsafeMemcmp not available on JVM — no C library access")

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, `val`: CULong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("umtxOp not available on JVM — no C library access")

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    throw UnsupportedOperationException("sctpPeeloff not available on JVM — no C library access")

public actual fun sctpBindx(s: CInt, addrs: Sockaddr?, num: CInt, tpe: CInt): CInt =
    throw UnsupportedOperationException("sctpBindx not available on JVM — no C library access")

public actual fun sctpConnectx(s: CInt, addrs: Sockaddr?, addrcnt: CInt, id: SctpAssocT?): CInt =
    throw UnsupportedOperationException("sctpConnectx not available on JVM — no C library access")

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    throw UnsupportedOperationException("sctpGetaddrlen not available on JVM — no C library access")

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sctpGetpaddrs not available on JVM — no C library access")

public actual fun sctpFreepaddrs(addrs: Sockaddr?) {
    throw UnsupportedOperationException("sctpFreepaddrs not available on JVM — no C library access")
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sctpGetladdrs not available on JVM — no C library access")

public actual fun sctpFreeladdrs(addrs: Sockaddr?) {
    throw UnsupportedOperationException("sctpFreeladdrs not available on JVM — no C library access")
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: SocklenT?): CInt =
    throw UnsupportedOperationException("sctpOptInfo not available on JVM — no C library access")

public actual fun sctpSendv(sd: CInt, iov: Iovec?, iovcnt: CInt, addrs: Sockaddr?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sctpSendv not available on JVM — no C library access")

public actual fun sctpRecvv(sd: CInt, iov: Iovec?, iovcnt: CInt, from: Sockaddr?, fromlen: SocklenT?, info: COpaquePointer?, infolen: SocklenT?, infotype: CUInt?, flags: CInt?): SsizeT =
    throw UnsupportedOperationException("sctpRecvv not available on JVM — no C library access")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate not available on JVM — no C library access")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime not available on JVM — no C library access")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime not available on JVM — no C library access")

public actual fun closefrom(lowfd: CInt) {
    throw UnsupportedOperationException("closefrom not available on JVM — no C library access")
}

public actual fun closeRange(lowfd: CUInt, highfd: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("closeRange not available on JVM — no C library access")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe not available on JVM — no C library access")

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CULong, idx2: CULong): CInt =
    throw UnsupportedOperationException("kcmp not available on JVM — no C library access")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym not available on JVM — no C library access")

public actual fun memstatStrerror(error: CInt): String? =
    throw UnsupportedOperationException("memstatStrerror not available on JVM — no C library access")

public actual fun memstatMtlAlloc(): MemoryTypeList? =
    throw UnsupportedOperationException("memstatMtlAlloc not available on JVM — no C library access")

public actual fun memstatMtlFirst(list: MemoryTypeList?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFirst not available on JVM — no C library access")

public actual fun memstatMtlNext(mtp: MemoryType?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlNext not available on JVM — no C library access")

public actual fun memstatMtlFind(list: MemoryTypeList?, allocator: CInt, name: String?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFind not available on JVM — no C library access")

public actual fun memstatMtlFree(list: MemoryTypeList?) {
    throw UnsupportedOperationException("memstatMtlFree not available on JVM — no C library access")
}

public actual fun memstatMtlGeterror(list: MemoryTypeList?): CInt =
    throw UnsupportedOperationException("memstatMtlGeterror not available on JVM — no C library access")

public actual fun memstatGetName(mtp: MemoryType?): String? =
    throw UnsupportedOperationException("memstatGetName not available on JVM — no C library access")

public actual fun kvmDpcpuSetcpu(kd: KvmT, cpu: CUInt): CInt =
    throw UnsupportedOperationException("kvmDpcpuSetcpu not available on JVM — no C library access")

public actual fun kvmGetargv(kd: KvmT, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetargv not available on JVM — no C library access")

public actual fun kvmGetcptime(kd: KvmT, cpTime: CLong?): CInt =
    throw UnsupportedOperationException("kvmGetcptime not available on JVM — no C library access")

public actual fun kvmGetenvv(kd: KvmT, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetenvv not available on JVM — no C library access")

public actual fun kvmGeterr(kd: KvmT): String? =
    throw UnsupportedOperationException("kvmGeterr not available on JVM — no C library access")

public actual fun kvmGetmaxcpu(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmGetmaxcpu not available on JVM — no C library access")

public actual fun kvmGetncpus(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmGetncpus not available on JVM — no C library access")

public actual fun kvmGetpcpu(kd: KvmT, cpu: CInt): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetpcpu not available on JVM — no C library access")

public actual fun kvmCounterU64Fetch(kd: KvmT, base: CULong): ULong =
    throw UnsupportedOperationException("kvmCounterU64Fetch not available on JVM — no C library access")

public actual fun kvmGetswapinfo(kd: KvmT, info: KvmSwap?, maxswap: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("kvmGetswapinfo not available on JVM — no C library access")

public actual fun kvmNative(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmNative not available on JVM — no C library access")

public actual fun kvmNlist(kd: KvmT, nl: Nlist?): CInt =
    throw UnsupportedOperationException("kvmNlist not available on JVM — no C library access")

public actual fun kvmNlist2(kd: KvmT, nl: KvmNlist?): CInt =
    throw UnsupportedOperationException("kvmNlist2 not available on JVM — no C library access")

public actual fun kvmReadZpcpu(kd: KvmT, base: CULong, buf: COpaquePointer?, size: ULong, cpu: CInt): SsizeT =
    throw UnsupportedOperationException("kvmReadZpcpu not available on JVM — no C library access")

public actual fun kvmRead2(kd: KvmT, addr: KvaddrT, buf: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("kvmRead2 not available on JVM — no C library access")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    throw UnsupportedOperationException("extattrNamespaceToString not available on JVM — no C library access")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    throw UnsupportedOperationException("extattrStringToNamespace not available on JVM — no C library access")

public actual fun realhostname(host: String?, hsize: ULong, ip: InAddr?): CInt =
    throw UnsupportedOperationException("realhostname not available on JVM — no C library access")

public actual fun realhostnameSa(host: String?, hsize: ULong, addr: Sockaddr?, addrlen: CInt): CInt =
    throw UnsupportedOperationException("realhostnameSa not available on JVM — no C library access")

public actual fun kldIsloaded(name: String?): CInt =
    throw UnsupportedOperationException("kldIsloaded not available on JVM — no C library access")

public actual fun kldLoad(name: String?): CInt =
    throw UnsupportedOperationException("kldLoad not available on JVM — no C library access")

public actual fun kinfoGetvmmap(pid: PidT, cntp: CInt?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap not available on JVM — no C library access")

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
    throw UnsupportedOperationException("hexdump not available on JVM — no C library access")
}

public actual fun humanizeNumber(buf: String?, len: ULong, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("humanizeNumber not available on JVM — no C library access")

public actual fun flopen(path: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("flopen not available on JVM — no C library access")

public actual fun flopenat(fd: CInt, path: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("flopenat not available on JVM — no C library access")

public actual fun getlocalbase(): String? =
    throw UnsupportedOperationException("getlocalbase not available on JVM — no C library access")

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: PidT?): Pidfh? =
    throw UnsupportedOperationException("pidfileOpen not available on JVM — no C library access")

public actual fun pidfileWrite(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileWrite not available on JVM — no C library access")

public actual fun pidfileClose(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileClose not available on JVM — no C library access")

public actual fun pidfileRemove(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileRemove not available on JVM — no C library access")

public actual fun pidfileFileno(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileFileno not available on JVM — no C library access")

public actual fun procstatOpenSysctl(): Procstat? =
    throw UnsupportedOperationException("procstatOpenSysctl not available on JVM — no C library access")

public actual fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: CInt): FilestatList? =
    throw UnsupportedOperationException("procstatGetfiles not available on JVM — no C library access")

public actual fun procstatFreefiles(procstat: Procstat?, head: FilestatList?) {
    throw UnsupportedOperationException("procstatFreefiles not available on JVM — no C library access")
}

public actual fun procstatGetprocs(procstat: Procstat?, what: CInt, arg: CInt, count: CUInt?): KinfoProc? =
    throw UnsupportedOperationException("procstatGetprocs not available on JVM — no C library access")

public actual fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?) {
    throw UnsupportedOperationException("procstatFreeprocs not available on JVM — no C library access")
}

public actual fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: CUInt?): KinfoVmentry? =
    throw UnsupportedOperationException("procstatGetvmmap not available on JVM — no C library access")

public actual fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?) {
    throw UnsupportedOperationException("procstatFreevmmap not available on JVM — no C library access")
}

public actual fun procstatClose(procstat: Procstat?) {
    throw UnsupportedOperationException("procstatClose not available on JVM — no C library access")
}

public actual fun procstatFreeargv(procstat: Procstat?) {
    throw UnsupportedOperationException("procstatFreeargv not available on JVM — no C library access")
}

public actual fun procstatFreeenvv(procstat: Procstat?) {
    throw UnsupportedOperationException("procstatFreeenvv not available on JVM — no C library access")
}

public actual fun procstatFreegroups(procstat: Procstat?, groups: GidT?) {
    throw UnsupportedOperationException("procstatFreegroups not available on JVM — no C library access")
}

public actual fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?) {
    throw UnsupportedOperationException("procstatFreeptlwpinfo not available on JVM — no C library access")
}

public actual fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetargv not available on JVM — no C library access")

public actual fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetenvv not available on JVM — no C library access")

public actual fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: CUInt?): GidT? =
    throw UnsupportedOperationException("procstatGetgroups not available on JVM — no C library access")

public actual fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: CInt?): CInt =
    throw UnsupportedOperationException("procstatGetosrel not available on JVM — no C library access")

public actual fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: String?, maxlen: ULong): CInt =
    throw UnsupportedOperationException("procstatGetpathname not available on JVM — no C library access")

public actual fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: CInt, rlimit: Rlimit?): CInt =
    throw UnsupportedOperationException("procstatGetrlimit not available on JVM — no C library access")

public actual fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: CUShort?): CInt =
    throw UnsupportedOperationException("procstatGetumask not available on JVM — no C library access")

public actual fun procstatOpenCore(filename: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenCore not available on JVM — no C library access")

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenKvm not available on JVM — no C library access")

public actual fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetSocketInfo not available on JVM — no C library access")

public actual fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Vnstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetVnodeInfo not available on JVM — no C library access")

public actual fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetPtsInfo not available on JVM — no C library access")

public actual fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetShmInfo not available on JVM — no C library access")

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerCreate not available on JVM — no C library access")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete not available on JVM — no C library access")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun not available on JVM — no C library access")

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime not available on JVM — no C library access")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime not available on JVM — no C library access")

public actual fun devstatGetnumdevs(kd: KvmT): CInt =
    throw UnsupportedOperationException("devstatGetnumdevs not available on JVM — no C library access")

public actual fun devstatGetgeneration(kd: KvmT): CLong =
    throw UnsupportedOperationException("devstatGetgeneration not available on JVM — no C library access")

public actual fun devstatGetversion(kd: KvmT): CInt =
    throw UnsupportedOperationException("devstatGetversion not available on JVM — no C library access")

public actual fun devstatCheckversion(kd: KvmT): CInt =
    throw UnsupportedOperationException("devstatCheckversion not available on JVM — no C library access")

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: CInt?, numSelections: CInt?, selectGeneration: CLong?, currentGeneration: CLong, devices: Devstat?, numdevs: CInt, matches: DevstatMatch?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    throw UnsupportedOperationException("devstatSelectdevs not available on JVM — no C library access")

public actual fun devstatBuildmatch(matchStr: String?, matches: COpaquePointer?, numMatches: CInt?): CInt =
    throw UnsupportedOperationException("devstatBuildmatch not available on JVM — no C library access")

