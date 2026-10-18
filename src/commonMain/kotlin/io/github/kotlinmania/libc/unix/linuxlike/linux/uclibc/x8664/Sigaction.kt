package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saHandler: ULong,
    val saFlags: ULong,
    val saRestorer: (() -> Unit)?,
    val saMask: SigsetT,
)
