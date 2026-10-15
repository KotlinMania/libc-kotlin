// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.FanotifyEventInfoHeader

public data class FanotifyEventInfoError(
    val hdr: FanotifyEventInfoHeader,
    val error: Int,
    val errorCount: UInt,
)
