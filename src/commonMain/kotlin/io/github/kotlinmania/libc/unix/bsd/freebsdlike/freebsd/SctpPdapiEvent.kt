package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpPdapiEvent(
    val pdapiType: UShort,
    val pdapiFlags: UShort,
    val pdapiLength: UInt,
    val pdapiIndication: UInt,
    val pdapiStream: UShort,
    val pdapiSeq: UShort,
    val pdapiAssocId: UInt,
)
