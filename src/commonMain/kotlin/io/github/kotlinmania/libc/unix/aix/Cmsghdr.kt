// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Cmsghdr(
    val cmsgLen: UInt,
    val cmsgLevel: Int,
    val cmsgType: Int,
)
