// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public data class Cmsghdr(
    val cmsgLen: UInt,
    val cmsgLevel: Int,
    val cmsgType: Int,
)
