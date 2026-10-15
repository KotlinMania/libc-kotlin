package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class MountAttr(
    val attrSet: ULong,
    val attrClr: ULong,
    val propagation: ULong,
    val usernsFd: ULong,
)
