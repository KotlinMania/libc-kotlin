package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class Statfs(
    val fType: Long,
    val fBsize: Long,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: FsidT,
    val fNamelen: Long,
    val fFrsize: Long,
    val fSpare: List<Long>,
)
