// port-lint: source trusty.rs
package io.github.kotlinmania.libc.trusty

/**
 * C type aliases, struct definitions, and constants for the Trusty TEE OS surface
 * of the upstream `libc` crate.
 */

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

public typealias Size = SizeT
public typealias Ssize = SsizeT
public typealias Off = OffT
public typealias Intptr = IntptrT
public typealias Uintptr = UintptrT
public typealias Time = TimeT
public typealias ClockId = ClockidT

public data class Iovec(
    val handle: Long = 0L,
    public val iovBase: Long,
    public val iovLen: Size,
)

public data class Timespec(
    val handle: Long = 0L,
    public val tvSec: Time,
    public val tvNsec: Long,
)

public const val PROT_READ: Int = 1
public const val PROT_WRITE: Int = 2

// Trusty only supports `CLOCK_BOOTTIME`.
public const val CLOCK_BOOTTIME: ClockId = 7

public const val STDOUT_FILENO: Int = 1
public const val STDERR_FILENO: Int = 2

public const val AT_PAGESZ: ULong = 6u

public const val MAP_FAILED: Long = -1L
