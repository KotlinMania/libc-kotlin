@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.Iovec
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.libc.unix.Timeval
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.Mmsghdr
import io.github.kotlinmania.libc.unix.linuxlike.Rlimit64
import io.github.kotlinmania.libc.unix.linuxlike.Sockaddr
import io.github.kotlinmania.libc.unix.linuxlike.Timezone
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.PthreadRwlockattrT
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664.Termios
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun gettimeofday(tp: MutPtr<Timeval>, tz: MutPtr<Timezone>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcGettimeofday")

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr<PthreadRwlockattrT>, value: MutPtr<CInt>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp")

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr<PthreadRwlockattrT>, value: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp")

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcPtrace")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcSendmmsg")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: MutPtr<Timespec>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcRecvmmsg")

public actual fun openpty(amaster: MutPtr<CInt>, aslave: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcOpenpty")

public actual fun forkpty(amaster: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcForkpty")

public actual fun getnameinfo(sa: ConstPtr<Sockaddr>, salen: SocklenT, host: MutPtr<CChar>, hostlen: SocklenT, serv: MutPtr<CChar>, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcGetnameinfo")

public actual fun pwritev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcPwritev")

public actual fun preadv(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcPreadv")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxUclibcSethostid")
private external fun wasiLibcUnixLinuxlikeLinuxUclibcSethostid(hostid: Long): Int

public actual fun sethostid(hostid: CLong): CInt =
    wasiLibcUnixLinuxlikeLinuxUclibcSethostid(hostid).toInt()

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr<CChar>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcFanotifyMark")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr<Rlimit64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcGetrlimit64")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr<Rlimit64>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcSetrlimit64")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcGetrlimit")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr<Rlimit>): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcSetrlimit")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxUclibcGetpriority")
private external fun wasiLibcUnixLinuxlikeLinuxUclibcGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    wasiLibcUnixLinuxlikeLinuxUclibcGetpriority(which.toInt(), who.toInt()).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxUclibcSetpriority")
private external fun wasiLibcUnixLinuxlikeLinuxUclibcSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxUclibcSetpriority(which.toInt(), who.toInt(), prio).toInt()

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxUclibcGetauxval")
private external fun wasiLibcUnixLinuxlikeLinuxUclibcGetauxval(type: Long): Long

public actual fun getauxval(type: CUlong): CUlong =
    wasiLibcUnixLinuxlikeLinuxUclibcGetauxval(type.toLong()).toULong()
