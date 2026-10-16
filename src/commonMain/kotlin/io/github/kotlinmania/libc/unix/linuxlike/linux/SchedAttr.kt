package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class SchedAttr(
    val size: UInt,
    val schedPolicy: UInt,
    val schedFlags: ULong,
    val schedNice: Int,
    val schedPriority: UInt,
    val schedRuntime: ULong,
    val schedDeadline: ULong,
    val schedPeriod: ULong,
)
