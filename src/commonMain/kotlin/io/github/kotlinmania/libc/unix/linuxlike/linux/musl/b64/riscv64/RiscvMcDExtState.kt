// port-lint: source unix/linux_like/linux/musl/b64/riscv64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.riscv64

import io.github.kotlinmania.libc.*

public data class RiscvMcDExtState(
    val f: ULongArray,
    val fcsr: UInt,
)
