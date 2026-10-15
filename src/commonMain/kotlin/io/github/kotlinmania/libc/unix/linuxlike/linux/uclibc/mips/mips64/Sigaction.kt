// port-lint: source unix/linux_like/linux/uclibc/mips/mips64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips64

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saFlags: Int,
    val saSigaction: ULong,
    val saMask: SigsetT,
    val restorer: COpaquePointer?,
)
