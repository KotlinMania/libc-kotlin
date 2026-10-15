// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public data class EpollEvent(
    val events: UInt,
    val u64: ULong,
    val pad: ULong,
)
