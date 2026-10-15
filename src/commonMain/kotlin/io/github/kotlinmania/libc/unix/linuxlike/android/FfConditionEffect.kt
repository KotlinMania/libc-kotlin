// port-lint: source unix/linux_like/android/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.android

import io.github.kotlinmania.libc.*

public data class FfConditionEffect(
    val rightSaturation: UShort,
    val leftSaturation: UShort,
    val rightCoeff: Short,
    val leftCoeff: Short,
    val deadband: UShort,
    val center: Short,
)
