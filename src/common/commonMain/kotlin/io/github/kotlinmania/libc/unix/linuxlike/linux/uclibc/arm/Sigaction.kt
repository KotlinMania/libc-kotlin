package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.arm

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saFlags: ULong,
    val saRestorer: io.github.kotlinmania.libc.SignalRestorer?,
    val saMask: SigsetT,
)
