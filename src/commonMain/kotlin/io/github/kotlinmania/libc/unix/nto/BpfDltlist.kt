package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class BpfDltlist(
    val bflLen: UInt,
    val bflList: UInt?,
)
