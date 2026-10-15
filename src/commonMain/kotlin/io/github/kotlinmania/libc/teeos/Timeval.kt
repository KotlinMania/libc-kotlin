// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public data class Timeval(
    val handle: Long = 0L,
    val tvSec: Long,
    val tvUsec: Long,
)
