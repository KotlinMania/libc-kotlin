package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketReq(
    val tpBlockSize: UInt,
    val tpBlockNr: UInt,
    val tpFrameSize: UInt,
    val tpFrameNr: UInt,
)
