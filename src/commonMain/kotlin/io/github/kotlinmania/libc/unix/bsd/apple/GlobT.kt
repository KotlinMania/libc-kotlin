// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class GlobT(
    val glPathc: ULong,
    val glOffs: ULong,
    val glPathv: COpaquePointer?,
)
