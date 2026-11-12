package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun interface PthreadOnceRoutineCallback {
    public operator fun invoke()
}

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: ConstPtr<CVoid>, arg1: ConstPtr<CVoid>, arg2: MutPtr<CVoid>): CInt
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr<CChar>, errnum: CInt): CInt
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr<DlPhdrInfo>, size: SizeT, data: MutPtr<CVoid>): CInt
}

public fun cmsgAlign(len: Int): Int = (len + sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1) and (sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1).inv()

// structs
// functions
public fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr<Cmsghdr>(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress)
    } else {
        MutPtr<Cmsghdr>(0L)
    }

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr<CVoid>(((MutPtr<CUchar>(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(length.toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toUInt()

public fun cmsgLen(length: CUint): CUint = cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    if ((((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) < sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        return MutPtr<Cmsghdr>(0L)
    }
    val next = MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if ((MutPtr<CVoid>((next).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes))).rawAddress.toInt() > max || next.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((next).rawAddress).cmsgLen).toInt()) > max) {
        MutPtr<Cmsghdr>(0L)
    } else {
        next
    }
}

public fun cpuAllocSize(count: CInt): SizeT {
    val dummy: CpuSetT? = null
    val sizeInBits = 8 * sizeOfVal(dummy!!.bits[0], PrimitiveLayouts.U64)
    return ((count.toULong() + sizeInBits.toULong() - 1uL) / 8uL)
}

public fun cpuZero(cpuset: CpuSetT) {
    for (idx in cpuset.bits.indices) {
        cpuset.bits[idx] = 0uL
    }
}

public fun cpuSet(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] or (1uL shl offset)
}

public fun cpuClr(cpu: Int, cpuset: CpuSetT) {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    // 32, 64 etc
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    cpuset.bits[idx] = cpuset.bits[idx] and (1uL shl offset).inv()
}

public fun cpuIsset(cpu: Int, cpuset: CpuSetT): Boolean {
    val sizeInBits = 8 * sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    val (idx, offset) = Pair(cpu / sizeInBits, cpu % sizeInBits)
    return 0uL != (cpuset.bits[idx] and (1uL shl offset))
}

public fun cpuCountS(size: Int, cpuset: CpuSetT): CInt {
    var s: UInt = 0u
    val sizeOfMask = sizeOfVal(cpuset.bits[0], PrimitiveLayouts.U64)
    for (i in ((cpuset.bits).slice(0 until (size / sizeOfMask)))) {
        s += i.countOneBits().toUInt()
    }
    return s.toInt()
}

public fun cpuCount(cpuset: CpuSetT): CInt = cpuCountS(sizeOf<CpuSetT>(typeLayoutT = CpuSetT.typeLayout()), cpuset)

public fun cpuEqual(set1: CpuSetT, set2: CpuSetT): Boolean = set1.bits.contentEquals(set2.bits)

public fun iptosTos(tos: UByte): UByte = tos and IPTOS_TOS_MASK

public fun iptosPrec(tos: UByte): UByte = tos and IPTOS_PREC_MASK

public fun fdClr(fd: CInt, set: MutPtr<FdSet>) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] and (1L shl (fd1 % size)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr<FdSet>): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1L shl (fd1 % size))) != 0L
}

public fun fdSet(fd: CInt, set: MutPtr<FdSet>) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] or (1L shl (fd1 % size))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr<FdSet>) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0L
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public expect fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun futimes(fd: CInt, times: ConstPtr<Timeval>): CInt

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun mkfifoat(fd: CInt, path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun libcCurrentSigrtmin(): CInt

public expect fun libcCurrentSigrtmax(): CInt

public expect fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

public expect fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt

public expect fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt

public expect fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun pipe2(fds: MutPtr<CInt>, flags: CInt): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT

public expect fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT

public expect fun readv(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt): SsizeT

public expect fun writev(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt): SsizeT

public expect fun preadv(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iovec: ConstPtr<Iovec>, count: CInt, offset: OffT): SsizeT

public expect fun preadv64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun pwritev64(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun freadUnlocked(buf: MutPtr<CVoid>, size: SizeT, nobj: SizeT, stream: MutPtr<FILE>): SizeT

public expect fun aioRead(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioError(aiocbp: ConstPtr<Aiocb>): CInt

public expect fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt

public expect fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: ConstPtr<CChar>): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt

public expect fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt

public expect fun ftello64(stream: MutPtr<FILE>): Off64T

public expect fun bind(fd: CInt, addr: ConstPtr<Sockaddr>, len: SocklenT): CInt

public expect fun accept4(fd: CInt, addr: MutPtr<Sockaddr>, len: MutPtr<SocklenT>, flg: CInt): CInt

public expect fun ppoll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun recvmsg(fd: CInt, message: MutPtr<Msghdr>, flags: CInt): SsizeT

public expect fun sendmsg(fd: CInt, message: ConstPtr<Msghdr>, flags: CInt): SsizeT

public expect fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT

public expect fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr<OffT>, count: SizeT): SsizeT

public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr<Off64T>, count: SizeT): SsizeT

public expect fun shutdown(fd: CInt, how: CInt): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt

public expect fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun ifNameindex(): MutPtr<IfNameindex>

public expect fun ifFreenameindex(ptr: MutPtr<IfNameindex>)

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt

public expect fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt

public expect fun freeifaddrs(ifa: MutPtr<Ifaddrs>)

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): MutPtr<Passwd>

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr<Group>

public expect fun setspent()

public expect fun endspent()

public expect fun getspent(): MutPtr<Spwd>

public expect fun getspnam(name: ConstPtr<CChar>): MutPtr<Spwd>

public expect fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun fgetpwentR(stream: MutPtr<FILE>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun fgetgrentR(stream: MutPtr<FILE>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun putpwent(p: ConstPtr<Passwd>, stream: MutPtr<FILE>): CInt

public expect fun putgrent(grp: ConstPtr<Group>, stream: MutPtr<FILE>): CInt

public expect fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun fgetspentR(fp: MutPtr<FILE>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt

public expect fun sgetspentR(s: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt

public expect fun getspentR(spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt

public expect fun getspnamR(name: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt

// mntent.h
public expect fun getmntentR(stream: MutPtr<FILE>, mntbuf: MutPtr<Mntent>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Mntent>

public expect fun utmpname(file: ConstPtr<CChar>): CInt

public expect fun utmpxname(file: ConstPtr<CChar>): CInt

public expect fun getutxent(): MutPtr<Utmpx>

public expect fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun setutxent()

public expect fun endutxent()

public expect fun getresuid(ruid: MutPtr<UidT>, euid: MutPtr<UidT>, suid: MutPtr<UidT>): CInt

public expect fun getresgid(rgid: MutPtr<GidT>, egid: MutPtr<GidT>, sgid: MutPtr<GidT>): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt

public expect fun setgroups(ngroups: SizeT, ptr: ConstPtr<GidT>): CInt

public expect fun acct(filename: ConstPtr<CChar>): CInt

public expect fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE>

public expect fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent>

public expect fun addmntent(stream: MutPtr<FILE>, mnt: ConstPtr<Mntent>): CInt

public expect fun endmntent(streamp: MutPtr<FILE>): CInt

public expect fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar>

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun pthreadKill(threadid: PthreadT, signo: CInt): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadGetattrNp(thr: PthreadT, attr: MutPtr<PthreadAttrT>): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt

public expect fun pthreadOnce(control: MutPtr<PthreadOnceT>, routine: PthreadOnceRoutineCallback): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, shared: MutPtr<CInt>): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, shared: CInt): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt

public expect fun pthreadSigmask(how: CInt, newmask: ConstPtr<SigsetT>, oldmask: MutPtr<SigsetT>): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt

public expect fun clockGetres(clockId: ClockidT, res: MutPtr<Timespec>): CInt

public expect fun clockGettime(clockId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt

public expect fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt

public expect fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar>

public expect fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar>

public expect fun strftime(s: MutPtr<CChar>, max: SizeT, format: ConstPtr<CChar>, tm: ConstPtr<Tm>): SizeT

public expect fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar>

public expect fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, currValue: MutPtr<Itimerspec>): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt

public expect fun fstat(fd: CInt, buf: MutPtr<Stat>): CInt

public expect fun fstat64(fd: CInt, buf: MutPtr<Stat64>): CInt

public expect fun fstatat(fd: CInt, file: ConstPtr<CChar>, buf: MutPtr<Stat>, flag: CInt): CInt

public expect fun fstatat64(fd: CInt, file: ConstPtr<CChar>, buf: MutPtr<Stat64>, flag: CInt): CInt

public expect fun statx(dirfd: CInt, pathname: ConstPtr<CChar>, flags: CInt, mask: CUint, statxbuf: MutPtr<Statx>): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun ftruncate64(fd: CInt, length: Off64T): CInt

public expect fun truncate64(file: ConstPtr<CChar>, length: Off64T): CInt

public expect fun lstat(file: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt

public expect fun lstat64(file: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt

public expect fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt

public expect fun statfs64(file: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt

public expect fun fstatfs64(fildes: CInt, buf: MutPtr<Statfs64>): CInt

public expect fun statvfs(file: ConstPtr<CChar>, buf: MutPtr<Statvfs>): CInt

public expect fun statvfs64(file: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt

public expect fun fstatvfs(fildes: CInt, buf: MutPtr<Statvfs>): CInt

public expect fun fstatvfs64(fildes: CInt, buf: MutPtr<Statvfs64>): CInt

public expect fun open(file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun open64(file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun openat(fd: CInt, file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun openat64(fd: CInt, file: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE>

public expect fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt

public expect fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt

public expect fun tmpfile64(): MutPtr<FILE>

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun getdtablesize(): CInt

// Added in `glibc` 2.34
public expect fun closeRange(first: CUint, last: CUint, flags: CInt): CInt

public expect fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): CInt

public expect fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: ConstPtr<Termios>, winp: ConstPtr<Winsize>): PidT

public expect fun getpt(): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun loginTty(fd: CInt): CInt

public expect fun ctermid(s: MutPtr<CChar>): MutPtr<CChar>

public expect fun clearenv(): CInt

public expect fun execveat(dirfd: CInt, pathname: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>, flags: CInt): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

// posix/spawn.h
public expect fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt

// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt

// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

// Added in `glibc` 2.34
public expect fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr<PosixSpawnFileActionsT>, from: CInt): CInt

// Added in `glibc` 2.35
public expect fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr<PosixSpawnFileActionsT>, tcfd: CInt): CInt

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr<CChar>): CInt

public expect fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt

public expect fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun stat(file: ConstPtr<CChar>, buf: MutPtr<Stat>): CInt

public expect fun stat64(file: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt

public expect fun readdir(dirp: MutPtr<DIR>): MutPtr<Dirent>

public expect fun readdir64(dirp: MutPtr<DIR>): MutPtr<Dirent64>

public expect fun readdirR(dirp: MutPtr<DIR>, entry: MutPtr<Dirent>, result: MutPtr<MutPtr<Dirent>>): CInt

public expect fun readdir64R(dirp: MutPtr<DIR>, entry: MutPtr<Dirent64>, result: MutPtr<MutPtr<Dirent64>>): CInt

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun errnoLocation(): MutPtr<CInt>

public expect fun mmap64(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr<CVoid>

public expect fun mremap(addr: MutPtr<CVoid>, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr<CVoid>

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun sync()

public expect fun syncfs(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun madvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt

public expect fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt

public expect fun getpriority(which: PriorityWhich, who: IdT): CInt

public expect fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt

public expect fun getrandom(buffer: MutPtr<CVoid>, length: SizeT, flags: CUint): SsizeT

public expect fun getentropy(buffer: MutPtr<CVoid>, length: SizeT): CInt

public expect fun memrchr(cx: ConstPtr<CVoid>, c: CInt, n: SizeT): MutPtr<CVoid>

public expect fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid>

public expect fun strchrnul(s: ConstPtr<CChar>, c: CInt): MutPtr<CChar>

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: MutPtr<CUshort>): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: MutPtr<CUshort>): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: MutPtr<CUshort>): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort>

public expect fun lcong48(p: MutPtr<CUshort>)

public expect fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>)

public expect fun brk(addr: MutPtr<CVoid>): CInt

public expect fun sbrk(increment: IntptrT): MutPtr<CVoid>

public expect fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun mallinfo(): Mallinfo

public expect fun mallinfo2(): Mallinfo2

public expect fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt

public expect fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT

public expect fun mallocTrim(pad: SizeT): CInt

public expect fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT

public expect fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun getoptLong(argc: CInt, argv: ConstPtr<MutPtr<CChar>>, optstring: ConstPtr<CChar>, longopts: ConstPtr<Option>, longindex: MutPtr<CInt>): CInt

public expect fun backtrace(buf: MutPtr<MutPtr<CVoid>>, sz: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun getloadavg(loadavg: MutPtr<CDouble>, nelem: CInt): CInt

public expect fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr<RegexT>)

public expect fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt

public expect fun globfree(pglob: MutPtr<GlobT>)

public expect fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt

public expect fun globfree64(pglob: MutPtr<Glob64T>)

public expect fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT

public expect fun lgetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT): SsizeT

public expect fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt

public expect fun lsetxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT

public expect fun llistxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT): SsizeT

public expect fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt

public expect fun lremovexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>): CInt

public expect fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>): CInt

public expect fun dirname(path: MutPtr<CChar>): MutPtr<CChar>

/**
 * POSIX version of `basename(3)`, defined in `libgen.h`.
 */
public expect fun posixBasename(path: MutPtr<CChar>): MutPtr<CChar>

/**
 * GNU version of `basename(3)`, defined in `string.h`.
 */
public expect fun gnuBasename(path: ConstPtr<CChar>): MutPtr<CChar>

public expect fun dlmopen(lmid: LmidT, filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid>

public expect fun dlinfo(handle: MutPtr<CVoid>, request: CInt, info: MutPtr<CVoid>): CInt

public expect fun dladdr1(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>, extraInfo: MutPtr<MutPtr<CVoid>>, flags: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun nlLanginfo(item: NlItem): MutPtr<CChar>

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr<CChar>

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt

public expect fun gnuGetLibcRelease(): ConstPtr<CChar>

public expect fun gnuGetLibcVersion(): ConstPtr<CChar>

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0uL
    dev = dev or (major1 shl 8)
    dev = dev or minor1
    return dev
}

public fun major(dev: DevT): CUint = ((dev shr 8) and 0xffuL).toUInt()

public fun minor(dev: DevT): CUint = (dev and 0xffff00ffuL).toUInt()

public fun sigrtmax(): CInt = libcCurrentSigrtmax()

public fun sigrtmin(): CInt = libcCurrentSigrtmin()

public fun wifstopped(status: CInt): Boolean = (status and 0xff) == 0x7f

public fun wstopsig(status: CInt): CInt = (status shr 8) and 0xff

public fun wifcontinued(status: CInt): Boolean = status == 0xffff

public fun wifsignaled(status: CInt): Boolean = ((status and 0x7f) + 1).toByte() >= 2.toByte()

public fun wtermsig(status: CInt): CInt = status and 0x7f

public fun wifexited(status: CInt): Boolean = (status and 0x7f) == 0

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0xff

public fun wcoredump(status: CInt): Boolean = (status and 0x80) != 0

public fun wExitcode(ret: CInt, sig: CInt): CInt = (ret shl 8) or sig

public fun wStopcode(sig: CInt): CInt = (sig shl 8) or 0x7f

public fun qcmd(cmd: CInt, type: CInt): CInt = (cmd shl 8) or (type and 0x00ff)

public fun ipoptCopied(o: UByte): UByte = o and IPOPT_COPY

public fun ipoptClass(o: UByte): UByte = o and IPOPT_CLASS_MASK

public fun ipoptNumber(o: UByte): UByte = o and IPOPT_NUMBER_MASK

public fun iptosEcn(x: UByte): UByte = x and IPTOS_ECN_MASK
