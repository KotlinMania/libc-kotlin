package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class Utmpx(
    val utType: Short,
    val utTv: Timeval,
    val utId: ByteArray,
    val utPid: Int,
    val utUser: ByteArray,
    val utLine: ByteArray,
    val utHost: ByteArray,
)
