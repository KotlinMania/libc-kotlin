package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PtraceLwpinfo(
    val plLwpid: Int,
    val plEvent: Int,
)
