package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class UcontextT(
    val ucLink: UcontextT?,
    val ucSigmask: SigsetT,
    val ucStack: StackT,
    val ucMcontext: McontextT,
)
