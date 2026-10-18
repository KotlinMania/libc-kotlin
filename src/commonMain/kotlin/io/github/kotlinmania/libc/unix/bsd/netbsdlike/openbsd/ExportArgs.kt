package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd
import io.github.kotlinmania.libc.unix.bsd.Sockaddr

import io.github.kotlinmania.libc.*

public data class ExportArgs(
    val exFlags: Int,
    val exRoot: UInt,
    val exAnon: Xucred,
    val exAddr: Sockaddr?,
    val exAddrlen: Int,
    val exMask: Sockaddr?,
    val exMasklen: Int,
)
