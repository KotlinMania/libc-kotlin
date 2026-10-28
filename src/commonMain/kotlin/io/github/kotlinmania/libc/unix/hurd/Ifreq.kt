package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Ifreq(
    val ifrName: ByteArray,
    val ifrIfru: Sockaddr,
)
