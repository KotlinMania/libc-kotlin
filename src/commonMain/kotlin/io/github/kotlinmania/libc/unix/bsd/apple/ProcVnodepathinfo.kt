package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ProcVnodepathinfo(
    val pviCdir: VnodeInfoPath,
    val pviRdir: VnodeInfoPath,
)
