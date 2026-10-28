package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.riscv32

import io.github.kotlinmania.libc.*

public data class RiscvMcFExtState(
    val f: UIntArray,
    val fcsr: UInt,
)
