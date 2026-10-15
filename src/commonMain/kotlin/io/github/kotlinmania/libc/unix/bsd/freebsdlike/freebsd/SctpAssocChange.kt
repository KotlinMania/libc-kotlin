// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpAssocChange(
    val sacType: UShort,
    val sacFlags: UShort,
    val sacLength: UInt,
    val sacState: UShort,
    val sacError: UShort,
    val sacOutboundStreams: UShort,
    val sacInboundStreams: UShort,
    val sacAssocId: UInt,
    val sacInfo: UByteArray,
)
