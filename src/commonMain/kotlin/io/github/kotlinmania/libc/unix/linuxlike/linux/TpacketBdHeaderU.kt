package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class TpacketBdHeaderU(
    val bh1: TpacketHdrV1? = null,
)
