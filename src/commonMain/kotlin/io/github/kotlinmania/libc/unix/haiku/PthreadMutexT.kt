package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class PthreadMutexT(
    val flags: UInt,
    val lock: Int,
    val owner: Int,
    val ownerCount: Int,
)
