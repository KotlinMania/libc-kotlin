package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class FanotifyResponse(
    val fd: Int,
    val response: UInt,
)
