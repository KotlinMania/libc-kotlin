package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class FfPeriodicEffect(
    val waveform: UShort,
    val period: UShort,
    val magnitude: Short,
    val offset: Short,
    val phase: UShort,
    val envelope: FfEnvelope,
    val customLen: UInt,
    val customData: Short?,
)
