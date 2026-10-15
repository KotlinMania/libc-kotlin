// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class Cmsghdr(
    val cmsgLen: UInt,
    val cmsgLevel: Int,
    val cmsgType: Int,
)
