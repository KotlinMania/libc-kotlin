// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public data class Timespec(
    val handle: Long = 0L,
    val tvSec: Long,
    val tvNsec: Long,
)
