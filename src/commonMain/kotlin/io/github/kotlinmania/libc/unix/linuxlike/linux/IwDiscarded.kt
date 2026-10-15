// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class IwDiscarded(
    val nwid: UInt,
    val code: UInt,
    val fragment: UInt,
    val retries: UInt,
    val pubmisc: UInt,
)
