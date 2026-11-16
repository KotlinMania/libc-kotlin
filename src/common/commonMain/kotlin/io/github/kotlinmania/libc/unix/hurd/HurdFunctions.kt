package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public fun interface PthreadOnceRoutineCallback {
    public operator fun invoke()
}

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: ConstPtr, arg1: ConstPtr, arg2: MutPtr): CInt
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr, errnum: CInt): CInt
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr, size: SizeT, data: MutPtr): CInt
}

public fun cmsgAlign(len: Int): Int = (len + sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1) and (sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1).inv()

// structs
// functions
public fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress)
    } else {
        MutPtr(0L)
    }

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(((MutPtr(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(length.toInt()) + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toUInt()

public fun cmsgLen(length: CUint): CUint = cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    if ((((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()) < sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        return MutPtr(0L)
    }
    val next = MutPtr((cmsg.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())).toLong())
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if ((MutPtr((next).rawAddress + ((1).toLong() * (Cmsghdr.typeLayout()).strideBytes))).rawAddress.toInt() > max || next.rawAddress.toInt() + cmsgAlign(((Cmsghdr.typeLayout()).readNative((next).rawAddress).cmsgLen).toInt()) > max) {
        MutPtr(0L)
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

public fun fdClr(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] and (1L shl (fd1 % size)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1L shl (fd1 % size))) != 0L
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.I64) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] or (1L shl (fd1 % size))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0L
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public expect fun lutimes(file: ConstPtr, times: ConstPtr): CInt

public expect fun futimes(fd: CInt, times: ConstPtr): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun mkfifoat(fd: CInt, path: ConstPtr, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun libcCurrentSigrtmin(): CInt

public expect fun libcCurrentSigrtmax(): CInt

public expect fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

public expect fun sigsuspend(mask: ConstPtr): CInt

public expect fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt

public expect fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt

public expect fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt

public expect fun ioctl(fd: CInt, request: CUlong, vararg variadicArgs: Long): CInt

public expect fun pipe2(fds: MutPtr, flags: CInt): CInt

public expect fun dup3(oldfd: CInt, newfd: CInt, flags: CInt): CInt

public expect fun pread64(fd: CInt, buf: MutPtr, count: SizeT, offset: Off64T): SsizeT

public expect fun pwrite64(fd: CInt, buf: ConstPtr, count: SizeT, offset: Off64T): SsizeT

public expect fun readv(fd: CInt, iovec: ConstPtr, count: CInt): SsizeT

public expect fun writev(fd: CInt, iovec: ConstPtr, count: CInt): SsizeT

public expect fun preadv(fd: CInt, iovec: ConstPtr, count: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iovec: ConstPtr, count: CInt, offset: OffT): SsizeT

public expect fun preadv64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun pwritev64(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT

public expect fun freadUnlocked(buf: MutPtr, size: SizeT, nobj: SizeT, stream: MutPtr): SizeT

public expect fun aioRead(aiocbp: MutPtr): CInt

public expect fun aioWrite(aiocbp: MutPtr): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr): CInt

public expect fun aioError(aiocbp: ConstPtr): CInt

public expect fun aioReturn(aiocbp: MutPtr): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt

public expect fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqUnlink(name: ConstPtr): CInt

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT

public expect fun fgetpos64(stream: MutPtr, ptr: MutPtr): CInt

public expect fun fseeko64(stream: MutPtr, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: MutPtr, ptr: ConstPtr): CInt

public expect fun ftello64(stream: MutPtr): Off64T

public expect fun bind(fd: CInt, addr: ConstPtr, len: SocklenT): CInt

public expect fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt

public expect fun ppoll(fds: MutPtr, nfds: NfdsT, timeout: ConstPtr, sigmask: ConstPtr): CInt

public expect fun recvmsg(fd: CInt, message: MutPtr, flags: CInt): SsizeT

public expect fun sendmsg(fd: CInt, message: ConstPtr, flags: CInt): SsizeT

public expect fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT

public expect fun sendfile(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT

public expect fun sendfile64(outFd: CInt, inFd: CInt, offset: MutPtr, count: SizeT): SsizeT

public expect fun shutdown(fd: CInt, how: CInt): CInt

public expect fun sethostname(name: ConstPtr, len: SizeT): CInt

public expect fun getdomainname(name: MutPtr, len: SizeT): CInt

public expect fun setdomainname(name: ConstPtr, len: SizeT): CInt

public expect fun ifNameindex(): MutPtr

public expect fun ifFreenameindex(ptr: MutPtr)

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

public expect fun getifaddrs(ifap: MutPtr): CInt

public expect fun freeifaddrs(ifa: MutPtr)

public expect fun uname(buf: MutPtr): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong): CInt

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): MutPtr

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr

public expect fun setspent()

public expect fun endspent()

public expect fun getspent(): MutPtr

public expect fun getspnam(name: ConstPtr): MutPtr

public expect fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun fgetpwentR(stream: MutPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun fgetgrentR(stream: MutPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun putpwent(p: ConstPtr, stream: MutPtr): CInt

public expect fun putgrent(grp: ConstPtr, stream: MutPtr): CInt

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun fgetspentR(fp: MutPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt

public expect fun sgetspentR(s: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt

public expect fun getspentR(spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt

public expect fun getspnamR(name: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt

// mntent.h
public expect fun getmntentR(stream: MutPtr, mntbuf: MutPtr, buf: MutPtr, buflen: CInt): MutPtr

public expect fun utmpname(file: ConstPtr): CInt

public expect fun utmpxname(file: ConstPtr): CInt

public expect fun getutxent(): MutPtr

public expect fun getutxid(ut: ConstPtr): MutPtr

public expect fun getutxline(ut: ConstPtr): MutPtr

public expect fun pututxline(ut: ConstPtr): MutPtr

public expect fun setutxent()

public expect fun endutxent()

public expect fun getresuid(ruid: MutPtr, euid: MutPtr, suid: MutPtr): CInt

public expect fun getresgid(rgid: MutPtr, egid: MutPtr, sgid: MutPtr): CInt

public expect fun setresuid(ruid: UidT, euid: UidT, suid: UidT): CInt

public expect fun setresgid(rgid: GidT, egid: GidT, sgid: GidT): CInt

public expect fun initgroups(user: ConstPtr, group: GidT): CInt

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt

public expect fun setgroups(ngroups: SizeT, ptr: ConstPtr): CInt

public expect fun acct(filename: ConstPtr): CInt

public expect fun setmntent(filename: ConstPtr, ty: ConstPtr): MutPtr

public expect fun getmntent(stream: MutPtr): MutPtr

public expect fun addmntent(stream: MutPtr, mnt: ConstPtr): CInt

public expect fun endmntent(streamp: MutPtr): CInt

public expect fun hasmntopt(mnt: ConstPtr, opt: ConstPtr): MutPtr

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun pthreadKill(threadid: PthreadT, signo: CInt): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadEqual(t1: PthreadT, t2: PthreadT): CInt

public expect fun pthreadGetattrNp(thr: PthreadT, attr: MutPtr): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadOnce(control: MutPtr, routine: PthreadOnceRoutineCallback): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr, shared: MutPtr): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr, shared: CInt): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr): CInt

public expect fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr): CInt

public expect fun pthreadSpinLock(lock: MutPtr): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr): CInt

public expect fun pthreadAtfork(prepare: PthreadOnceRoutineCallback?, parent: PthreadOnceRoutineCallback?, child: PthreadOnceRoutineCallback?): CInt

public expect fun pthreadSigmask(how: CInt, newmask: ConstPtr, oldmask: MutPtr): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt

public expect fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt

public expect fun clockGetres(clockId: ClockidT, res: MutPtr): CInt

public expect fun clockGettime(clockId: ClockidT, tp: MutPtr): CInt

public expect fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt

public expect fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr

public expect fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr

public expect fun strftime(s: MutPtr, max: SizeT, format: ConstPtr, tm: ConstPtr): SizeT

public expect fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr

public expect fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, currValue: MutPtr): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun fstat(fd: CInt, buf: MutPtr): CInt

public expect fun fstat64(fd: CInt, buf: MutPtr): CInt

public expect fun fstatat(fd: CInt, file: ConstPtr, buf: MutPtr, flag: CInt): CInt

public expect fun fstatat64(fd: CInt, file: ConstPtr, buf: MutPtr, flag: CInt): CInt

public expect fun statx(dirfd: CInt, pathname: ConstPtr, flags: CInt, mask: CUint, statxbuf: MutPtr): CInt

public expect fun ftruncate(fd: CInt, length: OffT): CInt

public expect fun ftruncate64(fd: CInt, length: Off64T): CInt

public expect fun truncate64(file: ConstPtr, length: Off64T): CInt

public expect fun lstat(file: ConstPtr, buf: MutPtr): CInt

public expect fun lstat64(file: ConstPtr, buf: MutPtr): CInt

public expect fun statfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun statfs64(file: ConstPtr, buf: MutPtr): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr): CInt

public expect fun fstatfs64(fildes: CInt, buf: MutPtr): CInt

public expect fun statvfs(file: ConstPtr, buf: MutPtr): CInt

public expect fun statvfs64(file: ConstPtr, buf: MutPtr): CInt

public expect fun fstatvfs(fildes: CInt, buf: MutPtr): CInt

public expect fun fstatvfs64(fildes: CInt, buf: MutPtr): CInt

public expect fun open(file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun open64(file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun openat(fd: CInt, file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun openat64(fd: CInt, file: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun fopen64(filename: ConstPtr, mode: ConstPtr): MutPtr

public expect fun freopen64(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr

public expect fun creat64(path: ConstPtr, mode: ModeT): CInt

public expect fun mkostemp(template: MutPtr, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt

public expect fun mkstemps(template: MutPtr, suffixlen: CInt): CInt

public expect fun tmpfile64(): MutPtr

public expect fun popen(command: ConstPtr, mode: ConstPtr): MutPtr

public expect fun getdtablesize(): CInt

// Added in `glibc` 2.34
public expect fun closeRange(first: CUint, last: CUint, flags: CInt): CInt

public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): CInt

public expect fun forkpty(amaster: MutPtr, name: MutPtr, termp: ConstPtr, winp: ConstPtr): PidT

public expect fun getpt(): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun loginTty(fd: CInt): CInt

public expect fun ctermid(s: MutPtr): MutPtr

public expect fun clearenv(): CInt

public expect fun execveat(dirfd: CInt, pathname: ConstPtr, argv: ConstPtr, envp: ConstPtr, flags: CInt): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

// posix/spawn.h
public expect fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnattrInit(attr: MutPtr): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt

// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt

// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt

// Added in `glibc` 2.34
public expect fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr, from: CInt): CInt

// Added in `glibc` 2.35
public expect fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr, tcfd: CInt): CInt

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

public expect fun euidaccess(pathname: ConstPtr, mode: CInt): CInt

public expect fun eaccess(pathname: ConstPtr, mode: CInt): CInt

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun stat(file: ConstPtr, buf: MutPtr): CInt

public expect fun stat64(file: ConstPtr, buf: MutPtr): CInt

public expect fun readdir(dirp: MutPtr): MutPtr

public expect fun readdir64(dirp: MutPtr): MutPtr

public expect fun readdirR(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt

public expect fun readdir64R(dirp: MutPtr, entry: MutPtr, result: MutPtr): CInt

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun telldir(dirp: MutPtr): CLong

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun errnoLocation(): MutPtr

public expect fun mmap64(addr: MutPtr, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: Off64T): MutPtr

public expect fun mremap(addr: MutPtr, len: SizeT, newLen: SizeT, flags: CInt, vararg variadicArgs: Long): MutPtr

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun sync()

public expect fun syncfs(fd: CInt): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun fallocate64(fd: CInt, mode: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun madvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt

public expect fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt

public expect fun getpriority(which: PriorityWhich, who: IdT): CInt

public expect fun setpriority(which: PriorityWhich, who: IdT, prio: CInt): CInt

public expect fun getrandom(buffer: MutPtr, length: SizeT, flags: CUint): SsizeT

public expect fun getentropy(buffer: MutPtr, length: SizeT): CInt

public expect fun memrchr(cx: ConstPtr, c: CInt, n: SizeT): MutPtr

public expect fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr

public expect fun strchrnul(s: ConstPtr, c: CInt): MutPtr

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun drand48(): CDouble

public expect fun erand48(xseed: MutPtr): CDouble

public expect fun lrand48(): CLong

public expect fun nrand48(xseed: MutPtr): CLong

public expect fun mrand48(): CLong

public expect fun jrand48(xseed: MutPtr): CLong

public expect fun srand48(seed: CLong)

public expect fun seed48(xseed: MutPtr): MutPtr

public expect fun lcong48(p: MutPtr)

public expect fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr)

public expect fun brk(addr: MutPtr): CInt

public expect fun sbrk(increment: IntptrT): MutPtr

public expect fun memalign(align: SizeT, size: SizeT): MutPtr

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun mallinfo(): Mallinfo

public expect fun mallinfo2(): Mallinfo2

public expect fun mallocInfo(options: CInt, stream: MutPtr): CInt

public expect fun mallocUsableSize(ptr: MutPtr): SizeT

public expect fun mallocTrim(pad: SizeT): CInt

public expect fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT

public expect fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun getoptLong(argc: CInt, argv: ConstPtr, optstring: ConstPtr, longopts: ConstPtr, longindex: MutPtr): CInt

public expect fun backtrace(buf: MutPtr, sz: CInt): CInt

public expect fun reboot(howTo: CInt): CInt

public expect fun getloadavg(loadavg: MutPtr, nelem: CInt): CInt

public expect fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr)

public expect fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt

public expect fun globfree(pglob: MutPtr)

public expect fun glob64(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt

public expect fun globfree64(pglob: MutPtr)

public expect fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun lgetxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT): SsizeT

public expect fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt

public expect fun lsetxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, flags: CInt): CInt

public expect fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT

public expect fun llistxattr(path: ConstPtr, list: MutPtr, size: SizeT): SsizeT

public expect fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT): SsizeT

public expect fun removexattr(path: ConstPtr, name: ConstPtr): CInt

public expect fun lremovexattr(path: ConstPtr, name: ConstPtr): CInt

public expect fun fremovexattr(filedes: CInt, name: ConstPtr): CInt

public expect fun dirname(path: MutPtr): MutPtr

/**
 * POSIX version of `basename(3)`, defined in `libgen.h`.
 */
public expect fun posixBasename(path: MutPtr): MutPtr

/**
 * GNU version of `basename(3)`, defined in `string.h`.
 */
public expect fun gnuBasename(path: ConstPtr): MutPtr

public expect fun dlmopen(lmid: LmidT, filename: ConstPtr, flag: CInt): MutPtr

public expect fun dlinfo(handle: MutPtr, request: CInt, info: MutPtr): CInt

public expect fun dladdr1(addr: ConstPtr, info: MutPtr, extraInfo: MutPtr, flags: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT)

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun nlLanginfo(item: NlItem): MutPtr

public expect fun nlLanginfoL(item: NlItem, locale: LocaleT): MutPtr

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt

public expect fun gnuGetLibcRelease(): ConstPtr

public expect fun gnuGetLibcVersion(): ConstPtr

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
