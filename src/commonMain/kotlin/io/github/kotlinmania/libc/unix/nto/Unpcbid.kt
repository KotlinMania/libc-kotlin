// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Unpcbid(
    val unpPid: Int,
    val unpEuid: UInt,
    val unpEgid: UInt,
)
