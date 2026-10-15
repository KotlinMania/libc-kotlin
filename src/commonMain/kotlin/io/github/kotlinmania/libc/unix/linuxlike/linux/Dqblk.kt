package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class Dqblk(
    val dqbBhardlimit: ULong,
    val dqbBsoftlimit: ULong,
    val dqbCurspace: ULong,
    val dqbIhardlimit: ULong,
    val dqbIsoftlimit: ULong,
    val dqbCurinodes: ULong,
    val dqbBtime: ULong,
    val dqbItime: ULong,
    val dqbValid: UInt,
)
