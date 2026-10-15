// port-lint: source unix/newlib/horizon/mod.rs
package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*

public data class SockaddrIn(
    val sinFamily: UShort,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinZero: ByteArray,
)
