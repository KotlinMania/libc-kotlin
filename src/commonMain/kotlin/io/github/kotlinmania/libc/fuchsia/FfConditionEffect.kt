// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class FfConditionEffect(
    val rightSaturation: UShort,
    val leftSaturation: UShort,
    val rightCoeff: Short,
    val leftCoeff: Short,
    val deadband: UShort,
    val center: Short,
)
