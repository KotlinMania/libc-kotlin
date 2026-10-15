// port-lint: source unix/linux_like/linux/gnu/b32/x86/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.x86

import io.github.kotlinmania.libc.*

public data class Statfs64(
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
    val fSpare: List<Long>,
)
