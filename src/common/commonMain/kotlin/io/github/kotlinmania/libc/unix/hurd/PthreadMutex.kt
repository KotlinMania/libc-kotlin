package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class PthreadMutex(
    val lock: UInt,
    val ownerId: UInt,
    val cnt: UInt,
    val shpid: Int,
    val type: Int,
    val flags: Int,
)
