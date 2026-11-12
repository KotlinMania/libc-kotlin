package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SaFamilyT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.cmsgFirsthdr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.InAddr
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KeyT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.ModeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PROT_EXEC
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PROT_READ
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PROT_WRITE
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.PthreadMutexattrT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Rtprio
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.SiginfoT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.Termios
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.aarch64.ALIGNBYTES
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.DevT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.KinfoProc
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.ShmidDs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Statfs
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.Vnstat
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11.b64.Stat
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface MallocStatsPrintWriteCbCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>, arg1: ConstPtr<CChar>)
}

public fun mapAligned(a: CInt): CInt = a shl 24

public fun align(p: Int): Int = (p + ALIGNBYTES) and ALIGNBYTES.inv()

// sys/cpuset.h
public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr(((MutPtr<CUchar>(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>()))).toLong() * (ObjectSlotLayout<CUchar>()).strideBytes))

public fun cmsgLen(length: CUint): CUint = align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>())).toUInt() + length

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val next = cmsg.rawAddress.toInt() + align(((ObjectSlotLayout<Cmsghdr>()).readNative((cmsg).rawAddress).cmsgLen).toInt()) + align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>()))
    val max = ((ObjectSlotLayout<Msghdr>()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((ObjectSlotLayout<Msghdr>()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next > max) {
        MutPtr<Cmsghdr>(0L)
    } else {
        MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + align(((ObjectSlotLayout<Cmsghdr>()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    }
}

public fun cmsgSpace(length: CUint): CUint = (align(sizeOf<Cmsghdr>(typeLayoutT = ObjectSlotLayout<Cmsghdr>())) + align(length.toInt())).toUInt()

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
    return sizeOf<Sockcred>(typeLayoutT = Sockcred.typeLayout()) + sizeOf<GidT>(typeLayoutT = ObjectSlotLayout<GidT>()) * ngrps1
}

public fun uname(buf: MutPtr<Utsname>): CInt = xuname(256, MutPtr<CVoid>(buf.rawAddress, buf.rawMeta))

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
    val bitsetBits = 8 * sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>())
    val (idx, offset) = Pair(cpu / bitsetBits, cpu % bitsetBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1L shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpusetT) {
    val bitsetBits = 8 * sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>())
    val (idx, offset) = Pair(cpu / bitsetBits, cpu % bitsetBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1L shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpusetT): Boolean {
    val bitsetBits = 8 * sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>())
    val (idx, offset) = Pair(cpu / bitsetBits, cpu % bitsetBits)
    return 0L != cpuset.bits[idx] and (1L shl offset)
}

public fun cpuCount(cpuset: CpusetT): CInt {
    var s: UInt = 0u
    val cpusetSize = sizeOf<CpusetT>(typeLayoutT = CpusetT.typeLayout())
    val bitsetSize = sizeOf<CLong>(typeLayoutT = ObjectSlotLayout<CLong>())
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
    return sizeOf<Sockcred2>(typeLayoutT = Sockcred2.typeLayout()) + sizeOf<GidT>(typeLayoutT = ObjectSlotLayout<GidT>()) * ngrps1
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

public expect fun fhlink(fhp: MutPtr<FhandleT>, to: ConstPtr<CChar>): CInt

public expect fun fhlinkat(fhp: MutPtr<FhandleT>, tofd: CInt, to: ConstPtr<CChar>): CInt

public expect fun fhreadlink(fhp: MutPtr<FhandleT>, buf: MutPtr<CChar>, bufsize: SizeT): CInt

public expect fun getfhat(fd: CInt, path: MutPtr<CChar>, fhp: MutPtr<Fhandle>, flag: CInt): CInt

public expect fun error(): MutPtr<CInt>

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioError(aiocbp: ConstPtr<Aiocb>): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioRead(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioReadv(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioWritev(aiocbp: MutPtr<Aiocb>): CInt

public expect fun copyFileRange(infd: CInt, inoffp: MutPtr<OffT>, outfd: CInt, outoffp: MutPtr<OffT>, len: SizeT, flags: CUint): SsizeT

public expect fun devnameR(dev: DevT, mode: ModeT, buf: MutPtr<CChar>, len: CInt): MutPtr<CChar>

public expect fun extattrDeleteFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt

public expect fun extattrDeleteFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt

public expect fun extattrDeleteLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>): CInt

public expect fun extattrGetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrGetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrGetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrListFd(fd: CInt, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrListFile(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrListLink(path: ConstPtr<CChar>, attrnamespace: CInt, data: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrSetFd(fd: CInt, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrSetFile(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrSetLink(path: ConstPtr<CChar>, attrnamespace: CInt, attrname: ConstPtr<CChar>, data: ConstPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun fspacectl(fd: CInt, cmd: CInt, rqsr: ConstPtr<SpacectlRange>, flags: CInt, rmsr: MutPtr<SpacectlRange>): CInt

public expect fun jail(jail: MutPtr<Jail>): CInt

public expect fun jailAttach(jid: CInt): CInt

public expect fun jailRemove(jid: CInt): CInt

public expect fun jailGet(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt

public expect fun jailSet(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt

public expect fun getutxuser(user: ConstPtr<CChar>): MutPtr<Utmpx>

public expect fun setutxdb(type: CInt, file: ConstPtr<CChar>): CInt

public expect fun aioWaitcomplete(iocbp: MutPtr<MutPtr<Aiocb>>, timeout: MutPtr<Timespec>): SsizeT

public expect fun mqGetfdNp(mqd: MqdT): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid>

public expect fun shmdt(shmaddr: ConstPtr<CVoid>): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt

public expect fun cfmakesane(termios: MutPtr<Termios>)

public expect fun pdfork(fdp: MutPtr<CInt>, flags: CInt): PidT

public expect fun pdgetpid(fd: CInt, pidp: MutPtr<PidT>): CInt

public expect fun pdkill(fd: CInt, signum: CInt): CInt

public expect fun rtprioThread(function: CInt, lwpid: LwpidT, rtp: MutPtr<Rtprio>): CInt

public expect fun uuidgen(store: MutPtr<Uuid>, count: CInt): CInt

public expect fun thrKill(id: CLong, sig: CInt): CInt

public expect fun thrKill2(pid: PidT, id: CLong, sig: CInt): CInt

public expect fun thrSelf(tid: MutPtr<CLong>): CInt

public expect fun pthreadGetthreadidNp(): CInt

public expect fun pthreadGetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: MutPtr<CpusetT>): CInt

public expect fun pthreadSetaffinityNp(td: PthreadT, cpusetsize: SizeT, cpusetp: ConstPtr<CpusetT>): CInt

// sched.h linux compatibility api
public expect fun schedGetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: MutPtr<CpusetT>): CInt

public expect fun schedSetaffinity(pid: PidT, cpusetsz: SizeT, cpuset: ConstPtr<CpusetT>): CInt

public expect fun schedGetcpu(): CInt

public expect fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexattrGetrobust(attr: MutPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt

public expect fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt

public expect fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt

public expect fun dup3(src: CInt, dst: CInt, flags: CInt): CInt

public expect fun xuname(nmln: CInt, buf: MutPtr<CVoid>): CInt

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: SizeT, flags: CInt): SsizeT

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: SizeT, flags: CInt, timeout: ConstPtr<Timespec>): SsizeT

public expect fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid>

public expect fun fhopen(fhp: ConstPtr<FhandleT>, flags: CInt): CInt

public expect fun fhstat(fhp: ConstPtr<Fhandle>, buf: MutPtr<Stat>): CInt

public expect fun fhstatfs(fhp: ConstPtr<FhandleT>, buf: MutPtr<Statfs>): CInt

public expect fun getfh(path: ConstPtr<CChar>, fhp: MutPtr<FhandleT>): CInt

public expect fun lgetfh(path: ConstPtr<CChar>, fhp: MutPtr<FhandleT>): CInt

public expect fun getfsstat(buf: MutPtr<Statfs>, bufsize: CLong, mode: CInt): CInt

public expect fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, mode: CInt): CInt

public expect fun mount(type: ConstPtr<CChar>, dir: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>): CInt

public expect fun nmount(iov: MutPtr<Iovec>, niov: CUint, flags: CInt): CInt

public expect fun setproctitle(fmt: ConstPtr<CChar>, vararg variadicArgs: Long)

public expect fun rfork(flags: CInt): CInt

public expect fun cpusetGetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<CpusetT>): CInt

public expect fun cpusetSetaffinity(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<CpusetT>): CInt

public expect fun cpuset(setid: MutPtr<CpusetidT>): CInt

public expect fun cpusetGetid(level: CpulevelT, which: CpuwhichT, id: IdT, setid: MutPtr<CpusetidT>): CInt

public expect fun cpusetSetid(which: CpuwhichT, id: IdT, setid: CpusetidT): CInt

public expect fun capEnter(): CInt

public expect fun capGetmode(modep: MutPtr<CUint>): CInt

public expect fun capFcntlsGet(fd: CInt, fcntlrightsp: MutPtr<UInt>): CInt

public expect fun capFcntlsLimit(fd: CInt, fcntlrights: UInt): CInt

public expect fun capIoctlsGet(fd: CInt, cmds: MutPtr<ULong>, maxcmds: ULong): Long

public expect fun capIoctlsLimit(fd: CInt, cmds: ConstPtr<ULong>, ncmds: ULong): CInt

public expect fun capRightsInit(version: CInt, rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT>

public expect fun capRightsGet(version: CInt, fd: CInt, rightsp: MutPtr<CapRightsT>): CInt

public expect fun capRightsSet(rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT>

public expect fun capRightsClear(rights: MutPtr<CapRightsT>, vararg variadicArgs: Long): MutPtr<CapRightsT>

public expect fun capRightsIsSet(rights: ConstPtr<CapRightsT>, vararg variadicArgs: Long): Boolean

public expect fun capRightsIsValid(rights: ConstPtr<CapRightsT>): Boolean

public expect fun capRightsLimit(fd: CInt, rights: ConstPtr<CapRightsT>): CInt

public expect fun capRightsMerge(dst: MutPtr<CapRightsT>, src: ConstPtr<CapRightsT>): MutPtr<CapRightsT>

public expect fun capRightsRemove(dst: MutPtr<CapRightsT>, src: ConstPtr<CapRightsT>): MutPtr<CapRightsT>

public expect fun capRightsContains(big: ConstPtr<CapRightsT>, little: ConstPtr<CapRightsT>): Boolean

public expect fun capSandboxed(): Boolean

public expect fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLonglong): CInt

public expect fun fls(value: CInt): CInt

public expect fun flsl(value: CLong): CInt

public expect fun flsll(value: CLonglong): CInt

public expect fun mallocStatsPrint(writeCb: MallocStatsPrintWriteCbCallback, cbopaque: MutPtr<CVoid>, opt: ConstPtr<CChar>)

public expect fun mallctl(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt

public expect fun mallctlnametomib(name: ConstPtr<CChar>, mibp: MutPtr<SizeT>, miplen: MutPtr<SizeT>): CInt

public expect fun mallctlbymib(mib: ConstPtr<SizeT>, mible: SizeT, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt

public expect fun mallocx(size: SizeT, flags: CInt): MutPtr<CVoid>

public expect fun rallocx(ptr: MutPtr<CVoid>, size: SizeT, flags: CInt): MutPtr<CVoid>

public expect fun xallocx(ptr: MutPtr<CVoid>, size: SizeT, extra: SizeT, flags: CInt): SizeT

public expect fun sallocx(ptr: ConstPtr<CVoid>, flags: CInt): SizeT

public expect fun dallocx(ptr: MutPtr<CVoid>, flags: CInt)

public expect fun sdallocx(ptr: MutPtr<CVoid>, size: SizeT, flags: CInt)

public expect fun nallocx(size: SizeT, flags: CInt): SizeT

public expect fun procctl(idtype: IdtypeT, id: IdT, cmd: CInt, data: MutPtr<CVoid>): CInt

public expect fun getpagesize(): CInt

public expect fun getpagesizes(pagesize: MutPtr<SizeT>, nelem: CInt): CInt

public expect fun clockGetcpuclockid2(arg1: IdT, arg2: CInt, arg3: MutPtr<ClockidT>): CInt

public expect fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun shmCreateLargepage(path: ConstPtr<CChar>, flags: CInt, psind: CInt, allocPolicy: CInt, mode: ModeT): CInt

public expect fun shmRename(pathFrom: ConstPtr<CChar>, pathTo: ConstPtr<CChar>, flags: CInt): CInt

public expect fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt

public expect fun setaudit(auditinfo: ConstPtr<AuditinfoT>): CInt

public expect fun eventfd(initval: CUint, flags: CInt): CInt

public expect fun eventfdRead(fd: CInt, value: MutPtr<EventfdT>): CInt

public expect fun eventfdWrite(fd: CInt, value: EventfdT): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun elfAuxInfo(aux: CInt, buf: MutPtr<CVoid>, buflen: CInt): CInt

public expect fun setproctitleFast(fmt: ConstPtr<CChar>, vararg variadicArgs: Long)

public expect fun timingsafeBcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun timingsafeMemcmp(a: ConstPtr<CVoid>, b: ConstPtr<CVoid>, len: SizeT): CInt

public expect fun umtxOp(obj: MutPtr<CVoid>, op: CInt, value: CUlong, uaddr: MutPtr<CVoid>, uaddr2: MutPtr<CVoid>): CInt

public expect fun sctpPeeloff(s: CInt, id: SctpAssocT): CInt

public expect fun sctpBindx(s: CInt, addrs: MutPtr<Sockaddr>, num: CInt, tpe: CInt): CInt

public expect fun sctpConnectx(s: CInt, addrs: ConstPtr<Sockaddr>, addrcnt: CInt, id: MutPtr<SctpAssocT>): CInt

public expect fun sctpGetaddrlen(family: SaFamilyT): CInt

public expect fun sctpGetpaddrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr<MutPtr<Sockaddr>>): CInt

public expect fun sctpFreepaddrs(addrs: MutPtr<Sockaddr>)

public expect fun sctpGetladdrs(s: CInt, asocid: SctpAssocT, addrs: MutPtr<MutPtr<Sockaddr>>): CInt

public expect fun sctpFreeladdrs(addrs: MutPtr<Sockaddr>)

public expect fun sctpOptInfo(s: CInt, id: SctpAssocT, opt: CInt, arg: MutPtr<CVoid>, size: MutPtr<SocklenT>): CInt

public expect fun sctpSendv(sd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, addrs: MutPtr<Sockaddr>, addrcnt: CInt, info: MutPtr<CVoid>, infolen: SocklenT, infotype: CUint, flags: CInt): SsizeT

public expect fun sctpRecvv(sd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, from: MutPtr<Sockaddr>, fromlen: MutPtr<SocklenT>, info: MutPtr<CVoid>, infolen: MutPtr<SocklenT>, infotype: MutPtr<CUint>, flags: MutPtr<CInt>): SsizeT

public expect fun timerfdCreate(clockid: CInt, flags: CInt): CInt

public expect fun timerfdGettime(fd: CInt, currValue: MutPtr<Itimerspec>): CInt

public expect fun timerfdSettime(fd: CInt, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt

public expect fun closefrom(lowfd: CInt)

public expect fun closeRange(lowfd: CUint, highfd: CUint, flags: CInt): CInt

public expect fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun kcmp(pid1: PidT, pid2: PidT, type: CInt, idx1: CUlong, idx2: CUlong): CInt

public expect fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid>

public expect fun memstatStrerror(error: CInt): ConstPtr<CChar>

public expect fun memstatMtlAlloc(): MutPtr<MemoryTypeList>

public expect fun memstatMtlFirst(list: MutPtr<MemoryTypeList>): MutPtr<MemoryType>

public expect fun memstatMtlNext(mtp: MutPtr<MemoryType>): MutPtr<MemoryType>

public expect fun memstatMtlFind(list: MutPtr<MemoryTypeList>, allocator: CInt, name: ConstPtr<CChar>): MutPtr<MemoryType>

public expect fun memstatMtlFree(list: MutPtr<MemoryTypeList>)

public expect fun memstatMtlGeterror(list: MutPtr<MemoryTypeList>): CInt

public expect fun memstatGetName(mtp: ConstPtr<MemoryType>): ConstPtr<CChar>

public expect fun kvmDpcpuSetcpu(kd: MutPtr<KvmT>, cpu: CUint): CInt

public expect fun kvmGetargv(kd: MutPtr<KvmT>, p: ConstPtr<KinfoProc>, nchr: CInt): MutPtr<MutPtr<CChar>>

public expect fun kvmGetcptime(kd: MutPtr<KvmT>, cpTime: MutPtr<CLong>): CInt

public expect fun kvmGetenvv(kd: MutPtr<KvmT>, p: ConstPtr<KinfoProc>, nchr: CInt): MutPtr<MutPtr<CChar>>

public expect fun kvmGeterr(kd: MutPtr<KvmT>): MutPtr<CChar>

public expect fun kvmGetmaxcpu(kd: MutPtr<KvmT>): CInt

public expect fun kvmGetncpus(kd: MutPtr<KvmT>): CInt

public expect fun kvmGetpcpu(kd: MutPtr<KvmT>, cpu: CInt): MutPtr<CVoid>

public expect fun kvmCounterU64Fetch(kd: MutPtr<KvmT>, base: CUlong): ULong

public expect fun kvmGetswapinfo(kd: MutPtr<KvmT>, info: MutPtr<KvmSwap>, maxswap: CInt, flags: CInt): CInt

public expect fun kvmNative(kd: MutPtr<KvmT>): CInt

public expect fun kvmNlist(kd: MutPtr<KvmT>, nl: MutPtr<Nlist>): CInt

public expect fun kvmNlist2(kd: MutPtr<KvmT>, nl: MutPtr<KvmNlist>): CInt

public expect fun kvmReadZpcpu(kd: MutPtr<KvmT>, base: CUlong, buf: MutPtr<CVoid>, size: SizeT, cpu: CInt): SsizeT

public expect fun kvmRead2(kd: MutPtr<KvmT>, addr: KvaddrT, buf: MutPtr<CVoid>, nbytes: SizeT): SsizeT

public expect fun extattrNamespaceToString(attrnamespace: CInt, string: MutPtr<MutPtr<CChar>>): CInt

public expect fun extattrStringToNamespace(string: ConstPtr<CChar>, attrnamespace: MutPtr<CInt>): CInt

public expect fun realhostname(host: MutPtr<CChar>, hsize: SizeT, ip: ConstPtr<InAddr>): CInt

public expect fun realhostnameSa(host: MutPtr<CChar>, hsize: SizeT, addr: MutPtr<Sockaddr>, addrlen: CInt): CInt

public expect fun kldIsloaded(name: ConstPtr<CChar>): CInt

public expect fun kldLoad(name: ConstPtr<CChar>): CInt

public expect fun kinfoGetvmmap(pid: PidT, cntp: MutPtr<CInt>): MutPtr<KinfoVmentry>

public expect fun hexdump(ptr: ConstPtr<CVoid>, length: CInt, hdr: ConstPtr<CChar>, flags: CInt)

public expect fun humanizeNumber(buf: MutPtr<CChar>, len: SizeT, number: Long, suffix: ConstPtr<CChar>, scale: CInt, flags: CInt): CInt

public expect fun flopen(path: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun flopenat(fd: CInt, path: ConstPtr<CChar>, flags: CInt, vararg variadicArgs: Long): CInt

public expect fun getlocalbase(): ConstPtr<CChar>

public expect fun pidfileOpen(path: ConstPtr<CChar>, mode: ModeT, pidptr: MutPtr<PidT>): MutPtr<Pidfh>

public expect fun pidfileWrite(path: MutPtr<Pidfh>): CInt

public expect fun pidfileClose(path: MutPtr<Pidfh>): CInt

public expect fun pidfileRemove(path: MutPtr<Pidfh>): CInt

public expect fun pidfileFileno(path: ConstPtr<Pidfh>): CInt

public expect fun procstatOpenSysctl(): MutPtr<Procstat>

public expect fun procstatGetfiles(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, mmapped: CInt): MutPtr<FilestatList>

public expect fun procstatFreefiles(procstat: MutPtr<Procstat>, head: MutPtr<FilestatList>)

public expect fun procstatGetprocs(procstat: MutPtr<Procstat>, what: CInt, arg: CInt, count: MutPtr<CUint>): MutPtr<KinfoProc>

public expect fun procstatFreeprocs(procstat: MutPtr<Procstat>, p: MutPtr<KinfoProc>)

public expect fun procstatGetvmmap(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, count: MutPtr<CUint>): MutPtr<KinfoVmentry>

public expect fun procstatFreevmmap(procstat: MutPtr<Procstat>, vmmap: MutPtr<KinfoVmentry>)

public expect fun procstatClose(procstat: MutPtr<Procstat>)

public expect fun procstatFreeargv(procstat: MutPtr<Procstat>)

public expect fun procstatFreeenvv(procstat: MutPtr<Procstat>)

public expect fun procstatFreegroups(procstat: MutPtr<Procstat>, groups: MutPtr<GidT>)

public expect fun procstatFreeptlwpinfo(procstat: MutPtr<Procstat>, pl: MutPtr<PtraceLwpinfo>)

public expect fun procstatGetargv(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, nchr: SizeT): MutPtr<MutPtr<CChar>>

public expect fun procstatGetenvv(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, nchr: SizeT): MutPtr<MutPtr<CChar>>

public expect fun procstatGetgroups(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, count: MutPtr<CUint>): MutPtr<GidT>

public expect fun procstatGetosrel(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, osrelp: MutPtr<CInt>): CInt

public expect fun procstatGetpathname(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, pathname: MutPtr<CChar>, maxlen: SizeT): CInt

public expect fun procstatGetrlimit(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, which: CInt, rlimit: MutPtr<Rlimit>): CInt

public expect fun procstatGetumask(procstat: MutPtr<Procstat>, kp: MutPtr<KinfoProc>, maskp: MutPtr<CUshort>): CInt

public expect fun procstatOpenCore(filename: ConstPtr<CChar>): MutPtr<Procstat>

public expect fun procstatOpenKvm(nlistf: ConstPtr<CChar>, memf: ConstPtr<CChar>): MutPtr<Procstat>

public expect fun procstatGetSocketInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, sock: MutPtr<Sockstat>, errbuf: MutPtr<CChar>): CInt

public expect fun procstatGetVnodeInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, vn: MutPtr<Vnstat>, errbuf: MutPtr<CChar>): CInt

public expect fun procstatGetPtsInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, pts: MutPtr<Ptsstat>, errbuf: MutPtr<CChar>): CInt

public expect fun procstatGetShmInfo(proc: MutPtr<Procstat>, fst: MutPtr<Filestat>, shm: MutPtr<Shmstat>, errbuf: MutPtr<CChar>): CInt

public expect fun timerCreate(clockId: ClockidT, evp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, value: ConstPtr<Itimerspec>, ovalue: MutPtr<Itimerspec>): CInt

public expect fun devstatGetnumdevs(kd: MutPtr<KvmT>): CInt

public expect fun devstatGetgeneration(kd: MutPtr<KvmT>): CLong

public expect fun devstatGetversion(kd: MutPtr<KvmT>): CInt

public expect fun devstatCheckversion(kd: MutPtr<KvmT>): CInt

public expect fun devstatSelectdevs(devSelect: MutPtr<MutPtr<DeviceSelection>>, numSelected: MutPtr<CInt>, numSelections: MutPtr<CInt>, selectGeneration: MutPtr<CLong>, currentGeneration: CLong, devices: MutPtr<Devstat>, numdevs: CInt, matches: MutPtr<DevstatMatch>, numMatches: CInt, devSelections: MutPtr<MutPtr<CChar>>, numDevSelections: CInt, selectMode: DevstatSelectMode, maxshowdevs: CInt, perfSelect: CInt): CInt

public expect fun devstatBuildmatch(matchStr: MutPtr<CChar>, matches: MutPtr<MutPtr<DevstatMatch>>, numMatches: MutPtr<CInt>): CInt
