package io.github.kotlinmania.libc.unix.bsd.apple
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public data class SfHdtr(
    val headers: Iovec?,
    val hdrCnt: Int,
    val trailers: Iovec?,
    val trlCnt: Int,
)
