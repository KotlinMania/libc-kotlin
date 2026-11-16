@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// The host must provide the C companion wrapper exports in import module libc.
public actual fun errno(): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxErrno")

public actual fun bind(sockfd: Int, addr: ConstPtr, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxBind")

public actual fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxIoctl")

public actual fun dirfd(dirp: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxDirfd")

public actual fun recvfrom(sockfd: Int, buf: MutPtr, len: ULong, flags: Int, srcAddr: MutPtr, addrlen: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxRecvfrom")

public actual fun pthreadCreate(thread: MutPtr, attr: ConstPtr, startRoutine: PthreadCreateStartRoutineCallback, arg: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxPthreadCreate")

public actual fun clockGettime(clockid: ClockidT, tp: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxClockGettime")

public actual fun futimens(fd: Int, times: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxFutimens")

public actual fun pthreadCondattrSetclock(attr: MutPtr, clockId: ClockidT): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxPthreadCondattrSetclock")

public actual fun pthreadSetnameNp(thread: PthreadT, name: ConstPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxPthreadSetnameNp")

public actual fun pthreadGetnameNp(thread: PthreadT, name: MutPtr, len: ULong): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxPthreadGetnameNp")

public actual fun getrandom(buf: MutPtr, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxGetrandom")

@kotlin.wasm.WasmImport("libc", "libcUnixNuttxArc4random")
private external fun wasiLibcUnixNuttxArc4random(): Int

public actual fun arc4random(): UInt =
    wasiLibcUnixNuttxArc4random().toUInt()

public actual fun arc4randomBuf(bytes: MutPtr, nbytes: ULong): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for libcUnixNuttxArc4randomBuf")
