package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.arm

import io.github.kotlinmania.libc.*

public data class Statfs(
    val fType: Int,
    val fBsize: Int,
    val fBlocks: ULong,
    val fBfree: ULong,
    val fBavail: ULong,
    val fFiles: ULong,
    val fFfree: ULong,
    val fFsid: ULong,
    val fNamelen: Int,
    val fFrsize: Int,
    val fFlags: Int,
    val fSpare: IntArray,
)
