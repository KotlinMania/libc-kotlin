package io.github.kotlinmania.libc.unix.bsd.netbsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.Msghdr

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: UInt,
)
