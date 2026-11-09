// port-lint: source trusty.rs
package io.github.kotlinmania.libc.trusty

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUlong

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

public data class Iovec(public var iovBase: COpaquePointer? = null, public var iovLen: SizeT = 0uL)

public data class Timespec(public var tvSec: TimeT = 0L, public var tvNsec: CLong = 0L)

public val PROT_READ: Int = 1

public val PROT_WRITE: Int = 2

// Trusty only supports `CLOCK_BOOTTIME`.
public val CLOCK_BOOTTIME: ClockidT = 7

public val STDOUT_FILENO: CInt = 1

public val STDERR_FILENO: CInt = 2

public val AT_PAGESZ: CUlong = 6uL

public val MAP_FAILED: COpaquePointer? = ((0.inv() as Any?) as COpaquePointer?)

public expect fun calloc(nobj: SizeT, size: SizeT): COpaquePointer?

public expect fun malloc(size: SizeT): COpaquePointer?

public expect fun realloc(p: COpaquePointer?, size: SizeT): COpaquePointer?

public expect fun free(p: COpaquePointer?)

public expect fun memalign(align: SizeT, size: SizeT): COpaquePointer?

public expect fun posixMemalign(memptr: COpaquePointer?, align: SizeT, size: SizeT): CInt

public expect fun write(fd: CInt, buf: COpaquePointer?, count: SizeT): SsizeT

public expect fun writev(fd: CInt, iov: COpaquePointer?, iovcnt: CInt): SsizeT

public expect fun close(fd: CInt): CInt

public expect fun strlen(cs: String?): SizeT

public expect fun getauxval(type: CUlong): CUlong

public expect fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer?

public expect fun munmap(addr: COpaquePointer?, len: SizeT): CInt

public expect fun clockGettime(clkId: ClockidT, tp: COpaquePointer?): CInt

public expect fun nanosleep(rqtp: COpaquePointer?, rmtp: COpaquePointer?): CInt
