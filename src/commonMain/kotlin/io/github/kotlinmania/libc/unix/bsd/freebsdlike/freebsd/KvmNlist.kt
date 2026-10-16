package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class KvmNlist(
    val nName: String?,
    val nType: UByte,
    val nValue: ULong,
)
