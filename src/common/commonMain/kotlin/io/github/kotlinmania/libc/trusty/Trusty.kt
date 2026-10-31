// port-lint: source trusty.rs
package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.COpaquePointer

public typealias SizeT = ULong
public typealias SsizeT = Long

public typealias OffT = Long

public typealias CUint8T = UByte
public typealias CUint16T = UShort
public typealias CUint32T = UInt
public typealias CUint64T = ULong

public typealias CInt8T = Byte
public typealias CInt16T = Short
public typealias CInt32T = Int
public typealias CInt64T = Long

public typealias IntptrT = Long
public typealias UintptrT = ULong

public typealias TimeT = Long

public typealias ClockidT = Int

public data class Iovec(
    val handle: Long = 0L,
    public val iovBase: Long,
    public val iovLen: ULong,
)

public data class Timespec(
    val handle: Long = 0L,
    public val tvSec: Long,
    public val tvNsec: Long,
)

public const val PROT_READ: Int = 1
public const val PROT_WRITE: Int = 2

// Trusty only supports `CLOCK_BOOTTIME`.
public const val CLOCK_BOOTTIME: Int = 7

public const val STDOUT_FILENO: Int = 1
public const val STDERR_FILENO: Int = 2

public const val AT_PAGESZ: ULong = 6u

public const val MAP_FAILED: Long = -1L

public expect fun calloc(nobj: SizeT, size: SizeT): COpaquePointer?

public expect fun malloc(size: SizeT): COpaquePointer?

public expect fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): Int

public expect fun write(fd: Int, buf: COpaquePointer?, count: SizeT): SsizeT

public expect fun writev(fd: Int, iov: Iovec?, iovcnt: Int): SsizeT

public expect fun close(fd: Int): Int

public expect fun strlen(cs: String?): SizeT

public expect fun getauxval(type: ULong): ULong

public expect fun mmap(
    addr: COpaquePointer?,
    len: SizeT,
    prot: Int,
    flags: Int,
    fd: Int,
    offset: OffT,
): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: SizeT): Int

public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): Int

public expect fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): Int
