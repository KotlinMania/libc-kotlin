package io.github.kotlinmania.libc.unix.bsd.freebsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public data class SfHdtr(
    val headers: Iovec?,
    val hdrCnt: Int,
    val trailers: Iovec?,
    val trlCnt: Int,
)
