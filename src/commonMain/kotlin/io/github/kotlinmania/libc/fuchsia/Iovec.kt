// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Iovec(
    val handle: Long = 0L,
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)
