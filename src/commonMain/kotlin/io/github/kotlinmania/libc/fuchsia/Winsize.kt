// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Winsize(
    val wsRow: UShort,
    val wsCol: UShort,
    val wsXpixel: UShort,
    val wsYpixel: UShort,
)
