package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.loongarch64

import io.github.kotlinmania.libc.*

public data class McontextT(
    val pc: ULong,
    val gregs: ULongArray,
    val flags: UInt,
    val extcontext: ULongArray,
)
