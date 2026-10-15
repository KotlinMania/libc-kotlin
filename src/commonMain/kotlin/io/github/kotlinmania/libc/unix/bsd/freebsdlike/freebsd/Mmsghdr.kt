package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: Long,
)
