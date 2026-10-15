// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class MallocStatisticsT(
    val blocksInUse: UInt,
    val sizeInUse: ULong,
    val maxSizeInUse: ULong,
    val sizeAllocated: ULong,
)
