@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdAppleJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixBsdAppleGetMACHTASKSELF(): Int

    @JvmStatic
    external fun libcUnixBsdAppleSetMACHTASKSELF(value: Int)

    @JvmStatic
    external fun libcUnixBsdAppleGetVMPAGESIZE(): Long

    @JvmStatic
    external fun libcUnixBsdAppleSetgrent()

    @JvmStatic
    external fun libcUnixBsdAppleDaemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleSemDestroy(sem: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleSemInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleAioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleAioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleAioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleAioError(aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleAioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleAioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleAioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleChflags(path: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleFchflags(fd: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleClockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleLioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleDirfd(dirp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleLutimes(file: Long, times: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleGetutxent(): Long

    @JvmStatic
    external fun libcUnixBsdAppleGetutxid(ut: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleGetutxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixBsdApplePututxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleSetutxent()

    @JvmStatic
    external fun libcUnixBsdAppleEndutxent()

    @JvmStatic
    external fun libcUnixBsdAppleUtmpxname(file: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleAsctime(tm: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleCtime(clock: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleGetdate(datestr: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleStrptime(buf: Long, format: Long, timeptr: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleAsctimeR(tm: Long, result: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleCtimeR(clock: Long, result: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleGetnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleMincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleSysctlnametomib(name: Long, mibp: Long, sizep: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleMprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleSemget(key: Int, nsems: Int, semflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleSemctl(semid: Int, semnum: Int, cmd: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleSemop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleShmOpen(name: Long, oflag: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleFtok(pathname: Long, projId: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleShmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libcUnixBsdAppleShmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleShmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleShmget(key: Int, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleSysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleSysctlbyname(name: Long, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleMachAbsoluteTime(): Long

    @JvmStatic
    external fun libcUnixBsdAppleMachTimebaseInfo(info: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleMachHostSelf(): Int

    @JvmStatic
    external fun libcUnixBsdAppleMachThreadSelf(): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadCondTimedwaitRelativeNp(cond: Long, lock: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadAttrGetscope(attr: Long, contentionscope: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadAttrGetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadAttrGetdetachstate(attr: Long, detachstate: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadAttrSetscope(attr: Long, contentionscope: Int): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadAttrSetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadSetnameNp(name: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadMachThreadNp(thread: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadFromMachThreadNp(port: Int): Long

    @JvmStatic
    external fun libcUnixBsdApplePthreadGetStackaddrNp(thread: Long): Long

    @JvmStatic
    external fun libcUnixBsdApplePthreadGetStacksizeNp(thread: Long): Long

    @JvmStatic
    external fun libcUnixBsdApplePthreadMainNp(): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadThreadidNp(thread: Long, threadId: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadJitWriteProtectNp(enabled: Int)

    @JvmStatic
    external fun libcUnixBsdApplePthreadJitWriteProtectSupportedNp(): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadJitWriteWithCallbackNp(callback: Long, ctx: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePthreadJitWriteFreezeCallbacksNp()

    @JvmStatic
    external fun libcUnixBsdApplePthreadCpuNumberNp(cpuNumberOut: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleOsSyncWaitOnAddress(addr: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleOsSyncWaitOnAddressWithDeadline(addr: Long, value: Long, size: Long, flags: Int, clockid: Int, deadline: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleOsSyncWaitOnAddressWithTimeout(addr: Long, value: Long, size: Long, flags: Int, clockid: Int, timeoutNs: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleOsSyncWakeByAddressAny(addr: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleOsSyncWakeByAddressAll(addr: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleOsUnfairLockLock(lock: Long)

    @JvmStatic
    external fun libcUnixBsdAppleOsUnfairLockTrylock(lock: Long): Boolean

    @JvmStatic
    external fun libcUnixBsdAppleOsUnfairLockUnlock(lock: Long)

    @JvmStatic
    external fun libcUnixBsdAppleOsUnfairLockAssertOwner(lock: Long)

    @JvmStatic
    external fun libcUnixBsdAppleOsUnfairLockAssertNotOwner(lock: Long)

    @JvmStatic
    external fun libcUnixBsdAppleOsLogCreate(subsystem: Long, category: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleOsLogTypeEnabled(oslog: Long, tpe: Byte): Boolean

    @JvmStatic
    external fun libcUnixBsdAppleOsSignpostIdMakeWithPointer(log: Long, ptr: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleOsSignpostIdGenerate(log: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleOsSignpostEnabled(log: Long): Boolean

    @JvmStatic
    external fun libcUnixBsdAppleThreadPolicySet(thread: Long, flavor: Int, policyInfo: Long, count: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleThreadPolicyGet(thread: Long, flavor: Int, policyInfo: Long, count: Long, getDefault: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleThreadInfo(targetAct: Int, flavor: Int, threadInfoOut: Long, threadInfoOutCnt: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleError(): Long

    @JvmStatic
    external fun libcUnixBsdAppleBacktrace(buf: Long, sz: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleBacktraceSymbols(addrs: Long, sz: Int): Long

    @JvmStatic
    external fun libcUnixBsdAppleBacktraceSymbolsFd(addrs: Long, sz: Int, fd: Int)

    @JvmStatic
    external fun libcUnixBsdAppleBacktraceFromFp(startfp: Long, array: Long, size: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleBacktraceImageOffsets(array: Long, imageOffsets: Long, size: Int)

    @JvmStatic
    external fun libcUnixBsdAppleBacktraceAsync(array: Long, length: Long, taskId: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleStatfs(path: Long, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleFstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleKevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleKevent64(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleMount(src: Long, target: Long, flags: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleFmount(src: Long, fd: Int, flags: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePtrace(request: Int, pid: Int, addr: Long, data: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleQuotactl(special: Long, cmd: Int, id: Int, data: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleSethostname(name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleSendfile(fd: Int, s: Int, offset: Long, len: Long, hdtr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleFutimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleUtimensat(dirfd: Int, path: Long, times: Long, flag: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleOpenpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleForkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleLoginTty(fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleDuplocale(base: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleFreelocale(loc: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleLocaleconvL(loc: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleNewlocale(mask: Int, locale: Long, base: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleUselocale(loc: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleQuerylocale(mask: Int, loc: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleGetdomainname(name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleSetdomainname(name: Long, len: Int): Int

    @JvmStatic
    external fun libcUnixBsdApplePreadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixBsdApplePwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleGetxattr(path: Long, name: Long, value: Long, size: Long, position: Int, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdAppleFgetxattr(filedes: Int, name: Long, value: Long, size: Long, position: Int, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdAppleSetxattr(path: Long, name: Long, value: Long, size: Long, position: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleFsetxattr(filedes: Int, name: Long, value: Long, size: Long, position: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleListxattr(path: Long, list: Long, size: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdAppleFlistxattr(filedes: Int, list: Long, size: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixBsdAppleRemovexattr(path: Long, name: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleRenamexNp(from: Long, to: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleRenameatxNp(fromfd: Int, from: Long, tofd: Int, to: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleFremovexattr(filedes: Int, name: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleGetgrouplist(name: Long, basegid: Int, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleInitgroups(user: Long, basegroup: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleWaitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleBrk(addr: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleSbrk(increment: Int): Long

    @JvmStatic
    external fun libcUnixBsdAppleSettimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleDyldImageCount(): Int

    @JvmStatic
    external fun libcUnixBsdAppleDyldGetImageHeader(imageIndex: Int): Long

    @JvmStatic
    external fun libcUnixBsdAppleDyldGetImageVmaddrSlide(imageIndex: Int): Long

    @JvmStatic
    external fun libcUnixBsdAppleDyldGetImageName(imageIndex: Int): Long

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawn(pid: Long, path: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnp(pid: Long, file: Long, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrSetarchprefNp(attr: Long, count: Long, pref: Long, subpref: Long, ocount: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrGetarchprefNp(attr: Long, count: Long, pref: Long, subpref: Long, ocount: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrGetbinprefNp(attr: Long, count: Long, pref: Long, ocount: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnattrSetbinprefNp(attr: Long, count: Long, pref: Long, ocount: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnFileActionsAddopen(actions: Long, fd: Int, path: Long, oflag: Int, mode: Short): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixBsdApplePosixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleUname(buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleConnectx(socket: Int, endpoints: Long, associd: Int, flags: Int, iov: Long, iovcnt: Int, len: Long, connid: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleDisconnectx(socket: Int, associd: Int, connid: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleNtpAdjtime(buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleNtpGettime(buf: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleGetmntinfo(mntbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleGetfsstat(mntbufp: Long, bufsize: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleClonefile(src: Long, dst: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleClonefileat(srcDirfd: Int, src: Long, dstDirfd: Int, dst: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleFclonefileat(srcfd: Int, dstDirfd: Int, dst: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleCopyfile(from: Long, to: Long, state: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleFcopyfile(from: Int, to: Int, state: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleCopyfileStateFree(s: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleCopyfileStateAlloc(): Long

    @JvmStatic
    external fun libcUnixBsdAppleCopyfileStateGet(s: Long, flags: Int, dst: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleCopyfileStateSet(s: Long, flags: Int, src: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleMachErrorString(errorValue: Int): Long

    @JvmStatic
    external fun libcUnixBsdAppleMemsetS(s: Long, smax: Long, c: Int, n: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleMemsetPattern4(b: Long, pattern4: Long, len: Long)

    @JvmStatic
    external fun libcUnixBsdAppleMemsetPattern8(b: Long, pattern8: Long, len: Long)

    @JvmStatic
    external fun libcUnixBsdAppleMemsetPattern16(b: Long, pattern16: Long, len: Long)

    @JvmStatic
    external fun libcUnixBsdAppleStrtonum(numstr: Long, minval: Long, maxval: Long, errstrp: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleMallocPrintf(format: Long, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)

    @JvmStatic
    external fun libcUnixBsdAppleMallocZoneCheck(zone: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleMallocZonePrint(zone: Long, verbose: Int)

    @JvmStatic
    external fun libcUnixBsdAppleMallocZoneStatistics(zone: Long, stats: Long)

    @JvmStatic
    external fun libcUnixBsdAppleMallocZoneLog(zone: Long, address: Long)

    @JvmStatic
    external fun libcUnixBsdAppleMallocZonePrintPtrInfo(ptr: Long)

    @JvmStatic
    external fun libcUnixBsdAppleMallocDefaultZone(): Long

    @JvmStatic
    external fun libcUnixBsdAppleMallocZoneFromPtr(ptr: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleMallocZoneMalloc(zone: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleMallocZoneValloc(zone: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleMallocZoneCalloc(zone: Long, numItems: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleMallocZoneRealloc(zone: Long, ptr: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleMallocZoneFree(zone: Long, ptr: Long)

    @JvmStatic
    external fun libcUnixBsdAppleProcListpids(t: Int, typeinfo: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcListallpids(buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcListpgrppids(pgrpid: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcListchildpids(ppid: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcPidinfo(pid: Int, flavor: Int, arg: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcPidfdinfo(pid: Int, fd: Int, flavor: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcPidfileportinfo(pid: Int, fileport: Int, flavor: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcPidpath(pid: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcName(pid: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcRegionfilename(pid: Int, address: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcKmsgbuf(buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcLibversion(major: Long, minor: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcPidRusage(pid: Int, flavor: Int, buffer: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcSetNoSmt(): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcSetthreadNoSmt(): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcSetCsm(flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleProcSetthreadCsm(flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleGethostuuid(id: Long, timeout: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleGethostid(): Long

    @JvmStatic
    external fun libcUnixBsdAppleSethostid(hostid: Long)

    @JvmStatic
    external fun libcUnixBsdAppleCCRandomGenerateBytes(bytes: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleNsgetExecutablePath(buf: Long, bufsize: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleNsgetArgv(): Long

    @JvmStatic
    external fun libcUnixBsdAppleNsgetArgc(): Long

    @JvmStatic
    external fun libcUnixBsdAppleNsgetEnviron(): Long

    @JvmStatic
    external fun libcUnixBsdAppleNsgetProgname(): Long

    @JvmStatic
    external fun libcUnixBsdAppleMachVmMap(targetTask: Long, address: Long, size: Long, mask: Long, flags: Int, obj: Int, offset: Long, copy: Int, curProtection: Int, maxProtection: Int, inheritance: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleVmAllocate(targetTask: Long, address: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleVmDeallocate(targetTask: Long, address: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleHostStatistics64(hostPriv: Int, flavor: Int, hostInfo64Out: Long, hostInfo64OutCnt: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleHostProcessorInfo(host: Int, flavor: Int, outProcessorCount: Long, outProcessorInfo: Long, outProcessorInfoCnt: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleTaskForPid(host: Int, pid: Int, task: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleTaskInfo(host: Int, flavor: Int, taskInfoOut: Long, taskInfoCount: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleTaskCreate(targetTask: Int, ledgers: Long, ledgersCnt: Int, inheritMemory: Int, childTask: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleTaskTerminate(targetTask: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleTaskThreads(targetTask: Int, actList: Long, actListCnt: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleHostStatistics(hostPriv: Int, flavor: Int, hostInfoOut: Long, hostInfoOutCnt: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleSysdirGetNextSearchPathEnumeration(state: Int, path: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleGetattrlist(path: Long, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleFgetattrlist(fd: Int, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleGetattrlistat(fd: Int, path: Long, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleSetattrlist(path: Long, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleFsetattrlist(fd: Int, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleSetattrlistat(dirFd: Int, path: Long, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleGetattrlistbulk(dirfd: Int, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleMallocSize(ptr: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleMallocGoodSize(size: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleDirname(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleMkfifoat(dirfd: Int, pathname: Long, mode: Short): Int

    @JvmStatic
    external fun libcUnixBsdAppleMknodat(dirfd: Int, pathname: Long, mode: Short, dev: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleFreadlink(fd: Int, buf: Long, size: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleExecvP(file: Long, searchPath: Long, argv: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleQsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)

    @JvmStatic
    external fun libcUnixBsdAppleClockSettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libcUnixBsdAppleMemmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleTaskSetInfo(targetTask: Int, flavor: Int, taskInfoIn: Long, taskInfoInCnt: Int): Int

    @JvmStatic
    external fun libcUnixBsdAppleIconvOpen(tocode: Long, fromcode: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleIconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libcUnixBsdAppleIconvClose(cd: Long): Int
}

public actual var MACH_TASK_SELF: MachPortT
    get() = UnixBsdAppleJniBridge.libcUnixBsdAppleGetMACHTASKSELF().toUInt()
    set(value) {
        UnixBsdAppleJniBridge.libcUnixBsdAppleSetMACHTASKSELF(value.toInt())
    }

public actual val VM_PAGE_SIZE: VmSizeT
    get() = UnixBsdAppleJniBridge.libcUnixBsdAppleGetVMPAGESIZE().toULong()

public actual fun setgrent() {
    UnixBsdAppleJniBridge.libcUnixBsdAppleSetgrent()
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleDaemon(nochdir, noclose)

public actual fun semDestroy(sem: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSemDestroy(sem.rawAddress)

public actual fun semInit(sem: MutPtr, pshared: CInt, value: CUint): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSemInit(sem.rawAddress, pshared, value.toInt())

public actual fun aioRead(aiocbp: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleAioRead(aiocbp.rawAddress)

public actual fun aioWrite(aiocbp: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleAioWrite(aiocbp.rawAddress)

public actual fun aioFsync(op: CInt, aiocbp: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleAioFsync(op, aiocbp.rawAddress)

public actual fun aioError(aiocbp: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleAioError(aiocbp.rawAddress)

public actual fun aioReturn(aiocbp: MutPtr): SsizeT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleAioReturn(aiocbp.rawAddress)

public actual fun aioSuspend(aiocbList: ConstPtr, nitems: CInt, timeout: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleAioSuspend(aiocbList.rawAddress, nitems, timeout.rawAddress)

public actual fun aioCancel(fd: CInt, aiocbp: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleAioCancel(fd, aiocbp.rawAddress)

public actual fun chflags(path: ConstPtr, flags: CUint): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleChflags(path.rawAddress, flags.toInt())

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFchflags(fd, flags.toInt())

public actual fun clockGetres(clkId: ClockidT, tp: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleClockGetres(clkId.toInt(), tp.rawAddress)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleClockGettime(clkId.toInt(), tp.rawAddress)

public actual fun lioListio(mode: CInt, aiocbList: ConstPtr, nitems: CInt, sevp: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleLioListio(mode, aiocbList.rawAddress, nitems, sevp.rawAddress)

public actual fun dirfd(dirp: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleDirfd(dirp.rawAddress)

public actual fun lutimes(file: ConstPtr, times: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleLutimes(file.rawAddress, times.rawAddress)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun getutxent(): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleGetutxent())

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleGetutxline(ut.rawAddress))

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdApplePututxline(ut.rawAddress))

public actual fun setutxent() {
    UnixBsdAppleJniBridge.libcUnixBsdAppleSetutxent()
}

public actual fun endutxent() {
    UnixBsdAppleJniBridge.libcUnixBsdAppleEndutxent()
}

public actual fun utmpxname(file: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleUtmpxname(file.rawAddress)

public actual fun asctime(tm: ConstPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleAsctime(tm.rawAddress))

public actual fun ctime(clock: ConstPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleCtime(clock.rawAddress))

public actual fun getdate(datestr: ConstPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleGetdate(datestr.rawAddress))

public actual fun strptime(buf: ConstPtr, format: ConstPtr, timeptr: MutPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleStrptime(buf.rawAddress, format.rawAddress, timeptr.rawAddress))

public actual fun asctimeR(tm: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleAsctimeR(tm.rawAddress, result.rawAddress))

public actual fun ctimeR(clock: ConstPtr, result: MutPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleCtimeR(clock.rawAddress, result.rawAddress))

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetnameinfo(sa.rawAddress, salen.toInt(), host.rawAddress, hostlen.toInt(), serv.rawAddress, servlen.toInt(), flags)

public actual fun mincore(addr: ConstPtr, len: SizeT, vec: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMincore(addr.rawAddress, len.toLong(), vec.rawAddress)

public actual fun sysctlnametomib(name: ConstPtr, mibp: MutPtr, sizep: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSysctlnametomib(name.rawAddress, mibp.rawAddress, sizep.rawAddress)

public actual fun mprotect(addr: MutPtr, len: SizeT, prot: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMprotect(addr.rawAddress, len.toLong(), prot)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSemget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSemctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: MutPtr, nsops: SizeT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSemop(semid, sops.rawAddress, nsops.toLong())

public actual fun shmOpen(name: ConstPtr, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleShmOpen(name.rawAddress, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun ftok(pathname: ConstPtr, projId: CInt): KeyT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFtok(pathname.rawAddress, projId)

public actual fun shmat(shmid: CInt, shmaddr: ConstPtr, shmflg: CInt): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleShmat(shmid, shmaddr.rawAddress, shmflg))

public actual fun shmdt(shmaddr: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleShmdt(shmaddr.rawAddress)

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleShmctl(shmid, cmd, buf.rawAddress)

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleShmget(key, size.toLong(), shmflg)

public actual fun sysctl(name: MutPtr, namelen: CUint, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSysctl(name.rawAddress, namelen.toInt(), oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun sysctlbyname(name: ConstPtr, oldp: MutPtr, oldlenp: MutPtr, newp: MutPtr, newlen: SizeT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSysctlbyname(name.rawAddress, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun machAbsoluteTime(): ULong =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMachAbsoluteTime().toULong()

public actual fun machTimebaseInfo(info: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMachTimebaseInfo(info.rawAddress)

public actual fun machHostSelf(): MachPortT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMachHostSelf().toUInt()

public actual fun machThreadSelf(): MachPortT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMachThreadSelf().toUInt()

public actual fun pthreadCondTimedwaitRelativeNp(cond: MutPtr, lock: MutPtr, timeout: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadCondTimedwaitRelativeNp(cond.rawAddress, lock.rawAddress, timeout.rawAddress)

public actual fun pthreadAttrGetscope(attr: ConstPtr, contentionscope: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadAttrGetscope(attr.rawAddress, contentionscope.rawAddress)

public actual fun pthreadAttrGetstackaddr(attr: ConstPtr, stackaddr: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadAttrGetstackaddr(attr.rawAddress, stackaddr.rawAddress)

public actual fun pthreadAttrGetdetachstate(attr: ConstPtr, detachstate: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadAttrGetdetachstate(attr.rawAddress, detachstate.rawAddress)

public actual fun pthreadAttrSetscope(attr: MutPtr, contentionscope: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadAttrSetscope(attr.rawAddress, contentionscope)

public actual fun pthreadAttrSetstackaddr(attr: MutPtr, stackaddr: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadAttrSetstackaddr(attr.rawAddress, stackaddr.rawAddress)

public actual fun pthreadSetnameNp(name: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadSetnameNp(name.rawAddress)

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: SizeT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadGetnameNp(thread.toLong(), name.rawAddress, len.toLong())

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadMachThreadNp(thread.toLong()).toUInt()

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadFromMachThreadNp(port.toInt()).toULong()

public actual fun pthreadGetStackaddrNp(thread: PthreadT): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdApplePthreadGetStackaddrNp(thread.toLong()))

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadGetStacksizeNp(thread.toLong()).toULong()

public actual fun pthreadMainNp(): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadMainNp()

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadThreadidNp(thread.toLong(), threadId.rawAddress)

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadJitWriteProtectNp(enabled)
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadJitWriteProtectSupportedNp()

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadJitWriteWithCallbackNp(0L, ctx.rawAddress)

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadJitWriteFreezeCallbacksNp()
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePthreadCpuNumberNp(cpuNumberOut.rawAddress)

public actual fun osSyncWaitOnAddress(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsSyncWaitOnAddress(addr.rawAddress, value.toLong(), size.toLong(), flags.toInt())

public actual fun osSyncWaitOnAddressWithDeadline(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsSyncWaitOnAddressWithDeadline(addr.rawAddress, value.toLong(), size.toLong(), flags.toInt(), clockid.toInt(), deadline.toLong())

public actual fun osSyncWaitOnAddressWithTimeout(addr: MutPtr, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsSyncWaitOnAddressWithTimeout(addr.rawAddress, value.toLong(), size.toLong(), flags.toInt(), clockid.toInt(), timeoutNs.toLong())

public actual fun osSyncWakeByAddressAny(addr: MutPtr, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsSyncWakeByAddressAny(addr.rawAddress, size.toLong(), flags.toInt())

public actual fun osSyncWakeByAddressAll(addr: MutPtr, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsSyncWakeByAddressAll(addr.rawAddress, size.toLong(), flags.toInt())

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsUnfairLockLock(lock.rawAddress)
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsUnfairLockTrylock(lock.rawAddress)

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsUnfairLockUnlock(lock.rawAddress)
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsUnfairLockAssertOwner(lock.rawAddress)
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsUnfairLockAssertNotOwner(lock.rawAddress)
}

public actual fun osLogCreate(subsystem: ConstPtr, category: ConstPtr): OsLogT =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleOsLogCreate(subsystem.rawAddress, category.rawAddress))

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsLogTypeEnabled(oslog.rawAddress, tpe.toByte())

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: ConstPtr): OsSignpostIdT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsSignpostIdMakeWithPointer(log.rawAddress, ptr.rawAddress).toULong()

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsSignpostIdGenerate(log.rawAddress).toULong()

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOsSignpostEnabled(log.rawAddress)

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleThreadPolicySet(thread.toLong(), flavor.toInt(), policyInfo.rawAddress, count.toInt())

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MutPtr, getDefault: MutPtr): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleThreadPolicyGet(thread.toLong(), flavor.toInt(), policyInfo.rawAddress, count.rawAddress, getDefault.rawAddress)

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: MutPtr): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleThreadInfo(targetAct.toInt(), flavor.toInt(), threadInfoOut.rawAddress, threadInfoOutCnt.rawAddress)

public actual fun error(): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleError())

public actual fun backtrace(buf: MutPtr, sz: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleBacktrace(buf.rawAddress, sz)

public actual fun backtraceSymbols(addrs: ConstPtr, sz: CInt): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleBacktraceSymbols(addrs.rawAddress, sz))

public actual fun backtraceSymbolsFd(addrs: ConstPtr, sz: CInt, fd: CInt) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleBacktraceSymbolsFd(addrs.rawAddress, sz, fd)
}

public actual fun backtraceFromFp(startfp: MutPtr, array: MutPtr, size: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleBacktraceFromFp(startfp.rawAddress, array.rawAddress, size)

public actual fun backtraceImageOffsets(array: ConstPtr, imageOffsets: MutPtr, size: CInt) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleBacktraceImageOffsets(array.rawAddress, imageOffsets.rawAddress, size)
}

public actual fun backtraceAsync(array: MutPtr, length: SizeT, taskId: MutPtr): SizeT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleBacktraceAsync(array.rawAddress, length.toLong(), taskId.rawAddress).toULong()

public actual fun statfs(path: ConstPtr, buf: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleStatfs(path.rawAddress, buf.rawAddress)

public actual fun fstatfs(fd: CInt, buf: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFstatfs(fd, buf.rawAddress)

public actual fun kevent(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, timeout: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleKevent(kq, changelist.rawAddress, nchanges, eventlist.rawAddress, nevents, timeout.rawAddress)

public actual fun kevent64(kq: CInt, changelist: ConstPtr, nchanges: CInt, eventlist: MutPtr, nevents: CInt, flags: CUint, timeout: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleKevent64(kq, changelist.rawAddress, nchanges, eventlist.rawAddress, nevents, flags.toInt(), timeout.rawAddress)

public actual fun mount(src: ConstPtr, target: ConstPtr, flags: CInt, data: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMount(src.rawAddress, target.rawAddress, flags, data.rawAddress)

public actual fun fmount(src: ConstPtr, fd: CInt, flags: CInt, data: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFmount(src.rawAddress, fd, flags, data.rawAddress)

public actual fun ptrace(request: CInt, pid: PidT, addr: MutPtr, data: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePtrace(request, pid, addr.rawAddress, data)

public actual fun quotactl(special: ConstPtr, cmd: CInt, id: CInt, data: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleQuotactl(special.rawAddress, cmd, id, data.rawAddress)

public actual fun sethostname(name: ConstPtr, len: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSethostname(name.rawAddress, len)

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: MutPtr, hdtr: MutPtr, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSendfile(fd, s, offset, len.rawAddress, hdtr.rawAddress, flags)

public actual fun futimens(fd: CInt, times: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFutimens(fd, times.rawAddress)

public actual fun utimensat(dirfd: CInt, path: ConstPtr, times: ConstPtr, flag: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleUtimensat(dirfd, path.rawAddress, times.rawAddress, flag)

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleOpenpty(amaster.rawAddress, aslave.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleForkpty(amaster.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun loginTty(fd: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleLoginTty(fd)

public actual fun duplocale(base: LocaleT): LocaleT =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleDuplocale(base.rawAddress))

public actual fun freelocale(loc: LocaleT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFreelocale(loc.rawAddress)

public actual fun localeconvL(loc: LocaleT): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleLocaleconvL(loc.rawAddress))

public actual fun newlocale(mask: CInt, locale: ConstPtr, base: LocaleT): LocaleT =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleNewlocale(mask, locale.rawAddress, base.rawAddress))

public actual fun uselocale(loc: LocaleT): LocaleT =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleUselocale(loc.rawAddress))

public actual fun querylocale(mask: CInt, loc: LocaleT): ConstPtr =
    ConstPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleQuerylocale(mask, loc.rawAddress))

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSetpriority(which, who.toInt(), prio)

public actual fun getdomainname(name: MutPtr, len: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetdomainname(name.rawAddress, len)

public actual fun setdomainname(name: ConstPtr, len: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSetdomainname(name.rawAddress, len)

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdAppleJniBridge.libcUnixBsdApplePreadv(fd, iov.rawAddress, iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdAppleJniBridge.libcUnixBsdApplePwritev(fd, iov.rawAddress, iovcnt, offset)

public actual fun getxattr(path: ConstPtr, name: ConstPtr, value: MutPtr, size: SizeT, position: UInt, flags: CInt): SsizeT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong(), position.toInt(), flags)

public actual fun fgetxattr(filedes: CInt, name: ConstPtr, value: MutPtr, size: SizeT, position: UInt, flags: CInt): SsizeT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFgetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong(), position.toInt(), flags)

public actual fun setxattr(path: ConstPtr, name: ConstPtr, value: ConstPtr, size: SizeT, position: UInt, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSetxattr(path.rawAddress, name.rawAddress, value.rawAddress, size.toLong(), position.toInt(), flags)

public actual fun fsetxattr(filedes: CInt, name: ConstPtr, value: ConstPtr, size: SizeT, position: UInt, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFsetxattr(filedes, name.rawAddress, value.rawAddress, size.toLong(), position.toInt(), flags)

public actual fun listxattr(path: ConstPtr, list: MutPtr, size: SizeT, flags: CInt): SsizeT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleListxattr(path.rawAddress, list.rawAddress, size.toLong(), flags)

public actual fun flistxattr(filedes: CInt, list: MutPtr, size: SizeT, flags: CInt): SsizeT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFlistxattr(filedes, list.rawAddress, size.toLong(), flags)

public actual fun removexattr(path: ConstPtr, name: ConstPtr, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleRemovexattr(path.rawAddress, name.rawAddress, flags)

public actual fun renamexNp(from: ConstPtr, to: ConstPtr, flags: CUint): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleRenamexNp(from.rawAddress, to.rawAddress, flags.toInt())

public actual fun renameatxNp(fromfd: CInt, from: ConstPtr, tofd: CInt, to: ConstPtr, flags: CUint): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleRenameatxNp(fromfd, from.rawAddress, tofd, to.rawAddress, flags.toInt())

public actual fun fremovexattr(filedes: CInt, name: ConstPtr, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFremovexattr(filedes, name.rawAddress, flags)

public actual fun getgrouplist(name: ConstPtr, basegid: CInt, groups: MutPtr, ngroups: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetgrouplist(name.rawAddress, basegid, groups.rawAddress, ngroups.rawAddress)

public actual fun initgroups(user: ConstPtr, basegroup: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleInitgroups(user.rawAddress, basegroup)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: MutPtr, options: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleWaitid(idtype.toInt(), id.toInt(), infop.rawAddress, options)

public actual fun brk(addr: ConstPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleBrk(addr.rawAddress))

public actual fun sbrk(increment: CInt): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleSbrk(increment))

public actual fun settimeofday(tv: ConstPtr, tz: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSettimeofday(tv.rawAddress, tz.rawAddress)

public actual fun dyldImageCount(): UInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleDyldImageCount().toUInt()

public actual fun dyldGetImageHeader(imageIndex: UInt): ConstPtr =
    ConstPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleDyldGetImageHeader(imageIndex.toInt()))

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleDyldGetImageVmaddrSlide(imageIndex.toInt())

public actual fun dyldGetImageName(imageIndex: UInt): ConstPtr =
    ConstPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleDyldGetImageName(imageIndex.toInt()))

public actual fun posixSpawn(pid: MutPtr, path: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawn(pid.rawAddress, path.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnp(pid: MutPtr, file: ConstPtr, fileActions: ConstPtr, attrp: ConstPtr, argv: ConstPtr, envp: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnp(pid.rawAddress, file.rawAddress, fileActions.rawAddress, attrp.rawAddress, argv.rawAddress, envp.rawAddress)

public actual fun posixSpawnattrInit(attr: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrInit(attr.rawAddress)

public actual fun posixSpawnattrDestroy(attr: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrDestroy(attr.rawAddress)

public actual fun posixSpawnattrGetsigdefault(attr: ConstPtr, default: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrGetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigdefault(attr: MutPtr, default: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrSetsigdefault(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetsigmask(attr: ConstPtr, default: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrGetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrSetsigmask(attr: MutPtr, default: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrSetsigmask(attr.rawAddress, default.rawAddress)

public actual fun posixSpawnattrGetflags(attr: ConstPtr, flags: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrGetflags(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetflags(attr: MutPtr, flags: CShort): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrSetflags(attr.rawAddress, flags)

public actual fun posixSpawnattrGetpgroup(attr: ConstPtr, flags: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrGetpgroup(attr.rawAddress, flags.rawAddress)

public actual fun posixSpawnattrSetpgroup(attr: MutPtr, flags: PidT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrSetpgroup(attr.rawAddress, flags)

public actual fun posixSpawnattrSetarchprefNp(attr: MutPtr, count: SizeT, pref: MutPtr, subpref: MutPtr, ocount: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrSetarchprefNp(attr.rawAddress, count.toLong(), pref.rawAddress, subpref.rawAddress, ocount.rawAddress)

public actual fun posixSpawnattrGetarchprefNp(attr: ConstPtr, count: SizeT, pref: MutPtr, subpref: MutPtr, ocount: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrGetarchprefNp(attr.rawAddress, count.toLong(), pref.rawAddress, subpref.rawAddress, ocount.rawAddress)

public actual fun posixSpawnattrGetbinprefNp(attr: ConstPtr, count: SizeT, pref: MutPtr, ocount: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrGetbinprefNp(attr.rawAddress, count.toLong(), pref.rawAddress, ocount.rawAddress)

public actual fun posixSpawnattrSetbinprefNp(attr: MutPtr, count: SizeT, pref: MutPtr, ocount: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnattrSetbinprefNp(attr.rawAddress, count.toLong(), pref.rawAddress, ocount.rawAddress)

public actual fun posixSpawnFileActionsInit(actions: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnFileActionsInit(actions.rawAddress)

public actual fun posixSpawnFileActionsDestroy(actions: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnFileActionsDestroy(actions.rawAddress)

public actual fun posixSpawnFileActionsAddopen(actions: MutPtr, fd: CInt, path: ConstPtr, oflag: CInt, mode: ModeT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnFileActionsAddopen(actions.rawAddress, fd, path.rawAddress, oflag, mode.toShort())

public actual fun posixSpawnFileActionsAddclose(actions: MutPtr, fd: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnFileActionsAddclose(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAdddup2(actions: MutPtr, fd: CInt, newfd: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdApplePosixSpawnFileActionsAdddup2(actions.rawAddress, fd, newfd)

public actual fun uname(buf: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleUname(buf.rawAddress)

public actual fun connectx(socket: CInt, endpoints: ConstPtr, associd: SaeAssocidT, flags: CUint, iov: ConstPtr, iovcnt: CUint, len: MutPtr, connid: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleConnectx(socket, endpoints.rawAddress, associd.toInt(), flags.toInt(), iov.rawAddress, iovcnt.toInt(), len.rawAddress, connid.rawAddress)

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleDisconnectx(socket, associd.toInt(), connid.toInt())

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleNtpAdjtime(buf.rawAddress)

public actual fun ntpGettime(buf: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleNtpGettime(buf.rawAddress)

public actual fun getmntinfo(mntbufp: MutPtr, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetmntinfo(mntbufp.rawAddress, flags)

public actual fun getfsstat(mntbufp: MutPtr, bufsize: CInt, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetfsstat(mntbufp.rawAddress, bufsize, flags)

public actual fun clonefile(src: ConstPtr, dst: ConstPtr, flags: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleClonefile(src.rawAddress, dst.rawAddress, flags.toInt())

public actual fun clonefileat(srcDirfd: CInt, src: ConstPtr, dstDirfd: CInt, dst: ConstPtr, flags: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleClonefileat(srcDirfd, src.rawAddress, dstDirfd, dst.rawAddress, flags.toInt())

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: ConstPtr, flags: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFclonefileat(srcfd, dstDirfd, dst.rawAddress, flags.toInt())

public actual fun copyfile(from: ConstPtr, to: ConstPtr, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleCopyfile(from.rawAddress, to.rawAddress, state.rawAddress, flags.toInt())

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFcopyfile(from, to, state.rawAddress, flags.toInt())

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleCopyfileStateFree(s.rawAddress)

public actual fun copyfileStateAlloc(): CopyfileStateT =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleCopyfileStateAlloc())

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleCopyfileStateGet(s.rawAddress, flags.toInt(), dst.rawAddress)

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleCopyfileStateSet(s.rawAddress, flags.toInt(), src.rawAddress)

public actual fun machErrorString(errorValue: MachErrorT): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleMachErrorString(errorValue))

public actual fun memsetS(s: MutPtr, smax: SizeT, c: CInt, n: SizeT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMemsetS(s.rawAddress, smax.toLong(), c, n.toLong())

public actual fun memsetPattern4(b: MutPtr, pattern4: ConstPtr, len: SizeT) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleMemsetPattern4(b.rawAddress, pattern4.rawAddress, len.toLong())
}

public actual fun memsetPattern8(b: MutPtr, pattern8: ConstPtr, len: SizeT) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleMemsetPattern8(b.rawAddress, pattern8.rawAddress, len.toLong())
}

public actual fun memsetPattern16(b: MutPtr, pattern16: ConstPtr, len: SizeT) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleMemsetPattern16(b.rawAddress, pattern16.rawAddress, len.toLong())
}

public actual fun strtonum(numstr: ConstPtr, minval: CLonglong, maxval: CLonglong, errstrp: MutPtr): CLonglong =
    UnixBsdAppleJniBridge.libcUnixBsdAppleStrtonum(numstr.rawAddress, minval, maxval, errstrp.rawAddress)

public actual fun mstats(): Mstats =
    Mstats()

public actual fun mallocPrintf(format: ConstPtr, vararg variadicArgs: Long) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleMallocPrintf(format.rawAddress, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun mallocZoneCheck(zone: MutPtr): BooleanT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZoneCheck(zone.rawAddress)

public actual fun mallocZonePrint(zone: MutPtr, verbose: BooleanT) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZonePrint(zone.rawAddress, verbose)
}

public actual fun mallocZoneStatistics(zone: MutPtr, stats: MutPtr) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZoneStatistics(zone.rawAddress, stats.rawAddress)
}

public actual fun mallocZoneLog(zone: MutPtr, address: MutPtr) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZoneLog(zone.rawAddress, address.rawAddress)
}

public actual fun mallocZonePrintPtrInfo(ptr: MutPtr) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZonePrintPtrInfo(ptr.rawAddress)
}

public actual fun mallocDefaultZone(): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleMallocDefaultZone())

public actual fun mallocZoneFromPtr(ptr: ConstPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZoneFromPtr(ptr.rawAddress))

public actual fun mallocZoneMalloc(zone: MutPtr, size: SizeT): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZoneMalloc(zone.rawAddress, size.toLong()))

public actual fun mallocZoneValloc(zone: MutPtr, size: SizeT): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZoneValloc(zone.rawAddress, size.toLong()))

public actual fun mallocZoneCalloc(zone: MutPtr, numItems: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZoneCalloc(zone.rawAddress, numItems.toLong(), size.toLong()))

public actual fun mallocZoneRealloc(zone: MutPtr, ptr: MutPtr, size: SizeT): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZoneRealloc(zone.rawAddress, ptr.rawAddress, size.toLong()))

public actual fun mallocZoneFree(zone: MutPtr, ptr: MutPtr) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleMallocZoneFree(zone.rawAddress, ptr.rawAddress)
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: MutPtr, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcListpids(t.toInt(), typeinfo.toInt(), buffer.rawAddress, buffersize)

public actual fun procListallpids(buffer: MutPtr, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcListallpids(buffer.rawAddress, buffersize)

public actual fun procListpgrppids(pgrpid: PidT, buffer: MutPtr, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcListpgrppids(pgrpid, buffer.rawAddress, buffersize)

public actual fun procListchildpids(ppid: PidT, buffer: MutPtr, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcListchildpids(ppid, buffer.rawAddress, buffersize)

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: MutPtr, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcPidinfo(pid, flavor, arg.toLong(), buffer.rawAddress, buffersize)

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: MutPtr, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcPidfdinfo(pid, fd, flavor, buffer.rawAddress, buffersize)

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: MutPtr, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcPidfileportinfo(pid, fileport.toInt(), flavor, buffer.rawAddress, buffersize)

public actual fun procPidpath(pid: CInt, buffer: MutPtr, buffersize: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcPidpath(pid, buffer.rawAddress, buffersize.toInt())

public actual fun procName(pid: CInt, buffer: MutPtr, buffersize: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcName(pid, buffer.rawAddress, buffersize.toInt())

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: MutPtr, buffersize: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcRegionfilename(pid, address.toLong(), buffer.rawAddress, buffersize.toInt())

public actual fun procKmsgbuf(buffer: MutPtr, buffersize: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcKmsgbuf(buffer.rawAddress, buffersize.toInt())

public actual fun procLibversion(major: MutPtr, minor: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcLibversion(major.rawAddress, minor.rawAddress)

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcPidRusage(pid, flavor, buffer.rawAddress)

public actual fun procSetNoSmt(): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcSetNoSmt()

public actual fun procSetthreadNoSmt(): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcSetthreadNoSmt()

public actual fun procSetCsm(flags: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcSetCsm(flags.toInt())

public actual fun procSetthreadCsm(flags: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleProcSetthreadCsm(flags.toInt())

public actual fun gethostuuid(id: MutPtr, timeout: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGethostuuid(id.rawAddress, timeout.rawAddress)

public actual fun gethostid(): CLong =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGethostid()

public actual fun sethostid(hostid: CLong) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleSethostid(hostid)
}

public actual fun cCRandomGenerateBytes(bytes: MutPtr, size: SizeT): CCRNGStatus =
    UnixBsdAppleJniBridge.libcUnixBsdAppleCCRandomGenerateBytes(bytes.rawAddress, size.toLong())

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetentropy(buf.rawAddress, buflen.toLong())

public actual fun nsgetExecutablePath(buf: MutPtr, bufsize: MutPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleNsgetExecutablePath(buf.rawAddress, bufsize.rawAddress)

public actual fun nsgetArgv(): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleNsgetArgv())

public actual fun nsgetArgc(): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleNsgetArgc())

public actual fun nsgetEnviron(): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleNsgetEnviron())

public actual fun nsgetProgname(): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleNsgetProgname())

public actual fun machVmMap(targetTask: VmMapT, address: MutPtr, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMachVmMap(targetTask.toLong(), address.rawAddress, size.toLong(), mask.toLong(), flags, obj.toInt(), offset.toLong(), copy, curProtection, maxProtection, inheritance.toInt())

public actual fun vmAllocate(targetTask: VmMapT, address: MutPtr, size: VmSizeT, flags: CInt): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleVmAllocate(targetTask.toLong(), address.rawAddress, size.toLong(), flags)

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleVmDeallocate(targetTask.toLong(), address.toLong(), size.toLong())

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: MutPtr): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleHostStatistics64(hostPriv.toInt(), flavor, hostInfo64Out.rawAddress, hostInfo64OutCnt.rawAddress)

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: MutPtr, outProcessorInfo: MutPtr, outProcessorInfoCnt: MutPtr): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleHostProcessorInfo(host.toInt(), flavor, outProcessorCount.rawAddress, outProcessorInfo.rawAddress, outProcessorInfoCnt.rawAddress)

public actual fun taskForPid(host: MachPortT, pid: PidT, task: MutPtr): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleTaskForPid(host.toInt(), pid, task.rawAddress)

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: MutPtr): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleTaskInfo(host.toInt(), flavor.toInt(), taskInfoOut.rawAddress, taskInfoCount.rawAddress)

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: MutPtr): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleTaskCreate(targetTask.toInt(), ledgers.rawAddress, ledgersCnt.toInt(), inheritMemory, childTask.rawAddress)

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleTaskTerminate(targetTask.toInt())

public actual fun taskThreads(targetTask: TaskInspectT, actList: MutPtr, actListCnt: MutPtr): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleTaskThreads(targetTask.toInt(), actList.rawAddress, actListCnt.rawAddress)

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: MutPtr): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleHostStatistics(hostPriv.toInt(), flavor, hostInfoOut.rawAddress, hostInfoOutCnt.rawAddress)

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    0u

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: MutPtr): SysdirSearchPathEnumerationState =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSysdirGetNextSearchPathEnumeration(state.toInt(), path.rawAddress).toUInt()

public actual fun getattrlist(path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetattrlist(path.rawAddress, attrList.rawAddress, attrBuf.rawAddress, attrBufSize.toLong(), options.toInt())

public actual fun fgetattrlist(fd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFgetattrlist(fd, attrList.rawAddress, attrBuf.rawAddress, attrBufSize.toLong(), options.toInt())

public actual fun getattrlistat(fd: CInt, path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: CUlong): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetattrlistat(fd, path.rawAddress, attrList.rawAddress, attrBuf.rawAddress, attrBufSize.toLong(), options.toLong())

public actual fun setattrlist(path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSetattrlist(path.rawAddress, attrList.rawAddress, attrBuf.rawAddress, attrBufSize.toLong(), options.toInt())

public actual fun fsetattrlist(fd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFsetattrlist(fd, attrList.rawAddress, attrBuf.rawAddress, attrBufSize.toLong(), options.toInt())

public actual fun setattrlistat(dirFd: CInt, path: ConstPtr, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: UInt): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleSetattrlistat(dirFd, path.rawAddress, attrList.rawAddress, attrBuf.rawAddress, attrBufSize.toLong(), options.toInt())

public actual fun getattrlistbulk(dirfd: CInt, attrList: MutPtr, attrBuf: MutPtr, attrBufSize: SizeT, options: ULong): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleGetattrlistbulk(dirfd, attrList.rawAddress, attrBuf.rawAddress, attrBufSize.toLong(), options.toLong())

public actual fun mallocSize(ptr: ConstPtr): SizeT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMallocSize(ptr.rawAddress).toULong()

public actual fun mallocGoodSize(size: SizeT): SizeT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMallocGoodSize(size.toLong()).toULong()

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleDirname(path.rawAddress))

public actual fun basename(path: MutPtr): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleBasename(path.rawAddress))

public actual fun mkfifoat(dirfd: CInt, pathname: ConstPtr, mode: ModeT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMkfifoat(dirfd, pathname.rawAddress, mode.toShort())

public actual fun mknodat(dirfd: CInt, pathname: ConstPtr, mode: ModeT, dev: DevT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleMknodat(dirfd, pathname.rawAddress, mode.toShort(), dev)

public actual fun freadlink(fd: CInt, buf: MutPtr, size: SizeT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleFreadlink(fd, buf.rawAddress, size.toLong())

public actual fun execvP(file: ConstPtr, searchPath: ConstPtr, argv: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleExecvP(file.rawAddress, searchPath.rawAddress, argv.rawAddress)

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, arg: MutPtr, compar: QsortRComparCallback?) {
    UnixBsdAppleJniBridge.libcUnixBsdAppleQsortR(base.rawAddress, num.toLong(), size.toLong(), arg.rawAddress, 0L)
}

public actual fun clockSettime(clockId: ClockidT, tp: ConstPtr): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleClockSettime(clockId.toInt(), tp.rawAddress)

public actual fun memmem(haystack: ConstPtr, haystacklen: SizeT, needle: ConstPtr, needlelen: SizeT): MutPtr =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleMemmem(haystack.rawAddress, haystacklen.toLong(), needle.rawAddress, needlelen.toLong()))

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleTaskSetInfo(targetTask.toInt(), flavor.toInt(), taskInfoIn.rawAddress, taskInfoInCnt.toInt())

public actual fun iconvOpen(tocode: ConstPtr, fromcode: ConstPtr): IconvT =
    MutPtr(UnixBsdAppleJniBridge.libcUnixBsdAppleIconvOpen(tocode.rawAddress, fromcode.rawAddress))

public actual fun iconv(cd: IconvT, inbuf: MutPtr, inbytesleft: MutPtr, outbuf: MutPtr, outbytesleft: MutPtr): SizeT =
    UnixBsdAppleJniBridge.libcUnixBsdAppleIconv(cd.rawAddress, inbuf.rawAddress, inbytesleft.rawAddress, outbuf.rawAddress, outbytesleft.rawAddress).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixBsdAppleJniBridge.libcUnixBsdAppleIconvClose(cd.rawAddress)
