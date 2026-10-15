package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public data class Cmsghdr(
    val cmsgLen: UInt,
    val cmsgLevel: Int,
    val cmsgType: Int,
    val handle: Long = 0L,
)
