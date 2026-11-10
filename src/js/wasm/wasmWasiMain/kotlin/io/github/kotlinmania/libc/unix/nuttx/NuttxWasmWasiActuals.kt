@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.unix.DIR

public actual fun errno(): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun bind(sockfd: Int, addr: COpaquePointer?, addrlen: SocklenT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun ioctl(fd: Int, request: Int, vararg variadicArgs: Long): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun dirfd(dirp: DIR?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun recvfrom(sockfd: Int, buf: COpaquePointer?, len: ULong, flags: Int, srcAddr: COpaquePointer?, addrlen: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCreate(thread: COpaquePointer?, attr: COpaquePointer?, startRoutine: PthreadCreateStartRoutineCallback, arg: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGettime(clockid: ClockidT, tp: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun futimens(fd: Int, times: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadCondattrSetclock(attr: COpaquePointer?, clockId: ClockidT): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: ULong): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getrandom(buf: COpaquePointer?, buflen: ULong, flags: UInt): Long =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arc4random(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun arc4randomBuf(bytes: COpaquePointer?, nbytes: ULong): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
