package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class InputEvent(
    val time: Timeval,
    val type: UShort,
    val code: UShort,
    val value: Int,
)
