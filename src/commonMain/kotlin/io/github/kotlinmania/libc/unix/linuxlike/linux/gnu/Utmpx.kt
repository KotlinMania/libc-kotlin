package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class Utmpx(
    val utType: Short,
    val utPid: Int,
    val utLine: ByteArray,
    val utId: ByteArray,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utExit: ExitStatus,
    val utSession: Long,
    val utTv: Timeval,
    val utSession2: Int,
    val utTv2: Timeval,
    val utAddrV6: IntArray,
)
