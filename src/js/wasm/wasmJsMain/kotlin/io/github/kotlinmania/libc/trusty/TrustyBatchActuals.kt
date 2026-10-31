package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.COpaquePointer

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("calloc not available on WasmJS — Trusty OS target required")

public actual fun malloc(size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("malloc not available on WasmJS — Trusty OS target required")

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("realloc not available on WasmJS — Trusty OS target required")

public actual fun free(p: COpaquePointer?): Unit =
    throw UnsupportedOperationException("free not available on WasmJS — Trusty OS target required")

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    throw UnsupportedOperationException("memalign not available on WasmJS — Trusty OS target required")

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): Int =
    throw UnsupportedOperationException("posixMemalign not available on WasmJS — Trusty OS target required")

public actual fun write(fd: Int, buf: COpaquePointer?, count: SizeT): SsizeT =
    throw UnsupportedOperationException("write not available on WasmJS — Trusty OS target required")

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): SsizeT =
    throw UnsupportedOperationException("writev not available on WasmJS — Trusty OS target required")

public actual fun close(fd: Int): Int =
    throw UnsupportedOperationException("close not available on WasmJS — Trusty OS target required")

public actual fun strlen(cs: String?): SizeT =
    cs?.encodeToByteArray()?.size?.toULong() ?: 0uL

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval not available on WasmJS — Trusty OS target required")

public actual fun mmap(
    addr: COpaquePointer?,
    len: SizeT,
    prot: Int,
    flags: Int,
    fd: Int,
    offset: OffT,
): COpaquePointer? =
    throw UnsupportedOperationException("mmap not available on WasmJS — Trusty OS target required")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): Int =
    throw UnsupportedOperationException("munmap not available on WasmJS — Trusty OS target required")

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): Int =
    throw UnsupportedOperationException("clockGettime not available on WasmJS — Trusty OS target required")

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int =
    throw UnsupportedOperationException("nanosleep not available on WasmJS — Trusty OS target required")
