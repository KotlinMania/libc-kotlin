package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.riscv64

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class RiscvMcFpState(
    val f: RiscvMcFExtState? = null,
    val d: RiscvMcDExtState? = null,
    val q: RiscvMcQExtState? = null,
)
