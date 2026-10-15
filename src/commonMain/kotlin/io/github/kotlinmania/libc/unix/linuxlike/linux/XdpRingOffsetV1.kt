// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XdpRingOffsetV1(
    val producer: ULong,
    val consumer: ULong,
    val desc: ULong,
)
