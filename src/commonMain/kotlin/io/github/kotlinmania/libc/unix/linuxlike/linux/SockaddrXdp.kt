package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SockaddrXdp(
    val sxdpFamily: UShort,
    val sxdpFlags: UShort,
    val sxdpIfindex: UInt,
    val sxdpQueueId: UInt,
    val sxdpSharedUmemFd: UInt,
)
