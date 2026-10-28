package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public data class Dqblk(
    val dqbBhardlimit: UInt,
    val dqbBsoftlimit: UInt,
    val dqbCurblocks: UInt,
    val dqbIhardlimit: UInt,
    val dqbIsoftlimit: UInt,
    val dqbCurinodes: UInt,
    val dqbBtime: Int,
    val dqbItime: Int,
)
