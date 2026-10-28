package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SeccompNotifAddfd(
    val id: ULong,
    val flags: UInt,
    val srcfd: UInt,
    val newfd: UInt,
    val newfdFlags: UInt,
)
