// port-lint: source libc/src/switch.rs
package io.github.kotlinmania.libc.switch

/**
 * Switch C type definitions.
 */

public typealias Intmax = Long
public typealias Uintmax = ULong

public typealias Size = ULong
public typealias Ptrdiff = Long
public typealias Intptr = Long
public typealias Uintptr = ULong
public typealias Ssize = Long

public typealias Off = Long
public typealias Wchar = UInt

public const val INT_MIN: Int = -2147483648
public const val INT_MAX: Int = 2147483647
