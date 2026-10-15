// port-lint: source unix/newlib/aarch64/mod.rs
package io.github.kotlinmania.libc.unix.newlib.aarch64

import io.github.kotlinmania.libc.*

public data class Sockaddr(
    val saLen: UByte,
    val saFamily: UShort,
    val saData: ByteArray,
)
