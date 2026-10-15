// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class SockaddrNl(
    val nlFamily: UShort,
    val nlPid: UInt,
    val nlGroups: UInt,
)
