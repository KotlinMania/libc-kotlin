package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUshort
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Aiocb
import io.github.kotlinmania.libc.unix.aix.powerpc64.FdSet
import io.github.kotlinmania.libc.unix.aix.powerpc64.MsqidDs
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadBarrierT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadMutexT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadOnceT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadRwlockT
import io.github.kotlinmania.libc.unix.aix.powerpc64.PthreadSpinlockT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SiginfoT
import io.github.kotlinmania.libc.unix.aix.powerpc64.SigsetT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Stat
import io.github.kotlinmania.libc.unix.aix.powerpc64.Statfs
import io.github.kotlinmania.libc.unix.aix.powerpc64.UcontextT
import io.github.kotlinmania.libc.unix.aix.powerpc64.Utmpx
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCleanupPushRoutineCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>)
}

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr<CChar>, errnum: CInt): CInt
}

public fun interface LfindComparCallback {
    public operator fun invoke(arg0: ConstPtr<CVoid>, arg1: ConstPtr<CVoid>): CInt
}

public fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr<Cmsghdr>(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress, ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawMeta)
    } else {
        MutPtr<Cmsghdr>(0L)
    }

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> =
    if (((cmsg).rawAddress == 0L)) {
        cmsgFirsthdr(mhdr)
    } else {
        if ((cmsg.rawAddress.toInt() + ((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt() + sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) > (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt())) {
            MutPtr<Cmsghdr>(0L)
        } else {
            // AIX does not have any alignment/padding for ancillary data, so we don't need _CMSG_ALIGN here.
            MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + ((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()).toLong())
        }
    }

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr(((MutPtr<CUchar>(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgLen(length: CUint): CUint = sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toUInt() + length

public fun cmsgSpace(length: CUint): CUint = sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toUInt() + length

public fun fdZero(set: MutPtr<FdSet>) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0L
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun fdSet(fd: CInt, set: MutPtr<FdSet>) {
    val bits = sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdClr(fd: CInt, set: MutPtr<FdSet>) {
    val bits = sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] and (1L shl (fd1 % bits)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr<FdSet>): Boolean {
    val bits = sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64) * 8
    val fd1 = fd
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / bits] and (1L shl (fd1 % bits))) != 0L
}

public fun wifstopped(status: CInt): Boolean = (status and W_STOPPED) != 0

public fun wstopsig(status: CInt): CInt =
    if (wifstopped(status)) {
        (((status.toUInt()) shr 8) and 0xffu).toInt()
    } else {
        -1
    }

public fun wifexited(status: CInt): Boolean = (status and 0xFF) == 0

public fun wexitstatus(status: CInt): CInt =
    if (wifexited(status)) {
        (((status.toUInt()) shr 8) and 0xffu).toInt()
    } else {
        -1
    }

public fun wifsignaled(status: CInt): Boolean = !wifexited(status) && !wifstopped(status)

public fun wtermsig(status: CInt): CInt =
    if (wifsignaled(status)) {
        (((status.toUInt()) shr 16) and 0xffu).toInt()
    } else {
        -1
    }

public fun wifcontinued(status: CInt): Boolean = (status and WCONTINUED) != 0

public fun wcoredump(status: CInt): Boolean = false

public fun major(dev: DevT): CUint {
    val x = dev shr 16
    return x.toUInt()
}

public fun minor(dev: DevT): CUint {
    val y = dev and 0xFFFFuL
    return y.toUInt()
}

public fun makedev(major: CUint, minor: CUint): DevT {
    val major1 = major.toULong()
    val minor1 = minor.toULong()
    var dev = 0uL
    dev = dev or (major1 shl 16)
    dev = dev or minor1
    return dev
}

public expect fun thrKill(id: ThreadT, sig: CInt): CInt

public expect fun thrSelf(): ThreadT

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrGetinheritsched(attr: ConstPtr<PthreadAttrT>, inheritsched: MutPtr<CInt>): CInt

public expect fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt

public expect fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt

public expect fun pthreadAttrGetschedpolicy(attr: ConstPtr<PthreadAttrT>, policy: MutPtr<CInt>): CInt

public expect fun pthreadAttrGetscope(attr: ConstPtr<PthreadAttrT>, contentionscope: MutPtr<CInt>): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt

public expect fun pthreadAttrSetinheritsched(attr: MutPtr<PthreadAttrT>, inheritsched: CInt): CInt

public expect fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadAttrSetschedpolicy(attr: MutPtr<PthreadAttrT>, policy: CInt): CInt

public expect fun pthreadAttrSetscope(attr: MutPtr<PthreadAttrT>, contentionscope: CInt): CInt

public expect fun pthreadAttrSetstack(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>, stacksize: SizeT): CInt

public expect fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, pshared: CInt): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCleanupPop(execute: CInt)

public expect fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: MutPtr<CVoid>)

public expect fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt

public expect fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): CInt

public expect fun pthreadGetconcurrency(): CInt

public expect fun pthreadGetcpuclockid(threadId: PthreadT, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadGetschedparam(thread: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun pthreadMutexattrGetprioceiling(attr: ConstPtr<PthreadMutexattrT>, prioceiling: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrGetprotocol(attr: ConstPtr<PthreadMutexattrT>, protocol: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robust: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrGettype(attr: ConstPtr<PthreadMutexattrT>, type: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrSetprioceiling(attr: MutPtr<PthreadMutexattrT>, prioceiling: CInt): CInt

public expect fun pthreadMutexattrSetprotocol(attr: MutPtr<PthreadMutexattrT>, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt

public expect fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robust: CInt): CInt

public expect fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexGetprioceiling(mutex: ConstPtr<PthreadMutexT>, prioceiling: MutPtr<CInt>): CInt

public expect fun pthreadMutexSetprioceiling(mutex: MutPtr<PthreadMutexT>, prioceiling: CInt, oldCeiling: MutPtr<CInt>): CInt

public expect fun pthreadMutexTimedlock(mutex: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadOnce(onceControl: MutPtr<PthreadOnceT>, initRoutine: PthreadAtforkPrepareCallback?): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, pshared: CInt): CInt

public expect fun pthreadRwlockTimedrdlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadRwlockTimedwrlock(rwlock: MutPtr<PthreadRwlockT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadSetcancelstate(state: CInt, oldstate: MutPtr<CInt>): CInt

public expect fun pthreadSetcanceltype(type: CInt, oldtype: MutPtr<CInt>): CInt

public expect fun pthreadSetconcurrency(newLevel: CInt): CInt

public expect fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oset: MutPtr<SigsetT>): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadTestcancel()

public expect fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT

public expect fun acct(filename: MutPtr<CChar>): CInt

public expect fun aioCancel(fildes: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioError(aiocbp: ConstPtr<Aiocb>): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioRead(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT

public expect fun aioSuspend(list: ConstPtr<ConstPtr<Aiocb>>, nent: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt

public expect fun basename(path: MutPtr<CChar>): MutPtr<CChar>

public expect fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt

public expect fun brk(addr: MutPtr<CVoid>): CInt

public expect fun clearenv(): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun creat64(path: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun ctermid(s: MutPtr<CChar>): MutPtr<CChar>

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun dirname(path: MutPtr<CChar>): MutPtr<CChar>

public expect fun drand48(): CDouble

public expect fun duplocale(arg1: LocaleT): LocaleT

public expect fun endgrent()

public expect fun endmntent(streamp: MutPtr<FILE>): CInt

public expect fun endpwent()

public expect fun endutent()

public expect fun endutxent()

public expect fun erand48(xseed: MutPtr<CUshort>): CDouble

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun fattach(fildes: CInt, path: ConstPtr<CChar>): CInt

public expect fun fdatasync(fd: CInt): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLonglong): CInt

public expect fun fgetgrent(file: MutPtr<FILE>): MutPtr<Group>

public expect fun fgetpos64(stream: MutPtr<FILE>, ptr: MutPtr<Fpos64T>): CInt

public expect fun fgetpwent(file: MutPtr<FILE>): MutPtr<Passwd>

public expect fun fopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun freelocale(loc: LocaleT)

public expect fun freopen64(filename: ConstPtr<CChar>, mode: ConstPtr<CChar>, file: MutPtr<FILE>): MutPtr<FILE>

public expect fun fseeko64(stream: MutPtr<FILE>, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: MutPtr<FILE>, ptr: ConstPtr<Fpos64T>): CInt

public expect fun fstat64(fildes: CInt, buf: MutPtr<Stat64>): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt

public expect fun fstatfs64(fd: CInt, buf: MutPtr<Statfs64>): CInt

public expect fun fstatvfs64(fd: CInt, buf: MutPtr<Statvfs64>): CInt

public expect fun ftello64(stream: MutPtr<FILE>): Off64T

public expect fun ftok(path: ConstPtr<CChar>, id: CInt): KeyT

public expect fun ftruncate64(fd: CInt, length: Off64T): CInt

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun getcontext(ucp: MutPtr<UcontextT>): CInt

public expect fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrent(): MutPtr<Group>

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun getgrset(user: ConstPtr<CChar>): MutPtr<CChar>

public expect fun gethostid(): CLong

public expect fun getmntent(stream: MutPtr<FILE>): MutPtr<Mntent>

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SizeT, host: MutPtr<CChar>, hostlen: SizeT, serv: MutPtr<CChar>, servlen: SizeT, flags: CInt): CInt

public expect fun getpagesize(): CInt

public expect fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun getpwent(): MutPtr<Passwd>

public expect fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt

public expect fun getrlimit64(resource: CInt, rlim: MutPtr<Rlimit64>): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt

public expect fun getutent(): MutPtr<Utmp>

public expect fun getutid(u: ConstPtr<Utmp>): MutPtr<Utmp>

public expect fun getutline(u: ConstPtr<Utmp>): MutPtr<Utmp>

public expect fun getutxent(): MutPtr<Utmpx>

public expect fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr<GlobT>): CInt

public expect fun globfree(pglob: MutPtr<GlobT>)

public expect fun hasmntopt(mnt: ConstPtr<Mntent>, opt: ConstPtr<CChar>): MutPtr<CChar>

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: Entry, action: Action): MutPtr<Entry>

public expect fun ifFreenameindex(ptr: MutPtr<IfNameindex>)

public expect fun ifNameindex(): MutPtr<IfNameindex>

public expect fun initgroups(name: ConstPtr<CChar>, basegid: GidT): CInt

public expect fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun jrand48(xseed: MutPtr<CUshort>): CLong

public expect fun lcong48(p: MutPtr<CUshort>)

public expect fun lfind(key: ConstPtr<CVoid>, base: ConstPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid>

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nent: CInt, sevp: MutPtr<Sigevent>): CInt

public expect fun loadquery(flags: CInt, buf: MutPtr<CVoid>, buflen: CUint, vararg variadicArgs: Long): CInt

public expect fun lparGetInfo(command: CInt, buf: MutPtr<CVoid>, bufsize: SizeT): CInt

public expect fun lparSetResources(id: CInt, resource: MutPtr<CVoid>): CInt

public expect fun lrand48(): CLong

public expect fun lsearch(key: ConstPtr<CVoid>, base: MutPtr<CVoid>, nelp: MutPtr<SizeT>, width: SizeT, compar: LfindComparCallback?): MutPtr<CVoid>

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lstat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt

public expect fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt

public expect fun makecontext(ucp: MutPtr<UcontextT>, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long)

public expect fun mallinfo(): Mallinfo

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid>

public expect fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt

public expect fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr<CChar>): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun mount(device: ConstPtr<CChar>, path: ConstPtr<CChar>, flags: CInt): CInt

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr<MqAttr>): CInt

public expect fun mqNotify(mqd: MqdT, notification: ConstPtr<Sigevent>): CInt

public expect fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr<MqAttr>, oldattr: MutPtr<MqAttr>): CInt

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt

public expect fun mqUnlink(name: ConstPtr<CChar>): CInt

public expect fun mrand48(): CLong

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr<MsqidDs>): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: ConstPtr<CVoid>, msgsz: SizeT, msgflg: CInt): CInt

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT

public expect fun nlLanginfo(item: NlItem): MutPtr<CChar>

public expect fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr<CChar>

public expect fun nrand48(xseed: MutPtr<CUshort>): CLong

public expect fun open64(path: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun pollsetCreate(maxfd: CInt): PollsetT

public expect fun pollsetCtl(ps: PollsetT, pollctlArray: MutPtr<PollCtl>, arrayLength: CInt): CInt

public expect fun pollsetDestroy(ps: PollsetT): CInt

public expect fun pollsetPoll(ps: PollsetT, polldataArray: MutPtr<Pollfd>, arrayLength: CInt, timeout: CInt): CInt

public expect fun pollsetQuery(ps: PollsetT, pollfdQuery: MutPtr<Pollfd>): CInt

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun posixSpawn(pid: MutPtr<PidT>, path: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CShort>): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<PidT>): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr<PosixSpawnattrT>, param: MutPtr<SchedParam>): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr<PosixSpawnattrT>, flags: MutPtr<CInt>): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr<PosixSpawnattrT>, default: MutPtr<SigsetT>): CInt

public expect fun posixSpawnattrInit(attr: MutPtr<PosixSpawnattrT>): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr<PosixSpawnattrT>, flags: CShort): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr<PosixSpawnattrT>, flags: PidT): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr<PosixSpawnattrT>, param: ConstPtr<SchedParam>): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr<PosixSpawnattrT>, flags: CInt): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr<PosixSpawnattrT>, default: ConstPtr<SigsetT>): CInt

public expect fun posixSpawnp(pid: MutPtr<PidT>, file: ConstPtr<CChar>, fileActions: ConstPtr<PosixSpawnFileActionsT>, attrp: ConstPtr<PosixSpawnattrT>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>): CInt

public expect fun pread64(fd: CInt, buf: MutPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT

public expect fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: MutPtr<CInt>): CInt

public expect fun pututline(u: ConstPtr<Utmp>): MutPtr<Utmp>

public expect fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun pwrite64(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT, offset: Off64T): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffsetT): SsizeT

public expect fun quotactl(cmd: MutPtr<CChar>, special: CInt, id: CInt, data: CaddrT): CInt

public expect fun rand(): CInt

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

// AIX header socket.h maps recvfrom() to nrecvfrom()
public expect fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt

// AIX header socket.h maps recvmsg() to nrecvmsg().
public expect fun recvmsg(sockfd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT

public expect fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT

public expect fun regexec(preg: ConstPtr<RegexT>, input: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt

public expect fun regfree(preg: MutPtr<RegexT>)

public expect fun sbrk(increment: IntptrT): MutPtr<CVoid>

public expect fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: MutPtr<CVoid>, size: MutPtr<SizeT>): CInt

public expect fun sctpPeeloff(s: CInt, id: MutPtr<CUint>): CInt

public expect fun seed48(xseed: MutPtr<CUshort>): MutPtr<CUshort>

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt

public expect fun sendFile(socket: MutPtr<CInt>, iobuf: MutPtr<SfParms>, flags: CUint): SsizeT

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt

// AIX header socket.h maps sendmsg() to nsendmsg().
public expect fun sendmsg(sockfd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT

public expect fun setcontext(ucp: ConstPtr<UcontextT>): CInt

public expect fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt

public expect fun setgrent()

public expect fun sethostid(hostid: CInt): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt

public expect fun setmntent(filename: ConstPtr<CChar>, ty: ConstPtr<CChar>): MutPtr<FILE>

public expect fun setpriority(which: CInt, who: IdT, priority: CInt): CInt

public expect fun setpwent()

public expect fun setrlimit(resource: CInt, rlim: ConstPtr<Rlimit>): CInt

public expect fun setrlimit64(resource: CInt, rlim: ConstPtr<Rlimit64>): CInt

public expect fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt

public expect fun setitimer(which: CInt, newValue: ConstPtr<Itimerval>, oldValue: MutPtr<Itimerval>): CInt

public expect fun setutent()

public expect fun setutxent()

public expect fun sigaltstack(ss: ConstPtr<StackT>, oss: MutPtr<StackT>): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

public expect fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid>

public expect fun shmdt(shmaddr: ConstPtr<CVoid>): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr<CChar>): CInt

public expect fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt

public expect fun srand(seed: CUint)

public expect fun srand48(seed: CLong)

public expect fun stat64(path: ConstPtr<CChar>, buf: MutPtr<Stat64>): CInt

public expect fun stat64at(dirfd: CInt, path: ConstPtr<CChar>, buf: MutPtr<Stat64>, flags: CInt): CInt

public expect fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt

public expect fun statfs64(path: ConstPtr<CChar>, buf: MutPtr<Statfs64>): CInt

public expect fun statvfs64(path: ConstPtr<CChar>, buf: MutPtr<Statvfs64>): CInt

public expect fun statx(path: ConstPtr<CChar>, buf: MutPtr<Stat>, length: CInt, command: CInt): CInt

public expect fun strcasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, locale: LocaleT): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun strftime(arg1: MutPtr<CChar>, arg2: SizeT, arg3: ConstPtr<CChar>, arg4: ConstPtr<Tm>): SizeT

public expect fun strncasecmpL(string1: ConstPtr<CChar>, string2: ConstPtr<CChar>, length: SizeT, locale: LocaleT): CInt

public expect fun strptime(s: ConstPtr<CChar>, format: ConstPtr<CChar>, tm: MutPtr<Tm>): MutPtr<CChar>

public expect fun strsep(string: MutPtr<MutPtr<CChar>>, delim: ConstPtr<CChar>): MutPtr<CChar>

public expect fun swapcontext(uocp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt

public expect fun swapoff(path: ConstPtr<CChar>): CInt

public expect fun swapon(path: ConstPtr<CChar>): CInt

public expect fun sync()

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun timerCreate(clockid: ClockidT, sevp: MutPtr<Sigevent>, timerid: MutPtr<TimerT>): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: MutPtr<Itimerspec>): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr<Itimerspec>, oldValue: MutPtr<Itimerspec>): CInt

public expect fun truncate64(path: ConstPtr<CChar>, length: Off64T): CInt

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun updwtmp(file: ConstPtr<CChar>, u: ConstPtr<Utmp>)

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun utmpname(file: ConstPtr<CChar>): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

// Use AIX thread-safe version errno.
public expect fun errno(): MutPtr<CInt>
