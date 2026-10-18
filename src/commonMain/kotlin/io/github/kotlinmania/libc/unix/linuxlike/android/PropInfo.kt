package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class PropInfo(
    val name: ByteArray,
    val serial: UInt,
    val value: ByteArray,
)
