// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class SfHdtr(
    val headers: Iovec?,
    val hdrCnt: Int,
    val trailers: Iovec?,
    val trlCnt: Int,
)
