// port-lint: source unix/bsd/freebsdlike/dragonfly/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class IfData(
    val ifiType: UByte,
    val ifiPhysical: UByte,
    val ifiAddrlen: UByte,
    val ifiHdrlen: UByte,
    val ifiRecvquota: UByte,
    val ifiXmitquota: UByte,
    val ifiMtu: ULong,
    val ifiMetric: ULong,
    val ifiLinkState: ULong,
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
    val ifiHwassist: ULong,
    val ifiOqdrops: ULong,
    val ifiLastchange: Timeval,
)
