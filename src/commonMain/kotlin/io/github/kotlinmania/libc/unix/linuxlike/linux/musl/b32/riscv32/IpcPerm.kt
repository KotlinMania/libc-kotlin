// port-lint: source unix/linux_like/linux/musl/b32/riscv32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.riscv32

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
