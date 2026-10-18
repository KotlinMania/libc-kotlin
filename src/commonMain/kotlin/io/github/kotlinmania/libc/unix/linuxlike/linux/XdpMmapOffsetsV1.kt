package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XdpMmapOffsetsV1(
    val rx: XdpRingOffsetV1,
    val tx: XdpRingOffsetV1,
    val fr: XdpRingOffsetV1,
    val cr: XdpRingOffsetV1,
)
