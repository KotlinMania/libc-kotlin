// port-lint: source unix/linux_like/linux/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc

import io.github.kotlinmania.libc.*

public data class PtracePeeksiginfoArgs(
    val off: ULong,
    val flags: UInt,
    val nr: Int,
)
