package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SeccompData(
    val nr: Int,
    val arch: UInt,
    val instructionPointer: ULong,
    val args: List<ULong>,
)
