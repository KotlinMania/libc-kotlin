@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import kotlinx.cinterop.*
import platform.posix.*

// Native actuals for Trusty.kt expect funs.
// Functions that are in platform.posix use it directly.
// Functions that cause "different bit widths" metadata errors (calloc, malloc,
// realloc, write — because platform.posix size_t/ssize_t differs from ULong/Long
// in the metadata cross-check) return stubs for now, matching JS/WASM behavior.
// Real FFI via cinterop (import libc.*) requires full Xcode for Apple targets.
// See build.gradle.kts TODO and references/libc-expect-actual-ffi-patterns.md.

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? = null

public actual fun malloc(size: ULong): COpaquePointer? = null

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? = null

public actual fun free(p: COpaquePointer?) {
    // free is in platform.posix and doesn't have the size_t bit-width issue
    if (p != null) {
        val ptr: CPointer<ByteVar>? = p.value.toCPointer()
        platform.posix.free(ptr)
    }
}

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? = null

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt = -1

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT = -1L

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT = -1L

public actual fun close(fd: CInt): CInt = platform.posix.close(fd)

public actual fun strlen(cs: String?): ULong {
    if (cs == null) return 0uL
    return cs.encodeToByteArray().size.toULong()
}

public actual fun getauxval(type: CULong): CULong = 0uL

public actual fun mmap(
    addr: COpaquePointer?,
    len: ULong,
    prot: CInt,
    flags: CInt,
    fd: CInt,
    offset: OffT
): COpaquePointer? = null

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt = -1

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt = -1

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt = -1