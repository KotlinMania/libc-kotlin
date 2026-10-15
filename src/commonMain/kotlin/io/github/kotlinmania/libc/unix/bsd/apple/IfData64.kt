// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class IfData64(
    val ifiType: UByte,
    val ifiTypelen: UByte,
    val ifiPhysical: UByte,
    val ifiAddrlen: UByte,
    val ifiHdrlen: UByte,
    val ifiRecvquota: UByte,
    val ifiXmitquota: UByte,
    val ifiUnused1: UByte,
    val ifiMtu: UInt,
    val ifiMetric: UInt,
    val ifiBaudrate: ULong,
    val ifiIpackets: ULong,
    val ifiIerrors: ULong,
    val ifiOpackets: ULong,
    val ifiOerrors: ULong,
    val ifiCollisions: ULong,
    val ifiIbytes: ULong,
    val ifiObytes: ULong,
    val ifiImcasts: ULong,
    val ifiOmcasts: ULong,
    val ifiIqdrops: ULong,
    val ifiNoproto: ULong,
    val ifiRecvtiming: UInt,
    val ifiXmittiming: UInt,
    val ifiLastchange: Timeval,
    val ifiLastchange2: Int,
)
