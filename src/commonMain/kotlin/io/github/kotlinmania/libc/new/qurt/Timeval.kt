// port-lint: source new/qurt/mod.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public data class Timeval(
    val handle: Long = 0L,
    val tvSec: Long,
    val tvUsec: Long,
)
