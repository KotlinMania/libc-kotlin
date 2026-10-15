// port-lint: source unix/linux_like/linux/gnu/b64/aarch64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.aarch64

import io.github.kotlinmania.libc.*

public data class UcontextT(
    val ucFlags: ULong,
    val ucLink: UcontextT?,
    val ucStack: StackT,
    val ucSigmask: ULong,
    val ucMcontext: McontextT,
)
