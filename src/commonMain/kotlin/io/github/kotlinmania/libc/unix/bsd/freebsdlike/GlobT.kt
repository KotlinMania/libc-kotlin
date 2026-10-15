// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class GlobT(
    val glPathc: ULong,
    val glMatchc: ULong,
    val glOffs: ULong,
    val glFlags: Int,
    val glPathv: COpaquePointer?,
)
