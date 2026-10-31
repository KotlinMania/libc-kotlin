@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong
import libc.cinterop.libc_aligned_free
import libc.cinterop.libc_calloc
import libc.cinterop.libc_clock_gettime
import libc.cinterop.libc_clock_nanosleep
import libc.cinterop.libc_close
import libc.cinterop.libc_free
import libc.cinterop.libc_malloc
import libc.cinterop.libc_memalign
import libc.cinterop.libc_munmap
import libc.cinterop.libc_realloc
import libc.cinterop.libc_strlen
import libc.cinterop.libc_write
import libc.cinterop.libc_writev

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    libc_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    libc_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? {
    val pPtr: CPointer<ByteVar>? = p?.value?.toCPointer()
    return libc_realloc(pPtr, size)?.let { COpaquePointer(it.toLong()) }
}

public actual fun free(p: COpaquePointer?) {
    if (p == null) return
    val pPtr: CPointer<ByteVar>? = p.value.toCPointer()
    if (p.allocationAlignment != 0uL) libc_aligned_free(pPtr) else libc_free(pPtr)
}

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    libc_memalign(align, size)?.let { COpaquePointer(it.toLong(), align) }

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): Int =
    throw UnsupportedOperationException("posixMemalign requires Trusty OS runtime")

public actual fun write(fd: Int, buf: COpaquePointer?, count: SizeT): SsizeT =
    libc_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun writev(fd: Int, iov: Iovec?, iovcnt: Int): SsizeT {
    val handle = iov?.handle ?: 0L
    val iovPtr: CPointer<ByteVar>? = if (handle != 0L) handle.toCPointer() else null
    return libc_writev(fd, iovPtr, iovcnt)
}

public actual fun close(fd: Int): Int =
    libc_close(fd)

public actual fun strlen(cs: String?): SizeT =
    if (cs == null) 0uL else libc_strlen(cs)

public actual fun getauxval(type: ULong): ULong =
    throw UnsupportedOperationException("getauxval requires Trusty OS runtime")

public actual fun mmap(
    addr: COpaquePointer?,
    len: SizeT,
    prot: Int,
    flags: Int,
    fd: Int,
    offset: OffT,
): COpaquePointer? =
    throw UnsupportedOperationException("mmap requires Trusty OS runtime")

public actual fun munmap(addr: COpaquePointer?, len: SizeT): Int =
    libc_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): Int {
    val handle = tp?.handle ?: 0L
    val tpPtr: CPointer<ByteVar>? = if (handle != 0L) handle.toCPointer() else null
    return libc_clock_gettime(clkId, tpPtr)
}

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int {
    val reqHandle = rqtp?.handle ?: 0L
    val remHandle = rmtp?.handle ?: 0L
    val reqPtr: CPointer<ByteVar>? = if (reqHandle != 0L) reqHandle.toCPointer() else null
    val remPtr: CPointer<ByteVar>? = if (remHandle != 0L) remHandle.toCPointer() else null
    return libc_clock_nanosleep(0, 0, reqPtr, remPtr)
}
