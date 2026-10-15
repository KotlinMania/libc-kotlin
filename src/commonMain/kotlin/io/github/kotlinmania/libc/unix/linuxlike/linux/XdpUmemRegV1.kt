// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class XdpUmemRegV1(
    val addr: ULong,
    val len: ULong,
    val chunkSize: UInt,
    val headroom: UInt,
)
