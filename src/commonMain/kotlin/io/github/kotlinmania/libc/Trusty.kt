// port-lint: source trusty.rs
package io.github.kotlinmania.libc

import kotlinx.cinterop.COpaquePointer

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

public typealias TimeT = CLong

public typealias ClockidT = CInt

public data class Iovec(
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)

public data class Timespec(
    val tvSec: TimeT,
    val tvNsec: CLong,
)

public const val PROT_READ: Int = 1
public const val PROT_WRITE: Int = 2

// Trusty only supports `CLOCK_BOOTTIME`.
public const val CLOCK_BOOTTIME: ClockidT = 7

public const val STDOUT_FILENO: CInt = 1
public const val STDERR_FILENO: CInt = 2

public const val AT_PAGESZ: CULong = 6uL

// MAP_FAILED is (void*)-1; represented at the FFI boundary, not as a Kotlin constant.

public expect fun calloc(nobj: ULong, size: ULong): COpaquePointer?
public expect fun malloc(size: ULong): COpaquePointer?
public expect fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer?
public expect fun free(p: COpaquePointer?)
public expect fun memalign(align: ULong, size: ULong): COpaquePointer?
public expect fun posixMemalign(memptr: COpaquePointer?, align: ULong, size: ULong): CInt
public expect fun write(fd: CInt, buf: COpaquePointer?, count: ULong): SsizeT
public expect fun writev(fd: CInt, iov: Iovec?, iovcnt: CInt): SsizeT
public expect fun close(fd: CInt): CInt
public expect fun strlen(cs: String?): ULong
public expect fun getauxval(type: CULong): CULong
public expect fun mmap(
    addr: COpaquePointer?,
    len: ULong,
    prot: CInt,
    flags: CInt,
    fd: CInt,
    offset: OffT,
): COpaquePointer?
public expect fun munmap(addr: COpaquePointer?, len: ULong): CInt
public expect fun clockGettime(clkId: ClockidT, tp: Timespec?): CInt
public expect fun nanosleep(rqtp: Timespec?, rmtp: Timespec?): CInt
