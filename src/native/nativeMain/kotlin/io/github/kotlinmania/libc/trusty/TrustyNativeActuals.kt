@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyCalloc
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyClockGettime
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyClose
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyFree
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyGetauxval
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyMalloc
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyMemalign
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyMmap
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyMunmap
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyNanosleep
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyPosixMemalign
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyRealloc
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyStrlen
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyWrite
import io.github.kotlinmania.libc.trusty.cinterop.libcTrustyWritev
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcTrustyCalloc(nobj, size)?.toLong() ?: 0L)

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(libcTrustyMalloc(size)?.toLong() ?: 0L)

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcTrustyRealloc(p.rawAddress.toCPointer<ByteVar>(), size)?.toLong() ?: 0L)

public actual fun free(p: MutPtr<CVoid>) {
    libcTrustyFree(p.rawAddress.toCPointer<ByteVar>())
}

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(libcTrustyMemalign(align, size)?.toLong() ?: 0L)

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    libcTrustyPosixMemalign(memptr.rawAddress.toCPointer<ByteVar>(), align, size)

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    libcTrustyWrite(fd, buf.rawAddress.toCPointer<ByteVar>(), count)

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    libcTrustyWritev(fd, iov.rawAddress.toCPointer<ByteVar>(), iovcnt)

public actual fun close(fd: CInt): CInt =
    libcTrustyClose(fd)

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    libcTrustyStrlen(cs.rawAddress.toCPointer<ByteVar>())

public actual fun getauxval(type: CUlong): CUlong =
    libcTrustyGetauxval(type)

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    MutPtr(libcTrustyMmap(addr.rawAddress.toCPointer<ByteVar>(), len, prot, flags, fd, offset)?.toLong() ?: 0L)

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    libcTrustyMunmap(addr.rawAddress.toCPointer<ByteVar>(), len)

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    libcTrustyClockGettime(clkId, tp.rawAddress.toCPointer<ByteVar>())

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    libcTrustyNanosleep(rqtp.rawAddress.toCPointer<ByteVar>(), rmtp.rawAddress.toCPointer<ByteVar>())
