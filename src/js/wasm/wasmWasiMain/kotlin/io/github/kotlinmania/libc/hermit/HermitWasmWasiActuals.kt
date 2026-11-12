@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.hermit

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun alloc(size: ULong, align: ULong): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitAlloc")

public actual fun allocZeroed(size: ULong, align: ULong): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitAllocZeroed")

public actual fun realloc(ptr: MutPtr<UByte>, size: ULong, align: ULong, newSize: ULong): MutPtr<UByte> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitRealloc")

public actual fun dealloc(ptr: MutPtr<UByte>, size: ULong, align: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitDealloc")

@kotlin.wasm.WasmImport("libc", "libcHermitExit")
private external fun wasiLibcHermitExit(status: Int): Unit

public actual fun exit(status: Int): Nothing {
    wasiLibcHermitExit(status)
    error("C noreturn function libcHermitExit returned")
}

@kotlin.wasm.WasmImport("libc", "libcHermitAbort")
private external fun wasiLibcHermitAbort(): Unit

public actual fun abort(): Nothing {
    wasiLibcHermitAbort()
    error("C noreturn function libcHermitAbort returned")
}

@kotlin.wasm.WasmImport("libc", "libcHermitErrno")
private external fun wasiLibcHermitErrno(): Int

public actual fun errno(): Int =
    wasiLibcHermitErrno().toInt()

public actual fun clockGettime(clockid: ClockidT, tp: MutPtr<Timespec>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitClockGettime")

public actual fun nanosleep(req: ConstPtr<Timespec>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitNanosleep")

@kotlin.wasm.WasmImport("libc", "libcHermitAvailableParallelism")
private external fun wasiLibcHermitAvailableParallelism(): Long

public actual fun availableParallelism(): ULong =
    wasiLibcHermitAvailableParallelism().toULong()

public actual fun futexWait(address: MutPtr<UInt>, expected: UInt, timeout: ConstPtr<Timespec>, flags: UInt): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitFutexWait")

public actual fun futexWake(address: MutPtr<UInt>, count: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitFutexWake")

public actual fun stat(path: ConstPtr<CChar>, stat: MutPtr<Stat>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitStat")

public actual fun fstat(fd: Int, stat: MutPtr<Stat>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitFstat")

public actual fun lstat(path: ConstPtr<CChar>, stat: MutPtr<Stat>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitLstat")

public actual fun open(path: ConstPtr<CChar>, flags: Int, mode: ModeT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitOpen")

public actual fun unlink(path: ConstPtr<CChar>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitUnlink")

public actual fun mkdir(path: ConstPtr<CChar>, mode: ModeT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitMkdir")

public actual fun rmdir(path: ConstPtr<CChar>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitRmdir")

public actual fun read(fd: Int, buf: MutPtr<UByte>, len: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitRead")

public actual fun write(fd: Int, buf: ConstPtr<UByte>, len: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitWrite")

public actual fun readv(fd: Int, iov: ConstPtr<Iovec>, iovcnt: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitReadv")

public actual fun writev(fd: Int, iov: ConstPtr<Iovec>, iovcnt: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitWritev")

@kotlin.wasm.WasmImport("libc", "libcHermitClose")
private external fun wasiLibcHermitClose(fd: Int): Int

public actual fun close(fd: Int): Int =
    wasiLibcHermitClose(fd).toInt()

@kotlin.wasm.WasmImport("libc", "libcHermitDup")
private external fun wasiLibcHermitDup(fd: Int): Int

public actual fun dup(fd: Int): Int =
    wasiLibcHermitDup(fd).toInt()

@kotlin.wasm.WasmImport("libc", "libcHermitFcntl")
private external fun wasiLibcHermitFcntl(fd: Int, cmd: Int, arg: Int): Int

public actual fun fcntl(fd: Int, cmd: Int, arg: Int): Int =
    wasiLibcHermitFcntl(fd, cmd, arg).toInt()

public actual fun getdents64(fd: Int, dirp: MutPtr<Dirent64>, count: ULong): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitGetdents64")

public actual fun getaddrinfo(nodename: ConstPtr<CChar>, servname: ConstPtr<CChar>, hints: ConstPtr<Addrinfo>, res: MutPtr<MutPtr<Addrinfo>>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitGetaddrinfo")

public actual fun freeaddrinfo(ai: MutPtr<Addrinfo>): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitFreeaddrinfo")

@kotlin.wasm.WasmImport("libc", "libcHermitSocket")
private external fun wasiLibcHermitSocket(domain: Int, ty: Int, protocol: Int): Int

public actual fun socket(domain: Int, ty: Int, protocol: Int): Int =
    wasiLibcHermitSocket(domain, ty, protocol).toInt()

public actual fun bind(sockfd: Int, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitBind")

@kotlin.wasm.WasmImport("libc", "libcHermitListen")
private external fun wasiLibcHermitListen(sockfd: Int, backlog: Int): Int

public actual fun listen(sockfd: Int, backlog: Int): Int =
    wasiLibcHermitListen(sockfd, backlog).toInt()

public actual fun accept(sockfd: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitAccept")

public actual fun connect(sockfd: Int, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitConnect")

public actual fun recv(sockfd: Int, buf: MutPtr<UByte>, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitRecv")

public actual fun recvfrom(sockfd: Int, buf: MutPtr<CVoid>, len: ULong, flags: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitRecvfrom")

public actual fun send(sockfd: Int, buf: ConstPtr<CVoid>, len: ULong, flags: Int): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitSend")

public actual fun sendto(sockfd: Int, buf: ConstPtr<CVoid>, len: ULong, flags: Int, to: ConstPtr<Sockaddr>, tolen: SocklenT): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitSendto")

public actual fun getpeername(sockfd: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitGetpeername")

public actual fun getsockname(sockfd: Int, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitGetsockname")

public actual fun getsockopt(sockfd: Int, level: Int, optname: Int, optval: MutPtr<CVoid>, optlen: MutPtr<SocklenT>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitGetsockopt")

public actual fun setsockopt(sockfd: Int, level: Int, optname: Int, optval: ConstPtr<CVoid>, optlen: SocklenT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitSetsockopt")

public actual fun ioctl(sockfd: Int, cmd: Int, argp: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitIoctl")

@kotlin.wasm.WasmImport("libc", "libcHermitShutdown")
private external fun wasiLibcHermitShutdown(sockfd: Int, how: Int): Int

public actual fun shutdown(sockfd: Int, how: Int): Int =
    wasiLibcHermitShutdown(sockfd, how).toInt()

@kotlin.wasm.WasmImport("libc", "libcHermitEventfd")
private external fun wasiLibcHermitEventfd(initval: Long, flags: Int): Int

public actual fun eventfd(initval: ULong, flags: Short): Int =
    wasiLibcHermitEventfd(initval.toLong(), flags.toInt()).toInt()

public actual fun poll(fds: MutPtr<Pollfd>, nfds: NfdsT, timeout: Int): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcHermitPoll")
