package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public data class PthreadOnce(
    val run: Int,
    val lock: Int,
)
