package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class InputId(
    val bustype: UShort,
    val vendor: UShort,
    val product: UShort,
    val version: UShort,
)
