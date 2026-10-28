package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public data class Msg(
    val msgNext: Msg?,
    val msgType: Long,
    val msgTs: UShort,
    val msgSpot: Short,
)
