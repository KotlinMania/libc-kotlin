package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class FfEffect(
    val type: UShort,
    val id: Short,
    val direction: UShort,
    val trigger: FfTrigger,
    val replay: FfReplay,
    val u: ULongArray,
    val u2: UIntArray,
)
