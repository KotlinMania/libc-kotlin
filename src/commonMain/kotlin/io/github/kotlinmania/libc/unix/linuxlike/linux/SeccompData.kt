// port-lint: source unix/linux_like/linux/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SeccompData(
    val nr: Int,
    val arch: UInt,
    val instructionPointer: ULong,
    val args: List<ULong>,
)
