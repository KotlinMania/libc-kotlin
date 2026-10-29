package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class TaskThreadTimesInfo(
    val userTime: TimeValueT,
    val systemTime: TimeValueT,
)
