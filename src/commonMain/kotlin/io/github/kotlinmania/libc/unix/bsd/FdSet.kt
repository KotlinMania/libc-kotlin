// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public data class FdSet(
    val fdsBits: LongArray,
    val fdsBits2: IntArray,
)
