package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ProcFdinfo(
    val procFd: Int,
    val procFdtype: UInt,
)
