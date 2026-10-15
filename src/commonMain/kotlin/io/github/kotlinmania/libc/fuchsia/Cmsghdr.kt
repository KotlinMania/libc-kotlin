// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Cmsghdr(
    val cmsgLen: UInt,
    val pad1: Int,
    val cmsgLevel: Int,
    val cmsgType: Int,
)
