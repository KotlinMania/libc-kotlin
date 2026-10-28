package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.riscv32

import io.github.kotlinmania.libc.*

public data class StackT(
    val ssSp: COpaquePointer?,
    val ssFlags: Int,
    val ssSize: ULong,
)
