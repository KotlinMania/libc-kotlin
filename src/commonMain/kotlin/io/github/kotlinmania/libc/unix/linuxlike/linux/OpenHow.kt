// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class OpenHow(
    val flags: ULong,
    val mode: ULong,
    val resolve: ULong,
)
