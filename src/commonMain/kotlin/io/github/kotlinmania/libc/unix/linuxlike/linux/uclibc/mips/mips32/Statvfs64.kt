package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32

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
    val fUnused: Int,
    val fFlag: ULong,
    val fNamemax: ULong,
    val fSpare: IntArray,
)
