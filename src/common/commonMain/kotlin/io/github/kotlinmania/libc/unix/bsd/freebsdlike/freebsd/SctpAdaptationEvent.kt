package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpAdaptationEvent(
    val saiType: UShort,
    val saiFlags: UShort,
    val saiLength: UInt,
    val saiAdaptationInd: UInt,
    val saiAssocId: UInt,
)
