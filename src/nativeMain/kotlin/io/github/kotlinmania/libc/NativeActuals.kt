@file:OptIn(ExperimentalForeignApi::class)
package io.github.kotlinmania.libc

import kotlinx.cinterop.*
import libc.*

// Trusty.kt actuals — delegating to real C library via cinterop

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    calloc(nobj, size)

public actual fun malloc(size: ULong): COpaquePointer? =
    malloc(size)

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    realloc(p, size)

public actual fun free(p: COpaquePointer?) {
    if (p != null) free(p)
}

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    memalign(align, size)

// posix_memalign not available in cinterop headers on Android — needs malloc.h
// public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt =
//     posix_memalign(memptr, align, size)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    write(fd, buf, count)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    writev(fd, iov, iovcnt)

public actual fun close(fd: CInt): CInt =
    close(fd)

public actual fun strlen(cs: String?): ULong =
    if (cs != null) strlen(cs) else 0uL

public actual fun getauxval(type: CULong): CULong =
    getauxval(type)

public actual fun mmap(
    addr: COpaquePointer?,
    len: ULong,
    prot: CInt,
    flags: CInt,
    fd: CInt,
    offset: OffT
): COpaquePointer? =
    mmap(addr, len, prot, flags, fd, offset)

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    munmap(addr, len)

// clock_gettime not resolving in cinterop — may need sys/time.h instead
// public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
//     clock_gettime(clkId, tp)

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    nanosleep(rqtp, rmtp)