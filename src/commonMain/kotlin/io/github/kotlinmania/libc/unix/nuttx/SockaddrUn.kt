// port-lint: source unix/nuttx/mod.rs
package io.github.kotlinmania.libc.unix.nuttx

import io.github.kotlinmania.libc.*

public data class SockaddrUn(
    val sunFamily: UShort,
    val sunPath: ByteArray,
)
