@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun malloc(size: SizeT): COpaquePointer? =
    null

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    null

public actual fun free(p: COpaquePointer?) {
}

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    null

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    0

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    0L

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    0L

public actual fun close(fd: CInt): CInt =
    0

public actual fun strlen(cs: String?): SizeT =
    0uL

public actual fun getauxval(type: CUlong): CUlong =
    0uL

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    null

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    0

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    0
