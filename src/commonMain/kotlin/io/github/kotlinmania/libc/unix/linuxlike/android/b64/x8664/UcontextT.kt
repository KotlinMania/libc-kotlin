// port-lint: source unix/linux_like/android/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android.b64.x8664

import io.github.kotlinmania.libc.*

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucMcontext: McontextT,
    val ucSigmask64: CAnonymousUcSigmask,
    val fpregsMem: LibcFpstate,
)
