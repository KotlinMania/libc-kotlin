// port-lint: source libc/src/sgx.rs
package io.github.kotlinmania.libc.sgx

/**
 * SGX C types definition.
 */

public typealias Intmax = Long
public typealias Uintmax = ULong

public typealias Size = ULong
public typealias Ptrdiff = Long
public typealias Intptr = Long
public typealias Uintptr = ULong
public typealias Ssize = Long

public const val INT_MIN: Int = -2147483648
public const val INT_MAX: Int = 2147483647
