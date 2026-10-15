// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public data class Iovec(
    val handle: Long = 0L,
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)
