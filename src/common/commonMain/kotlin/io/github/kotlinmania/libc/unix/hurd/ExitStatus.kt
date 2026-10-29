package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class ExitStatus(
    val eTermination: Short,
    val eExit: Short,
)
