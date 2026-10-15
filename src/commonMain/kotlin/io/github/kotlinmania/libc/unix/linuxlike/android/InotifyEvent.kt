package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class InotifyEvent(
    val wd: Int,
    val mask: UInt,
    val cookie: UInt,
    val len: UInt,
)
