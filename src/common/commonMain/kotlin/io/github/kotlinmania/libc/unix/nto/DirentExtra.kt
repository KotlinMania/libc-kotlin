package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class DirentExtra(
    val dDatalen: UShort,
    val dType: UShort,
)
