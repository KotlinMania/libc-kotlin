package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.riscv64

import io.github.kotlinmania.libc.*

public data class RiscvMcFExtState(
    val f: UIntArray,
    val fcsr: UInt,
)
