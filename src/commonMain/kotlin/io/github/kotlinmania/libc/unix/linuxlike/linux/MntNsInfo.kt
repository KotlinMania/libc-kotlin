package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class MntNsInfo(
    val size: UInt,
    val nrMounts: UInt,
    val mntNsId: ULong,
)
