package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class AfAlgIv(
    val ivlen: UInt,
    val iv: UByteArray,
)
