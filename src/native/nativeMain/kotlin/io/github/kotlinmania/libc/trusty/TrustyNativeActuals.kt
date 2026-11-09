@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_calloc(nobj, size)?.let { COpaquePointer(it.toLong()) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_malloc(size)?.let { COpaquePointer(it.toLong()) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_realloc(p?.value?.toCPointer<ByteVar>(), size)?.let { COpaquePointer(it.toLong()) }

public actual fun free(p: COpaquePointer?) {
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_free(p?.value?.toCPointer<ByteVar>())
}

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_memalign(align, size)?.let { COpaquePointer(it.toLong()) }

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_posixMemalign(memptr?.value?.toCPointer<ByteVar>(), align, size)

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_write(fd, buf?.value?.toCPointer<ByteVar>(), count)

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_writev(fd, iov?.value?.toCPointer<ByteVar>(), iovcnt)

public actual fun close(fd: CInt): CInt =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_close(fd)

public actual fun strlen(cs: String?): SizeT =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_strlen(cs)

public actual fun getauxval(type: CUlong): CUlong =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_getauxval(type)

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_mmap(addr?.value?.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.let { COpaquePointer(it.toLong()) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_munmap(addr?.value?.toCPointer<ByteVar>(), len)

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_clockGettime(clkId, tp?.value?.toCPointer<ByteVar>())

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.trusty.cinterop.libc_trusty_nanosleep(rqtp?.value?.toCPointer<ByteVar>(), rmtp?.value?.toCPointer<ByteVar>())
