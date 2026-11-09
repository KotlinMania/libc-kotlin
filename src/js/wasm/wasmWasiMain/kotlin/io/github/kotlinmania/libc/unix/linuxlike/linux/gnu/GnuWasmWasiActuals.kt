@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.MqdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT

public actual fun fgetspentR(fp: FILE?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    0

public actual fun sgetspentR(s: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    0

public actual fun getspentR(spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt =
    0

public actual fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: FnCallback?, arg: COpaquePointer?) {
}

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt =
    0

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt =
    0

public actual fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    0

public actual fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    0

public actual fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt =
    0

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    0

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt =
    0

public actual fun utmpname(file: String?): CInt =
    0

public actual fun utmpxname(file: String?): CInt =
    0

public actual fun getutxent(): COpaquePointer? =
    null

public actual fun getutxid(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun getutxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun pututxline(ut: COpaquePointer?): COpaquePointer? =
    null

public actual fun setutxent() {
}

public actual fun endutxent() {
}

public actual fun getpt(): CInt =
    0

public actual fun mallopt(param: CInt, value: CInt): CInt =
    0

public actual fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt =
    0

public actual fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt =
    0

public actual fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT =
    0L

public actual fun getauxval(type: CUlong): CUlong =
    0uL

public actual fun adjtimex(buf: COpaquePointer?): CInt =
    0

public actual fun ntpAdjtime(buf: COpaquePointer?): CInt =
    0

public actual fun ntpGettime(buf: COpaquePointer?): CInt =
    0

public actual fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt =
    0

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt =
    0

public actual fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    0L

public actual fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    0L

public actual fun preadv64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    0L

public actual fun pwritev64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    0L

public actual fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt =
    0

public actual fun explicitBzero(s: COpaquePointer?, len: SizeT) {
}

public actual fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun ctermid(s: COpaquePointer?): COpaquePointer? =
    null

public actual fun backtrace(buf: COpaquePointer?, sz: CInt): CInt =
    0

public actual fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer? =
    null

public actual fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt) {
}

public actual fun glob64(pattern: String?, flags: CInt, errfunc: FnCallback1?, pglob: COpaquePointer?): CInt =
    0

public actual fun globfree64(pglob: COpaquePointer?) {
}

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    0L

public actual fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    0

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    0

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    0

public actual fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt =
    0

public actual fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt =
    0

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt =
    0

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt =
    0

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallinfo2(): Mallinfo2 =
    Mallinfo2()

public actual fun mallocStats() {
}

public actual fun mallocInfo(options: CInt, stream: FILE?): CInt =
    0

public actual fun mallocUsableSize(ptr: COpaquePointer?): SizeT =
    0uL

public actual fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun fgetpwentR(stream: FILE?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun fgetgrentR(stream: FILE?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt =
    0

public actual fun putpwent(p: COpaquePointer?, stream: FILE?): CInt =
    0

public actual fun putgrent(grp: COpaquePointer?, stream: FILE?): CInt =
    0

public actual fun sethostid(hostid: CLong): CInt =
    0

public actual fun memfdCreate(name: String?, flags: CUint): CInt =
    0

public actual fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt =
    0

public actual fun euidaccess(pathname: String?, mode: CInt): CInt =
    0

public actual fun eaccess(pathname: String?, mode: CInt): CInt =
    0

public actual fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    null

public actual fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer? =
    null

public actual fun dirname(path: COpaquePointer?): COpaquePointer? =
    null

public actual fun posixBasename(path: COpaquePointer?): COpaquePointer? =
    null

public actual fun gnuBasename(path: String?): COpaquePointer? =
    null

public actual fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer? =
    null

public actual fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt =
    0

public actual fun dladdr1(addr: COpaquePointer?, info: COpaquePointer?, extraInfo: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer? =
    null

public actual fun mallocTrim(pad: SizeT): CInt =
    0

public actual fun gnuGetLibcRelease(): COpaquePointer? =
    null

public actual fun gnuGetLibcVersion(): COpaquePointer? =
    null

public actual fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt =
    0

public actual fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAddclosefromNp(actions: COpaquePointer?, from: CInt): CInt =
    0

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: COpaquePointer?, tcfd: CInt): CInt =
    0

public actual fun getmntentR(stream: FILE?, mntbuf: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer? =
    null

public actual fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt =
    0

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    0

public actual fun mqNotify(mqdes: MqdT, sevp: COpaquePointer?): CInt =
    0

public actual fun epollPwait2(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt =
    0

public actual fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer? =
    null

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    0
