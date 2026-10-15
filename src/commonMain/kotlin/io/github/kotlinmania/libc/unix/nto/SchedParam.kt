package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class SchedParam(
    val schedPriority: Int,
    val schedCurpriority: Int,
)
