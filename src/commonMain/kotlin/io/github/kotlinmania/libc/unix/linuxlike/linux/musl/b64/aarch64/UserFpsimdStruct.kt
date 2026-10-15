package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.aarch64

import io.github.kotlinmania.libc.*

public data class UserFpsimdStruct(
    val vregs: List<ByteArray>,
    val fpsr: UInt,
    val fpcr: UInt,
)
