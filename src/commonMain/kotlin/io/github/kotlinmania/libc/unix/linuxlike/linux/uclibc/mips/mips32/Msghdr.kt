package io.github.kotlinmania.libc.unix.linuxlike.linux.uclibc.mips.mips32
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: UInt,
    val msgIov: Iovec?,
    val msgIovlen: Int,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: Int,
)
