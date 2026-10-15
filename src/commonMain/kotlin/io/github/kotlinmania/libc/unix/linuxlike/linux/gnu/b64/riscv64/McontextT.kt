// port-lint: source unix/linux_like/linux/gnu/b64/riscv64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.riscv64

import io.github.kotlinmania.libc.*

public data class McontextT(
    val gregs: ULongArray,
    val fpregs: RiscvMcFpState,
)
