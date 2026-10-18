package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XskTxMetadataRequest(
    val csumStart: UShort,
    val csumOffset: UShort,
)
