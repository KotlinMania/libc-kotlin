package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class Sysctldesc(
    val descrNum: Int,
    val descrVer: UInt,
    val descrLen: UInt,
    val descrStr: ByteArray,
)
