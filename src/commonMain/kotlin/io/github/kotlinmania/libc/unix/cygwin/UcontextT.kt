package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class UcontextT(
    val ucMcontext: McontextT,
    val ucLink: UcontextT?,
    val ucSigmask: ULong,
    val ucStack: StackT,
    val ucFlags: ULong,
)
