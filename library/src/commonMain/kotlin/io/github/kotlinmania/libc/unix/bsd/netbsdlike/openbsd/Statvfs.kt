package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class Statvfs(
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
)
