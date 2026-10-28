package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SeccompNotif(
    val id: ULong,
    val pid: UInt,
    val flags: UInt,
    val data: SeccompData,
)
