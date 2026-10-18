package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.Timeval

import io.github.kotlinmania.libc.*

public data class Utmpx(
    val utType: Short,
    val utTv: Timeval,
    val utId: ByteArray,
    val utPid: Int,
    val utUser: ByteArray,
    val utLine: ByteArray,
    val utHost: ByteArray,
    val utSpare: ByteArray,
)
