package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class SockaddrNl(
    val nlFamily: UShort,
    val nlPid: UInt,
    val nlGroups: UInt,
)
