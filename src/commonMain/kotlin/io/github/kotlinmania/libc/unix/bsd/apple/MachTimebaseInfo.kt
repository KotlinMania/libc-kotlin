// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class MachTimebaseInfo(
    val numer: UInt,
    val denom: UInt,
)
