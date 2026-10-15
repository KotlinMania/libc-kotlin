// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class LoadCommand(
    val cmd: UInt,
    val cmdsize: UInt,
)
