package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public data class Elf32Chdr(
    val chType: UInt,
    val chSize: UInt,
    val chAddralign: UInt,
)
