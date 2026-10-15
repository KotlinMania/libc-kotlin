// port-lint: source unix/linux_like/linux/musl/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public data class RegexT(
    val reNsub: ULong,
    val opaque: COpaquePointer?,
    val nsub2: ULong,
)
