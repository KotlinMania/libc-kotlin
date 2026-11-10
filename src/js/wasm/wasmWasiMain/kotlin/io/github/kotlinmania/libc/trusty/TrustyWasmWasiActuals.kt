@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun malloc(size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun free(p: COpaquePointer?): Unit =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun strlen(cs: String?): SizeT =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getauxval(type: CUlong): CUlong =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
