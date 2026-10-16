package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class FusefsArgs(
    val name: String?,
    val fd: Int,
    val maxRead: Int,
    val allowOther: Int,
)
