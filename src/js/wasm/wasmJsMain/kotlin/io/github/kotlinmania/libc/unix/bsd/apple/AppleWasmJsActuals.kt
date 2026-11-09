@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.apple

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
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT

private var _ffi_static_MACH_TASK_SELF: MachPortT = 0u
public actual var MACH_TASK_SELF: MachPortT
    get() = _ffi_static_MACH_TASK_SELF
    set(value) {
        _ffi_static_MACH_TASK_SELF = value
    }

public actual val VM_PAGE_SIZE: VmSizeT
    get() = 0uL

public actual fun setgrent() {
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    0

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    0

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    0

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    0

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    0L

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    0

public actual fun chflags(path: String?, flags: CUint): CInt =
    0

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    0

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    0

public actual fun dirfd(dirp: DIR?): CInt =
    0

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun getutxent(): COpaquePointer? =
    null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun setutxent() {
}

public actual fun endutxent() {
}

public actual fun utmpxname(file: String?): CInt =
    0

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    null

public actual fun ctime(clock: COpaquePointer?): COpaquePointer? =
    null

public actual fun getdate(datestr: String?): COpaquePointer? =
    null

public actual fun strptime(buf: String?, format: String?, timeptr: COpaquePointer?): COpaquePointer? =
    null

public actual fun asctimeR(tm: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    null

public actual fun ctimeR(clock: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    null

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    0

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    0

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    0

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    0

public actual fun shmOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    0

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    0

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    null

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    0

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    0

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    0

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    0

public actual fun machAbsoluteTime(): ULong =
    0uL

public actual fun machTimebaseInfo(info: COpaquePointer?): CInt =
    0

public actual fun machHostSelf(): MachPortT =
    0u

public actual fun machThreadSelf(): MachPortT =
    0u

public actual fun pthreadCondTimedwaitRelativeNp(cond: COpaquePointer?, lock: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    0

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    0

public actual fun pthreadSetnameNp(name: String?): CInt =
    0

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    0u

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    0uL

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    null

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    0uL

public actual fun pthreadMainNp(): CInt =
    0

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: COpaquePointer?): CInt =
    0

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    0

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    0

public actual fun pthreadJitWriteFreezeCallbacksNp() {
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: COpaquePointer?): CInt =
    0

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    0

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    0

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    0

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    0

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    0

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    false

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
}

public actual fun osLogCreate(subsystem: String?, category: String?): OsLogT =
    null

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    false

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: COpaquePointer?): OsSignpostIdT =
    0uL

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    0uL

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    false

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    0

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: COpaquePointer?, getDefault: COpaquePointer?): KernReturnT =
    0

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: COpaquePointer?): KernReturnT =
    0

public actual fun error(): COpaquePointer? =
    null

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    0

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    null

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    0

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: COpaquePointer?, size: CInt) {
}

public actual fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: COpaquePointer?): SizeT =
    0uL

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    0

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    0

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun kevent64(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, flags: CUint, timeout: COpaquePointer?): CInt =
    0

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    0

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    0

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    0

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt =
    0

public actual fun sethostname(name: String?, len: CInt): CInt =
    0

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: COpaquePointer?, hdtr: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    0

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    0

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    0

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    0

public actual fun loginTty(fd: CInt): CInt =
    0

public actual fun duplocale(base: LocaleT): LocaleT =
    null

public actual fun freelocale(loc: LocaleT): CInt =
    0

public actual fun localeconvL(loc: LocaleT): COpaquePointer? =
    null

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    null

public actual fun uselocale(loc: LocaleT): LocaleT =
    null

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    null

public actual fun getpriority(which: CInt, who: IdT): CInt =
    0

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    0

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    0

public actual fun setdomainname(name: String?, len: CInt): CInt =
    0

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    0L

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    0L

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    0L

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    0

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    0

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    0L

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    0L

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    0

public actual fun renamexNp(from: String?, to: String?, flags: CUint): CInt =
    0

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt =
    0

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    0

public actual fun getgrouplist(name: String?, basegid: CInt, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    0

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    0

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    0

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    null

public actual fun sbrk(increment: CInt): COpaquePointer? =
    null

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun dyldImageCount(): UInt =
    0u

public actual fun dyldGetImageHeader(imageIndex: UInt): COpaquePointer? =
    null

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    0L

public actual fun dyldGetImageName(imageIndex: UInt): COpaquePointer? =
    null

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    0

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    0

public actual fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    0

public actual fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    0

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    0

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    0

public actual fun uname(buf: COpaquePointer?): CInt =
    0

public actual fun connectx(socket: CInt, endpoints: COpaquePointer?, associd: SaeAssocidT, flags: CUint, iov: COpaquePointer?, iovcnt: CUint, len: COpaquePointer?, connid: COpaquePointer?): CInt =
    0

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    0

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    0

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    0

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun getfsstat(mntbufp: COpaquePointer?, bufsize: CInt, flags: CInt): CInt =
    0

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    0

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    0

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    0

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    0

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    0

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    0

public actual fun copyfileStateAlloc(): CopyfileStateT =
    null

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    0

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    0

public actual fun machErrorString(errorValue: MachErrorT): COpaquePointer? =
    null

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    0

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT) {
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT) {
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT) {
}

public actual fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong =
    0L

public actual fun mstats(): Mstats =
    Mstats()

public actual fun mallocPrintf(format: String?, vararg variadicArgs: Long) {
}

public actual fun mallocZoneCheck(zone: COpaquePointer?): BooleanT =
    0

public actual fun mallocZonePrint(zone: COpaquePointer?, verbose: BooleanT) {
}

public actual fun mallocZoneStatistics(zone: COpaquePointer?, stats: COpaquePointer?) {
}

public actual fun mallocZoneLog(zone: COpaquePointer?, address: COpaquePointer?) {
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
}

public actual fun mallocDefaultZone(): COpaquePointer? =
    null

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): COpaquePointer? =
    null

public actual fun mallocZoneMalloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun mallocZoneValloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun mallocZoneCalloc(zone: COpaquePointer?, numItems: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun mallocZoneRealloc(zone: COpaquePointer?, ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun mallocZoneFree(zone: COpaquePointer?, ptr: COpaquePointer?) {
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    0

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    0

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    0

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    0

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    0

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    0

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    0

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    0

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    0

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    0

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    0

public actual fun procLibversion(major: COpaquePointer?, minor: COpaquePointer?): CInt =
    0

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt =
    0

public actual fun procSetNoSmt(): CInt =
    0

public actual fun procSetthreadNoSmt(): CInt =
    0

public actual fun procSetCsm(flags: UInt): CInt =
    0

public actual fun procSetthreadCsm(flags: UInt): CInt =
    0

public actual fun gethostuuid(id: COpaquePointer?, timeout: COpaquePointer?): CInt =
    0

public actual fun gethostid(): CLong =
    0L

public actual fun sethostid(hostid: CLong) {
}

public actual fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): CCRNGStatus =
    0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: COpaquePointer?): CInt =
    0

public actual fun nsgetArgv(): COpaquePointer? =
    null

public actual fun nsgetArgc(): COpaquePointer? =
    null

public actual fun nsgetEnviron(): COpaquePointer? =
    null

public actual fun nsgetProgname(): COpaquePointer? =
    null

public actual fun machVmMap(targetTask: VmMapT, address: COpaquePointer?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    0

public actual fun vmAllocate(targetTask: VmMapT, address: COpaquePointer?, size: VmSizeT, flags: CInt): KernReturnT =
    0

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    0

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: COpaquePointer?): KernReturnT =
    0

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: COpaquePointer?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: COpaquePointer?): KernReturnT =
    0

public actual fun taskForPid(host: MachPortT, pid: PidT, task: COpaquePointer?): KernReturnT =
    0

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: COpaquePointer?): KernReturnT =
    0

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: COpaquePointer?): KernReturnT =
    0

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    0

public actual fun taskThreads(targetTask: TaskInspectT, actList: COpaquePointer?, actListCnt: COpaquePointer?): KernReturnT =
    0

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: COpaquePointer?): KernReturnT =
    0

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    0u

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: COpaquePointer?): SysdirSearchPathEnumerationState =
    0u

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    0

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    0

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt =
    0

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    0

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    0

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    0

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt =
    0

public actual fun mallocSize(ptr: COpaquePointer?): SizeT =
    0uL

public actual fun mallocGoodSize(size: SizeT): SizeT =
    0uL

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    null

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    null

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    0

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    0

public actual fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt =
    0

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    0

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
}

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    null

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    0

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    null

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    0uL

public actual fun iconvClose(cd: IconvT): CInt =
    0
