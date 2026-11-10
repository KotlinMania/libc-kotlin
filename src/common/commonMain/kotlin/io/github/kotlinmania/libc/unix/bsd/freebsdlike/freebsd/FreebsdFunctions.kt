package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.cmsgFirsthdr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PROT_EXEC
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PROT_READ
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PROT_WRITE
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ALIGNBYTES
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT

public fun interface MallocStatsPrintWriteCbCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?)
}

public fun mapAligned(a: CInt): CInt {
    return a shl 24
}

public fun align(p: Int): Int {
    return (p + ALIGNBYTES) and ALIGNBYTES.inv()
}

// sys/cpuset.h
public fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? {
    return ((COpaquePointer((cmsg).hashCode().toLong())))?.let { COpaquePointer(it.rawValue + align(8).toLong()) }
}

public fun cmsgLen(length: CUint): CUint {
    return align(8).toUInt() + length
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if ((cmsg == null)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = ((cmsg).hashCode().toLong()).toInt() + align(cmsg.cmsgLen.toInt()) + align(8)
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + mhdr.msgControllen.toInt()
    return if (next > max) {
        null
    } else {
        null
    }
}

public fun cmsgSpace(length: CUint): CUint {
    return (align(8) + align(length.toInt())).toUInt()
}

public fun mallocxAlign(lg: CUint): CInt {
    return ffsl(lg.toLong() - 1L)
}

public fun mallocxTcache(tc: CInt): CInt {
    return (tc + 2) shl 8
}

public fun mallocxArena(a: CInt): CInt {
    return (a + 1) shl 20
}

public fun sockcredsize(ngrps: Int): Int {
    val ngrps1 = if (ngrps > 0) {
        ngrps - 1
    } else {
        0
    }
    return 8 + 8 * ngrps1
}

public fun uname(buf: COpaquePointer?): CInt {
    return xuname(256, buf)
}

public fun cpuZero(cpuset: CpusetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0L
    }
}

public fun cpuFill(cpuset: CpusetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0L.inv()
    }
}

public fun cpuSet(cpu: Int, cpuset: CpusetT) {
    val bitsetBits = 8 * 8
    val (idx, offset) = Pair(cpu / bitsetBits, cpu % bitsetBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1L shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpusetT) {
    val bitsetBits = 8 * 8
    val (idx, offset) = Pair(cpu / bitsetBits, cpu % bitsetBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1L shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpusetT): Boolean {
    val bitsetBits = 8 * 8
    val (idx, offset) = Pair(cpu / bitsetBits, cpu % bitsetBits)
    return 0L != cpuset.bits[idx] and (1L shl offset)
}

public fun cpuCount(cpuset: CpusetT): CInt {
    var s: UInt = 0u
    val cpusetSize = 8
    val bitsetSize = 8
    for (i in cpuset.bits.slice(0 until (cpusetSize / bitsetSize))) {
        s += i.countOneBits().toUInt()
    }
    return s.toInt()
}

public fun sockcred2size(ngrps: Int): Int {
    val ngrps1 = if (ngrps > 0) {
        ngrps - 1
    } else {
        0
    }
    return 8 + 8 * ngrps1
}

public fun protMax(x: CInt): CInt {
    return x shl 16
}

public fun protMaxExtract(x: CInt): CInt {
    return (x shr 16) and (PROT_READ or PROT_WRITE or PROT_EXEC)
}

public fun wifsignaled(status: CInt): Boolean {
    return (status and 127) != 127 && (status and 127) != 0 && status != 0x13
}

public fun invalidSinfoFlag(x: CInt): Boolean {
    return (x) and 0xfffffff0.toInt() and (SCTP_EOF or SCTP_ABORT or SCTP_UNORDERED or SCTP_ADDR_OVER or SCTP_SENDALL or SCTP_EOR or SCTP_SACK_IMMEDIATELY).inv() != 0
}

public fun prSctpPolicy(x: CInt): CInt {
    return x and 0x0f
}

public fun prSctpEnabled(x: CInt): Boolean {
    return prSctpPolicy(x) != SCTP_PR_SCTP_NONE && prSctpPolicy(x) != SCTP_PR_SCTP_ALL
}

public fun prSctpTtlEnabled(x: CInt): Boolean {
    return prSctpPolicy(x) == SCTP_PR_SCTP_TTL
}

public fun prSctpBufEnabled(x: CInt): Boolean {
    return prSctpPolicy(x) == SCTP_PR_SCTP_BUF
}

public fun prSctpRtxEnabled(x: CInt): Boolean {
    return prSctpPolicy(x) == SCTP_PR_SCTP_RTX
}

public fun prSctpInvalidPolicy(x: CInt): Boolean {
    return prSctpPolicy(x) > SCTP_PR_SCTP_MAX
}

public fun prSctpValidPolicy(x: CInt): Boolean {
    return prSctpPolicy(x) <= SCTP_PR_SCTP_MAX
}

public expect fun fhlink(fhp: COpaquePointer?, to: String?): CInt

public expect fun fhlinkat(fhp: COpaquePointer?, tofd: CInt, to: String?): CInt

public expect fun fhreadlink(fhp: COpaquePointer?, buf: COpaquePointer?, bufsize: SizeT): CInt

public expect fun getfhat(fd: CInt, path: COpaquePointer?, fhp: COpaquePointer?, flag: CInt): CInt

public expect fun error(): COpaquePointer?

public expect fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioError(aiocbp: COpaquePointer?): CInt

public expect fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioRead(aiocbp: COpaquePointer?): CInt

public expect fun aioReadv(aiocbp: COpaquePointer?): CInt

public expect fun aioReturn(aiocbp: COpaquePointer?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt

public expect fun aioWrite(aiocbp: COpaquePointer?): CInt

public expect fun aioWritev(aiocbp: COpaquePointer?): CInt

public expect fun copyFileRange(infd: CInt, inoffp: COpaquePointer?, outfd: CInt, outoffp: COpaquePointer?, len: SizeT, flags: CUint): SsizeT

public expect fun devnameR(dev: DevT, mode: ModeT, buf: COpaquePointer?, len: CInt): COpaquePointer?

public expect fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: String?): CInt

public expect fun extattrDeleteFile(path: String?, attrnamespace: CInt, attrname: String?): CInt

public expect fun extattrDeleteLink(path: String?, attrnamespace: CInt, attrname: String?): CInt

public expect fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrGetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrGetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrListFd(fd: CInt, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrListFile(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrListLink(path: String?, attrnamespace: CInt, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrSetFile(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrSetLink(path: String?, attrnamespace: CInt, attrname: String?, data: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun fspacectl(fd: CInt, cmd: CInt, rqsr: COpaquePointer?, flags: CInt, rmsr: COpaquePointer?): CInt

public expect fun jail(jail: COpaquePointer?): CInt

public expect fun jailAttach(jid: CInt): CInt

public expect fun jailRemove(jid: CInt): CInt

public expect fun jailGet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt

public expect fun jailSet(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt

public expect fun getutxuser(user: String?): COpaquePointer?

public expect fun setutxdb(type: CInt, file: String?): CInt

public expect fun aioWaitcomplete(iocbp: COpaquePointer?, timeout: COpaquePointer?): SsizeT

public expect fun mqGetfdNp(mqd: MqdT): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgsnd(msqid: CInt, msgp: COpaquePointer?, msgsz: SizeT, msgflg: CInt): CInt

public expect fun cfmakesane(termios: COpaquePointer?)

public expect fun pdfork(fdp: COpaquePointer?, flags: CInt): PidT

public expect fun pdgetpid(fd: CInt, pidp: COpaquePointer?): CInt

public expect fun pdkill(fd: CInt, signum: CInt): CInt

public expect fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: COpaquePointer?): CInt

public expect fun uuidgen(store: COpaquePointer?, count: CInt): CInt

public expect fun thrKill(id: CLong, sig: CInt): CInt

public expect fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt

public expect fun thrSelf(tid: COpaquePointer?): CInt

public expect fun pthreadGetthreadidNp(): CInt

public expect fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt

public expect fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: COpaquePointer?): CInt

// sched.h linux compatibility api
public expect fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: COpaquePointer?): CInt

public expect fun schedGetcpu(): CInt

public expect fun pthreadMutexConsistent(mutex: COpaquePointer?): CInt

public expect fun pthreadMutexattrGetrobust(attr: COpaquePointer?, robust: COpaquePointer?): CInt

public expect fun pthreadMutexattrSetrobust(attr: COpaquePointer?, robust: CInt): CInt

public expect fun pthreadSpinInit(lock: COpaquePointer?, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: COpaquePointer?): CInt

public expect fun pthreadSpinLock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinTrylock(lock: COpaquePointer?): CInt

public expect fun pthreadSpinUnlock(lock: COpaquePointer?): CInt

public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun statfs(path: String?, buf: COpaquePointer?): CInt

public expect fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun xuname(nmln: CInt, buf: COpaquePointer?): CInt

public expect fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt): SsizeT

public expect fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: SizeT, flags: CInt, timeout: COpaquePointer?): SsizeT

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

public expect fun fhopen(fhp: COpaquePointer?, flags: CInt): CInt

public expect fun fhstat(fhp: COpaquePointer?, buf: COpaquePointer?): CInt

public expect fun fhstatfs(fhp: COpaquePointer?, buf: COpaquePointer?): CInt

public expect fun getfh(path: String?, fhp: COpaquePointer?): CInt

public expect fun lgetfh(path: String?, fhp: COpaquePointer?): CInt

public expect fun getfsstat(buf: COpaquePointer?, bufsize: CLong, mode: CInt): CInt

public expect fun getmntinfo(mntbufp: COpaquePointer?, mode: CInt): CInt

public expect fun mount(type: String?, dir: String?, flags: CInt, data: COpaquePointer?): CInt

public expect fun nmount(iov: COpaquePointer?, niov: CUint, flags: CInt): CInt

public expect fun setproctitle(fmt: String?, vararg variadicArgs: Long)

public expect fun rfork(flags: CInt): CInt

public expect fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt

public expect fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: COpaquePointer?): CInt

public expect fun cpuset(setid: COpaquePointer?): CInt

public expect fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: COpaquePointer?): CInt

public expect fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt

public expect fun capEnter(): CInt

public expect fun capGetmode(modep: COpaquePointer?): CInt

public expect fun capFcntlsGet(fd: CInt, fcntlrightsp: COpaquePointer?): CInt

public expect fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt

public expect fun capIoctlsGet(fd: CInt, cmds: COpaquePointer?, maxcmds: ULong): Long

public expect fun capIoctlsLimit(fd: CInt, cmds: COpaquePointer?, ncmds: ULong): CInt

public expect fun capRightsInit(version: CInt, rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer?

public expect fun capRightsGet(version: CInt, fd: CInt, rightsp: COpaquePointer?): CInt

public expect fun capRightsSet(rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer?

public expect fun capRightsClear(rights: COpaquePointer?, vararg variadicArgs: Long): COpaquePointer?

public expect fun capRightsIsSet(rights: COpaquePointer?, vararg variadicArgs: Long): Boolean

public expect fun capRightsIsValid(rights: COpaquePointer?): Boolean

public expect fun capRightsLimit(fd: CInt, rights: COpaquePointer?): CInt

public expect fun capRightsMerge(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer?

public expect fun capRightsRemove(dst: COpaquePointer?, src: COpaquePointer?): COpaquePointer?

public expect fun capRightsContains(big: COpaquePointer?, little: COpaquePointer?): Boolean

public expect fun capSandboxed(): Boolean

public expect fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer?

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLonglong): CInt

public expect fun fls(value: CInt): CInt

public expect fun flsl(value: CLong): CInt

public expect fun flsll(value: CLonglong): CInt

public expect fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: COpaquePointer?, opt: String?)

public expect fun mallctl(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun mallctlnametomib(name: String?, mibp: COpaquePointer?, miplen: COpaquePointer?): CInt

public expect fun mallctlbymib(mib: COpaquePointer?, mible: SizeT, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun mallocx(size: SizeT, flags: CInt): COpaquePointer?

public expect fun rallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt): COpaquePointer?

public expect fun xallocx(ptr: COpaquePointer?, size: SizeT, extra: SizeT, flags: CInt): SizeT

public expect fun sallocx(ptr: COpaquePointer?, flags: CInt): SizeT

public expect fun dallocx(ptr: COpaquePointer?, flags: CInt)

public expect fun sdallocx(ptr: COpaquePointer?, size: SizeT, flags: CInt)

public expect fun nallocx(size: SizeT, flags: CInt): SizeT

public expect fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: COpaquePointer?): CInt

public expect fun getpagesize(): CInt

public expect fun getpagesizes(pagesize: COpaquePointer?, nelem: CInt): CInt

public expect fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: COpaquePointer?): CInt

public expect fun strchrnul(s: String?, c: CInt): COpaquePointer?

public expect fun shmCreateLargepage(path: String?, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt

public expect fun shmRename(pathFrom: String?, pathTo: String?, flags: CInt): CInt

public expect fun memfdCreate(name: String?, flags: CUint): CInt

public expect fun setaudit(auditinfo: COpaquePointer?): CInt

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun eventfdRead(fd: CInt, value: COpaquePointer?): CInt

public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun elfAuxInfo(aux: CInt, buf: COpaquePointer?, buflen: CInt): CInt

public expect fun setproctitleFast(fmt: String?, vararg variadicArgs: Long)

public expect fun timingsafeBcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt

public expect fun timingsafeMemcmp(a: COpaquePointer?, b: COpaquePointer?, len: SizeT): CInt

public expect fun umtxOp(obj: COpaquePointer?, op: CInt, value: CUlong, uaddr: COpaquePointer?, uaddr2: COpaquePointer?): CInt

public expect fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt

public expect fun sctpBindx(s: CInt, addrs: COpaquePointer?, num: CInt, tpe: CInt): CInt

public expect fun sctpConnectx(s: CInt, addrs: COpaquePointer?, addrcnt: CInt, id: COpaquePointer?): CInt

public expect fun sctpGetaddrlen(family: SaFamilyT): CInt

public expect fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt

public expect fun sctpFreepaddrs(addrs: COpaquePointer?)

public expect fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: COpaquePointer?): CInt

public expect fun sctpFreeladdrs(addrs: COpaquePointer?)

public expect fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: COpaquePointer?, size: COpaquePointer?): CInt

public expect fun sctpSendv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, addrs: COpaquePointer?, addrcnt: CInt, info: COpaquePointer?, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT

public expect fun sctpRecvv(sd: CInt, iov: COpaquePointer?, iovcnt: CInt, from: COpaquePointer?, fromlen: COpaquePointer?, info: COpaquePointer?, infolen: COpaquePointer?, infotype: COpaquePointer?, flags: COpaquePointer?): SsizeT

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: COpaquePointer?): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: COpaquePointer?, oldValue: COpaquePointer?): CInt

public expect fun closefrom(lowfd: CInt)

public expect fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt

public expect fun execvpe(file: String?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt

public expect fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer?

public expect fun memstatStrerror(error: CInt): COpaquePointer?

public expect fun memstatMtlAlloc(): COpaquePointer?

public expect fun memstatMtlFirst(list: COpaquePointer?): COpaquePointer?

public expect fun memstatMtlNext(mtp: COpaquePointer?): COpaquePointer?

public expect fun memstatMtlFind(list: COpaquePointer?, allocator: CInt, name: String?): COpaquePointer?

public expect fun memstatMtlFree(list: COpaquePointer?)

public expect fun memstatMtlGeterror(list: COpaquePointer?): CInt

public expect fun memstatGetName(mtp: COpaquePointer?): COpaquePointer?

public expect fun kvmDpcpuSetcpu(kd: COpaquePointer?, cpu: CUint): CInt

public expect fun kvmGetargv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer?

public expect fun kvmGetcptime(kd: COpaquePointer?, cpTime: COpaquePointer?): CInt

public expect fun kvmGetenvv(kd: COpaquePointer?, p: COpaquePointer?, nchr: CInt): COpaquePointer?

public expect fun kvmGeterr(kd: COpaquePointer?): COpaquePointer?

public expect fun kvmGetmaxcpu(kd: COpaquePointer?): CInt

public expect fun kvmGetncpus(kd: COpaquePointer?): CInt

public expect fun kvmGetpcpu(kd: COpaquePointer?, cpu: CInt): COpaquePointer?

public expect fun kvmCounterU64Fetch(kd: COpaquePointer?, base: CUlong): ULong

public expect fun kvmGetswapinfo(kd: COpaquePointer?, info: COpaquePointer?, maxswap: CInt, flags: CInt): CInt

public expect fun kvmNative(kd: COpaquePointer?): CInt

public expect fun kvmNlist(kd: COpaquePointer?, nl: COpaquePointer?): CInt

public expect fun kvmNlist2(kd: COpaquePointer?, nl: COpaquePointer?): CInt

public expect fun kvmReadZpcpu(kd: COpaquePointer?, base: CUlong, buf: COpaquePointer?, size: SizeT, cpu: CInt): SsizeT

public expect fun kvmRead2(kd: COpaquePointer?, addr: KvaddrT, buf: COpaquePointer?, nbytes: SizeT): SsizeT

public expect fun extattrNamespaceToString(attrnamespace: CInt, string: COpaquePointer?): CInt

public expect fun extattrStringToNamespace(string: String?, attrnamespace: COpaquePointer?): CInt

public expect fun realhostname(host: COpaquePointer?, hsize: SizeT, ip: COpaquePointer?): CInt

public expect fun realhostnameSa(host: COpaquePointer?, hsize: SizeT, addr: COpaquePointer?, addrlen: CInt): CInt

public expect fun kldIsloaded(name: String?): CInt

public expect fun kldLoad(name: String?): CInt

public expect fun kinfoGetvmmap(pid: PidT, cntp: COpaquePointer?): COpaquePointer?

public expect fun hexdump(ptr: COpaquePointer?, length: CInt, hdr: String?, flags: CInt)

public expect fun humanizeNumber(buf: COpaquePointer?, len: SizeT, number: Long, suffix: String?, scale: CInt, flags: CInt): CInt

public expect fun flopen(path: String?, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun flopenat(fd: CInt, path: String?, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun getlocalbase(): COpaquePointer?

public expect fun pidfileOpen(path: String?, mode: ModeT, pidptr: COpaquePointer?): COpaquePointer?

public expect fun pidfileWrite(path: COpaquePointer?): CInt

public expect fun pidfileClose(path: COpaquePointer?): CInt

public expect fun pidfileRemove(path: COpaquePointer?): CInt

public expect fun pidfileFileno(path: COpaquePointer?): CInt

public expect fun procstatOpenSysctl(): COpaquePointer?

public expect fun procstatGetfiles(procstat: COpaquePointer?, kp: COpaquePointer?, mmapped: CInt): COpaquePointer?

public expect fun procstatFreefiles(procstat: COpaquePointer?, head: COpaquePointer?)

public expect fun procstatGetprocs(procstat: COpaquePointer?, what: CInt, arg: CInt, count: COpaquePointer?): COpaquePointer?

public expect fun procstatFreeprocs(procstat: COpaquePointer?, p: COpaquePointer?)

public expect fun procstatGetvmmap(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer?

public expect fun procstatFreevmmap(procstat: COpaquePointer?, vmmap: COpaquePointer?)

public expect fun procstatClose(procstat: COpaquePointer?)

public expect fun procstatFreeargv(procstat: COpaquePointer?)

public expect fun procstatFreeenvv(procstat: COpaquePointer?)

public expect fun procstatFreegroups(procstat: COpaquePointer?, groups: COpaquePointer?)

public expect fun procstatFreeptlwpinfo(procstat: COpaquePointer?, pl: COpaquePointer?)

public expect fun procstatGetargv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer?

public expect fun procstatGetenvv(procstat: COpaquePointer?, kp: COpaquePointer?, nchr: SizeT): COpaquePointer?

public expect fun procstatGetgroups(procstat: COpaquePointer?, kp: COpaquePointer?, count: COpaquePointer?): COpaquePointer?

public expect fun procstatGetosrel(procstat: COpaquePointer?, kp: COpaquePointer?, osrelp: COpaquePointer?): CInt

public expect fun procstatGetpathname(procstat: COpaquePointer?, kp: COpaquePointer?, pathname: COpaquePointer?, maxlen: SizeT): CInt

public expect fun procstatGetrlimit(procstat: COpaquePointer?, kp: COpaquePointer?, which: CInt, rlimit: COpaquePointer?): CInt

public expect fun procstatGetumask(procstat: COpaquePointer?, kp: COpaquePointer?, maskp: COpaquePointer?): CInt

public expect fun procstatOpenCore(filename: String?): COpaquePointer?

public expect fun procstatOpenKvm(nlistf: String?, memf: String?): COpaquePointer?

public expect fun procstatGetSocketInfo(proc: COpaquePointer?, fst: COpaquePointer?, sock: COpaquePointer?, errbuf: COpaquePointer?): CInt

public expect fun procstatGetVnodeInfo(proc: COpaquePointer?, fst: COpaquePointer?, vn: COpaquePointer?, errbuf: COpaquePointer?): CInt

public expect fun procstatGetPtsInfo(proc: COpaquePointer?, fst: COpaquePointer?, pts: COpaquePointer?, errbuf: COpaquePointer?): CInt

public expect fun procstatGetShmInfo(proc: COpaquePointer?, fst: COpaquePointer?, shm: COpaquePointer?, errbuf: COpaquePointer?): CInt

public expect fun timerCreate(clockId: ClockidT, evp: COpaquePointer?, timerid: COpaquePointer?): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: COpaquePointer?): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, value: COpaquePointer?, ovalue: COpaquePointer?): CInt

public expect fun devstatGetnumdevs(kd: COpaquePointer?): CInt

public expect fun devstatGetgeneration(kd: COpaquePointer?): CLong

public expect fun devstatGetversion(kd: COpaquePointer?): CInt

public expect fun devstatCheckversion(kd: COpaquePointer?): CInt

public expect fun devstatSelectdevs(devSelect: COpaquePointer?, numSelected: COpaquePointer?, numSelections: COpaquePointer?, selectGeneration: COpaquePointer?, currentGeneration: CLong, devices: COpaquePointer?, numdevs: CInt, matches: COpaquePointer?, numMatches: CInt, devSelections: COpaquePointer?, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt

public expect fun devstatBuildmatch(matchStr: COpaquePointer?, matches: COpaquePointer?, numMatches: COpaquePointer?): CInt
