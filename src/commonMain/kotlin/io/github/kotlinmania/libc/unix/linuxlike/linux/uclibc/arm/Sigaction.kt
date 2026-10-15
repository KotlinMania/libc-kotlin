// port-lint: source unix/linux_like/linux/uclibc/arm/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.arm

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saFlags: ULong,
    val saRestorer: (() -> Unit)?,
    val saMask: SigsetT,
)
