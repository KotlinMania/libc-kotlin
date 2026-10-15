// port-lint: source unix/linux_like/linux/musl/b32/mips/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32.mips

import io.github.kotlinmania.libc.*

public data class Statfs64(
    val fType: ULong,
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fBavail: ULong,
    val fFsid: ULong,
    val fNamelen: ULong,
    val fFlags: ULong,
    val fSpare: ULongArray,
)
