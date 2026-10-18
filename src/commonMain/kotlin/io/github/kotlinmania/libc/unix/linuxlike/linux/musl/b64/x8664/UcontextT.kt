package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.x8664
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.StackT

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmask: ULong,
    val private: UByteArray,
)
