package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadAttrT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadCondT
import io.github.kotlinmania.libc.new.apple.libpthread.sys.pthread.pthreadtypes.PthreadMutexT
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.Sockaddr
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.Utsname
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.MallocZoneT
import io.github.kotlinmania.libc.unix.bsd.cmsgFirsthdr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: MutPtr<CVoid>, arg1: ConstPtr<CVoid>, arg2: ConstPtr<CVoid>): CInt
}

public fun darwinAlign32(p: Int): Int {
    val DARWIN_ALIGNBYTES32: Int = sizeOf<UInt>(typeLayoutT = PrimitiveLayouts.U32) - 1
    return (p + DARWIN_ALIGNBYTES32) and DARWIN_ALIGNBYTES32.inv()
}

public fun cmsgNxthdr(mhdr: ConstPtr<Msghdr>, cmsg: ConstPtr<Cmsghdr>): MutPtr<Cmsghdr> {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val cmsgLen = ((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()
    val next = cmsg.rawAddress.toInt() + darwinAlign32(cmsgLen)
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next + darwinAlign32(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) > max) {
        MutPtr(0L)
    } else {
        MutPtr<Cmsghdr>(next.toLong())
    }
}

public fun cmsgData(cmsg: ConstPtr<Cmsghdr>): MutPtr<CUchar> = MutPtr(((MutPtr<CUchar>(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((darwinAlign32(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

public fun cmsgSpace(length: CUint): CUint = (darwinAlign32(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) + darwinAlign32(length.toInt())).toUInt()

public fun cmsgLen(length: CUint): CUint = (darwinAlign32(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) + length.toInt()).toUInt()

public fun vmMakeTag(id: UByte): UInt = (id.toUInt()) shl 24u.toInt()

public fun wstopsig(status: CInt): CInt = status shr 8

public fun wstatus(status: CInt): CInt = status and 0x7f

public fun wifcontinued(status: CInt): Boolean = wstatus(status) == WSTOPPED1 && wstopsig(status) == 0x13

public fun wifsignaled(status: CInt): Boolean = wstatus(status) != WSTOPPED1 && wstatus(status) != 0

public fun wifstopped(status: CInt): Boolean = wstatus(status) == WSTOPPED1 && wstopsig(status) != 0x13

public fun makedev(major: Int, minor: Int): DevT = (major shl 24) or minor

public fun major(dev: DevT): Int = (dev shr 24) and 0xff

public fun minor(dev: DevT): Int = dev and 0xffffff

public expect fun setgrent()

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun semDestroy(sem: MutPtr<SemT>): CInt

public expect fun semInit(sem: MutPtr<SemT>, pshared: CInt, value: CUint): CInt

public expect fun aioRead(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioWrite(aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun aioError(aiocbp: ConstPtr<Aiocb>): CInt

public expect fun aioReturn(aiocbp: MutPtr<Aiocb>): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr<ConstPtr<Aiocb>>, nitems: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr<Aiocb>): CInt

public expect fun chflags(path: ConstPtr<CChar>, flags: CUint): CInt

public expect fun fchflags(fd: CInt, flags: CUint): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr<MutPtr<Aiocb>>, nitems: CInt, sevp: MutPtr<Sigevent>): CInt

public expect fun dirfd(dirp: MutPtr<DIR>): CInt

public expect fun lutimes(file: ConstPtr<CChar>, times: ConstPtr<Timeval>): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<CVoid>): CInt

public expect fun getutxent(): MutPtr<Utmpx>

public expect fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun setutxent()

public expect fun endutxent()

public expect fun utmpxname(file: ConstPtr<CChar>): CInt

public expect fun asctime(tm: ConstPtr<Tm>): MutPtr<CChar>

public expect fun ctime(clock: ConstPtr<TimeT>): MutPtr<CChar>

public expect fun getdate(datestr: ConstPtr<CChar>): MutPtr<Tm>

public expect fun strptime(buf: ConstPtr<CChar>, format: ConstPtr<CChar>, timeptr: MutPtr<Tm>): MutPtr<CChar>

public expect fun asctimeR(tm: ConstPtr<Tm>, result: MutPtr<CChar>): MutPtr<CChar>

public expect fun ctimeR(clock: ConstPtr<TimeT>, result: MutPtr<CChar>): MutPtr<CChar>

public expect fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt

public expect fun mincore(addr: ConstPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt

public expect fun sysctlnametomib(name: ConstPtr<CChar>, mibp: MutPtr<CInt>, sizep: MutPtr<SizeT>): CInt

public expect fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: MutPtr<Sembuf>, nsops: SizeT): CInt

public expect fun shmOpen(name: ConstPtr<CChar>, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun ftok(pathname: ConstPtr<CChar>, projId: CInt): KeyT

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr<CVoid>, shmflg: CInt): MutPtr<CVoid>

public expect fun shmdt(shmaddr: ConstPtr<CVoid>): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr<ShmidDs>): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun sysctl(name: MutPtr<CInt>, namelen: CUint, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt

public expect fun sysctlbyname(name: ConstPtr<CChar>, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt

public expect fun machAbsoluteTime(): ULong

public expect fun machTimebaseInfo(info: MutPtr<MachTimebaseInfo>): CInt

public expect fun machHostSelf(): MachPortT

public expect fun machThreadSelf(): MachPortT

public expect fun pthreadCondTimedwaitRelativeNp(cond: MutPtr<PthreadCondT>, lock: MutPtr<PthreadMutexT>, timeout: ConstPtr<Timespec>): CInt

public expect fun pthreadAttrGetscope(attr: ConstPtr<PthreadAttrT>, contentionscope: MutPtr<CInt>): CInt

public expect fun pthreadAttrGetstackaddr(attr: ConstPtr<PthreadAttrT>, stackaddr: MutPtr<MutPtr<CVoid>>): CInt

public expect fun pthreadAttrGetdetachstate(attr: ConstPtr<PthreadAttrT>, detachstate: MutPtr<CInt>): CInt

public expect fun pthreadAttrSetscope(attr: MutPtr<PthreadAttrT>, contentionscope: CInt): CInt

public expect fun pthreadAttrSetstackaddr(attr: MutPtr<PthreadAttrT>, stackaddr: MutPtr<CVoid>): CInt

public expect fun pthreadSetnameNp(name: ConstPtr<CChar>): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: SizeT): CInt

public expect fun pthreadMachThreadNp(thread: PthreadT): MachPortT

public expect fun pthreadFromMachThreadNp(port: MachPortT): PthreadT

public expect fun pthreadGetStackaddrNp(thread: PthreadT): MutPtr<CVoid>

public expect fun pthreadGetStacksizeNp(thread: PthreadT): SizeT

public expect fun pthreadMainNp(): CInt

public expect fun pthreadThreadidNp(thread: PthreadT, threadId: MutPtr<ULong>): CInt

public expect fun pthreadJitWriteProtectNp(enabled: CInt)

public expect fun pthreadJitWriteProtectSupportedNp(): CInt

// An array of pthreadJitWriteWithCallbackNp must declare
// the list of callbacks e.g.
// @linkSection= "__DATA_CONST,__pth_jit_func"
// static callbacks: [libc.pthreadJitWriteCallbackT; 2] = [nativeJitWriteCb,
// std.mem.transmute::<libc.pthreadJitWriteCallbackT>(std.ptr.nullVal())];
// (a handy PTHREAD_JIT_WRITE_CALLBACK_NP macro for other languages).
public expect fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: MutPtr<CVoid>): CInt

public expect fun pthreadJitWriteFreezeCallbacksNp()

public expect fun pthreadCpuNumberNp(cpuNumberOut: MutPtr<SizeT>): CInt

// Available starting with macOS 14.4.
public expect fun osSyncWaitOnAddress(addr: MutPtr<CVoid>, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt

public expect fun osSyncWaitOnAddressWithDeadline(addr: MutPtr<CVoid>, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt

public expect fun osSyncWaitOnAddressWithTimeout(addr: MutPtr<CVoid>, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt

public expect fun osSyncWakeByAddressAny(addr: MutPtr<CVoid>, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt

public expect fun osSyncWakeByAddressAll(addr: MutPtr<CVoid>, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt

public expect fun osUnfairLockLock(lock: OsUnfairLockT)

public expect fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean

public expect fun osUnfairLockUnlock(lock: OsUnfairLockT)

public expect fun osUnfairLockAssertOwner(lock: OsUnfairLockT)

public expect fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT)

public expect fun osLogCreate(subsystem: ConstPtr<CChar>, category: ConstPtr<CChar>): OsLogT

public expect fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean

public expect fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: ConstPtr<CVoid>): OsSignpostIdT

public expect fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT

public expect fun osSignpostEnabled(log: OsLogT): Boolean

public expect fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT

public expect fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MutPtr<MachMsgTypeNumberT>, getDefault: MutPtr<BooleanT>): KernReturnT

public expect fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MutPtr<MachMsgTypeNumberT>): KernReturnT

public expect fun error(): MutPtr<CInt>

public expect fun backtrace(buf: MutPtr<MutPtr<CVoid>>, sz: CInt): CInt

public expect fun backtraceSymbols(addrs: ConstPtr<MutPtr<CVoid>>, sz: CInt): MutPtr<MutPtr<CChar>>

public expect fun backtraceSymbolsFd(addrs: ConstPtr<MutPtr<CVoid>>, sz: CInt, fd: CInt)

public expect fun backtraceFromFp(startfp: MutPtr<CVoid>, array: MutPtr<MutPtr<CVoid>>, size: CInt): CInt

public expect fun backtraceImageOffsets(array: ConstPtr<MutPtr<CVoid>>, imageOffsets: MutPtr<ImageOffset>, size: CInt)

public expect fun backtraceAsync(array: MutPtr<MutPtr<CVoid>>, length: SizeT, taskId: MutPtr<UInt>): SizeT

public expect fun statfs(path: ConstPtr<CChar>, buf: MutPtr<Statfs>): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr<Statfs>): CInt

public expect fun kevent(kq: CInt, changelist: ConstPtr<Kevent>, nchanges: CInt, eventlist: MutPtr<Kevent>, nevents: CInt, timeout: ConstPtr<Timespec>): CInt

public expect fun kevent64(kq: CInt, changelist: ConstPtr<Kevent64S>, nchanges: CInt, eventlist: MutPtr<Kevent64S>, nevents: CInt, flags: CUint, timeout: ConstPtr<Timespec>): CInt

public expect fun mount(src: ConstPtr<CChar>, target: ConstPtr<CChar>, flags: CInt, data: MutPtr<CVoid>): CInt

public expect fun fmount(src: ConstPtr<CChar>, fd: CInt, flags: CInt, data: MutPtr<CVoid>): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: MutPtr<CChar>, data: CInt): CInt

public expect fun quotactl(special: ConstPtr<CChar>, cmd: CInt, id: CInt, data: MutPtr<CChar>): CInt

public expect fun sethostname(name: ConstPtr<CChar>, len: CInt): CInt

public expect fun sendfile(fd: CInt, s: CInt, offset: OffT, len: MutPtr<OffT>, hdtr: MutPtr<SfHdtr>, flags: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr<Timespec>): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr<CChar>, times: ConstPtr<Timespec>, flag: CInt): CInt

public expect fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt

public expect fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT): CInt

public expect fun localeconvL(loc: LocaleT): MutPtr<Lconv>

public expect fun newlocale(mask: CInt, locale: ConstPtr<CChar>, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun querylocale(mask: CInt, loc: LocaleT): ConstPtr<CChar>

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getdomainname(name: MutPtr<CChar>, len: CInt): CInt

public expect fun setdomainname(name: ConstPtr<CChar>, len: CInt): CInt

public expect fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT): SsizeT

public expect fun getxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT, position: UInt, flags: CInt): SsizeT

public expect fun fgetxattr(filedes: CInt, name: ConstPtr<CChar>, value: MutPtr<CVoid>, size: SizeT, position: UInt, flags: CInt): SsizeT

public expect fun setxattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, position: UInt, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: ConstPtr<CChar>, value: ConstPtr<CVoid>, size: SizeT, position: UInt, flags: CInt): CInt

public expect fun listxattr(path: ConstPtr<CChar>, list: MutPtr<CChar>, size: SizeT, flags: CInt): SsizeT

public expect fun flistxattr(filedes: CInt, list: MutPtr<CChar>, size: SizeT, flags: CInt): SsizeT

public expect fun removexattr(path: ConstPtr<CChar>, name: ConstPtr<CChar>, flags: CInt): CInt

public expect fun renamexNp(from: ConstPtr<CChar>, to: ConstPtr<CChar>, flags: CUint): CInt

public expect fun renameatxNp(fromfd: CInt, from: ConstPtr<CChar>, tofd: CInt, to: ConstPtr<CChar>, flags: CUint): CInt

public expect fun fremovexattr(filedes: CInt, name: ConstPtr<CChar>, flags: CInt): CInt

public expect fun getgrouplist(name: ConstPtr<CChar>, basegid: CInt, groups: MutPtr<CInt>, ngroups: MutPtr<CInt>): CInt

public expect fun initgroups(user: ConstPtr<CChar>, basegroup: CInt): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr<SiginfoT>, options: CInt): CInt

public expect fun brk(addr: ConstPtr<CVoid>): MutPtr<CVoid>

public expect fun sbrk(increment: CInt): MutPtr<CVoid>

public expect fun settimeofday(tv: ConstPtr<Timeval>, tz: ConstPtr<Timezone>): CInt

public expect fun dyldImageCount(): UInt

public expect fun dyldGetImageHeader(imageIndex: UInt): ConstPtr<MachHeader>

public expect fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT

public expect fun dyldGetImageName(imageIndex: UInt): ConstPtr<CChar>

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

public expect fun posixSpawnattrSetarchprefNp(attr: MutPtr<PosixSpawnattrT>, count: SizeT, pref: MutPtr<CpuTypeT>, subpref: MutPtr<CpuSubtypeT>, ocount: MutPtr<SizeT>): CInt

public expect fun posixSpawnattrGetarchprefNp(attr: ConstPtr<PosixSpawnattrT>, count: SizeT, pref: MutPtr<CpuTypeT>, subpref: MutPtr<CpuSubtypeT>, ocount: MutPtr<SizeT>): CInt

public expect fun posixSpawnattrGetbinprefNp(attr: ConstPtr<PosixSpawnattrT>, count: SizeT, pref: MutPtr<CpuTypeT>, ocount: MutPtr<SizeT>): CInt

public expect fun posixSpawnattrSetbinprefNp(attr: MutPtr<PosixSpawnattrT>, count: SizeT, pref: MutPtr<CpuTypeT>, ocount: MutPtr<SizeT>): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr<PosixSpawnFileActionsT>): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, path: ConstPtr<CChar>, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt, newfd: CInt): CInt

public expect fun uname(buf: MutPtr<Utsname>): CInt

public expect fun connectx(socket: CInt, endpoints: ConstPtr<SaEndpointsT>, associd: SaeAssocidT, flags: CUint, iov: ConstPtr<Iovec>, iovcnt: CUint, len: MutPtr<SizeT>, connid: MutPtr<SaeConnidT>): CInt

public expect fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt

public expect fun ntpAdjtime(buf: MutPtr<Timex>): CInt

public expect fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt

public expect fun getmntinfo(mntbufp: MutPtr<MutPtr<Statfs>>, flags: CInt): CInt

public expect fun getfsstat(mntbufp: MutPtr<Statfs>, bufsize: CInt, flags: CInt): CInt

// Copy-on-write functions.
// According to the man page `flags` is an `int` but in the header
// this is a `uint32T`.
public expect fun clonefile(src: ConstPtr<CChar>, dst: ConstPtr<CChar>, flags: UInt): CInt

public expect fun clonefileat(srcDirfd: CInt, src: ConstPtr<CChar>, dstDirfd: CInt, dst: ConstPtr<CChar>, flags: UInt): CInt

public expect fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: ConstPtr<CChar>, flags: UInt): CInt

public expect fun copyfile(from: ConstPtr<CChar>, to: ConstPtr<CChar>, state: CopyfileStateT, flags: CopyfileFlagsT): CInt

public expect fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt

public expect fun copyfileStateFree(s: CopyfileStateT): CInt

public expect fun copyfileStateAlloc(): CopyfileStateT

public expect fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: MutPtr<CVoid>): CInt

public expect fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: ConstPtr<CVoid>): CInt

public expect fun machErrorString(errorValue: MachErrorT): MutPtr<CChar>

// Added in macOS 10.13
// ISO/IEC 9899:2011 ("ISO C11") K.3.7.4.1
public expect fun memsetS(s: MutPtr<CVoid>, smax: SizeT, c: CInt, n: SizeT): CInt

// Added in macOS 10.5
public expect fun memsetPattern4(b: MutPtr<CVoid>, pattern4: ConstPtr<CVoid>, len: SizeT)

public expect fun memsetPattern8(b: MutPtr<CVoid>, pattern8: ConstPtr<CVoid>, len: SizeT)

public expect fun memsetPattern16(b: MutPtr<CVoid>, pattern16: ConstPtr<CVoid>, len: SizeT)

// Inherited from BSD but available from Big Sur only
public expect fun strtonum(numstr: ConstPtr<CChar>, minval: CLonglong, maxval: CLonglong, errstrp: MutPtr<ConstPtr<CChar>>): CLonglong

public expect fun mstats(): Mstats

public expect fun mallocPrintf(format: ConstPtr<CChar>, vararg variadicArgs: Long)

public expect fun mallocZoneCheck(zone: MutPtr<MallocZoneT>): BooleanT

public expect fun mallocZonePrint(zone: MutPtr<MallocZoneT>, verbose: BooleanT)

public expect fun mallocZoneStatistics(zone: MutPtr<MallocZoneT>, stats: MutPtr<MallocStatisticsT>)

public expect fun mallocZoneLog(zone: MutPtr<MallocZoneT>, address: MutPtr<CVoid>)

public expect fun mallocZonePrintPtrInfo(ptr: MutPtr<CVoid>)

public expect fun mallocDefaultZone(): MutPtr<MallocZoneT>

public expect fun mallocZoneFromPtr(ptr: ConstPtr<CVoid>): MutPtr<MallocZoneT>

public expect fun mallocZoneMalloc(zone: MutPtr<MallocZoneT>, size: SizeT): MutPtr<CVoid>

public expect fun mallocZoneValloc(zone: MutPtr<MallocZoneT>, size: SizeT): MutPtr<CVoid>

public expect fun mallocZoneCalloc(zone: MutPtr<MallocZoneT>, numItems: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun mallocZoneRealloc(zone: MutPtr<MallocZoneT>, ptr: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid>

public expect fun mallocZoneFree(zone: MutPtr<MallocZoneT>, ptr: MutPtr<CVoid>)

public expect fun procListpids(t: UInt, typeinfo: UInt, buffer: MutPtr<CVoid>, buffersize: CInt): CInt

public expect fun procListallpids(buffer: MutPtr<CVoid>, buffersize: CInt): CInt

public expect fun procListpgrppids(pgrpid: PidT, buffer: MutPtr<CVoid>, buffersize: CInt): CInt

public expect fun procListchildpids(ppid: PidT, buffer: MutPtr<CVoid>, buffersize: CInt): CInt

public expect fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: MutPtr<CVoid>, buffersize: CInt): CInt

public expect fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: MutPtr<CVoid>, buffersize: CInt): CInt

public expect fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: MutPtr<CVoid>, buffersize: CInt): CInt

public expect fun procPidpath(pid: CInt, buffer: MutPtr<CVoid>, buffersize: UInt): CInt

public expect fun procName(pid: CInt, buffer: MutPtr<CVoid>, buffersize: UInt): CInt

public expect fun procRegionfilename(pid: CInt, address: ULong, buffer: MutPtr<CVoid>, buffersize: UInt): CInt

public expect fun procKmsgbuf(buffer: MutPtr<CVoid>, buffersize: UInt): CInt

public expect fun procLibversion(major: MutPtr<CInt>, minor: MutPtr<CInt>): CInt

public expect fun procPidRusage(pid: CInt, flavor: CInt, buffer: MutPtr<RusageInfoT>): CInt

// Available from Big Sur
public expect fun procSetNoSmt(): CInt

public expect fun procSetthreadNoSmt(): CInt

public expect fun procSetCsm(flags: UInt): CInt

public expect fun procSetthreadCsm(flags: UInt): CInt

/**
 * # Notes
 *
 * `id` is of type [uuidT].
 */
public expect fun gethostuuid(id: MutPtr<UByte>, timeout: ConstPtr<Timespec>): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong)

public expect fun cCRandomGenerateBytes(bytes: MutPtr<CVoid>, size: SizeT): CCRNGStatus

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

// Note(1.0): should this actually be deprecated?
public expect fun nsgetExecutablePath(buf: MutPtr<CChar>, bufsize: MutPtr<UInt>): CInt

// crtExterns.h
public expect fun nsgetArgv(): MutPtr<MutPtr<MutPtr<CChar>>>

public expect fun nsgetArgc(): MutPtr<CInt>

public expect fun nsgetEnviron(): MutPtr<MutPtr<MutPtr<CChar>>>

public expect fun nsgetProgname(): MutPtr<MutPtr<CChar>>

public expect fun machVmMap(targetTask: VmMapT, address: MutPtr<MachVmAddressT>, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT

public expect fun vmAllocate(targetTask: VmMapT, address: MutPtr<VmAddressT>, size: VmSizeT, flags: CInt): KernReturnT

public expect fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT

public expect fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MutPtr<MachMsgTypeNumberT>): KernReturnT

public expect fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: MutPtr<NaturalT>, outProcessorInfo: MutPtr<ProcessorInfoArrayT>, outProcessorInfoCnt: MutPtr<MachMsgTypeNumberT>): KernReturnT

public expect var MACH_TASK_SELF: MachPortT

public expect fun taskForPid(host: MachPortT, pid: PidT, task: MutPtr<MachPortT>): KernReturnT

public expect fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MutPtr<MachMsgTypeNumberT>): KernReturnT

public expect fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: MutPtr<TaskT>): KernReturnT

public expect fun taskTerminate(targetTask: TaskT): KernReturnT

public expect fun taskThreads(targetTask: TaskInspectT, actList: MutPtr<ThreadActArrayT>, actListCnt: MutPtr<MachMsgTypeNumberT>): KernReturnT

public expect fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MutPtr<MachMsgTypeNumberT>): KernReturnT

// sysdir.h
public expect fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState

public expect fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: MutPtr<CChar>): SysdirSearchPathEnumerationState

public expect val VM_PAGE_SIZE: VmSizeT

public expect fun getattrlist(path: ConstPtr<CChar>, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: UInt): CInt

public expect fun fgetattrlist(fd: CInt, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: UInt): CInt

public expect fun getattrlistat(fd: CInt, path: ConstPtr<CChar>, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: CUlong): CInt

public expect fun setattrlist(path: ConstPtr<CChar>, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: UInt): CInt

public expect fun fsetattrlist(fd: CInt, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: UInt): CInt

public expect fun setattrlistat(dirFd: CInt, path: ConstPtr<CChar>, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: UInt): CInt

public expect fun getattrlistbulk(dirfd: CInt, attrList: MutPtr<CVoid>, attrBuf: MutPtr<CVoid>, attrBufSize: SizeT, options: ULong): CInt

public expect fun mallocSize(ptr: ConstPtr<CVoid>): SizeT

public expect fun mallocGoodSize(size: SizeT): SizeT

public expect fun dirname(path: MutPtr<CChar>): MutPtr<CChar>

public expect fun basename(path: MutPtr<CChar>): MutPtr<CChar>

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr<CChar>, mode: ModeT, dev: DevT): CInt

public expect fun freadlink(fd: CInt, buf: MutPtr<CChar>, size: SizeT): CInt

public expect fun execvP(file: ConstPtr<CChar>, searchPath: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>): CInt

public expect fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, arg: MutPtr<CVoid>, compar: QsortRComparCallback?)

public fun machTaskSelf(): MachPortT = MACH_TASK_SELF

public expect fun clockSettime(clockId: ClockidT, tp: ConstPtr<Timespec>): CInt

public expect fun memmem(haystack: ConstPtr<CVoid>, haystacklen: SizeT, needle: ConstPtr<CVoid>, needlelen: SizeT): MutPtr<CVoid>

public expect fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT

// These require a dependency on `libiconv`, and including this when built as
// part of `std` means every Rust program gets it. Ideally we would have a link
// modifier to only include these if they are used, but we do not.
public expect fun iconvOpen(tocode: ConstPtr<CChar>, fromcode: ConstPtr<CChar>): IconvT

public expect fun iconv(cd: IconvT, inbuf: MutPtr<MutPtr<CChar>>, inbytesleft: MutPtr<SizeT>, outbuf: MutPtr<MutPtr<CChar>>, outbytesleft: MutPtr<SizeT>): SizeT

public expect fun iconvClose(cd: IconvT): CInt
