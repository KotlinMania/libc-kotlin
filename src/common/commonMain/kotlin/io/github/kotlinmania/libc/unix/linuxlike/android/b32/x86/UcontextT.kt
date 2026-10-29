package io.github.kotlinmania.libc.unix.linuxlike.android.b32.x86
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.android.StackT

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmaskCAnonymousUnion: CAnonymousUcSigmask,
    val fpregsMem: LibcFpstate,
)
