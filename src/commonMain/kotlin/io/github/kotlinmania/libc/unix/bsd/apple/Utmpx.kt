package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Utmpx(
    val utUser: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utPid: Int,
    val utType: Short,
    val utTv: Timeval,
    val utHost: ByteArray,
)
