// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Iovec(
    val handle: Long = 0L,
    val iovBase: COpaquePointer?,
    val iovLen: ULong,
)
