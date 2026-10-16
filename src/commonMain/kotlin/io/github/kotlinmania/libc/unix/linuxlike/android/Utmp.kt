package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class Utmp(
    val utType: Short,
    val utPid: Int,
    val utLine: ByteArray,
    val utId: ByteArray,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utExit: ExitStatus,
    val utSession: Long,
    val utTv: Timeval,
    val utAddrV6: IntArray,
)
