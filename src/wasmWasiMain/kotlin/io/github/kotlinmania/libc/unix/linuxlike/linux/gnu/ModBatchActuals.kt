package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.unix.linuxlike.DlInfo
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.Mntent
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.Sigevent
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.linuxlike.Spwd
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Timex
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.Tm

import io.github.kotlinmania.libc.*

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetspentR not available on WASI — no C library access")

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("sgetspentR not available on WASI — no C library access")

public actual fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("getspentR not available on WASI — no C library access")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("sendmmsg not available on WASI — no C library access")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg not available on WASI — no C library access")

public actual fun getrlimit64(resource: UInt, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 not available on WASI — no C library access")

public actual fun setrlimit64(resource: UInt, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 not available on WASI — no C library access")

public actual fun getrlimit(resource: UInt, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit not available on WASI — no C library access")

public actual fun setrlimit(resource: UInt, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit not available on WASI — no C library access")

public actual fun prlimit(pid: Int, resource: UInt, newLimit: Rlimit?, oldLimit: Rlimit?): Int =
    throw UnsupportedOperationException("prlimit not available on WASI — no C library access")

public actual fun prlimit64(pid: Int, resource: UInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): Int =
    throw UnsupportedOperationException("prlimit64 not available on WASI — no C library access")

public actual fun utmpname(file: String?): Int =
    throw UnsupportedOperationException("utmpname not available on WASI — no C library access")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname not available on WASI — no C library access")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent not available on WASI — no C library access")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid not available on WASI — no C library access")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline not available on WASI — no C library access")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline not available on WASI — no C library access")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent not available on WASI — no C library access")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent not available on WASI — no C library access")

public actual fun getpt(): Int =
    throw UnsupportedOperationException("getpt not available on WASI — no C library access")

public actual fun mallopt(param: Int, value: Int): Int =
    throw UnsupportedOperationException("mallopt not available on WASI — no C library access")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int =
    throw UnsupportedOperationException("gettimeofday not available on WASI — no C library access")

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy not available on WASI — no C library access")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom not available on WASI — no C library access")

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval not available on WASI — no C library access")

public actual fun adjtimex(buf: Timex?): Int =
    throw UnsupportedOperationException("adjtimex not available on WASI — no C library access")

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime not available on WASI — no C library access")

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime not available on WASI — no C library access")

public actual fun clockAdjtime(clkId: Int, buf: Timex?): Int =
    throw UnsupportedOperationException("clockAdjtime not available on WASI — no C library access")

public actual fun fanotifyMark(fd: Int, flags: UInt, mask: ULong, dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("fanotifyMark not available on WASI — no C library access")

public actual fun preadv2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("preadv2 not available on WASI — no C library access")

public actual fun pwritev2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("pwritev2 not available on WASI — no C library access")

public actual fun preadv64v2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("preadv64v2 not available on WASI — no C library access")

public actual fun pwritev64v2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("pwritev64v2 not available on WASI — no C library access")

public actual fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renameat2 not available on WASI — no C library access")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero not available on WASI — no C library access")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray not available on WASI — no C library access")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid not available on WASI — no C library access")

public actual fun backtrace(buf: COpaquePointer?, sz: Int): Int =
    throw UnsupportedOperationException("backtrace not available on WASI — no C library access")

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: Int): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols not available on WASI — no C library access")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: Int, fd: Int): Unit = throw UnsupportedOperationException("backtraceSymbolsFd not available on WASI — no C library access")

public actual fun globfree64(pglob: Glob64T?): Unit = throw UnsupportedOperationException("globfree64 not available on WASI — no C library access")

public actual fun ptrace(request: UInt, vararg args: Any?): Long =
    throw UnsupportedOperationException("ptrace not available on WASI — no C library access")

public actual fun pthreadAttrGetaffinityNp(attr: io.github.kotlinmania.libc.COpaquePointer?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp not available on WASI — no C library access")

public actual fun pthreadAttrSetaffinityNp(attr: io.github.kotlinmania.libc.COpaquePointer?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp not available on WASI — no C library access")

public actual fun getpriority(which: UInt, who: UInt): Int =
    throw UnsupportedOperationException("getpriority not available on WASI — no C library access")

public actual fun setpriority(which: UInt, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority not available on WASI — no C library access")

public actual fun pthreadRwlockattrGetkindNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp not available on WASI — no C library access")

public actual fun pthreadRwlockattrSetkindNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp not available on WASI — no C library access")

public actual fun pthreadTryjoinNp(thread: ULong, retval: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadTryjoinNp not available on WASI — no C library access")

public actual fun pthreadTimedjoinNp(thread: ULong, retval: COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadTimedjoinNp not available on WASI — no C library access")

public actual fun mallocStats(): Unit = throw UnsupportedOperationException("mallocStats not available on WASI — no C library access")

public actual fun mallocInfo(options: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("mallocInfo not available on WASI — no C library access")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize not available on WASI — no C library access")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwentR not available on WASI — no C library access")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrentR not available on WASI — no C library access")

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetpwentR not available on WASI — no C library access")

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetgrentR not available on WASI — no C library access")

public actual fun putpwent(p: Passwd?, stream: FILE?): Int =
    throw UnsupportedOperationException("putpwent not available on WASI — no C library access")

public actual fun putgrent(grp: Group?, stream: FILE?): Int =
    throw UnsupportedOperationException("putgrent not available on WASI — no C library access")

public actual fun sethostid(hostid: Long): Int =
    throw UnsupportedOperationException("sethostid not available on WASI — no C library access")

public actual fun memfdCreate(name: String?, flags: UInt): Int =
    throw UnsupportedOperationException("memfdCreate not available on WASI — no C library access")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("mlock2 not available on WASI — no C library access")

public actual fun euidaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("euidaccess not available on WASI — no C library access")

public actual fun eaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("eaccess not available on WASI — no C library access")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR not available on WASI — no C library access")

public actual fun ctimeR(timep: Long?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR not available on WASI — no C library access")

public actual fun dirname(path: String?): String? =
    throw UnsupportedOperationException("dirname not available on WASI — no C library access")

public actual fun posixBasename(path: String?): String? =
    throw UnsupportedOperationException("posixBasename not available on WASI — no C library access")

public actual fun gnuBasename(path: String?): String? =
    throw UnsupportedOperationException("gnuBasename not available on WASI — no C library access")

public actual fun dlmopen(lmid: Long, filename: String?, flag: Int): COpaquePointer? =
    throw UnsupportedOperationException("dlmopen not available on WASI — no C library access")

public actual fun dlinfo(handle: COpaquePointer?, request: Int, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlinfo not available on WASI — no C library access")

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("dladdr1 not available on WASI — no C library access")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym not available on WASI — no C library access")

public actual fun mallocTrim(pad: ULong): Int =
    throw UnsupportedOperationException("mallocTrim not available on WASI — no C library access")

public actual fun gnuGetLibcRelease(): String? =
    throw UnsupportedOperationException("gnuGetLibcRelease not available on WASI — no C library access")

public actual fun gnuGetLibcVersion(): String? =
    throw UnsupportedOperationException("gnuGetLibcVersion not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: io.github.kotlinmania.libc.COpaquePointer?, from: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp not available on WASI — no C library access")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: io.github.kotlinmania.libc.COpaquePointer?, tcfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddtcsetpgrpNp not available on WASI — no C library access")

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: Int): Mntent? =
    throw UnsupportedOperationException("getmntentR not available on WASI — no C library access")

public actual fun execveat(dirfd: Int, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("execveat not available on WASI — no C library access")

public actual fun closeRange(first: UInt, last: UInt, flags: Int): Int =
    throw UnsupportedOperationException("closeRange not available on WASI — no C library access")

public actual fun mqNotify(mqdes: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("mqNotify not available on WASI — no C library access")

public actual fun epollPwait2(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("epollPwait2 not available on WASI — no C library access")

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mempcpy not available on WASI — no C library access")

public actual fun tgkill(tgid: Int, tid: Int, sig: Int): Int =
    throw UnsupportedOperationException("tgkill not available on WASI — no C library access")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortR not available on WASI — no C library access")

public actual fun glob64(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: Glob64T?): Int =
    throw UnsupportedOperationException("glob64 not available on WASI — no C library access")

public actual fun pthreadSigqueue(thread: ULong, sig: Int, value: Sigval): Int =
    throw UnsupportedOperationException("pthreadSigqueue not available on WASI — no C library access")
