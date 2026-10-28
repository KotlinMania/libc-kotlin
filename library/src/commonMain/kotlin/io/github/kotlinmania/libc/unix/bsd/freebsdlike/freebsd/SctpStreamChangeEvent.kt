package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpStreamChangeEvent(
    val strchangeType: UShort,
    val strchangeFlags: UShort,
    val strchangeLength: UInt,
    val strchangeAssocId: UInt,
    val strchangeInstrms: UShort,
    val strchangeOutstrms: UShort,
)
