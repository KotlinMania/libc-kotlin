// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class SockFilter(
    val code: UShort,
    val jt: UByte,
    val jf: UByte,
    val k: UInt,
)
