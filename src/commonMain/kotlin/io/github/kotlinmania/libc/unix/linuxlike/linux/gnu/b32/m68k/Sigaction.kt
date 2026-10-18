package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b32.m68k

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saMask: ULong,
    val saFlags: Int,
    val saRestorer: (() -> Unit)?,
)
