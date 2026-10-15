package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class UinputFfErase(
    val requestId: UInt,
    val retval: Int,
    val effectId: UInt,
)
