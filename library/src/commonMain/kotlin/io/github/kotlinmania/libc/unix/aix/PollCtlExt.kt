package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class PollCtlExt(
    val version: UByte,
    val command: UByte,
    val events: Short,
    val fd: Int,
    val u: PollCtlExtU,
)
