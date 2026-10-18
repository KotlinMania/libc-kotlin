package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.riscv64
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.StackT

import io.github.kotlinmania.libc.*

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucSigmask: ULong,
    val ucMcontext: McontextT,
)
