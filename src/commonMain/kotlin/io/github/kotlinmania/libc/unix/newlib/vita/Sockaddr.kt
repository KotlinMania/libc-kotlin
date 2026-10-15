// port-lint: source unix/newlib/vita/mod.rs
package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public data class Sockaddr(
    val saLen: UByte,
    val saFamily: UShort,
    val saData: ByteArray,
)
