// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class Arphdr(
    val arHrd: UShort,
    val arPro: UShort,
    val arHln: UByte,
    val arPln: UByte,
    val arOp: UShort,
)
