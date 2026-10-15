package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public data class IfNameindex(
    val ifIndex: UInt,
    val ifName: String?,
)
