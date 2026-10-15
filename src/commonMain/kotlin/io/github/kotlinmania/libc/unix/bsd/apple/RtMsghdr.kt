// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class RtMsghdr(
    val rtmMsglen: UShort,
    val rtmVersion: UByte,
    val rtmType: UByte,
    val rtmIndex: UShort,
    val rtmFlags: Int,
    val rtmAddrs: Int,
    val rtmPid: Int,
    val rtmSeq: Int,
    val rtmErrno: Int,
    val rtmUse: Int,
    val rtmInits: UInt,
    val rtmRmx: RtMetrics,
)
