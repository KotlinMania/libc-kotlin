// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class InputMask(
    val type: UInt,
    val codesSize: UInt,
    val codesPtr: ULong,
)
