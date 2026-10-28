package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class IwQuality(
    val qual: UByte,
    val level: UByte,
    val noise: UByte,
    val updated: UByte,
)
