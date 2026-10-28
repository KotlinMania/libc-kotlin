package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class PtracePeeksiginfoArgs(
    val off: ULong,
    val flags: UInt,
    val nr: Int,
)
