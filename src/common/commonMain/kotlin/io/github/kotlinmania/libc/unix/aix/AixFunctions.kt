package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CDouble
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.aix.powerpc64.FdSet
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCleanupPushRoutineCallback {
    public operator fun invoke(arg0: MutPtr)
}

public fun interface PthreadCreateStartRoutineCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public fun interface GlobErrfuncCallback {
    public operator fun invoke(epath: ConstPtr, errnum: CInt): CInt
}

public fun interface LfindComparCallback {
    public operator fun invoke(arg0: ConstPtr, arg1: ConstPtr): CInt
}

public fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress, ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawMeta)
    } else {
        MutPtr(0L)
    }

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr =
    if (((cmsg).rawAddress == 0L)) {
        cmsgFirsthdr(mhdr)
    } else {
        if ((cmsg.rawAddress.toInt() + ((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt() + sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) > (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt())) {
            MutPtr(0L)
        } else {
            // AIX does not have any alignment/padding for ancillary data, so we don't need _CMSG_ALIGN here.
            MutPtr((cmsg.rawAddress.toInt() + ((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()).toLong())
        }
    }

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(((MutPtr(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgLen(length: CUint): CUint = sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toUInt() + length

public fun cmsgSpace(length: CUint): CUint = sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()).toUInt() + length

public fun fdZero(set: MutPtr) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0L
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val bits = sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] or (1L shl (fd1 % bits))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdClr(fd: CInt, set: MutPtr) {
    val bits = sizeOf<CLong>(typeLayoutT = PrimitiveLayouts.I64) * 8
    val fd1 = fd
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / bits] = cur.fdsBits[fd1 / bits] and (1L shl (fd1 % bits)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
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

public expect fun pthreadAttrGetdetachstate(attr: ConstPtr, detachstate: MutPtr): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt

public expect fun pthreadAttrGetinheritsched(attr: ConstPtr, inheritsched: MutPtr): CInt

public expect fun pthreadAttrGetschedparam(attr: ConstPtr, param: MutPtr): CInt

public expect fun pthreadAttrGetstackaddr(attr: ConstPtr, stackaddr: MutPtr): CInt

public expect fun pthreadAttrGetschedpolicy(attr: ConstPtr, policy: MutPtr): CInt

public expect fun pthreadAttrGetscope(attr: ConstPtr, contentionscope: MutPtr): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt

public expect fun pthreadAttrSetinheritsched(attr: MutPtr, inheritsched: CInt): CInt

public expect fun pthreadAttrSetschedparam(attr: MutPtr, param: ConstPtr): CInt

public expect fun pthreadAttrSetschedpolicy(attr: MutPtr, policy: CInt): CInt

public expect fun pthreadAttrSetscope(attr: MutPtr, contentionscope: CInt): CInt

public expect fun pthreadAttrSetstack(attr: MutPtr, stackaddr: MutPtr, stacksize: SizeT): CInt

public expect fun pthreadAttrSetstackaddr(attr: MutPtr, stackaddr: MutPtr): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr): CInt

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadCleanupPop(execute: CInt)

public expect fun pthreadCleanupPush(routine: PthreadCleanupPushRoutineCallback?, arg: MutPtr)

public expect fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadCreate(thread: MutPtr, attr: ConstPtr, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr): CInt

public expect fun pthreadGetconcurrency(): CInt

public expect fun pthreadGetcpuclockid(threadId: PthreadT, clockId: MutPtr): CInt

public expect fun pthreadGetschedparam(thread: PthreadT, policy: MutPtr, param: MutPtr): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun pthreadMutexattrGetprioceiling(attr: ConstPtr, prioceiling: MutPtr): CInt

public expect fun pthreadMutexattrGetprotocol(attr: ConstPtr, protocol: MutPtr): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadMutexattrGetrobust(attr: ConstPtr, robust: MutPtr): CInt

public expect fun pthreadMutexattrGettype(attr: ConstPtr, type: MutPtr): CInt

public expect fun pthreadMutexattrSetprioceiling(attr: MutPtr, prioceiling: CInt): CInt

public expect fun pthreadMutexattrSetprotocol(attr: MutPtr, protocol: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadMutexattrSetrobust(attr: MutPtr, robust: CInt): CInt

public expect fun pthreadMutexConsistent(mutex: MutPtr): CInt

public expect fun pthreadMutexGetprioceiling(mutex: ConstPtr, prioceiling: MutPtr): CInt

public expect fun pthreadMutexSetprioceiling(mutex: MutPtr, prioceiling: CInt, oldCeiling: MutPtr): CInt

public expect fun pthreadMutexTimedlock(mutex: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadOnce(onceControl: MutPtr, initRoutine: PthreadAtforkPrepareCallback?): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadRwlockTimedrdlock(rwlock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadRwlockTimedwrlock(rwlock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadSetcancelstate(state: CInt, oldstate: MutPtr): CInt

public expect fun pthreadSetcanceltype(type: CInt, oldtype: MutPtr): CInt

public expect fun pthreadSetconcurrency(newLevel: CInt): CInt

public expect fun pthreadSetschedparam(thread: PthreadT, policy: CInt, param: ConstPtr): CInt

public expect fun pthreadSetschedprio(thread: PthreadT, prio: CInt): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oset: MutPtr): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr): CInt

public expect fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinLock(lock: MutPtr): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr): CInt

public expect fun pthreadTestcancel()

public expect fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT

public expect fun iconvClose(cd: IconvT): CInt

public expect fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT

public expect fun acct(filename: MutPtr): CInt

public expect fun aioCancel(fildes: CInt, aiocbp: MutPtr): CInt

public expect fun aioError(aiocbp: ConstPtr): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr): CInt

public expect fun aioRead(aiocbp: MutPtr): CInt

public expect fun aioReturn(aiocbp: MutPtr): SsizeT

public expect fun aioSuspend(list: ConstPtr, nent: CInt, timeout: ConstPtr): CInt

public expect fun aioWrite(aiocbp: MutPtr): CInt

public expect fun basename(path: MutPtr): MutPtr

public expect fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt

public expect fun brk(addr: MutPtr): CInt

public expect fun clearenv(): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt

public expect fun creat64(path: ConstPtr, mode: ModeT): CInt

public expect fun ctermid(s: MutPtr): MutPtr

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun dirname(path: MutPtr): MutPtr

public expect fun drand48(): CDouble

public expect fun duplocale(arg1: LocaleT): LocaleT

public expect fun endgrent()

public expect fun endmntent(streamp: MutPtr): CInt

public expect fun endpwent()

public expect fun endutent()

public expect fun endutxent()

public expect fun erand48(xseed: MutPtr): CDouble

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun fattach(fildes: CInt, path: ConstPtr): CInt

public expect fun fdatasync(fd: CInt): CInt

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun fexecve(fd: CInt, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun ffs(value: CInt): CInt

public expect fun ffsl(value: CLong): CInt

public expect fun ffsll(value: CLonglong): CInt

public expect fun fgetgrent(file: MutPtr): MutPtr

public expect fun fgetpos64(stream: MutPtr, ptr: MutPtr): CInt

public expect fun fgetpwent(file: MutPtr): MutPtr

public expect fun fopen64(filename: ConstPtr, mode: ConstPtr): MutPtr

public expect fun freelocale(loc: LocaleT)

public expect fun freopen64(filename: ConstPtr, mode: ConstPtr, file: MutPtr): MutPtr

public expect fun fseeko64(stream: MutPtr, offset: Off64T, whence: CInt): CInt

public expect fun fsetpos64(stream: MutPtr, ptr: ConstPtr): CInt

public expect fun fstat64(fildes: CInt, buf: MutPtr): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr): CInt

public expect fun fstatfs64(fd: CInt, buf: MutPtr): CInt

public expect fun fstatvfs64(fd: CInt, buf: MutPtr): CInt

public expect fun ftello64(stream: MutPtr): Off64T

public expect fun ftok(path: ConstPtr, id: CInt): KeyT

public expect fun ftruncate64(fd: CInt, length: Off64T): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun getcontext(ucp: MutPtr): CInt

public expect fun getdomainname(name: MutPtr, len: CInt): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrent(): MutPtr

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrset(user: ConstPtr): MutPtr

public expect fun gethostid(): CLong

public expect fun getmntent(stream: MutPtr): MutPtr

public expect fun getnameinfo(sa: ConstPtr, salen: SizeT, host: MutPtr, hostlen: SizeT, serv: MutPtr, servlen: SizeT, flags: CInt): CInt

public expect fun getpagesize(): CInt

public expect fun getpeereid(socket: CInt, euid: MutPtr, egid: MutPtr): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun getpwent(): MutPtr

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun getrlimit64(resource: CInt, rlim: MutPtr): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun getitimer(which: CInt, currValue: MutPtr): CInt

public expect fun getutent(): MutPtr

public expect fun getutid(u: ConstPtr): MutPtr

public expect fun getutline(u: ConstPtr): MutPtr

public expect fun getutxent(): MutPtr

public expect fun getutxid(ut: ConstPtr): MutPtr

public expect fun getutxline(ut: ConstPtr): MutPtr

public expect fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobErrfuncCallback?, pglob: MutPtr): CInt

public expect fun globfree(pglob: MutPtr)

public expect fun hasmntopt(mnt: ConstPtr, opt: ConstPtr): MutPtr

public expect fun hcreate(nelt: SizeT): CInt

public expect fun hdestroy()

public expect fun hsearch(entry: Entry, action: Action): MutPtr

public expect fun ifFreenameindex(ptr: MutPtr)

public expect fun ifNameindex(): MutPtr

public expect fun initgroups(name: ConstPtr, basegid: GidT): CInt

public expect fun ioctl(fildes: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun jrand48(xseed: MutPtr): CLong

public expect fun lcong48(p: MutPtr)

public expect fun lfind(key: ConstPtr, base: ConstPtr, nelp: MutPtr, width: SizeT, compar: LfindComparCallback?): MutPtr

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr, nent: CInt, sevp: MutPtr): CInt

public expect fun loadquery(flags: CInt, buf: MutPtr, buflen: CUint, vararg variadicArgs: Long): CInt

public expect fun lparGetInfo(command: CInt, buf: MutPtr, bufsize: SizeT): CInt

public expect fun lparSetResources(id: CInt, resource: MutPtr): CInt

public expect fun lrand48(): CLong

public expect fun lsearch(key: ConstPtr, base: MutPtr, nelp: MutPtr, width: SizeT, compar: LfindComparCallback?): MutPtr

public expect fun lseek64(fd: CInt, offset: Off64T, whence: CInt): Off64T

public expect fun lstat64(path: ConstPtr, buf: MutPtr): CInt

public expect fun madvise(addr: CaddrT, len: SizeT, advice: CInt): CInt

public expect fun makecontext(ucp: MutPtr, func: PthreadAtforkPrepareCallback, argc: CInt, vararg variadicArgs: Long)

public expect fun mallinfo(): Mallinfo

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr

public expect fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt

public expect fun mincore(addr: CaddrT, len: SizeT, vec: MutPtr): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun mount(device: ConstPtr, path: ConstPtr, flags: CInt): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun mqClose(mqd: MqdT): CInt

public expect fun mqGetattr(mqd: MqdT, attr: MutPtr): CInt

public expect fun mqNotify(mqd: MqdT, notification: ConstPtr): CInt

public expect fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqReceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT

public expect fun mqSend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqd: MqdT, newattr: ConstPtr, oldattr: MutPtr): CInt

public expect fun mqTimedreceive(mqd: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT

public expect fun mqTimedsend(mqd: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt

public expect fun mqUnlink(name: ConstPtr): CInt

public expect fun mrand48(): CLong

public expect fun msgctl(msqid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun msgget(key: KeyT, msgflg: CInt): CInt

public expect fun msgrcv(msqid: CInt, msgp: MutPtr, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT

public expect fun msgsnd(msqid: CInt, msgp: ConstPtr, msgsz: SizeT, msgflg: CInt): CInt

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun nlLanginfo(item: NlItem): MutPtr

public expect fun nlLanginfoL(item: NlItem, loc: LocaleT): MutPtr

public expect fun nrand48(xseed: MutPtr): CLong

public expect fun open64(path: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun pollsetCreate(maxfd: CInt): PollsetT

public expect fun pollsetCtl(ps: PollsetT, pollctlArray: MutPtr, arrayLength: CInt): CInt

public expect fun pollsetDestroy(ps: PollsetT): CInt

public expect fun pollsetPoll(ps: PollsetT, polldataArray: MutPtr, arrayLength: CInt, timeout: CInt): CInt

public expect fun pollsetQuery(ps: PollsetT, pollfdQuery: MutPtr): CInt

public expect fun popen(command: ConstPtr, mode: ConstPtr): MutPtr

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun posixFadvise64(fd: CInt, offset: Off64T, len: Off64T, advise: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun posixFallocate64(fd: CInt, offset: Off64T, len: Off64T): CInt

public expect fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr): CInt

public expect fun posixSpawnattrDestroy(attr: MutPtr): CInt

public expect fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrGetschedparam(attr: ConstPtr, param: MutPtr): CInt

public expect fun posixSpawnattrGetschedpolicy(attr: ConstPtr, flags: MutPtr): CInt

public expect fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt

public expect fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt

public expect fun posixSpawnattrInit(attr: MutPtr): CInt

public expect fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt

public expect fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt

public expect fun posixSpawnattrSetschedparam(attr: MutPtr, param: ConstPtr): CInt

public expect fun posixSpawnattrSetschedpolicy(attr: MutPtr, flags: CInt): CInt

public expect fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt

public expect fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt

public expect fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun pread64(fd: CInt, buf: MutPtr, count: SizeT, offset: Off64T): SsizeT

public expect fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffsetT): SsizeT

public expect fun ptrace64(request: CInt, id: CLonglong, addr: CLonglong, data: CInt, buff: MutPtr): CInt

public expect fun pututline(u: ConstPtr): MutPtr

public expect fun pututxline(ut: ConstPtr): MutPtr

public expect fun pwrite64(fd: CInt, buf: ConstPtr, count: SizeT, offset: Off64T): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffsetT): SsizeT

public expect fun quotactl(cmd: MutPtr, special: CInt, id: CInt, data: CaddrT): CInt

public expect fun rand(): CInt

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

// AIX header socket.h maps recvfrom() to nrecvfrom()
public expect fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt

// AIX header socket.h maps recvmsg() to nrecvmsg().
public expect fun recvmsg(sockfd: CInt, msg: MutPtr, flags: CInt): SsizeT

public expect fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT

public expect fun regexec(preg: ConstPtr, input: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt

public expect fun regfree(preg: MutPtr)

public expect fun sbrk(increment: IntptrT): MutPtr

public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

public expect fun sctpOptInfo(sd: CInt, id: SctpAssocT, opt: CInt, argSize: MutPtr, size: MutPtr): CInt

public expect fun sctpPeeloff(s: CInt, id: MutPtr): CInt

public expect fun seed48(xseed: MutPtr): MutPtr

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun semClose(sem: MutPtr): CInt

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr

public expect fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt

public expect fun semUnlink(name: ConstPtr): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflag: CInt): CInt

public expect fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt

public expect fun sendFile(socket: MutPtr, iobuf: MutPtr, flags: CUint): SsizeT

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt): CInt

// AIX header socket.h maps sendmsg() to nsendmsg().
public expect fun sendmsg(sockfd: CInt, msg: ConstPtr, flags: CInt): SsizeT

public expect fun setcontext(ucp: ConstPtr): CInt

public expect fun setdomainname(name: ConstPtr, len: CInt): CInt

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt

public expect fun setgrent()

public expect fun sethostid(hostid: CInt): CInt

public expect fun sethostname(name: ConstPtr, len: CInt): CInt

public expect fun setmntent(filename: ConstPtr, ty: ConstPtr): MutPtr

public expect fun setpriority(which: CInt, who: IdT, priority: CInt): CInt

public expect fun setpwent()

public expect fun setrlimit(resource: CInt, rlim: ConstPtr): CInt

public expect fun setrlimit64(resource: CInt, rlim: ConstPtr): CInt

public expect fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt

public expect fun setitimer(which: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun setutent()

public expect fun setutxent()

public expect fun sigaltstack(ss: ConstPtr, oss: MutPtr): CInt

public expect fun sigsuspend(mask: ConstPtr): CInt

public expect fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

public expect fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr

public expect fun shmdt(shmaddr: ConstPtr): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

public expect fun splice(socket1: CInt, socket2: CInt, flags: CInt): CInt

public expect fun srand(seed: CUint)

public expect fun srand48(seed: CLong)

public expect fun stat64(path: ConstPtr, buf: MutPtr): CInt

public expect fun stat64at(dirfd: CInt, path: ConstPtr, buf: MutPtr, flags: CInt): CInt

public expect fun statfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun statfs64(path: ConstPtr, buf: MutPtr): CInt

public expect fun statvfs64(path: ConstPtr, buf: MutPtr): CInt

public expect fun statx(path: ConstPtr, buf: MutPtr, length: CInt, command: CInt): CInt

public expect fun strcasecmpL(string1: ConstPtr, string2: ConstPtr, locale: LocaleT): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun strftime(arg1: MutPtr, arg2: SizeT, arg3: ConstPtr, arg4: ConstPtr): SizeT

public expect fun strncasecmpL(string1: ConstPtr, string2: ConstPtr, length: SizeT, locale: LocaleT): CInt

public expect fun strptime(s: ConstPtr, format: ConstPtr, tm: MutPtr): MutPtr

public expect fun strsep(string: MutPtr, delim: ConstPtr): MutPtr

public expect fun swapcontext(uocp: MutPtr, ucp: ConstPtr): CInt

public expect fun swapoff(path: ConstPtr): CInt

public expect fun swapon(path: ConstPtr): CInt

public expect fun sync()

public expect fun telldir(dirp: MutPtr): CLong

public expect fun timerCreate(clockid: ClockidT, sevp: MutPtr, timerid: MutPtr): CInt

public expect fun timerDelete(timerid: TimerT): CInt

public expect fun timerGetoverrun(timerid: TimerT): CInt

public expect fun timerGettime(timerid: TimerT, value: MutPtr): CInt

public expect fun timerSettime(timerid: TimerT, flags: CInt, newValue: ConstPtr, oldValue: MutPtr): CInt

public expect fun truncate64(path: ConstPtr, length: Off64T): CInt

public expect fun uname(buf: MutPtr): CInt

public expect fun updwtmp(file: ConstPtr, u: ConstPtr)

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun utmpname(file: ConstPtr): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

// Use AIX thread-safe version errno.
public expect fun errno(): MutPtr
