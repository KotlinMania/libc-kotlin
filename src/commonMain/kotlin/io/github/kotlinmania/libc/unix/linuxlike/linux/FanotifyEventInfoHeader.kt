// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class FanotifyEventInfoHeader(
    val infoType: UByte,
    val pad: UByte,
    val len: UShort,
)
