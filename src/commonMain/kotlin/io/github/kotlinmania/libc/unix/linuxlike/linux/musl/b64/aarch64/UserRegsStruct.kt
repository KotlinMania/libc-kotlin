// port-lint: source unix/linux_like/linux/musl/b64/aarch64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.aarch64

import io.github.kotlinmania.libc.*

public data class UserRegsStruct(
    val regs: ULongArray,
    val sp: ULong,
    val pc: ULong,
    val pstate: ULong,
)
