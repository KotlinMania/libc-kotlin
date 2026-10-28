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
    throw UnsupportedOperationException("cMSGDATA requires N-API addon")

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires N-API addon")

public actual fun mallocxAlign(lg: UInt): Int =
    throw UnsupportedOperationException("mALLOCXALIGN requires N-API addon")

public actual fun sockcredSize(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCREDSIZE requires N-API addon")

public actual fun uname(buf: Utsname?): Int =
    throw UnsupportedOperationException("uname requires N-API addon")

public actual fun cpuZero(cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUZERO requires N-API addon")

public actual fun cpuFill(cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUFILL requires N-API addon")

public actual fun cpuSet(cpu: ULong, cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUSET requires N-API addon")

public actual fun cpuClear(cpu: ULong, cpuset: CpusetT?): Unit = throw UnsupportedOperationException("cPUCLR requires N-API addon")

public actual fun cpuIsSet(cpu: ULong, cpuset: CpusetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires N-API addon")

public actual fun cpuCount(cpuset: CpusetT?): Int =
    throw UnsupportedOperationException("cPUCOUNT requires N-API addon")

public actual fun sockcred2Size(ngrps: ULong): ULong =
    throw UnsupportedOperationException("sOCKCRED2SIZE requires N-API addon")

public actual fun protMax(x: Int): Int =
    throw UnsupportedOperationException("pROTMAX requires N-API addon")

public actual fun protMaxExtract(x: Int): Int =
    throw UnsupportedOperationException("pROTMAXEXTRACT requires N-API addon")

public actual fun fhlink(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, to: String?): Int =
    throw UnsupportedOperationException("fhlink requires N-API addon")

public actual fun fhlinkat(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, tofd: Int, to: String?): Int =
    throw UnsupportedOperationException("fhlinkat requires N-API addon")

public actual fun fhreadlink(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, buf: String?, bufsize: ULong): Int =
    throw UnsupportedOperationException("fhreadlink requires N-API addon")

public actual fun getfhat(fd: Int, path: String?, fhp: Fhandle?, flag: Int): Int =
    throw UnsupportedOperationException("getfhat requires N-API addon")

public actual fun error(): Int? =
    throw UnsupportedOperationException("error requires N-API addon")

public actual fun aioCancel(fd: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioCancel requires N-API addon")

public actual fun aioError(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioError requires N-API addon")

public actual fun aioFsync(op: Int, aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioFsync requires N-API addon")

public actual fun aioRead(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioRead requires N-API addon")

public actual fun aioReadv(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioReadv requires N-API addon")

public actual fun aioReturn(aiocbp: Aiocb?): Long =
    throw UnsupportedOperationException("aioReturn requires N-API addon")

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("aioSuspend requires N-API addon")

public actual fun aioWrite(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWrite requires N-API addon")

public actual fun aioWritev(aiocbp: Aiocb?): Int =
    throw UnsupportedOperationException("aioWritev requires N-API addon")

public actual fun copyFileRange(infd: Int, inoffp: Long?, outfd: Int, outoffp: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("copyFileRange requires N-API addon")

public actual fun devnameR(dev: ULong, mode: UInt, buf: String?, len: Int): String? =
    throw UnsupportedOperationException("devnameR requires N-API addon")

public actual fun extattrDeleteFd(fd: Int, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFd requires N-API addon")

public actual fun extattrDeleteFile(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteFile requires N-API addon")

public actual fun extattrDeleteLink(path: String?, attrnamespace: Int, attrname: String?): Int =
    throw UnsupportedOperationException("extattrDeleteLink requires N-API addon")

public actual fun extattrGetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFd requires N-API addon")

public actual fun extattrGetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetFile requires N-API addon")

public actual fun extattrGetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrGetLink requires N-API addon")

public actual fun extattrListFd(fd: Int, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFd requires N-API addon")

public actual fun extattrListFile(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListFile requires N-API addon")

public actual fun extattrListLink(path: String?, attrnamespace: Int, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrListLink requires N-API addon")

public actual fun extattrSetFd(fd: Int, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrSetFd requires N-API addon")

public actual fun extattrSetFile(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrSetFile requires N-API addon")

public actual fun extattrSetLink(path: String?, attrnamespace: Int, attrname: String?, data: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("extattrSetLink requires N-API addon")

public actual fun fspacectl(fd: Int, cmd: Int, rqsr: SpacectlRange?, flags: Int, rmsr: SpacectlRange?): Int =
    throw UnsupportedOperationException("fspacectl requires N-API addon")

public actual fun jail(jail: Jail?): Int =
    throw UnsupportedOperationException("jail requires N-API addon")

public actual fun jailAttach(jid: Int): Int =
    throw UnsupportedOperationException("jailAttach requires N-API addon")

public actual fun jailRemove(jid: Int): Int =
    throw UnsupportedOperationException("jailRemove requires N-API addon")

public actual fun jailGet(iov: Iovec?, niov: UInt, flags: Int): Int =
    throw UnsupportedOperationException("jailGet requires N-API addon")

public actual fun jailSet(iov: Iovec?, niov: UInt, flags: Int): Int =
    throw UnsupportedOperationException("jailSet requires N-API addon")

public actual fun lioListio(mode: Int, aiocbList: COpaquePointer?, nitems: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("lioListio requires N-API addon")

public actual fun getutxuser(user: String?): Utmpx? =
    throw UnsupportedOperationException("getutxuser requires N-API addon")

public actual fun setutxdb(type: Int, file: String?): Int =
    throw UnsupportedOperationException("setutxdb requires N-API addon")

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: Timespec?): Long =
    throw UnsupportedOperationException("aioWaitcomplete requires N-API addon")

public actual fun mqGetfdNp(mqd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("mqGetfdNp requires N-API addon")

public actual fun waitid(idtype: UInt, id: UInt, infop: SiginfoT?, options: Int): Int =
    throw UnsupportedOperationException("waitid requires N-API addon")

public actual fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("ptsnameR requires N-API addon")

public actual fun shmget(key: Int, size: ULong, shmflg: Int): Int =
    throw UnsupportedOperationException("shmget requires N-API addon")

public actual fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer? =
    throw UnsupportedOperationException("shmat requires N-API addon")

public actual fun shmdt(shmaddr: COpaquePointer?): Int =
    throw UnsupportedOperationException("shmdt requires N-API addon")

public actual fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int =
    throw UnsupportedOperationException("shmctl requires N-API addon")

public actual fun semget(key: Int, nsems: Int, semflg: Int): Int =
    throw UnsupportedOperationException("semget requires N-API addon")

public actual fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("semctl requires N-API addon")

public actual fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int =
    throw UnsupportedOperationException("semop requires N-API addon")

public actual fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int =
    throw UnsupportedOperationException("msgctl requires N-API addon")

public actual fun msgget(key: Int, msgflg: Int): Int =
    throw UnsupportedOperationException("msgget requires N-API addon")

public actual fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int =
    throw UnsupportedOperationException("msgsnd requires N-API addon")

public actual fun cfmakesane(termios: Termios?): Unit = throw UnsupportedOperationException("cfmakesane requires N-API addon")

public actual fun pdfork(fdp: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pdfork requires N-API addon")

public actual fun pdgetpid(fd: Int, pidp: Int?): Int =
    throw UnsupportedOperationException("pdgetpid requires N-API addon")

public actual fun pdkill(fd: Int, signum: Int): Int =
    throw UnsupportedOperationException("pdkill requires N-API addon")

public actual fun rtprioThread(function: Int, lwpid: Int, rtp: Rtprio?): Int =
    throw UnsupportedOperationException("rtprioThread requires N-API addon")

public actual fun uuidgen(store: Uuid?, count: Int): Int =
    throw UnsupportedOperationException("uuidgen requires N-API addon")

public actual fun thrKill(id: Long, sig: Int): Int =
    throw UnsupportedOperationException("thrKill requires N-API addon")

public actual fun thrKill2(pid: Int, id: Long, sig: Int): Int =
    throw UnsupportedOperationException("thrKill2 requires N-API addon")

public actual fun thrSelf(tid: Long?): Int =
    throw UnsupportedOperationException("thrSelf requires N-API addon")

public actual fun pthreadGetthreadidNp(): Int =
    throw UnsupportedOperationException("pthreadGetthreadidNp requires N-API addon")

public actual fun pthreadGetaffinityNp(td: ULong, cpusetsize: ULong, cpusetp: CpusetT?): Int =
    throw UnsupportedOperationException("pthreadGetaffinityNp requires N-API addon")

public actual fun pthreadSetaffinityNp(td: ULong, cpusetsize: ULong, cpusetp: CpusetT?): Int =
    throw UnsupportedOperationException("pthreadSetaffinityNp requires N-API addon")

public actual fun schedGetaffinity(pid: Int, cpusetsz: ULong, cpuset: CpusetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires N-API addon")

public actual fun schedSetaffinity(pid: Int, cpusetsz: ULong, cpuset: CpusetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires N-API addon")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu requires N-API addon")

public actual fun pthreadMutexConsistent(mutex: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadMutexConsistent requires N-API addon")

public actual fun pthreadMutexattrGetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetrobust requires N-API addon")

public actual fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetrobust requires N-API addon")

public actual fun pthreadSpinInit(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadSpinInit requires N-API addon")

public actual fun pthreadSpinDestroy(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinDestroy requires N-API addon")

public actual fun pthreadSpinLock(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinLock requires N-API addon")

public actual fun pthreadSpinTrylock(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinTrylock requires N-API addon")

public actual fun pthreadSpinUnlock(lock: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousPthreadSpinlock?): Int =
    throw UnsupportedOperationException("pthreadSpinUnlock requires N-API addon")

public actual fun pthreadTimedjoinNp(thread: ULong, retval: COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires N-API addon")

public actual fun statfs(path: String?, buf: Statfs?): Int =
    throw UnsupportedOperationException("statfs requires N-API addon")

public actual fun fstatfs(fd: Int, buf: Statfs?): Int =
    throw UnsupportedOperationException("fstatfs requires N-API addon")

public actual fun dup3(src: Int, dst: Int, flags: Int): Int =
    throw UnsupportedOperationException("dup3 requires N-API addon")

public actual fun xuname(nmln: Int, buf: COpaquePointer?): Int =
    throw UnsupportedOperationException("xuname requires N-API addon")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: ULong, flags: Int): Long =
    throw UnsupportedOperationException("sendmmsg requires N-API addon")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: ULong, flags: Int, timeout: Timespec?): Long =
    throw UnsupportedOperationException("recvmmsg requires N-API addon")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires N-API addon")

public actual fun fhopen(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, flags: Int): Int =
    throw UnsupportedOperationException("fhopen requires N-API addon")

public actual fun fhstat(fhp: Fhandle?, buf: Stat?): Int =
    throw UnsupportedOperationException("fhstat requires N-API addon")

public actual fun fhstatfs(fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?, buf: Statfs?): Int =
    throw UnsupportedOperationException("fhstatfs requires N-API addon")

public actual fun getfh(path: String?, fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?): Int =
    throw UnsupportedOperationException("getfh requires N-API addon")

public actual fun lgetfh(path: String?, fhp: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Fhandle?): Int =
    throw UnsupportedOperationException("lgetfh requires N-API addon")

public actual fun getfsstat(buf: Statfs?, bufsize: Long, mode: Int): Int =
    throw UnsupportedOperationException("getfsstat requires N-API addon")

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: Int): Int =
    throw UnsupportedOperationException("getmntinfo requires N-API addon")

public actual fun mount(type: String?, dir: String?, flags: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount requires N-API addon")

public actual fun nmount(iov: Iovec?, niov: UInt, flags: Int): Int =
    throw UnsupportedOperationException("nmount requires N-API addon")

public actual fun setproctitle(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitle requires N-API addon")

public actual fun rfork(flags: Int): Int =
    throw UnsupportedOperationException("rfork requires N-API addon")

public actual fun cpusetGetaffinity(level: Int, which: Int, id: UInt, setsize: ULong, mask: CpusetT?): Int =
    throw UnsupportedOperationException("cpusetGetaffinity requires N-API addon")

public actual fun cpusetSetaffinity(level: Int, which: Int, id: UInt, setsize: ULong, mask: CpusetT?): Int =
    throw UnsupportedOperationException("cpusetSetaffinity requires N-API addon")

public actual fun cpuset(setid: Int?): Int =
    throw UnsupportedOperationException("cpuset requires N-API addon")

public actual fun cpusetGetid(level: Int, which: Int, id: UInt, setid: Int?): Int =
    throw UnsupportedOperationException("cpusetGetid requires N-API addon")

public actual fun cpusetSetid(which: Int, id: UInt, setid: Int): Int =
    throw UnsupportedOperationException("cpusetSetid requires N-API addon")

public actual fun capEnter(): Int =
    throw UnsupportedOperationException("capEnter requires N-API addon")

public actual fun capGetmode(modep: UInt?): Int =
    throw UnsupportedOperationException("capGetmode requires N-API addon")

public actual fun capFcntlsGet(fd: Int, fcntlrightsp: UInt?): Int =
    throw UnsupportedOperationException("capFcntlsGet requires N-API addon")

public actual fun capFcntlsLimit(fd: Int, fcntlrights: UInt): Int =
    throw UnsupportedOperationException("capFcntlsLimit requires N-API addon")

public actual fun capIoctlsGet(fd: Int, cmds: ULong?, maxcmds: ULong): Long =
    throw UnsupportedOperationException("capIoctlsGet requires N-API addon")

public actual fun capIoctlsLimit(fd: Int, cmds: ULong?, ncmds: ULong): Int =
    throw UnsupportedOperationException("capIoctlsLimit requires N-API addon")

public actual fun capRightsInit(version: Int, rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsInit requires N-API addon")

public actual fun capRightsGet(version: Int, fd: Int, rightsp: CapRightsT?): Int =
    throw UnsupportedOperationException("capRightsGet requires N-API addon")

public actual fun capRightsSet(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsSet requires N-API addon")

public actual fun capRightsClear(rights: CapRightsT?, vararg args: Any?): CapRightsT? =
    throw UnsupportedOperationException("capRightsClear requires N-API addon")

public actual fun capRightsIsSet(rights: CapRightsT?, vararg args: Any?): Boolean =
    throw UnsupportedOperationException("capRightsIsSet requires N-API addon")

public actual fun capRightsIsValid(rights: CapRightsT?): Boolean =
    throw UnsupportedOperationException("capRightsIsValid requires N-API addon")

public actual fun capRightsLimit(fd: Int, rights: CapRightsT?): Int =
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

public actual fun ffs(value: Int): Int =
    throw UnsupportedOperationException("ffs requires N-API addon")

public actual fun ffsl(value: Long): Int =
    throw UnsupportedOperationException("ffsl requires N-API addon")

public actual fun ffsll(value: Long): Int =
    throw UnsupportedOperationException("ffsll requires N-API addon")

public actual fun fls(value: Int): Int =
    throw UnsupportedOperationException("fls requires N-API addon")

public actual fun flsl(value: Long): Int =
    throw UnsupportedOperationException("flsl requires N-API addon")

public actual fun flsll(value: Long): Int =
    throw UnsupportedOperationException("flsll requires N-API addon")

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("mallctl requires N-API addon")

public actual fun mallctlnametomib(name: String?, mibp: ULong?, miplen: ULong?): Int =
    throw UnsupportedOperationException("mallctlnametomib requires N-API addon")

public actual fun mallctlbymib(mib: ULong?, mible: ULong, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("mallctlbymib requires N-API addon")

public actual fun mallocx(size: ULong, flags: Int): COpaquePointer? =
    throw UnsupportedOperationException("mallocx requires N-API addon")

public actual fun rallocx(ptr: COpaquePointer?, size: ULong, flags: Int): COpaquePointer? =
    throw UnsupportedOperationException("rallocx requires N-API addon")

public actual fun xallocx(ptr: COpaquePointer?, size: ULong, extra: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("xallocx requires N-API addon")

public actual fun sallocx(ptr: COpaquePointer?, flags: Int): ULong =
    throw UnsupportedOperationException("sallocx requires N-API addon")

public actual fun dallocx(ptr: COpaquePointer?, flags: Int): Unit = throw UnsupportedOperationException("dallocx requires N-API addon")

public actual fun sdallocx(ptr: COpaquePointer?, size: ULong, flags: Int): Unit = throw UnsupportedOperationException("sdallocx requires N-API addon")

public actual fun nallocx(size: ULong, flags: Int): ULong =
    throw UnsupportedOperationException("nallocx requires N-API addon")

public actual fun procctl(idtype: UInt, id: UInt, cmd: Int, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("procctl requires N-API addon")

public actual fun getpagesize(): Int =
    throw UnsupportedOperationException("getpagesize requires N-API addon")

public actual fun getpagesizes(pagesize: ULong?, nelem: Int): Int =
    throw UnsupportedOperationException("getpagesizes requires N-API addon")

public actual fun clockGetcpuclockid2(arg1: UInt, arg2: Int, arg3: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid2 requires N-API addon")

public actual fun strchrnul(s: String?, c: Int): String? =
    throw UnsupportedOperationException("strchrnul requires N-API addon")

public actual fun shmCreateLargepage(path: String?, flags: Int, psind: Int, allocPolicy: Int, mode: UInt): Int =
    throw UnsupportedOperationException("shmCreateLargepage requires N-API addon")

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: Int): Int =
    throw UnsupportedOperationException("shmRename requires N-API addon")

public actual fun memfdCreate(name: String?, flags: UInt): Int =
    throw UnsupportedOperationException("memfdCreate requires N-API addon")

public actual fun setaudit(auditinfo: AuditinfoT?): Int =
    throw UnsupportedOperationException("setaudit requires N-API addon")

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd requires N-API addon")

public actual fun eventfdRead(fd: Int, value: ULong?): Int =
    throw UnsupportedOperationException("eventfdRead requires N-API addon")

public actual fun eventfdWrite(fd: Int, value: ULong): Int =
    throw UnsupportedOperationException("eventfdWrite requires N-API addon")

public actual fun fdatasync(fd: Int): Int =
    throw UnsupportedOperationException("fdatasync requires N-API addon")

public actual fun elfAuxInfo(aux: Int, buf: COpaquePointer?, buflen: Int): Int =
    throw UnsupportedOperationException("elfAuxInfo requires N-API addon")

public actual fun setproctitleFast(fmt: String?, vararg args: Any?): Unit = throw UnsupportedOperationException("setproctitleFast requires N-API addon")

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("timingsafeBcmp requires N-API addon")

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("timingsafeMemcmp requires N-API addon")

public actual fun umtxOp(obj: COpaquePointer?, op: Int, `val`: ULong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): Int =
    throw UnsupportedOperationException("umtxOp requires N-API addon")

public actual fun sctpPeeloff(s: Int, id: UInt): Int =
    throw UnsupportedOperationException("sctpPeeloff requires N-API addon")

public actual fun sctpBindx(s: Int, addrs: Sockaddr?, num: Int, tpe: Int): Int =
    throw UnsupportedOperationException("sctpBindx requires N-API addon")

public actual fun sctpConnectx(s: Int, addrs: Sockaddr?, addrcnt: Int, id: UInt?): Int =
    throw UnsupportedOperationException("sctpConnectx requires N-API addon")

public actual fun sctpGetaddrlen(family: UShort): Int =
    throw UnsupportedOperationException("sctpGetaddrlen requires N-API addon")

public actual fun sctpGetpaddrs(s: Int, asocid: UInt, addrs: COpaquePointer?): Int =
    throw UnsupportedOperationException("sctpGetpaddrs requires N-API addon")

public actual fun sctpFreepaddrs(addrs: Sockaddr?): Unit = throw UnsupportedOperationException("sctpFreepaddrs requires N-API addon")

public actual fun sctpGetladdrs(s: Int, asocid: UInt, addrs: COpaquePointer?): Int =
    throw UnsupportedOperationException("sctpGetladdrs requires N-API addon")

public actual fun sctpFreeladdrs(addrs: Sockaddr?): Unit = throw UnsupportedOperationException("sctpFreeladdrs requires N-API addon")

public actual fun sctpOptInfo(s: Int, id: UInt, opt: Int, arg: COpaquePointer?, size: UInt?): Int =
    throw UnsupportedOperationException("sctpOptInfo requires N-API addon")

public actual fun sctpSendv(sd: Int, iov: Iovec?, iovcnt: Int, addrs: Sockaddr?, addrcnt: Int, info: COpaquePointer?, infolen: UInt, infotype: UInt, flags: Int): Long =
    throw UnsupportedOperationException("sctpSendv requires N-API addon")

public actual fun sctpRecvv(sd: Int, iov: Iovec?, iovcnt: Int, from: Sockaddr?, fromlen: UInt?, info: COpaquePointer?, infolen: UInt?, infotype: UInt?, flags: Int?): Long =
    throw UnsupportedOperationException("sctpRecvv requires N-API addon")

public actual fun timerfdCreate(clockid: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate requires N-API addon")

public actual fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime requires N-API addon")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime requires N-API addon")

public actual fun closefrom(lowfd: Int): Unit = throw UnsupportedOperationException("closefrom requires N-API addon")

public actual fun closeRange(lowfd: UInt, highfd: UInt, flags: Int): Int =
    throw UnsupportedOperationException("closeRange requires N-API addon")

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("execvpe requires N-API addon")

public actual fun kcmp(pid1: Int, pid2: Int, type: Int, idx1: ULong, idx2: ULong): Int =
    throw UnsupportedOperationException("kcmp requires N-API addon")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires N-API addon")

public actual fun memstatStrerror(error: Int): String? =
    throw UnsupportedOperationException("memstatStrerror requires N-API addon")

public actual fun memstatMtlAlloc(): MemoryTypeList? =
    throw UnsupportedOperationException("memstatMtlAlloc requires N-API addon")

public actual fun memstatMtlFirst(list: MemoryTypeList?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFirst requires N-API addon")

public actual fun memstatMtlNext(mtp: MemoryType?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlNext requires N-API addon")

public actual fun memstatMtlFind(list: MemoryTypeList?, allocator: Int, name: String?): MemoryType? =
    throw UnsupportedOperationException("memstatMtlFind requires N-API addon")

public actual fun memstatMtlFree(list: MemoryTypeList?): Unit = throw UnsupportedOperationException("memstatMtlFree requires N-API addon")

public actual fun memstatMtlGeterror(list: MemoryTypeList?): Int =
    throw UnsupportedOperationException("memstatMtlGeterror requires N-API addon")

public actual fun memstatGetName(mtp: MemoryType?): String? =
    throw UnsupportedOperationException("memstatGetName requires N-API addon")

public actual fun kvmDpcpuSetcpu(kd: io.github.kotlinmania.libc.COpaquePointer?, cpu: UInt): Int =
    throw UnsupportedOperationException("kvmDpcpuSetcpu requires N-API addon")

public actual fun kvmGetargv(kd: io.github.kotlinmania.libc.COpaquePointer?, p: KinfoProc?, nchr: Int): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetargv requires N-API addon")

public actual fun kvmGetcptime(kd: io.github.kotlinmania.libc.COpaquePointer?, cpTime: Long?): Int =
    throw UnsupportedOperationException("kvmGetcptime requires N-API addon")

public actual fun kvmGetenvv(kd: io.github.kotlinmania.libc.COpaquePointer?, p: KinfoProc?, nchr: Int): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetenvv requires N-API addon")

public actual fun kvmGeterr(kd: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("kvmGeterr requires N-API addon")

public actual fun kvmGetmaxcpu(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("kvmGetmaxcpu requires N-API addon")

public actual fun kvmGetncpus(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("kvmGetncpus requires N-API addon")

public actual fun kvmGetpcpu(kd: io.github.kotlinmania.libc.COpaquePointer?, cpu: Int): COpaquePointer? =
    throw UnsupportedOperationException("kvmGetpcpu requires N-API addon")

public actual fun kvmCounterU64Fetch(kd: io.github.kotlinmania.libc.COpaquePointer?, base: ULong): ULong =
    throw UnsupportedOperationException("kvmCounterU64Fetch requires N-API addon")

public actual fun kvmGetswapinfo(kd: io.github.kotlinmania.libc.COpaquePointer?, info: KvmSwap?, maxswap: Int, flags: Int): Int =
    throw UnsupportedOperationException("kvmGetswapinfo requires N-API addon")

public actual fun kvmNative(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("kvmNative requires N-API addon")

public actual fun kvmNlist(kd: io.github.kotlinmania.libc.COpaquePointer?, nl: Nlist?): Int =
    throw UnsupportedOperationException("kvmNlist requires N-API addon")

public actual fun kvmNlist2(kd: io.github.kotlinmania.libc.COpaquePointer?, nl: KvmNlist?): Int =
    throw UnsupportedOperationException("kvmNlist2 requires N-API addon")

public actual fun kvmReadZpcpu(kd: io.github.kotlinmania.libc.COpaquePointer?, base: ULong, buf: COpaquePointer?, size: ULong, cpu: Int): Long =
    throw UnsupportedOperationException("kvmReadZpcpu requires N-API addon")

public actual fun kvmRead2(kd: io.github.kotlinmania.libc.COpaquePointer?, addr: ULong, buf: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("kvmRead2 requires N-API addon")

public actual fun extattrNamespaceToString(attrnamespace: Int, string: COpaquePointer?): Int =
    throw UnsupportedOperationException("extattrNamespaceToString requires N-API addon")

public actual fun extattrStringToNamespace(string: String?, attrnamespace: Int?): Int =
    throw UnsupportedOperationException("extattrStringToNamespace requires N-API addon")

public actual fun realhostname(host: String?, hsize: ULong, ip: InAddr?): Int =
    throw UnsupportedOperationException("realhostname requires N-API addon")

public actual fun realhostnameSa(host: String?, hsize: ULong, addr: Sockaddr?, addrlen: Int): Int =
    throw UnsupportedOperationException("realhostnameSa requires N-API addon")

public actual fun kldIsloaded(name: String?): Int =
    throw UnsupportedOperationException("kldIsloaded requires N-API addon")

public actual fun kldLoad(name: String?): Int =
    throw UnsupportedOperationException("kldLoad requires N-API addon")

public actual fun kinfoGetvmmap(pid: Int, cntp: Int?): KinfoVmentry? =
    throw UnsupportedOperationException("kinfoGetvmmap requires N-API addon")

public actual fun hexdump(ptr: COpaquePointer?, length: Int, hdr: String?, flags: Int): Unit = throw UnsupportedOperationException("hexdump requires N-API addon")

public actual fun humanizeNumber(buf: String?, len: ULong, number: Long, suffix: String?, scale: Int, flags: Int): Int =
    throw UnsupportedOperationException("humanizeNumber requires N-API addon")

public actual fun flopen(path: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("flopen requires N-API addon")

public actual fun flopenat(fd: Int, path: String?, flags: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("flopenat requires N-API addon")

public actual fun getlocalbase(): String? =
    throw UnsupportedOperationException("getlocalbase requires N-API addon")

public actual fun pidfileOpen(path: String?, mode: UInt, pidptr: Int?): Pidfh? =
    throw UnsupportedOperationException("pidfileOpen requires N-API addon")

public actual fun pidfileWrite(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileWrite requires N-API addon")

public actual fun pidfileClose(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileClose requires N-API addon")

public actual fun pidfileRemove(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileRemove requires N-API addon")

public actual fun pidfileFileno(path: Pidfh?): Int =
    throw UnsupportedOperationException("pidfileFileno requires N-API addon")

public actual fun procstatOpenSysctl(): Procstat? =
    throw UnsupportedOperationException("procstatOpenSysctl requires N-API addon")

public actual fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: Int): FilestatList? =
    throw UnsupportedOperationException("procstatGetfiles requires N-API addon")

public actual fun procstatFreefiles(procstat: Procstat?, head: FilestatList?): Unit = throw UnsupportedOperationException("procstatFreefiles requires N-API addon")

public actual fun procstatGetprocs(procstat: Procstat?, what: Int, arg: Int, count: UInt?): KinfoProc? =
    throw UnsupportedOperationException("procstatGetprocs requires N-API addon")

public actual fun procstatFreeprocs(procstat: Procstat?, p: KinfoProc?): Unit = throw UnsupportedOperationException("procstatFreeprocs requires N-API addon")

public actual fun procstatGetvmmap(procstat: Procstat?, kp: KinfoProc?, count: UInt?): KinfoVmentry? =
    throw UnsupportedOperationException("procstatGetvmmap requires N-API addon")

public actual fun procstatFreevmmap(procstat: Procstat?, vmmap: KinfoVmentry?): Unit = throw UnsupportedOperationException("procstatFreevmmap requires N-API addon")

public actual fun procstatClose(procstat: Procstat?): Unit = throw UnsupportedOperationException("procstatClose requires N-API addon")

public actual fun procstatFreeargv(procstat: Procstat?): Unit = throw UnsupportedOperationException("procstatFreeargv requires N-API addon")

public actual fun procstatFreeenvv(procstat: Procstat?): Unit = throw UnsupportedOperationException("procstatFreeenvv requires N-API addon")

public actual fun procstatFreegroups(procstat: Procstat?, groups: UInt?): Unit = throw UnsupportedOperationException("procstatFreegroups requires N-API addon")

public actual fun procstatFreeptlwpinfo(procstat: Procstat?, pl: PtraceLwpinfo?): Unit = throw UnsupportedOperationException("procstatFreeptlwpinfo requires N-API addon")

public actual fun procstatGetargv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetargv requires N-API addon")

public actual fun procstatGetenvv(procstat: Procstat?, kp: KinfoProc?, nchr: ULong): COpaquePointer? =
    throw UnsupportedOperationException("procstatGetenvv requires N-API addon")

public actual fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: UInt?): UInt? =
    throw UnsupportedOperationException("procstatGetgroups requires N-API addon")

public actual fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: Int?): Int =
    throw UnsupportedOperationException("procstatGetosrel requires N-API addon")

public actual fun procstatGetpathname(procstat: Procstat?, kp: KinfoProc?, pathname: String?, maxlen: ULong): Int =
    throw UnsupportedOperationException("procstatGetpathname requires N-API addon")

public actual fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: Int, rlimit: Rlimit?): Int =
    throw UnsupportedOperationException("procstatGetrlimit requires N-API addon")

public actual fun procstatGetumask(procstat: Procstat?, kp: KinfoProc?, maskp: UShort?): Int =
    throw UnsupportedOperationException("procstatGetumask requires N-API addon")

public actual fun procstatOpenCore(filename: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenCore requires N-API addon")

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): Procstat? =
    throw UnsupportedOperationException("procstatOpenKvm requires N-API addon")

public actual fun procstatGetSocketInfo(proc: Procstat?, fst: Filestat?, sock: Sockstat?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetSocketInfo requires N-API addon")

public actual fun procstatGetVnodeInfo(proc: Procstat?, fst: Filestat?, vn: Int?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetVnodeInfo requires N-API addon")

public actual fun procstatGetPtsInfo(proc: Procstat?, fst: Filestat?, pts: Ptsstat?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetPtsInfo requires N-API addon")

public actual fun procstatGetShmInfo(proc: Procstat?, fst: Filestat?, shm: Shmstat?, errbuf: String?): Int =
    throw UnsupportedOperationException("procstatGetShmInfo requires N-API addon")

public actual fun timerCreate(clockId: Int, evp: Sigevent?, timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?): Int =
    throw UnsupportedOperationException("timerCreate requires N-API addon")

public actual fun timerDelete(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?): Int =
    throw UnsupportedOperationException("timerDelete requires N-API addon")

public actual fun timerGetoverrun(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?): Int =
    throw UnsupportedOperationException("timerGetoverrun requires N-API addon")

public actual fun timerGettime(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?, value: Itimerspec?): Int =
    throw UnsupportedOperationException("timerGettime requires N-API addon")

public actual fun timerSettime(timerid: io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CAnonymousTimer?, flags: Int, value: Itimerspec?, ovalue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerSettime requires N-API addon")

public actual fun devstatGetnumdevs(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("devstatGetnumdevs requires N-API addon")

public actual fun devstatGetgeneration(kd: io.github.kotlinmania.libc.COpaquePointer?): Long =
    throw UnsupportedOperationException("devstatGetgeneration requires N-API addon")

public actual fun devstatGetversion(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("devstatGetversion requires N-API addon")

public actual fun devstatCheckversion(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("devstatCheckversion requires N-API addon")

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: Int?, numSelections: Int?, selectGeneration: Long?, currentGeneration: Long, devices: Devstat?, numdevs: Int, matches: DevstatMatch?, numMatches: Int, devSelections: COpaquePointer?, numDevSelections: Int, selectMode: DevstatSelectMode, maxshowdevs: Int, perfSelect: Int): Int =
    throw UnsupportedOperationException("devstatSelectdevs requires N-API addon")

public actual fun devstatBuildmatch(matchStr: String?, matches: COpaquePointer?, numMatches: Int?): Int =
    throw UnsupportedOperationException("devstatBuildmatch requires N-API addon")

public actual fun mallocStatsPrint(writeCb: ((COpaquePointer?, String?) -> Unit)?, cbopaque: COpaquePointer?, opt: String?): Unit = throw UnsupportedOperationException("mallocStatsPrint requires N-API addon")
