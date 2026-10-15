// port-lint: source unix/newlib/arm/mod.rs
package io.github.kotlinmania.libc.unix.newlib.arm

import io.github.kotlinmania.libc.*

public data class SockaddrIn(
    val sinFamily: UShort,
    val sinPort: UShort,
    val sinAddr: InAddr,
    val sinZero: UByteArray,
)
