package io.github.kotlinmania.libc.unix.linuxlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.Msghdr

public data class Mmsghdr(
    val msgHdr: Msghdr,
    val msgLen: UInt,
)
