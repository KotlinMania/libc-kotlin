// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpSendFailedEvent(
    val ssfeType: UShort,
    val ssfeFlags: UShort,
    val ssfeLength: UInt,
    val ssfeError: UInt,
    val ssfeInfo: SctpSndinfo,
    val ssfeAssocId: UInt,
    val ssfeData: UByteArray,
)
