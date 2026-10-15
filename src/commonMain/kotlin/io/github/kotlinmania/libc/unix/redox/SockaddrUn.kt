// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public data class SockaddrUn(
    val sunFamily: UShort,
    val sunPath: ByteArray,
)
