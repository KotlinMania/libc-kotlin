// port-lint: source unix/linux_like/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class FileCloneRange(
    val srcFd: Long,
    val srcOffset: ULong,
    val srcLength: ULong,
    val destOffset: ULong,
)
