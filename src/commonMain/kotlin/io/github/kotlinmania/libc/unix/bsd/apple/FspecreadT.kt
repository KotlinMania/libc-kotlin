// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class FspecreadT(
    val fsrFlags: UInt,
    val reserved: UInt,
    val fsrOffset: Long,
    val fsrLength: Long,
)
