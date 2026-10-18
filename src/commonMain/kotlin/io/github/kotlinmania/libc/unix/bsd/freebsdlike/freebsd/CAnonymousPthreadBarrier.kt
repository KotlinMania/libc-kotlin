package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class CAnonymousPthreadBarrier(
    val bLock: Umutex,
    val bCv: Ucond,
    val bCycle: Long,
    val bCount: Int,
    val bWaiters: Int,
    val bRefcount: Int,
    val bDestroying: Int,
)
