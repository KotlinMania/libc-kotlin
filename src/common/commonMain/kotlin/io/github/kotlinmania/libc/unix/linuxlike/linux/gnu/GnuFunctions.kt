package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
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
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: ConstPtr, arg1: ConstPtr, arg2: MutPtr): CInt
}

public fun interface Glob64ErrfuncCallback {
    public operator fun invoke(epath: ConstPtr, errnum: CInt): CInt
}

public expect fun fgetspentR(fp: MutPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt

public expect fun sgetspentR(s: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt

public expect fun getspentR(spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt

public expect fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr)

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt

public expect fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt

public expect fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr, oldLimit: MutPtr): CInt

public expect fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr, oldLimit: MutPtr): CInt

public expect fun utmpname(file: ConstPtr): CInt

public expect fun utmpxname(file: ConstPtr): CInt

public expect fun getutxent(): MutPtr

public expect fun getutxid(ut: ConstPtr): MutPtr

public expect fun getutxline(ut: ConstPtr): MutPtr

public expect fun pututxline(ut: ConstPtr): MutPtr

public expect fun setutxent()

public expect fun endutxent()

public expect fun getpt(): CInt

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt

public expect fun getentropy(buf: MutPtr, buflen: SizeT): CInt

public expect fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT

public expect fun getauxval(type: CUlong): CUlong

public expect fun adjtimex(buf: MutPtr): CInt

public expect fun ntpAdjtime(buf: MutPtr): CInt

public expect fun ntpGettime(buf: MutPtr): CInt

public expect fun clockAdjtime(clkId: ClockidT, buf: MutPtr): CInt

public expect fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr): CInt

public expect fun preadv2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun pwritev2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun preadv64v2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT

public expect fun pwritev64v2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT

public expect fun renameat2(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CUint): CInt

// Added in `glibc` 2.25
public expect fun explicitBzero(s: MutPtr, len: SizeT)

// Added in `glibc` 2.29
public expect fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr

public expect fun ctermid(s: MutPtr): MutPtr

public expect fun backtrace(buf: MutPtr, sz: CInt): CInt

public expect fun backtraceSymbols(buffer: ConstPtr, len: CInt): MutPtr

public expect fun backtraceSymbolsFd(buffer: ConstPtr, len: CInt, fd: CInt)

public expect fun glob64(pattern: ConstPtr, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr): CInt

public expect fun globfree64(pglob: MutPtr)

public expect fun ptrace(request: CUint, vararg variadicArgs: Long): CLong

public expect fun pthreadAttrGetaffinityNp(attr: ConstPtr, cpusetsize: SizeT, cpuset: MutPtr): CInt

public expect fun pthreadAttrSetaffinityNp(attr: MutPtr, cpusetsize: SizeT, cpuset: ConstPtr): CInt

public expect fun getpriority(which: PriorityWhichT, who: IdT): CInt

public expect fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: ConstPtr, value: MutPtr): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: MutPtr, value: CInt): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr): CInt

public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt

public expect fun mallinfo(): Mallinfo

public expect fun mallinfo2(): Mallinfo2

public expect fun mallocStats()

public expect fun mallocInfo(options: CInt, stream: MutPtr): CInt

public expect fun mallocUsableSize(ptr: MutPtr): SizeT

public expect fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun fgetpwentR(stream: MutPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun fgetgrentR(stream: MutPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt

public expect fun putpwent(p: ConstPtr, stream: MutPtr): CInt

public expect fun putgrent(grp: ConstPtr, stream: MutPtr): CInt

public expect fun sethostid(hostid: CLong): CInt

public expect fun memfdCreate(name: ConstPtr, flags: CUint): CInt

public expect fun mlock2(addr: ConstPtr, len: SizeT, flags: CUint): CInt

public expect fun euidaccess(pathname: ConstPtr, mode: CInt): CInt

public expect fun eaccess(pathname: ConstPtr, mode: CInt): CInt

public expect fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr

public expect fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr

public expect fun dirname(path: MutPtr): MutPtr

/**
 * POSIX version of `basename(3)`, defined in `libgen.h`.
 */
public expect fun posixBasename(path: MutPtr): MutPtr

/**
 * GNU version of `basename(3)`, defined in `string.h`.
 */
public expect fun gnuBasename(path: ConstPtr): MutPtr

public expect fun dlmopen(lmid: LmidT, filename: ConstPtr, flag: CInt): MutPtr

public expect fun dlinfo(handle: MutPtr, request: CInt, info: MutPtr): CInt

public expect fun dladdr1(addr: ConstPtr, info: MutPtr, extraInfo: MutPtr, flags: CInt): CInt

public expect fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr

public expect fun mallocTrim(pad: SizeT): CInt

public expect fun gnuGetLibcRelease(): ConstPtr

public expect fun gnuGetLibcVersion(): ConstPtr

// posix/spawn.h
// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt

// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt

// Added in `glibc` 2.34
public expect fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr, from: CInt): CInt

// Added in `glibc` 2.35
public expect fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr, tcfd: CInt): CInt

// mntent.h
public expect fun getmntentR(stream: MutPtr, mntbuf: MutPtr, buf: MutPtr, buflen: CInt): MutPtr

public expect fun execveat(dirfd: CInt, pathname: ConstPtr, argv: ConstPtr, envp: ConstPtr, flags: CInt): CInt

// Added in `glibc` 2.34
public expect fun closeRange(first: CUint, last: CUint, flags: CInt): CInt

public expect fun mqNotify(mqdes: MqdT, sevp: ConstPtr): CInt

public expect fun epollPwait2(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: ConstPtr, sigmask: ConstPtr): CInt

public expect fun mempcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr

public expect fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt

public fun SiginfoT.siAddr(): MutPtr {
    val sz = maxOf(64L, SiginfoT.typeLayout().sizeBytes)
    val scratch =
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmAlloc(sz, 8L)
    SiginfoT.typeLayout().writeNative(scratch, this)
    val out =
        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
            .mutPtrLayout(64)
            .readNative(scratch + 16L)
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(scratch, sz, 8L)
    return out
}

public fun SiginfoT.siValue(): Sigval {
    val sz = maxOf(64L, SiginfoT.typeLayout().sizeBytes)
    val scratch =
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmAlloc(sz, 8L)
    SiginfoT.typeLayout().writeNative(scratch, this)
    val out = Sigval.typeLayout().readNative(scratch + 24L)
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(scratch, sz, 8L)
    return out
}

public fun SiginfoT.sifields(): Sifields {
    val sz = maxOf(64L, SiginfoT.typeLayout().sizeBytes)
    val scratch =
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmAlloc(sz, 8L)
    SiginfoT.typeLayout().writeNative(scratch, this)
    val out =
        Sifields(
            alignPointerCtorArg =
                io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                    .mutPtrLayout(64)
                    .readNative(scratch + 16L),
            sigchld = SifieldsSigchld.typeLayout().readNative(scratch + 16L),
        )
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(scratch, sz, 8L)
    return out
}

public fun SiginfoT.siPid(): PidT = this.sifields().sigchld.siPid

public fun SiginfoT.siUid(): UidT = this.sifields().sigchld.siUid

public fun SiginfoT.siStatus(): CInt = this.sifields().sigchld.siStatus

public fun SiginfoT.siUtime(): CLong = this.sifields().sigchld.siUtime

public fun SiginfoT.siStime(): CLong = this.sifields().sigchld.siStime
