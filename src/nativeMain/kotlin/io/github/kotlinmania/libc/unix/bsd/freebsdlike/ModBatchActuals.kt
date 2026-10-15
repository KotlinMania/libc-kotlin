// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.getnameinfo
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import libc.cinterop.libc_daemon
import libc.cinterop.libc_dirfd
import libc.cinterop.libc_execvP
import libc.cinterop.libc_futimens
import libc.cinterop.libc_getpriority
import libc.cinterop.libc_gettimeofday
import libc.cinterop.libc_initgroups
import libc.cinterop.libc_lchflags
import libc.cinterop.libc_mkostemp
import libc.cinterop.libc_mkostemps
import libc.cinterop.libc_reboot
import libc.cinterop.libc_sched_getscheduler
import libc.cinterop.libc_setpriority
import libc.cinterop.libc_settimeofday
import libc.cinterop.libc_shm_open
import libc.cinterop.libc_utimensat

public actual fun semDestroy(sem: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("semDestroy requires manual FFI bridge — not yet implemented")

public actual fun semInit(sem: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int, value: UInt): Int =
    throw UnsupportedOperationException("semInit requires manual FFI bridge — not yet implemented")

public actual fun daemon(nochdir: Int, noclose: Int): Int =
    libc.cinterop.libc_daemon(nochdir, noclose)

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.handle.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun accept4(s: Int, addr: Sockaddr?, addrlen: UInt?, flags: Int): Int =
    throw UnsupportedOperationException("accept4 requires manual FFI bridge — not yet implemented")

public actual fun chflags(path: String?, flags: ULong): Int =
    throw UnsupportedOperationException("chflags requires FFI bridge")

public actual fun chflagsat(fd: Int, path: String?, flags: ULong, atflag: Int): Int =
    throw UnsupportedOperationException("chflagsat requires manual FFI bridge — not yet implemented")

public actual fun clockNanosleep(clkId: Int, flags: Int, rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("clockNanosleep requires FFI bridge")

public actual fun clockGetres(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGetres requires FFI bridge")

public actual fun clockGettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime requires FFI bridge")

public actual fun clockSettime(clkId: Int, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockSettime requires FFI bridge")

public actual fun clockGetcpuclockid(pid: Int, clkId: Int?): Int =
    throw UnsupportedOperationException("clockGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetcpuclockid(thread: ULong, clkId: Int?): Int =
    throw UnsupportedOperationException("pthreadGetcpuclockid requires manual FFI bridge — not yet implemented")

public actual fun dirfd(dirp: DIR?): Int =
    libc.cinterop.libc_dirfd(dirp?.handle?.toCPointer<kotlinx.cinterop.ByteVar>())

public actual fun duplocale(base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("duplocale requires manual FFI bridge — not yet implemented")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent requires manual FFI bridge — not yet implemented")

public actual fun fchflags(fd: Int, flags: ULong): Int =
    throw UnsupportedOperationException("fchflags requires FFI bridge")

public actual fun fexecve(fd: Int, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fexecve requires manual FFI bridge — not yet implemented")

public actual fun futimens(fd: Int, times: Timespec?): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_futimens(fd, timesPtr)
    return result
}

public actual fun getdomainname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("getdomainname requires FFI bridge")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrentR requires manual FFI bridge — not yet implemented")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwentR requires manual FFI bridge — not yet implemented")

public actual fun getgrouplist(name: String?, basegid: UInt, groups: UInt?, ngroups: Int?): Int =
    throw UnsupportedOperationException("getgrouplist requires manual FFI bridge — not yet implemented")

public actual fun getnameinfo(sa: Sockaddr?, salen: UInt, host: String?, hostlen: ULong, serv: String?, servlen: ULong, flags: Int): Int {
    val hLen = hostlen.toUInt()
    val sLen = servlen.toUInt()
    val hBuf = if (hLen > 0u) ByteArray(hLen.toInt().coerceAtMost(4096)) else null
    val sBuf = if (sLen > 0u) ByteArray(sLen.toInt().coerceAtMost(256)) else null
    return getnameinfo(sa, salen, hBuf, hLen, sBuf, sLen, flags)
}

public actual fun getpriority(which: Int, who: Int): Int {
    val result = libc_getpriority(which, who)
    return result
}

public actual fun getresgid(rgid: UInt?, egid: UInt?, sgid: UInt?): Int =
    throw UnsupportedOperationException("getresgid requires manual FFI bridge — not yet implemented")

public actual fun getresuid(ruid: UInt?, euid: UInt?, suid: UInt?): Int =
    throw UnsupportedOperationException("getresuid requires manual FFI bridge — not yet implemented")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires manual FFI bridge — not yet implemented")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires manual FFI bridge — not yet implemented")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires manual FFI bridge — not yet implemented")

public actual fun initgroups(name: String?, basegid: UInt): Int {
    val result = libc_initgroups(name, basegid.toInt())
    return result
}

public actual fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("kevent requires manual FFI bridge — not yet implemented")

public actual fun lchflags(path: String?, flags: ULong): Int =
    libc.cinterop.libc_lchflags(path, flags)

public actual fun lutimes(file: String?, times: Timeval?): Int =
    throw UnsupportedOperationException("lutimes requires manual FFI bridge — not yet implemented")

public actual fun memrchr(cx: COpaquePointer?, c: Int, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("memrchr requires manual FFI bridge — not yet implemented")

public actual fun mkfifoat(dirfd: Int, pathname: String?, mode: UShort): Int {
    if (pathname == null) return -1
    throw UnsupportedOperationException("mkfifoat requires per-platform actual — ModeT width differs across native targets")
}

public actual fun mknodat(dirfd: Int, pathname: String?, mode: UShort, dev: ULong): Int =
    throw UnsupportedOperationException("mknodat requires manual FFI bridge — not yet implemented")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires manual FFI bridge — not yet implemented")

public actual fun mincore(addr: COpaquePointer?, len: ULong, vec: String?): Int =
    throw UnsupportedOperationException("mincore requires FFI bridge")

public actual fun newlocale(mask: Int, locale: String?, base: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("newlocale requires manual FFI bridge — not yet implemented")

public actual fun nlLanginfoL(item: Int, locale: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("nlLanginfoL requires manual FFI bridge — not yet implemented")

public actual fun pipe2(fds: Int?, flags: Int): Int =
    throw UnsupportedOperationException("pipe2 requires manual FFI bridge — not yet implemented")

public actual fun posixFallocate(fd: Int, offset: Long, len: Long): Int =
    throw UnsupportedOperationException("posixFallocate requires FFI bridge")

public actual fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int =
    throw UnsupportedOperationException("posixFadvise requires manual FFI bridge — not yet implemented")

public actual fun ppoll(fds: Pollfd?, nfds: UInt, timeout: Timespec?, sigmask: SigsetT?): Int =
    throw UnsupportedOperationException("ppoll requires manual FFI bridge — not yet implemented")

public actual fun preadv(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("preadv requires FFI bridge")

public actual fun pthreadAttrGetNp(tid: ULong, attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadAttrGetNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetguardsize(attr: io.github.kotlinmania.libc.COpaquePointer?, guardsize: ULong): Int =
    throw UnsupportedOperationException("pthreadAttrSetguardsize requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetstack(attr: io.github.kotlinmania.libc.COpaquePointer?, stackaddr: COpaquePointer?, stacksize: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetstack requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadCondattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetclock requires manual FFI bridge — not yet implemented")

public actual fun pthreadCondattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadCondattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadMainNp(): Int =
    throw UnsupportedOperationException("pthreadMainNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexTimedlock(lock: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadMutexTimedlock requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int?): Int =
    throw UnsupportedOperationException("pthreadMutexattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadMutexattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, pshared: Int): Int =
    throw UnsupportedOperationException("pthreadMutexattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrGetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, shared: Int?): Int =
    throw UnsupportedOperationException("pthreadBarrierattrGetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierattrSetpshared(attr: io.github.kotlinmania.libc.COpaquePointer?, shared: Int): Int =
    throw UnsupportedOperationException("pthreadBarrierattrSetpshared requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierInit(barrier: io.github.kotlinmania.libc.COpaquePointer?, attr: io.github.kotlinmania.libc.COpaquePointer?, count: UInt): Int =
    throw UnsupportedOperationException("pthreadBarrierInit requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierDestroy(barrier: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierDestroy requires manual FFI bridge — not yet implemented")

public actual fun pthreadBarrierWait(barrier: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadBarrierWait requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetNameNp(tid: ULong, name: String?, len: ULong): Unit = throw UnsupportedOperationException("pthreadGetNameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetNameNp(tid: ULong, name: String?): Unit = throw UnsupportedOperationException("pthreadSetNameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetnameNp(thread: ULong, buffer: String?, length: ULong): Int =
    throw UnsupportedOperationException("pthreadGetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetnameNp(thread: ULong, name: String?): Int =
    throw UnsupportedOperationException("pthreadSetnameNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadSetschedparam(native: ULong, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int =
    throw UnsupportedOperationException("pthreadGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: Int, pid: Int, addr: String?, data: Int): Int =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun utrace(addr: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("utrace requires manual FFI bridge — not yet implemented")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires manual FFI bridge — not yet implemented")

public actual fun pwritev(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long): Long =
    throw UnsupportedOperationException("pwritev requires FFI bridge")

public actual fun querylocale(mask: Int, loc: io.github.kotlinmania.libc.COpaquePointer?): String? =
    throw UnsupportedOperationException("querylocale requires manual FFI bridge — not yet implemented")

public actual fun rtprio(function: Int, pid: Int, rtp: Rtprio?): Int =
    throw UnsupportedOperationException("rtprio requires manual FFI bridge — not yet implemented")

public actual fun schedRrGetInterval(pid: Int, t: Timespec?): Int =
    throw UnsupportedOperationException("schedRrGetInterval requires manual FFI bridge — not yet implemented")

public actual fun schedGetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedGetparam requires manual FFI bridge — not yet implemented")

public actual fun schedSetparam(pid: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetparam requires manual FFI bridge — not yet implemented")

public actual fun schedGetscheduler(pid: Int): Int {
    val result = libc_sched_getscheduler(pid)
    return result
}

public actual fun schedSetscheduler(pid: Int, policy: Int, param: SchedParam?): Int =
    throw UnsupportedOperationException("schedSetscheduler requires manual FFI bridge — not yet implemented")

public actual fun semGetvalue(sem: io.github.kotlinmania.libc.COpaquePointer?, sval: Int?): Int =
    throw UnsupportedOperationException("semGetvalue requires manual FFI bridge — not yet implemented")

public actual fun semTimedwait(sem: io.github.kotlinmania.libc.COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("semTimedwait requires manual FFI bridge — not yet implemented")

public actual fun sendfile(fd: Int, s: Int, offset: Long, nbytes: ULong, hdtr: SfHdtr?, sbytes: Long?, flags: Int): Int =
    throw UnsupportedOperationException("sendfile requires manual FFI bridge — not yet implemented")

public actual fun setdomainname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("setdomainname requires FFI bridge")

public actual fun sethostname(name: String?, len: Int): Int =
    throw UnsupportedOperationException("sethostname requires FFI bridge")

public actual fun setpriority(which: Int, who: Int, prio: Int): Int {
    val result = libc_setpriority(which, who, prio)
    return result
}

public actual fun setresgid(rgid: UInt, egid: UInt, sgid: UInt): Int =
    throw UnsupportedOperationException("setresgid requires manual FFI bridge — not yet implemented")

public actual fun setresuid(ruid: UInt, euid: UInt, suid: UInt): Int =
    throw UnsupportedOperationException("setresuid requires manual FFI bridge — not yet implemented")

public actual fun settimeofday(tv: Timeval?, tz: Timezone?): Int {
    if (tv == null) return -1
    val tvPtr: CPointer<ByteVar>? = tv.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.handle.toCPointer()
    val result = libc_settimeofday(tvPtr, tzPtr)
    return result
}

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent requires manual FFI bridge — not yet implemented")

public actual fun shmOpen(name: String?, oflag: Int, mode: UShort): Int {
    val result = libc_shm_open(name, oflag, mode.toInt())
    return result
}

public actual fun sigtimedwait(set: SigsetT?, info: SiginfoT?, timeout: Timespec?): Int =
    throw UnsupportedOperationException("sigtimedwait requires manual FFI bridge — not yet implemented")

public actual fun sigwaitinfo(set: SigsetT?, info: SiginfoT?): Int =
    throw UnsupportedOperationException("sigwaitinfo requires manual FFI bridge — not yet implemented")

public actual fun sysctl(name: Int?, namelen: UInt, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctl requires manual FFI bridge — not yet implemented")

public actual fun sysctlbyname(name: String?, oldp: COpaquePointer?, oldlenp: ULong?, newp: COpaquePointer?, newlen: ULong): Int =
    throw UnsupportedOperationException("sysctlbyname requires manual FFI bridge — not yet implemented")

public actual fun sysctlnametomib(name: String?, mibp: Int?, sizep: ULong?): Int =
    throw UnsupportedOperationException("sysctlnametomib requires manual FFI bridge — not yet implemented")

public actual fun uselocale(loc: io.github.kotlinmania.libc.COpaquePointer?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("uselocale requires manual FFI bridge — not yet implemented")

public actual fun utimensat(dirfd: Int, path: String?, times: Timespec?, flag: Int): Int {
    if (times == null) return -1
    val timesPtr: CPointer<ByteVar>? = times.handle.toCPointer()
    val result = libc_utimensat(dirfd, path, timesPtr, flag)
    return result
}

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime requires manual FFI bridge — not yet implemented")

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime requires manual FFI bridge — not yet implemented")

public actual fun iconv(cd: io.github.kotlinmania.libc.COpaquePointer?, inbuf: COpaquePointer?, inbytesleft: ULong?, outbuf: COpaquePointer?, outbytesleft: ULong?): ULong =
    throw UnsupportedOperationException("iconv requires manual FFI bridge — not yet implemented")

public actual fun iconvClose(cd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("iconvClose requires manual FFI bridge — not yet implemented")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero requires manual FFI bridge — not yet implemented")

public actual fun memsetS(s: COpaquePointer?, smax: ULong, c: Int, n: ULong): Int =
    throw UnsupportedOperationException("memsetS requires manual FFI bridge — not yet implemented")

public actual fun gethostid(): Long =
    throw UnsupportedOperationException("gethostid requires FFI bridge")

public actual fun sethostid(hostid: Long): Unit = throw UnsupportedOperationException("sethostid requires manual FFI bridge — not yet implemented")

public actual fun eui64Aton(a: String?, e: Eui64?): Int =
    throw UnsupportedOperationException("eui64Aton requires manual FFI bridge — not yet implemented")

public actual fun eui64Ntoa(id: Eui64?, a: String?, len: ULong): Int =
    throw UnsupportedOperationException("eui64Ntoa requires manual FFI bridge — not yet implemented")

public actual fun eui64Ntohost(hostname: String?, len: ULong, id: Eui64?): Int =
    throw UnsupportedOperationException("eui64Ntohost requires manual FFI bridge — not yet implemented")

public actual fun eui64Hostton(hostname: String?, id: Eui64?): Int =
    throw UnsupportedOperationException("eui64Hostton requires manual FFI bridge — not yet implemented")

public actual fun eaccess(path: String?, mode: Int): Int =
    throw UnsupportedOperationException("eaccess requires manual FFI bridge — not yet implemented")

public actual fun kenv(action: Int, name: String?, value: String?, len: Int): Int =
    throw UnsupportedOperationException("kenv requires manual FFI bridge — not yet implemented")

public actual fun reboot(howto: Int): Int =
    libc.cinterop.libc_reboot(howto)

public actual fun exect(path: String?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("exect requires manual FFI bridge — not yet implemented")

public actual fun execvP(file: String?, searchPath: String?, argv: COpaquePointer?): Int {
    if (file == null) return -1
    if (searchPath == null) return -1
    return libc.cinterop.libc_execvP(file, searchPath, argv?.value?.toCPointer<kotlinx.cinterop.ByteVar>())
}

public actual fun mkostemp(template: String?, flags: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkostemp(template, flags)
}

public actual fun mkostemps(template: String?, suffixlen: Int, flags: Int): Int {
    if (template == null) return -1
    return libc.cinterop.libc_mkostemps(template, suffixlen, flags)
}

public actual fun posixSpawn(pid: Int?, path: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawn requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnp(pid: Int?, file: String?, fileActions: io.github.kotlinmania.libc.COpaquePointer?, attrp: io.github.kotlinmania.libc.COpaquePointer?, argv: COpaquePointer?, envp: COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrInit(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrDestroy(attr: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnattrDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigdefault(attr: io.github.kotlinmania.libc.COpaquePointer?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigdefault requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetsigmask(attr: io.github.kotlinmania.libc.COpaquePointer?, default: SigsetT?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetsigmask requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetflags(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Short): Int =
    throw UnsupportedOperationException("posixSpawnattrSetflags requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetpgroup(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetpgroup requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedpolicy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrGetschedparam requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnattrSetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int =
    throw UnsupportedOperationException("posixSpawnattrSetschedparam requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsInit(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsInit requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsDestroy(actions: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsDestroy requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddopen(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, path: String?, oflag: Int, mode: UShort): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddopen requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclose(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclose requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAdddup2(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, newfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAdddup2 requires manual FFI bridge — not yet implemented")

public actual fun mqClose(mqd: Int): Int =
    throw UnsupportedOperationException("mqClose requires manual FFI bridge — not yet implemented")

public actual fun mqGetattr(mqd: Int, attr: MqAttr?): Int =
    throw UnsupportedOperationException("mqGetattr requires manual FFI bridge — not yet implemented")

public actual fun mqNotify(mqd: Int, notification: Sigevent?): Int =
    throw UnsupportedOperationException("mqNotify requires manual FFI bridge — not yet implemented")

public actual fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int =
    throw UnsupportedOperationException("mqOpen requires manual FFI bridge — not yet implemented")

public actual fun mqReceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long =
    throw UnsupportedOperationException("mqReceive requires manual FFI bridge — not yet implemented")

public actual fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int =
    throw UnsupportedOperationException("mqSend requires manual FFI bridge — not yet implemented")

public actual fun mqSetattr(mqd: Int, newattr: MqAttr?, oldattr: MqAttr?): Int =
    throw UnsupportedOperationException("mqSetattr requires manual FFI bridge — not yet implemented")

public actual fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long =
    throw UnsupportedOperationException("mqTimedreceive requires manual FFI bridge — not yet implemented")

public actual fun mqTimedsend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int =
    throw UnsupportedOperationException("mqTimedsend requires manual FFI bridge — not yet implemented")

public actual fun mqUnlink(name: String?): Int =
    throw UnsupportedOperationException("mqUnlink requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires manual FFI bridge — not yet implemented")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires manual FFI bridge — not yet implemented")

public actual fun openpty(amaster: Int?, aslave: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("openpty requires manual FFI bridge — not yet implemented")

public actual fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int =
    throw UnsupportedOperationException("forkpty requires manual FFI bridge — not yet implemented")

public actual fun loginTty(fd: Int): Int =
    throw UnsupportedOperationException("loginTty requires manual FFI bridge — not yet implemented")

public actual fun fparseln(stream: FILE?, len: ULong?, lineno: ULong?, delim: String?, flags: Int): String? =
    throw UnsupportedOperationException("fparseln requires manual FFI bridge — not yet implemented")

public actual fun backtrace(addrlist: COpaquePointer?, len: ULong): ULong =
    throw UnsupportedOperationException("backtrace requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbols(addrlist: COpaquePointer?, len: ULong): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFd(addrlist: COpaquePointer?, len: ULong, fd: Int): Int =
    throw UnsupportedOperationException("backtraceSymbolsFd requires manual FFI bridge — not yet implemented")

public actual fun kvmOpen(execfile: String?, corefile: String?, swapfile: String?, flags: Int, errstr: String?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("kvmOpen requires manual FFI bridge — not yet implemented")

public actual fun kvmClose(kd: io.github.kotlinmania.libc.COpaquePointer?): Int =
    throw UnsupportedOperationException("kvmClose requires manual FFI bridge — not yet implemented")

public actual fun kvmGetprocs(kd: io.github.kotlinmania.libc.COpaquePointer?, op: Int, arg: Int, cnt: Int?): KinfoProc? =
    throw UnsupportedOperationException("kvmGetprocs requires manual FFI bridge — not yet implemented")

public actual fun kvmGetloadavg(kd: io.github.kotlinmania.libc.COpaquePointer?, loadavg: Double?, nelem: Int): Int =
    throw UnsupportedOperationException("kvmGetloadavg requires manual FFI bridge — not yet implemented")

public actual fun kvmOpenfiles(execfile: String?, corefile: String?, swapfile: String?, flags: Int, errbuf: String?): io.github.kotlinmania.libc.COpaquePointer? =
    throw UnsupportedOperationException("kvmOpenfiles requires manual FFI bridge — not yet implemented")

public actual fun kvmRead(kd: io.github.kotlinmania.libc.COpaquePointer?, addr: ULong, buf: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("kvmRead requires manual FFI bridge — not yet implemented")

public actual fun kvmWrite(kd: io.github.kotlinmania.libc.COpaquePointer?, addr: ULong, buf: COpaquePointer?, nbytes: ULong): Long =
    throw UnsupportedOperationException("kvmWrite requires manual FFI bridge — not yet implemented")

public actual fun dlIteratePhdr(callback: ((DlPhdrInfo?, ULong, COpaquePointer?) -> Int)?, data: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlIteratePhdr requires manual FFI bridge — not yet implemented")
