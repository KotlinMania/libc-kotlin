package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class Lastlog(
    val llTime: Long,
    val llLine: ByteArray,
    val llHost: ByteArray,
)
