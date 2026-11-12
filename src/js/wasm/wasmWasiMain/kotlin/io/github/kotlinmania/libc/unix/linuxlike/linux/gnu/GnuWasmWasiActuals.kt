@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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

// The host must provide the C companion wrapper exports in import module libc.
public actual fun fgetspentR(fp: MutPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuFgetspentR")

public actual fun sgetspentR(s: ConstPtr, spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuSgetspentR")

public actual fun getspentR(spbuf: MutPtr, buf: MutPtr, buflen: SizeT, spbufp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetspentR")

public actual fun qsortR(base: MutPtr, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuQsortR")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuSendmmsg")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuRecvmmsg")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetrlimit64")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuSetrlimit64")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetrlimit")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuSetrlimit")

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPrlimit")

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr, oldLimit: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPrlimit64")

public actual fun utmpname(file: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuUtmpname")

public actual fun utmpxname(file: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuUtmpxname")

public actual fun getutxent(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetutxent")

public actual fun getutxid(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetutxid")

public actual fun getutxline(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetutxline")

public actual fun pututxline(ut: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPututxline")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuSetutxent")
private external fun wasiLibcUnixLinuxlikeLinuxGnuSetutxent(): Unit

public actual fun setutxent(): Unit =
    wasiLibcUnixLinuxlikeLinuxGnuSetutxent()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuEndutxent")
private external fun wasiLibcUnixLinuxlikeLinuxGnuEndutxent(): Unit

public actual fun endutxent(): Unit =
    wasiLibcUnixLinuxlikeLinuxGnuEndutxent()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuGetpt")
private external fun wasiLibcUnixLinuxlikeLinuxGnuGetpt(): Int

public actual fun getpt(): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuGetpt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuMallopt")
private external fun wasiLibcUnixLinuxlikeLinuxGnuMallopt(param: Int, value: Int): Int

public actual fun mallopt(param: CInt, value: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuMallopt(param, value)

public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGettimeofday")

public actual fun getentropy(buf: MutPtr, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetentropy")

public actual fun getrandom(buf: MutPtr, buflen: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetrandom")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuGetauxval")
private external fun wasiLibcUnixLinuxlikeLinuxGnuGetauxval(type: Long): Long

public actual fun getauxval(type: CUlong): CUlong =
    wasiLibcUnixLinuxlikeLinuxGnuGetauxval(type.toLong()).toULong()

public actual fun adjtimex(buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuAdjtimex")

public actual fun ntpAdjtime(buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuNtpAdjtime")

public actual fun ntpGettime(buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuNtpGettime")

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuClockAdjtime")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuFanotifyMark")

public actual fun preadv2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPreadv2")

public actual fun pwritev2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPwritev2")

public actual fun preadv64v2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPreadv64v2")

public actual fun pwritev64v2(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPwritev64v2")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr, newdirfd: CInt, newpath: ConstPtr, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuRenameat2")

public actual fun explicitBzero(s: MutPtr, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuExplicitBzero")

public actual fun reallocarray(ptr: MutPtr, nmemb: SizeT, size: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuReallocarray")

public actual fun ctermid(s: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuCtermid")

public actual fun backtrace(buf: MutPtr, sz: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuBacktrace")

public actual fun backtraceSymbols(buffer: ConstPtr, len: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuBacktraceSymbols")

public actual fun backtraceSymbolsFd(buffer: ConstPtr, len: CInt, fd: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd")

public actual fun glob64(pattern: ConstPtr, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGlob64")

public actual fun globfree64(pglob: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGlobfree64")

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPtrace")

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr, cpusetsize: SizeT, cpuset: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp")

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr, cpusetsize: SizeT, cpuset: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuGetpriority")
private external fun wasiLibcUnixLinuxlikeLinuxGnuGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuGetpriority(which.toInt(), who.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuSetpriority")
private external fun wasiLibcUnixLinuxlikeLinuxGnuSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuSetpriority(which.toInt(), who.toInt(), prio)

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp")

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr, value: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadSigqueue")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadTryjoinNp")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr, abstime: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMallinfo")

public actual fun mallinfo2(): Mallinfo2 =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMallinfo2")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuMallocStats")
private external fun wasiLibcUnixLinuxlikeLinuxGnuMallocStats(): Unit

public actual fun mallocStats(): Unit =
    wasiLibcUnixLinuxlikeLinuxGnuMallocStats()

public actual fun mallocInfo(options: CInt, stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMallocInfo")

public actual fun mallocUsableSize(ptr: MutPtr): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMallocUsableSize")

public actual fun getpwentR(pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetpwentR")

public actual fun getgrentR(grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetgrentR")

public actual fun fgetpwentR(stream: MutPtr, pwd: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuFgetpwentR")

public actual fun fgetgrentR(stream: MutPtr, grp: MutPtr, buf: MutPtr, buflen: SizeT, result: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuFgetgrentR")

public actual fun putpwent(p: ConstPtr, stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPutpwent")

public actual fun putgrent(grp: ConstPtr, stream: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPutgrent")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuSethostid")
private external fun wasiLibcUnixLinuxlikeLinuxGnuSethostid(hostid: Long): Int

public actual fun sethostid(hostid: CLong): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuSethostid(hostid)

public actual fun memfdCreate(name: ConstPtr, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMemfdCreate")

public actual fun mlock2(addr: ConstPtr, len: SizeT, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMlock2")

public actual fun euidaccess(pathname: ConstPtr, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuEuidaccess")

public actual fun eaccess(pathname: ConstPtr, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuEaccess")

public actual fun asctimeR(tm: ConstPtr, buf: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuAsctimeR")

public actual fun ctimeR(timep: ConstPtr, buf: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuCtimeR")

public actual fun dirname(path: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuDirname")

public actual fun posixBasename(path: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPosixBasename")

public actual fun gnuBasename(path: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGnuBasename")

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr, flag: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuDlmopen")

public actual fun dlinfo(handle: MutPtr, request: CInt, info: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuDlinfo")

public actual fun dladdr1(addr: ConstPtr, info: MutPtr, extraInfo: MutPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuDladdr1")

public actual fun dlvsym(handle: MutPtr, symbol: ConstPtr, version: ConstPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuDlvsym")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuMallocTrim")
private external fun wasiLibcUnixLinuxlikeLinuxGnuMallocTrim(pad: Long): Int

public actual fun mallocTrim(pad: SizeT): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuMallocTrim(pad.toLong())

public actual fun gnuGetLibcRelease(): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGnuGetLibcRelease")

public actual fun gnuGetLibcVersion(): ConstPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGnuGetLibcVersion")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr, path: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr, from: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr, tcfd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp")

public actual fun getmntentR(stream: MutPtr, mntbuf: MutPtr, buf: MutPtr, buflen: CInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetmntentR")

public actual fun execveat(dirfd: CInt, pathname: ConstPtr, argv: ConstPtr, envp: ConstPtr, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuExecveat")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuCloseRange")
private external fun wasiLibcUnixLinuxlikeLinuxGnuCloseRange(first: Int, last: Int, flags: Int): Int

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuCloseRange(first.toInt(), last.toInt(), flags)

public actual fun mqNotify(mqdes: MqdT, sevp: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMqNotify")

public actual fun epollPwait2(epfd: CInt, events: MutPtr, maxevents: CInt, timeout: ConstPtr, sigmask: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuEpollPwait2")

public actual fun mempcpy(dest: MutPtr, src: ConstPtr, n: SizeT): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMempcpy")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuTgkill")
private external fun wasiLibcUnixLinuxlikeLinuxGnuTgkill(tgid: Int, tid: Int, sig: Int): Int

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuTgkill(tgid, tid, sig)
