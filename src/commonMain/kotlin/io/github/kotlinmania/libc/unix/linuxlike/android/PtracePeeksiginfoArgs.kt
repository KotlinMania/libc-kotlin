package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class PtracePeeksiginfoArgs(
    val off: ULong,
    val flags: UInt,
    val nr: Int,
)
