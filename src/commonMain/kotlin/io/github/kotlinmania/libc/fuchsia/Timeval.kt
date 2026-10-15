// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Timeval(
    val handle: Long = 0L,
    val tvSec: Long,
    val tvUsec: Long,
)
