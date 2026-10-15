// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class RegexT(
    val buffer: COpaquePointer?,
    val allocated: ULong,
    val used: ULong,
    val syntax: ULong,
    val fastmap: String?,
    val translate: String?,
    val reNsub: ULong,
    val bitfield: UByte,
)
