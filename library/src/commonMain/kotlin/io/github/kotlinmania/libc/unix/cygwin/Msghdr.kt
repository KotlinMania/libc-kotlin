package io.github.kotlinmania.libc.unix.cygwin
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Iovec

public data class Msghdr(
    val msgName: COpaquePointer?,
    val msgNamelen: Int,
    val msgIov: Iovec?,
    val msgIovlen: Int,
    val msgControl: COpaquePointer?,
    val msgControllen: Int,
    val msgFlags: Int,
)
