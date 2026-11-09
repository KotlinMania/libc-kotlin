@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

private object TrustyJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_trusty_calloc(nobj: Long, size: Long): Long

    @JvmStatic
    external fun libc_trusty_malloc(size: Long): Long

    @JvmStatic
    external fun libc_trusty_realloc(p: Long, size: Long): Long

    @JvmStatic
    external fun libc_trusty_free(p: Long)

    @JvmStatic
    external fun libc_trusty_memalign(align: Long, size: Long): Long

    @JvmStatic
    external fun libc_trusty_posixMemalign(memptr: Long, align: Long, size: Long): Int

    @JvmStatic
    external fun libc_trusty_write(fd: Int, buf: Long, count: Long): Long

    @JvmStatic
    external fun libc_trusty_writev(fd: Int, iov: Long, iovcnt: Int): Long

    @JvmStatic
    external fun libc_trusty_close(fd: Int): Int

    @JvmStatic
    external fun libc_trusty_strlen(cs: String?): Long

    @JvmStatic
    external fun libc_trusty_getauxval(type: Long): Long

    @JvmStatic
    external fun libc_trusty_mmap(addr: Long, len: Long, prot: Int, flags: Int, fd: Int, offset: Long): Long

    @JvmStatic
    external fun libc_trusty_munmap(addr: Long, len: Long): Int

    @JvmStatic
    external fun libc_trusty_clockGettime(clkId: Int, tp: Long): Int

    @JvmStatic
    external fun libc_trusty_nanosleep(rqtp: Long, rmtp: Long): Int
}

public actual fun calloc(nobj: SizeT, size: SizeT): COpaquePointer? =
    TrustyJniBridge.libc_trusty_calloc(nobj.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun malloc(size: SizeT): COpaquePointer? =
    TrustyJniBridge.libc_trusty_malloc(size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer? =
    TrustyJniBridge.libc_trusty_realloc((p?.value ?: 0L), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun free(p: COpaquePointer?) {
    TrustyJniBridge.libc_trusty_free((p?.value ?: 0L))
}

public actual fun memalign(align: SizeT, size: SizeT): COpaquePointer? =
    TrustyJniBridge.libc_trusty_memalign(align.toLong(), size.toLong()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt =
    TrustyJniBridge.libc_trusty_posixMemalign((memptr?.value ?: 0L), align.toLong(), size.toLong())

public actual fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT =
    TrustyJniBridge.libc_trusty_write(fd, (buf?.value ?: 0L), count.toLong())

public actual fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT =
    TrustyJniBridge.libc_trusty_writev(fd, (iov?.value ?: 0L), iovcnt)

public actual fun close(fd: CInt): CInt =
    TrustyJniBridge.libc_trusty_close(fd)

public actual fun strlen(cs: String?): SizeT =
    TrustyJniBridge.libc_trusty_strlen(cs).toULong()

public actual fun getauxval(type: CUlong): CUlong =
    TrustyJniBridge.libc_trusty_getauxval(type.toLong()).toULong()

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    TrustyJniBridge.libc_trusty_mmap((addr?.value ?: 0L), len.toLong(), prot, flags, fd, offset).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    TrustyJniBridge.libc_trusty_munmap((addr?.value ?: 0L), len.toLong())

public actual fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt =
    TrustyJniBridge.libc_trusty_clockGettime(clkId, (tp?.value ?: 0L))

public actual fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt =
    TrustyJniBridge.libc_trusty_nanosleep((rqtp?.value ?: 0L), (rmtp?.value ?: 0L))
