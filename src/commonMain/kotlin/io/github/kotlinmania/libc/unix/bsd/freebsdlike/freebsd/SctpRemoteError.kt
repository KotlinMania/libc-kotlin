package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpRemoteError(
    val sreType: UShort,
    val sreFlags: UShort,
    val sreLength: UInt,
    val sreError: UShort,
    val sreAssocId: UInt,
    val sreData: UByteArray,
)
