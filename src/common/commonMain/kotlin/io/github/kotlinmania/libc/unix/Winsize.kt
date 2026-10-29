package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public data class Winsize(
    val wsRow: UShort,
    val wsCol: UShort,
    val wsXpixel: UShort,
    val wsYpixel: UShort,
)
