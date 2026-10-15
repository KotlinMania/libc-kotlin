// port-lint: source unix/linux_like/linux/gnu/b32/sparc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.sparc

import io.github.kotlinmania.libc.*

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: Int,
    val ssSize: ULong,
)
