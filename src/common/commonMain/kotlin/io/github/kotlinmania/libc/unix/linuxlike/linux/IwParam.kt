package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class IwParam(
    val value: Int,
    val fixed: UByte,
    val disabled: UByte,
    val flags: UShort,
)
