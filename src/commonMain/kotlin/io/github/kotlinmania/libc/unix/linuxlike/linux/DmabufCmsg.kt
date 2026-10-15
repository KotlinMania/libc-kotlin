// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class DmabufCmsg(
    val fragOffset: ULong,
    val fragSize: UInt,
    val fragToken: UInt,
    val dmabufId: UInt,
    val flags: UInt,
)
