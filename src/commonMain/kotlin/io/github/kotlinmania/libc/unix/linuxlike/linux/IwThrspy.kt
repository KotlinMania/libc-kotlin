// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class IwThrspy(
    val addr: Sockaddr,
    val qual: IwQuality,
    val low: IwQuality,
    val high: IwQuality,
)
