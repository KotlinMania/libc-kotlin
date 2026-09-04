// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetspentR requires N-API addon")

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sgetspentR requires N-API addon")

public actual fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspentR requires N-API addon")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("sendmmsg requires N-API addon")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg requires N-API addon")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("getrlimit64 requires N-API addon")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("setrlimit64 requires N-API addon")

public actual fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    throw UnsupportedOperationException("prlimit requires N-API addon")

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    throw UnsupportedOperationException("prlimit64 requires N-API addon")

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname requires N-API addon")

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent requires N-API addon")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent requires N-API addon")
}

public actual fun getpt(): CInt =
    throw UnsupportedOperationException("getpt requires N-API addon")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("mallopt requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun getauxval(type: CULong): CULong =
    throw UnsupportedOperationException("getauxval requires N-API addon")

public actual fun adjtimex(buf: Timex?): CInt =
    throw UnsupportedOperationException("adjtimex requires N-API addon")

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime requires N-API addon")

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime requires N-API addon")

public actual fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt =
    throw UnsupportedOperationException("clockAdjtime requires N-API addon")

public actual fun fanotifyMark(fd: CInt, flags: CUInt, mask: ULong, dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fanotifyMark requires N-API addon")

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("preadv2 requires N-API addon")

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("pwritev2 requires N-API addon")

public actual fun preadv64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    throw UnsupportedOperationException("preadv64v2 requires N-API addon")

public actual fun pwritev64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    throw UnsupportedOperationException("pwritev64v2 requires N-API addon")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renameat2 requires N-API addon")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero requires N-API addon")
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires N-API addon")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires N-API addon")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    throw UnsupportedOperationException("backtrace requires N-API addon")

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires N-API addon")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    throw UnsupportedOperationException("backtraceSymbolsFd requires N-API addon")
}

public actual fun globfree64(pglob: Glob64T?) {
    throw UnsupportedOperationException("globfree64 requires N-API addon")
}

public actual fun ptrace(request: CUInt, vararg args: Any?): CLong =
    throw UnsupportedOperationException("ptrace requires N-API addon")

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp requires N-API addon")

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp requires N-API addon")

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp requires N-API addon")

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp requires N-API addon")


public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadTryjoinNp requires N-API addon")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires N-API addon")

public actual fun mallocStats() {
    throw UnsupportedOperationException("mallocStats requires N-API addon")
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("mallocInfo requires N-API addon")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires N-API addon")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwentR requires N-API addon")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrentR requires N-API addon")

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetpwentR requires N-API addon")

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetgrentR requires N-API addon")

public actual fun putpwent(p: Passwd?, stream: FILE?): CInt =
    throw UnsupportedOperationException("putpwent requires N-API addon")

public actual fun putgrent(grp: Group?, stream: FILE?): CInt =
    throw UnsupportedOperationException("putgrent requires N-API addon")

public actual fun sethostid(hostid: CLong): CInt =
    throw UnsupportedOperationException("sethostid requires N-API addon")

public actual fun memfdCreate(name: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("memfdCreate requires N-API addon")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: CUInt): CInt =
    throw UnsupportedOperationException("mlock2 requires N-API addon")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess requires N-API addon")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("eaccess requires N-API addon")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctimeR(timep: TimeT?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun posixBasename(path: String?): String? =
    throw UnsupportedOperationException("posixBasename requires N-API addon")

public actual fun gnuBasename(path: String?): String? =
    throw UnsupportedOperationException("gnuBasename requires N-API addon")

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlmopen requires N-API addon")

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlinfo requires N-API addon")

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("dladdr1 requires N-API addon")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires N-API addon")

public actual fun mallocTrim(pad: ULong): CInt =
    throw UnsupportedOperationException("mallocTrim requires N-API addon")

public actual fun gnuGetLibcRelease(): String? =
    throw UnsupportedOperationException("gnuGetLibcRelease requires N-API addon")

public actual fun gnuGetLibcVersion(): String? =
    throw UnsupportedOperationException("gnuGetLibcVersion requires N-API addon")

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT, from: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp requires N-API addon")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT, tcfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddtcsetpgrpNp requires N-API addon")

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: CInt): Mntent? =
    throw UnsupportedOperationException("getmntentR requires N-API addon")

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("execveat requires N-API addon")

public actual fun closeRange(first: CUInt, last: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("closeRange requires N-API addon")

public actual fun mqNotify(mqdes: MqdT, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify requires N-API addon")

public actual fun epollPwait2(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("epollPwait2 requires N-API addon")

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mempcpy requires N-API addon")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("tgkill requires N-API addon")

