package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.IntptrT
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.Cmsghdr
import io.github.kotlinmania.libc.unix.bsd.Msghdr
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import io.github.kotlinmania.libc.unix.bsd.cmsgFirsthdr
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: MutPtr, arg1: ConstPtr, arg2: ConstPtr): CInt
}

public fun darwinAlign32(p: Int): Int {
    val DARWIN_ALIGNBYTES32: Int = sizeOf<UInt>(typeLayoutT = PrimitiveLayouts.U32) - 1
    return (p + DARWIN_ALIGNBYTES32) and DARWIN_ALIGNBYTES32.inv()
}

public fun cmsgNxthdr(mhdr: ConstPtr, cmsg: ConstPtr): MutPtr {
    if (((cmsg).rawAddress == 0L)) {
        return cmsgFirsthdr(mhdr)
    }
    val cmsgLen = ((Cmsghdr.typeLayout()).readNative((cmsg).rawAddress).cmsgLen).toInt()
    val next = cmsg.rawAddress.toInt() + darwinAlign32(cmsgLen)
    val max = ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControl).rawAddress.toInt() + ((Msghdr.typeLayout()).readNative((mhdr).rawAddress).msgControllen).toInt()
    return if (next + darwinAlign32(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout())) > max) {
        MutPtr(0L)
    } else {
        MutPtr(next.toLong())
    }
}

public fun cmsgData(cmsg: ConstPtr): MutPtr = MutPtr(((MutPtr(cmsg.rawAddress, cmsg.rawMeta))).rawAddress + ((darwinAlign32(sizeOf<Cmsghdr>(typeLayoutT = Cmsghdr.typeLayout()))).toLong() * (PrimitiveLayouts.U8).strideBytes))

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

public expect fun semDestroy(sem: MutPtr): CInt

public expect fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt

public expect fun aioRead(aiocbp: MutPtr): CInt

public expect fun aioWrite(aiocbp: MutPtr): CInt

public expect fun aioFsync(op: CInt, aiocbp: MutPtr): CInt

public expect fun aioError(aiocbp: ConstPtr): CInt

public expect fun aioReturn(aiocbp: MutPtr): SsizeT

public expect fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt

public expect fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt

public expect fun chflags(path: ConstPtr, flags: CUint): CInt

public expect fun fchflags(fd: CInt, flags: CUint): CInt

public expect fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt

public expect fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt

public expect fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt

public expect fun dirfd(dirp: MutPtr): CInt

public expect fun lutimes(file: ConstPtr, times: ConstPtr): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun getutxent(): MutPtr

public expect fun getutxid(ut: ConstPtr): MutPtr

public expect fun getutxline(ut: ConstPtr): MutPtr

public expect fun pututxline(ut: ConstPtr): MutPtr

public expect fun setutxent()

public expect fun endutxent()

public expect fun utmpxname(file: ConstPtr): CInt

public expect fun asctime(tm: ConstPtr): MutPtr

public expect fun ctime(clock: ConstPtr): MutPtr

public expect fun getdate(datestr: ConstPtr): MutPtr

public expect fun strptime(buf: ConstPtr, format: ConstPtr, timeptr: MutPtr): MutPtr

public expect fun asctimeR(tm: ConstPtr, result: MutPtr): MutPtr

public expect fun ctimeR(clock: ConstPtr, result: MutPtr): MutPtr

public expect fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt

public expect fun mincore(addr: ConstPtr, len: SizeT, vec: MutPtr): CInt

public expect fun sysctlnametomib(name: ConstPtr, mibp: MutPtr, sizep: MutPtr): CInt

public expect fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt

public expect fun shmOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun ftok(pathname: ConstPtr, projId: CInt): KeyT

public expect fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr

public expect fun shmdt(shmaddr: ConstPtr): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun sysctl(name: MutPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt

public expect fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt

public expect fun machAbsoluteTime(): ULong

public expect fun machTimebaseInfo(info: MutPtr): CInt

public expect fun machHostSelf(): MachPortT

public expect fun machThreadSelf(): MachPortT

public expect fun pthreadCondTimedwaitRelativeNp(cond: MutPtr, lock: MutPtr, timeout: ConstPtr): CInt

public expect fun pthreadAttrGetscope(attr: ConstPtr, contentionscope: MutPtr): CInt

public expect fun pthreadAttrGetstackaddr(attr: ConstPtr, stackaddr: MutPtr): CInt

public expect fun pthreadAttrGetdetachstate(attr: ConstPtr, detachstate: MutPtr): CInt

public expect fun pthreadAttrSetscope(attr: MutPtr, contentionscope: CInt): CInt

public expect fun pthreadAttrSetstackaddr(attr: MutPtr, stackaddr: MutPtr): CInt

public expect fun pthreadSetnameNp(name: ConstPtr): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt

public expect fun pthreadMachThreadNp(thread: PthreadT): MachPortT

public expect fun pthreadFromMachThreadNp(port: MachPortT): PthreadT

public expect fun pthreadGetStackaddrNp(thread: PthreadT): MutPtr

public expect fun pthreadGetStacksizeNp(thread: PthreadT): SizeT

public expect fun pthreadMainNp(): CInt

public expect fun pthreadThreadidNp(thread: PthreadT, threadId: MutPtr): CInt

public expect fun pthreadJitWriteProtectNp(enabled: CInt)

public expect fun pthreadJitWriteProtectSupportedNp(): CInt

// An array of pthreadJitWriteWithCallbackNp must declare
// the list of callbacks e.g.
// @linkSection= "__DATA_CONST,__pth_jit_func"
// static callbacks: [libc.pthreadJitWriteCallbackT; 2] = [nativeJitWriteCb,
// std.mem.transmute::<libc.pthreadJitWriteCallbackT>(std.ptr.nullVal())];
// (a handy PTHREAD_JIT_WRITE_CALLBACK_NP macro for other languages).
public expect fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: MutPtr): CInt

public expect fun pthreadJitWriteFreezeCallbacksNp()

public expect fun pthreadCpuNumberNp(cpuNumberOut: MutPtr): CInt

// Available starting with macOS 14.4.
public expect fun osSyncWaitOnAddress(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt

public expect fun osSyncWaitOnAddressWithDeadline(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt

public expect fun osSyncWaitOnAddressWithTimeout(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt

public expect fun osSyncWakeByAddressAny(addr: MutPtr, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt

public expect fun osSyncWakeByAddressAll(addr: MutPtr, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt

public expect fun osUnfairLockLock(lock: OsUnfairLockT)

public expect fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean

public expect fun osUnfairLockUnlock(lock: OsUnfairLockT)

public expect fun osUnfairLockAssertOwner(lock: OsUnfairLockT)

public expect fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT)

public expect fun osLogCreate(subsystem: ConstPtr, category: ConstPtr): OsLogT

public expect fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean

public expect fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: ConstPtr): OsSignpostIdT

public expect fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT

public expect fun osSignpostEnabled(log: OsLogT): Boolean

public expect fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT

public expect fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MutPtr, getDefault: MutPtr): KernReturnT

public expect fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MutPtr): KernReturnT

public expect fun error(): MutPtr

public expect fun backtrace(buf: MutPtr, sz: CInt): CInt

public expect fun backtraceSymbols(addrs: ConstPtr, sz: CInt): MutPtr

public expect fun backtraceSymbolsFd(addrs: ConstPtr, sz: CInt, fd: CInt)

public expect fun backtraceFromFp(startfp: MutPtr, array: MutPtr, size: CInt): CInt

public expect fun backtraceImageOffsets(array: ConstPtr, imageOffsets: MutPtr, size: CInt)

public expect fun backtraceAsync(array: MutPtr, length: SizeT, taskId: MutPtr): SizeT

public expect fun statfs(path: ConstPtr, buf: MutPtr): CInt

public expect fun fstatfs(fd: CInt, buf: MutPtr): CInt

public expect fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt

public expect fun kevent64(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, flags: CUint, timeout: ConstPtr): CInt

public expect fun mount(src: ConstPtr, target: ConstPtr, flags: CInt, data: MutPtr): CInt

public expect fun fmount(src: ConstPtr, fd: CInt, flags: CInt, data: MutPtr): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt

public expect fun quotactl(special: ConstPtr, cmd: CInt, id: CInt, data: MutPtr): CInt

public expect fun sethostname(name: ConstPtr, len: CInt): CInt

public expect fun sendfile(fd: CInt, s: CInt, offset: OffT, len: MutPtr, hdtr: MutPtr, flags: CInt): CInt

public expect fun futimens(fd: CInt, times: ConstPtr): CInt

public expect fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt

public expect fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt

public expect fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT): CInt

public expect fun localeconvL(loc: LocaleT): MutPtr

public expect fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun querylocale(mask: CInt, loc: LocaleT): ConstPtr

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getdomainname(name: MutPtr, len: CInt): CInt

public expect fun setdomainname(name: ConstPtr, len: CInt): CInt

public expect fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT

public expect fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT, position: UInt, flags: CInt): SsizeT

public expect fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT, position: UInt, flags: CInt): SsizeT

public expect fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, position: UInt, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, position: UInt, flags: CInt): CInt

public expect fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT, flags: CInt): SsizeT

public expect fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT, flags: CInt): SsizeT

public expect fun removexattr(path: ConstPtr, name: ConstPtr, flags: CInt): CInt

public expect fun renamexNp(from: ConstPtr, to: ConstPtr, flags: CUint): CInt

public expect fun renameatxNp(fromfd: CInt, from: ConstPtr, tofd: CInt, to: ConstPtr, flags: CUint): CInt

public expect fun fremovexattr(filedes: CInt, name: ConstPtr, flags: CInt): CInt

public expect fun getgrouplist(name: ConstPtr, basegid: CInt, groups: MutPtr, ngroups: MutPtr): CInt

public expect fun initgroups(user: ConstPtr, basegroup: CInt): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt

public expect fun brk(addr: ConstPtr): MutPtr

public expect fun sbrk(increment: CInt): MutPtr

public expect fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt

public expect fun dyldImageCount(): UInt

public expect fun dyldGetImageHeader(imageIndex: UInt): ConstPtr

public expect fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT

public expect fun dyldGetImageName(imageIndex: UInt): ConstPtr

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

public expect fun posixSpawnattrSetarchprefNp(attr: MutPtr, count: SizeT, pref: MutPtr, subpref: MutPtr, ocount: MutPtr): CInt

public expect fun posixSpawnattrGetarchprefNp(attr: ConstPtr, count: SizeT, pref: MutPtr, subpref: MutPtr, ocount: MutPtr): CInt

public expect fun posixSpawnattrGetbinprefNp(attr: ConstPtr, count: SizeT, pref: MutPtr, ocount: MutPtr): CInt

public expect fun posixSpawnattrSetbinprefNp(attr: MutPtr, count: SizeT, pref: MutPtr, ocount: MutPtr): CInt

public expect fun posixSpawnFileActionsInit(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt

public expect fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt

public expect fun uname(buf: MutPtr): CInt

public expect fun connectx(socket: CInt, endpoints: ConstPtr, associd: SaeAssocidT, flags: CUint, iov: ConstPtr, iovcnt: CUint, len: MutPtr, connid: MutPtr): CInt

public expect fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt

public expect fun ntpAdjtime(buf: MutPtr): CInt

public expect fun ntpGettime(buf: MutPtr): CInt

public expect fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt

public expect fun getfsstat(mntbufp: MutPtr, bufsize: CInt, flags: CInt): CInt

// Copy-on-write functions.
// According to the man page `flags` is an `int` but in the header
// this is a `uint32T`.
public expect fun clonefile(src: ConstPtr, dst: ConstPtr, flags: UInt): CInt

public expect fun clonefileat(srcDirfd: CInt, src: ConstPtr, dstDirfd: CInt, dst: ConstPtr, flags: UInt): CInt

public expect fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: ConstPtr, flags: UInt): CInt

public expect fun copyfile(from: ConstPtr, to: ConstPtr, state: CopyfileStateT, flags: CopyfileFlagsT): CInt

public expect fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt

public expect fun copyfileStateFree(s: CopyfileStateT): CInt

public expect fun copyfileStateAlloc(): CopyfileStateT

public expect fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: MutPtr): CInt

public expect fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: ConstPtr): CInt

public expect fun machErrorString(errorValue: MachErrorT): MutPtr

// Added in macOS 10.13
// ISO/IEC 9899:2011 ("ISO C11") K.3.7.4.1
public expect fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt

// Added in macOS 10.5
public expect fun memsetPattern4(b: MutPtr, pattern4: ConstPtr, len: SizeT)

public expect fun memsetPattern8(b: MutPtr, pattern8: ConstPtr, len: SizeT)

public expect fun memsetPattern16(b: MutPtr, pattern16: ConstPtr, len: SizeT)

// Inherited from BSD but available from Big Sur only
public expect fun strtonum(numstr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstrp: MutPtr): CLonglong

public expect fun mstats(): Mstats

public expect fun mallocPrintf(format: ConstPtr, vararg variadicArgs: Long)

public expect fun mallocZoneCheck(zone: MutPtr): BooleanT

public expect fun mallocZonePrint(zone: MutPtr, verbose: BooleanT)

public expect fun mallocZoneStatistics(zone: MutPtr, stats: MutPtr)

public expect fun mallocZoneLog(zone: MutPtr, address: MutPtr)

public expect fun mallocZonePrintPtrInfo(ptr: MutPtr)

public expect fun mallocDefaultZone(): MutPtr

public expect fun mallocZoneFromPtr(ptr: ConstPtr): MutPtr

public expect fun mallocZoneMalloc(zone: MutPtr, size: SizeT): MutPtr

public expect fun mallocZoneValloc(zone: MutPtr, size: SizeT): MutPtr

public expect fun mallocZoneCalloc(zone: MutPtr, numItems: SizeT, size: SizeT): MutPtr

public expect fun mallocZoneRealloc(zone: MutPtr, ptr: MutPtr, size: SizeT): MutPtr

public expect fun mallocZoneFree(zone: MutPtr, ptr: MutPtr)

public expect fun procListpids(t: UInt, typeinfo: UInt, buffer: MutPtr, buffersize: CInt): CInt

public expect fun procListallpids(buffer: MutPtr, buffersize: CInt): CInt

public expect fun procListpgrppids(pgrpid: PidT, buffer: MutPtr, buffersize: CInt): CInt

public expect fun procListchildpids(ppid: PidT, buffer: MutPtr, buffersize: CInt): CInt

public expect fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: MutPtr, buffersize: CInt): CInt

public expect fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: MutPtr, buffersize: CInt): CInt

public expect fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: MutPtr, buffersize: CInt): CInt

public expect fun procPidpath(pid: CInt, buffer: MutPtr, buffersize: UInt): CInt

public expect fun procName(pid: CInt, buffer: MutPtr, buffersize: UInt): CInt

public expect fun procRegionfilename(pid: CInt, address: ULong, buffer: MutPtr, buffersize: UInt): CInt

public expect fun procKmsgbuf(buffer: MutPtr, buffersize: UInt): CInt

public expect fun procLibversion(major: MutPtr, minor: MutPtr): CInt

public expect fun procPidRusage(pid: CInt, flavor: CInt, buffer: MutPtr): CInt

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
public expect fun gethostuuid(id: MutPtr, timeout: ConstPtr): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong)

public expect fun cCRandomGenerateBytes(bytes: MutPtr, size: SizeT): CCRNGStatus

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

// Note(1.0): should this actually be deprecated?
public expect fun nsgetExecutablePath(buf: MutPtr, bufsize: MutPtr): CInt

// crtExterns.h
public expect fun nsgetArgv(): MutPtr

public expect fun nsgetArgc(): MutPtr

public expect fun nsgetEnviron(): MutPtr

public expect fun nsgetProgname(): MutPtr

public expect fun machVmMap(targetTask: VmMapT, address: MutPtr, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT

public expect fun vmAllocate(targetTask: VmMapT, address: MutPtr, size: VmSizeT, flags: CInt): KernReturnT

public expect fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT

public expect fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MutPtr): KernReturnT

public expect fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: MutPtr, outProcessorInfo: MutPtr, outProcessorInfoCnt: MutPtr): KernReturnT

public expect var MACH_TASK_SELF: MachPortT

public expect fun taskForPid(host: MachPortT, pid: PidT, task: MutPtr): KernReturnT

public expect fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MutPtr): KernReturnT

public expect fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: MutPtr): KernReturnT

public expect fun taskTerminate(targetTask: TaskT): KernReturnT

public expect fun taskThreads(targetTask: TaskInspectT, actList: MutPtr, actListCnt: MutPtr): KernReturnT

public expect fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MutPtr): KernReturnT

// sysdir.h
public expect fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState

public expect fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: MutPtr): SysdirSearchPathEnumerationState

public expect val VM_PAGE_SIZE: VmSizeT

public expect fun getattrlist(path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt

public expect fun fgetattrlist(fd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt

public expect fun getattrlistat(fd: CInt, path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: CUlong): CInt

public expect fun setattrlist(path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt

public expect fun fsetattrlist(fd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt

public expect fun setattrlistat(dirFd: CInt, path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt

public expect fun getattrlistbulk(dirfd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: ULong): CInt

public expect fun mallocSize(ptr: ConstPtr): SizeT

public expect fun mallocGoodSize(size: SizeT): SizeT

public expect fun dirname(path: MutPtr): MutPtr

public expect fun basename(path: MutPtr): MutPtr

public expect fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt

public expect fun freadlink(fd: CInt, buf: MutPtr, size: SizeT): CInt

public expect fun execvP(file: ConstPtr, searchPath: ConstPtr, argv: ConstPtr): CInt

public expect fun qsortR(base: MutPtr, num: SizeT, size: SizeT, arg: MutPtr, compar: QsortRComparCallback?)

public fun machTaskSelf(): MachPortT = MACH_TASK_SELF

public expect fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt

public expect fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr

public expect fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT

// These require a dependency on `libiconv`, and including this when built as
// part of `std` means every Rust program gets it. Ideally we would have a link
// modifier to only include these if they are used, but we do not.
public expect fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT

public expect fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT

public expect fun iconvClose(cd: IconvT): CInt
