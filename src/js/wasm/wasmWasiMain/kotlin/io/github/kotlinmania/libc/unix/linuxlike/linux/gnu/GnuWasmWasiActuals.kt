@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

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
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun fgetspentR(fp: MutPtr<FILE>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuFgetspentR")

public actual fun sgetspentR(s: ConstPtr<CChar>, spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuSgetspentR")

public actual fun getspentR(spbuf: MutPtr<Spwd>, buf: MutPtr<CChar>, buflen: SizeT, spbufp: MutPtr<MutPtr<Spwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetspentR")

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuQsortR")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuSendmmsg")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuRecvmmsg")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetrlimit64")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuSetrlimit64")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetrlimit")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuSetrlimit")

public actual fun prlimit(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr<Rlimit>, oldLimit: MutPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPrlimit")

public actual fun prlimit64(pid: PidT, resource: RlimitResourceT, newLimit: ConstPtr<Rlimit64>, oldLimit: MutPtr<Rlimit64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPrlimit64")

public actual fun utmpname(file: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuUtmpname")

public actual fun utmpxname(file: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuUtmpxname")

public actual fun getutxent(): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetutxent")

public actual fun getutxid(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetutxid")

public actual fun getutxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetutxline")

public actual fun pututxline(ut: ConstPtr<Utmpx>): MutPtr<Utmpx> =
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
    wasiLibcUnixLinuxlikeLinuxGnuGetpt().toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuMallopt")
private external fun wasiLibcUnixLinuxlikeLinuxGnuMallopt(param: Int, value: Int): Int

public actual fun mallopt(param: CInt, value: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuMallopt(param, value).toInt()

public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGettimeofday")

public actual fun getentropy(buf: MutPtr<CVoid>, buflen: SizeT): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetentropy")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetrandom")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuGetauxval")
private external fun wasiLibcUnixLinuxlikeLinuxGnuGetauxval(type: Long): Long

public actual fun getauxval(type: CUlong): CUlong =
    wasiLibcUnixLinuxlikeLinuxGnuGetauxval(type.toLong()).toULong()

public actual fun adjtimex(buf: MutPtr<Timex>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuAdjtimex")

public actual fun ntpAdjtime(buf: MutPtr<Timex>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuNtpAdjtime")

public actual fun ntpGettime(buf: MutPtr<Ntptimeval>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuNtpGettime")

public actual fun clockAdjtime(clkId: ClockidT, buf: MutPtr<Timex>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuClockAdjtime")

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuFanotifyMark")

public actual fun preadv2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPreadv2")

public actual fun pwritev2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: OffT, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPwritev2")

public actual fun preadv64v2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPreadv64v2")

public actual fun pwritev64v2(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T, flags: CInt): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPwritev64v2")

public actual fun renameat2(olddirfd: CInt, oldpath: ConstPtr<CChar>, newdirfd: CInt, newpath: ConstPtr<CChar>, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuRenameat2")

public actual fun explicitBzero(s: MutPtr<CVoid>, len: SizeT): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuExplicitBzero")

public actual fun reallocarray(ptr: MutPtr<CVoid>, nmemb: SizeT, size: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuReallocarray")

public actual fun ctermid(s: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuCtermid")

public actual fun backtrace(buf: MutPtr<MutPtr<CVoid>>, sz: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuBacktrace")

public actual fun backtraceSymbols(buffer: ConstPtr<MutPtr<CVoid>>, len: CInt): MutPtr<MutPtr<CChar>> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuBacktraceSymbols")

public actual fun backtraceSymbolsFd(buffer: ConstPtr<MutPtr<CVoid>>, len: CInt, fd: CInt): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuBacktraceSymbolsFd")

public actual fun glob64(pattern: ConstPtr<CChar>, flags: CInt, errfunc: Glob64ErrfuncCallback?, pglob: MutPtr<Glob64T>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGlob64")

public actual fun globfree64(pglob: MutPtr<Glob64T>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGlobfree64")

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPtrace")

public actual fun pthreadAttrGetaffinityNp(attr: ConstPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: MutPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadAttrGetaffinityNp")

public actual fun pthreadAttrSetaffinityNp(attr: MutPtr<PthreadAttrT>, cpusetsize: SizeT, cpuset: ConstPtr<CpuSetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadAttrSetaffinityNp")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuGetpriority")
private external fun wasiLibcUnixLinuxlikeLinuxGnuGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuGetpriority(which.toInt(), who.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuSetpriority")
private external fun wasiLibcUnixLinuxlikeLinuxGnuSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuSetpriority(which.toInt(), who.toInt(), prio).toInt()

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadRwlockattrGetkindNp")

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadRwlockattrSetkindNp")

public actual fun pthreadSigqueue(thread: PthreadT, sig: CInt, value: Sigval): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadSigqueue")

public actual fun pthreadTryjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadTryjoinNp")

public actual fun pthreadTimedjoinNp(thread: PthreadT, retval: MutPtr<MutPtr<CVoid>>, abstime: ConstPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPthreadTimedjoinNp")

public actual fun mallinfo(): Mallinfo =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMallinfo")

public actual fun mallinfo2(): Mallinfo2 =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMallinfo2")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuMallocStats")
private external fun wasiLibcUnixLinuxlikeLinuxGnuMallocStats(): Unit

public actual fun mallocStats(): Unit =
    wasiLibcUnixLinuxlikeLinuxGnuMallocStats()

public actual fun mallocInfo(options: CInt, stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMallocInfo")

public actual fun mallocUsableSize(ptr: MutPtr<CVoid>): SizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMallocUsableSize")

public actual fun getpwentR(pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetpwentR")

public actual fun getgrentR(grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetgrentR")

public actual fun fgetpwentR(stream: MutPtr<FILE>, pwd: MutPtr<Passwd>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Passwd>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuFgetpwentR")

public actual fun fgetgrentR(stream: MutPtr<FILE>, grp: MutPtr<Group>, buf: MutPtr<CChar>, buflen: SizeT, result: MutPtr<MutPtr<Group>>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuFgetgrentR")

public actual fun putpwent(p: ConstPtr<Passwd>, stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPutpwent")

public actual fun putgrent(grp: ConstPtr<Group>, stream: MutPtr<FILE>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPutgrent")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuSethostid")
private external fun wasiLibcUnixLinuxlikeLinuxGnuSethostid(hostid: Long): Int

public actual fun sethostid(hostid: CLong): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuSethostid(hostid).toInt()

public actual fun memfdCreate(name: ConstPtr<CChar>, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMemfdCreate")

public actual fun mlock2(addr: ConstPtr<CVoid>, len: SizeT, flags: CUint): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMlock2")

public actual fun euidaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuEuidaccess")

public actual fun eaccess(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuEaccess")

public actual fun asctimeR(tm: ConstPtr<Tm>, buf: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuAsctimeR")

public actual fun ctimeR(timep: ConstPtr<TimeT>, buf: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuCtimeR")

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuDirname")

public actual fun posixBasename(path: MutPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPosixBasename")

public actual fun gnuBasename(path: ConstPtr<CChar>): MutPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGnuBasename")

public actual fun dlmopen(lmid: LmidT, filename: ConstPtr<CChar>, flag: CInt): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuDlmopen")

public actual fun dlinfo(handle: MutPtr<CVoid>, request: CInt, info: MutPtr<CVoid>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuDlinfo")

public actual fun dladdr1(addr: ConstPtr<CVoid>, info: MutPtr<DlInfo>, extraInfo: MutPtr<MutPtr<CVoid>>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuDladdr1")

public actual fun dlvsym(handle: MutPtr<CVoid>, symbol: ConstPtr<CChar>, version: ConstPtr<CChar>): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuDlvsym")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuMallocTrim")
private external fun wasiLibcUnixLinuxlikeLinuxGnuMallocTrim(pad: Long): Int

public actual fun mallocTrim(pad: SizeT): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuMallocTrim(pad.toLong()).toInt()

public actual fun gnuGetLibcRelease(): ConstPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGnuGetLibcRelease")

public actual fun gnuGetLibcVersion(): ConstPtr<CChar> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGnuGetLibcVersion")

public actual fun posixSpawnFileActionsAddchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddchdirNp")

public actual fun posixSpawnFileActionsAddfchdirNp(actions: MutPtr<PosixSpawnFileActionsT>, fd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddfchdirNp")

public actual fun posixSpawnFileActionsAddclosefromNp(actions: MutPtr<PosixSpawnFileActionsT>, from: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddclosefromNp")

public actual fun posixSpawnFileActionsAddtcsetpgrpNp(actions: MutPtr<PosixSpawnFileActionsT>, tcfd: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuPosixSpawnFileActionsAddtcsetpgrpNp")

public actual fun getmntentR(stream: MutPtr<FILE>, mntbuf: MutPtr<Mntent>, buf: MutPtr<CChar>, buflen: CInt): MutPtr<Mntent> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuGetmntentR")

public actual fun execveat(dirfd: CInt, pathname: ConstPtr<CChar>, argv: ConstPtr<MutPtr<CChar>>, envp: ConstPtr<MutPtr<CChar>>, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuExecveat")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuCloseRange")
private external fun wasiLibcUnixLinuxlikeLinuxGnuCloseRange(first: Int, last: Int, flags: Int): Int

public actual fun closeRange(first: CUint, last: CUint, flags: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuCloseRange(first.toInt(), last.toInt(), flags).toInt()

public actual fun mqNotify(mqdes: MqdT, sevp: ConstPtr<Sigevent>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMqNotify")

public actual fun epollPwait2(epfd: CInt, events: MutPtr<EpollEvent>, maxevents: CInt, timeout: ConstPtr<Timespec>, sigmask: ConstPtr<SigsetT>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuEpollPwait2")

public actual fun mempcpy(dest: MutPtr<CVoid>, src: ConstPtr<CVoid>, n: SizeT): MutPtr<CVoid> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxGnuMempcpy")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxGnuTgkill")
private external fun wasiLibcUnixLinuxlikeLinuxGnuTgkill(tgid: Int, tid: Int, sig: Int): Int

public actual fun tgkill(tgid: PidT, tid: PidT, sig: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxGnuTgkill(tgid, tid, sig).toInt()
