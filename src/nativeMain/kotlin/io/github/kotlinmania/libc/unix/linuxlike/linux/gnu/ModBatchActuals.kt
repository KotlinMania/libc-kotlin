// port-lint: source Mod.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.ExperimentalForeignApi

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetspentR requires manual FFI bridge — not yet implemented")

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sgetspentR requires manual FFI bridge — not yet implemented")

public actual fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspentR requires manual FFI bridge — not yet implemented")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("sendmmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg requires manual FFI bridge — not yet implemented")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("getrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("setrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit requires manual FFI bridge — not yet implemented")

public actual fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit requires manual FFI bridge — not yet implemented")

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    throw UnsupportedOperationException("prlimit requires manual FFI bridge — not yet implemented")

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    throw UnsupportedOperationException("prlimit64 requires manual FFI bridge — not yet implemented")

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname requires manual FFI bridge — not yet implemented")

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires manual FFI bridge — not yet implemented")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires manual FFI bridge — not yet implemented")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires manual FFI bridge — not yet implemented")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires manual FFI bridge — not yet implemented")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires manual FFI bridge — not yet implemented")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires manual FFI bridge — not yet implemented")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires manual FFI bridge — not yet implemented")
}

public actual fun getpt(): CInt =
    throw UnsupportedOperationException("getpt requires manual FFI bridge — not yet implemented")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("mallopt requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday requires manual FFI bridge — not yet implemented")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom requires manual FFI bridge — not yet implemented")

public actual fun getauxval(type: CULong): CULong =
    throw UnsupportedOperationException("getauxval requires manual FFI bridge — not yet implemented")

public actual fun adjtimex(buf: Timex?): CInt =
    throw UnsupportedOperationException("adjtimex requires manual FFI bridge — not yet implemented")

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime requires manual FFI bridge — not yet implemented")

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime requires manual FFI bridge — not yet implemented")

public actual fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt =
    throw UnsupportedOperationException("clockAdjtime requires manual FFI bridge — not yet implemented")

public actual fun fanotifyMark(fd: CInt, flags: CUInt, mask: ULong, dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fanotifyMark requires manual FFI bridge — not yet implemented")

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("preadv2 requires manual FFI bridge — not yet implemented")

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("pwritev2 requires manual FFI bridge — not yet implemented")

public actual fun preadv64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    throw UnsupportedOperationException("preadv64v2 requires manual FFI bridge — not yet implemented")

public actual fun pwritev64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    throw UnsupportedOperationException("pwritev64v2 requires manual FFI bridge — not yet implemented")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renameat2 requires manual FFI bridge — not yet implemented")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero requires manual FFI bridge — not yet implemented")
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires manual FFI bridge — not yet implemented")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires manual FFI bridge — not yet implemented")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    throw UnsupportedOperationException("backtrace requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    throw UnsupportedOperationException("backtraceSymbolsFd requires manual FFI bridge — not yet implemented")
}

public actual fun globfree64(pglob: Glob64T?) {
    throw UnsupportedOperationException("globfree64 requires manual FFI bridge — not yet implemented")
}

public actual fun ptrace(request: CUInt, vararg args: Any?): CLong =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority requires manual FFI bridge — not yet implemented")

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp requires manual FFI bridge — not yet implemented")


public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadTryjoinNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires manual FFI bridge — not yet implemented")

public actual fun mallocStats() {
    throw UnsupportedOperationException("mallocStats requires manual FFI bridge — not yet implemented")
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("mallocInfo requires manual FFI bridge — not yet implemented")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires manual FFI bridge — not yet implemented")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwentR requires manual FFI bridge — not yet implemented")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrentR requires manual FFI bridge — not yet implemented")

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetpwentR requires manual FFI bridge — not yet implemented")

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetgrentR requires manual FFI bridge — not yet implemented")

public actual fun putpwent(p: Passwd?, stream: FILE?): CInt =
    throw UnsupportedOperationException("putpwent requires manual FFI bridge — not yet implemented")

public actual fun putgrent(grp: Group?, stream: FILE?): CInt =
    throw UnsupportedOperationException("putgrent requires manual FFI bridge — not yet implemented")

public actual fun sethostid(hostid: CLong): CInt =
    throw UnsupportedOperationException("sethostid requires manual FFI bridge — not yet implemented")

public actual fun memfdCreate(name: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("memfdCreate requires manual FFI bridge — not yet implemented")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: CUInt): CInt =
    throw UnsupportedOperationException("mlock2 requires manual FFI bridge — not yet implemented")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess requires manual FFI bridge — not yet implemented")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("eaccess requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun ctimeR(timep: TimeT?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires manual FFI bridge — not yet implemented")

public actual fun posixBasename(path: String?): String? =
    throw UnsupportedOperationException("posixBasename requires manual FFI bridge — not yet implemented")

public actual fun gnuBasename(path: String?): String? =
    throw UnsupportedOperationException("gnuBasename requires manual FFI bridge — not yet implemented")

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlmopen requires manual FFI bridge — not yet implemented")

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlinfo requires manual FFI bridge — not yet implemented")

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("dladdr1 requires manual FFI bridge — not yet implemented")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires manual FFI bridge — not yet implemented")

public actual fun mallocTrim(pad: ULong): CInt =
    throw UnsupportedOperationException("mallocTrim requires manual FFI bridge — not yet implemented")

public actual fun gnuGetLibcRelease(): String? =
    throw UnsupportedOperationException("gnuGetLibcRelease requires manual FFI bridge — not yet implemented")

public actual fun gnuGetLibcVersion(): String? =
    throw UnsupportedOperationException("gnuGetLibcVersion requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT, from: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT, tcfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddtcsetpgrpNp requires manual FFI bridge — not yet implemented")

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: CInt): Mntent? =
    throw UnsupportedOperationException("getmntentR requires manual FFI bridge — not yet implemented")

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("execveat requires manual FFI bridge — not yet implemented")

public actual fun closeRange(first: CUInt, last: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("closeRange requires manual FFI bridge — not yet implemented")

public actual fun mqNotify(mqdes: MqdT, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify requires manual FFI bridge — not yet implemented")

public actual fun epollPwait2(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("epollPwait2 requires manual FFI bridge — not yet implemented")

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mempcpy requires manual FFI bridge — not yet implemented")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("tgkill requires manual FFI bridge — not yet implemented")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?) {
    throw UnsupportedOperationException("qsortR requires manual FFI bridge — not yet implemented")
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: Glob64T?): CInt =
    throw UnsupportedOperationException("glob64 requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("pthreadSigqueue requires manual FFI bridge for ambiguous type")
