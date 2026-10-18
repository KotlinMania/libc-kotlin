package io.github.kotlinmania.libc.unix.linuxlike.linux

import io.github.kotlinmania.libc.*

public data class InputEvent(
    val time: Timeval,
    val inputEventSec: ULong,
    val inputEventUsec: ULong,
    val type: UShort,
    val code: UShort,
    val value: Int,
)
