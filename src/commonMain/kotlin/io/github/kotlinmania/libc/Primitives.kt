// port-lint: source src/primitives.rs
package io.github.kotlinmania.libc

/**
 * This module contains type aliases for C's platform-specific types and fixed-width integer types.
 *
 * The platform-specific types definitions were taken from rust-lang/rust in
 * `library/core/src/ffi/primitives.rs`.
 *
 * The fixed-width integer aliases are deprecated: use the Rust types instead.
 */

public typealias c_schar = Byte
public typealias c_uchar = UByte
public typealias c_short = Short
public typealias c_ushort = UShort

public typealias c_longlong = Long
public typealias c_ulonglong = ULong

public typealias c_float = Float
public typealias c_double = Double

// In the upstream, the signedness of `c_char` is platform-specific.
// It is unsigned on non-Windows, non-Apple, non-Vita targets for the following architectures:
// aarch64, arm, csky, hexagon, msp430, powerpc, powerpc64, riscv32, riscv64, s390x, xtensa.
// On every other target it is signed.
//
// Kotlin Multiplatform does not have a direct analog of configuration-gated type aliases in a
// single common source set. This port keeps one definition that is usable across all targets.
public typealias c_char = Byte

// In the upstream, `c_int`/`c_uint` are 16-bit on avr and msp430, and 32-bit everywhere else.
public typealias c_int = Int
public typealias c_uint = UInt

// In the upstream, `c_long`/`c_ulong` are 64-bit on non-Windows 64-bit targets, and 32-bit
// otherwise (the C standard minimum for `long` is 32 bits).
public typealias c_long = Long
public typealias c_ulong = ULong

@Deprecated(message = "Use Byte instead.")
public typealias int8_t = Byte

@Deprecated(message = "Use Short instead.")
public typealias int16_t = Short

@Deprecated(message = "Use Int instead.")
public typealias int32_t = Int

@Deprecated(message = "Use Long instead.")
public typealias int64_t = Long

@Deprecated(message = "Use UByte instead.")
public typealias uint8_t = UByte

@Deprecated(message = "Use UShort instead.")
public typealias uint16_t = UShort

@Deprecated(message = "Use UInt instead.")
public typealias uint32_t = UInt

@Deprecated(message = "Use ULong instead.")
public typealias uint64_t = ULong

// In the upstream, aarch64 non-Windows targets additionally provide 128-bit integer aliases for
// the C `__int128` extension.
//
// Kotlin does not provide built-in 128-bit integer primitives, so these aliases are omitted in
// the initial translation.
