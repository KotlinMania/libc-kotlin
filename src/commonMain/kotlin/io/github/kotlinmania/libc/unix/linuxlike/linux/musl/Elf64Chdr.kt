// port-lint: source unix/linux_like/linux/musl/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public data class Elf64Chdr(
    val chType: UInt,
    val chReserved: UInt,
    val chSize: ULong,
    val chAddralign: ULong,
)
