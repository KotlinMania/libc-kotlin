@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUlong
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object TrustyJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcTrustyCalloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libcTrustyMalloc(size: Long): Long

    @JvmStatic
    external fun libcTrustyRealloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libcTrustyFree(p: Long)

    @JvmStatic
    external fun libcTrustyMemalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libcTrustyPosixMemalign(memptr: Long, align: Long, size: Long): Int

    @JvmStatic
    external fun libcTrustyWrite(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libcTrustyWritev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libcTrustyClose(fd: Int): Int

    @JvmStatic
    external fun libcTrustyStrlen(cs: Long): Long

    @JvmStatic
    external fun libcTrustyGetauxval(type: Long): Long

    @JvmStatic
    external fun libcTrustyMmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libcTrustyMunmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libcTrustyClockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libcTrustyNanosleep(rqtp: Long, rmtp: Long): Int
}

public actual fun calloc(nobj: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(TrustyJniBridge.libcTrustyCalloc(nobj.toLong(), size.toLong()))

public actual fun malloc(size: SizeT): MutPtr<CVoid> =
    MutPtr(TrustyJniBridge.libcTrustyMalloc(size.toLong()))

public actual fun realloc(p: MutPtr<CVoid>, size: SizeT): MutPtr<CVoid> =
    MutPtr(TrustyJniBridge.libcTrustyRealloc(p.rawAddress, size.toLong()))

public actual fun free(p: MutPtr<CVoid>) {
    TrustyJniBridge.libcTrustyFree(p.rawAddress)
}

public actual fun memalign(align: SizeT, size: SizeT): MutPtr<CVoid> =
    MutPtr(TrustyJniBridge.libcTrustyMemalign(align.toLong(), size.toLong()))

public actual fun posixMemalign(memptr: MutPtr<MutPtr<CVoid>>, align: SizeT, size: SizeT): CInt =
    TrustyJniBridge.libcTrustyPosixMemalign(memptr.rawAddress, align.toLong(), size.toLong())

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    TrustyJniBridge.libcTrustyWrite(fd, buf.rawAddress, count.toLong())

public actual fun writev(fd: CInt, iov: ConstPtr<Iovec>, iovcnt: CInt): SsizeT =
    TrustyJniBridge.libcTrustyWritev(fd, iov.rawAddress, iovcnt)

public actual fun close(fd: CInt): CInt =
    TrustyJniBridge.libcTrustyClose(fd)

public actual fun strlen(cs: ConstPtr<CChar>): SizeT =
    TrustyJniBridge.libcTrustyStrlen(cs.rawAddress).toULong()

public actual fun getauxval(type: CUlong): CUlong =
    TrustyJniBridge.libcTrustyGetauxval(type.toLong()).toULong()

public actual fun mmap(addr: MutPtr<CVoid>, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): MutPtr<CVoid> =
    MutPtr(TrustyJniBridge.libcTrustyMmap(addr.rawAddress, len.toLong(), prot, flags, fd, offset))

public actual fun munmap(addr: MutPtr<CVoid>, len: SizeT): CInt =
    TrustyJniBridge.libcTrustyMunmap(addr.rawAddress, len.toLong())

public actual fun clockGettime(clkId: ClockidT, tp: MutPtr<Timespec>): CInt =
    TrustyJniBridge.libcTrustyClockGettime(clkId, tp.rawAddress)

public actual fun nanosleep(rqtp: ConstPtr<Timespec>, rmtp: MutPtr<Timespec>): CInt =
    TrustyJniBridge.libcTrustyNanosleep(rqtp.rawAddress, rmtp.rawAddress)
