@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.unix.bsd.OffT
import io.github.kotlinmania.libc.unix.bsd.PthreadT
import io.github.kotlinmania.libc.unix.bsd.SocklenT
import io.github.kotlinmania.libc.unix.bsd.apple.b64.aarch64.BooleanT

private object UnixBsdAppleJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_unix_bsd_apple_get_MACH_TASK_SELF(): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_set_MACH_TASK_SELF(value: Int)

    @JvmStatic
    external fun libc_unix_bsd_apple_get_VM_PAGE_SIZE(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_setgrent()

    @JvmStatic
    external fun libc_unix_bsd_apple_daemon(nochdir: Int, noclose: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_semDestroy(sem: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_semInit(sem: Long, pshared: Int, value: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_aioRead(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_aioWrite(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_aioFsync(op: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_aioError(aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_aioReturn(aiocbp: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_aioSuspend(aiocbList: Long, nitems: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_aioCancel(fd: Int, aiocbp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_chflags(path: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_fchflags(fd: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_clockGetres(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_lioListio(mode: Int, aiocbList: Long, nitems: Int, sevp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_dirfd(dirp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_lutimes(file: String?, times: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_gettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_getutxent(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_getutxid(ut: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_getutxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_pututxline(ut: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_setutxent()

    @JvmStatic
    external fun libc_unix_bsd_apple_endutxent()

    @JvmStatic
    external fun libc_unix_bsd_apple_utmpxname(file: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_asctime(tm: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_ctime(clock: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_getdate(datestr: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_strptime(buf: String?, format: String?, timeptr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_asctimeR(tm: Long, result: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_ctimeR(clock: Long, result: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_getnameinfo(sa: Long, salen: Int, host: Long, hostlen: Int, serv: Long, servlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_mincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_sysctlnametomib(name: String?, mibp: Long, sizep: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_semget(key: Int, nsems: Int, semflg: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_semctl(semid: Int, semnum: Int, cmd: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_semop(semid: Int, sops: Long, nsops: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_shmOpen(name: String?, oflag: Int, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_ftok(pathname: String?, projId: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_shmat(shmid: Int, shmaddr: Long, shmflg: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_shmdt(shmaddr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_shmctl(shmid: Int, cmd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_shmget(key: Int, size: Long, shmflg: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_sysctlbyname(name: String?, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_machAbsoluteTime(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_machTimebaseInfo(info: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_machHostSelf(): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_machThreadSelf(): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp(cond: Long, lock: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadAttrGetscope(attr: Long, contentionscope: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadAttrGetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadAttrGetdetachstate(attr: Long, detachstate: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadAttrSetscope(attr: Long, contentionscope: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadAttrSetstackaddr(attr: Long, stackaddr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadSetnameNp(name: String?): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadGetnameNp(thread: Long, name: Long, len: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadMachThreadNp(thread: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadFromMachThreadNp(port: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadGetStackaddrNp(thread: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadGetStacksizeNp(thread: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadMainNp(): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadThreadidNp(thread: Long, threadId: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadJitWriteProtectNp(enabled: Int)

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp(): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp(callback: Long, ctx: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp()

    @JvmStatic
    external fun libc_unix_bsd_apple_pthreadCpuNumberNp(cpuNumberOut: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_osSyncWaitOnAddress(addr: Long, value: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline(addr: Long, value: Long, size: Long, flags: Int, clockid: Int, deadline: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout(addr: Long, value: Long, size: Long, flags: Int, clockid: Int, timeoutNs: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_osSyncWakeByAddressAny(addr: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_osSyncWakeByAddressAll(addr: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_osUnfairLockLock(lock: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_osUnfairLockTrylock(lock: Long): Boolean

    @JvmStatic
    external fun libc_unix_bsd_apple_osUnfairLockUnlock(lock: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_osUnfairLockAssertOwner(lock: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_osUnfairLockAssertNotOwner(lock: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_osLogCreate(subsystem: String?, category: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_osLogTypeEnabled(oslog: Long, tpe: Byte): Boolean

    @JvmStatic
    external fun libc_unix_bsd_apple_osSignpostIdMakeWithPointer(log: Long, ptr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_osSignpostIdGenerate(log: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_osSignpostEnabled(log: Long): Boolean

    @JvmStatic
    external fun libc_unix_bsd_apple_threadPolicySet(thread: Long, flavor: Int, policyInfo: Long, count: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_threadPolicyGet(thread: Long, flavor: Int, policyInfo: Long, count: Long, getDefault: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_threadInfo(targetAct: Int, flavor: Int, threadInfoOut: Long, threadInfoOutCnt: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_error(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_backtrace(buf: Long, sz: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_backtraceSymbols(addrs: Long, sz: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_backtraceSymbolsFd(addrs: Long, sz: Int, fd: Int)

    @JvmStatic
    external fun libc_unix_bsd_apple_backtraceFromFp(startfp: Long, array: Long, size: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_backtraceImageOffsets(array: Long, imageOffsets: Long, size: Int)

    @JvmStatic
    external fun libc_unix_bsd_apple_backtraceAsync(array: Long, length: Long, taskId: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_statfs(path: String?, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_fstatfs(fd: Int, buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_kevent(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_kevent64(kq: Int, changelist: Long, nchanges: Int, eventlist: Long, nevents: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_mount(src: String?, target: String?, flags: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_fmount(src: String?, fd: Int, flags: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_ptrace(request: Int, pid: Int, addr: Long, data: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_quotactl(special: String?, cmd: Int, id: Int, data: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_sethostname(name: String?, len: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_sendfile(fd: Int, s: Int, offset: Long, len: Long, hdtr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_futimens(fd: Int, times: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_utimensat(dirfd: Int, path: String?, times: Long, flag: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_openpty(amaster: Long, aslave: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_forkpty(amaster: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_loginTty(fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_duplocale(base: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_freelocale(loc: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_localeconvL(loc: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_newlocale(mask: Int, locale: String?, base: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_uselocale(loc: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_querylocale(mask: Int, loc: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_getpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_setpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_getdomainname(name: Long, len: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_setdomainname(name: String?, len: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_preadv(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_pwritev(fd: Int, iov: Long, iovcnt: Int, offset: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_getxattr(path: String?, name: String?, value: Long, size: Long, position: Int, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_fgetxattr(filedes: Int, name: String?, value: Long, size: Long, position: Int, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_setxattr(path: String?, name: String?, value: Long, size: Long, position: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_fsetxattr(filedes: Int, name: String?, value: Long, size: Long, position: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_listxattr(path: String?, list: Long, size: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_flistxattr(filedes: Int, list: Long, size: Long, flags: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_removexattr(path: String?, name: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_renamexNp(from: String?, to: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_renameatxNp(fromfd: Int, from: String?, tofd: Int, to: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_fremovexattr(filedes: Int, name: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_getgrouplist(name: String?, basegid: Int, groups: Long, ngroups: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_initgroups(user: String?, basegroup: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_waitid(idtype: Int, id: Int, infop: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_brk(addr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_sbrk(increment: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_settimeofday(tv: Long, tz: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_dyldImageCount(): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_dyldGetImageHeader(imageIndex: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_dyldGetImageVmaddrSlide(imageIndex: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_dyldGetImageName(imageIndex: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawn(pid: Long, path: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnp(pid: Long, file: String?, fileActions: Long, attrp: Long, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrInit(attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrDestroy(attr: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrGetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrSetsigdefault(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrGetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrSetsigmask(attr: Long, default: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrGetflags(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrSetflags(attr: Long, flags: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrGetpgroup(attr: Long, flags: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrSetpgroup(attr: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrSetarchprefNp(attr: Long, count: Long, pref: Long, subpref: Long, ocount: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrGetarchprefNp(attr: Long, count: Long, pref: Long, subpref: Long, ocount: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrGetbinprefNp(attr: Long, count: Long, pref: Long, ocount: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnattrSetbinprefNp(attr: Long, count: Long, pref: Long, ocount: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnFileActionsInit(actions: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnFileActionsDestroy(actions: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnFileActionsAddopen(actions: Long, fd: Int, path: String?, oflag: Int, mode: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnFileActionsAddclose(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_posixSpawnFileActionsAdddup2(actions: Long, fd: Int, newfd: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_uname(buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_connectx(socket: Int, endpoints: Long, associd: Int, flags: Int, iov: Long, iovcnt: Int, len: Long, connid: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_disconnectx(socket: Int, associd: Int, connid: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_ntpAdjtime(buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_ntpGettime(buf: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_getmntinfo(mntbufp: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_getfsstat(mntbufp: Long, bufsize: Int, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_clonefile(src: String?, dst: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_clonefileat(srcDirfd: Int, src: String?, dstDirfd: Int, dst: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_fclonefileat(srcfd: Int, dstDirfd: Int, dst: String?, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_copyfile(from: String?, to: String?, state: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_fcopyfile(from: Int, to: Int, state: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_copyfileStateFree(s: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_copyfileStateAlloc(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_copyfileStateGet(s: Long, flags: Int, dst: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_copyfileStateSet(s: Long, flags: Int, src: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_machErrorString(errorValue: Int): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_memsetS(s: Long, smax: Long, c: Int, n: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_memsetPattern4(b: Long, pattern4: Long, len: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_memsetPattern8(b: Long, pattern8: Long, len: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_memsetPattern16(b: Long, pattern16: Long, len: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_strtonum(numstr: String?, minval: Long, maxval: Long, errstrp: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocPrintf(format: String?, km_vac: Int, km_va0: Long, km_va1: Long, km_va2: Long, km_va3: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZoneCheck(zone: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZonePrint(zone: Long, verbose: Int)

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZoneStatistics(zone: Long, stats: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZoneLog(zone: Long, address: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZonePrintPtrInfo(ptr: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocDefaultZone(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZoneFromPtr(ptr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZoneMalloc(zone: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZoneValloc(zone: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZoneCalloc(zone: Long, numItems: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZoneRealloc(zone: Long, ptr: Long, size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocZoneFree(zone: Long, ptr: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_procListpids(t: Int, typeinfo: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procListallpids(buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procListpgrppids(pgrpid: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procListchildpids(ppid: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procPidinfo(pid: Int, flavor: Int, arg: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procPidfdinfo(pid: Int, fd: Int, flavor: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procPidfileportinfo(pid: Int, fileport: Int, flavor: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procPidpath(pid: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procName(pid: Int, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procRegionfilename(pid: Int, address: Long, buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procKmsgbuf(buffer: Long, buffersize: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procLibversion(major: Long, minor: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procPidRusage(pid: Int, flavor: Int, buffer: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procSetNoSmt(): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procSetthreadNoSmt(): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procSetCsm(flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_procSetthreadCsm(flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_gethostuuid(id: Long, timeout: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_gethostid(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_sethostid(hostid: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_cCRandomGenerateBytes(bytes: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_getentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_nsgetExecutablePath(buf: Long, bufsize: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_nsgetArgv(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_nsgetArgc(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_nsgetEnviron(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_nsgetProgname(): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_machVmMap(targetTask: Long, address: Long, size: Long, mask: Long, flags: Int, obj: Int, offset: Long, copy: Int, curProtection: Int, maxProtection: Int, inheritance: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_vmAllocate(targetTask: Long, address: Long, size: Long, flags: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_vmDeallocate(targetTask: Long, address: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_hostStatistics64(hostPriv: Int, flavor: Int, hostInfo64Out: Long, hostInfo64OutCnt: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_hostProcessorInfo(host: Int, flavor: Int, outProcessorCount: Long, outProcessorInfo: Long, outProcessorInfoCnt: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_taskForPid(host: Int, pid: Int, task: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_taskInfo(host: Int, flavor: Int, taskInfoOut: Long, taskInfoCount: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_taskCreate(targetTask: Int, ledgers: Long, ledgersCnt: Int, inheritMemory: Int, childTask: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_taskTerminate(targetTask: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_taskThreads(targetTask: Int, actList: Long, actListCnt: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_hostStatistics(hostPriv: Int, flavor: Int, hostInfoOut: Long, hostInfoOutCnt: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration(state: Int, path: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_getattrlist(path: String?, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_fgetattrlist(fd: Int, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_getattrlistat(fd: Int, path: String?, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_setattrlist(path: String?, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_fsetattrlist(fd: Int, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_setattrlistat(dirFd: Int, path: String?, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_getattrlistbulk(dirfd: Int, attrList: Long, attrBuf: Long, attrBufSize: Long, options: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocSize(ptr: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_mallocGoodSize(size: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_dirname(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_basename(path: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_mkfifoat(dirfd: Int, pathname: String?, mode: Short): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_mknodat(dirfd: Int, pathname: String?, mode: Short, dev: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_freadlink(fd: Int, buf: Long, size: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_execvP(file: String?, searchPath: String?, argv: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_qsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)

    @JvmStatic
    external fun libc_unix_bsd_apple_clockSettime(clockId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_memmem(haystack: Long, haystacklen: Long, needle: Long, needlelen: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_taskSetInfo(targetTask: Int, flavor: Int, taskInfoIn: Long, taskInfoInCnt: Int): Int

    @JvmStatic
    external fun libc_unix_bsd_apple_iconvOpen(tocode: String?, fromcode: String?): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_iconv(cd: Long, inbuf: Long, inbytesleft: Long, outbuf: Long, outbytesleft: Long): Long

    @JvmStatic
    external fun libc_unix_bsd_apple_iconvClose(cd: Long): Int
}

public actual var MACH_TASK_SELF: MachPortT
    get() = UnixBsdAppleJniBridge.libc_unix_bsd_apple_get_MACH_TASK_SELF().toUInt()
    set(value) {
        UnixBsdAppleJniBridge.libc_unix_bsd_apple_set_MACH_TASK_SELF(value.toInt())
    }

public actual val VM_PAGE_SIZE: VmSizeT
    get() = UnixBsdAppleJniBridge.libc_unix_bsd_apple_get_VM_PAGE_SIZE().toULong()

public actual fun setgrent() {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_setgrent()
}

public actual fun daemon(nochdir: CInt, noclose: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_daemon(nochdir, noclose)

public actual fun semDestroy(sem: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_semDestroy((sem?.value ?: 0L))

public actual fun semInit(sem: COpaquePointer?, pshared: CInt, value: CUint): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_semInit((sem?.value ?: 0L), pshared, value.toInt())

public actual fun aioRead(aiocbp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_aioRead((aiocbp?.value ?: 0L))

public actual fun aioWrite(aiocbp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_aioWrite((aiocbp?.value ?: 0L))

public actual fun aioFsync(op: CInt, aiocbp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_aioFsync(op, (aiocbp?.value ?: 0L))

public actual fun aioError(aiocbp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_aioError((aiocbp?.value ?: 0L))

public actual fun aioReturn(aiocbp: COpaquePointer?): SsizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_aioReturn((aiocbp?.value ?: 0L))

public actual fun aioSuspend(aiocbList: COpaquePointer?, nitems: CInt, timeout: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_aioSuspend((aiocbList?.value ?: 0L), nitems, (timeout?.value ?: 0L))

public actual fun aioCancel(fd: CInt, aiocbp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_aioCancel(fd, (aiocbp?.value ?: 0L))

public actual fun chflags(path: String?, flags: CUint): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_chflags(path, flags.toInt())

public actual fun fchflags(fd: CInt, flags: CUint): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_fchflags(fd, flags.toInt())

public actual fun clockGetres(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_clockGetres(clkId.toInt(), (tp?.value ?: 0L))

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_clockGettime(clkId.toInt(), (tp?.value ?: 0L))

public actual fun lioListio(mode: CInt, aiocbList: COpaquePointer?, nitems: CInt, sevp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_lioListio(mode, (aiocbList?.value ?: 0L), nitems, (sevp?.value ?: 0L))

public actual fun dirfd(dirp: DIR?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_dirfd((dirp?.handle ?: 0L))

public actual fun lutimes(file: String?, times: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_lutimes(file, (times?.value ?: 0L))

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_gettimeofday((tp?.value ?: 0L), (tz?.value ?: 0L))

public actual fun getutxent(): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getutxent().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getutxid((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getutxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pututxline((ut?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setutxent() {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_setutxent()
}

public actual fun endutxent() {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_endutxent()
}

public actual fun utmpxname(file: String?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_utmpxname(file)

public actual fun asctime(tm: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_asctime((tm?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctime(clock: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_ctime((clock?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getdate(datestr: String?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getdate(datestr).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun strptime(buf: String?, format: String?, timeptr: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_strptime(buf, format, (timeptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun asctimeR(tm: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_asctimeR((tm?.value ?: 0L), (result?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun ctimeR(clock: COpaquePointer?, result: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_ctimeR((clock?.value ?: 0L), (result?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getnameinfo(sa: COpaquePointer?, salen: SocklenT, host: COpaquePointer?, hostlen: SocklenT, serv: COpaquePointer?, servlen: SocklenT, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getnameinfo((sa?.value ?: 0L), salen.toInt(), (host?.value ?: 0L), hostlen.toInt(), (serv?.value ?: 0L), servlen.toInt(), flags)

public actual fun mincore(addr: COpaquePointer?, len: SizeT, vec: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mincore((addr?.value ?: 0L), len.toLong(), (vec?.value ?: 0L))

public actual fun sysctlnametomib(name: String?, mibp: COpaquePointer?, sizep: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_sysctlnametomib(name, (mibp?.value ?: 0L), (sizep?.value ?: 0L))

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mprotect((addr?.value ?: 0L), len.toLong(), prot)

public actual fun semget(key: KeyT, nsems: CInt, semflg: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_semget(key, nsems, semflg)

public actual fun semctl(semid: CInt, semnum: CInt, cmd: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_semctl(semid, semnum, cmd, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun semop(semid: CInt, sops: COpaquePointer?, nsops: SizeT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_semop(semid, (sops?.value ?: 0L), nsops.toLong())

public actual fun shmOpen(name: String?, oflag: CInt, vararg variadicArgs: Long): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_shmOpen(name, oflag, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun ftok(pathname: String?, projId: CInt): KeyT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_ftok(pathname, projId)

public actual fun shmat(shmid: CInt, shmaddr: COpaquePointer?, shmflg: CInt): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_shmat(shmid, (shmaddr?.value ?: 0L), shmflg).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun shmdt(shmaddr: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_shmdt((shmaddr?.value ?: 0L))

public actual fun shmctl(shmid: CInt, cmd: CInt, buf: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_shmctl(shmid, cmd, (buf?.value ?: 0L))

public actual fun shmget(key: KeyT, size: SizeT, shmflg: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_shmget(key, size.toLong(), shmflg)

public actual fun sysctl(name: COpaquePointer?, namelen: CUint, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_sysctl((name?.value ?: 0L), namelen.toInt(), (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: COpaquePointer?, newp: COpaquePointer?, newlen: SizeT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_sysctlbyname(name, (oldp?.value ?: 0L), (oldlenp?.value ?: 0L), (newp?.value ?: 0L), newlen.toLong())

public actual fun machAbsoluteTime(): ULong =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_machAbsoluteTime().toULong()

public actual fun machTimebaseInfo(info: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_machTimebaseInfo((info?.value ?: 0L))

public actual fun machHostSelf(): MachPortT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_machHostSelf().toUInt()

public actual fun machThreadSelf(): MachPortT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_machThreadSelf().toUInt()

public actual fun pthreadCondTimedwaitRelativeNp(cond: COpaquePointer?, lock: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadCondTimedwaitRelativeNp((cond?.value ?: 0L), (lock?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun pthreadAttrGetscope(attr: COpaquePointer?, contentionscope: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadAttrGetscope((attr?.value ?: 0L), (contentionscope?.value ?: 0L))

public actual fun pthreadAttrGetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadAttrGetstackaddr((attr?.value ?: 0L), (stackaddr?.value ?: 0L))

public actual fun pthreadAttrGetdetachstate(attr: COpaquePointer?, detachstate: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadAttrGetdetachstate((attr?.value ?: 0L), (detachstate?.value ?: 0L))

public actual fun pthreadAttrSetscope(attr: COpaquePointer?, contentionscope: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadAttrSetscope((attr?.value ?: 0L), contentionscope)

public actual fun pthreadAttrSetstackaddr(attr: COpaquePointer?, stackaddr: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadAttrSetstackaddr((attr?.value ?: 0L), (stackaddr?.value ?: 0L))

public actual fun pthreadSetnameNp(name: String?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadSetnameNp(name)

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadGetnameNp(thread.toLong(), (name?.value ?: 0L), len.toLong())

public actual fun pthreadMachThreadNp(thread: PthreadT): MachPortT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadMachThreadNp(thread.toLong()).toUInt()

public actual fun pthreadFromMachThreadNp(port: MachPortT): PthreadT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadFromMachThreadNp(port.toInt()).toULong()

public actual fun pthreadGetStackaddrNp(thread: PthreadT): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadGetStackaddrNp(thread.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun pthreadGetStacksizeNp(thread: PthreadT): SizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadGetStacksizeNp(thread.toLong()).toULong()

public actual fun pthreadMainNp(): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadMainNp()

public actual fun pthreadThreadidNp(thread: PthreadT, threadId: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadThreadidNp(thread.toLong(), (threadId?.value ?: 0L))

public actual fun pthreadJitWriteProtectNp(enabled: CInt) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadJitWriteProtectNp(enabled)
}

public actual fun pthreadJitWriteProtectSupportedNp(): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadJitWriteProtectSupportedNp()

public actual fun pthreadJitWriteWithCallbackNp(callback: PthreadJitWriteCallbackT, ctx: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadJitWriteWithCallbackNp(0L, (ctx?.value ?: 0L))

public actual fun pthreadJitWriteFreezeCallbacksNp() {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadJitWriteFreezeCallbacksNp()
}

public actual fun pthreadCpuNumberNp(cpuNumberOut: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pthreadCpuNumberNp((cpuNumberOut?.value ?: 0L))

public actual fun osSyncWaitOnAddress(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osSyncWaitOnAddress((addr?.value ?: 0L), value.toLong(), size.toLong(), flags.toInt())

public actual fun osSyncWaitOnAddressWithDeadline(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, deadline: ULong): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osSyncWaitOnAddressWithDeadline((addr?.value ?: 0L), value.toLong(), size.toLong(), flags.toInt(), clockid.toInt(), deadline.toLong())

public actual fun osSyncWaitOnAddressWithTimeout(addr: COpaquePointer?, value: ULong, size: SizeT, flags: OsSyncWaitOnAddressFlagsT, clockid: OsClockidT, timeoutNs: ULong): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osSyncWaitOnAddressWithTimeout((addr?.value ?: 0L), value.toLong(), size.toLong(), flags.toInt(), clockid.toInt(), timeoutNs.toLong())

public actual fun osSyncWakeByAddressAny(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osSyncWakeByAddressAny((addr?.value ?: 0L), size.toLong(), flags.toInt())

public actual fun osSyncWakeByAddressAll(addr: COpaquePointer?, size: SizeT, flags: OsSyncWakeByAddressFlagsT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osSyncWakeByAddressAll((addr?.value ?: 0L), size.toLong(), flags.toInt())

public actual fun osUnfairLockLock(lock: OsUnfairLockT) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osUnfairLockLock((lock?.value ?: 0L))
}

public actual fun osUnfairLockTrylock(lock: OsUnfairLockT): Boolean =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osUnfairLockTrylock((lock?.value ?: 0L))

public actual fun osUnfairLockUnlock(lock: OsUnfairLockT) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osUnfairLockUnlock((lock?.value ?: 0L))
}

public actual fun osUnfairLockAssertOwner(lock: OsUnfairLockT) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osUnfairLockAssertOwner((lock?.value ?: 0L))
}

public actual fun osUnfairLockAssertNotOwner(lock: OsUnfairLockT) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osUnfairLockAssertNotOwner((lock?.value ?: 0L))
}

public actual fun osLogCreate(subsystem: String?, category: String?): OsLogT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osLogCreate(subsystem, category).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun osLogTypeEnabled(oslog: OsLogT, tpe: OsLogTypeT): Boolean =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osLogTypeEnabled((oslog?.value ?: 0L), tpe.toByte())

public actual fun osSignpostIdMakeWithPointer(log: OsLogT, ptr: COpaquePointer?): OsSignpostIdT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osSignpostIdMakeWithPointer((log?.value ?: 0L), (ptr?.value ?: 0L)).toULong()

public actual fun osSignpostIdGenerate(log: OsLogT): OsSignpostIdT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osSignpostIdGenerate((log?.value ?: 0L)).toULong()

public actual fun osSignpostEnabled(log: OsLogT): Boolean =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_osSignpostEnabled((log?.value ?: 0L))

public actual fun threadPolicySet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: MachMsgTypeNumberT): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_threadPolicySet(thread.toLong(), flavor.toInt(), (policyInfo?.value ?: 0L), count.toInt())

public actual fun threadPolicyGet(thread: ThreadT, flavor: ThreadPolicyFlavorT, policyInfo: ThreadPolicyT, count: COpaquePointer?, getDefault: COpaquePointer?): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_threadPolicyGet(thread.toLong(), flavor.toInt(), (policyInfo?.value ?: 0L), (count?.value ?: 0L), (getDefault?.value ?: 0L))

public actual fun threadInfo(targetAct: ThreadInspectT, flavor: ThreadFlavorT, threadInfoOut: ThreadInfoT, threadInfoOutCnt: COpaquePointer?): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_threadInfo(targetAct.toInt(), flavor.toInt(), (threadInfoOut?.value ?: 0L), (threadInfoOutCnt?.value ?: 0L))

public actual fun error(): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_error().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_backtrace((buf?.value ?: 0L), sz)

public actual fun backtraceSymbols(addrs: COpaquePointer?, sz: CInt): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_backtraceSymbols((addrs?.value ?: 0L), sz).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun backtraceSymbolsFd(addrs: COpaquePointer?, sz: CInt, fd: CInt) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_backtraceSymbolsFd((addrs?.value ?: 0L), sz, fd)
}

public actual fun backtraceFromFp(startfp: COpaquePointer?, array: COpaquePointer?, size: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_backtraceFromFp((startfp?.value ?: 0L), (array?.value ?: 0L), size)

public actual fun backtraceImageOffsets(array: COpaquePointer?, imageOffsets: COpaquePointer?, size: CInt) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_backtraceImageOffsets((array?.value ?: 0L), (imageOffsets?.value ?: 0L), size)
}

public actual fun backtraceAsync(array: COpaquePointer?, length: SizeT, taskId: COpaquePointer?): SizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_backtraceAsync((array?.value ?: 0L), length.toLong(), (taskId?.value ?: 0L)).toULong()

public actual fun statfs(path: String?, buf: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_statfs(path, (buf?.value ?: 0L))

public actual fun fstatfs(fd: CInt, buf: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_fstatfs(fd, (buf?.value ?: 0L))

public actual fun kevent(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, timeout: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_kevent(kq, (changelist?.value ?: 0L), nchanges, (eventlist?.value ?: 0L), nevents, (timeout?.value ?: 0L))

public actual fun kevent64(kq: CInt, changelist: COpaquePointer?, nchanges: CInt, eventlist: COpaquePointer?, nevents: CInt, flags: CUint, timeout: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_kevent64(kq, (changelist?.value ?: 0L), nchanges, (eventlist?.value ?: 0L), nevents, flags.toInt(), (timeout?.value ?: 0L))

public actual fun mount(src: String?, target: String?, flags: CInt, data: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mount(src, target, flags, (data?.value ?: 0L))

public actual fun fmount(src: String?, fd: CInt, flags: CInt, data: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_fmount(src, fd, flags, (data?.value ?: 0L))

public actual fun ptrace(request: CInt, pid: PidT, addr: COpaquePointer?, data: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_ptrace(request, pid, (addr?.value ?: 0L), data)

public actual fun quotactl(special: String?, cmd: CInt, id: CInt, data: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_quotactl(special, cmd, id, (data?.value ?: 0L))

public actual fun sethostname(name: String?, len: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_sethostname(name, len)

public actual fun sendfile(fd: CInt, s: CInt, offset: OffT, len: COpaquePointer?, hdtr: COpaquePointer?, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_sendfile(fd, s, offset, (len?.value ?: 0L), (hdtr?.value ?: 0L), flags)

public actual fun futimens(fd: CInt, times: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_futimens(fd, (times?.value ?: 0L))

public actual fun utimensat(dirfd: CInt, path: String?, times: COpaquePointer?, flag: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_utimensat(dirfd, path, (times?.value ?: 0L), flag)

public actual fun openpty(amaster: COpaquePointer?, aslave: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_openpty((amaster?.value ?: 0L), (aslave?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun forkpty(amaster: COpaquePointer?, name: COpaquePointer?, termp: COpaquePointer?, winp: COpaquePointer?): PidT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_forkpty((amaster?.value ?: 0L), (name?.value ?: 0L), (termp?.value ?: 0L), (winp?.value ?: 0L))

public actual fun loginTty(fd: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_loginTty(fd)

public actual fun duplocale(base: LocaleT): LocaleT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_duplocale((base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun freelocale(loc: LocaleT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_freelocale((loc?.value ?: 0L))

public actual fun localeconvL(loc: LocaleT): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_localeconvL((loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun newlocale(mask: CInt, locale: String?, base: LocaleT): LocaleT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_newlocale(mask, locale, (base?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun uselocale(loc: LocaleT): LocaleT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_uselocale((loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun querylocale(mask: CInt, loc: LocaleT): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_querylocale(mask, (loc?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getpriority(which: CInt, who: IdT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getpriority(which, who.toInt())

public actual fun setpriority(which: CInt, who: IdT, prio: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_setpriority(which, who.toInt(), prio)

public actual fun getdomainname(name: COpaquePointer?, len: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getdomainname((name?.value ?: 0L), len)

public actual fun setdomainname(name: String?, len: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_setdomainname(name, len)

public actual fun preadv(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_preadv(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun pwritev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT): SsizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_pwritev(fd, (iov?.value ?: 0L), iovcnt, offset)

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getxattr(path, name, (value?.value ?: 0L), size.toLong(), position.toInt(), flags)

public actual fun fgetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): SsizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_fgetxattr(filedes, name, (value?.value ?: 0L), size.toLong(), position.toInt(), flags)

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_setxattr(path, name, (value?.value ?: 0L), size.toLong(), position.toInt(), flags)

public actual fun fsetxattr(filedes: CInt, name: String?, value: COpaquePointer?, size: SizeT, position: UInt, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_fsetxattr(filedes, name, (value?.value ?: 0L), size.toLong(), position.toInt(), flags)

public actual fun listxattr(path: String?, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_listxattr(path, (list?.value ?: 0L), size.toLong(), flags)

public actual fun flistxattr(filedes: CInt, list: COpaquePointer?, size: SizeT, flags: CInt): SsizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_flistxattr(filedes, (list?.value ?: 0L), size.toLong(), flags)

public actual fun removexattr(path: String?, name: String?, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_removexattr(path, name, flags)

public actual fun renamexNp(from: String?, to: String?, flags: CUint): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_renamexNp(from, to, flags.toInt())

public actual fun renameatxNp(fromfd: CInt, from: String?, tofd: CInt, to: String?, flags: CUint): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_renameatxNp(fromfd, from, tofd, to, flags.toInt())

public actual fun fremovexattr(filedes: CInt, name: String?, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_fremovexattr(filedes, name, flags)

public actual fun getgrouplist(name: String?, basegid: CInt, groups: COpaquePointer?, ngroups: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getgrouplist(name, basegid, (groups?.value ?: 0L), (ngroups?.value ?: 0L))

public actual fun initgroups(user: String?, basegroup: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_initgroups(user, basegroup)

public actual fun waitid(idtype: IdtypeT, id: IdT, infop: COpaquePointer?, options: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_waitid(idtype.toInt(), id.toInt(), (infop?.value ?: 0L), options)

public actual fun brk(addr: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_brk((addr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun sbrk(increment: CInt): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_sbrk(increment).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun settimeofday(tv: COpaquePointer?, tz: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_settimeofday((tv?.value ?: 0L), (tz?.value ?: 0L))

public actual fun dyldImageCount(): UInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_dyldImageCount().toUInt()

public actual fun dyldGetImageHeader(imageIndex: UInt): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_dyldGetImageHeader(imageIndex.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun dyldGetImageVmaddrSlide(imageIndex: UInt): IntptrT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_dyldGetImageVmaddrSlide(imageIndex.toInt())

public actual fun dyldGetImageName(imageIndex: UInt): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_dyldGetImageName(imageIndex.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixSpawn(pid: COpaquePointer?, path: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawn((pid?.value ?: 0L), path, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnp(pid: COpaquePointer?, file: String?, fileActions: COpaquePointer?, attrp: COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnp((pid?.value ?: 0L), file, (fileActions?.value ?: 0L), (attrp?.value ?: 0L), (argv?.value ?: 0L), (envp?.value ?: 0L))

public actual fun posixSpawnattrInit(attr: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrInit((attr?.value ?: 0L))

public actual fun posixSpawnattrDestroy(attr: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrDestroy((attr?.value ?: 0L))

public actual fun posixSpawnattrGetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrGetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigdefault(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrSetsigdefault((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrGetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrSetsigmask(attr: COpaquePointer?, default: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrSetsigmask((attr?.value ?: 0L), (default?.value ?: 0L))

public actual fun posixSpawnattrGetflags(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrGetflags((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetflags(attr: COpaquePointer?, flags: CShort): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrSetflags((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrGetpgroup(attr: COpaquePointer?, flags: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrGetpgroup((attr?.value ?: 0L), (flags?.value ?: 0L))

public actual fun posixSpawnattrSetpgroup(attr: COpaquePointer?, flags: PidT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrSetpgroup((attr?.value ?: 0L), flags)

public actual fun posixSpawnattrSetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrSetarchprefNp((attr?.value ?: 0L), count.toLong(), (pref?.value ?: 0L), (subpref?.value ?: 0L), (ocount?.value ?: 0L))

public actual fun posixSpawnattrGetarchprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, subpref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrGetarchprefNp((attr?.value ?: 0L), count.toLong(), (pref?.value ?: 0L), (subpref?.value ?: 0L), (ocount?.value ?: 0L))

public actual fun posixSpawnattrGetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrGetbinprefNp((attr?.value ?: 0L), count.toLong(), (pref?.value ?: 0L), (ocount?.value ?: 0L))

public actual fun posixSpawnattrSetbinprefNp(attr: COpaquePointer?, count: SizeT, pref: COpaquePointer?, ocount: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnattrSetbinprefNp((attr?.value ?: 0L), count.toLong(), (pref?.value ?: 0L), (ocount?.value ?: 0L))

public actual fun posixSpawnFileActionsInit(actions: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnFileActionsInit((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsDestroy(actions: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnFileActionsDestroy((actions?.value ?: 0L))

public actual fun posixSpawnFileActionsAddopen(actions: COpaquePointer?, fd: CInt, path: String?, oflag: CInt, mode: ModeT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnFileActionsAddopen((actions?.value ?: 0L), fd, path, oflag, mode.toShort())

public actual fun posixSpawnFileActionsAddclose(actions: COpaquePointer?, fd: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnFileActionsAddclose((actions?.value ?: 0L), fd)

public actual fun posixSpawnFileActionsAdddup2(actions: COpaquePointer?, fd: CInt, newfd: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_posixSpawnFileActionsAdddup2((actions?.value ?: 0L), fd, newfd)

public actual fun uname(buf: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_uname((buf?.value ?: 0L))

public actual fun connectx(socket: CInt, endpoints: COpaquePointer?, associd: SaeAssocidT, flags: CUint, iov: COpaquePointer?, iovcnt: CUint, len: COpaquePointer?, connid: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_connectx(socket, (endpoints?.value ?: 0L), associd.toInt(), flags.toInt(), (iov?.value ?: 0L), iovcnt.toInt(), (len?.value ?: 0L), (connid?.value ?: 0L))

public actual fun disconnectx(socket: CInt, associd: SaeAssocidT, connid: SaeConnidT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_disconnectx(socket, associd.toInt(), connid.toInt())

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_ntpAdjtime((buf?.value ?: 0L))

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_ntpGettime((buf?.value ?: 0L))

public actual fun getmntinfo(mntbufp: COpaquePointer?, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getmntinfo((mntbufp?.value ?: 0L), flags)

public actual fun getfsstat(mntbufp: COpaquePointer?, bufsize: CInt, flags: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getfsstat((mntbufp?.value ?: 0L), bufsize, flags)

public actual fun clonefile(src: String?, dst: String?, flags: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_clonefile(src, dst, flags.toInt())

public actual fun clonefileat(srcDirfd: CInt, src: String?, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_clonefileat(srcDirfd, src, dstDirfd, dst, flags.toInt())

public actual fun fclonefileat(srcfd: CInt, dstDirfd: CInt, dst: String?, flags: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_fclonefileat(srcfd, dstDirfd, dst, flags.toInt())

public actual fun copyfile(from: String?, to: String?, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_copyfile(from, to, (state?.value ?: 0L), flags.toInt())

public actual fun fcopyfile(from: CInt, to: CInt, state: CopyfileStateT, flags: CopyfileFlagsT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_fcopyfile(from, to, (state?.value ?: 0L), flags.toInt())

public actual fun copyfileStateFree(s: CopyfileStateT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_copyfileStateFree((s?.value ?: 0L))

public actual fun copyfileStateAlloc(): CopyfileStateT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_copyfileStateAlloc().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun copyfileStateGet(s: CopyfileStateT, flags: UInt, dst: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_copyfileStateGet((s?.value ?: 0L), flags.toInt(), (dst?.value ?: 0L))

public actual fun copyfileStateSet(s: CopyfileStateT, flags: UInt, src: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_copyfileStateSet((s?.value ?: 0L), flags.toInt(), (src?.value ?: 0L))

public actual fun machErrorString(errorValue: MachErrorT): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_machErrorString(errorValue).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun memsetS(s: COpaquePointer?, smax: SizeT, c: CInt, n: SizeT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_memsetS((s?.value ?: 0L), smax.toLong(), c, n.toLong())

public actual fun memsetPattern4(b: COpaquePointer?, pattern4: COpaquePointer?, len: SizeT) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_memsetPattern4((b?.value ?: 0L), (pattern4?.value ?: 0L), len.toLong())
}

public actual fun memsetPattern8(b: COpaquePointer?, pattern8: COpaquePointer?, len: SizeT) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_memsetPattern8((b?.value ?: 0L), (pattern8?.value ?: 0L), len.toLong())
}

public actual fun memsetPattern16(b: COpaquePointer?, pattern16: COpaquePointer?, len: SizeT) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_memsetPattern16((b?.value ?: 0L), (pattern16?.value ?: 0L), len.toLong())
}

public actual fun strtonum(numstr: String?, minval: CLonglong, maxval: CLonglong, errstrp: COpaquePointer?): CLonglong =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_strtonum(numstr, minval, maxval, (errstrp?.value ?: 0L))

public actual fun mstats(): Mstats =
    Mstats()

public actual fun mallocPrintf(format: String?, vararg variadicArgs: Long) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocPrintf(format, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}

public actual fun mallocZoneCheck(zone: COpaquePointer?): BooleanT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZoneCheck((zone?.value ?: 0L))

public actual fun mallocZonePrint(zone: COpaquePointer?, verbose: BooleanT) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZonePrint((zone?.value ?: 0L), verbose)
}

public actual fun mallocZoneStatistics(zone: COpaquePointer?, stats: COpaquePointer?) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZoneStatistics((zone?.value ?: 0L), (stats?.value ?: 0L))
}

public actual fun mallocZoneLog(zone: COpaquePointer?, address: COpaquePointer?) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZoneLog((zone?.value ?: 0L), (address?.value ?: 0L))
}

public actual fun mallocZonePrintPtrInfo(ptr: COpaquePointer?) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZonePrintPtrInfo((ptr?.value ?: 0L))
}

public actual fun mallocDefaultZone(): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocDefaultZone().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneFromPtr(ptr: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZoneFromPtr((ptr?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneMalloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZoneMalloc((zone?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneValloc(zone: COpaquePointer?, size: SizeT): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZoneValloc((zone?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneCalloc(zone: COpaquePointer?, numItems: SizeT, size: SizeT): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZoneCalloc((zone?.value ?: 0L), numItems.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneRealloc(zone: COpaquePointer?, ptr: COpaquePointer?, size: SizeT): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZoneRealloc((zone?.value ?: 0L), (ptr?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mallocZoneFree(zone: COpaquePointer?, ptr: COpaquePointer?) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocZoneFree((zone?.value ?: 0L), (ptr?.value ?: 0L))
}

public actual fun procListpids(t: UInt, typeinfo: UInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procListpids(t.toInt(), typeinfo.toInt(), (buffer?.value ?: 0L), buffersize)

public actual fun procListallpids(buffer: COpaquePointer?, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procListallpids((buffer?.value ?: 0L), buffersize)

public actual fun procListpgrppids(pgrpid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procListpgrppids(pgrpid, (buffer?.value ?: 0L), buffersize)

public actual fun procListchildpids(ppid: PidT, buffer: COpaquePointer?, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procListchildpids(ppid, (buffer?.value ?: 0L), buffersize)

public actual fun procPidinfo(pid: CInt, flavor: CInt, arg: ULong, buffer: COpaquePointer?, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procPidinfo(pid, flavor, arg.toLong(), (buffer?.value ?: 0L), buffersize)

public actual fun procPidfdinfo(pid: CInt, fd: CInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procPidfdinfo(pid, fd, flavor, (buffer?.value ?: 0L), buffersize)

public actual fun procPidfileportinfo(pid: CInt, fileport: UInt, flavor: CInt, buffer: COpaquePointer?, buffersize: CInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procPidfileportinfo(pid, fileport.toInt(), flavor, (buffer?.value ?: 0L), buffersize)

public actual fun procPidpath(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procPidpath(pid, (buffer?.value ?: 0L), buffersize.toInt())

public actual fun procName(pid: CInt, buffer: COpaquePointer?, buffersize: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procName(pid, (buffer?.value ?: 0L), buffersize.toInt())

public actual fun procRegionfilename(pid: CInt, address: ULong, buffer: COpaquePointer?, buffersize: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procRegionfilename(pid, address.toLong(), (buffer?.value ?: 0L), buffersize.toInt())

public actual fun procKmsgbuf(buffer: COpaquePointer?, buffersize: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procKmsgbuf((buffer?.value ?: 0L), buffersize.toInt())

public actual fun procLibversion(major: COpaquePointer?, minor: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procLibversion((major?.value ?: 0L), (minor?.value ?: 0L))

public actual fun procPidRusage(pid: CInt, flavor: CInt, buffer: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procPidRusage(pid, flavor, (buffer?.value ?: 0L))

public actual fun procSetNoSmt(): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procSetNoSmt()

public actual fun procSetthreadNoSmt(): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procSetthreadNoSmt()

public actual fun procSetCsm(flags: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procSetCsm(flags.toInt())

public actual fun procSetthreadCsm(flags: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_procSetthreadCsm(flags.toInt())

public actual fun gethostuuid(id: COpaquePointer?, timeout: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_gethostuuid((id?.value ?: 0L), (timeout?.value ?: 0L))

public actual fun gethostid(): CLong =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_gethostid()

public actual fun sethostid(hostid: CLong) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_sethostid(hostid)
}

public actual fun cCRandomGenerateBytes(bytes: COpaquePointer?, size: SizeT): CCRNGStatus =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_cCRandomGenerateBytes((bytes?.value ?: 0L), size.toLong())

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getentropy((buf?.value ?: 0L), buflen.toLong())

public actual fun nsgetExecutablePath(buf: COpaquePointer?, bufsize: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_nsgetExecutablePath((buf?.value ?: 0L), (bufsize?.value ?: 0L))

public actual fun nsgetArgv(): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_nsgetArgv().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nsgetArgc(): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_nsgetArgc().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nsgetEnviron(): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_nsgetEnviron().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun nsgetProgname(): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_nsgetProgname().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun machVmMap(targetTask: VmMapT, address: COpaquePointer?, size: MachVmSizeT, mask: MachVmOffsetT, flags: CInt, obj: MemEntryNamePortT, offset: MemoryObjectOffsetT, copy: BooleanT, curProtection: VmProtT, maxProtection: VmProtT, inheritance: VmInheritT): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_machVmMap(targetTask.toLong(), (address?.value ?: 0L), size.toLong(), mask.toLong(), flags, obj.toInt(), offset.toLong(), copy, curProtection, maxProtection, inheritance.toInt())

public actual fun vmAllocate(targetTask: VmMapT, address: COpaquePointer?, size: VmSizeT, flags: CInt): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_vmAllocate(targetTask.toLong(), (address?.value ?: 0L), size.toLong(), flags)

public actual fun vmDeallocate(targetTask: VmMapT, address: VmAddressT, size: VmSizeT): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_vmDeallocate(targetTask.toLong(), address.toLong(), size.toLong())

public actual fun hostStatistics64(hostPriv: HostT, flavor: HostFlavorT, hostInfo64Out: HostInfo64T, hostInfo64OutCnt: COpaquePointer?): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_hostStatistics64(hostPriv.toInt(), flavor, (hostInfo64Out?.value ?: 0L), (hostInfo64OutCnt?.value ?: 0L))

public actual fun hostProcessorInfo(host: HostT, flavor: ProcessorFlavorT, outProcessorCount: COpaquePointer?, outProcessorInfo: COpaquePointer?, outProcessorInfoCnt: COpaquePointer?): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_hostProcessorInfo(host.toInt(), flavor, (outProcessorCount?.value ?: 0L), (outProcessorInfo?.value ?: 0L), (outProcessorInfoCnt?.value ?: 0L))

public actual fun taskForPid(host: MachPortT, pid: PidT, task: COpaquePointer?): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_taskForPid(host.toInt(), pid, (task?.value ?: 0L))

public actual fun taskInfo(host: MachPortT, flavor: TaskFlavorT, taskInfoOut: TaskInfoT, taskInfoCount: COpaquePointer?): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_taskInfo(host.toInt(), flavor.toInt(), (taskInfoOut?.value ?: 0L), (taskInfoCount?.value ?: 0L))

public actual fun taskCreate(targetTask: TaskT, ledgers: LedgerArrayT, ledgersCnt: MachMsgTypeNumberT, inheritMemory: BooleanT, childTask: COpaquePointer?): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_taskCreate(targetTask.toInt(), (ledgers?.value ?: 0L), ledgersCnt.toInt(), inheritMemory, (childTask?.value ?: 0L))

public actual fun taskTerminate(targetTask: TaskT): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_taskTerminate(targetTask.toInt())

public actual fun taskThreads(targetTask: TaskInspectT, actList: COpaquePointer?, actListCnt: COpaquePointer?): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_taskThreads(targetTask.toInt(), (actList?.value ?: 0L), (actListCnt?.value ?: 0L))

public actual fun hostStatistics(hostPriv: HostT, flavor: HostFlavorT, hostInfoOut: HostInfoT, hostInfoOutCnt: COpaquePointer?): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_hostStatistics(hostPriv.toInt(), flavor, (hostInfoOut?.value ?: 0L), (hostInfoOutCnt?.value ?: 0L))

public actual fun sysdirStartSearchPathEnumeration(dir: SysdirSearchPathDirectoryT, domainMask: SysdirSearchPathDomainMaskT): SysdirSearchPathEnumerationState =
    0u

public actual fun sysdirGetNextSearchPathEnumeration(state: SysdirSearchPathEnumerationState, path: COpaquePointer?): SysdirSearchPathEnumerationState =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_sysdirGetNextSearchPathEnumeration(state.toInt(), (path?.value ?: 0L)).toUInt()

public actual fun getattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getattrlist(path, (attrList?.value ?: 0L), (attrBuf?.value ?: 0L), attrBufSize.toLong(), options.toInt())

public actual fun fgetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_fgetattrlist(fd, (attrList?.value ?: 0L), (attrBuf?.value ?: 0L), attrBufSize.toLong(), options.toInt())

public actual fun getattrlistat(fd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: CUlong): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getattrlistat(fd, path, (attrList?.value ?: 0L), (attrBuf?.value ?: 0L), attrBufSize.toLong(), options.toLong())

public actual fun setattrlist(path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_setattrlist(path, (attrList?.value ?: 0L), (attrBuf?.value ?: 0L), attrBufSize.toLong(), options.toInt())

public actual fun fsetattrlist(fd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_fsetattrlist(fd, (attrList?.value ?: 0L), (attrBuf?.value ?: 0L), attrBufSize.toLong(), options.toInt())

public actual fun setattrlistat(dirFd: CInt, path: String?, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: UInt): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_setattrlistat(dirFd, path, (attrList?.value ?: 0L), (attrBuf?.value ?: 0L), attrBufSize.toLong(), options.toInt())

public actual fun getattrlistbulk(dirfd: CInt, attrList: COpaquePointer?, attrBuf: COpaquePointer?, attrBufSize: SizeT, options: ULong): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_getattrlistbulk(dirfd, (attrList?.value ?: 0L), (attrBuf?.value ?: 0L), attrBufSize.toLong(), options.toLong())

public actual fun mallocSize(ptr: COpaquePointer?): SizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocSize((ptr?.value ?: 0L)).toULong()

public actual fun mallocGoodSize(size: SizeT): SizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mallocGoodSize(size.toLong()).toULong()

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_dirname((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun basename(path: COpaquePointer?): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_basename((path?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun mkfifoat(dirfd: CInt, pathname: String?, mode: ModeT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mkfifoat(dirfd, pathname, mode.toShort())

public actual fun mknodat(dirfd: CInt, pathname: String?, mode: ModeT, dev: DevT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_mknodat(dirfd, pathname, mode.toShort(), dev)

public actual fun freadlink(fd: CInt, buf: COpaquePointer?, size: SizeT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_freadlink(fd, (buf?.value ?: 0L), size.toLong())

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_execvP(file, searchPath, (argv?.value ?: 0L))

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, arg: COpaquePointer?, compar: QsortRComparCallback?) {
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_qsortR((base?.value ?: 0L), num.toLong(), size.toLong(), (arg?.value ?: 0L), 0L)
}

public actual fun clockSettime(clockId: ClockidT, tp: COpaquePointer?): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_clockSettime(clockId.toInt(), (tp?.value ?: 0L))

public actual fun memmem(haystack: COpaquePointer?, haystacklen: SizeT, needle: COpaquePointer?, needlelen: SizeT): COpaquePointer? =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_memmem((haystack?.value ?: 0L), haystacklen.toLong(), (needle?.value ?: 0L), needlelen.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun taskSetInfo(targetTask: TaskT, flavor: TaskFlavorT, taskInfoIn: TaskInfoT, taskInfoInCnt: MachMsgTypeNumberT): KernReturnT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_taskSetInfo(targetTask.toInt(), flavor.toInt(), (taskInfoIn?.value ?: 0L), taskInfoInCnt.toInt())

public actual fun iconvOpen(tocode: String?, fromcode: String?): IconvT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_iconvOpen(tocode, fromcode).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun iconv(cd: IconvT, inbuf: COpaquePointer?, inbytesleft: COpaquePointer?, outbuf: COpaquePointer?, outbytesleft: COpaquePointer?): SizeT =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_iconv((cd?.value ?: 0L), (inbuf?.value ?: 0L), (inbytesleft?.value ?: 0L), (outbuf?.value ?: 0L), (outbytesleft?.value ?: 0L)).toULong()

public actual fun iconvClose(cd: IconvT): CInt =
    UnixBsdAppleJniBridge.libc_unix_bsd_apple_iconvClose((cd?.value ?: 0L))
