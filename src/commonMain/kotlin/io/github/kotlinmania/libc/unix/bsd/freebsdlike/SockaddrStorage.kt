// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public data class SockaddrStorage(
    val ssLen: UByte,
    val ssFamily: UShort,
    val ssAlign: Long,
)
