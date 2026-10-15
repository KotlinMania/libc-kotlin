package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class MmapobjResultT(
    val mrAddr: String?,
    val mrMsize: ULong,
    val mrFsize: ULong,
    val mrOffset: ULong,
    val mrProt: UInt,
    val mrFlags: UInt,
)
