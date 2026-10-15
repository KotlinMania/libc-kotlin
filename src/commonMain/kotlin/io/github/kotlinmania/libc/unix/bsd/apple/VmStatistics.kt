// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class VmStatistics(
    val freeCount: UInt,
    val activeCount: UInt,
    val inactiveCount: UInt,
    val wireCount: UInt,
    val zeroFillCount: UInt,
    val reactivations: UInt,
    val pageins: UInt,
    val pageouts: UInt,
    val faults: UInt,
    val cowFaults: UInt,
    val lookups: UInt,
    val hits: UInt,
    val purgeableCount: UInt,
    val purges: UInt,
    val speculativeCount: UInt,
)
