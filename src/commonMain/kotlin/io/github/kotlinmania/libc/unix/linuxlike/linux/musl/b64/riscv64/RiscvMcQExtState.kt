package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.riscv64

import io.github.kotlinmania.libc.*

public data class RiscvMcQExtState(
    val f: ULongArray,
    val fcsr: UInt,
    val glibcReserved: UIntArray,
)
