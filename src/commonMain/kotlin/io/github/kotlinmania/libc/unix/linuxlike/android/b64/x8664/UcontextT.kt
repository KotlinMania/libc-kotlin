package io.github.kotlinmania.libc.unix.linuxlike.android.b64.x8664
import io.github.kotlinmania.libc.unix.linuxlike.android.StackT

import io.github.kotlinmania.libc.*

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmask64: CAnonymousUcSigmask,
    val fpregsMem: LibcFpstate,
)
