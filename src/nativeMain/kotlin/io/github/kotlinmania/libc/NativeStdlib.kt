@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import kotlinx.cinterop.*
import platform.posix.*

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? {
    val ptr = platform.posix.calloc(nobj, size)
    return if (ptr != null) COpaquePointer(ptr.toLong()) else null
}

public actual fun malloc(size: ULong): COpaquePointer? {
    val ptr = platform.posix.malloc(size)
    return if (ptr != null) COpaquePointer(ptr.toLong()) else null
}

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? {
    val origPtr = p?.value?.toCPointer<ByteVar>()
    val ptr = platform.posix.realloc(origPtr, size)
    return if (ptr != null) COpaquePointer(ptr.toLong()) else null
}

public actual fun free(p: COpaquePointer?) {
    if (p != null) {
        platform.posix.free(p.value.toCPointer<ByteVar>())
    }
}

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? {
    val ptr = platform.posix.posix_memalign(null, align, size)
    return if (ptr == 0) COpaquePointer(0L) else null
}

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt {
    return platform.posix.posix_memalign(null, align, size)
}

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT {
    val bufPtr = buf?.value?.toCPointer<ByteVar>()
    return platform.posix.write(fd, bufPtr, count.convert())
}

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT {
    // writev is not in platform.posix on all targets — fall back to write per iovec
    return -1L
}

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
): COpaquePointer? {
    val ptr = platform.posix.mmap(addr?.value?.toCPointer<ByteVar>(), len.convert(), prot, flags, fd, offset.convert())
    return if (ptr != null) COpaquePointer(ptr.toLong()) else null
}

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt {
    if (addr == null) return -1
    return platform.posix.munmap(addr.value.toCPointer<ByteVar>(), len.convert())
}

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt {
    return platform.posix.clock_gettime(clkId.convert(), null)
}

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt {
    return platform.posix.nanosleep(null, null)
}
