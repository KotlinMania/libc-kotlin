@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT

public actual fun fhlink(fhp: COpaquePointer?, to: String?): CInt =
    0

public actual fun fhlinkat(fhp: COpaquePointer?, tofd: CInt, to: String?): CInt =
    0

public actual fun fhreadlink(fhp: COpaquePointer?, buf: COpaquePointer?, bufsize: SizeT): CInt =
    0

public actual fun getfhat(fd: CInt, path: COpaquePointer?, fhp: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun error(): COpaquePointer? =
    null

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioReadv(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    0L

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioWritev(aiocbp: COpaquePointer?): CInt =
    0

public actual fun copyFileRange(infd: CInt, inoffp: COpaquePointer?, outfd: CInt, outoffp: COpaquePointer?, len: SizeT, flags: CUint): SsizeT =
    0L

public actual fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: CInt): COpaquePointer? =
    null

public actual fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt =
    0

public actual fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    0

public actual fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt =
    0

public actual fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun fspacectl(fd: CInt, cmd: CInt, rqsr: COpaquePointer?, flags: CInt, rmsr: COpaquePointer?): CInt =
    0

public actual fun jail(jail: COpaquePointer?): CInt =
    0

public actual fun jailAttach(jid: CInt): CInt =
    0

public actual fun jailRemove(jid: CInt): CInt =
    0

public actual fun jailGet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    0

public actual fun jailSet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    0

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    0

public actual fun getutxuser(user: String?): COpaquePointer? =
    null

public actual fun setutxdb(type: CInt, file: String?): CInt =
    0

public actual fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): SsizeT =
    0L

public actual fun mqGetfdNp(mqd: MqdT): CInt =
    0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    0

public actual fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    0L

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    0

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    null

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    0

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    0

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    0

public actual fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun msgget(key: KeyT, msgflg: CInt): CInt =
    0

public actual fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt =
    0

public actual fun cfmakesane(termios: COpaquePointer?) {
}

public actual fun pdfork(fdp: COpaquePointer?, flags: CInt): PidT =
    0

public actual fun pdgetpid(fd: CInt, pidp: COpaquePointer?): CInt =
    0

public actual fun pdkill(fd: CInt, signum: CInt): CInt =
    0

public actual fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: COpaquePointer?): CInt =
    0

public actual fun uuidgen(store: COpaquePointer?, count: CInt): CInt =
    0

public actual fun thrKill(id: CLong, sig: CInt): CInt =
    0

public actual fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt =
    0

public actual fun thrSelf(tid: COpaquePointer?): CInt =
    0

public actual fun pthreadGetthreadidNp(): CInt =
    0

public actual fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt =
    0

public actual fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt =
    0

public actual fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun schedGetcpu(): CInt =
    0

public actual fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt =
    0

public actual fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt =
    0

public actual fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt =
    0

public actual fun pthreadSpinDestroy(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinLock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinTrylock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadSpinUnlock(lock: COpaquePointer?): CInt =
    0

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun dup3(src: CInt, dst: CInt, flags: CInt): CInt =
    0

public actual fun xuname(nmln: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt): SsizeT =
    0L

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt, timeout: COpaquePointer?): SsizeT =
    0L

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    null

public actual fun fhopen(fhp: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun fhstat(fhp: COpaquePointer?, buf: COpaquePointer?): CInt =
    0

public actual fun fhstatfs(fhp: COpaquePointer?, buf: COpaquePointer?): CInt =
    0

public actual fun getfh(path: String?, fhp: COpaquePointer?): CInt =
    0

public actual fun lgetfh(path: String?, fhp: COpaquePointer?): CInt =
    0

public actual fun getfsstat(buf: COpaquePointer?, bufsize: CLong, mode: CInt): CInt =
    0

public actual fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt =
    0

public actual fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt =
    0

public actual fun nmount(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt =
    0

public actual fun setproctitle(fmt: String?, vararg variadicArgs: Long) {
}

public actual fun rfork(flags: CInt): CInt =
    0

public actual fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt =
    0

public actual fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt =
    0

public actual fun cpuset(setid: COpaquePointer?): CInt =
    0

public actual fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: COpaquePointer?): CInt =
    0

public actual fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt =
    0

public actual fun capEnter(): CInt =
    0

public actual fun capGetmode(modep: COpaquePointer?): CInt =
    0

public actual fun capFcntlsGet(fd: CInt, fcntlrightsp: COpaquePointer?): CInt =
    0

public actual fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt =
    0

public actual fun capIoctlsGet(fd: CInt, cmds: COpaquePointer?, maxcmds: ULong): Long =
    0L

public actual fun capIoctlsLimit(fd: CInt, cmds: COpaquePointer?, ncmds: ULong): CInt =
    0

public actual fun capRightsInit(version: CInt, rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun capRightsGet(version: CInt, fd: CInt, rightsp: COpaquePointer?): CInt =
    0

public actual fun capRightsSet(rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun capRightsClear(rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer? =
    null

public actual fun capRightsIsSet(rights: COpaquePointer?, vararg variadicArgs: Long): Boolean =
    false

public actual fun capRightsIsValid(rights: COpaquePointer?): Boolean =
    false

public actual fun capRightsLimit(fd: CInt, rights: COpaquePointer?): CInt =
    0

public actual fun capRightsMerge(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    null

public actual fun capRightsRemove(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer? =
    null

public actual fun capRightsContains(big: COpaquePointer?, little: COpaquePointer?): Boolean =
    false

public actual fun capSandboxed(): Boolean =
    false

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun ffs(value: CInt): CInt =
    0

public actual fun ffsl(value: CLong): CInt =
    0

public actual fun ffsll(value: CLonglong): CInt =
    0

public actual fun fls(value: CInt): CInt =
    0

public actual fun flsl(value: CLong): CInt =
    0

public actual fun flsll(value: CLonglong): CInt =
    0

public actual fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: COpaquePointer?, opt: String?) {
}

public actual fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    0

public actual fun mallctlnametomib(name: String?, mibp: COpaquePointer?, miplen: COpaquePointer?): CInt =
    0

public actual fun mallctlbymib(mib: COpaquePointer?, mible: SizeT, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    0

public actual fun mallocx(size: SizeT, flags: CInt): COpaquePointer? =
    null

public actual fun rallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): COpaquePointer? =
    null

public actual fun xallocx(ptr: COpaquePointer?, size: SizeT, extra: SizeT, flags: CInt): SizeT =
    0uL

public actual fun sallocx(ptr: COpaquePointer?, flags: CInt): SizeT =
    0uL

public actual fun dallocx(ptr: COpaquePointer?, flags: CInt) {
}

public actual fun sdallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt) {
}

public actual fun nallocx(size: SizeT, flags: CInt): SizeT =
    0uL

public actual fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt =
    0

public actual fun getpagesize(): CInt =
    0

public actual fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt =
    0

public actual fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: COpaquePointer?): CInt =
    0

public actual fun strchrnul(s: String?, c: CInt): COpaquePointer? =
    null

public actual fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt =
    0

public actual fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt =
    0

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    0

public actual fun setaudit(auditinfo: COpaquePointer?): CInt =
    0

public actual fun eventfd(initval: CUint, flags: CInt): CInt =
    0

public actual fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt =
    0

public actual fun eventfdWrite(fd: CInt, value: EventfdT): CInt =
    0

public actual fun fdatasync(fd: CInt): CInt =
    0

public actual fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt =
    0

public actual fun setproctitleFast(fmt: String?, vararg variadicArgs: Long) {
}

public actual fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun umtxOp(obj: COpaquePointer?, op: CInt, value: CUlong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt =
    0

public actual fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt =
    0

public actual fun sctpBindx(s: CInt, addrs: COpaquePointer?, num: CInt, tpe: CInt): CInt =
    0

public actual fun sctpConnectx(s: CInt, addrs: COpaquePointer?, addrcnt: CInt, id: COpaquePointer?): CInt =
    0

public actual fun sctpGetaddrlen(family: SaFamilyT): CInt =
    0

public actual fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    0

public actual fun sctpFreepaddrs(addrs: COpaquePointer?) {
}

public actual fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt =
    0

public actual fun sctpFreeladdrs(addrs: COpaquePointer?) {
}

public actual fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: COpaquePointer?): CInt =
    0

public actual fun sctpSendv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, addrs: COpaquePointer?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT =
    0L

public actual fun sctpRecvv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, from: COpaquePointer?, fromlen: COpaquePointer?, info: COpaquePointer?, infolen: COpaquePointer?, infotype: COpaquePointer?, flags: COpaquePointer?): SsizeT =
    0L

public actual fun timerfdCreate(clockid: CInt, flags: CInt): CInt =
    0

public actual fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt =
    0

public actual fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt =
    0

public actual fun closefrom(lowfd: CInt) {
}

public actual fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt =
    0

public actual fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt =
    0

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    null

public actual fun memstatStrerror(error: CInt): COpaquePointer? =
    null

public actual fun memstatMtlAlloc(): COpaquePointer? =
    null

public actual fun memstatMtlFirst(list: COpaquePointer?): COpaquePointer? =
    null

public actual fun memstatMtlNext(mtp: COpaquePointer?): COpaquePointer? =
    null

public actual fun memstatMtlFind(list: COpaquePointer?, allocator: CInt, name: String?): COpaquePointer? =
    null

public actual fun memstatMtlFree(list: COpaquePointer?) {
}

public actual fun memstatMtlGeterror(list: COpaquePointer?): CInt =
    0

public actual fun memstatGetName(mtp: COpaquePointer?): COpaquePointer? =
    null

public actual fun kvmDpcpuSetcpu(kd: COpaquePointer?, cpu: CUint): CInt =
    0

public actual fun kvmGetargv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer? =
    null

public actual fun kvmGetcptime(kd: COpaquePointer?, cpTime: COpaquePointer?): CInt =
    0

public actual fun kvmGetenvv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer? =
    null

public actual fun kvmGeterr(kd: COpaquePointer?): COpaquePointer? =
    null

public actual fun kvmGetmaxcpu(kd: COpaquePointer?): CInt =
    0

public actual fun kvmGetncpus(kd: COpaquePointer?): CInt =
    0

public actual fun kvmGetpcpu(kd: COpaquePointer?, cpu: CInt): COpaquePointer? =
    null

public actual fun kvmCounterU64Fetch(kd: COpaquePointer?, base: CUlong): ULong =
    0uL

public actual fun kvmGetswapinfo(kd: COpaquePointer?, info: COpaquePointer?, maxswap: CInt, flags: CInt): CInt =
    0

public actual fun kvmNative(kd: COpaquePointer?): CInt =
    0

public actual fun kvmNlist(kd: COpaquePointer?, nl: COpaquePointer?): CInt =
    0

public actual fun kvmNlist2(kd: COpaquePointer?, nl: COpaquePointer?): CInt =
    0

public actual fun kvmReadZpcpu(kd: COpaquePointer?, base: CUlong, buf: COpaquePointer?, size: SizeT, cpu: CInt): SsizeT =
    0L

public actual fun kvmRead2(kd: COpaquePointer?, addr: KvaddrT, buf: COpaquePointer?, nbytes: SizeT): SsizeT =
    0L

public actual fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt =
    0

public actual fun extattrStringToNamespace(string: String?, attrnamespace: COpaquePointer?): CInt =
    0

public actual fun realhostname(host: COpaquePointer?, hsize: SizeT, ip: COpaquePointer?): CInt =
    0

public actual fun realhostnameSa(host: COpaquePointer?, hsize: SizeT, addr: COpaquePointer?, addrlen: CInt): CInt =
    0

public actual fun kldIsloaded(name: String?): CInt =
    0

public actual fun kldLoad(name: String?): CInt =
    0

public actual fun kinfoGetvmmap(pid: PidT, cntp: COpaquePointer?): COpaquePointer? =
    null

public actual fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt) {
}

public actual fun humanizeNumber(buf: COpaquePointer?, len: SizeT, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt =
    0

public actual fun flopen(path: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun flopenat(fd: CInt, path: String?, flags: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun getlocalbase(): COpaquePointer? =
    null

public actual fun pidfileOpen(path: String?, mode: ModeT, pidptr: COpaquePointer?): COpaquePointer? =
    null

public actual fun pidfileWrite(path: COpaquePointer?): CInt =
    0

public actual fun pidfileClose(path: COpaquePointer?): CInt =
    0

public actual fun pidfileRemove(path: COpaquePointer?): CInt =
    0

public actual fun pidfileFileno(path: COpaquePointer?): CInt =
    0

public actual fun procstatOpenSysctl(): COpaquePointer? =
    null

public actual fun procstatGetfiles(procstat: COpaquePointer?, kp: COpaquePointer?, mmapped: CInt): COpaquePointer? =
    null

public actual fun procstatFreefiles(procstat: COpaquePointer?, head: COpaquePointer?) {
}

public actual fun procstatGetprocs(procstat: COpaquePointer?, what: CInt, arg: CInt, count: COpaquePointer?): COpaquePointer? =
    null

public actual fun procstatFreeprocs(procstat: COpaquePointer?, p: COpaquePointer?) {
}

public actual fun procstatGetvmmap(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer? =
    null

public actual fun procstatFreevmmap(procstat: COpaquePointer?, vmmap: COpaquePointer?) {
}

public actual fun procstatClose(procstat: COpaquePointer?) {
}

public actual fun procstatFreeargv(procstat: COpaquePointer?) {
}

public actual fun procstatFreeenvv(procstat: COpaquePointer?) {
}

public actual fun procstatFreegroups(procstat: COpaquePointer?, groups: COpaquePointer?) {
}

public actual fun procstatFreeptlwpinfo(procstat: COpaquePointer?, pl: COpaquePointer?) {
}

public actual fun procstatGetargv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer? =
    null

public actual fun procstatGetenvv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer? =
    null

public actual fun procstatGetgroups(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer? =
    null

public actual fun procstatGetosrel(procstat: COpaquePointer?, kp: COpaquePointer?, osrelp: COpaquePointer?): CInt =
    0

public actual fun procstatGetpathname(procstat: COpaquePointer?, kp: COpaquePointer?, pathname: COpaquePointer?, maxlen: SizeT): CInt =
    0

public actual fun procstatGetrlimit(procstat: COpaquePointer?, kp: COpaquePointer?, which: CInt, rlimit: COpaquePointer?): CInt =
    0

public actual fun procstatGetumask(procstat: COpaquePointer?, kp: COpaquePointer?, maskp: COpaquePointer?): CInt =
    0

public actual fun procstatOpenCore(filename: String?): COpaquePointer? =
    null

public actual fun procstatOpenKvm(nlistf: String?, memf: String?): COpaquePointer? =
    null

public actual fun procstatGetSocketInfo(proc: COpaquePointer?, fst: COpaquePointer?, sock: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    0

public actual fun procstatGetVnodeInfo(proc: COpaquePointer?, fst: COpaquePointer?, vn: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    0

public actual fun procstatGetPtsInfo(proc: COpaquePointer?, fst: COpaquePointer?, pts: COpaquePointer?, errbuf: COpaquePointer?): CInt =
    0

public actual fun procstatGetShmInfo(proc: COpaquePointer?, fst: COpaquePointer?, shm: COpaquePointer?, errbuf: COpaquePointer?): CInt =
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

public actual fun devstatGetnumdevs(kd: COpaquePointer?): CInt =
    0

public actual fun devstatGetgeneration(kd: COpaquePointer?): CLong =
    0L

public actual fun devstatGetversion(kd: COpaquePointer?): CInt =
    0

public actual fun devstatCheckversion(kd: COpaquePointer?): CInt =
    0

public actual fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: COpaquePointer?, numSelections: COpaquePointer?, selectGeneration: COpaquePointer?, currentGeneration: CLong, devices: COpaquePointer?, numdevs: CInt, matches: COpaquePointer?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt =
    0

public actual fun devstatBuildmatch(matchStr: COpaquePointer?, matches: COpaquePointer?, numMatches: COpaquePointer?): CInt =
    0
