@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

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
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuAdjtimex
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuAsctimeR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuBacktrace
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuBacktraceSymbols
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuClockAdjtime
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuCloseRange
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuCtermid
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuCtimeR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuDirname
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuDladdr1
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuDlinfo
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuDlmopen
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuDlvsym
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuEaccess
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuEndutxent
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuEpollPwait2
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuEuidaccess
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuExecveat
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuExplicitBzero
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuFanotifyMark
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuFgetgrentR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuFgetpwentR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuFgetspentR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetauxval
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetentropy
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetgrentR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetmntentR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetpriority
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetpt
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetpwentR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetrandom
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetrlimit64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetspentR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGettimeofday
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetutxent
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetutxid
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGetutxline
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGlob64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGlobfree64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGnuBasename
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGnuGetLibcRelease
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuGnuGetLibcVersion
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuMallocInfo
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuMallocStats
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuMallocTrim
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuMallocUsableSize
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuMallopt
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuMemfdCreate
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuMempcpy
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuMlock2
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuMqNotify
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuNtpAdjtime
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuNtpGettime
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPosixBasename
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPreadv2
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPreadv64v2
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPrlimit64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPthreadTryjoinNp
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPtrace
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPutgrent
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPutpwent
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPututxline
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPwritev2
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuPwritev64v2
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuQsortR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuReallocarray
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuRecvmmsg
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuRenameat2
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuSendmmsg
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuSethostid
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuSetpriority
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuSetrlimit
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuSetrlimit64
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuSetutxent
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuSgetspentR
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuTgkill
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuUtmpname
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.cinterop.libcUnixLinuxlikeLinuxGnuUtmpxname
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fgetspentR(fp: MutPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuFgetspentR(fp.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun sgetspentR(s: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuSgetspentR(s.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun getspentR(spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuGetspentR(spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr) {
    libcUnixLinuxlikeLinuxGnuQsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuSendmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuRecvmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuGetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuSetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuPrlimit(pid, resource, newLimit.rawAddress.toCPointer<ByteVar>(), oldLimit.rawAddress.toCPointer<ByteVar>())

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuPrlimit64(pid, resource, newLimit.rawAddress.toCPointer<ByteVar>(), oldLimit.rawAddress.toCPointer<ByteVar>())

public actual fun utmpname(file: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuUtmpname(file.rawAddress.toCPointer<ByteVar>())

public actual fun utmpxname(file: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun getutxent(): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(ut: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuPututxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setutxent() {
    libcUnixLinuxlikeLinuxGnuSetutxent()
}

public actual fun endutxent() {
    libcUnixLinuxlikeLinuxGnuEndutxent()
}

public actual fun getpt(): CInt =
    libcUnixLinuxlikeLinuxGnuGetpt()

public actual fun mallopt(param: CInt, value: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuMallopt(param, value)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    libcUnixLinuxlikeLinuxGnuGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeLinuxGnuGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun getauxval(type: CUlong): CUlong =
    libcUnixLinuxlikeLinuxGnuGetauxval(type)

public actual fun adjtimex(buf: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuAdjtimex(buf.rawAddress.toCPointer<ByteVar>())

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuNtpAdjtime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuNtpGettime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuClockAdjtime(clkId, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuFanotifyMark(fd, flags, mask, dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun preadv2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    libcUnixLinuxlikeLinuxGnuPreadv2(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    libcUnixLinuxlikeLinuxGnuPwritev2(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun preadv64v2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    libcUnixLinuxlikeLinuxGnuPreadv64v2(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev64v2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    libcUnixLinuxlikeLinuxGnuPwritev64v2(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CUint): CInt =
    libcUnixLinuxlikeLinuxGnuRenameat2(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun explicitBzero(s: MutPtr, len: SizeT) {
    libcUnixLinuxlikeLinuxGnuExplicitBzero(s.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuReallocarray(ptr.rawAddress.toCPointer<ByteVar>(), nmemb, size)?.toLong() ?: 0L)

public actual fun ctermid(s: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuCtermid(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun backtrace(buf: MutPtr, sz: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuBacktrace(buf.rawAddress.toCPointer<ByteVar>(), sz)

public actual fun backtraceSymbols(buffer: ConstPtr, len: CInt): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuBacktraceSymbols(buffer.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun backtraceSymbolsFd(buffer: ConstPtr, len: CInt, fd: CInt) {
    libcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd(buffer.rawAddress.toCPointer<ByteVar>(), len, fd)
}

public actual fun glob64(pattern: ConstPtr, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuGlob64(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree64(pglob: MutPtr) {
    libcUnixLinuxlikeLinuxGnuGlobfree64(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    libcUnixLinuxlikeLinuxGnuPtrace(request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp(attr.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp(attr.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    libcUnixLinuxlikeLinuxGnuGetpriority(which, who)

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuSetpriority(which, who, prio)

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr, value: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr, value: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadTryjoinNp(thread.toLong().toCPointer<ByteVar>(), retval.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp(thread.toLong().toCPointer<ByteVar>(), retval.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallinfo2(): Mallinfo2 =
    Mallinfo2()

public actual fun mallocStats() {
    libcUnixLinuxlikeLinuxGnuMallocStats()
}

public actual fun mallocInfo(options: CInt, stream: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuMallocInfo(options, stream.rawAddress.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    libcUnixLinuxlikeLinuxGnuMallocUsableSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuGetpwentR(pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuGetgrentR(grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fgetpwentR(stream: MutPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuFgetpwentR(stream.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fgetgrentR(stream: MutPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuFgetgrentR(stream.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun putpwent(p: ConstPtr, stream: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuPutpwent(p.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun putgrent(grp: ConstPtr, stream: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuPutgrent(grp.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun sethostid(hostid: CLong): CInt =
    libcUnixLinuxlikeLinuxGnuSethostid(hostid)

public actual fun memfdCreate(name: ConstPtr, flags: CUint): CInt =
    libcUnixLinuxlikeLinuxGnuMemfdCreate(name.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mlock2(addr: ConstPtr, len: SizeT, flags: CUint): CInt =
    libcUnixLinuxlikeLinuxGnuMlock2(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuEuidaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuEaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuAsctimeR(tm.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuCtimeR(timep.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dirname(path: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun posixBasename(path: MutPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuPosixBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gnuBasename(path: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuGnuBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr, flag: CInt): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuDlmopen(lmid, filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlinfo(handle: MutPtr, request: CInt, info: MutPtr): CInt =
    libcUnixLinuxlikeLinuxGnuDlinfo(handle.rawAddress.toCPointer<ByteVar>(), request, info.rawAddress.toCPointer<ByteVar>())

public actual fun dladdr1(addr: ConstPtr, info: MutPtr, extraInfo: MutPtr, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuDladdr1(addr.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), extraInfo.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuDlvsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>(), version.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mallocTrim(pad: SizeT): CInt =
    libcUnixLinuxlikeLinuxGnuMallocTrim(pad)

public actual fun gnuGetLibcRelease(): ConstPtr =
    ConstPtr(libcUnixLinuxlikeLinuxGnuGnuGetLibcRelease()?.toLong() ?: 0L)

public actual fun gnuGetLibcVersion(): ConstPtr =
    ConstPtr(libcUnixLinuxlikeLinuxGnuGnuGetLibcVersion()?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr, from: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp(actions.rawAddress.toCPointer<ByteVar>(), from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr, tcfd: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp(actions.rawAddress.toCPointer<ByteVar>(), tcfd)

public actual fun getmntentR(stream: MutPtr, mntbuf: MutPtr, buf: MutPtr, buflen: CInt): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuGetmntentR(stream.rawAddress.toCPointer<ByteVar>(), mntbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun execveat(dirfd: CInt, pathname: ConstPtr, argv: ConstPtr, envp: ConstPtr, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuExecveat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuCloseRange(first, last, flags)

public actual fun mqNotify(mqdes: MqdT, sevp: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuMqNotify(mqdes.toLong().toCPointer<ByteVar>(), sevp.rawAddress.toCPointer<ByteVar>())

public actual fun epollPwait2(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    libcUnixLinuxlikeLinuxGnuEpollPwait2(epfd, events.rawAddress.toCPointer<ByteVar>(), maxevents, timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun mempcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    MutPtr(libcUnixLinuxlikeLinuxGnuMempcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuTgkill(tgid, tid, sig)
