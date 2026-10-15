// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class EpollEvent(
    val events: UInt,
    val u64: ULong,
)
