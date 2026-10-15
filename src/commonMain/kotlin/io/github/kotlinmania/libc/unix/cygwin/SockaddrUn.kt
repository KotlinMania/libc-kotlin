// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class SockaddrUn(
    val sunFamily: UShort,
    val sunPath: ByteArray,
)
