package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class Nlmsgerr(
    val error: Int,
    val msg: Nlmsghdr,
)
