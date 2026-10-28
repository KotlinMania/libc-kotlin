package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class PthreadRwlockT(
    val active: Int,
    val blockedwriters: Int,
    val blockedreaders: Int,
    val heavy: Int,
    val lock: io.github.kotlinmania.libc.unix.nto.SyncT,
    val rcond: io.github.kotlinmania.libc.unix.nto.SyncT,
    val wcond: io.github.kotlinmania.libc.unix.nto.SyncT,
    val owner: UInt,
    val spare: UInt,
)
