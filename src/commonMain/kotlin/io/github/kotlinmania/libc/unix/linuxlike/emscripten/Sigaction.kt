package io.github.kotlinmania.libc.unix.linuxlike.emscripten

import io.github.kotlinmania.libc.*

public data class Sigaction(
    val saSigaction: ULong,
    val saMask: SigsetT,
    val saFlags: Int,
    val saRestorer: (() -> Unit)?,
)
