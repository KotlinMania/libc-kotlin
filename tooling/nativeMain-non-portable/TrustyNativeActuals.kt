@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_trusty_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_trusty_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_trusty_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    io.github.kotlinmania.libc.cinterop.libc_trusty_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_trusty_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_trusty_posix_memalign(memptr?.value?.toCPointer<ByteVar>(), align, size)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_trusty_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.cinterop.libc_trusty_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun close(fd: CInt): CInt =
    io.github.kotlinmania.libc.cinterop.libc_trusty_close(fd)

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.cinterop.libc_trusty_strlen(cs)

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.cinterop.libc_trusty_getauxval(type)

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    io.github.kotlinmania.libc.cinterop.libc_trusty_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.cinterop.libc_trusty_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_trusty_clock_gettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt =
    io.github.kotlinmania.libc.cinterop.libc_trusty_nanosleep(rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())
