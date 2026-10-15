// port-lint: source unix/linux_like/linux/gnu/b32/arm/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.arm

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saMask: ULong,
    val saFlags: Int,
    val saRestorer: (() -> Unit)?,
)
