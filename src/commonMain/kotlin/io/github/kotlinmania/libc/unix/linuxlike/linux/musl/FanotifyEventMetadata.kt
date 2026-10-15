// port-lint: source unix/linux_like/linux/musl/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public data class FanotifyEventMetadata(
    val eventLen: UInt,
    val vers: UByte,
    val reserved: UByte,
    val metadataLen: UShort,
    val mask: ULong,
    val fd: Int,
    val pid: Int,
)
