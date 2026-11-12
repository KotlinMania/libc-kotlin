@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun fgetspentR(fp: MutPtr<FILE>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    libcUnixLinuxlikeLinuxGnuFgetspentR(fp.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun sgetspentR(s: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    libcUnixLinuxlikeLinuxGnuSgetspentR(s.rawAddress.toCPointer<ByteVar>(), spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun getspentR(spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    libcUnixLinuxlikeLinuxGnuGetspentR(spbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, spbufp.rawAddress.toCPointer<ByteVar>())

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    libcUnixLinuxlikeLinuxGnuQsortR(base.rawAddress.toCPointer<ByteVar>(), num, size, 0L.toCPointer<ByteVar>(), arg.rawAddress.toCPointer<ByteVar>())
}

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuSendmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags)

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    libcUnixLinuxlikeLinuxGnuRecvmmsg(sockfd, msgvec.rawAddress.toCPointer<ByteVar>(), vlen, flags, timeout.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    libcUnixLinuxlikeLinuxGnuGetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    libcUnixLinuxlikeLinuxGnuSetrlimit64(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    libcUnixLinuxlikeLinuxGnuGetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    libcUnixLinuxlikeLinuxGnuSetrlimit(resource, rlim.rawAddress.toCPointer<ByteVar>())

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    libcUnixLinuxlikeLinuxGnuPrlimit(pid, resource, newLimit.rawAddress.toCPointer<ByteVar>(), oldLimit.rawAddress.toCPointer<ByteVar>())

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt =
    libcUnixLinuxlikeLinuxGnuPrlimit64(pid, resource, newLimit.rawAddress.toCPointer<ByteVar>(), oldLimit.rawAddress.toCPointer<ByteVar>())

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeLinuxGnuUtmpname(file.rawAddress.toCPointer<ByteVar>())

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeLinuxGnuUtmpxname(file.rawAddress.toCPointer<ByteVar>())

public actual fun getutxent(): MutPtr<Utmpx> =
    MutPtr(libcUnixLinuxlikeLinuxGnuGetutxent()?.toLong() ?: 0L)

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixLinuxlikeLinuxGnuGetutxid(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    MutPtr(libcUnixLinuxlikeLinuxGnuGetutxline(ut.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
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

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    libcUnixLinuxlikeLinuxGnuGettimeofday(tp.rawAddress.toCPointer<ByteVar>(), tz.rawAddress.toCPointer<ByteVar>())

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    libcUnixLinuxlikeLinuxGnuGetentropy(buf.rawAddress.toCPointer<ByteVar>(), buflen)

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    libcUnixLinuxlikeLinuxGnuGetrandom(buf.rawAddress.toCPointer<ByteVar>(), buflen, flags)

public actual fun getauxval(type: CUlong): CUlong =
    libcUnixLinuxlikeLinuxGnuGetauxval(type)

public actual fun adjtimex(buf: MutPtr<Timex>): CInt =
    libcUnixLinuxlikeLinuxGnuAdjtimex(buf.rawAddress.toCPointer<ByteVar>())

public actual fun ntpAdjtime(buf: MutPtr<Timex>): CInt =
    libcUnixLinuxlikeLinuxGnuNtpAdjtime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt =
    libcUnixLinuxlikeLinuxGnuNtpGettime(buf.rawAddress.toCPointer<ByteVar>())

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr<Timex>): CInt =
    libcUnixLinuxlikeLinuxGnuClockAdjtime(clkId, buf.rawAddress.toCPointer<ByteVar>())

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeLinuxGnuFanotifyMark(fd, flags, mask, dirfd, path.rawAddress.toCPointer<ByteVar>())

public actual fun preadv2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    libcUnixLinuxlikeLinuxGnuPreadv2(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    libcUnixLinuxlikeLinuxGnuPwritev2(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun preadv64v2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    libcUnixLinuxlikeLinuxGnuPreadv64v2(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun pwritev64v2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    libcUnixLinuxlikeLinuxGnuPwritev64v2(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt, offset, flags)

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    libcUnixLinuxlikeLinuxGnuRenameat2(olddirfd, oldpath.rawAddress.toCPointer<ByteVar>(), newdirfd, newpath.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT) {
    libcUnixLinuxlikeLinuxGnuExplicitBzero(s.rawAddress.toCPointer<ByteVar>(), len)
}

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixLinuxlikeLinuxGnuReallocarray(ptr.rawAddress.toCPointer<ByteVar>(), nmemb, size)?.toLong() ?: 0L)

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeLinuxGnuCtermid(s.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun backtrace(buf: MutPtr<MutPtr<CVoid>>, sz: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuBacktrace(buf.rawAddress.toCPointer<ByteVar>(), sz)

public actual fun backtraceSymbols(buffer: ConstPtr<MutPtr<CVoid>>, len: CInt): MutPtr<MutPtr<CChar>> =
    MutPtr(libcUnixLinuxlikeLinuxGnuBacktraceSymbols(buffer.rawAddress.toCPointer<ByteVar>(), len)?.toLong() ?: 0L)

public actual fun backtraceSymbolsFd(buffer: ConstPtr<MutPtr<CVoid>>, len: CInt, fd: CInt) {
    libcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd(buffer.rawAddress.toCPointer<ByteVar>(), len, fd)
}

public actual fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt =
    libcUnixLinuxlikeLinuxGnuGlob64(pattern.rawAddress.toCPointer<ByteVar>(), flags, 0L.toCPointer<ByteVar>(), pglob.rawAddress.toCPointer<ByteVar>())

public actual fun globfree64(pglob: MutPtr<Glob64T>) {
    libcUnixLinuxlikeLinuxGnuGlobfree64(pglob.rawAddress.toCPointer<ByteVar>())
}

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    libcUnixLinuxlikeLinuxGnuPtrace(request, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp(attr.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp(attr.rawAddress.toCPointer<ByteVar>(), cpusetsize, cpuset.rawAddress.toCPointer<ByteVar>())

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    libcUnixLinuxlikeLinuxGnuGetpriority(which, who)

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuSetpriority(which, who, prio)

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp(attr.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp(attr.rawAddress.toCPointer<ByteVar>(), value)

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    0

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadTryjoinNp(thread.toLong().toCPointer<ByteVar>(), retval.rawAddress.toCPointer<ByteVar>())

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    libcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp(thread.toLong().toCPointer<ByteVar>(), retval.rawAddress.toCPointer<ByteVar>(), abstime.rawAddress.toCPointer<ByteVar>())

public actual fun mallinfo(): Mallinfo =
    Mallinfo()

public actual fun mallinfo2(): Mallinfo2 =
    Mallinfo2()

public actual fun mallocStats() {
    libcUnixLinuxlikeLinuxGnuMallocStats()
}

public actual fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt =
    libcUnixLinuxlikeLinuxGnuMallocInfo(options, stream.rawAddress.toCPointer<ByteVar>())

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    libcUnixLinuxlikeLinuxGnuMallocUsableSize(ptr.rawAddress.toCPointer<ByteVar>())

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixLinuxlikeLinuxGnuGetpwentR(pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixLinuxlikeLinuxGnuGetgrentR(grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fgetpwentR(stream: MutPtr<FILE>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    libcUnixLinuxlikeLinuxGnuFgetpwentR(stream.rawAddress.toCPointer<ByteVar>(), pwd.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun fgetgrentR(stream: MutPtr<FILE>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    libcUnixLinuxlikeLinuxGnuFgetgrentR(stream.rawAddress.toCPointer<ByteVar>(), grp.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen, result.rawAddress.toCPointer<ByteVar>())

public actual fun putpwent(p: ConstPtr<Passwd>, stream: MutPtr<FILE>): CInt =
    libcUnixLinuxlikeLinuxGnuPutpwent(p.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun putgrent(grp: ConstPtr<Group>, stream: MutPtr<FILE>): CInt =
    libcUnixLinuxlikeLinuxGnuPutgrent(grp.rawAddress.toCPointer<ByteVar>(), stream.rawAddress.toCPointer<ByteVar>())

public actual fun sethostid(hostid: CLong): CInt =
    libcUnixLinuxlikeLinuxGnuSethostid(hostid)

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    libcUnixLinuxlikeLinuxGnuMemfdCreate(name.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CUint): CInt =
    libcUnixLinuxlikeLinuxGnuMlock2(addr.rawAddress.toCPointer<ByteVar>(), len, flags)

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuEuidaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuEaccess(pathname.rawAddress.toCPointer<ByteVar>(), mode)

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeLinuxGnuAsctimeR(tm.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeLinuxGnuCtimeR(timep.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeLinuxGnuDirname(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun posixBasename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeLinuxGnuPosixBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun gnuBasename(path: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(libcUnixLinuxlikeLinuxGnuGnuBasename(path.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    MutPtr(libcUnixLinuxlikeLinuxGnuDlmopen(lmid, filename.rawAddress.toCPointer<ByteVar>(), flag)?.toLong() ?: 0L)

public actual fun dlinfo(handle: MutPtr<CVoid>, request: CInt, info: MutPtr<CVoid>): CInt =
    libcUnixLinuxlikeLinuxGnuDlinfo(handle.rawAddress.toCPointer<ByteVar>(), request, info.rawAddress.toCPointer<ByteVar>())

public actual fun dladdr1(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>, extraInfo: MutPtr<MutPtr<CVoid>>, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuDladdr1(addr.rawAddress.toCPointer<ByteVar>(), info.rawAddress.toCPointer<ByteVar>(), extraInfo.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    MutPtr(libcUnixLinuxlikeLinuxGnuDlvsym(handle.rawAddress.toCPointer<ByteVar>(), symbol.rawAddress.toCPointer<ByteVar>(), version.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun mallocTrim(pad: SizeT): CInt =
    libcUnixLinuxlikeLinuxGnuMallocTrim(pad)

public actual fun gnuGetLibcRelease(): ConstPtr<CChar> =
    ConstPtr(libcUnixLinuxlikeLinuxGnuGnuGetLibcRelease()?.toLong() ?: 0L)

public actual fun gnuGetLibcVersion(): ConstPtr<CChar> =
    ConstPtr(libcUnixLinuxlikeLinuxGnuGnuGetLibcVersion()?.toLong() ?: 0L)

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp(actions.rawAddress.toCPointer<ByteVar>(), path.rawAddress.toCPointer<ByteVar>())

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp(actions.rawAddress.toCPointer<ByteVar>(), fd)

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr<PosixSpawnFileActionsT>, from: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp(actions.rawAddress.toCPointer<ByteVar>(), from)

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr<PosixSpawnFileActionsT>, tcfd: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp(actions.rawAddress.toCPointer<ByteVar>(), tcfd)

public actual fun getmntentR(stream: MutPtr<FILE>, mntbuf: MutPtr<Mntent>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Mntent> =
    MutPtr(libcUnixLinuxlikeLinuxGnuGetmntentR(stream.rawAddress.toCPointer<ByteVar>(), mntbuf.rawAddress.toCPointer<ByteVar>(), buf.rawAddress.toCPointer<ByteVar>(), buflen)?.toLong() ?: 0L)

public actual fun execveat(dirfd: CInt, pathname: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuExecveat(dirfd, pathname.rawAddress.toCPointer<ByteVar>(), argv.rawAddress.toCPointer<ByteVar>(), envp.rawAddress.toCPointer<ByteVar>(), flags)

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuCloseRange(first, last, flags)

public actual fun mqNotify(mqdes: MqdT, sevp: ConstPtr<Sigevent>): CInt =
    libcUnixLinuxlikeLinuxGnuMqNotify(mqdes.toLong().toCPointer<ByteVar>(), sevp.rawAddress.toCPointer<ByteVar>())

public actual fun epollPwait2(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    libcUnixLinuxlikeLinuxGnuEpollPwait2(epfd, events.rawAddress.toCPointer<ByteVar>(), maxevents, timeout.rawAddress.toCPointer<ByteVar>(), sigmask.rawAddress.toCPointer<ByteVar>())

public actual fun mempcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    MutPtr(libcUnixLinuxlikeLinuxGnuMempcpy(dest.rawAddress.toCPointer<ByteVar>(), src.rawAddress.toCPointer<ByteVar>(), n)?.toLong() ?: 0L)

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    libcUnixLinuxlikeLinuxGnuTgkill(tgid, tid, sig)
