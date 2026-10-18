@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import libc.cinterop.libc_dirname
import libc.cinterop.libc_gettimeofday

public actual fun fgetspentR(fp: FILE?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetspentR requires manual FFI bridge — not yet implemented")

public actual fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("sgetspentR requires manual FFI bridge — not yet implemented")

public actual fun getspentR(spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int =
    throw UnsupportedOperationException("getspentR requires manual FFI bridge — not yet implemented")

public actual fun sendmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int): Int =
    throw UnsupportedOperationException("sendmmsg requires manual FFI bridge — not yet implemented")

public actual fun recvmmsg(sockfd: Int, msgvec: Mmsghdr?, vlen: UInt, flags: Int, timeout: Timespec?): Int =
    throw UnsupportedOperationException("recvmmsg requires manual FFI bridge — not yet implemented")

public actual fun getrlimit64(resource: UInt, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("getrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun setrlimit64(resource: UInt, rlim: Rlimit64?): Int =
    throw UnsupportedOperationException("setrlimit64 requires manual FFI bridge — not yet implemented")

public actual fun getrlimit(resource: UInt, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("getrlimit requires FFI bridge")

public actual fun setrlimit(resource: UInt, rlim: Rlimit?): Int =
    throw UnsupportedOperationException("setrlimit requires FFI bridge")

public actual fun prlimit(pid: Int, resource: UInt, newLimit: Rlimit?, oldLimit: Rlimit?): Int =
    throw UnsupportedOperationException("prlimit requires FFI bridge")

public actual fun prlimit64(pid: Int, resource: UInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): Int =
    throw UnsupportedOperationException("prlimit64 requires manual FFI bridge — not yet implemented")

public actual fun utmpname(file: String?): Int =
    throw UnsupportedOperationException("utmpname requires manual FFI bridge — not yet implemented")

public actual fun utmpxname(file: String?): Int =
    throw UnsupportedOperationException("utmpxname requires manual FFI bridge — not yet implemented")

public actual fun getutxent(): Utmpx? =
    throw UnsupportedOperationException("getutxent requires manual FFI bridge — not yet implemented")

public actual fun getutxid(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxid requires manual FFI bridge — not yet implemented")

public actual fun getutxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("getutxline requires manual FFI bridge — not yet implemented")

public actual fun pututxline(ut: Utmpx?): Utmpx? =
    throw UnsupportedOperationException("pututxline requires manual FFI bridge — not yet implemented")

public actual fun setutxent(): Unit = throw UnsupportedOperationException("setutxent requires manual FFI bridge — not yet implemented")

public actual fun endutxent(): Unit = throw UnsupportedOperationException("endutxent requires manual FFI bridge — not yet implemented")

public actual fun getpt(): Int =
    throw UnsupportedOperationException("getpt requires manual FFI bridge — not yet implemented")

public actual fun mallopt(param: Int, value: Int): Int =
    throw UnsupportedOperationException("mallopt requires manual FFI bridge — not yet implemented")

public actual fun gettimeofday(tp: Timeval?, tz: Timezone?): Int {
    if (tp == null) return -1
    val tpPtr: CPointer<ByteVar>? = tp.handle.toCPointer()
    if (tz == null) return -1
    val tzPtr: CPointer<ByteVar>? = tz.handle.toCPointer()
    val result = libc_gettimeofday(tpPtr, tzPtr)
    return result
}

public actual fun getentropy(buf: COpaquePointer?, buflen: ULong): Int =
    throw UnsupportedOperationException("getentropy requires manual FFI bridge — not yet implemented")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("getrandom requires manual FFI bridge — not yet implemented")

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval requires FFI bridge")

public actual fun adjtimex(buf: Timex?): Int =
    throw UnsupportedOperationException("adjtimex requires manual FFI bridge — not yet implemented")

public actual fun ntpAdjtime(buf: Timex?): Int =
    throw UnsupportedOperationException("ntpAdjtime requires manual FFI bridge — not yet implemented")

public actual fun ntpGettime(buf: Ntptimeval?): Int =
    throw UnsupportedOperationException("ntpGettime requires manual FFI bridge — not yet implemented")

public actual fun clockAdjtime(clkId: Int, buf: Timex?): Int =
    throw UnsupportedOperationException("clockAdjtime requires manual FFI bridge — not yet implemented")

public actual fun fanotifyMark(fd: Int, flags: UInt, mask: ULong, dirfd: Int, path: String?): Int =
    throw UnsupportedOperationException("fanotifyMark requires manual FFI bridge — not yet implemented")

public actual fun preadv2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("preadv2 requires manual FFI bridge — not yet implemented")

public actual fun pwritev2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("pwritev2 requires manual FFI bridge — not yet implemented")

public actual fun preadv64v2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("preadv64v2 requires manual FFI bridge — not yet implemented")

public actual fun pwritev64v2(fd: Int, iov: Iovec?, iovcnt: Int, offset: Long, flags: Int): Long =
    throw UnsupportedOperationException("pwritev64v2 requires manual FFI bridge — not yet implemented")

public actual fun renameat2(olddirfd: Int, oldpath: String?, newdirfd: Int, newpath: String?, flags: UInt): Int =
    throw UnsupportedOperationException("renameat2 requires manual FFI bridge — not yet implemented")

public actual fun explicitBzero(s: COpaquePointer?, len: ULong): Unit = throw UnsupportedOperationException("explicitBzero requires manual FFI bridge — not yet implemented")

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("reallocarray requires manual FFI bridge — not yet implemented")

public actual fun ctermid(s: String?): String? =
    throw UnsupportedOperationException("ctermid requires manual FFI bridge — not yet implemented")

public actual fun backtrace(buf: COpaquePointer?, sz: Int): Int =
    throw UnsupportedOperationException("backtrace requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: Int): COpaquePointer? =
    throw UnsupportedOperationException("backtraceSymbols requires manual FFI bridge — not yet implemented")

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: Int, fd: Int): Unit = throw UnsupportedOperationException("backtraceSymbolsFd requires manual FFI bridge — not yet implemented")

public actual fun globfree64(pglob: Glob64T?): Unit = throw UnsupportedOperationException("globfree64 requires manual FFI bridge — not yet implemented")

public actual fun ptrace(request: UInt, vararg args: Any?): Long =
    throw UnsupportedOperationException("ptrace requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrGetaffinityNp(attr: io.github.kotlinmania.libc.COpaquePointer?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrGetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadAttrSetaffinityNp(attr: io.github.kotlinmania.libc.COpaquePointer?, cpusetsize: ULong, cpuset: ULong?): Int =
    throw UnsupportedOperationException("pthreadAttrSetaffinityNp requires manual FFI bridge — not yet implemented")

public actual fun getpriority(which: UInt, who: UInt): Int =
    throw UnsupportedOperationException("getpriority requires FFI bridge")

public actual fun setpriority(which: UInt, who: UInt, prio: Int): Int =
    throw UnsupportedOperationException("setpriority requires FFI bridge")

public actual fun pthreadRwlockattrGetkindNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int?): Int =
    throw UnsupportedOperationException("pthreadRwlockattrGetkindNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadRwlockattrSetkindNp(attr: io.github.kotlinmania.libc.COpaquePointer?, `val`: Int): Int =
    throw UnsupportedOperationException("pthreadRwlockattrSetkindNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadTryjoinNp(thread: ULong, retval: COpaquePointer?): Int =
    throw UnsupportedOperationException("pthreadTryjoinNp requires manual FFI bridge — not yet implemented")

public actual fun pthreadTimedjoinNp(thread: ULong, retval: COpaquePointer?, abstime: Timespec?): Int =
    throw UnsupportedOperationException("pthreadTimedjoinNp requires manual FFI bridge — not yet implemented")

public actual fun mallocStats(): Unit = throw UnsupportedOperationException("mallocStats requires manual FFI bridge — not yet implemented")

public actual fun mallocInfo(options: Int, stream: FILE?): Int =
    throw UnsupportedOperationException("mallocInfo requires manual FFI bridge — not yet implemented")

public actual fun mallocUsableSize(ptr: COpaquePointer?): ULong =
    throw UnsupportedOperationException("mallocUsableSize requires manual FFI bridge — not yet implemented")

public actual fun getpwentR(pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getpwentR requires manual FFI bridge — not yet implemented")

public actual fun getgrentR(grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("getgrentR requires manual FFI bridge — not yet implemented")

public actual fun fgetpwentR(stream: FILE?, pwd: Passwd?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetpwentR requires manual FFI bridge — not yet implemented")

public actual fun fgetgrentR(stream: FILE?, grp: Group?, buf: String?, buflen: ULong, result: COpaquePointer?): Int =
    throw UnsupportedOperationException("fgetgrentR requires manual FFI bridge — not yet implemented")

public actual fun putpwent(p: Passwd?, stream: FILE?): Int =
    throw UnsupportedOperationException("putpwent requires manual FFI bridge — not yet implemented")

public actual fun putgrent(grp: Group?, stream: FILE?): Int =
    throw UnsupportedOperationException("putgrent requires manual FFI bridge — not yet implemented")

public actual fun sethostid(hostid: Long): Int =
    throw UnsupportedOperationException("sethostid requires manual FFI bridge — not yet implemented")

public actual fun memfdCreate(name: String?, flags: UInt): Int =
    throw UnsupportedOperationException("memfdCreate requires manual FFI bridge — not yet implemented")

public actual fun mlock2(addr: COpaquePointer?, len: ULong, flags: UInt): Int =
    throw UnsupportedOperationException("mlock2 requires manual FFI bridge — not yet implemented")

public actual fun euidaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("euidaccess requires manual FFI bridge — not yet implemented")

public actual fun eaccess(pathname: String?, mode: Int): Int =
    throw UnsupportedOperationException("eaccess requires manual FFI bridge — not yet implemented")

public actual fun asctimeR(tm: Tm?, buf: String?): String? =
    throw UnsupportedOperationException("asctimeR requires manual FFI bridge — not yet implemented")

public actual fun ctimeR(timep: Long?, buf: String?): String? =
    throw UnsupportedOperationException("ctimeR requires manual FFI bridge — not yet implemented")

public actual fun dirname(path: String?): String? {
    val result = libc_dirname(path)
    return result?.toKString()
}

public actual fun posixBasename(path: String?): String? =
    throw UnsupportedOperationException("posixBasename requires manual FFI bridge — not yet implemented")

public actual fun gnuBasename(path: String?): String? =
    throw UnsupportedOperationException("gnuBasename requires manual FFI bridge — not yet implemented")

public actual fun dlmopen(lmid: Long, filename: String?, flag: Int): COpaquePointer? =
    throw UnsupportedOperationException("dlmopen requires manual FFI bridge — not yet implemented")

public actual fun dlinfo(handle: COpaquePointer?, request: Int, info: COpaquePointer?): Int =
    throw UnsupportedOperationException("dlinfo requires manual FFI bridge — not yet implemented")

public actual fun dladdr1(addr: COpaquePointer?, info: DlInfo?, extraInfo: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("dladdr1 requires manual FFI bridge — not yet implemented")

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    throw UnsupportedOperationException("dlvsym requires manual FFI bridge — not yet implemented")

public actual fun mallocTrim(pad: ULong): Int =
    throw UnsupportedOperationException("mallocTrim requires manual FFI bridge — not yet implemented")

public actual fun gnuGetLibcRelease(): String? =
    throw UnsupportedOperationException("gnuGetLibcRelease requires manual FFI bridge — not yet implemented")

public actual fun gnuGetLibcVersion(): String? =
    throw UnsupportedOperationException("gnuGetLibcVersion requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, path: String?): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddchdirNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddfchdirNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: io.github.kotlinmania.libc.COpaquePointer?, from: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddclosefromNp requires manual FFI bridge — not yet implemented")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: io.github.kotlinmania.libc.COpaquePointer?, tcfd: Int): Int =
    throw UnsupportedOperationException("posixSpawnFileActionsAddtcsetpgrpNp requires manual FFI bridge — not yet implemented")

public actual fun getmntentR(stream: FILE?, mntbuf: Mntent?, buf: String?, buflen: Int): Mntent? =
    throw UnsupportedOperationException("getmntentR requires manual FFI bridge — not yet implemented")

public actual fun execveat(dirfd: Int, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: Int): Int =
    throw UnsupportedOperationException("execveat requires manual FFI bridge — not yet implemented")

public actual fun closeRange(first: UInt, last: UInt, flags: Int): Int =
    throw UnsupportedOperationException("closeRange requires manual FFI bridge — not yet implemented")

public actual fun mqNotify(mqdes: Int, sevp: Sigevent?): Int =
    throw UnsupportedOperationException("mqNotify requires manual FFI bridge — not yet implemented")

public actual fun epollPwait2(epfd: Int, events: EpollEvent?, maxevents: Int, timeout: Timespec?, sigmask: ULong?): Int =
    throw UnsupportedOperationException("epollPwait2 requires manual FFI bridge — not yet implemented")

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer? =
    throw UnsupportedOperationException("mempcpy requires manual FFI bridge — not yet implemented")

public actual fun tgkill(tgid: Int, tid: Int, sig: Int): Int =
    throw UnsupportedOperationException("tgkill requires manual FFI bridge — not yet implemented")

public actual fun qsortR(base: COpaquePointer?, num: ULong, size: ULong, compar: ((COpaquePointer?, COpaquePointer?, COpaquePointer?) -> Int)?, arg: COpaquePointer?): Unit = throw UnsupportedOperationException("qsortR requires manual FFI bridge — not yet implemented")

public actual fun glob64(pattern: String?, flags: Int, errfunc: ((String?, Int) -> Int)?, pglob: Glob64T?): Int =
    throw UnsupportedOperationException("glob64 requires manual FFI bridge — not yet implemented")

public actual fun pthreadSigqueue(thread: ULong, sig: Int, value: Sigval): Int =
    throw UnsupportedOperationException("pthreadSigqueue requires manual FFI bridge for ambiguous type")
