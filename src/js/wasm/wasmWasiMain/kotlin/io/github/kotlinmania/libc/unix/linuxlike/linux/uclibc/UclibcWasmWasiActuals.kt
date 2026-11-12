@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.linuxlike.IdT
import io.github.kotlinmania.libc.unix.linuxlike.linux.Off64T
import io.github.kotlinmania.libc.unix.linuxlike.linux.SocklenT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun gettimeofday(tp: MutPtr, tz: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcGettimeofday")

public actual fun pthreadRwlockattrGetkindNp(attr: ConstPtr, value: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrGetkindNp")

public actual fun pthreadRwlockattrSetkindNp(attr: MutPtr, value: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcPthreadRwlockattrSetkindNp")

public actual fun ptrace(request: CUint, vararg variadicArgs: Long): CLong =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcPtrace")

public actual fun sendmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcSendmmsg")

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr, vlen: CUint, flags: CInt, timeout: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcRecvmmsg")

public actual fun openpty(amaster: MutPtr, aslave: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcOpenpty")

public actual fun forkpty(amaster: MutPtr, name: MutPtr, termp: MutPtr, winp: MutPtr): PidT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcForkpty")

public actual fun getnameinfo(sa: ConstPtr, salen: SocklenT, host: MutPtr, hostlen: SocklenT, serv: MutPtr, servlen: SocklenT, flags: CInt): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcGetnameinfo")

public actual fun pwritev(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcPwritev")

public actual fun preadv(fd: CInt, iov: ConstPtr, iovcnt: CInt, offset: Off64T): SsizeT =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcPreadv")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxUclibcSethostid")
private external fun wasiLibcUnixLinuxlikeLinuxUclibcSethostid(hostid: Long): Int

public actual fun sethostid(hostid: CLong): CInt =
    wasiLibcUnixLinuxlikeLinuxUclibcSethostid(hostid)

public actual fun fanotifyMark(fd: CInt, flags: CUint, mask: ULong, dirfd: CInt, path: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcFanotifyMark")

public actual fun getrlimit64(resource: RlimitResourceT, rlim: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcGetrlimit64")

public actual fun setrlimit64(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcSetrlimit64")

public actual fun getrlimit(resource: RlimitResourceT, rlim: MutPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcGetrlimit")

public actual fun setrlimit(resource: RlimitResourceT, rlim: ConstPtr): CInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixLinuxlikeLinuxUclibcSetrlimit")

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxUclibcGetpriority")
private external fun wasiLibcUnixLinuxlikeLinuxUclibcGetpriority(which: Int, who: Int): Int

public actual fun getpriority(which: PriorityWhichT, who: IdT): CInt =
    wasiLibcUnixLinuxlikeLinuxUclibcGetpriority(which.toInt(), who.toInt())

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxUclibcSetpriority")
private external fun wasiLibcUnixLinuxlikeLinuxUclibcSetpriority(which: Int, who: Int, prio: Int): Int

public actual fun setpriority(which: PriorityWhichT, who: IdT, prio: CInt): CInt =
    wasiLibcUnixLinuxlikeLinuxUclibcSetpriority(which.toInt(), who.toInt(), prio)

@kotlin.wasm.WasmImport("libc", "libcUnixLinuxlikeLinuxUclibcGetauxval")
private external fun wasiLibcUnixLinuxlikeLinuxUclibcGetauxval(type: Long): Long

public actual fun getauxval(type: CUlong): CUlong =
    wasiLibcUnixLinuxlikeLinuxUclibcGetauxval(type.toLong()).toULong()
