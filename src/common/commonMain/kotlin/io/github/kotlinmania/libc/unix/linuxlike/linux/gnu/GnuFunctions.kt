package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
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
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.MqdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SiginfoT

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: COpaquePointer?, arg1: COpaquePointer?, arg2: COpaquePointer?): CInt
}

public fun interface Glob64ErrfuncCallback {
    public operator fun invoke(epath: COpaquePointer?, errnum: CInt): CInt
}

public expect fun fgetspentR(fp: FILE?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun sgetspentR(s: String?, spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun getspentR(spbuf: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, spbufp: COpaquePointer?): CInt

public expect fun qsortR(base: COpaquePointer?, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: COpaquePointer?)

public expect fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CInt, timeout: COpaquePointer?): CInt

public expect fun getrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: COpaquePointer?): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: COpaquePointer?): CInt

public expect fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt

public expect fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: COpaquePointer?, oldLimit: COpaquePointer?): CInt

public expect fun utmpname(file: String?): CInt

public expect fun utmpxname(file: String?): CInt

public expect fun getutxent(): COpaquePointer?

public expect fun getutxid(ut: COpaquePointer?): COpaquePointer?

public expect fun getutxline(ut: COpaquePointer?): COpaquePointer?

public expect fun pututxline(ut: COpaquePointer?): COpaquePointer?

public expect fun setutxent()

public expect fun endutxent()

public expect fun getpt(): CInt

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun gettimeofday(tp: COpaquePointer?, tz: COpaquePointer?): CInt

public expect fun getentropy(buf: COpaquePointer?, buflen: SizeT): CInt

public expect fun getrandom(buf: COpaquePointer?, buflen: SizeT, flags: CUint): SsizeT

public expect fun getauxval(type: CUlong): CUlong

public expect fun adjtimex(buf: COpaquePointer?): CInt

public expect fun ntpAdjtime(buf: COpaquePointer?): CInt

public expect fun ntpGettime(buf: COpaquePointer?): CInt

public expect fun clockAdjtime(clkId: ClockidT, buf: COpaquePointer?): CInt

public expect fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: String?): CInt

public expect fun preadv2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun pwritev2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun preadv64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT

public expect fun pwritev64v2(fd: CInt, iov: COpaquePointer?, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT

public expect fun renameat2(olddirfd: CInt, oldpath: String?, newdirfd: CInt, newpath: String?, flags: CUint): CInt

// Added in `glibc` 2.25
public expect fun explicitBzero(s: COpaquePointer?, len: SizeT)

// Added in `glibc` 2.29
public expect fun reallocarray(ptr: COpaquePointer?, nmemb: SizeT, size: SizeT): COpaquePointer?

public expect fun ctermid(s: COpaquePointer?): COpaquePointer?

public expect fun backtrace(buf: COpaquePointer?, sz: CInt): CInt

public expect fun backtraceSymbols(buffer: COpaquePointer?, len: CInt): COpaquePointer?

public expect fun backtraceSymbolsFd(buffer: COpaquePointer?, len: CInt, fd: CInt)

public expect fun glob64(pattern: String?, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: COpaquePointer?): CInt

public expect fun globfree64(pglob: COpaquePointer?)

public expect fun ptrace(request: CUint, vararg variadicArgs: Long): CLong

public expect fun pthreadAttrGetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun pthreadAttrSetaffinityNp(attr: COpaquePointer?, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt

public expect fun getpriority(which: PriorityWhichT, who: IdT): CInt

public expect fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: COpaquePointer?, value: COpaquePointer?): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: COpaquePointer?, value: CInt): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun pthreadTryjoinNp(thread: PthreadT, retval: COpaquePointer?): CInt

public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: COpaquePointer?, abstime: COpaquePointer?): CInt

public expect fun mallinfo(): Mallinfo

public expect fun mallinfo2(): Mallinfo2

public expect fun mallocStats()

public expect fun mallocInfo(options: CInt, stream: FILE?): CInt

public expect fun mallocUsableSize(ptr: COpaquePointer?): SizeT

public expect fun getpwentR(pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun getgrentR(grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun fgetpwentR(stream: FILE?, pwd: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun fgetgrentR(stream: FILE?, grp: COpaquePointer?, buf: COpaquePointer?, buflen: SizeT, result: COpaquePointer?): CInt

public expect fun putpwent(p: COpaquePointer?, stream: FILE?): CInt

public expect fun putgrent(grp: COpaquePointer?, stream: FILE?): CInt

public expect fun sethostid(hostid: CLong): CInt

public expect fun memfdCreate(name: String?, flags: CUint): CInt

public expect fun mlock2(addr: COpaquePointer?, len: SizeT, flags: CUint): CInt

public expect fun euidaccess(pathname: String?, mode: CInt): CInt

public expect fun eaccess(pathname: String?, mode: CInt): CInt

public expect fun asctimeR(tm: COpaquePointer?, buf: COpaquePointer?): COpaquePointer?

public expect fun ctimeR(timep: COpaquePointer?, buf: COpaquePointer?): COpaquePointer?

public expect fun dirname(path: COpaquePointer?): COpaquePointer?

/**
 * POSIX version of `basename(3)`, defined in `libgen.h`.
 */
public expect fun posixBasename(path: COpaquePointer?): COpaquePointer?

/**
 * GNU version of `basename(3)`, defined in `string.h`.
 */
public expect fun gnuBasename(path: String?): COpaquePointer?

public expect fun dlmopen(lmid: LmidT, filename: String?, flag: CInt): COpaquePointer?

public expect fun dlinfo(handle: COpaquePointer?, request: CInt, info: COpaquePointer?): CInt

public expect fun dladdr1(addr: COpaquePointer?, info: COpaquePointer?, extraInfo: COpaquePointer?, flags: CInt): CInt

public expect fun dlvsym(handle: COpaquePointer?, symbol: String?, version: String?): COpaquePointer?

public expect fun mallocTrim(pad: SizeT): CInt

public expect fun gnuGetLibcRelease(): COpaquePointer?

public expect fun gnuGetLibcVersion(): COpaquePointer?

// posix/spawn.h
// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddchdirNp(actions: COpaquePointer?, path: String?): CInt

// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddfchdirNp(actions: COpaquePointer?, fd: CInt): CInt

// Added in `glibc` 2.34
public expect fun posixSpawnFileActionsAddclosefromNp(actions: COpaquePointer?, from: CInt): CInt

// Added in `glibc` 2.35
public expect fun posixSpawnFileActionsAddtcsetpgrpNp(actions: COpaquePointer?, tcfd: CInt): CInt

// mntent.h
public expect fun getmntentR(stream: FILE?, mntbuf: COpaquePointer?, buf: COpaquePointer?, buflen: CInt): COpaquePointer?

public expect fun execveat(dirfd: CInt, pathname: String?, argv: COpaquePointer?, envp: COpaquePointer?, flags: CInt): CInt

// Added in `glibc` 2.34
public expect fun closeRange(first: CUint, last: CUint, flags: CInt): CInt

public expect fun mqNotify(mqdes: MqdT, sevp: COpaquePointer?): CInt

public expect fun epollPwait2(epfd: CInt, events: COpaquePointer?, maxevents: CInt, timeout: COpaquePointer?, sigmask: COpaquePointer?): CInt

public expect fun mempcpy(dest: COpaquePointer?, src: COpaquePointer?, n: SizeT): COpaquePointer?

public expect fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt

public fun SiginfoT.siAddr(): COpaquePointer? {
    data class SiginfoSigfault(
        public var siSigno: CInt = 0,
        public var siErrno: CInt = 0,
        public var siCode: CInt = 0,
        public var siAddr: COpaquePointer? = null,
    )
    return (((((this as Any?) as SiginfoT?)) as Any?) as SiginfoSigfault?)!!.siAddr
}

public fun SiginfoT.siValue(): Sigval {
    data class SiginfoTimer(
        public var siSigno: CInt = 0,
        public var siErrno: CInt = 0,
        public var siCode: CInt = 0,
        public var siTid: CInt = 0,
        public var siOverrun: CInt = 0,
        public var siSigval: Sigval = Sigval(),
    )
    return (((((this as Any?) as SiginfoT?)) as Any?) as SiginfoTimer?)!!.siSigval
}

public fun SiginfoT.sifields(): Sifields {
    return (((((this as Any?) as SiginfoT?)) as Any?) as SiginfoF?)!!.sifields
}

public fun SiginfoT.siPid(): PidT {
    return this.sifields().sigchld.siPid
}

public fun SiginfoT.siUid(): UidT {
    return this.sifields().sigchld.siUid
}

public fun SiginfoT.siStatus(): CInt {
    return this.sifields().sigchld.siStatus
}

public fun SiginfoT.siUtime(): CLong {
    return this.sifields().sigchld.siUtime
}

public fun SiginfoT.siStime(): CLong {
    return this.sifields().sigchld.siStime
}
