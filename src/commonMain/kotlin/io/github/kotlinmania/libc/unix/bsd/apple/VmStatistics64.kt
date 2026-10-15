// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class VmStatistics64(
    val freeCount: UInt,
    val activeCount: UInt,
    val inactiveCount: UInt,
    val wireCount: UInt,
    val zeroFillCount: ULong,
    val reactivations: ULong,
    val pageins: ULong,
    val pageouts: ULong,
    val faults: ULong,
    val cowFaults: ULong,
    val lookups: ULong,
    val hits: ULong,
    val purges: ULong,
    val purgeableCount: UInt,
    val speculativeCount: UInt,
    val decompressions: ULong,
    val compressions: ULong,
    val swapins: ULong,
    val swapouts: ULong,
    val compressorPageCount: UInt,
    val throttledCount: UInt,
    val externalPageCount: UInt,
    val internalPageCount: UInt,
    val totalUncompressedPagesInCompressor: ULong,
)
