// port-lint: source types.rs
package io.github.kotlinmania.libc

/**
 * Common C type aliases shared across all platform modules.
 *
 * In the upstream Rust crate, each platform module (sgx.rs, switch.rs,
 * xous.rs, trusty.rs, etc.) defines these types with identical values.
 * The Rust `cfg_if!` chain selects exactly one platform module per target,
 * so there is never a duplicate at compile time. In the Kotlin port all
 * platform files reside in commonMain and are compiled together, so the
 * shared definitions are consolidated here to avoid redeclarations.
 */

public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias SizeT = ULong
public typealias PtrdiffT = Long
public typealias IntptrT = Long
public typealias UintptrT = ULong
public typealias SsizeT = Long
public typealias OffT = Long
public typealias WcharT = UInt

public const val INT_MIN: CInt = -2147483648
public const val INT_MAX: CInt = 2147483647