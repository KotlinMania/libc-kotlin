package io.github.kotlinmania.libc.unix.linuxlike.emscripten
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: UInt,
    val msgIov: Iovec?,
    val msgIovlen: Int,
    val msgControl: COpaquePointer?,
    val msgControllen: UInt,
    val msgFlags: Int,
)
