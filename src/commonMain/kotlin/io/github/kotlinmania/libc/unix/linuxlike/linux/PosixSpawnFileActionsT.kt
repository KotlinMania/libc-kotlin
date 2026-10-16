package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class PosixSpawnFileActionsT(
    val allocated: Int,
    val used: Int,
    val actions: Int?,
)
