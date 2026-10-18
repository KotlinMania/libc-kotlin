package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class TpacketRolloverStats(
    val tpAll: ULong,
    val tpHuge: ULong,
    val tpFailed: ULong,
)
