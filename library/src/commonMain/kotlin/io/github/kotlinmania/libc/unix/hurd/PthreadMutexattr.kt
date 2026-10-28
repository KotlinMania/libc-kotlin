package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class PthreadMutexattr(
    val prioceiling: Int,
    val protocol: UInt,
    val pshared: UInt,
    val mutexType: UInt,
)
