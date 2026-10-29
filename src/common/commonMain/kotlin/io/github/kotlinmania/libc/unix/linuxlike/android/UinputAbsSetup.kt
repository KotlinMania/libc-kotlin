package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class UinputAbsSetup(
    val code: UShort,
    val absinfo: InputAbsinfo,
)
