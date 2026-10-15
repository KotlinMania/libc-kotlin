package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class Cmsghdr(
    val cmsgLen: ULong,
    val cmsgLevel: Int,
    val cmsgType: Int,
)
