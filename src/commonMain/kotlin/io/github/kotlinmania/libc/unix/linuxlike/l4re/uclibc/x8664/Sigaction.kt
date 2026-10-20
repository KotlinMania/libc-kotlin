package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc.x8664

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saHandler: ULong,
    val saFlags: ULong,
    val saRestorer: io.github.kotlinmania.libc.SignalRestorer?,
    val saMask: SigsetT,
)
