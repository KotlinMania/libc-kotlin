package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public data class Statfs(
    val fType: Long,
    val fBsize: Long,
    val fBlocks: Long,
    val fBfree: Long,
    val fBavail: Long,
    val fFiles: Long,
    val fFfree: Long,
    val fFsid: Long,
    val fNamelen: Long,
    val fSpare: LongArray,
)
