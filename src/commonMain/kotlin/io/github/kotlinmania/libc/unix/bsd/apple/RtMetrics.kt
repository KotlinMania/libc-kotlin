// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class RtMetrics(
    val rmxLocks: UInt,
    val rmxMtu: UInt,
    val rmxHopcount: UInt,
    val rmxExpire: Int,
    val rmxRecvpipe: UInt,
    val rmxSendpipe: UInt,
    val rmxSsthresh: UInt,
    val rmxRtt: UInt,
    val rmxRttvar: UInt,
    val rmxPksent: UInt,
    val rmxState: UInt,
    val rmxFiller: UIntArray,
)
