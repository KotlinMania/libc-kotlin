package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timeval

public data class InputEvent(
    val time: Timeval,
    val type: UShort,
    val code: UShort,
    val value: Int,
)
