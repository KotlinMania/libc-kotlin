package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public data class PtraceThreadState(
    val ptsTid: Int,
    val ptsName: ByteArray,
)
