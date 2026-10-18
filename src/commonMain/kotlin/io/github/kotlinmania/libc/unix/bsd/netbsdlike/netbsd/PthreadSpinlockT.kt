package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class PthreadSpinlockT(
    val ptsMagic: UInt,
    val ptsSpin: Byte,
    val ptsFlags: Int,
)
