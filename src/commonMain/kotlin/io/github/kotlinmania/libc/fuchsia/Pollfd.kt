// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Pollfd(
    val fd: Int,
    val events: Short,
    val revents: Short,
)
