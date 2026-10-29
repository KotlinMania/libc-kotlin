package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class IfData(
    val ifiType: UByte,
    val ifiPhysical: UByte,
    val ifiAddrlen: UByte,
    val ifiHdrlen: UByte,
    val ifiLinkState: UByte,
    val ifiVhid: UByte,
    val ifiDatalen: UShort,
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
    val ifiOqdrops: ULong,
    val ifiNoproto: ULong,
    val ifiHwassist: ULong,
    val ifiEpoch: CAnonymousIfiEpoch,
    val ifiLastchange: CAnonymousIfiLastchange,
)
