@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.mem.sizeOfVal
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr): MutPtr
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr, size: SizeT, data: MutPtr): CInt
}

public fun cmsgAlign(len: Int): Int = len + sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1 and (sizeOf<Int>(typeLayoutT = PrimitiveLayouts.USIZE64) - 1).inv()

public fun align(p: Int, b: Int): Int = (p + b - 1) and (b - 1).inv()

// intentionally not public, only used for fdSet
// QNX Network Stack Versioning:
//
// The `if` block targets the legacy `io - pkt` stack.
// - targetEnv = "nto70": QNX 7.0
// - targetEnv = "nto71": Standard QNX 7.1 (default legacy stack)
//
// The `else` block targets the modern `io - sock` stack.
// - targetEnv = "nto71Iosock": QNX 7.1 with the optional new stack
// - targetEnv = "nto80": QNX 8.0
public fun cmsgFirsthdr(mhdr: ConstPtr): MutPtr =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress, ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawMeta)
    } else {
        MutPtr(0L)
    }

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    val msg = cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())
    val next = cmsg.rawAddress.toInt() + msg + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    return if (next > ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()) {
        MutPtr(0L)
    } else {
        MutPtr((cmsg.rawAddress.toInt() + msg).toLong())
    }
}

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(((MutPtr(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgLen(length: CUint): CUint = cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) + cmsgAlign(length.toInt())).toUInt()

public fun fdClr(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U32) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] and (1u shl (fd1 % size)).inv()
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U32) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1u shl (fd1 % size))) != 0u
}

public fun fdSet(fd: CInt, set: MutPtr) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0], PrimitiveLayouts.U32) * 8
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    cur.fdsBits[fd1 / size] = cur.fdsBits[fd1 / size] or (1u shl (fd1 % size))
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
    return
}

public fun fdZero(set: MutPtr) {
    val cur = (FdSet.typeLayout()).readNative((set).rawAddress)
    for (idx in cur.fdsBits.indices) {
        cur.fdsBits[idx] = 0u
    }
    (FdSet.typeLayout()).writeNative((set).rawAddress, cur)
}

public fun dextraFirst(d: ConstPtr): MutPtr {
    val s = d.rawAddress.toInt()
    return MutPtr(align(s + 20 + ((Dirent.typeLayout()).readNative((d).rawAddress).dNamelen).toInt() + 1, 8).toLong())
}

public fun dextraValid(x: ConstPtr, d: ConstPtr): Boolean {
    val sz = x.rawAddress.toInt() - d.rawAddress.toInt() + sizeOf<DirentExtra>(typeLayoutT = DirentExtra.typeLayout())
    val rsz = ((Dirent.typeLayout()).readNative((d).rawAddress).dReclen).toInt()
    return if (sz > rsz || sz + ((DirentExtra.typeLayout()).readNative((x).rawAddress).dDatalen).toInt() > rsz) {
        false
    } else {
        true
    }
}

public fun dextraNext(x: ConstPtr): MutPtr = MutPtr(align(x.rawAddress.toInt() + sizeOf<DirentExtra>(typeLayoutT = DirentExtra.typeLayout()) + ((DirentExtra.typeLayout()).readNative((x).rawAddress).dDatalen).toInt(), 8).toLong())

public fun sockcredsize(ngrps: Int): Int {
    val ngrps1 =
        if (ngrps > 0) {
            ngrps - 1
        } else {
            0
        }
    return sizeOf<Sockcred>(typeLayoutT = Sockcred.typeLayout()) + sizeOf<GidT>(typeLayoutT = PrimitiveLayouts.U16) * ngrps1
}

public fun wifstopped(status: CInt): Boolean = (status and 0xff) == 0x7f

public fun wstopsig(status: CInt): CInt = (status shr 8) and 0xff

public fun wifcontinued(status: CInt): Boolean = status == 0xffff

public fun wifsignaled(status: CInt): Boolean = ((status and 0x7f) + 1).toByte() >= 2.toByte()

public fun wtermsig(status: CInt): CInt = status and 0x7f

public fun wifexited(status: CInt): Boolean = (status and 0x7f) == 0

public fun wexitstatus(status: CInt): CInt = (status shr 8) and 0xff

public fun wcoredump(status: CInt): Boolean = (status and 0x80) != 0

public fun iptosEcn(x: UByte): UByte = x and IPTOS_ECN_MASK

public fun makedev(major: CUint, minor: CUint): DevT = ((major shl 10) or (minor))

public fun major(dev: DevT): CUint = ((dev) shr 10) and 0x3fu

public fun minor(dev: DevT): CUint = (dev) and 0x3ffu

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CUint, timeout: MutPtr): CInt

// Network related functions are provided by libsocket and regex
// functions are provided by libregex.
// In QNX <=7.0, libregex functions were included in libc itself.
public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun mknodat(fd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr, stackaddr: MutPtr, stacksize: MutPtr): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr, clockId: MutPtr): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr, value: MutPtr): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr, value: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr, buflen: SizeT): MutPtr

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

public expect fun wait4(pid: PidT, status: MutPtr, options: CInt, rusage: MutPtr): PidT

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt

public expect fun getifaddrs(ifap: MutPtr): CInt

public expect fun freeifaddrs(ifa: MutPtr)

public expect fun bind(socket: CInt, address: ConstPtr, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr, flags: CInt): SsizeT

public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt

public expect fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun uname(buf: MutPtr): CInt

public expect fun getpeereid(socket: CInt, euid: MutPtr, egid: MutPtr): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): MutPtr

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr

public expect fun setspent()

public expect fun endspent()

public expect fun shmOpen(name: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun ftok(pathname: ConstPtr, projId: CInt): KeyT

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun mkostemp(template: MutPtr, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr, suffixlen: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt

public expect fun sigwaitinfo(set: ConstPtr, info: MutPtr): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun ifNameindex(): MutPtr

public expect fun ifFreenameindex(ptr: MutPtr)

public expect fun glob(pattern: ConstPtr, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: MutPtr): CInt

public expect fun globfree(pglob: MutPtr)

public expect fun posixMadvise(addr: MutPtr, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: ConstPtr): CInt

public expect fun seekdir(dirp: MutPtr, loc: CLong)

public expect fun telldir(dirp: MutPtr): CLong

public expect fun msync(addr: MutPtr, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr, len: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT

public expect fun mkstemps(template: MutPtr, suffixlen: CInt): CInt

public expect fun getdomainname(name: MutPtr, len: SizeT): CInt

public expect fun setdomainname(name: ConstPtr, len: SizeT): CInt

public expect fun sync()

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr, param: MutPtr): CInt

public expect fun umount(target: ConstPtr, flags: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr): CInt

public expect fun semTimedwait(sem: MutPtr, abstime: ConstPtr): CInt

public expect fun semGetvalue(sem: MutPtr, sval: MutPtr): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr): CInt

public expect fun mount(specialDevice: ConstPtr, mountDirectory: ConstPtr, flags: CInt, mountType: ConstPtr, mountData: ConstPtr, mountDatalen: CInt): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr): CInt

public expect fun pthreadMutexConsistent(mutex: MutPtr): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr, abstime: ConstPtr): CInt

public expect fun pthreadSpinInit(lock: MutPtr, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr): CInt

public expect fun pthreadSpinLock(lock: MutPtr): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr, pshared: CInt): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr, attr: ConstPtr, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr, rmtp: MutPtr): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr, guardsize: MutPtr): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr, guardsize: SizeT): CInt

public expect fun sethostname(name: ConstPtr, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr): CInt

public expect fun sigsuspend(mask: ConstPtr): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun semClose(sem: MutPtr): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun initgroups(user: ConstPtr, group: GidT): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt

public expect fun semOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MutPtr

public expect fun getgrnam(name: ConstPtr): MutPtr

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: ConstPtr): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: ConstPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun sigwait(set: ConstPtr, sig: MutPtr): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr

public expect fun getgrouplist(user: ConstPtr, group: GidT, groups: MutPtr, ngroups: MutPtr): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr, pshared: MutPtr): CInt

public expect fun pthreadMutexattrGetrobust(attr: ConstPtr, robustness: MutPtr): CInt

public expect fun pthreadMutexattrSetrobust(attr: MutPtr, robustness: CInt): CInt

public expect fun pthreadCreate(native: MutPtr, attr: ConstPtr, f: PthreadCreateFCallback, value: MutPtr): CInt

public expect fun getitimer(which: CInt, currValue: MutPtr): CInt

public expect fun setitimer(which: CInt, value: ConstPtr, ovalue: MutPtr): CInt

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

public expect fun popen(command: ConstPtr, mode: ConstPtr): MutPtr

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr, mode: CInt, flags: CInt): CInt

public expect fun inotifyRmWatch(fd: CInt, wd: CInt): CInt

public expect fun inotifyInit(): CInt

public expect fun inotifyAddWatch(fd: CInt, path: ConstPtr, mask: UInt): CInt

public expect fun gettid(): PidT

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr): CInt

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

public expect fun mallopt(param: CInt, value: Long): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun ctermid(s: MutPtr): MutPtr

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun mallinfo(): Mallinfo

public expect fun getpwentR(pwd: MutPtr, buf: MutPtr, bufsize: CInt, result: MutPtr): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: CInt): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): CInt

public expect fun sysctl(arg0: ConstPtr, arg1: CUint, arg2: MutPtr, arg3: MutPtr, arg4: ConstPtr, arg5: SizeT): CInt

public expect fun getrlimit(resource: CInt, rlim: MutPtr): CInt

public expect fun setrlimit(resource: CInt, rlp: ConstPtr): CInt

public expect fun lioListio(mode: CInt, list: ConstPtr, nent: CInt, sig: MutPtr): CInt

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr): CInt

public expect fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt

public expect fun regcomp(preg: MutPtr, pattern: ConstPtr, cflags: CInt): CInt

public expect fun regexec(preg: ConstPtr, str: ConstPtr, nmatch: SizeT, pmatch: MutPtr, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr, errbuf: MutPtr, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr)

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun dircntl(dir: MutPtr, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt

public expect fun aioError(aiocbp: ConstPtr): CInt

public expect fun aioFsync(operation: CInt, aiocbp: MutPtr): CInt

public expect fun aioRead(aiocbp: MutPtr): CInt

public expect fun aioReturn(aiocpb: MutPtr): SsizeT

public expect fun aioSuspend(list: ConstPtr, nent: CInt, timeout: ConstPtr): CInt

public expect fun aioWrite(aiocpb: MutPtr): CInt

public expect fun mqClose(mqdes: MqdT): CInt

public expect fun mqGetattr(mqdes: MqdT, mqstat: MutPtr): CInt

public expect fun mqNotify(mqdes: MqdT, notification: ConstPtr): CInt

public expect fun mqOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqReceive(mqdes: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr): SsizeT

public expect fun mqSend(mqdes: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqdes: MqdT, mqstat: ConstPtr, omqstat: MutPtr): CInt

public expect fun mqTimedreceive(mqdes: MqdT, msgPtr: MutPtr, msgLen: SizeT, msgPrio: MutPtr, absTimeout: ConstPtr): SsizeT

public expect fun mqTimedsend(mqdes: MqdT, msgPtr: ConstPtr, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr): CInt

public expect fun mqUnlink(name: ConstPtr): CInt

public expect fun getErrnoPtr(): MutPtr

// System page, see https://www.qnx.com/developers/docs/7.1#com.qnx.doc.neutrino.building/topic/syspage/syspageAbout.html
public expect var SYSPAGE_PTR: MutPtr

// Function on the stack after a call to pthreadCreate().  This is used
// as a sentinel to work around an infitnite loop in the unwinding code.
public expect fun myThreadExit(valuePtr: MutPtr)

// Models the implementation in stdlib.h.  Ctest will fail if trying to use the
// default symbol from libc
public fun atexit(cb: PthreadAtforkPrepareCallback): CInt {
    val DSO_HANDLE: MutPtr = MutPtr(0L)

    fun cxaAtexit(cb1: PthreadAtforkPrepareCallback, arg: MutPtr, dso: MutPtr): CInt = 0
    return cxaAtexit(cb, MutPtr(0L), DSO_HANDLE)
}
