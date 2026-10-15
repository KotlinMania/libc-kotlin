// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public data class Timespec(
    val handle: Long = 0L,
    val tvSec: Long,
    val tvNsec: Long,
    val tvNsec2: Long,
)
