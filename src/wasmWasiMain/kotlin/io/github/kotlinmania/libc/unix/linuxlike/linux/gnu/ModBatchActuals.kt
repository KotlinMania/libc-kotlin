// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetspentR not available on WASI — no C library access")

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("sgetspentR not available on WASI — no C library access")

public actual fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getspentR not available on WASI — no C library access")

public actual fun sendmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("sendmmsg not available on WASI — no C library access")

public actual fun recvmmsg(sockfd: CInt, msgvec: Mmsghdr?, vlen: CUInt, flags: CInt, timeout: Timespec?): CInt =
    throw UnsupportedOperationException("recvmmsg not available on WASI — no C library access")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("getrlimit64 not available on WASI — no C library access")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: Rlimit64?): CInt =
    throw UnsupportedOperationException("setrlimit64 not available on WASI — no C library access")

public actual fun getrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("getrlimit not available on WASI — no C library access")

public actual fun setrlimit(resource: RlimitResourceT, rlim: Rlimit?): CInt =
    throw UnsupportedOperationException("setrlimit not available on WASI — no C library access")

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: Rlimit?, oldLimit: Rlimit?): CInt =
    throw UnsupportedOperationException("prlimit not available on WASI — no C library access")

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: Rlimit64?, oldLimit: Rlimit64?): CInt =
    throw UnsupportedOperationException("prlimit64 not available on WASI — no C library access")

public actual fun utmpname(file: String?): CInt =
    throw UnsupportedOperationException("utmpname not available on WASI — no C library access")

public actual fun utmpxname(file: String?): CInt =
    throw UnsupportedOperationException("utmpxname not available on WASI — no C library access")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on WASI — no C library access")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on WASI — no C library access")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on WASI — no C library access")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on WASI — no C library access")

public actual fun setutxent() {
    throw UnsupportedOperationException("setutxent not available on WASI — no C library access")
}

public actual fun endutxent() {
    throw UnsupportedOperationException("endutxent not available on WASI — no C library access")
}

public actual fun getpt(): CInt =
    throw UnsupportedOperationException("getpt not available on WASI — no C library access")

public actual fun mallopt(param: CInt, value: CInt): CInt =
    throw UnsupportedOperationException("mallopt not available on WASI — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): CInt =
    throw UnsupportedOperationException("gettimeofday not available on WASI — no C library access")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): CInt =
    throw UnsupportedOperationException("getentropy not available on WASI — no C library access")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: CUInt): SsizeT =
    throw UnsupportedOperationException("getrandom not available on WASI — no C library access")

public actual fun getauxval(type: CULong): CULong =
    throw UnsupportedOperationException("getauxval not available on WASI — no C library access")

public actual fun adjtimex(buf: Timex?): CInt =
    throw UnsupportedOperationException("adjtimex not available on WASI — no C library access")

public actual fun ntpAdjtime(buf: Timex?): CInt =
    throw UnsupportedOperationException("ntpAdjtime not available on WASI — no C library access")

public actual fun ntpGettime(buf: Ntptimeval?): CInt =
    throw UnsupportedOperationException("ntpGettime not available on WASI — no C library access")

public actual fun clockAdjtime(clkId: ClockidT, buf: Timex?): CInt =
    throw UnsupportedOperationException("clockAdjtime not available on WASI — no C library access")

public actual fun fanotifyMark(fd: CInt, flags: CUInt, mask: ULong, dirfd: CInt, path: String?): CInt =
    throw UnsupportedOperationException("fanotifyMark not available on WASI — no C library access")

public actual fun preadv2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("preadv2 not available on WASI — no C library access")

public actual fun pwritev2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("pwritev2 not available on WASI — no C library access")

public actual fun preadv64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    throw UnsupportedOperationException("preadv64v2 not available on WASI — no C library access")

public actual fun pwritev64v2(fd: CInt, iov: Iovec?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    throw UnsupportedOperationException("pwritev64v2 not available on WASI — no C library access")

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("renameat2 not available on WASI — no C library access")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong) {
    throw UnsupportedOperationException("explicitBzero not available on WASI — no C library access")
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray not available on WASI — no C library access")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid not available on WASI — no C library access")

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    throw UnsupportedOperationException("backtrace not available on WASI — no C library access")

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on WASI — no C library access")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
    throw UnsupportedOperationException("backtraceSymbolsFd not available on WASI — no C library access")
}

public actual fun globfree64(pglob: Glob64T?) {
    throw UnsupportedOperationException("globfree64 not available on WASI — no C library access")
}

public actual fun ptrace(request: CUInt, vararg args: Any?): CLong =
    throw UnsupportedOperationException("ptrace not available on WASI — no C library access")

public actual fun pthreadAttrGetaffinityNp(attr: PthreadAttrT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp not available on WASI — no C library access")

public actual fun pthreadAttrSetaffinityNp(attr: PthreadAttrT, cpusetsize: ULong, cpuset: CpuSetT?): CInt =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp not available on WASI — no C library access")

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    throw UnsupportedOperationException("getpriority not available on WASI — no C library access")

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    throw UnsupportedOperationException("setpriority not available on WASI — no C library access")

public actual fun pthreadRwlockattrGetkindNp(attr: PthreadRwlockattrT, `val`: CInt?): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp not available on WASI — no C library access")

public actual fun pthreadRwlockattrSetkindNp(attr: PthreadRwlockattrT, `val`: CInt): CInt =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp not available on WASI — no C library access")


public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    throw UnsupportedOperationException("pthreadTryjoinNp not available on WASI — no C library access")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: Timespec?): CInt =
    throw UnsupportedOperationException("pthreadTimedjoinNp not available on WASI — no C library access")

public actual fun mallocStats() {
    throw UnsupportedOperationException("mallocStats not available on WASI — no C library access")
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    throw UnsupportedOperationException("mallocInfo not available on WASI — no C library access")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize not available on WASI — no C library access")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getpwentR not available on WASI — no C library access")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("getgrentR not available on WASI — no C library access")

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetpwentR not available on WASI — no C library access")

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): CInt =
    throw UnsupportedOperationException("fgetgrentR not available on WASI — no C library access")

public actual fun putpwent(p: Passwd?, stream: FILE?): CInt =
    throw UnsupportedOperationException("putpwent not available on WASI — no C library access")

public actual fun putgrent(grp: Group?, stream: FILE?): CInt =
    throw UnsupportedOperationException("putgrent not available on WASI — no C library access")

public actual fun sethostid(hostid: CLong): CInt =
    throw UnsupportedOperationException("sethostid not available on WASI — no C library access")

public actual fun memfdCreate(name: String?, flags: CUInt): CInt =
    throw UnsupportedOperationException("memfdCreate not available on WASI — no C library access")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: CUInt): CInt =
    throw UnsupportedOperationException("mlock2 not available on WASI — no C library access")

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("euidaccess not available on WASI — no C library access")

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    throw UnsupportedOperationException("eaccess not available on WASI — no C library access")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on WASI — no C library access")

public actual fun ctimeR(timep: TimeT?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on WASI — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on WASI — no C library access")

public actual fun posixBasename(path: String?): String? =
    throw UnsupportedOperationException("posixBasename not available on WASI — no C library access")

public actual fun gnuBasename(path: String?): String? =
    throw UnsupportedOperationException("gnuBasename not available on WASI — no C library access")

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    throw UnsupportedOperationException("dlmopen not available on WASI — no C library access")

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    throw UnsupportedOperationException("dlinfo not available on WASI — no C library access")

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("dladdr1 not available on WASI — no C library access")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym not available on WASI — no C library access")

public actual fun mallocTrim(pad: ULong): CInt =
    throw UnsupportedOperationException("mallocTrim not available on WASI — no C library access")

public actual fun gnuGetLibcRelease(): String? =
    throw UnsupportedOperationException("gnuGetLibcRelease not available on WASI — no C library access")

public actual fun gnuGetLibcVersion(): String? =
    throw UnsupportedOperationException("gnuGetLibcVersion not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddchdirNp(actions: PosixSpawnFileActionsT, path: String?): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: PosixSpawnFileActionsT, fd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: PosixSpawnFileActionsT, from: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: PosixSpawnFileActionsT, tcfd: CInt): CInt =
    throw UnsupportedOperationException("posixSpawnFileActionsAddtcsetpgrpNp not available on WASI — no C library access")

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: CInt): Mntent? =
    throw UnsupportedOperationException("getmntentR not available on WASI — no C library access")

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    throw UnsupportedOperationException("execveat not available on WASI — no C library access")

public actual fun closeRange(first: CUInt, last: CUInt, flags: CInt): CInt =
    throw UnsupportedOperationException("closeRange not available on WASI — no C library access")

public actual fun mqNotify(mqdes: MqdT, sevp: Sigevent?): CInt =
    throw UnsupportedOperationException("mqNotify not available on WASI — no C library access")

public actual fun epollPwait2(epfd: CInt, events: EpollEvent?, maxevents: CInt, timeout: Timespec?, sigmask: SigsetT?): CInt =
    throw UnsupportedOperationException("epollPwait2 not available on WASI — no C library access")

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mempcpy not available on WASI — no C library access")

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    throw UnsupportedOperationException("tgkill not available on WASI — no C library access")


public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CInt)?, arg: COpaquePointer?) {
    throw UnsupportedOperationException("qsortR not available on WASI — no C library access")
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: ((String?, CInt) -> CInt)?, pglob: Glob64T?): CInt =
    throw UnsupportedOperationException("glob64 not available on WASI — no C library access")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("pthreadSigqueue not available on WASI — no C library access")
