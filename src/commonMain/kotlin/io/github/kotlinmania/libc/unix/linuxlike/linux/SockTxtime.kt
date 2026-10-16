package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SockTxtime(
    val clockid: Int,
    val flags: UInt,
)
