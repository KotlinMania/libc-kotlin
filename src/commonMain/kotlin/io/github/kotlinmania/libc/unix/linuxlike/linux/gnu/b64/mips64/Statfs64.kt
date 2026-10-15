package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.mips64

import io.github.kotlinmania.libc.*

public data class Statfs64(
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
    val fFlags: Long,
    val fSpare: LongArray,
)
