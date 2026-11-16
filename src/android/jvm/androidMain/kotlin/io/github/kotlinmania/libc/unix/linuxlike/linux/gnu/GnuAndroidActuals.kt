@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.libc.unix.linuxlike.ClockidT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.MqdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.OffT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxGnuJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuFgetspentR(fp: Long, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuSgetspentR(s: Long, spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetspentR(spbuf: Long, buf: Long, buflen: Long, spbufp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuQsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuSendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuRecvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuSetrlimit64(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuSetrlimit(resource: Int, rlim: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPrlimit(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPrlimit64(pid: Int, resource: Int, newLimit: Long, oldLimit: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuUtmpname(file: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuUtmpxname(file: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetutxent(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetutxid(ut: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetutxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPututxline(ut: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuSetutxent()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuEndutxent()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetpt(): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuMallopt(param: Int, value: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGettimeofday(tp: Long, tz: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetentropy(buf: Long, buflen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetauxval(type: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuAdjtimex(buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuNtpAdjtime(buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuNtpGettime(buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuClockAdjtime(clkId: Int, buf: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuFanotifyMark(fd: Int, flags: Int, mask: Long, dirfd: Int, path: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPreadv2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPwritev2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPreadv64v2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPwritev64v2(fd: Int, iov: Long, iovcnt: Int, offset: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuRenameat2(olddirfd: Int, oldpath: Long, newdirfd: Int, newpath: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuExplicitBzero(s: Long, len: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuReallocarray(ptr: Long, nmemb: Long, size: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuCtermid(s: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuBacktrace(buf: Long, sz: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuBacktraceSymbols(buffer: Long, len: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd(buffer: Long, len: Int, fd: Int)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGlob64(pattern: Long, flags: Int, errfunc: Long, pglob: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGlobfree64(pglob: Long)

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPtrace(request: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp(attr: Long, cpusetsize: Long, cpuset: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetpriority(which: Int, who: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuSetpriority(which: Int, who: Int, prio: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp(attr: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp(attr: Long, value: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPthreadTryjoinNp(thread: Long, retval: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp(thread: Long, retval: Long, abstime: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuMallocStats()

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuMallocInfo(options: Int, stream: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuMallocUsableSize(ptr: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetpwentR(pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetgrentR(grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuFgetpwentR(stream: Long, pwd: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuFgetgrentR(stream: Long, grp: Long, buf: Long, buflen: Long, result: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPutpwent(p: Long, stream: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPutgrent(grp: Long, stream: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuSethostid(hostid: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuMemfdCreate(name: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuMlock2(addr: Long, len: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuEuidaccess(pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuEaccess(pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuAsctimeR(tm: Long, buf: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuCtimeR(timep: Long, buf: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuDirname(path: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPosixBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGnuBasename(path: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuDlmopen(lmid: Long, filename: Long, flag: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuDlinfo(handle: Long, request: Int, info: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuDladdr1(addr: Long, info: Long, extraInfo: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuDlvsym(handle: Long, symbol: Long, version: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuMallocTrim(pad: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGnuGetLibcRelease(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGnuGetLibcVersion(): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp(actions: Long, path: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp(actions: Long, fd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp(actions: Long, from: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp(actions: Long, tcfd: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuGetmntentR(stream: Long, mntbuf: Long, buf: Long, buflen: Int): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuExecveat(dirfd: Int, pathname: Long, argv: Long, envp: Long, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuCloseRange(first: Int, last: Int, flags: Int): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuMqNotify(mqdes: Long, sevp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuEpollPwait2(epfd: Int, events: Long, maxevents: Int, timeout: Long, sigmask: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuMempcpy(dest: Long, src: Long, n: Long): Long

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuTgkill(tgid: Int, tid: Int, sig: Int): Int
}

public actual fun fgetspentR(fp: MutPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuFgetspentR(fp.rawAddress, spbuf.rawAddress, buf.rawAddress, buflen.toLong(), spbufp.rawAddress)

public actual fun sgetspentR(s: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuSgetspentR(s.rawAddress, spbuf.rawAddress, buf.rawAddress, buflen.toLong(), spbufp.rawAddress)

public actual fun getspentR(spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetspentR(spbuf.rawAddress, buf.rawAddress, buflen.toLong(), spbufp.rawAddress)

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuQsortR(base.rawAddress, num.toLong(), size.toLong(), 0L, arg.rawAddress)
}

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuSendmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuRecvmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags, timeout.rawAddress)

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetrlimit64(resource.toInt(), rlim.rawAddress)

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuSetrlimit64(resource.toInt(), rlim.rawAddress)

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetrlimit(resource.toInt(), rlim.rawAddress)

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuSetrlimit(resource.toInt(), rlim.rawAddress)

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPrlimit(pid, resource.toInt(), newLimit.rawAddress, oldLimit.rawAddress)

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPrlimit64(pid, resource.toInt(), newLimit.rawAddress, oldLimit.rawAddress)

public actual fun utmpname(file: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuUtmpname(file.rawAddress)

public actual fun utmpxname(file: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuUtmpxname(file.rawAddress)

public actual fun getutxent(): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetutxent())

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetutxid(ut.rawAddress))

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetutxline(ut.rawAddress))

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPututxline(ut.rawAddress))

public actual fun setutxent() {
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuSetutxent()
}

public actual fun endutxent() {
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuEndutxent()
}

public actual fun getpt(): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetpt()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuMallopt(param, value)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGettimeofday(tp.rawAddress, tz.rawAddress)

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetentropy(buf.rawAddress, buflen.toLong())

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun getauxval(type: CUlong): CUlong =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetauxval(type.toLong()).toULong()

public actual fun adjtimex(buf: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuAdjtimex(buf.rawAddress)

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuNtpAdjtime(buf.rawAddress)

public actual fun ntpGettime(buf: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuNtpGettime(buf.rawAddress)

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuClockAdjtime(clkId, buf.rawAddress)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuFanotifyMark(fd, flags.toInt(), mask.toLong(), dirfd, path.rawAddress)

public actual fun preadv2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPreadv2(fd, iov.rawAddress, iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPwritev2(fd, iov.rawAddress, iovcnt, offset, flags)

public actual fun preadv64v2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPreadv64v2(fd, iov.rawAddress, iovcnt, offset, flags)

public actual fun pwritev64v2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPwritev64v2(fd, iov.rawAddress, iovcnt, offset, flags)

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CUint): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuRenameat2(olddirfd, oldpath.rawAddress, newdirfd, newpath.rawAddress, flags.toInt())

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuExplicitBzero(s.rawAddress, len.toLong())
}

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuReallocarray(ptr.rawAddress, nmemb.toLong(), size.toLong()))

public actual fun ctermid(s: MutPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuCtermid(s.rawAddress))

public actual fun backtrace(buf: MutPtr, sz: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuBacktrace(buf.rawAddress, sz)

public actual fun backtraceSymbols(buffer: ConstPtr, len: CInt): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuBacktraceSymbols(buffer.rawAddress, len))

public actual fun backtraceSymbolsFd(buffer: ConstPtr, len: CInt, fd: CInt) {
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd(buffer.rawAddress, len, fd)
}

public actual fun glob64(pattern: ConstPtr, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGlob64(pattern.rawAddress, flags, 0L, pglob.rawAddress)

public actual fun globfree64(pglob: MutPtr) {
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGlobfree64(pglob.rawAddress)
}

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPtrace(request.toInt(), variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp(attr.rawAddress, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp(attr.rawAddress, cpusetsize.toLong(), cpuset.rawAddress)

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetpriority(which.toInt(), who.toInt())

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuSetpriority(which.toInt(), who.toInt(), prio)

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr, value: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp(attr.rawAddress, value.rawAddress)

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr, value: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp(attr.rawAddress, value)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPthreadTryjoinNp(thread.toLong(), retval.rawAddress)

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp(thread.toLong(), retval.rawAddress, abstime.rawAddress)

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallinfo2(): Mallinfo2 =
    Mallinfo2()

public actual fun mallocStats() {
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuMallocStats()
}

public actual fun mallocInfo(options: CInt, stream: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuMallocInfo(options, stream.rawAddress)

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuMallocUsableSize(ptr.rawAddress).toULong()

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetpwentR(pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetgrentR(grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun fgetpwentR(stream: MutPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuFgetpwentR(stream.rawAddress, pwd.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun fgetgrentR(stream: MutPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuFgetgrentR(stream.rawAddress, grp.rawAddress, buf.rawAddress, buflen.toLong(), result.rawAddress)

public actual fun putpwent(p: ConstPtr, stream: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPutpwent(p.rawAddress, stream.rawAddress)

public actual fun putgrent(grp: ConstPtr, stream: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPutgrent(grp.rawAddress, stream.rawAddress)

public actual fun sethostid(hostid: CLong): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuSethostid(hostid)

public actual fun memfdCreate(name: ConstPtr, flags: CUint): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuMemfdCreate(name.rawAddress, flags.toInt())

public actual fun mlock2(addr: ConstPtr, len: SizeT, flags: CUint): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuMlock2(addr.rawAddress, len.toLong(), flags.toInt())

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuEuidaccess(pathname.rawAddress, mode)

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuEaccess(pathname.rawAddress, mode)

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuAsctimeR(tm.rawAddress, buf.rawAddress))

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuCtimeR(timep.rawAddress, buf.rawAddress))

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuDirname(path.rawAddress))

public actual fun posixBasename(path: MutPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPosixBasename(path.rawAddress))

public actual fun gnuBasename(path: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGnuBasename(path.rawAddress))

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr, flag: CInt): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuDlmopen(lmid, filename.rawAddress, flag))

public actual fun dlinfo(handle: MutPtr, request: CInt, info: MutPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuDlinfo(handle.rawAddress, request, info.rawAddress)

public actual fun dladdr1(addr: ConstPtr, info: MutPtr, extraInfo: MutPtr, flags: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuDladdr1(addr.rawAddress, info.rawAddress, extraInfo.rawAddress, flags)

public actual fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuDlvsym(handle.rawAddress, symbol.rawAddress, version.rawAddress))

public actual fun mallocTrim(pad: SizeT): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuMallocTrim(pad.toLong())

public actual fun gnuGetLibcRelease(): ConstPtr =
    ConstPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGnuGetLibcRelease())

public actual fun gnuGetLibcVersion(): ConstPtr =
    ConstPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGnuGetLibcVersion())

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp(actions.rawAddress, path.rawAddress)

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp(actions.rawAddress, fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr, from: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp(actions.rawAddress, from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr, tcfd: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp(actions.rawAddress, tcfd)

public actual fun getmntentR(stream: MutPtr, mntbuf: MutPtr, buf: MutPtr, buflen: CInt): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuGetmntentR(stream.rawAddress, mntbuf.rawAddress, buf.rawAddress, buflen))

public actual fun execveat(dirfd: CInt, pathname: ConstPtr, argv: ConstPtr, envp: ConstPtr, flags: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuExecveat(dirfd, pathname.rawAddress, argv.rawAddress, envp.rawAddress, flags)

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuCloseRange(first.toInt(), last.toInt(), flags)

public actual fun mqNotify(mqdes: MqdT, sevp: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuMqNotify(mqdes.toLong(), sevp.rawAddress)

public actual fun epollPwait2(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuEpollPwait2(epfd, events.rawAddress, maxevents, timeout.rawAddress, sigmask.rawAddress)

public actual fun mempcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuMempcpy(dest.rawAddress, src.rawAddress, n.toLong()))

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    UnixLinuxlikeLinuxGnuJniBridge.libcUnixLinuxlikeLinuxGnuTgkill(tgid, tid, sig)
