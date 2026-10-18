package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.InAddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Termios
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.KinfoProc
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.ShmidDs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.Stat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.Statfs

public actual fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? =
    throw UnsupportedOperationException("cMSGDATA not available on Android host — use androidNative target for FFI")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR not available on Android host — use androidNative target for FFI")

public actual fun mallocxAlign(lg: UInt): Int =
    throw UnsupportedOperationException("mALLOCXALIGN not available on Android host — use androidNative target for FFI")

public actual fun sockcredSize(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE not available on Android host — use androidNative target for FFI")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname not available on Android host — use androidNative target for FFI")

public actual fun cpuZero(cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUZERO not available on Android host — use androidNative target for FFI")

public actual fun cpuFill(cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUFILL not available on Android host — use androidNative target for FFI")

public actual fun cpuSet(cpu: ULong, cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUSET not available on Android host — use androidNative target for FFI")

public actual fun cpuClear(cpu: ULong, cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUCLR not available on Android host — use androidNative target for FFI")

public actual fun cpuIsSet(cpu: ULong, cpuset: CpusetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET not available on Android host — use androidNative target for FFI")

public actual fun cpuCount(cpuset: CpusetT?): Int =
    throw UnsupportedOperationException("cPUCOUNT not available on Android host — use androidNative target for FFI")

public actual fun sockcred2Size(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCRED2SIZE not available on Android host — use androidNative target for FFI")

public actual fun protMax(x: Int): Int =
    throw UnsupportedOperationException("pROTMAX not available on Android host — use androidNative target for FFI")

public actual fun protMaxExtract(x: Int): Int =
    throw UnsupportedOperationException("pROTMAXEXTRACT not available on Android host — use androidNative target for FFI")

public actual fun fhlink(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, to: String?): Int =
    throw UnsupportedOperationException("fhlink not available on Android host — use androidNative target for FFI")

public actual fun fhlinkat(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, tofd: Int, to: String?): Int =
    throw UnsupportedOperationException("fhlinkat not available on Android host — use androidNative target for FFI")

public actual fun fhreadlink(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, buf: String?, bufsize: ULong): Int =
    throw UnsupportedOperationException("fhreadlink not available on Android host — use androidNative target for FFI")

public actual fun getfhat(fd: Int, path: String?, fhp: Fhandle?, flag: Int): Int =
    throw UnsupportedOperationException("getfhat not available on Android host — use androidNative target for FFI")

public actual fun error(): Int? =
    throw UnsupportedOperationException("error not available on Android host — use androidNative target for FFI")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel not available on Android host — use androidNative target for FFI")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError not available on Android host — use androidNative target for FFI")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync not available on Android host — use androidNative target for FFI")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead not available on Android host — use androidNative target for FFI")

public actual fun aioReadv(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioReadv not available on Android host — use androidNative target for FFI")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn not available on Android host — use androidNative target for FFI")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend not available on Android host — use androidNative target for FFI")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite not available on Android host — use androidNative target for FFI")

public actual fun aioWritev(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWritev not available on Android host — use androidNative target for FFI")

public actual fun copyFileRange(infd: Int, inoffp: Long?, outfd: Int, outoffp: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("copyFileRange not available on Android host — use androidNative target for FFI")

public actual fun devnameR(dev: ULong, mode: UInt, buf: String?, len: Int): String? =
    throw UnsupportedOperationException("devnameR not available on Android host — use androidNative target for FFI")

public actual fun extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFd not available on Android host — use androidNative target for FFI")

public actual fun extattrDeleteFile(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFile not available on Android host — use androidNative target for FFI")

public actual fun extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteLink not available on Android host — use androidNative target for FFI")

public actual fun extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFd not available on Android host — use androidNative target for FFI")

public actual fun extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFile not available on Android host — use androidNative target for FFI")

public actual fun extattrGetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetLink not available on Android host — use androidNative target for FFI")

public actual fun extattrListFd(fd: Int, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFd not available on Android host — use androidNative target for FFI")

public actual fun extattrListFile(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFile not available on Android host — use androidNative target for FFI")

public actual fun extattrListLink(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListLink not available on Android host — use androidNative target for FFI")

public actual fun extattrSetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrSetFd not available on Android host — use androidNative target for FFI")

public actual fun extattrSetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrSetFile not available on Android host — use androidNative target for FFI")

public actual fun extattrSetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrSetLink not available on Android host — use androidNative target for FFI")

public actual fun fspacectl(fd: Int, cmd: Int, rqsr: SpacectlRange?, flags: Int, rmsr: SpacectlRange?): Int =
    throw UnsupportedOperationException("fspacectl not available on Android host — use androidNative target for FFI")

public actual fun jail(jail: Jail?): Int =
    throw UnsupportedOperationException("jail not available on Android host — use androidNative target for FFI")

public actual fun jailAttach(jid: Int): Int =
    throw UnsupportedOperationException("jailAttach not available on Android host — use androidNative target for FFI")

public actual fun jailRemove(jid: Int): Int =
    throw UnsupportedOperationException("jailRemove not available on Android host — use androidNative target for FFI")

public actual fun jailGet(iov: Iovec?, niov: UInt, flags: Int): Int =
    throw UnsupportedOperationException("jailGet not available on Android host — use androidNative target for FFI")

public actual fun jailSet(iov: Iovec?, niov: UInt, flags: Int): Int =
    throw UnsupportedOperationException("jailSet not available on Android host — use androidNative target for FFI")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio not available on Android host — use androidNative target for FFI")

public actual fun getutxuser(user: String?): Utmpx? =
    throw UnsupportedOperationException("getutxuser not available on Android host — use androidNative target for FFI")

public actual fun setutxdb(type: Int, file: String?): Int =
    throw UnsupportedOperationException("setutxdb not available on Android host — use androidNative target for FFI")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): Long =
    throw UnsupportedOperationException("aioWaitcomplete not available on Android host — use androidNative target for FFI")

public actual fun mqGetfdNp(mqd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("mqGetfdNp not available on Android host — use androidNative target for FFI")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid not available on Android host — use androidNative target for FFI")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR not available on Android host — use androidNative target for FFI")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget not available on Android host — use androidNative target for FFI")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat not available on Android host — use androidNative target for FFI")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt not available on Android host — use androidNative target for FFI")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl not available on Android host — use androidNative target for FFI")

public actual fun semget(key: Int, nsems: Int, semflg: Int): Int =
    throw UnsupportedOperationException("semget not available on Android host — use androidNative target for FFI")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl not available on Android host — use androidNative target for FFI")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop not available on Android host — use androidNative target for FFI")

public actual fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int =
    throw UnsupportedOperationException("msgctl not available on Android host — use androidNative target for FFI")

public actual fun msgget(key: Int, msgflg: Int): Int =
    throw UnsupportedOperationException("msgget not available on Android host — use androidNative target for FFI")

public actual fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int =
    throw UnsupportedOperationException("msgsnd not available on Android host — use androidNative target for FFI")

public actual fun cfmakesane(termios: Termios?): Unit = throw UnsupportedOperationException("cfmakesane not available on Android host — use androidNative target for FFI")

public actual fun pdfork(fdp: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pdfork not available on Android host — use androidNative target for FFI")

public actual fun pdgetpid(fd: Int, pidp: Int?): Int =
    throw UnsupportedOperationException("pdgetpid not available on Android host — use androidNative target for FFI")

public actual fun pdkill(fd: Int, signum: Int): Int =
    throw UnsupportedOperationException("pdkill not available on Android host — use androidNative target for FFI")

public actual fun rtprioThread(function: Int, lwpid: Int, rtp: Rtprio?): Int =
    throw UnsupportedOperationException("rtprioThread not available on Android host — use androidNative target for FFI")

public actual fun uuidgen(store: Uuid?, count: Int): Int =
    throw UnsupportedOperationException("uuidgen not available on Android host — use androidNative target for FFI")

public actual fun thrKill(id: Long, sig: Int): Int =
    throw UnsupportedOperationException("thrKill not available on Android host — use androidNative target for FFI")

public actual fun thrKill2(pid: Int, id: Long, sig: Int): Int =
    throw UnsupportedOperationException("thrKill2 not available on Android host — use androidNative target for FFI")

public actual fun thrSelf(tid: Long?): Int =
    throw UnsupportedOperationException("thrSelf not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetthreadidNp(): Int =
    throw UnsupportedOperationException("pthreadGetthreadidNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadGetaffinityNp(td: ULong, cpusetsize: ULong, cpusetp: CpusetT?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp not available on Android host — use androidNative target for FFI")

public actual fun pthreadSetaffinityNp(td: ULong, cpusetsize: ULong, cpusetp: CpusetT?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp not available on Android host — use androidNative target for FFI")

public actual fun schedGetaffinity(pid: Int, cpusetsz: ULong, cpuset: CpusetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity not available on Android host — use androidNative target for FFI")

public actual fun schedSetaffinity(pid: Int, cpusetsz: ULong, cpuset: CpusetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity not available on Android host — use androidNative target for FFI")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexConsistent(mutex: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexConsistent not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust not available on Android host — use androidNative target for FFI")

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinInit(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinDestroy(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinLock(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinLock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinTrylock(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock not available on Android host — use androidNative target for FFI")

public actual fun pthreadSpinUnlock(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock not available on Android host — use androidNative target for FFI")

public actual fun pthreadTimedjoinNp(thread: ULong, retval: COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadTimedjoinNp not available on Android host — use androidNative target for FFI")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs not available on Android host — use androidNative target for FFI")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs not available on Android host — use androidNative target for FFI")

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 not available on Android host — use androidNative target for FFI")

public actual fun xuname(nmln: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("xuname not available on Android host — use androidNative target for FFI")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: ULong, flags: Int): Long =
    throw UnsupportedOperationException("sendmmsg not available on Android host — use androidNative target for FFI")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: ULong, flags: Int, timeout: Timespec?): Long =
    throw UnsupportedOperationException("recvmmsg not available on Android host — use androidNative target for FFI")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem not available on Android host — use androidNative target for FFI")

public actual fun fhopen(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, flags: Int): Int =
    throw UnsupportedOperationException("fhopen not available on Android host — use androidNative target for FFI")

public actual fun fhstat(fhp: Fhandle?, buf: Stat?): Int =
    throw UnsupportedOperationException("fhstat not available on Android host — use androidNative target for FFI")

public actual fun fhstatfs(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, buf: Statfs?): Int =
    throw UnsupportedOperationException("fhstatfs not available on Android host — use androidNative target for FFI")

public actual fun getfh(path: String?, fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?): Int =
    throw UnsupportedOperationException("getfh not available on Android host — use androidNative target for FFI")

public actual fun lgetfh(path: String?, fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?): Int =
    throw UnsupportedOperationException("lgetfh not available on Android host — use androidNative target for FFI")

public actual fun getfsstat(buf: Statfs?, bufsize: Long, mode: Int): Int =
    throw UnsupportedOperationException("getfsstat not available on Android host — use androidNative target for FFI")

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: Int): Int =
    throw UnsupportedOperationException("getmntinfo not available on Android host — use androidNative target for FFI")

public actual fun mount(type: String?, dir: String?, flags: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount not available on Android host — use androidNative target for FFI")

public actual fun nmount(iov: Iovec?, niov: UInt, flags: Int): Int =
    throw UnsupportedOperationException("nmount not available on Android host — use androidNative target for FFI")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle not available on Android host — use androidNative target for FFI")

public actual fun rfork(flags: Int): Int =
    throw UnsupportedOperationException("rfork not available on Android host — use androidNative target for FFI")

public actual fun cpusetGetaffinity(level: Int, which: Int, id: UInt, setsize: ULong, mask: CpusetT?): Int =
    throw UnsupportedOperationException("cpusetGetaffinity not available on Android host — use androidNative target for FFI")

public actual fun cpusetSetaffinity(level: Int, which: Int, id: UInt, setsize: ULong, mask: CpusetT?): Int =
    throw UnsupportedOperationException("cpusetSetaffinity not available on Android host — use androidNative target for FFI")

public actual fun cpuset(setid: Int?): Int =
    throw UnsupportedOperationException("cpuset not available on Android host — use androidNative target for FFI")

public actual fun cpusetGetid(level: Int, which: Int, id: UInt, setid: Int?): Int =
    throw UnsupportedOperationException("cpusetGetid not available on Android host — use androidNative target for FFI")

public actual fun cpusetSetid(which: Int, id: UInt, setid: Int): Int =
    throw UnsupportedOperationException("cpusetSetid not available on Android host — use androidNative target for FFI")

public actual fun capEnter(): Int =
    throw UnsupportedOperationException("capEnter not available on Android host — use androidNative target for FFI")

public actual fun capGetmode(modep: UInt?): Int =
    throw UnsupportedOperationException("capGetmode not available on Android host — use androidNative target for FFI")

public actual fun capFcntlsGet(fd: Int, fcntlrightsp: UInt?): Int =
    throw UnsupportedOperationException("capFcntlsGet not available on Android host — use androidNative target for FFI")

public actual fun capFcntlsLimit(fd: Int, fcntlrights: UInt): Int =
    throw UnsupportedOperationException("capFcntlsLimit not available on Android host — use androidNative target for FFI")

public actual fun capIoctlsGet(fd: Int, cmds: ULong?, maxcmds: ULong): Long =
    throw UnsupportedOperationException("capIoctlsGet not available on Android host — use androidNative target for FFI")

public actual fun capIoctlsLimit(fd: Int, cmds: ULong?, ncmds: ULong): Int =
    throw UnsupportedOperationException("capIoctlsLimit not available on Android host — use androidNative target for FFI")

public actual fun capRightsInit(version: Int, rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsInit not available on Android host — use androidNative target for FFI")

public actual fun capRightsGet(version: Int, fd: Int, rightsp: CapRightsT?): Int =
    throw UnsupportedOperationException("capRightsGet not available on Android host — use androidNative target for FFI")

public actual fun capRightsSet(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsSet not available on Android host — use androidNative target for FFI")

public actual fun capRightsClear(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsClear not available on Android host — use androidNative target for FFI")

public actual fun capRightsIsSet(rights: CapRightsT?, vararg args: Any?): Boolean =
    throw UnsupportedOperationException("capRightsIsSet not available on Android host — use androidNative target for FFI")

public actual fun capRightsIsValid(rights: CapRightsT?): Boolean =
    throw UnsupportedOperationException("capRightsIsValid not available on Android host — use androidNative target for FFI")

public actual fun capRightsLimit(fd: Int, rights: CapRightsT?): Int =
    throw UnsupportedOperationException("capRightsLimit not available on Android host — use androidNative target for FFI")

public actual fun capRightsMerge(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    throw UnsupportedOperationException("capRightsMerge not available on Android host — use androidNative target for FFI")

public actual fun capRightsRemove(dst: CapRightsT?, src: CapRightsT?): CapRightsT? =
    throw UnsupportedOperationException("capRightsRemove not available on Android host — use androidNative target for FFI")

public actual fun capRightsContains(big: CapRightsT?, little: CapRightsT?): Boolean =
    throw UnsupportedOperationException("capRightsContains not available on Android host — use androidNative target for FFI")

public actual fun capSandboxed(): Boolean =
    throw UnsupportedOperationException("capSandboxed not available on Android host — use androidNative target for FFI")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray not available on Android host — use androidNative target for FFI")

public actual fun ffs(value: Int): Int =
    throw UnsupportedOperationException("ffs not available on Android host — use androidNative target for FFI")

public actual fun ffsl(value: Long): Int =
    throw UnsupportedOperationException("ffsl not available on Android host — use androidNative target for FFI")

public actual fun ffsll(value: Long): Int =
    throw UnsupportedOperationException("ffsll not available on Android host — use androidNative target for FFI")

public actual fun fls(value: Int): Int =
    throw UnsupportedOperationException("fls not available on Android host — use androidNative target for FFI")

public actual fun flsl(value: Long): Int =
    throw UnsupportedOperationException("flsl not available on Android host — use androidNative target for FFI")

public actual fun flsll(value: Long): Int =
    throw UnsupportedOperationException("flsll not available on Android host — use androidNative target for FFI")

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("mallctl not available on Android host — use androidNative target for FFI")

public actual fun mallctlnametomib(name: String?, mibp: ULong?, miplen: ULong?): Int =
    throw UnsupportedOperationException("mallctlnametomib not available on Android host — use androidNative target for FFI")

public actual fun mallctlbymib(mib: ULong?, mible: ULong, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("mallctlbymib not available on Android host — use androidNative target for FFI")

public actual fun mallocx(size: ULong, flags: Int): COpaquePointer? =
    throw UnsupportedOperationException("mallocx not available on Android host — use androidNative target for FFI")

public actual fun rallocx(ptr: COpaquePointer?, size: ULong, flags: Int): COpaquePointer? =
    throw UnsupportedOperationException("rallocx not available on Android host — use androidNative target for FFI")

public actual fun xallocx(ptr: COpaquePointer?, size: ULong, extra: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("xallocx not available on Android host — use androidNative target for FFI")

public actual fun sallocx(ptr: COpaquePointer?, flags: Int): ULong =
    throw UnsupportedOperationException("sallocx not available on Android host — use androidNative target for FFI")

public actual fun dallocx(ptr: COpaquePointer?, flags: Int): Unit = throw UnsupportedOperationException("dallocx not available on Android host — use androidNative target for FFI")

public actual fun sdallocx(ptr: COpaquePointer?, size: ULong, flags: Int): Unit = throw UnsupportedOperationException("sdallocx not available on Android host — use androidNative target for FFI")

public actual fun nallocx(size: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("nallocx not available on Android host — use androidNative target for FFI")

public actual fun procctl(idtype: UInt, id: UInt, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("procctl not available on Android host — use androidNative target for FFI")

public actual fun getpagesize(): Int =
    throw UnsupportedOperationException("getpagesize not available on Android host — use androidNative target for FFI")

public actual fun getpagesizes(pagesize: ULong?, nelem: Int): Int =
    throw UnsupportedOperationException("getpagesizes not available on Android host — use androidNative target for FFI")

public actual fun clockGetcpuclockid2(arg1: UInt, arg2: Int, arg3: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid2 not available on Android host — use androidNative target for FFI")

public actual fun strchrnul(s: String?, c: Int): String? =
    throw UnsupportedOperationException("strchrnul not available on Android host — use androidNative target for FFI")

public actual fun shmCreateLargepage(path: String?, flags: Int, psind: Int, allocPolicy: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmCreateLargepage not available on Android host — use androidNative target for FFI")

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: Int): Int =
    throw UnsupportedOperationException("shmRename not available on Android host — use androidNative target for FFI")

public actual fun memfdCreate(name: String?, flags: UInt): Int =
    throw UnsupportedOperationException("memfdCreate not available on Android host — use androidNative target for FFI")

public actual fun setaudit(auditinfo: AuditinfoT?): Int =
    throw UnsupportedOperationException("setaudit not available on Android host — use androidNative target for FFI")

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd not available on Android host — use androidNative target for FFI")

public actual fun eventfdRead(fd: Int, value: ULong?): Int =
    throw UnsupportedOperationException("eventfdRead not available on Android host — use androidNative target for FFI")

public actual fun eventfdWrite(fd: Int, value: ULong): Int =
    throw UnsupportedOperationException("eventfdWrite not available on Android host — use androidNative target for FFI")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync not available on Android host — use androidNative target for FFI")

public actual fun elfAuxInfo(aux: Int, buf: COpaquePointer?, buflen: Int): Int =
    throw UnsupportedOperationException("elfAuxInfo not available on Android host — use androidNative target for FFI")

public actual fun setproctitleFast(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitleFast not available on Android host — use androidNative target for FFI")

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("timingsafeBcmp not available on Android host — use androidNative target for FFI")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("timingsafeMemcmp not available on Android host — use androidNative target for FFI")

public actual fun umtxOp(obj: COpaquePointer?, op: Int, `val`: ULong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): Int =
    throw UnsupportedOperationException("umtxOp not available on Android host — use androidNative target for FFI")

public actual fun sctpPeeloff(s: Int, id: UInt): Int =
    throw UnsupportedOperationException("sctpPeeloff not available on Android host — use androidNative target for FFI")

public actual fun sctpBindx(s: Int, addrs: Sockaddr?, num: Int, tpe: Int): Int =
    throw UnsupportedOperationException("sctpBindx not available on Android host — use androidNative target for FFI")

public actual fun sctpConnectx(s: Int, addrs: Sockaddr?, addrcnt: Int, id: UInt?): Int =
    throw UnsupportedOperationException("sctpConnectx not available on Android host — use androidNative target for FFI")

public actual fun sctpGetaddrlen(family: UShort): Int =
    throw UnsupportedOperationException("sctpGetaddrlen not available on Android host — use androidNative target for FFI")

public actual fun sctpGetpaddrs(s: Int, asocid: UInt, addrs: COpaquePointer?): Int =
    throw UnsupportedOperationException("sctpGetpaddrs not available on Android host — use androidNative target for FFI")

public actual fun sctpFreepaddrs(addrs: Sockaddr?): Unit = throw UnsupportedOperationException("sctpFreepaddrs not available on Android host — use androidNative target for FFI")

public actual fun sctpGetladdrs(s: Int, asocid: UInt, addrs: COpaquePointer?): Int =
    throw UnsupportedOperationException("sctpGetladdrs not available on Android host — use androidNative target for FFI")

public actual fun sctpFreeladdrs(addrs: Sockaddr?): Unit = throw UnsupportedOperationException("sctpFreeladdrs not available on Android host — use androidNative target for FFI")

public actual fun sctpOptInfo(s: Int, id: UInt, opt: Int, arg: COpaquePointer?, size: UInt?): Int =
    throw UnsupportedOperationException("sctpOptInfo not available on Android host — use androidNative target for FFI")

public actual fun sctpSendv(sd: Int, iov: Iovec?, iovcnt: Int, addrs: Sockaddr?, addrcnt: Int, info: COpaquePointer?, infolen: UInt, infotype: UInt, flags: Int): Long =
    throw UnsupportedOperationException("sctpSendv not available on Android host — use androidNative target for FFI")

public actual fun sctpRecvv(sd: Int, iov: Iovec?, iovcnt: Int, from: Sockaddr?, fromlen: UInt?, info: COpaquePointer?, infolen: UInt?, infotype: UInt?, flags: Int?): Long =
    throw UnsupportedOperationException("sctpRecvv not available on Android host — use androidNative target for FFI")

public actual fun timerfdCreate(clockid: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate not available on Android host — use androidNative target for FFI")

public actual fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime not available on Android host — use androidNative target for FFI")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime not available on Android host — use androidNative target for FFI")

public actual fun closefrom(lowfd: Int): Unit = throw UnsupportedOperationException("closefrom not available on Android host — use androidNative target for FFI")

public actual fun closeRange(lowfd: UInt, highfd: UInt, flags: Int): Int =
    throw UnsupportedOperationException("closeRange not available on Android host — use androidNative target for FFI")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe not available on Android host — use androidNative target for FFI")

public actual fun kcmp(pid1: Int, pid2: Int, type: Int, idx1: ULong, idx2: ULong): Int =
    throw UnsupportedOperationException("kcmp not available on Android host — use androidNative target for FFI")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym not available on Android host — use androidNative target for FFI")

public actual fun memstatStrerror(error: Int): String? =
    throw UnsupportedOperationException("memstatStrerror not available on Android host — use androidNative target for FFI")

public actual fun memstatMtlAlloc(): MemoryTypeList? =
    throw UnsupportedOperationException("memstatMtlAlloc not available on Android host — use androidNative target for FFI")

public actual fun memstatMtlFirst(list: MemoryTypeList?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFirst not available on Android host — use androidNative target for FFI")

public actual fun memstatMtlNext(mtp: MemoryType?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlNext not available on Android host — use androidNative target for FFI")

public actual fun memstatMtlFind(list: MemoryTypeList?, allocator: Int, name: String?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFind not available on Android host — use androidNative target for FFI")

public actual fun memstatMtlFree(list: MemoryTypeList?): Unit = throw UnsupportedOperationException("memstatMtlFree not available on Android host — use androidNative target for FFI")

public actual fun memstatMtlGeterror(list: MemoryTypeList?): Int =
    throw UnsupportedOperationException("memstatMtlGeterror not available on Android host — use androidNative target for FFI")

public actual fun memstatGetName(mtp: MemoryType?): String? =
    throw UnsupportedOperationException("memstatGetName not available on Android host — use androidNative target for FFI")

public actual fun kvmDpcpuSetcpu(kd: io.github.kotlinmania.libc.COpaquePointer?, cpu: UInt): Int =
    throw UnsupportedOperationException("kvmDpcpuSetcpu not available on Android host — use androidNative target for FFI")

public actual fun kvmGetargv(kd: io.github.kotlinmania.libc.COpaquePointer?, p: KinfoProc?, nchr: Int): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetargv not available on Android host — use androidNative target for FFI")

public actual fun kvmGetcptime(kd: io.github.kotlinmania.libc.COpaquePointer?, cpTime: Long?): Int =
    throw UnsupportedOperationException("kvmGetcptime not available on Android host — use androidNative target for FFI")

public actual fun kvmGetenvv(kd: io.github.kotlinmania.libc.COpaquePointer?, p: KinfoProc?, nchr: Int): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetenvv not available on Android host — use androidNative target for FFI")

public actual fun kvmGeterr(kd: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("kvmGeterr not available on Android host — use androidNative target for FFI")

public actual fun kvmGetmaxcpu(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("kvmGetmaxcpu not available on Android host — use androidNative target for FFI")

public actual fun kvmGetncpus(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("kvmGetncpus not available on Android host — use androidNative target for FFI")

public actual fun kvmGetpcpu(kd: io.github.kotlinmania.libc.COpaquePointer?, cpu: Int): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetpcpu not available on Android host — use androidNative target for FFI")

public actual fun kvmCounterU64Fetch(kd: io.github.kotlinmania.libc.COpaquePointer?, base: ULong): ULong =
    throw UnsupportedOperationException("kvmCounterU64Fetch not available on Android host — use androidNative target for FFI")

public actual fun kvmGetswapinfo(kd: io.github.kotlinmania.libc.COpaquePointer?, info: KvmSwap?, maxswap: Int, flags: Int): Int =
    throw UnsupportedOperationException("kvmGetswapinfo not available on Android host — use androidNative target for FFI")

public actual fun kvmNative(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("kvmNative not available on Android host — use androidNative target for FFI")

public actual fun kvmNlist(kd: io.github.kotlinmania.libc.COpaquePointer?, nl: Nlist?): Int =
    throw UnsupportedOperationException("kvmNlist not available on Android host — use androidNative target for FFI")

public actual fun kvmNlist2(kd: io.github.kotlinmania.libc.COpaquePointer?, nl: KvmNlist?): Int =
    throw UnsupportedOperationException("kvmNlist2 not available on Android host — use androidNative target for FFI")

public actual fun kvmReadZpcpu(kd: io.github.kotlinmania.libc.COpaquePointer?, base: ULong, buf: COpaquePointer?, size: ULong, cpu: Int): Long =
    throw UnsupportedOperationException("kvmReadZpcpu not available on Android host — use androidNative target for FFI")

public actual fun kvmRead2(kd: io.github.kotlinmania.libc.COpaquePointer?, addr: ULong, buf: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("kvmRead2 not available on Android host — use androidNative target for FFI")

public actual fun extattrNamespaceToString(attrnamespace: Int, string: COpaquePointer?): Int =
    throw UnsupportedOperationException("extattrNamespaceToString not available on Android host — use androidNative target for FFI")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: Int?): Int =
    throw UnsupportedOperationException("extattrStringToNamespace not available on Android host — use androidNative target for FFI")

public actual fun realhostname(host: String?, hsize: ULong, ip: InAddr?): Int =
    throw UnsupportedOperationException("realhostname not available on Android host — use androidNative target for FFI")

public actual fun realhostnameSa(host: String?, hsize: ULong, addr: Sockaddr?, addrlen: Int): Int =
    throw UnsupportedOperationException("realhostnameSa not available on Android host — use androidNative target for FFI")

public actual fun kldIsloaded(name: String?): Int =
    throw UnsupportedOperationException("kldIsloaded not available on Android host — use androidNative target for FFI")

public actual fun kldLoad(name: String?): Int =
    throw UnsupportedOperationException("kldLoad not available on Android host — use androidNative target for FFI")

public actual fun kinfoGetvmmap(pid: Int, cntp: Int?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap not available on Android host — use androidNative target for FFI")

public actual fun hexdump(ptr: COpaquePointer?, length: Int, hdr: String?, flags: Int): Unit = throw UnsupportedOperationException("hexdump not available on Android host — use androidNative target for FFI")

public actual fun humanizeNumber(buf: String?, len: ULong, number: Long, suffix: String?, scale: Int, flags: Int): Int =
    throw UnsupportedOperationException("humanizeNumber not available on Android host — use androidNative target for FFI")

public actual fun flopen(path: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("flopen not available on Android host — use androidNative target for FFI")

public actual fun flopenat(fd: Int, path: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("flopenat not available on Android host — use androidNative target for FFI")

public actual fun getlocalbase(): String? =
    throw UnsupportedOperationException("getlocalbase not available on Android host — use androidNative target for FFI")

public actual fun pidfileOpen(path: String?, mode: UInt, pidptr: Int?): Pidfh? =
    throw UnsupportedOperationException("pidfileOpen not available on Android host — use androidNative target for FFI")

public actual fun pidfileWrite(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileWrite not available on Android host — use androidNative target for FFI")

public actual fun pidfileClose(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileClose not available on Android host — use androidNative target for FFI")

public actual fun pidfileRemove(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileRemove not available on Android host — use androidNative target for FFI")

public actual fun pidfileFileno(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileFileno not available on Android host — use androidNative target for FFI")

public actual fun procstatOpenSysctl(): Procstat? =
    throw UnsupportedOperationException("procstatOpenSysctl not available on Android host — use androidNative target for FFI")

public actual fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: Int): FilestatList? =
    throw UnsupportedOperationException("procstatGetfiles not available on Android host — use androidNative target for FFI")

public actual fun procstatFreefiles(procstat: Procstat?, head: FilestatList?): Unit = throw UnsupportedOperationException("procstatFreefiles not available on Android host — use androidNative target for FFI")

public actual fun procstatGetprocs(procstat: Procstat?, what: Int, arg: Int, count: UInt?): KinfoProc? =
    throw UnsupportedOperationException("procstatGetprocs not available on Android host — use androidNative target for FFI")

public actual fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?): Unit = throw UnsupportedOperationException("procstatFreeprocs not available on Android host — use androidNative target for FFI")

public actual fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: UInt?): KinfoVmentry? =
    throw UnsupportedOperationException("procstatGetvmmap not available on Android host — use androidNative target for FFI")

public actual fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?): Unit = throw UnsupportedOperationException("procstatFreevmmap not available on Android host — use androidNative target for FFI")

public actual fun procstatClose(procstat: Procstat?): Unit = throw UnsupportedOperationException("procstatClose not available on Android host — use androidNative target for FFI")

public actual fun procstatFreeargv(procstat: Procstat?): Unit = throw UnsupportedOperationException("procstatFreeargv not available on Android host — use androidNative target for FFI")

public actual fun procstatFreeenvv(procstat: Procstat?): Unit = throw UnsupportedOperationException("procstatFreeenvv not available on Android host — use androidNative target for FFI")

public actual fun procstatFreegroups(procstat: Procstat?, groups: UInt?): Unit = throw UnsupportedOperationException("procstatFreegroups not available on Android host — use androidNative target for FFI")

public actual fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?): Unit = throw UnsupportedOperationException("procstatFreeptlwpinfo not available on Android host — use androidNative target for FFI")

public actual fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetargv not available on Android host — use androidNative target for FFI")

public actual fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetenvv not available on Android host — use androidNative target for FFI")

public actual fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: UInt?): UInt? =
    throw UnsupportedOperationException("procstatGetgroups not available on Android host — use androidNative target for FFI")

public actual fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: Int?): Int =
    throw UnsupportedOperationException("procstatGetosrel not available on Android host — use androidNative target for FFI")

public actual fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: String?, maxlen: ULong): Int =
    throw UnsupportedOperationException("procstatGetpathname not available on Android host — use androidNative target for FFI")

public actual fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: Int, rlimit: Rlimit?): Int =
    throw UnsupportedOperationException("procstatGetrlimit not available on Android host — use androidNative target for FFI")

public actual fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: UShort?): Int =
    throw UnsupportedOperationException("procstatGetumask not available on Android host — use androidNative target for FFI")

public actual fun procstatOpenCore(filename: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenCore not available on Android host — use androidNative target for FFI")

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenKvm not available on Android host — use androidNative target for FFI")

public actual fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetSocketInfo not available on Android host — use androidNative target for FFI")

public actual fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Int?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetVnodeInfo not available on Android host — use androidNative target for FFI")

public actual fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetPtsInfo not available on Android host — use androidNative target for FFI")

public actual fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetShmInfo not available on Android host — use androidNative target for FFI")

public actual fun timerCreate(clockId: Int, evp: Sigevent?, timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?): Int =
    throw UnsupportedOperationException("timerCreate not available on Android host — use androidNative target for FFI")

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?): Int =
    throw UnsupportedOperationException("timerDelete not available on Android host — use androidNative target for FFI")

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?): Int =
    throw UnsupportedOperationException("timerGetoverrun not available on Android host — use androidNative target for FFI")

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?, value: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime not available on Android host — use androidNative target for FFI")

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?, flags: Int, value: Itimerspec?, ovalue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime not available on Android host — use androidNative target for FFI")

public actual fun devstatGetnumdevs(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("devstatGetnumdevs not available on Android host — use androidNative target for FFI")

public actual fun devstatGetgeneration(kd: io.github.kotlinmania.libc.COpaquePointer?): Long =
    throw UnsupportedOperationException("devstatGetgeneration not available on Android host — use androidNative target for FFI")

public actual fun devstatGetversion(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("devstatGetversion not available on Android host — use androidNative target for FFI")

public actual fun devstatCheckversion(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("devstatCheckversion not available on Android host — use androidNative target for FFI")

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: Int?, numSelections: Int?, selectGeneration: Long?, currentGeneration: Long, devices: Devstat?, numdevs: Int, matches: DevstatMatch?, numMatches: Int, devSelections: COpaquePointer?, numDevSelections: Int, selectMode: DevstatSelectMode, maxshowdevs: Int, perfSelect: Int): Int =
    throw UnsupportedOperationException("devstatSelectdevs not available on Android host — use androidNative target for FFI")

public actual fun devstatBuildmatch(matchStr: String?, matches: COpaquePointer?, numMatches: Int?): Int =
    throw UnsupportedOperationException("devstatBuildmatch not available on Android host — use androidNative target for FFI")

public actual fun mallocStatsPrint(writeCb: ((COpaquePointer?, String?) -> Unit)?, cbopaque: COpaquePointer?, opt: String?): Unit = throw UnsupportedOperationException("mallocStatsPrint not available on Android host — use androidNative target for FFI")
