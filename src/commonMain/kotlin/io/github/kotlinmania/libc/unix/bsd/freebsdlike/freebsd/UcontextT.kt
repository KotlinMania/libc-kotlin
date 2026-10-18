package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class UcontextT(
    val ucSigmask: ULong,
    val ucMcontext: McontextT,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucFlags: Int,
    val spare: IntArray,
)
