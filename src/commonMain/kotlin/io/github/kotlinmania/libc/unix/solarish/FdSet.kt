// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class FdSet(
    val fdsBits: LongArray,
    val fdsBits2: IntArray,
)
