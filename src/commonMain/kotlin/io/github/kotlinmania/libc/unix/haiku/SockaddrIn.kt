// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public data class SockaddrIn(
    val sinLen: UByte,
    val sinFamily: UByte,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)
