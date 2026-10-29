package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XdpMmapOffsets(
    val rx: XdpRingOffset,
    val tx: XdpRingOffset,
    val fr: XdpRingOffset,
    val cr: XdpRingOffset,
)
