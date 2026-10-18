package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval

public data class Utmpx(
    val utType: Short,
    val utPid: Int,
    val utLine: ByteArray,
    val utId: ByteArray,
    val utTime: Long,
    val utUser: ByteArray,
    val utHost: ByteArray,
    val utAddr: Long,
    val utTv: Timeval,
)
