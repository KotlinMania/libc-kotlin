// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class SockaddrUn(
    val sunLen: UByte,
    val sunFamily: UByte,
    val sunPath: ByteArray,
)
