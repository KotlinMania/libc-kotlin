package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.x8664
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: UInt,
    val msgIov: Iovec?,
    val msgIovlen: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: Int,
)
