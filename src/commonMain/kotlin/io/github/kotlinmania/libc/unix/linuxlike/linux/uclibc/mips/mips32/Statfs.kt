package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

import io.github.kotlinmania.libc.*

public data class Statfs(
    val fType: Long,
    val fBsize: Long,
    val fFrsize: Long,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fBavail: ULong,
    val fFsid: ULong,
    val fNamelen: Long,
    val fSpare: LongArray,
)
