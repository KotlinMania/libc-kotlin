package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.GidT
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
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface MallocStatsPrintWriteCbCallback {
    public operator fun invoke(arg0: MutPtr, arg1: ConstPtr)
}

public fun mapAligned(a: CInt): CInt = a shl 24

public fun align(p: Int): Int = (p + ALIGNBYTES) and ALIGNBYTES.inv()

// sys/cpuset.h
public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(((MutPtr(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgLen(length: CUint): CUint = align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsg.rawAddress.toInt() + align(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next > max) {
        MutPtr(0L)
    } else {
        MutPtr((cmsg.rawAddress.toInt() + align(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    }
}

public fun cmsgSpace(length: CUint): CUint = (align(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) + align(length.toInt())).toUInt()

public fun mallocxAlign(lg: CUint): CInt = ffsl(lg.toLong() - 1L)

public fun mallocxTcache(tc: CInt): CInt = (tc + 2) shl 8

public fun mallocxArena(a: CInt): CInt = (a + 1) shl 20

public fun sockcredsize(ngrps: Int): Int {
    val ngrps1 =
        if (ngrps > 0) {
            ngrps - 1
        } else {
            0
        }
    return sizeOf<Sockcred>(typeLayoutT = Sockcred.typeLayout()) + sizeOf<GidT>(typeLayoutT = PrimitiveLayouts.U16) * ngrps1
}

public fun uname(buf: MutPtr): CInt = xuname(256, MutPtr(buf.rawAddress, buf.rawMeta))

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
    val bitsetBits = 8 * sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64)
    val (idx, offset) = Pair(cpu / bitsetBits, cpu % bitsetBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1L shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpusetT) {
    val bitsetBits = 8 * sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64)
    val (idx, offset) = Pair(cpu / bitsetBits, cpu % bitsetBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1L shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpusetT): Boolean {
    val bitsetBits = 8 * sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64)
    val (idx, offset) = Pair(cpu / bitsetBits, cpu % bitsetBits)
    return 0L != cpuset.bits[idx] and (1L shl offset)
}

public fun cpuCount(cpuset: CpusetT): CInt {
    var s: UInt = 0u
    val cpusetSize = sizeOf<CpusetT>(typeLayoutT = CpusetT.typeLayout())
    val bitsetSize = sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64)
    for (i in ((cpuset.bits).slice(0 until (cpusetSize / bitsetSize)))) {
        s += i.countOneBits().toUInt()
    }
    return s.toInt()
}

public fun sockcred2size(ngrps: Int): Int {
    val ngrps1 =
        if (ngrps > 0) {
            ngrps - 1
        } else {
            0
        }
    return sizeOf<Sockcred2>(typeLayoutT = Sockcred2.typeLayout()) + sizeOf<GidT>(typeLayoutT = PrimitiveLayouts.U16) * ngrps1
}

public fun protMax(x: CInt): CInt = x shl 16

public fun protMaxExtract(x: CInt): CInt = (x shr 16) and (PROT_READ or PROT_WRITE or PROT_EXEC)

public fun wifsignaled(status: CInt): Boolean = (status and 127) != 127 && (status and 127) != 0 && status != 0x13

public fun invalidSinfoFlag(x: CInt): Boolean = (x) and 0xfffffff0.toInt() and (SCTP_EOF or SCTP_ABORT or SCTP_UNORDERED or SCTP_ADDR_OVER or SCTP_SENDALL or SCTP_EOR or SCTP_SACK_IMMEDIATELY).inv() != 0

public fun prSctpPolicy(x: CInt): CInt = x and 0x0f

public fun prSctpEnabled(x: CInt): Boolean = prSctpPolicy(x) != SCTP_PR_SCTP_NONE && prSctpPolicy(x) != SCTP_PR_SCTP_ALL

public fun prSctpTtlEnabled(x: CInt): Boolean = prSctpPolicy(x) == SCTP_PR_SCTP_TTL

public fun prSctpBufEnabled(x: CInt): Boolean = prSctpPolicy(x) == SCTP_PR_SCTP_BUF

public fun prSctpRtxEnabled(x: CInt): Boolean = prSctpPolicy(x) == SCTP_PR_SCTP_RTX

public fun prSctpInvalidPolicy(x: CInt): Boolean = prSctpPolicy(x) > SCTP_PR_SCTP_MAX

public fun prSctpValidPolicy(x: CInt): Boolean = prSctpPolicy(x) <= SCTP_PR_SCTP_MAX

public expect fun fhlink(fhp: MutPtr, to: ConstPtr): CInt

public expect fun fhlinkat(fhp: MutPtr, tofd: CInt, to: ConstPtr): CInt

public expect fun fhreadlink(fhp: MutPtr, buf: MutPtr, bufsize: SizeT): CInt

public expect fun getfhat(fd: CInt, path: MutPtr, fhp: MutPtr, flag: CInt): CInt

public expect fun error(): MutPtr

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt

public expect fun aioError(aiocbp: ConstPtr): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr): CInt

public expect fun aioRead(aiocbp: MutPtr): CInt

public expect fun aioReadv(aiocbp: MutPtr): CInt

public expect fun aioReturn(aiocbp: MutPtr): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt

public expect fun aioWrite(aiocbp: MutPtr): CInt

public expect fun aioWritev(aiocbp: MutPtr): CInt

public expect fun copyFileRange(infd: CInt, inoffp: MutPtr, outfd: CInt, outoffp: MutPtr, len: SizeT, flags: CUint): SsizeT

public expect fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr, len: CInt): MutPtr

public expect fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr): CInt

public expect fun extattrDeleteFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt

public expect fun extattrDeleteLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr): CInt

public expect fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrGetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrGetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrListFile(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrListLink(path: ConstPtr, attrnamespace: CInt, data: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT

public expect fun extattrSetFile(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT

public expect fun extattrSetLink(path: ConstPtr, attrnamespace: CInt, attrname: ConstPtr, data: ConstPtr, nbytes: SizeT): SsizeT

public expect fun fspacectl(fd: CInt, cmd: CInt, rqsr: ConstPtr, flags: CInt, rmsr: MutPtr): CInt

public expect fun jail(jail: MutPtr): CInt

public expect fun jailAttach(jid: CInt): CInt

public expect fun jailRemove(jid: CInt): CInt

public expect fun jailGet(iov: MutPtr, niov: CUint, flags: CInt): CInt

public expect fun jailSet(iov: MutPtr, niov: CUint, flags: CInt): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt

public expect fun getutxuser(user: ConstPtr): MutPtr

public expect fun setutxdb(type: CInt, file: ConstPtr): CInt

public expect fun aioWaitcomplete(iocbp: MutPtr, timeout: MutPtr): SsizeT

public expect fun mqGetfdNp(mqd: MqdT): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun ftok(pathname: ConstPtr, projId: CInt): KeyT

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr

public expect fun shmdt(shmaddr: ConstPtr): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt

public expect fun cfmakesane(termios: MutPtr)

public expect fun pdfork(fdp: MutPtr, flags: CInt): PidT

public expect fun pdgetpid(fd: CInt, pidp: MutPtr): CInt

public expect fun pdkill(fd: CInt, signum: CInt): CInt

public expect fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: MutPtr): CInt

public expect fun uuidgen(store: MutPtr, count: CInt): CInt

public expect fun thrKill(id: CLong, sig: CInt): CInt

public expect fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt

public expect fun thrSelf(tid: MutPtr): CInt

public expect fun pthreadGetthreadidNp(): CInt

public expect fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: MutPtr): CInt

public expect fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: ConstPtr): CInt

// sched.h linux compatibility api
public expect fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: MutPtr): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: ConstPtr): CInt

public expect fun schedGetcpu(): CInt

public expect fun pthreadMutexConsistent(mutex: MutPtr): CInt

public expect fun pthreadMutexattrGetrobust(attr: MutPtr, robust: MutPtr): CInt

public expect fun pthreadMutexattrSetrobust(attr: MutPtr, robust: CInt): CInt

public expect fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr): CInt

public expect fun pthreadSpinLock(lock: MutPtr): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr): CInt

public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt

public expect fun statfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun xuname(nmln: CInt, buf: MutPtr): CInt

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: SizeT, flags: CInt): SsizeT

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: SizeT, flags: CInt, timeout: ConstPtr): SsizeT

public expect fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr

public expect fun fhopen(fhp: ConstPtr, flags: CInt): CInt

public expect fun fhstat(fhp: ConstPtr, buf: MutPtr): CInt

public expect fun fhstatfs(fhp: ConstPtr, buf: MutPtr): CInt

public expect fun getfh(path: ConstPtr, fhp: MutPtr): CInt

public expect fun lgetfh(path: ConstPtr, fhp: MutPtr): CInt

public expect fun getfsstat(buf: MutPtr, bufsize: CLong, mode: CInt): CInt

public expect fun getmntinfo(mntbufp: MutPtr, mode: CInt): CInt

public expect fun mount(type: ConstPtr, dir: ConstPtr, flags: CInt, data: MutPtr): CInt

public expect fun nmount(iov: MutPtr, niov: CUint, flags: CInt): CInt

public expect fun setproctitle(fmt: ConstPtr, vararg variadicArgs: Long)

public expect fun rfork(flags: CInt): CInt

public expect fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr): CInt

public expect fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr): CInt

public expect fun cpuset(setid: MutPtr): CInt

public expect fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: MutPtr): CInt

public expect fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt

public expect fun capEnter(): CInt

public expect fun capGetmode(modep: MutPtr): CInt

public expect fun capFcntlsGet(fd: CInt, fcntlrightsp: MutPtr): CInt

public expect fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt

public expect fun capIoctlsGet(fd: CInt, cmds: MutPtr, maxcmds: ULong): Long

public expect fun capIoctlsLimit(fd: CInt, cmds: ConstPtr, ncmds: ULong): CInt

public expect fun capRightsInit(version: CInt, rights: MutPtr, vararg variadicArgs: Long): MutPtr

public expect fun capRightsGet(version: CInt, fd: CInt, rightsp: MutPtr): CInt

public expect fun capRightsSet(rights: MutPtr, vararg variadicArgs: Long): MutPtr

public expect fun capRightsClear(rights: MutPtr, vararg variadicArgs: Long): MutPtr

public expect fun capRightsIsSet(rights: ConstPtr, vararg variadicArgs: Long): Boolean

public expect fun capRightsIsValid(rights: ConstPtr): Boolean

public expect fun capRightsLimit(fd: CInt, rights: ConstPtr): CInt

public expect fun capRightsMerge(dst: MutPtr, src: ConstPtr): MutPtr

public expect fun capRightsRemove(dst: MutPtr, src: ConstPtr): MutPtr

public expect fun capRightsContains(big: ConstPtr, little: ConstPtr): Boolean

public expect fun capSandboxed(): Boolean

public expect fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLonglong): CInt

public expect fun fls(value: CInt): CInt

public expect fun flsl(value: CLong): CInt

public expect fun flsll(value: CLonglong): CInt

public expect fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: MutPtr, opt: ConstPtr)

public expect fun mallctl(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt

public expect fun mallctlnametomib(name: ConstPtr, mibp: MutPtr, miplen: MutPtr): CInt

public expect fun mallctlbymib(mib: ConstPtr, mible: SizeT, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt

public expect fun mallocx(size: SizeT, flags: CInt): MutPtr

public expect fun rallocx(ptr: MutPtr, size: SizeT, flags: CInt): MutPtr

public expect fun xallocx(ptr: MutPtr, size: SizeT, extra: SizeT, flags: CInt): SizeT

public expect fun sallocx(ptr: ConstPtr, flags: CInt): SizeT

public expect fun dallocx(ptr: MutPtr, flags: CInt)

public expect fun sdallocx(ptr: MutPtr, size: SizeT, flags: CInt)

public expect fun nallocx(size: SizeT, flags: CInt): SizeT

public expect fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr): CInt

public expect fun getpagesize(): CInt

public expect fun getpagesizes(pagesize: MutPtr, nelem: CInt): CInt

public expect fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: MutPtr): CInt

public expect fun strchrnul(s: ConstPtr, c: CInt): MutPtr

public expect fun shmCreateLargepage(path: ConstPtr, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt

public expect fun shmRename(pathFrom: ConstPtr, pathTo: ConstPtr, flags: CInt): CInt

public expect fun memfdCreate(name: ConstPtr, flags: CUint): CInt

public expect fun setaudit(auditinfo: ConstPtr): CInt

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun eventfdRead(fd: CInt, value: MutPtr): CInt

public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun elfAuxInfo(aux: CInt, buf: MutPtr, buflen: CInt): CInt

public expect fun setproctitleFast(fmt: ConstPtr, vararg variadicArgs: Long)

public expect fun timingsafeBcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt

public expect fun timingsafeMemcmp(a: ConstPtr, b: ConstPtr, len: SizeT): CInt

public expect fun umtxOp(obj: MutPtr, op: CInt, value: CUlong, uaddr: MutPtr, uaddr2: MutPtr): CInt

public expect fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt

public expect fun sctpBindx(s: CInt, addrs: MutPtr, num: CInt, tpe: CInt): CInt

public expect fun sctpConnectx(s: CInt, addrs: ConstPtr, addrcnt: CInt, id: MutPtr): CInt

public expect fun sctpGetaddrlen(family: SaFamilyT): CInt

public expect fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr): CInt

public expect fun sctpFreepaddrs(addrs: MutPtr)

public expect fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr): CInt

public expect fun sctpFreeladdrs(addrs: MutPtr)

public expect fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: MutPtr, size: MutPtr): CInt

public expect fun sctpSendv(sd: CInt, iov: ConstPtr, iovcnt: CInt, addrs: MutPtr, addrcnt: CInt, info: MutPtr, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT

public expect fun sctpRecvv(sd: CInt, iov: ConstPtr, iovcnt: CInt, from: MutPtr, fromlen: MutPtr, info: MutPtr, infolen: MutPtr, infotype: MutPtr, flags: MutPtr): SsizeT

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: MutPtr): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun closefrom(lowfd: CInt)

public expect fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt

public expect fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt

public expect fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr

public expect fun memstatStrerror(error: CInt): ConstPtr

public expect fun memstatMtlAlloc(): MutPtr

public expect fun memstatMtlFirst(list: MutPtr): MutPtr

public expect fun memstatMtlNext(mtp: MutPtr): MutPtr

public expect fun memstatMtlFind(list: MutPtr, allocator: CInt, name: ConstPtr): MutPtr

public expect fun memstatMtlFree(list: MutPtr)

public expect fun memstatMtlGeterror(list: MutPtr): CInt

public expect fun memstatGetName(mtp: ConstPtr): ConstPtr

public expect fun kvmDpcpuSetcpu(kd: MutPtr, cpu: CUint): CInt

public expect fun kvmGetargv(kd: MutPtr, p: ConstPtr, nchr: CInt): MutPtr

public expect fun kvmGetcptime(kd: MutPtr, cpTime: MutPtr): CInt

public expect fun kvmGetenvv(kd: MutPtr, p: ConstPtr, nchr: CInt): MutPtr

public expect fun kvmGeterr(kd: MutPtr): MutPtr

public expect fun kvmGetmaxcpu(kd: MutPtr): CInt

public expect fun kvmGetncpus(kd: MutPtr): CInt

public expect fun kvmGetpcpu(kd: MutPtr, cpu: CInt): MutPtr

public expect fun kvmCounterU64Fetch(kd: MutPtr, base: CUlong): ULong

public expect fun kvmGetswapinfo(kd: MutPtr, info: MutPtr, maxswap: CInt, flags: CInt): CInt

public expect fun kvmNative(kd: MutPtr): CInt

public expect fun kvmNlist(kd: MutPtr, nl: MutPtr): CInt

public expect fun kvmNlist2(kd: MutPtr, nl: MutPtr): CInt

public expect fun kvmReadZpcpu(kd: MutPtr, base: CUlong, buf: MutPtr, size: SizeT, cpu: CInt): SsizeT

public expect fun kvmRead2(kd: MutPtr, addr: KvaddrT, buf: MutPtr, nbytes: SizeT): SsizeT

public expect fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr): CInt

public expect fun extattrStringToNamespace(string: ConstPtr, attrnamespace: MutPtr): CInt

public expect fun realhostname(host: MutPtr, hsize: SizeT, ip: ConstPtr): CInt

public expect fun realhostnameSa(host: MutPtr, hsize: SizeT, addr: MutPtr, addrlen: CInt): CInt

public expect fun kldIsloaded(name: ConstPtr): CInt

public expect fun kldLoad(name: ConstPtr): CInt

public expect fun kinfoGetvmmap(pid: PidT, cntp: MutPtr): MutPtr

public expect fun hexdump(ptr: ConstPtr, length: CInt, hdr: ConstPtr, flags: CInt)

public expect fun humanizeNumber(buf: MutPtr, len: SizeT, number: Long, suffix: ConstPtr, scale: CInt, flags: CInt): CInt

public expect fun flopen(path: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun flopenat(fd: CInt, path: ConstPtr, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun getlocalbase(): ConstPtr

public expect fun pidfileOpen(path: ConstPtr, mode: ModeT, pidptr: MutPtr): MutPtr

public expect fun pidfileWrite(path: MutPtr): CInt

public expect fun pidfileClose(path: MutPtr): CInt

public expect fun pidfileRemove(path: MutPtr): CInt

public expect fun pidfileFileno(path: ConstPtr): CInt

public expect fun procstatOpenSysctl(): MutPtr

public expect fun procstatGetfiles(procstat: MutPtr, kp: MutPtr, mmapped: CInt): MutPtr

public expect fun procstatFreefiles(procstat: MutPtr, head: MutPtr)

public expect fun procstatGetprocs(procstat: MutPtr, what: CInt, arg: CInt, count: MutPtr): MutPtr

public expect fun procstatFreeprocs(procstat: MutPtr, p: MutPtr)

public expect fun procstatGetvmmap(procstat: MutPtr, kp: MutPtr, count: MutPtr): MutPtr

public expect fun procstatFreevmmap(procstat: MutPtr, vmmap: MutPtr)

public expect fun procstatClose(procstat: MutPtr)

public expect fun procstatFreeargv(procstat: MutPtr)

public expect fun procstatFreeenvv(procstat: MutPtr)

public expect fun procstatFreegroups(procstat: MutPtr, groups: MutPtr)

public expect fun procstatFreeptlwpinfo(procstat: MutPtr, pl: MutPtr)

public expect fun procstatGetargv(procstat: MutPtr, kp: MutPtr, nchr: SizeT): MutPtr

public expect fun procstatGetenvv(procstat: MutPtr, kp: MutPtr, nchr: SizeT): MutPtr

public expect fun procstatGetgroups(procstat: MutPtr, kp: MutPtr, count: MutPtr): MutPtr

public expect fun procstatGetosrel(procstat: MutPtr, kp: MutPtr, osrelp: MutPtr): CInt

public expect fun procstatGetpathname(procstat: MutPtr, kp: MutPtr, pathname: MutPtr, maxlen: SizeT): CInt

public expect fun procstatGetrlimit(procstat: MutPtr, kp: MutPtr, which: CInt, rlimit: MutPtr): CInt

public expect fun procstatGetumask(procstat: MutPtr, kp: MutPtr, maskp: MutPtr): CInt

public expect fun procstatOpenCore(filename: ConstPtr): MutPtr

public expect fun procstatOpenKvm(nlistf: ConstPtr, memf: ConstPtr): MutPtr

public expect fun procstatGetSocketInfo(proc: MutPtr, fst: MutPtr, sock: MutPtr, errbuf: MutPtr): CInt

public expect fun procstatGetVnodeInfo(proc: MutPtr, fst: MutPtr, vn: MutPtr, errbuf: MutPtr): CInt

public expect fun procstatGetPtsInfo(proc: MutPtr, fst: MutPtr, pts: MutPtr, errbuf: MutPtr): CInt

public expect fun procstatGetShmInfo(proc: MutPtr, fst: MutPtr, shm: MutPtr, errbuf: MutPtr): CInt

public expect fun timerCreate(clockId: ClockidT, evp: MutPtr, timerid: MutPtr): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: MutPtr): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr, ovalue: MutPtr): CInt

public expect fun devstatGetnumdevs(kd: MutPtr): CInt

public expect fun devstatGetgeneration(kd: MutPtr): CLong

public expect fun devstatGetversion(kd: MutPtr): CInt

public expect fun devstatCheckversion(kd: MutPtr): CInt

public expect fun devstatSelectdevs(devSelect: MutPtr, numSelected: MutPtr, numSelections: MutPtr, selectGeneration: MutPtr, currentGeneration: CLong, devices: MutPtr, numdevs: CInt, matches: MutPtr, numMatches: CInt, devSelections: MutPtr, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt

public expect fun devstatBuildmatch(matchStr: MutPtr, matches: MutPtr, numMatches: MutPtr): CInt
