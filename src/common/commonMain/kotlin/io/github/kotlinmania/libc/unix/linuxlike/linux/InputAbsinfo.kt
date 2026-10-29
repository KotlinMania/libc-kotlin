package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class InputAbsinfo(
    val value: Int,
    val minimum: Int,
    val maximum: Int,
    val fuzz: Int,
    val flat: Int,
    val resolution: Int,
)
