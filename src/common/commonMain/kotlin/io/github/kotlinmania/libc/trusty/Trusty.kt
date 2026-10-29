// port-lint: source trusty.rs
package io.github.kotlinmania.libc.trusty

public data class Iovec(
    val handle: Long = 0L,
    public val iovBase: Long,
    public val iovLen: ULong,
)

public data class Timespec(
    val handle: Long = 0L,
    public val tvSec: Long,
    public val tvNsec: Long,
)

public const val PROT_READ: Int = 1
public const val PROT_WRITE: Int = 2

// Trusty only supports `CLOCK_BOOTTIME`.
public const val CLOCK_BOOTTIME: Int = 7

public const val STDOUT_FILENO: Int = 1
public const val STDERR_FILENO: Int = 2

public const val AT_PAGESZ: ULong = 6u

public const val MAP_FAILED: Long = -1L
