package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: UInt,
    val msgIov: Iovec?,
    val msgIovlen: ULong,
    val msgControl: COpaquePointer?,
    val msgControllen: ULong,
    val msgFlags: Int,
)
