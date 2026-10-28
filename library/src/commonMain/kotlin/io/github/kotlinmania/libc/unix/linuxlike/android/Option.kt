package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class Option(
    val name: String?,
    val hasArg: Int,
    val flag: Int?,
    val value: Int,
)
