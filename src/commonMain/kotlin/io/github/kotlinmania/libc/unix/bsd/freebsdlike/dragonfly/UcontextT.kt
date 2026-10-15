package io.github.kotlinmania.libc.unix.bsd.freebsdlike.dragonfly

import io.github.kotlinmania.libc.*

public data class UcontextT(
    val ucSigmask: ULong,
    val ucMcontext: McontextT,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucCofunc: ((UcontextT?, COpaquePointer?) -> Unit)?,
    val ucArg: COpaquePointer?,
)
