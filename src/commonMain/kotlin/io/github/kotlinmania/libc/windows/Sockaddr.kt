// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public data class Sockaddr(
    val saFamily: UShort,
    val saData: ByteArray,
)
