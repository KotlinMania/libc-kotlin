// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class SockaddrUn(
    val sunLen: UByte,
    val sunFamily: UByte,
    val sunPath: ByteArray,
)
