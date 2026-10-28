package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class SeccompMetadata(
    val filterOff: ULong,
    val flags: ULong,
)
