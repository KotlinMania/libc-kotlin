// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class IwFreq(
    val m: Int,
    val e: Short,
    val i: UByte,
    val flags: UByte,
)
