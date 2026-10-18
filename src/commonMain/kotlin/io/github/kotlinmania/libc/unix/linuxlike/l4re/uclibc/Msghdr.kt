package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc
import io.github.kotlinmania.libc.unix.Iovec

import io.github.kotlinmania.libc.*

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: UInt,
    val msgIov: Iovec?,
    val msgIovlen: Int,
    val msgIovlen2: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: UInt,
    val msgControllen2: ULong,
    val msgFlags: Int,
)
