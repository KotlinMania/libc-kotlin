// port-lint: source unix/linux_like/l4re/uclibc/aarch64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.aarch64

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saHandler: ULong,
    val saFlags: ULong,
    val saRestorer: (() -> Unit)?,
    val saMask: SigsetT,
)
