package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class UinputSetup(
    val id: InputId,
    val name: ByteArray,
    val ffEffectsMax: UInt,
)
