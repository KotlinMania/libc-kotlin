// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class StTimespec(
    val tvSec: Long,
    val tvNsec: Int,
)
