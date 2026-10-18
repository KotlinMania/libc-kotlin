package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class Nlattr(
    val nlaLen: UShort,
    val nlaType: UShort,
)
