// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_fdatasync
import libc.cinterop.libc_ffs
import libc.cinterop.libc_ffsl
import libc.cinterop.libc_ffsll
import libc.cinterop.libc_fls
import libc.cinterop.libc_flsl
import libc.cinterop.libc_flsll
import libc.cinterop.libc_getpagesize
import libc.cinterop.libc_shmdt
import libc.cinterop.libc_uname

public actual fun cMSGDATA(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA requires manual FFI bridge — not yet implemented")

public actual fun cMSGNXTHDR(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun mALLOCXALIGN(lg: UInt): Int =
    throw UnsupportedOperationException("mALLOCXALIGN requires manual FFI bridge — not yet implemented")

public actual fun sOCKCREDSIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE requires manual FFI bridge — not yet implemented")

public actual fun uname(buf: Utsname?): Int {
    if (buf == null) return -1
    val bufPtr: CPointer<ByteVar>? = buf.handle.toCPointer()
    val result = libc_uname(bufPtr)
    return result
}

public actual fun cPUZERO(cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUZERO requires manual FFI bridge — not yet implemented")

public actual fun cPUFILL(cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUFILL requires manual FFI bridge — not yet implemented")

public actual fun cPUSET(cpu: ULong, cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUSET requires manual FFI bridge — not yet implemented")

public actual fun cPUCLR(cpu: ULong, cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUCLR requires manual FFI bridge — not yet implemented")

public actual fun cPUISSET(cpu: ULong, cpuset: CpusetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires manual FFI bridge — not yet implemented")

public actual fun cPUCOUNT(cpuset: CpusetT?): Int =
    throw UnsupportedOperationException("cPUCOUNT requires manual FFI bridge — not yet implemented")

public actual fun sOCKCRED2SIZE(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCRED2SIZE requires manual FFI bridge — not yet implemented")

public actual fun pROTMAX(x: Int): Int =
    throw UnsupportedOperationException("pROTMAX requires manual FFI bridge — not yet implemented")

public actual fun pROTMAXEXTRACT(x: Int): Int =
    throw UnsupportedOperationException("pROTMAXEXTRACT requires manual FFI bridge — not yet implemented")

public actual fun fhlink(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, to: String?): Int =
    throw UnsupportedOperationException("fhlink requires manual FFI bridge — not yet implemented")

public actual fun fhlinkat(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, tofd: Int, to: String?): Int =
    throw UnsupportedOperationException("fhlinkat requires manual FFI bridge — not yet implemented")

public actual fun fhreadlink(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, buf: String?, bufsize: ULong): Int =
    throw UnsupportedOperationException("fhreadlink requires manual FFI bridge — not yet implemented")

public actual fun getfhat(fd: Int, path: String?, fhp: Fhandle?, flag: Int): Int =
    throw UnsupportedOperationException("getfhat requires manual FFI bridge — not yet implemented")

public actual fun error(): Int? =
    throw UnsupportedOperationException("error requires manual FFI bridge — not yet implemented")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires manual FFI bridge — not yet implemented")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires manual FFI bridge — not yet implemented")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires manual FFI bridge — not yet implemented")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires manual FFI bridge — not yet implemented")

public actual fun aioReadv(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioReadv requires manual FFI bridge — not yet implemented")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires manual FFI bridge — not yet implemented")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires manual FFI bridge — not yet implemented")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires manual FFI bridge — not yet implemented")

public actual fun aioWritev(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWritev requires manual FFI bridge — not yet implemented")

public actual fun copyFileRange(infd: Int, inoffp: Long?, outfd: Int, outoffp: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("copyFileRange requires manual FFI bridge — not yet implemented")

public actual fun devnameR(dev: ULong, mode: UInt, buf: String?, len: Int): String? =
    throw UnsupportedOperationException("devnameR requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFd requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteFile(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFile requires manual FFI bridge — not yet implemented")

public actual fun extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteLink requires manual FFI bridge — not yet implemented")

public actual fun extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFd requires manual FFI bridge — not yet implemented")

public actual fun extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFile requires manual FFI bridge — not yet implemented")

public actual fun extattrGetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetLink requires manual FFI bridge — not yet implemented")

public actual fun extattrListFd(fd: Int, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFd requires manual FFI bridge — not yet implemented")

public actual fun extattrListFile(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFile requires manual FFI bridge — not yet implemented")

public actual fun extattrListLink(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListLink requires manual FFI bridge — not yet implemented")

public actual fun extattrSetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrSetFd requires manual FFI bridge — not yet implemented")

public actual fun extattrSetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrSetFile requires manual FFI bridge — not yet implemented")

public actual fun extattrSetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrSetLink requires manual FFI bridge — not yet implemented")

public actual fun fspacectl(fd: Int, cmd: Int, rqsr: SpacectlRange?, flags: Int, rmsr: SpacectlRange?): Int =
    throw UnsupportedOperationException("fspacectl requires manual FFI bridge — not yet implemented")

public actual fun jail(jail: Jail?): Int =
    throw UnsupportedOperationException("jail requires manual FFI bridge — not yet implemented")

public actual fun jailAttach(jid: Int): Int =
    throw UnsupportedOperationException("jailAttach requires manual FFI bridge — not yet implemented")

public actual fun jailRemove(jid: Int): Int =
    throw UnsupportedOperationException("jailRemove requires manual FFI bridge — not yet implemented")

public actual fun jailGet(iov: Iovec?, niov: UInt, flags: Int): Int =
    throw UnsupportedOperationException("jailGet requires manual FFI bridge — not yet implemented")

public actual fun jailSet(iov: Iovec?, niov: UInt, flags: Int): Int =
    throw UnsupportedOperationException("jailSet requires manual FFI bridge — not yet implemented")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires manual FFI bridge — not yet implemented")

public actual fun getutxuser(user: String?): Utmpx? =
    throw UnsupportedOperationException("getutxuser requires manual FFI bridge — not yet implemented")

public actual fun setutxdb(type: Int, file: String?): Int =
    throw UnsupportedOperationException("setutxdb requires manual FFI bridge — not yet implemented")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): Long =
    throw UnsupportedOperationException("aioWaitcomplete requires manual FFI bridge — not yet implemented")

public actual fun mqGetfdNp(mqd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("mqGetfdNp requires manual FFI bridge — not yet implemented")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires manual FFI bridge — not yet implemented")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR requires manual FFI bridge — not yet implemented")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires manual FFI bridge — not yet implemented")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires manual FFI bridge — not yet implemented")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    libc.cinterop.libc_shmdt(shmaddr?.value?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires manual FFI bridge — not yet implemented")

public actual fun semget(key: Int, nsems: Int, semflg: Int): Int =
    throw UnsupportedOperationException("semget requires manual FFI bridge — not yet implemented")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl requires manual FFI bridge — not yet implemented")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop requires manual FFI bridge — not yet implemented")

public actual fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int =
    throw UnsupportedOperationException("msgctl requires manual FFI bridge — not yet implemented")

public actual fun msgget(key: Int, msgflg: Int): Int =
    throw UnsupportedOperationException("msgget requires manual FFI bridge — not yet implemented")

public actual fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int =
    throw UnsupportedOperationException("msgsnd requires manual FFI bridge — not yet implemented")

public actual fun cfmakesane(termios: Termios?): Unit = throw UnsupportedOperationException("cfmakesane requires manual FFI bridge — not yet implemented")

public actual fun pdfork(fdp: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pdfork requires manual FFI bridge — not yet implemented")

public actual fun pdgetpid(fd: Int, pidp: Int?): Int =
    throw UnsupportedOperationException("pdgetpid requires manual FFI bridge — not yet implemented")

public actual fun pdkill(fd: Int, signum: Int): Int =
    throw UnsupportedOperationException("pdkill requires manual FFI bridge — not yet implemented")

public actual fun rtprioThread(function: Int, lwpid: Int, rtp: Rtprio?): Int =
    throw UnsupportedOperationException("rtprioThread requires manual FFI bridge — not yet implemented")

public actual fun uuidgen(store: Uuid?, count: Int): Int =
    throw UnsupportedOperationException("uuidgen requires manual FFI bridge — not yet implemented")

public actual fun thrKill(id: Long, sig: Int): Int =
    throw UnsupportedOperationException("thrKill requires manual FFI bridge — not yet implemented")

public actual fun thrKill2(pid: Int, id: Long, sig: Int): Int =
    throw UnsupportedOperationException("thrKill2 requires manual FFI bridge — not yet implemented")

public actual fun thrSelf(tid: Long?): Int =
    throw UnsupportedOperationException("thrSelf requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetthreadidNp(): Int =
    throw UnsupportedOperationException("pthreadGetthreadidNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetaffinityNp(td: ULong, cpusetsize: ULong, cpusetp: CpusetT?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetaffinityNp(td: ULong, cpusetsize: ULong, cpusetp: CpusetT?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: Int, cpusetsz: ULong, cpuset: CpusetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: Int, cpusetsz: ULong, cpuset: CpusetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexConsistent(mutex: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexConsistent requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinInit(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinDestroy(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinLock(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinLock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinTrylock(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock requires manual FFI bridge — not yet implemented")

public actual fun pthreadSpinUnlock(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadTimedjoinNp(thread: ULong, retval: COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires manual FFI bridge — not yet implemented")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires manual FFI bridge — not yet implemented")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires manual FFI bridge — not yet implemented")

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires manual FFI bridge — not yet implemented")

public actual fun xuname(nmln: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("xuname requires manual FFI bridge — not yet implemented")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: ULong, flags: Int): Long =
    throw UnsupportedOperationException("sendmmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: ULong, flags: Int, timeout: Timespec?): Long =
    throw UnsupportedOperationException("recvmmsg requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires FFI bridge")

public actual fun fhopen(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, flags: Int): Int =
    throw UnsupportedOperationException("fhopen requires manual FFI bridge — not yet implemented")

public actual fun fhstat(fhp: Fhandle?, buf: Stat?): Int =
    throw UnsupportedOperationException("fhstat requires manual FFI bridge — not yet implemented")

public actual fun fhstatfs(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, buf: Statfs?): Int =
    throw UnsupportedOperationException("fhstatfs requires manual FFI bridge — not yet implemented")

public actual fun getfh(path: String?, fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?): Int =
    throw UnsupportedOperationException("getfh requires manual FFI bridge — not yet implemented")

public actual fun lgetfh(path: String?, fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?): Int =
    throw UnsupportedOperationException("lgetfh requires manual FFI bridge — not yet implemented")

public actual fun getfsstat(buf: Statfs?, bufsize: Long, mode: Int): Int =
    throw UnsupportedOperationException("getfsstat requires manual FFI bridge — not yet implemented")

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: Int): Int =
    throw UnsupportedOperationException("getmntinfo requires manual FFI bridge — not yet implemented")

public actual fun mount(type: String?, dir: String?, flags: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun nmount(iov: Iovec?, niov: UInt, flags: Int): Int =
    throw UnsupportedOperationException("nmount requires manual FFI bridge — not yet implemented")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle requires manual FFI bridge — not yet implemented")

public actual fun rfork(flags: Int): Int =
    throw UnsupportedOperationException("rfork requires manual FFI bridge — not yet implemented")

public actual fun cpusetGetaffinity(level: Int, which: Int, id: UInt, setsize: ULong, mask: CpusetT?): Int =
    throw UnsupportedOperationException("cpusetGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun cpusetSetaffinity(level: Int, which: Int, id: UInt, setsize: ULong, mask: CpusetT?): Int =
    throw UnsupportedOperationException("cpusetSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun cpuset(setid: Int?): Int =
    throw UnsupportedOperationException("cpuset requires manual FFI bridge — not yet implemented")

public actual fun cpusetGetid(level: Int, which: Int, id: UInt, setid: Int?): Int =
    throw UnsupportedOperationException("cpusetGetid requires manual FFI bridge — not yet implemented")

public actual fun cpusetSetid(which: Int, id: UInt, setid: Int): Int =
    throw UnsupportedOperationException("cpusetSetid requires manual FFI bridge — not yet implemented")

public actual fun capEnter(): Int =
    throw UnsupportedOperationException("capEnter requires manual FFI bridge — not yet implemented")

public actual fun capGetmode(modep: UInt?): Int =
    throw UnsupportedOperationException("capGetmode requires manual FFI bridge — not yet implemented")

public actual fun capFcntlsGet(fd: Int, fcntlrightsp: UInt?): Int =
    throw UnsupportedOperationException("capFcntlsGet requires manual FFI bridge — not yet implemented")

public actual fun capFcntlsLimit(fd: Int, fcntlrights: UInt): Int =
    throw UnsupportedOperationException("capFcntlsLimit requires manual FFI bridge — not yet implemented")

public actual fun capIoctlsGet(fd: Int, cmds: ULong?, maxcmds: ULong): Long =
    throw UnsupportedOperationException("capIoctlsGet requires manual FFI bridge — not yet implemented")

public actual fun capIoctlsLimit(fd: Int, cmds: ULong?, ncmds: ULong): Int =
    throw UnsupportedOperationException("capIoctlsLimit requires manual FFI bridge — not yet implemented")

public actual fun capRightsInit(version: Int, rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsInit requires manual FFI bridge — not yet implemented")

public actual fun capRightsGet(version: Int, fd: Int, rightsp: CapRightsT?): Int =
    throw UnsupportedOperationException("capRightsGet requires manual FFI bridge — not yet implemented")

public actual fun capRightsSet(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsSet requires manual FFI bridge — not yet implemented")

public actual fun capRightsClear(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsClear requires manual FFI bridge — not yet implemented")

public actual fun capRightsIsSet(rights: CapRightsT?, vararg args: Any?): Boolean =
    throw UnsupportedOperationException("capRightsIsSet requires manual FFI bridge — not yet implemented")

public actual fun capRightsIsValid(rights: CapRightsT?): Boolean =
    throw UnsupportedOperationException("capRightsIsValid requires manual FFI bridge — not yet implemented")

public actual fun capRightsLimit(fd: Int, rights: CapRightsT?): Int =
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

public actual fun ffs(value: Int): Int =
    libc.cinterop.libc_ffs(value)

public actual fun ffsl(value: Long): Int =
    libc.cinterop.libc_ffsl(value)

public actual fun ffsll(value: Long): Int =
    libc.cinterop.libc_ffsll(value)

public actual fun fls(value: Int): Int =
    libc.cinterop.libc_fls(value)

public actual fun flsl(value: Long): Int =
    libc.cinterop.libc_flsl(value)

public actual fun flsll(value: Long): Int =
    libc.cinterop.libc_flsll(value)

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("mallctl requires manual FFI bridge — not yet implemented")

public actual fun mallctlnametomib(name: String?, mibp: ULong?, miplen: ULong?): Int =
    throw UnsupportedOperationException("mallctlnametomib requires manual FFI bridge — not yet implemented")

public actual fun mallctlbymib(mib: ULong?, mible: ULong, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("mallctlbymib requires manual FFI bridge — not yet implemented")

public actual fun mallocx(size: ULong, flags: Int): COpaquePointer? =
    throw UnsupportedOperationException("mallocx requires manual FFI bridge — not yet implemented")

public actual fun rallocx(ptr: COpaquePointer?, size: ULong, flags: Int): COpaquePointer? =
    throw UnsupportedOperationException("rallocx requires manual FFI bridge — not yet implemented")

public actual fun xallocx(ptr: COpaquePointer?, size: ULong, extra: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("xallocx requires manual FFI bridge — not yet implemented")

public actual fun sallocx(ptr: COpaquePointer?, flags: Int): ULong =
    throw UnsupportedOperationException("sallocx requires manual FFI bridge — not yet implemented")

public actual fun dallocx(ptr: COpaquePointer?, flags: Int): Unit = throw UnsupportedOperationException("dallocx requires manual FFI bridge — not yet implemented")

public actual fun sdallocx(ptr: COpaquePointer?, size: ULong, flags: Int): Unit = throw UnsupportedOperationException("sdallocx requires manual FFI bridge — not yet implemented")

public actual fun nallocx(size: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("nallocx requires manual FFI bridge — not yet implemented")

public actual fun procctl(idtype: UInt, id: UInt, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("procctl requires manual FFI bridge — not yet implemented")

public actual fun getpagesize(): Int =
    libc.cinterop.libc_getpagesize()

public actual fun getpagesizes(pagesize: ULong?, nelem: Int): Int =
    throw UnsupportedOperationException("getpagesizes requires manual FFI bridge — not yet implemented")

public actual fun clockGetcpuclockid2(arg1: UInt, arg2: Int, arg3: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid2 requires manual FFI bridge — not yet implemented")

public actual fun strchrnul(s: String?, c: Int): String? =
    throw UnsupportedOperationException("strchrnul requires manual FFI bridge — not yet implemented")

public actual fun shmCreateLargepage(path: String?, flags: Int, psind: Int, allocPolicy: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmCreateLargepage requires manual FFI bridge — not yet implemented")

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: Int): Int =
    throw UnsupportedOperationException("shmRename requires manual FFI bridge — not yet implemented")

public actual fun memfdCreate(name: String?, flags: UInt): Int =
    throw UnsupportedOperationException("memfdCreate requires manual FFI bridge — not yet implemented")

public actual fun setaudit(auditinfo: AuditinfoT?): Int =
    throw UnsupportedOperationException("setaudit requires manual FFI bridge — not yet implemented")

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd requires manual FFI bridge — not yet implemented")

public actual fun eventfdRead(fd: Int, value: ULong?): Int =
    throw UnsupportedOperationException("eventfdRead requires manual FFI bridge — not yet implemented")

public actual fun eventfdWrite(fd: Int, value: ULong): Int =
    throw UnsupportedOperationException("eventfdWrite requires manual FFI bridge — not yet implemented")

public actual fun fdatasync(fd: Int): Int =
    libc.cinterop.libc_fdatasync(fd)

public actual fun elfAuxInfo(aux: Int, buf: COpaquePointer?, buflen: Int): Int =
    throw UnsupportedOperationException("elfAuxInfo requires manual FFI bridge — not yet implemented")

public actual fun setproctitleFast(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitleFast requires manual FFI bridge — not yet implemented")

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("timingsafeBcmp requires manual FFI bridge — not yet implemented")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("timingsafeMemcmp requires manual FFI bridge — not yet implemented")

public actual fun umtxOp(obj: COpaquePointer?, op: Int, `val`: ULong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): Int =
    throw UnsupportedOperationException("umtxOp requires manual FFI bridge — not yet implemented")

public actual fun sctpPeeloff(s: Int, id: UInt): Int =
    throw UnsupportedOperationException("sctpPeeloff requires manual FFI bridge — not yet implemented")

public actual fun sctpBindx(s: Int, addrs: Sockaddr?, num: Int, tpe: Int): Int =
    throw UnsupportedOperationException("sctpBindx requires manual FFI bridge — not yet implemented")

public actual fun sctpConnectx(s: Int, addrs: Sockaddr?, addrcnt: Int, id: UInt?): Int =
    throw UnsupportedOperationException("sctpConnectx requires manual FFI bridge — not yet implemented")

public actual fun sctpGetaddrlen(family: UShort): Int =
    throw UnsupportedOperationException("sctpGetaddrlen requires manual FFI bridge — not yet implemented")

public actual fun sctpGetpaddrs(s: Int, asocid: UInt, addrs: COpaquePointer?): Int =
    throw UnsupportedOperationException("sctpGetpaddrs requires manual FFI bridge — not yet implemented")

public actual fun sctpFreepaddrs(addrs: Sockaddr?): Unit = throw UnsupportedOperationException("sctpFreepaddrs requires manual FFI bridge — not yet implemented")

public actual fun sctpGetladdrs(s: Int, asocid: UInt, addrs: COpaquePointer?): Int =
    throw UnsupportedOperationException("sctpGetladdrs requires manual FFI bridge — not yet implemented")

public actual fun sctpFreeladdrs(addrs: Sockaddr?): Unit = throw UnsupportedOperationException("sctpFreeladdrs requires manual FFI bridge — not yet implemented")

public actual fun sctpOptInfo(s: Int, id: UInt, opt: Int, arg: COpaquePointer?, size: UInt?): Int =
    throw UnsupportedOperationException("sctpOptInfo requires manual FFI bridge — not yet implemented")

public actual fun sctpSendv(sd: Int, iov: Iovec?, iovcnt: Int, addrs: Sockaddr?, addrcnt: Int, info: COpaquePointer?, infolen: UInt, infotype: UInt, flags: Int): Long =
    throw UnsupportedOperationException("sctpSendv requires manual FFI bridge — not yet implemented")

public actual fun sctpRecvv(sd: Int, iov: Iovec?, iovcnt: Int, from: Sockaddr?, fromlen: UInt?, info: COpaquePointer?, infolen: UInt?, infotype: UInt?, flags: Int?): Long =
    throw UnsupportedOperationException("sctpRecvv requires manual FFI bridge — not yet implemented")

public actual fun timerfdCreate(clockid: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate requires manual FFI bridge — not yet implemented")

public actual fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime requires manual FFI bridge — not yet implemented")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime requires manual FFI bridge — not yet implemented")

public actual fun closefrom(lowfd: Int): Unit = throw UnsupportedOperationException("closefrom requires manual FFI bridge — not yet implemented")

public actual fun closeRange(lowfd: UInt, highfd: UInt, flags: Int): Int =
    throw UnsupportedOperationException("closeRange requires manual FFI bridge — not yet implemented")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe requires manual FFI bridge — not yet implemented")

public actual fun kcmp(pid1: Int, pid2: Int, type: Int, idx1: ULong, idx2: ULong): Int =
    throw UnsupportedOperationException("kcmp requires manual FFI bridge — not yet implemented")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires manual FFI bridge — not yet implemented")

public actual fun memstatStrerror(error: Int): String? =
    throw UnsupportedOperationException("memstatStrerror requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlAlloc(): MemoryTypeList? =
    throw UnsupportedOperationException("memstatMtlAlloc requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlFirst(list: MemoryTypeList?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFirst requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlNext(mtp: MemoryType?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlNext requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlFind(list: MemoryTypeList?, allocator: Int, name: String?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFind requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlFree(list: MemoryTypeList?): Unit = throw UnsupportedOperationException("memstatMtlFree requires manual FFI bridge — not yet implemented")

public actual fun memstatMtlGeterror(list: MemoryTypeList?): Int =
    throw UnsupportedOperationException("memstatMtlGeterror requires manual FFI bridge — not yet implemented")

public actual fun memstatGetName(mtp: MemoryType?): String? =
    throw UnsupportedOperationException("memstatGetName requires manual FFI bridge — not yet implemented")

public actual fun kvmDpcpuSetcpu(kd: io.github.kotlinmania.libc.COpaquePointer?, cpu: UInt): Int =
    throw UnsupportedOperationException("kvmDpcpuSetcpu requires manual FFI bridge — not yet implemented")

public actual fun kvmGetargv(kd: io.github.kotlinmania.libc.COpaquePointer?, p: KinfoProc?, nchr: Int): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetargv requires manual FFI bridge — not yet implemented")

public actual fun kvmGetcptime(kd: io.github.kotlinmania.libc.COpaquePointer?, cpTime: Long?): Int =
    throw UnsupportedOperationException("kvmGetcptime requires manual FFI bridge — not yet implemented")

public actual fun kvmGetenvv(kd: io.github.kotlinmania.libc.COpaquePointer?, p: KinfoProc?, nchr: Int): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetenvv requires manual FFI bridge — not yet implemented")

public actual fun kvmGeterr(kd: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("kvmGeterr requires manual FFI bridge — not yet implemented")

public actual fun kvmGetmaxcpu(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("kvmGetmaxcpu requires manual FFI bridge — not yet implemented")

public actual fun kvmGetncpus(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("kvmGetncpus requires manual FFI bridge — not yet implemented")

public actual fun kvmGetpcpu(kd: io.github.kotlinmania.libc.COpaquePointer?, cpu: Int): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetpcpu requires manual FFI bridge — not yet implemented")

public actual fun kvmCounterU64Fetch(kd: io.github.kotlinmania.libc.COpaquePointer?, base: ULong): ULong =
    throw UnsupportedOperationException("kvmCounterU64Fetch requires manual FFI bridge — not yet implemented")

public actual fun kvmGetswapinfo(kd: io.github.kotlinmania.libc.COpaquePointer?, info: KvmSwap?, maxswap: Int, flags: Int): Int =
    throw UnsupportedOperationException("kvmGetswapinfo requires manual FFI bridge — not yet implemented")

public actual fun kvmNative(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("kvmNative requires manual FFI bridge — not yet implemented")

public actual fun kvmNlist(kd: io.github.kotlinmania.libc.COpaquePointer?, nl: Nlist?): Int =
    throw UnsupportedOperationException("kvmNlist requires manual FFI bridge — not yet implemented")

public actual fun kvmNlist2(kd: io.github.kotlinmania.libc.COpaquePointer?, nl: KvmNlist?): Int =
    throw UnsupportedOperationException("kvmNlist2 requires manual FFI bridge — not yet implemented")

public actual fun kvmReadZpcpu(kd: io.github.kotlinmania.libc.COpaquePointer?, base: ULong, buf: COpaquePointer?, size: ULong, cpu: Int): Long =
    throw UnsupportedOperationException("kvmReadZpcpu requires manual FFI bridge — not yet implemented")

public actual fun kvmRead2(kd: io.github.kotlinmania.libc.COpaquePointer?, addr: ULong, buf: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("kvmRead2 requires manual FFI bridge — not yet implemented")

public actual fun extattrNamespaceToString(attrnamespace: Int, string: COpaquePointer?): Int =
    throw UnsupportedOperationException("extattrNamespaceToString requires manual FFI bridge — not yet implemented")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: Int?): Int =
    throw UnsupportedOperationException("extattrStringToNamespace requires manual FFI bridge — not yet implemented")

public actual fun realhostname(host: String?, hsize: ULong, ip: InAddr?): Int =
    throw UnsupportedOperationException("realhostname requires manual FFI bridge — not yet implemented")

public actual fun realhostnameSa(host: String?, hsize: ULong, addr: Sockaddr?, addrlen: Int): Int =
    throw UnsupportedOperationException("realhostnameSa requires manual FFI bridge — not yet implemented")

public actual fun kldIsloaded(name: String?): Int =
    throw UnsupportedOperationException("kldIsloaded requires manual FFI bridge — not yet implemented")

public actual fun kldLoad(name: String?): Int =
    throw UnsupportedOperationException("kldLoad requires manual FFI bridge — not yet implemented")

public actual fun kinfoGetvmmap(pid: Int, cntp: Int?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap requires manual FFI bridge — not yet implemented")

public actual fun hexdump(ptr: COpaquePointer?, length: Int, hdr: String?, flags: Int): Unit = throw UnsupportedOperationException("hexdump requires manual FFI bridge — not yet implemented")

public actual fun humanizeNumber(buf: String?, len: ULong, number: Long, suffix: String?, scale: Int, flags: Int): Int =
    throw UnsupportedOperationException("humanizeNumber requires manual FFI bridge — not yet implemented")

public actual fun flopen(path: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("flopen requires manual FFI bridge — not yet implemented")

public actual fun flopenat(fd: Int, path: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("flopenat requires manual FFI bridge — not yet implemented")

public actual fun getlocalbase(): String? =
    throw UnsupportedOperationException("getlocalbase requires manual FFI bridge — not yet implemented")

public actual fun pidfileOpen(path: String?, mode: UInt, pidptr: Int?): Pidfh? =
    throw UnsupportedOperationException("pidfileOpen requires manual FFI bridge — not yet implemented")

public actual fun pidfileWrite(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileWrite requires manual FFI bridge — not yet implemented")

public actual fun pidfileClose(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileClose requires manual FFI bridge — not yet implemented")

public actual fun pidfileRemove(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileRemove requires manual FFI bridge — not yet implemented")

public actual fun pidfileFileno(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileFileno requires manual FFI bridge — not yet implemented")

public actual fun procstatOpenSysctl(): Procstat? =
    throw UnsupportedOperationException("procstatOpenSysctl requires manual FFI bridge — not yet implemented")

public actual fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: Int): FilestatList? =
    throw UnsupportedOperationException("procstatGetfiles requires manual FFI bridge — not yet implemented")

public actual fun procstatFreefiles(procstat: Procstat?, head: FilestatList?): Unit = throw UnsupportedOperationException("procstatFreefiles requires manual FFI bridge — not yet implemented")

public actual fun procstatGetprocs(procstat: Procstat?, what: Int, arg: Int, count: UInt?): KinfoProc? =
    throw UnsupportedOperationException("procstatGetprocs requires manual FFI bridge — not yet implemented")

public actual fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?): Unit = throw UnsupportedOperationException("procstatFreeprocs requires manual FFI bridge — not yet implemented")

public actual fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: UInt?): KinfoVmentry? =
    throw UnsupportedOperationException("procstatGetvmmap requires manual FFI bridge — not yet implemented")

public actual fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?): Unit = throw UnsupportedOperationException("procstatFreevmmap requires manual FFI bridge — not yet implemented")

public actual fun procstatClose(procstat: Procstat?): Unit = throw UnsupportedOperationException("procstatClose requires manual FFI bridge — not yet implemented")

public actual fun procstatFreeargv(procstat: Procstat?): Unit = throw UnsupportedOperationException("procstatFreeargv requires manual FFI bridge — not yet implemented")

public actual fun procstatFreeenvv(procstat: Procstat?): Unit = throw UnsupportedOperationException("procstatFreeenvv requires manual FFI bridge — not yet implemented")

public actual fun procstatFreegroups(procstat: Procstat?, groups: UInt?): Unit = throw UnsupportedOperationException("procstatFreegroups requires manual FFI bridge — not yet implemented")

public actual fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?): Unit = throw UnsupportedOperationException("procstatFreeptlwpinfo requires manual FFI bridge — not yet implemented")

public actual fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetargv requires manual FFI bridge — not yet implemented")

public actual fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetenvv requires manual FFI bridge — not yet implemented")

public actual fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: UInt?): UInt? =
    throw UnsupportedOperationException("procstatGetgroups requires manual FFI bridge — not yet implemented")

public actual fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: Int?): Int =
    throw UnsupportedOperationException("procstatGetosrel requires manual FFI bridge — not yet implemented")

public actual fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: String?, maxlen: ULong): Int =
    throw UnsupportedOperationException("procstatGetpathname requires manual FFI bridge — not yet implemented")

public actual fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: Int, rlimit: Rlimit?): Int =
    throw UnsupportedOperationException("procstatGetrlimit requires manual FFI bridge — not yet implemented")

public actual fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: UShort?): Int =
    throw UnsupportedOperationException("procstatGetumask requires manual FFI bridge — not yet implemented")

public actual fun procstatOpenCore(filename: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenCore requires manual FFI bridge — not yet implemented")

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenKvm requires manual FFI bridge — not yet implemented")

public actual fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetSocketInfo requires manual FFI bridge — not yet implemented")

public actual fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Int?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetVnodeInfo requires manual FFI bridge — not yet implemented")

public actual fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetPtsInfo requires manual FFI bridge — not yet implemented")

public actual fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetShmInfo requires manual FFI bridge — not yet implemented")

public actual fun timerCreate(clockId: Int, evp: Sigevent?, timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?): Int =
    throw UnsupportedOperationException("timerCreate requires manual FFI bridge — not yet implemented")

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?): Int =
    throw UnsupportedOperationException("timerDelete requires manual FFI bridge — not yet implemented")

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?): Int =
    throw UnsupportedOperationException("timerGetoverrun requires manual FFI bridge — not yet implemented")

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?, value: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime requires manual FFI bridge — not yet implemented")

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?, flags: Int, value: Itimerspec?, ovalue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime requires manual FFI bridge — not yet implemented")

public actual fun devstatGetnumdevs(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("devstatGetnumdevs requires manual FFI bridge — not yet implemented")

public actual fun devstatGetgeneration(kd: io.github.kotlinmania.libc.COpaquePointer?): Long =
    throw UnsupportedOperationException("devstatGetgeneration requires manual FFI bridge — not yet implemented")

public actual fun devstatGetversion(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("devstatGetversion requires manual FFI bridge — not yet implemented")

public actual fun devstatCheckversion(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("devstatCheckversion requires manual FFI bridge — not yet implemented")

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: Int?, numSelections: Int?, selectGeneration: Long?, currentGeneration: Long, devices: Devstat?, numdevs: Int, matches: DevstatMatch?, numMatches: Int, devSelections: COpaquePointer?, numDevSelections: Int, selectMode: DevstatSelectMode, maxshowdevs: Int, perfSelect: Int): Int =
    throw UnsupportedOperationException("devstatSelectdevs requires manual FFI bridge — not yet implemented")

public actual fun devstatBuildmatch(matchStr: String?, matches: COpaquePointer?, numMatches: Int?): Int =
    throw UnsupportedOperationException("devstatBuildmatch requires manual FFI bridge — not yet implemented")

public actual fun mallocStatsPrint(writeCb: ((COpaquePointer?, String?) -> Unit)?, cbopaque: COpaquePointer?, opt: String?): Unit = throw UnsupportedOperationException("mallocStatsPrint requires manual FFI bridge — not yet implemented")
