package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CLonglong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CShort
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.DIR
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

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun darwinAlign32(p: Int): Int {
    val DARWIN_ALIGNBYTES32: Int = 8 - 1
    return (p + DARWIN_ALIGNBYTES32) and DARWIN_ALIGNBYTES32.inv()
}

public fun cmsgNxthdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? {
    if ((cmsg == null)) {
        return cmsgFirsthdr(mhdr)
    }
    val cmsgLen = cmsg.cmsgLen.toInt()
    val next = ((cmsg).hashCode().toLong()).toInt() + darwinAlign32(cmsgLen)
    val max = ((mhdr!!.msgControl)?.rawValue ?: 0L).toInt() + mhdr.msgControllen.toInt()
    return if (next + darwinAlign32(8) > max) {
        null
    } else {
        null
    }
}

public fun cmsgData(cmsg: Cmsghdr?): COpaquePointer? {
    return COpaquePointer(((COpaquePointer((cmsg).hashCode().toLong()))).rawValue + darwinAlign32(8).toLong())
}

public fun cmsgSpace(length: CUint): CUint {
    return (darwinAlign32(8) + darwinAlign32(length.toInt())).toUInt()
}

public fun cmsgLen(length: CUint): CUint {
    return (darwinAlign32(8) + length.toInt()).toUInt()
}

public fun vmMakeTag(id: UByte): UInt {
    return (id.toUInt()) shl 24u.toInt()
}

public fun wstopsig(status: CInt): CInt {
    return status shr 8
}

public fun wstatus(status: CInt): CInt {
    return status and 0x7f
}

public fun wifcontinued(status: CInt): Boolean {
    return wstatus(status) == WSTOPPED1 && wstopsig(status) == 0x13
}

public fun wifsignaled(status: CInt): Boolean {
    return wstatus(status) != WSTOPPED1 && wstatus(status) != 0
}

public fun wifstopped(status: CInt): Boolean {
    return wstatus(status) == WSTOPPED1 && wstopsig(status) != 0x13
}

public fun makedev(major: Int, minor: Int): DevT {
    return (major shl 24) or minor
}

public fun major(dev: DevT): Int {
    return (dev shr 24) and 0xff
}

public fun minor(dev: DevT): Int {
    return dev and 0xffffff
}

public expect fun setgrent()

public expect fun daemon(nochdir: CInt, noclose: CInt): CInt

public expect fun semDestroy(sem: COpaquePointer?): CInt

public expect fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt

public expect fun aioRead(aiocbp: COpaquePointer?): CInt

public expect fun aioWrite(aiocbp: COpaquePointer?): CInt

public expect fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt

public expect fun aioError(aiocbp: COpaquePointer?): CInt

public expect fun aioReturn(aiocbp: COpaquePointer?): SsizeT

public expect fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt

public expect fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt

public expect fun chflags(path: String?, flags: CUint): CInt

public expect fun fchflags(fd: CInt, flags: CUint): CInt

public expect fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt

public expect fun dirfd(dirp: DIR?): CInt

public expect fun lutimes(file: String?, times: COpaquePointer?): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun getutxent(): COpaquePointer?

public expect fun getutxid(ut: COpaquePointer?): COpaquePointer?

public expect fun getutxline(ut: COpaquePointer?): COpaquePointer?

public expect fun pututxline(ut: COpaquePointer?): COpaquePointer?

public expect fun setutxent()

public expect fun endutxent()

public expect fun utmpxname(file: String?): CInt

public expect fun asctime(tm: COpaquePointer?): COpaquePointer?

public expect fun ctime(clock: COpaquePointer?): COpaquePointer?

public expect fun getdate(datestr: String?): COpaquePointer?

public expect fun strptime(buf: String?, format: String?, timeptr: COpaquePointer?): COpaquePointer?

public expect fun asctimeR(tm: COpaquePointer?, result: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(clock: COpaquePointer?, result: COpaquePointer?): COpaquePointer?

public expect fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt

public expect fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt

public expect fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt

public expect fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt

public expect fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt

public expect fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt

public expect fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt

public expect fun shmOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): CInt

public expect fun ftok(pathname: String?, projId: CInt): KeyT

public expect fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer?

public expect fun shmdt(shmaddr: COpaquePointer?): CInt

public expect fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt

public expect fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt

public expect fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt

public expect fun machAbsoluteTime(): ULong

public expect fun machTimebaseInfo(info: COpaquePointer?): CInt

public expect fun machHostSelf(): MachPortT

public expect fun machThreadSelf(): MachPortT

public expect fun pthreadCondTimedwaitRelativeNp(cond: COpaquePointer?, lock: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt

public expect fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt

public expect fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt

public expect fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt

public expect fun pthreadSetnameNp(name: String?): CInt

public expect fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt

public expect fun pthreadMachThreadNp(thread: PthreadT): MachPortT

public expect fun pthreadFromMachThreadNp(port: MachPortT): PthreadT

public expect fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer?

public expect fun pthreadGetStacksizeNp(thread: PthreadT): SizeT

public expect fun pthreadMainNp(): CInt

public expect fun pthreadThreadidNp(thread: PthreadT, threadId: COpaquePointer?): CInt

public expect fun pthreadJitWriteProtectNp(enabled: CInt)

public expect fun pthreadJitWriteProtectSupportedNp(): CInt

// An array of pthreadJitWriteWithCallbackNp must declare
// the list of callbacks e.g.
// @linkSection= "__DATA_CONST,__pth_jit_func"
// static callbacks: [libc::pthreadJitWriteCallbackT; 2] = [nativeJitWriteCb,
// std::mem::reinterpret::<libc::pthreadJitWriteCallbackT>(std::ptr::null())];
// (a handy PTHREAD_JIT_WRITE_CALLBACK_NP macro for other languages).
public expect fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt

public expect fun pthreadJitWriteFreezeCallbacksNp()

public expect fun pthreadCpuNumberNp(cpuNumberOut: COpaquePointer?): CInt

// Available starting with macOS 14.4.
public expect fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt

public expect fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt

public expect fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt

public expect fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt

public expect fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt

public expect fun osUnfairLockLock(lock: OsUnfairLockT)

public expect fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean

public expect fun osUnfairLockUnlock(lock: OsUnfairLockT)

public expect fun osUnfairLockAssertOwner(lock: OsUnfairLockT)

public expect fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT)

public expect fun osLogCreate(subsystem: String?, category: String?): OsLogT

public expect fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean

public expect fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: COpaquePointer?): OsSignpostIdT

public expect fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT

public expect fun osSignpostEnabled(log: OsLogT): Boolean

public expect fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT

public expect fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: COpaquePointer?, getDefault: COpaquePointer?): KernReturnT

public expect fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: COpaquePointer?): KernReturnT

public expect fun error(): COpaquePointer?

public expect fun backtrace(buf: COpaquePointer?, sz: CInt): CInt

public expect fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer?

public expect fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt)

public expect fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt

public expect fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: COpaquePointer?, size: CInt)

public expect fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: COpaquePointer?): SizeT

public expect fun statfs(path: String?, buf: COpaquePointer?): CInt

public expect fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt

public expect fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt

public expect fun kevent64(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, flags: CUint, timeout: COpaquePointer?): CInt

public expect fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt

public expect fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt

public expect fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt

public expect fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt

public expect fun sethostname(name: String?, len: CInt): CInt

public expect fun sendfile(fd: CInt, s: CInt, offset: OffT, len: COpaquePointer?, hdtr: COpaquePointer?, flags: CInt): CInt

public expect fun futimens(fd: CInt, times: COpaquePointer?): CInt

public expect fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt

public expect fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt

public expect fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT

public expect fun loginTty(fd: CInt): CInt

public expect fun duplocale(base: LocaleT): LocaleT

public expect fun freelocale(loc: LocaleT): CInt

public expect fun localeconvL(loc: LocaleT): COpaquePointer?

public expect fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT

public expect fun uselocale(loc: LocaleT): LocaleT

public expect fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer?

public expect fun getpriority(which: CInt, who: IdT): CInt

public expect fun setpriority(which: CInt, who: IdT, prio: CInt): CInt

public expect fun getdomainname(name: COpaquePointer?, len: CInt): CInt

public expect fun setdomainname(name: String?, len: CInt): CInt

public expect fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT

public expect fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT

public expect fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT

public expect fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt

public expect fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt

public expect fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT

public expect fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT

public expect fun removexattr(path: String?, name: String?, flags: CInt): CInt

public expect fun renamexNp(from: String?, to: String?, flags: CUint): CInt

public expect fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt

public expect fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt

public expect fun getgrouplist(name: String?, basegid: CInt, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt

public expect fun initgroups(user: String?, basegroup: CInt): CInt

public expect fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt

public expect fun brk(addr: COpaquePointer?): COpaquePointer?

public expect fun sbrk(increment: CInt): COpaquePointer?

public expect fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun dyldImageCount(): UInt

public expect fun dyldGetImageHeader(imageIndex: UInt): COpaquePointer?

public expect fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT

public expect fun dyldGetImageName(imageIndex: UInt): COpaquePointer?

public expect fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt

public expect fun posixSpawnattrInit(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt

public expect fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt

public expect fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt

public expect fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt

public expect fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt

public expect fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt

public expect fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt

public expect fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt

public expect fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt

public expect fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt

public expect fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt

public expect fun uname(buf: COpaquePointer?): CInt

public expect fun connectx(socket: CInt, endpoints: COpaquePointer?, associd: SaeAssocidT, flags: CUint, iov: COpaquePointer?, iovcnt: CUint, len: COpaquePointer?, connid: COpaquePointer?): CInt

public expect fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt

public expect fun ntpAdjtime(buf: COpaquePointer?): CInt

public expect fun ntpGettime(buf: COpaquePointer?): CInt

public expect fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt

public expect fun getfsstat(mntbufp: COpaquePointer?, bufsize: CInt, flags: CInt): CInt

// Copy-on-write functions.
// According to the man page `flags` is an `int` but in the header
// this is a `uint32T`.
public expect fun clonefile(src: String?, dst: String?, flags: UInt): CInt

public expect fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt

public expect fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt

public expect fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt

public expect fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt

public expect fun copyfileStateFree(s: CopyfileStateT): CInt

public expect fun copyfileStateAlloc(): CopyfileStateT

public expect fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt

public expect fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt

public expect fun machErrorString(errorValue: MachErrorT): COpaquePointer?

// Added in macOS 10.13
// ISO/IEC 9899:2011 ("ISO C11") K.3.7.4.1
public expect fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt

// Added in macOS 10.5
public expect fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT)

public expect fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT)

public expect fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT)

// Inherited from BSD but available from Big Sur only
public expect fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong

public expect fun mstats(): Mstats

public expect fun mallocPrintf(format: String?, vararg variadicArgs: Long)

public expect fun mallocZoneCheck(zone: COpaquePointer?): BooleanT

public expect fun mallocZonePrint(zone: COpaquePointer?, verbose: BooleanT)

public expect fun mallocZoneStatistics(zone: COpaquePointer?, stats: COpaquePointer?)

public expect fun mallocZoneLog(zone: COpaquePointer?, address: COpaquePointer?)

public expect fun mallocZonePrintPtrInfo(ptr: COpaquePointer?)

public expect fun mallocDefaultZone(): COpaquePointer?

public expect fun mallocZoneFromPtr(ptr: COpaquePointer?): COpaquePointer?

public expect fun mallocZoneMalloc(zone: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun mallocZoneValloc(zone: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun mallocZoneCalloc(zone: COpaquePointer?, numItems: SizeT, size: SizeT): COpaquePointer?

public expect fun mallocZoneRealloc(zone: COpaquePointer?, ptr: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun mallocZoneFree(zone: COpaquePointer?, ptr: COpaquePointer?)

public expect fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt

public expect fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt

public expect fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt

public expect fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt

public expect fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt

public expect fun procLibversion(major: COpaquePointer?, minor: COpaquePointer?): CInt

public expect fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt

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
public expect fun gethostuuid(id: COpaquePointer?, timeout: COpaquePointer?): CInt

public expect fun gethostid(): CLong

public expect fun sethostid(hostid: CLong)

public expect fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): CCRNGStatus

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

// Note(1.0): should this actually be deprecated?
public expect fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: COpaquePointer?): CInt

// crtExterns.h
public expect fun nsgetArgv(): COpaquePointer?

public expect fun nsgetArgc(): COpaquePointer?

public expect fun nsgetEnviron(): COpaquePointer?

public expect fun nsgetProgname(): COpaquePointer?

public expect fun machVmMap(targetTask: VmMapT, address: COpaquePointer?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT

public expect fun vmAllocate(targetTask: VmMapT, address: COpaquePointer?, size: VmSizeT, flags: CInt): KernReturnT

public expect fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT

public expect fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: COpaquePointer?): KernReturnT

public expect fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: COpaquePointer?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: COpaquePointer?): KernReturnT

public expect var MACH_TASK_SELF: MachPortT

public expect fun taskForPid(host: MachPortT, pid: PidT, task: COpaquePointer?): KernReturnT

public expect fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: COpaquePointer?): KernReturnT

public expect fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: COpaquePointer?): KernReturnT

public expect fun taskTerminate(targetTask: TaskT): KernReturnT

public expect fun taskThreads(targetTask: TaskInspectT, actList: COpaquePointer?, actListCnt: COpaquePointer?): KernReturnT

public expect fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: COpaquePointer?): KernReturnT

// sysdir.h
public expect fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState

public expect fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: COpaquePointer?): SysdirSearchPathEnumerationState

public expect val VM_PAGE_SIZE: VmSizeT

public expect fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt

public expect fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt

public expect fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt

public expect fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt

public expect fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt

public expect fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt

public expect fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt

public expect fun mallocSize(ptr: COpaquePointer?): SizeT

public expect fun mallocGoodSize(size: SizeT): SizeT

public expect fun dirname(path: COpaquePointer?): COpaquePointer?

public expect fun basename(path: COpaquePointer?): COpaquePointer?

public expect fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt

public expect fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt

public expect fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt

public expect fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt

public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?)

public fun machTaskSelf(): MachPortT {
    return MACH_TASK_SELF
}

public expect fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt

public expect fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer?

public expect fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT

// These require a dependency on `libiconv`, and including this when built as
// part of `std` means every Rust program gets it. Ideally we would have a link
// modifier to only include these if they are used, but we do not.
public expect fun iconvOpen(tocode: String?, fromcode: String?): IconvT

public expect fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT

public expect fun iconvClose(cd: IconvT): CInt
