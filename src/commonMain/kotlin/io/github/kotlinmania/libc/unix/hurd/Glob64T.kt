// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Glob64T(
    val glPathc: ULong,
    val glPathv: COpaquePointer?,
    val glOffs: ULong,
    val glFlags: Int,
)
