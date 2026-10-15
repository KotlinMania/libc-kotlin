// port-lint: source unix/linux_like/linux/musl/b32/arm/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.arm

import io.github.kotlinmania.libc.*

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: Int,
    val ssSize: ULong,
)
