// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Sockaddr(
    val saFamily: UShort,
    val saData: ByteArray,
)
