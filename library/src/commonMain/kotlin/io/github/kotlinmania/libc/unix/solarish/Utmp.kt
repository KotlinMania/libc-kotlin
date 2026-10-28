package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class Utmp(
    val utUser: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utPid: Short,
    val utType: Short,
    val utExit: ExitStatus,
    val utTime: Long,
)
