package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class UdfArgs(
    val fspec: String?,
    val lastblock: UInt,
)
