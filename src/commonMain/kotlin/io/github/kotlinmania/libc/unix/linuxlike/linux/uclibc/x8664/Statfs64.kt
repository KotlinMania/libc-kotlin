package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class Statfs64(
    val fType: Int,
    val fBsize: Int,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: FsidT,
    val fNamelen: Int,
    val fFrsize: Int,
    val fFlags: Int,
    val fSpare: IntArray,
)
