// port-lint: source unix/linux_like/linux/gnu/b32/mips/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.mips

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saFlags: Int,
    val saSigaction: ULong,
    val saMask: ULong,
    val saRestorer: (() -> Unit)?,
    val resv: IntArray,
)
