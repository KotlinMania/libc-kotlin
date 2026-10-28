package io.github.kotlinmania.libc.unix.linuxlike.android.b64.aarch64
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.android.StackT

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucSigmask: ULong,
    val ucMcontext: McontextT,
)
