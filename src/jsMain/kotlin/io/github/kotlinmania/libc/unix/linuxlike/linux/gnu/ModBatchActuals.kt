// port-lint: source Mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetspentR requires N-API addon")

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("sgetspentR requires N-API addon")

public actual fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("getspentR requires N-API addon")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("sendmmsg requires N-API addon")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg requires N-API addon")

public actual fun getrlimit64(resource: UInt, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 requires N-API addon")

public actual fun setrlimit64(resource: UInt, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 requires N-API addon")

public actual fun getrlimit(resource: UInt, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit requires N-API addon")

public actual fun setrlimit(resource: UInt, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit requires N-API addon")

public actual fun prlimit(pid: Int, resource: UInt, newLimit: Rlimit?, oldLimit: Rlimit?): Int =
    throw UnsupportedOperationException("prlimit requires N-API addon")

public actual fun prlimit64(pid: Int, resource: UInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): Int =
    throw UnsupportedOperationException("prlimit64 requires N-API addon")

public actual fun utmpname(file: String?): Int =
    throw UnsupportedOperationException("utmpname requires N-API addon")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname requires N-API addon")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires N-API addon")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires N-API addon")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires N-API addon")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires N-API addon")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent requires N-API addon")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent requires N-API addon")

public actual fun getpt(): Int =
    throw UnsupportedOperationException("getpt requires N-API addon")

public actual fun mallopt(param: Int, value: Int): Int =
    throw UnsupportedOperationException("mallopt requires N-API addon")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("gettimeofday requires N-API addon")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires N-API addon")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires N-API addon")

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval requires N-API addon")

public actual fun adjtimex(buf: Timex?): Int =
    throw UnsupportedOperationException("adjtimex requires N-API addon")

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime requires N-API addon")

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime requires N-API addon")

public actual fun clockAdjtime(clkId: Int, buf: Timex?): Int =
    throw UnsupportedOperationException("clockAdjtime requires N-API addon")

public actual fun fanotifyMark(fd: Int, flags: UInt, mask: ULong, dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("fanotifyMark requires N-API addon")

public actual fun preadv2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("preadv2 requires N-API addon")

public actual fun pwritev2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("pwritev2 requires N-API addon")

public actual fun preadv64v2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("preadv64v2 requires N-API addon")

public actual fun pwritev64v2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("pwritev64v2 requires N-API addon")

public actual fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renameat2 requires N-API addon")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero requires N-API addon")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires N-API addon")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires N-API addon")

public actual fun backtrace(buf: COpaquePointer?, sz: Int): Int =
    throw UnsupportedOperationException("backtrace requires N-API addon")

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: Int): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires N-API addon")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: Int, fd: Int): Unit = throw UnsupportedOperationException("backtraceSymbolsFd requires N-API addon")

public actual fun globfree64(pglob: Glob64T?): Unit = throw UnsupportedOperationException("globfree64 requires N-API addon")

public actual fun ptrace(request: UInt, vararg args: Any?): Long =
    throw UnsupportedOperationException("ptrace requires N-API addon")

public actual fun pthreadAttrGetaffinityNp(attr: io.github.kotlinmania.libc.COpaquePointer?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp requires N-API addon")

public actual fun pthreadAttrSetaffinityNp(attr: io.github.kotlinmania.libc.COpaquePointer?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp requires N-API addon")

public actual fun getpriority(which: UInt, who: UInt): Int =
    throw UnsupportedOperationException("getpriority requires N-API addon")

public actual fun setpriority(which: UInt, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority requires N-API addon")

public actual fun pthreadRwlockattrGetkindNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp requires N-API addon")

public actual fun pthreadRwlockattrSetkindNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp requires N-API addon")

public actual fun pthreadTryjoinNp(thread: ULong, retval: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadTryjoinNp requires N-API addon")

public actual fun pthreadTimedjoinNp(thread: ULong, retval: COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires N-API addon")

public actual fun mallocStats(): Unit = throw UnsupportedOperationException("mallocStats requires N-API addon")

public actual fun mallocInfo(options: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("mallocInfo requires N-API addon")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires N-API addon")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwentR requires N-API addon")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrentR requires N-API addon")

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetpwentR requires N-API addon")

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetgrentR requires N-API addon")

public actual fun putpwent(p: Passwd?, stream: FILE?): Int =
    throw UnsupportedOperationException("putpwent requires N-API addon")

public actual fun putgrent(grp: Group?, stream: FILE?): Int =
    throw UnsupportedOperationException("putgrent requires N-API addon")

public actual fun sethostid(hostid: Long): Int =
    throw UnsupportedOperationException("sethostid requires N-API addon")

public actual fun memfdCreate(name: String?, flags: UInt): Int =
    throw UnsupportedOperationException("memfdCreate requires N-API addon")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("mlock2 requires N-API addon")

public actual fun euidaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("euidaccess requires N-API addon")

public actual fun eaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("eaccess requires N-API addon")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires N-API addon")

public actual fun ctimeR(timep: Long?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR requires N-API addon")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname requires N-API addon")

public actual fun posixBasename(path: String?): String? =
    throw UnsupportedOperationException("posixBasename requires N-API addon")

public actual fun gnuBasename(path: String?): String? =
    throw UnsupportedOperationException("gnuBasename requires N-API addon")

public actual fun dlmopen(lmid: Long, filename: String?, flag: Int): COpaquePointer? =
    throw UnsupportedOperationException("dlmopen requires N-API addon")

public actual fun dlinfo(handle: COpaquePointer?, request: Int, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlinfo requires N-API addon")

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("dladdr1 requires N-API addon")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires N-API addon")

public actual fun mallocTrim(pad: ULong): Int =
    throw UnsupportedOperationException("mallocTrim requires N-API addon")

public actual fun gnuGetLibcRelease(): String? =
    throw UnsupportedOperationException("gnuGetLibcRelease requires N-API addon")

public actual fun gnuGetLibcVersion(): String? =
    throw UnsupportedOperationException("gnuGetLibcVersion requires N-API addon")

public actual fun posixSpawnFileActionsAddchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires N-API addon")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: io.github.kotlinmania.libc.COpaquePointer?, from: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp requires N-API addon")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: io.github.kotlinmania.libc.COpaquePointer?, tcfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddtcsetpgrpNp requires N-API addon")

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: Int): Mntent? =
    throw UnsupportedOperationException("getmntentR requires N-API addon")

public actual fun execveat(dirfd: Int, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("execveat requires N-API addon")

public actual fun closeRange(first: UInt, last: UInt, flags: Int): Int =
    throw UnsupportedOperationException("closeRange requires N-API addon")

public actual fun mqNotify(mqdes: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("mqNotify requires N-API addon")

public actual fun epollPwait2(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("epollPwait2 requires N-API addon")

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mempcpy requires N-API addon")

public actual fun tgkill(tgid: Int, tid: Int, sig: Int): Int =
    throw UnsupportedOperationException("tgkill requires N-API addon")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortR requires N-API addon")

public actual fun glob64(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: Glob64T?): Int =
    throw UnsupportedOperationException("glob64 requires N-API addon")

public actual fun pthreadSigqueue(thread: ULong, sig: Int, value: Sigval): Int =
    throw UnsupportedOperationException("pthreadSigqueue requires N-API addon")
