// port-lint: source unix/linux_like/l4re/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

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
    val fSpare: List<Long>,
)
