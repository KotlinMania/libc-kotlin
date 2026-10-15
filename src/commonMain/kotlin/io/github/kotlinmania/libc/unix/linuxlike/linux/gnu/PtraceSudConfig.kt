// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class PtraceSudConfig(
    val mode: ULong,
    val selector: ULong,
    val offset: ULong,
    val len: ULong,
)
