// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saMask: UInt,
    val saFlags: Int,
)
