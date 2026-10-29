package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class SemT(
    val semCount: UInt,
    val semType: UShort,
    val semMagic: UShort,
    val semPad1: ULongArray,
    val semPad2: ULongArray,
)
