package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class UinputUserDev(
    val name: ByteArray,
    val id: InputId,
    val ffEffectsMax: UInt,
    val absmax: List<Int>,
    val absmin: List<Int>,
    val absfuzz: List<Int>,
    val absflat: List<Int>,
)
