package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class FposT(
    val pos: Long,
    val pos2: Long,
    val state: MbstateT,
)
