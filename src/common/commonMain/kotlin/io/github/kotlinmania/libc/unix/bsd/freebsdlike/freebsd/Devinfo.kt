package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Devinfo(
    val devices: Devstat?,
    val memPtr: COpaquePointer?,
    val generation: Long,
    val numdevs: Int,
)
