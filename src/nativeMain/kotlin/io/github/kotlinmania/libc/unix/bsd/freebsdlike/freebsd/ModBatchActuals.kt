// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun mALLOCXALIGN(lg: CUInt): CInt =
    throw UnsupportedOperationException("mALLOCXALIGN requires manual FFI bridge — not yet implemented")

public actual fun sOCKCREDSIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): CInt =
    throw UnsupportedOperationException("uname requires manual FFI bridge — not yet implemented")

public actual fun cPUZERO(cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUZERO requires manual FFI bridge — not yet implemented")
}

public actual fun cPUFILL(cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUFILL requires manual FFI bridge — not yet implemented")
}

public actual fun cPUSET(cpu: ULong, cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUSET requires manual FFI bridge — not yet implemented")
}

public actual fun cPUCLR(cpu: ULong, cpuset: CpusetT?) {
    throw UnsupportedOperationException("cPUCLR requires manual FFI bridge — not yet implemented")
}

public actual fun cPUISSET(cpu: ULong, cpuset: CpusetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires manual FFI bridge — not yet implemented")

public actual fun cPUCOUNT(cpuset: CpusetT?): CInt =
    throw UnsupportedOperationException("cPUCOUNT requires manual FFI bridge — not yet implemented")

public actual fun sOCKCRED2SIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCRED2SIZE requires manual FFI bridge — not yet implemented")

public actual fun pROTMAX(x: CInt): CInt =
    throw UnsupportedOperationException("pROTMAX requires manual FFI bridge — not yet implemented")

public actual fun pROTMAXEXTRACT(x: CInt): CInt =
    throw UnsupportedOperationException("pROTMAXEXTRACT requires manual FFI bridge — not yet implemented")

public actual fun fhlink(fhp: FhandleT?, to: String?): CInt =
    throw UnsupportedOperationException("fhlink requires manual FFI bridge — not yet implemented")

public actual fun fhlinkat(fhp: FhandleT?, tofd: CInt, to: String?): CInt =
    throw UnsupportedOperationException("fhlinkat requires manual FFI bridge — not yet implemented")

public actual fun fhreadlink(fhp: FhandleT?, buf: String?, bufsize: ULong): CInt =
    throw UnsupportedOperationException("fhreadlink requires manual FFI bridge — not yet implemented")

public actual fun getfhat(fd: CInt, path: String?, fhp: Fhandle?, flag: CInt): CInt =
    throw UnsupportedOperationException("getfhat requires manual FFI bridge — not yet implemented")

public actual fun error(): CInt? =
    throw UnsupportedOperationException("error requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(op: CInt, aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioRead(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioReadv(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioReadv requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocbp: Aiocb?): SsizeT =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun aioWritev(aiocbp: Aiocb?): CInt =
    throw UnsupportedOperationException("aioWritev requires manual FFI bridge — not yet implemented")

public actual fun copyFileRange(infd: CInt, inoffp: OffT?, outfd: CInt, outoffp: OffT?, len: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("copyFileRange requires manual FFI bridge — not yet implemented")

public actual fun devnameR(dev: DevT, mode: ModeT, buf: String?, len: CInt): String? =
    throw UnsupportedOperationException("devnameR requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteFd requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteFile requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    throw UnsupportedOperationException("extattrDeleteLink requires manual FFI bridge — not yet implemented")

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetFd requires manual FFI bridge — not yet implemented")

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetFile requires manual FFI bridge — not yet implemented")

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrGetLink requires manual FFI bridge — not yet implemented")

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListFd requires manual FFI bridge — not yet implemented")

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListFile requires manual FFI bridge — not yet implemented")

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrListLink requires manual FFI bridge — not yet implemented")

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrSetFd requires manual FFI bridge — not yet implemented")

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrSetFile requires manual FFI bridge — not yet implemented")

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("extattrSetLink requires manual FFI bridge — not yet implemented")

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: SpacectlRange?, flags: CInt, rmsr: SpacectlRange?): CInt =
    throw UnsupportedOperationException("fspacectl requires manual FFI bridge — not yet implemented")

public actual fun jail(jail: Jail?): CInt =
    throw UnsupportedOperationException("jail requires manual FFI bridge — not yet implemented")

public actual fun jailAttach(jid: CInt): CInt =
    throw UnsupportedOperationException("jailAttach requires manual FFI bridge — not yet implemented")

public actual fun jailRemove(jid: CInt): CInt =
    throw UnsupportedOperationException("jailRemove requires manual FFI bridge — not yet implemented")

public actual fun jailGet(iov: Iovec?, niov: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("jailGet requires manual FFI bridge — not yet implemented")

public actual fun jailSet(iov: Iovec?, niov: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("jailSet requires manual FFI bridge — not yet implemented")

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun getutxuser(user: String?): Utmpx? =
    throw UnsupportedOperationException("getutxuser requires manual FFI bridge — not yet implemented")

public actual fun setutxdb(type: CInt, file: String?): CInt =
    throw UnsupportedOperationException("setutxdb requires manual FFI bridge — not yet implemented")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("aioWaitcomplete requires manual FFI bridge — not yet implemented")

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    throw UnsupportedOperationException("mqGetfdNp requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: SiginfoT?, options: CInt): CInt =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun ptsnameR(fd: CInt, buf: String?, buflen: ULong): CInt =
    throw UnsupportedOperationException("ptsnameR requires manual FFI bridge — not yet implemented")

public actual fun shmget(key: KeyT, size: ULong, shmflg: CInt): CInt =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires manual FFI bridge — not yet implemented")

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    throw UnsupportedOperationException("shmdt requires manual FFI bridge — not yet implemented")

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: ShmidDs?): CInt =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    throw UnsupportedOperationException("semget requires manual FFI bridge — not yet implemented")

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("semctl requires manual FFI bridge — not yet implemented")

public actual fun semop(semid: CInt, sops: Sembuf?, nsops: ULong): CInt =
    throw UnsupportedOperationException("semop requires manual FFI bridge — not yet implemented")

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: MsqidDs?): CInt =
    throw UnsupportedOperationException("msgctl requires manual FFI bridge — not yet implemented")

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgget requires manual FFI bridge — not yet implemented")

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: ULong, msgflg: CInt): CInt =
    throw UnsupportedOperationException("msgsnd requires manual FFI bridge — not yet implemented")

public actual fun cfmakesane(termios: Termios?) {
    throw UnsupportedOperationException("cfmakesane requires manual FFI bridge — not yet implemented")
}

public actual fun pdfork(fdp: CInt?, flags: CInt): PidT =
    throw UnsupportedOperationException("pdfork requires manual FFI bridge — not yet implemented")

public actual fun pdgetpid(fd: CInt, pidp: PidT?): CInt =
    throw UnsupportedOperationException("pdgetpid requires manual FFI bridge — not yet implemented")

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    throw UnsupportedOperationException("pdkill requires manual FFI bridge — not yet implemented")

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: Rtprio?): CInt =
    throw UnsupportedOperationException("rtprioThread requires manual FFI bridge — not yet implemented")

public actual fun uuidgen(store: Uuid?, count: CInt): CInt =
    throw UnsupportedOperationException("uuidgen requires manual FFI bridge — not yet implemented")

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    throw UnsupportedOperationException("thrKill requires manual FFI bridge — not yet implemented")

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    throw UnsupportedOperationException("thrKill2 requires manual FFI bridge — not yet implemented")

public actual fun thrSelf(tid: CLong?): CInt =
    throw UnsupportedOperationException("thrSelf requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetthreadidNp(): CInt =
    throw UnsupportedOperationException("pthreadGetthreadidNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: ULong, cpusetp: CpusetT?): CInt =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: ULong, cpusetp: CpusetT?): CInt =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: PidT, cpusetsz: ULong, cpuset: CpusetT?): CInt =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: PidT, cpusetsz: ULong, cpuset: CpusetT?): CInt =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedGetcpu(): CInt =
    throw UnsupportedOperationException("schedGetcpu requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexConsistent(mutex: PthreadMutexT): CInt =
    throw UnsupportedOperationException("pthreadMutexConsistent requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrGetrobust(attr: PthreadMutexattrT, robust: CInt?): CInt =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetrobust(attr: PthreadMutexattrT, robust: CInt): CInt =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinInit(lock: PthreadSpinlockT, pshared: CInt): CInt =
    throw UnsupportedOperationException("pthreadSpinInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinDestroy(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinLock(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinTrylock(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinUnlock(lock: PthreadSpinlockT): CInt =
    throw UnsupportedOperationException("pthreadSpinUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires manual FFI bridge — not yet implemented")

public actual fun statfs(path: String?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: CInt, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    throw UnsupportedOperationException("xuname requires manual FFI bridge — not yet implemented")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: ULong, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sendmmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: ULong, flags: CInt, timeout: Timespec?): SsizeT =
    throw UnsupportedOperationException("recvmmsg requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires manual FFI bridge — not yet implemented")

public actual fun fhopen(fhp: FhandleT?, flags: CInt): CInt =
    throw UnsupportedOperationException("fhopen requires manual FFI bridge — not yet implemented")

public actual fun fhstat(fhp: Fhandle?, buf: Stat?): CInt =
    throw UnsupportedOperationException("fhstat requires manual FFI bridge — not yet implemented")

public actual fun fhstatfs(fhp: FhandleT?, buf: Statfs?): CInt =
    throw UnsupportedOperationException("fhstatfs requires manual FFI bridge — not yet implemented")

public actual fun getfh(path: String?, fhp: FhandleT?): CInt =
    throw UnsupportedOperationException("getfh requires manual FFI bridge — not yet implemented")

public actual fun lgetfh(path: String?, fhp: FhandleT?): CInt =
    throw UnsupportedOperationException("lgetfh requires manual FFI bridge — not yet implemented")

public actual fun getfsstat(buf: Statfs?, bufsize: CLong, mode: CInt): CInt =
    throw UnsupportedOperationException("getfsstat requires manual FFI bridge — not yet implemented")

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    throw UnsupportedOperationException("getmntinfo requires manual FFI bridge — not yet implemented")

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun nmount(iov: Iovec?, niov: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("nmount requires manual FFI bridge — not yet implemented")

public actual fun setproctitle(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitle requires manual FFI bridge — not yet implemented")
}

public actual fun rfork(flags: CInt): CInt =
    throw UnsupportedOperationException("rfork requires manual FFI bridge — not yet implemented")

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: ULong, mask: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: ULong, mask: CpusetT?): CInt =
    throw UnsupportedOperationException("cpusetSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun cpuset(setid: CpusetidT?): CInt =
    throw UnsupportedOperationException("cpuset requires manual FFI bridge — not yet implemented")

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: CpusetidT?): CInt =
    throw UnsupportedOperationException("cpusetGetid requires manual FFI bridge — not yet implemented")

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    throw UnsupportedOperationException("cpusetSetid requires manual FFI bridge — not yet implemented")

public actual fun capEnter(): CInt =
    throw UnsupportedOperationException("capEnter requires manual FFI bridge — not yet implemented")

public actual fun capGetmode(modep: CUInt?): CInt =
    throw UnsupportedOperationException("capGetmode requires manual FFI bridge — not yet implemented")

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: UInt?): CInt =
    throw UnsupportedOperationException("capFcntlsGet requires manual FFI bridge — not yet implemented")

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    throw UnsupportedOperationException("capFcntlsLimit requires manual FFI bridge — not yet implemented")

public actual fun capIoctlsGet(fd: CInt, cmds: ULong?, maxcmds: ULong): Long =
    throw UnsupportedOperationException("capIoctlsGet requires manual FFI bridge — not yet implemented")

public actual fun capIoctlsLimit(fd: CInt, cmds: ULong?, ncmds: ULong): CInt =
    throw UnsupportedOperationException("capIoctlsLimit requires manual FFI bridge — not yet implemented")

public actual fun capRightsInit(version: CInt, rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsInit requires manual FFI bridge — not yet implemented")

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: CapRightsT?): CInt =
    throw UnsupportedOperationException("capRightsGet requires manual FFI bridge — not yet implemented")

public actual fun capRightsSet(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsSet requires manual FFI bridge — not yet implemented")

public actual fun capRightsClear(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsClear requires manual FFI bridge — not yet implemented")

public actual fun capRightsIsSet(rights: CapRightsT?, vararg args: Any?): Boolean =
    throw UnsupportedOperationException("capRightsIsSet requires manual FFI bridge — not yet implemented")

public actual fun capRightsIsValid(rights: CapRightsT?): Boolean =
    throw UnsupportedOperationException("capRightsIsValid requires manual FFI bridge — not yet implemented")

public actual fun capRightsLimit(fd: CInt, rights: CapRightsT?): CInt =
    throw UnsupportedOperationException("capRightsLimit requires manual FFI bridge — not yet implemented")

public actual fun capRightsMerge(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    throw UnsupportedOperationException("capRightsMerge requires manual FFI bridge — not yet implemented")

public actual fun capRightsRemove(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    throw UnsupportedOperationException("capRightsRemove requires manual FFI bridge — not yet implemented")

public actual fun capRightsContains(big: CapRightsT?, little: CapRightsT?): Boolean =
    throw UnsupportedOperationException("capRightsContains requires manual FFI bridge — not yet implemented")

public actual fun capSandboxed(): Boolean =
    throw UnsupportedOperationException("capSandboxed requires manual FFI bridge — not yet implemented")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires manual FFI bridge — not yet implemented")

public actual fun ffs(value: CInt): CInt =
    throw UnsupportedOperationException("ffs requires manual FFI bridge — not yet implemented")

public actual fun ffsl(value: CLong): CInt =
    throw UnsupportedOperationException("ffsl requires manual FFI bridge — not yet implemented")

public actual fun ffsll(value: CLongLong): CInt =
    throw UnsupportedOperationException("ffsll requires manual FFI bridge — not yet implemented")

public actual fun fls(value: CInt): CInt =
    throw UnsupportedOperationException("fls requires manual FFI bridge — not yet implemented")

public actual fun flsl(value: CLong): CInt =
    throw UnsupportedOperationException("flsl requires manual FFI bridge — not yet implemented")

public actual fun flsll(value: CLongLong): CInt =
    throw UnsupportedOperationException("flsll requires manual FFI bridge — not yet implemented")

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("mallctl requires manual FFI bridge — not yet implemented")

public actual fun mallctlnametomib(name: String?, mibp: ULong?, miplen: ULong?): CInt =
    throw UnsupportedOperationException("mallctlnametomib requires manual FFI bridge — not yet implemented")

public actual fun mallctlbymib(mib: ULong?, mible: ULong, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): CInt =
    throw UnsupportedOperationException("mallctlbymib requires manual FFI bridge — not yet implemented")

public actual fun mallocx(size: ULong, flags: CInt): COpaquePointer? =
    throw UnsupportedOperationException("mallocx requires manual FFI bridge — not yet implemented")

public actual fun rallocx(ptr: COpaquePointer?, size: ULong, flags: CInt): COpaquePointer? =
    throw UnsupportedOperationException("rallocx requires manual FFI bridge — not yet implemented")

public actual fun xallocx(ptr: COpaquePointer?, size: ULong, extra: ULong, flags: CInt): ULong =
    throw UnsupportedOperationException("xallocx requires manual FFI bridge — not yet implemented")

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): ULong =
    throw UnsupportedOperationException("sallocx requires manual FFI bridge — not yet implemented")

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt) {
    throw UnsupportedOperationException("dallocx requires manual FFI bridge — not yet implemented")
}

public actual fun sdallocx(ptr: COpaquePointer?, size: ULong, flags: CInt) {
    throw UnsupportedOperationException("sdallocx requires manual FFI bridge — not yet implemented")
}

public actual fun nallocx(size: ULong, flags: CInt): ULong =
    throw UnsupportedOperationException("nallocx requires manual FFI bridge — not yet implemented")

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    throw UnsupportedOperationException("procctl requires manual FFI bridge — not yet implemented")

public actual fun getpagesize(): CInt =
    platform.posix.getpagesize()
public actual fun getpagesizes(pagesize: ULong?, nelem: CInt): CInt =
    throw UnsupportedOperationException("getpagesizes requires manual FFI bridge — not yet implemented")

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: ClockidT?): CInt =
    throw UnsupportedOperationException("clockGetcpuclockid2 requires manual FFI bridge — not yet implemented")

public actual fun strchrnul(s: String?, c: CInt): String? =
    throw UnsupportedOperationException("strchrnul requires manual FFI bridge — not yet implemented")

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    throw UnsupportedOperationException("shmCreateLargepage requires manual FFI bridge — not yet implemented")

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    throw UnsupportedOperationException("shmRename requires manual FFI bridge — not yet implemented")

public actual fun memfdCreate(name: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("memfdCreate requires manual FFI bridge — not yet implemented")

public actual fun setaudit(auditinfo: AuditinfoT?): CInt =
    throw UnsupportedOperationException("setaudit requires manual FFI bridge — not yet implemented")

public actual fun eventfd(initval: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("eventfd requires manual FFI bridge — not yet implemented")

public actual fun eventfdRead(fd: CInt, value: EventfdT?): CInt =
    throw UnsupportedOperationException("eventfdRead requires manual FFI bridge — not yet implemented")

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    throw UnsupportedOperationException("eventfdWrite requires manual FFI bridge — not yet implemented")

public actual fun fdatasync(fd: CInt): CInt =
    throw UnsupportedOperationException("fdatasync requires manual FFI bridge — not yet implemented")

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    throw UnsupportedOperationException("elfAuxInfo requires manual FFI bridge — not yet implemented")

public actual fun setproctitleFast(fmt: String?, vararg args: Any?) {
    throw UnsupportedOperationException("setproctitleFast requires manual FFI bridge — not yet implemented")
}

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("timingsafeBcmp requires manual FFI bridge — not yet implemented")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("timingsafeMemcmp requires manual FFI bridge — not yet implemented")

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, `val`: CULong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    throw UnsupportedOperationException("umtxOp requires manual FFI bridge — not yet implemented")

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    throw UnsupportedOperationException("sctpPeeloff requires manual FFI bridge — not yet implemented")

public actual fun sctpBindx(s: CInt, addrs: Sockaddr?, num: CInt, tpe: CInt): CInt =
    throw UnsupportedOperationException("sctpBindx requires manual FFI bridge — not yet implemented")

public actual fun sctpConnectx(s: CInt, addrs: Sockaddr?, addrcnt: CInt, id: SctpAssocT?): CInt =
    throw UnsupportedOperationException("sctpConnectx requires manual FFI bridge — not yet implemented")

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    throw UnsupportedOperationException("sctpGetaddrlen requires manual FFI bridge — not yet implemented")

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sctpGetpaddrs requires manual FFI bridge — not yet implemented")

public actual fun sctpFreepaddrs(addrs: Sockaddr?) {
    throw UnsupportedOperationException("sctpFreepaddrs requires manual FFI bridge — not yet implemented")
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sctpGetladdrs requires manual FFI bridge — not yet implemented")

public actual fun sctpFreeladdrs(addrs: Sockaddr?) {
    throw UnsupportedOperationException("sctpFreeladdrs requires manual FFI bridge — not yet implemented")
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: SocklenT?): CInt =
    throw UnsupportedOperationException("sctpOptInfo requires manual FFI bridge — not yet implemented")

public actual fun sctpSendv(sd: CInt, iov: Iovec?, iovcnt: CInt, addrs: Sockaddr?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUInt, flags: CInt): SsizeT =
    throw UnsupportedOperationException("sctpSendv requires manual FFI bridge — not yet implemented")

public actual fun sctpRecvv(sd: CInt, iov: Iovec?, iovcnt: CInt, from: Sockaddr?, fromlen: SocklenT?, info: COpaquePointer?, infolen: SocklenT?, infotype: CUInt?, flags: CInt?): SsizeT =
    throw UnsupportedOperationException("sctpRecvv requires manual FFI bridge — not yet implemented")

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("timerfdCreate requires manual FFI bridge — not yet implemented")

public actual fun timerfdGettime(fd: CInt, currValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdGettime requires manual FFI bridge — not yet implemented")

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: Itimerspec?, oldValue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerfdSettime requires manual FFI bridge — not yet implemented")

public actual fun closefrom(lowfd: CInt) {
    throw UnsupportedOperationException("closefrom requires manual FFI bridge — not yet implemented")
}

public actual fun closeRange(lowfd: CUInt, highfd: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("closeRange requires manual FFI bridge — not yet implemented")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CULong, idx2: CULong): CInt =
    throw UnsupportedOperationException("kcmp requires manual FFI bridge — not yet implemented")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires manual FFI bridge — not yet implemented")

public actual fun memstatStrerror(error: CInt): String? =
    throw UnsupportedOperationException("memstatStrerror requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlAlloc(): MemoryTypeList? =
    throw UnsupportedOperationException("memstatMtlAlloc requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlFirst(list: MemoryTypeList?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFirst requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlNext(mtp: MemoryType?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlNext requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlFind(list: MemoryTypeList?, allocator: CInt, name: String?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFind requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlFree(list: MemoryTypeList?) {
    throw UnsupportedOperationException("memstatMtlFree requires manual FFI bridge — not yet implemented")
}

public actual fun memstatMtlGeterror(list: MemoryTypeList?): CInt =
    throw UnsupportedOperationException("memstatMtlGeterror requires manual FFI bridge — not yet implemented")

public actual fun memstatGetName(mtp: MemoryType?): String? =
    throw UnsupportedOperationException("memstatGetName requires manual FFI bridge — not yet implemented")

public actual fun kvmDpcpuSetcpu(kd: KvmT, cpu: CUInt): CInt =
    throw UnsupportedOperationException("kvmDpcpuSetcpu requires manual FFI bridge — not yet implemented")

public actual fun kvmGetargv(kd: KvmT, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetargv requires manual FFI bridge — not yet implemented")

public actual fun kvmGetcptime(kd: KvmT, cpTime: CLong?): CInt =
    throw UnsupportedOperationException("kvmGetcptime requires manual FFI bridge — not yet implemented")

public actual fun kvmGetenvv(kd: KvmT, p: KinfoProc?, nchr: CInt): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetenvv requires manual FFI bridge — not yet implemented")

public actual fun kvmGeterr(kd: KvmT): String? =
    throw UnsupportedOperationException("kvmGeterr requires manual FFI bridge — not yet implemented")

public actual fun kvmGetmaxcpu(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmGetmaxcpu requires manual FFI bridge — not yet implemented")

public actual fun kvmGetncpus(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmGetncpus requires manual FFI bridge — not yet implemented")

public actual fun kvmGetpcpu(kd: KvmT, cpu: CInt): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetpcpu requires manual FFI bridge — not yet implemented")

public actual fun kvmCounterU64Fetch(kd: KvmT, base: CULong): ULong =
    throw UnsupportedOperationException("kvmCounterU64Fetch requires manual FFI bridge — not yet implemented")

public actual fun kvmGetswapinfo(kd: KvmT, info: KvmSwap?, maxswap: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("kvmGetswapinfo requires manual FFI bridge — not yet implemented")

public actual fun kvmNative(kd: KvmT): CInt =
    throw UnsupportedOperationException("kvmNative requires manual FFI bridge — not yet implemented")

public actual fun kvmNlist(kd: KvmT, nl: Nlist?): CInt =
    throw UnsupportedOperationException("kvmNlist requires manual FFI bridge — not yet implemented")

public actual fun kvmNlist2(kd: KvmT, nl: KvmNlist?): CInt =
    throw UnsupportedOperationException("kvmNlist2 requires manual FFI bridge — not yet implemented")

public actual fun kvmReadZpcpu(kd: KvmT, base: CULong, buf: COpaquePointer?, size: ULong, cpu: CInt): SsizeT =
    throw UnsupportedOperationException("kvmReadZpcpu requires manual FFI bridge — not yet implemented")

public actual fun kvmRead2(kd: KvmT, addr: KvaddrT, buf: COpaquePointer?, nbytes: ULong): SsizeT =
    throw UnsupportedOperationException("kvmRead2 requires manual FFI bridge — not yet implemented")

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    throw UnsupportedOperationException("extattrNamespaceToString requires manual FFI bridge — not yet implemented")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: CInt?): CInt =
    throw UnsupportedOperationException("extattrStringToNamespace requires manual FFI bridge — not yet implemented")

public actual fun realhostname(host: String?, hsize: ULong, ip: InAddr?): CInt =
    throw UnsupportedOperationException("realhostname requires manual FFI bridge — not yet implemented")

public actual fun realhostnameSa(host: String?, hsize: ULong, addr: Sockaddr?, addrlen: CInt): CInt =
    throw UnsupportedOperationException("realhostnameSa requires manual FFI bridge — not yet implemented")

public actual fun kldIsloaded(name: String?): CInt =
    throw UnsupportedOperationException("kldIsloaded requires manual FFI bridge — not yet implemented")

public actual fun kldLoad(name: String?): CInt =
    throw UnsupportedOperationException("kldLoad requires manual FFI bridge — not yet implemented")

public actual fun kinfoGetvmmap(pid: PidT, cntp: CInt?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap requires manual FFI bridge — not yet implemented")

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
    throw UnsupportedOperationException("hexdump requires manual FFI bridge — not yet implemented")
}

public actual fun humanizeNumber(buf: String?, len: ULong, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    throw UnsupportedOperationException("humanizeNumber requires manual FFI bridge — not yet implemented")

public actual fun flopen(path: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("flopen requires manual FFI bridge — not yet implemented")

public actual fun flopenat(fd: CInt, path: String?, flags: CInt, vararg args: Any?): CInt =
    throw UnsupportedOperationException("flopenat requires manual FFI bridge — not yet implemented")

public actual fun getlocalbase(): String? =
    throw UnsupportedOperationException("getlocalbase requires manual FFI bridge — not yet implemented")

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: PidT?): Pidfh? =
    throw UnsupportedOperationException("pidfileOpen requires manual FFI bridge — not yet implemented")

public actual fun pidfileWrite(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileWrite requires manual FFI bridge — not yet implemented")

public actual fun pidfileClose(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileClose requires manual FFI bridge — not yet implemented")

public actual fun pidfileRemove(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileRemove requires manual FFI bridge — not yet implemented")

public actual fun pidfileFileno(path: Pidfh?): CInt =
    throw UnsupportedOperationException("pidfileFileno requires manual FFI bridge — not yet implemented")

public actual fun procstatOpenSysctl(): Procstat? =
    throw UnsupportedOperationException("procstatOpenSysctl requires manual FFI bridge — not yet implemented")

public actual fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: CInt): FilestatList? =
    throw UnsupportedOperationException("procstatGetfiles requires manual FFI bridge — not yet implemented")

public actual fun procstatFreefiles(procstat: Procstat?, head: FilestatList?) {
    throw UnsupportedOperationException("procstatFreefiles requires manual FFI bridge — not yet implemented")
}

public actual fun procstatGetprocs(procstat: Procstat?, what: CInt, arg: CInt, count: CUInt?): KinfoProc? =
    throw UnsupportedOperationException("procstatGetprocs requires manual FFI bridge — not yet implemented")

public actual fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?) {
    throw UnsupportedOperationException("procstatFreeprocs requires manual FFI bridge — not yet implemented")
}

public actual fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: CUInt?): KinfoVmentry? =
    throw UnsupportedOperationException("procstatGetvmmap requires manual FFI bridge — not yet implemented")

public actual fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?) {
    throw UnsupportedOperationException("procstatFreevmmap requires manual FFI bridge — not yet implemented")
}

public actual fun procstatClose(procstat: Procstat?) {
    throw UnsupportedOperationException("procstatClose requires manual FFI bridge — not yet implemented")
}

public actual fun procstatFreeargv(procstat: Procstat?) {
    throw UnsupportedOperationException("procstatFreeargv requires manual FFI bridge — not yet implemented")
}

public actual fun procstatFreeenvv(procstat: Procstat?) {
    throw UnsupportedOperationException("procstatFreeenvv requires manual FFI bridge — not yet implemented")
}

public actual fun procstatFreegroups(procstat: Procstat?, groups: GidT?) {
    throw UnsupportedOperationException("procstatFreegroups requires manual FFI bridge — not yet implemented")
}

public actual fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?) {
    throw UnsupportedOperationException("procstatFreeptlwpinfo requires manual FFI bridge — not yet implemented")
}

public actual fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetargv requires manual FFI bridge — not yet implemented")

public actual fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetenvv requires manual FFI bridge — not yet implemented")

public actual fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: CUInt?): GidT? =
    throw UnsupportedOperationException("procstatGetgroups requires manual FFI bridge — not yet implemented")

public actual fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: CInt?): CInt =
    throw UnsupportedOperationException("procstatGetosrel requires manual FFI bridge — not yet implemented")

public actual fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: String?, maxlen: ULong): CInt =
    throw UnsupportedOperationException("procstatGetpathname requires manual FFI bridge — not yet implemented")

public actual fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: CInt, rlimit: Rlimit?): CInt =
    throw UnsupportedOperationException("procstatGetrlimit requires manual FFI bridge — not yet implemented")

public actual fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: CUShort?): CInt =
    throw UnsupportedOperationException("procstatGetumask requires manual FFI bridge — not yet implemented")

public actual fun procstatOpenCore(filename: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenCore requires manual FFI bridge — not yet implemented")

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenKvm requires manual FFI bridge — not yet implemented")

public actual fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetSocketInfo requires manual FFI bridge — not yet implemented")

public actual fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Vnstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetVnodeInfo requires manual FFI bridge — not yet implemented")

public actual fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetPtsInfo requires manual FFI bridge — not yet implemented")

public actual fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: String?): CInt =
    throw UnsupportedOperationException("procstatGetShmInfo requires manual FFI bridge — not yet implemented")

public actual fun timerCreate(clockId: ClockidT, evp: Sigevent?, timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerCreate requires manual FFI bridge — not yet implemented")

public actual fun timerDelete(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerDelete requires manual FFI bridge — not yet implemented")

public actual fun timerGetoverrun(timerid: TimerT): CInt =
    throw UnsupportedOperationException("timerGetoverrun requires manual FFI bridge — not yet implemented")

public actual fun timerGettime(timerid: TimerT, value: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerGettime requires manual FFI bridge — not yet implemented")

public actual fun timerSettime(timerid: TimerT, flags: CInt, value: Itimerspec?, ovalue: Itimerspec?): CInt =
    throw UnsupportedOperationException("timerSettime requires manual FFI bridge — not yet implemented")

public actual fun devstatGetnumdevs(kd: KvmT): CInt =
    throw UnsupportedOperationException("devstatGetnumdevs requires manual FFI bridge — not yet implemented")

public actual fun devstatGetgeneration(kd: KvmT): CLong =
    throw UnsupportedOperationException("devstatGetgeneration requires manual FFI bridge — not yet implemented")

public actual fun devstatGetversion(kd: KvmT): CInt =
    throw UnsupportedOperationException("devstatGetversion requires manual FFI bridge — not yet implemented")

public actual fun devstatCheckversion(kd: KvmT): CInt =
    throw UnsupportedOperationException("devstatCheckversion requires manual FFI bridge — not yet implemented")

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: CInt?, numSelections: CInt?, selectGeneration: CLong?, currentGeneration: CLong, devices: Devstat?, numdevs: CInt, matches: DevstatMatch?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    throw UnsupportedOperationException("devstatSelectdevs requires manual FFI bridge — not yet implemented")

public actual fun devstatBuildmatch(matchStr: String?, matches: COpaquePointer?, numMatches: CInt?): CInt =
    throw UnsupportedOperationException("devstatBuildmatch requires manual FFI bridge — not yet implemented")

public actual fun mallocStatsPrint(writeCb: ((COpaquePointer?, String?) -> Unit)?, cbopaque: COpaquePointer?, opt: String?) {
    throw UnsupportedOperationException("mallocStatsPrint requires manual FFI bridge — not yet implemented")
}
