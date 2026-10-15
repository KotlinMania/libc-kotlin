package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.x86

import io.github.kotlinmania.libc.*

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmask: ULong,
    val private: UByteArray,
)
