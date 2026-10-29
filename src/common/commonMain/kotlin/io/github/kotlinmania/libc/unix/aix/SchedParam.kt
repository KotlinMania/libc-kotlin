package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class SchedParam(
    val schedPriority: Int,
    val schedPolicy: Int,
)
