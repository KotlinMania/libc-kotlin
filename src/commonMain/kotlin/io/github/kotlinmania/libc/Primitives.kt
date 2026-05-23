// port-lint: source primitives.rs
package io.github.kotlinmania.libc

/**
 * This module contains type aliases for C's platform-specific types and fixed-width integer types.
 *
 * The platform-specific types definitions were taken from rust-lang/rust in
 * `library/core/src/ffi/primitives.rs`.
 *
 * The fixed-width integer aliases are deprecated: use the Rust types instead.
 */

public typealias CSChar = Byte
public typealias CUChar = UByte
public typealias CShort = Short
public typealias CUShort = UShort

public typealias CLongLong = Long
public typealias CULongLong = ULong

public typealias CFloat = Float
public typealias CDouble = Double

// In the upstream, the signedness of `CChar` is platform-specific.
// It is unsigned on non-Windows, non-Apple, non-Vita targets for the following architectures:
// aarch64, arm, csky, hexagon, msp430, powerpc, powerpc64, riscv32, riscv64, s390x, xtensa.
// On every other target it is signed.
//
// Kotlin Multiplatform does not have a direct analog of configuration-gated type aliases in a
// single common source set. This port keeps one definition that is usable across all targets.
public typealias CChar = Byte

// In the upstream, `CInt`/`CUInt` are 16-bit on avr and msp430, and 32-bit everywhere else.
public typealias CInt = Int
public typealias CUInt = UInt

// In the upstream, `CLong`/`CULong` are 64-bit on non-Windows 64-bit targets, and 32-bit
// otherwise (the C standard minimum for `long` is 32 bits).
public typealias CLong = Long
public typealias CULong = ULong

@Deprecated(message = "Use Byte instead.")
public typealias Int8T = Byte

@Deprecated(message = "Use Short instead.")
public typealias Int16T = Short

@Deprecated(message = "Use Int instead.")
public typealias Int32T = Int

@Deprecated(message = "Use Long instead.")
public typealias Int64T = Long

@Deprecated(message = "Use UByte instead.")
public typealias UInt8T = UByte

@Deprecated(message = "Use UShort instead.")
public typealias UInt16T = UShort

@Deprecated(message = "Use UInt instead.")
public typealias UInt32T = UInt

@Deprecated(message = "Use ULong instead.")
public typealias UInt64T = ULong

// In the upstream, aarch64 non-Windows targets additionally provide 128-bit integer aliases for
// the C `__int128` extension.
//
// Kotlin does not provide built-in 128-bit integer primitives, so these aliases are omitted in
// the initial translation.
