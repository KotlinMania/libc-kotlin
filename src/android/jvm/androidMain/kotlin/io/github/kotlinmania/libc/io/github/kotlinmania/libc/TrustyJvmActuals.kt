package io.github.kotlinmania.libc

import io.github.kotlinmania.libc.COpaquePointer

internal object TrustyRawLibc {
    external fun calloc(nobj: Long, size: Long): Long?
    external fun malloc(size: Long): Long?
    external fun realloc(p: Long, size: Long): Long?
    external fun free(p: Long)
    external fun memalign(align: Long, size: Long): Long?
    external fun posixMemalign(memptr: Long, align: Long, size: Long): Int
    external fun write(fd: Int, buf: Long, count: Long): Long
    external fun writev(fd: Int, iov: Long, iovcnt: Int): Long
    external fun close(fd: Int): Int
    external fun strlen(cs: String?): Long
    external fun getauxval(type: Long): Long
    external fun mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long?
    external fun munmap(addr: Long, len: Long): Int
    external fun clockGettime(clkId: Int, tp: Long): Int
    external fun nanosleep(rqtp: Long, rmtp: Long): Int
}

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    TrustyRawLibc.calloc(nobj, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    TrustyRawLibc.malloc(size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    TrustyRawLibc.realloc(p?.value ?: 0L, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    TrustyRawLibc.free(p?.value ?: 0L)
}

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    TrustyRawLibc.memalign(align, size).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    TrustyRawLibc.posixMemalign(memptr?.value ?: 0L, align, size)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    TrustyRawLibc.write(fd, buf?.value ?: 0L, count)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    TrustyRawLibc.writev(fd, iov?.toLong() ?: 0L, iovcnt)

public actual fun close(fd: CInt): CInt =
    TrustyRawLibc.close(fd)

public actual fun strlen(cs: String?): SizeT =
    TrustyRawLibc.strlen(cs)

public actual fun getauxval(type: CUlong): CUlong =
    TrustyRawLibc.getauxval(type)

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    TrustyRawLibc.mmap(addr?.value ?: 0L, len, prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    TrustyRawLibc.munmap(addr?.value ?: 0L, len)

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    TrustyRawLibc.clockGettime(clkId, tp?.toLong() ?: 0L)

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    TrustyRawLibc.nanosleep(rqtp?.toLong() ?: 0L, rmtp?.toLong() ?: 0L)
