// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class GlobT(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
)
