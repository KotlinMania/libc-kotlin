// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Timespec(
    val handle: Long = 0L,
    val tvSec: Long,
    val tvNsec: Long,
)
