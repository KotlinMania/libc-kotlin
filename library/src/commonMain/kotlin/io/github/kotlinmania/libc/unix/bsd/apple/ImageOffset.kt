package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ImageOffset(
    val uuid: UByteArray,
    val offset: UInt,
)
