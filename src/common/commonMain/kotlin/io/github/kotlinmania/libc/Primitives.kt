// port-lint: source primitives.rs
package io.github.kotlinmania.libc

/**
 * Type aliases for C platform-specific types and fixed-width integer types.
 */

public typealias CSchar = Byte
public typealias CUchar = UByte
public typealias CShort = Short
public typealias CUshort = UShort

public typealias CLonglong = Long
public typealias CUlonglong = ULong

public typealias CFloat = Float
public typealias CDouble = Double

public typealias CChar = Byte

public typealias CInt = Int
public typealias CUint = UInt

public typealias CLong = Long
public typealias CUlong = ULong

@Deprecated("Use Byte instead.")
public typealias Int8T = Byte

@Deprecated("Use Short instead.")
public typealias Int16T = Short

@Deprecated("Use Int instead.")
public typealias Int32T = Int

@Deprecated("Use Long instead.")
public typealias Int64T = Long

@Deprecated("Use UByte instead.")
public typealias Uint8T = UByte

@Deprecated("Use UShort instead.")
public typealias Uint16T = UShort

@Deprecated("Use UInt instead.")
public typealias Uint32T = UInt

@Deprecated("Use ULong instead.")
public typealias Uint64T = ULong

/**
 * Signed 128-bit integer value used by C ABI extensions.
 */
public data class Int128(
    public val low: ULong = 0uL,
    public val high: Long = 0L,
)

/**
 * Unsigned 128-bit integer value used by C ABI extensions.
 */
public data class Uint128(
    public val low: ULong = 0uL,
    public val high: ULong = 0uL,
)

public typealias Int128T = Int128
public typealias Uint128T = Uint128
