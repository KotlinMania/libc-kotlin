package io.github.kotlinmania.libc

public actual fun calloc(nobj: ULong, size: ULong): COpaquePointer? = null
public actual fun malloc(size: ULong): COpaquePointer? = null
public actual fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer? = null
public actual fun free(p: COpaquePointer?) { }
public actual fun memalign(align: ULong, size: ULong): COpaquePointer? = null
public actual fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt = -1
public actual fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT = -1L
public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT = -1L
public actual fun close(fd: CInt): CInt = -1
public actual fun strlen(cs: String?): ULong = cs?.encodeToByteArray()?.size?.toULong() ?: 0uL
public actual fun getauxval(type: CULong): CULong = 0uL
public actual fun mmap(addr: COpaquePointer?, len: ULong, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? = null
public actual fun munmap(addr: COpaquePointer?, len: ULong): CInt = -1
public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt = -1
public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt = -1
