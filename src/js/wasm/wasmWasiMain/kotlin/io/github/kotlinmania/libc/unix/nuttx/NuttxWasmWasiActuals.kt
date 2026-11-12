@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.DIR
import io.github.kotlinmania.libc.unix.Timespec
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun errno(): MutPtr<CInt> =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxErrno")

public actual fun bind(sockfd: Int, addr: ConstPtr<Sockaddr>, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxBind")

public actual fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxIoctl")

public actual fun dirfd(dirp: MutPtr<DIR>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxDirfd")

public actual fun recvfrom(sockfd: Int, buf: MutPtr<CVoid>, len: ULong, flags: Int, srcAddr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxRecvfrom")

public actual fun pthreadCreate(thread: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr<CVoid>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxPthreadCreate")

public actual fun clockGettime(clockid: ClockidT, tp: MutPtr<Timespec>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxClockGettime")

public actual fun futimens(fd: Int, times: ConstPtr<Timespec>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxFutimens")

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxPthreadCondattrSetclock")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr<CChar>): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxPthreadSetnameNp")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr<CChar>, len: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxPthreadGetnameNp")

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxGetrandom")

@kotlin.wasm.WasmImport("libc", "libcUnixNuttxArc4random")
private external fun wasiLibcUnixNuttxArc4random(): Int

public actual fun arc4random(): UInt =
    wasiLibcUnixNuttxArc4random().toUInt()

public actual fun arc4randomBuf(bytes: MutPtr<CVoid>, nbytes: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxArc4randomBuf")
