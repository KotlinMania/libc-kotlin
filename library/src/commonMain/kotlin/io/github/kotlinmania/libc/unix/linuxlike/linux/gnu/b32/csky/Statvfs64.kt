package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.csky

import io.github.kotlinmania.libc.*

public data class Statvfs64(
    val fBsize: ULong,
    val fFrsize: ULong,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFavail: ULong,
    val fFsid: ULong,
    val fFlag: ULong,
    val fNamemax: ULong,
    val fSpare: IntArray,
)
