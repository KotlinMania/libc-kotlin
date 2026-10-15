// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class EpollEvent(
    val events: UInt,
    val u64: ULong,
)
