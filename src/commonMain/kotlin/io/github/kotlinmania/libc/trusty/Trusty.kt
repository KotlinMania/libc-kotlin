// port-lint: source trusty.rs
package io.github.kotlinmania.libc.trusty

/**
 * C type aliases, struct definitions, and constants for the Trusty TEE OS surface
 * of the upstream `libc` crate.
 */

public typealias Size = ULong
public typealias Ssize = Long

public typealias Off = Long

public typealias Intptr = Long
public typealias Uintptr = ULong

public typealias Time = Long

public typealias ClockId = Int

public data class Iovec(
    public val iovBase: Long,
    public val iovLen: Size,
)

public data class Timespec(
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
