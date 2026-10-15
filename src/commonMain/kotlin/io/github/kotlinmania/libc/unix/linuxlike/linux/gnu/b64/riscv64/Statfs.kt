// port-lint: source unix/linux_like/linux/gnu/b64/riscv64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.riscv64

import io.github.kotlinmania.libc.*

public data class Statfs(
    val fType: Long,
    val fBsize: Long,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fNamelen: Long,
    val fFrsize: Long,
    val fFlags: Long,
    val fSpare: LongArray,
)
