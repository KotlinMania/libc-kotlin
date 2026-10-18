package io.github.kotlinmania.libc.unix.linuxlike.linux.musl
import io.github.kotlinmania.libc.unix.Timeval

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
    val utSession2: Int,
    val utTv: Timeval,
    val utAddrV6: UIntArray,
)
