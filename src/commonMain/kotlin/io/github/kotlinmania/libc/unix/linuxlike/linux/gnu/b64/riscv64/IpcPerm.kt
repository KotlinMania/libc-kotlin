// port-lint: source unix/linux_like/linux/gnu/b64/riscv64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.riscv64

import io.github.kotlinmania.libc.*

public data class IpcPerm(
    val key: Int,
    val uid: UInt,
    val gid: UInt,
    val cuid: UInt,
    val cgid: UInt,
    val mode: UShort,
    val seq: UShort,
)
