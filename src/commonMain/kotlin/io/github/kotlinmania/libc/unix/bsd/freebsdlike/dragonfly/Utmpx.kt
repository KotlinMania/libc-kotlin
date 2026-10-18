package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class Utmpx(
    val utName: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utHost: ByteArray,
    val utSession: UShort,
    val utType: UShort,
    val utPid: Int,
    val utExit: ExitStatus,
    val utSs: SockaddrStorage,
    val utTv: Timeval,
)
