// port-lint: source unix/linux_like/linux/gnu/b64/riscv64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.riscv64

import io.github.kotlinmania.libc.*

public data class Flock64(
    val lType: Short,
    val lWhence: Short,
    val lStart: Long,
    val lLen: Long,
    val lPid: Int,
)
