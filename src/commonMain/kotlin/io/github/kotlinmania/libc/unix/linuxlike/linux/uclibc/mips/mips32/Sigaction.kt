// port-lint: source unix/linux_like/linux/uclibc/mips/mips32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saFlags: UInt,
    val saSigaction: ULong,
    val saMask: SigsetT,
    val restorer: COpaquePointer?,
)
