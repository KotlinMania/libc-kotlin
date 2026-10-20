package io.github.kotlinmania.libc.unix.linuxlike.android.b64

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saFlags: Int,
    val saSigaction: ULong,
    val saMask: SigsetT,
    val saRestorer: io.github.kotlinmania.libc.SignalRestorer?,
)
