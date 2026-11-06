// port-lint: source primitives.rs
package io.github.kotlinmania.libc

// This module contains type aliases for C's platform-specific types
// and fixed-width integer types.
//
// The platform-specific types definitions were taken from rust-lang/rust in
// library/core/src/ffi/primitives.rs
//
// The fixed-width integer aliases are deprecated: use the Rust types instead.

public typealias CSchar = Byte

public typealias CUchar = UByte

public typealias CShort = Short

public typealias CUshort = UShort

public typealias CLonglong = Long

public typealias CUlonglong = ULong

public typealias CFloat = Float

public typealias CDouble = Double

public typealias CChar = UByte

public typealias CInt = Int

public typealias CUint = UInt

public typealias CLong = Long

public typealias CUlong = ULong

public typealias Int8T = Byte

public typealias Int16T = Short

public typealias Int32T = Int

public typealias Int64T = Long

public typealias Uint8T = UByte

public typealias Uint16T = UShort

public typealias Uint32T = UInt

public typealias Uint64T = ULong

/**
 * C `__int128` (a GCC extension that's part of many ABIs)
 */
public typealias Int128 = I128

/**
 * C `unsigned __int128` (a GCC extension that's part of many ABIs)
 */
public typealias Uint128 = U128

/**
 * C __int128_t (alternate name for [__int128][])
 */
public typealias Int128T = I128

/**
 * C __uint128_t (alternate name for [__uint128][])
 */
public typealias Uint128T = U128
