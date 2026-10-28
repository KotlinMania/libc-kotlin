package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.riscv32

import io.github.kotlinmania.libc.*

public data class RiscvMcDExtState(
    val f: ULongArray,
    val fcsr: UInt,
)
