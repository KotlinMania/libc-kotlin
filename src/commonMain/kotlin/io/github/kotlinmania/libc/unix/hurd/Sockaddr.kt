// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class Sockaddr(
    val saLen: UByte,
    val saFamily: UByte,
    val saData: ByteArray,
)
