package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class FfEnvelope(
    val attackLength: UShort,
    val attackLevel: UShort,
    val fadeLength: UShort,
    val fadeLevel: UShort,
)
