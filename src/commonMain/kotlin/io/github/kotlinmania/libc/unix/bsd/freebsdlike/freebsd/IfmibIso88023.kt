// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class IfmibIso88023(
    val dot3StatsAlignmentErrors: UInt,
    val dot3StatsFCSErrors: UInt,
    val dot3StatsSingleCollisionFrames: UInt,
    val dot3StatsMultipleCollisionFrames: UInt,
    val dot3StatsSQETestErrors: UInt,
    val dot3StatsDeferredTransmissions: UInt,
    val dot3StatsLateCollisions: UInt,
    val dot3StatsExcessiveCollisions: UInt,
    val dot3StatsInternalMacTransmitErrors: UInt,
    val dot3StatsCarrierSenseErrors: UInt,
    val dot3StatsFrameTooLongs: UInt,
    val dot3StatsInternalMacReceiveErrors: UInt,
    val dot3StatsEtherChipSet: UInt,
    val dot3StatsMissedFrames: UInt,
    val dot3StatsCollFrequencies: UIntArray,
    val dot3Compliance: UInt,
)
