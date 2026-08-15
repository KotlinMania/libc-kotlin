package io.github.kotlinmania.libc

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("libc calloc is not available on JVM target")

public actual fun malloc(size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("libc malloc is not available on JVM target")

public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("libc realloc is not available on JVM target")

public actual fun free(p: COpaquePointer?) {
    throw UnsupportedOperationException("libc free is not available on JVM target")
}

public actual fun memalign(align: ULong, size: ULong): COpaquePointer? =
    throw UnsupportedOperationException("libc memalign is not available on JVM target")

public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt =
    throw UnsupportedOperationException("libc posixMemalign is not available on JVM target")

public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT =
    throw UnsupportedOperationException("libc write is not available on JVM target")

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    throw UnsupportedOperationException("libc writev is not available on JVM target")

public actual fun close(fd: CInt): CInt =
    throw UnsupportedOperationException("libc close is not available on JVM target")

public actual fun strlen(cs: String?): ULong =
    cs?.encodeToByteArray()?.size?.toULong() ?: 0uL

public actual fun getauxval(type: CULong): CULong = 0uL

public actual fun mmap(
    addr: COpaquePointer?,
    len: ULong,
    prot: CInt,
    flags: CInt,
    fd: CInt,
    offset: OffT
): COpaquePointer? =
    throw UnsupportedOperationException("libc mmap is not available on JVM target")

public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt =
    throw UnsupportedOperationException("libc munmap is not available on JVM target")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    throw UnsupportedOperationException("libc clockGettime is not available on JVM target")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    throw UnsupportedOperationException("libc nanosleep is not available on JVM target")
