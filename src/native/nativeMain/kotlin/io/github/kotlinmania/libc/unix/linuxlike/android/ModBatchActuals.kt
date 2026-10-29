@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.android
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.bioniclibc.sys.Cmsghdr
import io.github.kotlinmania.libc.new.bioniclibc.sys.Msghdr
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.Pollfd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.getnameinfo
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.SchedParam
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.android.b64.Sysinfo
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toLong
import libc.cinterop.libc_basename
import libc.cinterop.libc_daemon
import libc.cinterop.libc_dirname
import libc.cinterop.libc_endgrent
import libc.cinterop.libc_faccessat
import libc.cinterop.libc_getpriority
import libc.cinterop.libc_getrlimit
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_initgroups
import libc.cinterop.libc_popen
import libc.cinterop.libc_sched_get_priority_max
import libc.cinterop.libc_sched_get_priority_min
import libc.cinterop.libc_sched_getscheduler
import libc.cinterop.libc_sem_unlink
import libc.cinterop.libc_setgrent
import libc.cinterop.libc_setpriority
import libc.cinterop.libc_setrlimit
import libc.cinterop.libc_settimeofday

public actual fun cmsgNextHdr(mhdr: Msghdr?, cmsg: Cmsghdr?): Cmsghdr? =
    throw UnsupportedOperationException("cMSGNXTHDR requires manual FFI bridge — not yet implemented")

public actual fun cpuAllocSize(count: Int): ULong =
    throw UnsupportedOperationException("cPUALLOCSIZE requires manual FFI bridge — not yet implemented")

public actual fun cpuZero(cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUZERO requires manual FFI bridge — not yet implemented")

public actual fun cpuSet(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUSET requires manual FFI bridge — not yet implemented")

public actual fun cpuClear(cpu: ULong, cpuset: CpuSetT?): Unit = throw UnsupportedOperationException("cPUCLR requires manual FFI bridge — not yet implemented")

public actual fun cpuIsSet(cpu: ULong, cpuset: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUISSET requires manual FFI bridge — not yet implemented")

public actual fun cpuCountS(size: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNTS requires manual FFI bridge — not yet implemented")

public actual fun cpuCount(cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("cPUCOUNT requires manual FFI bridge — not yet implemented")

public actual fun cpuEqual(set1: CpuSetT?, set2: CpuSetT?): Boolean =
    throw UnsupportedOperationException("cPUEQUAL requires manual FFI bridge — not yet implemented")

public actual fun nlaAlign(len: Int): Int =
    throw UnsupportedOperationException("nLAALIGN requires manual FFI bridge — not yet implemented")

public actual fun soEeOffender(ee: SockExtendedErr?): Sockaddr? =
    throw UnsupportedOperationException("sOEEOFFENDER requires manual FFI bridge — not yet implemented")

public actual fun setgrent() {
    libc_setgrent()
}

public actual fun endgrent() {
    libc_endgrent()
}

public actual fun getgrent(): Group? =
    throw UnsupportedOperationException("getgrent requires manual FFI bridge — not yet implemented")

public actual fun getrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun setrlimit64(resource: Int, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun getrlimit(resource: Int, rlim: Rlimit?): Int {
    if (rlim == null) return -1
    val rlimPtr: CPointer<ByteVar>? = rlim.handle.toCPointer()
    val result = libc_getrlimit(resource, rlimPtr)
    return result
}

public actual fun setrlimit(resource: Int, rlim: Rlimit?): Int {
    if (rlim == null) return -1
    val rlpPtr: CPointer<ByteVar>? = rlim.handle.toCPointer()
    val result = libc_setrlimit(resource, rlpPtr)
    return result
}

public actual fun prlimit(pid: Int, resource: Int, newLimit: Rlimit?, oldLimit: Rlimit?): Int =
    throw UnsupportedOperationException("prlimit requires manual FFI bridge — not yet implemented")

public actual fun prlimit64(pid: Int, resource: Int, newLimit: Rlimit64?, oldLimit: Rlimit64?): Int =
    throw UnsupportedOperationException("prlimit64 requires manual FFI bridge — not yet implemented")

public actual fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int =
    throw UnsupportedOperationException("strerrorR requires FFI bridge")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int {
    if (tp == null) return -1
    val tvPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.handle.toCPointer()
    val result = libc_gettimeofday(tvPtr, tzPtr)
    return result
}

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("mlock2 requires manual FFI bridge — not yet implemented")

public actual fun madvise(addr: COpaquePointer?, len: ULong, advice: Int): Int =
    throw UnsupportedOperationException("madvise requires FFI bridge")

public actual fun msync(addr: COpaquePointer?, len: ULong, flags: Int): Int =
    throw UnsupportedOperationException("msync requires FFI bridge")

public actual fun mprotect(addr: COpaquePointer?, len: ULong, prot: Int): Int =
    throw UnsupportedOperationException("mprotect requires FFI bridge")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int {
    val hLen = hostlen.toUInt()
    val sLen = servlen.toUInt()
    val hBuf = if (hLen > 0u) ByteArray(hLen.toInt().coerceAtMost(4096)) else null
    val sBuf = if (sLen > 0u) ByteArray(sLen.toInt().coerceAtMost(256)) else null
    return getnameinfo(sa, salen, hBuf, hLen, sBuf, sLen, flags)
}

public actual fun preadv(fd: Int, iov: Iovec?, count: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires FFI bridge")

public actual fun pwritev(fd: Int, iov: Iovec?, count: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires FFI bridge")

public actual fun processVmReadv(pid: Int, localIov: Iovec?, localIovCount: ULong, remoteIov: Iovec?, remoteIovCount: ULong, flags: ULong): Long =
    throw UnsupportedOperationException("processVmReadv requires manual FFI bridge — not yet implemented")

public actual fun processVmWritev(pid: Int, localIov: Iovec?, localIovCount: ULong, remoteIov: Iovec?, remoteIovCount: ULong, flags: ULong): Long =
    throw UnsupportedOperationException("processVmWritev requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: Int, vararg args: Any?): Long =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun getpriority(which: Int, who: UInt): Int {
    val result = libc_getpriority(which, who.toInt())
    return result
}

public actual fun setpriority(which: Int, who: UInt, prio: Int): Int {
    val result = libc_setpriority(which, who.toInt(), prio)
    return result
}

public actual fun schedCpualloc(count: ULong): CpuSetT? =
    throw UnsupportedOperationException("schedCpualloc requires manual FFI bridge — not yet implemented")

public actual fun schedCpufree(set: CpuSetT?): Unit = throw UnsupportedOperationException("schedCpufree requires manual FFI bridge — not yet implemented")

public actual fun schedCpucount(setsize: ULong, set: CpuSetT?): Int =
    throw UnsupportedOperationException("schedCpucount requires manual FFI bridge — not yet implemented")

public actual fun schedGetcpu(): Int =
    throw UnsupportedOperationException("schedGetcpu requires manual FFI bridge — not yet implemented")

public actual fun mallocInfo(options: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("mallocInfo requires manual FFI bridge — not yet implemented")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires manual FFI bridge — not yet implemented")

public actual fun utmpname(name: String?): Int =
    throw UnsupportedOperationException("utmpname requires manual FFI bridge — not yet implemented")

public actual fun setutent(): Unit = throw UnsupportedOperationException("setutent requires manual FFI bridge — not yet implemented")

public actual fun getutent(): Utmp? =
    throw UnsupportedOperationException("getutent requires manual FFI bridge — not yet implemented")

public actual fun seekdir(dirp: DIR?, loc: Long): Unit = throw UnsupportedOperationException("seekdir requires manual FFI bridge — not yet implemented")

public actual fun telldir(dirp: DIR?): Long =
    throw UnsupportedOperationException("telldir requires FFI bridge")

public actual fun fallocate(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate requires manual FFI bridge — not yet implemented")

public actual fun fallocate64(fd: Int, mode: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("fallocate64 requires manual FFI bridge — not yet implemented")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires FFI bridge")

public actual fun posixFallocate64(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate64 requires manual FFI bridge — not yet implemented")

public actual fun getxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("getxattr requires manual FFI bridge — not yet implemented")

public actual fun lgetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("lgetxattr requires manual FFI bridge — not yet implemented")

public actual fun fgetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong): Long =
    throw UnsupportedOperationException("fgetxattr requires manual FFI bridge — not yet implemented")

public actual fun setxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("setxattr requires manual FFI bridge — not yet implemented")

public actual fun lsetxattr(path: String?, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("lsetxattr requires manual FFI bridge — not yet implemented")

public actual fun fsetxattr(filedes: Int, name: String?, value: COpaquePointer?, size: ULong, flags: Int): Int =
    throw UnsupportedOperationException("fsetxattr requires manual FFI bridge — not yet implemented")

public actual fun listxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("listxattr requires manual FFI bridge — not yet implemented")

public actual fun llistxattr(path: String?, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("llistxattr requires manual FFI bridge — not yet implemented")

public actual fun flistxattr(filedes: Int, list: String?, size: ULong): Long =
    throw UnsupportedOperationException("flistxattr requires manual FFI bridge — not yet implemented")

public actual fun removexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("removexattr requires manual FFI bridge — not yet implemented")

public actual fun lremovexattr(path: String?, name: String?): Int =
    throw UnsupportedOperationException("lremovexattr requires manual FFI bridge — not yet implemented")

public actual fun fremovexattr(filedes: Int, name: String?): Int =
    throw UnsupportedOperationException("fremovexattr requires manual FFI bridge — not yet implemented")

public actual fun signalfd(fd: Int, mask: ULong?, flags: Int): Int =
    throw UnsupportedOperationException("signalfd requires manual FFI bridge — not yet implemented")

public actual fun timerfdCreate(clock: Int, flags: Int): Int =
    throw UnsupportedOperationException("timerfdCreate requires manual FFI bridge — not yet implemented")

public actual fun timerfdGettime(fd: Int, currentValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdGettime requires manual FFI bridge — not yet implemented")

public actual fun timerfdSettime(fd: Int, flags: Int, newValue: Itimerspec?, oldValue: Itimerspec?): Int =
    throw UnsupportedOperationException("timerfdSettime requires manual FFI bridge — not yet implemented")

public actual fun syscall(num: Long, vararg args: Any?): Long =
    throw UnsupportedOperationException("syscall requires manual FFI bridge — not yet implemented")

public actual fun schedGetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedGetaffinity requires manual FFI bridge — not yet implemented")

public actual fun schedSetaffinity(pid: Int, cpusetsize: ULong, cpuset: CpuSetT?): Int =
    throw UnsupportedOperationException("schedSetaffinity requires manual FFI bridge — not yet implemented")

public actual fun epollCreate(size: Int): Int =
    throw UnsupportedOperationException("epollCreate requires manual FFI bridge — not yet implemented")

public actual fun epollCreate1(flags: Int): Int =
    throw UnsupportedOperationException("epollCreate1 requires manual FFI bridge — not yet implemented")

public actual fun epollWait(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Int): Int =
    throw UnsupportedOperationException("epollWait requires manual FFI bridge — not yet implemented")

public actual fun epollCtl(epfd: Int, op: Int, fd: Int, event: EpollEvent?): Int =
    throw UnsupportedOperationException("epollCtl requires manual FFI bridge — not yet implemented")

public actual fun unshare(flags: Int): Int =
    throw UnsupportedOperationException("unshare requires manual FFI bridge — not yet implemented")

public actual fun umount(target: String?): Int =
    throw UnsupportedOperationException("umount requires manual FFI bridge — not yet implemented")

public actual fun schedGetPriorityMax(policy: Int): Int {
    val result = libc_sched_get_priority_max(policy)
    return result
}

public actual fun tee(fdIn: Int, fdOut: Int, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("tee requires manual FFI bridge — not yet implemented")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int {
    if (tv == null) return -1
    val tvPtr: CPointer<ByteVar>? = tv.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.handle.toCPointer()
    val result = libc_settimeofday(tvPtr, tzPtr)
    return result
}

public actual fun splice(fdIn: Int, offIn: Long?, fdOut: Int, offOut: Long?, len: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("splice requires manual FFI bridge — not yet implemented")

public actual fun eventfd(initval: UInt, flags: Int): Int =
    throw UnsupportedOperationException("eventfd requires manual FFI bridge — not yet implemented")

public actual fun eventfdRead(fd: Int, value: ULong?): Int =
    throw UnsupportedOperationException("eventfdRead requires manual FFI bridge — not yet implemented")

public actual fun eventfdWrite(fd: Int, value: ULong): Int =
    throw UnsupportedOperationException("eventfdWrite requires manual FFI bridge — not yet implemented")

public actual fun schedRrGetInterval(pid: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun semTimedwait(sem: SemT?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires manual FFI bridge — not yet implemented")

public actual fun semGetvalue(sem: SemT?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun setns(fd: Int, nstype: Int): Int =
    throw UnsupportedOperationException("setns requires manual FFI bridge — not yet implemented")

public actual fun swapoff(puath: String?): Int =
    throw UnsupportedOperationException("swapoff requires manual FFI bridge — not yet implemented")

public actual fun vmsplice(fd: Int, iov: Iovec?, nrSegs: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("vmsplice requires manual FFI bridge — not yet implemented")

public actual fun mount(src: String?, target: String?, fstype: String?, flags: ULong, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("mount requires manual FFI bridge — not yet implemented")

public actual fun personality(persona: UInt): Int =
    throw UnsupportedOperationException("personality requires manual FFI bridge — not yet implemented")

public actual fun prctl(option: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("prctl requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun ppoll(fds: Pollfd?, nfds: UInt, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("ppoll requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: Int): Int {
    val result = libc_sched_getscheduler(pid)
    return result
}

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires FFI bridge")

public actual fun sethostname(name: String?, len: ULong): Int =
    throw UnsupportedOperationException("sethostname requires FFI bridge")

public actual fun schedGetPriorityMin(policy: Int): Int {
    val result = libc_sched_get_priority_min(policy)
    return result
}

public actual fun sysinfo(info: Sysinfo?): Int =
    throw UnsupportedOperationException("sysinfo requires manual FFI bridge — not yet implemented")

public actual fun umount2(target: String?, flags: Int): Int =
    throw UnsupportedOperationException("umount2 requires manual FFI bridge — not yet implemented")

public actual fun swapon(path: String?, swapflags: Int): Int =
    throw UnsupportedOperationException("swapon requires manual FFI bridge — not yet implemented")

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun sendfile(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long =
    throw UnsupportedOperationException("sendfile requires manual FFI bridge — not yet implemented")

public actual fun sendfile64(outFd: Int, inFd: Int, offset: Long?, count: ULong): Long =
    throw UnsupportedOperationException("sendfile64 requires manual FFI bridge — not yet implemented")

public actual fun setfsgid(gid: UInt): Int =
    throw UnsupportedOperationException("setfsgid requires manual FFI bridge — not yet implemented")

public actual fun setfsuid(uid: UInt): Int =
    throw UnsupportedOperationException("setfsuid requires manual FFI bridge — not yet implemented")

public actual fun sigsuspend(mask: ULong?): Int =
    throw UnsupportedOperationException("sigsuspend requires manual FFI bridge — not yet implemented")

public actual fun getgrgidR(gid: UInt, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrgidR requires manual FFI bridge — not yet implemented")

public actual fun sigaltstack(ss: StackT?, oss: StackT?): Int =
    throw UnsupportedOperationException("sigaltstack requires manual FFI bridge — not yet implemented")

public actual fun semClose(sem: SemT?): Int =
    throw UnsupportedOperationException("semClose requires manual FFI bridge — not yet implemented")

public actual fun getgrnamR(name: String?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrnamR requires manual FFI bridge — not yet implemented")

public actual fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT? =
    throw UnsupportedOperationException("semOpen requires manual FFI bridge — not yet implemented")

public actual fun getgrnam(name: String?): Group? =
    throw UnsupportedOperationException("getgrnam requires manual FFI bridge — not yet implemented")

public actual fun semUnlink(name: String?): Int {
    val result = libc_sem_unlink(name)
    return result
}

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    libc.cinterop.libc_daemon(nochdir, noclose)

public actual fun sigtimedwait(set: ULong?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires manual FFI bridge — not yet implemented")

public actual fun sigwait(set: ULong?, sig: Int?): Int =
    throw UnsupportedOperationException("sigwait requires manual FFI bridge — not yet implemented")

public actual fun getgrgid(gid: UInt): Group? =
    throw UnsupportedOperationException("getgrgid requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(user: String?, group: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires manual FFI bridge — not yet implemented")

public actual fun initgroups(user: String?, group: UInt): Int {
    val result = libc_initgroups(user, group.toInt())
    return result
}

public actual fun popen(command: String?, mode: String?): FILE? {
    val result = libc_popen(command, mode)
    return if (result != null) FILE(result.toLong()) else null
}

public actual fun faccessat(dirfd: Int, pathname: String?, mode: Int, flags: Int): Int {
    if (pathname == null) return -1
    return libc.cinterop.libc_faccessat(dirfd, pathname, mode, flags)
}

public actual fun errno(): Int? =
    libc.cinterop.libc_get_errno()

public actual fun inotifyRmWatch(fd: Int, wd: UInt): Int =
    throw UnsupportedOperationException("inotifyRmWatch requires manual FFI bridge — not yet implemented")

public actual fun inotifyInit(): Int =
    throw UnsupportedOperationException("inotifyInit requires manual FFI bridge — not yet implemented")

public actual fun inotifyInit1(flags: Int): Int =
    throw UnsupportedOperationException("inotifyInit1 requires manual FFI bridge — not yet implemented")

public actual fun inotifyAddWatch(fd: Int, path: String?, mask: UInt): Int =
    throw UnsupportedOperationException("inotifyAddWatch requires manual FFI bridge — not yet implemented")

public actual fun regcomp(preg: RegexT?, pattern: String?, cflags: Int): Int =
    throw UnsupportedOperationException("regcomp requires manual FFI bridge — not yet implemented")

public actual fun regexec(preg: RegexT?, input: String?, nmatch: ULong, pmatch: RegmatchT?, eflags: Int): Int =
    throw UnsupportedOperationException("regexec requires manual FFI bridge — not yet implemented")

public actual fun regerror(errcode: Int, preg: RegexT?, errbuf: String?, errbufSize: ULong): ULong =
    throw UnsupportedOperationException("regerror requires manual FFI bridge — not yet implemented")

public actual fun regfree(preg: RegexT?): Unit = throw UnsupportedOperationException("regfree requires manual FFI bridge — not yet implemented")

public actual fun androidSetAbortMessage(msg: String?): Unit = throw UnsupportedOperationException("androidSetAbortMessage requires manual FFI bridge — not yet implemented")

public actual fun gettid(): Int =
    throw UnsupportedOperationException("gettid requires manual FFI bridge — not yet implemented")

public actual fun tgkill(tgid: Int, tid: Int, sig: Int): Int =
    throw UnsupportedOperationException("tgkill requires manual FFI bridge — not yet implemented")

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires manual FFI bridge — not yet implemented")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires manual FFI bridge — not yet implemented")

public actual fun systemPropertySet(name: String?, value: String?): Int =
    throw UnsupportedOperationException("systemPropertySet requires manual FFI bridge — not yet implemented")

public actual fun systemPropertyGet(name: String?, value: String?): Int =
    throw UnsupportedOperationException("systemPropertyGet requires manual FFI bridge — not yet implemented")

public actual fun systemPropertyFind(name: String?): PropInfo? =
    throw UnsupportedOperationException("systemPropertyFind requires manual FFI bridge — not yet implemented")

public actual fun systemPropertyFindNth(n: UInt): PropInfo? =
    throw UnsupportedOperationException("systemPropertyFindNth requires manual FFI bridge — not yet implemented")

public actual fun arc4randomBuf(buf: COpaquePointer?, n: ULong): Unit = throw UnsupportedOperationException("arc4randomBuf requires manual FFI bridge — not yet implemented")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? {
    val result = libc_dirname(path)
    return result?.toKString()
}

public actual fun basename(path: String?): String? {
    val result = libc_basename(path)
    return result?.toKString()
}

public actual fun getoptLong(argc: Int, argv: COpaquePointer?, optstring: String?, longopts: Option?, longindex: Int?): Int =
    throw UnsupportedOperationException("getoptLong requires manual FFI bridge — not yet implemented")

public actual fun sync(): Unit = throw UnsupportedOperationException("sync requires manual FFI bridge — not yet implemented")

public actual fun syncfs(fd: Int): Int =
    throw UnsupportedOperationException("syncfs requires manual FFI bridge — not yet implemented")

public actual fun memmem(haystack: COpaquePointer?, haystacklen: ULong, needle: COpaquePointer?, needlelen: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memmem requires FFI bridge")

public actual fun freadUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("freadUnlocked requires manual FFI bridge — not yet implemented")

public actual fun fwriteUnlocked(buf: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong =
    throw UnsupportedOperationException("fwriteUnlocked requires manual FFI bridge — not yet implemented")

public actual fun fflushUnlocked(stream: FILE?): Int =
    throw UnsupportedOperationException("fflushUnlocked requires manual FFI bridge — not yet implemented")

public actual fun fgetsUnlocked(buf: String?, size: Int, stream: FILE?): String? =
    throw UnsupportedOperationException("fgetsUnlocked requires manual FFI bridge — not yet implemented")

public actual fun klogctl(syslogType: Int, bufp: String?, len: Int): Int =
    throw UnsupportedOperationException("klogctl requires manual FFI bridge — not yet implemented")

public actual fun memfdCreate(name: String?, flags: UInt): Int =
    throw UnsupportedOperationException("memfdCreate requires manual FFI bridge — not yet implemented")

public actual fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renameat2 requires manual FFI bridge — not yet implemented")

public actual fun clone(cb: ((COpaquePointer?) -> Int)?, childStack: COpaquePointer?, flags: Int, arg: COpaquePointer?, vararg args: Any?): Int =
    throw UnsupportedOperationException("clone requires manual FFI bridge — not yet implemented")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires manual FFI bridge — not yet implemented")

public actual fun systemPropertyForeach(callback: ((PropInfo?, COpaquePointer?) -> Unit)?, cookie: COpaquePointer?): Int =
    throw UnsupportedOperationException("systemPropertyForeach requires manual FFI bridge for ambiguous type")
