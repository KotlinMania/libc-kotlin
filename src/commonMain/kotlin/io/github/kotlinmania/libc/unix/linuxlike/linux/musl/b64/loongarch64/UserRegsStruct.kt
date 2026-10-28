package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b64.loongarch64

import io.github.kotlinmania.libc.*

public data class UserRegsStruct(
    val regs: ULongArray,
    val origA0: ULong,
    val csrEra: ULong,
    val csrBadv: ULong,
    val reserved: ULongArray,
)
