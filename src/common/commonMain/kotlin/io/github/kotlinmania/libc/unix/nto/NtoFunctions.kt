@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.GidT
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Itimerval
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Rusage
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.ObjectSlotLayout
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.constPtrFromRustCast
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface PthreadAtforkPrepareCallback {
    public operator fun invoke()
}

public fun interface PthreadCreateFCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>): MutPtr<CVoid>
}

public fun interface DlIteratePhdrCallbackCallback {
    public operator fun invoke(info: MutPtr<DlPhdrInfo>, size: SizeT, data: MutPtr<CVoid>): CInt
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
public fun cmsgFirsthdr(mhdr: ConstPtr<Msghdr>): MutPtr<Cmsghdr> =
    if (((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt() >= sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) {
        MutPtr<Cmsghdr>(((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress, ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawMeta)
    } else {
        MutPtr<Cmsghdr>(0L)
    }

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    val msg = cmsgAlign(((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt())
    val next = cmsg.rawAddress.toInt() + msg + cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))
    return if (next > ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()) {
        MutPtr<Cmsghdr>(0L)
    } else {
        MutPtr<Cmsghdr>((cmsg.rawAddress.toInt() + msg).toLong())
    }
}

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr(((MutPtr<CUchar>(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (ObjectSlotLayout<CUchar>()).strideBytes))

public fun cmsgLen(length: CUint): CUint = cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())).toUInt() + length

public fun cmsgSpace(length: CUint): CUint = (cmsgAlign(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) + cmsgAlign(length.toInt())).toUInt()

public fun fdClr(fd: CInt, set: MutPtr<FdSet>) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0]) * 8
    (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] = (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1u shl (fd1 % size)).inv()
    return
}

public fun fdIsset(fd: CInt, set: ConstPtr<FdSet>): Boolean {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0]) * 8
    return ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] and (1u shl (fd1 % size))) != 0u
}

public fun fdSet(fd: CInt, set: MutPtr<FdSet>) {
    val fd1 = fd
    val size = sizeOfVal((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[0]) * 8
    (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] = (FdSet.typeLayout()).readNative((set).rawAddress).fdsBits[fd1 / size] or (1u shl (fd1 % size))
    return
}

public fun fdZero(set: MutPtr<FdSet>) {
    for (idx in ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits).indices) {
        ((FdSet.typeLayout()).readNative((set).rawAddress).fdsBits)[idx] = 0u
    }
}

public fun dextraFirst(d: ConstPtr<Dirent>): MutPtr<DirentExtra> {
    val f = constPtrFromRustCast<UByteArray>(((Dirent.typeLayout()).readNative(((d)).rawAddress).dName))
    val s = d.rawAddress.toInt()
    return MutPtr<DirentExtra>(align(s + f.rawAddress.toInt() - s + ((Dirent.typeLayout()).readNative((d).rawAddress).dNamelen).toInt() + 1, 8).toLong())
}

public fun dextraValid(x: ConstPtr<DirentExtra>, d: ConstPtr<Dirent>): Boolean {
    val sz = x.rawAddress.toInt() - d.rawAddress.toInt() + sizeOf<DirentExtra>(typeLayoutT = ObjectSlotLayout<DirentExtra>())
    val rsz = ((Dirent.typeLayout()).readNative((d).rawAddress).dReclen).toInt()
    return if (sz > rsz || sz + ((ObjectSlotLayout<DirentExtra>()).readNative((x).rawAddress).dDatalen).toInt() > rsz) {
        false
    } else {
        true
    }
}

public fun dextraNext(x: ConstPtr<DirentExtra>): MutPtr<DirentExtra> = MutPtr<DirentExtra>(align(x.rawAddress.toInt() + sizeOf<DirentExtra>(typeLayoutT = ObjectSlotLayout<DirentExtra>()) + ((ObjectSlotLayout<DirentExtra>()).readNative((x).rawAddress).dDatalen).toInt(), 8).toLong())

public fun sockcredsize(ngrps: Int): Int {
    val ngrps1 =
        if (ngrps > 0) {
            ngrps - 1
        } else {
            0
        }
    return sizeOf<Sockcred>(typeLayoutT = ObjectSlotLayout<Sockcred>()) + sizeOf<GidT>(typeLayoutT = ObjectSlotLayout<GidT>()) * ngrps1
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

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CUint): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CUint, timeout: MutPtr<Timespec>): CInt

// Network related functions are provided by libsocket and regex
// functions are provided by libregex.
// In QNX <=7.0, libregex functions were included in libc itself.
public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun fdatasync(fd: CInt): CInt

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun mknodat(fd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockSettime(clkId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun clockGetcpuclockid(pid: PidT, clkId: MutPtr<ClockidT>): CInt

public expect fun pthreadAttrGetstack(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>, stacksize: MutPtr<SizeT>): CInt

public expect fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun setgroups(ngroups: CInt, ptr: ConstPtr<GidT>): CInt

public expect fun posixFadvise(fd: CInt, offset: OffT, len: OffT, advise: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun nlLanginfo(item: NlItem): MutPtr<CChar>

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt

public expect fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt

public expect fun pthreadCondattrSetpshared(attr: MutPtr<PthreadCondattrT>, pshared: CInt): CInt

public expect fun pthreadMutexattrSetpshared(attr: MutPtr<PthreadMutexattrT>, pshared: CInt): CInt

public expect fun pthreadRwlockattrGetpshared(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt

public expect fun pthreadRwlockattrSetpshared(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt

public expect fun ptsnameR(fd: CInt, buf: MutPtr<CChar>, buflen: SizeT): MutPtr<CChar>

public expect fun clearenv(): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt

public expect fun wait4(pid: PidT, status: MutPtr<CInt>, options: CInt, rusage: MutPtr<Rusage>): PidT

// DIFF(main): changed to `* const *` in e77f551de9
public expect fun execvpe(file: ConstPtr<CChar>, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt

public expect fun getifaddrs(ifap: MutPtr<MutPtr<Ifaddrs>>): CInt

public expect fun freeifaddrs(ifa: MutPtr<Ifaddrs>)

public expect fun bind(socket: CInt, address: ConstPtr<Sockaddr>, addressLen: SocklenT): CInt

public expect fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun readv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT

public expect fun sendmsg(fd: CInt, msg: ConstPtr<Msghdr>, flags: CInt): SsizeT

public expect fun recvmsg(fd: CInt, msg: MutPtr<Msghdr>, flags: CInt): SsizeT

public expect fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt

public expect fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun getpeereid(socket: CInt, euid: MutPtr<UidT>, egid: MutPtr<GidT>): CInt

public expect fun strerrorR(errnum: CInt, buf: MutPtr<CChar>, buflen: SizeT): CInt

public expect fun abs(i: CInt): CInt

public expect fun labs(i: CLong): CLong

public expect fun rand(): CInt

public expect fun srand(seed: CUint)

public expect fun setpwent()

public expect fun endpwent()

public expect fun getpwent(): MutPtr<Passwd>

public expect fun setgrent()

public expect fun endgrent()

public expect fun getgrent(): MutPtr<Group>

public expect fun setspent()

public expect fun endspent()

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun posixFallocate(fd: CInt, offset: OffT, len: OffT): CInt

public expect fun mkostemp(template: MutPtr<CChar>, flags: CInt): CInt

public expect fun mkostemps(template: MutPtr<CChar>, suffixlen: CInt, flags: CInt): CInt

public expect fun sigtimedwait(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>, timeout: ConstPtr<Timespec>): CInt

public expect fun sigwaitinfo(set: ConstPtr<SigsetT>, info: MutPtr<SiginfoT>): CInt

public expect fun pthreadSetschedprio(native: PthreadT, priority: CInt): CInt

public expect fun ifNameindex(): MutPtr<IfNameindex>

public expect fun ifFreenameindex(ptr: MutPtr<IfNameindex>)

public expect fun glob(pattern: ConstPtr<CChar>, flags: CInt, errfunc: GlobTGlErrfuncCallback?, pglob: MutPtr<GlobT>): CInt

public expect fun globfree(pglob: MutPtr<GlobT>)

public expect fun posixMadvise(addr: MutPtr<CVoid>, len: SizeT, advice: CInt): CInt

public expect fun shmUnlink(name: ConstPtr<CChar>): CInt

public expect fun seekdir(dirp: MutPtr<DIR>, loc: CLong)

public expect fun telldir(dirp: MutPtr<DIR>): CLong

public expect fun msync(addr: MutPtr<CVoid>, len: SizeT, flags: CInt): CInt

public expect fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT

public expect fun mkstemps(template: MutPtr<CChar>, suffixlen: CInt): CInt

public expect fun getdomainname(name: MutPtr<CChar>, len: SizeT): CInt

public expect fun setdomainname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun sync()

public expect fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt

public expect fun umount(target: ConstPtr<CChar>, flags: CInt): CInt

public expect fun schedGetPriorityMax(policy: CInt): CInt

public expect fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<CVoid>): CInt

public expect fun schedRrGetInterval(pid: PidT, tp: MutPtr<Timespec>): CInt

public expect fun semTimedwait(sem: MutPtr<SemT>, abstime: ConstPtr<Timespec>): CInt

public expect fun semGetvalue(sem: MutPtr<SemT>, sval: MutPtr<CInt>): CInt

public expect fun schedSetparam(pid: PidT, param: ConstPtr<SchedParam>): CInt

public expect fun mount(specialDevice: ConstPtr<CChar>, mountDirectory: ConstPtr<CChar>, flags: CInt, mountType: ConstPtr<CChar>, mountData: ConstPtr<CVoid>, mountDatalen: CInt): CInt

public expect fun schedGetparam(pid: PidT, param: MutPtr<SchedParam>): CInt

public expect fun pthreadMutexConsistent(mutex: MutPtr<PthreadMutexT>): CInt

public expect fun pthreadMutexTimedlock(lock: MutPtr<PthreadMutexT>, abstime: ConstPtr<Timespec>): CInt

public expect fun pthreadSpinInit(lock: MutPtr<PthreadSpinlockT>, pshared: CInt): CInt

public expect fun pthreadSpinDestroy(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinLock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinTrylock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadSpinUnlock(lock: MutPtr<PthreadSpinlockT>): CInt

public expect fun pthreadBarrierattrInit(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrDestroy(attr: MutPtr<PthreadBarrierattrT>): CInt

public expect fun pthreadBarrierattrGetpshared(attr: ConstPtr<PthreadBarrierattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadBarrierattrSetpshared(attr: MutPtr<PthreadBarrierattrT>, pshared: CInt): CInt

public expect fun pthreadBarrierInit(barrier: MutPtr<PthreadBarrierT>, attr: ConstPtr<PthreadBarrierattrT>, count: CUint): CInt

public expect fun pthreadBarrierDestroy(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun pthreadBarrierWait(barrier: MutPtr<PthreadBarrierT>): CInt

public expect fun schedGetscheduler(pid: PidT): CInt

public expect fun clockNanosleep(clkId: ClockidT, flags: CInt, rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt

public expect fun pthreadAttrGetguardsize(attr: ConstPtr<PthreadAttrT>, guardsize: MutPtr<SizeT>): CInt

public expect fun pthreadAttrSetguardsize(attr: MutPtr<PthreadAttrT>, guardsize: SizeT): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: SizeT): CInt

public expect fun schedGetPriorityMin(policy: CInt): CInt

public expect fun pthreadCondattrGetpshared(attr: ConstPtr<PthreadCondattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun schedSetscheduler(pid: PidT, policy: CInt, param: ConstPtr<SchedParam>): CInt

public expect fun sigsuspend(mask: ConstPtr<SigsetT>): CInt

public expect fun getgrgidR(gid: GidT, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun semClose(sem: MutPtr<SemT>): CInt

public expect fun getdtablesize(): CInt

public expect fun getgrnamR(name: ConstPtr<CChar>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun initgroups(user: ConstPtr<CChar>, group: GidT): CInt

public expect fun pthreadSigmask(how: CInt, set: ConstPtr<SigsetT>, oldset: MutPtr<SigsetT>): CInt

public expect fun semOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MutPtr<SemT>

public expect fun getgrnam(name: ConstPtr<CChar>): MutPtr<Group>

public expect fun pthreadCancel(thread: PthreadT): CInt

public expect fun pthreadKill(thread: PthreadT, sig: CInt): CInt

public expect fun semUnlink(name: ConstPtr<CChar>): CInt

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun getpwnamR(name: ConstPtr<CChar>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getpwuidR(uid: UidT, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun sigwait(set: ConstPtr<SigsetT>, sig: MutPtr<CInt>): CInt

public expect fun pthreadAtfork(prepare: PthreadAtforkPrepareCallback?, parent: PthreadAtforkPrepareCallback?, child: PthreadAtforkPrepareCallback?): CInt

public expect fun getgrgid(gid: GidT): MutPtr<Group>

public expect fun getgrouplist(user: ConstPtr<CChar>, group: GidT, groups: MutPtr<GidT>, ngroups: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrGetpshared(attr: ConstPtr<PthreadMutexattrT>, pshared: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrGetrobust(attr: ConstPtr<PthreadMutexattrT>, robustness: MutPtr<CInt>): CInt

public expect fun pthreadMutexattrSetrobust(attr: MutPtr<PthreadMutexattrT>, robustness: CInt): CInt

public expect fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt

public expect fun getitimer(which: CInt, currValue: MutPtr<Itimerval>): CInt

public expect fun setitimer(which: CInt, value: ConstPtr<Itimerval>, ovalue: MutPtr<Itimerval>): CInt

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

public expect fun popen(command: ConstPtr<CChar>, mode: ConstPtr<CChar>): MutPtr<FILE>

public expect fun faccessat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: CInt, flags: CInt): CInt

public expect fun inotifyRmWatch(fd: CInt, wd: CInt): CInt

public expect fun inotifyInit(): CInt

public expect fun inotifyAddWatch(fd: CInt, path: ConstPtr<CChar>, mask: UInt): CInt

public expect fun gettid(): PidT

public expect fun pthreadGetcpuclockid(thread: PthreadT, clkId: MutPtr<ClockidT>): CInt

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt

public expect fun mallopt(param: CInt, value: Long): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun ctermid(s: MutPtr<CChar>): MutPtr<CChar>

public expect fun ioctl(fd: CInt, request: CInt, vararg variadicArgs: Long): CInt

public expect fun mallinfo(): Mallinfo

public expect fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, bufsize: CInt, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: CInt): CInt

public expect fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): CInt

public expect fun sysctl(arg0: ConstPtr<CInt>, arg1: CUint, arg2: MutPtr<CVoid>, arg3: MutPtr<SizeT>, arg4: ConstPtr<CVoid>, arg5: SizeT): CInt

public expect fun getrlimit(resource: CInt, rlim: MutPtr<Rlimit>): CInt

public expect fun setrlimit(resource: CInt, rlp: ConstPtr<Rlimit>): CInt

public expect fun lioListio(mode: CInt, list: ConstPtr<MutPtr<Aiocb>>, nent: CInt, sig: MutPtr<Sigevent>): CInt

public expect fun dlIteratePhdr(callback: DlIteratePhdrCallbackCallback?, data: MutPtr<CVoid>): CInt

public expect fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt

public expect fun regcomp(preg: MutPtr<RegexT>, pattern: ConstPtr<CChar>, cflags: CInt): CInt

public expect fun regexec(preg: ConstPtr<RegexT>, str: ConstPtr<CChar>, nmatch: SizeT, pmatch: MutPtr<RegmatchT>, eflags: CInt): CInt

public expect fun regerror(errcode: CInt, preg: ConstPtr<RegexT>, errbuf: MutPtr<CChar>, errbufSize: SizeT): SizeT

public expect fun regfree(preg: MutPtr<RegexT>)

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun dircntl(dir: MutPtr<DIR>, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioError(aiocbp: ConstPtr<Aiocb>): CInt

public expect fun aioFsync(operation: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioRead(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioReturn(aiocpb: MutPtr<Aiocb>): SsizeT

public expect fun aioSuspend(list: ConstPtr<ConstPtr<Aiocb>>, nent: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun aioWrite(aiocpb: MutPtr<Aiocb>): CInt

public expect fun mqClose(mqdes: MqdT): CInt

public expect fun mqGetattr(mqdes: MqdT, mqstat: MutPtr<MqAttr>): CInt

public expect fun mqNotify(mqdes: MqdT, notification: ConstPtr<Sigevent>): CInt

public expect fun mqOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): MqdT

public expect fun mqReceive(mqdes: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>): SsizeT

public expect fun mqSend(mqdes: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint): CInt

public expect fun mqSetattr(mqdes: MqdT, mqstat: ConstPtr<MqAttr>, omqstat: MutPtr<MqAttr>): CInt

public expect fun mqTimedreceive(mqdes: MqdT, msgPtr: MutPtr<CChar>, msgLen: SizeT, msgPrio: MutPtr<CUint>, absTimeout: ConstPtr<Timespec>): SsizeT

public expect fun mqTimedsend(mqdes: MqdT, msgPtr: ConstPtr<CChar>, msgLen: SizeT, msgPrio: CUint, absTimeout: ConstPtr<Timespec>): CInt

public expect fun mqUnlink(name: ConstPtr<CChar>): CInt

public expect fun getErrnoPtr(): MutPtr<CInt>

// System page, see https://www.qnx.com/developers/docs/7.1#com.qnx.doc.neutrino.building/topic/syspage/syspageAbout.html
public expect var SYSPAGE_PTR: MutPtr<SyspageEntry>

// Function on the stack after a call to pthreadCreate().  This is used
// as a sentinel to work around an infitnite loop in the unwinding code.
public expect fun myThreadExit(valuePtr: MutPtr<ConstPtr<CVoid>>)

// Models the implementation in stdlib.h.  Ctest will fail if trying to use the
// default symbol from libc
public fun atexit(cb: PthreadAtforkPrepareCallback): CInt {
    val DSO_HANDLE: MutPtr<CVoid> = MutPtr(0L)

    fun cxaAtexit(cb1: PthreadAtforkPrepareCallback, arg: MutPtr<CVoid>, dso: MutPtr<CVoid>): CInt = 0
    return cxaAtexit(cb, MutPtr<CVoid>(0L), DSO_HANDLE)
}
