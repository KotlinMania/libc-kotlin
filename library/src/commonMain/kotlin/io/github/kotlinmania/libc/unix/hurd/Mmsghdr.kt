package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: UInt,
)
