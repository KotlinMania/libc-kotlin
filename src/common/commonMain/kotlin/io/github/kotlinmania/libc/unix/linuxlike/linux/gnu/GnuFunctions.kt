package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.FILE
import io.github.kotlinmania.libc.unix.Group
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.Sigval
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.UidT
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.CpuSetT
import io.github.kotlinmania.libc.unix.linuxlike.DlInfo
import io.github.kotlinmania.libc.unix.linuxlike.EpollEvent
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.Mntent
import io.github.kotlinmania.libc.unix.linuxlike.Passwd
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.Sigevent
import io.github.kotlinmania.libc.unix.linuxlike.Spwd
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.Tm
import io.github.kotlinmania.libc.unix.linuxlike.linux.MqdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.PosixSpawnFileActionsT
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadRwlockattrT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.SigsetT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.TimeT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.Timex
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.PthreadAttrT
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64.SiginfoT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun interface QsortRComparCallback {
    public operator fun invoke(arg0: ConstPtr<CVoid>, arg1: ConstPtr<CVoid>, arg2: MutPtr<CVoid>): CInt
}

public fun interface Glob64ErrfuncCallback {
    public operator fun invoke(epath: ConstPtr<CChar>, errnum: CInt): CInt
}

public expect fun fgetspentR(fp: MutPtr<FILE>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt

public expect fun sgetspentR(s: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt

public expect fun getspentR(spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt

public expect fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>)

public expect fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt

public expect fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt

public expect fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt

public expect fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt

public expect fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt

public expect fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt

public expect fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt

public expect fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt

public expect fun utmpname(file: ConstPtr<CChar>): CInt

public expect fun utmpxname(file: ConstPtr<CChar>): CInt

public expect fun getutxent(): MutPtr<Utmpx>

public expect fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx>

public expect fun setutxent()

public expect fun endutxent()

public expect fun getpt(): CInt

public expect fun mallopt(param: CInt, value: CInt): CInt

public expect fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt

public expect fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt

public expect fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT

public expect fun getauxval(type: CUlong): CUlong

public expect fun adjtimex(buf: MutPtr<Timex>): CInt

public expect fun ntpAdjtime(buf: MutPtr<Timex>): CInt

public expect fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt

public expect fun clockAdjtime(clkId: ClockidT, buf: MutPtr<Timex>): CInt

public expect fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr<CChar>): CInt

public expect fun preadv2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun pwritev2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT

public expect fun preadv64v2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT

public expect fun pwritev64v2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT

public expect fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt

// Added in `glibc` 2.25
public expect fun explicitBzero(s: MutPtr<CVoid>, len: SizeT)

// Added in `glibc` 2.29
public expect fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid>

public expect fun ctermid(s: MutPtr<CChar>): MutPtr<CChar>

public expect fun backtrace(buf: MutPtr<MutPtr<CVoid>>, sz: CInt): CInt

public expect fun backtraceSymbols(buffer: ConstPtr<MutPtr<CVoid>>, len: CInt): MutPtr<MutPtr<CChar>>

public expect fun backtraceSymbolsFd(buffer: ConstPtr<MutPtr<CVoid>>, len: CInt, fd: CInt)

public expect fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt

public expect fun globfree64(pglob: MutPtr<Glob64T>)

public expect fun ptrace(request: CUint, vararg variadicArgs: Long): CLong

public expect fun pthreadAttrGetaffinityNp(attr: ConstPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt

public expect fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt

public expect fun getpriority(which: PriorityWhichT, who: IdT): CInt

public expect fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt

public expect fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt

public expect fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt

public expect fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt

public expect fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt

public expect fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt

public expect fun mallinfo(): Mallinfo

public expect fun mallinfo2(): Mallinfo2

public expect fun mallocStats()

public expect fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt

public expect fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT

public expect fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun fgetpwentR(stream: MutPtr<FILE>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt

public expect fun fgetgrentR(stream: MutPtr<FILE>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt

public expect fun putpwent(p: ConstPtr<Passwd>, stream: MutPtr<FILE>): CInt

public expect fun putgrent(grp: ConstPtr<Group>, stream: MutPtr<FILE>): CInt

public expect fun sethostid(hostid: CLong): CInt

public expect fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt

public expect fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CUint): CInt

public expect fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt

public expect fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt

public expect fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar>

public expect fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar>

public expect fun dirname(path: MutPtr<CChar>): MutPtr<CChar>

/**
 * POSIX version of `basename(3)`, defined in `libgen.h`.
 */
public expect fun posixBasename(path: MutPtr<CChar>): MutPtr<CChar>

/**
 * GNU version of `basename(3)`, defined in `string.h`.
 */
public expect fun gnuBasename(path: ConstPtr<CChar>): MutPtr<CChar>

public expect fun dlmopen(lmid: LmidT, filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid>

public expect fun dlinfo(handle: MutPtr<CVoid>, request: CInt, info: MutPtr<CVoid>): CInt

public expect fun dladdr1(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>, extraInfo: MutPtr<MutPtr<CVoid>>, flags: CInt): CInt

public expect fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid>

public expect fun mallocTrim(pad: SizeT): CInt

public expect fun gnuGetLibcRelease(): ConstPtr<CChar>

public expect fun gnuGetLibcVersion(): ConstPtr<CChar>

// posix/spawn.h
// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt

// Added in `glibc` 2.29
public expect fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt

// Added in `glibc` 2.34
public expect fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr<PosixSpawnFileActionsT>, from: CInt): CInt

// Added in `glibc` 2.35
public expect fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr<PosixSpawnFileActionsT>, tcfd: CInt): CInt

// mntent.h
public expect fun getmntentR(stream: MutPtr<FILE>, mntbuf: MutPtr<Mntent>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Mntent>

public expect fun execveat(dirfd: CInt, pathname: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>, flags: CInt): CInt

// Added in `glibc` 2.34
public expect fun closeRange(first: CUint, last: CUint, flags: CInt): CInt

public expect fun mqNotify(mqdes: MqdT, sevp: ConstPtr<Sigevent>): CInt

public expect fun epollPwait2(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt

public expect fun mempcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid>

public expect fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt

public fun SiginfoT.siAddr(): MutPtr<CVoid> {
    val sz = maxOf(64L, SiginfoT.typeLayout().sizeBytes)
    val scratch =
        io.github.kotlinmania.rustlang.core.intrinsics
            .kmAlloc(sz, 8L)
    SiginfoT.typeLayout().writeNative(scratch, this)
    val out =
        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
            .mutPtrLayout<CVoid>(64)
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
                    .mutPtrLayout<CVoid>(64)
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
